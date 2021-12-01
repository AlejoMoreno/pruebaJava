import { EmprendedorService } from './../services/emprendedor.service';
import { Emprendedores } from '../DAO/emprendedores';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-information',
  templateUrl: './information.component.html',
  styleUrls: ['./information.component.css']
})
export class InformationComponent implements OnInit {

  constructor(private emprendedorService: EmprendedorService,
    private route: ActivatedRoute,
    private router: Router) { }

  emprendedores: Emprendedores = new Emprendedores();
  listEmprendedores?: Emprendedores[] = [];

  ngOnInit(): void {
    this.emprendedorService.getEmprendedores().subscribe(
      emprendedor=>{
        this.emprendedores = emprendedor;
        this.listEmprendedores?.push(this.emprendedores);
        console.log(emprendedor);
      }
    );
  }

  eliminar(id:any): void {
    this.emprendedorService.delete(id);
    this.router.navigate(['/emprendedores']);
  }

  editar(id:any): void {
  }

}
