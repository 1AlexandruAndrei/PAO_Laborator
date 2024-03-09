import java.util.HashMap;

public class DataStorage {
    private static HashMap<String, POJO> storage = new HashMap<>();

    public static void put(String username, POJO obj) {
        storage.put(username, obj);
    }

    public static void remove(String username) {
        storage.remove(username);
    }

    public static POJO get(String username) {
        return storage.get(username);
    }
}
