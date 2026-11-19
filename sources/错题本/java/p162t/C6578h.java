package p162t;

import android.view.ViewTreeObserver;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

/* renamed from: t.h */
/* loaded from: classes2.dex */
public final class C6578h implements InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ C6575e f10981a;

    /* renamed from: b */
    public final /* synthetic */ ViewTreeObserver f10982b;

    /* renamed from: c */
    public final /* synthetic */ ViewTreeObserverOnPreDrawListenerC6579i f10983c;

    public C6578h(C6575e c6575e, ViewTreeObserver viewTreeObserver, ViewTreeObserverOnPreDrawListenerC6579i viewTreeObserverOnPreDrawListenerC6579i) {
        this.f10981a = c6575e;
        this.f10982b = viewTreeObserver;
        this.f10983c = viewTreeObserverOnPreDrawListenerC6579i;
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object obj) {
        ViewTreeObserver viewTreeObserver = this.f10982b;
        boolean zIsAlive = viewTreeObserver.isAlive();
        ViewTreeObserverOnPreDrawListenerC6579i viewTreeObserverOnPreDrawListenerC6579i = this.f10983c;
        if (zIsAlive) {
            viewTreeObserver.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC6579i);
        } else {
            this.f10981a.f10976a.getViewTreeObserver().removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC6579i);
        }
        return C5443s.f8405a;
    }
}
