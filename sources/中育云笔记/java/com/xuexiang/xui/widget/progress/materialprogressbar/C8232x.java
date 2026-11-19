package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.x */
/* loaded from: classes5.dex */
public class C8232x extends AbstractC8216h implements InterfaceC8230v {

    /* renamed from: o */
    public boolean f16863o;

    public C8232x(Context context) {
        super(context);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC8230v
    /* renamed from: a */
    public boolean mo13129a() {
        return this.f16863o;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC8230v
    /* renamed from: b */
    public void mo13130b(boolean z10) {
        if (this.f16863o != z10) {
            this.f16863o = z10;
            invalidateSelf();
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC8216h
    /* renamed from: j */
    public void mo13152j(Canvas canvas, Paint paint) {
        int level = getLevel();
        if (level == 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.scale(level / 10000.0f, 1.0f, AbstractC8216h.f16842m.left, 0.0f);
        super.mo13152j(canvas, paint);
        if (this.f16863o) {
            super.mo13152j(canvas, paint);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        invalidateSelf();
        return true;
    }
}
