/**
 * @author Dm.Petrov
 * DATE: 23.08.2022
 */
public class BinOps {
    public String sum(String a, String b) {
        int oneNumber = Integer.parseInt(a, 2);
        int twoNumber = Integer.parseInt(b, 2);
        int result = oneNumber + twoNumber;
        return Integer.toBinaryString(result);
    }

    public String mult(String a, String b) {
        int oneNumber = Integer.parseInt(a, 2);
        int twoNumber = Integer.parseInt(b, 2);
        int result = oneNumber * twoNumber;
        return Integer.toBinaryString(result);
    }
}

