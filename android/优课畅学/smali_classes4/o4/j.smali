.class public interface abstract Lo4/j;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract a(ILjava/lang/String;Lm7/c;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lfa/t;
            value = "questiongroupId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lfa/t;
            value = "userId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Lm7/c<",
            "-",
            "Lcom/zykj/study/bean/exercise/GroupStatistic;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/f;
        value = "SelfStudy/api/supervise/GetUserQuizStatistic"
    .end annotation
.end method

.method public abstract b(IILm7/c;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lfa/t;
            value = "superviseId"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lfa/t;
            value = "questionGroupId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lm7/c<",
            "-",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/teach/GetQuizDetailBean;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/f;
        value = "SelfStudy/api/supervise/GetQuizDetail"
    .end annotation
.end method

.method public abstract c(IILm7/c;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lfa/t;
            value = "superviseId"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lfa/t;
            value = "flag"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lm7/c<",
            "-",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/teach/SuperviseGroup;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/f;
        value = "SelfStudy/api/supervise/GetSuperviseGroups"
    .end annotation
.end method

.method public abstract d(Lcom/zykj/study/bean/teach/SuperviseGroupRemoveInput;Lm7/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/study/bean/teach/SuperviseGroupRemoveInput;
        .annotation runtime Lfa/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/bean/teach/SuperviseGroupRemoveInput;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/o;
        value = "SelfStudy/api/supervise/RemoveSuperviseGroup"
    .end annotation
.end method

.method public abstract e(Lcom/zykj/study/bean/teach/TeachCourseRemoveInput;Lm7/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/study/bean/teach/TeachCourseRemoveInput;
        .annotation runtime Lfa/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/bean/teach/TeachCourseRemoveInput;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/o;
        value = "SelfStudy/api/supervise/RemoveSuperviseCourse"
    .end annotation
.end method

.method public abstract f(ILm7/c;)Ljava/lang/Object;
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
            "Lcom/zykj/study/bean/teach/CourseProgress;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/f;
        value = "SelfStudy/api/Supervise/GetCourseProgressByCourseId"
    .end annotation
.end method

.method public abstract g(ILm7/c;)Ljava/lang/Object;
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
            "+",
            "Lcom/zykj/study/bean/course/CourseDetailsBean;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/f;
        value = "SelfStudy/api/Supervise/GetSuperviseCourses"
    .end annotation
.end method

.method public abstract h(IILm7/c;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lfa/t;
            value = "superviseId"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lfa/t;
            value = "questionGroupId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lm7/c<",
            "-",
            "Lcom/zykj/study/bean/teach/QuizScore;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/f;
        value = "SelfStudy/api/supervise/GetQuizScores"
    .end annotation
.end method

.method public abstract i(Lcom/zykj/study/bean/teach/SuperviseGroupRefreshInput;Lm7/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/study/bean/teach/SuperviseGroupRefreshInput;
        .annotation runtime Lfa/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/bean/teach/SuperviseGroupRefreshInput;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/o;
        value = "SelfStudy/api/supervise/SyncSuperviseGroup"
    .end annotation
.end method

.method public abstract j(ILm7/c;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lfa/t;
            value = "superviseId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lm7/c<",
            "-",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/teach/CourseBindBean;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/f;
        value = "SelfStudy/api/supervise/GetEzyCourses"
    .end annotation
.end method

.method public abstract k(ILjava/lang/String;Lm7/c;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lfa/t;
            value = "groupId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lfa/t;
            value = "userId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Lm7/c<",
            "-",
            "Lcom/zykj/study/bean/teach/GroupMember;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/f;
        value = "SelfStudy/api/supervise/GetMemberProgress"
    .end annotation
.end method

.method public abstract l(IILm7/c;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lfa/t;
            value = "courseId"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lfa/t;
            value = "catalogId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lm7/c<",
            "-",
            "Lcom/zykj/study/bean/teach/CatalogStudyProgress;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/f;
        value = "SelfStudy/api/supervise/GetCatalogProgressByCourseId"
    .end annotation
.end method

.method public abstract m(Lcom/zykj/study/bean/teach/SuperviseBindCourseInput;Lm7/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/study/bean/teach/SuperviseBindCourseInput;
        .annotation runtime Lfa/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/bean/teach/SuperviseBindCourseInput;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/o;
        value = "SelfStudy/api/supervise/BindEzyCourse"
    .end annotation
.end method
