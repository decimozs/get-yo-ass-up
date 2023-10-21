#    Write a function that will reverse the string. Use this
#    function to check if the input string is palindrome.

def reverse_string(word):
    return word[::-1]

def is_palindrome(word):
    reversed_word = reverse_string(word)
    return word == reversed_word

def main():
    word = input("Please enter a word: ")
    if is_palindrome(word):
        print("The word is a palindrome.")
    else:
        print("The word is not a palindrome.")

    print("Word: " + word)
    print("Reversed Word: " + reverse_string(word))

if __name__ == "__main__":
    main()

