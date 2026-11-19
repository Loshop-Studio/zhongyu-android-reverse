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
import p153k1.InterfaceC8262a;
import p165l1.C8877a;
import p165l1.InterfaceC8878b;
import p175m1.C8949a;
import p175m1.C8951c;
import p175m1.HandlerC8950b;

/* loaded from: classes3.dex */
public class WheelView extends View {

    /* renamed from: L */
    public static final String[] f4566L = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09"};

    /* renamed from: A */
    public int f4567A;

    /* renamed from: B */
    public int f4568B;

    /* renamed from: C */
    public int f4569C;

    /* renamed from: D */
    public float f4570D;

    /* renamed from: E */
    public long f4571E;

    /* renamed from: F */
    public int f4572F;

    /* renamed from: G */
    public int f4573G;

    /* renamed from: H */
    public int f4574H;

    /* renamed from: I */
    public int f4575I;

    /* renamed from: J */
    public float f4576J;

    /* renamed from: K */
    public boolean f4577K;

    /* renamed from: a */
    public DividerType f4578a;

    /* renamed from: b */
    public Context f4579b;

    /* renamed from: c */
    public Handler f4580c;

    /* renamed from: d */
    public GestureDetector f4581d;

    /* renamed from: e */
    public boolean f4582e;

    /* renamed from: f */
    public boolean f4583f;

    /* renamed from: g */
    public ScheduledExecutorService f4584g;

    /* renamed from: h */
    public ScheduledFuture f4585h;

    /* renamed from: i */
    public Paint f4586i;

    /* renamed from: j */
    public Paint f4587j;

    /* renamed from: k */
    public Paint f4588k;

    /* renamed from: l */
    public String f4589l;

    /* renamed from: m */
    public int f4590m;

    /* renamed from: n */
    public int f4591n;

    /* renamed from: o */
    public float f4592o;

    /* renamed from: p */
    public Typeface f4593p;

    /* renamed from: q */
    public int f4594q;

    /* renamed from: r */
    public int f4595r;

    /* renamed from: s */
    public int f4596s;

    /* renamed from: t */
    public int f4597t;

    /* renamed from: u */
    public float f4598u;

    /* renamed from: v */
    public boolean f4599v;

    /* renamed from: w */
    public float f4600w;

    /* renamed from: x */
    public int f4601x;

    /* renamed from: y */
    public int f4602y;

    /* renamed from: z */
    public int f4603z;

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
        this.f4582e = false;
        this.f4583f = true;
        this.f4584g = Executors.newSingleThreadScheduledExecutor();
        this.f4593p = Typeface.MONOSPACE;
        this.f4598u = 1.6f;
        this.f4603z = 11;
        this.f4569C = 0;
        this.f4570D = 0.0f;
        this.f4571E = 0L;
        this.f4573G = 17;
        this.f4574H = 0;
        this.f4575I = 0;
        this.f4577K = false;
        this.f4590m = getResources().getDimensionPixelSize(R$dimen.pickerview_textsize);
        float f10 = getResources().getDisplayMetrics().density;
        if (f10 < 1.0f) {
            this.f4576J = 2.4f;
        } else if (1.0f <= f10 && f10 < 2.0f) {
            this.f4576J = 4.0f;
        } else if (2.0f <= f10 && f10 < 3.0f) {
            this.f4576J = 6.0f;
        } else if (f10 >= 3.0f) {
            this.f4576J = f10 * 2.5f;
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.pickerview, 0, 0);
            this.f4573G = typedArrayObtainStyledAttributes.getInt(R$styleable.pickerview_wheelview_gravity, 17);
            this.f4594q = typedArrayObtainStyledAttributes.getColor(R$styleable.pickerview_wheelview_textColorOut, -5723992);
            this.f4595r = typedArrayObtainStyledAttributes.getColor(R$styleable.pickerview_wheelview_textColorCenter, -14013910);
            this.f4596s = typedArrayObtainStyledAttributes.getColor(R$styleable.pickerview_wheelview_dividerColor, -2763307);
            this.f4597t = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.pickerview_wheelview_dividerWidth, 2);
            this.f4590m = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.pickerview_wheelview_textSize, this.f4590m);
            this.f4598u = typedArrayObtainStyledAttributes.getFloat(R$styleable.pickerview_wheelview_lineSpacingMultiplier, this.f4598u);
            typedArrayObtainStyledAttributes.recycle();
        }
        m4019e();
        m4016b(context);
    }

    /* renamed from: a */
    public void m4015a() {
        ScheduledFuture scheduledFuture = this.f4585h;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            return;
        }
        this.f4585h.cancel(true);
        this.f4585h = null;
    }

    /* renamed from: b */
    public final void m4016b(Context context) {
        this.f4579b = context;
        this.f4580c = new HandlerC8950b(this);
        GestureDetector gestureDetector = new GestureDetector(context, new C8877a(this));
        this.f4581d = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.f4599v = true;
        this.f4600w = 0.0f;
        this.f4601x = -1;
        m4017c();
    }

    /* renamed from: c */
    public final void m4017c() {
        Paint paint = new Paint();
        this.f4586i = paint;
        paint.setColor(this.f4594q);
        this.f4586i.setAntiAlias(true);
        this.f4586i.setTypeface(this.f4593p);
        this.f4586i.setTextSize(this.f4590m);
        Paint paint2 = new Paint();
        this.f4587j = paint2;
        paint2.setColor(this.f4595r);
        this.f4587j.setAntiAlias(true);
        this.f4587j.setTextScaleX(1.1f);
        this.f4587j.setTypeface(this.f4593p);
        this.f4587j.setTextSize(this.f4590m);
        Paint paint3 = new Paint();
        this.f4588k = paint3;
        paint3.setColor(this.f4596s);
        this.f4588k.setAntiAlias(true);
        setLayerType(1, null);
    }

    /* renamed from: d */
    public boolean m4018d() {
        return this.f4599v;
    }

    /* renamed from: e */
    public final void m4019e() {
        float f10 = this.f4598u;
        if (f10 < 1.0f) {
            this.f4598u = 1.0f;
        } else if (f10 > 4.0f) {
            this.f4598u = 4.0f;
        }
    }

    /* renamed from: f */
    public final void m4020f() {
    }

    /* renamed from: g */
    public final void m4021g() {
    }

    public final InterfaceC8262a getAdapter() {
        return null;
    }

    public final int getCurrentItem() {
        return 0;
    }

    @Override // android.view.View
    public Handler getHandler() {
        return this.f4580c;
    }

    public int getInitPosition() {
        return this.f4601x;
    }

    public float getItemHeight() {
        return this.f4592o;
    }

    public int getItemsCount() {
        return 0;
    }

    public float getTotalScrollY() {
        return this.f4600w;
    }

    /* renamed from: h */
    public final void m4022h(float f10) {
        m4015a();
        this.f4585h = this.f4584g.scheduleWithFixedDelay(new C8949a(this, f10), 0L, 5L, TimeUnit.MILLISECONDS);
    }

    /* renamed from: i */
    public void m4023i(ACTION action) {
        m4015a();
        if (action == ACTION.FLING || action == ACTION.DAGGLE) {
            float f10 = this.f4600w;
            float f11 = this.f4592o;
            int i9 = (int) (((f10 % f11) + f11) % f11);
            this.f4569C = i9;
            if (i9 > f11 / 2.0f) {
                this.f4569C = (int) (f11 - i9);
            } else {
                this.f4569C = -i9;
            }
        }
        this.f4585h = this.f4584g.scheduleWithFixedDelay(new C8951c(this, this.f4569C), 0L, 10L, TimeUnit.MILLISECONDS);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        this.f4572F = i9;
        m4021g();
        setMeasuredDimension(this.f4568B, this.f4567A);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f4581d.onTouchEvent(motionEvent);
        throw null;
    }

    public final void setAdapter(InterfaceC8262a interfaceC8262a) {
        m4021g();
        invalidate();
    }

    public void setAlphaGradient(boolean z9) {
        this.f4577K = z9;
    }

    public final void setCurrentItem(int i9) {
        this.f4602y = i9;
        this.f4601x = i9;
        this.f4600w = 0.0f;
        invalidate();
    }

    public final void setCyclic(boolean z9) {
        this.f4599v = z9;
    }

    public void setDividerColor(int i9) {
        this.f4596s = i9;
        this.f4588k.setColor(i9);
    }

    public void setDividerType(DividerType dividerType) {
        this.f4578a = dividerType;
    }

    public void setDividerWidth(int i9) {
        this.f4597t = i9;
        this.f4588k.setStrokeWidth(i9);
    }

    public void setGravity(int i9) {
        this.f4573G = i9;
    }

    public void setIsOptions(boolean z9) {
        this.f4582e = z9;
    }

    public void setItemsVisibleCount(int i9) {
        if (i9 % 2 == 0) {
            i9++;
        }
        this.f4603z = i9 + 2;
    }

    public void setLabel(String str) {
        this.f4589l = str;
    }

    public void setLineSpacingMultiplier(float f10) {
        if (f10 != 0.0f) {
            this.f4598u = f10;
            m4019e();
        }
    }

    public void setTextColorCenter(int i9) {
        this.f4595r = i9;
        this.f4587j.setColor(i9);
    }

    public void setTextColorOut(int i9) {
        this.f4594q = i9;
        this.f4586i.setColor(i9);
    }

    public final void setTextSize(float f10) {
        if (f10 > 0.0f) {
            int i9 = (int) (this.f4579b.getResources().getDisplayMetrics().density * f10);
            this.f4590m = i9;
            this.f4586i.setTextSize(i9);
            this.f4587j.setTextSize(this.f4590m);
        }
    }

    public void setTextXOffset(int i9) {
        this.f4591n = i9;
        if (i9 != 0) {
            this.f4587j.setTextScaleX(1.0f);
        }
    }

    public void setTotalScrollY(float f10) {
        this.f4600w = f10;
    }

    public final void setTypeface(Typeface typeface) {
        this.f4593p = typeface;
        this.f4586i.setTypeface(typeface);
        this.f4587j.setTypeface(this.f4593p);
    }

    public final void setOnItemSelectedListener(InterfaceC8878b interfaceC8878b) {
    }
}
