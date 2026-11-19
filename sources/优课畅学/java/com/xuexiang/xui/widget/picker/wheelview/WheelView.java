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
import p174m2.InterfaceC9296a;
import p185n2.C9364a;
import p185n2.InterfaceC9365b;
import p196o2.C9512a;
import p196o2.C9514c;
import p196o2.HandlerC9513b;

/* loaded from: classes4.dex */
public class WheelView extends View implements HasTypeface {

    /* renamed from: A */
    public int f7940A;

    /* renamed from: B */
    public int f7941B;

    /* renamed from: C */
    public float f7942C;

    /* renamed from: D */
    public long f7943D;

    /* renamed from: E */
    public int f7944E;

    /* renamed from: F */
    public int f7945F;

    /* renamed from: G */
    public int f7946G;

    /* renamed from: H */
    public int f7947H;

    /* renamed from: I */
    public float f7948I;

    /* renamed from: a */
    public DividerType f7949a;

    /* renamed from: b */
    public Context f7950b;

    /* renamed from: c */
    public Handler f7951c;

    /* renamed from: d */
    public GestureDetector f7952d;

    /* renamed from: e */
    public boolean f7953e;

    /* renamed from: f */
    public boolean f7954f;

    /* renamed from: g */
    public ScheduledExecutorService f7955g;

    /* renamed from: h */
    public ScheduledFuture f7956h;

    /* renamed from: i */
    public TextPaint f7957i;

    /* renamed from: j */
    public TextPaint f7958j;

    /* renamed from: k */
    public Paint f7959k;

    /* renamed from: l */
    public String f7960l;

    /* renamed from: m */
    public int f7961m;

    /* renamed from: n */
    public int f7962n;

    /* renamed from: o */
    public float f7963o;

    /* renamed from: p */
    public Typeface f7964p;

    /* renamed from: q */
    public int f7965q;

    /* renamed from: r */
    public int f7966r;

    /* renamed from: s */
    public int f7967s;

    /* renamed from: t */
    public float f7968t;

    /* renamed from: u */
    public boolean f7969u;

    /* renamed from: v */
    public float f7970v;

    /* renamed from: w */
    public int f7971w;

    /* renamed from: x */
    public int f7972x;

    /* renamed from: y */
    public int f7973y;

    /* renamed from: z */
    public int f7974z;

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
        this.f7953e = false;
        this.f7954f = true;
        this.f7955g = Executors.newSingleThreadScheduledExecutor();
        this.f7964p = Typeface.MONOSPACE;
        this.f7968t = 1.6f;
        this.f7973y = 11;
        this.f7941B = 0;
        this.f7942C = 0.0f;
        this.f7943D = 0L;
        this.f7945F = 17;
        this.f7946G = 0;
        this.f7947H = 0;
        this.f7961m = getResources().getDimensionPixelSize(R$dimen.default_wheel_view_text_size);
        float f10 = getResources().getDisplayMetrics().density;
        if (f10 < 1.0f) {
            this.f7948I = 2.4f;
        } else if (1.0f <= f10 && f10 < 1.5f) {
            this.f7948I = 3.6f;
        } else if (1.5f <= f10 && f10 < 2.0f) {
            this.f7948I = 4.5f;
        } else if (2.0f <= f10 && f10 < 3.0f) {
            this.f7948I = 6.0f;
        } else if (f10 >= 3.0f) {
            this.f7948I = f10 * 2.5f;
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.WheelView, 0, 0);
            this.f7945F = typedArrayObtainStyledAttributes.getInt(R$styleable.WheelView_wv_gravity, 17);
            this.f7965q = typedArrayObtainStyledAttributes.getColor(R$styleable.WheelView_wv_textColorOut, -5723992);
            this.f7966r = typedArrayObtainStyledAttributes.getColor(R$styleable.WheelView_wv_textColorCenter, -14013910);
            this.f7967s = typedArrayObtainStyledAttributes.getColor(R$styleable.WheelView_wv_dividerColor, -2763307);
            this.f7961m = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.WheelView_wv_textSize, this.f7961m);
            this.f7968t = typedArrayObtainStyledAttributes.getFloat(R$styleable.WheelView_wv_lineSpacingMultiplier, this.f7968t);
            typedArrayObtainStyledAttributes.recycle();
        }
        m7049e();
        m7046b(context);
    }

    /* renamed from: g */
    private void m7044g() {
    }

    /* renamed from: a */
    public void m7045a() {
        ScheduledFuture scheduledFuture = this.f7956h;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            return;
        }
        this.f7956h.cancel(true);
        this.f7956h = null;
    }

    /* renamed from: b */
    public final void m7046b(Context context) {
        this.f7950b = context;
        this.f7951c = new HandlerC9513b(this);
        GestureDetector gestureDetector = new GestureDetector(context, new C9364a(this));
        this.f7952d = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.f7969u = true;
        this.f7970v = 0.0f;
        this.f7971w = -1;
        m7047c();
    }

    /* renamed from: c */
    public final void m7047c() {
        TextPaint textPaint = new TextPaint();
        this.f7957i = textPaint;
        textPaint.setColor(this.f7965q);
        this.f7957i.setAntiAlias(true);
        this.f7957i.setTypeface(this.f7964p);
        this.f7957i.setTextSize(this.f7961m);
        TextPaint textPaint2 = new TextPaint();
        this.f7958j = textPaint2;
        textPaint2.setColor(this.f7966r);
        this.f7958j.setAntiAlias(true);
        this.f7958j.setTextScaleX(1.1f);
        this.f7958j.setTypeface(this.f7964p);
        this.f7958j.setTextSize(this.f7961m);
        Paint paint = new Paint();
        this.f7959k = paint;
        paint.setColor(this.f7967s);
        this.f7959k.setAntiAlias(true);
        setLayerType(1, null);
    }

    /* renamed from: d */
    public boolean m7048d() {
        return this.f7969u;
    }

    /* renamed from: e */
    public final void m7049e() {
        float f10 = this.f7968t;
        if (f10 < 1.0f) {
            this.f7968t = 1.0f;
        } else if (f10 > 4.0f) {
            this.f7968t = 4.0f;
        }
    }

    /* renamed from: f */
    public final void m7050f() {
    }

    public final InterfaceC9296a getAdapter() {
        return null;
    }

    public final int getCurrentItem() {
        return 0;
    }

    @Override // android.view.View
    public Handler getHandler() {
        return this.f7951c;
    }

    public int getInitPosition() {
        return this.f7971w;
    }

    public float getItemHeight() {
        return this.f7963o;
    }

    public int getItemsCount() {
        return 0;
    }

    public float getTotalScrollY() {
        return this.f7970v;
    }

    /* renamed from: h */
    public final void m7051h(float f10) {
        m7045a();
        this.f7956h = this.f7955g.scheduleWithFixedDelay(new C9512a(this, f10), 0L, 5L, TimeUnit.MILLISECONDS);
    }

    /* renamed from: i */
    public void m7052i(ACTION action) {
        m7045a();
        if (action == ACTION.FLING || action == ACTION.DAGGLE) {
            float f10 = this.f7970v;
            float f11 = this.f7963o;
            int i10 = (int) (((f10 % f11) + f11) % f11);
            this.f7941B = i10;
            if (i10 > f11 / 2.0f) {
                this.f7941B = (int) (f11 - i10);
            } else {
                this.f7941B = -i10;
            }
        }
        this.f7956h = this.f7955g.scheduleWithFixedDelay(new C9514c(this, this.f7941B), 0L, 10L, TimeUnit.MILLISECONDS);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        this.f7944E = i10;
        m7044g();
        setMeasuredDimension(this.f7940A, this.f7974z);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f7952d.onTouchEvent(motionEvent);
        throw null;
    }

    public final void setAdapter(InterfaceC9296a interfaceC9296a) {
        boolean z10 = this.f7974z <= 0;
        m7044g();
        if (z10) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final void setCurrentItem(int i10) {
        this.f7972x = i10;
        this.f7971w = i10;
        this.f7970v = 0.0f;
        invalidate();
    }

    public final void setCyclic(boolean z10) {
        this.f7969u = z10;
    }

    public void setDividerColor(int i10) {
        this.f7967s = i10;
        this.f7959k.setColor(i10);
    }

    public void setDividerType(DividerType dividerType) {
        this.f7949a = dividerType;
    }

    public void setGravity(int i10) {
        this.f7945F = i10;
    }

    public void setIsOptions(boolean z10) {
        this.f7953e = z10;
    }

    public void setLabel(String str) {
        this.f7960l = str;
    }

    public void setLineSpacingMultiplier(float f10) {
        if (f10 != 0.0f) {
            this.f7968t = f10;
            m7049e();
        }
    }

    public void setTextColorCenter(int i10) {
        this.f7966r = i10;
        this.f7958j.setColor(i10);
    }

    public void setTextColorOut(int i10) {
        this.f7965q = i10;
        this.f7957i.setColor(i10);
    }

    public final void setTextSize(float f10) {
        if (f10 > 0.0f) {
            int i10 = (int) (this.f7950b.getResources().getDisplayMetrics().density * f10);
            this.f7961m = i10;
            this.f7957i.setTextSize(i10);
            this.f7958j.setTextSize(this.f7961m);
        }
    }

    public void setTextXOffset(int i10) {
        this.f7962n = i10;
        if (i10 != 0) {
            this.f7958j.setTextScaleX(1.0f);
        }
    }

    public void setTotalScrollY(float f10) {
        this.f7970v = f10;
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public final void setTypeface(Typeface typeface) {
        this.f7964p = typeface;
        this.f7957i.setTypeface(typeface);
        this.f7958j.setTypeface(this.f7964p);
    }

    public final void setOnItemSelectedListener(InterfaceC9365b interfaceC9365b) {
    }
}
