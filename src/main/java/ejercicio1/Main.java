package ejercicio1;

public class Main {
    public static void main(String[] args) {

        int sumaRequerida = 8;
        int[] nums = {4, 2, 3, 4};

        boolean output =sumaDe2ElementosEnUnArray(nums,sumaRequerida);

        System.out.println("Output: "+ output);
    }

    public static boolean sumaDe2ElementosEnUnArray( int[] nums,int sumaRequerida ){

        for (int j = 0; j < nums.length - 1; j++) {
            for (int i = 1+j; i < nums.length; i++) {
                if (sumaRequerida == nums[j] + nums[i]) {
                    return true;
                }
            }
        }
        return false;
    }
}