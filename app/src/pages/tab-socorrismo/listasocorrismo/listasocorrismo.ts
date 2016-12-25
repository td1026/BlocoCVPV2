import { Component } from '@angular/core';

import { ViewController } from 'ionic-angular';

import { SocorrismoValoresPage } from '../socorrismovalores/socorrismovalores';
import { SocorrismoListaAnatomiaPage } from '../socorrismoanatomia/socorrismolistaanatomia/socorrismolistaanatomia';


@Component({
  selector: 'page-listasocorrismo',
  templateUrl: 'listasocorrismo.html'
})
export class ListaSocorrismoPage {

  private items;

  constructor(public viewCtrl: ViewController) {
    this.items = [
      {
        'title': 'Volores de Referencia',
        'class': SocorrismoValoresPage,
        'description': 'A powerful Javascript framework for building single page apps. Angular is open source, and maintained by Google.',
        'icon': '#E63135'
      },
      {
        'title': 'Anatomia',
        'class': SocorrismoListaAnatomiaPage,
        'description': 'A powerful Javascript framework for building single page apps. Angular is open source, and maintained by Google.',
        'icon': '#E63135'
      }
    ];
  }

}
