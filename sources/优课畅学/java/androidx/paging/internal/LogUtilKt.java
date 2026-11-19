package androidx.paging.internal;

import androidx.annotation.RestrictTo;
import androidx.paging.LoadStates;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8680s;
import p300x7.InterfaceC10559a;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public final class LogUtilKt {
    public static final String appendMediatorStatesIfNotNull(LoadStates loadStates, InterfaceC10559a log) {
        AbstractC9133u.m16133g(log, "log");
        String str = (String) log.invoke();
        if (loadStates != null) {
            str = str + "|   mediatorLoadStates: " + loadStates + '\n';
        }
        return AbstractC8680s.m14088p(str + "|)", null, 1, null);
    }
}
