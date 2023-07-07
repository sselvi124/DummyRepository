package packone;

import java.io.File;
import java.io.IOException;

public class Two {
public static void main(String[] args) throws Throwable {
	File f= new File("Selvi.png");
	f.createNewFile();
	String path = f.getAbsolutePath();
	System.out.println("done");
	System.out.println(path);
}
}
