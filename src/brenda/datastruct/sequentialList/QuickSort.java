package brenda.datastruct.sequentialList;

public class QuickSort {

    private static int[] vector = new int[10];

    public static void main(String[] args) {

        for(int i = 0; i < vector.length; i++){
            vector[i] = (int) (Math.random() * vector.length);
        }

        print("Vector: ");
    }

    private static void print(String message){
        System.out.println(message);
        for(int i = 0; i < vector.length; i++){
            System.out.print(vector[i] + " ");
        }
    }
}
