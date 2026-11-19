package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.w */
/* loaded from: classes3.dex */
public class C5970w extends AbstractC5954g implements InterfaceC5969v {

    /* renamed from: l */
    public final float f5436l;

    /* renamed from: m */
    public boolean f5437m;

    public C5970w(int i6) {
        if (i6 == 0) {
            this.f5436l = 0.0f;
        } else {
            if (i6 != 1) {
                throw new IllegalArgumentException("Invalid value for style");
            }
            this.f5436l = 360.0f;
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC5969v
    /* renamed from: a */
    public boolean mo4923a() {
        return this.f5437m;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC5969v
    /* renamed from: b */
    public void mo4924b(boolean z6) {
        if (this.f5437m != z6) {
            this.f5437m = z6;
            invalidateSelf();
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC5954g
    /* renamed from: k */
    public void mo4945k(Canvas canvas, Paint paint) {
        int level = getLevel();
        if (level == 0) {
            return;
        }
        float f6 = level / 10000.0f;
        float f7 = this.f5436l * f6;
        float f8 = f6 * 360.0f;
        m4944j(canvas, paint, f7, f8);
        if (this.f5437m) {
            m4944j(canvas, paint, f7, f8);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i6) {
        invalidateSelf();
        return true;
    }
}
