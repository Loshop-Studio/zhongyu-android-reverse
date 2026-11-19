.class final Lcom/zykj/evaluation/ui/home/HomeViewModel$updateCustomTime$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/home/HomeViewModel;->W(Ljava/lang/String;Ljava/lang/String;)V
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
    c = "com.zykj.evaluation.ui.home.HomeViewModel$updateCustomTime$1"
    f = "HomeViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$updateCustomTime$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,715:1\n230#2,3:716\n233#2,2:727\n1563#3:719\n1634#3,2:720\n1563#3:722\n1634#3,3:723\n1636#3:726\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$updateCustomTime$1\n*L\n539#1:716,3\n539#1:727,2\n541#1:719\n541#1:720,2\n546#1:722\n546#1:723,3\n541#1:726\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/evaluation/ui/home/HomeViewModel;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/home/HomeViewModel;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$updateCustomTime$1;->b:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    iput-object p2, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$updateCustomTime$1;->c:Ljava/lang/String;

    iput-object p3, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$updateCustomTime$1;->d:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3

    new-instance p1, Lcom/zykj/evaluation/ui/home/HomeViewModel$updateCustomTime$1;

    iget-object v0, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$updateCustomTime$1;->b:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$updateCustomTime$1;->c:Ljava/lang/String;

    iget-object v2, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$updateCustomTime$1;->d:Ljava/lang/String;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/evaluation/ui/home/HomeViewModel$updateCustomTime$1;-><init>(Lcom/zykj/evaluation/ui/home/HomeViewModel;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/home/HomeViewModel$updateCustomTime$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/home/HomeViewModel$updateCustomTime$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/home/HomeViewModel$updateCustomTime$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/home/HomeViewModel$updateCustomTime$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$updateCustomTime$1;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_6

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$updateCustomTime$1;->b:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/zykj/evaluation/ui/home/HomeViewModel;->u(Lcom/zykj/evaluation/ui/home/HomeViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object v0, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$updateCustomTime$1;->c:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$updateCustomTime$1;->d:Ljava/lang/String;

    .line 20
    .line 21
    :cond_0
    invoke-interface {p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    move-object v3, v2

    .line 26
    check-cast v3, Lcom/zykj/evaluation/ui/home/HomeFilterState;

    .line 27
    .line 28
    invoke-virtual {v3}, Lcom/zykj/evaluation/ui/home/HomeFilterState;->getFilterDataList()Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    new-instance v5, Ljava/util/ArrayList;

    .line 33
    .line 34
    const/16 v6, 0xa

    .line 35
    .line 36
    invoke-static {v4, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 41
    .line 42
    .line 43
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    if-eqz v7, :cond_5

    .line 52
    .line 53
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    move-object v8, v7

    .line 58
    check-cast v8, Ls6/d;

    .line 59
    .line 60
    invoke-virtual {v8}, Ls6/d;->g()Lcom/zykj/evaluation/ui/home/c;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    instance-of v7, v7, Lcom/zykj/evaluation/ui/home/c$e;

    .line 65
    .line 66
    if-eqz v7, :cond_4

    .line 67
    .line 68
    new-instance v7, Lcom/zykj/evaluation/ui/home/c$e$a;

    .line 69
    .line 70
    invoke-direct {v7, v0, v1}, Lcom/zykj/evaluation/ui/home/c$e$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v8}, Ls6/d;->d()Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object v9

    .line 77
    new-instance v10, Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-static {v9, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 80
    .line 81
    .line 82
    move-result v11

    .line 83
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 84
    .line 85
    .line 86
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v11

    .line 94
    if-eqz v11, :cond_2

    .line 95
    .line 96
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v11

    .line 100
    check-cast v11, Lcom/zykj/evaluation/ui/home/c;

    .line 101
    .line 102
    instance-of v12, v11, Lcom/zykj/evaluation/ui/home/c$e$a;

    .line 103
    .line 104
    if-eqz v12, :cond_1

    .line 105
    .line 106
    move-object v11, v7

    .line 107
    :cond_1
    invoke-interface {v10, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_2
    invoke-virtual {v7}, Lcom/zykj/evaluation/ui/home/c$e$a;->d()Z

    .line 112
    .line 113
    .line 114
    move-result v9

    .line 115
    if-eqz v9, :cond_3

    .line 116
    .line 117
    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    check-cast v7, Lcom/zykj/evaluation/ui/home/c;

    .line 122
    .line 123
    :cond_3
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object v11

    .line 127
    const/4 v12, 0x1

    .line 128
    const/4 v13, 0x0

    .line 129
    const/4 v9, 0x0

    .line 130
    invoke-static/range {v8 .. v13}, Ls6/d;->b(Ls6/d;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Ls6/d;

    .line 131
    .line 132
    .line 133
    move-result-object v8

    .line 134
    :cond_4
    invoke-interface {v5, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_5
    invoke-virtual {v3, v5}, Lcom/zykj/evaluation/ui/home/HomeFilterState;->copy(Ljava/util/List;)Lcom/zykj/evaluation/ui/home/HomeFilterState;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    invoke-interface {p1, v2, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    if-eqz v2, :cond_0

    .line 147
    .line 148
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 149
    .line 150
    return-object p1

    .line 151
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 152
    .line 153
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 154
    .line 155
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    throw p1
.end method
