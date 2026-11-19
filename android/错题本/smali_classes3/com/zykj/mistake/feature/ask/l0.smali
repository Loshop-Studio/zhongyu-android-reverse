.class public final synthetic Lcom/zykj/mistake/feature/ask/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/f;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/mistake/feature/ask/n;

.field public final synthetic c:Lr6/c;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/feature/ask/n;Lr6/c;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcom/zykj/mistake/feature/ask/l0;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/feature/ask/l0;->b:Lcom/zykj/mistake/feature/ask/n;

    iput-object p2, p0, Lcom/zykj/mistake/feature/ask/l0;->c:Lr6/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/zykj/mistake/feature/ask/l0;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Landroidx/compose/foundation/layout/BoxWithConstraintsScope;

    .line 11
    .line 12
    move-object/from16 v13, p2

    .line 13
    .line 14
    check-cast v13, Landroidx/compose/runtime/Composer;

    .line 15
    .line 16
    move-object/from16 v2, p3

    .line 17
    .line 18
    check-cast v2, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const-string v3, "$this$BoxWithConstraints"

    .line 25
    .line 26
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    and-int/lit8 v3, v2, 0x6

    .line 30
    .line 31
    const/4 v4, 0x2

    .line 32
    if-nez v3, :cond_1

    .line 33
    .line 34
    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    const/4 v3, 0x4

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move v3, v4

    .line 43
    :goto_0
    or-int/2addr v2, v3

    .line 44
    :cond_1
    and-int/lit8 v3, v2, 0x13

    .line 45
    .line 46
    const/16 v5, 0x12

    .line 47
    .line 48
    if-eq v3, v5, :cond_2

    .line 49
    .line 50
    const/4 v3, 0x1

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    const/4 v3, 0x0

    .line 53
    :goto_1
    and-int/lit8 v5, v2, 0x1

    .line 54
    .line 55
    invoke-interface {v13, v3, v5}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_6

    .line 60
    .line 61
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_3

    .line 66
    .line 67
    const/4 v3, -0x1

    .line 68
    const-string v5, "com.zykj.mistake.feature.ask.AskMaterialContent.<anonymous>.<anonymous> (MistakeAskMaterialScreen.kt:218)"

    .line 69
    .line 70
    const v6, -0x37d5d04b

    .line 71
    .line 72
    .line 73
    invoke-static {v6, v2, v3, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 74
    .line 75
    .line 76
    :cond_3
    invoke-interface {v1}, Landroidx/compose/foundation/layout/BoxWithConstraintsScope;->getMaxHeight-D9Ej5fM()F

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    const/16 v2, 0xc

    .line 81
    .line 82
    int-to-float v2, v2

    .line 83
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    sub-float/2addr v1, v3

    .line 88
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    int-to-float v3, v4

    .line 93
    div-float/2addr v1, v3

    .line 94
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    move v3, v2

    .line 99
    new-instance v2, Landroidx/compose/foundation/lazy/grid/GridCells$Fixed;

    .line 100
    .line 101
    invoke-direct {v2, v4}, Landroidx/compose/foundation/lazy/grid/GridCells$Fixed;-><init>(I)V

    .line 102
    .line 103
    .line 104
    sget-object v4, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 105
    .line 106
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    invoke-virtual {v4, v5}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    invoke-virtual {v4, v3}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    iget-object v3, v0, Lcom/zykj/mistake/feature/ask/l0;->b:Lcom/zykj/mistake/feature/ask/n;

    .line 123
    .line 124
    invoke-interface {v13, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    or-int/2addr v4, v5

    .line 133
    iget-object v5, v0, Lcom/zykj/mistake/feature/ask/l0;->c:Lr6/c;

    .line 134
    .line 135
    invoke-interface {v13, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    or-int/2addr v4, v6

    .line 140
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    if-nez v4, :cond_4

    .line 145
    .line 146
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 147
    .line 148
    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    if-ne v6, v4, :cond_5

    .line 153
    .line 154
    :cond_4
    new-instance v6, Lcom/zykj/mistake/feature/ask/f0;

    .line 155
    .line 156
    invoke-direct {v6, v3, v1, v5}, Lcom/zykj/mistake/feature/ask/f0;-><init>(Lcom/zykj/mistake/feature/ask/n;FLr6/c;)V

    .line 157
    .line 158
    .line 159
    invoke-interface {v13, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    :cond_5
    move-object v12, v6

    .line 163
    check-cast v12, Lr6/c;

    .line 164
    .line 165
    const/4 v15, 0x0

    .line 166
    const/16 v16, 0x39e

    .line 167
    .line 168
    const/4 v3, 0x0

    .line 169
    const/4 v4, 0x0

    .line 170
    const/4 v5, 0x0

    .line 171
    const/4 v6, 0x0

    .line 172
    const/4 v9, 0x0

    .line 173
    const/4 v10, 0x0

    .line 174
    const/4 v11, 0x0

    .line 175
    const/high16 v14, 0x1b0000

    .line 176
    .line 177
    invoke-static/range {v2 .. v16}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt;->LazyVerticalGrid(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lr6/c;Landroidx/compose/runtime/Composer;III)V

    .line 178
    .line 179
    .line 180
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    if-eqz v1, :cond_7

    .line 185
    .line 186
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 187
    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_6
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 191
    .line 192
    .line 193
    :cond_7
    :goto_2
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 194
    .line 195
    return-object v1

    .line 196
    :pswitch_0
    move-object/from16 v1, p1

    .line 197
    .line 198
    check-cast v1, Landroidx/compose/foundation/layout/BoxWithConstraintsScope;

    .line 199
    .line 200
    move-object/from16 v13, p2

    .line 201
    .line 202
    check-cast v13, Landroidx/compose/runtime/Composer;

    .line 203
    .line 204
    move-object/from16 v2, p3

    .line 205
    .line 206
    check-cast v2, Ljava/lang/Integer;

    .line 207
    .line 208
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 209
    .line 210
    .line 211
    move-result v2

    .line 212
    const-string v3, "$this$BoxWithConstraints"

    .line 213
    .line 214
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    and-int/lit8 v3, v2, 0x6

    .line 218
    .line 219
    const/4 v4, 0x2

    .line 220
    const/4 v5, 0x4

    .line 221
    if-nez v3, :cond_9

    .line 222
    .line 223
    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v3

    .line 227
    if-eqz v3, :cond_8

    .line 228
    .line 229
    move v3, v5

    .line 230
    goto :goto_3

    .line 231
    :cond_8
    move v3, v4

    .line 232
    :goto_3
    or-int/2addr v2, v3

    .line 233
    :cond_9
    and-int/lit8 v3, v2, 0x13

    .line 234
    .line 235
    const/16 v6, 0x12

    .line 236
    .line 237
    const/4 v7, 0x0

    .line 238
    const/4 v8, 0x1

    .line 239
    if-eq v3, v6, :cond_a

    .line 240
    .line 241
    move v3, v8

    .line 242
    goto :goto_4

    .line 243
    :cond_a
    move v3, v7

    .line 244
    :goto_4
    and-int/lit8 v6, v2, 0x1

    .line 245
    .line 246
    invoke-interface {v13, v3, v6}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 247
    .line 248
    .line 249
    move-result v3

    .line 250
    if-eqz v3, :cond_f

    .line 251
    .line 252
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    if-eqz v3, :cond_b

    .line 257
    .line 258
    const/4 v3, -0x1

    .line 259
    const-string v6, "com.zykj.mistake.feature.ask.AskMaterialContent.<anonymous>.<anonymous> (MistakeAskMaterialScreen.kt:197)"

    .line 260
    .line 261
    const v9, -0x48d4a46a

    .line 262
    .line 263
    .line 264
    invoke-static {v9, v2, v3, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 265
    .line 266
    .line 267
    :cond_b
    move v3, v2

    .line 268
    new-instance v2, Landroidx/compose/foundation/lazy/grid/GridCells$Fixed;

    .line 269
    .line 270
    invoke-direct {v2, v4}, Landroidx/compose/foundation/lazy/grid/GridCells$Fixed;-><init>(I)V

    .line 271
    .line 272
    .line 273
    sget-object v4, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 274
    .line 275
    const/16 v6, 0xc

    .line 276
    .line 277
    int-to-float v6, v6

    .line 278
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 279
    .line 280
    .line 281
    move-result v9

    .line 282
    invoke-virtual {v4, v9}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 283
    .line 284
    .line 285
    move-result-object v9

    .line 286
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 287
    .line 288
    .line 289
    move-result v6

    .line 290
    invoke-virtual {v4, v6}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 291
    .line 292
    .line 293
    move-result-object v4

    .line 294
    iget-object v6, v0, Lcom/zykj/mistake/feature/ask/l0;->b:Lcom/zykj/mistake/feature/ask/n;

    .line 295
    .line 296
    invoke-interface {v13, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    move-result v10

    .line 300
    and-int/lit8 v3, v3, 0xe

    .line 301
    .line 302
    if-ne v3, v5, :cond_c

    .line 303
    .line 304
    move v7, v8

    .line 305
    :cond_c
    or-int v3, v10, v7

    .line 306
    .line 307
    iget-object v5, v0, Lcom/zykj/mistake/feature/ask/l0;->c:Lr6/c;

    .line 308
    .line 309
    invoke-interface {v13, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result v7

    .line 313
    or-int/2addr v3, v7

    .line 314
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v7

    .line 318
    if-nez v3, :cond_d

    .line 319
    .line 320
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 321
    .line 322
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v3

    .line 326
    if-ne v7, v3, :cond_e

    .line 327
    .line 328
    :cond_d
    new-instance v7, Landroidx/lifecycle/i;

    .line 329
    .line 330
    const/4 v3, 0x5

    .line 331
    invoke-direct {v7, v3, v6, v1, v5}, Landroidx/lifecycle/i;-><init>(ILjava/lang/Object;Ljava/lang/Object;Lr6/c;)V

    .line 332
    .line 333
    .line 334
    invoke-interface {v13, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 335
    .line 336
    .line 337
    :cond_e
    move-object v12, v7

    .line 338
    check-cast v12, Lr6/c;

    .line 339
    .line 340
    const/4 v15, 0x0

    .line 341
    const/16 v16, 0x39e

    .line 342
    .line 343
    const/4 v3, 0x0

    .line 344
    move-object v7, v4

    .line 345
    const/4 v4, 0x0

    .line 346
    const/4 v5, 0x0

    .line 347
    const/4 v6, 0x0

    .line 348
    move-object v8, v9

    .line 349
    const/4 v9, 0x0

    .line 350
    const/4 v10, 0x0

    .line 351
    const/4 v11, 0x0

    .line 352
    const/high16 v14, 0x1b0000

    .line 353
    .line 354
    invoke-static/range {v2 .. v16}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt;->LazyVerticalGrid(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lr6/c;Landroidx/compose/runtime/Composer;III)V

    .line 355
    .line 356
    .line 357
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 358
    .line 359
    .line 360
    move-result v1

    .line 361
    if-eqz v1, :cond_10

    .line 362
    .line 363
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 364
    .line 365
    .line 366
    goto :goto_5

    .line 367
    :cond_f
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 368
    .line 369
    .line 370
    :cond_10
    :goto_5
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 371
    .line 372
    return-object v1

    .line 373
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
