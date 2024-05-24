import java.util.ArrayList;
import java.util.Arrays;

/**This code demonstrates the conceptual differences
 * between the objects that are arrays and array lists
 * via different use cases
 */

public class DiscussionThree {
    public static void main(String[] args) {

        //PART ONE
        //Code of creating an array that's too small for a set of data
        double[] array = new double[3];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = i;
        }
        System.out.print("ADDING TO AN ARRAY VS ARRAY LIST");
        System.out.println("Initial Array: " + Arrays.toString(array));

        //if I just try to assign to a length greater than the size it doesn't work as the error code is displayed when run
        try{
            array[3] = 3.0;
        }
        catch(Exception e){
            System.out.println("Error: Couldn't add 3 to a fourth sot in the array");
        }

        //Process of adding one more element to array
        double[] array2 = Arrays.copyOf(array, array.length + 1); //Creates a copy of previous array
        array2[3] = 3.0;//SETS new spot to desired variable

        System.out.println("Expanded Array: " + Arrays.toString(array2)); //Now my goal works
        System.out.println();


        //Now we will compare this to creating a list and adding a variable
        ArrayList<Double> list = new ArrayList<Double>();
        list.add(0.0);
        list.add(1.0);
        list.add(2.0);
        System.out.println("Initial List: " + list.toString());

        //Process of adding one more element to list
        list.add(3.0);

        System.out.print("Expanded List: " + list.toString());
        System.out.println();

        //As one can see above, adding to a list not only takes on instead of two lines of code,
        //but is far easier to read as "add(NEW_VALUE) is a lot more intuitive than array2[position] = NEW_VALUE

        //PART TWO

        //Now let's see the difference between the process of displaying a table chart
        System.out.println("DISPLAYING A TABLE CHART WITH AN ARRAY AND LIST");

        //ARRAY MULTIPLICATION TABLE Initialtization
        int[][] arrayTable = new int[3][3];


        System.out.println();
        System.out.println("INITIAL ARRAY TABLE");

        //This code creates and displays the initial table.
        //With a nested for loop and the [][] coordinates it makes it as intuitive as possible to chart out a table
        //And the corresponding numbers
        for(int i = 0; i < arrayTable.length; i++){
            for(int j = 0; j < arrayTable[i].length; j++){
                arrayTable[i][j] = i + j;
                System.out.print(arrayTable[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("CHANGED ARRAY TABLE");

        arrayTable[1][1] =  9;//Here is the way to change a specific element in the array table
                                //While it isn't as nice as typing "add()" one can easily see
                                //where the coordinate and the new element will be

        for(int i = 0; i < arrayTable.length; i++){
            for(int j = 0; j < arrayTable[i].length; j++){
                System.out.print(arrayTable[i][j] + " ");
            }
            System.out.println();
        }

        //DISPLAYING TABLE WITH A LIST
        System.out.println();
        System.out.println("INITIAL LIST TABLE");

        //The only way to do so with lists is to create a new list for each row or column and loop through each one
        ArrayList<Integer> listRow1 = new ArrayList<>();
        ArrayList<Integer> listRow2 = new ArrayList<>();
        ArrayList<Integer> listRow3 = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            listRow1.add(i);
            System.out.print(listRow1.get(i) + " ");
        }
        System.out.println();
        for(int i = 0; i < 3; i++){
            listRow2.add(i+1);
            System.out.print(listRow2.get(i) + " ");
        }
        System.out.println();
        for(int i = 0; i < 3; i++){
            listRow3.add(i+2);
            System.out.print(listRow3.get(i) + " ");
        }


        System.out.println();
        System.out.println("CHANGED LIST TABLE");

        listRow2.set(1, 9);//This is where I change an element in a list. As one can see, not having the "[][]" form
                            //makes it less easy to understand where the element is changing and even
                            //which the new element is going to be compared to "= NEW ELEMENT "


        for(int i = 0; i < 3; i++){
            System.out.print(listRow1.get(i) + " ");
        }
        System.out.println();
        for(int i = 0; i < 3; i++){
            System.out.print(listRow2.get(i) + " ");
        }
        System.out.println();
        for(int i = 0; i < 3; i++){
            System.out.print(listRow3.get(i) + " ");
        }

        //THE OUTPUTS DISPLAYED ON THE TERMINAL WILL SHOW THAT DESPITE THE SAME RESULTS, EACH HAS THEIR OWN CASES
        //IN WHICH A PROGRAMMER WILL BENEFIT MORE FROM A SPECIFIC OPTION
    }
}