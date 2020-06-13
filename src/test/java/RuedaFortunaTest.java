import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class RuedaFortunaTest {
private RuedaFortuna c;
    @BeforeEach
    void setUp() {
        c= new RuedaFortuna();
    }

    @AfterEach
    void tearDown() {
        c=null;
    }

    @Test
    void  validador1() {
      // String numeroCasillas="esdgfh";
        //char a='a';


    }
    @Test
    void  validador2() {

        c.validador();
        c.numeroCasillas=-12;
    }

    @Test
    void inicializarRueda() {
    }

    @Test
    void lanzarRueda() {



    }
}