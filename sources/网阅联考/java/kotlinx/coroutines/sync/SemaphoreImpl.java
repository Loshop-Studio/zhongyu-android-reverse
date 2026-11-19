package kotlinx.coroutines.sync;

import androidx.concurrent.futures.AbstractC1739a;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.debug.internal.AbstractC4194a;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.ConcurrentLinkedListNode;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;

@Metadata(m5174d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0002\u0018\u00002\u00020\u001eB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00060\nH\u0002¢\u0006\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00060\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, m5175d2 = {"Lkotlinx/coroutines/sync/SemaphoreImpl;", "", "permits", "acquiredPermits", "<init>", "(II)V", "", "acquire", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "acquireSlowPath", "Lkotlinx/coroutines/CancellableContinuation;", "cont", "", "addAcquireToQueue", "(Lkotlinx/coroutines/CancellableContinuation;)Z", "release", "()V", "tryAcquire", "()Z", "tryResumeNextFromQueue", "tryResumeAcquire", "getAvailablePermits", "()I", "availablePermits", "Lkotlin/Function1;", "", "onCancellationRelease", "Lkotlin/jvm/functions/Function1;", "I", "kotlinx-coroutines-core", "Lkotlinx/coroutines/sync/Semaphore;"}, m5176k = 1, m5177mv = {1, 6, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
final class SemaphoreImpl implements Semaphore {
    volatile /* synthetic */ int _availablePermits;
    private volatile /* synthetic */ long deqIdx = 0;
    private volatile /* synthetic */ long enqIdx = 0;
    private volatile /* synthetic */ Object head;
    private final Function1<Throwable, Unit> onCancellationRelease;
    private final int permits;
    private volatile /* synthetic */ Object tail;
    private static final /* synthetic */ AtomicReferenceFieldUpdater head$FU = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, "head");
    private static final /* synthetic */ AtomicLongFieldUpdater deqIdx$FU = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "deqIdx");
    private static final /* synthetic */ AtomicReferenceFieldUpdater tail$FU = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, "tail");
    private static final /* synthetic */ AtomicLongFieldUpdater enqIdx$FU = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "enqIdx");
    static final /* synthetic */ AtomicIntegerFieldUpdater _availablePermits$FU = AtomicIntegerFieldUpdater.newUpdater(SemaphoreImpl.class, "_availablePermits");

    public SemaphoreImpl(int i4, int i5) {
        this.permits = i4;
        if (!(i4 > 0)) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i4).toString());
        }
        if (!(i5 >= 0 && i5 <= i4)) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i4).toString());
        }
        SemaphoreSegment semaphoreSegment = new SemaphoreSegment(0L, null, 2);
        this.head = semaphoreSegment;
        this.tail = semaphoreSegment;
        this._availablePermits = i4 - i5;
        this.onCancellationRelease = new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.sync.SemaphoreImpl$onCancellationRelease$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                this.this$0.release();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object acquireSlowPath(Continuation<? super Unit> continuation) {
        CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        while (true) {
            if (addAcquireToQueue(orCreateCancellableContinuation)) {
                break;
            }
            if (_availablePermits$FU.getAndDecrement(this) > 0) {
                orCreateCancellableContinuation.resume(Unit.INSTANCE, this.onCancellationRelease);
                break;
            }
        }
        Object result = orCreateCancellableContinuation.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean addAcquireToQueue(CancellableContinuation<? super Unit> cont) {
        Object objM13354constructorimpl;
        boolean z3;
        Segment segment = (SemaphoreSegment) this.tail;
        long andIncrement = enqIdx$FU.getAndIncrement(this);
        long j4 = andIncrement / SemaphoreKt.SEGMENT_SIZE;
        do {
            Segment segment2 = segment;
            while (true) {
                if (segment2.getId() >= j4 && !segment2.getRemoved()) {
                    objM13354constructorimpl = SegmentOrClosed.m13354constructorimpl(segment2);
                    break;
                }
                Object obj = segment2.get_next();
                if (obj == ConcurrentLinkedListKt.CLOSED) {
                    objM13354constructorimpl = SegmentOrClosed.m13354constructorimpl(ConcurrentLinkedListKt.CLOSED);
                    break;
                }
                Segment segmentCreateSegment = (Segment) ((ConcurrentLinkedListNode) obj);
                if (segmentCreateSegment == null) {
                    segmentCreateSegment = SemaphoreKt.createSegment(segment2.getId() + 1, (SemaphoreSegment) segment2);
                    if (segment2.trySetNext(segmentCreateSegment)) {
                        if (segment2.getRemoved()) {
                            segment2.remove();
                        }
                    }
                }
                segment2 = segmentCreateSegment;
            }
            if (SegmentOrClosed.m13359isClosedimpl(objM13354constructorimpl)) {
                break;
            }
            Segment segmentM13357getSegmentimpl = SegmentOrClosed.m13357getSegmentimpl(objM13354constructorimpl);
            while (true) {
                Segment segment3 = (Segment) this.tail;
                if (segment3.getId() >= segmentM13357getSegmentimpl.getId()) {
                    break;
                }
                if (!segmentM13357getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                    z3 = false;
                    break;
                }
                if (AbstractC1739a.m934a(tail$FU, this, segment3, segmentM13357getSegmentimpl)) {
                    if (segment3.decPointers$kotlinx_coroutines_core()) {
                        segment3.remove();
                    }
                } else if (segmentM13357getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                    segmentM13357getSegmentimpl.remove();
                }
            }
            z3 = true;
        } while (!z3);
        SemaphoreSegment semaphoreSegment = (SemaphoreSegment) SegmentOrClosed.m13357getSegmentimpl(objM13354constructorimpl);
        int i4 = (int) (andIncrement % SemaphoreKt.SEGMENT_SIZE);
        if (AbstractC4194a.m5327a(semaphoreSegment.acquirers, i4, null, cont)) {
            cont.invokeOnCancellation(new CancelSemaphoreAcquisitionHandler(semaphoreSegment, i4));
            return true;
        }
        if (!AbstractC4194a.m5327a(semaphoreSegment.acquirers, i4, SemaphoreKt.PERMIT, SemaphoreKt.TAKEN)) {
            return false;
        }
        cont.resume(Unit.INSTANCE, this.onCancellationRelease);
        return true;
    }

    private final boolean tryResumeAcquire(CancellableContinuation<? super Unit> cancellableContinuation) {
        Object objTryResume = cancellableContinuation.tryResume(Unit.INSTANCE, null, this.onCancellationRelease);
        if (objTryResume == null) {
            return false;
        }
        cancellableContinuation.completeResume(objTryResume);
        return true;
    }

    private final boolean tryResumeNextFromQueue() {
        Object objM13354constructorimpl;
        int i4;
        boolean z3;
        Segment segment = (SemaphoreSegment) this.head;
        long andIncrement = deqIdx$FU.getAndIncrement(this);
        long j4 = andIncrement / SemaphoreKt.SEGMENT_SIZE;
        do {
            Segment segment2 = segment;
            while (true) {
                if (segment2.getId() >= j4 && !segment2.getRemoved()) {
                    objM13354constructorimpl = SegmentOrClosed.m13354constructorimpl(segment2);
                    break;
                }
                Object obj = segment2.get_next();
                if (obj == ConcurrentLinkedListKt.CLOSED) {
                    objM13354constructorimpl = SegmentOrClosed.m13354constructorimpl(ConcurrentLinkedListKt.CLOSED);
                    break;
                }
                Segment segmentCreateSegment = (Segment) ((ConcurrentLinkedListNode) obj);
                if (segmentCreateSegment == null) {
                    segmentCreateSegment = SemaphoreKt.createSegment(segment2.getId() + 1, (SemaphoreSegment) segment2);
                    if (segment2.trySetNext(segmentCreateSegment)) {
                        if (segment2.getRemoved()) {
                            segment2.remove();
                        }
                    }
                }
                segment2 = segmentCreateSegment;
            }
            if (SegmentOrClosed.m13359isClosedimpl(objM13354constructorimpl)) {
                break;
            }
            Segment segmentM13357getSegmentimpl = SegmentOrClosed.m13357getSegmentimpl(objM13354constructorimpl);
            while (true) {
                Segment segment3 = (Segment) this.head;
                if (segment3.getId() >= segmentM13357getSegmentimpl.getId()) {
                    break;
                }
                if (!segmentM13357getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                    z3 = false;
                    break;
                }
                if (AbstractC1739a.m934a(head$FU, this, segment3, segmentM13357getSegmentimpl)) {
                    if (segment3.decPointers$kotlinx_coroutines_core()) {
                        segment3.remove();
                    }
                } else if (segmentM13357getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                    segmentM13357getSegmentimpl.remove();
                }
            }
            z3 = true;
        } while (!z3);
        SemaphoreSegment semaphoreSegment = (SemaphoreSegment) SegmentOrClosed.m13357getSegmentimpl(objM13354constructorimpl);
        semaphoreSegment.cleanPrev();
        if (semaphoreSegment.getId() > j4) {
            return false;
        }
        int i5 = (int) (andIncrement % SemaphoreKt.SEGMENT_SIZE);
        Object andSet = semaphoreSegment.acquirers.getAndSet(i5, SemaphoreKt.PERMIT);
        if (andSet != null) {
            if (andSet == SemaphoreKt.CANCELLED) {
                return false;
            }
            return tryResumeAcquire((CancellableContinuation) andSet);
        }
        int i6 = SemaphoreKt.MAX_SPIN_CYCLES;
        for (i4 = 0; i4 < i6; i4++) {
            if (semaphoreSegment.acquirers.get(i5) == SemaphoreKt.TAKEN) {
                return true;
            }
        }
        return !AbstractC4194a.m5327a(semaphoreSegment.acquirers, i5, SemaphoreKt.PERMIT, SemaphoreKt.BROKEN);
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    public Object acquire(Continuation<? super Unit> continuation) {
        if (_availablePermits$FU.getAndDecrement(this) > 0) {
            return Unit.INSTANCE;
        }
        Object objAcquireSlowPath = acquireSlowPath(continuation);
        return objAcquireSlowPath == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAcquireSlowPath : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    public int getAvailablePermits() {
        return Math.max(this._availablePermits, 0);
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    public void release() {
        while (true) {
            int i4 = this._availablePermits;
            if (!(i4 < this.permits)) {
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.permits).toString());
            }
            if (_availablePermits$FU.compareAndSet(this, i4, i4 + 1) && (i4 >= 0 || tryResumeNextFromQueue())) {
                return;
            }
        }
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    public boolean tryAcquire() {
        int i4;
        do {
            i4 = this._availablePermits;
            if (i4 <= 0) {
                return false;
            }
        } while (!_availablePermits$FU.compareAndSet(this, i4, i4 - 1));
        return true;
    }
}
