package com.xuexiang.xui.widget.progress;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.DensityUtils;
import com.xuexiang.xui.utils.ThemeUtils;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import com.zykj.download.OssUtils;

/* loaded from: classes.dex */
public class HorizontalProgressView extends View {
    public static final int ACCELERATE_DECELERATE_INTERPOLATOR = 0;
    public static final int ACCELERATE_INTERPOLATOR = 2;
    public static final int DECELERATE_INTERPOLATOR = 3;
    public static final int LINEAR_INTERPOLATOR = 1;
    public static final int OVERSHOOT_INTERPOLATOR = 4;
    private HorizontalProgressUpdateListener animatorUpdateListener;
    private boolean isTextMoved;
    private int mAnimateType;
    private int mCornerRadius;
    private int mEndColor;
    private float mEndProgress;
    private Interpolator mInterpolator;
    private int mProgressDuration;
    private int mProgressTextColor;
    private int mProgressTextSize;
    private RectF mRect;
    private LinearGradient mShader;
    private int mStartColor;
    private float mStartProgress;
    private int mTextPaddingBottomOffset;
    private int mTrackColor;
    private RectF mTrackRect;
    private int mTrackWidth;
    private float moveProgress;
    private ObjectAnimator progressAnimator;
    private Paint progressPaint;
    private boolean textVisibility;
    private boolean trackEnabled;

    public interface HorizontalProgressUpdateListener {
        void onHorizontalProgressFinished(View view);

        void onHorizontalProgressStart(View view);

        void onHorizontalProgressUpdate(View view, float f4);
    }

    public HorizontalProgressView(Context context) {
        this(context, null);
    }

    private void drawProgressText(Canvas canvas) {
        if (this.textVisibility) {
            Paint paint = new Paint(1);
            paint.setStyle(Paint.Style.FILL);
            paint.setTextSize(this.mProgressTextSize);
            paint.setColor(this.mProgressTextColor);
            paint.setTextAlign(Paint.Align.CENTER);
            String str = ((int) this.moveProgress) + "%";
            if (this.isTextMoved) {
                canvas.drawText(str, ((((getWidth() - getPaddingLeft()) - getPaddingRight()) - DensityUtils.dp2px(getContext(), 28.0f)) * (this.moveProgress / 100.0f)) + DensityUtils.dp2px(getContext(), 10.0f), ((getHeight() / 2.0f) - getPaddingTop()) - this.mTextPaddingBottomOffset, paint);
            } else {
                canvas.drawText(str, (getWidth() - getPaddingLeft()) / 2.0f, ((getHeight() / 2.0f) - getPaddingTop()) - this.mTextPaddingBottomOffset, paint);
            }
        }
    }

    private void drawTrack(Canvas canvas) {
        if (this.trackEnabled) {
            this.progressPaint.setShader(null);
            this.progressPaint.setColor(this.mTrackColor);
            RectF rectF = this.mTrackRect;
            int i4 = this.mCornerRadius;
            canvas.drawRoundRect(rectF, i4, i4, this.progressPaint);
        }
    }

    private void init() {
        Paint paint = new Paint(1);
        this.progressPaint = paint;
        paint.setStyle(Paint.Style.FILL);
    }

    private void obtainAttrs(Context context, AttributeSet attributeSet, int i4) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.HorizontalProgressView, i4, 0);
        this.mStartProgress = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.HorizontalProgressView_hpv_start_progress, 0);
        this.mEndProgress = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.HorizontalProgressView_hpv_end_progress, 60);
        this.mStartColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.HorizontalProgressView_hpv_start_color, getResources().getColor(C2042R.color.xui_config_color_light_orange));
        this.mEndColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.HorizontalProgressView_hpv_end_color, getResources().getColor(C2042R.color.xui_config_color_dark_orange));
        this.trackEnabled = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.HorizontalProgressView_hpv_isTracked, false);
        this.mProgressTextColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.HorizontalProgressView_hpv_progress_textColor, ThemeUtils.getMainThemeColor(getContext()));
        this.mProgressTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.HorizontalProgressView_hpv_progress_textSize, getResources().getDimensionPixelSize(C2042R.dimen.default_pv_horizontal_text_size));
        this.mTrackWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.HorizontalProgressView_hpv_track_width, getResources().getDimensionPixelSize(C2042R.dimen.default_pv_trace_width));
        this.mAnimateType = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.HorizontalProgressView_hpv_animate_type, 0);
        this.mTrackColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.HorizontalProgressView_hpv_track_color, getResources().getColor(C2042R.color.default_pv_track_color));
        this.textVisibility = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.HorizontalProgressView_hpv_progress_textVisibility, true);
        this.mProgressDuration = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.HorizontalProgressView_hpv_progress_duration, 1200);
        int i5 = C2042R.styleable.HorizontalProgressView_hpv_corner_radius;
        Resources resources = getResources();
        int i6 = C2042R.dimen.default_pv_corner_radius;
        this.mCornerRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(i5, resources.getDimensionPixelSize(i6));
        this.mTextPaddingBottomOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.HorizontalProgressView_hpv_text_padding_bottom, getResources().getDimensionPixelSize(i6));
        this.isTextMoved = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.HorizontalProgressView_hpv_text_movedEnable, true);
        typedArrayObtainStyledAttributes.recycle();
        this.moveProgress = this.mStartProgress;
        setAnimateType(this.mAnimateType);
    }

    private void refreshTheView() {
        invalidate();
    }

    private void setObjectAnimatorType(int i4) {
        if (i4 == 0) {
            if (this.mInterpolator != null) {
                this.mInterpolator = null;
            }
            this.mInterpolator = new AccelerateDecelerateInterpolator();
            return;
        }
        if (i4 == 1) {
            if (this.mInterpolator != null) {
                this.mInterpolator = null;
            }
            this.mInterpolator = new LinearInterpolator();
            return;
        }
        if (i4 == 2) {
            if (this.mInterpolator != null) {
                this.mInterpolator = null;
                this.mInterpolator = new AccelerateInterpolator();
                return;
            }
            return;
        }
        if (i4 == 3) {
            if (this.mInterpolator != null) {
                this.mInterpolator = null;
            }
            this.mInterpolator = new DecelerateInterpolator();
        } else {
            if (i4 != 4) {
                return;
            }
            if (this.mInterpolator != null) {
                this.mInterpolator = null;
            }
            this.mInterpolator = new OvershootInterpolator();
        }
    }

    private void updateTheTrack() {
        this.mRect = new RectF(getPaddingLeft() + ((this.mStartProgress * (((getWidth() - getPaddingLeft()) - getPaddingRight()) + 60)) / 100.0f), (getHeight() / 2.0f) - getPaddingTop(), ((getWidth() - getPaddingRight()) - 20) * (this.moveProgress / 100.0f), (getHeight() / 2.0f) + getPaddingTop() + this.mTrackWidth);
        this.mTrackRect = new RectF(getPaddingLeft(), (getHeight() / 2.0f) - getPaddingTop(), (getWidth() - getPaddingRight()) - 20, (getHeight() / 2.0f) + getPaddingTop() + this.mTrackWidth);
    }

    public float getProgress() {
        return this.moveProgress;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        updateTheTrack();
        drawTrack(canvas);
        this.progressPaint.setShader(this.mShader);
        RectF rectF = this.mRect;
        int i4 = this.mCornerRadius;
        canvas.drawRoundRect(rectF, i4, i4, this.progressPaint);
        drawProgressText(canvas);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        this.mShader = new LinearGradient(getPaddingLeft() - 50, (getHeight() - getPaddingTop()) - 50, getWidth() - getPaddingRight(), (getHeight() / 2.0f) + getPaddingTop() + this.mTrackWidth, this.mStartColor, this.mEndColor, Shader.TileMode.CLAMP);
    }

    public void setAnimateType(int i4) {
        this.mAnimateType = i4;
        setObjectAnimatorType(i4);
    }

    public void setEndColor(int i4) {
        this.mEndColor = i4;
        this.mShader = new LinearGradient(getPaddingLeft() - 50, (getHeight() - getPaddingTop()) - 50, getWidth() - getPaddingRight(), this.mTrackWidth + (getHeight() / 2.0f) + getPaddingTop(), this.mStartColor, this.mEndColor, Shader.TileMode.CLAMP);
        refreshTheView();
    }

    public void setEndProgress(float f4) {
        if (f4 < IGoodView.DEFAULT_TO_ALPHA || f4 > 100.0f) {
            throw new IllegalArgumentException("Illegal progress value, please change it!");
        }
        this.mEndProgress = f4;
        refreshTheView();
    }

    public void setProgress(float f4) {
        this.moveProgress = f4;
        refreshTheView();
    }

    public void setProgressCornerRadius(int i4) {
        this.mCornerRadius = DensityUtils.dp2px(getContext(), i4);
        refreshTheView();
    }

    public void setProgressDuration(int i4) {
        this.mProgressDuration = i4;
    }

    public void setProgressTextColor(int i4) {
        this.mProgressTextColor = i4;
    }

    public void setProgressTextMoved(boolean z3) {
        this.isTextMoved = z3;
    }

    public void setProgressTextPaddingBottom(int i4) {
        this.mTextPaddingBottomOffset = DensityUtils.dp2px(getContext(), i4);
    }

    public void setProgressTextSize(int i4) {
        this.mProgressTextSize = DensityUtils.sp2px(getContext(), i4);
        refreshTheView();
    }

    public void setProgressTextVisibility(boolean z3) {
        this.textVisibility = z3;
        refreshTheView();
    }

    public void setProgressViewUpdateListener(HorizontalProgressUpdateListener horizontalProgressUpdateListener) {
        this.animatorUpdateListener = horizontalProgressUpdateListener;
    }

    public void setStartColor(int i4) {
        this.mStartColor = i4;
        this.mShader = new LinearGradient(getPaddingLeft() - 50, (getHeight() - getPaddingTop()) - 50, getWidth() - getPaddingRight(), this.mTrackWidth + (getHeight() / 2.0f) + getPaddingTop(), this.mStartColor, this.mEndColor, Shader.TileMode.CLAMP);
        refreshTheView();
    }

    public void setStartProgress(float f4) {
        if (f4 < IGoodView.DEFAULT_TO_ALPHA || f4 > 100.0f) {
            throw new IllegalArgumentException("Illegal progress value, please change it!");
        }
        this.mStartProgress = f4;
        this.moveProgress = f4;
        refreshTheView();
    }

    public void setTrackColor(int i4) {
        this.mTrackColor = i4;
        refreshTheView();
    }

    public void setTrackEnabled(boolean z3) {
        this.trackEnabled = z3;
        refreshTheView();
    }

    public void setTrackWidth(int i4) {
        this.mTrackWidth = DensityUtils.dp2px(getContext(), i4);
        refreshTheView();
    }

    public void startProgressAnimation() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, OssUtils.PROGRESS, this.mStartProgress, this.mEndProgress);
        this.progressAnimator = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setInterpolator(this.mInterpolator);
        this.progressAnimator.setDuration(this.mProgressDuration);
        this.progressAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.xuexiang.xui.widget.progress.HorizontalProgressView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue(OssUtils.PROGRESS)).floatValue();
                if (HorizontalProgressView.this.animatorUpdateListener != null) {
                    HorizontalProgressView.this.animatorUpdateListener.onHorizontalProgressUpdate(HorizontalProgressView.this, fFloatValue);
                }
            }
        });
        this.progressAnimator.addListener(new Animator.AnimatorListener() { // from class: com.xuexiang.xui.widget.progress.HorizontalProgressView.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (HorizontalProgressView.this.animatorUpdateListener != null) {
                    HorizontalProgressView.this.animatorUpdateListener.onHorizontalProgressFinished(HorizontalProgressView.this);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                if (HorizontalProgressView.this.animatorUpdateListener != null) {
                    HorizontalProgressView.this.animatorUpdateListener.onHorizontalProgressStart(HorizontalProgressView.this);
                }
            }
        });
        this.progressAnimator.start();
    }

    public void stopProgressAnimation() {
        ObjectAnimator objectAnimator = this.progressAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.progressAnimator = null;
        }
    }

    public HorizontalProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2042R.attr.HorizontalProgressViewStyle);
    }

    public HorizontalProgressView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mAnimateType = 0;
        this.mStartProgress = IGoodView.DEFAULT_TO_ALPHA;
        this.mEndProgress = 60.0f;
        this.mStartColor = getResources().getColor(C2042R.color.xui_config_color_light_orange);
        this.mEndColor = getResources().getColor(C2042R.color.xui_config_color_dark_orange);
        this.trackEnabled = false;
        this.mTrackWidth = 6;
        this.mProgressTextSize = 48;
        this.mTrackColor = getResources().getColor(C2042R.color.default_pv_track_color);
        this.mProgressDuration = 1200;
        this.textVisibility = true;
        this.mCornerRadius = 30;
        this.mTextPaddingBottomOffset = 5;
        this.isTextMoved = true;
        this.moveProgress = IGoodView.DEFAULT_TO_ALPHA;
        obtainAttrs(context, attributeSet, i4);
        init();
    }
}
