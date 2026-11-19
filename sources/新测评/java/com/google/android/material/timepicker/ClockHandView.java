package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.Dimension;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.camera.video.AudioStats;
import androidx.core.view.ViewCompat;
import com.google.android.material.C5442R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.math.MathUtils;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
class ClockHandView extends View {
    private static final int DEFAULT_ANIMATION_DURATION = 200;
    private boolean animatingOnTouchUp;
    private final int animationDuration;
    private final TimeInterpolator animationInterpolator;
    private final float centerDotRadius;
    private boolean changedDuringTouch;
    private int circleRadius;
    private int currentLevel;
    private double degRad;
    private float downX;
    private float downY;
    private boolean isInTapRegion;
    private boolean isMultiLevel;
    private final List<OnRotateListener> listeners;
    private OnActionUpListener onActionUpListener;
    private float originalDeg;
    private final Paint paint;
    private final ValueAnimator rotationAnimator;
    private final int scaledTouchSlop;
    private final RectF selectorBox;
    private final int selectorRadius;

    @Px
    private final int selectorStrokeWidth;

    public interface OnActionUpListener {
        void onActionUp(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = 360.0d) float f10, boolean z9);
    }

    public interface OnRotateListener {
        void onRotate(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = 360.0d) float f10, boolean z9);
    }

    public ClockHandView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public static /* synthetic */ void m4268a(ClockHandView clockHandView, ValueAnimator valueAnimator) {
        clockHandView.getClass();
        clockHandView.setHandRotationInternal(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    private void adjustLevel(float f10, float f11) {
        this.currentLevel = MathUtils.dist((float) (getWidth() / 2), (float) (getHeight() / 2), f10, f11) > ((float) getLeveledCircleRadius(2)) + ViewUtils.dpToPx(getContext(), 12) ? 1 : 2;
    }

    private void drawSelector(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f10 = width;
        float leveledCircleRadius = getLeveledCircleRadius(this.currentLevel);
        float fCos = (((float) Math.cos(this.degRad)) * leveledCircleRadius) + f10;
        float f11 = height;
        float fSin = (leveledCircleRadius * ((float) Math.sin(this.degRad))) + f11;
        this.paint.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.selectorRadius, this.paint);
        double dSin = Math.sin(this.degRad);
        double dCos = Math.cos(this.degRad);
        this.paint.setStrokeWidth(this.selectorStrokeWidth);
        canvas.drawLine(f10, f11, width + ((int) (dCos * d)), height + ((int) (d * dSin)), this.paint);
        canvas.drawCircle(f10, f11, this.centerDotRadius, this.paint);
    }

    private int getDegreesFromXY(float f10, float f11) {
        int degrees = (int) Math.toDegrees(Math.atan2(f11 - (getHeight() / 2), f10 - (getWidth() / 2)));
        int i10 = degrees + 90;
        return i10 < 0 ? degrees + 450 : i10;
    }

    @Dimension
    private int getLeveledCircleRadius(int i10) {
        return i10 == 2 ? Math.round(this.circleRadius * 0.66f) : this.circleRadius;
    }

    private Pair<Float, Float> getValuesForAnimation(float f10) {
        float handRotation = getHandRotation();
        if (Math.abs(handRotation - f10) > 180.0f) {
            if (handRotation > 180.0f && f10 < 180.0f) {
                f10 += 360.0f;
            }
            if (handRotation < 180.0f && f10 > 180.0f) {
                handRotation += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(handRotation), Float.valueOf(f10));
    }

    private boolean handleTouchInput(float f10, float f11, boolean z9, boolean z10, boolean z11) {
        float degreesFromXY = getDegreesFromXY(f10, f11);
        boolean z12 = false;
        boolean z13 = getHandRotation() != degreesFromXY;
        if (z10 && z13) {
            return true;
        }
        if (!z13 && !z9) {
            return false;
        }
        if (z11 && this.animatingOnTouchUp) {
            z12 = true;
        }
        setHandRotation(degreesFromXY, z12);
        return true;
    }

    private void setHandRotationInternal(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = 360.0d) float f10, boolean z9) {
        float f11 = f10 % 360.0f;
        this.originalDeg = f11;
        this.degRad = Math.toRadians(f11 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float leveledCircleRadius = getLeveledCircleRadius(this.currentLevel);
        float fCos = width + (((float) Math.cos(this.degRad)) * leveledCircleRadius);
        float fSin = height + (leveledCircleRadius * ((float) Math.sin(this.degRad)));
        RectF rectF = this.selectorBox;
        int i10 = this.selectorRadius;
        rectF.set(fCos - i10, fSin - i10, fCos + i10, fSin + i10);
        Iterator<OnRotateListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onRotate(f11, z9);
        }
        invalidate();
    }

    public void addOnRotateListener(OnRotateListener onRotateListener) {
        this.listeners.add(onRotateListener);
    }

    public int getCurrentLevel() {
        return this.currentLevel;
    }

    public RectF getCurrentSelectorBox() {
        return this.selectorBox;
    }

    @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = 360.0d)
    public float getHandRotation() {
        return this.originalDeg;
    }

    public int getSelectorRadius() {
        return this.selectorRadius;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawSelector(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        if (this.rotationAnimator.isRunning()) {
            return;
        }
        setHandRotation(getHandRotation());
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        boolean z10;
        boolean z11;
        OnActionUpListener onActionUpListener;
        int actionMasked = motionEvent.getActionMasked();
        float x9 = motionEvent.getX();
        float y9 = motionEvent.getY();
        if (actionMasked == 0) {
            this.downX = x9;
            this.downY = y9;
            this.isInTapRegion = true;
            this.changedDuringTouch = false;
            z9 = true;
            z10 = false;
            z11 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i10 = (int) (x9 - this.downX);
            int i11 = (int) (y9 - this.downY);
            this.isInTapRegion = (i10 * i10) + (i11 * i11) > this.scaledTouchSlop;
            z10 = this.changedDuringTouch;
            boolean z12 = actionMasked == 1;
            if (this.isMultiLevel) {
                adjustLevel(x9, y9);
            }
            z11 = z12;
            z9 = false;
        } else {
            z10 = false;
            z9 = false;
            z11 = false;
        }
        boolean zHandleTouchInput = this.changedDuringTouch | handleTouchInput(x9, y9, z10, z9, z11);
        this.changedDuringTouch = zHandleTouchInput;
        if (zHandleTouchInput && z11 && (onActionUpListener = this.onActionUpListener) != null) {
            onActionUpListener.onActionUp(getDegreesFromXY(x9, y9), this.isInTapRegion);
        }
        return true;
    }

    public void setAnimateOnTouchUp(boolean z9) {
        this.animatingOnTouchUp = z9;
    }

    public void setCircleRadius(@Dimension int i10) {
        this.circleRadius = i10;
        invalidate();
    }

    public void setCurrentLevel(int i10) {
        this.currentLevel = i10;
        invalidate();
    }

    public void setHandRotation(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = 360.0d) float f10) {
        setHandRotation(f10, false);
    }

    public void setMultiLevel(boolean z9) {
        if (this.isMultiLevel && !z9) {
            this.currentLevel = 1;
        }
        this.isMultiLevel = z9;
        invalidate();
    }

    public void setOnActionUpListener(OnActionUpListener onActionUpListener) {
        this.onActionUpListener = onActionUpListener;
    }

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C5442R.attr.materialClockStyle);
    }

    public void setHandRotation(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = 360.0d) float f10, boolean z9) {
        ValueAnimator valueAnimator = this.rotationAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z9) {
            setHandRotationInternal(f10, false);
            return;
        }
        Pair<Float, Float> valuesForAnimation = getValuesForAnimation(f10);
        this.rotationAnimator.setFloatValues(((Float) valuesForAnimation.first).floatValue(), ((Float) valuesForAnimation.second).floatValue());
        this.rotationAnimator.setDuration(this.animationDuration);
        this.rotationAnimator.setInterpolator(this.animationInterpolator);
        this.rotationAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ClockHandView.m4268a(this.f4439a, valueAnimator2);
            }
        });
        this.rotationAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.timepicker.ClockHandView.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                animator.end();
            }
        });
        this.rotationAnimator.start();
    }

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.rotationAnimator = new ValueAnimator();
        this.listeners = new ArrayList();
        Paint paint = new Paint();
        this.paint = paint;
        this.selectorBox = new RectF();
        this.currentLevel = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5442R.styleable.ClockHandView, i10, C5442R.style.Widget_MaterialComponents_TimePicker_Clock);
        this.animationDuration = MotionUtils.resolveThemeDuration(context, C5442R.attr.motionDurationLong2, 200);
        this.animationInterpolator = MotionUtils.resolveThemeInterpolator(context, C5442R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        this.circleRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(C5442R.styleable.ClockHandView_materialCircleRadius, 0);
        this.selectorRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(C5442R.styleable.ClockHandView_selectorSize, 0);
        this.selectorStrokeWidth = getResources().getDimensionPixelSize(C5442R.dimen.material_clock_hand_stroke_width);
        this.centerDotRadius = r7.getDimensionPixelSize(C5442R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(C5442R.styleable.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        setHandRotation(0.0f);
        this.scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        ViewCompat.setImportantForAccessibility(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }
}
