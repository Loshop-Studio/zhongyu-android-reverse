package com.xuexiang.xui.widget.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.animation.ScaleAnimation;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.ResUtils;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class RippleView extends FrameLayout {
    private int HEIGHT;
    private int WIDTH;
    private boolean animationRunning;
    private Handler canvasHandler;
    private int durationEmpty;
    private int frameRate;
    private GestureDetector gestureDetector;
    private Boolean hasToZoom;
    private Boolean isCentered;
    private OnRippleCompleteListener onCompletionListener;
    private Bitmap originBitmap;
    private Paint paint;
    private float radiusMax;
    private int rippleAlpha;
    private int rippleColor;
    private int rippleDuration;
    private int ripplePadding;
    private Integer rippleType;
    private final Runnable runnable;
    private ScaleAnimation scaleAnimation;
    private int timer;
    private int timerEmpty;

    /* renamed from: x */
    private float f9681x;

    /* renamed from: y */
    private float f9682y;
    private int zoomDuration;
    private float zoomScale;

    public interface OnRippleCompleteListener {
        void onComplete(RippleView rippleView);
    }

    public enum RippleType {
        SIMPLE(0),
        DOUBLE(1),
        RECTANGLE(2);

        int type;

        RippleType(int i4) {
            this.type = i4;
        }
    }

    public RippleView(Context context) {
        this(context, null);
    }

    private void createAnimation(float f4, float f5) {
        if (!isEnabled() || this.animationRunning) {
            return;
        }
        if (this.hasToZoom.booleanValue()) {
            startAnimation(this.scaleAnimation);
        }
        this.radiusMax = Math.max(this.WIDTH, this.HEIGHT);
        if (this.rippleType.intValue() != 2) {
            this.radiusMax /= 2.0f;
        }
        this.radiusMax -= this.ripplePadding;
        if (this.isCentered.booleanValue() || this.rippleType.intValue() == 1) {
            this.f9681x = getMeasuredWidth() >> 1;
            this.f9682y = getMeasuredHeight() >> 1;
        } else {
            this.f9681x = f4;
            this.f9682y = f5;
        }
        this.animationRunning = true;
        if (this.rippleType.intValue() == 1 && this.originBitmap == null) {
            this.originBitmap = getDrawingCache(true);
        }
        invalidate();
    }

    private Bitmap getCircleBitmap(int i4) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.originBitmap.getWidth(), this.originBitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        float f4 = this.f9681x;
        float f5 = i4;
        float f6 = this.f9682y;
        Rect rect = new Rect((int) (f4 - f5), (int) (f6 - f5), (int) (f4 + f5), (int) (f6 + f5));
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawCircle(this.f9681x, this.f9682y, f5, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(this.originBitmap, rect, rect, paint);
        return bitmapCreateBitmap;
    }

    private void init(Context context, AttributeSet attributeSet, int i4) {
        initAttrs(context, attributeSet, i4);
        initPaint();
        this.gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: com.xuexiang.xui.widget.button.RippleView.2
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
                super.onLongPress(motionEvent);
                RippleView.this.animateRipple(motionEvent);
                RippleView.this.sendClickEvent(Boolean.TRUE);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                return true;
            }
        });
        setDrawingCacheEnabled(true);
        setClickable(true);
    }

    private void initAttrs(Context context, AttributeSet attributeSet, int i4) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.RippleView, i4, 0);
        this.rippleColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.RippleView_rv_color, ResUtils.getColor(C2042R.color.xui_config_color_white));
        this.rippleType = Integer.valueOf(typedArrayObtainStyledAttributes.getInt(C2042R.styleable.RippleView_rv_type, 0));
        this.hasToZoom = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.RippleView_rv_zoom, false));
        this.isCentered = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.RippleView_rv_centered, false));
        this.rippleDuration = typedArrayObtainStyledAttributes.getInteger(C2042R.styleable.RippleView_rv_rippleDuration, this.rippleDuration);
        this.frameRate = typedArrayObtainStyledAttributes.getInteger(C2042R.styleable.RippleView_rv_frameRate, this.frameRate);
        this.rippleAlpha = typedArrayObtainStyledAttributes.getInteger(C2042R.styleable.RippleView_rv_alpha, this.rippleAlpha);
        this.ripplePadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.RippleView_rv_ripplePadding, 0);
        this.canvasHandler = new Handler();
        this.zoomScale = typedArrayObtainStyledAttributes.getFloat(C2042R.styleable.RippleView_rv_zoomScale, 1.03f);
        this.zoomDuration = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.RippleView_rv_zoomDuration, 200);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void initPaint() {
        Paint paint = new Paint();
        this.paint = paint;
        paint.setAntiAlias(true);
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setColor(this.rippleColor);
        this.paint.setAlpha(this.rippleAlpha);
        setWillNotDraw(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendClickEvent(Boolean bool) {
        if (getParent() instanceof AdapterView) {
            AdapterView<?> adapterView = (AdapterView) getParent();
            int positionForView = adapterView.getPositionForView(this);
            long itemIdAtPosition = adapterView.getItemIdAtPosition(positionForView);
            if (bool.booleanValue()) {
                if (adapterView.getOnItemLongClickListener() != null) {
                    adapterView.getOnItemLongClickListener().onItemLongClick(adapterView, this, positionForView, itemIdAtPosition);
                }
            } else if (adapterView.getOnItemClickListener() != null) {
                adapterView.getOnItemClickListener().onItemClick(adapterView, this, positionForView, itemIdAtPosition);
            }
        }
    }

    public void animateRipple(MotionEvent motionEvent) {
        createAnimation(motionEvent.getX(), motionEvent.getY());
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.animationRunning) {
            canvas.save();
            int i4 = this.rippleDuration;
            int i5 = this.timer;
            int i6 = this.frameRate;
            if (i4 <= i5 * i6) {
                this.animationRunning = false;
                this.timer = 0;
                this.durationEmpty = -1;
                this.timerEmpty = 0;
                if (Build.VERSION.SDK_INT != 23) {
                    canvas.restore();
                }
                invalidate();
                OnRippleCompleteListener onRippleCompleteListener = this.onCompletionListener;
                if (onRippleCompleteListener != null) {
                    onRippleCompleteListener.onComplete(this);
                    return;
                }
                return;
            }
            this.canvasHandler.postDelayed(this.runnable, i6);
            if (this.timer == 0) {
                canvas.save();
            }
            canvas.drawCircle(this.f9681x, this.f9682y, this.radiusMax * ((this.timer * this.frameRate) / this.rippleDuration), this.paint);
            this.paint.setColor(Color.parseColor("#FFFF4444"));
            if (this.rippleType.intValue() == 1 && this.originBitmap != null) {
                int i7 = this.timer;
                int i8 = this.frameRate;
                float f4 = i7 * i8;
                int i9 = this.rippleDuration;
                if (f4 / i9 > 0.4f) {
                    if (this.durationEmpty == -1) {
                        this.durationEmpty = i9 - (i7 * i8);
                    }
                    int i10 = this.timerEmpty + 1;
                    this.timerEmpty = i10;
                    Bitmap circleBitmap = getCircleBitmap((int) (this.radiusMax * ((i10 * i8) / this.durationEmpty)));
                    canvas.drawBitmap(circleBitmap, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, this.paint);
                    circleBitmap.recycle();
                }
            }
            this.paint.setColor(this.rippleColor);
            if (this.rippleType.intValue() == 1) {
                float f5 = this.timer;
                int i11 = this.frameRate;
                if ((f5 * i11) / this.rippleDuration > 0.6f) {
                    Paint paint = this.paint;
                    int i12 = this.rippleAlpha;
                    paint.setAlpha((int) (i12 - (i12 * ((this.timerEmpty * i11) / this.durationEmpty))));
                } else {
                    this.paint.setAlpha(this.rippleAlpha);
                }
            } else {
                Paint paint2 = this.paint;
                int i13 = this.rippleAlpha;
                paint2.setAlpha((int) (i13 - (i13 * ((this.timer * this.frameRate) / this.rippleDuration))));
            }
            this.timer++;
        }
    }

    public int getFrameRate() {
        return this.frameRate;
    }

    public int getRippleAlpha() {
        return this.rippleAlpha;
    }

    public int getRippleColor() {
        return this.rippleColor;
    }

    public int getRippleDuration() {
        return this.rippleDuration;
    }

    public int getRipplePadding() {
        return this.ripplePadding;
    }

    public RippleType getRippleType() {
        return RippleType.values()[this.rippleType.intValue()];
    }

    public int getZoomDuration() {
        return this.zoomDuration;
    }

    public float getZoomScale() {
        return this.zoomScale;
    }

    public Boolean isCentered() {
        return this.isCentered;
    }

    public Boolean isZooming() {
        return this.hasToZoom;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        onTouchEvent(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        this.WIDTH = i4;
        this.HEIGHT = i5;
        float f4 = this.zoomScale;
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, f4, 1.0f, f4, i4 >> 1, i5 >> 1);
        this.scaleAnimation = scaleAnimation;
        scaleAnimation.setDuration(this.zoomDuration);
        this.scaleAnimation.setRepeatMode(2);
        this.scaleAnimation.setRepeatCount(1);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.gestureDetector.onTouchEvent(motionEvent)) {
            animateRipple(motionEvent);
            sendClickEvent(Boolean.FALSE);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCentered(Boolean bool) {
        this.isCentered = bool;
    }

    public void setFrameRate(int i4) {
        this.frameRate = i4;
    }

    public void setOnRippleCompleteListener(OnRippleCompleteListener onRippleCompleteListener) {
        this.onCompletionListener = onRippleCompleteListener;
    }

    public void setRippleAlpha(int i4) {
        this.rippleAlpha = i4;
    }

    public void setRippleColor(int i4) {
        this.rippleColor = getResources().getColor(i4);
    }

    public void setRippleDuration(int i4) {
        this.rippleDuration = i4;
    }

    public void setRipplePadding(int i4) {
        this.ripplePadding = i4;
    }

    public void setRippleType(RippleType rippleType) {
        this.rippleType = Integer.valueOf(rippleType.ordinal());
    }

    public void setZoomDuration(int i4) {
        this.zoomDuration = i4;
    }

    public void setZoomScale(float f4) {
        this.zoomScale = f4;
    }

    public void setZooming(Boolean bool) {
        this.hasToZoom = bool;
    }

    public RippleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2042R.attr.RippleViewStyle);
    }

    public void animateRipple(float f4, float f5) {
        createAnimation(f4, f5);
    }

    public RippleView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.frameRate = 10;
        this.rippleDuration = 400;
        this.rippleAlpha = 90;
        this.radiusMax = IGoodView.DEFAULT_TO_ALPHA;
        this.animationRunning = false;
        this.timer = 0;
        this.timerEmpty = 0;
        this.durationEmpty = -1;
        this.f9681x = -1.0f;
        this.f9682y = -1.0f;
        this.runnable = new Runnable() { // from class: com.xuexiang.xui.widget.button.RippleView.1
            @Override // java.lang.Runnable
            public void run() {
                RippleView.this.invalidate();
            }
        };
        init(context, attributeSet, i4);
    }
}
