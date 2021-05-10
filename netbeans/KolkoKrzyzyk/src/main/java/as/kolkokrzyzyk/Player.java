package as.kolkokrzyzyk;

public class Player {
    private String sign = "";
    private String name = "";
    private boolean computer = false; //TRUE means computer

    public Player(String sign, String name){
        this.name = name;
        this.sign = sign;
    }    

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIsComputer() {
        return computer;
    }

    public void setIsComputer(boolean isComputer) {
        this.computer = isComputer;
    }
    
    
}
