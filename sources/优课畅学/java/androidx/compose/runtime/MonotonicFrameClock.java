package androidx.compose.runtime;

import kotlin.coroutines.InterfaceC9100d;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public interface MonotonicFrameClock extends InterfaceC9100d.b {
    public static final Key Key = Key.$$INSTANCE;

    public static final class DefaultImpls {
        public static <R> R fold(MonotonicFrameClock monotonicFrameClock, R r10, InterfaceC10574p interfaceC10574p) {
            return (R) InterfaceC9100d.b.a.m16071a(monotonicFrameClock, r10, interfaceC10574p);
        }

        public static <E extends InterfaceC9100d.b> E get(MonotonicFrameClock monotonicFrameClock, InterfaceC9100d.c cVar) {
            return (E) InterfaceC9100d.b.a.m16072b(monotonicFrameClock, cVar);
        }

        @Deprecated
        public static InterfaceC9100d.c getKey(MonotonicFrameClock monotonicFrameClock) {
            return MonotonicFrameClock.super.getKey();
        }

        public static InterfaceC9100d minusKey(MonotonicFrameClock monotonicFrameClock, InterfaceC9100d.c cVar) {
            return InterfaceC9100d.b.a.m16073c(monotonicFrameClock, cVar);
        }

        public static InterfaceC9100d plus(MonotonicFrameClock monotonicFrameClock, InterfaceC9100d interfaceC9100d) {
            return InterfaceC9100d.b.a.m16074d(monotonicFrameClock, interfaceC9100d);
        }
    }

    public static final class Key implements InterfaceC9100d.c {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }

    @Override // kotlin.coroutines.InterfaceC9100d
    /* synthetic */ Object fold(Object obj, InterfaceC10574p interfaceC10574p);

    @Override // kotlin.coroutines.InterfaceC9100d.b, kotlin.coroutines.InterfaceC9100d
    /* synthetic */ InterfaceC9100d.b get(InterfaceC9100d.c cVar);

    @Override // kotlin.coroutines.InterfaceC9100d.b
    default InterfaceC9100d.c getKey() {
        return Key;
    }

    @Override // kotlin.coroutines.InterfaceC9100d
    /* synthetic */ InterfaceC9100d minusKey(InterfaceC9100d.c cVar);

    @Override // kotlin.coroutines.InterfaceC9100d
    /* synthetic */ InterfaceC9100d plus(InterfaceC9100d interfaceC9100d);

    <R> Object withFrameNanos(InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super R> interfaceC9324c);
}
