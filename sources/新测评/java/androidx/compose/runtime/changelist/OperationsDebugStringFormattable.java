package androidx.compose.runtime.changelist;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0006"}, m13558d2 = {"Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "", "()V", "toDebugString", "", "linePrefix", "runtime_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
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

    public abstract String toDebugString(String linePrefix);
}
