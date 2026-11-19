package p301z0;

import android.graphics.Bitmap;
import p151l0.InterfaceC8482a;
import p195p0.InterfaceC8802b;
import p195p0.InterfaceC8804d;

/* renamed from: z0.b */
/* loaded from: classes3.dex */
public final class C9965b implements InterfaceC8482a.a {

    /* renamed from: a */
    public final InterfaceC8804d f17821a;

    /* renamed from: b */
    public final InterfaceC8802b f17822b;

    public C9965b(InterfaceC8804d interfaceC8804d, InterfaceC8802b interfaceC8802b) {
        this.f17821a = interfaceC8804d;
        this.f17822b = interfaceC8802b;
    }

    @Override // p151l0.InterfaceC8482a.a
    /* renamed from: a */
    public void mo13874a(Bitmap bitmap) {
        this.f17821a.mo14712c(bitmap);
    }

    @Override // p151l0.InterfaceC8482a.a
    /* renamed from: b */
    public byte[] mo13875b(int i10) {
        InterfaceC8802b interfaceC8802b = this.f17822b;
        return interfaceC8802b == null ? new byte[i10] : (byte[]) interfaceC8802b.mo14705c(i10, byte[].class);
    }

    @Override // p151l0.InterfaceC8482a.a
    /* renamed from: c */
    public Bitmap mo13876c(int i10, int i11, Bitmap.Config config) {
        return this.f17821a.mo14714e(i10, i11, config);
    }

    @Override // p151l0.InterfaceC8482a.a
    /* renamed from: d */
    public int[] mo13877d(int i10) {
        InterfaceC8802b interfaceC8802b = this.f17822b;
        return interfaceC8802b == null ? new int[i10] : (int[]) interfaceC8802b.mo14705c(i10, int[].class);
    }

    @Override // p151l0.InterfaceC8482a.a
    /* renamed from: e */
    public void mo13878e(byte[] bArr) {
        InterfaceC8802b interfaceC8802b = this.f17822b;
        if (interfaceC8802b == null) {
            return;
        }
        interfaceC8802b.put(bArr);
    }

    @Override // p151l0.InterfaceC8482a.a
    /* renamed from: f */
    public void mo13879f(int[] iArr) {
        InterfaceC8802b interfaceC8802b = this.f17822b;
        if (interfaceC8802b == null) {
            return;
        }
        interfaceC8802b.put(iArr);
    }
}
