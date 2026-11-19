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
    public static final float f5909s = (float) Math.sin(Math.toRadians(45.0d));

    /* renamed from: a */
    public final long f5910a;

    /* renamed from: b */
    public final float f5911b;

    /* renamed from: c */
    public final int f5912c;

    /* renamed from: d */
    public final int f5913d;

    /* renamed from: e */
    public final Path f5914e;

    /* renamed from: f */
    public final int f5915f;

    /* renamed from: g */
    public final int f5916g;

    /* renamed from: h */
    public final boolean f5917h;

    /* renamed from: i */
    public int f5918i;

    /* renamed from: j */
    public int f5919j;

    /* renamed from: k */
    public int f5920k;

    /* renamed from: l */
    public PorterDuffColorFilter f5921l;

    /* renamed from: m */
    public final ArgbEvaluator f5922m;

    /* renamed from: n */
    public float f5923n;

    /* renamed from: o */
    public boolean f5924o;

    /* renamed from: p */
    public final Paint f5925p;

    /* renamed from: q */
    public final Point f5926q;

    /* renamed from: r */
    public final Point f5927r;

    public static class SwitchIconSavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SwitchIconSavedState> CREATOR = new C6495a();

        /* renamed from: a */
        public boolean f5928a;

        /* renamed from: com.xuexiang.xui.widget.button.SwitchIconView$SwitchIconSavedState$a */
        public static class C6495a implements Parcelable.Creator {
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

        public /* synthetic */ SwitchIconSavedState(Parcel parcel, C6496a c6496a) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f5928a ? 1 : 0);
        }

        public SwitchIconSavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SwitchIconSavedState(Parcel parcel) {
            super(parcel);
            this.f5928a = parcel.readInt() == 1;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.SwitchIconView$a */
    public class C6496a implements ValueAnimator.AnimatorUpdateListener {
        public C6496a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SwitchIconView.this.setFraction(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFraction(float f10) {
        this.f5923n = f10;
        m5528j(f10);
        m5526h(f10);
        m5527i();
        m5523e();
    }

    /* renamed from: b */
    public final void m5520b(float f10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f5923n, f10);
        valueAnimatorOfFloat.addUpdateListener(new C6496a());
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.setDuration(this.f5910a);
        valueAnimatorOfFloat.start();
    }

    /* renamed from: c */
    public final void m5521c(Canvas canvas) {
        float f10 = this.f5923n;
        Point point = this.f5927r;
        int i10 = point.x;
        Point point2 = this.f5926q;
        int i11 = point2.x;
        float f11 = ((i10 - i11) * f10) + i11;
        int i12 = point.y;
        int i13 = point2.y;
        canvas.drawLine(i11, i13, f11, (f10 * (i12 - i13)) + i13, this.f5925p);
    }

    /* renamed from: d */
    public final void m5522d() {
        float f10 = f5909s;
        int i10 = this.f5918i;
        float f11 = 1.5f * f10 * i10;
        float f12 = f10 * 0.5f * i10;
        Point point = this.f5926q;
        point.x = (int) (this.f5912c + f12);
        point.y = ((int) f11) + this.f5913d;
        Point point2 = this.f5927r;
        point2.x = (int) ((r3 + this.f5919j) - f11);
        point2.y = (int) ((r4 + this.f5920k) - f12);
    }

    /* renamed from: e */
    public final void m5523e() {
        postInvalidateOnAnimation();
    }

    /* renamed from: f */
    public void m5524f(boolean z9, boolean z10) {
        if (this.f5924o == z9) {
            return;
        }
        m5525g(z10);
    }

    /* renamed from: g */
    public void m5525g(boolean z9) {
        boolean z10 = this.f5924o;
        float f10 = z10 ? 1.0f : 0.0f;
        this.f5924o = !z10;
        if (z9) {
            m5520b(f10);
        } else {
            setFraction(f10);
            invalidate();
        }
    }

    /* renamed from: h */
    public final void m5526h(float f10) {
        float f11 = this.f5911b;
        int i10 = (int) ((f11 + ((1.0f - f10) * (1.0f - f11))) * 255.0f);
        m5529k(i10);
        this.f5925p.setAlpha(i10);
    }

    /* renamed from: i */
    public final void m5527i() {
        float f10 = this.f5918i / f5909s;
        this.f5914e.reset();
        this.f5914e.moveTo(this.f5912c, this.f5913d + f10);
        this.f5914e.lineTo(this.f5912c + f10, this.f5913d);
        Path path = this.f5914e;
        float f11 = this.f5912c;
        float f12 = this.f5919j;
        float f13 = this.f5923n;
        path.lineTo(f11 + (f12 * f13), (this.f5913d + (this.f5920k * f13)) - f10);
        Path path2 = this.f5914e;
        float f14 = this.f5912c;
        float f15 = this.f5919j;
        float f16 = this.f5923n;
        path2.lineTo((f14 + (f15 * f16)) - f10, this.f5913d + (this.f5920k * f16));
    }

    /* renamed from: j */
    public final void m5528j(float f10) {
        int i10 = this.f5915f;
        if (i10 != this.f5916g) {
            int iIntValue = ((Integer) this.f5922m.evaluate(f10, Integer.valueOf(i10), Integer.valueOf(this.f5916g))).intValue();
            m5530l(iIntValue);
            this.f5925p.setColor(iIntValue);
        }
    }

    /* renamed from: k */
    public final void m5529k(int i10) {
        setImageAlpha(i10);
    }

    /* renamed from: l */
    public final void m5530l(int i10) {
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        this.f5921l = porterDuffColorFilter;
        setColorFilter(porterDuffColorFilter);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (!this.f5917h) {
            m5521c(canvas);
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutPath(this.f5914e);
            } else {
                canvas.clipPath(this.f5914e, Region.Op.XOR);
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
        boolean z9 = switchIconSavedState.f5928a;
        this.f5924o = z9;
        setFraction(z9 ? 0.0f : 1.0f);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SwitchIconSavedState switchIconSavedState = new SwitchIconSavedState(super.onSaveInstanceState());
        switchIconSavedState.f5928a = this.f5924o;
        return switchIconSavedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f5919j = (i10 - getPaddingLeft()) - getPaddingRight();
        this.f5920k = (i11 - getPaddingTop()) - getPaddingBottom();
        int i14 = (int) (((this.f5919j + r2) * 0.083333336f) / 2.0f);
        this.f5918i = i14;
        this.f5925p.setStrokeWidth(i14);
        m5522d();
        m5527i();
    }

    public void setIconEnabled(boolean z9) {
        m5524f(z9, true);
    }
}
