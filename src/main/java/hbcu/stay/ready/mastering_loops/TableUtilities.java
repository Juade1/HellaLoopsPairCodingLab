package hbcu.stay.ready.mastering_loops;

public class TableUtilities {
    //method header, returns string, accepts nothing.., basing output on test case
    public static String getSmallMultiplicationTable() {
        //init empty string 
        String getSmall = "";
        //loop for 5 times inclusively starting at 1
        for( int i = 1; i <= 5; i++){
            //for every loop we're adding a new row
            int length = 5;
            getSmall += buildTableRow(i,length)+ "\n";

        }
        return getSmall;
    }



    private static String buildTableRow(int i, int length){
        String rowBuild = "";
        for(int x = 1; x <= length; x++){
            int number = x * i;
            rowBuild += String.format("%3d |", number);
        }
        return rowBuild;
    } 
    

    public static String getLargeMultiplicationTable() {
        String getLarge = "";
        for( int i = 1; i <= 10; i++){
            int length = 10;
            getLarge += buildTableRow(i,length)+ "\n";
        }

        return getLarge;
    }

    public static String getMultiplicationTable(int tableSize) {
        String getMultiplication = "";
        for( int i = 1; i <= 20; i++){
            int length = 20;
            getMultiplication += buildTableRow(i,length)+ "\n";
        }
        
        return getMultiplication;
    }
}

