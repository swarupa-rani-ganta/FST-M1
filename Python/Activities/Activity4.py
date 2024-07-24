# Get the names of the users
user1 = input("What is Player 1's name? ")
user2 = input("What is Player 2's name? ")

# While looping endlessly
while True:
    # Ask User1's choice
    user1_answer = input(user1 + ", do you want to choose love, hate or friendship? ").lower()

    # Ask User2's choice
    user2_answer = input(user2 + ", do you want to choose love, hate or friendship? ").lower()

    # Run the algorithm to see who wins
    if user1_answer == user2_answer:
        print("It's a tie!")
    elif user1_answer == 'love':
        if user2_answer == 'hate':
            print("love wins!")
        else:
            print("hate wins!")
    elif user1_answer == 'friendship':
        if user2_answer == 'hate':
            print("friendship win!")
        else:
            print("hate wins!")
    elif user1_answer == 'friendship':
        if user2_answer == 'hate':
            print("love wins!")
        else:
            print("friendship win!")
    else:
        print("Invalid input! You have not entered rock, paper or scissors, try again.")

    # Ask them if they want to play again
    repeat = input("Do you want to play another round? Yes/No: ").lower()

    # If they say yes, don't do anything
    if(repeat == "yes"):
        pass
    # If they say no, exit the game
    elif(repeat == "no"):
        raise SystemExit
    # If they say anything else, exit with an error message.
    else:
        print("You entered an invalid option. Exiting now.")
        raise SystemExit
