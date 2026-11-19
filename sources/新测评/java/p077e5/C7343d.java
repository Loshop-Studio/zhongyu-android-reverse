package p077e5;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.blankj.utilcode.util.LogUtils;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e5.d */
/* loaded from: classes4.dex */
public final class C7343d {

    /* renamed from: a */
    public static final C7343d f11910a = new C7343d();

    /* renamed from: a */
    public final void m11747a(Canvas canvas, Bitmap largeBitmap, Matrix matrix) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(largeBitmap, "largeBitmap");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        if (largeBitmap.isRecycled()) {
            return;
        }
        long allocationByteCount = largeBitmap.getAllocationByteCount();
        if (allocationByteCount >= 104857600) {
            LogUtils.m3238e("CanvasUtils: 拒绝绘制过大图片(" + allocationByteCount + " bytes)，防止系统崩溃。");
            return;
        }
        LogUtils.m3237d("CanvasUtils：开始执行CanvasUtils绘制，图片大小: " + largeBitmap.getWidth() + 'x' + largeBitmap.getHeight());
        int maximumBitmapWidth = canvas.getMaximumBitmapWidth();
        int maximumBitmapHeight = canvas.getMaximumBitmapHeight();
        int width = largeBitmap.getWidth();
        int height = largeBitmap.getHeight();
        Rect rect = new Rect();
        RectF rectF = new RectF();
        canvas.save();
        canvas.concat(matrix);
        int i10 = ((width + maximumBitmapWidth) - 1) / maximumBitmapWidth;
        int i11 = ((height + maximumBitmapHeight) - 1) / maximumBitmapHeight;
        for (int i12 = 0; i12 < i10; i12++) {
            for (int i13 = 0; i13 < i11; i13++) {
                int i14 = i12 * maximumBitmapWidth;
                int i15 = i13 * maximumBitmapHeight;
                rect.set(i14, i15, Math.min(i14 + maximumBitmapWidth, width), Math.min(i15 + maximumBitmapHeight, height));
                rectF.set(rect.left, rect.top, rect.right, rect.bottom);
                try {
                    canvas.drawBitmap(largeBitmap, rect, rectF, (Paint) null);
                } catch (Exception e10) {
                    LogUtils.m3238e("CanvasUtils drawBitmap 失败: " + e10.getMessage());
                }
            }
        }
        canvas.restore();
    }
}
