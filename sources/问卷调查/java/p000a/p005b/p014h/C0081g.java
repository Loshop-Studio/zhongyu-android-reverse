package p000a.p005b.p014h;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import p000a.p005b.C0013a;
import p000a.p005b.p007d.p008a.C0034a;
import p000a.p031h.p032b.C0190e;

/* renamed from: a.b.h.g */
/* loaded from: classes.dex */
public class C0081g extends CheckedTextView {

    /* renamed from: c */
    public static final int[] f632c = {R.attr.checkMark};

    /* renamed from: b */
    public final C0109u f633b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0081g(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        C0104r0.m382a(context);
        C0100p0.m376a(this, getContext());
        C0109u c0109u = new C0109u(this);
        this.f633b = c0109u;
        c0109u.m402e(attributeSet, R.attr.checkedTextViewStyle);
        c0109u.m400b();
        C0110u0 c0110u0M414q = C0110u0.m414q(getContext(), attributeSet, f632c, R.attr.checkedTextViewStyle, 0);
        setCheckMarkDrawable(c0110u0M414q.m421g(0));
        c0110u0M414q.f810b.recycle();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0109u c0109u = this.f633b;
        if (c0109u != null) {
            c0109u.m400b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0013a.m12c(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C0034a.m129a(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0190e.m705R(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0109u c0109u = this.f633b;
        if (c0109u != null) {
            c0109u.m403f(context, i);
        }
    }
}
