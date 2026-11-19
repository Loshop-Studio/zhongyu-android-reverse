package androidx.window.embedding;

import android.app.Activity;
import androidx.window.core.ExperimentalWindowApi;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@ExperimentalWindowApi
/* loaded from: classes3.dex */
public final class ActivityStack {
    private final List<Activity> activities;
    private final boolean isEmpty;

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityStack(List<? extends Activity> activities, boolean z10) {
        AbstractC9979u.m20294g(activities, "activities");
        this.activities = activities;
        this.isEmpty = z10;
    }

    public final boolean contains(Activity activity) {
        AbstractC9979u.m20294g(activity, "activity");
        return this.activities.contains(activity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityStack)) {
            return false;
        }
        ActivityStack activityStack = (ActivityStack) obj;
        return (AbstractC9979u.m20289b(this.activities, activityStack.activities) || this.isEmpty == activityStack.isEmpty) ? false : true;
    }

    public final List<Activity> getActivities$window_release() {
        return this.activities;
    }

    public int hashCode() {
        return ((this.isEmpty ? 1 : 0) * 31) + this.activities.hashCode();
    }

    public final boolean isEmpty() {
        return this.isEmpty;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ActivityStack{");
        sb2.append(AbstractC9979u.m20303p("activities=", getActivities$window_release()));
        sb2.append("isEmpty=" + this.isEmpty + '}');
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public /* synthetic */ ActivityStack(List list, boolean z10, int i10, AbstractC9972n abstractC9972n) {
        this(list, (i10 & 2) != 0 ? false : z10);
    }
}
