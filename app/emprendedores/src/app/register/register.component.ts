import { EmprendedorService } from './../services/emprendedor.service';
import { Emprendedores } from '../DAO/emprendedores';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {



  constructor(private emprendedorService: EmprendedorService) { }


  emprendedores: Emprendedores = new Emprendedores();


  submitted = false;

  ngOnInit(): void {
  }

  createEmprendedor(): void{
    console.log(this.emprendedores);
    this.emprendedorService.create(this.emprendedores);
  }

}
