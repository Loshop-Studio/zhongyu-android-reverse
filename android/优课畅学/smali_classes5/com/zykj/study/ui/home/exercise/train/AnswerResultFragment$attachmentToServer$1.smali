.class final Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;->x(Ljava/lang/String;ZLx7/a;)V
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
    c = "com.zykj.study.ui.home.exercise.train.AnswerResultFragment$attachmentToServer$1"
    f = "AnswerResultFragment.kt"
    l = {
        0x111,
        0x118,
        0x125
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;

.field public final synthetic c:Z

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lx7/a;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;ZLjava/lang/String;Lx7/a;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1;->b:Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;

    .line 2
    .line 3
    iput-boolean p2, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1;->c:Z

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1;->d:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1;->e:Lx7/a;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 6

    .line 1
    new-instance v0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1;->b:Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;

    .line 4
    .line 5
    iget-boolean v2, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1;->c:Z

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1;->d:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1;->e:Lx7/a;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1;-><init>(Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;ZLjava/lang/String;Lx7/a;Lm7/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1;->a:I

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v1, :cond_3

    .line 11
    .line 12
    if-eq v1, v4, :cond_2

    .line 13
    .line 14
    if-eq v1, v3, :cond_1

    .line 15
    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    goto :goto_0

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
    :goto_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    move-object v10, p0

    .line 31
    goto :goto_3

    .line 32
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    move-object v10, p0

    .line 36
    goto :goto_1

    .line 37
    :cond_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1;->b:Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;

    .line 41
    .line 42
    invoke-static {p1}, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;->s(Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;)Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    iget-object p1, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1;->b:Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;

    .line 47
    .line 48
    invoke-static {p1}, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;->s(Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;)Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/BaseTrainViewModel;->b()I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    iget-object p1, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1;->b:Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;

    .line 57
    .line 58
    invoke-static {p1}, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;->s(Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;)Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/BaseTrainViewModel;->c()Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Lcom/zykj/study/bean/exercise/QuestionBean;->getId()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    iget-boolean v8, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1;->c:Z

    .line 71
    .line 72
    iget-object v9, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1;->d:Ljava/lang/String;

    .line 73
    .line 74
    iput v4, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1;->a:I

    .line 75
    .line 76
    move-object v10, p0

    .line 77
    invoke-virtual/range {v5 .. v10}, Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel;->k(ILjava/lang/String;ZLjava/lang/String;Lm7/c;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    if-ne p1, v0, :cond_4

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_4
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    const/4 v1, 0x0

    .line 91
    if-eqz p1, :cond_5

    .line 92
    .line 93
    invoke-static {}, Li8/i0;->b()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    new-instance v2, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1$1;

    .line 98
    .line 99
    iget-object v4, v10, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1;->b:Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;

    .line 100
    .line 101
    iget-object v5, v10, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1;->e:Lx7/a;

    .line 102
    .line 103
    invoke-direct {v2, v4, v5, v1}, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1$1;-><init>(Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;Lx7/a;Lm7/c;)V

    .line 104
    .line 105
    .line 106
    iput v3, v10, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1;->a:I

    .line 107
    .line 108
    invoke-static {p1, v2, p0}, Li8/f;->g(Lkotlin/coroutines/d;Lx7/p;Lm7/c;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    if-ne p1, v0, :cond_6

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_5
    invoke-static {}, Li8/i0;->c()Li8/h1;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    new-instance v3, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1$2;

    .line 120
    .line 121
    iget-object v4, v10, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1;->b:Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;

    .line 122
    .line 123
    invoke-direct {v3, v4, v1}, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1$2;-><init>(Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;Lm7/c;)V

    .line 124
    .line 125
    .line 126
    iput v2, v10, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1;->a:I

    .line 127
    .line 128
    invoke-static {p1, v3, p0}, Li8/f;->g(Lkotlin/coroutines/d;Lx7/p;Lm7/c;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    if-ne p1, v0, :cond_6

    .line 133
    .line 134
    :goto_2
    return-object v0

    .line 135
    :cond_6
    :goto_3
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 136
    .line 137
    return-object p1
.end method
