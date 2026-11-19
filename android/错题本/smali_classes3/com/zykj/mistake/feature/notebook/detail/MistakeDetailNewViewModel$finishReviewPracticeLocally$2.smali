.class final Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$finishReviewPracticeLocally$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lr6/e;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/v;",
        "Ld6/s;",
        "<anonymous>",
        "(Lkotlinx/coroutines/v;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$finishReviewPracticeLocally$2"
    f = "MistakeDetailNewViewModel.kt"
    i = {}
    l = {
        0x4cf,
        0x4d4
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $hasVisibleDialog:Z

.field final synthetic $refreshNotebook:Z

.field final synthetic $refreshReviewHome:Z

.field label:I

.field final synthetic this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;


# direct methods
.method public constructor <init>(ZZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;ZLh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;",
            "Z",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$finishReviewPracticeLocally$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$finishReviewPracticeLocally$2;->$hasVisibleDialog:Z

    .line 2
    .line 3
    iput-boolean p2, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$finishReviewPracticeLocally$2;->$refreshReviewHome:Z

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$finishReviewPracticeLocally$2;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 6
    .line 7
    iput-boolean p4, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$finishReviewPracticeLocally$2;->$refreshNotebook:Z

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lh6/c<",
            "*>;)",
            "Lh6/c<",
            "Ld6/s;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$finishReviewPracticeLocally$2;

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$finishReviewPracticeLocally$2;->$hasVisibleDialog:Z

    .line 4
    .line 5
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$finishReviewPracticeLocally$2;->$refreshReviewHome:Z

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$finishReviewPracticeLocally$2;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 8
    .line 9
    iget-boolean v4, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$finishReviewPracticeLocally$2;->$refreshNotebook:Z

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$finishReviewPracticeLocally$2;-><init>(ZZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;ZLh6/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$finishReviewPracticeLocally$2;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/v;",
            "Lh6/c<",
            "-",
            "Ld6/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$finishReviewPracticeLocally$2;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$finishReviewPracticeLocally$2;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$finishReviewPracticeLocally$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$finishReviewPracticeLocally$2;->label:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    if-eq v1, v3, :cond_1

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto :goto_2

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p1

    .line 25
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-boolean p1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$finishReviewPracticeLocally$2;->$hasVisibleDialog:Z

    .line 33
    .line 34
    if-eqz p1, :cond_3

    .line 35
    .line 36
    iput v3, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$finishReviewPracticeLocally$2;->label:I

    .line 37
    .line 38
    const-wide/16 v3, 0x10

    .line 39
    .line 40
    invoke-static {v3, v4, p0}, Lkotlinx/coroutines/x;->i(JLh6/c;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    if-ne p1, v0, :cond_3

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_3
    :goto_0
    iget-boolean p1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$finishReviewPracticeLocally$2;->$refreshReviewHome:Z

    .line 48
    .line 49
    if-eqz p1, :cond_4

    .line 50
    .line 51
    iget-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$finishReviewPracticeLocally$2;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 52
    .line 53
    sget-object v1, Lcom/zykj/mistake/feature/notebook/detail/f1;->a:Lcom/zykj/mistake/feature/notebook/detail/f1;

    .line 54
    .line 55
    invoke-virtual {p1, v1}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->S(Lcom/zykj/mistake/feature/notebook/detail/k1;)V

    .line 56
    .line 57
    .line 58
    :cond_4
    iget-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$finishReviewPracticeLocally$2;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 59
    .line 60
    iget-object v1, p1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->g:Lkotlinx/coroutines/channels/b;

    .line 61
    .line 62
    new-instance v3, Lcom/zykj/mistake/feature/notebook/detail/r0;

    .line 63
    .line 64
    iget-boolean v4, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$finishReviewPracticeLocally$2;->$refreshNotebook:Z

    .line 65
    .line 66
    iget-object p1, p1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->e:Lkotlinx/coroutines/flow/n0;

    .line 67
    .line 68
    invoke-virtual {p1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    check-cast p1, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 73
    .line 74
    iget-object p1, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->x:Ljava/lang/Integer;

    .line 75
    .line 76
    iget-object v5, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$finishReviewPracticeLocally$2;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 77
    .line 78
    iget-object v5, v5, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->e:Lkotlinx/coroutines/flow/n0;

    .line 79
    .line 80
    invoke-virtual {v5}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    check-cast v5, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 85
    .line 86
    iget-boolean v5, v5, Lcom/zykj/mistake/feature/notebook/detail/m3;->y:Z

    .line 87
    .line 88
    invoke-direct {v3, v4, p1, v5}, Lcom/zykj/mistake/feature/notebook/detail/r0;-><init>(ZLjava/lang/Integer;Z)V

    .line 89
    .line 90
    .line 91
    iput v2, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$finishReviewPracticeLocally$2;->label:I

    .line 92
    .line 93
    invoke-interface {v1, p0, v3}, Lkotlinx/coroutines/channels/p;->q(Lh6/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    if-ne p1, v0, :cond_5

    .line 98
    .line 99
    :goto_1
    return-object v0

    .line 100
    :cond_5
    :goto_2
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 101
    .line 102
    return-object p1
.end method
