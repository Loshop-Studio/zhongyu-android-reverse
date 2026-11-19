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
import p196p1.AbstractC8816c;
import p196p1.C8814a;

/* loaded from: classes.dex */
public class ColorPanelView extends View {

    /* renamed from: a */
    public Drawable f4529a;

    /* renamed from: b */
    public Paint f4530b;

    /* renamed from: c */
    public Paint f4531c;

    /* renamed from: d */
    public Paint f4532d;

    /* renamed from: e */
    public Paint f4533e;

    /* renamed from: f */
    public Rect f4534f;

    /* renamed from: g */
    public Rect f4535g;

    /* renamed from: h */
    public RectF f4536h;

    /* renamed from: i */
    public boolean f4537i;

    /* renamed from: j */
    public int f4538j;

    /* renamed from: k */
    public int f4539k;

    /* renamed from: l */
    public int f4540l;

    /* renamed from: m */
    public int f4541m;

    public ColorPanelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void m4308a(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ColorPanelView);
        this.f4541m = typedArrayObtainStyledAttributes.getInt(R$styleable.ColorPanelView_cpv_colorShape, 1);
        boolean z9 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPanelView_cpv_showOldColor, false);
        this.f4537i = z9;
        if (z9 && this.f4541m != 1) {
            throw new IllegalStateException("Color preview is only available in circle mode");
        }
        this.f4539k = typedArrayObtainStyledAttributes.getColor(R$styleable.ColorPanelView_cpv_borderColor, -9539986);
        typedArrayObtainStyledAttributes.recycle();
        if (this.f4539k == -9539986) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.textColorSecondary});
            this.f4539k = typedArrayObtainStyledAttributes2.getColor(0, this.f4539k);
            typedArrayObtainStyledAttributes2.recycle();
        }
        this.f4538j = AbstractC8816c.m14772a(context, 1.0f);
        Paint paint = new Paint();
        this.f4530b = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f4531c = paint2;
        paint2.setAntiAlias(true);
        if (this.f4537i) {
            this.f4533e = new Paint();
        }
        if (this.f4541m == 1) {
            Bitmap bitmap = ((BitmapDrawable) context.getResources().getDrawable(R$drawable.cpv_alpha)).getBitmap();
            Paint paint3 = new Paint();
            this.f4532d = paint3;
            paint3.setAntiAlias(true);
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.f4532d.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        }
    }

    /* renamed from: b */
    public final void m4309b() {
        int i10 = this.f4534f.left;
        int i11 = this.f4538j;
        this.f4536h = new RectF(i10 + i11, r0.top + i11, r0.right - i11, r0.bottom - i11);
    }

    /* renamed from: c */
    public final void m4310c() {
        Rect rect = this.f4534f;
        int i10 = rect.left;
        int i11 = this.f4538j;
        this.f4535g = new Rect(i10 + i11, rect.top + i11, rect.right - i11, rect.bottom - i11);
        C8814a c8814a = new C8814a(AbstractC8816c.m14772a(getContext(), 4.0f));
        this.f4529a = c8814a;
        c8814a.setBounds(Math.round(this.f4535g.left), Math.round(this.f4535g.top), Math.round(this.f4535g.right), Math.round(this.f4535g.bottom));
    }

    /* renamed from: d */
    public void m4311d() {
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
        if (Color.alpha(this.f4540l) != 255) {
            sb.append(Integer.toHexString(this.f4540l).toUpperCase(Locale.ENGLISH));
        } else {
            sb.append(String.format("%06X", Integer.valueOf(16777215 & this.f4540l)).toUpperCase(Locale.ENGLISH));
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
        return this.f4539k;
    }

    public int getColor() {
        return this.f4540l;
    }

    public int getShape() {
        return this.f4541m;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.f4530b.setColor(this.f4539k);
        this.f4531c.setColor(this.f4540l);
        int i10 = this.f4541m;
        if (i10 == 0) {
            if (this.f4538j > 0) {
                canvas.drawRect(this.f4534f, this.f4530b);
            }
            Drawable drawable = this.f4529a;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            canvas.drawRect(this.f4535g, this.f4531c);
            return;
        }
        if (i10 == 1) {
            int measuredWidth = getMeasuredWidth() / 2;
            if (this.f4538j > 0) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth, this.f4530b);
            }
            if (Color.alpha(this.f4540l) < 255) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - this.f4538j, this.f4532d);
            }
            if (!this.f4537i) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - this.f4538j, this.f4531c);
            } else {
                canvas.drawArc(this.f4536h, 90.0f, 180.0f, true, this.f4533e);
                canvas.drawArc(this.f4536h, 270.0f, 180.0f, true, this.f4531c);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int i12 = this.f4541m;
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
            this.f4540l = bundle.getInt(TypedValues.Custom.S_COLOR);
            parcelable = bundle.getParcelable("instanceState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt(TypedValues.Custom.S_COLOR, this.f4540l);
        return bundle;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f4541m == 0 || this.f4537i) {
            Rect rect = new Rect();
            this.f4534f = rect;
            rect.left = getPaddingLeft();
            this.f4534f.right = i10 - getPaddingRight();
            this.f4534f.top = getPaddingTop();
            this.f4534f.bottom = i11 - getPaddingBottom();
            if (this.f4537i) {
                m4309b();
            } else {
                m4310c();
            }
        }
    }

    public void setBorderColor(int i10) {
        this.f4539k = i10;
        invalidate();
    }

    public void setColor(int i10) {
        this.f4540l = i10;
        invalidate();
    }

    public void setOriginalColor(@ColorInt int i10) {
        Paint paint = this.f4533e;
        if (paint != null) {
            paint.setColor(i10);
        }
    }

    public void setShape(int i10) {
        this.f4541m = i10;
        invalidate();
    }

    public ColorPanelView(Context context, AttributeSet attributeSet, int i10) throws Resources.NotFoundException {
        super(context, attributeSet, i10);
        this.f4536h = new RectF();
        this.f4539k = -9539986;
        this.f4540l = ViewCompat.MEASURED_STATE_MASK;
        m4308a(context, attributeSet);
    }
}
