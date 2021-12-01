import { AppComponent } from './app.component';
import { RegisterComponent } from './register/register.component';
import { ListemprendedoresComponent } from './listemprendedores/listemprendedores.component';
import { EmprendimientosComponent } from './emprendimientos/emprendimientos.component';
import { HomeComponent } from './home/home.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  { path: '', redirectTo: 'home', pathMatch: 'full' },
  { path: 'home', component: HomeComponent },
  { path: 'emprendedores', component: ListemprendedoresComponent },
  { path: 'emprendimiento:idemprendedor', component: EmprendimientosComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
