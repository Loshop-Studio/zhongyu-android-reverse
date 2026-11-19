package p000a.p005b.p014h;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p000a.p005b.C0013a;
import p000a.p005b.p007d.p008a.C0034a;
import p000a.p031h.p032b.C0190e;
import p000a.p031h.p035d.C0205d;
import p000a.p031h.p035d.C0212k;
import p000a.p031h.p041h.C0235b;
import p000a.p031h.p046k.InterfaceC0279b;
import p000a.p031h.p046k.InterfaceC0283f;

/* renamed from: a.b.h.w */
/* loaded from: classes.dex */
public class C0113w extends TextView implements InterfaceC0283f, InterfaceC0279b {

    /* renamed from: b */
    public final C0077e f817b;

    /* renamed from: c */
    public final C0109u f818c;

    /* renamed from: d */
    public final C0107t f819d;

    /* renamed from: e */
    public boolean f820e;

    /* renamed from: f */
    public Future<C0235b> f821f;

    public C0113w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0113w(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        C0104r0.m382a(context);
        this.f820e = false;
        C0100p0.m376a(this, getContext());
        C0077e c0077e = new C0077e(this);
        this.f817b = c0077e;
        c0077e.m303d(attributeSet, i);
        C0109u c0109u = new C0109u(this);
        this.f818c = c0109u;
        c0109u.m402e(attributeSet, i);
        c0109u.m400b();
        this.f819d = new C0107t(this);
    }

    /* renamed from: c */
    public final void m430c() throws ExecutionException, InterruptedException {
        Future<C0235b> future = this.f821f;
        if (future != null) {
            try {
                this.f821f = null;
                C0235b c0235b = future.get();
                if (Build.VERSION.SDK_INT >= 29) {
                    Objects.requireNonNull(c0235b);
                    setText((CharSequence) null);
                } else {
                    C0190e.m729x(this);
                    Objects.requireNonNull(c0235b);
                    throw null;
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0077e c0077e = this.f817b;
        if (c0077e != null) {
            c0077e.m300a();
        }
        C0109u c0109u = this.f818c;
        if (c0109u != null) {
            c0109u.m400b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (InterfaceC0279b.f1695a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0109u c0109u = this.f818c;
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
        C0109u c0109u = this.f818c;
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
        C0109u c0109u = this.f818c;
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
        C0109u c0109u = this.f818c;
        return c0109u != null ? c0109u.f800i.f849f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (InterfaceC0279b.f1695a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0109u c0109u = this.f818c;
        if (c0109u != null) {
            return c0109u.f800i.f844a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0077e c0077e = this.f817b;
        if (c0077e != null) {
            return c0077e.m301b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0077e c0077e = this.f817b;
        if (c0077e != null) {
            return c0077e.m302c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C0106s0 c0106s0 = this.f818c.f799h;
        if (c0106s0 != null) {
            return c0106s0.f786a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C0106s0 c0106s0 = this.f818c.f799h;
        if (c0106s0 != null) {
            return c0106s0.f787b;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() throws ExecutionException, InterruptedException {
        m430c();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0107t c0107t;
        return (Build.VERSION.SDK_INT >= 28 || (c0107t = this.f819d) == null) ? super.getTextClassifier() : c0107t.m397a();
    }

    public C0235b.a getTextMetricsParamsCompat() {
        return C0190e.m729x(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f818c.m404g(this, inputConnectionOnCreateInputConnection, editorInfo);
        C0013a.m12c(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0109u c0109u = this.f818c;
        if (c0109u == null || InterfaceC0279b.f1695a) {
            return;
        }
        c0109u.f800i.m436a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) throws ExecutionException, InterruptedException {
        m430c();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0109u c0109u = this.f818c;
        if (c0109u == null || InterfaceC0279b.f1695a || !c0109u.m401d()) {
            return;
        }
        this.f818c.f800i.m436a();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (InterfaceC0279b.f1695a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0109u c0109u = this.f818c;
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
        C0109u c0109u = this.f818c;
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
        C0109u c0109u = this.f818c;
        if (c0109u != null) {
            c0109u.m407j(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0077e c0077e = this.f817b;
        if (c0077e != null) {
            c0077e.m304e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0077e c0077e = this.f817b;
        if (c0077e != null) {
            c0077e.m305f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0109u c0109u = this.f818c;
        if (c0109u != null) {
            c0109u.m400b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0109u c0109u = this.f818c;
        if (c0109u != null) {
            c0109u.m400b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? C0034a.m129a(context, i) : null, i2 != 0 ? C0034a.m129a(context, i2) : null, i3 != 0 ? C0034a.m129a(context, i3) : null, i4 != 0 ? C0034a.m129a(context, i4) : null);
        C0109u c0109u = this.f818c;
        if (c0109u != null) {
            c0109u.m400b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? C0034a.m129a(context, i) : null, i2 != 0 ? C0034a.m129a(context, i2) : null, i3 != 0 ? C0034a.m129a(context, i3) : null, i4 != 0 ? C0034a.m129a(context, i4) : null);
        C0109u c0109u = this.f818c;
        if (c0109u != null) {
            c0109u.m400b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0190e.m705R(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            C0190e.m697J(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            C0190e.m698K(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        C0190e.m699L(this, i);
    }

    public void setPrecomputedText(C0235b c0235b) {
        if (Build.VERSION.SDK_INT >= 29) {
            Objects.requireNonNull(c0235b);
            setText((CharSequence) null);
        } else {
            C0190e.m729x(this);
            Objects.requireNonNull(c0235b);
            throw null;
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0077e c0077e = this.f817b;
        if (c0077e != null) {
            c0077e.m307h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0077e c0077e = this.f817b;
        if (c0077e != null) {
            c0077e.m308i(mode);
        }
    }

    @Override // p000a.p031h.p046k.InterfaceC0283f
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f818c.m408k(colorStateList);
        this.f818c.m400b();
    }

    @Override // p000a.p031h.p046k.InterfaceC0283f
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f818c.m409l(mode);
        this.f818c.m400b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0109u c0109u = this.f818c;
        if (c0109u != null) {
            c0109u.m403f(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0107t c0107t;
        if (Build.VERSION.SDK_INT >= 28 || (c0107t = this.f819d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0107t.f791b = textClassifier;
        }
    }

    public void setTextFuture(Future<C0235b> future) {
        this.f821f = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C0235b.a aVar) {
        TextDirectionHeuristic textDirectionHeuristic = aVar.f1541b;
        int i = 1;
        if (textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_RTL && textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(aVar.f1540a);
        setBreakStrategy(aVar.f1542c);
        setHyphenationFrequency(aVar.f1543d);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z = InterfaceC0279b.f1695a;
        if (z) {
            super.setTextSize(i, f2);
            return;
        }
        C0109u c0109u = this.f818c;
        if (c0109u == null || z || c0109u.m401d()) {
            return;
        }
        c0109u.f800i.m439f(i, f2);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        if (this.f820e) {
            return;
        }
        Typeface typefaceCreate = null;
        if (typeface != null && i > 0) {
            Context context = getContext();
            C0212k c0212k = C0205d.f1460a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.f820e = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f820e = false;
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0109u c0109u = this.f818c;
        if (c0109u != null) {
            c0109u.m400b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0109u c0109u = this.f818c;
        if (c0109u != null) {
            c0109u.m400b();
        }
    }
}
