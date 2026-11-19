package p053f0;

import java.security.MessageDigest;
import p016b1.AbstractC4408j;

/* renamed from: f0.c */
/* loaded from: classes3.dex */
public final class C6284c {

    /* renamed from: e */
    public static final b f7650e = new a();

    /* renamed from: a */
    public final Object f7651a;

    /* renamed from: b */
    public final b f7652b;

    /* renamed from: c */
    public final String f7653c;

    /* renamed from: d */
    public volatile byte[] f7654d;

    /* renamed from: f0.c$b */
    public interface b {
        /* renamed from: a */
        void mo2800a(byte[] bArr, Object obj, MessageDigest messageDigest);
    }

    public C6284c(String str, Object obj, b bVar) {
        this.f7653c = AbstractC4408j.m1436b(str);
        this.f7651a = obj;
        this.f7652b = (b) AbstractC4408j.m1438d(bVar);
    }

    /* renamed from: a */
    public static C6284c m6412a(String str, Object obj, b bVar) {
        return new C6284c(str, obj, bVar);
    }

    /* renamed from: b */
    public static b m6413b() {
        return f7650e;
    }

    /* renamed from: e */
    public static C6284c m6414e(String str) {
        return new C6284c(str, null, m6413b());
    }

    /* renamed from: f */
    public static C6284c m6415f(String str, Object obj) {
        return new C6284c(str, obj, m6413b());
    }

    /* renamed from: c */
    public Object m6416c() {
        return this.f7651a;
    }

    /* renamed from: d */
    public final byte[] m6417d() {
        if (this.f7654d == null) {
            this.f7654d = this.f7653c.getBytes(InterfaceC6283b.f7649a);
        }
        return this.f7654d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6284c) {
            return this.f7653c.equals(((C6284c) obj).f7653c);
        }
        return false;
    }

    /* renamed from: g */
    public void m6418g(Object obj, MessageDigest messageDigest) {
        this.f7652b.mo2800a(m6417d(), obj, messageDigest);
    }

    public int hashCode() {
        return this.f7653c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f7653c + "'}";
    }

    /* renamed from: f0.c$a */
    public class a implements b {
        @Override // p053f0.C6284c.b
        /* renamed from: a */
        public void mo2800a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }
}
