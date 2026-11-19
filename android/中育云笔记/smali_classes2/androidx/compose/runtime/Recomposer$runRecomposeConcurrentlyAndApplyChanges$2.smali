.class final Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/runtime/Recomposer;->runRecomposeConcurrentlyAndApplyChanges(Lkotlin/coroutines/d;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/q;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2"
    f = "Recomposer.kt"
    l = {
        0x38f,
        0x3a3,
        0x3a4
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $recomposeCoroutineContext:Lkotlin/coroutines/d;

.field private synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Landroidx/compose/runtime/Recomposer;


# direct methods
.method public constructor <init>(Lkotlin/coroutines/d;Landroidx/compose/runtime/Recomposer;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/d;",
            "Landroidx/compose/runtime/Recomposer;",
            "Lvc/c<",
            "-",
            "Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2;->$recomposeCoroutineContext:Lkotlin/coroutines/d;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2;->this$0:Landroidx/compose/runtime/Recomposer;

    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Landroidx/compose/runtime/MonotonicFrameClock;

    check-cast p3, Lvc/c;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2;->invoke(Lsd/i0;Landroidx/compose/runtime/MonotonicFrameClock;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Landroidx/compose/runtime/MonotonicFrameClock;Lvc/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/i0;",
            "Landroidx/compose/runtime/MonotonicFrameClock;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    new-instance v0, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2;

    iget-object v1, p0, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2;->$recomposeCoroutineContext:Lkotlin/coroutines/d;

    iget-object v2, p0, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2;->this$0:Landroidx/compose/runtime/Recomposer;

    invoke-direct {v0, v1, v2, p3}, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2;-><init>(Lkotlin/coroutines/d;Landroidx/compose/runtime/Recomposer;Lvc/c;)V

    iput-object p1, v0, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2;->L$1:Ljava/lang/Object;

    sget-object p1, Lqc/q;->a:Lqc/q;

    invoke-virtual {v0, p1}, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v2, v1, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2;->label:I

    .line 8
    .line 9
    const/4 v3, 0x3

    .line 10
    const/4 v4, 0x2

    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x1

    .line 14
    if-eqz v2, :cond_3

    .line 15
    .line 16
    if-eq v2, v7, :cond_2

    .line 17
    .line 18
    if-eq v2, v4, :cond_1

    .line 19
    .line 20
    if-ne v2, v3, :cond_0

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto/16 :goto_c

    .line 26
    .line 27
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 30
    .line 31
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v0

    .line 35
    :cond_1
    iget-object v2, v1, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2;->L$0:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v2, Lkotlinx/coroutines/g;

    .line 38
    .line 39
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto/16 :goto_a

    .line 43
    .line 44
    :cond_2
    iget-object v2, v1, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2;->L$2:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v2, Lkotlinx/coroutines/g;

    .line 47
    .line 48
    iget-object v8, v1, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2;->L$1:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v8, Landroidx/compose/runtime/ProduceFrameSignal;

    .line 51
    .line 52
    iget-object v9, v1, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2;->L$0:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v9, Lsd/i0;

    .line 55
    .line 56
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto/16 :goto_2

    .line 60
    .line 61
    :cond_3
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-object v2, v1, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2;->L$0:Ljava/lang/Object;

    .line 65
    .line 66
    move-object v8, v2

    .line 67
    check-cast v8, Lsd/i0;

    .line 68
    .line 69
    iget-object v2, v1, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2;->L$1:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v2, Landroidx/compose/runtime/MonotonicFrameClock;

    .line 72
    .line 73
    iget-object v9, v1, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2;->$recomposeCoroutineContext:Lkotlin/coroutines/d;

    .line 74
    .line 75
    sget-object v10, Lkotlinx/coroutines/g;->b0:Lkotlinx/coroutines/g$b;

    .line 76
    .line 77
    invoke-interface {v9, v10}, Lkotlin/coroutines/d;->get(Lkotlin/coroutines/d$c;)Lkotlin/coroutines/d$b;

    .line 78
    .line 79
    .line 80
    move-result-object v9

    .line 81
    if-nez v9, :cond_4

    .line 82
    .line 83
    move v9, v7

    .line 84
    goto :goto_0

    .line 85
    :cond_4
    move v9, v5

    .line 86
    :goto_0
    iget-object v11, v1, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2;->$recomposeCoroutineContext:Lkotlin/coroutines/d;

    .line 87
    .line 88
    if-nez v9, :cond_5

    .line 89
    .line 90
    new-instance v9, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 93
    .line 94
    .line 95
    const-string/jumbo v12, "recomposeCoroutineContext may not contain a Job; found "

    .line 96
    .line 97
    .line 98
    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-interface {v11, v10}, Lkotlin/coroutines/d;->get(Lkotlin/coroutines/d$c;)Lkotlin/coroutines/d$b;

    .line 102
    .line 103
    .line 104
    move-result-object v10

    .line 105
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v9

    .line 112
    invoke-static {v9}, Landroidx/compose/runtime/PreconditionsKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    :cond_5
    invoke-interface {v8}, Lsd/i0;->getCoroutineContext()Lkotlin/coroutines/d;

    .line 116
    .line 117
    .line 118
    move-result-object v9

    .line 119
    iget-object v10, v1, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2;->$recomposeCoroutineContext:Lkotlin/coroutines/d;

    .line 120
    .line 121
    invoke-interface {v9, v10}, Lkotlin/coroutines/d;->plus(Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    .line 122
    .line 123
    .line 124
    move-result-object v9

    .line 125
    invoke-interface {v8}, Lsd/i0;->getCoroutineContext()Lkotlin/coroutines/d;

    .line 126
    .line 127
    .line 128
    move-result-object v10

    .line 129
    invoke-static {v10}, Lsd/o1;->k(Lkotlin/coroutines/d;)Lkotlinx/coroutines/g;

    .line 130
    .line 131
    .line 132
    move-result-object v10

    .line 133
    invoke-static {v10}, Lsd/o1;->a(Lkotlinx/coroutines/g;)Lsd/v;

    .line 134
    .line 135
    .line 136
    move-result-object v10

    .line 137
    invoke-interface {v9, v10}, Lkotlin/coroutines/d;->plus(Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    .line 138
    .line 139
    .line 140
    move-result-object v9

    .line 141
    invoke-static {v9}, Lkotlinx/coroutines/d;->a(Lkotlin/coroutines/d;)Lsd/i0;

    .line 142
    .line 143
    .line 144
    move-result-object v14

    .line 145
    new-instance v15, Landroidx/compose/runtime/ProduceFrameSignal;

    .line 146
    .line 147
    invoke-direct {v15}, Landroidx/compose/runtime/ProduceFrameSignal;-><init>()V

    .line 148
    .line 149
    .line 150
    new-instance v11, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1;

    .line 151
    .line 152
    iget-object v9, v1, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2;->this$0:Landroidx/compose/runtime/Recomposer;

    .line 153
    .line 154
    invoke-direct {v11, v9, v2, v15, v6}, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1;-><init>(Landroidx/compose/runtime/Recomposer;Landroidx/compose/runtime/MonotonicFrameClock;Landroidx/compose/runtime/ProduceFrameSignal;Lvc/c;)V

    .line 155
    .line 156
    .line 157
    const/4 v12, 0x3

    .line 158
    const/4 v13, 0x0

    .line 159
    const/4 v9, 0x0

    .line 160
    const/4 v10, 0x0

    .line 161
    invoke-static/range {v8 .. v13}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    move-object v9, v14

    .line 166
    move-object v8, v15

    .line 167
    :goto_1
    iget-object v10, v1, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2;->this$0:Landroidx/compose/runtime/Recomposer;

    .line 168
    .line 169
    invoke-static {v10}, Landroidx/compose/runtime/Recomposer;->access$getShouldKeepRecomposing(Landroidx/compose/runtime/Recomposer;)Z

    .line 170
    .line 171
    .line 172
    move-result v10

    .line 173
    if-eqz v10, :cond_d

    .line 174
    .line 175
    iget-object v10, v1, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2;->this$0:Landroidx/compose/runtime/Recomposer;

    .line 176
    .line 177
    iput-object v9, v1, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2;->L$0:Ljava/lang/Object;

    .line 178
    .line 179
    iput-object v8, v1, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2;->L$1:Ljava/lang/Object;

    .line 180
    .line 181
    iput-object v2, v1, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2;->L$2:Ljava/lang/Object;

    .line 182
    .line 183
    iput v7, v1, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2;->label:I

    .line 184
    .line 185
    invoke-static {v10, v1}, Landroidx/compose/runtime/Recomposer;->access$awaitWorkAvailable(Landroidx/compose/runtime/Recomposer;Lvc/c;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v10

    .line 189
    if-ne v10, v0, :cond_6

    .line 190
    .line 191
    goto/16 :goto_b

    .line 192
    .line 193
    :cond_6
    :goto_2
    iget-object v15, v1, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2;->this$0:Landroidx/compose/runtime/Recomposer;

    .line 194
    .line 195
    invoke-static {v15}, Landroidx/compose/runtime/Recomposer;->access$getStateLock$p(Landroidx/compose/runtime/Recomposer;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v10

    .line 199
    monitor-enter v10

    .line 200
    :try_start_0
    invoke-static {v15}, Landroidx/compose/runtime/Recomposer;->access$getSnapshotInvalidations$p(Landroidx/compose/runtime/Recomposer;)Landroidx/collection/MutableScatterSet;

    .line 201
    .line 202
    .line 203
    move-result-object v11

    .line 204
    invoke-virtual {v11}, Landroidx/collection/ScatterSet;->isNotEmpty()Z

    .line 205
    .line 206
    .line 207
    move-result v12

    .line 208
    if-eqz v12, :cond_7

    .line 209
    .line 210
    new-instance v12, Landroidx/collection/MutableScatterSet;

    .line 211
    .line 212
    invoke-direct {v12, v5, v7, v6}, Landroidx/collection/MutableScatterSet;-><init>(IILkotlin/jvm/internal/n;)V

    .line 213
    .line 214
    .line 215
    invoke-static {v15, v12}, Landroidx/compose/runtime/Recomposer;->access$setSnapshotInvalidations$p(Landroidx/compose/runtime/Recomposer;Landroidx/collection/MutableScatterSet;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 216
    .line 217
    .line 218
    goto :goto_3

    .line 219
    :catchall_0
    move-exception v0

    .line 220
    goto/16 :goto_9

    .line 221
    .line 222
    :cond_7
    :goto_3
    monitor-exit v10

    .line 223
    invoke-static {v11}, Landroidx/compose/runtime/collection/ScatterSetWrapperKt;->wrapIntoSet(Landroidx/collection/ScatterSet;)Ljava/util/Set;

    .line 224
    .line 225
    .line 226
    move-result-object v10

    .line 227
    move-object v11, v10

    .line 228
    check-cast v11, Ljava/util/Collection;

    .line 229
    .line 230
    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    .line 231
    .line 232
    .line 233
    move-result v11

    .line 234
    if-nez v11, :cond_8

    .line 235
    .line 236
    invoke-static {v15}, Landroidx/compose/runtime/Recomposer;->access$getKnownCompositions(Landroidx/compose/runtime/Recomposer;)Ljava/util/List;

    .line 237
    .line 238
    .line 239
    move-result-object v11

    .line 240
    move-object v12, v11

    .line 241
    check-cast v12, Ljava/util/Collection;

    .line 242
    .line 243
    invoke-interface {v12}, Ljava/util/Collection;->size()I

    .line 244
    .line 245
    .line 246
    move-result v12

    .line 247
    move v13, v5

    .line 248
    :goto_4
    if-ge v13, v12, :cond_8

    .line 249
    .line 250
    invoke-interface {v11, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v14

    .line 254
    check-cast v14, Landroidx/compose/runtime/ControlledComposition;

    .line 255
    .line 256
    invoke-interface {v14, v10}, Landroidx/compose/runtime/ControlledComposition;->recordModificationsOf(Ljava/util/Set;)V

    .line 257
    .line 258
    .line 259
    add-int/lit8 v13, v13, 0x1

    .line 260
    .line 261
    goto :goto_4

    .line 262
    :cond_8
    invoke-static {v15}, Landroidx/compose/runtime/Recomposer;->access$getCompositionInvalidations$p(Landroidx/compose/runtime/Recomposer;)Landroidx/compose/runtime/collection/MutableVector;

    .line 263
    .line 264
    .line 265
    move-result-object v10

    .line 266
    iget-object v11, v10, Landroidx/compose/runtime/collection/MutableVector;->content:[Ljava/lang/Object;

    .line 267
    .line 268
    invoke-virtual {v10}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 269
    .line 270
    .line 271
    move-result v10

    .line 272
    move v12, v5

    .line 273
    :goto_5
    if-ge v12, v10, :cond_9

    .line 274
    .line 275
    aget-object v13, v11, v12

    .line 276
    .line 277
    check-cast v13, Landroidx/compose/runtime/ControlledComposition;

    .line 278
    .line 279
    invoke-static {v15}, Landroidx/compose/runtime/Recomposer;->access$getStateLock$p(Landroidx/compose/runtime/Recomposer;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v14

    .line 283
    monitor-enter v14

    .line 284
    :try_start_1
    invoke-static {v15}, Landroidx/compose/runtime/Recomposer;->access$getConcurrentCompositionsOutstanding$p(Landroidx/compose/runtime/Recomposer;)I

    .line 285
    .line 286
    .line 287
    move-result v16

    .line 288
    add-int/lit8 v5, v16, 0x1

    .line 289
    .line 290
    invoke-static {v15, v5}, Landroidx/compose/runtime/Recomposer;->access$setConcurrentCompositionsOutstanding$p(Landroidx/compose/runtime/Recomposer;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 291
    .line 292
    .line 293
    monitor-exit v14

    .line 294
    move v5, v10

    .line 295
    invoke-static {v13}, Landroidx/compose/runtime/CompositionKt;->getRecomposeCoroutineContext(Landroidx/compose/runtime/ControlledComposition;)Lkotlin/coroutines/d;

    .line 296
    .line 297
    .line 298
    move-result-object v10

    .line 299
    move v14, v12

    .line 300
    new-instance v12, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2;

    .line 301
    .line 302
    invoke-direct {v12, v15, v13, v6}, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2;-><init>(Landroidx/compose/runtime/Recomposer;Landroidx/compose/runtime/ControlledComposition;Lvc/c;)V

    .line 303
    .line 304
    .line 305
    const/4 v13, 0x2

    .line 306
    move/from16 v16, v14

    .line 307
    .line 308
    const/4 v14, 0x0

    .line 309
    move-object/from16 v17, v11

    .line 310
    .line 311
    const/4 v11, 0x0

    .line 312
    invoke-static/range {v9 .. v14}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 313
    .line 314
    .line 315
    add-int/lit8 v12, v16, 0x1

    .line 316
    .line 317
    move v10, v5

    .line 318
    move-object/from16 v11, v17

    .line 319
    .line 320
    const/4 v5, 0x0

    .line 321
    goto :goto_5

    .line 322
    :catchall_1
    move-exception v0

    .line 323
    monitor-exit v14

    .line 324
    throw v0

    .line 325
    :cond_9
    invoke-static {v15}, Landroidx/compose/runtime/Recomposer;->access$getCompositionInvalidations$p(Landroidx/compose/runtime/Recomposer;)Landroidx/compose/runtime/collection/MutableVector;

    .line 326
    .line 327
    .line 328
    move-result-object v5

    .line 329
    invoke-virtual {v5}, Landroidx/compose/runtime/collection/MutableVector;->clear()V

    .line 330
    .line 331
    .line 332
    invoke-static {v15}, Landroidx/compose/runtime/Recomposer;->access$getStateLock$p(Landroidx/compose/runtime/Recomposer;)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v5

    .line 336
    monitor-enter v5

    .line 337
    :try_start_2
    invoke-static {v15}, Landroidx/compose/runtime/Recomposer;->access$deriveStateLocked(Landroidx/compose/runtime/Recomposer;)Lsd/j;

    .line 338
    .line 339
    .line 340
    move-result-object v10

    .line 341
    if-nez v10, :cond_c

    .line 342
    .line 343
    sget-object v10, Lqc/q;->a:Lqc/q;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 344
    .line 345
    monitor-exit v5

    .line 346
    iget-object v5, v1, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2;->this$0:Landroidx/compose/runtime/Recomposer;

    .line 347
    .line 348
    invoke-static {v5}, Landroidx/compose/runtime/Recomposer;->access$getStateLock$p(Landroidx/compose/runtime/Recomposer;)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v5

    .line 352
    iget-object v10, v1, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2;->this$0:Landroidx/compose/runtime/Recomposer;

    .line 353
    .line 354
    monitor-enter v5

    .line 355
    :try_start_3
    invoke-static {v10}, Landroidx/compose/runtime/Recomposer;->access$getHasConcurrentFrameWorkLocked(Landroidx/compose/runtime/Recomposer;)Z

    .line 356
    .line 357
    .line 358
    move-result v10

    .line 359
    if-eqz v10, :cond_a

    .line 360
    .line 361
    invoke-virtual {v8}, Landroidx/compose/runtime/ProduceFrameSignal;->requestFrameLocked()Lvc/c;

    .line 362
    .line 363
    .line 364
    move-result-object v10
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 365
    goto :goto_6

    .line 366
    :catchall_2
    move-exception v0

    .line 367
    goto :goto_7

    .line 368
    :cond_a
    move-object v10, v6

    .line 369
    :goto_6
    monitor-exit v5

    .line 370
    if-eqz v10, :cond_b

    .line 371
    .line 372
    sget-object v5, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 373
    .line 374
    sget-object v5, Lqc/q;->a:Lqc/q;

    .line 375
    .line 376
    invoke-static {v5}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v5

    .line 380
    invoke-interface {v10, v5}, Lvc/c;->resumeWith(Ljava/lang/Object;)V

    .line 381
    .line 382
    .line 383
    :cond_b
    const/4 v5, 0x0

    .line 384
    goto/16 :goto_1

    .line 385
    .line 386
    :goto_7
    monitor-exit v5

    .line 387
    throw v0

    .line 388
    :catchall_3
    move-exception v0

    .line 389
    goto :goto_8

    .line 390
    :cond_c
    :try_start_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 391
    .line 392
    const-string v2, "called outside of runRecomposeAndApplyChanges"

    .line 393
    .line 394
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 398
    :goto_8
    monitor-exit v5

    .line 399
    throw v0

    .line 400
    :goto_9
    monitor-exit v10

    .line 401
    throw v0

    .line 402
    :cond_d
    invoke-interface {v9}, Lsd/i0;->getCoroutineContext()Lkotlin/coroutines/d;

    .line 403
    .line 404
    .line 405
    move-result-object v5

    .line 406
    invoke-static {v5}, Lsd/o1;->k(Lkotlin/coroutines/d;)Lkotlinx/coroutines/g;

    .line 407
    .line 408
    .line 409
    move-result-object v5

    .line 410
    iput-object v2, v1, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2;->L$0:Ljava/lang/Object;

    .line 411
    .line 412
    iput-object v6, v1, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2;->L$1:Ljava/lang/Object;

    .line 413
    .line 414
    iput-object v6, v1, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2;->L$2:Ljava/lang/Object;

    .line 415
    .line 416
    iput v4, v1, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2;->label:I

    .line 417
    .line 418
    invoke-static {v5, v1}, Lsd/o1;->g(Lkotlinx/coroutines/g;Lvc/c;)Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v4

    .line 422
    if-ne v4, v0, :cond_e

    .line 423
    .line 424
    goto :goto_b

    .line 425
    :cond_e
    :goto_a
    iput-object v6, v1, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2;->L$0:Ljava/lang/Object;

    .line 426
    .line 427
    iput v3, v1, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2;->label:I

    .line 428
    .line 429
    invoke-static {v2, v1}, Lsd/o1;->g(Lkotlinx/coroutines/g;Lvc/c;)Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v2

    .line 433
    if-ne v2, v0, :cond_f

    .line 434
    .line 435
    :goto_b
    return-object v0

    .line 436
    :cond_f
    :goto_c
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 437
    .line 438
    return-object v0
.end method
