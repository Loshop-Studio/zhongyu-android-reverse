package androidx.compose.p013ui.scrollcapture;

import android.os.CancellationSignal;
import kotlinx.coroutines.InterfaceC9212n;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public final class ComposeScrollCaptureCallback_androidKt {
    private static final boolean DEBUG = false;
    private static final String TAG = "ScrollCapture";

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC9212n launchWithCancellationSignal(InterfaceC8822b0 interfaceC8822b0, final CancellationSignal cancellationSignal, InterfaceC10574p interfaceC10574p) {
        final InterfaceC9212n interfaceC9212nM14861d = AbstractC8839h.m14861d(interfaceC8822b0, null, null, interfaceC10574p, 3, null);
        interfaceC9212nM14861d.mo16287k(new InterfaceC10570l() { // from class: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback_androidKt.launchWithCancellationSignal.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C8736p.f16368a;
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
                InterfaceC9212n.a.m16777a(interfaceC9212nM14861d, null, 1, null);
            }
        });
        return interfaceC9212nM14861d;
    }
}
