package p147rx.internal.util.atomic;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p147rx.internal.util.unsafe.Pow2;

/* loaded from: classes2.dex */
public final class SpscLinkedArrayQueue<T> implements Queue<T> {
    AtomicReferenceArray<Object> consumerBuffer;
    final AtomicLong consumerIndex;
    int consumerMask;
    AtomicReferenceArray<Object> producerBuffer;
    final AtomicLong producerIndex;
    long producerLookAhead;
    int producerLookAheadStep;
    int producerMask;
    static final int MAX_LOOK_AHEAD_STEP = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    private static final Object HAS_NEXT = new Object();

    public SpscLinkedArrayQueue(int i4) {
        int iRoundToPowerOfTwo = Pow2.roundToPowerOfTwo(i4);
        int i5 = iRoundToPowerOfTwo - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iRoundToPowerOfTwo + 1);
        this.producerBuffer = atomicReferenceArray;
        this.producerMask = i5;
        adjustLookAheadStep(iRoundToPowerOfTwo);
        this.consumerBuffer = atomicReferenceArray;
        this.consumerMask = i5;
        this.producerLookAhead = i5 - 1;
        this.producerIndex = new AtomicLong();
        this.consumerIndex = new AtomicLong();
    }

    private void adjustLookAheadStep(int i4) {
        this.producerLookAheadStep = Math.min(i4 / 4, MAX_LOOK_AHEAD_STEP);
    }

    private static int calcDirectOffset(int i4) {
        return i4;
    }

    private static int calcWrappedOffset(long j4, int i4) {
        return calcDirectOffset(((int) j4) & i4);
    }

    private long lpConsumerIndex() {
        return this.consumerIndex.get();
    }

    private long lpProducerIndex() {
        return this.producerIndex.get();
    }

    private long lvConsumerIndex() {
        return this.consumerIndex.get();
    }

    private static <E> Object lvElement(AtomicReferenceArray<Object> atomicReferenceArray, int i4) {
        return atomicReferenceArray.get(i4);
    }

    private AtomicReferenceArray<Object> lvNext(AtomicReferenceArray<Object> atomicReferenceArray) {
        return (AtomicReferenceArray) lvElement(atomicReferenceArray, calcDirectOffset(atomicReferenceArray.length() - 1));
    }

    private long lvProducerIndex() {
        return this.producerIndex.get();
    }

    private T newBufferPeek(AtomicReferenceArray<Object> atomicReferenceArray, long j4, int i4) {
        this.consumerBuffer = atomicReferenceArray;
        return (T) lvElement(atomicReferenceArray, calcWrappedOffset(j4, i4));
    }

    private T newBufferPoll(AtomicReferenceArray<Object> atomicReferenceArray, long j4, int i4) {
        this.consumerBuffer = atomicReferenceArray;
        int iCalcWrappedOffset = calcWrappedOffset(j4, i4);
        T t3 = (T) lvElement(atomicReferenceArray, iCalcWrappedOffset);
        if (t3 == null) {
            return null;
        }
        soElement(atomicReferenceArray, iCalcWrappedOffset, null);
        soConsumerIndex(j4 + 1);
        return t3;
    }

    private void resize(AtomicReferenceArray<Object> atomicReferenceArray, long j4, int i4, T t3, long j5) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.producerBuffer = atomicReferenceArray2;
        this.producerLookAhead = (j5 + j4) - 1;
        soElement(atomicReferenceArray2, i4, t3);
        soNext(atomicReferenceArray, atomicReferenceArray2);
        soElement(atomicReferenceArray, i4, HAS_NEXT);
        soProducerIndex(j4 + 1);
    }

    private void soConsumerIndex(long j4) {
        this.consumerIndex.lazySet(j4);
    }

    private static void soElement(AtomicReferenceArray<Object> atomicReferenceArray, int i4, Object obj) {
        atomicReferenceArray.lazySet(i4, obj);
    }

    private void soNext(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        soElement(atomicReferenceArray, calcDirectOffset(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    private void soProducerIndex(long j4) {
        this.producerIndex.lazySet(j4);
    }

    private boolean writeToQueue(AtomicReferenceArray<Object> atomicReferenceArray, T t3, long j4, int i4) {
        soElement(atomicReferenceArray, i4, t3);
        soProducerIndex(j4 + 1);
        return true;
    }

    @Override // java.util.Queue, java.util.Collection
    public boolean add(T t3) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public T element() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return lvProducerIndex() == lvConsumerIndex();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public boolean offer(T t3) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.producerBuffer;
        long jLpProducerIndex = lpProducerIndex();
        int i4 = this.producerMask;
        int iCalcWrappedOffset = calcWrappedOffset(jLpProducerIndex, i4);
        if (jLpProducerIndex < this.producerLookAhead) {
            return writeToQueue(atomicReferenceArray, t3, jLpProducerIndex, iCalcWrappedOffset);
        }
        long j4 = this.producerLookAheadStep + jLpProducerIndex;
        if (lvElement(atomicReferenceArray, calcWrappedOffset(j4, i4)) == null) {
            this.producerLookAhead = j4 - 1;
            return writeToQueue(atomicReferenceArray, t3, jLpProducerIndex, iCalcWrappedOffset);
        }
        if (lvElement(atomicReferenceArray, calcWrappedOffset(1 + jLpProducerIndex, i4)) == null) {
            return writeToQueue(atomicReferenceArray, t3, jLpProducerIndex, iCalcWrappedOffset);
        }
        resize(atomicReferenceArray, jLpProducerIndex, iCalcWrappedOffset, t3, i4);
        return true;
    }

    @Override // java.util.Queue
    public T peek() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.consumerBuffer;
        long jLpConsumerIndex = lpConsumerIndex();
        int i4 = this.consumerMask;
        T t3 = (T) lvElement(atomicReferenceArray, calcWrappedOffset(jLpConsumerIndex, i4));
        return t3 == HAS_NEXT ? newBufferPeek(lvNext(atomicReferenceArray), jLpConsumerIndex, i4) : t3;
    }

    @Override // java.util.Queue
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.consumerBuffer;
        long jLpConsumerIndex = lpConsumerIndex();
        int i4 = this.consumerMask;
        int iCalcWrappedOffset = calcWrappedOffset(jLpConsumerIndex, i4);
        T t3 = (T) lvElement(atomicReferenceArray, iCalcWrappedOffset);
        boolean z3 = t3 == HAS_NEXT;
        if (t3 == null || z3) {
            if (z3) {
                return newBufferPoll(lvNext(atomicReferenceArray), jLpConsumerIndex, i4);
            }
            return null;
        }
        soElement(atomicReferenceArray, iCalcWrappedOffset, null);
        soConsumerIndex(jLpConsumerIndex + 1);
        return t3;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public int size() {
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

    @Override // java.util.Collection
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public T remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public <E> E[] toArray(E[] eArr) {
        throw new UnsupportedOperationException();
    }

    public boolean offer(T t3, T t4) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.producerBuffer;
        long jLvProducerIndex = lvProducerIndex();
        int i4 = this.producerMask;
        long j4 = 2 + jLvProducerIndex;
        if (lvElement(atomicReferenceArray, calcWrappedOffset(j4, i4)) == null) {
            int iCalcWrappedOffset = calcWrappedOffset(jLvProducerIndex, i4);
            soElement(atomicReferenceArray, iCalcWrappedOffset + 1, t4);
            soElement(atomicReferenceArray, iCalcWrappedOffset, t3);
            soProducerIndex(j4);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.producerBuffer = atomicReferenceArray2;
        int iCalcWrappedOffset2 = calcWrappedOffset(jLvProducerIndex, i4);
        soElement(atomicReferenceArray2, iCalcWrappedOffset2 + 1, t4);
        soElement(atomicReferenceArray2, iCalcWrappedOffset2, t3);
        soNext(atomicReferenceArray, atomicReferenceArray2);
        soElement(atomicReferenceArray, iCalcWrappedOffset2, HAS_NEXT);
        soProducerIndex(j4);
        return true;
    }
}
