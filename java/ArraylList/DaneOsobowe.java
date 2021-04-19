import java.time.*;

class DaneOsobowe{
	private String name = "";
	private String lastname = "";
	private int age = 0;
	private int height = 0; 
	private int weight = 0;
	
	//Konstruktor
	public DaneOsobowe(String name, String lastname, int age, int height, int weight) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    
    public double bmi(){
		return (double)weight/(height*height)*10000;
	}
	
	public int yearOfBirthday(){
		LocalDate now = LocalDate.now();  
        int year = now.getYear(); 
        return year-age;
	}
    
    @Override
    public String toString(){
		return "DaneOsobowe:" +"\n"+
                "name='" + name + '\''+"\n"+
                "lastname='" + lastname + '\'' +"\n"+
                "age=" + age +"\n"+
                "height=" + height +"\n"+
                "weight=" + weight;
	}
	
}
