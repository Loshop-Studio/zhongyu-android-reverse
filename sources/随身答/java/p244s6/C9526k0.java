package p244s6;

import com.zykj.student.dialogue.bean.req.CollectSessionReq;
import com.zykj.student.dialogue.bean.req.JoinTimeReq;
import com.zykj.student.dialogue.bean.req.SessionsReq;
import com.zykj.student.dialogue.bean.req.UpdateTimeReq;
import com.zykj.student.dialogue.bean.resp.FilterType;
import com.zykj.student.dialogue.bean.resp.HomeKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: s6.k0 */
/* loaded from: classes5.dex */
public final class C9526k0 {

    /* renamed from: a */
    public final List f16624a;

    /* renamed from: b */
    public final List f16625b;

    /* renamed from: c */
    public final FilterType.QuestionState f16626c;

    /* renamed from: d */
    public final FilterType.Subject f16627d;

    /* renamed from: e */
    public final FilterType.Time.JoinedTime f16628e;

    /* renamed from: f */
    public final FilterType.Time.UpdatedTime f16629f;

    /* renamed from: g */
    public final FilterType.Time.FavoriteTime f16630g;

    /* renamed from: h */
    public final FilterType.Sort f16631h;

    /* renamed from: i */
    public final String f16632i;

    public C9526k0(List checkedViewStatus, List checkedTeacherViewStatus, FilterType.QuestionState checkedQuestionState, FilterType.Subject checkedSubject, FilterType.Time.JoinedTime checkedJoinedTime, FilterType.Time.UpdatedTime checkedUpdatedTime, FilterType.Time.FavoriteTime checkedFavoriteTime, FilterType.Sort checkedSortType, String searchedKeyword) {
        Intrinsics.checkNotNullParameter(checkedViewStatus, "checkedViewStatus");
        Intrinsics.checkNotNullParameter(checkedTeacherViewStatus, "checkedTeacherViewStatus");
        Intrinsics.checkNotNullParameter(checkedQuestionState, "checkedQuestionState");
        Intrinsics.checkNotNullParameter(checkedSubject, "checkedSubject");
        Intrinsics.checkNotNullParameter(checkedJoinedTime, "checkedJoinedTime");
        Intrinsics.checkNotNullParameter(checkedUpdatedTime, "checkedUpdatedTime");
        Intrinsics.checkNotNullParameter(checkedFavoriteTime, "checkedFavoriteTime");
        Intrinsics.checkNotNullParameter(checkedSortType, "checkedSortType");
        Intrinsics.checkNotNullParameter(searchedKeyword, "searchedKeyword");
        this.f16624a = checkedViewStatus;
        this.f16625b = checkedTeacherViewStatus;
        this.f16626c = checkedQuestionState;
        this.f16627d = checkedSubject;
        this.f16628e = checkedJoinedTime;
        this.f16629f = checkedUpdatedTime;
        this.f16630g = checkedFavoriteTime;
        this.f16631h = checkedSortType;
        this.f16632i = searchedKeyword;
    }

    /* renamed from: b */
    public static /* synthetic */ C9526k0 m15715b(C9526k0 c9526k0, List list, List list2, FilterType.QuestionState questionState, FilterType.Subject subject, FilterType.Time.JoinedTime joinedTime, FilterType.Time.UpdatedTime updatedTime, FilterType.Time.FavoriteTime favoriteTime, FilterType.Sort sort, String str, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            list = c9526k0.f16624a;
        }
        if ((i9 & 2) != 0) {
            list2 = c9526k0.f16625b;
        }
        if ((i9 & 4) != 0) {
            questionState = c9526k0.f16626c;
        }
        if ((i9 & 8) != 0) {
            subject = c9526k0.f16627d;
        }
        if ((i9 & 16) != 0) {
            joinedTime = c9526k0.f16628e;
        }
        if ((i9 & 32) != 0) {
            updatedTime = c9526k0.f16629f;
        }
        if ((i9 & 64) != 0) {
            favoriteTime = c9526k0.f16630g;
        }
        if ((i9 & 128) != 0) {
            sort = c9526k0.f16631h;
        }
        if ((i9 & 256) != 0) {
            str = c9526k0.f16632i;
        }
        FilterType.Sort sort2 = sort;
        String str2 = str;
        FilterType.Time.UpdatedTime updatedTime2 = updatedTime;
        FilterType.Time.FavoriteTime favoriteTime2 = favoriteTime;
        FilterType.Time.JoinedTime joinedTime2 = joinedTime;
        FilterType.QuestionState questionState2 = questionState;
        return c9526k0.m15716a(list, list2, questionState2, subject, joinedTime2, updatedTime2, favoriteTime2, sort2, str2);
    }

    /* renamed from: a */
    public final C9526k0 m15716a(List checkedViewStatus, List checkedTeacherViewStatus, FilterType.QuestionState checkedQuestionState, FilterType.Subject checkedSubject, FilterType.Time.JoinedTime checkedJoinedTime, FilterType.Time.UpdatedTime checkedUpdatedTime, FilterType.Time.FavoriteTime checkedFavoriteTime, FilterType.Sort checkedSortType, String searchedKeyword) {
        Intrinsics.checkNotNullParameter(checkedViewStatus, "checkedViewStatus");
        Intrinsics.checkNotNullParameter(checkedTeacherViewStatus, "checkedTeacherViewStatus");
        Intrinsics.checkNotNullParameter(checkedQuestionState, "checkedQuestionState");
        Intrinsics.checkNotNullParameter(checkedSubject, "checkedSubject");
        Intrinsics.checkNotNullParameter(checkedJoinedTime, "checkedJoinedTime");
        Intrinsics.checkNotNullParameter(checkedUpdatedTime, "checkedUpdatedTime");
        Intrinsics.checkNotNullParameter(checkedFavoriteTime, "checkedFavoriteTime");
        Intrinsics.checkNotNullParameter(checkedSortType, "checkedSortType");
        Intrinsics.checkNotNullParameter(searchedKeyword, "searchedKeyword");
        return new C9526k0(checkedViewStatus, checkedTeacherViewStatus, checkedQuestionState, checkedSubject, checkedJoinedTime, checkedUpdatedTime, checkedFavoriteTime, checkedSortType, searchedKeyword);
    }

    /* renamed from: c */
    public final int m15717c() {
        List listListOf = CollectionsKt.listOf((Object[]) new Boolean[]{Boolean.valueOf(!Intrinsics.areEqual(this.f16624a, HomeKt.getInitialViewStatus())), Boolean.valueOf(!Intrinsics.areEqual(this.f16625b, HomeKt.getInitialTeacherViewStatus())), Boolean.valueOf(!Intrinsics.areEqual(this.f16626c, HomeKt.getInitialQuestionState())), Boolean.valueOf(!Intrinsics.areEqual(this.f16628e, HomeKt.getInitialJoinedTime())), Boolean.valueOf(!Intrinsics.areEqual(this.f16629f, HomeKt.getInitialUpdatedTime()))});
        int i9 = 0;
        if (listListOf != null && listListOf.isEmpty()) {
            return 0;
        }
        Iterator it = listListOf.iterator();
        while (it.hasNext()) {
            if (((Boolean) it.next()).booleanValue() && (i9 = i9 + 1) < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        return i9;
    }

    /* renamed from: d */
    public final FilterType.Time.FavoriteTime m15718d() {
        return this.f16630g;
    }

    /* renamed from: e */
    public final FilterType.Time.JoinedTime m15719e() {
        return this.f16628e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9526k0)) {
            return false;
        }
        C9526k0 c9526k0 = (C9526k0) obj;
        return Intrinsics.areEqual(this.f16624a, c9526k0.f16624a) && Intrinsics.areEqual(this.f16625b, c9526k0.f16625b) && Intrinsics.areEqual(this.f16626c, c9526k0.f16626c) && Intrinsics.areEqual(this.f16627d, c9526k0.f16627d) && Intrinsics.areEqual(this.f16628e, c9526k0.f16628e) && Intrinsics.areEqual(this.f16629f, c9526k0.f16629f) && Intrinsics.areEqual(this.f16630g, c9526k0.f16630g) && Intrinsics.areEqual(this.f16631h, c9526k0.f16631h) && Intrinsics.areEqual(this.f16632i, c9526k0.f16632i);
    }

    /* renamed from: f */
    public final FilterType.QuestionState m15720f() {
        return this.f16626c;
    }

    /* renamed from: g */
    public final FilterType.Sort m15721g() {
        return this.f16631h;
    }

    /* renamed from: h */
    public final FilterType.Subject m15722h() {
        return this.f16627d;
    }

    public int hashCode() {
        return (((((((((((((((this.f16624a.hashCode() * 31) + this.f16625b.hashCode()) * 31) + this.f16626c.hashCode()) * 31) + this.f16627d.hashCode()) * 31) + this.f16628e.hashCode()) * 31) + this.f16629f.hashCode()) * 31) + this.f16630g.hashCode()) * 31) + this.f16631h.hashCode()) * 31) + this.f16632i.hashCode();
    }

    /* renamed from: i */
    public final List m15723i() {
        return this.f16625b;
    }

    /* renamed from: j */
    public final FilterType.Time.UpdatedTime m15724j() {
        return this.f16629f;
    }

    /* renamed from: k */
    public final List m15725k() {
        return this.f16624a;
    }

    /* renamed from: l */
    public final boolean m15726l() {
        return Intrinsics.areEqual(this.f16631h, FilterType.Sort.SortByJoinedTime.INSTANCE);
    }

    /* renamed from: m */
    public final boolean m15727m() {
        return !Intrinsics.areEqual(this.f16627d, HomeKt.getInitialSubject());
    }

    /* renamed from: n */
    public final CollectSessionReq m15728n() {
        return new CollectSessionReq(this.f16632i, this.f16627d.getTopicId(), new JoinTimeReq(this.f16630g.getStart(), this.f16630g.getEnd()), 0, 20);
    }

    /* renamed from: o */
    public final SessionsReq m15729o(long j9) {
        String str = this.f16632i;
        int topicId = this.f16627d.getTopicId();
        Long lValueOf = Long.valueOf(j9);
        JoinTimeReq joinTimeReq = new JoinTimeReq(this.f16628e.getStart(), this.f16628e.getEnd());
        UpdateTimeReq updateTimeReq = new UpdateTimeReq(this.f16629f.getStart(), this.f16629f.getEnd());
        List list = this.f16624a;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((FilterType.ViewStatus) it.next()).getKey()));
        }
        List list2 = this.f16625b;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((FilterType.TeacherViewStatus) it2.next()).getKey()));
        }
        return new SessionsReq(str, topicId, lValueOf, joinTimeReq, updateTimeReq, arrayList, arrayList2, this.f16631h.getSortKey(), 0, 20, this.f16626c.getQuoraState());
    }

    public String toString() {
        return "FilterConditions(checkedViewStatus=" + this.f16624a + ", checkedTeacherViewStatus=" + this.f16625b + ", checkedQuestionState=" + this.f16626c + ", checkedSubject=" + this.f16627d + ", checkedJoinedTime=" + this.f16628e + ", checkedUpdatedTime=" + this.f16629f + ", checkedFavoriteTime=" + this.f16630g + ", checkedSortType=" + this.f16631h + ", searchedKeyword=" + this.f16632i + ")";
    }

    public /* synthetic */ C9526k0(List list, List list2, FilterType.QuestionState questionState, FilterType.Subject subject, FilterType.Time.JoinedTime joinedTime, FilterType.Time.UpdatedTime updatedTime, FilterType.Time.FavoriteTime favoriteTime, FilterType.Sort sort, String str, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? HomeKt.getInitialViewStatus() : list, (i9 & 2) != 0 ? HomeKt.getInitialTeacherViewStatus() : list2, (i9 & 4) != 0 ? HomeKt.getInitialQuestionState() : questionState, (i9 & 8) != 0 ? HomeKt.getInitialSubject() : subject, (i9 & 16) != 0 ? HomeKt.getInitialJoinedTime() : joinedTime, (i9 & 32) != 0 ? HomeKt.getInitialUpdatedTime() : updatedTime, (i9 & 64) != 0 ? HomeKt.getInitialFavoriteTime() : favoriteTime, (i9 & 128) != 0 ? HomeKt.getInitialSortType() : sort, (i9 & 256) != 0 ? "" : str);
    }
}
