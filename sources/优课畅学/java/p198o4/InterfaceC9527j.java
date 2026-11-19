package p198o4;

import com.zykj.study.bean.course.CourseDetailsBean;
import com.zykj.study.bean.exercise.GroupStatistic;
import com.zykj.study.bean.teach.CatalogStudyProgress;
import com.zykj.study.bean.teach.CourseBindBean;
import com.zykj.study.bean.teach.CourseProgress;
import com.zykj.study.bean.teach.GetQuizDetailBean;
import com.zykj.study.bean.teach.GroupMember;
import com.zykj.study.bean.teach.QuizScore;
import com.zykj.study.bean.teach.SuperviseBindCourseInput;
import com.zykj.study.bean.teach.SuperviseGroup;
import com.zykj.study.bean.teach.SuperviseGroupRefreshInput;
import com.zykj.study.bean.teach.SuperviseGroupRemoveInput;
import com.zykj.study.bean.teach.TeachCourseRemoveInput;
import java.util.List;
import p103fa.InterfaceC8487a;
import p103fa.InterfaceC8492f;
import p103fa.InterfaceC8501o;
import p103fa.InterfaceC8506t;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;

/* renamed from: o4.j */
/* loaded from: classes4.dex */
public interface InterfaceC9527j {
    @InterfaceC8492f("SelfStudy/api/supervise/GetUserQuizStatistic")
    /* renamed from: a */
    Object m17736a(@InterfaceC8506t("questiongroupId") int i10, @InterfaceC8506t("userId") String str, InterfaceC9324c<? super GroupStatistic> interfaceC9324c);

    @InterfaceC8492f("SelfStudy/api/supervise/GetQuizDetail")
    /* renamed from: b */
    Object m17737b(@InterfaceC8506t("superviseId") int i10, @InterfaceC8506t("questionGroupId") int i11, InterfaceC9324c<? super List<GetQuizDetailBean>> interfaceC9324c);

    @InterfaceC8492f("SelfStudy/api/supervise/GetSuperviseGroups")
    /* renamed from: c */
    Object m17738c(@InterfaceC8506t("superviseId") int i10, @InterfaceC8506t("flag") int i11, InterfaceC9324c<? super List<SuperviseGroup>> interfaceC9324c);

    @InterfaceC8501o("SelfStudy/api/supervise/RemoveSuperviseGroup")
    /* renamed from: d */
    Object m17739d(@InterfaceC8487a SuperviseGroupRemoveInput superviseGroupRemoveInput, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @InterfaceC8501o("SelfStudy/api/supervise/RemoveSuperviseCourse")
    /* renamed from: e */
    Object m17740e(@InterfaceC8487a TeachCourseRemoveInput teachCourseRemoveInput, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @InterfaceC8492f("SelfStudy/api/Supervise/GetCourseProgressByCourseId")
    /* renamed from: f */
    Object m17741f(@InterfaceC8506t("courseId") int i10, InterfaceC9324c<? super CourseProgress> interfaceC9324c);

    @InterfaceC8492f("SelfStudy/api/Supervise/GetSuperviseCourses")
    /* renamed from: g */
    Object m17742g(@InterfaceC8506t("page") int i10, InterfaceC9324c<? super List<? extends CourseDetailsBean>> interfaceC9324c);

    @InterfaceC8492f("SelfStudy/api/supervise/GetQuizScores")
    /* renamed from: h */
    Object m17743h(@InterfaceC8506t("superviseId") int i10, @InterfaceC8506t("questionGroupId") int i11, InterfaceC9324c<? super QuizScore> interfaceC9324c);

    @InterfaceC8501o("SelfStudy/api/supervise/SyncSuperviseGroup")
    /* renamed from: i */
    Object m17744i(@InterfaceC8487a SuperviseGroupRefreshInput superviseGroupRefreshInput, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @InterfaceC8492f("SelfStudy/api/supervise/GetEzyCourses")
    /* renamed from: j */
    Object m17745j(@InterfaceC8506t("superviseId") int i10, InterfaceC9324c<? super List<CourseBindBean>> interfaceC9324c);

    @InterfaceC8492f("SelfStudy/api/supervise/GetMemberProgress")
    /* renamed from: k */
    Object m17746k(@InterfaceC8506t("groupId") int i10, @InterfaceC8506t("userId") String str, InterfaceC9324c<? super GroupMember> interfaceC9324c);

    @InterfaceC8492f("SelfStudy/api/supervise/GetCatalogProgressByCourseId")
    /* renamed from: l */
    Object m17747l(@InterfaceC8506t("courseId") int i10, @InterfaceC8506t("catalogId") int i11, InterfaceC9324c<? super CatalogStudyProgress> interfaceC9324c);

    @InterfaceC8501o("SelfStudy/api/supervise/BindEzyCourse")
    /* renamed from: m */
    Object m17748m(@InterfaceC8487a SuperviseBindCourseInput superviseBindCourseInput, InterfaceC9324c<? super C8736p> interfaceC9324c);
}
