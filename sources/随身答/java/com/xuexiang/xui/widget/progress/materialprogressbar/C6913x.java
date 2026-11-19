package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.x */
/* loaded from: classes4.dex */
public class C6913x extends AbstractC6897h implements InterfaceC6911v {

    /* renamed from: m */
    public boolean f7987m;

    public C6913x(Context context) {
        super(context);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6911v
    /* renamed from: a */
    public boolean mo7012a() {
        return this.f7987m;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6911v
    /* renamed from: b */
    public void mo7013b(boolean z9) {
        if (this.f7987m != z9) {
            this.f7987m = z9;
            invalidateSelf();
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6897h
    /* renamed from: j */
    public void mo7035j(Canvas canvas, Paint paint) {
        int level = getLevel();
        if (level == 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.scale(level / 10000.0f, 1.0f, AbstractC6897h.f7966k.left, 0.0f);
        super.mo7035j(canvas, paint);
        if (this.f7987m) {
            super.mo7035j(canvas, paint);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i9) {
        invalidateSelf();
        return true;
    }
}
