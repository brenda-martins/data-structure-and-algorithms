package brenda.datastruct.sequentialList;

public class BubbleSort {
    public static void main(String[] args) {
        int[] vector = new int[100000];
        int aux;

        System.out.println("Unordered vector: ");
        for(int i = 0; i < vector.length; i++){
            vector[i] = (int) (Math.random() * 10);
//            System.out.println(vector[i]);
        }

        long start = System.currentTimeMillis();
        long end;

        for(int i = 0; i < vector.length; i++){
            for(int j = i+1; j < vector.length; j++){
                if(vector[i] > vector[j]){
                    aux = vector[i];
                    vector[i] = vector[j];
                    vector[j] = aux;
                }
            }
        }
        end = System.currentTimeMillis();

//        System.out.println("Sorted array: ");
//        for(int i = 0; i < vector.length; i++){
//            System.out.println(vector[i]);
//        }

        System.out.println("Time to sorte: " + (end - start));
    }
}
