.class public final Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel;
.super Lcom/zykj/study/viewmodels/BaseTrainViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final e:Lcom/zykj/study/repository/ExerciseRepository;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/study/repository/ExerciseRepository;)V
    .locals 1

    .line 1
    const-string v0, "repository"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/zykj/study/viewmodels/BaseTrainViewModel;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel;->e:Lcom/zykj/study/repository/ExerciseRepository;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final i()Lcom/zykj/study/repository/ExerciseRepository;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel;->e:Lcom/zykj/study/repository/ExerciseRepository;

    .line 2
    .line 3
    return-object v0
.end method

.method public j(Lm7/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p1, Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel$microList$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel$microList$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel$microList$1;->c:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel$microList$1;->c:I

    .line 18
    .line 19
    :goto_0
    move-object v5, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel$microList$1;

    .line 22
    .line 23
    invoke-direct {v0, p0, p1}, Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel$microList$1;-><init>(Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel;Lm7/c;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p1, v5, Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel$microList$1;->a:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget v1, v5, Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel$microList$1;->c:I

    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    if-ne v1, v2, :cond_1

    .line 39
    .line 40
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    new-instance v4, Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel$microList$2;

    .line 56
    .line 57
    const/4 p1, 0x0

    .line 58
    invoke-direct {v4, p0, p1}, Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel$microList$2;-><init>(Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel;Lm7/c;)V

    .line 59
    .line 60
    .line 61
    iput v2, v5, Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel$microList$1;->c:I

    .line 62
    .line 63
    const/4 v2, 0x0

    .line 64
    const/4 v3, 0x0

    .line 65
    const/4 v6, 0x3

    .line 66
    const/4 v7, 0x0

    .line 67
    move-object v1, p0

    .line 68
    invoke-static/range {v1 .. v7}, Lcom/zykj/base/BaseViewModel;->launchAsyncData$default(Lcom/zykj/base/BaseViewModel;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;Lm7/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    if-ne p1, v0, :cond_3

    .line 73
    .line 74
    return-object v0

    .line 75
    :cond_3
    :goto_2
    check-cast p1, Ljava/util/List;

    .line 76
    .line 77
    if-nez p1, :cond_4

    .line 78
    .line 79
    invoke-static {}, Li7/v;->n()Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    :cond_4
    return-object p1
.end method

.method public final k(ILjava/lang/String;ZLjava/lang/String;Lm7/c;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p5, Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel$uploadAnswerMicro$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel$uploadAnswerMicro$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel$uploadAnswerMicro$1;->g:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel$uploadAnswerMicro$1;->g:I

    .line 18
    .line 19
    :goto_0
    move-object v8, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel$uploadAnswerMicro$1;

    .line 22
    .line 23
    invoke-direct {v0, p0, p5}, Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel$uploadAnswerMicro$1;-><init>(Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel;Lm7/c;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p5, v8, Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel$uploadAnswerMicro$1;->e:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget v1, v8, Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel$uploadAnswerMicro$1;->g:I

    .line 34
    .line 35
    const/4 v9, 0x1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    if-ne v1, v9, :cond_1

    .line 39
    .line 40
    iget-object p1, v8, Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel$uploadAnswerMicro$1;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Ljava/lang/String;

    .line 43
    .line 44
    iget-object p1, v8, Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel$uploadAnswerMicro$1;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {p5}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_2
    invoke-static {p5}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/BaseTrainViewModel;->c()Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 64
    .line 65
    .line 66
    move-result-object p5

    .line 67
    invoke-virtual {p5}, Lcom/zykj/study/bean/exercise/QuestionBean;->getStatus()Lcom/zykj/study/bean/exercise/QuestionStatus;

    .line 68
    .line 69
    .line 70
    move-result-object p5

    .line 71
    sget-object v1, Lcom/zykj/study/bean/exercise/QuestionStatus;->UN_ANSWERED:Lcom/zykj/study/bean/exercise/QuestionStatus;

    .line 72
    .line 73
    if-eq p5, v1, :cond_3

    .line 74
    .line 75
    if-eqz p3, :cond_5

    .line 76
    .line 77
    :cond_3
    iget-object v1, p0, Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel;->e:Lcom/zykj/study/repository/ExerciseRepository;

    .line 78
    .line 79
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/BaseTrainViewModel;->a()J

    .line 80
    .line 81
    .line 82
    move-result-wide v2

    .line 83
    invoke-static {p2}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p5

    .line 87
    iput-object p5, v8, Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel$uploadAnswerMicro$1;->b:Ljava/lang/Object;

    .line 88
    .line 89
    invoke-static {p4}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p5

    .line 93
    iput-object p5, v8, Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel$uploadAnswerMicro$1;->c:Ljava/lang/Object;

    .line 94
    .line 95
    iput p1, v8, Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel$uploadAnswerMicro$1;->a:I

    .line 96
    .line 97
    iput-boolean p3, v8, Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel$uploadAnswerMicro$1;->d:Z

    .line 98
    .line 99
    iput v9, v8, Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel$uploadAnswerMicro$1;->g:I

    .line 100
    .line 101
    move v4, p1

    .line 102
    move-object v5, p2

    .line 103
    move v6, p3

    .line 104
    move-object v7, p4

    .line 105
    invoke-virtual/range {v1 .. v8}, Lcom/zykj/study/repository/ExerciseRepository;->l(JILjava/lang/String;ZLjava/lang/String;Lm7/c;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    if-ne p1, v0, :cond_4

    .line 110
    .line 111
    return-object v0

    .line 112
    :cond_4
    :goto_2
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/BaseTrainViewModel;->c()Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    sget-object p2, Lcom/zykj/study/bean/exercise/QuestionStatus;->ANSWERED:Lcom/zykj/study/bean/exercise/QuestionStatus;

    .line 117
    .line 118
    invoke-virtual {p1, p2}, Lcom/zykj/study/bean/exercise/QuestionBean;->setStatus(Lcom/zykj/study/bean/exercise/QuestionStatus;)V

    .line 119
    .line 120
    .line 121
    :cond_5
    invoke-static {v9}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    return-object p1
.end method
