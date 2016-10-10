import java.io.IOException;

public class FileArrayDemo {

	public static void main(String[] args) throws IOException {
		FileArray file = new FileArray();
		int[] firstArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] secondArray = new int[10];

		System.out.print("Contents of the array: ");
		printArray(firstArray);
		System.out.println("\nWriting the contents of the array to array.dat.");
		FileArray.writeArray("array.dat", firstArray);
		System.out.println("Reading contents of array.dat.");
		FileArray.readArray("array.dat", secondArray);
		System.out.print("Array read from array.dat: ");
		printArray(secondArray);
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}
}
