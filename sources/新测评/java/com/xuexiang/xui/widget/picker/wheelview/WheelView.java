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
import p176n3.InterfaceC8620a;
import p187o3.C8698a;
import p187o3.InterfaceC8699b;
import p197p2.AbstractC8819c;
import p198p3.C8820a;
import p198p3.C8822c;
import p198p3.HandlerC8821b;

/* loaded from: classes4.dex */
public class WheelView extends View implements HasTypeface {

    /* renamed from: A */
    public float f6523A;

    /* renamed from: B */
    public float f6524B;

    /* renamed from: C */
    public float f6525C;

    /* renamed from: D */
    public int f6526D;

    /* renamed from: E */
    public int f6527E;

    /* renamed from: F */
    public int f6528F;

    /* renamed from: G */
    public int f6529G;

    /* renamed from: H */
    public int f6530H;

    /* renamed from: I */
    public int f6531I;

    /* renamed from: J */
    public int f6532J;

    /* renamed from: K */
    public int f6533K;

    /* renamed from: L */
    public float f6534L;

    /* renamed from: M */
    public long f6535M;

    /* renamed from: N */
    public int f6536N;

    /* renamed from: O */
    public int f6537O;

    /* renamed from: P */
    public int f6538P;

    /* renamed from: Q */
    public int f6539Q;

    /* renamed from: R */
    public float f6540R;

    /* renamed from: a */
    public DividerType f6541a;

    /* renamed from: b */
    public Context f6542b;

    /* renamed from: c */
    public Handler f6543c;

    /* renamed from: d */
    public GestureDetector f6544d;

    /* renamed from: e */
    public InterfaceC8699b f6545e;

    /* renamed from: f */
    public boolean f6546f;

    /* renamed from: g */
    public boolean f6547g;

    /* renamed from: h */
    public ScheduledExecutorService f6548h;

    /* renamed from: i */
    public ScheduledFuture f6549i;

    /* renamed from: j */
    public TextPaint f6550j;

    /* renamed from: k */
    public TextPaint f6551k;

    /* renamed from: l */
    public Paint f6552l;

    /* renamed from: m */
    public InterfaceC8620a f6553m;

    /* renamed from: n */
    public String f6554n;

    /* renamed from: o */
    public int f6555o;

    /* renamed from: p */
    public int f6556p;

    /* renamed from: q */
    public int f6557q;

    /* renamed from: r */
    public int f6558r;

    /* renamed from: s */
    public float f6559s;

    /* renamed from: t */
    public Typeface f6560t;

    /* renamed from: u */
    public int f6561u;

    /* renamed from: v */
    public int f6562v;

    /* renamed from: w */
    public int f6563w;

    /* renamed from: x */
    public float f6564x;

    /* renamed from: y */
    public boolean f6565y;

    /* renamed from: z */
    public float f6566z;

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
    public class RunnableC6558a implements Runnable {
        public RunnableC6558a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WheelView.this.f6545e.mo14305a(WheelView.this.getCurrentItem());
        }
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6546f = false;
        this.f6547g = true;
        this.f6548h = Executors.newSingleThreadScheduledExecutor();
        this.f6560t = Typeface.MONOSPACE;
        this.f6564x = 1.6f;
        this.f6529G = 11;
        this.f6533K = 0;
        this.f6534L = 0.0f;
        this.f6535M = 0L;
        this.f6537O = 17;
        this.f6538P = 0;
        this.f6539Q = 0;
        this.f6555o = getResources().getDimensionPixelSize(R$dimen.default_wheel_view_text_size);
        float f10 = getResources().getDisplayMetrics().density;
        if (f10 < 1.0f) {
            this.f6540R = 2.4f;
        } else if (1.0f <= f10 && f10 < 1.5f) {
            this.f6540R = 3.6f;
        } else if (1.5f <= f10 && f10 < 2.0f) {
            this.f6540R = 4.5f;
        } else if (2.0f <= f10 && f10 < 3.0f) {
            this.f6540R = 6.0f;
        } else if (f10 >= 3.0f) {
            this.f6540R = f10 * 2.5f;
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.WheelView, 0, 0);
            this.f6537O = typedArrayObtainStyledAttributes.getInt(R$styleable.WheelView_wv_gravity, 17);
            this.f6561u = typedArrayObtainStyledAttributes.getColor(R$styleable.WheelView_wv_textColorOut, -5723992);
            this.f6562v = typedArrayObtainStyledAttributes.getColor(R$styleable.WheelView_wv_textColorCenter, -14013910);
            this.f6563w = typedArrayObtainStyledAttributes.getColor(R$styleable.WheelView_wv_dividerColor, -2763307);
            this.f6555o = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.WheelView_wv_textSize, this.f6555o);
            this.f6564x = typedArrayObtainStyledAttributes.getFloat(R$styleable.WheelView_wv_lineSpacingMultiplier, this.f6564x);
            typedArrayObtainStyledAttributes.recycle();
        }
        m5860j();
        m5856f(context);
    }

    /* renamed from: p */
    private void m5851p() {
        if (this.f6553m == null) {
            return;
        }
        m5861k();
        int i10 = (int) (this.f6559s * (this.f6529G - 1));
        this.f6530H = (int) ((i10 * 2) / 3.141592653589793d);
        this.f6532J = (int) (i10 / 3.141592653589793d);
        this.f6531I = View.MeasureSpec.getSize(this.f6536N);
        int i11 = this.f6530H;
        float f10 = this.f6559s;
        this.f6566z = (i11 - f10) / 2.0f;
        float f11 = (i11 + f10) / 2.0f;
        this.f6523A = f11;
        this.f6524B = (f11 - ((f10 - this.f6557q) / 2.0f)) - this.f6540R;
        if (this.f6526D == -1) {
            if (this.f6565y) {
                this.f6526D = (this.f6553m.mo14192a() + 1) / 2;
            } else {
                this.f6526D = 0;
            }
        }
        this.f6528F = this.f6526D;
    }

    /* renamed from: b */
    public void m5852b() {
        ScheduledFuture scheduledFuture = this.f6549i;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            return;
        }
        this.f6549i.cancel(true);
        this.f6549i = null;
    }

    /* renamed from: c */
    public final String m5853c(Object obj) {
        return obj == null ? "" : obj instanceof Integer ? String.format(Locale.getDefault(), TimeModel.ZERO_LEADING_NUMBER_FORMAT, obj) : obj.toString();
    }

    /* renamed from: d */
    public final int m5854d(int i10) {
        return i10 < 0 ? m5854d(i10 + this.f6553m.mo14192a()) : i10 > this.f6553m.mo14192a() + (-1) ? m5854d(i10 - this.f6553m.mo14192a()) : i10;
    }

    /* renamed from: e */
    public int m5855e(Paint paint, String str) {
        if (str == null || str.length() <= 0) {
            return 0;
        }
        int length = str.length();
        paint.getTextWidths(str, new float[length]);
        int iCeil = 0;
        for (int i10 = 0; i10 < length; i10++) {
            iCeil += (int) Math.ceil(r2[i10]);
        }
        return iCeil;
    }

    /* renamed from: f */
    public final void m5856f(Context context) {
        this.f6542b = context;
        this.f6543c = new HandlerC8821b(this);
        GestureDetector gestureDetector = new GestureDetector(context, new C8698a(this));
        this.f6544d = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.f6565y = true;
        this.f6525C = 0.0f;
        this.f6526D = -1;
        m5857g();
    }

    /* renamed from: g */
    public final void m5857g() {
        TextPaint textPaint = new TextPaint();
        this.f6550j = textPaint;
        textPaint.setColor(this.f6561u);
        this.f6550j.setAntiAlias(true);
        this.f6550j.setTypeface(this.f6560t);
        this.f6550j.setTextSize(this.f6555o);
        TextPaint textPaint2 = new TextPaint();
        this.f6551k = textPaint2;
        textPaint2.setColor(this.f6562v);
        this.f6551k.setAntiAlias(true);
        this.f6551k.setTextScaleX(1.1f);
        this.f6551k.setTypeface(this.f6560t);
        this.f6551k.setTextSize(this.f6555o);
        Paint paint = new Paint();
        this.f6552l = paint;
        paint.setColor(this.f6563w);
        this.f6552l.setAntiAlias(true);
        setLayerType(1, null);
    }

    public final InterfaceC8620a getAdapter() {
        return this.f6553m;
    }

    public final int getCurrentItem() {
        int i10;
        InterfaceC8620a interfaceC8620a = this.f6553m;
        if (interfaceC8620a == null) {
            return 0;
        }
        return (!this.f6565y || ((i10 = this.f6527E) >= 0 && i10 < interfaceC8620a.mo14192a())) ? Math.max(0, Math.min(this.f6527E, this.f6553m.mo14192a() - 1)) : Math.max(0, Math.min(Math.abs(Math.abs(this.f6527E) - this.f6553m.mo14192a()), this.f6553m.mo14192a() - 1));
    }

    @Override // android.view.View
    public Handler getHandler() {
        return this.f6543c;
    }

    public int getInitPosition() {
        return this.f6526D;
    }

    public float getItemHeight() {
        return this.f6559s;
    }

    public int getItemsCount() {
        InterfaceC8620a interfaceC8620a = this.f6553m;
        if (interfaceC8620a != null) {
            return interfaceC8620a.mo14192a();
        }
        return 0;
    }

    public float getTotalScrollY() {
        return this.f6525C;
    }

    /* renamed from: h */
    public void m5858h(boolean z9) {
        this.f6547g = z9;
    }

    /* renamed from: i */
    public boolean m5859i() {
        return this.f6565y;
    }

    /* renamed from: j */
    public final void m5860j() {
        float f10 = this.f6564x;
        if (f10 < 1.0f) {
            this.f6564x = 1.0f;
        } else if (f10 > 4.0f) {
            this.f6564x = 4.0f;
        }
    }

    /* renamed from: k */
    public final void m5861k() {
        Rect rect = new Rect();
        for (int i10 = 0; i10 < this.f6553m.mo14192a(); i10++) {
            String strM5853c = m5853c(this.f6553m.getItem(i10));
            this.f6551k.getTextBounds(strM5853c, 0, strM5853c.length(), rect);
            int iWidth = rect.width();
            if (iWidth > this.f6556p) {
                this.f6556p = iWidth;
            }
            this.f6551k.getTextBounds("星期", 0, 2, rect);
            this.f6557q = rect.height() + 2;
        }
        this.f6559s = this.f6564x * this.f6557q;
    }

    /* renamed from: l */
    public final void m5862l(String str) {
        String str2;
        Rect rect = new Rect();
        this.f6551k.getTextBounds(str, 0, str.length(), rect);
        int i10 = this.f6537O;
        if (i10 == 3) {
            this.f6538P = 0;
            return;
        }
        if (i10 == 5) {
            this.f6538P = (this.f6531I - rect.width()) - ((int) this.f6540R);
            return;
        }
        if (i10 != 17) {
            return;
        }
        if (this.f6546f || (str2 = this.f6554n) == null || "".equals(str2) || !this.f6547g) {
            this.f6538P = (int) ((this.f6531I - rect.width()) * 0.5d);
        } else {
            this.f6538P = (int) ((this.f6531I - rect.width()) * 0.25d);
        }
    }

    /* renamed from: m */
    public final void m5863m(String str) {
        String str2;
        Rect rect = new Rect();
        this.f6550j.getTextBounds(str, 0, str.length(), rect);
        int i10 = this.f6537O;
        if (i10 == 3) {
            this.f6539Q = 0;
            return;
        }
        if (i10 == 5) {
            this.f6539Q = (this.f6531I - rect.width()) - ((int) this.f6540R);
            return;
        }
        if (i10 != 17) {
            return;
        }
        if (this.f6546f || (str2 = this.f6554n) == null || "".equals(str2) || !this.f6547g) {
            this.f6539Q = (int) ((this.f6531I - rect.width()) * 0.5d);
        } else {
            this.f6539Q = (int) ((this.f6531I - rect.width()) * 0.25d);
        }
    }

    /* renamed from: n */
    public final void m5864n() {
        if (this.f6545e != null) {
            postDelayed(new RunnableC6558a(), 200L);
        }
    }

    /* renamed from: o */
    public final void m5865o(String str) {
        Rect rect = new Rect();
        this.f6551k.getTextBounds(str, 0, str.length(), rect);
        int i10 = this.f6555o;
        for (int iWidth = rect.width(); iWidth > this.f6531I; iWidth = rect.width()) {
            i10--;
            this.f6551k.setTextSize(i10);
            this.f6551k.getTextBounds(str, 0, str.length(), rect);
        }
        this.f6550j.setTextSize(i10);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z9;
        boolean z10;
        String strM5853c;
        float f10;
        float f11;
        if (this.f6553m == null) {
            return;
        }
        boolean z11 = false;
        int iMin = Math.min(Math.max(0, this.f6526D), this.f6553m.mo14192a() - 1);
        this.f6526D = iMin;
        Object[] objArr = new Object[this.f6529G];
        try {
            this.f6528F = iMin + (((int) (this.f6525C / this.f6559s)) % this.f6553m.mo14192a());
        } catch (ArithmeticException unused) {
            AbstractC8819c.m14781e("WheelView", "出错了！adapter.getItemsCount() == 0，联动数据不匹配");
        }
        if (this.f6565y) {
            if (this.f6528F < 0) {
                this.f6528F = this.f6553m.mo14192a() + this.f6528F;
            }
            if (this.f6528F > this.f6553m.mo14192a() - 1) {
                this.f6528F -= this.f6553m.mo14192a();
            }
        } else {
            if (this.f6528F < 0) {
                this.f6528F = 0;
            }
            if (this.f6528F > this.f6553m.mo14192a() - 1) {
                this.f6528F = this.f6553m.mo14192a() - 1;
            }
        }
        float f12 = this.f6525C % this.f6559s;
        int i10 = 0;
        while (true) {
            int i11 = this.f6529G;
            if (i10 >= i11) {
                break;
            }
            int i12 = this.f6528F - ((i11 / 2) - i10);
            if (this.f6565y) {
                objArr[i10] = this.f6553m.getItem(m5854d(i12));
            } else if (i12 < 0) {
                objArr[i10] = "";
            } else if (i12 > this.f6553m.mo14192a() - 1) {
                objArr[i10] = "";
            } else {
                objArr[i10] = this.f6553m.getItem(i12);
            }
            i10++;
        }
        boolean z12 = false;
        if (this.f6541a == DividerType.WRAP) {
            if (TextUtils.isEmpty(this.f6554n)) {
                f10 = this.f6531I - this.f6556p;
                f11 = 2.0f;
            } else {
                f10 = this.f6531I - this.f6556p;
                f11 = 4.0f;
            }
            float f13 = (f10 / f11) - 12.0f;
            if (f13 <= 0.0f) {
                f13 = 10.0f;
            }
            float f14 = f13;
            float f15 = this.f6531I - f14;
            float f16 = this.f6566z;
            canvas2 = canvas;
            canvas2.drawLine(f14, f16, f15, f16, this.f6552l);
            float f17 = this.f6523A;
            canvas2.drawLine(f14, f17, f15, f17, this.f6552l);
        } else {
            float f18 = this.f6566z;
            canvas.drawLine(0.0f, f18, this.f6531I, f18, this.f6552l);
            float f19 = this.f6523A;
            canvas2 = canvas;
            canvas2.drawLine(0.0f, f19, this.f6531I, f19, this.f6552l);
        }
        if (!TextUtils.isEmpty(this.f6554n) && this.f6547g) {
            canvas2.drawText(this.f6554n, (this.f6531I - m5855e(this.f6551k, this.f6554n)) - this.f6540R, this.f6524B, this.f6551k);
        }
        int i13 = 0;
        while (i13 < this.f6529G) {
            canvas2.save();
            double d10 = ((this.f6559s * i13) - f12) / this.f6532J;
            float f20 = (float) (90.0d - ((d10 / 3.141592653589793d) * 180.0d));
            if (f20 >= 90.0f || f20 <= -90.0f) {
                z9 = z11;
                z10 = z12;
                canvas2.restore();
            } else {
                float fPow = (float) Math.pow(Math.abs(f20) / 90.0f, 2.2d);
                if (this.f6547g || TextUtils.isEmpty(this.f6554n) || TextUtils.isEmpty(m5853c(objArr[i13]))) {
                    strM5853c = m5853c(objArr[i13]);
                } else {
                    strM5853c = m5853c(objArr[i13]) + this.f6554n;
                }
                m5865o(strM5853c);
                m5862l(strM5853c);
                m5863m(strM5853c);
                String str = strM5853c;
                float fCos = (float) ((this.f6532J - (Math.cos(d10) * this.f6532J)) - ((Math.sin(d10) * this.f6557q) / 2.0d));
                canvas2.translate(0.0f, fCos);
                float f21 = this.f6566z;
                if (fCos > f21 || this.f6557q + fCos < f21) {
                    float f22 = this.f6523A;
                    if (fCos > f22 || this.f6557q + fCos < f22) {
                        if (fCos >= f21) {
                            int i14 = this.f6557q;
                            if (i14 + fCos <= f22) {
                                canvas2.drawText(str, this.f6538P, i14 - this.f6540R, this.f6551k);
                                this.f6527E = this.f6528F - ((this.f6529G / 2) - i13);
                            }
                        }
                        canvas2.save();
                        z9 = false;
                        canvas2.clipRect(0, 0, this.f6531I, (int) this.f6559s);
                        canvas2.scale(1.0f, ((float) Math.sin(d10)) * 0.8f);
                        TextPaint textPaint = this.f6550j;
                        int i15 = this.f6558r;
                        z10 = false;
                        textPaint.setTextSkewX((i15 == 0 ? 0 : i15 > 0 ? 1 : -1) * (f20 <= 0.0f ? 1 : -1) * 0.5f * fPow);
                        this.f6550j.setAlpha((int) ((1.0f - fPow) * 255.0f));
                        canvas2.drawText(str, this.f6539Q + (this.f6558r * fPow), this.f6557q, this.f6550j);
                        canvas2.restore();
                        canvas2.restore();
                        this.f6551k.setTextSize(this.f6555o);
                    } else {
                        canvas2.save();
                        canvas2.clipRect(0.0f, 0.0f, this.f6531I, this.f6523A - fCos);
                        canvas2.scale(1.0f, ((float) Math.sin(d10)) * 1.0f);
                        canvas2.drawText(str, this.f6538P, this.f6557q - this.f6540R, this.f6551k);
                        canvas2.restore();
                        canvas2.save();
                        canvas2.clipRect(0.0f, this.f6523A - fCos, this.f6531I, (int) this.f6559s);
                        canvas2.scale(1.0f, ((float) Math.sin(d10)) * 0.8f);
                        canvas2.drawText(str, this.f6539Q, this.f6557q, this.f6550j);
                        canvas2.restore();
                    }
                } else {
                    canvas2.save();
                    canvas2.clipRect(0.0f, 0.0f, this.f6531I, this.f6566z - fCos);
                    canvas2.scale(1.0f, ((float) Math.sin(d10)) * 0.8f);
                    canvas2.drawText(str, this.f6539Q, this.f6557q, this.f6550j);
                    canvas2.restore();
                    canvas2.save();
                    canvas2.clipRect(0.0f, this.f6566z - fCos, this.f6531I, (int) this.f6559s);
                    canvas2.scale(1.0f, ((float) Math.sin(d10)) * 1.0f);
                    canvas2.drawText(str, this.f6538P, this.f6557q - this.f6540R, this.f6551k);
                    canvas2.restore();
                }
                z9 = false;
                z10 = false;
                canvas2.restore();
                this.f6551k.setTextSize(this.f6555o);
            }
            i13++;
            z11 = z9;
            z12 = z10;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        this.f6536N = i10;
        m5851p();
        setMeasuredDimension(this.f6531I, this.f6530H);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = this.f6544d.onTouchEvent(motionEvent);
        float f10 = (-this.f6526D) * this.f6559s;
        float fMo14192a = ((this.f6553m.mo14192a() - 1) - this.f6526D) * this.f6559s;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f6535M = System.currentTimeMillis();
            m5852b();
            this.f6534L = motionEvent.getRawY();
        } else {
            if (action == 2) {
                float rawY = this.f6534L - motionEvent.getRawY();
                this.f6534L = motionEvent.getRawY();
                float f11 = this.f6525C + rawY;
                this.f6525C = f11;
                if (!this.f6565y) {
                    float f12 = this.f6559s;
                    if ((f11 - (f12 * 0.25f) < f10 && rawY < 0.0f) || ((f12 * 0.25f) + f11 > fMo14192a && rawY > 0.0f)) {
                        this.f6525C = f11 - rawY;
                    }
                }
                return true;
            }
            if (!zOnTouchEvent) {
                float y9 = motionEvent.getY();
                int i10 = this.f6532J;
                double dAcos = Math.acos((i10 - y9) / i10) * this.f6532J;
                float f13 = this.f6559s;
                this.f6533K = (int) (((((int) ((dAcos + (f13 / 2.0f)) / f13)) - (this.f6529G / 2)) * f13) - (((this.f6525C % f13) + f13) % f13));
                if (System.currentTimeMillis() - this.f6535M > 120) {
                    m5867r(ACTION.DAGGLE);
                } else {
                    m5867r(ACTION.CLICK);
                }
            }
        }
        if (motionEvent.getAction() != 0) {
            invalidate();
        }
        return true;
    }

    /* renamed from: q */
    public final void m5866q(float f10) {
        m5852b();
        this.f6549i = this.f6548h.scheduleWithFixedDelay(new C8820a(this, f10), 0L, 5L, TimeUnit.MILLISECONDS);
    }

    /* renamed from: r */
    public void m5867r(ACTION action) {
        m5852b();
        if (action == ACTION.FLING || action == ACTION.DAGGLE) {
            float f10 = this.f6525C;
            float f11 = this.f6559s;
            int i10 = (int) (((f10 % f11) + f11) % f11);
            this.f6533K = i10;
            if (i10 > f11 / 2.0f) {
                this.f6533K = (int) (f11 - i10);
            } else {
                this.f6533K = -i10;
            }
        }
        this.f6549i = this.f6548h.scheduleWithFixedDelay(new C8822c(this, this.f6533K), 0L, 10L, TimeUnit.MILLISECONDS);
    }

    public final void setAdapter(InterfaceC8620a interfaceC8620a) {
        this.f6553m = interfaceC8620a;
        boolean z9 = this.f6530H <= 0;
        m5851p();
        if (z9) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final void setCurrentItem(int i10) {
        this.f6527E = i10;
        this.f6526D = i10;
        this.f6525C = 0.0f;
        invalidate();
    }

    public final void setCyclic(boolean z9) {
        this.f6565y = z9;
    }

    public void setDividerColor(int i10) {
        this.f6563w = i10;
        this.f6552l.setColor(i10);
    }

    public void setDividerType(DividerType dividerType) {
        this.f6541a = dividerType;
    }

    public void setGravity(int i10) {
        this.f6537O = i10;
    }

    public void setIsOptions(boolean z9) {
        this.f6546f = z9;
    }

    public void setLabel(String str) {
        this.f6554n = str;
    }

    public void setLineSpacingMultiplier(float f10) {
        if (f10 != 0.0f) {
            this.f6564x = f10;
            m5860j();
        }
    }

    public final void setOnItemSelectedListener(InterfaceC8699b interfaceC8699b) {
        this.f6545e = interfaceC8699b;
    }

    public void setTextColorCenter(int i10) {
        this.f6562v = i10;
        this.f6551k.setColor(i10);
    }

    public void setTextColorOut(int i10) {
        this.f6561u = i10;
        this.f6550j.setColor(i10);
    }

    public final void setTextSize(float f10) {
        if (f10 > 0.0f) {
            int i10 = (int) (this.f6542b.getResources().getDisplayMetrics().density * f10);
            this.f6555o = i10;
            this.f6550j.setTextSize(i10);
            this.f6551k.setTextSize(this.f6555o);
        }
    }

    public void setTextXOffset(int i10) {
        this.f6558r = i10;
        if (i10 != 0) {
            this.f6551k.setTextScaleX(1.0f);
        }
    }

    public void setTotalScrollY(float f10) {
        this.f6525C = f10;
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public final void setTypeface(Typeface typeface) {
        this.f6560t = typeface;
        this.f6550j.setTypeface(typeface);
        this.f6551k.setTypeface(this.f6560t);
    }
}
