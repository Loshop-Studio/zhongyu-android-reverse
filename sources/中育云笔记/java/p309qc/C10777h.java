package p309qc;

import com.tendcloud.tenddata.C7863av;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: qc.h */
/* loaded from: classes6.dex */
public final class C10777h implements Comparable {

    /* renamed from: d */
    public static final a f25992d = new a(null);

    /* renamed from: c */
    public final byte f25993c;

    /* renamed from: qc.h$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ C10777h(byte b10) {
        this.f25993c = b10;
    }

    /* renamed from: a */
    public static final /* synthetic */ C10777h m22976a(byte b10) {
        return new C10777h(b10);
    }

    /* renamed from: c */
    public static boolean m22978c(byte b10, Object obj) {
        return (obj instanceof C10777h) && b10 == ((C10777h) obj).m22981f();
    }

    /* renamed from: d */
    public static int m22979d(byte b10) {
        return Byte.hashCode(b10);
    }

    /* renamed from: e */
    public static String m22980e(byte b10) {
        return String.valueOf(b10 & C7863av.f14384i);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return AbstractC9979u.m20296i(m22981f() & C7863av.f14384i, ((C10777h) obj).m22981f() & C7863av.f14384i);
    }

    public boolean equals(Object obj) {
        return m22978c(this.f25993c, obj);
    }

    /* renamed from: f */
    public final /* synthetic */ byte m22981f() {
        return this.f25993c;
    }

    public int hashCode() {
        return m22979d(this.f25993c);
    }

    public String toString() {
        return m22980e(this.f25993c);
    }

    /* renamed from: b */
    public static byte m22977b(byte b10) {
        return b10;
    }
}
