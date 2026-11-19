package p103o0;

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
import com.bumptech.glide.AbstractC2857b;
import com.xuexiang.xui.R$styleable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o0.b */
/* loaded from: classes2.dex */
public abstract class AbstractC4421b extends AbstractC4420a {

    /* renamed from: A */
    public int f5012A;

    /* renamed from: B */
    public int f5013B;

    /* renamed from: C */
    public int f5014C;

    /* renamed from: D */
    public int f5015D;

    /* renamed from: E */
    public int f5016E;

    /* renamed from: F */
    public Drawable f5017F;

    /* renamed from: G */
    public Drawable f5018G;

    /* renamed from: H */
    public int f5019H;

    /* renamed from: I */
    public int f5020I;

    /* renamed from: J */
    public Class f5021J;

    /* renamed from: K */
    public LinearLayout f5022K;

    /* renamed from: z */
    public List f5023z;

    public AbstractC4421b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5023z = new ArrayList();
        m5552k(context, attributeSet);
    }

    /* renamed from: k */
    private void m5552k(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BaseIndicatorBanner);
        this.f5012A = typedArrayObtainStyledAttributes.getInt(R$styleable.BaseIndicatorBanner_bb_indicatorStyle, 1);
        this.f5013B = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BaseIndicatorBanner_bb_indicatorWidth, m5535i(6.0f));
        this.f5014C = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BaseIndicatorBanner_bb_indicatorHeight, m5535i(6.0f));
        this.f5015D = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BaseIndicatorBanner_bb_indicatorGap, m5535i(6.0f));
        this.f5016E = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BaseIndicatorBanner_bb_indicatorCornerRadius, m5535i(3.0f));
        this.f5019H = typedArrayObtainStyledAttributes.getColor(R$styleable.BaseIndicatorBanner_bb_indicatorSelectColor, Color.parseColor("#ffffff"));
        this.f5020I = typedArrayObtainStyledAttributes.getColor(R$styleable.BaseIndicatorBanner_bb_indicatorUnselectColor, Color.parseColor("#88ffffff"));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.BaseIndicatorBanner_bb_indicatorSelectRes, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.BaseIndicatorBanner_bb_indicatorUnselectRes, 0);
        typedArrayObtainStyledAttributes.recycle();
        LinearLayout linearLayout = new LinearLayout(context);
        this.f5022K = linearLayout;
        linearLayout.setGravity(17);
        m5557G(resourceId2, resourceId);
    }

    /* renamed from: C */
    public final GradientDrawable m5553C(int i4, float f4) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(f4);
        gradientDrawable.setColor(i4);
        return gradientDrawable;
    }

    /* renamed from: D */
    public AbstractC4421b m5554D(float f4) {
        this.f5016E = m5535i(f4);
        return this;
    }

    /* renamed from: E */
    public AbstractC4421b m5555E(float f4) {
        this.f5015D = m5535i(f4);
        return this;
    }

    /* renamed from: F */
    public AbstractC4421b m5556F(float f4) {
        this.f5014C = m5535i(f4);
        return this;
    }

    /* renamed from: G */
    public AbstractC4421b m5557G(int i4, int i5) {
        try {
            if (this.f5012A == 0) {
                if (i5 != 0) {
                    this.f5017F = getResources().getDrawable(i5);
                }
                if (i4 != 0) {
                    this.f5018G = getResources().getDrawable(i4);
                }
            }
        } catch (Resources.NotFoundException e4) {
            e4.printStackTrace();
        }
        return this;
    }

    /* renamed from: H */
    public AbstractC4421b m5558H(float f4) {
        this.f5013B = m5535i(f4);
        return this;
    }

    /* renamed from: I */
    public AbstractC4421b m5559I(Class cls) {
        this.f5021J = cls;
        return this;
    }

    @Override // p103o0.AbstractC4420a
    /* renamed from: n */
    public View mo5540n() {
        if (this.f5012A == 1) {
            this.f5018G = m5553C(this.f5020I, this.f5016E);
            this.f5017F = m5553C(this.f5019H, this.f5016E);
        }
        int size = this.f4985e.size();
        this.f5023z.clear();
        this.f5022K.removeAllViews();
        int i4 = 0;
        while (i4 < size) {
            ImageView imageView = new ImageView(this.f4982b);
            imageView.setImageDrawable(i4 == this.f4986f ? this.f5017F : this.f5018G);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f5013B, this.f5014C);
            layoutParams.setMarginStart(i4 == 0 ? 0 : this.f5015D);
            this.f5022K.addView(imageView, layoutParams);
            this.f5023z.add(imageView);
            i4++;
        }
        setCurrentIndicator(this.f4986f);
        return this.f5022K;
    }

    @Override // p103o0.AbstractC4420a
    public void setCurrentIndicator(int i4) {
        int i5 = 0;
        while (i5 < this.f5023z.size()) {
            ((ImageView) this.f5023z.get(i5)).setImageDrawable(i5 == i4 ? this.f5017F : this.f5018G);
            i5++;
        }
        try {
            Class cls = this.f5021J;
            if (cls != null) {
                if (i4 == this.f4987g) {
                    AbstractC2857b.m1678a(cls.newInstance());
                    throw null;
                }
                AbstractC2857b.m1678a(cls.newInstance());
                throw null;
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }
}
