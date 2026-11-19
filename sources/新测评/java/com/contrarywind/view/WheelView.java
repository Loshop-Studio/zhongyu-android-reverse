package com.contrarywind.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p163m1.InterfaceC8543a;
import p174n1.C8617a;
import p174n1.InterfaceC8618b;
import p185o1.C8693a;
import p185o1.C8695c;
import p185o1.HandlerC8694b;

/* loaded from: classes3.dex */
public class WheelView extends View {

    /* renamed from: L */
    public static final String[] f4198L = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09"};

    /* renamed from: A */
    public int f4199A;

    /* renamed from: B */
    public int f4200B;

    /* renamed from: C */
    public int f4201C;

    /* renamed from: D */
    public float f4202D;

    /* renamed from: E */
    public long f4203E;

    /* renamed from: F */
    public int f4204F;

    /* renamed from: G */
    public int f4205G;

    /* renamed from: H */
    public int f4206H;

    /* renamed from: I */
    public int f4207I;

    /* renamed from: J */
    public float f4208J;

    /* renamed from: K */
    public boolean f4209K;

    /* renamed from: a */
    public DividerType f4210a;

    /* renamed from: b */
    public Context f4211b;

    /* renamed from: c */
    public Handler f4212c;

    /* renamed from: d */
    public GestureDetector f4213d;

    /* renamed from: e */
    public boolean f4214e;

    /* renamed from: f */
    public boolean f4215f;

    /* renamed from: g */
    public ScheduledExecutorService f4216g;

    /* renamed from: h */
    public ScheduledFuture f4217h;

    /* renamed from: i */
    public Paint f4218i;

    /* renamed from: j */
    public Paint f4219j;

    /* renamed from: k */
    public Paint f4220k;

    /* renamed from: l */
    public String f4221l;

    /* renamed from: m */
    public int f4222m;

    /* renamed from: n */
    public int f4223n;

    /* renamed from: o */
    public float f4224o;

    /* renamed from: p */
    public Typeface f4225p;

    /* renamed from: q */
    public int f4226q;

    /* renamed from: r */
    public int f4227r;

    /* renamed from: s */
    public int f4228s;

    /* renamed from: t */
    public int f4229t;

    /* renamed from: u */
    public float f4230u;

    /* renamed from: v */
    public boolean f4231v;

    /* renamed from: w */
    public float f4232w;

    /* renamed from: x */
    public int f4233x;

    /* renamed from: y */
    public int f4234y;

    /* renamed from: z */
    public int f4235z;

    public enum ACTION {
        CLICK,
        FLING,
        DAGGLE
    }

    public enum DividerType {
        FILL,
        WRAP,
        CIRCLE
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4214e = false;
        this.f4215f = true;
        this.f4216g = Executors.newSingleThreadScheduledExecutor();
        this.f4225p = Typeface.MONOSPACE;
        this.f4230u = 1.6f;
        this.f4235z = 11;
        this.f4201C = 0;
        this.f4202D = 0.0f;
        this.f4203E = 0L;
        this.f4205G = 17;
        this.f4206H = 0;
        this.f4207I = 0;
        this.f4209K = false;
        this.f4222m = getResources().getDimensionPixelSize(R$dimen.pickerview_textsize);
        float f10 = getResources().getDisplayMetrics().density;
        if (f10 < 1.0f) {
            this.f4208J = 2.4f;
        } else if (1.0f <= f10 && f10 < 2.0f) {
            this.f4208J = 4.0f;
        } else if (2.0f <= f10 && f10 < 3.0f) {
            this.f4208J = 6.0f;
        } else if (f10 >= 3.0f) {
            this.f4208J = f10 * 2.5f;
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.pickerview, 0, 0);
            this.f4205G = typedArrayObtainStyledAttributes.getInt(R$styleable.pickerview_wheelview_gravity, 17);
            this.f4226q = typedArrayObtainStyledAttributes.getColor(R$styleable.pickerview_wheelview_textColorOut, -5723992);
            this.f4227r = typedArrayObtainStyledAttributes.getColor(R$styleable.pickerview_wheelview_textColorCenter, -14013910);
            this.f4228s = typedArrayObtainStyledAttributes.getColor(R$styleable.pickerview_wheelview_dividerColor, -2763307);
            this.f4229t = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.pickerview_wheelview_dividerWidth, 2);
            this.f4222m = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.pickerview_wheelview_textSize, this.f4222m);
            this.f4230u = typedArrayObtainStyledAttributes.getFloat(R$styleable.pickerview_wheelview_lineSpacingMultiplier, this.f4230u);
            typedArrayObtainStyledAttributes.recycle();
        }
        m3995e();
        m3992b(context);
    }

    /* renamed from: a */
    public void m3991a() {
        ScheduledFuture scheduledFuture = this.f4217h;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            return;
        }
        this.f4217h.cancel(true);
        this.f4217h = null;
    }

    /* renamed from: b */
    public final void m3992b(Context context) {
        this.f4211b = context;
        this.f4212c = new HandlerC8694b(this);
        GestureDetector gestureDetector = new GestureDetector(context, new C8617a(this));
        this.f4213d = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.f4231v = true;
        this.f4232w = 0.0f;
        this.f4233x = -1;
        m3993c();
    }

    /* renamed from: c */
    public final void m3993c() {
        Paint paint = new Paint();
        this.f4218i = paint;
        paint.setColor(this.f4226q);
        this.f4218i.setAntiAlias(true);
        this.f4218i.setTypeface(this.f4225p);
        this.f4218i.setTextSize(this.f4222m);
        Paint paint2 = new Paint();
        this.f4219j = paint2;
        paint2.setColor(this.f4227r);
        this.f4219j.setAntiAlias(true);
        this.f4219j.setTextScaleX(1.1f);
        this.f4219j.setTypeface(this.f4225p);
        this.f4219j.setTextSize(this.f4222m);
        Paint paint3 = new Paint();
        this.f4220k = paint3;
        paint3.setColor(this.f4228s);
        this.f4220k.setAntiAlias(true);
        setLayerType(1, null);
    }

    /* renamed from: d */
    public boolean m3994d() {
        return this.f4231v;
    }

    /* renamed from: e */
    public final void m3995e() {
        float f10 = this.f4230u;
        if (f10 < 1.0f) {
            this.f4230u = 1.0f;
        } else if (f10 > 4.0f) {
            this.f4230u = 4.0f;
        }
    }

    /* renamed from: f */
    public final void m3996f() {
    }

    /* renamed from: g */
    public final void m3997g() {
    }

    public final InterfaceC8543a getAdapter() {
        return null;
    }

    public final int getCurrentItem() {
        return 0;
    }

    @Override // android.view.View
    public Handler getHandler() {
        return this.f4212c;
    }

    public int getInitPosition() {
        return this.f4233x;
    }

    public float getItemHeight() {
        return this.f4224o;
    }

    public int getItemsCount() {
        return 0;
    }

    public float getTotalScrollY() {
        return this.f4232w;
    }

    /* renamed from: h */
    public final void m3998h(float f10) {
        m3991a();
        this.f4217h = this.f4216g.scheduleWithFixedDelay(new C8693a(this, f10), 0L, 5L, TimeUnit.MILLISECONDS);
    }

    /* renamed from: i */
    public void m3999i(ACTION action) {
        m3991a();
        if (action == ACTION.FLING || action == ACTION.DAGGLE) {
            float f10 = this.f4232w;
            float f11 = this.f4224o;
            int i10 = (int) (((f10 % f11) + f11) % f11);
            this.f4201C = i10;
            if (i10 > f11 / 2.0f) {
                this.f4201C = (int) (f11 - i10);
            } else {
                this.f4201C = -i10;
            }
        }
        this.f4217h = this.f4216g.scheduleWithFixedDelay(new C8695c(this, this.f4201C), 0L, 10L, TimeUnit.MILLISECONDS);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        this.f4204F = i10;
        m3997g();
        setMeasuredDimension(this.f4200B, this.f4199A);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f4213d.onTouchEvent(motionEvent);
        throw null;
    }

    public final void setAdapter(InterfaceC8543a interfaceC8543a) {
        m3997g();
        invalidate();
    }

    public void setAlphaGradient(boolean z9) {
        this.f4209K = z9;
    }

    public final void setCurrentItem(int i10) {
        this.f4234y = i10;
        this.f4233x = i10;
        this.f4232w = 0.0f;
        invalidate();
    }

    public final void setCyclic(boolean z9) {
        this.f4231v = z9;
    }

    public void setDividerColor(int i10) {
        this.f4228s = i10;
        this.f4220k.setColor(i10);
    }

    public void setDividerType(DividerType dividerType) {
        this.f4210a = dividerType;
    }

    public void setDividerWidth(int i10) {
        this.f4229t = i10;
        this.f4220k.setStrokeWidth(i10);
    }

    public void setGravity(int i10) {
        this.f4205G = i10;
    }

    public void setIsOptions(boolean z9) {
        this.f4214e = z9;
    }

    public void setItemsVisibleCount(int i10) {
        if (i10 % 2 == 0) {
            i10++;
        }
        this.f4235z = i10 + 2;
    }

    public void setLabel(String str) {
        this.f4221l = str;
    }

    public void setLineSpacingMultiplier(float f10) {
        if (f10 != 0.0f) {
            this.f4230u = f10;
            m3995e();
        }
    }

    public void setTextColorCenter(int i10) {
        this.f4227r = i10;
        this.f4219j.setColor(i10);
    }

    public void setTextColorOut(int i10) {
        this.f4226q = i10;
        this.f4218i.setColor(i10);
    }

    public final void setTextSize(float f10) {
        if (f10 > 0.0f) {
            int i10 = (int) (this.f4211b.getResources().getDisplayMetrics().density * f10);
            this.f4222m = i10;
            this.f4218i.setTextSize(i10);
            this.f4219j.setTextSize(this.f4222m);
        }
    }

    public void setTextXOffset(int i10) {
        this.f4223n = i10;
        if (i10 != 0) {
            this.f4219j.setTextScaleX(1.0f);
        }
    }

    public void setTotalScrollY(float f10) {
        this.f4232w = f10;
    }

    public final void setTypeface(Typeface typeface) {
        this.f4225p = typeface;
        this.f4218i.setTypeface(typeface);
        this.f4219j.setTypeface(this.f4225p);
    }

    public final void setOnItemSelectedListener(InterfaceC8618b interfaceC8618b) {
    }
}
