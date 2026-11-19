package com.zykj.blackboard.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.AbstractC3387g;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m5110d2 = {"Lcom/zykj/blackboard/utils/CanvasUtils;", "", "<init>", "()V", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/Bitmap;", "largeBitmap", "Landroid/graphics/Matrix;", "matrix", "Ld6/s;", "drawLargeBitmap", "(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;Landroid/graphics/Matrix;)V", "", "MAX_SAFE_BITMAP_BYTES", "J", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class CanvasUtils {

    @NotNull
    public static final CanvasUtils INSTANCE = new CanvasUtils();
    private static final long MAX_SAFE_BITMAP_BYTES = 104857600;

    private CanvasUtils() {
    }

    public final void drawLargeBitmap(@NotNull Canvas canvas, @NotNull Bitmap largeBitmap, @NotNull Matrix matrix) {
        AbstractC5830k.m5330g(canvas, "canvas");
        AbstractC5830k.m5330g(largeBitmap, "largeBitmap");
        AbstractC5830k.m5330g(matrix, "matrix");
        if (largeBitmap.isRecycled()) {
            return;
        }
        long allocationByteCount = largeBitmap.getAllocationByteCount();
        if (allocationByteCount >= MAX_SAFE_BITMAP_BYTES) {
            AbstractC3387g.m2339b("CanvasUtils: 拒绝绘制过大图片(" + allocationByteCount + " bytes)，防止系统崩溃。");
            return;
        }
        AbstractC3387g.m2338a("CanvasUtils：开始执行CanvasUtils绘制，图片大小: " + largeBitmap.getWidth() + 'x' + largeBitmap.getHeight());
        int maximumBitmapWidth = canvas.getMaximumBitmapWidth();
        int maximumBitmapHeight = canvas.getMaximumBitmapHeight();
        int width = largeBitmap.getWidth();
        int height = largeBitmap.getHeight();
        Rect rect = new Rect();
        RectF rectF = new RectF();
        canvas.save();
        canvas.concat(matrix);
        int i = ((width + maximumBitmapWidth) - 1) / maximumBitmapWidth;
        int i8 = ((height + maximumBitmapHeight) - 1) / maximumBitmapHeight;
        for (int i9 = 0; i9 < i; i9++) {
            for (int i10 = 0; i10 < i8; i10++) {
                int i11 = i9 * maximumBitmapWidth;
                int i12 = i10 * maximumBitmapHeight;
                rect.set(i11, i12, Math.min(i11 + maximumBitmapWidth, width), Math.min(i12 + maximumBitmapHeight, height));
                rectF.set(rect.left, rect.top, rect.right, rect.bottom);
                try {
                    canvas.drawBitmap(largeBitmap, rect, rectF, (Paint) null);
                } catch (Exception e) {
                    AbstractC3387g.m2339b("CanvasUtils drawBitmap 失败: " + e.getMessage());
                }
            }
        }
        canvas.restore();
    }
}
