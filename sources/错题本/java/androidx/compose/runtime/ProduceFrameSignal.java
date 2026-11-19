package androidx.compose.runtime;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C5961g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p185v7.AbstractC6683l;

@Metadata(m5109d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0001j\u0002`\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003J\u0015\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m5110d2 = {"Landroidx/compose/runtime/ProduceFrameSignal;", "", "<init>", "()V", "Landroidx/compose/runtime/platform/SynchronizedObject;", "lock", "Ld6/s;", "awaitFrameRequest", "(Ljava/lang/Object;Lh6/c;)Ljava/lang/Object;", "takeFrameRequestLocked", "Lh6/c;", "requestFrameLocked", "()Lh6/c;", "pendingFrameContinuation", "Ljava/lang/Object;", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/ProduceFrameSignal\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n*L\n1#1,1791:1\n33#2,2:1792\n33#2,2:1803\n314#3,9:1794\n323#3,2:1805\n48#4,5:1807\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/ProduceFrameSignal\n*L\n1713#1:1792,2\n1720#1:1803,2\n1719#1:1794,9\n1719#1:1805,2\n1738#1:1807,5\n*E\n"})
/* loaded from: classes.dex */
final class ProduceFrameSignal {

    @Nullable
    private Object pendingFrameContinuation;

    @Nullable
    public final Object awaitFrameRequest(@NotNull Object obj, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        C5961g c5961g;
        synchronized (obj) {
            if (this.pendingFrameContinuation == RecomposerKt.ProduceAnotherFrame) {
                this.pendingFrameContinuation = RecomposerKt.FramePending;
                return C5443s.f8405a;
            }
            C5961g c5961g2 = new C5961g(1, AbstractC6683l.m6374n(interfaceC5631c));
            c5961g2.m5584u();
            synchronized (obj) {
                try {
                    if (this.pendingFrameContinuation == RecomposerKt.ProduceAnotherFrame) {
                        this.pendingFrameContinuation = RecomposerKt.FramePending;
                        c5961g = c5961g2;
                    } else {
                        this.pendingFrameContinuation = c5961g2;
                        c5961g = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (c5961g != null) {
                c5961g.resumeWith(Result.m13956constructorimpl(C5443s.f8405a));
            }
            Object objM5583t = c5961g2.m5583t();
            return objM5583t == CoroutineSingletons.COROUTINE_SUSPENDED ? objM5583t : C5443s.f8405a;
        }
    }

    @Nullable
    public final InterfaceC5631c<C5443s> requestFrameLocked() {
        Object obj = this.pendingFrameContinuation;
        if (obj instanceof InterfaceC5631c) {
            this.pendingFrameContinuation = RecomposerKt.FramePending;
            return (InterfaceC5631c) obj;
        }
        if (AbstractC5830k.m5325b(obj, RecomposerKt.ProduceAnotherFrame) ? true : AbstractC5830k.m5325b(obj, RecomposerKt.FramePending)) {
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
