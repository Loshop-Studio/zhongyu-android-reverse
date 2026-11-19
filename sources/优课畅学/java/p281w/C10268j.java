package p281w;

import android.graphics.drawable.Drawable;
import p182n.InterfaceC9357j;

/* renamed from: w.j */
/* loaded from: classes3.dex */
public final class C10268j extends AbstractC10267i {
    public C10268j(Drawable drawable) {
        super(drawable);
    }

    /* renamed from: c */
    public static InterfaceC9357j m19239c(Drawable drawable) {
        if (drawable != null) {
            return new C10268j(drawable);
        }
        return null;
    }

    @Override // p182n.InterfaceC9357j
    /* renamed from: b */
    public Class mo3016b() {
        return this.f20497a.getClass();
    }

    @Override // p182n.InterfaceC9357j
    public int getSize() {
        return Math.max(1, this.f20497a.getIntrinsicWidth() * this.f20497a.getIntrinsicHeight() * 4);
    }

    @Override // p182n.InterfaceC9357j
    public void recycle() {
    }
}
