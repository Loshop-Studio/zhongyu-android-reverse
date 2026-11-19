package com.zykj.blackboard.crop;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import com.zykj.blackboard.core.canvas.view.FixLayer;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class SimpleFixView implements FixLayer {
    private final int height;
    private int mBackgroundColor;
    private Bitmap mBitmap;
    private Canvas mCanvas;
    private final Paint paint;
    private final int width;

    public SimpleFixView(int i10, int i11) {
        this.width = i10;
        this.height = i11;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        AbstractC9133u.m16132f(bitmapCreateBitmap, "createBitmap(width, heig… Bitmap.Config.ARGB_8888)");
        this.mBitmap = bitmapCreateBitmap;
        this.mCanvas = new Canvas(this.mBitmap);
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.paint = paint;
    }

    @Override // com.zykj.blackboard.core.canvas.view.FixLayer
    public void draw(Bitmap bitmap) {
        AbstractC9133u.m16133g(bitmap, "bitmap");
        this.mCanvas.drawBitmap(bitmap, 0.0f, 0.0f, this.paint);
    }

    @Override // com.zykj.blackboard.core.canvas.view.FixLayer
    public Rect rect() {
        return new Rect(0, 0, this.width, this.height);
    }

    @Override // com.zykj.blackboard.core.canvas.view.FixLayer
    public void refresh() {
    }

    @Override // com.zykj.blackboard.core.canvas.view.FixLayer
    public void reset() {
        this.mCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
        this.mCanvas.drawColor(this.mBackgroundColor);
    }
}
