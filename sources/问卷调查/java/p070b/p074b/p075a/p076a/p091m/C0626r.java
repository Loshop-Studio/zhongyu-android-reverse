package p070b.p074b.p075a.p076a.p091m;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: b.b.a.a.m.r */
/* loaded from: classes.dex */
public final class C0626r<S> extends AbstractC0632x<S> {

    /* renamed from: W */
    public InterfaceC0612d<S> f3791W;

    /* renamed from: X */
    public C0606a f3792X;

    /* renamed from: b.b.a.a.m.r$a */
    public class a extends AbstractC0631w<S> {
        public a() {
        }

        @Override // p070b.p074b.p075a.p076a.p091m.AbstractC0631w
        /* renamed from: a */
        public void mo2203a(S s) {
            Iterator<AbstractC0631w<S>> it = C0626r.this.f3814V.iterator();
            while (it.hasNext()) {
                it.next().mo2203a(s);
            }
        }
    }

    @Override // p000a.p052k.p053b.ComponentCallbacksC0320m
    /* renamed from: M */
    public void mo1114M(Bundle bundle) {
        super.mo1114M(bundle);
        if (bundle == null) {
            bundle = this.f1983h;
        }
        this.f3791W = (InterfaceC0612d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f3792X = (C0606a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // p000a.p052k.p053b.ComponentCallbacksC0320m
    /* renamed from: P */
    public View mo1143P(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f3791W.m2190g(layoutInflater, viewGroup, bundle, this.f3792X, new a());
    }

    @Override // p000a.p052k.p053b.ComponentCallbacksC0320m
    /* renamed from: b0 */
    public void mo1119b0(Bundle bundle) {
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f3791W);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f3792X);
    }
}
