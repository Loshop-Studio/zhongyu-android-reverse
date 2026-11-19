package com.zykj.student.dialogue.bean.resp;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.student.dialogue.bean.resp.FilterType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(m13412d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m13413d2 = {"InitialSubject", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;", "getInitialSubject", "()Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;", "InitialViewStatus", "", "Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus;", "getInitialViewStatus", "()Ljava/util/List;", "InitialTeacherViewStatus", "Lcom/zykj/student/dialogue/bean/resp/FilterType$TeacherViewStatus;", "getInitialTeacherViewStatus", "InitialQuestionState", "Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState$Unlimited;", "getInitialQuestionState", "()Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState$Unlimited;", "InitialJoinedTime", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$Unlimited;", "getInitialJoinedTime", "()Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$Unlimited;", "InitialFavoriteTime", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Unlimited;", "getInitialFavoriteTime", "()Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Unlimited;", "InitialUpdatedTime", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$Unlimited;", "getInitialUpdatedTime", "()Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$Unlimited;", "InitialSortType", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort$SortByUpdatedTime;", "getInitialSortType", "()Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort$SortByUpdatedTime;", "app_release"}, m13414k = 2, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final class HomeKt {
    private static final FilterType.Subject InitialSubject = new FilterType.Subject(0, "全部科目");
    private static final List<FilterType.ViewStatus> InitialViewStatus = CollectionsKt.listOf(FilterType.ViewStatus.Unlimited.INSTANCE);
    private static final List<FilterType.TeacherViewStatus> InitialTeacherViewStatus = CollectionsKt.listOf(FilterType.TeacherViewStatus.Unlimited.INSTANCE);
    private static final FilterType.QuestionState.Unlimited InitialQuestionState = FilterType.QuestionState.Unlimited.INSTANCE;
    private static final FilterType.Time.JoinedTime.Unlimited InitialJoinedTime = FilterType.Time.JoinedTime.Unlimited.INSTANCE;
    private static final FilterType.Time.FavoriteTime.Unlimited InitialFavoriteTime = FilterType.Time.FavoriteTime.Unlimited.INSTANCE;
    private static final FilterType.Time.UpdatedTime.Unlimited InitialUpdatedTime = FilterType.Time.UpdatedTime.Unlimited.INSTANCE;
    private static final FilterType.Sort.SortByUpdatedTime InitialSortType = FilterType.Sort.SortByUpdatedTime.INSTANCE;

    public static final FilterType.Time.FavoriteTime.Unlimited getInitialFavoriteTime() {
        return InitialFavoriteTime;
    }

    public static final FilterType.Time.JoinedTime.Unlimited getInitialJoinedTime() {
        return InitialJoinedTime;
    }

    public static final FilterType.QuestionState.Unlimited getInitialQuestionState() {
        return InitialQuestionState;
    }

    public static final FilterType.Sort.SortByUpdatedTime getInitialSortType() {
        return InitialSortType;
    }

    public static final FilterType.Subject getInitialSubject() {
        return InitialSubject;
    }

    public static final List<FilterType.TeacherViewStatus> getInitialTeacherViewStatus() {
        return InitialTeacherViewStatus;
    }

    public static final FilterType.Time.UpdatedTime.Unlimited getInitialUpdatedTime() {
        return InitialUpdatedTime;
    }

    public static final List<FilterType.ViewStatus> getInitialViewStatus() {
        return InitialViewStatus;
    }
}
