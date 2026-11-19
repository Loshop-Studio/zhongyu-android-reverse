package p164l0;

import android.graphics.Bitmap;

/* renamed from: l0.e */
/* loaded from: classes3.dex */
public class C8868e implements InterfaceC8867d {
    @Override // p164l0.InterfaceC8867d
    /* renamed from: c */
    public void mo13732c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // p164l0.InterfaceC8867d
    /* renamed from: d */
    public Bitmap mo13733d(int i9, int i10, Bitmap.Config config) {
        return Bitmap.createBitmap(i9, i10, config);
    }

    @Override // p164l0.InterfaceC8867d
    /* renamed from: e */
    public Bitmap mo13734e(int i9, int i10, Bitmap.Config config) {
        return mo13733d(i9, i10, config);
    }

    @Override // p164l0.InterfaceC8867d
    /* renamed from: b */
    public void mo13731b() {
    }

    @Override // p164l0.InterfaceC8867d
    /* renamed from: a */
    public void mo13730a(int i9) {
    }
}
