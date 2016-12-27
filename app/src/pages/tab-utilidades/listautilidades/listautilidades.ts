import { Component } from '@angular/core';
import { ViewController } from 'ionic-angular';

@Component({
  selector: 'page-listautilidades',
  templateUrl: 'listautilidades.html'
})

export class ListaUtilidadesPage {

  private items;

  constructor(public viewCtrl: ViewController) {
    this.items = [
      {
        'title': 'Volores de Referencia',
        'class': null,
        'description': 'A powerful Javascript framework for building single page apps. Angular is open source, and maintained by Google.',
        'icon': '#E63135'
      }
    ];
  }

}