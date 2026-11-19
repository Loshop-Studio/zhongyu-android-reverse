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
public class XSeekBar extends View {

    /* renamed from: Q */
    public static int f16516Q;

    /* renamed from: R */
    public static int f16517R;

    /* renamed from: A */
    public Bitmap f16518A;

    /* renamed from: B */
    public boolean f16519B;

    /* renamed from: C */
    public boolean f16520C;

    /* renamed from: D */
    public Bitmap f16521D;

    /* renamed from: E */
    public boolean f16522E;

    /* renamed from: F */
    public int f16523F;

    /* renamed from: G */
    public float f16524G;

    /* renamed from: H */
    public float f16525H;

    /* renamed from: I */
    public boolean f16526I;

    /* renamed from: J */
    public int f16527J;

    /* renamed from: K */
    public int f16528K;

    /* renamed from: L */
    public float f16529L;

    /* renamed from: M */
    public float f16530M;

    /* renamed from: N */
    public float f16531N;

    /* renamed from: O */
    public float f16532O;

    /* renamed from: P */
    public int f16533P;

    /* renamed from: c */
    public final Paint f16534c;

    /* renamed from: d */
    public int f16535d;

    /* renamed from: e */
    public int f16536e;

    /* renamed from: f */
    public int f16537f;

    /* renamed from: g */
    public int f16538g;

    /* renamed from: h */
    public int f16539h;

    /* renamed from: i */
    public int f16540i;

    /* renamed from: j */
    public Rect f16541j;

    /* renamed from: k */
    public Rect f16542k;

    /* renamed from: l */
    public Set f16543l;

    /* renamed from: m */
    public Set f16544m;

    /* renamed from: n */
    public boolean f16545n;

    /* renamed from: o */
    public boolean f16546o;

    /* renamed from: p */
    public int f16547p;

    /* renamed from: q */
    public boolean f16548q;

    /* renamed from: r */
    public float f16549r;

    /* renamed from: s */
    public int f16550s;

    /* renamed from: t */
    public int f16551t;

    /* renamed from: u */
    public int f16552u;

    /* renamed from: v */
    public float f16553v;

    /* renamed from: w */
    public float f16554w;

    /* renamed from: x */
    public int f16555x;

    /* renamed from: y */
    public int f16556y;

    /* renamed from: z */
    public Bitmap f16557z;

    /* renamed from: com.xuexiang.xui.widget.picker.XSeekBar$a */
    public interface InterfaceC8183a {
    }

    public XSeekBar(Context context) {
        this(context, null);
    }

    private void setSelectedValue(int i10) {
        this.f16538g = Math.round(((i10 - this.f16556y) / this.f16549r) + this.f16535d);
        m13000b();
    }

    /* renamed from: a */
    public final void m12999a() {
        this.f16549r = this.f16539h / this.f16537f;
    }

    /* renamed from: b */
    public final void m13000b() {
    }

    /* renamed from: c */
    public final boolean m13001c(int i10, MotionEvent motionEvent) {
        if (!m13012n(i10, motionEvent)) {
            return false;
        }
        this.f16546o = false;
        this.f16544m.add(Integer.valueOf(motionEvent.getPointerId(i10)));
        return true;
    }

    /* renamed from: d */
    public final boolean m13002d(int i10, MotionEvent motionEvent) {
        if (!m13013o(i10, motionEvent)) {
            return false;
        }
        this.f16546o = true;
        this.f16543l.add(Integer.valueOf(motionEvent.getPointerId(i10)));
        return true;
    }

    /* renamed from: e */
    public final Number m13003e(Number number, Number number2, Number number3) {
        return number.doubleValue() > number3.doubleValue() ? number3 : number.doubleValue() < number2.doubleValue() ? number2 : number;
    }

    /* renamed from: f */
    public final void m13004f(Canvas canvas) {
        this.f16534c.setColor(this.f16552u);
        this.f16534c.setStrokeWidth(this.f16554w);
        float f10 = this.f16535d;
        int i10 = this.f16540i;
        canvas.drawLine(f10, i10, this.f16536e, i10, this.f16534c);
        if (this.f16519B) {
            this.f16534c.setColor(this.f16551t);
            canvas.drawCircle(this.f16535d, this.f16540i, this.f16554w / 2.0f, this.f16534c);
            this.f16534c.setColor(this.f16552u);
            canvas.drawCircle(this.f16536e, this.f16540i, this.f16554w / 2.0f, this.f16534c);
        }
    }

    /* renamed from: g */
    public final void m13005g(Canvas canvas) {
        Canvas canvas2;
        float height;
        if (this.f16526I) {
            float f10 = this.f16535d;
            float f11 = this.f16533P / 10.0f;
            float f12 = this.f16537f;
            int i10 = this.f16555x;
            int i11 = this.f16556y;
            float f13 = (f12 / ((i10 - i11) / f11)) / f11;
            boolean z10 = false;
            float f14 = f10;
            boolean z11 = false;
            while (i11 <= this.f16555x) {
                int i12 = this.f16533P;
                if (i11 % i12 == 0) {
                    height = this.f16540i + (this.f16557z.getHeight() / 2.0f) + this.f16530M;
                    float f15 = height + (this.f16531N * 3.0f);
                    this.f16534c.setColor(this.f16528K);
                    this.f16534c.setTextSize(this.f16529L);
                    m13009k(String.valueOf(i11), this.f16542k);
                    canvas.drawText(String.valueOf(i11), f14 - (this.f16542k.width() / 2.0f), this.f16542k.height() + f15 + this.f16532O, this.f16534c);
                    if (i11 == this.f16556y) {
                        z11 = true;
                    }
                    if (i11 == this.f16555x) {
                        z10 = true;
                    }
                    this.f16534c.setStrokeWidth(1.7f);
                    this.f16534c.setColor(this.f16527J);
                    canvas2 = canvas;
                    canvas2.drawLine(f14, height, f14, f15, this.f16534c);
                } else {
                    canvas2 = canvas;
                    if (i11 % (i12 / 2) == 0 && i12 % 10 == 0) {
                        height = this.f16540i + (this.f16557z.getHeight() / 2.0f) + this.f16530M;
                        float f16 = height + (this.f16531N * 2.0f);
                        this.f16534c.setStrokeWidth(1.2f);
                        this.f16534c.setColor(this.f16527J);
                        canvas2.drawLine(f14, height, f14, f16, this.f16534c);
                    } else {
                        height = this.f16540i + (this.f16557z.getHeight() / 2.0f) + this.f16530M;
                        float f17 = height + this.f16531N;
                        this.f16534c.setStrokeWidth(1.0f);
                        if (i11 % (this.f16533P / 10) == 0) {
                            this.f16534c.setColor(this.f16527J);
                            canvas2.drawLine(f14, height, f14, f17, this.f16534c);
                        }
                    }
                }
                if ((i11 == this.f16555x && !z10) || (i11 == this.f16556y && !z11)) {
                    this.f16534c.setColor(this.f16528K);
                    this.f16534c.setTextSize(this.f16529L);
                    m13009k(String.valueOf(i11), this.f16542k);
                    float fWidth = f14 - (this.f16542k.width() / 2.0f);
                    if (i11 == this.f16555x && i11 % this.f16533P == 1) {
                        fWidth = f16517R + f14;
                    }
                    if (i11 == this.f16556y) {
                        int i13 = this.f16533P;
                        if (i11 % i13 == i13 - 1) {
                            fWidth = (f14 - (this.f16542k.width() / 2.0f)) - f16517R;
                        }
                    }
                    canvas2.drawText(String.valueOf(i11), fWidth, height + (this.f16531N * 3.0f) + this.f16542k.height() + this.f16532O, this.f16534c);
                }
                f14 += f13;
                i11++;
                canvas = canvas2;
            }
        }
    }

    public int getMax() {
        return this.f16555x;
    }

    public int getMin() {
        return this.f16556y;
    }

    public int getSelectedNumber() {
        return Math.round(((this.f16538g - this.f16535d) * this.f16549r) + this.f16556y);
    }

    /* renamed from: h */
    public final void m13006h(Canvas canvas) {
        float height;
        String strValueOf = String.valueOf(getSelectedNumber());
        m13010l(strValueOf, this.f16541j);
        if (this.f16520C) {
            float height2 = ((this.f16540i - (this.f16557z.getHeight() / 2.0f)) - this.f16521D.getHeight()) - this.f16525H;
            height = (((this.f16521D.getHeight() / 2.0f) + height2) + (this.f16541j.height() / 2.0f)) - 6.0f;
            canvas.drawBitmap(this.f16521D, this.f16538g - (r4.getWidth() / 2.0f), height2, this.f16534c);
        } else {
            height = (this.f16540i - (this.f16557z.getHeight() / 2.0f)) - this.f16525H;
        }
        this.f16534c.setTextSize(this.f16524G);
        this.f16534c.setColor(this.f16523F);
        canvas.drawText(strValueOf, this.f16538g - (this.f16541j.width() / 2.0f), height, this.f16534c);
    }

    /* renamed from: i */
    public final void m13007i(Canvas canvas) {
        this.f16534c.setStrokeWidth(this.f16553v);
        this.f16534c.setColor(this.f16551t);
        float f10 = this.f16535d;
        int i10 = this.f16540i;
        canvas.drawLine(f10, i10, this.f16538g, i10, this.f16534c);
    }

    /* renamed from: j */
    public final void m13008j(Canvas canvas) {
        this.f16534c.setColor(this.f16551t);
        canvas.drawCircle(this.f16538g, this.f16540i, AbstractC8037c.m12187a(3.0f), this.f16534c);
        if (this.f16545n) {
            canvas.drawBitmap(this.f16518A, this.f16538g - (this.f16557z.getWidth() / 2.0f), this.f16540i - (this.f16557z.getWidth() / 2.0f), this.f16534c);
        } else {
            canvas.drawBitmap(this.f16557z, this.f16538g - (r0.getWidth() / 2.0f), this.f16540i - (this.f16557z.getWidth() / 2.0f), this.f16534c);
        }
    }

    /* renamed from: k */
    public final void m13009k(String str, Rect rect) {
        this.f16534c.setTextSize(this.f16529L);
        this.f16534c.getTextBounds(str, 0, str.length(), rect);
    }

    /* renamed from: l */
    public final void m13010l(String str, Rect rect) {
        this.f16534c.setTextSize(this.f16524G);
        this.f16534c.getTextBounds(str, 0, str.length(), rect);
    }

    /* renamed from: m */
    public void m13011m(Context context, AttributeSet attributeSet, int i10) {
        f16516Q = AbstractC8037c.m12187a(20.0f);
        f16517R = AbstractC8037c.m12187a(2.0f);
        int iM12217d = AbstractC8041g.m12217d(context, R$attr.colorAccent);
        int iM12217d2 = AbstractC8041g.m12217d(context, R$attr.colorControlNormal);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.XSeekBar, i10, 0);
            this.f16550s = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.XSeekBar_xsb_verticalPadding, AbstractC8037c.m12187a(10.0f));
            this.f16551t = typedArrayObtainStyledAttributes.getColor(R$styleable.XSeekBar_xsb_insideRangeLineColor, iM12217d);
            this.f16552u = typedArrayObtainStyledAttributes.getColor(R$styleable.XSeekBar_xsb_outsideRangeLineColor, AbstractC8040f.m12202c(R$color.default_xrs_outside_line_color));
            this.f16553v = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.XSeekBar_xsb_insideRangeLineStrokeWidth, AbstractC8037c.m12187a(5.0f));
            this.f16554w = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.XSeekBar_xsb_outsideRangeLineStrokeWidth, AbstractC8037c.m12187a(5.0f));
            this.f16556y = typedArrayObtainStyledAttributes.getInt(R$styleable.XSeekBar_xsb_min, this.f16556y);
            this.f16555x = typedArrayObtainStyledAttributes.getInt(R$styleable.XSeekBar_xsb_max, this.f16555x);
            this.f16557z = BitmapFactory.decodeResource(getResources(), typedArrayObtainStyledAttributes.getResourceId(R$styleable.XSeekBar_xsb_sliderIcon, R$drawable.xui_ic_slider_icon));
            this.f16518A = BitmapFactory.decodeResource(getResources(), typedArrayObtainStyledAttributes.getResourceId(R$styleable.XSeekBar_xsb_sliderIconFocus, R$drawable.xui_ic_slider_icon));
            this.f16519B = typedArrayObtainStyledAttributes.getBoolean(R$styleable.XSeekBar_xsb_isLineRound, true);
            this.f16520C = typedArrayObtainStyledAttributes.getBoolean(R$styleable.XSeekBar_xsb_isShowBubble, false);
            boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.XSeekBar_xsb_isFitColor, true);
            this.f16522E = typedArrayObtainStyledAttributes.getBoolean(R$styleable.XSeekBar_xsb_isShowNumber, true);
            this.f16523F = typedArrayObtainStyledAttributes.getColor(R$styleable.XSeekBar_xsb_numberTextColor, iM12217d);
            this.f16524G = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.XSeekBar_xsb_numberTextSize, AbstractC8037c.m12189c(12.0f));
            this.f16525H = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.XSeekBar_xsb_numberMarginBottom, AbstractC8037c.m12187a(2.0f));
            if (z10) {
                if (this.f16520C) {
                    this.f16523F = -1;
                }
                Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), typedArrayObtainStyledAttributes.getResourceId(R$styleable.XSeekBar_xsb_bubbleResource, R$drawable.xui_bg_bubble_blue));
                if (bitmapDecodeResource != null) {
                    this.f16521D = bitmapDecodeResource.copy(Bitmap.Config.ARGB_8888, true);
                    new Canvas(this.f16521D).drawColor(this.f16551t, PorterDuff.Mode.SRC_IN);
                }
            } else {
                this.f16521D = BitmapFactory.decodeResource(getResources(), typedArrayObtainStyledAttributes.getResourceId(R$styleable.XSeekBar_xsb_bubbleResource, R$drawable.xui_bg_bubble_blue));
            }
            this.f16526I = typedArrayObtainStyledAttributes.getBoolean(R$styleable.XSeekBar_xsb_isShowRuler, false);
            this.f16527J = typedArrayObtainStyledAttributes.getColor(R$styleable.XSeekBar_xsb_rulerColor, iM12217d2);
            this.f16528K = typedArrayObtainStyledAttributes.getColor(R$styleable.XSeekBar_xsb_rulerTextColor, iM12217d2);
            this.f16529L = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.XSeekBar_xsb_rulerTextSize, AbstractC8037c.m12189c(12.0f));
            this.f16530M = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.XSeekBar_xsb_rulerMarginTop, AbstractC8037c.m12187a(4.0f));
            this.f16531N = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.XSeekBar_xsb_rulerDividerHeight, AbstractC8037c.m12187a(4.0f));
            this.f16532O = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.XSeekBar_xsb_rulerTextMarginTop, AbstractC8037c.m12187a(4.0f));
            this.f16533P = typedArrayObtainStyledAttributes.getInt(R$styleable.XSeekBar_xsb_rulerInterval, 20);
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f16539h = this.f16555x - this.f16556y;
    }

    /* renamed from: n */
    public final boolean m13012n(int i10, MotionEvent motionEvent) {
        return motionEvent.getX(i10) > ((float) (this.f16538g - f16516Q)) && motionEvent.getX(i10) < ((float) (this.f16538g + f16516Q)) && motionEvent.getY(i10) > ((float) (this.f16540i - f16516Q)) && motionEvent.getY(i10) < ((float) (this.f16540i + f16516Q));
    }

    /* renamed from: o */
    public final boolean m13013o(int i10, MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        m13004f(canvas);
        m13007i(canvas);
        if (this.f16522E) {
            m13006h(canvas);
        }
        m13005g(canvas);
        m13008j(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        m13010l(String.valueOf(this.f16555x), this.f16541j);
        boolean z10 = this.f16522E;
        int height = (z10 && this.f16520C) ? ((int) (this.f16557z.getHeight() + this.f16525H)) + this.f16521D.getHeight() : z10 ? (int) (this.f16557z.getHeight() + this.f16525H) : this.f16557z.getHeight();
        int iHeight = (int) (this.f16530M + (this.f16531N * 3.0f) + this.f16532O + this.f16542k.height());
        if (this.f16526I) {
            m13009k(String.valueOf(this.f16556y), this.f16542k);
            height += iHeight;
        }
        if (mode != 1073741824 && mode == Integer.MIN_VALUE) {
            size = Math.min(size, size);
        }
        if (mode2 != 1073741824) {
            size2 = height;
        }
        int i12 = size2 + this.f16550s;
        int width = this.f16520C ? this.f16521D.getWidth() : Math.max(this.f16557z.getWidth(), this.f16541j.width());
        this.f16537f = size - width;
        this.f16540i = this.f16526I ? (i12 - iHeight) - (this.f16557z.getHeight() / 2) : i12 - (this.f16557z.getHeight() / 2);
        int i13 = width / 2;
        this.f16535d = i13;
        this.f16536e = this.f16537f + i13;
        m12999a();
        if (this.f16548q) {
            int i14 = this.f16547p;
            if (i14 == -1) {
                i14 = this.f16555x;
            }
            setSelectedValue(i14);
        }
        setMeasuredDimension(size, i12 + this.f16550s);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00e2  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.picker.XSeekBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public final void m13014p(int i10, MotionEvent motionEvent) {
        if (motionEvent.getX(i10) > this.f16538g && motionEvent.getX(i10) <= this.f16536e) {
            this.f16538g = (int) motionEvent.getX(i10);
            invalidate();
            m13000b();
        } else {
            if (motionEvent.getX(i10) >= this.f16538g || motionEvent.getX(i10) < this.f16535d) {
                return;
            }
            this.f16538g = (int) motionEvent.getX(i10);
            invalidate();
            m13000b();
        }
    }

    /* renamed from: q */
    public final void m13015q(boolean z10) {
        this.f16545n = z10;
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    public void setDefaultValue(int i10) {
        this.f16547p = i10;
        setSelectedValue(i10);
        invalidate();
    }

    public void setInterval(int i10) {
        this.f16533P = i10;
        invalidate();
    }

    public void setMax(int i10) {
        this.f16555x = i10;
        this.f16539h = i10 - this.f16556y;
    }

    public void setMin(int i10) {
        this.f16556y = i10;
        this.f16539h = this.f16555x - i10;
    }

    public void setOnSeekBarListener(InterfaceC8183a interfaceC8183a) {
    }

    public XSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.XSeekBarStyle);
    }

    public XSeekBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16534c = new Paint(1);
        this.f16538g = 0;
        this.f16540i = 0;
        this.f16541j = new Rect();
        this.f16542k = new Rect();
        this.f16543l = new HashSet();
        this.f16544m = new HashSet();
        this.f16545n = false;
        this.f16547p = -1;
        this.f16548q = true;
        this.f16555x = 100;
        this.f16556y = 0;
        m13011m(context, attributeSet, i10);
    }
}
