package p132q0;

import android.graphics.drawable.Drawable;
import p067h0.InterfaceC6440j;

/* renamed from: q0.j */
/* loaded from: classes3.dex */
public final class C7615j extends AbstractC7614i {
    public C7615j(Drawable drawable) {
        super(drawable);
    }

    /* renamed from: c */
    public static InterfaceC6440j m9046c(Drawable drawable) {
        if (drawable != null) {
            return new C7615j(drawable);
        }
        return null;
    }

    @Override // p067h0.InterfaceC6440j
    /* renamed from: a */
    public Class mo2749a() {
        return this.f10073a.getClass();
    }

    @Override // p067h0.InterfaceC6440j
    public int getSize() {
        return Math.max(1, this.f10073a.getIntrinsicWidth() * this.f10073a.getIntrinsicHeight() * 4);
    }

    @Override // p067h0.InterfaceC6440j
    public void recycle() {
    }
}
