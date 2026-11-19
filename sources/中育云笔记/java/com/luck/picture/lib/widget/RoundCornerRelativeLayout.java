package com.luck.picture.lib.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.luck.picture.lib.R$styleable;

/* loaded from: classes5.dex */
public class RoundCornerRelativeLayout extends RelativeLayout {

    /* renamed from: c */
    public final Path f12628c;

    /* renamed from: d */
    public final float f12629d;

    /* renamed from: e */
    public final boolean f12630e;

    /* renamed from: f */
    public final boolean f12631f;

    /* renamed from: g */
    public final RectF f12632g;

    public RoundCornerRelativeLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f12628c);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f12628c.reset();
        RectF rectF = this.f12632g;
        rectF.right = i10;
        rectF.bottom = i11;
        boolean z10 = this.f12630e;
        if (!z10 && !this.f12631f) {
            Path path = this.f12628c;
            float f10 = this.f12629d;
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
            return;
        }
        if (z10) {
            float f11 = this.f12629d;
            this.f12628c.addRoundRect(rectF, new float[]{0.0f, 0.0f, 0.0f, 0.0f, f11, f11, f11, f11}, Path.Direction.CW);
        }
        if (this.f12631f) {
            float f12 = this.f12629d;
            this.f12628c.addRoundRect(this.f12632g, new float[]{f12, f12, f12, f12, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
        }
    }

    public RoundCornerRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundCornerRelativeLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12632g = new RectF();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.PictureRoundCornerRelativeLayout, i10, 0);
        this.f12629d = typedArrayObtainStyledAttributes.getDimension(R$styleable.PictureRoundCornerRelativeLayout_psCorners, 0.0f);
        this.f12630e = typedArrayObtainStyledAttributes.getBoolean(R$styleable.PictureRoundCornerRelativeLayout_psTopNormal, false);
        this.f12631f = typedArrayObtainStyledAttributes.getBoolean(R$styleable.PictureRoundCornerRelativeLayout_psBottomNormal, false);
        typedArrayObtainStyledAttributes.recycle();
        this.f12628c = new Path();
    }
}
