package p146s0;

import android.graphics.Bitmap;
import p046e0.InterfaceC6256a;
import p074i0.InterfaceC6497b;
import p074i0.InterfaceC6499d;

/* renamed from: s0.b */
/* loaded from: classes3.dex */
public final class C7680b implements InterfaceC6256a.a {

    /* renamed from: a */
    public final InterfaceC6499d f10141a;

    /* renamed from: b */
    public final InterfaceC6497b f10142b;

    public C7680b(InterfaceC6499d interfaceC6499d, InterfaceC6497b interfaceC6497b) {
        this.f10141a = interfaceC6499d;
        this.f10142b = interfaceC6497b;
    }

    @Override // p046e0.InterfaceC6256a.a
    /* renamed from: a */
    public void mo6359a(Bitmap bitmap) {
        this.f10141a.mo7197c(bitmap);
    }

    @Override // p046e0.InterfaceC6256a.a
    /* renamed from: b */
    public byte[] mo6360b(int i6) {
        InterfaceC6497b interfaceC6497b = this.f10142b;
        return interfaceC6497b == null ? new byte[i6] : (byte[]) interfaceC6497b.mo7190c(i6, byte[].class);
    }

    @Override // p046e0.InterfaceC6256a.a
    /* renamed from: c */
    public Bitmap mo6361c(int i6, int i7, Bitmap.Config config) {
        return this.f10141a.mo7199e(i6, i7, config);
    }

    @Override // p046e0.InterfaceC6256a.a
    /* renamed from: d */
    public int[] mo6362d(int i6) {
        InterfaceC6497b interfaceC6497b = this.f10142b;
        return interfaceC6497b == null ? new int[i6] : (int[]) interfaceC6497b.mo7190c(i6, int[].class);
    }

    @Override // p046e0.InterfaceC6256a.a
    /* renamed from: e */
    public void mo6363e(byte[] bArr) {
        InterfaceC6497b interfaceC6497b = this.f10142b;
        if (interfaceC6497b == null) {
            return;
        }
        interfaceC6497b.put(bArr);
    }

    @Override // p046e0.InterfaceC6256a.a
    /* renamed from: f */
    public void mo6364f(int[] iArr) {
        InterfaceC6497b interfaceC6497b = this.f10142b;
        if (interfaceC6497b == null) {
            return;
        }
        interfaceC6497b.put(iArr);
    }
}
