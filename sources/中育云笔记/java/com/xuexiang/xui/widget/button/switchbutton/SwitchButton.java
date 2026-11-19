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
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.CompoundButton;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC8040f;

/* loaded from: classes5.dex */
public class SwitchButton extends CompoundButton {

    /* renamed from: l0 */
    public static int[] f15761l0 = {R.attr.state_checked, R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: m0 */
    public static int[] f15762m0 = {-16842912, R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: A */
    public RectF f15763A;

    /* renamed from: B */
    public RectF f15764B;

    /* renamed from: C */
    public RectF f15765C;

    /* renamed from: D */
    public Paint f15766D;

    /* renamed from: E */
    public boolean f15767E;

    /* renamed from: F */
    public boolean f15768F;

    /* renamed from: G */
    public boolean f15769G;

    /* renamed from: H */
    public ObjectAnimator f15770H;

    /* renamed from: I */
    public float f15771I;

    /* renamed from: J */
    public RectF f15772J;

    /* renamed from: K */
    public float f15773K;

    /* renamed from: L */
    public float f15774L;

    /* renamed from: M */
    public float f15775M;

    /* renamed from: N */
    public int f15776N;

    /* renamed from: O */
    public int f15777O;

    /* renamed from: P */
    public Paint f15778P;

    /* renamed from: Q */
    public CharSequence f15779Q;

    /* renamed from: R */
    public CharSequence f15780R;

    /* renamed from: S */
    public TextPaint f15781S;

    /* renamed from: T */
    public Layout f15782T;

    /* renamed from: U */
    public Layout f15783U;

    /* renamed from: V */
    public float f15784V;

    /* renamed from: W */
    public float f15785W;

    /* renamed from: c */
    public Drawable f15786c;

    /* renamed from: d */
    public Drawable f15787d;

    /* renamed from: e */
    public ColorStateList f15788e;

    /* renamed from: e0 */
    public int f15789e0;

    /* renamed from: f */
    public ColorStateList f15790f;

    /* renamed from: f0 */
    public int f15791f0;

    /* renamed from: g */
    public float f15792g;

    /* renamed from: g0 */
    public int f15793g0;

    /* renamed from: h */
    public float f15794h;

    /* renamed from: h0 */
    public boolean f15795h0;

    /* renamed from: i */
    public RectF f15796i;

    /* renamed from: i0 */
    public boolean f15797i0;

    /* renamed from: j */
    public float f15798j;

    /* renamed from: j0 */
    public boolean f15799j0;

    /* renamed from: k */
    public long f15800k;

    /* renamed from: k0 */
    public CompoundButton.OnCheckedChangeListener f15801k0;

    /* renamed from: l */
    public boolean f15802l;

    /* renamed from: m */
    public int f15803m;

    /* renamed from: n */
    public int f15804n;

    /* renamed from: o */
    public int f15805o;

    /* renamed from: p */
    public int f15806p;

    /* renamed from: q */
    public int f15807q;

    /* renamed from: r */
    public int f15808r;

    /* renamed from: s */
    public int f15809s;

    /* renamed from: t */
    public int f15810t;

    /* renamed from: u */
    public int f15811u;

    /* renamed from: v */
    public int f15812v;

    /* renamed from: w */
    public Drawable f15813w;

    /* renamed from: x */
    public Drawable f15814x;

    /* renamed from: y */
    public RectF f15815y;

    /* renamed from: z */
    public RectF f15816z;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C8092a();

        /* renamed from: c */
        public CharSequence f15817c;

        /* renamed from: d */
        public CharSequence f15818d;

        /* renamed from: com.xuexiang.xui.widget.button.switchbutton.SwitchButton$SavedState$a */
        public static class C8092a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            TextUtils.writeToParcel(this.f15817c, parcel, i10);
            TextUtils.writeToParcel(this.f15818d, parcel, i10);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            this.f15817c = (CharSequence) creator.createFromParcel(parcel);
            this.f15818d = (CharSequence) creator.createFromParcel(parcel);
        }
    }

    public SwitchButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f15769G = false;
        this.f15795h0 = false;
        this.f15797i0 = false;
        this.f15799j0 = false;
        m12523d(attributeSet);
    }

    private float getProgress() {
        return this.f15771I;
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
            r2.f15771I = r3
            r2.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.button.switchbutton.SwitchButton.setProgress(float):void");
    }

    /* renamed from: a */
    public void m12520a(boolean z10) {
        ObjectAnimator objectAnimator = this.f15770H;
        if (objectAnimator == null) {
            return;
        }
        if (objectAnimator.isRunning()) {
            this.f15770H.cancel();
        }
        this.f15770H.setDuration(this.f15800k);
        if (z10) {
            this.f15770H.setFloatValues(this.f15771I, 1.0f);
        } else {
            this.f15770H.setFloatValues(this.f15771I, 0.0f);
        }
        this.f15770H.start();
    }

    /* renamed from: b */
    public final void m12521b() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        this.f15799j0 = true;
    }

    /* renamed from: c */
    public final int m12522c(double d10) {
        return (int) Math.ceil(d10);
    }

    /* renamed from: d */
    public final void m12523d(AttributeSet attributeSet) {
        float f10;
        int i10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        String str;
        String str2;
        int i11;
        int i12;
        int i13;
        int i14;
        Drawable drawable;
        ColorStateList colorStateList;
        Drawable drawable2;
        ColorStateList colorStateList2;
        boolean z10;
        float f20;
        ColorStateList colorStateList3;
        TypedArray typedArrayObtainStyledAttributes;
        boolean z11;
        this.f15776N = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f15777O = ViewConfiguration.getPressedStateDuration() + ViewConfiguration.getTapTimeout();
        this.f15766D = new Paint(1);
        Paint paint = new Paint(1);
        this.f15778P = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f15778P.setStrokeWidth(getResources().getDisplayMetrics().density);
        this.f15781S = getPaint();
        this.f15815y = new RectF();
        this.f15816z = new RectF();
        this.f15763A = new RectF();
        this.f15796i = new RectF();
        this.f15764B = new RectF();
        this.f15765C = new RectF();
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "progress", 0.0f, 0.0f).setDuration(250L);
        this.f15770H = duration;
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f15772J = new RectF();
        float f21 = getResources().getDisplayMetrics().density * 2.0f;
        TypedArray typedArrayObtainStyledAttributes2 = attributeSet == null ? null : getContext().obtainStyledAttributes(attributeSet, R$styleable.SwitchButton);
        if (typedArrayObtainStyledAttributes2 != null) {
            Drawable drawableM12206g = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes2, R$styleable.SwitchButton_swb_thumbDrawable);
            colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(R$styleable.SwitchButton_swb_thumbColor);
            float dimension = typedArrayObtainStyledAttributes2.getDimension(R$styleable.SwitchButton_swb_thumbMargin, f21);
            float dimension2 = typedArrayObtainStyledAttributes2.getDimension(R$styleable.SwitchButton_swb_thumbMarginLeft, dimension);
            float dimension3 = typedArrayObtainStyledAttributes2.getDimension(R$styleable.SwitchButton_swb_thumbMarginRight, dimension);
            float dimension4 = typedArrayObtainStyledAttributes2.getDimension(R$styleable.SwitchButton_swb_thumbMarginTop, dimension);
            float dimension5 = typedArrayObtainStyledAttributes2.getDimension(R$styleable.SwitchButton_swb_thumbMarginBottom, dimension);
            float dimension6 = typedArrayObtainStyledAttributes2.getDimension(R$styleable.SwitchButton_swb_thumbWidth, 0.0f);
            float dimension7 = typedArrayObtainStyledAttributes2.getDimension(R$styleable.SwitchButton_swb_thumbHeight, 0.0f);
            f10 = 0.0f;
            float dimension8 = typedArrayObtainStyledAttributes2.getDimension(R$styleable.SwitchButton_swb_thumbRadius, -1.0f);
            float dimension9 = typedArrayObtainStyledAttributes2.getDimension(R$styleable.SwitchButton_swb_backRadius, -1.0f);
            Drawable drawableM12206g2 = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes2, R$styleable.SwitchButton_swb_backDrawable);
            ColorStateList colorStateList4 = typedArrayObtainStyledAttributes2.getColorStateList(R$styleable.SwitchButton_swb_backColor);
            float f22 = typedArrayObtainStyledAttributes2.getFloat(R$styleable.SwitchButton_swb_thumbRangeRatio, 1.8f);
            int integer = typedArrayObtainStyledAttributes2.getInteger(R$styleable.SwitchButton_swb_animationDuration, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
            boolean z12 = typedArrayObtainStyledAttributes2.getBoolean(R$styleable.SwitchButton_swb_fadeBack, true);
            int color = typedArrayObtainStyledAttributes2.getColor(R$styleable.SwitchButton_swb_tintColor, 0);
            String string = typedArrayObtainStyledAttributes2.getString(R$styleable.SwitchButton_swb_textOn);
            String string2 = typedArrayObtainStyledAttributes2.getString(R$styleable.SwitchButton_swb_textOff);
            int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.SwitchButton_swb_textThumbInset, 0);
            int dimensionPixelSize2 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.SwitchButton_swb_textExtra, 0);
            int dimensionPixelSize3 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.SwitchButton_swb_textAdjust, 0);
            typedArrayObtainStyledAttributes2.recycle();
            f18 = dimension3;
            f19 = dimension4;
            f14 = dimension5;
            str2 = string;
            colorStateList2 = colorStateList4;
            f17 = dimension2;
            i10 = integer;
            z10 = z12;
            i14 = color;
            f12 = dimension8;
            f13 = f22;
            drawable2 = drawableM12206g;
            i11 = dimensionPixelSize;
            i13 = dimensionPixelSize3;
            f16 = dimension6;
            f15 = dimension7;
            drawable = drawableM12206g2;
            str = string2;
            f11 = dimension9;
            i12 = dimensionPixelSize2;
        } else {
            f10 = 0.0f;
            i10 = 250;
            f11 = -1.0f;
            f12 = -1.0f;
            f13 = 1.8f;
            f14 = 0.0f;
            f15 = 0.0f;
            f16 = 0.0f;
            f17 = 0.0f;
            f18 = 0.0f;
            f19 = 0.0f;
            str = null;
            str2 = null;
            i11 = 0;
            i12 = 0;
            i13 = 0;
            i14 = 0;
            drawable = null;
            colorStateList = null;
            drawable2 = null;
            colorStateList2 = null;
            z10 = true;
        }
        float f23 = f14;
        if (attributeSet == null) {
            f20 = f17;
            colorStateList3 = colorStateList2;
            typedArrayObtainStyledAttributes = null;
        } else {
            f20 = f17;
            colorStateList3 = colorStateList2;
            typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.focusable, R.attr.clickable});
        }
        if (typedArrayObtainStyledAttributes != null) {
            boolean z13 = typedArrayObtainStyledAttributes.getBoolean(0, true);
            boolean z14 = typedArrayObtainStyledAttributes.getBoolean(1, z13);
            setFocusable(z13);
            setClickable(z14);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            setFocusable(true);
            setClickable(true);
        }
        this.f15779Q = str2;
        this.f15780R = str;
        this.f15789e0 = i11;
        this.f15791f0 = i12;
        this.f15793g0 = i13;
        this.f15786c = drawable2;
        this.f15790f = colorStateList;
        this.f15767E = drawable2 != null;
        this.f15803m = i14;
        if (i14 == 0) {
            TypedValue typedValue = new TypedValue();
            z11 = true;
            if (getContext().getTheme().resolveAttribute(R$attr.colorAccent, typedValue, true)) {
                this.f15803m = typedValue.data;
            } else {
                this.f15803m = 3309506;
            }
        } else {
            z11 = true;
        }
        if (!this.f15767E && this.f15790f == null) {
            ColorStateList colorStateListM12533b = AbstractC8094a.m12533b(this.f15803m);
            this.f15790f = colorStateListM12533b;
            this.f15808r = colorStateListM12533b.getDefaultColor();
        }
        this.f15804n = m12522c(f16);
        this.f15805o = m12522c(f15);
        this.f15787d = drawable;
        ColorStateList colorStateList5 = colorStateList3;
        this.f15788e = colorStateList5;
        boolean z15 = drawable != null ? z11 : false;
        this.f15768F = z15;
        if (!z15 && colorStateList5 == null) {
            ColorStateList colorStateListM12532a = AbstractC8094a.m12532a(this.f15803m);
            this.f15788e = colorStateListM12532a;
            int defaultColor = colorStateListM12532a.getDefaultColor();
            this.f15809s = defaultColor;
            this.f15810t = this.f15788e.getColorForState(f15761l0, defaultColor);
        }
        this.f15796i.set(f20, f19, f18, f23);
        float f24 = f13;
        this.f15798j = this.f15796i.width() >= f10 ? Math.max(f24, 1.0f) : f24;
        this.f15792g = f12;
        this.f15794h = f11;
        long j10 = i10;
        this.f15800k = j10;
        this.f15802l = z10;
        this.f15770H.setDuration(j10);
        if (isChecked()) {
            setProgress(1.0f);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        super.drawableStateChanged();
        if (this.f15767E || (colorStateList2 = this.f15790f) == null) {
            setDrawableState(this.f15786c);
        } else {
            this.f15808r = colorStateList2.getColorForState(getDrawableState(), this.f15808r);
        }
        int[] iArr = isChecked() ? f15762m0 : f15761l0;
        ColorStateList textColors = getTextColors();
        if (textColors != null) {
            int defaultColor = textColors.getDefaultColor();
            this.f15811u = textColors.getColorForState(f15761l0, defaultColor);
            this.f15812v = textColors.getColorForState(f15762m0, defaultColor);
        }
        if (!this.f15768F && (colorStateList = this.f15788e) != null) {
            int colorForState = colorStateList.getColorForState(getDrawableState(), this.f15809s);
            this.f15809s = colorForState;
            this.f15810t = this.f15788e.getColorForState(iArr, colorForState);
            return;
        }
        Drawable drawable = this.f15787d;
        if ((drawable instanceof StateListDrawable) && this.f15802l) {
            drawable.setState(iArr);
            this.f15814x = this.f15787d.getCurrent().mutate();
        } else {
            this.f15814x = null;
        }
        setDrawableState(this.f15787d);
        Drawable drawable2 = this.f15787d;
        if (drawable2 != null) {
            this.f15813w = drawable2.getCurrent().mutate();
        }
    }

    /* renamed from: e */
    public final Layout m12524e(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.f15781S, (int) Math.ceil(Layout.getDesiredWidth(charSequence, r2)), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
    }

    /* renamed from: f */
    public final int m12525f(int i10) {
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        if (this.f15805o == 0 && this.f15767E) {
            this.f15805o = this.f15786c.getIntrinsicHeight();
        }
        if (mode != 1073741824) {
            if (this.f15805o == 0) {
                this.f15805o = m12522c(getResources().getDisplayMetrics().density * 20.0f);
            }
            float f10 = this.f15805o;
            RectF rectF = this.f15796i;
            int iM12522c = m12522c(f10 + rectF.top + rectF.bottom);
            this.f15807q = iM12522c;
            if (iM12522c < 0) {
                this.f15807q = 0;
                this.f15805o = 0;
                return size;
            }
            int iM12522c2 = m12522c(this.f15785W - iM12522c);
            if (iM12522c2 > 0) {
                this.f15807q += iM12522c2;
                this.f15805o += iM12522c2;
            }
            int iMax = Math.max(this.f15805o, this.f15807q);
            return Math.max(Math.max(iMax, getPaddingTop() + iMax + getPaddingBottom()), getSuggestedMinimumHeight());
        }
        if (this.f15805o != 0) {
            RectF rectF2 = this.f15796i;
            this.f15807q = m12522c(r6 + rectF2.top + rectF2.bottom);
            this.f15807q = m12522c(Math.max(r6, this.f15785W));
            if ((((r6 + getPaddingTop()) + getPaddingBottom()) - Math.min(0.0f, this.f15796i.top)) - Math.min(0.0f, this.f15796i.bottom) > size) {
                this.f15805o = 0;
            }
        }
        if (this.f15805o == 0) {
            int iM12522c3 = m12522c(((size - getPaddingTop()) - getPaddingBottom()) + Math.min(0.0f, this.f15796i.top) + Math.min(0.0f, this.f15796i.bottom));
            this.f15807q = iM12522c3;
            if (iM12522c3 < 0) {
                this.f15807q = 0;
                this.f15805o = 0;
                return size;
            }
            RectF rectF3 = this.f15796i;
            this.f15805o = m12522c((iM12522c3 - rectF3.top) - rectF3.bottom);
        }
        if (this.f15805o < 0) {
            this.f15807q = 0;
            this.f15805o = 0;
        }
        return size;
    }

    /* renamed from: g */
    public final int m12526g(int i10) {
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        if (this.f15804n == 0 && this.f15767E) {
            this.f15804n = this.f15786c.getIntrinsicWidth();
        }
        int iM12522c = m12522c(this.f15784V);
        if (this.f15798j == 0.0f) {
            this.f15798j = 1.8f;
        }
        if (mode != 1073741824) {
            if (this.f15804n == 0) {
                this.f15804n = m12522c(getResources().getDisplayMetrics().density * 20.0f);
            }
            if (this.f15798j == 0.0f) {
                this.f15798j = 1.8f;
            }
            int iM12522c2 = m12522c(this.f15804n * this.f15798j);
            float f10 = iM12522c + this.f15791f0;
            float f11 = iM12522c2 - this.f15804n;
            RectF rectF = this.f15796i;
            int iM12522c3 = m12522c(f10 - ((f11 + Math.max(rectF.left, rectF.right)) + this.f15789e0));
            float f12 = iM12522c2;
            RectF rectF2 = this.f15796i;
            int iM12522c4 = m12522c(rectF2.left + f12 + rectF2.right + Math.max(0, iM12522c3));
            this.f15806p = iM12522c4;
            if (iM12522c4 >= 0) {
                int iM12522c5 = m12522c(f12 + Math.max(0.0f, this.f15796i.left) + Math.max(0.0f, this.f15796i.right) + Math.max(0, iM12522c3));
                return Math.max(iM12522c5, getPaddingLeft() + iM12522c5 + getPaddingRight());
            }
            this.f15804n = 0;
            this.f15806p = 0;
            return size;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        if (this.f15804n != 0) {
            int iM12522c6 = m12522c(r2 * this.f15798j);
            int i11 = this.f15791f0 + iM12522c;
            int i12 = iM12522c6 - this.f15804n;
            RectF rectF3 = this.f15796i;
            int iM12522c7 = i11 - (i12 + m12522c(Math.max(rectF3.left, rectF3.right)));
            float f13 = iM12522c6;
            RectF rectF4 = this.f15796i;
            int iM12522c8 = m12522c(rectF4.left + f13 + rectF4.right + Math.max(iM12522c7, 0));
            this.f15806p = iM12522c8;
            if (iM12522c8 < 0) {
                this.f15804n = 0;
            }
            if (f13 + Math.max(this.f15796i.left, 0.0f) + Math.max(this.f15796i.right, 0.0f) + Math.max(iM12522c7, 0) > paddingLeft) {
                this.f15804n = 0;
            }
        }
        if (this.f15804n == 0) {
            int iM12522c9 = m12522c((((size - getPaddingLeft()) - getPaddingRight()) - Math.max(this.f15796i.left, 0.0f)) - Math.max(this.f15796i.right, 0.0f));
            if (iM12522c9 < 0) {
                this.f15804n = 0;
                this.f15806p = 0;
                return size;
            }
            float f14 = iM12522c9;
            this.f15804n = m12522c(f14 / this.f15798j);
            RectF rectF5 = this.f15796i;
            int iM12522c10 = m12522c(f14 + rectF5.left + rectF5.right);
            this.f15806p = iM12522c10;
            if (iM12522c10 < 0) {
                this.f15804n = 0;
                this.f15806p = 0;
                return size;
            }
            int i13 = iM12522c + this.f15791f0;
            int i14 = iM12522c9 - this.f15804n;
            RectF rectF6 = this.f15796i;
            int iM12522c11 = i13 - (i14 + m12522c(Math.max(rectF6.left, rectF6.right)));
            if (iM12522c11 > 0) {
                this.f15804n -= iM12522c11;
            }
            if (this.f15804n < 0) {
                this.f15804n = 0;
                this.f15806p = 0;
            }
        }
        return size;
    }

    public long getAnimationDuration() {
        return this.f15800k;
    }

    public ColorStateList getBackColor() {
        return this.f15788e;
    }

    public Drawable getBackDrawable() {
        return this.f15787d;
    }

    public float getBackRadius() {
        return this.f15794h;
    }

    public PointF getBackSizeF() {
        return new PointF(this.f15816z.width(), this.f15816z.height());
    }

    public CharSequence getTextOff() {
        return this.f15780R;
    }

    public CharSequence getTextOn() {
        return this.f15779Q;
    }

    public ColorStateList getThumbColor() {
        return this.f15790f;
    }

    public Drawable getThumbDrawable() {
        return this.f15786c;
    }

    public float getThumbHeight() {
        return this.f15805o;
    }

    public RectF getThumbMargin() {
        return this.f15796i;
    }

    public float getThumbRadius() {
        return this.f15792g;
    }

    public float getThumbRangeRatio() {
        return this.f15798j;
    }

    public float getThumbWidth() {
        return this.f15804n;
    }

    public int getTintColor() {
        return this.f15803m;
    }

    /* renamed from: h */
    public void m12527h(CharSequence charSequence, CharSequence charSequence2) {
        this.f15779Q = charSequence;
        this.f15780R = charSequence2;
        this.f15782T = null;
        this.f15783U = null;
        this.f15797i0 = false;
        requestLayout();
        invalidate();
    }

    /* renamed from: i */
    public void m12528i(float f10, float f11, float f12, float f13) {
        this.f15796i.set(f10, f11, f12, f13);
        this.f15797i0 = false;
        requestLayout();
    }

    /* renamed from: j */
    public final void m12529j() {
        int i10;
        if (this.f15804n == 0 || (i10 = this.f15805o) == 0 || this.f15806p == 0 || this.f15807q == 0) {
            return;
        }
        if (this.f15792g == -1.0f) {
            this.f15792g = Math.min(r0, i10) / 2.0f;
        }
        if (this.f15794h == -1.0f) {
            this.f15794h = Math.min(this.f15806p, this.f15807q) / 2.0f;
        }
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int iM12522c = m12522c((this.f15806p - Math.min(0.0f, this.f15796i.left)) - Math.min(0.0f, this.f15796i.right));
        float paddingTop = measuredHeight <= m12522c((this.f15807q - Math.min(0.0f, this.f15796i.top)) - Math.min(0.0f, this.f15796i.bottom)) ? getPaddingTop() + Math.max(0.0f, this.f15796i.top) : (((measuredHeight - r3) + 1) / 2.0f) + getPaddingTop() + Math.max(0.0f, this.f15796i.top);
        float paddingLeft = measuredWidth <= this.f15806p ? getPaddingLeft() + Math.max(0.0f, this.f15796i.left) : (((measuredWidth - iM12522c) + 1) / 2.0f) + getPaddingLeft() + Math.max(0.0f, this.f15796i.left);
        this.f15815y.set(paddingLeft, paddingTop, this.f15804n + paddingLeft, this.f15805o + paddingTop);
        RectF rectF = this.f15815y;
        float f10 = rectF.left;
        RectF rectF2 = this.f15796i;
        float f11 = f10 - rectF2.left;
        RectF rectF3 = this.f15816z;
        float f12 = rectF.top;
        float f13 = rectF2.top;
        rectF3.set(f11, f12 - f13, this.f15806p + f11, (f12 - f13) + this.f15807q);
        RectF rectF4 = this.f15763A;
        RectF rectF5 = this.f15815y;
        rectF4.set(rectF5.left, 0.0f, (this.f15816z.right - this.f15796i.right) - rectF5.width(), 0.0f);
        this.f15794h = Math.min(Math.min(this.f15816z.width(), this.f15816z.height()) / 2.0f, this.f15794h);
        Drawable drawable = this.f15787d;
        if (drawable != null) {
            RectF rectF6 = this.f15816z;
            drawable.setBounds((int) rectF6.left, (int) rectF6.top, m12522c(rectF6.right), m12522c(this.f15816z.bottom));
        }
        if (this.f15782T != null) {
            RectF rectF7 = this.f15816z;
            float fWidth = (rectF7.left + (((((rectF7.width() + this.f15789e0) - this.f15804n) - this.f15796i.right) - this.f15782T.getWidth()) / 2.0f)) - this.f15793g0;
            RectF rectF8 = this.f15816z;
            float fHeight = rectF8.top + ((rectF8.height() - this.f15782T.getHeight()) / 2.0f);
            this.f15764B.set(fWidth, fHeight, this.f15782T.getWidth() + fWidth, this.f15782T.getHeight() + fHeight);
        }
        if (this.f15783U != null) {
            RectF rectF9 = this.f15816z;
            float fWidth2 = ((rectF9.right - (((((rectF9.width() + this.f15789e0) - this.f15804n) - this.f15796i.left) - this.f15783U.getWidth()) / 2.0f)) - this.f15783U.getWidth()) + this.f15793g0;
            RectF rectF10 = this.f15816z;
            float fHeight2 = rectF10.top + ((rectF10.height() - this.f15783U.getHeight()) / 2.0f);
            this.f15765C.set(fWidth2, fHeight2, this.f15783U.getWidth() + fWidth2, this.f15783U.getHeight() + fHeight2);
        }
        this.f15797i0 = true;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f15797i0) {
            m12529j();
        }
        if (this.f15797i0) {
            if (this.f15768F) {
                if (!this.f15802l || this.f15813w == null || this.f15814x == null) {
                    this.f15787d.setAlpha(255);
                    this.f15787d.draw(canvas);
                } else {
                    Drawable drawable = isChecked() ? this.f15813w : this.f15814x;
                    Drawable drawable2 = isChecked() ? this.f15814x : this.f15813w;
                    int progress = (int) (getProgress() * 255.0f);
                    drawable.setAlpha(progress);
                    drawable.draw(canvas);
                    drawable2.setAlpha(255 - progress);
                    drawable2.draw(canvas);
                }
            } else if (this.f15802l) {
                int i10 = isChecked() ? this.f15809s : this.f15810t;
                int i11 = isChecked() ? this.f15810t : this.f15809s;
                int progress2 = (int) (getProgress() * 255.0f);
                this.f15766D.setARGB((Color.alpha(i10) * progress2) / 255, Color.red(i10), Color.green(i10), Color.blue(i10));
                RectF rectF = this.f15816z;
                float f10 = this.f15794h;
                canvas.drawRoundRect(rectF, f10, f10, this.f15766D);
                this.f15766D.setARGB((Color.alpha(i11) * (255 - progress2)) / 255, Color.red(i11), Color.green(i11), Color.blue(i11));
                RectF rectF2 = this.f15816z;
                float f11 = this.f15794h;
                canvas.drawRoundRect(rectF2, f11, f11, this.f15766D);
                this.f15766D.setAlpha(255);
            } else {
                this.f15766D.setColor(this.f15809s);
                RectF rectF3 = this.f15816z;
                float f12 = this.f15794h;
                canvas.drawRoundRect(rectF3, f12, f12, this.f15766D);
            }
            Layout layout = ((double) getProgress()) > 0.5d ? this.f15782T : this.f15783U;
            RectF rectF4 = ((double) getProgress()) > 0.5d ? this.f15764B : this.f15765C;
            if (layout != null && rectF4 != null) {
                int progress3 = (int) ((((double) getProgress()) >= 0.75d ? (getProgress() * 4.0f) - 3.0f : ((double) getProgress()) < 0.25d ? 1.0f - (getProgress() * 4.0f) : 0.0f) * 255.0f);
                int i12 = ((double) getProgress()) > 0.5d ? this.f15811u : this.f15812v;
                layout.getPaint().setARGB((Color.alpha(i12) * progress3) / 255, Color.red(i12), Color.green(i12), Color.blue(i12));
                canvas.save();
                canvas.translate(rectF4.left, rectF4.top);
                layout.draw(canvas);
                canvas.restore();
            }
            this.f15772J.set(this.f15815y);
            this.f15772J.offset(this.f15771I * this.f15763A.width(), 0.0f);
            if (this.f15767E) {
                Drawable drawable3 = this.f15786c;
                RectF rectF5 = this.f15772J;
                drawable3.setBounds((int) rectF5.left, (int) rectF5.top, m12522c(rectF5.right), m12522c(this.f15772J.bottom));
                this.f15786c.draw(canvas);
            } else {
                this.f15766D.setColor(this.f15808r);
                RectF rectF6 = this.f15772J;
                float f13 = this.f15792g;
                canvas.drawRoundRect(rectF6, f13, f13, this.f15766D);
            }
            if (this.f15769G) {
                this.f15778P.setColor(Color.parseColor("#AA0000"));
                canvas.drawRect(this.f15816z, this.f15778P);
                this.f15778P.setColor(Color.parseColor("#0000FF"));
                canvas.drawRect(this.f15772J, this.f15778P);
                this.f15778P.setColor(Color.parseColor("#000000"));
                RectF rectF7 = this.f15763A;
                float f14 = rectF7.left;
                float f15 = this.f15815y.top;
                canvas.drawLine(f14, f15, rectF7.right, f15, this.f15778P);
                this.f15778P.setColor(Color.parseColor("#00CC00"));
                canvas.drawRect(((double) getProgress()) > 0.5d ? this.f15764B : this.f15765C, this.f15778P);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f15782T == null && !TextUtils.isEmpty(this.f15779Q)) {
            this.f15782T = m12524e(this.f15779Q);
        }
        if (this.f15783U == null && !TextUtils.isEmpty(this.f15780R)) {
            this.f15783U = m12524e(this.f15780R);
        }
        float width = this.f15782T != null ? r0.getWidth() : 0.0f;
        float width2 = this.f15783U != null ? r2.getWidth() : 0.0f;
        if (width == 0.0f && width2 == 0.0f) {
            this.f15784V = 0.0f;
        } else {
            this.f15784V = Math.max(width, width2);
        }
        float height = this.f15782T != null ? r0.getHeight() : 0.0f;
        float height2 = this.f15783U != null ? r2.getHeight() : 0.0f;
        if (height == 0.0f && height2 == 0.0f) {
            this.f15785W = 0.0f;
        } else {
            this.f15785W = Math.max(height, height2);
        }
        setMeasuredDimension(m12526g(i10), m12525f(i11));
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        m12527h(savedState.f15817c, savedState.f15818d);
        this.f15795h0 = true;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f15795h0 = false;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f15817c = this.f15779Q;
        savedState.f15818d = this.f15780R;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        m12529j();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.button.switchbutton.SwitchButton.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.CompoundButton, android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    public void setAnimationDuration(long j10) {
        this.f15800k = j10;
    }

    public void setBackColor(ColorStateList colorStateList) {
        this.f15788e = colorStateList;
        if (colorStateList != null) {
            setBackDrawable(null);
        }
        invalidate();
    }

    public void setBackColorRes(int i10) {
        setBackColor(ContextCompat.getColorStateList(getContext(), i10));
    }

    public void setBackDrawable(Drawable drawable) {
        this.f15787d = drawable;
        this.f15768F = drawable != null;
        refreshDrawableState();
        this.f15797i0 = false;
        requestLayout();
        invalidate();
    }

    public void setBackDrawableRes(int i10) {
        setBackDrawable(ContextCompat.getDrawable(getContext(), i10));
    }

    public void setBackRadius(float f10) {
        this.f15794h = f10;
        if (this.f15768F) {
            return;
        }
        invalidate();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        if (isChecked() != z10) {
            m12520a(z10);
        }
        if (this.f15795h0) {
            setCheckedImmediatelyNoEvent(z10);
        } else {
            super.setChecked(z10);
        }
    }

    public void setCheckedImmediately(boolean z10) {
        super.setChecked(z10);
        ObjectAnimator objectAnimator = this.f15770H;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.f15770H.cancel();
        }
        setProgress(z10 ? 1.0f : 0.0f);
        invalidate();
    }

    public void setCheckedImmediatelyNoEvent(boolean z10) {
        if (this.f15801k0 == null) {
            setCheckedImmediately(z10);
            return;
        }
        super.setOnCheckedChangeListener(null);
        setCheckedImmediately(z10);
        super.setOnCheckedChangeListener(this.f15801k0);
    }

    public void setCheckedNoEvent(boolean z10) {
        if (this.f15801k0 == null) {
            setChecked(z10);
            return;
        }
        super.setOnCheckedChangeListener(null);
        setChecked(z10);
        super.setOnCheckedChangeListener(this.f15801k0);
    }

    public void setDrawDebugRect(boolean z10) {
        this.f15769G = z10;
        invalidate();
    }

    public void setFadeBack(boolean z10) {
        this.f15802l = z10;
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        super.setOnCheckedChangeListener(onCheckedChangeListener);
        this.f15801k0 = onCheckedChangeListener;
    }

    public void setTextAdjust(int i10) {
        this.f15793g0 = i10;
        this.f15797i0 = false;
        requestLayout();
        invalidate();
    }

    public void setTextExtra(int i10) {
        this.f15791f0 = i10;
        this.f15797i0 = false;
        requestLayout();
        invalidate();
    }

    public void setTextThumbInset(int i10) {
        this.f15789e0 = i10;
        this.f15797i0 = false;
        requestLayout();
        invalidate();
    }

    public void setThumbColor(ColorStateList colorStateList) {
        this.f15790f = colorStateList;
        if (colorStateList != null) {
            setThumbDrawable(null);
        }
        invalidate();
    }

    public void setThumbColorRes(int i10) {
        setThumbColor(ContextCompat.getColorStateList(getContext(), i10));
    }

    public void setThumbDrawable(Drawable drawable) {
        this.f15786c = drawable;
        this.f15767E = drawable != null;
        refreshDrawableState();
        this.f15797i0 = false;
        requestLayout();
        invalidate();
    }

    public void setThumbDrawableRes(int i10) {
        setThumbDrawable(ContextCompat.getDrawable(getContext(), i10));
    }

    public void setThumbMargin(RectF rectF) {
        if (rectF == null) {
            m12528i(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            m12528i(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    public void setThumbRadius(float f10) {
        this.f15792g = f10;
        if (this.f15767E) {
            return;
        }
        invalidate();
    }

    public void setThumbRangeRatio(float f10) {
        this.f15798j = f10;
        this.f15797i0 = false;
        requestLayout();
    }

    public void setTintColor(int i10) {
        this.f15803m = i10;
        this.f15790f = AbstractC8094a.m12533b(i10);
        this.f15788e = AbstractC8094a.m12532a(this.f15803m);
        this.f15768F = false;
        this.f15767E = false;
        refreshDrawableState();
        invalidate();
    }

    public SwitchButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15769G = false;
        this.f15795h0 = false;
        this.f15797i0 = false;
        this.f15799j0 = false;
        m12523d(attributeSet);
    }

    public SwitchButton(Context context) {
        super(context);
        this.f15769G = false;
        this.f15795h0 = false;
        this.f15797i0 = false;
        this.f15799j0 = false;
        m12523d(null);
    }
}
