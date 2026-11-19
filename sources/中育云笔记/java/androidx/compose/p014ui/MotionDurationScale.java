package androidx.compose.p014ui;

import androidx.compose.runtime.Stable;
import kotlin.coroutines.InterfaceC9945d;
import p181hd.InterfaceC9544p;

@Stable
/* loaded from: classes2.dex */
public interface MotionDurationScale extends InterfaceC9945d.b {
    public static final Key Key = Key.$$INSTANCE;

    public static final class DefaultImpls {
        public static <R> R fold(MotionDurationScale motionDurationScale, R r10, InterfaceC9544p interfaceC9544p) {
            return (R) InterfaceC9945d.b.a.m20216a(motionDurationScale, r10, interfaceC9544p);
        }

        public static <E extends InterfaceC9945d.b> E get(MotionDurationScale motionDurationScale, InterfaceC9945d.c cVar) {
            return (E) InterfaceC9945d.b.a.m20217b(motionDurationScale, cVar);
        }

        public static InterfaceC9945d minusKey(MotionDurationScale motionDurationScale, InterfaceC9945d.c cVar) {
            return InterfaceC9945d.b.a.m20218c(motionDurationScale, cVar);
        }

        public static InterfaceC9945d plus(MotionDurationScale motionDurationScale, InterfaceC9945d interfaceC9945d) {
            return InterfaceC9945d.b.a.m20219d(motionDurationScale, interfaceC9945d);
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

    float getScaleFactor();

    @Override // kotlin.coroutines.InterfaceC9945d
    /* synthetic */ InterfaceC9945d minusKey(InterfaceC9945d.c cVar);

    @Override // kotlin.coroutines.InterfaceC9945d
    /* synthetic */ InterfaceC9945d plus(InterfaceC9945d interfaceC9945d);
}
