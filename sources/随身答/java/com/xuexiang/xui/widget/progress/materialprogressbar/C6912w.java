package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.w */
/* loaded from: classes4.dex */
public class C6912w extends AbstractC6896g implements InterfaceC6911v {

    /* renamed from: l */
    public final float f7985l;

    /* renamed from: m */
    public boolean f7986m;

    public C6912w(int i9) {
        if (i9 == 0) {
            this.f7985l = 0.0f;
        } else {
            if (i9 != 1) {
                throw new IllegalArgumentException("Invalid value for style");
            }
            this.f7985l = 360.0f;
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6911v
    /* renamed from: a */
    public boolean mo7012a() {
        return this.f7986m;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6911v
    /* renamed from: b */
    public void mo7013b(boolean z9) {
        if (this.f7986m != z9) {
            this.f7986m = z9;
            invalidateSelf();
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6896g
    /* renamed from: k */
    public void mo7034k(Canvas canvas, Paint paint) {
        int level = getLevel();
        if (level == 0) {
            return;
        }
        float f10 = level / 10000.0f;
        float f11 = this.f7985l * f10;
        float f12 = f10 * 360.0f;
        m7033j(canvas, paint, f11, f12);
        if (this.f7986m) {
            m7033j(canvas, paint, f11, f12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i9) {
        invalidateSelf();
        return true;
    }
}
