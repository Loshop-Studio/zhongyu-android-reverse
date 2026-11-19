package p070b.p113c.p114a.p116e.p144h.p145a;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: b.c.a.e.h.a.d */
/* loaded from: classes.dex */
public abstract class AbstractC0858d extends AbstractC0856b implements InterfaceC0873s {

    /* renamed from: h */
    public Paint f4653h;

    /* renamed from: i */
    public boolean f4654i = true;

    @Override // p070b.p113c.p114a.p116e.p144h.p145a.InterfaceC0873s
    /* renamed from: c */
    public void mo2563c(boolean z) {
        if (this.f4654i != z) {
            this.f4654i = z;
            invalidateSelf();
        }
    }

    @Override // p070b.p113c.p114a.p116e.p144h.p145a.InterfaceC0873s
    /* renamed from: d */
    public boolean mo2564d() {
        return this.f4654i;
    }

    /* renamed from: f */
    public abstract void mo2565f(Canvas canvas, int i, int i2, Paint paint);

    /* renamed from: g */
    public abstract void mo2566g(Paint paint);
}
