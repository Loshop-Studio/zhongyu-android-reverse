package p074i0;

import android.graphics.Bitmap;

/* renamed from: i0.e */
/* loaded from: classes3.dex */
public class C6500e implements InterfaceC6499d {
    @Override // p074i0.InterfaceC6499d
    /* renamed from: c */
    public void mo7197c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // p074i0.InterfaceC6499d
    /* renamed from: d */
    public Bitmap mo7198d(int i6, int i7, Bitmap.Config config) {
        return Bitmap.createBitmap(i6, i7, config);
    }

    @Override // p074i0.InterfaceC6499d
    /* renamed from: e */
    public Bitmap mo7199e(int i6, int i7, Bitmap.Config config) {
        return mo7198d(i6, i7, config);
    }

    @Override // p074i0.InterfaceC6499d
    /* renamed from: b */
    public void mo7196b() {
    }

    @Override // p074i0.InterfaceC6499d
    /* renamed from: a */
    public void mo7195a(int i6) {
    }
}
