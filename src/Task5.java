import java.util.Arrays;

public class Task5 {


    public static void main(String[] args){


        int[] elements = new int[] {1,0,2,0,3,0};

        int lastIndex = elements.length-1;

        // loop backwards looking for zeroes
        for(int i = lastIndex; i >=0; i--) {
            if(elements[i] == 0) {
                // found a zero, so loop forwards from here
                for(int j = i; j < lastIndex; j++) {
                    if(elements[j+1] == 0 || j == lastIndex) {
                        // either at the end of the array, or we've run into another zero near the end
                        break;
                    }
                    else {
                        // bubble up the zero we found one element at a time to push it to the end
                        int temp = elements[j+1];
                        elements[j+1] = elements[j];
                        elements[j] = temp;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(elements));
    }
}
