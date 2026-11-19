package com.xuexiang.xui.widget.statelayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
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
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.UIConfig;
import com.xuexiang.xui.widget.progress.materialprogressbar.MaterialProgressBar;

/* loaded from: classes.dex */
public class StatefulLayout extends LinearLayout {
    private static final String MSG_ONE_CHILD = "StatefulLayout must have one child!";
    private int mAnimCounter;
    private boolean mAnimationEnabled;
    private Button mBtnRetry;
    private View mContent;
    private ImageView mImage;
    private Animation mInAnimation;
    private LinearLayout mLlContainer;
    private TextView mMessage;
    private Animation mOutAnimation;
    private MaterialProgressBar mProgressBar;

    public StatefulLayout(Context context) {
        this(context, null);
    }

    private String getString(int i4) {
        return getContext().getString(i4);
    }

    private void initAttrs(Context context, AttributeSet attributeSet, int i4) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.StatefulLayout, i4, 0);
        this.mAnimationEnabled = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.StatefulLayout_stf_animationEnabled, UIConfig.getInstance().getStateLayoutConfig().animationEnabled);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C2042R.styleable.StatefulLayout_stf_inAnimation, -1);
        if (resourceId != -1) {
            this.mInAnimation = loadAnimation(resourceId);
        } else {
            this.mInAnimation = UIConfig.getInstance().getStateLayoutConfig().inAnimation;
        }
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(C2042R.styleable.StatefulLayout_stf_outAnimation, -1);
        if (resourceId != -1) {
            this.mOutAnimation = loadAnimation(resourceId2);
        } else {
            this.mOutAnimation = UIConfig.getInstance().getStateLayoutConfig().outAnimation;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private Animation loadAnimation(int i4) {
        return AnimationUtils.loadAnimation(getContext(), i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void state(CustomStateOptions customStateOptions) {
        if (TextUtils.isEmpty(customStateOptions.getMessage())) {
            this.mMessage.setVisibility(8);
        } else {
            this.mMessage.setVisibility(0);
            this.mMessage.setText(customStateOptions.getMessage());
        }
        if (customStateOptions.isLoading()) {
            this.mProgressBar.setVisibility(0);
            this.mImage.setVisibility(8);
            this.mBtnRetry.setVisibility(8);
            return;
        }
        this.mProgressBar.setVisibility(8);
        if (customStateOptions.getImageRes() != 0) {
            this.mImage.setVisibility(0);
            this.mImage.setImageResource(customStateOptions.getImageRes());
        } else {
            this.mImage.setVisibility(8);
        }
        if (customStateOptions.getClickListener() == null) {
            this.mBtnRetry.setVisibility(8);
            return;
        }
        this.mBtnRetry.setVisibility(0);
        this.mBtnRetry.setOnClickListener(customStateOptions.getClickListener());
        if (TextUtils.isEmpty(customStateOptions.getButtonText())) {
            return;
        }
        this.mBtnRetry.setText(customStateOptions.getButtonText());
    }

    public void attachTemplate() {
        setOrientation(1);
        this.mContent = getChildAt(0);
        LayoutInflater.from(getContext()).inflate(C2042R.layout.xui_layout_stateful_template, (ViewGroup) this, true);
        this.mLlContainer = (LinearLayout) findViewById(C2042R.id.stContainer);
        this.mProgressBar = (MaterialProgressBar) findViewById(C2042R.id.stProgress);
        this.mImage = (ImageView) findViewById(C2042R.id.stImage);
        this.mMessage = (TextView) findViewById(C2042R.id.stMessage);
        this.mBtnRetry = (Button) findViewById(C2042R.id.stButton);
    }

    public Animation getInAnimation() {
        return this.mInAnimation;
    }

    public Animation getOutAnimation() {
        return this.mOutAnimation;
    }

    public boolean isAnimationEnabled() {
        return this.mAnimationEnabled;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() > 1) {
            throw new IllegalStateException(MSG_ONE_CHILD);
        }
        attachTemplate();
    }

    public StatefulLayout setAnimationEnabled(boolean z3) {
        this.mAnimationEnabled = z3;
        return this;
    }

    public StatefulLayout setInAnimation(Animation animation) {
        this.mInAnimation = animation;
        return this;
    }

    public StatefulLayout setOutAnimation(Animation animation) {
        this.mOutAnimation = animation;
        return this;
    }

    public void showContent() {
        if (this.mContent == null) {
            return;
        }
        if (!isAnimationEnabled()) {
            this.mLlContainer.setVisibility(8);
            this.mContent.setVisibility(0);
            return;
        }
        this.mLlContainer.clearAnimation();
        this.mContent.clearAnimation();
        final int i4 = this.mAnimCounter + 1;
        this.mAnimCounter = i4;
        if (this.mLlContainer.getVisibility() == 0) {
            this.mOutAnimation.setAnimationListener(new SimpleAnimationListener() { // from class: com.xuexiang.xui.widget.statelayout.StatefulLayout.1
                @Override // com.xuexiang.xui.widget.statelayout.SimpleAnimationListener, android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    if (StatefulLayout.this.mAnimCounter != i4) {
                        return;
                    }
                    StatefulLayout.this.mLlContainer.setVisibility(8);
                    StatefulLayout.this.mContent.setVisibility(0);
                    StatefulLayout.this.mContent.startAnimation(StatefulLayout.this.mInAnimation);
                }
            });
            this.mLlContainer.startAnimation(this.mOutAnimation);
        }
    }

    public void showCustom(final CustomStateOptions customStateOptions) {
        if (!isAnimationEnabled()) {
            View view = this.mContent;
            if (view != null) {
                view.setVisibility(8);
            }
            this.mLlContainer.setVisibility(0);
            state(customStateOptions);
            return;
        }
        this.mLlContainer.clearAnimation();
        View view2 = this.mContent;
        if (view2 != null) {
            view2.clearAnimation();
        }
        final int i4 = this.mAnimCounter + 1;
        this.mAnimCounter = i4;
        if (this.mLlContainer.getVisibility() != 8) {
            this.mOutAnimation.setAnimationListener(new SimpleAnimationListener() { // from class: com.xuexiang.xui.widget.statelayout.StatefulLayout.3
                @Override // com.xuexiang.xui.widget.statelayout.SimpleAnimationListener, android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    if (i4 != StatefulLayout.this.mAnimCounter) {
                        return;
                    }
                    StatefulLayout.this.state(customStateOptions);
                    StatefulLayout.this.mLlContainer.startAnimation(StatefulLayout.this.mInAnimation);
                }
            });
            this.mLlContainer.startAnimation(this.mOutAnimation);
            return;
        }
        this.mOutAnimation.setAnimationListener(new SimpleAnimationListener() { // from class: com.xuexiang.xui.widget.statelayout.StatefulLayout.2
            @Override // com.xuexiang.xui.widget.statelayout.SimpleAnimationListener, android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (i4 != StatefulLayout.this.mAnimCounter) {
                    return;
                }
                if (StatefulLayout.this.mContent != null) {
                    StatefulLayout.this.mContent.setVisibility(8);
                }
                StatefulLayout.this.mLlContainer.setVisibility(0);
                StatefulLayout.this.mLlContainer.startAnimation(StatefulLayout.this.mInAnimation);
            }
        });
        View view3 = this.mContent;
        if (view3 != null) {
            view3.startAnimation(this.mOutAnimation);
        }
        state(customStateOptions);
    }

    public void showEmpty() {
        showEmpty(UIConfig.getInstance().getStateLayoutConfig().emptyMessageRes);
    }

    public void showError(View.OnClickListener onClickListener) {
        showError(UIConfig.getInstance().getStateLayoutConfig().errorMessageRes, onClickListener);
    }

    public void showLoading() {
        showLoading(UIConfig.getInstance().getStateLayoutConfig().loadingMessageRes);
    }

    public void showLocationOff(View.OnClickListener onClickListener) {
        showLocationOff(UIConfig.getInstance().getStateLayoutConfig().locationOffMessageRes, onClickListener);
    }

    public void showOffline(View.OnClickListener onClickListener) {
        showOffline(UIConfig.getInstance().getStateLayoutConfig().offlineMessageRes, onClickListener);
    }

    public StatefulLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2042R.attr.StatefulLayoutStyle);
    }

    public StatefulLayout setInAnimation(int i4) {
        this.mInAnimation = loadAnimation(i4);
        return this;
    }

    public StatefulLayout setOutAnimation(int i4) {
        this.mOutAnimation = loadAnimation(i4);
        return this;
    }

    public void showEmpty(int i4) {
        showEmpty(getString(i4));
    }

    public void showError(int i4, View.OnClickListener onClickListener) {
        showError(getString(i4), onClickListener);
    }

    public void showLoading(int i4) {
        showLoading(getString(i4));
    }

    public void showLocationOff(int i4, View.OnClickListener onClickListener) {
        showLocationOff(getString(i4), onClickListener);
    }

    public void showOffline(int i4, View.OnClickListener onClickListener) {
        showOffline(getString(i4), onClickListener);
    }

    public StatefulLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        initAttrs(context, attributeSet, i4);
    }

    public void showEmpty(String str) {
        showCustom(new CustomStateOptions().message(str).image(UIConfig.getInstance().getStateLayoutConfig().emptyImageRes));
    }

    public void showError(String str, View.OnClickListener onClickListener) {
        showError(str, getString(UIConfig.getInstance().getStateLayoutConfig().retryMessageRes), onClickListener);
    }

    public void showLoading(String str) {
        showCustom(new CustomStateOptions().message(str).loading());
    }

    public void showLocationOff(String str, View.OnClickListener onClickListener) {
        showLocationOff(str, getString(UIConfig.getInstance().getStateLayoutConfig().retryMessageRes), onClickListener);
    }

    public void showOffline(String str, View.OnClickListener onClickListener) {
        showOffline(str, getString(UIConfig.getInstance().getStateLayoutConfig().retryMessageRes), onClickListener);
    }

    public void showError(String str, String str2, View.OnClickListener onClickListener) {
        showCustom(new CustomStateOptions().message(str).image(UIConfig.getInstance().getStateLayoutConfig().errorImageRes).buttonText(str2).buttonClickListener(onClickListener));
    }

    public void showLocationOff(String str, String str2, View.OnClickListener onClickListener) {
        showCustom(new CustomStateOptions().message(str).image(UIConfig.getInstance().getStateLayoutConfig().locationOffImageRes).buttonText(str2).buttonClickListener(onClickListener));
    }

    public void showOffline(String str, String str2, View.OnClickListener onClickListener) {
        showCustom(new CustomStateOptions().message(str).image(UIConfig.getInstance().getStateLayoutConfig().offlineImageRes).buttonText(str2).buttonClickListener(onClickListener));
    }
}
