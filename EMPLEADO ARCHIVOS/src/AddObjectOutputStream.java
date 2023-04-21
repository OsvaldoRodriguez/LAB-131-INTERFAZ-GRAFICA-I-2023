
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;


public class AddObjectOutputStream extends ObjectOutputStream {

	protected AddObjectOutputStream(OutputStream out) throws IOException, SecurityException {
		super(out);
		// TODO Auto-generated constructor stub
	}
	protected void writeStreamHeader() throws IOException
	{
		this.reset();
	}
}
