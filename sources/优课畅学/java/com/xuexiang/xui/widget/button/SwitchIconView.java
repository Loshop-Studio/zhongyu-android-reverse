package com.xuexiang.xui.widget.button;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
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
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes4.dex */
public class SwitchIconView extends AppCompatImageView {

    /* renamed from: s */
    public static final float f7234s = (float) Math.sin(Math.toRadians(45.0d));

    /* renamed from: a */
    public final long f7235a;

    /* renamed from: b */
    public final float f7236b;

    /* renamed from: c */
    public final int f7237c;

    /* renamed from: d */
    public final int f7238d;

    /* renamed from: e */
    public final Path f7239e;

    /* renamed from: f */
    public final int f7240f;

    /* renamed from: g */
    public final int f7241g;

    /* renamed from: h */
    public final boolean f7242h;

    /* renamed from: i */
    public int f7243i;

    /* renamed from: j */
    public int f7244j;

    /* renamed from: k */
    public int f7245k;

    /* renamed from: l */
    public PorterDuffColorFilter f7246l;

    /* renamed from: m */
    public final ArgbEvaluator f7247m;

    /* renamed from: n */
    public float f7248n;

    /* renamed from: o */
    public boolean f7249o;

    /* renamed from: p */
    public final Paint f7250p;

    /* renamed from: q */
    public final Point f7251q;

    /* renamed from: r */
    public final Point f7252r;

    public static class SwitchIconSavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SwitchIconSavedState> CREATOR = new C6894a();

        /* renamed from: a */
        public boolean f7253a;

        /* renamed from: com.xuexiang.xui.widget.button.SwitchIconView$SwitchIconSavedState$a */
        public static class C6894a implements Parcelable.Creator {
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

        public /* synthetic */ SwitchIconSavedState(Parcel parcel, C6895a c6895a) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f7253a ? 1 : 0);
        }

        public SwitchIconSavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SwitchIconSavedState(Parcel parcel) {
            super(parcel);
            this.f7253a = parcel.readInt() == 1;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.SwitchIconView$a */
    public class C6895a implements ValueAnimator.AnimatorUpdateListener {
        public C6895a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SwitchIconView.this.setFraction(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFraction(float f10) {
        this.f7248n = f10;
        m6649j(f10);
        m6647h(f10);
        m6648i();
        m6644e();
    }

    /* renamed from: b */
    public final void m6641b(float f10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f7248n, f10);
        valueAnimatorOfFloat.addUpdateListener(new C6895a());
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.setDuration(this.f7235a);
        valueAnimatorOfFloat.start();
    }

    /* renamed from: c */
    public final void m6642c(Canvas canvas) {
        float f10 = this.f7248n;
        Point point = this.f7252r;
        int i10 = point.x;
        Point point2 = this.f7251q;
        int i11 = point2.x;
        float f11 = ((i10 - i11) * f10) + i11;
        int i12 = point.y;
        int i13 = point2.y;
        canvas.drawLine(i11, i13, f11, (f10 * (i12 - i13)) + i13, this.f7250p);
    }

    /* renamed from: d */
    public final void m6643d() {
        float f10 = f7234s;
        int i10 = this.f7243i;
        float f11 = 1.5f * f10 * i10;
        float f12 = f10 * 0.5f * i10;
        Point point = this.f7251q;
        point.x = (int) (this.f7237c + f12);
        point.y = ((int) f11) + this.f7238d;
        Point point2 = this.f7252r;
        point2.x = (int) ((r3 + this.f7244j) - f11);
        point2.y = (int) ((r4 + this.f7245k) - f12);
    }

    /* renamed from: e */
    public final void m6644e() {
        postInvalidateOnAnimation();
    }

    /* renamed from: f */
    public void m6645f(boolean z10, boolean z11) {
        if (this.f7249o == z10) {
            return;
        }
        m6646g(z11);
    }

    /* renamed from: g */
    public void m6646g(boolean z10) {
        boolean z11 = this.f7249o;
        float f10 = z11 ? 1.0f : 0.0f;
        this.f7249o = !z11;
        if (z10) {
            m6641b(f10);
        } else {
            setFraction(f10);
            invalidate();
        }
    }

    /* renamed from: h */
    public final void m6647h(float f10) {
        float f11 = this.f7236b;
        int i10 = (int) ((f11 + ((1.0f - f10) * (1.0f - f11))) * 255.0f);
        m6650k(i10);
        this.f7250p.setAlpha(i10);
    }

    /* renamed from: i */
    public final void m6648i() {
        float f10 = this.f7243i / f7234s;
        this.f7239e.reset();
        this.f7239e.moveTo(this.f7237c, this.f7238d + f10);
        this.f7239e.lineTo(this.f7237c + f10, this.f7238d);
        Path path = this.f7239e;
        float f11 = this.f7237c;
        float f12 = this.f7244j;
        float f13 = this.f7248n;
        path.lineTo(f11 + (f12 * f13), (this.f7238d + (this.f7245k * f13)) - f10);
        Path path2 = this.f7239e;
        float f14 = this.f7237c;
        float f15 = this.f7244j;
        float f16 = this.f7248n;
        path2.lineTo((f14 + (f15 * f16)) - f10, this.f7238d + (this.f7245k * f16));
    }

    /* renamed from: j */
    public final void m6649j(float f10) {
        int i10 = this.f7240f;
        if (i10 != this.f7241g) {
            int iIntValue = ((Integer) this.f7247m.evaluate(f10, Integer.valueOf(i10), Integer.valueOf(this.f7241g))).intValue();
            m6651l(iIntValue);
            this.f7250p.setColor(iIntValue);
        }
    }

    /* renamed from: k */
    public final void m6650k(int i10) {
        setImageAlpha(i10);
    }

    /* renamed from: l */
    public final void m6651l(int i10) {
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        this.f7246l = porterDuffColorFilter;
        setColorFilter(porterDuffColorFilter);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (!this.f7242h) {
            m6642c(canvas);
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutPath(this.f7239e);
            } else {
                canvas.clipPath(this.f7239e, Region.Op.XOR);
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
        boolean z10 = switchIconSavedState.f7253a;
        this.f7249o = z10;
        setFraction(z10 ? 0.0f : 1.0f);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SwitchIconSavedState switchIconSavedState = new SwitchIconSavedState(super.onSaveInstanceState());
        switchIconSavedState.f7253a = this.f7249o;
        return switchIconSavedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f7244j = (i10 - getPaddingLeft()) - getPaddingRight();
        this.f7245k = (i11 - getPaddingTop()) - getPaddingBottom();
        int i14 = (int) (((this.f7244j + r2) * 0.083333336f) / 2.0f);
        this.f7243i = i14;
        this.f7250p.setStrokeWidth(i14);
        m6643d();
        m6648i();
    }

    public void setIconEnabled(boolean z10) {
        m6645f(z10, true);
    }
}
