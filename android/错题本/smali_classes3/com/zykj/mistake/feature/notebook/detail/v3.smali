.class public final synthetic Lcom/zykj/mistake/feature/notebook/detail/v3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:Lcom/zykj/mistake/feature/notebook/detail/l3;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lr6/a;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lr6/a;

.field public final synthetic f:Z

.field public final synthetic g:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/feature/notebook/detail/l3;Ljava/lang/String;Lr6/a;Ljava/lang/String;Lr6/a;ZLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/v3;->a:Lcom/zykj/mistake/feature/notebook/detail/l3;

    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/detail/v3;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/detail/v3;->c:Lr6/a;

    iput-object p4, p0, Lcom/zykj/mistake/feature/notebook/detail/v3;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/zykj/mistake/feature/notebook/detail/v3;->e:Lr6/a;

    iput-boolean p6, p0, Lcom/zykj/mistake/feature/notebook/detail/v3;->f:Z

    iput-object p7, p0, Lcom/zykj/mistake/feature/notebook/detail/v3;->g:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 36

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
    const/4 v11, 0x1

    .line 19
    const/4 v12, 0x0

    .line 20
    if-eq v2, v3, :cond_0

    .line 21
    .line 22
    move v2, v11

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v2, v12

    .line 25
    :goto_0
    and-int/lit8 v3, v1, 0x1

    .line 26
    .line 27
    invoke-interface {v8, v2, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_11

    .line 32
    .line 33
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    const/4 v2, -0x1

    .line 40
    const-string v3, "com.zykj.mistake.feature.notebook.detail.ReviewPracticeSummaryDialog.<anonymous> (MistakeDetailNewScreen.kt:364)"

    .line 41
    .line 42
    const v4, 0x14d98b0

    .line 43
    .line 44
    .line 45
    invoke-static {v4, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    sget-object v13, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 49
    .line 50
    const/16 v1, 0x1c6

    .line 51
    .line 52
    int-to-float v1, v1

    .line 53
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    invoke-static {v13, v1}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    sget-object v26, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 62
    .line 63
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 64
    .line 65
    .line 66
    move-result-wide v2

    .line 67
    const/4 v14, 0x6

    .line 68
    int-to-float v4, v14

    .line 69
    invoke-static {v4, v1, v2, v3}, Landroidx/compose/material3/c;->f(FLandroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    .line 70
    .line 71
    .line 72
    move-result-object v15

    .line 73
    sget-object v16, Landroidx/compose/ui/graphics/Brush;->Companion:Landroidx/compose/ui/graphics/Brush$Companion;

    .line 74
    .line 75
    const-wide v1, 0xffeaf4ffL

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 81
    .line 82
    .line 83
    move-result-wide v1

    .line 84
    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 89
    .line 90
    .line 91
    move-result-wide v2

    .line 92
    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    filled-new-array {v1, v2}, [Landroidx/compose/ui/graphics/Color;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-static {v1}, Lkotlin/collections/u;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object v17

    .line 104
    const/16 v21, 0xa

    .line 105
    .line 106
    const/16 v22, 0x0

    .line 107
    .line 108
    const/16 v18, 0x0

    .line 109
    .line 110
    const/high16 v19, 0x42f00000    # 120.0f

    .line 111
    .line 112
    const/16 v20, 0x0

    .line 113
    .line 114
    invoke-static/range {v16 .. v22}, Landroidx/compose/ui/graphics/Brush$Companion;->verticalGradient-8A-3gB4$default(Landroidx/compose/ui/graphics/Brush$Companion;Ljava/util/List;FFIILjava/lang/Object;)Landroidx/compose/ui/graphics/Brush;

    .line 115
    .line 116
    .line 117
    move-result-object v16

    .line 118
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    invoke-static {v1}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 123
    .line 124
    .line 125
    move-result-object v17

    .line 126
    const/16 v19, 0x4

    .line 127
    .line 128
    const/16 v20, 0x0

    .line 129
    .line 130
    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/BackgroundKt;->background$default(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    const/16 v2, 0x1a

    .line 135
    .line 136
    int-to-float v15, v2

    .line 137
    invoke-static {v15}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    const/16 v3, 0x18

    .line 142
    .line 143
    int-to-float v3, v3

    .line 144
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    invoke-static {v1, v2, v3}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    sget-object v27, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 153
    .line 154
    invoke-virtual/range {v27 .. v27}, Landroidx/compose/ui/Alignment$Companion;->getCenterHorizontally()Landroidx/compose/ui/Alignment$Horizontal;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    sget-object v28, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 159
    .line 160
    invoke-virtual/range {v28 .. v28}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    const/16 v4, 0x30

    .line 165
    .line 166
    invoke-static {v3, v2, v8, v4}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    invoke-static {v8, v12}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    invoke-static {v8, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    sget-object v6, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 183
    .line 184
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 185
    .line 186
    .line 187
    move-result-object v7

    .line 188
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 189
    .line 190
    .line 191
    move-result-object v9

    .line 192
    if-nez v9, :cond_2

    .line 193
    .line 194
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 195
    .line 196
    .line 197
    :cond_2
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 198
    .line 199
    .line 200
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 201
    .line 202
    .line 203
    move-result v9

    .line 204
    if-eqz v9, :cond_3

    .line 205
    .line 206
    invoke-interface {v8, v7}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 207
    .line 208
    .line 209
    goto :goto_1

    .line 210
    :cond_3
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 211
    .line 212
    .line 213
    :goto_1
    invoke-static {v8}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 214
    .line 215
    .line 216
    move-result-object v7

    .line 217
    invoke-static {v6, v7, v2, v7, v5}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 222
    .line 223
    .line 224
    move-result v5

    .line 225
    if-nez v5, :cond_4

    .line 226
    .line 227
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v5

    .line 231
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 232
    .line 233
    .line 234
    move-result-object v9

    .line 235
    invoke-static {v5, v9}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v5

    .line 239
    if-nez v5, :cond_5

    .line 240
    .line 241
    :cond_4
    invoke-static {v3, v7, v3, v2}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 242
    .line 243
    .line 244
    :cond_5
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    invoke-static {v7, v1, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 249
    .line 250
    .line 251
    sget-object v1, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 252
    .line 253
    invoke-virtual/range {v27 .. v27}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    invoke-virtual/range {v28 .. v28}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    invoke-static {v2, v1, v8, v4}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    invoke-static {v8, v12}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 266
    .line 267
    .line 268
    move-result v2

    .line 269
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    invoke-static {v8, v13}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 274
    .line 275
    .line 276
    move-result-object v5

    .line 277
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 278
    .line 279
    .line 280
    move-result-object v7

    .line 281
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 282
    .line 283
    .line 284
    move-result-object v9

    .line 285
    if-nez v9, :cond_6

    .line 286
    .line 287
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 288
    .line 289
    .line 290
    :cond_6
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 291
    .line 292
    .line 293
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 294
    .line 295
    .line 296
    move-result v9

    .line 297
    if-eqz v9, :cond_7

    .line 298
    .line 299
    invoke-interface {v8, v7}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 300
    .line 301
    .line 302
    goto :goto_2

    .line 303
    :cond_7
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 304
    .line 305
    .line 306
    :goto_2
    invoke-static {v8}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 307
    .line 308
    .line 309
    move-result-object v7

    .line 310
    invoke-static {v6, v7, v1, v7, v3}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 315
    .line 316
    .line 317
    move-result v3

    .line 318
    if-nez v3, :cond_8

    .line 319
    .line 320
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v3

    .line 324
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 325
    .line 326
    .line 327
    move-result-object v9

    .line 328
    invoke-static {v3, v9}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    move-result v3

    .line 332
    if-nez v3, :cond_9

    .line 333
    .line 334
    :cond_8
    invoke-static {v2, v7, v2, v1}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 335
    .line 336
    .line 337
    :cond_9
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    invoke-static {v7, v5, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 342
    .line 343
    .line 344
    sget-object v1, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 345
    .line 346
    iget-boolean v1, v0, Lcom/zykj/mistake/feature/notebook/detail/v3;->f:Z

    .line 347
    .line 348
    if-eqz v1, :cond_a

    .line 349
    .line 350
    const v1, -0x447f9b0

    .line 351
    .line 352
    .line 353
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 354
    .line 355
    .line 356
    sget v1, Lcom/zykj/mistake/R$drawable;->ic_fireworks:I

    .line 357
    .line 358
    invoke-static {v1, v8, v12}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 359
    .line 360
    .line 361
    move-result-object v1

    .line 362
    const/16 v2, 0x1c

    .line 363
    .line 364
    int-to-float v2, v2

    .line 365
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 366
    .line 367
    .line 368
    move-result v2

    .line 369
    invoke-static {v13, v2}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 370
    .line 371
    .line 372
    move-result-object v3

    .line 373
    const/16 v9, 0x1b0

    .line 374
    .line 375
    const/16 v10, 0x78

    .line 376
    .line 377
    const/4 v2, 0x0

    .line 378
    move v5, v4

    .line 379
    const/4 v4, 0x0

    .line 380
    move v7, v5

    .line 381
    const/4 v5, 0x0

    .line 382
    move-object/from16 v16, v6

    .line 383
    .line 384
    const/4 v6, 0x0

    .line 385
    move/from16 v17, v7

    .line 386
    .line 387
    const/4 v7, 0x0

    .line 388
    move-object/from16 p1, v16

    .line 389
    .line 390
    invoke-static/range {v1 .. v10}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 391
    .line 392
    .line 393
    const/16 v1, 0x8

    .line 394
    .line 395
    int-to-float v1, v1

    .line 396
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 397
    .line 398
    .line 399
    move-result v1

    .line 400
    invoke-static {v13, v1}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 401
    .line 402
    .line 403
    move-result-object v1

    .line 404
    invoke-static {v1, v8, v14}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 405
    .line 406
    .line 407
    :goto_3
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 408
    .line 409
    .line 410
    goto :goto_4

    .line 411
    :cond_a
    move-object/from16 p1, v6

    .line 412
    .line 413
    const v1, -0x53305a8

    .line 414
    .line 415
    .line 416
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 417
    .line 418
    .line 419
    goto :goto_3

    .line 420
    :goto_4
    const-wide v1, 0xff15171aL

    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 426
    .line 427
    .line 428
    move-result-wide v3

    .line 429
    const/16 v1, 0x12

    .line 430
    .line 431
    invoke-static {v1}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 432
    .line 433
    .line 434
    move-result-wide v5

    .line 435
    sget-object v1, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    .line 436
    .line 437
    invoke-virtual {v1}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    .line 438
    .line 439
    .line 440
    move-result-object v1

    .line 441
    const/16 v24, 0x0

    .line 442
    .line 443
    const v25, 0x1ffd2

    .line 444
    .line 445
    .line 446
    move-object/from16 v22, v8

    .line 447
    .line 448
    move-object v8, v1

    .line 449
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/v3;->g:Ljava/lang/String;

    .line 450
    .line 451
    const/4 v2, 0x0

    .line 452
    const/4 v7, 0x0

    .line 453
    const/4 v9, 0x0

    .line 454
    move/from16 v16, v11

    .line 455
    .line 456
    const-wide/16 v10, 0x0

    .line 457
    .line 458
    move/from16 v17, v12

    .line 459
    .line 460
    const/4 v12, 0x0

    .line 461
    move-object/from16 v18, v13

    .line 462
    .line 463
    const/4 v13, 0x0

    .line 464
    move/from16 v20, v14

    .line 465
    .line 466
    move/from16 v19, v15

    .line 467
    .line 468
    const-wide/16 v14, 0x0

    .line 469
    .line 470
    move/from16 v21, v16

    .line 471
    .line 472
    const/16 v16, 0x0

    .line 473
    .line 474
    move/from16 v23, v17

    .line 475
    .line 476
    const/16 v17, 0x0

    .line 477
    .line 478
    move-object/from16 v29, v18

    .line 479
    .line 480
    const/16 v18, 0x0

    .line 481
    .line 482
    move/from16 v30, v19

    .line 483
    .line 484
    const/16 v19, 0x0

    .line 485
    .line 486
    move/from16 v31, v20

    .line 487
    .line 488
    const/16 v20, 0x0

    .line 489
    .line 490
    move/from16 v32, v21

    .line 491
    .line 492
    const/16 v21, 0x0

    .line 493
    .line 494
    move/from16 v33, v23

    .line 495
    .line 496
    const v23, 0x30d80

    .line 497
    .line 498
    .line 499
    invoke-static/range {v1 .. v25}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 500
    .line 501
    .line 502
    move-object/from16 v8, v22

    .line 503
    .line 504
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 505
    .line 506
    .line 507
    const/16 v1, 0xa

    .line 508
    .line 509
    int-to-float v1, v1

    .line 510
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 511
    .line 512
    .line 513
    move-result v15

    .line 514
    const/16 v18, 0xd

    .line 515
    .line 516
    const/16 v19, 0x0

    .line 517
    .line 518
    const/4 v14, 0x0

    .line 519
    const/16 v16, 0x0

    .line 520
    .line 521
    const/16 v17, 0x0

    .line 522
    .line 523
    move-object/from16 v13, v29

    .line 524
    .line 525
    invoke-static/range {v13 .. v19}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 526
    .line 527
    .line 528
    move-result-object v1

    .line 529
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/detail/v3;->a:Lcom/zykj/mistake/feature/notebook/detail/l3;

    .line 530
    .line 531
    const/16 v5, 0x30

    .line 532
    .line 533
    invoke-static {v2, v1, v8, v5}, Lcom/zykj/mistake/feature/notebook/detail/x3;->d(Lcom/zykj/mistake/feature/notebook/detail/l3;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 534
    .line 535
    .line 536
    const/16 v1, 0x16

    .line 537
    .line 538
    int-to-float v1, v1

    .line 539
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 540
    .line 541
    .line 542
    move-result v15

    .line 543
    invoke-static/range {v13 .. v19}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 544
    .line 545
    .line 546
    move-result-object v1

    .line 547
    const/16 v3, 0xb0

    .line 548
    .line 549
    int-to-float v3, v3

    .line 550
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 551
    .line 552
    .line 553
    move-result v3

    .line 554
    const/16 v4, 0x7e

    .line 555
    .line 556
    int-to-float v4, v4

    .line 557
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 558
    .line 559
    .line 560
    move-result v4

    .line 561
    invoke-static {v1, v3, v4}, Landroidx/compose/foundation/layout/SizeKt;->size-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 562
    .line 563
    .line 564
    move-result-object v1

    .line 565
    invoke-static {v2, v1, v8, v5}, Lcom/zykj/mistake/feature/notebook/detail/x3;->g(Lcom/zykj/mistake/feature/notebook/detail/l3;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 566
    .line 567
    .line 568
    const/16 v1, 0xc

    .line 569
    .line 570
    int-to-float v1, v1

    .line 571
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 572
    .line 573
    .line 574
    move-result v15

    .line 575
    invoke-static/range {v13 .. v19}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 576
    .line 577
    .line 578
    move-result-object v1

    .line 579
    const/4 v3, 0x0

    .line 580
    const/4 v4, 0x0

    .line 581
    const/4 v6, 0x1

    .line 582
    invoke-static {v1, v3, v6, v4}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 583
    .line 584
    .line 585
    move-result-object v1

    .line 586
    invoke-static {v2, v1, v8, v5}, Lcom/zykj/mistake/feature/notebook/detail/x3;->j(Lcom/zykj/mistake/feature/notebook/detail/l3;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 587
    .line 588
    .line 589
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/v3;->b:Ljava/lang/String;

    .line 590
    .line 591
    iget-object v10, v0, Lcom/zykj/mistake/feature/notebook/detail/v3;->d:Ljava/lang/String;

    .line 592
    .line 593
    iget-object v11, v0, Lcom/zykj/mistake/feature/notebook/detail/v3;->e:Lr6/a;

    .line 594
    .line 595
    const-wide v20, 0xff1576ffL

    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    const/16 v2, 0x2c

    .line 601
    .line 602
    if-eqz v1, :cond_b

    .line 603
    .line 604
    iget-object v5, v0, Lcom/zykj/mistake/feature/notebook/detail/v3;->c:Lr6/a;

    .line 605
    .line 606
    if-nez v5, :cond_c

    .line 607
    .line 608
    :cond_b
    move-object v1, v10

    .line 609
    move-object v5, v11

    .line 610
    goto/16 :goto_6

    .line 611
    .line 612
    :cond_c
    const v7, -0x465bec41

    .line 613
    .line 614
    .line 615
    invoke-interface {v8, v7}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 616
    .line 617
    .line 618
    invoke-static/range {v30 .. v30}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 619
    .line 620
    .line 621
    move-result v15

    .line 622
    const/16 v18, 0xd

    .line 623
    .line 624
    const/16 v19, 0x0

    .line 625
    .line 626
    const/4 v14, 0x0

    .line 627
    const/16 v16, 0x0

    .line 628
    .line 629
    const/16 v17, 0x0

    .line 630
    .line 631
    invoke-static/range {v13 .. v19}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 632
    .line 633
    .line 634
    move-result-object v7

    .line 635
    invoke-static {v7, v3, v6, v4}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 636
    .line 637
    .line 638
    move-result-object v3

    .line 639
    invoke-virtual/range {v28 .. v28}, Landroidx/compose/foundation/layout/Arrangement;->getCenter()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 640
    .line 641
    .line 642
    move-result-object v4

    .line 643
    invoke-virtual/range {v27 .. v27}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    .line 644
    .line 645
    .line 646
    move-result-object v6

    .line 647
    const/4 v12, 0x6

    .line 648
    invoke-static {v4, v6, v8, v12}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 649
    .line 650
    .line 651
    move-result-object v4

    .line 652
    const/4 v6, 0x0

    .line 653
    invoke-static {v8, v6}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 654
    .line 655
    .line 656
    move-result v6

    .line 657
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 658
    .line 659
    .line 660
    move-result-object v7

    .line 661
    invoke-static {v8, v3}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 662
    .line 663
    .line 664
    move-result-object v3

    .line 665
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 666
    .line 667
    .line 668
    move-result-object v9

    .line 669
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 670
    .line 671
    .line 672
    move-result-object v14

    .line 673
    if-nez v14, :cond_d

    .line 674
    .line 675
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 676
    .line 677
    .line 678
    :cond_d
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 679
    .line 680
    .line 681
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 682
    .line 683
    .line 684
    move-result v14

    .line 685
    if-eqz v14, :cond_e

    .line 686
    .line 687
    invoke-interface {v8, v9}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 688
    .line 689
    .line 690
    goto :goto_5

    .line 691
    :cond_e
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 692
    .line 693
    .line 694
    :goto_5
    invoke-static {v8}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 695
    .line 696
    .line 697
    move-result-object v9

    .line 698
    move-object/from16 v14, p1

    .line 699
    .line 700
    invoke-static {v14, v9, v4, v9, v7}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 701
    .line 702
    .line 703
    move-result-object v4

    .line 704
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 705
    .line 706
    .line 707
    move-result v7

    .line 708
    if-nez v7, :cond_f

    .line 709
    .line 710
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 711
    .line 712
    .line 713
    move-result-object v7

    .line 714
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 715
    .line 716
    .line 717
    move-result-object v15

    .line 718
    invoke-static {v7, v15}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 719
    .line 720
    .line 721
    move-result v7

    .line 722
    if-nez v7, :cond_10

    .line 723
    .line 724
    :cond_f
    invoke-static {v6, v9, v6, v4}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 725
    .line 726
    .line 727
    :cond_10
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 728
    .line 729
    .line 730
    move-result-object v4

    .line 731
    invoke-static {v9, v3, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 732
    .line 733
    .line 734
    const-wide v3, 0xffeaf2ffL

    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    invoke-static {v3, v4}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 740
    .line 741
    .line 742
    move-result-wide v3

    .line 743
    const-wide v6, 0xff666666L

    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    invoke-static {v6, v7}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 749
    .line 750
    .line 751
    move-result-wide v6

    .line 752
    const/16 v9, 0x74

    .line 753
    .line 754
    int-to-float v14, v9

    .line 755
    invoke-static {v14}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 756
    .line 757
    .line 758
    move-result v9

    .line 759
    invoke-static {v13, v9}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 760
    .line 761
    .line 762
    move-result-object v9

    .line 763
    int-to-float v15, v2

    .line 764
    invoke-static {v15}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 765
    .line 766
    .line 767
    move-result v2

    .line 768
    invoke-static {v9, v2}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 769
    .line 770
    .line 771
    move-result-object v2

    .line 772
    const/16 v9, 0x61b0

    .line 773
    .line 774
    move-wide/from16 v34, v6

    .line 775
    .line 776
    move-object v7, v2

    .line 777
    move-wide v2, v3

    .line 778
    move-object v6, v5

    .line 779
    move-wide/from16 v4, v34

    .line 780
    .line 781
    invoke-static/range {v1 .. v9}, Lcom/zykj/mistake/feature/notebook/detail/x3;->b(Ljava/lang/String;JJLr6/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 782
    .line 783
    .line 784
    const/16 v1, 0x28

    .line 785
    .line 786
    int-to-float v1, v1

    .line 787
    invoke-static {v1, v13, v8, v12}, Landroidx/compose/material3/c;->s(FLandroidx/compose/ui/Modifier$Companion;Landroidx/compose/runtime/Composer;I)V

    .line 788
    .line 789
    .line 790
    invoke-static/range {v20 .. v21}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 791
    .line 792
    .line 793
    move-result-wide v2

    .line 794
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 795
    .line 796
    .line 797
    move-result-wide v4

    .line 798
    invoke-static {v14}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 799
    .line 800
    .line 801
    move-result v1

    .line 802
    invoke-static {v13, v1}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 803
    .line 804
    .line 805
    move-result-object v1

    .line 806
    invoke-static {v15}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 807
    .line 808
    .line 809
    move-result v6

    .line 810
    invoke-static {v1, v6}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 811
    .line 812
    .line 813
    move-result-object v7

    .line 814
    move-object v1, v10

    .line 815
    move-object v6, v11

    .line 816
    invoke-static/range {v1 .. v9}, Lcom/zykj/mistake/feature/notebook/detail/x3;->b(Ljava/lang/String;JJLr6/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 817
    .line 818
    .line 819
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 820
    .line 821
    .line 822
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 823
    .line 824
    .line 825
    goto :goto_7

    .line 826
    :goto_6
    const v7, -0x4662a825

    .line 827
    .line 828
    .line 829
    invoke-interface {v8, v7}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 830
    .line 831
    .line 832
    invoke-static/range {v20 .. v21}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 833
    .line 834
    .line 835
    move-result-wide v9

    .line 836
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 837
    .line 838
    .line 839
    move-result-wide v11

    .line 840
    invoke-static/range {v30 .. v30}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 841
    .line 842
    .line 843
    move-result v15

    .line 844
    const/16 v18, 0xd

    .line 845
    .line 846
    const/16 v19, 0x0

    .line 847
    .line 848
    const/4 v14, 0x0

    .line 849
    const/16 v16, 0x0

    .line 850
    .line 851
    const/16 v17, 0x0

    .line 852
    .line 853
    invoke-static/range {v13 .. v19}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 854
    .line 855
    .line 856
    move-result-object v7

    .line 857
    invoke-static {v7, v3, v6, v4}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 858
    .line 859
    .line 860
    move-result-object v3

    .line 861
    int-to-float v2, v2

    .line 862
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 863
    .line 864
    .line 865
    move-result v2

    .line 866
    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 867
    .line 868
    .line 869
    move-result-object v7

    .line 870
    move-wide v2, v9

    .line 871
    const/16 v9, 0x61b0

    .line 872
    .line 873
    move-object v6, v5

    .line 874
    move-wide v4, v11

    .line 875
    invoke-static/range {v1 .. v9}, Lcom/zykj/mistake/feature/notebook/detail/x3;->b(Ljava/lang/String;JJLr6/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 876
    .line 877
    .line 878
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 879
    .line 880
    .line 881
    :goto_7
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 882
    .line 883
    .line 884
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 885
    .line 886
    .line 887
    move-result v1

    .line 888
    if-eqz v1, :cond_12

    .line 889
    .line 890
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 891
    .line 892
    .line 893
    goto :goto_8

    .line 894
    :cond_11
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 895
    .line 896
    .line 897
    :cond_12
    :goto_8
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 898
    .line 899
    return-object v1
.end method
