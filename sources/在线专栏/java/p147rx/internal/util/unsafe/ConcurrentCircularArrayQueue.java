package p147rx.internal.util.unsafe;

import java.util.Iterator;
import p147rx.internal.util.SuppressAnimalSniffer;

@SuppressAnimalSniffer
/* loaded from: classes2.dex */
public abstract class ConcurrentCircularArrayQueue<E> extends ConcurrentCircularArrayQueueL0Pad<E> {
    protected static final int BUFFER_PAD = 32;
    private static final long REF_ARRAY_BASE;
    private static final int REF_ELEMENT_SHIFT;
    protected static final int SPARSE_SHIFT;
    protected final E[] buffer;
    protected final long mask;

    static {
        int iIntValue = Integer.getInteger("sparse.shift", 0).intValue();
        SPARSE_SHIFT = iIntValue;
        int iArrayIndexScale = UnsafeAccess.UNSAFE.arrayIndexScale(Object[].class);
        if (4 == iArrayIndexScale) {
            REF_ELEMENT_SHIFT = iIntValue + 2;
        } else {
            if (8 != iArrayIndexScale) {
                throw new IllegalStateException("Unknown pointer size");
            }
            REF_ELEMENT_SHIFT = iIntValue + 3;
        }
        REF_ARRAY_BASE = r2.arrayBaseOffset(Object[].class) + (32 << (REF_ELEMENT_SHIFT - iIntValue));
    }

    public ConcurrentCircularArrayQueue(int i4) {
        int iRoundToPowerOfTwo = Pow2.roundToPowerOfTwo(i4);
        this.mask = iRoundToPowerOfTwo - 1;
        this.buffer = (E[]) new Object[(iRoundToPowerOfTwo << SPARSE_SHIFT) + 64];
    }

    protected final long calcElementOffset(long j4) {
        return calcElementOffset(j4, this.mask);
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

    protected final E lpElement(long j4) {
        return lpElement(this.buffer, j4);
    }

    protected final E lvElement(long j4) {
        return lvElement(this.buffer, j4);
    }

    protected final void soElement(long j4, E e4) {
        soElement(this.buffer, j4, e4);
    }

    protected final void spElement(long j4, E e4) {
        spElement(this.buffer, j4, e4);
    }

    protected final long calcElementOffset(long j4, long j5) {
        return REF_ARRAY_BASE + ((j4 & j5) << REF_ELEMENT_SHIFT);
    }

    protected final E lpElement(E[] eArr, long j4) {
        return (E) UnsafeAccess.UNSAFE.getObject(eArr, j4);
    }

    protected final E lvElement(E[] eArr, long j4) {
        return (E) UnsafeAccess.UNSAFE.getObjectVolatile(eArr, j4);
    }

    protected final void soElement(E[] eArr, long j4, E e4) {
        UnsafeAccess.UNSAFE.putOrderedObject(eArr, j4, e4);
    }

    protected final void spElement(E[] eArr, long j4, E e4) {
        UnsafeAccess.UNSAFE.putObject(eArr, j4, e4);
    }
}
