.class final Lcom/zykj/view/board/board/BoardViewModel$updatePenSizeLevel$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/board/BoardViewModel;->k1(I)V
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
    c = "com.zykj.view.board.board.BoardViewModel$updatePenSizeLevel$1"
    f = "BoardViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBoardViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel$updatePenSizeLevel$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1494:1\n226#2,5:1495\n*S KotlinDebug\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel$updatePenSizeLevel$1\n*L\n955#1:1495,5\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/view/board/board/BoardViewModel;

.field public final synthetic c:I


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/board/BoardViewModel;ILkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$updatePenSizeLevel$1;->b:Lcom/zykj/view/board/board/BoardViewModel;

    iput p2, p0, Lcom/zykj/view/board/board/BoardViewModel$updatePenSizeLevel$1;->c:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance p1, Lcom/zykj/view/board/board/BoardViewModel$updatePenSizeLevel$1;

    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel$updatePenSizeLevel$1;->b:Lcom/zykj/view/board/board/BoardViewModel;

    iget v1, p0, Lcom/zykj/view/board/board/BoardViewModel$updatePenSizeLevel$1;->c:I

    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/view/board/board/BoardViewModel$updatePenSizeLevel$1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;ILkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$updatePenSizeLevel$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$updatePenSizeLevel$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/board/board/BoardViewModel$updatePenSizeLevel$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$updatePenSizeLevel$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/view/board/board/BoardViewModel$updatePenSizeLevel$1;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$updatePenSizeLevel$1;->b:Lcom/zykj/view/board/board/BoardViewModel;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/zykj/view/board/board/BoardViewModel;->u(Lcom/zykj/view/board/board/BoardViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget v4, p0, Lcom/zykj/view/board/board/BoardViewModel$updatePenSizeLevel$1;->c:I

    .line 18
    .line 19
    :cond_0
    invoke-interface {p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v10

    .line 23
    move-object v0, v10

    .line 24
    check-cast v0, Lcom/zykj/view/board/board/q;

    .line 25
    .line 26
    const/16 v8, 0x77

    .line 27
    .line 28
    const/4 v9, 0x0

    .line 29
    const/4 v1, 0x0

    .line 30
    const/4 v2, 0x0

    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v5, 0x0

    .line 33
    const/4 v6, 0x0

    .line 34
    const/4 v7, 0x0

    .line 35
    invoke-static/range {v0 .. v9}, Lcom/zykj/view/board/board/q;->b(Lcom/zykj/view/board/board/q;ZZLcom/zykj/view/board/board/r;ILcom/zykj/view/board/board/p;IZILjava/lang/Object;)Lcom/zykj/view/board/board/q;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-interface {p1, v10, v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$updatePenSizeLevel$1;->b:Lcom/zykj/view/board/board/BoardViewModel;

    .line 46
    .line 47
    invoke-static {p1}, Lcom/zykj/view/board/board/BoardViewModel;->w(Lcom/zykj/view/board/board/BoardViewModel;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$updatePenSizeLevel$1;->b:Lcom/zykj/view/board/board/BoardViewModel;

    .line 51
    .line 52
    invoke-static {p1}, Lcom/zykj/view/board/board/BoardViewModel;->v(Lcom/zykj/view/board/board/BoardViewModel;)V

    .line 53
    .line 54
    .line 55
    iget p1, p0, Lcom/zykj/view/board/board/BoardViewModel$updatePenSizeLevel$1;->c:I

    .line 56
    .line 57
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {p1}, Lb8/v;->p(Ljava/lang/Integer;)V

    .line 62
    .line 63
    .line 64
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 65
    .line 66
    return-object p1

    .line 67
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 68
    .line 69
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 70
    .line 71
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw p1
.end method
