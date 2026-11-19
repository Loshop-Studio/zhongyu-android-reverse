package com.xuexiang.xui.widget.imageview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes4.dex */
public class IconImageView extends AppCompatImageView {

    /* renamed from: a */
    public Bitmap f7674a;

    /* renamed from: b */
    public float f7675b;

    /* renamed from: c */
    public Paint f7676c;

    /* renamed from: d */
    public boolean f7677d;

    /* renamed from: a */
    public final RectF m6848a(Bitmap bitmap) {
        float height;
        float height2;
        float width = bitmap.getWidth();
        float height3 = bitmap.getHeight();
        if (width >= height3) {
            height2 = (getWidth() / width) * height3;
            height = getWidth();
        } else {
            height = (getHeight() / height3) * width;
            height2 = getHeight();
        }
        float width2 = (getWidth() - (height * this.f7675b)) / 2.0f;
        float height4 = (getHeight() - (height2 * this.f7675b)) / 2.0f;
        return new RectF(width2, height4, getWidth() - width2, getHeight() - height4);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.f7674a;
        if (bitmap == null || !this.f7677d) {
            return;
        }
        canvas.drawBitmap(bitmap, (Rect) null, m6848a(bitmap), this.f7676c);
    }
}
