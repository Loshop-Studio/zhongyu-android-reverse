package p137k;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: k.k */
/* loaded from: classes3.dex */
public final class C7839k extends Drawable {

    /* renamed from: a */
    public final InterfaceC7838j f13574a;

    public C7839k(InterfaceC7838j interfaceC7838j) {
        this.f13574a = interfaceC7838j;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f13574a.draw(canvas);
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
