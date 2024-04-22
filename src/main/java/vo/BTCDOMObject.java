package vo;

import lombok.Getter;

import java.util.Date;
import java.util.TreeMap;

public class BTCDOMObject {
    @Getter
    private final TreeMap<Date, Double> map;

    public BTCDOMObject(TreeMap<Date, Double> map) {
        this.map = map;
    }

    public double getValueForNearestDate(Date targetDate) {
        return map.get(targetDate);
    }

    public double getFirst() {
        return map.firstEntry().getValue();
    }

    public boolean contains(Date date) {
        return map.containsKey(date);
    }
}
