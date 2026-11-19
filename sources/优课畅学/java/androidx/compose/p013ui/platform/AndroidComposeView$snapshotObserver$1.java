package androidx.compose.p013ui.platform;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Lambda;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class AndroidComposeView$snapshotObserver$1 extends Lambda implements InterfaceC10570l {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$snapshotObserver$1(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    @Override // p300x7.InterfaceC10570l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InterfaceC10559a) obj);
        return C8736p.f16368a;
    }

    public final void invoke(final InterfaceC10559a interfaceC10559a) {
        Handler handler = this.this$0.getHandler();
        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
            interfaceC10559a.invoke();
            return;
        }
        Handler handler2 = this.this$0.getHandler();
        if (handler2 != null) {
            handler2.post(new Runnable() { // from class: androidx.compose.ui.platform.f
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC10559a.invoke();
                }
            });
        }
    }
}
