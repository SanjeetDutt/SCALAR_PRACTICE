/**
 * Given an array A, and we need to tell total count of sub array which is divisible by B
 */


const main = (A,B) => {

    /**
     * 1. let sub array = (a,b)
     * 2. (a+b)%B == 0
     * 3. (a%B + b%B)%B == 0
     */

    // find remainder object key=> remainder, value=> main values

    const remainderTable = generateRemainderTable(A,B)
    console.log("REMAINDER TABLE", remainderTable)

    let count = 0

    if(B % 2 === 0) {
        // find combination of 0, (B+1)/2
        count += findCombination(remainderTable[0])
        count += findCombination(remainderTable[B/2])

        // find pair count 1 to (B-1)/2
        for(let i=1; i<(B)/2; i++){
            count += findPairCount(remainderTable[i] , remainderTable[B-i])
        }
    } else {
        // find combination of 0
        count += findCombination(remainderTable[0])

        // find pair count 1 to B/2
        for(let i=1; i<B/2; i++){
            count += findPairCount(remainderTable[i] , remainderTable[B-i])
        }
    }

    console.log("TOTAL COUNT : " , count)
    return count
}

const generateRemainderTable = (A,B) => {
    const remainderTable = {}

    A.forEach(a=>{
        const rem = a%B

        if(!remainderTable[rem])
            remainderTable[rem] = [a]

        else if(!remainderTable[rem].includes(a))
            remainderTable[rem].push(a)


    })

    return remainderTable
}

const findCombination = A => {
    if(!A)
        return 0
    const length = A.length
    return (length * (length-1)) / 2
}

const findPairCount = (a,b) =>{
    if(!a || !b)
        return 0
    return a.length * b.length
}

module.exports = main
