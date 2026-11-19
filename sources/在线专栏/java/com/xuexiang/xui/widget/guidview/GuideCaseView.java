package com.xuexiang.xui.widget.guidview;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.text.Spanned;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.XUI;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class GuideCaseView extends FrameLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    private static final String CONTAINER_TAG = "ShowCaseViewTag";
    private static final String PREF_NAME = "PrefShowCaseView";
    private Activity mActivity;
    private int mAdjustHeight;
    private int mAnimationDuration;
    private int mBackgroundColor;
    private Calculator mCalculator;
    private int mCenterX;
    private int mCenterY;
    private boolean mCloseOnTouch;
    private int mCustomViewRes;
    private DismissListener mDismissListener;
    private Animation mEnterAnimation;
    private Animation mExitAnimation;
    private boolean mFitSystemWindows;
    private boolean mFocusAnimationEnabled;
    private int mFocusAnimationMaxValue;
    private int mFocusAnimationStep;
    private int mFocusBorderColor;
    private int mFocusBorderSize;
    private int mFocusCircleRadius;
    private double mFocusCircleRadiusFactor;
    private int mFocusOffsetX;
    private int mFocusPositionX;
    private int mFocusPositionY;
    private int mFocusRectangleHeight;
    private int mFocusRectangleWidth;
    private FocusShape mFocusShape;
    private String mId;
    private int mPictureGravity;
    private int mPictureHeight;
    private int mPictureOffsetX;
    private int mPictureOffsetY;
    private int mPictureResId;
    private int mPictureWidth;
    private ViewGroup mRoot;
    private int mRoundRectRadius;
    private SharedPreferences mSharedPreferences;
    private Spanned mSpannedTitle;
    private String mTitle;
    private int mTitleGravity;
    private int mTitleSize;
    private int mTitleSizeUnit;
    private int mTitleStyle;
    private View mView;
    private OnViewInflateListener mViewInflateListener;

    public static class Builder {
        private Activity mActivity;
        private int mBackgroundColor;
        private int mCustomViewRes;
        private Animation mEnterAnimation;
        private Animation mExitAnimation;
        private boolean mFitSystemWindows;
        private int mFocusBorderColor;
        private int mFocusBorderSize;
        private int mFocusCircleRadius;
        private int mFocusOffSetX;
        private int mFocusPositionX;
        private int mFocusPositionY;
        private int mFocusRectangleHeight;
        private int mFocusRectangleWidth;
        private String mId;
        private int mPictureHeight;
        private int mPictureOffSetX;
        private int mPictureOffSetY;
        private int mPictureResId;
        private int mPictureWidth;
        private int mRoundRectRadius;
        private Spanned mSpannedTitle;
        private String mTitle;
        private int mTitleStyle;
        private View mView;
        private OnViewInflateListener mViewInflateListener;
        private double mFocusCircleRadiusFactor = 1.0d;
        private int mTitleGravity = -1;
        private int mTitleSize = -1;
        private int mTitleSizeUnit = -1;
        private int mPictureGravity = 17;
        private boolean mCloseOnTouch = true;
        private int mAdjustHeight = -1;
        private FocusShape mFocusShape = FocusShape.CIRCLE;
        private DismissListener mDismissListener = null;
        private boolean mFocusAnimationEnabled = true;
        private int mFocusAnimationMaxValue = 20;
        private int mFocusAnimationStep = 1;

        public Builder(Activity activity) {
            this.mActivity = activity;
        }

        public Builder adjustHeight(int i4) {
            this.mAdjustHeight = i4;
            return this;
        }

        public Builder backgroundColor(int i4) {
            this.mBackgroundColor = i4;
            return this;
        }

        public GuideCaseView build() {
            return new GuideCaseView(this);
        }

        public Builder closeOnTouch(boolean z3) {
            this.mCloseOnTouch = z3;
            return this;
        }

        public Builder customView(int i4, OnViewInflateListener onViewInflateListener) {
            this.mCustomViewRes = i4;
            this.mViewInflateListener = onViewInflateListener;
            return this;
        }

        public Builder disableFocusAnimation() {
            this.mFocusAnimationEnabled = false;
            return this;
        }

        public Builder dismissListener(DismissListener dismissListener) {
            this.mDismissListener = dismissListener;
            return this;
        }

        public Builder enterAnimation(Animation animation) {
            this.mEnterAnimation = animation;
            return this;
        }

        public Builder exitAnimation(Animation animation) {
            this.mExitAnimation = animation;
            return this;
        }

        public Builder fitSystemWindows(boolean z3) {
            this.mFitSystemWindows = z3;
            return this;
        }

        public Builder fitWindowsAuto() {
            this.mFitSystemWindows = true;
            return this;
        }

        public Builder focusAnimationMaxValue(int i4) {
            this.mFocusAnimationMaxValue = i4;
            return this;
        }

        public Builder focusAnimationStep(int i4) {
            this.mFocusAnimationStep = i4;
            return this;
        }

        public Builder focusBorderColor(int i4) {
            this.mFocusBorderColor = i4;
            return this;
        }

        public Builder focusBorderSize(int i4) {
            this.mFocusBorderSize = i4;
            return this;
        }

        public Builder focusCircleAtPosition(int i4, int i5, int i6) {
            this.mFocusPositionX = i4;
            this.mFocusPositionY = i5;
            this.mFocusCircleRadius = i6;
            return this;
        }

        public Builder focusCircleRadiusFactor(double d4) {
            this.mFocusCircleRadiusFactor = d4;
            return this;
        }

        public Builder focusOn(View view) {
            this.mView = view;
            return this;
        }

        public Builder focusRectAtPosition(int i4, int i5, int i6, int i7) {
            this.mFocusPositionX = i4;
            this.mFocusPositionY = i5;
            this.mFocusRectangleWidth = i6;
            this.mFocusRectangleHeight = i7;
            return this;
        }

        public Builder focusShape(FocusShape focusShape) {
            this.mFocusShape = focusShape;
            return this;
        }

        public Builder picture(int i4) {
            this.mPictureResId = i4;
            return this;
        }

        public Builder pictureGravity(int i4) {
            this.mPictureGravity = i4;
            return this;
        }

        public Builder pictureOffSet(int i4, int i5) {
            this.mPictureOffSetX = i4;
            this.mPictureOffSetY = i5;
            return this;
        }

        public Builder pictureOffSetX(int i4) {
            this.mPictureOffSetX = i4;
            return this;
        }

        public Builder pictureOffSetY(int i4) {
            this.mPictureOffSetY = i4;
            return this;
        }

        public Builder roundRectRadius(int i4) {
            this.mRoundRectRadius = i4;
            return this;
        }

        public Builder setFocusOffSetX(int i4) {
            this.mFocusOffSetX = i4;
            return this;
        }

        public void show() throws Resources.NotFoundException {
            build().show();
        }

        public Builder showOnce(String str) {
            this.mId = str;
            return this;
        }

        public Builder title(String str) {
            this.mTitle = str;
            this.mSpannedTitle = null;
            return this;
        }

        public Builder titleGravity(int i4) {
            this.mTitleGravity = i4;
            return this;
        }

        public Builder titleSize(int i4, int i5) {
            this.mTitleSize = i4;
            this.mTitleSizeUnit = i5;
            return this;
        }

        public Builder titleStyle(int i4, int i5) {
            this.mTitleGravity = i5;
            this.mTitleStyle = i4;
            return this;
        }

        public Builder picture(int i4, int i5, int i6) {
            this.mPictureResId = i4;
            this.mPictureWidth = i5;
            this.mPictureHeight = i6;
            return this;
        }

        public Builder pictureGravity(int i4, int i5, int i6) {
            this.mPictureGravity = i4;
            this.mPictureOffSetX = i5;
            this.mPictureOffSetY = i6;
            return this;
        }

        public Builder title(Spanned spanned) {
            this.mSpannedTitle = spanned;
            this.mTitle = null;
            return this;
        }
    }

    GuideCaseView(Context context) {
        super(context);
        this.mAnimationDuration = 400;
    }

    private void doCircularEnterAnimation() {
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.xuexiang.xui.widget.guidview.GuideCaseView.5
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                int width;
                GuideCaseView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                int iHypot = (int) Math.hypot(GuideCaseView.this.getWidth(), GuideCaseView.this.getHeight());
                if (GuideCaseView.this.mView != null) {
                    width = GuideCaseView.this.mView.getWidth() / 2;
                } else {
                    if (GuideCaseView.this.mFocusCircleRadius > 0 || GuideCaseView.this.mFocusRectangleWidth > 0 || GuideCaseView.this.mFocusRectangleHeight > 0) {
                        GuideCaseView guideCaseView = GuideCaseView.this;
                        guideCaseView.mCenterX = guideCaseView.mFocusPositionX;
                        GuideCaseView guideCaseView2 = GuideCaseView.this;
                        guideCaseView2.mCenterY = guideCaseView2.mFocusPositionY;
                    }
                    width = 0;
                }
                GuideCaseView guideCaseView3 = GuideCaseView.this;
                Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(guideCaseView3, guideCaseView3.mCenterX, GuideCaseView.this.mCenterY, width, iHypot);
                animatorCreateCircularReveal.setDuration(GuideCaseView.this.mAnimationDuration);
                animatorCreateCircularReveal.setInterpolator(AnimationUtils.loadInterpolator(GuideCaseView.this.mActivity, R.interpolator.accelerate_cubic));
                animatorCreateCircularReveal.start();
                return false;
            }
        });
    }

    @TargetApi(21)
    private void doCircularExitAnimation() {
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(this, this.mCenterX, this.mCenterY, (int) Math.hypot(getWidth(), getHeight()), IGoodView.DEFAULT_TO_ALPHA);
        animatorCreateCircularReveal.setDuration(this.mAnimationDuration);
        animatorCreateCircularReveal.setInterpolator(AnimationUtils.loadInterpolator(this.mActivity, R.interpolator.decelerate_cubic));
        animatorCreateCircularReveal.addListener(new AnimatorListenerAdapter() { // from class: com.xuexiang.xui.widget.guidview.GuideCaseView.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                GuideCaseView.this.removeView();
            }
        });
        animatorCreateCircularReveal.start();
    }

    private void focus() throws Resources.NotFoundException {
        int i4;
        int i5;
        this.mCalculator = new Calculator(this.mActivity, this.mFocusShape, this.mView, this.mFocusCircleRadiusFactor, this.mFitSystemWindows, this.mAdjustHeight, this.mFocusOffsetX);
        ViewGroup viewGroup = (ViewGroup) ((ViewGroup) this.mActivity.findViewById(R.id.content)).getParent().getParent();
        this.mRoot = viewGroup;
        GuideCaseView guideCaseView = (GuideCaseView) viewGroup.findViewWithTag(CONTAINER_TAG);
        setClickable(true);
        if (guideCaseView == null) {
            setTag(CONTAINER_TAG);
            if (this.mCloseOnTouch) {
                setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.widget.guidview.GuideCaseView.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) throws Resources.NotFoundException {
                        GuideCaseView.this.hide();
                    }
                });
            }
            setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.mRoot.addView(this);
            GuideImageView guideImageView = new GuideImageView(this.mActivity);
            guideImageView.setFocusAnimationParameters(this.mFocusAnimationMaxValue, this.mFocusAnimationStep);
            if (this.mCalculator.hasFocus()) {
                this.mCenterX = this.mCalculator.getCircleCenterX();
                this.mCenterY = this.mCalculator.getCircleCenterY();
            }
            guideImageView.setParameters(this.mBackgroundColor, this.mCalculator);
            int i6 = this.mFocusRectangleWidth;
            if (i6 > 0 && (i5 = this.mFocusRectangleHeight) > 0) {
                this.mCalculator.setRectPosition(this.mFocusPositionX, this.mFocusPositionY, i6, i5);
            }
            int i7 = this.mFocusCircleRadius;
            if (i7 > 0) {
                this.mCalculator.setCirclePosition(this.mFocusPositionX, this.mFocusPositionY, i7);
            }
            guideImageView.setAnimationEnabled(this.mFocusAnimationEnabled);
            guideImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            int i8 = this.mFocusBorderColor;
            if (i8 != 0 && (i4 = this.mFocusBorderSize) > 0) {
                guideImageView.setBorderParameters(i8, i4);
            }
            int i9 = this.mRoundRectRadius;
            if (i9 > 0) {
                guideImageView.setRoundRectRadius(i9);
            }
            addView(guideImageView);
            int i10 = this.mCustomViewRes;
            if (i10 != 0) {
                inflateCustomView(i10, this.mViewInflateListener);
            } else if (this.mPictureResId == 0) {
                inflateTitleView();
            } else {
                inflatePicture();
            }
            startEnterAnimation();
            writeShown();
        }
    }

    public static void hideCurrent(Activity activity) throws Resources.NotFoundException {
        ((GuideCaseView) ((ViewGroup) ((ViewGroup) activity.findViewById(R.id.content)).getParent().getParent()).findViewWithTag(CONTAINER_TAG)).hide();
    }

    private void inflateCustomView(int i4, OnViewInflateListener onViewInflateListener) {
        View viewInflate = this.mActivity.getLayoutInflater().inflate(i4, (ViewGroup) this, false);
        addView(viewInflate);
        if (onViewInflateListener != null) {
            onViewInflateListener.onViewInflated(viewInflate);
        }
    }

    private void inflatePicture() {
        inflateCustomView(C2042R.layout.gcv_layout_image, new OnViewInflateListener() { // from class: com.xuexiang.xui.widget.guidview.GuideCaseView.4
            @Override // com.xuexiang.xui.widget.guidview.OnViewInflateListener
            public void onViewInflated(View view) {
                ImageView imageView = (ImageView) view.findViewById(C2042R.id.gcv_img);
                imageView.setImageResource(GuideCaseView.this.mPictureResId);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
                layoutParams.gravity = GuideCaseView.this.mPictureGravity;
                if (GuideCaseView.this.mPictureWidth != 0) {
                    layoutParams.width = GuideCaseView.this.mPictureWidth;
                }
                if (GuideCaseView.this.mPictureHeight != 0) {
                    layoutParams.height = GuideCaseView.this.mPictureHeight;
                }
                if (GuideCaseView.this.mPictureOffsetY > 0) {
                    layoutParams.topMargin = GuideCaseView.this.mPictureOffsetY;
                } else {
                    layoutParams.bottomMargin = -GuideCaseView.this.mPictureOffsetY;
                }
                if (GuideCaseView.this.mPictureOffsetX > 0) {
                    layoutParams.leftMargin = GuideCaseView.this.mPictureOffsetX;
                } else {
                    layoutParams.rightMargin = -GuideCaseView.this.mPictureOffsetX;
                }
                imageView.setLayoutParams(layoutParams);
            }
        });
    }

    private void inflateTitleView() {
        inflateCustomView(C2042R.layout.gcv_layout_title, new OnViewInflateListener() { // from class: com.xuexiang.xui.widget.guidview.GuideCaseView.3
            @Override // com.xuexiang.xui.widget.guidview.OnViewInflateListener
            public void onViewInflated(View view) {
                TextView textView = (TextView) view.findViewById(C2042R.id.gcv_title);
                if (Build.VERSION.SDK_INT >= 23) {
                    textView.setTextAppearance(GuideCaseView.this.mTitleStyle);
                } else {
                    textView.setTextAppearance(GuideCaseView.this.mActivity, GuideCaseView.this.mTitleStyle);
                }
                if (GuideCaseView.this.mTitleSize != -1) {
                    textView.setTextSize(GuideCaseView.this.mTitleSizeUnit, GuideCaseView.this.mTitleSize);
                }
                textView.setGravity(GuideCaseView.this.mTitleGravity);
                textView.setTypeface(XUI.getDefaultTypeface());
                if (GuideCaseView.this.mSpannedTitle != null) {
                    textView.setText(GuideCaseView.this.mSpannedTitle);
                } else {
                    textView.setText(GuideCaseView.this.mTitle);
                }
            }
        });
    }

    private void initializeParameters() throws Resources.NotFoundException {
        int color = this.mBackgroundColor;
        if (color == 0) {
            color = this.mActivity.getResources().getColor(C2042R.color.default_guide_case_view_background_color);
        }
        this.mBackgroundColor = color;
        int i4 = this.mTitleGravity;
        if (i4 < 0) {
            i4 = 17;
        }
        this.mTitleGravity = i4;
        int i5 = this.mTitleStyle;
        if (i5 == 0) {
            i5 = C2042R.style.DefaultGuideCaseTitleStyle;
        }
        this.mTitleStyle = i5;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.mActivity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i6 = displayMetrics.widthPixels;
        int i7 = displayMetrics.heightPixels;
        this.mCenterX = i6 / 2;
        this.mCenterY = i7 / 2;
        this.mSharedPreferences = this.mActivity.getSharedPreferences(PREF_NAME, 0);
    }

    public static boolean isShowOnce(Context context, String str) {
        return context.getSharedPreferences(PREF_NAME, 0).getBoolean(str, false);
    }

    public static Boolean isVisible(Activity activity) {
        return Boolean.valueOf(((GuideCaseView) ((ViewGroup) ((ViewGroup) activity.findViewById(R.id.content)).getParent().getParent()).findViewWithTag(CONTAINER_TAG)) != null);
    }

    public static void resetAllShowOnce(Context context) {
        context.getSharedPreferences(PREF_NAME, 0).edit().clear().apply();
    }

    public static void resetShowOnce(Context context, String str) {
        context.getSharedPreferences(PREF_NAME, 0).edit().remove(str).apply();
    }

    public static void setShowOnce(Context context, String str) {
        context.getSharedPreferences(PREF_NAME, 0).edit().putBoolean(str, true).apply();
    }

    private void startEnterAnimation() throws Resources.NotFoundException {
        Animation animation = this.mEnterAnimation;
        if (animation != null) {
            startAnimation(animation);
        } else {
            if (Utils.shouldShowCircularAnimation()) {
                doCircularEnterAnimation();
                return;
            }
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.mActivity, C2042R.anim.gcv_fade_in);
            animationLoadAnimation.setFillAfter(true);
            startAnimation(animationLoadAnimation);
        }
    }

    private void writeShown() {
        SharedPreferences.Editor editorEdit = this.mSharedPreferences.edit();
        editorEdit.putBoolean(this.mId, true);
        editorEdit.apply();
    }

    protected DismissListener getDismissListener() {
        return this.mDismissListener;
    }

    public int getFocusCenterX() {
        return this.mCalculator.getCircleCenterX();
    }

    public int getFocusCenterY() {
        return this.mCalculator.getCircleCenterY();
    }

    public int getFocusHeight() {
        return this.mCalculator.getFocusHeight();
    }

    public float getFocusRadius() {
        return FocusShape.CIRCLE.equals(this.mFocusShape) ? this.mCalculator.circleRadius(0, 1.0d) : IGoodView.DEFAULT_TO_ALPHA;
    }

    public int getFocusWidth() {
        return this.mCalculator.getFocusWidth();
    }

    public void hide() throws Resources.NotFoundException {
        Animation animation = this.mExitAnimation;
        if (animation != null) {
            startAnimation(animation);
            return;
        }
        if (Utils.shouldShowCircularAnimation()) {
            doCircularExitAnimation();
            return;
        }
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.mActivity, C2042R.anim.gcv_fade_out);
        animationLoadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.xuexiang.xui.widget.guidview.GuideCaseView.2
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation2) {
                GuideCaseView.this.removeView();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation2) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation2) {
            }
        });
        animationLoadAnimation.setFillAfter(true);
        startAnimation(animationLoadAnimation);
    }

    public boolean isShownBefore() {
        return this.mSharedPreferences.getBoolean(this.mId, false);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() throws Resources.NotFoundException {
        this.mView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        focus();
    }

    public void removeView() {
        this.mRoot.removeView(this);
        DismissListener dismissListener = this.mDismissListener;
        if (dismissListener != null) {
            dismissListener.onDismiss(this.mId);
        }
    }

    protected void setDismissListener(DismissListener dismissListener) {
        this.mDismissListener = dismissListener;
    }

    public void show() throws Resources.NotFoundException {
        if (this.mActivity == null || (this.mId != null && isShownBefore())) {
            DismissListener dismissListener = this.mDismissListener;
            if (dismissListener != null) {
                dismissListener.onSkipped(this.mId);
                return;
            }
            return;
        }
        View view = this.mView;
        if (view == null) {
            focus();
        } else if (view.getWidth() == 0 && this.mView.getHeight() == 0) {
            this.mView.getViewTreeObserver().addOnGlobalLayoutListener(this);
        } else {
            focus();
        }
    }

    GuideCaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mAnimationDuration = 400;
    }

    GuideCaseView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mAnimationDuration = 400;
    }

    GuideCaseView(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.mAnimationDuration = 400;
    }

    public GuideCaseView(Builder builder) {
        this(builder.mActivity, builder.mView, builder.mId, builder.mTitle, builder.mSpannedTitle, builder.mTitleGravity, builder.mTitleStyle, builder.mTitleSize, builder.mTitleSizeUnit, builder.mFocusCircleRadiusFactor, builder.mBackgroundColor, builder.mFocusBorderColor, builder.mFocusBorderSize, builder.mCustomViewRes, builder.mViewInflateListener, builder.mEnterAnimation, builder.mExitAnimation, builder.mCloseOnTouch, builder.mFitSystemWindows, builder.mAdjustHeight, builder.mFocusOffSetX, builder.mFocusShape, builder.mDismissListener, builder.mRoundRectRadius, builder.mPictureResId, builder.mPictureWidth, builder.mPictureHeight, builder.mPictureGravity, builder.mPictureOffSetX, builder.mPictureOffSetY, builder.mFocusPositionX, builder.mFocusPositionY, builder.mFocusCircleRadius, builder.mFocusRectangleWidth, builder.mFocusRectangleHeight, builder.mFocusAnimationEnabled, builder.mFocusAnimationMaxValue, builder.mFocusAnimationStep);
    }

    private GuideCaseView(Activity activity, View view, String str, String str2, Spanned spanned, int i4, int i5, int i6, int i7, double d4, int i8, int i9, int i10, int i11, OnViewInflateListener onViewInflateListener, Animation animation, Animation animation2, boolean z3, boolean z4, int i12, int i13, FocusShape focusShape, DismissListener dismissListener, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, boolean z5, int i26, int i27) throws Resources.NotFoundException {
        super(activity);
        this.mAnimationDuration = 400;
        this.mId = str;
        this.mActivity = activity;
        this.mView = view;
        this.mTitle = str2;
        this.mSpannedTitle = spanned;
        this.mFocusCircleRadiusFactor = d4;
        this.mBackgroundColor = i8;
        this.mFocusBorderColor = i9;
        this.mFocusBorderSize = i10;
        this.mTitleGravity = i4;
        this.mTitleStyle = i5;
        this.mTitleSize = i6;
        this.mTitleSizeUnit = i7;
        this.mRoundRectRadius = i14;
        this.mPictureResId = i15;
        this.mPictureWidth = i16;
        this.mPictureHeight = i17;
        this.mPictureGravity = i18;
        this.mPictureOffsetX = i19;
        this.mPictureOffsetY = i20;
        this.mCustomViewRes = i11;
        this.mViewInflateListener = onViewInflateListener;
        this.mEnterAnimation = animation;
        this.mExitAnimation = animation2;
        this.mCloseOnTouch = z3;
        this.mFitSystemWindows = z4;
        this.mAdjustHeight = i12;
        this.mFocusOffsetX = i13;
        this.mFocusShape = focusShape;
        this.mDismissListener = dismissListener;
        this.mFocusPositionX = i21;
        this.mFocusPositionY = i22;
        this.mFocusCircleRadius = i23;
        this.mFocusRectangleWidth = i24;
        this.mFocusRectangleHeight = i25;
        this.mFocusAnimationEnabled = z5;
        this.mFocusAnimationMaxValue = i26;
        this.mFocusAnimationStep = i27;
        initializeParameters();
    }
}
