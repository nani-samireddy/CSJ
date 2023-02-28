public class Loops {
    public static void main(String[] args) {
        int number = 1;
                    //6
        while(number<=5){
            System.out.println(number);
            number++;
        }
        int n=0;
        System.out.println(n++);
        System.out.println(n);
        System.out.println(++n);

        System.out.println(--n);

        // do while
        //11
        do{
            System.out.println(number);
            number++;
        }while(number<=10);

        // for initialization; condition; update
        System.out.println("For loop");
        for(int num = 0; num<10; num++){
            System.out.println(num);
        }

        //for each
        System.out.println("For each");
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        // (loopvar : arr)
        for(int a: arr){
            System.out.println(a);
        }

    }
}
