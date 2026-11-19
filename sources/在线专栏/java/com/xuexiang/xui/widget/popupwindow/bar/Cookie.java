package com.xuexiang.xui.widget.popupwindow.bar;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0332a;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.ThemeUtils;
import com.xuexiang.xui.widget.popupwindow.bar.CookieBar;

/* loaded from: classes.dex */
final class Cookie extends LinearLayout {
    public static final long DEFAULT_COOKIE_DURATION = 2000;
    private TextView mBtnAction;
    private ImageView mBtnActionWithIcon;
    private long mDuration;
    private int mGravity;
    private ImageView mIvIcon;
    private LinearLayout mLayoutCookie;
    private Animation mSlideOutAnimation;
    private TextView mTvMessage;
    private TextView mTvTitle;

    public Cookie(Context context) {
        this(context, null);
    }

    private void createInAnim() throws Resources.NotFoundException {
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), this.mGravity == 80 ? C2042R.anim.cookiebar_slide_in_from_bottom : C2042R.anim.cookiebar_slide_in_from_top);
        animationLoadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.xuexiang.xui.widget.popupwindow.bar.Cookie.3
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (Cookie.this.mDuration < 0) {
                    return;
                }
                Cookie.this.postDelayed(new Runnable() { // from class: com.xuexiang.xui.widget.popupwindow.bar.Cookie.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Cookie.this.dismiss();
                    }
                }, Cookie.this.mDuration);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        setAnimation(animationLoadAnimation);
    }

    private void createOutAnim() throws Resources.NotFoundException {
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), this.mGravity == 80 ? C2042R.anim.cookiebar_slide_out_to_bottom : C2042R.anim.cookiebar_slide_out_to_top);
        this.mSlideOutAnimation = animationLoadAnimation;
        animationLoadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.xuexiang.xui.widget.popupwindow.bar.Cookie.4
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroy() {
        postDelayed(new Runnable() { // from class: com.xuexiang.xui.widget.popupwindow.bar.Cookie.6
            @Override // java.lang.Runnable
            public void run() {
                ViewParent parent = Cookie.this.getParent();
                if (parent != null) {
                    Cookie.this.clearAnimation();
                    ((ViewGroup) parent).removeView(Cookie.this);
                }
            }
        }, 200L);
    }

    private void initDefaultStyle(Context context) {
        int iResolveColor = ThemeUtils.resolveColor(context, C2042R.attr.cookieTitleColor, -1);
        int iResolveColor2 = ThemeUtils.resolveColor(context, C2042R.attr.cookieMessageColor, -1);
        int iResolveColor3 = ThemeUtils.resolveColor(context, C2042R.attr.cookieActionColor, -1);
        int iResolveColor4 = ThemeUtils.resolveColor(context, C2042R.attr.cookieBackgroundColor, C0332a.m1804b(context, C2042R.color.cookie_bar_default_bg_color));
        this.mTvTitle.setTextColor(iResolveColor);
        this.mTvMessage.setTextColor(iResolveColor2);
        this.mBtnAction.setTextColor(iResolveColor3);
        this.mLayoutCookie.setBackgroundColor(iResolveColor4);
    }

    private void initViews(Context context) {
        LinearLayout.inflate(getContext(), C2042R.layout.xui_layout_cookie, this);
        this.mLayoutCookie = (LinearLayout) findViewById(C2042R.id.cookie);
        this.mTvTitle = (TextView) findViewById(C2042R.id.tv_title);
        this.mTvMessage = (TextView) findViewById(C2042R.id.tv_message);
        this.mIvIcon = (ImageView) findViewById(C2042R.id.iv_icon);
        this.mBtnAction = (TextView) findViewById(C2042R.id.btn_action);
        this.mBtnActionWithIcon = (ImageView) findViewById(C2042R.id.btn_action_with_icon);
        initDefaultStyle(context);
    }

    public void dismiss() {
        this.mSlideOutAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.xuexiang.xui.widget.popupwindow.bar.Cookie.5
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                Cookie.this.destroy();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        startAnimation(this.mSlideOutAnimation);
    }

    public int getLayoutGravity() {
        return this.mGravity;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        if (this.mGravity == 48) {
            super.onLayout(z3, i4, 0, i6, this.mLayoutCookie.getMeasuredHeight());
        } else {
            super.onLayout(z3, i4, i5, i6, i7);
        }
    }

    public void setParams(final CookieBar.Params params) {
        if (params != null) {
            this.mDuration = params.duration;
            this.mGravity = params.layoutGravity;
            if (params.iconResId != 0) {
                this.mIvIcon.setVisibility(0);
                this.mIvIcon.setBackgroundResource(params.iconResId);
            }
            if (!TextUtils.isEmpty(params.title)) {
                this.mTvTitle.setVisibility(0);
                this.mTvTitle.setText(params.title);
                if (params.titleColor != 0) {
                    this.mTvTitle.setTextColor(C0332a.m1804b(getContext(), params.titleColor));
                }
            }
            if (!TextUtils.isEmpty(params.message)) {
                this.mTvMessage.setVisibility(0);
                this.mTvMessage.setText(params.message);
                if (params.messageColor != 0) {
                    this.mTvMessage.setTextColor(C0332a.m1804b(getContext(), params.messageColor));
                }
                if (TextUtils.isEmpty(params.title)) {
                    ((LinearLayout.LayoutParams) this.mTvMessage.getLayoutParams()).topMargin = 0;
                }
            }
            if ((!TextUtils.isEmpty(params.action) || params.actionIcon != 0) && params.onActionClickListener != null) {
                this.mBtnAction.setVisibility(0);
                this.mBtnAction.setText(params.action);
                this.mBtnAction.setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.widget.popupwindow.bar.Cookie.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        params.onActionClickListener.onClick(view);
                        Cookie.this.dismiss();
                    }
                });
                if (params.actionColor != 0) {
                    this.mBtnAction.setTextColor(C0332a.m1804b(getContext(), params.actionColor));
                }
            }
            if (params.actionIcon != 0 && params.onActionClickListener != null) {
                this.mBtnAction.setVisibility(8);
                this.mBtnActionWithIcon.setVisibility(0);
                this.mBtnActionWithIcon.setBackgroundResource(params.actionIcon);
                this.mBtnActionWithIcon.setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.widget.popupwindow.bar.Cookie.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        params.onActionClickListener.onClick(view);
                        Cookie.this.dismiss();
                    }
                });
            }
            if (params.backgroundColor != 0) {
                this.mLayoutCookie.setBackgroundColor(C0332a.m1804b(getContext(), params.backgroundColor));
            }
            int iResolveDimension = ThemeUtils.resolveDimension(getContext(), C2042R.attr.xui_config_content_spacing_horizontal);
            if (this.mGravity == 80) {
                this.mLayoutCookie.setPadding(iResolveDimension, iResolveDimension, iResolveDimension, iResolveDimension);
            }
            createInAnim();
            createOutAnim();
        }
    }

    public Cookie(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Cookie(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mDuration = DEFAULT_COOKIE_DURATION;
        this.mGravity = 80;
        initViews(context);
    }
}
