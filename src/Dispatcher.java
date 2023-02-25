import java.util.ArrayList;

public class Dispatcher {
    ArrayList<Interceptor> interceptors = new ArrayList<Interceptor>();

    public void dispatch(ContextObject contextObject) {
        for (int i = 0; i < interceptors.size(); i++) {
            Interceptor interceptor = (Interceptor)interceptors.get(i);
            interceptor.intercept(contextObject);
        }
    }

    public void addInterceptor(Interceptor interceptor) {
        interceptors.add(interceptor);
    }

}
