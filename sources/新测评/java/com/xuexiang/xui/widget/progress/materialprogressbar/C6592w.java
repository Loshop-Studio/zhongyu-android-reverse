package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.w */
/* loaded from: classes4.dex */
public class C6592w extends AbstractC6576g implements InterfaceC6591v {

    /* renamed from: l */
    public final float f6727l;

    /* renamed from: m */
    public boolean f6728m;

    public C6592w(int i10) {
        if (i10 == 0) {
            this.f6727l = 0.0f;
        } else {
            if (i10 != 1) {
                throw new IllegalArgumentException("Invalid value for style");
            }
            this.f6727l = 360.0f;
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6591v
    /* renamed from: a */
    public boolean mo5914a() {
        return this.f6728m;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6591v
    /* renamed from: b */
    public void mo5915b(boolean z9) {
        if (this.f6728m != z9) {
            this.f6728m = z9;
            invalidateSelf();
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6576g
    /* renamed from: k */
    public void mo5936k(Canvas canvas, Paint paint) {
        int level = getLevel();
        if (level == 0) {
            return;
        }
        float f10 = level / 10000.0f;
        float f11 = this.f6727l * f10;
        float f12 = f10 * 360.0f;
        m5935j(canvas, paint, f11, f12);
        if (this.f6728m) {
            m5935j(canvas, paint, f11, f12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        invalidateSelf();
        return true;
    }
}
