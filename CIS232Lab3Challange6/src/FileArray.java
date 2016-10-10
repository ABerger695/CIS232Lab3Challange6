import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileArray {

	public static void writeArray(String fileName, int[] array) throws IOException {
		FileOutputStream fos = new FileOutputStream(fileName);
		DataOutputStream output = new DataOutputStream(fos);

		for (int i = 0; i < array.length; i++) {
			output.writeInt(array[i]);
		}

		output.close();
	}

	public static void readArray(String fileName, int[] array) throws IOException {

		FileInputStream fis = new FileInputStream(fileName);
		DataInputStream input = new DataInputStream(fis);

		for (int i = 0; i < array.length; i++) {
			array[i] = input.readInt();
		}

		input.close();
	}
}
