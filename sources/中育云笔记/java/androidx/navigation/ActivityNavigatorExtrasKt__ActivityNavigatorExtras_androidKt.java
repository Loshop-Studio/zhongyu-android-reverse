package androidx.navigation;

import androidx.core.app.ActivityOptionsCompat;
import androidx.navigation.ActivityNavigator;

/* loaded from: classes.dex */
final /* synthetic */ class ActivityNavigatorExtrasKt__ActivityNavigatorExtras_androidKt {
    public static final ActivityNavigator.Extras ActivityNavigatorExtras(ActivityOptionsCompat activityOptionsCompat, int i10) {
        ActivityNavigator.Extras.Builder builder = new ActivityNavigator.Extras.Builder();
        if (activityOptionsCompat != null) {
            builder.setActivityOptions(activityOptionsCompat);
        }
        builder.addFlags(i10);
        return builder.build();
    }

    public static /* synthetic */ ActivityNavigator.Extras ActivityNavigatorExtras$default(ActivityOptionsCompat activityOptionsCompat, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            activityOptionsCompat = null;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return ActivityNavigatorExtrasKt.ActivityNavigatorExtras(activityOptionsCompat, i10);
    }
}
