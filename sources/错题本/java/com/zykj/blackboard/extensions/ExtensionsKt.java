package com.zykj.blackboard.extensions;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.os.Build;
import android.util.Log;
import android.webkit.WebView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010\u001a-\u0010\u0013\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0010\u001a=\u0010\u0016\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017\u001a-\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001a\u001a-\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, m5110d2 = {"", "tag", NotificationCompat.CATEGORY_MESSAGE, "Ld6/s;", "i", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/webkit/WebView;", "Landroid/graphics/Bitmap;", "capture", "(Landroid/webkit/WebView;)Landroid/graphics/Bitmap;", "", "x", "y", "x1", "y1", "getDistance", "(FFFF)F", "x2", "y2", "lineSpace", "x0", "y0", "pointToLine", "(FFFFFF)F", "Landroid/graphics/PointF;", "getMidPoint", "(FFFF)Landroid/graphics/PointF;", "getRotation", "blackboard_release"}, m5111k = 2, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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

    public static final float getDistance(float f, float f7, float f8, float f9) {
        return (float) Math.sqrt(Math.pow(f7 - f9, 2.0d) + Math.pow(f - f8, 2.0d));
    }

    @NotNull
    public static final PointF getMidPoint(float f, float f7, float f8, float f9) {
        PointF pointF = new PointF();
        float f10 = f + f8;
        float f11 = 2;
        pointF.set(f10 / f11, (f7 + f9) / f11);
        return pointF;
    }

    public static final float getRotation(float f, float f7, float f8, float f9) {
        return (float) Math.toDegrees(Math.atan2(f7 - f9, f - f8));
    }

    /* renamed from: i */
    public static final void m3678i(@NotNull String tag, @NotNull String msg) {
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
}
