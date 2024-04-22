package vo;

import lombok.Getter;

import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class FundingHistoryObject {
    @Getter
    private final TreeMap<Date, Double> map;

    public FundingHistoryObject(TreeMap<Date, Double> map) {
        this.map = map;
    }

    public double getValueForNearestDate(Date targetDate) {
        Map.Entry<Date, Double> entry = map.floorEntry(targetDate);
        return entry.getValue();
    }

    public double getFirst() {
        return map.firstEntry().getValue();
    }
}
