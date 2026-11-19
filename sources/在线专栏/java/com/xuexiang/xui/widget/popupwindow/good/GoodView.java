package com.xuexiang.xui.widget.popupwindow.good;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.xuexiang.xui.utils.ResUtils;

/* loaded from: classes.dex */
public class GoodView extends PopupWindow implements IGoodView {
    private AnimationSet mAnimationSet;
    private boolean mChanged;
    private TextView mContent;
    private int mDistance;
    private int mDuration;
    private float mFromAlpha;
    private int mFromY;
    private String mText;
    private int mTextColor;
    private int mTextSize;
    private float mToAlpha;
    private int mToY;

    public GoodView(Context context) {
        super(context);
        this.mContent = null;
        this.mText = "";
        this.mTextColor = IGoodView.DEFAULT_TEXT_COLOR;
        this.mTextSize = 16;
        this.mFromY = 0;
        this.mToY = 60;
        this.mFromAlpha = 1.0f;
        this.mToAlpha = IGoodView.DEFAULT_TO_ALPHA;
        this.mDuration = IGoodView.DEFAULT_DURATION;
        this.mDistance = 60;
        this.mChanged = false;
        initView(context);
    }

    private AnimationSet createAnimation() {
        AnimationSet animationSet = new AnimationSet(true);
        TranslateAnimation translateAnimation = new TranslateAnimation(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, this.mFromY, -this.mToY);
        AlphaAnimation alphaAnimation = new AlphaAnimation(this.mFromAlpha, this.mToAlpha);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(this.mDuration);
        animationSet.setAnimationListener(new Animation.AnimationListener() { // from class: com.xuexiang.xui.widget.popupwindow.good.GoodView.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (GoodView.this.isShowing()) {
                    GoodView.this.dismiss();
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        return animationSet;
    }

    private static int getTextViewHeight(TextView textView, int i4) {
        textView.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        return textView.getMeasuredHeight();
    }

    private void initView(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        layoutParams.addRule(12);
        TextView textView = new TextView(context);
        this.mContent = textView;
        textView.setIncludeFontPadding(false);
        this.mContent.setTextSize(1, this.mTextSize);
        this.mContent.setTextColor(this.mTextColor);
        this.mContent.setText(this.mText);
        this.mContent.setLayoutParams(layoutParams);
        relativeLayout.addView(this.mContent);
        setContentView(relativeLayout);
        this.mContent.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        setWidth(this.mContent.getMeasuredWidth());
        setHeight(this.mDistance + this.mContent.getMeasuredHeight());
        setBackgroundDrawable(new ColorDrawable(0));
        setFocusable(false);
        setTouchable(false);
        setOutsideTouchable(false);
        this.mAnimationSet = createAnimation();
    }

    @Override // com.xuexiang.xui.widget.popupwindow.good.IGoodView
    public void reset() {
        this.mText = "";
        this.mTextColor = IGoodView.DEFAULT_TEXT_COLOR;
        this.mTextSize = 16;
        this.mFromY = 0;
        this.mToY = 60;
        this.mFromAlpha = 1.0f;
        this.mToAlpha = IGoodView.DEFAULT_TO_ALPHA;
        this.mDuration = IGoodView.DEFAULT_DURATION;
        this.mDistance = 60;
        this.mChanged = false;
        this.mAnimationSet = createAnimation();
    }

    @Override // com.xuexiang.xui.widget.popupwindow.good.IGoodView
    public IGoodView setAlpha(float f4, float f5) {
        this.mFromAlpha = f4;
        this.mToAlpha = f5;
        this.mChanged = true;
        return this;
    }

    @Override // com.xuexiang.xui.widget.popupwindow.good.IGoodView
    public IGoodView setDistance(int i4) {
        this.mDistance = i4;
        this.mToY = i4;
        this.mChanged = true;
        setHeight(i4 + this.mContent.getMeasuredHeight());
        return this;
    }

    @Override // com.xuexiang.xui.widget.popupwindow.good.IGoodView
    public IGoodView setDuration(int i4) {
        this.mDuration = i4;
        this.mChanged = true;
        return this;
    }

    @Override // com.xuexiang.xui.widget.popupwindow.good.IGoodView
    public IGoodView setImageDrawable(Drawable drawable) {
        if (drawable == null) {
            throw new IllegalArgumentException("drawable cannot be null.");
        }
        this.mContent.setBackground(drawable);
        this.mContent.setText("");
        setWidth(drawable.getIntrinsicWidth());
        setHeight(this.mDistance + drawable.getIntrinsicHeight());
        return this;
    }

    @Override // com.xuexiang.xui.widget.popupwindow.good.IGoodView
    public IGoodView setImageResource(int i4) {
        return setImageDrawable(ResUtils.getDrawable(this.mContent.getContext(), i4));
    }

    @Override // com.xuexiang.xui.widget.popupwindow.good.IGoodView
    public IGoodView setText(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("text cannot be null.");
        }
        this.mText = str;
        this.mContent.setText(str);
        this.mContent.setBackground(new ColorDrawable(0));
        int iMeasureText = (int) this.mContent.getPaint().measureText(str);
        setWidth(iMeasureText);
        setHeight(this.mDistance + getTextViewHeight(this.mContent, iMeasureText));
        return this;
    }

    @Override // com.xuexiang.xui.widget.popupwindow.good.IGoodView
    public IGoodView setTextColor(int i4) {
        this.mTextColor = i4;
        this.mContent.setTextColor(i4);
        return this;
    }

    @Override // com.xuexiang.xui.widget.popupwindow.good.IGoodView
    public IGoodView setTextInfo(String str, int i4, int i5) {
        setTextColor(i4);
        setTextSize(i5);
        setText(str);
        return this;
    }

    @Override // com.xuexiang.xui.widget.popupwindow.good.IGoodView
    public IGoodView setTextSize(int i4) {
        this.mTextSize = i4;
        this.mContent.setTextSize(2, i4);
        return this;
    }

    @Override // com.xuexiang.xui.widget.popupwindow.good.IGoodView
    public IGoodView setTranslateY(int i4, int i5) {
        this.mFromY = i4;
        this.mToY = i5;
        this.mChanged = true;
        return this;
    }

    @Override // com.xuexiang.xui.widget.popupwindow.good.IGoodView
    public void show(View view) {
        if (isShowing()) {
            return;
        }
        showAsDropDown(view, (view.getWidth() / 2) - (getWidth() / 2), (-view.getHeight()) - getHeight());
        if (this.mAnimationSet == null || this.mChanged) {
            this.mAnimationSet = createAnimation();
            this.mChanged = false;
        }
        this.mContent.startAnimation(this.mAnimationSet);
    }
}
