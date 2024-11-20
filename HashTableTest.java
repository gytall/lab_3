// HashTableTest.java
public class HashTableTest {
	public static void main(String[] args) {
			HashTable<String, Integer> hashTable = new HashTable<>(10);

			// Тестирование метода put
			hashTable.put("apple", 1);
			hashTable.put("banana", 2);
			hashTable.put("orange", 3);
			hashTable.put("pear", 2);
			

			// Тестирование метода get
			System.out.println("Значение для 'apple': " + hashTable.get("apple")); // 1
			System.out.println("Значение для 'banana': " + hashTable.get("banana")); // 2

			// Тестирование метода size
			System.out.println("Размер таблицы: " + hashTable.size()); // 3

			// Тестирование метода remove
			hashTable.remove("banana");
			System.out.println("Размер таблицы после удаления 'banana': " + hashTable.size()); // 2
			System.out.println("Значение для 'banana': " + hashTable.get("banana")); // null

			// Тестирование метода isEmpty
			System.out.println("Таблица пуста? " + hashTable.isEmpty()); // false
			hashTable.remove("orange");
			hashTable.remove("apple");
			System.out.println("Таблица пуста? " + hashTable.isEmpty()); // true
	}
}
