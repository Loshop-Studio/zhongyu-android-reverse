package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.lifecycle.f */
/* loaded from: classes.dex */
public abstract class AbstractC0496f {

    /* renamed from: a */
    AtomicReference<Object> f3417a = new AtomicReference<>();

    /* renamed from: androidx.lifecycle.f$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3418a;

        /* renamed from: b */
        static final /* synthetic */ int[] f3419b;

        static {
            int[] iArr = new int[b.values().length];
            f3419b = iArr;
            try {
                iArr[b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3419b[b.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3419b[b.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3419b[b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3419b[b.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3419b[b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3419b[b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[c.values().length];
            f3418a = iArr2;
            try {
                iArr2[c.CREATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3418a[c.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3418a[c.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3418a[c.DESTROYED.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f3418a[c.INITIALIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* renamed from: androidx.lifecycle.f$b */
    public enum b {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        /* renamed from: a */
        public static b m2870a(c cVar) {
            int i4 = a.f3418a[cVar.ordinal()];
            if (i4 == 1) {
                return ON_DESTROY;
            }
            if (i4 == 2) {
                return ON_STOP;
            }
            if (i4 != 3) {
                return null;
            }
            return ON_PAUSE;
        }

        /* renamed from: c */
        public static b m2871c(c cVar) {
            int i4 = a.f3418a[cVar.ordinal()];
            if (i4 == 1) {
                return ON_START;
            }
            if (i4 == 2) {
                return ON_RESUME;
            }
            if (i4 != 5) {
                return null;
            }
            return ON_CREATE;
        }

        /* renamed from: d */
        public static b m2872d(c cVar) {
            int i4 = a.f3418a[cVar.ordinal()];
            if (i4 == 1) {
                return ON_CREATE;
            }
            if (i4 == 2) {
                return ON_START;
            }
            if (i4 != 3) {
                return null;
            }
            return ON_RESUME;
        }

        /* renamed from: b */
        public c m2873b() {
            switch (a.f3419b[ordinal()]) {
                case 1:
                case 2:
                    return c.CREATED;
                case 3:
                case 4:
                    return c.STARTED;
                case 5:
                    return c.RESUMED;
                case 6:
                    return c.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* renamed from: androidx.lifecycle.f$c */
    public enum c {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: a */
        public boolean m2874a(c cVar) {
            return compareTo(cVar) >= 0;
        }
    }

    /* renamed from: a */
    public abstract void mo2867a(InterfaceC0503k interfaceC0503k);

    /* renamed from: b */
    public abstract c mo2868b();

    /* renamed from: c */
    public abstract void mo2869c(InterfaceC0503k interfaceC0503k);
}
