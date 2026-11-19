package androidx.compose.runtime.changelist;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public abstract class OperationsDebugStringFormattable {
    public static final int $stable = 0;

    public static /* synthetic */ String toDebugString$default(OperationsDebugStringFormattable operationsDebugStringFormattable, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toDebugString");
        }
        if ((i10 & 1) != 0) {
            str = "  ";
        }
        return operationsDebugStringFormattable.toDebugString(str);
    }

    public abstract String toDebugString(String str);
}
