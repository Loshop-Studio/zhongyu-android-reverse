.class public interface abstract Lo4/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic x(Lo4/b;IZLm7/c;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-nez p5, :cond_1

    .line 2
    .line 3
    and-int/lit8 p4, p4, 0x2

    .line 4
    .line 5
    if-eqz p4, :cond_0

    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    :cond_0
    invoke-interface {p0, p1, p2, p3}, Lo4/b;->r(IZLm7/c;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    const-string p1, "Super calls with default arguments not supported in this target, function: courseDetails"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
.end method


# virtual methods
.method public abstract A(Lcom/zykj/study/bean/course/AuthorizeLessonReqBody;Lm7/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/study/bean/course/AuthorizeLessonReqBody;
        .annotation runtime Lfa/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/bean/course/AuthorizeLessonReqBody;",
            "Lm7/c<",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/o;
        value = "SelfStudy/api/course/CancelCourseAuthorize"
    .end annotation
.end method

.method public abstract B(ILm7/c;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lfa/t;
            value = "id"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lm7/c<",
            "-",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/course/CatalogBean;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/f;
        value = "SelfStudy/api/Course/GetCatalogs"
    .end annotation
.end method

.method public abstract a(JLm7/c;)Ljava/lang/Object;
    .param p1    # J
        .annotation runtime Lfa/t;
            value = "courseId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lm7/c<",
            "-",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/course/CatalogLockedBean;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/f;
        value = "SelfStudy/api/course/GetLockedCatalogs"
    .end annotation
.end method

.method public abstract b(ILm7/c;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lfa/t;
            value = "courseId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lm7/c<",
            "-",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/exercise/AuthorizeLesson;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/f;
        value = "SelfStudy/api/course/GetAuthorizedTeachers"
    .end annotation
.end method

.method public abstract c(JLm7/c;)Ljava/lang/Object;
    .param p1    # J
        .annotation runtime Lfa/t;
            value = "catalogId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/f;
        value = "SelfStudy/api/course/UnLockCatalog"
    .end annotation
.end method

.method public abstract d(ILm7/c;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lfa/t;
            value = "page"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lm7/c<",
            "-",
            "Ljava/util/List<",
            "Lcom/zykj/study/data/CourseStudyEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/f;
        value = "SelfStudy/api/Learn/LearningCourses"
    .end annotation
.end method

.method public abstract e(Lcom/zykj/study/bean/course/CourseSubscribeInput;Lm7/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/study/bean/course/CourseSubscribeInput;
        .annotation runtime Lfa/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/bean/course/CourseSubscribeInput;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/o;
        value = "SelfStudy/api/Learn/UnLearnCourse"
    .end annotation
.end method

.method public abstract f(Lcom/zykj/study/bean/course/BatchCatalogReq;Lm7/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/study/bean/course/BatchCatalogReq;
        .annotation runtime Lfa/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/bean/course/BatchCatalogReq;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/o;
        value = "SelfStudy/api/course/BatchLockCatalog"
    .end annotation
.end method

.method public abstract g(Lcom/zykj/study/bean/course/CatalogUpdateInput;Lm7/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/study/bean/course/CatalogUpdateInput;
        .annotation runtime Lfa/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/bean/course/CatalogUpdateInput;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/o;
        value = "SelfStudy/api/Course/UpdateCatalog"
    .end annotation
.end method

.method public abstract h(Lcom/zykj/study/bean/course/CourseSubscribeInput;Lm7/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/study/bean/course/CourseSubscribeInput;
        .annotation runtime Lfa/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/bean/course/CourseSubscribeInput;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/o;
        value = "SelfStudy/api/Learn/LearnCourse"
    .end annotation
.end method

.method public abstract i(Lcom/zykj/study/bean/Paging;Lm7/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/study/bean/Paging;
        .annotation runtime Lfa/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/bean/Paging;",
            "Lm7/c<",
            "-",
            "Ljava/util/List<",
            "Lcom/zykj/study/data/MyCourseEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/o;
        value = "SelfStudy/api/Course/CreatedCourses"
    .end annotation
.end method

.method public abstract j(Lcom/zykj/study/bean/teach/TeachCourseAddInput;Lm7/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/study/bean/teach/TeachCourseAddInput;
        .annotation runtime Lfa/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/bean/teach/TeachCourseAddInput;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/o;
        value = "SelfStudy/api/supervise/AddSuperviseCourse"
    .end annotation
.end method

.method public abstract k(Lcom/zykj/study/bean/course/ReorderCatalogReq;Lm7/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/study/bean/course/ReorderCatalogReq;
        .annotation runtime Lfa/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/bean/course/ReorderCatalogReq;",
            "Lm7/c<",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/o;
        value = "SelfStudy/api/course/AdjustCatalog"
    .end annotation
.end method

.method public abstract l(ILm7/c;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lfa/t;
            value = "id"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lm7/c<",
            "-",
            "Lcom/zykj/study/bean/exercise/QuestionGroupBean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/f;
        value = "SelfStudy/api/Course/GetQuestionGroup"
    .end annotation
.end method

.method public abstract m(Lcom/zykj/study/bean/course/AuthorizeLessonReqBody;Lm7/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/study/bean/course/AuthorizeLessonReqBody;
        .annotation runtime Lfa/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/bean/course/AuthorizeLessonReqBody;",
            "Lm7/c<",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/o;
        value = "SelfStudy/api/course/CourseAuthorize"
    .end annotation
.end method

.method public abstract n(Lcom/zykj/study/bean/course/SearchReqBody;Lm7/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/study/bean/course/SearchReqBody;
        .annotation runtime Lfa/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/bean/course/SearchReqBody;",
            "Lm7/c<",
            "-",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/exercise/AuthorizeLesson;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/o;
        value = "SelfStudy/api/Account/SearchTeacher"
    .end annotation
.end method

.method public abstract o(Lcom/zykj/study/bean/course/BatchCatalogReq;Lm7/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/study/bean/course/BatchCatalogReq;
        .annotation runtime Lfa/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/bean/course/BatchCatalogReq;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/o;
        value = "SelfStudy/api/course/BatchUnLockCatalog"
    .end annotation
.end method

.method public abstract p(ILjava/lang/String;Lm7/c;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lfa/t;
            value = "page"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lfa/t;
            value = "keyword"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Lm7/c<",
            "-",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/study/bean/course/CourseSimpleBean;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/f;
        value = "SelfStudy/api/Channel/All"
    .end annotation
.end method

.method public abstract q(Lcom/zykj/study/bean/course/CatalogInput;Lm7/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/study/bean/course/CatalogInput;
        .annotation runtime Lfa/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/bean/course/CatalogInput;",
            "Lm7/c<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/o;
        value = "SelfStudy/api/Course/AddCatalog"
    .end annotation
.end method

.method public abstract r(IZLm7/c;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lfa/t;
            value = "id"
        .end annotation
    .end param
    .param p2    # Z
        .annotation runtime Lfa/t;
            value = "isVerify"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZ",
            "Lm7/c<",
            "-",
            "Lcom/zykj/study/bean/course/CourseDetailsBean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/f;
        value = "SelfStudy/api/Learn/CourseDetail"
    .end annotation
.end method

.method public abstract s(Lcom/zykj/study/bean/course/CourseIdInput;Lm7/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/study/bean/course/CourseIdInput;
        .annotation runtime Lfa/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/bean/course/CourseIdInput;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/o;
        value = "SelfStudy/api/Course/Publish"
    .end annotation
.end method

.method public abstract t(Lcom/zykj/study/bean/course/CourseCreateInput;Lm7/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/study/bean/course/CourseCreateInput;
        .annotation runtime Lfa/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/bean/course/CourseCreateInput;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/o;
        value = "SelfStudy/api/Course/Update"
    .end annotation
.end method

.method public abstract u(Lcom/zykj/study/bean/course/CourseCreateInput;Lm7/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/study/bean/course/CourseCreateInput;
        .annotation runtime Lfa/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/bean/course/CourseCreateInput;",
            "Lm7/c<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/o;
        value = "SelfStudy/api/Course/Create"
    .end annotation
.end method

.method public abstract v(Lcom/zykj/study/bean/course/CourseIdInput;Lm7/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/study/bean/course/CourseIdInput;
        .annotation runtime Lfa/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/bean/course/CourseIdInput;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/o;
        value = "SelfStudy/api/Course/Retreat"
    .end annotation
.end method

.method public abstract w(Lcom/zykj/study/bean/course/CatalogIdInput;Lm7/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/study/bean/course/CatalogIdInput;
        .annotation runtime Lfa/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/bean/course/CatalogIdInput;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/o;
        value = "SelfStudy/api/Course/DeleteCatalog"
    .end annotation
.end method

.method public abstract y(Lcom/zykj/study/bean/course/CourseDeleteInput;Lm7/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/study/bean/course/CourseDeleteInput;
        .annotation runtime Lfa/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/bean/course/CourseDeleteInput;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/o;
        value = "SelfStudy/api/Course/Delete"
    .end annotation
.end method

.method public abstract z(JLm7/c;)Ljava/lang/Object;
    .param p1    # J
        .annotation runtime Lfa/t;
            value = "catalogId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/f;
        value = "SelfStudy/api/course/LockCatalog"
    .end annotation
.end method
