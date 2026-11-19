package androidx.compose.runtime;

import androidx.compose.animation.core.AnimationKt;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9131s;
import kotlin.jvm.internal.Lambda;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class MonotonicFrameClockKt {

    /* renamed from: androidx.compose.runtime.MonotonicFrameClockKt$withFrameMillis$2 */
    public static final class C25202 extends Lambda implements InterfaceC10570l {
        final /* synthetic */ InterfaceC10570l $onFrame;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25202(InterfaceC10570l interfaceC10570l) {
            super(1);
            this.$onFrame = interfaceC10570l;
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [R, java.lang.Object] */
        public final R invoke(long j10) {
            return this.$onFrame.invoke(Long.valueOf(j10 / AnimationKt.MillisToNanos));
        }

        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).longValue());
        }
    }

    public static final MonotonicFrameClock getMonotonicFrameClock(InterfaceC9100d interfaceC9100d) {
        MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) interfaceC9100d.get(MonotonicFrameClock.Key);
        if (monotonicFrameClock != null) {
            return monotonicFrameClock;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    @ExperimentalComposeApi
    public static /* synthetic */ void getMonotonicFrameClock$annotations(InterfaceC9100d interfaceC9100d) {
    }

    public static final <R> Object withFrameMillis(MonotonicFrameClock monotonicFrameClock, InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super R> interfaceC9324c) {
        return monotonicFrameClock.withFrameNanos(new C25202(interfaceC10570l), interfaceC9324c);
    }

    private static final <R> Object withFrameMillis$$forInline(MonotonicFrameClock monotonicFrameClock, InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super R> interfaceC9324c) {
        C25202 c25202 = new C25202(interfaceC10570l);
        AbstractC9131s.m16126c(0);
        Object objWithFrameNanos = monotonicFrameClock.withFrameNanos(c25202, interfaceC9324c);
        AbstractC9131s.m16126c(1);
        return objWithFrameNanos;
    }

    public static final <R> Object withFrameNanos(InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super R> interfaceC9324c) {
        return getMonotonicFrameClock(interfaceC9324c.getContext()).withFrameNanos(interfaceC10570l, interfaceC9324c);
    }

    public static final <R> Object withFrameMillis(InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super R> interfaceC9324c) {
        return getMonotonicFrameClock(interfaceC9324c.getContext()).withFrameNanos(new C25202(interfaceC10570l), interfaceC9324c);
    }
}
