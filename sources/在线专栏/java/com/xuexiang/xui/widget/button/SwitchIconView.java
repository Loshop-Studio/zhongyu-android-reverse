package com.xuexiang.xui.widget.button;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Region;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.AppCompatImageView;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.ThemeUtils;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class SwitchIconView extends AppCompatImageView {
    private static final float DASH_THICKNESS_PART = 0.083333336f;
    private static final int DEFAULT_ANIMATION_DURATION = 300;
    private static final float DEFAULT_DISABLED_ALPHA = 0.5f;
    private static final float SIN_45 = (float) Math.sin(Math.toRadians(45.0d));
    private final long mAnimationDuration;
    private final Path mClipPath;
    private final ArgbEvaluator mColorEvaluator;
    private PorterDuffColorFilter mColorFilter;
    private final Point mDashEnd;
    private int mDashLengthXProjection;
    private int mDashLengthYProjection;
    private final Paint mDashPaint;
    private final Point mDashStart;
    private int mDashThickness;
    private final int mDashXStart;
    private final int mDashYStart;
    private final float mDisabledStateAlpha;
    private final int mDisabledStateColor;
    private boolean mEnabled;
    private float mFraction;
    private final int mIconTintColor;
    private final boolean mNoDash;

    static class SwitchIconSavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SwitchIconSavedState> CREATOR = new Parcelable.Creator<SwitchIconSavedState>() { // from class: com.xuexiang.xui.widget.button.SwitchIconView.SwitchIconSavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SwitchIconSavedState createFromParcel(Parcel parcel) {
                return new SwitchIconSavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SwitchIconSavedState[] newArray(int i4) {
                return new SwitchIconSavedState[i4];
            }
        };
        boolean iconEnabled;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.iconEnabled ? 1 : 0);
        }

        SwitchIconSavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SwitchIconSavedState(Parcel parcel) {
            super(parcel);
            this.iconEnabled = parcel.readInt() == 1;
        }
    }

    public SwitchIconView(Context context) {
        this(context, null);
    }

    private void animateToFraction(float f4) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.mFraction, f4);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.xuexiang.xui.widget.button.SwitchIconView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SwitchIconView.this.setFraction(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.setDuration(this.mAnimationDuration);
        valueAnimatorOfFloat.start();
    }

    private void drawDash(Canvas canvas) {
        float f4 = this.mFraction;
        Point point = this.mDashEnd;
        int i4 = point.x;
        Point point2 = this.mDashStart;
        int i5 = point2.x;
        float f5 = ((i4 - i5) * f4) + i5;
        int i6 = point.y;
        int i7 = point2.y;
        canvas.drawLine(i5, i7, f5, (f4 * (i6 - i7)) + i7, this.mDashPaint);
    }

    private void initDashCoordinates() {
        float f4 = SIN_45;
        int i4 = this.mDashThickness;
        float f5 = 1.5f * f4 * i4;
        float f6 = f4 * DEFAULT_DISABLED_ALPHA * i4;
        Point point = this.mDashStart;
        point.x = (int) (this.mDashXStart + f6);
        point.y = ((int) f5) + this.mDashYStart;
        Point point2 = this.mDashEnd;
        point2.x = (int) ((r3 + this.mDashLengthXProjection) - f5);
        point2.y = (int) ((r4 + this.mDashLengthYProjection) - f6);
    }

    private void postInvalidateOnAnimationCompat() {
        postInvalidateOnAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFraction(float f4) {
        this.mFraction = f4;
        updateColor(f4);
        updateAlpha(f4);
        updateClipPath();
        postInvalidateOnAnimationCompat();
    }

    private void updateAlpha(float f4) {
        float f5 = this.mDisabledStateAlpha;
        int i4 = (int) ((f5 + ((1.0f - f4) * (1.0f - f5))) * 255.0f);
        updateImageAlpha(i4);
        this.mDashPaint.setAlpha(i4);
    }

    private void updateClipPath() {
        float f4 = this.mDashThickness / SIN_45;
        this.mClipPath.reset();
        this.mClipPath.moveTo(this.mDashXStart, this.mDashYStart + f4);
        this.mClipPath.lineTo(this.mDashXStart + f4, this.mDashYStart);
        Path path = this.mClipPath;
        float f5 = this.mDashXStart;
        float f6 = this.mDashLengthXProjection;
        float f7 = this.mFraction;
        path.lineTo(f5 + (f6 * f7), (this.mDashYStart + (this.mDashLengthYProjection * f7)) - f4);
        Path path2 = this.mClipPath;
        float f8 = this.mDashXStart;
        float f9 = this.mDashLengthXProjection;
        float f10 = this.mFraction;
        path2.lineTo((f8 + (f9 * f10)) - f4, this.mDashYStart + (this.mDashLengthYProjection * f10));
    }

    private void updateColor(float f4) {
        int i4 = this.mIconTintColor;
        if (i4 != this.mDisabledStateColor) {
            int iIntValue = ((Integer) this.mColorEvaluator.evaluate(f4, Integer.valueOf(i4), Integer.valueOf(this.mDisabledStateColor))).intValue();
            updateImageColor(iIntValue);
            this.mDashPaint.setColor(iIntValue);
        }
    }

    private void updateImageAlpha(int i4) {
        setImageAlpha(i4);
    }

    private void updateImageColor(int i4) {
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i4, PorterDuff.Mode.SRC_IN);
        this.mColorFilter = porterDuffColorFilter;
        setColorFilter(porterDuffColorFilter);
    }

    public boolean isIconEnabled() {
        return this.mEnabled;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (!this.mNoDash) {
            drawDash(canvas);
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutPath(this.mClipPath);
            } else {
                canvas.clipPath(this.mClipPath, Region.Op.XOR);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SwitchIconSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SwitchIconSavedState switchIconSavedState = (SwitchIconSavedState) parcelable;
        super.onRestoreInstanceState(switchIconSavedState.getSuperState());
        boolean z3 = switchIconSavedState.iconEnabled;
        this.mEnabled = z3;
        setFraction(z3 ? IGoodView.DEFAULT_TO_ALPHA : 1.0f);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SwitchIconSavedState switchIconSavedState = new SwitchIconSavedState(super.onSaveInstanceState());
        switchIconSavedState.iconEnabled = this.mEnabled;
        return switchIconSavedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        this.mDashLengthXProjection = (i4 - getPaddingLeft()) - getPaddingRight();
        this.mDashLengthYProjection = (i5 - getPaddingTop()) - getPaddingBottom();
        int i8 = (int) (((this.mDashLengthXProjection + r2) * DASH_THICKNESS_PART) / 2.0f);
        this.mDashThickness = i8;
        this.mDashPaint.setStrokeWidth(i8);
        initDashCoordinates();
        updateClipPath();
    }

    public void setIconEnabled(boolean z3) {
        setIconEnabled(z3, true);
    }

    public void switchState() {
        switchState(true);
    }

    public SwitchIconView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2042R.attr.SwitchIconViewStyle);
    }

    public void setIconEnabled(boolean z3, boolean z4) {
        if (this.mEnabled == z3) {
            return;
        }
        switchState(z4);
    }

    public void switchState(boolean z3) {
        boolean z4 = this.mEnabled;
        float f4 = z4 ? 1.0f : IGoodView.DEFAULT_TO_ALPHA;
        this.mEnabled = !z4;
        if (z3) {
            animateToFraction(f4);
        } else {
            setFraction(f4);
            invalidate();
        }
    }

    public SwitchIconView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mColorEvaluator = new ArgbEvaluator();
        float f4 = IGoodView.DEFAULT_TO_ALPHA;
        this.mFraction = IGoodView.DEFAULT_TO_ALPHA;
        this.mDashStart = new Point();
        this.mDashEnd = new Point();
        setLayerType(1, null);
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, C2042R.styleable.SwitchIconView, 0, 0);
        try {
            int color = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.SwitchIconView_siv_tint_color, ThemeUtils.getMainThemeColor(context));
            this.mIconTintColor = color;
            this.mAnimationDuration = typedArrayObtainStyledAttributes.getInteger(C2042R.styleable.SwitchIconView_siv_animation_duration, 300);
            float f5 = typedArrayObtainStyledAttributes.getFloat(C2042R.styleable.SwitchIconView_siv_disabled_alpha, DEFAULT_DISABLED_ALPHA);
            this.mDisabledStateAlpha = f5;
            this.mDisabledStateColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.SwitchIconView_siv_disabled_color, color);
            this.mEnabled = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.SwitchIconView_siv_enabled, true);
            this.mNoDash = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.SwitchIconView_siv_no_dash, false);
            typedArrayObtainStyledAttributes.recycle();
            if (f5 >= IGoodView.DEFAULT_TO_ALPHA && f5 <= 1.0f) {
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                this.mColorFilter = porterDuffColorFilter;
                setColorFilter(porterDuffColorFilter);
                this.mDashXStart = getPaddingLeft();
                this.mDashYStart = getPaddingTop();
                Paint paint = new Paint(1);
                this.mDashPaint = paint;
                paint.setStyle(Paint.Style.STROKE);
                paint.setColor(color);
                this.mClipPath = new Path();
                initDashCoordinates();
                setFraction(this.mEnabled ? f4 : 1.0f);
                return;
            }
            throw new IllegalArgumentException("Wrong value for si_disabled_alpha [" + f5 + "]. Must be value from range [0, 1]");
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
