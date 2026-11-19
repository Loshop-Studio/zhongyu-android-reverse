.class final Lcom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/simple/SimpleViewModel;->l(Z)V
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
    c = "com.zykj.view.board.simple.SimpleViewModel$updateExpandState$1"
    f = "SimpleViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSimpleViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleViewModel.kt\ncom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,242:1\n226#2,5:243\n226#2,5:248\n*S KotlinDebug\n*F\n+ 1 SimpleViewModel.kt\ncom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1\n*L\n216#1:243,5\n225#1:248,5\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/view/board/simple/SimpleViewModel;

.field public final synthetic c:Z


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/simple/SimpleViewModel;ZLkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1;->b:Lcom/zykj/view/board/simple/SimpleViewModel;

    iput-boolean p2, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1;->c:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance p1, Lcom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1;

    iget-object v0, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1;->b:Lcom/zykj/view/board/simple/SimpleViewModel;

    iget-boolean v1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1;->c:Z

    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1;-><init>(Lcom/zykj/view/board/simple/SimpleViewModel;ZLkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_4

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1;->b:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleViewModel;->b(Lcom/zykj/view/board/simple/SimpleViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-boolean v0, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1;->c:Z

    .line 18
    .line 19
    :cond_0
    invoke-interface {p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    move-object v2, v1

    .line 24
    check-cast v2, Lcom/zykj/view/board/simple/e;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    sget-object v3, Lcom/zykj/view/board/board/i$b;->b:Lcom/zykj/view/board/board/i$b;

    .line 29
    .line 30
    :goto_0
    move-object v10, v3

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    sget-object v3, Lcom/zykj/view/board/board/i$a;->b:Lcom/zykj/view/board/board/i$a;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :goto_1
    const/16 v11, 0x7f

    .line 36
    .line 37
    const/4 v12, 0x0

    .line 38
    const/4 v3, 0x0

    .line 39
    const/4 v4, 0x0

    .line 40
    const/4 v5, 0x0

    .line 41
    const/4 v6, 0x0

    .line 42
    const/4 v7, 0x0

    .line 43
    const/4 v8, 0x0

    .line 44
    const/4 v9, 0x0

    .line 45
    invoke-static/range {v2 .. v12}, Lcom/zykj/view/board/simple/e;->b(Lcom/zykj/view/board/simple/e;ZLcom/zykj/view/board/board/n;Lcom/zykj/view/board/board/o;Lcom/zykj/view/board/simple/d;Lcom/zykj/view/board/simple/c;Lcom/zykj/view/board/board/p;Lcom/zykj/view/board/board/g;Lcom/zykj/view/board/board/i;ILjava/lang/Object;)Lcom/zykj/view/board/simple/e;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-interface {p1, v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_0

    .line 54
    .line 55
    iget-boolean p1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1;->c:Z

    .line 56
    .line 57
    if-nez p1, :cond_3

    .line 58
    .line 59
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1;->b:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 60
    .line 61
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleViewModel;->b(Lcom/zykj/view/board/simple/SimpleViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    :cond_2
    invoke-interface {p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    move-object v1, v0

    .line 70
    check-cast v1, Lcom/zykj/view/board/simple/e;

    .line 71
    .line 72
    sget-object v4, Lcom/zykj/view/board/board/o$d;->f:Lcom/zykj/view/board/board/o$d;

    .line 73
    .line 74
    const/16 v10, 0xfb

    .line 75
    .line 76
    const/4 v11, 0x0

    .line 77
    const/4 v2, 0x0

    .line 78
    const/4 v3, 0x0

    .line 79
    const/4 v5, 0x0

    .line 80
    const/4 v6, 0x0

    .line 81
    const/4 v7, 0x0

    .line 82
    const/4 v8, 0x0

    .line 83
    const/4 v9, 0x0

    .line 84
    invoke-static/range {v1 .. v11}, Lcom/zykj/view/board/simple/e;->b(Lcom/zykj/view/board/simple/e;ZLcom/zykj/view/board/board/n;Lcom/zykj/view/board/board/o;Lcom/zykj/view/board/simple/d;Lcom/zykj/view/board/simple/c;Lcom/zykj/view/board/board/p;Lcom/zykj/view/board/board/g;Lcom/zykj/view/board/board/i;ILjava/lang/Object;)Lcom/zykj/view/board/simple/e;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-interface {p1, v0, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_2

    .line 93
    .line 94
    :cond_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 95
    .line 96
    return-object p1

    .line 97
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 98
    .line 99
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 100
    .line 101
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw p1
.end method
