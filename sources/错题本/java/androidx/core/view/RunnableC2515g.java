package androidx.core.view;

import android.view.View;
import androidx.core.view.SoftwareKeyboardControllerCompat;
import p152r6.InterfaceC6469a;

/* renamed from: androidx.core.view.g */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2515g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f1054a;

    /* renamed from: b */
    public final /* synthetic */ Object f1055b;

    public /* synthetic */ RunnableC2515g(Object obj, int i) {
        this.f1054a = i;
        this.f1055b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1054a) {
            case 0:
                SoftwareKeyboardControllerCompat.Impl20.lambda$show$0((View) this.f1055b);
                break;
            default:
                ((InterfaceC6469a) this.f1055b).invoke();
                break;
        }
    }
}
