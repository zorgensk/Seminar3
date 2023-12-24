package Task3;

@FunctionalInterface
public interface DataConsumer<T> {
    void consume(T data);
}
