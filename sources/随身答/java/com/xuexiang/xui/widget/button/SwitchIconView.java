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
    public static final float f7164s = (float) Math.sin(Math.toRadians(45.0d));

    /* renamed from: a */
    public final long f7165a;

    /* renamed from: b */
    public final float f7166b;

    /* renamed from: c */
    public final int f7167c;

    /* renamed from: d */
    public final int f7168d;

    /* renamed from: e */
    public final Path f7169e;

    /* renamed from: f */
    public final int f7170f;

    /* renamed from: g */
    public final int f7171g;

    /* renamed from: h */
    public final boolean f7172h;

    /* renamed from: i */
    public int f7173i;

    /* renamed from: j */
    public int f7174j;

    /* renamed from: k */
    public int f7175k;

    /* renamed from: l */
    public PorterDuffColorFilter f7176l;

    /* renamed from: m */
    public final ArgbEvaluator f7177m;

    /* renamed from: n */
    public float f7178n;

    /* renamed from: o */
    public boolean f7179o;

    /* renamed from: p */
    public final Paint f7180p;

    /* renamed from: q */
    public final Point f7181q;

    /* renamed from: r */
    public final Point f7182r;

    public static class SwitchIconSavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SwitchIconSavedState> CREATOR = new C6814a();

        /* renamed from: a */
        public boolean f7183a;

        /* renamed from: com.xuexiang.xui.widget.button.SwitchIconView$SwitchIconSavedState$a */
        public static class C6814a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SwitchIconSavedState createFromParcel(Parcel parcel) {
                return new SwitchIconSavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SwitchIconSavedState[] newArray(int i9) {
                return new SwitchIconSavedState[i9];
            }
        }

        public /* synthetic */ SwitchIconSavedState(Parcel parcel, C6815a c6815a) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i9) {
            super.writeToParcel(parcel, i9);
            parcel.writeInt(this.f7183a ? 1 : 0);
        }

        public SwitchIconSavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SwitchIconSavedState(Parcel parcel) {
            super(parcel);
            this.f7183a = parcel.readInt() == 1;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.SwitchIconView$a */
    public class C6815a implements ValueAnimator.AnimatorUpdateListener {
        public C6815a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SwitchIconView.this.setFraction(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFraction(float f10) {
        this.f7178n = f10;
        m6624j(f10);
        m6622h(f10);
        m6623i();
        m6619e();
    }

    /* renamed from: b */
    public final void m6616b(float f10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f7178n, f10);
        valueAnimatorOfFloat.addUpdateListener(new C6815a());
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.setDuration(this.f7165a);
        valueAnimatorOfFloat.start();
    }

    /* renamed from: c */
    public final void m6617c(Canvas canvas) {
        float f10 = this.f7178n;
        Point point = this.f7182r;
        int i9 = point.x;
        Point point2 = this.f7181q;
        int i10 = point2.x;
        float f11 = ((i9 - i10) * f10) + i10;
        int i11 = point.y;
        int i12 = point2.y;
        canvas.drawLine(i10, i12, f11, (f10 * (i11 - i12)) + i12, this.f7180p);
    }

    /* renamed from: d */
    public final void m6618d() {
        float f10 = f7164s;
        int i9 = this.f7173i;
        float f11 = 1.5f * f10 * i9;
        float f12 = f10 * 0.5f * i9;
        Point point = this.f7181q;
        point.x = (int) (this.f7167c + f12);
        point.y = ((int) f11) + this.f7168d;
        Point point2 = this.f7182r;
        point2.x = (int) ((r3 + this.f7174j) - f11);
        point2.y = (int) ((r4 + this.f7175k) - f12);
    }

    /* renamed from: e */
    public final void m6619e() {
        postInvalidateOnAnimation();
    }

    /* renamed from: f */
    public void m6620f(boolean z9, boolean z10) {
        if (this.f7179o == z9) {
            return;
        }
        m6621g(z10);
    }

    /* renamed from: g */
    public void m6621g(boolean z9) {
        boolean z10 = this.f7179o;
        float f10 = z10 ? 1.0f : 0.0f;
        this.f7179o = !z10;
        if (z9) {
            m6616b(f10);
        } else {
            setFraction(f10);
            invalidate();
        }
    }

    /* renamed from: h */
    public final void m6622h(float f10) {
        float f11 = this.f7166b;
        int i9 = (int) ((f11 + ((1.0f - f10) * (1.0f - f11))) * 255.0f);
        m6625k(i9);
        this.f7180p.setAlpha(i9);
    }

    /* renamed from: i */
    public final void m6623i() {
        float f10 = this.f7173i / f7164s;
        this.f7169e.reset();
        this.f7169e.moveTo(this.f7167c, this.f7168d + f10);
        this.f7169e.lineTo(this.f7167c + f10, this.f7168d);
        Path path = this.f7169e;
        float f11 = this.f7167c;
        float f12 = this.f7174j;
        float f13 = this.f7178n;
        path.lineTo(f11 + (f12 * f13), (this.f7168d + (this.f7175k * f13)) - f10);
        Path path2 = this.f7169e;
        float f14 = this.f7167c;
        float f15 = this.f7174j;
        float f16 = this.f7178n;
        path2.lineTo((f14 + (f15 * f16)) - f10, this.f7168d + (this.f7175k * f16));
    }

    /* renamed from: j */
    public final void m6624j(float f10) {
        int i9 = this.f7170f;
        if (i9 != this.f7171g) {
            int iIntValue = ((Integer) this.f7177m.evaluate(f10, Integer.valueOf(i9), Integer.valueOf(this.f7171g))).intValue();
            m6626l(iIntValue);
            this.f7180p.setColor(iIntValue);
        }
    }

    /* renamed from: k */
    public final void m6625k(int i9) {
        setImageAlpha(i9);
    }

    /* renamed from: l */
    public final void m6626l(int i9) {
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN);
        this.f7176l = porterDuffColorFilter;
        setColorFilter(porterDuffColorFilter);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (!this.f7172h) {
            m6617c(canvas);
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutPath(this.f7169e);
            } else {
                canvas.clipPath(this.f7169e, Region.Op.XOR);
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
        boolean z9 = switchIconSavedState.f7183a;
        this.f7179o = z9;
        setFraction(z9 ? 0.0f : 1.0f);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SwitchIconSavedState switchIconSavedState = new SwitchIconSavedState(super.onSaveInstanceState());
        switchIconSavedState.f7183a = this.f7179o;
        return switchIconSavedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        this.f7174j = (i9 - getPaddingLeft()) - getPaddingRight();
        this.f7175k = (i10 - getPaddingTop()) - getPaddingBottom();
        int i13 = (int) (((this.f7174j + r2) * 0.083333336f) / 2.0f);
        this.f7173i = i13;
        this.f7180p.setStrokeWidth(i13);
        m6618d();
        m6623i();
    }

    public void setIconEnabled(boolean z9) {
        m6620f(z9, true);
    }
}
