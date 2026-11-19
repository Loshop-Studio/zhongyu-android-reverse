package p168h0;

import java.security.MessageDigest;
import p109d1.AbstractC8909j;

/* renamed from: h0.d */
/* loaded from: classes3.dex */
public final class C9437d {

    /* renamed from: e */
    public static final b f21839e = new a();

    /* renamed from: a */
    public final Object f21840a;

    /* renamed from: b */
    public final b f21841b;

    /* renamed from: c */
    public final String f21842c;

    /* renamed from: d */
    public volatile byte[] f21843d;

    /* renamed from: h0.d$b */
    public interface b {
        /* renamed from: a */
        void mo4269a(byte[] bArr, Object obj, MessageDigest messageDigest);
    }

    public C9437d(String str, Object obj, b bVar) {
        this.f21842c = AbstractC8909j.m17466b(str);
        this.f21840a = obj;
        this.f21841b = (b) AbstractC8909j.m17468d(bVar);
    }

    /* renamed from: a */
    public static C9437d m18618a(String str, Object obj, b bVar) {
        return new C9437d(str, obj, bVar);
    }

    /* renamed from: b */
    public static b m18619b() {
        return f21839e;
    }

    /* renamed from: e */
    public static C9437d m18620e(String str) {
        return new C9437d(str, null, m18619b());
    }

    /* renamed from: f */
    public static C9437d m18621f(String str, Object obj) {
        return new C9437d(str, obj, m18619b());
    }

    /* renamed from: c */
    public Object m18622c() {
        return this.f21840a;
    }

    /* renamed from: d */
    public final byte[] m18623d() {
        if (this.f21843d == null) {
            this.f21843d = this.f21842c.getBytes(InterfaceC9435b.f21837a);
        }
        return this.f21843d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C9437d) {
            return this.f21842c.equals(((C9437d) obj).f21842c);
        }
        return false;
    }

    /* renamed from: g */
    public void m18624g(Object obj, MessageDigest messageDigest) {
        this.f21841b.mo4269a(m18623d(), obj, messageDigest);
    }

    public int hashCode() {
        return this.f21842c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f21842c + "'}";
    }

    /* renamed from: h0.d$a */
    public class a implements b {
        @Override // p168h0.C9437d.b
        /* renamed from: a */
        public void mo4269a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }
}
