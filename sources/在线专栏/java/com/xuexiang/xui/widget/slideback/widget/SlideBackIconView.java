package com.xuexiang.xui.widget.slideback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class SlideBackIconView extends View {
    private Paint arrowPaint;
    private Path arrowPath;
    private float arrowSize;
    private int backViewColor;
    private float backViewHeight;
    private Paint bgPaint;
    private Path bgPath;
    private float maxSlideLength;
    private float slideLength;

    public SlideBackIconView(Context context) {
        this(context, null);
    }

    private void init() {
        this.bgPath = new Path();
        this.arrowPath = new Path();
        Paint paint = new Paint();
        this.bgPaint = paint;
        paint.setAntiAlias(true);
        this.bgPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.bgPaint.setColor(this.backViewColor);
        this.bgPaint.setStrokeWidth(1.0f);
        Paint paint2 = new Paint();
        this.arrowPaint = paint2;
        paint2.setAntiAlias(true);
        this.arrowPaint.setStyle(Paint.Style.STROKE);
        this.arrowPaint.setColor(-1);
        this.arrowPaint.setStrokeWidth(8.0f);
        this.arrowPaint.setStrokeJoin(Paint.Join.ROUND);
        setAlpha(IGoodView.DEFAULT_TO_ALPHA);
    }

    public float getBackViewHeight() {
        return this.backViewHeight;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.bgPath.reset();
        Path path = this.bgPath;
        float f4 = IGoodView.DEFAULT_TO_ALPHA;
        path.moveTo(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA);
        Path path2 = this.bgPath;
        float f5 = this.backViewHeight;
        float f6 = this.slideLength;
        path2.cubicTo(IGoodView.DEFAULT_TO_ALPHA, (f5 * 2.0f) / 9.0f, f6, f5 / 3.0f, f6, f5 / 2.0f);
        Path path3 = this.bgPath;
        float f7 = this.slideLength;
        float f8 = this.backViewHeight;
        path3.cubicTo(f7, (f8 * 2.0f) / 3.0f, IGoodView.DEFAULT_TO_ALPHA, (7.0f * f8) / 9.0f, IGoodView.DEFAULT_TO_ALPHA, f8);
        canvas.drawPath(this.bgPath, this.bgPaint);
        float f9 = this.slideLength / this.maxSlideLength;
        if (f9 >= 0.75f) {
            f4 = (f9 - 0.75f) * 2.0f;
        }
        this.arrowPath.reset();
        Path path4 = this.arrowPath;
        float f10 = this.slideLength / 2.0f;
        float f11 = this.arrowSize;
        path4.moveTo(f10 + (f11 * f4), (this.backViewHeight / 2.0f) - (f11 * f9));
        this.arrowPath.lineTo((this.slideLength / 2.0f) - (this.arrowSize * f4), this.backViewHeight / 2.0f);
        Path path5 = this.arrowPath;
        float f12 = this.slideLength / 2.0f;
        float f13 = this.arrowSize;
        path5.lineTo(f12 + (f4 * f13), (this.backViewHeight / 2.0f) + (f9 * f13));
        canvas.drawPath(this.arrowPath, this.arrowPaint);
        setAlpha((this.slideLength / this.maxSlideLength) - 0.2f);
    }

    public void setArrowSize(float f4) {
        this.arrowSize = f4;
    }

    public void setBackViewColor(int i4) {
        this.backViewColor = i4;
    }

    public void setBackViewHeight(float f4) {
        this.backViewHeight = f4;
    }

    public void setMaxSlideLength(float f4) {
        this.maxSlideLength = f4;
    }

    public void updateSlideLength(float f4) {
        this.slideLength = f4;
        invalidate();
    }

    public SlideBackIconView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlideBackIconView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.backViewColor = IGoodView.DEFAULT_TEXT_COLOR;
        this.backViewHeight = IGoodView.DEFAULT_TO_ALPHA;
        this.arrowSize = 10.0f;
        this.maxSlideLength = IGoodView.DEFAULT_TO_ALPHA;
        this.slideLength = IGoodView.DEFAULT_TO_ALPHA;
        init();
    }
}
