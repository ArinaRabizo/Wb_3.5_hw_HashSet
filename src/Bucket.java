import java.util.LinkedList;
import java.util.List;

public class Bucket<E> {
    private List <E> list;

    public Bucket() {
        this.list = new LinkedList<>();
    }
    public List<E> getList () {
        return list;
    }
    public void addElement(E element) {
        list.add(element);
    }
    public void remove (E element) {
        list.remove(element);
    }
}

