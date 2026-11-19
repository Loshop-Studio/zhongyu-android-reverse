package com.xuexiang.xui.widget.picker.wheelview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.xuexiang.xui.R$dimen;
import com.xuexiang.xui.R$styleable;
import io.github.inflationx.calligraphy3.HasTypeface;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p053e1.InterfaceC3724a;
import p058f1.C3732a;
import p058f1.InterfaceC3733b;
import p063g1.C3751a;
import p063g1.C3753c;
import p063g1.HandlerC3752b;

/* loaded from: classes2.dex */
public class WheelView extends View implements HasTypeface {

    /* renamed from: A */
    public int f3727A;

    /* renamed from: B */
    public int f3728B;

    /* renamed from: C */
    public float f3729C;

    /* renamed from: D */
    public long f3730D;

    /* renamed from: E */
    public int f3731E;

    /* renamed from: F */
    public int f3732F;

    /* renamed from: G */
    public int f3733G;

    /* renamed from: H */
    public int f3734H;

    /* renamed from: I */
    public float f3735I;

    /* renamed from: a */
    public DividerType f3736a;

    /* renamed from: b */
    public Context f3737b;

    /* renamed from: c */
    public Handler f3738c;

    /* renamed from: d */
    public GestureDetector f3739d;

    /* renamed from: e */
    public boolean f3740e;

    /* renamed from: f */
    public boolean f3741f;

    /* renamed from: g */
    public ScheduledExecutorService f3742g;

    /* renamed from: h */
    public ScheduledFuture f3743h;

    /* renamed from: i */
    public TextPaint f3744i;

    /* renamed from: j */
    public TextPaint f3745j;

    /* renamed from: k */
    public Paint f3746k;

    /* renamed from: l */
    public String f3747l;

    /* renamed from: m */
    public int f3748m;

    /* renamed from: n */
    public int f3749n;

    /* renamed from: o */
    public float f3750o;

    /* renamed from: p */
    public Typeface f3751p;

    /* renamed from: q */
    public int f3752q;

    /* renamed from: r */
    public int f3753r;

    /* renamed from: s */
    public int f3754s;

    /* renamed from: t */
    public float f3755t;

    /* renamed from: u */
    public boolean f3756u;

    /* renamed from: v */
    public float f3757v;

    /* renamed from: w */
    public int f3758w;

    /* renamed from: x */
    public int f3759x;

    /* renamed from: y */
    public int f3760y;

    /* renamed from: z */
    public int f3761z;

    public enum ACTION {
        CLICK,
        FLING,
        DAGGLE
    }

    public enum DividerType {
        FILL,
        WRAP
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3740e = false;
        this.f3741f = true;
        this.f3742g = Executors.newSingleThreadScheduledExecutor();
        this.f3751p = Typeface.MONOSPACE;
        this.f3755t = 1.6f;
        this.f3760y = 11;
        this.f3728B = 0;
        this.f3729C = 0.0f;
        this.f3730D = 0L;
        this.f3732F = 17;
        this.f3733G = 0;
        this.f3734H = 0;
        this.f3748m = getResources().getDimensionPixelSize(R$dimen.default_wheel_view_text_size);
        float f4 = getResources().getDisplayMetrics().density;
        if (f4 < 1.0f) {
            this.f3735I = 2.4f;
        } else if (1.0f <= f4 && f4 < 1.5f) {
            this.f3735I = 3.6f;
        } else if (1.5f <= f4 && f4 < 2.0f) {
            this.f3735I = 4.5f;
        } else if (2.0f <= f4 && f4 < 3.0f) {
            this.f3735I = 6.0f;
        } else if (f4 >= 3.0f) {
            this.f3735I = f4 * 2.5f;
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.WheelView, 0, 0);
            this.f3732F = typedArrayObtainStyledAttributes.getInt(R$styleable.WheelView_wv_gravity, 17);
            this.f3752q = typedArrayObtainStyledAttributes.getColor(R$styleable.WheelView_wv_textColorOut, -5723992);
            this.f3753r = typedArrayObtainStyledAttributes.getColor(R$styleable.WheelView_wv_textColorCenter, -14013910);
            this.f3754s = typedArrayObtainStyledAttributes.getColor(R$styleable.WheelView_wv_dividerColor, -2763307);
            this.f3748m = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.WheelView_wv_textSize, this.f3748m);
            this.f3755t = typedArrayObtainStyledAttributes.getFloat(R$styleable.WheelView_wv_lineSpacingMultiplier, this.f3755t);
            typedArrayObtainStyledAttributes.recycle();
        }
        m4495e();
        m4492b(context);
    }

    /* renamed from: a */
    public void m4491a() {
        ScheduledFuture scheduledFuture = this.f3743h;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            return;
        }
        this.f3743h.cancel(true);
        this.f3743h = null;
    }

    /* renamed from: b */
    public final void m4492b(Context context) {
        this.f3737b = context;
        this.f3738c = new HandlerC3752b(this);
        GestureDetector gestureDetector = new GestureDetector(context, new C3732a(this));
        this.f3739d = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.f3756u = true;
        this.f3757v = 0.0f;
        this.f3758w = -1;
        m4493c();
    }

    /* renamed from: c */
    public final void m4493c() {
        TextPaint textPaint = new TextPaint();
        this.f3744i = textPaint;
        textPaint.setColor(this.f3752q);
        this.f3744i.setAntiAlias(true);
        this.f3744i.setTypeface(this.f3751p);
        this.f3744i.setTextSize(this.f3748m);
        TextPaint textPaint2 = new TextPaint();
        this.f3745j = textPaint2;
        textPaint2.setColor(this.f3753r);
        this.f3745j.setAntiAlias(true);
        this.f3745j.setTextScaleX(1.1f);
        this.f3745j.setTypeface(this.f3751p);
        this.f3745j.setTextSize(this.f3748m);
        Paint paint = new Paint();
        this.f3746k = paint;
        paint.setColor(this.f3754s);
        this.f3746k.setAntiAlias(true);
        setLayerType(1, null);
    }

    /* renamed from: d */
    public boolean m4494d() {
        return this.f3756u;
    }

    /* renamed from: e */
    public final void m4495e() {
        float f4 = this.f3755t;
        if (f4 < 1.0f) {
            this.f3755t = 1.0f;
        } else if (f4 > 4.0f) {
            this.f3755t = 4.0f;
        }
    }

    /* renamed from: f */
    public final void m4496f() {
    }

    /* renamed from: g */
    public final void m4497g() {
    }

    public final InterfaceC3724a getAdapter() {
        return null;
    }

    public final int getCurrentItem() {
        return 0;
    }

    @Override // android.view.View
    public Handler getHandler() {
        return this.f3738c;
    }

    public int getInitPosition() {
        return this.f3758w;
    }

    public float getItemHeight() {
        return this.f3750o;
    }

    public int getItemsCount() {
        return 0;
    }

    public float getTotalScrollY() {
        return this.f3757v;
    }

    /* renamed from: h */
    public final void m4498h(float f4) {
        m4491a();
        this.f3743h = this.f3742g.scheduleWithFixedDelay(new C3751a(this, f4), 0L, 5L, TimeUnit.MILLISECONDS);
    }

    /* renamed from: i */
    public void m4499i(ACTION action) {
        m4491a();
        if (action == ACTION.FLING || action == ACTION.DAGGLE) {
            float f4 = this.f3757v;
            float f5 = this.f3750o;
            int i4 = (int) (((f4 % f5) + f5) % f5);
            this.f3728B = i4;
            if (i4 > f5 / 2.0f) {
                this.f3728B = (int) (f5 - i4);
            } else {
                this.f3728B = -i4;
            }
        }
        this.f3743h = this.f3742g.scheduleWithFixedDelay(new C3753c(this, this.f3728B), 0L, 10L, TimeUnit.MILLISECONDS);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i4, int i5) {
        this.f3731E = i4;
        m4497g();
        setMeasuredDimension(this.f3727A, this.f3761z);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f3739d.onTouchEvent(motionEvent);
        throw null;
    }

    public final void setAdapter(InterfaceC3724a interfaceC3724a) {
        m4497g();
        invalidate();
    }

    public final void setCurrentItem(int i4) {
        this.f3759x = i4;
        this.f3758w = i4;
        this.f3757v = 0.0f;
        invalidate();
    }

    public final void setCyclic(boolean z3) {
        this.f3756u = z3;
    }

    public void setDividerColor(int i4) {
        this.f3754s = i4;
        this.f3746k.setColor(i4);
    }

    public void setDividerType(DividerType dividerType) {
        this.f3736a = dividerType;
    }

    public void setGravity(int i4) {
        this.f3732F = i4;
    }

    public void setIsOptions(boolean z3) {
        this.f3740e = z3;
    }

    public void setLabel(String str) {
        this.f3747l = str;
    }

    public void setLineSpacingMultiplier(float f4) {
        if (f4 != 0.0f) {
            this.f3755t = f4;
            m4495e();
        }
    }

    public final void setOnItemSelectedListener(InterfaceC3733b interfaceC3733b) {
    }

    public void setTextColorCenter(int i4) {
        this.f3753r = i4;
        this.f3745j.setColor(i4);
    }

    public void setTextColorOut(int i4) {
        this.f3752q = i4;
        this.f3744i.setColor(i4);
    }

    public final void setTextSize(float f4) {
        if (f4 > 0.0f) {
            int i4 = (int) (this.f3737b.getResources().getDisplayMetrics().density * f4);
            this.f3748m = i4;
            this.f3744i.setTextSize(i4);
            this.f3745j.setTextSize(this.f3748m);
        }
    }

    public void setTextXOffset(int i4) {
        this.f3749n = i4;
        if (i4 != 0) {
            this.f3745j.setTextScaleX(1.0f);
        }
    }

    public void setTotalScrollY(float f4) {
        this.f3757v = f4;
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public final void setTypeface(Typeface typeface) {
        this.f3751p = typeface;
        this.f3744i.setTypeface(typeface);
        this.f3745j.setTypeface(this.f3751p);
    }
}
