package p147rx.internal.util.atomic;

import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes2.dex */
public final class SpscAtomicArrayQueue<E> extends AtomicReferenceArrayQueue<E> {
    private static final Integer MAX_LOOK_AHEAD_STEP = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    final AtomicLong consumerIndex;
    final int lookAheadStep;
    final AtomicLong producerIndex;
    long producerLookAhead;

    public SpscAtomicArrayQueue(int i4) {
        super(i4);
        this.producerIndex = new AtomicLong();
        this.consumerIndex = new AtomicLong();
        this.lookAheadStep = Math.min(i4 / 4, MAX_LOOK_AHEAD_STEP.intValue());
    }

    private long lvConsumerIndex() {
        return this.consumerIndex.get();
    }

    private long lvProducerIndex() {
        return this.producerIndex.get();
    }

    private void soConsumerIndex(long j4) {
        this.consumerIndex.lazySet(j4);
    }

    private void soProducerIndex(long j4) {
        this.producerIndex.lazySet(j4);
    }

    @Override // p147rx.internal.util.atomic.AtomicReferenceArrayQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return lvProducerIndex() == lvConsumerIndex();
    }

    @Override // p147rx.internal.util.atomic.AtomicReferenceArrayQueue, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    @Override // java.util.Queue
    public boolean offer(E e4) {
        Objects.requireNonNull(e4, "Null is not a valid element");
        AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
        int i4 = this.mask;
        long j4 = this.producerIndex.get();
        int iCalcElementOffset = calcElementOffset(j4, i4);
        if (j4 >= this.producerLookAhead) {
            long j5 = this.lookAheadStep + j4;
            if (lvElement(atomicReferenceArray, calcElementOffset(j5, i4)) == null) {
                this.producerLookAhead = j5;
            } else if (lvElement(atomicReferenceArray, iCalcElementOffset) != null) {
                return false;
            }
        }
        soElement(atomicReferenceArray, iCalcElementOffset, e4);
        soProducerIndex(j4 + 1);
        return true;
    }

    @Override // java.util.Queue
    public E peek() {
        return lvElement(calcElementOffset(this.consumerIndex.get()));
    }

    @Override // java.util.Queue
    public E poll() {
        long j4 = this.consumerIndex.get();
        int iCalcElementOffset = calcElementOffset(j4);
        AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
        E eLvElement = lvElement(atomicReferenceArray, iCalcElementOffset);
        if (eLvElement == null) {
            return null;
        }
        soElement(atomicReferenceArray, iCalcElementOffset, null);
        soConsumerIndex(j4 + 1);
        return eLvElement;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
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
}
