package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10793c0;

@ExperimentalWindowApi
/* loaded from: classes3.dex */
public final class SplitPairFilter {
    private final ComponentName primaryActivityName;
    private final String secondaryActivityIntentAction;
    private final ComponentName secondaryActivityName;

    public SplitPairFilter(ComponentName primaryActivityName, ComponentName secondaryActivityName, String str) {
        String str2;
        boolean z10;
        int i10;
        Object obj;
        AbstractC9979u.m20294g(primaryActivityName, "primaryActivityName");
        AbstractC9979u.m20294g(secondaryActivityName, "secondaryActivityName");
        this.primaryActivityName = primaryActivityName;
        this.secondaryActivityName = secondaryActivityName;
        this.secondaryActivityIntentAction = str;
        String packageName = primaryActivityName.getPackageName();
        AbstractC9979u.m20293f(packageName, "primaryActivityName.packageName");
        String className = primaryActivityName.getClassName();
        AbstractC9979u.m20293f(className, "primaryActivityName.className");
        String packageName2 = secondaryActivityName.getPackageName();
        AbstractC9979u.m20293f(packageName2, "secondaryActivityName.packageName");
        String className2 = secondaryActivityName.getClassName();
        AbstractC9979u.m20293f(className2, "secondaryActivityName.className");
        if (packageName.length() == 0 || packageName2.length() == 0) {
            throw new IllegalArgumentException("Package name must not be empty");
        }
        if (className.length() == 0 || className2.length() == 0) {
            throw new IllegalArgumentException("Activity class name must not be empty.");
        }
        if (AbstractC10793c0.m23108U(packageName, "*", false, 2, null) && AbstractC10793c0.m23130f0(packageName, "*", 0, false, 6, null) != packageName.length() - 1) {
            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.");
        }
        if (AbstractC10793c0.m23108U(className, "*", false, 2, null)) {
            str2 = "Wildcard in package name is only allowed at the end.";
            if (AbstractC10793c0.m23130f0(className, "*", 0, false, 6, null) != className.length() - 1) {
                throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.");
            }
        } else {
            str2 = "Wildcard in package name is only allowed at the end.";
        }
        if (AbstractC10793c0.m23108U(packageName2, "*", false, 2, null)) {
            i10 = 2;
            obj = null;
            z10 = false;
            if (AbstractC10793c0.m23130f0(packageName2, "*", 0, false, 6, null) != packageName2.length() - 1) {
                throw new IllegalArgumentException(str2);
            }
        } else {
            z10 = false;
            i10 = 2;
            obj = null;
        }
        if (AbstractC10793c0.m23108U(className2, "*", z10, i10, obj) && AbstractC10793c0.m23130f0(className2, "*", 0, false, 6, null) != className2.length() - 1) {
            throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitPairFilter)) {
            return false;
        }
        SplitPairFilter splitPairFilter = (SplitPairFilter) obj;
        return AbstractC9979u.m20289b(this.primaryActivityName, splitPairFilter.primaryActivityName) && AbstractC9979u.m20289b(this.secondaryActivityName, splitPairFilter.secondaryActivityName) && AbstractC9979u.m20289b(this.secondaryActivityIntentAction, splitPairFilter.secondaryActivityIntentAction);
    }

    public final ComponentName getPrimaryActivityName() {
        return this.primaryActivityName;
    }

    public final String getSecondaryActivityIntentAction() {
        return this.secondaryActivityIntentAction;
    }

    public final ComponentName getSecondaryActivityName() {
        return this.secondaryActivityName;
    }

    public int hashCode() {
        int iHashCode = ((this.primaryActivityName.hashCode() * 31) + this.secondaryActivityName.hashCode()) * 31;
        String str = this.secondaryActivityIntentAction;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean matchesActivityIntentPair(Activity primaryActivity, Intent secondaryActivityIntent) {
        AbstractC9979u.m20294g(primaryActivity, "primaryActivity");
        AbstractC9979u.m20294g(secondaryActivityIntent, "secondaryActivityIntent");
        ComponentName componentName = primaryActivity.getComponentName();
        MatcherUtils matcherUtils = MatcherUtils.INSTANCE;
        if (!matcherUtils.areComponentsMatching$window_release(componentName, this.primaryActivityName) || !matcherUtils.areComponentsMatching$window_release(secondaryActivityIntent.getComponent(), this.secondaryActivityName)) {
            return false;
        }
        String str = this.secondaryActivityIntentAction;
        return str == null || AbstractC9979u.m20289b(str, secondaryActivityIntent.getAction());
    }

    public final boolean matchesActivityPair(Activity primaryActivity, Activity secondaryActivity) {
        AbstractC9979u.m20294g(primaryActivity, "primaryActivity");
        AbstractC9979u.m20294g(secondaryActivity, "secondaryActivity");
        MatcherUtils matcherUtils = MatcherUtils.INSTANCE;
        boolean z10 = matcherUtils.areComponentsMatching$window_release(primaryActivity.getComponentName(), this.primaryActivityName) && matcherUtils.areComponentsMatching$window_release(secondaryActivity.getComponentName(), this.secondaryActivityName);
        if (secondaryActivity.getIntent() == null) {
            return z10;
        }
        if (z10) {
            Intent intent = secondaryActivity.getIntent();
            AbstractC9979u.m20293f(intent, "secondaryActivity.intent");
            if (matchesActivityIntentPair(primaryActivity, intent)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "SplitPairFilter{primaryActivityName=" + this.primaryActivityName + ", secondaryActivityName=" + this.secondaryActivityName + ", secondaryActivityAction=" + ((Object) this.secondaryActivityIntentAction) + '}';
    }
}
