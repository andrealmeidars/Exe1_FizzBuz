import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {



    @Test
    public void deveRetornar2QuandoForNumero2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.converte(2), is(2));
     }


}
