.class final Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$5;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

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
    c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$5"
    f = "BoardFragment.kt"
    i = {}
    l = {
        0x29b
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Lcom/zykj/view/board/board/BoardFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/board/BoardFragment;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/view/board/board/BoardFragment;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$5;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$5;->this$0:Lcom/zykj/view/board/board/BoardFragment;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 1
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
    new-instance p1, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$5;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$5;->this$0:Lcom/zykj/view/board/board/BoardFragment;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$5;-><init>(Lcom/zykj/view/board/board/BoardFragment;Lh6/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$5;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$5;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$5;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$5;->label:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$5;->this$0:Lcom/zykj/view/board/board/BoardFragment;

    .line 26
    .line 27
    invoke-static {p1}, Lcom/zykj/view/board/board/BoardFragment;->access$getMViewModel(Lcom/zykj/view/board/board/BoardFragment;)Lcom/zykj/view/board/board/BoardViewModel;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Lcom/zykj/view/board/board/BoardViewModel;->getExtraUIState()Lkotlinx/coroutines/flow/m0;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$5;->this$0:Lcom/zykj/view/board/board/BoardFragment;

    .line 36
    .line 37
    invoke-static {v1}, Lcom/zykj/view/board/board/BoardFragment;->access$getMViewModel(Lcom/zykj/view/board/board/BoardFragment;)Lcom/zykj/view/board/board/BoardViewModel;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Lcom/zykj/view/board/board/BoardViewModel;->getPenToolState()Lkotlinx/coroutines/flow/m0;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    new-instance v3, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$5$1;

    .line 46
    .line 47
    const/4 v4, 0x0

    .line 48
    invoke-direct {v3, v4}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$5$1;-><init>(Lh6/c;)V

    .line 49
    .line 50
    .line 51
    new-instance v5, Lkotlinx/coroutines/flow/v;

    .line 52
    .line 53
    invoke-direct {v5, p1, v1, v3}, Lkotlinx/coroutines/flow/v;-><init>(Lkotlinx/coroutines/flow/m0;Lkotlinx/coroutines/flow/m0;Lr6/f;)V

    .line 54
    .line 55
    .line 56
    instance-of p1, v5, Lkotlinx/coroutines/flow/m0;

    .line 57
    .line 58
    if-eqz p1, :cond_2

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    sget-object p1, Lkotlinx/coroutines/flow/h;->a:Le7/t;

    .line 62
    .line 63
    new-instance v1, Lkotlinx/coroutines/flow/e;

    .line 64
    .line 65
    invoke-direct {v1, v5, p1}, Lkotlinx/coroutines/flow/e;-><init>(Lkotlinx/coroutines/flow/f;Lr6/e;)V

    .line 66
    .line 67
    .line 68
    move-object v5, v1

    .line 69
    :goto_0
    new-instance p1, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$5$2;

    .line 70
    .line 71
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$5;->this$0:Lcom/zykj/view/board/board/BoardFragment;

    .line 72
    .line 73
    invoke-direct {p1, v1, v4}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$5$2;-><init>(Lcom/zykj/view/board/board/BoardFragment;Lh6/c;)V

    .line 74
    .line 75
    .line 76
    iput v2, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$5;->label:I

    .line 77
    .line 78
    invoke-static {v5, p1, p0}, Lkotlinx/coroutines/flow/h;->h(Lkotlinx/coroutines/flow/f;Lr6/e;Lh6/c;)Ljava/lang/Object;

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
    :goto_1
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 86
    .line 87
    return-object p1
.end method
