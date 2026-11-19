package com.zykj.evaluation.p057ui.home;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p234s6.C9269c1;
import p234s6.C9272d1;

@StabilityInferred(parameters = 0)
@Keep
@Metadata(m13557d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011JP\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00042\b\b\u0002\u0010\t\u001a\u00020\u00062\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0013J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000fR)\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010\u0013R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b%\u0010\u0011¨\u0006&"}, m13558d2 = {"Lcom/zykj/evaluation/ui/home/HomeViewState;", "", "Ls6/d1;", "studentInfo", "", "Lkotlin/Pair;", "", "Lcom/zykj/evaluation/ui/home/c;", "checkedFilterList", "searchText", "Ls6/c1;", "pageTitleList", "<init>", "(Ls6/d1;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ls6/d1;", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/String;", "component4", "copy", "(Ls6/d1;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Lcom/zykj/evaluation/ui/home/HomeViewState;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ls6/d1;", "getStudentInfo", "Ljava/util/List;", "getCheckedFilterList", "Ljava/lang/String;", "getSearchText", "getPageTitleList", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HomeViewState {
    public static final int $stable = 8;
    private final List<Pair<String, AbstractC6930c>> checkedFilterList;
    private final List<C9269c1> pageTitleList;
    private final String searchText;
    private final C9272d1 studentInfo;

    public HomeViewState() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomeViewState copy$default(HomeViewState homeViewState, C9272d1 c9272d1, List list, String str, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c9272d1 = homeViewState.studentInfo;
        }
        if ((i10 & 2) != 0) {
            list = homeViewState.checkedFilterList;
        }
        if ((i10 & 4) != 0) {
            str = homeViewState.searchText;
        }
        if ((i10 & 8) != 0) {
            list2 = homeViewState.pageTitleList;
        }
        return homeViewState.copy(c9272d1, list, str, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final C9272d1 getStudentInfo() {
        return this.studentInfo;
    }

    public final List<Pair<String, AbstractC6930c>> component2() {
        return this.checkedFilterList;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSearchText() {
        return this.searchText;
    }

    public final List<C9269c1> component4() {
        return this.pageTitleList;
    }

    public final HomeViewState copy(C9272d1 studentInfo, List<? extends Pair<String, ? extends AbstractC6930c>> checkedFilterList, String searchText, List<C9269c1> pageTitleList) {
        Intrinsics.checkNotNullParameter(studentInfo, "studentInfo");
        Intrinsics.checkNotNullParameter(checkedFilterList, "checkedFilterList");
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        Intrinsics.checkNotNullParameter(pageTitleList, "pageTitleList");
        return new HomeViewState(studentInfo, checkedFilterList, searchText, pageTitleList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeViewState)) {
            return false;
        }
        HomeViewState homeViewState = (HomeViewState) other;
        return Intrinsics.areEqual(this.studentInfo, homeViewState.studentInfo) && Intrinsics.areEqual(this.checkedFilterList, homeViewState.checkedFilterList) && Intrinsics.areEqual(this.searchText, homeViewState.searchText) && Intrinsics.areEqual(this.pageTitleList, homeViewState.pageTitleList);
    }

    public final List<Pair<String, AbstractC6930c>> getCheckedFilterList() {
        return this.checkedFilterList;
    }

    public final List<C9269c1> getPageTitleList() {
        return this.pageTitleList;
    }

    public final String getSearchText() {
        return this.searchText;
    }

    public final C9272d1 getStudentInfo() {
        return this.studentInfo;
    }

    public int hashCode() {
        return (((((this.studentInfo.hashCode() * 31) + this.checkedFilterList.hashCode()) * 31) + this.searchText.hashCode()) * 31) + this.pageTitleList.hashCode();
    }

    public String toString() {
        return "HomeViewState(studentInfo=" + this.studentInfo + ", checkedFilterList=" + this.checkedFilterList + ", searchText=" + this.searchText + ", pageTitleList=" + this.pageTitleList + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HomeViewState(C9272d1 studentInfo, List<? extends Pair<String, ? extends AbstractC6930c>> checkedFilterList, String searchText, List<C9269c1> pageTitleList) {
        Intrinsics.checkNotNullParameter(studentInfo, "studentInfo");
        Intrinsics.checkNotNullParameter(checkedFilterList, "checkedFilterList");
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        Intrinsics.checkNotNullParameter(pageTitleList, "pageTitleList");
        this.studentInfo = studentInfo;
        this.checkedFilterList = checkedFilterList;
        this.searchText = searchText;
        this.pageTitleList = pageTitleList;
    }

    public /* synthetic */ HomeViewState(C9272d1 c9272d1, List list, String str, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new C9272d1(null, null, 3, null) : c9272d1, (i10 & 2) != 0 ? CollectionsKt.emptyList() : list, (i10 & 4) != 0 ? "" : str, (i10 & 8) != 0 ? CollectionsKt.emptyList() : list2);
    }
}
