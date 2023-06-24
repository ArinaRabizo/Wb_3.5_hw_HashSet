public class Main {
    public static void main(String[] args) {
        MyHashSet<String> Strs = new MyHashSet<>();
        Strs.put("A");
        Strs.put("E");
        Strs.put("F");
        Strs.put("B");
        Strs.put("C");
        Strs.put("D");
        Strs.put("A");
        Strs.remove("C");
        System.out.println(Strs.containsElement("A"));
        Strs.printMap();

    }
}