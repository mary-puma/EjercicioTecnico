package ejercicio2;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        int sumaRequerida = 8;
        int[] nums = {1, 4, 3, 9};
        boolean output =sumaDe2ElementosEnUnArray(nums,sumaRequerida);

        System.out.println("Output: "+ output);

    }
    public static boolean sumaDe2ElementosEnUnArray( int[] nums,int sumaRequerida ){

        HashSet<Integer> complementos = new HashSet<>();

        for (int num : nums) {
            int complemento = sumaRequerida - num;
            if (complementos.contains(complemento)) {
                return true;
            }
            complementos.add(num);
        }
        return false;
    }


}
