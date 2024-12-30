package hello.core.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class NetworkClient {

    //접속해야 할 서버의 url이라고 가정하자.
    private String url;

    public NetworkClient() {
        System.out.println("생성자 호출 url = " + url);
        /*connect();
        call("초기화 연결 메세지");*/
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private void call(String message) {
        System.out.println("url call = "+ url +" message = " + message);

    }
    //서비스 시작시 호출
    private void connect() {
        System.out.println("connect = " + url);
    }


    public void disconnect(){
        System.out.println("disconnect = " + url);
    }


    @PostConstruct
    public void init() throws Exception {
        connect();
        call("초기화 연결 메세지");
    }


    @PreDestroy
    public void close() throws Exception {
        disconnect();
    }
}
