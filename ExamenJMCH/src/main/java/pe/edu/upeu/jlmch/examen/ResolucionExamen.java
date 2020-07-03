//1 =========================================================================================
package pe.edu.upeu.jlmch.examen;
import pe.edu.upeu.jlmch.utils.LeerTeclado;


public class ResolucionExamen{
	LeerTeclado leerT = new LeerTeclado();
//1*********************************************************************************************************
	public void Ejercicio1(int NumVehiculos){

	int CostoVehiculos = 0, Categoria = 0;
	double Impuesto1 = 0, Impuesto2 = 0, Impuesto3 = 0, ImpuestoTotal = 0;
	
	int x=1;
	
	while(x<=NumVehiculos){
		
		Categoria = leerT.leer(0,"Ingrese la categoria del vehiculo numero"+x);
		
		CostoVehiculos = leerT.leer(0,"Ingrese el costo de vehiculo");
		
		if(Categoria == 1){
			
			Impuesto1 = CostoVehiculos*0.10;
			System.out.println("El impuesto a pagar por el vehiculo numero "+x+" es de: "+Impuesto1);
			
		}else if(Categoria == 2){
			Impuesto2 = CostoVehiculos * 0.07;
			System.out.println("El impuesto a pagar por el vehiculo numero "+x+" es de: "+Impuesto2);
		}else{
		
			Impuesto3 = CostoVehiculos * 0.05;
			System.out.println("El impuesto a pagar por el vehiculo numero "+x+" es de: "+Impuesto3);
		}
		x++;
		}
		ImpuestoTotal = Impuesto1 + Impuesto2 + Impuesto3;
		System.out.println("El impuesto total a pagar es de: "+ImpuestoTotal);
	}	
//2*****************************************************************************************************************

public void Ejercicio2(int tablas){
	
	 int  i;
	    
		System.out.println();
		
		int x = 0, n = 1;
		while(x < tablas){		
        System.out.println("Tabla del " + n);
		System.out.println("============");
		
        for(i = 1; i<=10; i++){
             System.out.println(n + " * " + i + " = " + n*i); 
        }
		i++;
		n++;
		x++;
	   }
	 }
//3**************************************************************************************************
    public void Ejercicio3(){

	double NumPerfect = 0;
	
	int x = 1, n = 2;
	
	while(x <= 6){
	if(n == 2){
	NumPerfect = Math.pow(2,n-1)*(Math.pow(2,n)-1);
	System.out.println("El primer numero perfecto es: "+NumPerfect+"");
	
	}else if(n == 3){
	NumPerfect = Math.pow(2,n-1)*(Math.pow(2,n)-1);
	System.out.println("El segundo numero perfecto es: "+NumPerfect);
	
	}else if(n == 5){
	NumPerfect = Math.pow(2,n-1)*(Math.pow(2,n)-1);
	System.out.println("El tercer numero perfecto es: "+NumPerfect);
	
	}else if(n == 7){
	NumPerfect = Math.pow(2,n-1)*(Math.pow(2,n)-1);
	System.out.println("El cuarto numero perfecto es: "+NumPerfect);
	}
	x++;
	n++;
	}	
  }

//4********************************************************************************************************

public int Ejercicio4(int n, int x){
	
	int Resultado = 0;
	
    if (x <= 0){
        Resultado = 1;
	}else{
		Resultado = n*Ejercicio4(n,(x-1));
	}
	return Resultado;
  }
//Fin Resolucion de Examen********************************************************************************************
 }