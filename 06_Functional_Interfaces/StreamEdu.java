/**
 * Материалы:
 * https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html
 * https://www.mkyong.com/java8/java-8-convert-a-stream-to-list/
 */

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamEdu {

    public long streamToCount() {
        Stream<String> language = Stream.of("java", "python", "node", "cpp", "scala", "javascript");
        return language.filter(sz -> sz.length() > 3).count();
    }

    public List streamToList() {
        Stream<String> language = Stream.of("java", "python", "node", "cpp", "scala", "javascript");
        return language.map(sz -> sz.length()).collect(Collectors.toList());
    }


}