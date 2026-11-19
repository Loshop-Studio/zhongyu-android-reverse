package p070b.p074b.p075a.p076a.p102x;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.WeakHashMap;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p070b.p074b.p075a.p076a.C0562a;
import p070b.p074b.p075a.p076a.C0564b;
import p070b.p074b.p075a.p076a.p077a0.p078a.C0563a;

/* renamed from: b.b.a.a.x.d */
/* loaded from: classes.dex */
public class C0686d extends FrameLayout {

    /* renamed from: i */
    public static final View.OnTouchListener f4103i = new a();

    /* renamed from: b */
    public InterfaceC0685c f4104b;

    /* renamed from: c */
    public InterfaceC0684b f4105c;

    /* renamed from: d */
    public int f4106d;

    /* renamed from: e */
    public final float f4107e;

    /* renamed from: f */
    public final float f4108f;

    /* renamed from: g */
    public ColorStateList f4109g;

    /* renamed from: h */
    public PorterDuff.Mode f4110h;

    /* renamed from: b.b.a.a.x.d$a */
    public static class a implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    public C0686d(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(C0563a.m2100a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C0564b.f3525t);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            setElevation(dimensionPixelSize);
        }
        this.f4106d = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f4107e = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(C0562a.m2086g(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(C0562a.m2092m(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f4108f = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(f4103i);
        setFocusable(true);
        if (getBackground() == null) {
            float dimension = getResources().getDimension(C1088R.dimen.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(C0562a.m2090k(C0562a.m2085f(this, C1088R.attr.colorSurface), C0562a.m2085f(this, C1088R.attr.colorOnSurface), getBackgroundOverlayColorAlpha()));
            ColorStateList colorStateList = this.f4109g;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            WeakHashMap<View, C0273v> weakHashMap2 = C0266o.f1616a;
            setBackground(gradientDrawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f4108f;
    }

    public int getAnimationMode() {
        return this.f4106d;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f4107e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0684b interfaceC0684b = this.f4105c;
        if (interfaceC0684b != null) {
            interfaceC0684b.onViewAttachedToWindow(this);
        }
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0684b interfaceC0684b = this.f4105c;
        if (interfaceC0684b != null) {
            interfaceC0684b.onViewDetachedFromWindow(this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        InterfaceC0685c interfaceC0685c = this.f4104b;
        if (interfaceC0685c != null) {
            interfaceC0685c.m2325a(this, i, i2, i3, i4);
        }
    }

    public void setAnimationMode(int i) {
        this.f4106d = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f4109g != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.f4109g);
            drawable.setTintMode(this.f4110h);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f4109g = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintList(colorStateList);
            drawableMutate.setTintMode(this.f4110h);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f4110h = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintMode(mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    public void setOnAttachStateChangeListener(InterfaceC0684b interfaceC0684b) {
        this.f4105c = interfaceC0684b;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f4103i);
        super.setOnClickListener(onClickListener);
    }

    public void setOnLayoutChangeListener(InterfaceC0685c interfaceC0685c) {
        this.f4104b = interfaceC0685c;
    }
}
