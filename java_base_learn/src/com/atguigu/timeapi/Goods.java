package com.atguigu.timeapi;

/**
 * @author liweiliang
 * @description 商品类
 * @create 2022-10-05 11:21
 */
public class Goods implements Comparable{

    private String name;
    private double price;

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Goods() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Goods) {
            Goods goods = (Goods) o;
            return Double.compare(this.price,goods.price);
        }
        throw new RuntimeException("传入的类型不一致");
    }
}