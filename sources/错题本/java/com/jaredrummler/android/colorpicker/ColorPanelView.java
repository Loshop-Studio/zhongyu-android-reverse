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
import p112m1.C6085a;
import p185v7.AbstractC6675d;

/* loaded from: classes3.dex */
public class ColorPanelView extends View {

    /* renamed from: a */
    public C6085a f3114a;

    /* renamed from: b */
    public final Paint f3115b;

    /* renamed from: c */
    public final Paint f3116c;

    /* renamed from: d */
    public final Paint f3117d;

    /* renamed from: e */
    public final Paint f3118e;

    /* renamed from: f */
    public Rect f3119f;

    /* renamed from: g */
    public Rect f3120g;

    /* renamed from: h */
    public RectF f3121h;

    /* renamed from: i */
    public final boolean f3122i;

    /* renamed from: j */
    public final int f3123j;

    /* renamed from: k */
    public int f3124k;

    /* renamed from: l */
    public int f3125l;

    /* renamed from: m */
    public int f3126m;

    public ColorPanelView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void m2833a() {
        int[] iArr = new int[2];
        Rect rect = new Rect();
        getLocationOnScreen(iArr);
        getWindowVisibleDisplayFrame(rect);
        Context context = getContext();
        int width = getWidth();
        int height = getHeight();
        int i = (height / 2) + iArr[1];
        int i8 = (width / 2) + iArr[0];
        if (ViewCompat.getLayoutDirection(this) == 0) {
            i8 = context.getResources().getDisplayMetrics().widthPixels - i8;
        }
        StringBuilder sb = new StringBuilder("#");
        if (Color.alpha(this.f3125l) != 255) {
            sb.append(Integer.toHexString(this.f3125l).toUpperCase(Locale.ENGLISH));
        } else {
            sb.append(String.format("%06X", Integer.valueOf(16777215 & this.f3125l)).toUpperCase(Locale.ENGLISH));
        }
        Toast toastMakeText = Toast.makeText(context, sb.toString(), 0);
        if (i < rect.height()) {
            toastMakeText.setGravity(8388661, i8, (iArr[1] + height) - rect.top);
        } else {
            toastMakeText.setGravity(81, 0, height);
        }
        toastMakeText.show();
    }

    public int getBorderColor() {
        return this.f3124k;
    }

    public int getColor() {
        return this.f3125l;
    }

    @ColorShape
    public int getShape() {
        return this.f3126m;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.f3115b.setColor(this.f3124k);
        this.f3116c.setColor(this.f3125l);
        int i = this.f3126m;
        if (i == 0) {
            if (this.f3123j > 0) {
                canvas.drawRect(this.f3119f, this.f3115b);
            }
            C6085a c6085a = this.f3114a;
            if (c6085a != null) {
                c6085a.draw(canvas);
            }
            canvas.drawRect(this.f3120g, this.f3116c);
            return;
        }
        if (i == 1) {
            int measuredWidth = getMeasuredWidth() / 2;
            if (this.f3123j > 0) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth, this.f3115b);
            }
            if (Color.alpha(this.f3125l) < 255) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - this.f3123j, this.f3117d);
            }
            if (!this.f3122i) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - this.f3123j, this.f3116c);
            } else {
                canvas.drawArc(this.f3121h, 90.0f, 180.0f, true, this.f3118e);
                canvas.drawArc(this.f3121h, 270.0f, 180.0f, true, this.f3116c);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i8) {
        int i9 = this.f3126m;
        if (i9 == 0) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i8));
        } else if (i9 != 1) {
            super.onMeasure(i, i8);
        } else {
            super.onMeasure(i, i);
            setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth());
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f3125l = bundle.getInt(TypedValues.Custom.S_COLOR);
            parcelable = bundle.getParcelable("instanceState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt(TypedValues.Custom.S_COLOR, this.f3125l);
        return bundle;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i8, int i9, int i10) {
        super.onSizeChanged(i, i8, i9, i10);
        if (this.f3126m == 0 || this.f3122i) {
            Rect rect = new Rect();
            this.f3119f = rect;
            rect.left = getPaddingLeft();
            this.f3119f.right = i - getPaddingRight();
            this.f3119f.top = getPaddingTop();
            this.f3119f.bottom = i8 - getPaddingBottom();
            if (this.f3122i) {
                int i11 = this.f3119f.left;
                int i12 = this.f3123j;
                this.f3121h = new RectF(i11 + i12, r2.top + i12, r2.right - i12, r2.bottom - i12);
                return;
            }
            Rect rect2 = this.f3119f;
            int i13 = rect2.left;
            int i14 = this.f3123j;
            this.f3120g = new Rect(i13 + i14, rect2.top + i14, rect2.right - i14, rect2.bottom - i14);
            C6085a c6085a = new C6085a(AbstractC6675d.m6346h(getContext(), 4.0f));
            this.f3114a = c6085a;
            c6085a.setBounds(Math.round(this.f3120g.left), Math.round(this.f3120g.top), Math.round(this.f3120g.right), Math.round(this.f3120g.bottom));
        }
    }

    public void setBorderColor(int i) {
        this.f3124k = i;
        invalidate();
    }

    public void setColor(int i) {
        this.f3125l = i;
        invalidate();
    }

    public void setOriginalColor(@ColorInt int i) {
        Paint paint = this.f3118e;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    public void setShape(@ColorShape int i) {
        this.f3126m = i;
        invalidate();
    }

    public ColorPanelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ColorPanelView(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        this.f3121h = new RectF();
        this.f3124k = -9539986;
        this.f3125l = ViewCompat.MEASURED_STATE_MASK;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ColorPanelView);
        this.f3126m = typedArrayObtainStyledAttributes.getInt(R$styleable.ColorPanelView_cpv_colorShape, 1);
        boolean z8 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPanelView_cpv_showOldColor, false);
        this.f3122i = z8;
        if (z8 && this.f3126m != 1) {
            throw new IllegalStateException("Color preview is only available in circle mode");
        }
        this.f3124k = typedArrayObtainStyledAttributes.getColor(R$styleable.ColorPanelView_cpv_borderColor, -9539986);
        typedArrayObtainStyledAttributes.recycle();
        if (this.f3124k == -9539986) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.textColorSecondary});
            this.f3124k = typedArrayObtainStyledAttributes2.getColor(0, this.f3124k);
            typedArrayObtainStyledAttributes2.recycle();
        }
        this.f3123j = AbstractC6675d.m6346h(context, 1.0f);
        Paint paint = new Paint();
        this.f3115b = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f3116c = paint2;
        paint2.setAntiAlias(true);
        if (this.f3122i) {
            this.f3118e = new Paint();
        }
        if (this.f3126m == 1) {
            Bitmap bitmap = ((BitmapDrawable) context.getResources().getDrawable(R$drawable.cpv_alpha)).getBitmap();
            Paint paint3 = new Paint();
            this.f3117d = paint3;
            paint3.setAntiAlias(true);
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.f3117d.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        }
    }
}
