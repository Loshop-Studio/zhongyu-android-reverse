package p328s0;

import android.graphics.drawable.Drawable;
import p198j0.InterfaceC9657j;

/* renamed from: s0.j */
/* loaded from: classes3.dex */
public final class C11031j extends AbstractC11030i {
    public C11031j(Drawable drawable) {
        super(drawable);
    }

    /* renamed from: c */
    public static InterfaceC9657j m24378c(Drawable drawable) {
        if (drawable != null) {
            return new C11031j(drawable);
        }
        return null;
    }

    @Override // p198j0.InterfaceC9657j
    /* renamed from: a */
    public Class mo4219a() {
        return this.f26605c.getClass();
    }

    @Override // p198j0.InterfaceC9657j
    public int getSize() {
        return Math.max(1, this.f26605c.getIntrinsicWidth() * this.f26605c.getIntrinsicHeight() * 4);
    }

    @Override // p198j0.InterfaceC9657j
    public void recycle() {
    }
}
