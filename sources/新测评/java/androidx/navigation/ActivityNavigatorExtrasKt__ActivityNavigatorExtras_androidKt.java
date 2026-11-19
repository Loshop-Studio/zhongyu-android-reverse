package androidx.navigation;

import androidx.core.app.ActivityOptionsCompat;
import androidx.navigation.ActivityNavigator;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m13558d2 = {"ActivityNavigatorExtras", "Landroidx/navigation/ActivityNavigator$Extras;", "activityOptions", "Landroidx/core/app/ActivityOptionsCompat;", "flags", "", "navigation-runtime_release"}, m13559k = 5, m13560mv = {2, 0, 0}, m13562xi = 48, m13563xs = "androidx/navigation/ActivityNavigatorExtrasKt")
/* loaded from: classes3.dex */
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
