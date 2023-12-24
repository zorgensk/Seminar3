package Task3;

public class Main {
    public static void main(String[] args) {
        DataProcessor<Integer> processor = new DataProcessor<>();

        // Добавляем данные
        processor.addData(-3);
        processor.addData(10);
        processor.addData(5);
        processor.addData(-1);

        // Определяем лямбда-выражения
        DataFilter<Integer> positiveFilter = n -> n > 0;
        DataTransformer<Integer> doubler = n -> n * 2;
        DataConsumer<Integer> printer = System.out::println;
//        DataConsumer<Integer> printer = data -> System.out.println(data);
        // Обработка данных
        processor.process(positiveFilter, doubler, printer);
    }
}

