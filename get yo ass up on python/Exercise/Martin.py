from math import gcd

class Fraction:
    def __init__(self, numerator, denominator):
        if denominator == 0:
            raise ValueError("Denominator cannot be zero.")
            
        result_gcd = gcd(numerator, denominator)
        
        self.numerator = numerator // result_gcd
        self.denominator = denominator // result_gcd
        
    def __str__(self):
        if self.denominator == 1:
            return str(self.numerator)
        else:
            return f"{self.numerator} / {self.denominator}"
        
    def add(self, other):
        ex_numerator = self.numerator * other.denominator + other.numerator * self.denominator
        ex_denominator = self.denominator * other.denominator
        return Fraction(ex_numerator, ex_denominator)
    
    def multiply(self, other):
        ex_numerator = self.numerator * other.numerator
        ex_denominator = self.denominator * other.denominator
        return Fraction(ex_numerator, ex_denominator)
        
    def __add__(self, other):
        return self.add(other)
        
    def __mul__(self, other):
        return self.multiply(other)
        
    def __eq__(self, other):
        return (self.numerator == other.numerator) and (self.denominator == other.denominator)
        
    def __lt__(self, other):
        return (self.numerator * other.denominator) < (other.numerator * self.denominator)
