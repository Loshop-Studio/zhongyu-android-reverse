package androidx.compose.runtime;

import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C5961g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5634f;
import p075h6.InterfaceC5635g;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p185v7.AbstractC6683l;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001+B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\u0010H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0017\u001a\u00020\u00032\f\b\u0002\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010!\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030 0\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010#\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030 0\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0011\u0010*\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006,"}, m5110d2 = {"Landroidx/compose/runtime/BroadcastFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "Lkotlin/Function0;", "Ld6/s;", "onNewAwaiters", "<init>", "(Lr6/a;)V", "", "cause", "fail", "(Ljava/lang/Throwable;)V", "", "timeNanos", "sendFrame", "(J)V", "R", "Lkotlin/Function1;", "onFrame", "withFrameNanos", "(Lr6/c;Lh6/c;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancellationException", "cancel", "(Ljava/util/concurrent/CancellationException;)V", "Lr6/a;", "", "lock", "Ljava/lang/Object;", "failureCause", "Ljava/lang/Throwable;", "", "Landroidx/compose/runtime/BroadcastFrameClock$FrameAwaiter;", "awaiters", "Ljava/util/List;", "spareList", "Landroidx/compose/runtime/internal/AtomicInt;", "hasAwaitersUnlocked", "Landroidx/compose/runtime/internal/AtomicInt;", "", "getHasAwaiters", "()Z", "hasAwaiters", "FrameAwaiter", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBroadcastFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,137:1\n27#2:138\n33#2,2:139\n33#2,2:150\n33#2,2:154\n314#3,9:141\n323#3,2:152\n33#4,6:156\n*S KotlinDebug\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock\n*L\n47#1:138\n65#1:139,2\n85#1:150,2\n118#1:154,2\n82#1:141,9\n82#1:152,2\n121#1:156,6\n*E\n"})
/* loaded from: classes.dex */
public final class BroadcastFrameClock implements MonotonicFrameClock {
    public static final int $stable = 8;

    @NotNull
    private List<FrameAwaiter<?>> awaiters;

    @Nullable
    private Throwable failureCause;

    @NotNull
    private final AtomicInt hasAwaitersUnlocked;

    @NotNull
    private final Object lock;

    @Nullable
    private final InterfaceC6469a onNewAwaiters;

    @NotNull
    private List<FrameAwaiter<?>> spareList;

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m5110d2 = {"Landroidx/compose/runtime/BroadcastFrameClock$FrameAwaiter;", "R", "", "Lkotlin/Function1;", "", "onFrame", "Lh6/c;", "continuation", "<init>", "(Lr6/c;Lh6/c;)V", "timeNanos", "Ld6/s;", "resume", "(J)V", "Lr6/c;", "getOnFrame", "()Lr6/c;", "Lh6/c;", "getContinuation", "()Lh6/c;", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nBroadcastFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock$FrameAwaiter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,137:1\n1#2:138\n*E\n"})
    public static final class FrameAwaiter<R> {

        @NotNull
        private final InterfaceC5631c<R> continuation;

        @NotNull
        private final InterfaceC6471c onFrame;

        /* JADX WARN: Multi-variable type inference failed */
        public FrameAwaiter(@NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC5631c<? super R> interfaceC5631c) {
            this.onFrame = interfaceC6471c;
            this.continuation = interfaceC5631c;
        }

        @NotNull
        public final InterfaceC5631c<R> getContinuation() {
            return this.continuation;
        }

        @NotNull
        public final InterfaceC6471c getOnFrame() {
            return this.onFrame;
        }

        public final void resume(long timeNanos) {
            Object objM13956constructorimpl;
            InterfaceC5631c<R> interfaceC5631c = this.continuation;
            try {
                objM13956constructorimpl = Result.m13956constructorimpl(this.onFrame.invoke(Long.valueOf(timeNanos)));
            } catch (Throwable th) {
                objM13956constructorimpl = Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
            }
            interfaceC5631c.resumeWith(objM13956constructorimpl);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BroadcastFrameClock() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void cancel$default(BroadcastFrameClock broadcastFrameClock, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = new CancellationException("clock cancelled");
        }
        broadcastFrameClock.cancel(cancellationException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fail(Throwable cause) {
        synchronized (this.lock) {
            try {
                if (this.failureCause != null) {
                    return;
                }
                this.failureCause = cause;
                List<FrameAwaiter<?>> list = this.awaiters;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list.get(i).getContinuation().resumeWith(Result.m13956constructorimpl(AbstractC5774b.m5118a(cause)));
                }
                this.awaiters.clear();
                this.hasAwaitersUnlocked.set(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void cancel(@NotNull CancellationException cancellationException) {
        fail(cancellationException);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, p075h6.InterfaceC5636h
    public <R> R fold(R r, @NotNull InterfaceC6473e interfaceC6473e) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r, interfaceC6473e);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, p075h6.InterfaceC5636h
    @Nullable
    public <E extends InterfaceC5634f> E get(@NotNull InterfaceC5635g interfaceC5635g) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, interfaceC5635g);
    }

    public final boolean getHasAwaiters() {
        return this.hasAwaitersUnlocked.get() != 0;
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, p075h6.InterfaceC5636h
    @NotNull
    public InterfaceC5636h minusKey(@NotNull InterfaceC5635g interfaceC5635g) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, interfaceC5635g);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, p075h6.InterfaceC5636h
    @NotNull
    public InterfaceC5636h plus(@NotNull InterfaceC5636h interfaceC5636h) {
        return MonotonicFrameClock.DefaultImpls.plus(this, interfaceC5636h);
    }

    public final void sendFrame(long timeNanos) {
        synchronized (this.lock) {
            try {
                List<FrameAwaiter<?>> list = this.awaiters;
                this.awaiters = this.spareList;
                this.spareList = list;
                this.hasAwaitersUnlocked.set(0);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list.get(i).resume(timeNanos);
                }
                list.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    @Nullable
    public <R> Object withFrameNanos(@NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC5631c<? super R> interfaceC5631c) {
        C5961g c5961g = new C5961g(1, AbstractC6683l.m6374n(interfaceC5631c));
        c5961g.m5584u();
        final FrameAwaiter frameAwaiter = new FrameAwaiter(interfaceC6471c, c5961g);
        synchronized (this.lock) {
            Throwable th = this.failureCause;
            if (th != null) {
                c5961g.resumeWith(Result.m13956constructorimpl(AbstractC5774b.m5118a(th)));
            } else {
                boolean zIsEmpty = this.awaiters.isEmpty();
                this.awaiters.add(frameAwaiter);
                if (zIsEmpty) {
                    this.hasAwaitersUnlocked.set(1);
                }
                c5961g.mo4966m(new InterfaceC6471c() { // from class: androidx.compose.runtime.BroadcastFrameClock$withFrameNanos$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Throwable) obj);
                        return C5443s.f8405a;
                    }

                    public final void invoke(Throwable th2) {
                        Object obj = this.this$0.lock;
                        BroadcastFrameClock broadcastFrameClock = this.this$0;
                        Object obj2 = frameAwaiter;
                        synchronized (obj) {
                            broadcastFrameClock.awaiters.remove(obj2);
                            if (broadcastFrameClock.awaiters.isEmpty()) {
                                broadcastFrameClock.hasAwaitersUnlocked.set(0);
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
        Object objM5583t = c5961g.m5583t();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM5583t;
    }

    public BroadcastFrameClock(@Nullable InterfaceC6469a interfaceC6469a) {
        this.onNewAwaiters = interfaceC6469a;
        this.lock = new Object();
        this.awaiters = new ArrayList();
        this.spareList = new ArrayList();
        this.hasAwaitersUnlocked = new AtomicInt(0);
    }

    public /* synthetic */ BroadcastFrameClock(InterfaceC6469a interfaceC6469a, int i, AbstractC5824e abstractC5824e) {
        this((i & 1) != 0 ? null : interfaceC6469a);
    }
}
