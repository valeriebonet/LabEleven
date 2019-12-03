//updating
public class Analyzer {

    public static int linearSearch (String[] dataSet, String element){
        //initializing variables
        int s = dataSet.length;
        for (int i = 0; i < s; i++ ){
            if (dataSet[i].equals(element)){
                //return index of element
                return i;
            }
        }
        //element isn't in array so return index of -1 since it isn't found
        return -1;
    }

    public static int binarySearch (String[] dataSet, String element){
        // initializing variables
        int i = 0;
        int s = dataSet.length - 1;
        while (i <= s ){
            //loops through until element is equal to the element
            int middle = (i+s)/2;
            if( dataSet[middle].equals(element)){
                return middle;
            }
            else if( dataSet[middle].compareTo(element) < 0){
                i = middle + 1;
            }
            else if ( dataSet[middle].compareTo(element) > 0){
                s = middle - 1;
            }
        }
        //element isn't in array so return index of -1 since it isn't found
        return -1;

    }

    public static void main (String args []){
        //access the data set
        String [] myArray = StringData.getData();


        //start the first search
        String testRun1 = "not_here" ;
        //get beginning time
        long startTime1L = System.nanoTime();
        //linear search and print linear search time
        linearSearch( myArray, testRun1 );
        long endTime1L = System.nanoTime();
        System.out.println("Run time for the linear search of " + testRun1 + " is: " + (endTime1L - startTime1L) +
                " nanoseconds");
        //get beginning time
        long startTime1B = System.nanoTime();
        //binary search and print binary search time
        binarySearch( myArray, testRun1);
        long endTime1B = System.nanoTime();
        System.out.println("Run time for the binary search of " + testRun1 + " is: " + (endTime1B - startTime1B) +
                " nanoseconds");

        //start the second search
        String testRun2 = "mzzzz" ;
        //get beginning time
        long startTime2L = System.nanoTime();
        //linear search and print linear search time
        linearSearch( myArray, testRun2 );
        long endTime2L = System.nanoTime();
        System.out.println("Run time for the linear search of " + testRun2 + " is: " + (endTime2L - startTime2L) +
                " nanoseconds");
        //get beginning time
        long startTime2B = System.nanoTime();
        //binary search and print binary search time
        binarySearch( myArray, testRun2);
        long endTime2B = System.nanoTime();
        System.out.println("Run time for the binary search of " + testRun2 + " is: " + (endTime2B - startTime2B) +
                " nanoseconds");

        //start the third search
        String testRun3 = "aaaaa" ;
        //get beginning time
        long startTime3L = System.nanoTime();
        //linear search and print linear search time
        linearSearch( myArray, testRun3);
        long endTime3L = System.nanoTime();
        System.out.println("Run time for the linear search of " + testRun3 + " is: " + (endTime3L - startTime3L) +
                " nanoseconds");
        //get beginning time
        long startTime3B = System.nanoTime();
        //binary search and print binary search time
        binarySearch( myArray, testRun3);
        long endTime3B = System.nanoTime();
        System.out.println("Run time for the binary search of " + testRun3 + " is: " + (endTime3B - startTime3B) +
                " nanoseconds");

    }
}


