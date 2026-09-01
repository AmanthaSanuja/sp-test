import java.util.Random;
class p5{
    
    public static void cal(){
        Random rand = new Random();
        String[] operators = {"+", "-"};

        int sum=0;

        while(sum != 100){
            int num1 = rand.nextInt(99) + 1;
            int num2 = rand.nextInt(99) + 1;
            String operator = operators[rand.nextInt(operators.length)];
            if(operator.equals("+")){
                sum = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + sum);
            } else {
                sum = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + sum);
            }

        }

        
    }

    public static void main(String[]args){
        cal();

    }
}