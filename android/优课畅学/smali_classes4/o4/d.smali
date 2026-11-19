.class public interface abstract Lo4/d;
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

.method public abstract b(ILjava/lang/String;Lm7/c;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lfa/t;
            value = "groupId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lfa/t;
            value = "questionId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Lm7/c<",
            "-",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/exercise/MicroBean;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/f;
        value = "SelfStudy/api/course/GetQuestionExplain"
    .end annotation
.end method

.method public abstract c(IILjava/lang/String;Lm7/c;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lfa/t;
            value = "superviseId"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lfa/t;
            value = "catalogId"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lfa/t;
            value = "userId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/lang/String;",
            "Lm7/c<",
            "-",
            "Lcom/zykj/study/bean/exercise/GroupStatistic;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/f;
        value = "SelfStudy/api/supervise/GetUserQuizStatistics"
    .end annotation
.end method

.method public abstract d(Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;Lm7/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;
        .annotation runtime Lfa/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/o;
        value = "SelfStudy/api/learn/updateQuiz"
    .end annotation
.end method

.method public abstract e(IILm7/c;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lfa/t;
            value = "courseId"
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
            "Lcom/zykj/study/bean/exercise/GroupStatistic;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/f;
        value = "SelfStudy/api/Supervise/GetGroupQuizStatistics"
    .end annotation
.end method

.method public abstract f(IILm7/c;)Ljava/lang/Object;
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
            "Lcom/zykj/study/bean/CourseContentDetailBean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/f;
        value = "SelfStudy/api/learn/ReadContent"
    .end annotation
.end method

.method public abstract g(Lcom/zykj/study/bean/exercise/ExerciseInput;Lm7/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/study/bean/exercise/ExerciseInput;
        .annotation runtime Lfa/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/bean/exercise/ExerciseInput;",
            "Lm7/c<",
            "-",
            "Lcom/zykj/study/bean/exercise/ExerciseBean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/o;
        value = "SelfStudy/api/learn/showQuiz"
    .end annotation
.end method

.method public abstract h(Lcom/zykj/study/bean/exercise/ExerciseInput;Lm7/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/study/bean/exercise/ExerciseInput;
        .annotation runtime Lfa/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/bean/exercise/ExerciseInput;",
            "Lm7/c<",
            "-",
            "Lcom/zykj/study/bean/exercise/ExerciseBean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/o;
        value = "SelfStudy/api/learn/startQuiz"
    .end annotation
.end method

.method public abstract i(Lcom/zykj/study/bean/exercise/AnswerResultInput;Lm7/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/study/bean/exercise/AnswerResultInput;
        .annotation runtime Lfa/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/bean/exercise/AnswerResultInput;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/o;
        value = "SelfStudy/api/learn/updateQuiz"
    .end annotation
.end method

.method public abstract j(Lcom/zykj/study/bean/exercise/MicroDeleteInput;Lm7/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/study/bean/exercise/MicroDeleteInput;
        .annotation runtime Lfa/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/bean/exercise/MicroDeleteInput;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/o;
        value = "SelfStudy/api/course/DeleteQuestionExplain"
    .end annotation
.end method

.method public abstract k(Lcom/zykj/study/bean/exercise/CompleteExerciseInput;Lm7/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/study/bean/exercise/CompleteExerciseInput;
        .annotation runtime Lfa/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/bean/exercise/CompleteExerciseInput;",
            "Lm7/c<",
            "-",
            "Lcom/zykj/study/bean/exercise/ExerciseBean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/o;
        value = "SelfStudy/api/learn/CompleteQuiz"
    .end annotation
.end method

.method public abstract l(Lcom/zykj/study/bean/exercise/MicroAddInput;Lm7/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/study/bean/exercise/MicroAddInput;
        .annotation runtime Lfa/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/bean/exercise/MicroAddInput;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/o;
        value = "SelfStudy/api/course/AddQuestionExplain"
    .end annotation
.end method
