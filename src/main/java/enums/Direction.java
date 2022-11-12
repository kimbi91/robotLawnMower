package enums;

public enum Direction {

    NORTH(1),
    SOUTH(2),
    EAST(3),
    WEST(4);

    public final int code;

    Direction(int code) {
        this.code = code;
    }

    public String getName() {
        return this.name().toLowerCase();
    }
}
