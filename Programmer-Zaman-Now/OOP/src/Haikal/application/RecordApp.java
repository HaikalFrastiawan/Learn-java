package Haikal.application;

public record RecordApp() {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("haikal", "rahasia");
        System.out.println(loginRequest);
        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("haikal"));
        System.out.println(new LoginRequest("kal", ""));
    }
}
