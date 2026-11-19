.class final Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel$loadGroupDetails$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel;->w(I)V
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
    c = "com.zykj.study.viewmodels.ExerciseStudentHistoryViewModel$loadGroupDetails$1"
    f = "ExerciseStudentHistoryViewModel.kt"
    l = {
        0x20
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel;

.field public final synthetic c:I


# direct methods
.method public constructor <init>(Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel;ILm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel$loadGroupDetails$1;->b:Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel;

    .line 2
    .line 3
    iput p2, p0, Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel$loadGroupDetails$1;->c:I

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 2

    .line 1
    new-instance p1, Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel$loadGroupDetails$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel$loadGroupDetails$1;->b:Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel;

    .line 4
    .line 5
    iget v1, p0, Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel$loadGroupDetails$1;->c:I

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel$loadGroupDetails$1;-><init>(Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel;ILm7/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel$loadGroupDetails$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel$loadGroupDetails$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel$loadGroupDetails$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel$loadGroupDetails$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel$loadGroupDetails$1;->a:I

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
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel$loadGroupDetails$1;->b:Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel;

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel;->t()Lcom/zykj/study/repository/ExerciseRepository;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget v1, p0, Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel$loadGroupDetails$1;->c:I

    .line 34
    .line 35
    iput v2, p0, Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel$loadGroupDetails$1;->a:I

    .line 36
    .line 37
    invoke-virtual {p1, v1, p0}, Lcom/zykj/study/repository/ExerciseRepository;->g(ILm7/c;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-ne p1, v0, :cond_2

    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel$loadGroupDetails$1;->b:Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel;

    .line 45
    .line 46
    check-cast p1, Lcom/zykj/study/bean/exercise/QuestionGroupBean;

    .line 47
    .line 48
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel;->s()Landroidx/lifecycle/MutableLiveData;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v1, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Lcom/zykj/study/bean/exercise/QuestionGroupBean;->getRounds()Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-static {p1}, Li7/f0;->n0(Ljava/util/List;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, Lcom/zykj/study/bean/exercise/RoundBean;

    .line 64
    .line 65
    if-eqz p1, :cond_3

    .line 66
    .line 67
    invoke-virtual {p1}, Lcom/zykj/study/bean/exercise/RoundBean;->getQuestions()Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    if-eqz p1, :cond_3

    .line 72
    .line 73
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->h()Landroidx/lifecycle/MutableLiveData;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v1, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->j()Landroidx/lifecycle/MutableLiveData;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    invoke-static {p1}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    :cond_3
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 96
    .line 97
    return-object p1
.end method
