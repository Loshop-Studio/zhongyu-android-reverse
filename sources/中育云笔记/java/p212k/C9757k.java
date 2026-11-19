package p212k;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: k.k */
/* loaded from: classes3.dex */
public final class C9757k extends Drawable {

    /* renamed from: a */
    public final InterfaceC9756j f22922a;

    public C9757k(InterfaceC9756j interfaceC9756j) {
        this.f22922a = interfaceC9756j;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f22922a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
