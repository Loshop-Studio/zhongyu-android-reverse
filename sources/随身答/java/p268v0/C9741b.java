package p268v0;

import android.graphics.Bitmap;
import p112g0.InterfaceC7983a;
import p164l0.InterfaceC8865b;
import p164l0.InterfaceC8867d;

/* renamed from: v0.b */
/* loaded from: classes3.dex */
public final class C9741b implements InterfaceC7983a.a {

    /* renamed from: a */
    public final InterfaceC8867d f17214a;

    /* renamed from: b */
    public final InterfaceC8865b f17215b;

    public C9741b(InterfaceC8867d interfaceC8867d, InterfaceC8865b interfaceC8865b) {
        this.f17214a = interfaceC8867d;
        this.f17215b = interfaceC8865b;
    }

    @Override // p112g0.InterfaceC7983a.a
    /* renamed from: a */
    public void mo12510a(Bitmap bitmap) {
        this.f17214a.mo13732c(bitmap);
    }

    @Override // p112g0.InterfaceC7983a.a
    /* renamed from: b */
    public byte[] mo12511b(int i9) {
        InterfaceC8865b interfaceC8865b = this.f17215b;
        return interfaceC8865b == null ? new byte[i9] : (byte[]) interfaceC8865b.mo13725c(i9, byte[].class);
    }

    @Override // p112g0.InterfaceC7983a.a
    /* renamed from: c */
    public Bitmap mo12512c(int i9, int i10, Bitmap.Config config) {
        return this.f17214a.mo13734e(i9, i10, config);
    }

    @Override // p112g0.InterfaceC7983a.a
    /* renamed from: d */
    public int[] mo12513d(int i9) {
        InterfaceC8865b interfaceC8865b = this.f17215b;
        return interfaceC8865b == null ? new int[i9] : (int[]) interfaceC8865b.mo13725c(i9, int[].class);
    }

    @Override // p112g0.InterfaceC7983a.a
    /* renamed from: e */
    public void mo12514e(byte[] bArr) {
        InterfaceC8865b interfaceC8865b = this.f17215b;
        if (interfaceC8865b == null) {
            return;
        }
        interfaceC8865b.put(bArr);
    }

    @Override // p112g0.InterfaceC7983a.a
    /* renamed from: f */
    public void mo12515f(int[] iArr) {
        InterfaceC8865b interfaceC8865b = this.f17215b;
        if (interfaceC8865b == null) {
            return;
        }
        interfaceC8865b.put(iArr);
    }
}
