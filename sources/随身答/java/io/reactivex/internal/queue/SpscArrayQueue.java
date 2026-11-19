package io.reactivex.internal.queue;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.util.Pow2;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes5.dex */
public final class SpscArrayQueue<E> extends AtomicReferenceArray<E> implements SimplePlainQueue<E> {
    private static final Integer MAX_LOOK_AHEAD_STEP = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;
    final AtomicLong consumerIndex;
    final int lookAheadStep;
    final int mask;
    final AtomicLong producerIndex;
    long producerLookAhead;

    public SpscArrayQueue(int i9) {
        super(Pow2.roundToPowerOfTwo(i9));
        this.mask = length() - 1;
        this.producerIndex = new AtomicLong();
        this.consumerIndex = new AtomicLong();
        this.lookAheadStep = Math.min(i9 / 4, MAX_LOOK_AHEAD_STEP.intValue());
    }

    public int calcElementOffset(long j9, int i9) {
        return ((int) j9) & i9;
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
        return this.producerIndex.get() == this.consumerIndex.get();
    }

    public E lvElement(int i9) {
        return get(i9);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(E e10) {
        if (e10 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        int i9 = this.mask;
        long j9 = this.producerIndex.get();
        int iCalcElementOffset = calcElementOffset(j9, i9);
        if (j9 >= this.producerLookAhead) {
            long j10 = this.lookAheadStep + j9;
            if (lvElement(calcElementOffset(j10, i9)) == null) {
                this.producerLookAhead = j10;
            } else if (lvElement(iCalcElementOffset) != null) {
                return false;
            }
        }
        soElement(iCalcElementOffset, e10);
        soProducerIndex(j9 + 1);
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimplePlainQueue, io.reactivex.internal.fuseable.SimpleQueue
    @Nullable
    public E poll() {
        long j9 = this.consumerIndex.get();
        int iCalcElementOffset = calcElementOffset(j9);
        E eLvElement = lvElement(iCalcElementOffset);
        if (eLvElement == null) {
            return null;
        }
        soConsumerIndex(j9 + 1);
        soElement(iCalcElementOffset, null);
        return eLvElement;
    }

    public void soConsumerIndex(long j9) {
        this.consumerIndex.lazySet(j9);
    }

    public void soElement(int i9, E e10) {
        lazySet(i9, e10);
    }

    public void soProducerIndex(long j9) {
        this.producerIndex.lazySet(j9);
    }

    public int calcElementOffset(long j9) {
        return ((int) j9) & this.mask;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(E e10, E e11) {
        return offer(e10) && offer(e11);
    }
}
