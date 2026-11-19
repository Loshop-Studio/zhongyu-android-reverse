package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10793c0;

@ExperimentalWindowApi
/* loaded from: classes3.dex */
public final class ActivityFilter {
    private final ComponentName componentName;
    private final String intentAction;

    public ActivityFilter(ComponentName componentName, String str) {
        AbstractC9979u.m20294g(componentName, "componentName");
        this.componentName = componentName;
        this.intentAction = str;
        String packageName = componentName.getPackageName();
        AbstractC9979u.m20293f(packageName, "componentName.packageName");
        String className = componentName.getClassName();
        AbstractC9979u.m20293f(className, "componentName.className");
        if (packageName.length() <= 0) {
            throw new IllegalArgumentException("Package name must not be empty");
        }
        if (className.length() <= 0) {
            throw new IllegalArgumentException("Activity class name must not be empty.");
        }
        if (AbstractC10793c0.m23108U(packageName, "*", false, 2, null) && AbstractC10793c0.m23130f0(packageName, "*", 0, false, 6, null) != packageName.length() - 1) {
            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.");
        }
        if (AbstractC10793c0.m23108U(className, "*", false, 2, null) && AbstractC10793c0.m23130f0(className, "*", 0, false, 6, null) != className.length() - 1) {
            throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityFilter)) {
            return false;
        }
        ActivityFilter activityFilter = (ActivityFilter) obj;
        return AbstractC9979u.m20289b(this.componentName, activityFilter.componentName) && AbstractC9979u.m20289b(this.intentAction, activityFilter.intentAction);
    }

    public final ComponentName getComponentName() {
        return this.componentName;
    }

    public final String getIntentAction() {
        return this.intentAction;
    }

    public int hashCode() {
        int iHashCode = this.componentName.hashCode() * 31;
        String str = this.intentAction;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean matchesActivity(Activity activity) {
        AbstractC9979u.m20294g(activity, "activity");
        if (!MatcherUtils.INSTANCE.areActivityOrIntentComponentsMatching$window_release(activity, this.componentName)) {
            return false;
        }
        String str = this.intentAction;
        if (str == null) {
            return true;
        }
        Intent intent = activity.getIntent();
        return AbstractC9979u.m20289b(str, intent == null ? null : intent.getAction());
    }

    public final boolean matchesIntent(Intent intent) {
        AbstractC9979u.m20294g(intent, "intent");
        if (!MatcherUtils.INSTANCE.areComponentsMatching$window_release(intent.getComponent(), this.componentName)) {
            return false;
        }
        String str = this.intentAction;
        return str == null || AbstractC9979u.m20289b(str, intent.getAction());
    }

    public String toString() {
        return "ActivityFilter(componentName=" + this.componentName + ", intentAction=" + ((Object) this.intentAction) + ')';
    }
}
