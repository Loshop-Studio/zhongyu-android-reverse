package p098n;

import android.graphics.Bitmap;

/* renamed from: n.e */
/* loaded from: classes2.dex */
public class C4396e implements InterfaceC4395d {
    @Override // p098n.InterfaceC4395d
    /* renamed from: a */
    public void mo5390a(int i4) {
    }

    @Override // p098n.InterfaceC4395d
    /* renamed from: b */
    public void mo5391b() {
    }

    @Override // p098n.InterfaceC4395d
    /* renamed from: c */
    public void mo5392c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // p098n.InterfaceC4395d
    /* renamed from: d */
    public Bitmap mo5393d(int i4, int i5, Bitmap.Config config) {
        return Bitmap.createBitmap(i4, i5, config);
    }

    @Override // p098n.InterfaceC4395d
    /* renamed from: e */
    public Bitmap mo5394e(int i4, int i5, Bitmap.Config config) {
        return mo5393d(i4, i5, config);
    }
}
