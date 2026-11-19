package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.w */
/* loaded from: classes2.dex */
public class C3631w extends AbstractC3615g implements InterfaceC3630v {

    /* renamed from: l */
    public final float f3915l;

    /* renamed from: m */
    public boolean f3916m;

    public C3631w(int i4) {
        if (i4 == 0) {
            this.f3915l = 0.0f;
        } else {
            if (i4 != 1) {
                throw new IllegalArgumentException("Invalid value for style");
            }
            this.f3915l = 360.0f;
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC3630v
    /* renamed from: a */
    public boolean mo4545a() {
        return this.f3916m;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC3630v
    /* renamed from: b */
    public void mo4546b(boolean z3) {
        if (this.f3916m != z3) {
            this.f3916m = z3;
            invalidateSelf();
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC3615g
    /* renamed from: k */
    public void mo4567k(Canvas canvas, Paint paint) {
        int level = getLevel();
        if (level == 0) {
            return;
        }
        float f4 = level / 10000.0f;
        float f5 = this.f3915l * f4;
        float f6 = f4 * 360.0f;
        m4566j(canvas, paint, f5, f6);
        if (this.f3916m) {
            m4566j(canvas, paint, f5, f6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i4) {
        invalidateSelf();
        return true;
    }
}
