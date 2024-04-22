package vo;

import lombok.Getter;

import java.util.Date;
import java.util.Objects;

@Getter
public class CandleObject { // формат свічки графіку
    private final Date openTime;
    private final double open;
    private final double high;
    private final double low;
    private final double close;
    private final double volume;
    private final Date closeTime;


    public CandleObject(Date openTime, double open, double high, double low, double close, double volume, Date closeTime) {
        this.openTime = openTime;
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
        this.volume = volume;
        this.closeTime = closeTime;
    }

    @Override
    public String toString() {
        return "\nvo.CandleObject{" +
                "\nopenTime=" + openTime +
                ",\n open=" + open +
                ",\n high=" + high +
                ",\n low=" + low +
                ",\n close=" + close +
                ",\n volume=" + volume +
                ",\n closeTime=" + closeTime +
                "\n}";
    }

    public double[] getValuesArr() {
        return new double[]{
                open,
                high,
                low,
                close,
                volume
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CandleObject that)) return false;
        return Double.compare(getOpen(), that.getOpen()) == 0 && Double.compare(getHigh(), that.getHigh()) == 0 && Double.compare(getLow(), that.getLow()) == 0 && Double.compare(getClose(), that.getClose()) == 0 && Double.compare(getVolume(), that.getVolume()) == 0 && Objects.equals(getOpenTime(), that.getOpenTime()) && Objects.equals(getCloseTime(), that.getCloseTime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOpenTime(), getOpen(), getHigh(), getLow(), getClose(), getVolume(), getCloseTime());
    }
}