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

/* loaded from: classes5.dex */
public class SlideBackIconView extends View {

    /* renamed from: c */
    public Path f16945c;

    /* renamed from: d */
    public Path f16946d;

    /* renamed from: e */
    public Paint f16947e;

    /* renamed from: f */
    public Paint f16948f;

    /* renamed from: g */
    public int f16949g;

    /* renamed from: h */
    public float f16950h;

    /* renamed from: i */
    public float f16951i;

    /* renamed from: j */
    public float f16952j;

    /* renamed from: k */
    public float f16953k;

    public SlideBackIconView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void m13225a() {
        this.f16945c = new Path();
        this.f16946d = new Path();
        Paint paint = new Paint();
        this.f16947e = paint;
        paint.setAntiAlias(true);
        this.f16947e.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f16947e.setColor(this.f16949g);
        this.f16947e.setStrokeWidth(1.0f);
        Paint paint2 = new Paint();
        this.f16948f = paint2;
        paint2.setAntiAlias(true);
        this.f16948f.setStyle(Paint.Style.STROKE);
        this.f16948f.setColor(-1);
        this.f16948f.setStrokeWidth(8.0f);
        this.f16948f.setStrokeJoin(Paint.Join.ROUND);
        setAlpha(0.0f);
    }

    public float getBackViewHeight() {
        return this.f16950h;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f16945c.reset();
        this.f16945c.moveTo(0.0f, 0.0f);
        Path path = this.f16945c;
        float f10 = this.f16950h;
        float f11 = this.f16953k;
        path.cubicTo(0.0f, (f10 * 2.0f) / 9.0f, f11, f10 / 3.0f, f11, f10 / 2.0f);
        Path path2 = this.f16945c;
        float f12 = this.f16953k;
        float f13 = this.f16950h;
        path2.cubicTo(f12, (f13 * 2.0f) / 3.0f, 0.0f, (7.0f * f13) / 9.0f, 0.0f, f13);
        canvas.drawPath(this.f16945c, this.f16947e);
        float f14 = this.f16953k / this.f16952j;
        float f15 = f14 >= 0.75f ? (f14 - 0.75f) * 2.0f : 0.0f;
        this.f16946d.reset();
        Path path3 = this.f16946d;
        float f16 = this.f16953k / 2.0f;
        float f17 = this.f16951i;
        path3.moveTo(f16 + (f17 * f15), (this.f16950h / 2.0f) - (f17 * f14));
        this.f16946d.lineTo((this.f16953k / 2.0f) - (this.f16951i * f15), this.f16950h / 2.0f);
        Path path4 = this.f16946d;
        float f18 = this.f16953k / 2.0f;
        float f19 = this.f16951i;
        path4.lineTo(f18 + (f15 * f19), (this.f16950h / 2.0f) + (f14 * f19));
        canvas.drawPath(this.f16946d, this.f16948f);
        setAlpha((this.f16953k / this.f16952j) - 0.2f);
    }

    public void setArrowSize(float f10) {
        this.f16951i = f10;
    }

    public void setBackViewColor(@ColorInt int i10) {
        this.f16949g = i10;
    }

    public void setBackViewHeight(float f10) {
        this.f16950h = f10;
    }

    public void setMaxSlideLength(float f10) {
        this.f16952j = f10;
    }

    public SlideBackIconView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlideBackIconView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16949g = ViewCompat.MEASURED_STATE_MASK;
        this.f16950h = 0.0f;
        this.f16951i = 10.0f;
        this.f16952j = 0.0f;
        this.f16953k = 0.0f;
        m13225a();
    }
}
