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
 
// C is an array of 0s and 1s. K is the number to move forward through the array. Start with 100 energy and lose 1 per 0, 3 per 1. Must land on index 0.
// function jumpingOnClouds(c, k) {
//     let energy = 100;
//     for(let i = 0; i < c.length; i += k){
//         if(c[i] === 1) {
//             energy -= 3;
//         } else {
//             energy -=1;
//         }
//     }
//     console.log(energy);
//     console.log(10 % 3);
//     return energy;
// }
// jumpingOnClouds([0,0,1,0,0,1,1,0], 2);


function pageCount(n, p) {
    let turnCount = 0;
    if(Math.abs(n - p) > Math.abs(0 - p)){
        for(let i = 0; i < p; i += 2) {
            turnCount++;
            console.log(turnCount);
        }
    } else {
        for(let i = n; i > p; i -= 2){
            turnCount++;
            console.log(turnCount);
        }
    }
    return turnCount;
}
pageCount(6,2);

