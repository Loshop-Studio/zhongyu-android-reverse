package io.reactivex.internal.queue;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.util.Pow2;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes5.dex */
public final class SpscLinkedArrayQueue<T> implements SimplePlainQueue<T> {
    AtomicReferenceArray<Object> consumerBuffer;
    final int consumerMask;
    AtomicReferenceArray<Object> producerBuffer;
    long producerLookAhead;
    int producerLookAheadStep;
    final int producerMask;
    static final int MAX_LOOK_AHEAD_STEP = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    private static final Object HAS_NEXT = new Object();
    final AtomicLong producerIndex = new AtomicLong();
    final AtomicLong consumerIndex = new AtomicLong();

    public SpscLinkedArrayQueue(int i9) {
        int iRoundToPowerOfTwo = Pow2.roundToPowerOfTwo(Math.max(8, i9));
        int i10 = iRoundToPowerOfTwo - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iRoundToPowerOfTwo + 1);
        this.producerBuffer = atomicReferenceArray;
        this.producerMask = i10;
        adjustLookAheadStep(iRoundToPowerOfTwo);
        this.consumerBuffer = atomicReferenceArray;
        this.consumerMask = i10;
        this.producerLookAhead = iRoundToPowerOfTwo - 2;
        soProducerIndex(0L);
    }

    private void adjustLookAheadStep(int i9) {
        this.producerLookAheadStep = Math.min(i9 / 4, MAX_LOOK_AHEAD_STEP);
    }

    private static int calcDirectOffset(int i9) {
        return i9;
    }

    private static int calcWrappedOffset(long j9, int i9) {
        return calcDirectOffset(((int) j9) & i9);
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

    private static <E> Object lvElement(AtomicReferenceArray<Object> atomicReferenceArray, int i9) {
        return atomicReferenceArray.get(i9);
    }

    private AtomicReferenceArray<Object> lvNextBufferAndUnlink(AtomicReferenceArray<Object> atomicReferenceArray, int i9) {
        int iCalcDirectOffset = calcDirectOffset(i9);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) lvElement(atomicReferenceArray, iCalcDirectOffset);
        soElement(atomicReferenceArray, iCalcDirectOffset, null);
        return atomicReferenceArray2;
    }

    private long lvProducerIndex() {
        return this.producerIndex.get();
    }

    private T newBufferPeek(AtomicReferenceArray<Object> atomicReferenceArray, long j9, int i9) {
        this.consumerBuffer = atomicReferenceArray;
        return (T) lvElement(atomicReferenceArray, calcWrappedOffset(j9, i9));
    }

    private T newBufferPoll(AtomicReferenceArray<Object> atomicReferenceArray, long j9, int i9) {
        this.consumerBuffer = atomicReferenceArray;
        int iCalcWrappedOffset = calcWrappedOffset(j9, i9);
        T t9 = (T) lvElement(atomicReferenceArray, iCalcWrappedOffset);
        if (t9 != null) {
            soElement(atomicReferenceArray, iCalcWrappedOffset, null);
            soConsumerIndex(j9 + 1);
        }
        return t9;
    }

    private void resize(AtomicReferenceArray<Object> atomicReferenceArray, long j9, int i9, T t9, long j10) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.producerBuffer = atomicReferenceArray2;
        this.producerLookAhead = (j10 + j9) - 1;
        soElement(atomicReferenceArray2, i9, t9);
        soNext(atomicReferenceArray, atomicReferenceArray2);
        soElement(atomicReferenceArray, i9, HAS_NEXT);
        soProducerIndex(j9 + 1);
    }

    private void soConsumerIndex(long j9) {
        this.consumerIndex.lazySet(j9);
    }

    private static void soElement(AtomicReferenceArray<Object> atomicReferenceArray, int i9, Object obj) {
        atomicReferenceArray.lazySet(i9, obj);
    }

    private void soNext(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        soElement(atomicReferenceArray, calcDirectOffset(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    private void soProducerIndex(long j9) {
        this.producerIndex.lazySet(j9);
    }

    private boolean writeToQueue(AtomicReferenceArray<Object> atomicReferenceArray, T t9, long j9, int i9) {
        soElement(atomicReferenceArray, i9, t9);
        soProducerIndex(j9 + 1);
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return lvProducerIndex() == lvConsumerIndex();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(T t9) {
        if (t9 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray<Object> atomicReferenceArray = this.producerBuffer;
        long jLpProducerIndex = lpProducerIndex();
        int i9 = this.producerMask;
        int iCalcWrappedOffset = calcWrappedOffset(jLpProducerIndex, i9);
        if (jLpProducerIndex < this.producerLookAhead) {
            return writeToQueue(atomicReferenceArray, t9, jLpProducerIndex, iCalcWrappedOffset);
        }
        long j9 = this.producerLookAheadStep + jLpProducerIndex;
        if (lvElement(atomicReferenceArray, calcWrappedOffset(j9, i9)) == null) {
            this.producerLookAhead = j9 - 1;
            return writeToQueue(atomicReferenceArray, t9, jLpProducerIndex, iCalcWrappedOffset);
        }
        if (lvElement(atomicReferenceArray, calcWrappedOffset(jLpProducerIndex + 1, i9)) == null) {
            return writeToQueue(atomicReferenceArray, t9, jLpProducerIndex, iCalcWrappedOffset);
        }
        resize(atomicReferenceArray, jLpProducerIndex, iCalcWrappedOffset, t9, i9);
        return true;
    }

    public T peek() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.consumerBuffer;
        long jLpConsumerIndex = lpConsumerIndex();
        int i9 = this.consumerMask;
        T t9 = (T) lvElement(atomicReferenceArray, calcWrappedOffset(jLpConsumerIndex, i9));
        return t9 == HAS_NEXT ? newBufferPeek(lvNextBufferAndUnlink(atomicReferenceArray, i9 + 1), jLpConsumerIndex, i9) : t9;
    }

    @Override // io.reactivex.internal.fuseable.SimplePlainQueue, io.reactivex.internal.fuseable.SimpleQueue
    @Nullable
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.consumerBuffer;
        long jLpConsumerIndex = lpConsumerIndex();
        int i9 = this.consumerMask;
        int iCalcWrappedOffset = calcWrappedOffset(jLpConsumerIndex, i9);
        T t9 = (T) lvElement(atomicReferenceArray, iCalcWrappedOffset);
        boolean z9 = t9 == HAS_NEXT;
        if (t9 == null || z9) {
            if (z9) {
                return newBufferPoll(lvNextBufferAndUnlink(atomicReferenceArray, i9 + 1), jLpConsumerIndex, i9);
            }
            return null;
        }
        soElement(atomicReferenceArray, iCalcWrappedOffset, null);
        soConsumerIndex(jLpConsumerIndex + 1);
        return t9;
    }

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

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(T t9, T t10) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.producerBuffer;
        long jLvProducerIndex = lvProducerIndex();
        int i9 = this.producerMask;
        long j9 = 2 + jLvProducerIndex;
        if (lvElement(atomicReferenceArray, calcWrappedOffset(j9, i9)) == null) {
            int iCalcWrappedOffset = calcWrappedOffset(jLvProducerIndex, i9);
            soElement(atomicReferenceArray, iCalcWrappedOffset + 1, t10);
            soElement(atomicReferenceArray, iCalcWrappedOffset, t9);
            soProducerIndex(j9);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.producerBuffer = atomicReferenceArray2;
        int iCalcWrappedOffset2 = calcWrappedOffset(jLvProducerIndex, i9);
        soElement(atomicReferenceArray2, iCalcWrappedOffset2 + 1, t10);
        soElement(atomicReferenceArray2, iCalcWrappedOffset2, t9);
        soNext(atomicReferenceArray, atomicReferenceArray2);
        soElement(atomicReferenceArray, iCalcWrappedOffset2, HAS_NEXT);
        soProducerIndex(j9);
        return true;
    }
}
