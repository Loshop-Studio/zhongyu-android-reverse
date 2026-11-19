package com.zykj.sketch.extensions;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build;
import android.support.v4.media.AbstractC0037f;
import android.util.Log;
import android.webkit.WebView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000F\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a7\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a-\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u001b\u001a=\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u001e\u001a=\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010\u001e\u001a=\u0010'\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020 ¢\u0006\u0004\b'\u0010(\u001a5\u0010*\u001a\u00020)2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b*\u0010+\u001a5\u0010,\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b,\u0010\u0017¨\u0006-"}, m5110d2 = {"", "tag", "", NotificationCompat.CATEGORY_MESSAGE, "", "isLogErr", "Ld6/s;", "logInfo", "(Ljava/lang/String;Ljava/lang/Object;Z)V", "i", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/webkit/WebView;", "Landroid/graphics/Bitmap;", "capture", "(Landroid/webkit/WebView;)Landroid/graphics/Bitmap;", "", "x", "y", "x1", "y1", "Landroid/graphics/Matrix;", "matrix", "getDistance", "(FFFFLandroid/graphics/Matrix;)F", "x2", "y2", "lineSpace", "(FFFF)F", "x0", "y0", "(FFFFFF)F", "pointToLine", "", "vertexPointX", "vertexPointY", "point0X", "point0Y", "point1X", "point1Y", "getDegree", "(IIIIII)I", "Landroid/graphics/PointF;", "getMidPoint", "(FFFFLandroid/graphics/Matrix;)Landroid/graphics/PointF;", "getRotation", "sketch_release"}, m5111k = 2, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class ExtensionsKt {
    @Nullable
    public static final Bitmap capture(@NotNull WebView webView) {
        Bitmap bitmapCreateBitmap;
        AbstractC5830k.m5330g(webView, "<this>");
        if (Build.VERSION.SDK_INT >= 26) {
            int width = webView.getWidth();
            int height = webView.getHeight();
            Bitmap.Config config = Bitmap.Config.RGB_565;
            bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565, false);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(webView.getWidth(), webView.getHeight(), Bitmap.Config.RGB_565);
        }
        webView.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public static final int getDegree(int i, int i8, int i9, int i10, int i11, int i12) {
        int i13 = i10 - i8;
        int i14 = i12 - i8;
        return (int) ((180 * Math.acos(((i13 * i14) + ((i9 - i) * (i11 - i))) / Math.sqrt((Math.abs(i14 * i14) + Math.abs(r4 * r4)) * (Math.abs(i13 * i13) + Math.abs(r2 * r2))))) / 3.141592653589793d);
    }

    public static final float getDistance(float f, float f7, float f8, float f9, @NotNull Matrix matrix) {
        AbstractC5830k.m5330g(matrix, "matrix");
        float[] fArr = new float[2];
        float[] fArr2 = new float[2];
        matrix.mapPoints(fArr, new float[]{f, f7});
        matrix.mapPoints(fArr2, new float[]{f8, f9});
        return (float) Math.sqrt(Math.pow(fArr[1] - fArr2[1], 2.0d) + Math.pow(fArr[0] - fArr2[0], 2.0d));
    }

    public static /* synthetic */ float getDistance$default(float f, float f7, float f8, float f9, Matrix matrix, int i, Object obj) {
        if ((i & 16) != 0) {
            matrix = new Matrix();
        }
        return getDistance(f, f7, f8, f9, matrix);
    }

    @NotNull
    public static final PointF getMidPoint(float f, float f7, float f8, float f9, @NotNull Matrix matrix) {
        AbstractC5830k.m5330g(matrix, "matrix");
        PointF pointF = new PointF();
        float[] fArr = new float[2];
        float[] fArr2 = new float[2];
        matrix.mapPoints(fArr, new float[]{f, f7});
        matrix.mapPoints(fArr2, new float[]{f8, f9});
        float f10 = 2;
        pointF.set((fArr[0] + fArr2[0]) / f10, (fArr[1] + fArr2[1]) / f10);
        return pointF;
    }

    public static final float getRotation(float f, float f7, float f8, float f9, @NotNull Matrix matrix) {
        AbstractC5830k.m5330g(matrix, "matrix");
        matrix.mapPoints(new float[2], new float[]{f, f7});
        matrix.mapPoints(new float[2], new float[]{f8, f9});
        return (float) Math.toDegrees(Math.atan2(r1[1] - r2[1], r1[0] - r2[0]));
    }

    /* renamed from: i */
    public static final void m4518i(@NotNull String tag, @NotNull String msg) {
        AbstractC5830k.m5330g(tag, "tag");
        AbstractC5830k.m5330g(msg, "msg");
        int length = 2000 - tag.length();
        while (msg.length() > length) {
            String strSubstring = msg.substring(0, length);
            AbstractC5830k.m5329f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            Log.i(tag, strSubstring);
            msg = msg.substring(length);
            AbstractC5830k.m5329f(msg, "this as java.lang.String).substring(startIndex)");
        }
        Log.i(tag, msg);
    }

    public static final float lineSpace(float f, float f7, float f8, float f9) {
        float f10 = f - f8;
        float f11 = f7 - f9;
        return (float) Math.sqrt((f11 * f11) + (f10 * f10));
    }

    public static final void logInfo(@NotNull String tag, @Nullable Object obj, boolean z8) {
        AbstractC5830k.m5330g(tag, "tag");
        if (obj instanceof String) {
            if (z8) {
                Log.e(tag, "[string]->>" + obj);
            } else {
                Log.i(tag, "[string]->>" + obj);
            }
        }
    }

    public static /* synthetic */ void logInfo$default(String str, Object obj, boolean z8, int i, Object obj2) {
        if ((i & 4) != 0) {
            z8 = false;
        }
        logInfo(str, obj, z8);
    }

    public static final float pointToLine(float f, float f7, float f8, float f9, float f10, float f11) {
        float fLineSpace = lineSpace(f, f7, f8, f9);
        float fLineSpace2 = lineSpace(f, f7, f10, f11);
        float fLineSpace3 = lineSpace(f8, f9, f10, f11);
        if (fLineSpace3 + fLineSpace2 == fLineSpace) {
            return 0.0f;
        }
        double d9 = fLineSpace;
        if (d9 <= 1.0E-6d) {
            return fLineSpace2;
        }
        float f12 = fLineSpace3 * fLineSpace3;
        float f13 = fLineSpace * fLineSpace;
        float f14 = fLineSpace2 * fLineSpace2;
        if (f12 >= f13 + f14) {
            System.out.println((Object) "组成直角三角形或钝角三角形，(x1,y1)为直角或钝角  ");
            return fLineSpace2;
        }
        if (f14 >= f13 + f12) {
            System.out.println((Object) "组成直角三角形或钝角三角形，(x2,y2)为直角或钝角 ");
            return fLineSpace3;
        }
        System.out.println((Object) "组成锐角三角形，则求三角形的高  ");
        float f15 = ((fLineSpace + fLineSpace2) + fLineSpace3) / 2;
        return (float) ((2 * Math.sqrt((f15 - fLineSpace3) * ((f15 - fLineSpace2) * ((f15 - fLineSpace) * f15)))) / d9);
    }

    public static final float getDistance(float f, float f7, float f8, float f9, float f10, float f11) {
        return Math.abs(((f10 - f8) * f9) + AbstractC0037f.m77b(f9, f11, f8, (f7 * (f8 - f10)) + (f * (f11 - f9)))) / ((float) Math.sqrt((r1 * r1) + (r0 * r0)));
    }
}
