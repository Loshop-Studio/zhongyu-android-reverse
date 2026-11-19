package androidx.compose.p014ui.scrollcapture;

import android.os.CancellationSignal;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;

/* loaded from: classes2.dex */
public final class ComposeScrollCaptureCallback_androidKt {
    private static final boolean DEBUG = false;
    private static final String TAG = "ScrollCapture";

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC10045g launchWithCancellationSignal(InterfaceC11122i0 interfaceC11122i0, final CancellationSignal cancellationSignal, InterfaceC9544p interfaceC9544p) {
        final InterfaceC10045g interfaceC10045gM24726d = AbstractC11117h.m24726d(interfaceC11122i0, null, null, interfaceC9544p, 3, null);
        interfaceC10045gM24726d.mo20404A(new InterfaceC9540l() { // from class: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback_androidKt.launchWithCancellationSignal.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C10786q.f26013a;
            }

            public final void invoke(Throwable th) {
                if (th != null) {
                    cancellationSignal.cancel();
                }
            }
        });
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.compose.ui.scrollcapture.c
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                InterfaceC10045g.a.m20900a(interfaceC10045gM24726d, null, 1, null);
            }
        });
        return interfaceC10045gM24726d;
    }
}
