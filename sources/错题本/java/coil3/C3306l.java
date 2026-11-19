package coil3;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: coil3.l */
/* loaded from: classes2.dex */
public final class C3306l extends Drawable {

    /* renamed from: a */
    public final InterfaceC3305k f1997a;

    public C3306l(InterfaceC3305k interfaceC3305k) {
        this.f1997a = interfaceC3305k;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.f1997a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
