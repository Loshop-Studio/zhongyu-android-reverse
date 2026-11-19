package p070b.p074b.p075a.p076a.p104z;

import android.widget.AutoCompleteTextView;

/* renamed from: b.b.a.a.z.k */
/* loaded from: classes.dex */
public class C0699k implements AutoCompleteTextView.OnDismissListener {

    /* renamed from: a */
    public final /* synthetic */ C0696h f4158a;

    public C0699k(C0696h c0696h) {
        this.f4158a = c0696h;
    }

    @Override // android.widget.AutoCompleteTextView.OnDismissListener
    public void onDismiss() {
        C0696h c0696h = this.f4158a;
        c0696h.f4139i = true;
        c0696h.f4141k = System.currentTimeMillis();
        C0696h.m2333f(this.f4158a, false);
    }
}
