package vo;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
public class IndicatorsTransferObject {
    private double RSI;

    private double MACD12;
    private double MACD24;

    private double STOCHK;
    private double STOCHD;

    private double SMA200;
    private double SMA99;
    private double SMA60;
    private double SMA50;
    private double SMA30;
    private double SMA15;
    private double SMA10;

    private double WMA200;
    private double WMA99;
    private double WMA60;
    private double WMA50;
    private double WMA30;
    private double WMA15;
    private double WMA10;

    private double EMA200;
    private double EMA99;
    private double EMA60;
    private double EMA50;
    private double EMA30;
    private double EMA15;
    private double EMA10;

    private double MMA;
    private double CCI;
    private double ADX;
    private double AROONUP;
    private double AROONDOWN;

    private double PSAR;
    private double STOCHRSI;
    private double VWAP;

    private double ATR;
    private double DPO;
    private double WILLR;
    private double MI;

    private double CMO;
    private double ROC;
    private double RAVI;

    @Override
    public String toString() {
        return "vo.IndicatorsTransferObject{" +
                "RSI=" + RSI +
                ", MACD12=" + MACD12 +
                ", MACD24=" + MACD24 +
                ", STOCHK=" + STOCHK +
                ", STOCHD=" + STOCHD +
                ", SMA200=" + SMA200 +
                ", SMA99=" + SMA99 +
                ", SMA60=" + SMA60 +
                ", SMA50=" + SMA50 +
                ", SMA30=" + SMA30 +
                ", SMA15=" + SMA15 +
                ", SMA10=" + SMA10 +
                ", WMA200=" + WMA200 +
                ", WMA99=" + WMA99 +
                ", WMA60=" + WMA60 +
                ", WMA50=" + WMA50 +
                ", WMA30=" + WMA30 +
                ", WMA15=" + WMA15 +
                ", WMA10=" + WMA10 +
                ", EMA200=" + EMA200 +
                ", EMA99=" + EMA99 +
                ", EMA60=" + EMA60 +
                ", EMA50=" + EMA50 +
                ", EMA30=" + EMA30 +
                ", EMA15=" + EMA15 +
                ", EMA10=" + EMA10 +
                ", MMA=" + MMA +
                ", CCI=" + CCI +
                ", ADX=" + ADX +
                ", AROONUP=" + AROONUP +
                ", AROONDOWN=" + AROONDOWN +
                ", PSAR=" + PSAR +
                ", STOCHRSI=" + STOCHRSI +
                ", VWAP=" + VWAP +
                ", ATR=" + ATR +
                ", DPO=" + DPO +
                ", WILLR=" + WILLR +
                ", MI=" + MI +
                ", CMO=" + CMO +
                ", ROC=" + ROC +
                ", RAVI=" + RAVI +
                '}';
    }

    public double[] getIndicatorValues() {
        return new double[]{
                RSI,

                MACD12,
                MACD24,

                STOCHK,
                STOCHD,

                CCI,
                ADX,
                AROONUP,
                AROONDOWN,
                STOCHRSI,

                ATR,
                DPO,
                WILLR,
                MI,

                CMO,
                ROC,
                RAVI
        };
    }

    public double[] getMovingAverageValues() {
        return new double[]{
                SMA200,
                SMA99,
                SMA60,
                SMA50,
                SMA30,
                SMA15,
                SMA10,

                WMA200,
                WMA99,
                WMA60,
                WMA50,
                WMA30,
                WMA15,
                WMA10,

                EMA200,
                EMA99,
                EMA60,
                EMA50,
                EMA30,
                EMA15,
                EMA10,

                MMA,
                PSAR,
                VWAP
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IndicatorsTransferObject that)) return false;
        return Double.compare(getRSI(), that.getRSI()) == 0 && Double.compare(getMACD12(), that.getMACD12()) == 0 && Double.compare(getMACD24(), that.getMACD24()) == 0 && Double.compare(getSTOCHK(), that.getSTOCHK()) == 0 && Double.compare(getSTOCHD(), that.getSTOCHD()) == 0 && Double.compare(getSMA200(), that.getSMA200()) == 0 && Double.compare(getSMA99(), that.getSMA99()) == 0 && Double.compare(getSMA60(), that.getSMA60()) == 0 && Double.compare(getSMA50(), that.getSMA50()) == 0 && Double.compare(getSMA30(), that.getSMA30()) == 0 && Double.compare(getSMA15(), that.getSMA15()) == 0 && Double.compare(getSMA10(), that.getSMA10()) == 0 && Double.compare(getWMA200(), that.getWMA200()) == 0 && Double.compare(getWMA99(), that.getWMA99()) == 0 && Double.compare(getWMA60(), that.getWMA60()) == 0 && Double.compare(getWMA50(), that.getWMA50()) == 0 && Double.compare(getWMA30(), that.getWMA30()) == 0 && Double.compare(getWMA15(), that.getWMA15()) == 0 && Double.compare(getWMA10(), that.getWMA10()) == 0 && Double.compare(getEMA200(), that.getEMA200()) == 0 && Double.compare(getEMA99(), that.getEMA99()) == 0 && Double.compare(getEMA60(), that.getEMA60()) == 0 && Double.compare(getEMA50(), that.getEMA50()) == 0 && Double.compare(getEMA30(), that.getEMA30()) == 0 && Double.compare(getEMA15(), that.getEMA15()) == 0 && Double.compare(getEMA10(), that.getEMA10()) == 0 && Double.compare(getMMA(), that.getMMA()) == 0 && Double.compare(getCCI(), that.getCCI()) == 0 && Double.compare(getADX(), that.getADX()) == 0 && Double.compare(getAROONUP(), that.getAROONUP()) == 0 && Double.compare(getAROONDOWN(), that.getAROONDOWN()) == 0 && Double.compare(getPSAR(), that.getPSAR()) == 0 && Double.compare(getSTOCHRSI(), that.getSTOCHRSI()) == 0 && Double.compare(getVWAP(), that.getVWAP()) == 0 && Double.compare(getATR(), that.getATR()) == 0 && Double.compare(getDPO(), that.getDPO()) == 0 && Double.compare(getWILLR(), that.getWILLR()) == 0 && Double.compare(getMI(), that.getMI()) == 0 && Double.compare(getCMO(), that.getCMO()) == 0 && Double.compare(getROC(), that.getROC()) == 0 && Double.compare(getRAVI(), that.getRAVI()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRSI(), getMACD12(), getMACD24(), getSTOCHK(), getSTOCHD(), getSMA200(), getSMA99(), getSMA60(), getSMA50(), getSMA30(), getSMA15(), getSMA10(), getWMA200(), getWMA99(), getWMA60(), getWMA50(), getWMA30(), getWMA15(), getWMA10(), getEMA200(), getEMA99(), getEMA60(), getEMA50(), getEMA30(), getEMA15(), getEMA10(), getMMA(), getCCI(), getADX(), getAROONUP(), getAROONDOWN(), getPSAR(), getSTOCHRSI(), getVWAP(), getATR(), getDPO(), getWILLR(), getMI(), getCMO(), getROC(), getRAVI());
    }
}
