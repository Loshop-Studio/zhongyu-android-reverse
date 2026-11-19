package p130v;

import android.graphics.drawable.Drawable;
import p093m.InterfaceC4361j;

/* renamed from: v.c */
/* loaded from: classes2.dex */
public final class C4615c extends AbstractC4614b {
    public C4615c(Drawable drawable) {
        super(drawable);
    }

    /* renamed from: d */
    public static InterfaceC4361j m6379d(Drawable drawable) {
        if (drawable != null) {
            return new C4615c(drawable);
        }
        return null;
    }

    @Override // p093m.InterfaceC4361j
    /* renamed from: b */
    public Class mo1898b() {
        return this.f5825a.getClass();
    }

    @Override // p093m.InterfaceC4361j
    public int getSize() {
        return Math.max(1, this.f5825a.getIntrinsicWidth() * this.f5825a.getIntrinsicHeight() * 4);
    }

    @Override // p093m.InterfaceC4361j
    public void recycle() {
    }
}
