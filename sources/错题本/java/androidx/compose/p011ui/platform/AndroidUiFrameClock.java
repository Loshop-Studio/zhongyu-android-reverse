package androidx.compose.p011ui.platform;

import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C5961g;
import kotlinx.coroutines.InterfaceC5895f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.C5632d;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5634f;
import p075h6.InterfaceC5635g;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p185v7.AbstractC6683l;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ*\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0013"}, m5110d2 = {"Landroidx/compose/ui/platform/AndroidUiFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "Landroid/view/Choreographer;", "choreographer", "Landroidx/compose/ui/platform/AndroidUiDispatcher;", "dispatcher", "<init>", "(Landroid/view/Choreographer;Landroidx/compose/ui/platform/AndroidUiDispatcher;)V", "(Landroid/view/Choreographer;)V", "R", "Lkotlin/Function1;", "", "onFrame", "withFrameNanos", "(Lr6/c;Lh6/c;)Ljava/lang/Object;", "Landroid/view/Choreographer;", "getChoreographer", "()Landroid/view/Choreographer;", "Landroidx/compose/ui/platform/AndroidUiDispatcher;", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAndroidUiFrameClock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiFrameClock.android.kt\nandroidx/compose/ui/platform/AndroidUiFrameClock\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,59:1\n314#2,11:60\n*S KotlinDebug\n*F\n+ 1 AndroidUiFrameClock.android.kt\nandroidx/compose/ui/platform/AndroidUiFrameClock\n*L\n35#1:60,11\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidUiFrameClock implements MonotonicFrameClock {
    public static final int $stable = 8;

    @NotNull
    private final Choreographer choreographer;

    @Nullable
    private final AndroidUiDispatcher dispatcher;

    public AndroidUiFrameClock(@NotNull Choreographer choreographer, @Nullable AndroidUiDispatcher androidUiDispatcher) {
        this.choreographer = choreographer;
        this.dispatcher = androidUiDispatcher;
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

    @NotNull
    public final Choreographer getChoreographer() {
        return this.choreographer;
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

    @Override // androidx.compose.runtime.MonotonicFrameClock
    @Nullable
    public <R> Object withFrameNanos(@NotNull final InterfaceC6471c interfaceC6471c, @NotNull InterfaceC5631c<? super R> interfaceC5631c) {
        final AndroidUiDispatcher androidUiDispatcher = this.dispatcher;
        if (androidUiDispatcher == null) {
            InterfaceC5634f interfaceC5634f = interfaceC5631c.getContext().get(C5632d.f8764a);
            androidUiDispatcher = interfaceC5634f instanceof AndroidUiDispatcher ? (AndroidUiDispatcher) interfaceC5634f : null;
        }
        final C5961g c5961g = new C5961g(1, AbstractC6683l.m6374n(interfaceC5631c));
        c5961g.m5584u();
        final Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$callback$1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j7) {
                Object objM13956constructorimpl;
                InterfaceC5895f interfaceC5895f = c5961g;
                try {
                    objM13956constructorimpl = Result.m13956constructorimpl(interfaceC6471c.invoke(Long.valueOf(j7)));
                } catch (Throwable th) {
                    objM13956constructorimpl = Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
                }
                interfaceC5895f.resumeWith(objM13956constructorimpl);
            }
        };
        if (androidUiDispatcher == null || !AbstractC5830k.m5325b(androidUiDispatcher.getChoreographer(), getChoreographer())) {
            getChoreographer().postFrameCallback(frameCallback);
            c5961g.mo4966m(new InterfaceC6471c() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$2
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
                    this.this$0.getChoreographer().removeFrameCallback(frameCallback);
                }
            });
        } else {
            androidUiDispatcher.postFrameCallback$ui_release(frameCallback);
            c5961g.mo4966m(new InterfaceC6471c() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$1
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
                    androidUiDispatcher.removeFrameCallback$ui_release(frameCallback);
                }
            });
        }
        Object objM5583t = c5961g.m5583t();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM5583t;
    }

    public AndroidUiFrameClock(@NotNull Choreographer choreographer) {
        this(choreographer, null);
    }
}
