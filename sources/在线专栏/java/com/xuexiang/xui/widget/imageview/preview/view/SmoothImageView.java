package com.xuexiang.xui.widget.imageview.preview.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.Utils;
import com.xuexiang.xui.widget.imageview.photoview.PhotoView;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class SmoothImageView extends PhotoView {
    private static final int MIN_TRANS_DEST = 5;
    private static int TRANSFORM_DURATION = 400;
    private int alpha;
    private OnAlphaChangeListener alphaChangeListener;
    private Transform animTransform;
    ValueAnimator animator;
    private int bitmapHeight;
    private int bitmapWidth;
    private int downX;
    private int downY;
    private Transform endTransform;
    private boolean isDownPhoto;
    private boolean isDrag;
    private boolean isMoved;
    private float mMaxTransScale;
    private Paint mPaint;
    private Status mStatus;
    private Transform markTransform;
    private Matrix matrix;
    private onTransformListener onTransformListener;
    private Transform startTransform;
    private Rect thumbRect;
    private OnTransformOutListener transformOutListener;
    private boolean transformStart;

    public interface OnAlphaChangeListener {
        void onAlphaChange(int i4);
    }

    public interface OnTransformOutListener {
        void onTransformOut();
    }

    public enum Status {
        STATE_NORMAL,
        STATE_IN,
        STATE_OUT,
        STATE_MOVE
    }

    private static class Transform implements Cloneable {
        int alpha;
        float height;
        float left;
        float scale;
        float top;
        float width;

        private Transform() {
        }

        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public Transform m10735clone() {
            try {
                return (Transform) super.clone();
            } catch (CloneNotSupportedException e4) {
                e4.printStackTrace();
                return null;
            }
        }
    }

    public interface onTransformListener {
        void onTransformCompleted(Status status);
    }

    public SmoothImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mStatus = Status.STATE_NORMAL;
        this.mMaxTransScale = 0.5f;
        this.isMoved = false;
        this.isDownPhoto = false;
        this.alpha = 0;
        initSmoothImageView();
    }

    private void changeTransform() {
        Transform transform = this.markTransform;
        if (transform != null) {
            Transform transformM10735clone = transform.m10735clone();
            transformM10735clone.top = this.markTransform.top + getTop();
            transformM10735clone.left = this.markTransform.left + getLeft();
            transformM10735clone.alpha = this.alpha;
            transformM10735clone.scale = this.markTransform.scale - ((1.0f - getScaleX()) * this.markTransform.scale);
            this.animTransform = transformM10735clone.m10735clone();
            this.endTransform = transformM10735clone.m10735clone();
        }
    }

    private void initSmoothImageView() {
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.mPaint.setColor(IGoodView.DEFAULT_TEXT_COLOR);
        this.matrix = new Matrix();
        setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    private void initTransform() {
        if (getDrawable() == null) {
            return;
        }
        if ((this.startTransform != null && this.endTransform != null && this.animTransform != null) || getWidth() == 0 || getHeight() == 0) {
            return;
        }
        if (getDrawable() instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) getDrawable()).getBitmap();
            this.bitmapWidth = bitmap.getWidth();
            this.bitmapHeight = bitmap.getHeight();
        } else if (getDrawable() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getDrawable();
            this.bitmapWidth = colorDrawable.getIntrinsicWidth();
            this.bitmapHeight = colorDrawable.getIntrinsicHeight();
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getDrawable().getIntrinsicWidth(), getDrawable().getIntrinsicHeight(), Bitmap.Config.RGB_565);
            this.bitmapWidth = bitmapCreateBitmap.getWidth();
            this.bitmapHeight = bitmapCreateBitmap.getHeight();
        }
        Transform transform = new Transform();
        this.startTransform = transform;
        transform.alpha = 0;
        if (this.thumbRect == null) {
            this.thumbRect = new Rect();
        }
        Transform transform2 = this.startTransform;
        Rect rect = this.thumbRect;
        transform2.left = rect.left;
        transform2.top = rect.top - Utils.getStatusBarHeight();
        this.startTransform.width = this.thumbRect.width();
        this.startTransform.height = this.thumbRect.height();
        this.startTransform.scale = Math.max(this.thumbRect.width() / this.bitmapWidth, this.thumbRect.height() / this.bitmapHeight);
        Transform transform3 = new Transform();
        this.endTransform = transform3;
        transform3.scale = Math.min(getWidth() / this.bitmapWidth, getHeight() / this.bitmapHeight);
        Transform transform4 = this.endTransform;
        transform4.alpha = 255;
        float f4 = transform4.scale;
        int i4 = (int) (this.bitmapWidth * f4);
        transform4.left = (getWidth() - i4) / 2.0f;
        this.endTransform.top = (getHeight() - r1) / 2.0f;
        Transform transform5 = this.endTransform;
        transform5.width = i4;
        transform5.height = (int) (f4 * this.bitmapHeight);
        Status status = this.mStatus;
        if (status == Status.STATE_IN) {
            this.animTransform = this.startTransform.m10735clone();
        } else if (status == Status.STATE_OUT) {
            this.animTransform = transform5.m10735clone();
        }
        this.markTransform = this.endTransform;
    }

    private float moveScale() {
        if (this.markTransform == null) {
            initTransform();
        }
        return Math.abs(getTop() / this.markTransform.height);
    }

    private void moveToOldPosition() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getTop(), 0);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView.1
            int startValue = 0;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i4 = this.startValue;
                if (i4 != 0) {
                    SmoothImageView.this.offsetTopAndBottom(iIntValue - i4);
                }
                this.startValue = iIntValue;
            }
        });
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(getLeft(), 0);
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView.2
            int startValue = 0;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i4 = this.startValue;
                if (i4 != 0) {
                    SmoothImageView.this.offsetLeftAndRight(iIntValue - i4);
                }
                this.startValue = iIntValue;
            }
        });
        ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(this.alpha, 255);
        valueAnimatorOfInt3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (SmoothImageView.this.alphaChangeListener != null) {
                    SmoothImageView.this.alphaChangeListener.onAlphaChange(((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(getScaleX(), 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                SmoothImageView.this.setScaleX(fFloatValue);
                SmoothImageView.this.setScaleY(fFloatValue);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(TRANSFORM_DURATION);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(valueAnimatorOfInt, valueAnimatorOfInt2, valueAnimatorOfFloat, valueAnimatorOfInt3);
        animatorSet.start();
    }

    public static void setDuration(int i4) {
        TRANSFORM_DURATION = i4;
    }

    private void startTransform() {
        this.transformStart = false;
        if (this.animTransform == null) {
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.animator = valueAnimator;
        valueAnimator.setDuration(TRANSFORM_DURATION);
        this.animator.setInterpolator(new AccelerateDecelerateInterpolator());
        Status status = this.mStatus;
        if (status == Status.STATE_IN) {
            this.animator.setValues(PropertyValuesHolder.ofFloat("animScale", this.startTransform.scale, this.endTransform.scale), PropertyValuesHolder.ofInt("animAlpha", this.startTransform.alpha, this.endTransform.alpha), PropertyValuesHolder.ofFloat("animLeft", this.startTransform.left, this.endTransform.left), PropertyValuesHolder.ofFloat("animTop", this.startTransform.top, this.endTransform.top), PropertyValuesHolder.ofFloat("animWidth", this.startTransform.width, this.endTransform.width), PropertyValuesHolder.ofFloat("animHeight", this.startTransform.height, this.endTransform.height));
        } else if (status == Status.STATE_OUT) {
            this.animator.setValues(PropertyValuesHolder.ofFloat("animScale", this.endTransform.scale, this.startTransform.scale), PropertyValuesHolder.ofInt("animAlpha", this.endTransform.alpha, this.startTransform.alpha), PropertyValuesHolder.ofFloat("animLeft", this.endTransform.left, this.startTransform.left), PropertyValuesHolder.ofFloat("animTop", this.endTransform.top, this.startTransform.top), PropertyValuesHolder.ofFloat("animWidth", this.endTransform.width, this.startTransform.width), PropertyValuesHolder.ofFloat("animHeight", this.endTransform.height, this.startTransform.height));
        }
        this.animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                SmoothImageView.this.animTransform.alpha = ((Integer) valueAnimator2.getAnimatedValue("animAlpha")).intValue();
                SmoothImageView.this.animTransform.scale = ((Float) valueAnimator2.getAnimatedValue("animScale")).floatValue();
                SmoothImageView.this.animTransform.left = ((Float) valueAnimator2.getAnimatedValue("animLeft")).floatValue();
                SmoothImageView.this.animTransform.top = ((Float) valueAnimator2.getAnimatedValue("animTop")).floatValue();
                SmoothImageView.this.animTransform.width = ((Float) valueAnimator2.getAnimatedValue("animWidth")).floatValue();
                SmoothImageView.this.animTransform.height = ((Float) valueAnimator2.getAnimatedValue("animHeight")).floatValue();
                SmoothImageView.this.invalidate();
            }
        });
        this.animator.addListener(new AnimatorListenerAdapter() { // from class: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (SmoothImageView.this.onTransformListener != null) {
                    SmoothImageView.this.onTransformListener.onTransformCompleted(SmoothImageView.this.mStatus);
                }
                if (SmoothImageView.this.mStatus == Status.STATE_IN) {
                    SmoothImageView.this.mStatus = Status.STATE_NORMAL;
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                SmoothImageView smoothImageView = SmoothImageView.this;
                int i4 = C2042R.id.item_image_key;
                if (smoothImageView.getTag(i4) != null) {
                    SmoothImageView.this.setTag(i4, null);
                    SmoothImageView.this.setOnLongClickListener(null);
                }
            }
        });
        this.animator.start();
    }

    public boolean checkMinScale() {
        if (getScale() == 1.0f) {
            return true;
        }
        setScale(1.0f, true);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.PhotoView, android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.bitmapWidth = 0;
        this.bitmapHeight = 0;
        this.thumbRect = null;
        this.mPaint = null;
        this.matrix = null;
        this.startTransform = null;
        this.endTransform = null;
        this.animTransform = null;
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.animator.clone();
            this.animator = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (getDrawable() == null) {
            return;
        }
        Status status = this.mStatus;
        if (status != Status.STATE_OUT && status != Status.STATE_IN) {
            if (status == Status.STATE_MOVE) {
                this.mPaint.setAlpha(0);
                canvas.drawPaint(this.mPaint);
                super.onDraw(canvas);
                return;
            } else {
                this.mPaint.setAlpha(255);
                canvas.drawPaint(this.mPaint);
                super.onDraw(canvas);
                return;
            }
        }
        if (this.startTransform == null || this.endTransform == null || this.animTransform == null) {
            initTransform();
        }
        Transform transform = this.animTransform;
        if (transform == null) {
            super.onDraw(canvas);
            return;
        }
        this.mPaint.setAlpha(transform.alpha);
        canvas.drawPaint(this.mPaint);
        int saveCount = canvas.getSaveCount();
        Matrix matrix = this.matrix;
        float f4 = this.animTransform.scale;
        matrix.setScale(f4, f4);
        float f5 = this.bitmapWidth;
        Transform transform2 = this.animTransform;
        float f6 = transform2.scale;
        this.matrix.postTranslate((-((f5 * f6) - transform2.width)) / 2.0f, (-((this.bitmapHeight * f6) - transform2.height)) / 2.0f);
        Transform transform3 = this.animTransform;
        canvas.translate(transform3.left, transform3.top);
        Transform transform4 = this.animTransform;
        canvas.clipRect(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, transform4.width, transform4.height);
        canvas.concat(this.matrix);
        getDrawable().draw(canvas);
        canvas.restoreToCount(saveCount);
        if (this.transformStart) {
            startTransform();
        }
    }

    public void setAlphaChangeListener(OnAlphaChangeListener onAlphaChangeListener) {
        this.alphaChangeListener = onAlphaChangeListener;
    }

    public void setDrag(boolean z3, float f4) {
        this.isDrag = z3;
        this.mMaxTransScale = f4;
    }

    public void setOnTransformListener(onTransformListener ontransformlistener) {
        this.onTransformListener = ontransformlistener;
    }

    public void setThumbRect(Rect rect) {
        this.thumbRect = rect;
    }

    public void setTransformOutListener(OnTransformOutListener onTransformOutListener) {
        this.transformOutListener = onTransformOutListener;
    }

    public void transformIn(onTransformListener ontransformlistener) {
        setOnTransformListener(ontransformlistener);
        this.transformStart = true;
        this.mStatus = Status.STATE_IN;
        invalidate();
    }

    public void transformOut(onTransformListener ontransformlistener) {
        if (getTop() != 0) {
            offsetTopAndBottom(-getTop());
        }
        if (getLeft() != 0) {
            offsetLeftAndRight(-getLeft());
        }
        if (getScaleX() != 1.0f) {
            setScaleX(1.0f);
            setScaleY(1.0f);
        }
        setOnTransformListener(ontransformlistener);
        this.transformStart = true;
        this.mStatus = Status.STATE_OUT;
        invalidate();
    }

    public SmoothImageView(Context context) {
        super(context);
        this.mStatus = Status.STATE_NORMAL;
        this.mMaxTransScale = 0.5f;
        this.isMoved = false;
        this.isDownPhoto = false;
        this.alpha = 0;
        initSmoothImageView();
    }
}
