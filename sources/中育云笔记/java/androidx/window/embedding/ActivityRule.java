package androidx.window.embedding;

import androidx.window.core.ExperimentalWindowApi;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10947g0;

@ExperimentalWindowApi
/* loaded from: classes3.dex */
public final class ActivityRule extends EmbeddingRule {
    private final boolean alwaysExpand;
    private final Set<ActivityFilter> filters;

    public /* synthetic */ ActivityRule(Set set, boolean z10, int i10, AbstractC9972n abstractC9972n) {
        this(set, (i10 & 2) != 0 ? false : z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityRule)) {
            return false;
        }
        ActivityRule activityRule = (ActivityRule) obj;
        return AbstractC9979u.m20289b(this.filters, activityRule.filters) && this.alwaysExpand == activityRule.alwaysExpand;
    }

    public final boolean getAlwaysExpand() {
        return this.alwaysExpand;
    }

    public final Set<ActivityFilter> getFilters() {
        return this.filters;
    }

    public int hashCode() {
        return (this.filters.hashCode() * 31) + Boolean.hashCode(this.alwaysExpand);
    }

    public final ActivityRule plus$window_release(ActivityFilter filter) {
        AbstractC9979u.m20294g(filter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(filter);
        return new ActivityRule(AbstractC10947g0.m23929c1(linkedHashSet), this.alwaysExpand);
    }

    public ActivityRule(Set<ActivityFilter> filters, boolean z10) {
        AbstractC9979u.m20294g(filters, "filters");
        this.alwaysExpand = z10;
        this.filters = AbstractC10947g0.m23929c1(filters);
    }
}
