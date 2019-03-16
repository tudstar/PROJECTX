import static java.lang.System.out;

public class Main {
//    public static void main(String args[])
//    {
//        int counter=0,number=0;
//        while(counter<3)
//        {
//            out.println("number: "+number);
//            number++;
//            if(number>15)
//            {
//                number=0;
//                counter++;
//            }
//        }
//    }
public static void main(String args[]) {
    int[] unidimensionalArray = new int[10];

    for (int i = 1; i < unidimensionalArray.length + 1; i++) {
        unidimensionalArray[i - 1] = i;
    }
    out.print("unidimensional = [");
    for (int i = 0; i < unidimensionalArray.length; i++) {
        String textToPrint = "" + unidimensionalArray[i];
        textToPrint += i == unidimensionalArray.length - 1 ? "" : ", ";
        out.print(textToPrint);
    }
    out.print("]");

    out.println();
    int [][] bidimensional=new int[10][10];
    int valoare=0;
    for (int row = 0; row < unidimensionalArray.length; row++)
    {
        for (int column = 0; column < bidimensional[row].length; column++)
        {
            bidimensional[row][column] = valoare;
            valoare++;
        }
    }

    out.print("multidimensional = [");
    for (int row = 0; row < unidimensionalArray.length; row++)
    {
        for (int column = 0; column < bidimensional[row].length; column++)
        {
            out.print(bidimensional[row][column] + " ");
        }
        out.println();
    }
    out.print("]");
}
}

