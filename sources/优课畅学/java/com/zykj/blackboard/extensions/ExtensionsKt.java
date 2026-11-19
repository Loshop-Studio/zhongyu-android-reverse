package com.zykj.blackboard.extensions;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.os.Build;
import android.util.Log;
import android.webkit.WebView;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class ExtensionsKt {
    public static final Bitmap capture(WebView webView) {
        AbstractC9133u.m16133g(webView, "<this>");
        Bitmap bitmapCreateBitmap = Build.VERSION.SDK_INT >= 26 ? Bitmap.createBitmap(webView.getWidth(), webView.getHeight(), Bitmap.Config.RGB_565, false) : Bitmap.createBitmap(webView.getWidth(), webView.getHeight(), Bitmap.Config.RGB_565);
        webView.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public static final float getDistance(float f10, float f11, float f12, float f13) {
        return (float) Math.sqrt(Math.pow(f10 - f12, 2.0d) + Math.pow(f11 - f13, 2.0d));
    }

    public static final PointF getMidPoint(float f10, float f11, float f12, float f13) {
        PointF pointF = new PointF();
        float f14 = f10 + f12;
        float f15 = 2;
        pointF.set(f14 / f15, (f11 + f13) / f15);
        return pointF;
    }

    public static final float getRotation(float f10, float f11, float f12, float f13) {
        return (float) Math.toDegrees(Math.atan2(f11 - f13, f10 - f12));
    }

    /* renamed from: i */
    public static final void m7395i(String tag, String msg) {
        AbstractC9133u.m16133g(tag, "tag");
        AbstractC9133u.m16133g(msg, "msg");
        int length = 2000 - tag.length();
        while (msg.length() > length) {
            String strSubstring = msg.substring(0, length);
            AbstractC9133u.m16132f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            Log.i(tag, strSubstring);
            msg = msg.substring(length);
            AbstractC9133u.m16132f(msg, "this as java.lang.String).substring(startIndex)");
        }
        Log.i(tag, msg);
    }

    public static final float lineSpace(float f10, float f11, float f12, float f13) {
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        return (float) Math.sqrt((f14 * f14) + (f15 * f15));
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
}
