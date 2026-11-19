package p162m0;

import java.security.MessageDigest;
import p117i1.AbstractC7651j;

/* renamed from: m0.c */
/* loaded from: classes3.dex */
public final class C8538c {

    /* renamed from: e */
    public static final b f14174e = new a();

    /* renamed from: a */
    public final Object f14175a;

    /* renamed from: b */
    public final b f14176b;

    /* renamed from: c */
    public final String f14177c;

    /* renamed from: d */
    public volatile byte[] f14178d;

    /* renamed from: m0.c$b */
    public interface b {
        /* renamed from: a */
        void mo3620a(byte[] bArr, Object obj, MessageDigest messageDigest);
    }

    public C8538c(String str, Object obj, b bVar) {
        this.f14177c = AbstractC7651j.m12681b(str);
        this.f14175a = obj;
        this.f14176b = (b) AbstractC7651j.m12683d(bVar);
    }

    /* renamed from: a */
    public static C8538c m14049a(String str, Object obj, b bVar) {
        return new C8538c(str, obj, bVar);
    }

    /* renamed from: b */
    public static b m14050b() {
        return f14174e;
    }

    /* renamed from: e */
    public static C8538c m14051e(String str) {
        return new C8538c(str, null, m14050b());
    }

    /* renamed from: f */
    public static C8538c m14052f(String str, Object obj) {
        return new C8538c(str, obj, m14050b());
    }

    /* renamed from: c */
    public Object m14053c() {
        return this.f14175a;
    }

    /* renamed from: d */
    public final byte[] m14054d() {
        if (this.f14178d == null) {
            this.f14178d = this.f14177c.getBytes(InterfaceC8537b.f14173a);
        }
        return this.f14178d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C8538c) {
            return this.f14177c.equals(((C8538c) obj).f14177c);
        }
        return false;
    }

    /* renamed from: g */
    public void m14055g(Object obj, MessageDigest messageDigest) {
        this.f14176b.mo3620a(m14054d(), obj, messageDigest);
    }

    public int hashCode() {
        return this.f14177c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f14177c + "'}";
    }

    /* renamed from: m0.c$a */
    public class a implements b {
        @Override // p162m0.C8538c.b
        /* renamed from: a */
        public void mo3620a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }
}
