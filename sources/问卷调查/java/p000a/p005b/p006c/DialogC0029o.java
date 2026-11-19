package p000a.p005b.p006c;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import io.github.inflationx.calligraphy3.C1088R;
import java.lang.ref.WeakReference;
import p000a.p005b.p012g.AbstractC0040a;
import p000a.p021e.C0131c;
import p000a.p031h.p043j.C0256e;

/* renamed from: a.b.c.o */
/* loaded from: classes.dex */
public class DialogC0029o extends Dialog implements InterfaceC0022h {

    /* renamed from: b */
    public AbstractC0023i f154b;

    /* renamed from: c */
    public final C0256e.a f155c;

    /* renamed from: a.b.c.o$a */
    public class a implements C0256e.a {
        public a() {
        }

        @Override // p000a.p031h.p043j.C0256e.a
        /* renamed from: i */
        public boolean mo100i(KeyEvent keyEvent) {
            return DialogC0029o.this.m99c(keyEvent);
        }
    }

    public DialogC0029o(Context context, int i) {
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(C1088R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        super(context, i2);
        this.f155c = new a();
        AbstractC0023i abstractC0023iM98a = m98a();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(C1088R.attr.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        abstractC0023iM98a.mo53x(i);
        abstractC0023iM98a.mo42l(null);
    }

    /* renamed from: a */
    public AbstractC0023i m98a() {
        if (this.f154b == null) {
            C0131c<WeakReference<AbstractC0023i>> c0131c = AbstractC0023i.f63b;
            this.f154b = new LayoutInflaterFactory2C0024j(getContext(), getWindow(), this, this);
        }
        return this.f154b;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m98a().mo33c(view, layoutParams);
    }

    @Override // p000a.p005b.p006c.InterfaceC0022h
    /* renamed from: b */
    public void mo23b(AbstractC0040a abstractC0040a) {
    }

    /* renamed from: c */
    public boolean m99c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        m98a().mo43m();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C0256e.m841b(this.f155c, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // p000a.p005b.p006c.InterfaceC0022h
    /* renamed from: f */
    public void mo24f(AbstractC0040a abstractC0040a) {
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) m98a().mo35e(i);
    }

    @Override // p000a.p005b.p006c.InterfaceC0022h
    /* renamed from: h */
    public AbstractC0040a mo25h(AbstractC0040a.a aVar) {
        return null;
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        m98a().mo40j();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        m98a().mo39i();
        super.onCreate(bundle);
        m98a().mo42l(bundle);
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
        m98a().mo48r();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        m98a().mo50u(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        m98a().mo51v(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m98a().mo52w(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        m98a().mo54y(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m98a().mo54y(charSequence);
    }
}
