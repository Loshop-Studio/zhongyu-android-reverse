.class final Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel$uploadAnswer$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel;->n(ZLjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lx7/p;"
    }
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.study.viewmodels.TrainMultipleChoiceViewModel$uploadAnswer$1"
    f = "TrainMultipleChoiceViewModel.kt"
    l = {
        0x3c
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel;

.field public final synthetic c:Z

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel;ZLjava/lang/String;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel$uploadAnswer$1;->b:Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel;

    .line 2
    .line 3
    iput-boolean p2, p0, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel$uploadAnswer$1;->c:Z

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel$uploadAnswer$1;->d:Ljava/lang/String;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 3

    .line 1
    new-instance p1, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel$uploadAnswer$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel$uploadAnswer$1;->b:Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel;

    .line 4
    .line 5
    iget-boolean v1, p0, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel$uploadAnswer$1;->c:Z

    .line 6
    .line 7
    iget-object v2, p0, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel$uploadAnswer$1;->d:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel$uploadAnswer$1;-><init>(Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel;ZLjava/lang/String;Lm7/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel$uploadAnswer$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel$uploadAnswer$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel$uploadAnswer$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel$uploadAnswer$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel$uploadAnswer$1;->a:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    move-object v10, p0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p1

    .line 25
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel$uploadAnswer$1;->b:Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel;

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel;->j()Lcom/zykj/study/repository/ExerciseRepository;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    iget-object p1, p0, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel$uploadAnswer$1;->b:Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel;

    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/BaseTrainViewModel;->a()J

    .line 37
    .line 38
    .line 39
    move-result-wide v4

    .line 40
    iget-object p1, p0, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel$uploadAnswer$1;->b:Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel;

    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/BaseTrainViewModel;->b()I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    iget-object p1, p0, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel$uploadAnswer$1;->b:Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel;

    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/BaseTrainViewModel;->c()Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p1}, Lcom/zykj/study/bean/exercise/QuestionBean;->getId()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    iget-boolean v8, p0, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel$uploadAnswer$1;->c:Z

    .line 57
    .line 58
    iget-object v9, p0, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel$uploadAnswer$1;->d:Ljava/lang/String;

    .line 59
    .line 60
    iput v2, p0, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel$uploadAnswer$1;->a:I

    .line 61
    .line 62
    move-object v10, p0

    .line 63
    invoke-virtual/range {v3 .. v10}, Lcom/zykj/study/repository/ExerciseRepository;->m(JILjava/lang/String;ZLjava/lang/String;Lm7/c;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    if-ne p1, v0, :cond_2

    .line 68
    .line 69
    return-object v0

    .line 70
    :cond_2
    :goto_0
    iget-object p1, v10, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel$uploadAnswer$1;->b:Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel;

    .line 71
    .line 72
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/BaseTrainViewModel;->c()Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    sget-object v0, Lcom/zykj/study/bean/exercise/QuestionStatus;->ANSWERED:Lcom/zykj/study/bean/exercise/QuestionStatus;

    .line 77
    .line 78
    invoke-virtual {p1, v0}, Lcom/zykj/study/bean/exercise/QuestionBean;->setStatus(Lcom/zykj/study/bean/exercise/QuestionStatus;)V

    .line 79
    .line 80
    .line 81
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 82
    .line 83
    return-object p1
.end method
