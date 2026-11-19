package androidx.compose.p014ui.platform;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Lambda;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class AndroidComposeView$snapshotObserver$1 extends Lambda implements InterfaceC9540l {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$snapshotObserver$1(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    @Override // p181hd.InterfaceC9540l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InterfaceC9529a) obj);
        return C10786q.f26013a;
    }

    public final void invoke(final InterfaceC9529a interfaceC9529a) {
        Handler handler = this.this$0.getHandler();
        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
            interfaceC9529a.invoke();
            return;
        }
        Handler handler2 = this.this$0.getHandler();
        if (handler2 != null) {
            handler2.post(new Runnable() { // from class: androidx.compose.ui.platform.f
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC9529a.invoke();
                }
            });
        }
    }
}
