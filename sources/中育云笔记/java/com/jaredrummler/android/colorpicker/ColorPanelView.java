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
import org.eclipse.paho.client.mqttv3.MqttTopic;
import p162g6.AbstractC9274c;
import p162g6.C9272a;

/* loaded from: classes5.dex */
public class ColorPanelView extends View {

    /* renamed from: c */
    public Drawable f11895c;

    /* renamed from: d */
    public Paint f11896d;

    /* renamed from: e */
    public Paint f11897e;

    /* renamed from: f */
    public Paint f11898f;

    /* renamed from: g */
    public Paint f11899g;

    /* renamed from: h */
    public Rect f11900h;

    /* renamed from: i */
    public Rect f11901i;

    /* renamed from: j */
    public RectF f11902j;

    /* renamed from: k */
    public boolean f11903k;

    /* renamed from: l */
    public int f11904l;

    /* renamed from: m */
    public int f11905m;

    /* renamed from: n */
    public int f11906n;

    /* renamed from: o */
    public int f11907o;

    public ColorPanelView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void m8837a(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ColorPanelView);
        this.f11907o = typedArrayObtainStyledAttributes.getInt(R$styleable.ColorPanelView_cpv_colorShape, 1);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPanelView_cpv_showOldColor, false);
        this.f11903k = z10;
        if (z10 && this.f11907o != 1) {
            throw new IllegalStateException("Color preview is only available in circle mode");
        }
        this.f11905m = typedArrayObtainStyledAttributes.getColor(R$styleable.ColorPanelView_cpv_borderColor, -9539986);
        typedArrayObtainStyledAttributes.recycle();
        if (this.f11905m == -9539986) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.textColorSecondary});
            this.f11905m = typedArrayObtainStyledAttributes2.getColor(0, this.f11905m);
            typedArrayObtainStyledAttributes2.recycle();
        }
        this.f11904l = AbstractC9274c.m18262a(context, 1.0f);
        Paint paint = new Paint();
        this.f11896d = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f11897e = paint2;
        paint2.setAntiAlias(true);
        if (this.f11903k) {
            this.f11899g = new Paint();
        }
        if (this.f11907o == 1) {
            Bitmap bitmap = ((BitmapDrawable) context.getResources().getDrawable(R$drawable.cpv_alpha)).getBitmap();
            Paint paint3 = new Paint();
            this.f11898f = paint3;
            paint3.setAntiAlias(true);
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.f11898f.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        }
    }

    /* renamed from: b */
    public final void m8838b() {
        int i10 = this.f11900h.left;
        int i11 = this.f11904l;
        this.f11902j = new RectF(i10 + i11, r0.top + i11, r0.right - i11, r0.bottom - i11);
    }

    /* renamed from: c */
    public final void m8839c() {
        Rect rect = this.f11900h;
        int i10 = rect.left;
        int i11 = this.f11904l;
        this.f11901i = new Rect(i10 + i11, rect.top + i11, rect.right - i11, rect.bottom - i11);
        C9272a c9272a = new C9272a(AbstractC9274c.m18262a(getContext(), 4.0f));
        this.f11895c = c9272a;
        c9272a.setBounds(Math.round(this.f11901i.left), Math.round(this.f11901i.top), Math.round(this.f11901i.right), Math.round(this.f11901i.bottom));
    }

    /* renamed from: d */
    public void m8840d() {
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
        StringBuilder sb2 = new StringBuilder(MqttTopic.MULTI_LEVEL_WILDCARD);
        if (Color.alpha(this.f11906n) != 255) {
            sb2.append(Integer.toHexString(this.f11906n).toUpperCase(Locale.ENGLISH));
        } else {
            sb2.append(String.format("%06X", Integer.valueOf(16777215 & this.f11906n)).toUpperCase(Locale.ENGLISH));
        }
        Toast toastMakeText = Toast.makeText(context, sb2.toString(), 0);
        if (i10 < rect.height()) {
            toastMakeText.setGravity(8388661, i11, (iArr[1] + height) - rect.top);
        } else {
            toastMakeText.setGravity(81, 0, height);
        }
        toastMakeText.show();
    }

    public int getBorderColor() {
        return this.f11905m;
    }

    public int getColor() {
        return this.f11906n;
    }

    public int getShape() {
        return this.f11907o;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.f11896d.setColor(this.f11905m);
        this.f11897e.setColor(this.f11906n);
        int i10 = this.f11907o;
        if (i10 == 0) {
            if (this.f11904l > 0) {
                canvas.drawRect(this.f11900h, this.f11896d);
            }
            Drawable drawable = this.f11895c;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            canvas.drawRect(this.f11901i, this.f11897e);
            return;
        }
        if (i10 == 1) {
            int measuredWidth = getMeasuredWidth() / 2;
            if (this.f11904l > 0) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth, this.f11896d);
            }
            if (Color.alpha(this.f11906n) < 255) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - this.f11904l, this.f11898f);
            }
            if (!this.f11903k) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - this.f11904l, this.f11897e);
            } else {
                canvas.drawArc(this.f11902j, 90.0f, 180.0f, true, this.f11899g);
                canvas.drawArc(this.f11902j, 270.0f, 180.0f, true, this.f11897e);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int i12 = this.f11907o;
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
            this.f11906n = bundle.getInt(TypedValues.Custom.S_COLOR);
            parcelable = bundle.getParcelable("instanceState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt(TypedValues.Custom.S_COLOR, this.f11906n);
        return bundle;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f11907o == 0 || this.f11903k) {
            Rect rect = new Rect();
            this.f11900h = rect;
            rect.left = getPaddingLeft();
            this.f11900h.right = i10 - getPaddingRight();
            this.f11900h.top = getPaddingTop();
            this.f11900h.bottom = i11 - getPaddingBottom();
            if (this.f11903k) {
                m8838b();
            } else {
                m8839c();
            }
        }
    }

    public void setBorderColor(int i10) {
        this.f11905m = i10;
        invalidate();
    }

    public void setColor(int i10) {
        this.f11906n = i10;
        invalidate();
    }

    public void setOriginalColor(@ColorInt int i10) {
        Paint paint = this.f11899g;
        if (paint != null) {
            paint.setColor(i10);
        }
    }

    public void setShape(int i10) {
        this.f11907o = i10;
        invalidate();
    }

    public ColorPanelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ColorPanelView(Context context, AttributeSet attributeSet, int i10) throws Resources.NotFoundException {
        super(context, attributeSet, i10);
        this.f11902j = new RectF();
        this.f11905m = -9539986;
        this.f11906n = ViewCompat.MEASURED_STATE_MASK;
        m8837a(context, attributeSet);
    }
}
