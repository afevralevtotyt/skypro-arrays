public class Main {
    public static void main(String[] args) {
        task1_2_3();
        task4();
    }
    private static void task1_2_3() {
        int[] threeDigitArray = new int[3];
        threeDigitArray[0] = 1;
        threeDigitArray[1] = 2;
        threeDigitArray[2] = 3;

        double[] doubleArr = {1.57, 7.654, 9.986};

        String str[] = {"House", "Room"};

        for (int i = 0; i < threeDigitArray.length; i++) {
            if (i < threeDigitArray.length - 1) {
                System.out.print(threeDigitArray[i] + ", ");
            } else {
                System.out.print(threeDigitArray[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < doubleArr.length; i++) {
            if (i < doubleArr.length - 1) {
                System.out.print(doubleArr[i] + ", ");
            } else {
                System.out.print(doubleArr[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < str.length; i++) {
            if (i < str.length - 1) {
                System.out.print(str[i] + ", ");
            } else {
                System.out.print(str[i] + " ");
            }
        }
        System.out.println();
        for (int i = threeDigitArray.length-1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(threeDigitArray[i] + ", ");
            } else {
                System.out.print(threeDigitArray[i] + " ");
            }
        }
        System.out.println();
        for (int i = doubleArr.length-1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(doubleArr[i] + ", ");
            } else {
                System.out.print(doubleArr[i] + " ");
            }
        }
        System.out.println();
        for (int i = str.length-1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(str[i] + ", ");
            } else {
                System.out.print(str[i] + " ");
            }
            System.out.println();
        }

    }

    private static void task4() {
        int[] threeDigitArray = new int[3];
        threeDigitArray[0] = 1;
        threeDigitArray[1] = 2;
        threeDigitArray[2] = 3;
        for (int i = 0; i < threeDigitArray.length; i++) {
            if (threeDigitArray[i]%2!=0){
                threeDigitArray[i]+=1;

            }
            System.out.print(threeDigitArray[i]+" ");
        }
    }

}
