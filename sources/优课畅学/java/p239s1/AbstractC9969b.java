package p239s1;

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
import com.blankj.utilcode.util.AbstractC5379p;
import com.xuexiang.xui.R$styleable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: s1.b */
/* loaded from: classes4.dex */
public abstract class AbstractC9969b extends AbstractC9968a {

    /* renamed from: A */
    public List f19997A;

    /* renamed from: B */
    public int f19998B;

    /* renamed from: C */
    public int f19999C;

    /* renamed from: D */
    public int f20000D;

    /* renamed from: E */
    public int f20001E;

    /* renamed from: F */
    public int f20002F;

    /* renamed from: G */
    public Drawable f20003G;

    /* renamed from: H */
    public Drawable f20004H;

    /* renamed from: I */
    public int f20005I;

    /* renamed from: J */
    public int f20006J;

    /* renamed from: K */
    public Class f20007K;

    /* renamed from: L */
    public LinearLayout f20008L;

    public AbstractC9969b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19997A = new ArrayList();
        m18652k(context, attributeSet);
    }

    /* renamed from: F */
    public final GradientDrawable m18645F(int i10, float f10) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(f10);
        gradientDrawable.setColor(i10);
        return gradientDrawable;
    }

    /* renamed from: G */
    public AbstractC9969b m18646G(float f10) {
        this.f20002F = m18629i(f10);
        return this;
    }

    /* renamed from: H */
    public AbstractC9969b m18647H(float f10) {
        this.f20001E = m18629i(f10);
        return this;
    }

    /* renamed from: I */
    public AbstractC9969b m18648I(float f10) {
        this.f20000D = m18629i(f10);
        return this;
    }

    /* renamed from: J */
    public AbstractC9969b m18649J(int i10, int i11) {
        try {
            if (this.f19998B == 0) {
                if (i11 != 0) {
                    this.f20003G = getResources().getDrawable(i11);
                }
                if (i10 != 0) {
                    this.f20004H = getResources().getDrawable(i10);
                }
            }
            return this;
        } catch (Resources.NotFoundException e10) {
            e10.printStackTrace();
            return this;
        }
    }

    /* renamed from: K */
    public AbstractC9969b m18650K(float f10) {
        this.f19999C = m18629i(f10);
        return this;
    }

    /* renamed from: L */
    public AbstractC9969b m18651L(Class cls) {
        this.f20007K = cls;
        return this;
    }

    /* renamed from: k */
    public final void m18652k(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BaseIndicatorBanner);
        this.f19998B = typedArrayObtainStyledAttributes.getInt(R$styleable.BaseIndicatorBanner_bb_indicatorStyle, 1);
        this.f19999C = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BaseIndicatorBanner_bb_indicatorWidth, m18629i(6.0f));
        this.f20000D = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BaseIndicatorBanner_bb_indicatorHeight, m18629i(6.0f));
        this.f20001E = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BaseIndicatorBanner_bb_indicatorGap, m18629i(6.0f));
        this.f20002F = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BaseIndicatorBanner_bb_indicatorCornerRadius, m18629i(3.0f));
        this.f20005I = typedArrayObtainStyledAttributes.getColor(R$styleable.BaseIndicatorBanner_bb_indicatorSelectColor, Color.parseColor("#ffffff"));
        this.f20006J = typedArrayObtainStyledAttributes.getColor(R$styleable.BaseIndicatorBanner_bb_indicatorUnselectColor, Color.parseColor("#88ffffff"));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.BaseIndicatorBanner_bb_indicatorSelectRes, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.BaseIndicatorBanner_bb_indicatorUnselectRes, 0);
        typedArrayObtainStyledAttributes.recycle();
        LinearLayout linearLayout = new LinearLayout(context);
        this.f20008L = linearLayout;
        linearLayout.setGravity(17);
        m18649J(resourceId2, resourceId);
    }

    @Override // p239s1.AbstractC9968a
    /* renamed from: q */
    public View mo18636q() {
        if (this.f19998B == 1) {
            this.f20004H = m18645F(this.f20006J, this.f20002F);
            this.f20003G = m18645F(this.f20005I, this.f20002F);
        }
        int size = this.f19970f.size();
        this.f19997A.clear();
        this.f20008L.removeAllViews();
        int i10 = 0;
        while (i10 < size) {
            ImageView imageView = new ImageView(this.f19966b);
            imageView.setImageDrawable(i10 == this.f19971g ? this.f20003G : this.f20004H);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f19999C, this.f20000D);
            layoutParams.setMarginStart(i10 == 0 ? 0 : this.f20001E);
            this.f20008L.addView(imageView, layoutParams);
            this.f19997A.add(imageView);
            i10++;
        }
        setCurrentIndicator(this.f19971g);
        return this.f20008L;
    }

    @Override // p239s1.AbstractC9968a
    public void setCurrentIndicator(int i10) {
        int i11 = 0;
        while (i11 < this.f19997A.size()) {
            ((ImageView) this.f19997A.get(i11)).setImageDrawable(i11 == i10 ? this.f20003G : this.f20004H);
            i11++;
        }
        try {
            Class cls = this.f20007K;
            if (cls != null) {
                if (i10 == this.f19972h) {
                    AbstractC5379p.m2596a(cls.newInstance());
                    throw null;
                }
                AbstractC5379p.m2596a(cls.newInstance());
                throw null;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
