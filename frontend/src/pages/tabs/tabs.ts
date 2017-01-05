import { Component } from '@angular/core';
import { HomePage } from '../home/home';
import { ListaSocorrismoPage }   from '../tab-socorrismo/listasocorrismo/listasocorrismo';
import { ListaComunicacoesPage } from '../tab-comunicacoes/listacomunicacoes/listacomunicacoes';
import { ListaUtilidadesPage } from '../tab-utilidades/listautilidades/listautilidades';

@Component({
  templateUrl: 'tabs.html'
})
export class TabsPage {
  tab1Root: any = HomePage;
  tab2Root: any = ListaSocorrismoPage;
  tab3Root: any = ListaComunicacoesPage;
  tab4Root: any = ListaUtilidadesPage;

  constructor() {

  }
}
