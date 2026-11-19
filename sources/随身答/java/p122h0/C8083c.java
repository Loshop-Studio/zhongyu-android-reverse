package p122h0;

import java.security.MessageDigest;
import p091e1.AbstractC7837i;

/* renamed from: h0.c */
/* loaded from: classes3.dex */
public final class C8083c {

    /* renamed from: e */
    public static final b f13785e = new a();

    /* renamed from: a */
    public final Object f13786a;

    /* renamed from: b */
    public final b f13787b;

    /* renamed from: c */
    public final String f13788c;

    /* renamed from: d */
    public volatile byte[] f13789d;

    /* renamed from: h0.c$b */
    public interface b {
        /* renamed from: a */
        void mo12906a(byte[] bArr, Object obj, MessageDigest messageDigest);
    }

    public C8083c(String str, Object obj, b bVar) {
        this.f13788c = AbstractC7837i.m12254b(str);
        this.f13786a = obj;
        this.f13787b = (b) AbstractC7837i.m12256d(bVar);
    }

    /* renamed from: a */
    public static C8083c m12899a(String str, Object obj, b bVar) {
        return new C8083c(str, obj, bVar);
    }

    /* renamed from: b */
    public static b m12900b() {
        return f13785e;
    }

    /* renamed from: e */
    public static C8083c m12901e(String str) {
        return new C8083c(str, null, m12900b());
    }

    /* renamed from: f */
    public static C8083c m12902f(String str, Object obj) {
        return new C8083c(str, obj, m12900b());
    }

    /* renamed from: c */
    public Object m12903c() {
        return this.f13786a;
    }

    /* renamed from: d */
    public final byte[] m12904d() {
        if (this.f13789d == null) {
            this.f13789d = this.f13788c.getBytes(InterfaceC8082b.f13784a);
        }
        return this.f13789d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C8083c) {
            return this.f13788c.equals(((C8083c) obj).f13788c);
        }
        return false;
    }

    /* renamed from: g */
    public void m12905g(Object obj, MessageDigest messageDigest) {
        this.f13787b.mo12906a(m12904d(), obj, messageDigest);
    }

    public int hashCode() {
        return this.f13788c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f13788c + "'}";
    }

    /* renamed from: h0.c$a */
    public class a implements b {
        @Override // p122h0.C8083c.b
        /* renamed from: a */
        public void mo12906a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }
}
