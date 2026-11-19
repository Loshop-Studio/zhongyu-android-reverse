package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0343f;
import p015c.C1038a;
import p088g.AbstractC2620b;

/* renamed from: androidx.appcompat.app.e */
/* loaded from: classes.dex */
public class DialogC0104e extends Dialog implements InterfaceC0102c {
    private AbstractC0103d mDelegate;
    private final C0343f.a mKeyDispatcher;

    /* renamed from: androidx.appcompat.app.e$a */
    class a implements C0343f.a {
        a() {
        }

        @Override // androidx.core.view.C0343f.a
        public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
            return DialogC0104e.this.superDispatchKeyEvent(keyEvent);
        }
    }

    public DialogC0104e(Context context) {
        this(context, 0);
    }

    private static int getThemeResId(Context context, int i4) {
        if (i4 != 0) {
            return i4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C1038a.f5762z, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().mo211b(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        getDelegate().mo231s();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C0343f.m1933e(this.mKeyDispatcher, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i4) {
        return (T) getDelegate().mo218i(i4);
    }

    public AbstractC0103d getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = AbstractC0103d.m276h(this, this);
        }
        return this.mDelegate;
    }

    public ActionBar getSupportActionBar() {
        return getDelegate().mo223n();
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        getDelegate().mo225p();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        getDelegate().mo224o();
        super.onCreate(bundle);
        getDelegate().mo229r(bundle);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        getDelegate().mo239x();
    }

    @Override // androidx.appcompat.app.InterfaceC0102c
    public void onSupportActionModeFinished(AbstractC2620b abstractC2620b) {
    }

    @Override // androidx.appcompat.app.InterfaceC0102c
    public void onSupportActionModeStarted(AbstractC2620b abstractC2620b) {
    }

    @Override // androidx.appcompat.app.InterfaceC0102c
    public AbstractC2620b onWindowStartingSupportActionMode(AbstractC2620b.a aVar) {
        return null;
    }

    @Override // android.app.Dialog
    public void setContentView(int i4) {
        getDelegate().mo191B(i4);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().mo198H(charSequence);
    }

    boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean supportRequestWindowFeature(int i4) {
        return getDelegate().mo190A(i4);
    }

    public DialogC0104e(Context context, int i4) {
        super(context, getThemeResId(context, i4));
        this.mKeyDispatcher = new a();
        AbstractC0103d delegate = getDelegate();
        delegate.mo196G(getThemeResId(context, i4));
        delegate.mo229r(null);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        getDelegate().mo193C(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().mo194D(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i4) {
        super.setTitle(i4);
        getDelegate().mo198H(getContext().getString(i4));
    }

    protected DialogC0104e(Context context, boolean z3, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z3, onCancelListener);
        this.mKeyDispatcher = new a();
    }
}
