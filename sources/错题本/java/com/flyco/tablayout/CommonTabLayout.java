package com.flyco.tablayout;

import android.R;
import android.animation.ValueAnimator;
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
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.collection.AbstractC0584a;
import java.util.ArrayList;
import p017b1.C3097a;
import p017b1.C3098b;
import p025c1.InterfaceC3216a;

/* loaded from: classes2.dex */
public class CommonTabLayout extends FrameLayout implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: A */
    public boolean f2657A;

    /* renamed from: B */
    public int f2658B;

    /* renamed from: C */
    public int f2659C;

    /* renamed from: D */
    public float f2660D;

    /* renamed from: E */
    public int f2661E;

    /* renamed from: F */
    public int f2662F;

    /* renamed from: G */
    public float f2663G;

    /* renamed from: H */
    public float f2664H;

    /* renamed from: I */
    public float f2665I;

    /* renamed from: J */
    public int f2666J;

    /* renamed from: K */
    public int f2667K;

    /* renamed from: L */
    public int f2668L;

    /* renamed from: M */
    public boolean f2669M;

    /* renamed from: N */
    public boolean f2670N;

    /* renamed from: O */
    public int f2671O;

    /* renamed from: P */
    public float f2672P;

    /* renamed from: Q */
    public float f2673Q;

    /* renamed from: R */
    public float f2674R;

    /* renamed from: S */
    public final ValueAnimator f2675S;

    /* renamed from: T */
    public final OvershootInterpolator f2676T;

    /* renamed from: U */
    public boolean f2677U;

    /* renamed from: V */
    public final C3097a f2678V;

    /* renamed from: W */
    public final C3097a f2679W;

    /* renamed from: a */
    public final Context f2680a;

    /* renamed from: b */
    public final ArrayList f2681b;

    /* renamed from: c */
    public final LinearLayout f2682c;

    /* renamed from: d */
    public int f2683d;

    /* renamed from: e */
    public int f2684e;

    /* renamed from: f */
    public int f2685f;

    /* renamed from: g */
    public final Rect f2686g;

    /* renamed from: h */
    public final GradientDrawable f2687h;

    /* renamed from: i */
    public final Paint f2688i;

    /* renamed from: j */
    public final Paint f2689j;

    /* renamed from: k */
    public final Paint f2690k;

    /* renamed from: l */
    public final Path f2691l;

    /* renamed from: m */
    public int f2692m;

    /* renamed from: n */
    public float f2693n;

    /* renamed from: o */
    public boolean f2694o;

    /* renamed from: p */
    public float f2695p;

    /* renamed from: q */
    public int f2696q;

    /* renamed from: r */
    public float f2697r;

    /* renamed from: s */
    public float f2698s;

    /* renamed from: t */
    public float f2699t;

    /* renamed from: u */
    public final float f2700u;

    /* renamed from: v */
    public final float f2701v;

    /* renamed from: w */
    public final float f2702w;

    /* renamed from: x */
    public final float f2703x;

    /* renamed from: y */
    public long f2704y;

    /* renamed from: z */
    public boolean f2705z;

    public CommonTabLayout(Context context) {
        this(context, null, 0);
    }

    /* renamed from: a */
    public final void m2507a() {
        View childAt = this.f2682c.getChildAt(this.f2683d);
        float left = childAt.getLeft();
        float right = childAt.getRight();
        Rect rect = this.f2686g;
        rect.left = (int) left;
        rect.right = (int) right;
        if (this.f2698s < 0.0f) {
            return;
        }
        float left2 = childAt.getLeft();
        float width = childAt.getWidth();
        float f = this.f2698s;
        int iM900a = (int) AbstractC0584a.m900a(width, f, 2.0f, left2);
        rect.left = iM900a;
        rect.right = (int) (iM900a + f);
    }

    /* renamed from: b */
    public final int m2508b(float f) {
        return (int) ((f * this.f2680a.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: c */
    public final void m2509c() {
        this.f2682c.removeAllViews();
        ArrayList arrayList = this.f2681b;
        int size = arrayList.size();
        this.f2685f = size;
        if (size <= 0) {
            m2511e();
            return;
        }
        int i = this.f2671O;
        Context context = this.f2680a;
        View viewInflate = i != 3 ? i != 5 ? i == 80 ? View.inflate(context, R$layout.layout_tab_bottom, null) : View.inflate(context, R$layout.layout_tab_top, null) : View.inflate(context, R$layout.layout_tab_right, null) : View.inflate(context, R$layout.layout_tab_left, null);
        viewInflate.setTag(0);
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    /* renamed from: d */
    public final void m2510d(int i) {
        if (this.f2685f > 0) {
            View childAt = this.f2682c.getChildAt(0);
            ((TextView) childAt.findViewById(R$id.tv_tab_title)).setTextColor(i == 0 ? this.f2666J : this.f2667K);
            if (this.f2681b.get(0) != null) {
                throw new ClassCastException();
            }
            throw null;
        }
    }

    /* renamed from: e */
    public final void m2511e() {
        int i = 0;
        while (i < this.f2685f) {
            View childAt = this.f2682c.getChildAt(i);
            int i8 = (int) this.f2693n;
            childAt.setPadding(i8, 0, i8, 0);
            TextView textView = (TextView) childAt.findViewById(R$id.tv_tab_title);
            textView.setTextColor(i == this.f2683d ? this.f2666J : this.f2667K);
            textView.setTextSize(0, this.f2665I);
            if (this.f2669M) {
                textView.setText(textView.getText().toString().toUpperCase());
            }
            int i9 = this.f2668L;
            if (i9 == 2) {
                textView.getPaint().setFakeBoldText(true);
            } else if (i9 == 0) {
                textView.getPaint().setFakeBoldText(false);
            }
            ImageView imageView = (ImageView) childAt.findViewById(R$id.iv_tab_icon);
            if (this.f2670N) {
                imageView.setVisibility(0);
                if (this.f2681b.get(i) != null) {
                    throw new ClassCastException();
                }
                int i10 = this.f2683d;
                throw null;
            }
            imageView.setVisibility(8);
            i++;
        }
    }

    public int getCurrentTab() {
        return this.f2683d;
    }

    public int getDividerColor() {
        return this.f2662F;
    }

    public float getDividerPadding() {
        return this.f2664H;
    }

    public float getDividerWidth() {
        return this.f2663G;
    }

    public int getIconGravity() {
        return this.f2671O;
    }

    public float getIconHeight() {
        return this.f2673Q;
    }

    public float getIconMargin() {
        return this.f2674R;
    }

    public float getIconWidth() {
        return this.f2672P;
    }

    public long getIndicatorAnimDuration() {
        return this.f2704y;
    }

    public int getIndicatorColor() {
        return this.f2696q;
    }

    public float getIndicatorCornerRadius() {
        return this.f2699t;
    }

    public float getIndicatorHeight() {
        return this.f2697r;
    }

    public float getIndicatorMarginBottom() {
        return this.f2703x;
    }

    public float getIndicatorMarginLeft() {
        return this.f2700u;
    }

    public float getIndicatorMarginRight() {
        return this.f2702w;
    }

    public float getIndicatorMarginTop() {
        return this.f2701v;
    }

    public int getIndicatorStyle() {
        return this.f2692m;
    }

    public float getIndicatorWidth() {
        return this.f2698s;
    }

    public int getTabCount() {
        return this.f2685f;
    }

    public float getTabPadding() {
        return this.f2693n;
    }

    public float getTabWidth() {
        return this.f2695p;
    }

    public int getTextBold() {
        return this.f2668L;
    }

    public int getTextSelectColor() {
        return this.f2666J;
    }

    public int getTextUnselectColor() {
        return this.f2667K;
    }

    public float getTextsize() {
        return this.f2665I;
    }

    public int getUnderlineColor() {
        return this.f2659C;
    }

    public float getUnderlineHeight() {
        return this.f2660D;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View childAt = this.f2682c.getChildAt(this.f2683d);
        C3097a c3097a = (C3097a) valueAnimator.getAnimatedValue();
        float f = c3097a.f1531a;
        Rect rect = this.f2686g;
        rect.left = (int) f;
        rect.right = (int) c3097a.f1532b;
        if (this.f2698s >= 0.0f) {
            float width = childAt.getWidth();
            float f7 = this.f2698s;
            int iM900a = (int) AbstractC0584a.m900a(width, f7, 2.0f, f);
            rect.left = iM900a;
            rect.right = (int) (iM900a + f7);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isInEditMode() || this.f2685f <= 0) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        float f = this.f2663G;
        LinearLayout linearLayout = this.f2682c;
        if (f > 0.0f) {
            Paint paint = this.f2689j;
            paint.setStrokeWidth(f);
            paint.setColor(this.f2662F);
            for (int i = 0; i < this.f2685f - 1; i++) {
                View childAt = linearLayout.getChildAt(i);
                canvas.drawLine(childAt.getRight() + paddingLeft, this.f2664H, childAt.getRight() + paddingLeft, height - this.f2664H, paint);
            }
        }
        if (this.f2660D > 0.0f) {
            int i8 = this.f2659C;
            Paint paint2 = this.f2688i;
            paint2.setColor(i8);
            if (this.f2661E == 80) {
                float f7 = height;
                canvas.drawRect(paddingLeft, f7 - this.f2660D, linearLayout.getWidth() + paddingLeft, f7, paint2);
            } else {
                canvas.drawRect(paddingLeft, 0.0f, linearLayout.getWidth() + paddingLeft, this.f2660D, paint2);
            }
        }
        if (!this.f2705z) {
            m2507a();
        } else if (this.f2677U) {
            this.f2677U = false;
            m2507a();
        }
        int i9 = this.f2692m;
        Rect rect = this.f2686g;
        if (i9 == 1) {
            if (this.f2697r > 0.0f) {
                int i10 = this.f2696q;
                Paint paint3 = this.f2690k;
                paint3.setColor(i10);
                Path path = this.f2691l;
                path.reset();
                float f8 = height;
                path.moveTo(rect.left + paddingLeft, f8);
                path.lineTo((rect.right / 2) + (rect.left / 2) + paddingLeft, f8 - this.f2697r);
                path.lineTo(paddingLeft + rect.right, f8);
                path.close();
                canvas.drawPath(path, paint3);
                return;
            }
            return;
        }
        GradientDrawable gradientDrawable = this.f2687h;
        if (i9 != 2) {
            if (this.f2697r > 0.0f) {
                gradientDrawable.setColor(this.f2696q);
                if (this.f2658B == 80) {
                    int i11 = ((int) this.f2700u) + paddingLeft + rect.left;
                    int i12 = height - ((int) this.f2697r);
                    int i13 = (int) this.f2703x;
                    gradientDrawable.setBounds(i11, i12 - i13, (paddingLeft + rect.right) - ((int) this.f2702w), height - i13);
                } else {
                    int i14 = ((int) this.f2700u) + paddingLeft + rect.left;
                    int i15 = (int) this.f2701v;
                    gradientDrawable.setBounds(i14, i15, (paddingLeft + rect.right) - ((int) this.f2702w), ((int) this.f2697r) + i15);
                }
                gradientDrawable.setCornerRadius(this.f2699t);
                gradientDrawable.draw(canvas);
                return;
            }
            return;
        }
        if (this.f2697r < 0.0f) {
            this.f2697r = (height - this.f2701v) - this.f2703x;
        }
        float f9 = this.f2697r;
        if (f9 > 0.0f) {
            float f10 = this.f2699t;
            if (f10 < 0.0f || f10 > f9 / 2.0f) {
                this.f2699t = f9 / 2.0f;
            }
            gradientDrawable.setColor(this.f2696q);
            int i16 = ((int) this.f2700u) + paddingLeft + rect.left;
            float f11 = this.f2701v;
            gradientDrawable.setBounds(i16, (int) f11, (int) ((paddingLeft + rect.right) - this.f2702w), (int) (f11 + this.f2697r));
            gradientDrawable.setCornerRadius(this.f2699t);
            gradientDrawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f2683d = bundle.getInt("mCurrentTab");
            parcelable = bundle.getParcelable("instanceState");
            if (this.f2683d != 0 && this.f2682c.getChildCount() > 0) {
                m2510d(this.f2683d);
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("mCurrentTab", this.f2683d);
        return bundle;
    }

    public void setCurrentTab(int i) {
        this.f2684e = this.f2683d;
        this.f2683d = i;
        m2510d(i);
        if (!this.f2705z) {
            invalidate();
            return;
        }
        int i8 = this.f2683d;
        LinearLayout linearLayout = this.f2682c;
        float left = linearLayout.getChildAt(i8).getLeft();
        C3097a c3097a = this.f2678V;
        c3097a.f1531a = left;
        c3097a.f1532b = r6.getRight();
        View childAt = linearLayout.getChildAt(this.f2684e);
        float left2 = childAt.getLeft();
        C3097a c3097a2 = this.f2679W;
        c3097a2.f1531a = left2;
        float right = childAt.getRight();
        c3097a2.f1532b = right;
        if (c3097a2.f1531a == c3097a.f1531a && right == c3097a.f1532b) {
            invalidate();
            return;
        }
        ValueAnimator valueAnimator = this.f2675S;
        valueAnimator.setObjectValues(c3097a2, c3097a);
        if (this.f2657A) {
            valueAnimator.setInterpolator(this.f2676T);
        }
        if (this.f2704y < 0) {
            this.f2704y = this.f2657A ? 500L : 250L;
        }
        valueAnimator.setDuration(this.f2704y);
        valueAnimator.start();
    }

    public void setDividerColor(int i) {
        this.f2662F = i;
        invalidate();
    }

    public void setDividerPadding(float f) {
        this.f2664H = m2508b(f);
        invalidate();
    }

    public void setDividerWidth(float f) {
        this.f2663G = m2508b(f);
        invalidate();
    }

    public void setIconGravity(int i) {
        this.f2671O = i;
        m2509c();
    }

    public void setIconHeight(float f) {
        this.f2673Q = m2508b(f);
        m2511e();
    }

    public void setIconMargin(float f) {
        this.f2674R = m2508b(f);
        m2511e();
    }

    public void setIconVisible(boolean z8) {
        this.f2670N = z8;
        m2511e();
    }

    public void setIconWidth(float f) {
        this.f2672P = m2508b(f);
        m2511e();
    }

    public void setIndicatorAnimDuration(long j7) {
        this.f2704y = j7;
    }

    public void setIndicatorAnimEnable(boolean z8) {
        this.f2705z = z8;
    }

    public void setIndicatorBounceEnable(boolean z8) {
        this.f2657A = z8;
    }

    public void setIndicatorColor(int i) {
        this.f2696q = i;
        invalidate();
    }

    public void setIndicatorCornerRadius(float f) {
        this.f2699t = m2508b(f);
        invalidate();
    }

    public void setIndicatorGravity(int i) {
        this.f2658B = i;
        invalidate();
    }

    public void setIndicatorHeight(float f) {
        this.f2697r = m2508b(f);
        invalidate();
    }

    public void setIndicatorStyle(int i) {
        this.f2692m = i;
        invalidate();
    }

    public void setIndicatorWidth(float f) {
        this.f2698s = m2508b(f);
        invalidate();
    }

    public void setTabData(ArrayList<Object> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            throw new IllegalStateException("TabEntitys can not be NULL or EMPTY !");
        }
        ArrayList arrayList2 = this.f2681b;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        m2509c();
    }

    public void setTabPadding(float f) {
        this.f2693n = m2508b(f);
        m2511e();
    }

    public void setTabSpaceEqual(boolean z8) {
        this.f2694o = z8;
        m2511e();
    }

    public void setTabWidth(float f) {
        this.f2695p = m2508b(f);
        m2511e();
    }

    public void setTextAllCaps(boolean z8) {
        this.f2669M = z8;
        m2511e();
    }

    public void setTextBold(int i) {
        this.f2668L = i;
        m2511e();
    }

    public void setTextSelectColor(int i) {
        this.f2666J = i;
        m2511e();
    }

    public void setTextUnselectColor(int i) {
        this.f2667K = i;
        m2511e();
    }

    public void setTextsize(float f) {
        this.f2665I = (int) ((f * this.f2680a.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
        m2511e();
    }

    public void setUnderlineColor(int i) {
        this.f2659C = i;
        invalidate();
    }

    public void setUnderlineGravity(int i) {
        this.f2661E = i;
        invalidate();
    }

    public void setUnderlineHeight(float f) {
        this.f2660D = m2508b(f);
        invalidate();
    }

    public CommonTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CommonTabLayout(Context context, AttributeSet attributeSet, int i) {
        float f;
        super(context, attributeSet, i);
        this.f2681b = new ArrayList();
        this.f2686g = new Rect();
        this.f2687h = new GradientDrawable();
        this.f2688i = new Paint(1);
        this.f2689j = new Paint(1);
        this.f2690k = new Paint(1);
        this.f2691l = new Path();
        this.f2692m = 0;
        this.f2676T = new OvershootInterpolator(1.5f);
        this.f2677U = true;
        new Paint(1);
        new SparseArray();
        C3097a c3097a = new C3097a();
        this.f2678V = c3097a;
        C3097a c3097a2 = new C3097a();
        this.f2679W = c3097a2;
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
        this.f2680a = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f2682c = linearLayout;
        addView(linearLayout);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CommonTabLayout);
        int i8 = typedArrayObtainStyledAttributes.getInt(R$styleable.CommonTabLayout_tl_indicator_style, 0);
        this.f2692m = i8;
        this.f2696q = typedArrayObtainStyledAttributes.getColor(R$styleable.CommonTabLayout_tl_indicator_color, Color.parseColor(i8 == 2 ? "#4B6A87" : "#ffffff"));
        int i9 = R$styleable.CommonTabLayout_tl_indicator_height;
        int i10 = this.f2692m;
        if (i10 == 1) {
            f = 4.0f;
        } else {
            f = i10 == 2 ? -1 : 2;
        }
        this.f2697r = typedArrayObtainStyledAttributes.getDimension(i9, m2508b(f));
        this.f2698s = typedArrayObtainStyledAttributes.getDimension(R$styleable.CommonTabLayout_tl_indicator_width, m2508b(this.f2692m == 1 ? 10.0f : -1.0f));
        this.f2699t = typedArrayObtainStyledAttributes.getDimension(R$styleable.CommonTabLayout_tl_indicator_corner_radius, m2508b(this.f2692m == 2 ? -1.0f : 0.0f));
        this.f2700u = typedArrayObtainStyledAttributes.getDimension(R$styleable.CommonTabLayout_tl_indicator_margin_left, m2508b(0.0f));
        this.f2701v = typedArrayObtainStyledAttributes.getDimension(R$styleable.CommonTabLayout_tl_indicator_margin_top, m2508b(this.f2692m == 2 ? 7.0f : 0.0f));
        this.f2702w = typedArrayObtainStyledAttributes.getDimension(R$styleable.CommonTabLayout_tl_indicator_margin_right, m2508b(0.0f));
        this.f2703x = typedArrayObtainStyledAttributes.getDimension(R$styleable.CommonTabLayout_tl_indicator_margin_bottom, m2508b(this.f2692m == 2 ? 7.0f : 0.0f));
        this.f2705z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CommonTabLayout_tl_indicator_anim_enable, true);
        this.f2657A = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CommonTabLayout_tl_indicator_bounce_enable, true);
        this.f2704y = typedArrayObtainStyledAttributes.getInt(R$styleable.CommonTabLayout_tl_indicator_anim_duration, -1);
        this.f2658B = typedArrayObtainStyledAttributes.getInt(R$styleable.CommonTabLayout_tl_indicator_gravity, 80);
        this.f2659C = typedArrayObtainStyledAttributes.getColor(R$styleable.CommonTabLayout_tl_underline_color, Color.parseColor("#ffffff"));
        this.f2660D = typedArrayObtainStyledAttributes.getDimension(R$styleable.CommonTabLayout_tl_underline_height, m2508b(0.0f));
        this.f2661E = typedArrayObtainStyledAttributes.getInt(R$styleable.CommonTabLayout_tl_underline_gravity, 80);
        this.f2662F = typedArrayObtainStyledAttributes.getColor(R$styleable.CommonTabLayout_tl_divider_color, Color.parseColor("#ffffff"));
        this.f2663G = typedArrayObtainStyledAttributes.getDimension(R$styleable.CommonTabLayout_tl_divider_width, m2508b(0.0f));
        this.f2664H = typedArrayObtainStyledAttributes.getDimension(R$styleable.CommonTabLayout_tl_divider_padding, m2508b(12.0f));
        this.f2665I = typedArrayObtainStyledAttributes.getDimension(R$styleable.CommonTabLayout_tl_textsize, (int) ((13.0f * this.f2680a.getResources().getDisplayMetrics().scaledDensity) + 0.5f));
        this.f2666J = typedArrayObtainStyledAttributes.getColor(R$styleable.CommonTabLayout_tl_textSelectColor, Color.parseColor("#ffffff"));
        this.f2667K = typedArrayObtainStyledAttributes.getColor(R$styleable.CommonTabLayout_tl_textUnselectColor, Color.parseColor("#AAffffff"));
        this.f2668L = typedArrayObtainStyledAttributes.getInt(R$styleable.CommonTabLayout_tl_textBold, 0);
        this.f2669M = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CommonTabLayout_tl_textAllCaps, false);
        this.f2670N = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CommonTabLayout_tl_iconVisible, true);
        this.f2671O = typedArrayObtainStyledAttributes.getInt(R$styleable.CommonTabLayout_tl_iconGravity, 48);
        this.f2672P = typedArrayObtainStyledAttributes.getDimension(R$styleable.CommonTabLayout_tl_iconWidth, m2508b(0.0f));
        this.f2673Q = typedArrayObtainStyledAttributes.getDimension(R$styleable.CommonTabLayout_tl_iconHeight, m2508b(0.0f));
        this.f2674R = typedArrayObtainStyledAttributes.getDimension(R$styleable.CommonTabLayout_tl_iconMargin, m2508b(2.5f));
        this.f2694o = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CommonTabLayout_tl_tab_space_equal, true);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.CommonTabLayout_tl_tab_width, m2508b(-1.0f));
        this.f2695p = dimension;
        this.f2693n = typedArrayObtainStyledAttributes.getDimension(R$styleable.CommonTabLayout_tl_tab_padding, (this.f2694o || dimension > 0.0f) ? m2508b(0.0f) : m2508b(10.0f));
        typedArrayObtainStyledAttributes.recycle();
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "layout_height");
        if (!attributeValue.equals("-1") && !attributeValue.equals("-2")) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.layout_height});
            typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -2);
            typedArrayObtainStyledAttributes2.recycle();
        }
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new C3098b(0), c3097a2, c3097a);
        this.f2675S = valueAnimatorOfObject;
        valueAnimatorOfObject.addUpdateListener(this);
    }

    public void setOnTabSelectListener(InterfaceC3216a interfaceC3216a) {
    }
}
