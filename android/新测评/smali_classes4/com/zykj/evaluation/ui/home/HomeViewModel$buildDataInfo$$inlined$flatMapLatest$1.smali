.class public final Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$$inlined$flatMapLatest$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/home/HomeViewModel;->D(Lcom/zykj/evaluation/ui/home/a;)Lkotlinx/coroutines/flow/Flow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function3<",
        "Lkotlinx/coroutines/flow/FlowCollector<",
        "-",
        "Landroidx/paging/PagingData<",
        "Lt6/o0;",
        ">;>;",
        "Lcom/zykj/evaluation/bean/GetTaskListReq;",
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
        "\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u0002\"\u0004\u0008\u0001\u0010\u0003*\u0008\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n\u00a8\u0006\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "R",
        "T",
        "Lkotlinx/coroutines/flow/FlowCollector;",
        "it",
        "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1"
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
    c = "com.zykj.evaluation.ui.home.HomeViewModel$buildDataInfo$$inlined$flatMapLatest$1"
    f = "HomeViewModel.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0xbd
    }
    m = "invokeSuspend"
    n = {
        "$this$transformLatest",
        "it"
    }
    s = {
        "L$0",
        "L$1"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n+ 2 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel\n*L\n1#1,189:1\n424#2:190\n462#2:191\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lcom/zykj/evaluation/ui/home/HomeViewModel;

.field public final synthetic e:Lcom/zykj/evaluation/ui/home/a;


# direct methods
.method public constructor <init>(Lkotlin/coroutines/Continuation;Lcom/zykj/evaluation/ui/home/HomeViewModel;Lcom/zykj/evaluation/ui/home/a;)V
    .locals 0

    iput-object p2, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$$inlined$flatMapLatest$1;->d:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    iput-object p3, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$$inlined$flatMapLatest$1;->e:Lcom/zykj/evaluation/ui/home/a;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/flow/FlowCollector;

    check-cast p3, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$$inlined$flatMapLatest$1;->invoke(Lkotlinx/coroutines/flow/FlowCollector;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/flow/FlowCollector;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3

    .line 2
    new-instance v0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$$inlined$flatMapLatest$1;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$$inlined$flatMapLatest$1;->d:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    iget-object v2, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$$inlined$flatMapLatest$1;->e:Lcom/zykj/evaluation/ui/home/a;

    invoke-direct {v0, p3, v1, v2}, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$$inlined$flatMapLatest$1;-><init>(Lkotlin/coroutines/Continuation;Lcom/zykj/evaluation/ui/home/HomeViewModel;Lcom/zykj/evaluation/ui/home/a;)V

    iput-object p1, v0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$$inlined$flatMapLatest$1;->b:Ljava/lang/Object;

    iput-object p2, v0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$$inlined$flatMapLatest$1;->c:Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, p1}, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$$inlined$flatMapLatest$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$$inlined$flatMapLatest$1;->a:I

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
    iget-object v0, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$$inlined$flatMapLatest$1;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lkotlinx/coroutines/flow/FlowCollector;

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$$inlined$flatMapLatest$1;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p1, Lkotlinx/coroutines/flow/FlowCollector;

    .line 34
    .line 35
    iget-object v1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$$inlined$flatMapLatest$1;->c:Ljava/lang/Object;

    .line 36
    .line 37
    move-object v3, v1

    .line 38
    check-cast v3, Lcom/zykj/evaluation/bean/GetTaskListReq;

    .line 39
    .line 40
    new-instance v4, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$1$1;

    .line 41
    .line 42
    iget-object v5, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$$inlined$flatMapLatest$1;->d:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    .line 43
    .line 44
    iget-object v6, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$$inlined$flatMapLatest$1;->e:Lcom/zykj/evaluation/ui/home/a;

    .line 45
    .line 46
    const/4 v7, 0x0

    .line 47
    invoke-direct {v4, v5, v6, v3, v7}, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$1$1;-><init>(Lcom/zykj/evaluation/ui/home/HomeViewModel;Lcom/zykj/evaluation/ui/home/a;Lcom/zykj/evaluation/bean/GetTaskListReq;Lkotlin/coroutines/Continuation;)V

    .line 48
    .line 49
    .line 50
    new-instance v3, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$1$2;

    .line 51
    .line 52
    iget-object v5, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$$inlined$flatMapLatest$1;->e:Lcom/zykj/evaluation/ui/home/a;

    .line 53
    .line 54
    invoke-direct {v3, v5, v7}, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$1$2;-><init>(Lcom/zykj/evaluation/ui/home/a;Lkotlin/coroutines/Continuation;)V

    .line 55
    .line 56
    .line 57
    invoke-static {v7, v4, v3, v2, v7}, Lcom/zykj/evaluation/paging/SimplePagerKt;->c(Landroidx/paging/PagingConfig;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/flow/Flow;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    iput-object v4, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$$inlined$flatMapLatest$1;->b:Ljava/lang/Object;

    .line 66
    .line 67
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    iput-object v1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$$inlined$flatMapLatest$1;->c:Ljava/lang/Object;

    .line 72
    .line 73
    iput v2, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$$inlined$flatMapLatest$1;->a:I

    .line 74
    .line 75
    invoke-static {p1, v3, p0}, Lkotlinx/coroutines/flow/FlowKt;->emitAll(Lkotlinx/coroutines/flow/FlowCollector;Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    if-ne p1, v0, :cond_2

    .line 80
    .line 81
    return-object v0

    .line 82
    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 83
    .line 84
    return-object p1
.end method
