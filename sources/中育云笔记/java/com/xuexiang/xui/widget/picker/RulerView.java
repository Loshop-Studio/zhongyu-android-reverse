package com.xuexiang.xui.widget.picker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.Nullable;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$color;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC8040f;
import io.github.inflationx.calligraphy3.HasTypeface;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;

/* loaded from: classes5.dex */
public class RulerView extends View implements HasTypeface {

    /* renamed from: A */
    public int f16415A;

    /* renamed from: B */
    public float f16416B;

    /* renamed from: C */
    public float f16417C;

    /* renamed from: D */
    public ValueAnimator f16418D;

    /* renamed from: E */
    public VelocityTracker f16419E;

    /* renamed from: F */
    public String f16420F;

    /* renamed from: G */
    public Paint f16421G;

    /* renamed from: H */
    public Paint f16422H;

    /* renamed from: I */
    public Paint f16423I;

    /* renamed from: J */
    public Paint f16424J;

    /* renamed from: K */
    public TextPaint f16425K;

    /* renamed from: L */
    public TextPaint f16426L;

    /* renamed from: M */
    public TextPaint f16427M;

    /* renamed from: N */
    public Rect f16428N;

    /* renamed from: O */
    public Rect f16429O;

    /* renamed from: P */
    public Rect f16430P;

    /* renamed from: Q */
    public RectF f16431Q;

    /* renamed from: R */
    public int f16432R;

    /* renamed from: S */
    public int f16433S;

    /* renamed from: T */
    public int f16434T;

    /* renamed from: U */
    public int f16435U;

    /* renamed from: V */
    public int f16436V;

    /* renamed from: W */
    public float f16437W;

    /* renamed from: c */
    public int f16438c;

    /* renamed from: d */
    public int f16439d;

    /* renamed from: e */
    public int f16440e;

    /* renamed from: e0 */
    public float f16441e0;

    /* renamed from: f */
    public int f16442f;

    /* renamed from: f0 */
    public float f16443f0;

    /* renamed from: g */
    public int f16444g;

    /* renamed from: g0 */
    public boolean f16445g0;

    /* renamed from: h */
    public int f16446h;

    /* renamed from: i */
    public float f16447i;

    /* renamed from: j */
    public int f16448j;

    /* renamed from: k */
    public int f16449k;

    /* renamed from: l */
    public int f16450l;

    /* renamed from: m */
    public int f16451m;

    /* renamed from: n */
    public int f16452n;

    /* renamed from: o */
    public int f16453o;

    /* renamed from: p */
    public int f16454p;

    /* renamed from: q */
    public String f16455q;

    /* renamed from: r */
    public int f16456r;

    /* renamed from: s */
    public int f16457s;

    /* renamed from: t */
    public int f16458t;

    /* renamed from: u */
    public int f16459u;

    /* renamed from: v */
    public int f16460v;

    /* renamed from: w */
    public int f16461w;

    /* renamed from: x */
    public int f16462x;

    /* renamed from: y */
    public boolean f16463y;

    /* renamed from: z */
    public boolean f16464z;

    /* renamed from: com.xuexiang.xui.widget.picker.RulerView$a */
    public class C8175a implements ValueAnimator.AnimatorUpdateListener {
        public C8175a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            RulerView.this.f16441e0 += ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (RulerView.this.f16441e0 >= RulerView.this.f16433S / 2.0f) {
                RulerView.this.f16441e0 = r3.f16433S / 2.0f;
            } else {
                if (RulerView.this.f16441e0 <= RulerView.this.m12980o(r0.f16448j)) {
                    RulerView rulerView = RulerView.this;
                    rulerView.f16441e0 = rulerView.m12980o(rulerView.f16448j);
                }
            }
            RulerView rulerView2 = RulerView.this;
            rulerView2.f16443f0 = rulerView2.f16441e0;
            RulerView.this.invalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.picker.RulerView$b */
    public class C8176b extends AnimatorListenerAdapter {
        public C8176b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            RulerView.this.f16445g0 = true;
            RulerView.this.invalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.picker.RulerView$c */
    public class C8177c implements ValueAnimator.AnimatorUpdateListener {
        public C8177c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            RulerView.this.f16441e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            RulerView rulerView = RulerView.this;
            rulerView.f16443f0 = rulerView.f16441e0;
            RulerView.this.invalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.picker.RulerView$d */
    public class C8178d extends AnimatorListenerAdapter {
        public C8178d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            RulerView.this.f16416B = -1.0f;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.picker.RulerView$e */
    public class C8179e implements ValueAnimator.AnimatorUpdateListener {
        public C8179e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            RulerView.this.f16441e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            RulerView rulerView = RulerView.this;
            rulerView.f16443f0 = rulerView.f16441e0;
            RulerView.this.invalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.picker.RulerView$f */
    public class C8180f extends AnimatorListenerAdapter {
        public C8180f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            RulerView.m12972i(RulerView.this);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.picker.RulerView$g */
    public interface InterfaceC8181g {
    }

    public RulerView(Context context) {
        this(context, null);
    }

    /* renamed from: i */
    public static /* synthetic */ InterfaceC8181g m12972i(RulerView rulerView) {
        rulerView.getClass();
        return null;
    }

    /* renamed from: p */
    private void m12973p() {
        this.f16421G = new Paint(1);
        this.f16422H = new Paint(1);
        this.f16423I = new Paint(1);
        this.f16424J = new Paint(1);
        this.f16425K = new TextPaint(1);
        this.f16426L = new TextPaint(1);
        this.f16427M = new TextPaint(1);
        this.f16421G.setColor(this.f16449k);
        this.f16422H.setColor(this.f16450l);
        this.f16423I.setColor(this.f16451m);
        this.f16424J.setColor(this.f16452n);
        this.f16425K.setColor(this.f16453o);
        this.f16426L.setColor(this.f16454p);
        this.f16427M.setColor(this.f16456r);
        TextPaint textPaint = this.f16426L;
        Paint.Style style = Paint.Style.FILL;
        textPaint.setStyle(style);
        this.f16427M.setStyle(style);
        this.f16421G.setStyle(style);
        this.f16422H.setStyle(style);
        this.f16423I.setStyle(style);
        this.f16424J.setStyle(style);
        Paint paint = this.f16424J;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        this.f16423I.setStrokeCap(cap);
        this.f16422H.setStrokeCap(cap);
        this.f16422H.setStrokeWidth(this.f16457s);
        this.f16423I.setStrokeWidth(this.f16458t);
        this.f16424J.setStrokeWidth(this.f16459u);
        this.f16426L.setTextSize(this.f16460v);
        this.f16427M.setTextSize(this.f16462x);
        this.f16425K.setTextSize(this.f16461w);
        this.f16431Q = new RectF();
        this.f16429O = new Rect();
        this.f16428N = new Rect();
        this.f16430P = new Rect();
        TextPaint textPaint2 = this.f16426L;
        String str = this.f16420F;
        textPaint2.getTextBounds(str, 0, str.length(), this.f16429O);
        this.f16427M.getTextBounds(this.f16420F, 0, 1, this.f16430P);
        int i10 = this.f16439d;
        this.f16434T = i10 / 4;
        this.f16435U = i10 / 2;
        this.f16436V = (i10 / 2) + 5;
        this.f16418D = new ValueAnimator();
    }

    /* renamed from: q */
    private void m12974q(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RulerView, i10, 0);
        this.f16438c = typedArrayObtainStyledAttributes.getInt(R$styleable.RulerView_rv_scaleLimit, this.f16438c);
        this.f16439d = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RulerView_rv_rulerHeight, (int) TypedValue.applyDimension(1, this.f16439d, getResources().getDisplayMetrics()));
        this.f16440e = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RulerView_rv_rulerToResultGap, (int) TypedValue.applyDimension(1, this.f16440e, getResources().getDisplayMetrics()));
        this.f16442f = typedArrayObtainStyledAttributes.getInt(R$styleable.RulerView_rv_scaleCount, this.f16442f);
        this.f16444g = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RulerView_rv_scaleGap, (int) TypedValue.applyDimension(1, this.f16444g, getResources().getDisplayMetrics()));
        this.f16446h = typedArrayObtainStyledAttributes.getInt(R$styleable.RulerView_rv_minScale, this.f16446h) / this.f16438c;
        this.f16447i = typedArrayObtainStyledAttributes.getFloat(R$styleable.RulerView_rv_firstScale, this.f16447i) / this.f16438c;
        this.f16448j = typedArrayObtainStyledAttributes.getInt(R$styleable.RulerView_rv_maxScale, this.f16448j) / this.f16438c;
        this.f16449k = typedArrayObtainStyledAttributes.getColor(R$styleable.RulerView_rv_bgColor, AbstractC8040f.m12202c(R$color.default_ruler_view_bg_color));
        this.f16450l = typedArrayObtainStyledAttributes.getColor(R$styleable.RulerView_rv_smallScaleColor, AbstractC8040f.m12202c(R$color.default_ruler_view_small_scale_color));
        this.f16451m = typedArrayObtainStyledAttributes.getColor(R$styleable.RulerView_rv_midScaleColor, AbstractC8040f.m12202c(R$color.default_ruler_view_mid_scale_color));
        this.f16452n = typedArrayObtainStyledAttributes.getColor(R$styleable.RulerView_rv_largeScaleColor, AbstractC8040f.m12202c(R$color.default_ruler_view_large_scale_color));
        this.f16453o = typedArrayObtainStyledAttributes.getColor(R$styleable.RulerView_rv_scaleNumColor, AbstractC8040f.m12202c(R$color.default_ruler_view_scale_num_color));
        this.f16454p = typedArrayObtainStyledAttributes.getColor(R$styleable.RulerView_rv_resultNumColor, AbstractC8040f.m12202c(R$color.default_ruler_view_result_num_color));
        this.f16456r = typedArrayObtainStyledAttributes.getColor(R$styleable.RulerView_rv_unitColor, AbstractC8040f.m12202c(R$color.default_ruler_view_unit_color));
        String str = this.f16455q;
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.RulerView_rv_unit);
        this.f16455q = string;
        if (TextUtils.isEmpty(string)) {
            this.f16455q = str;
        }
        this.f16457s = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RulerView_rv_smallScaleStroke, (int) TypedValue.applyDimension(1, this.f16457s, getResources().getDisplayMetrics()));
        this.f16458t = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RulerView_rv_midScaleStroke, (int) TypedValue.applyDimension(1, this.f16458t, getResources().getDisplayMetrics()));
        this.f16459u = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RulerView_rv_largeScaleStroke, (int) TypedValue.applyDimension(1, this.f16459u, getResources().getDisplayMetrics()));
        this.f16460v = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RulerView_rv_resultNumTextSize, (int) TypedValue.applyDimension(2, this.f16460v, getResources().getDisplayMetrics()));
        this.f16461w = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RulerView_rv_scaleNumTextSize, (int) TypedValue.applyDimension(2, this.f16461w, getResources().getDisplayMetrics()));
        this.f16462x = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RulerView_rv_unitTextSize, (int) TypedValue.applyDimension(2, this.f16462x, getResources().getDisplayMetrics()));
        this.f16463y = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RulerView_rv_showScaleResult, this.f16463y);
        this.f16464z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RulerView_rv_isBgRoundRect, this.f16464z);
        this.f16415A = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RulerView_rv_roundRadius, (int) TypedValue.applyDimension(1, this.f16415A, getResources().getDisplayMetrics()));
        typedArrayObtainStyledAttributes.recycle();
    }

    public float getCurrentValue() {
        return this.f16417C;
    }

    public String getSelectValue() {
        return this.f16420F;
    }

    /* renamed from: j */
    public final void m12975j(int i10) {
        if (Math.abs(i10) < 50) {
            this.f16445g0 = true;
            return;
        }
        if (this.f16418D.isRunning()) {
            return;
        }
        ValueAnimator duration = ValueAnimator.ofInt(0, i10 / 20).setDuration(Math.abs(i10 / 10));
        this.f16418D = duration;
        duration.setInterpolator(new DecelerateInterpolator());
        this.f16418D.addUpdateListener(new C8175a());
        this.f16418D.addListener(new C8176b());
        this.f16418D.start();
    }

    /* renamed from: k */
    public final void m12976k(float f10) {
        float f11 = f10 / this.f16438c;
        if (f11 < this.f16446h || f11 > this.f16448j) {
            return;
        }
        this.f16416B = f11;
        invalidate();
    }

    /* renamed from: l */
    public final void m12977l(Canvas canvas) {
        this.f16431Q.set(0.0f, 0.0f, this.f16433S, this.f16432R);
        if (!this.f16464z) {
            canvas.drawRect(this.f16431Q, this.f16421G);
            return;
        }
        RectF rectF = this.f16431Q;
        int i10 = this.f16415A;
        canvas.drawRoundRect(rectF, i10, i10, this.f16421G);
    }

    /* renamed from: m */
    public final void m12978m(Canvas canvas, String str) {
        if (this.f16463y) {
            canvas.translate(0.0f, (-this.f16429O.height()) - (this.f16440e / 2.0f));
            this.f16426L.getTextBounds(str, 0, str.length(), this.f16429O);
            canvas.drawText(str, (this.f16433S / 2.0f) - (this.f16429O.width() / 2.0f), this.f16429O.height(), this.f16426L);
            canvas.drawText(this.f16455q, (this.f16433S / 2) + (this.f16429O.width() / 2) + 10, this.f16430P.height() + 2, this.f16427M);
        }
    }

    /* renamed from: n */
    public final void m12979n(Canvas canvas) {
        canvas.translate(0.0f, (this.f16463y ? this.f16429O.height() : 0) + this.f16440e);
        float f10 = this.f16447i;
        if (f10 != -1.0f) {
            float fM12980o = m12980o(f10);
            this.f16441e0 = fM12980o;
            this.f16443f0 = fM12980o;
            this.f16447i = -1.0f;
        }
        if (this.f16416B != -1.0f) {
            this.f16443f0 = this.f16441e0;
            ValueAnimator valueAnimator = this.f16418D;
            if (valueAnimator != null && !valueAnimator.isRunning()) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(m12980o(this.f16417C), m12980o(this.f16416B));
                this.f16418D = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new C8177c());
                this.f16418D.addListener(new C8178d());
                this.f16418D.setDuration(Math.abs((long) ((m12980o(this.f16416B) - m12980o(this.f16417C)) / 100.0f)));
                this.f16418D.start();
            }
        }
        float f11 = this.f16441e0;
        int i10 = this.f16444g;
        int i11 = -((int) (f11 / i10));
        float f12 = f11 % i10;
        canvas.save();
        if (this.f16445g0) {
            int i12 = this.f16444g;
            float fAbs = (this.f16441e0 - ((this.f16433S / 2.0f) % i12)) % i12;
            if (fAbs <= 0.0f) {
                fAbs = i12 - Math.abs(fAbs);
            }
            float fAbs2 = fAbs <= ((float) this.f16444g) / 2.0f ? this.f16441e0 - ((int) Math.abs(fAbs)) : this.f16441e0 + ((int) (this.f16444g - Math.abs(fAbs)));
            ValueAnimator valueAnimator2 = this.f16418D;
            if (valueAnimator2 != null && !valueAnimator2.isRunning()) {
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.f16441e0, fAbs2);
                this.f16418D = valueAnimatorOfFloat2;
                valueAnimatorOfFloat2.addUpdateListener(new C8179e());
                this.f16418D.addListener(new C8180f());
                this.f16418D.setDuration(300L);
                this.f16418D.start();
                this.f16445g0 = false;
            }
            float f13 = this.f16441e0;
            int i13 = this.f16444g;
            i11 = (int) (-(f13 / i13));
            f12 = f13 % i13;
        }
        canvas.translate(f12, 0.0f);
        float fFloatValue = ((BigDecimal) new WeakReference(new BigDecimal(((((this.f16433S / 2.0f) - this.f16441e0) / (this.f16444g * this.f16442f)) + this.f16446h) * this.f16438c)).get()).setScale(1, 4).floatValue();
        this.f16417C = fFloatValue;
        this.f16420F = String.valueOf(fFloatValue);
        int i14 = i11;
        int i15 = 0;
        while (true) {
            int i16 = this.f16433S;
            if (i15 >= i16) {
                canvas.restore();
                int i17 = this.f16433S;
                canvas.drawLine(i17 / 2.0f, 0.0f, i17 / 2.0f, this.f16436V, this.f16424J);
                return;
            }
            if (i14 % this.f16442f == 0) {
                float f14 = this.f16441e0;
                if ((f14 < 0.0f || i15 >= f14 - this.f16444g) && (i16 / 2.0f) - i15 > m12980o(this.f16448j + 1) - this.f16441e0) {
                    canvas.drawLine(0.0f, 0.0f, 0.0f, this.f16435U, this.f16423I);
                    this.f16425K.getTextBounds(((i14 / this.f16444g) + this.f16446h) + "", 0, (((i14 / this.f16444g) + this.f16446h) + "").length(), this.f16428N);
                    canvas.drawText((((i14 / this.f16442f) + this.f16446h) * this.f16438c) + "", (-this.f16428N.width()) / 2.0f, this.f16436V + ((this.f16439d - r3) / 2.0f) + this.f16428N.height(), this.f16425K);
                }
            } else {
                float f15 = this.f16441e0;
                if ((f15 < 0.0f || i15 >= f15) && (i16 / 2.0f) - i15 >= m12980o(this.f16448j) - this.f16441e0) {
                    canvas.drawLine(0.0f, 0.0f, 0.0f, this.f16434T, this.f16422H);
                }
            }
            i14++;
            int i18 = this.f16444g;
            i15 += i18;
            canvas.translate(i18, 0.0f);
        }
    }

    /* renamed from: o */
    public final float m12980o(float f10) {
        return (this.f16433S / 2.0f) - ((this.f16444g * this.f16442f) * (f10 - this.f16446h));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        m12977l(canvas);
        m12979n(canvas);
        m12978m(canvas, this.f16420F);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            this.f16432R = this.f16439d + (this.f16463y ? this.f16429O.height() : 0) + (this.f16440e * 2) + getPaddingTop() + getPaddingBottom();
        } else if (mode == 0 || mode == 1073741824) {
            this.f16432R = size + getPaddingTop() + getPaddingBottom();
        }
        int paddingLeft = size2 + getPaddingLeft() + getPaddingRight();
        this.f16433S = paddingLeft;
        setMeasuredDimension(paddingLeft, this.f16432R);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        float x10 = motionEvent.getX();
        this.f16445g0 = false;
        this.f16419E.computeCurrentVelocity(500);
        this.f16419E.addMovement(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            ValueAnimator valueAnimator = this.f16418D;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f16418D.end();
                this.f16418D.cancel();
            }
            this.f16437W = motionEvent.getX();
        } else if (action == 1) {
            this.f16443f0 = this.f16441e0;
            m12975j((int) this.f16419E.getXVelocity());
            this.f16419E.clear();
        } else if (action == 2) {
            float f10 = (x10 - this.f16437W) + this.f16443f0;
            this.f16441e0 = f10;
            int i10 = this.f16433S;
            if (f10 >= i10 / 2.0f) {
                this.f16441e0 = i10 / 2.0f;
            } else if (f10 <= m12980o(this.f16448j)) {
                this.f16441e0 = m12980o(this.f16448j);
            }
        }
        invalidate();
        return true;
    }

    public void setBgColor(int i10) {
        this.f16449k = i10;
        invalidate();
    }

    public void setCurrentValue(float f10) {
        m12976k(f10);
    }

    public void setFirstScale(float f10) {
        this.f16447i = f10;
        invalidate();
    }

    public void setIsBgRoundRect(boolean z10) {
        this.f16464z = z10;
        invalidate();
    }

    public void setLargeScaleColor(int i10) {
        this.f16452n = i10;
    }

    public void setLargeScaleStroke(int i10) {
        this.f16459u = i10;
        invalidate();
    }

    public void setMaxScale(int i10) {
        this.f16448j = i10;
        invalidate();
    }

    public void setMidScaleColor(int i10) {
        this.f16451m = i10;
        invalidate();
    }

    public void setMidScaleStroke(int i10) {
        this.f16458t = i10;
        invalidate();
    }

    public void setMinScale(int i10) {
        this.f16446h = i10;
        invalidate();
    }

    public void setResultNumColor(int i10) {
        this.f16454p = i10;
        invalidate();
    }

    public void setResultNumTextSize(int i10) {
        this.f16460v = i10;
        invalidate();
    }

    public void setRulerHeight(int i10) {
        this.f16439d = i10;
        invalidate();
    }

    public void setRulerToResultGap(int i10) {
        this.f16440e = i10;
        invalidate();
    }

    public void setScaleCount(int i10) {
        this.f16442f = i10;
        invalidate();
    }

    public void setScaleGap(int i10) {
        this.f16444g = i10;
        invalidate();
    }

    public void setScaleLimit(int i10) {
        this.f16438c = i10;
        invalidate();
    }

    public void setScaleNumColor(int i10) {
        this.f16453o = i10;
        invalidate();
    }

    public void setScaleNumTextSize(int i10) {
        this.f16461w = i10;
        invalidate();
    }

    public void setShowScaleResult(boolean z10) {
        this.f16463y = z10;
        invalidate();
    }

    public void setSmallScaleColor(int i10) {
        this.f16450l = i10;
        invalidate();
    }

    public void setSmallScaleStroke(int i10) {
        this.f16457s = i10;
        invalidate();
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        TextPaint textPaint = this.f16426L;
        if (textPaint != null) {
            textPaint.setTypeface(typeface);
        }
        TextPaint textPaint2 = this.f16427M;
        if (textPaint2 != null) {
            textPaint2.setTypeface(typeface);
        }
        TextPaint textPaint3 = this.f16425K;
        if (textPaint3 != null) {
            textPaint3.setTypeface(typeface);
        }
    }

    public void setUnit(String str) {
        this.f16455q = str;
        invalidate();
    }

    public void setUnitColor(int i10) {
        this.f16456r = i10;
        invalidate();
    }

    public void setUnitTextSize(int i10) {
        this.f16462x = i10;
        invalidate();
    }

    public RulerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.RulerViewStyle);
    }

    public RulerView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16438c = 1;
        this.f16439d = 50;
        this.f16440e = 50 / 4;
        this.f16442f = 10;
        this.f16444g = 10;
        this.f16446h = 0;
        this.f16447i = 50.0f;
        this.f16448j = 100;
        this.f16455q = "kg";
        this.f16457s = 2;
        this.f16458t = 3;
        this.f16459u = 5;
        this.f16460v = 20;
        this.f16461w = 16;
        this.f16462x = 13;
        this.f16463y = true;
        this.f16464z = true;
        this.f16415A = 10;
        this.f16416B = -1.0f;
        this.f16417C = 50.0f;
        this.f16419E = VelocityTracker.obtain();
        this.f16420F = String.valueOf(this.f16447i);
        this.f16441e0 = 0.0f;
        this.f16443f0 = 0.0f;
        this.f16445g0 = false;
        m12974q(context, attributeSet, i10);
        m12973p();
    }
}
