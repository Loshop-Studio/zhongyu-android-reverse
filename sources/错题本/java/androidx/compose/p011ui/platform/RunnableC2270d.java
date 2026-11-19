package androidx.compose.p011ui.platform;

import p152r6.InterfaceC6469a;

/* renamed from: androidx.compose.ui.platform.d */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2270d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f915a;

    /* renamed from: b */
    public final /* synthetic */ Object f916b;

    public /* synthetic */ RunnableC2270d(Object obj, int i) {
        this.f915a = i;
        this.f916b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f915a) {
            case 0:
                ((InterfaceC6469a) this.f916b).invoke();
                break;
            case 1:
                AndroidComposeView.sendHoverExitEvent$lambda$10((AndroidComposeView) this.f916b);
                break;
            default:
                AndroidComposeViewAccessibilityDelegateCompat.semanticsChangeChecker$lambda$37((AndroidComposeViewAccessibilityDelegateCompat) this.f916b);
                break;
        }
    }
}
