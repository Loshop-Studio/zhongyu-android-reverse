package com.zykj.sketch.extensions;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build;
import android.util.Log;
import android.webkit.WebView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13412d1 = {"\u0000H\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a6\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001\u001a0\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u001a6\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t\u001a.\u0010\u0014\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f\u001a.\u0010\u0016\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a\u001a&\u0010\u001c\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t\u001a\"\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 \u001a6\u0010!\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t\u001a\f\u0010\"\u001a\u0004\u0018\u00010#*\u00020$¨\u0006%"}, m13413d2 = {"getDegree", "", "vertexPointX", "vertexPointY", "point0X", "point0Y", "point1X", "point1Y", "getDistance", "", "x", "y", "x1", "y1", "matrix", "Landroid/graphics/Matrix;", "x0", "y0", "x2", "y2", "getMidPoint", "Landroid/graphics/PointF;", "getRotation", "i", "", "tag", "", NotificationCompat.CATEGORY_MESSAGE, "lineSpace", "logInfo", "", "isLogErr", "", "pointToLine", "capture", "Landroid/graphics/Bitmap;", "Landroid/webkit/WebView;", "sketch_release"}, m13414k = 2, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final class ExtensionsKt {
    public static final Bitmap capture(WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "<this>");
        Bitmap bitmapCreateBitmap = Build.VERSION.SDK_INT >= 26 ? Bitmap.createBitmap(webView.getWidth(), webView.getHeight(), Bitmap.Config.RGB_565, false) : Bitmap.createBitmap(webView.getWidth(), webView.getHeight(), Bitmap.Config.RGB_565);
        webView.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public static final int getDegree(int i9, int i10, int i11, int i12, int i13, int i14) {
        return (int) ((180 * Math.acos((((i11 - i9) * (i13 - i9)) + ((i12 - i10) * (i14 - i10))) / Math.sqrt((Math.abs(r2 * r2) + Math.abs(r3 * r3)) * (Math.abs(r4 * r4) + Math.abs(r5 * r5))))) / 3.141592653589793d);
    }

    public static final float getDistance(float f10, float f11, float f12, float f13, Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        matrix.mapPoints(new float[2], new float[]{f10, f11});
        matrix.mapPoints(new float[2], new float[]{f12, f13});
        return (float) Math.sqrt(Math.pow(r1[0] - r2[0], 2.0d) + Math.pow(r1[1] - r2[1], 2.0d));
    }

    public static /* synthetic */ float getDistance$default(float f10, float f11, float f12, float f13, Matrix matrix, int i9, Object obj) {
        if ((i9 & 16) != 0) {
            matrix = new Matrix();
        }
        return getDistance(f10, f11, f12, f13, matrix);
    }

    public static final PointF getMidPoint(float f10, float f11, float f12, float f13, Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        PointF pointF = new PointF();
        float[] fArr = new float[2];
        float[] fArr2 = new float[2];
        matrix.mapPoints(fArr, new float[]{f10, f11});
        matrix.mapPoints(fArr2, new float[]{f12, f13});
        float f14 = 2;
        pointF.set((fArr[0] + fArr2[0]) / f14, (fArr[1] + fArr2[1]) / f14);
        return pointF;
    }

    public static final float getRotation(float f10, float f11, float f12, float f13, Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        matrix.mapPoints(new float[2], new float[]{f10, f11});
        matrix.mapPoints(new float[2], new float[]{f12, f13});
        return (float) Math.toDegrees(Math.atan2(r1[1] - r2[1], r1[0] - r2[0]));
    }

    /* renamed from: i */
    public static final void m9907i(String tag, String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        int length = 2000 - tag.length();
        while (msg.length() > length) {
            String strSubstring = msg.substring(0, length);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            Log.i(tag, strSubstring);
            msg = msg.substring(length);
            Intrinsics.checkNotNullExpressionValue(msg, "this as java.lang.String).substring(startIndex)");
        }
        Log.i(tag, msg);
    }

    public static final float lineSpace(float f10, float f11, float f12, float f13) {
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        return (float) Math.sqrt((f14 * f14) + (f15 * f15));
    }

    public static final void logInfo(String tag, Object obj, boolean z9) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (obj instanceof String) {
            if (z9) {
                Log.e(tag, "[string]->>" + obj);
                return;
            }
            Log.i(tag, "[string]->>" + obj);
        }
    }

    public static /* synthetic */ void logInfo$default(String str, Object obj, boolean z9, int i9, Object obj2) {
        if ((i9 & 4) != 0) {
            z9 = false;
        }
        logInfo(str, obj, z9);
    }

    public static final float pointToLine(float f10, float f11, float f12, float f13, float f14, float f15) {
        float fLineSpace = lineSpace(f10, f11, f12, f13);
        float fLineSpace2 = lineSpace(f10, f11, f14, f15);
        float fLineSpace3 = lineSpace(f12, f13, f14, f15);
        if (fLineSpace3 + fLineSpace2 == fLineSpace) {
            return 0.0f;
        }
        double d10 = fLineSpace;
        if (d10 <= 1.0E-6d) {
            return fLineSpace2;
        }
        float f16 = fLineSpace3 * fLineSpace3;
        float f17 = fLineSpace * fLineSpace;
        float f18 = fLineSpace2 * fLineSpace2;
        if (f16 >= f17 + f18) {
            System.out.println((Object) "组成直角三角形或钝角三角形，(x1,y1)为直角或钝角  ");
            return fLineSpace2;
        }
        if (f18 >= f17 + f16) {
            System.out.println((Object) "组成直角三角形或钝角三角形，(x2,y2)为直角或钝角 ");
            return fLineSpace3;
        }
        System.out.println((Object) "组成锐角三角形，则求三角形的高  ");
        float f19 = ((fLineSpace + fLineSpace2) + fLineSpace3) / 2;
        return (float) ((2 * Math.sqrt((((f19 - fLineSpace) * f19) * (f19 - fLineSpace2)) * (f19 - fLineSpace3))) / d10);
    }

    public static final float getDistance(float f10, float f11, float f12, float f13, float f14, float f15) {
        return Math.abs((((f10 * (f15 - f13)) + (f11 * (f12 - f14))) + ((f13 - f15) * f12)) + ((f14 - f12) * f13)) / ((float) Math.sqrt((r0 * r0) + (r1 * r1)));
    }
}
