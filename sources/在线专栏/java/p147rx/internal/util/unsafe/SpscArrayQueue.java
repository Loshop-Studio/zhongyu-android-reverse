package p147rx.internal.util.unsafe;

import java.util.Objects;
import p147rx.internal.util.SuppressAnimalSniffer;

@SuppressAnimalSniffer
/* loaded from: classes2.dex */
public final class SpscArrayQueue<E> extends SpscArrayQueueL3Pad<E> {
    public SpscArrayQueue(int i4) {
        super(i4);
    }

    private long lvConsumerIndex() {
        return UnsafeAccess.UNSAFE.getLongVolatile(this, SpscArrayQueueConsumerField.C_INDEX_OFFSET);
    }

    private long lvProducerIndex() {
        return UnsafeAccess.UNSAFE.getLongVolatile(this, SpscArrayQueueProducerFields.P_INDEX_OFFSET);
    }

    private void soConsumerIndex(long j4) {
        UnsafeAccess.UNSAFE.putOrderedLong(this, SpscArrayQueueConsumerField.C_INDEX_OFFSET, j4);
    }

    private void soProducerIndex(long j4) {
        UnsafeAccess.UNSAFE.putOrderedLong(this, SpscArrayQueueProducerFields.P_INDEX_OFFSET, j4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p147rx.internal.util.unsafe.MessagePassingQueue
    public boolean isEmpty() {
        return lvProducerIndex() == lvConsumerIndex();
    }

    @Override // java.util.Queue, p147rx.internal.util.unsafe.MessagePassingQueue
    public boolean offer(E e4) {
        Objects.requireNonNull(e4, "null elements not allowed");
        E[] eArr = this.buffer;
        long j4 = this.producerIndex;
        long jCalcElementOffset = calcElementOffset(j4);
        if (lvElement(eArr, jCalcElementOffset) != null) {
            return false;
        }
        soElement(eArr, jCalcElementOffset, e4);
        soProducerIndex(j4 + 1);
        return true;
    }

    @Override // java.util.Queue, p147rx.internal.util.unsafe.MessagePassingQueue
    public E peek() {
        return lvElement(calcElementOffset(this.consumerIndex));
    }

    @Override // java.util.Queue, p147rx.internal.util.unsafe.MessagePassingQueue
    public E poll() {
        long j4 = this.consumerIndex;
        long jCalcElementOffset = calcElementOffset(j4);
        E[] eArr = this.buffer;
        E eLvElement = lvElement(eArr, jCalcElementOffset);
        if (eLvElement == null) {
            return null;
        }
        soElement(eArr, jCalcElementOffset, null);
        soConsumerIndex(j4 + 1);
        return eLvElement;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p147rx.internal.util.unsafe.MessagePassingQueue
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
