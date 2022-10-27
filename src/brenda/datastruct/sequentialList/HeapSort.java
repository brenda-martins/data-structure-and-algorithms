package brenda.datastruct.sequentialList;

public class HeapSort {

    public static void main(String[] args) {
        int[] vector = new int[10];

        for(int i = 0; i < vector.length; i++){
            vector[i] = (int) (Math.random() * vector.length);
        }

        print(vector, "Vector: ");


        int length = vector.length;
        int start = (length / 2 - 1);

        for(int i = start; i >= 0; i--){
            applyHeap(vector, length, i);
        }

        print(vector, "\n\nVector almost ordered: ");

        for(int x = length - 1; x > 0; x--){
            int aux = vector[0];
            vector[0] = vector[x];
            vector[x] = aux;

            applyHeap(vector, x, 0);
        }

        print(vector,"\n\nVector ordered: ");
    }

    private static void print(int[] vector, String message){
        System.out.println(message);
        for(int i = 0; i < vector.length; i++){
            System.out.print(vector[i] + " ");
        }
    }

    private static void applyHeap(int[] vector, int length, int i){
        int root = i;
        int left = 2*i + 1;
        int rigth = 2*i + 2;

        if(left < length && vector[left] > vector[root]){
            root = left;
        }
        if(rigth < length && vector[rigth] > vector[root]){
            root = rigth;
        }

        if(root != i){
            int aux = vector[i];
            vector[i] = vector[root];
            vector[root] = aux;

            applyHeap(vector, length, root);
        }
    }
}
