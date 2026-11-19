package com.jaredrummler.android.colorpicker;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.Toast;
import androidx.annotation.ColorInt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import java.util.Locale;
import p185n1.AbstractC9086c;
import p185n1.C9084a;

/* loaded from: classes4.dex */
public class ColorPanelView extends View {

    /* renamed from: a */
    public Drawable f5120a;

    /* renamed from: b */
    public Paint f5121b;

    /* renamed from: c */
    public Paint f5122c;

    /* renamed from: d */
    public Paint f5123d;

    /* renamed from: e */
    public Paint f5124e;

    /* renamed from: f */
    public Rect f5125f;

    /* renamed from: g */
    public Rect f5126g;

    /* renamed from: h */
    public RectF f5127h;

    /* renamed from: i */
    public boolean f5128i;

    /* renamed from: j */
    public int f5129j;

    /* renamed from: k */
    public int f5130k;

    /* renamed from: l */
    public int f5131l;

    /* renamed from: m */
    public int f5132m;

    public ColorPanelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void m4502a(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ColorPanelView);
        this.f5132m = typedArrayObtainStyledAttributes.getInt(R$styleable.ColorPanelView_cpv_colorShape, 1);
        boolean z9 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPanelView_cpv_showOldColor, false);
        this.f5128i = z9;
        if (z9 && this.f5132m != 1) {
            throw new IllegalStateException("Color preview is only available in circle mode");
        }
        this.f5130k = typedArrayObtainStyledAttributes.getColor(R$styleable.ColorPanelView_cpv_borderColor, -9539986);
        typedArrayObtainStyledAttributes.recycle();
        if (this.f5130k == -9539986) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.textColorSecondary});
            this.f5130k = typedArrayObtainStyledAttributes2.getColor(0, this.f5130k);
            typedArrayObtainStyledAttributes2.recycle();
        }
        this.f5129j = AbstractC9086c.m14578a(context, 1.0f);
        Paint paint = new Paint();
        this.f5121b = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f5122c = paint2;
        paint2.setAntiAlias(true);
        if (this.f5128i) {
            this.f5124e = new Paint();
        }
        if (this.f5132m == 1) {
            Bitmap bitmap = ((BitmapDrawable) context.getResources().getDrawable(R$drawable.cpv_alpha)).getBitmap();
            Paint paint3 = new Paint();
            this.f5123d = paint3;
            paint3.setAntiAlias(true);
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.f5123d.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        }
    }

    /* renamed from: b */
    public final void m4503b() {
        int i9 = this.f5125f.left;
        int i10 = this.f5129j;
        this.f5127h = new RectF(i9 + i10, r0.top + i10, r0.right - i10, r0.bottom - i10);
    }

    /* renamed from: c */
    public final void m4504c() {
        Rect rect = this.f5125f;
        int i9 = rect.left;
        int i10 = this.f5129j;
        this.f5126g = new Rect(i9 + i10, rect.top + i10, rect.right - i10, rect.bottom - i10);
        C9084a c9084a = new C9084a(AbstractC9086c.m14578a(getContext(), 4.0f));
        this.f5120a = c9084a;
        c9084a.setBounds(Math.round(this.f5126g.left), Math.round(this.f5126g.top), Math.round(this.f5126g.right), Math.round(this.f5126g.bottom));
    }

    /* renamed from: d */
    public void m4505d() {
        int[] iArr = new int[2];
        Rect rect = new Rect();
        getLocationOnScreen(iArr);
        getWindowVisibleDisplayFrame(rect);
        Context context = getContext();
        int width = getWidth();
        int height = getHeight();
        int i9 = iArr[1] + (height / 2);
        int i10 = iArr[0] + (width / 2);
        if (ViewCompat.getLayoutDirection(this) == 0) {
            i10 = context.getResources().getDisplayMetrics().widthPixels - i10;
        }
        StringBuilder sb = new StringBuilder("#");
        if (Color.alpha(this.f5131l) != 255) {
            sb.append(Integer.toHexString(this.f5131l).toUpperCase(Locale.ENGLISH));
        } else {
            sb.append(String.format("%06X", Integer.valueOf(16777215 & this.f5131l)).toUpperCase(Locale.ENGLISH));
        }
        Toast toastMakeText = Toast.makeText(context, sb.toString(), 0);
        if (i9 < rect.height()) {
            toastMakeText.setGravity(8388661, i10, (iArr[1] + height) - rect.top);
        } else {
            toastMakeText.setGravity(81, 0, height);
        }
        toastMakeText.show();
    }

    public int getBorderColor() {
        return this.f5130k;
    }

    public int getColor() {
        return this.f5131l;
    }

    public int getShape() {
        return this.f5132m;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.f5121b.setColor(this.f5130k);
        this.f5122c.setColor(this.f5131l);
        int i9 = this.f5132m;
        if (i9 == 0) {
            if (this.f5129j > 0) {
                canvas.drawRect(this.f5125f, this.f5121b);
            }
            Drawable drawable = this.f5120a;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            canvas.drawRect(this.f5126g, this.f5122c);
            return;
        }
        if (i9 == 1) {
            int measuredWidth = getMeasuredWidth() / 2;
            if (this.f5129j > 0) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth, this.f5121b);
            }
            if (Color.alpha(this.f5131l) < 255) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - this.f5129j, this.f5123d);
            }
            if (!this.f5128i) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - this.f5129j, this.f5122c);
            } else {
                canvas.drawArc(this.f5127h, 90.0f, 180.0f, true, this.f5124e);
                canvas.drawArc(this.f5127h, 270.0f, 180.0f, true, this.f5122c);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        int i11 = this.f5132m;
        if (i11 == 0) {
            setMeasuredDimension(View.MeasureSpec.getSize(i9), View.MeasureSpec.getSize(i10));
        } else if (i11 != 1) {
            super.onMeasure(i9, i10);
        } else {
            super.onMeasure(i9, i9);
            setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth());
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f5131l = bundle.getInt(TypedValues.Custom.S_COLOR);
            parcelable = bundle.getParcelable("instanceState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt(TypedValues.Custom.S_COLOR, this.f5131l);
        return bundle;
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        if (this.f5132m == 0 || this.f5128i) {
            Rect rect = new Rect();
            this.f5125f = rect;
            rect.left = getPaddingLeft();
            this.f5125f.right = i9 - getPaddingRight();
            this.f5125f.top = getPaddingTop();
            this.f5125f.bottom = i10 - getPaddingBottom();
            if (this.f5128i) {
                m4503b();
            } else {
                m4504c();
            }
        }
    }

    public void setBorderColor(int i9) {
        this.f5130k = i9;
        invalidate();
    }

    public void setColor(int i9) {
        this.f5131l = i9;
        invalidate();
    }

    public void setOriginalColor(@ColorInt int i9) {
        Paint paint = this.f5124e;
        if (paint != null) {
            paint.setColor(i9);
        }
    }

    public void setShape(int i9) {
        this.f5132m = i9;
        invalidate();
    }

    public ColorPanelView(Context context, AttributeSet attributeSet, int i9) throws Resources.NotFoundException {
        super(context, attributeSet, i9);
        this.f5127h = new RectF();
        this.f5130k = -9539986;
        this.f5131l = ViewCompat.MEASURED_STATE_MASK;
        m4502a(context, attributeSet);
    }
}
