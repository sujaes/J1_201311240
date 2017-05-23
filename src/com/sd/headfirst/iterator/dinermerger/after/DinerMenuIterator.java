package com.sd.headfirst.iterator.dinermerger.after;
public class DinerMenuIterator implements Iterator {
    MenuItem[] menuitems;
    int position = 0;

    public DinerMenuIterator(MenuItem[] menuitems) {
        this.menuitems = menuitems;
    }
 
    public Object next() {
        MenuItem menuItem = menuitems[position];
        position = position + 1;
        return menuItem;
    }
    public boolean hasNext() {
        if (position >= menuitems.length || menuitems[position] == null) {
            return false;
        } else {
            return true;
        }
    }
}