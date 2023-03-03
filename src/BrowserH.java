import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserH {
    private String currentURL;
    private Deque<String> history;


    public BrowserH(String homeURL){
        history= new ArrayDeque<>();
        currentURL=homeURL;
    }

    public void visitSite(String URL){
        history.push(currentURL);
        currentURL=URL;
    }


    public  String back() {
        if(history.isEmpty()){
            return currentURL;
        }else {
            String previousURL= history.pop();
            String current= currentURL;
            currentURL=previousURL;
            return current;
        }
    }

    public static void main(String[] args) {
        BrowserH history= new BrowserH(" WWW.google.com");
        history.visitSite("www.vg.no");
        history.visitSite("www.DB.no");
        history.visitSite("www.kristiania.no");
        history.visitSite("www.nrk.no");
        System.out.println(history.back());
        System.out.println(history.back());
        System.out.println(history.back());
    }
}
