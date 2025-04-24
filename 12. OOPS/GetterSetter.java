public class GetterSetter {
    public static void main(String[] args) {
        Pen obj = new Pen();
        obj.setColor("Blue");
        System.out.println(obj.getColor());

        obj.setColor("yellow");
        System.out.println(obj.getColor());


    }
    
}

class Pen{
    String color;
    int tip;

String getColor(){
    return this.color;
}

String setColor(String newColor){
    this.color = newColor;
    return color;
}

}