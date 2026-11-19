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
import com.xuexiang.xui.utils.AbstractC8041g;

/* loaded from: classes5.dex */
public class SwitchIconView extends AppCompatImageView {

    /* renamed from: u */
    public static final float f15609u = (float) Math.sin(Math.toRadians(45.0d));

    /* renamed from: c */
    public final long f15610c;

    /* renamed from: d */
    public final float f15611d;

    /* renamed from: e */
    public final int f15612e;

    /* renamed from: f */
    public final int f15613f;

    /* renamed from: g */
    public final Path f15614g;

    /* renamed from: h */
    public final int f15615h;

    /* renamed from: i */
    public final int f15616i;

    /* renamed from: j */
    public final boolean f15617j;

    /* renamed from: k */
    public int f15618k;

    /* renamed from: l */
    public int f15619l;

    /* renamed from: m */
    public int f15620m;

    /* renamed from: n */
    public PorterDuffColorFilter f15621n;

    /* renamed from: o */
    public final ArgbEvaluator f15622o;

    /* renamed from: p */
    public float f15623p;

    /* renamed from: q */
    public boolean f15624q;

    /* renamed from: r */
    public final Paint f15625r;

    /* renamed from: s */
    public final Point f15626s;

    /* renamed from: t */
    public final Point f15627t;

    public static class SwitchIconSavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SwitchIconSavedState> CREATOR = new C8081a();

        /* renamed from: c */
        public boolean f15628c;

        /* renamed from: com.xuexiang.xui.widget.button.SwitchIconView$SwitchIconSavedState$a */
        public static class C8081a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SwitchIconSavedState createFromParcel(Parcel parcel) {
                return new SwitchIconSavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SwitchIconSavedState[] newArray(int i10) {
                return new SwitchIconSavedState[i10];
            }
        }

        public /* synthetic */ SwitchIconSavedState(Parcel parcel, C8082a c8082a) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f15628c ? 1 : 0);
        }

        public SwitchIconSavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SwitchIconSavedState(Parcel parcel) {
            super(parcel);
            this.f15628c = parcel.readInt() == 1;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.SwitchIconView$a */
    public class C8082a implements ValueAnimator.AnimatorUpdateListener {
        public C8082a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SwitchIconView.this.setFraction(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public SwitchIconView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFraction(float f10) {
        this.f15623p = f10;
        m12472j(f10);
        m12470h(f10);
        m12471i();
        m12467e();
    }

    /* renamed from: b */
    public final void m12464b(float f10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f15623p, f10);
        valueAnimatorOfFloat.addUpdateListener(new C8082a());
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.setDuration(this.f15610c);
        valueAnimatorOfFloat.start();
    }

    /* renamed from: c */
    public final void m12465c(Canvas canvas) {
        float f10 = this.f15623p;
        Point point = this.f15627t;
        int i10 = point.x;
        Point point2 = this.f15626s;
        int i11 = point2.x;
        float f11 = ((i10 - i11) * f10) + i11;
        int i12 = point.y;
        int i13 = point2.y;
        canvas.drawLine(i11, i13, f11, (f10 * (i12 - i13)) + i13, this.f15625r);
    }

    /* renamed from: d */
    public final void m12466d() {
        float f10 = f15609u;
        int i10 = this.f15618k;
        float f11 = 1.5f * f10 * i10;
        float f12 = f10 * 0.5f * i10;
        Point point = this.f15626s;
        point.x = (int) (this.f15612e + f12);
        point.y = ((int) f11) + this.f15613f;
        Point point2 = this.f15627t;
        point2.x = (int) ((r3 + this.f15619l) - f11);
        point2.y = (int) ((r4 + this.f15620m) - f12);
    }

    /* renamed from: e */
    public final void m12467e() {
        postInvalidateOnAnimation();
    }

    /* renamed from: f */
    public void m12468f(boolean z10, boolean z11) {
        if (this.f15624q == z10) {
            return;
        }
        m12469g(z11);
    }

    /* renamed from: g */
    public void m12469g(boolean z10) {
        boolean z11 = this.f15624q;
        float f10 = z11 ? 1.0f : 0.0f;
        this.f15624q = !z11;
        if (z10) {
            m12464b(f10);
        } else {
            setFraction(f10);
            invalidate();
        }
    }

    /* renamed from: h */
    public final void m12470h(float f10) {
        float f11 = this.f15611d;
        int i10 = (int) ((f11 + ((1.0f - f10) * (1.0f - f11))) * 255.0f);
        m12473k(i10);
        this.f15625r.setAlpha(i10);
    }

    /* renamed from: i */
    public final void m12471i() {
        float f10 = this.f15618k / f15609u;
        this.f15614g.reset();
        this.f15614g.moveTo(this.f15612e, this.f15613f + f10);
        this.f15614g.lineTo(this.f15612e + f10, this.f15613f);
        Path path = this.f15614g;
        float f11 = this.f15612e;
        float f12 = this.f15619l;
        float f13 = this.f15623p;
        path.lineTo(f11 + (f12 * f13), (this.f15613f + (this.f15620m * f13)) - f10);
        Path path2 = this.f15614g;
        float f14 = this.f15612e;
        float f15 = this.f15619l;
        float f16 = this.f15623p;
        path2.lineTo((f14 + (f15 * f16)) - f10, this.f15613f + (this.f15620m * f16));
    }

    /* renamed from: j */
    public final void m12472j(float f10) {
        int i10 = this.f15615h;
        if (i10 != this.f15616i) {
            int iIntValue = ((Integer) this.f15622o.evaluate(f10, Integer.valueOf(i10), Integer.valueOf(this.f15616i))).intValue();
            m12474l(iIntValue);
            this.f15625r.setColor(iIntValue);
        }
    }

    /* renamed from: k */
    public final void m12473k(int i10) {
        setImageAlpha(i10);
    }

    /* renamed from: l */
    public final void m12474l(int i10) {
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        this.f15621n = porterDuffColorFilter;
        setColorFilter(porterDuffColorFilter);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (!this.f15617j) {
            m12465c(canvas);
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutPath(this.f15614g);
            } else {
                canvas.clipPath(this.f15614g, Region.Op.XOR);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SwitchIconSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SwitchIconSavedState switchIconSavedState = (SwitchIconSavedState) parcelable;
        super.onRestoreInstanceState(switchIconSavedState.getSuperState());
        boolean z10 = switchIconSavedState.f15628c;
        this.f15624q = z10;
        setFraction(z10 ? 0.0f : 1.0f);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SwitchIconSavedState switchIconSavedState = new SwitchIconSavedState(super.onSaveInstanceState());
        switchIconSavedState.f15628c = this.f15624q;
        return switchIconSavedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f15619l = (i10 - getPaddingLeft()) - getPaddingRight();
        this.f15620m = (i11 - getPaddingTop()) - getPaddingBottom();
        int i14 = (int) (((this.f15619l + r2) * 0.083333336f) / 2.0f);
        this.f15618k = i14;
        this.f15625r.setStrokeWidth(i14);
        m12466d();
        m12471i();
    }

    public void setIconEnabled(boolean z10) {
        m12468f(z10, true);
    }

    public SwitchIconView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.SwitchIconViewStyle);
    }

    public SwitchIconView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f15622o = new ArgbEvaluator();
        this.f15623p = 0.0f;
        this.f15626s = new Point();
        this.f15627t = new Point();
        setLayerType(1, null);
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, R$styleable.SwitchIconView, 0, 0);
        try {
            int color = typedArrayObtainStyledAttributes.getColor(R$styleable.SwitchIconView_siv_tint_color, AbstractC8041g.m12217d(context, R$attr.colorAccent));
            this.f15615h = color;
            this.f15610c = typedArrayObtainStyledAttributes.getInteger(R$styleable.SwitchIconView_siv_animation_duration, 300);
            float f10 = typedArrayObtainStyledAttributes.getFloat(R$styleable.SwitchIconView_siv_disabled_alpha, 0.5f);
            this.f15611d = f10;
            this.f15616i = typedArrayObtainStyledAttributes.getColor(R$styleable.SwitchIconView_siv_disabled_color, color);
            this.f15624q = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SwitchIconView_siv_enabled, true);
            this.f15617j = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SwitchIconView_siv_no_dash, false);
            typedArrayObtainStyledAttributes.recycle();
            if (f10 >= 0.0f && f10 <= 1.0f) {
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                this.f15621n = porterDuffColorFilter;
                setColorFilter(porterDuffColorFilter);
                this.f15612e = getPaddingLeft();
                this.f15613f = getPaddingTop();
                Paint paint = new Paint(1);
                this.f15625r = paint;
                paint.setStyle(Paint.Style.STROKE);
                paint.setColor(color);
                this.f15614g = new Path();
                m12466d();
                setFraction(this.f15624q ? 0.0f : 1.0f);
                return;
            }
            throw new IllegalArgumentException("Wrong value for si_disabled_alpha [" + f10 + "]. Must be value from range [0, 1]");
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
