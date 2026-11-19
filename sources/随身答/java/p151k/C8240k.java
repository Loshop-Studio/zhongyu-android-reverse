package p151k;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: k.k */
/* loaded from: classes3.dex */
public final class C8240k extends Drawable {

    /* renamed from: a */
    public final InterfaceC8239j f14309a;

    public C8240k(InterfaceC8239j interfaceC8239j) {
        this.f14309a = interfaceC8239j;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f14309a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i9) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
