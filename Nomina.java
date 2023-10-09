
package com.mycompany.nomina;

import java.util.Scanner;

/**
 *
 * @author Manuela Estrada 
 */
public class Nomina {

    public static void main(String[] args) {
        int basico, cant, vunidad, bono, ventatotal; 
        float com, rf, iss, comision, totalpagar, neto;
        String nomV, nomP;
        Scanner leer=new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        nomV=leer.nextLine();
        System.out.print("Ingrese el nombre de su producto: ");
        nomP=leer.next();
        System.out.print("Ingrese la cantidad de unidades vendidas: ");
        cant=leer.nextInt();
        System.out.print("Ingrese el valor de su producto: ");
        vunidad=leer.nextInt();
        System.out.print("Ingrese su salario basico: ");
        basico=leer.nextInt();
        ventatotal=cant*vunidad;
        if(ventatotal<=250000){
            com=(float) 0.03;
        }else{
            if(ventatotal<=500000){
                com=(float) 0.035;
            }else{
                com=(float) 0.04;
            }
        }
        comision=ventatotal*com;
        if(cant<=299){
            bono=0;
        }else{
            if(cant<=600){
                bono=20000*cant;
            }else{
                if(cant<=900){
                    bono=25000*cant;
                }else{
                    bono=(400000*cant)/12;
                }
            }
        }
       totalpagar=basico+bono+comision;
       if(totalpagar<=1599999){
           rf=0;
           iss=(float) (totalpagar*0.04);
       }else{
           if(totalpagar<=3999999){
               rf=(float) (totalpagar*0.01);
               iss=(float) (totalpagar*0.075);
           }else{
               rf=(float) (totalpagar*0.05);
               iss=(float) (totalpagar*0.085);
           }
       }
       neto=totalpagar-rf-iss;
       System.out.print(nomV + " su total neto es " + neto + ", su total a pagar es " + totalpagar + ", su retención en la fuente es " + rf + " y su seguridad social es " + iss);
    }
}    