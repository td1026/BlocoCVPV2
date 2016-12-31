package controllers;

import models.entity.Medicamento;
import models.service.MedicamentoService;
import play.libs.Json;
import play.mvc.*;
import play.db.jpa.Transactional;

/**
 * Created by Telmo Dias on 06/10/2016.
 */

public class HomeController extends Controller {

    @Transactional(readOnly = true)
    public Result findMedicamento() {
        return ok(Json.toJson(MedicamentoService.find()));
    }
    @Transactional(readOnly = true)
    public Result getMedicamento(Integer id) {
        return ok(Json.toJson(MedicamentoService.get(id)));
    }
    @Transactional(readOnly = true)
    public Result updadteMedicamento() {
        Medicamento fromRequest = Json.fromJson(request().body().asJson(), Medicamento.class);
        Medicamento medicamento = MedicamentoService.get(fromRequest.getId());

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
    @Transactional(readOnly = true)
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
    @Transactional(readOnly = true)
    public Result deleteMedicamento() {
        Medicamento fromRequest = Json.fromJson(request().body().asJson(), Medicamento.class);
        Medicamento medicamento = MedicamentoService.get(fromRequest.getId());


        return ok(Json.toJson(medicamento));
    }

}