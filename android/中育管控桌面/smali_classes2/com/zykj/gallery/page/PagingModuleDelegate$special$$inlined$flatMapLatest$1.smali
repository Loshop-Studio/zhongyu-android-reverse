.class public final Lcom/zykj/gallery/page/PagingModuleDelegate$special$$inlined$flatMapLatest$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/gallery/page/PagingModuleDelegate;-><init>(Le3/a;Ljava/lang/Object;ILkotlinx/coroutines/CoroutineScope;)V
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
        "Ljava/lang/Object;",
        ">;>;",
        "Lkotlin/Pair<",
        "Ljava/lang/Object;",
        "+",
        "Ljava/lang/Long;",
        ">;",
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
    c = "com.zykj.gallery.page.PagingModuleDelegate$special$$inlined$flatMapLatest$1"
    f = "PagingModuleDelegate.kt"
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
        "SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n+ 2 PagingModuleDelegate.kt\ncom/zykj/gallery/page/PagingModuleDelegate\n*L\n1#1,189:1\n31#2,7:190\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lcom/zykj/gallery/page/PagingModuleDelegate;


# direct methods
.method public constructor <init>(Lkotlin/coroutines/Continuation;Lcom/zykj/gallery/page/PagingModuleDelegate;)V
    .locals 0

    iput-object p2, p0, Lcom/zykj/gallery/page/PagingModuleDelegate$special$$inlined$flatMapLatest$1;->d:Lcom/zykj/gallery/page/PagingModuleDelegate;

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

    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/gallery/page/PagingModuleDelegate$special$$inlined$flatMapLatest$1;->invoke(Lkotlinx/coroutines/flow/FlowCollector;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/flow/FlowCollector;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2

    .line 2
    new-instance v0, Lcom/zykj/gallery/page/PagingModuleDelegate$special$$inlined$flatMapLatest$1;

    iget-object v1, p0, Lcom/zykj/gallery/page/PagingModuleDelegate$special$$inlined$flatMapLatest$1;->d:Lcom/zykj/gallery/page/PagingModuleDelegate;

    invoke-direct {v0, p3, v1}, Lcom/zykj/gallery/page/PagingModuleDelegate$special$$inlined$flatMapLatest$1;-><init>(Lkotlin/coroutines/Continuation;Lcom/zykj/gallery/page/PagingModuleDelegate;)V

    iput-object p1, v0, Lcom/zykj/gallery/page/PagingModuleDelegate$special$$inlined$flatMapLatest$1;->b:Ljava/lang/Object;

    iput-object p2, v0, Lcom/zykj/gallery/page/PagingModuleDelegate$special$$inlined$flatMapLatest$1;->c:Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, p1}, Lcom/zykj/gallery/page/PagingModuleDelegate$special$$inlined$flatMapLatest$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v2, v0, Lcom/zykj/gallery/page/PagingModuleDelegate$special$$inlined$flatMapLatest$1;->a:I

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    if-ne v2, v3, :cond_0

    .line 13
    .line 14
    iget-object v1, v0, Lcom/zykj/gallery/page/PagingModuleDelegate$special$$inlined$flatMapLatest$1;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Lkotlinx/coroutines/flow/FlowCollector;

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw v1

    .line 30
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object v2, v0, Lcom/zykj/gallery/page/PagingModuleDelegate$special$$inlined$flatMapLatest$1;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v2, Lkotlinx/coroutines/flow/FlowCollector;

    .line 36
    .line 37
    iget-object v4, v0, Lcom/zykj/gallery/page/PagingModuleDelegate$special$$inlined$flatMapLatest$1;->c:Ljava/lang/Object;

    .line 38
    .line 39
    move-object v5, v4

    .line 40
    check-cast v5, Lkotlin/Pair;

    .line 41
    .line 42
    invoke-virtual {v5}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    invoke-virtual {v5}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    check-cast v5, Ljava/lang/Number;

    .line 51
    .line 52
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 53
    .line 54
    .line 55
    new-instance v7, Landroidx/paging/Pager;

    .line 56
    .line 57
    new-instance v8, Landroidx/paging/PagingConfig;

    .line 58
    .line 59
    iget-object v5, v0, Lcom/zykj/gallery/page/PagingModuleDelegate$special$$inlined$flatMapLatest$1;->d:Lcom/zykj/gallery/page/PagingModuleDelegate;

    .line 60
    .line 61
    invoke-static {v5}, Lcom/zykj/gallery/page/PagingModuleDelegate;->a(Lcom/zykj/gallery/page/PagingModuleDelegate;)I

    .line 62
    .line 63
    .line 64
    move-result v9

    .line 65
    const/16 v15, 0x3a

    .line 66
    .line 67
    const/16 v16, 0x0

    .line 68
    .line 69
    const/4 v10, 0x0

    .line 70
    const/4 v11, 0x0

    .line 71
    const/4 v12, 0x0

    .line 72
    const/4 v13, 0x0

    .line 73
    const/4 v14, 0x0

    .line 74
    invoke-direct/range {v8 .. v16}, Landroidx/paging/PagingConfig;-><init>(IIZIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 75
    .line 76
    .line 77
    new-instance v10, Lcom/zykj/gallery/page/PagingModuleDelegate$a;

    .line 78
    .line 79
    iget-object v5, v0, Lcom/zykj/gallery/page/PagingModuleDelegate$special$$inlined$flatMapLatest$1;->d:Lcom/zykj/gallery/page/PagingModuleDelegate;

    .line 80
    .line 81
    invoke-direct {v10, v5, v6}, Lcom/zykj/gallery/page/PagingModuleDelegate$a;-><init>(Lcom/zykj/gallery/page/PagingModuleDelegate;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    const/4 v11, 0x2

    .line 85
    const/4 v12, 0x0

    .line 86
    const/4 v9, 0x0

    .line 87
    invoke-direct/range {v7 .. v12}, Landroidx/paging/Pager;-><init>(Landroidx/paging/PagingConfig;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v7}, Landroidx/paging/Pager;->getFlow()Lkotlinx/coroutines/flow/Flow;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    iput-object v6, v0, Lcom/zykj/gallery/page/PagingModuleDelegate$special$$inlined$flatMapLatest$1;->b:Ljava/lang/Object;

    .line 99
    .line 100
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    iput-object v4, v0, Lcom/zykj/gallery/page/PagingModuleDelegate$special$$inlined$flatMapLatest$1;->c:Ljava/lang/Object;

    .line 105
    .line 106
    iput v3, v0, Lcom/zykj/gallery/page/PagingModuleDelegate$special$$inlined$flatMapLatest$1;->a:I

    .line 107
    .line 108
    invoke-static {v2, v5, v0}, Lkotlinx/coroutines/flow/FlowKt;->emitAll(Lkotlinx/coroutines/flow/FlowCollector;Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    if-ne v2, v1, :cond_2

    .line 113
    .line 114
    return-object v1

    .line 115
    :cond_2
    :goto_0
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 116
    .line 117
    return-object v1
.end method
