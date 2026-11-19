package com.jaredrummler.android.colorpicker;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.material3.AbstractC1923c;
import androidx.core.text.util.LocalePreferences;
import androidx.core.view.ViewCompat;
import p112m1.C6085a;
import p112m1.C6096l;
import p112m1.InterfaceC6097m;
import p185v7.AbstractC6675d;

/* loaded from: classes3.dex */
public class ColorPickerView extends View {

    /* renamed from: A */
    public Rect f3147A;

    /* renamed from: B */
    public Rect f3148B;

    /* renamed from: C */
    public Rect f3149C;

    /* renamed from: D */
    public Point f3150D;

    /* renamed from: E */
    public C6085a f3151E;

    /* renamed from: F */
    public InterfaceC6097m f3152F;

    /* renamed from: a */
    public final int f3153a;

    /* renamed from: b */
    public final int f3154b;

    /* renamed from: c */
    public final int f3155c;

    /* renamed from: d */
    public final int f3156d;

    /* renamed from: e */
    public final int f3157e;

    /* renamed from: f */
    public final int f3158f;

    /* renamed from: g */
    public final Paint f3159g;

    /* renamed from: h */
    public final Paint f3160h;

    /* renamed from: i */
    public final Paint f3161i;

    /* renamed from: j */
    public final Paint f3162j;

    /* renamed from: k */
    public final Paint f3163k;

    /* renamed from: l */
    public final Paint f3164l;

    /* renamed from: m */
    public LinearGradient f3165m;

    /* renamed from: n */
    public LinearGradient f3166n;

    /* renamed from: o */
    public C6096l f3167o;

    /* renamed from: p */
    public C6096l f3168p;

    /* renamed from: q */
    public int f3169q;

    /* renamed from: r */
    public float f3170r;

    /* renamed from: s */
    public float f3171s;

    /* renamed from: t */
    public float f3172t;

    /* renamed from: u */
    public boolean f3173u;

    /* renamed from: v */
    public String f3174v;

    /* renamed from: w */
    public int f3175w;

    /* renamed from: x */
    public int f3176x;

    /* renamed from: y */
    public final int f3177y;

    /* renamed from: z */
    public Rect f3178z;

    public ColorPickerView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        int iM6346h = AbstractC6675d.m6346h(getContext(), 200.0f);
        return this.f3173u ? this.f3155c + this.f3154b + iM6346h : iM6346h;
    }

    private int getPreferredWidth() {
        return AbstractC6675d.m6346h(getContext(), 200.0f) + this.f3153a + this.f3155c;
    }

    /* renamed from: a */
    public final boolean m2842a(MotionEvent motionEvent) {
        Point point = this.f3150D;
        if (point != null) {
            int i = point.x;
            int i8 = point.y;
            if (this.f3148B.contains(i, i8)) {
                float y2 = motionEvent.getY();
                Rect rect = this.f3148B;
                float fHeight = rect.height();
                float f = rect.top;
                this.f3170r = AbstractC1923c.m1036D(y2 >= f ? y2 > ((float) rect.bottom) ? fHeight : y2 - f : 0.0f, 360.0f, fHeight, 360.0f);
                return true;
            }
            if (this.f3147A.contains(i, i8)) {
                float x3 = motionEvent.getX();
                float y3 = motionEvent.getY();
                Rect rect2 = this.f3147A;
                float fWidth = rect2.width();
                float fHeight2 = rect2.height();
                float f7 = rect2.left;
                float f8 = x3 < f7 ? 0.0f : x3 > ((float) rect2.right) ? fWidth : x3 - f7;
                float f9 = rect2.top;
                float[] fArr = {(1.0f / fWidth) * f8, 1.0f - ((1.0f / fHeight2) * (y3 >= f9 ? y3 > ((float) rect2.bottom) ? fHeight2 : y3 - f9 : 0.0f))};
                this.f3171s = fArr[0];
                this.f3172t = fArr[1];
                return true;
            }
            Rect rect3 = this.f3149C;
            if (rect3 != null && rect3.contains(i, i8)) {
                int x8 = (int) motionEvent.getX();
                Rect rect4 = this.f3149C;
                int iWidth = rect4.width();
                int i9 = rect4.left;
                this.f3169q = 255 - (((x8 >= i9 ? x8 > rect4.right ? iWidth : x8 - i9 : 0) * 255) / iWidth);
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void m2843b(int i, boolean z8) {
        InterfaceC6097m interfaceC6097m;
        int iAlpha = Color.alpha(i);
        float[] fArr = new float[3];
        Color.RGBToHSV(Color.red(i), Color.green(i), Color.blue(i), fArr);
        this.f3169q = iAlpha;
        float f = fArr[0];
        this.f3170r = f;
        float f7 = fArr[1];
        this.f3171s = f7;
        float f8 = fArr[2];
        this.f3172t = f8;
        if (z8 && (interfaceC6097m = this.f3152F) != null) {
            ((ColorPickerDialog) interfaceC6097m).m2840j(Color.HSVToColor(iAlpha, new float[]{f, f7, f8}));
        }
        invalidate();
    }

    public String getAlphaSliderText() {
        return this.f3174v;
    }

    public int getBorderColor() {
        return this.f3176x;
    }

    public int getColor() {
        return Color.HSVToColor(this.f3169q, new float[]{this.f3170r, this.f3171s, this.f3172t});
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return Math.max(super.getPaddingBottom(), this.f3177y);
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return Math.max(super.getPaddingLeft(), this.f3177y);
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return Math.max(super.getPaddingRight(), this.f3177y);
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return Math.max(super.getPaddingTop(), this.f3177y);
    }

    public int getSliderTrackerColor() {
        return this.f3175w;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Rect rect;
        if (this.f3178z.width() <= 0 || this.f3178z.height() <= 0) {
            return;
        }
        Rect rect2 = this.f3147A;
        int i = this.f3176x;
        Paint paint = this.f3164l;
        paint.setColor(i);
        Rect rect3 = this.f3178z;
        boolean z8 = true;
        canvas.drawRect(rect3.left, rect3.top, rect2.right + 1, rect2.bottom + 1, this.f3164l);
        if (this.f3165m == null) {
            float f = rect2.left;
            this.f3165m = new LinearGradient(f, rect2.top, f, rect2.bottom, -1, ViewCompat.MEASURED_STATE_MASK, Shader.TileMode.CLAMP);
        }
        C6096l c6096l = this.f3167o;
        if (c6096l == null || c6096l.f9742c != this.f3170r) {
            if (c6096l == null) {
                this.f3167o = new C6096l();
            }
            C6096l c6096l2 = this.f3167o;
            if (c6096l2.f9741b == null) {
                c6096l2.f9741b = Bitmap.createBitmap(rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888);
            }
            C6096l c6096l3 = this.f3167o;
            if (c6096l3.f9740a == null) {
                c6096l3.f9740a = new Canvas(this.f3167o.f9741b);
            }
            int iHSVToColor = Color.HSVToColor(new float[]{this.f3170r, 1.0f, 1.0f});
            float f7 = rect2.left;
            float f8 = rect2.top;
            this.f3166n = new LinearGradient(f7, f8, rect2.right, f8, -1, iHSVToColor, Shader.TileMode.CLAMP);
            this.f3159g.setShader(new ComposeShader(this.f3165m, this.f3166n, PorterDuff.Mode.MULTIPLY));
            this.f3167o.f9740a.drawRect(0.0f, 0.0f, r2.f9741b.getWidth(), this.f3167o.f9741b.getHeight(), this.f3159g);
            this.f3167o.f9742c = this.f3170r;
        }
        canvas.drawBitmap(this.f3167o.f9741b, (Rect) null, rect2, (Paint) null);
        float f9 = this.f3171s;
        float f10 = this.f3172t;
        Rect rect4 = this.f3147A;
        float fHeight = rect4.height();
        float fWidth = rect4.width();
        Point point = new Point();
        point.x = (int) ((f9 * fWidth) + rect4.left);
        point.y = (int) (((1.0f - f10) * fHeight) + rect4.top);
        Paint paint2 = this.f3160h;
        paint2.setColor(ViewCompat.MEASURED_STATE_MASK);
        float f11 = point.x;
        float f12 = point.y;
        int iM6346h = AbstractC6675d.m6346h(getContext(), 1.0f);
        int i8 = this.f3156d;
        canvas.drawCircle(f11, f12, i8 - iM6346h, paint2);
        paint2.setColor(-2236963);
        canvas.drawCircle(point.x, point.y, i8, paint2);
        Rect rect5 = this.f3148B;
        paint.setColor(this.f3176x);
        canvas.drawRect(rect5.left - 1, rect5.top - 1, rect5.right + 1, rect5.bottom + 1, this.f3164l);
        if (this.f3168p == null) {
            C6096l c6096l4 = new C6096l();
            this.f3168p = c6096l4;
            c6096l4.f9741b = Bitmap.createBitmap(rect5.width(), rect5.height(), Bitmap.Config.ARGB_8888);
            this.f3168p.f9740a = new Canvas(this.f3168p.f9741b);
            int iHeight = (int) (rect5.height() + 0.5f);
            int[] iArr = new int[iHeight];
            float f13 = 360.0f;
            for (int i9 = 0; i9 < iHeight; i9++) {
                iArr[i9] = Color.HSVToColor(new float[]{f13, 1.0f, 1.0f});
                f13 -= 360.0f / iHeight;
            }
            Paint paint3 = new Paint();
            paint3.setStrokeWidth(0.0f);
            int i10 = 0;
            while (i10 < iHeight) {
                paint3.setColor(iArr[i10]);
                boolean z9 = z8;
                float f14 = i10;
                this.f3168p.f9740a.drawLine(0.0f, f14, r13.f9741b.getWidth(), f14, paint3);
                i10++;
                z8 = z9;
            }
        }
        boolean z10 = z8;
        canvas.drawBitmap(this.f3168p.f9741b, (Rect) null, rect5, (Paint) null);
        float f15 = this.f3170r;
        Rect rect6 = this.f3148B;
        float fHeight2 = rect6.height();
        Point point2 = new Point();
        point2.y = (int) (AbstractC1923c.m1036D(f15, fHeight2, 360.0f, fHeight2) + rect6.top);
        point2.x = rect6.left;
        RectF rectF = new RectF();
        int i11 = rect5.left;
        int i12 = this.f3157e;
        rectF.left = i11 - i12;
        rectF.right = rect5.right + i12;
        int i13 = point2.y;
        int i14 = this.f3158f;
        int i15 = i14 / 2;
        rectF.top = i13 - i15;
        rectF.bottom = i15 + i13;
        Paint paint4 = this.f3163k;
        canvas.drawRoundRect(rectF, 2.0f, 2.0f, paint4);
        if (!this.f3173u || (rect = this.f3149C) == null || this.f3151E == null) {
            return;
        }
        paint.setColor(this.f3176x);
        canvas.drawRect(rect.left - 1, rect.top - 1, rect.right + 1, rect.bottom + 1, this.f3164l);
        this.f3151E.draw(canvas);
        float f16 = this.f3170r;
        float f17 = this.f3171s;
        float f18 = this.f3172t;
        float[] fArr = new float[3];
        fArr[0] = f16;
        fArr[z10 ? 1 : 0] = f17;
        fArr[2] = f18;
        int iHSVToColor2 = Color.HSVToColor(fArr);
        int iHSVToColor3 = Color.HSVToColor(0, fArr);
        float f19 = rect.left;
        float f20 = rect.top;
        LinearGradient linearGradient = new LinearGradient(f19, f20, rect.right, f20, iHSVToColor2, iHSVToColor3, Shader.TileMode.CLAMP);
        Paint paint5 = this.f3161i;
        paint5.setShader(linearGradient);
        canvas.drawRect(rect, paint5);
        String str = this.f3174v;
        if (str != null && !str.equals("")) {
            canvas.drawText(this.f3174v, rect.centerX(), AbstractC6675d.m6346h(getContext(), 4.0f) + rect.centerY(), this.f3162j);
        }
        int i16 = this.f3169q;
        Rect rect7 = this.f3149C;
        float fWidth2 = rect7.width();
        Point point3 = new Point();
        point3.x = (int) (AbstractC1923c.m1036D(i16, fWidth2, 255.0f, fWidth2) + rect7.left);
        point3.y = rect7.top;
        RectF rectF2 = new RectF();
        int i17 = point3.x;
        int i18 = i14 / 2;
        rectF2.left = i17 - i18;
        rectF2.right = i18 + i17;
        rectF2.top = rect.top - i12;
        rectF2.bottom = rect.bottom + i12;
        canvas.drawRoundRect(rectF2, 2.0f, 2.0f, paint4);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0054 A[PHI: r1
      0x0054: PHI (r1v9 int) = (r1v3 int), (r1v12 int) binds: [B:38:0x0087, B:20:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r2 = r5.getPaddingLeft()
            int r6 = r6 - r2
            int r2 = r5.getPaddingRight()
            int r6 = r6 - r2
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            int r2 = r5.getPaddingBottom()
            int r7 = r7 - r2
            int r2 = r5.getPaddingTop()
            int r7 = r7 - r2
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r2) goto L5c
            if (r1 != r2) goto L2b
            goto L5c
        L2b:
            int r0 = r5.f3155c
            int r1 = r7 + r0
            int r2 = r5.f3153a
            int r1 = r1 + r2
            int r3 = r6 - r0
            int r3 = r3 - r2
            boolean r2 = r5.f3173u
            if (r2 == 0) goto L40
            int r2 = r5.f3154b
            int r4 = r0 + r2
            int r1 = r1 - r4
            int r0 = r0 + r2
            int r3 = r3 + r0
        L40:
            r0 = 1
            r2 = 0
            if (r1 > r6) goto L46
            r4 = r0
            goto L47
        L46:
            r4 = r2
        L47:
            if (r3 > r7) goto L4a
            goto L4b
        L4a:
            r0 = r2
        L4b:
            if (r4 == 0) goto L50
            if (r0 == 0) goto L50
            goto L5a
        L50:
            if (r0 != 0) goto L56
            if (r4 == 0) goto L56
        L54:
            r6 = r1
            goto L89
        L56:
            if (r4 != 0) goto L89
            if (r0 == 0) goto L89
        L5a:
            r7 = r3
            goto L89
        L5c:
            if (r0 != r2) goto L74
            if (r1 == r2) goto L74
            int r0 = r5.f3155c
            int r1 = r6 - r0
            int r2 = r5.f3153a
            int r1 = r1 - r2
            boolean r2 = r5.f3173u
            if (r2 == 0) goto L6f
            int r2 = r5.f3154b
            int r0 = r0 + r2
            int r1 = r1 + r0
        L6f:
            if (r1 <= r7) goto L72
            goto L89
        L72:
            r7 = r1
            goto L89
        L74:
            if (r1 != r2) goto L89
            if (r0 == r2) goto L89
            int r0 = r5.f3155c
            int r1 = r7 + r0
            int r2 = r5.f3153a
            int r1 = r1 + r2
            boolean r2 = r5.f3173u
            if (r2 == 0) goto L87
            int r2 = r5.f3154b
            int r0 = r0 + r2
            int r1 = r1 - r0
        L87:
            if (r1 <= r6) goto L54
        L89:
            int r0 = r5.getPaddingLeft()
            int r0 = r0 + r6
            int r6 = r5.getPaddingRight()
            int r6 = r6 + r0
            int r0 = r5.getPaddingTop()
            int r0 = r0 + r7
            int r7 = r5.getPaddingBottom()
            int r7 = r7 + r0
            r5.setMeasuredDimension(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jaredrummler.android.colorpicker.ColorPickerView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f3169q = bundle.getInt("alpha");
            this.f3170r = bundle.getFloat("hue");
            this.f3171s = bundle.getFloat(LocalePreferences.FirstDayOfWeek.SATURDAY);
            this.f3172t = bundle.getFloat("val");
            this.f3173u = bundle.getBoolean("show_alpha");
            this.f3174v = bundle.getString("alpha_text");
            parcelable = bundle.getParcelable("instanceState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("alpha", this.f3169q);
        bundle.putFloat("hue", this.f3170r);
        bundle.putFloat(LocalePreferences.FirstDayOfWeek.SATURDAY, this.f3171s);
        bundle.putFloat("val", this.f3172t);
        bundle.putBoolean("show_alpha", this.f3173u);
        bundle.putString("alpha_text", this.f3174v);
        return bundle;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i8, int i9, int i10) {
        super.onSizeChanged(i, i8, i9, i10);
        Rect rect = new Rect();
        this.f3178z = rect;
        rect.left = getPaddingLeft();
        this.f3178z.right = i - getPaddingRight();
        this.f3178z.top = getPaddingTop();
        this.f3178z.bottom = i8 - getPaddingBottom();
        this.f3165m = null;
        this.f3166n = null;
        this.f3167o = null;
        this.f3168p = null;
        Rect rect2 = this.f3178z;
        int i11 = rect2.left + 1;
        int i12 = rect2.top + 1;
        int i13 = rect2.bottom - 1;
        int i14 = rect2.right - 1;
        int i15 = this.f3155c;
        int i16 = (i14 - i15) - this.f3153a;
        if (this.f3173u) {
            i13 -= this.f3154b + i15;
        }
        this.f3147A = new Rect(i11, i12, i16, i13);
        Rect rect3 = this.f3178z;
        int i17 = rect3.right;
        this.f3148B = new Rect((i17 - this.f3153a) + 1, rect3.top + 1, i17 - 1, (rect3.bottom - 1) - (this.f3173u ? this.f3155c + this.f3154b : 0));
        if (this.f3173u) {
            Rect rect4 = this.f3178z;
            int i18 = rect4.left + 1;
            int i19 = rect4.bottom;
            this.f3149C = new Rect(i18, (i19 - this.f3154b) + 1, rect4.right - 1, i19 - 1);
            C6085a c6085a = new C6085a(AbstractC6675d.m6346h(getContext(), 4.0f));
            this.f3151E = c6085a;
            c6085a.setBounds(Math.round(this.f3149C.left), Math.round(this.f3149C.top), Math.round(this.f3149C.right), Math.round(this.f3149C.bottom));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM2842a;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f3150D = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
            zM2842a = m2842a(motionEvent);
        } else if (action != 1) {
            zM2842a = action != 2 ? false : m2842a(motionEvent);
        } else {
            this.f3150D = null;
            zM2842a = m2842a(motionEvent);
        }
        if (!zM2842a) {
            return super.onTouchEvent(motionEvent);
        }
        InterfaceC6097m interfaceC6097m = this.f3152F;
        if (interfaceC6097m != null) {
            ((ColorPickerDialog) interfaceC6097m).m2840j(Color.HSVToColor(this.f3169q, new float[]{this.f3170r, this.f3171s, this.f3172t}));
        }
        invalidate();
        return true;
    }

    public void setAlphaSliderText(int i) {
        setAlphaSliderText(getContext().getString(i));
    }

    public void setAlphaSliderVisible(boolean z8) {
        if (this.f3173u != z8) {
            this.f3173u = z8;
            this.f3165m = null;
            this.f3166n = null;
            this.f3168p = null;
            this.f3167o = null;
            requestLayout();
        }
    }

    public void setBorderColor(int i) {
        this.f3176x = i;
        invalidate();
    }

    public void setColor(int i) {
        m2843b(i, false);
    }

    public void setOnColorChangedListener(InterfaceC6097m interfaceC6097m) {
        this.f3152F = interfaceC6097m;
    }

    public void setSliderTrackerColor(int i) {
        this.f3175w = i;
        this.f3163k.setColor(i);
        invalidate();
    }

    public ColorPickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ColorPickerView(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        this.f3169q = 255;
        this.f3170r = 360.0f;
        this.f3171s = 0.0f;
        this.f3172t = 0.0f;
        this.f3173u = false;
        this.f3174v = null;
        this.f3175w = -4342339;
        this.f3176x = -9539986;
        this.f3150D = null;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ColorPickerView);
        this.f3173u = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPickerView_cpv_alphaChannelVisible, false);
        this.f3174v = typedArrayObtainStyledAttributes.getString(R$styleable.ColorPickerView_cpv_alphaChannelText);
        this.f3175w = typedArrayObtainStyledAttributes.getColor(R$styleable.ColorPickerView_cpv_sliderColor, -4342339);
        this.f3176x = typedArrayObtainStyledAttributes.getColor(R$styleable.ColorPickerView_cpv_borderColor, -9539986);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.textColorSecondary});
        if (this.f3176x == -9539986) {
            this.f3176x = typedArrayObtainStyledAttributes2.getColor(0, -9539986);
        }
        if (this.f3175w == -4342339) {
            this.f3175w = typedArrayObtainStyledAttributes2.getColor(0, -4342339);
        }
        typedArrayObtainStyledAttributes2.recycle();
        this.f3153a = AbstractC6675d.m6346h(getContext(), 30.0f);
        this.f3154b = AbstractC6675d.m6346h(getContext(), 20.0f);
        this.f3155c = AbstractC6675d.m6346h(getContext(), 10.0f);
        this.f3156d = AbstractC6675d.m6346h(getContext(), 5.0f);
        this.f3158f = AbstractC6675d.m6346h(getContext(), 4.0f);
        this.f3157e = AbstractC6675d.m6346h(getContext(), 2.0f);
        this.f3177y = getResources().getDimensionPixelSize(R$dimen.cpv_required_padding);
        this.f3159g = new Paint();
        this.f3160h = new Paint();
        this.f3163k = new Paint();
        this.f3161i = new Paint();
        this.f3162j = new Paint();
        this.f3164l = new Paint();
        Paint paint = this.f3160h;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.f3160h.setStrokeWidth(AbstractC6675d.m6346h(getContext(), 2.0f));
        this.f3160h.setAntiAlias(true);
        this.f3163k.setColor(this.f3175w);
        this.f3163k.setStyle(style);
        this.f3163k.setStrokeWidth(AbstractC6675d.m6346h(getContext(), 2.0f));
        this.f3163k.setAntiAlias(true);
        this.f3162j.setColor(-14935012);
        this.f3162j.setTextSize(AbstractC6675d.m6346h(getContext(), 14.0f));
        this.f3162j.setAntiAlias(true);
        this.f3162j.setTextAlign(Paint.Align.CENTER);
        this.f3162j.setFakeBoldText(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    public void setAlphaSliderText(String str) {
        this.f3174v = str;
        invalidate();
    }
}
