package p309qc;

import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: qc.o */
/* loaded from: classes6.dex */
public final class C10784o implements Comparable {

    /* renamed from: d */
    public static final a f26008d = new a(null);

    /* renamed from: c */
    public final short f26009c;

    /* renamed from: qc.o$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ C10784o(short s10) {
        this.f26009c = s10;
    }

    /* renamed from: a */
    public static final /* synthetic */ C10784o m23046a(short s10) {
        return new C10784o(s10);
    }

    /* renamed from: c */
    public static boolean m23048c(short s10, Object obj) {
        return (obj instanceof C10784o) && s10 == ((C10784o) obj).m23051f();
    }

    /* renamed from: d */
    public static int m23049d(short s10) {
        return Short.hashCode(s10);
    }

    /* renamed from: e */
    public static String m23050e(short s10) {
        return String.valueOf(s10 & 65535);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return AbstractC9979u.m20296i(m23051f() & 65535, ((C10784o) obj).m23051f() & 65535);
    }

    public boolean equals(Object obj) {
        return m23048c(this.f26009c, obj);
    }

    /* renamed from: f */
    public final /* synthetic */ short m23051f() {
        return this.f26009c;
    }

    public int hashCode() {
        return m23049d(this.f26009c);
    }

    public String toString() {
        return m23050e(this.f26009c);
    }

    /* renamed from: b */
    public static short m23047b(short s10) {
        return s10;
    }
}
