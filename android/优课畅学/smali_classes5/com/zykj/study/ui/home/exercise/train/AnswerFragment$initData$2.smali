.class final Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$initData$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;->initData(Lm7/c;)Ljava/lang/Object;
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
    c = "com.zykj.study.ui.home.exercise.train.AnswerFragment$initData$2"
    f = "AnswerFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$initData$2;->b:Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;

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


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$initData$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$initData$2;->b:Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$initData$2;-><init>(Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$initData$2;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$initData$2;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$initData$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$initData$2;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$initData$2;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$initData$2;->b:Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;->r()Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$initData$2;->b:Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;

    .line 18
    .line 19
    invoke-static {v0}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;->n(Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;)Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;->a()J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    invoke-virtual {p1, v0, v1}, Lcom/zykj/study/viewmodels/BaseTrainViewModel;->e(J)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$initData$2;->b:Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;

    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;->r()Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$initData$2;->b:Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;

    .line 37
    .line 38
    invoke-static {v0}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;->n(Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;)Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;->b()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    invoke-virtual {p1, v0}, Lcom/zykj/study/viewmodels/BaseTrainViewModel;->f(I)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$initData$2;->b:Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;

    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;->r()Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$initData$2;->b:Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;

    .line 56
    .line 57
    invoke-static {v0}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;->n(Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;)Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;->c()Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {p1, v0}, Lcom/zykj/study/viewmodels/BaseTrainViewModel;->h(Lcom/zykj/study/bean/exercise/QuestionBean;)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$initData$2;->b:Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;

    .line 69
    .line 70
    invoke-virtual {p1}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;->r()Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$initData$2;->b:Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;

    .line 75
    .line 76
    invoke-static {v0}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;->n(Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;)Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v0}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;->d()Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    invoke-virtual {p1, v0}, Lcom/zykj/study/viewmodels/BaseTrainViewModel;->g(Z)V

    .line 85
    .line 86
    .line 87
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 88
    .line 89
    return-object p1

    .line 90
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 91
    .line 92
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 93
    .line 94
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw p1
.end method
