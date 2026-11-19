.class public Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel;
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
    iput-object p1, p0, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel;->e:Lcom/zykj/study/repository/ExerciseRepository;

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic m(Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel;Lm7/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p1, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel$microList$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel$microList$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel$microList$1;->d:I

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
    iput v1, v0, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel$microList$1;->d:I

    .line 18
    .line 19
    :goto_0
    move-object v5, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel$microList$1;

    .line 22
    .line 23
    invoke-direct {v0, p0, p1}, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel$microList$1;-><init>(Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel;Lm7/c;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p1, v5, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel$microList$1;->b:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget v1, v5, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel$microList$1;->d:I

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
    iget-object p0, v5, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel$microList$1;->a:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p0, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel;

    .line 43
    .line 44
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p0

    .line 56
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    new-instance v4, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel$microList$2;

    .line 60
    .line 61
    const/4 p1, 0x0

    .line 62
    invoke-direct {v4, p0, p1}, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel$microList$2;-><init>(Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel;Lm7/c;)V

    .line 63
    .line 64
    .line 65
    invoke-static {p0}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iput-object p1, v5, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel$microList$1;->a:Ljava/lang/Object;

    .line 70
    .line 71
    iput v2, v5, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel$microList$1;->d:I

    .line 72
    .line 73
    const/4 v2, 0x0

    .line 74
    const/4 v3, 0x0

    .line 75
    const/4 v6, 0x3

    .line 76
    const/4 v7, 0x0

    .line 77
    move-object v1, p0

    .line 78
    invoke-static/range {v1 .. v7}, Lcom/zykj/base/BaseViewModel;->launchAsyncData$default(Lcom/zykj/base/BaseViewModel;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;Lm7/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    if-ne p1, v0, :cond_3

    .line 83
    .line 84
    return-object v0

    .line 85
    :cond_3
    :goto_2
    check-cast p1, Ljava/util/List;

    .line 86
    .line 87
    if-nez p1, :cond_4

    .line 88
    .line 89
    invoke-static {}, Li7/v;->n()Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0

    .line 94
    :cond_4
    return-object p1
.end method


# virtual methods
.method public final i(Lcom/zykj/study/utils/ChoiceList;)Z
    .locals 1

    .line 1
    const-string v0, "answerList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/BaseTrainViewModel;->c()Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/zykj/study/bean/exercise/QuestionBean;->getStandardAnswerList()Lcom/zykj/study/utils/ChoiceList;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0, p1, v0}, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel;->k(Ljava/util/List;Ljava/util/List;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {p1}, Lcom/zykj/study/utils/ChoiceList;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p0, v0, p1}, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel;->n(ZLjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return v0
.end method

.method public final j()Lcom/zykj/study/repository/ExerciseRepository;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel;->e:Lcom/zykj/study/repository/ExerciseRepository;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k(Ljava/util/List;Ljava/util/List;)Z
    .locals 1

    .line 1
    invoke-static {p1, p2}, Li7/f0;->D0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p2, p1}, Li7/f0;->D0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    return p1

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    return p1
.end method

.method public l(Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel;->m(Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel;Lm7/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final n(ZLjava/lang/String;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/BaseTrainViewModel;->c()Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/study/bean/exercise/QuestionBean;->getStatus()Lcom/zykj/study/bean/exercise/QuestionStatus;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lcom/zykj/study/bean/exercise/QuestionStatus;->UN_ANSWERED:Lcom/zykj/study/bean/exercise/QuestionStatus;

    .line 10
    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-void

    .line 17
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    new-instance v5, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel$uploadAnswer$1;

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-direct {v5, p0, p1, p2, v0}, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel$uploadAnswer$1;-><init>(Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel;ZLjava/lang/String;Lm7/c;)V

    .line 25
    .line 26
    .line 27
    const/4 v6, 0x2

    .line 28
    const/4 v7, 0x0

    .line 29
    const/4 v4, 0x0

    .line 30
    move-object v2, p0

    .line 31
    invoke-static/range {v2 .. v7}, Lcom/zykj/base/BaseViewModel;->launch$default(Lcom/zykj/base/BaseViewModel;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 32
    .line 33
    .line 34
    return-void
.end method
