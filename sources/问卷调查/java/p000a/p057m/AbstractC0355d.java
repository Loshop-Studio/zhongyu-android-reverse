package p000a.p057m;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: a.m.d */
/* loaded from: classes.dex */
public abstract class AbstractC0355d {

    /* renamed from: a.m.d$a */
    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        /* renamed from: b */
        public static a m1276b(b bVar) {
            int iOrdinal = bVar.ordinal();
            if (iOrdinal == 1) {
                return ON_CREATE;
            }
            if (iOrdinal == 2) {
                return ON_START;
            }
            if (iOrdinal != 3) {
                return null;
            }
            return ON_RESUME;
        }

        /* renamed from: a */
        public b m1277a() {
            int iOrdinal = ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        return b.RESUMED;
                    }
                    if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            if (iOrdinal == 5) {
                                return b.DESTROYED;
                            }
                            throw new IllegalArgumentException(this + " has no target state");
                        }
                    }
                }
                return b.STARTED;
            }
            return b.CREATED;
        }
    }

    /* renamed from: a.m.d$b */
    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED
    }

    public AbstractC0355d() {
        new AtomicReference();
    }

    /* renamed from: a */
    public abstract void mo1275a(InterfaceC0357f interfaceC0357f);
}
