// Class       : CSE 110 / Online
// Assignment  : Assignment 3
// Author      : Seth Huffman & swhuffma
// Description : Automatic Stock Trader

import java.util.Scanner;

public class Assignment03 {

    public static void main(String[] args) {

        /////////////////////////////////////
        // Variables
        /////////////////////////////////////
        int availableFunds;
        int currentShares;
        int marketPrice;
        int purchasePrice;
        int transactionFee = 10;
		Scanner keyboard = new Scanner(System.in);

        /////////////////////////////////////
        // Inputs
        /////////////////////////////////////
        System.out.print("Current Shares : ");
        currentShares = keyboard.nextInt();
        System.out.print("Purchase Price : ");
        purchasePrice = keyboard.nextInt();
        System.out.print("Market Price : ");
        marketPrice = keyboard.nextInt();
        System.out.print("Available Funds : ");
        availableFunds = keyboard.nextInt();

        /////////////////////////////////////
        // Logic
        /////////////////////////////////////
        int numberOfSharesToBuy = ((availableFunds - transactionFee)/(marketPrice));
        int numberOfSharesToSell = ((availableFunds - transactionFee)+(currentShares * marketPrice));

        // Buying
        if (purchasePrice > marketPrice) { 
            // Not enough funds
            if (numberOfSharesToBuy <= 0) {
                System.out.println("Hold shares");
            } else {
                System.out.println("Buy " + numberOfSharesToBuy + " shares");
            }
        
        // Selling
        } else { 
            // Not enough funds
            if (numberOfSharesToSell <= 0) {
                System.out.println("Hold shares");
            } else {
                System.out.println("Sell " + currentShares + " shares");
            }
        }
    }
}