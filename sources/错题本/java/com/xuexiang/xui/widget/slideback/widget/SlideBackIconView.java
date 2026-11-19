package com.xuexiang.xui.widget.slideback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;

/* loaded from: classes3.dex */
public class SlideBackIconView extends View {

    /* renamed from: a */
    public final Path f4872a;

    /* renamed from: b */
    public final Path f4873b;

    /* renamed from: c */
    public final Paint f4874c;

    /* renamed from: d */
    public final Paint f4875d;

    /* renamed from: e */
    public int f4876e;

    /* renamed from: f */
    public float f4877f;

    /* renamed from: g */
    public float f4878g;

    /* renamed from: h */
    public float f4879h;

    public SlideBackIconView(Context context) {
        this(context, null);
    }

    public float getBackViewHeight() {
        return this.f4877f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f4872a.reset();
        this.f4872a.moveTo(0.0f, 0.0f);
        float f = this.f4877f;
        this.f4872a.cubicTo(0.0f, (f * 2.0f) / 9.0f, 0.0f, f / 3.0f, 0.0f, f / 2.0f);
        float f7 = this.f4877f;
        this.f4872a.cubicTo(0.0f, (f7 * 2.0f) / 3.0f, 0.0f, (7.0f * f7) / 9.0f, 0.0f, f7);
        canvas.drawPath(this.f4872a, this.f4874c);
        float f8 = 0.0f / this.f4879h;
        float f9 = f8 < 0.75f ? 0.0f : (f8 - 0.75f) * 2.0f;
        this.f4873b.reset();
        float f10 = this.f4878g;
        this.f4873b.moveTo((f10 * f9) + 0.0f, (this.f4877f / 2.0f) - (f10 * f8));
        this.f4873b.lineTo(0.0f - (this.f4878g * f9), this.f4877f / 2.0f);
        float f11 = this.f4878g;
        this.f4873b.lineTo((f9 * f11) + 0.0f, (f8 * f11) + (this.f4877f / 2.0f));
        canvas.drawPath(this.f4873b, this.f4875d);
        setAlpha((0.0f / this.f4879h) - 0.2f);
    }

    public void setArrowSize(float f) {
        this.f4878g = f;
    }

    public void setBackViewColor(@ColorInt int i) {
        this.f4876e = i;
    }

    public void setBackViewHeight(float f) {
        this.f4877f = f;
    }

    public void setMaxSlideLength(float f) {
        this.f4879h = f;
    }

    public SlideBackIconView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlideBackIconView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4876e = ViewCompat.MEASURED_STATE_MASK;
        this.f4877f = 0.0f;
        this.f4878g = 10.0f;
        this.f4879h = 0.0f;
        this.f4872a = new Path();
        this.f4873b = new Path();
        Paint paint = new Paint();
        this.f4874c = paint;
        paint.setAntiAlias(true);
        this.f4874c.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f4874c.setColor(this.f4876e);
        this.f4874c.setStrokeWidth(1.0f);
        Paint paint2 = new Paint();
        this.f4875d = paint2;
        paint2.setAntiAlias(true);
        this.f4875d.setStyle(Paint.Style.STROKE);
        this.f4875d.setColor(-1);
        this.f4875d.setStrokeWidth(8.0f);
        this.f4875d.setStrokeJoin(Paint.Join.ROUND);
        setAlpha(0.0f);
    }
}
