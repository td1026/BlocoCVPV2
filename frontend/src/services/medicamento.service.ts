// Angular2
import { Injectable } from '@angular/core';
import { Http, Headers } from '@angular/http';

// Models
import { Medicamento } from '../models/medicamento';

@Injectable()
export class MedicamentoService {
  
  private url: String;

  constructor(private http: Http) {
      //this.url = "95.95.106.16:9000";
      this.url = "http://localhost/api";
  }
  
    findMedicamento(){
        return this.http.get(this.url + '/medicamento')
            .map((response: any) => {
            return response.json();
        })
    }

    getMedicamento(id: number) {
        return this.http.get(this.url + '/medicamento' +
            '?id='  + (id  || ""))
            .map((response: any) => {
            return response.json();
        })
    }
    updadteMedicamento(medicamento: Medicamento) {
        return this.http.post(this.url + '/medicamento', JSON.stringify({
            'id':  medicamento.id,
            'nome': medicamento.nome,
            'principioActivo':  medicamento.principioActivo,
            'doenca': medicamento.doenca,
            'observacoes':  medicamento.observacoes

        }),
        {
            headers: new Headers({
                'Content-Type': 'application/json'
            })
        })
        .map((response: any) => {
            return response.json();
        });
    }
    createMedicamento(medicamento: Medicamento) {
        return this.http.put(this.url + '/medicamento', JSON.stringify({
            'nome': medicamento.nome,
            'principioActivo':  medicamento.principioActivo,
            'doenca': medicamento.doenca,
            'observacoes':  medicamento.observacoes
        }),
        {
            headers: new Headers({
                'Content-Type': 'application/json'
            })
        })
        .map((response: any) => {
            return response.json();
        });
    }

    deleteMedicamento(medicamento: Medicamento) {
        return this.http.delete(this.url + '/medicamento' +
            '?id='  + (medicamento.id  || ""))
            .map((response: any) => {
            return response.json();
        })
    }
}