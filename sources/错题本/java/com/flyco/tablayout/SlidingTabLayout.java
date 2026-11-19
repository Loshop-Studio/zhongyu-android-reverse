package com.flyco.tablayout;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.AbstractC0037f;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.collection.AbstractC0584a;
import androidx.viewpager.widget.ViewPager;
import p017b1.ViewOnClickListenerC3099c;
import p025c1.InterfaceC3216a;

/* loaded from: classes2.dex */
public class SlidingTabLayout extends HorizontalScrollView implements ViewPager.OnPageChangeListener {

    /* renamed from: A */
    public boolean f2746A;

    /* renamed from: B */
    public int f2747B;

    /* renamed from: C */
    public float f2748C;

    /* renamed from: D */
    public int f2749D;

    /* renamed from: E */
    public int f2750E;

    /* renamed from: F */
    public float f2751F;

    /* renamed from: G */
    public float f2752G;

    /* renamed from: H */
    public float f2753H;

    /* renamed from: I */
    public int f2754I;

    /* renamed from: J */
    public int f2755J;

    /* renamed from: K */
    public int f2756K;

    /* renamed from: L */
    public boolean f2757L;

    /* renamed from: M */
    public int f2758M;

    /* renamed from: N */
    public boolean f2759N;

    /* renamed from: O */
    public float f2760O;

    /* renamed from: P */
    public final Paint f2761P;

    /* renamed from: a */
    public final Context f2762a;

    /* renamed from: b */
    public ViewPager f2763b;

    /* renamed from: c */
    public final LinearLayout f2764c;

    /* renamed from: d */
    public int f2765d;

    /* renamed from: e */
    public float f2766e;

    /* renamed from: f */
    public int f2767f;

    /* renamed from: g */
    public final Rect f2768g;

    /* renamed from: h */
    public final Rect f2769h;

    /* renamed from: i */
    public final GradientDrawable f2770i;

    /* renamed from: j */
    public final Paint f2771j;

    /* renamed from: k */
    public final Paint f2772k;

    /* renamed from: l */
    public final Paint f2773l;

    /* renamed from: m */
    public final Path f2774m;

    /* renamed from: n */
    public int f2775n;

    /* renamed from: o */
    public float f2776o;

    /* renamed from: p */
    public boolean f2777p;

    /* renamed from: q */
    public float f2778q;

    /* renamed from: r */
    public int f2779r;

    /* renamed from: s */
    public float f2780s;

    /* renamed from: t */
    public float f2781t;

    /* renamed from: u */
    public float f2782u;

    /* renamed from: v */
    public final float f2783v;

    /* renamed from: w */
    public final float f2784w;

    /* renamed from: x */
    public final float f2785x;

    /* renamed from: y */
    public final float f2786y;

    /* renamed from: z */
    public int f2787z;

    public SlidingTabLayout(Context context) {
        this(context, null, 0);
    }

    /* renamed from: a */
    public final void m2516a() {
        int i = this.f2765d;
        LinearLayout linearLayout = this.f2764c;
        View childAt = linearLayout.getChildAt(i);
        float left = childAt.getLeft();
        float right = childAt.getRight();
        int i8 = this.f2775n;
        Paint paint = this.f2761P;
        if (i8 == 0 && this.f2746A) {
            TextView textView = (TextView) childAt.findViewById(R$id.tv_tab_title);
            paint.setTextSize(this.f2753H);
            this.f2760O = ((right - left) - paint.measureText(textView.getText().toString())) / 2.0f;
        }
        int i9 = this.f2765d;
        if (i9 < this.f2767f - 1) {
            View childAt2 = linearLayout.getChildAt(i9 + 1);
            float left2 = childAt2.getLeft();
            float right2 = childAt2.getRight();
            float f = this.f2766e;
            left = AbstractC0037f.m77b(left2, left, f, left);
            right = AbstractC0037f.m77b(right2, right, f, right);
            if (this.f2775n == 0 && this.f2746A) {
                TextView textView2 = (TextView) childAt2.findViewById(R$id.tv_tab_title);
                paint.setTextSize(this.f2753H);
                float fMeasureText = ((right2 - left2) - paint.measureText(textView2.getText().toString())) / 2.0f;
                float f7 = this.f2760O;
                this.f2760O = AbstractC0037f.m77b(fMeasureText, f7, this.f2766e, f7);
            }
        }
        int i10 = (int) left;
        Rect rect = this.f2768g;
        rect.left = i10;
        int i11 = (int) right;
        rect.right = i11;
        if (this.f2775n == 0 && this.f2746A) {
            float f8 = this.f2760O;
            rect.left = (int) ((left + f8) - 1.0f);
            rect.right = (int) ((right - f8) - 1.0f);
        }
        Rect rect2 = this.f2769h;
        rect2.left = i10;
        rect2.right = i11;
        if (this.f2781t < 0.0f) {
            return;
        }
        float fM900a = AbstractC0584a.m900a(childAt.getWidth(), this.f2781t, 2.0f, childAt.getLeft());
        int i12 = this.f2765d;
        if (i12 < this.f2767f - 1) {
            View childAt3 = linearLayout.getChildAt(i12 + 1);
            fM900a += this.f2766e * ((childAt3.getWidth() / 2) + (childAt.getWidth() / 2));
        }
        int i13 = (int) fM900a;
        rect.left = i13;
        rect.right = (int) (i13 + this.f2781t);
    }

    /* renamed from: b */
    public final int m2517b(float f) {
        return (int) ((f * this.f2762a.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: c */
    public final void m2518c() {
        if (this.f2767f <= 0) {
            return;
        }
        float f = this.f2766e;
        int i = this.f2765d;
        int width = (int) (f * r2.getChildAt(i).getWidth());
        int left = this.f2764c.getChildAt(this.f2765d).getLeft() + width;
        if (this.f2765d > 0 || width > 0) {
            int width2 = left - ((getWidth() / 2) - getPaddingLeft());
            m2516a();
            Rect rect = this.f2769h;
            left = width2 + ((rect.right - rect.left) / 2);
        }
        if (left != this.f2758M) {
            this.f2758M = left;
            scrollTo(left, 0);
        }
    }

    /* renamed from: d */
    public final void m2519d(int i) {
        int i8 = 0;
        while (i8 < this.f2767f) {
            View childAt = this.f2764c.getChildAt(i8);
            boolean z8 = i8 == i;
            TextView textView = (TextView) childAt.findViewById(R$id.tv_tab_title);
            if (textView != null) {
                textView.setTextColor(z8 ? this.f2754I : this.f2755J);
                if (this.f2756K == 1) {
                    textView.getPaint().setFakeBoldText(z8);
                }
            }
            i8++;
        }
    }

    /* renamed from: e */
    public final void m2520e() {
        int i = 0;
        while (i < this.f2767f) {
            TextView textView = (TextView) this.f2764c.getChildAt(i).findViewById(R$id.tv_tab_title);
            if (textView != null) {
                textView.setTextColor(i == this.f2765d ? this.f2754I : this.f2755J);
                textView.setTextSize(0, this.f2753H);
                float f = this.f2776o;
                textView.setPadding((int) f, 0, (int) f, 0);
                if (this.f2757L) {
                    textView.setText(textView.getText().toString().toUpperCase());
                }
                int i8 = this.f2756K;
                if (i8 == 2) {
                    textView.getPaint().setFakeBoldText(true);
                } else if (i8 == 0) {
                    textView.getPaint().setFakeBoldText(false);
                }
            }
            i++;
        }
    }

    public int getCurrentTab() {
        return this.f2765d;
    }

    public int getDividerColor() {
        return this.f2750E;
    }

    public float getDividerPadding() {
        return this.f2752G;
    }

    public float getDividerWidth() {
        return this.f2751F;
    }

    public int getIndicatorColor() {
        return this.f2779r;
    }

    public float getIndicatorCornerRadius() {
        return this.f2782u;
    }

    public float getIndicatorHeight() {
        return this.f2780s;
    }

    public float getIndicatorMarginBottom() {
        return this.f2786y;
    }

    public float getIndicatorMarginLeft() {
        return this.f2783v;
    }

    public float getIndicatorMarginRight() {
        return this.f2785x;
    }

    public float getIndicatorMarginTop() {
        return this.f2784w;
    }

    public int getIndicatorStyle() {
        return this.f2775n;
    }

    public float getIndicatorWidth() {
        return this.f2781t;
    }

    public int getTabCount() {
        return this.f2767f;
    }

    public float getTabPadding() {
        return this.f2776o;
    }

    public float getTabWidth() {
        return this.f2778q;
    }

    public int getTextBold() {
        return this.f2756K;
    }

    public int getTextSelectColor() {
        return this.f2754I;
    }

    public int getTextUnselectColor() {
        return this.f2755J;
    }

    public float getTextsize() {
        return this.f2753H;
    }

    public int getUnderlineColor() {
        return this.f2747B;
    }

    public float getUnderlineHeight() {
        return this.f2748C;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isInEditMode() || this.f2767f <= 0) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        float f = this.f2751F;
        LinearLayout linearLayout = this.f2764c;
        if (f > 0.0f) {
            Paint paint = this.f2772k;
            paint.setStrokeWidth(f);
            paint.setColor(this.f2750E);
            for (int i = 0; i < this.f2767f - 1; i++) {
                View childAt = linearLayout.getChildAt(i);
                canvas.drawLine(childAt.getRight() + paddingLeft, this.f2752G, childAt.getRight() + paddingLeft, height - this.f2752G, paint);
            }
        }
        if (this.f2748C > 0.0f) {
            int i8 = this.f2747B;
            Paint paint2 = this.f2771j;
            paint2.setColor(i8);
            if (this.f2749D == 80) {
                float f7 = height;
                canvas.drawRect(paddingLeft, f7 - this.f2748C, linearLayout.getWidth() + paddingLeft, f7, paint2);
            } else {
                canvas.drawRect(paddingLeft, 0.0f, linearLayout.getWidth() + paddingLeft, this.f2748C, paint2);
            }
        }
        m2516a();
        int i9 = this.f2775n;
        Rect rect = this.f2768g;
        if (i9 == 1) {
            if (this.f2780s > 0.0f) {
                int i10 = this.f2779r;
                Paint paint3 = this.f2773l;
                paint3.setColor(i10);
                Path path = this.f2774m;
                path.reset();
                float f8 = height;
                path.moveTo(rect.left + paddingLeft, f8);
                path.lineTo((rect.right / 2) + (rect.left / 2) + paddingLeft, f8 - this.f2780s);
                path.lineTo(paddingLeft + rect.right, f8);
                path.close();
                canvas.drawPath(path, paint3);
                return;
            }
            return;
        }
        GradientDrawable gradientDrawable = this.f2770i;
        if (i9 != 2) {
            if (this.f2780s > 0.0f) {
                gradientDrawable.setColor(this.f2779r);
                if (this.f2787z == 80) {
                    int i11 = ((int) this.f2783v) + paddingLeft + rect.left;
                    int i12 = height - ((int) this.f2780s);
                    float f9 = this.f2786y;
                    gradientDrawable.setBounds(i11, i12 - ((int) f9), (paddingLeft + rect.right) - ((int) this.f2785x), height - ((int) f9));
                } else {
                    int i13 = ((int) this.f2783v) + paddingLeft + rect.left;
                    float f10 = this.f2784w;
                    gradientDrawable.setBounds(i13, (int) f10, (paddingLeft + rect.right) - ((int) this.f2785x), ((int) this.f2780s) + ((int) f10));
                }
                gradientDrawable.setCornerRadius(this.f2782u);
                gradientDrawable.draw(canvas);
                return;
            }
            return;
        }
        if (this.f2780s < 0.0f) {
            this.f2780s = (height - this.f2784w) - this.f2786y;
        }
        float f11 = this.f2780s;
        if (f11 > 0.0f) {
            float f12 = this.f2782u;
            if (f12 < 0.0f || f12 > f11 / 2.0f) {
                this.f2782u = f11 / 2.0f;
            }
            gradientDrawable.setColor(this.f2779r);
            int i14 = ((int) this.f2783v) + paddingLeft + rect.left;
            float f13 = this.f2784w;
            gradientDrawable.setBounds(i14, (int) f13, (int) ((paddingLeft + rect.right) - this.f2785x), (int) (f13 + this.f2780s));
            gradientDrawable.setCornerRadius(this.f2782u);
            gradientDrawable.draw(canvas);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i, float f, int i8) {
        this.f2765d = i;
        this.f2766e = f;
        m2518c();
        invalidate();
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i) {
        m2519d(i);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f2765d = bundle.getInt("mCurrentTab");
            parcelable = bundle.getParcelable("instanceState");
            if (this.f2765d != 0 && this.f2764c.getChildCount() > 0) {
                m2519d(this.f2765d);
                m2518c();
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("mCurrentTab", this.f2765d);
        return bundle;
    }

    public void setCurrentTab(int i) {
        this.f2765d = i;
        this.f2763b.setCurrentItem(i);
    }

    public void setDividerColor(int i) {
        this.f2750E = i;
        invalidate();
    }

    public void setDividerPadding(float f) {
        this.f2752G = m2517b(f);
        invalidate();
    }

    public void setDividerWidth(float f) {
        this.f2751F = m2517b(f);
        invalidate();
    }

    public void setIndicatorColor(int i) {
        this.f2779r = i;
        invalidate();
    }

    public void setIndicatorCornerRadius(float f) {
        this.f2782u = m2517b(f);
        invalidate();
    }

    public void setIndicatorGravity(int i) {
        this.f2787z = i;
        invalidate();
    }

    public void setIndicatorHeight(float f) {
        this.f2780s = m2517b(f);
        invalidate();
    }

    public void setIndicatorStyle(int i) {
        this.f2775n = i;
        invalidate();
    }

    public void setIndicatorWidth(float f) {
        this.f2781t = m2517b(f);
        invalidate();
    }

    public void setIndicatorWidthEqualTitle(boolean z8) {
        this.f2746A = z8;
        invalidate();
    }

    public void setSnapOnTabClick(boolean z8) {
        this.f2759N = z8;
    }

    public void setTabPadding(float f) {
        this.f2776o = m2517b(f);
        m2520e();
    }

    public void setTabSpaceEqual(boolean z8) {
        this.f2777p = z8;
        m2520e();
    }

    public void setTabWidth(float f) {
        this.f2778q = m2517b(f);
        m2520e();
    }

    public void setTextAllCaps(boolean z8) {
        this.f2757L = z8;
        m2520e();
    }

    public void setTextBold(int i) {
        this.f2756K = i;
        m2520e();
    }

    public void setTextSelectColor(int i) {
        this.f2754I = i;
        m2520e();
    }

    public void setTextUnselectColor(int i) {
        this.f2755J = i;
        m2520e();
    }

    public void setTextsize(float f) {
        this.f2753H = (int) ((f * this.f2762a.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
        m2520e();
    }

    public void setUnderlineColor(int i) {
        this.f2747B = i;
        invalidate();
    }

    public void setUnderlineGravity(int i) {
        this.f2749D = i;
        invalidate();
    }

    public void setUnderlineHeight(float f) {
        this.f2748C = m2517b(f);
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        if (viewPager == null || viewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager or ViewPager adapter can not be NULL !");
        }
        this.f2763b = viewPager;
        viewPager.removeOnPageChangeListener(this);
        this.f2763b.addOnPageChangeListener(this);
        LinearLayout linearLayout = this.f2764c;
        linearLayout.removeAllViews();
        this.f2767f = this.f2763b.getAdapter().getCount();
        for (int i = 0; i < this.f2767f; i++) {
            View viewInflate = View.inflate(this.f2762a, R$layout.layout_tab, null);
            String string = this.f2763b.getAdapter().getPageTitle(i).toString();
            TextView textView = (TextView) viewInflate.findViewById(R$id.tv_tab_title);
            if (textView != null && string != null) {
                textView.setText(string);
            }
            viewInflate.setOnClickListener(new ViewOnClickListenerC3099c(this, 1));
            LinearLayout.LayoutParams layoutParams = this.f2777p ? new LinearLayout.LayoutParams(0, -1, 1.0f) : new LinearLayout.LayoutParams(-2, -1);
            if (this.f2778q > 0.0f) {
                layoutParams = new LinearLayout.LayoutParams((int) this.f2778q, -1);
            }
            linearLayout.addView(viewInflate, i, layoutParams);
        }
        m2520e();
    }

    public SlidingTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingTabLayout(Context context, AttributeSet attributeSet, int i) {
        float f;
        super(context, attributeSet, i);
        this.f2768g = new Rect();
        this.f2769h = new Rect();
        this.f2770i = new GradientDrawable();
        this.f2771j = new Paint(1);
        this.f2772k = new Paint(1);
        this.f2773l = new Paint(1);
        this.f2774m = new Path();
        this.f2775n = 0;
        this.f2761P = new Paint(1);
        new SparseArray();
        setFillViewport(true);
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
        this.f2762a = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f2764c = linearLayout;
        addView(linearLayout);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SlidingTabLayout);
        int i8 = typedArrayObtainStyledAttributes.getInt(R$styleable.SlidingTabLayout_tl_indicator_style, 0);
        this.f2775n = i8;
        this.f2779r = typedArrayObtainStyledAttributes.getColor(R$styleable.SlidingTabLayout_tl_indicator_color, Color.parseColor(i8 == 2 ? "#4B6A87" : "#ffffff"));
        int i9 = R$styleable.SlidingTabLayout_tl_indicator_height;
        int i10 = this.f2775n;
        if (i10 == 1) {
            f = 4.0f;
        } else {
            f = i10 == 2 ? -1 : 2;
        }
        this.f2780s = typedArrayObtainStyledAttributes.getDimension(i9, m2517b(f));
        this.f2781t = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_indicator_width, m2517b(this.f2775n == 1 ? 10.0f : -1.0f));
        this.f2782u = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_indicator_corner_radius, m2517b(this.f2775n == 2 ? -1.0f : 0.0f));
        this.f2783v = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_indicator_margin_left, m2517b(0.0f));
        this.f2784w = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_indicator_margin_top, m2517b(this.f2775n == 2 ? 7.0f : 0.0f));
        this.f2785x = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_indicator_margin_right, m2517b(0.0f));
        this.f2786y = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_indicator_margin_bottom, m2517b(this.f2775n != 2 ? 0.0f : 7.0f));
        this.f2787z = typedArrayObtainStyledAttributes.getInt(R$styleable.SlidingTabLayout_tl_indicator_gravity, 80);
        this.f2746A = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SlidingTabLayout_tl_indicator_width_equal_title, false);
        this.f2747B = typedArrayObtainStyledAttributes.getColor(R$styleable.SlidingTabLayout_tl_underline_color, Color.parseColor("#ffffff"));
        this.f2748C = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_underline_height, m2517b(0.0f));
        this.f2749D = typedArrayObtainStyledAttributes.getInt(R$styleable.SlidingTabLayout_tl_underline_gravity, 80);
        this.f2750E = typedArrayObtainStyledAttributes.getColor(R$styleable.SlidingTabLayout_tl_divider_color, Color.parseColor("#ffffff"));
        this.f2751F = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_divider_width, m2517b(0.0f));
        this.f2752G = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_divider_padding, m2517b(12.0f));
        this.f2753H = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_textsize, (int) ((14.0f * this.f2762a.getResources().getDisplayMetrics().scaledDensity) + 0.5f));
        this.f2754I = typedArrayObtainStyledAttributes.getColor(R$styleable.SlidingTabLayout_tl_textSelectColor, Color.parseColor("#ffffff"));
        this.f2755J = typedArrayObtainStyledAttributes.getColor(R$styleable.SlidingTabLayout_tl_textUnselectColor, Color.parseColor("#AAffffff"));
        this.f2756K = typedArrayObtainStyledAttributes.getInt(R$styleable.SlidingTabLayout_tl_textBold, 0);
        this.f2757L = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SlidingTabLayout_tl_textAllCaps, false);
        this.f2777p = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SlidingTabLayout_tl_tab_space_equal, false);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_tab_width, m2517b(-1.0f));
        this.f2778q = dimension;
        this.f2776o = typedArrayObtainStyledAttributes.getDimension(R$styleable.SlidingTabLayout_tl_tab_padding, (this.f2777p || dimension > 0.0f) ? m2517b(0.0f) : m2517b(20.0f));
        typedArrayObtainStyledAttributes.recycle();
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "layout_height");
        if (attributeValue.equals("-1") || attributeValue.equals("-2")) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.layout_height});
        typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -2);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public void setOnTabSelectListener(InterfaceC3216a interfaceC3216a) {
    }
}
