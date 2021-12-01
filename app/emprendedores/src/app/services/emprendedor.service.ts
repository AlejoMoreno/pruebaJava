import { Emprendedores } from '../DAO/emprendedores';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

const baseURL = 'http://localhost:8080/emprendedores';

@Injectable({
  providedIn: 'root'
})

export class EmprendedorService {

  constructor(private httpClient: HttpClient) { }

  getEmprendedores(): Observable<Emprendedores> {
    return this.httpClient.get(baseURL);
  }

  getEmprendimientos(idemprendedor: number): Observable<Emprendedores> {
    return this.httpClient.get(`${baseURL}/${idemprendedor}`);
  }

  create(data: Emprendedores): Observable<Emprendedores> {
    return this.httpClient.post(baseURL, data);
  }

  update(id:number, data:Emprendedores): Observable<Emprendedores> {
    return this.httpClient.put(`${baseURL}/${id}`, data);
  }

  delete(id:number): Observable<Emprendedores> {
    return this.httpClient.delete(`${baseURL}/${id}`);
  }

  deleteAll(): Observable<Emprendedores> {
    return this.httpClient.delete(baseURL);
  }
}
