package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.core.widget.C0377k;
import p015c.C1038a;
import p073d.C2443a;

/* loaded from: classes.dex */
public class AppCompatAutoCompleteTextView extends AutoCompleteTextView {
    private static final int[] TINT_ATTRS = {R.attr.popupBackground};
    private final C0207d mBackgroundTintHelper;
    private final C0225m mTextHelper;

    public AppCompatAutoCompleteTextView(Context context) {
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

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0213g.m812a(super.onCreateInputConnection(editorInfo), editorInfo, this);
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

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i4) {
        setDropDownBackgroundDrawable(C2443a.m8169d(getContext(), i4));
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

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        C0225m c0225m = this.mTextHelper;
        if (c0225m != null) {
            c0225m.m938q(context, i4);
        }
    }

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1038a.f5752p);
    }

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet, int i4) {
        super(C0208d0.m780b(context), attributeSet, i4);
        C0204b0.m762a(this, getContext());
        C0214g0 c0214g0M815v = C0214g0.m815v(getContext(), attributeSet, TINT_ATTRS, i4, 0);
        if (c0214g0M815v.m834s(0)) {
            setDropDownBackgroundDrawable(c0214g0M815v.m822g(0));
        }
        c0214g0M815v.m835w();
        C0207d c0207d = new C0207d(this);
        this.mBackgroundTintHelper = c0207d;
        c0207d.m773e(attributeSet, i4);
        C0225m c0225m = new C0225m(this);
        this.mTextHelper = c0225m;
        c0225m.m934m(attributeSet, i4);
        c0225m.m924b();
    }
}
