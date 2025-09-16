package top.ldj.boot.config.enums;

/**
 * @Author: lenovo
 * @Date: 2025/9/12
 * @Version: 1.0
 */
public enum DrinkType {
    TEA("茶", 10.0),
    COFFEE("咖啡", 12.0),
    BEER("啤酒",10.0);

    private final String label;
    private final double price;

    DrinkType(String label, double price) {
        this.label = label;
        this.price = price;
    }

    public String getLabel() {
        return label;
    }

    public double getPrice() {
        return price;
    }
}
