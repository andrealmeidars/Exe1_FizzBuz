import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
   }

    @Test
    public void deveRetornar2QuandoForNumero2() {
        assertThat(fizzBuzz.converte(2), is("2"));
     }

    @Test
    public void deveRetornarFizzQuandoForNumero3(){
        assertThat(fizzBuzz.converte(3), is("Fizz"));
    }

    @Test
    public void devereRetornar4QuandoForNumero4() throws Exception {
        assertThat(fizzBuzz.converte(4), is("4"));

    }
}
