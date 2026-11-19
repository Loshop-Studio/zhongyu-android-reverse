package okio;

import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class SegmentPool {
    private static final int HASH_BUCKET_COUNT;
    private static final AtomicReference<Segment>[] hashBuckets;
    public static final SegmentPool INSTANCE = new SegmentPool();
    private static final int MAX_SIZE = ArrayPool.STANDARD_BUFFER_SIZE_BYTES;
    private static final Segment LOCK = new Segment(new byte[0], 0, 0, false, false);

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        HASH_BUCKET_COUNT = iHighestOneBit;
        AtomicReference<Segment>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i4 = 0; i4 < iHighestOneBit; i4++) {
            atomicReferenceArr[i4] = new AtomicReference<>();
        }
        hashBuckets = atomicReferenceArr;
    }

    private SegmentPool() {
    }

    private final AtomicReference<Segment> firstRef() {
        Thread threadCurrentThread = Thread.currentThread();
        C2769l.m9240d(threadCurrentThread, "Thread.currentThread()");
        return hashBuckets[(int) (threadCurrentThread.getId() & (HASH_BUCKET_COUNT - 1))];
    }

    public static final void recycle(@NotNull Segment segment) {
        AtomicReference<Segment> atomicReferenceFirstRef;
        Segment segment2;
        C2769l.m9241e(segment, "segment");
        if (!(segment.next == null && segment.prev == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (segment.shared || (segment2 = (atomicReferenceFirstRef = INSTANCE.firstRef()).get()) == LOCK) {
            return;
        }
        int i4 = segment2 != null ? segment2.limit : 0;
        if (i4 >= MAX_SIZE) {
            return;
        }
        segment.next = segment2;
        segment.pos = 0;
        segment.limit = i4 + 8192;
        if (atomicReferenceFirstRef.compareAndSet(segment2, segment)) {
            return;
        }
        segment.next = null;
    }

    @NotNull
    public static final Segment take() {
        AtomicReference<Segment> atomicReferenceFirstRef = INSTANCE.firstRef();
        Segment segment = LOCK;
        Segment andSet = atomicReferenceFirstRef.getAndSet(segment);
        if (andSet == segment) {
            return new Segment();
        }
        if (andSet == null) {
            atomicReferenceFirstRef.set(null);
            return new Segment();
        }
        atomicReferenceFirstRef.set(andSet.next);
        andSet.next = null;
        andSet.limit = 0;
        return andSet;
    }

    public final int getByteCount() {
        Segment segment = firstRef().get();
        if (segment != null) {
            return segment.limit;
        }
        return 0;
    }

    public final int getMAX_SIZE() {
        return MAX_SIZE;
    }
}
