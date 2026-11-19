package p181v1;

import com.xuexiang.xui.widget.XUIKeyboardScrollView;

/* renamed from: v1.a */
/* loaded from: classes3.dex */
public final class RunnableC6665a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f11245a;

    /* renamed from: b */
    public final /* synthetic */ XUIKeyboardScrollView f11246b;

    public /* synthetic */ RunnableC6665a(XUIKeyboardScrollView xUIKeyboardScrollView, int i) {
        this.f11245a = i;
        this.f11246b = xUIKeyboardScrollView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11245a) {
            case 0:
                XUIKeyboardScrollView xUIKeyboardScrollView = this.f11246b;
                xUIKeyboardScrollView.smoothScrollTo(0, xUIKeyboardScrollView.getScrollY() + xUIKeyboardScrollView.f3977b);
                break;
            default:
                this.f11246b.smoothScrollTo(0, 0);
                break;
        }
    }
}
