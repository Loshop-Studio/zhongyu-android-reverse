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
import p082e1.AbstractC8348c;
import p082e1.C8346a;

/* loaded from: classes4.dex */
public class ColorPanelView extends View {

    /* renamed from: a */
    public Drawable f4092a;

    /* renamed from: b */
    public Paint f4093b;

    /* renamed from: c */
    public Paint f4094c;

    /* renamed from: d */
    public Paint f4095d;

    /* renamed from: e */
    public Paint f4096e;

    /* renamed from: f */
    public Rect f4097f;

    /* renamed from: g */
    public Rect f4098g;

    /* renamed from: h */
    public RectF f4099h;

    /* renamed from: i */
    public boolean f4100i;

    /* renamed from: j */
    public int f4101j;

    /* renamed from: k */
    public int f4102k;

    /* renamed from: l */
    public int f4103l;

    /* renamed from: m */
    public int f4104m;

    public ColorPanelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void m3920a(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ColorPanelView);
        this.f4104m = typedArrayObtainStyledAttributes.getInt(R$styleable.ColorPanelView_cpv_colorShape, 1);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPanelView_cpv_showOldColor, false);
        this.f4100i = z10;
        if (z10 && this.f4104m != 1) {
            throw new IllegalStateException("Color preview is only available in circle mode");
        }
        this.f4102k = typedArrayObtainStyledAttributes.getColor(R$styleable.ColorPanelView_cpv_borderColor, -9539986);
        typedArrayObtainStyledAttributes.recycle();
        if (this.f4102k == -9539986) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.textColorSecondary});
            this.f4102k = typedArrayObtainStyledAttributes2.getColor(0, this.f4102k);
            typedArrayObtainStyledAttributes2.recycle();
        }
        this.f4101j = AbstractC8348c.m13590a(context, 1.0f);
        Paint paint = new Paint();
        this.f4093b = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f4094c = paint2;
        paint2.setAntiAlias(true);
        if (this.f4100i) {
            this.f4096e = new Paint();
        }
        if (this.f4104m == 1) {
            Bitmap bitmap = ((BitmapDrawable) context.getResources().getDrawable(R$drawable.cpv_alpha)).getBitmap();
            Paint paint3 = new Paint();
            this.f4095d = paint3;
            paint3.setAntiAlias(true);
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.f4095d.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        }
    }

    /* renamed from: b */
    public final void m3921b() {
        int i10 = this.f4097f.left;
        int i11 = this.f4101j;
        this.f4099h = new RectF(i10 + i11, r0.top + i11, r0.right - i11, r0.bottom - i11);
    }

    /* renamed from: c */
    public final void m3922c() {
        Rect rect = this.f4097f;
        int i10 = rect.left;
        int i11 = this.f4101j;
        this.f4098g = new Rect(i10 + i11, rect.top + i11, rect.right - i11, rect.bottom - i11);
        C8346a c8346a = new C8346a(AbstractC8348c.m13590a(getContext(), 4.0f));
        this.f4092a = c8346a;
        c8346a.setBounds(Math.round(this.f4098g.left), Math.round(this.f4098g.top), Math.round(this.f4098g.right), Math.round(this.f4098g.bottom));
    }

    /* renamed from: d */
    public void m3923d() {
        int[] iArr = new int[2];
        Rect rect = new Rect();
        getLocationOnScreen(iArr);
        getWindowVisibleDisplayFrame(rect);
        Context context = getContext();
        int width = getWidth();
        int height = getHeight();
        int i10 = iArr[1] + (height / 2);
        int i11 = iArr[0] + (width / 2);
        if (ViewCompat.getLayoutDirection(this) == 0) {
            i11 = context.getResources().getDisplayMetrics().widthPixels - i11;
        }
        StringBuilder sb = new StringBuilder("#");
        if (Color.alpha(this.f4103l) != 255) {
            sb.append(Integer.toHexString(this.f4103l).toUpperCase(Locale.ENGLISH));
        } else {
            sb.append(String.format("%06X", Integer.valueOf(16777215 & this.f4103l)).toUpperCase(Locale.ENGLISH));
        }
        Toast toastMakeText = Toast.makeText(context, sb.toString(), 0);
        if (i10 < rect.height()) {
            toastMakeText.setGravity(8388661, i11, (iArr[1] + height) - rect.top);
        } else {
            toastMakeText.setGravity(81, 0, height);
        }
        toastMakeText.show();
    }

    public int getBorderColor() {
        return this.f4102k;
    }

    public int getColor() {
        return this.f4103l;
    }

    public int getShape() {
        return this.f4104m;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.f4093b.setColor(this.f4102k);
        this.f4094c.setColor(this.f4103l);
        int i10 = this.f4104m;
        if (i10 == 0) {
            if (this.f4101j > 0) {
                canvas.drawRect(this.f4097f, this.f4093b);
            }
            Drawable drawable = this.f4092a;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            canvas.drawRect(this.f4098g, this.f4094c);
            return;
        }
        if (i10 == 1) {
            int measuredWidth = getMeasuredWidth() / 2;
            if (this.f4101j > 0) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth, this.f4093b);
            }
            if (Color.alpha(this.f4103l) < 255) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - this.f4101j, this.f4095d);
            }
            if (!this.f4100i) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - this.f4101j, this.f4094c);
            } else {
                canvas.drawArc(this.f4099h, 90.0f, 180.0f, true, this.f4096e);
                canvas.drawArc(this.f4099h, 270.0f, 180.0f, true, this.f4094c);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int i12 = this.f4104m;
        if (i12 == 0) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        } else if (i12 != 1) {
            super.onMeasure(i10, i11);
        } else {
            super.onMeasure(i10, i10);
            setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth());
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f4103l = bundle.getInt(TypedValues.Custom.S_COLOR);
            parcelable = bundle.getParcelable("instanceState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt(TypedValues.Custom.S_COLOR, this.f4103l);
        return bundle;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f4104m == 0 || this.f4100i) {
            Rect rect = new Rect();
            this.f4097f = rect;
            rect.left = getPaddingLeft();
            this.f4097f.right = i10 - getPaddingRight();
            this.f4097f.top = getPaddingTop();
            this.f4097f.bottom = i11 - getPaddingBottom();
            if (this.f4100i) {
                m3921b();
            } else {
                m3922c();
            }
        }
    }

    public void setBorderColor(int i10) {
        this.f4102k = i10;
        invalidate();
    }

    public void setColor(int i10) {
        this.f4103l = i10;
        invalidate();
    }

    public void setOriginalColor(@ColorInt int i10) {
        Paint paint = this.f4096e;
        if (paint != null) {
            paint.setColor(i10);
        }
    }

    public void setShape(int i10) {
        this.f4104m = i10;
        invalidate();
    }

    public ColorPanelView(Context context, AttributeSet attributeSet, int i10) throws Resources.NotFoundException {
        super(context, attributeSet, i10);
        this.f4099h = new RectF();
        this.f4102k = -9539986;
        this.f4103l = -16777216;
        m3920a(context, attributeSet);
    }
}
