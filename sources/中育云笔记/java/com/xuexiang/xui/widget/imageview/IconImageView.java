package com.xuexiang.xui.widget.imageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC8040f;
import com.xuexiang.xui.utils.AbstractC8041g;
import com.xuexiang.xui.utils.AbstractC8042h;

/* loaded from: classes5.dex */
public class IconImageView extends AppCompatImageView {

    /* renamed from: c */
    public Bitmap f16045c;

    /* renamed from: d */
    public float f16046d;

    /* renamed from: e */
    public Paint f16047e;

    /* renamed from: f */
    public boolean f16048f;

    public IconImageView(Context context) {
        super(context);
        this.f16046d = 0.3f;
        this.f16048f = true;
        m12699b(context, null);
    }

    /* renamed from: c */
    private void m12697c() {
        Paint paint = new Paint();
        this.f16047e = paint;
        paint.setColor(AbstractC8041g.m12217d(getContext(), R$attr.colorAccent));
        this.f16047e.setAntiAlias(true);
        this.f16047e.setFilterBitmap(true);
        this.f16047e.setStyle(Paint.Style.STROKE);
        this.f16047e.setStrokeCap(Paint.Cap.ROUND);
    }

    /* renamed from: a */
    public final RectF m12698a(Bitmap bitmap) {
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
        float width2 = (getWidth() - (height * this.f16046d)) / 2.0f;
        float height4 = (getHeight() - (height2 * this.f16046d)) / 2.0f;
        return new RectF(width2, height4, getWidth() - width2, getHeight() - height4);
    }

    /* renamed from: b */
    public final void m12699b(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.IconImageView);
            Drawable drawableM12206g = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.IconImageView_iiv_icon_res);
            if (drawableM12206g != null) {
                this.f16045c = AbstractC8042h.m12229c(drawableM12206g);
            }
            this.f16046d = typedArrayObtainStyledAttributes.getFloat(R$styleable.IconImageView_iiv_icon_scale, this.f16046d);
            this.f16048f = typedArrayObtainStyledAttributes.getBoolean(R$styleable.IconImageView_iiv_is_show, this.f16048f);
            typedArrayObtainStyledAttributes.recycle();
        }
        m12697c();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.f16045c;
        if (bitmap == null || !this.f16048f) {
            return;
        }
        canvas.drawBitmap(bitmap, (Rect) null, m12698a(bitmap), this.f16047e);
    }

    public IconImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16046d = 0.3f;
        this.f16048f = true;
        m12699b(context, attributeSet);
    }

    public IconImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16046d = 0.3f;
        this.f16048f = true;
        m12699b(context, attributeSet);
    }
}
