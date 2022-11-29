package com.lindsaywaters.tracks.models;

public class Location {
    private Double lat;
    private Double lng;

    public Location() {
    }

    public Location(Double lat, Double lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    @Override
    public String toString() {
        return "{ lat: "+ lat + ", lng: " + lng + " }";
    }

}
//  for(let i = 0; i < locations.length; i++){
//        // The marker, positioned at Uluru
//        let location = location[i];
//        const marker = new google.maps.Marker({
//        position: location,
//        map: map,
//        });
//        }
//        const markers = locations.map((position, i) => {
////    const label = labels[i % labels.length];
//
//        const marker = new google.maps.Marker({
//        position,
//        icon: icon;
//
//        });
//        });
//        }