package p309qc;

import kotlin.jvm.internal.AbstractC9972n;

/* renamed from: qc.j */
/* loaded from: classes6.dex */
public final class C10779j implements Comparable {

    /* renamed from: d */
    public static final a f25997d = new a(null);

    /* renamed from: c */
    public final int f25998c;

    /* renamed from: qc.j$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ C10779j(int i10) {
        this.f25998c = i10;
    }

    /* renamed from: a */
    public static final /* synthetic */ C10779j m22999a(int i10) {
        return new C10779j(i10);
    }

    /* renamed from: c */
    public static boolean m23001c(int i10, Object obj) {
        return (obj instanceof C10779j) && i10 == ((C10779j) obj).m23004f();
    }

    /* renamed from: d */
    public static int m23002d(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: e */
    public static String m23003e(int i10) {
        return String.valueOf(i10 & 4294967295L);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return AbstractC10787r.m23069a(m23004f(), ((C10779j) obj).m23004f());
    }

    public boolean equals(Object obj) {
        return m23001c(this.f25998c, obj);
    }

    /* renamed from: f */
    public final /* synthetic */ int m23004f() {
        return this.f25998c;
    }

    public int hashCode() {
        return m23002d(this.f25998c);
    }

    public String toString() {
        return m23003e(this.f25998c);
    }

    /* renamed from: b */
    public static int m23000b(int i10) {
        return i10;
    }
}
