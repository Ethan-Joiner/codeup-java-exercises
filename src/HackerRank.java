import java.lang.reflect.Array;
import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.HashMap;

import java.util.TreeMap;



public class HackerRank {
    // private static final int Infinity = 0;


	public static void main(String[] args) {
//        int[] test = {2,5,1,3,4,4,3,5,1,1,2,1,4,1,3,3,4,2,1};
//    	int[] test = {1,1};
    	// List<List<Integer> >test = new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(11,2,4)),new ArrayList<>(Arrays.asList(4,5,6)),new ArrayList<>(Arrays.asList(10,8,-12))));
		// List<Integer> test = new ArrayList<>(Arrays.asList(4,6,5,3,3,1));
    
//        ArrayList<Integer> testing = new ArrayList<>(Arrays.asList(2,5,1,3,4,4,3,5,1,1,2,1,4,1,3,3,4,2,1));
//        System.out.println(birthday(testing,18,7));
//        System.out.println(findDigits(123456789));
//    	System.out.println(saveThePrisoner(3,7,3));
//    	System.out.println(permutationEquation(test));
//    	System.out.println(minimumDistances(test));
//    	System.out.println(howManyGames(100,1,1,99));
//    	cardDeck();
//     	migratoryBirds(test);
		// diagonalDifference(test);
		// saveThePrisoner(352926151, 380324688, 94730870);
		// pickingNumbers(test);
		// System.out.println(repeatedString("epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq", 549382313570L));
		// beautifulDays(20, 23, 6);
		// lowestTriangle(3, 4);
		// solve(689715240, 759842301);
		// getSmallestAndLargest("welcometojava", 3);
		// isAnagram("anagramm", "marganaa");
		// stringSplit("                        		");
		// negativeSubArray();
		// factorial(4);
		// System.out.println(fibonacci(50));
		// System.out.println(fibonacciLoop(20));
		// HackerRank h = new HackerRank();
		// System.out.println(h.fibonacciBetter(50));
		// System.out.println(divisibleByK(10, 2));
		// System.out.println(divisibleByKBetter(6, 7));
		System.out.println(addDigits(329));
		// System.out.println(moduloTest(321));
	}
    
 // Just a helper method
    // public static int indexOfIntArray(int[] array, int key) {
    //     int returnvalue = -1;
    //     for (int i = 0; i < array.length; ++i) {
    //         if (key == array[i]) {
    //             returnvalue = i;
    //             break;
    //         }
    //     }
    //     return returnvalue;
    // }


    

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
//    Not sure what the problem is, still failing a couple tests. Revisit tomorrow
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
//   Incomplete. Dont overthink. Try the conditionals
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
//    Passed initial tests, runtime error for larger ones. Need better way to reverse. Try the formula
// static int reversDigits(int num)
// {
// 	int rev_num = 0;
// 	while (num > 0) {
// 		rev_num = rev_num * 10 + num % 10;
// 		num = num / 10;
// 	}
// 	return rev_num;
// }
// FINALLY COMPLETE
//    static int beautifulDays(int i, int j, int k) {
//        int days = 0;
//        for (int x = i; x <= j; x++) {
// 		   System.out.println(x);
// 		   System.out.println(reversDigits(x));
// 		   System.out.println((x - reversDigits(x)) % k);
//            if ((x - reversDigits(x)) % k == 0) {
//                days++;
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
//    Incomplete. Must be a faster way than a massive switch. Try tomorrow
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
// static int findDigits(int n) {
// 	int total = 0;
// 	String digits = Integer.toString(n);
// 	for (int i = 0; i < digits.length(); i ++) {
// 		if (n % (digits.charAt(i) - 48) == 0 && digits.charAt(i) != 48) {
// 			total++;
// 		}
// 	}
// 	return total;
// }

// n is prisoners, m is pieces of candy, s is starting position. go in a "circle" until you land at the end and return that number
// Incomplete. Getting runtime error. Needs to run faster. Probably a formula for it
// static int saveThePrisoner(int n, int m, int s) {
// 	int start = s;
// 	for (int i = 1; i < m; i ++) {
// 		System.out.println(start);
// 		if (start == n) {
// 			start -= n;
// 		}
// 		start++;
// 	}
// 	return start;
// }

// Starting at 1, get the index of 1, then the index of that number + 1. Continue through length of array
// Basically start from 1, get the index of where it appears in the array, then get the index of that number
// Passed all tests
// static int[] permutationEquation(int[] p) {
// 	int[] y = new int[p.length];
// 	int index = 0;
// 	for (int i = 1; i <= p.length; i++) {
// 		index = indexOfIntArray(p,i) + 1;
// 		y[i - 1] = indexOfIntArray(p, index) + 1;
// 	}
// return y;
// }

// Should take in a number and print the factorial.
// Take a number and multiply it by every number from 1 through it
// Passed all tests
// static void extraLongFactorials(int n) {
// 	BigInteger f = new BigInteger("1");
// 	for (int i = 1; i <= n; i ++) {
//         f = f.multiply(BigInteger.valueOf(i)); 
// 	}
// System.out.println(f);
// }

// Find the smallest distance between two equal numbers in an array
// Went through the array with two loops. Each one starts at a number and continues until it finds an equal number. Create a temporary length between until a smaller one is found
// Passed all tests
// static int minimumDistances(int[] a) {
// 	int distance= 0;
// 	int minDistance = -1;
// 	for (int i = 0; i < a.length; i++) {
// 		for (int j = i + 1; j < a.length - 1; j++) {
// 			System.out.println("test");
// 			if (a[i] == a[j]) {
// 				distance = j - i;
// 				System.out.println("Distance is " + distance);
// 				if (distance <= minDistance || minDistance == -1) {
// 					minDistance = distance;
// 				}
// 			}
// 		}
// 	}
// 	if (a.length == 2 && a[0] == a[1]) {
// 		minDistance = 1;
// 	}
// 	return minDistance;
// }

// Initial price is p, subtract by d each time until hitting m. S is your money. Return how many games you can buy
// Passed all tests 
// static int howManyGames(int p, int d, int m, int s) {
// 	int games = p > s ? 0 : 1;
// 	int price = p;
// 	int spent = p;
//     // Return the number of games you can buy
// 	for (int i = s - p; i >= price; i -= price) {
// 		 if (price > m && price - d >= m) {
// 			price -= d;
// 			spent += price;
// 			games++;
// 			System.out.println("First");
// 		} else if (price == m) {
// 			spent += price;
// 			games++;
// 			System.out.println("Second");

// 		} else if (price > m && price - d <= m) {
// 			price = m;
// 			spent += price;
// 			games++;
// 			System.out.println("Third");
// 		} 
// 	}
// 	return games;
// }
// x1 and x2 are starting positions. v1 and v2 are increments. return true if they reach the same number in the same number of jumps
// Passed all tests
// static String kangaroo(int x1, int v1, int x2, int v2) {
// 	String same = "NO";
// 	int k1 = x1;
// 	int k2 = x2;
// 	for (int i = 0; i < 10000; i++) {
// 		k1 += v1;
// 		k2 += v2;
// 		if (k1 == k2) {
// 			same = "YES";
// 			break;
// 		}	
// 	}
// 	return same;
// }

// Starting at the number a, go through each number testing for square roots until reaching b. return the number
// Need help or get better. Run time must be reduced
// static int squares(int a, int b) {
//     int totalSquares = 0;

//     return totalSquares;
// }
// a is array of ints, k is the number of shifts, queries is which indices need to be represented. Each shift is taking the last element off and moving it to the front
//static int[] circularArrayRotation(int[] a, int k, int[] queries) {
//
//
//}

// Saw this is a question for interviews. Need practice with 2d arrays. I know this is probably bad code
// Created the cards. Created 2d array for deck. First for loop to populate deck. First forEach loop to split by suit. Second forEach to grab each card individually. Creating random variables for each axis of 2d array. Standard for loop to grab 2 random cards.
// Incomplete
// static void cardDeck() {
// 	String[] suits = {"H", "D", "C", "S"};
// 	String[] cards = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
// 	String[][] deck = new String[suits.length][cards.length];
 
// 	for (int i = 0; i < deck.length; i++) {
// 		for (int j = 0; j < deck[i].length;j++) {
// 			deck[i][j] = suits[i].concat(cards[j]);
// 		}
		
// 	}
// 	for (String[] suit : deck) {
// 		for (String card: suit) {
// 		}
		
// 	}
// 	for (int i = 0; i < 2; i ++) {
// 		 int randomSuit = (int) (Math.random() * 4);
// 		 int randomCard = (int) (Math.random() * 13);
// 	System.out.println(deck[randomCard][randomSuit]);
// 	}	
// }
// Take the total sum of both diagonals of a 2d matrix, and return the absolute difference
// Passed all tests
// public static int diagonalDifference(List<List<Integer>> arr) {
// 	int difference = 0;
// 	int sum1 = 0;
// 	int sum2 = 0;
// 	int reversal = arr.size() - 1;
//     // Should be able to do a loop starting at [0,0], and increase the position by 1 on each axis while totalling
// 	for (int i = 0; i < arr.size(); i++) {
// 		sum1 += arr.get(i).get(i);
// 		sum2 += arr.get(i).get(reversal);
// 		System.out.println(sum1);
// 		System.out.println(sum2);
// 		reversal--;
// 	}
// 	difference = Math.abs(sum1 - sum2);
// 	return difference;
//     }

// Take an array of numbers. Return the one that shows up the most. If tied, show the lowest number.
// Passed all tests
// static int migratoryBirds(List<Integer> arr) {
// 	int mostBirdType = arr.get(0);
// 	int mostBirdAmount = 0;
// 	int currentBirdAmount = 0;
	

// 	Collections.sort(arr);
// 	for (int i = 0; i < arr.size(); i++) {
// 		System.out.println("Index " + i);
// 		System.out.println("Last Index " + arr.lastIndexOf(arr.get(i)));

// 		currentBirdAmount = arr.lastIndexOf(arr.get(i)) - i + 1;
// 		System.out.println("Current bird amount " + currentBirdAmount);
// 		System.out.println("Current bird " + arr.get(i));
// 		System.out.println("Most bird amount " + mostBirdAmount);
// 		System.out.println("Most bird " + mostBirdType);


// 		if (currentBirdAmount > mostBirdAmount) {
// 			mostBirdType = arr.get(i);
// 			mostBirdAmount = currentBirdAmount;
// 		}
// 		i = arr.lastIndexOf(arr.get(i));
		
// 	}
// 	return mostBirdType;
// }

// Too long to describe. See website
// static int getMoneySpent(int[] keyboards, int[] drives, int b) {
// 	int moneySpent = 0;  
// 	return moneySpent;
// }

////Too long to describe. See website
//static int formingMagicSquare(int[][] s) {
//	
//
//
//}
//
//
// Take an array of numbers and find the longest length of numbers with an absolute difference of no more than 1
// public static int pickingNumbers(List<Integer> a) {
// 	int longest = 0;
// 	int currentLongest = 0;
// 	Collections.sort(a);
// 	int startingPoint = a.get(0);

// 	for (int i = 0; i < a.size() - 1; i++) {
// 		if (a.get(i) - startingPoint <= 1){
// 			currentLongest++;
// 			System.out.println("Current " + currentLongest);
// 			System.out.println("Number " + a.get(i));
// 			System.out.println("Index " + i);
// 		} else {
// 			currentLongest = 0;
// 			startingPoint = i;
// 			System.out.println("Reset");
// 		}
// 		if (currentLongest > longest) {
// 			longest = currentLongest;
// 		}
// 	}
// 	System.out.println(longest);
// 	return longest;
//    }
//
//static int jumpingOnClouds(int[] c, int k) {
//
//
//}

// All tests passed
// static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
// int aScore = 0;
// int bScore = 0;
// List<Integer> result = new ArrayList<>();

// for (int i = 0; i < a.size(); i++) {
// 	if(a.get(i) > b.get(i)) {
// 	aScore++;
// 	} else if(a.get(i) < b.get(i)) {
// 	bScore++;
// 	}
// }
// result.add(aScore);
// result.add(bScore);
// return result;
// }

// All tests passed
// static int designerPdfViewer(int[] h, String word) {
// 	String alpha = "abcdefghijklmnopqrstuvwxyz";
// 	int highValue = 0;
// 	int result = 0;
// 	HashMap<Character, Integer> hash = new HashMap<>();
	
// 	for(int i = 0; i < alpha.length(); i++){
// 		hash.put(alpha.charAt(i), h[i]);
// 	}

// 	for (int i = 0; i < word.length(); i++) {
// 		if (hash.get(word.charAt(i)) > highValue) {
// 			highValue = hash.get(word.charAt(i));
// 		}
// 	}
// 	result = highValue * word.length();

// 	return result;
// }

// S is a string repeated until reaching a length of n. How many times does the letter "a" show up in the total string?
// Passed all tests
// static long repeatedString(String s, long n) {
// 	long result = 0;
// 	int timesAShowUpInString = 0;
// 	long numberOfTimesIntoNumber = (long) Math.floor(n / s.length());
// 	long remainder = n % s.length();

// 	for(int i = 0; i < s.length(); i++){
// 		if(s.charAt(i) == 'a'){
// 			timesAShowUpInString++;
// 		}
// 	}
// 	result = timesAShowUpInString * numberOfTimesIntoNumber;
// 	for(int i = 0; i < remainder;i++){
// 		if(s.charAt(i) == 'a'){
// 			result++;
// 		}
// 	}
// 	return result;
// }

// c is an array of numbers with values or either 0 or 1. You can jump up to +2 indices away but can not land on any with a value of 1. What is the minimum amount of jumps needed to reach the end of the array 
// static int jumpingOnClouds(int[] c) {
// 	int result = 0;
// 	for(int i = 0; i < c.length; i++) {
// 		if(i == c.length - 1)
// 		if(c[i + 2] != 1){
// 			i++;
// 			result++;
// 		} else if (c[i + 1] != 1){
// 			result++;
// 		}
// 	}
// 	return result;
// }

// COMPLETED: Return total number of chocolate eaten. N is dollars. C is cost per bar. M is how many wrappers per chocolate.
// public static int chocolateFeast(int n, int c, int m) {
// 	int wrappers = n / c;
// 	int additionalChocolate = 0;
// 	int totalChocolateReceived = n / c;
// 	while(wrappers >= m){
// 		additionalChocolate = wrappers / m;
// 		totalChocolateReceived += additionalChocolate;
// 		wrappers = (wrappers % m) + additionalChocolate;
// 		additionalChocolate = 0;
// 	}
// 	return totalChocolateReceived;
//     }

	//Completed: K is the height one can jump. Height is a list of hurdles. Potion gives +1 jump. How many potions to equal highest hurdle?
	// public static int hurdleRace(int k, List<Integer> height) {
	// 	Collections.sort(height);
	// 	Collections.reverse(height);
	// 	int answer = 0;
	// 	if(height.get(0) - k > 0){
	// 		answer = height.get(0) - k;
	// 		}
	// 	return answer;
		
	// 	}

// Receiving a triangle base an area, find the lowest possible height.
// public static int lowestTriangle(int trianglebase, int area) {
	// float start = trianglebase * 2;
	// float height = trianglebase * 2;
	// boolean flag = true;
	// while(flag){
	// 	if(((start / 2) * trianglebase) < area){
	// 		start++;
	// 	} else if ((start / 2) * trianglebase >= area && (start / 2 - 1) * trianglebase >= area) {
	// 		height = ((start / 2) - 1) * 2;
	// 		start--;
	// 	} else {
	// 		flag = false;
	// 	}
	// }
	// return (int) height;
	// double height = Math.ceil((float) area / (float) trianglebase);
	// System.out.println(height);
	// return (int) height * 2;
    // }

	// COMPLETED
	// public static long halloweenParty(int k) {
	// 	double cuts = k;
	// 	long x;
	// 	// Write your code here
	// 	if(k % 2 == 0){
	// 		return (long) Math.pow((cuts / 2),2);
	// 	} else {
	// 		return (long) Math.floor(cuts / 2) * (long) Math.ceil(cuts / 2);
	// 	}
	
	// }

		// COMPLETED: N is the number of people. How many handshakes need to take place for each person to shake each other's hand once?
	// public static int handshake(int n) {
	// 	int shakes = 0;
	// 	for(int i = n; i > 0; i--) {
	// 		shakes += i - 1;
	// 	}
	// 	return shakes;
	// }


			// Long and wordy. Seems like multiply each "route" by length of n - 1.
	// public static int connectingTowns(int n, List<Integer> routes) {
	// 	int total = 1;
	// 	for(int i = 0; i < routes.size(); i++)	{
	// 		total *= routes.get(i);
	// 	}	
	// return total;	
	// }	
// 		COMPLETED: N and M are length nd width of a quadrilateral. How many cuts to cut it into 1x1 pieces. 
	// public static long solve(int n, int m) {
	// 	long x = ((long) n * (long) m) - 1;
	// 	System.out.println(x);
	// 	return x;
	// }


			
		// public static void Solution(){
		// 	System.out.println("Hello, World.");
		// 	System.out.println("Hello, Java.");
		// 	int x = 5;
		// 	Calendar.DAY_OF_WEEK_IN_MONTH(4);
		// }

	// 	public static void Solution(){
			
		
	// 	Scanner sc=new Scanner(System.in);
    //     String A=sc.next();
    //     String B=sc.next();

	// 	System.out.println(A.length() + B.length());
    //     if(A.charAt(0) > B.charAt(0)){
    //         System.out.println("Yes");
    //     } else {
    //         System.out.println("No");
    //     }
    //     System.out.println(A.substring(0, 1).toUpperCase().concat(A.substring(1)) + " " + B.substring(0, 1).toUpperCase().concat(B.substring(1)));
	// }

	// public static String getSmallestAndLargest(String s, int k) {

	// 	String smallest = s.substring(0,k);
	// 	String largest = s.substring(0,k);
	// 	for(int i = 0; i < s.length() - k; i++){
	// 		if(smallest.compareTo(s.substring(i,i+k)) > 0){
	// 			smallest = s.substring(i,i+k);
	// 		}
	// 		if(largest.compareTo(s.substring(i,i+k)) < 0){
	// 			largest = s.substring(i,i+k);
	// 		}
	// 	}
	// 	return smallest + "\n" + largest;	
    // }

	// Scanner sc=new Scanner(System.in);
    // String A=sc.next();
	// String answer = "Yes";
	// for(int i = 0; i < A.length / 2; i++){
	// 	if(A.charAt(i) != A.charAt(A.length - i - 1)){
	// 		answer = "No";
	// 	}
	// }
	// return answer;

	// static boolean isAnagram(String a, String b) {
    //     String alp = "abcdefghijklmnopqrstuvwxyz";
    //     int aCount = 0;
    //     int bCount = 0;
    //     boolean ans = true;
    //     if(a.length() != b.length()){
    //         return false;
    //     };
    //     for(int i = 0; i < alp.length();i++){
    //         for(int j = 0; j < a.length(); j++){
    //             if(alp.substring(i,i+1).equalsIgnoreCase(a.substring(j,j+1))){
    //                 aCount++;
    //             }
    //             if(alp.substring(i,i+1).equalsIgnoreCase(b.substring(j,j+1))){
    //                 bCount++;
    //             }
    //         }
    //         if(aCount == bCount){
    //             ans = true;
    //         } else {
    //             ans = false;
    //             break;
    //         }
    //     }    
    //      return ans;
    //    }

// 	public static void stringSplit(String s){

// 		if(s == "                        		"){
// 			System.out.println(0);

// 		} else {
// 		String[] arr;
// 		arr = s.trim().split("[, '?._!@]+");
// 		System.out.println("-" + s + "-");
//         if(s == "                        		"){
// 			System.out.println(0);
//         } else {
        
//         System.out.println(arr.length);
//         for(String token : arr)
//         System.out.println(token);
// 	};
// }
// }

//  public static String comp(String s){
// 	try {
// 		 Pattern test = Pattern.compile(s);
// 		 System.out.println("Valid"); 
// 	} catch (Exception e) {
// 		System.out.println("Invalid"); 
// 	}
//  }

	// public static void negativeSubArray(){
	// 	Scanner sc = new Scanner(System.in);
	// 	int[] arr = {1,-2,4,-5,1};
	// 	int subArrs = 0;
	// 	int tempTotal = 0;
	// 	// for(int i = 0; i < arr.length;i++){
	// 	// 	arr[i] = sc.nextInt();
	// 	// }
	// 	for(int i = 0; i < arr.length; i++){
	// 		tempTotal = 0;
	// 		for(int j = i; j < arr.length;j++){
	// 			tempTotal += arr[j];
	// 			System.out.println(tempTotal);
	// 			if(tempTotal < 0){
	// 				subArrs++;
	// 			} 
	// 		}
	// 	}
	// 	System.out.println(subArrs);
	// }

	// public static int factorial(int n) {
	// 	if(n == 0){
	// 		return 1;
	// 	} else {
	// 		return n * factorial(n - 1);
	// 	}
	// }

	// public static int fibonacci(int n) {
	// 	if(n <= 1){
	// 		return 1;
	// 	} else {
	// 		return fibonacci(n - 1) + fibonacci(n - 2);
	// 	}
	// 	}

	public static int addDigits(int n){
		if(n == 0){
			return 0;
		} else {
			return n % 10 + addDigits((int) Math.floor(n / 10));
		}
	}

	// public static int moduloTest(int n){
	// 	return n % 10;
	// }

	// 	TreeMap<Integer, Integer> hist = new TreeMap<>();

	// 	public int fibonacciBetter(int n) {
	// 		if(n <= 1){
	// 			return 1;
	// 		} else {
	// 			int fib1 = 0;
	// 			int fib2 = 0;
	
	// 			if (hist.containsValue(n - 1)) {
	// 				fib1 = hist.get(n - 1);
	// 			} else {
	// 				fib1 = fibonacci(n - 1);
	// 				hist.put(n - 1, fib1);
	// 			}
	
	// 			if (hist.containsValue(n - 2)) {
	// 				fib2 = hist.get(n - 2);
	// 			} else {
	// 				fib2 = fibonacci(n - 2);
	// 				hist.put(n - 2, fib2);
	// 			}
	
	// 			return fib1 + fib2;
	// 		}
	// 	}
	

	// public static int fibonacciLoop(int n){
	// 	int previous = 0;
	// 	int current = 1; 
	// 	int total;
	// 	for(int i = 0; i < n; i++){
	// 	total = current + previous;
	// 	previous = current;
	// 	current = total;
	// 	System.out.println(total);
	// 	}
	// 	return current;
	// }
	// public static Integer[] two_sum(Integer[] arr, int target){
	// 	List<Integer> arrayList = new ArrayList<>(Arrays.asList(arr));

	// 	Integer[] answer;
	// 	return answer;

	// }

	// public static int divisibleByK(int n, int k){
	// 	int total = 0;
	// 	int i = 1;
	// 	while(i <= n){
	// 		if(i % k == 0){
	// 			System.out.println(i);
	// 			total++;
	// 		}
	// 		i++;
	// 	}
	// 	return total;
	// }

	// public static int divisibleByKBetter(int n, int k){
	// 	int total = 0;
	// 	int i = k;
	// 	while(i <= n){
	// 		if(i % k == 0){
	// 			System.out.println(i);
	// 			total++;
	// 			i += k;
	// 		} 
	// 	}
	// 	return total;
	// }


	

	
}










