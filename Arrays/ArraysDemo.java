

public class ArraysDemo {

    public static void main(String a[]) {
        System.out.println("Hello");
        int[] nums = {44, 34,56};
        minimum(nums);
        System.out.println("Arryas ::"+nums[0]);
        System.out.println("Arryas ::"+nums[1]);
        System.out.println("Arryas ::"+nums[2]);

        System.out.println();
        System.out.println("Mutli Dimensional");

        for(int i :nums) {
            System.out.println(i);
        }

        int[][] num = new int[3][4];
        for(int i=0; i<3; i++) {
            for(int j=0; j<4;j++){
                num[i][j] = (int) (Math.random()*100);
                //System.out.println(num[i][j]);
            }
        }

        for(int i=0; i<3; i++) {
            for(int j=0; j<4;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }

        Class c = nums.getClass();
        String name = c.getName();
        System.out.println("Array Name ::"+name);
    }
    
    //passing Array as parameter
   public static void minimum(int a[]){
        int min = a[0];
        for(int i = 1; i< a.length; i++) {
            if (min > a[i]) {
                min = a[i];
                System.out.println("minimum Array :: "+min);
            }
        }
        System.out.println("minimum Array with base ::"+min);
    }

}
