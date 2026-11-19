.class public final synthetic Lcom/zykj/mistake/feature/notebook/list/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lr6/a;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Ljava/util/Set;

.field public final synthetic e:Lcom/zykj/mistake/feature/notebook/list/JoinCollectionDialogMode;

.field public final synthetic f:Lr6/c;

.field public final synthetic g:Lr6/a;

.field public final synthetic h:Z

.field public final synthetic i:Lr6/a;


# direct methods
.method public synthetic constructor <init>(ZLr6/a;Ljava/util/List;Ljava/util/Set;Lcom/zykj/mistake/feature/notebook/list/JoinCollectionDialogMode;Lr6/c;Lr6/a;ZLr6/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/zykj/mistake/feature/notebook/list/f;->a:Z

    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/list/f;->b:Lr6/a;

    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/list/f;->c:Ljava/util/List;

    iput-object p4, p0, Lcom/zykj/mistake/feature/notebook/list/f;->d:Ljava/util/Set;

    iput-object p5, p0, Lcom/zykj/mistake/feature/notebook/list/f;->e:Lcom/zykj/mistake/feature/notebook/list/JoinCollectionDialogMode;

    iput-object p6, p0, Lcom/zykj/mistake/feature/notebook/list/f;->f:Lr6/c;

    iput-object p7, p0, Lcom/zykj/mistake/feature/notebook/list/f;->g:Lr6/a;

    iput-boolean p8, p0, Lcom/zykj/mistake/feature/notebook/list/f;->h:Z

    iput-object p9, p0, Lcom/zykj/mistake/feature/notebook/list/f;->i:Lr6/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 35

    .line 1
    move-object/from16 v6, p1

    .line 2
    .line 3
    check-cast v6, Landroidx/compose/runtime/Composer;

    .line 4
    .line 5
    move-object/from16 v1, p2

    .line 6
    .line 7
    check-cast v1, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    and-int/lit8 v2, v1, 0x3

    .line 14
    .line 15
    const/4 v3, 0x2

    .line 16
    const/4 v4, 0x1

    .line 17
    const/4 v5, 0x0

    .line 18
    if-eq v2, v3, :cond_0

    .line 19
    .line 20
    move v2, v4

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v2, v5

    .line 23
    :goto_0
    and-int/lit8 v3, v1, 0x1

    .line 24
    .line 25
    invoke-interface {v6, v2, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_13

    .line 30
    .line 31
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    const/4 v2, -0x1

    .line 38
    const-string v3, "com.zykj.mistake.feature.notebook.list.MistakeJoinCollectionDialog.<anonymous> (MistakeJoinCollectionDialog.kt:71)"

    .line 39
    .line 40
    const v7, -0x30350b79

    .line 41
    .line 42
    .line 43
    invoke-static {v7, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 47
    .line 48
    const/16 v2, 0x21c

    .line 49
    .line 50
    int-to-float v2, v2

    .line 51
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    sget-object v3, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 60
    .line 61
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 62
    .line 63
    .line 64
    move-result-wide v7

    .line 65
    const/4 v3, 0x4

    .line 66
    int-to-float v3, v3

    .line 67
    invoke-static {v3, v2, v7, v8}, Landroidx/compose/material3/c;->f(FLandroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    const/16 v3, 0x1c

    .line 72
    .line 73
    int-to-float v3, v3

    .line 74
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 79
    .line 80
    .line 81
    move-result v8

    .line 82
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    const/16 v9, 0x1a

    .line 87
    .line 88
    int-to-float v9, v9

    .line 89
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 90
    .line 91
    .line 92
    move-result v10

    .line 93
    invoke-static {v2, v7, v8, v3, v10}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    sget-object v26, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 98
    .line 99
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/ui/Alignment$Companion;->getCenterHorizontally()Landroidx/compose/ui/Alignment$Horizontal;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    sget-object v27, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 104
    .line 105
    invoke-virtual/range {v27 .. v27}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    const/16 v8, 0x30

    .line 110
    .line 111
    invoke-static {v7, v3, v6, v8}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-static {v6, v5}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 116
    .line 117
    .line 118
    move-result v7

    .line 119
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    invoke-static {v6, v2}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    sget-object v10, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 128
    .line 129
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 130
    .line 131
    .line 132
    move-result-object v11

    .line 133
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 134
    .line 135
    .line 136
    move-result-object v12

    .line 137
    if-nez v12, :cond_2

    .line 138
    .line 139
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 140
    .line 141
    .line 142
    :cond_2
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 143
    .line 144
    .line 145
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 146
    .line 147
    .line 148
    move-result v12

    .line 149
    if-eqz v12, :cond_3

    .line 150
    .line 151
    invoke-interface {v6, v11}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 152
    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_3
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 156
    .line 157
    .line 158
    :goto_1
    invoke-static {v6}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 159
    .line 160
    .line 161
    move-result-object v11

    .line 162
    invoke-static {v10, v11, v3, v11, v8}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 167
    .line 168
    .line 169
    move-result v8

    .line 170
    if-nez v8, :cond_4

    .line 171
    .line 172
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v8

    .line 176
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 177
    .line 178
    .line 179
    move-result-object v12

    .line 180
    invoke-static {v8, v12}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v8

    .line 184
    if-nez v8, :cond_5

    .line 185
    .line 186
    :cond_4
    invoke-static {v7, v11, v7, v3}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 187
    .line 188
    .line 189
    :cond_5
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    invoke-static {v11, v2, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 194
    .line 195
    .line 196
    sget-object v2, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 197
    .line 198
    const-wide v2, 0xff15171aL

    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 204
    .line 205
    .line 206
    move-result-wide v2

    .line 207
    const/16 v7, 0x10

    .line 208
    .line 209
    move v8, v5

    .line 210
    move-object/from16 v22, v6

    .line 211
    .line 212
    invoke-static {v7}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 213
    .line 214
    .line 215
    move-result-wide v5

    .line 216
    sget-object v11, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    .line 217
    .line 218
    invoke-virtual {v11}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    .line 219
    .line 220
    .line 221
    move-result-object v11

    .line 222
    const/16 v24, 0x0

    .line 223
    .line 224
    const v25, 0x1ffd2

    .line 225
    .line 226
    .line 227
    move-object v12, v1

    .line 228
    const-string v1, "\u52a0\u5165\u9519\u9898\u96c6"

    .line 229
    .line 230
    move v13, v4

    .line 231
    move-wide v3, v2

    .line 232
    const/4 v2, 0x0

    .line 233
    move v14, v7

    .line 234
    const/4 v7, 0x0

    .line 235
    move v15, v9

    .line 236
    const/4 v9, 0x0

    .line 237
    move/from16 v17, v8

    .line 238
    .line 239
    move-object/from16 v16, v10

    .line 240
    .line 241
    move-object v8, v11

    .line 242
    const-wide/16 v10, 0x0

    .line 243
    .line 244
    move-object/from16 v18, v12

    .line 245
    .line 246
    const/4 v12, 0x0

    .line 247
    move/from16 v19, v13

    .line 248
    .line 249
    const/4 v13, 0x0

    .line 250
    move/from16 v21, v14

    .line 251
    .line 252
    move/from16 v20, v15

    .line 253
    .line 254
    const-wide/16 v14, 0x0

    .line 255
    .line 256
    move-object/from16 v23, v16

    .line 257
    .line 258
    const/16 v16, 0x0

    .line 259
    .line 260
    move/from16 v28, v17

    .line 261
    .line 262
    const/16 v17, 0x0

    .line 263
    .line 264
    move-object/from16 v29, v18

    .line 265
    .line 266
    const/16 v18, 0x0

    .line 267
    .line 268
    move/from16 v30, v19

    .line 269
    .line 270
    const/16 v19, 0x0

    .line 271
    .line 272
    move/from16 v31, v20

    .line 273
    .line 274
    const/16 v20, 0x0

    .line 275
    .line 276
    move/from16 v32, v21

    .line 277
    .line 278
    const/16 v21, 0x0

    .line 279
    .line 280
    move-object/from16 v33, v23

    .line 281
    .line 282
    const v23, 0x30d86

    .line 283
    .line 284
    .line 285
    move-object/from16 v34, v29

    .line 286
    .line 287
    move/from16 v0, v30

    .line 288
    .line 289
    invoke-static/range {v1 .. v25}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 290
    .line 291
    .line 292
    move-object/from16 v6, v22

    .line 293
    .line 294
    const/4 v1, 0x0

    .line 295
    move-object/from16 v12, v34

    .line 296
    .line 297
    invoke-static {v12, v1, v0, v2}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    const/16 v2, 0x14a

    .line 302
    .line 303
    int-to-float v2, v2

    .line 304
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 305
    .line 306
    .line 307
    move-result v2

    .line 308
    const/16 v3, 0x186

    .line 309
    .line 310
    int-to-float v3, v3

    .line 311
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 312
    .line 313
    .line 314
    move-result v3

    .line 315
    invoke-static {v1, v2, v3}, Landroidx/compose/foundation/layout/SizeKt;->heightIn-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 316
    .line 317
    .line 318
    move-result-object v7

    .line 319
    const/16 v1, 0x14

    .line 320
    .line 321
    int-to-float v1, v1

    .line 322
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 323
    .line 324
    .line 325
    move-result v9

    .line 326
    const/16 v12, 0xd

    .line 327
    .line 328
    const/4 v8, 0x0

    .line 329
    const/4 v10, 0x0

    .line 330
    const/4 v11, 0x0

    .line 331
    invoke-static/range {v7 .. v13}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 332
    .line 333
    .line 334
    move-result-object v14

    .line 335
    const/4 v10, 0x0

    .line 336
    invoke-static {v10, v6, v10, v0}, Landroidx/compose/foundation/ScrollKt;->rememberScrollState(ILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/ScrollState;

    .line 337
    .line 338
    .line 339
    move-result-object v15

    .line 340
    const/16 v19, 0xe

    .line 341
    .line 342
    const/16 v17, 0x0

    .line 343
    .line 344
    invoke-static/range {v14 .. v20}, Landroidx/compose/foundation/ScrollKt;->verticalScroll$default(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    invoke-virtual/range {v27 .. v27}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 353
    .line 354
    .line 355
    move-result-object v3

    .line 356
    invoke-static {v2, v3, v6, v10}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    invoke-static {v6, v10}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 361
    .line 362
    .line 363
    move-result v3

    .line 364
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 365
    .line 366
    .line 367
    move-result-object v4

    .line 368
    invoke-static {v6, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    invoke-virtual/range {v33 .. v33}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 373
    .line 374
    .line 375
    move-result-object v5

    .line 376
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 377
    .line 378
    .line 379
    move-result-object v7

    .line 380
    if-nez v7, :cond_6

    .line 381
    .line 382
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 383
    .line 384
    .line 385
    :cond_6
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 386
    .line 387
    .line 388
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 389
    .line 390
    .line 391
    move-result v7

    .line 392
    if-eqz v7, :cond_7

    .line 393
    .line 394
    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 395
    .line 396
    .line 397
    goto :goto_2

    .line 398
    :cond_7
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 399
    .line 400
    .line 401
    :goto_2
    invoke-static {v6}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 402
    .line 403
    .line 404
    move-result-object v5

    .line 405
    move-object/from16 v7, v33

    .line 406
    .line 407
    invoke-static {v7, v5, v2, v5, v4}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 408
    .line 409
    .line 410
    move-result-object v2

    .line 411
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 412
    .line 413
    .line 414
    move-result v4

    .line 415
    if-nez v4, :cond_8

    .line 416
    .line 417
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v4

    .line 421
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 422
    .line 423
    .line 424
    move-result-object v8

    .line 425
    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    move-result v4

    .line 429
    if-nez v4, :cond_9

    .line 430
    .line 431
    :cond_8
    invoke-static {v3, v5, v3, v2}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 432
    .line 433
    .line 434
    :cond_9
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 435
    .line 436
    .line 437
    move-result-object v2

    .line 438
    invoke-static {v5, v1, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 439
    .line 440
    .line 441
    const v1, -0x40b0d48

    .line 442
    .line 443
    .line 444
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 445
    .line 446
    .line 447
    move-object/from16 v11, p0

    .line 448
    .line 449
    iget-object v1, v11, Lcom/zykj/mistake/feature/notebook/list/f;->c:Ljava/util/List;

    .line 450
    .line 451
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 452
    .line 453
    .line 454
    move-result-object v7

    .line 455
    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 456
    .line 457
    .line 458
    move-result v1

    .line 459
    if-eqz v1, :cond_c

    .line 460
    .line 461
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v1

    .line 465
    check-cast v1, Lcom/zykj/mistake/feature/notebook/list/a;

    .line 466
    .line 467
    iget-object v2, v1, Lcom/zykj/mistake/feature/notebook/list/a;->a:Ljava/lang/String;

    .line 468
    .line 469
    iget-object v3, v11, Lcom/zykj/mistake/feature/notebook/list/f;->d:Ljava/util/Set;

    .line 470
    .line 471
    invoke-interface {v3, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 472
    .line 473
    .line 474
    move-result v2

    .line 475
    iget-object v3, v11, Lcom/zykj/mistake/feature/notebook/list/f;->f:Lr6/c;

    .line 476
    .line 477
    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 478
    .line 479
    .line 480
    move-result v4

    .line 481
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 482
    .line 483
    .line 484
    move-result v5

    .line 485
    or-int/2addr v4, v5

    .line 486
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v5

    .line 490
    if-nez v4, :cond_a

    .line 491
    .line 492
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 493
    .line 494
    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v4

    .line 498
    if-ne v5, v4, :cond_b

    .line 499
    .line 500
    :cond_a
    new-instance v5, Landroidx/navigation/e;

    .line 501
    .line 502
    const/16 v4, 0xc

    .line 503
    .line 504
    invoke-direct {v5, v4, v3, v1}, Landroidx/navigation/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 505
    .line 506
    .line 507
    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 508
    .line 509
    .line 510
    :cond_b
    move-object v4, v5

    .line 511
    check-cast v4, Lr6/a;

    .line 512
    .line 513
    move-object/from16 v22, v6

    .line 514
    .line 515
    const/4 v6, 0x0

    .line 516
    iget-object v3, v11, Lcom/zykj/mistake/feature/notebook/list/f;->e:Lcom/zykj/mistake/feature/notebook/list/JoinCollectionDialogMode;

    .line 517
    .line 518
    move-object/from16 v5, v22

    .line 519
    .line 520
    invoke-static/range {v1 .. v6}, Lcom/zykj/mistake/feature/notebook/list/j;->c(Lcom/zykj/mistake/feature/notebook/list/a;ZLcom/zykj/mistake/feature/notebook/list/JoinCollectionDialogMode;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 521
    .line 522
    .line 523
    move-object v6, v5

    .line 524
    goto :goto_3

    .line 525
    :cond_c
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 526
    .line 527
    .line 528
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 529
    .line 530
    .line 531
    iget-boolean v12, v11, Lcom/zykj/mistake/feature/notebook/list/f;->a:Z

    .line 532
    .line 533
    xor-int/lit8 v9, v12, 0x1

    .line 534
    .line 535
    sget-object v13, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 536
    .line 537
    const/16 v14, 0x10

    .line 538
    .line 539
    int-to-float v1, v14

    .line 540
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 541
    .line 542
    .line 543
    move-result v15

    .line 544
    const/16 v18, 0xd

    .line 545
    .line 546
    const/16 v19, 0x0

    .line 547
    .line 548
    const/4 v14, 0x0

    .line 549
    const/16 v16, 0x0

    .line 550
    .line 551
    const/16 v17, 0x0

    .line 552
    .line 553
    invoke-static/range {v13 .. v19}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 554
    .line 555
    .line 556
    move-result-object v1

    .line 557
    const/16 v2, 0x180

    .line 558
    .line 559
    iget-object v3, v11, Lcom/zykj/mistake/feature/notebook/list/f;->b:Lr6/a;

    .line 560
    .line 561
    invoke-static {v1, v3, v9, v6, v2}, Lcom/zykj/mistake/feature/notebook/list/j;->a(Landroidx/compose/ui/Modifier;Lr6/a;ZLandroidx/compose/runtime/Composer;I)V

    .line 562
    .line 563
    .line 564
    invoke-static/range {v31 .. v31}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 565
    .line 566
    .line 567
    move-result v15

    .line 568
    invoke-static/range {v13 .. v19}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 569
    .line 570
    .line 571
    move-result-object v1

    .line 572
    sget-object v2, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 573
    .line 574
    invoke-virtual {v2}, Landroidx/compose/foundation/layout/Arrangement;->getCenter()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 575
    .line 576
    .line 577
    move-result-object v2

    .line 578
    sget-object v3, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 579
    .line 580
    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    .line 581
    .line 582
    .line 583
    move-result-object v3

    .line 584
    const/4 v14, 0x6

    .line 585
    invoke-static {v2, v3, v6, v14}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 586
    .line 587
    .line 588
    move-result-object v2

    .line 589
    invoke-static {v6, v10}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 590
    .line 591
    .line 592
    move-result v3

    .line 593
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 594
    .line 595
    .line 596
    move-result-object v4

    .line 597
    invoke-static {v6, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 598
    .line 599
    .line 600
    move-result-object v1

    .line 601
    sget-object v5, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 602
    .line 603
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 604
    .line 605
    .line 606
    move-result-object v7

    .line 607
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 608
    .line 609
    .line 610
    move-result-object v8

    .line 611
    if-nez v8, :cond_d

    .line 612
    .line 613
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 614
    .line 615
    .line 616
    :cond_d
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 617
    .line 618
    .line 619
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 620
    .line 621
    .line 622
    move-result v8

    .line 623
    if-eqz v8, :cond_e

    .line 624
    .line 625
    invoke-interface {v6, v7}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 626
    .line 627
    .line 628
    goto :goto_4

    .line 629
    :cond_e
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 630
    .line 631
    .line 632
    :goto_4
    invoke-static {v6}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 633
    .line 634
    .line 635
    move-result-object v7

    .line 636
    invoke-static {v5, v7, v2, v7, v4}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 637
    .line 638
    .line 639
    move-result-object v2

    .line 640
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 641
    .line 642
    .line 643
    move-result v4

    .line 644
    if-nez v4, :cond_f

    .line 645
    .line 646
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 647
    .line 648
    .line 649
    move-result-object v4

    .line 650
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 651
    .line 652
    .line 653
    move-result-object v8

    .line 654
    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 655
    .line 656
    .line 657
    move-result v4

    .line 658
    if-nez v4, :cond_10

    .line 659
    .line 660
    :cond_f
    invoke-static {v3, v7, v3, v2}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 661
    .line 662
    .line 663
    :cond_10
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 664
    .line 665
    .line 666
    move-result-object v2

    .line 667
    invoke-static {v7, v1, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 668
    .line 669
    .line 670
    sget-object v1, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 671
    .line 672
    const-wide v1, 0xffe8f1ffL

    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 678
    .line 679
    .line 680
    move-result-wide v2

    .line 681
    const-wide v15, 0xff1576ffL

    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    invoke-static/range {v15 .. v16}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 687
    .line 688
    .line 689
    move-result-wide v4

    .line 690
    const/16 v1, 0x1b6

    .line 691
    .line 692
    const-string v7, "\u53d6\u6d88"

    .line 693
    .line 694
    iget-object v8, v11, Lcom/zykj/mistake/feature/notebook/list/f;->g:Lr6/a;

    .line 695
    .line 696
    invoke-static/range {v1 .. v9}, Lcom/zykj/mistake/feature/notebook/list/j;->b(IJJLandroidx/compose/runtime/Composer;Ljava/lang/String;Lr6/a;Z)V

    .line 697
    .line 698
    .line 699
    const/16 v1, 0x28

    .line 700
    .line 701
    int-to-float v1, v1

    .line 702
    invoke-static {v1, v13, v6, v14}, Landroidx/compose/material3/c;->s(FLandroidx/compose/ui/Modifier$Companion;Landroidx/compose/runtime/Composer;I)V

    .line 703
    .line 704
    .line 705
    if-eqz v12, :cond_11

    .line 706
    .line 707
    const-string v1, "\u52a0\u5165\u4e2d..."

    .line 708
    .line 709
    :goto_5
    move-object v7, v1

    .line 710
    goto :goto_6

    .line 711
    :cond_11
    const-string v1, "\u786e\u8ba4"

    .line 712
    .line 713
    goto :goto_5

    .line 714
    :goto_6
    invoke-static/range {v15 .. v16}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 715
    .line 716
    .line 717
    move-result-wide v2

    .line 718
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 719
    .line 720
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 721
    .line 722
    .line 723
    move-result-wide v4

    .line 724
    if-nez v12, :cond_12

    .line 725
    .line 726
    iget-boolean v1, v11, Lcom/zykj/mistake/feature/notebook/list/f;->h:Z

    .line 727
    .line 728
    if-eqz v1, :cond_12

    .line 729
    .line 730
    move v9, v0

    .line 731
    goto :goto_7

    .line 732
    :cond_12
    move v9, v10

    .line 733
    :goto_7
    const/16 v1, 0x1b0

    .line 734
    .line 735
    iget-object v8, v11, Lcom/zykj/mistake/feature/notebook/list/f;->i:Lr6/a;

    .line 736
    .line 737
    invoke-static/range {v1 .. v9}, Lcom/zykj/mistake/feature/notebook/list/j;->b(IJJLandroidx/compose/runtime/Composer;Ljava/lang/String;Lr6/a;Z)V

    .line 738
    .line 739
    .line 740
    invoke-static {v6}, Landroidx/collection/a;->D(Landroidx/compose/runtime/Composer;)Z

    .line 741
    .line 742
    .line 743
    move-result v0

    .line 744
    if-eqz v0, :cond_14

    .line 745
    .line 746
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 747
    .line 748
    .line 749
    goto :goto_8

    .line 750
    :cond_13
    move-object/from16 v11, p0

    .line 751
    .line 752
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 753
    .line 754
    .line 755
    :cond_14
    :goto_8
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 756
    .line 757
    return-object v0
.end method
