import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void testPrintTextToStream() {
		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		HelloWorld.printTextToStream("test", new PrintStream(stream));
		assertEquals("test\n", stream.toString());
	}

}
