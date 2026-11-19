.class public final synthetic Lcom/zykj/mistake/feature/notebook/detail/p3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lr6/a;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZLjava/lang/Object;Lr6/a;II)V
    .locals 0

    .line 1
    iput p6, p0, Lcom/zykj/mistake/feature/notebook/detail/p3;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/p3;->f:Ljava/lang/Object;

    iput-boolean p2, p0, Lcom/zykj/mistake/feature/notebook/detail/p3;->b:Z

    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/detail/p3;->d:Ljava/lang/Object;

    iput-object p4, p0, Lcom/zykj/mistake/feature/notebook/detail/p3;->e:Lr6/a;

    iput p5, p0, Lcom/zykj/mistake/feature/notebook/detail/p3;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZLr6/a;Landroidx/compose/ui/Modifier;I)V
    .locals 1

    .line 2
    const/4 v0, 0x3

    iput v0, p0, Lcom/zykj/mistake/feature/notebook/detail/p3;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/p3;->f:Ljava/lang/Object;

    iput-boolean p2, p0, Lcom/zykj/mistake/feature/notebook/detail/p3;->b:Z

    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/detail/p3;->e:Lr6/a;

    iput-object p4, p0, Lcom/zykj/mistake/feature/notebook/detail/p3;->d:Ljava/lang/Object;

    iput p5, p0, Lcom/zykj/mistake/feature/notebook/detail/p3;->c:I

    return-void
.end method

.method public synthetic constructor <init>(ZILcom/zykj/mistake/feature/notebook/detail/l3;Lr6/a;Lr6/a;)V
    .locals 1

    .line 3
    const/4 v0, 0x1

    iput v0, p0, Lcom/zykj/mistake/feature/notebook/detail/p3;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/zykj/mistake/feature/notebook/detail/p3;->b:Z

    iput p2, p0, Lcom/zykj/mistake/feature/notebook/detail/p3;->c:I

    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/detail/p3;->d:Ljava/lang/Object;

    iput-object p4, p0, Lcom/zykj/mistake/feature/notebook/detail/p3;->e:Lr6/a;

    iput-object p5, p0, Lcom/zykj/mistake/feature/notebook/detail/p3;->f:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 67

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lcom/zykj/mistake/feature/notebook/detail/p3;->a:I

    .line 4
    .line 5
    sget-object v2, Ld6/s;->a:Ld6/s;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    iget v4, v1, Lcom/zykj/mistake/feature/notebook/detail/p3;->c:I

    .line 9
    .line 10
    iget-object v5, v1, Lcom/zykj/mistake/feature/notebook/detail/p3;->d:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v6, v1, Lcom/zykj/mistake/feature/notebook/detail/p3;->f:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    move-object v7, v6

    .line 18
    check-cast v7, Ljava/lang/String;

    .line 19
    .line 20
    move-object v10, v5

    .line 21
    check-cast v10, Landroidx/compose/ui/Modifier;

    .line 22
    .line 23
    move-object/from16 v11, p1

    .line 24
    .line 25
    check-cast v11, Landroidx/compose/runtime/Composer;

    .line 26
    .line 27
    move-object/from16 v0, p2

    .line 28
    .line 29
    check-cast v0, Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    or-int/lit8 v0, v4, 0x1

    .line 35
    .line 36
    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 37
    .line 38
    .line 39
    move-result v12

    .line 40
    iget-boolean v8, v1, Lcom/zykj/mistake/feature/notebook/detail/p3;->b:Z

    .line 41
    .line 42
    iget-object v9, v1, Lcom/zykj/mistake/feature/notebook/detail/p3;->e:Lr6/a;

    .line 43
    .line 44
    invoke-static/range {v7 .. v12}, Lcom/zykj/mistake/feature/review/y;->c(Ljava/lang/String;ZLr6/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 45
    .line 46
    .line 47
    return-object v2

    .line 48
    :pswitch_0
    move-object v13, v6

    .line 49
    check-cast v13, Lcom/zykj/mistake/feature/notebook/list/a;

    .line 50
    .line 51
    move-object v15, v5

    .line 52
    check-cast v15, Lcom/zykj/mistake/feature/notebook/list/JoinCollectionDialogMode;

    .line 53
    .line 54
    move-object/from16 v17, p1

    .line 55
    .line 56
    check-cast v17, Landroidx/compose/runtime/Composer;

    .line 57
    .line 58
    move-object/from16 v0, p2

    .line 59
    .line 60
    check-cast v0, Ljava/lang/Integer;

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 63
    .line 64
    .line 65
    or-int/lit8 v0, v4, 0x1

    .line 66
    .line 67
    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 68
    .line 69
    .line 70
    move-result v18

    .line 71
    iget-boolean v14, v1, Lcom/zykj/mistake/feature/notebook/detail/p3;->b:Z

    .line 72
    .line 73
    iget-object v0, v1, Lcom/zykj/mistake/feature/notebook/detail/p3;->e:Lr6/a;

    .line 74
    .line 75
    move-object/from16 v16, v0

    .line 76
    .line 77
    invoke-static/range {v13 .. v18}, Lcom/zykj/mistake/feature/notebook/list/j;->c(Lcom/zykj/mistake/feature/notebook/list/a;ZLcom/zykj/mistake/feature/notebook/list/JoinCollectionDialogMode;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 78
    .line 79
    .line 80
    return-object v2

    .line 81
    :pswitch_1
    check-cast v5, Lcom/zykj/mistake/feature/notebook/detail/l3;

    .line 82
    .line 83
    move-object v12, v6

    .line 84
    check-cast v12, Lr6/a;

    .line 85
    .line 86
    move-object/from16 v14, p1

    .line 87
    .line 88
    check-cast v14, Landroidx/compose/runtime/Composer;

    .line 89
    .line 90
    move-object/from16 v0, p2

    .line 91
    .line 92
    check-cast v0, Ljava/lang/Integer;

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    and-int/lit8 v6, v0, 0x3

    .line 99
    .line 100
    const/4 v7, 0x2

    .line 101
    const/4 v8, 0x0

    .line 102
    if-eq v6, v7, :cond_0

    .line 103
    .line 104
    move v6, v3

    .line 105
    goto :goto_0

    .line 106
    :cond_0
    move v6, v8

    .line 107
    :goto_0
    and-int/lit8 v7, v0, 0x1

    .line 108
    .line 109
    invoke-interface {v14, v6, v7}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    if-eqz v6, :cond_b

    .line 114
    .line 115
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    if-eqz v6, :cond_1

    .line 120
    .line 121
    const/4 v6, -0x1

    .line 122
    const-string v7, "com.zykj.mistake.feature.notebook.detail.ReviewPracticeRoundCompleteDialog.<anonymous> (MistakeDetailNewScreen.kt:239)"

    .line 123
    .line 124
    const v9, 0x20f85815

    .line 125
    .line 126
    .line 127
    invoke-static {v9, v0, v6, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 128
    .line 129
    .line 130
    :cond_1
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 131
    .line 132
    const/16 v6, 0x1b6

    .line 133
    .line 134
    int-to-float v6, v6

    .line 135
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    invoke-static {v0, v6}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 140
    .line 141
    .line 142
    move-result-object v6

    .line 143
    sget-object v7, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 144
    .line 145
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 146
    .line 147
    .line 148
    move-result-wide v9

    .line 149
    const/4 v11, 0x6

    .line 150
    int-to-float v13, v11

    .line 151
    invoke-static {v13, v6, v9, v10}, Landroidx/compose/material3/c;->f(FLandroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    .line 152
    .line 153
    .line 154
    move-result-object v15

    .line 155
    sget-object v16, Landroidx/compose/ui/graphics/Brush;->Companion:Landroidx/compose/ui/graphics/Brush$Companion;

    .line 156
    .line 157
    const-wide v9, 0xfffff3eaL

    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    invoke-static {v9, v10}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 163
    .line 164
    .line 165
    move-result-wide v9

    .line 166
    invoke-static {v9, v10}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 167
    .line 168
    .line 169
    move-result-object v6

    .line 170
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 171
    .line 172
    .line 173
    move-result-wide v9

    .line 174
    invoke-static {v9, v10}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 175
    .line 176
    .line 177
    move-result-object v9

    .line 178
    filled-new-array {v6, v9}, [Landroidx/compose/ui/graphics/Color;

    .line 179
    .line 180
    .line 181
    move-result-object v6

    .line 182
    invoke-static {v6}, Lkotlin/collections/u;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 183
    .line 184
    .line 185
    move-result-object v17

    .line 186
    const/16 v21, 0xa

    .line 187
    .line 188
    const/16 v22, 0x0

    .line 189
    .line 190
    const/16 v18, 0x0

    .line 191
    .line 192
    const/high16 v19, 0x42c00000    # 96.0f

    .line 193
    .line 194
    const/16 v20, 0x0

    .line 195
    .line 196
    invoke-static/range {v16 .. v22}, Landroidx/compose/ui/graphics/Brush$Companion;->verticalGradient-8A-3gB4$default(Landroidx/compose/ui/graphics/Brush$Companion;Ljava/util/List;FFIILjava/lang/Object;)Landroidx/compose/ui/graphics/Brush;

    .line 197
    .line 198
    .line 199
    move-result-object v16

    .line 200
    invoke-static {v13}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 201
    .line 202
    .line 203
    move-result v6

    .line 204
    invoke-static {v6}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 205
    .line 206
    .line 207
    move-result-object v17

    .line 208
    const/16 v19, 0x4

    .line 209
    .line 210
    const/16 v20, 0x0

    .line 211
    .line 212
    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/BackgroundKt;->background$default(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 213
    .line 214
    .line 215
    move-result-object v6

    .line 216
    const/16 v9, 0x28

    .line 217
    .line 218
    int-to-float v9, v9

    .line 219
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 220
    .line 221
    .line 222
    move-result v9

    .line 223
    const/16 v10, 0x1c

    .line 224
    .line 225
    int-to-float v10, v10

    .line 226
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 227
    .line 228
    .line 229
    move-result v13

    .line 230
    invoke-static {v6, v9, v13}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 231
    .line 232
    .line 233
    move-result-object v6

    .line 234
    sget-object v9, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 235
    .line 236
    invoke-virtual {v9}, Landroidx/compose/ui/Alignment$Companion;->getCenterHorizontally()Landroidx/compose/ui/Alignment$Horizontal;

    .line 237
    .line 238
    .line 239
    move-result-object v13

    .line 240
    sget-object v39, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 241
    .line 242
    invoke-virtual/range {v39 .. v39}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 243
    .line 244
    .line 245
    move-result-object v15

    .line 246
    const/16 v3, 0x30

    .line 247
    .line 248
    invoke-static {v15, v13, v14, v3}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 249
    .line 250
    .line 251
    move-result-object v3

    .line 252
    invoke-static {v14, v8}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 253
    .line 254
    .line 255
    move-result v13

    .line 256
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 257
    .line 258
    .line 259
    move-result-object v15

    .line 260
    invoke-static {v14, v6}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 261
    .line 262
    .line 263
    move-result-object v6

    .line 264
    sget-object v11, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 265
    .line 266
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 267
    .line 268
    .line 269
    move-result-object v8

    .line 270
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 271
    .line 272
    .line 273
    move-result-object v16

    .line 274
    if-nez v16, :cond_2

    .line 275
    .line 276
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 277
    .line 278
    .line 279
    :cond_2
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 280
    .line 281
    .line 282
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 283
    .line 284
    .line 285
    move-result v16

    .line 286
    if-eqz v16, :cond_3

    .line 287
    .line 288
    invoke-interface {v14, v8}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 289
    .line 290
    .line 291
    goto :goto_1

    .line 292
    :cond_3
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 293
    .line 294
    .line 295
    :goto_1
    invoke-static {v14}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 296
    .line 297
    .line 298
    move-result-object v8

    .line 299
    invoke-static {v11, v8, v3, v8, v15}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 300
    .line 301
    .line 302
    move-result-object v3

    .line 303
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 304
    .line 305
    .line 306
    move-result v15

    .line 307
    if-nez v15, :cond_4

    .line 308
    .line 309
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v15

    .line 313
    move-object/from16 v41, v2

    .line 314
    .line 315
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    invoke-static {v15, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    move-result v2

    .line 323
    if-nez v2, :cond_5

    .line 324
    .line 325
    goto :goto_2

    .line 326
    :cond_4
    move-object/from16 v41, v2

    .line 327
    .line 328
    :goto_2
    invoke-static {v13, v8, v13, v3}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 329
    .line 330
    .line 331
    :cond_5
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    invoke-static {v8, v6, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 336
    .line 337
    .line 338
    sget-object v2, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 339
    .line 340
    sget v2, Lcom/zykj/mistake/R$drawable;->ic_give_a_like:I

    .line 341
    .line 342
    const/4 v3, 0x0

    .line 343
    invoke-static {v2, v14, v3}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 344
    .line 345
    .line 346
    move-result-object v13

    .line 347
    const/16 v2, 0x40

    .line 348
    .line 349
    int-to-float v2, v2

    .line 350
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 351
    .line 352
    .line 353
    move-result v2

    .line 354
    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 355
    .line 356
    .line 357
    move-result-object v15

    .line 358
    const/16 v21, 0x1b0

    .line 359
    .line 360
    const/16 v22, 0x78

    .line 361
    .line 362
    move-object/from16 v20, v14

    .line 363
    .line 364
    const/4 v14, 0x0

    .line 365
    const/16 v16, 0x0

    .line 366
    .line 367
    const/16 v17, 0x0

    .line 368
    .line 369
    const/16 v18, 0x0

    .line 370
    .line 371
    const/16 v19, 0x0

    .line 372
    .line 373
    invoke-static/range {v13 .. v22}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 374
    .line 375
    .line 376
    move-object/from16 v14, v20

    .line 377
    .line 378
    const/16 v2, 0x12

    .line 379
    .line 380
    int-to-float v2, v2

    .line 381
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 382
    .line 383
    .line 384
    move-result v2

    .line 385
    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 386
    .line 387
    .line 388
    move-result-object v2

    .line 389
    const/4 v3, 0x6

    .line 390
    invoke-static {v2, v14, v3}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 391
    .line 392
    .line 393
    iget-boolean v2, v1, Lcom/zykj/mistake/feature/notebook/detail/p3;->b:Z

    .line 394
    .line 395
    const/4 v3, 0x0

    .line 396
    const/16 v6, 0x19

    .line 397
    .line 398
    const/16 v8, 0x10

    .line 399
    .line 400
    const-wide v15, 0xff15171aL

    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    const-wide v42, 0xff1576ffL

    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    if-eqz v2, :cond_6

    .line 411
    .line 412
    const v2, 0xd3ee53d

    .line 413
    .line 414
    .line 415
    invoke-interface {v14, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 416
    .line 417
    .line 418
    invoke-static/range {v15 .. v16}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 419
    .line 420
    .line 421
    move-result-wide v15

    .line 422
    invoke-static {v8}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 423
    .line 424
    .line 425
    move-result-wide v17

    .line 426
    invoke-static {v6}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 427
    .line 428
    .line 429
    move-result-wide v26

    .line 430
    sget-object v2, Landroidx/compose/ui/text/style/TextAlign;->Companion:Landroidx/compose/ui/text/style/TextAlign$Companion;

    .line 431
    .line 432
    invoke-virtual {v2}, Landroidx/compose/ui/text/style/TextAlign$Companion;->getCenter-e0LSkKk()I

    .line 433
    .line 434
    .line 435
    move-result v2

    .line 436
    invoke-static {v2}, Landroidx/compose/ui/text/style/TextAlign;->box-impl(I)Landroidx/compose/ui/text/style/TextAlign;

    .line 437
    .line 438
    .line 439
    move-result-object v25

    .line 440
    const/16 v36, 0x6

    .line 441
    .line 442
    const v37, 0x1f9f2

    .line 443
    .line 444
    .line 445
    const-string v13, "\u60a8\u5df2\u5b8c\u6210\u4eca\u5929\u63a8\u8350\u7684\u57fa\u7840\u7ec3\u4e60\uff0c\n\u53ef\u4ee5\u518d\u7ec3\u51e0\u9898\u5de9\u56fa\u4e00\u4e0b\uff0c\u4e5f\u53ef\u4ee5\u5148\u7ed3\u675f\u3002"

    .line 446
    .line 447
    move-object/from16 v20, v14

    .line 448
    .line 449
    const/4 v14, 0x0

    .line 450
    const/16 v19, 0x0

    .line 451
    .line 452
    move-object/from16 v34, v20

    .line 453
    .line 454
    const/16 v20, 0x0

    .line 455
    .line 456
    const/16 v21, 0x0

    .line 457
    .line 458
    const-wide/16 v22, 0x0

    .line 459
    .line 460
    const/16 v24, 0x0

    .line 461
    .line 462
    const/16 v28, 0x0

    .line 463
    .line 464
    const/16 v29, 0x0

    .line 465
    .line 466
    const/16 v30, 0x0

    .line 467
    .line 468
    const/16 v31, 0x0

    .line 469
    .line 470
    const/16 v32, 0x0

    .line 471
    .line 472
    const/16 v33, 0x0

    .line 473
    .line 474
    const/16 v35, 0xd86

    .line 475
    .line 476
    invoke-static/range {v13 .. v37}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 477
    .line 478
    .line 479
    move-object/from16 v14, v34

    .line 480
    .line 481
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 482
    .line 483
    .line 484
    goto/16 :goto_3

    .line 485
    .line 486
    :cond_6
    const v2, 0xd43aed4

    .line 487
    .line 488
    .line 489
    invoke-interface {v14, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 490
    .line 491
    .line 492
    new-instance v2, Landroidx/compose/ui/text/AnnotatedString$Builder;

    .line 493
    .line 494
    move/from16 v17, v6

    .line 495
    .line 496
    const/4 v6, 0x0

    .line 497
    const/4 v13, 0x1

    .line 498
    invoke-direct {v2, v6, v13, v3}, Landroidx/compose/ui/text/AnnotatedString$Builder;-><init>(IILkotlin/jvm/internal/e;)V

    .line 499
    .line 500
    .line 501
    const-string v6, "\u5df2\u989d\u5916\u5b8c\u6210 "

    .line 502
    .line 503
    invoke-virtual {v2, v6}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V

    .line 504
    .line 505
    .line 506
    new-instance v44, Landroidx/compose/ui/text/SpanStyle;

    .line 507
    .line 508
    invoke-static/range {v42 .. v43}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 509
    .line 510
    .line 511
    move-result-wide v45

    .line 512
    sget-object v6, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    .line 513
    .line 514
    invoke-virtual {v6}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    .line 515
    .line 516
    .line 517
    move-result-object v49

    .line 518
    const v65, 0xfffa

    .line 519
    .line 520
    .line 521
    const/16 v66, 0x0

    .line 522
    .line 523
    const-wide/16 v47, 0x0

    .line 524
    .line 525
    const/16 v50, 0x0

    .line 526
    .line 527
    const/16 v51, 0x0

    .line 528
    .line 529
    const/16 v52, 0x0

    .line 530
    .line 531
    const/16 v53, 0x0

    .line 532
    .line 533
    const-wide/16 v54, 0x0

    .line 534
    .line 535
    const/16 v56, 0x0

    .line 536
    .line 537
    const/16 v57, 0x0

    .line 538
    .line 539
    const/16 v58, 0x0

    .line 540
    .line 541
    const-wide/16 v59, 0x0

    .line 542
    .line 543
    const/16 v61, 0x0

    .line 544
    .line 545
    const/16 v62, 0x0

    .line 546
    .line 547
    const/16 v63, 0x0

    .line 548
    .line 549
    const/16 v64, 0x0

    .line 550
    .line 551
    invoke-direct/range {v44 .. v66}, Landroidx/compose/ui/text/SpanStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;ILkotlin/jvm/internal/e;)V

    .line 552
    .line 553
    .line 554
    move-object/from16 v13, v44

    .line 555
    .line 556
    invoke-virtual {v2, v13}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pushStyle(Landroidx/compose/ui/text/SpanStyle;)I

    .line 557
    .line 558
    .line 559
    move-result v13

    .line 560
    :try_start_0
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 561
    .line 562
    .line 563
    move-result-object v4

    .line 564
    invoke-virtual {v2, v4}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 565
    .line 566
    .line 567
    invoke-virtual {v2, v13}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pop(I)V

    .line 568
    .line 569
    .line 570
    const-string v4, " \u9898\uff0c\u7d2f\u8ba1\u7ec3\u4e60 "

    .line 571
    .line 572
    invoke-virtual {v2, v4}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V

    .line 573
    .line 574
    .line 575
    new-instance v44, Landroidx/compose/ui/text/SpanStyle;

    .line 576
    .line 577
    invoke-static/range {v42 .. v43}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 578
    .line 579
    .line 580
    move-result-wide v45

    .line 581
    invoke-virtual {v6}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    .line 582
    .line 583
    .line 584
    move-result-object v49

    .line 585
    const v65, 0xfffa

    .line 586
    .line 587
    .line 588
    const/16 v66, 0x0

    .line 589
    .line 590
    const-wide/16 v47, 0x0

    .line 591
    .line 592
    const/16 v50, 0x0

    .line 593
    .line 594
    const/16 v51, 0x0

    .line 595
    .line 596
    const/16 v52, 0x0

    .line 597
    .line 598
    const/16 v53, 0x0

    .line 599
    .line 600
    const-wide/16 v54, 0x0

    .line 601
    .line 602
    const/16 v56, 0x0

    .line 603
    .line 604
    const/16 v57, 0x0

    .line 605
    .line 606
    const/16 v58, 0x0

    .line 607
    .line 608
    const-wide/16 v59, 0x0

    .line 609
    .line 610
    const/16 v61, 0x0

    .line 611
    .line 612
    const/16 v62, 0x0

    .line 613
    .line 614
    const/16 v63, 0x0

    .line 615
    .line 616
    const/16 v64, 0x0

    .line 617
    .line 618
    invoke-direct/range {v44 .. v66}, Landroidx/compose/ui/text/SpanStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;ILkotlin/jvm/internal/e;)V

    .line 619
    .line 620
    .line 621
    move-object/from16 v4, v44

    .line 622
    .line 623
    invoke-virtual {v2, v4}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pushStyle(Landroidx/compose/ui/text/SpanStyle;)I

    .line 624
    .line 625
    .line 626
    move-result v4

    .line 627
    :try_start_1
    iget v5, v5, Lcom/zykj/mistake/feature/notebook/detail/l3;->a:I

    .line 628
    .line 629
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object v5

    .line 633
    invoke-virtual {v2, v5}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 634
    .line 635
    .line 636
    invoke-virtual {v2, v4}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pop(I)V

    .line 637
    .line 638
    .line 639
    const-string v4, " \u9898"

    .line 640
    .line 641
    invoke-virtual {v2, v4}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V

    .line 642
    .line 643
    .line 644
    invoke-virtual {v2}, Landroidx/compose/ui/text/AnnotatedString$Builder;->toAnnotatedString()Landroidx/compose/ui/text/AnnotatedString;

    .line 645
    .line 646
    .line 647
    move-result-object v13

    .line 648
    invoke-static/range {v15 .. v16}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 649
    .line 650
    .line 651
    move-result-wide v15

    .line 652
    invoke-static {v8}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 653
    .line 654
    .line 655
    move-result-wide v4

    .line 656
    invoke-static/range {v17 .. v17}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 657
    .line 658
    .line 659
    move-result-wide v26

    .line 660
    sget-object v2, Landroidx/compose/ui/text/style/TextAlign;->Companion:Landroidx/compose/ui/text/style/TextAlign$Companion;

    .line 661
    .line 662
    invoke-virtual {v2}, Landroidx/compose/ui/text/style/TextAlign$Companion;->getCenter-e0LSkKk()I

    .line 663
    .line 664
    .line 665
    move-result v2

    .line 666
    invoke-static {v2}, Landroidx/compose/ui/text/style/TextAlign;->box-impl(I)Landroidx/compose/ui/text/style/TextAlign;

    .line 667
    .line 668
    .line 669
    move-result-object v25

    .line 670
    const/16 v37, 0x6

    .line 671
    .line 672
    const v38, 0x3f9f2

    .line 673
    .line 674
    .line 675
    move-object/from16 v20, v14

    .line 676
    .line 677
    const/4 v14, 0x0

    .line 678
    const/16 v19, 0x0

    .line 679
    .line 680
    move-object/from16 v34, v20

    .line 681
    .line 682
    const/16 v20, 0x0

    .line 683
    .line 684
    const/16 v21, 0x0

    .line 685
    .line 686
    const-wide/16 v22, 0x0

    .line 687
    .line 688
    const/16 v24, 0x0

    .line 689
    .line 690
    const/16 v28, 0x0

    .line 691
    .line 692
    const/16 v29, 0x0

    .line 693
    .line 694
    const/16 v30, 0x0

    .line 695
    .line 696
    const/16 v31, 0x0

    .line 697
    .line 698
    const/16 v32, 0x0

    .line 699
    .line 700
    const/16 v33, 0x0

    .line 701
    .line 702
    move-object/from16 v35, v34

    .line 703
    .line 704
    const/16 v34, 0x0

    .line 705
    .line 706
    const/16 v36, 0xd80

    .line 707
    .line 708
    move-wide/from16 v17, v4

    .line 709
    .line 710
    invoke-static/range {v13 .. v38}, Landroidx/compose/material3/TextKt;->Text-IbK3jfQ(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILjava/util/Map;Lr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 711
    .line 712
    .line 713
    move-object/from16 v14, v35

    .line 714
    .line 715
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 716
    .line 717
    .line 718
    :goto_3
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 719
    .line 720
    .line 721
    move-result v17

    .line 722
    const/16 v20, 0xd

    .line 723
    .line 724
    const/16 v21, 0x0

    .line 725
    .line 726
    const/16 v16, 0x0

    .line 727
    .line 728
    const/16 v18, 0x0

    .line 729
    .line 730
    const/16 v19, 0x0

    .line 731
    .line 732
    move-object v15, v0

    .line 733
    invoke-static/range {v15 .. v21}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 734
    .line 735
    .line 736
    move-result-object v0

    .line 737
    move-object v2, v15

    .line 738
    const/4 v4, 0x0

    .line 739
    const/4 v13, 0x1

    .line 740
    invoke-static {v0, v4, v13, v3}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 741
    .line 742
    .line 743
    move-result-object v0

    .line 744
    invoke-virtual/range {v39 .. v39}, Landroidx/compose/foundation/layout/Arrangement;->getSpaceBetween()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 745
    .line 746
    .line 747
    move-result-object v3

    .line 748
    invoke-virtual {v9}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    .line 749
    .line 750
    .line 751
    move-result-object v4

    .line 752
    const/4 v5, 0x6

    .line 753
    invoke-static {v3, v4, v14, v5}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 754
    .line 755
    .line 756
    move-result-object v3

    .line 757
    const/4 v6, 0x0

    .line 758
    invoke-static {v14, v6}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 759
    .line 760
    .line 761
    move-result v4

    .line 762
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 763
    .line 764
    .line 765
    move-result-object v5

    .line 766
    invoke-static {v14, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 767
    .line 768
    .line 769
    move-result-object v0

    .line 770
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 771
    .line 772
    .line 773
    move-result-object v6

    .line 774
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 775
    .line 776
    .line 777
    move-result-object v8

    .line 778
    if-nez v8, :cond_7

    .line 779
    .line 780
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 781
    .line 782
    .line 783
    :cond_7
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 784
    .line 785
    .line 786
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 787
    .line 788
    .line 789
    move-result v8

    .line 790
    if-eqz v8, :cond_8

    .line 791
    .line 792
    invoke-interface {v14, v6}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 793
    .line 794
    .line 795
    goto :goto_4

    .line 796
    :cond_8
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 797
    .line 798
    .line 799
    :goto_4
    invoke-static {v14}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 800
    .line 801
    .line 802
    move-result-object v6

    .line 803
    invoke-static {v11, v6, v3, v6, v5}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 804
    .line 805
    .line 806
    move-result-object v3

    .line 807
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 808
    .line 809
    .line 810
    move-result v5

    .line 811
    if-nez v5, :cond_9

    .line 812
    .line 813
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 814
    .line 815
    .line 816
    move-result-object v5

    .line 817
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 818
    .line 819
    .line 820
    move-result-object v8

    .line 821
    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 822
    .line 823
    .line 824
    move-result v5

    .line 825
    if-nez v5, :cond_a

    .line 826
    .line 827
    :cond_9
    invoke-static {v4, v6, v4, v3}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 828
    .line 829
    .line 830
    :cond_a
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 831
    .line 832
    .line 833
    move-result-object v3

    .line 834
    invoke-static {v6, v0, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 835
    .line 836
    .line 837
    sget-object v0, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 838
    .line 839
    const-wide v3, 0xffeaf2ffL

    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    invoke-static {v3, v4}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 845
    .line 846
    .line 847
    move-result-wide v3

    .line 848
    invoke-static/range {v42 .. v43}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 849
    .line 850
    .line 851
    move-result-wide v16

    .line 852
    const/16 v0, 0x9c

    .line 853
    .line 854
    int-to-float v0, v0

    .line 855
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 856
    .line 857
    .line 858
    move-result v5

    .line 859
    invoke-static {v2, v5}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 860
    .line 861
    .line 862
    move-result-object v5

    .line 863
    const/16 v6, 0x32

    .line 864
    .line 865
    int-to-float v6, v6

    .line 866
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 867
    .line 868
    .line 869
    move-result v8

    .line 870
    invoke-static {v5, v8}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 871
    .line 872
    .line 873
    move-result-object v19

    .line 874
    const/16 v21, 0x61b6

    .line 875
    .line 876
    const-string v13, "\u7ed3\u675f\u7ec3\u4e60"

    .line 877
    .line 878
    iget-object v5, v1, Lcom/zykj/mistake/feature/notebook/detail/p3;->e:Lr6/a;

    .line 879
    .line 880
    move-object/from16 v18, v5

    .line 881
    .line 882
    move-object/from16 v20, v14

    .line 883
    .line 884
    move-wide v14, v3

    .line 885
    invoke-static/range {v13 .. v21}, Lcom/zykj/mistake/feature/notebook/detail/x3;->b(Ljava/lang/String;JJLr6/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 886
    .line 887
    .line 888
    invoke-static/range {v42 .. v43}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 889
    .line 890
    .line 891
    move-result-wide v8

    .line 892
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 893
    .line 894
    .line 895
    move-result-wide v10

    .line 896
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 897
    .line 898
    .line 899
    move-result v0

    .line 900
    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 901
    .line 902
    .line 903
    move-result-object v0

    .line 904
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 905
    .line 906
    .line 907
    move-result v2

    .line 908
    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 909
    .line 910
    .line 911
    move-result-object v13

    .line 912
    const/16 v15, 0x61b6

    .line 913
    .line 914
    const-string v7, "\u7ee7\u7eed\u7ec3\u4e60"

    .line 915
    .line 916
    move-object/from16 v14, v20

    .line 917
    .line 918
    invoke-static/range {v7 .. v15}, Lcom/zykj/mistake/feature/notebook/detail/x3;->b(Ljava/lang/String;JJLr6/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 919
    .line 920
    .line 921
    invoke-static/range {v20 .. v20}, Landroidx/collection/a;->D(Landroidx/compose/runtime/Composer;)Z

    .line 922
    .line 923
    .line 924
    move-result v0

    .line 925
    if-eqz v0, :cond_c

    .line 926
    .line 927
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 928
    .line 929
    .line 930
    goto :goto_5

    .line 931
    :catchall_0
    move-exception v0

    .line 932
    invoke-virtual {v2, v4}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pop(I)V

    .line 933
    .line 934
    .line 935
    throw v0

    .line 936
    :catchall_1
    move-exception v0

    .line 937
    invoke-virtual {v2, v13}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pop(I)V

    .line 938
    .line 939
    .line 940
    throw v0

    .line 941
    :cond_b
    move-object/from16 v41, v2

    .line 942
    .line 943
    move-object/from16 v20, v14

    .line 944
    .line 945
    invoke-interface/range {v20 .. v20}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 946
    .line 947
    .line 948
    :cond_c
    :goto_5
    return-object v41

    .line 949
    :pswitch_2
    move-object/from16 v41, v2

    .line 950
    .line 951
    move-object v3, v6

    .line 952
    check-cast v3, Ljava/lang/String;

    .line 953
    .line 954
    check-cast v5, Lcom/zykj/mistake/feature/notebook/detail/l3;

    .line 955
    .line 956
    move-object/from16 v7, p1

    .line 957
    .line 958
    check-cast v7, Landroidx/compose/runtime/Composer;

    .line 959
    .line 960
    move-object/from16 v0, p2

    .line 961
    .line 962
    check-cast v0, Ljava/lang/Integer;

    .line 963
    .line 964
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 965
    .line 966
    .line 967
    const/16 v40, 0x1

    .line 968
    .line 969
    or-int/lit8 v0, v4, 0x1

    .line 970
    .line 971
    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 972
    .line 973
    .line 974
    move-result v8

    .line 975
    iget-boolean v4, v1, Lcom/zykj/mistake/feature/notebook/detail/p3;->b:Z

    .line 976
    .line 977
    iget-object v6, v1, Lcom/zykj/mistake/feature/notebook/detail/p3;->e:Lr6/a;

    .line 978
    .line 979
    invoke-static/range {v3 .. v8}, Lcom/zykj/mistake/feature/notebook/detail/x3;->f(Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/detail/l3;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 980
    .line 981
    .line 982
    return-object v41

    .line 983
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
