package p303y;

import android.graphics.Bitmap;
import p148k.InterfaceC9042a;
import p193o.InterfaceC9498b;
import p193o.InterfaceC9500d;

/* renamed from: y.b */
/* loaded from: classes3.dex */
public final class C10592b implements InterfaceC9042a.a {

    /* renamed from: a */
    public final InterfaceC9500d f20992a;

    /* renamed from: b */
    public final InterfaceC9498b f20993b;

    public C10592b(InterfaceC9500d interfaceC9500d, InterfaceC9498b interfaceC9498b) {
        this.f20992a = interfaceC9500d;
        this.f20993b = interfaceC9498b;
    }

    @Override // p148k.InterfaceC9042a.a
    /* renamed from: a */
    public void mo15802a(Bitmap bitmap) {
        this.f20992a.mo17620b(bitmap);
    }

    @Override // p148k.InterfaceC9042a.a
    /* renamed from: b */
    public byte[] mo15803b(int i10) {
        InterfaceC9498b interfaceC9498b = this.f20993b;
        return interfaceC9498b == null ? new byte[i10] : (byte[]) interfaceC9498b.mo17614b(i10, byte[].class);
    }

    @Override // p148k.InterfaceC9042a.a
    /* renamed from: c */
    public Bitmap mo15804c(int i10, int i11, Bitmap.Config config) {
        return this.f20992a.mo17622d(i10, i11, config);
    }

    @Override // p148k.InterfaceC9042a.a
    /* renamed from: d */
    public int[] mo15805d(int i10) {
        InterfaceC9498b interfaceC9498b = this.f20993b;
        return interfaceC9498b == null ? new int[i10] : (int[]) interfaceC9498b.mo17614b(i10, int[].class);
    }

    @Override // p148k.InterfaceC9042a.a
    /* renamed from: e */
    public void mo15806e(byte[] bArr) {
        InterfaceC9498b interfaceC9498b = this.f20993b;
        if (interfaceC9498b == null) {
            return;
        }
        interfaceC9498b.put(bArr);
    }

    @Override // p148k.InterfaceC9042a.a
    /* renamed from: f */
    public void mo15807f(int[] iArr) {
        InterfaceC9498b interfaceC9498b = this.f20993b;
        if (interfaceC9498b == null) {
            return;
        }
        interfaceC9498b.put(iArr);
    }
}
