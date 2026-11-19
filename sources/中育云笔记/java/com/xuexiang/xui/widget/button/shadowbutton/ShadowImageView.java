package com.xuexiang.xui.widget.button.shadowbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatImageView;
import com.xuexiang.xui.R$color;
import com.xuexiang.xui.R$dimen;
import com.xuexiang.xui.R$styleable;

/* loaded from: classes5.dex */
public class ShadowImageView extends AppCompatImageView {

    /* renamed from: c */
    public int f15652c;

    /* renamed from: d */
    public int f15653d;

    /* renamed from: e */
    public int f15654e;

    /* renamed from: f */
    public int f15655f;

    /* renamed from: g */
    public Paint f15656g;

    /* renamed from: h */
    public int f15657h;

    /* renamed from: i */
    public int f15658i;

    /* renamed from: j */
    public RectF f15659j;

    public ShadowImageView(Context context) {
        super(context);
        this.f15654e = 48;
        init(context, null);
    }

    private void init(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ShadowButton);
        this.f15655f = typedArrayObtainStyledAttributes.getColor(R$styleable.ShadowButton_sb_color_pressed, getResources().getColor(R$color.default_shadow_button_color_pressed));
        this.f15654e = typedArrayObtainStyledAttributes.getInteger(R$styleable.ShadowButton_sb_alpha_pressed, this.f15654e);
        this.f15657h = typedArrayObtainStyledAttributes.getInt(R$styleable.ShadowButton_sb_shape_type, 1);
        this.f15658i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ShadowButton_sb_radius, getResources().getDimensionPixelSize(R$dimen.default_shadow_button_radius));
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f15656g = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f15656g.setColor(this.f15655f);
        setWillNotDraw(false);
        this.f15656g.setAlpha(0);
        this.f15656g.setAntiAlias(true);
        setDrawingCacheEnabled(true);
        setClickable(true);
    }

    public int getPressedColor() {
        return this.f15655f;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.f15656g;
        if (paint == null) {
            return;
        }
        if (this.f15657h == 0) {
            int i10 = this.f15652c;
            canvas.drawCircle(i10 / 2.0f, this.f15653d / 2.0f, i10 / 2.1038f, paint);
        } else {
            RectF rectF = this.f15659j;
            int i11 = this.f15658i;
            canvas.drawRoundRect(rectF, i11, i11, paint);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f15652c = i10;
        this.f15653d = i11;
        this.f15659j = new RectF(0.0f, 0.0f, this.f15652c, this.f15653d);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f15656g.setAlpha(this.f15654e);
            invalidate();
        } else if (action == 1 || action == 3) {
            this.f15656g.setAlpha(0);
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setPressedColor(int i10) {
        this.f15656g.setColor(this.f15655f);
        invalidate();
    }

    public ShadowImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15654e = 48;
        init(context, attributeSet);
    }

    public ShadowImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f15654e = 48;
        init(context, attributeSet);
    }
}
