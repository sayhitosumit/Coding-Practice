import java.util.Stack;

public class Car extends Vehical   {
   private String color;
    private String isElectric;

   private String tyreBrand;

    public Car(String color,String isElectric, String  tyreBrand,String name, int noOfWheels){
        super(name,noOfWheels);
        this.color=color;
        this.isElectric=isElectric;
        this.tyreBrand=tyreBrand;

    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", isElectric='" + isElectric + '\'' +
                ", tyreBrand='" + tyreBrand + '\'' +
                ", ename='" + ename + '\'' +
                ", enoOfWheels=" + enoOfWheels +
                '}';
    }
    public String getColor(){
        return this.color;
    }


    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!='*'){
                stack.push(s.charAt(i));
            }else stack.pop();


        }
        StringBuilder stringBuilder = new StringBuilder();

        for (Character c  : stack  ) {
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Car tesla = new Car("blue","yes","mrf","model y",4);
        System.out.println("color of tesla is : "+tesla.getColor());
        System.out.println(tesla);
    }

}


