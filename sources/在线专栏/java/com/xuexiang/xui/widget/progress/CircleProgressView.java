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
import android.graphics.Path;
import android.graphics.PathDashPathEffect;
import android.graphics.PathEffect;
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
import com.xuexiang.xui.XUI;
import com.xuexiang.xui.utils.DensityUtils;
import com.xuexiang.xui.utils.ThemeUtils;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import com.zykj.download.OssUtils;

/* loaded from: classes.dex */
public class CircleProgressView extends View {
    public static final int ACCELERATE_DECELERATE_INTERPOLATOR = 0;
    public static final int ACCELERATE_INTERPOLATOR = 2;
    public static final int DECELERATE_INTERPOLATOR = 3;
    public static final int LINEAR_INTERPOLATOR = 1;
    public static final int OVERSHOOT_INTERPOLATOR = 4;
    private boolean circleBroken;
    private boolean fillEnabled;
    private boolean isGraduated;
    private int mAnimateType;
    private int mEndColor;
    private float mEndProgress;
    private Interpolator mInterpolator;
    private RectF mOval;
    private int mProgressDuration;
    private int mProgressTextColor;
    private int mProgressTextSize;
    private int mProgressWidth;
    private int mScaleZoneCornerRadius;
    private float mScaleZoneLength;
    private int mScaleZonePadding;
    private Path mScaleZonePath;
    private float mScaleZoneWidth;
    private LinearGradient mShader;
    private int mStartColor;
    private float mStartProgress;
    private int mTrackColor;
    private int mTrackWidth;
    private CircleProgressUpdateListener mUpdateListener;
    private float moveProgress;
    PathEffect pathEffect;
    private ObjectAnimator progressAnimator;
    private Paint progressPaint;
    private boolean textVisibility;
    private boolean trackEnabled;
    private Paint trackPaint;

    public interface CircleProgressUpdateListener {
        void onCircleProgressFinished(View view);

        void onCircleProgressStart(View view);

        void onCircleProgressUpdate(View view, float f4);
    }

    public CircleProgressView(Context context) {
        this(context, null);
    }

    private void drawProgress(Canvas canvas) {
        this.progressPaint.setShader(this.mShader);
        updateTheTrack();
        initProgressDrawing(canvas, this.fillEnabled);
    }

    private void drawProgressText(Canvas canvas) {
        if (this.textVisibility) {
            Paint paint = new Paint(1);
            paint.setStyle(Paint.Style.FILL);
            paint.setTextSize(this.mProgressTextSize);
            paint.setColor(this.mProgressTextColor);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(XUI.getDefaultTypeface());
            canvas.drawText(((int) this.moveProgress) + "%", ((getWidth() + getPaddingLeft()) - getPaddingRight()) >> 1, (((getHeight() + getPaddingTop()) - getPaddingBottom()) - (paint.descent() + paint.ascent())) / 2.0f, paint);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void drawScaleZones(boolean z3) {
        if (!z3) {
            this.pathEffect = null;
            this.progressPaint.setPathEffect(null);
        } else {
            if (this.pathEffect == null) {
                this.pathEffect = new PathDashPathEffect(this.mScaleZonePath, this.mScaleZonePadding, IGoodView.DEFAULT_TO_ALPHA, PathDashPathEffect.Style.ROTATE);
            }
            this.progressPaint.setPathEffect(this.pathEffect);
        }
    }

    private void drawTrack(Canvas canvas) {
        if (this.trackEnabled) {
            this.trackPaint.setShader(null);
            this.trackPaint.setColor(this.mTrackColor);
            initTrack(canvas, this.fillEnabled);
        }
    }

    private void init() {
        Paint paint = new Paint(1);
        this.progressPaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.progressPaint.setStrokeCap(Paint.Cap.ROUND);
        this.progressPaint.setStrokeWidth(this.mProgressWidth);
        Paint paint2 = new Paint(1);
        this.trackPaint = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.trackPaint.setStrokeCap(Paint.Cap.ROUND);
        this.trackPaint.setStrokeWidth(this.mTrackWidth);
        this.mScaleZonePath = new Path();
        drawScaleZones(this.isGraduated);
    }

    private void initProgressDrawing(Canvas canvas, boolean z3) {
        if (z3) {
            this.progressPaint.setStyle(Paint.Style.FILL);
        } else {
            this.progressPaint.setStyle(Paint.Style.STROKE);
        }
        if (this.circleBroken) {
            RectF rectF = this.mOval;
            float f4 = this.mStartProgress;
            canvas.drawArc(rectF, 135.0f + (f4 * 2.7f), (this.moveProgress - f4) * 2.7f, z3, this.progressPaint);
        } else {
            RectF rectF2 = this.mOval;
            float f5 = this.mStartProgress;
            canvas.drawArc(rectF2, (f5 * 3.6f) + 270.0f, (this.moveProgress - f5) * 3.6f, z3, this.progressPaint);
        }
    }

    private void initTrack(Canvas canvas, boolean z3) {
        if (z3) {
            this.trackPaint.setStyle(Paint.Style.FILL);
        } else {
            this.trackPaint.setStyle(Paint.Style.STROKE);
        }
        if (this.circleBroken) {
            canvas.drawArc(this.mOval, 135.0f, 270.0f, z3, this.trackPaint);
        } else {
            canvas.drawArc(this.mOval, 90.0f, 360.0f, z3, this.trackPaint);
        }
    }

    private void obtainAttrs(Context context, AttributeSet attributeSet, int i4) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.CircleProgressView, i4, 0);
        this.mStartProgress = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.CircleProgressView_cpv_start_progress, 0);
        this.mEndProgress = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.CircleProgressView_cpv_end_progress, 60);
        this.mStartColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.CircleProgressView_cpv_start_color, getResources().getColor(C2042R.color.xui_config_color_light_orange));
        this.mEndColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.CircleProgressView_cpv_end_color, getResources().getColor(C2042R.color.xui_config_color_dark_orange));
        this.fillEnabled = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.CircleProgressView_cpv_isFilled, false);
        this.trackEnabled = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.CircleProgressView_cpv_isTracked, false);
        this.circleBroken = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.CircleProgressView_cpv_circle_broken, false);
        this.mProgressTextColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.CircleProgressView_cpv_progress_textColor, ThemeUtils.getMainThemeColor(getContext()));
        this.mProgressTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.CircleProgressView_cpv_progress_textSize, getResources().getDimensionPixelSize(C2042R.dimen.default_pv_progress_text_size));
        int i5 = C2042R.styleable.CircleProgressView_cpv_track_width;
        Resources resources = getResources();
        int i6 = C2042R.dimen.default_pv_trace_width;
        this.mTrackWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(i5, resources.getDimensionPixelSize(i6));
        this.mProgressWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.CircleProgressView_cpv_progress_width, getResources().getDimensionPixelSize(i6));
        this.mAnimateType = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.CircleProgressView_cpv_animate_type, 0);
        this.mTrackColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.CircleProgressView_cpv_track_color, getResources().getColor(C2042R.color.default_pv_track_color));
        this.textVisibility = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.CircleProgressView_cpv_progress_textVisibility, true);
        this.mProgressDuration = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.CircleProgressView_cpv_progress_duration, 1200);
        this.mScaleZoneLength = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.CircleProgressView_cpv_scaleZone_length, getResources().getDimensionPixelSize(C2042R.dimen.default_pv_zone_length));
        this.mScaleZoneWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.CircleProgressView_cpv_scaleZone_width, getResources().getDimensionPixelSize(C2042R.dimen.default_pv_zone_width));
        this.mScaleZonePadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.CircleProgressView_cpv_scaleZone_padding, getResources().getDimensionPixelSize(C2042R.dimen.default_pv_zone_padding));
        this.mScaleZoneCornerRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.CircleProgressView_cpv_scaleZone_corner_radius, getResources().getDimensionPixelSize(C2042R.dimen.default_pv_zone_corner_radius));
        this.isGraduated = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.CircleProgressView_cpv_isGraduated, false);
        this.moveProgress = this.mStartProgress;
        typedArrayObtainStyledAttributes.recycle();
    }

    private void refreshTheView() {
        invalidate();
        requestLayout();
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
        if (this.mOval != null) {
            this.mOval = null;
        }
        this.mOval = new RectF(getPaddingLeft() + this.mTrackWidth, getPaddingTop() + this.mTrackWidth, (getWidth() - getPaddingRight()) - this.mTrackWidth, (getHeight() - getPaddingBottom()) - this.mTrackWidth);
    }

    public float getProgress() {
        return this.moveProgress;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawTrack(canvas);
        drawProgress(canvas);
        drawProgressText(canvas);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        updateTheTrack();
        RectF rectF = this.mOval;
        this.mShader = new LinearGradient(rectF.left - 200.0f, rectF.top - 200.0f, rectF.right + 20.0f, rectF.bottom + 20.0f, this.mStartColor, this.mEndColor, Shader.TileMode.CLAMP);
        RectF rectF2 = new RectF(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, this.mScaleZoneWidth, this.mScaleZoneLength);
        Path path = this.mScaleZonePath;
        int i8 = this.mScaleZoneCornerRadius;
        path.addRoundRect(rectF2, i8, i8, Path.Direction.CW);
    }

    public void setAnimateType(int i4) {
        this.mAnimateType = i4;
        setObjectAnimatorType(i4);
    }

    public void setCircleBroken(boolean z3) {
        this.circleBroken = z3;
        refreshTheView();
    }

    public void setEndColor(int i4) {
        this.mEndColor = i4;
        updateTheTrack();
        RectF rectF = this.mOval;
        this.mShader = new LinearGradient(rectF.left - 200.0f, rectF.top - 200.0f, rectF.right + 20.0f, 20.0f + rectF.bottom, this.mStartColor, this.mEndColor, Shader.TileMode.CLAMP);
        refreshTheView();
    }

    public void setEndProgress(float f4) {
        if (f4 < IGoodView.DEFAULT_TO_ALPHA || f4 > 100.0f) {
            throw new IllegalArgumentException("Illegal progress value, please change it!");
        }
        this.mEndProgress = f4;
        refreshTheView();
    }

    public void setFillEnabled(boolean z3) {
        this.fillEnabled = z3;
        refreshTheView();
    }

    public void setGraduatedEnabled(final boolean z3) {
        this.isGraduated = z3;
        post(new Runnable() { // from class: com.xuexiang.xui.widget.progress.CircleProgressView.1
            @Override // java.lang.Runnable
            public void run() {
                CircleProgressView.this.drawScaleZones(z3);
            }
        });
    }

    public void setProgress(float f4) {
        this.moveProgress = f4;
        refreshTheView();
    }

    public void setProgressDuration(int i4) {
        this.mProgressDuration = i4;
    }

    public void setProgressTextColor(int i4) {
        this.mProgressTextColor = i4;
    }

    public void setProgressTextSize(int i4) {
        this.mProgressTextSize = DensityUtils.sp2px(getContext(), i4);
        refreshTheView();
    }

    public void setProgressTextVisibility(boolean z3) {
        this.textVisibility = z3;
    }

    public void setProgressViewUpdateListener(CircleProgressUpdateListener circleProgressUpdateListener) {
        this.mUpdateListener = circleProgressUpdateListener;
    }

    public void setProgressWidth(int i4) {
        float f4 = i4;
        this.mProgressWidth = DensityUtils.dp2px(getContext(), f4);
        this.progressPaint.setStrokeWidth(f4);
        refreshTheView();
    }

    public void setScaleZoneCornerRadius(int i4) {
        this.mScaleZoneCornerRadius = DensityUtils.dp2px(getContext(), i4);
    }

    public void setScaleZoneLength(float f4) {
        this.mScaleZoneLength = DensityUtils.dp2px(getContext(), f4);
    }

    public void setScaleZonePadding(int i4) {
        this.mScaleZonePadding = DensityUtils.dp2px(getContext(), i4);
    }

    public void setScaleZoneWidth(float f4) {
        this.mScaleZoneWidth = DensityUtils.dp2px(getContext(), f4);
    }

    public void setStartColor(int i4) {
        this.mStartColor = i4;
        updateTheTrack();
        RectF rectF = this.mOval;
        this.mShader = new LinearGradient(rectF.left - 200.0f, rectF.top - 200.0f, rectF.right + 20.0f, 20.0f + rectF.bottom, this.mStartColor, this.mEndColor, Shader.TileMode.CLAMP);
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
        float f4 = i4;
        this.mTrackWidth = DensityUtils.dp2px(getContext(), f4);
        this.trackPaint.setStrokeWidth(f4);
        updateTheTrack();
        refreshTheView();
    }

    public void startProgressAnimation() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, OssUtils.PROGRESS, this.mStartProgress, this.mEndProgress);
        this.progressAnimator = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setInterpolator(this.mInterpolator);
        this.progressAnimator.setDuration(this.mProgressDuration);
        this.progressAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.xuexiang.xui.widget.progress.CircleProgressView.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue(OssUtils.PROGRESS)).floatValue();
                if (CircleProgressView.this.mUpdateListener != null) {
                    CircleProgressView.this.mUpdateListener.onCircleProgressUpdate(CircleProgressView.this, fFloatValue);
                }
            }
        });
        this.progressAnimator.addListener(new Animator.AnimatorListener() { // from class: com.xuexiang.xui.widget.progress.CircleProgressView.3
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (CircleProgressView.this.mUpdateListener != null) {
                    CircleProgressView.this.mUpdateListener.onCircleProgressFinished(CircleProgressView.this);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                if (CircleProgressView.this.mUpdateListener != null) {
                    CircleProgressView.this.mUpdateListener.onCircleProgressStart(CircleProgressView.this);
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

    public CircleProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2042R.attr.CircleProgressViewStyle);
    }

    public CircleProgressView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mAnimateType = 0;
        this.mStartProgress = IGoodView.DEFAULT_TO_ALPHA;
        this.mEndProgress = 60.0f;
        this.mStartColor = getResources().getColor(C2042R.color.xui_config_color_light_orange);
        this.mEndColor = getResources().getColor(C2042R.color.xui_config_color_dark_orange);
        this.mTrackColor = getResources().getColor(C2042R.color.default_pv_track_color);
        this.mProgressDuration = 1200;
        this.moveProgress = IGoodView.DEFAULT_TO_ALPHA;
        this.isGraduated = false;
        this.mScaleZoneCornerRadius = 0;
        obtainAttrs(context, attributeSet, i4);
        init();
    }
}
