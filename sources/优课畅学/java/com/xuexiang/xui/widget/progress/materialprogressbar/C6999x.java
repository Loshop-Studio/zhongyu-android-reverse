package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.x */
/* loaded from: classes4.dex */
public class C6999x extends AbstractC6983h implements InterfaceC6997v {

    /* renamed from: m */
    public boolean f8151m;

    public C6999x(Context context) {
        super(context);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6997v
    /* renamed from: a */
    public boolean mo7104a() {
        return this.f8151m;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6997v
    /* renamed from: b */
    public void mo7105b(boolean z10) {
        if (this.f8151m != z10) {
            this.f8151m = z10;
            invalidateSelf();
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6983h
    /* renamed from: j */
    public void mo7127j(Canvas canvas, Paint paint) {
        int level = getLevel();
        if (level == 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.scale(level / 10000.0f, 1.0f, AbstractC6983h.f8130k.left, 0.0f);
        super.mo7127j(canvas, paint);
        if (this.f8151m) {
            super.mo7127j(canvas, paint);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        invalidateSelf();
        return true;
    }
}
