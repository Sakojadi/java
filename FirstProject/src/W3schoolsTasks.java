import com.sun.source.tree.Tree;

import java.util.*;

public class W3schoolsTasks {
    public static void main(String[] args) {
        //ArrayLists
        System.out.println("ArrayLists");
        //12. Write a Java program to extract a portion of an array list.
        ArrayList<String> ar = new ArrayList<>(Arrays.asList("Banana", "Pineaple", "Apple", "Lol"));
        System.out.println(ar.subList(0,3));

        //16. Write a Java program to clone an array list to another array list.
        ArrayList<String> arCopy= new ArrayList<String>();
        arCopy.addAll(ar);
        System.out.println(arCopy);

        //17. Write a Java program to empty an array list.
        ar.clear();
        System.out.println(ar);

        //18. Write a Java program to test whether an array list is empty or not.
        System.out.println(ar.isEmpty());

        //21. Write a Java program to replace the second element of an ArrayList with the specified element.
        ar = new ArrayList<>(Arrays.asList("Banana", "Pineaple", "Apple", "Lol"));
        ar.set(2, "Banana2");
        System.out.println(ar);

        //22. Write a Java program to print all the elements of an ArrayList using the elements' position.
        ar = new ArrayList<>(Arrays.asList("Banana", "Pineaple", "Apple", "Lol"));
        for(int i =0; i<ar.size(); i++){
            System.out.println(ar.get(i));
        }

        //LinkedList
        System.out.println("LinkedList");
        //15. Write a Java program that swaps two elements in a linked list.
        LinkedList<String> ls = new LinkedList<>(Arrays.asList("Banana", "Pineaple", "Apple", "Lol"));
        String ind1 = ls.get(1);
        String ind2 = ls.get(2);
        ls.set(1, ind2);
        ls.set(2,ind1);
        System.out.println(ls);

        //16. Write a Java program to shuffle elements in a linked list.
        ls = new LinkedList<>(Arrays.asList("Banana", "Pineaple", "Apple", "Lol"));
        Collections.shuffle(ls);
        System.out.println("Shuffle:" + ls);

        //19. Write a Java program to remove and return the first element of a linked list.
        ls = new LinkedList<>(Arrays.asList("Banana", "Pineaple", "Apple", "Lol"));
        System.out.println(ls.pollFirst());
        System.out.println(ls);

        //20. Write a Java program to retrieve, but not remove, the first element of a linked list.
        ls = new LinkedList<>(Arrays.asList("Banana", "Pineaple", "Apple", "Lol"));
        System.out.println(ls.peek());

        //24. Write a Java program to compare two linked lists.
        ls = new LinkedList<>(Arrays.asList("Banana", "Pineaple", "Apple", "Lol"));
        LinkedList<String> ls2 = new LinkedList<>(Arrays.asList("Banana", "Pineaple", "Apple", "Lol"));
        for(String s: ls){
            if(!ls2.contains(s)){
                System.out.println(s+ "Not same");
            }else System.out.println(s+ "Same");
        }

        //26. Write a Java program to replace an element in a linked list.
        ls = new LinkedList<>(Arrays.asList("Banana", "Pineaple", "Apple", "Lol"));
        ls.set(2, "Replaced");
        System.out.println(ls);

        //HashSet
        System.out.println("HashSet");
        //7. Write a Java program to convert a hash set to an array.
        HashSet<String> hs = new HashSet<>(Arrays.asList("Banana", "Pineaple", "Apple", "Lol"));
        String[] array = new String[hs.size()];
        hs.toArray(array);
        System.out.println(Arrays.toString(array));

        //8. Write a Java program to convert a hash set to a tree set.
        hs = new HashSet<>(Arrays.asList("Banana", "Pineaple", "Apple", "Lol"));
        TreeSet<String> ts = new TreeSet<>(hs);
        System.out.println("New treeset: " + ts);

        //9. Write a Java program to find numbers less than 7 in a tree set.
        TreeSet<Integer> tsint = new TreeSet<>(Arrays.asList(1,6,88,5,66,3));
        tsint.forEach(i->{
            if(i<7) System.out.println("Integer less than 7: " + i);
        });

        //10. Write a Java program to compare two hash set.
        HashSet<String> hs1 = new HashSet<>(Arrays.asList("Banana", "Pineaple", "Apple", "Lol", "yay" ));
        HashSet<String> hs2 = new HashSet<>(Arrays.asList("Banana", "Pineaple", "Apple", "Lol", "yay" ));
        hs2.forEach(w-> {
            if(hs1.contains(w)) System.out.println(w+ " Same");
            else System.out.println(w+ "Not same");
        });

        //11. Write a Java program to compare two sets and retain elements that are the same.
        hs = new HashSet<>(Arrays.asList("Banana", "Pineaple", "Apple", "Lol", "yay" ));
        hs2 = new HashSet<>(Arrays.asList("Banana", "Pineaple", "Apple", "yay"));
        HashSet<String> hs3 = new HashSet<>();
        hs2.retainAll(hs);
        System.out.println(hs2);

        //12. Write a Java program to remove all elements from a hash set.
        hs2 = new HashSet<>(Arrays.asList("Banana", "Pineaple", "Apple", "yay"));
        hs2.clear();
        System.out.println(hs2);

        //TreeSet
        System.out.println("TreeSet");
        //11. Write a Java program to get the element in a tree set less than or equal to the given element.
        TreeSet<Integer> treeset = new TreeSet<>(Arrays.asList(2,7,55,4,56));
        System.out.println("Less than or equal the given element: "+ treeset.floor(5));

        //12. Write a Java program to get the element in a tree set strictly greater than or equal to the given element.
        treeset = new TreeSet<>(Arrays.asList(2,7,55,4,56));
        System.out.println("Greater than or equal the given element: "+ treeset.ceiling(5));

        //13. Write a Java program to get an element in a tree set that has a lower value than the given element.
        treeset = new TreeSet<>(Arrays.asList(2,7,55,4,56));
        System.out.println("Less than the given element: "+ treeset.lower(4));

        //14. Write a Java program to retrieve and remove the first element of a tree set.
        treeset = new TreeSet<>(Arrays.asList(2,7,55,4,56));
        System.out.println("Removing the first element: "+ treeset.pollFirst());
        System.out.println(treeset);

        //15. Write a Java program to retrieve and remove the last element of a tree set.
        System.out.println("Removing the last element: " + treeset.pollLast());
        System.out.println(treeset);

        //16. Write a Java program to remove a given element from a tree set.
        treeset = new TreeSet<>(Arrays.asList(2,7,55,4,56));
        treeset.remove(7);
        System.out.println("Removed 7: "+ treeset);

        //PriorityQueue
        System.out.println("PriorityQueue");
        //7. Write a Java program to compare two priority queues.
        PriorityQueue<String> pq = new PriorityQueue<>(Arrays.asList("one","two", "three", "Four", "five"));
        PriorityQueue<String> pq2 = new PriorityQueue<>(Arrays.asList("one","two", "three", "Four", "six"));
        pq.forEach(w-> {
            if(pq2.contains(w)) System.out.println(w+ " Same");
            else System.out.println(w+ "Not same");
        });

        //8. Write a Java program to retrieve the first element of the priority queue.
        System.out.println("Retrieving the first element: "+ pq.peek());

        //9. Write a Java program to retrieve and remove the first element.
        System.out.println(pq);
        System.out.println("Removing the first element: "+ pq.poll());
        System.out.println(pq);

        //10. Write a Java program to convert a priority queue to an array containing all its elements.
        pq = new PriorityQueue<>(Arrays.asList("one","two", "three", "Four", "five"));
        String[] pqarr = new String[pq.size()];
        pq.toArray(pqarr);
        System.out.println("An array from the priority Queue: " + Arrays.toString(pqarr));

        //11. Write a Java program to convert a Priority Queue element to string representations.
        pq = new PriorityQueue<>(Arrays.asList("one","two", "three", "Four", "five"));
        String representation;
        representation = pq.toString().toUpperCase();
        System.out.println("String representation of the PQ: "+representation);

        //12. Write a Java program to change priorityQueue to maximum priority queue.
        PriorityQueue<Integer> pqInt = new PriorityQueue<>( Collections.reverseOrder());
        pqInt.add(2);
        pqInt.add(9);
        pqInt.add(88);
        pqInt.add(99);
        pqInt.add(10);
        pqInt.add(14);
        pqInt.add(6);
        pqInt.add(72);
        System.out.println("Max priority PQ " + pqInt);

        //HashMap
        System.out.println("HashMap");
        //7. Write a Java program to test if a map contains a mapping for the specified key.
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("hey", 2);
        hm.put("yo", 7);
        hm.put("lol", 9);
        hm.put("uuu", 5);

        if(hm.containsKey("yo")){
            System.out.println("Yes it does");
        }
        else{
            System.out.println("No it doesnt");
        }

        //8. Write a Java program to test if a map contains a mapping for the specified value.
        if(hm.containsValue(66)){
            System.out.println("Yes it does");
        }
        else{
            System.out.println("No it doesnt");
        }

        //9. Write a Java program to create a set view of the mappings contained in a map.
        Set<Map.Entry<String, Integer>> set = hm.entrySet();
        System.out.println(set);

        //10. Write a Java program to get the value of a specified key in a map.
        HashMap<String, Integer> hm2 = new HashMap<>();
        hm2.put("hey", 2);
        hm2.put("yo", 7);
        hm2.put("lol", 9);
        hm2.put("uuu", 5);
        System.out.println("Get the value of lol key: " + hm.get("lol"));

        //11. Write a Java program to get a set view of the keys contained in this map.
        Set set2 = hm2.keySet();
        System.out.println("View of keys: "+ set2);

        //12. Write a Java program to get a collection view of the values contained in this map.
        HashMap<String, Integer> hm3 = new HashMap<>();
        hm3.put("hey", 2);
        hm3.put("yo", 7);
        hm3.put("lol", 9);
        hm3.put("uuu", 5);
        System.out.println("Collecito view of val: " + hm3.values());

        //TreeMap
        System.out.println("TreeMap");
        //21. Write a Java program to get the portion of a map whose keys range from a given key (inclusive) to another key (exclusive)
        TreeMap <Integer,String> tm = new TreeMap < Integer,String> ();
        tm.put(4, "Ii");
        tm.put(66, "Gg");
        tm.put(77, "Pop");
        tm.put(87, "Ul");
        tm.put(12, "Yay");
        System.out.println(tm);
        TreeMap<Integer,String> tmsub = new TreeMap<Integer, String> (tm.subMap(12, 77));
        System.out.println(tmsub);

        //22. Write a Java program to get the portion of a map whose keys range from a given key to another key.
        TreeMap<Integer,String> tmsub2 = new TreeMap<Integer, String> (tm.subMap(12,true, 77, true));
        System.out.println(tmsub2);

        //23. Write a Java program to get a portion of a map whose keys are greater than or equal to a given key.
        TreeMap<Integer,String> tmsub3 = new TreeMap<Integer, String> (tm.tailMap(70));
        System.out.println(tmsub3);

        //24. Write a Java program to get a portion of a map whose keys are greater than a given key.
        TreeMap<Integer,String> tmsub4 = new TreeMap<Integer, String> (tm.tailMap(77,false));
        System.out.println(tmsub4);

        //25. Write a Java program to get a key-value mapping associated with the least key greater than or
        // equal to the given key. Return null if there is no such key.
        System.out.println(tm.ceilingEntry(70));

        //26. Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key.
        System.out.println(tm.ceilingKey(70));
    }
}



