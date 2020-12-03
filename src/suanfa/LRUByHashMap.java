package suanfa;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-11-15
 */
public class LRUByHashMap<K, V> {

    private int cacheSize;
    private LinkedHashMap<K,V> map;

    public LRUByHashMap(int cacheSize1){
        this.cacheSize = cacheSize1;
        map = new LinkedHashMap<K,V>(){
            private static final long serialVersionID = 1L;

            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return super.removeEldestEntry(eldest);
            }
        };
    }

    public synchronized int getCurrentSize() {
        return map.size();
    }

    public synchronized void put(K k, V v) {
        if (k == null) {

        }
        map.put(k, v);
    }

    public synchronized Collection<V> getCollection() {
        if (map != null) {
            return map.values();
        }else {
            return null;
        }
    }

        public static void main(String[] args) {
        // 测试
        LRUByHashMap<Integer, String> maps = new LRUByHashMap<Integer, String>(
                3);
        maps.put(1, "1");
        maps.put(2, "2");
        maps.put(3, "3");
        maps.put(4, "4");
        maps.put(5, "5");
        maps.put(6, "6");
        maps.put(6, "7");
        maps.put(6, "8");
        maps.put(6, "9");
        Collection<String> col = maps.getCollection();
        System.out.println("存入缓存中的数据是--->>" + col.toString());
    }







































//    /*
//     * 通过LinkHashMap简单实现LRU算法
//     */
//    /**
//     * 缓存大小
//     */
//    private int cacheSize;
//
//    private LinkedHashMap<K, V> maps;
//
//    public LRUByHashMap(int cacheSize1) {
//        this.cacheSize = cacheSize1;
//        maps = new LinkedHashMap<K, V>() {
//            /**
//             *
//             */
//            private static final long serialVersionUID = 1;
//
//            // 这里移除旧的缓存数据
//            @Override
//            protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
//                // 当超过缓存数量的时候就将旧的数据移除
//                return getCurrentSize() > LRUByHashMap.this.cacheSize;
//            }
//        };
//    }
//
//    public synchronized int getCurrentSize() {
//        return maps.size();
//    }
//
//    public synchronized void put(K k, V v) {
//        if (k == null) {
//            throw new Error("存入的键值不能为空");
//        }
//        maps.put(k, v);
//    }
//    // 获取集合
//    public synchronized Collection<V> getCollection() {
//        if (maps != null) {
//            return maps.values();
//        } else {
//            return null;
//        }
//    }
//
//
//
//    public static void main(String[] args) {
//        // 测试
//        LRUByHashMap<Integer, String> maps = new LRUByHashMap<Integer, String>(
//                3);
//        maps.put(1, "1");
//        maps.put(2, "2");
//        maps.put(3, "3");
//        maps.put(4, "4");
//        maps.put(5, "5");
//        maps.put(6, "6");
//        maps.put(6, "7");
//        maps.put(6, "8");
//        maps.put(6, "9");
//        Collection<String> col = maps.getCollection();
//        System.out.println("存入缓存中的数据是--->>" + col.toString());
//    }
}