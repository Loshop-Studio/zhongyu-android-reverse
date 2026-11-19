package p070b.p074b.p075a.p076a.p095q;

import android.view.ViewTreeObserver;

/* renamed from: b.b.a.a.q.f */
/* loaded from: classes.dex */
public class ViewTreeObserverOnPreDrawListenerC0643f implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b */
    public final /* synthetic */ C0641d f3875b;

    public ViewTreeObserverOnPreDrawListenerC0643f(C0641d c0641d) {
        this.f3875b = c0641d;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        C0641d c0641d = this.f3875b;
        float rotation = c0641d.f3860s.getRotation();
        if (c0641d.f3854m == rotation) {
            return true;
        }
        c0641d.f3854m = rotation;
        c0641d.mo2236s();
        return true;
    }
}
