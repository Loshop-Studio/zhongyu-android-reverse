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

/* loaded from: classes2.dex */
public class SwitchIconView extends AppCompatImageView {

    /* renamed from: s */
    public static final float f3249s = (float) Math.sin(Math.toRadians(45.0d));

    /* renamed from: a */
    public final long f3250a;

    /* renamed from: b */
    public final float f3251b;

    /* renamed from: c */
    public final int f3252c;

    /* renamed from: d */
    public final int f3253d;

    /* renamed from: e */
    public final Path f3254e;

    /* renamed from: f */
    public final int f3255f;

    /* renamed from: g */
    public final int f3256g;

    /* renamed from: h */
    public final boolean f3257h;

    /* renamed from: i */
    public int f3258i;

    /* renamed from: j */
    public int f3259j;

    /* renamed from: k */
    public int f3260k;

    /* renamed from: l */
    public PorterDuffColorFilter f3261l;

    /* renamed from: m */
    public final ArgbEvaluator f3262m;

    /* renamed from: n */
    public float f3263n;

    /* renamed from: o */
    public boolean f3264o;

    /* renamed from: p */
    public final Paint f3265p;

    /* renamed from: q */
    public final Point f3266q;

    /* renamed from: r */
    public final Point f3267r;

    public static class SwitchIconSavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SwitchIconSavedState> CREATOR = new C3544a();

        /* renamed from: a */
        public boolean f3268a;

        /* renamed from: com.xuexiang.xui.widget.button.SwitchIconView$SwitchIconSavedState$a */
        public static class C3544a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SwitchIconSavedState createFromParcel(Parcel parcel) {
                return new SwitchIconSavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SwitchIconSavedState[] newArray(int i4) {
                return new SwitchIconSavedState[i4];
            }
        }

        public /* synthetic */ SwitchIconSavedState(Parcel parcel, C3545a c3545a) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f3268a ? 1 : 0);
        }

        public SwitchIconSavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SwitchIconSavedState(Parcel parcel) {
            super(parcel);
            this.f3268a = parcel.readInt() == 1;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.SwitchIconView$a */
    public class C3545a implements ValueAnimator.AnimatorUpdateListener {
        public C3545a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SwitchIconView.this.setFraction(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFraction(float f4) {
        this.f3263n = f4;
        m4214j(f4);
        m4212h(f4);
        m4213i();
        m4209e();
    }

    /* renamed from: b */
    public final void m4206b(float f4) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f3263n, f4);
        valueAnimatorOfFloat.addUpdateListener(new C3545a());
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.setDuration(this.f3250a);
        valueAnimatorOfFloat.start();
    }

    /* renamed from: c */
    public final void m4207c(Canvas canvas) {
        float f4 = this.f3263n;
        Point point = this.f3267r;
        int i4 = point.x;
        Point point2 = this.f3266q;
        int i5 = point2.x;
        float f5 = ((i4 - i5) * f4) + i5;
        int i6 = point.y;
        int i7 = point2.y;
        canvas.drawLine(i5, i7, f5, (f4 * (i6 - i7)) + i7, this.f3265p);
    }

    /* renamed from: d */
    public final void m4208d() {
        float f4 = f3249s;
        int i4 = this.f3258i;
        float f5 = 1.5f * f4 * i4;
        float f6 = f4 * 0.5f * i4;
        Point point = this.f3266q;
        point.x = (int) (this.f3252c + f6);
        point.y = ((int) f5) + this.f3253d;
        Point point2 = this.f3267r;
        point2.x = (int) ((r3 + this.f3259j) - f5);
        point2.y = (int) ((r4 + this.f3260k) - f6);
    }

    /* renamed from: e */
    public final void m4209e() {
        postInvalidateOnAnimation();
    }

    /* renamed from: f */
    public void m4210f(boolean z3, boolean z4) {
        if (this.f3264o == z3) {
            return;
        }
        m4211g(z4);
    }

    /* renamed from: g */
    public void m4211g(boolean z3) {
        boolean z4 = this.f3264o;
        float f4 = z4 ? 1.0f : 0.0f;
        this.f3264o = !z4;
        if (z3) {
            m4206b(f4);
        } else {
            setFraction(f4);
            invalidate();
        }
    }

    /* renamed from: h */
    public final void m4212h(float f4) {
        float f5 = this.f3251b;
        int i4 = (int) ((f5 + ((1.0f - f4) * (1.0f - f5))) * 255.0f);
        m4215k(i4);
        this.f3265p.setAlpha(i4);
    }

    /* renamed from: i */
    public final void m4213i() {
        float f4 = this.f3258i / f3249s;
        this.f3254e.reset();
        this.f3254e.moveTo(this.f3252c, this.f3253d + f4);
        this.f3254e.lineTo(this.f3252c + f4, this.f3253d);
        Path path = this.f3254e;
        float f5 = this.f3252c;
        float f6 = this.f3259j;
        float f7 = this.f3263n;
        path.lineTo(f5 + (f6 * f7), (this.f3253d + (this.f3260k * f7)) - f4);
        Path path2 = this.f3254e;
        float f8 = this.f3252c;
        float f9 = this.f3259j;
        float f10 = this.f3263n;
        path2.lineTo((f8 + (f9 * f10)) - f4, this.f3253d + (this.f3260k * f10));
    }

    /* renamed from: j */
    public final void m4214j(float f4) {
        int i4 = this.f3255f;
        if (i4 != this.f3256g) {
            int iIntValue = ((Integer) this.f3262m.evaluate(f4, Integer.valueOf(i4), Integer.valueOf(this.f3256g))).intValue();
            m4216l(iIntValue);
            this.f3265p.setColor(iIntValue);
        }
    }

    /* renamed from: k */
    public final void m4215k(int i4) {
        setImageAlpha(i4);
    }

    /* renamed from: l */
    public final void m4216l(int i4) {
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i4, PorterDuff.Mode.SRC_IN);
        this.f3261l = porterDuffColorFilter;
        setColorFilter(porterDuffColorFilter);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (!this.f3257h) {
            m4207c(canvas);
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutPath(this.f3254e);
            } else {
                canvas.clipPath(this.f3254e, Region.Op.XOR);
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
        boolean z3 = switchIconSavedState.f3268a;
        this.f3264o = z3;
        setFraction(z3 ? 0.0f : 1.0f);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SwitchIconSavedState switchIconSavedState = new SwitchIconSavedState(super.onSaveInstanceState());
        switchIconSavedState.f3268a = this.f3264o;
        return switchIconSavedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        this.f3259j = (i4 - getPaddingLeft()) - getPaddingRight();
        this.f3260k = (i5 - getPaddingTop()) - getPaddingBottom();
        int i8 = (int) (((this.f3259j + r2) * 0.083333336f) / 2.0f);
        this.f3258i = i8;
        this.f3265p.setStrokeWidth(i8);
        m4208d();
        m4213i();
    }

    public void setIconEnabled(boolean z3) {
        m4210f(z3, true);
    }
}
