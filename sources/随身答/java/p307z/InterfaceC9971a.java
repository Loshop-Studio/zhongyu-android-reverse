package p307z;

/* renamed from: z.a */
/* loaded from: classes3.dex */
public interface InterfaceC9971a {

    /* renamed from: z.a$a */
    public static final class a implements InterfaceC9971a {

        /* renamed from: a */
        public final int f17938a;

        public /* synthetic */ a(int i9) {
            this.f17938a = i9;
        }

        /* renamed from: a */
        public static final /* synthetic */ a m17250a(int i9) {
            return new a(i9);
        }

        /* renamed from: b */
        public static int m17251b(int i9) {
            if (i9 > 0) {
                return i9;
            }
            throw new IllegalArgumentException("px must be > 0.");
        }

        /* renamed from: c */
        public static boolean m17252c(int i9, Object obj) {
            return (obj instanceof a) && i9 == ((a) obj).m17255f();
        }

        /* renamed from: d */
        public static int m17253d(int i9) {
            return Integer.hashCode(i9);
        }

        /* renamed from: e */
        public static String m17254e(int i9) {
            return "Pixels(px=" + i9 + ')';
        }

        public boolean equals(Object obj) {
            return m17252c(this.f17938a, obj);
        }

        /* renamed from: f */
        public final /* synthetic */ int m17255f() {
            return this.f17938a;
        }

        public int hashCode() {
            return m17253d(this.f17938a);
        }

        public String toString() {
            return m17254e(this.f17938a);
        }
    }

    /* renamed from: z.a$b */
    public static final class b implements InterfaceC9971a {

        /* renamed from: a */
        public static final b f17939a = new b();

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
