import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class FileUtils{
	private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	/*
	 * Save ToDo to filename alltodo.csv in format:
	 * title;content;author;add_date
	 * @param ToDo - out note
	 * */
	public void saveToFile(ToDo td){
		try{
			File f = new File("alltodo.csv");
			FileWriter fw = new FileWriter(f,true);
			String title = td.getTitle();
			fw.write(td.getTitle()+";"+td.getContent()+";"+td.getAuthor()
				+";"+dtf.format(td.getAdd_Date())+"\n");
			fw.close();
		} catch(IOException ex){
			System.out.println("UPS! "+ex.toString());
		}
	}
	
	public ArrayList<ToDo> readFromFile(){
		ArrayList<ToDo> list = new ArrayList<>();
		try{
			File f = new File("alltodo.csv");
			Scanner sc = new Scanner(f);
			while(sc.hasNext()){
				String temp = sc.nextLine();
				//System.out.println(temp);
				String [] ttemp = temp.split(";");
				ToDo td = new ToDo(ttemp[0], ttemp[1], ttemp[2], LocalDateTime.parse(ttemp[3],dtf));
				list.add(td);
			}
		} catch(FileNotFoundException ex){
			System.out.println("UPS! "+ex.toString());
		}
		return list;
	}
}
