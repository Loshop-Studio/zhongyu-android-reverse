package com.zykj.mistake.update.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.R;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m5110d2 = {"Lcom/zykj/mistake/update/view/PercentCircleView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "progress", "Ld6/s;", "setTargetPercent", "(F)V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class PercentCircleView extends View {

    /* renamed from: a */
    public Paint f8003a;

    /* renamed from: b */
    public Paint f8004b;

    /* renamed from: c */
    public Paint f8005c;

    /* renamed from: d */
    public Paint f8006d;

    /* renamed from: e */
    public int f8007e;

    /* renamed from: f */
    public int f8008f;

    /* renamed from: g */
    public float f8009g;

    /* renamed from: h */
    public RectF f8010h;

    /* renamed from: i */
    public float f8011i;

    /* renamed from: j */
    public String f8012j;

    /* renamed from: k */
    public int f8013k;

    /* renamed from: l */
    public final int f8014l;

    /* renamed from: m */
    public final int f8015m;

    /* renamed from: n */
    public final int f8016n;

    /* renamed from: o */
    public int f8017o;

    /* renamed from: p */
    public final int f8018p;

    /* renamed from: q */
    public final int f8019q;

    /* renamed from: r */
    public RectF f8020r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PercentCircleView(@NotNull Context context) {
        super(context);
        AbstractC5830k.m5330g(context, "context");
        this.f8012j = "0%";
        this.f8013k = 123;
        this.f8017o = 30;
        this.f8019q = 10;
        m4444a();
    }

    /* renamed from: a */
    public final void m4444a() {
        this.f8011i = -90.0f;
        this.f8009g = 0.0f;
        Paint paint = new Paint();
        this.f8004b = paint;
        paint.setAntiAlias(true);
        Paint paint2 = this.f8004b;
        AbstractC5830k.m5327d(paint2);
        paint2.setColor(this.f8014l);
        Paint paint3 = this.f8004b;
        AbstractC5830k.m5327d(paint3);
        Paint.Style style = Paint.Style.FILL;
        paint3.setStyle(style);
        Paint paint4 = new Paint();
        this.f8003a = paint4;
        paint4.setColor(this.f8018p);
        Paint paint5 = this.f8003a;
        AbstractC5830k.m5327d(paint5);
        paint5.setAntiAlias(true);
        Paint paint6 = this.f8003a;
        AbstractC5830k.m5327d(paint6);
        paint6.setStyle(style);
        Paint paint7 = this.f8003a;
        AbstractC5830k.m5327d(paint7);
        paint7.setTextSize(this.f8017o);
        Paint paint8 = this.f8003a;
        AbstractC5830k.m5327d(paint8);
        paint8.setTextAlign(Paint.Align.CENTER);
        Paint paint9 = new Paint();
        this.f8005c = paint9;
        paint9.setAntiAlias(true);
        Paint paint10 = this.f8005c;
        AbstractC5830k.m5327d(paint10);
        paint10.setColor(this.f8015m);
        Paint paint11 = this.f8005c;
        AbstractC5830k.m5327d(paint11);
        Paint.Style style2 = Paint.Style.STROKE;
        paint11.setStyle(style2);
        Paint paint12 = this.f8005c;
        AbstractC5830k.m5327d(paint12);
        float f = this.f8019q;
        paint12.setStrokeWidth(f);
        Paint paint13 = new Paint();
        this.f8006d = paint13;
        paint13.setAntiAlias(true);
        Paint paint14 = this.f8006d;
        AbstractC5830k.m5327d(paint14);
        paint14.setColor(this.f8016n);
        Paint paint15 = this.f8006d;
        AbstractC5830k.m5327d(paint15);
        paint15.setStyle(style2);
        Paint paint16 = this.f8006d;
        AbstractC5830k.m5327d(paint16);
        paint16.setStrokeWidth(f);
        Paint paint17 = this.f8003a;
        AbstractC5830k.m5327d(paint17);
        this.f8017o = (int) paint17.getTextSize();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        AbstractC5830k.m5330g(canvas, "canvas");
        super.onDraw(canvas);
        float f = this.f8007e;
        float f7 = this.f8008f;
        float f8 = this.f8013k;
        Paint paint = this.f8004b;
        AbstractC5830k.m5327d(paint);
        canvas.drawCircle(f, f7, f8, paint);
        Paint paint2 = this.f8003a;
        AbstractC5830k.m5327d(paint2);
        canvas.drawText(this.f8012j, this.f8007e, (this.f8017o / 2.0f) + this.f8008f, paint2);
        RectF rectF = this.f8020r;
        AbstractC5830k.m5327d(rectF);
        float f9 = this.f8011i;
        Paint paint3 = this.f8005c;
        AbstractC5830k.m5327d(paint3);
        canvas.drawArc(rectF, f9, 360.0f, false, paint3);
        RectF rectF2 = this.f8010h;
        AbstractC5830k.m5327d(rectF2);
        float f10 = this.f8011i;
        float f11 = this.f8009g;
        Paint paint4 = this.f8006d;
        AbstractC5830k.m5327d(paint4);
        canvas.drawArc(rectF2, f10, f11, false, paint4);
    }

    @Override // android.view.View
    public final void onLayout(boolean z8, int i, int i8, int i9, int i10) {
        super.onLayout(z8, i, i8, i9, i10);
        this.f8007e = getMeasuredWidth() / 2;
        this.f8008f = getMeasuredHeight() / 2;
        int i11 = this.f8013k;
        int i12 = this.f8007e;
        if (i11 > i12) {
            this.f8013k = i12;
        }
        int i13 = this.f8007e;
        int i14 = this.f8013k;
        int i15 = this.f8019q / 2;
        int i16 = this.f8008f;
        this.f8010h = new RectF((i13 - i14) + i15, (i16 - i14) + i15, (i13 + i14) - i15, (i16 + i14) - i15);
        int i17 = this.f8007e;
        int i18 = this.f8013k;
        int i19 = this.f8008f;
        this.f8020r = new RectF((i17 - i18) + i15, (i19 - i18) + i15, (i17 + i18) - i15, (i19 + i18) - i15);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i8) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != 1073741824) {
            int i9 = this.f8013k * 2;
            size = mode == Integer.MIN_VALUE ? Math.min(i9, size) : i9;
        }
        int mode2 = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i);
        if (mode2 != 1073741824) {
            int i10 = this.f8013k * 2;
            size2 = mode2 == Integer.MIN_VALUE ? Math.min(i10, size2) : i10;
        }
        setMeasuredDimension(size, size2);
    }

    public final void setTargetPercent(float progress) {
        this.f8012j = ((int) (100 * progress)) + "%";
        this.f8009g = progress * ((float) 360);
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PercentCircleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC5830k.m5330g(context, "context");
        this.f8012j = "0%";
        this.f8013k = 123;
        this.f8017o = 30;
        this.f8019q = 10;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PercentCircleView);
        AbstractC5830k.m5329f(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f8013k = typedArrayObtainStyledAttributes.getInt(R.styleable.PercentCircleView_radius, 123);
        this.f8014l = typedArrayObtainStyledAttributes.getColor(R.styleable.PercentCircleView_circleBackground, -1);
        this.f8018p = typedArrayObtainStyledAttributes.getColor(R.styleable.PercentCircleView_textColor, -1509949440);
        this.f8015m = typedArrayObtainStyledAttributes.getColor(R.styleable.PercentCircleView_ringColor, 15987699);
        this.f8016n = typedArrayObtainStyledAttributes.getColor(R.styleable.PercentCircleView_processColor, 2606746);
        typedArrayObtainStyledAttributes.recycle();
        m4444a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PercentCircleView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC5830k.m5330g(context, "context");
        this.f8012j = "0%";
        this.f8013k = 123;
        this.f8017o = 30;
        this.f8019q = 10;
        m4444a();
    }
}
