package edu.uic.cs454.s22.a5;

import java.util.Objects;

public final class Action<T> {
    public enum Direction { SAMPLED , MOVED_OUT, MOVED_IN, POSITIVE , NEGATIVE , INVALID }

    private final Direction direction;
    private final T t;

    public Action(Direction direction, T t) {
        this.direction = direction;
        this.t = t;
    }

    public T get() {
        return this.t;
    }

    public Direction getDirection() {
        return this.direction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Action<?> action = (Action<?>) o;
        return direction == action.direction &&
                Objects.equals(t, action.t);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direction, t);
    }

    @Override
    public String toString() {
        return "{" + direction + " - " + t + '}';
    }
}
