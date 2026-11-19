package androidx.window.embedding;

import android.app.Activity;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.jvm.internal.AbstractC9979u;

@ExperimentalWindowApi
/* loaded from: classes3.dex */
public final class SplitInfo {
    private final ActivityStack primaryActivityStack;
    private final ActivityStack secondaryActivityStack;
    private final float splitRatio;

    public SplitInfo(ActivityStack primaryActivityStack, ActivityStack secondaryActivityStack, float f10) {
        AbstractC9979u.m20294g(primaryActivityStack, "primaryActivityStack");
        AbstractC9979u.m20294g(secondaryActivityStack, "secondaryActivityStack");
        this.primaryActivityStack = primaryActivityStack;
        this.secondaryActivityStack = secondaryActivityStack;
        this.splitRatio = f10;
    }

    public final boolean contains(Activity activity) {
        AbstractC9979u.m20294g(activity, "activity");
        return this.primaryActivityStack.contains(activity) || this.secondaryActivityStack.contains(activity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitInfo)) {
            return false;
        }
        SplitInfo splitInfo = (SplitInfo) obj;
        return AbstractC9979u.m20289b(this.primaryActivityStack, splitInfo.primaryActivityStack) && AbstractC9979u.m20289b(this.secondaryActivityStack, splitInfo.secondaryActivityStack) && this.splitRatio == splitInfo.splitRatio;
    }

    public final ActivityStack getPrimaryActivityStack() {
        return this.primaryActivityStack;
    }

    public final ActivityStack getSecondaryActivityStack() {
        return this.secondaryActivityStack;
    }

    public final float getSplitRatio() {
        return this.splitRatio;
    }

    public int hashCode() {
        return (((this.primaryActivityStack.hashCode() * 31) + this.secondaryActivityStack.hashCode()) * 31) + Float.hashCode(this.splitRatio);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SplitInfo:{");
        sb2.append("primaryActivityStack=" + getPrimaryActivityStack() + ',');
        sb2.append("secondaryActivityStack=" + getSecondaryActivityStack() + ',');
        sb2.append("splitRatio=" + getSplitRatio() + '}');
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
