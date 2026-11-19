package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.x */
/* loaded from: classes2.dex */
public class C3632x extends AbstractC3616h implements InterfaceC3630v {

    /* renamed from: m */
    public boolean f3917m;

    public C3632x(Context context) {
        super(context);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC3630v
    /* renamed from: a */
    public boolean mo4545a() {
        return this.f3917m;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC3630v
    /* renamed from: b */
    public void mo4546b(boolean z3) {
        if (this.f3917m != z3) {
            this.f3917m = z3;
            invalidateSelf();
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC3616h
    /* renamed from: j */
    public void mo4568j(Canvas canvas, Paint paint) {
        int level = getLevel();
        if (level == 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.scale(level / 10000.0f, 1.0f, AbstractC3616h.f3896k.left, 0.0f);
        super.mo4568j(canvas, paint);
        if (this.f3917m) {
            super.mo4568j(canvas, paint);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i4) {
        invalidateSelf();
        return true;
    }
}
