package p396x;

/* renamed from: x.a */
/* loaded from: classes3.dex */
public interface InterfaceC11745a {

    /* renamed from: x.a$a */
    public static final class a implements InterfaceC11745a {

        /* renamed from: a */
        public final int f27917a;

        public /* synthetic */ a(int i10) {
            this.f27917a = i10;
        }

        /* renamed from: a */
        public static final /* synthetic */ a m25990a(int i10) {
            return new a(i10);
        }

        /* renamed from: b */
        public static int m25991b(int i10) {
            if (i10 > 0) {
                return i10;
            }
            throw new IllegalArgumentException("px must be > 0.");
        }

        /* renamed from: c */
        public static boolean m25992c(int i10, Object obj) {
            return (obj instanceof a) && i10 == ((a) obj).m25995f();
        }

        /* renamed from: d */
        public static int m25993d(int i10) {
            return Integer.hashCode(i10);
        }

        /* renamed from: e */
        public static String m25994e(int i10) {
            return "Pixels(px=" + i10 + ')';
        }

        public boolean equals(Object obj) {
            return m25992c(this.f27917a, obj);
        }

        /* renamed from: f */
        public final /* synthetic */ int m25995f() {
            return this.f27917a;
        }

        public int hashCode() {
            return m25993d(this.f27917a);
        }

        public String toString() {
            return m25994e(this.f27917a);
        }
    }

    /* renamed from: x.a$b */
    public static final class b implements InterfaceC11745a {

        /* renamed from: a */
        public static final b f27918a = new b();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -2093724603;
        }

        public String toString() {
            return "Undefined";
        }
    }
}
