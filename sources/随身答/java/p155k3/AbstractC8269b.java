package p155k3;

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
import p217q.AbstractC9343a;

/* renamed from: k3.b */
/* loaded from: classes4.dex */
public abstract class AbstractC8269b extends AbstractC8268a {

    /* renamed from: A */
    public int f14411A;

    /* renamed from: B */
    public int f14412B;

    /* renamed from: C */
    public int f14413C;

    /* renamed from: D */
    public int f14414D;

    /* renamed from: E */
    public int f14415E;

    /* renamed from: F */
    public Drawable f14416F;

    /* renamed from: G */
    public Drawable f14417G;

    /* renamed from: H */
    public int f14418H;

    /* renamed from: I */
    public int f14419I;

    /* renamed from: J */
    public Class f14420J;

    /* renamed from: K */
    public LinearLayout f14421K;

    /* renamed from: z */
    public List f14422z;

    public AbstractC8269b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14422z = new ArrayList();
        m13372k(context, attributeSet);
    }

    /* renamed from: C */
    public final GradientDrawable m13365C(int i9, float f10) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(f10);
        gradientDrawable.setColor(i9);
        return gradientDrawable;
    }

    /* renamed from: D */
    public AbstractC8269b m13366D(float f10) {
        this.f14415E = m13349i(f10);
        return this;
    }

    /* renamed from: E */
    public AbstractC8269b m13367E(float f10) {
        this.f14414D = m13349i(f10);
        return this;
    }

    /* renamed from: F */
    public AbstractC8269b m13368F(float f10) {
        this.f14413C = m13349i(f10);
        return this;
    }

    /* renamed from: G */
    public AbstractC8269b m13369G(int i9, int i10) {
        try {
            if (this.f14411A == 0) {
                if (i10 != 0) {
                    this.f14416F = getResources().getDrawable(i10);
                }
                if (i9 != 0) {
                    this.f14417G = getResources().getDrawable(i9);
                }
            }
            return this;
        } catch (Resources.NotFoundException e10) {
            e10.printStackTrace();
            return this;
        }
    }

    /* renamed from: H */
    public AbstractC8269b m13370H(float f10) {
        this.f14412B = m13349i(f10);
        return this;
    }

    /* renamed from: I */
    public AbstractC8269b m13371I(Class cls) {
        this.f14420J = cls;
        return this;
    }

    /* renamed from: k */
    public final void m13372k(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BaseIndicatorBanner);
        this.f14411A = typedArrayObtainStyledAttributes.getInt(R$styleable.BaseIndicatorBanner_bb_indicatorStyle, 1);
        this.f14412B = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BaseIndicatorBanner_bb_indicatorWidth, m13349i(6.0f));
        this.f14413C = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BaseIndicatorBanner_bb_indicatorHeight, m13349i(6.0f));
        this.f14414D = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BaseIndicatorBanner_bb_indicatorGap, m13349i(6.0f));
        this.f14415E = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BaseIndicatorBanner_bb_indicatorCornerRadius, m13349i(3.0f));
        this.f14418H = typedArrayObtainStyledAttributes.getColor(R$styleable.BaseIndicatorBanner_bb_indicatorSelectColor, Color.parseColor("#ffffff"));
        this.f14419I = typedArrayObtainStyledAttributes.getColor(R$styleable.BaseIndicatorBanner_bb_indicatorUnselectColor, Color.parseColor("#88ffffff"));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.BaseIndicatorBanner_bb_indicatorSelectRes, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.BaseIndicatorBanner_bb_indicatorUnselectRes, 0);
        typedArrayObtainStyledAttributes.recycle();
        LinearLayout linearLayout = new LinearLayout(context);
        this.f14421K = linearLayout;
        linearLayout.setGravity(17);
        m13369G(resourceId2, resourceId);
    }

    @Override // p155k3.AbstractC8268a
    /* renamed from: n */
    public View mo13353n() {
        if (this.f14411A == 1) {
            this.f14417G = m13365C(this.f14419I, this.f14415E);
            this.f14416F = m13365C(this.f14418H, this.f14415E);
        }
        int size = this.f14384e.size();
        this.f14422z.clear();
        this.f14421K.removeAllViews();
        int i9 = 0;
        while (i9 < size) {
            ImageView imageView = new ImageView(this.f14381b);
            imageView.setImageDrawable(i9 == this.f14385f ? this.f14416F : this.f14417G);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f14412B, this.f14413C);
            layoutParams.setMarginStart(i9 == 0 ? 0 : this.f14414D);
            this.f14421K.addView(imageView, layoutParams);
            this.f14422z.add(imageView);
            i9++;
        }
        setCurrentIndicator(this.f14385f);
        return this.f14421K;
    }

    @Override // p155k3.AbstractC8268a
    public void setCurrentIndicator(int i9) {
        int i10 = 0;
        while (i10 < this.f14422z.size()) {
            ((ImageView) this.f14422z.get(i10)).setImageDrawable(i10 == i9 ? this.f14416F : this.f14417G);
            i10++;
        }
        try {
            Class cls = this.f14420J;
            if (cls != null) {
                if (i9 == this.f14386g) {
                    AbstractC9343a.m15285a(cls.newInstance());
                    throw null;
                }
                AbstractC9343a.m15285a(cls.newInstance());
                throw null;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
