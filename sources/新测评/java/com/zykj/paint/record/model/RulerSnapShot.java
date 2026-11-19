package com.zykj.paint.record.model;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.core.internal.view.SupportMenu;

/* loaded from: classes5.dex */
public class RulerSnapShot extends GraphSnapShot {
    private static final String TAG = "RulerSnapShot";
    private Paint bgPaint;
    private float degree;
    private float downDegree;
    private int height;
    public RectF rectF;
    public Bitmap ruler;
    private int width;

    public RulerSnapShot(Bitmap bitmap) {
        this.ruler = bitmap;
        init();
    }

    private void init() {
        this.rectF = new RectF(0.0f, -50.0f, this.ruler.getWidth(), 10.0f);
        Paint paint = new Paint();
        this.paint = paint;
        paint.setAntiAlias(true);
        this.paint.setDither(true);
        this.paint.setColor(SupportMenu.CATEGORY_MASK);
        Paint paint2 = this.paint;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.paint.setStrokeJoin(Paint.Join.ROUND);
        this.paint.setStrokeWidth(1.0f);
        Paint paint3 = new Paint();
        this.bgPaint = paint3;
        paint3.setAntiAlias(true);
        this.bgPaint.setDither(true);
        this.bgPaint.setColor(-3355444);
        this.bgPaint.setStyle(style);
        this.bgPaint.setStrokeWidth(2.0f);
        this.width = 600;
        this.height = this.ruler.getHeight();
        setScaleMatrix(1.0f, 0.0f);
    }

    public boolean isInDrawGraphRect(float f10, float f11) {
        if (this.bitmap == null) {
            return false;
        }
        Matrix matrix = new Matrix();
        matrix.postConcat(this.matrix);
        float[] fArrInvertPoints = invertPoints(matrix, f10, f11);
        return this.rectF.contains(fArrInvertPoints[0], fArrInvertPoints[1]);
    }

    public void setDownScale() {
        this.width = this.bitmap.getWidth();
        this.height = this.bitmap.getHeight();
        this.downDegree = this.degree;
    }

    public void setScaleMatrix(float f10, float f11) {
        this.degree = this.downDegree + f11;
        int i10 = (int) (this.width * f10);
        if (i10 > 1920 || i10 < 600) {
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, this.height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawRect(0.0f, 0.0f, i10, this.height, this.bgPaint);
        int i11 = 0;
        while (true) {
            int i12 = 2;
            if (i11 >= 200) {
                canvas.drawText(String.valueOf((int) this.degree) + "°", i10 / 2, this.height / 2, this.paint);
                this.bitmap = bitmapCreateBitmap;
                return;
            }
            if (i11 % 10 == 0) {
                i12 = 3;
            } else if (i11 % 5 != 0) {
                i12 = 1;
            }
            float f12 = i11 * 10;
            canvas.drawLine(f12, 0.0f, f12, i12 * 20, this.paint);
            i11++;
        }
    }
}
