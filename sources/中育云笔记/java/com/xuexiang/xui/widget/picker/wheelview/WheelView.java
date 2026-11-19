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
import p010a9.C0088a;
import p010a9.InterfaceC0089b;
import p035b9.C5176a;
import p035b9.C5178c;
import p035b9.HandlerC5177b;
import p436z8.InterfaceC12026a;

/* loaded from: classes5.dex */
public class WheelView extends View implements HasTypeface {

    /* renamed from: A */
    public int f16558A;

    /* renamed from: B */
    public int f16559B;

    /* renamed from: C */
    public int f16560C;

    /* renamed from: D */
    public int f16561D;

    /* renamed from: E */
    public float f16562E;

    /* renamed from: F */
    public long f16563F;

    /* renamed from: G */
    public int f16564G;

    /* renamed from: H */
    public int f16565H;

    /* renamed from: I */
    public int f16566I;

    /* renamed from: J */
    public int f16567J;

    /* renamed from: K */
    public float f16568K;

    /* renamed from: c */
    public DividerType f16569c;

    /* renamed from: d */
    public Context f16570d;

    /* renamed from: e */
    public Handler f16571e;

    /* renamed from: f */
    public GestureDetector f16572f;

    /* renamed from: g */
    public boolean f16573g;

    /* renamed from: h */
    public boolean f16574h;

    /* renamed from: i */
    public ScheduledExecutorService f16575i;

    /* renamed from: j */
    public ScheduledFuture f16576j;

    /* renamed from: k */
    public TextPaint f16577k;

    /* renamed from: l */
    public TextPaint f16578l;

    /* renamed from: m */
    public Paint f16579m;

    /* renamed from: n */
    public String f16580n;

    /* renamed from: o */
    public int f16581o;

    /* renamed from: p */
    public int f16582p;

    /* renamed from: q */
    public float f16583q;

    /* renamed from: r */
    public Typeface f16584r;

    /* renamed from: s */
    public int f16585s;

    /* renamed from: t */
    public int f16586t;

    /* renamed from: u */
    public int f16587u;

    /* renamed from: v */
    public float f16588v;

    /* renamed from: w */
    public boolean f16589w;

    /* renamed from: x */
    public float f16590x;

    /* renamed from: y */
    public int f16591y;

    /* renamed from: z */
    public int f16592z;

    public enum ACTION {
        CLICK,
        FLING,
        DAGGLE
    }

    public enum DividerType {
        FILL,
        WRAP
    }

    public WheelView(Context context) {
        this(context, null);
    }

    /* renamed from: g */
    private void m13016g() {
    }

    /* renamed from: a */
    public void m13017a() {
        ScheduledFuture scheduledFuture = this.f16576j;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            return;
        }
        this.f16576j.cancel(true);
        this.f16576j = null;
    }

    /* renamed from: b */
    public final void m13018b(Context context) {
        this.f16570d = context;
        this.f16571e = new HandlerC5177b(this);
        GestureDetector gestureDetector = new GestureDetector(context, new C0088a(this));
        this.f16572f = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.f16589w = true;
        this.f16590x = 0.0f;
        this.f16591y = -1;
        m13019c();
    }

    /* renamed from: c */
    public final void m13019c() {
        TextPaint textPaint = new TextPaint();
        this.f16577k = textPaint;
        textPaint.setColor(this.f16585s);
        this.f16577k.setAntiAlias(true);
        this.f16577k.setTypeface(this.f16584r);
        this.f16577k.setTextSize(this.f16581o);
        TextPaint textPaint2 = new TextPaint();
        this.f16578l = textPaint2;
        textPaint2.setColor(this.f16586t);
        this.f16578l.setAntiAlias(true);
        this.f16578l.setTextScaleX(1.1f);
        this.f16578l.setTypeface(this.f16584r);
        this.f16578l.setTextSize(this.f16581o);
        Paint paint = new Paint();
        this.f16579m = paint;
        paint.setColor(this.f16587u);
        this.f16579m.setAntiAlias(true);
        setLayerType(1, null);
    }

    /* renamed from: d */
    public boolean m13020d() {
        return this.f16589w;
    }

    /* renamed from: e */
    public final void m13021e() {
        float f10 = this.f16588v;
        if (f10 < 1.0f) {
            this.f16588v = 1.0f;
        } else if (f10 > 4.0f) {
            this.f16588v = 4.0f;
        }
    }

    /* renamed from: f */
    public final void m13022f() {
    }

    public final InterfaceC12026a getAdapter() {
        return null;
    }

    public final int getCurrentItem() {
        return 0;
    }

    @Override // android.view.View
    public Handler getHandler() {
        return this.f16571e;
    }

    public int getInitPosition() {
        return this.f16591y;
    }

    public float getItemHeight() {
        return this.f16583q;
    }

    public int getItemsCount() {
        return 0;
    }

    public float getTotalScrollY() {
        return this.f16590x;
    }

    /* renamed from: h */
    public final void m13023h(float f10) {
        m13017a();
        this.f16576j = this.f16575i.scheduleWithFixedDelay(new C5176a(this, f10), 0L, 5L, TimeUnit.MILLISECONDS);
    }

    /* renamed from: i */
    public void m13024i(ACTION action) {
        m13017a();
        if (action == ACTION.FLING || action == ACTION.DAGGLE) {
            float f10 = this.f16590x;
            float f11 = this.f16583q;
            int i10 = (int) (((f10 % f11) + f11) % f11);
            this.f16561D = i10;
            if (i10 > f11 / 2.0f) {
                this.f16561D = (int) (f11 - i10);
            } else {
                this.f16561D = -i10;
            }
        }
        this.f16576j = this.f16575i.scheduleWithFixedDelay(new C5178c(this, this.f16561D), 0L, 10L, TimeUnit.MILLISECONDS);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        this.f16564G = i10;
        m13016g();
        setMeasuredDimension(this.f16560C, this.f16559B);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f16572f.onTouchEvent(motionEvent);
        throw null;
    }

    public final void setAdapter(InterfaceC12026a interfaceC12026a) {
        m13016g();
        invalidate();
    }

    public final void setCurrentItem(int i10) {
        this.f16592z = i10;
        this.f16591y = i10;
        this.f16590x = 0.0f;
        invalidate();
    }

    public final void setCyclic(boolean z10) {
        this.f16589w = z10;
    }

    public void setDividerColor(int i10) {
        this.f16587u = i10;
        this.f16579m.setColor(i10);
    }

    public void setDividerType(DividerType dividerType) {
        this.f16569c = dividerType;
    }

    public void setGravity(int i10) {
        this.f16565H = i10;
    }

    public void setIsOptions(boolean z10) {
        this.f16573g = z10;
    }

    public void setLabel(String str) {
        this.f16580n = str;
    }

    public void setLineSpacingMultiplier(float f10) {
        if (f10 != 0.0f) {
            this.f16588v = f10;
            m13021e();
        }
    }

    public void setTextColorCenter(int i10) {
        this.f16586t = i10;
        this.f16578l.setColor(i10);
    }

    public void setTextColorOut(int i10) {
        this.f16585s = i10;
        this.f16577k.setColor(i10);
    }

    public final void setTextSize(float f10) {
        if (f10 > 0.0f) {
            int i10 = (int) (this.f16570d.getResources().getDisplayMetrics().density * f10);
            this.f16581o = i10;
            this.f16577k.setTextSize(i10);
            this.f16578l.setTextSize(this.f16581o);
        }
    }

    public void setTextXOffset(int i10) {
        this.f16582p = i10;
        if (i10 != 0) {
            this.f16578l.setTextScaleX(1.0f);
        }
    }

    public void setTotalScrollY(float f10) {
        this.f16590x = f10;
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public final void setTypeface(Typeface typeface) {
        this.f16584r = typeface;
        this.f16577k.setTypeface(typeface);
        this.f16578l.setTypeface(this.f16584r);
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16573g = false;
        this.f16574h = true;
        this.f16575i = Executors.newSingleThreadScheduledExecutor();
        this.f16584r = Typeface.MONOSPACE;
        this.f16588v = 1.6f;
        this.f16558A = 11;
        this.f16561D = 0;
        this.f16562E = 0.0f;
        this.f16563F = 0L;
        this.f16565H = 17;
        this.f16566I = 0;
        this.f16567J = 0;
        this.f16581o = getResources().getDimensionPixelSize(R$dimen.default_wheel_view_text_size);
        float f10 = getResources().getDisplayMetrics().density;
        if (f10 < 1.0f) {
            this.f16568K = 2.4f;
        } else if (1.0f <= f10 && f10 < 1.5f) {
            this.f16568K = 3.6f;
        } else if (1.5f <= f10 && f10 < 2.0f) {
            this.f16568K = 4.5f;
        } else if (2.0f <= f10 && f10 < 3.0f) {
            this.f16568K = 6.0f;
        } else if (f10 >= 3.0f) {
            this.f16568K = f10 * 2.5f;
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.WheelView, 0, 0);
            this.f16565H = typedArrayObtainStyledAttributes.getInt(R$styleable.WheelView_wv_gravity, 17);
            this.f16585s = typedArrayObtainStyledAttributes.getColor(R$styleable.WheelView_wv_textColorOut, -5723992);
            this.f16586t = typedArrayObtainStyledAttributes.getColor(R$styleable.WheelView_wv_textColorCenter, -14013910);
            this.f16587u = typedArrayObtainStyledAttributes.getColor(R$styleable.WheelView_wv_dividerColor, -2763307);
            this.f16581o = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.WheelView_wv_textSize, this.f16581o);
            this.f16588v = typedArrayObtainStyledAttributes.getFloat(R$styleable.WheelView_wv_lineSpacingMultiplier, this.f16588v);
            typedArrayObtainStyledAttributes.recycle();
        }
        m13021e();
        m13018b(context);
    }

    public final void setOnItemSelectedListener(InterfaceC0089b interfaceC0089b) {
    }
}
