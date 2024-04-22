import enums.Coin;
import enums.TimeFrame;
import vo.CandleObject;
import vo.OpenInterestHistoryObject;

import java.util.Date;
import java.util.LinkedList;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        LinkedList<CandleObject> candles = BinanceDataUtil.getCandles(Coin.BTCUSDT, TimeFrame.ONE_HOUR, 1500);
        for (CandleObject candle : candles) {
            System.out.println(candle.toString());
        }

        OpenInterestHistoryObject openInterestHistory = BinanceDataUtil.getOpenInterest(Coin.BTCUSDT, TimeFrame.ONE_HOUR);
        for (Map.Entry<Date, Double> entry : openInterestHistory.getMap().entrySet())
            System.out.println(entry.getKey().toString() + "; " + entry.getValue());

        IndicatorsDataUtil util = new IndicatorsDataUtil(candles);
        System.out.println(util.getIndicators(candles.size()-1));
    }

}
