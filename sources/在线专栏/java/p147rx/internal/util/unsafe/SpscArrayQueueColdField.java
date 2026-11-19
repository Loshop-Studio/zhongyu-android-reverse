package p147rx.internal.util.unsafe;

/* loaded from: classes2.dex */
abstract class SpscArrayQueueColdField<E> extends ConcurrentCircularArrayQueue<E> {
    private static final Integer MAX_LOOK_AHEAD_STEP = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    protected final int lookAheadStep;

    public SpscArrayQueueColdField(int i4) {
        super(i4);
        this.lookAheadStep = Math.min(i4 / 4, MAX_LOOK_AHEAD_STEP.intValue());
    }
}
