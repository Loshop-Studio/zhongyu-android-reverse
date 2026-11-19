package androidx.core.os;

import android.p012os.OutcomeReceiver;
import androidx.annotation.RequiresApi;
import p179m7.InterfaceC9324c;

@RequiresApi(31)
/* loaded from: classes2.dex */
public final class OutcomeReceiverKt {
    @RequiresApi(31)
    public static final <R, E extends Throwable> OutcomeReceiver asOutcomeReceiver(InterfaceC9324c<? super R> interfaceC9324c) {
        return AbstractC3422b.m1487a(new ContinuationOutcomeReceiver(interfaceC9324c));
    }
}
