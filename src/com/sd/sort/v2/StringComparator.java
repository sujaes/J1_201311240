package com.sd.sort.v2;
import java.util.Date;
import com.sd.turtle.WeightTurtle;

public class StringComparator implements Comparator {
    public StringComparator() {}
    public int compare(Object o1, Object o2) {
        String s1=(String)o1;
        String s2=(String)o2;
        return s1.compareTo(s2);
        //return Integer.parseInt((String) o1) -
        //   Integer.parseInt((String) o2);
    }
}