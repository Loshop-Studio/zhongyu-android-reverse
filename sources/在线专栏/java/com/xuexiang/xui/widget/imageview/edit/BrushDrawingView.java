package com.xuexiang.xui.widget.imageview.edit;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.util.Iterator;
import java.util.Stack;

/* loaded from: classes.dex */
public class BrushDrawingView extends View {
    static final float DEFAULT_BRUSH_SIZE = 25.0f;
    static final float DEFAULT_ERASER_SIZE = 50.0f;
    static final int DEFAULT_OPACITY = 255;
    private static final float TOUCH_TOLERANCE = 4.0f;
    private boolean mBrushDrawMode;
    private float mBrushEraserSize;
    private float mBrushSize;
    private BrushViewChangeListener mBrushViewChangeListener;
    private Canvas mDrawCanvas;
    private final Paint mDrawPaint;
    private final Stack<LinePath> mDrawnPaths;
    private int mOpacity;
    private Path mPath;
    private final Stack<LinePath> mRedoPaths;
    private float mTouchX;
    private float mTouchY;

    public BrushDrawingView(Context context) {
        this(context, null);
    }

    private void refreshBrushDrawing() {
        this.mBrushDrawMode = true;
        setupPathAndPaint();
    }

    private void setupBrushDrawing() {
        setLayerType(2, null);
        this.mDrawPaint.setColor(IGoodView.DEFAULT_TEXT_COLOR);
        setupPathAndPaint();
        setVisibility(8);
    }

    private void setupPathAndPaint() {
        this.mPath = new Path();
        this.mDrawPaint.setAntiAlias(true);
        this.mDrawPaint.setDither(true);
        this.mDrawPaint.setStyle(Paint.Style.STROKE);
        this.mDrawPaint.setStrokeJoin(Paint.Join.ROUND);
        this.mDrawPaint.setStrokeCap(Paint.Cap.ROUND);
        this.mDrawPaint.setStrokeWidth(this.mBrushSize);
        this.mDrawPaint.setAlpha(this.mOpacity);
        this.mDrawPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
    }

    private void touchMove(float f4, float f5) {
        float fAbs = Math.abs(f4 - this.mTouchX);
        float fAbs2 = Math.abs(f5 - this.mTouchY);
        if (fAbs >= TOUCH_TOLERANCE || fAbs2 >= TOUCH_TOLERANCE) {
            Path path = this.mPath;
            float f6 = this.mTouchX;
            float f7 = this.mTouchY;
            path.quadTo(f6, f7, (f4 + f6) / 2.0f, (f5 + f7) / 2.0f);
            this.mTouchX = f4;
            this.mTouchY = f5;
        }
    }

    private void touchStart(float f4, float f5) {
        this.mRedoPaths.clear();
        this.mPath.reset();
        this.mPath.moveTo(f4, f5);
        this.mTouchX = f4;
        this.mTouchY = f5;
        BrushViewChangeListener brushViewChangeListener = this.mBrushViewChangeListener;
        if (brushViewChangeListener != null) {
            brushViewChangeListener.onStartDrawing();
        }
    }

    private void touchUp() {
        this.mPath.lineTo(this.mTouchX, this.mTouchY);
        this.mDrawCanvas.drawPath(this.mPath, this.mDrawPaint);
        this.mDrawnPaths.push(new LinePath(this.mPath, this.mDrawPaint));
        this.mPath = new Path();
        BrushViewChangeListener brushViewChangeListener = this.mBrushViewChangeListener;
        if (brushViewChangeListener != null) {
            brushViewChangeListener.onStopDrawing();
            this.mBrushViewChangeListener.onViewAdd(this);
        }
    }

    void brushEraser() {
        this.mBrushDrawMode = true;
        this.mDrawPaint.setStrokeWidth(this.mBrushEraserSize);
        this.mDrawPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    void clearAll() {
        this.mDrawnPaths.clear();
        this.mRedoPaths.clear();
        Canvas canvas = this.mDrawCanvas;
        if (canvas != null) {
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        invalidate();
    }

    int getBrushColor() {
        return this.mDrawPaint.getColor();
    }

    boolean getBrushDrawingMode() {
        return this.mBrushDrawMode;
    }

    float getBrushSize() {
        return this.mBrushSize;
    }

    Paint getDrawingPaint() {
        return this.mDrawPaint;
    }

    Pair<Stack<LinePath>, Stack<LinePath>> getDrawingPath() {
        return new Pair<>(this.mDrawnPaths, this.mRedoPaths);
    }

    float getEraserSize() {
        return this.mBrushEraserSize;
    }

    int getOpacity() {
        return this.mOpacity;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Iterator<LinePath> it = this.mDrawnPaths.iterator();
        while (it.hasNext()) {
            LinePath next = it.next();
            canvas.drawPath(next.getDrawPath(), next.getDrawPaint());
        }
        canvas.drawPath(this.mPath, this.mDrawPaint);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        this.mDrawCanvas = new Canvas(Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888));
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.mBrushDrawMode) {
            return false;
        }
        float x3 = motionEvent.getX();
        float y3 = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            touchStart(x3, y3);
        } else if (action == 1) {
            touchUp();
        } else if (action == 2) {
            touchMove(x3, y3);
        }
        invalidate();
        return true;
    }

    boolean redo() {
        if (!this.mRedoPaths.empty()) {
            this.mDrawnPaths.push(this.mRedoPaths.pop());
            invalidate();
        }
        BrushViewChangeListener brushViewChangeListener = this.mBrushViewChangeListener;
        if (brushViewChangeListener != null) {
            brushViewChangeListener.onViewAdd(this);
        }
        return !this.mRedoPaths.empty();
    }

    void setBrushColor(int i4) {
        this.mDrawPaint.setColor(i4);
        setBrushDrawingMode(true);
    }

    void setBrushDrawingMode(boolean z3) {
        this.mBrushDrawMode = z3;
        if (z3) {
            setVisibility(0);
            refreshBrushDrawing();
        }
    }

    void setBrushEraserColor(int i4) {
        this.mDrawPaint.setColor(i4);
        setBrushDrawingMode(true);
    }

    void setBrushEraserSize(float f4) {
        this.mBrushEraserSize = f4;
        setBrushDrawingMode(true);
    }

    void setBrushSize(float f4) {
        this.mBrushSize = f4;
        setBrushDrawingMode(true);
    }

    void setBrushViewChangeListener(BrushViewChangeListener brushViewChangeListener) {
        this.mBrushViewChangeListener = brushViewChangeListener;
    }

    void setOpacity(int i4) {
        this.mOpacity = i4;
        setBrushDrawingMode(true);
    }

    boolean undo() {
        if (!this.mDrawnPaths.empty()) {
            this.mRedoPaths.push(this.mDrawnPaths.pop());
            invalidate();
        }
        BrushViewChangeListener brushViewChangeListener = this.mBrushViewChangeListener;
        if (brushViewChangeListener != null) {
            brushViewChangeListener.onViewRemoved(this);
        }
        return !this.mDrawnPaths.empty();
    }

    public BrushDrawingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BrushDrawingView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mBrushSize = DEFAULT_BRUSH_SIZE;
        this.mBrushEraserSize = DEFAULT_ERASER_SIZE;
        this.mOpacity = DEFAULT_OPACITY;
        this.mDrawnPaths = new Stack<>();
        this.mRedoPaths = new Stack<>();
        this.mDrawPaint = new Paint();
        setupBrushDrawing();
    }
}
