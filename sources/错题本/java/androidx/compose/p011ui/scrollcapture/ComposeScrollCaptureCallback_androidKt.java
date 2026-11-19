package androidx.compose.p011ui.scrollcapture;

import android.os.CancellationSignal;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.C5976k1;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.InterfaceC6013w0;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aD\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Landroid/os/CancellationSignal;", "signal", "Lkotlin/Function2;", "Lh6/c;", "Ld6/s;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lkotlinx/coroutines/w0;", "launchWithCancellationSignal", "(Lkotlinx/coroutines/v;Landroid/os/CancellationSignal;Lr6/e;)Lkotlinx/coroutines/w0;", "", "DEBUG", "Z", "", "TAG", "Ljava/lang/String;", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class ComposeScrollCaptureCallback_androidKt {
    private static final boolean DEBUG = false;

    @NotNull
    private static final String TAG = "ScrollCapture";

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6013w0 launchWithCancellationSignal(InterfaceC6009v interfaceC6009v, final CancellationSignal cancellationSignal, InterfaceC6473e interfaceC6473e) {
        final C5976k1 c5976k1M5651v = AbstractC6014x.m5651v(interfaceC6009v, null, null, interfaceC6473e, 3);
        c5976k1M5651v.mo5459h(new InterfaceC6471c() { // from class: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback_androidKt.launchWithCancellationSignal.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C5443s.f8405a;
            }

            public final void invoke(Throwable th) {
                if (th != null) {
                    cancellationSignal.cancel();
                }
            }
        });
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.compose.ui.scrollcapture.a
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                c5976k1M5651v.cancel(null);
            }
        });
        return c5976k1M5651v;
    }
}
