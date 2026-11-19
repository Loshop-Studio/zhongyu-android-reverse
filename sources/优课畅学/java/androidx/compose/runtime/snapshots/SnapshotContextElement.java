package androidx.compose.runtime.snapshots;

import kotlin.coroutines.InterfaceC9100d;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public interface SnapshotContextElement extends InterfaceC9100d.b {
    public static final Key Key = Key.$$INSTANCE;

    public static final class DefaultImpls {
        public static <R> R fold(SnapshotContextElement snapshotContextElement, R r10, InterfaceC10574p interfaceC10574p) {
            return (R) InterfaceC9100d.b.a.m16071a(snapshotContextElement, r10, interfaceC10574p);
        }

        public static <E extends InterfaceC9100d.b> E get(SnapshotContextElement snapshotContextElement, InterfaceC9100d.c cVar) {
            return (E) InterfaceC9100d.b.a.m16072b(snapshotContextElement, cVar);
        }

        public static InterfaceC9100d minusKey(SnapshotContextElement snapshotContextElement, InterfaceC9100d.c cVar) {
            return InterfaceC9100d.b.a.m16073c(snapshotContextElement, cVar);
        }

        public static InterfaceC9100d plus(SnapshotContextElement snapshotContextElement, InterfaceC9100d interfaceC9100d) {
            return InterfaceC9100d.b.a.m16074d(snapshotContextElement, interfaceC9100d);
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
    /* synthetic */ InterfaceC9100d.c getKey();

    @Override // kotlin.coroutines.InterfaceC9100d
    /* synthetic */ InterfaceC9100d minusKey(InterfaceC9100d.c cVar);

    @Override // kotlin.coroutines.InterfaceC9100d
    /* synthetic */ InterfaceC9100d plus(InterfaceC9100d interfaceC9100d);
}
