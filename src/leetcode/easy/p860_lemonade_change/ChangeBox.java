package leetcode.easy.p860_lemonade_change;

public class ChangeBox {
    private int fiveDollar = 0;
    private int tenDollar = 0;
    private int twentyDollar = 0;

    public int getFiveDollar() {
        return fiveDollar;
    }

    public void setFiveDollar() {
        this.fiveDollar += 1;
    }

    public void setFiveDollar(int pay) {
        this.fiveDollar -= pay;
    }

    public int getTenDollar() {
        return tenDollar;
    }

    public void setTenDollar() {
        this.tenDollar += 1;
    }

    public void setTenDollar(int pay) {
        this.tenDollar -= pay;
    }


    public int getTwentyDollar() {
        return twentyDollar;
    }

    public void setTwentyDollar() {
        this.twentyDollar += 1;
    }


}
