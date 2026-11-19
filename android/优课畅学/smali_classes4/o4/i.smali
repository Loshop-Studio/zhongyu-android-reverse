.class public interface abstract Lo4/i;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract a(JLm7/c;)Ljava/lang/Object;
    .param p1    # J
        .annotation runtime Lfa/t;
            value = "superviseId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lm7/c<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/f;
        value = "SelfStudy/api/Supervise/GetSuperviseLearnerCount"
    .end annotation
.end method

.method public abstract b(Lcom/zykj/study/bean/DeleteSubBatchReq;Lm7/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/study/bean/DeleteSubBatchReq;
        .annotation runtime Lfa/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/bean/DeleteSubBatchReq;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/o;
        value = "SelfStudy/api/learn/deleteLearnersByCondition"
    .end annotation
.end method

.method public abstract c(JLm7/c;)Ljava/lang/Object;
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
            "Lcom/zykj/study/bean/OtherSubscribe;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/f;
        value = "SelfStudy/api/supervise/GetSuperviseTeachers"
    .end annotation
.end method

.method public abstract d(Lcom/zykj/study/bean/FreeSubscribeReq;Lm7/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/study/bean/FreeSubscribeReq;
        .annotation runtime Lfa/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/bean/FreeSubscribeReq;",
            "Lm7/c<",
            "-",
            "Lcom/zykj/study/bean/FreeSubscribeResp;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/o;
        value = "SelfStudy/api/learn/getCourseLearners"
    .end annotation
.end method

.method public abstract e(JLm7/c;)Ljava/lang/Object;
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
            "Lcom/zykj/study/bean/SelfSubscribeList;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/f;
        value = "SelfStudy/api/Supervise/GetSuperviseGroupMember"
    .end annotation
.end method

.method public abstract f(Lcom/zykj/study/bean/DeleteSubSingReq;Lm7/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/study/bean/DeleteSubSingReq;
        .annotation runtime Lfa/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/bean/DeleteSubSingReq;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/o;
        value = "SelfStudy/api/learn/deleteCourseLearner"
    .end annotation
.end method
