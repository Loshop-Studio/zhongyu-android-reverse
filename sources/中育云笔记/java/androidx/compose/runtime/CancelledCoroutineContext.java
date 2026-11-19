package androidx.compose.runtime;

import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9544p;

/* loaded from: classes2.dex */
final class CancelledCoroutineContext implements InterfaceC9945d.b {
    public static final Key Key = new Key(null);

    public static final class Key implements InterfaceC9945d.c {
        public /* synthetic */ Key(AbstractC9972n abstractC9972n) {
            this();
        }

        private Key() {
        }
    }

    @Override // kotlin.coroutines.InterfaceC9945d
    public <R> R fold(R r10, InterfaceC9544p interfaceC9544p) {
        return (R) InterfaceC9945d.b.a.m20216a(this, r10, interfaceC9544p);
    }

    @Override // kotlin.coroutines.InterfaceC9945d.b, kotlin.coroutines.InterfaceC9945d
    public <E extends InterfaceC9945d.b> E get(InterfaceC9945d.c cVar) {
        return (E) InterfaceC9945d.b.a.m20217b(this, cVar);
    }

    @Override // kotlin.coroutines.InterfaceC9945d.b
    public InterfaceC9945d.c getKey() {
        return Key;
    }

    @Override // kotlin.coroutines.InterfaceC9945d
    public InterfaceC9945d minusKey(InterfaceC9945d.c cVar) {
        return InterfaceC9945d.b.a.m20218c(this, cVar);
    }

    @Override // kotlin.coroutines.InterfaceC9945d
    public InterfaceC9945d plus(InterfaceC9945d interfaceC9945d) {
        return InterfaceC9945d.b.a.m20219d(this, interfaceC9945d);
    }
}
