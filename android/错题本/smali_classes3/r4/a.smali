.class public final synthetic Lr4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:Lcom/zykj/mistake/main/RemoveDialogTarget;

.field public final synthetic b:Lr6/a;

.field public final synthetic c:Lr6/a;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/main/RemoveDialogTarget;Lr6/a;Lr6/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr4/a;->a:Lcom/zykj/mistake/main/RemoveDialogTarget;

    iput-object p2, p0, Lr4/a;->b:Lr6/a;

    iput-object p3, p0, Lr4/a;->c:Lr6/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    check-cast v8, Landroidx/compose/runtime/Composer;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    and-int/lit8 v2, v1, 0x3

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    const/4 v11, 0x0

    .line 19
    if-eq v2, v3, :cond_0

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v2, v11

    .line 24
    :goto_0
    and-int/lit8 v3, v1, 0x1

    .line 25
    .line 26
    invoke-interface {v8, v2, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_10

    .line 31
    .line 32
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    const/4 v2, -0x1

    .line 39
    const-string v3, "com.zykj.mistake.main.dialog.MainRemoveMistakeDialog.<anonymous> (MainRemoveMistakeDialog.kt:35)"

    .line 40
    .line 41
    const v4, -0x5a9dcb98

    .line 42
    .line 43
    .line 44
    invoke-static {v4, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    sget-object v12, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 48
    .line 49
    const/16 v1, 0x140

    .line 50
    .line 51
    int-to-float v1, v1

    .line 52
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    invoke-static {v12, v1}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    sget-object v26, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 61
    .line 62
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 63
    .line 64
    .line 65
    move-result-wide v2

    .line 66
    const/16 v4, 0x8

    .line 67
    .line 68
    int-to-float v13, v4

    .line 69
    invoke-static {v13, v1, v2, v3}, Landroidx/compose/material3/c;->f(FLandroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    const/16 v2, 0x1a

    .line 74
    .line 75
    int-to-float v2, v2

    .line 76
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    const/16 v3, 0x1c

    .line 81
    .line 82
    int-to-float v3, v3

    .line 83
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    invoke-static {v1, v2, v3}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    sget-object v27, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 92
    .line 93
    invoke-virtual/range {v27 .. v27}, Landroidx/compose/ui/Alignment$Companion;->getCenterHorizontally()Landroidx/compose/ui/Alignment$Horizontal;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    sget-object v28, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 98
    .line 99
    invoke-virtual/range {v28 .. v28}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    const/16 v4, 0x30

    .line 104
    .line 105
    invoke-static {v3, v2, v8, v4}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-static {v8, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    invoke-static {v8, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    sget-object v14, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 122
    .line 123
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    if-nez v7, :cond_2

    .line 132
    .line 133
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 134
    .line 135
    .line 136
    :cond_2
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 137
    .line 138
    .line 139
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 140
    .line 141
    .line 142
    move-result v7

    .line 143
    if-eqz v7, :cond_3

    .line 144
    .line 145
    invoke-interface {v8, v6}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 146
    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_3
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 150
    .line 151
    .line 152
    :goto_1
    invoke-static {v8}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    invoke-static {v14, v6, v2, v6, v5}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 161
    .line 162
    .line 163
    move-result v5

    .line 164
    if-nez v5, :cond_4

    .line 165
    .line 166
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v5

    .line 170
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 171
    .line 172
    .line 173
    move-result-object v7

    .line 174
    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v5

    .line 178
    if-nez v5, :cond_5

    .line 179
    .line 180
    :cond_4
    invoke-static {v3, v6, v3, v2}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 181
    .line 182
    .line 183
    :cond_5
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    invoke-static {v6, v1, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 188
    .line 189
    .line 190
    sget-object v1, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 191
    .line 192
    invoke-virtual/range {v27 .. v27}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    invoke-virtual/range {v28 .. v28}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    invoke-static {v2, v1, v8, v4}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    invoke-static {v8, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    invoke-static {v8, v12}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 217
    .line 218
    .line 219
    move-result-object v5

    .line 220
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 221
    .line 222
    .line 223
    move-result-object v6

    .line 224
    if-nez v6, :cond_6

    .line 225
    .line 226
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 227
    .line 228
    .line 229
    :cond_6
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 230
    .line 231
    .line 232
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 233
    .line 234
    .line 235
    move-result v6

    .line 236
    if-eqz v6, :cond_7

    .line 237
    .line 238
    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 239
    .line 240
    .line 241
    goto :goto_2

    .line 242
    :cond_7
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 243
    .line 244
    .line 245
    :goto_2
    invoke-static {v8}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 246
    .line 247
    .line 248
    move-result-object v5

    .line 249
    invoke-static {v14, v5, v1, v5, v3}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 254
    .line 255
    .line 256
    move-result v3

    .line 257
    if-nez v3, :cond_8

    .line 258
    .line 259
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 264
    .line 265
    .line 266
    move-result-object v6

    .line 267
    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v3

    .line 271
    if-nez v3, :cond_9

    .line 272
    .line 273
    :cond_8
    invoke-static {v2, v5, v2, v1}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 274
    .line 275
    .line 276
    :cond_9
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    invoke-static {v5, v4, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 281
    .line 282
    .line 283
    sget-object v1, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 284
    .line 285
    sget v1, Lcom/zykj/mistake/R$mipmap;->ic_warning:I

    .line 286
    .line 287
    invoke-static {v1, v8, v11}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    const/16 v2, 0x14

    .line 292
    .line 293
    int-to-float v2, v2

    .line 294
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 295
    .line 296
    .line 297
    move-result v2

    .line 298
    invoke-static {v12, v2}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 299
    .line 300
    .line 301
    move-result-object v3

    .line 302
    const/16 v9, 0x1b0

    .line 303
    .line 304
    const/16 v10, 0x78

    .line 305
    .line 306
    const/4 v2, 0x0

    .line 307
    const/4 v4, 0x0

    .line 308
    const/4 v5, 0x0

    .line 309
    const/4 v6, 0x0

    .line 310
    const/4 v7, 0x0

    .line 311
    invoke-static/range {v1 .. v10}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 312
    .line 313
    .line 314
    sget-object v1, Lcom/zykj/mistake/main/RemoveDialogTarget;->COLLECTION:Lcom/zykj/mistake/main/RemoveDialogTarget;

    .line 315
    .line 316
    iget-object v2, v0, Lr4/a;->a:Lcom/zykj/mistake/main/RemoveDialogTarget;

    .line 317
    .line 318
    if-ne v2, v1, :cond_a

    .line 319
    .line 320
    const v3, -0x358211f2    # -4160387.5f

    .line 321
    .line 322
    .line 323
    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 324
    .line 325
    .line 326
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 327
    .line 328
    .line 329
    const-string v3, "\u5220\u9664\u9519\u9898\u96c6"

    .line 330
    .line 331
    goto :goto_3

    .line 332
    :cond_a
    const v3, 0x18ba7395

    .line 333
    .line 334
    .line 335
    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 336
    .line 337
    .line 338
    sget v3, Lcom/zykj/mistake/R$string;->remove_mistake:I

    .line 339
    .line 340
    invoke-static {v3, v8, v11}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v3

    .line 344
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 345
    .line 346
    .line 347
    :goto_3
    const/16 v4, 0x10

    .line 348
    .line 349
    invoke-static {v4}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 350
    .line 351
    .line 352
    move-result-wide v5

    .line 353
    const-wide v9, 0xff15171aL

    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    invoke-static {v9, v10}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 359
    .line 360
    .line 361
    move-result-wide v9

    .line 362
    invoke-static {v13}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 363
    .line 364
    .line 365
    move-result v13

    .line 366
    const/16 v17, 0xe

    .line 367
    .line 368
    const/16 v18, 0x0

    .line 369
    .line 370
    move-object v4, v14

    .line 371
    const/4 v14, 0x0

    .line 372
    const/4 v15, 0x0

    .line 373
    const/16 v16, 0x0

    .line 374
    .line 375
    invoke-static/range {v12 .. v18}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 376
    .line 377
    .line 378
    move-result-object v7

    .line 379
    move-object/from16 v29, v12

    .line 380
    .line 381
    const/16 v24, 0x0

    .line 382
    .line 383
    const v25, 0x1fff0

    .line 384
    .line 385
    .line 386
    move-object v12, v2

    .line 387
    move-object v2, v7

    .line 388
    const/4 v7, 0x0

    .line 389
    move-object/from16 v22, v8

    .line 390
    .line 391
    const/4 v8, 0x0

    .line 392
    move-object v13, v1

    .line 393
    move-object v1, v3

    .line 394
    move-wide/from16 v35, v9

    .line 395
    .line 396
    move-object v10, v4

    .line 397
    move-wide/from16 v3, v35

    .line 398
    .line 399
    const/4 v9, 0x0

    .line 400
    move-object v14, v10

    .line 401
    move v15, v11

    .line 402
    const-wide/16 v10, 0x0

    .line 403
    .line 404
    move-object/from16 v16, v12

    .line 405
    .line 406
    const/4 v12, 0x0

    .line 407
    move-object/from16 v17, v13

    .line 408
    .line 409
    const/4 v13, 0x0

    .line 410
    move-object/from16 v18, v14

    .line 411
    .line 412
    move/from16 v19, v15

    .line 413
    .line 414
    const-wide/16 v14, 0x0

    .line 415
    .line 416
    move-object/from16 v20, v16

    .line 417
    .line 418
    const/16 v16, 0x0

    .line 419
    .line 420
    move-object/from16 v21, v17

    .line 421
    .line 422
    const/16 v17, 0x0

    .line 423
    .line 424
    move-object/from16 v23, v18

    .line 425
    .line 426
    const/16 v18, 0x0

    .line 427
    .line 428
    move/from16 v30, v19

    .line 429
    .line 430
    const/16 v19, 0x0

    .line 431
    .line 432
    move-object/from16 v31, v20

    .line 433
    .line 434
    const/16 v20, 0x0

    .line 435
    .line 436
    move-object/from16 v32, v21

    .line 437
    .line 438
    const/16 v21, 0x0

    .line 439
    .line 440
    move-object/from16 v33, v23

    .line 441
    .line 442
    const/16 v23, 0xdb0

    .line 443
    .line 444
    move-object/from16 v34, v31

    .line 445
    .line 446
    move-object/from16 v0, v32

    .line 447
    .line 448
    move-object/from16 p1, v33

    .line 449
    .line 450
    invoke-static/range {v1 .. v25}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 451
    .line 452
    .line 453
    move-object/from16 v8, v22

    .line 454
    .line 455
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 456
    .line 457
    .line 458
    move-object/from16 v12, v34

    .line 459
    .line 460
    if-ne v12, v0, :cond_b

    .line 461
    .line 462
    const v0, -0x38c013f5

    .line 463
    .line 464
    .line 465
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 466
    .line 467
    .line 468
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 469
    .line 470
    .line 471
    const-string v0, "\u5373\u5c06\u5220\u9664\u9519\u9898\u96c6\uff0c\u5220\u9664\u540e\u65e0\u6cd5\u6062\u590d"

    .line 472
    .line 473
    const/4 v1, 0x0

    .line 474
    goto :goto_4

    .line 475
    :cond_b
    const v0, -0x265d5523

    .line 476
    .line 477
    .line 478
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 479
    .line 480
    .line 481
    sget v0, Lcom/zykj/mistake/R$string;->remove_mistake_tip:I

    .line 482
    .line 483
    const/4 v1, 0x0

    .line 484
    invoke-static {v0, v8, v1}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 489
    .line 490
    .line 491
    :goto_4
    const/16 v2, 0xc

    .line 492
    .line 493
    invoke-static {v2}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 494
    .line 495
    .line 496
    move-result-wide v5

    .line 497
    const-wide v3, 0xff666666L

    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    invoke-static {v3, v4}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 503
    .line 504
    .line 505
    move-result-wide v3

    .line 506
    sget-object v7, Landroidx/compose/ui/text/style/TextAlign;->Companion:Landroidx/compose/ui/text/style/TextAlign$Companion;

    .line 507
    .line 508
    invoke-virtual {v7}, Landroidx/compose/ui/text/style/TextAlign$Companion;->getCenter-e0LSkKk()I

    .line 509
    .line 510
    .line 511
    move-result v7

    .line 512
    int-to-float v2, v2

    .line 513
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 514
    .line 515
    .line 516
    move-result v14

    .line 517
    const/16 v17, 0xd

    .line 518
    .line 519
    const/16 v18, 0x0

    .line 520
    .line 521
    const/4 v13, 0x0

    .line 522
    const/4 v15, 0x0

    .line 523
    const/16 v16, 0x0

    .line 524
    .line 525
    move-object/from16 v12, v29

    .line 526
    .line 527
    invoke-static/range {v12 .. v18}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 528
    .line 529
    .line 530
    move-result-object v2

    .line 531
    invoke-static {v7}, Landroidx/compose/ui/text/style/TextAlign;->box-impl(I)Landroidx/compose/ui/text/style/TextAlign;

    .line 532
    .line 533
    .line 534
    move-result-object v13

    .line 535
    const/16 v24, 0x0

    .line 536
    .line 537
    const v25, 0x1fdf0

    .line 538
    .line 539
    .line 540
    const/4 v7, 0x0

    .line 541
    move-object/from16 v22, v8

    .line 542
    .line 543
    const/4 v8, 0x0

    .line 544
    const/4 v9, 0x0

    .line 545
    const-wide/16 v10, 0x0

    .line 546
    .line 547
    const/4 v12, 0x0

    .line 548
    const-wide/16 v14, 0x0

    .line 549
    .line 550
    const/16 v16, 0x0

    .line 551
    .line 552
    const/16 v17, 0x0

    .line 553
    .line 554
    const/16 v18, 0x0

    .line 555
    .line 556
    const/16 v19, 0x0

    .line 557
    .line 558
    const/16 v20, 0x0

    .line 559
    .line 560
    const/16 v21, 0x0

    .line 561
    .line 562
    const/16 v23, 0xdb0

    .line 563
    .line 564
    move/from16 v35, v1

    .line 565
    .line 566
    move-object v1, v0

    .line 567
    move/from16 v0, v35

    .line 568
    .line 569
    invoke-static/range {v1 .. v25}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 570
    .line 571
    .line 572
    move-object/from16 v8, v22

    .line 573
    .line 574
    invoke-virtual/range {v28 .. v28}, Landroidx/compose/foundation/layout/Arrangement;->getCenter()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 575
    .line 576
    .line 577
    move-result-object v1

    .line 578
    const/16 v2, 0x18

    .line 579
    .line 580
    int-to-float v11, v2

    .line 581
    invoke-static {v11}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 582
    .line 583
    .line 584
    move-result v14

    .line 585
    const/16 v17, 0xd

    .line 586
    .line 587
    const/16 v18, 0x0

    .line 588
    .line 589
    const/4 v13, 0x0

    .line 590
    const/4 v15, 0x0

    .line 591
    const/16 v16, 0x0

    .line 592
    .line 593
    move-object/from16 v12, v29

    .line 594
    .line 595
    invoke-static/range {v12 .. v18}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 596
    .line 597
    .line 598
    move-result-object v2

    .line 599
    invoke-virtual/range {v27 .. v27}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    .line 600
    .line 601
    .line 602
    move-result-object v3

    .line 603
    const/4 v4, 0x6

    .line 604
    invoke-static {v1, v3, v8, v4}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 605
    .line 606
    .line 607
    move-result-object v1

    .line 608
    invoke-static {v8, v0}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 609
    .line 610
    .line 611
    move-result v3

    .line 612
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 613
    .line 614
    .line 615
    move-result-object v4

    .line 616
    invoke-static {v8, v2}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 617
    .line 618
    .line 619
    move-result-object v2

    .line 620
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 621
    .line 622
    .line 623
    move-result-object v5

    .line 624
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 625
    .line 626
    .line 627
    move-result-object v6

    .line 628
    if-nez v6, :cond_c

    .line 629
    .line 630
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 631
    .line 632
    .line 633
    :cond_c
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 634
    .line 635
    .line 636
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 637
    .line 638
    .line 639
    move-result v6

    .line 640
    if-eqz v6, :cond_d

    .line 641
    .line 642
    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 643
    .line 644
    .line 645
    goto :goto_5

    .line 646
    :cond_d
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 647
    .line 648
    .line 649
    :goto_5
    invoke-static {v8}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 650
    .line 651
    .line 652
    move-result-object v5

    .line 653
    move-object/from16 v14, p1

    .line 654
    .line 655
    invoke-static {v14, v5, v1, v5, v4}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 656
    .line 657
    .line 658
    move-result-object v1

    .line 659
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 660
    .line 661
    .line 662
    move-result v4

    .line 663
    if-nez v4, :cond_e

    .line 664
    .line 665
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 666
    .line 667
    .line 668
    move-result-object v4

    .line 669
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 670
    .line 671
    .line 672
    move-result-object v6

    .line 673
    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 674
    .line 675
    .line 676
    move-result v4

    .line 677
    if-nez v4, :cond_f

    .line 678
    .line 679
    :cond_e
    invoke-static {v3, v5, v3, v1}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 680
    .line 681
    .line 682
    :cond_f
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 683
    .line 684
    .line 685
    move-result-object v1

    .line 686
    invoke-static {v5, v2, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 687
    .line 688
    .line 689
    sget v1, Lcom/zykj/mistake/R$string;->cancel:I

    .line 690
    .line 691
    invoke-static {v1, v8, v0}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 692
    .line 693
    .line 694
    move-result-object v1

    .line 695
    const-wide v2, 0xffdceafeL

    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 701
    .line 702
    .line 703
    move-result-wide v2

    .line 704
    const-wide v13, 0xff1576ffL

    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    invoke-static {v13, v14}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 710
    .line 711
    .line 712
    move-result-wide v4

    .line 713
    const/16 v9, 0x1b0

    .line 714
    .line 715
    const/16 v10, 0x10

    .line 716
    .line 717
    move-object/from16 v15, p0

    .line 718
    .line 719
    iget-object v6, v15, Lr4/a;->b:Lr6/a;

    .line 720
    .line 721
    const/4 v7, 0x0

    .line 722
    invoke-static/range {v1 .. v10}, Lr4/c;->a(Ljava/lang/String;JJLr6/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    .line 723
    .line 724
    .line 725
    sget v1, Lcom/zykj/mistake/R$string;->confirm:I

    .line 726
    .line 727
    invoke-static {v1, v8, v0}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 728
    .line 729
    .line 730
    move-result-object v1

    .line 731
    invoke-static {v13, v14}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 732
    .line 733
    .line 734
    move-result-wide v2

    .line 735
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 736
    .line 737
    .line 738
    move-result-wide v4

    .line 739
    invoke-static {v11}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 740
    .line 741
    .line 742
    move-result v13

    .line 743
    const/16 v17, 0xe

    .line 744
    .line 745
    const/16 v18, 0x0

    .line 746
    .line 747
    const/4 v14, 0x0

    .line 748
    const/4 v15, 0x0

    .line 749
    const/16 v16, 0x0

    .line 750
    .line 751
    move-object/from16 v0, p0

    .line 752
    .line 753
    invoke-static/range {v12 .. v18}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 754
    .line 755
    .line 756
    move-result-object v7

    .line 757
    const/16 v9, 0x61b0

    .line 758
    .line 759
    const/4 v10, 0x0

    .line 760
    iget-object v6, v0, Lr4/a;->c:Lr6/a;

    .line 761
    .line 762
    invoke-static/range {v1 .. v10}, Lr4/c;->a(Ljava/lang/String;JJLr6/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    .line 763
    .line 764
    .line 765
    invoke-static {v8}, Landroidx/collection/a;->D(Landroidx/compose/runtime/Composer;)Z

    .line 766
    .line 767
    .line 768
    move-result v1

    .line 769
    if-eqz v1, :cond_11

    .line 770
    .line 771
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 772
    .line 773
    .line 774
    goto :goto_6

    .line 775
    :cond_10
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 776
    .line 777
    .line 778
    :cond_11
    :goto_6
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 779
    .line 780
    return-object v1
.end method
