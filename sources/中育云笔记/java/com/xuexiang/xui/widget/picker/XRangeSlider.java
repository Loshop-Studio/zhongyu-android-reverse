package com.xuexiang.xui.widget.picker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$color;
import com.xuexiang.xui.R$drawable;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC8037c;
import com.xuexiang.xui.utils.AbstractC8040f;
import com.xuexiang.xui.utils.AbstractC8041g;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public class XRangeSlider extends View {

    /* renamed from: T */
    public static int f16471T;

    /* renamed from: U */
    public static int f16472U;

    /* renamed from: A */
    public float f16473A;

    /* renamed from: B */
    public int f16474B;

    /* renamed from: C */
    public int f16475C;

    /* renamed from: D */
    public Bitmap f16476D;

    /* renamed from: E */
    public Bitmap f16477E;

    /* renamed from: F */
    public boolean f16478F;

    /* renamed from: G */
    public boolean f16479G;

    /* renamed from: H */
    public Bitmap f16480H;

    /* renamed from: I */
    public int f16481I;

    /* renamed from: J */
    public float f16482J;

    /* renamed from: K */
    public float f16483K;

    /* renamed from: L */
    public boolean f16484L;

    /* renamed from: M */
    public int f16485M;

    /* renamed from: N */
    public int f16486N;

    /* renamed from: O */
    public float f16487O;

    /* renamed from: P */
    public float f16488P;

    /* renamed from: Q */
    public float f16489Q;

    /* renamed from: R */
    public float f16490R;

    /* renamed from: S */
    public int f16491S;

    /* renamed from: c */
    public final Paint f16492c;

    /* renamed from: d */
    public int f16493d;

    /* renamed from: e */
    public int f16494e;

    /* renamed from: f */
    public int f16495f;

    /* renamed from: g */
    public int f16496g;

    /* renamed from: h */
    public int f16497h;

    /* renamed from: i */
    public int f16498i;

    /* renamed from: j */
    public float f16499j;

    /* renamed from: k */
    public int f16500k;

    /* renamed from: l */
    public boolean f16501l;

    /* renamed from: m */
    public boolean f16502m;

    /* renamed from: n */
    public int f16503n;

    /* renamed from: o */
    public int f16504o;

    /* renamed from: p */
    public boolean f16505p;

    /* renamed from: q */
    public boolean f16506q;

    /* renamed from: r */
    public Rect f16507r;

    /* renamed from: s */
    public Rect f16508s;

    /* renamed from: t */
    public Rect f16509t;

    /* renamed from: u */
    public Set f16510u;

    /* renamed from: v */
    public Set f16511v;

    /* renamed from: w */
    public int f16512w;

    /* renamed from: x */
    public int f16513x;

    /* renamed from: y */
    public int f16514y;

    /* renamed from: z */
    public float f16515z;

    /* renamed from: com.xuexiang.xui.widget.picker.XRangeSlider$a */
    public interface InterfaceC8182a {
    }

    public XRangeSlider(Context context) {
        this(context, null);
    }

    private int getMaxTextLength() {
        m12993m(String.valueOf(this.f16475C), this.f16508s);
        return this.f16508s.width();
    }

    private int getMinTextLength() {
        m12993m(String.valueOf(this.f16474B), this.f16507r);
        return this.f16507r.width();
    }

    private void setSelectedMax(int i10) {
        this.f16497h = Math.round(((i10 - this.f16474B) / this.f16499j) + this.f16493d);
        m12982b();
    }

    private void setSelectedMin(int i10) {
        this.f16496g = Math.round(((i10 - this.f16474B) / this.f16499j) + this.f16493d);
        m12983c();
    }

    /* renamed from: a */
    public final void m12981a() {
        this.f16499j = this.f16498i / this.f16495f;
    }

    /* renamed from: b */
    public final void m12982b() {
    }

    /* renamed from: c */
    public final void m12983c() {
    }

    /* renamed from: d */
    public final boolean m12984d(int i10, MotionEvent motionEvent) {
        if (!m12995o(i10, motionEvent)) {
            return false;
        }
        this.f16501l = false;
        this.f16511v.add(Integer.valueOf(motionEvent.getPointerId(i10)));
        return true;
    }

    /* renamed from: e */
    public final boolean m12985e(int i10, MotionEvent motionEvent) {
        if (!m12996p(i10, motionEvent)) {
            return false;
        }
        this.f16501l = true;
        this.f16510u.add(Integer.valueOf(motionEvent.getPointerId(i10)));
        return true;
    }

    /* renamed from: f */
    public final Number m12986f(Number number, Number number2, Number number3) {
        return number.doubleValue() > number3.doubleValue() ? number3 : number.doubleValue() < number2.doubleValue() ? number2 : number;
    }

    /* renamed from: g */
    public final void m12987g(Canvas canvas) {
        this.f16492c.setColor(this.f16514y);
        this.f16492c.setStrokeWidth(this.f16473A);
        float f10 = this.f16493d;
        int i10 = this.f16500k;
        canvas.drawLine(f10, i10, this.f16494e, i10, this.f16492c);
        if (this.f16478F) {
            canvas.drawCircle(this.f16493d, this.f16500k, this.f16473A / 2.0f, this.f16492c);
            canvas.drawCircle(this.f16494e, this.f16500k, this.f16473A / 2.0f, this.f16492c);
        }
    }

    public int getMax() {
        return this.f16475C;
    }

    public int getMin() {
        return this.f16474B;
    }

    public int getSelectedMax() {
        return Math.round(((this.f16497h - this.f16493d) * this.f16499j) + this.f16474B);
    }

    public int getSelectedMin() {
        return Math.round(((this.f16496g - this.f16493d) * this.f16499j) + this.f16474B);
    }

    /* renamed from: h */
    public final void m12988h(Canvas canvas) {
        float height;
        Canvas canvas2 = canvas;
        if (this.f16484L) {
            float f10 = this.f16493d;
            int i10 = this.f16491S;
            float f11 = this.f16495f;
            int i11 = this.f16475C;
            float f12 = (f11 / ((i11 - r7) / (i10 / 10))) / (i10 / 10);
            boolean z10 = false;
            boolean z11 = false;
            for (int i12 = this.f16474B; i12 <= this.f16475C; i12++) {
                int i13 = this.f16491S;
                if (i12 % i13 == 0) {
                    height = this.f16500k + (this.f16476D.getHeight() / 2.0f) + this.f16488P;
                    float f13 = height + (this.f16489Q * 3.0f);
                    this.f16492c.setColor(this.f16486N);
                    this.f16492c.setTextSize(this.f16487O);
                    m12992l(String.valueOf(i12), this.f16509t);
                    canvas2.drawText(String.valueOf(i12), f10 - (this.f16509t.width() / 2.0f), this.f16509t.height() + f13 + this.f16490R, this.f16492c);
                    if (i12 == this.f16474B) {
                        z10 = true;
                    }
                    if (i12 == this.f16475C) {
                        z11 = true;
                    }
                    this.f16492c.setStrokeWidth(1.7f);
                    this.f16492c.setColor(this.f16485M);
                    canvas2.drawLine(f10, height, f10, f13, this.f16492c);
                } else {
                    if (i12 % (i13 / 2) == 0) {
                        height = this.f16488P + this.f16500k + (this.f16476D.getHeight() / 2.0f);
                        float f14 = height + (this.f16489Q * 2.0f);
                        this.f16492c.setStrokeWidth(1.2f);
                        this.f16492c.setColor(this.f16485M);
                        canvas2 = canvas;
                        canvas2.drawLine(f10, height, f10, f14, this.f16492c);
                    } else {
                        height = this.f16488P + this.f16500k + (this.f16476D.getHeight() / 2.0f);
                        float f15 = height + this.f16489Q;
                        this.f16492c.setStrokeWidth(1.0f);
                        if (i12 % (this.f16491S / 10) == 0) {
                            this.f16492c.setColor(this.f16485M);
                            canvas2 = canvas;
                            canvas2.drawLine(f10, height, f10, f15, this.f16492c);
                        }
                    }
                    if ((i12 != this.f16475C && !z11) || (i12 == this.f16474B && !z10)) {
                        this.f16492c.setColor(this.f16486N);
                        this.f16492c.setTextSize(this.f16487O);
                        m12992l(String.valueOf(i12), this.f16509t);
                        float fWidth = f10 - (this.f16509t.width() / 2.0f);
                        if (i12 == this.f16475C && i12 % this.f16491S == 1) {
                            fWidth = f16472U + f10;
                        }
                        if (i12 == this.f16474B) {
                            int i14 = this.f16491S;
                            if (i12 % i14 == i14 - 1) {
                                fWidth = (f10 - (this.f16509t.width() / 2.0f)) - f16472U;
                            }
                        }
                        canvas2.drawText(String.valueOf(i12), fWidth, height + (this.f16489Q * 3.0f) + this.f16509t.height() + this.f16490R, this.f16492c);
                    }
                    f10 += f12;
                }
                canvas2 = canvas;
                if (i12 != this.f16475C) {
                }
                f10 += f12;
            }
        }
    }

    /* renamed from: i */
    public final void m12989i(Canvas canvas) {
        float height;
        String strValueOf = String.valueOf(getSelectedMin());
        String strValueOf2 = String.valueOf(getSelectedMax());
        m12993m(strValueOf, this.f16507r);
        m12993m(strValueOf2, this.f16508s);
        float width = this.f16496g - (this.f16480H.getWidth() / 2.0f);
        float width2 = this.f16497h - (this.f16480H.getWidth() / 2.0f);
        int width3 = this.f16480H.getWidth() + 5;
        if (this.f16506q && this.f16511v.size() > 0) {
            float f10 = width3;
            if (Math.abs(width2 - width) <= f10) {
                width2 = width + f10;
                int i10 = this.f16494e;
                float f11 = f10 / 2.0f;
                if (width2 > i10 - f11) {
                    width2 = i10 - f11;
                }
            }
        }
        if (this.f16506q && this.f16510u.size() > 0) {
            float f12 = width3;
            if (Math.abs(width2 - width) <= f12) {
                width = width2 - f12;
                int i11 = this.f16493d;
                if (width < i11) {
                    width = i11;
                }
            }
        }
        float f13 = width3;
        if (Math.abs(width2 - width) <= f13) {
            if (this.f16502m) {
                width = width2 - f13;
                int i12 = this.f16493d;
                float f14 = f13 / 2.0f;
                if (width < i12 + f14) {
                    width = i12 + f14;
                    width2 = width + f13;
                }
            } else {
                width2 = width + f13;
                int i13 = this.f16494e;
                float f15 = f13 / 2.0f;
                if (width2 > i13 - f15) {
                    width2 = i13 - f15;
                    width = width2 - f13;
                }
            }
        }
        if (this.f16479G) {
            float height2 = ((this.f16500k - (this.f16476D.getHeight() / 2.0f)) - this.f16480H.getHeight()) - this.f16483K;
            height = (((this.f16480H.getHeight() / 2.0f) + height2) + (this.f16507r.height() / 2.0f)) - 6.0f;
            canvas.drawBitmap(this.f16480H, width2, height2, this.f16492c);
            canvas.drawBitmap(this.f16480H, width, height2, this.f16492c);
        } else {
            height = (this.f16500k - (this.f16476D.getHeight() / 2.0f)) - this.f16483K;
        }
        float fWidth = this.f16496g - (this.f16507r.width() / 2.0f);
        float fWidth2 = (this.f16497h - (this.f16508s.width() / 2.0f)) - 6.0f;
        int width4 = this.f16479G ? this.f16480H.getWidth() : getMaxTextLength() + 5;
        if (this.f16506q && this.f16511v.size() > 0) {
            float f16 = width4;
            if (Math.abs(fWidth2 - fWidth) <= f16) {
                fWidth2 = fWidth + f16;
                int i14 = this.f16494e;
                float f17 = f16 / 2.0f;
                if (fWidth2 > i14 - f17) {
                    fWidth2 = i14 - f17;
                }
            }
        }
        if (this.f16506q && this.f16510u.size() > 0) {
            float f18 = width4;
            if (Math.abs(fWidth2 - fWidth) <= f18) {
                fWidth = fWidth2 - f18;
                int i15 = this.f16493d;
                if (fWidth < i15) {
                    fWidth = i15;
                }
            }
        }
        float f19 = width4;
        if (Math.abs(fWidth2 - fWidth) <= f19) {
            if (this.f16502m) {
                fWidth = fWidth2 - f19;
                int i16 = this.f16493d;
                float f20 = f19 / 2.0f;
                if (fWidth < i16 + f20) {
                    fWidth = i16 + f20;
                    fWidth2 = fWidth + f19;
                }
            } else {
                fWidth2 = fWidth + f19;
                int i17 = this.f16494e;
                float f21 = f19 / 2.0f;
                if (fWidth2 > i17 - f21) {
                    fWidth2 = i17 - f21;
                    fWidth = fWidth2 - f19;
                }
            }
        }
        this.f16492c.setTextSize(this.f16482J);
        this.f16492c.setColor(this.f16481I);
        canvas.drawText(strValueOf, fWidth, height, this.f16492c);
        this.f16492c.setColor(this.f16481I);
        canvas.drawText(strValueOf2, fWidth2, height, this.f16492c);
    }

    /* renamed from: j */
    public final void m12990j(Canvas canvas) {
        this.f16492c.setStrokeWidth(this.f16515z);
        this.f16492c.setColor(this.f16513x);
        float f10 = this.f16496g;
        int i10 = this.f16500k;
        canvas.drawLine(f10, i10, this.f16497h, i10, this.f16492c);
    }

    /* renamed from: k */
    public final void m12991k(Canvas canvas) {
        this.f16492c.setColor(this.f16513x);
        canvas.drawCircle(this.f16496g, this.f16500k, AbstractC8037c.m12187a(3.0f), this.f16492c);
        canvas.drawCircle(this.f16497h, this.f16500k, AbstractC8037c.m12187a(3.0f), this.f16492c);
        if (!this.f16506q) {
            canvas.drawBitmap(this.f16476D, this.f16497h - (r0.getWidth() / 2.0f), this.f16500k - (this.f16476D.getWidth() / 2.0f), this.f16492c);
            canvas.drawBitmap(this.f16476D, this.f16496g - (r0.getWidth() / 2.0f), this.f16500k - (this.f16476D.getWidth() / 2.0f), this.f16492c);
            return;
        }
        if (this.f16501l) {
            canvas.drawBitmap(this.f16477E, this.f16496g - (r0.getWidth() / 2.0f), this.f16500k - (this.f16477E.getWidth() / 2.0f), this.f16492c);
            canvas.drawBitmap(this.f16476D, this.f16497h - (r0.getWidth() / 2.0f), this.f16500k - (this.f16476D.getWidth() / 2.0f), this.f16492c);
            return;
        }
        canvas.drawBitmap(this.f16476D, this.f16496g - (r0.getWidth() / 2.0f), this.f16500k - (this.f16476D.getWidth() / 2.0f), this.f16492c);
        canvas.drawBitmap(this.f16477E, this.f16497h - (r0.getWidth() / 2.0f), this.f16500k - (this.f16477E.getWidth() / 2.0f), this.f16492c);
    }

    /* renamed from: l */
    public final void m12992l(String str, Rect rect) {
        this.f16492c.setTextSize(this.f16487O);
        this.f16492c.getTextBounds(str, 0, str.length(), rect);
    }

    /* renamed from: m */
    public final void m12993m(String str, Rect rect) {
        this.f16492c.setTextSize(this.f16482J);
        this.f16492c.getTextBounds(str, 0, str.length(), rect);
    }

    /* renamed from: n */
    public void m12994n(Context context, AttributeSet attributeSet, int i10) {
        f16471T = AbstractC8037c.m12187a(20.0f);
        f16472U = AbstractC8037c.m12187a(2.0f);
        int iM12217d = AbstractC8041g.m12217d(context, R$attr.colorAccent);
        int iM12217d2 = AbstractC8041g.m12217d(context, R$attr.colorControlNormal);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.XRangeSlider, i10, 0);
            this.f16512w = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.XRangeSlider_xrs_verticalPadding, AbstractC8037c.m12187a(10.0f));
            this.f16513x = typedArrayObtainStyledAttributes.getColor(R$styleable.XRangeSlider_xrs_insideRangeLineColor, iM12217d);
            this.f16514y = typedArrayObtainStyledAttributes.getColor(R$styleable.XRangeSlider_xrs_outsideRangeLineColor, AbstractC8040f.m12202c(R$color.default_xrs_outside_line_color));
            this.f16515z = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.XRangeSlider_xrs_insideRangeLineStrokeWidth, AbstractC8037c.m12187a(5.0f));
            this.f16473A = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.XRangeSlider_xrs_outsideRangeLineStrokeWidth, AbstractC8037c.m12187a(5.0f));
            this.f16474B = typedArrayObtainStyledAttributes.getInt(R$styleable.XRangeSlider_xrs_min, this.f16474B);
            this.f16475C = typedArrayObtainStyledAttributes.getInt(R$styleable.XRangeSlider_xrs_max, this.f16475C);
            this.f16476D = BitmapFactory.decodeResource(getResources(), typedArrayObtainStyledAttributes.getResourceId(R$styleable.XRangeSlider_xrs_sliderIcon, R$drawable.xui_ic_slider_icon));
            this.f16477E = BitmapFactory.decodeResource(getResources(), typedArrayObtainStyledAttributes.getResourceId(R$styleable.XRangeSlider_xrs_sliderIconFocus, R$drawable.xui_ic_slider_icon));
            this.f16478F = typedArrayObtainStyledAttributes.getBoolean(R$styleable.XRangeSlider_xrs_isLineRound, true);
            this.f16479G = typedArrayObtainStyledAttributes.getBoolean(R$styleable.XRangeSlider_xrs_isShowBubble, false);
            boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.XRangeSlider_xrs_isFitColor, true);
            this.f16481I = typedArrayObtainStyledAttributes.getColor(R$styleable.XRangeSlider_xrs_numberTextColor, iM12217d);
            this.f16482J = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.XRangeSlider_xrs_numberTextSize, AbstractC8037c.m12189c(12.0f));
            this.f16483K = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.XRangeSlider_xrs_numberMarginBottom, AbstractC8037c.m12187a(2.0f));
            if (z10) {
                if (this.f16479G) {
                    this.f16481I = -1;
                }
                Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), typedArrayObtainStyledAttributes.getResourceId(R$styleable.XRangeSlider_xrs_bubbleResource, R$drawable.xui_bg_bubble_blue));
                if (bitmapDecodeResource != null) {
                    this.f16480H = bitmapDecodeResource.copy(Bitmap.Config.ARGB_8888, true);
                    new Canvas(this.f16480H).drawColor(this.f16513x, PorterDuff.Mode.SRC_IN);
                }
            } else {
                this.f16480H = BitmapFactory.decodeResource(getResources(), typedArrayObtainStyledAttributes.getResourceId(R$styleable.XRangeSlider_xrs_bubbleResource, R$drawable.xui_bg_bubble_blue));
            }
            this.f16484L = typedArrayObtainStyledAttributes.getBoolean(R$styleable.XRangeSlider_xrs_isShowRuler, false);
            this.f16485M = typedArrayObtainStyledAttributes.getColor(R$styleable.XRangeSlider_xrs_rulerColor, iM12217d2);
            this.f16486N = typedArrayObtainStyledAttributes.getColor(R$styleable.XRangeSlider_xrs_rulerTextColor, iM12217d2);
            this.f16487O = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.XRangeSlider_xrs_rulerTextSize, AbstractC8037c.m12189c(12.0f));
            this.f16488P = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.XRangeSlider_xrs_rulerMarginTop, AbstractC8037c.m12187a(4.0f));
            this.f16489Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.XRangeSlider_xrs_rulerDividerHeight, AbstractC8037c.m12187a(4.0f));
            this.f16490R = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.XRangeSlider_xrs_rulerTextMarginTop, AbstractC8037c.m12187a(4.0f));
            this.f16491S = typedArrayObtainStyledAttributes.getInt(R$styleable.XRangeSlider_xrs_rulerInterval, 20);
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f16498i = this.f16475C - this.f16474B;
    }

    /* renamed from: o */
    public final boolean m12995o(int i10, MotionEvent motionEvent) {
        return motionEvent.getX(i10) > ((float) (this.f16497h - f16471T)) && motionEvent.getX(i10) < ((float) (this.f16497h + f16471T)) && motionEvent.getY(i10) > ((float) (this.f16500k - f16471T)) && motionEvent.getY(i10) < ((float) (this.f16500k + f16471T));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        m12987g(canvas);
        m12990j(canvas);
        m12989i(canvas);
        m12988h(canvas);
        m12991k(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        m12993m(String.valueOf(this.f16474B), this.f16507r);
        m12993m(String.valueOf(this.f16475C), this.f16508s);
        int height = this.f16479G ? ((int) (this.f16476D.getHeight() + this.f16483K)) + this.f16480H.getHeight() : (int) (this.f16476D.getHeight() + this.f16483K + this.f16507r.height());
        int iHeight = (int) (this.f16488P + (this.f16489Q * 3.0f) + this.f16490R + this.f16509t.height());
        if (this.f16484L) {
            m12992l(String.valueOf(this.f16474B), this.f16509t);
            height += iHeight;
        }
        if (mode != 1073741824 && mode == Integer.MIN_VALUE) {
            size = Math.min(size, size);
        }
        if (mode2 != 1073741824) {
            size2 = height;
        }
        int i12 = size2 + this.f16512w;
        int width = this.f16479G ? this.f16480H.getWidth() : Math.max(this.f16476D.getWidth(), this.f16508s.width());
        this.f16495f = size - width;
        this.f16500k = this.f16484L ? (i12 - iHeight) - (this.f16476D.getHeight() / 2) : i12 - (this.f16476D.getHeight() / 2);
        int i13 = width / 2;
        this.f16493d = i13;
        this.f16494e = this.f16495f + i13;
        m12981a();
        if (this.f16505p) {
            int i14 = this.f16503n;
            if (i14 == -1) {
                i14 = this.f16474B;
            }
            setSelectedMin(i14);
            int i15 = this.f16504o;
            if (i15 == -1) {
                i15 = this.f16475C;
            }
            setSelectedMax(i15);
        }
        setMeasuredDimension(size, i12 + this.f16512w);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.picker.XRangeSlider.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public final boolean m12996p(int i10, MotionEvent motionEvent) {
        return motionEvent.getX(i10) > ((float) (this.f16496g - f16471T)) && motionEvent.getX(i10) < ((float) (this.f16496g + f16471T)) && motionEvent.getY(i10) > ((float) (this.f16500k - f16471T)) && motionEvent.getY(i10) < ((float) (this.f16500k + f16471T));
    }

    /* renamed from: q */
    public final void m12997q(int i10, MotionEvent motionEvent) {
        if (motionEvent.getX(i10) > this.f16497h && motionEvent.getX(i10) <= this.f16494e) {
            this.f16497h = (int) motionEvent.getX(i10);
            invalidate();
            m12982b();
        } else {
            if (motionEvent.getX(i10) >= this.f16496g || motionEvent.getX(i10) < this.f16493d) {
                return;
            }
            this.f16496g = (int) motionEvent.getX(i10);
            invalidate();
            m12983c();
        }
    }

    /* renamed from: r */
    public final void m12998r(boolean z10) {
        this.f16506q = z10;
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    public void setMax(int i10) {
        this.f16475C = i10;
        this.f16498i = i10 - this.f16474B;
    }

    public void setMin(int i10) {
        this.f16474B = i10;
        this.f16498i = this.f16475C - i10;
    }

    public void setOnRangeSliderListener(InterfaceC8182a interfaceC8182a) {
    }

    public XRangeSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.XRangeSliderStyle);
    }

    public XRangeSlider(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16492c = new Paint(1);
        this.f16496g = 0;
        this.f16497h = 0;
        this.f16500k = 0;
        this.f16503n = -1;
        this.f16504o = -1;
        this.f16505p = true;
        this.f16506q = false;
        this.f16507r = new Rect();
        this.f16508s = new Rect();
        this.f16509t = new Rect();
        this.f16510u = new HashSet();
        this.f16511v = new HashSet();
        this.f16474B = 0;
        this.f16475C = 100;
        m12994n(context, attributeSet, i10);
    }
}
