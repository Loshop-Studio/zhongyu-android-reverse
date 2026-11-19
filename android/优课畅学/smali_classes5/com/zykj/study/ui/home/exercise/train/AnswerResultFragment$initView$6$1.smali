.class final Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$initView$6$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;->initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
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
    c = "com.zykj.study.ui.home.exercise.train.AnswerResultFragment$initView$6$1"
    f = "AnswerResultFragment.kt"
    l = {
        0x82
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:I

.field public final synthetic d:Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$initView$6$1;->d:Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static synthetic c(Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$initView$6$1;->d(Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;)Lh7/p;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;->p(Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;)Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->C()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0, v0}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 18
    .line 19
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$initView$6$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$initView$6$1;->d:Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$initView$6$1;-><init>(Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$initView$6$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$initView$6$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$initView$6$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$initView$6$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$initView$6$1;->c:I

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
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$initView$6$1;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljava/lang/String;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$initView$6$1;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;

    .line 19
    .line 20
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$initView$6$1;->d:Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;

    .line 36
    .line 37
    invoke-static {v1}, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;->p(Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;)Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->A()Landroidx/lifecycle/MutableLiveData;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Ljava/lang/String;

    .line 50
    .line 51
    iget-object v3, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$initView$6$1;->d:Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;

    .line 52
    .line 53
    invoke-static {v3}, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;->p(Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;)Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    iput-object v1, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$initView$6$1;->a:Ljava/lang/Object;

    .line 58
    .line 59
    iput-object p1, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$initView$6$1;->b:Ljava/lang/Object;

    .line 60
    .line 61
    iput v2, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$initView$6$1;->c:I

    .line 62
    .line 63
    invoke-virtual {v3, p0}, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->x(Lm7/c;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    if-ne v3, v0, :cond_2

    .line 68
    .line 69
    return-object v0

    .line 70
    :cond_2
    move-object v0, p1

    .line 71
    move-object p1, v3

    .line 72
    :goto_0
    check-cast p1, Ll8/q;

    .line 73
    .line 74
    invoke-interface {p1}, Ll8/q;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    check-cast p1, Ljava/lang/Boolean;

    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    xor-int/2addr p1, v2

    .line 85
    iget-object v2, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$initView$6$1;->d:Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;

    .line 86
    .line 87
    new-instance v3, Lcom/zykj/study/ui/home/exercise/train/d;

    .line 88
    .line 89
    invoke-direct {v3, v2}, Lcom/zykj/study/ui/home/exercise/train/d;-><init>(Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;)V

    .line 90
    .line 91
    .line 92
    invoke-static {v1, v0, p1, v3}, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;->u(Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;Ljava/lang/String;ZLx7/a;)V

    .line 93
    .line 94
    .line 95
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 96
    .line 97
    return-object p1
.end method
