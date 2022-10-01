// Initialize and add the map
function initMap() {
  // The location of Uluru
  const indianMountainLake = { lat: 41.001, lng: -75.536 };
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

window.initMap = initMap;
// The location of Uluru
//const uluru = { lat: -25.344, lng: 131.031 };
//// The map, centered at Uluru
//const map = new google.maps.Map(document.getElementById("map"), {
//  zoom: 4,
//  center: uluru,
//});