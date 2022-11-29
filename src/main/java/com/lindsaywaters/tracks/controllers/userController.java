package com.lindsaywaters.tracks.controllers;

import com.lindsaywaters.tracks.data.UserRepository;
import com.lindsaywaters.tracks.models.User;
import com.lindsaywaters.tracks.models.dto.LoginDTO;
import com.lindsaywaters.tracks.models.dto.NewUserDTO;
import com.mysql.cj.CacheAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.Optional;

@Controller

public class userController {

    @Autowired
    static
    UserRepository userRepository;
    private static final String userInfo = "user";
    public static User getUserInformation(HttpSession session){
        Integer userID = (Integer) session.getAttribute(userInfo);
        if(userID == null){
            return null;
        }
        Optional<User> user = userRepository.findById(userID);
        if(user.isEmpty()){
            return null;
        }
        return user.get();
    }
    private static void setUserInSession(HttpSession session, User user){
        session.setAttribute(userInfo, user.getId());
    }



    @GetMapping("newUserForm")
    public String newUserForm(HttpServletRequest request, Model model){
        model.addAttribute(new NewUserDTO());
        return "user/newUserForm";
    }
    @PostMapping("newUserForm")
    public String submitNewUserForm(@ModelAttribute @Valid NewUserDTO newUserDTO, Errors errors, HttpServletRequest request, Model model){
        User existingUser = userRepository.findByUsername(newUserDTO.getUsername());
        if (existingUser != null){
            errors.rejectValue("username", "username.alreadyauser", "user already registered, sign in or use a different username");
            model.addAttribute(newUserDTO);
            return "user/newUserForm";
        }
        User newUser = new User(newUserDTO.getUsername(),newUserDTO.getPassword(),newUserDTO.getEmail(), newUserDTO.getZipcode());
        userRepository.save(newUser);
        setUserInSession(request.getSession(),newUser);
        return "redirect:/user/userDashboard";
    }

//    @GetMapping("userDashboard")
//    public String userDashboard(HttpServletRequest request, Model model) {
//        User user = getUserInformation(request.getSession());
//        return "user/userDashboard";
//
//    }

    @GetMapping("login")
    public String login(HttpServletRequest request, Model model){
        model.addAttribute(new LoginDTO());
        model.addAttribute("title","Login");
        return "user/login";
    }


}
