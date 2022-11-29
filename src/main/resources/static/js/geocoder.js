
function getGeocodeInfo (){
    let geocoder = new google.maps.Geocoder();

    return new Promise(function(resolve, reject){
        let address = "";
        address+= document.querySelector("#address1").value;
        address+= "," + document.querySelector("#city").value;
        address+= "," + document.querySelector("#state").value;
        address+= ""  + document.querySelector("#zipcode").value;
        console.log("address" + address);
        geocoder.geocode({'address':address}, function(results, status){
            if(status == 'OK'){
                resolve(results[0].geometry.location.toString().replace("(","").replace(")",""))
            }else{
                reject(new Error("bad location"));
                console.log("bad info", status);
            }
        });
    });
}
//function getGeocodeFromAddress(){
//    let geocoder = new google.maps.Geocoder();
//
//    return new Promise(function(resolve,reject) {
//        let address = "";
//        address = document.querySelector("#address1").value;
//        if (document.querySelector("#address2").value != ""){
//            address += ", " + document.querySelector("#address2").value;
//        }
//        address += ", " + document.querySelector("#city").value;
//        address += ", " + document.querySelector("#state").value;
//        address += "  " + document.querySelector("#zipcode").value;
//
//       if(address == ""){
//            reject(new Error('Address field is empty.'));
//       } else {
//            geocoder.geocode({'address':address},function(results, status){
//                if(status == 'OK'){
//                    resolve(results[0].geometry.location.toString().replace("(","").replace(")",""))
//                } else {
//                    reject(new Error('Location invalid.'));
//                    console.log('Geocode not successful: ' + status);
//                }
//            });
//       }
//    });
//}
function submitForm(event){
    event.preventDefault();
    let locationPromise = getGeocodeInfo();

    locationPromise.then(function(returnValue){
        if(returnValue.includes("Error")){
            console.log(returnValue);
         }else{
            if (document.querySelector("#location") !== null){
                document.querySelector("#location").value = returnValue;
            }
    event.target.submit();
        }
    });
}
//function submitForm(event){
//    event.preventDefault();
//    let locationPromise = getGeocodeFromAddress();
//
//    locationPromise.then(function(returnValue){
//        if(returnValue.includes("Error")){
//            console.log(returnValue);
//        } else {
//            if(document.querySelector("#location") !== null){
//                document.querySelector("#location").value = returnValue;
//            }
//
//            event.target.submit();
//        }
//    });
//console.log("submitting");
//}