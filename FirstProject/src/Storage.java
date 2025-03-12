import java.util.ArrayList;
import java.util.List;

public class Storage<T>{
    ArrayList<T> arr;

    public Storage() {
        arr = new ArrayList<>();
    }
    public void addT(T val){
        arr.add(val);
    }

    public void delT(int ind){
        arr.remove(ind);
    }

    public T getT(int ind){
        return arr.get(ind);
    }

    public int size(){
        return arr.size();
    }
    void displayAll(){
        for(T item: arr) {
            System.out.println(item);
        }
    }

    public void printItems(List<T> items){
        System.out.println(items);
    }

    public static void main(String[] args) {
        Storage<Integer> in = new Storage<Integer>();
        in.addT(5);
        in.addT(3);
        in.delT(1);
        in.displayAll();
        System.out.println(in.size());

        Storage<String> st = new Storage<String>();

        st.addT("hello");
        st.addT("Bye");
        st.displayAll();
        st.delT(1);
        System.out.println(st.size());
        st.displayAll();
    }
}

