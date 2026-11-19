package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.widget.C0377k;
import androidx.core.widget.InterfaceC0368b;
import androidx.core.widget.InterfaceC0379m;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p001a0.C0003b;
import p073d.C2443a;
import p152t.C3388g;

/* loaded from: classes.dex */
public class AppCompatTextView extends TextView implements InterfaceC0379m, InterfaceC0368b {
    private final C0207d mBackgroundTintHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future<C0003b> mPrecomputedTextFuture;
    private final C0223l mTextClassifierHelper;
    private final C0225m mTextHelper;

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    private void consumeTextFutureAndSetBlocking() {
        Future<C0003b> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                C0377k.m2200n(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return C0377k.m2188b(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return C0377k.m2189c(this);
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

    @Override // android.widget.TextView
    public CharSequence getText() {
        consumeTextFutureAndSetBlocking();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0223l c0223l;
        return (Build.VERSION.SDK_INT >= 28 || (c0223l = this.mTextClassifierHelper) == null) ? super.getTextClassifier() : c0223l.m912a();
    }

    public C0003b.a getTextMetricsParamsCompat() {
        return C0377k.m2193g(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.m939r(this, inputConnectionOnCreateInputConnection, editorInfo);
        return C0213g.m812a(inputConnectionOnCreateInputConnection, editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        C0225m c0225m = this.mTextHelper;
        if (c0225m != null) {
            c0225m.m936o(z3, i4, i5, i6, i7);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i4, int i5) {
        consumeTextFutureAndSetBlocking();
        super.onMeasure(i4, i5);
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
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0225m c0225m = this.mTextHelper;
        if (c0225m != null) {
            c0225m.m937p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0225m c0225m = this.mTextHelper;
        if (c0225m != null) {
            c0225m.m937p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0225m c0225m = this.mTextHelper;
        if (c0225m != null) {
            c0225m.m937p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0225m c0225m = this.mTextHelper;
        if (c0225m != null) {
            c0225m.m937p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0377k.m2203q(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i4);
        } else {
            C0377k.m2197k(this, i4);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i4);
        } else {
            C0377k.m2198l(this, i4);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i4) {
        C0377k.m2199m(this, i4);
    }

    public void setPrecomputedText(C0003b c0003b) {
        C0377k.m2200n(this, c0003b);
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
    public void setTextClassifier(TextClassifier textClassifier) {
        C0223l c0223l;
        if (Build.VERSION.SDK_INT >= 28 || (c0223l = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0223l.m913b(textClassifier);
        }
    }

    public void setTextFuture(Future<C0003b> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C0003b.a aVar) {
        C0377k.m2202p(this, aVar);
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

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i4) {
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        Typeface typefaceM10324a = null;
        if (typeface != null && i4 > 0) {
            typefaceM10324a = C3388g.m10324a(getContext(), typeface, i4);
        }
        this.mIsSetTypefaceProcessing = true;
        if (typefaceM10324a != null) {
            typeface = typefaceM10324a;
        }
        try {
            super.setTypeface(typeface, i4);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i4) {
        super(C0208d0.m780b(context), attributeSet, i4);
        this.mIsSetTypefaceProcessing = false;
        C0204b0.m762a(this, getContext());
        C0207d c0207d = new C0207d(this);
        this.mBackgroundTintHelper = c0207d;
        c0207d.m773e(attributeSet, i4);
        C0225m c0225m = new C0225m(this);
        this.mTextHelper = c0225m;
        c0225m.m934m(attributeSet, i4);
        c0225m.m924b();
        this.mTextClassifierHelper = new C0223l(this);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i4 != 0 ? C2443a.m8169d(context, i4) : null, i5 != 0 ? C2443a.m8169d(context, i5) : null, i6 != 0 ? C2443a.m8169d(context, i6) : null, i7 != 0 ? C2443a.m8169d(context, i7) : null);
        C0225m c0225m = this.mTextHelper;
        if (c0225m != null) {
            c0225m.m937p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i4 != 0 ? C2443a.m8169d(context, i4) : null, i5 != 0 ? C2443a.m8169d(context, i5) : null, i6 != 0 ? C2443a.m8169d(context, i6) : null, i7 != 0 ? C2443a.m8169d(context, i7) : null);
        C0225m c0225m = this.mTextHelper;
        if (c0225m != null) {
            c0225m.m937p();
        }
    }
}
