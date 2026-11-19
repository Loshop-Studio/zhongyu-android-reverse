package p122t;

import android.graphics.Bitmap;
import p062g0.AbstractC3749i;
import p062g0.AbstractC3750j;
import p093m.InterfaceC4358g;
import p093m.InterfaceC4361j;
import p098n.InterfaceC4395d;

/* renamed from: t.e */
/* loaded from: classes2.dex */
public class C4559e implements InterfaceC4361j, InterfaceC4358g {

    /* renamed from: a */
    public final Bitmap f5737a;

    /* renamed from: b */
    public final InterfaceC4395d f5738b;

    public C4559e(Bitmap bitmap, InterfaceC4395d interfaceC4395d) {
        this.f5737a = (Bitmap) AbstractC3749i.m4769e(bitmap, "Bitmap must not be null");
        this.f5738b = (InterfaceC4395d) AbstractC3749i.m4769e(interfaceC4395d, "BitmapPool must not be null");
    }

    /* renamed from: d */
    public static C4559e m6280d(Bitmap bitmap, InterfaceC4395d interfaceC4395d) {
        if (bitmap == null) {
            return null;
        }
        return new C4559e(bitmap, interfaceC4395d);
    }

    @Override // p093m.InterfaceC4358g
    /* renamed from: a */
    public void mo5369a() {
        this.f5737a.prepareToDraw();
    }

    @Override // p093m.InterfaceC4361j
    /* renamed from: b */
    public Class mo1898b() {
        return Bitmap.class;
    }

    @Override // p093m.InterfaceC4361j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f5737a;
    }

    @Override // p093m.InterfaceC4361j
    public int getSize() {
        return AbstractC3750j.m4776g(this.f5737a);
    }

    @Override // p093m.InterfaceC4361j
    public void recycle() {
        this.f5738b.mo5392c(this.f5737a);
    }
}
