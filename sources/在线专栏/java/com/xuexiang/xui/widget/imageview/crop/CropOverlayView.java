package com.xuexiang.xui.widget.imageview.crop;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class CropOverlayView extends View {
    private static final float DEFAULT_CORNER_EXTENSION_DP;
    private static final float DEFAULT_CORNER_LENGTH_DP = 20.0f;
    private static final float DEFAULT_CORNER_OFFSET_DP;
    private static final float DEFAULT_CORNER_THICKNESS_DP;
    private static final float DEFAULT_LINE_THICKNESS_DP;
    private static final float DEFAULT_SHOW_GUIDELINES_LIMIT = 100.0f;
    private static final int GUIDELINES_OFF = 0;
    private static final int GUIDELINES_ON = 2;
    private static final int GUIDELINES_ON_TOUCH = 1;
    private static final int SNAP_RADIUS_DP = 6;
    private boolean initializedCropWindow;
    private int mAspectRatioX;
    private int mAspectRatioY;
    private Paint mBackgroundPaint;
    public Bitmap mBitmap;
    private int mBitmapHeight;
    private Rect mBitmapRect;
    private int mBitmapWidth;
    private Paint mBorderPaint;
    private Bitmap mCornerBitmap;
    private float mCornerExtension;
    private int mCornerHeight;
    private float mCornerLength;
    private float mCornerOffset;
    private Paint mCornerPaint;
    private int mCornerWidth;
    private boolean mFixAspectRatio;
    private Paint mGuidelinePaint;
    private int mGuidelines;
    private float mHandleRadius;
    private Handle mPressedHandle;
    private float mSnapRadius;
    private float mTargetAspectRatio;
    private Pair<Float, Float> mTouchOffset;

    static {
        float cornerThickness = PaintUtil.getCornerThickness();
        DEFAULT_CORNER_THICKNESS_DP = cornerThickness;
        float lineThickness = PaintUtil.getLineThickness();
        DEFAULT_LINE_THICKNESS_DP = lineThickness;
        float f4 = (cornerThickness / 2.0f) - (lineThickness / 2.0f);
        DEFAULT_CORNER_OFFSET_DP = f4;
        DEFAULT_CORNER_EXTENSION_DP = (cornerThickness / 2.0f) + f4;
    }

    public CropOverlayView(Context context) {
        super(context);
        this.mFixAspectRatio = false;
        this.mAspectRatioX = 1;
        this.mAspectRatioY = 1;
        this.mTargetAspectRatio = 1 / 1;
        this.initializedCropWindow = false;
        this.mBitmap = null;
        this.mBitmapWidth = 0;
        this.mBitmapHeight = 0;
        this.mCornerBitmap = null;
        this.mCornerWidth = 0;
        this.mCornerHeight = 0;
        init(context);
    }

    private void drawBackground(Canvas canvas, Rect rect) {
        float coordinate = Edge.LEFT.getCoordinate();
        float coordinate2 = Edge.TOP.getCoordinate();
        float coordinate3 = Edge.RIGHT.getCoordinate();
        float coordinate4 = Edge.BOTTOM.getCoordinate();
        canvas.drawRect(rect.left, rect.top, rect.right, coordinate2, this.mBackgroundPaint);
        canvas.drawRect(rect.left, coordinate4, rect.right, rect.bottom, this.mBackgroundPaint);
        canvas.drawRect(rect.left, coordinate2, coordinate, coordinate4, this.mBackgroundPaint);
        canvas.drawRect(coordinate3, coordinate2, rect.right, coordinate4, this.mBackgroundPaint);
    }

    private void drawCornerText(Canvas canvas) {
        float fWidth = this.mBitmapRect.width();
        float f4 = this.mBitmapWidth / fWidth;
        float fHeight = this.mBitmapHeight / this.mBitmapRect.height();
        int width = (int) (Edge.getWidth() * f4);
        int height = (int) (Edge.getHeight() * fHeight);
        this.mBorderPaint.setStrokeWidth(IGoodView.DEFAULT_TO_ALPHA);
        this.mBorderPaint.setTextAlign(Paint.Align.CENTER);
        this.mBorderPaint.setTextSize(25.0f);
        canvas.drawText(width + "x" + height, (Edge.LEFT.getCoordinate() / 2.0f) + (Edge.RIGHT.getCoordinate() / 2.0f), (Edge.TOP.getCoordinate() / 2.0f) + (Edge.BOTTOM.getCoordinate() / 2.0f), this.mBorderPaint);
    }

    private void drawCorners(Canvas canvas) {
        float coordinate = Edge.LEFT.getCoordinate();
        float coordinate2 = Edge.TOP.getCoordinate();
        float coordinate3 = Edge.RIGHT.getCoordinate();
        float coordinate4 = Edge.BOTTOM.getCoordinate();
        Bitmap bitmap = this.mCornerBitmap;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, coordinate - (this.mCornerWidth / 2.0f), coordinate2 - (this.mCornerHeight / 2.0f), (Paint) null);
            canvas.drawBitmap(this.mCornerBitmap, coordinate3 - (this.mCornerWidth / 2.0f), coordinate2 - (this.mCornerHeight / 2.0f), (Paint) null);
            canvas.drawBitmap(this.mCornerBitmap, coordinate - (this.mCornerWidth / 2.0f), coordinate4 - (this.mCornerHeight / 2.0f), (Paint) null);
            canvas.drawBitmap(this.mCornerBitmap, coordinate3 - (this.mCornerWidth / 2.0f), coordinate4 - (this.mCornerHeight / 2.0f), (Paint) null);
            return;
        }
        float f4 = this.mCornerOffset;
        canvas.drawLine(coordinate - f4, coordinate2 - this.mCornerExtension, coordinate - f4, coordinate2 + this.mCornerLength, this.mCornerPaint);
        float f5 = this.mCornerOffset;
        canvas.drawLine(coordinate, coordinate2 - f5, coordinate + this.mCornerLength, coordinate2 - f5, this.mCornerPaint);
        float f6 = this.mCornerOffset;
        canvas.drawLine(coordinate3 + f6, coordinate2 - this.mCornerExtension, coordinate3 + f6, coordinate2 + this.mCornerLength, this.mCornerPaint);
        float f7 = this.mCornerOffset;
        canvas.drawLine(coordinate3, coordinate2 - f7, coordinate3 - this.mCornerLength, coordinate2 - f7, this.mCornerPaint);
        float f8 = this.mCornerOffset;
        canvas.drawLine(coordinate - f8, this.mCornerExtension + coordinate4, coordinate - f8, coordinate4 - this.mCornerLength, this.mCornerPaint);
        float f9 = this.mCornerOffset;
        canvas.drawLine(coordinate, coordinate4 + f9, coordinate + this.mCornerLength, coordinate4 + f9, this.mCornerPaint);
        float f10 = this.mCornerOffset;
        canvas.drawLine(coordinate3 + f10, this.mCornerExtension + coordinate4, coordinate3 + f10, coordinate4 - this.mCornerLength, this.mCornerPaint);
        float f11 = this.mCornerOffset;
        canvas.drawLine(coordinate3, coordinate4 + f11, coordinate3 - this.mCornerLength, coordinate4 + f11, this.mCornerPaint);
    }

    private void drawRuleOfThirdsGuidelines(Canvas canvas) {
        float coordinate = Edge.LEFT.getCoordinate();
        float coordinate2 = Edge.TOP.getCoordinate();
        float coordinate3 = Edge.RIGHT.getCoordinate();
        float coordinate4 = Edge.BOTTOM.getCoordinate();
        float width = Edge.getWidth() / 3.0f;
        float f4 = coordinate + width;
        canvas.drawLine(f4, coordinate2, f4, coordinate4, this.mGuidelinePaint);
        float f5 = coordinate3 - width;
        canvas.drawLine(f5, coordinate2, f5, coordinate4, this.mGuidelinePaint);
        float height = Edge.getHeight() / 3.0f;
        float f6 = coordinate2 + height;
        canvas.drawLine(coordinate, f6, coordinate3, f6, this.mGuidelinePaint);
        float f7 = coordinate4 - height;
        canvas.drawLine(coordinate, f7, coordinate3, f7, this.mGuidelinePaint);
    }

    private void init(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.mHandleRadius = HandleUtil.getTargetRadius(context);
        this.mSnapRadius = TypedValue.applyDimension(1, 6.0f, displayMetrics);
        this.mBorderPaint = PaintUtil.newBorderPaint(context);
        this.mGuidelinePaint = PaintUtil.newGuidelinePaint(context);
        this.mBackgroundPaint = PaintUtil.newBackgroundPaint(context);
        this.mCornerPaint = PaintUtil.newCornerPaint(context);
        this.mCornerOffset = TypedValue.applyDimension(1, DEFAULT_CORNER_OFFSET_DP, displayMetrics);
        this.mCornerExtension = TypedValue.applyDimension(1, DEFAULT_CORNER_EXTENSION_DP, displayMetrics);
        this.mCornerLength = TypedValue.applyDimension(1, DEFAULT_CORNER_LENGTH_DP, displayMetrics);
        this.mGuidelines = 1;
    }

    private void initCropWindow(Rect rect) {
        if (!this.initializedCropWindow) {
            this.initializedCropWindow = true;
        }
        if (!this.mFixAspectRatio) {
            float fWidth = rect.width() * 0.1f;
            float fHeight = rect.height() * 0.1f;
            Edge.LEFT.setCoordinate(rect.left + fWidth);
            Edge.TOP.setCoordinate(rect.top + fHeight);
            Edge.RIGHT.setCoordinate(rect.right - fWidth);
            Edge.BOTTOM.setCoordinate(rect.bottom - fHeight);
            return;
        }
        if (AspectRatioUtil.calculateAspectRatio(rect) > this.mTargetAspectRatio) {
            Edge edge = Edge.TOP;
            edge.setCoordinate(rect.top);
            Edge edge2 = Edge.BOTTOM;
            edge2.setCoordinate(rect.bottom);
            float width = getWidth() / 2.0f;
            float fMax = Math.max(40.0f, AspectRatioUtil.calculateWidth(edge.getCoordinate(), edge2.getCoordinate(), this.mTargetAspectRatio));
            if (fMax == 40.0f) {
                this.mTargetAspectRatio = 40.0f / (edge2.getCoordinate() - edge.getCoordinate());
            }
            float f4 = fMax / 2.0f;
            Edge.LEFT.setCoordinate(width - f4);
            Edge.RIGHT.setCoordinate(width + f4);
            return;
        }
        Edge edge3 = Edge.LEFT;
        edge3.setCoordinate(rect.left);
        Edge edge4 = Edge.RIGHT;
        edge4.setCoordinate(rect.right);
        float height = getHeight() / 2.0f;
        float fMax2 = Math.max(40.0f, AspectRatioUtil.calculateHeight(edge3.getCoordinate(), edge4.getCoordinate(), this.mTargetAspectRatio));
        if (fMax2 == 40.0f) {
            float coordinate = edge4.getCoordinate() - edge3.getCoordinate();
            if (coordinate > IGoodView.DEFAULT_TO_ALPHA) {
                this.mTargetAspectRatio = coordinate / 40.0f;
            }
        }
        float f5 = fMax2 / 2.0f;
        Edge.TOP.setCoordinate(height - f5);
        Edge.BOTTOM.setCoordinate(height + f5);
    }

    private void onActionDown(float f4, float f5) {
        float coordinate = Edge.LEFT.getCoordinate();
        float coordinate2 = Edge.TOP.getCoordinate();
        float coordinate3 = Edge.RIGHT.getCoordinate();
        float coordinate4 = Edge.BOTTOM.getCoordinate();
        Handle pressedHandle = HandleUtil.getPressedHandle(f4, f5, coordinate, coordinate2, coordinate3, coordinate4, this.mHandleRadius);
        this.mPressedHandle = pressedHandle;
        if (pressedHandle == null) {
            return;
        }
        this.mTouchOffset = HandleUtil.getOffset(pressedHandle, f4, f5, coordinate, coordinate2, coordinate3, coordinate4);
        invalidate();
    }

    private void onActionMove(float f4, float f5) {
        if (this.mPressedHandle == null) {
            return;
        }
        float fFloatValue = f4 + ((Float) this.mTouchOffset.first).floatValue();
        float fFloatValue2 = f5 + ((Float) this.mTouchOffset.second).floatValue();
        if (this.mFixAspectRatio) {
            this.mPressedHandle.updateCropWindow(fFloatValue, fFloatValue2, this.mTargetAspectRatio, this.mBitmapRect, this.mSnapRadius);
        } else {
            this.mPressedHandle.updateCropWindow(fFloatValue, fFloatValue2, this.mBitmapRect, this.mSnapRadius);
        }
        invalidate();
    }

    private void onActionUp() {
        if (this.mPressedHandle == null) {
            return;
        }
        this.mPressedHandle = null;
        invalidate();
    }

    public static boolean showGuidelines() {
        return Math.abs(Edge.LEFT.getCoordinate() - Edge.RIGHT.getCoordinate()) >= DEFAULT_SHOW_GUIDELINES_LIMIT && Math.abs(Edge.TOP.getCoordinate() - Edge.BOTTOM.getCoordinate()) >= DEFAULT_SHOW_GUIDELINES_LIMIT;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawBackground(canvas, this.mBitmapRect);
        if (showGuidelines()) {
            int i4 = this.mGuidelines;
            if (i4 == 2) {
                drawRuleOfThirdsGuidelines(canvas);
                drawCornerText(canvas);
            } else if (i4 == 1 && this.mPressedHandle != null) {
                drawRuleOfThirdsGuidelines(canvas);
                drawCornerText(canvas);
            }
        }
        canvas.drawRect(Edge.LEFT.getCoordinate(), Edge.TOP.getCoordinate(), Edge.RIGHT.getCoordinate(), Edge.BOTTOM.getCoordinate(), this.mBorderPaint);
        drawCorners(canvas);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        initCropWindow(this.mBitmapRect);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            onActionDown(motionEvent.getX(), motionEvent.getY());
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                onActionMove(motionEvent.getX(), motionEvent.getY());
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
            if (action != 3) {
                return false;
            }
        }
        getParent().requestDisallowInterceptTouchEvent(false);
        onActionUp();
        return true;
    }

    public void resetCropOverlayView() {
        if (this.initializedCropWindow) {
            initCropWindow(this.mBitmapRect);
            invalidate();
        }
    }

    public void setAspectRatioX(int i4) {
        if (i4 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        this.mAspectRatioX = i4;
        this.mTargetAspectRatio = i4 / this.mAspectRatioY;
        resetCropOverlayView();
    }

    public void setAspectRatioY(int i4) {
        if (i4 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        this.mAspectRatioY = i4;
        this.mTargetAspectRatio = this.mAspectRatioX / i4;
        resetCropOverlayView();
    }

    public void setBitmapRect(Rect rect) {
        this.mBitmapRect = rect;
        initCropWindow(rect);
    }

    public void setBitmapSize(int i4, int i5) {
        this.mBitmapWidth = i4;
        this.mBitmapHeight = i5;
    }

    public void setBorderAndGuidelineColor(int i4) {
        this.mBorderPaint.setColor(i4);
        this.mGuidelinePaint.setColor(i4);
        resetCropOverlayView();
    }

    public void setBorderAndGuidelineStyle(int i4, float f4) {
        this.mBorderPaint.setColor(i4);
        this.mBorderPaint.setStrokeWidth(f4);
        this.mGuidelinePaint.setColor(i4);
        this.mGuidelinePaint.setStrokeWidth(f4);
        resetCropOverlayView();
    }

    public void setBorderColor(int i4) {
        this.mBorderPaint.setColor(i4);
        resetCropOverlayView();
    }

    public void setBorderStyle(int i4, float f4) {
        this.mBorderPaint.setColor(i4);
        this.mBorderPaint.setStrokeWidth(f4);
        resetCropOverlayView();
    }

    public void setBorderWidth(float f4) {
        this.mBorderPaint.setStrokeWidth(f4);
        resetCropOverlayView();
    }

    public void setCornerColor(int i4) {
        this.mCornerPaint.setColor(i4);
        resetCropOverlayView();
    }

    public void setCornerStyle(int i4, float f4) {
        this.mCornerPaint.setColor(i4);
        this.mCornerPaint.setStrokeWidth(f4);
        resetCropOverlayView();
    }

    public void setCornerWidth(float f4) {
        this.mCornerPaint.setStrokeWidth(f4);
        resetCropOverlayView();
    }

    public void setCropOverlayCornerBitmap(Bitmap bitmap) {
        this.mCornerBitmap = bitmap;
        if (bitmap != null) {
            this.mCornerWidth = bitmap.getWidth();
            this.mCornerHeight = this.mCornerBitmap.getHeight();
        }
    }

    public void setFixedAspectRatio(boolean z3) {
        this.mFixAspectRatio = z3;
        resetCropOverlayView();
    }

    public void setGuidelineColor(int i4) {
        this.mGuidelinePaint.setColor(i4);
        resetCropOverlayView();
    }

    public void setGuidelineStyle(int i4, float f4) {
        this.mGuidelinePaint.setColor(i4);
        this.mGuidelinePaint.setStrokeWidth(f4);
        resetCropOverlayView();
    }

    public void setGuidelineWidth(float f4) {
        this.mGuidelinePaint.setStrokeWidth(f4);
        resetCropOverlayView();
    }

    public void setGuidelines(int i4) {
        if (i4 < 0 || i4 > 2) {
            throw new IllegalArgumentException("Guideline value must be set between 0 and 2. See documentation.");
        }
        this.mGuidelines = i4;
        resetCropOverlayView();
    }

    public void setInitialAttributeValues(int i4, boolean z3, int i5, int i6) {
        if (i4 < 0 || i4 > 2) {
            throw new IllegalArgumentException("Guideline value must be set between 0 and 2. See documentation.");
        }
        this.mGuidelines = i4;
        this.mFixAspectRatio = z3;
        if (i5 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        this.mAspectRatioX = i5;
        this.mTargetAspectRatio = i5 / this.mAspectRatioY;
        if (i6 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        this.mAspectRatioY = i6;
        this.mTargetAspectRatio = i5 / i6;
    }

    public CropOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mFixAspectRatio = false;
        this.mAspectRatioX = 1;
        this.mAspectRatioY = 1;
        this.mTargetAspectRatio = 1 / 1;
        this.initializedCropWindow = false;
        this.mBitmap = null;
        this.mBitmapWidth = 0;
        this.mBitmapHeight = 0;
        this.mCornerBitmap = null;
        this.mCornerWidth = 0;
        this.mCornerHeight = 0;
        init(context);
    }
}
