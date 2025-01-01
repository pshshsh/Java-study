package Collection;

import java.util.HashMap;
import java.util.Map;

public class Col6 {
  public static void main(String[] args) {
    //Map : key - value pair
    //key라는 값으로 unique하게 보장이돼야함
    Map<String, Integer> intMap = new HashMap<>();

    // 키 값
    intMap.put("one", 1);
    intMap.put("two", 2);
    intMap.put("three", 3);
    intMap.put("three", 4);

    for (String key : intMap.keySet()) {
      System.out.println(key);
    }
    for(Integer value: intMap.values()){
      System.out.println(value);
    }
    System.out.println(intMap.get("three"));
  }
}
