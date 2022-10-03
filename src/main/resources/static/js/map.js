let sightings = [];



// Initialize and add the map
function initMap() {
  // The location of Uluru
  const indianMountainLake = { lat: 40.99933071055133, lng: -75.5249752306438 };
  // The map, centered at Uluru
  const map = new google.maps.Map(document.getElementById("map"), {
    zoom: 12,
    center: indianMountainLake,
  });
  // The marker, positioned at Uluru
  const marker = new google.maps.Marker({
    position: indianMountainLake,
    map: map,
  });
}


// The location of Uluru
//const uluru = { lat: -25.344, lng: 131.031 };
//// The map, centered at Uluru
//const map = new google.maps.Map(document.getElementById("map"), {
//  zoom: 4,
//  center: uluru,
//});

window.initMap = initMap;
