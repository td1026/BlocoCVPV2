import { Component } from '@angular/core';
import { HomePage } from '../home/home';
import { ListaSocorrismoPage }   from '../tab-socorrismo/listasocorrismo/listasocorrismo';
import { ListaComunicacoesPage } from '../tab-comunicacoes/listacomunicacoes/listacomunicacoes';

@Component({
  templateUrl: 'tabs.html'
})
export class TabsPage {
  tab1Root: any = HomePage;
  tab2Root: any = ListaSocorrismoPage;
  tab3Root: any = ListaComunicacoesPage;

  constructor() {

  }
}
