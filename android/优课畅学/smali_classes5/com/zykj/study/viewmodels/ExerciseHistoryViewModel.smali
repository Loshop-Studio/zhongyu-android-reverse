# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class public final Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel;
.super Lcom/zykj/study/viewmodels/BaseExerciseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final k:Lcom/zykj/study/repository/ExerciseRepository;

.field public final l:Landroidx/datastore/core/DataStore;

.field public final m:Landroidx/lifecycle/MutableLiveData;

.field public final n:Ll8/q;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/study/repository/ExerciseRepository;Landroidx/datastore/core/DataStore;)V
    .locals 7

    .line 1
    const-string v0, "repository"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "userDataStore"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel;->k:Lcom/zykj/study/repository/ExerciseRepository;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel;->l:Landroidx/datastore/core/DataStore;

    .line 17
    .line 18
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 19
    .line 20
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel;->m:Landroidx/lifecycle/MutableLiveData;

    .line 24
    .line 25
    invoke-interface {p2}, Landroidx/datastore/core/DataStore;->getData()Ll8/c;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    new-instance p2, Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel$special$$inlined$map$1;

    .line 30
    .line 31
    invoke-direct {p2, p1}, Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel$special$$inlined$map$1;-><init>(Ll8/c;)V

    .line 32
    .line 33
    .line 34
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Li8/b0;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    sget-object v0, Lkotlinx/coroutines/flow/a;->a:Lkotlinx/coroutines/flow/a$a;

    .line 39
    .line 40
    const/4 v5, 0x2

    .line 41
    const/4 v6, 0x0

    .line 42
    const-wide/16 v1, 0x1388

    .line 43
    .line 44
    const-wide/16 v3, 0x0

    .line 45
    .line 46
    invoke-static/range {v0 .. v6}, Lkotlinx/coroutines/flow/a$a;->b(Lkotlinx/coroutines/flow/a$a;JJILjava/lang/Object;)Lkotlinx/coroutines/flow/a;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 51
    .line 52
    invoke-static {p2, p1, v0, v1}, Ll8/e;->R(Ll8/c;Li8/b0;Lkotlinx/coroutines/flow/a;Ljava/lang/Object;)Ll8/q;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iput-object p1, p0, Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel;->n:Ll8/q;

    .line 57
    .line 58
    return-void
.end method


# virtual methods
.method public p()V
    .locals 0

    .line 1
    return-void
.end method

.method public q()V
    .locals 0

    .line 1
    return-void
.end method

.method public final r()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel;->m:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s()Lcom/zykj/study/repository/ExerciseRepository;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel;->k:Lcom/zykj/study/repository/ExerciseRepository;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->h()Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/util/List;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object v0, v1

    .line 22
    :goto_0
    if-nez v0, :cond_2

    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->e()Landroidx/lifecycle/MutableLiveData;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 v0, 0x0

    .line 29
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->f()Landroidx/lifecycle/MutableLiveData;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->h()Landroidx/lifecycle/MutableLiveData;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Ljava/util/List;

    .line 49
    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    invoke-static {v0}, Li7/f0;->n0(Ljava/util/List;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    move-object v1, v0

    .line 57
    check-cast v1, Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 58
    .line 59
    :cond_1
    invoke-virtual {p1, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->e()Landroidx/lifecycle/MutableLiveData;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {v1, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->f()Landroidx/lifecycle/MutableLiveData;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public final u()Ll8/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel;->n:Ll8/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final v(IIILm7/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 2
    .line 3
    .line 4
    move-result-object p4

    .line 5
    invoke-virtual {p0}, Lcom/zykj/base/BaseViewModel;->isDialogVisible()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel$loadDetails$2;

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    move-object v2, p0

    .line 13
    move v3, p1

    .line 14
    move v4, p2

    .line 15
    move v5, p3

    .line 16
    invoke-direct/range {v1 .. v6}, Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel$loadDetails$2;-><init>(Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel;IIILm7/c;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p4, v0, v1}, Lcom/zykj/base/BaseViewModel;->launchData(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;)Lkotlinx/coroutines/n;

    .line 20
    .line 21
    .line 22
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 23
    .line 24
    return-object p1
.end method

.method public final w(ILjava/lang/String;Lm7/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p3, Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel$microList$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel$microList$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel$microList$1;->e:I

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
    iput v1, v0, Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel$microList$1;->e:I

    .line 18
    .line 19
    :goto_0
    move-object v5, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel$microList$1;

    .line 22
    .line 23
    invoke-direct {v0, p0, p3}, Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel$microList$1;-><init>(Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel;Lm7/c;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p3, v5, Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel$microList$1;->c:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget v1, v5, Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel$microList$1;->e:I

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
    iget-object p1, v5, Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel$microList$1;->b:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_2
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    new-instance v4, Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel$microList$2;

    .line 60
    .line 61
    const/4 p3, 0x0

    .line 62
    invoke-direct {v4, p0, p1, p2, p3}, Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel$microList$2;-><init>(Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel;ILjava/lang/String;Lm7/c;)V

    .line 63
    .line 64
    .line 65
    invoke-static {p2}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    iput-object p2, v5, Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel$microList$1;->b:Ljava/lang/Object;

    .line 70
    .line 71
    iput p1, v5, Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel$microList$1;->a:I

    .line 72
    .line 73
    iput v2, v5, Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel$microList$1;->e:I

    .line 74
    .line 75
    const/4 v2, 0x0

    .line 76
    const/4 v3, 0x0

    .line 77
    const/4 v6, 0x3

    .line 78
    const/4 v7, 0x0

    .line 79
    move-object v1, p0

    .line 80
    invoke-static/range {v1 .. v7}, Lcom/zykj/base/BaseViewModel;->launchAsyncData$default(Lcom/zykj/base/BaseViewModel;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;Lm7/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p3

    .line 84
    if-ne p3, v0, :cond_3

    .line 85
    .line 86
    return-object v0

    .line 87
    :cond_3
    :goto_2
    check-cast p3, Ljava/util/List;

    .line 88
    .line 89
    if-nez p3, :cond_4

    .line 90
    .line 91
    invoke-static {}, Li7/v;->n()Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    return-object p1

    .line 96
    :cond_4
    return-object p3
.end method
