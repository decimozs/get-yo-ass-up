from Martin import Fraction

def solve_fraction():
    while True:
        try:
            numerator = int(input("[X]ENTER THE NUMERATOR: "))
            break
        except ValueError:
            print("PLEASE ENTER A VALID INTEGER FOR NUMERATOR!\n")
    
    while True:
        try:
            denominator = int(input("[Y]ENTER THE DENOMINATOR: "))
            break
        except ValueError:
            print("PLEASE ENTER A VALID INTEGER FOR DENOMINATOR!\n")
    
    print("\n")
    return Fraction(numerator, denominator)

def res_fract_add(fraction1, fraction2):
    res_add = fraction1 + fraction2
    print("ADDITION: ", res_add)
    
def res_fract_multiply(fraction1, fraction2):
    res_multiply = fraction1 * fraction2
    print(f"MULTIPLICATION: {res_multiply}")  
    
def res_fract_equal(fraction1, fraction2):
    res_equal = fraction1 == fraction2
    print(f"EQUALITY: {res_equal}")
    
def res_fract_lessThan(fraction1, fraction2):
    res_less_than = fraction1 < fraction2
    print(f"IS LESS THAN: {res_less_than}")
    
def main():
    print("[FRACTION EXERCISES]\n")
    print("[FRACTION 1]")
    fract1 = solve_fraction()
    print("[FRACTION 2]")
    fract2 = solve_fraction()
    
    print("[RESULT OUTPUT]\n")
    
    print("LOWEST TERM")
    print(f"FRACTION 1: {fract1}")
    print(f"FRACTION 2: {fract2}\n")
    
    res_fract_add(fract1, fract2)
    
    res_fract_multiply(fract1, fract2)
    
    res_fract_equal(fract1, fract2)
    
    res_fract_lessThan(fract1, fract2)

if __name__ == '__main__':
    main()
