package androidx.compose.runtime;

import androidx.compose.animation.core.AnimationKt;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9977s;
import kotlin.jvm.internal.Lambda;
import p181hd.InterfaceC9540l;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
public final class MonotonicFrameClockKt {

    /* renamed from: androidx.compose.runtime.MonotonicFrameClockKt$withFrameMillis$2 */
    public static final class C25502 extends Lambda implements InterfaceC9540l {
        final /* synthetic */ InterfaceC9540l $onFrame;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25502(InterfaceC9540l interfaceC9540l) {
            super(1);
            this.$onFrame = interfaceC9540l;
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [R, java.lang.Object] */
        public final R invoke(long j10) {
            return this.$onFrame.invoke(Long.valueOf(j10 / AnimationKt.MillisToNanos));
        }

        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).longValue());
        }
    }

    public static final MonotonicFrameClock getMonotonicFrameClock(InterfaceC9945d interfaceC9945d) {
        MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) interfaceC9945d.get(MonotonicFrameClock.Key);
        if (monotonicFrameClock != null) {
            return monotonicFrameClock;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    @ExperimentalComposeApi
    public static /* synthetic */ void getMonotonicFrameClock$annotations(InterfaceC9945d interfaceC9945d) {
    }

    public static final <R> Object withFrameMillis(MonotonicFrameClock monotonicFrameClock, InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super R> interfaceC11588c) {
        return monotonicFrameClock.withFrameNanos(new C25502(interfaceC9540l), interfaceC11588c);
    }

    private static final <R> Object withFrameMillis$$forInline(MonotonicFrameClock monotonicFrameClock, InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super R> interfaceC11588c) {
        C25502 c25502 = new C25502(interfaceC9540l);
        AbstractC9977s.m20287c(0);
        Object objWithFrameNanos = monotonicFrameClock.withFrameNanos(c25502, interfaceC11588c);
        AbstractC9977s.m20287c(1);
        return objWithFrameNanos;
    }

    public static final <R> Object withFrameNanos(InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super R> interfaceC11588c) {
        return getMonotonicFrameClock(interfaceC11588c.getContext()).withFrameNanos(interfaceC9540l, interfaceC11588c);
    }

    public static final <R> Object withFrameMillis(InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super R> interfaceC11588c) {
        return getMonotonicFrameClock(interfaceC11588c.getContext()).withFrameNanos(new C25502(interfaceC9540l), interfaceC11588c);
    }
}
