package p167m5;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: m5.e */
/* loaded from: classes4.dex */
public abstract class AbstractC8555e {

    /* renamed from: a */
    public final int f14188a;

    /* renamed from: m5.e$a */
    public static final class a extends AbstractC8555e {

        /* renamed from: b */
        public static final a f14189b = new a();

        public a() {
            super(2, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -1627015134;
        }

        public String toString() {
            return "CommitFailed";
        }
    }

    /* renamed from: m5.e$b */
    public static final class b extends AbstractC8555e {

        /* renamed from: b */
        public static final b f14190b = new b();

        public b() {
            super(1, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 321558718;
        }

        public String toString() {
            return "CommitSuccess";
        }
    }

    /* renamed from: m5.e$c */
    public static final class c extends AbstractC8555e {

        /* renamed from: b */
        public static final c f14191b = new c();

        public c() {
            super(0, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -125454349;
        }

        public String toString() {
            return "Committing";
        }
    }

    /* renamed from: m5.e$d */
    public static final class d extends AbstractC8555e {

        /* renamed from: b */
        public static final d f14192b = new d();

        public d() {
            super(-1, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return 1055796031;
        }

        public String toString() {
            return "Nothing";
        }
    }

    public /* synthetic */ AbstractC8555e(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    /* renamed from: a */
    public final int m14097a() {
        return this.f14188a;
    }

    public AbstractC8555e(int i10) {
        this.f14188a = i10;
    }
}
