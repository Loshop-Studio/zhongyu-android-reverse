package p070b.p113c.p114a.p116e.p144h.p145a;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: b.c.a.e.h.a.h */
/* loaded from: classes.dex */
public class C0862h extends AbstractC0860f implements InterfaceC0875u {

    /* renamed from: m */
    public boolean f4666m = true;

    @Override // p070b.p113c.p114a.p116e.p144h.p145a.InterfaceC0875u
    /* renamed from: a */
    public boolean mo2567a() {
        return this.f4666m;
    }

    @Override // p070b.p113c.p114a.p116e.p144h.p145a.InterfaceC0875u
    /* renamed from: b */
    public void mo2568b(boolean z) {
        if (this.f4666m != z) {
            this.f4666m = z;
            invalidateSelf();
        }
    }

    @Override // p070b.p113c.p114a.p116e.p144h.p145a.AbstractC0856b, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f4666m) {
            super.draw(canvas);
        }
    }

    @Override // p070b.p113c.p114a.p116e.p144h.p145a.AbstractC0860f
    /* renamed from: i */
    public void mo2570i(Canvas canvas, Paint paint) {
        m2569h(canvas, paint, 0.0f, 360.0f);
    }
}
