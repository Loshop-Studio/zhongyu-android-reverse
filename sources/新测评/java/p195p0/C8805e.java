package p195p0;

import android.graphics.Bitmap;

/* renamed from: p0.e */
/* loaded from: classes3.dex */
public class C8805e implements InterfaceC8804d {
    @Override // p195p0.InterfaceC8804d
    /* renamed from: c */
    public void mo14712c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // p195p0.InterfaceC8804d
    /* renamed from: d */
    public Bitmap mo14713d(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // p195p0.InterfaceC8804d
    /* renamed from: e */
    public Bitmap mo14714e(int i10, int i11, Bitmap.Config config) {
        return mo14713d(i10, i11, config);
    }

    @Override // p195p0.InterfaceC8804d
    /* renamed from: b */
    public void mo14711b() {
    }

    @Override // p195p0.InterfaceC8804d
    /* renamed from: a */
    public void mo14710a(int i10) {
    }
}
