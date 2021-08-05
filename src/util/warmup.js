// Loop through the following array of Reindeer objects and return an array of Reindeer objects that are “gold” reindeer
var reindeerList = [
        {
            name: "Dot",
            age: 5,
            isGold: false
        },
        {
            name: "Dasher",
            age: 8,
            isGold: true
        },
        {
            name: "Patch",
            age: 2,
            isGold: false
        },
        {
            name: "Rocket",
            age: 6,
            isGold: false
        },
        {
            name: "Dancer",
            age: 9,
            isGold: true
        },
        {
            name: "Prancer",
            age: 5,
            isGold: true
        },
        {
            name: "Groot",
            age: 9,
            isGold: false
        },
        {
            name: "Vixen",
            age: 9,
            isGold: true
        },
        {
            name: "Comet",
            age: 11,
            isGold: true
        },
        {
            name: "Archie",
            age: 3,
            isGold: false
        },
        {
            name: "Cupid",
            age: 13,
            isGold: true
        },
        {
            name: "Donder",
            age: 16,
            isGold: true
        },
        {
            name: "Boots",
            age: 16,
            isGold: false
        },
        {
            name: "Blizten",
            age: 16,
            isGold: true
        }
    ]
// just to get the juices flowing


// function goldenOnes(x){
//     let gold =  x.filter(reindeer => reindeerList.isGold);
//     gold.array.forEach(element => {
        
//     });
// }
// console.log(goldenOnes(reindeerList));



// Find the inversion across the x axis
function findPoint(px, py, qx, qy) {
    let xDistance = qx - px;
    let yDistance = qy - py;
    console.log(qx + xDistance, qy + yDistance);
    return [qx + xDistance, qy + yDistance];
};
// findPoint(1,1,2,2);

// Find smallest traingle height with given base and area
function lowestTriangle(trianglebase, area) {


}

// Find the most expensive keyboard/drive combo
function getMoneySpent(keyboards, drives, b) {
    let kb = [keyboards];
    let dr = [drives];
    let bestprice = -1;
    for(let i = 0; i < keyboards.length; i++){
        for(let j = 0; j < drives.length; j++) {
            console.log(kb.values.length);
            console.log(keyboards[i] + " keyboard price");
            console.log(drives[j] + " drive price");
            if(keyboards[i] + drives[j] > bestprice && keyboards[i] + drives[j] <= b){
                bestprice = keyboards[i] + drives[j];
            }
        }
    }
    console.log(bestprice);
    return bestprice;
}
// getMoneySpent([1,2,3],[2,4],6);
 
// COMPLETED: C is an array of 0s and 1s. K is the number to move forward through the array. Start with 100 energy and lose 1 per 0, 3 per 1. Must land on index 0.
// function jumpingOnClouds(c, k) {
//     let energy = 100;
//     let index = 0;
//     do {
//         if((index + k > (c.length - 1) == 0)) {
//             index += k;
//             console.log("Index after jump " + index);
//             if(c[index] == 1) {
//                 energy -= 3;
//             } else {
//                 energy -=1;
//             }
//             console.log("Energy after jump " + energy);
//         } else {
//             index = k - (c.length - index);
//             console.log("Index after jump " + index);
//             if(c[index] == 1) {
//                 energy -= 3;
//             } else {
//                 energy -=1;
//             }
//             console.log("Energy after jump " + energy);
//         }
//     } while(index !== 0);
     
//     return energy;
// }
// jumpingOnClouds([0,0,1,0,0,1,1,0], 2);

// Completed
// function pageCount(n, p) {
//     let turnCount = 0;
//     if (n - p == 1 && n % 2 == 1) {
//         return turnCount;
//     } else if (p == 0 || p == 1) {
//         return turnCount;    
//     } else if(Math.abs(n - p) >= Math.abs(0 - p)){
//         for(let i = 1; i < p; i += 2) {
//             turnCount++;
//             console.log(turnCount);
//         }
//     } else if(n % 2 == 0) {
//         for(let i = n - 1; i >= p; i -= 2){
//             turnCount++;
//             console.log(turnCount);
//         }
//     } else {
//         for(let i = n - 1; i > p; i -= 2){
//             turnCount++;
//             console.log(turnCount);
//         }
//     }
//     return turnCount;
// }
// pageCount(6,5);

// COMPLETED: Array of numbers. Subtract the lowest number from all numbers on each iteration. Return array with length of OG array after each iteration
// function cutTheSticks(arr) {
//     let length = [arr.length];
//     let newArr = arr.sort(function(a, b) {
//         return a - b;
//       });
//     let flag = true;
//     while(flag) {
//         newArr = newArr.map(x => x - newArr[0]);
//         newArr = newArr.filter(x => x > 0);
//         if(newArr.length == 0) {
//             flag = false;
//         } else {
//             length.push(newArr.length);
//         }
//     }
// return length;
// }

// cutTheSticks([1,13,3,8,14,9,4,4]);

// COMPLETED: Find the fine based on due date versus return date
// function libraryFine(d1, m1, y1, d2, m2, y2) {
//     let fine = 0;
//     if(y1 > y2) {
//         fine = (y1 - y2) * 10000;
//     } else if (m1 > m2 && y1 == y2) {
//         fine = (m1 - m2) * 500;
//     } else if (d1 > d2 && m1 == m2 && y1 == y2){
//         fine = (d1 - d2) * 15;
//     }
//     return fine;
// }

// COMPLETED: Long and complicated explanation.
// function taumBday(b, w, bc, wc, z) {
//     let totalCost = BigInt(0);
//     if(bc + z < wc) {
//         totalCost = ((BigInt(bc) + BigInt(z)) * BigInt(w)) + BigInt(bc) * BigInt(b);
//     } else if (wc + z < bc) {
//         totalCost = ((BigInt(wc) + BigInt(z)) * BigInt(b)) + BigInt(wc) * BigInt(w);
//     } else {
//         totalCost = (BigInt(bc) * BigInt(b)) + (BigInt(wc) * BigInt(w));
//     }
//     console.log(BigInt(totalCost));
//     return BigInt(totalCost);
// }
// taumBday(736418699, 754161925,
//     912285746, 841360803, 736841333
//     );

// COMPLETED
// function jumpingOnClouds(c) {
//     let jumps = 0;
//     for(let i = 0; i < c.length - 1; i++) {
//         if(c[i + 2] == 0) {
//             i++;
//             jumps += 1;
//         } else {
//             jumps +=1;
//         }
//     }
//     console.log(jumps);
//     return jumps;
// }
// jumpingOnClouds([0, 0, 0, 1, 0, 0])

// COMPLETED: Take an array and find the minimum amount of elements to delete to only have the same number remaining
// function equalizeArray(arr) {
//     let mode = 1;
//     let maxMode = 1;
//     let sorted = arr.sort(function(a,b) {
//         return a - b;
//     });
//     for(let i = 0; i < sorted.length; i++){
//         if(arr[i] == arr[i + 1]){
//             mode +=1;
//             if(mode > maxMode) {
//                 maxMode = mode;
//             }
//         } else {
//             mode = 1;
//         }
//     }
//     console.log(arr.length - maxMode);
//     return arr.length - maxMode;
// }
// equalizeArray([37, 32, 97, 35, 76, 62]);


// function serviceLane(n, cases) {
//     let maxSizeArr = [];
//     let maxSizeIndividual = 0;
//     for(let lane of cases) {
//         for(let i = lane[0]; i < lane[1]; i++){
//             if(maxSizeIndividual == 0) {
//                 maxSizeIndividual = n[i];
//             } else if (maxSizeIndividual > n[i]) {
//                 maxSizeIndividual = n[i];
//             }    
//             }
//             console.log(maxSizeIndividual);
//             maxSizeArr.push(maxSizeIndividual);
//             maxSizeIndividual = 0;
//         }
//     console.log(maxSizeArr);
//     return maxSizeArr;
// }
// serviceLane([2, 3, 1, 2, 3, 2, 3, 3], [[0, 3], [4, 6], [6, 7], [3, 5], [0, 7]]);


// function serviceLane(n, cases) {
//     let maxSize = 0;
//     for(let i = cases[0]; i < cases[1]; i++) {
//         if (maxSize == 0) {
//             maxSize = n[i];
//         } else if (maxSize > cases[i]) {
//             maxSize = n[i];
//         }
//     }
//     return maxSize;
// }

// COMPLETED
// function saveThePrisoner(n, m, s) {
//     let deadGuy = 0;
//     console.log(m % n + s - 1);

//     if((m % n + s - 1) === 0){
//         console.log("t3");
//     deadGuy += n;
//     } else if((m % n + s - 1) <= n){
//         console.log("t1");
//     deadGuy = m % n + s - 1;
//     } else {
//     deadGuy = m % n + s - 1 - n; 
//     console.log("t2");
//     }
//     console.log(deadGuy);
//     return deadGuy;
// }
// saveThePrisoner(91, 111224659, 1);

// COMPLETE: Count the amount of words in a camelcase string
// function camelcase(s) {
//     let number = 1;
//     for(let i = 0; i < s.length; i++) {
//         if(s.charAt(i) === s.charAt(i).toUpperCase()) {
//             number++;
//         }
//     }
//     return number;
// }

// COMPLETED
// function minimumNumber(n, password) {
//     // Return the minimum number of characters to make the password strong
//     let changes = 0;
//     let numbers = "0123456789";
//     let lower_case = "abcdefghijklmnopqrstuvwxyz";
//     let upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//     let special_characters = "!@#$%^&*()-+";
//     let numFlag = 1;
//     let lowerFlag = 1;
//     let uppFlag = 1;
//     let specFlag = 1;
//     let lengthAdd = 0;

//     for (let number of numbers) {
//         if(password.includes(number)) {
//             numFlag = 0;
//             console.log("Number found");
//             break;
//         }
//     }
//     for (let letter of lower_case) {
//         if(password.includes(letter)) {
//             lowerFlag = 0;
//             console.log("Lower found");
//             break;
//         }
//     }
//     for (let letter of upper_case) {
//         if(password.includes(letter)) {
//             uppFlag = 0;
//             console.log("Upper found");
//             break;
//         }
//     }
//     for (let special of special_characters) {
//         if(password.includes(special)) {
//             specFlag = 0;
//             console.log("Special found");
//             break;
//         }
//     }

//     if((password.length + specFlag + uppFlag + lowerFlag + numFlag) < 6) {
//         lengthAdd = 6 - (password.length + specFlag + uppFlag + lowerFlag + numFlag);
//         console.log(lengthAdd);
//     }
//     changes = lengthAdd + specFlag + uppFlag + lowerFlag + numFlag;
//     return changes;
// }

// minimumNumber(3,"Ab1");

// 
// function insertionSort1(n, arr) {
//     let lastDigit = arr[arr.length -1];
//     let dupeIndex = arr.length -2;
//     let newArray = [];
//     for(let i = arr.length - 1; i > 0; i--){
//         if(arr[dupeIndex] > lastDigit) {
//             for(let j = arr.length - 1; j >= 0; j--) {
//                 if(j == dupeIndex + 1) {
//                     newArray.unshift(arr[j]);
//                 } else {
//                     newArray.unshift(arr[dupeIndex]);
//                     dupeIndex--;
//                 }
//         }
//         console.log(newArray);
//     };

// }
// }
// insertionSort1(5,[1,2,4,5,3]);


// COMPLETED: a is an array of 3, k is the amount of times to shift, queries are the indices after
// function circularArrayRotation(a, k, queries) {
//     let quer = [];
//     let mover;
//     for(let i = 0; i < k; i++) {
//         mover = a[a.length - 1];
//         a.pop();
//         a.unshift(mover);
//     }
//     for(let query of queries) {
//         quer.push(a[query]);
//     }
//     return quer;
// }

// COMPLETED: Can s === t in k moves?
// function appendAndDelete(s, t, k) {
//     let moves = 0;
//     if(s.length >= t.length){
//         for(let i = 0; i < s.length; i++) {
//          console.log("s@index = " + s[i]);
//          console.log("t@index = " + t[i]);
//           if(t[i] !== s[i]) {
//              moves += (t.length - i) + s.length - i;
//               console.log(moves);
//               break;
//           }
//         } 
//     } else {
//             for(let i = 0; i < t.length; i++) {
//                 console.log("s@index = " + s[i]);
//                 console.log("t@index = " + t[i]);
//                  if(t[i] !== s[i]) {
//                     moves += (t.length - i) + s.length - i;
//                      console.log(moves);
//                      break;
//         }  
// }
//     }
// if(moves === k || ((k - moves) % 2 == 0 && k > moves) || k / 2 > t.length || k - moves === 0) {
//     return "Yes";
// } else {
//     return "No";
// }
// }
// appendAndDelete("y", "yu", 2)

// COMPLETED: Find number of squares between two values
// function squares(a, b) {
//     let number = 0;
//     for(let i = Math.ceil(Math.sqrt(a))**2; i <= b; i++) {
//         if(Math.sqrt(i) % 1 === 0 ) {
//             number +=1;
//             i += Math.sqrt(i) * 2;

//         }
//     }
//     console.log(number);
//     return number;
// }
// squares(3,9);


// int shakes = 0;
// 			for(int i = n; i > 0; i--) {
// 				shakes += i - 1;
// 			}
// 			return shakes;
// Take in array of binary strings, find maximum value and mode of it
// function acmTeam(topic) {
//     let teams = topic.length;
//     let winTeams = 0;
//     let topics = 0;
//     let answer = [];

// }

// COMPLETED: Find longest string of numbers in array a that are <=1 value apart
// function pickingNumbers(a) {
//     let longest = 1;
//     let current = 1;
//     a.sort(function(a,b) {
//         return a-b;
//     });
//     let num = a[0];
//     for (let i = 0; i < a.length; i++) {
//         console.log("Num = " + a[i]);
//         console.log("Current Length = " + current);
//         if((a[i + 1] - num) <=1) {
//             current++;
//             if(current > longest) {
//                 longest = current;
//             }
//         } else {
//             num = a[i + 1]
//             current = 1;
//         }
//     }
//     console.log(longest);
//     return longest;
// }
// pickingNumbers([4,6,5,3,3,1])


// Given two arrays, find all numbers that have the first array's elements as a factor, and are a factor of the second array's elements
// function getTotalX(a, b) {
//     let answer = 0;
    
//     }


// Given an array of integers, return the amount of increases that must be done to make all numbers even. Can increase two adjacent indices by 1 per movement
// function fairRations(B) {
//     let loaves = 0;
//     console.log(B.length);
//     for(let i = 0; i < B.length; i++){
//         if(B[i] % 2 != 0){
//             B[i] +=1;
//             B[i + 1] +=1;
//             loaves += 2;
//         }
//     }
//     if(loaves == 0){
//         return "No";
//     } else {
//         return loaves;
//     }    
// }
// fairRations([1,2]);

// Return a players ranks after each attempt
function climbingLeaderboard(ranked, player) {
    let ranks = [...new Set(ranked)];
    let secondIndex = 0;
    ranks.reverse();
    let playerRanks = [];
    for(let i = 0; i < player.length; i++){
        for(let j = secondIndex; j < ranks.length; j++){
            if(player[i] < ranks[j]){
                playerRanks.push(ranks.length - j + 1)
                secondIndex = j;
                console.log("Rank Placed");
                break;
            } else if (player[i] >= ranks[ranks.length - 1]){
                playerRanks.push(1);
                secondIndex = j;
                break;
            }
        }
    }
    return playerRanks;
}
// climbingLeaderboard([100,90,90,80,75,60], [50,65,77,90,102,103])


// K is the divisor. S is array of numbers. Return maximum subset of numbers that any two of them added together are not divisible by k

function nonDivisibleSubset(k, s) {
    let longest = 0;
    for(let i = 0; i < s.length; i++){
        console.log("First loop comparison number = " + s[i]);
        let tempArray = [];
        tempArray.push(s[i]);
        longest = tempArray.length;
        for(let j = 0; j < s.length; j++){
            console.log("Second Loop comparison number = " + s[j]);
            if(j !== i){
                if((s[j] + s[i]) % k != 0){
                    if(tempArray.filter(number => (number + s[j]) % k != 0).length == tempArray.length){
                        tempArray.push(s[j]);
                        console.log("Adding " + s[j] + " to array, new value is " + tempArray);
                         if(tempArray.length > longest){
                            longest = tempArray.length;
                            console.log("New longest is " + longest);
                        }
                    } else {
                        console.log("When compared to " + s[j]);
                        console.log("These numbers do not work: " + tempArray.filter(number => (number + s[j]) % k == 0))
                    }
                }
            }
        }
    }
    console.log("Answer is = " + longest);
    return longest;
}
// function nonDivisibleSubset(k, s) {
//     let testFlag = 0;
//     let longest = 0;
//     for(let i = 0; i < s.length; i++){
//         console.log("First loop comparison number = " + s[i]);
//         let tempArray = [];
//         tempArray.push(s[i]);
//         for(let j = i + 1; j < s.length; j++){
//             console.log("Second Loop comparison number = " + s[j]);
//             testFlag = 0;
//             if((s[j] + s[i]) % k != 0){
//                 for(let p = 0; p < tempArray.length; p++){
//                     console.log("Temp Array comparison number = " + tempArray[p]);
//                     if((tempArray[p] + s[j]) % k != 0){
//                         console.log("Passed");
//                         testFlag++;
//                     } else {
//                         console.log("Discarded");
//                         break;
//                     }
//                     if(testFlag == tempArray.length){
//                         tempArray.push(s[j]);
//                         console.log("New TempArray = " + tempArray);
//                         if(tempArray.length > longest){
//                             longest = tempArray.length;
//                             console.log("New longest is " + longest);
//                         }
//                         break;
//                     }
//                 }
//             }
//         }
//     }
//     console.log("Answer is = " + longest);
//     return longest;
// }
nonDivisibleSubset(1,
    [1, 2, 3, 4, 5] );

// ACM TEAM - Problem Bugged

function acmTeam(topic) {
    let answer = [];
    let tempTopics = 0;
    let topicsKnown = 0;
    let teams = 0;
    let secondIndex = 0;
    for(let i = 0; i < topic.length; i++){
        secondIndex++;
        for(let j = secondIndex; j < topic.length; j++){
            if(topic[i].toString()[0] + topic[j].toString()[0] > 0){
                tempTopics++;
            }
            if(topic[i].toString()[1] + topic[j].toString()[1] > 0){
                tempTopics++;
            }
            if(topic[i].toString()[2] + topic[j].toString()[2] > 0){
                tempTopics++;
            }
            if(topic[i].toString()[3] + topic[j].toString()[3] > 0){
                tempTopics++;
            }
            if(topic[i].toString()[4] + topic[j].toString()[4] > 0){
                tempTopics++;
            }
            console.log("Adding " + topic[i] + " to " + topic[j] + " gives " + tempTopics);
            if(tempTopics == topicsKnown){
                teams++;
            }
            if(tempTopics > topicsKnown) {
                topicsKnown = tempTopics;
                teams = 0;
                teams++;
            }
           
            tempTopics = 0;
            console.log("Teams with most topics = " + teams);
        }
    }
    answer.push(topicsKnown);
    answer.push(teams);
    return answer;
}
// acmTeam([10101, 11100, 11010, "00101"]);

// COMPLETED: Encryption

// function encryption(s) {
//     let answer = "";
//     let index = 0;
//     let iterationCount = 0;
//     // let rows = if(Math.floor(Math.sqrt(s.length))
//     let columns = Math.ceil(Math.sqrt(s.length));
//     let rows = Math.floor(Math.sqrt(s.length)) * columns < s.length ? Math.ceil(Math.sqrt(s.length)) : Math.floor(Math.sqrt(s.length));
//     for(let i = index; i <= s.length + columns - 1 ; i += columns){
//         console.log(s.charAt(i) + " added");
//         answer = answer.concat(s.charAt(i));
//         console.log(answer);
//         iterationCount++;
//         console.log(iterationCount + " iterations");
//         console.log("i = " + i);
//         if(iterationCount == rows){
//             iterationCount = 0;
//             index++;
//             i = index - columns;
//             if(i == 0){
//                 break;
//             }
//             console.log("New Index is " + i);
//             if(answer.length != s.length + rows){
//             answer = answer.concat(" ");
//             }
//         }
//     }
//     console.log(answer);
//     return answer;
// }
// encryption("roqfqeylxuyxjfyqterizzkhgvngapvudnztsxeprfp");


// COMPLETED: find number of 3 length arrays where b-a = c-a = d. Must be in ascending order.
// function beautifulTriplets(d, arr) {
//     arr.sort((a,b) => a - b);
//     let numberOfTriplets = 0;
//     let tripFlag = 0;
//     for(let i = 0; i < arr.length; i++){
//         tripFlag = 0;
//         for(let j = i + 1; j < arr.length; j++){
//             console.log("J Loop " + arr[j]);
//             console.log("I Loop " + arr[i]);

//         if(arr[j] - arr[i] == d){
//             tripFlag++;
//             console.log("First Number is " + arr[j]);
//             console.log("Second Number is " + arr[i]);
//         }
//         if(arr[j] - arr[i] == d * 2 && tripFlag == 1){
//             console.log("First Number is " + arr[j]);
//             console.log("Second Number is " + arr[i]);
//             console.log("Triplet Found");
//             numberOfTriplets++;
//             tripFlag = 0;
//             break;
//         }
//         console.log(tripFlag);

//         }
//     }
//     console.log(numberOfTriplets);
//     return numberOfTriplets;
// }
// beautifulTriplets(3,[1, 6, 7, 7, 8, 10, 12, 13, 14, 19,]);