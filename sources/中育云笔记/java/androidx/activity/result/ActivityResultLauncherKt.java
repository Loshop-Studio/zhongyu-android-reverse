package androidx.activity.result;

import androidx.core.app.ActivityOptionsCompat;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class ActivityResultLauncherKt {
    public static final void launch(ActivityResultLauncher<Void> activityResultLauncher, ActivityOptionsCompat activityOptionsCompat) {
        AbstractC9979u.m20294g(activityResultLauncher, "<this>");
        activityResultLauncher.launch(null, activityOptionsCompat);
    }

    public static /* synthetic */ void launch$default(ActivityResultLauncher activityResultLauncher, ActivityOptionsCompat activityOptionsCompat, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            activityOptionsCompat = null;
        }
        launch(activityResultLauncher, activityOptionsCompat);
    }

    public static final void launchUnit(ActivityResultLauncher<C10786q> activityResultLauncher, ActivityOptionsCompat activityOptionsCompat) {
        AbstractC9979u.m20294g(activityResultLauncher, "<this>");
        activityResultLauncher.launch(C10786q.f26013a, activityOptionsCompat);
    }

    public static /* synthetic */ void launchUnit$default(ActivityResultLauncher activityResultLauncher, ActivityOptionsCompat activityOptionsCompat, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            activityOptionsCompat = null;
        }
        launchUnit(activityResultLauncher, activityOptionsCompat);
    }
}
