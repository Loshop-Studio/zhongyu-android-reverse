.class public abstract Lcom/zykj/mistake/feature/notebook/list/i1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:J

.field public static final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide v0, 0xff1576ffL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    sput-wide v0, Lcom/zykj/mistake/feature/notebook/list/i1;->a:J

    .line 11
    .line 12
    const/16 v0, 0x46

    .line 13
    .line 14
    int-to-float v0, v0

    .line 15
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    sput v0, Lcom/zykj/mistake/feature/notebook/list/i1;->b:F

    .line 20
    .line 21
    return-void
.end method

.method public static final a(Lp4/b;ZZLr6/a;Lr6/a;Landroidx/compose/runtime/Composer;I)V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v2, p1

    .line 4
    .line 5
    move/from16 v3, p2

    .line 6
    .line 7
    move/from16 v6, p6

    .line 8
    .line 9
    const v0, -0x6cdb58d2

    .line 10
    .line 11
    .line 12
    move-object/from16 v4, p5

    .line 13
    .line 14
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    and-int/lit8 v5, v6, 0x6

    .line 19
    .line 20
    const/4 v7, 0x4

    .line 21
    if-nez v5, :cond_1

    .line 22
    .line 23
    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-eqz v5, :cond_0

    .line 28
    .line 29
    move v5, v7

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v5, 0x2

    .line 32
    :goto_0
    or-int/2addr v5, v6

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v5, v6

    .line 35
    :goto_1
    and-int/lit8 v8, v6, 0x30

    .line 36
    .line 37
    if-nez v8, :cond_3

    .line 38
    .line 39
    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    if-eqz v8, :cond_2

    .line 44
    .line 45
    const/16 v8, 0x20

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/16 v8, 0x10

    .line 49
    .line 50
    :goto_2
    or-int/2addr v5, v8

    .line 51
    :cond_3
    and-int/lit16 v8, v6, 0x180

    .line 52
    .line 53
    if-nez v8, :cond_5

    .line 54
    .line 55
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 56
    .line 57
    .line 58
    move-result v8

    .line 59
    if-eqz v8, :cond_4

    .line 60
    .line 61
    const/16 v8, 0x100

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_4
    const/16 v8, 0x80

    .line 65
    .line 66
    :goto_3
    or-int/2addr v5, v8

    .line 67
    :cond_5
    and-int/lit16 v8, v6, 0xc00

    .line 68
    .line 69
    if-nez v8, :cond_7

    .line 70
    .line 71
    move-object/from16 v8, p3

    .line 72
    .line 73
    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v9

    .line 77
    if-eqz v9, :cond_6

    .line 78
    .line 79
    const/16 v9, 0x800

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_6
    const/16 v9, 0x400

    .line 83
    .line 84
    :goto_4
    or-int/2addr v5, v9

    .line 85
    goto :goto_5

    .line 86
    :cond_7
    move-object/from16 v8, p3

    .line 87
    .line 88
    :goto_5
    and-int/lit16 v9, v6, 0x6000

    .line 89
    .line 90
    move-object/from16 v14, p4

    .line 91
    .line 92
    if-nez v9, :cond_9

    .line 93
    .line 94
    invoke-interface {v4, v14}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v9

    .line 98
    if-eqz v9, :cond_8

    .line 99
    .line 100
    const/16 v9, 0x4000

    .line 101
    .line 102
    goto :goto_6

    .line 103
    :cond_8
    const/16 v9, 0x2000

    .line 104
    .line 105
    :goto_6
    or-int/2addr v5, v9

    .line 106
    :cond_9
    and-int/lit16 v9, v5, 0x2493

    .line 107
    .line 108
    const/16 v10, 0x2492

    .line 109
    .line 110
    const/4 v11, 0x1

    .line 111
    if-eq v9, v10, :cond_a

    .line 112
    .line 113
    move v9, v11

    .line 114
    goto :goto_7

    .line 115
    :cond_a
    const/4 v9, 0x0

    .line 116
    :goto_7
    and-int/lit8 v10, v5, 0x1

    .line 117
    .line 118
    invoke-interface {v4, v9, v10}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 119
    .line 120
    .line 121
    move-result v9

    .line 122
    if-eqz v9, :cond_17

    .line 123
    .line 124
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 125
    .line 126
    .line 127
    move-result v9

    .line 128
    if-eqz v9, :cond_b

    .line 129
    .line 130
    const/4 v9, -0x1

    .line 131
    const-string v10, "com.zykj.mistake.feature.notebook.list.MistakeItemCard (MistakeNotebookScreen.kt:278)"

    .line 132
    .line 133
    invoke-static {v0, v5, v9, v10}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 134
    .line 135
    .line 136
    :cond_b
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 137
    .line 138
    const/4 v9, 0x0

    .line 139
    const/4 v10, 0x0

    .line 140
    invoke-static {v0, v9, v11, v10}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 141
    .line 142
    .line 143
    move-result-object v9

    .line 144
    sget-object v13, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 145
    .line 146
    move-object v15, v13

    .line 147
    invoke-virtual {v15}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 148
    .line 149
    .line 150
    move-result-wide v12

    .line 151
    int-to-float v7, v7

    .line 152
    invoke-static {v7, v9, v12, v13}, Landroidx/compose/material3/c;->f(FLandroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    .line 153
    .line 154
    .line 155
    move-result-object v9

    .line 156
    if-eqz v3, :cond_c

    .line 157
    .line 158
    int-to-float v11, v11

    .line 159
    invoke-static {v11}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 160
    .line 161
    .line 162
    move-result v11

    .line 163
    move v12, v11

    .line 164
    const/4 v11, 0x0

    .line 165
    goto :goto_8

    .line 166
    :cond_c
    const/4 v11, 0x0

    .line 167
    int-to-float v12, v11

    .line 168
    invoke-static {v12}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 169
    .line 170
    .line 171
    move-result v12

    .line 172
    :goto_8
    if-eqz v3, :cond_d

    .line 173
    .line 174
    sget-wide v15, Lcom/zykj/mistake/feature/notebook/list/i1;->a:J

    .line 175
    .line 176
    :goto_9
    move-wide v10, v15

    .line 177
    goto :goto_a

    .line 178
    :cond_d
    invoke-virtual {v15}, Landroidx/compose/ui/graphics/Color$Companion;->getTransparent-0d7_KjU()J

    .line 179
    .line 180
    .line 181
    move-result-wide v15

    .line 182
    goto :goto_9

    .line 183
    :goto_a
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 184
    .line 185
    .line 186
    move-result v7

    .line 187
    invoke-static {v7}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 188
    .line 189
    .line 190
    move-result-object v7

    .line 191
    invoke-static {v9, v12, v10, v11, v7}, Landroidx/compose/foundation/BorderKt;->border-xT4_qwU(Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 192
    .line 193
    .line 194
    move-result-object v9

    .line 195
    const/16 v18, 0x6f

    .line 196
    .line 197
    const/16 v19, 0x0

    .line 198
    .line 199
    const/4 v10, 0x0

    .line 200
    const/4 v11, 0x0

    .line 201
    const/4 v12, 0x0

    .line 202
    const/4 v7, 0x0

    .line 203
    const/4 v13, 0x0

    .line 204
    const/4 v15, 0x0

    .line 205
    const/16 v16, 0x0

    .line 206
    .line 207
    move-object/from16 v17, v8

    .line 208
    .line 209
    move v8, v7

    .line 210
    const/4 v7, 0x0

    .line 211
    invoke-static/range {v9 .. v19}, Landroidx/compose/foundation/ClickableKt;->combinedClickable-f5TDLPQ$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Ljava/lang/String;Lr6/a;Lr6/a;ZLr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 212
    .line 213
    .line 214
    move-result-object v9

    .line 215
    const/16 v10, 0xc

    .line 216
    .line 217
    int-to-float v10, v10

    .line 218
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 219
    .line 220
    .line 221
    move-result v10

    .line 222
    const/16 v11, 0xa

    .line 223
    .line 224
    int-to-float v11, v11

    .line 225
    invoke-static {v11}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 226
    .line 227
    .line 228
    move-result v11

    .line 229
    invoke-static {v9, v10, v11}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 230
    .line 231
    .line 232
    move-result-object v9

    .line 233
    sget-object v10, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 234
    .line 235
    invoke-virtual {v10}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 236
    .line 237
    .line 238
    move-result-object v11

    .line 239
    invoke-static {v11, v8}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 240
    .line 241
    .line 242
    move-result-object v11

    .line 243
    invoke-static {v4, v8}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 244
    .line 245
    .line 246
    move-result v12

    .line 247
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 248
    .line 249
    .line 250
    move-result-object v13

    .line 251
    invoke-static {v4, v9}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 252
    .line 253
    .line 254
    move-result-object v9

    .line 255
    sget-object v14, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 256
    .line 257
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 258
    .line 259
    .line 260
    move-result-object v15

    .line 261
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 262
    .line 263
    .line 264
    move-result-object v16

    .line 265
    if-nez v16, :cond_e

    .line 266
    .line 267
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 268
    .line 269
    .line 270
    :cond_e
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 271
    .line 272
    .line 273
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 274
    .line 275
    .line 276
    move-result v16

    .line 277
    if-eqz v16, :cond_f

    .line 278
    .line 279
    invoke-interface {v4, v15}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 280
    .line 281
    .line 282
    goto :goto_b

    .line 283
    :cond_f
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 284
    .line 285
    .line 286
    :goto_b
    invoke-static {v4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 287
    .line 288
    .line 289
    move-result-object v15

    .line 290
    invoke-static {v14, v15, v11, v15, v13}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 291
    .line 292
    .line 293
    move-result-object v11

    .line 294
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 295
    .line 296
    .line 297
    move-result v13

    .line 298
    if-nez v13, :cond_10

    .line 299
    .line 300
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v13

    .line 304
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 305
    .line 306
    .line 307
    move-result-object v7

    .line 308
    invoke-static {v13, v7}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    move-result v7

    .line 312
    if-nez v7, :cond_11

    .line 313
    .line 314
    :cond_10
    invoke-static {v12, v15, v12, v11}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 315
    .line 316
    .line 317
    :cond_11
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 318
    .line 319
    .line 320
    move-result-object v7

    .line 321
    invoke-static {v15, v9, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 322
    .line 323
    .line 324
    sget-object v7, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 325
    .line 326
    sget-object v9, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 327
    .line 328
    invoke-virtual {v9}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 329
    .line 330
    .line 331
    move-result-object v9

    .line 332
    invoke-virtual {v10}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 333
    .line 334
    .line 335
    move-result-object v11

    .line 336
    invoke-static {v9, v11, v4, v8}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 337
    .line 338
    .line 339
    move-result-object v9

    .line 340
    invoke-static {v4, v8}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 341
    .line 342
    .line 343
    move-result v11

    .line 344
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 345
    .line 346
    .line 347
    move-result-object v12

    .line 348
    invoke-static {v4, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 349
    .line 350
    .line 351
    move-result-object v13

    .line 352
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 353
    .line 354
    .line 355
    move-result-object v15

    .line 356
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 357
    .line 358
    .line 359
    move-result-object v16

    .line 360
    if-nez v16, :cond_12

    .line 361
    .line 362
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 363
    .line 364
    .line 365
    :cond_12
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 366
    .line 367
    .line 368
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 369
    .line 370
    .line 371
    move-result v16

    .line 372
    if-eqz v16, :cond_13

    .line 373
    .line 374
    invoke-interface {v4, v15}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 375
    .line 376
    .line 377
    goto :goto_c

    .line 378
    :cond_13
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 379
    .line 380
    .line 381
    :goto_c
    invoke-static {v4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 382
    .line 383
    .line 384
    move-result-object v15

    .line 385
    invoke-static {v14, v15, v9, v15, v12}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 386
    .line 387
    .line 388
    move-result-object v9

    .line 389
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 390
    .line 391
    .line 392
    move-result v12

    .line 393
    if-nez v12, :cond_14

    .line 394
    .line 395
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v12

    .line 399
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 400
    .line 401
    .line 402
    move-result-object v8

    .line 403
    invoke-static {v12, v8}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    move-result v8

    .line 407
    if-nez v8, :cond_15

    .line 408
    .line 409
    :cond_14
    invoke-static {v11, v15, v11, v9}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 410
    .line 411
    .line 412
    :cond_15
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 413
    .line 414
    .line 415
    move-result-object v8

    .line 416
    invoke-static {v15, v13, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 417
    .line 418
    .line 419
    sget-object v8, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 420
    .line 421
    iget-object v8, v1, Lp4/b;->i:Ljava/lang/String;

    .line 422
    .line 423
    const/4 v11, 0x0

    .line 424
    invoke-static {v8, v4, v11}, Lcom/zykj/mistake/feature/notebook/list/i1;->g(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    .line 425
    .line 426
    .line 427
    and-int/lit8 v8, v5, 0x7e

    .line 428
    .line 429
    const/4 v9, 0x0

    .line 430
    invoke-static {v1, v2, v9, v4, v8}, Lcom/zykj/mistake/feature/notebook/list/d;->a(Lp4/b;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 431
    .line 432
    .line 433
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 434
    .line 435
    .line 436
    if-eqz v2, :cond_16

    .line 437
    .line 438
    const v8, -0x66cd4145

    .line 439
    .line 440
    .line 441
    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v10}, Landroidx/compose/ui/Alignment$Companion;->getBottomEnd()Landroidx/compose/ui/Alignment;

    .line 445
    .line 446
    .line 447
    move-result-object v8

    .line 448
    invoke-interface {v7, v0, v8}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    shr-int/lit8 v5, v5, 0x6

    .line 453
    .line 454
    and-int/lit8 v5, v5, 0xe

    .line 455
    .line 456
    invoke-static {v3, v0, v4, v5}, Lcom/zykj/mistake/feature/notebook/list/i1;->i(ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 457
    .line 458
    .line 459
    :goto_d
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 460
    .line 461
    .line 462
    goto :goto_e

    .line 463
    :cond_16
    const v0, -0x677eafe6

    .line 464
    .line 465
    .line 466
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 467
    .line 468
    .line 469
    goto :goto_d

    .line 470
    :goto_e
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 471
    .line 472
    .line 473
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 474
    .line 475
    .line 476
    move-result v0

    .line 477
    if-eqz v0, :cond_18

    .line 478
    .line 479
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 480
    .line 481
    .line 482
    goto :goto_f

    .line 483
    :cond_17
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 484
    .line 485
    .line 486
    :cond_18
    :goto_f
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 487
    .line 488
    .line 489
    move-result-object v8

    .line 490
    if-eqz v8, :cond_19

    .line 491
    .line 492
    new-instance v0, Lcom/zykj/mistake/feature/collection/list/w;

    .line 493
    .line 494
    const/4 v7, 0x1

    .line 495
    move-object/from16 v4, p3

    .line 496
    .line 497
    move-object/from16 v5, p4

    .line 498
    .line 499
    invoke-direct/range {v0 .. v7}, Lcom/zykj/mistake/feature/collection/list/w;-><init>(Ljava/lang/Object;ZZLr6/a;Lr6/a;II)V

    .line 500
    .line 501
    .line 502
    invoke-interface {v8, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 503
    .line 504
    .line 505
    :cond_19
    return-void
.end method

.method public static final b(ILjava/lang/String;FZLr6/a;Landroidx/compose/runtime/Composer;II)V
    .locals 15

    .line 1
    move/from16 v6, p6

    .line 2
    .line 3
    const v0, -0x4a374996

    .line 4
    .line 5
    .line 6
    move-object/from16 v1, p5

    .line 7
    .line 8
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 9
    .line 10
    .line 11
    move-result-object v12

    .line 12
    and-int/lit8 v1, v6, 0x6

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    invoke-interface {v12, p0}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    const/4 v1, 0x4

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v1, 0x2

    .line 25
    :goto_0
    or-int/2addr v1, v6

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move v1, v6

    .line 28
    :goto_1
    and-int/lit8 v2, v6, 0x30

    .line 29
    .line 30
    move-object/from16 v8, p1

    .line 31
    .line 32
    if-nez v2, :cond_3

    .line 33
    .line 34
    invoke-interface {v12, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    const/16 v2, 0x20

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_2
    const/16 v2, 0x10

    .line 44
    .line 45
    :goto_2
    or-int/2addr v1, v2

    .line 46
    :cond_3
    and-int/lit8 v2, p7, 0x4

    .line 47
    .line 48
    if-eqz v2, :cond_5

    .line 49
    .line 50
    or-int/lit16 v1, v1, 0x180

    .line 51
    .line 52
    :cond_4
    move/from16 v3, p2

    .line 53
    .line 54
    goto :goto_4

    .line 55
    :cond_5
    and-int/lit16 v3, v6, 0x180

    .line 56
    .line 57
    if-nez v3, :cond_4

    .line 58
    .line 59
    move/from16 v3, p2

    .line 60
    .line 61
    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    if-eqz v4, :cond_6

    .line 66
    .line 67
    const/16 v4, 0x100

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_6
    const/16 v4, 0x80

    .line 71
    .line 72
    :goto_3
    or-int/2addr v1, v4

    .line 73
    :goto_4
    and-int/lit8 v4, p7, 0x8

    .line 74
    .line 75
    if-eqz v4, :cond_8

    .line 76
    .line 77
    or-int/lit16 v1, v1, 0xc00

    .line 78
    .line 79
    :cond_7
    move/from16 v5, p3

    .line 80
    .line 81
    goto :goto_6

    .line 82
    :cond_8
    and-int/lit16 v5, v6, 0xc00

    .line 83
    .line 84
    if-nez v5, :cond_7

    .line 85
    .line 86
    move/from16 v5, p3

    .line 87
    .line 88
    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 89
    .line 90
    .line 91
    move-result v7

    .line 92
    if-eqz v7, :cond_9

    .line 93
    .line 94
    const/16 v7, 0x800

    .line 95
    .line 96
    goto :goto_5

    .line 97
    :cond_9
    const/16 v7, 0x400

    .line 98
    .line 99
    :goto_5
    or-int/2addr v1, v7

    .line 100
    :goto_6
    and-int/lit16 v7, v6, 0x6000

    .line 101
    .line 102
    move-object/from16 v11, p4

    .line 103
    .line 104
    if-nez v7, :cond_b

    .line 105
    .line 106
    invoke-interface {v12, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v7

    .line 110
    if-eqz v7, :cond_a

    .line 111
    .line 112
    const/16 v7, 0x4000

    .line 113
    .line 114
    goto :goto_7

    .line 115
    :cond_a
    const/16 v7, 0x2000

    .line 116
    .line 117
    :goto_7
    or-int/2addr v1, v7

    .line 118
    :cond_b
    and-int/lit16 v7, v1, 0x2493

    .line 119
    .line 120
    const/16 v9, 0x2492

    .line 121
    .line 122
    const/4 v10, 0x1

    .line 123
    if-eq v7, v9, :cond_c

    .line 124
    .line 125
    move v7, v10

    .line 126
    goto :goto_8

    .line 127
    :cond_c
    const/4 v7, 0x0

    .line 128
    :goto_8
    and-int/lit8 v9, v1, 0x1

    .line 129
    .line 130
    invoke-interface {v12, v7, v9}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 131
    .line 132
    .line 133
    move-result v7

    .line 134
    if-eqz v7, :cond_11

    .line 135
    .line 136
    if-eqz v2, :cond_d

    .line 137
    .line 138
    const/high16 v2, 0x3f800000    # 1.0f

    .line 139
    .line 140
    move v9, v2

    .line 141
    goto :goto_9

    .line 142
    :cond_d
    move v9, v3

    .line 143
    :goto_9
    if-eqz v4, :cond_e

    .line 144
    .line 145
    goto :goto_a

    .line 146
    :cond_e
    move v10, v5

    .line 147
    :goto_a
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    if-eqz v2, :cond_f

    .line 152
    .line 153
    const/4 v2, -0x1

    .line 154
    const-string v3, "com.zykj.mistake.feature.notebook.list.MistakeNotebookAction (MistakeNotebookScreen.kt:575)"

    .line 155
    .line 156
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 157
    .line 158
    .line 159
    :cond_f
    const v0, 0xfffe

    .line 160
    .line 161
    .line 162
    and-int v13, v1, v0

    .line 163
    .line 164
    const/4 v14, 0x0

    .line 165
    move v7, p0

    .line 166
    invoke-static/range {v7 .. v14}, Ly4/f;->a(ILjava/lang/String;FZLr6/a;Landroidx/compose/runtime/Composer;II)V

    .line 167
    .line 168
    .line 169
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    if-eqz v0, :cond_10

    .line 174
    .line 175
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 176
    .line 177
    .line 178
    :cond_10
    move v3, v9

    .line 179
    move v4, v10

    .line 180
    goto :goto_b

    .line 181
    :cond_11
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 182
    .line 183
    .line 184
    move v4, v5

    .line 185
    :goto_b
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 186
    .line 187
    .line 188
    move-result-object v9

    .line 189
    if-eqz v9, :cond_12

    .line 190
    .line 191
    new-instance v0, Lcom/zykj/mistake/feature/notebook/list/f1;

    .line 192
    .line 193
    const/4 v8, 0x0

    .line 194
    move v1, p0

    .line 195
    move-object/from16 v2, p1

    .line 196
    .line 197
    move-object/from16 v5, p4

    .line 198
    .line 199
    move/from16 v7, p7

    .line 200
    .line 201
    invoke-direct/range {v0 .. v8}, Lcom/zykj/mistake/feature/notebook/list/f1;-><init>(ILjava/lang/String;FZLr6/a;III)V

    .line 202
    .line 203
    .line 204
    invoke-interface {v9, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 205
    .line 206
    .line 207
    :cond_12
    return-void
.end method

.method public static final c(ZLr6/a;Landroidx/compose/runtime/Composer;I)V
    .locals 34

    .line 1
    move/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v5, p1

    .line 4
    .line 5
    move/from16 v8, p3

    .line 6
    .line 7
    const v1, -0x1f361d20

    .line 8
    .line 9
    .line 10
    move-object/from16 v2, p2

    .line 11
    .line 12
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v9

    .line 16
    and-int/lit8 v2, v8, 0x6

    .line 17
    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    const/4 v2, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v2, 0x2

    .line 29
    :goto_0
    or-int/2addr v2, v8

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v2, v8

    .line 32
    :goto_1
    and-int/lit8 v3, v8, 0x30

    .line 33
    .line 34
    if-nez v3, :cond_3

    .line 35
    .line 36
    invoke-interface {v9, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    const/16 v3, 0x20

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    const/16 v3, 0x10

    .line 46
    .line 47
    :goto_2
    or-int/2addr v2, v3

    .line 48
    :cond_3
    and-int/lit8 v3, v2, 0x13

    .line 49
    .line 50
    const/4 v10, 0x1

    .line 51
    const/16 v11, 0x12

    .line 52
    .line 53
    const/4 v12, 0x0

    .line 54
    if-eq v3, v11, :cond_4

    .line 55
    .line 56
    move v3, v10

    .line 57
    goto :goto_3

    .line 58
    :cond_4
    move v3, v12

    .line 59
    :goto_3
    and-int/lit8 v4, v2, 0x1

    .line 60
    .line 61
    invoke-interface {v9, v3, v4}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_11

    .line 66
    .line 67
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_5

    .line 72
    .line 73
    const/4 v3, -0x1

    .line 74
    const-string v4, "com.zykj.mistake.feature.notebook.list.MistakeNotebookEmptyContent (MistakeNotebookScreen.kt:532)"

    .line 75
    .line 76
    invoke-static {v1, v2, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :cond_5
    sget-object v13, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 80
    .line 81
    const/4 v1, 0x0

    .line 82
    const/4 v2, 0x0

    .line 83
    invoke-static {v13, v1, v10, v2}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    sget-object v14, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 88
    .line 89
    invoke-virtual {v14}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-static {v2, v12}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-static {v9, v12}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    invoke-static {v9, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    sget-object v15, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 110
    .line 111
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    if-nez v7, :cond_6

    .line 120
    .line 121
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 122
    .line 123
    .line 124
    :cond_6
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 125
    .line 126
    .line 127
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 128
    .line 129
    .line 130
    move-result v7

    .line 131
    if-eqz v7, :cond_7

    .line 132
    .line 133
    invoke-interface {v9, v6}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 134
    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_7
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 138
    .line 139
    .line 140
    :goto_4
    invoke-static {v9}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    invoke-static {v15, v6, v2, v6, v4}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 149
    .line 150
    .line 151
    move-result v4

    .line 152
    if-nez v4, :cond_8

    .line 153
    .line 154
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 159
    .line 160
    .line 161
    move-result-object v7

    .line 162
    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v4

    .line 166
    if-nez v4, :cond_9

    .line 167
    .line 168
    :cond_8
    invoke-static {v3, v6, v3, v2}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 169
    .line 170
    .line 171
    :cond_9
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    invoke-static {v6, v1, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 176
    .line 177
    .line 178
    sget-object v1, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 179
    .line 180
    if-eqz v0, :cond_a

    .line 181
    .line 182
    const/4 v6, 0x7

    .line 183
    const/4 v7, 0x0

    .line 184
    const/4 v2, 0x0

    .line 185
    const/4 v3, 0x0

    .line 186
    const/4 v4, 0x0

    .line 187
    move-object v1, v13

    .line 188
    invoke-static/range {v1 .. v7}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 189
    .line 190
    .line 191
    move-result-object v13

    .line 192
    goto :goto_5

    .line 193
    :cond_a
    move-object v1, v13

    .line 194
    :goto_5
    invoke-virtual {v14}, Landroidx/compose/ui/Alignment$Companion;->getCenterHorizontally()Landroidx/compose/ui/Alignment$Horizontal;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    sget-object v3, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 199
    .line 200
    invoke-virtual {v3}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    const/16 v4, 0x30

    .line 205
    .line 206
    invoke-static {v3, v2, v9, v4}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    invoke-static {v9, v12}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 215
    .line 216
    .line 217
    move-result-object v4

    .line 218
    invoke-static {v9, v13}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 219
    .line 220
    .line 221
    move-result-object v6

    .line 222
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 223
    .line 224
    .line 225
    move-result-object v7

    .line 226
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 227
    .line 228
    .line 229
    move-result-object v13

    .line 230
    if-nez v13, :cond_b

    .line 231
    .line 232
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 233
    .line 234
    .line 235
    :cond_b
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 236
    .line 237
    .line 238
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 239
    .line 240
    .line 241
    move-result v13

    .line 242
    if-eqz v13, :cond_c

    .line 243
    .line 244
    invoke-interface {v9, v7}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 245
    .line 246
    .line 247
    goto :goto_6

    .line 248
    :cond_c
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 249
    .line 250
    .line 251
    :goto_6
    invoke-static {v9}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 252
    .line 253
    .line 254
    move-result-object v7

    .line 255
    invoke-static {v15, v7, v2, v7, v4}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    if-nez v4, :cond_d

    .line 264
    .line 265
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v4

    .line 269
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 270
    .line 271
    .line 272
    move-result-object v13

    .line 273
    invoke-static {v4, v13}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result v4

    .line 277
    if-nez v4, :cond_e

    .line 278
    .line 279
    :cond_d
    invoke-static {v3, v7, v3, v2}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 280
    .line 281
    .line 282
    :cond_e
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    invoke-static {v7, v6, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 287
    .line 288
    .line 289
    sget-object v2, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 290
    .line 291
    sget v2, Lcom/zykj/mistake/R$drawable;->ic_no_data:I

    .line 292
    .line 293
    invoke-static {v2, v9, v12}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    const/16 v3, 0x64

    .line 298
    .line 299
    int-to-float v3, v3

    .line 300
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 301
    .line 302
    .line 303
    move-result v3

    .line 304
    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 305
    .line 306
    .line 307
    move-result-object v3

    .line 308
    const/16 v17, 0x1b0

    .line 309
    .line 310
    const/16 v18, 0x78

    .line 311
    .line 312
    move v4, v10

    .line 313
    const-string v10, "\u6682\u65e0\u9519\u9898"

    .line 314
    .line 315
    const/4 v12, 0x0

    .line 316
    const/4 v13, 0x0

    .line 317
    const/4 v14, 0x0

    .line 318
    const/4 v15, 0x0

    .line 319
    move-object/from16 v16, v9

    .line 320
    .line 321
    move-object v9, v2

    .line 322
    move v2, v11

    .line 323
    move-object v11, v3

    .line 324
    invoke-static/range {v9 .. v18}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 325
    .line 326
    .line 327
    move-object/from16 v3, v16

    .line 328
    .line 329
    if-eqz v0, :cond_f

    .line 330
    .line 331
    const v6, -0x57e56fa6

    .line 332
    .line 333
    .line 334
    invoke-interface {v3, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 335
    .line 336
    .line 337
    const-wide v6, 0xff1576ffL

    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    invoke-static {v6, v7}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 343
    .line 344
    .line 345
    move-result-wide v11

    .line 346
    const/16 v6, 0xf

    .line 347
    .line 348
    invoke-static {v6}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 349
    .line 350
    .line 351
    move-result-wide v6

    .line 352
    int-to-float v9, v2

    .line 353
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 354
    .line 355
    .line 356
    move-result v15

    .line 357
    const/16 v18, 0xd

    .line 358
    .line 359
    const/16 v19, 0x0

    .line 360
    .line 361
    const/4 v14, 0x0

    .line 362
    const/16 v16, 0x0

    .line 363
    .line 364
    const/16 v17, 0x0

    .line 365
    .line 366
    move-object v13, v1

    .line 367
    invoke-static/range {v13 .. v19}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 368
    .line 369
    .line 370
    move-result-object v10

    .line 371
    const/16 v32, 0x0

    .line 372
    .line 373
    const v33, 0x1fff0

    .line 374
    .line 375
    .line 376
    const-string v9, "\u70b9\u51fb\u65b0\u589e"

    .line 377
    .line 378
    const/4 v15, 0x0

    .line 379
    const/16 v16, 0x0

    .line 380
    .line 381
    const/16 v17, 0x0

    .line 382
    .line 383
    const-wide/16 v18, 0x0

    .line 384
    .line 385
    const/16 v20, 0x0

    .line 386
    .line 387
    const/16 v21, 0x0

    .line 388
    .line 389
    const-wide/16 v22, 0x0

    .line 390
    .line 391
    const/16 v24, 0x0

    .line 392
    .line 393
    const/16 v25, 0x0

    .line 394
    .line 395
    const/16 v26, 0x0

    .line 396
    .line 397
    const/16 v27, 0x0

    .line 398
    .line 399
    const/16 v28, 0x0

    .line 400
    .line 401
    const/16 v29, 0x0

    .line 402
    .line 403
    const/16 v31, 0xdb6

    .line 404
    .line 405
    move-object/from16 v30, v3

    .line 406
    .line 407
    move-wide v13, v6

    .line 408
    invoke-static/range {v9 .. v33}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 409
    .line 410
    .line 411
    :goto_7
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 412
    .line 413
    .line 414
    goto :goto_8

    .line 415
    :cond_f
    const v6, -0x591d003a

    .line 416
    .line 417
    .line 418
    invoke-interface {v3, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 419
    .line 420
    .line 421
    goto :goto_7

    .line 422
    :goto_8
    if-eqz v0, :cond_10

    .line 423
    .line 424
    const-string v6, "\u5f53\u524d\u65e0\u4efb\u4f55\u9519\u9898"

    .line 425
    .line 426
    :goto_9
    move-object v9, v6

    .line 427
    goto :goto_a

    .line 428
    :cond_10
    const-string v6, "\u6682\u65e0\u5185\u5bb9"

    .line 429
    .line 430
    goto :goto_9

    .line 431
    :goto_a
    const-wide v6, 0xff666666L

    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    invoke-static {v6, v7}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 437
    .line 438
    .line 439
    move-result-wide v11

    .line 440
    const/16 v6, 0xc

    .line 441
    .line 442
    invoke-static {v6}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 443
    .line 444
    .line 445
    move-result-wide v6

    .line 446
    int-to-float v2, v2

    .line 447
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 448
    .line 449
    .line 450
    move-result v15

    .line 451
    const/16 v18, 0xd

    .line 452
    .line 453
    const/16 v19, 0x0

    .line 454
    .line 455
    const/4 v14, 0x0

    .line 456
    const/16 v16, 0x0

    .line 457
    .line 458
    const/16 v17, 0x0

    .line 459
    .line 460
    move-object v13, v1

    .line 461
    invoke-static/range {v13 .. v19}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 462
    .line 463
    .line 464
    move-result-object v10

    .line 465
    const/16 v32, 0x0

    .line 466
    .line 467
    const v33, 0x1fff0

    .line 468
    .line 469
    .line 470
    const/4 v15, 0x0

    .line 471
    const/16 v16, 0x0

    .line 472
    .line 473
    const/16 v17, 0x0

    .line 474
    .line 475
    const-wide/16 v18, 0x0

    .line 476
    .line 477
    const/16 v20, 0x0

    .line 478
    .line 479
    const/16 v21, 0x0

    .line 480
    .line 481
    const-wide/16 v22, 0x0

    .line 482
    .line 483
    const/16 v24, 0x0

    .line 484
    .line 485
    const/16 v25, 0x0

    .line 486
    .line 487
    const/16 v26, 0x0

    .line 488
    .line 489
    const/16 v27, 0x0

    .line 490
    .line 491
    const/16 v28, 0x0

    .line 492
    .line 493
    const/16 v29, 0x0

    .line 494
    .line 495
    const/16 v31, 0xdb0

    .line 496
    .line 497
    move-object/from16 v30, v3

    .line 498
    .line 499
    move-wide v13, v6

    .line 500
    invoke-static/range {v9 .. v33}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 501
    .line 502
    .line 503
    invoke-static/range {v30 .. v30}, Landroidx/collection/a;->D(Landroidx/compose/runtime/Composer;)Z

    .line 504
    .line 505
    .line 506
    move-result v1

    .line 507
    if-eqz v1, :cond_12

    .line 508
    .line 509
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 510
    .line 511
    .line 512
    goto :goto_b

    .line 513
    :cond_11
    move-object/from16 v30, v9

    .line 514
    .line 515
    move v4, v10

    .line 516
    invoke-interface/range {v30 .. v30}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 517
    .line 518
    .line 519
    :cond_12
    :goto_b
    invoke-interface/range {v30 .. v30}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 520
    .line 521
    .line 522
    move-result-object v1

    .line 523
    if-eqz v1, :cond_13

    .line 524
    .line 525
    new-instance v2, Lcom/zykj/mistake/feature/notebook/detail/z;

    .line 526
    .line 527
    invoke-direct {v2, v0, v5, v8, v4}, Lcom/zykj/mistake/feature/notebook/detail/z;-><init>(ZLr6/a;II)V

    .line 528
    .line 529
    .line 530
    invoke-interface {v1, v2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 531
    .line 532
    .line 533
    :cond_13
    return-void
.end method

.method public static final d(Lcom/zykj/mistake/feature/notebook/list/e1;Lr6/c;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    move/from16 v6, p3

    .line 6
    .line 7
    const v0, 0x19b1a0a4

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p2

    .line 11
    .line 12
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v14

    .line 16
    and-int/lit8 v1, v6, 0x6

    .line 17
    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    invoke-interface {v14, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    const/4 v1, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v1, 0x2

    .line 29
    :goto_0
    or-int/2addr v1, v6

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v1, v6

    .line 32
    :goto_1
    and-int/lit8 v4, v6, 0x30

    .line 33
    .line 34
    const/16 v5, 0x20

    .line 35
    .line 36
    if-nez v4, :cond_3

    .line 37
    .line 38
    invoke-interface {v14, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    move v4, v5

    .line 45
    goto :goto_2

    .line 46
    :cond_2
    const/16 v4, 0x10

    .line 47
    .line 48
    :goto_2
    or-int/2addr v1, v4

    .line 49
    :cond_3
    and-int/lit8 v4, v1, 0x13

    .line 50
    .line 51
    const/16 v7, 0x12

    .line 52
    .line 53
    const/4 v8, 0x1

    .line 54
    const/4 v9, 0x0

    .line 55
    if-eq v4, v7, :cond_4

    .line 56
    .line 57
    move v4, v8

    .line 58
    goto :goto_3

    .line 59
    :cond_4
    move v4, v9

    .line 60
    :goto_3
    and-int/lit8 v7, v1, 0x1

    .line 61
    .line 62
    invoke-interface {v14, v4, v7}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-eqz v4, :cond_11

    .line 67
    .line 68
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-eqz v4, :cond_5

    .line 73
    .line 74
    const/4 v4, -0x1

    .line 75
    const-string v7, "com.zykj.mistake.feature.notebook.list.MistakeNotebookGrid (MistakeNotebookScreen.kt:194)"

    .line 76
    .line 77
    invoke-static {v0, v1, v4, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 78
    .line 79
    .line 80
    :cond_5
    const/4 v0, 0x3

    .line 81
    invoke-static {v9, v9, v14, v9, v0}, Landroidx/compose/foundation/lazy/grid/LazyGridStateKt;->rememberLazyGridState(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/grid/LazyGridState;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    and-int/lit8 v1, v1, 0x70

    .line 86
    .line 87
    if-ne v1, v5, :cond_6

    .line 88
    .line 89
    move v4, v8

    .line 90
    goto :goto_4

    .line 91
    :cond_6
    move v4, v9

    .line 92
    :goto_4
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    if-nez v4, :cond_7

    .line 97
    .line 98
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 99
    .line 100
    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    if-ne v7, v4, :cond_8

    .line 105
    .line 106
    :cond_7
    new-instance v7, Lcom/zykj/mistake/feature/notebook/detail/m4;

    .line 107
    .line 108
    const/4 v4, 0x3

    .line 109
    invoke-direct {v7, v3, v4}, Lcom/zykj/mistake/feature/notebook/detail/m4;-><init>(Lr6/c;I)V

    .line 110
    .line 111
    .line 112
    invoke-interface {v14, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    :cond_8
    check-cast v7, Lr6/c;

    .line 116
    .line 117
    invoke-static {v14, v7}, Lcom/zykj/mistake/utils/e;->d(Landroidx/compose/runtime/Composer;Lr6/c;)Lr6/c;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    iget-object v7, v2, Lcom/zykj/mistake/feature/notebook/list/e1;->d:Ljava/util/List;

    .line 122
    .line 123
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    invoke-interface {v14, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v10

    .line 131
    invoke-interface {v14, v7}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 132
    .line 133
    .line 134
    move-result v7

    .line 135
    or-int/2addr v7, v10

    .line 136
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v10

    .line 140
    if-nez v7, :cond_9

    .line 141
    .line 142
    sget-object v7, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 143
    .line 144
    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    if-ne v10, v7, :cond_a

    .line 149
    .line 150
    :cond_9
    new-instance v7, Landroidx/navigation/e;

    .line 151
    .line 152
    const/16 v10, 0xd

    .line 153
    .line 154
    invoke-direct {v7, v10, v0, v2}, Landroidx/navigation/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    invoke-static {v7}, Landroidx/compose/runtime/SnapshotStateKt;->derivedStateOf(Lr6/a;)Landroidx/compose/runtime/State;

    .line 158
    .line 159
    .line 160
    move-result-object v10

    .line 161
    invoke-interface {v14, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    :cond_a
    check-cast v10, Landroidx/compose/runtime/State;

    .line 165
    .line 166
    invoke-interface {v10}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v7

    .line 170
    iget-boolean v11, v2, Lcom/zykj/mistake/feature/notebook/list/e1;->e:Z

    .line 171
    .line 172
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 173
    .line 174
    .line 175
    move-result-object v11

    .line 176
    iget-boolean v12, v2, Lcom/zykj/mistake/feature/notebook/list/e1;->f:Z

    .line 177
    .line 178
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 179
    .line 180
    .line 181
    move-result-object v12

    .line 182
    iget-boolean v13, v2, Lcom/zykj/mistake/feature/notebook/list/e1;->g:Z

    .line 183
    .line 184
    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 185
    .line 186
    .line 187
    move-result-object v13

    .line 188
    iget-object v15, v2, Lcom/zykj/mistake/feature/notebook/list/e1;->d:Ljava/util/List;

    .line 189
    .line 190
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 191
    .line 192
    .line 193
    move-result v15

    .line 194
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 195
    .line 196
    .line 197
    move-result-object v15

    .line 198
    filled-new-array {v7, v11, v12, v13, v15}, [Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v7

    .line 202
    invoke-interface {v14, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v11

    .line 206
    invoke-interface {v14, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v12

    .line 210
    or-int/2addr v11, v12

    .line 211
    if-ne v1, v5, :cond_b

    .line 212
    .line 213
    move v12, v8

    .line 214
    goto :goto_5

    .line 215
    :cond_b
    move v12, v9

    .line 216
    :goto_5
    or-int/2addr v11, v12

    .line 217
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v12

    .line 221
    const/4 v13, 0x0

    .line 222
    if-nez v11, :cond_c

    .line 223
    .line 224
    sget-object v11, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 225
    .line 226
    invoke-virtual {v11}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v11

    .line 230
    if-ne v12, v11, :cond_d

    .line 231
    .line 232
    :cond_c
    new-instance v12, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookScreenKt$MistakeNotebookGrid$1$1;

    .line 233
    .line 234
    invoke-direct {v12, v10, v2, v3, v13}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookScreenKt$MistakeNotebookGrid$1$1;-><init>(Landroidx/compose/runtime/State;Lcom/zykj/mistake/feature/notebook/list/e1;Lr6/c;Lh6/c;)V

    .line 235
    .line 236
    .line 237
    invoke-interface {v14, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    :cond_d
    check-cast v12, Lr6/e;

    .line 241
    .line 242
    invoke-static {v7, v12, v14, v9}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect([Ljava/lang/Object;Lr6/e;Landroidx/compose/runtime/Composer;I)V

    .line 243
    .line 244
    .line 245
    iget-boolean v7, v2, Lcom/zykj/mistake/feature/notebook/list/e1;->e:Z

    .line 246
    .line 247
    if-ne v1, v5, :cond_e

    .line 248
    .line 249
    move v9, v8

    .line 250
    :cond_e
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    if-nez v9, :cond_f

    .line 255
    .line 256
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 257
    .line 258
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v5

    .line 262
    if-ne v1, v5, :cond_10

    .line 263
    .line 264
    :cond_f
    new-instance v1, Lcom/zykj/mistake/feature/notebook/list/g1;

    .line 265
    .line 266
    const/4 v5, 0x2

    .line 267
    invoke-direct {v1, v3, v5}, Lcom/zykj/mistake/feature/notebook/list/g1;-><init>(Lr6/c;I)V

    .line 268
    .line 269
    .line 270
    invoke-interface {v14, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    :cond_10
    move-object v9, v1

    .line 274
    check-cast v9, Lr6/a;

    .line 275
    .line 276
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 277
    .line 278
    const/4 v5, 0x0

    .line 279
    invoke-static {v1, v5, v8, v13}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 280
    .line 281
    .line 282
    move-result-object v10

    .line 283
    move-object v1, v0

    .line 284
    new-instance v0, Lcom/zykj/mistake/feature/collection/list/y;

    .line 285
    .line 286
    const/4 v5, 0x1

    .line 287
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/collection/list/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ld6/d;I)V

    .line 288
    .line 289
    .line 290
    const/16 v1, 0x36

    .line 291
    .line 292
    const v4, 0x1594eefe

    .line 293
    .line 294
    .line 295
    invoke-static {v4, v8, v0, v14, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 296
    .line 297
    .line 298
    move-result-object v13

    .line 299
    const v15, 0x180180

    .line 300
    .line 301
    .line 302
    const/16 v16, 0x38

    .line 303
    .line 304
    move-object v8, v9

    .line 305
    move-object v9, v10

    .line 306
    const/4 v10, 0x0

    .line 307
    const/4 v11, 0x0

    .line 308
    const/4 v12, 0x0

    .line 309
    invoke-static/range {v7 .. v16}, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt;->PullToRefreshBox(ZLr6/a;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/pulltorefresh/PullToRefreshState;Landroidx/compose/ui/Alignment;Lr6/f;Lr6/f;Landroidx/compose/runtime/Composer;II)V

    .line 310
    .line 311
    .line 312
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 313
    .line 314
    .line 315
    move-result v0

    .line 316
    if-eqz v0, :cond_12

    .line 317
    .line 318
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 319
    .line 320
    .line 321
    goto :goto_6

    .line 322
    :cond_11
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 323
    .line 324
    .line 325
    :cond_12
    :goto_6
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    if-eqz v0, :cond_13

    .line 330
    .line 331
    new-instance v1, Lcom/zykj/mistake/feature/notebook/list/h1;

    .line 332
    .line 333
    const/4 v4, 0x1

    .line 334
    invoke-direct {v1, v2, v3, v6, v4}, Lcom/zykj/mistake/feature/notebook/list/h1;-><init>(Lcom/zykj/mistake/feature/notebook/list/e1;Lr6/c;II)V

    .line 335
    .line 336
    .line 337
    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 338
    .line 339
    .line 340
    :cond_13
    return-void
.end method

.method public static final e(Lcom/zykj/mistake/feature/notebook/list/e1;Lr6/c;Landroidx/compose/runtime/Composer;I)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v3, "state"

    .line 6
    .line 7
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v3, "onIntent"

    .line 11
    .line 12
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const v3, 0x36d6b88a

    .line 16
    .line 17
    .line 18
    move-object/from16 v4, p2

    .line 19
    .line 20
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 21
    .line 22
    .line 23
    move-result-object v13

    .line 24
    and-int/lit8 v4, p3, 0x6

    .line 25
    .line 26
    if-nez v4, :cond_1

    .line 27
    .line 28
    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    const/4 v4, 0x4

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v4, 0x2

    .line 37
    :goto_0
    or-int v4, p3, v4

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move/from16 v4, p3

    .line 41
    .line 42
    :goto_1
    and-int/lit8 v6, p3, 0x30

    .line 43
    .line 44
    const/16 v15, 0x20

    .line 45
    .line 46
    if-nez v6, :cond_3

    .line 47
    .line 48
    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-eqz v6, :cond_2

    .line 53
    .line 54
    move v6, v15

    .line 55
    goto :goto_2

    .line 56
    :cond_2
    const/16 v6, 0x10

    .line 57
    .line 58
    :goto_2
    or-int/2addr v4, v6

    .line 59
    :cond_3
    and-int/lit8 v6, v4, 0x13

    .line 60
    .line 61
    const/16 v7, 0x12

    .line 62
    .line 63
    const/4 v8, 0x0

    .line 64
    const/4 v9, 0x1

    .line 65
    if-eq v6, v7, :cond_4

    .line 66
    .line 67
    move v6, v9

    .line 68
    goto :goto_3

    .line 69
    :cond_4
    move v6, v8

    .line 70
    :goto_3
    and-int/lit8 v7, v4, 0x1

    .line 71
    .line 72
    invoke-interface {v13, v6, v7}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    if-eqz v6, :cond_2a

    .line 77
    .line 78
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    if-eqz v6, :cond_5

    .line 83
    .line 84
    const/4 v6, -0x1

    .line 85
    const-string v7, "com.zykj.mistake.feature.notebook.list.MistakeNotebookScreen (MistakeNotebookScreen.kt:72)"

    .line 86
    .line 87
    invoke-static {v3, v4, v6, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 88
    .line 89
    .line 90
    :cond_5
    and-int/lit8 v3, v4, 0x70

    .line 91
    .line 92
    if-ne v3, v15, :cond_6

    .line 93
    .line 94
    move v6, v9

    .line 95
    goto :goto_4

    .line 96
    :cond_6
    move v6, v8

    .line 97
    :goto_4
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    if-nez v6, :cond_7

    .line 102
    .line 103
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 104
    .line 105
    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    if-ne v7, v6, :cond_8

    .line 110
    .line 111
    :cond_7
    new-instance v7, Lcom/zykj/mistake/feature/notebook/detail/s3;

    .line 112
    .line 113
    const/16 v6, 0x19

    .line 114
    .line 115
    invoke-direct {v7, v1, v6}, Lcom/zykj/mistake/feature/notebook/detail/s3;-><init>(Lr6/c;I)V

    .line 116
    .line 117
    .line 118
    invoke-interface {v13, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    :cond_8
    check-cast v7, Lr6/a;

    .line 122
    .line 123
    const/16 v6, 0x186

    .line 124
    .line 125
    invoke-static {v7, v13, v6, v8}, Lcom/zykj/mistake/utils/e;->c(Lr6/a;Landroidx/compose/runtime/Composer;II)Lr6/a;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    sget-object v7, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 130
    .line 131
    const/4 v10, 0x0

    .line 132
    const/4 v11, 0x0

    .line 133
    invoke-static {v7, v10, v9, v11}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 134
    .line 135
    .line 136
    move-result-object v16

    .line 137
    const-wide v17, 0xfff7f8faL

    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    invoke-static/range {v17 .. v18}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 143
    .line 144
    .line 145
    move-result-wide v17

    .line 146
    const/16 v20, 0x2

    .line 147
    .line 148
    const/16 v21, 0x0

    .line 149
    .line 150
    const/16 v19, 0x0

    .line 151
    .line 152
    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 153
    .line 154
    .line 155
    move-result-object v7

    .line 156
    sget-object v10, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 157
    .line 158
    invoke-virtual {v10}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 159
    .line 160
    .line 161
    move-result-object v10

    .line 162
    sget-object v12, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 163
    .line 164
    invoke-virtual {v12}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 165
    .line 166
    .line 167
    move-result-object v12

    .line 168
    invoke-static {v10, v12, v13, v8}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 169
    .line 170
    .line 171
    move-result-object v10

    .line 172
    invoke-static {v13, v8}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 173
    .line 174
    .line 175
    move-result v12

    .line 176
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 177
    .line 178
    .line 179
    move-result-object v14

    .line 180
    invoke-static {v13, v7}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 181
    .line 182
    .line 183
    move-result-object v7

    .line 184
    move/from16 p2, v9

    .line 185
    .line 186
    sget-object v9, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 187
    .line 188
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 193
    .line 194
    .line 195
    move-result-object v17

    .line 196
    if-nez v17, :cond_9

    .line 197
    .line 198
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 199
    .line 200
    .line 201
    :cond_9
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 202
    .line 203
    .line 204
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 205
    .line 206
    .line 207
    move-result v17

    .line 208
    if-eqz v17, :cond_a

    .line 209
    .line 210
    invoke-interface {v13, v5}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 211
    .line 212
    .line 213
    goto :goto_5

    .line 214
    :cond_a
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 215
    .line 216
    .line 217
    :goto_5
    invoke-static {v13}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 218
    .line 219
    .line 220
    move-result-object v5

    .line 221
    invoke-static {v9, v5, v10, v5, v14}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 222
    .line 223
    .line 224
    move-result-object v10

    .line 225
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 226
    .line 227
    .line 228
    move-result v14

    .line 229
    if-nez v14, :cond_b

    .line 230
    .line 231
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v14

    .line 235
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 236
    .line 237
    .line 238
    move-result-object v15

    .line 239
    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v14

    .line 243
    if-nez v14, :cond_c

    .line 244
    .line 245
    :cond_b
    invoke-static {v12, v5, v12, v10}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 246
    .line 247
    .line 248
    :cond_c
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 249
    .line 250
    .line 251
    move-result-object v9

    .line 252
    invoke-static {v5, v7, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 253
    .line 254
    .line 255
    sget-object v5, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 256
    .line 257
    and-int/lit8 v4, v4, 0x7e

    .line 258
    .line 259
    invoke-static {v0, v1, v6, v13, v4}, Lcom/zykj/mistake/feature/notebook/list/i1;->f(Lcom/zykj/mistake/feature/notebook/list/e1;Lr6/c;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 260
    .line 261
    .line 262
    invoke-static {v11, v13, v8}, Ly4/g;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 263
    .line 264
    .line 265
    iget-object v5, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->d:Ljava/util/List;

    .line 266
    .line 267
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 268
    .line 269
    .line 270
    move-result v5

    .line 271
    if-eqz v5, :cond_d

    .line 272
    .line 273
    iget-boolean v5, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->e:Z

    .line 274
    .line 275
    if-nez v5, :cond_d

    .line 276
    .line 277
    const v4, -0x23639b02

    .line 278
    .line 279
    .line 280
    invoke-interface {v13, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 281
    .line 282
    .line 283
    iget-boolean v4, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->h:Z

    .line 284
    .line 285
    xor-int/lit8 v4, v4, 0x1

    .line 286
    .line 287
    invoke-static {v4, v6, v13, v8}, Lcom/zykj/mistake/feature/notebook/list/i1;->c(ZLr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 288
    .line 289
    .line 290
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 291
    .line 292
    .line 293
    goto :goto_6

    .line 294
    :cond_d
    const v5, -0x23610cfb

    .line 295
    .line 296
    .line 297
    invoke-interface {v13, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 298
    .line 299
    .line 300
    invoke-static {v0, v1, v13, v4}, Lcom/zykj/mistake/feature/notebook/list/i1;->d(Lcom/zykj/mistake/feature/notebook/list/e1;Lr6/c;Landroidx/compose/runtime/Composer;I)V

    .line 301
    .line 302
    .line 303
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 304
    .line 305
    .line 306
    :goto_6
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 307
    .line 308
    .line 309
    iget-boolean v4, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->o:Z

    .line 310
    .line 311
    const v15, -0x5ae55128

    .line 312
    .line 313
    .line 314
    if-eqz v4, :cond_1a

    .line 315
    .line 316
    const v4, -0x5aa42e10

    .line 317
    .line 318
    .line 319
    invoke-interface {v13, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 320
    .line 321
    .line 322
    iget-object v4, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->p:Ljava/util/List;

    .line 323
    .line 324
    iget-object v5, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->r:Ljava/util/Set;

    .line 325
    .line 326
    iget-boolean v6, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->s:Z

    .line 327
    .line 328
    move-object v7, v5

    .line 329
    check-cast v7, Ljava/util/Collection;

    .line 330
    .line 331
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 332
    .line 333
    .line 334
    move-result v7

    .line 335
    xor-int/lit8 v7, v7, 0x1

    .line 336
    .line 337
    move v9, v8

    .line 338
    sget-object v8, Lcom/zykj/mistake/feature/notebook/list/JoinCollectionDialogMode;->ADD_ONLY:Lcom/zykj/mistake/feature/notebook/list/JoinCollectionDialogMode;

    .line 339
    .line 340
    const/16 v10, 0x20

    .line 341
    .line 342
    if-ne v3, v10, :cond_e

    .line 343
    .line 344
    move/from16 v10, p2

    .line 345
    .line 346
    goto :goto_7

    .line 347
    :cond_e
    move v10, v9

    .line 348
    :goto_7
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v11

    .line 352
    if-nez v10, :cond_f

    .line 353
    .line 354
    sget-object v10, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 355
    .line 356
    invoke-virtual {v10}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v10

    .line 360
    if-ne v11, v10, :cond_10

    .line 361
    .line 362
    :cond_f
    new-instance v11, Lcom/zykj/mistake/feature/notebook/detail/m4;

    .line 363
    .line 364
    const/4 v10, 0x4

    .line 365
    invoke-direct {v11, v1, v10}, Lcom/zykj/mistake/feature/notebook/detail/m4;-><init>(Lr6/c;I)V

    .line 366
    .line 367
    .line 368
    invoke-interface {v13, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    :cond_10
    check-cast v11, Lr6/c;

    .line 372
    .line 373
    const/16 v10, 0x20

    .line 374
    .line 375
    if-ne v3, v10, :cond_11

    .line 376
    .line 377
    move/from16 v10, p2

    .line 378
    .line 379
    goto :goto_8

    .line 380
    :cond_11
    move v10, v9

    .line 381
    :goto_8
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v12

    .line 385
    if-nez v10, :cond_12

    .line 386
    .line 387
    sget-object v10, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 388
    .line 389
    invoke-virtual {v10}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v10

    .line 393
    if-ne v12, v10, :cond_13

    .line 394
    .line 395
    :cond_12
    new-instance v12, Lcom/zykj/mistake/feature/notebook/detail/s3;

    .line 396
    .line 397
    const/16 v10, 0x1a

    .line 398
    .line 399
    invoke-direct {v12, v1, v10}, Lcom/zykj/mistake/feature/notebook/detail/s3;-><init>(Lr6/c;I)V

    .line 400
    .line 401
    .line 402
    invoke-interface {v13, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 403
    .line 404
    .line 405
    :cond_13
    move-object v10, v12

    .line 406
    check-cast v10, Lr6/a;

    .line 407
    .line 408
    const/16 v12, 0x20

    .line 409
    .line 410
    if-ne v3, v12, :cond_14

    .line 411
    .line 412
    move/from16 v12, p2

    .line 413
    .line 414
    goto :goto_9

    .line 415
    :cond_14
    move v12, v9

    .line 416
    :goto_9
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v14

    .line 420
    if-nez v12, :cond_15

    .line 421
    .line 422
    sget-object v12, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 423
    .line 424
    invoke-virtual {v12}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v12

    .line 428
    if-ne v14, v12, :cond_16

    .line 429
    .line 430
    :cond_15
    new-instance v14, Lcom/zykj/mistake/feature/notebook/detail/s3;

    .line 431
    .line 432
    const/16 v12, 0x1b

    .line 433
    .line 434
    invoke-direct {v14, v1, v12}, Lcom/zykj/mistake/feature/notebook/detail/s3;-><init>(Lr6/c;I)V

    .line 435
    .line 436
    .line 437
    invoke-interface {v13, v14}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 438
    .line 439
    .line 440
    :cond_16
    check-cast v14, Lr6/a;

    .line 441
    .line 442
    const/16 v12, 0x20

    .line 443
    .line 444
    if-ne v3, v12, :cond_17

    .line 445
    .line 446
    move/from16 v12, p2

    .line 447
    .line 448
    goto :goto_a

    .line 449
    :cond_17
    move v12, v9

    .line 450
    :goto_a
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v9

    .line 454
    if-nez v12, :cond_18

    .line 455
    .line 456
    sget-object v12, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 457
    .line 458
    invoke-virtual {v12}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v12

    .line 462
    if-ne v9, v12, :cond_19

    .line 463
    .line 464
    :cond_18
    new-instance v9, Lcom/zykj/mistake/feature/notebook/detail/s3;

    .line 465
    .line 466
    const/16 v12, 0x1c

    .line 467
    .line 468
    invoke-direct {v9, v1, v12}, Lcom/zykj/mistake/feature/notebook/detail/s3;-><init>(Lr6/c;I)V

    .line 469
    .line 470
    .line 471
    invoke-interface {v13, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 472
    .line 473
    .line 474
    :cond_19
    move-object v12, v9

    .line 475
    check-cast v12, Lr6/a;

    .line 476
    .line 477
    move-object v9, v11

    .line 478
    move-object v11, v14

    .line 479
    const/16 v14, 0x6000

    .line 480
    .line 481
    invoke-static/range {v4 .. v14}, Lcom/zykj/mistake/feature/notebook/list/j;->d(Ljava/util/List;Ljava/util/Set;ZZLcom/zykj/mistake/feature/notebook/list/JoinCollectionDialogMode;Lr6/c;Lr6/a;Lr6/a;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 482
    .line 483
    .line 484
    :goto_b
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 485
    .line 486
    .line 487
    goto :goto_c

    .line 488
    :cond_1a
    invoke-interface {v13, v15}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 489
    .line 490
    .line 491
    goto :goto_b

    .line 492
    :goto_c
    iget-boolean v4, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->t:Z

    .line 493
    .line 494
    if-eqz v4, :cond_25

    .line 495
    .line 496
    const v4, -0x5a98befc

    .line 497
    .line 498
    .line 499
    invoke-interface {v13, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 500
    .line 501
    .line 502
    iget-object v4, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->p:Ljava/util/List;

    .line 503
    .line 504
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 505
    .line 506
    .line 507
    move-result v4

    .line 508
    if-nez v4, :cond_1b

    .line 509
    .line 510
    const-string v4, "\u521b\u5efa\u65b0\u9519\u9898\u96c6"

    .line 511
    .line 512
    goto :goto_d

    .line 513
    :cond_1b
    const-string v4, "\u8fd8\u6ca1\u6709\u521b\u5efa\u8fc7\u4efb\u4f55\u9519\u9898\u96c6\uff0c\u5148\u521b\u5efa\u4e00\u4e2a\u5427"

    .line 514
    .line 515
    :goto_d
    iget-object v5, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->u:Ljava/lang/String;

    .line 516
    .line 517
    iget-object v6, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->v:Ljava/lang/String;

    .line 518
    .line 519
    iget-boolean v9, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->w:Z

    .line 520
    .line 521
    const/16 v7, 0x14

    .line 522
    .line 523
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 524
    .line 525
    .line 526
    move-result-object v10

    .line 527
    const/16 v12, 0x20

    .line 528
    .line 529
    if-ne v3, v12, :cond_1c

    .line 530
    .line 531
    const/4 v8, 0x1

    .line 532
    goto :goto_e

    .line 533
    :cond_1c
    const/4 v8, 0x0

    .line 534
    :goto_e
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v7

    .line 538
    if-nez v8, :cond_1d

    .line 539
    .line 540
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 541
    .line 542
    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object v8

    .line 546
    if-ne v7, v8, :cond_1e

    .line 547
    .line 548
    :cond_1d
    new-instance v7, Lcom/zykj/mistake/feature/notebook/detail/m4;

    .line 549
    .line 550
    const/4 v8, 0x5

    .line 551
    invoke-direct {v7, v1, v8}, Lcom/zykj/mistake/feature/notebook/detail/m4;-><init>(Lr6/c;I)V

    .line 552
    .line 553
    .line 554
    invoke-interface {v13, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 555
    .line 556
    .line 557
    :cond_1e
    move-object v14, v7

    .line 558
    check-cast v14, Lr6/c;

    .line 559
    .line 560
    const/16 v12, 0x20

    .line 561
    .line 562
    if-ne v3, v12, :cond_1f

    .line 563
    .line 564
    const/4 v8, 0x1

    .line 565
    goto :goto_f

    .line 566
    :cond_1f
    const/4 v8, 0x0

    .line 567
    :goto_f
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object v7

    .line 571
    if-nez v8, :cond_20

    .line 572
    .line 573
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 574
    .line 575
    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 576
    .line 577
    .line 578
    move-result-object v8

    .line 579
    if-ne v7, v8, :cond_21

    .line 580
    .line 581
    :cond_20
    new-instance v7, Lcom/zykj/mistake/feature/notebook/detail/s3;

    .line 582
    .line 583
    const/16 v8, 0x1d

    .line 584
    .line 585
    invoke-direct {v7, v1, v8}, Lcom/zykj/mistake/feature/notebook/detail/s3;-><init>(Lr6/c;I)V

    .line 586
    .line 587
    .line 588
    invoke-interface {v13, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 589
    .line 590
    .line 591
    :cond_21
    check-cast v7, Lr6/a;

    .line 592
    .line 593
    const/16 v12, 0x20

    .line 594
    .line 595
    if-ne v3, v12, :cond_22

    .line 596
    .line 597
    const/4 v8, 0x1

    .line 598
    goto :goto_10

    .line 599
    :cond_22
    const/4 v8, 0x0

    .line 600
    :goto_10
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 601
    .line 602
    .line 603
    move-result-object v11

    .line 604
    if-nez v8, :cond_24

    .line 605
    .line 606
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 607
    .line 608
    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    move-result-object v8

    .line 612
    if-ne v11, v8, :cond_23

    .line 613
    .line 614
    goto :goto_11

    .line 615
    :cond_23
    const/4 v8, 0x0

    .line 616
    goto :goto_12

    .line 617
    :cond_24
    :goto_11
    new-instance v11, Lcom/zykj/mistake/feature/notebook/list/g1;

    .line 618
    .line 619
    const/4 v8, 0x0

    .line 620
    invoke-direct {v11, v1, v8}, Lcom/zykj/mistake/feature/notebook/list/g1;-><init>(Lr6/c;I)V

    .line 621
    .line 622
    .line 623
    invoke-interface {v13, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 624
    .line 625
    .line 626
    :goto_12
    move-object/from16 v16, v11

    .line 627
    .line 628
    check-cast v16, Lr6/a;

    .line 629
    .line 630
    const/16 v19, 0x0

    .line 631
    .line 632
    const/16 v20, 0x380

    .line 633
    .line 634
    move v11, v15

    .line 635
    move-object v15, v7

    .line 636
    const-string v7, "\u521b\u5efa"

    .line 637
    .line 638
    move/from16 v22, v8

    .line 639
    .line 640
    const-string v8, "\u521b\u5efa\u4e2d..."

    .line 641
    .line 642
    move/from16 v17, v11

    .line 643
    .line 644
    const/4 v11, 0x0

    .line 645
    move/from16 v18, v12

    .line 646
    .line 647
    const/4 v12, 0x0

    .line 648
    move/from16 v21, v17

    .line 649
    .line 650
    move-object/from16 v17, v13

    .line 651
    .line 652
    const/4 v13, 0x0

    .line 653
    move/from16 v23, v18

    .line 654
    .line 655
    const v18, 0x186c00

    .line 656
    .line 657
    .line 658
    move/from16 v2, v21

    .line 659
    .line 660
    invoke-static/range {v4 .. v20}, Lcom/zykj/mistake/feature/collection/component/f;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLr6/c;Lr6/a;Lr6/a;Landroidx/compose/runtime/Composer;III)V

    .line 661
    .line 662
    .line 663
    move-object/from16 v13, v17

    .line 664
    .line 665
    :goto_13
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 666
    .line 667
    .line 668
    goto :goto_14

    .line 669
    :cond_25
    move v2, v15

    .line 670
    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 671
    .line 672
    .line 673
    goto :goto_13

    .line 674
    :goto_14
    iget-boolean v4, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->y:Z

    .line 675
    .line 676
    if-eqz v4, :cond_29

    .line 677
    .line 678
    const v2, -0x5a8d6bc2

    .line 679
    .line 680
    .line 681
    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 682
    .line 683
    .line 684
    const/16 v12, 0x20

    .line 685
    .line 686
    if-ne v3, v12, :cond_26

    .line 687
    .line 688
    const/4 v8, 0x1

    .line 689
    goto :goto_15

    .line 690
    :cond_26
    const/4 v8, 0x0

    .line 691
    :goto_15
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 692
    .line 693
    .line 694
    move-result-object v2

    .line 695
    if-nez v8, :cond_27

    .line 696
    .line 697
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 698
    .line 699
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 700
    .line 701
    .line 702
    move-result-object v3

    .line 703
    if-ne v2, v3, :cond_28

    .line 704
    .line 705
    :cond_27
    new-instance v2, Lcom/zykj/mistake/feature/notebook/list/g1;

    .line 706
    .line 707
    const/4 v3, 0x1

    .line 708
    invoke-direct {v2, v1, v3}, Lcom/zykj/mistake/feature/notebook/list/g1;-><init>(Lr6/c;I)V

    .line 709
    .line 710
    .line 711
    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 712
    .line 713
    .line 714
    :cond_28
    check-cast v2, Lr6/a;

    .line 715
    .line 716
    const/4 v8, 0x0

    .line 717
    invoke-static {v2, v13, v8}, Lcom/zykj/mistake/feature/notebook/list/j;->e(Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 718
    .line 719
    .line 720
    :goto_16
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 721
    .line 722
    .line 723
    goto :goto_17

    .line 724
    :cond_29
    const/4 v8, 0x0

    .line 725
    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 726
    .line 727
    .line 728
    goto :goto_16

    .line 729
    :goto_17
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 730
    .line 731
    .line 732
    move-result v2

    .line 733
    if-eqz v2, :cond_2b

    .line 734
    .line 735
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 736
    .line 737
    .line 738
    goto :goto_18

    .line 739
    :cond_2a
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 740
    .line 741
    .line 742
    :cond_2b
    :goto_18
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 743
    .line 744
    .line 745
    move-result-object v2

    .line 746
    if-eqz v2, :cond_2c

    .line 747
    .line 748
    new-instance v3, Lcom/zykj/mistake/feature/notebook/list/h1;

    .line 749
    .line 750
    move/from16 v4, p3

    .line 751
    .line 752
    invoke-direct {v3, v0, v1, v4, v8}, Lcom/zykj/mistake/feature/notebook/list/h1;-><init>(Lcom/zykj/mistake/feature/notebook/list/e1;Lr6/c;II)V

    .line 753
    .line 754
    .line 755
    invoke-interface {v2, v3}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 756
    .line 757
    .line 758
    :cond_2c
    return-void
.end method

.method public static final f(Lcom/zykj/mistake/feature/notebook/list/e1;Lr6/c;Lr6/a;Landroidx/compose/runtime/Composer;I)V
    .locals 68

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v4, p4

    const v0, -0x365e17bb

    move-object/from16 v3, p3

    .line 1
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v10

    and-int/lit8 v3, v4, 0x6

    if-nez v3, :cond_1

    invoke-interface {v10, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v4

    goto :goto_1

    :cond_1
    move v3, v4

    :goto_1
    and-int/lit8 v5, v4, 0x30

    if-nez v5, :cond_3

    invoke-interface {v10, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_3
    and-int/lit16 v5, v4, 0x180

    if-nez v5, :cond_5

    move-object/from16 v5, p2

    invoke-interface {v10, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v3, v7

    goto :goto_4

    :cond_5
    move-object/from16 v5, p2

    :goto_4
    and-int/lit16 v7, v3, 0x93

    const/16 v8, 0x92

    const/4 v9, 0x1

    const/4 v11, 0x0

    if-eq v7, v8, :cond_6

    move v7, v9

    goto :goto_5

    :cond_6
    move v7, v11

    :goto_5
    and-int/lit8 v8, v3, 0x1

    invoke-interface {v10, v7, v8}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v7

    if-eqz v7, :cond_32

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v7

    if-eqz v7, :cond_7

    const/4 v7, -0x1

    const-string v8, "com.zykj.mistake.feature.notebook.list.MistakeNotebookTitleBar (MistakeNotebookScreen.kt:387)"

    invoke-static {v0, v3, v7, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 2
    :cond_7
    sget-object v13, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    const/4 v0, 0x0

    const/4 v7, 0x0

    .line 3
    invoke-static {v13, v0, v9, v7}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v8, 0x2c

    int-to-float v8, v8

    .line 4
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v8

    .line 5
    invoke-static {v0, v8}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v14

    .line 6
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    move-result-wide v15

    const/16 v18, 0x2

    const/16 v19, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v20

    const/16 v0, 0x12

    int-to-float v8, v0

    .line 7
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v21

    const/16 v8, 0xe

    int-to-float v8, v8

    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v23

    const/16 v25, 0xa

    const/16 v26, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    .line 8
    invoke-static/range {v20 .. v26}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    .line 9
    sget-object v31, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual/range {v31 .. v31}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    move-result-object v12

    .line 10
    sget-object v14, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v14}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    move-result-object v15

    move/from16 p3, v0

    const/16 v0, 0x30

    .line 11
    invoke-static {v15, v12, v10, v0}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v12

    .line 12
    invoke-static {v10, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v15

    .line 13
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v6

    .line 14
    invoke-static {v10, v8}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    .line 15
    sget-object v11, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    move-result-object v7

    .line 16
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v16

    if-nez v16, :cond_8

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 17
    :cond_8
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 18
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v16

    if-eqz v16, :cond_9

    .line 19
    invoke-interface {v10, v7}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    goto :goto_6

    .line 20
    :cond_9
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 21
    :goto_6
    invoke-static {v10}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v7

    .line 22
    invoke-static {v11, v7, v12, v7, v6}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    move-result-object v6

    .line 23
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v12

    if-nez v12, :cond_a

    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v12, v9}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_b

    .line 24
    :cond_a
    invoke-static {v15, v7, v15, v6}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 25
    :cond_b
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    move-result-object v6

    invoke-static {v7, v8, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 26
    sget-object v12, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    const/16 v16, 0x2

    const/16 v17, 0x0

    move-object v6, v14

    const/high16 v14, 0x3f800000    # 1.0f

    const/4 v15, 0x0

    .line 27
    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/RowScope;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-object v9, v12

    move-object v8, v13

    .line 28
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    move-result-object v12

    .line 29
    invoke-virtual {v6}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    move-result-object v13

    .line 30
    invoke-static {v13, v12, v10, v0}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v12

    const/4 v13, 0x0

    .line 31
    invoke-static {v10, v13}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v14

    .line 32
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v15

    .line 33
    invoke-static {v10, v7}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move/from16 v32, v0

    .line 34
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    move-result-object v0

    .line 35
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v16

    if-nez v16, :cond_c

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 36
    :cond_c
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 37
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v16

    if-eqz v16, :cond_d

    .line 38
    invoke-interface {v10, v0}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    goto :goto_7

    .line 39
    :cond_d
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 40
    :goto_7
    invoke-static {v10}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v0

    .line 41
    invoke-static {v11, v0, v12, v0, v15}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    move-result-object v12

    .line 42
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v15

    if-nez v15, :cond_e

    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v15, v13}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_f

    .line 43
    :cond_e
    invoke-static {v14, v0, v14, v12}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 44
    :cond_f
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    move-result-object v12

    invoke-static {v0, v7, v12}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    const-wide v33, 0xff15171aL

    .line 45
    invoke-static/range {v33 .. v34}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v12

    .line 46
    invoke-static/range {p3 .. p3}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v14

    .line 47
    sget-object v0, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    move-wide/from16 v16, v12

    invoke-virtual {v0}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v12

    move-object v7, v6

    .line 48
    invoke-interface {v9, v8}, Landroidx/compose/foundation/layout/RowScope;->alignByBaseline(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/16 v28, 0x0

    const v29, 0x1ffd0

    .line 49
    const-string v5, "\u6211\u7684\u9519\u9898"

    move-object v13, v11

    const/4 v11, 0x0

    move-object/from16 v22, v13

    const/4 v13, 0x0

    move-object/from16 v23, v9

    move-object/from16 v27, v10

    move-wide v9, v14

    const-wide/16 v14, 0x0

    move-object/from16 v24, v7

    move-wide/from16 v66, v16

    move-object/from16 v17, v8

    move-wide/from16 v7, v66

    const/16 v16, 0x0

    move-object/from16 v25, v17

    const/16 v17, 0x0

    const/16 v26, 0x20

    const/16 v30, 0x0

    const-wide/16 v18, 0x0

    const/16 v35, 0x0

    const/16 v20, 0x0

    const/16 v36, 0x1

    const/16 v21, 0x0

    move-object/from16 v37, v22

    const/16 v22, 0x0

    move-object/from16 v38, v23

    const/16 v23, 0x0

    move-object/from16 v39, v24

    const/16 v24, 0x0

    move-object/from16 v40, v25

    const/16 v25, 0x0

    move/from16 v41, v26

    move-object/from16 v26, v27

    const v27, 0x30d86

    move-object/from16 p3, v0

    move-object/from16 v2, v35

    move-object/from16 v4, v38

    move-object/from16 v0, v40

    move/from16 v35, v3

    move/from16 v3, v30

    invoke-static/range {v5 .. v29}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v26

    .line 50
    iget-boolean v5, v1, Lcom/zykj/mistake/feature/notebook/list/e1;->i:Z

    iget-object v6, v1, Lcom/zykj/mistake/feature/notebook/list/e1;->j:Ljava/util/Set;

    iget-boolean v7, v1, Lcom/zykj/mistake/feature/notebook/list/e1;->h:Z

    iget-object v8, v1, Lcom/zykj/mistake/feature/notebook/list/e1;->d:Ljava/util/List;

    .line 51
    const-string v9, " \u9053"

    const/16 v13, 0x9

    const/high16 v14, 0x3f800000    # 1.0f

    const/16 v15, 0xc

    const-wide v16, 0xff666666L

    const/4 v11, 0x6

    if-eqz v5, :cond_11

    const v5, 0x725087fe

    invoke-interface {v10, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    int-to-float v5, v13

    .line 52
    invoke-static {v5, v0, v10, v11}, Landroidx/compose/material3/c;->s(FLandroidx/compose/ui/Modifier$Companion;Landroidx/compose/runtime/Composer;I)V

    .line 53
    move-object v5, v6

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_10

    .line 54
    new-instance v5, Landroidx/compose/ui/text/AnnotatedString$Builder;

    const/4 v11, 0x1

    invoke-direct {v5, v3, v11, v2}, Landroidx/compose/ui/text/AnnotatedString$Builder;-><init>(IILkotlin/jvm/internal/e;)V

    .line 55
    const-string v2, "\u5df2\u9009\u62e9 "

    invoke-virtual {v5, v2}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V

    .line 56
    new-instance v42, Landroidx/compose/ui/text/SpanStyle;

    .line 57
    invoke-static/range {v33 .. v34}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v43

    .line 58
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v47

    const v63, 0xfffa

    const/16 v64, 0x0

    const-wide/16 v45, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const-wide/16 v52, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const-wide/16 v57, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    .line 59
    invoke-direct/range {v42 .. v64}, Landroidx/compose/ui/text/SpanStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;ILkotlin/jvm/internal/e;)V

    move-object/from16 v2, v42

    .line 60
    invoke-virtual {v5, v2}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pushStyle(Landroidx/compose/ui/text/SpanStyle;)I

    move-result v2

    .line 61
    :try_start_0
    invoke-interface {v6}, Ljava/util/Set;->size()I

    move-result v11

    .line 62
    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v5, v11}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    invoke-virtual {v5, v2}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pop(I)V

    .line 64
    invoke-virtual {v5, v9}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V

    .line 65
    invoke-virtual {v5}, Landroidx/compose/ui/text/AnnotatedString$Builder;->toAnnotatedString()Landroidx/compose/ui/text/AnnotatedString;

    move-result-object v2

    :goto_8
    move-object v5, v2

    move v2, v7

    move-object v9, v8

    goto :goto_9

    :catchall_0
    move-exception v0

    .line 66
    invoke-virtual {v5, v2}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pop(I)V

    throw v0

    .line 67
    :cond_10
    new-instance v5, Landroidx/compose/ui/text/AnnotatedString$Builder;

    const/4 v11, 0x1

    invoke-direct {v5, v3, v11, v2}, Landroidx/compose/ui/text/AnnotatedString$Builder;-><init>(IILkotlin/jvm/internal/e;)V

    .line 68
    const-string v2, "\u672a\u9009\u62e9"

    invoke-virtual {v5, v2}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V

    .line 69
    invoke-virtual {v5}, Landroidx/compose/ui/text/AnnotatedString$Builder;->toAnnotatedString()Landroidx/compose/ui/text/AnnotatedString;

    move-result-object v2

    goto :goto_8

    .line 70
    :goto_9
    invoke-static/range {v16 .. v17}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v7

    move-object v11, v9

    move-object/from16 v27, v10

    .line 71
    invoke-static {v15}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v9

    .line 72
    sget-object v12, Landroidx/compose/ui/text/style/TextOverflow;->Companion:Landroidx/compose/ui/text/style/TextOverflow$Companion;

    invoke-virtual {v12}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getEllipsis-gIe3tQ8()I

    move-result v20

    .line 73
    invoke-interface {v4, v0, v14, v3}, Landroidx/compose/foundation/layout/RowScope;->weight(Landroidx/compose/ui/Modifier;FZ)Landroidx/compose/ui/Modifier;

    move-result-object v12

    .line 74
    invoke-interface {v4, v12}, Landroidx/compose/foundation/layout/RowScope;->alignByBaseline(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v29, 0xc30

    const v30, 0x3d7f0

    move-object v12, v11

    const/4 v11, 0x0

    move-object v13, v12

    const/4 v12, 0x0

    move-object/from16 v16, v13

    const/4 v13, 0x0

    move/from16 v17, v14

    move/from16 v18, v15

    const-wide/16 v14, 0x0

    move-object/from16 v19, v16

    const/16 v16, 0x0

    move/from16 v21, v17

    const/16 v17, 0x0

    move/from16 v23, v18

    move-object/from16 v22, v19

    const-wide/16 v18, 0x0

    move/from16 v24, v21

    const/16 v21, 0x0

    move-object/from16 v25, v22

    const/16 v22, 0x1

    move/from16 v26, v23

    const/16 v23, 0x0

    move/from16 v28, v24

    const/16 v24, 0x0

    move-object/from16 v33, v25

    const/16 v25, 0x0

    move/from16 v34, v26

    const/16 v26, 0x0

    move/from16 v38, v28

    const/16 v28, 0xd80

    move/from16 v41, v2

    move-object/from16 v40, v6

    move-object/from16 v42, v33

    move-object v6, v4

    .line 75
    invoke-static/range {v5 .. v30}, Landroidx/compose/material3/TextKt;->Text-IbK3jfQ(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILjava/util/Map;Lr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    .line 76
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    move/from16 v2, v34

    goto/16 :goto_b

    :cond_11
    move-object/from16 v40, v6

    move/from16 v41, v7

    move-object/from16 v42, v8

    move v5, v14

    move/from16 v18, v15

    .line 77
    invoke-interface/range {v42 .. v42}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_13

    if-eqz v41, :cond_12

    goto :goto_a

    :cond_12
    const v2, 0x716f9e75

    .line 78
    invoke-interface {v10, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    move/from16 v38, v5

    move/from16 v2, v18

    goto/16 :goto_b

    :cond_13
    :goto_a
    const v6, 0x72632584

    invoke-interface {v10, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    int-to-float v6, v13

    .line 79
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v6

    .line 80
    invoke-static {v0, v6}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v6, v10, v11}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 81
    new-instance v6, Landroidx/compose/ui/text/AnnotatedString$Builder;

    const/4 v11, 0x1

    invoke-direct {v6, v3, v11, v2}, Landroidx/compose/ui/text/AnnotatedString$Builder;-><init>(IILkotlin/jvm/internal/e;)V

    .line 82
    const-string v2, "\u5171 "

    invoke-virtual {v6, v2}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V

    .line 83
    new-instance v43, Landroidx/compose/ui/text/SpanStyle;

    .line 84
    invoke-static/range {v33 .. v34}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v44

    .line 85
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v48

    const v64, 0xfffa

    const/16 v65, 0x0

    const-wide/16 v46, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const-wide/16 v53, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const-wide/16 v58, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    .line 86
    invoke-direct/range {v43 .. v65}, Landroidx/compose/ui/text/SpanStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;ILkotlin/jvm/internal/e;)V

    move-object/from16 v2, v43

    .line 87
    invoke-virtual {v6, v2}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pushStyle(Landroidx/compose/ui/text/SpanStyle;)I

    move-result v2

    .line 88
    :try_start_1
    iget v7, v1, Lcom/zykj/mistake/feature/notebook/list/e1;->a:I

    .line 89
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 90
    invoke-virtual {v6, v2}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pop(I)V

    .line 91
    const-string v2, " \u9053\u9519\u9898\uff0c\u5df2\u5b8c\u5168\u638c\u63e1 "

    invoke-virtual {v6, v2}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V

    .line 92
    new-instance v43, Landroidx/compose/ui/text/SpanStyle;

    .line 93
    invoke-static/range {v33 .. v34}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v44

    .line 94
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v48

    const v64, 0xfffa

    const/16 v65, 0x0

    const-wide/16 v46, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const-wide/16 v53, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const-wide/16 v58, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    .line 95
    invoke-direct/range {v43 .. v65}, Landroidx/compose/ui/text/SpanStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;ILkotlin/jvm/internal/e;)V

    move-object/from16 v2, v43

    .line 96
    invoke-virtual {v6, v2}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pushStyle(Landroidx/compose/ui/text/SpanStyle;)I

    move-result v2

    .line 97
    :try_start_2
    iget v7, v1, Lcom/zykj/mistake/feature/notebook/list/e1;->b:I

    .line 98
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 99
    invoke-virtual {v6, v2}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pop(I)V

    .line 100
    invoke-virtual {v6, v9}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V

    .line 101
    invoke-virtual {v6}, Landroidx/compose/ui/text/AnnotatedString$Builder;->toAnnotatedString()Landroidx/compose/ui/text/AnnotatedString;

    move-result-object v2

    .line 102
    invoke-static/range {v16 .. v17}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v7

    move-object/from16 v27, v10

    .line 103
    invoke-static/range {v18 .. v18}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v9

    .line 104
    sget-object v6, Landroidx/compose/ui/text/style/TextOverflow;->Companion:Landroidx/compose/ui/text/style/TextOverflow$Companion;

    invoke-virtual {v6}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getEllipsis-gIe3tQ8()I

    move-result v20

    .line 105
    invoke-interface {v4, v0, v5, v3}, Landroidx/compose/foundation/layout/RowScope;->weight(Landroidx/compose/ui/Modifier;FZ)Landroidx/compose/ui/Modifier;

    move-result-object v6

    .line 106
    invoke-interface {v4, v6}, Landroidx/compose/foundation/layout/RowScope;->alignByBaseline(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/16 v29, 0xc30

    const v30, 0x3d7f0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move/from16 v34, v18

    const-wide/16 v18, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x1

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0xd80

    move/from16 v38, v5

    move-object v5, v2

    move/from16 v2, v34

    .line 107
    invoke-static/range {v5 .. v30}, Landroidx/compose/material3/TextKt;->Text-IbK3jfQ(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILjava/util/Map;Lr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    .line 108
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 109
    :goto_b
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endNode()V

    int-to-float v2, v2

    .line 110
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    move-object/from16 v6, v39

    .line 111
    invoke-virtual {v6, v2}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    move-result-object v2

    .line 112
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    move-result-object v4

    const/16 v5, 0x36

    .line 113
    invoke-static {v2, v4, v10, v5}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v2

    .line 114
    invoke-static {v10, v3}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v4

    .line 115
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v5

    .line 116
    invoke-static {v10, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 117
    invoke-virtual/range {v37 .. v37}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    move-result-object v6

    .line 118
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v7

    if-nez v7, :cond_14

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 119
    :cond_14
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 120
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v7

    if-eqz v7, :cond_15

    .line 121
    invoke-interface {v10, v6}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    goto :goto_c

    .line 122
    :cond_15
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 123
    :goto_c
    invoke-static {v10}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v6

    move-object/from16 v13, v37

    .line 124
    invoke-static {v13, v6, v2, v6, v5}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    move-result-object v2

    .line 125
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v5

    if-nez v5, :cond_16

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_17

    .line 126
    :cond_16
    invoke-static {v4, v6, v4, v2}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 127
    :cond_17
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    move-result-object v2

    invoke-static {v6, v0, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 128
    iget-boolean v0, v1, Lcom/zykj/mistake/feature/notebook/list/e1;->i:Z

    if-eqz v0, :cond_24

    const v0, 0x22a4f76c

    .line 129
    invoke-interface {v10, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 130
    sget v5, Lcom/zykj/mistake/R$drawable;->ic_add_mistake_collection:I

    .line 131
    move-object/from16 v6, v40

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/16 v36, 0x1

    xor-int/lit8 v8, v0, 0x1

    and-int/lit8 v0, v35, 0x70

    const/16 v2, 0x20

    if-ne v0, v2, :cond_18

    const/4 v9, 0x1

    goto :goto_d

    :cond_18
    move v9, v3

    .line 132
    :goto_d
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    if-nez v9, :cond_1a

    .line 133
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v4, v6, :cond_19

    goto :goto_e

    :cond_19
    move-object/from16 v13, p1

    goto :goto_f

    .line 134
    :cond_1a
    :goto_e
    new-instance v4, Lcom/zykj/mistake/feature/notebook/list/g1;

    const/4 v6, 0x3

    move-object/from16 v13, p1

    invoke-direct {v4, v13, v6}, Lcom/zykj/mistake/feature/notebook/list/g1;-><init>(Lr6/c;I)V

    .line 135
    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 136
    :goto_f
    move-object v9, v4

    check-cast v9, Lr6/a;

    const/16 v11, 0x30

    const/4 v12, 0x4

    .line 137
    const-string v6, "\u52a0\u5165\u9519\u9898\u96c6"

    const/4 v7, 0x0

    invoke-static/range {v5 .. v12}, Lcom/zykj/mistake/feature/notebook/list/i1;->b(ILjava/lang/String;FZLr6/a;Landroidx/compose/runtime/Composer;II)V

    .line 138
    sget v5, Lcom/zykj/mistake/R$drawable;->ic_tag_edit:I

    .line 139
    move-object/from16 v6, v40

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    const/16 v36, 0x1

    xor-int/lit8 v8, v4, 0x1

    if-ne v0, v2, :cond_1b

    const/4 v9, 0x1

    goto :goto_10

    :cond_1b
    move v9, v3

    .line 140
    :goto_10
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    if-nez v9, :cond_1c

    .line 141
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v4, v6, :cond_1d

    .line 142
    :cond_1c
    new-instance v4, Lcom/zykj/mistake/feature/notebook/list/g1;

    const/4 v6, 0x4

    invoke-direct {v4, v13, v6}, Lcom/zykj/mistake/feature/notebook/list/g1;-><init>(Lr6/c;I)V

    .line 143
    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 144
    :cond_1d
    move-object v9, v4

    check-cast v9, Lr6/a;

    const/16 v11, 0x30

    const/4 v12, 0x4

    .line 145
    const-string v6, "\u6807\u7b7e"

    const/4 v7, 0x0

    invoke-static/range {v5 .. v12}, Lcom/zykj/mistake/feature/notebook/list/i1;->b(ILjava/lang/String;FZLr6/a;Landroidx/compose/runtime/Composer;II)V

    .line 146
    sget v5, Lcom/zykj/mistake/R$drawable;->ic_mistake_delete:I

    .line 147
    move-object/from16 v6, v40

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    const/16 v36, 0x1

    xor-int/lit8 v8, v4, 0x1

    if-ne v0, v2, :cond_1e

    move/from16 v9, v36

    goto :goto_11

    :cond_1e
    move v9, v3

    .line 148
    :goto_11
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    if-nez v9, :cond_1f

    .line 149
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v4, v6, :cond_20

    .line 150
    :cond_1f
    new-instance v4, Lcom/zykj/mistake/feature/notebook/list/g1;

    const/4 v6, 0x5

    invoke-direct {v4, v13, v6}, Lcom/zykj/mistake/feature/notebook/list/g1;-><init>(Lr6/c;I)V

    .line 151
    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 152
    :cond_20
    move-object v9, v4

    check-cast v9, Lr6/a;

    const/16 v11, 0x30

    const/4 v12, 0x4

    .line 153
    const-string v6, "\u5220\u9664"

    const/4 v7, 0x0

    invoke-static/range {v5 .. v12}, Lcom/zykj/mistake/feature/notebook/list/i1;->b(ILjava/lang/String;FZLr6/a;Landroidx/compose/runtime/Composer;II)V

    .line 154
    sget v5, Lcom/zykj/mistake/R$drawable;->ic_mistake_cancel:I

    if-ne v0, v2, :cond_21

    move/from16 v9, v36

    goto :goto_12

    :cond_21
    move v9, v3

    .line 155
    :goto_12
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    if-nez v9, :cond_22

    .line 156
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_23

    .line 157
    :cond_22
    new-instance v0, Lcom/zykj/mistake/feature/notebook/list/g1;

    const/4 v2, 0x6

    invoke-direct {v0, v13, v2}, Lcom/zykj/mistake/feature/notebook/list/g1;-><init>(Lr6/c;I)V

    .line 158
    invoke-interface {v10, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 159
    :cond_23
    move-object v9, v0

    check-cast v9, Lr6/a;

    const/16 v11, 0x30

    const/16 v12, 0xc

    .line 160
    const-string v6, "\u53d6\u6d88"

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v12}, Lcom/zykj/mistake/feature/notebook/list/i1;->b(ILjava/lang/String;FZLr6/a;Landroidx/compose/runtime/Composer;II)V

    .line 161
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto/16 :goto_1c

    :cond_24
    move-object/from16 v13, p1

    const/16 v2, 0x20

    const/16 v36, 0x1

    const v0, 0x22b64c2d

    .line 162
    invoke-interface {v10, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 163
    sget v5, Lcom/zykj/mistake/R$drawable;->ic_new_mistake:I

    shl-int/lit8 v0, v35, 0x6

    const v4, 0xe000

    and-int/2addr v0, v4

    or-int/lit8 v11, v0, 0x30

    const/16 v12, 0xc

    .line 164
    const-string v6, "\u65b0\u589e\u9519\u9898"

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v9, p2

    invoke-static/range {v5 .. v12}, Lcom/zykj/mistake/feature/notebook/list/i1;->b(ILjava/lang/String;FZLr6/a;Landroidx/compose/runtime/Composer;II)V

    .line 165
    invoke-interface/range {v42 .. v42}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_26

    if-eqz v41, :cond_25

    goto :goto_14

    :cond_25
    const v0, 0x219adabe

    .line 166
    invoke-interface {v10, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    :goto_13
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto/16 :goto_1b

    :cond_26
    :goto_14
    const v0, 0x22ba07ba

    invoke-interface {v10, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 167
    sget v5, Lcom/zykj/mistake/R$drawable;->ic_practice_switch:I

    .line 168
    iget-boolean v0, v1, Lcom/zykj/mistake/feature/notebook/list/e1;->c:Z

    if-eqz v0, :cond_27

    .line 169
    const-string v4, "\u7ec3\u4e60: \u5f00"

    :goto_15
    move-object v6, v4

    goto :goto_16

    :cond_27
    const-string v4, "\u7ec3\u4e60: \u5173"

    goto :goto_15

    :goto_16
    if-eqz v0, :cond_28

    move/from16 v7, v38

    goto :goto_17

    :cond_28
    const/high16 v14, 0x3f000000    # 0.5f

    move v7, v14

    :goto_17
    and-int/lit8 v0, v35, 0x70

    if-ne v0, v2, :cond_29

    move/from16 v9, v36

    goto :goto_18

    :cond_29
    move v9, v3

    .line 170
    :goto_18
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    if-nez v9, :cond_2a

    .line 171
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v8

    if-ne v4, v8, :cond_2b

    .line 172
    :cond_2a
    new-instance v4, Lcom/zykj/mistake/feature/notebook/detail/s3;

    const/16 v8, 0x16

    invoke-direct {v4, v13, v8}, Lcom/zykj/mistake/feature/notebook/detail/s3;-><init>(Lr6/c;I)V

    .line 173
    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 174
    :cond_2b
    move-object v9, v4

    check-cast v9, Lr6/a;

    const/4 v11, 0x0

    const/16 v12, 0x8

    const/4 v8, 0x0

    .line 175
    invoke-static/range {v5 .. v12}, Lcom/zykj/mistake/feature/notebook/list/i1;->b(ILjava/lang/String;FZLr6/a;Landroidx/compose/runtime/Composer;II)V

    .line 176
    sget v5, Lcom/zykj/mistake/R$drawable;->ic_manage_mistake:I

    if-ne v0, v2, :cond_2c

    move/from16 v9, v36

    goto :goto_19

    :cond_2c
    move v9, v3

    .line 177
    :goto_19
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    if-nez v9, :cond_2d

    .line 178
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v4, v6, :cond_2e

    .line 179
    :cond_2d
    new-instance v4, Lcom/zykj/mistake/feature/notebook/detail/s3;

    const/16 v6, 0x17

    invoke-direct {v4, v13, v6}, Lcom/zykj/mistake/feature/notebook/detail/s3;-><init>(Lr6/c;I)V

    .line 180
    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 181
    :cond_2e
    move-object v9, v4

    check-cast v9, Lr6/a;

    const/16 v11, 0x30

    const/16 v12, 0xc

    .line 182
    const-string v6, "\u7ba1\u7406"

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v12}, Lcom/zykj/mistake/feature/notebook/list/i1;->b(ILjava/lang/String;FZLr6/a;Landroidx/compose/runtime/Composer;II)V

    .line 183
    sget v5, Lcom/zykj/mistake/R$drawable;->ic_fliter_mistake:I

    if-ne v0, v2, :cond_2f

    move/from16 v9, v36

    goto :goto_1a

    :cond_2f
    move v9, v3

    .line 184
    :goto_1a
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    if-nez v9, :cond_30

    .line 185
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_31

    .line 186
    :cond_30
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/s3;

    const/16 v2, 0x18

    invoke-direct {v0, v13, v2}, Lcom/zykj/mistake/feature/notebook/detail/s3;-><init>(Lr6/c;I)V

    .line 187
    invoke-interface {v10, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 188
    :cond_31
    move-object v9, v0

    check-cast v9, Lr6/a;

    const/16 v11, 0x30

    const/16 v12, 0xc

    .line 189
    const-string v6, "\u7b5b\u9009"

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v12}, Lcom/zykj/mistake/feature/notebook/list/i1;->b(ILjava/lang/String;FZLr6/a;Landroidx/compose/runtime/Composer;II)V

    goto/16 :goto_13

    .line 190
    :goto_1b
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 191
    :goto_1c
    invoke-static {v10}, Landroidx/collection/a;->D(Landroidx/compose/runtime/Composer;)Z

    move-result v0

    if-eqz v0, :cond_33

    .line 192
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_1d

    :catchall_1
    move-exception v0

    .line 193
    invoke-virtual {v6, v2}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pop(I)V

    throw v0

    :catchall_2
    move-exception v0

    .line 194
    invoke-virtual {v6, v2}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pop(I)V

    throw v0

    :cond_32
    move-object v13, v2

    .line 195
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 196
    :cond_33
    :goto_1d
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v6

    if-eqz v6, :cond_34

    new-instance v0, Landroidx/lifecycle/compose/g;

    const/16 v5, 0xf

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object v2, v13

    invoke-direct/range {v0 .. v5}, Landroidx/lifecycle/compose/g;-><init>(Ljava/lang/Object;Lr6/c;Ljava/lang/Object;II)V

    invoke-interface {v6, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    :cond_34
    return-void
.end method

.method public static final g(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    const v2, 0x34d21a54

    .line 6
    .line 7
    .line 8
    move-object/from16 v3, p1

    .line 9
    .line 10
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v10

    .line 14
    and-int/lit8 v3, v1, 0x6

    .line 15
    .line 16
    const/4 v4, 0x2

    .line 17
    if-nez v3, :cond_1

    .line 18
    .line 19
    invoke-interface {v10, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    const/4 v3, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v3, v4

    .line 28
    :goto_0
    or-int/2addr v3, v1

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move v3, v1

    .line 31
    :goto_1
    and-int/lit8 v5, v3, 0x3

    .line 32
    .line 33
    const/4 v13, 0x0

    .line 34
    const/4 v6, 0x1

    .line 35
    if-eq v5, v4, :cond_2

    .line 36
    .line 37
    move v4, v6

    .line 38
    goto :goto_2

    .line 39
    :cond_2
    move v4, v13

    .line 40
    :goto_2
    and-int/lit8 v5, v3, 0x1

    .line 41
    .line 42
    invoke-interface {v10, v4, v5}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    const/4 v5, 0x3

    .line 47
    if-eqz v4, :cond_b

    .line 48
    .line 49
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-eqz v4, :cond_3

    .line 54
    .line 55
    const/4 v4, -0x1

    .line 56
    const-string v7, "com.zykj.mistake.feature.notebook.list.MistakeStemImage (MistakeNotebookScreen.kt:330)"

    .line 57
    .line 58
    invoke-static {v2, v3, v4, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :cond_3
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 62
    .line 63
    const/4 v4, 0x0

    .line 64
    const/4 v7, 0x0

    .line 65
    invoke-static {v2, v4, v6, v7}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    sget v9, Lcom/zykj/mistake/feature/notebook/list/i1;->b:F

    .line 70
    .line 71
    invoke-static {v8, v9}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    sget-object v9, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 76
    .line 77
    invoke-virtual {v9}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 78
    .line 79
    .line 80
    move-result-wide v11

    .line 81
    int-to-float v9, v5

    .line 82
    invoke-static {v9, v8, v11, v12}, Landroidx/compose/material3/c;->f(FLandroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    .line 83
    .line 84
    .line 85
    move-result-object v8

    .line 86
    sget-object v9, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 87
    .line 88
    invoke-virtual {v9}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 89
    .line 90
    .line 91
    move-result-object v11

    .line 92
    invoke-static {v11, v13}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 93
    .line 94
    .line 95
    move-result-object v11

    .line 96
    invoke-static {v10, v13}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 97
    .line 98
    .line 99
    move-result v12

    .line 100
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 101
    .line 102
    .line 103
    move-result-object v14

    .line 104
    invoke-static {v10, v8}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    sget-object v15, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 109
    .line 110
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 115
    .line 116
    .line 117
    move-result-object v16

    .line 118
    if-nez v16, :cond_4

    .line 119
    .line 120
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 121
    .line 122
    .line 123
    :cond_4
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 124
    .line 125
    .line 126
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 127
    .line 128
    .line 129
    move-result v16

    .line 130
    if-eqz v16, :cond_5

    .line 131
    .line 132
    invoke-interface {v10, v5}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 133
    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_5
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 137
    .line 138
    .line 139
    :goto_3
    invoke-static {v10}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    invoke-static {v15, v5, v11, v5, v14}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 144
    .line 145
    .line 146
    move-result-object v11

    .line 147
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 148
    .line 149
    .line 150
    move-result v14

    .line 151
    if-nez v14, :cond_6

    .line 152
    .line 153
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v14

    .line 157
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    invoke-static {v14, v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    if-nez v4, :cond_7

    .line 166
    .line 167
    :cond_6
    invoke-static {v12, v5, v12, v11}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 168
    .line 169
    .line 170
    :cond_7
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    invoke-static {v5, v8, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 175
    .line 176
    .line 177
    sget-object v4, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 178
    .line 179
    invoke-static {v0}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 180
    .line 181
    .line 182
    move-result v4

    .line 183
    if-eqz v4, :cond_8

    .line 184
    .line 185
    const v2, -0x19c027ce

    .line 186
    .line 187
    .line 188
    invoke-interface {v10, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 189
    .line 190
    .line 191
    const-wide v2, 0xffb5b5b5L

    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 197
    .line 198
    .line 199
    move-result-wide v5

    .line 200
    const/16 v2, 0xc

    .line 201
    .line 202
    invoke-static {v2}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 203
    .line 204
    .line 205
    move-result-wide v7

    .line 206
    const/16 v26, 0x0

    .line 207
    .line 208
    const v27, 0x1fff2

    .line 209
    .line 210
    .line 211
    const-string v3, "\u6682\u65e0\u9898\u5e72"

    .line 212
    .line 213
    const/4 v4, 0x0

    .line 214
    const/4 v9, 0x0

    .line 215
    move-object/from16 v24, v10

    .line 216
    .line 217
    const/4 v10, 0x0

    .line 218
    const/4 v11, 0x0

    .line 219
    const-wide/16 v12, 0x0

    .line 220
    .line 221
    const/4 v14, 0x0

    .line 222
    const/4 v15, 0x0

    .line 223
    const-wide/16 v16, 0x0

    .line 224
    .line 225
    const/16 v18, 0x0

    .line 226
    .line 227
    const/16 v19, 0x0

    .line 228
    .line 229
    const/16 v20, 0x0

    .line 230
    .line 231
    const/16 v21, 0x0

    .line 232
    .line 233
    const/16 v22, 0x0

    .line 234
    .line 235
    const/16 v23, 0x0

    .line 236
    .line 237
    const/16 v25, 0xd86

    .line 238
    .line 239
    const/4 v2, 0x3

    .line 240
    invoke-static/range {v3 .. v27}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 241
    .line 242
    .line 243
    move-object/from16 v10, v24

    .line 244
    .line 245
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 246
    .line 247
    .line 248
    move v14, v2

    .line 249
    goto :goto_8

    .line 250
    :cond_8
    const/4 v14, 0x3

    .line 251
    const v4, -0x19bd8e84

    .line 252
    .line 253
    .line 254
    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 255
    .line 256
    .line 257
    and-int/lit8 v3, v3, 0xe

    .line 258
    .line 259
    invoke-static {v0, v10, v3}, Lcoil3/compose/o;->a(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Lcoil3/compose/AsyncImagePainter;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    iget-object v4, v3, Lcoil3/compose/AsyncImagePainter;->p:Lkotlinx/coroutines/flow/a0;

    .line 264
    .line 265
    invoke-static {v4, v7, v10, v13, v6}, Landroidx/compose/runtime/SnapshotStateKt;->collectAsState(Lkotlinx/coroutines/flow/m0;Lh6/h;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    .line 266
    .line 267
    .line 268
    move-result-object v4

    .line 269
    invoke-interface {v4}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v4

    .line 273
    check-cast v4, Lcoil3/compose/i;

    .line 274
    .line 275
    instance-of v15, v4, Lcoil3/compose/f;

    .line 276
    .line 277
    const v4, -0x1a7fc818

    .line 278
    .line 279
    .line 280
    if-nez v15, :cond_9

    .line 281
    .line 282
    const v5, -0x19ba0a8c

    .line 283
    .line 284
    .line 285
    invoke-interface {v10, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v9}, Landroidx/compose/ui/Alignment$Companion;->getTopCenter()Landroidx/compose/ui/Alignment;

    .line 289
    .line 290
    .line 291
    move-result-object v5

    .line 292
    sget-object v8, Landroidx/compose/ui/layout/ContentScale;->Companion:Landroidx/compose/ui/layout/ContentScale$Companion;

    .line 293
    .line 294
    invoke-virtual {v8}, Landroidx/compose/ui/layout/ContentScale$Companion;->getFillWidth()Landroidx/compose/ui/layout/ContentScale;

    .line 295
    .line 296
    .line 297
    move-result-object v8

    .line 298
    const/4 v9, 0x0

    .line 299
    invoke-static {v2, v9, v6, v7}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    const/16 v11, 0x6db0

    .line 304
    .line 305
    const/16 v12, 0x60

    .line 306
    .line 307
    move v6, v4

    .line 308
    const/4 v4, 0x0

    .line 309
    move-object v7, v8

    .line 310
    const/4 v8, 0x0

    .line 311
    const/4 v9, 0x0

    .line 312
    move-object/from16 v28, v5

    .line 313
    .line 314
    move-object v5, v2

    .line 315
    move v2, v6

    .line 316
    move-object/from16 v6, v28

    .line 317
    .line 318
    invoke-static/range {v3 .. v12}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 319
    .line 320
    .line 321
    :goto_4
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 322
    .line 323
    .line 324
    goto :goto_5

    .line 325
    :cond_9
    move v2, v4

    .line 326
    invoke-interface {v10, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 327
    .line 328
    .line 329
    goto :goto_4

    .line 330
    :goto_5
    if-eqz v15, :cond_a

    .line 331
    .line 332
    const v2, -0x19b50ab5

    .line 333
    .line 334
    .line 335
    invoke-interface {v10, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 336
    .line 337
    .line 338
    invoke-static {v10, v13}, Lcom/zykj/mistake/feature/notebook/list/i1;->h(Landroidx/compose/runtime/Composer;I)V

    .line 339
    .line 340
    .line 341
    :goto_6
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 342
    .line 343
    .line 344
    goto :goto_7

    .line 345
    :cond_a
    invoke-interface {v10, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 346
    .line 347
    .line 348
    goto :goto_6

    .line 349
    :goto_7
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 350
    .line 351
    .line 352
    :goto_8
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 353
    .line 354
    .line 355
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 356
    .line 357
    .line 358
    move-result v2

    .line 359
    if-eqz v2, :cond_c

    .line 360
    .line 361
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 362
    .line 363
    .line 364
    goto :goto_9

    .line 365
    :cond_b
    move v14, v5

    .line 366
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 367
    .line 368
    .line 369
    :cond_c
    :goto_9
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 370
    .line 371
    .line 372
    move-result-object v2

    .line 373
    if-eqz v2, :cond_d

    .line 374
    .line 375
    new-instance v3, Lcom/zykj/mistake/feature/collection/component/m;

    .line 376
    .line 377
    invoke-direct {v3, v0, v1, v14}, Lcom/zykj/mistake/feature/collection/component/m;-><init>(Ljava/lang/String;II)V

    .line 378
    .line 379
    .line 380
    invoke-interface {v2, v3}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 381
    .line 382
    .line 383
    :cond_d
    return-void
.end method

.method public static final h(Landroidx/compose/runtime/Composer;I)V
    .locals 27

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    const v1, 0x1d6fdc55

    .line 4
    .line 5
    .line 6
    move-object/from16 v2, p0

    .line 7
    .line 8
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 9
    .line 10
    .line 11
    move-result-object v9

    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v3, v2

    .line 18
    :goto_0
    and-int/lit8 v4, v0, 0x1

    .line 19
    .line 20
    invoke-interface {v9, v3, v4}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_6

    .line 25
    .line 26
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    const/4 v3, -0x1

    .line 33
    const-string v4, "com.zykj.mistake.feature.notebook.list.MistakeStemLoadErrorContent (MistakeNotebookScreen.kt:365)"

    .line 34
    .line 35
    invoke-static {v1, v0, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    sget-object v1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 39
    .line 40
    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    sget-object v12, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 45
    .line 46
    sget-object v3, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 47
    .line 48
    invoke-virtual {v3}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    const/16 v4, 0x30

    .line 53
    .line 54
    invoke-static {v3, v1, v9, v4}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-static {v9, v2}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-static {v9, v12}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    sget-object v6, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 71
    .line 72
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    if-nez v8, :cond_2

    .line 81
    .line 82
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 83
    .line 84
    .line 85
    :cond_2
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 86
    .line 87
    .line 88
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    if-eqz v8, :cond_3

    .line 93
    .line 94
    invoke-interface {v9, v7}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_3
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 99
    .line 100
    .line 101
    :goto_1
    invoke-static {v9}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    invoke-static {v6, v7, v1, v7, v4}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    if-nez v4, :cond_4

    .line 114
    .line 115
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    if-nez v4, :cond_5

    .line 128
    .line 129
    :cond_4
    invoke-static {v3, v7, v3, v1}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 130
    .line 131
    .line 132
    :cond_5
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-static {v7, v5, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 137
    .line 138
    .line 139
    sget-object v1, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 140
    .line 141
    sget v1, Lcom/zykj/mistake/R$drawable;->ic_answer_load_error:I

    .line 142
    .line 143
    invoke-static {v1, v9, v2}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    const/16 v1, 0x28

    .line 148
    .line 149
    int-to-float v1, v1

    .line 150
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    invoke-static {v12, v1}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    const/16 v10, 0x1b0

    .line 159
    .line 160
    const/16 v11, 0x78

    .line 161
    .line 162
    const-string v3, "\u52a0\u8f7d\u5931\u8d25"

    .line 163
    .line 164
    const/4 v5, 0x0

    .line 165
    const/4 v6, 0x0

    .line 166
    const/4 v7, 0x0

    .line 167
    const/4 v8, 0x0

    .line 168
    invoke-static/range {v2 .. v11}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 169
    .line 170
    .line 171
    const/16 v1, 0x8

    .line 172
    .line 173
    int-to-float v1, v1

    .line 174
    const/4 v2, 0x6

    .line 175
    invoke-static {v1, v12, v9, v2}, Landroidx/compose/material3/c;->s(FLandroidx/compose/ui/Modifier$Companion;Landroidx/compose/runtime/Composer;I)V

    .line 176
    .line 177
    .line 178
    const-wide v1, 0xff999999L

    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 184
    .line 185
    .line 186
    move-result-wide v4

    .line 187
    const/16 v1, 0xd

    .line 188
    .line 189
    invoke-static {v1}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 190
    .line 191
    .line 192
    move-result-wide v6

    .line 193
    const/16 v25, 0x0

    .line 194
    .line 195
    const v26, 0x1fff2

    .line 196
    .line 197
    .line 198
    const-string v2, "\u52a0\u8f7d\u5931\u8d25"

    .line 199
    .line 200
    const/4 v3, 0x0

    .line 201
    move-object/from16 v23, v9

    .line 202
    .line 203
    const/4 v9, 0x0

    .line 204
    const/4 v10, 0x0

    .line 205
    const-wide/16 v11, 0x0

    .line 206
    .line 207
    const/4 v13, 0x0

    .line 208
    const/4 v14, 0x0

    .line 209
    const-wide/16 v15, 0x0

    .line 210
    .line 211
    const/16 v17, 0x0

    .line 212
    .line 213
    const/16 v18, 0x0

    .line 214
    .line 215
    const/16 v19, 0x0

    .line 216
    .line 217
    const/16 v20, 0x0

    .line 218
    .line 219
    const/16 v21, 0x0

    .line 220
    .line 221
    const/16 v22, 0x0

    .line 222
    .line 223
    const/16 v24, 0xd86

    .line 224
    .line 225
    invoke-static/range {v2 .. v26}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 226
    .line 227
    .line 228
    invoke-interface/range {v23 .. v23}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 229
    .line 230
    .line 231
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 232
    .line 233
    .line 234
    move-result v1

    .line 235
    if-eqz v1, :cond_7

    .line 236
    .line 237
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 238
    .line 239
    .line 240
    goto :goto_2

    .line 241
    :cond_6
    move-object/from16 v23, v9

    .line 242
    .line 243
    invoke-interface/range {v23 .. v23}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 244
    .line 245
    .line 246
    :cond_7
    :goto_2
    invoke-interface/range {v23 .. v23}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    if-eqz v1, :cond_8

    .line 251
    .line 252
    new-instance v2, Lcom/zykj/mistake/feature/notebook/detail/x;

    .line 253
    .line 254
    const/4 v3, 0x2

    .line 255
    invoke-direct {v2, v0, v3}, Lcom/zykj/mistake/feature/notebook/detail/x;-><init>(II)V

    .line 256
    .line 257
    .line 258
    invoke-interface {v1, v2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 259
    .line 260
    .line 261
    :cond_8
    return-void
.end method

.method public static final i(ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 11

    .line 1
    const v0, 0x7b100f4f

    .line 2
    .line 3
    .line 4
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 5
    .line 6
    .line 7
    move-result-object v8

    .line 8
    and-int/lit8 p2, p3, 0x6

    .line 9
    .line 10
    if-nez p2, :cond_1

    .line 11
    .line 12
    invoke-interface {v8, p0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    const/4 p2, 0x4

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p2, 0x2

    .line 21
    :goto_0
    or-int/2addr p2, p3

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move p2, p3

    .line 24
    :goto_1
    and-int/lit8 v1, p3, 0x30

    .line 25
    .line 26
    if-nez v1, :cond_3

    .line 27
    .line 28
    invoke-interface {v8, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    const/16 v1, 0x20

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    const/16 v1, 0x10

    .line 38
    .line 39
    :goto_2
    or-int/2addr p2, v1

    .line 40
    :cond_3
    and-int/lit8 v1, p2, 0x13

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    const/16 v3, 0x12

    .line 44
    .line 45
    if-eq v1, v3, :cond_4

    .line 46
    .line 47
    const/4 v1, 0x1

    .line 48
    goto :goto_3

    .line 49
    :cond_4
    move v1, v2

    .line 50
    :goto_3
    and-int/lit8 v4, p2, 0x1

    .line 51
    .line 52
    invoke-interface {v8, v1, v4}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_8

    .line 57
    .line 58
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_5

    .line 63
    .line 64
    const/4 v1, -0x1

    .line 65
    const-string v4, "com.zykj.mistake.feature.notebook.list.SelectionIndicator (MistakeNotebookScreen.kt:314)"

    .line 66
    .line 67
    invoke-static {v0, p2, v1, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :cond_5
    if-eqz p0, :cond_6

    .line 71
    .line 72
    sget p2, Lcom/zykj/mistake/R$drawable;->ic_mistake_selected:I

    .line 73
    .line 74
    goto :goto_4

    .line 75
    :cond_6
    sget p2, Lcom/zykj/mistake/R$drawable;->ic_mistake_unselected:I

    .line 76
    .line 77
    :goto_4
    invoke-static {p2, v8, v2}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    if-eqz p0, :cond_7

    .line 82
    .line 83
    const-string p2, "\u5df2\u9009\u62e9"

    .line 84
    .line 85
    :goto_5
    move-object v2, p2

    .line 86
    goto :goto_6

    .line 87
    :cond_7
    const-string p2, "\u672a\u9009\u62e9"

    .line 88
    .line 89
    goto :goto_5

    .line 90
    :goto_6
    int-to-float p2, v3

    .line 91
    invoke-static {p2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 92
    .line 93
    .line 94
    move-result p2

    .line 95
    invoke-static {p1, p2}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    const/4 v9, 0x0

    .line 100
    const/16 v10, 0x78

    .line 101
    .line 102
    const/4 v4, 0x0

    .line 103
    const/4 v5, 0x0

    .line 104
    const/4 v6, 0x0

    .line 105
    const/4 v7, 0x0

    .line 106
    invoke-static/range {v1 .. v10}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 107
    .line 108
    .line 109
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    if-eqz p2, :cond_9

    .line 114
    .line 115
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 116
    .line 117
    .line 118
    goto :goto_7

    .line 119
    :cond_8
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 120
    .line 121
    .line 122
    :cond_9
    :goto_7
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    if-eqz p2, :cond_a

    .line 127
    .line 128
    new-instance v0, Lcom/zykj/mistake/feature/ask/i0;

    .line 129
    .line 130
    const/4 v1, 0x2

    .line 131
    invoke-direct {v0, p0, p1, p3, v1}, Lcom/zykj/mistake/feature/ask/i0;-><init>(ZLandroidx/compose/ui/Modifier;II)V

    .line 132
    .line 133
    .line 134
    invoke-interface {p2, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 135
    .line 136
    .line 137
    :cond_a
    return-void
.end method
