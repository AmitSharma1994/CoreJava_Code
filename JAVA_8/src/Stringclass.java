import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class StrinP {

	public static void main(String[] args) {

		int arr[] = { 9, 3, 2, 1, 3, 2, 4, 5 };
		int arr2[] = new int[arr.length];
		HashMap hm = new HashMap<Integer, Integer>();
		int count = 1;
		for (int i = 0; i < arr.length; i++) {

			if (hm.containsKey(arr[i])) {

				hm.put(arr[i], count++);

			} else {
				hm.put(arr[i], count);
			}

			Iterator<Map.Entry<Integer, Integer>> itr = hm.entrySet().iterator();

			while (itr.hasNext()) {
				Map.Entry<Integer, Integer> entry = itr.next();
				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
			}

		}
	}

}
