package Module2.Homework1;

import java.lang.reflect.Array;
import java.util.*;

public class NumberList<T extends Number> implements List<T>, RandomAccess {
    private T[] array;
    private int size;

    public NumberList(Class<T> clazz, int i) {
        this.array = (T[]) Array.newInstance(clazz, 2);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        int result = 0;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(o)) {
                result++;
            }
        }
        return result >= 2;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        if (t == null) {
            return false;
        }

        if(array.length == size) {
            grow();
        }

        size++;
        for (int i = size - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = t;
        return true;
    }

    private void grow() {
        array = Arrays.copyOf(array, array.length + (array.length >> 1));
    }

    @Override
    public boolean remove(Object o) {
        boolean result = false;
        int countEquals = 0;
        for (int i = 0; i < size; i++) {
            if (o.equals(array[i])) {
                result = true;
                array[i] = null;
                countEquals++;
            } else if (countEquals > 0) {
                array[i-countEquals] = array[i];
                array[i] = null;
            }
        }
        size -= countEquals;
        return result;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        return array[index];
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        if (size == 0) {
            return -1;
        }
        for (int i = 0; i < size; i++) {
            if (array[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        if (size == 0) {
            return -1;
        }
        for (int i = size; i > 0; i--) {
            if (array[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        if (fromIndex > toIndex || fromIndex < 0 || toIndex > size) {
            return null;
        }
        return null;
    }



    public Double getDouble(int index) {
        Double result = null;
        try {
            result= (Double) array[index];
        } catch (ClassCastException e) {
            throw new ClassCastException("По индексу " + index + " число не типа Double");
        }
        return result;
    }

    public int sumIntegers() throws Exception {
        int result = 0;
        for (int i = 0; i < size; i++) {
            if(!(array[i] instanceof Integer)) {
                throw new Exception("В списке есть числа не типа Integer");
            }
            result += array[i].intValue();
        }

        return result;
    }
}
