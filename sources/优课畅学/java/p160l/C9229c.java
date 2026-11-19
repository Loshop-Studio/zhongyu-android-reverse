package p160l;

import java.security.MessageDigest;
import p116h0.AbstractC8706j;

/* renamed from: l.c */
/* loaded from: classes3.dex */
public final class C9229c {

    /* renamed from: e */
    public static final b f18211e = new a();

    /* renamed from: a */
    public final Object f18212a;

    /* renamed from: b */
    public final b f18213b;

    /* renamed from: c */
    public final String f18214c;

    /* renamed from: d */
    public volatile byte[] f18215d;

    /* renamed from: l.c$b */
    public interface b {
        /* renamed from: a */
        void mo3065a(byte[] bArr, Object obj, MessageDigest messageDigest);
    }

    public C9229c(String str, Object obj, b bVar) {
        this.f18214c = AbstractC8706j.m14179b(str);
        this.f18212a = obj;
        this.f18213b = (b) AbstractC8706j.m14181d(bVar);
    }

    /* renamed from: a */
    public static C9229c m16932a(String str, Object obj, b bVar) {
        return new C9229c(str, obj, bVar);
    }

    /* renamed from: b */
    public static b m16933b() {
        return f18211e;
    }

    /* renamed from: e */
    public static C9229c m16934e(String str) {
        return new C9229c(str, null, m16933b());
    }

    /* renamed from: f */
    public static C9229c m16935f(String str, Object obj) {
        return new C9229c(str, obj, m16933b());
    }

    /* renamed from: c */
    public Object m16936c() {
        return this.f18212a;
    }

    /* renamed from: d */
    public final byte[] m16937d() {
        if (this.f18215d == null) {
            this.f18215d = this.f18214c.getBytes(InterfaceC9228b.f18210a);
        }
        return this.f18215d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C9229c) {
            return this.f18214c.equals(((C9229c) obj).f18214c);
        }
        return false;
    }

    /* renamed from: g */
    public void m16938g(Object obj, MessageDigest messageDigest) {
        this.f18213b.mo3065a(m16937d(), obj, messageDigest);
    }

    public int hashCode() {
        return this.f18214c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f18214c + "'}";
    }

    /* renamed from: l.c$a */
    public class a implements b {
        @Override // p160l.C9229c.b
        /* renamed from: a */
        public void mo3065a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }
}
