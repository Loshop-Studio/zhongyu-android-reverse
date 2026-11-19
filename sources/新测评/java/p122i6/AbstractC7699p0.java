package p122i6;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: i6.p0 */
/* loaded from: classes4.dex */
public abstract class AbstractC7699p0 {

    /* renamed from: a */
    public final int f13053a;

    /* renamed from: i6.p0$a */
    public static final class a extends AbstractC7699p0 {

        /* renamed from: b */
        public static final a f13054b = new a();

        public a() {
            super(4, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 1053851405;
        }

        public String toString() {
            return "Blank";
        }
    }

    /* renamed from: i6.p0$b */
    public static final class b extends AbstractC7699p0 {

        /* renamed from: b */
        public static final b f13055b = new b();

        public b() {
            super(1, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 1058661432;
        }

        public String toString() {
            return "Group";
        }
    }

    /* renamed from: i6.p0$c */
    public static abstract class c extends AbstractC7699p0 {

        /* renamed from: i6.p0$c$a */
        public static final class a extends c {

            /* renamed from: b */
            public static final a f13056b = new a();

            public a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 512782179;
            }

            public String toString() {
                return "Common";
            }
        }

        /* renamed from: i6.p0$c$b */
        public static final class b extends c {

            /* renamed from: b */
            public static final b f13057b = new b();

            public b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -730435790;
            }

            public String toString() {
                return "Composition";
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public c() {
            super(3, null);
        }
    }

    /* renamed from: i6.p0$d */
    public static final class d extends AbstractC7699p0 {

        /* renamed from: b */
        public static final d f13058b = new d();

        public d() {
            super(2, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return 1064289010;
        }

        public String toString() {
            return "Multi";
        }
    }

    /* renamed from: i6.p0$e */
    public static final class e extends AbstractC7699p0 {

        /* renamed from: b */
        public static final e f13059b = new e();

        public e() {
            super(0, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return -1206039121;
        }

        public String toString() {
            return "Single";
        }
    }

    public /* synthetic */ AbstractC7699p0(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    /* renamed from: a */
    public final int m12881a() {
        return this.f13053a;
    }

    /* renamed from: b */
    public final boolean m12882b() {
        return (this instanceof a) || (this instanceof c);
    }

    public AbstractC7699p0(int i10) {
        this.f13053a = i10;
    }
}
