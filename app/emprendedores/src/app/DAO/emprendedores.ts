// To parse this data:
//
//   import { Convert, Response } from "./file";
//
//   const response = Convert.toResponse(json);

export class Emprendedores {
  id?:                  number = 0;
  nombres?:             string = "";
  apellidos?:           string = "";
  correo?:              string = "";
  fecha_nacimiento?:    Date = new Date();
  fecha_creacion?:      Date = new Date();
  fecha_actualizacion?: Date = new Date();

  constructor(id?:                  number,
    nombres?:             string,
    apellidos?:           string,
    correo?:              string,
    fecha_nacimiento?:    Date,
    fecha_creacion?:      Date,
    fecha_actualizacion?: Date){

      this.id = id;
      this.nombres = nombres;
      this.apellidos = apellidos;
      this.correo = correo;
      this.fecha_nacimiento = fecha_nacimiento;
      this.fecha_creacion = fecha_creacion;
      this.fecha_actualizacion = fecha_actualizacion;
  }

}

// Converts JSON strings to/from your types
export class Convert {
  public static toResponse(json: string): Response {
      return JSON.parse(json);
  }

  public static responseToJson(value: Response): string {
      return JSON.stringify(value);
  }
}
