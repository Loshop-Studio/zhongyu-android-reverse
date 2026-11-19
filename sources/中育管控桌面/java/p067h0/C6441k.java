package p067h0;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p016b1.AbstractC4409k;
import p016b1.C4405g;
import p053f0.C6285d;
import p053f0.InterfaceC6283b;
import p053f0.InterfaceC6288g;
import p074i0.InterfaceC6497b;

/* renamed from: h0.k */
/* loaded from: classes3.dex */
public final class C6441k implements InterfaceC6283b {

    /* renamed from: j */
    public static final C4405g f8133j = new C4405g(50);

    /* renamed from: b */
    public final InterfaceC6497b f8134b;

    /* renamed from: c */
    public final InterfaceC6283b f8135c;

    /* renamed from: d */
    public final InterfaceC6283b f8136d;

    /* renamed from: e */
    public final int f8137e;

    /* renamed from: f */
    public final int f8138f;

    /* renamed from: g */
    public final Class f8139g;

    /* renamed from: h */
    public final C6285d f8140h;

    /* renamed from: i */
    public final InterfaceC6288g f8141i;

    public C6441k(InterfaceC6497b interfaceC6497b, InterfaceC6283b interfaceC6283b, InterfaceC6283b interfaceC6283b2, int i6, int i7, InterfaceC6288g interfaceC6288g, Class cls, C6285d c6285d) {
        this.f8134b = interfaceC6497b;
        this.f8135c = interfaceC6283b;
        this.f8136d = interfaceC6283b2;
        this.f8137e = i6;
        this.f8138f = i7;
        this.f8141i = interfaceC6288g;
        this.f8139g = cls;
        this.f8140h = c6285d;
    }

    @Override // p053f0.InterfaceC6283b
    /* renamed from: b */
    public void mo9b(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f8134b.mo7191d(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f8137e).putInt(this.f8138f).array();
        this.f8136d.mo9b(messageDigest);
        this.f8135c.mo9b(messageDigest);
        messageDigest.update(bArr);
        InterfaceC6288g interfaceC6288g = this.f8141i;
        if (interfaceC6288g != null) {
            interfaceC6288g.mo9b(messageDigest);
        }
        this.f8140h.mo9b(messageDigest);
        messageDigest.update(m7054c());
        this.f8134b.put(bArr);
    }

    /* renamed from: c */
    public final byte[] m7054c() {
        C4405g c4405g = f8133j;
        byte[] bArr = (byte[]) c4405g.m1425g(this.f8139g);
        if (bArr != null) {
            return bArr;
        }
        byte[] bytes = this.f8139g.getName().getBytes(InterfaceC6283b.f7649a);
        c4405g.m1429k(this.f8139g, bytes);
        return bytes;
    }

    @Override // p053f0.InterfaceC6283b
    public boolean equals(Object obj) {
        if (obj instanceof C6441k) {
            C6441k c6441k = (C6441k) obj;
            if (this.f8138f == c6441k.f8138f && this.f8137e == c6441k.f8137e && AbstractC4409k.m1443d(this.f8141i, c6441k.f8141i) && this.f8139g.equals(c6441k.f8139g) && this.f8135c.equals(c6441k.f8135c) && this.f8136d.equals(c6441k.f8136d) && this.f8140h.equals(c6441k.f8140h)) {
                return true;
            }
        }
        return false;
    }

    @Override // p053f0.InterfaceC6283b
    public int hashCode() {
        int iHashCode = (((((this.f8135c.hashCode() * 31) + this.f8136d.hashCode()) * 31) + this.f8137e) * 31) + this.f8138f;
        InterfaceC6288g interfaceC6288g = this.f8141i;
        if (interfaceC6288g != null) {
            iHashCode = (iHashCode * 31) + interfaceC6288g.hashCode();
        }
        return (((iHashCode * 31) + this.f8139g.hashCode()) * 31) + this.f8140h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f8135c + ", signature=" + this.f8136d + ", width=" + this.f8137e + ", height=" + this.f8138f + ", decodedResourceClass=" + this.f8139g + ", transformation='" + this.f8141i + "', options=" + this.f8140h + '}';
    }
}
