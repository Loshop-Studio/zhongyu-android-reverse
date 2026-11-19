package com.zykj.sketch.extensions;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build;
import android.util.Log;
import android.webkit.WebView;
import com.alibaba.fastjson.asm.Opcodes;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes6.dex */
public final class ExtensionsKt {
    public static final Bitmap capture(WebView webView) {
        AbstractC9979u.m20294g(webView, "<this>");
        Bitmap bitmapCreateBitmap = Build.VERSION.SDK_INT >= 26 ? Bitmap.createBitmap(webView.getWidth(), webView.getHeight(), Bitmap.Config.RGB_565, false) : Bitmap.createBitmap(webView.getWidth(), webView.getHeight(), Bitmap.Config.RGB_565);
        webView.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public static final int getDegree(int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16 = i12 - i10;
        int i17 = i14 - i10;
        int i18 = i13 - i11;
        int i19 = i15 - i11;
        return (int) ((Opcodes.GETFIELD * Math.acos(((i16 * i17) + (i18 * i19)) / Math.sqrt((Math.abs(i16 * i16) + Math.abs(i18 * i18)) * (Math.abs(i17 * i17) + Math.abs(i19 * i19))))) / 3.141592653589793d);
    }

    public static final float getDistance(float f10, float f11, float f12, float f13, Matrix matrix) {
        AbstractC9979u.m20294g(matrix, "matrix");
        matrix.mapPoints(new float[2], new float[]{f10, f11});
        matrix.mapPoints(new float[2], new float[]{f12, f13});
        return (float) Math.sqrt(Math.pow(r1[0] - r2[0], 2.0d) + Math.pow(r1[1] - r2[1], 2.0d));
    }

    public static /* synthetic */ float getDistance$default(float f10, float f11, float f12, float f13, Matrix matrix, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            matrix = new Matrix();
        }
        return getDistance(f10, f11, f12, f13, matrix);
    }

    public static final PointF getMidPoint(float f10, float f11, float f12, float f13, Matrix matrix) {
        AbstractC9979u.m20294g(matrix, "matrix");
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
        AbstractC9979u.m20294g(matrix, "matrix");
        matrix.mapPoints(new float[2], new float[]{f10, f11});
        matrix.mapPoints(new float[2], new float[]{f12, f13});
        return (float) Math.toDegrees(Math.atan2(r1[1] - r2[1], r1[0] - r2[0]));
    }

    /* renamed from: i */
    public static final void m16653i(String tag, String msg) {
        AbstractC9979u.m20294g(tag, "tag");
        AbstractC9979u.m20294g(msg, "msg");
        int length = 2000 - tag.length();
        while (msg.length() > length) {
            String strSubstring = msg.substring(0, length);
            AbstractC9979u.m20293f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            Log.i(tag, strSubstring);
            msg = msg.substring(length);
            AbstractC9979u.m20293f(msg, "this as java.lang.String).substring(startIndex)");
        }
        Log.i(tag, msg);
    }

    public static final float lineSpace(float f10, float f11, float f12, float f13) {
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        return (float) Math.sqrt((f14 * f14) + (f15 * f15));
    }

    public static final void logInfo(String tag, Object obj, boolean z10) {
        AbstractC9979u.m20294g(tag, "tag");
        if (obj instanceof String) {
            if (z10) {
                Log.e(tag, "[string]->>" + obj);
                return;
            }
            Log.i(tag, "[string]->>" + obj);
        }
    }

    public static /* synthetic */ void logInfo$default(String str, Object obj, boolean z10, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        logInfo(str, obj, z10);
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
