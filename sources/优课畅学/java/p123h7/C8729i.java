package p123h7;

import kotlin.jvm.internal.AbstractC9126n;

/* renamed from: h7.i */
/* loaded from: classes5.dex */
public final class C8729i implements Comparable {

    /* renamed from: b */
    public static final a f16352b = new a(null);

    /* renamed from: a */
    public final int f16353a;

    /* renamed from: h7.i$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ C8729i(int i10) {
        this.f16353a = i10;
    }

    /* renamed from: a */
    public static final /* synthetic */ C8729i m14254a(int i10) {
        return new C8729i(i10);
    }

    /* renamed from: c */
    public static boolean m14256c(int i10, Object obj) {
        return (obj instanceof C8729i) && i10 == ((C8729i) obj).m14259f();
    }

    /* renamed from: d */
    public static int m14257d(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: e */
    public static String m14258e(int i10) {
        return String.valueOf(i10 & 4294967295L);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return AbstractC8737q.m14324a(m14259f(), ((C8729i) obj).m14259f());
    }

    public boolean equals(Object obj) {
        return m14256c(this.f16353a, obj);
    }

    /* renamed from: f */
    public final /* synthetic */ int m14259f() {
        return this.f16353a;
    }

    public int hashCode() {
        return m14257d(this.f16353a);
    }

    public String toString() {
        return m14258e(this.f16353a);
    }

    /* renamed from: b */
    public static int m14255b(int i10) {
        return i10;
    }
}
