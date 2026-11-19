package com.xuexiang.xui.widget.textview.marqueen;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.widget.imageview.strategy.LoadOption;
import java.util.List;

/* loaded from: classes.dex */
public class MarqueeView extends ViewFlipper {
    private int mAnimDuration;
    private Animation mAnimIn;
    private int mAnimInRes;
    private Animation mAnimOut;
    private int mAnimOutRes;
    private int mInterval;

    public MarqueeView(Context context) throws Resources.NotFoundException {
        super(context);
        this.mInterval = LoadOption.DEFAULT_TIMEOUT;
        this.mAnimDuration = 500;
        this.mAnimInRes = C2042R.anim.marquee_bottom_in;
        this.mAnimOutRes = C2042R.anim.marquee_top_out;
        init(null);
    }

    private void init(AttributeSet attributeSet) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C2042R.styleable.MarqueeView, 0, 0);
        this.mInterval = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.MarqueeView_mq_interval, this.mInterval);
        this.mAnimInRes = typedArrayObtainStyledAttributes.getResourceId(C2042R.styleable.MarqueeView_mq_animIn, this.mAnimInRes);
        this.mAnimOutRes = typedArrayObtainStyledAttributes.getResourceId(C2042R.styleable.MarqueeView_mq_animOut, this.mAnimOutRes);
        this.mAnimDuration = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.MarqueeView_mq_animDuration, this.mAnimDuration);
        typedArrayObtainStyledAttributes.recycle();
        setFlipInterval(this.mInterval);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), this.mAnimInRes);
        this.mAnimIn = animationLoadAnimation;
        animationLoadAnimation.setDuration(this.mAnimDuration);
        setInAnimation(this.mAnimIn);
        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(getContext(), this.mAnimOutRes);
        this.mAnimOut = animationLoadAnimation2;
        animationLoadAnimation2.setDuration(this.mAnimDuration);
        setOutAnimation(this.mAnimOut);
    }

    public Animation getAnimIn() {
        return this.mAnimIn;
    }

    public Animation getAnimOut() {
        return this.mAnimOut;
    }

    @Override // android.widget.ViewFlipper, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopFlipping();
    }

    public void setAnimDuration(int i4) {
        this.mAnimDuration = i4;
        long j4 = i4;
        this.mAnimIn.setDuration(j4);
        setInAnimation(this.mAnimIn);
        this.mAnimOut.setDuration(j4);
        setOutAnimation(this.mAnimOut);
    }

    public void setAnimInAndOut(Animation animation, Animation animation2) {
        this.mAnimIn = animation;
        this.mAnimOut = animation2;
        setInAnimation(animation);
        setOutAnimation(animation2);
    }

    public void setInterval(int i4) {
        this.mInterval = i4;
        setFlipInterval(i4);
    }

    public void setMarqueeFactory(MarqueeFactory marqueeFactory) {
        marqueeFactory.setAttachedToMarqueeView(this);
        removeAllViews();
        List marqueeViews = marqueeFactory.getMarqueeViews();
        if (marqueeViews != null) {
            for (int i4 = 0; i4 < marqueeViews.size(); i4++) {
                addView((View) marqueeViews.get(i4));
            }
        }
    }

    public void setAnimInAndOut(int i4, int i5) {
        this.mAnimIn = AnimationUtils.loadAnimation(getContext(), i4);
        this.mAnimOut = AnimationUtils.loadAnimation(getContext(), i5);
        this.mAnimIn.setDuration(this.mAnimDuration);
        this.mAnimOut.setDuration(this.mAnimDuration);
        setInAnimation(this.mAnimIn);
        setOutAnimation(this.mAnimOut);
    }

    public MarqueeView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        this.mInterval = LoadOption.DEFAULT_TIMEOUT;
        this.mAnimDuration = 500;
        this.mAnimInRes = C2042R.anim.marquee_bottom_in;
        this.mAnimOutRes = C2042R.anim.marquee_top_out;
        init(attributeSet);
    }
}
