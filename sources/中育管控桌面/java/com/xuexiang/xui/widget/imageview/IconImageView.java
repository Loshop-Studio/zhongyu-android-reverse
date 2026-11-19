package com.xuexiang.xui.widget.imageview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes3.dex */
public class IconImageView extends AppCompatImageView {

    /* renamed from: a */
    public Bitmap f4994a;

    /* renamed from: b */
    public float f4995b;

    /* renamed from: c */
    public Paint f4996c;

    /* renamed from: d */
    public boolean f4997d;

    /* renamed from: a */
    public final RectF m4679a(Bitmap bitmap) {
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
        float width2 = (getWidth() - (height * this.f4995b)) / 2.0f;
        float height4 = (getHeight() - (height2 * this.f4995b)) / 2.0f;
        return new RectF(width2, height4, getWidth() - width2, getHeight() - height4);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.f4994a;
        if (bitmap == null || !this.f4997d) {
            return;
        }
        canvas.drawBitmap(bitmap, (Rect) null, m4679a(bitmap), this.f4996c);
    }
}
