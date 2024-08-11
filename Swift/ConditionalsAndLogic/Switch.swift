var checked: Bool = true

// We will perform a simple if-else statement
// Output: Checked!
if (checked) 
{
    print("Checked!")
}
else 
{
    print("Unchecked!")
}

var number: Int = 23

// We will perform a switch statement with dotted notations
// Output: Twenties
switch number 
{
    case 0...9:
        print("Singles")
    case 10...19:
        print("Tens/Teens")
    case 20...29:
        print("Twenties")
    case 30...39:
        print("Thirties")
    case 40...49:
        print("Forties")
    case 50...59:
        print("Fifties")
    case 60...69:
        print("Sixties")
    case 70...79:
        print("Seventies")
    case 80...89:
        print("Eighties")
    case 90...99:
        print("Nineties")
    default:
        print("Other")
}