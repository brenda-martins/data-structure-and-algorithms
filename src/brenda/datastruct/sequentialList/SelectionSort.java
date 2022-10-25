package brenda.datastruct.sequentialList;

public class SelectionSort {

    public static void main(String[] args) {

        int [] vector = new int[10];
        int minus_position, aux;

        for (int i = 0; i < vector.length; i++){
            vector[i] = (int) (Math.random() * vector.length);
        }

        System.out.println("Unordered vector: ");
        for(int i = 0; i < vector.length; i++){
            System.out.println(vector[i]);
        }

        for(int i = 0; i < vector.length; i++){
          minus_position = i;
          for (int j = i+1; j < vector.length; j++){
              if(vector[j]  < vector[minus_position]){
                  minus_position = j;
              }
          }
          aux = vector[minus_position];
          vector[minus_position] = vector[i];
          vector[i] = aux;
        }


        System.out.println("Ordered vector: ");
        for(int i = 0; i < vector.length; i++){
            System.out.println( vector[i]);
        }
    }
}
