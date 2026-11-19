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
import p276o9.AbstractC10452b;

/* loaded from: classes5.dex */
public class MarqueeView extends ViewFlipper {

    /* renamed from: c */
    public int f17348c;

    /* renamed from: d */
    public int f17349d;

    /* renamed from: e */
    public Animation f17350e;

    /* renamed from: f */
    public Animation f17351f;

    /* renamed from: g */
    public int f17352g;

    /* renamed from: h */
    public int f17353h;

    public MarqueeView(Context context) throws Resources.NotFoundException {
        super(context);
        this.f17348c = 2500;
        this.f17349d = 500;
        this.f17352g = R$anim.marquee_bottom_in;
        this.f17353h = R$anim.marquee_top_out;
        m13586a(null);
    }

    /* renamed from: a */
    public final void m13586a(AttributeSet attributeSet) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.MarqueeView, 0, 0);
        this.f17348c = typedArrayObtainStyledAttributes.getInt(R$styleable.MarqueeView_mq_interval, this.f17348c);
        this.f17352g = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MarqueeView_mq_animIn, this.f17352g);
        this.f17353h = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MarqueeView_mq_animOut, this.f17353h);
        this.f17349d = typedArrayObtainStyledAttributes.getInt(R$styleable.MarqueeView_mq_animDuration, this.f17349d);
        typedArrayObtainStyledAttributes.recycle();
        setFlipInterval(this.f17348c);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), this.f17352g);
        this.f17350e = animationLoadAnimation;
        animationLoadAnimation.setDuration(this.f17349d);
        setInAnimation(this.f17350e);
        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(getContext(), this.f17353h);
        this.f17351f = animationLoadAnimation2;
        animationLoadAnimation2.setDuration(this.f17349d);
        setOutAnimation(this.f17351f);
    }

    public Animation getAnimIn() {
        return this.f17350e;
    }

    public Animation getAnimOut() {
        return this.f17351f;
    }

    @Override // android.widget.ViewFlipper, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopFlipping();
    }

    public void setAnimDuration(int i10) {
        this.f17349d = i10;
        long j10 = i10;
        this.f17350e.setDuration(j10);
        setInAnimation(this.f17350e);
        this.f17351f.setDuration(j10);
        setOutAnimation(this.f17351f);
    }

    public void setInterval(int i10) {
        this.f17348c = i10;
        setFlipInterval(i10);
    }

    public void setMarqueeFactory(AbstractC10452b abstractC10452b) {
        throw null;
    }

    public MarqueeView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        this.f17348c = 2500;
        this.f17349d = 500;
        this.f17352g = R$anim.marquee_bottom_in;
        this.f17353h = R$anim.marquee_top_out;
        m13586a(attributeSet);
    }
}
