package p147rx.internal.util.unsafe;

import p147rx.internal.util.SuppressAnimalSniffer;

@SuppressAnimalSniffer
/* loaded from: classes2.dex */
abstract class SpmcArrayQueueProducerField<E> extends SpmcArrayQueueL1Pad<E> {
    protected static final long P_INDEX_OFFSET = UnsafeAccess.addressOf(SpmcArrayQueueProducerField.class, "producerIndex");
    private volatile long producerIndex;

    public SpmcArrayQueueProducerField(int i4) {
        super(i4);
    }

    protected final long lvProducerIndex() {
        return this.producerIndex;
    }

    protected final void soTail(long j4) {
        UnsafeAccess.UNSAFE.putOrderedLong(this, P_INDEX_OFFSET, j4);
    }
}
