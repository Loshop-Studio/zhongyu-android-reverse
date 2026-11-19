package com.zykj.evaluation.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import com.zykj.evaluation.p057ui.home.AbstractC6930c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\"\u0010#JT\u0010$\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010#J\u0010\u0010'\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b.\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010\u001fR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b6\u0010!R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\b8\u0010#¨\u00069"}, m13558d2 = {"Lcom/zykj/evaluation/bean/HomeFilterCondition;", "", "", "Lcom/zykj/evaluation/ui/home/c$d;", "checkedSubject", "Lcom/zykj/evaluation/ui/home/c$b;", "checkedGrade", "Lcom/zykj/evaluation/ui/home/c$a;", "checkedEvaluationType", "Lcom/zykj/evaluation/ui/home/c$c;", "checkedOverdueType", "Lcom/zykj/evaluation/ui/home/c$e;", "checkedTime", "", "keyword", "<init>", "(Ljava/util/List;Lcom/zykj/evaluation/ui/home/c$b;Lcom/zykj/evaluation/ui/home/c$a;Lcom/zykj/evaluation/ui/home/c$c;Lcom/zykj/evaluation/ui/home/c$e;Ljava/lang/String;)V", "", "skipCount", "maxResultCount", "taskListType", "Lcom/zykj/evaluation/bean/GetTaskListReq;", "convertToReq", "(III)Lcom/zykj/evaluation/bean/GetTaskListReq;", "component1", "()Ljava/util/List;", "component2", "()Lcom/zykj/evaluation/ui/home/c$b;", "component3", "()Lcom/zykj/evaluation/ui/home/c$a;", "component4", "()Lcom/zykj/evaluation/ui/home/c$c;", "component5", "()Lcom/zykj/evaluation/ui/home/c$e;", "component6", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Lcom/zykj/evaluation/ui/home/c$b;Lcom/zykj/evaluation/ui/home/c$a;Lcom/zykj/evaluation/ui/home/c$c;Lcom/zykj/evaluation/ui/home/c$e;Ljava/lang/String;)Lcom/zykj/evaluation/bean/HomeFilterCondition;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getCheckedSubject", "Lcom/zykj/evaluation/ui/home/c$b;", "getCheckedGrade", "Lcom/zykj/evaluation/ui/home/c$a;", "getCheckedEvaluationType", "Lcom/zykj/evaluation/ui/home/c$c;", "getCheckedOverdueType", "Lcom/zykj/evaluation/ui/home/c$e;", "getCheckedTime", "Ljava/lang/String;", "getKeyword", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nGetTaskList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetTaskList.kt\ncom/zykj/evaluation/bean/HomeFilterCondition\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,226:1\n1563#2:227\n1634#2,3:228\n*S KotlinDebug\n*F\n+ 1 GetTaskList.kt\ncom/zykj/evaluation/bean/HomeFilterCondition\n*L\n215#1:227\n215#1:228,3\n*E\n"})
/* loaded from: classes4.dex */
public final /* data */ class HomeFilterCondition {
    public static final int $stable = 8;
    private final AbstractC6930c.a checkedEvaluationType;
    private final AbstractC6930c.b checkedGrade;
    private final AbstractC6930c.c checkedOverdueType;
    private final List<AbstractC6930c.d> checkedSubject;
    private final AbstractC6930c.e checkedTime;
    private final String keyword;

    public HomeFilterCondition() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ HomeFilterCondition copy$default(HomeFilterCondition homeFilterCondition, List list, AbstractC6930c.b bVar, AbstractC6930c.a aVar, AbstractC6930c.c cVar, AbstractC6930c.e eVar, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = homeFilterCondition.checkedSubject;
        }
        if ((i10 & 2) != 0) {
            bVar = homeFilterCondition.checkedGrade;
        }
        if ((i10 & 4) != 0) {
            aVar = homeFilterCondition.checkedEvaluationType;
        }
        if ((i10 & 8) != 0) {
            cVar = homeFilterCondition.checkedOverdueType;
        }
        if ((i10 & 16) != 0) {
            eVar = homeFilterCondition.checkedTime;
        }
        if ((i10 & 32) != 0) {
            str = homeFilterCondition.keyword;
        }
        AbstractC6930c.e eVar2 = eVar;
        String str2 = str;
        return homeFilterCondition.copy(list, bVar, aVar, cVar, eVar2, str2);
    }

    public final List<AbstractC6930c.d> component1() {
        return this.checkedSubject;
    }

    /* renamed from: component2, reason: from getter */
    public final AbstractC6930c.b getCheckedGrade() {
        return this.checkedGrade;
    }

    /* renamed from: component3, reason: from getter */
    public final AbstractC6930c.a getCheckedEvaluationType() {
        return this.checkedEvaluationType;
    }

    /* renamed from: component4, reason: from getter */
    public final AbstractC6930c.c getCheckedOverdueType() {
        return this.checkedOverdueType;
    }

    /* renamed from: component5, reason: from getter */
    public final AbstractC6930c.e getCheckedTime() {
        return this.checkedTime;
    }

    /* renamed from: component6, reason: from getter */
    public final String getKeyword() {
        return this.keyword;
    }

    public final GetTaskListReq convertToReq(int skipCount, int maxResultCount, int taskListType) {
        ArrayList arrayList;
        String strM10081c;
        String strM10080b;
        if (this.checkedSubject.contains(AbstractC6930c.d.a.f9897d)) {
            arrayList = null;
        } else {
            List<AbstractC6930c.d> list = this.checkedSubject;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Long.valueOf(((AbstractC6930c.d) it.next()).m10079b()));
            }
            arrayList = arrayList2;
        }
        Long lM10077b = this.checkedGrade.m10077b();
        Integer numM10076b = this.checkedEvaluationType.m10076b();
        Integer numM10078b = this.checkedOverdueType.m10078b();
        String strM10081c2 = this.checkedTime.m10081c();
        if (strM10081c2 == null || strM10081c2.length() != 16) {
            strM10081c = this.checkedTime.m10081c();
        } else {
            strM10081c = this.checkedTime.m10081c() + ":00";
        }
        String str = strM10081c;
        String strM10080b2 = this.checkedTime.m10080b();
        if (strM10080b2 == null || strM10080b2.length() != 16) {
            strM10080b = this.checkedTime.m10080b();
        } else {
            strM10080b = this.checkedTime.m10080b() + ":59";
        }
        return new GetTaskListReq(taskListType, skipCount, maxResultCount, arrayList, lM10077b, numM10076b, numM10078b, str, strM10080b, this.keyword);
    }

    public final HomeFilterCondition copy(List<? extends AbstractC6930c.d> checkedSubject, AbstractC6930c.b checkedGrade, AbstractC6930c.a checkedEvaluationType, AbstractC6930c.c checkedOverdueType, AbstractC6930c.e checkedTime, String keyword) {
        Intrinsics.checkNotNullParameter(checkedSubject, "checkedSubject");
        Intrinsics.checkNotNullParameter(checkedGrade, "checkedGrade");
        Intrinsics.checkNotNullParameter(checkedEvaluationType, "checkedEvaluationType");
        Intrinsics.checkNotNullParameter(checkedOverdueType, "checkedOverdueType");
        Intrinsics.checkNotNullParameter(checkedTime, "checkedTime");
        return new HomeFilterCondition(checkedSubject, checkedGrade, checkedEvaluationType, checkedOverdueType, checkedTime, keyword);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeFilterCondition)) {
            return false;
        }
        HomeFilterCondition homeFilterCondition = (HomeFilterCondition) other;
        return Intrinsics.areEqual(this.checkedSubject, homeFilterCondition.checkedSubject) && Intrinsics.areEqual(this.checkedGrade, homeFilterCondition.checkedGrade) && Intrinsics.areEqual(this.checkedEvaluationType, homeFilterCondition.checkedEvaluationType) && Intrinsics.areEqual(this.checkedOverdueType, homeFilterCondition.checkedOverdueType) && Intrinsics.areEqual(this.checkedTime, homeFilterCondition.checkedTime) && Intrinsics.areEqual(this.keyword, homeFilterCondition.keyword);
    }

    public final AbstractC6930c.a getCheckedEvaluationType() {
        return this.checkedEvaluationType;
    }

    public final AbstractC6930c.b getCheckedGrade() {
        return this.checkedGrade;
    }

    public final AbstractC6930c.c getCheckedOverdueType() {
        return this.checkedOverdueType;
    }

    public final List<AbstractC6930c.d> getCheckedSubject() {
        return this.checkedSubject;
    }

    public final AbstractC6930c.e getCheckedTime() {
        return this.checkedTime;
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.checkedSubject.hashCode() * 31) + this.checkedGrade.hashCode()) * 31) + this.checkedEvaluationType.hashCode()) * 31) + this.checkedOverdueType.hashCode()) * 31) + this.checkedTime.hashCode()) * 31;
        String str = this.keyword;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "HomeFilterCondition(checkedSubject=" + this.checkedSubject + ", checkedGrade=" + this.checkedGrade + ", checkedEvaluationType=" + this.checkedEvaluationType + ", checkedOverdueType=" + this.checkedOverdueType + ", checkedTime=" + this.checkedTime + ", keyword=" + this.keyword + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HomeFilterCondition(List<? extends AbstractC6930c.d> checkedSubject, AbstractC6930c.b checkedGrade, AbstractC6930c.a checkedEvaluationType, AbstractC6930c.c checkedOverdueType, AbstractC6930c.e checkedTime, String str) {
        Intrinsics.checkNotNullParameter(checkedSubject, "checkedSubject");
        Intrinsics.checkNotNullParameter(checkedGrade, "checkedGrade");
        Intrinsics.checkNotNullParameter(checkedEvaluationType, "checkedEvaluationType");
        Intrinsics.checkNotNullParameter(checkedOverdueType, "checkedOverdueType");
        Intrinsics.checkNotNullParameter(checkedTime, "checkedTime");
        this.checkedSubject = checkedSubject;
        this.checkedGrade = checkedGrade;
        this.checkedEvaluationType = checkedEvaluationType;
        this.checkedOverdueType = checkedOverdueType;
        this.checkedTime = checkedTime;
        this.keyword = str;
    }

    public /* synthetic */ HomeFilterCondition(List list, AbstractC6930c.b bVar, AbstractC6930c.a aVar, AbstractC6930c.c cVar, AbstractC6930c.e eVar, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt.listOf(AbstractC6930c.d.a.f9897d) : list, (i10 & 2) != 0 ? AbstractC6930c.b.a.f9889d : bVar, (i10 & 4) != 0 ? AbstractC6930c.a.d.f9885d : aVar, (i10 & 8) != 0 ? AbstractC6930c.c.C10138c.f9894d : cVar, (i10 & 16) != 0 ? AbstractC6930c.e.d.f9905e : eVar, (i10 & 32) != 0 ? null : str);
    }
}
