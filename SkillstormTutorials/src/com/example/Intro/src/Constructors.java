public class Constructors {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        pizza.slices = 8;
        Pizza pie = new Pizza(6);
        pie.topping = "pepperoni";
        System.out.println(pie.topping);
    }
}

class Pizza {
    int slices;
    String topping;
    Pizza() {} // must define no argument constructor to create instance of pizza
    Pizza(int pieces){
        slices = pieces;
    } 
    public void eat(){ //each overloaded constructor will have access to this method
        slices -= 1;
    }
}