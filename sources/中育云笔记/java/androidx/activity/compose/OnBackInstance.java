package androidx.activity.compose;

import androidx.activity.BackEventCompat;
import androidx.activity.OnBackPressedCallback;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.InterfaceC10045g;
import kotlinx.coroutines.channels.AbstractC10001b;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.InterfaceC10000a;
import kotlinx.coroutines.channels.InterfaceC10005f;
import p181hd.InterfaceC9544p;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;

/* loaded from: classes.dex */
final class OnBackInstance {
    private final InterfaceC10000a channel = AbstractC10001b.m20722b(-2, BufferOverflow.f23519c, null, 4, null);
    private boolean isPredictiveBack;
    private final InterfaceC10045g job;

    public OnBackInstance(InterfaceC11122i0 interfaceC11122i0, boolean z10, InterfaceC9544p interfaceC9544p, OnBackPressedCallback onBackPressedCallback) {
        this.isPredictiveBack = z10;
        this.job = AbstractC11117h.m24726d(interfaceC11122i0, null, null, new OnBackInstance$job$1(onBackPressedCallback, interfaceC9544p, this, null), 3, null);
    }

    public final void cancel() {
        this.channel.cancel(new CancellationException("onBack cancelled"));
        InterfaceC10045g.a.m20900a(this.job, null, 1, null);
    }

    public final boolean close() {
        return InterfaceC10005f.a.m20742a(this.channel, null, 1, null);
    }

    public final InterfaceC10000a getChannel() {
        return this.channel;
    }

    public final InterfaceC10045g getJob() {
        return this.job;
    }

    public final boolean isPredictiveBack() {
        return this.isPredictiveBack;
    }

    /* renamed from: send-JP2dKIU, reason: not valid java name */
    public final Object m26706sendJP2dKIU(BackEventCompat backEventCompat) {
        return this.channel.mo33808trySendJP2dKIU(backEventCompat);
    }

    public final void setPredictiveBack(boolean z10) {
        this.isPredictiveBack = z10;
    }
}
