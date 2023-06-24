public class MyHashSet <E> {
    //  класс pair
        // в дз не нужен, чтобы найти элемент, нужно
        // пробежаться по массиву и найти его
        private Bucket<E>[] buckets;
        private int size  = 0;
        private int CAPACITY = 10;

        public MyHashSet() {
            this.buckets = new Bucket[CAPACITY];
        }
        private int hashCode (E element) {
            return (element.hashCode() & 0xfffffff) % CAPACITY;
        }
    private E getElement (E element) {
        int hash = hashCode(element);
        if (buckets[hash] == null) return null;
        for (int i = 0; i < buckets[hash].getList().size(); i++) {
            E curElement = buckets[hash].getList().get(i);
            if (curElement.equals(element)) {
                return curElement;
            }
        }
        return null;
    }

        public boolean containsElement (E element) {
            return getElement(element) != null;
        }



        public void put (E element) {
            if (containsElement(element)) {
                E curElement = getElement(element);
                curElement = element;
            } else {
                int hash = hashCode(element);
                if (buckets[hash] == null) {
                    buckets[hash] = new Bucket<>();
                }
                buckets[hash].addElement(element);
                size++;
            }
        }

        public void remove (E element) {
            if (containsElement(element)) {
                int hash = hashCode(element);
                buckets[hash].remove(element);
            }
        }
        public void printMap () {
            for (int i = 0; i < CAPACITY; i++) {
                if (buckets[i] != null) {
                    System.out.println("-_-_-Bucket №" + i);
                    for (int j = 0; j < buckets[i].getList().size(); j++) {
                        System.out.println(buckets[i].getList().get(j));
                    }
                }
            }
            System.out.println("-_-_-_-_-_-_-_-_-_-");
        }
    }


