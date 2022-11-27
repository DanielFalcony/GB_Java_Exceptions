package HW_1;

public class Task_1 {
    public static void main(String[] args) {

        getArithmeticException();
        getNullPointerException();
        getIndexOfBoundException();

        int[] a = {1, 3, 5, 8, 6, 3};
        int[] b = {4, 6, 7, 2, 4, 9};
        try {
            for (int i : getSumm(a, b)){
                System.out.println(i);
            }

        } catch (RuntimeException e){
            System.out.println(e);
        }
        System.out.println();
        try {
            for (int i : getChastnoe(a, b)){
                System.out.println(i);
            }
        } catch (RuntimeException e){
            System.out.println(e);
        }

    }

    static int getArithmeticException() {
        int a = 10;
        int b = 0;
        int result = 0;
        try {
            result = a / b;
        } catch (ArithmeticException e){
            System.out.println(e.fillInStackTrace());
        }
        return result;
    }

    static void getNullPointerException(){
        String str = null;
        try{
            System.out.println(str.length());
        }
        catch (NullPointerException e){
            System.out.println(e.fillInStackTrace());
        }
    }

    static void getIndexOfBoundException(){
        int[] arr = new int[5];
        try {
            System.out.println(arr[7]);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e.fillInStackTrace());
        }
    }

    static int[] getSumm(int[] a, int [] b){
        int[] result = new int[a.length];
        if(a.length > b.length || b.length > a.length){
            throw new RuntimeException("Длинны массивов не равны");
        }
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] - b[i];
        }
        return result;
    }

    static int[] getChastnoe(int[] a, int[] b){
        int[] result = new int[a.length];
        if(a.length > b.length || b.length > a.length){
            throw new RuntimeException("Длинны массивов не равны");
        }
        for (int i = 0; i < a.length; i++) {
            if(b[i] == 0){
                throw new RuntimeException("b = " +b[i] + " Нельзя делить на ноль");
            }
            result[i] = a[i] + b[i];
        }
        return result;
    }
}


