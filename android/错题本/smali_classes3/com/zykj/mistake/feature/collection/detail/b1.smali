.class public final synthetic Lcom/zykj/mistake/feature/collection/detail/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;Lr6/a;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lcom/zykj/mistake/feature/collection/detail/b1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/zykj/mistake/feature/collection/detail/b1;->e:Ljava/lang/Object;

    iput-boolean p4, p0, Lcom/zykj/mistake/feature/collection/detail/b1;->b:Z

    iput-object p3, p0, Lcom/zykj/mistake/feature/collection/detail/b1;->c:Ljava/lang/Object;

    iput p1, p0, Lcom/zykj/mistake/feature/collection/detail/b1;->d:I

    return-void
.end method

.method public synthetic constructor <init>(IZLr6/a;Lr6/a;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lcom/zykj/mistake/feature/collection/detail/b1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/zykj/mistake/feature/collection/detail/b1;->d:I

    iput-object p3, p0, Lcom/zykj/mistake/feature/collection/detail/b1;->c:Ljava/lang/Object;

    iput-boolean p2, p0, Lcom/zykj/mistake/feature/collection/detail/b1;->b:Z

    iput-object p4, p0, Lcom/zykj/mistake/feature/collection/detail/b1;->e:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lr6/a;ZI)V
    .locals 1

    .line 3
    const/4 v0, 0x3

    iput v0, p0, Lcom/zykj/mistake/feature/collection/detail/b1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p3, p0, Lcom/zykj/mistake/feature/collection/detail/b1;->b:Z

    iput-object p2, p0, Lcom/zykj/mistake/feature/collection/detail/b1;->c:Ljava/lang/Object;

    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/b1;->e:Ljava/lang/Object;

    iput p4, p0, Lcom/zykj/mistake/feature/collection/detail/b1;->d:I

    return-void
.end method

.method public synthetic constructor <init>(Lp4/b;ZLandroidx/compose/ui/Modifier;I)V
    .locals 1

    .line 4
    const/4 v0, 0x2

    iput v0, p0, Lcom/zykj/mistake/feature/collection/detail/b1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/b1;->c:Ljava/lang/Object;

    iput-boolean p2, p0, Lcom/zykj/mistake/feature/collection/detail/b1;->b:Z

    iput-object p3, p0, Lcom/zykj/mistake/feature/collection/detail/b1;->e:Ljava/lang/Object;

    iput p4, p0, Lcom/zykj/mistake/feature/collection/detail/b1;->d:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 69

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lcom/zykj/mistake/feature/collection/detail/b1;->a:I

    .line 4
    .line 5
    sget-object v2, Ld6/s;->a:Ld6/s;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    iget v4, v1, Lcom/zykj/mistake/feature/collection/detail/b1;->d:I

    .line 9
    .line 10
    iget-object v5, v1, Lcom/zykj/mistake/feature/collection/detail/b1;->e:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v6, v1, Lcom/zykj/mistake/feature/collection/detail/b1;->c:Ljava/lang/Object;

    .line 13
    .line 14
    iget-boolean v7, v1, Lcom/zykj/mistake/feature/collection/detail/b1;->b:Z

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast v6, Lr6/a;

    .line 20
    .line 21
    check-cast v5, Landroidx/compose/ui/Modifier;

    .line 22
    .line 23
    move-object/from16 v0, p1

    .line 24
    .line 25
    check-cast v0, Landroidx/compose/runtime/Composer;

    .line 26
    .line 27
    move-object/from16 v8, p2

    .line 28
    .line 29
    check-cast v8, Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    or-int/2addr v3, v4

    .line 35
    invoke-static {v3}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    invoke-static {v5, v6, v7, v0, v3}, Lcom/zykj/mistake/feature/notebook/list/j;->a(Landroidx/compose/ui/Modifier;Lr6/a;ZLandroidx/compose/runtime/Composer;I)V

    .line 40
    .line 41
    .line 42
    return-object v2

    .line 43
    :pswitch_0
    check-cast v6, Lp4/b;

    .line 44
    .line 45
    check-cast v5, Landroidx/compose/ui/Modifier;

    .line 46
    .line 47
    move-object/from16 v0, p1

    .line 48
    .line 49
    check-cast v0, Landroidx/compose/runtime/Composer;

    .line 50
    .line 51
    move-object/from16 v8, p2

    .line 52
    .line 53
    check-cast v8, Ljava/lang/Integer;

    .line 54
    .line 55
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    or-int/2addr v3, v4

    .line 59
    invoke-static {v3}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    invoke-static {v6, v7, v5, v0, v3}, Lcom/zykj/mistake/feature/notebook/list/d;->a(Lp4/b;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 64
    .line 65
    .line 66
    return-object v2

    .line 67
    :pswitch_1
    check-cast v5, Ljava/lang/String;

    .line 68
    .line 69
    check-cast v6, Lr6/a;

    .line 70
    .line 71
    move-object/from16 v0, p1

    .line 72
    .line 73
    check-cast v0, Landroidx/compose/runtime/Composer;

    .line 74
    .line 75
    move-object/from16 v8, p2

    .line 76
    .line 77
    check-cast v8, Ljava/lang/Integer;

    .line 78
    .line 79
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 80
    .line 81
    .line 82
    or-int/2addr v3, v4

    .line 83
    invoke-static {v3}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    invoke-static {v5, v7, v6, v0, v3}, Lcom/zykj/mistake/feature/notebook/detail/t;->i(Ljava/lang/String;ZLr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 88
    .line 89
    .line 90
    return-object v2

    .line 91
    :pswitch_2
    move-object v12, v6

    .line 92
    check-cast v12, Lr6/a;

    .line 93
    .line 94
    move-object/from16 v17, v5

    .line 95
    .line 96
    check-cast v17, Lr6/a;

    .line 97
    .line 98
    move-object/from16 v0, p1

    .line 99
    .line 100
    check-cast v0, Landroidx/compose/runtime/Composer;

    .line 101
    .line 102
    move-object/from16 v5, p2

    .line 103
    .line 104
    check-cast v5, Ljava/lang/Integer;

    .line 105
    .line 106
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    and-int/lit8 v6, v5, 0x3

    .line 111
    .line 112
    const/4 v8, 0x2

    .line 113
    const/4 v15, 0x0

    .line 114
    if-eq v6, v8, :cond_0

    .line 115
    .line 116
    move v6, v3

    .line 117
    goto :goto_0

    .line 118
    :cond_0
    move v6, v15

    .line 119
    :goto_0
    and-int/lit8 v8, v5, 0x1

    .line 120
    .line 121
    invoke-interface {v0, v6, v8}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 122
    .line 123
    .line 124
    move-result v6

    .line 125
    if-eqz v6, :cond_18

    .line 126
    .line 127
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    if-eqz v6, :cond_1

    .line 132
    .line 133
    const/4 v6, -0x1

    .line 134
    const-string v8, "com.zykj.mistake.feature.collection.detail.RemoveMistakeConfirmDialog.<anonymous> (MistakeCollectionDetailScreen.kt:330)"

    .line 135
    .line 136
    const v9, -0x5daf72c7

    .line 137
    .line 138
    .line 139
    invoke-static {v9, v5, v6, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 140
    .line 141
    .line 142
    :cond_1
    sget-object v5, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 143
    .line 144
    const/16 v6, 0x1ae

    .line 145
    .line 146
    int-to-float v6, v6

    .line 147
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 148
    .line 149
    .line 150
    move-result v6

    .line 151
    invoke-static {v5, v6}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    sget-object v44, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 156
    .line 157
    invoke-virtual/range {v44 .. v44}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 158
    .line 159
    .line 160
    move-result-wide v8

    .line 161
    const/4 v10, 0x4

    .line 162
    int-to-float v10, v10

    .line 163
    invoke-static {v10, v6, v8, v9}, Landroidx/compose/material3/c;->f(FLandroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    const/16 v8, 0x2c

    .line 168
    .line 169
    int-to-float v8, v8

    .line 170
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 171
    .line 172
    .line 173
    move-result v8

    .line 174
    const/16 v9, 0x1e

    .line 175
    .line 176
    int-to-float v9, v9

    .line 177
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 178
    .line 179
    .line 180
    move-result v9

    .line 181
    invoke-static {v6, v8, v9}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 182
    .line 183
    .line 184
    move-result-object v6

    .line 185
    sget-object v45, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 186
    .line 187
    invoke-virtual/range {v45 .. v45}, Landroidx/compose/ui/Alignment$Companion;->getCenterHorizontally()Landroidx/compose/ui/Alignment$Horizontal;

    .line 188
    .line 189
    .line 190
    move-result-object v8

    .line 191
    sget-object v9, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 192
    .line 193
    invoke-virtual {v9}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 194
    .line 195
    .line 196
    move-result-object v11

    .line 197
    const/16 v13, 0x30

    .line 198
    .line 199
    invoke-static {v11, v8, v0, v13}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 200
    .line 201
    .line 202
    move-result-object v8

    .line 203
    invoke-static {v0, v15}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 204
    .line 205
    .line 206
    move-result v11

    .line 207
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 208
    .line 209
    .line 210
    move-result-object v14

    .line 211
    invoke-static {v0, v6}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 212
    .line 213
    .line 214
    move-result-object v6

    .line 215
    move-object/from16 p1, v9

    .line 216
    .line 217
    sget-object v9, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 218
    .line 219
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 224
    .line 225
    .line 226
    move-result-object v18

    .line 227
    if-nez v18, :cond_2

    .line 228
    .line 229
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 230
    .line 231
    .line 232
    :cond_2
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 233
    .line 234
    .line 235
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 236
    .line 237
    .line 238
    move-result v18

    .line 239
    if-eqz v18, :cond_3

    .line 240
    .line 241
    invoke-interface {v0, v3}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 242
    .line 243
    .line 244
    goto :goto_1

    .line 245
    :cond_3
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 246
    .line 247
    .line 248
    :goto_1
    invoke-static {v0}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 249
    .line 250
    .line 251
    move-result-object v3

    .line 252
    invoke-static {v9, v3, v8, v3, v14}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 253
    .line 254
    .line 255
    move-result-object v8

    .line 256
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 257
    .line 258
    .line 259
    move-result v14

    .line 260
    if-nez v14, :cond_4

    .line 261
    .line 262
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v14

    .line 266
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 267
    .line 268
    .line 269
    move-result-object v15

    .line 270
    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result v14

    .line 274
    if-nez v14, :cond_5

    .line 275
    .line 276
    :cond_4
    invoke-static {v11, v3, v11, v8}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 277
    .line 278
    .line 279
    :cond_5
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 280
    .line 281
    .line 282
    move-result-object v8

    .line 283
    invoke-static {v3, v6, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 284
    .line 285
    .line 286
    sget-object v3, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 287
    .line 288
    invoke-virtual/range {v45 .. v45}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 289
    .line 290
    .line 291
    move-result-object v3

    .line 292
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 293
    .line 294
    .line 295
    move-result-object v6

    .line 296
    invoke-static {v6, v3, v0, v13}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 297
    .line 298
    .line 299
    move-result-object v3

    .line 300
    const/4 v6, 0x0

    .line 301
    invoke-static {v0, v6}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 302
    .line 303
    .line 304
    move-result v8

    .line 305
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 306
    .line 307
    .line 308
    move-result-object v6

    .line 309
    invoke-static {v0, v5}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 310
    .line 311
    .line 312
    move-result-object v11

    .line 313
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 314
    .line 315
    .line 316
    move-result-object v13

    .line 317
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 318
    .line 319
    .line 320
    move-result-object v14

    .line 321
    if-nez v14, :cond_6

    .line 322
    .line 323
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 324
    .line 325
    .line 326
    :cond_6
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 327
    .line 328
    .line 329
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 330
    .line 331
    .line 332
    move-result v14

    .line 333
    if-eqz v14, :cond_7

    .line 334
    .line 335
    invoke-interface {v0, v13}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 336
    .line 337
    .line 338
    goto :goto_2

    .line 339
    :cond_7
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 340
    .line 341
    .line 342
    :goto_2
    invoke-static {v0}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 343
    .line 344
    .line 345
    move-result-object v13

    .line 346
    invoke-static {v9, v13, v3, v13, v6}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 347
    .line 348
    .line 349
    move-result-object v3

    .line 350
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 351
    .line 352
    .line 353
    move-result v6

    .line 354
    if-nez v6, :cond_8

    .line 355
    .line 356
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v6

    .line 360
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 361
    .line 362
    .line 363
    move-result-object v14

    .line 364
    invoke-static {v6, v14}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    move-result v6

    .line 368
    if-nez v6, :cond_9

    .line 369
    .line 370
    :cond_8
    invoke-static {v8, v13, v8, v3}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 371
    .line 372
    .line 373
    :cond_9
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 374
    .line 375
    .line 376
    move-result-object v3

    .line 377
    invoke-static {v13, v11, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 378
    .line 379
    .line 380
    sget-object v3, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 381
    .line 382
    sget v3, Lcom/zykj/mistake/R$mipmap;->ic_warning:I

    .line 383
    .line 384
    const/4 v6, 0x0

    .line 385
    invoke-static {v3, v0, v6}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 386
    .line 387
    .line 388
    move-result-object v18

    .line 389
    const/16 v3, 0x14

    .line 390
    .line 391
    int-to-float v3, v3

    .line 392
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 393
    .line 394
    .line 395
    move-result v3

    .line 396
    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 397
    .line 398
    .line 399
    move-result-object v20

    .line 400
    const/16 v26, 0x1b0

    .line 401
    .line 402
    const/16 v27, 0x78

    .line 403
    .line 404
    const/16 v19, 0x0

    .line 405
    .line 406
    const/16 v21, 0x0

    .line 407
    .line 408
    const/16 v22, 0x0

    .line 409
    .line 410
    const/16 v23, 0x0

    .line 411
    .line 412
    const/16 v24, 0x0

    .line 413
    .line 414
    move-object/from16 v25, v0

    .line 415
    .line 416
    invoke-static/range {v18 .. v27}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 417
    .line 418
    .line 419
    move-object/from16 v39, v25

    .line 420
    .line 421
    const-wide v13, 0xff15171aL

    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    invoke-static {v13, v14}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 427
    .line 428
    .line 429
    move-result-wide v13

    .line 430
    const/16 v0, 0x10

    .line 431
    .line 432
    invoke-static {v0}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 433
    .line 434
    .line 435
    move-result-wide v25

    .line 436
    sget-object v0, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    .line 437
    .line 438
    invoke-virtual {v0}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    const/16 v3, 0x8

    .line 443
    .line 444
    int-to-float v3, v3

    .line 445
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 446
    .line 447
    .line 448
    move-result v19

    .line 449
    const/16 v23, 0xe

    .line 450
    .line 451
    const/16 v20, 0x0

    .line 452
    .line 453
    const/16 v21, 0x0

    .line 454
    .line 455
    const/16 v22, 0x0

    .line 456
    .line 457
    move-object/from16 v18, v5

    .line 458
    .line 459
    invoke-static/range {v18 .. v24}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 460
    .line 461
    .line 462
    move-result-object v19

    .line 463
    move-object/from16 v3, v18

    .line 464
    .line 465
    const/16 v41, 0x0

    .line 466
    .line 467
    const v42, 0x1ffd0

    .line 468
    .line 469
    .line 470
    const-string v18, "\u79fb\u9664\u9519\u9898"

    .line 471
    .line 472
    move-wide/from16 v22, v25

    .line 473
    .line 474
    const/16 v26, 0x0

    .line 475
    .line 476
    const-wide/16 v27, 0x0

    .line 477
    .line 478
    const/16 v29, 0x0

    .line 479
    .line 480
    const/16 v30, 0x0

    .line 481
    .line 482
    const-wide/16 v31, 0x0

    .line 483
    .line 484
    const/16 v33, 0x0

    .line 485
    .line 486
    const/16 v34, 0x0

    .line 487
    .line 488
    const/16 v35, 0x0

    .line 489
    .line 490
    const/16 v36, 0x0

    .line 491
    .line 492
    const/16 v37, 0x0

    .line 493
    .line 494
    const/16 v38, 0x0

    .line 495
    .line 496
    const v40, 0x30db6

    .line 497
    .line 498
    .line 499
    move-object/from16 v25, v0

    .line 500
    .line 501
    move-wide/from16 v20, v13

    .line 502
    .line 503
    invoke-static/range {v18 .. v42}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 504
    .line 505
    .line 506
    invoke-interface/range {v39 .. v39}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 507
    .line 508
    .line 509
    new-instance v5, Landroidx/compose/ui/text/AnnotatedString$Builder;

    .line 510
    .line 511
    const/4 v0, 0x0

    .line 512
    const/4 v6, 0x1

    .line 513
    const/4 v8, 0x0

    .line 514
    invoke-direct {v5, v8, v6, v0}, Landroidx/compose/ui/text/AnnotatedString$Builder;-><init>(IILkotlin/jvm/internal/e;)V

    .line 515
    .line 516
    .line 517
    const-string v0, "\u5373\u5c06\u5220\u9664\u9009\u4e2d\u7684 "

    .line 518
    .line 519
    invoke-virtual {v5, v0}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V

    .line 520
    .line 521
    .line 522
    new-instance v46, Landroidx/compose/ui/text/SpanStyle;

    .line 523
    .line 524
    const-wide v13, 0xffff5e5eL

    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    invoke-static {v13, v14}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 530
    .line 531
    .line 532
    move-result-wide v47

    .line 533
    const v67, 0xfffe

    .line 534
    .line 535
    .line 536
    const/16 v68, 0x0

    .line 537
    .line 538
    const-wide/16 v49, 0x0

    .line 539
    .line 540
    const/16 v51, 0x0

    .line 541
    .line 542
    const/16 v52, 0x0

    .line 543
    .line 544
    const/16 v53, 0x0

    .line 545
    .line 546
    const/16 v54, 0x0

    .line 547
    .line 548
    const/16 v55, 0x0

    .line 549
    .line 550
    const-wide/16 v56, 0x0

    .line 551
    .line 552
    const/16 v58, 0x0

    .line 553
    .line 554
    const/16 v59, 0x0

    .line 555
    .line 556
    const/16 v60, 0x0

    .line 557
    .line 558
    const-wide/16 v61, 0x0

    .line 559
    .line 560
    const/16 v63, 0x0

    .line 561
    .line 562
    const/16 v64, 0x0

    .line 563
    .line 564
    const/16 v65, 0x0

    .line 565
    .line 566
    const/16 v66, 0x0

    .line 567
    .line 568
    invoke-direct/range {v46 .. v68}, Landroidx/compose/ui/text/SpanStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;ILkotlin/jvm/internal/e;)V

    .line 569
    .line 570
    .line 571
    move-object/from16 v0, v46

    .line 572
    .line 573
    invoke-virtual {v5, v0}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pushStyle(Landroidx/compose/ui/text/SpanStyle;)I

    .line 574
    .line 575
    .line 576
    move-result v6

    .line 577
    :try_start_0
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    invoke-virtual {v5, v0}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 582
    .line 583
    .line 584
    invoke-virtual {v5, v6}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pop(I)V

    .line 585
    .line 586
    .line 587
    const-string v0, " \u9053\u9519\u9898\uff0c\u5220\u9664\u540e\u4ec5\u4ece\u672c\u9519\u9898\u96c6\u79fb\u9664\uff0c\u4e0d\u4f1a\u5220\u9664\u5bf9\u5e94\u79d1\u76ee\u5185\u7684\u9519\u9898\u672c\u4f53"

    .line 588
    .line 589
    invoke-virtual {v5, v0}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V

    .line 590
    .line 591
    .line 592
    invoke-virtual {v5}, Landroidx/compose/ui/text/AnnotatedString$Builder;->toAnnotatedString()Landroidx/compose/ui/text/AnnotatedString;

    .line 593
    .line 594
    .line 595
    move-result-object v0

    .line 596
    const-wide v4, 0xff666666L

    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    invoke-static {v4, v5}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 602
    .line 603
    .line 604
    move-result-wide v4

    .line 605
    const/16 v6, 0xc

    .line 606
    .line 607
    invoke-static {v6}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 608
    .line 609
    .line 610
    move-result-wide v13

    .line 611
    const/16 v6, 0x16

    .line 612
    .line 613
    int-to-float v6, v6

    .line 614
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 615
    .line 616
    .line 617
    move-result v20

    .line 618
    const/16 v23, 0xd

    .line 619
    .line 620
    const/16 v24, 0x0

    .line 621
    .line 622
    const/16 v19, 0x0

    .line 623
    .line 624
    const/16 v21, 0x0

    .line 625
    .line 626
    const/16 v22, 0x0

    .line 627
    .line 628
    move-object/from16 v18, v3

    .line 629
    .line 630
    invoke-static/range {v18 .. v24}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 631
    .line 632
    .line 633
    move-result-object v19

    .line 634
    sget-object v6, Landroidx/compose/ui/text/style/TextAlign;->Companion:Landroidx/compose/ui/text/style/TextAlign$Companion;

    .line 635
    .line 636
    invoke-virtual {v6}, Landroidx/compose/ui/text/style/TextAlign$Companion;->getCenter-e0LSkKk()I

    .line 637
    .line 638
    .line 639
    move-result v6

    .line 640
    const/16 v8, 0x12

    .line 641
    .line 642
    invoke-static {v8}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 643
    .line 644
    .line 645
    move-result-wide v31

    .line 646
    invoke-static {v6}, Landroidx/compose/ui/text/style/TextAlign;->box-impl(I)Landroidx/compose/ui/text/style/TextAlign;

    .line 647
    .line 648
    .line 649
    move-result-object v30

    .line 650
    const/16 v42, 0x6

    .line 651
    .line 652
    const v43, 0x3f9f0

    .line 653
    .line 654
    .line 655
    const/16 v25, 0x0

    .line 656
    .line 657
    const/16 v26, 0x0

    .line 658
    .line 659
    const-wide/16 v27, 0x0

    .line 660
    .line 661
    const/16 v29, 0x0

    .line 662
    .line 663
    const/16 v33, 0x0

    .line 664
    .line 665
    const/16 v34, 0x0

    .line 666
    .line 667
    const/16 v35, 0x0

    .line 668
    .line 669
    const/16 v36, 0x0

    .line 670
    .line 671
    const/16 v37, 0x0

    .line 672
    .line 673
    const/16 v38, 0x0

    .line 674
    .line 675
    move-object/from16 v40, v39

    .line 676
    .line 677
    const/16 v39, 0x0

    .line 678
    .line 679
    const/16 v41, 0xdb0

    .line 680
    .line 681
    move-object/from16 v18, v0

    .line 682
    .line 683
    move-wide/from16 v20, v4

    .line 684
    .line 685
    move-wide/from16 v22, v13

    .line 686
    .line 687
    invoke-static/range {v18 .. v43}, Landroidx/compose/material3/TextKt;->Text-IbK3jfQ(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILjava/util/Map;Lr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 688
    .line 689
    .line 690
    move-object/from16 v0, v40

    .line 691
    .line 692
    const/16 v4, 0x22

    .line 693
    .line 694
    int-to-float v4, v4

    .line 695
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 696
    .line 697
    .line 698
    move-result v20

    .line 699
    const/16 v23, 0xd

    .line 700
    .line 701
    const/16 v19, 0x0

    .line 702
    .line 703
    const/16 v21, 0x0

    .line 704
    .line 705
    const/16 v22, 0x0

    .line 706
    .line 707
    move-object/from16 v18, v3

    .line 708
    .line 709
    invoke-static/range {v18 .. v24}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 710
    .line 711
    .line 712
    move-result-object v3

    .line 713
    move-object/from16 v4, v18

    .line 714
    .line 715
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/layout/Arrangement;->getCenter()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 716
    .line 717
    .line 718
    move-result-object v5

    .line 719
    invoke-virtual/range {v45 .. v45}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    .line 720
    .line 721
    .line 722
    move-result-object v6

    .line 723
    const/4 v15, 0x6

    .line 724
    invoke-static {v5, v6, v0, v15}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 725
    .line 726
    .line 727
    move-result-object v5

    .line 728
    const/4 v6, 0x0

    .line 729
    invoke-static {v0, v6}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 730
    .line 731
    .line 732
    move-result v8

    .line 733
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 734
    .line 735
    .line 736
    move-result-object v6

    .line 737
    invoke-static {v0, v3}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 738
    .line 739
    .line 740
    move-result-object v3

    .line 741
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 742
    .line 743
    .line 744
    move-result-object v11

    .line 745
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 746
    .line 747
    .line 748
    move-result-object v13

    .line 749
    if-nez v13, :cond_a

    .line 750
    .line 751
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 752
    .line 753
    .line 754
    :cond_a
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 755
    .line 756
    .line 757
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 758
    .line 759
    .line 760
    move-result v13

    .line 761
    if-eqz v13, :cond_b

    .line 762
    .line 763
    invoke-interface {v0, v11}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 764
    .line 765
    .line 766
    goto :goto_3

    .line 767
    :cond_b
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 768
    .line 769
    .line 770
    :goto_3
    invoke-static {v0}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 771
    .line 772
    .line 773
    move-result-object v11

    .line 774
    invoke-static {v9, v11, v5, v11, v6}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 775
    .line 776
    .line 777
    move-result-object v5

    .line 778
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 779
    .line 780
    .line 781
    move-result v6

    .line 782
    if-nez v6, :cond_c

    .line 783
    .line 784
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 785
    .line 786
    .line 787
    move-result-object v6

    .line 788
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 789
    .line 790
    .line 791
    move-result-object v13

    .line 792
    invoke-static {v6, v13}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 793
    .line 794
    .line 795
    move-result v6

    .line 796
    if-nez v6, :cond_d

    .line 797
    .line 798
    :cond_c
    invoke-static {v8, v11, v8, v5}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 799
    .line 800
    .line 801
    :cond_d
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 802
    .line 803
    .line 804
    move-result-object v5

    .line 805
    invoke-static {v11, v3, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 806
    .line 807
    .line 808
    const/16 v3, 0x66

    .line 809
    .line 810
    int-to-float v3, v3

    .line 811
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 812
    .line 813
    .line 814
    move-result v5

    .line 815
    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 816
    .line 817
    .line 818
    move-result-object v5

    .line 819
    const/16 v6, 0x2a

    .line 820
    .line 821
    int-to-float v6, v6

    .line 822
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 823
    .line 824
    .line 825
    move-result v8

    .line 826
    invoke-static {v5, v8}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 827
    .line 828
    .line 829
    move-result-object v5

    .line 830
    const-wide v13, 0xffe8f1ffL

    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    invoke-static {v13, v14}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 836
    .line 837
    .line 838
    move-result-wide v13

    .line 839
    invoke-static {v10, v5, v13, v14}, Landroidx/compose/material3/c;->f(FLandroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    .line 840
    .line 841
    .line 842
    move-result-object v8

    .line 843
    const/4 v13, 0x7

    .line 844
    const/4 v14, 0x0

    .line 845
    move-object v5, v9

    .line 846
    const/4 v9, 0x0

    .line 847
    move v11, v10

    .line 848
    const/4 v10, 0x0

    .line 849
    move/from16 v16, v11

    .line 850
    .line 851
    const/4 v11, 0x0

    .line 852
    move-object/from16 p1, v5

    .line 853
    .line 854
    move/from16 v5, v16

    .line 855
    .line 856
    invoke-static/range {v8 .. v14}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 857
    .line 858
    .line 859
    move-result-object v8

    .line 860
    invoke-virtual/range {v45 .. v45}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 861
    .line 862
    .line 863
    move-result-object v9

    .line 864
    const/4 v10, 0x0

    .line 865
    invoke-static {v9, v10}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 866
    .line 867
    .line 868
    move-result-object v9

    .line 869
    invoke-static {v0, v10}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 870
    .line 871
    .line 872
    move-result v11

    .line 873
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 874
    .line 875
    .line 876
    move-result-object v12

    .line 877
    invoke-static {v0, v8}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 878
    .line 879
    .line 880
    move-result-object v8

    .line 881
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 882
    .line 883
    .line 884
    move-result-object v13

    .line 885
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 886
    .line 887
    .line 888
    move-result-object v14

    .line 889
    if-nez v14, :cond_e

    .line 890
    .line 891
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 892
    .line 893
    .line 894
    :cond_e
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 895
    .line 896
    .line 897
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 898
    .line 899
    .line 900
    move-result v14

    .line 901
    if-eqz v14, :cond_f

    .line 902
    .line 903
    invoke-interface {v0, v13}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 904
    .line 905
    .line 906
    goto :goto_4

    .line 907
    :cond_f
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 908
    .line 909
    .line 910
    :goto_4
    invoke-static {v0}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 911
    .line 912
    .line 913
    move-result-object v13

    .line 914
    move-object/from16 v14, p1

    .line 915
    .line 916
    invoke-static {v14, v13, v9, v13, v12}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 917
    .line 918
    .line 919
    move-result-object v9

    .line 920
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 921
    .line 922
    .line 923
    move-result v12

    .line 924
    if-nez v12, :cond_10

    .line 925
    .line 926
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 927
    .line 928
    .line 929
    move-result-object v12

    .line 930
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 931
    .line 932
    .line 933
    move-result-object v10

    .line 934
    invoke-static {v12, v10}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 935
    .line 936
    .line 937
    move-result v10

    .line 938
    if-nez v10, :cond_11

    .line 939
    .line 940
    :cond_10
    invoke-static {v11, v13, v11, v9}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 941
    .line 942
    .line 943
    :cond_11
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 944
    .line 945
    .line 946
    move-result-object v9

    .line 947
    invoke-static {v13, v8, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 948
    .line 949
    .line 950
    sget-object v8, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 951
    .line 952
    const-wide v8, 0xff1576ffL

    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    invoke-static {v8, v9}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 958
    .line 959
    .line 960
    move-result-wide v20

    .line 961
    const/16 v10, 0xf

    .line 962
    .line 963
    invoke-static {v10}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 964
    .line 965
    .line 966
    move-result-wide v22

    .line 967
    const/16 v41, 0x0

    .line 968
    .line 969
    const v42, 0x1fff2

    .line 970
    .line 971
    .line 972
    const-string v18, "\u53d6\u6d88"

    .line 973
    .line 974
    const/16 v19, 0x0

    .line 975
    .line 976
    const/16 v24, 0x0

    .line 977
    .line 978
    const/16 v25, 0x0

    .line 979
    .line 980
    const/16 v26, 0x0

    .line 981
    .line 982
    const-wide/16 v27, 0x0

    .line 983
    .line 984
    const/16 v29, 0x0

    .line 985
    .line 986
    const/16 v30, 0x0

    .line 987
    .line 988
    const-wide/16 v31, 0x0

    .line 989
    .line 990
    const/16 v33, 0x0

    .line 991
    .line 992
    const/16 v34, 0x0

    .line 993
    .line 994
    const/16 v35, 0x0

    .line 995
    .line 996
    const/16 v36, 0x0

    .line 997
    .line 998
    const/16 v37, 0x0

    .line 999
    .line 1000
    const/16 v38, 0x0

    .line 1001
    .line 1002
    const/16 v40, 0xd86

    .line 1003
    .line 1004
    move-object/from16 v39, v0

    .line 1005
    .line 1006
    invoke-static/range {v18 .. v42}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 1007
    .line 1008
    .line 1009
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1010
    .line 1011
    .line 1012
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 1013
    .line 1014
    .line 1015
    move-result v11

    .line 1016
    invoke-static {v4, v11}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v11

    .line 1020
    invoke-static {v11, v0, v15}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 1021
    .line 1022
    .line 1023
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 1024
    .line 1025
    .line 1026
    move-result v3

    .line 1027
    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v3

    .line 1031
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 1032
    .line 1033
    .line 1034
    move-result v4

    .line 1035
    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v3

    .line 1039
    if-eqz v7, :cond_12

    .line 1040
    .line 1041
    const v4, 0x3f266666    # 0.65f

    .line 1042
    .line 1043
    .line 1044
    goto :goto_5

    .line 1045
    :cond_12
    const/high16 v4, 0x3f800000    # 1.0f

    .line 1046
    .line 1047
    :goto_5
    invoke-static {v3, v4}, Landroidx/compose/ui/draw/AlphaKt;->alpha(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v3

    .line 1051
    invoke-static {v8, v9}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 1052
    .line 1053
    .line 1054
    move-result-wide v8

    .line 1055
    invoke-static {v5, v3, v8, v9}, Landroidx/compose/material3/c;->f(FLandroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v13

    .line 1059
    move-object v5, v14

    .line 1060
    xor-int/lit8 v14, v7, 0x1

    .line 1061
    .line 1062
    const/16 v18, 0x6

    .line 1063
    .line 1064
    const/16 v19, 0x0

    .line 1065
    .line 1066
    const/4 v15, 0x0

    .line 1067
    const/16 v16, 0x0

    .line 1068
    .line 1069
    const/4 v6, 0x0

    .line 1070
    invoke-static/range {v13 .. v19}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v3

    .line 1074
    invoke-virtual/range {v45 .. v45}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v4

    .line 1078
    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v4

    .line 1082
    invoke-static {v0, v6}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 1083
    .line 1084
    .line 1085
    move-result v6

    .line 1086
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v8

    .line 1090
    invoke-static {v0, v3}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v3

    .line 1094
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v9

    .line 1098
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v11

    .line 1102
    if-nez v11, :cond_13

    .line 1103
    .line 1104
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 1105
    .line 1106
    .line 1107
    :cond_13
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 1108
    .line 1109
    .line 1110
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 1111
    .line 1112
    .line 1113
    move-result v11

    .line 1114
    if-eqz v11, :cond_14

    .line 1115
    .line 1116
    invoke-interface {v0, v9}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 1117
    .line 1118
    .line 1119
    goto :goto_6

    .line 1120
    :cond_14
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 1121
    .line 1122
    .line 1123
    :goto_6
    invoke-static {v0}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v9

    .line 1127
    invoke-static {v5, v9, v4, v9, v8}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v4

    .line 1131
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 1132
    .line 1133
    .line 1134
    move-result v8

    .line 1135
    if-nez v8, :cond_15

    .line 1136
    .line 1137
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v8

    .line 1141
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v11

    .line 1145
    invoke-static {v8, v11}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1146
    .line 1147
    .line 1148
    move-result v8

    .line 1149
    if-nez v8, :cond_16

    .line 1150
    .line 1151
    :cond_15
    invoke-static {v6, v9, v6, v4}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 1152
    .line 1153
    .line 1154
    :cond_16
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v4

    .line 1158
    invoke-static {v9, v3, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 1159
    .line 1160
    .line 1161
    if-eqz v7, :cond_17

    .line 1162
    .line 1163
    const-string v3, "\u5220\u9664\u4e2d..."

    .line 1164
    .line 1165
    :goto_7
    move-object/from16 v18, v3

    .line 1166
    .line 1167
    goto :goto_8

    .line 1168
    :cond_17
    const-string v3, "\u786e\u8ba4"

    .line 1169
    .line 1170
    goto :goto_7

    .line 1171
    :goto_8
    invoke-virtual/range {v44 .. v44}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 1172
    .line 1173
    .line 1174
    move-result-wide v20

    .line 1175
    invoke-static {v10}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 1176
    .line 1177
    .line 1178
    move-result-wide v22

    .line 1179
    const/16 v41, 0x0

    .line 1180
    .line 1181
    const v42, 0x1fff2

    .line 1182
    .line 1183
    .line 1184
    const/16 v19, 0x0

    .line 1185
    .line 1186
    const/16 v24, 0x0

    .line 1187
    .line 1188
    const/16 v25, 0x0

    .line 1189
    .line 1190
    const/16 v26, 0x0

    .line 1191
    .line 1192
    const-wide/16 v27, 0x0

    .line 1193
    .line 1194
    const/16 v29, 0x0

    .line 1195
    .line 1196
    const/16 v30, 0x0

    .line 1197
    .line 1198
    const-wide/16 v31, 0x0

    .line 1199
    .line 1200
    const/16 v33, 0x0

    .line 1201
    .line 1202
    const/16 v34, 0x0

    .line 1203
    .line 1204
    const/16 v35, 0x0

    .line 1205
    .line 1206
    const/16 v36, 0x0

    .line 1207
    .line 1208
    const/16 v37, 0x0

    .line 1209
    .line 1210
    const/16 v38, 0x0

    .line 1211
    .line 1212
    const/16 v40, 0xd80

    .line 1213
    .line 1214
    move-object/from16 v39, v0

    .line 1215
    .line 1216
    invoke-static/range {v18 .. v42}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 1217
    .line 1218
    .line 1219
    invoke-interface/range {v39 .. v39}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1220
    .line 1221
    .line 1222
    invoke-interface/range {v39 .. v39}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1223
    .line 1224
    .line 1225
    invoke-interface/range {v39 .. v39}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1226
    .line 1227
    .line 1228
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 1229
    .line 1230
    .line 1231
    move-result v0

    .line 1232
    if-eqz v0, :cond_19

    .line 1233
    .line 1234
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 1235
    .line 1236
    .line 1237
    goto :goto_9

    .line 1238
    :catchall_0
    move-exception v0

    .line 1239
    invoke-virtual {v5, v6}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pop(I)V

    .line 1240
    .line 1241
    .line 1242
    throw v0

    .line 1243
    :cond_18
    move-object/from16 v39, v0

    .line 1244
    .line 1245
    invoke-interface/range {v39 .. v39}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 1246
    .line 1247
    .line 1248
    :cond_19
    :goto_9
    return-object v2

    .line 1249
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
