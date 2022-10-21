package brenda.datastruct.sequentialList;

public class InsertionSort {
    public static void main(String[] args) {
        int[] vector = new int[10];

        for(int i = 0; i < vector.length; i++){
            vector[i] = (int) (Math.random() * 10);
        }

        System.out.println("Unordered vector: ");
        for(int i = 0; i < vector.length; i++){
            System.out.println(vector[i]);
        }

        int aux, j;
        for(int i = 0; i < vector.length; i++){
            aux = vector[i];
            j = i -1;

          while(j >= 0 && vector[j] > aux){
              vector[j+1] = vector[j];
              j--;
          }
          vector[j+1] = aux;
        }

        System.out.println("Ordered vector: ");
        for(int i = 0; i < vector.length; i++){
            System.out.println( vector[i]);
        }

    }
}
