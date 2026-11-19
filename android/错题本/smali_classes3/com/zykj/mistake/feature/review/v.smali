.class public final synthetic Lcom/zykj/mistake/feature/review/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/f;


# instance fields
.field public final synthetic a:F

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:J

.field public final synthetic e:J

.field public final synthetic f:Lr6/a;

.field public final synthetic g:Z

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:J


# direct methods
.method public synthetic constructor <init>(FILjava/lang/String;JJLr6/a;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/zykj/mistake/feature/review/v;->a:F

    iput p2, p0, Lcom/zykj/mistake/feature/review/v;->b:I

    iput-object p3, p0, Lcom/zykj/mistake/feature/review/v;->c:Ljava/lang/String;

    iput-wide p4, p0, Lcom/zykj/mistake/feature/review/v;->d:J

    iput-wide p6, p0, Lcom/zykj/mistake/feature/review/v;->e:J

    iput-object p8, p0, Lcom/zykj/mistake/feature/review/v;->f:Lr6/a;

    iput-boolean p9, p0, Lcom/zykj/mistake/feature/review/v;->g:Z

    iput-object p10, p0, Lcom/zykj/mistake/feature/review/v;->h:Ljava/lang/String;

    iput p11, p0, Lcom/zykj/mistake/feature/review/v;->i:I

    iput-object p12, p0, Lcom/zykj/mistake/feature/review/v;->j:Ljava/lang/String;

    iput-object p13, p0, Lcom/zykj/mistake/feature/review/v;->k:Ljava/lang/String;

    iput-wide p14, p0, Lcom/zykj/mistake/feature/review/v;->l:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Landroidx/compose/foundation/layout/BoxWithConstraintsScope;

    .line 6
    .line 7
    move-object/from16 v9, p2

    .line 8
    .line 9
    check-cast v9, Landroidx/compose/runtime/Composer;

    .line 10
    .line 11
    move-object/from16 v2, p3

    .line 12
    .line 13
    check-cast v2, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const-string v3, "$this$BoxWithConstraints"

    .line 20
    .line 21
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    and-int/lit8 v3, v2, 0x6

    .line 25
    .line 26
    if-nez v3, :cond_1

    .line 27
    .line 28
    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    const/4 v3, 0x4

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v3, 0x2

    .line 37
    :goto_0
    or-int/2addr v2, v3

    .line 38
    :cond_1
    and-int/lit8 v3, v2, 0x13

    .line 39
    .line 40
    const/16 v12, 0x12

    .line 41
    .line 42
    const/4 v13, 0x0

    .line 43
    if-eq v3, v12, :cond_2

    .line 44
    .line 45
    const/4 v3, 0x1

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    move v3, v13

    .line 48
    :goto_1
    and-int/lit8 v4, v2, 0x1

    .line 49
    .line 50
    invoke-interface {v9, v3, v4}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_e

    .line 55
    .line 56
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-eqz v3, :cond_3

    .line 61
    .line 62
    const/4 v3, -0x1

    .line 63
    const-string v4, "com.zykj.mistake.feature.review.ReviewPracticeCard.<anonymous> (ReviewScreen.kt:480)"

    .line 64
    .line 65
    const v5, 0x47b0854f

    .line 66
    .line 67
    .line 68
    invoke-static {v5, v2, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    :cond_3
    invoke-interface {v1}, Landroidx/compose/foundation/layout/BoxWithConstraintsScope;->getMaxHeight-D9Ej5fM()F

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    iget v3, v0, Lcom/zykj/mistake/feature/review/v;->a:F

    .line 76
    .line 77
    mul-float/2addr v2, v3

    .line 78
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    iget v3, v0, Lcom/zykj/mistake/feature/review/v;->b:I

    .line 83
    .line 84
    invoke-static {v3, v9, v13}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/painter/Painter;->getIntrinsicSize-NH-jbRc()J

    .line 89
    .line 90
    .line 91
    move-result-wide v4

    .line 92
    const/16 v14, 0x20

    .line 93
    .line 94
    shr-long/2addr v4, v14

    .line 95
    long-to-int v4, v4

    .line 96
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/painter/Painter;->getIntrinsicSize-NH-jbRc()J

    .line 101
    .line 102
    .line 103
    move-result-wide v5

    .line 104
    const-wide v7, 0xffffffffL

    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    and-long/2addr v5, v7

    .line 110
    long-to-int v5, v5

    .line 111
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    div-float/2addr v4, v5

    .line 116
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 121
    .line 122
    .line 123
    move-result v6

    .line 124
    const v7, 0x7f7fffff    # Float.MAX_VALUE

    .line 125
    .line 126
    .line 127
    cmpg-float v6, v6, v7

    .line 128
    .line 129
    if-gtz v6, :cond_4

    .line 130
    .line 131
    const/4 v6, 0x0

    .line 132
    cmpl-float v4, v4, v6

    .line 133
    .line 134
    if-lez v4, :cond_4

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_4
    const/4 v5, 0x0

    .line 138
    :goto_2
    if-eqz v5, :cond_5

    .line 139
    .line 140
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    goto :goto_3

    .line 145
    :cond_5
    const/high16 v4, 0x3f800000    # 1.0f

    .line 146
    .line 147
    :goto_3
    sget-object v5, Landroidx/compose/ui/layout/ContentScale;->Companion:Landroidx/compose/ui/layout/ContentScale$Companion;

    .line 148
    .line 149
    invoke-virtual {v5}, Landroidx/compose/ui/layout/ContentScale$Companion;->getFillBounds()Landroidx/compose/ui/layout/ContentScale;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    sget-object v15, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 154
    .line 155
    sget-object v27, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 156
    .line 157
    invoke-virtual/range {v27 .. v27}, Landroidx/compose/ui/Alignment$Companion;->getBottomEnd()Landroidx/compose/ui/Alignment;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    invoke-interface {v1, v15, v5}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    .line 162
    .line 163
    .line 164
    move-result-object v16

    .line 165
    const/16 v5, 0xa

    .line 166
    .line 167
    int-to-float v5, v5

    .line 168
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 169
    .line 170
    .line 171
    move-result v19

    .line 172
    const/16 v21, 0xb

    .line 173
    .line 174
    const/16 v22, 0x0

    .line 175
    .line 176
    const/16 v17, 0x0

    .line 177
    .line 178
    const/16 v18, 0x0

    .line 179
    .line 180
    const/16 v20, 0x0

    .line 181
    .line 182
    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 183
    .line 184
    .line 185
    move-result-object v7

    .line 186
    invoke-static {v7, v2}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 187
    .line 188
    .line 189
    move-result-object v7

    .line 190
    mul-float/2addr v2, v4

    .line 191
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    invoke-static {v7, v2}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    const/16 v10, 0x6030

    .line 200
    .line 201
    const/16 v11, 0x68

    .line 202
    .line 203
    move-object v2, v3

    .line 204
    const/4 v3, 0x0

    .line 205
    move v7, v5

    .line 206
    const/4 v5, 0x0

    .line 207
    move v8, v7

    .line 208
    const/4 v7, 0x0

    .line 209
    move/from16 v16, v8

    .line 210
    .line 211
    const/4 v8, 0x0

    .line 212
    move/from16 v28, v16

    .line 213
    .line 214
    invoke-static/range {v2 .. v11}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v27 .. v27}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    invoke-interface {v1, v15, v2}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    .line 222
    .line 223
    .line 224
    move-result-object v16

    .line 225
    int-to-float v2, v12

    .line 226
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 227
    .line 228
    .line 229
    move-result v17

    .line 230
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 231
    .line 232
    .line 233
    move-result v18

    .line 234
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 235
    .line 236
    .line 237
    move-result v19

    .line 238
    const/16 v21, 0x8

    .line 239
    .line 240
    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    sget-object v4, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 245
    .line 246
    invoke-virtual {v4}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 247
    .line 248
    .line 249
    move-result-object v5

    .line 250
    invoke-virtual/range {v27 .. v27}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 251
    .line 252
    .line 253
    move-result-object v6

    .line 254
    invoke-static {v5, v6, v9, v13}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 255
    .line 256
    .line 257
    move-result-object v5

    .line 258
    invoke-static {v9, v13}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 259
    .line 260
    .line 261
    move-result v6

    .line 262
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 263
    .line 264
    .line 265
    move-result-object v7

    .line 266
    invoke-static {v9, v3}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 267
    .line 268
    .line 269
    move-result-object v3

    .line 270
    sget-object v8, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 271
    .line 272
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 273
    .line 274
    .line 275
    move-result-object v10

    .line 276
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 277
    .line 278
    .line 279
    move-result-object v11

    .line 280
    if-nez v11, :cond_6

    .line 281
    .line 282
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 283
    .line 284
    .line 285
    :cond_6
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 286
    .line 287
    .line 288
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 289
    .line 290
    .line 291
    move-result v11

    .line 292
    if-eqz v11, :cond_7

    .line 293
    .line 294
    invoke-interface {v9, v10}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 295
    .line 296
    .line 297
    goto :goto_4

    .line 298
    :cond_7
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 299
    .line 300
    .line 301
    :goto_4
    invoke-static {v9}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 302
    .line 303
    .line 304
    move-result-object v10

    .line 305
    invoke-static {v8, v10, v5, v10, v7}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 306
    .line 307
    .line 308
    move-result-object v5

    .line 309
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 310
    .line 311
    .line 312
    move-result v7

    .line 313
    if-nez v7, :cond_8

    .line 314
    .line 315
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v7

    .line 319
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 320
    .line 321
    .line 322
    move-result-object v11

    .line 323
    invoke-static {v7, v11}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    move-result v7

    .line 327
    if-nez v7, :cond_9

    .line 328
    .line 329
    :cond_8
    invoke-static {v6, v10, v6, v5}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 330
    .line 331
    .line 332
    :cond_9
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 333
    .line 334
    .line 335
    move-result-object v5

    .line 336
    invoke-static {v10, v3, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 337
    .line 338
    .line 339
    sget-object v3, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 340
    .line 341
    invoke-virtual/range {v27 .. v27}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 342
    .line 343
    .line 344
    move-result-object v3

    .line 345
    invoke-virtual {v4}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 346
    .line 347
    .line 348
    move-result-object v4

    .line 349
    const/16 v5, 0x30

    .line 350
    .line 351
    invoke-static {v4, v3, v9, v5}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 352
    .line 353
    .line 354
    move-result-object v3

    .line 355
    invoke-static {v9, v13}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 356
    .line 357
    .line 358
    move-result v4

    .line 359
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 360
    .line 361
    .line 362
    move-result-object v5

    .line 363
    invoke-static {v9, v15}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 364
    .line 365
    .line 366
    move-result-object v6

    .line 367
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 368
    .line 369
    .line 370
    move-result-object v7

    .line 371
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 372
    .line 373
    .line 374
    move-result-object v10

    .line 375
    if-nez v10, :cond_a

    .line 376
    .line 377
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 378
    .line 379
    .line 380
    :cond_a
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 381
    .line 382
    .line 383
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 384
    .line 385
    .line 386
    move-result v10

    .line 387
    if-eqz v10, :cond_b

    .line 388
    .line 389
    invoke-interface {v9, v7}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 390
    .line 391
    .line 392
    goto :goto_5

    .line 393
    :cond_b
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 394
    .line 395
    .line 396
    :goto_5
    invoke-static {v9}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 397
    .line 398
    .line 399
    move-result-object v7

    .line 400
    invoke-static {v8, v7, v3, v7, v5}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 401
    .line 402
    .line 403
    move-result-object v3

    .line 404
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 405
    .line 406
    .line 407
    move-result v5

    .line 408
    if-nez v5, :cond_c

    .line 409
    .line 410
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v5

    .line 414
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 415
    .line 416
    .line 417
    move-result-object v10

    .line 418
    invoke-static {v5, v10}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 419
    .line 420
    .line 421
    move-result v5

    .line 422
    if-nez v5, :cond_d

    .line 423
    .line 424
    :cond_c
    invoke-static {v4, v7, v4, v3}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 425
    .line 426
    .line 427
    :cond_d
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 428
    .line 429
    .line 430
    move-result-object v3

    .line 431
    invoke-static {v7, v6, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 432
    .line 433
    .line 434
    sget-object v3, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 435
    .line 436
    iget v3, v0, Lcom/zykj/mistake/feature/review/v;->i:I

    .line 437
    .line 438
    invoke-static {v3, v9, v13}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 439
    .line 440
    .line 441
    move-result-object v3

    .line 442
    int-to-float v4, v14

    .line 443
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 444
    .line 445
    .line 446
    move-result v4

    .line 447
    invoke-static {v15, v4}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 448
    .line 449
    .line 450
    move-result-object v4

    .line 451
    const/16 v10, 0x1b0

    .line 452
    .line 453
    const/16 v11, 0x78

    .line 454
    .line 455
    move v5, v2

    .line 456
    move-object v2, v3

    .line 457
    const/4 v3, 0x0

    .line 458
    move v6, v5

    .line 459
    const/4 v5, 0x0

    .line 460
    move v7, v6

    .line 461
    const/4 v6, 0x0

    .line 462
    move v8, v7

    .line 463
    const/4 v7, 0x0

    .line 464
    move v13, v8

    .line 465
    const/4 v8, 0x0

    .line 466
    move/from16 v29, v13

    .line 467
    .line 468
    invoke-static/range {v2 .. v11}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 469
    .line 470
    .line 471
    move-object/from16 v23, v9

    .line 472
    .line 473
    const-wide v2, 0xff15171aL

    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 479
    .line 480
    .line 481
    move-result-wide v4

    .line 482
    invoke-static {v12}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 483
    .line 484
    .line 485
    move-result-wide v6

    .line 486
    sget-object v30, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    .line 487
    .line 488
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    .line 489
    .line 490
    .line 491
    move-result-object v9

    .line 492
    const/16 v2, 0xe

    .line 493
    .line 494
    int-to-float v2, v2

    .line 495
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 496
    .line 497
    .line 498
    move-result v16

    .line 499
    const/16 v20, 0xe

    .line 500
    .line 501
    const/16 v21, 0x0

    .line 502
    .line 503
    const/16 v17, 0x0

    .line 504
    .line 505
    const/16 v18, 0x0

    .line 506
    .line 507
    const/16 v19, 0x0

    .line 508
    .line 509
    invoke-static/range {v15 .. v21}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 510
    .line 511
    .line 512
    move-result-object v3

    .line 513
    move-object/from16 v31, v15

    .line 514
    .line 515
    const/16 v25, 0x0

    .line 516
    .line 517
    const v26, 0x1ffd0

    .line 518
    .line 519
    .line 520
    const/4 v10, 0x0

    .line 521
    const-wide/16 v11, 0x0

    .line 522
    .line 523
    const/4 v13, 0x0

    .line 524
    const/4 v14, 0x0

    .line 525
    const-wide/16 v15, 0x0

    .line 526
    .line 527
    const/16 v17, 0x0

    .line 528
    .line 529
    const/16 v18, 0x0

    .line 530
    .line 531
    const/16 v19, 0x0

    .line 532
    .line 533
    const/16 v20, 0x0

    .line 534
    .line 535
    const/16 v22, 0x0

    .line 536
    .line 537
    const v24, 0x30db0

    .line 538
    .line 539
    .line 540
    iget-object v2, v0, Lcom/zykj/mistake/feature/review/v;->j:Ljava/lang/String;

    .line 541
    .line 542
    invoke-static/range {v2 .. v26}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 543
    .line 544
    .line 545
    const-wide v2, 0xff999999L

    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 551
    .line 552
    .line 553
    move-result-wide v4

    .line 554
    const/16 v2, 0xc

    .line 555
    .line 556
    invoke-static {v2}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 557
    .line 558
    .line 559
    move-result-wide v6

    .line 560
    invoke-static/range {v28 .. v28}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 561
    .line 562
    .line 563
    move-result v16

    .line 564
    const/16 v20, 0xe

    .line 565
    .line 566
    const/16 v17, 0x0

    .line 567
    .line 568
    const/16 v18, 0x0

    .line 569
    .line 570
    const/16 v19, 0x0

    .line 571
    .line 572
    move-object/from16 v15, v31

    .line 573
    .line 574
    invoke-static/range {v15 .. v21}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 575
    .line 576
    .line 577
    move-result-object v3

    .line 578
    const v26, 0x1fff0

    .line 579
    .line 580
    .line 581
    const/4 v9, 0x0

    .line 582
    const-wide/16 v15, 0x0

    .line 583
    .line 584
    const/16 v17, 0x0

    .line 585
    .line 586
    const/16 v18, 0x0

    .line 587
    .line 588
    const/16 v19, 0x0

    .line 589
    .line 590
    const/16 v20, 0x0

    .line 591
    .line 592
    const/16 v24, 0xdb6

    .line 593
    .line 594
    const-string v2, "|"

    .line 595
    .line 596
    invoke-static/range {v2 .. v26}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 597
    .line 598
    .line 599
    const/16 v2, 0xc

    .line 600
    .line 601
    invoke-static {v2}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 602
    .line 603
    .line 604
    move-result-wide v6

    .line 605
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getSemiBold()Landroidx/compose/ui/text/font/FontWeight;

    .line 606
    .line 607
    .line 608
    move-result-object v9

    .line 609
    const/16 v2, 0x8

    .line 610
    .line 611
    int-to-float v2, v2

    .line 612
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 613
    .line 614
    .line 615
    move-result v16

    .line 616
    const/16 v20, 0xe

    .line 617
    .line 618
    const/16 v17, 0x0

    .line 619
    .line 620
    const/16 v18, 0x0

    .line 621
    .line 622
    const/16 v19, 0x0

    .line 623
    .line 624
    move-object/from16 v15, v31

    .line 625
    .line 626
    invoke-static/range {v15 .. v21}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 627
    .line 628
    .line 629
    move-result-object v3

    .line 630
    const v26, 0x1ffd0

    .line 631
    .line 632
    .line 633
    const-wide/16 v15, 0x0

    .line 634
    .line 635
    const/16 v17, 0x0

    .line 636
    .line 637
    const/16 v18, 0x0

    .line 638
    .line 639
    const/16 v19, 0x0

    .line 640
    .line 641
    const/16 v20, 0x0

    .line 642
    .line 643
    const v24, 0x30c30

    .line 644
    .line 645
    .line 646
    iget-object v2, v0, Lcom/zykj/mistake/feature/review/v;->k:Ljava/lang/String;

    .line 647
    .line 648
    iget-wide v4, v0, Lcom/zykj/mistake/feature/review/v;->l:J

    .line 649
    .line 650
    invoke-static/range {v2 .. v26}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 651
    .line 652
    .line 653
    invoke-interface/range {v23 .. v23}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 654
    .line 655
    .line 656
    const-wide v2, 0xff666666L

    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 662
    .line 663
    .line 664
    move-result-wide v4

    .line 665
    const/16 v2, 0xb

    .line 666
    .line 667
    invoke-static {v2}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 668
    .line 669
    .line 670
    move-result-wide v6

    .line 671
    const/16 v2, 0x10

    .line 672
    .line 673
    invoke-static {v2}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 674
    .line 675
    .line 676
    move-result-wide v2

    .line 677
    const/16 v8, 0x2e

    .line 678
    .line 679
    int-to-float v8, v8

    .line 680
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 681
    .line 682
    .line 683
    move-result v16

    .line 684
    const/4 v8, 0x3

    .line 685
    int-to-float v8, v8

    .line 686
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 687
    .line 688
    .line 689
    move-result v17

    .line 690
    const/16 v20, 0xc

    .line 691
    .line 692
    const/16 v18, 0x0

    .line 693
    .line 694
    const/16 v19, 0x0

    .line 695
    .line 696
    move-object/from16 v15, v31

    .line 697
    .line 698
    invoke-static/range {v15 .. v21}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 699
    .line 700
    .line 701
    move-result-object v8

    .line 702
    const v9, 0x3f733333    # 0.95f

    .line 703
    .line 704
    .line 705
    invoke-static {v8, v9}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 706
    .line 707
    .line 708
    move-result-object v8

    .line 709
    const/16 v25, 0x6

    .line 710
    .line 711
    const v26, 0x1fbf0

    .line 712
    .line 713
    .line 714
    move-wide v15, v2

    .line 715
    move-object v3, v8

    .line 716
    const/4 v8, 0x0

    .line 717
    const/4 v9, 0x0

    .line 718
    const/16 v17, 0x0

    .line 719
    .line 720
    const/16 v18, 0x0

    .line 721
    .line 722
    const/16 v19, 0x0

    .line 723
    .line 724
    const/16 v20, 0x0

    .line 725
    .line 726
    const/16 v24, 0xdb0

    .line 727
    .line 728
    iget-object v2, v0, Lcom/zykj/mistake/feature/review/v;->h:Ljava/lang/String;

    .line 729
    .line 730
    move-object/from16 v0, v31

    .line 731
    .line 732
    invoke-static/range {v2 .. v26}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 733
    .line 734
    .line 735
    invoke-interface/range {v23 .. v23}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 736
    .line 737
    .line 738
    invoke-virtual/range {v27 .. v27}, Landroidx/compose/ui/Alignment$Companion;->getBottomStart()Landroidx/compose/ui/Alignment;

    .line 739
    .line 740
    .line 741
    move-result-object v2

    .line 742
    invoke-interface {v1, v0, v2}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    .line 743
    .line 744
    .line 745
    move-result-object v3

    .line 746
    invoke-static/range {v29 .. v29}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 747
    .line 748
    .line 749
    move-result v4

    .line 750
    const/16 v0, 0x16

    .line 751
    .line 752
    int-to-float v0, v0

    .line 753
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 754
    .line 755
    .line 756
    move-result v7

    .line 757
    const/4 v8, 0x6

    .line 758
    const/4 v5, 0x0

    .line 759
    const/4 v6, 0x0

    .line 760
    invoke-static/range {v3 .. v9}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 761
    .line 762
    .line 763
    move-result-object v7

    .line 764
    const/4 v11, 0x0

    .line 765
    const/4 v12, 0x0

    .line 766
    move-object/from16 v0, p0

    .line 767
    .line 768
    iget-object v2, v0, Lcom/zykj/mistake/feature/review/v;->c:Ljava/lang/String;

    .line 769
    .line 770
    iget-wide v3, v0, Lcom/zykj/mistake/feature/review/v;->d:J

    .line 771
    .line 772
    iget-wide v5, v0, Lcom/zykj/mistake/feature/review/v;->e:J

    .line 773
    .line 774
    iget-object v8, v0, Lcom/zykj/mistake/feature/review/v;->f:Lr6/a;

    .line 775
    .line 776
    iget-boolean v9, v0, Lcom/zykj/mistake/feature/review/v;->g:Z

    .line 777
    .line 778
    move-object/from16 v10, v23

    .line 779
    .line 780
    invoke-static/range {v2 .. v12}, Lcom/zykj/mistake/feature/review/y;->d(Ljava/lang/String;JJLandroidx/compose/ui/Modifier;Lr6/a;ZLandroidx/compose/runtime/Composer;II)V

    .line 781
    .line 782
    .line 783
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 784
    .line 785
    .line 786
    move-result v1

    .line 787
    if-eqz v1, :cond_f

    .line 788
    .line 789
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 790
    .line 791
    .line 792
    goto :goto_6

    .line 793
    :cond_e
    move-object/from16 v23, v9

    .line 794
    .line 795
    invoke-interface/range {v23 .. v23}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 796
    .line 797
    .line 798
    :cond_f
    :goto_6
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 799
    .line 800
    return-object v1
.end method
