package androidx.compose.runtime;

import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.C9997c;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11831f;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
final class ProduceFrameSignal {
    private Object pendingFrameContinuation;

    public final Object awaitFrameRequest(Object obj, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        C9997c c9997c;
        synchronized (obj) {
            if (this.pendingFrameContinuation == RecomposerKt.ProduceAnotherFrame) {
                this.pendingFrameContinuation = RecomposerKt.FramePending;
                return C10786q.f26013a;
            }
            C10786q c10786q = C10786q.f26013a;
            C9997c c9997c2 = new C9997c(IntrinsicsKt__IntrinsicsJvmKt.m20224d(interfaceC11588c), 1);
            c9997c2.m20503F();
            synchronized (obj) {
                try {
                    if (this.pendingFrameContinuation == RecomposerKt.ProduceAnotherFrame) {
                        this.pendingFrameContinuation = RecomposerKt.FramePending;
                        c9997c = c9997c2;
                    } else {
                        this.pendingFrameContinuation = c9997c2;
                        c9997c = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (c9997c != null) {
                Result.C9921a c9921a = Result.f23263d;
                c9997c.resumeWith(Result.m20054c(C10786q.f26013a));
            }
            Object objM20538x = c9997c2.m20538x();
            if (objM20538x == AbstractC11725a.m25952f()) {
                AbstractC11831f.m26221c(interfaceC11588c);
            }
            return objM20538x == AbstractC11725a.m25952f() ? objM20538x : C10786q.f26013a;
        }
    }

    public final InterfaceC11588c<C10786q> requestFrameLocked() {
        Object obj = this.pendingFrameContinuation;
        if (obj instanceof InterfaceC11588c) {
            this.pendingFrameContinuation = RecomposerKt.FramePending;
            return (InterfaceC11588c) obj;
        }
        if (AbstractC9979u.m20289b(obj, RecomposerKt.ProduceAnotherFrame) ? true : AbstractC9979u.m20289b(obj, RecomposerKt.FramePending)) {
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
