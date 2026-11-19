package com.zykj.subscriber.update;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import p018c2.C1083v;

/* loaded from: classes.dex */
public class PercentCircleView extends View {

    /* renamed from: a */
    private Paint f9933a;

    /* renamed from: b */
    private Paint f9934b;

    /* renamed from: c */
    private Paint f9935c;

    /* renamed from: d */
    private Paint f9936d;

    /* renamed from: e */
    private int f9937e;

    /* renamed from: f */
    private int f9938f;

    /* renamed from: g */
    private float f9939g;

    /* renamed from: h */
    private RectF f9940h;

    /* renamed from: i */
    private float f9941i;

    /* renamed from: j */
    private int f9942j;

    /* renamed from: k */
    private String f9943k;

    /* renamed from: l */
    private int f9944l;

    /* renamed from: m */
    private int f9945m;

    /* renamed from: n */
    private int f9946n;

    /* renamed from: o */
    private int f9947o;

    /* renamed from: p */
    private int f9948p;

    /* renamed from: q */
    private int f9949q;

    /* renamed from: r */
    private int f9950r;

    /* renamed from: s */
    private int f9951s;

    /* renamed from: t */
    private int f9952t;

    /* renamed from: u */
    private int f9953u;

    /* renamed from: v */
    private int f9954v;

    /* renamed from: w */
    private RectF f9955w;

    public PercentCircleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9939g = IGoodView.DEFAULT_TO_ALPHA;
        this.f9942j = 123;
        this.f9943k = "0%";
        this.f9944l = 123;
        this.f9945m = -1;
        this.f9947o = 15987699;
        this.f9949q = 2606746;
        this.f9951s = 30;
        this.f9952t = -1509949440;
        this.f9954v = 10;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1083v.f6492x1);
        this.f9944l = typedArrayObtainStyledAttributes.getInt(2, this.f9942j);
        this.f9946n = typedArrayObtainStyledAttributes.getColor(0, this.f9945m);
        this.f9953u = typedArrayObtainStyledAttributes.getColor(4, this.f9952t);
        this.f9948p = typedArrayObtainStyledAttributes.getColor(3, this.f9947o);
        this.f9950r = typedArrayObtainStyledAttributes.getColor(1, this.f9949q);
        typedArrayObtainStyledAttributes.recycle();
        m8139a();
    }

    /* renamed from: a */
    private void m8139a() {
        this.f9941i = -90.0f;
        this.f9939g = IGoodView.DEFAULT_TO_ALPHA;
        Paint paint = new Paint();
        this.f9934b = paint;
        paint.setAntiAlias(true);
        this.f9934b.setColor(this.f9946n);
        this.f9934b.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f9933a = paint2;
        paint2.setColor(this.f9953u);
        this.f9933a.setAntiAlias(true);
        this.f9933a.setStyle(Paint.Style.FILL);
        this.f9933a.setTextSize(this.f9951s);
        this.f9933a.setTextAlign(Paint.Align.CENTER);
        Paint paint3 = new Paint();
        this.f9935c = paint3;
        paint3.setAntiAlias(true);
        this.f9935c.setColor(this.f9948p);
        this.f9935c.setStyle(Paint.Style.STROKE);
        this.f9935c.setStrokeWidth(this.f9954v);
        Paint paint4 = new Paint();
        this.f9936d = paint4;
        paint4.setAntiAlias(true);
        this.f9936d.setColor(this.f9950r);
        this.f9936d.setStyle(Paint.Style.STROKE);
        this.f9936d.setStrokeWidth(this.f9954v);
        this.f9951s = (int) this.f9933a.getTextSize();
    }

    /* renamed from: b */
    private int m8140b(int i4) {
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (mode == 1073741824) {
            return size;
        }
        int i5 = this.f9944l * 2;
        return mode == Integer.MIN_VALUE ? Math.min(i5, size) : i5;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.f9937e, this.f9938f, this.f9944l, this.f9934b);
        canvas.drawText(String.valueOf(this.f9943k), this.f9937e, this.f9938f + (this.f9951s / 2.0f), this.f9933a);
        canvas.drawArc(this.f9955w, this.f9941i, 360.0f, false, this.f9935c);
        canvas.drawArc(this.f9940h, this.f9941i, this.f9939g, false, this.f9936d);
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        this.f9937e = getMeasuredWidth() / 2;
        this.f9938f = getMeasuredHeight() / 2;
        int i8 = this.f9944l;
        int i9 = this.f9937e;
        if (i8 > i9) {
            this.f9944l = i9;
        }
        int i10 = this.f9937e;
        int i11 = this.f9944l;
        int i12 = this.f9954v;
        int i13 = this.f9938f;
        this.f9940h = new RectF((i10 - i11) + (i12 / 2.0f), (i13 - i11) + (i12 / 2.0f), (i10 + i11) - (i12 / 2.0f), (i13 + i11) - (i12 / 2.0f));
        int i14 = this.f9937e;
        int i15 = this.f9944l;
        int i16 = this.f9954v;
        int i17 = this.f9938f;
        this.f9955w = new RectF((i14 - i15) + (i16 / 2.0f), (i17 - i15) + (i16 / 2.0f), (i14 + i15) - (i16 / 2.0f), (i17 + i15) - (i16 / 2.0f));
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        setMeasuredDimension(m8140b(i4), m8140b(i4));
    }

    public void setTargetPercent(float f4) {
        this.f9943k = ((int) (100.0f * f4)) + "%";
        this.f9939g = f4 * 360.0f;
        invalidate();
    }

    public PercentCircleView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f9939g = IGoodView.DEFAULT_TO_ALPHA;
        this.f9942j = 123;
        this.f9943k = "0%";
        this.f9944l = 123;
        this.f9945m = -1;
        this.f9947o = 15987699;
        this.f9949q = 2606746;
        this.f9951s = 30;
        this.f9952t = -1509949440;
        this.f9954v = 10;
        m8139a();
    }
}
