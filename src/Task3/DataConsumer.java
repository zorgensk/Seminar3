package Task3;

@FunctionalInterface
public interface DataConsume<T> {
    void consume(T data);
}
