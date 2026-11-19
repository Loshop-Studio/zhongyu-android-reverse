.class public final Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;
.super Lcom/zykj/study/viewmodels/BaseExerciseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final k:Lcom/zykj/study/repository/ExerciseRepository;

.field public final l:Lcom/zykj/study/bean/DataStoreManager;

.field public final m:Landroidx/lifecycle/MutableLiveData;

.field public n:Ljava/lang/String;

.field public final o:Landroidx/lifecycle/MutableLiveData;

.field public final p:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

.field public q:Landroidx/lifecycle/MutableLiveData;

.field public r:Landroidx/lifecycle/MutableLiveData;

.field public s:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/study/repository/ExerciseRepository;Lcom/zykj/study/bean/DataStoreManager;)V
    .locals 1

    .line 1
    const-string v0, "repository"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "dataStoreManager"

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
    iput-object p1, p0, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->k:Lcom/zykj/study/repository/ExerciseRepository;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->l:Lcom/zykj/study/bean/DataStoreManager;

    .line 17
    .line 18
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 19
    .line 20
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->m:Landroidx/lifecycle/MutableLiveData;

    .line 24
    .line 25
    const-string p1, ""

    .line 26
    .line 27
    iput-object p1, p0, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->n:Ljava/lang/String;

    .line 28
    .line 29
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 30
    .line 31
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->o:Landroidx/lifecycle/MutableLiveData;

    .line 35
    .line 36
    new-instance p1, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 37
    .line 38
    invoke-direct {p1}, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->p:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 42
    .line 43
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 44
    .line 45
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->q:Landroidx/lifecycle/MutableLiveData;

    .line 49
    .line 50
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 51
    .line 52
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->r:Landroidx/lifecycle/MutableLiveData;

    .line 56
    .line 57
    const/4 p1, 0x1

    .line 58
    iput-boolean p1, p0, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->s:Z

    .line 59
    .line 60
    return-void
.end method

.method public static synthetic r(Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;Ljava/lang/Throwable;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->u(Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;Ljava/lang/Throwable;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic s(Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;)Lcom/zykj/study/bean/DataStoreManager;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->l:Lcom/zykj/study/bean/DataStoreManager;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final u(Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;Ljava/lang/Throwable;)Z
    .locals 5

    .line 1
    const-string v0, "e"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Lcom/zykj/http/exception/RemoteCodeException;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    const/4 v2, 0x0

    .line 10
    const/16 v3, 0x3fe

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    move-object v4, p1

    .line 15
    check-cast v4, Lcom/zykj/http/exception/RemoteCodeException;

    .line 16
    .line 17
    invoke-virtual {v4}, Lcom/zykj/http/exception/RemoteCodeException;->getErrorCodeInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-virtual {v4}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getCode()I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eq v4, v3, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v4, v2

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    :goto_0
    move v4, v1

    .line 31
    :goto_1
    iput-boolean v4, p0, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->s:Z

    .line 32
    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    check-cast p1, Lcom/zykj/http/exception/RemoteCodeException;

    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/zykj/http/exception/RemoteCodeException;->getErrorCodeInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getCode()I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-eq p0, v3, :cond_2

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    return v2

    .line 49
    :cond_3
    :goto_2
    return v1
.end method


# virtual methods
.method public final A()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->q:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final B()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->r:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final C()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->m:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final D()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->s:Z

    .line 2
    .line 3
    return v0
.end method

.method public final E(Ljava/lang/String;Z)V
    .locals 7

    .line 1
    const-string v0, "keyName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Li8/b0;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v4, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel$markExerciseRevised$1;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {v4, p0, p1, p2, v0}, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel$markExerciseRevised$1;-><init>(Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;Ljava/lang/String;ZLm7/c;)V

    .line 14
    .line 15
    .line 16
    const/4 v5, 0x3

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-static/range {v1 .. v6}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final F()V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Li8/b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel$removeRevisedKey$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, v1}, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel$removeRevisedKey$1;-><init>(Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;Lm7/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final G(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;II)V
    .locals 8

    .line 1
    const-string v0, "fragment"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0}, Lcom/zykj/base/BaseViewModel;->isDialogVisible()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v2, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel$saveScreenshot$1;

    .line 15
    .line 16
    const/4 v7, 0x0

    .line 17
    move-object v6, p0

    .line 18
    move-object v3, p1

    .line 19
    move v4, p2

    .line 20
    move v5, p3

    .line 21
    invoke-direct/range {v2 .. v7}, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel$saveScreenshot$1;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;IILcom/zykj/study/viewmodels/ExerciseTrainViewModel;Lm7/c;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0, v1, v2}, Lcom/zykj/base/BaseViewModel;->launchData(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;)Lkotlinx/coroutines/n;

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final H(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->n:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final I(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->s:Z

    .line 2
    .line 3
    return-void
.end method

.method public final J(IIILm7/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object p4, p0, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->p:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/zykj/base/BaseViewModel;->isDialogVisible()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel$startExercise$2;

    .line 8
    .line 9
    const/4 v6, 0x0

    .line 10
    move-object v2, p0

    .line 11
    move v3, p1

    .line 12
    move v4, p2

    .line 13
    move v5, p3

    .line 14
    invoke-direct/range {v1 .. v6}, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel$startExercise$2;-><init>(Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;IIILm7/c;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p4, v0, v1}, Lcom/zykj/base/BaseViewModel;->launchData(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;)Lkotlinx/coroutines/n;

    .line 18
    .line 19
    .line 20
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 21
    .line 22
    return-object p1
.end method

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

.method public final t(IILm7/c;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->o:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v5, v0

    .line 8
    check-cast v5, Lcom/zykj/study/bean/exercise/ExerciseBean;

    .line 9
    .line 10
    if-eqz v5, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 13
    .line 14
    .line 15
    move-result-object v7

    .line 16
    invoke-virtual {p0}, Lcom/zykj/base/BaseViewModel;->isDialogVisible()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 17
    .line 18
    .line 19
    move-result-object v8

    .line 20
    new-instance v1, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel$completeExercise$2$1;

    .line 21
    .line 22
    const/4 v6, 0x0

    .line 23
    move-object v2, p0

    .line 24
    move v3, p1

    .line 25
    move v4, p2

    .line 26
    invoke-direct/range {v1 .. v6}, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel$completeExercise$2$1;-><init>(Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;IILcom/zykj/study/bean/exercise/ExerciseBean;Lm7/c;)V

    .line 27
    .line 28
    .line 29
    new-instance v10, Lg5/q0;

    .line 30
    .line 31
    invoke-direct {v10, p0}, Lg5/q0;-><init>(Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;)V

    .line 32
    .line 33
    .line 34
    move-object v11, p3

    .line 35
    move-object v9, v1

    .line 36
    move-object v6, v2

    .line 37
    invoke-static/range {v6 .. v11}, Lcom/zykj/study/viewmodels/ViewModelExtKt;->a(Lcom/zykj/base/BaseViewModel;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;Lx7/l;Lm7/c;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1

    .line 42
    :cond_0
    const/4 p1, 0x0

    .line 43
    return-object p1
.end method

.method public final v()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->n:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final w()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->o:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final x(Lm7/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->l:Lcom/zykj/study/bean/DataStoreManager;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->n:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/zykj/study/bean/DataStoreManager;->exerciseRevised(Ljava/lang/String;)Ll8/c;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Li8/b0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v0, v1, p1}, Ll8/e;->Q(Ll8/c;Li8/b0;Lm7/c;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final y()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->p:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final z()Lcom/zykj/study/repository/ExerciseRepository;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->k:Lcom/zykj/study/repository/ExerciseRepository;

    .line 2
    .line 3
    return-object v0
.end method
