package JavaFiles;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Assignment4Q5 {
    List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

    public static void main(String[] args) {
    	Consumer<String> consumer = item -> System.out.println(item);
    	consumer.accept(processWords(new Assignment4Q5().list));
    }

    public static String processWords(List<String> list) {
    	StringBuffer sb = new StringBuffer("");
    	list.forEach(item -> sb.append(item.charAt(0)));
    	return sb.toString();
    }
}
