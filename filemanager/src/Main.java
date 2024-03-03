import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file path:");
        String filePath = scanner.nextLine();

        fileManager.sortFilesInDirectory(filePath);
    }
}