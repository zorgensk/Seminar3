package Task3;

@FunctionalInterface
interface DataTransformer<T> {
    T transform(T data);
}

