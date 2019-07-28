import java.util.Scanner;

public class FindMaxInArray {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int size;
        do{
            System.out.println("Enter array size: ");
            size = scanner.nextInt();
            if(size>20){
                System.out.println("Size shouldn't be exceed 20");
            }
        }while (size>20);
        int i=0;
        int[]array= new int[size];
        while (i<array.length){
            System.out.println("Enter element" + ( i+1));
            array[i]=scanner.nextInt();
            i++;
        }
        System.out.print("Property list is: ");
        for(i=0; i<array.length;i++){
            System.out.print(array[i]+ "\t");
        }
        int max= array[0];
        int position=0;
        for (i=0;i<array.length;i++) {
            if (array[i] > max) {
                max = array[i];
                position=i+1;
            }
        }
        System.out.println();
        System.out.println("Max property in the list is: " + max + " at position: " + position);
    }


}
