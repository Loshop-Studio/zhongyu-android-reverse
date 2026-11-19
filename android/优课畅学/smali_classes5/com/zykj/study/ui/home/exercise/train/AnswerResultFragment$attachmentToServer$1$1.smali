.class final Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.zykj.study.ui.home.exercise.train.AnswerResultFragment$attachmentToServer$1$1"
    f = "AnswerResultFragment.kt"
    l = {
        0x120
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;

.field public final synthetic c:Lx7/a;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;Lx7/a;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1$1;->b:Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1$1;->c:Lx7/a;

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
    new-instance p1, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1$1;->b:Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1$1;->c:Lx7/a;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1$1;-><init>(Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;Lx7/a;Lm7/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1$1;->a:I

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
    iget-object p1, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1$1;->b:Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;->p(Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;)Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->v()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget-object v1, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1$1;->b:Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;

    .line 38
    .line 39
    sget-object v3, Lcom/zykj/blackboard/utils/BoardBox;->INSTANCE:Lcom/zykj/blackboard/utils/BoardBox;

    .line 40
    .line 41
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-virtual {v3, p1, v4}, Lcom/zykj/blackboard/utils/BoardBox;->clearLocalData(Ljava/lang/String;Landroid/content/Context;)V

    .line 46
    .line 47
    .line 48
    new-instance v3, Ljava/io/File;

    .line 49
    .line 50
    invoke-direct {v3, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-static {v3}, Lt7/h;->d(Ljava/io/File;)Z

    .line 54
    .line 55
    .line 56
    invoke-static {v1}, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;->p(Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;)Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->F()V

    .line 61
    .line 62
    .line 63
    invoke-static {}, Li8/i0;->c()Li8/h1;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    new-instance v1, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1$1$2;

    .line 68
    .line 69
    iget-object v3, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1$1;->c:Lx7/a;

    .line 70
    .line 71
    const/4 v4, 0x0

    .line 72
    invoke-direct {v1, v3, v4}, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1$1$2;-><init>(Lx7/a;Lm7/c;)V

    .line 73
    .line 74
    .line 75
    iput v2, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1$1;->a:I

    .line 76
    .line 77
    invoke-static {p1, v1, p0}, Li8/f;->g(Lkotlin/coroutines/d;Lx7/p;Lm7/c;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    if-ne p1, v0, :cond_2

    .line 82
    .line 83
    return-object v0

    .line 84
    :cond_2
    :goto_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 85
    .line 86
    return-object p1
.end method
