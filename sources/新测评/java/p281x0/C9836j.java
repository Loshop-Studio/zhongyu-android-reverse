package p281x0;

import android.graphics.drawable.Drawable;
import p184o0.InterfaceC8690j;

/* renamed from: x0.j */
/* loaded from: classes3.dex */
public final class C9836j extends AbstractC9835i {
    public C9836j(Drawable drawable) {
        super(drawable);
    }

    /* renamed from: c */
    public static InterfaceC8690j m16472c(Drawable drawable) {
        if (drawable != null) {
            return new C9836j(drawable);
        }
        return null;
    }

    @Override // p184o0.InterfaceC8690j
    /* renamed from: a */
    public Class mo3569a() {
        return this.f17393a.getClass();
    }

    @Override // p184o0.InterfaceC8690j
    public int getSize() {
        return Math.max(1, this.f17393a.getIntrinsicWidth() * this.f17393a.getIntrinsicHeight() * 4);
    }

    @Override // p184o0.InterfaceC8690j
    public void recycle() {
    }
}
