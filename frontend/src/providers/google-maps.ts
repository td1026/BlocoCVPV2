import { Injectable } from '@angular/core';
import 'rxjs/add/operator/map';
import { Connectivity } from './connectivity';
import { Geolocation } from 'ionic-native';

declare var google;
/*
  Generated class for the GoogleMaps provider.

  See https://angular.io/docs/ts/latest/guide/dependency-injection.html
  for more info on providers and Angular 2 DI.
*/
@Injectable()
export class GoogleMaps {

  mapElement: any;
  pleaseConnect: any;
  map: any;
  mapInitialised: boolean = false;
  mapLoaded: any;
  mapLoadedObserver: any;
  markers: any = [];
  apiKey: string = "AIzaSyB0P_12-wJR4-i9Uo3lBfs4dO6LWDMGmf4";

  constructor(public connectivityService: Connectivity) {
 
  }

  init(mapElement: any, pleaseConnect: any): Promise<any> {
 
    this.mapElement = mapElement;
    this.pleaseConnect = pleaseConnect;
 
    return this.loadGoogleMaps();
 
  }

  loadGoogleMaps(): Promise<any> {
 
    return new Promise((resolve) => {
 
      if(typeof google == "undefined" || typeof google.maps == "undefined"){
        this.disableMap();
        if(this.connectivityService.isOnline()){
          window['mapInit'] = () => {
            this.initMap().then(() => {
              resolve(true);
            });
            this.enableMap();
          }
          let script = document.createElement("script");
          script.id = "googleMaps";
          if(this.apiKey){
            script.src = 'http://maps.google.com/maps/api/js?key=' + this.apiKey + '&callback=mapInit';
          } else {
            script.src = 'http://maps.google.com/maps/api/js?callback=mapInit';       
          }
          document.body.appendChild(script);  
        } 
      }
      else {
        if(this.connectivityService.isOnline()){
          this.initMap();
          this.enableMap();
        }
        else {
          this.disableMap();
        }
      }
      this.addConnectivityListeners();
    });
  }
  initMap(): Promise<any> {

      this.mapInitialised = true;
  
      return new Promise((resolve) => {
  
        Geolocation.getCurrentPosition().then((position) => {
  
          // UNCOMMENT FOR NORMAL USE
          let latLng = new google.maps.LatLng(position.coords.latitude, position.coords.longitude);
  
          //let latLng = new google.maps.LatLng(40.713744, -74.009056);
  
          let mapOptions = {
            center: latLng,
            zoom: 8,
            mapTypeId: google.maps.MapTypeId.ROADMAP,
            fullscreenControl:false
          }
  
          this.map = new google.maps.Map(this.mapElement, mapOptions);
          resolve(true);
  
        });
  
      });
  
  } 
  disableMap(): void {
 
    if(this.pleaseConnect){
      this.pleaseConnect.style.display = "block";
    }
 
  }
  enableMap(): void {
 
    if(this.pleaseConnect){
      this.pleaseConnect.style.display = "none";
    }
 
  }
  addConnectivityListeners(): void {
    document.addEventListener('online', () => {
      setTimeout(() => {
        if(typeof google == "undefined" || typeof google.maps == "undefined"){
          this.loadGoogleMaps();
        } 
        else {
          if(!this.mapInitialised){
            this.initMap();
          }
          this.enableMap();
        }
      }, 2000);
    }, false);
    document.addEventListener('offline', () => {
      this.disableMap();
    }, false);
  }
  addMarker(location :any): void {
 
    let latLng = new google.maps.LatLng(location.latitude, location.longitude);
 
    let marker = new google.maps.Marker({
      map: this.map,
      animation: google.maps.Animation.DROP,
      position: latLng
    });
    var contentString =    
      '<h1>' + location.title + '</h1>'+
      '<p>Canal: <b>' + location.canal + '</b></p>' +
      '<p>Plataforma: <b>' + location.plataforma + '</b></p>';
    var infowindow = new google.maps.InfoWindow({
        content: contentString
    });
    marker.addListener('click', function() {
        infowindow.open(this.map, marker);
    });
    this.markers.push(marker);  
 
  }
}
