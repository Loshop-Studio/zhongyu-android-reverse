package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.x */
/* loaded from: classes4.dex */
public class C6593x extends AbstractC6577h implements InterfaceC6591v {

    /* renamed from: m */
    public boolean f6729m;

    public C6593x(Context context) {
        super(context);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6591v
    /* renamed from: a */
    public boolean mo5914a() {
        return this.f6729m;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6591v
    /* renamed from: b */
    public void mo5915b(boolean z9) {
        if (this.f6729m != z9) {
            this.f6729m = z9;
            invalidateSelf();
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6577h
    /* renamed from: j */
    public void mo5937j(Canvas canvas, Paint paint) {
        int level = getLevel();
        if (level == 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.scale(level / 10000.0f, 1.0f, AbstractC6577h.f6708k.left, 0.0f);
        super.mo5937j(canvas, paint);
        if (this.f6729m) {
            super.mo5937j(canvas, paint);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        invalidateSelf();
        return true;
    }
}
