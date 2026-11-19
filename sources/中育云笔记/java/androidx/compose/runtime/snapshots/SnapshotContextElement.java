package androidx.compose.runtime.snapshots;

import kotlin.coroutines.InterfaceC9945d;
import p181hd.InterfaceC9544p;

/* loaded from: classes2.dex */
public interface SnapshotContextElement extends InterfaceC9945d.b {
    public static final Key Key = Key.$$INSTANCE;

    public static final class DefaultImpls {
        public static <R> R fold(SnapshotContextElement snapshotContextElement, R r10, InterfaceC9544p interfaceC9544p) {
            return (R) InterfaceC9945d.b.a.m20216a(snapshotContextElement, r10, interfaceC9544p);
        }

        public static <E extends InterfaceC9945d.b> E get(SnapshotContextElement snapshotContextElement, InterfaceC9945d.c cVar) {
            return (E) InterfaceC9945d.b.a.m20217b(snapshotContextElement, cVar);
        }

        public static InterfaceC9945d minusKey(SnapshotContextElement snapshotContextElement, InterfaceC9945d.c cVar) {
            return InterfaceC9945d.b.a.m20218c(snapshotContextElement, cVar);
        }

        public static InterfaceC9945d plus(SnapshotContextElement snapshotContextElement, InterfaceC9945d interfaceC9945d) {
            return InterfaceC9945d.b.a.m20219d(snapshotContextElement, interfaceC9945d);
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
    /* synthetic */ InterfaceC9945d.c getKey();

    @Override // kotlin.coroutines.InterfaceC9945d
    /* synthetic */ InterfaceC9945d minusKey(InterfaceC9945d.c cVar);

    @Override // kotlin.coroutines.InterfaceC9945d
    /* synthetic */ InterfaceC9945d plus(InterfaceC9945d interfaceC9945d);
}
