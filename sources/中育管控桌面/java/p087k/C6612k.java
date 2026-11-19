package p087k;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: k.k */
/* loaded from: classes3.dex */
public final class C6612k extends Drawable {

    /* renamed from: a */
    public final InterfaceC6611j f8651a;

    public C6612k(InterfaceC6611j interfaceC6611j) {
        this.f8651a = interfaceC6611j;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f8651a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i6) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
