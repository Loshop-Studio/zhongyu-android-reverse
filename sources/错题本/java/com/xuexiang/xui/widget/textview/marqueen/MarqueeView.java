package com.xuexiang.xui.widget.textview.marqueen;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;
import com.xuexiang.xui.R$anim;
import com.xuexiang.xui.R$styleable;
import p182v3.AbstractC6667b;

/* loaded from: classes3.dex */
public class MarqueeView extends ViewFlipper {

    /* renamed from: a */
    public int f5056a;

    /* renamed from: b */
    public int f5057b;

    /* renamed from: c */
    public Animation f5058c;

    /* renamed from: d */
    public Animation f5059d;

    /* renamed from: e */
    public int f5060e;

    /* renamed from: f */
    public int f5061f;

    public MarqueeView(Context context) throws Resources.NotFoundException {
        super(context);
        this.f5056a = 2500;
        this.f5057b = 500;
        this.f5060e = R$anim.marquee_bottom_in;
        this.f5061f = R$anim.marquee_top_out;
        m3617a(null);
    }

    /* renamed from: a */
    public final void m3617a(AttributeSet attributeSet) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.MarqueeView, 0, 0);
        this.f5056a = typedArrayObtainStyledAttributes.getInt(R$styleable.MarqueeView_mq_interval, this.f5056a);
        this.f5060e = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MarqueeView_mq_animIn, this.f5060e);
        this.f5061f = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MarqueeView_mq_animOut, this.f5061f);
        this.f5057b = typedArrayObtainStyledAttributes.getInt(R$styleable.MarqueeView_mq_animDuration, this.f5057b);
        typedArrayObtainStyledAttributes.recycle();
        setFlipInterval(this.f5056a);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), this.f5060e);
        this.f5058c = animationLoadAnimation;
        animationLoadAnimation.setDuration(this.f5057b);
        setInAnimation(this.f5058c);
        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(getContext(), this.f5061f);
        this.f5059d = animationLoadAnimation2;
        animationLoadAnimation2.setDuration(this.f5057b);
        setOutAnimation(this.f5059d);
    }

    public Animation getAnimIn() {
        return this.f5058c;
    }

    public Animation getAnimOut() {
        return this.f5059d;
    }

    @Override // android.widget.ViewFlipper, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopFlipping();
    }

    public void setAnimDuration(int i) {
        this.f5057b = i;
        long j7 = i;
        this.f5058c.setDuration(j7);
        setInAnimation(this.f5058c);
        this.f5059d.setDuration(j7);
        setOutAnimation(this.f5059d);
    }

    public void setInterval(int i) {
        this.f5056a = i;
        setFlipInterval(i);
    }

    public void setMarqueeFactory(AbstractC6667b abstractC6667b) {
        throw null;
    }

    public MarqueeView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        this.f5056a = 2500;
        this.f5057b = 500;
        this.f5060e = R$anim.marquee_bottom_in;
        this.f5061f = R$anim.marquee_top_out;
        m3617a(attributeSet);
    }
}
