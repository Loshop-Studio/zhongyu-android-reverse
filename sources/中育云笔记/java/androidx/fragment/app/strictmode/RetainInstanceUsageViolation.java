package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public abstract class RetainInstanceUsageViolation extends Violation {
    public /* synthetic */ RetainInstanceUsageViolation(Fragment fragment, String str, int i10, AbstractC9972n abstractC9972n) {
        this(fragment, (i10 & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetainInstanceUsageViolation(Fragment fragment, String str) {
        super(fragment, str);
        AbstractC9979u.m20294g(fragment, "fragment");
    }
}
