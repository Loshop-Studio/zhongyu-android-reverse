package com.xuexiang.xui.widget.banner.widget.banner.base;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.widget.banner.widget.banner.base.BaseIndicatorBanner;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class BaseIndicatorBanner<E, T extends BaseIndicatorBanner<E, T>> extends BaseBanner<E, T> {

    /* renamed from: A */
    public int f4050A;

    /* renamed from: B */
    public int f4051B;

    /* renamed from: C */
    public int f4052C;

    /* renamed from: D */
    public int f4053D;

    /* renamed from: E */
    public int f4054E;

    /* renamed from: F */
    public Drawable f4055F;

    /* renamed from: G */
    public Drawable f4056G;

    /* renamed from: H */
    public int f4057H;

    /* renamed from: I */
    public int f4058I;

    /* renamed from: J */
    public Class f4059J;

    /* renamed from: K */
    public LinearLayout f4060K;

    /* renamed from: z */
    public final ArrayList f4061z;

    public BaseIndicatorBanner(Context context) {
        super(context);
        this.f4061z = new ArrayList();
        m3458h(context, null);
    }

    /* renamed from: h */
    public final void m3458h(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BaseIndicatorBanner);
        this.f4050A = typedArrayObtainStyledAttributes.getInt(R$styleable.BaseIndicatorBanner_bb_indicatorStyle, 1);
        this.f4051B = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BaseIndicatorBanner_bb_indicatorWidth, m3452a(6.0f));
        this.f4052C = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BaseIndicatorBanner_bb_indicatorHeight, m3452a(6.0f));
        this.f4053D = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BaseIndicatorBanner_bb_indicatorGap, m3452a(6.0f));
        this.f4054E = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BaseIndicatorBanner_bb_indicatorCornerRadius, m3452a(3.0f));
        this.f4057H = typedArrayObtainStyledAttributes.getColor(R$styleable.BaseIndicatorBanner_bb_indicatorSelectColor, Color.parseColor("#ffffff"));
        this.f4058I = typedArrayObtainStyledAttributes.getColor(R$styleable.BaseIndicatorBanner_bb_indicatorUnselectColor, Color.parseColor("#88ffffff"));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.BaseIndicatorBanner_bb_indicatorSelectRes, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.BaseIndicatorBanner_bb_indicatorUnselectRes, 0);
        typedArrayObtainStyledAttributes.recycle();
        LinearLayout linearLayout = new LinearLayout(context);
        this.f4060K = linearLayout;
        linearLayout.setGravity(17);
        try {
            if (this.f4050A == 0) {
                if (resourceId != 0) {
                    this.f4055F = getResources().getDrawable(resourceId);
                }
                if (resourceId2 != 0) {
                    this.f4056G = getResources().getDrawable(resourceId2);
                }
            }
        } catch (Resources.NotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override // com.xuexiang.xui.widget.banner.widget.banner.base.BaseBanner
    public void setCurrentIndicator(int i) {
        ArrayList arrayList;
        int i8 = 0;
        while (true) {
            arrayList = this.f4061z;
            if (i8 >= arrayList.size()) {
                try {
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
            ((ImageView) arrayList.get(i8)).setImageDrawable(i8 == i ? this.f4055F : this.f4056G);
            i8++;
        }
        Class cls = this.f4059J;
        if (cls != null) {
            if (i == this.f4032g) {
                if (cls.newInstance() != null) {
                    throw new ClassCastException();
                }
                throw null;
            }
            if (cls.newInstance() != null) {
                throw new ClassCastException();
            }
            throw null;
        }
    }

    public BaseIndicatorBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4061z = new ArrayList();
        m3458h(context, attributeSet);
    }

    public BaseIndicatorBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4061z = new ArrayList();
        m3458h(context, attributeSet);
    }
}
