import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class ForwardingSet<E> implements Set<E> {

    // 기존 클래스를 Private 인스턴스로 선언
    private final Set<E> s;
    public ForwardingSet(Set<E> s) { this.s = s; }

    // Set methods -> 기존 클래스에 대응하는 메서드를 호출
    @Override public int size() { return s.size(); }
    @Override public boolean isEmpty() { return s.isEmpty(); }
    @Override public boolean contains(Object o) { return s.contains(o); }
    @Override public Iterator<E> iterator() { return s.iterator(); }
    @Override public Object[] toArray() { return s.toArray(); }
    @Override public <T> T[] toArray(T[] a) { return s.toArray(a); }
    @Override public boolean add(E e) { return s.add(e); }
    @Override public boolean remove(Object o) { return s.remove(o); }
    @Override public boolean containsAll(Collection<?> c) { return s.containsAll(c); }
    @Override public boolean addAll(Collection<? extends E> c) { return s.addAll(c); }
    @Override public boolean retainAll(Collection<?> c) { return s.retainAll(c); }
    @Override public boolean removeAll(Collection<?> c) { return s.removeAll(c); }
    @Override public void clear() { s.clear(); }
}
