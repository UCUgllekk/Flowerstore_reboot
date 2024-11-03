package ua.edu.ucu.apps.flowerstore.flower;

public enum FlowerColor {
    RED("#FF0000"), GREEN("#00FF00"), BLUE("#0000FF"), YELLOW("#FFFF00"), WHITE("#FFFFFF");
    private String rgb;

    FlowerColor(String rgb){
        this.rgb = rgb;
    }
    
    public String ToString(){
        return rgb.toString();
    }

}
