package p147rx.internal.util.unsafe;

import p147rx.internal.util.SuppressAnimalSniffer;

@SuppressAnimalSniffer
/* loaded from: classes2.dex */
public abstract class ConcurrentSequencedCircularArrayQueue<E> extends ConcurrentCircularArrayQueue<E> {
    private static final long ARRAY_BASE;
    private static final int ELEMENT_SHIFT;
    protected final long[] sequenceBuffer;

    static {
        if (8 != UnsafeAccess.UNSAFE.arrayIndexScale(long[].class)) {
            throw new IllegalStateException("Unexpected long[] element size");
        }
        ELEMENT_SHIFT = ConcurrentCircularArrayQueue.SPARSE_SHIFT + 3;
        ARRAY_BASE = r1.arrayBaseOffset(long[].class) + (32 << (r3 - r2));
    }

    public ConcurrentSequencedCircularArrayQueue(int i4) {
        super(i4);
        int i5 = (int) (this.mask + 1);
        this.sequenceBuffer = new long[(i5 << ConcurrentCircularArrayQueue.SPARSE_SHIFT) + 64];
        for (long j4 = 0; j4 < i5; j4++) {
            soSequence(this.sequenceBuffer, calcSequenceOffset(j4), j4);
        }
    }

    protected final long calcSequenceOffset(long j4) {
        return ARRAY_BASE + ((j4 & this.mask) << ELEMENT_SHIFT);
    }

    protected final long lvSequence(long[] jArr, long j4) {
        return UnsafeAccess.UNSAFE.getLongVolatile(jArr, j4);
    }

    protected final void soSequence(long[] jArr, long j4, long j5) {
        UnsafeAccess.UNSAFE.putOrderedLong(jArr, j4, j5);
    }
}
