package androidx.compose.p011ui.viewinterop;

import p152r6.InterfaceC6469a;

/* renamed from: androidx.compose.ui.viewinterop.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2340a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f938a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC6469a f939b;

    public /* synthetic */ RunnableC2340a(InterfaceC6469a interfaceC6469a, int i) {
        this.f938a = i;
        this.f939b = interfaceC6469a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f938a) {
            case 0:
                this.f939b.invoke();
                break;
            default:
                this.f939b.invoke();
                break;
        }
    }
}
