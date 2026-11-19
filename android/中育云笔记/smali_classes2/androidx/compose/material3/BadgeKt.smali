.class public final Landroidx/compose/material3/BadgeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final BadgeOffset:F

.field private static final BadgeWithContentHorizontalOffset:F

.field private static final BadgeWithContentHorizontalPadding:F

.field private static final BadgeWithContentVerticalOffset:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    int-to-float v0, v0

    .line 3
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sput v0, Landroidx/compose/material3/BadgeKt;->BadgeWithContentHorizontalPadding:F

    .line 8
    .line 9
    const/16 v0, 0xc

    .line 10
    .line 11
    int-to-float v0, v0

    .line 12
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    sput v0, Landroidx/compose/material3/BadgeKt;->BadgeWithContentHorizontalOffset:F

    .line 17
    .line 18
    const/16 v0, 0xe

    .line 19
    .line 20
    int-to-float v0, v0

    .line 21
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    sput v0, Landroidx/compose/material3/BadgeKt;->BadgeWithContentVerticalOffset:F

    .line 26
    .line 27
    const/4 v0, 0x6

    .line 28
    int-to-float v0, v0

    .line 29
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    sput v0, Landroidx/compose/material3/BadgeKt;->BadgeOffset:F

    .line 34
    .line 35
    return-void
.end method

.method public static final Badge-eopBjH0(Landroidx/compose/ui/Modifier;JJLhd/q;Landroidx/compose/runtime/Composer;II)V
    .locals 17
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "JJ",
            "Lhd/q;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move/from16 v7, p7

    .line 2
    .line 3
    const v0, 0x4d601b49    # 2.3499278E8f

    .line 4
    .line 5
    .line 6
    move-object/from16 v1, p6

    .line 7
    .line 8
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    and-int/lit8 v2, p8, 0x1

    .line 13
    .line 14
    const/4 v3, 0x2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    or-int/lit8 v4, v7, 0x6

    .line 18
    .line 19
    move v5, v4

    .line 20
    move-object/from16 v4, p0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    and-int/lit8 v4, v7, 0x6

    .line 24
    .line 25
    if-nez v4, :cond_2

    .line 26
    .line 27
    move-object/from16 v4, p0

    .line 28
    .line 29
    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-eqz v5, :cond_1

    .line 34
    .line 35
    const/4 v5, 0x4

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move v5, v3

    .line 38
    :goto_0
    or-int/2addr v5, v7

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move-object/from16 v4, p0

    .line 41
    .line 42
    move v5, v7

    .line 43
    :goto_1
    and-int/lit8 v6, v7, 0x30

    .line 44
    .line 45
    if-nez v6, :cond_4

    .line 46
    .line 47
    and-int/lit8 v6, p8, 0x2

    .line 48
    .line 49
    move-wide/from16 v8, p1

    .line 50
    .line 51
    if-nez v6, :cond_3

    .line 52
    .line 53
    invoke-interface {v1, v8, v9}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    if-eqz v6, :cond_3

    .line 58
    .line 59
    const/16 v6, 0x20

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    const/16 v6, 0x10

    .line 63
    .line 64
    :goto_2
    or-int/2addr v5, v6

    .line 65
    goto :goto_3

    .line 66
    :cond_4
    move-wide/from16 v8, p1

    .line 67
    .line 68
    :goto_3
    and-int/lit16 v6, v7, 0x180

    .line 69
    .line 70
    if-nez v6, :cond_6

    .line 71
    .line 72
    and-int/lit8 v6, p8, 0x4

    .line 73
    .line 74
    move-wide/from16 v10, p3

    .line 75
    .line 76
    if-nez v6, :cond_5

    .line 77
    .line 78
    invoke-interface {v1, v10, v11}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    if-eqz v6, :cond_5

    .line 83
    .line 84
    const/16 v6, 0x100

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_5
    const/16 v6, 0x80

    .line 88
    .line 89
    :goto_4
    or-int/2addr v5, v6

    .line 90
    goto :goto_5

    .line 91
    :cond_6
    move-wide/from16 v10, p3

    .line 92
    .line 93
    :goto_5
    and-int/lit8 v6, p8, 0x8

    .line 94
    .line 95
    if-eqz v6, :cond_8

    .line 96
    .line 97
    or-int/lit16 v5, v5, 0xc00

    .line 98
    .line 99
    :cond_7
    move-object/from16 v12, p5

    .line 100
    .line 101
    goto :goto_7

    .line 102
    :cond_8
    and-int/lit16 v12, v7, 0xc00

    .line 103
    .line 104
    if-nez v12, :cond_7

    .line 105
    .line 106
    move-object/from16 v12, p5

    .line 107
    .line 108
    invoke-interface {v1, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v13

    .line 112
    if-eqz v13, :cond_9

    .line 113
    .line 114
    const/16 v13, 0x800

    .line 115
    .line 116
    goto :goto_6

    .line 117
    :cond_9
    const/16 v13, 0x400

    .line 118
    .line 119
    :goto_6
    or-int/2addr v5, v13

    .line 120
    :goto_7
    and-int/lit16 v13, v5, 0x493

    .line 121
    .line 122
    const/16 v14, 0x492

    .line 123
    .line 124
    if-ne v13, v14, :cond_b

    .line 125
    .line 126
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 127
    .line 128
    .line 129
    move-result v13

    .line 130
    if-nez v13, :cond_a

    .line 131
    .line 132
    goto :goto_9

    .line 133
    :cond_a
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 134
    .line 135
    .line 136
    move-object v0, v1

    .line 137
    move-object v1, v4

    .line 138
    :goto_8
    move-wide v2, v8

    .line 139
    move-wide v4, v10

    .line 140
    move-object v6, v12

    .line 141
    goto/16 :goto_12

    .line 142
    .line 143
    :cond_b
    :goto_9
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 144
    .line 145
    .line 146
    and-int/lit8 v13, v7, 0x1

    .line 147
    .line 148
    const/4 v14, 0x0

    .line 149
    const/4 v15, 0x6

    .line 150
    if-eqz v13, :cond_f

    .line 151
    .line 152
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 153
    .line 154
    .line 155
    move-result v13

    .line 156
    if-eqz v13, :cond_c

    .line 157
    .line 158
    goto :goto_a

    .line 159
    :cond_c
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 160
    .line 161
    .line 162
    and-int/lit8 v2, p8, 0x2

    .line 163
    .line 164
    if-eqz v2, :cond_d

    .line 165
    .line 166
    and-int/lit8 v5, v5, -0x71

    .line 167
    .line 168
    :cond_d
    and-int/lit8 v2, p8, 0x4

    .line 169
    .line 170
    if-eqz v2, :cond_e

    .line 171
    .line 172
    and-int/lit16 v5, v5, -0x381

    .line 173
    .line 174
    :cond_e
    move-object v2, v4

    .line 175
    goto :goto_c

    .line 176
    :cond_f
    :goto_a
    if-eqz v2, :cond_10

    .line 177
    .line 178
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 179
    .line 180
    goto :goto_b

    .line 181
    :cond_10
    move-object v2, v4

    .line 182
    :goto_b
    and-int/lit8 v4, p8, 0x2

    .line 183
    .line 184
    if-eqz v4, :cond_11

    .line 185
    .line 186
    sget-object v4, Landroidx/compose/material3/BadgeDefaults;->INSTANCE:Landroidx/compose/material3/BadgeDefaults;

    .line 187
    .line 188
    invoke-virtual {v4, v1, v15}, Landroidx/compose/material3/BadgeDefaults;->getContainerColor(Landroidx/compose/runtime/Composer;I)J

    .line 189
    .line 190
    .line 191
    move-result-wide v8

    .line 192
    and-int/lit8 v5, v5, -0x71

    .line 193
    .line 194
    :cond_11
    and-int/lit8 v4, p8, 0x4

    .line 195
    .line 196
    if-eqz v4, :cond_12

    .line 197
    .line 198
    shr-int/lit8 v4, v5, 0x3

    .line 199
    .line 200
    and-int/lit8 v4, v4, 0xe

    .line 201
    .line 202
    invoke-static {v8, v9, v1, v4}, Landroidx/compose/material3/ColorSchemeKt;->contentColorFor-ek8zF_U(JLandroidx/compose/runtime/Composer;I)J

    .line 203
    .line 204
    .line 205
    move-result-wide v10

    .line 206
    and-int/lit16 v4, v5, -0x381

    .line 207
    .line 208
    move v5, v4

    .line 209
    :cond_12
    if-eqz v6, :cond_13

    .line 210
    .line 211
    move-object v12, v14

    .line 212
    :cond_13
    :goto_c
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 213
    .line 214
    .line 215
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 216
    .line 217
    .line 218
    move-result v4

    .line 219
    if-eqz v4, :cond_14

    .line 220
    .line 221
    const/4 v4, -0x1

    .line 222
    const-string v6, "androidx.compose.material3.Badge (Badge.kt:183)"

    .line 223
    .line 224
    invoke-static {v0, v5, v4, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 225
    .line 226
    .line 227
    :cond_14
    sget-object v0, Landroidx/compose/material3/tokens/BadgeTokens;->INSTANCE:Landroidx/compose/material3/tokens/BadgeTokens;

    .line 228
    .line 229
    if-eqz v12, :cond_15

    .line 230
    .line 231
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/BadgeTokens;->getLargeSize-D9Ej5fM()F

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    goto :goto_d

    .line 236
    :cond_15
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/BadgeTokens;->getSize-D9Ej5fM()F

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    :goto_d
    if-eqz v12, :cond_16

    .line 241
    .line 242
    const v4, -0x4bce2552

    .line 243
    .line 244
    .line 245
    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 246
    .line 247
    .line 248
    sget-object v4, Landroidx/compose/material3/tokens/BadgeTokens;->INSTANCE:Landroidx/compose/material3/tokens/BadgeTokens;

    .line 249
    .line 250
    invoke-virtual {v4}, Landroidx/compose/material3/tokens/BadgeTokens;->getLargeShape()Landroidx/compose/material3/tokens/ShapeKeyTokens;

    .line 251
    .line 252
    .line 253
    move-result-object v4

    .line 254
    invoke-static {v4, v1, v15}, Landroidx/compose/material3/ShapesKt;->getValue(Landroidx/compose/material3/tokens/ShapeKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 259
    .line 260
    .line 261
    goto :goto_e

    .line 262
    :cond_16
    const v4, -0x4bcd452d

    .line 263
    .line 264
    .line 265
    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 266
    .line 267
    .line 268
    sget-object v4, Landroidx/compose/material3/tokens/BadgeTokens;->INSTANCE:Landroidx/compose/material3/tokens/BadgeTokens;

    .line 269
    .line 270
    invoke-virtual {v4}, Landroidx/compose/material3/tokens/BadgeTokens;->getShape()Landroidx/compose/material3/tokens/ShapeKeyTokens;

    .line 271
    .line 272
    .line 273
    move-result-object v4

    .line 274
    invoke-static {v4, v1, v15}, Landroidx/compose/material3/ShapesKt;->getValue(Landroidx/compose/material3/tokens/ShapeKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    .line 275
    .line 276
    .line 277
    move-result-object v4

    .line 278
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 279
    .line 280
    .line 281
    :goto_e
    invoke-static {v2, v0, v0}, Landroidx/compose/foundation/layout/SizeKt;->defaultMinSize-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    invoke-static {v0, v8, v9, v4}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    if-eqz v12, :cond_17

    .line 290
    .line 291
    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 292
    .line 293
    sget v6, Landroidx/compose/material3/BadgeKt;->BadgeWithContentHorizontalPadding:F

    .line 294
    .line 295
    const/4 v13, 0x0

    .line 296
    invoke-static {v4, v6, v13, v3, v14}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 297
    .line 298
    .line 299
    move-result-object v3

    .line 300
    goto :goto_f

    .line 301
    :cond_17
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 302
    .line 303
    :goto_f
    invoke-interface {v0, v3}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    sget-object v3, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 308
    .line 309
    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 310
    .line 311
    .line 312
    move-result-object v3

    .line 313
    sget-object v4, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 314
    .line 315
    invoke-virtual {v4}, Landroidx/compose/foundation/layout/Arrangement;->getCenter()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 316
    .line 317
    .line 318
    move-result-object v4

    .line 319
    const/16 v6, 0x36

    .line 320
    .line 321
    invoke-static {v4, v3, v1, v6}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 322
    .line 323
    .line 324
    move-result-object v3

    .line 325
    const/4 v4, 0x0

    .line 326
    invoke-static {v1, v4}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 327
    .line 328
    .line 329
    move-result v4

    .line 330
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 331
    .line 332
    .line 333
    move-result-object v13

    .line 334
    invoke-static {v1, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    sget-object v14, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 339
    .line 340
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lhd/a;

    .line 341
    .line 342
    .line 343
    move-result-object v6

    .line 344
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 345
    .line 346
    .line 347
    move-result-object v16

    .line 348
    if-nez v16, :cond_18

    .line 349
    .line 350
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 351
    .line 352
    .line 353
    :cond_18
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 354
    .line 355
    .line 356
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 357
    .line 358
    .line 359
    move-result v16

    .line 360
    if-eqz v16, :cond_19

    .line 361
    .line 362
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->createNode(Lhd/a;)V

    .line 363
    .line 364
    .line 365
    goto :goto_10

    .line 366
    :cond_19
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 367
    .line 368
    .line 369
    :goto_10
    invoke-static {v1}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 370
    .line 371
    .line 372
    move-result-object v6

    .line 373
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lhd/p;

    .line 374
    .line 375
    .line 376
    move-result-object v15

    .line 377
    invoke-static {v6, v3, v15}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lhd/p;

    .line 381
    .line 382
    .line 383
    move-result-object v3

    .line 384
    invoke-static {v6, v13, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lhd/p;

    .line 388
    .line 389
    .line 390
    move-result-object v3

    .line 391
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 392
    .line 393
    .line 394
    move-result v13

    .line 395
    if-nez v13, :cond_1a

    .line 396
    .line 397
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v13

    .line 401
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 402
    .line 403
    .line 404
    move-result-object v15

    .line 405
    invoke-static {v13, v15}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 406
    .line 407
    .line 408
    move-result v13

    .line 409
    if-nez v13, :cond_1b

    .line 410
    .line 411
    :cond_1a
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 412
    .line 413
    .line 414
    move-result-object v13

    .line 415
    invoke-interface {v6, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 416
    .line 417
    .line 418
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 419
    .line 420
    .line 421
    move-result-object v4

    .line 422
    invoke-interface {v6, v4, v3}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lhd/p;)V

    .line 423
    .line 424
    .line 425
    :cond_1b
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lhd/p;

    .line 426
    .line 427
    .line 428
    move-result-object v3

    .line 429
    invoke-static {v6, v0, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 430
    .line 431
    .line 432
    sget-object v0, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 433
    .line 434
    const v3, -0x65a4bbf9

    .line 435
    .line 436
    .line 437
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 438
    .line 439
    .line 440
    if-eqz v12, :cond_1c

    .line 441
    .line 442
    sget-object v3, Landroidx/compose/material3/tokens/BadgeTokens;->INSTANCE:Landroidx/compose/material3/tokens/BadgeTokens;

    .line 443
    .line 444
    invoke-virtual {v3}, Landroidx/compose/material3/tokens/BadgeTokens;->getLargeLabelTextFont()Landroidx/compose/material3/tokens/TypographyKeyTokens;

    .line 445
    .line 446
    .line 447
    move-result-object v3

    .line 448
    const/4 v4, 0x6

    .line 449
    invoke-static {v3, v1, v4}, Landroidx/compose/material3/TypographyKt;->getValue(Landroidx/compose/material3/tokens/TypographyKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;

    .line 450
    .line 451
    .line 452
    move-result-object v3

    .line 453
    new-instance v6, Landroidx/compose/material3/BadgeKt$Badge$1$1;

    .line 454
    .line 455
    invoke-direct {v6, v12, v0}, Landroidx/compose/material3/BadgeKt$Badge$1$1;-><init>(Lhd/q;Landroidx/compose/foundation/layout/RowScope;)V

    .line 456
    .line 457
    .line 458
    const v0, 0x2ade5802

    .line 459
    .line 460
    .line 461
    const/4 v13, 0x1

    .line 462
    const/16 v14, 0x36

    .line 463
    .line 464
    invoke-static {v0, v13, v6, v1, v14}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    shr-int/lit8 v4, v5, 0x6

    .line 469
    .line 470
    and-int/lit8 v4, v4, 0xe

    .line 471
    .line 472
    or-int/lit16 v4, v4, 0x180

    .line 473
    .line 474
    move-object/from16 p3, v0

    .line 475
    .line 476
    move-object/from16 p4, v1

    .line 477
    .line 478
    move-object/from16 p2, v3

    .line 479
    .line 480
    move/from16 p5, v4

    .line 481
    .line 482
    move-wide/from16 p0, v10

    .line 483
    .line 484
    invoke-static/range {p0 .. p5}, Landroidx/compose/material3/internal/ProvideContentColorTextStyleKt;->ProvideContentColorTextStyle-3J-VO9M(JLandroidx/compose/ui/text/TextStyle;Lhd/p;Landroidx/compose/runtime/Composer;I)V

    .line 485
    .line 486
    .line 487
    move-object/from16 v0, p4

    .line 488
    .line 489
    goto :goto_11

    .line 490
    :cond_1c
    move-object v0, v1

    .line 491
    :goto_11
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 492
    .line 493
    .line 494
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 495
    .line 496
    .line 497
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 498
    .line 499
    .line 500
    move-result v1

    .line 501
    if-eqz v1, :cond_1d

    .line 502
    .line 503
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 504
    .line 505
    .line 506
    :cond_1d
    move-object v1, v2

    .line 507
    goto/16 :goto_8

    .line 508
    .line 509
    :goto_12
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 510
    .line 511
    .line 512
    move-result-object v9

    .line 513
    if-eqz v9, :cond_1e

    .line 514
    .line 515
    new-instance v0, Landroidx/compose/material3/BadgeKt$Badge$2;

    .line 516
    .line 517
    move/from16 v8, p8

    .line 518
    .line 519
    invoke-direct/range {v0 .. v8}, Landroidx/compose/material3/BadgeKt$Badge$2;-><init>(Landroidx/compose/ui/Modifier;JJLhd/q;II)V

    .line 520
    .line 521
    .line 522
    invoke-interface {v9, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lhd/p;)V

    .line 523
    .line 524
    .line 525
    :cond_1e
    return-void
.end method

.method public static final BadgedBox(Lhd/q;Landroidx/compose/ui/Modifier;Lhd/q;Landroidx/compose/runtime/Composer;II)V
    .locals 17
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/q;",
            "Landroidx/compose/ui/Modifier;",
            "Lhd/q;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v4, p4

    const v0, 0x53afaf07

    move-object/from16 v2, p3

    .line 1
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v2

    and-int/lit8 v5, p5, 0x1

    if-eqz v5, :cond_0

    or-int/lit8 v5, v4, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v4, 0x6

    if-nez v5, :cond_2

    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v4

    goto :goto_1

    :cond_2
    move v5, v4

    :goto_1
    and-int/lit8 v6, p5, 0x2

    if-eqz v6, :cond_4

    or-int/lit8 v5, v5, 0x30

    :cond_3
    move-object/from16 v7, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v7, v4, 0x30

    if-nez v7, :cond_3

    move-object/from16 v7, p1

    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x20

    goto :goto_2

    :cond_5
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v5, v8

    :goto_3
    and-int/lit8 v8, p5, 0x4

    if-eqz v8, :cond_6

    or-int/lit16 v5, v5, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v4, 0x180

    if-nez v8, :cond_8

    invoke-interface {v2, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_4

    :cond_7
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v5, v8

    :cond_8
    :goto_5
    and-int/lit16 v8, v5, 0x93

    const/16 v9, 0x92

    if-ne v8, v9, :cond_a

    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v8

    if-nez v8, :cond_9

    goto :goto_6

    .line 2
    :cond_9
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v6, v7

    goto/16 :goto_b

    :cond_a
    :goto_6
    if-eqz v6, :cond_b

    .line 3
    sget-object v6, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    goto :goto_7

    :cond_b
    move-object v6, v7

    :goto_7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v7

    if-eqz v7, :cond_c

    const/4 v7, -0x1

    const-string v8, "androidx.compose.material3.BadgedBox (Badge.kt:72)"

    .line 4
    invoke-static {v0, v5, v7, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 5
    :cond_c
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .line 6
    sget-object v7, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v8

    const/4 v9, 0x0

    if-ne v0, v8, :cond_d

    .line 7
    invoke-static {v9}, Landroidx/compose/runtime/PrimitiveSnapshotStateKt;->mutableFloatStateOf(F)Landroidx/compose/runtime/MutableFloatState;

    move-result-object v0

    .line 8
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 9
    :cond_d
    check-cast v0, Landroidx/compose/runtime/MutableFloatState;

    .line 10
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v8

    .line 11
    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v10

    if-ne v8, v10, :cond_e

    .line 12
    invoke-static {v9}, Landroidx/compose/runtime/PrimitiveSnapshotStateKt;->mutableFloatStateOf(F)Landroidx/compose/runtime/MutableFloatState;

    move-result-object v8

    .line 13
    invoke-interface {v2, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 14
    :cond_e
    check-cast v8, Landroidx/compose/runtime/MutableFloatState;

    .line 15
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v9

    .line 16
    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v10

    if-ne v9, v10, :cond_f

    const/high16 v9, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 17
    invoke-static {v9}, Landroidx/compose/runtime/PrimitiveSnapshotStateKt;->mutableFloatStateOf(F)Landroidx/compose/runtime/MutableFloatState;

    move-result-object v9

    .line 18
    invoke-interface {v2, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 19
    :cond_f
    check-cast v9, Landroidx/compose/runtime/MutableFloatState;

    .line 20
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v10

    .line 21
    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v11

    if-ne v10, v11, :cond_10

    const/high16 v10, -0x800000    # Float.NEGATIVE_INFINITY

    .line 22
    invoke-static {v10}, Landroidx/compose/runtime/PrimitiveSnapshotStateKt;->mutableFloatStateOf(F)Landroidx/compose/runtime/MutableFloatState;

    move-result-object v10

    .line 23
    invoke-interface {v2, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 24
    :cond_10
    check-cast v10, Landroidx/compose/runtime/MutableFloatState;

    .line 25
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v11

    .line 26
    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v12

    if-ne v11, v12, :cond_11

    .line 27
    new-instance v11, Landroidx/compose/material3/BadgeKt$BadgedBox$2$1;

    invoke-direct {v11, v0, v8, v9, v10}, Landroidx/compose/material3/BadgeKt$BadgedBox$2$1;-><init>(Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableFloatState;)V

    .line 28
    invoke-interface {v2, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 29
    :cond_11
    check-cast v11, Lhd/l;

    invoke-static {v6, v11}, Landroidx/compose/ui/layout/OnGloballyPositionedModifierKt;->onGloballyPositioned(Landroidx/compose/ui/Modifier;Lhd/l;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    .line 30
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v12

    .line 31
    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v7

    if-ne v12, v7, :cond_12

    .line 32
    new-instance v12, Landroidx/compose/material3/BadgeKt$BadgedBox$3$1;

    invoke-direct {v12, v8, v0, v9, v10}, Landroidx/compose/material3/BadgeKt$BadgedBox$3$1;-><init>(Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableFloatState;)V

    .line 33
    invoke-interface {v2, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 34
    :cond_12
    check-cast v12, Landroidx/compose/ui/layout/MeasurePolicy;

    const/4 v0, 0x0

    .line 35
    invoke-static {v2, v0}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v7

    .line 36
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v8

    .line 37
    invoke-static {v2, v11}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    .line 38
    sget-object v10, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lhd/a;

    move-result-object v11

    .line 39
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v13

    if-nez v13, :cond_13

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 40
    :cond_13
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 41
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v13

    if-eqz v13, :cond_14

    .line 42
    invoke-interface {v2, v11}, Landroidx/compose/runtime/Composer;->createNode(Lhd/a;)V

    goto :goto_8

    .line 43
    :cond_14
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 44
    :goto_8
    invoke-static {v2}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v11

    .line 45
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lhd/p;

    move-result-object v13

    invoke-static {v11, v12, v13}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 46
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lhd/p;

    move-result-object v12

    invoke-static {v11, v8, v12}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 47
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lhd/p;

    move-result-object v8

    .line 48
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v12

    if-nez v12, :cond_15

    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_16

    .line 49
    :cond_15
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v11, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 50
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v11, v7, v8}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lhd/p;)V

    .line 51
    :cond_16
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lhd/p;

    move-result-object v7

    invoke-static {v11, v9, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 52
    sget-object v7, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    const-string v8, "anchor"

    invoke-static {v7, v8}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    .line 53
    sget-object v9, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v9}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    move-result-object v11

    shl-int/lit8 v12, v5, 0x3

    and-int/lit16 v12, v12, 0x1c00

    or-int/lit8 v12, v12, 0x36

    .line 54
    invoke-static {v11, v0}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v11

    .line 55
    invoke-static {v2, v0}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v13

    .line 56
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v14

    .line 57
    invoke-static {v2, v8}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    .line 58
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lhd/a;

    move-result-object v15

    .line 59
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v16

    if-nez v16, :cond_17

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 60
    :cond_17
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 61
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v16

    if-eqz v16, :cond_18

    .line 62
    invoke-interface {v2, v15}, Landroidx/compose/runtime/Composer;->createNode(Lhd/a;)V

    goto :goto_9

    .line 63
    :cond_18
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 64
    :goto_9
    invoke-static {v2}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v15

    .line 65
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lhd/p;

    move-result-object v0

    invoke-static {v15, v11, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 66
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lhd/p;

    move-result-object v0

    invoke-static {v15, v14, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 67
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lhd/p;

    move-result-object v0

    .line 68
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v11

    if-nez v11, :cond_19

    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v11, v14}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_1a

    .line 69
    :cond_19
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v15, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 70
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v15, v11, v0}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lhd/p;)V

    .line 71
    :cond_1a
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lhd/p;

    move-result-object v0

    invoke-static {v15, v8, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 72
    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    shr-int/lit8 v8, v12, 0x6

    and-int/lit8 v8, v8, 0x70

    or-int/lit8 v8, v8, 0x6

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v3, v0, v2, v8}, Lhd/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 74
    const-string v8, "badge"

    invoke-static {v7, v8}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    shl-int/lit8 v5, v5, 0x9

    and-int/lit16 v5, v5, 0x1c00

    or-int/lit8 v5, v5, 0x6

    .line 75
    invoke-virtual {v9}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    move-result-object v8

    const/4 v9, 0x0

    .line 76
    invoke-static {v8, v9}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v8

    .line 77
    invoke-static {v2, v9}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v9

    .line 78
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v11

    .line 79
    invoke-static {v2, v7}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    .line 80
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lhd/a;

    move-result-object v12

    .line 81
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v13

    if-nez v13, :cond_1b

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 82
    :cond_1b
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 83
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v13

    if-eqz v13, :cond_1c

    .line 84
    invoke-interface {v2, v12}, Landroidx/compose/runtime/Composer;->createNode(Lhd/a;)V

    goto :goto_a

    .line 85
    :cond_1c
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 86
    :goto_a
    invoke-static {v2}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v12

    .line 87
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lhd/p;

    move-result-object v13

    invoke-static {v12, v8, v13}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 88
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lhd/p;

    move-result-object v8

    invoke-static {v12, v11, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 89
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lhd/p;

    move-result-object v8

    .line 90
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v11

    if-nez v11, :cond_1d

    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v11, v13}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_1e

    .line 91
    :cond_1d
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v12, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 92
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v12, v9, v8}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lhd/p;)V

    .line 93
    :cond_1e
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lhd/p;

    move-result-object v8

    invoke-static {v12, v7, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    shr-int/lit8 v5, v5, 0x6

    and-int/lit8 v5, v5, 0x70

    or-int/lit8 v5, v5, 0x6

    .line 94
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v1, v0, v2, v5}, Lhd/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 96
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 97
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1f

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 98
    :cond_1f
    :goto_b
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v7

    if-eqz v7, :cond_20

    new-instance v0, Landroidx/compose/material3/BadgeKt$BadgedBox$4;

    move/from16 v5, p5

    move-object v2, v6

    invoke-direct/range {v0 .. v5}, Landroidx/compose/material3/BadgeKt$BadgedBox$4;-><init>(Lhd/q;Landroidx/compose/ui/Modifier;Lhd/q;II)V

    invoke-interface {v7, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lhd/p;)V

    :cond_20
    return-void
.end method

.method private static final BadgedBox$lambda$1(Landroidx/compose/runtime/MutableFloatState;)F
    .locals 0

    .line 1
    invoke-interface {p0}, Landroidx/compose/runtime/FloatState;->getFloatValue()F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final BadgedBox$lambda$10(Landroidx/compose/runtime/MutableFloatState;)F
    .locals 0

    .line 1
    invoke-interface {p0}, Landroidx/compose/runtime/FloatState;->getFloatValue()F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final BadgedBox$lambda$11(Landroidx/compose/runtime/MutableFloatState;F)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Landroidx/compose/runtime/MutableFloatState;->setFloatValue(F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final BadgedBox$lambda$2(Landroidx/compose/runtime/MutableFloatState;F)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Landroidx/compose/runtime/MutableFloatState;->setFloatValue(F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final BadgedBox$lambda$4(Landroidx/compose/runtime/MutableFloatState;)F
    .locals 0

    .line 1
    invoke-interface {p0}, Landroidx/compose/runtime/FloatState;->getFloatValue()F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final BadgedBox$lambda$5(Landroidx/compose/runtime/MutableFloatState;F)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Landroidx/compose/runtime/MutableFloatState;->setFloatValue(F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final BadgedBox$lambda$7(Landroidx/compose/runtime/MutableFloatState;)F
    .locals 0

    .line 1
    invoke-interface {p0}, Landroidx/compose/runtime/FloatState;->getFloatValue()F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final BadgedBox$lambda$8(Landroidx/compose/runtime/MutableFloatState;F)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Landroidx/compose/runtime/MutableFloatState;->setFloatValue(F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$BadgedBox$lambda$1(Landroidx/compose/runtime/MutableFloatState;)F
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/compose/material3/BadgeKt;->BadgedBox$lambda$1(Landroidx/compose/runtime/MutableFloatState;)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$BadgedBox$lambda$10(Landroidx/compose/runtime/MutableFloatState;)F
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/compose/material3/BadgeKt;->BadgedBox$lambda$10(Landroidx/compose/runtime/MutableFloatState;)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$BadgedBox$lambda$11(Landroidx/compose/runtime/MutableFloatState;F)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/material3/BadgeKt;->BadgedBox$lambda$11(Landroidx/compose/runtime/MutableFloatState;F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$BadgedBox$lambda$2(Landroidx/compose/runtime/MutableFloatState;F)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/material3/BadgeKt;->BadgedBox$lambda$2(Landroidx/compose/runtime/MutableFloatState;F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$BadgedBox$lambda$4(Landroidx/compose/runtime/MutableFloatState;)F
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/compose/material3/BadgeKt;->BadgedBox$lambda$4(Landroidx/compose/runtime/MutableFloatState;)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$BadgedBox$lambda$5(Landroidx/compose/runtime/MutableFloatState;F)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/material3/BadgeKt;->BadgedBox$lambda$5(Landroidx/compose/runtime/MutableFloatState;F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$BadgedBox$lambda$7(Landroidx/compose/runtime/MutableFloatState;)F
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/compose/material3/BadgeKt;->BadgedBox$lambda$7(Landroidx/compose/runtime/MutableFloatState;)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$BadgedBox$lambda$8(Landroidx/compose/runtime/MutableFloatState;F)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/material3/BadgeKt;->BadgedBox$lambda$8(Landroidx/compose/runtime/MutableFloatState;F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final getBadgeOffset()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/BadgeKt;->BadgeOffset:F

    .line 2
    .line 3
    return v0
.end method

.method public static final getBadgeWithContentHorizontalOffset()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/BadgeKt;->BadgeWithContentHorizontalOffset:F

    .line 2
    .line 3
    return v0
.end method

.method public static final getBadgeWithContentHorizontalPadding()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/BadgeKt;->BadgeWithContentHorizontalPadding:F

    .line 2
    .line 3
    return v0
.end method

.method public static final getBadgeWithContentVerticalOffset()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/BadgeKt;->BadgeWithContentVerticalOffset:F

    .line 2
    .line 3
    return v0
.end method
