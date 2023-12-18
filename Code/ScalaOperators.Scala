object ScalaOperators{
    def main(args: Array[String]): Unit = {

        //Arithmetic Operators
        var x : Int =10
        var y : Int =3
        println("x+y: " +(x+y))
        println("x-y: "+(x-y))
        println("x*y: "+(x*y))
        println("x%y: "+(x%y))
        println("x/y: "+(x/y)) // integer devision
        // println("x**y: "+(x**y))
        println()

        //Relational Operators
        var a = 50;
        var b = 30;
        // Equal to operator
        println("Equality of a == b is : " + (a == b));
        // Not equal to operator
        println("Not Equals of a != b is : " + (a != b));
        // Greater than operator
        println("Greater than of a > b is : " + (a > b));
        // Lesser than operator
        println("Lesser than of a < b is : " + (a < b));
        // Greater than equal to operator
        println("Greater than or Equal to of a >= b is : " + (a >= b));
        // Lesser than equal to operator
        println("Lesser than or Equal to of a <= b is : " + (a <= b));
        println()

        // Logical Operators
        var a1 = false
        var b1 = true
        // logical NOT operator
        println("Logical Not of !(a1 && b1) = " + !(a1 && b1));
        // logical OR operator
        println("Logical Or of a1 || b1 = " + (a1 || b1));
        // logical AND operator
        println("Logical And of a1 && b1 = " + (a1 && b1));
        println()

        // Assignment Operator
        var a2 = 50;
        var b2 = 40;
        var c = 0;
        // simple addition
        c = a2 + b2;
        println("simple addition: c= a2 + b2 = " + c);
        // Add AND assignment
        c += a2;
        println("Add and assignment of c += a2 = " + c);
        // Subtract AND assignment
        c -= a2;
        println("Subtract and assignment of c -= a2 = " + c);
        // Multiply AND assignment
        c *= a2;
        println("Multiplication and assignment of c *= a2 = " + c);
        // Divide AND assignment
        c /= a2;
        println("Division and assignment of c /= a2 = " + c);
        // Modulus AND assignment
        c %= a2;
        println("Modulus and assignment of c %= a2 = " + c);
        // Left shift AND assignment
        c <<= 3;
        println("Left shift and assignment of c <<= 3 = " + c);
        // Right shift AND assignment
        c >>= 3;
        println("Right shift and assignment of c >>= 3 = " + c);
        // Bitwise AND assignment
        c &= a2;
        println("Bitwise And assignment of c &= 3 = " + c);
        // Bitwise exclusive OR and assignment
        c ^= a2;
        println("Bitwise Xor and assignment of c ^= a2 = " + c);
        // Bitwise inclusive OR and assignment
        c |= a2;
        println("Bitwise Or and assignment of c |= a2 = " + c);
        println()

        // Bitwise Operator
        var a3 = 20;
        var b3 = 18;
        var c2 = 0;
        // Bitwise AND operator
        c2 = a3 & b3;
        println("Bitwise And of a3 & b3 = " + c2);
        // Bitwise OR operator
        c2 = a3 | b3;
        println("Bitwise Or of a3 | b3 = " + c2);
        // Bitwise XOR operator
        c2 = a3 ^ b3;
        println("Bitwise Xor of a3 ^ b3 = " + c2);
        // Bitwise once complement operator
        c2 = ~a3;
        println("Bitwise Ones Complement of ~a3 = " + c2);
        // Bitwise left shift operator
        c2 = a3 << 3;
        println("Bitwise Left Shift of a3 << 3 = " + c2);
        // Bitwise right shift operator
        c2 = a3 >> 3;
        println("Bitwise Right Shift of a3 >> 3 = " + c2);
        // Bitwise shift right zero fill operator
        c2= a3 >>> 4;
        println("Bitwise Shift Right a3 >>> 4 = " + c2);
        println()
    }
}