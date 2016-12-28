import { Component } from '@angular/core';
import { ViewController } from 'ionic-angular';
import { ComunicacoesMapRedeCVPPage } from '../comunicacoesmapredecvp/comunicacoesmapredecvp';

@Component({
  selector: 'page-listacomunicacoes',
  templateUrl: 'listacomunicacoes.html'
})

export class ListaComunicacoesPage {

 private items;

  constructor(public viewCtrl: ViewController) {
    this.items = [
      {
        'title': 'Mapa da Rede CVP',
        'class': ComunicacoesMapRedeCVPPage,
        'description': 'A powerful Javascript framework for building single page apps. Angular is open source, and maintained by Google.',
        'icon': '#E63135'
      }
    ];
  }

}