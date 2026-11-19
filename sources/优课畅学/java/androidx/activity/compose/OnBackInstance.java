package androidx.activity.compose;

import androidx.activity.BackEventCompat;
import androidx.activity.OnBackPressedCallback;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.InterfaceC9212n;
import kotlinx.coroutines.channels.AbstractC9159b;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.InterfaceC9158a;
import kotlinx.coroutines.channels.InterfaceC9163f;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p300x7.InterfaceC10574p;

/* loaded from: classes.dex */
final class OnBackInstance {
    private final InterfaceC9158a channel = AbstractC9159b.m16529b(-2, BufferOverflow.f17603a, null, 4, null);
    private boolean isPredictiveBack;
    private final InterfaceC9212n job;

    public OnBackInstance(InterfaceC8822b0 interfaceC8822b0, boolean z10, InterfaceC10574p interfaceC10574p, OnBackPressedCallback onBackPressedCallback) {
        this.isPredictiveBack = z10;
        this.job = AbstractC8839h.m14861d(interfaceC8822b0, null, null, new OnBackInstance$job$1(onBackPressedCallback, interfaceC10574p, this, null), 3, null);
    }

    public final void cancel() {
        this.channel.cancel(new CancellationException("onBack cancelled"));
        InterfaceC9212n.a.m16777a(this.job, null, 1, null);
    }

    public final boolean close() {
        return InterfaceC9163f.a.m16549a(this.channel, null, 1, null);
    }

    public final InterfaceC9158a getChannel() {
        return this.channel;
    }

    public final InterfaceC9212n getJob() {
        return this.job;
    }

    public final boolean isPredictiveBack() {
        return this.isPredictiveBack;
    }

    /* renamed from: send-JP2dKIU, reason: not valid java name */
    public final Object m20104sendJP2dKIU(BackEventCompat backEventCompat) {
        return this.channel.mo27213trySendJP2dKIU(backEventCompat);
    }

    public final void setPredictiveBack(boolean z10) {
        this.isPredictiveBack = z10;
    }
}
