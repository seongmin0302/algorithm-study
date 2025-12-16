package 입문.ch03_정렬_스택과큐_해쉬;

import java.util.ArrayList;
import java.util.List;

public class _09_해쉬 {

    static class LinkedTuple {
        private List<KeyValuePair> items;
        
        public LinkedTuple() {
            this.items = new ArrayList<>();
        }
        
        public void add(String key, Object value) {
            this.items.add(new KeyValuePair(key, value));  
        }
        
        public Object get(String key) {
            for (KeyValuePair pair : items) {
                if (pair.key.equals(key)) {
                    return pair.value;
                }
            }
            return null;
        }
        
        static class KeyValuePair {
            String key;
            Object value;
            
            public KeyValuePair(String key, Object value) {
                this.key = key;
                this.value = value;
            }
        }
    }

    static class Hash {
        private LinkedTuple[] items;
        
        public Hash() {
            this.items = new LinkedTuple[8];
            for (int i = 0; i < 8; i++) {
                this.items[i] = new LinkedTuple();
            }
        }
        
        public void put(String key, Object value) {
            int index = Math.abs(key.hashCode()) % items.length;
            this.items[index].add(key, value);
        }
        
        public Object get(String key) {
            int index = Math.abs(key.hashCode()) % items.length;
            return this.items[index].get(key);
        }
    }

    public static void main(String[] args) {
		System.out.println("사전 테스트 - LinkedTuple test:");
		LinkedTuple linkedTuple = new LinkedTuple();
        linkedTuple.add("333", 7);
        linkedTuple.add("77", 6);
        System.out.println(linkedTuple.get("333"));
        
		System.out.println();
        System.out.println("본격 해시 테스트 - Hash test:");
        Hash myHash = new Hash();
        myHash.put("test", 3);
        myHash.put("333", 7);
        myHash.put("77", 6);
        System.out.println("Hash test1: "+myHash.get("test"));
        
        System.out.println();
        System.out.println("해쉬코드 % 7 의 값이 같을때 test: ");
        System.out.println("23의 해쉬코드 % 7 = "+"23".hashCode()%7); //5
        System.out.println("233343의 해쉬코드 % 7 = "+"233343".hashCode()%7); //5 

        myHash.put("23", 7);
        myHash.put("233343",6);
        System.out.println("Hash test2: "+myHash.get("23"));
        System.out.println("Hash test3: "+myHash.get("233343"));
        
    }
}
