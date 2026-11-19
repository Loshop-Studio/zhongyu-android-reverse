package p213k0;

import android.graphics.Bitmap;

/* renamed from: k0.e */
/* loaded from: classes3.dex */
public class C9773e implements InterfaceC9772d {
    @Override // p213k0.InterfaceC9772d
    /* renamed from: c */
    public void mo19710c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // p213k0.InterfaceC9772d
    /* renamed from: d */
    public Bitmap mo19711d(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // p213k0.InterfaceC9772d
    /* renamed from: e */
    public Bitmap mo19712e(int i10, int i11, Bitmap.Config config) {
        return mo19711d(i10, i11, config);
    }

    @Override // p213k0.InterfaceC9772d
    /* renamed from: b */
    public void mo19709b() {
    }

    @Override // p213k0.InterfaceC9772d
    /* renamed from: a */
    public void mo19708a(int i10) {
    }
}
