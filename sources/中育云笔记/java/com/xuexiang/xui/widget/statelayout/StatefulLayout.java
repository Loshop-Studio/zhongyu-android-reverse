package com.xuexiang.xui.widget.statelayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.widget.progress.materialprogressbar.MaterialProgressBar;
import p420y7.C11915a;

/* loaded from: classes5.dex */
public class StatefulLayout extends LinearLayout {

    /* renamed from: c */
    public boolean f17020c;

    /* renamed from: d */
    public Animation f17021d;

    /* renamed from: e */
    public Animation f17022e;

    /* renamed from: f */
    public View f17023f;

    /* renamed from: g */
    public LinearLayout f17024g;

    /* renamed from: h */
    public MaterialProgressBar f17025h;

    /* renamed from: i */
    public ImageView f17026i;

    /* renamed from: j */
    public TextView f17027j;

    /* renamed from: k */
    public Button f17028k;

    public StatefulLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void m13265a() {
        setOrientation(1);
        this.f17023f = getChildAt(0);
        LayoutInflater.from(getContext()).inflate(R$layout.xui_layout_stateful_template, (ViewGroup) this, true);
        this.f17024g = (LinearLayout) findViewById(R$id.stContainer);
        this.f17025h = (MaterialProgressBar) findViewById(R$id.stProgress);
        this.f17026i = (ImageView) findViewById(R$id.stImage);
        this.f17027j = (TextView) findViewById(R$id.stMessage);
        this.f17028k = (Button) findViewById(R$id.stButton);
    }

    /* renamed from: b */
    public final void m13266b(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.StatefulLayout, i10, 0);
        this.f17020c = typedArrayObtainStyledAttributes.getBoolean(R$styleable.StatefulLayout_stf_animationEnabled, C11915a.m26454b().m26456c().f22492a);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.StatefulLayout_stf_inAnimation, -1);
        if (resourceId != -1) {
            this.f17021d = m13267c(resourceId);
        } else {
            this.f17021d = C11915a.m26454b().m26456c().f22493b;
        }
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.StatefulLayout_stf_outAnimation, -1);
        if (resourceId != -1) {
            this.f17022e = m13267c(resourceId2);
        } else {
            this.f17022e = C11915a.m26454b().m26456c().f22494c;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: c */
    public final Animation m13267c(int i10) {
        return AnimationUtils.loadAnimation(getContext(), i10);
    }

    public Animation getInAnimation() {
        return this.f17021d;
    }

    public Animation getOutAnimation() {
        return this.f17022e;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() > 1) {
            throw new IllegalStateException("StatefulLayout must have one child!");
        }
        m13265a();
    }

    public StatefulLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.StatefulLayoutStyle);
    }

    public StatefulLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m13266b(context, attributeSet, i10);
    }
}
