package com.xuexiang.xui.widget.picker.wheelview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.timepicker.TimeModel;
import com.xuexiang.xui.R$dimen;
import com.xuexiang.xui.R$styleable;
import io.github.inflationx.calligraphy3.HasTypeface;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p083d4.InterfaceC7740a;
import p094e4.C7844a;
import p094e4.InterfaceC7845b;
import p104f3.AbstractC7919c;
import p105f4.C7920a;
import p105f4.C7922c;
import p105f4.HandlerC7921b;

/* loaded from: classes4.dex */
public class WheelView extends View implements HasTypeface {

    /* renamed from: A */
    public float f7781A;

    /* renamed from: B */
    public float f7782B;

    /* renamed from: C */
    public float f7783C;

    /* renamed from: D */
    public int f7784D;

    /* renamed from: E */
    public int f7785E;

    /* renamed from: F */
    public int f7786F;

    /* renamed from: G */
    public int f7787G;

    /* renamed from: H */
    public int f7788H;

    /* renamed from: I */
    public int f7789I;

    /* renamed from: J */
    public int f7790J;

    /* renamed from: K */
    public int f7791K;

    /* renamed from: L */
    public float f7792L;

    /* renamed from: M */
    public long f7793M;

    /* renamed from: N */
    public int f7794N;

    /* renamed from: O */
    public int f7795O;

    /* renamed from: P */
    public int f7796P;

    /* renamed from: Q */
    public int f7797Q;

    /* renamed from: R */
    public float f7798R;

    /* renamed from: a */
    public DividerType f7799a;

    /* renamed from: b */
    public Context f7800b;

    /* renamed from: c */
    public Handler f7801c;

    /* renamed from: d */
    public GestureDetector f7802d;

    /* renamed from: e */
    public InterfaceC7845b f7803e;

    /* renamed from: f */
    public boolean f7804f;

    /* renamed from: g */
    public boolean f7805g;

    /* renamed from: h */
    public ScheduledExecutorService f7806h;

    /* renamed from: i */
    public ScheduledFuture f7807i;

    /* renamed from: j */
    public TextPaint f7808j;

    /* renamed from: k */
    public TextPaint f7809k;

    /* renamed from: l */
    public Paint f7810l;

    /* renamed from: m */
    public InterfaceC7740a f7811m;

    /* renamed from: n */
    public String f7812n;

    /* renamed from: o */
    public int f7813o;

    /* renamed from: p */
    public int f7814p;

    /* renamed from: q */
    public int f7815q;

    /* renamed from: r */
    public int f7816r;

    /* renamed from: s */
    public float f7817s;

    /* renamed from: t */
    public Typeface f7818t;

    /* renamed from: u */
    public int f7819u;

    /* renamed from: v */
    public int f7820v;

    /* renamed from: w */
    public int f7821w;

    /* renamed from: x */
    public float f7822x;

    /* renamed from: y */
    public boolean f7823y;

    /* renamed from: z */
    public float f7824z;

    public enum ACTION {
        CLICK,
        FLING,
        DAGGLE
    }

    public enum DividerType {
        FILL,
        WRAP
    }

    /* renamed from: com.xuexiang.xui.widget.picker.wheelview.WheelView$a */
    public class RunnableC6878a implements Runnable {
        public RunnableC6878a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WheelView.this.f7803e.mo12296a(WheelView.this.getCurrentItem());
        }
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7804f = false;
        this.f7805g = true;
        this.f7806h = Executors.newSingleThreadScheduledExecutor();
        this.f7818t = Typeface.MONOSPACE;
        this.f7822x = 1.6f;
        this.f7787G = 11;
        this.f7791K = 0;
        this.f7792L = 0.0f;
        this.f7793M = 0L;
        this.f7795O = 17;
        this.f7796P = 0;
        this.f7797Q = 0;
        this.f7813o = getResources().getDimensionPixelSize(R$dimen.default_wheel_view_text_size);
        float f10 = getResources().getDisplayMetrics().density;
        if (f10 < 1.0f) {
            this.f7798R = 2.4f;
        } else if (1.0f <= f10 && f10 < 1.5f) {
            this.f7798R = 3.6f;
        } else if (1.5f <= f10 && f10 < 2.0f) {
            this.f7798R = 4.5f;
        } else if (2.0f <= f10 && f10 < 3.0f) {
            this.f7798R = 6.0f;
        } else if (f10 >= 3.0f) {
            this.f7798R = f10 * 2.5f;
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.WheelView, 0, 0);
            this.f7795O = typedArrayObtainStyledAttributes.getInt(R$styleable.WheelView_wv_gravity, 17);
            this.f7819u = typedArrayObtainStyledAttributes.getColor(R$styleable.WheelView_wv_textColorOut, -5723992);
            this.f7820v = typedArrayObtainStyledAttributes.getColor(R$styleable.WheelView_wv_textColorCenter, -14013910);
            this.f7821w = typedArrayObtainStyledAttributes.getColor(R$styleable.WheelView_wv_dividerColor, -2763307);
            this.f7813o = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.WheelView_wv_textSize, this.f7813o);
            this.f7822x = typedArrayObtainStyledAttributes.getFloat(R$styleable.WheelView_wv_lineSpacingMultiplier, this.f7822x);
            typedArrayObtainStyledAttributes.recycle();
        }
        m6958j();
        m6954f(context);
    }

    /* renamed from: p */
    private void m6949p() {
        if (this.f7811m == null) {
            return;
        }
        m6959k();
        int i9 = (int) (this.f7817s * (this.f7787G - 1));
        this.f7788H = (int) ((i9 * 2) / 3.141592653589793d);
        this.f7790J = (int) (i9 / 3.141592653589793d);
        this.f7789I = View.MeasureSpec.getSize(this.f7794N);
        int i10 = this.f7788H;
        float f10 = this.f7817s;
        this.f7824z = (i10 - f10) / 2.0f;
        float f11 = (i10 + f10) / 2.0f;
        this.f7781A = f11;
        this.f7782B = (f11 - ((f10 - this.f7815q) / 2.0f)) - this.f7798R;
        if (this.f7784D == -1) {
            if (this.f7823y) {
                this.f7784D = (this.f7811m.mo12084a() + 1) / 2;
            } else {
                this.f7784D = 0;
            }
        }
        this.f7786F = this.f7784D;
    }

    /* renamed from: b */
    public void m6950b() {
        ScheduledFuture scheduledFuture = this.f7807i;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            return;
        }
        this.f7807i.cancel(true);
        this.f7807i = null;
    }

    /* renamed from: c */
    public final String m6951c(Object obj) {
        return obj == null ? "" : obj instanceof Integer ? String.format(Locale.getDefault(), TimeModel.ZERO_LEADING_NUMBER_FORMAT, obj) : obj.toString();
    }

    /* renamed from: d */
    public final int m6952d(int i9) {
        return i9 < 0 ? m6952d(i9 + this.f7811m.mo12084a()) : i9 > this.f7811m.mo12084a() + (-1) ? m6952d(i9 - this.f7811m.mo12084a()) : i9;
    }

    /* renamed from: e */
    public int m6953e(Paint paint, String str) {
        if (str == null || str.length() <= 0) {
            return 0;
        }
        int length = str.length();
        paint.getTextWidths(str, new float[length]);
        int iCeil = 0;
        for (int i9 = 0; i9 < length; i9++) {
            iCeil += (int) Math.ceil(r2[i9]);
        }
        return iCeil;
    }

    /* renamed from: f */
    public final void m6954f(Context context) {
        this.f7800b = context;
        this.f7801c = new HandlerC7921b(this);
        GestureDetector gestureDetector = new GestureDetector(context, new C7844a(this));
        this.f7802d = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.f7823y = true;
        this.f7783C = 0.0f;
        this.f7784D = -1;
        m6955g();
    }

    /* renamed from: g */
    public final void m6955g() {
        TextPaint textPaint = new TextPaint();
        this.f7808j = textPaint;
        textPaint.setColor(this.f7819u);
        this.f7808j.setAntiAlias(true);
        this.f7808j.setTypeface(this.f7818t);
        this.f7808j.setTextSize(this.f7813o);
        TextPaint textPaint2 = new TextPaint();
        this.f7809k = textPaint2;
        textPaint2.setColor(this.f7820v);
        this.f7809k.setAntiAlias(true);
        this.f7809k.setTextScaleX(1.1f);
        this.f7809k.setTypeface(this.f7818t);
        this.f7809k.setTextSize(this.f7813o);
        Paint paint = new Paint();
        this.f7810l = paint;
        paint.setColor(this.f7821w);
        this.f7810l.setAntiAlias(true);
        setLayerType(1, null);
    }

    public final InterfaceC7740a getAdapter() {
        return this.f7811m;
    }

    public final int getCurrentItem() {
        int i9;
        InterfaceC7740a interfaceC7740a = this.f7811m;
        if (interfaceC7740a == null) {
            return 0;
        }
        return (!this.f7823y || ((i9 = this.f7785E) >= 0 && i9 < interfaceC7740a.mo12084a())) ? Math.max(0, Math.min(this.f7785E, this.f7811m.mo12084a() - 1)) : Math.max(0, Math.min(Math.abs(Math.abs(this.f7785E) - this.f7811m.mo12084a()), this.f7811m.mo12084a() - 1));
    }

    @Override // android.view.View
    public Handler getHandler() {
        return this.f7801c;
    }

    public int getInitPosition() {
        return this.f7784D;
    }

    public float getItemHeight() {
        return this.f7817s;
    }

    public int getItemsCount() {
        InterfaceC7740a interfaceC7740a = this.f7811m;
        if (interfaceC7740a != null) {
            return interfaceC7740a.mo12084a();
        }
        return 0;
    }

    public float getTotalScrollY() {
        return this.f7783C;
    }

    /* renamed from: h */
    public void m6956h(boolean z9) {
        this.f7805g = z9;
    }

    /* renamed from: i */
    public boolean m6957i() {
        return this.f7823y;
    }

    /* renamed from: j */
    public final void m6958j() {
        float f10 = this.f7822x;
        if (f10 < 1.0f) {
            this.f7822x = 1.0f;
        } else if (f10 > 4.0f) {
            this.f7822x = 4.0f;
        }
    }

    /* renamed from: k */
    public final void m6959k() {
        Rect rect = new Rect();
        for (int i9 = 0; i9 < this.f7811m.mo12084a(); i9++) {
            String strM6951c = m6951c(this.f7811m.getItem(i9));
            this.f7809k.getTextBounds(strM6951c, 0, strM6951c.length(), rect);
            int iWidth = rect.width();
            if (iWidth > this.f7814p) {
                this.f7814p = iWidth;
            }
            this.f7809k.getTextBounds("星期", 0, 2, rect);
            this.f7815q = rect.height() + 2;
        }
        this.f7817s = this.f7822x * this.f7815q;
    }

    /* renamed from: l */
    public final void m6960l(String str) {
        String str2;
        Rect rect = new Rect();
        this.f7809k.getTextBounds(str, 0, str.length(), rect);
        int i9 = this.f7795O;
        if (i9 == 3) {
            this.f7796P = 0;
            return;
        }
        if (i9 == 5) {
            this.f7796P = (this.f7789I - rect.width()) - ((int) this.f7798R);
            return;
        }
        if (i9 != 17) {
            return;
        }
        if (this.f7804f || (str2 = this.f7812n) == null || "".equals(str2) || !this.f7805g) {
            this.f7796P = (int) ((this.f7789I - rect.width()) * 0.5d);
        } else {
            this.f7796P = (int) ((this.f7789I - rect.width()) * 0.25d);
        }
    }

    /* renamed from: m */
    public final void m6961m(String str) {
        String str2;
        Rect rect = new Rect();
        this.f7808j.getTextBounds(str, 0, str.length(), rect);
        int i9 = this.f7795O;
        if (i9 == 3) {
            this.f7797Q = 0;
            return;
        }
        if (i9 == 5) {
            this.f7797Q = (this.f7789I - rect.width()) - ((int) this.f7798R);
            return;
        }
        if (i9 != 17) {
            return;
        }
        if (this.f7804f || (str2 = this.f7812n) == null || "".equals(str2) || !this.f7805g) {
            this.f7797Q = (int) ((this.f7789I - rect.width()) * 0.5d);
        } else {
            this.f7797Q = (int) ((this.f7789I - rect.width()) * 0.25d);
        }
    }

    /* renamed from: n */
    public final void m6962n() {
        if (this.f7803e != null) {
            postDelayed(new RunnableC6878a(), 200L);
        }
    }

    /* renamed from: o */
    public final void m6963o(String str) {
        Rect rect = new Rect();
        this.f7809k.getTextBounds(str, 0, str.length(), rect);
        int i9 = this.f7813o;
        for (int iWidth = rect.width(); iWidth > this.f7789I; iWidth = rect.width()) {
            i9--;
            this.f7809k.setTextSize(i9);
            this.f7809k.getTextBounds(str, 0, str.length(), rect);
        }
        this.f7808j.setTextSize(i9);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z9;
        boolean z10;
        String strM6951c;
        float f10;
        float f11;
        if (this.f7811m == null) {
            return;
        }
        boolean z11 = false;
        int iMin = Math.min(Math.max(0, this.f7784D), this.f7811m.mo12084a() - 1);
        this.f7784D = iMin;
        Object[] objArr = new Object[this.f7787G];
        try {
            this.f7786F = iMin + (((int) (this.f7783C / this.f7817s)) % this.f7811m.mo12084a());
        } catch (ArithmeticException unused) {
            AbstractC7919c.m12472e("WheelView", "出错了！adapter.getItemsCount() == 0，联动数据不匹配");
        }
        if (this.f7823y) {
            if (this.f7786F < 0) {
                this.f7786F = this.f7811m.mo12084a() + this.f7786F;
            }
            if (this.f7786F > this.f7811m.mo12084a() - 1) {
                this.f7786F -= this.f7811m.mo12084a();
            }
        } else {
            if (this.f7786F < 0) {
                this.f7786F = 0;
            }
            if (this.f7786F > this.f7811m.mo12084a() - 1) {
                this.f7786F = this.f7811m.mo12084a() - 1;
            }
        }
        float f12 = this.f7783C % this.f7817s;
        int i9 = 0;
        while (true) {
            int i10 = this.f7787G;
            if (i9 >= i10) {
                break;
            }
            int i11 = this.f7786F - ((i10 / 2) - i9);
            if (this.f7823y) {
                objArr[i9] = this.f7811m.getItem(m6952d(i11));
            } else if (i11 < 0) {
                objArr[i9] = "";
            } else if (i11 > this.f7811m.mo12084a() - 1) {
                objArr[i9] = "";
            } else {
                objArr[i9] = this.f7811m.getItem(i11);
            }
            i9++;
        }
        boolean z12 = false;
        if (this.f7799a == DividerType.WRAP) {
            if (TextUtils.isEmpty(this.f7812n)) {
                f10 = this.f7789I - this.f7814p;
                f11 = 2.0f;
            } else {
                f10 = this.f7789I - this.f7814p;
                f11 = 4.0f;
            }
            float f13 = (f10 / f11) - 12.0f;
            if (f13 <= 0.0f) {
                f13 = 10.0f;
            }
            float f14 = f13;
            float f15 = this.f7789I - f14;
            float f16 = this.f7824z;
            canvas2 = canvas;
            canvas2.drawLine(f14, f16, f15, f16, this.f7810l);
            float f17 = this.f7781A;
            canvas2.drawLine(f14, f17, f15, f17, this.f7810l);
        } else {
            float f18 = this.f7824z;
            canvas.drawLine(0.0f, f18, this.f7789I, f18, this.f7810l);
            float f19 = this.f7781A;
            canvas2 = canvas;
            canvas2.drawLine(0.0f, f19, this.f7789I, f19, this.f7810l);
        }
        if (!TextUtils.isEmpty(this.f7812n) && this.f7805g) {
            canvas2.drawText(this.f7812n, (this.f7789I - m6953e(this.f7809k, this.f7812n)) - this.f7798R, this.f7782B, this.f7809k);
        }
        int i12 = 0;
        while (i12 < this.f7787G) {
            canvas2.save();
            double d10 = ((this.f7817s * i12) - f12) / this.f7790J;
            float f20 = (float) (90.0d - ((d10 / 3.141592653589793d) * 180.0d));
            if (f20 >= 90.0f || f20 <= -90.0f) {
                z9 = z11;
                z10 = z12;
                canvas2.restore();
            } else {
                float fPow = (float) Math.pow(Math.abs(f20) / 90.0f, 2.2d);
                if (this.f7805g || TextUtils.isEmpty(this.f7812n) || TextUtils.isEmpty(m6951c(objArr[i12]))) {
                    strM6951c = m6951c(objArr[i12]);
                } else {
                    strM6951c = m6951c(objArr[i12]) + this.f7812n;
                }
                m6963o(strM6951c);
                m6960l(strM6951c);
                m6961m(strM6951c);
                String str = strM6951c;
                float fCos = (float) ((this.f7790J - (Math.cos(d10) * this.f7790J)) - ((Math.sin(d10) * this.f7815q) / 2.0d));
                canvas2.translate(0.0f, fCos);
                float f21 = this.f7824z;
                if (fCos > f21 || this.f7815q + fCos < f21) {
                    float f22 = this.f7781A;
                    if (fCos > f22 || this.f7815q + fCos < f22) {
                        if (fCos >= f21) {
                            int i13 = this.f7815q;
                            if (i13 + fCos <= f22) {
                                canvas2.drawText(str, this.f7796P, i13 - this.f7798R, this.f7809k);
                                this.f7785E = this.f7786F - ((this.f7787G / 2) - i12);
                            }
                        }
                        canvas2.save();
                        z9 = false;
                        canvas2.clipRect(0, 0, this.f7789I, (int) this.f7817s);
                        canvas2.scale(1.0f, ((float) Math.sin(d10)) * 0.8f);
                        TextPaint textPaint = this.f7808j;
                        int i14 = this.f7816r;
                        z10 = false;
                        textPaint.setTextSkewX((i14 == 0 ? 0 : i14 > 0 ? 1 : -1) * (f20 <= 0.0f ? 1 : -1) * 0.5f * fPow);
                        this.f7808j.setAlpha((int) ((1.0f - fPow) * 255.0f));
                        canvas2.drawText(str, this.f7797Q + (this.f7816r * fPow), this.f7815q, this.f7808j);
                        canvas2.restore();
                        canvas2.restore();
                        this.f7809k.setTextSize(this.f7813o);
                    } else {
                        canvas2.save();
                        canvas2.clipRect(0.0f, 0.0f, this.f7789I, this.f7781A - fCos);
                        canvas2.scale(1.0f, ((float) Math.sin(d10)) * 1.0f);
                        canvas2.drawText(str, this.f7796P, this.f7815q - this.f7798R, this.f7809k);
                        canvas2.restore();
                        canvas2.save();
                        canvas2.clipRect(0.0f, this.f7781A - fCos, this.f7789I, (int) this.f7817s);
                        canvas2.scale(1.0f, ((float) Math.sin(d10)) * 0.8f);
                        canvas2.drawText(str, this.f7797Q, this.f7815q, this.f7808j);
                        canvas2.restore();
                    }
                } else {
                    canvas2.save();
                    canvas2.clipRect(0.0f, 0.0f, this.f7789I, this.f7824z - fCos);
                    canvas2.scale(1.0f, ((float) Math.sin(d10)) * 0.8f);
                    canvas2.drawText(str, this.f7797Q, this.f7815q, this.f7808j);
                    canvas2.restore();
                    canvas2.save();
                    canvas2.clipRect(0.0f, this.f7824z - fCos, this.f7789I, (int) this.f7817s);
                    canvas2.scale(1.0f, ((float) Math.sin(d10)) * 1.0f);
                    canvas2.drawText(str, this.f7796P, this.f7815q - this.f7798R, this.f7809k);
                    canvas2.restore();
                }
                z9 = false;
                z10 = false;
                canvas2.restore();
                this.f7809k.setTextSize(this.f7813o);
            }
            i12++;
            z11 = z9;
            z12 = z10;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        this.f7794N = i9;
        m6949p();
        setMeasuredDimension(this.f7789I, this.f7788H);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = this.f7802d.onTouchEvent(motionEvent);
        float f10 = (-this.f7784D) * this.f7817s;
        float fMo12084a = ((this.f7811m.mo12084a() - 1) - this.f7784D) * this.f7817s;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f7793M = System.currentTimeMillis();
            m6950b();
            this.f7792L = motionEvent.getRawY();
        } else {
            if (action == 2) {
                float rawY = this.f7792L - motionEvent.getRawY();
                this.f7792L = motionEvent.getRawY();
                float f11 = this.f7783C + rawY;
                this.f7783C = f11;
                if (!this.f7823y) {
                    float f12 = this.f7817s;
                    if ((f11 - (f12 * 0.25f) < f10 && rawY < 0.0f) || ((f12 * 0.25f) + f11 > fMo12084a && rawY > 0.0f)) {
                        this.f7783C = f11 - rawY;
                    }
                }
                return true;
            }
            if (!zOnTouchEvent) {
                float y9 = motionEvent.getY();
                int i9 = this.f7790J;
                double dAcos = Math.acos((i9 - y9) / i9) * this.f7790J;
                float f13 = this.f7817s;
                this.f7791K = (int) (((((int) ((dAcos + (f13 / 2.0f)) / f13)) - (this.f7787G / 2)) * f13) - (((this.f7783C % f13) + f13) % f13));
                if (System.currentTimeMillis() - this.f7793M > 120) {
                    m6965r(ACTION.DAGGLE);
                } else {
                    m6965r(ACTION.CLICK);
                }
            }
        }
        if (motionEvent.getAction() != 0) {
            invalidate();
        }
        return true;
    }

    /* renamed from: q */
    public final void m6964q(float f10) {
        m6950b();
        this.f7807i = this.f7806h.scheduleWithFixedDelay(new C7920a(this, f10), 0L, 5L, TimeUnit.MILLISECONDS);
    }

    /* renamed from: r */
    public void m6965r(ACTION action) {
        m6950b();
        if (action == ACTION.FLING || action == ACTION.DAGGLE) {
            float f10 = this.f7783C;
            float f11 = this.f7817s;
            int i9 = (int) (((f10 % f11) + f11) % f11);
            this.f7791K = i9;
            if (i9 > f11 / 2.0f) {
                this.f7791K = (int) (f11 - i9);
            } else {
                this.f7791K = -i9;
            }
        }
        this.f7807i = this.f7806h.scheduleWithFixedDelay(new C7922c(this, this.f7791K), 0L, 10L, TimeUnit.MILLISECONDS);
    }

    public final void setAdapter(InterfaceC7740a interfaceC7740a) {
        this.f7811m = interfaceC7740a;
        m6949p();
        invalidate();
    }

    public final void setCurrentItem(int i9) {
        this.f7785E = i9;
        this.f7784D = i9;
        this.f7783C = 0.0f;
        invalidate();
    }

    public final void setCyclic(boolean z9) {
        this.f7823y = z9;
    }

    public void setDividerColor(int i9) {
        this.f7821w = i9;
        this.f7810l.setColor(i9);
    }

    public void setDividerType(DividerType dividerType) {
        this.f7799a = dividerType;
    }

    public void setGravity(int i9) {
        this.f7795O = i9;
    }

    public void setIsOptions(boolean z9) {
        this.f7804f = z9;
    }

    public void setLabel(String str) {
        this.f7812n = str;
    }

    public void setLineSpacingMultiplier(float f10) {
        if (f10 != 0.0f) {
            this.f7822x = f10;
            m6958j();
        }
    }

    public final void setOnItemSelectedListener(InterfaceC7845b interfaceC7845b) {
        this.f7803e = interfaceC7845b;
    }

    public void setTextColorCenter(int i9) {
        this.f7820v = i9;
        this.f7809k.setColor(i9);
    }

    public void setTextColorOut(int i9) {
        this.f7819u = i9;
        this.f7808j.setColor(i9);
    }

    public final void setTextSize(float f10) {
        if (f10 > 0.0f) {
            int i9 = (int) (this.f7800b.getResources().getDisplayMetrics().density * f10);
            this.f7813o = i9;
            this.f7808j.setTextSize(i9);
            this.f7809k.setTextSize(this.f7813o);
        }
    }

    public void setTextXOffset(int i9) {
        this.f7816r = i9;
        if (i9 != 0) {
            this.f7809k.setTextScaleX(1.0f);
        }
    }

    public void setTotalScrollY(float f10) {
        this.f7783C = f10;
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public final void setTypeface(Typeface typeface) {
        this.f7818t = typeface;
        this.f7808j.setTypeface(typeface);
        this.f7809k.setTypeface(this.f7818t);
    }
}
