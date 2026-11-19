package com.zykj.blackboard.crop;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.core.canvas.view.FixLayer;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m5110d2 = {"Lcom/zykj/blackboard/crop/SimpleFixView;", "Lcom/zykj/blackboard/core/canvas/view/FixLayer;", "", "width", "height", "<init>", "(II)V", "Landroid/graphics/Bitmap;", "bitmap", "Ld6/s;", "draw", "(Landroid/graphics/Bitmap;)V", "Landroid/graphics/Rect;", "rect", "()Landroid/graphics/Rect;", "refresh", "()V", "reset", "I", "mBitmap", "Landroid/graphics/Bitmap;", "Landroid/graphics/Canvas;", "mCanvas", "Landroid/graphics/Canvas;", "mBackgroundColor", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class SimpleFixView implements FixLayer {
    private final int height;
    private int mBackgroundColor;

    @NotNull
    private Bitmap mBitmap;

    @NotNull
    private Canvas mCanvas;

    @NotNull
    private final Paint paint;
    private final int width;

    public SimpleFixView(int i, int i8) {
        this.width = i;
        this.height = i8;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i8, Bitmap.Config.ARGB_8888);
        AbstractC5830k.m5329f(bitmapCreateBitmap, "createBitmap(width, heig… Bitmap.Config.ARGB_8888)");
        this.mBitmap = bitmapCreateBitmap;
        this.mCanvas = new Canvas(this.mBitmap);
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.paint = paint;
    }

    @Override // com.zykj.blackboard.core.canvas.view.FixLayer
    public void draw(@NotNull Bitmap bitmap) {
        AbstractC5830k.m5330g(bitmap, "bitmap");
        this.mCanvas.drawBitmap(bitmap, 0.0f, 0.0f, this.paint);
    }

    @Override // com.zykj.blackboard.core.canvas.view.FixLayer
    @NotNull
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
