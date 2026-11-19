package p099g5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: g5.a */
/* loaded from: classes4.dex */
public abstract class AbstractC7526a {
    /* renamed from: a */
    public static Bitmap m12291a(Bitmap bitmap, int i10) {
        float height;
        float width;
        if (bitmap == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(i10, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        if (i10 == 90) {
            height = bitmap.getHeight();
            width = 0.0f;
        } else {
            height = bitmap.getHeight();
            width = bitmap.getWidth();
        }
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        matrix.postTranslate(height - fArr[2], width - fArr[5]);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getHeight(), bitmap.getWidth(), Bitmap.Config.ARGB_8888);
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, matrix, new Paint());
        return bitmapCreateBitmap;
    }

    /* renamed from: b */
    public static int m12292b(Context context, float f10) {
        return (int) TypedValue.applyDimension(1, f10, context.getResources().getDisplayMetrics());
    }

    /* renamed from: c */
    public static Point m12293c(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }

    /* renamed from: d */
    public static Bitmap m12294d(Bitmap bitmap, int i10) {
        if (bitmap == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }

    /* renamed from: e */
    public static int m12295e(Context context, float f10) {
        return (int) TypedValue.applyDimension(2, f10, context.getResources().getDisplayMetrics());
    }
}
