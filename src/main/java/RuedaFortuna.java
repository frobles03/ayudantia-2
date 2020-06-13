import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
public class RuedaFortuna {


    private int[] casillas;

    public int numeroCasillas;

    public void iniciar(){
        inicializarRueda();

    }

    public void validador(){
        Scanner in= new Scanner(System.in);
        numeroCasillas = in.nextInt();
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

    public void inicializarRueda(){
        System.out.println("ingrese el numero de casillas:");

        validador();

        if(numeroCasillas>=4 && numeroCasillas<=100){
            System.out.println("El numero de casillas sera de: "+numeroCasillas);
        }else{
            System.out.println("numero no valido, por favor ingrese el numero nuevamente ");
            validador();
        }
        lanzarRueda();

    }

    public int lanzarRueda(){
        int aleatorio;
        int aleatorio2 = (int)(Math.random()*numeroCasillas);
        int matriz[]= new int [numeroCasillas];
        Random rNum=new Random();
      casillas= new int[numeroCasillas];
        System.out.println("inicio de spoiler");
        for (int x=0; x < matriz.length; x++) {
            matriz[x]= (int) (Math.random()*100+1);

            System.out.println(matriz[x]);

        }
        System.out.println("fin de spoiler");
        System.out.println("numero ganador es la casilla: "+aleatorio2+" con numero: "+matriz[aleatorio2]);


        return 0;
    }



}
