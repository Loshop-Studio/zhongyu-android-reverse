.class final Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$deleteStem$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->z(Lz5/f;)V
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
    c = "com.zykj.evaluation.ui.detail.mistake.MistakeViewModel$deleteStem$1"
    f = "MistakeViewModel.kt"
    i = {}
    l = {
        0xf1
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMistakeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeViewModel.kt\ncom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$deleteStem$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,585:1\n230#2,3:586\n233#2,2:593\n1563#3:589\n1634#3,3:590\n*S KotlinDebug\n*F\n+ 1 MistakeViewModel.kt\ncom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$deleteStem$1\n*L\n244#1:586,3\n244#1:593,2\n246#1:589\n246#1:590,3\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lz5/f;

.field public final synthetic c:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;


# direct methods
.method public constructor <init>(Lz5/f;Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$deleteStem$1;->b:Lz5/f;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$deleteStem$1;->c:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance p1, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$deleteStem$1;

    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$deleteStem$1;->b:Lz5/f;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$deleteStem$1;->c:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$deleteStem$1;-><init>(Lz5/f;Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$deleteStem$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$deleteStem$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$deleteStem$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$deleteStem$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

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
    iget v2, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$deleteStem$1;->a:I

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
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    move-object/from16 v2, p1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v1

    .line 28
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    new-instance v4, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$deleteStem$1$1;

    .line 36
    .line 37
    iget-object v5, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$deleteStem$1;->b:Lz5/f;

    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    invoke-direct {v4, v5, v6}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$deleteStem$1$1;-><init>(Lz5/f;Lkotlin/coroutines/Continuation;)V

    .line 41
    .line 42
    .line 43
    iput v3, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$deleteStem$1;->a:I

    .line 44
    .line 45
    invoke-static {v2, v4, v0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    if-ne v2, v1, :cond_2

    .line 50
    .line 51
    return-object v1

    .line 52
    :cond_2
    :goto_0
    iget-object v1, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$deleteStem$1;->c:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    .line 53
    .line 54
    iget-object v3, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$deleteStem$1;->b:Lz5/f;

    .line 55
    .line 56
    check-cast v2, Ljava/lang/Boolean;

    .line 57
    .line 58
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-static {v1}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->u(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    :cond_3
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    move-object v4, v2

    .line 70
    check-cast v4, Lz5/l1;

    .line 71
    .line 72
    invoke-virtual {v4}, Lz5/l1;->j()Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    new-instance v10, Ljava/util/ArrayList;

    .line 77
    .line 78
    const/16 v6, 0xa

    .line 79
    .line 80
    invoke-static {v5, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    invoke-direct {v10, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 85
    .line 86
    .line 87
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    if-eqz v6, :cond_5

    .line 96
    .line 97
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    move-object v11, v6

    .line 102
    check-cast v11, Lz5/f;

    .line 103
    .line 104
    invoke-virtual {v11}, Lz5/f;->c()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    invoke-virtual {v3}, Lz5/f;->c()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    if-eqz v6, :cond_4

    .line 117
    .line 118
    const/16 v16, 0x5

    .line 119
    .line 120
    const/16 v17, 0x0

    .line 121
    .line 122
    const/4 v12, 0x0

    .line 123
    const-string v13, ""

    .line 124
    .line 125
    const/4 v14, 0x0

    .line 126
    const/4 v15, 0x0

    .line 127
    invoke-static/range {v11 .. v17}, Lz5/f;->b(Lz5/f;ZLjava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lz5/f;

    .line 128
    .line 129
    .line 130
    move-result-object v11

    .line 131
    :cond_4
    invoke-interface {v10, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_5
    const/16 v17, 0x7ef

    .line 136
    .line 137
    const/16 v18, 0x0

    .line 138
    .line 139
    const/4 v5, 0x0

    .line 140
    const-wide/16 v6, 0x0

    .line 141
    .line 142
    const/4 v8, 0x0

    .line 143
    const/4 v9, 0x0

    .line 144
    const/4 v11, 0x0

    .line 145
    const/4 v12, 0x0

    .line 146
    const/4 v13, 0x0

    .line 147
    const/4 v14, 0x0

    .line 148
    const/4 v15, 0x0

    .line 149
    const/16 v16, 0x0

    .line 150
    .line 151
    invoke-static/range {v4 .. v18}, Lz5/l1;->b(Lz5/l1;Ljava/util/List;JZLjava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lz5/l1;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    invoke-interface {v1, v2, v4}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    if-eqz v2, :cond_3

    .line 160
    .line 161
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 162
    .line 163
    return-object v1
.end method
