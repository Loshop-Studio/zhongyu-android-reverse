.class public final Landroidx/paging/FlowExtKt$combineWithoutBatching$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/paging/FlowExtKt;->combineWithoutBatching(Ll8/c;Ll8/c;Lx7/r;Lm7/c;)Ljava/lang/Object;
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
    c = "androidx.paging.FlowExtKt$combineWithoutBatching$2"
    f = "FlowExt.kt"
    l = {
        0xa1
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $otherFlow:Ll8/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll8/c;"
        }
    .end annotation
.end field

.field final synthetic $this_combineWithoutBatching:Ll8/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll8/c;"
        }
    .end annotation
.end field

.field final synthetic $transform:Lx7/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx7/r;"
        }
    .end annotation
.end field

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Ll8/c;Ll8/c;Lx7/r;Lm7/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll8/c;",
            "Ll8/c;",
            "Lx7/r;",
            "Lm7/c<",
            "-",
            "Landroidx/paging/FlowExtKt$combineWithoutBatching$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/paging/FlowExtKt$combineWithoutBatching$2;->$this_combineWithoutBatching:Ll8/c;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/paging/FlowExtKt$combineWithoutBatching$2;->$otherFlow:Ll8/c;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/paging/FlowExtKt$combineWithoutBatching$2;->$transform:Lx7/r;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lm7/c<",
            "*>;)",
            "Lm7/c<",
            "Lh7/p;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/paging/FlowExtKt$combineWithoutBatching$2;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/paging/FlowExtKt$combineWithoutBatching$2;->$this_combineWithoutBatching:Ll8/c;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/paging/FlowExtKt$combineWithoutBatching$2;->$otherFlow:Ll8/c;

    .line 6
    .line 7
    iget-object v3, p0, Landroidx/paging/FlowExtKt$combineWithoutBatching$2;->$transform:Lx7/r;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3, p2}, Landroidx/paging/FlowExtKt$combineWithoutBatching$2;-><init>(Ll8/c;Ll8/c;Lx7/r;Lm7/c;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Landroidx/paging/FlowExtKt$combineWithoutBatching$2;->L$0:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public final invoke(Landroidx/paging/SimpleProducerScope;Lm7/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/SimpleProducerScope<",
            "TR;>;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/paging/FlowExtKt$combineWithoutBatching$2;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Landroidx/paging/FlowExtKt$combineWithoutBatching$2;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Landroidx/paging/FlowExtKt$combineWithoutBatching$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Landroidx/paging/SimpleProducerScope;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Landroidx/paging/FlowExtKt$combineWithoutBatching$2;->invoke(Landroidx/paging/SimpleProducerScope;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v2, v0, Landroidx/paging/FlowExtKt$combineWithoutBatching$2;->label:I

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
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto/16 :goto_1

    .line 18
    .line 19
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw v1

    .line 27
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object v2, v0, Landroidx/paging/FlowExtKt$combineWithoutBatching$2;->L$0:Ljava/lang/Object;

    .line 31
    .line 32
    move-object v4, v2

    .line 33
    check-cast v4, Landroidx/paging/SimpleProducerScope;

    .line 34
    .line 35
    new-instance v6, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 36
    .line 37
    const/4 v2, 0x2

    .line 38
    invoke-direct {v6, v2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 39
    .line 40
    .line 41
    new-instance v8, Landroidx/paging/UnbatchedFlowCombiner;

    .line 42
    .line 43
    new-instance v5, Landroidx/paging/FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1;

    .line 44
    .line 45
    iget-object v7, v0, Landroidx/paging/FlowExtKt$combineWithoutBatching$2;->$transform:Lx7/r;

    .line 46
    .line 47
    const/4 v9, 0x0

    .line 48
    invoke-direct {v5, v4, v7, v9}, Landroidx/paging/FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1;-><init>(Landroidx/paging/SimpleProducerScope;Lx7/r;Lm7/c;)V

    .line 49
    .line 50
    .line 51
    invoke-direct {v8, v5}, Landroidx/paging/UnbatchedFlowCombiner;-><init>(Lx7/r;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v9, v3, v9}, Li8/b1;->b(Lkotlinx/coroutines/n;ILjava/lang/Object;)Li8/u;

    .line 55
    .line 56
    .line 57
    move-result-object v11

    .line 58
    iget-object v5, v0, Landroidx/paging/FlowExtKt$combineWithoutBatching$2;->$this_combineWithoutBatching:Ll8/c;

    .line 59
    .line 60
    iget-object v7, v0, Landroidx/paging/FlowExtKt$combineWithoutBatching$2;->$otherFlow:Ll8/c;

    .line 61
    .line 62
    new-array v12, v2, [Ll8/c;

    .line 63
    .line 64
    const/4 v9, 0x0

    .line 65
    aput-object v5, v12, v9

    .line 66
    .line 67
    aput-object v7, v12, v3

    .line 68
    .line 69
    move v13, v9

    .line 70
    :goto_0
    if-ge v13, v2, :cond_2

    .line 71
    .line 72
    aget-object v5, v12, v13

    .line 73
    .line 74
    add-int/lit8 v14, v9, 0x1

    .line 75
    .line 76
    new-instance v7, Landroidx/paging/FlowExtKt$combineWithoutBatching$2$1$1;

    .line 77
    .line 78
    const/4 v10, 0x0

    .line 79
    move-object/from16 v16, v7

    .line 80
    .line 81
    move-object v7, v4

    .line 82
    move-object/from16 v4, v16

    .line 83
    .line 84
    invoke-direct/range {v4 .. v10}, Landroidx/paging/FlowExtKt$combineWithoutBatching$2$1$1;-><init>(Ll8/c;Ljava/util/concurrent/atomic/AtomicInteger;Landroidx/paging/SimpleProducerScope;Landroidx/paging/UnbatchedFlowCombiner;ILm7/c;)V

    .line 85
    .line 86
    .line 87
    move-object v10, v7

    .line 88
    move-object v7, v4

    .line 89
    move-object v4, v10

    .line 90
    move-object v10, v6

    .line 91
    move-object v15, v8

    .line 92
    const/4 v8, 0x2

    .line 93
    const/4 v9, 0x0

    .line 94
    const/4 v6, 0x0

    .line 95
    move-object v5, v11

    .line 96
    invoke-static/range {v4 .. v9}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 97
    .line 98
    .line 99
    add-int/lit8 v13, v13, 0x1

    .line 100
    .line 101
    move-object v6, v10

    .line 102
    move v9, v14

    .line 103
    move-object v8, v15

    .line 104
    goto :goto_0

    .line 105
    :cond_2
    move-object v5, v11

    .line 106
    new-instance v2, Landroidx/paging/FlowExtKt$combineWithoutBatching$2$2;

    .line 107
    .line 108
    invoke-direct {v2, v5}, Landroidx/paging/FlowExtKt$combineWithoutBatching$2$2;-><init>(Li8/u;)V

    .line 109
    .line 110
    .line 111
    iput v3, v0, Landroidx/paging/FlowExtKt$combineWithoutBatching$2;->label:I

    .line 112
    .line 113
    invoke-interface {v4, v2, v0}, Landroidx/paging/SimpleProducerScope;->awaitClose(Lx7/a;Lm7/c;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    if-ne v2, v1, :cond_3

    .line 118
    .line 119
    return-object v1

    .line 120
    :cond_3
    :goto_1
    sget-object v1, Lh7/p;->a:Lh7/p;

    .line 121
    .line 122
    return-object v1
.end method

.method public final invokeSuspend$$forInline(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/paging/FlowExtKt$combineWithoutBatching$2;->L$0:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v2, v1

    .line 6
    check-cast v2, Landroidx/paging/SimpleProducerScope;

    .line 7
    .line 8
    new-instance v4, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v4, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 12
    .line 13
    .line 14
    new-instance v6, Landroidx/paging/UnbatchedFlowCombiner;

    .line 15
    .line 16
    new-instance v3, Landroidx/paging/FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1;

    .line 17
    .line 18
    iget-object v5, v0, Landroidx/paging/FlowExtKt$combineWithoutBatching$2;->$transform:Lx7/r;

    .line 19
    .line 20
    const/4 v7, 0x0

    .line 21
    invoke-direct {v3, v2, v5, v7}, Landroidx/paging/FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1;-><init>(Landroidx/paging/SimpleProducerScope;Lx7/r;Lm7/c;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {v6, v3}, Landroidx/paging/UnbatchedFlowCombiner;-><init>(Lx7/r;)V

    .line 25
    .line 26
    .line 27
    const/4 v9, 0x1

    .line 28
    invoke-static {v7, v9, v7}, Li8/b1;->b(Lkotlinx/coroutines/n;ILjava/lang/Object;)Li8/u;

    .line 29
    .line 30
    .line 31
    move-result-object v10

    .line 32
    iget-object v3, v0, Landroidx/paging/FlowExtKt$combineWithoutBatching$2;->$this_combineWithoutBatching:Ll8/c;

    .line 33
    .line 34
    iget-object v5, v0, Landroidx/paging/FlowExtKt$combineWithoutBatching$2;->$otherFlow:Ll8/c;

    .line 35
    .line 36
    new-array v11, v1, [Ll8/c;

    .line 37
    .line 38
    const/4 v12, 0x0

    .line 39
    aput-object v3, v11, v12

    .line 40
    .line 41
    aput-object v5, v11, v9

    .line 42
    .line 43
    move v3, v12

    .line 44
    move v13, v3

    .line 45
    :goto_0
    if-ge v13, v1, :cond_0

    .line 46
    .line 47
    move v5, v3

    .line 48
    aget-object v3, v11, v13

    .line 49
    .line 50
    add-int/lit8 v14, v5, 0x1

    .line 51
    .line 52
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    new-instance v5, Landroidx/paging/FlowExtKt$combineWithoutBatching$2$1$1;

    .line 61
    .line 62
    const/4 v8, 0x0

    .line 63
    move-object/from16 v16, v5

    .line 64
    .line 65
    move-object v5, v2

    .line 66
    move-object/from16 v2, v16

    .line 67
    .line 68
    invoke-direct/range {v2 .. v8}, Landroidx/paging/FlowExtKt$combineWithoutBatching$2$1$1;-><init>(Ll8/c;Ljava/util/concurrent/atomic/AtomicInteger;Landroidx/paging/SimpleProducerScope;Landroidx/paging/UnbatchedFlowCombiner;ILm7/c;)V

    .line 69
    .line 70
    .line 71
    move-object v8, v5

    .line 72
    move-object v5, v2

    .line 73
    move-object v2, v8

    .line 74
    move-object v8, v4

    .line 75
    move-object v15, v6

    .line 76
    const/4 v6, 0x2

    .line 77
    const/4 v7, 0x0

    .line 78
    const/4 v4, 0x0

    .line 79
    move-object v3, v10

    .line 80
    invoke-static/range {v2 .. v7}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 81
    .line 82
    .line 83
    sget-object v4, Lh7/p;->a:Lh7/p;

    .line 84
    .line 85
    add-int/lit8 v13, v13, 0x1

    .line 86
    .line 87
    move-object v4, v8

    .line 88
    move v3, v14

    .line 89
    move-object v6, v15

    .line 90
    goto :goto_0

    .line 91
    :cond_0
    move-object v3, v10

    .line 92
    new-instance v1, Landroidx/paging/FlowExtKt$combineWithoutBatching$2$2;

    .line 93
    .line 94
    invoke-direct {v1, v3}, Landroidx/paging/FlowExtKt$combineWithoutBatching$2$2;-><init>(Li8/u;)V

    .line 95
    .line 96
    .line 97
    invoke-static {v12}, Lkotlin/jvm/internal/s;->c(I)V

    .line 98
    .line 99
    .line 100
    invoke-interface {v2, v1, v0}, Landroidx/paging/SimpleProducerScope;->awaitClose(Lx7/a;Lm7/c;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    invoke-static {v9}, Lkotlin/jvm/internal/s;->c(I)V

    .line 104
    .line 105
    .line 106
    sget-object v1, Lh7/p;->a:Lh7/p;

    .line 107
    .line 108
    return-object v1
.end method
