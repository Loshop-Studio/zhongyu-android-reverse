package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.w */
/* loaded from: classes5.dex */
public class C8231w extends AbstractC8215g implements InterfaceC8230v {

    /* renamed from: n */
    public final float f16861n;

    /* renamed from: o */
    public boolean f16862o;

    public C8231w(int i10) {
        if (i10 == 0) {
            this.f16861n = 0.0f;
        } else {
            if (i10 != 1) {
                throw new IllegalArgumentException("Invalid value for style");
            }
            this.f16861n = 360.0f;
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC8230v
    /* renamed from: a */
    public boolean mo13129a() {
        return this.f16862o;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC8230v
    /* renamed from: b */
    public void mo13130b(boolean z10) {
        if (this.f16862o != z10) {
            this.f16862o = z10;
            invalidateSelf();
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC8215g
    /* renamed from: k */
    public void mo13151k(Canvas canvas, Paint paint) {
        int level = getLevel();
        if (level == 0) {
            return;
        }
        float f10 = level / 10000.0f;
        float f11 = this.f16861n * f10;
        float f12 = f10 * 360.0f;
        m13150j(canvas, paint, f11, f12);
        if (this.f16862o) {
            m13150j(canvas, paint, f11, f12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        invalidateSelf();
        return true;
    }
}
