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
import androidx.core.view.ViewCompat;
import com.google.android.material.C4853R;
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
        void onActionUp(@FloatRange(from = 0.0d, m58to = 360.0d) float f6, boolean z6);
    }

    public interface OnRotateListener {
        void onRotate(@FloatRange(from = 0.0d, m58to = 360.0d) float f6, boolean z6);
    }

    public ClockHandView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public static /* synthetic */ void m3700a(ClockHandView clockHandView, ValueAnimator valueAnimator) {
        clockHandView.getClass();
        clockHandView.setHandRotationInternal(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    private void adjustLevel(float f6, float f7) {
        this.currentLevel = MathUtils.dist((float) (getWidth() / 2), (float) (getHeight() / 2), f6, f7) > ((float) getLeveledCircleRadius(2)) + ViewUtils.dpToPx(getContext(), 12) ? 1 : 2;
    }

    private void drawSelector(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f6 = width;
        float leveledCircleRadius = getLeveledCircleRadius(this.currentLevel);
        float fCos = (((float) Math.cos(this.degRad)) * leveledCircleRadius) + f6;
        float f7 = height;
        float fSin = (leveledCircleRadius * ((float) Math.sin(this.degRad))) + f7;
        this.paint.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.selectorRadius, this.paint);
        double dSin = Math.sin(this.degRad);
        double dCos = Math.cos(this.degRad);
        this.paint.setStrokeWidth(this.selectorStrokeWidth);
        canvas.drawLine(f6, f7, width + ((int) (dCos * d)), height + ((int) (d * dSin)), this.paint);
        canvas.drawCircle(f6, f7, this.centerDotRadius, this.paint);
    }

    private int getDegreesFromXY(float f6, float f7) {
        int degrees = (int) Math.toDegrees(Math.atan2(f7 - (getHeight() / 2), f6 - (getWidth() / 2)));
        int i6 = degrees + 90;
        return i6 < 0 ? degrees + 450 : i6;
    }

    @Dimension
    private int getLeveledCircleRadius(int i6) {
        return i6 == 2 ? Math.round(this.circleRadius * 0.66f) : this.circleRadius;
    }

    private Pair<Float, Float> getValuesForAnimation(float f6) {
        float handRotation = getHandRotation();
        if (Math.abs(handRotation - f6) > 180.0f) {
            if (handRotation > 180.0f && f6 < 180.0f) {
                f6 += 360.0f;
            }
            if (handRotation < 180.0f && f6 > 180.0f) {
                handRotation += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(handRotation), Float.valueOf(f6));
    }

    private boolean handleTouchInput(float f6, float f7, boolean z6, boolean z7, boolean z8) {
        float degreesFromXY = getDegreesFromXY(f6, f7);
        boolean z9 = false;
        boolean z10 = getHandRotation() != degreesFromXY;
        if (z7 && z10) {
            return true;
        }
        if (!z10 && !z6) {
            return false;
        }
        if (z8 && this.animatingOnTouchUp) {
            z9 = true;
        }
        setHandRotation(degreesFromXY, z9);
        return true;
    }

    private void setHandRotationInternal(@FloatRange(from = 0.0d, m58to = 360.0d) float f6, boolean z6) {
        float f7 = f6 % 360.0f;
        this.originalDeg = f7;
        this.degRad = Math.toRadians(f7 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float leveledCircleRadius = getLeveledCircleRadius(this.currentLevel);
        float fCos = width + (((float) Math.cos(this.degRad)) * leveledCircleRadius);
        float fSin = height + (leveledCircleRadius * ((float) Math.sin(this.degRad)));
        RectF rectF = this.selectorBox;
        int i6 = this.selectorRadius;
        rectF.set(fCos - i6, fSin - i6, fCos + i6, fSin + i6);
        Iterator<OnRotateListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onRotate(f7, z6);
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

    @FloatRange(from = 0.0d, m58to = 360.0d)
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
    public void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        super.onLayout(z6, i6, i7, i8, i9);
        if (this.rotationAnimator.isRunning()) {
            return;
        }
        setHandRotation(getHandRotation());
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z6;
        boolean z7;
        boolean z8;
        OnActionUpListener onActionUpListener;
        int actionMasked = motionEvent.getActionMasked();
        float x6 = motionEvent.getX();
        float y6 = motionEvent.getY();
        if (actionMasked == 0) {
            this.downX = x6;
            this.downY = y6;
            this.isInTapRegion = true;
            this.changedDuringTouch = false;
            z6 = true;
            z7 = false;
            z8 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i6 = (int) (x6 - this.downX);
            int i7 = (int) (y6 - this.downY);
            this.isInTapRegion = (i6 * i6) + (i7 * i7) > this.scaledTouchSlop;
            z7 = this.changedDuringTouch;
            boolean z9 = actionMasked == 1;
            if (this.isMultiLevel) {
                adjustLevel(x6, y6);
            }
            z8 = z9;
            z6 = false;
        } else {
            z7 = false;
            z6 = false;
            z8 = false;
        }
        boolean zHandleTouchInput = this.changedDuringTouch | handleTouchInput(x6, y6, z7, z6, z8);
        this.changedDuringTouch = zHandleTouchInput;
        if (zHandleTouchInput && z8 && (onActionUpListener = this.onActionUpListener) != null) {
            onActionUpListener.onActionUp(getDegreesFromXY(x6, y6), this.isInTapRegion);
        }
        return true;
    }

    public void setAnimateOnTouchUp(boolean z6) {
        this.animatingOnTouchUp = z6;
    }

    public void setCircleRadius(@Dimension int i6) {
        this.circleRadius = i6;
        invalidate();
    }

    public void setCurrentLevel(int i6) {
        this.currentLevel = i6;
        invalidate();
    }

    public void setHandRotation(@FloatRange(from = 0.0d, m58to = 360.0d) float f6) {
        setHandRotation(f6, false);
    }

    public void setMultiLevel(boolean z6) {
        if (this.isMultiLevel && !z6) {
            this.currentLevel = 1;
        }
        this.isMultiLevel = z6;
        invalidate();
    }

    public void setOnActionUpListener(OnActionUpListener onActionUpListener) {
        this.onActionUpListener = onActionUpListener;
    }

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C4853R.attr.materialClockStyle);
    }

    public void setHandRotation(@FloatRange(from = 0.0d, m58to = 360.0d) float f6, boolean z6) {
        ValueAnimator valueAnimator = this.rotationAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z6) {
            setHandRotationInternal(f6, false);
            return;
        }
        Pair<Float, Float> valuesForAnimation = getValuesForAnimation(f6);
        this.rotationAnimator.setFloatValues(((Float) valuesForAnimation.first).floatValue(), ((Float) valuesForAnimation.second).floatValue());
        this.rotationAnimator.setDuration(this.animationDuration);
        this.rotationAnimator.setInterpolator(this.animationInterpolator);
        this.rotationAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ClockHandView.m3700a(this.f3577a, valueAnimator2);
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

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.rotationAnimator = new ValueAnimator();
        this.listeners = new ArrayList();
        Paint paint = new Paint();
        this.paint = paint;
        this.selectorBox = new RectF();
        this.currentLevel = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4853R.styleable.ClockHandView, i6, C4853R.style.Widget_MaterialComponents_TimePicker_Clock);
        this.animationDuration = MotionUtils.resolveThemeDuration(context, C4853R.attr.motionDurationLong2, 200);
        this.animationInterpolator = MotionUtils.resolveThemeInterpolator(context, C4853R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        this.circleRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(C4853R.styleable.ClockHandView_materialCircleRadius, 0);
        this.selectorRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(C4853R.styleable.ClockHandView_selectorSize, 0);
        this.selectorStrokeWidth = getResources().getDimensionPixelSize(C4853R.dimen.material_clock_hand_stroke_width);
        this.centerDotRadius = r7.getDimensionPixelSize(C4853R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(C4853R.styleable.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        setHandRotation(0.0f);
        this.scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        ViewCompat.setImportantForAccessibility(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }
}
