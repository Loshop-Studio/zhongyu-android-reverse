package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.v */
/* loaded from: classes3.dex */
public final class C4205v extends AbstractC4188e implements InterfaceC4204u {

    /* renamed from: l */
    public final float f4798l;

    /* renamed from: m */
    public boolean f4799m;

    public C4205v(int i) {
        if (i == 0) {
            this.f4798l = 0.0f;
        } else {
            if (i != 1) {
                throw new IllegalArgumentException("Invalid value for style");
            }
            this.f4798l = 360.0f;
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC4204u
    /* renamed from: a */
    public final boolean mo3559a() {
        return this.f4799m;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC4204u
    /* renamed from: b */
    public final void mo3560b(boolean z8) {
        if (this.f4799m != z8) {
            this.f4799m = z8;
            invalidateSelf();
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC4188e
    /* renamed from: h */
    public final void mo3558h(Canvas canvas, Paint paint) {
        int level = getLevel();
        if (level == 0) {
            return;
        }
        float f = level / 10000.0f;
        float f7 = f * 360.0f;
        float f8 = (this.f4798l * f) - 90.0f;
        RectF rectF = AbstractC4188e.f4745k;
        canvas.drawArc(rectF, f8, f7, false, paint);
        if (this.f4799m) {
            canvas.drawArc(rectF, f8, f7, false, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        invalidateSelf();
        return true;
    }
}
