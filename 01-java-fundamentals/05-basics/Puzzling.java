import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Puzzling {
	public static Character[] alphabet = {
		'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'
	};
	public static void main(String[] args) {
		String[] names = { "Nancy", "Jinchi", "Fujibayashi", "Momochi", "Ishikawa" };
		int[] nums = {3,5,1,2,7,9,8,13,25,32};
		
		AlphabetPuzzle();
	}
    public static ArrayList<Integer> TrimArray(int[] numbers, int bound) {
        // returns array list with values greater than bound
        ArrayList<Integer> newList = new ArrayList<Integer>();
        for(int num : numbers) {
            if(num < bound)
                newList.add(num);
        }
        return newList;
    }

	public static int[] ArrayPuzzle(int[] numbers) {
		int sum = Basics.GetArraySum(numbers);
		System.out.println(sum + " is sum of numbers");
		// allocate new array size for the number of values greater than 10
		int[] newArr = new int[Basics.GreaterThanY(numbers, 10)];
		int j = 0;
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] > 10) {
				newArr[j] = numbers[i];
				j++;
			}
		}
		return newArr;
	}

	public static void AlphabetPuzzle() {
		shuffeArray(alphabet);
		System.out.println(String.format("%s is first", alphabet[0]));
		System.out.println(String.format("%s is last", alphabet[25]));
		if(isVowel(alphabet[0]))
			System.out.println("ITS A VOWEL");
	}



	public static void shuffeArray(Object[] arr) {
		Random r = new Random();
		for(int i = 0; i < arr.length/2; i++) {
			Object temp = arr[i];
			int randomIdx = r.nextInt(arr.length - i) + i;
			arr[i] = arr[randomIdx];
			arr[randomIdx] = temp;
		}
	}

    public static int[] RandomIntArray(int lowerBound, int upperBound) {
        int[] arr = new int[10];
        int offset = upperBound - lowerBound;
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(offset) + lowerBound;
        }
        Arrays.sort(arr);
        return arr; 
    }
    public static String[] RandomStringArr() {
        String[] arr = new String[10];
        for (int i = 0; i < arr.length; i++)
            arr[i] = StringManipulator.RandomString(5);
        return arr;
	}
	private static boolean isVowel(char letter) {
		Random r = new Random();
		return (
			letter == 'a' ||
			letter == 'e' ||
			letter == 'i' ||
			letter == 'o' ||
			letter == 'u' ||
			// y is sometimes a vowel lol
			(letter == 'y' && r.nextInt(2) == 1)
			);
	}
}