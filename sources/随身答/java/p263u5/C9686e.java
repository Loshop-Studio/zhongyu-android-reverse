package p263u5;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.blankj.utilcode.util.LogUtils;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: u5.e */
/* loaded from: classes4.dex */
public final class C9686e {

    /* renamed from: a */
    public static final C9686e f17123a = new C9686e();

    /* renamed from: a */
    public final void m16168a(Canvas canvas, Bitmap largeBitmap, Matrix matrix) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(largeBitmap, "largeBitmap");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        if (largeBitmap.isRecycled()) {
            return;
        }
        long allocationByteCount = largeBitmap.getAllocationByteCount();
        if (allocationByteCount >= 104857600) {
            LogUtils.m2955e("CanvasUtils: 拒绝绘制过大图片(" + allocationByteCount + " bytes)，防止系统崩溃。");
            return;
        }
        LogUtils.m2954d("CanvasUtils：开始执行CanvasUtils绘制，图片大小: " + largeBitmap.getWidth() + 'x' + largeBitmap.getHeight());
        int maximumBitmapWidth = canvas.getMaximumBitmapWidth();
        int maximumBitmapHeight = canvas.getMaximumBitmapHeight();
        int width = largeBitmap.getWidth();
        int height = largeBitmap.getHeight();
        Rect rect = new Rect();
        RectF rectF = new RectF();
        canvas.save();
        canvas.concat(matrix);
        int i9 = ((width + maximumBitmapWidth) - 1) / maximumBitmapWidth;
        int i10 = ((height + maximumBitmapHeight) - 1) / maximumBitmapHeight;
        for (int i11 = 0; i11 < i9; i11++) {
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = i11 * maximumBitmapWidth;
                int i14 = i12 * maximumBitmapHeight;
                rect.set(i13, i14, Math.min(i13 + maximumBitmapWidth, width), Math.min(i14 + maximumBitmapHeight, height));
                rectF.set(rect.left, rect.top, rect.right, rect.bottom);
                try {
                    canvas.drawBitmap(largeBitmap, rect, rectF, (Paint) null);
                } catch (Exception e10) {
                    LogUtils.m2955e("CanvasUtils drawBitmap 失败: " + e10.getMessage());
                }
            }
        }
        canvas.restore();
    }
}
