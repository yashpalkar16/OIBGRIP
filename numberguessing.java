package com.Yash;
import java.util.Scanner;

public class number {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int rounds = 0;
    int totalScore = 0;
    int totalAttempts = 0;
    final int attemptsLimit = 7;
    while (true) {
      int number = (int) (Math.random() * 100) + 1;
      int guess;
      int score;
      int attempts = 0;
      System.out.println("Round " + (rounds + 1));
      do {
        System.out.print("Enter a guess (1-100): ");
        guess = input.nextInt();
        attempts++;
        if (attempts >= attemptsLimit) {
          System.out.println("You reached the maximum number of attempts. The number was " + number + ".");
          break;
        }
        if (guess < number) {
          System.out.println("Too low!");
        } else if (guess > number) {
          System.out.println("Too high!");
        }
      } while (guess != number && attempts < attemptsLimit);
      score = 100 - (10 * (attempts - 1));
      if (score < 0) {
        score = 0;
      }
      System.out.println("You got it in " + attempts + " attempts. Your score is " + score + ".");
      rounds++;
      totalScore += score;
      totalAttempts += attempts;
      System.out.print("Do you want to play another round? (y/n): ");
      if (!input.next().equalsIgnoreCase("y")) {
        break;
      }
    }
    System.out.println("You played " + rounds + " rounds. Your total score is " + totalScore + " and your total attempts is " + totalAttempts + ".");
  }
}
