package brenda.datastruct.sequentialList;

public class RecursiveAlgorithm {
    public static void main(String[] args) {
        int[] vector = new int[10];

        for(int i = 0; i < vector.length; i++){
            vector[i] = (int) (Math.random() * vector.length);
        }

        System.out.println("Vector: ");
        for(int i = 0; i < vector.length; i++){
            System.out.println(vector[i]);
        }

        System.out.println("Add: " + add(0, 0, vector));
    }


    private static int add(int add, int position, int[] vector){
        if(position < vector.length){
            add = add + vector[position];
            return add(add, position + 1, vector);
        }else{
            return add;
        }
    }
}
