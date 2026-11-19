package androidx.compose.p013ui;

import androidx.compose.runtime.Stable;
import kotlin.coroutines.InterfaceC9100d;
import p300x7.InterfaceC10574p;

@Stable
/* loaded from: classes2.dex */
public interface MotionDurationScale extends InterfaceC9100d.b {
    public static final Key Key = Key.$$INSTANCE;

    public static final class DefaultImpls {
        public static <R> R fold(MotionDurationScale motionDurationScale, R r10, InterfaceC10574p interfaceC10574p) {
            return (R) InterfaceC9100d.b.a.m16071a(motionDurationScale, r10, interfaceC10574p);
        }

        public static <E extends InterfaceC9100d.b> E get(MotionDurationScale motionDurationScale, InterfaceC9100d.c cVar) {
            return (E) InterfaceC9100d.b.a.m16072b(motionDurationScale, cVar);
        }

        public static InterfaceC9100d minusKey(MotionDurationScale motionDurationScale, InterfaceC9100d.c cVar) {
            return InterfaceC9100d.b.a.m16073c(motionDurationScale, cVar);
        }

        public static InterfaceC9100d plus(MotionDurationScale motionDurationScale, InterfaceC9100d interfaceC9100d) {
            return InterfaceC9100d.b.a.m16074d(motionDurationScale, interfaceC9100d);
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

    float getScaleFactor();

    @Override // kotlin.coroutines.InterfaceC9100d
    /* synthetic */ InterfaceC9100d minusKey(InterfaceC9100d.c cVar);

    @Override // kotlin.coroutines.InterfaceC9100d
    /* synthetic */ InterfaceC9100d plus(InterfaceC9100d interfaceC9100d);
}
