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
import androidx.compose.material3.AbstractC1923c;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$styleable;
import kotlin.collections.AbstractC5806u;
import p169t6.AbstractC6600a;

/* loaded from: classes3.dex */
public class IconImageView extends AppCompatImageView {

    /* renamed from: a */
    public Bitmap f4324a;

    /* renamed from: b */
    public float f4325b;

    /* renamed from: c */
    public Paint f4326c;

    /* renamed from: d */
    public boolean f4327d;

    public IconImageView(Context context) {
        super(context);
        this.f4325b = 0.3f;
        this.f4327d = true;
        m3490a(context, null);
    }

    /* renamed from: a */
    public final void m3490a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.IconImageView);
            getContext();
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.IconImageView_iiv_icon_res);
            if (drawable != null) {
                this.f4324a = AbstractC6600a.m6232c(drawable);
            }
            this.f4325b = typedArrayObtainStyledAttributes.getFloat(R$styleable.IconImageView_iiv_icon_scale, this.f4325b);
            this.f4327d = typedArrayObtainStyledAttributes.getBoolean(R$styleable.IconImageView_iiv_is_show, this.f4327d);
            typedArrayObtainStyledAttributes.recycle();
        }
        Paint paint = new Paint();
        this.f4326c = paint;
        paint.setColor(AbstractC5806u.m5252F(getContext(), R$attr.colorAccent, 0));
        this.f4326c.setAntiAlias(true);
        this.f4326c.setFilterBitmap(true);
        this.f4326c.setStyle(Paint.Style.STROKE);
        this.f4326c.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        float height;
        float height2;
        super.onDraw(canvas);
        Bitmap bitmap = this.f4324a;
        if (bitmap == null || !this.f4327d) {
            return;
        }
        float width = bitmap.getWidth();
        float height3 = bitmap.getHeight();
        if (width >= height3) {
            height2 = (getWidth() / width) * height3;
            height = getWidth();
        } else {
            height = width * (getHeight() / height3);
            height2 = getHeight();
        }
        float fM1037a = AbstractC1923c.m1037a(height, this.f4325b, getWidth(), 2.0f);
        float fM1037a2 = AbstractC1923c.m1037a(height2, this.f4325b, getHeight(), 2.0f);
        canvas.drawBitmap(bitmap, (Rect) null, new RectF(fM1037a, fM1037a2, getWidth() - fM1037a, getHeight() - fM1037a2), this.f4326c);
    }

    public IconImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4325b = 0.3f;
        this.f4327d = true;
        m3490a(context, attributeSet);
    }

    public IconImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4325b = 0.3f;
        this.f4327d = true;
        m3490a(context, attributeSet);
    }
}
