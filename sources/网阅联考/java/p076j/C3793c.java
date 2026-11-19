package p076j;

import java.security.MessageDigest;
import p062g0.AbstractC3749i;

/* renamed from: j.c */
/* loaded from: classes2.dex */
public final class C3793c {

    /* renamed from: e */
    public static final b f4538e = new a();

    /* renamed from: a */
    public final Object f4539a;

    /* renamed from: b */
    public final b f4540b;

    /* renamed from: c */
    public final String f4541c;

    /* renamed from: d */
    public volatile byte[] f4542d;

    /* renamed from: j.c$a */
    public class a implements b {
        @Override // p076j.C3793c.b
        /* renamed from: a */
        public void mo4949a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* renamed from: j.c$b */
    public interface b {
        /* renamed from: a */
        void mo4949a(byte[] bArr, Object obj, MessageDigest messageDigest);
    }

    public C3793c(String str, Object obj, b bVar) {
        this.f4541c = AbstractC3749i.m4766b(str);
        this.f4539a = obj;
        this.f4540b = (b) AbstractC3749i.m4768d(bVar);
    }

    /* renamed from: a */
    public static C3793c m4942a(String str, Object obj, b bVar) {
        return new C3793c(str, obj, bVar);
    }

    /* renamed from: b */
    public static b m4943b() {
        return f4538e;
    }

    /* renamed from: e */
    public static C3793c m4944e(String str) {
        return new C3793c(str, null, m4943b());
    }

    /* renamed from: f */
    public static C3793c m4945f(String str, Object obj) {
        return new C3793c(str, obj, m4943b());
    }

    /* renamed from: c */
    public Object m4946c() {
        return this.f4539a;
    }

    /* renamed from: d */
    public final byte[] m4947d() {
        if (this.f4542d == null) {
            this.f4542d = this.f4541c.getBytes(InterfaceC3792b.f4537a);
        }
        return this.f4542d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C3793c) {
            return this.f4541c.equals(((C3793c) obj).f4541c);
        }
        return false;
    }

    /* renamed from: g */
    public void m4948g(Object obj, MessageDigest messageDigest) {
        this.f4540b.mo4949a(m4947d(), obj, messageDigest);
    }

    public int hashCode() {
        return this.f4541c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f4541c + "'}";
    }
}
