package p194z;

/* renamed from: z.a */
/* loaded from: classes3.dex */
public interface InterfaceC7919a {

    /* renamed from: z.a$a */
    public static final class a implements InterfaceC7919a {

        /* renamed from: a */
        public final int f10637a;

        public /* synthetic */ a(int i6) {
            this.f10637a = i6;
        }

        /* renamed from: a */
        public static final /* synthetic */ a m9711a(int i6) {
            return new a(i6);
        }

        /* renamed from: b */
        public static int m9712b(int i6) {
            if (i6 > 0) {
                return i6;
            }
            throw new IllegalArgumentException("px must be > 0.");
        }

        /* renamed from: c */
        public static boolean m9713c(int i6, Object obj) {
            return (obj instanceof a) && i6 == ((a) obj).m9716f();
        }

        /* renamed from: d */
        public static int m9714d(int i6) {
            return Integer.hashCode(i6);
        }

        /* renamed from: e */
        public static String m9715e(int i6) {
            return "Pixels(px=" + i6 + ')';
        }

        public boolean equals(Object obj) {
            return m9713c(this.f10637a, obj);
        }

        /* renamed from: f */
        public final /* synthetic */ int m9716f() {
            return this.f10637a;
        }

        public int hashCode() {
            return m9714d(this.f10637a);
        }

        public String toString() {
            return m9715e(this.f10637a);
        }
    }

    /* renamed from: z.a$b */
    public static final class b implements InterfaceC7919a {

        /* renamed from: a */
        public static final b f10638a = new b();

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
