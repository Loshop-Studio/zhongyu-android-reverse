.class final Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$singleDetailFlow$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;-><init>(Lcom/zykj/study/repository/TeachCourseRepository;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lx7/q;"
    }
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.study.viewmodels.ExerciseStatisticsViewModel$singleDetailFlow$1"
    f = "ExerciseStatisticsViewModel.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public synthetic c:I


# direct methods
.method public constructor <init>(Lm7/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-direct {p0, v0, p1}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final c(Lcom/zykj/study/bean/teach/GetQuizDetailBean;ILm7/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$singleDetailFlow$1;

    .line 2
    .line 3
    invoke-direct {v0, p3}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$singleDetailFlow$1;-><init>(Lm7/c;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$singleDetailFlow$1;->b:Ljava/lang/Object;

    .line 7
    .line 8
    iput p2, v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$singleDetailFlow$1;->c:I

    .line 9
    .line 10
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$singleDetailFlow$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/zykj/study/bean/teach/GetQuizDetailBean;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Lm7/c;

    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$singleDetailFlow$1;->c(Lcom/zykj/study/bean/teach/GetQuizDetailBean;ILm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$singleDetailFlow$1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;

    .line 4
    .line 5
    iget v1, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$singleDetailFlow$1;->c:I

    .line 6
    .line 7
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    iget v2, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$singleDetailFlow$1;->a:I

    .line 11
    .line 12
    if-nez v2, :cond_3

    .line 13
    .line 14
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_0
    invoke-virtual {v0}, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->getStudentGroups()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    move-object v3, v2

    .line 40
    check-cast v3, Lcom/zykj/study/bean/teach/StuQuizBean;

    .line 41
    .line 42
    invoke-virtual {v3}, Lcom/zykj/study/bean/teach/StuQuizBean;->getGroupId()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-ne v3, v1, :cond_1

    .line 47
    .line 48
    move-object p1, v2

    .line 49
    :cond_2
    check-cast p1, Lcom/zykj/study/bean/teach/StuQuizBean;

    .line 50
    .line 51
    return-object p1

    .line 52
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1
.end method
