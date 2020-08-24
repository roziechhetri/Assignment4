import java.util.Arrays;

public class Task1 {

    public static void main(String[] args){


        int[] numArr = {1, 1, 1, 6, 7, 7, 9, 9, 10, 10, 23, 56, 56};
        System.out.println("Original Array- " + Arrays.toString(numArr));
        int[] tempArr = findAndRemoveDuplicates(numArr);

        System.out.println("After removing duplicates- " + Arrays.toString(tempArr));
    }

    public static int[] findAndRemoveDuplicates(int[] numArr){
        int i = 1;
        int j = 0;
        while(i < numArr.length){
            if(numArr[i] == numArr[j]){
                i++;
            }else{
                numArr[++j] = numArr[i++];
            }
        }
        //create temp array with reduced size
        int[] tempArray = Arrays.copyOf(numArr, j+1);
        return tempArray;
    }
}
