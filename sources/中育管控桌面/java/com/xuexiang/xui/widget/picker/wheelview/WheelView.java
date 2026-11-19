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
import p120o2.InterfaceC7517a;
import p127p2.C7592a;
import p127p2.InterfaceC7593b;
import p134q2.C7621a;
import p134q2.C7623c;
import p134q2.HandlerC7622b;

/* loaded from: classes3.dex */
public class WheelView extends View implements HasTypeface {

    /* renamed from: A */
    public int f5248A;

    /* renamed from: B */
    public int f5249B;

    /* renamed from: C */
    public float f5250C;

    /* renamed from: D */
    public long f5251D;

    /* renamed from: E */
    public int f5252E;

    /* renamed from: F */
    public int f5253F;

    /* renamed from: G */
    public int f5254G;

    /* renamed from: H */
    public int f5255H;

    /* renamed from: I */
    public float f5256I;

    /* renamed from: a */
    public DividerType f5257a;

    /* renamed from: b */
    public Context f5258b;

    /* renamed from: c */
    public Handler f5259c;

    /* renamed from: d */
    public GestureDetector f5260d;

    /* renamed from: e */
    public boolean f5261e;

    /* renamed from: f */
    public boolean f5262f;

    /* renamed from: g */
    public ScheduledExecutorService f5263g;

    /* renamed from: h */
    public ScheduledFuture f5264h;

    /* renamed from: i */
    public TextPaint f5265i;

    /* renamed from: j */
    public TextPaint f5266j;

    /* renamed from: k */
    public Paint f5267k;

    /* renamed from: l */
    public String f5268l;

    /* renamed from: m */
    public int f5269m;

    /* renamed from: n */
    public int f5270n;

    /* renamed from: o */
    public float f5271o;

    /* renamed from: p */
    public Typeface f5272p;

    /* renamed from: q */
    public int f5273q;

    /* renamed from: r */
    public int f5274r;

    /* renamed from: s */
    public int f5275s;

    /* renamed from: t */
    public float f5276t;

    /* renamed from: u */
    public boolean f5277u;

    /* renamed from: v */
    public float f5278v;

    /* renamed from: w */
    public int f5279w;

    /* renamed from: x */
    public int f5280x;

    /* renamed from: y */
    public int f5281y;

    /* renamed from: z */
    public int f5282z;

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
        this.f5261e = false;
        this.f5262f = true;
        this.f5263g = Executors.newSingleThreadScheduledExecutor();
        this.f5272p = Typeface.MONOSPACE;
        this.f5276t = 1.6f;
        this.f5281y = 11;
        this.f5249B = 0;
        this.f5250C = 0.0f;
        this.f5251D = 0L;
        this.f5253F = 17;
        this.f5254G = 0;
        this.f5255H = 0;
        this.f5269m = getResources().getDimensionPixelSize(R$dimen.default_wheel_view_text_size);
        float f6 = getResources().getDisplayMetrics().density;
        if (f6 < 1.0f) {
            this.f5256I = 2.4f;
        } else if (1.0f <= f6 && f6 < 1.5f) {
            this.f5256I = 3.6f;
        } else if (1.5f <= f6 && f6 < 2.0f) {
            this.f5256I = 4.5f;
        } else if (2.0f <= f6 && f6 < 3.0f) {
            this.f5256I = 6.0f;
        } else if (f6 >= 3.0f) {
            this.f5256I = f6 * 2.5f;
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.WheelView, 0, 0);
            this.f5253F = typedArrayObtainStyledAttributes.getInt(R$styleable.WheelView_wv_gravity, 17);
            this.f5273q = typedArrayObtainStyledAttributes.getColor(R$styleable.WheelView_wv_textColorOut, -5723992);
            this.f5274r = typedArrayObtainStyledAttributes.getColor(R$styleable.WheelView_wv_textColorCenter, -14013910);
            this.f5275s = typedArrayObtainStyledAttributes.getColor(R$styleable.WheelView_wv_dividerColor, -2763307);
            this.f5269m = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.WheelView_wv_textSize, this.f5269m);
            this.f5276t = typedArrayObtainStyledAttributes.getFloat(R$styleable.WheelView_wv_lineSpacingMultiplier, this.f5276t);
            typedArrayObtainStyledAttributes.recycle();
        }
        m4874e();
        m4871b(context);
    }

    /* renamed from: g */
    private void m4869g() {
    }

    /* renamed from: a */
    public void m4870a() {
        ScheduledFuture scheduledFuture = this.f5264h;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            return;
        }
        this.f5264h.cancel(true);
        this.f5264h = null;
    }

    /* renamed from: b */
    public final void m4871b(Context context) {
        this.f5258b = context;
        this.f5259c = new HandlerC7622b(this);
        GestureDetector gestureDetector = new GestureDetector(context, new C7592a(this));
        this.f5260d = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.f5277u = true;
        this.f5278v = 0.0f;
        this.f5279w = -1;
        m4872c();
    }

    /* renamed from: c */
    public final void m4872c() {
        TextPaint textPaint = new TextPaint();
        this.f5265i = textPaint;
        textPaint.setColor(this.f5273q);
        this.f5265i.setAntiAlias(true);
        this.f5265i.setTypeface(this.f5272p);
        this.f5265i.setTextSize(this.f5269m);
        TextPaint textPaint2 = new TextPaint();
        this.f5266j = textPaint2;
        textPaint2.setColor(this.f5274r);
        this.f5266j.setAntiAlias(true);
        this.f5266j.setTextScaleX(1.1f);
        this.f5266j.setTypeface(this.f5272p);
        this.f5266j.setTextSize(this.f5269m);
        Paint paint = new Paint();
        this.f5267k = paint;
        paint.setColor(this.f5275s);
        this.f5267k.setAntiAlias(true);
        setLayerType(1, null);
    }

    /* renamed from: d */
    public boolean m4873d() {
        return this.f5277u;
    }

    /* renamed from: e */
    public final void m4874e() {
        float f6 = this.f5276t;
        if (f6 < 1.0f) {
            this.f5276t = 1.0f;
        } else if (f6 > 4.0f) {
            this.f5276t = 4.0f;
        }
    }

    /* renamed from: f */
    public final void m4875f() {
    }

    public final InterfaceC7517a getAdapter() {
        return null;
    }

    public final int getCurrentItem() {
        return 0;
    }

    @Override // android.view.View
    public Handler getHandler() {
        return this.f5259c;
    }

    public int getInitPosition() {
        return this.f5279w;
    }

    public float getItemHeight() {
        return this.f5271o;
    }

    public int getItemsCount() {
        return 0;
    }

    public float getTotalScrollY() {
        return this.f5278v;
    }

    /* renamed from: h */
    public final void m4876h(float f6) {
        m4870a();
        this.f5264h = this.f5263g.scheduleWithFixedDelay(new C7621a(this, f6), 0L, 5L, TimeUnit.MILLISECONDS);
    }

    /* renamed from: i */
    public void m4877i(ACTION action) {
        m4870a();
        if (action == ACTION.FLING || action == ACTION.DAGGLE) {
            float f6 = this.f5278v;
            float f7 = this.f5271o;
            int i6 = (int) (((f6 % f7) + f7) % f7);
            this.f5249B = i6;
            if (i6 > f7 / 2.0f) {
                this.f5249B = (int) (f7 - i6);
            } else {
                this.f5249B = -i6;
            }
        }
        this.f5264h = this.f5263g.scheduleWithFixedDelay(new C7623c(this, this.f5249B), 0L, 10L, TimeUnit.MILLISECONDS);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i6, int i7) {
        this.f5252E = i6;
        m4869g();
        setMeasuredDimension(this.f5248A, this.f5282z);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f5260d.onTouchEvent(motionEvent);
        throw null;
    }

    public final void setAdapter(InterfaceC7517a interfaceC7517a) {
        boolean z6 = this.f5282z <= 0;
        m4869g();
        if (z6) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final void setCurrentItem(int i6) {
        this.f5280x = i6;
        this.f5279w = i6;
        this.f5278v = 0.0f;
        invalidate();
    }

    public final void setCyclic(boolean z6) {
        this.f5277u = z6;
    }

    public void setDividerColor(int i6) {
        this.f5275s = i6;
        this.f5267k.setColor(i6);
    }

    public void setDividerType(DividerType dividerType) {
        this.f5257a = dividerType;
    }

    public void setGravity(int i6) {
        this.f5253F = i6;
    }

    public void setIsOptions(boolean z6) {
        this.f5261e = z6;
    }

    public void setLabel(String str) {
        this.f5268l = str;
    }

    public void setLineSpacingMultiplier(float f6) {
        if (f6 != 0.0f) {
            this.f5276t = f6;
            m4874e();
        }
    }

    public void setTextColorCenter(int i6) {
        this.f5274r = i6;
        this.f5266j.setColor(i6);
    }

    public void setTextColorOut(int i6) {
        this.f5273q = i6;
        this.f5265i.setColor(i6);
    }

    public final void setTextSize(float f6) {
        if (f6 > 0.0f) {
            int i6 = (int) (this.f5258b.getResources().getDisplayMetrics().density * f6);
            this.f5269m = i6;
            this.f5265i.setTextSize(i6);
            this.f5266j.setTextSize(this.f5269m);
        }
    }

    public void setTextXOffset(int i6) {
        this.f5270n = i6;
        if (i6 != 0) {
            this.f5266j.setTextScaleX(1.0f);
        }
    }

    public void setTotalScrollY(float f6) {
        this.f5278v = f6;
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public final void setTypeface(Typeface typeface) {
        this.f5272p = typeface;
        this.f5265i.setTypeface(typeface);
        this.f5266j.setTypeface(this.f5272p);
    }

    public final void setOnItemSelectedListener(InterfaceC7593b interfaceC7593b) {
    }
}
