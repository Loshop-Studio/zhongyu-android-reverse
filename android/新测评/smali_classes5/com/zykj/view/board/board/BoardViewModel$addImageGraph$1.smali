.class final Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/board/BoardViewModel;->x(Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;)V
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
    c = "com.zykj.view.board.board.BoardViewModel$addImageGraph$1"
    f = "BoardViewModel.kt"
    i = {
        0x0
    }
    l = {
        0x4b7
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
        "SMAP\nBoardViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel$addImageGraph$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1494:1\n226#2,5:1495\n*S KotlinDebug\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel$addImageGraph$1\n*L\n1242#1:1495,5\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/view/board/board/BoardViewModel;

.field public final synthetic d:Landroid/graphics/Bitmap;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Lkotlin/jvm/functions/Function1;

.field public final synthetic i:Z


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/board/BoardViewModel;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ZLkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->c:Lcom/zykj/view/board/board/BoardViewModel;

    iput-object p2, p0, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->d:Landroid/graphics/Bitmap;

    iput-object p3, p0, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->e:Ljava/lang/String;

    iput-object p4, p0, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->f:Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;

    iput-object p5, p0, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->g:Ljava/lang/String;

    iput-object p6, p0, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->h:Lkotlin/jvm/functions/Function1;

    iput-boolean p7, p0, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->i:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 9

    new-instance v0, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;

    iget-object v1, p0, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->c:Lcom/zykj/view/board/board/BoardViewModel;

    iget-object v2, p0, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->d:Landroid/graphics/Bitmap;

    iget-object v3, p0, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->e:Ljava/lang/String;

    iget-object v4, p0, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->f:Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;

    iget-object v5, p0, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->g:Ljava/lang/String;

    iget-object v6, p0, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->h:Lkotlin/jvm/functions/Function1;

    iget-boolean v7, p0, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->i:Z

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ZLkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lkotlinx/coroutines/CoroutineScope;

    .line 6
    .line 7
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget v3, v1, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->a:I

    .line 12
    .line 13
    const/4 v4, 0x1

    .line 14
    const/4 v5, 0x0

    .line 15
    if-eqz v3, :cond_1

    .line 16
    .line 17
    if-ne v3, v4, :cond_0

    .line 18
    .line 19
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw v0

    .line 31
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object v3, v1, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->c:Lcom/zykj/view/board/board/BoardViewModel;

    .line 35
    .line 36
    invoke-virtual {v3}, Lcom/zykj/view/board/board/BoardViewModel;->W()Lkotlinx/coroutines/flow/StateFlow;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    new-instance v6, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1$1;

    .line 41
    .line 42
    invoke-direct {v6, v5}, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 43
    .line 44
    .line 45
    iput-object v0, v1, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->b:Ljava/lang/Object;

    .line 46
    .line 47
    iput v4, v1, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->a:I

    .line 48
    .line 49
    invoke-static {v3, v6, v1}, Lkotlinx/coroutines/flow/FlowKt;->first(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    if-ne v0, v2, :cond_2

    .line 54
    .line 55
    return-object v2

    .line 56
    :cond_2
    :goto_0
    iget-object v0, v1, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->c:Lcom/zykj/view/board/board/BoardViewModel;

    .line 57
    .line 58
    invoke-static {v0}, Lcom/zykj/view/board/board/BoardViewModel;->p(Lcom/zykj/view/board/board/BoardViewModel;)Ln4/i;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    if-nez v6, :cond_3

    .line 63
    .line 64
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 65
    .line 66
    return-object v0

    .line 67
    :cond_3
    iget-object v0, v1, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->c:Lcom/zykj/view/board/board/BoardViewModel;

    .line 68
    .line 69
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardViewModel;->I0()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    const/4 v2, 0x0

    .line 74
    if-eqz v0, :cond_4

    .line 75
    .line 76
    const-string v0, "\u56fe\u7247\u6570\u91cf\u5df2\u8fbe\u4e0a\u9650\uff0c\u4e0d\u53ef\u7ee7\u7eed\u63d2\u5165"

    .line 77
    .line 78
    new-array v2, v2, [Ljava/lang/Object;

    .line 79
    .line 80
    invoke-static {v0, v2}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 84
    .line 85
    return-object v0

    .line 86
    :cond_4
    iget-object v7, v1, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->d:Landroid/graphics/Bitmap;

    .line 87
    .line 88
    iget-object v8, v1, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->e:Ljava/lang/String;

    .line 89
    .line 90
    iget-object v9, v1, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->f:Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;

    .line 91
    .line 92
    move-object v0, v7

    .line 93
    iget-object v7, v1, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->g:Ljava/lang/String;

    .line 94
    .line 95
    :try_start_0
    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 96
    .line 97
    if-eqz v0, :cond_5

    .line 98
    .line 99
    move-object v10, v9

    .line 100
    sget-object v9, Lcom/zykj/board/EzyPositionEnum$PositionEnum;->f:Lcom/zykj/board/EzyPositionEnum$PositionEnum;

    .line 101
    .line 102
    const/16 v13, 0x30

    .line 103
    .line 104
    const/4 v14, 0x0

    .line 105
    const/4 v11, 0x0

    .line 106
    const/4 v12, 0x0

    .line 107
    move-object v7, v0

    .line 108
    invoke-static/range {v6 .. v14}, Ln4/i$a;->a(Ln4/i;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;ZZILjava/lang/Object;)Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    goto :goto_1

    .line 113
    :catchall_0
    move-exception v0

    .line 114
    goto :goto_2

    .line 115
    :cond_5
    move-object v10, v9

    .line 116
    if-eqz v7, :cond_6

    .line 117
    .line 118
    sget-object v8, Lcom/zykj/board/EzyPositionEnum$PositionEnum;->f:Lcom/zykj/board/EzyPositionEnum$PositionEnum;

    .line 119
    .line 120
    const/16 v11, 0x8

    .line 121
    .line 122
    const/4 v12, 0x0

    .line 123
    move-object v9, v10

    .line 124
    const/4 v10, 0x0

    .line 125
    invoke-static/range {v6 .. v12}, Ln4/i$a;->b(Ln4/i;Ljava/lang/String;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;ZILjava/lang/Object;)Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    goto :goto_1

    .line 130
    :cond_6
    move-object v0, v5

    .line 131
    :goto_1
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 135
    goto :goto_3

    .line 136
    :goto_2
    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 137
    .line 138
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    :goto_3
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    if-eqz v3, :cond_7

    .line 151
    .line 152
    const-string v3, "\u56fe\u7247\u6570\u91cf\u8d85\u8fc7\u4e0a\u9650"

    .line 153
    .line 154
    new-array v2, v2, [Ljava/lang/Object;

    .line 155
    .line 156
    invoke-static {v3, v2}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    :cond_7
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v2

    .line 163
    if-eqz v2, :cond_8

    .line 164
    .line 165
    goto :goto_4

    .line 166
    :cond_8
    move-object v5, v0

    .line 167
    :goto_4
    check-cast v5, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 168
    .line 169
    if-eqz v5, :cond_b

    .line 170
    .line 171
    iget-object v0, v1, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->h:Lkotlin/jvm/functions/Function1;

    .line 172
    .line 173
    iget-boolean v2, v1, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->i:Z

    .line 174
    .line 175
    iget-object v3, v1, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->c:Lcom/zykj/view/board/board/BoardViewModel;

    .line 176
    .line 177
    if-eqz v0, :cond_9

    .line 178
    .line 179
    invoke-virtual {v5}, Lr4/a;->I()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    invoke-interface {v0, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    :cond_9
    if-eqz v2, :cond_b

    .line 187
    .line 188
    invoke-static {v3}, Lcom/zykj/view/board/board/BoardViewModel;->t(Lcom/zykj/view/board/board/BoardViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    :cond_a
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    move-object v7, v2

    .line 197
    check-cast v7, Lcom/zykj/view/board/board/m;

    .line 198
    .line 199
    sget-object v13, Lcom/zykj/view/board/board/n$d;->e:Lcom/zykj/view/board/board/n$d;

    .line 200
    .line 201
    const/16 v14, 0x1f

    .line 202
    .line 203
    const/4 v15, 0x0

    .line 204
    const/4 v8, 0x0

    .line 205
    const/4 v9, 0x0

    .line 206
    const/4 v10, 0x0

    .line 207
    const/4 v11, 0x0

    .line 208
    const/4 v12, 0x0

    .line 209
    invoke-static/range {v7 .. v15}, Lcom/zykj/view/board/board/m;->b(Lcom/zykj/view/board/board/m;ZZZZZLcom/zykj/view/board/board/n;ILjava/lang/Object;)Lcom/zykj/view/board/board/m;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    invoke-interface {v0, v2, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v2

    .line 217
    if-eqz v2, :cond_a

    .line 218
    .line 219
    invoke-virtual {v5}, Lq4/a;->getId()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-interface {v6, v0}, Ln4/i;->E(Ljava/util/List;)V

    .line 228
    .line 229
    .line 230
    :cond_b
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 231
    .line 232
    return-object v0
.end method
