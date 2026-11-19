package p162t;

import android.view.ViewTreeObserver;
import kotlin.Result;
import kotlinx.coroutines.C5961g;

/* renamed from: t.i */
/* loaded from: classes2.dex */
public final class ViewTreeObserverOnPreDrawListenerC6579i implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public boolean f10984a;

    /* renamed from: b */
    public final /* synthetic */ C6575e f10985b;

    /* renamed from: c */
    public final /* synthetic */ ViewTreeObserver f10986c;

    /* renamed from: d */
    public final /* synthetic */ C5961g f10987d;

    public ViewTreeObserverOnPreDrawListenerC6579i(C6575e c6575e, ViewTreeObserver viewTreeObserver, C5961g c5961g) {
        this.f10985b = c6575e;
        this.f10986c = viewTreeObserver;
        this.f10987d = c5961g;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C6575e c6575e = this.f10985b;
        C6576f c6576fM6216c = c6575e.m6216c();
        if (c6576fM6216c != null) {
            ViewTreeObserver viewTreeObserver = this.f10986c;
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            } else {
                c6575e.f10976a.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            if (!this.f10984a) {
                this.f10984a = true;
                this.f10987d.resumeWith(Result.m13956constructorimpl(c6576fM6216c));
            }
        }
        return true;
    }
}
