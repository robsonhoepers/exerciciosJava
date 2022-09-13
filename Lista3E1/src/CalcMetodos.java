import java.util.Scanner;

public class CalcMetodos {
	
	private double memoria;
	private double num1;
	private double num2;
	
	  
    public CalcMetodos (double memoria){
        this.memoria = memoria;
        
    }

    
   
    //setter e getter
    public void setMemoria(double memoria ){
        this.memoria = 0; 
    }
    public double getMemoria(){
        return this.memoria; 
    }

    //metodos de trabalho(Worker)
    public double somar(double num1, double num2){       
        this.memoria = num1 + num2;
    	return this.memoria;
    }

    public double subtrair(double num1, double num2){
    	this.memoria = num1 - num2;
     	return this.memoria; 
    }

    public double dividir(double num1, double num2){
    	this.memoria = num1 / num2;
     	return this.memoria; 
    }
   
    public double multiplicar(double num1, double num2){
    	 this.memoria = num1 * num2;
     	return this.memoria; 
    }



}
