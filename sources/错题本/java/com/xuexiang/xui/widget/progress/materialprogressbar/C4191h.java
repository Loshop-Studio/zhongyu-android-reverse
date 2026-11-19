package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.h */
/* loaded from: classes3.dex */
public final class C4191h extends AbstractC4187d implements InterfaceC4204u {

    /* renamed from: m */
    public static final RectF f4751m = new RectF(-180.0f, -1.0f, 180.0f, 1.0f);

    /* renamed from: n */
    public static final RectF f4752n = new RectF(-180.0f, -4.0f, 180.0f, 4.0f);

    /* renamed from: i */
    public final int f4753i;

    /* renamed from: j */
    public final int f4754j;

    /* renamed from: k */
    public final /* synthetic */ int f4755k;

    /* renamed from: l */
    public boolean f4756l;

    public C4191h(Context context, int i) {
        this.f4755k = i;
        float f = context.getResources().getDisplayMetrics().density;
        this.f4753i = Math.round(4.0f * f);
        this.f4754j = Math.round(f * 16.0f);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC4204u
    /* renamed from: a */
    public final boolean mo3559a() {
        switch (this.f4755k) {
        }
        return this.f4756l;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC4204u
    /* renamed from: b */
    public final void mo3560b(boolean z8) {
        switch (this.f4755k) {
            case 0:
                if (this.f4756l != z8) {
                    this.f4756l = z8;
                    invalidateSelf();
                    break;
                }
                break;
            default:
                if (this.f4756l != z8) {
                    this.f4756l = z8;
                    invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC4187d, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        switch (this.f4755k) {
            case 0:
                if (this.f4756l) {
                    super.draw(canvas);
                    break;
                }
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC4187d
    /* renamed from: e */
    public final void mo3555e(Canvas canvas, Paint paint, int i, int i8) {
        if (this.f4742h) {
            RectF rectF = f4752n;
            canvas.scale(i / rectF.width(), i8 / rectF.height());
            canvas.translate(rectF.width() / 2.0f, rectF.height() / 2.0f);
        } else {
            RectF rectF2 = f4751m;
            canvas.scale(i / rectF2.width(), i8 / rectF2.height());
            canvas.translate(rectF2.width() / 2.0f, rectF2.height() / 2.0f);
        }
        switch (this.f4755k) {
            case 1:
                int level = getLevel();
                if (level != 0) {
                    int iSave = canvas.save();
                    RectF rectF3 = f4751m;
                    canvas.scale(level / 10000.0f, 1.0f, rectF3.left, 0.0f);
                    canvas.drawRect(rectF3, paint);
                    if (this.f4756l) {
                        canvas.drawRect(rectF3, paint);
                    }
                    canvas.restoreToCount(iSave);
                    break;
                }
                break;
            default:
                canvas.drawRect(f4751m, paint);
                break;
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC4187d
    /* renamed from: f */
    public final void mo3556f(Paint paint) {
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f4742h ? this.f4754j : this.f4753i;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        switch (this.f4755k) {
            case 1:
                invalidateSelf();
                return true;
            default:
                return super.onLevelChange(i);
        }
    }
}
