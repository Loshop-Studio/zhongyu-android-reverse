.class final Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/board/BoardViewModel;->y(Ljava/util/List;Z)V
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
    c = "com.zykj.view.board.board.BoardViewModel$addBitmapList$1"
    f = "BoardViewModel.kt"
    i = {
        0x0
    }
    l = {
        0x4ea
    }
    m = "invokeSuspend"
    n = {
        "$this$launch"
    }
    s = {
        "L$0"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBoardViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel$addBitmapList$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1494:1\n226#2,5:1495\n*S KotlinDebug\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel$addBitmapList$1\n*L\n1277#1:1495,5\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/view/board/board/BoardViewModel;

.field public final synthetic d:Ljava/util/List;

.field public final synthetic e:Z


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/board/BoardViewModel;Ljava/util/List;ZLkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;->c:Lcom/zykj/view/board/board/BoardViewModel;

    iput-object p2, p0, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;->d:Ljava/util/List;

    iput-boolean p3, p0, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;->e:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 4

    new-instance v0, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;

    iget-object v1, p0, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;->c:Lcom/zykj/view/board/board/BoardViewModel;

    iget-object v2, p0, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;->d:Ljava/util/List;

    iget-boolean v3, p0, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;->e:Z

    invoke-direct {v0, v1, v2, v3, p2}, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;Ljava/util/List;ZLkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkotlinx/coroutines/CoroutineScope;

    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v2, p0, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;->a:I

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x1

    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    if-ne v2, v4, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;->c:Lcom/zykj/view/board/board/BoardViewModel;

    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/zykj/view/board/board/BoardViewModel;->Y()Lkotlinx/coroutines/flow/StateFlow;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    new-instance v2, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1$1;

    .line 39
    .line 40
    invoke-direct {v2, v3}, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;->b:Ljava/lang/Object;

    .line 44
    .line 45
    iput v4, p0, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;->a:I

    .line 46
    .line 47
    invoke-static {p1, v2, p0}, Lkotlinx/coroutines/flow/FlowKt;->first(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-ne p1, v1, :cond_2

    .line 52
    .line 53
    return-object v1

    .line 54
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;->c:Lcom/zykj/view/board/board/BoardViewModel;

    .line 55
    .line 56
    invoke-static {p1}, Lcom/zykj/view/board/board/BoardViewModel;->q(Lcom/zykj/view/board/board/BoardViewModel;)Ld5/k;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-nez p1, :cond_3

    .line 61
    .line 62
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 63
    .line 64
    return-object p1

    .line 65
    :cond_3
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;->c:Lcom/zykj/view/board/board/BoardViewModel;

    .line 66
    .line 67
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardViewModel;->P0()Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    const/4 v1, 0x0

    .line 72
    if-eqz v0, :cond_4

    .line 73
    .line 74
    const-string p1, "\u56fe\u7247\u6570\u91cf\u5df2\u8fbe\u4e0a\u9650\uff0c\u4e0d\u53ef\u7ee7\u7eed\u63d2\u5165"

    .line 75
    .line 76
    new-array v0, v1, [Ljava/lang/Object;

    .line 77
    .line 78
    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 82
    .line 83
    return-object p1

    .line 84
    :cond_4
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;->d:Ljava/util/List;

    .line 85
    .line 86
    :try_start_0
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 87
    .line 88
    sget-object v2, Lcom/zykj/board/EzyPositionEnum$PositionEnum;->f:Lcom/zykj/board/EzyPositionEnum$PositionEnum;

    .line 89
    .line 90
    sget-object v4, Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;->g:Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;

    .line 91
    .line 92
    invoke-interface {p1, v0, v2, v4}, Ld5/k;->A(Ljava/util/List;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;)Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    goto :goto_1

    .line 101
    :catchall_0
    move-exception v0

    .line 102
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 103
    .line 104
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    :goto_1
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    if-eqz v2, :cond_5

    .line 117
    .line 118
    const-string v2, "\u56fe\u7247\u6570\u91cf\u8d85\u8fc7\u4e0a\u9650"

    .line 119
    .line 120
    new-array v1, v1, [Ljava/lang/Object;

    .line 121
    .line 122
    invoke-static {v2, v1}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    :cond_5
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-eqz v1, :cond_6

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_6
    move-object v3, v0

    .line 133
    :goto_2
    check-cast v3, Ljava/util/List;

    .line 134
    .line 135
    if-eqz v3, :cond_8

    .line 136
    .line 137
    iget-boolean v0, p0, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;->e:Z

    .line 138
    .line 139
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;->c:Lcom/zykj/view/board/board/BoardViewModel;

    .line 140
    .line 141
    if-eqz v0, :cond_8

    .line 142
    .line 143
    invoke-static {v1}, Lcom/zykj/view/board/board/BoardViewModel;->u(Lcom/zykj/view/board/board/BoardViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    :cond_7
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    move-object v4, v1

    .line 152
    check-cast v4, Lcom/zykj/view/board/board/r;

    .line 153
    .line 154
    sget-object v10, Lcom/zykj/view/board/board/s$d;->e:Lcom/zykj/view/board/board/s$d;

    .line 155
    .line 156
    const/16 v11, 0x1f

    .line 157
    .line 158
    const/4 v12, 0x0

    .line 159
    const/4 v5, 0x0

    .line 160
    const/4 v6, 0x0

    .line 161
    const/4 v7, 0x0

    .line 162
    const/4 v8, 0x0

    .line 163
    const/4 v9, 0x0

    .line 164
    invoke-static/range {v4 .. v12}, Lcom/zykj/view/board/board/r;->b(Lcom/zykj/view/board/board/r;ZZZZZLcom/zykj/view/board/board/s;ILjava/lang/Object;)Lcom/zykj/view/board/board/r;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    invoke-interface {v0, v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    if-eqz v1, :cond_7

    .line 173
    .line 174
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    check-cast v0, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 179
    .line 180
    invoke-virtual {v0}, Lg5/a;->getId()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-interface {p1, v0}, Ld5/k;->F(Ljava/util/List;)V

    .line 189
    .line 190
    .line 191
    :cond_8
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 192
    .line 193
    return-object p1
.end method
