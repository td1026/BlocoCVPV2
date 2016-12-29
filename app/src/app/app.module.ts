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
      import { SocorrismoListaExcecaoPage }                   from '../pages/tab-socorrismo/socorrismoexcecao/socorrismolistaexcecao/socorrismolistaexcecao';
        import { SocorrismoExcecaoMagnitudePage }             from '../pages/tab-socorrismo/socorrismoexcecao/socorrismoexcecaomagnitude/socorrismoexcecaomagnitude';
        import { SocorrismoExcecaoPrimariaPage }              from '../pages/tab-socorrismo/socorrismoexcecao/socorrismoexcecaoprimaria/socorrismoexcecaoprimaria';
        import { SocorrismoExcecaoSecundariaPage }            from '../pages/tab-socorrismo/socorrismoexcecao/socorrismoexcecaosecundaria/socorrismoexcecaosecundaria'; 
      import { SocorrismoListaMedicasPage }                   from '../pages/tab-socorrismo/socorrismomedicas/socorrismolistamedicas/socorrismolistamedicas';
        import { SocorrismoMedicasAlergiasPage }              from '../pages/tab-socorrismo/socorrismomedicas/socorrismomedicasalergias/socorrismomedicasalergias';
        import { SocorrismoMedicasAnginaPage }                from '../pages/tab-socorrismo/socorrismomedicas/socorrismomedicasangina/socorrismomedicasangina';
        import { SocorrismoMedicasApendicitePage }            from '../pages/tab-socorrismo/socorrismomedicas/socorrismomedicasapendicite/socorrismomedicasapendicite';
        import { SocorrismoMedicasApoioSAVPage }              from '../pages/tab-socorrismo/socorrismomedicas/socorrismomedicasapoiosav/socorrismomedicasapoiosav';
        import { SocorrismoMedicasAsmaPage }                  from '../pages/tab-socorrismo/socorrismomedicas/socorrismomedicasasma/socorrismomedicasasma';
        import { SocorrismoMedicasAVCPage }                   from '../pages/tab-socorrismo/socorrismomedicas/socorrismomedicasavc/socorrismomedicasavc';
        import { SocorrismoMedicasChoquePage }                from '../pages/tab-socorrismo/socorrismomedicas/socorrismomedicaschoque/socorrismomedicaschoque';
        import { SocorrismoMedicasColicaPage }                from '../pages/tab-socorrismo/socorrismomedicas/socorrismomedicascolica/socorrismomedicascolica';
        import { SocorrismoMedicasConvulsaoPage }             from '../pages/tab-socorrismo/socorrismomedicas/socorrismomedicasconvulsao/socorrismomedicasconvulsao';
        import { SocorrismoMedicasDigestivaPage }             from '../pages/tab-socorrismo/socorrismomedicas/socorrismomedicasdigestiva/socorrismomedicasdigestiva';
        import { SocorrismoMedicasDissecaoPage }              from '../pages/tab-socorrismo/socorrismomedicas/socorrismomedicasdissecao/socorrismomedicasdissecao';
        import { SocorrismoMedicasDpocPage }                  from '../pages/tab-socorrismo/socorrismomedicas/socorrismomedicasdpoc/socorrismomedicasdpoc';
        import { SocorrismoMedicasEdemaPage }                 from '../pages/tab-socorrismo/socorrismomedicas/socorrismomedicasedema/socorrismomedicasedema';
        import { SocorrismoMedicasEnfartePage }               from '../pages/tab-socorrismo/socorrismomedicas/socorrismomedicasenfarte/socorrismomedicasenfarte';
        import { SocorrismoMedicasHiperglicemiaPage }         from '../pages/tab-socorrismo/socorrismomedicas/socorrismomedicashiperglicemia/socorrismomedicashiperglicemia';
        import { SocorrismoMedicasHipoglicemiaPage }          from '../pages/tab-socorrismo/socorrismomedicas/socorrismomedicashipoglicemia/socorrismomedicashipoglicemia';
        import { SocorrismoMedicasIntoxicacaoPage }           from '../pages/tab-socorrismo/socorrismomedicas/socorrismomedicasintoxicacao/socorrismomedicasintoxicacao';
        import { SocorrismoMedicasOclusaoPage }               from '../pages/tab-socorrismo/socorrismomedicas/socorrismomedicasoclusao/socorrismomedicasoclusao';
        import { SocorrismoMedicasPneumotoraxPage }           from '../pages/tab-socorrismo/socorrismomedicas/socorrismomedicaspneumotorax/socorrismomedicaspneumotorax';
      import { SocorrismoListaTraumaPage }                    from '../pages/tab-socorrismo/socorrismotrauma/socorrismolistatrauma/socorrismolistatrauma';
        import { SocorrismoTraumaAbdominalPage }              from '../pages/tab-socorrismo/socorrismotrauma/socorrismotraumaabdominal/socorrismotraumaabdominal';
        import { SocorrismoTraumaAmbientePage }               from '../pages/tab-socorrismo/socorrismotrauma/socorrismotraumaambiente/socorrismotraumaambiente';
        import { SocorrismoTraumaAquaticoPage }               from '../pages/tab-socorrismo/socorrismotrauma/socorrismotraumaaquatico/socorrismotraumaaquatico';
        import { SocorrismoTraumaCinematicaPage }             from '../pages/tab-socorrismo/socorrismotrauma/socorrismotraumacinematica/socorrismotraumacinematica';
        import { SocorrismoTraumaExtremidadesPage }           from '../pages/tab-socorrismo/socorrismotrauma/socorrismotraumaextremidades/socorrismotraumaextremidades';
        import { SocorrismoTraumaHemorragiasPage }            from '../pages/tab-socorrismo/socorrismotrauma/socorrismotraumahemorragias/socorrismotraumahemorragias';
        import { SocorrismoTraumaQueimadurasPage }            from '../pages/tab-socorrismo/socorrismotrauma/socorrismotraumaqueimaduras/socorrismotraumaqueimaduras';
        import { SocorrismoTraumaTCEPage }                    from '../pages/tab-socorrismo/socorrismotrauma/socorrismotraumatce/socorrismotraumatce';
        import { SocorrismoTraumaToracicoPage }               from '../pages/tab-socorrismo/socorrismotrauma/socorrismotraumatoracico/socorrismotraumatoracico';
        import { SocorrismoTraumaTVMPage }                    from '../pages/tab-socorrismo/socorrismotrauma/socorrismotraumatvm/socorrismotraumatvm';
      import { SocorrismoListaPediatricasPage }               from '../pages/tab-socorrismo/socorrismopediatricas/socorrismolistapediatricas/socorrismolistapediatricas';
        import { SocorrismoPediatricasTAPPage }               from '../pages/tab-socorrismo/socorrismopediatricas/socorrismopediatricastap/socorrismopediatricastap';
        import { SocorrismoPediatricasAsmaPage }              from '../pages/tab-socorrismo/socorrismopediatricas/socorrismopediatricasasma/socorrismopediatricasasma';
        import { SocorrismoPediatricasConvulsoesPage }        from '../pages/tab-socorrismo/socorrismopediatricas/socorrismopediatricasconvulsoes/socorrismopediatricasconvulsoes';
        import { SocorrismoPediatricasDiarreiaPage }          from '../pages/tab-socorrismo/socorrismopediatricas/socorrismopediatricasdiarreia/socorrismopediatricasdiarreia';
        import { SocorrismoPediatricasDesidratacaoPage }      from '../pages/tab-socorrismo/socorrismopediatricas/socorrismopediatricasdesidratação/socorrismopediatricasdesidratação';
        import { SocorrismoPediatricasEstridorPage }          from '../pages/tab-socorrismo/socorrismopediatricas/socorrismopediatricasestridor/socorrismopediatricasestridor';
        import { SocorrismoPediatricasFebrePage }             from '../pages/tab-socorrismo/socorrismopediatricas/socorrismopediatricasfebre/socorrismopediatricasfebre';
        import { SocorrismoPediatricasIntoxicacaoPage }       from '../pages/tab-socorrismo/socorrismopediatricas/socorrismopediatricasintoxicacao/socorrismopediatricasintoxicacao';
        import { SocorrismoPediatricasOVAPage }               from '../pages/tab-socorrismo/socorrismopediatricas/socorrismopediatricasova/socorrismopediatricasova';  
      import { SocorrismoListaSBVPage }                       from '../pages/tab-socorrismo/socorrismosbv/socorrismolistasbv/socorrismolistasbv';
        import { SocorrismoSBVAdultoPage }                    from '../pages/tab-socorrismo/socorrismosbv/socorrismosbvadulto/socorrismosbvadulto';
        import { SocorrismoSBVPediatricoPage }                from '../pages/tab-socorrismo/socorrismosbv/socorrismosbvpediatrico/socorrismosbvpediatrico';
        import { SocorrismoSBVNeonatalPage }                  from '../pages/tab-socorrismo/socorrismosbv/socorrismosbvneonatal/socorrismosbvneonatal';
        import { SocorrismoSBVAPGARPage }                     from '../pages/tab-socorrismo/socorrismosbv/socorrismosbvapgar/socorrismosbvapgar';
      import { SocorrismoListaObstetricasPage }               from '../pages/tab-socorrismo/socorrismoobstetricas/socorrismolistaobstetricas/socorrismolistaobstetricas';
        import { SocorrismoObstetricasPerguntasPage }         from '../pages/tab-socorrismo/socorrismoobstetricas/socorrismoobstetricasperguntas/socorrismoobstetricasperguntas';
        import { SocorrismoObstetricasPartoPage }             from '../pages/tab-socorrismo/socorrismoobstetricas/socorrismoobstetricasparto/socorrismoobstetricasparto';






/*

import { ListaUtilidadesPage } from '../pages/tab-utilidades/listautilidades/listautilidades';
*/
  import { ListaComunicacoesPage } from '../pages/tab-comunicacoes/listacomunicacoes/listacomunicacoes';
    import { ComunicacoesMapRedeCVPPage } from '../pages/tab-comunicacoes/comunicacoesmapredecvp/comunicacoesmapredecvp';
    import { ComunicacoesDistanciaRedeCVPPage } from '../pages/tab-comunicacoes/comunicacoesdistanciaredecvp/comunicacoesdistanciaredecvp';

import { Locations } from '../providers/locations';
import { GoogleMaps } from '../providers/google-maps';
import { Connectivity } from '../providers/connectivity';
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
    SocorrismoListaExcecaoPage,
    SocorrismoExcecaoMagnitudePage,
    SocorrismoExcecaoPrimariaPage,
    SocorrismoExcecaoSecundariaPage,
    SocorrismoListaMedicasPage ,
    SocorrismoMedicasAlergiasPage,
    SocorrismoMedicasAnginaPage,
    SocorrismoMedicasApendicitePage,
    SocorrismoMedicasApoioSAVPage,
    SocorrismoMedicasAsmaPage,
    SocorrismoMedicasAVCPage,
    SocorrismoMedicasChoquePage,
    SocorrismoMedicasColicaPage,
    SocorrismoMedicasConvulsaoPage, 
    SocorrismoMedicasDigestivaPage,
    SocorrismoMedicasDissecaoPage,
    SocorrismoMedicasDpocPage,
    SocorrismoMedicasEdemaPage,
    SocorrismoMedicasEnfartePage, 
    SocorrismoMedicasHiperglicemiaPage, 
    SocorrismoMedicasHipoglicemiaPage, 
    SocorrismoMedicasIntoxicacaoPage, 
    SocorrismoMedicasOclusaoPage, 
    SocorrismoMedicasPneumotoraxPage,
    SocorrismoListaTraumaPage,
    SocorrismoTraumaAbdominalPage,
    SocorrismoTraumaAmbientePage,
    SocorrismoTraumaAquaticoPage,
    SocorrismoTraumaCinematicaPage,
    SocorrismoTraumaExtremidadesPage,
    SocorrismoTraumaHemorragiasPage,
    SocorrismoTraumaQueimadurasPage,
    SocorrismoTraumaTCEPage,
    SocorrismoTraumaToracicoPage,
    SocorrismoTraumaTVMPage,
    SocorrismoListaPediatricasPage,
    SocorrismoPediatricasTAPPage,
    SocorrismoPediatricasAsmaPage,
    SocorrismoPediatricasConvulsoesPage,
    SocorrismoPediatricasDiarreiaPage,
    SocorrismoPediatricasDesidratacaoPage,
    SocorrismoPediatricasEstridorPage,
    SocorrismoPediatricasFebrePage,
    SocorrismoPediatricasIntoxicacaoPage,
    SocorrismoPediatricasOVAPage,
    SocorrismoListaSBVPage,
    SocorrismoSBVAdultoPage,
    SocorrismoSBVPediatricoPage,
    SocorrismoSBVNeonatalPage,
    SocorrismoSBVAPGARPage,
    SocorrismoListaObstetricasPage,
    SocorrismoObstetricasPerguntasPage,
    SocorrismoObstetricasPartoPage,
    ListaComunicacoesPage,
    ComunicacoesMapRedeCVPPage,
    ComunicacoesDistanciaRedeCVPPage
    
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
    SocorrismoListaExcecaoPage,
    SocorrismoExcecaoMagnitudePage,
    SocorrismoExcecaoPrimariaPage,
    SocorrismoExcecaoSecundariaPage,
    SocorrismoListaMedicasPage ,
    SocorrismoMedicasAlergiasPage,
    SocorrismoMedicasAnginaPage,
    SocorrismoMedicasApendicitePage,
    SocorrismoMedicasApoioSAVPage,
    SocorrismoMedicasAsmaPage,
    SocorrismoMedicasAVCPage,
    SocorrismoMedicasChoquePage,
    SocorrismoMedicasColicaPage,
    SocorrismoMedicasConvulsaoPage, 
    SocorrismoMedicasDigestivaPage,
    SocorrismoMedicasDissecaoPage,
    SocorrismoMedicasDpocPage,
    SocorrismoMedicasEdemaPage,
    SocorrismoMedicasEnfartePage, 
    SocorrismoMedicasHiperglicemiaPage, 
    SocorrismoMedicasHipoglicemiaPage, 
    SocorrismoMedicasIntoxicacaoPage, 
    SocorrismoMedicasOclusaoPage, 
    SocorrismoMedicasPneumotoraxPage,
    SocorrismoListaTraumaPage,
    SocorrismoTraumaAbdominalPage,
    SocorrismoTraumaAmbientePage,
    SocorrismoTraumaAquaticoPage,
    SocorrismoTraumaCinematicaPage,
    SocorrismoTraumaExtremidadesPage,
    SocorrismoTraumaHemorragiasPage,
    SocorrismoTraumaQueimadurasPage,
    SocorrismoTraumaTCEPage,
    SocorrismoTraumaToracicoPage,
    SocorrismoTraumaTVMPage,
    SocorrismoListaPediatricasPage,
    SocorrismoPediatricasTAPPage,
    SocorrismoPediatricasAsmaPage,
    SocorrismoPediatricasConvulsoesPage,
    SocorrismoPediatricasDiarreiaPage,
    SocorrismoPediatricasDesidratacaoPage,
    SocorrismoPediatricasEstridorPage,
    SocorrismoPediatricasFebrePage,
    SocorrismoPediatricasIntoxicacaoPage,
    SocorrismoPediatricasOVAPage,
    SocorrismoListaSBVPage,
    SocorrismoSBVAdultoPage,
    SocorrismoSBVPediatricoPage,
    SocorrismoSBVNeonatalPage,
    SocorrismoSBVAPGARPage,
    SocorrismoListaObstetricasPage,
    SocorrismoObstetricasPerguntasPage,
    SocorrismoObstetricasPartoPage,
    ListaComunicacoesPage,
    ComunicacoesMapRedeCVPPage,
    ComunicacoesDistanciaRedeCVPPage
  ],
  providers: [{provide: ErrorHandler, useClass: IonicErrorHandler},
  Locations, 
  GoogleMaps, 
  Connectivity]
})
export class AppModule {}