package androidx.compose.runtime;

import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.AbstractC9972n;
import kotlinx.coroutines.C9997c;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11831f;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class BroadcastFrameClock implements MonotonicFrameClock {
    public static final int $stable = 8;
    private List<FrameAwaiter<?>> awaiters;
    private Throwable failureCause;
    private final AtomicInt hasAwaitersUnlocked;
    private final Object lock;
    private final InterfaceC9529a onNewAwaiters;
    private List<FrameAwaiter<?>> spareList;

    public static final class FrameAwaiter<R> {
        private final InterfaceC11588c<R> continuation;
        private final InterfaceC9540l onFrame;

        /* JADX WARN: Multi-variable type inference failed */
        public FrameAwaiter(InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super R> interfaceC11588c) {
            this.onFrame = interfaceC9540l;
            this.continuation = interfaceC11588c;
        }

        public final InterfaceC11588c<R> getContinuation() {
            return this.continuation;
        }

        public final InterfaceC9540l getOnFrame() {
            return this.onFrame;
        }

        public final void resume(long j10) {
            Object objM20054c;
            InterfaceC11588c<R> interfaceC11588c = this.continuation;
            try {
                Result.C9921a c9921a = Result.f23263d;
                objM20054c = Result.m20054c(this.onFrame.invoke(Long.valueOf(j10)));
            } catch (Throwable th) {
                Result.C9921a c9921a2 = Result.f23263d;
                objM20054c = Result.m20054c(AbstractC9924b.m20070a(th));
            }
            interfaceC11588c.resumeWith(objM20054c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BroadcastFrameClock() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void cancel$default(BroadcastFrameClock broadcastFrameClock, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = new CancellationException("clock cancelled");
        }
        broadcastFrameClock.cancel(cancellationException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fail(Throwable th) {
        synchronized (this.lock) {
            try {
                if (this.failureCause != null) {
                    return;
                }
                this.failureCause = th;
                List<FrameAwaiter<?>> list = this.awaiters;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    InterfaceC11588c<?> continuation = list.get(i10).getContinuation();
                    Result.C9921a c9921a = Result.f23263d;
                    continuation.resumeWith(Result.m20054c(AbstractC9924b.m20070a(th)));
                }
                this.awaiters.clear();
                this.hasAwaitersUnlocked.set(0);
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void cancel(CancellationException cancellationException) {
        fail(cancellationException);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.InterfaceC9945d
    public <R> R fold(R r10, InterfaceC9544p interfaceC9544p) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r10, interfaceC9544p);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.InterfaceC9945d.b, kotlin.coroutines.InterfaceC9945d
    public <E extends InterfaceC9945d.b> E get(InterfaceC9945d.c cVar) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, cVar);
    }

    public final boolean getHasAwaiters() {
        return this.hasAwaitersUnlocked.get() != 0;
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.InterfaceC9945d
    public InterfaceC9945d minusKey(InterfaceC9945d.c cVar) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, cVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.InterfaceC9945d
    public InterfaceC9945d plus(InterfaceC9945d interfaceC9945d) {
        return MonotonicFrameClock.DefaultImpls.plus(this, interfaceC9945d);
    }

    public final void sendFrame(long j10) {
        synchronized (this.lock) {
            try {
                List<FrameAwaiter<?>> list = this.awaiters;
                this.awaiters = this.spareList;
                this.spareList = list;
                this.hasAwaitersUnlocked.set(0);
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.get(i10).resume(j10);
                }
                list.clear();
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public <R> Object withFrameNanos(InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super R> interfaceC11588c) {
        C9997c c9997c = new C9997c(IntrinsicsKt__IntrinsicsJvmKt.m20224d(interfaceC11588c), 1);
        c9997c.m20503F();
        final FrameAwaiter frameAwaiter = new FrameAwaiter(interfaceC9540l, c9997c);
        synchronized (this.lock) {
            Throwable th = this.failureCause;
            if (th != null) {
                Result.C9921a c9921a = Result.f23263d;
                c9997c.resumeWith(Result.m20054c(AbstractC9924b.m20070a(th)));
            } else {
                boolean zIsEmpty = this.awaiters.isEmpty();
                this.awaiters.add(frameAwaiter);
                if (zIsEmpty) {
                    this.hasAwaitersUnlocked.set(1);
                }
                c9997c.mo20536u(new InterfaceC9540l() { // from class: androidx.compose.runtime.BroadcastFrameClock$withFrameNanos$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Throwable) obj);
                        return C10786q.f26013a;
                    }

                    public final void invoke(Throwable th2) {
                        Object obj = this.this$0.lock;
                        BroadcastFrameClock broadcastFrameClock = this.this$0;
                        Object obj2 = frameAwaiter;
                        synchronized (obj) {
                            try {
                                broadcastFrameClock.awaiters.remove(obj2);
                                if (broadcastFrameClock.awaiters.isEmpty()) {
                                    broadcastFrameClock.hasAwaitersUnlocked.set(0);
                                }
                                C10786q c10786q = C10786q.f26013a;
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                });
                if (zIsEmpty && this.onNewAwaiters != null) {
                    try {
                        this.onNewAwaiters.invoke();
                    } catch (Throwable th2) {
                        fail(th2);
                    }
                }
            }
        }
        Object objM20538x = c9997c.m20538x();
        if (objM20538x == AbstractC11725a.m25952f()) {
            AbstractC11831f.m26221c(interfaceC11588c);
        }
        return objM20538x;
    }

    public BroadcastFrameClock(InterfaceC9529a interfaceC9529a) {
        this.onNewAwaiters = interfaceC9529a;
        this.lock = new Object();
        this.awaiters = new ArrayList();
        this.spareList = new ArrayList();
        this.hasAwaitersUnlocked = new AtomicInt(0);
    }

    public /* synthetic */ BroadcastFrameClock(InterfaceC9529a interfaceC9529a, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? null : interfaceC9529a);
    }
}
