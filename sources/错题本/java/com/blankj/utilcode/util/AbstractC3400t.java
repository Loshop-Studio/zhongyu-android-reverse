package com.blankj.utilcode.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

/* renamed from: com.blankj.utilcode.util.t */
/* loaded from: classes2.dex */
public abstract class AbstractC3400t {

    /* renamed from: a */
    public Toast f2178a = new Toast(AbstractC3382c.m2303d());

    /* renamed from: b */
    public final C3404x f2179b;

    /* renamed from: c */
    public View f2180c;

    public AbstractC3400t(C3404x c3404x) {
        this.f2179b = c3404x;
        C3404x c3404x2 = C3404x.f2187b;
        c3404x.getClass();
    }

    /* renamed from: a */
    public void mo2351a() {
        Toast toast = this.f2178a;
        if (toast != null) {
            toast.cancel();
        }
        this.f2178a = null;
        this.f2180c = null;
    }

    /* renamed from: b */
    public final ImageView m2352b(int i) {
        Bitmap bitmapCreateBitmap;
        Bitmap bitmap;
        View view = this.f2180c;
        if (view == null) {
            bitmap = null;
        } else {
            boolean zIsDrawingCacheEnabled = view.isDrawingCacheEnabled();
            boolean zWillNotCacheDrawing = view.willNotCacheDrawing();
            view.setDrawingCacheEnabled(true);
            view.setWillNotCacheDrawing(false);
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache == null || drawingCache.isRecycled()) {
                view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                view.buildDrawingCache();
                Bitmap drawingCache2 = view.getDrawingCache();
                if (drawingCache2 == null || drawingCache2.isRecycled()) {
                    bitmapCreateBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.RGB_565);
                    view.draw(new Canvas(bitmapCreateBitmap));
                } else {
                    bitmapCreateBitmap = Bitmap.createBitmap(drawingCache2);
                }
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(drawingCache);
            }
            view.setWillNotCacheDrawing(zWillNotCacheDrawing);
            view.setDrawingCacheEnabled(zIsDrawingCacheEnabled);
            bitmap = bitmapCreateBitmap;
        }
        ImageView imageView = new ImageView(AbstractC3382c.m2303d());
        imageView.setTag("TAG_TOAST" + i);
        imageView.setImageBitmap(bitmap);
        return imageView;
    }

    /* renamed from: c */
    public final void m2353c() {
        if (TextUtils.getLayoutDirectionFromLocale(AbstractC3382c.m2303d().getResources().getConfiguration().getLocales().get(0)) == 1) {
            ImageView imageViewM2352b = m2352b(-1);
            this.f2180c = imageViewM2352b;
            this.f2178a.setView(imageViewM2352b);
        }
    }

    /* renamed from: d */
    public abstract void mo2354d();
}
