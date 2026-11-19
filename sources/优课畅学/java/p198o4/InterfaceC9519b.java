package p198o4;

import com.zykj.study.bean.Paging;
import com.zykj.study.bean.course.AuthorizeLessonReqBody;
import com.zykj.study.bean.course.BatchCatalogReq;
import com.zykj.study.bean.course.CatalogBean;
import com.zykj.study.bean.course.CatalogIdInput;
import com.zykj.study.bean.course.CatalogInput;
import com.zykj.study.bean.course.CatalogLockedBean;
import com.zykj.study.bean.course.CatalogUpdateInput;
import com.zykj.study.bean.course.CourseCreateInput;
import com.zykj.study.bean.course.CourseDeleteInput;
import com.zykj.study.bean.course.CourseDetailsBean;
import com.zykj.study.bean.course.CourseIdInput;
import com.zykj.study.bean.course.CourseSimpleBean;
import com.zykj.study.bean.course.CourseSubscribeInput;
import com.zykj.study.bean.course.ReorderCatalogReq;
import com.zykj.study.bean.course.SearchReqBody;
import com.zykj.study.bean.exercise.AuthorizeLesson;
import com.zykj.study.bean.exercise.QuestionGroupBean;
import com.zykj.study.bean.teach.TeachCourseAddInput;
import com.zykj.study.data.CourseStudyEntity;
import com.zykj.study.data.MyCourseEntity;
import java.util.List;
import p103fa.InterfaceC8487a;
import p103fa.InterfaceC8492f;
import p103fa.InterfaceC8501o;
import p103fa.InterfaceC8506t;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;

/* renamed from: o4.b */
/* loaded from: classes4.dex */
public interface InterfaceC9519b {
    /* renamed from: x */
    static /* synthetic */ Object m17683x(InterfaceC9519b interfaceC9519b, int i10, boolean z10, InterfaceC9324c interfaceC9324c, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: courseDetails");
        }
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return interfaceC9519b.m17703r(i10, z10, interfaceC9324c);
    }

    @InterfaceC8501o("SelfStudy/api/course/CancelCourseAuthorize")
    /* renamed from: A */
    Object m17684A(@InterfaceC8487a AuthorizeLessonReqBody authorizeLessonReqBody, InterfaceC9324c<Object> interfaceC9324c);

    @InterfaceC8492f("SelfStudy/api/Course/GetCatalogs")
    /* renamed from: B */
    Object m17685B(@InterfaceC8506t("id") int i10, InterfaceC9324c<? super List<CatalogBean>> interfaceC9324c);

    @InterfaceC8492f("SelfStudy/api/course/GetLockedCatalogs")
    /* renamed from: a */
    Object m17686a(@InterfaceC8506t("courseId") long j10, InterfaceC9324c<? super List<CatalogLockedBean>> interfaceC9324c);

    @InterfaceC8492f("SelfStudy/api/course/GetAuthorizedTeachers")
    /* renamed from: b */
    Object m17687b(@InterfaceC8506t("courseId") int i10, InterfaceC9324c<? super List<AuthorizeLesson>> interfaceC9324c);

    @InterfaceC8492f("SelfStudy/api/course/UnLockCatalog")
    /* renamed from: c */
    Object m17688c(@InterfaceC8506t("catalogId") long j10, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @InterfaceC8492f("SelfStudy/api/Learn/LearningCourses")
    /* renamed from: d */
    Object m17689d(@InterfaceC8506t("page") int i10, InterfaceC9324c<? super List<CourseStudyEntity>> interfaceC9324c);

    @InterfaceC8501o("SelfStudy/api/Learn/UnLearnCourse")
    /* renamed from: e */
    Object m17690e(@InterfaceC8487a CourseSubscribeInput courseSubscribeInput, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @InterfaceC8501o("SelfStudy/api/course/BatchLockCatalog")
    /* renamed from: f */
    Object m17691f(@InterfaceC8487a BatchCatalogReq batchCatalogReq, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @InterfaceC8501o("SelfStudy/api/Course/UpdateCatalog")
    /* renamed from: g */
    Object m17692g(@InterfaceC8487a CatalogUpdateInput catalogUpdateInput, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @InterfaceC8501o("SelfStudy/api/Learn/LearnCourse")
    /* renamed from: h */
    Object m17693h(@InterfaceC8487a CourseSubscribeInput courseSubscribeInput, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @InterfaceC8501o("SelfStudy/api/Course/CreatedCourses")
    /* renamed from: i */
    Object m17694i(@InterfaceC8487a Paging paging, InterfaceC9324c<? super List<MyCourseEntity>> interfaceC9324c);

    @InterfaceC8501o("SelfStudy/api/supervise/AddSuperviseCourse")
    /* renamed from: j */
    Object m17695j(@InterfaceC8487a TeachCourseAddInput teachCourseAddInput, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @InterfaceC8501o("SelfStudy/api/course/AdjustCatalog")
    /* renamed from: k */
    Object m17696k(@InterfaceC8487a ReorderCatalogReq reorderCatalogReq, InterfaceC9324c<Object> interfaceC9324c);

    @InterfaceC8492f("SelfStudy/api/Course/GetQuestionGroup")
    /* renamed from: l */
    Object m17697l(@InterfaceC8506t("id") int i10, InterfaceC9324c<? super QuestionGroupBean> interfaceC9324c);

    @InterfaceC8501o("SelfStudy/api/course/CourseAuthorize")
    /* renamed from: m */
    Object m17698m(@InterfaceC8487a AuthorizeLessonReqBody authorizeLessonReqBody, InterfaceC9324c<Object> interfaceC9324c);

    @InterfaceC8501o("SelfStudy/api/Account/SearchTeacher")
    /* renamed from: n */
    Object m17699n(@InterfaceC8487a SearchReqBody searchReqBody, InterfaceC9324c<? super List<AuthorizeLesson>> interfaceC9324c);

    @InterfaceC8501o("SelfStudy/api/course/BatchUnLockCatalog")
    /* renamed from: o */
    Object m17700o(@InterfaceC8487a BatchCatalogReq batchCatalogReq, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @InterfaceC8492f("SelfStudy/api/Channel/All")
    /* renamed from: p */
    Object m17701p(@InterfaceC8506t("page") int i10, @InterfaceC8506t("keyword") String str, InterfaceC9324c<? super List<? extends CourseSimpleBean>> interfaceC9324c);

    @InterfaceC8501o("SelfStudy/api/Course/AddCatalog")
    /* renamed from: q */
    Object m17702q(@InterfaceC8487a CatalogInput catalogInput, InterfaceC9324c<? super Integer> interfaceC9324c);

    @InterfaceC8492f("SelfStudy/api/Learn/CourseDetail")
    /* renamed from: r */
    Object m17703r(@InterfaceC8506t("id") int i10, @InterfaceC8506t("isVerify") boolean z10, InterfaceC9324c<? super CourseDetailsBean> interfaceC9324c);

    @InterfaceC8501o("SelfStudy/api/Course/Publish")
    /* renamed from: s */
    Object m17704s(@InterfaceC8487a CourseIdInput courseIdInput, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @InterfaceC8501o("SelfStudy/api/Course/Update")
    /* renamed from: t */
    Object m17705t(@InterfaceC8487a CourseCreateInput courseCreateInput, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @InterfaceC8501o("SelfStudy/api/Course/Create")
    /* renamed from: u */
    Object m17706u(@InterfaceC8487a CourseCreateInput courseCreateInput, InterfaceC9324c<? super Integer> interfaceC9324c);

    @InterfaceC8501o("SelfStudy/api/Course/Retreat")
    /* renamed from: v */
    Object m17707v(@InterfaceC8487a CourseIdInput courseIdInput, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @InterfaceC8501o("SelfStudy/api/Course/DeleteCatalog")
    /* renamed from: w */
    Object m17708w(@InterfaceC8487a CatalogIdInput catalogIdInput, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @InterfaceC8501o("SelfStudy/api/Course/Delete")
    /* renamed from: y */
    Object m17709y(@InterfaceC8487a CourseDeleteInput courseDeleteInput, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @InterfaceC8492f("SelfStudy/api/course/LockCatalog")
    /* renamed from: z */
    Object m17710z(@InterfaceC8506t("catalogId") long j10, InterfaceC9324c<? super C8736p> interfaceC9324c);
}
