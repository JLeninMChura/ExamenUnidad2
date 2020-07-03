package pe.edu.upeu.jlmch;

import java.io.IOException;
import pe.edu.upeu.jlmch.examen.*;
import pe.edu.upeu.jlmch.utils.*;

public class App{

    public static void main(String[] args) throws IOException {
        try {
            LeerTeclado teclado=new LeerTeclado();    
            ResolucionExamen obj=new ResolucionExamen();

            char opcion='S'; //S=SI, N=NO
            String NumAlgoritm="01";

            do{            
                NumAlgoritm=teclado.leer("",
                "Ingrese el numero de Algoritmo que desea probar: \n01=Ejercicio1\n02=Ejercicio2\n03=Ejercicio3\n04=Ejercicio4");
                switch(NumAlgoritm){
				case "01": 
                int NumVehiculos=teclado.leer(0,"Ingrese el numero de vehiculos");  
				obj.Ejercicio1(NumVehiculos);
                 break;
				 case "02":
				 int tablas = teclado.leer(0, "Introduce nu numero de tablas a multiplicar: ");
                 obj.Ejercicio2(tablas);
				 break;
				 case "03":
				 obj.Ejercicio3();
				 break;
				 case "04":
				 int n = teclado.leer(0,"Ingrese la base");
				 int x = teclado.leer(0,"Ingrese el exponente");
				 System.out.println("El resultado es: "+obj.Ejercicio4(n,x));
				 break;
                 default: System.out.println("La opcion No existe!!"); break;
                }            
                opcion=teclado.leer(' ', "Desea Probar mas Algoritmos? S=SI, N=NO");
            }while(opcion=='S' || opcion=='s');   
        } catch (Exception er) {
            System.out.println(er.getMessage());
        }
    }
}