package com.zykj.evaluation.p057ui.home;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.zykj.evaluation.p057ui.home.AbstractC6930c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p234s6.C9270d;

@StabilityInferred(parameters = 0)
@Keep
@Metadata(m13557d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b¨\u0006\u0017"}, m13558d2 = {"Lcom/zykj/evaluation/ui/home/HomeFilterState;", "", "", "Ls6/d;", "filterDataList", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/zykj/evaluation/ui/home/HomeFilterState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getFilterDataList", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HomeFilterState {
    public static final int $stable = 8;
    private final List<C9270d> filterDataList;

    /* JADX WARN: Multi-variable type inference failed */
    public HomeFilterState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomeFilterState copy$default(HomeFilterState homeFilterState, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = homeFilterState.filterDataList;
        }
        return homeFilterState.copy(list);
    }

    public final List<C9270d> component1() {
        return this.filterDataList;
    }

    public final HomeFilterState copy(List<C9270d> filterDataList) {
        Intrinsics.checkNotNullParameter(filterDataList, "filterDataList");
        return new HomeFilterState(filterDataList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HomeFilterState) && Intrinsics.areEqual(this.filterDataList, ((HomeFilterState) other).filterDataList);
    }

    public final List<C9270d> getFilterDataList() {
        return this.filterDataList;
    }

    public int hashCode() {
        return this.filterDataList.hashCode();
    }

    public String toString() {
        return "HomeFilterState(filterDataList=" + this.filterDataList + ")";
    }

    public HomeFilterState(List<C9270d> filterDataList) {
        Intrinsics.checkNotNullParameter(filterDataList, "filterDataList");
        this.filterDataList = filterDataList;
    }

    public /* synthetic */ HomeFilterState(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt.listOf((Object[]) new C9270d[]{new C9270d("科目（可多选）", CollectionsKt.listOf(AbstractC6930c.d.a.f9897d), null, 4, null), new C9270d("年级", CollectionsKt.listOf(AbstractC6930c.b.a.f9889d), null, 4, null), new C9270d("测评类型", CollectionsKt.listOf((Object[]) new AbstractC6930c.a[]{AbstractC6930c.a.d.f9885d, AbstractC6930c.a.C10137a.f9882d, AbstractC6930c.a.c.f9884d, AbstractC6930c.a.b.f9883d, AbstractC6930c.a.e.f9886d}), null, 4, null), new C9270d("是否逾期", CollectionsKt.listOf((Object[]) new AbstractC6930c.c[]{AbstractC6930c.c.C10138c.f9894d, AbstractC6930c.c.a.f9892d, AbstractC6930c.c.b.f9893d}), null, 4, null), new C9270d("开始时间", CollectionsKt.listOf((Object[]) new AbstractC6930c.e[]{AbstractC6930c.e.d.f9905e, AbstractC6930c.e.c.f9904e, AbstractC6930c.e.b.f9903e, new AbstractC6930c.e.a(null, null, 3, null)}), null, 4, null)}) : list);
    }
}
