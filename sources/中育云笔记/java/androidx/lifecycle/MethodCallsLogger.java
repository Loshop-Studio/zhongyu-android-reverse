package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9979u;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public class MethodCallsLogger {
    private final Map<String, Integer> calledMethods = new HashMap();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean approveCall(String name, int i10) {
        AbstractC9979u.m20294g(name, "name");
        Integer num = this.calledMethods.get(name);
        int iIntValue = num != null ? num.intValue() : 0;
        boolean z10 = (iIntValue & i10) != 0;
        this.calledMethods.put(name, Integer.valueOf(i10 | iIntValue));
        return !z10;
    }
}
