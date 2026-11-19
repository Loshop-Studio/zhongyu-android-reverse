package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public final class SetTargetFragmentUsageViolation extends TargetFragmentUsageViolation {
    private final int requestCode;
    private final Fragment targetFragment;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetTargetFragmentUsageViolation(Fragment fragment, Fragment targetFragment, int i10) {
        super(fragment, "Attempting to set target fragment " + targetFragment + " with request code " + i10 + " for fragment " + fragment);
        AbstractC9979u.m20294g(fragment, "fragment");
        AbstractC9979u.m20294g(targetFragment, "targetFragment");
        this.targetFragment = targetFragment;
        this.requestCode = i10;
    }

    public final int getRequestCode() {
        return this.requestCode;
    }

    public final Fragment getTargetFragment() {
        return this.targetFragment;
    }
}
