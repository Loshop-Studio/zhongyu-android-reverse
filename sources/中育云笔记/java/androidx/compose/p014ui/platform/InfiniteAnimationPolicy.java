package androidx.compose.p014ui.platform;

import kotlin.coroutines.InterfaceC9945d;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
public interface InfiniteAnimationPolicy extends InterfaceC9945d.b {
    public static final Key Key = Key.$$INSTANCE;

    public static final class DefaultImpls {
        public static <R> R fold(InfiniteAnimationPolicy infiniteAnimationPolicy, R r10, InterfaceC9544p interfaceC9544p) {
            return (R) InterfaceC9945d.b.a.m20216a(infiniteAnimationPolicy, r10, interfaceC9544p);
        }

        public static <E extends InterfaceC9945d.b> E get(InfiniteAnimationPolicy infiniteAnimationPolicy, InterfaceC9945d.c cVar) {
            return (E) InterfaceC9945d.b.a.m20217b(infiniteAnimationPolicy, cVar);
        }

        @Deprecated
        public static InterfaceC9945d.c getKey(InfiniteAnimationPolicy infiniteAnimationPolicy) {
            return InfiniteAnimationPolicy.super.getKey();
        }

        public static InterfaceC9945d minusKey(InfiniteAnimationPolicy infiniteAnimationPolicy, InterfaceC9945d.c cVar) {
            return InterfaceC9945d.b.a.m20218c(infiniteAnimationPolicy, cVar);
        }

        public static InterfaceC9945d plus(InfiniteAnimationPolicy infiniteAnimationPolicy, InterfaceC9945d interfaceC9945d) {
            return InterfaceC9945d.b.a.m20219d(infiniteAnimationPolicy, interfaceC9945d);
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

    <R> Object onInfiniteOperation(InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super R> interfaceC11588c);

    @Override // kotlin.coroutines.InterfaceC9945d
    /* synthetic */ InterfaceC9945d plus(InterfaceC9945d interfaceC9945d);
}
