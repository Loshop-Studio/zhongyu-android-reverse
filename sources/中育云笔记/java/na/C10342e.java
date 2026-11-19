package na;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: na.e */
/* loaded from: classes5.dex */
public final class C10342e {

    /* renamed from: a */
    public static final C10342e f24648a = new C10342e();

    /* renamed from: a */
    public final void m21630a(Canvas canvas, Bitmap largeBitmap, Matrix matrix) {
        AbstractC9979u.m20294g(canvas, "canvas");
        AbstractC9979u.m20294g(largeBitmap, "largeBitmap");
        AbstractC9979u.m20294g(matrix, "matrix");
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
                canvas.drawBitmap(largeBitmap, rect, rectF, (Paint) null);
            }
        }
        canvas.restore();
    }
}
