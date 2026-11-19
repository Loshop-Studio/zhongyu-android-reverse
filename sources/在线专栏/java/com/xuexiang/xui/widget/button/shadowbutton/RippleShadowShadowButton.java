package com.xuexiang.xui.widget.button.shadowbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
public class RippleShadowShadowButton extends BaseShadowButton {
    private static final int RIPPLE_ALPHA = 47;
    private Path mPath;
    private RectF mRectF;
    private int mRippleAlpha;
    private int mRippleColor;
    private int mRippleDuration;
    private Paint mRipplePaint;
    private int mRippleRadius;
    private int mRoundRadius;
    private TimerTask mTask;
    private Timer mTimer;
    private float pointX;
    private float pointY;

    public RippleShadowShadowButton(Context context) {
        super(context);
    }

    private void drawFillCircle(Canvas canvas) {
        if (canvas == null || this.pointX < IGoodView.DEFAULT_TO_ALPHA || this.pointY < IGoodView.DEFAULT_TO_ALPHA) {
            return;
        }
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        float f4 = this.pointX;
        float fMax = Math.max(f4, Math.abs(width - f4));
        float f5 = this.pointY;
        float fMax2 = Math.max(f5, Math.abs(height - f5));
        float fSqrt = (float) Math.sqrt((fMax * fMax) + (fMax2 * fMax2));
        int i4 = this.mRippleRadius;
        if (i4 > fSqrt) {
            onCompleteDrawRipple();
            return;
        }
        this.mRippleRadius = (int) (i4 + ((fSqrt / this.mRippleDuration) * 35.0f));
        canvas.save();
        this.mPath.reset();
        canvas.clipPath(this.mPath);
        if (this.mShapeType == 0) {
            this.mPath.addCircle(width >> 1, height >> 1, this.mWidth >> 1, Path.Direction.CCW);
        } else {
            this.mRectF.set(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, this.mWidth, this.mHeight);
            Path path = this.mPath;
            RectF rectF = this.mRectF;
            int i5 = this.mRoundRadius;
            path.addRoundRect(rectF, i5, i5, Path.Direction.CCW);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipPath(this.mPath);
        } else {
            canvas.clipPath(this.mPath, Region.Op.REPLACE);
        }
        canvas.drawCircle(this.pointX, this.pointY, this.mRippleRadius, this.mRipplePaint);
        canvas.restore();
    }

    private void onCompleteDrawRipple() {
        if (this.mTimer != null) {
            TimerTask timerTask = this.mTask;
            if (timerTask != null) {
                timerTask.cancel();
            }
            this.mTimer.cancel();
        }
        this.mRippleRadius = 0;
    }

    private void onStartDrawRipple() {
        onCompleteDrawRipple();
        this.mTask = new TimerTask() { // from class: com.xuexiang.xui.widget.button.shadowbutton.RippleShadowShadowButton.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                RippleShadowShadowButton.this.postInvalidate();
            }
        };
        Timer timer = new Timer();
        this.mTimer = timer;
        timer.schedule(this.mTask, 0L, 30L);
    }

    public int getRippleAlpha() {
        return this.mRippleAlpha;
    }

    public int getRippleColor() {
        return this.mRippleColor;
    }

    public int getRippleDuration() {
        return this.mRippleDuration;
    }

    public int getRippleRadius() {
        return this.mRippleRadius;
    }

    public int getRoundRadius() {
        return this.mRoundRadius;
    }

    @Override // com.xuexiang.xui.widget.button.shadowbutton.BaseShadowButton
    protected void init(Context context, AttributeSet attributeSet) {
        super.init(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.ShadowButton);
        this.mRippleColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.ShadowButton_sb_ripple_color, getResources().getColor(C2042R.color.default_shadow_button_ripple_color));
        this.mRippleAlpha = typedArrayObtainStyledAttributes.getInteger(C2042R.styleable.ShadowButton_sb_ripple_alpha, 47);
        this.mRippleDuration = typedArrayObtainStyledAttributes.getInteger(C2042R.styleable.ShadowButton_sb_ripple_duration, 1000);
        this.mShapeType = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.ShadowButton_sb_shape_type, 1);
        this.mRoundRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.ShadowButton_sb_radius, getResources().getDimensionPixelSize(C2042R.dimen.default_shadow_button_radius));
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.mRipplePaint = paint;
        paint.setColor(this.mRippleColor);
        this.mRipplePaint.setAlpha(this.mRippleAlpha);
        this.mRipplePaint.setStyle(Paint.Style.FILL);
        this.mRipplePaint.setAntiAlias(true);
        this.mPath = new Path();
        this.mRectF = new RectF();
        this.pointX = -1.0f;
        this.pointY = -1.0f;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        onCompleteDrawRipple();
        super.onDetachedFromWindow();
    }

    @Override // com.xuexiang.xui.widget.button.shadowbutton.BaseShadowButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mRipplePaint == null) {
            return;
        }
        drawFillCircle(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.pointX = motionEvent.getX();
            this.pointY = motionEvent.getY();
            onStartDrawRipple();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setRippleAlpha(int i4) {
        this.mRippleAlpha = i4;
    }

    public void setRippleColor(int i4) {
        this.mRippleColor = i4;
    }

    public void setRippleDuration(int i4) {
        this.mRippleDuration = i4;
    }

    public void setRippleRadius(int i4) {
        this.mRippleRadius = i4;
    }

    public void setRoundRadius(int i4) {
        this.mRoundRadius = i4;
        invalidate();
    }

    public RippleShadowShadowButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public RippleShadowShadowButton(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}
