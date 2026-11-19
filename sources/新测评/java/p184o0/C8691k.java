package p184o0;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p117i1.AbstractC7652k;
import p117i1.C7648g;
import p162m0.C8539d;
import p162m0.InterfaceC8537b;
import p162m0.InterfaceC8542g;
import p195p0.InterfaceC8802b;

/* renamed from: o0.k */
/* loaded from: classes3.dex */
public final class C8691k implements InterfaceC8537b {

    /* renamed from: j */
    public static final C7648g f14443j = new C7648g(50);

    /* renamed from: b */
    public final InterfaceC8802b f14444b;

    /* renamed from: c */
    public final InterfaceC8537b f14445c;

    /* renamed from: d */
    public final InterfaceC8537b f14446d;

    /* renamed from: e */
    public final int f14447e;

    /* renamed from: f */
    public final int f14448f;

    /* renamed from: g */
    public final Class f14449g;

    /* renamed from: h */
    public final C8539d f14450h;

    /* renamed from: i */
    public final InterfaceC8542g f14451i;

    public C8691k(InterfaceC8802b interfaceC8802b, InterfaceC8537b interfaceC8537b, InterfaceC8537b interfaceC8537b2, int i10, int i11, InterfaceC8542g interfaceC8542g, Class cls, C8539d c8539d) {
        this.f14444b = interfaceC8802b;
        this.f14445c = interfaceC8537b;
        this.f14446d = interfaceC8537b2;
        this.f14447e = i10;
        this.f14448f = i11;
        this.f14451i = interfaceC8542g;
        this.f14449g = cls;
        this.f14450h = c8539d;
    }

    @Override // p162m0.InterfaceC8537b
    /* renamed from: a */
    public void mo12541a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f14444b.mo14706d(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f14447e).putInt(this.f14448f).array();
        this.f14446d.mo12541a(messageDigest);
        this.f14445c.mo12541a(messageDigest);
        messageDigest.update(bArr);
        InterfaceC8542g interfaceC8542g = this.f14451i;
        if (interfaceC8542g != null) {
            interfaceC8542g.mo12541a(messageDigest);
        }
        this.f14450h.mo12541a(messageDigest);
        messageDigest.update(m14295c());
        this.f14444b.put(bArr);
    }

    /* renamed from: c */
    public final byte[] m14295c() {
        C7648g c7648g = f14443j;
        byte[] bArr = (byte[]) c7648g.m12670g(this.f14449g);
        if (bArr != null) {
            return bArr;
        }
        byte[] bytes = this.f14449g.getName().getBytes(InterfaceC8537b.f14173a);
        c7648g.m12674k(this.f14449g, bytes);
        return bytes;
    }

    @Override // p162m0.InterfaceC8537b
    public boolean equals(Object obj) {
        if (obj instanceof C8691k) {
            C8691k c8691k = (C8691k) obj;
            if (this.f14448f == c8691k.f14448f && this.f14447e == c8691k.f14447e && AbstractC7652k.m12688d(this.f14451i, c8691k.f14451i) && this.f14449g.equals(c8691k.f14449g) && this.f14445c.equals(c8691k.f14445c) && this.f14446d.equals(c8691k.f14446d) && this.f14450h.equals(c8691k.f14450h)) {
                return true;
            }
        }
        return false;
    }

    @Override // p162m0.InterfaceC8537b
    public int hashCode() {
        int iHashCode = (((((this.f14445c.hashCode() * 31) + this.f14446d.hashCode()) * 31) + this.f14447e) * 31) + this.f14448f;
        InterfaceC8542g interfaceC8542g = this.f14451i;
        if (interfaceC8542g != null) {
            iHashCode = (iHashCode * 31) + interfaceC8542g.hashCode();
        }
        return (((iHashCode * 31) + this.f14449g.hashCode()) * 31) + this.f14450h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f14445c + ", signature=" + this.f14446d + ", width=" + this.f14447e + ", height=" + this.f14448f + ", decodedResourceClass=" + this.f14449g + ", transformation='" + this.f14451i + "', options=" + this.f14450h + '}';
    }
}
