package io.reactivex.internal.queue;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.util.Pow2;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes4.dex */
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

    public SpscLinkedArrayQueue(int i6) {
        int iRoundToPowerOfTwo = Pow2.roundToPowerOfTwo(Math.max(8, i6));
        int i7 = iRoundToPowerOfTwo - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iRoundToPowerOfTwo + 1);
        this.producerBuffer = atomicReferenceArray;
        this.producerMask = i7;
        adjustLookAheadStep(iRoundToPowerOfTwo);
        this.consumerBuffer = atomicReferenceArray;
        this.consumerMask = i7;
        this.producerLookAhead = iRoundToPowerOfTwo - 2;
        soProducerIndex(0L);
    }

    private void adjustLookAheadStep(int i6) {
        this.producerLookAheadStep = Math.min(i6 / 4, MAX_LOOK_AHEAD_STEP);
    }

    private static int calcDirectOffset(int i6) {
        return i6;
    }

    private static int calcWrappedOffset(long j6, int i6) {
        return calcDirectOffset(((int) j6) & i6);
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

    private static <E> Object lvElement(AtomicReferenceArray<Object> atomicReferenceArray, int i6) {
        return atomicReferenceArray.get(i6);
    }

    private AtomicReferenceArray<Object> lvNextBufferAndUnlink(AtomicReferenceArray<Object> atomicReferenceArray, int i6) {
        int iCalcDirectOffset = calcDirectOffset(i6);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) lvElement(atomicReferenceArray, iCalcDirectOffset);
        soElement(atomicReferenceArray, iCalcDirectOffset, null);
        return atomicReferenceArray2;
    }

    private long lvProducerIndex() {
        return this.producerIndex.get();
    }

    private T newBufferPeek(AtomicReferenceArray<Object> atomicReferenceArray, long j6, int i6) {
        this.consumerBuffer = atomicReferenceArray;
        return (T) lvElement(atomicReferenceArray, calcWrappedOffset(j6, i6));
    }

    private T newBufferPoll(AtomicReferenceArray<Object> atomicReferenceArray, long j6, int i6) {
        this.consumerBuffer = atomicReferenceArray;
        int iCalcWrappedOffset = calcWrappedOffset(j6, i6);
        T t6 = (T) lvElement(atomicReferenceArray, iCalcWrappedOffset);
        if (t6 != null) {
            soElement(atomicReferenceArray, iCalcWrappedOffset, null);
            soConsumerIndex(j6 + 1);
        }
        return t6;
    }

    private void resize(AtomicReferenceArray<Object> atomicReferenceArray, long j6, int i6, T t6, long j7) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.producerBuffer = atomicReferenceArray2;
        this.producerLookAhead = (j7 + j6) - 1;
        soElement(atomicReferenceArray2, i6, t6);
        soNext(atomicReferenceArray, atomicReferenceArray2);
        soElement(atomicReferenceArray, i6, HAS_NEXT);
        soProducerIndex(j6 + 1);
    }

    private void soConsumerIndex(long j6) {
        this.consumerIndex.lazySet(j6);
    }

    private static void soElement(AtomicReferenceArray<Object> atomicReferenceArray, int i6, Object obj) {
        atomicReferenceArray.lazySet(i6, obj);
    }

    private void soNext(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        soElement(atomicReferenceArray, calcDirectOffset(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    private void soProducerIndex(long j6) {
        this.producerIndex.lazySet(j6);
    }

    private boolean writeToQueue(AtomicReferenceArray<Object> atomicReferenceArray, T t6, long j6, int i6) {
        soElement(atomicReferenceArray, i6, t6);
        soProducerIndex(j6 + 1);
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
    public boolean offer(T t6) {
        if (t6 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray<Object> atomicReferenceArray = this.producerBuffer;
        long jLpProducerIndex = lpProducerIndex();
        int i6 = this.producerMask;
        int iCalcWrappedOffset = calcWrappedOffset(jLpProducerIndex, i6);
        if (jLpProducerIndex < this.producerLookAhead) {
            return writeToQueue(atomicReferenceArray, t6, jLpProducerIndex, iCalcWrappedOffset);
        }
        long j6 = this.producerLookAheadStep + jLpProducerIndex;
        if (lvElement(atomicReferenceArray, calcWrappedOffset(j6, i6)) == null) {
            this.producerLookAhead = j6 - 1;
            return writeToQueue(atomicReferenceArray, t6, jLpProducerIndex, iCalcWrappedOffset);
        }
        if (lvElement(atomicReferenceArray, calcWrappedOffset(jLpProducerIndex + 1, i6)) == null) {
            return writeToQueue(atomicReferenceArray, t6, jLpProducerIndex, iCalcWrappedOffset);
        }
        resize(atomicReferenceArray, jLpProducerIndex, iCalcWrappedOffset, t6, i6);
        return true;
    }

    public T peek() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.consumerBuffer;
        long jLpConsumerIndex = lpConsumerIndex();
        int i6 = this.consumerMask;
        T t6 = (T) lvElement(atomicReferenceArray, calcWrappedOffset(jLpConsumerIndex, i6));
        return t6 == HAS_NEXT ? newBufferPeek(lvNextBufferAndUnlink(atomicReferenceArray, i6 + 1), jLpConsumerIndex, i6) : t6;
    }

    @Override // io.reactivex.internal.fuseable.SimplePlainQueue, io.reactivex.internal.fuseable.SimpleQueue
    @Nullable
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.consumerBuffer;
        long jLpConsumerIndex = lpConsumerIndex();
        int i6 = this.consumerMask;
        int iCalcWrappedOffset = calcWrappedOffset(jLpConsumerIndex, i6);
        T t6 = (T) lvElement(atomicReferenceArray, iCalcWrappedOffset);
        boolean z6 = t6 == HAS_NEXT;
        if (t6 == null || z6) {
            if (z6) {
                return newBufferPoll(lvNextBufferAndUnlink(atomicReferenceArray, i6 + 1), jLpConsumerIndex, i6);
            }
            return null;
        }
        soElement(atomicReferenceArray, iCalcWrappedOffset, null);
        soConsumerIndex(jLpConsumerIndex + 1);
        return t6;
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
    public boolean offer(T t6, T t7) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.producerBuffer;
        long jLvProducerIndex = lvProducerIndex();
        int i6 = this.producerMask;
        long j6 = 2 + jLvProducerIndex;
        if (lvElement(atomicReferenceArray, calcWrappedOffset(j6, i6)) == null) {
            int iCalcWrappedOffset = calcWrappedOffset(jLvProducerIndex, i6);
            soElement(atomicReferenceArray, iCalcWrappedOffset + 1, t7);
            soElement(atomicReferenceArray, iCalcWrappedOffset, t6);
            soProducerIndex(j6);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.producerBuffer = atomicReferenceArray2;
        int iCalcWrappedOffset2 = calcWrappedOffset(jLvProducerIndex, i6);
        soElement(atomicReferenceArray2, iCalcWrappedOffset2 + 1, t7);
        soElement(atomicReferenceArray2, iCalcWrappedOffset2, t6);
        soNext(atomicReferenceArray, atomicReferenceArray2);
        soElement(atomicReferenceArray, iCalcWrappedOffset2, HAS_NEXT);
        soProducerIndex(j6);
        return true;
    }
}
