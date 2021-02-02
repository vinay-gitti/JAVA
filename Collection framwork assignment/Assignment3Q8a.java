package JavaFiles;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Assignment3Q8a {
    public static void failFast(Map<String, String> cityCode)
    {
        Iterator iterator = cityCode.keySet().iterator(); 
  
        while (iterator.hasNext()) { 
            System.out.println(cityCode.get(iterator.next())); 
            cityCode.put("Istanbul", "Turkey");
        }
    }
    public static void main(String[] args) 
    {
    	Map<String, String> cityCode = new HashMap<String, String>(); 
        cityCode.put("Delhi", "India"); 
        cityCode.put("Moscow", "Russia"); 
        cityCode.put("New York", "USA"); 
        failFast(cityCode);
    }
}