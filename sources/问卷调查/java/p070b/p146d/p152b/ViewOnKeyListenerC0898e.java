package p070b.p146d.p152b;

import android.view.KeyEvent;
import android.view.View;
import com.zykj.satisfaction.MainActivity;
import p070b.p146d.p152b.p153h.C0901a;
import p160d.p162f.p164b.C1011d;

/* renamed from: b.d.b.e */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0898e implements View.OnKeyListener {

    /* renamed from: b */
    public final /* synthetic */ MainActivity f4749b;

    public ViewOnKeyListenerC0898e(MainActivity mainActivity) {
        this.f4749b = mainActivity;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if ((keyEvent != null && keyEvent.getAction() == 0) && i == 4) {
            C0901a c0901a = this.f4749b.f5441p;
            if (c0901a == null) {
                C1011d.m2816l("binding");
                throw null;
            }
            if (c0901a.f4753b.canGoBack()) {
                C0901a c0901a2 = this.f4749b.f5441p;
                if (c0901a2 != null) {
                    c0901a2.f4753b.goBack();
                    return true;
                }
                C1011d.m2816l("binding");
                throw null;
            }
        }
        return false;
    }
}
