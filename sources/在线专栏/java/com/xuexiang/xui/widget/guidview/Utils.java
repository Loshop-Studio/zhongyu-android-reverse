package com.xuexiang.xui.widget.guidview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.view.View;
import anet.channel.strategy.dispatch.DispatchConstants;

/* loaded from: classes.dex */
class Utils {
    Utils() {
    }

    static int[] calculateFocusPointValues(View view, double d4, int i4) {
        int[] iArr = new int[3];
        if (view == null) {
            return null;
        }
        int[] iArr2 = new int[2];
        view.getLocationInWindow(iArr2);
        iArr[0] = iArr2[0] + (view.getWidth() / 2);
        iArr[1] = (iArr2[1] + (view.getHeight() / 2)) - i4;
        iArr[2] = (int) (((int) (Math.hypot(view.getWidth(), view.getHeight()) / 2.0d)) * d4);
        return iArr;
    }

    static void drawFocusCircle(Bitmap bitmap, int[] iArr, int i4) {
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new Canvas(bitmap).drawCircle(iArr[0], iArr[1], i4, paint);
    }

    static int getStatusBarHeight(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", DispatchConstants.ANDROID);
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    static boolean shouldShowCircularAnimation() {
        return true;
    }
}
