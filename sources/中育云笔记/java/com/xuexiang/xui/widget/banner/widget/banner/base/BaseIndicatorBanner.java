package com.xuexiang.xui.widget.banner.widget.banner.base;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.widget.banner.widget.banner.base.BaseIndicatorBanner;
import java.util.ArrayList;
import java.util.List;
import p212k.AbstractC9764r;

/* loaded from: classes5.dex */
public abstract class BaseIndicatorBanner<E, T extends BaseIndicatorBanner<E, T>> extends BaseBanner<E, T> {

    /* renamed from: B */
    public List f15508B;

    /* renamed from: C */
    public int f15509C;

    /* renamed from: D */
    public int f15510D;

    /* renamed from: E */
    public int f15511E;

    /* renamed from: F */
    public int f15512F;

    /* renamed from: G */
    public int f15513G;

    /* renamed from: H */
    public Drawable f15514H;

    /* renamed from: I */
    public Drawable f15515I;

    /* renamed from: J */
    public int f15516J;

    /* renamed from: K */
    public int f15517K;

    /* renamed from: L */
    public Class f15518L;

    /* renamed from: M */
    public LinearLayout f15519M;

    public BaseIndicatorBanner(Context context) {
        super(context);
        this.f15508B = new ArrayList();
        m12403l(context, null);
    }

    /* renamed from: l */
    private void m12403l(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BaseIndicatorBanner);
        this.f15509C = typedArrayObtainStyledAttributes.getInt(R$styleable.BaseIndicatorBanner_bb_indicatorStyle, 1);
        this.f15510D = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BaseIndicatorBanner_bb_indicatorWidth, m12387i(6.0f));
        this.f15511E = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BaseIndicatorBanner_bb_indicatorHeight, m12387i(6.0f));
        this.f15512F = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BaseIndicatorBanner_bb_indicatorGap, m12387i(6.0f));
        this.f15513G = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BaseIndicatorBanner_bb_indicatorCornerRadius, m12387i(3.0f));
        this.f15516J = typedArrayObtainStyledAttributes.getColor(R$styleable.BaseIndicatorBanner_bb_indicatorSelectColor, Color.parseColor("#ffffff"));
        this.f15517K = typedArrayObtainStyledAttributes.getColor(R$styleable.BaseIndicatorBanner_bb_indicatorUnselectColor, Color.parseColor("#88ffffff"));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.BaseIndicatorBanner_bb_indicatorSelectRes, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.BaseIndicatorBanner_bb_indicatorUnselectRes, 0);
        typedArrayObtainStyledAttributes.recycle();
        LinearLayout linearLayout = new LinearLayout(context);
        this.f15519M = linearLayout;
        linearLayout.setGravity(17);
        m12408I(resourceId2, resourceId);
    }

    /* renamed from: E */
    public final GradientDrawable m12404E(int i10, float f10) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(f10);
        gradientDrawable.setColor(i10);
        return gradientDrawable;
    }

    /* renamed from: F */
    public BaseIndicatorBanner m12405F(float f10) {
        this.f15513G = m12387i(f10);
        return this;
    }

    /* renamed from: G */
    public BaseIndicatorBanner m12406G(float f10) {
        this.f15512F = m12387i(f10);
        return this;
    }

    /* renamed from: H */
    public BaseIndicatorBanner m12407H(float f10) {
        this.f15511E = m12387i(f10);
        return this;
    }

    /* renamed from: I */
    public BaseIndicatorBanner m12408I(int i10, int i11) {
        try {
            if (this.f15509C == 0) {
                if (i11 != 0) {
                    this.f15514H = getResources().getDrawable(i11);
                }
                if (i10 != 0) {
                    this.f15515I = getResources().getDrawable(i10);
                }
            }
            return this;
        } catch (Resources.NotFoundException e10) {
            e10.printStackTrace();
            return this;
        }
    }

    /* renamed from: J */
    public BaseIndicatorBanner m12409J(float f10) {
        this.f15510D = m12387i(f10);
        return this;
    }

    /* renamed from: K */
    public BaseIndicatorBanner m12410K(Class cls) {
        this.f15518L = cls;
        return this;
    }

    @Override // com.xuexiang.xui.widget.banner.widget.banner.base.BaseBanner
    /* renamed from: o */
    public View mo12392o() {
        if (this.f15509C == 1) {
            this.f15515I = m12404E(this.f15517K, this.f15513G);
            this.f15514H = m12404E(this.f15516J, this.f15513G);
        }
        int size = this.f15479g.size();
        this.f15508B.clear();
        this.f15519M.removeAllViews();
        int i10 = 0;
        while (i10 < size) {
            ImageView imageView = new ImageView(this.f15476d);
            imageView.setImageDrawable(i10 == this.f15480h ? this.f15514H : this.f15515I);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f15510D, this.f15511E);
            layoutParams.setMarginStart(i10 == 0 ? 0 : this.f15512F);
            this.f15519M.addView(imageView, layoutParams);
            this.f15508B.add(imageView);
            i10++;
        }
        setCurrentIndicator(this.f15480h);
        return this.f15519M;
    }

    @Override // com.xuexiang.xui.widget.banner.widget.banner.base.BaseBanner
    public void setCurrentIndicator(int i10) {
        int i11 = 0;
        while (i11 < this.f15508B.size()) {
            ((ImageView) this.f15508B.get(i11)).setImageDrawable(i11 == i10 ? this.f15514H : this.f15515I);
            i11++;
        }
        try {
            Class cls = this.f15518L;
            if (cls != null) {
                if (i10 == this.f15481i) {
                    AbstractC9764r.m19682a(cls.newInstance());
                    throw null;
                }
                AbstractC9764r.m19682a(cls.newInstance());
                throw null;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public BaseIndicatorBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15508B = new ArrayList();
        m12403l(context, attributeSet);
    }

    public BaseIndicatorBanner(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f15508B = new ArrayList();
        m12403l(context, attributeSet);
    }
}
