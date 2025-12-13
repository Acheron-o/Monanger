package com.br.alura.main;

import com.br.alura.api.API;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        API connection = new API();
        Scanner scanner = new Scanner(System.in);

        // Ensure you actually put your key here or set the correct Env Var name
        String API_KEY = "87463a016cfce726e6734fba";

            double value;
            double rate;
            double convertedValue;
            int option = 0;

            while (option != 13) {
                System.out.println("\n=== MONANGER Currency Converter ===");
                System.out.println("Explore global currencies with ease!");
                System.out.println("\nAvailable Conversions:");
                System.out.println("1. US Dollar to Argentine Peso");
                System.out.println("2. Argentine Peso to US Dollar");
                System.out.println("3. US Dollar to Brazilian Real");
                System.out.println("4. Brazilian Real to US Dollar");
                System.out.println("5. US Dollar to Colombian Peso");
                System.out.println("6. Colombian Peso to US Dollar");
                System.out.println("7. US Dollar to Euro");
                System.out.println("8. Euro to US Dollar");
                System.out.println("9. US Dollar to British Pound");
                System.out.println("10. British Pound to US Dollar");
                System.out.println("11. Euro to British Pound");
                System.out.println("12. British Pound to Euro");
                System.out.println("13. Exit");
                System.out.print("\nSelect an option (1-13): ");
                option = scanner.nextInt();

                if (option == 13) {
                    System.out.println("Thank you for using MONANGER. Goodbye!");
                    break;
                }

                if (option < 1 || option > 12) {
                    System.out.println("Invalid option. Please try again.");
                    continue;
                }

                System.out.print("\nEnter the amount to convert: ");
                value = scanner.nextDouble();

                String url = "";
                String fromCurrency = "";
                String toCurrency = "";

                switch (option) {
                    case 1:
                        url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/USD/ARS";
                        fromCurrency = "USD";
                        toCurrency = "ARS";
                        break;
                    case 2:
                        url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/ARS/USD";
                        fromCurrency = "ARS";
                        toCurrency = "USD";
                        break;
                    case 3:
                        url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/USD/BRL";
                        fromCurrency = "USD";
                        toCurrency = "BRL";
                        break;
                    case 4:
                        url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/BRL/USD";
                        fromCurrency = "BRL";
                        toCurrency = "USD";
                        break;
                    case 5:
                        url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/USD/COP";
                        fromCurrency = "USD";
                        toCurrency = "COP";
                        break;
                    case 6:
                        url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/COP/USD";
                        fromCurrency = "COP";
                        toCurrency = "USD";
                        break;
                    case 7:
                        url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/USD/EUR";
                        fromCurrency = "USD";
                        toCurrency = "EUR";
                        break;
                    case 8:
                        url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/EUR/USD";
                        fromCurrency = "EUR";
                        toCurrency = "USD";
                        break;
                    case 9:
                        url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/USD/GBP";
                        fromCurrency = "USD";
                        toCurrency = "GBP";
                        break;
                    case 10:
                        url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/GBP/USD";
                        fromCurrency = "GBP";
                        toCurrency = "USD";
                        break;
                    case 11:
                        url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/EUR/GBP";
                        fromCurrency = "EUR";
                        toCurrency = "GBP";
                        break;
                    case 12:
                        url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/GBP/EUR";
                        fromCurrency = "GBP";
                        toCurrency = "EUR";
                        break;
                }

                rate = connection.getConversionRate(url);
                convertedValue = value * rate;
                System.out.printf("The amount %.2f %s converts to %.2f %s.\n", value, fromCurrency, convertedValue, toCurrency);
            }

            scanner.close();
        }
    }

