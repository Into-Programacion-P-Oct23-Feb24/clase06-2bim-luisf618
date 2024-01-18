/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import paquete02.DatoPersonal;
import paquete03.DatosUbicacion;
import paquete04.DatoAcademico;
import paquete05.DatoFinal;
import paquete02.DatoTrabajo;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        String nombre;
        String ciudad;
        String apellidoRetornado;
        String cadenaNotas = "";
        String empresa;
        String direccion;
        double[] misNotas;
        double promedio;

        nombre = DatoPersonal.obtenerNombre();
        apellidoRetornado = DatoPersonal.obtenerApellido();
        empresa = DatoTrabajo.obtenerEmpresa();
        direccion = DatoTrabajo.obtenerDireccion();
        ciudad = DatosUbicacion.obtenerCiudad();
        misNotas = DatoAcademico.obtenerNotas(4);
        promedio = DatoFinal.obtenerPromedio(misNotas);
        for (int i = 0; i < misNotas.length; i++) {
            cadenaNotas = String.format("%s%.2f\n",
                    cadenaNotas, misNotas[i]);
        }

        System.out.printf("Los datos ingresados son:\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Empresa en la que trabaja: %s\n"
                + "Direccion de la empresa: %s\n"
                + "Ciudad: %s\n"
                + "Notas: \n%s"
                + "Promedio: %.2f\n",
                nombre,
                apellidoRetornado,
                empresa,
                direccion,
                ciudad,
                cadenaNotas,
                promedio);
    }

}
