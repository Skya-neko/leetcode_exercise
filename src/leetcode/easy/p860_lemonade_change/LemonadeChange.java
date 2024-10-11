package leetcode.easy.p860_lemonade_change;

import java.util.List;

//860. Lemonade Change
public class LemonadeChange {
    public static boolean lemonadeChange(List<Integer> bills) {
        ChangeBox changeBox = new ChangeBox();
        Cashier cashier = new Cashier();
        for (int bill : bills) {
            if (!cashier.canMakeChange(bill, changeBox))
                return false;
        }

        return true;
    }
}


/*Main
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> bills = new ArrayList<>();
//        Collections.addAll(bills, 5, 5, 5, 10, 20);
//        Collections.addAll(bills, 5, 5, 10, 10, 20);
        Collections.addAll(bills, 5, 5, 5, 10, 5, 5, 10, 20, 20, 20);

        System.out.println(LemonadeChange.lemonadeChange(bills));
    }
}

* */

