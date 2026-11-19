package p198j0;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p109d1.AbstractC8910k;
import p109d1.C8906g;
import p168h0.C9438e;
import p168h0.InterfaceC9435b;
import p168h0.InterfaceC9441h;
import p213k0.InterfaceC9770b;

/* renamed from: j0.k */
/* loaded from: classes3.dex */
public final class C9658k implements InterfaceC9435b {

    /* renamed from: j */
    public static final C8906g f22376j = new C8906g(50);

    /* renamed from: b */
    public final InterfaceC9770b f22377b;

    /* renamed from: c */
    public final InterfaceC9435b f22378c;

    /* renamed from: d */
    public final InterfaceC9435b f22379d;

    /* renamed from: e */
    public final int f22380e;

    /* renamed from: f */
    public final int f22381f;

    /* renamed from: g */
    public final Class f22382g;

    /* renamed from: h */
    public final C9438e f22383h;

    /* renamed from: i */
    public final InterfaceC9441h f22384i;

    public C9658k(InterfaceC9770b interfaceC9770b, InterfaceC9435b interfaceC9435b, InterfaceC9435b interfaceC9435b2, int i10, int i11, InterfaceC9441h interfaceC9441h, Class cls, C9438e c9438e) {
        this.f22377b = interfaceC9770b;
        this.f22378c = interfaceC9435b;
        this.f22379d = interfaceC9435b2;
        this.f22380e = i10;
        this.f22381f = i11;
        this.f22384i = interfaceC9441h;
        this.f22382g = cls;
        this.f22383h = c9438e;
    }

    @Override // p168h0.InterfaceC9435b
    /* renamed from: b */
    public void mo2797b(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f22377b.mo19704d(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f22380e).putInt(this.f22381f).array();
        this.f22379d.mo2797b(messageDigest);
        this.f22378c.mo2797b(messageDigest);
        messageDigest.update(bArr);
        InterfaceC9441h interfaceC9441h = this.f22384i;
        if (interfaceC9441h != null) {
            interfaceC9441h.mo2797b(messageDigest);
        }
        this.f22383h.mo2797b(messageDigest);
        messageDigest.update(m19059c());
        this.f22377b.put(bArr);
    }

    /* renamed from: c */
    public final byte[] m19059c() {
        C8906g c8906g = f22376j;
        byte[] bArr = (byte[]) c8906g.m17455g(this.f22382g);
        if (bArr != null) {
            return bArr;
        }
        byte[] bytes = this.f22382g.getName().getBytes(InterfaceC9435b.f21837a);
        c8906g.m17459k(this.f22382g, bytes);
        return bytes;
    }

    @Override // p168h0.InterfaceC9435b
    public boolean equals(Object obj) {
        if (obj instanceof C9658k) {
            C9658k c9658k = (C9658k) obj;
            if (this.f22381f == c9658k.f22381f && this.f22380e == c9658k.f22380e && AbstractC8910k.m17473d(this.f22384i, c9658k.f22384i) && this.f22382g.equals(c9658k.f22382g) && this.f22378c.equals(c9658k.f22378c) && this.f22379d.equals(c9658k.f22379d) && this.f22383h.equals(c9658k.f22383h)) {
                return true;
            }
        }
        return false;
    }

    @Override // p168h0.InterfaceC9435b
    public int hashCode() {
        int iHashCode = (((((this.f22378c.hashCode() * 31) + this.f22379d.hashCode()) * 31) + this.f22380e) * 31) + this.f22381f;
        InterfaceC9441h interfaceC9441h = this.f22384i;
        if (interfaceC9441h != null) {
            iHashCode = (iHashCode * 31) + interfaceC9441h.hashCode();
        }
        return (((iHashCode * 31) + this.f22382g.hashCode()) * 31) + this.f22383h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f22378c + ", signature=" + this.f22379d + ", width=" + this.f22380e + ", height=" + this.f22381f + ", decodedResourceClass=" + this.f22382g + ", transformation='" + this.f22384i + "', options=" + this.f22383h + '}';
    }
}
