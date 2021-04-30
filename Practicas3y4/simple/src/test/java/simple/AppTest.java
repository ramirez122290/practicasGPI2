package simple;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue(){
        assertTrue( true );
    }
    
    @Test
	public void stringOutputTest() {
		// Preparo los streams
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		final PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		// Lanzo la funcion a probar
		App aplicacion = new App();
		aplicacion.print();
		String salida = outContent.toString();
		// Vuevlo a dejar los streams como estaban
		System.setOut(originalOut);
		// Compruebo salida
		assertEquals("lala", salida);
	}
}
