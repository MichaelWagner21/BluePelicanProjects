class Diameter {
    public static void main(String[] args){
        Circle cir1 = new Circle(35.5); 
        System.out.println( cir1.diameter( ) ); // should give 71.0 as the answer.
        
    }
}

class Circle {
    private double radius;
    private double diameter;
    public Circle(double inputRadius){
        this.radius = inputRadius;
        this.diameter = 2*inputRadius;
    }
    public double diameter(){
        return this.diameter;
    }
    public double radius(){
        return this.radius;
    }
}