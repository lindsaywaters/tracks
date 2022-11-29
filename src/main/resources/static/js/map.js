 let map;
let geocoder;

let contents = [];
// Initialize and add the map
function initMap() {
getContent();
  // The location of Uluru
  const indianMountainLake = { lat: 40.99933071055133, lng: -75.5249752306438 };
  // The map, centered at Uluru
  const map = new google.maps.Map(document.getElementById("map"), {
    zoom: 12,
    center: indianMountainLake,
  });
  for(let i = 0; i < sightingLocations.length; i++){

  new google.maps.Marker({
    position: sightingLocations[i],
    map,


  });

  }
console.log(contents);
 }

function getContent(){
    let contentElements = document.querySelectorAll(".content");
    let contentString = "";
    for (let element in contentElements){
        let contentItemElements = contentElements[element].children;
        for (let itemElement in contentItemElements){
            if(contentItemElements[itemElement].innerHTML != undefined){
                if(contentItemElements[itemElement].classList != "exclude"){
                    contentString += "<p>" + (contentItemElements[itemElement].getAttribute('label')!=null?contentItemElements[itemElement].getAttribute('label'):'') + contentItemElements[itemElement].innerHTML + "</p>";
                    if(contentItemElements[itemElement].classList == "title"){
                        contentString += "<hr/>";

                    }

                }
            }

        }
        contents.push(contentString);
        contentString = "";
    }
}

// The location of Uluru
//const location = { lat: -25.344, lng: 131.031 };
//// The map, centered at Uluru
//const map = new google.maps.Map(document.getElementById("map"), {
//  zoom: 4,
//  center: uluru,
//});

// The location of Uluru
//const uluru = { lat: -25.344, lng: 131.031 };
//// The map, centered at Uluru
//const map = new google.maps.Map(document.getElementById("map"), {
//  zoom: 4,
//  center: uluru,
//});

window.initMap = initMap;
