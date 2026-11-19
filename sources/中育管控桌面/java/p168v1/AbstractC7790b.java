package p168v1;

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
import java.util.ArrayList;
import java.util.List;
import p087k.AbstractC6619r;

/* renamed from: v1.b */
/* loaded from: classes3.dex */
public abstract class AbstractC7790b extends AbstractC7789a {

    /* renamed from: A */
    public List f10340A;

    /* renamed from: B */
    public int f10341B;

    /* renamed from: C */
    public int f10342C;

    /* renamed from: D */
    public int f10343D;

    /* renamed from: E */
    public int f10344E;

    /* renamed from: F */
    public int f10345F;

    /* renamed from: G */
    public Drawable f10346G;

    /* renamed from: H */
    public Drawable f10347H;

    /* renamed from: I */
    public int f10348I;

    /* renamed from: J */
    public int f10349J;

    /* renamed from: K */
    public Class f10350K;

    /* renamed from: L */
    public LinearLayout f10351L;

    public AbstractC7790b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10340A = new ArrayList();
        m9362k(context, attributeSet);
    }

    /* renamed from: F */
    public final GradientDrawable m9355F(int i6, float f6) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(f6);
        gradientDrawable.setColor(i6);
        return gradientDrawable;
    }

    /* renamed from: G */
    public AbstractC7790b m9356G(float f6) {
        this.f10345F = m9339i(f6);
        return this;
    }

    /* renamed from: H */
    public AbstractC7790b m9357H(float f6) {
        this.f10344E = m9339i(f6);
        return this;
    }

    /* renamed from: I */
    public AbstractC7790b m9358I(float f6) {
        this.f10343D = m9339i(f6);
        return this;
    }

    /* renamed from: J */
    public AbstractC7790b m9359J(int i6, int i7) {
        try {
            if (this.f10341B == 0) {
                if (i7 != 0) {
                    this.f10346G = getResources().getDrawable(i7);
                }
                if (i6 != 0) {
                    this.f10347H = getResources().getDrawable(i6);
                }
            }
            return this;
        } catch (Resources.NotFoundException e6) {
            e6.printStackTrace();
            return this;
        }
    }

    /* renamed from: K */
    public AbstractC7790b m9360K(float f6) {
        this.f10342C = m9339i(f6);
        return this;
    }

    /* renamed from: L */
    public AbstractC7790b m9361L(Class cls) {
        this.f10350K = cls;
        return this;
    }

    /* renamed from: k */
    public final void m9362k(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BaseIndicatorBanner);
        this.f10341B = typedArrayObtainStyledAttributes.getInt(R$styleable.BaseIndicatorBanner_bb_indicatorStyle, 1);
        this.f10342C = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BaseIndicatorBanner_bb_indicatorWidth, m9339i(6.0f));
        this.f10343D = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BaseIndicatorBanner_bb_indicatorHeight, m9339i(6.0f));
        this.f10344E = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BaseIndicatorBanner_bb_indicatorGap, m9339i(6.0f));
        this.f10345F = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BaseIndicatorBanner_bb_indicatorCornerRadius, m9339i(3.0f));
        this.f10348I = typedArrayObtainStyledAttributes.getColor(R$styleable.BaseIndicatorBanner_bb_indicatorSelectColor, Color.parseColor("#ffffff"));
        this.f10349J = typedArrayObtainStyledAttributes.getColor(R$styleable.BaseIndicatorBanner_bb_indicatorUnselectColor, Color.parseColor("#88ffffff"));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.BaseIndicatorBanner_bb_indicatorSelectRes, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.BaseIndicatorBanner_bb_indicatorUnselectRes, 0);
        typedArrayObtainStyledAttributes.recycle();
        LinearLayout linearLayout = new LinearLayout(context);
        this.f10351L = linearLayout;
        linearLayout.setGravity(17);
        m9359J(resourceId2, resourceId);
    }

    @Override // p168v1.AbstractC7789a
    /* renamed from: q */
    public View mo9346q() {
        if (this.f10341B == 1) {
            this.f10347H = m9355F(this.f10349J, this.f10345F);
            this.f10346G = m9355F(this.f10348I, this.f10345F);
        }
        int size = this.f10313f.size();
        this.f10340A.clear();
        this.f10351L.removeAllViews();
        int i6 = 0;
        while (i6 < size) {
            ImageView imageView = new ImageView(this.f10309b);
            imageView.setImageDrawable(i6 == this.f10314g ? this.f10346G : this.f10347H);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f10342C, this.f10343D);
            layoutParams.setMarginStart(i6 == 0 ? 0 : this.f10344E);
            this.f10351L.addView(imageView, layoutParams);
            this.f10340A.add(imageView);
            i6++;
        }
        setCurrentIndicator(this.f10314g);
        return this.f10351L;
    }

    @Override // p168v1.AbstractC7789a
    public void setCurrentIndicator(int i6) {
        int i7 = 0;
        while (i7 < this.f10340A.size()) {
            ((ImageView) this.f10340A.get(i7)).setImageDrawable(i7 == i6 ? this.f10346G : this.f10347H);
            i7++;
        }
        try {
            Class cls = this.f10350K;
            if (cls != null) {
                if (i6 == this.f10315h) {
                    AbstractC6619r.m7572a(cls.newInstance());
                    throw null;
                }
                AbstractC6619r.m7572a(cls.newInstance());
                throw null;
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }
}
