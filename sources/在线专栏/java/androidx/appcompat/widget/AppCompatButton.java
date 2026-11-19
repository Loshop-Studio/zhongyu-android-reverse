package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.widget.C0377k;
import androidx.core.widget.InterfaceC0368b;
import androidx.core.widget.InterfaceC0379m;
import p015c.C1038a;

/* loaded from: classes.dex */
public class AppCompatButton extends Button implements InterfaceC0368b, InterfaceC0379m {
    private final C0207d mBackgroundTintHelper;
    private final C0225m mTextHelper;

    public AppCompatButton(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0207d c0207d = this.mBackgroundTintHelper;
        if (c0207d != null) {
            c0207d.m770b();
        }
        C0225m c0225m = this.mTextHelper;
        if (c0225m != null) {
            c0225m.m924b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (InterfaceC0368b.f2817O) {
            return super.getAutoSizeMaxTextSize();
        }
        C0225m c0225m = this.mTextHelper;
        if (c0225m != null) {
            return c0225m.m926e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (InterfaceC0368b.f2817O) {
            return super.getAutoSizeMinTextSize();
        }
        C0225m c0225m = this.mTextHelper;
        if (c0225m != null) {
            return c0225m.m927f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (InterfaceC0368b.f2817O) {
            return super.getAutoSizeStepGranularity();
        }
        C0225m c0225m = this.mTextHelper;
        if (c0225m != null) {
            return c0225m.m928g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (InterfaceC0368b.f2817O) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0225m c0225m = this.mTextHelper;
        return c0225m != null ? c0225m.m929h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (InterfaceC0368b.f2817O) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0225m c0225m = this.mTextHelper;
        if (c0225m != null) {
            return c0225m.m930i();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0207d c0207d = this.mBackgroundTintHelper;
        if (c0207d != null) {
            return c0207d.m771c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0207d c0207d = this.mBackgroundTintHelper;
        if (c0207d != null) {
            return c0207d.m772d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.m931j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.m932k();
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
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        C0225m c0225m = this.mTextHelper;
        if (c0225m != null) {
            c0225m.m936o(z3, i4, i5, i6, i7);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        super.onTextChanged(charSequence, i4, i5, i6);
        C0225m c0225m = this.mTextHelper;
        if (c0225m == null || InterfaceC0368b.f2817O || !c0225m.m933l()) {
            return;
        }
        this.mTextHelper.m925c();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        if (InterfaceC0368b.f2817O) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i4, i5, i6, i7);
            return;
        }
        C0225m c0225m = this.mTextHelper;
        if (c0225m != null) {
            c0225m.m941t(i4, i5, i6, i7);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i4) throws IllegalArgumentException {
        if (InterfaceC0368b.f2817O) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i4);
            return;
        }
        C0225m c0225m = this.mTextHelper;
        if (c0225m != null) {
            c0225m.m942u(iArr, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i4) {
        if (InterfaceC0368b.f2817O) {
            super.setAutoSizeTextTypeWithDefaults(i4);
            return;
        }
        C0225m c0225m = this.mTextHelper;
        if (c0225m != null) {
            c0225m.m943v(i4);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0207d c0207d = this.mBackgroundTintHelper;
        if (c0207d != null) {
            c0207d.m774f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C0207d c0207d = this.mBackgroundTintHelper;
        if (c0207d != null) {
            c0207d.m775g(i4);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0377k.m2203q(this, callback));
    }

    public void setSupportAllCaps(boolean z3) {
        C0225m c0225m = this.mTextHelper;
        if (c0225m != null) {
            c0225m.m940s(z3);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0207d c0207d = this.mBackgroundTintHelper;
        if (c0207d != null) {
            c0207d.m777i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0207d c0207d = this.mBackgroundTintHelper;
        if (c0207d != null) {
            c0207d.m778j(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC0379m
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.m944w(colorStateList);
        this.mTextHelper.m924b();
    }

    @Override // androidx.core.widget.InterfaceC0379m
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.m945x(mode);
        this.mTextHelper.m924b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        C0225m c0225m = this.mTextHelper;
        if (c0225m != null) {
            c0225m.m938q(context, i4);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i4, float f4) {
        if (InterfaceC0368b.f2817O) {
            super.setTextSize(i4, f4);
            return;
        }
        C0225m c0225m = this.mTextHelper;
        if (c0225m != null) {
            c0225m.m923A(i4, f4);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1038a.f5753q);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i4) {
        super(C0208d0.m780b(context), attributeSet, i4);
        C0204b0.m762a(this, getContext());
        C0207d c0207d = new C0207d(this);
        this.mBackgroundTintHelper = c0207d;
        c0207d.m773e(attributeSet, i4);
        C0225m c0225m = new C0225m(this);
        this.mTextHelper = c0225m;
        c0225m.m934m(attributeSet, i4);
        c0225m.m924b();
    }
}
