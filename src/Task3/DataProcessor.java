package Task3;
import java.util.ArrayList;
import java.util.List;

public class DataProcessor<T> {
    private List<T> dataList = new ArrayList<>();

    public void addData(T data) {
        dataList.add(data);
    }

    public void process(DataFilter<T> filter, DataTransformer<T> transformer, DataConsumer<T> consumer) {
        for (T data : dataList) {
            if (filter.filter(data)) {
                T transformedData = transformer.transform(data);
                consumer.consume(transformedData);
            }
        }
    }
}