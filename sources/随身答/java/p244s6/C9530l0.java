package p244s6;

import com.zykj.student.dialogue.bean.resp.FilterType;
import com.zykj.student.dialogue.bean.resp.HomeKt;
import java.util.List;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: s6.l0 */
/* loaded from: classes5.dex */
public final class C9530l0 {

    /* renamed from: a */
    public final Object f16636a;

    /* renamed from: b */
    public final List f16637b;

    /* renamed from: c */
    public final List f16638c;

    /* renamed from: d */
    public final List f16639d;

    /* renamed from: e */
    public final List f16640e;

    /* renamed from: f */
    public final List f16641f;

    /* renamed from: g */
    public final List f16642g;

    /* renamed from: h */
    public final List f16643h;

    /* renamed from: i */
    public final List f16644i;

    /* renamed from: j */
    public final FilterType.QuestionState f16645j;

    /* renamed from: k */
    public final FilterType.Subject f16646k;

    /* renamed from: l */
    public final FilterType.Time.JoinedTime f16647l;

    /* renamed from: m */
    public final FilterType.Time.UpdatedTime f16648m;

    /* renamed from: n */
    public final FilterType.Time.FavoriteTime f16649n;

    /* renamed from: o */
    public final FilterType.Sort f16650o;

    public C9530l0(Object obj, List updatedTimeData, List joinedTimeData, List favoriteTimeData, List viewStatusData, List teacherViewStatusData, List questionStateData, List checkedViewStatus, List checkedTeacherViewStatus, FilterType.QuestionState checkedQuestionState, FilterType.Subject checkedSubject, FilterType.Time.JoinedTime checkedJoinedTime, FilterType.Time.UpdatedTime checkedUpdatedTime, FilterType.Time.FavoriteTime checkedFavoriteTime, FilterType.Sort checkedSortType) {
        Intrinsics.checkNotNullParameter(updatedTimeData, "updatedTimeData");
        Intrinsics.checkNotNullParameter(joinedTimeData, "joinedTimeData");
        Intrinsics.checkNotNullParameter(favoriteTimeData, "favoriteTimeData");
        Intrinsics.checkNotNullParameter(viewStatusData, "viewStatusData");
        Intrinsics.checkNotNullParameter(teacherViewStatusData, "teacherViewStatusData");
        Intrinsics.checkNotNullParameter(questionStateData, "questionStateData");
        Intrinsics.checkNotNullParameter(checkedViewStatus, "checkedViewStatus");
        Intrinsics.checkNotNullParameter(checkedTeacherViewStatus, "checkedTeacherViewStatus");
        Intrinsics.checkNotNullParameter(checkedQuestionState, "checkedQuestionState");
        Intrinsics.checkNotNullParameter(checkedSubject, "checkedSubject");
        Intrinsics.checkNotNullParameter(checkedJoinedTime, "checkedJoinedTime");
        Intrinsics.checkNotNullParameter(checkedUpdatedTime, "checkedUpdatedTime");
        Intrinsics.checkNotNullParameter(checkedFavoriteTime, "checkedFavoriteTime");
        Intrinsics.checkNotNullParameter(checkedSortType, "checkedSortType");
        this.f16636a = obj;
        this.f16637b = updatedTimeData;
        this.f16638c = joinedTimeData;
        this.f16639d = favoriteTimeData;
        this.f16640e = viewStatusData;
        this.f16641f = teacherViewStatusData;
        this.f16642g = questionStateData;
        this.f16643h = checkedViewStatus;
        this.f16644i = checkedTeacherViewStatus;
        this.f16645j = checkedQuestionState;
        this.f16646k = checkedSubject;
        this.f16647l = checkedJoinedTime;
        this.f16648m = checkedUpdatedTime;
        this.f16649n = checkedFavoriteTime;
        this.f16650o = checkedSortType;
    }

    /* renamed from: b */
    public static /* synthetic */ C9530l0 m15730b(C9530l0 c9530l0, Result result, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, FilterType.QuestionState questionState, FilterType.Subject subject, FilterType.Time.JoinedTime joinedTime, FilterType.Time.UpdatedTime updatedTime, FilterType.Time.FavoriteTime favoriteTime, FilterType.Sort sort, int i9, Object obj) {
        Result resultM24757boximpl = (i9 & 1) != 0 ? Result.m24757boximpl(c9530l0.f16636a) : result;
        return c9530l0.m15731a(resultM24757boximpl.getValue(), (i9 & 2) != 0 ? c9530l0.f16637b : list, (i9 & 4) != 0 ? c9530l0.f16638c : list2, (i9 & 8) != 0 ? c9530l0.f16639d : list3, (i9 & 16) != 0 ? c9530l0.f16640e : list4, (i9 & 32) != 0 ? c9530l0.f16641f : list5, (i9 & 64) != 0 ? c9530l0.f16642g : list6, (i9 & 128) != 0 ? c9530l0.f16643h : list7, (i9 & 256) != 0 ? c9530l0.f16644i : list8, (i9 & 512) != 0 ? c9530l0.f16645j : questionState, (i9 & 1024) != 0 ? c9530l0.f16646k : subject, (i9 & 2048) != 0 ? c9530l0.f16647l : joinedTime, (i9 & 4096) != 0 ? c9530l0.f16648m : updatedTime, (i9 & 8192) != 0 ? c9530l0.f16649n : favoriteTime, (i9 & 16384) != 0 ? c9530l0.f16650o : sort);
    }

    /* renamed from: a */
    public final C9530l0 m15731a(Object obj, List updatedTimeData, List joinedTimeData, List favoriteTimeData, List viewStatusData, List teacherViewStatusData, List questionStateData, List checkedViewStatus, List checkedTeacherViewStatus, FilterType.QuestionState checkedQuestionState, FilterType.Subject checkedSubject, FilterType.Time.JoinedTime checkedJoinedTime, FilterType.Time.UpdatedTime checkedUpdatedTime, FilterType.Time.FavoriteTime checkedFavoriteTime, FilterType.Sort checkedSortType) {
        Intrinsics.checkNotNullParameter(updatedTimeData, "updatedTimeData");
        Intrinsics.checkNotNullParameter(joinedTimeData, "joinedTimeData");
        Intrinsics.checkNotNullParameter(favoriteTimeData, "favoriteTimeData");
        Intrinsics.checkNotNullParameter(viewStatusData, "viewStatusData");
        Intrinsics.checkNotNullParameter(teacherViewStatusData, "teacherViewStatusData");
        Intrinsics.checkNotNullParameter(questionStateData, "questionStateData");
        Intrinsics.checkNotNullParameter(checkedViewStatus, "checkedViewStatus");
        Intrinsics.checkNotNullParameter(checkedTeacherViewStatus, "checkedTeacherViewStatus");
        Intrinsics.checkNotNullParameter(checkedQuestionState, "checkedQuestionState");
        Intrinsics.checkNotNullParameter(checkedSubject, "checkedSubject");
        Intrinsics.checkNotNullParameter(checkedJoinedTime, "checkedJoinedTime");
        Intrinsics.checkNotNullParameter(checkedUpdatedTime, "checkedUpdatedTime");
        Intrinsics.checkNotNullParameter(checkedFavoriteTime, "checkedFavoriteTime");
        Intrinsics.checkNotNullParameter(checkedSortType, "checkedSortType");
        return new C9530l0(obj, updatedTimeData, joinedTimeData, favoriteTimeData, viewStatusData, teacherViewStatusData, questionStateData, checkedViewStatus, checkedTeacherViewStatus, checkedQuestionState, checkedSubject, checkedJoinedTime, checkedUpdatedTime, checkedFavoriteTime, checkedSortType);
    }

    /* renamed from: c */
    public final FilterType.Time.FavoriteTime m15732c() {
        return this.f16649n;
    }

    /* renamed from: d */
    public final FilterType.Time.JoinedTime m15733d() {
        return this.f16647l;
    }

    /* renamed from: e */
    public final FilterType.QuestionState m15734e() {
        return this.f16645j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9530l0)) {
            return false;
        }
        C9530l0 c9530l0 = (C9530l0) obj;
        return Result.m24760equalsimpl0(this.f16636a, c9530l0.f16636a) && Intrinsics.areEqual(this.f16637b, c9530l0.f16637b) && Intrinsics.areEqual(this.f16638c, c9530l0.f16638c) && Intrinsics.areEqual(this.f16639d, c9530l0.f16639d) && Intrinsics.areEqual(this.f16640e, c9530l0.f16640e) && Intrinsics.areEqual(this.f16641f, c9530l0.f16641f) && Intrinsics.areEqual(this.f16642g, c9530l0.f16642g) && Intrinsics.areEqual(this.f16643h, c9530l0.f16643h) && Intrinsics.areEqual(this.f16644i, c9530l0.f16644i) && Intrinsics.areEqual(this.f16645j, c9530l0.f16645j) && Intrinsics.areEqual(this.f16646k, c9530l0.f16646k) && Intrinsics.areEqual(this.f16647l, c9530l0.f16647l) && Intrinsics.areEqual(this.f16648m, c9530l0.f16648m) && Intrinsics.areEqual(this.f16649n, c9530l0.f16649n) && Intrinsics.areEqual(this.f16650o, c9530l0.f16650o);
    }

    /* renamed from: f */
    public final FilterType.Sort m15735f() {
        return this.f16650o;
    }

    /* renamed from: g */
    public final FilterType.Subject m15736g() {
        return this.f16646k;
    }

    /* renamed from: h */
    public final List m15737h() {
        return this.f16644i;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((Result.m24763hashCodeimpl(this.f16636a) * 31) + this.f16637b.hashCode()) * 31) + this.f16638c.hashCode()) * 31) + this.f16639d.hashCode()) * 31) + this.f16640e.hashCode()) * 31) + this.f16641f.hashCode()) * 31) + this.f16642g.hashCode()) * 31) + this.f16643h.hashCode()) * 31) + this.f16644i.hashCode()) * 31) + this.f16645j.hashCode()) * 31) + this.f16646k.hashCode()) * 31) + this.f16647l.hashCode()) * 31) + this.f16648m.hashCode()) * 31) + this.f16649n.hashCode()) * 31) + this.f16650o.hashCode();
    }

    /* renamed from: i */
    public final FilterType.Time.UpdatedTime m15738i() {
        return this.f16648m;
    }

    /* renamed from: j */
    public final List m15739j() {
        return this.f16643h;
    }

    /* renamed from: k */
    public final List m15740k() {
        return this.f16639d;
    }

    /* renamed from: l */
    public final List m15741l() {
        return this.f16638c;
    }

    /* renamed from: m */
    public final List m15742m() {
        return this.f16642g;
    }

    /* renamed from: n */
    public final Object m15743n() {
        return this.f16636a;
    }

    /* renamed from: o */
    public final List m15744o() {
        return this.f16641f;
    }

    /* renamed from: p */
    public final List m15745p() {
        return this.f16637b;
    }

    /* renamed from: q */
    public final List m15746q() {
        return this.f16640e;
    }

    public String toString() {
        return "FilterUiState(subjectList=" + Result.m24766toStringimpl(this.f16636a) + ", updatedTimeData=" + this.f16637b + ", joinedTimeData=" + this.f16638c + ", favoriteTimeData=" + this.f16639d + ", viewStatusData=" + this.f16640e + ", teacherViewStatusData=" + this.f16641f + ", questionStateData=" + this.f16642g + ", checkedViewStatus=" + this.f16643h + ", checkedTeacherViewStatus=" + this.f16644i + ", checkedQuestionState=" + this.f16645j + ", checkedSubject=" + this.f16646k + ", checkedJoinedTime=" + this.f16647l + ", checkedUpdatedTime=" + this.f16648m + ", checkedFavoriteTime=" + this.f16649n + ", checkedSortType=" + this.f16650o + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C9530l0(Result result, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, FilterType.QuestionState questionState, FilterType.Subject subject, FilterType.Time.JoinedTime joinedTime, FilterType.Time.UpdatedTime updatedTime, FilterType.Time.FavoriteTime favoriteTime, FilterType.Sort sort, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        Result resultM24757boximpl;
        if ((i9 & 1) != 0) {
            Result.Companion companion = Result.INSTANCE;
            resultM24757boximpl = Result.m24757boximpl(Result.m24758constructorimpl(CollectionsKt.emptyList()));
        } else {
            resultM24757boximpl = result;
        }
        List listListOf = (i9 & 2) != 0 ? CollectionsKt.listOf((Object[]) new FilterType.Time.UpdatedTime[]{FilterType.Time.UpdatedTime.Unlimited.INSTANCE, FilterType.Time.UpdatedTime.ThisWeek.INSTANCE, FilterType.Time.UpdatedTime.ThisMonth.INSTANCE, new FilterType.Time.UpdatedTime.Custom(null, null, 3, null)}) : list;
        List listListOf2 = (i9 & 4) != 0 ? CollectionsKt.listOf((Object[]) new FilterType.Time.JoinedTime[]{FilterType.Time.JoinedTime.Unlimited.INSTANCE, FilterType.Time.JoinedTime.ThisWeek.INSTANCE, FilterType.Time.JoinedTime.ThisMonth.INSTANCE, new FilterType.Time.JoinedTime.Custom(null, null, 3, null)}) : list2;
        List listListOf3 = (i9 & 8) != 0 ? CollectionsKt.listOf((Object[]) new FilterType.Time.FavoriteTime[]{FilterType.Time.FavoriteTime.Unlimited.INSTANCE, FilterType.Time.FavoriteTime.ThisWeek.INSTANCE, FilterType.Time.FavoriteTime.ThisMonth.INSTANCE, new FilterType.Time.FavoriteTime.Custom(null, null, 3, null)}) : list3;
        this(resultM24757boximpl.getValue(), listListOf, listListOf2, listListOf3, (i9 & 16) != 0 ? CollectionsKt.listOf((Object[]) new FilterType.ViewStatus[]{FilterType.ViewStatus.Unlimited.INSTANCE, FilterType.ViewStatus.MyQuestion.INSTANCE, FilterType.ViewStatus.Replied.INSTANCE, FilterType.ViewStatus.Unanswered.INSTANCE, FilterType.ViewStatus.NotViewed.INSTANCE}) : list4, (i9 & 32) != 0 ? CollectionsKt.listOf((Object[]) new FilterType.TeacherViewStatus[]{FilterType.TeacherViewStatus.Unlimited.INSTANCE, FilterType.TeacherViewStatus.Started.INSTANCE, FilterType.TeacherViewStatus.Replied.INSTANCE}) : list5, (i9 & 64) != 0 ? CollectionsKt.listOf((Object[]) new FilterType.QuestionState[]{FilterType.QuestionState.Unlimited.INSTANCE, FilterType.QuestionState.Ongoing.INSTANCE, FilterType.QuestionState.Closed.INSTANCE}) : list6, (i9 & 128) != 0 ? HomeKt.getInitialViewStatus() : list7, (i9 & 256) != 0 ? HomeKt.getInitialTeacherViewStatus() : list8, (i9 & 512) != 0 ? HomeKt.getInitialQuestionState() : questionState, (i9 & 1024) != 0 ? HomeKt.getInitialSubject() : subject, (i9 & 2048) != 0 ? HomeKt.getInitialJoinedTime() : joinedTime, (i9 & 4096) != 0 ? HomeKt.getInitialUpdatedTime() : updatedTime, (i9 & 8192) != 0 ? HomeKt.getInitialFavoriteTime() : favoriteTime, (i9 & 16384) != 0 ? HomeKt.getInitialSortType() : sort);
    }
}
