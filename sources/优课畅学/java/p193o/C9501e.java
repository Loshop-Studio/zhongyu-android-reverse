package p193o;

import android.graphics.Bitmap;

/* renamed from: o.e */
/* loaded from: classes3.dex */
public class C9501e implements InterfaceC9500d {
    @Override // p193o.InterfaceC9500d
    /* renamed from: b */
    public void mo17620b(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // p193o.InterfaceC9500d
    /* renamed from: c */
    public Bitmap mo17621c(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // p193o.InterfaceC9500d
    /* renamed from: d */
    public Bitmap mo17622d(int i10, int i11, Bitmap.Config config) {
        return mo17621c(i10, i11, config);
    }

    @Override // p193o.InterfaceC9500d
    /* renamed from: a */
    public void mo17619a() {
    }

    @Override // p193o.InterfaceC9500d
    public void trimMemory(int i10) {
    }
}
