package com.company;

public class Item {

    public Item(String itemString) {
        this.itemString = itemString;
    }

    String itemString;
    int superIpadCount = 0;
    int macbookProCount = 0;
    int appleTvCount = 0;
    int vgaAdapterCount = 0;
    double superIpadPrice = 549.99;
    double macbookProPrice = 1399.99;
    double appleTvPrice = 109.5;
    double vgaAdapterPrice = 30.00;

    public void itemCount() {
        String[] values = this.itemString.split(",");
        for (int i = 0; i < values.length; i++) {
            switch (values[i].trim()) {
                case "ipd":
                    superIpadCount++;
                    break;
                case "mbp":
                    macbookProCount++;
                    break;
                case "atv":
                    appleTvCount++;
                    break;
                case "vga":
                    vgaAdapterCount++;
                    break;
                default:
                    System.out.println("undefined item" + values[i]);
            }
        }

    }

    public void getPromotion() {

        if (this.appleTvCount % 3 == 0) {
            int count = this.appleTvCount;
            this.appleTvCount = count / 3 * 2 + (count % 3);
        }

        if (this.superIpadCount > 4) {
            this.superIpadPrice = 499.99;
        }

        this.vgaAdapterCount = Math.abs(this.macbookProCount - this.vgaAdapterCount);
    }

    public double calculateTotalPrice() {
        this.itemCount();
        this.getPromotion();
        double totalPrice = 0.00;

        if (appleTvCount > 0) {
            totalPrice += this.appleTvCount * this.appleTvPrice;
        }

        if (superIpadCount > 0) {
            totalPrice += this.superIpadCount * this.superIpadPrice;
        }

        if (macbookProCount > 0) {
            totalPrice += this.macbookProCount * this.macbookProPrice;
        }

        if (vgaAdapterCount > 0) {
            totalPrice += this.vgaAdapterCount * this.vgaAdapterPrice;
        }

        return totalPrice;
    }
}
