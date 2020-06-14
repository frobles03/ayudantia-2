import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.*;

class RuedaFortunaTest {
private RuedaFortuna c;
private int  esperado;
    @BeforeEach
    void setUp() {
        c= new RuedaFortuna();
    }

    @AfterEach
    void tearDown() {
        c=null;
    }


    @Test
    void inicializarRueda() {
    int numeroCasillas=-4;
    System.out.println("numero ingreasdo: "+numeroCasillas);
    assertNotEquals(false, c.inicializarRueda(numeroCasillas));
    }


    @Test
    void inicializarRueda2() {
        int numeroCasillas=9846745;
        assertNotEquals(false, c.inicializarRueda(numeroCasillas));
        System.out.println("numero ingreasdo: "+numeroCasillas);
    }



    @Test
    void lanzarRueda() {
        //Tamaño esperado de la martiz casillas
        int Ecasillas=6;
        int casillas[]= new int [Ecasillas];
        //tamaño de la matriz casillas
        int Ncasillas=c.lanzarRueda(8);
        assertNotEquals(Ncasillas,Ecasillas);


    }
    @Test
    void lanzarRueda1() {
        try {
            int Ecasillas = -6;
            int casillas[] = new int[Ecasillas];
        }catch(NegativeArraySizeException ex){
            System.out.println("no se permite en un array");
        }

    }
}