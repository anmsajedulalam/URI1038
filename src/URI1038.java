import java.util.Scanner;

public class URI1038 {
    public static void main(String[]args) {
        Scanner k = new Scanner(System.in);
        int x=k.nextInt();
        int y=k.nextInt();
        float result= (float) 0.00;

        if(x==1){
            result=(float)(y*4.00);
        }
        else if(x==2){
            result=(float)(y*4.50);
        }
        else if(x==3){
            result=(float)(y*5.00);
        }
        else if(x==4){
            result=(float)(y*2.00);
        }
        else if(x==5){
            result=(float)(y*1.50);
        }

        System.out.printf("Total: R$ %.2f\n",result);
    }
}
