package Day10;

public class TwodArraySame {
    public static void main(String[] args) {
        int[][] twoDarray = {{1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}};

        int[][] check = {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};

        for (int row = 0; row < twoDarray.length; row++) {
            for (int col = 0; col < twoDarray[row].length; col++) {
                if(twoDarray[row][col] != check[row][col]){
                    System.out.println("The Two arrays are not same");
                }
                else {
                    System.out.println("Both arrays are same");
                }
            }
        }
    }
}
