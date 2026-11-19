package com.xuexiang.xui.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: com.xuexiang.xui.utils.c */
/* loaded from: classes4.dex */
public abstract class AbstractC6873c {

    /* renamed from: a */
    public static final Canvas f7087a = new Canvas();

    /* renamed from: a */
    public static Bitmap m6429a(Bitmap bitmap, int i10, int i11, int i12, int i13, int i14) {
        if (i10 >= 0 && i11 >= 0 && i12 > 0 && i13 > 0) {
            try {
                return Bitmap.createBitmap(bitmap, i10, i11, i12, i13);
            } catch (IllegalArgumentException e10) {
                e10.printStackTrace();
            } catch (OutOfMemoryError e11) {
                e11.printStackTrace();
                if (i14 <= 0) {
                    return null;
                }
                System.gc();
                return m6429a(bitmap, i10, i11, i12, i13, i14 - 1);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static Bitmap m6430b(Drawable drawable) {
        Bitmap bitmapCreateBitmap;
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            bitmapCreateBitmap = Bitmap.createBitmap(1, 1, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* renamed from: c */
    public static Bitmap m6431c(Context context, int i10) {
        return m6430b(AbstractC6875e.m6452h(context, i10));
    }
}
