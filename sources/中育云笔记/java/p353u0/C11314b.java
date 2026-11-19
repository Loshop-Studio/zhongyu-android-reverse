package p353u0;

import android.graphics.Bitmap;
import p156g0.InterfaceC9253a;
import p213k0.InterfaceC9770b;
import p213k0.InterfaceC9772d;

/* renamed from: u0.b */
/* loaded from: classes3.dex */
public final class C11314b implements InterfaceC9253a.a {

    /* renamed from: a */
    public final InterfaceC9772d f27125a;

    /* renamed from: b */
    public final InterfaceC9770b f27126b;

    public C11314b(InterfaceC9772d interfaceC9772d, InterfaceC9770b interfaceC9770b) {
        this.f27125a = interfaceC9772d;
        this.f27126b = interfaceC9770b;
    }

    @Override // p156g0.InterfaceC9253a.a
    /* renamed from: a */
    public void mo18216a(Bitmap bitmap) {
        this.f27125a.mo19710c(bitmap);
    }

    @Override // p156g0.InterfaceC9253a.a
    /* renamed from: b */
    public byte[] mo18217b(int i10) {
        InterfaceC9770b interfaceC9770b = this.f27126b;
        return interfaceC9770b == null ? new byte[i10] : (byte[]) interfaceC9770b.mo19703c(i10, byte[].class);
    }

    @Override // p156g0.InterfaceC9253a.a
    /* renamed from: c */
    public Bitmap mo18218c(int i10, int i11, Bitmap.Config config) {
        return this.f27125a.mo19712e(i10, i11, config);
    }

    @Override // p156g0.InterfaceC9253a.a
    /* renamed from: d */
    public int[] mo18219d(int i10) {
        InterfaceC9770b interfaceC9770b = this.f27126b;
        return interfaceC9770b == null ? new int[i10] : (int[]) interfaceC9770b.mo19703c(i10, int[].class);
    }

    @Override // p156g0.InterfaceC9253a.a
    /* renamed from: e */
    public void mo18220e(byte[] bArr) {
        InterfaceC9770b interfaceC9770b = this.f27126b;
        if (interfaceC9770b == null) {
            return;
        }
        interfaceC9770b.put(bArr);
    }

    @Override // p156g0.InterfaceC9253a.a
    /* renamed from: f */
    public void mo18221f(int[] iArr) {
        InterfaceC9770b interfaceC9770b = this.f27126b;
        if (interfaceC9770b == null) {
            return;
        }
        interfaceC9770b.put(iArr);
    }
}
