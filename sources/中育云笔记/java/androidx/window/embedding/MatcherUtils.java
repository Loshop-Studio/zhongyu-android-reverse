package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10793c0;
import p310qd.AbstractC10819z;

@ExperimentalWindowApi
/* loaded from: classes3.dex */
public final class MatcherUtils {
    public static final MatcherUtils INSTANCE = new MatcherUtils();
    public static final boolean sDebugMatchers = false;
    public static final String sMatchersTag = "SplitRuleResolution";

    private MatcherUtils() {
    }

    private final boolean wildcardMatch(String str, String str2) {
        if (!AbstractC10793c0.m23108U(str2, "*", false, 2, null)) {
            return false;
        }
        if (AbstractC9979u.m20289b(str2, "*")) {
            return true;
        }
        if (AbstractC10793c0.m23130f0(str2, "*", 0, false, 6, null) != AbstractC10793c0.m23136l0(str2, "*", 0, false, 6, null) || !AbstractC10819z.m23229B(str2, "*", false, 2, null)) {
            throw new IllegalArgumentException("Name pattern with a wildcard must only contain a single wildcard in the end");
        }
        String strSubstring = str2.substring(0, str2.length() - 1);
        AbstractC9979u.m20293f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return AbstractC10819z.m23242O(str, strSubstring, false, 2, null);
    }

    public final boolean areActivityOrIntentComponentsMatching$window_release(Activity activity, ComponentName ruleComponent) {
        ComponentName component;
        AbstractC9979u.m20294g(activity, "activity");
        AbstractC9979u.m20294g(ruleComponent, "ruleComponent");
        if (areComponentsMatching$window_release(activity.getComponentName(), ruleComponent)) {
            return true;
        }
        Intent intent = activity.getIntent();
        if (intent == null || (component = intent.getComponent()) == null) {
            return false;
        }
        return INSTANCE.areComponentsMatching$window_release(component, ruleComponent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean areComponentsMatching$window_release(android.content.ComponentName r7, android.content.ComponentName r8) {
        /*
            r6 = this;
            java.lang.String r0 = "ruleComponent"
            kotlin.jvm.internal.AbstractC9979u.m20294g(r8, r0)
            java.lang.String r0 = "*"
            r1 = 1
            r2 = 0
            if (r7 != 0) goto L21
            java.lang.String r7 = r8.getPackageName()
            boolean r7 = kotlin.jvm.internal.AbstractC9979u.m20289b(r7, r0)
            if (r7 == 0) goto L20
            java.lang.String r7 = r8.getClassName()
            boolean r7 = kotlin.jvm.internal.AbstractC9979u.m20289b(r7, r0)
            if (r7 == 0) goto L20
            return r1
        L20:
            return r2
        L21:
            java.lang.String r3 = r7.toString()
            java.lang.String r4 = "activityComponent.toString()"
            kotlin.jvm.internal.AbstractC9979u.m20293f(r3, r4)
            r4 = 2
            r5 = 0
            boolean r0 = p310qd.AbstractC10793c0.m23108U(r3, r0, r2, r4, r5)
            if (r0 != 0) goto L8c
            java.lang.String r0 = r7.getPackageName()
            java.lang.String r3 = r8.getPackageName()
            boolean r0 = kotlin.jvm.internal.AbstractC9979u.m20289b(r0, r3)
            if (r0 != 0) goto L5b
            java.lang.String r0 = r7.getPackageName()
            java.lang.String r3 = "activityComponent.packageName"
            kotlin.jvm.internal.AbstractC9979u.m20293f(r0, r3)
            java.lang.String r3 = r8.getPackageName()
            java.lang.String r4 = "ruleComponent.packageName"
            kotlin.jvm.internal.AbstractC9979u.m20293f(r3, r4)
            boolean r0 = r6.wildcardMatch(r0, r3)
            if (r0 == 0) goto L59
            goto L5b
        L59:
            r0 = r2
            goto L5c
        L5b:
            r0 = r1
        L5c:
            java.lang.String r3 = r7.getClassName()
            java.lang.String r4 = r8.getClassName()
            boolean r3 = kotlin.jvm.internal.AbstractC9979u.m20289b(r3, r4)
            if (r3 != 0) goto L85
            java.lang.String r7 = r7.getClassName()
            java.lang.String r3 = "activityComponent.className"
            kotlin.jvm.internal.AbstractC9979u.m20293f(r7, r3)
            java.lang.String r8 = r8.getClassName()
            java.lang.String r3 = "ruleComponent.className"
            kotlin.jvm.internal.AbstractC9979u.m20293f(r8, r3)
            boolean r7 = r6.wildcardMatch(r7, r8)
            if (r7 == 0) goto L83
            goto L85
        L83:
            r7 = r2
            goto L86
        L85:
            r7 = r1
        L86:
            if (r0 == 0) goto L8b
            if (r7 == 0) goto L8b
            return r1
        L8b:
            return r2
        L8c:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Wildcard can only be part of the rule."
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.embedding.MatcherUtils.areComponentsMatching$window_release(android.content.ComponentName, android.content.ComponentName):boolean");
    }
}
