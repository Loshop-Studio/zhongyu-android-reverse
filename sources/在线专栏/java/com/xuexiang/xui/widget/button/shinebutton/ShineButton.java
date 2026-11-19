package com.xuexiang.xui.widget.button.shinebutton;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.Checkable;
import androidx.fragment.app.Fragment;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.ResUtils;
import com.xuexiang.xui.utils.ThemeUtils;
import com.xuexiang.xui.widget.button.shinebutton.ShineView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class ShineButton extends PorterShapeImageView implements Checkable {
    private int mCheckedColor;
    private boolean mIsChecked;
    private boolean mIsDialog;
    private int mNormalColor;
    private OnCheckedChangeListener mOnCheckedChangeListener;
    private OnClickListenWrapper mOnClickListenWrapper;
    private ValueAnimator mShakeAnimator;
    private ShineView.ShineParams mShineParams;
    WeakReference<Window> mWindow;

    public interface OnCheckedChangeListener {
        void onCheckedChanged(ShineButton shineButton, boolean z3);
    }

    public class OnClickListenWrapper implements View.OnClickListener {
        private View.OnClickListener mListener;

        OnClickListenWrapper() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ShineButton.this.mIsChecked) {
                ShineButton.this.mIsChecked = false;
                ShineButton.this.setCancel();
            } else {
                ShineButton.this.mIsChecked = true;
                ShineButton.this.showAnim();
            }
            ShineButton shineButton = ShineButton.this;
            shineButton.onCheckedChanged(shineButton.mIsChecked);
            View.OnClickListener onClickListener = this.mListener;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }

        public void wrapListener(View.OnClickListener onClickListener) {
            this.mListener = onClickListener;
        }

        public OnClickListenWrapper(View.OnClickListener onClickListener) {
            this.mListener = onClickListener;
        }
    }

    public ShineButton(Context context) {
        this(context, null);
    }

    private void doShareAnim() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.4f, 1.0f, 0.9f, 1.0f);
        this.mShakeAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        this.mShakeAnimator.setDuration(500L);
        this.mShakeAnimator.setStartDelay(180L);
        invalidate();
        this.mShakeAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.xuexiang.xui.widget.button.shinebutton.ShineButton.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                ShineButton.this.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ShineButton.this.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.mShakeAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.xuexiang.xui.widget.button.shinebutton.ShineButton.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                ShineButton shineButton = ShineButton.this;
                shineButton.setTintColor(shineButton.mNormalColor);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ShineButton shineButton = ShineButton.this;
                shineButton.setTintColor(shineButton.mIsChecked ? ShineButton.this.mCheckedColor : ShineButton.this.mNormalColor);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ShineButton shineButton = ShineButton.this;
                shineButton.setTintColor(shineButton.mCheckedColor);
            }
        });
        this.mShakeAnimator.start();
    }

    private void initButton(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.ShineButton);
        this.mNormalColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.ShineButton_sb_normal_color, ResUtils.getColor(C2042R.color.default_sb_normal_color));
        this.mCheckedColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.ShineButton_sb_checked_color, ThemeUtils.getMainThemeColor(context));
        this.mShineParams.allowRandomColor = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.ShineButton_sb_allow_random_color, false);
        this.mShineParams.animDuration = typedArrayObtainStyledAttributes.getInteger(C2042R.styleable.ShineButton_sb_shine_animation_duration, (int) r0.animDuration);
        this.mShineParams.clickAnimDuration = typedArrayObtainStyledAttributes.getInteger(C2042R.styleable.ShineButton_sb_click_animation_duration, (int) r0.clickAnimDuration);
        this.mShineParams.enableFlashing = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.ShineButton_sb_enable_flashing, false);
        ShineView.ShineParams shineParams = this.mShineParams;
        shineParams.shineDistanceMultiple = typedArrayObtainStyledAttributes.getFloat(C2042R.styleable.ShineButton_sb_shine_distance_multiple, shineParams.shineDistanceMultiple);
        ShineView.ShineParams shineParams2 = this.mShineParams;
        shineParams2.shineCount = typedArrayObtainStyledAttributes.getInteger(C2042R.styleable.ShineButton_sb_shine_count, shineParams2.shineCount);
        ShineView.ShineParams shineParams3 = this.mShineParams;
        shineParams3.shineSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.ShineButton_sb_shine_size, shineParams3.shineSize);
        ShineView.ShineParams shineParams4 = this.mShineParams;
        shineParams4.shineTurnAngle = typedArrayObtainStyledAttributes.getFloat(C2042R.styleable.ShineButton_sb_shine_turn_angle, shineParams4.shineTurnAngle);
        ShineView.ShineParams shineParams5 = this.mShineParams;
        shineParams5.smallShineOffsetAngle = typedArrayObtainStyledAttributes.getFloat(C2042R.styleable.ShineButton_sb_small_shine_offset_angle, shineParams5.smallShineOffsetAngle);
        ShineView.ShineParams shineParams6 = this.mShineParams;
        shineParams6.smallShineColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.ShineButton_sb_small_shine_color, shineParams6.smallShineColor);
        ShineView.ShineParams shineParams7 = this.mShineParams;
        shineParams7.bigShineColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.ShineButton_sb_big_shine_color, shineParams7.bigShineColor);
        typedArrayObtainStyledAttributes.recycle();
        setTintColor(this.mNormalColor);
        if (context instanceof Activity) {
            initWindow((Activity) context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCheckedChanged(boolean z3) {
        OnCheckedChangeListener onCheckedChangeListener = this.mOnCheckedChangeListener;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(this, z3);
        }
    }

    public ShineButton enableFlashing(boolean z3) {
        this.mShineParams.enableFlashing = z3;
        return this;
    }

    public void fitDialog(Dialog dialog) {
        this.mWindow = new WeakReference<>(dialog.getWindow());
        this.mIsDialog = true;
    }

    public void fitFragment(Fragment fragment) {
        initWindow(fragment.getActivity());
    }

    public int getColor() {
        return this.mCheckedColor;
    }

    public Window getWindow() {
        WeakReference<Window> weakReference = this.mWindow;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void initWindow(Activity activity) {
        initWindow(activity.getWindow());
        this.mIsDialog = false;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.mIsChecked;
    }

    public void removeView(View view) {
        if (getWindow() != null) {
            ((ViewGroup) getWindow().findViewById(R.id.content)).removeView(view);
        }
    }

    public ShineButton setAllowRandomColor(boolean z3) {
        this.mShineParams.allowRandomColor = z3;
        return this;
    }

    public ShineButton setAnimDuration(int i4) {
        this.mShineParams.animDuration = i4;
        return this;
    }

    public ShineButton setBigShineColor(int i4) {
        this.mShineParams.bigShineColor = i4;
        return this;
    }

    public void setCancel() {
        setTintColor(this.mNormalColor);
        ValueAnimator valueAnimator = this.mShakeAnimator;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.mShakeAnimator.cancel();
        }
    }

    public void setChecked(boolean z3, boolean z4) {
        setChecked(z3, z4, true);
    }

    public ShineButton setCheckedColor(int i4) {
        this.mCheckedColor = i4;
        return this;
    }

    public ShineButton setClickAnimDuration(int i4) {
        this.mShineParams.clickAnimDuration = i4;
        return this;
    }

    public ShineButton setIconResource(int i4) {
        setIconDrawable(ResUtils.getDrawable(getContext(), i4));
        return this;
    }

    public ShineButton setNormalColor(int i4) {
        this.mNormalColor = i4;
        setTintColor(i4);
        return this;
    }

    public ShineButton setOnCheckStateChangeListener(OnCheckedChangeListener onCheckedChangeListener) {
        this.mOnCheckedChangeListener = onCheckedChangeListener;
        return this;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        if (onClickListener instanceof OnClickListenWrapper) {
            super.setOnClickListener(onClickListener);
            return;
        }
        OnClickListenWrapper onClickListenWrapper = this.mOnClickListenWrapper;
        if (onClickListenWrapper != null) {
            onClickListenWrapper.wrapListener(onClickListener);
        }
    }

    public ShineButton setShineCount(int i4) {
        this.mShineParams.shineCount = i4;
        return this;
    }

    public ShineButton setShineDistanceMultiple(float f4) {
        this.mShineParams.shineDistanceMultiple = f4;
        return this;
    }

    public ShineButton setShineSize(int i4) {
        this.mShineParams.shineSize = i4;
        return this;
    }

    public ShineButton setShineTurnAngle(float f4) {
        this.mShineParams.shineTurnAngle = f4;
        return this;
    }

    public ShineButton setSmallShineColor(int i4) {
        this.mShineParams.smallShineColor = i4;
        return this;
    }

    public ShineButton setSmallShineOffAngle(float f4) {
        this.mShineParams.smallShineOffsetAngle = f4;
        return this;
    }

    public void showAnim() {
        if (getWindow() != null) {
            ShineView shineView = new ShineView(getContext(), this, this.mShineParams);
            ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
            if (this.mIsDialog) {
                View viewFindViewById = viewGroup.findViewById(R.id.content);
                viewGroup.addView(shineView, new ViewGroup.LayoutParams(viewFindViewById.getWidth(), viewFindViewById.getHeight()));
            } else {
                viewGroup.addView(shineView, new ViewGroup.LayoutParams(viewGroup.getWidth(), viewGroup.getHeight()));
            }
            doShareAnim();
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    public ShineButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2042R.attr.ShineButtonStyle);
    }

    private void setChecked(boolean z3, boolean z4, boolean z5) {
        this.mIsChecked = z3;
        if (z3) {
            setTintColor(this.mCheckedColor);
            this.mIsChecked = true;
            if (z4) {
                showAnim();
            }
        } else {
            setTintColor(this.mNormalColor);
            this.mIsChecked = false;
            if (z4) {
                setCancel();
            }
        }
        if (z5) {
            onCheckedChanged(z3);
        }
    }

    public ShineButton(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mIsChecked = false;
        this.mShineParams = new ShineView.ShineParams();
        initButton(context, attributeSet);
    }

    public void initWindow(Window window) {
        this.mWindow = new WeakReference<>(window);
        OnClickListenWrapper onClickListenWrapper = new OnClickListenWrapper();
        this.mOnClickListenWrapper = onClickListenWrapper;
        setOnClickListener(onClickListenWrapper);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z3) {
        setChecked(z3, false, false);
    }
}
