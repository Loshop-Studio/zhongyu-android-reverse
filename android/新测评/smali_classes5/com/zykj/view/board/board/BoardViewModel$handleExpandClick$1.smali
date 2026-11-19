.class final Lcom/zykj/view/board/board/BoardViewModel$handleExpandClick$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/board/BoardViewModel;->c0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.view.board.board.BoardViewModel$handleExpandClick$1"
    f = "BoardViewModel.kt"
    i = {
        0x0
    }
    l = {
        0x35e
    }
    m = "invokeSuspend"
    n = {
        "isOpen"
    }
    s = {
        "Z$0"
    }
.end annotation


# instance fields
.field public a:Z

.field public b:I

.field public final synthetic c:Lcom/zykj/view/board/board/BoardViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/board/BoardViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$handleExpandClick$1;->c:Lcom/zykj/view/board/board/BoardViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1

    new-instance p1, Lcom/zykj/view/board/board/BoardViewModel$handleExpandClick$1;

    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel$handleExpandClick$1;->c:Lcom/zykj/view/board/board/BoardViewModel;

    invoke-direct {p1, v0, p2}, Lcom/zykj/view/board/board/BoardViewModel$handleExpandClick$1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$handleExpandClick$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$handleExpandClick$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/board/board/BoardViewModel$handleExpandClick$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$handleExpandClick$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/view/board/board/BoardViewModel$handleExpandClick$1;->b:I

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
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

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
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$handleExpandClick$1;->c:Lcom/zykj/view/board/board/BoardViewModel;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/zykj/view/board/board/BoardViewModel;->r(Lcom/zykj/view/board/board/BoardViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-interface {p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Lcom/zykj/view/board/board/h;

    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/zykj/view/board/board/h;->b()Lcom/zykj/view/board/board/i;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    sget-object v1, Lcom/zykj/view/board/board/i$a;->b:Lcom/zykj/view/board/board/i$a;

    .line 44
    .line 45
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardViewModel$handleExpandClick$1;->c:Lcom/zykj/view/board/board/BoardViewModel;

    .line 50
    .line 51
    invoke-static {v1}, Lcom/zykj/view/board/board/BoardViewModel;->q(Lcom/zykj/view/board/board/BoardViewModel;)Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    new-instance v3, Lcom/zykj/view/board/board/c$a;

    .line 56
    .line 57
    invoke-direct {v3, p1}, Lcom/zykj/view/board/board/c$a;-><init>(Z)V

    .line 58
    .line 59
    .line 60
    iput-boolean p1, p0, Lcom/zykj/view/board/board/BoardViewModel$handleExpandClick$1;->a:Z

    .line 61
    .line 62
    iput v2, p0, Lcom/zykj/view/board/board/BoardViewModel$handleExpandClick$1;->b:I

    .line 63
    .line 64
    invoke-interface {v1, v3, p0}, Lkotlinx/coroutines/flow/MutableSharedFlow;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-ne p1, v0, :cond_2

    .line 69
    .line 70
    return-object v0

    .line 71
    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 72
    .line 73
    return-object p1
.end method
