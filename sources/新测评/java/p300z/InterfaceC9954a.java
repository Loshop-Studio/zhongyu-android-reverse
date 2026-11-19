package p300z;

/* renamed from: z.a */
/* loaded from: classes3.dex */
public interface InterfaceC9954a {

    /* renamed from: z.a$a */
    public static final class a implements InterfaceC9954a {

        /* renamed from: a */
        public final int f17794a;

        public /* synthetic */ a(int i10) {
            this.f17794a = i10;
        }

        /* renamed from: a */
        public static final /* synthetic */ a m16763a(int i10) {
            return new a(i10);
        }

        /* renamed from: b */
        public static int m16764b(int i10) {
            if (i10 > 0) {
                return i10;
            }
            throw new IllegalArgumentException("px must be > 0.");
        }

        /* renamed from: c */
        public static boolean m16765c(int i10, Object obj) {
            return (obj instanceof a) && i10 == ((a) obj).m16768f();
        }

        /* renamed from: d */
        public static int m16766d(int i10) {
            return Integer.hashCode(i10);
        }

        /* renamed from: e */
        public static String m16767e(int i10) {
            return "Pixels(px=" + i10 + ')';
        }

        public boolean equals(Object obj) {
            return m16765c(this.f17794a, obj);
        }

        /* renamed from: f */
        public final /* synthetic */ int m16768f() {
            return this.f17794a;
        }

        public int hashCode() {
            return m16766d(this.f17794a);
        }

        public String toString() {
            return m16767e(this.f17794a);
        }
    }

    /* renamed from: z.a$b */
    public static final class b implements InterfaceC9954a {

        /* renamed from: a */
        public static final b f17795a = new b();

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
