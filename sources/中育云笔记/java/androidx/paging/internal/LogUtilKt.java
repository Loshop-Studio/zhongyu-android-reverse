package androidx.paging.internal;

import androidx.annotation.RestrictTo;
import androidx.paging.LoadStates;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p310qd.AbstractC10812s;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public final class LogUtilKt {
    public static final String appendMediatorStatesIfNotNull(LoadStates loadStates, InterfaceC9529a log) {
        AbstractC9979u.m20294g(log, "log");
        String str = (String) log.invoke();
        if (loadStates != null) {
            str = str + "|   mediatorLoadStates: " + loadStates + '\n';
        }
        return AbstractC10812s.m23223p(str + "|)", null, 1, null);
    }
}
