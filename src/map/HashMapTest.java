package map;

public class HashMapTest {

    public static void test() {
        putTest();
        getTest();
        removeTest();
    }

    public static void putTest() {
        System.out.println("--- Put Test ---");
        HashMap<String, String> hashMap = new HashMap<>();
        System.out.println("Before: " + hashMap);

        String[] keys = {"key1", "key2", "key3", "key1"};

        for (int i = 0; i < keys.length; i++) {
            String key = keys[i];
            String value = "value" + (i + 1);

            System.out.print("Adding " + value + " to " + key + " -> ");
            hashMap.put(key, value);
            System.out.println("After: " + hashMap);
        }

        System.out.println("After: " + hashMap);
        System.out.println();
    }

    public static void getTest() {
        System.out.println("--- Get Test ---");
        HashMap<String, String> hashMap = new HashMap<>();
        String[] keys = {"key1", "key2", "key3"};

        for (int i = 0; i < keys.length; i++) {
            hashMap.put(keys[i], "value" + (i + 1));
        }

        System.out.println("Before: " + hashMap);

        for (String key : keys) {
            System.out.println("Key: " + key + " Value: " + hashMap.get(key));
        }

        System.out.println();
    }

    public static void removeTest() {
        System.out.println("--- Put Test ---");
        HashMap<String, String> hashMap = new HashMap<>();
        String[] keys = {"key1", "key2", "key3"};

        for (int i = 0; i < keys.length; i++) {
            hashMap.put(keys[i], "value" + (i + 1));
        }

        System.out.println("Before: " + hashMap);

        for (String key : keys) {
            System.out.print("Removing " + key + " -> ");
            hashMap.remove(key);
            System.out.println("After: " + hashMap);
        }

        System.out.println();
    }

    public static void main(String[] args) {
        test();
    }
}
