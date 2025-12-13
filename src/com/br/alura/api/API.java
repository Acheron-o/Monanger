package com.br.alura.api;

import com.google.gson.*;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class API {

    public double getConversionRate(String url) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            JsonObject jsonObject = JsonParser.parseString(response.body()).getAsJsonObject();

            // Check if the API returned a success status
            if (jsonObject.has("conversion_rate")) {
                return jsonObject.get("conversion_rate").getAsDouble();
            } else {
                // This helps you debug why it failed (e.g., "invalid-key")
                System.err.println("API Error: " + response.body());
                return 0;
            }
        } catch (Exception e) {
            System.err.println("Connection error: " + e.getMessage());
            return 0;
        }
    }
}