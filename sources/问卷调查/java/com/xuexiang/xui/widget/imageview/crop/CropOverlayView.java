package com.xuexiang.xui.widget.imageview.crop;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.util.TypedValue;
import android.view.View;
import io.github.inflationx.calligraphy3.C1088R;
import p000a.p031h.p033c.C0192a;
import p070b.p113c.p114a.C0787a;
import p070b.p113c.p114a.p116e.p128f.p129a.EnumC0811c;
import p070b.p113c.p114a.p116e.p128f.p129a.EnumC0813e;

/* loaded from: classes.dex */
public class CropOverlayView extends View {

    /* renamed from: w */
    public static final float f5197w;

    /* renamed from: x */
    public static final float f5198x;

    /* renamed from: b */
    public Paint f5199b;

    /* renamed from: c */
    public Paint f5200c;

    /* renamed from: d */
    public Paint f5201d;

    /* renamed from: e */
    public Paint f5202e;

    /* renamed from: f */
    public Rect f5203f;

    /* renamed from: g */
    public float f5204g;

    /* renamed from: h */
    public float f5205h;

    /* renamed from: i */
    public Pair<Float, Float> f5206i;

    /* renamed from: j */
    public EnumC0813e f5207j;

    /* renamed from: k */
    public boolean f5208k;

    /* renamed from: l */
    public int f5209l;

    /* renamed from: m */
    public int f5210m;

    /* renamed from: n */
    public float f5211n;

    /* renamed from: o */
    public int f5212o;

    /* renamed from: p */
    public boolean f5213p;

    /* renamed from: q */
    public float f5214q;

    /* renamed from: r */
    public float f5215r;

    /* renamed from: s */
    public float f5216s;

    /* renamed from: t */
    public Bitmap f5217t;

    /* renamed from: u */
    public int f5218u;

    /* renamed from: v */
    public int f5219v;

    static {
        float f2 = (5.0f / 2.0f) - (3.0f / 2.0f);
        f5197w = f2;
        f5198x = (5.0f / 2.0f) + f2;
    }

    public CropOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5208k = false;
        this.f5209l = 1;
        this.f5210m = 1;
        float f2 = 1;
        this.f5211n = f2 / f2;
        this.f5213p = false;
        this.f5217t = null;
        this.f5218u = 0;
        this.f5219v = 0;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f5204g = TypedValue.applyDimension(1, 24.0f, context.getResources().getDisplayMetrics());
        this.f5205h = TypedValue.applyDimension(1, 6.0f, displayMetrics);
        float fApplyDimension = TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics());
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#AAFFFFFF"));
        paint.setStrokeWidth(fApplyDimension);
        paint.setStyle(Paint.Style.STROKE);
        this.f5199b = paint;
        Paint paint2 = new Paint();
        paint2.setColor(Color.parseColor("#AAFFFFFF"));
        paint2.setStrokeWidth(1.0f);
        this.f5200c = paint2;
        Paint paint3 = new Paint();
        paint3.setColor(Color.parseColor("#B0000000"));
        this.f5202e = paint3;
        float fApplyDimension2 = TypedValue.applyDimension(1, 5.0f, context.getResources().getDisplayMetrics());
        Paint paint4 = new Paint();
        Object obj = C0192a.f1425a;
        paint4.setColor(C0787a.m2462B(context, C1088R.attr.colorAccent, C0192a.d.m741a(context, C1088R.color.xui_config_color_main_theme)));
        paint4.setStrokeWidth(fApplyDimension2);
        paint4.setStyle(Paint.Style.STROKE);
        this.f5201d = paint4;
        this.f5215r = TypedValue.applyDimension(1, f5197w, displayMetrics);
        this.f5214q = TypedValue.applyDimension(1, f5198x, displayMetrics);
        this.f5216s = TypedValue.applyDimension(1, 20.0f, displayMetrics);
        this.f5212o = 1;
    }

    /* renamed from: e */
    public static boolean m2754e() {
        return Math.abs(EnumC0811c.LEFT.f4530b - EnumC0811c.RIGHT.f4530b) >= 100.0f && Math.abs(EnumC0811c.TOP.f4530b - EnumC0811c.BOTTOM.f4530b) >= 100.0f;
    }

    /* renamed from: a */
    public final void m2755a(Canvas canvas) {
        float f2 = 0;
        float fWidth = f2 / this.f5203f.width();
        EnumC0811c enumC0811c = EnumC0811c.RIGHT;
        float f3 = enumC0811c.f4530b;
        EnumC0811c enumC0811c2 = EnumC0811c.LEFT;
        int i = (int) ((f3 - enumC0811c2.f4530b) * fWidth);
        EnumC0811c enumC0811c3 = EnumC0811c.BOTTOM;
        float f4 = enumC0811c3.f4530b;
        EnumC0811c enumC0811c4 = EnumC0811c.TOP;
        int iHeight = (int) ((f4 - enumC0811c4.f4530b) * (f2 / this.f5203f.height()));
        this.f5199b.setStrokeWidth(0.0f);
        this.f5199b.setTextAlign(Paint.Align.CENTER);
        this.f5199b.setTextSize(25.0f);
        canvas.drawText(i + "x" + iHeight, (enumC0811c.f4530b / 2.0f) + (enumC0811c2.f4530b / 2.0f), (enumC0811c3.f4530b / 2.0f) + (enumC0811c4.f4530b / 2.0f), this.f5199b);
    }

    /* renamed from: b */
    public final void m2756b(Canvas canvas) {
        float f2 = EnumC0811c.LEFT.f4530b;
        EnumC0811c enumC0811c = EnumC0811c.TOP;
        float f3 = enumC0811c.f4530b;
        float f4 = EnumC0811c.RIGHT.f4530b;
        EnumC0811c enumC0811c2 = EnumC0811c.BOTTOM;
        float f5 = enumC0811c2.f4530b;
        float f6 = (f4 - f2) / 3.0f;
        float f7 = f2 + f6;
        canvas.drawLine(f7, f3, f7, f5, this.f5200c);
        float f8 = f4 - f6;
        canvas.drawLine(f8, f3, f8, f5, this.f5200c);
        float f9 = (enumC0811c2.f4530b - enumC0811c.f4530b) / 3.0f;
        float f10 = f3 + f9;
        canvas.drawLine(f2, f10, f4, f10, this.f5200c);
        float f11 = f5 - f9;
        canvas.drawLine(f2, f11, f4, f11, this.f5200c);
    }

    /* renamed from: c */
    public final void m2757c(Rect rect) {
        float f2;
        EnumC0811c enumC0811c = EnumC0811c.BOTTOM;
        EnumC0811c enumC0811c2 = EnumC0811c.RIGHT;
        EnumC0811c enumC0811c3 = EnumC0811c.TOP;
        EnumC0811c enumC0811c4 = EnumC0811c.LEFT;
        if (!this.f5213p) {
            this.f5213p = true;
        }
        if (!this.f5208k) {
            float fWidth = rect.width() * 0.1f;
            float fHeight = rect.height() * 0.1f;
            enumC0811c4.f4530b = rect.left + fWidth;
            enumC0811c3.f4530b = rect.top + fHeight;
            enumC0811c2.f4530b = rect.right - fWidth;
            f2 = rect.bottom - fHeight;
        } else {
            if (rect.width() / rect.height() > this.f5211n) {
                enumC0811c3.f4530b = rect.top;
                enumC0811c.f4530b = rect.bottom;
                float width = getWidth() / 2.0f;
                float fMax = Math.max(40.0f, (enumC0811c.f4530b - enumC0811c3.f4530b) * this.f5211n);
                if (fMax == 40.0f) {
                    this.f5211n = 40.0f / (enumC0811c.f4530b - enumC0811c3.f4530b);
                }
                float f3 = fMax / 2.0f;
                enumC0811c4.f4530b = width - f3;
                enumC0811c2.f4530b = width + f3;
                return;
            }
            enumC0811c4.f4530b = rect.left;
            enumC0811c2.f4530b = rect.right;
            float height = getHeight() / 2.0f;
            float fMax2 = Math.max(40.0f, (enumC0811c2.f4530b - enumC0811c4.f4530b) / this.f5211n);
            if (fMax2 == 40.0f) {
                float f4 = enumC0811c2.f4530b - enumC0811c4.f4530b;
                if (f4 > 0.0f) {
                    this.f5211n = f4 / 40.0f;
                }
            }
            float f5 = fMax2 / 2.0f;
            enumC0811c3.f4530b = height - f5;
            f2 = height + f5;
        }
        enumC0811c.f4530b = f2;
    }

    /* renamed from: d */
    public void m2758d() {
        if (this.f5213p) {
            m2757c(this.f5203f);
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        Rect rect = this.f5203f;
        EnumC0811c enumC0811c = EnumC0811c.LEFT;
        float f2 = enumC0811c.f4530b;
        EnumC0811c enumC0811c2 = EnumC0811c.TOP;
        float f3 = enumC0811c2.f4530b;
        EnumC0811c enumC0811c3 = EnumC0811c.RIGHT;
        float f4 = enumC0811c3.f4530b;
        EnumC0811c enumC0811c4 = EnumC0811c.BOTTOM;
        float f5 = enumC0811c4.f4530b;
        canvas.drawRect(rect.left, rect.top, rect.right, f3, this.f5202e);
        canvas.drawRect(rect.left, f5, rect.right, rect.bottom, this.f5202e);
        canvas.drawRect(rect.left, f3, f2, f5, this.f5202e);
        canvas.drawRect(f4, f3, rect.right, f5, this.f5202e);
        if (m2754e() && ((i = this.f5212o) == 2 || (i == 1 && this.f5207j != null))) {
            m2756b(canvas);
            m2755a(canvas);
        }
        canvas.drawRect(enumC0811c.f4530b, enumC0811c2.f4530b, enumC0811c3.f4530b, enumC0811c4.f4530b, this.f5199b);
        float f6 = enumC0811c.f4530b;
        float f7 = enumC0811c2.f4530b;
        float f8 = enumC0811c3.f4530b;
        float f9 = enumC0811c4.f4530b;
        Bitmap bitmap = this.f5217t;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, f6 - (this.f5218u / 2.0f), f7 - (this.f5219v / 2.0f), (Paint) null);
            canvas.drawBitmap(this.f5217t, f8 - (this.f5218u / 2.0f), f7 - (this.f5219v / 2.0f), (Paint) null);
            canvas.drawBitmap(this.f5217t, f6 - (this.f5218u / 2.0f), f9 - (this.f5219v / 2.0f), (Paint) null);
            canvas.drawBitmap(this.f5217t, f8 - (this.f5218u / 2.0f), f9 - (this.f5219v / 2.0f), (Paint) null);
            return;
        }
        float f10 = f6 - this.f5215r;
        canvas.drawLine(f10, f7 - this.f5214q, f10, f7 + this.f5216s, this.f5201d);
        float f11 = f7 - this.f5215r;
        canvas.drawLine(f6, f11, f6 + this.f5216s, f11, this.f5201d);
        float f12 = f8 + this.f5215r;
        canvas.drawLine(f12, f7 - this.f5214q, f12, f7 + this.f5216s, this.f5201d);
        float f13 = f7 - this.f5215r;
        canvas.drawLine(f8, f13, f8 - this.f5216s, f13, this.f5201d);
        float f14 = f6 - this.f5215r;
        canvas.drawLine(f14, this.f5214q + f9, f14, f9 - this.f5216s, this.f5201d);
        float f15 = f9 + this.f5215r;
        canvas.drawLine(f6, f15, f6 + this.f5216s, f15, this.f5201d);
        float f16 = f8 + this.f5215r;
        canvas.drawLine(f16, this.f5214q + f9, f16, f9 - this.f5216s, this.f5201d);
        float f17 = f9 + this.f5215r;
        canvas.drawLine(f8, f17, f8 - this.f5216s, f17, this.f5201d);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        m2757c(this.f5203f);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.imageview.crop.CropOverlayView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAspectRatioX(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        this.f5209l = i;
        this.f5211n = i / this.f5210m;
        m2758d();
    }

    public void setAspectRatioY(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        this.f5210m = i;
        this.f5211n = this.f5209l / i;
        m2758d();
    }

    public void setBitmapRect(Rect rect) {
        this.f5203f = rect;
        m2757c(rect);
    }

    public void setBorderAndGuidelineColor(int i) {
        this.f5199b.setColor(i);
        this.f5200c.setColor(i);
        m2758d();
    }

    public void setBorderColor(int i) {
        this.f5199b.setColor(i);
        m2758d();
    }

    public void setBorderWidth(float f2) {
        this.f5199b.setStrokeWidth(f2);
        m2758d();
    }

    public void setCornerColor(int i) {
        this.f5201d.setColor(i);
        m2758d();
    }

    public void setCornerWidth(float f2) {
        this.f5201d.setStrokeWidth(f2);
        m2758d();
    }

    public void setCropOverlayCornerBitmap(Bitmap bitmap) {
        this.f5217t = bitmap;
        if (bitmap != null) {
            this.f5218u = bitmap.getWidth();
            this.f5219v = this.f5217t.getHeight();
        }
    }

    public void setFixedAspectRatio(boolean z) {
        this.f5208k = z;
        m2758d();
    }

    public void setGuidelineColor(int i) {
        this.f5200c.setColor(i);
        m2758d();
    }

    public void setGuidelineWidth(float f2) {
        this.f5200c.setStrokeWidth(f2);
        m2758d();
    }

    public void setGuidelines(int i) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException("Guideline value must be set between 0 and 2. See documentation.");
        }
        this.f5212o = i;
        m2758d();
    }
}
