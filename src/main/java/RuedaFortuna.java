import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
public class RuedaFortuna {


   // public int Ncasillas;
    private int[] casillas;



//control de excepciones.
    /*
    public void validador(){

        try{

            if (numeroCasillas>0) {

                System.out.println("numero valido");
            }else if(numeroCasillas<=0){
                System.out.println("no se permite este numero, ingrese otro");
                validador();


            }


        }catch(Exception exception) {
            System.out.println("no es un numero, ingrese otro");
            validador();
        }
    }
*/
    public int inicializarRueda (int numeroCasillas){
        System.out.println("ingrese el numero de casillas:");
        /*
        Scanner in= new Scanner(System.in);
        numeroCasillas = in.nextInt();



         */
        if(numeroCasillas>  4 && numeroCasillas<100){
            System.out.println("El numero de casillas sera de: "+numeroCasillas);
        }else{
            System.out.println("numero no valido, por favor ingrese el numero nuevamente ");
            //validador();
        }

        return numeroCasillas;
    }



    public int lanzarRueda(int Ncasillas){
        int aleatorio;
        //random de cassilla ganadora
        int aleatorio2 = (int)(Math.random()*Ncasillas);
        //largo de casillas
        int casillas[]= new int [Ncasillas];
        Random rNum=new Random();
      casillas= new int[Ncasillas];
        System.out.println("inicio de spoiler");
        for (int x=0; x < casillas.length; x++) {
            casillas[x]= (int) (Math.random()*100+1);

            System.out.println(casillas[x]);

        }
        System.out.println("fin de spoiler");
        System.out.println("numero ganador es la casilla: "+aleatorio2+" con numero: "+casillas[aleatorio2]);


        return 0;
    }



}
