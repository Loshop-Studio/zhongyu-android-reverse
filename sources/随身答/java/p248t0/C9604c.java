package p248t0;

import android.graphics.drawable.Drawable;
import p152k0.InterfaceC8259j;

/* renamed from: t0.c */
/* loaded from: classes3.dex */
public final class C9604c extends AbstractC9603b {
    public C9604c(Drawable drawable) {
        super(drawable);
    }

    /* renamed from: c */
    public static InterfaceC8259j m15832c(Drawable drawable) {
        if (drawable != null) {
            return new C9604c(drawable);
        }
        return null;
    }

    @Override // p152k0.InterfaceC8259j
    /* renamed from: a */
    public Class mo3221a() {
        return this.f16823a.getClass();
    }

    @Override // p152k0.InterfaceC8259j
    public int getSize() {
        return Math.max(1, this.f16823a.getIntrinsicWidth() * this.f16823a.getIntrinsicHeight() * 4);
    }

    @Override // p152k0.InterfaceC8259j
    public void recycle() {
    }
}
