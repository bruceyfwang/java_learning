import java.util.Arrays;
import java.util.Random;

public class Array1000 {
    public static void main(String[] args) {
        long start = System.nanoTime();
        int[] numbers = new int[1000];
        Random random = new Random();
        for(int i=0;i<1000;i++){
            numbers[i] =  i*2+random.nextInt(2);//不重复随机且有序
        }
        long end = System.nanoTime();
        System.out.println("\n总运行时间:"+(end-start)+"ns");
        System.out.println(Arrays.toString(numbers));
    }
}