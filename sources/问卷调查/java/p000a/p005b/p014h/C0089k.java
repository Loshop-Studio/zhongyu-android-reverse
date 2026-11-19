package p000a.p005b.p014h;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import io.github.inflationx.calligraphy3.C1088R;
import p000a.p005b.C0013a;
import p000a.p005b.p007d.p008a.C0034a;

/* renamed from: a.b.h.k */
/* loaded from: classes.dex */
public class C0089k extends MultiAutoCompleteTextView {

    /* renamed from: d */
    public static final int[] f692d = {R.attr.popupBackground};

    /* renamed from: b */
    public final C0077e f693b;

    /* renamed from: c */
    public final C0109u f694c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0089k(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, C1088R.attr.autoCompleteTextViewStyle);
        C0104r0.m382a(context);
        C0100p0.m376a(this, getContext());
        C0110u0 c0110u0M414q = C0110u0.m414q(getContext(), attributeSet, f692d, C1088R.attr.autoCompleteTextViewStyle, 0);
        if (c0110u0M414q.m429o(0)) {
            setDropDownBackgroundDrawable(c0110u0M414q.m421g(0));
        }
        c0110u0M414q.f810b.recycle();
        C0077e c0077e = new C0077e(this);
        this.f693b = c0077e;
        c0077e.m303d(attributeSet, C1088R.attr.autoCompleteTextViewStyle);
        C0109u c0109u = new C0109u(this);
        this.f694c = c0109u;
        c0109u.m402e(attributeSet, C1088R.attr.autoCompleteTextViewStyle);
        c0109u.m400b();
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0077e c0077e = this.f693b;
        if (c0077e != null) {
            c0077e.m300a();
        }
        C0109u c0109u = this.f694c;
        if (c0109u != null) {
            c0109u.m400b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0077e c0077e = this.f693b;
        if (c0077e != null) {
            return c0077e.m301b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0077e c0077e = this.f693b;
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
        C0077e c0077e = this.f693b;
        if (c0077e != null) {
            c0077e.m304e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0077e c0077e = this.f693b;
        if (c0077e != null) {
            c0077e.m305f(i);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C0034a.m129a(getContext(), i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0077e c0077e = this.f693b;
        if (c0077e != null) {
            c0077e.m307h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0077e c0077e = this.f693b;
        if (c0077e != null) {
            c0077e.m308i(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0109u c0109u = this.f694c;
        if (c0109u != null) {
            c0109u.m403f(context, i);
        }
    }
}
