.class public final synthetic Lcom/zykj/mistake/feature/collection/filter/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;

.field public final synthetic e:Lr6/a;

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(IILcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;Lr6/a;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lcom/zykj/mistake/feature/collection/filter/t0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/zykj/mistake/feature/collection/filter/t0;->b:I

    iput p2, p0, Lcom/zykj/mistake/feature/collection/filter/t0;->c:I

    iput-object p3, p0, Lcom/zykj/mistake/feature/collection/filter/t0;->d:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;

    iput-object p4, p0, Lcom/zykj/mistake/feature/collection/filter/t0;->e:Lr6/a;

    iput p5, p0, Lcom/zykj/mistake/feature/collection/filter/t0;->f:I

    return-void
.end method

.method public synthetic constructor <init>(Lr6/a;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;III)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lcom/zykj/mistake/feature/collection/filter/t0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/filter/t0;->e:Lr6/a;

    iput-object p2, p0, Lcom/zykj/mistake/feature/collection/filter/t0;->d:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;

    iput p3, p0, Lcom/zykj/mistake/feature/collection/filter/t0;->b:I

    iput p4, p0, Lcom/zykj/mistake/feature/collection/filter/t0;->c:I

    iput p5, p0, Lcom/zykj/mistake/feature/collection/filter/t0;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 63

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lcom/zykj/mistake/feature/collection/filter/t0;->a:I

    .line 4
    .line 5
    sget-object v2, Ld6/s;->a:Ld6/s;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    iget v4, v1, Lcom/zykj/mistake/feature/collection/filter/t0;->f:I

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object/from16 v9, p1

    .line 14
    .line 15
    check-cast v9, Landroidx/compose/runtime/Composer;

    .line 16
    .line 17
    move-object/from16 v0, p2

    .line 18
    .line 19
    check-cast v0, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    or-int/lit8 v0, v4, 0x1

    .line 25
    .line 26
    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 27
    .line 28
    .line 29
    move-result v10

    .line 30
    iget v5, v1, Lcom/zykj/mistake/feature/collection/filter/t0;->b:I

    .line 31
    .line 32
    iget v6, v1, Lcom/zykj/mistake/feature/collection/filter/t0;->c:I

    .line 33
    .line 34
    iget-object v7, v1, Lcom/zykj/mistake/feature/collection/filter/t0;->d:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;

    .line 35
    .line 36
    iget-object v8, v1, Lcom/zykj/mistake/feature/collection/filter/t0;->e:Lr6/a;

    .line 37
    .line 38
    invoke-static/range {v5 .. v10}, Lcom/zykj/mistake/feature/collection/filter/y0;->d(IILcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 39
    .line 40
    .line 41
    return-object v2

    .line 42
    :pswitch_0
    iget v0, v1, Lcom/zykj/mistake/feature/collection/filter/t0;->c:I

    .line 43
    .line 44
    move-object/from16 v5, p1

    .line 45
    .line 46
    check-cast v5, Landroidx/compose/runtime/Composer;

    .line 47
    .line 48
    move-object/from16 v6, p2

    .line 49
    .line 50
    check-cast v6, Ljava/lang/Integer;

    .line 51
    .line 52
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    and-int/lit8 v7, v6, 0x3

    .line 57
    .line 58
    const/4 v8, 0x0

    .line 59
    const/4 v9, 0x2

    .line 60
    if-eq v7, v9, :cond_0

    .line 61
    .line 62
    move v7, v3

    .line 63
    goto :goto_0

    .line 64
    :cond_0
    move v7, v8

    .line 65
    :goto_0
    and-int/lit8 v10, v6, 0x1

    .line 66
    .line 67
    invoke-interface {v5, v7, v10}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    if-eqz v7, :cond_c

    .line 72
    .line 73
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    if-eqz v7, :cond_1

    .line 78
    .line 79
    const/4 v7, -0x1

    .line 80
    const-string v10, "com.zykj.mistake.feature.collection.filter.FilterResultOverLimitDialog.<anonymous> (MistakeCollectionFilterResultScreen.kt:427)"

    .line 81
    .line 82
    const v11, 0x4a24b59c    # 2698599.0f

    .line 83
    .line 84
    .line 85
    invoke-static {v11, v6, v7, v10}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 86
    .line 87
    .line 88
    :cond_1
    sget-object v6, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 89
    .line 90
    const/16 v7, 0x1ae

    .line 91
    .line 92
    int-to-float v7, v7

    .line 93
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 94
    .line 95
    .line 96
    move-result v7

    .line 97
    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    sget-object v31, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 102
    .line 103
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 104
    .line 105
    .line 106
    move-result-wide v10

    .line 107
    const/4 v12, 0x4

    .line 108
    int-to-float v12, v12

    .line 109
    invoke-static {v12, v7, v10, v11}, Landroidx/compose/material3/c;->f(FLandroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    const/16 v10, 0x2c

    .line 114
    .line 115
    int-to-float v10, v10

    .line 116
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 117
    .line 118
    .line 119
    move-result v10

    .line 120
    const/16 v11, 0x1e

    .line 121
    .line 122
    int-to-float v11, v11

    .line 123
    invoke-static {v11}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 124
    .line 125
    .line 126
    move-result v11

    .line 127
    invoke-static {v7, v10, v11}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    sget-object v32, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 132
    .line 133
    invoke-virtual/range {v32 .. v32}, Landroidx/compose/ui/Alignment$Companion;->getCenterHorizontally()Landroidx/compose/ui/Alignment$Horizontal;

    .line 134
    .line 135
    .line 136
    move-result-object v10

    .line 137
    sget-object v11, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 138
    .line 139
    invoke-virtual {v11}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 140
    .line 141
    .line 142
    move-result-object v11

    .line 143
    const/16 v13, 0x30

    .line 144
    .line 145
    invoke-static {v11, v10, v5, v13}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 146
    .line 147
    .line 148
    move-result-object v10

    .line 149
    invoke-static {v5, v8}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 150
    .line 151
    .line 152
    move-result v11

    .line 153
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 154
    .line 155
    .line 156
    move-result-object v13

    .line 157
    invoke-static {v5, v7}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 158
    .line 159
    .line 160
    move-result-object v7

    .line 161
    sget-object v14, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 162
    .line 163
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 164
    .line 165
    .line 166
    move-result-object v15

    .line 167
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 168
    .line 169
    .line 170
    move-result-object v16

    .line 171
    if-nez v16, :cond_2

    .line 172
    .line 173
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 174
    .line 175
    .line 176
    :cond_2
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 177
    .line 178
    .line 179
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 180
    .line 181
    .line 182
    move-result v16

    .line 183
    if-eqz v16, :cond_3

    .line 184
    .line 185
    invoke-interface {v5, v15}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 186
    .line 187
    .line 188
    goto :goto_1

    .line 189
    :cond_3
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 190
    .line 191
    .line 192
    :goto_1
    invoke-static {v5}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 193
    .line 194
    .line 195
    move-result-object v15

    .line 196
    invoke-static {v14, v15, v10, v15, v13}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 197
    .line 198
    .line 199
    move-result-object v10

    .line 200
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 201
    .line 202
    .line 203
    move-result v13

    .line 204
    if-nez v13, :cond_4

    .line 205
    .line 206
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v13

    .line 210
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 211
    .line 212
    .line 213
    move-result-object v8

    .line 214
    invoke-static {v13, v8}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v8

    .line 218
    if-nez v8, :cond_5

    .line 219
    .line 220
    :cond_4
    invoke-static {v11, v15, v11, v10}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 221
    .line 222
    .line 223
    :cond_5
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 224
    .line 225
    .line 226
    move-result-object v8

    .line 227
    invoke-static {v15, v7, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 228
    .line 229
    .line 230
    sget-object v7, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 231
    .line 232
    const-wide v33, 0xff15171aL

    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    invoke-static/range {v33 .. v34}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 238
    .line 239
    .line 240
    move-result-wide v7

    .line 241
    const/16 v10, 0x12

    .line 242
    .line 243
    invoke-static {v10}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 244
    .line 245
    .line 246
    move-result-wide v10

    .line 247
    sget-object v30, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    .line 248
    .line 249
    move v13, v12

    .line 250
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    .line 251
    .line 252
    .line 253
    move-result-object v12

    .line 254
    const/16 v28, 0x0

    .line 255
    .line 256
    const v29, 0x1ffd2

    .line 257
    .line 258
    .line 259
    move-object/from16 v26, v5

    .line 260
    .line 261
    const-string v5, "\u8d85\u51fa\u63d0\u793a"

    .line 262
    .line 263
    move-object v15, v6

    .line 264
    const/4 v6, 0x0

    .line 265
    move/from16 v16, v9

    .line 266
    .line 267
    move-wide v9, v10

    .line 268
    const/4 v11, 0x0

    .line 269
    move/from16 v17, v13

    .line 270
    .line 271
    const/4 v13, 0x0

    .line 272
    move-object/from16 v19, v14

    .line 273
    .line 274
    move-object/from16 v18, v15

    .line 275
    .line 276
    const-wide/16 v14, 0x0

    .line 277
    .line 278
    move/from16 v20, v16

    .line 279
    .line 280
    const/16 v16, 0x0

    .line 281
    .line 282
    move/from16 v21, v17

    .line 283
    .line 284
    const/16 v17, 0x0

    .line 285
    .line 286
    move-object/from16 v22, v18

    .line 287
    .line 288
    move-object/from16 v23, v19

    .line 289
    .line 290
    const-wide/16 v18, 0x0

    .line 291
    .line 292
    move/from16 v24, v20

    .line 293
    .line 294
    const/16 v20, 0x0

    .line 295
    .line 296
    move/from16 v25, v21

    .line 297
    .line 298
    const/16 v21, 0x0

    .line 299
    .line 300
    move-object/from16 v27, v22

    .line 301
    .line 302
    const/16 v22, 0x0

    .line 303
    .line 304
    move-object/from16 v35, v23

    .line 305
    .line 306
    const/16 v23, 0x0

    .line 307
    .line 308
    move/from16 v36, v24

    .line 309
    .line 310
    const/16 v24, 0x0

    .line 311
    .line 312
    move/from16 v37, v25

    .line 313
    .line 314
    const/16 v25, 0x0

    .line 315
    .line 316
    move-object/from16 v38, v27

    .line 317
    .line 318
    const v27, 0x30d86

    .line 319
    .line 320
    .line 321
    move/from16 v36, v0

    .line 322
    .line 323
    move/from16 v39, v37

    .line 324
    .line 325
    const/4 v0, 0x0

    .line 326
    invoke-static/range {v5 .. v29}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 327
    .line 328
    .line 329
    new-instance v5, Landroidx/compose/ui/text/AnnotatedString$Builder;

    .line 330
    .line 331
    invoke-direct {v5, v0, v3, v6}, Landroidx/compose/ui/text/AnnotatedString$Builder;-><init>(IILkotlin/jvm/internal/e;)V

    .line 332
    .line 333
    .line 334
    sget-object v7, Lcom/zykj/mistake/feature/collection/filter/x0;->a:[I

    .line 335
    .line 336
    iget-object v8, v1, Lcom/zykj/mistake/feature/collection/filter/t0;->d:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;

    .line 337
    .line 338
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 339
    .line 340
    .line 341
    move-result v8

    .line 342
    aget v7, v7, v8

    .line 343
    .line 344
    iget v8, v1, Lcom/zykj/mistake/feature/collection/filter/t0;->b:I

    .line 345
    .line 346
    const-wide v9, 0xffff3b30L

    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    if-eq v7, v3, :cond_7

    .line 352
    .line 353
    const/4 v11, 0x2

    .line 354
    if-ne v7, v11, :cond_6

    .line 355
    .line 356
    const-string v7, "\u5355\u9519\u9898\u96c6\u6700\u591a\u5305\u542b "

    .line 357
    .line 358
    invoke-virtual {v5, v7}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    new-instance v40, Landroidx/compose/ui/text/SpanStyle;

    .line 362
    .line 363
    invoke-static {v9, v10}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 364
    .line 365
    .line 366
    move-result-wide v41

    .line 367
    const v61, 0xfffe

    .line 368
    .line 369
    .line 370
    const/16 v62, 0x0

    .line 371
    .line 372
    const-wide/16 v43, 0x0

    .line 373
    .line 374
    const/16 v45, 0x0

    .line 375
    .line 376
    const/16 v46, 0x0

    .line 377
    .line 378
    const/16 v47, 0x0

    .line 379
    .line 380
    const/16 v48, 0x0

    .line 381
    .line 382
    const/16 v49, 0x0

    .line 383
    .line 384
    const-wide/16 v50, 0x0

    .line 385
    .line 386
    const/16 v52, 0x0

    .line 387
    .line 388
    const/16 v53, 0x0

    .line 389
    .line 390
    const/16 v54, 0x0

    .line 391
    .line 392
    const-wide/16 v55, 0x0

    .line 393
    .line 394
    const/16 v57, 0x0

    .line 395
    .line 396
    const/16 v58, 0x0

    .line 397
    .line 398
    const/16 v59, 0x0

    .line 399
    .line 400
    const/16 v60, 0x0

    .line 401
    .line 402
    invoke-direct/range {v40 .. v62}, Landroidx/compose/ui/text/SpanStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;ILkotlin/jvm/internal/e;)V

    .line 403
    .line 404
    .line 405
    move-object/from16 v7, v40

    .line 406
    .line 407
    invoke-virtual {v5, v7}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pushStyle(Landroidx/compose/ui/text/SpanStyle;)I

    .line 408
    .line 409
    .line 410
    move-result v7

    .line 411
    :try_start_0
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v8

    .line 415
    invoke-virtual {v5, v8}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 416
    .line 417
    .line 418
    invoke-virtual {v5, v7}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pop(I)V

    .line 419
    .line 420
    .line 421
    const-string v7, " \u9053\u9519\u9898\uff0c\u76ee\u524d\u5df2\u6709 "

    .line 422
    .line 423
    invoke-virtual {v5, v7}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    new-instance v40, Landroidx/compose/ui/text/SpanStyle;

    .line 427
    .line 428
    invoke-static/range {v33 .. v34}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 429
    .line 430
    .line 431
    move-result-wide v41

    .line 432
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    .line 433
    .line 434
    .line 435
    move-result-object v45

    .line 436
    const v61, 0xfffa

    .line 437
    .line 438
    .line 439
    const/16 v62, 0x0

    .line 440
    .line 441
    const-wide/16 v43, 0x0

    .line 442
    .line 443
    const/16 v46, 0x0

    .line 444
    .line 445
    const/16 v47, 0x0

    .line 446
    .line 447
    const/16 v48, 0x0

    .line 448
    .line 449
    const/16 v49, 0x0

    .line 450
    .line 451
    const-wide/16 v50, 0x0

    .line 452
    .line 453
    const/16 v52, 0x0

    .line 454
    .line 455
    const/16 v53, 0x0

    .line 456
    .line 457
    const/16 v54, 0x0

    .line 458
    .line 459
    const-wide/16 v55, 0x0

    .line 460
    .line 461
    const/16 v57, 0x0

    .line 462
    .line 463
    const/16 v58, 0x0

    .line 464
    .line 465
    const/16 v59, 0x0

    .line 466
    .line 467
    const/16 v60, 0x0

    .line 468
    .line 469
    invoke-direct/range {v40 .. v62}, Landroidx/compose/ui/text/SpanStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;ILkotlin/jvm/internal/e;)V

    .line 470
    .line 471
    .line 472
    move-object/from16 v7, v40

    .line 473
    .line 474
    invoke-virtual {v5, v7}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pushStyle(Landroidx/compose/ui/text/SpanStyle;)I

    .line 475
    .line 476
    .line 477
    move-result v7

    .line 478
    :try_start_1
    invoke-static/range {v36 .. v36}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object v8

    .line 482
    invoke-virtual {v5, v8}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 483
    .line 484
    .line 485
    invoke-virtual {v5, v7}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pop(I)V

    .line 486
    .line 487
    .line 488
    const-string v7, " \u9053\u9519\u9898\uff0c\u6700\u591a\u8fd8\u53ef\u6dfb\u52a0 "

    .line 489
    .line 490
    invoke-virtual {v5, v7}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V

    .line 491
    .line 492
    .line 493
    new-instance v40, Landroidx/compose/ui/text/SpanStyle;

    .line 494
    .line 495
    invoke-static/range {v33 .. v34}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 496
    .line 497
    .line 498
    move-result-wide v41

    .line 499
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    .line 500
    .line 501
    .line 502
    move-result-object v45

    .line 503
    const v61, 0xfffa

    .line 504
    .line 505
    .line 506
    const/16 v62, 0x0

    .line 507
    .line 508
    const-wide/16 v43, 0x0

    .line 509
    .line 510
    const/16 v46, 0x0

    .line 511
    .line 512
    const/16 v47, 0x0

    .line 513
    .line 514
    const/16 v48, 0x0

    .line 515
    .line 516
    const/16 v49, 0x0

    .line 517
    .line 518
    const-wide/16 v50, 0x0

    .line 519
    .line 520
    const/16 v52, 0x0

    .line 521
    .line 522
    const/16 v53, 0x0

    .line 523
    .line 524
    const/16 v54, 0x0

    .line 525
    .line 526
    const-wide/16 v55, 0x0

    .line 527
    .line 528
    const/16 v57, 0x0

    .line 529
    .line 530
    const/16 v58, 0x0

    .line 531
    .line 532
    const/16 v59, 0x0

    .line 533
    .line 534
    const/16 v60, 0x0

    .line 535
    .line 536
    invoke-direct/range {v40 .. v62}, Landroidx/compose/ui/text/SpanStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;ILkotlin/jvm/internal/e;)V

    .line 537
    .line 538
    .line 539
    move-object/from16 v7, v40

    .line 540
    .line 541
    invoke-virtual {v5, v7}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pushStyle(Landroidx/compose/ui/text/SpanStyle;)I

    .line 542
    .line 543
    .line 544
    move-result v7

    .line 545
    :try_start_2
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 546
    .line 547
    .line 548
    move-result-object v4

    .line 549
    invoke-virtual {v5, v4}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 550
    .line 551
    .line 552
    invoke-virtual {v5, v7}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pop(I)V

    .line 553
    .line 554
    .line 555
    const-string v4, " \u9053\u9519\u9898"

    .line 556
    .line 557
    invoke-virtual {v5, v4}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V

    .line 558
    .line 559
    .line 560
    goto :goto_2

    .line 561
    :catchall_0
    move-exception v0

    .line 562
    invoke-virtual {v5, v7}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pop(I)V

    .line 563
    .line 564
    .line 565
    throw v0

    .line 566
    :catchall_1
    move-exception v0

    .line 567
    invoke-virtual {v5, v7}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pop(I)V

    .line 568
    .line 569
    .line 570
    throw v0

    .line 571
    :catchall_2
    move-exception v0

    .line 572
    invoke-virtual {v5, v7}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pop(I)V

    .line 573
    .line 574
    .line 575
    throw v0

    .line 576
    :cond_6
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 577
    .line 578
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 579
    .line 580
    .line 581
    throw v0

    .line 582
    :cond_7
    const-string v4, "\u5355\u9519\u9898\u96c6\u6700\u591a\u6dfb\u52a0 "

    .line 583
    .line 584
    invoke-virtual {v5, v4}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V

    .line 585
    .line 586
    .line 587
    new-instance v40, Landroidx/compose/ui/text/SpanStyle;

    .line 588
    .line 589
    invoke-static {v9, v10}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 590
    .line 591
    .line 592
    move-result-wide v41

    .line 593
    const v61, 0xfffe

    .line 594
    .line 595
    .line 596
    const/16 v62, 0x0

    .line 597
    .line 598
    const-wide/16 v43, 0x0

    .line 599
    .line 600
    const/16 v45, 0x0

    .line 601
    .line 602
    const/16 v46, 0x0

    .line 603
    .line 604
    const/16 v47, 0x0

    .line 605
    .line 606
    const/16 v48, 0x0

    .line 607
    .line 608
    const/16 v49, 0x0

    .line 609
    .line 610
    const-wide/16 v50, 0x0

    .line 611
    .line 612
    const/16 v52, 0x0

    .line 613
    .line 614
    const/16 v53, 0x0

    .line 615
    .line 616
    const/16 v54, 0x0

    .line 617
    .line 618
    const-wide/16 v55, 0x0

    .line 619
    .line 620
    const/16 v57, 0x0

    .line 621
    .line 622
    const/16 v58, 0x0

    .line 623
    .line 624
    const/16 v59, 0x0

    .line 625
    .line 626
    const/16 v60, 0x0

    .line 627
    .line 628
    invoke-direct/range {v40 .. v62}, Landroidx/compose/ui/text/SpanStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;ILkotlin/jvm/internal/e;)V

    .line 629
    .line 630
    .line 631
    move-object/from16 v4, v40

    .line 632
    .line 633
    invoke-virtual {v5, v4}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pushStyle(Landroidx/compose/ui/text/SpanStyle;)I

    .line 634
    .line 635
    .line 636
    move-result v4

    .line 637
    :try_start_3
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    move-result-object v7

    .line 641
    invoke-virtual {v5, v7}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 642
    .line 643
    .line 644
    invoke-virtual {v5, v4}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pop(I)V

    .line 645
    .line 646
    .line 647
    const-string v4, " \u9053\u9519\u9898\uff0c\u53ef\u7f29\u5c0f\u7b5b\u9009\u8303\u56f4\u6216\u5206\u6279\u521b\u5efa"

    .line 648
    .line 649
    invoke-virtual {v5, v4}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V

    .line 650
    .line 651
    .line 652
    :goto_2
    invoke-virtual {v5}, Landroidx/compose/ui/text/AnnotatedString$Builder;->toAnnotatedString()Landroidx/compose/ui/text/AnnotatedString;

    .line 653
    .line 654
    .line 655
    move-result-object v5

    .line 656
    const-wide v7, 0xff666666L

    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    invoke-static {v7, v8}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 662
    .line 663
    .line 664
    move-result-wide v7

    .line 665
    const/16 v4, 0xe

    .line 666
    .line 667
    invoke-static {v4}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 668
    .line 669
    .line 670
    move-result-wide v9

    .line 671
    const/16 v4, 0x18

    .line 672
    .line 673
    int-to-float v4, v4

    .line 674
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 675
    .line 676
    .line 677
    move-result v14

    .line 678
    const/16 v17, 0xd

    .line 679
    .line 680
    const/16 v18, 0x0

    .line 681
    .line 682
    const/4 v13, 0x0

    .line 683
    const/4 v15, 0x0

    .line 684
    const/16 v16, 0x0

    .line 685
    .line 686
    move-object/from16 v12, v38

    .line 687
    .line 688
    invoke-static/range {v12 .. v18}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 689
    .line 690
    .line 691
    move-result-object v4

    .line 692
    sget-object v11, Landroidx/compose/ui/text/style/TextAlign;->Companion:Landroidx/compose/ui/text/style/TextAlign$Companion;

    .line 693
    .line 694
    invoke-virtual {v11}, Landroidx/compose/ui/text/style/TextAlign$Companion;->getCenter-e0LSkKk()I

    .line 695
    .line 696
    .line 697
    move-result v11

    .line 698
    const/16 v12, 0x14

    .line 699
    .line 700
    invoke-static {v12}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 701
    .line 702
    .line 703
    move-result-wide v18

    .line 704
    invoke-static {v11}, Landroidx/compose/ui/text/style/TextAlign;->box-impl(I)Landroidx/compose/ui/text/style/TextAlign;

    .line 705
    .line 706
    .line 707
    move-result-object v17

    .line 708
    const/16 v29, 0x6

    .line 709
    .line 710
    const v30, 0x3f9f0

    .line 711
    .line 712
    .line 713
    const/4 v11, 0x0

    .line 714
    const/4 v12, 0x0

    .line 715
    const/4 v13, 0x0

    .line 716
    const-wide/16 v14, 0x0

    .line 717
    .line 718
    const/16 v16, 0x0

    .line 719
    .line 720
    const/16 v20, 0x0

    .line 721
    .line 722
    const/16 v21, 0x0

    .line 723
    .line 724
    const/16 v22, 0x0

    .line 725
    .line 726
    const/16 v23, 0x0

    .line 727
    .line 728
    const/16 v24, 0x0

    .line 729
    .line 730
    const/16 v25, 0x0

    .line 731
    .line 732
    move-object/from16 v27, v26

    .line 733
    .line 734
    const/16 v26, 0x0

    .line 735
    .line 736
    const/16 v28, 0xdb0

    .line 737
    .line 738
    move-object v0, v6

    .line 739
    move-object v6, v4

    .line 740
    move-object/from16 v4, v38

    .line 741
    .line 742
    invoke-static/range {v5 .. v30}, Landroidx/compose/material3/TextKt;->Text-IbK3jfQ(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILjava/util/Map;Lr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 743
    .line 744
    .line 745
    move-object/from16 v5, v27

    .line 746
    .line 747
    const/16 v6, 0x1c

    .line 748
    .line 749
    int-to-float v6, v6

    .line 750
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 751
    .line 752
    .line 753
    move-result v6

    .line 754
    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 755
    .line 756
    .line 757
    move-result-object v6

    .line 758
    const/4 v7, 0x6

    .line 759
    invoke-static {v6, v5, v7}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 760
    .line 761
    .line 762
    const/4 v6, 0x0

    .line 763
    invoke-static {v4, v6, v3, v0}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 764
    .line 765
    .line 766
    move-result-object v0

    .line 767
    const/16 v3, 0x2e

    .line 768
    .line 769
    int-to-float v3, v3

    .line 770
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 771
    .line 772
    .line 773
    move-result v3

    .line 774
    invoke-static {v0, v3}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 775
    .line 776
    .line 777
    move-result-object v0

    .line 778
    const-wide v3, 0xff1576ffL

    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    invoke-static {v3, v4}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 784
    .line 785
    .line 786
    move-result-wide v3

    .line 787
    move/from16 v13, v39

    .line 788
    .line 789
    invoke-static {v13, v0, v3, v4}, Landroidx/compose/material3/c;->f(FLandroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    .line 790
    .line 791
    .line 792
    move-result-object v6

    .line 793
    const/4 v11, 0x7

    .line 794
    const/4 v7, 0x0

    .line 795
    const/4 v8, 0x0

    .line 796
    const/4 v9, 0x0

    .line 797
    iget-object v10, v1, Lcom/zykj/mistake/feature/collection/filter/t0;->e:Lr6/a;

    .line 798
    .line 799
    invoke-static/range {v6 .. v12}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 800
    .line 801
    .line 802
    move-result-object v0

    .line 803
    invoke-virtual/range {v32 .. v32}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 804
    .line 805
    .line 806
    move-result-object v3

    .line 807
    const/4 v4, 0x0

    .line 808
    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 809
    .line 810
    .line 811
    move-result-object v3

    .line 812
    invoke-static {v5, v4}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 813
    .line 814
    .line 815
    move-result v4

    .line 816
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 817
    .line 818
    .line 819
    move-result-object v6

    .line 820
    invoke-static {v5, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 821
    .line 822
    .line 823
    move-result-object v0

    .line 824
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 825
    .line 826
    .line 827
    move-result-object v7

    .line 828
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 829
    .line 830
    .line 831
    move-result-object v8

    .line 832
    if-nez v8, :cond_8

    .line 833
    .line 834
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 835
    .line 836
    .line 837
    :cond_8
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 838
    .line 839
    .line 840
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 841
    .line 842
    .line 843
    move-result v8

    .line 844
    if-eqz v8, :cond_9

    .line 845
    .line 846
    invoke-interface {v5, v7}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 847
    .line 848
    .line 849
    goto :goto_3

    .line 850
    :cond_9
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 851
    .line 852
    .line 853
    :goto_3
    invoke-static {v5}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 854
    .line 855
    .line 856
    move-result-object v7

    .line 857
    move-object/from16 v8, v35

    .line 858
    .line 859
    invoke-static {v8, v7, v3, v7, v6}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 860
    .line 861
    .line 862
    move-result-object v3

    .line 863
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 864
    .line 865
    .line 866
    move-result v6

    .line 867
    if-nez v6, :cond_a

    .line 868
    .line 869
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 870
    .line 871
    .line 872
    move-result-object v6

    .line 873
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 874
    .line 875
    .line 876
    move-result-object v9

    .line 877
    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 878
    .line 879
    .line 880
    move-result v6

    .line 881
    if-nez v6, :cond_b

    .line 882
    .line 883
    :cond_a
    invoke-static {v4, v7, v4, v3}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 884
    .line 885
    .line 886
    :cond_b
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 887
    .line 888
    .line 889
    move-result-object v3

    .line 890
    invoke-static {v7, v0, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 891
    .line 892
    .line 893
    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 894
    .line 895
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 896
    .line 897
    .line 898
    move-result-wide v7

    .line 899
    const/16 v0, 0x10

    .line 900
    .line 901
    invoke-static {v0}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 902
    .line 903
    .line 904
    move-result-wide v9

    .line 905
    const/16 v28, 0x0

    .line 906
    .line 907
    const v29, 0x1fff2

    .line 908
    .line 909
    .line 910
    move-object/from16 v26, v5

    .line 911
    .line 912
    const-string v5, "\u786e\u8ba4"

    .line 913
    .line 914
    const/4 v6, 0x0

    .line 915
    const/4 v11, 0x0

    .line 916
    const/4 v12, 0x0

    .line 917
    const/4 v13, 0x0

    .line 918
    const-wide/16 v14, 0x0

    .line 919
    .line 920
    const/16 v16, 0x0

    .line 921
    .line 922
    const/16 v17, 0x0

    .line 923
    .line 924
    const-wide/16 v18, 0x0

    .line 925
    .line 926
    const/16 v20, 0x0

    .line 927
    .line 928
    const/16 v21, 0x0

    .line 929
    .line 930
    const/16 v22, 0x0

    .line 931
    .line 932
    const/16 v23, 0x0

    .line 933
    .line 934
    const/16 v24, 0x0

    .line 935
    .line 936
    const/16 v25, 0x0

    .line 937
    .line 938
    const/16 v27, 0xd86

    .line 939
    .line 940
    invoke-static/range {v5 .. v29}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 941
    .line 942
    .line 943
    invoke-static/range {v26 .. v26}, Landroidx/collection/a;->D(Landroidx/compose/runtime/Composer;)Z

    .line 944
    .line 945
    .line 946
    move-result v0

    .line 947
    if-eqz v0, :cond_d

    .line 948
    .line 949
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 950
    .line 951
    .line 952
    goto :goto_4

    .line 953
    :catchall_3
    move-exception v0

    .line 954
    invoke-virtual {v5, v4}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pop(I)V

    .line 955
    .line 956
    .line 957
    throw v0

    .line 958
    :cond_c
    move-object/from16 v26, v5

    .line 959
    .line 960
    invoke-interface/range {v26 .. v26}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 961
    .line 962
    .line 963
    :cond_d
    :goto_4
    return-object v2

    .line 964
    nop

    .line 965
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
