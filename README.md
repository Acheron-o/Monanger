

#🪙 MONANGER Currency Converter**MONANGER** is a Java application designed to provide fast, reliable, and real-time currency conversion. Built as part of the **Oracle Next Education (ONE)** program in collaboration with **Alura**, this project bridges the gap between basic Java logic and real-world API integration.

---

##🚀 Features* **Real-time Data:** Fetches live rates from [ExchangeRate-API](https://www.exchangerate-api.com/).
* **Dynamic Menu:** Interactive CLI for quick conversions between major world currencies (USD, BRL, EUR, GBP, etc.).
* **Error Resilience:** Handles API failures and invalid inputs gracefully.
* **Modern Java:** Utilizes `HttpClient` and `Gson` for efficient data processing.

---

##🛠️ Tech Stack* **Java 17+**: Core logic and HTTP communication.
* **Gson**: Professional JSON parsing library.
* **ExchangeRate-API**: The financial data engine.

---

##🔮 Roadmap & Next StepsI am continuously working to evolve MONANGER into a full-featured financial tool. The next milestones are:

###🖥️ 1. Graphical User Interface (GUI)Transition from a text-based console to a modern desktop application.

* **Tool:** **JavaFX** or **Swing**.
* **Goal:** A window with dropdown menus for currency selection, an input field for the amount, and a "Convert" button.

###🌎 2. "Universal" Conversion LogicInstead of a fixed list of 12 options, the application will allow conversion between **any** two currencies supported by the API.

* **Logic:** Users will type or select a 3-letter ISO code (e.g., JPY, CAD, MXN).
* **Implementation:** Use the `/pair/FROM/TO` endpoint dynamically based on user input, rather than a `switch` statement with hardcoded cases.

###📊 3. Conversion HistoryAdd a feature to save the last 5-10 conversions in a session or a local `.txt` file for quick reference.

###⚡ 4. Improved PrecisionRefactor the calculations to use `BigDecimal` instead of `double` to ensure maximum financial precision and avoid floating-point errors.

---

##📦 Installation & Setup1. **Clone the repo:** `git clone https://github.com/your-username/monanger.git`
2. **Set your API Key:** * Create an account at ExchangeRate-API.
* Add your key to your environment variables or directly in the `Main.java` file.


3. **Run:** Open in IntelliJ/VS Code and run the `Main` class.

---

**Developed by [Your Name]** *Part of the Oracle Next Education Challenge.*

---

