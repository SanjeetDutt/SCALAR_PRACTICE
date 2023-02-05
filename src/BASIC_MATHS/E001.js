/**
 * a^b % m
 * finding remainder of a^b
 */


const main = (a,b,m) =>{
    console.log(`FINDING REMAINSER OF ${a} ^ ${b} % ${m}`)
    return findRemainder({a,b,m}, 0)
}

// Counter to count the iterations for time complexcity
const findRemainder = ({a, b, m}, counter) => {

    console.log("Iteration : " + ++counter)

    if(b===1){
        return a%m
    }

    if(a > m){
        a = a%m
    }

    if(b%2 === 0){
        return findRemainder({
            a : a*a,
            b : b/2,
            m : m
        }, counter)
    } else {
        return (a * findRemainder({
            a : a * a,
            b : (b-1) / 2,
            m : m
        }, counter)) % m
    }

}




module.exports = main

