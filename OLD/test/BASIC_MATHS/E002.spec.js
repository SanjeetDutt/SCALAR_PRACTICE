const fn = require("../../src/BASIC_MATHS/E002.js")

test("Find count of sub array which are divisible by M", () =>{


    expect(fn([2,7,5,10,8,4,6,11],5)).toBe(5)
    expect(fn([2,7,5,10,8,4,6,11,2,34,865,5,67,8,9,0,12,56,1,8,48,219,4,5,6,27,44],5)).toBe(36)

    expect(fn([2,7,5,10,8,4,6,11,9,3,9,15],6)).toBe(9)
    expect(fn([2,7,5,10,8,4,6,11,2,34,865,5,67,8,9,0,12,56,1,8,48,219,4,5,6,27,44],8)).toBe(19)

})

