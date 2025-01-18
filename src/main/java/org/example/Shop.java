package org.example;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    public List<Item> itemList;

    public Shop() {
        itemList = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    public Double calculatePrice() {
        Double priceTotal = 0.0;
        for (Item item : itemList) {
            priceTotal += item.getPrice();
        }
        return priceTotal;
    }
}
