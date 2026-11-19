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

/* loaded from: classes3.dex */
public class SwitchIconView extends AppCompatImageView {

    /* renamed from: s */
    public static final float f4633s = (float) Math.sin(Math.toRadians(45.0d));

    /* renamed from: a */
    public final long f4634a;

    /* renamed from: b */
    public final float f4635b;

    /* renamed from: c */
    public final int f4636c;

    /* renamed from: d */
    public final int f4637d;

    /* renamed from: e */
    public final Path f4638e;

    /* renamed from: f */
    public final int f4639f;

    /* renamed from: g */
    public final int f4640g;

    /* renamed from: h */
    public final boolean f4641h;

    /* renamed from: i */
    public int f4642i;

    /* renamed from: j */
    public int f4643j;

    /* renamed from: k */
    public int f4644k;

    /* renamed from: l */
    public PorterDuffColorFilter f4645l;

    /* renamed from: m */
    public final ArgbEvaluator f4646m;

    /* renamed from: n */
    public float f4647n;

    /* renamed from: o */
    public boolean f4648o;

    /* renamed from: p */
    public final Paint f4649p;

    /* renamed from: q */
    public final Point f4650q;

    /* renamed from: r */
    public final Point f4651r;

    public static class SwitchIconSavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SwitchIconSavedState> CREATOR = new C5873a();

        /* renamed from: a */
        public boolean f4652a;

        /* renamed from: com.xuexiang.xui.widget.button.SwitchIconView$SwitchIconSavedState$a */
        public static class C5873a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SwitchIconSavedState createFromParcel(Parcel parcel) {
                return new SwitchIconSavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SwitchIconSavedState[] newArray(int i6) {
                return new SwitchIconSavedState[i6];
            }
        }

        public /* synthetic */ SwitchIconSavedState(Parcel parcel, C5874a c5874a) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeInt(this.f4652a ? 1 : 0);
        }

        public SwitchIconSavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SwitchIconSavedState(Parcel parcel) {
            super(parcel);
            this.f4652a = parcel.readInt() == 1;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.SwitchIconView$a */
    public class C5874a implements ValueAnimator.AnimatorUpdateListener {
        public C5874a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SwitchIconView.this.setFraction(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFraction(float f6) {
        this.f4647n = f6;
        m4538j(f6);
        m4536h(f6);
        m4537i();
        m4533e();
    }

    /* renamed from: b */
    public final void m4530b(float f6) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f4647n, f6);
        valueAnimatorOfFloat.addUpdateListener(new C5874a());
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.setDuration(this.f4634a);
        valueAnimatorOfFloat.start();
    }

    /* renamed from: c */
    public final void m4531c(Canvas canvas) {
        float f6 = this.f4647n;
        Point point = this.f4651r;
        int i6 = point.x;
        Point point2 = this.f4650q;
        int i7 = point2.x;
        float f7 = ((i6 - i7) * f6) + i7;
        int i8 = point.y;
        int i9 = point2.y;
        canvas.drawLine(i7, i9, f7, (f6 * (i8 - i9)) + i9, this.f4649p);
    }

    /* renamed from: d */
    public final void m4532d() {
        float f6 = f4633s;
        int i6 = this.f4642i;
        float f7 = 1.5f * f6 * i6;
        float f8 = f6 * 0.5f * i6;
        Point point = this.f4650q;
        point.x = (int) (this.f4636c + f8);
        point.y = ((int) f7) + this.f4637d;
        Point point2 = this.f4651r;
        point2.x = (int) ((r3 + this.f4643j) - f7);
        point2.y = (int) ((r4 + this.f4644k) - f8);
    }

    /* renamed from: e */
    public final void m4533e() {
        postInvalidateOnAnimation();
    }

    /* renamed from: f */
    public void m4534f(boolean z6, boolean z7) {
        if (this.f4648o == z6) {
            return;
        }
        m4535g(z7);
    }

    /* renamed from: g */
    public void m4535g(boolean z6) {
        boolean z7 = this.f4648o;
        float f6 = z7 ? 1.0f : 0.0f;
        this.f4648o = !z7;
        if (z6) {
            m4530b(f6);
        } else {
            setFraction(f6);
            invalidate();
        }
    }

    /* renamed from: h */
    public final void m4536h(float f6) {
        float f7 = this.f4635b;
        int i6 = (int) ((f7 + ((1.0f - f6) * (1.0f - f7))) * 255.0f);
        m4539k(i6);
        this.f4649p.setAlpha(i6);
    }

    /* renamed from: i */
    public final void m4537i() {
        float f6 = this.f4642i / f4633s;
        this.f4638e.reset();
        this.f4638e.moveTo(this.f4636c, this.f4637d + f6);
        this.f4638e.lineTo(this.f4636c + f6, this.f4637d);
        Path path = this.f4638e;
        float f7 = this.f4636c;
        float f8 = this.f4643j;
        float f9 = this.f4647n;
        path.lineTo(f7 + (f8 * f9), (this.f4637d + (this.f4644k * f9)) - f6);
        Path path2 = this.f4638e;
        float f10 = this.f4636c;
        float f11 = this.f4643j;
        float f12 = this.f4647n;
        path2.lineTo((f10 + (f11 * f12)) - f6, this.f4637d + (this.f4644k * f12));
    }

    /* renamed from: j */
    public final void m4538j(float f6) {
        int i6 = this.f4639f;
        if (i6 != this.f4640g) {
            int iIntValue = ((Integer) this.f4646m.evaluate(f6, Integer.valueOf(i6), Integer.valueOf(this.f4640g))).intValue();
            m4540l(iIntValue);
            this.f4649p.setColor(iIntValue);
        }
    }

    /* renamed from: k */
    public final void m4539k(int i6) {
        setImageAlpha(i6);
    }

    /* renamed from: l */
    public final void m4540l(int i6) {
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i6, PorterDuff.Mode.SRC_IN);
        this.f4645l = porterDuffColorFilter;
        setColorFilter(porterDuffColorFilter);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (!this.f4641h) {
            m4531c(canvas);
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutPath(this.f4638e);
            } else {
                canvas.clipPath(this.f4638e, Region.Op.XOR);
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
        boolean z6 = switchIconSavedState.f4652a;
        this.f4648o = z6;
        setFraction(z6 ? 0.0f : 1.0f);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SwitchIconSavedState switchIconSavedState = new SwitchIconSavedState(super.onSaveInstanceState());
        switchIconSavedState.f4652a = this.f4648o;
        return switchIconSavedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i6, int i7, int i8, int i9) {
        super.onSizeChanged(i6, i7, i8, i9);
        this.f4643j = (i6 - getPaddingLeft()) - getPaddingRight();
        this.f4644k = (i7 - getPaddingTop()) - getPaddingBottom();
        int i10 = (int) (((this.f4643j + r2) * 0.083333336f) / 2.0f);
        this.f4642i = i10;
        this.f4649p.setStrokeWidth(i10);
        m4532d();
        m4537i();
    }

    public void setIconEnabled(boolean z6) {
        m4534f(z6, true);
    }
}
