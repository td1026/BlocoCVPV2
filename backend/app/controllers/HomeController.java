package controllers;

import models.entity.Medicamento;
import models.service.MedicamentoService;
import play.libs.Json;
import play.mvc.*;
import play.db.jpa.Transactional;
import views.html.*;

/**
 * Created by Telmo Dias on 06/10/2016.
 */

public class HomeController extends Controller {

    @Transactional
    public Result getIndex() {
        return ok(index.render(MedicamentoService.find()));
    }

    @Transactional
    public Result findMedicamento() {
        return ok(Json.toJson(MedicamentoService.find()));
    }
    
    @Transactional
    public Result getMedicamento(Integer id) {
        return ok(Json.toJson(MedicamentoService.getPorChave(id)));
    }

    @Transactional
    public Result updadteMedicamento() {
        Medicamento fromRequest = Json.fromJson(request().body().asJson(), Medicamento.class);
        Medicamento medicamento = MedicamentoService.getPorChave(fromRequest.getId());

        if (fromRequest.getNome() != null) {
            medicamento.setNome(fromRequest.getNome());
        }
        if (fromRequest.getPrincipioActivo() != null) {
            medicamento.setPrincipioActivo(fromRequest.getPrincipioActivo());
        }
        if (fromRequest.getDoenca() != null) {
            medicamento.setDoenca(fromRequest.getDoenca());
        }
        if (fromRequest.getObservacoes() != null) {
            medicamento.setObservacoes(fromRequest.getObservacoes());
        }

        MedicamentoService.save(medicamento);

        return ok(Json.toJson(medicamento));
    }

    @Transactional
    public Result createMedicamento() {
        Medicamento fromRequest = Json.fromJson(request().body().asJson(), Medicamento.class);
        Medicamento medicamento = new Medicamento();

        if (fromRequest.getNome() != null) {
            medicamento.setNome(fromRequest.getNome());
        }
        if (fromRequest.getPrincipioActivo() != null) {
            medicamento.setPrincipioActivo(fromRequest.getPrincipioActivo());
        }
        if (fromRequest.getDoenca() != null) {
            medicamento.setDoenca(fromRequest.getDoenca());
        }
        if (fromRequest.getObservacoes() != null) {
            medicamento.setObservacoes(fromRequest.getObservacoes());
        }

        MedicamentoService.save(medicamento);

        return ok(Json.toJson(medicamento));
    }

    @Transactional
    public Result deleteMedicamento(Integer id) {
        Medicamento medicamento = MedicamentoService.getPorChave(id);
        MedicamentoService.delete(medicamento);
        return ok();
    }

}