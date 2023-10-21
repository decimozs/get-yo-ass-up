#    Develop a game that the computer is opponent. (ex: Tic
#    Tac toe; rock, paper, and scissors) (15 pts)

import random
import time

POWERS = ["rock", "paper", "scissors"]
EMOJIS = {
    "rock": "🪨",
    "paper": "📄",
    "scissors": "✂️",
    "You Win!": "🏆",
    "You Lose! Computer Wins": "😔",
    "It's a Tie!": "🤝"
}

def setComputerAttack():
    return random.choice(POWERS)

def checkTheWinner(playerAttack, computerAttack):
    if playerAttack == computerAttack:
        return "It's a Tie!"
    if (
            (playerAttack == "rock" and computerAttack == "scissors") or
            (playerAttack == "scissors" and computerAttack == "paper") or
            (playerAttack == "paper" and computerAttack == "rock")
    ):
        return "You Win!"
    return "You Lose! Computer Wins"

def text(message, delay=0.1):
    for char in message:
        print(char, end='', flush=True)
        time.sleep(delay)
    print()

def main():
    while True:
        print("Rock 🪨, Paper 📄 and Scissors ✂️")
        playerAttack = input("Choose your attack:").lower()

        if playerAttack == 'q':
            print("👋 Thank you for playing! 👋")
            break

        if playerAttack not in POWERS:
            print("Invalid Choice! Please enter a valid attack.")
            continue;

        for i in range(1, 4):
            time.sleep(1)
            print(i)

        computerAttack = setComputerAttack()
        print("\n\n\n")
        userEmote = EMOJIS.get(playerAttack, "")
        computerEmote = EMOJIS.get(computerAttack, "")
        result = checkTheWinner(playerAttack, computerAttack)
        resultEmote = EMOJIS.get(result, "")
        text(f"🟢 The user uses {playerAttack} {userEmote}.")
        text(f"🔴 The computer uses {computerAttack} {computerEmote}.")
        text(f"{resultEmote} {result} ")

        print("\n\n\n")

if __name__ == "__main__":
    main()
