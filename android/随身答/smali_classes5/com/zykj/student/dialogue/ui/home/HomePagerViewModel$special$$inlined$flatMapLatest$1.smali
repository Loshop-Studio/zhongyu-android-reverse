.class public final Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$special$$inlined$flatMapLatest$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel;-><init>(Lk6/g;)V
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
        "Lcom/zykj/student/dialogue/bean/resp/QuestionResp;",
        ">;>;",
        "Ls6/k0;",
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
    c = "com.zykj.student.dialogue.ui.home.HomePagerViewModel$special$$inlined$flatMapLatest$1"
    f = "HomePagerViewModel.kt"
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
        "SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n+ 2 HomePagerViewModel.kt\ncom/zykj/student/dialogue/ui/home/HomePagerViewModel\n*L\n1#1,189:1\n76#2,14:190\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel;


# direct methods
.method public constructor <init>(Lkotlin/coroutines/Continuation;Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel;)V
    .locals 0

    iput-object p2, p0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$special$$inlined$flatMapLatest$1;->d:Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel;

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

    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$special$$inlined$flatMapLatest$1;->invoke(Lkotlinx/coroutines/flow/FlowCollector;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/flow/FlowCollector;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2

    .line 2
    new-instance v0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$special$$inlined$flatMapLatest$1;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$special$$inlined$flatMapLatest$1;->d:Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel;

    invoke-direct {v0, p3, v1}, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$special$$inlined$flatMapLatest$1;-><init>(Lkotlin/coroutines/Continuation;Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel;)V

    iput-object p1, v0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$special$$inlined$flatMapLatest$1;->b:Ljava/lang/Object;

    iput-object p2, v0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$special$$inlined$flatMapLatest$1;->c:Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, p1}, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$special$$inlined$flatMapLatest$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

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
    iget v2, v0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$special$$inlined$flatMapLatest$1;->a:I

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
    iget-object v1, v0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$special$$inlined$flatMapLatest$1;->b:Ljava/lang/Object;

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
    iget-object v2, v0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$special$$inlined$flatMapLatest$1;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v2, Lkotlinx/coroutines/flow/FlowCollector;

    .line 36
    .line 37
    iget-object v4, v0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$special$$inlined$flatMapLatest$1;->c:Ljava/lang/Object;

    .line 38
    .line 39
    move-object v5, v4

    .line 40
    check-cast v5, Ls6/k0;

    .line 41
    .line 42
    iget-object v6, v0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$special$$inlined$flatMapLatest$1;->d:Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel;

    .line 43
    .line 44
    invoke-virtual {v6}, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel;->u()Ljava/lang/Long;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    if-eqz v6, :cond_2

    .line 49
    .line 50
    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    .line 51
    .line 52
    .line 53
    move-result-wide v6

    .line 54
    new-instance v8, Landroidx/paging/Pager;

    .line 55
    .line 56
    new-instance v9, Landroidx/paging/PagingConfig;

    .line 57
    .line 58
    const/16 v16, 0x3e

    .line 59
    .line 60
    const/16 v17, 0x0

    .line 61
    .line 62
    const/4 v10, 0x4

    .line 63
    const/4 v11, 0x0

    .line 64
    const/4 v12, 0x0

    .line 65
    const/4 v13, 0x0

    .line 66
    const/4 v14, 0x0

    .line 67
    const/4 v15, 0x0

    .line 68
    invoke-direct/range {v9 .. v17}, Landroidx/paging/PagingConfig;-><init>(IIZIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 69
    .line 70
    .line 71
    new-instance v11, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$a;

    .line 72
    .line 73
    iget-object v10, v0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$special$$inlined$flatMapLatest$1;->d:Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel;

    .line 74
    .line 75
    invoke-direct {v11, v10, v5, v6, v7}, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$a;-><init>(Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel;Ls6/k0;J)V

    .line 76
    .line 77
    .line 78
    const/4 v12, 0x2

    .line 79
    const/4 v13, 0x0

    .line 80
    const/4 v10, 0x0

    .line 81
    invoke-direct/range {v8 .. v13}, Landroidx/paging/Pager;-><init>(Landroidx/paging/PagingConfig;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v8}, Landroidx/paging/Pager;->getFlow()Lkotlinx/coroutines/flow/Flow;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    if-nez v5, :cond_3

    .line 89
    .line 90
    :cond_2
    sget-object v5, Landroidx/paging/PagingData;->Companion:Landroidx/paging/PagingData$Companion;

    .line 91
    .line 92
    invoke-virtual {v5}, Landroidx/paging/PagingData$Companion;->empty()Landroidx/paging/PagingData;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    invoke-static {v5}, Lkotlinx/coroutines/flow/FlowKt;->flowOf(Ljava/lang/Object;)Lkotlinx/coroutines/flow/Flow;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    :cond_3
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    iput-object v6, v0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$special$$inlined$flatMapLatest$1;->b:Ljava/lang/Object;

    .line 105
    .line 106
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    iput-object v4, v0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$special$$inlined$flatMapLatest$1;->c:Ljava/lang/Object;

    .line 111
    .line 112
    iput v3, v0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$special$$inlined$flatMapLatest$1;->a:I

    .line 113
    .line 114
    invoke-static {v2, v5, v0}, Lkotlinx/coroutines/flow/FlowKt;->emitAll(Lkotlinx/coroutines/flow/FlowCollector;Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    if-ne v2, v1, :cond_4

    .line 119
    .line 120
    return-object v1

    .line 121
    :cond_4
    :goto_0
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 122
    .line 123
    return-object v1
.end method
