package module9.hashMap;

public class Tests {
    public static void main(String[] args) {
       MyHashMap<Integer, Integer> myMap = new MyHashMap<>();
       myMap.put(1, 101);
       myMap.put(2, 102);
       myMap.put(3, 103);
       System.out.println(myMap);
       System.out.println(myMap.size());
       myMap.put(1, 201);
       System.out.println(myMap);
       System.out.println(myMap.size());
       myMap.put(3, 203);
       System.out.println(myMap);
       System.out.println(myMap.size());
       System.out.println(myMap.get(2));
       myMap.remove(2);
       System.out.println(myMap);
       System.out.println(myMap.size());
       myMap.clear();
       System.out.println(myMap);
       System.out.println(myMap.size());
    }
}
