
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;
import java.util.Scanner;
/**
 *
 * @author Salas
 */
public class taller {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner datos=new Scanner(System.in);
     //declarar variables
    int a,b,c,d,e,f,g,h,i,j,suma,res;
    double n;
    int m,veri;
    int t_a=0,t_c=0,t_e=0,t_g=0,t_i=0;
    //pedir al usuario variables
      do{
        System.out.println("ingrese su numero de cedula: ");
        a=datos.nextInt();
        b=datos.nextInt();
        c=datos.nextInt();
        d=datos.nextInt();
        e=datos.nextInt();
        f=datos.nextInt();
        g=datos.nextInt();
        h=datos.nextInt();
        i=datos.nextInt();
        j=datos.nextInt();
        //realizo las operaciones respectivas
           t_a=((a*2/10)+(a*2%10));
           t_c=((c*2/10)+(c*2%10));
           t_e=((e*2/10)+(e*2%10));
           t_g=((g*2/10)+(g*2%10));
           t_i=((i*2/10)+(i*2%10));
           
           suma= t_a+b+t_c+d+t_e+f+t_g+h+t_i+j;
           System.out.println("la suma total es: "+suma);
           n=Math.ceil(suma/10)*10;
           m=(int)(n+10);
           //utilizo un ciclo repetitivo
         
           veri=suma-m;
               System.out.println("cedula valida");
               System.out.println("suma"+ suma);
               System.out.println("maximo:"+veri);
               System.out.println("desea ingresar otra cedula: \1.Si o \2.No ");
               res=datos.nextInt();
           }while(res==1);
           
            } 
          }        
     

         

    
