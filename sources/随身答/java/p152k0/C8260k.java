package p152k0;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p091e1.AbstractC7838j;
import p091e1.C7834f;
import p122h0.C8084d;
import p122h0.InterfaceC8082b;
import p122h0.InterfaceC8087g;
import p164l0.InterfaceC8865b;

/* renamed from: k0.k */
/* loaded from: classes3.dex */
public final class C8260k implements InterfaceC8082b {

    /* renamed from: j */
    public static final C7834f f14344j = new C7834f(50);

    /* renamed from: b */
    public final InterfaceC8865b f14345b;

    /* renamed from: c */
    public final InterfaceC8082b f14346c;

    /* renamed from: d */
    public final InterfaceC8082b f14347d;

    /* renamed from: e */
    public final int f14348e;

    /* renamed from: f */
    public final int f14349f;

    /* renamed from: g */
    public final Class f14350g;

    /* renamed from: h */
    public final C8084d f14351h;

    /* renamed from: i */
    public final InterfaceC8087g f14352i;

    public C8260k(InterfaceC8865b interfaceC8865b, InterfaceC8082b interfaceC8082b, InterfaceC8082b interfaceC8082b2, int i9, int i10, InterfaceC8087g interfaceC8087g, Class cls, C8084d c8084d) {
        this.f14345b = interfaceC8865b;
        this.f14346c = interfaceC8082b;
        this.f14347d = interfaceC8082b2;
        this.f14348e = i9;
        this.f14349f = i10;
        this.f14352i = interfaceC8087g;
        this.f14350g = cls;
        this.f14351h = c8084d;
    }

    @Override // p122h0.InterfaceC8082b
    /* renamed from: a */
    public void mo12082a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f14345b.mo13726d(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f14348e).putInt(this.f14349f).array();
        this.f14347d.mo12082a(messageDigest);
        this.f14346c.mo12082a(messageDigest);
        messageDigest.update(bArr);
        InterfaceC8087g interfaceC8087g = this.f14352i;
        if (interfaceC8087g != null) {
            interfaceC8087g.mo12082a(messageDigest);
        }
        this.f14351h.mo12082a(messageDigest);
        messageDigest.update(m13306c());
        this.f14345b.put(bArr);
    }

    /* renamed from: c */
    public final byte[] m13306c() {
        C7834f c7834f = f14344j;
        byte[] bArr = (byte[]) c7834f.m12243g(this.f14350g);
        if (bArr != null) {
            return bArr;
        }
        byte[] bytes = this.f14350g.getName().getBytes(InterfaceC8082b.f13784a);
        c7834f.m12247k(this.f14350g, bytes);
        return bytes;
    }

    @Override // p122h0.InterfaceC8082b
    public boolean equals(Object obj) {
        if (obj instanceof C8260k) {
            C8260k c8260k = (C8260k) obj;
            if (this.f14349f == c8260k.f14349f && this.f14348e == c8260k.f14348e && AbstractC7838j.m12260c(this.f14352i, c8260k.f14352i) && this.f14350g.equals(c8260k.f14350g) && this.f14346c.equals(c8260k.f14346c) && this.f14347d.equals(c8260k.f14347d) && this.f14351h.equals(c8260k.f14351h)) {
                return true;
            }
        }
        return false;
    }

    @Override // p122h0.InterfaceC8082b
    public int hashCode() {
        int iHashCode = (((((this.f14346c.hashCode() * 31) + this.f14347d.hashCode()) * 31) + this.f14348e) * 31) + this.f14349f;
        InterfaceC8087g interfaceC8087g = this.f14352i;
        if (interfaceC8087g != null) {
            iHashCode = (iHashCode * 31) + interfaceC8087g.hashCode();
        }
        return (((iHashCode * 31) + this.f14350g.hashCode()) * 31) + this.f14351h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f14346c + ", signature=" + this.f14347d + ", width=" + this.f14348e + ", height=" + this.f14349f + ", decodedResourceClass=" + this.f14350g + ", transformation='" + this.f14352i + "', options=" + this.f14351h + '}';
    }
}
