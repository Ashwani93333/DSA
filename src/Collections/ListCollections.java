package Collections;

import java.util.*;

/**
 * Java List Collection - Complete Reference
 *
 * Covers:
 * 1. List interface
 * 2. ArrayList
 * 3. LinkedList
 * 4. Vector
 * 5. Stack
 * 6. Common List methods
 * 7. Iteration techniques
 * 8. Sorting and searching
 * 9. Conversions
 * 10. Practical applications
 *
 * Compile:
 *     javac ListCollections.java
 *
 * Run:
 *     java ListCollections
 */
public class ListCollections {

    public static void main(String[] args) {

        // ============================================================
        // 1. LIST INTERFACE
        // ============================================================
        /*
         * List is an interface in java.util.
         *
         * Important properties:
         * - Ordered
         * - Allows duplicates
         * - Allows null values
         * - Index based
         *
         * Common implementations:
         * ArrayList
         * LinkedList
         * Vector
         * Stack
         */

        List<String> fruits = new ArrayList<>();


        // ============================================================
        // 2. ADD ELEMENTS
        // ============================================================

        fruits.add("Apple");              // add at end
        fruits.add("Banana");
        fruits.add("Mango");

        fruits.add(1, "Orange");           // add at index

        System.out.println("Fruits: " + fruits);


        // ============================================================
        // 3. GET ELEMENT
        // ============================================================

        String first = fruits.get(0);
        System.out.println("First fruit: " + first);


        // ============================================================
        // 4. UPDATE ELEMENT
        // ============================================================

        fruits.set(1, "Grapes");
        System.out.println("After update: " + fruits);


        // ============================================================
        // 5. REMOVE ELEMENT
        // ============================================================

        fruits.remove(0);                 // remove by index

        fruits.remove("Mango");            // remove by object

        System.out.println("After remove: " + fruits);


        // ============================================================
        // 6. SIZE
        // ============================================================

        System.out.println("Size: " + fruits.size());


        // ============================================================
        // 7. CHECK EMPTY
        // ============================================================

        System.out.println("Is empty? " + fruits.isEmpty());


        // ============================================================
        // 8. SEARCH
        // ============================================================

        System.out.println("Contains Apple? " + fruits.contains("Apple"));

        System.out.println("Index of Banana: " + fruits.indexOf("Banana"));

        System.out.println("Last index of Banana: " + fruits.lastIndexOf("Banana"));


        // ============================================================
        // 9. ADD DUPLICATES
        // ============================================================

        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(10);

        System.out.println("Numbers: " + numbers);

        System.out.println("First 10 index: " + numbers.indexOf(10));
        System.out.println("Last 10 index: " + numbers.lastIndexOf(10));


        // ============================================================
        // 10. ITERATING USING NORMAL FOR LOOP
        // ============================================================

        System.out.println("\nNormal for loop:");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }


        // ============================================================
        // 11. ENHANCED FOR LOOP
        // ============================================================

        System.out.println("\nEnhanced for loop:");

        for (int number : numbers) {
            System.out.println(number);
        }


        // ============================================================
        // 12. FOR EACH
        // ============================================================

        System.out.println("\nforEach:");

        numbers.forEach(number -> System.out.println(number));


        // ============================================================
        // 13. ITERATOR
        // ============================================================

        System.out.println("\nIterator:");

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        // ============================================================
        // 14. LISTITERATOR
        // ============================================================

        System.out.println("\nListIterator:");

        ListIterator<Integer> listIterator = numbers.listIterator();

        while (listIterator.hasNext()) {
            System.out.println("Forward: " + listIterator.next());
        }

        while (listIterator.hasPrevious()) {
            System.out.println("Backward: " + listIterator.previous());
        }


        // ============================================================
        // 15. SORTING
        // ============================================================

        List<Integer> unsorted = new ArrayList<>(
                Arrays.asList(50, 10, 40, 20, 30)
        );

        System.out.println("\nBefore sorting: " + unsorted);

        Collections.sort(unsorted);

        System.out.println("Ascending: " + unsorted);

        Collections.sort(unsorted, Collections.reverseOrder());

        System.out.println("Descending: " + unsorted);


        // ============================================================
        // 16. SORTING USING List.sort()
        // ============================================================

        unsorted.sort(Integer::compareTo);

        System.out.println("Using List.sort(): " + unsorted);


        // ============================================================
        // 17. REVERSE
        // ============================================================

        Collections.reverse(unsorted);

        System.out.println("Reversed: " + unsorted);


        // ============================================================
        // 18. SHUFFLE
        // ============================================================

        Collections.shuffle(unsorted);

        System.out.println("Shuffled: " + unsorted);


        // ============================================================
        // 19. MINIMUM AND MAXIMUM
        // ============================================================

        List<Integer> values = Arrays.asList(40, 10, 80, 20, 60);

        System.out.println("\nValues: " + values);
        System.out.println("Minimum: " + Collections.min(values));
        System.out.println("Maximum: " + Collections.max(values));


        // ============================================================
        // 20. FREQUENCY
        // ============================================================

        List<String> colors = Arrays.asList(
                "Red", "Blue", "Red", "Green", "Red", "Blue"
        );

        System.out.println("Red frequency: "
                + Collections.frequency(colors, "Red"));


        // ============================================================
        // 21. SWAP
        // ============================================================

        List<Integer> swapList = new ArrayList<>(
                Arrays.asList(10, 20, 30, 40)
        );

        Collections.swap(swapList, 0, 3);

        System.out.println("After swap: " + swapList);


        // ============================================================
        // 22. FILL
        // ============================================================

        List<String> list = new ArrayList<>(
                Arrays.asList("A", "B", "C", "D")
        );

        Collections.fill(list, "X");

        System.out.println("After fill: " + list);


        // ============================================================
        // 23. COPY
        // ============================================================

        List<String> source = Arrays.asList("Java", "Spring", "SQL");

        List<String> destination = new ArrayList<>(
                Arrays.asList("", "", "")
        );

        Collections.copy(destination, source);

        System.out.println("Copied list: " + destination);


        // ============================================================
        // 24. BINARY SEARCH
        // ============================================================

        List<Integer> sorted = new ArrayList<>(
                Arrays.asList(10, 20, 30, 40, 50)
        );

        int index = Collections.binarySearch(sorted, 30);

        System.out.println("Index of 30: " + index);


        // ============================================================
        // 25. SUBLIST
        // ============================================================

        List<Integer> original = new ArrayList<>(
                Arrays.asList(10, 20, 30, 40, 50)
        );

        List<Integer> subList = original.subList(1, 4);

        System.out.println("Original: " + original);
        System.out.println("SubList: " + subList);


        // ============================================================
        // 26. REMOVE ALL
        // ============================================================

        List<Integer> removeDemo = new ArrayList<>(
                Arrays.asList(10, 20, 30, 20, 40)
        );

        removeDemo.removeAll(Arrays.asList(20));

        System.out.println("After removeAll: " + removeDemo);


        // ============================================================
        // 27. RETAIN ALL
        // ============================================================

        List<Integer> retainDemo = new ArrayList<>(
                Arrays.asList(10, 20, 30, 40, 50)
        );

        retainDemo.retainAll(Arrays.asList(20, 40));

        System.out.println("After retainAll: " + retainDemo);


        // ============================================================
        // 28. CLEAR
        // ============================================================

        List<Integer> clearDemo = new ArrayList<>(
                Arrays.asList(1, 2, 3)
        );

        clearDemo.clear();

        System.out.println("After clear: " + clearDemo);


        // ============================================================
        // 29. ARRAYLIST
        // ============================================================

        /*
         * ArrayList:
         *
         * - Backed by a dynamic array
         * - Fast random access
         * - Good for read-heavy applications
         * - Allows duplicates
         * - Not synchronized
         */

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Java");
        arrayList.add("Spring Boot");
        arrayList.add("PostgreSQL");

        System.out.println("\nArrayList: " + arrayList);


        // ============================================================
        // 30. LINKEDLIST
        // ============================================================

        /*
         * LinkedList:
         *
         * - Doubly linked list
         * - Good for insertion/removal at ends
         * - Implements List and Deque
         * - Random access is slower than ArrayList
         */

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(20);
        linkedList.add(30);

        linkedList.addFirst(10);
        linkedList.addLast(40);

        System.out.println("LinkedList: " + linkedList);

        System.out.println("First: " + linkedList.getFirst());
        System.out.println("Last: " + linkedList.getLast());

        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println("After removing ends: " + linkedList);


        // ============================================================
        // 31. VECTOR
        // ============================================================

        /*
         * Vector:
         *
         * - Legacy List implementation
         * - Synchronized
         * - Usually prefer ArrayList in modern Java
         */

        Vector<String> vector = new Vector<>();

        vector.add("A");
        vector.add("B");
        vector.add("C");

        System.out.println("Vector: " + vector);


        // ============================================================
        // 32. STACK
        // ============================================================

        /*
         * Stack follows LIFO:
         *
         * Last In -> First Out
         *
         * Modern Java usually prefers ArrayDeque
         * for stack operations.
         */

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        System.out.println("Top: " + stack.peek());

        System.out.println("Popped: " + stack.pop());

        System.out.println("Stack after pop: " + stack);

        System.out.println("Contains 10? " + stack.contains(10));


        // ============================================================
        // 33. CONVERT ARRAY -> LIST
        // ============================================================

        String[] arr = {"Java", "Python", "Go"};

        List<String> arrayToList = Arrays.asList(arr);

        System.out.println("\nArray -> List: " + arrayToList);


        // ============================================================
        // 34. CONVERT LIST -> ARRAY
        // ============================================================

        List<String> programming = new ArrayList<>(
                Arrays.asList("Java", "Python", "Go")
        );

        String[] listToArray = programming.toArray(new String[0]);

        System.out.println("List -> Array: "
                + Arrays.toString(listToArray));


        // ============================================================
        // 35. Arrays.asList() IMPORTANT
        // ============================================================

        /*
         * Arrays.asList() returns a fixed-size list.
         *
         * You can:
         * - set()
         *
         * You cannot:
         * - add()
         * - remove()
         */

        List<Integer> fixedSize =
                Arrays.asList(10, 20, 30);

        fixedSize.set(0, 100);

        System.out.println("Fixed-size list: " + fixedSize);


        // ============================================================
        // 36. List.of()
        // ============================================================

        /*
         * List.of() creates an immutable list.
         *
         * add/remove/set -> UnsupportedOperationException
         */

        List<String> immutable =
                List.of("Java", "Spring", "Docker");

        System.out.println("Immutable list: " + immutable);


        // ============================================================
        // 37. MUTABLE COPY OF List.of()
        // ============================================================

        List<String> mutable =
                new ArrayList<>(List.of("Java", "Spring"));

        mutable.add("Docker");

        System.out.println("Mutable copy: " + mutable);


        // ============================================================
        // 38. REMOVE USING PREDICATE
        // ============================================================

        List<Integer> evenOdd = new ArrayList<>(
                Arrays.asList(10, 15, 20, 25, 30)
        );

        evenOdd.removeIf(number -> number % 2 != 0);

        System.out.println("Only even numbers: " + evenOdd);


        // ============================================================
        // 39. STREAM API
        // ============================================================

        List<Integer> streamNumbers = Arrays.asList(
                10, 15, 20, 25, 30
        );

        List<Integer> filtered =
                streamNumbers.stream()
                        .filter(x -> x > 15)
                        .toList();

        System.out.println("Numbers > 15: " + filtered);


        // ============================================================
        // 40. MAP USING STREAM
        // ============================================================

        List<Integer> doubled =
                streamNumbers.stream()
                        .map(x -> x * 2)
                        .toList();

        System.out.println("Doubled: " + doubled);


        // ============================================================
        // 41. SUM USING STREAM
        // ============================================================

        int sum = streamNumbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum: " + sum);


        // ============================================================
        // 42. FILTER + SORT
        // ============================================================

        List<Integer> result =
                streamNumbers.stream()
                        .filter(x -> x % 2 == 0)
                        .sorted()
                        .toList();

        System.out.println("Even sorted: " + result);

        // ============================================================
        // 47. PRACTICAL APPLICATION — TODO LIST
        // ============================================================

        List<String> todos = new ArrayList<>();

        todos.add("Learn Java");
        todos.add("Practice DSA");
        todos.add("Learn Spring Boot");

        todos.remove("Learn Java");

        System.out.println("\nTODO List: " + todos);

    }
}
