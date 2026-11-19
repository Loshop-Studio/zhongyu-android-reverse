package androidx.compose.runtime;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5896f0;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p054e7.AbstractC5479k;
import p068g7.C5609e;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5634f;
import p075h6.InterfaceC5635g;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m5110d2 = {"Landroidx/compose/runtime/FallbackFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "<init>", "()V", "R", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "frameTimeNanos", "onFrame", "withFrameNanos", "(Lr6/c;Lh6/c;)Ljava/lang/Object;", "DefaultFrameDelay", "J", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class FallbackFrameClock implements MonotonicFrameClock {
    private static final long DefaultFrameDelay = 16;

    @NotNull
    public static final FallbackFrameClock INSTANCE = new FallbackFrameClock();

    @Metadata(m5109d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m5110d2 = {"R", "Lkotlinx/coroutines/v;", "<anonymous>"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.runtime.FallbackFrameClock$withFrameNanos$2", m5303f = "MonotonicFrameClock.android.kt", m5304i = {}, m5305l = {40}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.runtime.FallbackFrameClock$withFrameNanos$2 */
    public static final class C19902 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ InterfaceC6471c $onFrame;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19902(InterfaceC6471c interfaceC6471c, InterfaceC5631c<? super C19902> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$onFrame = interfaceC6471c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return new C19902(this.$onFrame, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                this.label = 1;
                if (AbstractC6014x.m5638i(16L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            return this.$onFrame.invoke(new Long(System.nanoTime()));
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super R> interfaceC5631c) {
            return ((C19902) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    private FallbackFrameClock() {
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
    public <R> Object withFrameNanos(@NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC5631c<? super R> interfaceC5631c) {
        C5609e c5609e = AbstractC5896f0.f9343a;
        return AbstractC6014x.m5626F(AbstractC5479k.f8471a, new C19902(interfaceC6471c, null), interfaceC5631c);
    }
}
