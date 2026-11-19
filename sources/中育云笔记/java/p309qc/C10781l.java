package p309qc;

import kotlin.jvm.internal.AbstractC9972n;

/* renamed from: qc.l */
/* loaded from: classes6.dex */
public final class C10781l implements Comparable {

    /* renamed from: d */
    public static final a f26002d = new a(null);

    /* renamed from: c */
    public final long f26003c;

    /* renamed from: qc.l$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ C10781l(long j10) {
        this.f26003c = j10;
    }

    /* renamed from: a */
    public static final /* synthetic */ C10781l m23022a(long j10) {
        return new C10781l(j10);
    }

    /* renamed from: c */
    public static boolean m23024c(long j10, Object obj) {
        return (obj instanceof C10781l) && j10 == ((C10781l) obj).m23028g();
    }

    /* renamed from: d */
    public static final boolean m23025d(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: e */
    public static int m23026e(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: f */
    public static String m23027f(long j10) {
        return AbstractC10787r.m23072d(j10, 10);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return AbstractC10787r.m23070b(m23028g(), ((C10781l) obj).m23028g());
    }

    public boolean equals(Object obj) {
        return m23024c(this.f26003c, obj);
    }

    /* renamed from: g */
    public final /* synthetic */ long m23028g() {
        return this.f26003c;
    }

    public int hashCode() {
        return m23026e(this.f26003c);
    }

    public String toString() {
        return m23027f(this.f26003c);
    }

    /* renamed from: b */
    public static long m23023b(long j10) {
        return j10;
    }
}
