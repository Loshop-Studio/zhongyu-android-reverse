package androidx.activity.result;

import android.content.Intent;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
public final class ActivityResultKt {
    public static final int component1(ActivityResult activityResult) {
        AbstractC9979u.m20294g(activityResult, "<this>");
        return activityResult.getResultCode();
    }

    public static final Intent component2(ActivityResult activityResult) {
        AbstractC9979u.m20294g(activityResult, "<this>");
        return activityResult.getData();
    }
}
