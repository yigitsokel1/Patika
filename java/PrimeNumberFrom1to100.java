public class PrimeNumberFrom1to100 {
    public static void main(String[] args) {
        int i, j;
        boolean flag = false;
        System.out.print("2,");
        for(i=3; i<100; i++){
            if(i % 2 != 0){
                flag = true;
                j = 3;
                while(j<i/2 && flag){
                    if(i % j == 0)
                        flag = false;
                    j++;
                }
                if(flag)
                    System.out.print(i+",");
            }
        }
    }
}
