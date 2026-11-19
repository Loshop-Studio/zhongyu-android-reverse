package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata(m13557d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u00060\u0001j\u0002`\u0007H\u0086@¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nJ\u0006\u0010\u000b\u001a\u00020\u0005R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, m13558d2 = {"Landroidx/compose/runtime/ProduceFrameSignal;", "", "()V", "pendingFrameContinuation", "awaitFrameRequest", "", "lock", "Landroidx/compose/runtime/platform/SynchronizedObject;", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestFrameLocked", "Lkotlin/coroutines/Continuation;", "takeFrameRequestLocked", "runtime_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/ProduceFrameSignal\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n*L\n1#1,1791:1\n33#2,2:1792\n33#2,2:1803\n314#3,9:1794\n323#3,2:1805\n48#4,5:1807\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/ProduceFrameSignal\n*L\n1713#1:1792,2\n1720#1:1803,2\n1719#1:1794,9\n1719#1:1805,2\n1738#1:1807,5\n*E\n"})
/* loaded from: classes2.dex */
final class ProduceFrameSignal {
    private Object pendingFrameContinuation;

    public final Object awaitFrameRequest(Object obj, Continuation<? super Unit> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl;
        synchronized (obj) {
            if (this.pendingFrameContinuation == RecomposerKt.ProduceAnotherFrame) {
                this.pendingFrameContinuation = RecomposerKt.FramePending;
                return Unit.INSTANCE;
            }
            Unit unit = Unit.INSTANCE;
            CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl2.initCancellability();
            synchronized (obj) {
                try {
                    if (this.pendingFrameContinuation == RecomposerKt.ProduceAnotherFrame) {
                        this.pendingFrameContinuation = RecomposerKt.FramePending;
                        cancellableContinuationImpl = cancellableContinuationImpl2;
                    } else {
                        this.pendingFrameContinuation = cancellableContinuationImpl2;
                        cancellableContinuationImpl = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (cancellableContinuationImpl != null) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuationImpl.resumeWith(Result.m24299constructorimpl(Unit.INSTANCE));
            }
            Object result = cancellableContinuationImpl2.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
        }
    }

    public final Continuation<Unit> requestFrameLocked() {
        Object obj = this.pendingFrameContinuation;
        if (obj instanceof Continuation) {
            this.pendingFrameContinuation = RecomposerKt.FramePending;
            return (Continuation) obj;
        }
        if (Intrinsics.areEqual(obj, RecomposerKt.ProduceAnotherFrame) ? true : Intrinsics.areEqual(obj, RecomposerKt.FramePending)) {
            return null;
        }
        if (obj == null) {
            this.pendingFrameContinuation = RecomposerKt.ProduceAnotherFrame;
            return null;
        }
        throw new IllegalStateException(("invalid pendingFrameContinuation " + obj).toString());
    }

    public final void takeFrameRequestLocked() {
        if (!(this.pendingFrameContinuation == RecomposerKt.FramePending)) {
            PreconditionsKt.throwIllegalStateException("frame not pending");
        }
        this.pendingFrameContinuation = null;
    }
}
