package com.flyco.tablayout;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import p017b1.C3098b;
import p017b1.C3100d;
import p017b1.ViewOnClickListenerC3099c;
import p025c1.InterfaceC3216a;

/* loaded from: classes2.dex */
public class SegmentTabLayout extends FrameLayout implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: A */
    public float f2706A;

    /* renamed from: B */
    public int f2707B;

    /* renamed from: C */
    public int f2708C;

    /* renamed from: D */
    public int f2709D;

    /* renamed from: E */
    public boolean f2710E;

    /* renamed from: F */
    public final int f2711F;

    /* renamed from: G */
    public final int f2712G;

    /* renamed from: H */
    public final float f2713H;

    /* renamed from: I */
    public final ValueAnimator f2714I;

    /* renamed from: J */
    public final OvershootInterpolator f2715J;

    /* renamed from: K */
    public final float[] f2716K;

    /* renamed from: L */
    public boolean f2717L;

    /* renamed from: M */
    public final C3100d f2718M;

    /* renamed from: N */
    public final C3100d f2719N;

    /* renamed from: a */
    public final Context f2720a;

    /* renamed from: b */
    public String[] f2721b;

    /* renamed from: c */
    public final LinearLayout f2722c;

    /* renamed from: d */
    public int f2723d;

    /* renamed from: e */
    public int f2724e;

    /* renamed from: f */
    public int f2725f;

    /* renamed from: g */
    public final Rect f2726g;

    /* renamed from: h */
    public final GradientDrawable f2727h;

    /* renamed from: i */
    public final GradientDrawable f2728i;

    /* renamed from: j */
    public final Paint f2729j;

    /* renamed from: k */
    public float f2730k;

    /* renamed from: l */
    public boolean f2731l;

    /* renamed from: m */
    public float f2732m;

    /* renamed from: n */
    public int f2733n;

    /* renamed from: o */
    public float f2734o;

    /* renamed from: p */
    public float f2735p;

    /* renamed from: q */
    public final float f2736q;

    /* renamed from: r */
    public final float f2737r;

    /* renamed from: s */
    public final float f2738s;

    /* renamed from: t */
    public final float f2739t;

    /* renamed from: u */
    public long f2740u;

    /* renamed from: v */
    public boolean f2741v;

    /* renamed from: w */
    public boolean f2742w;

    /* renamed from: x */
    public int f2743x;

    /* renamed from: y */
    public float f2744y;

    /* renamed from: z */
    public float f2745z;

    public SegmentTabLayout(Context context) {
        this(context, null, 0);
    }

    /* renamed from: a */
    public final void m2512a() {
        View childAt = this.f2722c.getChildAt(this.f2723d);
        float left = childAt.getLeft();
        float right = childAt.getRight();
        Rect rect = this.f2726g;
        rect.left = (int) left;
        rect.right = (int) right;
        boolean z8 = this.f2741v;
        float[] fArr = this.f2716K;
        if (z8) {
            float f = this.f2735p;
            fArr[0] = f;
            fArr[1] = f;
            fArr[2] = f;
            fArr[3] = f;
            fArr[4] = f;
            fArr[5] = f;
            fArr[6] = f;
            fArr[7] = f;
            return;
        }
        int i = this.f2723d;
        if (i == 0) {
            float f7 = this.f2735p;
            fArr[0] = f7;
            fArr[1] = f7;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = f7;
            fArr[7] = f7;
            return;
        }
        if (i != this.f2725f - 1) {
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = 0.0f;
            fArr[7] = 0.0f;
            return;
        }
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f8 = this.f2735p;
        fArr[2] = f8;
        fArr[3] = f8;
        fArr[4] = f8;
        fArr[5] = f8;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
    }

    /* renamed from: b */
    public final int m2513b(float f) {
        return (int) ((f * this.f2720a.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: c */
    public final void m2514c(int i) {
        int i8 = 0;
        while (i8 < this.f2725f) {
            View childAt = this.f2722c.getChildAt(i8);
            boolean z8 = i8 == i;
            TextView textView = (TextView) childAt.findViewById(R$id.tv_tab_title);
            textView.setTextColor(z8 ? this.f2707B : this.f2708C);
            if (this.f2709D == 1) {
                textView.getPaint().setFakeBoldText(z8);
            }
            i8++;
        }
    }

    /* renamed from: d */
    public final void m2515d() {
        int i = 0;
        while (i < this.f2725f) {
            View childAt = this.f2722c.getChildAt(i);
            float f = this.f2730k;
            childAt.setPadding((int) f, 0, (int) f, 0);
            TextView textView = (TextView) childAt.findViewById(R$id.tv_tab_title);
            textView.setTextColor(i == this.f2723d ? this.f2707B : this.f2708C);
            textView.setTextSize(0, this.f2706A);
            if (this.f2710E) {
                textView.setText(textView.getText().toString().toUpperCase());
            }
            int i8 = this.f2709D;
            if (i8 == 2) {
                textView.getPaint().setFakeBoldText(true);
            } else if (i8 == 0) {
                textView.getPaint().setFakeBoldText(false);
            }
            i++;
        }
    }

    public int getCurrentTab() {
        return this.f2723d;
    }

    public int getDividerColor() {
        return this.f2743x;
    }

    public float getDividerPadding() {
        return this.f2745z;
    }

    public float getDividerWidth() {
        return this.f2744y;
    }

    public long getIndicatorAnimDuration() {
        return this.f2740u;
    }

    public int getIndicatorColor() {
        return this.f2733n;
    }

    public float getIndicatorCornerRadius() {
        return this.f2735p;
    }

    public float getIndicatorHeight() {
        return this.f2734o;
    }

    public float getIndicatorMarginBottom() {
        return this.f2739t;
    }

    public float getIndicatorMarginLeft() {
        return this.f2736q;
    }

    public float getIndicatorMarginRight() {
        return this.f2738s;
    }

    public float getIndicatorMarginTop() {
        return this.f2737r;
    }

    public int getTabCount() {
        return this.f2725f;
    }

    public float getTabPadding() {
        return this.f2730k;
    }

    public float getTabWidth() {
        return this.f2732m;
    }

    public int getTextBold() {
        return this.f2709D;
    }

    public int getTextSelectColor() {
        return this.f2707B;
    }

    public int getTextUnselectColor() {
        return this.f2708C;
    }

    public float getTextsize() {
        return this.f2706A;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C3100d c3100d = (C3100d) valueAnimator.getAnimatedValue();
        int i = (int) c3100d.f1536a;
        Rect rect = this.f2726g;
        rect.left = i;
        rect.right = (int) c3100d.f1537b;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isInEditMode() || this.f2725f <= 0) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        if (this.f2734o < 0.0f) {
            this.f2734o = (height - this.f2737r) - this.f2739t;
        }
        float f = this.f2735p;
        if (f < 0.0f || f > this.f2734o / 2.0f) {
            this.f2735p = this.f2734o / 2.0f;
        }
        int i = this.f2711F;
        GradientDrawable gradientDrawable = this.f2728i;
        gradientDrawable.setColor(i);
        gradientDrawable.setStroke((int) this.f2713H, this.f2712G);
        gradientDrawable.setCornerRadius(this.f2735p);
        gradientDrawable.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        gradientDrawable.draw(canvas);
        if (!this.f2741v) {
            float f7 = this.f2744y;
            if (f7 > 0.0f) {
                Paint paint = this.f2729j;
                paint.setStrokeWidth(f7);
                paint.setColor(this.f2743x);
                for (int i8 = 0; i8 < this.f2725f - 1; i8++) {
                    View childAt = this.f2722c.getChildAt(i8);
                    canvas.drawLine(childAt.getRight() + paddingLeft, this.f2745z, childAt.getRight() + paddingLeft, height - this.f2745z, paint);
                }
            }
        }
        if (!this.f2741v) {
            m2512a();
        } else if (this.f2717L) {
            this.f2717L = false;
            m2512a();
        }
        int i9 = this.f2733n;
        GradientDrawable gradientDrawable2 = this.f2727h;
        gradientDrawable2.setColor(i9);
        int i10 = ((int) this.f2736q) + paddingLeft + this.f2726g.left;
        float f8 = this.f2737r;
        gradientDrawable2.setBounds(i10, (int) f8, (int) ((paddingLeft + r2.right) - this.f2738s), (int) (f8 + this.f2734o));
        gradientDrawable2.setCornerRadii(this.f2716K);
        gradientDrawable2.draw(canvas);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f2723d = bundle.getInt("mCurrentTab");
            parcelable = bundle.getParcelable("instanceState");
            if (this.f2723d != 0 && this.f2722c.getChildCount() > 0) {
                m2514c(this.f2723d);
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("mCurrentTab", this.f2723d);
        return bundle;
    }

    public void setCurrentTab(int i) {
        this.f2724e = this.f2723d;
        this.f2723d = i;
        m2514c(i);
        if (!this.f2741v) {
            invalidate();
            return;
        }
        int i8 = this.f2723d;
        LinearLayout linearLayout = this.f2722c;
        float left = linearLayout.getChildAt(i8).getLeft();
        C3100d c3100d = this.f2718M;
        c3100d.f1536a = left;
        c3100d.f1537b = r6.getRight();
        View childAt = linearLayout.getChildAt(this.f2724e);
        float left2 = childAt.getLeft();
        C3100d c3100d2 = this.f2719N;
        c3100d2.f1536a = left2;
        float right = childAt.getRight();
        c3100d2.f1537b = right;
        if (c3100d2.f1536a == c3100d.f1536a && right == c3100d.f1537b) {
            invalidate();
            return;
        }
        ValueAnimator valueAnimator = this.f2714I;
        valueAnimator.setObjectValues(c3100d2, c3100d);
        if (this.f2742w) {
            valueAnimator.setInterpolator(this.f2715J);
        }
        if (this.f2740u < 0) {
            this.f2740u = this.f2742w ? 500L : 250L;
        }
        valueAnimator.setDuration(this.f2740u);
        valueAnimator.start();
    }

    public void setDividerColor(int i) {
        this.f2743x = i;
        invalidate();
    }

    public void setDividerPadding(float f) {
        this.f2745z = m2513b(f);
        invalidate();
    }

    public void setDividerWidth(float f) {
        this.f2744y = m2513b(f);
        invalidate();
    }

    public void setIndicatorAnimDuration(long j7) {
        this.f2740u = j7;
    }

    public void setIndicatorAnimEnable(boolean z8) {
        this.f2741v = z8;
    }

    public void setIndicatorBounceEnable(boolean z8) {
        this.f2742w = z8;
    }

    public void setIndicatorColor(int i) {
        this.f2733n = i;
        invalidate();
    }

    public void setIndicatorCornerRadius(float f) {
        this.f2735p = m2513b(f);
        invalidate();
    }

    public void setIndicatorHeight(float f) {
        this.f2734o = m2513b(f);
        invalidate();
    }

    public void setTabData(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            throw new IllegalStateException("Titles can not be NULL or EMPTY !");
        }
        this.f2721b = strArr;
        LinearLayout linearLayout = this.f2722c;
        linearLayout.removeAllViews();
        this.f2725f = this.f2721b.length;
        for (int i = 0; i < this.f2725f; i++) {
            View viewInflate = View.inflate(this.f2720a, R$layout.layout_tab_segment, null);
            viewInflate.setTag(Integer.valueOf(i));
            ((TextView) viewInflate.findViewById(R$id.tv_tab_title)).setText(this.f2721b[i]);
            viewInflate.setOnClickListener(new ViewOnClickListenerC3099c(this, 0));
            LinearLayout.LayoutParams layoutParams = this.f2731l ? new LinearLayout.LayoutParams(0, -1, 1.0f) : new LinearLayout.LayoutParams(-2, -1);
            if (this.f2732m > 0.0f) {
                layoutParams = new LinearLayout.LayoutParams((int) this.f2732m, -1);
            }
            linearLayout.addView(viewInflate, i, layoutParams);
        }
        m2515d();
    }

    public void setTabPadding(float f) {
        this.f2730k = m2513b(f);
        m2515d();
    }

    public void setTabSpaceEqual(boolean z8) {
        this.f2731l = z8;
        m2515d();
    }

    public void setTabWidth(float f) {
        this.f2732m = m2513b(f);
        m2515d();
    }

    public void setTextAllCaps(boolean z8) {
        this.f2710E = z8;
        m2515d();
    }

    public void setTextBold(int i) {
        this.f2709D = i;
        m2515d();
    }

    public void setTextSelectColor(int i) {
        this.f2707B = i;
        m2515d();
    }

    public void setTextUnselectColor(int i) {
        this.f2708C = i;
        m2515d();
    }

    public void setTextsize(float f) {
        this.f2706A = (int) ((f * this.f2720a.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
        m2515d();
    }

    public SegmentTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SegmentTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2726g = new Rect();
        this.f2727h = new GradientDrawable();
        this.f2728i = new GradientDrawable();
        this.f2729j = new Paint(1);
        this.f2715J = new OvershootInterpolator(0.8f);
        this.f2716K = new float[8];
        this.f2717L = true;
        new Paint(1);
        new SparseArray();
        C3100d c3100d = new C3100d();
        this.f2718M = c3100d;
        C3100d c3100d2 = new C3100d();
        this.f2719N = c3100d2;
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
        this.f2720a = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f2722c = linearLayout;
        addView(linearLayout);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SegmentTabLayout);
        this.f2733n = typedArrayObtainStyledAttributes.getColor(R$styleable.SegmentTabLayout_tl_indicator_color, Color.parseColor("#222831"));
        this.f2734o = typedArrayObtainStyledAttributes.getDimension(R$styleable.SegmentTabLayout_tl_indicator_height, -1.0f);
        this.f2735p = typedArrayObtainStyledAttributes.getDimension(R$styleable.SegmentTabLayout_tl_indicator_corner_radius, -1.0f);
        this.f2736q = typedArrayObtainStyledAttributes.getDimension(R$styleable.SegmentTabLayout_tl_indicator_margin_left, m2513b(0.0f));
        this.f2737r = typedArrayObtainStyledAttributes.getDimension(R$styleable.SegmentTabLayout_tl_indicator_margin_top, 0.0f);
        this.f2738s = typedArrayObtainStyledAttributes.getDimension(R$styleable.SegmentTabLayout_tl_indicator_margin_right, m2513b(0.0f));
        this.f2739t = typedArrayObtainStyledAttributes.getDimension(R$styleable.SegmentTabLayout_tl_indicator_margin_bottom, 0.0f);
        this.f2741v = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SegmentTabLayout_tl_indicator_anim_enable, false);
        this.f2742w = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SegmentTabLayout_tl_indicator_bounce_enable, true);
        this.f2740u = typedArrayObtainStyledAttributes.getInt(R$styleable.SegmentTabLayout_tl_indicator_anim_duration, -1);
        this.f2743x = typedArrayObtainStyledAttributes.getColor(R$styleable.SegmentTabLayout_tl_divider_color, this.f2733n);
        this.f2744y = typedArrayObtainStyledAttributes.getDimension(R$styleable.SegmentTabLayout_tl_divider_width, m2513b(1.0f));
        this.f2745z = typedArrayObtainStyledAttributes.getDimension(R$styleable.SegmentTabLayout_tl_divider_padding, 0.0f);
        this.f2706A = typedArrayObtainStyledAttributes.getDimension(R$styleable.SegmentTabLayout_tl_textsize, (int) ((13.0f * this.f2720a.getResources().getDisplayMetrics().scaledDensity) + 0.5f));
        this.f2707B = typedArrayObtainStyledAttributes.getColor(R$styleable.SegmentTabLayout_tl_textSelectColor, Color.parseColor("#ffffff"));
        this.f2708C = typedArrayObtainStyledAttributes.getColor(R$styleable.SegmentTabLayout_tl_textUnselectColor, this.f2733n);
        this.f2709D = typedArrayObtainStyledAttributes.getInt(R$styleable.SegmentTabLayout_tl_textBold, 0);
        this.f2710E = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SegmentTabLayout_tl_textAllCaps, false);
        this.f2731l = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SegmentTabLayout_tl_tab_space_equal, true);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.SegmentTabLayout_tl_tab_width, m2513b(-1.0f));
        this.f2732m = dimension;
        this.f2730k = typedArrayObtainStyledAttributes.getDimension(R$styleable.SegmentTabLayout_tl_tab_padding, (this.f2731l || dimension > 0.0f) ? m2513b(0.0f) : m2513b(10.0f));
        this.f2711F = typedArrayObtainStyledAttributes.getColor(R$styleable.SegmentTabLayout_tl_bar_color, 0);
        this.f2712G = typedArrayObtainStyledAttributes.getColor(R$styleable.SegmentTabLayout_tl_bar_stroke_color, this.f2733n);
        this.f2713H = typedArrayObtainStyledAttributes.getDimension(R$styleable.SegmentTabLayout_tl_bar_stroke_width, m2513b(1.0f));
        typedArrayObtainStyledAttributes.recycle();
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "layout_height");
        if (!attributeValue.equals("-1") && !attributeValue.equals("-2")) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.layout_height});
            typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -2);
            typedArrayObtainStyledAttributes2.recycle();
        }
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new C3098b(1), c3100d2, c3100d);
        this.f2714I = valueAnimatorOfObject;
        valueAnimatorOfObject.addUpdateListener(this);
    }

    public void setOnTabSelectListener(InterfaceC3216a interfaceC3216a) {
    }
}
