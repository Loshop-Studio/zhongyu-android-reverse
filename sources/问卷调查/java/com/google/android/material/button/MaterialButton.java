package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p000a.p005b.p007d.p008a.C0034a;
import p000a.p005b.p014h.C0079f;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p000a.p049j.p050a.AbstractC0287a;
import p070b.p074b.p075a.p076a.C0562a;
import p070b.p074b.p075a.p076a.C0564b;
import p070b.p074b.p075a.p076a.p077a0.p078a.C0563a;
import p070b.p074b.p075a.p076a.p085h.C0597a;
import p070b.p074b.p075a.p076a.p096r.C0655j;
import p070b.p074b.p075a.p076a.p099u.C0666a;
import p070b.p074b.p075a.p076a.p101w.C0675g;
import p070b.p074b.p075a.p076a.p101w.C0678j;
import p070b.p074b.p075a.p076a.p101w.InterfaceC0682n;

/* loaded from: classes.dex */
public class MaterialButton extends C0079f implements Checkable, InterfaceC0682n {

    /* renamed from: p */
    public static final int[] f4887p = {R.attr.state_checkable};

    /* renamed from: q */
    public static final int[] f4888q = {R.attr.state_checked};

    /* renamed from: d */
    public final C0597a f4889d;

    /* renamed from: e */
    public final LinkedHashSet<InterfaceC0924a> f4890e;

    /* renamed from: f */
    public InterfaceC0925b f4891f;

    /* renamed from: g */
    public PorterDuff.Mode f4892g;

    /* renamed from: h */
    public ColorStateList f4893h;

    /* renamed from: i */
    public Drawable f4894i;

    /* renamed from: j */
    public int f4895j;

    /* renamed from: k */
    public int f4896k;

    /* renamed from: l */
    public int f4897l;

    /* renamed from: m */
    public boolean f4898m;

    /* renamed from: n */
    public boolean f4899n;

    /* renamed from: o */
    public int f4900o;

    /* renamed from: com.google.android.material.button.MaterialButton$a */
    public interface InterfaceC0924a {
        /* renamed from: a */
        void m2645a(MaterialButton materialButton, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButton$b */
    public interface InterfaceC0925b {
        /* renamed from: a */
        void m2646a(MaterialButton materialButton, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButton$c */
    public static class C0926c extends AbstractC0287a {
        public static final Parcelable.Creator<C0926c> CREATOR = new a();

        /* renamed from: d */
        public boolean f4901d;

        /* renamed from: com.google.android.material.button.MaterialButton$c$a */
        public static class a implements Parcelable.ClassLoaderCreator<C0926c> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new C0926c(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new C0926c[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public C0926c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0926c(parcel, classLoader);
            }
        }

        public C0926c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                C0926c.class.getClassLoader();
            }
            this.f4901d = parcel.readInt() == 1;
        }

        public C0926c(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p000a.p049j.p050a.AbstractC0287a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f1718b, i);
            parcel.writeInt(this.f4901d ? 1 : 0);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(C0563a.m2100a(context, attributeSet, C1088R.attr.materialButtonStyle, C1088R.style.Widget_MaterialComponents_Button), attributeSet, C1088R.attr.materialButtonStyle);
        this.f4890e = new LinkedHashSet<>();
        this.f4898m = false;
        this.f4899n = false;
        Context context2 = getContext();
        TypedArray typedArrayM2269d = C0655j.m2269d(context2, attributeSet, C0564b.f3515j, C1088R.attr.materialButtonStyle, C1088R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f4897l = typedArrayM2269d.getDimensionPixelSize(12, 0);
        this.f4892g = C0562a.m2092m(typedArrayM2269d.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.f4893h = C0562a.m2086g(getContext(), typedArrayM2269d, 14);
        this.f4894i = C0562a.m2088i(getContext(), typedArrayM2269d, 10);
        this.f4900o = typedArrayM2269d.getInteger(11, 1);
        this.f4895j = typedArrayM2269d.getDimensionPixelSize(13, 0);
        C0597a c0597a = new C0597a(this, C0678j.m2305b(context2, attributeSet, C1088R.attr.materialButtonStyle, C1088R.style.Widget_MaterialComponents_Button).m2310a());
        this.f4889d = c0597a;
        c0597a.f3606c = typedArrayM2269d.getDimensionPixelOffset(1, 0);
        c0597a.f3607d = typedArrayM2269d.getDimensionPixelOffset(2, 0);
        c0597a.f3608e = typedArrayM2269d.getDimensionPixelOffset(3, 0);
        c0597a.f3609f = typedArrayM2269d.getDimensionPixelOffset(4, 0);
        if (typedArrayM2269d.hasValue(8)) {
            int dimensionPixelSize = typedArrayM2269d.getDimensionPixelSize(8, -1);
            c0597a.f3610g = dimensionPixelSize;
            c0597a.m2124e(c0597a.f3605b.m2308e(dimensionPixelSize));
            c0597a.f3619p = true;
        }
        c0597a.f3611h = typedArrayM2269d.getDimensionPixelSize(20, 0);
        c0597a.f3612i = C0562a.m2092m(typedArrayM2269d.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        c0597a.f3613j = C0562a.m2086g(c0597a.f3604a.getContext(), typedArrayM2269d, 6);
        c0597a.f3614k = C0562a.m2086g(c0597a.f3604a.getContext(), typedArrayM2269d, 19);
        c0597a.f3615l = C0562a.m2086g(c0597a.f3604a.getContext(), typedArrayM2269d, 16);
        c0597a.f3620q = typedArrayM2269d.getBoolean(5, false);
        int dimensionPixelSize2 = typedArrayM2269d.getDimensionPixelSize(9, 0);
        MaterialButton materialButton = c0597a.f3604a;
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = c0597a.f3604a.getPaddingTop();
        int paddingEnd = c0597a.f3604a.getPaddingEnd();
        int paddingBottom = c0597a.f3604a.getPaddingBottom();
        if (typedArrayM2269d.hasValue(0)) {
            c0597a.f3618o = true;
            c0597a.f3604a.setSupportBackgroundTintList(c0597a.f3613j);
            c0597a.f3604a.setSupportBackgroundTintMode(c0597a.f3612i);
        } else {
            MaterialButton materialButton2 = c0597a.f3604a;
            C0675g c0675g = new C0675g(c0597a.f3605b);
            c0675g.m2294n(c0597a.f3604a.getContext());
            c0675g.setTintList(c0597a.f3613j);
            PorterDuff.Mode mode = c0597a.f3612i;
            if (mode != null) {
                c0675g.setTintMode(mode);
            }
            c0675g.m2299s(c0597a.f3611h, c0597a.f3614k);
            C0675g c0675g2 = new C0675g(c0597a.f3605b);
            c0675g2.setTint(0);
            c0675g2.m2298r(c0597a.f3611h, c0597a.f3617n ? C0562a.m2085f(c0597a.f3604a, C1088R.attr.colorSurface) : 0);
            C0675g c0675g3 = new C0675g(c0597a.f3605b);
            c0597a.f3616m = c0675g3;
            c0675g3.setTint(-1);
            RippleDrawable rippleDrawable = new RippleDrawable(C0666a.m2276a(c0597a.f3615l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{c0675g2, c0675g}), c0597a.f3606c, c0597a.f3608e, c0597a.f3607d, c0597a.f3609f), c0597a.f3616m);
            c0597a.f3621r = rippleDrawable;
            materialButton2.setInternalBackground(rippleDrawable);
            C0675g c0675gM2121b = c0597a.m2121b();
            if (c0675gM2121b != null) {
                c0675gM2121b.m2295o(dimensionPixelSize2);
            }
        }
        c0597a.f3604a.setPaddingRelative(paddingStart + c0597a.f3606c, paddingTop + c0597a.f3608e, paddingEnd + c0597a.f3607d, paddingBottom + c0597a.f3609f);
        typedArrayM2269d.recycle();
        setCompoundDrawablePadding(this.f4897l);
        m2643c(this.f4894i != null);
    }

    private String getA11yClassName() {
        return (m2641a() ? CompoundButton.class : Button.class).getName();
    }

    /* renamed from: a */
    public boolean m2641a() {
        C0597a c0597a = this.f4889d;
        return c0597a != null && c0597a.f3620q;
    }

    /* renamed from: b */
    public final boolean m2642b() {
        C0597a c0597a = this.f4889d;
        return (c0597a == null || c0597a.f3618o) ? false : true;
    }

    /* renamed from: c */
    public final void m2643c(boolean z) {
        Drawable drawable = this.f4894i;
        boolean z2 = false;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f4894i = drawableMutate;
            drawableMutate.setTintList(this.f4893h);
            PorterDuff.Mode mode = this.f4892g;
            if (mode != null) {
                this.f4894i.setTintMode(mode);
            }
            int intrinsicWidth = this.f4895j;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f4894i.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f4895j;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f4894i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f4894i;
            int i = this.f4896k;
            drawable2.setBounds(i, 0, intrinsicWidth + i, intrinsicHeight);
        }
        int i2 = this.f4900o;
        boolean z3 = i2 == 1 || i2 == 2;
        if (z) {
            Drawable drawable3 = this.f4894i;
            if (z3) {
                setCompoundDrawablesRelative(drawable3, null, null, null);
                return;
            } else {
                setCompoundDrawablesRelative(null, null, drawable3, null);
                return;
            }
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable4 = compoundDrawablesRelative[0];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((z3 && drawable4 != this.f4894i) || (!z3 && drawable5 != this.f4894i)) {
            z2 = true;
        }
        if (z2) {
            Drawable drawable6 = this.f4894i;
            if (z3) {
                setCompoundDrawablesRelative(drawable6, null, null, null);
            } else {
                setCompoundDrawablesRelative(null, null, drawable6, null);
            }
        }
    }

    /* renamed from: d */
    public final void m2644d() {
        if (this.f4894i == null || getLayout() == null) {
            return;
        }
        int i = this.f4900o;
        if (i == 1 || i == 3) {
            this.f4896k = 0;
            m2643c(false);
            return;
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        int iMin = Math.min((int) paint.measureText(string), getLayout().getEllipsizedWidth());
        int intrinsicWidth = this.f4895j;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f4894i.getIntrinsicWidth();
        }
        int measuredWidth = getMeasuredWidth() - iMin;
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        int paddingEnd = ((((measuredWidth - getPaddingEnd()) - intrinsicWidth) - this.f4897l) - getPaddingStart()) / 2;
        if ((getLayoutDirection() == 1) != (this.f4900o == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f4896k != paddingEnd) {
            this.f4896k = paddingEnd;
            m2643c(false);
        }
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m2642b()) {
            return this.f4889d.f3610g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f4894i;
    }

    public int getIconGravity() {
        return this.f4900o;
    }

    public int getIconPadding() {
        return this.f4897l;
    }

    public int getIconSize() {
        return this.f4895j;
    }

    public ColorStateList getIconTint() {
        return this.f4893h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f4892g;
    }

    public ColorStateList getRippleColor() {
        if (m2642b()) {
            return this.f4889d.f3615l;
        }
        return null;
    }

    public C0678j getShapeAppearanceModel() {
        if (m2642b()) {
            return this.f4889d.f3605b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m2642b()) {
            return this.f4889d.f3614k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m2642b()) {
            return this.f4889d.f3611h;
        }
        return 0;
    }

    @Override // p000a.p005b.p014h.C0079f
    public ColorStateList getSupportBackgroundTintList() {
        return m2642b() ? this.f4889d.f3613j : super.getSupportBackgroundTintList();
    }

    @Override // p000a.p005b.p014h.C0079f
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m2642b() ? this.f4889d.f3612i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f4898m;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m2642b()) {
            C0562a.m2098s(this, this.f4889d.m2121b());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (m2641a()) {
            Button.mergeDrawableStates(iArrOnCreateDrawableState, f4887p);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(iArrOnCreateDrawableState, f4888q);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // p000a.p005b.p014h.C0079f, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // p000a.p005b.p014h.C0079f, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(m2641a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // p000a.p005b.p014h.C0079f, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m2644d();
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0926c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0926c c0926c = (C0926c) parcelable;
        super.onRestoreInstanceState(c0926c.f1718b);
        setChecked(c0926c.f4901d);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        C0926c c0926c = new C0926c(super.onSaveInstanceState());
        c0926c.f4901d = this.f4898m;
        return c0926c;
    }

    @Override // p000a.p005b.p014h.C0079f, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m2644d();
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!m2642b()) {
            super.setBackgroundColor(i);
            return;
        }
        C0597a c0597a = this.f4889d;
        if (c0597a.m2121b() != null) {
            c0597a.m2121b().setTint(i);
        }
    }

    @Override // p000a.p005b.p014h.C0079f, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (m2642b()) {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "Do not set the background; MaterialButton manages its own background drawable.");
            C0597a c0597a = this.f4889d;
            c0597a.f3618o = true;
            c0597a.f3604a.setSupportBackgroundTintList(c0597a.f3613j);
            c0597a.f3604a.setSupportBackgroundTintMode(c0597a.f3612i);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // p000a.p005b.p014h.C0079f, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? C0034a.m129a(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (m2642b()) {
            this.f4889d.f3620q = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (m2641a() && isEnabled() && this.f4898m != z) {
            this.f4898m = z;
            refreshDrawableState();
            if (this.f4899n) {
                return;
            }
            this.f4899n = true;
            Iterator<InterfaceC0924a> it = this.f4890e.iterator();
            while (it.hasNext()) {
                it.next().m2645a(this, this.f4898m);
            }
            this.f4899n = false;
        }
    }

    public void setCornerRadius(int i) {
        if (m2642b()) {
            C0597a c0597a = this.f4889d;
            if (c0597a.f3619p && c0597a.f3610g == i) {
                return;
            }
            c0597a.f3610g = i;
            c0597a.f3619p = true;
            c0597a.m2124e(c0597a.f3605b.m2308e(i));
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m2642b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        if (m2642b()) {
            C0675g c0675gM2121b = this.f4889d.m2121b();
            C0675g.b bVar = c0675gM2121b.f3998b;
            if (bVar.f4035o != f2) {
                bVar.f4035o = f2;
                c0675gM2121b.m2303w();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f4894i != drawable) {
            this.f4894i = drawable;
            m2643c(true);
        }
    }

    public void setIconGravity(int i) {
        if (this.f4900o != i) {
            this.f4900o = i;
            m2644d();
        }
    }

    public void setIconPadding(int i) {
        if (this.f4897l != i) {
            this.f4897l = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? C0034a.m129a(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f4895j != i) {
            this.f4895j = i;
            m2643c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f4893h != colorStateList) {
            this.f4893h = colorStateList;
            m2643c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f4892g != mode) {
            this.f4892g = mode;
            m2643c(false);
        }
    }

    public void setIconTintResource(int i) {
        Context context = getContext();
        ThreadLocal<TypedValue> threadLocal = C0034a.f211a;
        setIconTint(context.getColorStateList(i));
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC0925b interfaceC0925b) {
        this.f4891f = interfaceC0925b;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        InterfaceC0925b interfaceC0925b = this.f4891f;
        if (interfaceC0925b != null) {
            interfaceC0925b.m2646a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m2642b()) {
            C0597a c0597a = this.f4889d;
            if (c0597a.f3615l != colorStateList) {
                c0597a.f3615l = colorStateList;
                if (c0597a.f3604a.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) c0597a.f3604a.getBackground()).setColor(C0666a.m2276a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (m2642b()) {
            Context context = getContext();
            ThreadLocal<TypedValue> threadLocal = C0034a.f211a;
            setRippleColor(context.getColorStateList(i));
        }
    }

    @Override // p070b.p074b.p075a.p076a.p101w.InterfaceC0682n
    public void setShapeAppearanceModel(C0678j c0678j) {
        if (!m2642b()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f4889d.m2124e(c0678j);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m2642b()) {
            C0597a c0597a = this.f4889d;
            c0597a.f3617n = z;
            c0597a.m2125f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m2642b()) {
            C0597a c0597a = this.f4889d;
            if (c0597a.f3614k != colorStateList) {
                c0597a.f3614k = colorStateList;
                c0597a.m2125f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (m2642b()) {
            Context context = getContext();
            ThreadLocal<TypedValue> threadLocal = C0034a.f211a;
            setStrokeColor(context.getColorStateList(i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m2642b()) {
            C0597a c0597a = this.f4889d;
            if (c0597a.f3611h != i) {
                c0597a.f3611h = i;
                c0597a.m2125f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m2642b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // p000a.p005b.p014h.C0079f
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!m2642b()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        C0597a c0597a = this.f4889d;
        if (c0597a.f3613j != colorStateList) {
            c0597a.f3613j = colorStateList;
            if (c0597a.m2121b() != null) {
                c0597a.m2121b().setTintList(c0597a.f3613j);
            }
        }
    }

    @Override // p000a.p005b.p014h.C0079f
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!m2642b()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        C0597a c0597a = this.f4889d;
        if (c0597a.f3612i != mode) {
            c0597a.f3612i = mode;
            if (c0597a.m2121b() == null || c0597a.f3612i == null) {
                return;
            }
            c0597a.m2121b().setTintMode(c0597a.f3612i);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f4898m);
    }
}
