import java.util.Scanner;
import java.io.*; //* - wszystkie clasy/biblioteki z java.io

class FileSeparator{
	public static void main(String [] a){
	//File.separator - systemowy separator folderów
	//czyli \ - windows    / - linux/macos
        String path = File.separator+"src"+File.separator+
            "main"+File.separator;
        System.out.println(path);

	}
}
