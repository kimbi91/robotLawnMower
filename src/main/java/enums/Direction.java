package enums;

public enum Direction {

    UP(1),
    DOWN(2),
    RIGHT(3),
    LEFT(4);

    public final int code;

    Direction(int code) {
        this.code = code;
    }

    public String getName() {
        return this.name().toLowerCase();
    }

    public int getCode() {
        return this.code;
    }
}
