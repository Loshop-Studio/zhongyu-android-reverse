.class final Lcom/zykj/study/viewmodels/StudentExercisesViewModel$initUserQuizStatistics$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/StudentExercisesViewModel;->d(IILjava/lang/String;IZ)V
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
    c = "com.zykj.study.viewmodels.StudentExercisesViewModel$initUserQuizStatistics$1"
    f = "StudentExercisesViewModel.kt"
    l = {
        0x22,
        0x24
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Z

.field public final synthetic c:Lcom/zykj/study/viewmodels/StudentExercisesViewModel;

.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public constructor <init>(ZLcom/zykj/study/viewmodels/StudentExercisesViewModel;ILjava/lang/String;IILm7/c;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/study/viewmodels/StudentExercisesViewModel$initUserQuizStatistics$1;->b:Z

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/viewmodels/StudentExercisesViewModel$initUserQuizStatistics$1;->c:Lcom/zykj/study/viewmodels/StudentExercisesViewModel;

    .line 4
    .line 5
    iput p3, p0, Lcom/zykj/study/viewmodels/StudentExercisesViewModel$initUserQuizStatistics$1;->d:I

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/study/viewmodels/StudentExercisesViewModel$initUserQuizStatistics$1;->e:Ljava/lang/String;

    .line 8
    .line 9
    iput p5, p0, Lcom/zykj/study/viewmodels/StudentExercisesViewModel$initUserQuizStatistics$1;->f:I

    .line 10
    .line 11
    iput p6, p0, Lcom/zykj/study/viewmodels/StudentExercisesViewModel$initUserQuizStatistics$1;->g:I

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 8

    .line 1
    new-instance v0, Lcom/zykj/study/viewmodels/StudentExercisesViewModel$initUserQuizStatistics$1;

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/zykj/study/viewmodels/StudentExercisesViewModel$initUserQuizStatistics$1;->b:Z

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/study/viewmodels/StudentExercisesViewModel$initUserQuizStatistics$1;->c:Lcom/zykj/study/viewmodels/StudentExercisesViewModel;

    .line 6
    .line 7
    iget v3, p0, Lcom/zykj/study/viewmodels/StudentExercisesViewModel$initUserQuizStatistics$1;->d:I

    .line 8
    .line 9
    iget-object v4, p0, Lcom/zykj/study/viewmodels/StudentExercisesViewModel$initUserQuizStatistics$1;->e:Ljava/lang/String;

    .line 10
    .line 11
    iget v5, p0, Lcom/zykj/study/viewmodels/StudentExercisesViewModel$initUserQuizStatistics$1;->f:I

    .line 12
    .line 13
    iget v6, p0, Lcom/zykj/study/viewmodels/StudentExercisesViewModel$initUserQuizStatistics$1;->g:I

    .line 14
    .line 15
    move-object v7, p2

    .line 16
    invoke-direct/range {v0 .. v7}, Lcom/zykj/study/viewmodels/StudentExercisesViewModel$initUserQuizStatistics$1;-><init>(ZLcom/zykj/study/viewmodels/StudentExercisesViewModel;ILjava/lang/String;IILm7/c;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/StudentExercisesViewModel$initUserQuizStatistics$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/viewmodels/StudentExercisesViewModel$initUserQuizStatistics$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/viewmodels/StudentExercisesViewModel$initUserQuizStatistics$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/StudentExercisesViewModel$initUserQuizStatistics$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/study/viewmodels/StudentExercisesViewModel$initUserQuizStatistics$1;->a:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v3, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto :goto_2

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-boolean p1, p0, Lcom/zykj/study/viewmodels/StudentExercisesViewModel$initUserQuizStatistics$1;->b:Z

    .line 35
    .line 36
    if-eqz p1, :cond_4

    .line 37
    .line 38
    iget-object p1, p0, Lcom/zykj/study/viewmodels/StudentExercisesViewModel$initUserQuizStatistics$1;->c:Lcom/zykj/study/viewmodels/StudentExercisesViewModel;

    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/StudentExercisesViewModel;->b()Lcom/zykj/study/repository/ExerciseRepository;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iget v1, p0, Lcom/zykj/study/viewmodels/StudentExercisesViewModel$initUserQuizStatistics$1;->d:I

    .line 45
    .line 46
    iget-object v2, p0, Lcom/zykj/study/viewmodels/StudentExercisesViewModel$initUserQuizStatistics$1;->e:Ljava/lang/String;

    .line 47
    .line 48
    iput v3, p0, Lcom/zykj/study/viewmodels/StudentExercisesViewModel$initUserQuizStatistics$1;->a:I

    .line 49
    .line 50
    invoke-virtual {p1, v1, v2, p0}, Lcom/zykj/study/repository/ExerciseRepository;->h(ILjava/lang/String;Lm7/c;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-ne p1, v0, :cond_3

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    :goto_0
    check-cast p1, Lcom/zykj/study/bean/exercise/GroupStatistic;

    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_4
    iget-object p1, p0, Lcom/zykj/study/viewmodels/StudentExercisesViewModel$initUserQuizStatistics$1;->c:Lcom/zykj/study/viewmodels/StudentExercisesViewModel;

    .line 61
    .line 62
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/StudentExercisesViewModel;->b()Lcom/zykj/study/repository/ExerciseRepository;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iget v1, p0, Lcom/zykj/study/viewmodels/StudentExercisesViewModel$initUserQuizStatistics$1;->f:I

    .line 67
    .line 68
    iget v3, p0, Lcom/zykj/study/viewmodels/StudentExercisesViewModel$initUserQuizStatistics$1;->g:I

    .line 69
    .line 70
    iget-object v4, p0, Lcom/zykj/study/viewmodels/StudentExercisesViewModel$initUserQuizStatistics$1;->e:Ljava/lang/String;

    .line 71
    .line 72
    iput v2, p0, Lcom/zykj/study/viewmodels/StudentExercisesViewModel$initUserQuizStatistics$1;->a:I

    .line 73
    .line 74
    invoke-virtual {p1, v1, v3, v4, p0}, Lcom/zykj/study/repository/ExerciseRepository;->i(IILjava/lang/String;Lm7/c;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    if-ne p1, v0, :cond_5

    .line 79
    .line 80
    :goto_1
    return-object v0

    .line 81
    :cond_5
    :goto_2
    check-cast p1, Lcom/zykj/study/bean/exercise/GroupStatistic;

    .line 82
    .line 83
    :goto_3
    iget-object v0, p0, Lcom/zykj/study/viewmodels/StudentExercisesViewModel$initUserQuizStatistics$1;->c:Lcom/zykj/study/viewmodels/StudentExercisesViewModel;

    .line 84
    .line 85
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/StudentExercisesViewModel;->c()Landroidx/lifecycle/MutableLiveData;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {v1, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1}, Lcom/zykj/study/bean/exercise/GroupStatistic;->getQuestionGroups()Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    if-nez v1, :cond_6

    .line 97
    .line 98
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/StudentExercisesViewModel;->a()Landroidx/lifecycle/MutableLiveData;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    const/4 v0, 0x0

    .line 103
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_6
    invoke-virtual {p1}, Lcom/zykj/study/bean/exercise/GroupStatistic;->getQuestionGroups()Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-static {p1}, Li7/f0;->n0(Ljava/util/List;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    check-cast p1, Lcom/zykj/study/bean/exercise/ExerciseBean;

    .line 116
    .line 117
    if-eqz p1, :cond_7

    .line 118
    .line 119
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/StudentExercisesViewModel;->a()Landroidx/lifecycle/MutableLiveData;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    :cond_7
    :goto_4
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 127
    .line 128
    return-object p1
.end method
