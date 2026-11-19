package com.zykj.paint.record.model;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.Log;
import androidx.camera.video.AudioStats;

/* loaded from: classes5.dex */
public class CompassSnapShot extends GraphSnapShot {
    private static final String TAG = "CompassSnapShot";
    double degree;
    double downDegree;
    int downWidth;
    private Bitmap hand;
    private int height;
    private Bitmap left;
    private Bitmap pencil;
    private Bitmap right;

    /* renamed from: top, reason: collision with root package name */
    private int f18261top;
    private int width;
    Matrix leftMartix = new Matrix();
    Matrix leftDownMartix = new Matrix();
    Matrix rightMartix = new Matrix();
    Matrix rightDownMartix = new Matrix();
    Matrix pencilMartix = new Matrix();
    public float radius = 0.0f;

    public CompassSnapShot(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4) {
        this.hand = bitmap;
        this.left = bitmap2;
        this.right = bitmap3;
        this.pencil = bitmap4;
        init();
    }

    private void init() {
        this.f18261top = (int) (this.hand.getHeight() * 0.6d);
        this.width = this.right.getWidth() * 2;
        int height = this.left.getHeight();
        int i10 = this.f18261top;
        this.height = height + i10;
        this.origin = new float[]{this.width / 2, i10};
        this.markerCenter = new float[]{this.left.getWidth(), this.left.getHeight()};
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.width, this.height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        this.leftMartix.postTranslate(this.origin[0] - this.left.getWidth(), this.origin[1]);
        Matrix matrix = this.rightMartix;
        float[] fArr = this.origin;
        matrix.postTranslate(fArr[0], fArr[1]);
        this.pencilMartix.postRotate(19.0f);
        this.pencilMartix.postTranslate(this.right.getWidth() / 2, (this.right.getHeight() / 2) - 15);
        Matrix matrix2 = new Matrix();
        matrix2.postConcat(this.pencilMartix);
        matrix2.postConcat(this.rightMartix);
        canvas.drawBitmap(this.left, this.leftMartix, null);
        canvas.drawBitmap(this.right, this.rightMartix, null);
        canvas.drawBitmap(this.pencil, matrix2, null);
        canvas.drawBitmap(this.hand, this.origin[0] - (r5.getWidth() / 2), this.origin[1] - this.f18261top, (Paint) null);
        this.bitmap = bitmapCreateBitmap;
    }

    public float calculateRadius() {
        float[] fArr = new float[2];
        float[] fArr2 = new float[2];
        Matrix matrix = new Matrix();
        matrix.postConcat(this.leftMartix);
        matrix.postConcat(this.matrix);
        matrix.mapPoints(fArr, new float[]{this.left.getWidth(), this.left.getHeight()});
        Matrix matrix2 = new Matrix();
        matrix2.postConcat(this.rightMartix);
        matrix2.postConcat(this.matrix);
        matrix2.mapPoints(fArr2, new float[]{0.0f, this.right.getHeight()});
        return (float) getPointsLength(fArr[0], fArr[1], fArr2[0], fArr2[1]);
    }

    public int getCompassMode(float f10, float f11) {
        Matrix matrix = new Matrix();
        matrix.postConcat(this.pencilMartix);
        matrix.postConcat(this.rightMartix);
        if (isInGraphRect(this.pencil, matrix, f10, f11)) {
            return 2;
        }
        if (isInGraphRect(this.right, this.rightMartix, f10, f11)) {
            return 3;
        }
        isInGraphRect(this.left, this.leftMartix, f10, f11);
        return 1;
    }

    public void onGraphChange(float f10, float f11, float f12, float f13) {
        float[] fArrInvertPoints = invertPoints(f10, f11);
        float[] fArrInvertPoints2 = invertPoints(f12, f13);
        double dExactCalculateDegree = exactCalculateDegree(this.origin, fArrInvertPoints[0], fArrInvertPoints[1], fArrInvertPoints2[0], fArrInvertPoints2[1]);
        updateGraph((float) dExactCalculateDegree, fArrInvertPoints2[0] - fArrInvertPoints[0], fArrInvertPoints2[1] - fArrInvertPoints[1]);
    }

    public void setCenterPoint() {
        Matrix matrix = new Matrix();
        matrix.postConcat(this.leftMartix);
        matrix.postConcat(this.matrix);
        matrix.mapPoints(this.center, this.markerCenter);
        Log.e(TAG, "markerCenter--->" + this.markerCenter[0] + "," + this.markerCenter[1]);
        Log.e(TAG, "center--->" + this.center[0] + "," + this.center[1]);
    }

    public void setDownMatrix() {
        this.leftDownMartix.set(this.leftMartix);
        this.rightDownMartix.set(this.rightMartix);
        this.downWidth = this.width;
        this.downDegree = this.degree;
        this.radius = calculateRadius();
        reset();
        setCenterPoint();
    }

    public void updateGraph(float f10, float f11, float f12) {
        int i10;
        double d10 = this.downDegree;
        double d11 = f10 + d10;
        this.degree = d11;
        if (d11 <= AudioStats.AUDIO_AMPLITUDE_NONE) {
            this.degree = AudioStats.AUDIO_AMPLITUDE_NONE;
            f10 = -((float) d10);
            i10 = (this.width - this.downWidth) / 2;
        } else {
            if (d11 < 90.0d) {
                this.width = (int) (this.downWidth + (2.0f * f11));
                this.origin = new float[]{r12 / 2, this.f18261top};
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.width, this.height, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Matrix matrix = new Matrix();
                matrix.postConcat(this.leftDownMartix);
                matrix.postTranslate(f11, 0.0f);
                float[] fArr = this.origin;
                matrix.postRotate(f10, fArr[0], fArr[1]);
                this.leftMartix.set(matrix);
                canvas.drawBitmap(this.left, this.leftMartix, null);
                Matrix matrix2 = new Matrix();
                matrix2.postConcat(this.rightDownMartix);
                matrix2.postTranslate(f11, 0.0f);
                float[] fArr2 = this.origin;
                matrix2.postRotate(-f10, fArr2[0], fArr2[1]);
                this.rightMartix.set(matrix2);
                canvas.drawBitmap(this.right, this.rightMartix, null);
                Matrix matrix3 = new Matrix();
                matrix3.postConcat(this.pencilMartix);
                matrix3.postConcat(this.rightMartix);
                canvas.drawBitmap(this.pencil, matrix3, null);
                canvas.drawBitmap(this.hand, this.origin[0] - (r10.getWidth() / 2), this.origin[1] - this.f18261top, (Paint) null);
                this.bitmap = bitmapCreateBitmap;
            }
            this.degree = 90.0d;
            f10 = 90.0f - ((float) d10);
            i10 = (this.width - this.downWidth) / 2;
        }
        f11 = i10;
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.width, this.height, Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
        Matrix matrix4 = new Matrix();
        matrix4.postConcat(this.leftDownMartix);
        matrix4.postTranslate(f11, 0.0f);
        float[] fArr3 = this.origin;
        matrix4.postRotate(f10, fArr3[0], fArr3[1]);
        this.leftMartix.set(matrix4);
        canvas2.drawBitmap(this.left, this.leftMartix, null);
        Matrix matrix22 = new Matrix();
        matrix22.postConcat(this.rightDownMartix);
        matrix22.postTranslate(f11, 0.0f);
        float[] fArr22 = this.origin;
        matrix22.postRotate(-f10, fArr22[0], fArr22[1]);
        this.rightMartix.set(matrix22);
        canvas2.drawBitmap(this.right, this.rightMartix, null);
        Matrix matrix32 = new Matrix();
        matrix32.postConcat(this.pencilMartix);
        matrix32.postConcat(this.rightMartix);
        canvas2.drawBitmap(this.pencil, matrix32, null);
        canvas2.drawBitmap(this.hand, this.origin[0] - (r10.getWidth() / 2), this.origin[1] - this.f18261top, (Paint) null);
        this.bitmap = bitmapCreateBitmap2;
    }
}
