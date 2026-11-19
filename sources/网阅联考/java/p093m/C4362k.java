package p093m;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p062g0.AbstractC3750j;
import p062g0.C3746f;
import p076j.C3794d;
import p076j.InterfaceC3792b;
import p076j.InterfaceC3797g;
import p098n.InterfaceC4393b;

/* renamed from: m.k */
/* loaded from: classes2.dex */
public final class C4362k implements InterfaceC3792b {

    /* renamed from: j */
    public static final C3746f f4886j = new C3746f(50);

    /* renamed from: b */
    public final InterfaceC4393b f4887b;

    /* renamed from: c */
    public final InterfaceC3792b f4888c;

    /* renamed from: d */
    public final InterfaceC3792b f4889d;

    /* renamed from: e */
    public final int f4890e;

    /* renamed from: f */
    public final int f4891f;

    /* renamed from: g */
    public final Class f4892g;

    /* renamed from: h */
    public final C3794d f4893h;

    /* renamed from: i */
    public final InterfaceC3797g f4894i;

    public C4362k(InterfaceC4393b interfaceC4393b, InterfaceC3792b interfaceC3792b, InterfaceC3792b interfaceC3792b2, int i4, int i5, InterfaceC3797g interfaceC3797g, Class cls, C3794d c3794d) {
        this.f4887b = interfaceC4393b;
        this.f4888c = interfaceC3792b;
        this.f4889d = interfaceC3792b2;
        this.f4890e = i4;
        this.f4891f = i5;
        this.f4894i = interfaceC3797g;
        this.f4892g = cls;
        this.f4893h = c3794d;
    }

    @Override // p076j.InterfaceC3792b
    /* renamed from: b */
    public void mo4729b(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f4887b.mo5385c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f4890e).putInt(this.f4891f).array();
        this.f4889d.mo4729b(messageDigest);
        this.f4888c.mo4729b(messageDigest);
        messageDigest.update(bArr);
        InterfaceC3797g interfaceC3797g = this.f4894i;
        if (interfaceC3797g != null) {
            interfaceC3797g.mo4729b(messageDigest);
        }
        this.f4893h.mo4729b(messageDigest);
        messageDigest.update(m5379c());
        this.f4887b.put(bArr);
    }

    /* renamed from: c */
    public final byte[] m5379c() {
        C3746f c3746f = f4886j;
        byte[] bArr = (byte[]) c3746f.m4755g(this.f4892g);
        if (bArr != null) {
            return bArr;
        }
        byte[] bytes = this.f4892g.getName().getBytes(InterfaceC3792b.f4537a);
        c3746f.m4759k(this.f4892g, bytes);
        return bytes;
    }

    @Override // p076j.InterfaceC3792b
    public boolean equals(Object obj) {
        if (!(obj instanceof C4362k)) {
            return false;
        }
        C4362k c4362k = (C4362k) obj;
        return this.f4891f == c4362k.f4891f && this.f4890e == c4362k.f4890e && AbstractC3750j.m4772c(this.f4894i, c4362k.f4894i) && this.f4892g.equals(c4362k.f4892g) && this.f4888c.equals(c4362k.f4888c) && this.f4889d.equals(c4362k.f4889d) && this.f4893h.equals(c4362k.f4893h);
    }

    @Override // p076j.InterfaceC3792b
    public int hashCode() {
        int iHashCode = (((((this.f4888c.hashCode() * 31) + this.f4889d.hashCode()) * 31) + this.f4890e) * 31) + this.f4891f;
        InterfaceC3797g interfaceC3797g = this.f4894i;
        if (interfaceC3797g != null) {
            iHashCode = (iHashCode * 31) + interfaceC3797g.hashCode();
        }
        return (((iHashCode * 31) + this.f4892g.hashCode()) * 31) + this.f4893h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f4888c + ", signature=" + this.f4889d + ", width=" + this.f4890e + ", height=" + this.f4891f + ", decodedResourceClass=" + this.f4892g + ", transformation='" + this.f4894i + "', options=" + this.f4893h + '}';
    }
}
