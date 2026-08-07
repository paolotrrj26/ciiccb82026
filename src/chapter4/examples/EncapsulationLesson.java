package chapter4.examples;

public class EncapsulationLesson {
    public static void main(String[] args) {
        Swan mother = new Swan();
        // mother.numberEggs = 31;
        mother.setNumberEggs(31);
        System.out.println(mother.getNumberEggs());
        EVehicle sealion = new EVehicle("SeaLion", 1235412, 2_500_000.00, 6, 7);
        System.out.println(sealion.getPrice());
        sealion.setPrice(2_900_000);
        System.out.println(sealion.getPrice());
    }
}

class Swan {
    private int numberEggs;

    public int getNumberEggs() {
        return numberEggs;
    }

    public void setNumberEggs(int numberEggs) {
        if(numberEggs >= 0)
            this.numberEggs = numberEggs;
        else
            System.out.println("invalid numberEggs");
    }
}

class EVehicle {
    private String modelName;
    private int modelNumber;
    private double price;
    private int qty;
    private long id;

    public EVehicle(String modelName, int modelNumber, double price, int qty, long id) {
        this.modelName = modelName;
        this.modelNumber = modelNumber;
        this.price = price;
        this.qty = qty;
        this.id = id;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setPrice(double price) throws RuntimeException {
        try {
            if(price < 1_000_000) {
                throw new RuntimeException();
            }
            this.price = price;
        } catch(RuntimeException e) {
            System.out.println("Ivalid amount for an EVehicle");
            System.exit(0);
        }
    }

    public double getPrice() {
        return price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getQty() {
        return qty;
    }

    public long getId() {
        return id;
    }
}