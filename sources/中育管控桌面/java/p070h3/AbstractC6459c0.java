package p070h3;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: h3.c0 */
/* loaded from: classes4.dex */
public abstract class AbstractC6459c0 {

    /* renamed from: a */
    public final String f8215a;

    /* renamed from: b */
    public final boolean f8216b;

    /* renamed from: c */
    public final boolean f8217c;

    /* renamed from: d */
    public final boolean f8218d;

    /* renamed from: e */
    public final boolean f8219e;

    /* renamed from: f */
    public final boolean f8220f;

    /* renamed from: h3.c0$a */
    public static final class a extends AbstractC6459c0 {

        /* renamed from: g */
        public static final a f8221g = new a();

        public a() {
            super("Default", false, false, false, false, false, 62, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 1146560646;
        }

        public String toString() {
            return "Default";
        }
    }

    /* renamed from: h3.c0$b */
    public static final class b extends AbstractC6459c0 {

        /* renamed from: g */
        public static final b f8222g = new b();

        public b() {
            super("Normal", true, false, true, true, false, 36, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -1329687038;
        }

        public String toString() {
            return "Normal";
        }
    }

    /* renamed from: h3.c0$c */
    public static final class c extends AbstractC6459c0 {

        /* renamed from: g */
        public static final c f8223g = new c();

        public c() {
            super("Recycle", true, true, true, true, true, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 684637400;
        }

        public String toString() {
            return "Recycle";
        }
    }

    /* renamed from: h3.c0$d */
    public static final class d extends AbstractC6459c0 {

        /* renamed from: g */
        public static final d f8224g = new d();

        public d() {
            super("Select", true, false, true, false, false, 52, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return -1195962857;
        }

        public String toString() {
            return "Select";
        }
    }

    /* renamed from: h3.c0$e */
    public static final class e extends AbstractC6459c0 {

        /* renamed from: g */
        public static final e f8225g = new e();

        public e() {
            super("Share", true, false, true, false, false, 52, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return -315594908;
        }

        public String toString() {
            return "Share";
        }
    }

    public /* synthetic */ AbstractC6459c0(String str, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z6, z7, z8, z9, z10);
    }

    /* renamed from: a */
    public final String m7104a() {
        return this.f8215a;
    }

    /* renamed from: b */
    public final boolean m7105b() {
        return this.f8219e;
    }

    /* renamed from: c */
    public final boolean m7106c() {
        return this.f8218d;
    }

    /* renamed from: d */
    public final boolean m7107d() {
        return this.f8220f;
    }

    /* renamed from: e */
    public final boolean m7108e() {
        return this.f8216b;
    }

    public AbstractC6459c0(String str, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.f8215a = str;
        this.f8216b = z6;
        this.f8217c = z7;
        this.f8218d = z8;
        this.f8219e = z9;
        this.f8220f = z10;
    }

    public /* synthetic */ AbstractC6459c0(String str, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i6 & 2) != 0 ? false : z6, (i6 & 4) != 0 ? false : z7, (i6 & 8) != 0 ? false : z8, (i6 & 16) != 0 ? false : z9, (i6 & 32) != 0 ? false : z10, null);
    }
}
