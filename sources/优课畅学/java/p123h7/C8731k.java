package p123h7;

import kotlin.jvm.internal.AbstractC9126n;

/* renamed from: h7.k */
/* loaded from: classes5.dex */
public final class C8731k implements Comparable {

    /* renamed from: b */
    public static final a f16357b = new a(null);

    /* renamed from: a */
    public final long f16358a;

    /* renamed from: h7.k$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ C8731k(long j10) {
        this.f16358a = j10;
    }

    /* renamed from: a */
    public static final /* synthetic */ C8731k m14277a(long j10) {
        return new C8731k(j10);
    }

    /* renamed from: c */
    public static boolean m14279c(long j10, Object obj) {
        return (obj instanceof C8731k) && j10 == ((C8731k) obj).m14283g();
    }

    /* renamed from: d */
    public static final boolean m14280d(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: e */
    public static int m14281e(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: f */
    public static String m14282f(long j10) {
        return AbstractC8737q.m14327d(j10, 10);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return AbstractC8737q.m14325b(m14283g(), ((C8731k) obj).m14283g());
    }

    public boolean equals(Object obj) {
        return m14279c(this.f16358a, obj);
    }

    /* renamed from: g */
    public final /* synthetic */ long m14283g() {
        return this.f16358a;
    }

    public int hashCode() {
        return m14281e(this.f16358a);
    }

    public String toString() {
        return m14282f(this.f16358a);
    }

    /* renamed from: b */
    public static long m14278b(long j10) {
        return j10;
    }
}
