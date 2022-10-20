package homework_1;

public class task_2 {
    public static void main(String[] args){
        int number = 1000;
        System.out.print("Simple numbers: ");
        for(int i = 1; i <= number; i++){
            int count = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count == 2){
                System.out.print(i + " ");

            }
        }
    }
}
