package com.xuexiang.xui.widget.button.switchbutton;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.CompoundButton;
import androidx.collection.AbstractC0584a;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$styleable;
import p185v7.AbstractC6675d;

/* loaded from: classes3.dex */
public class SwitchButton extends CompoundButton {

    /* renamed from: h0 */
    public static final int[] f4192h0 = {R.attr.state_checked, R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: i0 */
    public static final int[] f4193i0 = {-16842912, R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: A */
    public RectF f4194A;

    /* renamed from: B */
    public Paint f4195B;

    /* renamed from: C */
    public boolean f4196C;

    /* renamed from: D */
    public boolean f4197D;

    /* renamed from: E */
    public boolean f4198E;

    /* renamed from: F */
    public ObjectAnimator f4199F;

    /* renamed from: G */
    public float f4200G;

    /* renamed from: H */
    public RectF f4201H;

    /* renamed from: I */
    public float f4202I;

    /* renamed from: J */
    public float f4203J;

    /* renamed from: K */
    public float f4204K;

    /* renamed from: L */
    public int f4205L;

    /* renamed from: M */
    public int f4206M;

    /* renamed from: N */
    public Paint f4207N;

    /* renamed from: O */
    public CharSequence f4208O;

    /* renamed from: P */
    public CharSequence f4209P;

    /* renamed from: Q */
    public TextPaint f4210Q;

    /* renamed from: R */
    public StaticLayout f4211R;

    /* renamed from: S */
    public StaticLayout f4212S;

    /* renamed from: T */
    public float f4213T;

    /* renamed from: U */
    public float f4214U;

    /* renamed from: V */
    public int f4215V;

    /* renamed from: W */
    public int f4216W;

    /* renamed from: a */
    public Drawable f4217a;

    /* renamed from: b */
    public Drawable f4218b;

    /* renamed from: c */
    public ColorStateList f4219c;

    /* renamed from: c0 */
    public int f4220c0;

    /* renamed from: d */
    public ColorStateList f4221d;

    /* renamed from: d0 */
    public boolean f4222d0;

    /* renamed from: e */
    public float f4223e;

    /* renamed from: e0 */
    public boolean f4224e0;

    /* renamed from: f */
    public float f4225f;

    /* renamed from: f0 */
    public boolean f4226f0;

    /* renamed from: g */
    public RectF f4227g;

    /* renamed from: g0 */
    public CompoundButton.OnCheckedChangeListener f4228g0;

    /* renamed from: h */
    public float f4229h;

    /* renamed from: i */
    public long f4230i;

    /* renamed from: j */
    public boolean f4231j;

    /* renamed from: k */
    public int f4232k;

    /* renamed from: l */
    public int f4233l;

    /* renamed from: m */
    public int f4234m;

    /* renamed from: n */
    public int f4235n;

    /* renamed from: o */
    public int f4236o;

    /* renamed from: p */
    public int f4237p;

    /* renamed from: q */
    public int f4238q;

    /* renamed from: r */
    public int f4239r;

    /* renamed from: s */
    public int f4240s;

    /* renamed from: t */
    public int f4241t;

    /* renamed from: u */
    public Drawable f4242u;

    /* renamed from: v */
    public Drawable f4243v;

    /* renamed from: w */
    public RectF f4244w;

    /* renamed from: x */
    public RectF f4245x;

    /* renamed from: y */
    public RectF f4246y;

    /* renamed from: z */
    public RectF f4247z;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C4170a();

        /* renamed from: a */
        public CharSequence f4248a;

        /* renamed from: b */
        public CharSequence f4249b;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f4248a, parcel, i);
            TextUtils.writeToParcel(this.f4249b, parcel, i);
        }
    }

    public SwitchButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4198E = false;
        this.f4222d0 = false;
        this.f4224e0 = false;
        this.f4226f0 = false;
        m3475b(attributeSet);
    }

    private float getProgress() {
        return this.f4200G;
    }

    private boolean getStatusBasedOnPos() {
        return getProgress() > 0.5f;
    }

    private void setDrawableState(Drawable drawable) {
        if (drawable != null) {
            drawable.setState(getDrawableState());
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0006 A[PHI: r0
      0x0006: PHI (r0v2 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0004, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void setProgress(float r3) {
        /*
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L8
        L6:
            r3 = r0
            goto Le
        L8:
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto Le
            goto L6
        Le:
            r2.f4200G = r3
            r2.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.button.switchbutton.SwitchButton.setProgress(float):void");
    }

    /* renamed from: a */
    public final void m3474a(boolean z8) {
        ObjectAnimator objectAnimator = this.f4199F;
        if (objectAnimator == null) {
            return;
        }
        if (objectAnimator.isRunning()) {
            this.f4199F.cancel();
        }
        this.f4199F.setDuration(this.f4230i);
        if (z8) {
            this.f4199F.setFloatValues(this.f4200G, 1.0f);
        } else {
            this.f4199F.setFloatValues(this.f4200G, 0.0f);
        }
        this.f4199F.start();
    }

    /* renamed from: b */
    public final void m3475b(AttributeSet attributeSet) {
        float f;
        int i;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        String str;
        String str2;
        int i8;
        int i9;
        int i10;
        int i11;
        Drawable drawable;
        ColorStateList colorStateList;
        Drawable drawable2;
        ColorStateList colorStateList2;
        boolean z8;
        float f16;
        ColorStateList colorStateList3;
        TypedArray typedArrayObtainStyledAttributes;
        boolean z9;
        this.f4205L = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f4206M = ViewConfiguration.getTapTimeout() + ViewConfiguration.getPressedStateDuration();
        this.f4195B = new Paint(1);
        Paint paint = new Paint(1);
        this.f4207N = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f4207N.setStrokeWidth(getResources().getDisplayMetrics().density);
        this.f4210Q = getPaint();
        this.f4244w = new RectF();
        this.f4245x = new RectF();
        this.f4246y = new RectF();
        this.f4227g = new RectF();
        this.f4247z = new RectF();
        this.f4194A = new RectF();
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "progress", 0.0f, 0.0f).setDuration(250L);
        this.f4199F = duration;
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f4201H = new RectF();
        float f17 = getResources().getDisplayMetrics().density * 2.0f;
        TypedArray typedArrayObtainStyledAttributes2 = attributeSet == null ? null : getContext().obtainStyledAttributes(attributeSet, R$styleable.SwitchButton);
        if (typedArrayObtainStyledAttributes2 != null) {
            getContext();
            Drawable drawable3 = typedArrayObtainStyledAttributes2.getDrawable(R$styleable.SwitchButton_swb_thumbDrawable);
            colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(R$styleable.SwitchButton_swb_thumbColor);
            float dimension = typedArrayObtainStyledAttributes2.getDimension(R$styleable.SwitchButton_swb_thumbMargin, f17);
            float dimension2 = typedArrayObtainStyledAttributes2.getDimension(R$styleable.SwitchButton_swb_thumbMarginLeft, dimension);
            float dimension3 = typedArrayObtainStyledAttributes2.getDimension(R$styleable.SwitchButton_swb_thumbMarginRight, dimension);
            float dimension4 = typedArrayObtainStyledAttributes2.getDimension(R$styleable.SwitchButton_swb_thumbMarginTop, dimension);
            float dimension5 = typedArrayObtainStyledAttributes2.getDimension(R$styleable.SwitchButton_swb_thumbMarginBottom, dimension);
            float dimension6 = typedArrayObtainStyledAttributes2.getDimension(R$styleable.SwitchButton_swb_thumbWidth, 0.0f);
            float dimension7 = typedArrayObtainStyledAttributes2.getDimension(R$styleable.SwitchButton_swb_thumbHeight, 0.0f);
            f = 0.0f;
            float dimension8 = typedArrayObtainStyledAttributes2.getDimension(R$styleable.SwitchButton_swb_thumbRadius, -1.0f);
            float dimension9 = typedArrayObtainStyledAttributes2.getDimension(R$styleable.SwitchButton_swb_backRadius, -1.0f);
            getContext();
            Drawable drawable4 = typedArrayObtainStyledAttributes2.getDrawable(R$styleable.SwitchButton_swb_backDrawable);
            ColorStateList colorStateList4 = typedArrayObtainStyledAttributes2.getColorStateList(R$styleable.SwitchButton_swb_backColor);
            float f18 = typedArrayObtainStyledAttributes2.getFloat(R$styleable.SwitchButton_swb_thumbRangeRatio, 1.8f);
            int integer = typedArrayObtainStyledAttributes2.getInteger(R$styleable.SwitchButton_swb_animationDuration, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
            boolean z10 = typedArrayObtainStyledAttributes2.getBoolean(R$styleable.SwitchButton_swb_fadeBack, true);
            int color = typedArrayObtainStyledAttributes2.getColor(R$styleable.SwitchButton_swb_tintColor, 0);
            String string = typedArrayObtainStyledAttributes2.getString(R$styleable.SwitchButton_swb_textOn);
            String string2 = typedArrayObtainStyledAttributes2.getString(R$styleable.SwitchButton_swb_textOff);
            int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.SwitchButton_swb_textThumbInset, 0);
            int dimensionPixelSize2 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.SwitchButton_swb_textExtra, 0);
            int dimensionPixelSize3 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.SwitchButton_swb_textAdjust, 0);
            typedArrayObtainStyledAttributes2.recycle();
            f14 = dimension3;
            f15 = dimension4;
            f10 = dimension5;
            str2 = string;
            colorStateList2 = colorStateList4;
            f13 = dimension2;
            i = integer;
            z8 = z10;
            i11 = color;
            f8 = dimension8;
            f9 = f18;
            drawable2 = drawable3;
            i8 = dimensionPixelSize;
            i10 = dimensionPixelSize3;
            f12 = dimension6;
            f11 = dimension7;
            drawable = drawable4;
            str = string2;
            f7 = dimension9;
            i9 = dimensionPixelSize2;
        } else {
            f = 0.0f;
            i = 250;
            f7 = -1.0f;
            f8 = -1.0f;
            f9 = 1.8f;
            f10 = 0.0f;
            f11 = 0.0f;
            f12 = 0.0f;
            f13 = 0.0f;
            f14 = 0.0f;
            f15 = 0.0f;
            str = null;
            str2 = null;
            i8 = 0;
            i9 = 0;
            i10 = 0;
            i11 = 0;
            drawable = null;
            colorStateList = null;
            drawable2 = null;
            colorStateList2 = null;
            z8 = true;
        }
        float f19 = f10;
        if (attributeSet == null) {
            f16 = f13;
            colorStateList3 = colorStateList2;
            typedArrayObtainStyledAttributes = null;
        } else {
            f16 = f13;
            colorStateList3 = colorStateList2;
            typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.focusable, R.attr.clickable});
        }
        if (typedArrayObtainStyledAttributes != null) {
            boolean z11 = typedArrayObtainStyledAttributes.getBoolean(0, true);
            boolean z12 = typedArrayObtainStyledAttributes.getBoolean(1, z11);
            setFocusable(z11);
            setClickable(z12);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            setFocusable(true);
            setClickable(true);
        }
        this.f4208O = str2;
        this.f4209P = str;
        this.f4215V = i8;
        this.f4216W = i9;
        this.f4220c0 = i10;
        this.f4217a = drawable2;
        this.f4221d = colorStateList;
        this.f4196C = drawable2 != null;
        this.f4232k = i11;
        if (i11 == 0) {
            TypedValue typedValue = new TypedValue();
            z9 = true;
            if (getContext().getTheme().resolveAttribute(R$attr.colorAccent, typedValue, true)) {
                this.f4232k = typedValue.data;
            } else {
                this.f4232k = 3309506;
            }
        } else {
            z9 = true;
        }
        if (!this.f4196C && this.f4221d == null) {
            ColorStateList colorStateListM6348j = AbstractC6675d.m6348j(this.f4232k);
            this.f4221d = colorStateListM6348j;
            this.f4237p = colorStateListM6348j.getDefaultColor();
        }
        this.f4233l = (int) Math.ceil(f12);
        this.f4234m = (int) Math.ceil(f11);
        this.f4218b = drawable;
        ColorStateList colorStateList5 = colorStateList3;
        this.f4219c = colorStateList5;
        boolean z13 = drawable != null ? z9 : false;
        this.f4197D = z13;
        if (!z13 && colorStateList5 == null) {
            ColorStateList colorStateListM6347i = AbstractC6675d.m6347i(this.f4232k);
            this.f4219c = colorStateListM6347i;
            int defaultColor = colorStateListM6347i.getDefaultColor();
            this.f4238q = defaultColor;
            this.f4239r = this.f4219c.getColorForState(f4192h0, defaultColor);
        }
        this.f4227g.set(f16, f15, f14, f19);
        float f20 = f9;
        this.f4229h = this.f4227g.width() >= f ? Math.max(f20, 1.0f) : f20;
        this.f4223e = f8;
        this.f4225f = f7;
        long j7 = i;
        this.f4230i = j7;
        this.f4231j = z8;
        this.f4199F.setDuration(j7);
        if (isChecked()) {
            setProgress(1.0f);
        }
    }

    /* renamed from: c */
    public final void m3476c() {
        int i;
        float fMax;
        float fMax2;
        if (this.f4233l == 0 || (i = this.f4234m) == 0 || this.f4235n == 0 || this.f4236o == 0) {
            return;
        }
        if (this.f4223e == -1.0f) {
            this.f4223e = Math.min(r0, i) / 2.0f;
        }
        if (this.f4225f == -1.0f) {
            this.f4225f = Math.min(this.f4235n, this.f4236o) / 2.0f;
        }
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int iCeil = (int) Math.ceil((this.f4235n - Math.min(0.0f, this.f4227g.left)) - Math.min(0.0f, this.f4227g.right));
        if (measuredHeight <= ((int) Math.ceil((this.f4236o - Math.min(0.0f, this.f4227g.top)) - Math.min(0.0f, this.f4227g.bottom)))) {
            fMax = Math.max(0.0f, this.f4227g.top) + getPaddingTop();
        } else {
            fMax = (((measuredHeight - r3) + 1) / 2.0f) + Math.max(0.0f, this.f4227g.top) + getPaddingTop();
        }
        if (measuredWidth <= this.f4235n) {
            fMax2 = Math.max(0.0f, this.f4227g.left) + getPaddingLeft();
        } else {
            fMax2 = (((measuredWidth - iCeil) + 1) / 2.0f) + Math.max(0.0f, this.f4227g.left) + getPaddingLeft();
        }
        this.f4244w.set(fMax2, fMax, this.f4233l + fMax2, this.f4234m + fMax);
        RectF rectF = this.f4244w;
        float f = rectF.left;
        RectF rectF2 = this.f4227g;
        float f7 = f - rectF2.left;
        RectF rectF3 = this.f4245x;
        float f8 = rectF.top - rectF2.top;
        rectF3.set(f7, f8, this.f4235n + f7, this.f4236o + f8);
        RectF rectF4 = this.f4246y;
        RectF rectF5 = this.f4244w;
        rectF4.set(rectF5.left, 0.0f, (this.f4245x.right - this.f4227g.right) - rectF5.width(), 0.0f);
        this.f4225f = Math.min(Math.min(this.f4245x.width(), this.f4245x.height()) / 2.0f, this.f4225f);
        Drawable drawable = this.f4218b;
        if (drawable != null) {
            RectF rectF6 = this.f4245x;
            drawable.setBounds((int) rectF6.left, (int) rectF6.top, (int) Math.ceil(rectF6.right), (int) Math.ceil(this.f4245x.bottom));
        }
        if (this.f4211R != null) {
            RectF rectF7 = this.f4245x;
            float fM900a = AbstractC0584a.m900a(((rectF7.width() + this.f4215V) - this.f4233l) - this.f4227g.right, this.f4211R.getWidth(), 2.0f, rectF7.left) - this.f4220c0;
            RectF rectF8 = this.f4245x;
            float fM900a2 = AbstractC0584a.m900a(rectF8.height(), this.f4211R.getHeight(), 2.0f, rectF8.top);
            this.f4247z.set(fM900a, fM900a2, this.f4211R.getWidth() + fM900a, this.f4211R.getHeight() + fM900a2);
        }
        if (this.f4212S != null) {
            RectF rectF9 = this.f4245x;
            float fWidth = ((rectF9.right - (((((rectF9.width() + this.f4215V) - this.f4233l) - this.f4227g.left) - this.f4212S.getWidth()) / 2.0f)) - this.f4212S.getWidth()) + this.f4220c0;
            RectF rectF10 = this.f4245x;
            float fM900a3 = AbstractC0584a.m900a(rectF10.height(), this.f4212S.getHeight(), 2.0f, rectF10.top);
            this.f4194A.set(fWidth, fM900a3, this.f4212S.getWidth() + fWidth, this.f4212S.getHeight() + fM900a3);
        }
        this.f4224e0 = true;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        super.drawableStateChanged();
        if (this.f4196C || (colorStateList2 = this.f4221d) == null) {
            setDrawableState(this.f4217a);
        } else {
            this.f4237p = colorStateList2.getColorForState(getDrawableState(), this.f4237p);
        }
        boolean zIsChecked = isChecked();
        int[] iArr = f4192h0;
        int[] iArr2 = f4193i0;
        int[] iArr3 = zIsChecked ? iArr2 : iArr;
        ColorStateList textColors = getTextColors();
        if (textColors != null) {
            int defaultColor = textColors.getDefaultColor();
            this.f4240s = textColors.getColorForState(iArr, defaultColor);
            this.f4241t = textColors.getColorForState(iArr2, defaultColor);
        }
        if (!this.f4197D && (colorStateList = this.f4219c) != null) {
            int colorForState = colorStateList.getColorForState(getDrawableState(), this.f4238q);
            this.f4238q = colorForState;
            this.f4239r = this.f4219c.getColorForState(iArr3, colorForState);
            return;
        }
        Drawable drawable = this.f4218b;
        if ((drawable instanceof StateListDrawable) && this.f4231j) {
            drawable.setState(iArr3);
            this.f4243v = this.f4218b.getCurrent().mutate();
        } else {
            this.f4243v = null;
        }
        setDrawableState(this.f4218b);
        Drawable drawable2 = this.f4218b;
        if (drawable2 != null) {
            this.f4242u = drawable2.getCurrent().mutate();
        }
    }

    public long getAnimationDuration() {
        return this.f4230i;
    }

    public ColorStateList getBackColor() {
        return this.f4219c;
    }

    public Drawable getBackDrawable() {
        return this.f4218b;
    }

    public float getBackRadius() {
        return this.f4225f;
    }

    public PointF getBackSizeF() {
        return new PointF(this.f4245x.width(), this.f4245x.height());
    }

    public CharSequence getTextOff() {
        return this.f4209P;
    }

    public CharSequence getTextOn() {
        return this.f4208O;
    }

    public ColorStateList getThumbColor() {
        return this.f4221d;
    }

    public Drawable getThumbDrawable() {
        return this.f4217a;
    }

    public float getThumbHeight() {
        return this.f4234m;
    }

    public RectF getThumbMargin() {
        return this.f4227g;
    }

    public float getThumbRadius() {
        return this.f4223e;
    }

    public float getThumbRangeRatio() {
        return this.f4229h;
    }

    public float getThumbWidth() {
        return this.f4233l;
    }

    public int getTintColor() {
        return this.f4232k;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f4224e0) {
            m3476c();
        }
        if (this.f4224e0) {
            if (this.f4197D) {
                if (!this.f4231j || this.f4242u == null || this.f4243v == null) {
                    this.f4218b.setAlpha(255);
                    this.f4218b.draw(canvas);
                } else {
                    Drawable drawable = isChecked() ? this.f4242u : this.f4243v;
                    Drawable drawable2 = isChecked() ? this.f4243v : this.f4242u;
                    int progress = (int) (getProgress() * 255.0f);
                    drawable.setAlpha(progress);
                    drawable.draw(canvas);
                    drawable2.setAlpha(255 - progress);
                    drawable2.draw(canvas);
                }
            } else if (this.f4231j) {
                int i = isChecked() ? this.f4238q : this.f4239r;
                int i8 = isChecked() ? this.f4239r : this.f4238q;
                int progress2 = (int) (getProgress() * 255.0f);
                this.f4195B.setARGB((Color.alpha(i) * progress2) / 255, Color.red(i), Color.green(i), Color.blue(i));
                RectF rectF = this.f4245x;
                float f = this.f4225f;
                canvas.drawRoundRect(rectF, f, f, this.f4195B);
                this.f4195B.setARGB((Color.alpha(i8) * (255 - progress2)) / 255, Color.red(i8), Color.green(i8), Color.blue(i8));
                RectF rectF2 = this.f4245x;
                float f7 = this.f4225f;
                canvas.drawRoundRect(rectF2, f7, f7, this.f4195B);
                this.f4195B.setAlpha(255);
            } else {
                this.f4195B.setColor(this.f4238q);
                RectF rectF3 = this.f4245x;
                float f8 = this.f4225f;
                canvas.drawRoundRect(rectF3, f8, f8, this.f4195B);
            }
            StaticLayout staticLayout = ((double) getProgress()) > 0.5d ? this.f4211R : this.f4212S;
            RectF rectF4 = ((double) getProgress()) > 0.5d ? this.f4247z : this.f4194A;
            if (staticLayout != null && rectF4 != null) {
                int progress3 = (int) ((((double) getProgress()) >= 0.75d ? (getProgress() * 4.0f) - 3.0f : ((double) getProgress()) < 0.25d ? 1.0f - (getProgress() * 4.0f) : 0.0f) * 255.0f);
                int i9 = ((double) getProgress()) > 0.5d ? this.f4240s : this.f4241t;
                staticLayout.getPaint().setARGB((Color.alpha(i9) * progress3) / 255, Color.red(i9), Color.green(i9), Color.blue(i9));
                canvas.save();
                canvas.translate(rectF4.left, rectF4.top);
                staticLayout.draw(canvas);
                canvas.restore();
            }
            this.f4201H.set(this.f4244w);
            this.f4201H.offset(this.f4246y.width() * this.f4200G, 0.0f);
            if (this.f4196C) {
                Drawable drawable3 = this.f4217a;
                RectF rectF5 = this.f4201H;
                drawable3.setBounds((int) rectF5.left, (int) rectF5.top, (int) Math.ceil(rectF5.right), (int) Math.ceil(this.f4201H.bottom));
                this.f4217a.draw(canvas);
            } else {
                this.f4195B.setColor(this.f4237p);
                RectF rectF6 = this.f4201H;
                float f9 = this.f4223e;
                canvas.drawRoundRect(rectF6, f9, f9, this.f4195B);
            }
            if (this.f4198E) {
                this.f4207N.setColor(Color.parseColor("#AA0000"));
                canvas.drawRect(this.f4245x, this.f4207N);
                this.f4207N.setColor(Color.parseColor("#0000FF"));
                canvas.drawRect(this.f4201H, this.f4207N);
                this.f4207N.setColor(Color.parseColor("#000000"));
                RectF rectF7 = this.f4246y;
                float f10 = rectF7.left;
                float f11 = this.f4244w.top;
                canvas.drawLine(f10, f11, rectF7.right, f11, this.f4207N);
                this.f4207N.setColor(Color.parseColor("#00CC00"));
                canvas.drawRect(((double) getProgress()) > 0.5d ? this.f4247z : this.f4194A, this.f4207N);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02f8  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r12, int r13) {
        /*
            Method dump skipped, instructions count: 870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.button.switchbutton.SwitchButton.onMeasure(int, int):void");
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        CharSequence charSequence = savedState.f4248a;
        CharSequence charSequence2 = savedState.f4249b;
        this.f4208O = charSequence;
        this.f4209P = charSequence2;
        this.f4211R = null;
        this.f4212S = null;
        this.f4224e0 = false;
        requestLayout();
        invalidate();
        this.f4222d0 = true;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f4222d0 = false;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f4248a = this.f4208O;
        savedState.f4249b = this.f4209P;
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i8, int i9, int i10) {
        super.onSizeChanged(i, i8, i9, i10);
        if (i == i9 && i8 == i10) {
            return;
        }
        m3476c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        if (java.lang.Math.abs(r3) > java.lang.Math.abs(r2)) goto L55;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.button.switchbutton.SwitchButton.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAnimationDuration(long j7) {
        this.f4230i = j7;
    }

    public void setBackColor(ColorStateList colorStateList) {
        this.f4219c = colorStateList;
        if (colorStateList != null) {
            setBackDrawable(null);
        }
        invalidate();
    }

    public void setBackColorRes(int i) {
        setBackColor(ContextCompat.getColorStateList(getContext(), i));
    }

    public void setBackDrawable(Drawable drawable) {
        this.f4218b = drawable;
        this.f4197D = drawable != null;
        refreshDrawableState();
        this.f4224e0 = false;
        requestLayout();
        invalidate();
    }

    public void setBackDrawableRes(int i) {
        setBackDrawable(ContextCompat.getDrawable(getContext(), i));
    }

    public void setBackRadius(float f) {
        this.f4225f = f;
        if (this.f4197D) {
            return;
        }
        invalidate();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z8) {
        if (isChecked() != z8) {
            m3474a(z8);
        }
        if (this.f4222d0) {
            setCheckedImmediatelyNoEvent(z8);
        } else {
            super.setChecked(z8);
        }
    }

    public void setCheckedImmediately(boolean z8) {
        super.setChecked(z8);
        ObjectAnimator objectAnimator = this.f4199F;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.f4199F.cancel();
        }
        setProgress(z8 ? 1.0f : 0.0f);
        invalidate();
    }

    public void setCheckedImmediatelyNoEvent(boolean z8) {
        if (this.f4228g0 == null) {
            setCheckedImmediately(z8);
            return;
        }
        super.setOnCheckedChangeListener(null);
        setCheckedImmediately(z8);
        super.setOnCheckedChangeListener(this.f4228g0);
    }

    public void setCheckedNoEvent(boolean z8) {
        if (this.f4228g0 == null) {
            setChecked(z8);
            return;
        }
        super.setOnCheckedChangeListener(null);
        setChecked(z8);
        super.setOnCheckedChangeListener(this.f4228g0);
    }

    public void setDrawDebugRect(boolean z8) {
        this.f4198E = z8;
        invalidate();
    }

    public void setFadeBack(boolean z8) {
        this.f4231j = z8;
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        super.setOnCheckedChangeListener(onCheckedChangeListener);
        this.f4228g0 = onCheckedChangeListener;
    }

    public void setTextAdjust(int i) {
        this.f4220c0 = i;
        this.f4224e0 = false;
        requestLayout();
        invalidate();
    }

    public void setTextExtra(int i) {
        this.f4216W = i;
        this.f4224e0 = false;
        requestLayout();
        invalidate();
    }

    public void setTextThumbInset(int i) {
        this.f4215V = i;
        this.f4224e0 = false;
        requestLayout();
        invalidate();
    }

    public void setThumbColor(ColorStateList colorStateList) {
        this.f4221d = colorStateList;
        if (colorStateList != null) {
            setThumbDrawable(null);
        }
        invalidate();
    }

    public void setThumbColorRes(int i) {
        setThumbColor(ContextCompat.getColorStateList(getContext(), i));
    }

    public void setThumbDrawable(Drawable drawable) {
        this.f4217a = drawable;
        this.f4196C = drawable != null;
        refreshDrawableState();
        this.f4224e0 = false;
        requestLayout();
        invalidate();
    }

    public void setThumbDrawableRes(int i) {
        setThumbDrawable(ContextCompat.getDrawable(getContext(), i));
    }

    public void setThumbMargin(RectF rectF) {
        if (rectF == null) {
            this.f4227g.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f4224e0 = false;
            requestLayout();
            return;
        }
        this.f4227g.set(rectF.left, rectF.top, rectF.right, rectF.bottom);
        this.f4224e0 = false;
        requestLayout();
    }

    public void setThumbRadius(float f) {
        this.f4223e = f;
        if (this.f4196C) {
            return;
        }
        invalidate();
    }

    public void setThumbRangeRatio(float f) {
        this.f4229h = f;
        this.f4224e0 = false;
        requestLayout();
    }

    public void setTintColor(int i) {
        this.f4232k = i;
        this.f4221d = AbstractC6675d.m6348j(i);
        this.f4219c = AbstractC6675d.m6347i(this.f4232k);
        this.f4197D = false;
        this.f4196C = false;
        refreshDrawableState();
        invalidate();
    }

    public SwitchButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4198E = false;
        this.f4222d0 = false;
        this.f4224e0 = false;
        this.f4226f0 = false;
        m3475b(attributeSet);
    }

    public SwitchButton(Context context) {
        super(context);
        this.f4198E = false;
        this.f4222d0 = false;
        this.f4224e0 = false;
        this.f4226f0 = false;
        m3475b(null);
    }
}
