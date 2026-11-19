package p252u2;

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
import p137k.AbstractC7846r;

/* renamed from: u2.b */
/* loaded from: classes4.dex */
public abstract class AbstractC9537b extends AbstractC9536a {

    /* renamed from: A */
    public List f16730A;

    /* renamed from: B */
    public int f16731B;

    /* renamed from: C */
    public int f16732C;

    /* renamed from: D */
    public int f16733D;

    /* renamed from: E */
    public int f16734E;

    /* renamed from: F */
    public int f16735F;

    /* renamed from: G */
    public Drawable f16736G;

    /* renamed from: H */
    public Drawable f16737H;

    /* renamed from: I */
    public int f16738I;

    /* renamed from: J */
    public int f16739J;

    /* renamed from: K */
    public Class f16740K;

    /* renamed from: L */
    public LinearLayout f16741L;

    public AbstractC9537b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16730A = new ArrayList();
        m15973k(context, attributeSet);
    }

    /* renamed from: F */
    public final GradientDrawable m15966F(int i10, float f10) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(f10);
        gradientDrawable.setColor(i10);
        return gradientDrawable;
    }

    /* renamed from: G */
    public AbstractC9537b m15967G(float f10) {
        this.f16735F = m15950i(f10);
        return this;
    }

    /* renamed from: H */
    public AbstractC9537b m15968H(float f10) {
        this.f16734E = m15950i(f10);
        return this;
    }

    /* renamed from: I */
    public AbstractC9537b m15969I(float f10) {
        this.f16733D = m15950i(f10);
        return this;
    }

    /* renamed from: J */
    public AbstractC9537b m15970J(int i10, int i11) {
        try {
            if (this.f16731B == 0) {
                if (i11 != 0) {
                    this.f16736G = getResources().getDrawable(i11);
                }
                if (i10 != 0) {
                    this.f16737H = getResources().getDrawable(i10);
                }
            }
            return this;
        } catch (Resources.NotFoundException e10) {
            e10.printStackTrace();
            return this;
        }
    }

    /* renamed from: K */
    public AbstractC9537b m15971K(float f10) {
        this.f16732C = m15950i(f10);
        return this;
    }

    /* renamed from: L */
    public AbstractC9537b m15972L(Class cls) {
        this.f16740K = cls;
        return this;
    }

    /* renamed from: k */
    public final void m15973k(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BaseIndicatorBanner);
        this.f16731B = typedArrayObtainStyledAttributes.getInt(R$styleable.BaseIndicatorBanner_bb_indicatorStyle, 1);
        this.f16732C = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BaseIndicatorBanner_bb_indicatorWidth, m15950i(6.0f));
        this.f16733D = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BaseIndicatorBanner_bb_indicatorHeight, m15950i(6.0f));
        this.f16734E = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BaseIndicatorBanner_bb_indicatorGap, m15950i(6.0f));
        this.f16735F = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BaseIndicatorBanner_bb_indicatorCornerRadius, m15950i(3.0f));
        this.f16738I = typedArrayObtainStyledAttributes.getColor(R$styleable.BaseIndicatorBanner_bb_indicatorSelectColor, Color.parseColor("#ffffff"));
        this.f16739J = typedArrayObtainStyledAttributes.getColor(R$styleable.BaseIndicatorBanner_bb_indicatorUnselectColor, Color.parseColor("#88ffffff"));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.BaseIndicatorBanner_bb_indicatorSelectRes, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.BaseIndicatorBanner_bb_indicatorUnselectRes, 0);
        typedArrayObtainStyledAttributes.recycle();
        LinearLayout linearLayout = new LinearLayout(context);
        this.f16741L = linearLayout;
        linearLayout.setGravity(17);
        m15970J(resourceId2, resourceId);
    }

    @Override // p252u2.AbstractC9536a
    /* renamed from: q */
    public View mo15957q() {
        if (this.f16731B == 1) {
            this.f16737H = m15966F(this.f16739J, this.f16735F);
            this.f16736G = m15966F(this.f16738I, this.f16735F);
        }
        int size = this.f16703f.size();
        this.f16730A.clear();
        this.f16741L.removeAllViews();
        int i10 = 0;
        while (i10 < size) {
            ImageView imageView = new ImageView(this.f16699b);
            imageView.setImageDrawable(i10 == this.f16704g ? this.f16736G : this.f16737H);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f16732C, this.f16733D);
            layoutParams.setMarginStart(i10 == 0 ? 0 : this.f16734E);
            this.f16741L.addView(imageView, layoutParams);
            this.f16730A.add(imageView);
            i10++;
        }
        setCurrentIndicator(this.f16704g);
        return this.f16741L;
    }

    @Override // p252u2.AbstractC9536a
    public void setCurrentIndicator(int i10) {
        int i11 = 0;
        while (i11 < this.f16730A.size()) {
            ((ImageView) this.f16730A.get(i11)).setImageDrawable(i11 == i10 ? this.f16736G : this.f16737H);
            i11++;
        }
        try {
            Class cls = this.f16740K;
            if (cls != null) {
                if (i10 == this.f16705h) {
                    AbstractC7846r.m13306a(cls.newInstance());
                    throw null;
                }
                AbstractC7846r.m13306a(cls.newInstance());
                throw null;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
