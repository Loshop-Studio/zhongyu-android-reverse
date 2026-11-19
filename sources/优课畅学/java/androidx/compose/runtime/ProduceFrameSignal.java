package androidx.compose.runtime;

import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.C9155c;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9541f;

/* loaded from: classes2.dex */
final class ProduceFrameSignal {
    private Object pendingFrameContinuation;

    public final Object awaitFrameRequest(Object obj, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        C9155c c9155c;
        synchronized (obj) {
            if (this.pendingFrameContinuation == RecomposerKt.ProduceAnotherFrame) {
                this.pendingFrameContinuation = RecomposerKt.FramePending;
                return C8736p.f16368a;
            }
            C8736p c8736p = C8736p.f16368a;
            C9155c c9155c2 = new C9155c(IntrinsicsKt__IntrinsicsJvmKt.m16079d(interfaceC9324c), 1);
            c9155c2.m16343D();
            synchronized (obj) {
                try {
                    if (this.pendingFrameContinuation == RecomposerKt.ProduceAnotherFrame) {
                        this.pendingFrameContinuation = RecomposerKt.FramePending;
                        c9155c = c9155c2;
                    } else {
                        this.pendingFrameContinuation = c9155c2;
                        c9155c = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (c9155c != null) {
                Result.C9076a c9076a = Result.f17350b;
                c9155c.resumeWith(Result.m15909b(C8736p.f16368a));
            }
            Object objM16372x = c9155c2.m16372x();
            if (objM16372x == AbstractC9434a.m17291f()) {
                AbstractC9541f.m17811c(interfaceC9324c);
            }
            return objM16372x == AbstractC9434a.m17291f() ? objM16372x : C8736p.f16368a;
        }
    }

    public final InterfaceC9324c<C8736p> requestFrameLocked() {
        Object obj = this.pendingFrameContinuation;
        if (obj instanceof InterfaceC9324c) {
            this.pendingFrameContinuation = RecomposerKt.FramePending;
            return (InterfaceC9324c) obj;
        }
        if (AbstractC9133u.m16128b(obj, RecomposerKt.ProduceAnotherFrame) ? true : AbstractC9133u.m16128b(obj, RecomposerKt.FramePending)) {
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
