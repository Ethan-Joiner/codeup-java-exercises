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

// COMPLETED: Find smallest traingle height with given base and area
// function lowestTriangle(trianglebase, area) {
//     console.log(area / trianglebase);
//     if(area / trianglebase % 1 == 0){
//     console.log("Doubling " + area/trianglebase + " to get " + (area/trianglebase) * 2);
//     return Math.ceil(area / trianglebase) * 2;
//     } else {
//     console.log("*Decimal Doubling " + area/trianglebase + " to get " + (area/trianglebase) * 2);
//     return Math.ceil((area / trianglebase) * 2);
//     }
// }
// lowestTriangle(3,4);
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

// function nonDivisibleSubset(k, s) {
//     let longest = 1;
//     for(let i = 0; i < s.length; i++){
//         console.log("First loop comparison number = " + s[i]);
//         let tempArray = [s[i]];
//         for(let j = 0; j < s.length; j++){
//             console.log("Second Loop comparison number = " + s[j]);
//             if(j !== i){
//                     if(tempArray.filter(number => (number + s[j]) % k != 0).length == tempArray.length){
//                         tempArray.push(s[j]);
//                         console.log("Adding " + s[j] + " to array, new value is " + tempArray);
//                          if(tempArray.length > longest){
//                             longest = tempArray.length;
//                             console.log("New longest is " + longest);
//                         }
//                     } else {
//                         console.log("When compared to " + s[j]);
//                         console.log("These numbers do not work: " + tempArray.filter(number => (number + s[j]) % k == 0))
//                     }
//             }
//         }
//     }
//     console.log("Answer is = " + longest);
//     return longest;
// }
function nonDivisibleSubset(k, s) {
    let longest = 1;
    let index = 0;
    for(let i = 0; i < s.length; i++){
        console.log("First loop comparison number = " + s[i]);
        let tempArray = [s[i]];
        for(let j = 0; j < s.length; j++){
            console.log("Second Loop comparison number = " + s[j]);
            if(j !== i){
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
    console.log("Answer is = " + longest);
    return longest;
}
// nonDivisibleSubset(9,[422346306, 940894801, 696810740, 862741861, 85835055, 313720373] );

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


// COMPLETE: Mars Exploration

// function marsExploration(s) {
//     let answer = 0;
//     for(let i = 0; i < s.length; i++){
//         if((i == 1 || (i - 1) % 3 == 0) && s[i] !== "O"){
//             console.log("Illegal Character " + s[i] + " at index " + i);
//             answer++;
//         } else if ((i - 1) % 3 !== 0 && s[i] !== "S"){
//             console.log("!Illegal Character " +  s[i] + " at index " + i);
//             answer++;
//         }
//     }
//     console.log(answer);
//     return answer;
// }
// marsExploration("SOSSPSSQSSOR");

// COMPLETED: A is an array of numbers, can they (or the integers that comprise them) be rearranged into a new number divisible by 3?

function canConstruct(a) {
    let answer = "No";
    let numString = 0;
    for(let i = 0; i < a.length; i++){
        numString += (a[i]);
    }
    if(numString % 3 == 0){
        answer = "Yes";
    }
    return answer;
}
// canConstruct([344965
// ]);

// Cut into largest squares
function restaurant(l, b) {
    let answer = l * b;
    if(Math.sqrt(l * b) % 1 == 0){
        answer = 1;
    } else if(Math.sqrt(l) % 1 == 0){
        answer = b;
    } else if (Math.sqrt(b) % 1 == 0) {
        answer = l;
    }
    console.log(answer);
    return answer;
}
// restaurant(344, 734);

// COMPLETED
// function strangeGrid(r, c) {
//     let evenRowAdds = [1,3,5,7,9];
//     let oddRowAdds = [0,2,4,6,8];
//     let answer = 0;
//     if (r == 1){
//         answer = oddRowAdds[c - 1];
//     } else if(r % 2 == 0) {
//         answer = ((r / 2) - 1) * 10 + evenRowAdds[c - 1];
//     } else {
//         answer = (Math.floor(r / 2) * 10) + oddRowAdds[c - 1];
//     }
//     return answer;
// }

// 
function connectingTowns(n, routes) {
    let answer = 1;
    for(let i = 0; i < n - 1; i++){
        answer =  (answer * routes[i]) % 1234567;
        console.log(answer);
    }
    console.log(answer);
    return answer % 1234567;
}
// connectingTowns(11, [473, 264, 845, 374, 782, 809, 188, 35, 253, 635]);


// COMPLETE: Given dimensions n and m, find how many points are required to touch every square
function gameWithCells(n, m) {
    return Math.ceil(n / 2) * Math.ceil(m / 2);
}

// Find maximum number of prime factors in a range of 1 to n
function isPrime(n){
    if(n != 1 && n % 5 != 0 && (n == 2 || n == 3 || n % 6 == 1 || (n + 1) % 6 == 0) && Math.sqrt(n) % 1 != 0){
        return true;
    }
}
function primeCount(n) {
    console.log(BigInt(n));
    let count = 0;
    let currentHigh = BigInt(1);
    if(n == 1){
        return count;
    } else if(n < 6){
        count = 1;
    } else if (n < 30) {
        count = 2;
    } else {
    count = 3;
    currentHigh = 30;
    for(let i = 7; i <= n; i++ ){
        console.log(i + " is prime: " + isPrime(i));
        if(isPrime(i)){
            currentHigh = BigInt(currentHigh) * BigInt(i);
            i++;
            console.log("Current number is " + currentHigh);
            console.log("Number is " + BigInt(n));
            if(currentHigh <= BigInt(n)){
                count++;
                console.log("Count increased to " + count);
            } else {
                break;
            }
        }
    }
}
    console.log(count);
    return count;
}
// primeCount( 614889782588491409
//     );

// Take an array of coordinates and find the furthest two points apart
function solve(coordinates) {
    let biggestX = coordinates[0][0];
    let biggestY = coordinates[0][1];
    let smallestX = coordinates[0][0];
    let smallestY = coordinates[0][1];
    let answer = 0;
    let hypot = 0;
    for(let i = 0; i < coordinates.length; i ++){
        if(coordinates[i][0] > biggestX) {
            biggestX = coordinates[i][0];
        }
        if(coordinates[i][1] > biggestY) {
            biggestY = coordinates[i][1];
        }
        if(coordinates[i][0] < smallestX) {
            smallestX = coordinates[i][0];
        }
        if(coordinates[i][1] < smallestY) {
            smallestY = coordinates[i][1];
        }
    }
    hypot = Math.sqrt(Math.pow(biggestX - smallestX,2) + Math.pow(biggestY - smallestY,2));
    if(Math.abs(biggestX - smallestX) == Math.abs(biggestY - smallestY)){
        answer = Math.abs(biggestX - smallestX);
    } else if (Math.abs(biggestX - smallestX) < hypot && Math.abs(biggestY - smallestY) < hypot){
        answer = hypot;
    } else if (Math.abs(biggestX - smallestX) > Math.abs(biggestY - smallestY)){
        answer = Math.abs(biggestX - smallestX);
    } else {   
        answer = Math.abs(biggestY - smallestY)
}
console.log(answer);
return answer;
}
// solve([[0, -5],
//     [-7, 0],
//     [0, -6],
//     [-4, 0],
//     [0, 0]]);
// solve([[-1, 0],
//         [1, 0],
//         [0, -1],
//         [0, 1]]);

// Can a and b buckets equal exactly c? Die hard 3
function solve(a, b, c) {
    if(a == c || b == c){
        return "YES";
    } else if ((a + b) % c == 0){
        return "YES"
    } else {
        return "NO"
    }
}
// solve(131, 264, 30)

// COMPLETED
function solve(n, operations) {
    let arr = new Array(n);
    let total = 0;
    for(let i = 0; i < operations.length; i++){
        console.log("Array " + (i + 1));
        console.log(operations[i][1] + " - " + operations[i][1] + " * " + operations[i][2]);
        total += (operations[i][1] - operations[i][0] + 1) * operations[i][2];

    console.log("Final total = " + total);
    console.log(total / n);
    return Math.floor(total / n);
}
}
// solve(4, [[2, 3, 603],
//     [1, 1, 286],
//     [4, 4, 882]])

// COMPLETED: Return IsFibo is n is part of the fibonacci sequence, else IsNotFibo
function isFibo(n) {
    if(Math.sqrt(5 * n * n + 4) % 1 == 0 || Math.sqrt(5 * n * n - 4) % 1 == 0 || n == 0 || n == 1){
        return "isFibo";
    } else {
        return "isNotFibo";
    }
}
// isFibo(8);

// COMPLETED: Price of burger, price of soda, price of combo. Find fixed profit added
function profit(b, s, c) {
    return b + s - c
}

// Number of jumps
function solve(n) {
    let jumps = 0;
    let position = 0;
    while(position < n){
        jumps++;
        position += jumps;
        console.log("Jump distance = " + jumps);
        console.log("New Position = " + position);
        console.log("# of jumps = " + jumps);
    }
    if(position == n){
        console.log("Pass");
        return "Go On Bob " + jumps; 
    } else {
        console.log("Fail");
        return "Better Luck Next Time"; 
    }
}
// solve(3);

// COMPLETED:
// function solve(balls) {
//     let total = 0;
// for(let ball of balls){
//     total += ball;
// }
// return total / 2;
// }

// 
function solve(a, m) {
let x = Math.sqrt(a);
}
// solve(2,2)

// Output the multiple of x that is closest to a^b. If multiple answers, display the smallest one
// function closestNumber(a, b, x) {
//     let inc = 1;
//     let comparitor = Math.pow(a,b);
//     if (comparitor % x == 0){
//         return comparitor;
//     } else if (comparitor < 1){
//         return 0;
//     }
//     while(true){
//         if ((comparitor - inc) % x == 0) {
//             console.log("Decrease to " + (comparitor - inc));
//             return comparitor - inc;
//         } else if ((comparitor + inc) % x == 0) {
//             console.log("Increase to " + comparitor + inc);
//             return comparitor + inc;
//         }
//         inc++;
//     }
// }

// COMPLETED: 
function closestNumber(a,b,x){
    let comparitor = Math.pow(a,b);
    let higher = Math.ceil(comparitor / x) * x;
    console.log(higher);
    let lower = Math.floor(comparitor / x) * x;
    console.log(lower);
    if((higher - comparitor) < Math.abs(lower - comparitor)){
        console.log("Returning higher value of " + higher);
        return higher;
    } else {
        console.log("Returning lower value of " + lower);
        return lower;
    }
}

// closestNumber(674, 2, 6)

// COMPLETE:
function summingSeries(n) {
    let total = 0;
    let start = 1;
    // for(let i = 1; i <= n; i++){
    //     console.log(Math.pow(i,2) + " - " + Math.pow(i-1,2) + " = " + Math.pow(i,2) - Math.pow((i - 1),2) % (Math.pow(10,9) + 7));
    //     total += Math.pow(i,2) - Math.pow((i - 1),2) % (Math.pow(10,9) + 7);
    // }
    // for(let i = 1; i <= n; i++){
    //     total += start % (Math.pow(10,9) + 7);
    //     start += 2;
    // }
    console.log((BigInt(n) * BigInt(n)) % BigInt((Math.pow(10,9) + 7)));
    return (n % (Math.pow(10,9) + 7)) * n % (Math.pow(10,9) + 7);

}
// summingSeries(9803332417649065
//     );

// Find multiple of N made of only 0 and 9
function solve(n) {
    if(n == 3 || n == 9){
        return 9;
    }
    let inc = 1;
    let len = n.toString().length;
    let start;
    while(true){
        start = Math.floor(9 * Math.pow(10,len) / n);
        console.log(start);
        break;


    }
}
// solve(5);

// How many divisors of N are evenly divisible by 2?
function divisors(n) {
    let count = 0;;
    if(n % 2 == 0){
        for (let i = 1; i < Math.sqrt(n) + 1; i++) {
            if ((i % 2 == 0) && (n % i == 0)){
            console.log("First if inc, counting " + i);
                count++;
            }
            if ((n % (n / i) == 0) && (n / i) % 2 == 0){
            console.log("if " + n + " % " + n + " / " + i + " has no remainder, counting " + i);
                count++;
            }
            if (((i * i == n) || (i * (i + 1) == n)) && (i % 2 == 0)){
            console.log("Third if dec, subtracting " + i);
                count--;
            }
        }
    } else {
        count = 0;
    }
    console.log(count);
    return count;
}
// divisors(40);

// Find a ^ b % 10^9 + 7
// function solve(a, b) {
//     let a2 = a % (Math.pow(10,9) + 7);
//     console.log(a2);
//     let b2 = b % (Math.pow(10,9) + 7);
//     console.log(b2);
//     let c = (BigInt(a2) ** BigInt(b2)).toString();
//     console.log(c);
//     return (Math.pow(BigInt(a2),BigInt(b2)))
// }
// solve(34543987529435983745230948023948, 3498573497543987543985743989120393097595572309482304)


// Reverse Game
// function solve(n,k){
//     let nArray = [];
//     let finalArray = [];
//     for(let i = 0; i < n; i++){
//         nArray.push(i);
//     }
//     for(let i = 0; i < n; i++){
//         console.log("Manipulated array = " + nArray);
//         nArray.reverse();
//         console.log("Manipulated array reversed = " + nArray);
//         finalArray.push(nArray[0]);
//         console.log("Final array = " + finalArray);
//         nArray.shift();
//     }
//     for(let i = 0; i < n; i++){
//         if(finalArray[i] == k){
//             console.log(i);
//             return i;
//         }
//     }
// }
// solve(5, 2)



// function solve(arr, queries) {
//     function find( x, y)
//     {
//         if(x>y){ return 1;}
//         let ans = Math.pow(arr[x],find(x+1,y))
//         return ans;
//     }
//         let answer = [];
//         for(let i = 0; i < queries.length; i++){
//             console.log(find(queries[i][0] - 1, queries[i][1] - 1));
//             if(find(arr[queries[i][0] - 1], arr[queries[i][1] - 1]) % 2 == 0){
//                 answer.push("Even")
//             } else {
//                 answer.push("Odd")
//             }
//         }
//         console.log(answer);
//         return answer;
//     }
// function solve(arr, queries) {
//     let answer = [];
//     for(let i = 0; i < queries.length; i++){
        
//         if(queries[i][0] > queries[i][1]){
//             answer.push("Odd");
//             break;
//         }
//         if(arr[queries[i][0] - 1] % 2 == 0){
//             console.log("Even");
//             answer.push("Even")
//         } else {
//             answer.push("Odd")
//         }
//         } 
//     console.log(0 % 2);
//     console.log(Math.pow(2,7));
//     return answer;
// }
            
// solve([6, 5, 6, 9, 3, 7, 4, 5, 2, 5, 4, 7, 4, 4, 3, 0, 8, 8, 6, 8, 8, 4, 3, 1, 4, 9, 2, 0, 9, 8, 9, 2, 6, 6, 4, 9, 5, 0, 3, 8, 7, 1, 7, 2, 7, 2, 2, 6, 1, 0, 9, 1, 5, 9, 4, 9, 0, 7, 1, 7, 7, 1, 1, 5, 9, 7, 7, 6, 7, 3, 6, 5, 6, 3, 9, 4, 8, 1, 2, 9, 3, 9, 0, 1, 8, 5, 0, 4, 6, 3, 8, 5, 6, 1, 1, 5, 9, 8, 4, 8],[[
    
//     42, 51],
// [1, 94],
// [35, 65],
// [15, 25],
// [57, 88],
// [44, 92],
// [28, 66],
// [37, 60],
// [33, 52],
// [29, 38],
// [8, 76],
// [22, 75],
// [59, 96],
// [30, 38],
// [36, 94],
// [19, 29],
// [12, 44]])


function solve(a, queries) {
    let answer = [];
    for(let i = 0; i < queries.length; i++){
        let sals = a;
        sals = sals.map(x => x + queries[i]);
        sals.sort((b,c) => b - c);
        if(sals[0] % 2 == 0){
        answer.push(sals[0] / 2)
        } else {
            answer.push(sals[0]);

        }
    }
    return answer;
}
   

