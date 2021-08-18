public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.setModel("FQ");
        auto.setPower(13);
        auto.setColor("blue");
        auto.getModel();
        auto.getPower();
        auto.getColor();
        System.out.println("Цвет: "+auto.getColor());
    }
}
class Auto {
    private String model = "bwm";
    private int power = 250;
    private String color = "black";

    public void setModel(String model){
        this.model = model;
    }
    public void setPower(int power){
        this.power = power;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getModel(){
        return model;
    }
    public int getPower(){
        return power;
    }
    public String getColor(){
        return color;
    }
}
