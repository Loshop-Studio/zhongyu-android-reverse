package p147rx.internal.util;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p147rx.Subscription;
import p147rx.functions.Func1;

/* loaded from: classes2.dex */
public final class IndexedRingBuffer<E> implements Subscription {
    static final int SIZE;
    private final ElementSection<E> elements = new ElementSection<>();
    private final IndexSection removed = new IndexSection();
    final AtomicInteger index = new AtomicInteger();
    final AtomicInteger removedIndex = new AtomicInteger();

    static final class ElementSection<E> {
        final AtomicReferenceArray<E> array = new AtomicReferenceArray<>(IndexedRingBuffer.SIZE);
        final AtomicReference<ElementSection<E>> next = new AtomicReference<>();

        ElementSection() {
        }

        ElementSection<E> getNext() {
            if (this.next.get() != null) {
                return this.next.get();
            }
            ElementSection<E> elementSection = new ElementSection<>();
            return this.next.compareAndSet(null, elementSection) ? elementSection : this.next.get();
        }
    }

    static class IndexSection {
        private final AtomicIntegerArray unsafeArray = new AtomicIntegerArray(IndexedRingBuffer.SIZE);
        private final AtomicReference<IndexSection> _next = new AtomicReference<>();

        IndexSection() {
        }

        public int getAndSet(int i4, int i5) {
            return this.unsafeArray.getAndSet(i4, i5);
        }

        IndexSection getNext() {
            if (this._next.get() != null) {
                return this._next.get();
            }
            IndexSection indexSection = new IndexSection();
            return this._next.compareAndSet(null, indexSection) ? indexSection : this._next.get();
        }

        public void set(int i4, int i5) {
            this.unsafeArray.set(i4, i5);
        }
    }

    static {
        int i4 = PlatformDependent.isAndroid() ? 8 : 128;
        String property = System.getProperty("rx.indexed-ring-buffer.size");
        if (property != null) {
            try {
                i4 = Integer.parseInt(property);
            } catch (NumberFormatException e4) {
                System.err.println("Failed to set 'rx.indexed-ring-buffer.size' with value " + property + " => " + e4.getMessage());
            }
        }
        SIZE = i4;
    }

    IndexedRingBuffer() {
    }

    private ElementSection<E> getElementSection(int i4) {
        int i5 = SIZE;
        if (i4 < i5) {
            return this.elements;
        }
        int i6 = i4 / i5;
        ElementSection<E> next = this.elements;
        for (int i7 = 0; i7 < i6; i7++) {
            next = next.getNext();
        }
        return next;
    }

    private synchronized int getIndexForAdd() {
        int andIncrement;
        int indexFromPreviouslyRemoved = getIndexFromPreviouslyRemoved();
        if (indexFromPreviouslyRemoved >= 0) {
            int i4 = SIZE;
            if (indexFromPreviouslyRemoved < i4) {
                andIncrement = this.removed.getAndSet(indexFromPreviouslyRemoved, -1);
            } else {
                andIncrement = getIndexSection(indexFromPreviouslyRemoved).getAndSet(indexFromPreviouslyRemoved % i4, -1);
            }
            if (andIncrement == this.index.get()) {
                this.index.getAndIncrement();
            }
        } else {
            andIncrement = this.index.getAndIncrement();
        }
        return andIncrement;
    }

    private synchronized int getIndexFromPreviouslyRemoved() {
        int i4;
        int i5;
        do {
            i4 = this.removedIndex.get();
            if (i4 <= 0) {
                return -1;
            }
            i5 = i4 - 1;
        } while (!this.removedIndex.compareAndSet(i4, i5));
        return i5;
    }

    private IndexSection getIndexSection(int i4) {
        int i5 = SIZE;
        if (i4 < i5) {
            return this.removed;
        }
        int i6 = i4 / i5;
        IndexSection next = this.removed;
        for (int i7 = 0; i7 < i6; i7++) {
            next = next.getNext();
        }
        return next;
    }

    public static <T> IndexedRingBuffer<T> getInstance() {
        return new IndexedRingBuffer<>();
    }

    private synchronized void pushRemovedIndex(int i4) {
        int andIncrement = this.removedIndex.getAndIncrement();
        int i5 = SIZE;
        if (andIncrement < i5) {
            this.removed.set(andIncrement, i4);
        } else {
            getIndexSection(andIncrement).set(andIncrement % i5, i4);
        }
    }

    public int add(E e4) {
        int indexForAdd = getIndexForAdd();
        int i4 = SIZE;
        if (indexForAdd < i4) {
            this.elements.array.set(indexForAdd, e4);
            return indexForAdd;
        }
        getElementSection(indexForAdd).array.set(indexForAdd % i4, e4);
        return indexForAdd;
    }

    public int forEach(Func1<? super E, Boolean> func1) {
        return forEach(func1, 0);
    }

    @Override // p147rx.Subscription
    public boolean isUnsubscribed() {
        return false;
    }

    public void releaseToPool() {
        int i4 = this.index.get();
        int i5 = 0;
        loop0: for (ElementSection<E> elementSection = this.elements; elementSection != null; elementSection = elementSection.next.get()) {
            int i6 = 0;
            while (i6 < SIZE) {
                if (i5 >= i4) {
                    break loop0;
                }
                elementSection.array.set(i6, null);
                i6++;
                i5++;
            }
        }
        this.index.set(0);
        this.removedIndex.set(0);
    }

    public E remove(int i4) {
        E andSet;
        int i5 = SIZE;
        if (i4 < i5) {
            andSet = this.elements.array.getAndSet(i4, null);
        } else {
            andSet = getElementSection(i4).array.getAndSet(i4 % i5, null);
        }
        pushRemovedIndex(i4);
        return andSet;
    }

    @Override // p147rx.Subscription
    public void unsubscribe() {
        releaseToPool();
    }

    public int forEach(Func1<? super E, Boolean> func1, int i4) {
        int iForEach = forEach(func1, i4, this.index.get());
        if (i4 > 0 && iForEach == this.index.get()) {
            return forEach(func1, 0, i4);
        }
        if (iForEach == this.index.get()) {
            return 0;
        }
        return iForEach;
    }

    private int forEach(Func1<? super E, Boolean> func1, int i4, int i5) {
        ElementSection<E> elementSection;
        int i6;
        int i7 = this.index.get();
        ElementSection<E> elementSection2 = this.elements;
        int i8 = SIZE;
        if (i4 >= i8) {
            ElementSection<E> elementSection3 = getElementSection(i4);
            i6 = i4;
            i4 %= i8;
            elementSection = elementSection3;
        } else {
            elementSection = elementSection2;
            i6 = i4;
        }
        loop0: while (elementSection != null) {
            while (i4 < SIZE) {
                if (i6 >= i7 || i6 >= i5) {
                    break loop0;
                }
                E e4 = elementSection.array.get(i4);
                if (e4 != null && !func1.call(e4).booleanValue()) {
                    return i6;
                }
                i4++;
                i6++;
            }
            elementSection = elementSection.next.get();
            i4 = 0;
        }
        return i6;
    }
}
