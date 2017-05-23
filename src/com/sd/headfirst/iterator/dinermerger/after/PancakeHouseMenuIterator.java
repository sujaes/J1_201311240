package com.sd.headfirst.iterator.dinermerger.after;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
    ArrayList menuitems;
    int position = 0;
    public PancakeHouseMenuIterator(ArrayList menuitems) {
        this.menuitems = menuitems;
    }
    public Object next() {
        Object object = menuitems.get(position);
        position = position + 1;
        return object;
    }
    public boolean hasNext() {
        if (position >= menuitems.size()) {
            return false;
        } else {
            return true;
        }
    }
}