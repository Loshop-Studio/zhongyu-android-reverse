package p070b.p113c.p114a.p116e.p144h.p145a;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: b.c.a.e.h.a.v */
/* loaded from: classes.dex */
public class C0876v extends AbstractC0860f implements InterfaceC0875u {

    /* renamed from: m */
    public final float f4681m;

    /* renamed from: n */
    public boolean f4682n;

    public C0876v(int i) {
        float f2;
        if (i == 0) {
            f2 = 0.0f;
        } else {
            if (i != 1) {
                throw new IllegalArgumentException("Invalid value for style");
            }
            f2 = 360.0f;
        }
        this.f4681m = f2;
    }

    @Override // p070b.p113c.p114a.p116e.p144h.p145a.InterfaceC0875u
    /* renamed from: a */
    public boolean mo2567a() {
        return this.f4682n;
    }

    @Override // p070b.p113c.p114a.p116e.p144h.p145a.InterfaceC0875u
    /* renamed from: b */
    public void mo2568b(boolean z) {
        if (this.f4682n != z) {
            this.f4682n = z;
            invalidateSelf();
        }
    }

    @Override // p070b.p113c.p114a.p116e.p144h.p145a.AbstractC0860f
    /* renamed from: i */
    public void mo2570i(Canvas canvas, Paint paint) {
        int level = getLevel();
        if (level == 0) {
            return;
        }
        float f2 = level / 10000.0f;
        float f3 = this.f4681m * f2;
        float f4 = f2 * 360.0f;
        m2569h(canvas, paint, f3, f4);
        if (this.f4682n) {
            m2569h(canvas, paint, f3, f4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        invalidateSelf();
        return true;
    }
}
