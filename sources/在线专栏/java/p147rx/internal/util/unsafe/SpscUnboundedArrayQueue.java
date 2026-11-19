package p147rx.internal.util.unsafe;

import java.util.Iterator;
import java.util.Objects;
import p147rx.internal.util.SuppressAnimalSniffer;
import sun.misc.Unsafe;

@SuppressAnimalSniffer
/* loaded from: classes2.dex */
public class SpscUnboundedArrayQueue<E> extends SpscUnboundedArrayQueueConsumerField<E> implements QueueProgressIndicators {
    private static final long C_INDEX_OFFSET;
    private static final long P_INDEX_OFFSET;
    private static final long REF_ARRAY_BASE;
    private static final int REF_ELEMENT_SHIFT;
    static final int MAX_LOOK_AHEAD_STEP = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    private static final Object HAS_NEXT = new Object();

    static {
        Unsafe unsafe = UnsafeAccess.UNSAFE;
        int iArrayIndexScale = unsafe.arrayIndexScale(Object[].class);
        if (4 == iArrayIndexScale) {
            REF_ELEMENT_SHIFT = 2;
        } else {
            if (8 != iArrayIndexScale) {
                throw new IllegalStateException("Unknown pointer size");
            }
            REF_ELEMENT_SHIFT = 3;
        }
        REF_ARRAY_BASE = unsafe.arrayBaseOffset(Object[].class);
        try {
            P_INDEX_OFFSET = unsafe.objectFieldOffset(SpscUnboundedArrayQueueProducerFields.class.getDeclaredField("producerIndex"));
            try {
                C_INDEX_OFFSET = unsafe.objectFieldOffset(SpscUnboundedArrayQueueConsumerField.class.getDeclaredField("consumerIndex"));
            } catch (NoSuchFieldException e4) {
                InternalError internalError = new InternalError();
                internalError.initCause(e4);
                throw internalError;
            }
        } catch (NoSuchFieldException e5) {
            InternalError internalError2 = new InternalError();
            internalError2.initCause(e5);
            throw internalError2;
        }
    }

    public SpscUnboundedArrayQueue(int i4) {
        int iRoundToPowerOfTwo = Pow2.roundToPowerOfTwo(i4);
        long j4 = iRoundToPowerOfTwo - 1;
        E[] eArr = (E[]) new Object[iRoundToPowerOfTwo + 1];
        this.producerBuffer = eArr;
        this.producerMask = j4;
        adjustLookAheadStep(iRoundToPowerOfTwo);
        this.consumerBuffer = eArr;
        this.consumerMask = j4;
        this.producerLookAhead = j4 - 1;
        soProducerIndex(0L);
    }

    private void adjustLookAheadStep(int i4) {
        this.producerLookAheadStep = Math.min(i4 / 4, MAX_LOOK_AHEAD_STEP);
    }

    private static long calcDirectOffset(long j4) {
        return REF_ARRAY_BASE + (j4 << REF_ELEMENT_SHIFT);
    }

    private static long calcWrappedOffset(long j4, long j5) {
        return calcDirectOffset(j4 & j5);
    }

    private long lvConsumerIndex() {
        return UnsafeAccess.UNSAFE.getLongVolatile(this, C_INDEX_OFFSET);
    }

    private static <E> Object lvElement(E[] eArr, long j4) {
        return UnsafeAccess.UNSAFE.getObjectVolatile(eArr, j4);
    }

    private E[] lvNext(E[] eArr) {
        return (E[]) ((Object[]) lvElement(eArr, calcDirectOffset(eArr.length - 1)));
    }

    private long lvProducerIndex() {
        return UnsafeAccess.UNSAFE.getLongVolatile(this, P_INDEX_OFFSET);
    }

    private E newBufferPeek(E[] eArr, long j4, long j5) {
        this.consumerBuffer = eArr;
        return (E) lvElement(eArr, calcWrappedOffset(j4, j5));
    }

    private E newBufferPoll(E[] eArr, long j4, long j5) {
        this.consumerBuffer = eArr;
        long jCalcWrappedOffset = calcWrappedOffset(j4, j5);
        E e4 = (E) lvElement(eArr, jCalcWrappedOffset);
        if (e4 == null) {
            return null;
        }
        soElement(eArr, jCalcWrappedOffset, null);
        soConsumerIndex(j4 + 1);
        return e4;
    }

    private void resize(E[] eArr, long j4, long j5, E e4, long j6) {
        E[] eArr2 = (E[]) new Object[eArr.length];
        this.producerBuffer = eArr2;
        this.producerLookAhead = (j6 + j4) - 1;
        soElement(eArr2, j5, e4);
        soNext(eArr, eArr2);
        soElement(eArr, j5, HAS_NEXT);
        soProducerIndex(j4 + 1);
    }

    private void soConsumerIndex(long j4) {
        UnsafeAccess.UNSAFE.putOrderedLong(this, C_INDEX_OFFSET, j4);
    }

    private static void soElement(Object[] objArr, long j4, Object obj) {
        UnsafeAccess.UNSAFE.putOrderedObject(objArr, j4, obj);
    }

    private void soNext(E[] eArr, E[] eArr2) {
        soElement(eArr, calcDirectOffset(eArr.length - 1), eArr2);
    }

    private void soProducerIndex(long j4) {
        UnsafeAccess.UNSAFE.putOrderedLong(this, P_INDEX_OFFSET, j4);
    }

    private boolean writeToQueue(E[] eArr, E e4, long j4, long j5) {
        soElement(eArr, j5, e4);
        soProducerIndex(j4 + 1);
        return true;
    }

    @Override // p147rx.internal.util.unsafe.QueueProgressIndicators
    public long currentConsumerIndex() {
        return lvConsumerIndex();
    }

    @Override // p147rx.internal.util.unsafe.QueueProgressIndicators
    public long currentProducerIndex() {
        return lvProducerIndex();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public final boolean offer(E e4) {
        Objects.requireNonNull(e4, "Null is not a valid element");
        E[] eArr = this.producerBuffer;
        long j4 = this.producerIndex;
        long j5 = this.producerMask;
        long jCalcWrappedOffset = calcWrappedOffset(j4, j5);
        if (j4 < this.producerLookAhead) {
            return writeToQueue(eArr, e4, j4, jCalcWrappedOffset);
        }
        long j6 = this.producerLookAheadStep + j4;
        if (lvElement(eArr, calcWrappedOffset(j6, j5)) == null) {
            this.producerLookAhead = j6 - 1;
            return writeToQueue(eArr, e4, j4, jCalcWrappedOffset);
        }
        if (lvElement(eArr, calcWrappedOffset(1 + j4, j5)) != null) {
            return writeToQueue(eArr, e4, j4, jCalcWrappedOffset);
        }
        resize(eArr, j4, jCalcWrappedOffset, e4, j5);
        return true;
    }

    @Override // java.util.Queue
    public final E peek() {
        E[] eArr = this.consumerBuffer;
        long j4 = this.consumerIndex;
        long j5 = this.consumerMask;
        E e4 = (E) lvElement(eArr, calcWrappedOffset(j4, j5));
        return e4 == HAS_NEXT ? newBufferPeek(lvNext(eArr), j4, j5) : e4;
    }

    @Override // java.util.Queue
    public final E poll() {
        E[] eArr = this.consumerBuffer;
        long j4 = this.consumerIndex;
        long j5 = this.consumerMask;
        long jCalcWrappedOffset = calcWrappedOffset(j4, j5);
        E e4 = (E) lvElement(eArr, jCalcWrappedOffset);
        boolean z3 = e4 == HAS_NEXT;
        if (e4 == null || z3) {
            if (z3) {
                return newBufferPoll(lvNext(eArr), j4, j5);
            }
            return null;
        }
        soElement(eArr, jCalcWrappedOffset, null);
        soConsumerIndex(j4 + 1);
        return e4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        long jLvConsumerIndex = lvConsumerIndex();
        while (true) {
            long jLvProducerIndex = lvProducerIndex();
            long jLvConsumerIndex2 = lvConsumerIndex();
            if (jLvConsumerIndex == jLvConsumerIndex2) {
                return (int) (jLvProducerIndex - jLvConsumerIndex2);
            }
            jLvConsumerIndex = jLvConsumerIndex2;
        }
    }
}
