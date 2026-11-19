package androidx.compose.runtime;

import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC9079b;
import kotlin.Result;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.AbstractC9126n;
import kotlinx.coroutines.C9155c;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9541f;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class BroadcastFrameClock implements MonotonicFrameClock {
    public static final int $stable = 8;
    private List<FrameAwaiter<?>> awaiters;
    private Throwable failureCause;
    private final AtomicInt hasAwaitersUnlocked;
    private final Object lock;
    private final InterfaceC10559a onNewAwaiters;
    private List<FrameAwaiter<?>> spareList;

    public static final class FrameAwaiter<R> {
        private final InterfaceC9324c<R> continuation;
        private final InterfaceC10570l onFrame;

        /* JADX WARN: Multi-variable type inference failed */
        public FrameAwaiter(InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super R> interfaceC9324c) {
            this.onFrame = interfaceC10570l;
            this.continuation = interfaceC9324c;
        }

        public final InterfaceC9324c<R> getContinuation() {
            return this.continuation;
        }

        public final InterfaceC10570l getOnFrame() {
            return this.onFrame;
        }

        public final void resume(long j10) {
            Object objM15909b;
            InterfaceC9324c<R> interfaceC9324c = this.continuation;
            try {
                Result.C9076a c9076a = Result.f17350b;
                objM15909b = Result.m15909b(this.onFrame.invoke(Long.valueOf(j10)));
            } catch (Throwable th) {
                Result.C9076a c9076a2 = Result.f17350b;
                objM15909b = Result.m15909b(AbstractC9079b.m15925a(th));
            }
            interfaceC9324c.resumeWith(objM15909b);
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
                    InterfaceC9324c<?> continuation = list.get(i10).getContinuation();
                    Result.C9076a c9076a = Result.f17350b;
                    continuation.resumeWith(Result.m15909b(AbstractC9079b.m15925a(th)));
                }
                this.awaiters.clear();
                this.hasAwaitersUnlocked.set(0);
                C8736p c8736p = C8736p.f16368a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void cancel(CancellationException cancellationException) {
        fail(cancellationException);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.InterfaceC9100d
    public <R> R fold(R r10, InterfaceC10574p interfaceC10574p) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r10, interfaceC10574p);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.InterfaceC9100d.b, kotlin.coroutines.InterfaceC9100d
    public <E extends InterfaceC9100d.b> E get(InterfaceC9100d.c cVar) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, cVar);
    }

    public final boolean getHasAwaiters() {
        return this.hasAwaitersUnlocked.get() != 0;
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.InterfaceC9100d
    public InterfaceC9100d minusKey(InterfaceC9100d.c cVar) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, cVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.InterfaceC9100d
    public InterfaceC9100d plus(InterfaceC9100d interfaceC9100d) {
        return MonotonicFrameClock.DefaultImpls.plus(this, interfaceC9100d);
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
                C8736p c8736p = C8736p.f16368a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public <R> Object withFrameNanos(InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super R> interfaceC9324c) {
        C9155c c9155c = new C9155c(IntrinsicsKt__IntrinsicsJvmKt.m16079d(interfaceC9324c), 1);
        c9155c.m16343D();
        final FrameAwaiter frameAwaiter = new FrameAwaiter(interfaceC10570l, c9155c);
        synchronized (this.lock) {
            Throwable th = this.failureCause;
            if (th != null) {
                Result.C9076a c9076a = Result.f17350b;
                c9155c.resumeWith(Result.m15909b(AbstractC9079b.m15925a(th)));
            } else {
                boolean zIsEmpty = this.awaiters.isEmpty();
                this.awaiters.add(frameAwaiter);
                if (zIsEmpty) {
                    this.hasAwaitersUnlocked.set(1);
                }
                c9155c.mo14873r(new InterfaceC10570l() { // from class: androidx.compose.runtime.BroadcastFrameClock$withFrameNanos$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p300x7.InterfaceC10570l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Throwable) obj);
                        return C8736p.f16368a;
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
                                C8736p c8736p = C8736p.f16368a;
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
        Object objM16372x = c9155c.m16372x();
        if (objM16372x == AbstractC9434a.m17291f()) {
            AbstractC9541f.m17811c(interfaceC9324c);
        }
        return objM16372x;
    }

    public BroadcastFrameClock(InterfaceC10559a interfaceC10559a) {
        this.onNewAwaiters = interfaceC10559a;
        this.lock = new Object();
        this.awaiters = new ArrayList();
        this.spareList = new ArrayList();
        this.hasAwaitersUnlocked = new AtomicInt(0);
    }

    public /* synthetic */ BroadcastFrameClock(InterfaceC10559a interfaceC10559a, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? null : interfaceC10559a);
    }
}
