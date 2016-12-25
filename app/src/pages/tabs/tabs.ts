import { Component } from '@angular/core';

import { HomePage } from '../home/home';
import { ListaSocorrismoPage } from '../tab-socorrismo/listasocorrismo/listasocorrismo';
import { ContactPage } from '../contact/contact';

@Component({
  templateUrl: 'tabs.html'
})
export class TabsPage {
  tab1Root: any = HomePage;
  tab2Root: any = ListaSocorrismoPage;
  tab3Root: any = ContactPage;

  constructor() {

  }
}
