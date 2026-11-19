.class public abstract Lcom/zykj/mistake/feature/ask/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lcom/zykj/mistake/feature/ask/MistakeAskMaterialViewModel;Lcom/zykj/mistake/feature/ask/f;Lz4/a;Landroidx/compose/runtime/Composer;I)V
    .locals 13

    .line 1
    move-object v2, p2

    .line 2
    move/from16 v7, p4

    .line 3
    .line 4
    const-string v0, "bundle"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const-string v0, "environment"

    .line 10
    .line 11
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const v0, 0x6bda1ba0

    .line 15
    .line 16
    .line 17
    move-object/from16 v4, p3

    .line 18
    .line 19
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 20
    .line 21
    .line 22
    move-result-object v8

    .line 23
    and-int/lit8 v4, v7, 0x6

    .line 24
    .line 25
    if-nez v4, :cond_1

    .line 26
    .line 27
    invoke-interface {v8, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    const/4 v4, 0x4

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 v4, 0x2

    .line 36
    :goto_0
    or-int/2addr v4, v7

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move v4, v7

    .line 39
    :goto_1
    and-int/lit8 v5, v7, 0x30

    .line 40
    .line 41
    if-nez v5, :cond_3

    .line 42
    .line 43
    invoke-interface {v8, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-eqz v5, :cond_2

    .line 48
    .line 49
    const/16 v5, 0x20

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    const/16 v5, 0x10

    .line 53
    .line 54
    :goto_2
    or-int/2addr v4, v5

    .line 55
    :cond_3
    and-int/lit16 v5, v7, 0x180

    .line 56
    .line 57
    if-nez v5, :cond_5

    .line 58
    .line 59
    invoke-interface {v8, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-eqz v5, :cond_4

    .line 64
    .line 65
    const/16 v5, 0x100

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_4
    const/16 v5, 0x80

    .line 69
    .line 70
    :goto_3
    or-int/2addr v4, v5

    .line 71
    :cond_5
    move v9, v4

    .line 72
    and-int/lit16 v4, v9, 0x93

    .line 73
    .line 74
    const/16 v5, 0x92

    .line 75
    .line 76
    if-eq v4, v5, :cond_6

    .line 77
    .line 78
    const/4 v4, 0x1

    .line 79
    goto :goto_4

    .line 80
    :cond_6
    const/4 v4, 0x0

    .line 81
    :goto_4
    and-int/lit8 v5, v9, 0x1

    .line 82
    .line 83
    invoke-interface {v8, v4, v5}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    if-eqz v4, :cond_e

    .line 88
    .line 89
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    if-eqz v4, :cond_7

    .line 94
    .line 95
    const/4 v4, -0x1

    .line 96
    const-string v5, "com.zykj.mistake.feature.ask.AskMaterialEffectHandler (AskMaterialEffectHandler.kt:22)"

    .line 97
    .line 98
    invoke-static {v0, v9, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 99
    .line 100
    .line 101
    :cond_7
    sget-object v0, Lw4/d;->a:Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 102
    .line 103
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    move-object v6, v0

    .line 108
    check-cast v6, Lw4/c;

    .line 109
    .line 110
    sget-object v0, Lt4/d;->a:Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 111
    .line 112
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    move-object v10, v0

    .line 117
    check-cast v10, Lt4/e;

    .line 118
    .line 119
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    sget-object v11, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 124
    .line 125
    invoke-virtual {v11}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    if-ne v0, v4, :cond_8

    .line 130
    .line 131
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 132
    .line 133
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 134
    .line 135
    .line 136
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    :cond_8
    move-object v4, v0

    .line 140
    check-cast v4, Ljava/util/Set;

    .line 141
    .line 142
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-virtual {v11}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    if-ne v0, v5, :cond_9

    .line 151
    .line 152
    new-instance v0, Lcom/zykj/mistake/feature/ask/b;

    .line 153
    .line 154
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 155
    .line 156
    .line 157
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    :cond_9
    move-object v12, v0

    .line 161
    check-cast v12, Lcom/zykj/mistake/feature/ask/b;

    .line 162
    .line 163
    invoke-interface {v8, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    invoke-interface {v8, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v5

    .line 171
    or-int/2addr v0, v5

    .line 172
    invoke-interface {v8, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v5

    .line 176
    or-int/2addr v0, v5

    .line 177
    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v5

    .line 181
    or-int/2addr v0, v5

    .line 182
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    if-nez v0, :cond_a

    .line 187
    .line 188
    invoke-virtual {v11}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    if-ne v5, v0, :cond_b

    .line 193
    .line 194
    :cond_a
    new-instance v0, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$AskMaterialEffectHandler$1$1;

    .line 195
    .line 196
    const/4 v5, 0x0

    .line 197
    move-object v3, p0

    .line 198
    move-object v1, p1

    .line 199
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$AskMaterialEffectHandler$1$1;-><init>(Lcom/zykj/mistake/feature/ask/f;Lz4/a;Lcom/zykj/mistake/feature/ask/MistakeAskMaterialViewModel;Ljava/util/Set;Lh6/c;)V

    .line 200
    .line 201
    .line 202
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    move-object v5, v0

    .line 206
    :cond_b
    check-cast v5, Lr6/e;

    .line 207
    .line 208
    shr-int/lit8 v0, v9, 0x3

    .line 209
    .line 210
    and-int/lit8 v0, v0, 0xe

    .line 211
    .line 212
    shl-int/lit8 v1, v9, 0x3

    .line 213
    .line 214
    and-int/lit8 v1, v1, 0x70

    .line 215
    .line 216
    or-int/2addr v0, v1

    .line 217
    invoke-static {p1, p0, v5, v8, v0}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Ljava/lang/Object;Lr6/e;Landroidx/compose/runtime/Composer;I)V

    .line 218
    .line 219
    .line 220
    invoke-interface {v8, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    invoke-interface {v8, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v1

    .line 228
    or-int/2addr v0, v1

    .line 229
    invoke-interface {v8, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v1

    .line 233
    or-int/2addr v0, v1

    .line 234
    invoke-interface {v8, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v1

    .line 238
    or-int/2addr v0, v1

    .line 239
    invoke-interface {v8, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    or-int/2addr v0, v1

    .line 244
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    if-nez v0, :cond_c

    .line 249
    .line 250
    invoke-virtual {v11}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    if-ne v1, v0, :cond_d

    .line 255
    .line 256
    :cond_c
    new-instance v0, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$AskMaterialEffectHandler$2$1;

    .line 257
    .line 258
    move-object v3, v6

    .line 259
    const/4 v6, 0x0

    .line 260
    move-object v1, p0

    .line 261
    move-object v4, v2

    .line 262
    move-object v2, v10

    .line 263
    move-object v5, v12

    .line 264
    invoke-direct/range {v0 .. v6}, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$AskMaterialEffectHandler$2$1;-><init>(Lcom/zykj/mistake/feature/ask/MistakeAskMaterialViewModel;Lt4/e;Lw4/c;Lz4/a;Lcom/zykj/mistake/feature/ask/b;Lh6/c;)V

    .line 265
    .line 266
    .line 267
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    move-object v1, v0

    .line 271
    :cond_d
    check-cast v1, Lr6/e;

    .line 272
    .line 273
    and-int/lit8 v0, v9, 0xe

    .line 274
    .line 275
    invoke-static {p0, v1, v8, v0}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lr6/e;Landroidx/compose/runtime/Composer;I)V

    .line 276
    .line 277
    .line 278
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 279
    .line 280
    .line 281
    move-result v0

    .line 282
    if-eqz v0, :cond_f

    .line 283
    .line 284
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 285
    .line 286
    .line 287
    goto :goto_5

    .line 288
    :cond_e
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 289
    .line 290
    .line 291
    :cond_f
    :goto_5
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 292
    .line 293
    .line 294
    move-result-object v6

    .line 295
    if-eqz v6, :cond_10

    .line 296
    .line 297
    new-instance v0, Landroidx/lifecycle/compose/g;

    .line 298
    .line 299
    const/4 v2, 0x3

    .line 300
    move-object v3, p0

    .line 301
    move-object v4, p1

    .line 302
    move-object v5, p2

    .line 303
    move v1, v7

    .line 304
    invoke-direct/range {v0 .. v5}, Landroidx/lifecycle/compose/g;-><init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    invoke-interface {v6, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 308
    .line 309
    .line 310
    :cond_10
    return-void
.end method

.method public static final b(Lcom/zykj/mistake/feature/ask/f;Lz4/a;Lcom/zykj/mistake/feature/ask/MistakeAskMaterialViewModel;Ljava/util/Set;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 13

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    instance-of v1, v0, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$prepareWebPreviews$1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$prepareWebPreviews$1;

    .line 9
    .line 10
    iget v2, v1, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$prepareWebPreviews$1;->label:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$prepareWebPreviews$1;->label:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$prepareWebPreviews$1;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$prepareWebPreviews$1;-><init>(Lh6/c;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v0, v1, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$prepareWebPreviews$1;->result:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 30
    .line 31
    iget v3, v1, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$prepareWebPreviews$1;->label:I

    .line 32
    .line 33
    sget-object v4, Ld6/s;->a:Ld6/s;

    .line 34
    .line 35
    const/4 v5, 0x1

    .line 36
    const/4 v6, 0x0

    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    if-ne v3, v5, :cond_1

    .line 40
    .line 41
    iget p0, v1, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$prepareWebPreviews$1;->I$0:I

    .line 42
    .line 43
    iget-object p1, v1, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$prepareWebPreviews$1;->L$10:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Lcom/zykj/mistake/feature/ask/x;

    .line 46
    .line 47
    iget-object v3, v1, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$prepareWebPreviews$1;->L$8:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v3, Ljava/util/Iterator;

    .line 50
    .line 51
    iget-object v7, v1, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$prepareWebPreviews$1;->L$7:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v7, Ljava/lang/Iterable;

    .line 54
    .line 55
    iget-object v7, v1, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$prepareWebPreviews$1;->L$6:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v7, Lcom/zykj/mistake/utils/c;

    .line 58
    .line 59
    iget-object v8, v1, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$prepareWebPreviews$1;->L$5:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v8, Landroid/widget/FrameLayout;

    .line 62
    .line 63
    iget-object v8, v1, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$prepareWebPreviews$1;->L$4:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v8, Ljava/util/List;

    .line 66
    .line 67
    iget-object v8, v1, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$prepareWebPreviews$1;->L$3:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v8, Ljava/util/Set;

    .line 70
    .line 71
    iget-object v9, v1, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$prepareWebPreviews$1;->L$2:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v9, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialViewModel;

    .line 74
    .line 75
    iget-object v10, v1, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$prepareWebPreviews$1;->L$1:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v10, Lz4/a;

    .line 78
    .line 79
    iget-object v10, v1, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$prepareWebPreviews$1;->L$0:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v10, Lcom/zykj/mistake/feature/ask/f;

    .line 82
    .line 83
    :try_start_0
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    .line 85
    .line 86
    goto/16 :goto_5

    .line 87
    .line 88
    :catchall_0
    move-exception v0

    .line 89
    goto/16 :goto_7

    .line 90
    .line 91
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 92
    .line 93
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 94
    .line 95
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw p0

    .line 99
    :cond_2
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    iget-object p0, p0, Lcom/zykj/mistake/feature/ask/f;->a:Ljava/util/List;

    .line 103
    .line 104
    new-instance v0, Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    if-eqz v3, :cond_3

    .line 118
    .line 119
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    check-cast v3, Lcom/zykj/mistake/feature/ask/m;

    .line 124
    .line 125
    iget-object v3, v3, Lcom/zykj/mistake/feature/ask/m;->b:Ljava/util/List;

    .line 126
    .line 127
    invoke-static {v3, v0}, Lkotlin/collections/y;->S(Ljava/lang/Iterable;Ljava/util/Collection;)V

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_3
    new-instance p0, Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    move v7, v6

    .line 141
    :cond_4
    :goto_2
    if-ge v7, v3, :cond_5

    .line 142
    .line 143
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v8

    .line 147
    add-int/lit8 v7, v7, 0x1

    .line 148
    .line 149
    move-object v9, v8

    .line 150
    check-cast v9, Lcom/zykj/mistake/feature/ask/x;

    .line 151
    .line 152
    iget-object v10, v9, Lcom/zykj/mistake/feature/ask/x;->c:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;

    .line 153
    .line 154
    sget-object v11, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;->WEB:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;

    .line 155
    .line 156
    if-ne v10, v11, :cond_4

    .line 157
    .line 158
    iget-object v9, v9, Lcom/zykj/mistake/feature/ask/x;->e:Ljava/lang/String;

    .line 159
    .line 160
    invoke-static {v9}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 161
    .line 162
    .line 163
    move-result v9

    .line 164
    if-nez v9, :cond_4

    .line 165
    .line 166
    invoke-virtual {p0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_5
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    if-eqz v0, :cond_6

    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_6
    iget-object v0, p1, Lz4/a;->b:Lo2/a;

    .line 178
    .line 179
    iget-object v0, v0, Lo2/a;->b:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v0, Landroid/widget/FrameLayout;

    .line 182
    .line 183
    if-nez v0, :cond_7

    .line 184
    .line 185
    :goto_3
    return-object v4

    .line 186
    :cond_7
    new-instance v3, Lcom/zykj/mistake/utils/c;

    .line 187
    .line 188
    iget-object p1, p1, Lz4/a;->a:Lcom/zykj/mistake/activity/MainActivity;

    .line 189
    .line 190
    invoke-direct {v3, p1, v0}, Lcom/zykj/mistake/utils/c;-><init>(Lcom/zykj/mistake/activity/MainActivity;Landroid/widget/FrameLayout;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    move-object v7, p0

    .line 198
    move-object p1, p2

    .line 199
    move-object v8, v3

    .line 200
    move p0, v6

    .line 201
    move-object v3, v1

    .line 202
    move-object/from16 v1, p3

    .line 203
    .line 204
    :cond_8
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    if-eqz v0, :cond_b

    .line 209
    .line 210
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    move-object v9, v0

    .line 215
    check-cast v9, Lcom/zykj/mistake/feature/ask/x;

    .line 216
    .line 217
    iget-object v0, v9, Lcom/zykj/mistake/feature/ask/x;->a:Ljava/lang/String;

    .line 218
    .line 219
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    if-eqz v0, :cond_8

    .line 224
    .line 225
    :try_start_1
    iget-object v0, v9, Lcom/zykj/mistake/feature/ask/x;->e:Ljava/lang/String;

    .line 226
    .line 227
    iget-object v10, v9, Lcom/zykj/mistake/feature/ask/x;->a:Ljava/lang/String;

    .line 228
    .line 229
    new-instance v11, Ljava/lang/StringBuilder;

    .line 230
    .line 231
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    const-string v10, "_preview"

    .line 238
    .line 239
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v10

    .line 246
    const/4 v11, 0x0

    .line 247
    iput-object v11, v3, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$prepareWebPreviews$1;->L$0:Ljava/lang/Object;

    .line 248
    .line 249
    iput-object v11, v3, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$prepareWebPreviews$1;->L$1:Ljava/lang/Object;

    .line 250
    .line 251
    iput-object p1, v3, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$prepareWebPreviews$1;->L$2:Ljava/lang/Object;

    .line 252
    .line 253
    iput-object v1, v3, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$prepareWebPreviews$1;->L$3:Ljava/lang/Object;

    .line 254
    .line 255
    iput-object v11, v3, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$prepareWebPreviews$1;->L$4:Ljava/lang/Object;

    .line 256
    .line 257
    iput-object v11, v3, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$prepareWebPreviews$1;->L$5:Ljava/lang/Object;

    .line 258
    .line 259
    iput-object v8, v3, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$prepareWebPreviews$1;->L$6:Ljava/lang/Object;

    .line 260
    .line 261
    iput-object v11, v3, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$prepareWebPreviews$1;->L$7:Ljava/lang/Object;

    .line 262
    .line 263
    iput-object v7, v3, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$prepareWebPreviews$1;->L$8:Ljava/lang/Object;

    .line 264
    .line 265
    iput-object v11, v3, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$prepareWebPreviews$1;->L$9:Ljava/lang/Object;

    .line 266
    .line 267
    iput-object v9, v3, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$prepareWebPreviews$1;->L$10:Ljava/lang/Object;

    .line 268
    .line 269
    iput p0, v3, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$prepareWebPreviews$1;->I$0:I

    .line 270
    .line 271
    iput v6, v3, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$prepareWebPreviews$1;->I$1:I

    .line 272
    .line 273
    iput v6, v3, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$prepareWebPreviews$1;->I$2:I

    .line 274
    .line 275
    iput v5, v3, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$prepareWebPreviews$1;->label:I

    .line 276
    .line 277
    invoke-virtual {v8, v0, v10, v3}, Lcom/zykj/mistake/utils/c;->c(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 281
    if-ne v0, v2, :cond_9

    .line 282
    .line 283
    goto :goto_9

    .line 284
    :cond_9
    move-object v12, v9

    .line 285
    move-object v9, p1

    .line 286
    move-object p1, v12

    .line 287
    move-object v12, v8

    .line 288
    move-object v8, v1

    .line 289
    move-object v1, v3

    .line 290
    move-object v3, v7

    .line 291
    move-object v7, v12

    .line 292
    :goto_5
    :try_start_2
    check-cast v0, Ljava/lang/String;

    .line 293
    .line 294
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 298
    :goto_6
    move-object v12, v7

    .line 299
    move-object v7, v3

    .line 300
    move-object v3, v12

    .line 301
    goto :goto_8

    .line 302
    :catchall_1
    move-exception v0

    .line 303
    move-object v12, v9

    .line 304
    move-object v9, p1

    .line 305
    move-object p1, v12

    .line 306
    move-object v12, v8

    .line 307
    move-object v8, v1

    .line 308
    move-object v1, v3

    .line 309
    move-object v3, v7

    .line 310
    move-object v7, v12

    .line 311
    :goto_7
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    goto :goto_6

    .line 320
    :goto_8
    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result v10

    .line 324
    if-eqz v10, :cond_a

    .line 325
    .line 326
    check-cast v0, Ljava/lang/String;

    .line 327
    .line 328
    new-instance v10, Lcom/zykj/mistake/feature/ask/t;

    .line 329
    .line 330
    iget-object v11, p1, Lcom/zykj/mistake/feature/ask/x;->a:Ljava/lang/String;

    .line 331
    .line 332
    invoke-direct {v10, v11, v0}, Lcom/zykj/mistake/feature/ask/t;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v9, v10}, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialViewModel;->a(Lcom/zykj/mistake/feature/ask/u;)V

    .line 336
    .line 337
    .line 338
    :cond_a
    iget-object p1, p1, Lcom/zykj/mistake/feature/ask/x;->a:Ljava/lang/String;

    .line 339
    .line 340
    invoke-interface {v8, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    move-object p1, v3

    .line 344
    move-object v3, v1

    .line 345
    move-object v1, v8

    .line 346
    move-object v8, p1

    .line 347
    move-object p1, v9

    .line 348
    goto/16 :goto_4

    .line 349
    .line 350
    :cond_b
    move-object v2, v4

    .line 351
    :goto_9
    return-object v2
.end method

.method public static final c(Ljava/util/ArrayList;Lz4/a;Lw4/c;Lcom/zykj/mistake/feature/ask/b;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p4, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$resolveAndOpenAsk$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$resolveAndOpenAsk$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$resolveAndOpenAsk$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$resolveAndOpenAsk$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$resolveAndOpenAsk$1;

    .line 21
    .line 22
    invoke-direct {v0, p4}, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$resolveAndOpenAsk$1;-><init>(Lh6/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$resolveAndOpenAsk$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$resolveAndOpenAsk$1;->label:I

    .line 30
    .line 31
    sget-object v3, Ld6/s;->a:Ld6/s;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x1

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v5, :cond_1

    .line 38
    .line 39
    iget-object p0, v0, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$resolveAndOpenAsk$1;->L$4:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, Landroid/widget/FrameLayout;

    .line 42
    .line 43
    iget-object p0, v0, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$resolveAndOpenAsk$1;->L$3:Ljava/lang/Object;

    .line 44
    .line 45
    move-object p3, p0

    .line 46
    check-cast p3, Lcom/zykj/mistake/feature/ask/b;

    .line 47
    .line 48
    iget-object p0, v0, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$resolveAndOpenAsk$1;->L$2:Ljava/lang/Object;

    .line 49
    .line 50
    move-object p2, p0

    .line 51
    check-cast p2, Lw4/c;

    .line 52
    .line 53
    iget-object p0, v0, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$resolveAndOpenAsk$1;->L$1:Ljava/lang/Object;

    .line 54
    .line 55
    move-object p1, p0

    .line 56
    check-cast p1, Lz4/a;

    .line 57
    .line 58
    iget-object p0, v0, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$resolveAndOpenAsk$1;->L$0:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p0, Ljava/util/List;

    .line 61
    .line 62
    :try_start_0
    invoke-static {p4}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :catchall_0
    move-exception p0

    .line 67
    goto :goto_2

    .line 68
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 69
    .line 70
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 71
    .line 72
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw p0

    .line 76
    :cond_2
    invoke-static {p4}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    iget-boolean p4, p3, Lcom/zykj/mistake/feature/ask/b;->a:Z

    .line 80
    .line 81
    if-eqz p4, :cond_3

    .line 82
    .line 83
    return-object v3

    .line 84
    :cond_3
    iget-object p4, p1, Lz4/a;->b:Lo2/a;

    .line 85
    .line 86
    iget-object p4, p4, Lo2/a;->b:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast p4, Landroid/widget/FrameLayout;

    .line 89
    .line 90
    if-nez p4, :cond_4

    .line 91
    .line 92
    const-string p0, "\u9875\u9762\u5c1a\u672a\u5c31\u7eea\uff0c\u8bf7\u7a0d\u540e\u91cd\u8bd5"

    .line 93
    .line 94
    check-cast p2, Lcom/zykj/mistake/activity/MainActivity;

    .line 95
    .line 96
    invoke-virtual {p2, p0}, Lcom/zykj/mistake/activity/MainActivity;->b(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    return-object v3

    .line 100
    :cond_4
    iput-boolean v5, p3, Lcom/zykj/mistake/feature/ask/b;->a:Z

    .line 101
    .line 102
    :try_start_1
    invoke-static {p2}, Lw4/c;->a(Lw4/c;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 103
    .line 104
    .line 105
    :try_start_2
    new-instance v2, Lcom/zykj/mistake/utils/c;

    .line 106
    .line 107
    iget-object v6, p1, Lz4/a;->a:Lcom/zykj/mistake/activity/MainActivity;

    .line 108
    .line 109
    invoke-direct {v2, v6, p4}, Lcom/zykj/mistake/utils/c;-><init>(Lcom/zykj/mistake/activity/MainActivity;Landroid/widget/FrameLayout;)V

    .line 110
    .line 111
    .line 112
    const/4 p4, 0x0

    .line 113
    iput-object p4, v0, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$resolveAndOpenAsk$1;->L$0:Ljava/lang/Object;

    .line 114
    .line 115
    iput-object p1, v0, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$resolveAndOpenAsk$1;->L$1:Ljava/lang/Object;

    .line 116
    .line 117
    iput-object p2, v0, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$resolveAndOpenAsk$1;->L$2:Ljava/lang/Object;

    .line 118
    .line 119
    iput-object p3, v0, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$resolveAndOpenAsk$1;->L$3:Ljava/lang/Object;

    .line 120
    .line 121
    iput-object p4, v0, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$resolveAndOpenAsk$1;->L$4:Ljava/lang/Object;

    .line 122
    .line 123
    iput v4, v0, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$resolveAndOpenAsk$1;->I$0:I

    .line 124
    .line 125
    iput v5, v0, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$resolveAndOpenAsk$1;->label:I

    .line 126
    .line 127
    invoke-virtual {v2, p0, v0}, Lcom/zykj/mistake/utils/c;->e(Ljava/util/List;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p4

    .line 131
    if-ne p4, v1, :cond_5

    .line 132
    .line 133
    return-object v1

    .line 134
    :cond_5
    :goto_1
    check-cast p4, Ljava/util/List;

    .line 135
    .line 136
    invoke-static {p4}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 140
    goto :goto_3

    .line 141
    :goto_2
    :try_start_3
    invoke-static {p0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    invoke-static {p0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    :goto_3
    check-cast p2, Lcom/zykj/mistake/activity/MainActivity;

    .line 150
    .line 151
    invoke-virtual {p2}, Lcom/zykj/mistake/activity/MainActivity;->c()V

    .line 152
    .line 153
    .line 154
    invoke-static {p0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result p4

    .line 158
    if-eqz p4, :cond_6

    .line 159
    .line 160
    move-object p4, p0

    .line 161
    check-cast p4, Ljava/util/List;

    .line 162
    .line 163
    invoke-static {p1, p2, p4}, Lcom/zykj/mistake/feature/ask/a;->d(Lz4/a;Lcom/zykj/mistake/activity/MainActivity;Ljava/util/List;)V

    .line 164
    .line 165
    .line 166
    goto :goto_4

    .line 167
    :catchall_1
    move-exception p0

    .line 168
    goto :goto_5

    .line 169
    :cond_6
    :goto_4
    invoke-static {p0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    if-eqz p0, :cond_7

    .line 174
    .line 175
    const-string p0, "\u7d20\u6750\u5904\u7406\u5931\u8d25"

    .line 176
    .line 177
    invoke-virtual {p2, p0}, Lcom/zykj/mistake/activity/MainActivity;->b(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 178
    .line 179
    .line 180
    :cond_7
    iput-boolean v4, p3, Lcom/zykj/mistake/feature/ask/b;->a:Z

    .line 181
    .line 182
    return-object v3

    .line 183
    :goto_5
    iput-boolean v4, p3, Lcom/zykj/mistake/feature/ask/b;->a:Z

    .line 184
    .line 185
    throw p0
.end method

.method public static final d(Lz4/a;Lcom/zykj/mistake/activity/MainActivity;Ljava/util/List;)V
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    move-object v2, v1

    .line 21
    check-cast v2, Ljava/lang/String;

    .line 22
    .line 23
    new-instance v3, Ljava/io/File;

    .line 24
    .line 25
    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-virtual {v3}, Ljava/io/File;->length()J

    .line 35
    .line 36
    .line 37
    move-result-wide v2

    .line 38
    const-wide/16 v4, 0x0

    .line 39
    .line 40
    cmp-long v2, v2, v4

    .line 41
    .line 42
    if-lez v2, :cond_0

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    if-eqz p2, :cond_2

    .line 53
    .line 54
    const-string p0, "\u7d20\u6750\u5904\u7406\u5931\u8d25"

    .line 55
    .line 56
    invoke-virtual {p1, p0}, Lcom/zykj/mistake/activity/MainActivity;->b(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_2
    iget-object p2, p0, Lz4/a;->a:Lcom/zykj/mistake/activity/MainActivity;

    .line 61
    .line 62
    invoke-virtual {p2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    const-string v1, "getPackageManager(...)"

    .line 67
    .line 68
    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-static {}, Lcoil3/network/g;->d()Landroid/content/Intent;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v1, p2}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    const-string v1, "\u672a\u68c0\u6d4b\u5230\u968f\u8eab\u7b54\u5e94\u7528\uff0c\u65e0\u6cd5\u63d0\u95ee"

    .line 80
    .line 81
    if-eqz p2, :cond_3

    .line 82
    .line 83
    :try_start_0
    iget-object p0, p0, Lz4/a;->a:Lcom/zykj/mistake/activity/MainActivity;

    .line 84
    .line 85
    invoke-static {}, Lcoil3/network/g;->d()Landroid/content/Intent;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    const-string v2, "localPathList"

    .line 90
    .line 91
    const/4 v3, 0x0

    .line 92
    new-array v3, v3, [Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, [Ljava/lang/String;

    .line 99
    .line 100
    invoke-virtual {p2, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :catch_0
    invoke-virtual {p1, v1}, Lcom/zykj/mistake/activity/MainActivity;->b(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :cond_3
    invoke-virtual {p1, v1}, Lcom/zykj/mistake/activity/MainActivity;->b(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    return-void
.end method
