/*
Created by: shepardcmndr
Date: 20.07.2020
Comments:
*/

import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public static void main(String[] args) {

    }

    public String[] firstSwap(String[] strings) {
        Map<String, Integer> point = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String key = String.valueOf(strings[i].charAt(0));
            if (!point.containsKey(key)) {
                point.put(key, i);
            } else if (point.get(key) != -1){
                String s = strings[i];
                strings[i] = strings[point.get(key)];
                strings[point.get(key)] = s;
                point.put(key, -1);
            }
        }
        return strings;
    }

    public String[] allSwap(String[] strings) {
        Map<String, Integer> point = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String key = String.valueOf(strings[i].charAt(0));
            if (!point.containsKey(key)) {
                point.put(key, i);
            } else {
                String s = strings[i];
                strings[i] = strings[point.get(key)];
                strings[point.get(key)] = s;
                point.remove(key);
            }
        }
        return strings;
    }

    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();

        for (String s : strings) {
            if (!map.containsKey(s)) {
                int counter = 0;
                for (String w : strings) {
                    if (w.equals(s)) {
                        counter++;
                    }
                }
                map.put(s, counter >= 2);
            }
        }

        return map;
    }

    public String wordAppend(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        StringBuilder result = new StringBuilder();
        for (String s : strings) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
                if (map.get(s) % 2 == 0) {
                    result.append(s);
                }
            }
        }
        return result.toString();
    }

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();

        for (String s : strings) {
            String start = String.valueOf(s.charAt(0));
            if (!map.containsKey(start)) {
                StringBuilder stringBuilder = new StringBuilder();
                for (String word : strings) {
                    if (word.startsWith(start)) {
                        stringBuilder.append(word);
                    }
                }
                map.put(start, stringBuilder.toString());
            }
        }
        return map;
    }

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (String s : strings) {
            if (!map.containsKey(s)) {
                int counter = 0;
                for (String word : strings) {
                    if (word.equals(s)) {
                        counter++;
                    }
                }
                map.put(s, counter);
                counter = 0;
            }
        }

        return map;
    }

    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();

        for (String s : strings) {
            map.put(String.valueOf(s.charAt(0)),
                    String.valueOf(s.charAt(s.length() - 1)));
        }
        return map;
    }

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (String s : strings) {
            map.put(s, s.length());
        }
        return map;
    }

    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (String s : strings) {
            map.put(s, 0);
        }
        return map;
    }
}
