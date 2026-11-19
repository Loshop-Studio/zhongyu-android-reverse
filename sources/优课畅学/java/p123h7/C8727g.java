package p123h7;

import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: h7.g */
/* loaded from: classes5.dex */
public final class C8727g implements Comparable {

    /* renamed from: b */
    public static final a f16347b = new a(null);

    /* renamed from: a */
    public final byte f16348a;

    /* renamed from: h7.g$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ C8727g(byte b10) {
        this.f16348a = b10;
    }

    /* renamed from: a */
    public static final /* synthetic */ C8727g m14231a(byte b10) {
        return new C8727g(b10);
    }

    /* renamed from: c */
    public static boolean m14233c(byte b10, Object obj) {
        return (obj instanceof C8727g) && b10 == ((C8727g) obj).m14236f();
    }

    /* renamed from: d */
    public static int m14234d(byte b10) {
        return Byte.hashCode(b10);
    }

    /* renamed from: e */
    public static String m14235e(byte b10) {
        return String.valueOf(b10 & 255);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return AbstractC9133u.m16135i(m14236f() & 255, ((C8727g) obj).m14236f() & 255);
    }

    public boolean equals(Object obj) {
        return m14233c(this.f16348a, obj);
    }

    /* renamed from: f */
    public final /* synthetic */ byte m14236f() {
        return this.f16348a;
    }

    public int hashCode() {
        return m14234d(this.f16348a);
    }

    public String toString() {
        return m14235e(this.f16348a);
    }

    /* renamed from: b */
    public static byte m14232b(byte b10) {
        return b10;
    }
}
