const fn = require("../../src/BASIC_MATHS/E001.js")

test("Finding remainder of a^b % m", () =>{


    expect(fn(3,20,11)).toBe(1) // T(0) = 5
    expect(fn(87,20000,97)).toBe(61) // T(0) = 15

})
