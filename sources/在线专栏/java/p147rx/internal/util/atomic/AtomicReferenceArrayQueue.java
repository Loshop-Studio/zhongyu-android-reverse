package p147rx.internal.util.atomic;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p147rx.internal.util.unsafe.Pow2;

/* loaded from: classes2.dex */
abstract class AtomicReferenceArrayQueue<E> extends AbstractQueue<E> {
    protected final AtomicReferenceArray<E> buffer;
    protected final int mask;

    public AtomicReferenceArrayQueue(int i4) {
        int iRoundToPowerOfTwo = Pow2.roundToPowerOfTwo(i4);
        this.mask = iRoundToPowerOfTwo - 1;
        this.buffer = new AtomicReferenceArray<>(iRoundToPowerOfTwo);
    }

    protected final int calcElementOffset(long j4) {
        return this.mask & ((int) j4);
    }

    protected final int calcElementOffset(long j4, int i4) {
        return ((int) j4) & i4;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    protected final E lpElement(AtomicReferenceArray<E> atomicReferenceArray, int i4) {
        return atomicReferenceArray.get(i4);
    }

    protected final E lvElement(AtomicReferenceArray<E> atomicReferenceArray, int i4) {
        return atomicReferenceArray.get(i4);
    }

    protected final void soElement(AtomicReferenceArray<E> atomicReferenceArray, int i4, E e4) {
        atomicReferenceArray.lazySet(i4, e4);
    }

    protected final void spElement(AtomicReferenceArray<E> atomicReferenceArray, int i4, E e4) {
        atomicReferenceArray.lazySet(i4, e4);
    }

    protected final void svElement(AtomicReferenceArray<E> atomicReferenceArray, int i4, E e4) {
        atomicReferenceArray.set(i4, e4);
    }

    protected final E lpElement(int i4) {
        return this.buffer.get(i4);
    }

    protected final E lvElement(int i4) {
        return lvElement(this.buffer, i4);
    }

    protected final void soElement(int i4, E e4) {
        this.buffer.lazySet(i4, e4);
    }

    protected final void spElement(int i4, E e4) {
        this.buffer.lazySet(i4, e4);
    }
}
