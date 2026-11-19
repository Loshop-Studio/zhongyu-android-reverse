package p000a.p005b.p014h;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import io.github.inflationx.calligraphy3.C1088R;
import java.lang.reflect.InvocationTargetException;
import p000a.p031h.p032b.C0190e;
import p000a.p031h.p046k.InterfaceC0279b;
import p000a.p031h.p046k.InterfaceC0283f;

/* renamed from: a.b.h.f */
/* loaded from: classes.dex */
public class C0079f extends Button implements InterfaceC0279b, InterfaceC0283f {

    /* renamed from: b */
    public final C0077e f615b;

    /* renamed from: c */
    public final C0109u f616c;

    public C0079f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1088R.attr.buttonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0079f(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        C0104r0.m382a(context);
        C0100p0.m376a(this, getContext());
        C0077e c0077e = new C0077e(this);
        this.f615b = c0077e;
        c0077e.m303d(attributeSet, i);
        C0109u c0109u = new C0109u(this);
        this.f616c = c0109u;
        c0109u.m402e(attributeSet, i);
        c0109u.m400b();
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0077e c0077e = this.f615b;
        if (c0077e != null) {
            c0077e.m300a();
        }
        C0109u c0109u = this.f616c;
        if (c0109u != null) {
            c0109u.m400b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (InterfaceC0279b.f1695a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0109u c0109u = this.f616c;
        if (c0109u != null) {
            return Math.round(c0109u.f800i.f848e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (InterfaceC0279b.f1695a) {
            return super.getAutoSizeMinTextSize();
        }
        C0109u c0109u = this.f616c;
        if (c0109u != null) {
            return Math.round(c0109u.f800i.f847d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (InterfaceC0279b.f1695a) {
            return super.getAutoSizeStepGranularity();
        }
        C0109u c0109u = this.f616c;
        if (c0109u != null) {
            return Math.round(c0109u.f800i.f846c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (InterfaceC0279b.f1695a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0109u c0109u = this.f616c;
        return c0109u != null ? c0109u.f800i.f849f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (InterfaceC0279b.f1695a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0109u c0109u = this.f616c;
        if (c0109u != null) {
            return c0109u.f800i.f844a;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0077e c0077e = this.f615b;
        if (c0077e != null) {
            return c0077e.m301b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0077e c0077e = this.f615b;
        if (c0077e != null) {
            return c0077e.m302c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C0106s0 c0106s0 = this.f616c.f799h;
        if (c0106s0 != null) {
            return c0106s0.f786a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C0106s0 c0106s0 = this.f616c.f799h;
        if (c0106s0 != null) {
            return c0106s0.f787b;
        }
        return null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0109u c0109u = this.f616c;
        if (c0109u == null || InterfaceC0279b.f1695a) {
            return;
        }
        c0109u.f800i.m436a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0109u c0109u = this.f616c;
        if (c0109u == null || InterfaceC0279b.f1695a || !c0109u.m401d()) {
            return;
        }
        this.f616c.f800i.m436a();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (InterfaceC0279b.f1695a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0109u c0109u = this.f616c;
        if (c0109u != null) {
            c0109u.m405h(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (InterfaceC0279b.f1695a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0109u c0109u = this.f616c;
        if (c0109u != null) {
            c0109u.m406i(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (InterfaceC0279b.f1695a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0109u c0109u = this.f616c;
        if (c0109u != null) {
            c0109u.m407j(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0077e c0077e = this.f615b;
        if (c0077e != null) {
            c0077e.m304e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0077e c0077e = this.f615b;
        if (c0077e != null) {
            c0077e.m305f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0190e.m705R(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        C0109u c0109u = this.f616c;
        if (c0109u != null) {
            c0109u.f792a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0077e c0077e = this.f615b;
        if (c0077e != null) {
            c0077e.m307h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0077e c0077e = this.f615b;
        if (c0077e != null) {
            c0077e.m308i(mode);
        }
    }

    @Override // p000a.p031h.p046k.InterfaceC0283f
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f616c.m408k(colorStateList);
        this.f616c.m400b();
    }

    @Override // p000a.p031h.p046k.InterfaceC0283f
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f616c.m409l(mode);
        this.f616c.m400b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0109u c0109u = this.f616c;
        if (c0109u != null) {
            c0109u.m403f(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z = InterfaceC0279b.f1695a;
        if (z) {
            super.setTextSize(i, f2);
            return;
        }
        C0109u c0109u = this.f616c;
        if (c0109u == null || z || c0109u.m401d()) {
            return;
        }
        c0109u.f800i.m439f(i, f2);
    }
}
