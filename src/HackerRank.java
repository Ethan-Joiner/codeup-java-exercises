import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HackerRank {
    private static final int Infinity = 0;
	public static void main(String[] args) {
//        int[] test = {2,5,1,3,4,4,3,5,1,1,2,1,4,1,3,3,4,2,1};
    	int[] test = {1,1};
//        ArrayList<Integer> testing = new ArrayList<>(Arrays.asList(2,5,1,3,4,4,3,5,1,1,2,1,4,1,3,3,4,2,1));
//        System.out.println(birthday(testing,18,7));
//        System.out.println(findDigits(123456789));
//    	System.out.println(saveThePrisoner(3,7,3));
//    	System.out.println(permutationEquation(test));
//    	System.out.println(minimumDistances(test));
    	System.out.println(howManyGames(100,1,1,99));
    }
    
 // Just a helper method
    public static int indexOfIntArray(int[] array, int key) {
        int returnvalue = -1;
        for (int i = 0; i < array.length; ++i) {
            if (key == array[i]) {
                returnvalue = i;
                break;
            }
        }
        return returnvalue;
    }


    

//    Take in an array of grades and round up if passing and within 2 points of a multiple of 5
//    Passed all tests. Testing commit. Testing push. Testing command line
//    public static List<Integer> gradingStudents(List<Integer> grades) {
//        List<Integer> rounded = new ArrayList<>();
//        for (int grade : grades) {
//            if (grade < 38) {
//                rounded.add(grade);
//            } else if ((grade + 1) % 5 == 0) {
//                grade +=1;
//                rounded.add(grade);
//            } else if ((grade + 2) % 5 == 0) {
//                grade += 2;
//                rounded.add(grade);
//            } else {
//                rounded.add(grade);
//            }
//        }
//        return rounded;
//    }

//    Description wont copy over and is too long. S-T for house. A apple loc, B oj loc. Print how many of each fall in range.
//    Passed all tests
//    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
//        int applesLanded = 0;
//        int orangesLanded = 0;
//        for (int apple : apples) {
//            if ((apple + a) >= s && (apple + a) <= t) {
//                applesLanded++;
//            }
//        }
//        for (int orange : oranges) {
//            if ((orange + b) >= s && (orange + b) <= t) {
//                orangesLanded++;
//            }
//        }
//        System.out.println(applesLanded);
//        System.out.println(orangesLanded);
//    }

//    Highest that K - height needs to be
//    Passed all tests
//    static int hurdleRace(int k, int[] height) {
//
//        int dose = 0;
//        Arrays.sort(height);
//        if (k < height[height.length - 1]) {
//                dose = (height[height.length - 1]) - k;
//        }
//        return dose;
//    }

//    Each letter in the alphabet is assigned a number. Find the highest number times the length of the word
//    Consider starting over, plan does not work. 
//    static int designerPdfViewer(int[] h, String word) {
//        int area;
//        int start = 0;
//        String alpha = "abcdefghijklmnopqrstuvwxyz";
//        for (int i = 0; i < h.length - 1; i ++) {
//            if (h[i] > start && word.contains(alpha[i])) {
//            }
//        }
////        Arrays.sort(h);
//        area = h[h.length - 1] * word.length();
//        return area;
//    }

//    Tally times highest and lowest are reached from array
//    Not sure what the problem is, still failing a couple tests. 
//    static int[] breakingRecords(int[] scores) {
//        int min = scores[0];
//        int max = scores[0];
//        int minCount = 0;
//        int maxCount = 0;
//        int[] maxMin = new int[2];
//
//        for (int i = 1; i < scores.length; i++) {
//            if (scores[i] > max) {
//                maxCount++;
//                max = scores[i];
//            } else if (scores[i] < min) {
//                minCount++;
//                min = scores[i];
//            }
//        }
//        maxMin[0] = maxCount;
//        maxMin[1] = minCount;
//        return maxMin;
//    }

//    S is array of numbers to be added, d is total expected, m is how many touching can be considered
//    Passed all tests
//    static int birthday(List<Integer> s, int d, int m) {
//        int total = 0;
//        int counter = 0;
//        for (int i = 0; i < s.size() - (m - 1); i++) {
//            int start = i;
//            for (int j = 0; j < m; j++) {
//                if (start <= s.size()) {
//                    total += s.get(start);
//                    start++;
//                }
//            }
//            if (total == d) {
//                    counter++;
//            }
//            total = 0;
//        }
//        return counter;
//    }

//    Take in an array and an int. Find how many pairs in the array are evenly divisible by k
//    Passed all tests
//    static int divisibleSumPairs(int n, int k, int[] ar) {
//        int total = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = (i + 1); j < n; j++){
//                if ((ar[i] + ar[j]) % k == 0) {
//                    total++;
//                }
//            }
//        }
//        return total;
//    }

//    Take in a list of items charged (bill), add together and remove index of k, if equals B correct, if not print difference
// Passed all tests
//    static void bonAppetit(List<Integer> bill, int k, int b) {
//        int total = 0;
//        for (int item: bill) {
//                total += item;
//        }
//        total -= bill.get(k);
//        if (total / 2 == b) {
//            System.out.println("Bon Appetit");
//        } else {
//            System.out.println(b - (total / 2));
//        }
//    }

//    Take in n (length of array) and an array and return the number of pairs
//    Established pairs at 0. Sorted array to put numbers in order. Ran loop from first number through second to last. If there was a match pairs was in creased by one, and the index was increased by two. If not, the next number was checked
//   Passed all tests
//    static int sockMerchant(int n, int[] ar) {
//        int pairs = 0;
//        Arrays.sort(ar);
//        for (int i = 0; i < (n - 1); i ++) {
//            if (ar[i] == ar[i + 1]) {
//                pairs++;
//                i++;
//            }
//        }
//        return pairs;
//    }

//    N is the number of pages in the book, p is the desired page. Write a function to determine the minimum number of page turns. Even numbered pages will be on the left, odds on the right
//   Incomplete. Dont overthink. Do some research
//    static int pageCount(int n, int p) {
//        int turnCount = 0;
////        If the number of total pages - desired page is smaller, start from the back of the book, else start from the front
//        if (n - p < n - 1) {
//            if (n - p == 1 && )
//        } else if (n - p > n - 1) {
//        }
//        return turnCount;
//    }

// N is the number of "valleys" entered. String will containt U (+1) and D(-1). Starting from 0, n should be the number of times it gets below zero
//    Passed all tests
//    static int countingValleys(int n, String s) {
//        int valleys = 0;
//        int position = 0;
//        for (int i = 0; i < s.length(); i ++) {
//            if (s.charAt(i) == 'U') {
//                position++;
//            } else if (s.charAt(i) == 'D') {
//                if (position == 0) {
//                    valleys++;
//                }
//                position--;
//            }
//        }
//        return valleys;
//    }

//    Starting at 1, rotate between doubling and adding 1.
//    Passed all tests
//    static int utopianTree(int n) {
//        int height = 1;
//        for (int i = 1; i <= n; i++) {
//            if (i % 2 == 1) {
//                height *= 2;
//            } else {
//                height++;
//            }
//        }
//        return height;
//    }
// K is number required (at minimum). A is array of numbers that anything <=0 is good and over is bad.
//    Created empty number variable and empty string variable. Looped through and if conditions were meant increased count
//    Passed all tests
//    static String angryProfessor(int k, int[] a) {
//        int onTime = 0;
//        String cancelled = "";
//        for (int i = 0; i < a.length; i ++){
//            if (a[i] <= 0) {
//                onTime++;
//            }
//        }
//        if (onTime >= k) {
//            cancelled = "NO";
//        } else {
//            cancelled = "YES";
//        }
//        return cancelled;
//    }

//    I is start day, j is last day. Test each day by subtracting it from its reverse. If evenly divisible by K then increase days
//    Passed initial tests, runtime error for larger ones. Need better way to reverse
//    static int beautifulDays(int i, int j, int k) {
//        int days = 0;
//        String reverseOne = "";
//        String reverseTwo = "";
//        for (int x = i; x <= j; x++) {
//            reverseOne = Integer.toString(x);
//            for (int y = reverseOne.length() - 1; y >= 0; y--) {
//                reverseTwo += reverseOne.charAt(y);
//            }
//            if ((Integer.parseInt(reverseOne) - Integer.parseInt(reverseTwo)) % k == 0) {
//                days++;
//                reverseTwo = "";
//            }
//        }
//        return days;
//    }

//    N is number of days. First day start with 5. Divide in half a round down to find daily likes. Likes x 3 for next day. Should be ez formula
//    Passed all tests
//    static int viralAdvertising(int n) {
//        int totalLikes = 0;
//        int dailyLikes = 0;
//        int dailyShared= 5;
//        for (int i = 0; i < n; i ++) {
//        	dailyLikes = (int) Math.floor(dailyShared / 2);
//        	totalLikes += dailyLikes;
//        	dailyShared = dailyLikes * 3;
//        }
//       
//        return totalLikes;
//    }



// For numbers 1 through 5, find which shows up the most times. If there is a tie, return the lower number
//    Incomplete. Must be a faster way than a massive switch.
//static int migratoryBirds(List<Integer> arr) {
//	 int winnerBird = 0;
//	 int oneCount = 0;
//	 int twoCount = 0; 
//	 int threeCount = 0;
//	 int fourCount = 0;
//	 int fiveCount = 0;
//	 switch
//	
//	 
//	 
//	return winnerBird;
//
//}

//	Take a number and find how many of the individual digits are evenly divisible
//    Had to use math due to char data type holding a numeric value. 
//    All tests passed
static int findDigits(int n) {
	int total = 0;
	String digits = Integer.toString(n);
	for (int i = 0; i < digits.length(); i ++) {
		if (n % (digits.charAt(i) - 48) == 0 && digits.charAt(i) != 48) {
			total++;
		}
	}
	return total;
}

// n is prisoners, m is pieces of candy, s is starting position. go in a "circle" until you land at the end and return that number
// Incomplete. Getting runtime error. Needs to run faster.
static int saveThePrisoner(int n, int m, int s) {
	int start = s;
	for (int i = 1; i < m; i ++) {
		System.out.println(start);
		if (start == n) {
			start -= n;
		}
		start++;
	}
	return start;
}

// Starting at 1, get the index of 1, then the index of that number + 1. Continue through length of array
// Basically start from 1, get the index of where it appears in the array, then get the index of that number
// Passed all tests
static int[] permutationEquation(int[] p) {
	int[] y = new int[p.length];
	int index = 0;
	for (int i = 1; i <= p.length; i++) {
		index = indexOfIntArray(p,i) + 1;
		y[i - 1] = indexOfIntArray(p, index) + 1;
	}
return y;
}

// Should take in a number and print the factorial.
// Take a number and multiply it by every number from 1 through it
// Passed all tests
static void extraLongFactorials(int n) {
	BigInteger f = new BigInteger("1");
	for (int i = 1; i <= n; i ++) {
        f = f.multiply(BigInteger.valueOf(i)); 
	}
System.out.println(f);
}

// Find the smallest distance between two equal numbers in an array
// Went through the array with two loops. Each one starts at a number and continues until it finds an equal number. Create a temporary length between until a smaller one is found
// Passed all tests
static int minimumDistances(int[] a) {
	int distance= 0;
	int minDistance = -1;
	for (int i = 0; i < a.length; i++) {
		for (int j = i + 1; j < a.length - 1; j++) {
			System.out.println("test");
			if (a[i] == a[j]) {
				distance = j - i;
				System.out.println("Distance is " + distance);
				if (distance <= minDistance || minDistance == -1) {
					minDistance = distance;
				}
			}
		}
	}
	if (a.length == 2 && a[0] == a[1]) {
		minDistance = 1;
	}
	return minDistance;
}

// Initial price is p, subtract by d each time until hitting m. S is your money. Return how many games you can buy
// Passed all tests 
static int howManyGames(int p, int d, int m, int s) {
	int games = p > s ? 0 : 1;
	int price = p;
	int spent = p;
    // Return the number of games you can buy
	for (int i = s - p; i >= price; i -= price) {
		 if (price > m && price - d >= m) {
			price -= d;
			spent += price;
			games++;
			System.out.println("First");
		} else if (price == m) {
			spent += price;
			games++;
			System.out.println("Second");

		} else if (price > m && price - d <= m) {
			price = m;
			spent += price;
			games++;
			System.out.println("Third");
		} 
	}
	return games;
}
// x1 and x2 are starting positions. v1 and v2 are increments. return true if they reach the same number in the same number of jumps
static String kangaroo(int x1, int v1, int x2, int v2) {
	String same = "NO";
	int k1 = x1;
	int k2 = x2;
	for (int i = 0; i < 10000; i++) {
		k1 += v1;
		k2 += v2;
		if (k1 == k2) {
			same = "YES";
			break;
		}	
	}
	return same;
}

}

