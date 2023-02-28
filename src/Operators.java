public class Operators {
    public static void main(String[] args) {
        // arthemtic + - * / %

        int num = 20%30;
        System.out.println(num);
        // relational < > >= <=  == --> boolean
        System.out.println(2!=2);
        // bitwise & | ^ ~ << >> <<< >>>
        System.out.println(0111>>>1);
        // assigment operators += += *= /= %=
        int num1=10;
        num1 %=10;

        System.out.println(num1);


        // logical && || ! -->booleans
        int num2 = 3;

        if(num2>1 || num2<10){
            System.out.println(num2);
        }
          //    false --> true
        if (!(num2>2)){
            System.out.println("Number not greater than 2");
        }
        //ternary

        int num3 = num2>1? 10 : 1;

        System.out.println(num3);

    }
}
