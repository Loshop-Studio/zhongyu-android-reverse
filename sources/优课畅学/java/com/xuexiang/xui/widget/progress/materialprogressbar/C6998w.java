package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.w */
/* loaded from: classes4.dex */
public class C6998w extends AbstractC6982g implements InterfaceC6997v {

    /* renamed from: l */
    public final float f8149l;

    /* renamed from: m */
    public boolean f8150m;

    public C6998w(int i10) {
        if (i10 == 0) {
            this.f8149l = 0.0f;
        } else {
            if (i10 != 1) {
                throw new IllegalArgumentException("Invalid value for style");
            }
            this.f8149l = 360.0f;
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6997v
    /* renamed from: a */
    public boolean mo7104a() {
        return this.f8150m;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6997v
    /* renamed from: b */
    public void mo7105b(boolean z10) {
        if (this.f8150m != z10) {
            this.f8150m = z10;
            invalidateSelf();
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6982g
    /* renamed from: k */
    public void mo7126k(Canvas canvas, Paint paint) {
        int level = getLevel();
        if (level == 0) {
            return;
        }
        float f10 = level / 10000.0f;
        float f11 = this.f8149l * f10;
        float f12 = f10 * 360.0f;
        m7125j(canvas, paint, f11, f12);
        if (this.f8150m) {
            m7125j(canvas, paint, f11, f12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        invalidateSelf();
        return true;
    }
}
