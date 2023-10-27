//package AliceAndBob;

public class Greeting {
    private String name;
    private String response;

    public Greeting(String name, String response) {
        this.name = name;
        this.response = response;
    }

    public String getResponse(String name) {
        if (name.equals("Alice") || name.equals("Bob")) {
            return "Hello, " + name;
        } else {
            return "You are neither Alice nor Bob \nBut wuddup anyway, " + name;
        }
    }
}