package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C5961g;
import kotlinx.coroutines.InterfaceC5895f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p185v7.AbstractC6683l;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\b¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u0003J\r\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\u0003J\u0010\u0010\f\u001a\u00020\tH\u0086@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00110\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00110\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m5110d2 = {"Landroidx/compose/runtime/Latch;", "", "<init>", "()V", "R", "Lkotlin/Function0;", "block", "withClosed", "(Lr6/a;)Ljava/lang/Object;", "Ld6/s;", "closeLatch", "openLatch", "await", "(Lh6/c;)Ljava/lang/Object;", "lock", "Ljava/lang/Object;", "", "Lh6/c;", "awaiters", "Ljava/util/List;", "spareList", "", "_isOpen", "Z", "isOpen", "()Z", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLatch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,86:1\n27#2:87\n33#2,2:88\n33#2,2:90\n33#2,2:92\n33#2,2:103\n314#3,9:94\n323#3,2:105\n*S KotlinDebug\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch\n*L\n36#1:87\n42#1:88,2\n54#1:90,2\n58#1:92,2\n80#1:103,2\n79#1:94,9\n79#1:105,2\n*E\n"})
/* loaded from: classes.dex */
public final class Latch {
    public static final int $stable = 8;

    @NotNull
    private final Object lock = new Object();

    @NotNull
    private List<InterfaceC5631c<C5443s>> awaiters = new ArrayList();

    @NotNull
    private List<InterfaceC5631c<C5443s>> spareList = new ArrayList();
    private boolean _isOpen = true;

    @Nullable
    public final Object await(@NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        if (isOpen()) {
            return C5443s.f8405a;
        }
        final C5961g c5961g = new C5961g(1, AbstractC6683l.m6374n(interfaceC5631c));
        c5961g.m5584u();
        synchronized (this.lock) {
            this.awaiters.add(c5961g);
        }
        c5961g.mo4966m(new InterfaceC6471c() { // from class: androidx.compose.runtime.Latch$await$2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C5443s.f8405a;
            }

            public final void invoke(Throwable th) {
                Object obj = this.this$0.lock;
                Latch latch = this.this$0;
                InterfaceC5895f interfaceC5895f = c5961g;
                synchronized (obj) {
                    latch.awaiters.remove(interfaceC5895f);
                }
            }
        });
        Object objM5583t = c5961g.m5583t();
        return objM5583t == CoroutineSingletons.COROUTINE_SUSPENDED ? objM5583t : C5443s.f8405a;
    }

    public final void closeLatch() {
        synchronized (this.lock) {
            this._isOpen = false;
        }
    }

    public final boolean isOpen() {
        boolean z8;
        synchronized (this.lock) {
            z8 = this._isOpen;
        }
        return z8;
    }

    public final void openLatch() {
        synchronized (this.lock) {
            try {
                if (isOpen()) {
                    return;
                }
                List<InterfaceC5631c<C5443s>> list = this.awaiters;
                this.awaiters = this.spareList;
                this.spareList = list;
                this._isOpen = true;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list.get(i).resumeWith(Result.m13956constructorimpl(C5443s.f8405a));
                }
                list.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <R> R withClosed(@NotNull InterfaceC6469a block) {
        closeLatch();
        try {
            return (R) block.invoke();
        } finally {
            openLatch();
        }
    }
}
