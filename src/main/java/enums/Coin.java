package enums;

import lombok.Getter;

@Getter
public enum Coin {
    BTCUSDT("BTCUSDT"),
    ETHUSDT("ETHUSDT"),
    BTCDOMUSDT("BTCDOMUSDT");

    private final String name;

    Coin(String name) {
        this.name = name;
    }
}
