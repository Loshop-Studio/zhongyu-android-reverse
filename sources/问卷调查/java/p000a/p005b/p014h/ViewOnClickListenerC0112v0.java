package p000a.p005b.p014h;

import android.R;
import android.view.View;
import android.view.Window;
import p000a.p005b.p012g.p013i.C0048a;

/* renamed from: a.b.h.v0 */
/* loaded from: classes.dex */
public class ViewOnClickListenerC0112v0 implements View.OnClickListener {

    /* renamed from: b */
    public final C0048a f815b;

    /* renamed from: c */
    public final /* synthetic */ C0114w0 f816c;

    public ViewOnClickListenerC0112v0(C0114w0 c0114w0) {
        this.f816c = c0114w0;
        this.f815b = new C0048a(c0114w0.f822a.getContext(), 0, R.id.home, 0, c0114w0.f830i);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C0114w0 c0114w0 = this.f816c;
        Window.Callback callback = c0114w0.f833l;
        if (callback == null || !c0114w0.f834m) {
            return;
        }
        callback.onMenuItemSelected(0, this.f815b);
    }
}
