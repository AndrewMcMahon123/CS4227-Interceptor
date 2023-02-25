public class UserInterceptor implements Interceptor {
    private String userName;
    private User user = new User();

    public UserInterceptor(String userName){
        this.userName = userName;
    }

    public void intercept(ContextObject contextObject){
        contextObject.setContextMessage("User " + userName + " has been notified");
        user.NotifyUser(userName);
    }
}
