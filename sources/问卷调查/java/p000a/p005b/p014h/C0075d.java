package p000a.p005b.p014h;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import io.github.inflationx.calligraphy3.C1088R;
import p000a.p005b.C0013a;
import p000a.p005b.p007d.p008a.C0034a;
import p000a.p031h.p032b.C0190e;

/* renamed from: a.b.h.d */
/* loaded from: classes.dex */
public class C0075d extends AutoCompleteTextView {

    /* renamed from: d */
    public static final int[] f595d = {R.attr.popupBackground};

    /* renamed from: b */
    public final C0077e f596b;

    /* renamed from: c */
    public final C0109u f597c;

    public C0075d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1088R.attr.autoCompleteTextViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0075d(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        C0104r0.m382a(context);
        C0100p0.m376a(this, getContext());
        C0110u0 c0110u0M414q = C0110u0.m414q(getContext(), attributeSet, f595d, i, 0);
        if (c0110u0M414q.m429o(0)) {
            setDropDownBackgroundDrawable(c0110u0M414q.m421g(0));
        }
        c0110u0M414q.f810b.recycle();
        C0077e c0077e = new C0077e(this);
        this.f596b = c0077e;
        c0077e.m303d(attributeSet, i);
        C0109u c0109u = new C0109u(this);
        this.f597c = c0109u;
        c0109u.m402e(attributeSet, i);
        c0109u.m400b();
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0077e c0077e = this.f596b;
        if (c0077e != null) {
            c0077e.m300a();
        }
        C0109u c0109u = this.f597c;
        if (c0109u != null) {
            c0109u.m400b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0077e c0077e = this.f596b;
        if (c0077e != null) {
            return c0077e.m301b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0077e c0077e = this.f596b;
        if (c0077e != null) {
            return c0077e.m302c();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0013a.m12c(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0077e c0077e = this.f596b;
        if (c0077e != null) {
            c0077e.m304e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0077e c0077e = this.f596b;
        if (c0077e != null) {
            c0077e.m305f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0190e.m705R(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C0034a.m129a(getContext(), i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0077e c0077e = this.f596b;
        if (c0077e != null) {
            c0077e.m307h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0077e c0077e = this.f596b;
        if (c0077e != null) {
            c0077e.m308i(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0109u c0109u = this.f597c;
        if (c0109u != null) {
            c0109u.m403f(context, i);
        }
    }
}
