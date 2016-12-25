import { NgModule, ErrorHandler } from '@angular/core';
import { IonicApp, IonicModule, IonicErrorHandler } from 'ionic-angular';
import { MyApp } from './app.component';
import { TabsPage } from '../pages/tabs/tabs';
  import { HomePage } from '../pages/home/home';
    import { ListaSocorrismoPage } from '../pages/tab-socorrismo/listasocorrismo/listasocorrismo';
      import { SocorrismoValoresPage } from '../pages/tab-socorrismo/socorrismovalores/socorrismovalores';
      import { SocorrismoAvaliacaoVitimaPage } from '../pages/tab-socorrismo/socorrismoavaliacaovitima/socorrismoavaliacaovitima';
      import { SocorrismoListaAnatomiaPage } from '../pages/tab-socorrismo/socorrismoanatomia/socorrismolistaanatomia/socorrismolistaanatomia';
        import { SocorrismoAnatomiaPlanosPage }               from '../pages/tab-socorrismo/socorrismoanatomia/socorrismoanatomiaplanos/socorrismoanatomiaplanos';
        import { SocorrismoAnatomiaCranioPage }               from '../pages/tab-socorrismo/socorrismoanatomia/socorrismoanatomiacranio/socorrismoanatomiacranio';
        import { SocorrismoAnatomiaColunaPage }               from '../pages/tab-socorrismo/socorrismoanatomia/socorrismoanatomiacoluna/socorrismoanatomiacoluna';
        import { SocorrismoAnatomiaToraxPage }                from '../pages/tab-socorrismo/socorrismoanatomia/socorrismoanatomiatorax/socorrismoanatomiatorax';
        import { SocorrismoAnatomiaCinturaPage }              from '../pages/tab-socorrismo/socorrismoanatomia/socorrismoanatomiacintura/socorrismoanatomiacintura';
        import { SocorrismoAnatomiaAbdomenPage }              from '../pages/tab-socorrismo/socorrismoanatomia/socorrismoanatomiaabdomen/socorrismoanatomiaabdomen';
        import { SocorrismoAnatomiaMembrosInferioresPage }    from '../pages/tab-socorrismo/socorrismoanatomia/socorrismoanatomiamembrosinferiores/socorrismoanatomiamembrosinferiores';
        import { SocorrismoAnatomiaMembrosSuperioresPage }    from '../pages/tab-socorrismo/socorrismoanatomia/socorrismoanatomiamembrossuperiores/socorrismoanatomiamembrossuperiores';
        import { SocorrismoAnatomiaDigestivoPage }            from '../pages/tab-socorrismo/socorrismoanatomia/socorrismoanatomiadigestivo/socorrismoanatomiadigestivo';
        import { SocorrismoAnatomiaVentilatorioPage }         from '../pages/tab-socorrismo/socorrismoanatomia/socorrismoanatomiaventilatorio/socorrismoanatomiaventilatorio';
        import { SocorrismoAnatomiaPulsosPage }               from '../pages/tab-socorrismo/socorrismoanatomia/socorrismoanatomiapulsos/socorrismoanatomiapulsos';

/*
import { ListaComunicacoesPage } from '../pages/tab-Comunicacoes/listacomunicacoes/listacomunicacoes';
import { ListaUtilidadesPage } from '../pages/tab-utilidades/listautilidades/listautilidades';
*/

import { ContactPage } from '../pages/contact/contact';


@NgModule({
  declarations: [
    MyApp,
    TabsPage,
    HomePage,
    ListaSocorrismoPage,
    SocorrismoValoresPage,
    SocorrismoAvaliacaoVitimaPage,
    SocorrismoListaAnatomiaPage,
    SocorrismoAnatomiaPlanosPage,
    SocorrismoAnatomiaCranioPage,
    SocorrismoAnatomiaColunaPage,
    SocorrismoAnatomiaToraxPage,
    SocorrismoAnatomiaCinturaPage,
    SocorrismoAnatomiaAbdomenPage,
    SocorrismoAnatomiaMembrosInferioresPage,
    SocorrismoAnatomiaMembrosSuperioresPage,
    SocorrismoAnatomiaDigestivoPage,
    SocorrismoAnatomiaVentilatorioPage,
    SocorrismoAnatomiaPulsosPage,
    ContactPage,
  ],
  imports: [
    IonicModule.forRoot(MyApp)
  ],
  bootstrap: [IonicApp],
  entryComponents: [
    TabsPage,
    HomePage,
    ListaSocorrismoPage,
    SocorrismoValoresPage,
    SocorrismoAvaliacaoVitimaPage,
    SocorrismoListaAnatomiaPage,
    SocorrismoAnatomiaPlanosPage,
    SocorrismoAnatomiaCranioPage,
    SocorrismoAnatomiaColunaPage,
    SocorrismoAnatomiaToraxPage,
    SocorrismoAnatomiaCinturaPage,
    SocorrismoAnatomiaAbdomenPage,
    SocorrismoAnatomiaMembrosInferioresPage,
    SocorrismoAnatomiaMembrosSuperioresPage,
    SocorrismoAnatomiaDigestivoPage,
    SocorrismoAnatomiaVentilatorioPage,
    SocorrismoAnatomiaPulsosPage,
    ContactPage,
  ],
  providers: [{provide: ErrorHandler, useClass: IonicErrorHandler}]
})
export class AppModule {}