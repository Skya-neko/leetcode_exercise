package leetcode.easy.p860_lemonade_change;

public class Cashier {
    private final int fiveDollarValue = 5;
    private final int tenDollarValue = 10;

    public void getMoney(int payed, ChangeBox changeBox) {
        if (payed == 5)
            changeBox.setFiveDollar();
        if (payed == 10)
            changeBox.setTenDollar();
        if (payed == 20)
            changeBox.setTwentyDollar();
    }

    public int getMoneyToGiveBack(int payed) {
        return payed - 5;
    }

    public boolean canMakeChange(int payed, ChangeBox changeBox) {
        int totalReturn = getMoneyToGiveBack(payed);

        int returnTenDollar = totalReturn / tenDollarValue;
        if (changeBox.getTenDollar() - returnTenDollar >= 0) {
            changeBox.setTenDollar(returnTenDollar);
            totalReturn -= returnTenDollar * tenDollarValue;
        }

        int returnFiveDollar = totalReturn / fiveDollarValue;
        if (changeBox.getFiveDollar() - returnFiveDollar >= 0) {
            changeBox.setFiveDollar(returnFiveDollar);
            totalReturn -= returnFiveDollar * fiveDollarValue;
        }

        if (totalReturn == 0)
            getMoney(payed, changeBox);
        return totalReturn == 0;

    }

}
