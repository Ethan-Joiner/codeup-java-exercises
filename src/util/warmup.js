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
};
// getMoneySpent([1,2,3],[2,4],6);
 
// COMPLETED: C is an array of 0s and 1s. K is the number to move forward through the array. Start with 100 energy and lose 1 per 0, 3 per 1. Must land on index 0.
function jumpingOnClouds(c, k) {
    let energy = 100;
    let index = 0;
    do {
        if((index + k > (c.length - 1) == 0)) {
            index += k;
            console.log("Index after jump " + index);
            if(c[index] == 1) {
                energy -= 3;
            } else {
                energy -=1;
            }
            console.log("Energy after jump " + energy);
        } else {
            index = k - (c.length - index);
            console.log("Index after jump " + index);
            if(c[index] == 1) {
                energy -= 3;
            } else {
                energy -=1;
            }
            console.log("Energy after jump " + energy);
        }
    } while(index !== 0);
     
    return energy;
}
jumpingOnClouds([0,0,1,0,0,1,1,0], 2);

// Completed
function pageCount(n, p) {
    let turnCount = 0;
    if (n - p == 1 && n % 2 == 1) {
        return turnCount;
    } else if (p == 0 || p == 1) {
        return turnCount;    
    } else if(Math.abs(n - p) >= Math.abs(0 - p)){
        for(let i = 1; i < p; i += 2) {
            turnCount++;
            console.log(turnCount);
        }
    } else if(n % 2 == 0) {
        for(let i = n - 1; i >= p; i -= 2){
            turnCount++;
            console.log(turnCount);
        }
    } else {
        for(let i = n - 1; i > p; i -= 2){
            turnCount++;
            console.log(turnCount);
        }
    }
    return turnCount;
}
// pageCount(6,5);

// COMPLETED: Array of numbers. Subtract the lowest number from all numbers on each iteration. Return array with length of OG array after each iteration
function cutTheSticks(arr) {
    let length = [arr.length];
    let newArr = arr.sort(function(a, b) {
        return a - b;
      });
    let finalArr = [];
    let flag = true;
    while(flag) {
        newArr = newArr.map(x => x - newArr[0]);
        newArr = newArr.filter(x => x > 0);
        if(newArr.length == 0) {
            flag = false;
        } else {
            length.push(newArr.length);
        }
    }
return length;
}

// cutTheSticks([1,13,3,8,14,9,4,4]);

// COMPLETED: Find the fine based on due date versus return date
function libraryFine(d1, m1, y1, d2, m2, y2) {
    let fine = 0;
    if(y1 > y2) {
        fine = (y1 - y2) * 10000;
    } else if (m1 > m2 && y1 == y2) {
        fine = (m1 - m2) * 500;
    } else if (d1 > d2 && m1 == m2 && y1 == y2){
        fine = (d1 - d2) * 15;
    }
    return fine;
}

// Long and complicated explanation.
function taumBday(b, w, bc, wc, z) {
    let totalCost = BigInt(0);
    if(bc + z < wc) {
        totalCost = BigInt((bc * w) + (bc * b) + (z * w));
    } else if (wc + z < bc) {
        totalCost = BigInt((wc * b) + (wc * w) + (z * b));
    } else {
        totalCost = BigInt((bc * b) + (wc * w));
    }
    console.log(totalCost);
    return totalCost;
}
// taumBday(736418699, 754161925,
//     912285746, 841360803, 736841333);

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
function equalizeArray(arr) {
    let mode = 1;
    let maxMode = 1;
    let sorted = arr.sort(function(a,b) {
        return a - b;
    });
    for(let i = 0; i < sorted.length; i++){
        if(arr[i] == arr[i + 1]){
            mode +=1;
            if(mode > maxMode) {
                maxMode = mode;
            }
        } else {
            mode = 1;
        }
    }
    console.log(arr.length - maxMode);
    return arr.length - maxMode;
}
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


function saveThePrisoner(n, m, s) {
    let deadGuy = 0;
    deadGuy = m % n + s - 1;
    console.log(deadGuy);
    return deadGuy;
}
// saveThePrisoner(2, 1, 1);

// COMPLETE: Count the amount of words in a camelcase string
function camelcase(s) {
    let number = 1;
    for(let i = 0; i < s.length; i++) {
        if(s.charAt(i) === s.charAt(i).toUpperCase()) {
            number++;
        }
    }
    return number;
}

// COMPLETED
function minimumNumber(n, password) {
    // Return the minimum number of characters to make the password strong
    let changes = 0;
    let numbers = "0123456789";
    let lower_case = "abcdefghijklmnopqrstuvwxyz";
    let upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    let special_characters = "!@#$%^&*()-+";
    let numFlag = 1;
    let lowerFlag = 1;
    let uppFlag = 1;
    let specFlag = 1;
    let lengthAdd = 0;

    for (let number of numbers) {
        if(password.includes(number)) {
            numFlag = 0;
            console.log("Number found");
            break;
        }
    }
    for (let letter of lower_case) {
        if(password.includes(letter)) {
            lowerFlag = 0;
            console.log("Lower found");
            break;
        }
    }
    for (let letter of upper_case) {
        if(password.includes(letter)) {
            uppFlag = 0;
            console.log("Upper found");
            break;
        }
    }
    for (let special of special_characters) {
        if(password.includes(special)) {
            specFlag = 0;
            console.log("Special found");
            break;
        }
    }

    if((password.length + specFlag + uppFlag + lowerFlag + numFlag) < 6) {
        lengthAdd = 6 - (password.length + specFlag + uppFlag + lowerFlag + numFlag);
        console.log(lengthAdd);
    }
    changes = lengthAdd + specFlag + uppFlag + lowerFlag + numFlag;
    return changes;
}

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
function circularArrayRotation(a, k, queries) {
    let quer = [];
    let mover;
    for(let i = 0; i < k; i++) {
        mover = a[a.length - 1];
        a.pop();
        a.unshift(mover);
    }
    for(let query of queries) {
        quer.push(a[query]);
    }
    return quer;
}

// Can s === t in k moves?
function appendAndDelete(s, t, k) {
    // let moves = 0;
    // for(let i = 0; i < s.length; i++) {
    //     if(t[i] == null) {
    //         moves +=1;
    //         console.log("Empty space, +1");
    //         console.log(moves);
    //     } else if (t[i] !== s[i]){
    //         moves +=2;
    //         console.log("Wrong, +2");
    //         console.log(moves);
    //     }
    // }
    // if(moves === k || (k - moves) % 2 == 0 || k / 2 > t.length) {
    //     return "Yes";
    // } else {
    //     return "No";
    // }
}
appendAndDelete("aaaaaaaaaa","aaaaa", 7)

