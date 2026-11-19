.class public final synthetic Lcom/zykj/mistake/feature/review/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/f;


# instance fields
.field public final synthetic a:Lcom/zykj/mistake/feature/review/i;

.field public final synthetic b:F

.field public final synthetic c:F

.field public final synthetic d:Lr6/c;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/feature/review/i;FFLr6/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/feature/review/t;->a:Lcom/zykj/mistake/feature/review/i;

    iput p2, p0, Lcom/zykj/mistake/feature/review/t;->b:F

    iput p3, p0, Lcom/zykj/mistake/feature/review/t;->c:F

    iput-object p4, p0, Lcom/zykj/mistake/feature/review/t;->d:Lr6/c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 68

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lcom/zykj/mistake/feature/review/t;->a:Lcom/zykj/mistake/feature/review/i;

    .line 4
    .line 5
    iget-object v2, v0, Lcom/zykj/mistake/feature/review/i;->a:Ljava/lang/String;

    .line 6
    .line 7
    move-object/from16 v3, p1

    .line 8
    .line 9
    check-cast v3, Landroidx/compose/foundation/layout/BoxScope;

    .line 10
    .line 11
    move-object/from16 v8, p2

    .line 12
    .line 13
    check-cast v8, Landroidx/compose/runtime/Composer;

    .line 14
    .line 15
    move-object/from16 v4, p3

    .line 16
    .line 17
    check-cast v4, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    const-string v5, "$this$PullToRefreshBox"

    .line 24
    .line 25
    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    and-int/lit8 v3, v4, 0x11

    .line 29
    .line 30
    const/16 v5, 0x10

    .line 31
    .line 32
    const/4 v6, 0x1

    .line 33
    const/4 v7, 0x0

    .line 34
    if-eq v3, v5, :cond_0

    .line 35
    .line 36
    move v3, v6

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move v3, v7

    .line 39
    :goto_0
    and-int/lit8 v5, v4, 0x1

    .line 40
    .line 41
    invoke-interface {v8, v3, v5}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_1f

    .line 46
    .line 47
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    const/4 v5, -0x1

    .line 52
    if-eqz v3, :cond_1

    .line 53
    .line 54
    const v3, -0x4e0a2941

    .line 55
    .line 56
    .line 57
    const-string v9, "com.zykj.mistake.feature.review.ReviewScreen.<anonymous> (ReviewScreen.kt:104)"

    .line 58
    .line 59
    invoke-static {v3, v4, v5, v9}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 60
    .line 61
    .line 62
    :cond_1
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 63
    .line 64
    const/4 v4, 0x0

    .line 65
    const/4 v9, 0x0

    .line 66
    invoke-static {v3, v4, v6, v9}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 67
    .line 68
    .line 69
    move-result-object v10

    .line 70
    invoke-static {v7, v8, v7, v6}, Landroidx/compose/foundation/ScrollKt;->rememberScrollState(ILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/ScrollState;

    .line 71
    .line 72
    .line 73
    move-result-object v11

    .line 74
    const/16 v15, 0xe

    .line 75
    .line 76
    const/16 v16, 0x0

    .line 77
    .line 78
    const/4 v12, 0x0

    .line 79
    const/4 v13, 0x0

    .line 80
    const/4 v14, 0x0

    .line 81
    invoke-static/range {v10 .. v16}, Landroidx/compose/foundation/ScrollKt;->verticalScroll$default(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    const/16 v10, 0x20

    .line 86
    .line 87
    int-to-float v10, v10

    .line 88
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 89
    .line 90
    .line 91
    move-result v11

    .line 92
    const/16 v12, 0x1a

    .line 93
    .line 94
    int-to-float v12, v12

    .line 95
    invoke-static {v12}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 96
    .line 97
    .line 98
    move-result v12

    .line 99
    invoke-static {v3, v11, v12}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    sget-object v11, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 104
    .line 105
    invoke-virtual {v11}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 106
    .line 107
    .line 108
    move-result-object v11

    .line 109
    sget-object v12, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 110
    .line 111
    invoke-virtual {v12}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 112
    .line 113
    .line 114
    move-result-object v12

    .line 115
    invoke-static {v11, v12, v8, v7}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 116
    .line 117
    .line 118
    move-result-object v11

    .line 119
    invoke-static {v8, v7}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 120
    .line 121
    .line 122
    move-result v12

    .line 123
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 124
    .line 125
    .line 126
    move-result-object v13

    .line 127
    invoke-static {v8, v3}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    sget-object v14, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 132
    .line 133
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 134
    .line 135
    .line 136
    move-result-object v15

    .line 137
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 138
    .line 139
    .line 140
    move-result-object v16

    .line 141
    if-nez v16, :cond_2

    .line 142
    .line 143
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 144
    .line 145
    .line 146
    :cond_2
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 147
    .line 148
    .line 149
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 150
    .line 151
    .line 152
    move-result v16

    .line 153
    if-eqz v16, :cond_3

    .line 154
    .line 155
    invoke-interface {v8, v15}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 156
    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_3
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 160
    .line 161
    .line 162
    :goto_1
    invoke-static {v8}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 163
    .line 164
    .line 165
    move-result-object v15

    .line 166
    invoke-static {v14, v15, v11, v15, v13}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 167
    .line 168
    .line 169
    move-result-object v11

    .line 170
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 171
    .line 172
    .line 173
    move-result v13

    .line 174
    if-nez v13, :cond_4

    .line 175
    .line 176
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v13

    .line 180
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    invoke-static {v13, v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v4

    .line 188
    if-nez v4, :cond_5

    .line 189
    .line 190
    :cond_4
    invoke-static {v12, v15, v12, v11}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 191
    .line 192
    .line 193
    :cond_5
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    invoke-static {v15, v3, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 198
    .line 199
    .line 200
    sget-object v3, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 201
    .line 202
    iget v3, v0, Lcom/zykj/mistake/feature/review/i;->m:I

    .line 203
    .line 204
    iget v4, v0, Lcom/zykj/mistake/feature/review/i;->j:I

    .line 205
    .line 206
    iget v11, v0, Lcom/zykj/mistake/feature/review/i;->g:I

    .line 207
    .line 208
    invoke-static {v2}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 209
    .line 210
    .line 211
    move-result v12

    .line 212
    if-eqz v12, :cond_6

    .line 213
    .line 214
    const-string v2, "\u65e9\u4e0a\u597d\uff0c\u540c\u5b66\uff01"

    .line 215
    .line 216
    goto :goto_2

    .line 217
    :cond_6
    const-string v12, "\u65e9\u4e0a\u597d\uff0c"

    .line 218
    .line 219
    const-string v13, "\u540c\u5b66\uff01"

    .line 220
    .line 221
    invoke-static {v12, v2, v13}, Landroid/support/v4/media/f;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    :goto_2
    const-wide v29, 0xff15171aL

    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    move v12, v6

    .line 231
    move v13, v7

    .line 232
    invoke-static/range {v29 .. v30}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 233
    .line 234
    .line 235
    move-result-wide v6

    .line 236
    const/16 v14, 0x15

    .line 237
    .line 238
    invoke-static {v14}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 239
    .line 240
    .line 241
    move-result-wide v14

    .line 242
    sget-object v16, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    .line 243
    .line 244
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    .line 245
    .line 246
    .line 247
    move-result-object v16

    .line 248
    const/16 v27, 0x0

    .line 249
    .line 250
    const v28, 0x1ffd2

    .line 251
    .line 252
    .line 253
    move/from16 v17, v5

    .line 254
    .line 255
    const/4 v5, 0x0

    .line 256
    move/from16 v18, v10

    .line 257
    .line 258
    const/4 v10, 0x0

    .line 259
    move/from16 v19, v12

    .line 260
    .line 261
    const/4 v12, 0x0

    .line 262
    move-object/from16 v23, v8

    .line 263
    .line 264
    move/from16 v20, v13

    .line 265
    .line 266
    move-wide/from16 v64, v14

    .line 267
    .line 268
    move-object v15, v9

    .line 269
    move-wide/from16 v8, v64

    .line 270
    .line 271
    const-wide/16 v13, 0x0

    .line 272
    .line 273
    move-object/from16 v21, v15

    .line 274
    .line 275
    const/4 v15, 0x0

    .line 276
    move/from16 v22, v11

    .line 277
    .line 278
    move-object/from16 v11, v16

    .line 279
    .line 280
    const/16 v16, 0x0

    .line 281
    .line 282
    move/from16 v25, v17

    .line 283
    .line 284
    move/from16 v24, v18

    .line 285
    .line 286
    const-wide/16 v17, 0x0

    .line 287
    .line 288
    move/from16 v26, v19

    .line 289
    .line 290
    const/16 v19, 0x0

    .line 291
    .line 292
    move/from16 v31, v20

    .line 293
    .line 294
    const/16 v20, 0x0

    .line 295
    .line 296
    move-object/from16 v32, v21

    .line 297
    .line 298
    const/16 v21, 0x0

    .line 299
    .line 300
    move/from16 v33, v22

    .line 301
    .line 302
    const/16 v22, 0x0

    .line 303
    .line 304
    move/from16 v34, v25

    .line 305
    .line 306
    move-object/from16 v25, v23

    .line 307
    .line 308
    const/16 v23, 0x0

    .line 309
    .line 310
    move/from16 v35, v24

    .line 311
    .line 312
    const/16 v24, 0x0

    .line 313
    .line 314
    move/from16 v36, v26

    .line 315
    .line 316
    const v26, 0x30d80

    .line 317
    .line 318
    .line 319
    move/from16 v37, v31

    .line 320
    .line 321
    move/from16 v31, v3

    .line 322
    .line 323
    move/from16 v3, v37

    .line 324
    .line 325
    move/from16 v37, v4

    .line 326
    .line 327
    move/from16 v38, v33

    .line 328
    .line 329
    move-object v4, v2

    .line 330
    move-object/from16 v2, v32

    .line 331
    .line 332
    invoke-static/range {v4 .. v28}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 333
    .line 334
    .line 335
    move-object/from16 v23, v25

    .line 336
    .line 337
    iget-object v4, v0, Lcom/zykj/mistake/feature/review/i;->b:Ljava/lang/String;

    .line 338
    .line 339
    const/16 v5, 0x2a

    .line 340
    .line 341
    invoke-static {v4, v5}, Lkotlin/text/p;->G(Ljava/lang/CharSequence;C)Z

    .line 342
    .line 343
    .line 344
    move-result v6

    .line 345
    if-nez v6, :cond_7

    .line 346
    .line 347
    new-instance v5, Landroidx/compose/ui/text/AnnotatedString;

    .line 348
    .line 349
    const/4 v6, 0x2

    .line 350
    invoke-direct {v5, v4, v2, v6, v2}, Landroidx/compose/ui/text/AnnotatedString;-><init>(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/e;)V

    .line 351
    .line 352
    .line 353
    :goto_3
    move-object v4, v5

    .line 354
    goto/16 :goto_6

    .line 355
    .line 356
    :cond_7
    new-instance v6, Landroidx/compose/ui/text/AnnotatedString$Builder;

    .line 357
    .line 358
    const/4 v12, 0x1

    .line 359
    invoke-direct {v6, v3, v12, v2}, Landroidx/compose/ui/text/AnnotatedString$Builder;-><init>(IILkotlin/jvm/internal/e;)V

    .line 360
    .line 361
    .line 362
    move v7, v3

    .line 363
    :goto_4
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 364
    .line 365
    .line 366
    move-result v8

    .line 367
    if-ge v7, v8, :cond_a

    .line 368
    .line 369
    const/4 v8, 0x4

    .line 370
    invoke-static {v4, v5, v7, v8}, Lkotlin/text/p;->M(Ljava/lang/CharSequence;CII)I

    .line 371
    .line 372
    .line 373
    move-result v9

    .line 374
    const-string v10, "substring(...)"

    .line 375
    .line 376
    const/4 v11, -0x1

    .line 377
    if-ne v9, v11, :cond_8

    .line 378
    .line 379
    invoke-virtual {v4, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v4

    .line 383
    invoke-static {v4, v10}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v6, v4}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    goto :goto_5

    .line 390
    :cond_8
    add-int/lit8 v12, v9, 0x1

    .line 391
    .line 392
    invoke-static {v4, v5, v12, v8}, Lkotlin/text/p;->M(Ljava/lang/CharSequence;CII)I

    .line 393
    .line 394
    .line 395
    move-result v8

    .line 396
    if-ne v8, v11, :cond_9

    .line 397
    .line 398
    invoke-virtual {v4, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v4

    .line 402
    invoke-static {v4, v10}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v6, v4}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    goto :goto_5

    .line 409
    :cond_9
    invoke-virtual {v4, v7, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v7

    .line 413
    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v6, v7}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    new-instance v40, Landroidx/compose/ui/text/SpanStyle;

    .line 420
    .line 421
    const-wide v13, 0xff1576ffL

    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    invoke-static {v13, v14}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 427
    .line 428
    .line 429
    move-result-wide v41

    .line 430
    const v61, 0xfffe

    .line 431
    .line 432
    .line 433
    const/16 v62, 0x0

    .line 434
    .line 435
    const-wide/16 v43, 0x0

    .line 436
    .line 437
    const/16 v45, 0x0

    .line 438
    .line 439
    const/16 v46, 0x0

    .line 440
    .line 441
    const/16 v47, 0x0

    .line 442
    .line 443
    const/16 v48, 0x0

    .line 444
    .line 445
    const/16 v49, 0x0

    .line 446
    .line 447
    const-wide/16 v50, 0x0

    .line 448
    .line 449
    const/16 v52, 0x0

    .line 450
    .line 451
    const/16 v53, 0x0

    .line 452
    .line 453
    const/16 v54, 0x0

    .line 454
    .line 455
    const-wide/16 v55, 0x0

    .line 456
    .line 457
    const/16 v57, 0x0

    .line 458
    .line 459
    const/16 v58, 0x0

    .line 460
    .line 461
    const/16 v59, 0x0

    .line 462
    .line 463
    const/16 v60, 0x0

    .line 464
    .line 465
    invoke-direct/range {v40 .. v62}, Landroidx/compose/ui/text/SpanStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;ILkotlin/jvm/internal/e;)V

    .line 466
    .line 467
    .line 468
    move-object/from16 v7, v40

    .line 469
    .line 470
    invoke-virtual {v6, v7}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pushStyle(Landroidx/compose/ui/text/SpanStyle;)I

    .line 471
    .line 472
    .line 473
    move-result v7

    .line 474
    :try_start_0
    invoke-virtual {v4, v12, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v9

    .line 478
    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {v6, v9}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 482
    .line 483
    .line 484
    invoke-virtual {v6, v7}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pop(I)V

    .line 485
    .line 486
    .line 487
    add-int/lit8 v7, v8, 0x1

    .line 488
    .line 489
    goto :goto_4

    .line 490
    :catchall_0
    move-exception v0

    .line 491
    invoke-virtual {v6, v7}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pop(I)V

    .line 492
    .line 493
    .line 494
    throw v0

    .line 495
    :cond_a
    :goto_5
    invoke-virtual {v6}, Landroidx/compose/ui/text/AnnotatedString$Builder;->toAnnotatedString()Landroidx/compose/ui/text/AnnotatedString;

    .line 496
    .line 497
    .line 498
    move-result-object v5

    .line 499
    goto/16 :goto_3

    .line 500
    .line 501
    :goto_6
    invoke-static/range {v29 .. v30}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 502
    .line 503
    .line 504
    move-result-wide v6

    .line 505
    const/16 v5, 0xf

    .line 506
    .line 507
    invoke-static {v5}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 508
    .line 509
    .line 510
    move-result-wide v8

    .line 511
    sget-object v11, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 512
    .line 513
    const/16 v5, 0x8

    .line 514
    .line 515
    int-to-float v5, v5

    .line 516
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 517
    .line 518
    .line 519
    move-result v12

    .line 520
    const/16 v15, 0xd

    .line 521
    .line 522
    const/16 v16, 0x0

    .line 523
    .line 524
    move-object v10, v11

    .line 525
    const/4 v11, 0x0

    .line 526
    const/4 v13, 0x0

    .line 527
    const/4 v14, 0x0

    .line 528
    invoke-static/range {v10 .. v16}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 529
    .line 530
    .line 531
    move-result-object v5

    .line 532
    move-object v11, v10

    .line 533
    const/16 v28, 0x0

    .line 534
    .line 535
    const v29, 0x3fff0

    .line 536
    .line 537
    .line 538
    const/4 v10, 0x0

    .line 539
    move-object v12, v11

    .line 540
    const/4 v11, 0x0

    .line 541
    move-object v13, v12

    .line 542
    const/4 v12, 0x0

    .line 543
    move-object v15, v13

    .line 544
    const-wide/16 v13, 0x0

    .line 545
    .line 546
    move-object/from16 v16, v15

    .line 547
    .line 548
    const/4 v15, 0x0

    .line 549
    move-object/from16 v17, v16

    .line 550
    .line 551
    const/16 v16, 0x0

    .line 552
    .line 553
    move-object/from16 v19, v17

    .line 554
    .line 555
    const-wide/16 v17, 0x0

    .line 556
    .line 557
    move-object/from16 v20, v19

    .line 558
    .line 559
    const/16 v19, 0x0

    .line 560
    .line 561
    move-object/from16 v21, v20

    .line 562
    .line 563
    const/16 v20, 0x0

    .line 564
    .line 565
    move-object/from16 v22, v21

    .line 566
    .line 567
    const/16 v21, 0x0

    .line 568
    .line 569
    move-object/from16 v24, v22

    .line 570
    .line 571
    const/16 v22, 0x0

    .line 572
    .line 573
    move-object/from16 v25, v23

    .line 574
    .line 575
    const/16 v23, 0x0

    .line 576
    .line 577
    move-object/from16 v26, v24

    .line 578
    .line 579
    const/16 v24, 0x0

    .line 580
    .line 581
    move-object/from16 v27, v26

    .line 582
    .line 583
    move-object/from16 v26, v25

    .line 584
    .line 585
    const/16 v25, 0x0

    .line 586
    .line 587
    move-object/from16 v30, v27

    .line 588
    .line 589
    const/16 v27, 0xdb0

    .line 590
    .line 591
    move-object/from16 v3, v30

    .line 592
    .line 593
    invoke-static/range {v4 .. v29}, Landroidx/compose/material3/TextKt;->Text-IbK3jfQ(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILjava/util/Map;Lr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 594
    .line 595
    .line 596
    move-object/from16 v8, v26

    .line 597
    .line 598
    invoke-static/range {v35 .. v35}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 599
    .line 600
    .line 601
    move-result v4

    .line 602
    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 603
    .line 604
    .line 605
    move-result-object v4

    .line 606
    const/4 v5, 0x6

    .line 607
    invoke-static {v4, v8, v5}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 608
    .line 609
    .line 610
    const/4 v4, 0x0

    .line 611
    const/4 v12, 0x1

    .line 612
    invoke-static {v3, v4, v12, v2}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 613
    .line 614
    .line 615
    move-result-object v6

    .line 616
    iget v7, v1, Lcom/zykj/mistake/feature/review/t;->b:F

    .line 617
    .line 618
    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 619
    .line 620
    .line 621
    move-result-object v6

    .line 622
    sget-object v7, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 623
    .line 624
    const/16 v9, 0xc

    .line 625
    .line 626
    int-to-float v9, v9

    .line 627
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 628
    .line 629
    .line 630
    move-result v10

    .line 631
    invoke-virtual {v7, v10}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 632
    .line 633
    .line 634
    move-result-object v10

    .line 635
    sget-object v16, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 636
    .line 637
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    .line 638
    .line 639
    .line 640
    move-result-object v11

    .line 641
    invoke-static {v10, v11, v8, v5}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 642
    .line 643
    .line 644
    move-result-object v10

    .line 645
    const/4 v13, 0x0

    .line 646
    invoke-static {v8, v13}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 647
    .line 648
    .line 649
    move-result v11

    .line 650
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 651
    .line 652
    .line 653
    move-result-object v12

    .line 654
    invoke-static {v8, v6}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 655
    .line 656
    .line 657
    move-result-object v6

    .line 658
    sget-object v13, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 659
    .line 660
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 661
    .line 662
    .line 663
    move-result-object v14

    .line 664
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 665
    .line 666
    .line 667
    move-result-object v15

    .line 668
    if-nez v15, :cond_b

    .line 669
    .line 670
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 671
    .line 672
    .line 673
    :cond_b
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 674
    .line 675
    .line 676
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 677
    .line 678
    .line 679
    move-result v15

    .line 680
    if-eqz v15, :cond_c

    .line 681
    .line 682
    invoke-interface {v8, v14}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 683
    .line 684
    .line 685
    goto :goto_7

    .line 686
    :cond_c
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 687
    .line 688
    .line 689
    :goto_7
    invoke-static {v8}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 690
    .line 691
    .line 692
    move-result-object v14

    .line 693
    invoke-static {v13, v14, v10, v14, v12}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 694
    .line 695
    .line 696
    move-result-object v10

    .line 697
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 698
    .line 699
    .line 700
    move-result v12

    .line 701
    if-nez v12, :cond_d

    .line 702
    .line 703
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 704
    .line 705
    .line 706
    move-result-object v12

    .line 707
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 708
    .line 709
    .line 710
    move-result-object v15

    .line 711
    invoke-static {v12, v15}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 712
    .line 713
    .line 714
    move-result v12

    .line 715
    if-nez v12, :cond_e

    .line 716
    .line 717
    :cond_d
    invoke-static {v11, v14, v11, v10}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 718
    .line 719
    .line 720
    :cond_e
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 721
    .line 722
    .line 723
    move-result-object v10

    .line 724
    invoke-static {v14, v6, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 725
    .line 726
    .line 727
    sget-object v10, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 728
    .line 729
    move/from16 v39, v4

    .line 730
    .line 731
    iget-object v4, v0, Lcom/zykj/mistake/feature/review/i;->c:Ljava/lang/String;

    .line 732
    .line 733
    iget-boolean v6, v0, Lcom/zykj/mistake/feature/review/i;->e:Z

    .line 734
    .line 735
    if-eqz v6, :cond_f

    .line 736
    .line 737
    iget v6, v0, Lcom/zykj/mistake/feature/review/i;->d:I

    .line 738
    .line 739
    if-lez v6, :cond_f

    .line 740
    .line 741
    const/4 v6, 0x1

    .line 742
    goto :goto_8

    .line 743
    :cond_f
    const/4 v6, 0x0

    .line 744
    :goto_8
    iget-object v11, v1, Lcom/zykj/mistake/feature/review/t;->d:Lr6/c;

    .line 745
    .line 746
    invoke-interface {v8, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 747
    .line 748
    .line 749
    move-result v12

    .line 750
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 751
    .line 752
    .line 753
    move-result-object v14

    .line 754
    if-nez v12, :cond_10

    .line 755
    .line 756
    sget-object v12, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 757
    .line 758
    invoke-virtual {v12}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 759
    .line 760
    .line 761
    move-result-object v12

    .line 762
    if-ne v14, v12, :cond_11

    .line 763
    .line 764
    :cond_10
    new-instance v14, Lcom/zykj/mistake/feature/notebook/list/g1;

    .line 765
    .line 766
    const/4 v12, 0x7

    .line 767
    invoke-direct {v14, v11, v12}, Lcom/zykj/mistake/feature/notebook/list/g1;-><init>(Lr6/c;I)V

    .line 768
    .line 769
    .line 770
    invoke-interface {v8, v14}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 771
    .line 772
    .line 773
    :cond_11
    move-object/from16 v17, v14

    .line 774
    .line 775
    check-cast v17, Lr6/a;

    .line 776
    .line 777
    const/4 v14, 0x2

    .line 778
    const/4 v15, 0x0

    .line 779
    const v12, 0x3fb5c28f    # 1.42f

    .line 780
    .line 781
    .line 782
    move-object/from16 v18, v13

    .line 783
    .line 784
    const/4 v13, 0x0

    .line 785
    move-object/from16 v63, v11

    .line 786
    .line 787
    move-object v11, v3

    .line 788
    move-object/from16 v3, v18

    .line 789
    .line 790
    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/layout/RowScope;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 791
    .line 792
    .line 793
    move-result-object v12

    .line 794
    move v13, v9

    .line 795
    const/4 v9, 0x0

    .line 796
    move/from16 v64, v13

    .line 797
    .line 798
    move v13, v5

    .line 799
    move v5, v6

    .line 800
    move-object/from16 v6, v17

    .line 801
    .line 802
    move/from16 v17, v64

    .line 803
    .line 804
    move-object/from16 v64, v12

    .line 805
    .line 806
    move-object v12, v7

    .line 807
    move-object/from16 v7, v64

    .line 808
    .line 809
    invoke-static/range {v4 .. v9}, Lcom/zykj/mistake/feature/review/y;->c(Ljava/lang/String;ZLr6/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 810
    .line 811
    .line 812
    move-object/from16 v23, v8

    .line 813
    .line 814
    iget-object v4, v0, Lcom/zykj/mistake/feature/review/i;->o:Ljava/lang/Integer;

    .line 815
    .line 816
    iget v5, v0, Lcom/zykj/mistake/feature/review/i;->p:I

    .line 817
    .line 818
    iget v6, v0, Lcom/zykj/mistake/feature/review/i;->q:I

    .line 819
    .line 820
    iget v7, v0, Lcom/zykj/mistake/feature/review/i;->r:I

    .line 821
    .line 822
    iget v8, v0, Lcom/zykj/mistake/feature/review/i;->s:I

    .line 823
    .line 824
    move-object v9, v12

    .line 825
    const/high16 v12, 0x3f800000    # 1.0f

    .line 826
    .line 827
    move/from16 v18, v13

    .line 828
    .line 829
    const/4 v13, 0x0

    .line 830
    move/from16 v2, v18

    .line 831
    .line 832
    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/layout/RowScope;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 833
    .line 834
    .line 835
    move-result-object v12

    .line 836
    move-object v14, v10

    .line 837
    move-object v13, v11

    .line 838
    const/4 v11, 0x0

    .line 839
    move-object v10, v12

    .line 840
    move-object v12, v9

    .line 841
    move-object v9, v10

    .line 842
    move-object/from16 v10, v23

    .line 843
    .line 844
    invoke-static/range {v4 .. v11}, Lcom/zykj/mistake/feature/review/y;->b(Ljava/lang/Integer;IIIILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 845
    .line 846
    .line 847
    move-object v8, v10

    .line 848
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 849
    .line 850
    .line 851
    invoke-static/range {v17 .. v17}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 852
    .line 853
    .line 854
    move-result v4

    .line 855
    invoke-static {v13, v4}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 856
    .line 857
    .line 858
    move-result-object v4

    .line 859
    invoke-static {v4, v8, v2}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 860
    .line 861
    .line 862
    const/4 v4, 0x0

    .line 863
    const/4 v5, 0x1

    .line 864
    const/4 v15, 0x0

    .line 865
    invoke-static {v13, v4, v5, v15}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 866
    .line 867
    .line 868
    move-result-object v4

    .line 869
    iget v6, v1, Lcom/zykj/mistake/feature/review/t;->c:F

    .line 870
    .line 871
    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 872
    .line 873
    .line 874
    move-result-object v4

    .line 875
    invoke-static/range {v17 .. v17}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 876
    .line 877
    .line 878
    move-result v6

    .line 879
    invoke-virtual {v12, v6}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 880
    .line 881
    .line 882
    move-result-object v6

    .line 883
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    .line 884
    .line 885
    .line 886
    move-result-object v7

    .line 887
    invoke-static {v6, v7, v8, v2}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 888
    .line 889
    .line 890
    move-result-object v2

    .line 891
    const/4 v6, 0x0

    .line 892
    invoke-static {v8, v6}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 893
    .line 894
    .line 895
    move-result v7

    .line 896
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 897
    .line 898
    .line 899
    move-result-object v9

    .line 900
    invoke-static {v8, v4}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 901
    .line 902
    .line 903
    move-result-object v4

    .line 904
    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 905
    .line 906
    .line 907
    move-result-object v10

    .line 908
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 909
    .line 910
    .line 911
    move-result-object v11

    .line 912
    if-nez v11, :cond_12

    .line 913
    .line 914
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 915
    .line 916
    .line 917
    :cond_12
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 918
    .line 919
    .line 920
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 921
    .line 922
    .line 923
    move-result v11

    .line 924
    if-eqz v11, :cond_13

    .line 925
    .line 926
    invoke-interface {v8, v10}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 927
    .line 928
    .line 929
    goto :goto_9

    .line 930
    :cond_13
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 931
    .line 932
    .line 933
    :goto_9
    invoke-static {v8}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 934
    .line 935
    .line 936
    move-result-object v10

    .line 937
    invoke-static {v3, v10, v2, v10, v9}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 938
    .line 939
    .line 940
    move-result-object v2

    .line 941
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 942
    .line 943
    .line 944
    move-result v9

    .line 945
    if-nez v9, :cond_14

    .line 946
    .line 947
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 948
    .line 949
    .line 950
    move-result-object v9

    .line 951
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 952
    .line 953
    .line 954
    move-result-object v11

    .line 955
    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 956
    .line 957
    .line 958
    move-result v9

    .line 959
    if-nez v9, :cond_15

    .line 960
    .line 961
    :cond_14
    invoke-static {v7, v10, v7, v2}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 962
    .line 963
    .line 964
    :cond_15
    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 965
    .line 966
    .line 967
    move-result-object v2

    .line 968
    invoke-static {v10, v4, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 969
    .line 970
    .line 971
    new-instance v2, Ljava/lang/StringBuilder;

    .line 972
    .line 973
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 974
    .line 975
    .line 976
    move/from16 v3, v38

    .line 977
    .line 978
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 979
    .line 980
    .line 981
    const-string v4, "\u9053"

    .line 982
    .line 983
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 984
    .line 985
    .line 986
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 987
    .line 988
    .line 989
    move-result-object v2

    .line 990
    move/from16 v32, v6

    .line 991
    .line 992
    iget-object v6, v0, Lcom/zykj/mistake/feature/review/i;->f:Ljava/lang/String;

    .line 993
    .line 994
    sget v7, Lcom/zykj/mistake/R$drawable;->ic_to_be_strengthened:I

    .line 995
    .line 996
    sget v9, Lcom/zykj/mistake/R$drawable;->bg_to_be_strengthened:I

    .line 997
    .line 998
    const-wide v10, 0xffffe3e3L

    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    invoke-static {v10, v11}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 1004
    .line 1005
    .line 1006
    move-result-wide v16

    .line 1007
    const-wide v10, 0xffff4d4fL

    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    invoke-static {v10, v11}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 1013
    .line 1014
    .line 1015
    move-result-wide v18

    .line 1016
    iget-boolean v12, v0, Lcom/zykj/mistake/feature/review/i;->h:Z

    .line 1017
    .line 1018
    if-eqz v12, :cond_16

    .line 1019
    .line 1020
    if-lez v3, :cond_16

    .line 1021
    .line 1022
    move v3, v5

    .line 1023
    goto :goto_a

    .line 1024
    :cond_16
    move/from16 v3, v32

    .line 1025
    .line 1026
    :goto_a
    invoke-static {v10, v11}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 1027
    .line 1028
    .line 1029
    move-result-wide v20

    .line 1030
    sget-object v27, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 1031
    .line 1032
    move-wide/from16 v22, v16

    .line 1033
    .line 1034
    move-wide/from16 v24, v18

    .line 1035
    .line 1036
    invoke-virtual/range {v27 .. v27}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 1037
    .line 1038
    .line 1039
    move-result-wide v17

    .line 1040
    move-object v10, v14

    .line 1041
    const/4 v14, 0x2

    .line 1042
    const/4 v15, 0x0

    .line 1043
    const v12, 0x3f970a3d    # 1.18f

    .line 1044
    .line 1045
    .line 1046
    move-object v11, v13

    .line 1047
    const/4 v13, 0x0

    .line 1048
    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/layout/RowScope;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v19

    .line 1052
    move-object/from16 v28, v10

    .line 1053
    .line 1054
    move-object/from16 v30, v11

    .line 1055
    .line 1056
    move-object/from16 v10, v63

    .line 1057
    .line 1058
    invoke-interface {v8, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 1059
    .line 1060
    .line 1061
    move-result v11

    .line 1062
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v12

    .line 1066
    if-nez v11, :cond_17

    .line 1067
    .line 1068
    sget-object v11, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 1069
    .line 1070
    invoke-virtual {v11}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v11

    .line 1074
    if-ne v12, v11, :cond_18

    .line 1075
    .line 1076
    :cond_17
    new-instance v12, Lcom/zykj/mistake/feature/notebook/list/g1;

    .line 1077
    .line 1078
    const/16 v11, 0x9

    .line 1079
    .line 1080
    invoke-direct {v12, v10, v11}, Lcom/zykj/mistake/feature/notebook/list/g1;-><init>(Lr6/c;I)V

    .line 1081
    .line 1082
    .line 1083
    invoke-interface {v8, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1084
    .line 1085
    .line 1086
    :cond_18
    check-cast v12, Lr6/a;

    .line 1087
    .line 1088
    move-object/from16 v63, v10

    .line 1089
    .line 1090
    move-wide/from16 v64, v22

    .line 1091
    .line 1092
    move-object/from16 v23, v8

    .line 1093
    .line 1094
    move v8, v9

    .line 1095
    move-object/from16 v22, v12

    .line 1096
    .line 1097
    move-wide/from16 v9, v64

    .line 1098
    .line 1099
    move-wide/from16 v11, v24

    .line 1100
    .line 1101
    const/16 v25, 0x186

    .line 1102
    .line 1103
    const/16 v26, 0x2000

    .line 1104
    .line 1105
    move-object v13, v4

    .line 1106
    const-string v4, "\u5f85\u52a0\u5f3a"

    .line 1107
    .line 1108
    const-string v14, "\u53bb\u7ec3\u4e60"

    .line 1109
    .line 1110
    move-wide/from16 v15, v20

    .line 1111
    .line 1112
    const v20, 0x3f2b1bdb

    .line 1113
    .line 1114
    .line 1115
    const/16 v21, 0x0

    .line 1116
    .line 1117
    const v24, 0x361b0006

    .line 1118
    .line 1119
    .line 1120
    move-object/from16 v36, v13

    .line 1121
    .line 1122
    move v13, v3

    .line 1123
    move-object/from16 v3, v36

    .line 1124
    .line 1125
    move/from16 v36, v5

    .line 1126
    .line 1127
    move-object v5, v2

    .line 1128
    move-object/from16 v2, v63

    .line 1129
    .line 1130
    invoke-static/range {v4 .. v26}, Lcom/zykj/mistake/feature/review/y;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIJJZLjava/lang/String;JJLandroidx/compose/ui/Modifier;FZLr6/a;Landroidx/compose/runtime/Composer;III)V

    .line 1131
    .line 1132
    .line 1133
    move-object/from16 v8, v23

    .line 1134
    .line 1135
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1136
    .line 1137
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 1138
    .line 1139
    .line 1140
    move/from16 v5, v37

    .line 1141
    .line 1142
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1143
    .line 1144
    .line 1145
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1146
    .line 1147
    .line 1148
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v4

    .line 1152
    iget-object v6, v0, Lcom/zykj/mistake/feature/review/i;->i:Ljava/lang/String;

    .line 1153
    .line 1154
    sget v7, Lcom/zykj/mistake/R$drawable;->ic_consolidating:I

    .line 1155
    .line 1156
    sget v9, Lcom/zykj/mistake/R$drawable;->bg_consolidating:I

    .line 1157
    .line 1158
    const-wide v10, 0xffffefd8L

    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    invoke-static {v10, v11}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 1164
    .line 1165
    .line 1166
    move-result-wide v16

    .line 1167
    const-wide v10, 0xffff7a1aL

    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    invoke-static {v10, v11}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 1173
    .line 1174
    .line 1175
    move-result-wide v18

    .line 1176
    iget-boolean v10, v0, Lcom/zykj/mistake/feature/review/i;->k:Z

    .line 1177
    .line 1178
    if-eqz v10, :cond_19

    .line 1179
    .line 1180
    if-lez v5, :cond_19

    .line 1181
    .line 1182
    move/from16 v5, v36

    .line 1183
    .line 1184
    goto :goto_b

    .line 1185
    :cond_19
    move/from16 v5, v32

    .line 1186
    .line 1187
    :goto_b
    const-wide v10, 0xffff7a00L

    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    invoke-static {v10, v11}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 1193
    .line 1194
    .line 1195
    move-result-wide v20

    .line 1196
    invoke-virtual/range {v27 .. v27}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 1197
    .line 1198
    .line 1199
    move-result-wide v22

    .line 1200
    const/4 v14, 0x2

    .line 1201
    const/4 v15, 0x0

    .line 1202
    const v12, 0x3f970a3d    # 1.18f

    .line 1203
    .line 1204
    .line 1205
    const/4 v13, 0x0

    .line 1206
    move-object/from16 v10, v28

    .line 1207
    .line 1208
    move-object/from16 v11, v30

    .line 1209
    .line 1210
    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/layout/RowScope;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v12

    .line 1214
    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 1215
    .line 1216
    .line 1217
    move-result v10

    .line 1218
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v11

    .line 1222
    if-nez v10, :cond_1a

    .line 1223
    .line 1224
    sget-object v10, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 1225
    .line 1226
    invoke-virtual {v10}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v10

    .line 1230
    if-ne v11, v10, :cond_1b

    .line 1231
    .line 1232
    :cond_1a
    new-instance v11, Lcom/zykj/mistake/feature/notebook/list/g1;

    .line 1233
    .line 1234
    const/16 v10, 0xa

    .line 1235
    .line 1236
    invoke-direct {v11, v2, v10}, Lcom/zykj/mistake/feature/notebook/list/g1;-><init>(Lr6/c;I)V

    .line 1237
    .line 1238
    .line 1239
    invoke-interface {v8, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1240
    .line 1241
    .line 1242
    :cond_1b
    check-cast v11, Lr6/a;

    .line 1243
    .line 1244
    const/16 v25, 0x186

    .line 1245
    .line 1246
    const/16 v26, 0x2000

    .line 1247
    .line 1248
    move v13, v5

    .line 1249
    move-object v5, v4

    .line 1250
    const-string v4, "\u5de9\u56fa\u4e2d"

    .line 1251
    .line 1252
    const-string v14, "\u53bb\u7ec3\u4e60"

    .line 1253
    .line 1254
    move-wide/from16 v64, v22

    .line 1255
    .line 1256
    move-object/from16 v23, v8

    .line 1257
    .line 1258
    move v8, v9

    .line 1259
    move-object/from16 v22, v11

    .line 1260
    .line 1261
    move-wide/from16 v9, v16

    .line 1262
    .line 1263
    move-wide/from16 v15, v20

    .line 1264
    .line 1265
    move-wide/from16 v66, v18

    .line 1266
    .line 1267
    move-object/from16 v19, v12

    .line 1268
    .line 1269
    move-wide/from16 v11, v66

    .line 1270
    .line 1271
    move-wide/from16 v17, v64

    .line 1272
    .line 1273
    const v20, 0x3f2b1bdb

    .line 1274
    .line 1275
    .line 1276
    const/16 v21, 0x0

    .line 1277
    .line 1278
    const v24, 0x361b0006

    .line 1279
    .line 1280
    .line 1281
    invoke-static/range {v4 .. v26}, Lcom/zykj/mistake/feature/review/y;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIJJZLjava/lang/String;JJLandroidx/compose/ui/Modifier;FZLr6/a;Landroidx/compose/runtime/Composer;III)V

    .line 1282
    .line 1283
    .line 1284
    move-object/from16 v8, v23

    .line 1285
    .line 1286
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1287
    .line 1288
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 1289
    .line 1290
    .line 1291
    move/from16 v5, v31

    .line 1292
    .line 1293
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1294
    .line 1295
    .line 1296
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1297
    .line 1298
    .line 1299
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1300
    .line 1301
    .line 1302
    move-result-object v3

    .line 1303
    iget-object v6, v0, Lcom/zykj/mistake/feature/review/i;->l:Ljava/lang/String;

    .line 1304
    .line 1305
    sget v7, Lcom/zykj/mistake/R$drawable;->ic_mastered:I

    .line 1306
    .line 1307
    sget v4, Lcom/zykj/mistake/R$drawable;->bg_mastered:I

    .line 1308
    .line 1309
    const-wide v9, 0xffe9f8f1L

    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    invoke-static {v9, v10}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 1315
    .line 1316
    .line 1317
    move-result-wide v16

    .line 1318
    const-wide v11, 0xff20c997L

    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    invoke-static {v11, v12}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 1324
    .line 1325
    .line 1326
    move-result-wide v18

    .line 1327
    iget-boolean v0, v0, Lcom/zykj/mistake/feature/review/i;->n:Z

    .line 1328
    .line 1329
    if-eqz v0, :cond_1c

    .line 1330
    .line 1331
    if-lez v5, :cond_1c

    .line 1332
    .line 1333
    move/from16 v32, v36

    .line 1334
    .line 1335
    :cond_1c
    invoke-static {v9, v10}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 1336
    .line 1337
    .line 1338
    move-result-wide v20

    .line 1339
    invoke-static {v11, v12}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 1340
    .line 1341
    .line 1342
    move-result-wide v22

    .line 1343
    const/4 v14, 0x2

    .line 1344
    const/4 v15, 0x0

    .line 1345
    const v12, 0x3f666666    # 0.9f

    .line 1346
    .line 1347
    .line 1348
    const/4 v13, 0x0

    .line 1349
    move-object/from16 v10, v28

    .line 1350
    .line 1351
    move-object/from16 v11, v30

    .line 1352
    .line 1353
    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/layout/RowScope;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v0

    .line 1357
    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 1358
    .line 1359
    .line 1360
    move-result v5

    .line 1361
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1362
    .line 1363
    .line 1364
    move-result-object v9

    .line 1365
    if-nez v5, :cond_1d

    .line 1366
    .line 1367
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 1368
    .line 1369
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1370
    .line 1371
    .line 1372
    move-result-object v5

    .line 1373
    if-ne v9, v5, :cond_1e

    .line 1374
    .line 1375
    :cond_1d
    new-instance v9, Lcom/zykj/mistake/feature/notebook/list/g1;

    .line 1376
    .line 1377
    const/16 v5, 0xb

    .line 1378
    .line 1379
    invoke-direct {v9, v2, v5}, Lcom/zykj/mistake/feature/notebook/list/g1;-><init>(Lr6/c;I)V

    .line 1380
    .line 1381
    .line 1382
    invoke-interface {v8, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1383
    .line 1384
    .line 1385
    :cond_1e
    check-cast v9, Lr6/a;

    .line 1386
    .line 1387
    const/16 v25, 0xd86

    .line 1388
    .line 1389
    const/16 v26, 0x0

    .line 1390
    .line 1391
    move-object v10, v8

    .line 1392
    move v8, v4

    .line 1393
    const-string v4, "\u5df2\u638c\u63e1"

    .line 1394
    .line 1395
    const-string v14, "\u53bb\u62bd\u67e5"

    .line 1396
    .line 1397
    move-wide/from16 v11, v18

    .line 1398
    .line 1399
    move-wide/from16 v64, v22

    .line 1400
    .line 1401
    move-object/from16 v22, v9

    .line 1402
    .line 1403
    move-object/from16 v23, v10

    .line 1404
    .line 1405
    move-wide/from16 v9, v16

    .line 1406
    .line 1407
    move-wide/from16 v15, v20

    .line 1408
    .line 1409
    move-wide/from16 v17, v64

    .line 1410
    .line 1411
    const v20, 0x3f0350e9

    .line 1412
    .line 1413
    .line 1414
    const/16 v21, 0x1

    .line 1415
    .line 1416
    const v24, 0x361b0006

    .line 1417
    .line 1418
    .line 1419
    move-object/from16 v19, v0

    .line 1420
    .line 1421
    move-object v5, v3

    .line 1422
    move/from16 v13, v32

    .line 1423
    .line 1424
    invoke-static/range {v4 .. v26}, Lcom/zykj/mistake/feature/review/y;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIJJZLjava/lang/String;JJLandroidx/compose/ui/Modifier;FZLr6/a;Landroidx/compose/runtime/Composer;III)V

    .line 1425
    .line 1426
    .line 1427
    invoke-static/range {v23 .. v23}, Landroidx/collection/a;->D(Landroidx/compose/runtime/Composer;)Z

    .line 1428
    .line 1429
    .line 1430
    move-result v0

    .line 1431
    if-eqz v0, :cond_20

    .line 1432
    .line 1433
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 1434
    .line 1435
    .line 1436
    goto :goto_c

    .line 1437
    :cond_1f
    move-object/from16 v23, v8

    .line 1438
    .line 1439
    invoke-interface/range {v23 .. v23}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 1440
    .line 1441
    .line 1442
    :cond_20
    :goto_c
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 1443
    .line 1444
    return-object v0
.end method
