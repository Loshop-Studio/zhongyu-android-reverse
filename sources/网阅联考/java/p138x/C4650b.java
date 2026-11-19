package p138x;

import android.graphics.Bitmap;
import p071i.InterfaceC3771a;
import p098n.InterfaceC4393b;
import p098n.InterfaceC4395d;

/* renamed from: x.b */
/* loaded from: classes2.dex */
public final class C4650b implements InterfaceC3771a.a {

    /* renamed from: a */
    public final InterfaceC4395d f5940a;

    /* renamed from: b */
    public final InterfaceC4393b f5941b;

    public C4650b(InterfaceC4395d interfaceC4395d, InterfaceC4393b interfaceC4393b) {
        this.f5940a = interfaceC4395d;
        this.f5941b = interfaceC4393b;
    }

    @Override // p071i.InterfaceC3771a.a
    /* renamed from: a */
    public Bitmap mo4883a(int i4, int i5, Bitmap.Config config) {
        return this.f5940a.mo5394e(i4, i5, config);
    }

    @Override // p071i.InterfaceC3771a.a
    /* renamed from: b */
    public int[] mo4884b(int i4) {
        InterfaceC4393b interfaceC4393b = this.f5941b;
        return interfaceC4393b == null ? new int[i4] : (int[]) interfaceC4393b.mo5386d(i4, int[].class);
    }

    @Override // p071i.InterfaceC3771a.a
    /* renamed from: c */
    public void mo4885c(Bitmap bitmap) {
        this.f5940a.mo5392c(bitmap);
    }

    @Override // p071i.InterfaceC3771a.a
    /* renamed from: d */
    public void mo4886d(byte[] bArr) {
        InterfaceC4393b interfaceC4393b = this.f5941b;
        if (interfaceC4393b == null) {
            return;
        }
        interfaceC4393b.put(bArr);
    }

    @Override // p071i.InterfaceC3771a.a
    /* renamed from: e */
    public byte[] mo4887e(int i4) {
        InterfaceC4393b interfaceC4393b = this.f5941b;
        return interfaceC4393b == null ? new byte[i4] : (byte[]) interfaceC4393b.mo5386d(i4, byte[].class);
    }

    @Override // p071i.InterfaceC3771a.a
    /* renamed from: f */
    public void mo4888f(int[] iArr) {
        InterfaceC4393b interfaceC4393b = this.f5941b;
        if (interfaceC4393b == null) {
            return;
        }
        interfaceC4393b.put(iArr);
    }
}
