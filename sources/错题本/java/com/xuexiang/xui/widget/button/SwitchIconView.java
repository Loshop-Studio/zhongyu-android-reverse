package com.xuexiang.xui.widget.button;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Region;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$styleable;
import kotlin.collections.AbstractC5806u;

/* loaded from: classes3.dex */
public class SwitchIconView extends AppCompatImageView {

    /* renamed from: r */
    public static final float f4114r = (float) Math.sin(Math.toRadians(45.0d));

    /* renamed from: a */
    public final long f4115a;

    /* renamed from: b */
    public final float f4116b;

    /* renamed from: c */
    public final int f4117c;

    /* renamed from: d */
    public final int f4118d;

    /* renamed from: e */
    public final Path f4119e;

    /* renamed from: f */
    public final int f4120f;

    /* renamed from: g */
    public final int f4121g;

    /* renamed from: h */
    public final boolean f4122h;

    /* renamed from: i */
    public int f4123i;

    /* renamed from: j */
    public int f4124j;

    /* renamed from: k */
    public int f4125k;

    /* renamed from: l */
    public final ArgbEvaluator f4126l;

    /* renamed from: m */
    public float f4127m;

    /* renamed from: n */
    public boolean f4128n;

    /* renamed from: o */
    public final Paint f4129o;

    /* renamed from: p */
    public final Point f4130p;

    /* renamed from: q */
    public final Point f4131q;

    public static class SwitchIconSavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SwitchIconSavedState> CREATOR = new C4169g();

        /* renamed from: a */
        public boolean f4132a;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f4132a ? 1 : 0);
        }
    }

    public SwitchIconView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFraction(float f) {
        this.f4127m = f;
        Paint paint = this.f4129o;
        int i = this.f4120f;
        int i8 = this.f4121g;
        if (i != i8) {
            int iIntValue = ((Integer) this.f4126l.evaluate(f, Integer.valueOf(i), Integer.valueOf(i8))).intValue();
            setColorFilter(new PorterDuffColorFilter(iIntValue, PorterDuff.Mode.SRC_IN));
            paint.setColor(iIntValue);
        }
        float f7 = this.f4116b;
        int i9 = (int) ((((1.0f - f7) * (1.0f - f)) + f7) * 255.0f);
        setImageAlpha(i9);
        paint.setAlpha(i9);
        m3468c();
        postInvalidateOnAnimation();
    }

    /* renamed from: b */
    public final void m3467b() {
        float f = f4114r;
        int i = this.f4123i;
        float f7 = 1.5f * f * i;
        float f8 = f * 0.5f * i;
        int i8 = this.f4117c;
        Point point = this.f4130p;
        point.x = (int) (i8 + f8);
        point.y = ((int) f7) + this.f4118d;
        int i9 = (int) ((i8 + this.f4124j) - f7);
        Point point2 = this.f4131q;
        point2.x = i9;
        point2.y = (int) ((r5 + this.f4125k) - f8);
    }

    /* renamed from: c */
    public final void m3468c() {
        float f = this.f4123i / f4114r;
        Path path = this.f4119e;
        path.reset();
        int i = this.f4117c;
        int i8 = this.f4118d;
        path.moveTo(i, i8 + f);
        path.lineTo(i + f, i8);
        float f7 = this.f4124j;
        float f8 = this.f4127m;
        path.lineTo((f7 * f8) + i, ((this.f4125k * f8) + i8) - f);
        float f9 = this.f4124j;
        float f10 = this.f4127m;
        path.lineTo(((f9 * f10) + i) - f, (this.f4125k * f10) + i8);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.f4122h) {
            canvas2 = canvas;
        } else {
            float f = this.f4127m;
            Point point = this.f4131q;
            int i = point.x;
            Point point2 = this.f4130p;
            float f7 = point2.x;
            float f8 = ((i - r4) * f) + f7;
            int i8 = point.y;
            float f9 = point2.y;
            canvas2 = canvas;
            canvas2.drawLine(f7, f9, f8, (f * (i8 - r2)) + f9, this.f4129o);
            int i9 = Build.VERSION.SDK_INT;
            Path path = this.f4119e;
            if (i9 >= 26) {
                canvas2.clipOutPath(path);
            } else {
                canvas2.clipPath(path, Region.Op.XOR);
            }
        }
        super.onDraw(canvas2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SwitchIconSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SwitchIconSavedState switchIconSavedState = (SwitchIconSavedState) parcelable;
        super.onRestoreInstanceState(switchIconSavedState.getSuperState());
        boolean z8 = switchIconSavedState.f4132a;
        this.f4128n = z8;
        setFraction(z8 ? 0.0f : 1.0f);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SwitchIconSavedState switchIconSavedState = new SwitchIconSavedState(super.onSaveInstanceState());
        switchIconSavedState.f4132a = this.f4128n;
        return switchIconSavedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i8, int i9, int i10) {
        super.onSizeChanged(i, i8, i9, i10);
        this.f4124j = (i - getPaddingLeft()) - getPaddingRight();
        this.f4125k = (i8 - getPaddingTop()) - getPaddingBottom();
        int i11 = (int) (((this.f4124j + r2) * 0.083333336f) / 2.0f);
        this.f4123i = i11;
        this.f4129o.setStrokeWidth(i11);
        m3467b();
        m3468c();
    }

    public void setIconEnabled(boolean z8) {
        boolean z9 = this.f4128n;
        if (z9 == z8) {
            return;
        }
        float f = z9 ? 1.0f : 0.0f;
        this.f4128n = !z9;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f4127m, f);
        valueAnimatorOfFloat.addUpdateListener(new C4168f(this, 0));
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.setDuration(this.f4115a);
        valueAnimatorOfFloat.start();
    }

    public SwitchIconView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.SwitchIconViewStyle);
    }

    public SwitchIconView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4126l = new ArgbEvaluator();
        this.f4127m = 0.0f;
        this.f4130p = new Point();
        this.f4131q = new Point();
        setLayerType(1, null);
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, R$styleable.SwitchIconView, 0, 0);
        try {
            int color = typedArrayObtainStyledAttributes.getColor(R$styleable.SwitchIconView_siv_tint_color, AbstractC5806u.m5252F(context, R$attr.colorAccent, 0));
            this.f4120f = color;
            this.f4115a = typedArrayObtainStyledAttributes.getInteger(R$styleable.SwitchIconView_siv_animation_duration, 300);
            float f = typedArrayObtainStyledAttributes.getFloat(R$styleable.SwitchIconView_siv_disabled_alpha, 0.5f);
            this.f4116b = f;
            this.f4121g = typedArrayObtainStyledAttributes.getColor(R$styleable.SwitchIconView_siv_disabled_color, color);
            this.f4128n = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SwitchIconView_siv_enabled, true);
            this.f4122h = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SwitchIconView_siv_no_dash, false);
            typedArrayObtainStyledAttributes.recycle();
            if (f >= 0.0f && f <= 1.0f) {
                setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                this.f4117c = getPaddingLeft();
                this.f4118d = getPaddingTop();
                Paint paint = new Paint(1);
                this.f4129o = paint;
                paint.setStyle(Paint.Style.STROKE);
                paint.setColor(color);
                this.f4119e = new Path();
                m3467b();
                setFraction(this.f4128n ? 0.0f : 1.0f);
                return;
            }
            throw new IllegalArgumentException("Wrong value for si_disabled_alpha [" + f + "]. Must be value from range [0, 1]");
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
