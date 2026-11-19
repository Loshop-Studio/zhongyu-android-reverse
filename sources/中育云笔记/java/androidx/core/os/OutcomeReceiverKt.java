package androidx.core.os;

import android.p013os.OutcomeReceiver;
import androidx.annotation.RequiresApi;
import vc.InterfaceC11588c;

@RequiresApi(31)
/* loaded from: classes2.dex */
public final class OutcomeReceiverKt {
    @RequiresApi(31)
    public static final <R, E extends Throwable> OutcomeReceiver asOutcomeReceiver(InterfaceC11588c<? super R> interfaceC11588c) {
        return AbstractC3452b.m1564a(new ContinuationOutcomeReceiver(interfaceC11588c));
    }
}
