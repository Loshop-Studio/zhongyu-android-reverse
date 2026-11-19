package androidx.compose.runtime;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimationKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a?\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012#\b\u0004\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00028\u00000\u0002H\u0086H¢\u0006\u0004\b\b\u0010\t\u001a9\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u000b\u0010\f\u001a9\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\b\u0010\f\"\u001e\u0010\u0012\u001a\u00020\u0001*\u00020\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m5110d2 = {"R", "Landroidx/compose/runtime/MonotonicFrameClock;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "frameTimeMillis", "onFrame", "withFrameMillis", "(Landroidx/compose/runtime/MonotonicFrameClock;Lr6/c;Lh6/c;)Ljava/lang/Object;", "frameTimeNanos", "withFrameNanos", "(Lr6/c;Lh6/c;)Ljava/lang/Object;", "Lh6/h;", "getMonotonicFrameClock", "(Lh6/h;)Landroidx/compose/runtime/MonotonicFrameClock;", "getMonotonicFrameClock$annotations", "(Lh6/h;)V", "monotonicFrameClock", "runtime_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMonotonicFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonotonicFrameClock.kt\nandroidx/compose/runtime/MonotonicFrameClockKt\n*L\n1#1,131:1\n65#1:132\n*S KotlinDebug\n*F\n+ 1 MonotonicFrameClock.kt\nandroidx/compose/runtime/MonotonicFrameClockKt\n*L\n105#1:132\n*E\n"})
/* loaded from: classes.dex */
public final class MonotonicFrameClockKt {

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m5110d2 = {"<anonymous>", "R", "it", "", "invoke", "(J)Ljava/lang/Object;"}, m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = 176)
    /* renamed from: androidx.compose.runtime.MonotonicFrameClockKt$withFrameMillis$2 */
    public static final class C19912 extends Lambda implements InterfaceC6471c {
        final /* synthetic */ InterfaceC6471c $onFrame;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19912(InterfaceC6471c interfaceC6471c) {
            super(1);
            this.$onFrame = interfaceC6471c;
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [R, java.lang.Object] */
        public final R invoke(long j7) {
            return this.$onFrame.invoke(Long.valueOf(j7 / AnimationKt.MillisToNanos));
        }

        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).longValue());
        }
    }

    @NotNull
    public static final MonotonicFrameClock getMonotonicFrameClock(@NotNull InterfaceC5636h interfaceC5636h) {
        MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) interfaceC5636h.get(MonotonicFrameClock.INSTANCE);
        if (monotonicFrameClock != null) {
            return monotonicFrameClock;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    @Nullable
    public static final <R> Object withFrameMillis(@NotNull MonotonicFrameClock monotonicFrameClock, @NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC5631c<? super R> interfaceC5631c) {
        return monotonicFrameClock.withFrameNanos(new C19912(interfaceC6471c), interfaceC5631c);
    }

    @Nullable
    public static final <R> Object withFrameNanos(@NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC5631c<? super R> interfaceC5631c) {
        return getMonotonicFrameClock(interfaceC5631c.getContext()).withFrameNanos(interfaceC6471c, interfaceC5631c);
    }

    @Nullable
    public static final <R> Object withFrameMillis(@NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC5631c<? super R> interfaceC5631c) {
        return getMonotonicFrameClock(interfaceC5631c.getContext()).withFrameNanos(new C19912(interfaceC6471c), interfaceC5631c);
    }

    @ExperimentalComposeApi
    public static /* synthetic */ void getMonotonicFrameClock$annotations(InterfaceC5636h interfaceC5636h) {
    }
}
