package p016b0;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;
import p024c0.C3208e;
import p024c0.C3209f;
import p024c0.C3210g;
import p024c0.InterfaceC3212i;
import p180v0.AbstractC6664k;
import p180v0.C6660g;
import p202y.C6763f;
import p202y.InterfaceC6760c;
import p202y.InterfaceC6766i;

/* renamed from: b0.i0 */
/* loaded from: classes2.dex */
public final class C3076i0 implements InterfaceC6760c {

    /* renamed from: j */
    public static final C6660g f1433j = new C6660g(50);

    /* renamed from: b */
    public final C3210g f1434b;

    /* renamed from: c */
    public final InterfaceC6760c f1435c;

    /* renamed from: d */
    public final InterfaceC6760c f1436d;

    /* renamed from: e */
    public final int f1437e;

    /* renamed from: f */
    public final int f1438f;

    /* renamed from: g */
    public final Class f1439g;

    /* renamed from: h */
    public final C6763f f1440h;

    /* renamed from: i */
    public final InterfaceC6766i f1441i;

    public C3076i0(C3210g c3210g, InterfaceC6760c interfaceC6760c, InterfaceC6760c interfaceC6760c2, int i, int i8, InterfaceC6766i interfaceC6766i, Class cls, C6763f c6763f) {
        this.f1434b = c3210g;
        this.f1435c = interfaceC6760c;
        this.f1436d = interfaceC6760c2;
        this.f1437e = i;
        this.f1438f = i8;
        this.f1441i = interfaceC6766i;
        this.f1439g = cls;
        this.f1440h = c6763f;
    }

    @Override // p202y.InterfaceC6760c
    /* renamed from: b */
    public final void mo2013b(MessageDigest messageDigest) {
        Object objM2157g;
        C3210g c3210g = this.f1434b;
        synchronized (c3210g) {
            C3209f c3209f = (C3209f) c3210g.f1753d;
            InterfaceC3212i interfaceC3212iM2150b = (InterfaceC3212i) ((ArrayDeque) c3209f.f1740a).poll();
            if (interfaceC3212iM2150b == null) {
                interfaceC3212iM2150b = c3209f.m2150b();
            }
            C3208e c3208e = (C3208e) interfaceC3212iM2150b;
            c3208e.f1747b = 8;
            c3208e.f1748c = byte[].class;
            objM2157g = c3210g.m2157g(c3208e, byte[].class);
        }
        byte[] bArr = (byte[]) objM2157g;
        ByteBuffer.wrap(bArr).putInt(this.f1437e).putInt(this.f1438f).array();
        this.f1436d.mo2013b(messageDigest);
        this.f1435c.mo2013b(messageDigest);
        messageDigest.update(bArr);
        InterfaceC6766i interfaceC6766i = this.f1441i;
        if (interfaceC6766i != null) {
            interfaceC6766i.mo2013b(messageDigest);
        }
        this.f1440h.mo2013b(messageDigest);
        C6660g c6660g = f1433j;
        Class cls = this.f1439g;
        byte[] bytes = (byte[]) c6660g.m6316a(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(InterfaceC6760c.f11429a);
            c6660g.m6317d(cls, bytes);
        }
        messageDigest.update(bytes);
        this.f1434b.m2160j(bArr);
    }

    @Override // p202y.InterfaceC6760c
    public final boolean equals(Object obj) {
        if (obj instanceof C3076i0) {
            C3076i0 c3076i0 = (C3076i0) obj;
            if (this.f1438f == c3076i0.f1438f && this.f1437e == c3076i0.f1437e && AbstractC6664k.m6321a(this.f1441i, c3076i0.f1441i) && this.f1439g.equals(c3076i0.f1439g) && this.f1435c.equals(c3076i0.f1435c) && this.f1436d.equals(c3076i0.f1436d) && this.f1440h.equals(c3076i0.f1440h)) {
                return true;
            }
        }
        return false;
    }

    @Override // p202y.InterfaceC6760c
    public final int hashCode() {
        int iHashCode = ((((this.f1436d.hashCode() + (this.f1435c.hashCode() * 31)) * 31) + this.f1437e) * 31) + this.f1438f;
        InterfaceC6766i interfaceC6766i = this.f1441i;
        if (interfaceC6766i != null) {
            iHashCode = (iHashCode * 31) + interfaceC6766i.hashCode();
        }
        return this.f1440h.f11435b.hashCode() + ((this.f1439g.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f1435c + ", signature=" + this.f1436d + ", width=" + this.f1437e + ", height=" + this.f1438f + ", decodedResourceClass=" + this.f1439g + ", transformation='" + this.f1441i + "', options=" + this.f1440h + '}';
    }
}
