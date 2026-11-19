package com.zykj.student.dialogue.p076ui.home;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.zykj.student.dialogue.bean.resp.FilterType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import p158k6.InterfaceC8287g;
import p244s6.C9526k0;
import p244s6.C9530l0;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ9\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010\u001aJ3\u0010%\u001a\b\u0012\u0004\u0012\u00020 0#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020 0#H\u0002¢\u0006\u0004\b%\u0010&J3\u0010)\u001a\b\u0012\u0004\u0012\u00020'0#2\u0006\u0010!\u001a\u00020'2\u0006\u0010\"\u001a\u00020'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0#H\u0002¢\u0006\u0004\b)\u0010*J3\u0010-\u001a\b\u0012\u0004\u0012\u00020+0#2\u0006\u0010!\u001a\u00020+2\u0006\u0010\"\u001a\u00020+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0#H\u0002¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R+\u00109\u001a\u0002012\u0006\u00102\u001a\u0002018F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006:"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;", "Landroidx/lifecycle/ViewModel;", "Lk6/g;", "dialogueApi", "<init>", "(Lk6/g;)V", "Lcom/zykj/student/dialogue/ui/home/a;", "drawerType", "", "f", "(Lcom/zykj/student/dialogue/ui/home/a;)V", "Lcom/zykj/student/dialogue/bean/resp/FilterType;", "filterType", "p", "(Lcom/zykj/student/dialogue/bean/resp/FilterType;)V", "", "isJoinedTime", "isCanceled", "", "startDateTime", "endDateTime", "", "type", "o", "(ZZLjava/lang/String;Ljava/lang/String;I)V", "h", "()V", "Ls6/k0;", "filterConditions", "m", "(Ls6/k0;)V", "l", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;", "realJoinedTime", "tempJoinedTime", "", "joinedTimeData", "j", "(Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;Ljava/util/List;)Ljava/util/List;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;", "updatedTimeData", "k", "(Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;Ljava/util/List;)Ljava/util/List;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;", "favoriteTimeData", "i", "(Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;Ljava/util/List;)Ljava/util/List;", "a", "Lk6/g;", "Ls6/l0;", "<set-?>", "b", "Landroidx/compose/runtime/MutableState;", "g", "()Ls6/l0;", "n", "(Ls6/l0;)V", "filterUiState", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nHomeFilterViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeFilterViewModel.kt\ncom/zykj/student/dialogue/ui/home/HomeFilterViewModel\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,380:1\n85#2:381\n113#2,2:382\n1563#3:384\n1634#3,3:385\n1563#3:388\n1634#3,3:389\n1563#3:392\n1634#3,3:393\n*S KotlinDebug\n*F\n+ 1 HomeFilterViewModel.kt\ncom/zykj/student/dialogue/ui/home/HomeFilterViewModel\n*L\n16#1:381\n16#1:382,2\n267#1:384\n267#1:385,3\n292#1:388\n292#1:389,3\n314#1:392\n314#1:393,3\n*E\n"})
/* loaded from: classes5.dex */
public final class HomeFilterViewModel extends ViewModel {

    /* renamed from: a, reason: from kotlin metadata */
    public final InterfaceC8287g dialogueApi;

    /* renamed from: b, reason: from kotlin metadata */
    public final MutableState filterUiState;

    public HomeFilterViewModel(InterfaceC8287g dialogueApi) {
        Intrinsics.checkNotNullParameter(dialogueApi, "dialogueApi");
        this.dialogueApi = dialogueApi;
        this.filterUiState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new C9530l0(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null), null, 2, null);
        m10637h();
    }

    /* renamed from: f */
    public final void m10635f(AbstractC7593a drawerType) {
        Intrinsics.checkNotNullParameter(drawerType, "drawerType");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HomeFilterViewModel$filterReset$1(drawerType, this, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public final C9530l0 m10636g() {
        return (C9530l0) this.filterUiState.getValue();
    }

    /* renamed from: h */
    public final void m10637h() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HomeFilterViewModel$getSubjectList$1(this, null), 3, null);
    }

    /* renamed from: i */
    public final List m10638i(FilterType.Time.FavoriteTime realJoinedTime, FilterType.Time.FavoriteTime tempJoinedTime, List favoriteTimeData) {
        if (!realJoinedTime.isCustomTime() || Intrinsics.areEqual(realJoinedTime, tempJoinedTime)) {
            return favoriteTimeData;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(favoriteTimeData, 10));
        Iterator it = favoriteTimeData.iterator();
        while (it.hasNext()) {
            FilterType.Time.FavoriteTime favoriteTime = (FilterType.Time.FavoriteTime) it.next();
            if (favoriteTime instanceof FilterType.Time.FavoriteTime.Custom) {
                favoriteTime = realJoinedTime;
            }
            arrayList.add(favoriteTime);
        }
        return arrayList;
    }

    /* renamed from: j */
    public final List m10639j(FilterType.Time.JoinedTime realJoinedTime, FilterType.Time.JoinedTime tempJoinedTime, List joinedTimeData) {
        if (!realJoinedTime.isCustomTime() || Intrinsics.areEqual(realJoinedTime, tempJoinedTime)) {
            return joinedTimeData;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(joinedTimeData, 10));
        Iterator it = joinedTimeData.iterator();
        while (it.hasNext()) {
            FilterType.Time.JoinedTime joinedTime = (FilterType.Time.JoinedTime) it.next();
            if (joinedTime instanceof FilterType.Time.JoinedTime.Custom) {
                joinedTime = realJoinedTime;
            }
            arrayList.add(joinedTime);
        }
        return arrayList;
    }

    /* renamed from: k */
    public final List m10640k(FilterType.Time.UpdatedTime realJoinedTime, FilterType.Time.UpdatedTime tempJoinedTime, List updatedTimeData) {
        if (!realJoinedTime.isCustomTime() || Intrinsics.areEqual(realJoinedTime, tempJoinedTime)) {
            return updatedTimeData;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(updatedTimeData, 10));
        Iterator it = updatedTimeData.iterator();
        while (it.hasNext()) {
            FilterType.Time.UpdatedTime updatedTime = (FilterType.Time.UpdatedTime) it.next();
            if (updatedTime instanceof FilterType.Time.UpdatedTime.Custom) {
                updatedTime = realJoinedTime;
            }
            arrayList.add(updatedTime);
        }
        return arrayList;
    }

    /* renamed from: l */
    public final void m10641l() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HomeFilterViewModel$resetAll$1(this, null), 3, null);
    }

    /* renamed from: m */
    public final void m10642m(C9526k0 filterConditions) {
        Intrinsics.checkNotNullParameter(filterConditions, "filterConditions");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HomeFilterViewModel$resetTempState$1(this, filterConditions, null), 3, null);
    }

    /* renamed from: n */
    public final void m10643n(C9530l0 c9530l0) {
        this.filterUiState.setValue(c9530l0);
    }

    /* renamed from: o */
    public final void m10644o(boolean isJoinedTime, boolean isCanceled, String startDateTime, String endDateTime, int type) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HomeFilterViewModel$updateCustomTime$1(startDateTime, endDateTime, isCanceled, type, this, isJoinedTime, null), 3, null);
    }

    /* renamed from: p */
    public final void m10645p(FilterType filterType) {
        List listMinus;
        List listMinus2;
        Intrinsics.checkNotNullParameter(filterType, "filterType");
        if (filterType instanceof FilterType.ViewStatus) {
            C9530l0 c9530l0M10636g = m10636g();
            if (filterType instanceof FilterType.ViewStatus.Unlimited) {
                listMinus2 = CollectionsKt.listOf(FilterType.ViewStatus.Unlimited.INSTANCE);
            } else {
                listMinus2 = m10636g().m15739j().contains(filterType) ? CollectionsKt.minus(m10636g().m15739j(), filterType) : CollectionsKt.plus((Collection<? extends FilterType>) m10636g().m15739j(), filterType);
                if (listMinus2.isEmpty()) {
                    listMinus2 = CollectionsKt.listOf(FilterType.ViewStatus.Unlimited.INSTANCE);
                } else {
                    FilterType.ViewStatus.Unlimited unlimited = FilterType.ViewStatus.Unlimited.INSTANCE;
                    if (listMinus2.contains(unlimited)) {
                        listMinus2 = CollectionsKt.minus(listMinus2, unlimited);
                    }
                }
            }
            m10643n(C9530l0.m15730b(c9530l0M10636g, null, null, null, null, null, null, null, listMinus2, null, null, null, null, null, null, null, 32639, null));
            return;
        }
        if (filterType instanceof FilterType.TeacherViewStatus) {
            C9530l0 c9530l0M10636g2 = m10636g();
            if (filterType instanceof FilterType.TeacherViewStatus.Unlimited) {
                listMinus = CollectionsKt.listOf(FilterType.TeacherViewStatus.Unlimited.INSTANCE);
            } else {
                listMinus = m10636g().m15737h().contains(filterType) ? CollectionsKt.minus(m10636g().m15737h(), filterType) : CollectionsKt.plus((Collection<? extends FilterType>) m10636g().m15737h(), filterType);
                if (listMinus.isEmpty()) {
                    listMinus = CollectionsKt.listOf(FilterType.TeacherViewStatus.Unlimited.INSTANCE);
                } else {
                    FilterType.TeacherViewStatus.Unlimited unlimited2 = FilterType.TeacherViewStatus.Unlimited.INSTANCE;
                    if (listMinus.contains(unlimited2)) {
                        listMinus = CollectionsKt.minus(listMinus, unlimited2);
                    }
                }
            }
            m10643n(C9530l0.m15730b(c9530l0M10636g2, null, null, null, null, null, null, null, null, listMinus, null, null, null, null, null, null, 32511, null));
            return;
        }
        if (filterType instanceof FilterType.QuestionState) {
            m10643n(C9530l0.m15730b(m10636g(), null, null, null, null, null, null, null, null, null, (FilterType.QuestionState) filterType, null, null, null, null, null, 32255, null));
            return;
        }
        if (!(filterType instanceof FilterType.Time)) {
            if (filterType instanceof FilterType.Sort) {
                m10643n(C9530l0.m15730b(m10636g(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, (FilterType.Sort) filterType, 16383, null));
                return;
            } else {
                if (!(filterType instanceof FilterType.Subject)) {
                    throw new NoWhenBranchMatchedException();
                }
                m10643n(C9530l0.m15730b(m10636g(), null, null, null, null, null, null, null, null, null, null, (FilterType.Subject) filterType, null, null, null, null, 31743, null));
                return;
            }
        }
        FilterType.Time time = (FilterType.Time) filterType;
        if (time instanceof FilterType.Time.JoinedTime) {
            if (!(filterType instanceof FilterType.Time.JoinedTime.Custom) || ((FilterType.Time.JoinedTime.Custom) filterType).hasTimeRange()) {
                m10643n(C9530l0.m15730b(m10636g(), null, null, null, null, null, null, null, null, null, null, null, (FilterType.Time.JoinedTime) filterType, null, null, null, 30719, null));
                return;
            }
            return;
        }
        if (time instanceof FilterType.Time.UpdatedTime) {
            if (!(filterType instanceof FilterType.Time.UpdatedTime.Custom) || ((FilterType.Time.UpdatedTime.Custom) filterType).hasTimeRange()) {
                m10643n(C9530l0.m15730b(m10636g(), null, null, null, null, null, null, null, null, null, null, null, null, (FilterType.Time.UpdatedTime) filterType, null, null, 28671, null));
                return;
            }
            return;
        }
        if (!(time instanceof FilterType.Time.FavoriteTime)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!(filterType instanceof FilterType.Time.FavoriteTime.Custom) || ((FilterType.Time.FavoriteTime.Custom) filterType).hasTimeRange()) {
            m10643n(C9530l0.m15730b(m10636g(), null, null, null, null, null, null, null, null, null, null, null, null, null, (FilterType.Time.FavoriteTime) filterType, null, 24575, null));
        }
    }
}
