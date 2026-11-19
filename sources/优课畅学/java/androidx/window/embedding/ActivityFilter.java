package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.jvm.internal.AbstractC9133u;
import org.slf4j.Marker;
import p113g8.AbstractC8661c0;

@ExperimentalWindowApi
/* loaded from: classes3.dex */
public final class ActivityFilter {
    private final ComponentName componentName;
    private final String intentAction;

    public ActivityFilter(ComponentName componentName, String str) {
        AbstractC9133u.m16133g(componentName, "componentName");
        this.componentName = componentName;
        this.intentAction = str;
        String packageName = componentName.getPackageName();
        AbstractC9133u.m16132f(packageName, "componentName.packageName");
        String className = componentName.getClassName();
        AbstractC9133u.m16132f(className, "componentName.className");
        if (packageName.length() <= 0) {
            throw new IllegalArgumentException("Package name must not be empty");
        }
        if (className.length() <= 0) {
            throw new IllegalArgumentException("Activity class name must not be empty.");
        }
        if (AbstractC8661c0.m13973S(packageName, Marker.ANY_MARKER, false, 2, null) && AbstractC8661c0.m13991f0(packageName, Marker.ANY_MARKER, 0, false, 6, null) != packageName.length() - 1) {
            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.");
        }
        if (AbstractC8661c0.m13973S(className, Marker.ANY_MARKER, false, 2, null) && AbstractC8661c0.m13991f0(className, Marker.ANY_MARKER, 0, false, 6, null) != className.length() - 1) {
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
        return AbstractC9133u.m16128b(this.componentName, activityFilter.componentName) && AbstractC9133u.m16128b(this.intentAction, activityFilter.intentAction);
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
        AbstractC9133u.m16133g(activity, "activity");
        if (!MatcherUtils.INSTANCE.areActivityOrIntentComponentsMatching$window_release(activity, this.componentName)) {
            return false;
        }
        String str = this.intentAction;
        if (str == null) {
            return true;
        }
        Intent intent = activity.getIntent();
        return AbstractC9133u.m16128b(str, intent == null ? null : intent.getAction());
    }

    public final boolean matchesIntent(Intent intent) {
        AbstractC9133u.m16133g(intent, "intent");
        if (!MatcherUtils.INSTANCE.areComponentsMatching$window_release(intent.getComponent(), this.componentName)) {
            return false;
        }
        String str = this.intentAction;
        return str == null || AbstractC9133u.m16128b(str, intent.getAction());
    }

    public String toString() {
        return "ActivityFilter(componentName=" + this.componentName + ", intentAction=" + ((Object) this.intentAction) + ')';
    }
}
