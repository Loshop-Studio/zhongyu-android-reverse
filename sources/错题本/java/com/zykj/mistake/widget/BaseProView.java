package com.zykj.mistake.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.support.v4.media.AbstractC0037f;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.camera.core.processing.util.GLUtils;
import androidx.core.view.InputDeviceCompat;
import com.zykj.mistake.R;
import java.text.DecimalFormat;

/* loaded from: classes3.dex */
public abstract class BaseProView extends View {

    /* renamed from: a */
    public int f8052a;

    /* renamed from: b */
    public int f8053b;

    /* renamed from: c */
    public int f8054c;

    /* renamed from: d */
    public int f8055d;

    /* renamed from: e */
    public int f8056e;

    /* renamed from: f */
    public String f8057f;

    /* renamed from: g */
    public int f8058g;

    /* renamed from: h */
    public int f8059h;

    /* renamed from: i */
    public int f8060i;

    /* renamed from: j */
    public int f8061j;

    /* renamed from: k */
    public boolean f8062k;

    /* renamed from: l */
    public int f8063l;

    /* renamed from: m */
    public int f8064m;

    /* renamed from: n */
    public Paint f8065n;

    /* renamed from: o */
    public Paint f8066o;

    /* renamed from: p */
    public Paint f8067p;

    /* renamed from: q */
    public Paint f8068q;

    /* renamed from: r */
    public Paint f8069r;

    /* renamed from: s */
    public double f8070s;

    /* renamed from: t */
    public double f8071t;

    /* renamed from: u */
    public int f8072u;

    public BaseProView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo4476a() {
    }

    /* renamed from: b */
    public abstract void mo4477b();

    /* renamed from: c */
    public final void m4478c() {
        String strM90o;
        StringBuilder sb = new StringBuilder();
        double d9 = (this.f8071t / this.f8070s) * 100.0d;
        String strM74C = "";
        if (this.f8060i == 0) {
            strM90o = AbstractC0037f.m90o(new StringBuilder(), "", (int) d9);
        } else {
            int i = 0;
            while (i < this.f8060i) {
                strM74C = i == 0 ? GLUtils.VERSION_UNKNOWN : AbstractC0037f.m74C(strM74C, "0");
                i++;
            }
            strM90o = new DecimalFormat(strM74C).format(d9);
        }
        this.f8057f = AbstractC0037f.m91p(sb, strM90o, "%");
        postInvalidate();
    }

    public int getLightColor() {
        return this.f8061j;
    }

    public Paint getLightPaint() {
        return this.f8068q;
    }

    public double getMaxProgress() {
        return this.f8070s;
    }

    public double getProgress() {
        return this.f8071t;
    }

    public Paint getProgressBgPaint() {
        return this.f8065n;
    }

    public int getProgressColor() {
        return this.f8056e;
    }

    public int getProgressColorBackground() {
        return this.f8055d;
    }

    public Paint getProgressPaint() {
        return this.f8066o;
    }

    public int getProgressSize() {
        return this.f8054c;
    }

    public int getStrokeColor() {
        return this.f8064m;
    }

    public Paint getStrokePaint() {
        return this.f8069r;
    }

    public int getStrokeWidth() {
        return this.f8063l;
    }

    public String getText() {
        return this.f8057f;
    }

    public int getTextColor() {
        return this.f8059h;
    }

    public int getTextDecimalNum() {
        return this.f8060i;
    }

    public Paint getTextPaint() {
        return this.f8067p;
    }

    public int getTextSize() {
        return this.f8058g;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i8, int i9, int i10) {
        super.onSizeChanged(i, i8, i9, i10);
        this.f8052a = i;
        this.f8053b = i8;
        if (this.f8054c == 0) {
            this.f8054c = i8;
        }
        int i11 = (i8 - this.f8054c) / 2;
        this.f8072u = i11;
        if (this.f8062k && i11 > 0) {
            BlurMaskFilter blurMaskFilter = new BlurMaskFilter(this.f8072u, BlurMaskFilter.Blur.SOLID);
            this.f8068q.setMaskFilter(new BlurMaskFilter(this.f8072u, BlurMaskFilter.Blur.OUTER));
            this.f8066o.setMaskFilter(blurMaskFilter);
            setLayerType(1, null);
        }
        mo4476a();
        mo4477b();
    }

    public void setLightColor(int i) {
        this.f8061j = i;
    }

    public void setLightPaint(Paint paint) {
        this.f8068q = paint;
    }

    public void setLightShow(boolean z8) {
        this.f8062k = z8;
    }

    public void setMaxProgress(double d9) {
        this.f8070s = d9;
        m4478c();
    }

    public void setOutGradient(@ColorInt int... iArr) {
        mo4479d(iArr);
    }

    public void setProgress(double d9) {
        this.f8071t = d9;
        m4478c();
    }

    public void setProgressBgPaint(Paint paint) {
        this.f8065n = paint;
    }

    public void setProgressColor(int i) {
        this.f8056e = i;
    }

    public void setProgressColorBackground(int i) {
        this.f8055d = i;
    }

    public void setProgressPaint(Paint paint) {
        this.f8066o = paint;
    }

    public void setProgressSize(int i) {
        this.f8054c = i;
    }

    public void setStrokeColor(int i) {
        this.f8064m = i;
    }

    public void setStrokePaint(Paint paint) {
        this.f8069r = paint;
    }

    public void setStrokeShow(boolean z8) {
    }

    public void setStrokeWidth(int i) {
        this.f8063l = i;
    }

    public void setText(String str) {
        this.f8057f = str;
    }

    public void setTextColor(int i) {
        this.f8059h = i;
    }

    public void setTextDecimalNum(int i) {
        this.f8060i = i;
    }

    public void setTextPaint(Paint paint) {
        this.f8067p = paint;
    }

    public void setTextShow(boolean z8) {
    }

    public void setTextSize(int i) {
        this.f8058g = i;
    }

    public BaseProView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BaseProView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8057f = "";
        this.f8065n = new Paint();
        this.f8066o = new Paint();
        this.f8067p = new Paint();
        this.f8068q = new Paint();
        this.f8069r = new Paint();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BaseProgressView);
        this.f8070s = typedArrayObtainStyledAttributes.getInteger(R.styleable.BaseProgressView_progress_max, 100);
        this.f8071t = typedArrayObtainStyledAttributes.getInteger(R.styleable.BaseProgressView_progress_value, 0);
        this.f8054c = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.BaseProgressView_progress_size, 0);
        this.f8055d = typedArrayObtainStyledAttributes.getColor(R.styleable.BaseProgressView_progress_color_background, -7829368);
        this.f8056e = typedArrayObtainStyledAttributes.getColor(R.styleable.BaseProgressView_progress_color, InputDeviceCompat.SOURCE_ANY);
        this.f8058g = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.BaseProgressView_text_size, (int) TypedValue.applyDimension(2, 10.0f, getResources().getDisplayMetrics()));
        this.f8059h = typedArrayObtainStyledAttributes.getColor(R.styleable.BaseProgressView_text_color, -1);
        typedArrayObtainStyledAttributes.getBoolean(R.styleable.BaseProgressView_text_show, false);
        this.f8060i = typedArrayObtainStyledAttributes.getInt(R.styleable.BaseProgressView_text_decimal_num, 0);
        this.f8061j = typedArrayObtainStyledAttributes.getColor(R.styleable.BaseProgressView_light_color, -1);
        this.f8062k = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BaseProgressView_light_show, false);
        this.f8064m = typedArrayObtainStyledAttributes.getColor(R.styleable.BaseProgressView_stroke_color, -1);
        this.f8063l = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.BaseProgressView_stroke_width, (int) TypedValue.applyDimension(1, 1.0f, getResources().getDisplayMetrics()));
        typedArrayObtainStyledAttributes.getBoolean(R.styleable.BaseProgressView_stroke_show, false);
        typedArrayObtainStyledAttributes.recycle();
        m4478c();
        this.f8065n.setAntiAlias(true);
        this.f8065n.setColor(this.f8055d);
        this.f8066o.setAntiAlias(true);
        this.f8066o.setColor(this.f8056e);
        this.f8067p.setAntiAlias(true);
        this.f8067p.setColor(this.f8059h);
        this.f8067p.setTextSize(this.f8058g);
        this.f8068q.setAntiAlias(true);
        this.f8068q.setColor(this.f8061j);
        this.f8069r.setStrokeWidth(this.f8063l);
        this.f8069r.setAntiAlias(true);
        this.f8069r.setColor(this.f8064m);
        this.f8069r.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: d */
    public void mo4479d(int... iArr) {
    }
}
