package androidx.compose.runtime;

import kotlin.coroutines.InterfaceC9945d;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
public interface MonotonicFrameClock extends InterfaceC9945d.b {
    public static final Key Key = Key.$$INSTANCE;

    public static final class DefaultImpls {
        public static <R> R fold(MonotonicFrameClock monotonicFrameClock, R r10, InterfaceC9544p interfaceC9544p) {
            return (R) InterfaceC9945d.b.a.m20216a(monotonicFrameClock, r10, interfaceC9544p);
        }

        public static <E extends InterfaceC9945d.b> E get(MonotonicFrameClock monotonicFrameClock, InterfaceC9945d.c cVar) {
            return (E) InterfaceC9945d.b.a.m20217b(monotonicFrameClock, cVar);
        }

        @Deprecated
        public static InterfaceC9945d.c getKey(MonotonicFrameClock monotonicFrameClock) {
            return MonotonicFrameClock.super.getKey();
        }

        public static InterfaceC9945d minusKey(MonotonicFrameClock monotonicFrameClock, InterfaceC9945d.c cVar) {
            return InterfaceC9945d.b.a.m20218c(monotonicFrameClock, cVar);
        }

        public static InterfaceC9945d plus(MonotonicFrameClock monotonicFrameClock, InterfaceC9945d interfaceC9945d) {
            return InterfaceC9945d.b.a.m20219d(monotonicFrameClock, interfaceC9945d);
        }
    }

    public static final class Key implements InterfaceC9945d.c {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }

    @Override // kotlin.coroutines.InterfaceC9945d
    /* synthetic */ Object fold(Object obj, InterfaceC9544p interfaceC9544p);

    @Override // kotlin.coroutines.InterfaceC9945d.b, kotlin.coroutines.InterfaceC9945d
    /* synthetic */ InterfaceC9945d.b get(InterfaceC9945d.c cVar);

    @Override // kotlin.coroutines.InterfaceC9945d.b
    default InterfaceC9945d.c getKey() {
        return Key;
    }

    @Override // kotlin.coroutines.InterfaceC9945d
    /* synthetic */ InterfaceC9945d minusKey(InterfaceC9945d.c cVar);

    @Override // kotlin.coroutines.InterfaceC9945d
    /* synthetic */ InterfaceC9945d plus(InterfaceC9945d interfaceC9945d);

    <R> Object withFrameNanos(InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super R> interfaceC11588c);
}
