package p182n;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p116h0.AbstractC8707k;
import p116h0.C8703g;
import p160l.C9230d;
import p160l.InterfaceC9228b;
import p160l.InterfaceC9233g;
import p193o.InterfaceC9498b;

/* renamed from: n.k */
/* loaded from: classes3.dex */
public final class C9358k implements InterfaceC9228b {

    /* renamed from: j */
    public static final C8703g f18485j = new C8703g(50);

    /* renamed from: b */
    public final InterfaceC9498b f18486b;

    /* renamed from: c */
    public final InterfaceC9228b f18487c;

    /* renamed from: d */
    public final InterfaceC9228b f18488d;

    /* renamed from: e */
    public final int f18489e;

    /* renamed from: f */
    public final int f18490f;

    /* renamed from: g */
    public final Class f18491g;

    /* renamed from: h */
    public final C9230d f18492h;

    /* renamed from: i */
    public final InterfaceC9233g f18493i;

    public C9358k(InterfaceC9498b interfaceC9498b, InterfaceC9228b interfaceC9228b, InterfaceC9228b interfaceC9228b2, int i10, int i11, InterfaceC9233g interfaceC9233g, Class cls, C9230d c9230d) {
        this.f18486b = interfaceC9498b;
        this.f18487c = interfaceC9228b;
        this.f18488d = interfaceC9228b2;
        this.f18489e = i10;
        this.f18490f = i11;
        this.f18493i = interfaceC9233g;
        this.f18491g = cls;
        this.f18492h = c9230d;
    }

    @Override // p160l.InterfaceC9228b
    /* renamed from: b */
    public void mo13883b(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f18486b.mo17615c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f18489e).putInt(this.f18490f).array();
        this.f18488d.mo13883b(messageDigest);
        this.f18487c.mo13883b(messageDigest);
        messageDigest.update(bArr);
        InterfaceC9233g interfaceC9233g = this.f18493i;
        if (interfaceC9233g != null) {
            interfaceC9233g.mo13883b(messageDigest);
        }
        this.f18492h.mo13883b(messageDigest);
        messageDigest.update(m17241c());
        this.f18486b.put(bArr);
    }

    /* renamed from: c */
    public final byte[] m17241c() {
        C8703g c8703g = f18485j;
        byte[] bArr = (byte[]) c8703g.m14168f(this.f18491g);
        if (bArr != null) {
            return bArr;
        }
        byte[] bytes = this.f18491g.getName().getBytes(InterfaceC9228b.f18210a);
        c8703g.m14172j(this.f18491g, bytes);
        return bytes;
    }

    @Override // p160l.InterfaceC9228b
    public boolean equals(Object obj) {
        if (obj instanceof C9358k) {
            C9358k c9358k = (C9358k) obj;
            if (this.f18490f == c9358k.f18490f && this.f18489e == c9358k.f18489e && AbstractC8707k.m14186d(this.f18493i, c9358k.f18493i) && this.f18491g.equals(c9358k.f18491g) && this.f18487c.equals(c9358k.f18487c) && this.f18488d.equals(c9358k.f18488d) && this.f18492h.equals(c9358k.f18492h)) {
                return true;
            }
        }
        return false;
    }

    @Override // p160l.InterfaceC9228b
    public int hashCode() {
        int iHashCode = (((((this.f18487c.hashCode() * 31) + this.f18488d.hashCode()) * 31) + this.f18489e) * 31) + this.f18490f;
        InterfaceC9233g interfaceC9233g = this.f18493i;
        if (interfaceC9233g != null) {
            iHashCode = (iHashCode * 31) + interfaceC9233g.hashCode();
        }
        return (((iHashCode * 31) + this.f18491g.hashCode()) * 31) + this.f18492h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f18487c + ", signature=" + this.f18488d + ", width=" + this.f18489e + ", height=" + this.f18490f + ", decodedResourceClass=" + this.f18491g + ", transformation='" + this.f18493i + "', options=" + this.f18492h + '}';
    }
}
