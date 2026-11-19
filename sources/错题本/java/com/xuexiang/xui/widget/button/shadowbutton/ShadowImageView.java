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

/* loaded from: classes3.dex */
public class ShadowImageView extends AppCompatImageView {

    /* renamed from: a */
    public int f4161a;

    /* renamed from: b */
    public int f4162b;

    /* renamed from: c */
    public int f4163c;

    /* renamed from: d */
    public int f4164d;

    /* renamed from: e */
    public Paint f4165e;

    /* renamed from: f */
    public int f4166f;

    /* renamed from: g */
    public int f4167g;

    /* renamed from: h */
    public RectF f4168h;

    public ShadowImageView(Context context) {
        super(context);
        this.f4163c = 48;
        init(context, null);
    }

    public int getPressedColor() {
        return this.f4164d;
    }

    public final void init(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ShadowButton);
        this.f4164d = typedArrayObtainStyledAttributes.getColor(R$styleable.ShadowButton_sb_color_pressed, getResources().getColor(R$color.default_shadow_button_color_pressed));
        this.f4163c = typedArrayObtainStyledAttributes.getInteger(R$styleable.ShadowButton_sb_alpha_pressed, this.f4163c);
        this.f4166f = typedArrayObtainStyledAttributes.getInt(R$styleable.ShadowButton_sb_shape_type, 1);
        this.f4167g = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ShadowButton_sb_radius, getResources().getDimensionPixelSize(R$dimen.default_shadow_button_radius));
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f4165e = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f4165e.setColor(this.f4164d);
        setWillNotDraw(false);
        this.f4165e.setAlpha(0);
        this.f4165e.setAntiAlias(true);
        setDrawingCacheEnabled(true);
        setClickable(true);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.f4165e;
        if (paint == null) {
            return;
        }
        if (this.f4166f == 0) {
            int i = this.f4161a;
            canvas.drawCircle(i / 2.0f, this.f4162b / 2.0f, i / 2.1038f, paint);
        } else {
            RectF rectF = this.f4168h;
            int i8 = this.f4167g;
            canvas.drawRoundRect(rectF, i8, i8, paint);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i8, int i9, int i10) {
        super.onSizeChanged(i, i8, i9, i10);
        this.f4161a = i;
        this.f4162b = i8;
        this.f4168h = new RectF(0.0f, 0.0f, this.f4161a, this.f4162b);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f4165e.setAlpha(this.f4163c);
            invalidate();
        } else if (action == 1 || action == 3) {
            this.f4165e.setAlpha(0);
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setPressedColor(int i) {
        this.f4165e.setColor(this.f4164d);
        invalidate();
    }

    public ShadowImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4163c = 48;
        init(context, attributeSet);
    }

    public ShadowImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4163c = 48;
        init(context, attributeSet);
    }
}
