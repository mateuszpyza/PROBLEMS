package NumbersDivisiblleByThree;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = NumbersDivisibleByThree.getNumbersDivisibleByThree(-21, 7);
        assert list != null;
        list.forEach(System.out::println);
    }
}
