package com.xuexiang.xui.widget.imageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.DensityUtils;
import com.xuexiang.xui.utils.ThemeUtils;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class SignatureView extends View {
    public static final float DEFAULT_PEN_SIZE = 10.0f;
    private int mBackColor;
    private Paint mBorderPaint;
    private int mBorderWidth;
    private Bitmap mCacheBitmap;
    private Canvas mCacheCanvas;
    private Paint mGesturePaint;
    private boolean mIsTouched;
    private Path mPath;
    private int mPenColor;
    private float mPenSize;

    /* renamed from: mX */
    private float f9690mX;

    /* renamed from: mY */
    private float f9691mY;

    public SignatureView(Context context) {
        super(context);
        this.mGesturePaint = new Paint();
        this.mPath = new Path();
        this.mIsTouched = false;
        this.mPenSize = 10.0f;
        this.mPenColor = IGoodView.DEFAULT_TEXT_COLOR;
        this.mBackColor = 0;
        initAttrs(context, null);
    }

    private void drawBorder(Canvas canvas) {
        if (this.mBorderPaint != null) {
            canvas.drawRect(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, getWidth(), getHeight(), this.mBorderPaint);
        }
    }

    private void initAttrs(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.SignatureView);
        this.mPenSize = typedArrayObtainStyledAttributes.getDimension(C2042R.styleable.SignatureView_stv_penSize, this.mPenSize);
        this.mPenColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.SignatureView_stv_penColor, IGoodView.DEFAULT_TEXT_COLOR);
        this.mBackColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.SignatureView_stv_backColor, 0);
        updateBorderStyle(typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.SignatureView_stv_hasBorder, false));
        typedArrayObtainStyledAttributes.recycle();
        initPaint();
    }

    private void initBorderPaintStyle() {
        Paint paint = this.mBorderPaint;
        if (paint != null) {
            paint.setAntiAlias(true);
            this.mBorderPaint.setStyle(Paint.Style.STROKE);
            this.mBorderPaint.setStrokeCap(Paint.Cap.ROUND);
            this.mBorderPaint.setStrokeWidth(this.mBorderWidth);
            this.mBorderPaint.setColor(IGoodView.DEFAULT_TEXT_COLOR);
            this.mBorderPaint.setColor(ThemeUtils.resolveColor(getContext(), C2042R.attr.xui_config_color_separator_dark));
        }
    }

    private void initPaint() {
        this.mGesturePaint.setAntiAlias(true);
        this.mGesturePaint.setDither(true);
        this.mGesturePaint.setStyle(Paint.Style.STROKE);
        this.mGesturePaint.setStrokeCap(Paint.Cap.ROUND);
        this.mGesturePaint.setStrokeWidth(this.mPenSize);
        this.mGesturePaint.setColor(this.mPenColor);
    }

    private void touchDown(MotionEvent motionEvent) {
        this.mPath.reset();
        float x3 = motionEvent.getX();
        float y3 = motionEvent.getY();
        this.f9690mX = x3;
        this.f9691mY = y3;
        this.mPath.moveTo(x3, y3);
    }

    private void touchMove(MotionEvent motionEvent) {
        float x3 = motionEvent.getX();
        float y3 = motionEvent.getY();
        float f4 = this.f9690mX;
        float f5 = this.f9691mY;
        float fAbs = Math.abs(x3 - f4);
        float fAbs2 = Math.abs(y3 - f5);
        if (fAbs >= 3.0f || fAbs2 >= 3.0f) {
            this.mPath.quadTo(f4, f5, (x3 + f4) / 2.0f, (y3 + f5) / 2.0f);
            this.f9690mX = x3;
            this.f9691mY = y3;
        }
    }

    private void touchUp() {
        Canvas canvas = this.mCacheCanvas;
        int i4 = this.mBorderWidth;
        canvas.translate(-i4, -i4);
        this.mCacheCanvas.drawPath(this.mPath, this.mGesturePaint);
        Canvas canvas2 = this.mCacheCanvas;
        int i5 = this.mBorderWidth;
        canvas2.translate(i5, i5);
        this.mPath.reset();
    }

    private void updateBorderStyle(boolean z3) {
        if (!z3) {
            this.mBorderPaint = null;
            this.mBorderWidth = 0;
        } else {
            this.mBorderPaint = new Paint();
            this.mBorderWidth = DensityUtils.dp2px(1.0f);
            initBorderPaintStyle();
        }
    }

    private void updateCacheCanvasSize() {
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        this.mCacheBitmap = Bitmap.createBitmap(getWidth() - (this.mBorderWidth * 2), getHeight() - (this.mBorderWidth * 2), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.mCacheBitmap);
        this.mCacheCanvas = canvas;
        canvas.drawColor(this.mBackColor);
        this.mIsTouched = false;
    }

    public void clear() {
        if (this.mCacheCanvas != null) {
            this.mIsTouched = false;
            this.mGesturePaint.setColor(this.mPenColor);
            int i4 = this.mBackColor;
            if (i4 == 0) {
                this.mCacheCanvas.drawColor(i4, PorterDuff.Mode.CLEAR);
            } else {
                this.mCacheCanvas.drawColor(i4);
            }
            this.mGesturePaint.setColor(this.mPenColor);
            invalidate();
        }
    }

    public SignatureView enableBorder(boolean z3) {
        updateBorderStyle(z3);
        updateCacheCanvasSize();
        return this;
    }

    public Bitmap getSnapshot() {
        return this.mCacheBitmap;
    }

    public boolean getTouched() {
        return this.mIsTouched;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawBorder(canvas);
        Bitmap bitmap = this.mCacheBitmap;
        int i4 = this.mBorderWidth;
        canvas.drawBitmap(bitmap, i4, i4, this.mGesturePaint);
        canvas.drawPath(this.mPath, this.mGesturePaint);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        updateCacheCanvasSize();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            touchDown(motionEvent);
        } else if (action == 1) {
            touchUp();
        } else if (action == 2) {
            this.mIsTouched = true;
            touchMove(motionEvent);
        }
        invalidate();
        return true;
    }

    public void recycle() {
        Bitmap bitmap = this.mCacheBitmap;
        if (bitmap != null) {
            bitmap.recycle();
            this.mCacheBitmap = null;
        }
        Canvas canvas = this.mCacheCanvas;
        if (canvas != null) {
            canvas.drawColor(this.mBackColor, PorterDuff.Mode.CLEAR);
            this.mCacheCanvas = null;
        }
        this.mGesturePaint = null;
        this.mPath = null;
    }

    public SignatureView setBackColor(int i4) {
        this.mBackColor = i4;
        Canvas canvas = this.mCacheCanvas;
        if (canvas != null) {
            canvas.drawColor(i4);
        }
        return this;
    }

    public SignatureView setPenColor(int i4) {
        this.mPenColor = i4;
        Paint paint = this.mGesturePaint;
        if (paint != null) {
            paint.setColor(i4);
        }
        return this;
    }

    public SignatureView setPenSize(float f4) {
        if (f4 <= IGoodView.DEFAULT_TO_ALPHA) {
            f4 = 10.0f;
        }
        this.mPenSize = f4;
        Paint paint = this.mGesturePaint;
        if (paint != null) {
            paint.setStrokeWidth(f4);
        }
        return this;
    }

    public SignatureView setViewSize(int i4, int i5) {
        setLayoutParams(new FrameLayout.LayoutParams(i4, i5));
        return this;
    }

    public SignatureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mGesturePaint = new Paint();
        this.mPath = new Path();
        this.mIsTouched = false;
        this.mPenSize = 10.0f;
        this.mPenColor = IGoodView.DEFAULT_TEXT_COLOR;
        this.mBackColor = 0;
        initAttrs(context, attributeSet);
    }

    public SignatureView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mGesturePaint = new Paint();
        this.mPath = new Path();
        this.mIsTouched = false;
        this.mPenSize = 10.0f;
        this.mPenColor = IGoodView.DEFAULT_TEXT_COLOR;
        this.mBackColor = 0;
        initAttrs(context, attributeSet);
    }
}
