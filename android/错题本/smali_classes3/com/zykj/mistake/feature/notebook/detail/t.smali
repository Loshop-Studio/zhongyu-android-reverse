.class public abstract Lcom/zykj/mistake/feature/notebook/detail/t;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lr6/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 35

    .line 1
    move-object/from16 v4, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move/from16 v8, p3

    .line 6
    .line 7
    const-string v0, "onShowAnswer"

    .line 8
    .line 9
    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const v0, 0x1eeb867a

    .line 13
    .line 14
    .line 15
    move-object/from16 v1, p2

    .line 16
    .line 17
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    and-int/lit8 v2, v8, 0x6

    .line 22
    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    const/4 v2, 0x4

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v2, 0x2

    .line 34
    :goto_0
    or-int/2addr v2, v8

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move v2, v8

    .line 37
    :goto_1
    and-int/lit8 v3, v8, 0x30

    .line 38
    .line 39
    if-nez v3, :cond_3

    .line 40
    .line 41
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_2

    .line 46
    .line 47
    const/16 v3, 0x20

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const/16 v3, 0x10

    .line 51
    .line 52
    :goto_2
    or-int/2addr v2, v3

    .line 53
    :cond_3
    and-int/lit8 v3, v2, 0x13

    .line 54
    .line 55
    const/4 v5, 0x1

    .line 56
    const/16 v6, 0x12

    .line 57
    .line 58
    const/4 v9, 0x0

    .line 59
    if-eq v3, v6, :cond_4

    .line 60
    .line 61
    move v3, v5

    .line 62
    goto :goto_3

    .line 63
    :cond_4
    move v3, v9

    .line 64
    :goto_3
    and-int/lit8 v10, v2, 0x1

    .line 65
    .line 66
    invoke-interface {v1, v3, v10}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-eqz v3, :cond_a

    .line 71
    .line 72
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-eqz v3, :cond_5

    .line 77
    .line 78
    const/4 v3, -0x1

    .line 79
    const-string v10, "com.zykj.mistake.feature.notebook.detail.AnswerCover (MistakeDetailAnswerPanel.kt:107)"

    .line 80
    .line 81
    invoke-static {v0, v2, v3, v10}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :cond_5
    sget-object v0, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 85
    .line 86
    invoke-virtual {v0}, Landroidx/compose/ui/Alignment$Companion;->getCenterHorizontally()Landroidx/compose/ui/Alignment$Horizontal;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    sget-object v2, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 91
    .line 92
    invoke-virtual {v2}, Landroidx/compose/foundation/layout/Arrangement;->getCenter()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    const/16 v3, 0x36

    .line 97
    .line 98
    invoke-static {v2, v0, v1, v3}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-static {v1, v9}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-static {v1, v7}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 111
    .line 112
    .line 113
    move-result-object v10

    .line 114
    sget-object v11, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 115
    .line 116
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 117
    .line 118
    .line 119
    move-result-object v12

    .line 120
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 121
    .line 122
    .line 123
    move-result-object v13

    .line 124
    if-nez v13, :cond_6

    .line 125
    .line 126
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 127
    .line 128
    .line 129
    :cond_6
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 130
    .line 131
    .line 132
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 133
    .line 134
    .line 135
    move-result v13

    .line 136
    if-eqz v13, :cond_7

    .line 137
    .line 138
    invoke-interface {v1, v12}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 139
    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_7
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 143
    .line 144
    .line 145
    :goto_4
    invoke-static {v1}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 146
    .line 147
    .line 148
    move-result-object v12

    .line 149
    invoke-static {v11, v12, v0, v12, v3}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    if-nez v3, :cond_8

    .line 158
    .line 159
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 164
    .line 165
    .line 166
    move-result-object v13

    .line 167
    invoke-static {v3, v13}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    if-nez v3, :cond_9

    .line 172
    .line 173
    :cond_8
    invoke-static {v2, v12, v2, v0}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 174
    .line 175
    .line 176
    :cond_9
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-static {v12, v10, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 181
    .line 182
    .line 183
    sget-object v0, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 184
    .line 185
    sget v0, Lcom/zykj/mistake/R$drawable;->ic_show_answer:I

    .line 186
    .line 187
    invoke-static {v0, v1, v9}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 188
    .line 189
    .line 190
    move-result-object v9

    .line 191
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 192
    .line 193
    const/16 v2, 0x64

    .line 194
    .line 195
    int-to-float v2, v2

    .line 196
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 201
    .line 202
    .line 203
    move-result-object v11

    .line 204
    const/16 v17, 0x1b0

    .line 205
    .line 206
    const/16 v18, 0x78

    .line 207
    .line 208
    const/4 v12, 0x0

    .line 209
    const/4 v13, 0x0

    .line 210
    const/4 v14, 0x0

    .line 211
    const/4 v15, 0x0

    .line 212
    const-string v10, "\u67e5\u770b\u7b54\u6848"

    .line 213
    .line 214
    move-object/from16 v16, v1

    .line 215
    .line 216
    invoke-static/range {v9 .. v18}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 217
    .line 218
    .line 219
    move-object/from16 v9, v16

    .line 220
    .line 221
    int-to-float v10, v6

    .line 222
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 223
    .line 224
    .line 225
    move-result v1

    .line 226
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    const/4 v2, 0x6

    .line 231
    invoke-static {v1, v9, v2}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 232
    .line 233
    .line 234
    sget-wide v11, Lcom/zykj/mistake/feature/notebook/detail/t4;->a:J

    .line 235
    .line 236
    const/16 v1, 0xf

    .line 237
    .line 238
    invoke-static {v1}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 239
    .line 240
    .line 241
    move-result-wide v13

    .line 242
    sget-object v1, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    .line 243
    .line 244
    invoke-virtual {v1}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getMedium()Landroidx/compose/ui/text/font/FontWeight;

    .line 245
    .line 246
    .line 247
    move-result-object v16

    .line 248
    move v1, v5

    .line 249
    const/4 v5, 0x7

    .line 250
    const/4 v6, 0x0

    .line 251
    move v2, v1

    .line 252
    const/4 v1, 0x0

    .line 253
    move v3, v2

    .line 254
    const/4 v2, 0x0

    .line 255
    move v15, v3

    .line 256
    const/4 v3, 0x0

    .line 257
    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    const/16 v32, 0xc00

    .line 262
    .line 263
    const v33, 0x1dfd0

    .line 264
    .line 265
    .line 266
    move v2, v15

    .line 267
    const/4 v15, 0x0

    .line 268
    const/16 v17, 0x0

    .line 269
    .line 270
    const-wide/16 v18, 0x0

    .line 271
    .line 272
    const/16 v20, 0x0

    .line 273
    .line 274
    const/16 v21, 0x0

    .line 275
    .line 276
    const-wide/16 v22, 0x0

    .line 277
    .line 278
    const/16 v24, 0x0

    .line 279
    .line 280
    const/16 v25, 0x0

    .line 281
    .line 282
    const/16 v26, 0x1

    .line 283
    .line 284
    const/16 v27, 0x0

    .line 285
    .line 286
    const/16 v28, 0x0

    .line 287
    .line 288
    const/16 v29, 0x0

    .line 289
    .line 290
    const v31, 0x30d86

    .line 291
    .line 292
    .line 293
    move-object/from16 v30, v9

    .line 294
    .line 295
    const-string v9, "\u70b9\u51fb\u67e5\u770b\u7b54\u6848"

    .line 296
    .line 297
    move/from16 v34, v10

    .line 298
    .line 299
    move-object v10, v1

    .line 300
    move/from16 v1, v34

    .line 301
    .line 302
    invoke-static/range {v9 .. v33}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 303
    .line 304
    .line 305
    move-object/from16 v9, v30

    .line 306
    .line 307
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 308
    .line 309
    .line 310
    move-result v1

    .line 311
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    const/4 v1, 0x6

    .line 316
    invoke-static {v0, v9, v1}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 317
    .line 318
    .line 319
    const-wide v0, 0xff999999L

    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 325
    .line 326
    .line 327
    move-result-wide v11

    .line 328
    const/16 v0, 0xc

    .line 329
    .line 330
    invoke-static {v0}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 331
    .line 332
    .line 333
    move-result-wide v13

    .line 334
    const v33, 0x1dff2

    .line 335
    .line 336
    .line 337
    const/4 v10, 0x0

    .line 338
    const/16 v16, 0x0

    .line 339
    .line 340
    const/16 v31, 0xd86

    .line 341
    .line 342
    const-string v9, "\u7ec3\u4e60\u6a21\u5f0f\u53ef\u5728\u4e0a\u4e00\u9875\u5173\u95ed"

    .line 343
    .line 344
    invoke-static/range {v9 .. v33}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 345
    .line 346
    .line 347
    const-wide v0, 0xff999999L

    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 353
    .line 354
    .line 355
    move-result-wide v11

    .line 356
    const/16 v0, 0xc

    .line 357
    .line 358
    invoke-static {v0}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 359
    .line 360
    .line 361
    move-result-wide v13

    .line 362
    const-string v9, "\u7ec3\u4e60\u6a21\u5f0f\u4e0b\u4e0d\u4fdd\u5b58\u8349\u7a3f\uff0c\u4ec5\u4e34\u65f6\u4f7f\u7528"

    .line 363
    .line 364
    invoke-static/range {v9 .. v33}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 365
    .line 366
    .line 367
    invoke-interface/range {v30 .. v30}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 368
    .line 369
    .line 370
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 371
    .line 372
    .line 373
    move-result v0

    .line 374
    if-eqz v0, :cond_b

    .line 375
    .line 376
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 377
    .line 378
    .line 379
    goto :goto_5

    .line 380
    :cond_a
    move-object/from16 v30, v1

    .line 381
    .line 382
    move v2, v5

    .line 383
    invoke-interface/range {v30 .. v30}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 384
    .line 385
    .line 386
    :cond_b
    :goto_5
    invoke-interface/range {v30 .. v30}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    if-eqz v0, :cond_c

    .line 391
    .line 392
    new-instance v1, Lcom/zykj/mistake/feature/collection/list/z;

    .line 393
    .line 394
    invoke-direct {v1, v4, v7, v8, v2}, Lcom/zykj/mistake/feature/collection/list/z;-><init>(Lr6/a;Landroidx/compose/ui/Modifier;II)V

    .line 395
    .line 396
    .line 397
    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 398
    .line 399
    .line 400
    :cond_c
    return-void
.end method

.method public static final b(Ljava/lang/String;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerDisplayType;Ljava/util/List;Ljava/util/List;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;Lr6/c;ZZLandroidx/compose/runtime/Composer;I)V
    .locals 34

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move/from16 v5, p6

    move/from16 v6, p7

    move/from16 v7, p9

    const-string v8, "index"

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "displayType"

    move-object/from16 v9, p1

    invoke-static {v9, v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "answers"

    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "comments"

    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "visualState"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const v8, -0x1e537ee1

    move-object/from16 v10, p8

    .line 1
    invoke-interface {v10, v8}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v10

    and-int/lit8 v11, v7, 0x6

    if-nez v11, :cond_1

    invoke-interface {v10, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_0

    const/4 v11, 0x4

    goto :goto_0

    :cond_0
    const/4 v11, 0x2

    :goto_0
    or-int/2addr v11, v7

    goto :goto_1

    :cond_1
    move v11, v7

    :goto_1
    and-int/lit8 v13, v7, 0x30

    if-nez v13, :cond_3

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v13

    invoke-interface {v10, v13}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v13

    if-eqz v13, :cond_2

    const/16 v13, 0x20

    goto :goto_2

    :cond_2
    const/16 v13, 0x10

    :goto_2
    or-int/2addr v11, v13

    :cond_3
    and-int/lit16 v13, v7, 0x180

    if-nez v13, :cond_5

    invoke-interface {v10, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_4

    const/16 v13, 0x100

    goto :goto_3

    :cond_4
    const/16 v13, 0x80

    :goto_3
    or-int/2addr v11, v13

    :cond_5
    and-int/lit16 v13, v7, 0xc00

    if-nez v13, :cond_7

    invoke-interface {v10, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_6

    const/16 v13, 0x800

    goto :goto_4

    :cond_6
    const/16 v13, 0x400

    :goto_4
    or-int/2addr v11, v13

    :cond_7
    and-int/lit16 v13, v7, 0x6000

    if-nez v13, :cond_9

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v13

    invoke-interface {v10, v13}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v13

    if-eqz v13, :cond_8

    const/16 v13, 0x4000

    goto :goto_5

    :cond_8
    const/16 v13, 0x2000

    :goto_5
    or-int/2addr v11, v13

    :cond_9
    const/high16 v13, 0x30000

    and-int/2addr v13, v7

    if-nez v13, :cond_b

    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_a

    const/high16 v13, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v13, 0x10000

    :goto_6
    or-int/2addr v11, v13

    :cond_b
    const/high16 v13, 0x180000

    and-int/2addr v13, v7

    if-nez v13, :cond_d

    invoke-interface {v10, v5}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v13

    if-eqz v13, :cond_c

    const/high16 v13, 0x100000

    goto :goto_7

    :cond_c
    const/high16 v13, 0x80000

    :goto_7
    or-int/2addr v11, v13

    :cond_d
    const/high16 v13, 0xc00000

    and-int/2addr v13, v7

    if-nez v13, :cond_f

    invoke-interface {v10, v6}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v13

    if-eqz v13, :cond_e

    const/high16 v13, 0x800000

    goto :goto_8

    :cond_e
    const/high16 v13, 0x400000

    :goto_8
    or-int/2addr v11, v13

    :cond_f
    const v13, 0x492493

    and-int/2addr v13, v11

    const v15, 0x492492

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v13, v15, :cond_10

    move v13, v7

    goto :goto_9

    :cond_10
    move v13, v6

    :goto_9
    and-int/lit8 v15, v11, 0x1

    invoke-interface {v10, v13, v15}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v13

    if-eqz v13, :cond_22

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v13

    if-eqz v13, :cond_11

    const/4 v13, -0x1

    const-string v15, "com.zykj.mistake.feature.notebook.detail.AnswerEntryRow (MistakeDetailAnswerPanel.kt:645)"

    invoke-static {v8, v11, v13, v15}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 2
    :cond_11
    sget-object v8, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    const/4 v13, 0x0

    const/4 v15, 0x0

    invoke-static {v8, v13, v7, v15}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    .line 3
    sget-object v25, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual/range {v25 .. v25}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    move-result-object v15

    .line 4
    sget-object v16, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    move-result-object v7

    const/16 v12, 0x30

    .line 5
    invoke-static {v7, v15, v10, v12}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v7

    .line 6
    invoke-static {v10, v6}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v12

    .line 7
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v15

    .line 8
    invoke-static {v10, v13}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    .line 9
    sget-object v6, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    move-result-object v14

    .line 10
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v19

    if-nez v19, :cond_12

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 11
    :cond_12
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 12
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v19

    if-eqz v19, :cond_13

    .line 13
    invoke-interface {v10, v14}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    goto :goto_a

    .line 14
    :cond_13
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 15
    :goto_a
    invoke-static {v10}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v14

    .line 16
    invoke-static {v6, v14, v7, v14, v15}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    move-result-object v7

    .line 17
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v15

    if-nez v15, :cond_14

    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    .line 18
    :cond_14
    invoke-static {v12, v14, v12, v7}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 19
    :cond_15
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    move-result-object v0

    invoke-static {v14, v13, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 20
    sget-object v26, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    if-eqz p7, :cond_16

    const v7, -0x532c6649

    .line 21
    invoke-interface {v10, v7}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-wide v12, 0xff666666L

    .line 22
    invoke-static {v12, v13}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v12

    const/16 v7, 0xf

    .line 23
    invoke-static {v7}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v14

    const/16 v7, 0x34

    int-to-float v7, v7

    .line 24
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v7

    .line 25
    invoke-static {v8, v7}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v7

    and-int/lit8 v0, v11, 0xe

    or-int/lit16 v0, v0, 0xdb0

    const/16 v23, 0x0

    const v24, 0x1fff0

    move-object/from16 v20, v6

    const/4 v6, 0x0

    move-object v1, v7

    const/4 v7, 0x0

    move-object/from16 v21, v8

    const/4 v8, 0x0

    move-object/from16 v22, v21

    move-object/from16 v21, v10

    const-wide/16 v9, 0x0

    move/from16 v27, v11

    const/4 v11, 0x0

    move-wide v2, v12

    const/4 v12, 0x0

    move-wide v4, v14

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v28, 0x2

    const/16 v16, 0x0

    const/16 v29, 0x0

    const/16 v17, 0x0

    const/high16 v30, 0x20000

    const/16 v18, 0x0

    const/16 v31, 0x6

    const/16 v19, 0x0

    move-object/from16 v32, v20

    const/16 v20, 0x0

    move-object/from16 v33, v22

    move/from16 v22, v0

    move-object/from16 v0, p0

    .line 26
    invoke-static/range {v0 .. v24}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v21

    const/16 v0, 0x8

    int-to-float v0, v0

    .line 27
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    move-object/from16 v1, v33

    .line 28
    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v7, 0x6

    invoke-static {v0, v6, v7}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 29
    :goto_b
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_c

    :cond_16
    move-object/from16 v32, v6

    move-object v1, v8

    move-object v6, v10

    move/from16 v27, v11

    const/4 v7, 0x6

    const v0, -0x5472a9f9

    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    goto :goto_b

    :goto_c
    const/4 v4, 0x2

    const/4 v5, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    move-object/from16 v0, v26

    .line 30
    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/layout/RowScope;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 31
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    move-result-object v1

    const/4 v2, 0x0

    .line 32
    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v1

    .line 33
    invoke-static {v6, v2}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v3

    .line 34
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v4

    .line 35
    invoke-static {v6, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 36
    invoke-virtual/range {v32 .. v32}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    move-result-object v5

    .line 37
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v8

    if-nez v8, :cond_17

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 38
    :cond_17
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 39
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v8

    if-eqz v8, :cond_18

    .line 40
    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    goto :goto_d

    .line 41
    :cond_18
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 42
    :goto_d
    invoke-static {v6}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v5

    move-object/from16 v8, v32

    .line 43
    invoke-static {v8, v5, v1, v5, v4}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    move-result-object v1

    .line 44
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v4

    if-nez v4, :cond_19

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1a

    .line 45
    :cond_19
    invoke-static {v3, v5, v3, v1}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 46
    :cond_1a
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    move-result-object v1

    invoke-static {v5, v0, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 47
    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 48
    sget-object v0, Lcom/zykj/mistake/feature/notebook/detail/s;->b:[I

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const-string v1, "\u672a\u4f5c\u7b54"

    const/4 v3, 0x1

    if-eq v0, v3, :cond_20

    const/4 v4, 0x2

    if-ne v0, v4, :cond_1f

    const v0, -0x32fa5721

    .line 49
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const/high16 v0, 0x70000

    and-int v0, v27, v0

    const/high16 v4, 0x20000

    if-ne v0, v4, :cond_1b

    goto :goto_e

    :cond_1b
    move v3, v2

    .line 50
    :goto_e
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    if-nez v3, :cond_1d

    .line 51
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v0, v3, :cond_1c

    goto :goto_f

    :cond_1c
    move-object/from16 v8, p5

    goto :goto_10

    .line 52
    :cond_1d
    :goto_f
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/m;

    move-object/from16 v8, p5

    invoke-direct {v0, v8, v2}, Lcom/zykj/mistake/feature/notebook/detail/m;-><init>(Lr6/c;I)V

    .line 53
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 54
    :goto_10
    move-object v2, v0

    check-cast v2, Lr6/e;

    if-eqz p6, :cond_1e

    :goto_11
    move-object v3, v1

    goto :goto_12

    .line 55
    :cond_1e
    const-string v1, "\u65e0\u8ba2\u6b63\u5185\u5bb9"

    goto :goto_11

    :goto_12
    shr-int/lit8 v0, v27, 0x6

    and-int/lit8 v5, v0, 0x7e

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    move-object v4, v6

    .line 56
    invoke-static/range {v0 .. v5}, Lcom/zykj/mistake/feature/notebook/detail/t;->j(Ljava/util/List;Ljava/util/List;Lr6/e;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    move-object/from16 v3, p4

    goto :goto_14

    :cond_1f
    const v0, -0x32fa80bb

    .line 57
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_20
    move-object/from16 v0, p2

    move-object/from16 v8, p5

    const v2, -0x32fa77d0

    .line 58
    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    if-eqz p6, :cond_21

    goto :goto_13

    .line 59
    :cond_21
    const-string v1, "\u672a\u8ba2\u6b63"

    :goto_13
    shr-int/lit8 v2, v27, 0x6

    and-int/lit16 v2, v2, 0x38e

    move-object/from16 v3, p4

    .line 60
    invoke-static {v0, v1, v3, v6, v2}, Lcom/zykj/mistake/feature/notebook/detail/t;->v(Ljava/util/List;Ljava/lang/String;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;Landroidx/compose/runtime/Composer;I)V

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 61
    :goto_14
    invoke-static {v6}, Landroidx/collection/a;->D(Landroidx/compose/runtime/Composer;)Z

    move-result v1

    if-eqz v1, :cond_23

    .line 62
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_15

    :cond_22
    move-object v0, v1

    move-object v8, v4

    move-object v6, v10

    .line 63
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 64
    :cond_23
    :goto_15
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v10

    if-eqz v10, :cond_24

    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/n;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move/from16 v7, p6

    move/from16 v9, p9

    move-object v5, v3

    move-object v6, v8

    move-object/from16 v3, p2

    move/from16 v8, p7

    invoke-direct/range {v0 .. v9}, Lcom/zykj/mistake/feature/notebook/detail/n;-><init>(Ljava/lang/String;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerDisplayType;Ljava/util/List;Ljava/util/List;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;Lr6/c;ZZI)V

    invoke-interface {v10, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    :cond_24
    return-void
.end method

.method public static final c(Ljava/lang/String;Ljava/lang/String;Lr6/a;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    .line 1
    move-object/from16 v3, p0

    .line 2
    .line 3
    move-object/from16 v4, p1

    .line 4
    .line 5
    move-object/from16 v5, p2

    .line 6
    .line 7
    move/from16 v1, p4

    .line 8
    .line 9
    const-string v0, "onClick"

    .line 10
    .line 11
    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const v0, -0x273e08d7

    .line 15
    .line 16
    .line 17
    move-object/from16 v2, p3

    .line 18
    .line 19
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 20
    .line 21
    .line 22
    move-result-object v11

    .line 23
    and-int/lit8 v2, v1, 0x6

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    const/4 v2, 0x4

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move v2, v6

    .line 37
    :goto_0
    or-int/2addr v2, v1

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move v2, v1

    .line 40
    :goto_1
    and-int/lit8 v8, v1, 0x30

    .line 41
    .line 42
    if-nez v8, :cond_3

    .line 43
    .line 44
    invoke-interface {v11, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v8

    .line 48
    if-eqz v8, :cond_2

    .line 49
    .line 50
    const/16 v8, 0x20

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    const/16 v8, 0x10

    .line 54
    .line 55
    :goto_2
    or-int/2addr v2, v8

    .line 56
    :cond_3
    and-int/lit16 v8, v1, 0x180

    .line 57
    .line 58
    if-nez v8, :cond_5

    .line 59
    .line 60
    invoke-interface {v11, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v8

    .line 64
    if-eqz v8, :cond_4

    .line 65
    .line 66
    const/16 v8, 0x100

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_4
    const/16 v8, 0x80

    .line 70
    .line 71
    :goto_3
    or-int/2addr v2, v8

    .line 72
    :cond_5
    and-int/lit16 v8, v2, 0x93

    .line 73
    .line 74
    const/16 v12, 0x92

    .line 75
    .line 76
    const/4 v13, 0x0

    .line 77
    const/4 v14, 0x1

    .line 78
    if-eq v8, v12, :cond_6

    .line 79
    .line 80
    move v8, v14

    .line 81
    goto :goto_4

    .line 82
    :cond_6
    move v8, v13

    .line 83
    :goto_4
    and-int/lit8 v12, v2, 0x1

    .line 84
    .line 85
    invoke-interface {v11, v8, v12}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 86
    .line 87
    .line 88
    move-result v8

    .line 89
    if-eqz v8, :cond_14

    .line 90
    .line 91
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    if-eqz v8, :cond_7

    .line 96
    .line 97
    const/4 v8, -0x1

    .line 98
    const-string v12, "com.zykj.mistake.feature.notebook.detail.AnswerImagePair (MistakeDetailAnswerPanel.kt:836)"

    .line 99
    .line 100
    invoke-static {v0, v2, v8, v12}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 101
    .line 102
    .line 103
    :cond_7
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 104
    .line 105
    const/4 v8, 0x0

    .line 106
    const/4 v12, 0x0

    .line 107
    invoke-static {v0, v8, v14, v12}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 108
    .line 109
    .line 110
    move-result-object v15

    .line 111
    const/16 v10, 0x52

    .line 112
    .line 113
    int-to-float v10, v10

    .line 114
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 115
    .line 116
    .line 117
    move-result v10

    .line 118
    invoke-static {v15, v10, v8, v6, v12}, Landroidx/compose/foundation/layout/SizeKt;->heightIn-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v10

    .line 126
    sget-object v15, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 127
    .line 128
    invoke-virtual {v15}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v9

    .line 132
    if-ne v10, v9, :cond_8

    .line 133
    .line 134
    new-instance v10, Lcom/zykj/mistake/feature/collection/component/j;

    .line 135
    .line 136
    const/4 v9, 0x6

    .line 137
    invoke-direct {v10, v9}, Lcom/zykj/mistake/feature/collection/component/j;-><init>(I)V

    .line 138
    .line 139
    .line 140
    invoke-interface {v11, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :cond_8
    check-cast v10, Lr6/c;

    .line 144
    .line 145
    invoke-static {v6, v10}, Landroidx/compose/ui/draw/DrawModifierKt;->drawWithContent(Landroidx/compose/ui/Modifier;Lr6/c;)Landroidx/compose/ui/Modifier;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    sget-object v9, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 150
    .line 151
    invoke-virtual {v9}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 152
    .line 153
    .line 154
    move-result-object v9

    .line 155
    invoke-static {v9, v13}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 156
    .line 157
    .line 158
    move-result-object v9

    .line 159
    invoke-static {v11, v13}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 160
    .line 161
    .line 162
    move-result v10

    .line 163
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 164
    .line 165
    .line 166
    move-result-object v13

    .line 167
    invoke-static {v11, v6}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    sget-object v7, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 172
    .line 173
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 174
    .line 175
    .line 176
    move-result-object v8

    .line 177
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 178
    .line 179
    .line 180
    move-result-object v16

    .line 181
    if-nez v16, :cond_9

    .line 182
    .line 183
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 184
    .line 185
    .line 186
    :cond_9
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 187
    .line 188
    .line 189
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 190
    .line 191
    .line 192
    move-result v16

    .line 193
    if-eqz v16, :cond_a

    .line 194
    .line 195
    invoke-interface {v11, v8}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 196
    .line 197
    .line 198
    goto :goto_5

    .line 199
    :cond_a
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 200
    .line 201
    .line 202
    :goto_5
    invoke-static {v11}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 203
    .line 204
    .line 205
    move-result-object v8

    .line 206
    invoke-static {v7, v8, v9, v8, v13}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 207
    .line 208
    .line 209
    move-result-object v9

    .line 210
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 211
    .line 212
    .line 213
    move-result v13

    .line 214
    if-nez v13, :cond_b

    .line 215
    .line 216
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v13

    .line 220
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 221
    .line 222
    .line 223
    move-result-object v12

    .line 224
    invoke-static {v13, v12}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v12

    .line 228
    if-nez v12, :cond_c

    .line 229
    .line 230
    :cond_b
    invoke-static {v10, v8, v10, v9}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 231
    .line 232
    .line 233
    :cond_c
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 234
    .line 235
    .line 236
    move-result-object v7

    .line 237
    invoke-static {v8, v6, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 238
    .line 239
    .line 240
    sget-object v6, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 241
    .line 242
    const/4 v6, 0x0

    .line 243
    const/4 v7, 0x0

    .line 244
    invoke-static {v0, v7, v14, v6}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    const/4 v6, 0x4

    .line 249
    int-to-float v7, v6

    .line 250
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 251
    .line 252
    .line 253
    move-result v6

    .line 254
    invoke-static {v0, v6}, Landroidx/compose/foundation/layout/PaddingKt;->padding-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 255
    .line 256
    .line 257
    move-result-object v7

    .line 258
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    invoke-virtual {v15}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v6

    .line 266
    if-ne v0, v6, :cond_d

    .line 267
    .line 268
    new-instance v0, Lcom/zykj/mistake/feature/collection/component/j;

    .line 269
    .line 270
    const/4 v6, 0x7

    .line 271
    invoke-direct {v0, v6}, Lcom/zykj/mistake/feature/collection/component/j;-><init>(I)V

    .line 272
    .line 273
    .line 274
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    :cond_d
    move-object v6, v0

    .line 278
    check-cast v6, Lr6/c;

    .line 279
    .line 280
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    invoke-virtual {v15}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v8

    .line 288
    if-ne v0, v8, :cond_e

    .line 289
    .line 290
    sget-object v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailAnswerPanelKt$AnswerImagePair$2$2$1;->INSTANCE:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailAnswerPanelKt$AnswerImagePair$2$2$1;

    .line 291
    .line 292
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    :cond_e
    check-cast v0, Ly6/e;

    .line 296
    .line 297
    move-object v9, v0

    .line 298
    check-cast v9, Lr6/c;

    .line 299
    .line 300
    and-int/lit8 v0, v2, 0xe

    .line 301
    .line 302
    const/4 v8, 0x4

    .line 303
    if-ne v0, v8, :cond_f

    .line 304
    .line 305
    move v0, v14

    .line 306
    goto :goto_6

    .line 307
    :cond_f
    const/4 v0, 0x0

    .line 308
    :goto_6
    and-int/lit8 v8, v2, 0x70

    .line 309
    .line 310
    const/16 v10, 0x20

    .line 311
    .line 312
    if-ne v8, v10, :cond_10

    .line 313
    .line 314
    move v8, v14

    .line 315
    goto :goto_7

    .line 316
    :cond_10
    const/4 v8, 0x0

    .line 317
    :goto_7
    or-int/2addr v0, v8

    .line 318
    and-int/lit16 v2, v2, 0x380

    .line 319
    .line 320
    const/16 v8, 0x100

    .line 321
    .line 322
    if-ne v2, v8, :cond_11

    .line 323
    .line 324
    move v13, v14

    .line 325
    goto :goto_8

    .line 326
    :cond_11
    const/4 v13, 0x0

    .line 327
    :goto_8
    or-int/2addr v0, v13

    .line 328
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v2

    .line 332
    if-nez v0, :cond_12

    .line 333
    .line 334
    invoke-virtual {v15}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    if-ne v2, v0, :cond_13

    .line 339
    .line 340
    :cond_12
    new-instance v2, Landroidx/lifecycle/i;

    .line 341
    .line 342
    const/16 v0, 0x8

    .line 343
    .line 344
    invoke-direct {v2, v3, v4, v0, v5}, Landroidx/lifecycle/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    :cond_13
    move-object v10, v2

    .line 351
    check-cast v10, Lr6/c;

    .line 352
    .line 353
    const/16 v12, 0xc36

    .line 354
    .line 355
    const/4 v13, 0x4

    .line 356
    const/4 v8, 0x0

    .line 357
    invoke-static/range {v6 .. v13}, Landroidx/compose/ui/viewinterop/AndroidView_androidKt;->AndroidView(Lr6/c;Landroidx/compose/ui/Modifier;Lr6/c;Lr6/c;Lr6/c;Landroidx/compose/runtime/Composer;II)V

    .line 358
    .line 359
    .line 360
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 361
    .line 362
    .line 363
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 364
    .line 365
    .line 366
    move-result v0

    .line 367
    if-eqz v0, :cond_15

    .line 368
    .line 369
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 370
    .line 371
    .line 372
    goto :goto_9

    .line 373
    :cond_14
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 374
    .line 375
    .line 376
    :cond_15
    :goto_9
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 377
    .line 378
    .line 379
    move-result-object v6

    .line 380
    if-eqz v6, :cond_16

    .line 381
    .line 382
    new-instance v0, Landroidx/lifecycle/compose/g;

    .line 383
    .line 384
    const/16 v2, 0x9

    .line 385
    .line 386
    invoke-direct/range {v0 .. v5}, Landroidx/lifecycle/compose/g;-><init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 387
    .line 388
    .line 389
    invoke-interface {v6, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 390
    .line 391
    .line 392
    :cond_16
    return-void
.end method

.method public static final d(Ljava/lang/String;Ljava/util/List;Lr6/c;Lcom/zykj/mistake/feature/notebook/detail/p0;Lr6/c;ZLandroidx/compose/runtime/Composer;I)V
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    move/from16 v5, p5

    .line 12
    .line 13
    move/from16 v6, p7

    .line 14
    .line 15
    const-string v7, "entries"

    .line 16
    .line 17
    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v7, "answersOf"

    .line 21
    .line 22
    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const v7, -0x57b88e9b

    .line 26
    .line 27
    .line 28
    move-object/from16 v8, p6

    .line 29
    .line 30
    invoke-interface {v8, v7}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 31
    .line 32
    .line 33
    move-result-object v8

    .line 34
    and-int/lit8 v9, v6, 0x6

    .line 35
    .line 36
    if-nez v9, :cond_1

    .line 37
    .line 38
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v9

    .line 42
    if-eqz v9, :cond_0

    .line 43
    .line 44
    const/4 v9, 0x4

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const/4 v9, 0x2

    .line 47
    :goto_0
    or-int/2addr v9, v6

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    move v9, v6

    .line 50
    :goto_1
    and-int/lit8 v10, v6, 0x30

    .line 51
    .line 52
    if-nez v10, :cond_3

    .line 53
    .line 54
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v10

    .line 58
    if-eqz v10, :cond_2

    .line 59
    .line 60
    const/16 v10, 0x20

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_2
    const/16 v10, 0x10

    .line 64
    .line 65
    :goto_2
    or-int/2addr v9, v10

    .line 66
    :cond_3
    and-int/lit16 v10, v6, 0x180

    .line 67
    .line 68
    if-nez v10, :cond_5

    .line 69
    .line 70
    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v10

    .line 74
    if-eqz v10, :cond_4

    .line 75
    .line 76
    const/16 v10, 0x100

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_4
    const/16 v10, 0x80

    .line 80
    .line 81
    :goto_3
    or-int/2addr v9, v10

    .line 82
    :cond_5
    and-int/lit16 v10, v6, 0xc00

    .line 83
    .line 84
    if-nez v10, :cond_7

    .line 85
    .line 86
    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v10

    .line 90
    if-eqz v10, :cond_6

    .line 91
    .line 92
    const/16 v10, 0x800

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_6
    const/16 v10, 0x400

    .line 96
    .line 97
    :goto_4
    or-int/2addr v9, v10

    .line 98
    :cond_7
    and-int/lit16 v10, v6, 0x6000

    .line 99
    .line 100
    if-nez v10, :cond_9

    .line 101
    .line 102
    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v10

    .line 106
    if-eqz v10, :cond_8

    .line 107
    .line 108
    const/16 v10, 0x4000

    .line 109
    .line 110
    goto :goto_5

    .line 111
    :cond_8
    const/16 v10, 0x2000

    .line 112
    .line 113
    :goto_5
    or-int/2addr v9, v10

    .line 114
    :cond_9
    const/high16 v10, 0x30000

    .line 115
    .line 116
    and-int/2addr v10, v6

    .line 117
    if-nez v10, :cond_b

    .line 118
    .line 119
    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 120
    .line 121
    .line 122
    move-result v10

    .line 123
    if-eqz v10, :cond_a

    .line 124
    .line 125
    const/high16 v10, 0x20000

    .line 126
    .line 127
    goto :goto_6

    .line 128
    :cond_a
    const/high16 v10, 0x10000

    .line 129
    .line 130
    :goto_6
    or-int/2addr v9, v10

    .line 131
    :cond_b
    const v10, 0x12493

    .line 132
    .line 133
    .line 134
    and-int/2addr v10, v9

    .line 135
    const v12, 0x12492

    .line 136
    .line 137
    .line 138
    const/4 v13, 0x0

    .line 139
    const/16 v25, 0x1

    .line 140
    .line 141
    if-eq v10, v12, :cond_c

    .line 142
    .line 143
    move/from16 v10, v25

    .line 144
    .line 145
    goto :goto_7

    .line 146
    :cond_c
    move v10, v13

    .line 147
    :goto_7
    and-int/lit8 v12, v9, 0x1

    .line 148
    .line 149
    invoke-interface {v8, v10, v12}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 150
    .line 151
    .line 152
    move-result v10

    .line 153
    if-eqz v10, :cond_19

    .line 154
    .line 155
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 156
    .line 157
    .line 158
    move-result v10

    .line 159
    if-eqz v10, :cond_d

    .line 160
    .line 161
    const/4 v10, -0x1

    .line 162
    const-string v12, "com.zykj.mistake.feature.notebook.detail.AnswerSection (MistakeDetailAnswerPanel.kt:600)"

    .line 163
    .line 164
    invoke-static {v7, v9, v10, v12}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 165
    .line 166
    .line 167
    :cond_d
    sget-object v7, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 168
    .line 169
    invoke-virtual {v7}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 170
    .line 171
    .line 172
    move-result-object v7

    .line 173
    sget-object v10, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 174
    .line 175
    sget-object v12, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 176
    .line 177
    invoke-virtual {v12}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 178
    .line 179
    .line 180
    move-result-object v12

    .line 181
    const/16 v14, 0x30

    .line 182
    .line 183
    invoke-static {v12, v7, v8, v14}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 184
    .line 185
    .line 186
    move-result-object v7

    .line 187
    invoke-static {v8, v13}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 188
    .line 189
    .line 190
    move-result v12

    .line 191
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 192
    .line 193
    .line 194
    move-result-object v14

    .line 195
    invoke-static {v8, v10}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 196
    .line 197
    .line 198
    move-result-object v15

    .line 199
    sget-object v11, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 200
    .line 201
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 202
    .line 203
    .line 204
    move-result-object v13

    .line 205
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 206
    .line 207
    .line 208
    move-result-object v17

    .line 209
    if-nez v17, :cond_e

    .line 210
    .line 211
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 212
    .line 213
    .line 214
    :cond_e
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 215
    .line 216
    .line 217
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 218
    .line 219
    .line 220
    move-result v17

    .line 221
    if-eqz v17, :cond_f

    .line 222
    .line 223
    invoke-interface {v8, v13}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 224
    .line 225
    .line 226
    goto :goto_8

    .line 227
    :cond_f
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 228
    .line 229
    .line 230
    :goto_8
    invoke-static {v8}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 231
    .line 232
    .line 233
    move-result-object v13

    .line 234
    invoke-static {v11, v13, v7, v13, v14}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 235
    .line 236
    .line 237
    move-result-object v7

    .line 238
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 239
    .line 240
    .line 241
    move-result v14

    .line 242
    if-nez v14, :cond_10

    .line 243
    .line 244
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v14

    .line 248
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    if-nez v0, :cond_11

    .line 257
    .line 258
    :cond_10
    invoke-static {v12, v13, v12, v7}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 259
    .line 260
    .line 261
    :cond_11
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    invoke-static {v13, v15, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 266
    .line 267
    .line 268
    sget-object v0, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 269
    .line 270
    const/4 v0, 0x0

    .line 271
    const/4 v7, 0x0

    .line 272
    invoke-static {v0, v8, v7}, Lcom/zykj/mistake/feature/notebook/detail/g0;->j(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 273
    .line 274
    .line 275
    const/16 v0, 0x8

    .line 276
    .line 277
    int-to-float v0, v0

    .line 278
    const/4 v11, 0x6

    .line 279
    invoke-static {v0, v10, v8, v11}, Landroidx/compose/material3/c;->s(FLandroidx/compose/ui/Modifier$Companion;Landroidx/compose/runtime/Composer;I)V

    .line 280
    .line 281
    .line 282
    const-wide v12, 0xff15171aL

    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    invoke-static {v12, v13}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 288
    .line 289
    .line 290
    move-result-wide v12

    .line 291
    const/16 v0, 0xf

    .line 292
    .line 293
    invoke-static {v0}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 294
    .line 295
    .line 296
    move-result-wide v14

    .line 297
    sget-object v0, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    .line 298
    .line 299
    invoke-virtual {v0}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    and-int/lit8 v16, v9, 0xe

    .line 304
    .line 305
    const v17, 0x30d80

    .line 306
    .line 307
    .line 308
    or-int v22, v16, v17

    .line 309
    .line 310
    const/16 v23, 0xc00

    .line 311
    .line 312
    const v24, 0x1dfd2

    .line 313
    .line 314
    .line 315
    const/4 v1, 0x0

    .line 316
    const/4 v6, 0x0

    .line 317
    move-object/from16 v21, v8

    .line 318
    .line 319
    const/4 v8, 0x0

    .line 320
    move/from16 v16, v9

    .line 321
    .line 322
    move-object/from16 v17, v10

    .line 323
    .line 324
    const-wide/16 v9, 0x0

    .line 325
    .line 326
    move/from16 v18, v11

    .line 327
    .line 328
    const/4 v11, 0x0

    .line 329
    move-wide v2, v12

    .line 330
    const/4 v12, 0x0

    .line 331
    move-wide v4, v14

    .line 332
    const-wide/16 v13, 0x0

    .line 333
    .line 334
    const/4 v15, 0x0

    .line 335
    move/from16 v19, v16

    .line 336
    .line 337
    const/16 v16, 0x0

    .line 338
    .line 339
    move-object/from16 v20, v17

    .line 340
    .line 341
    const/16 v17, 0x1

    .line 342
    .line 343
    move/from16 v26, v18

    .line 344
    .line 345
    const/16 v18, 0x0

    .line 346
    .line 347
    move/from16 v27, v19

    .line 348
    .line 349
    const/16 v19, 0x0

    .line 350
    .line 351
    move-object/from16 v28, v20

    .line 352
    .line 353
    const/16 v20, 0x0

    .line 354
    .line 355
    move-object v7, v0

    .line 356
    move-object/from16 v29, v28

    .line 357
    .line 358
    move-object/from16 v0, p0

    .line 359
    .line 360
    invoke-static/range {v0 .. v24}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 361
    .line 362
    .line 363
    move-object v10, v0

    .line 364
    move-object/from16 v8, v21

    .line 365
    .line 366
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 367
    .line 368
    .line 369
    const/16 v0, 0xc

    .line 370
    .line 371
    int-to-float v11, v0

    .line 372
    invoke-static {v11}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 373
    .line 374
    .line 375
    move-result v0

    .line 376
    move-object/from16 v1, v29

    .line 377
    .line 378
    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    const/4 v12, 0x6

    .line 383
    invoke-static {v0, v8, v12}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 384
    .line 385
    .line 386
    const v0, -0x4bcef58f

    .line 387
    .line 388
    .line 389
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 390
    .line 391
    .line 392
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 393
    .line 394
    .line 395
    move-result-object v13

    .line 396
    :goto_9
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 397
    .line 398
    .line 399
    move-result v0

    .line 400
    if-eqz v0, :cond_14

    .line 401
    .line 402
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    check-cast v0, Lcom/zykj/mistake/feature/notebook/detail/o0;

    .line 407
    .line 408
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/o0;->a:Ljava/lang/String;

    .line 409
    .line 410
    move-object v2, v1

    .line 411
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/o0;->b:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerDisplayType;

    .line 412
    .line 413
    move-object/from16 v14, p2

    .line 414
    .line 415
    invoke-interface {v14, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v3

    .line 419
    check-cast v3, Ljava/util/List;

    .line 420
    .line 421
    const-string v4, "\u539f\u7b54\u6848"

    .line 422
    .line 423
    invoke-virtual {v10, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 424
    .line 425
    .line 426
    move-result v4

    .line 427
    if-eqz v4, :cond_12

    .line 428
    .line 429
    iget-object v4, v0, Lcom/zykj/mistake/feature/notebook/detail/o0;->e:Ljava/util/List;

    .line 430
    .line 431
    goto :goto_a

    .line 432
    :cond_12
    iget-object v4, v0, Lcom/zykj/mistake/feature/notebook/detail/o0;->g:Ljava/util/List;

    .line 433
    .line 434
    :goto_a
    if-eqz p5, :cond_13

    .line 435
    .line 436
    iget-object v5, v0, Lcom/zykj/mistake/feature/notebook/detail/o0;->h:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;

    .line 437
    .line 438
    goto :goto_b

    .line 439
    :cond_13
    iget-object v5, v0, Lcom/zykj/mistake/feature/notebook/detail/o0;->i:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;

    .line 440
    .line 441
    :goto_b
    iget-boolean v0, v0, Lcom/zykj/mistake/feature/notebook/detail/o0;->c:Z

    .line 442
    .line 443
    xor-int/lit8 v7, v0, 0x1

    .line 444
    .line 445
    shl-int/lit8 v0, v27, 0x3

    .line 446
    .line 447
    const/high16 v6, 0x3f0000

    .line 448
    .line 449
    and-int v9, v0, v6

    .line 450
    .line 451
    move/from16 v6, p5

    .line 452
    .line 453
    move-object v0, v2

    .line 454
    move-object v2, v3

    .line 455
    move-object v3, v4

    .line 456
    move-object v4, v5

    .line 457
    move-object/from16 v5, p4

    .line 458
    .line 459
    invoke-static/range {v0 .. v9}, Lcom/zykj/mistake/feature/notebook/detail/t;->b(Ljava/lang/String;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerDisplayType;Ljava/util/List;Ljava/util/List;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;Lr6/c;ZZLandroidx/compose/runtime/Composer;I)V

    .line 460
    .line 461
    .line 462
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 463
    .line 464
    invoke-static {v11}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 465
    .line 466
    .line 467
    move-result v1

    .line 468
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    invoke-static {v0, v8, v12}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 473
    .line 474
    .line 475
    goto :goto_9

    .line 476
    :cond_14
    move-object/from16 v14, p2

    .line 477
    .line 478
    move-object/from16 v5, p4

    .line 479
    .line 480
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 481
    .line 482
    .line 483
    move-object/from16 v3, p3

    .line 484
    .line 485
    if-nez v3, :cond_15

    .line 486
    .line 487
    const v0, -0x2e07ac83

    .line 488
    .line 489
    .line 490
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 491
    .line 492
    .line 493
    :goto_c
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 494
    .line 495
    .line 496
    goto :goto_e

    .line 497
    :cond_15
    const v0, -0x2e07ac82

    .line 498
    .line 499
    .line 500
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 501
    .line 502
    .line 503
    const v0, 0xe000

    .line 504
    .line 505
    .line 506
    and-int v0, v27, v0

    .line 507
    .line 508
    const/16 v1, 0x4000

    .line 509
    .line 510
    if-ne v0, v1, :cond_16

    .line 511
    .line 512
    move/from16 v13, v25

    .line 513
    .line 514
    goto :goto_d

    .line 515
    :cond_16
    const/4 v13, 0x0

    .line 516
    :goto_d
    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 517
    .line 518
    .line 519
    move-result v0

    .line 520
    or-int/2addr v0, v13

    .line 521
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v1

    .line 525
    if-nez v0, :cond_17

    .line 526
    .line 527
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 528
    .line 529
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    if-ne v1, v0, :cond_18

    .line 534
    .line 535
    :cond_17
    new-instance v1, Landroidx/navigation/e;

    .line 536
    .line 537
    const/4 v0, 0x7

    .line 538
    invoke-direct {v1, v0, v5, v3}, Landroidx/navigation/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 539
    .line 540
    .line 541
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 542
    .line 543
    .line 544
    :cond_18
    check-cast v1, Lr6/a;

    .line 545
    .line 546
    const/4 v7, 0x0

    .line 547
    invoke-static {v3, v1, v8, v7}, Lcom/zykj/mistake/feature/notebook/detail/t;->k(Lcom/zykj/mistake/feature/notebook/detail/p0;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 548
    .line 549
    .line 550
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 551
    .line 552
    invoke-static {v11}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 553
    .line 554
    .line 555
    move-result v1

    .line 556
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    invoke-static {v0, v8, v12}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 561
    .line 562
    .line 563
    goto :goto_c

    .line 564
    :goto_e
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 565
    .line 566
    .line 567
    move-result v0

    .line 568
    if-eqz v0, :cond_1a

    .line 569
    .line 570
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 571
    .line 572
    .line 573
    goto :goto_f

    .line 574
    :cond_19
    move-object v10, v0

    .line 575
    move-object v14, v2

    .line 576
    move-object v5, v4

    .line 577
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 578
    .line 579
    .line 580
    :cond_1a
    :goto_f
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 581
    .line 582
    .line 583
    move-result-object v8

    .line 584
    if-eqz v8, :cond_1b

    .line 585
    .line 586
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/k;

    .line 587
    .line 588
    move-object/from16 v2, p1

    .line 589
    .line 590
    move/from16 v6, p5

    .line 591
    .line 592
    move/from16 v7, p7

    .line 593
    .line 594
    move-object v4, v3

    .line 595
    move-object v1, v10

    .line 596
    move-object v3, v14

    .line 597
    invoke-direct/range {v0 .. v7}, Lcom/zykj/mistake/feature/notebook/detail/k;-><init>(Ljava/lang/String;Ljava/util/List;Lr6/c;Lcom/zykj/mistake/feature/notebook/detail/p0;Lr6/c;ZI)V

    .line 598
    .line 599
    .line 600
    invoke-interface {v8, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 601
    .line 602
    .line 603
    :cond_1b
    return-void
.end method

.method public static final e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const v1, 0x63f89fe8

    .line 4
    .line 5
    .line 6
    move-object/from16 v2, p1

    .line 7
    .line 8
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 9
    .line 10
    .line 11
    move-result-object v7

    .line 12
    and-int/lit8 v2, p2, 0x6

    .line 13
    .line 14
    const/4 v3, 0x2

    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    const/4 v2, 0x4

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v2, v3

    .line 26
    :goto_0
    or-int v2, p2, v2

    .line 27
    .line 28
    move v10, v2

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move/from16 v10, p2

    .line 31
    .line 32
    :goto_1
    and-int/lit8 v2, v10, 0x3

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v11, 0x1

    .line 36
    if-eq v2, v3, :cond_2

    .line 37
    .line 38
    move v2, v11

    .line 39
    goto :goto_2

    .line 40
    :cond_2
    move v2, v4

    .line 41
    :goto_2
    and-int/lit8 v3, v10, 0x1

    .line 42
    .line 43
    invoke-interface {v7, v2, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_9

    .line 48
    .line 49
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    const/4 v2, -0x1

    .line 56
    const-string v3, "com.zykj.mistake.feature.notebook.detail.DashedEmptyAnswerBox (MistakeDetailAnswerPanel.kt:799)"

    .line 57
    .line 58
    invoke-static {v1, v10, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :cond_3
    sget-object v12, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 62
    .line 63
    const/4 v1, 0x0

    .line 64
    const/4 v2, 0x0

    .line 65
    invoke-static {v12, v1, v11, v2}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    const/16 v2, 0x52

    .line 70
    .line 71
    int-to-float v2, v2

    .line 72
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 85
    .line 86
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    if-ne v2, v3, :cond_4

    .line 91
    .line 92
    new-instance v2, Lcom/zykj/mistake/feature/collection/component/j;

    .line 93
    .line 94
    const/16 v3, 0x9

    .line 95
    .line 96
    invoke-direct {v2, v3}, Lcom/zykj/mistake/feature/collection/component/j;-><init>(I)V

    .line 97
    .line 98
    .line 99
    invoke-interface {v7, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    :cond_4
    check-cast v2, Lr6/c;

    .line 103
    .line 104
    invoke-static {v1, v2}, Landroidx/compose/ui/draw/DrawModifierKt;->drawBehind(Landroidx/compose/ui/Modifier;Lr6/c;)Landroidx/compose/ui/Modifier;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    sget-object v2, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 109
    .line 110
    invoke-virtual {v2}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    sget-object v3, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 115
    .line 116
    invoke-virtual {v3}, Landroidx/compose/foundation/layout/Arrangement;->getCenter()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    const/16 v5, 0x36

    .line 121
    .line 122
    invoke-static {v3, v2, v7, v5}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    invoke-static {v7, v4}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    invoke-static {v7, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    sget-object v6, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 139
    .line 140
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 141
    .line 142
    .line 143
    move-result-object v8

    .line 144
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 145
    .line 146
    .line 147
    move-result-object v9

    .line 148
    if-nez v9, :cond_5

    .line 149
    .line 150
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 151
    .line 152
    .line 153
    :cond_5
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 154
    .line 155
    .line 156
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 157
    .line 158
    .line 159
    move-result v9

    .line 160
    if-eqz v9, :cond_6

    .line 161
    .line 162
    invoke-interface {v7, v8}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 163
    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_6
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 167
    .line 168
    .line 169
    :goto_3
    invoke-static {v7}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 170
    .line 171
    .line 172
    move-result-object v8

    .line 173
    invoke-static {v6, v8, v2, v8, v5}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 178
    .line 179
    .line 180
    move-result v5

    .line 181
    if-nez v5, :cond_7

    .line 182
    .line 183
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 188
    .line 189
    .line 190
    move-result-object v9

    .line 191
    invoke-static {v5, v9}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v5

    .line 195
    if-nez v5, :cond_8

    .line 196
    .line 197
    :cond_7
    invoke-static {v3, v8, v3, v2}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 198
    .line 199
    .line 200
    :cond_8
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    invoke-static {v8, v1, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 205
    .line 206
    .line 207
    sget-object v1, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 208
    .line 209
    sget v1, Lcom/zykj/mistake/R$drawable;->ic_no_answer:I

    .line 210
    .line 211
    invoke-static {v1, v7, v4}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    const/16 v2, 0x28

    .line 216
    .line 217
    int-to-float v2, v2

    .line 218
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    invoke-static {v12, v2}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    shl-int/lit8 v3, v10, 0x3

    .line 227
    .line 228
    and-int/lit8 v3, v3, 0x70

    .line 229
    .line 230
    or-int/lit16 v8, v3, 0x180

    .line 231
    .line 232
    const/16 v9, 0x78

    .line 233
    .line 234
    const/4 v3, 0x0

    .line 235
    const/4 v4, 0x0

    .line 236
    const/4 v5, 0x0

    .line 237
    const/4 v6, 0x0

    .line 238
    move-object/from16 v25, v1

    .line 239
    .line 240
    move-object v1, v0

    .line 241
    move-object/from16 v0, v25

    .line 242
    .line 243
    invoke-static/range {v0 .. v9}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 244
    .line 245
    .line 246
    const/16 v0, 0x8

    .line 247
    .line 248
    int-to-float v0, v0

    .line 249
    const/4 v1, 0x6

    .line 250
    invoke-static {v0, v12, v7, v1}, Landroidx/compose/material3/c;->s(FLandroidx/compose/ui/Modifier$Companion;Landroidx/compose/runtime/Composer;I)V

    .line 251
    .line 252
    .line 253
    const-wide v0, 0xff999999L

    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 259
    .line 260
    .line 261
    move-result-wide v2

    .line 262
    const/16 v0, 0xd

    .line 263
    .line 264
    invoke-static {v0}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 265
    .line 266
    .line 267
    move-result-wide v4

    .line 268
    and-int/lit8 v0, v10, 0xe

    .line 269
    .line 270
    or-int/lit16 v0, v0, 0xd80

    .line 271
    .line 272
    const/16 v23, 0xc00

    .line 273
    .line 274
    const v24, 0x1dff2

    .line 275
    .line 276
    .line 277
    const/4 v1, 0x0

    .line 278
    move-object/from16 v21, v7

    .line 279
    .line 280
    const/4 v7, 0x0

    .line 281
    const/4 v8, 0x0

    .line 282
    const-wide/16 v9, 0x0

    .line 283
    .line 284
    move v12, v11

    .line 285
    const/4 v11, 0x0

    .line 286
    move v13, v12

    .line 287
    const/4 v12, 0x0

    .line 288
    move v15, v13

    .line 289
    const-wide/16 v13, 0x0

    .line 290
    .line 291
    move/from16 v16, v15

    .line 292
    .line 293
    const/4 v15, 0x0

    .line 294
    move/from16 v17, v16

    .line 295
    .line 296
    const/16 v16, 0x0

    .line 297
    .line 298
    move/from16 v18, v17

    .line 299
    .line 300
    const/16 v17, 0x1

    .line 301
    .line 302
    move/from16 v19, v18

    .line 303
    .line 304
    const/16 v18, 0x0

    .line 305
    .line 306
    move/from16 v20, v19

    .line 307
    .line 308
    const/16 v19, 0x0

    .line 309
    .line 310
    move/from16 v22, v20

    .line 311
    .line 312
    const/16 v20, 0x0

    .line 313
    .line 314
    move/from16 v22, v0

    .line 315
    .line 316
    move-object/from16 v0, p0

    .line 317
    .line 318
    invoke-static/range {v0 .. v24}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 319
    .line 320
    .line 321
    invoke-interface/range {v21 .. v21}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 322
    .line 323
    .line 324
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 325
    .line 326
    .line 327
    move-result v1

    .line 328
    if-eqz v1, :cond_a

    .line 329
    .line 330
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 331
    .line 332
    .line 333
    goto :goto_4

    .line 334
    :cond_9
    move-object/from16 v21, v7

    .line 335
    .line 336
    invoke-interface/range {v21 .. v21}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 337
    .line 338
    .line 339
    :cond_a
    :goto_4
    invoke-interface/range {v21 .. v21}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 340
    .line 341
    .line 342
    move-result-object v1

    .line 343
    if-eqz v1, :cond_b

    .line 344
    .line 345
    new-instance v2, Lcom/zykj/mistake/feature/collection/component/m;

    .line 346
    .line 347
    move/from16 v3, p2

    .line 348
    .line 349
    const/4 v13, 0x1

    .line 350
    invoke-direct {v2, v0, v3, v13}, Lcom/zykj/mistake/feature/collection/component/m;-><init>(Ljava/lang/String;II)V

    .line 351
    .line 352
    .line 353
    invoke-interface {v1, v2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 354
    .line 355
    .line 356
    :cond_b
    return-void
.end method

.method public static final f(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;Lr6/c;Landroidx/compose/runtime/Composer;I)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    const-string v3, "selectedTab"

    .line 8
    .line 9
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v3, "onSelectTab"

    .line 13
    .line 14
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const v3, -0x50e8b982

    .line 18
    .line 19
    .line 20
    move-object/from16 v4, p2

    .line 21
    .line 22
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    and-int/lit8 v5, v2, 0x6

    .line 27
    .line 28
    const/4 v6, 0x2

    .line 29
    if-nez v5, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    invoke-interface {v4, v5}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-eqz v5, :cond_0

    .line 40
    .line 41
    const/4 v5, 0x4

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move v5, v6

    .line 44
    :goto_0
    or-int/2addr v5, v2

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move v5, v2

    .line 47
    :goto_1
    and-int/lit8 v7, v2, 0x30

    .line 48
    .line 49
    const/16 v8, 0x10

    .line 50
    .line 51
    const/16 v9, 0x20

    .line 52
    .line 53
    if-nez v7, :cond_3

    .line 54
    .line 55
    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    if-eqz v7, :cond_2

    .line 60
    .line 61
    move v7, v9

    .line 62
    goto :goto_2

    .line 63
    :cond_2
    move v7, v8

    .line 64
    :goto_2
    or-int/2addr v5, v7

    .line 65
    :cond_3
    and-int/lit8 v7, v5, 0x13

    .line 66
    .line 67
    const/16 v10, 0x12

    .line 68
    .line 69
    const/4 v11, 0x0

    .line 70
    const/4 v12, 0x1

    .line 71
    if-eq v7, v10, :cond_4

    .line 72
    .line 73
    move v7, v12

    .line 74
    goto :goto_3

    .line 75
    :cond_4
    move v7, v11

    .line 76
    :goto_3
    and-int/lit8 v10, v5, 0x1

    .line 77
    .line 78
    invoke-interface {v4, v7, v10}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    if-eqz v7, :cond_f

    .line 83
    .line 84
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    if-eqz v7, :cond_5

    .line 89
    .line 90
    const/4 v7, -0x1

    .line 91
    const-string v10, "com.zykj.mistake.feature.notebook.detail.DetailAnswerTabs (MistakeDetailAnswerPanel.kt:147)"

    .line 92
    .line 93
    invoke-static {v3, v5, v7, v10}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 94
    .line 95
    .line 96
    :cond_5
    sget-object v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;->MY_ANSWER:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;

    .line 97
    .line 98
    new-instance v7, Lkotlin/Pair;

    .line 99
    .line 100
    const-string v10, "\u6211\u7684\u4f5c\u7b54"

    .line 101
    .line 102
    invoke-direct {v7, v3, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    sget-object v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;->SUPPLEMENT:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;

    .line 106
    .line 107
    new-instance v10, Lkotlin/Pair;

    .line 108
    .line 109
    const-string v13, "\u8865\u5145\u8bb2\u89e3"

    .line 110
    .line 111
    invoke-direct {v10, v3, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    sget-object v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;->NOTE:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;

    .line 115
    .line 116
    new-instance v13, Lkotlin/Pair;

    .line 117
    .line 118
    const-string v14, "\u7b14\u8bb0"

    .line 119
    .line 120
    invoke-direct {v13, v3, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    filled-new-array {v7, v10, v13}, [Lkotlin/Pair;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    invoke-static {v3}, Lkotlin/collections/u;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    sget-object v7, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 132
    .line 133
    const/4 v10, 0x0

    .line 134
    const/4 v13, 0x0

    .line 135
    invoke-static {v7, v10, v12, v13}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 136
    .line 137
    .line 138
    move-result-object v14

    .line 139
    sget-object v7, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 140
    .line 141
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/Color$Companion;->getTransparent-0d7_KjU()J

    .line 142
    .line 143
    .line 144
    move-result-wide v15

    .line 145
    const/16 v18, 0x2

    .line 146
    .line 147
    const/16 v19, 0x0

    .line 148
    .line 149
    const/16 v17, 0x0

    .line 150
    .line 151
    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    int-to-float v8, v8

    .line 156
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 157
    .line 158
    .line 159
    move-result v8

    .line 160
    invoke-static {v7, v8, v10, v6, v13}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    sget-object v7, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 165
    .line 166
    const/16 v8, 0x1c

    .line 167
    .line 168
    int-to-float v8, v8

    .line 169
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 170
    .line 171
    .line 172
    move-result v8

    .line 173
    invoke-virtual {v7, v8}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 174
    .line 175
    .line 176
    move-result-object v7

    .line 177
    sget-object v8, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 178
    .line 179
    invoke-virtual {v8}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    .line 180
    .line 181
    .line 182
    move-result-object v8

    .line 183
    const/4 v10, 0x6

    .line 184
    invoke-static {v7, v8, v4, v10}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 185
    .line 186
    .line 187
    move-result-object v7

    .line 188
    invoke-static {v4, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 189
    .line 190
    .line 191
    move-result v8

    .line 192
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 193
    .line 194
    .line 195
    move-result-object v10

    .line 196
    invoke-static {v4, v6}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 197
    .line 198
    .line 199
    move-result-object v6

    .line 200
    sget-object v13, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 201
    .line 202
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 203
    .line 204
    .line 205
    move-result-object v14

    .line 206
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 207
    .line 208
    .line 209
    move-result-object v15

    .line 210
    if-nez v15, :cond_6

    .line 211
    .line 212
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 213
    .line 214
    .line 215
    :cond_6
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 216
    .line 217
    .line 218
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 219
    .line 220
    .line 221
    move-result v15

    .line 222
    if-eqz v15, :cond_7

    .line 223
    .line 224
    invoke-interface {v4, v14}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 225
    .line 226
    .line 227
    goto :goto_4

    .line 228
    :cond_7
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 229
    .line 230
    .line 231
    :goto_4
    invoke-static {v4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 232
    .line 233
    .line 234
    move-result-object v14

    .line 235
    invoke-static {v13, v14, v7, v14, v10}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 236
    .line 237
    .line 238
    move-result-object v7

    .line 239
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 240
    .line 241
    .line 242
    move-result v10

    .line 243
    if-nez v10, :cond_8

    .line 244
    .line 245
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v10

    .line 249
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 250
    .line 251
    .line 252
    move-result-object v15

    .line 253
    invoke-static {v10, v15}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v10

    .line 257
    if-nez v10, :cond_9

    .line 258
    .line 259
    :cond_8
    invoke-static {v8, v14, v8, v7}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 260
    .line 261
    .line 262
    :cond_9
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 263
    .line 264
    .line 265
    move-result-object v7

    .line 266
    invoke-static {v14, v6, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 267
    .line 268
    .line 269
    sget-object v6, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 270
    .line 271
    const v6, -0x731bb7f5

    .line 272
    .line 273
    .line 274
    invoke-interface {v4, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 275
    .line 276
    .line 277
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 282
    .line 283
    .line 284
    move-result v6

    .line 285
    if-eqz v6, :cond_e

    .line 286
    .line 287
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v6

    .line 291
    check-cast v6, Lkotlin/Pair;

    .line 292
    .line 293
    invoke-virtual {v6}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v7

    .line 297
    check-cast v7, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;

    .line 298
    .line 299
    invoke-virtual {v6}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v6

    .line 303
    check-cast v6, Ljava/lang/String;

    .line 304
    .line 305
    if-ne v7, v0, :cond_a

    .line 306
    .line 307
    move v8, v12

    .line 308
    goto :goto_6

    .line 309
    :cond_a
    move v8, v11

    .line 310
    :goto_6
    and-int/lit8 v10, v5, 0x70

    .line 311
    .line 312
    if-ne v10, v9, :cond_b

    .line 313
    .line 314
    move v10, v12

    .line 315
    goto :goto_7

    .line 316
    :cond_b
    move v10, v11

    .line 317
    :goto_7
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 318
    .line 319
    .line 320
    move-result v13

    .line 321
    invoke-interface {v4, v13}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 322
    .line 323
    .line 324
    move-result v13

    .line 325
    or-int/2addr v10, v13

    .line 326
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v13

    .line 330
    if-nez v10, :cond_c

    .line 331
    .line 332
    sget-object v10, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 333
    .line 334
    invoke-virtual {v10}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v10

    .line 338
    if-ne v13, v10, :cond_d

    .line 339
    .line 340
    :cond_c
    new-instance v13, Landroidx/navigation/e;

    .line 341
    .line 342
    const/16 v10, 0xa

    .line 343
    .line 344
    invoke-direct {v13, v10, v1, v7}, Landroidx/navigation/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    invoke-interface {v4, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    :cond_d
    check-cast v13, Lr6/a;

    .line 351
    .line 352
    invoke-static {v6, v8, v13, v4, v11}, Lcom/zykj/mistake/feature/notebook/detail/t;->i(Ljava/lang/String;ZLr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 353
    .line 354
    .line 355
    goto :goto_5

    .line 356
    :cond_e
    invoke-static {v4}, Landroidx/collection/a;->x(Landroidx/compose/runtime/Composer;)Z

    .line 357
    .line 358
    .line 359
    move-result v3

    .line 360
    if-eqz v3, :cond_10

    .line 361
    .line 362
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 363
    .line 364
    .line 365
    goto :goto_8

    .line 366
    :cond_f
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 367
    .line 368
    .line 369
    :cond_10
    :goto_8
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 370
    .line 371
    .line 372
    move-result-object v3

    .line 373
    if-eqz v3, :cond_11

    .line 374
    .line 375
    new-instance v4, Landroidx/navigation/compose/b;

    .line 376
    .line 377
    const/16 v5, 0xb

    .line 378
    .line 379
    invoke-direct {v4, v2, v5, v0, v1}, Landroidx/navigation/compose/b;-><init>(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 380
    .line 381
    .line 382
    invoke-interface {v3, v4}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 383
    .line 384
    .line 385
    :cond_11
    return-void
.end method

.method public static final g(Lcom/zykj/mistake/feature/notebook/detail/m3;Lr6/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move/from16 v0, p4

    .line 6
    .line 7
    const-string v3, "state"

    .line 8
    .line 9
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const v3, -0x25fade44

    .line 13
    .line 14
    .line 15
    move-object/from16 v4, p3

    .line 16
    .line 17
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 18
    .line 19
    .line 20
    move-result-object v7

    .line 21
    and-int/lit8 v4, v0, 0x6

    .line 22
    .line 23
    if-nez v4, :cond_1

    .line 24
    .line 25
    invoke-interface {v7, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    const/4 v4, 0x4

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v4, 0x2

    .line 34
    :goto_0
    or-int/2addr v4, v0

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move v4, v0

    .line 37
    :goto_1
    and-int/lit8 v5, v0, 0x30

    .line 38
    .line 39
    const/16 v6, 0x20

    .line 40
    .line 41
    if-nez v5, :cond_3

    .line 42
    .line 43
    invoke-interface {v7, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-eqz v5, :cond_2

    .line 48
    .line 49
    move v5, v6

    .line 50
    goto :goto_2

    .line 51
    :cond_2
    const/16 v5, 0x10

    .line 52
    .line 53
    :goto_2
    or-int/2addr v4, v5

    .line 54
    :cond_3
    and-int/lit16 v5, v0, 0x180

    .line 55
    .line 56
    move-object/from16 v8, p2

    .line 57
    .line 58
    if-nez v5, :cond_5

    .line 59
    .line 60
    invoke-interface {v7, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_4

    .line 65
    .line 66
    const/16 v5, 0x100

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_4
    const/16 v5, 0x80

    .line 70
    .line 71
    :goto_3
    or-int/2addr v4, v5

    .line 72
    :cond_5
    and-int/lit16 v5, v4, 0x93

    .line 73
    .line 74
    const/16 v9, 0x92

    .line 75
    .line 76
    const/4 v14, 0x1

    .line 77
    const/4 v15, 0x0

    .line 78
    if-eq v5, v9, :cond_6

    .line 79
    .line 80
    move v5, v14

    .line 81
    goto :goto_4

    .line 82
    :cond_6
    move v5, v15

    .line 83
    :goto_4
    and-int/lit8 v9, v4, 0x1

    .line 84
    .line 85
    invoke-interface {v7, v5, v9}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    if-eqz v5, :cond_14

    .line 90
    .line 91
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    if-eqz v5, :cond_7

    .line 96
    .line 97
    const/4 v5, -0x1

    .line 98
    const-string v9, "com.zykj.mistake.feature.notebook.detail.DetailRightPanel (MistakeDetailAnswerPanel.kt:69)"

    .line 99
    .line 100
    invoke-static {v3, v4, v5, v9}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 101
    .line 102
    .line 103
    :cond_7
    const-wide v9, 0xfff5f7faL

    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    invoke-static {v9, v10}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 109
    .line 110
    .line 111
    move-result-wide v9

    .line 112
    const/4 v12, 0x2

    .line 113
    const/4 v13, 0x0

    .line 114
    const/4 v11, 0x0

    .line 115
    invoke-static/range {v8 .. v13}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    sget-object v5, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 120
    .line 121
    invoke-virtual {v5}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    sget-object v8, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 126
    .line 127
    invoke-virtual {v8}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 128
    .line 129
    .line 130
    move-result-object v8

    .line 131
    invoke-static {v5, v8, v7, v15}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    invoke-static {v7, v15}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 136
    .line 137
    .line 138
    move-result v8

    .line 139
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 140
    .line 141
    .line 142
    move-result-object v9

    .line 143
    invoke-static {v7, v3}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    sget-object v10, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 148
    .line 149
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 150
    .line 151
    .line 152
    move-result-object v11

    .line 153
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 154
    .line 155
    .line 156
    move-result-object v12

    .line 157
    if-nez v12, :cond_8

    .line 158
    .line 159
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 160
    .line 161
    .line 162
    :cond_8
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 163
    .line 164
    .line 165
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 166
    .line 167
    .line 168
    move-result v12

    .line 169
    if-eqz v12, :cond_9

    .line 170
    .line 171
    invoke-interface {v7, v11}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 172
    .line 173
    .line 174
    goto :goto_5

    .line 175
    :cond_9
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 176
    .line 177
    .line 178
    :goto_5
    invoke-static {v7}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 179
    .line 180
    .line 181
    move-result-object v11

    .line 182
    invoke-static {v10, v11, v5, v11, v9}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 187
    .line 188
    .line 189
    move-result v9

    .line 190
    if-nez v9, :cond_a

    .line 191
    .line 192
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v9

    .line 196
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 197
    .line 198
    .line 199
    move-result-object v12

    .line 200
    invoke-static {v9, v12}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v9

    .line 204
    if-nez v9, :cond_b

    .line 205
    .line 206
    :cond_a
    invoke-static {v8, v11, v8, v5}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 207
    .line 208
    .line 209
    :cond_b
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 210
    .line 211
    .line 212
    move-result-object v5

    .line 213
    invoke-static {v11, v3, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 214
    .line 215
    .line 216
    sget-object v16, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 217
    .line 218
    iget-boolean v3, v1, Lcom/zykj/mistake/feature/notebook/detail/m3;->A:Z

    .line 219
    .line 220
    const/4 v5, 0x0

    .line 221
    const/4 v8, 0x0

    .line 222
    if-nez v3, :cond_f

    .line 223
    .line 224
    const v3, 0x3a4cb789

    .line 225
    .line 226
    .line 227
    invoke-interface {v7, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 228
    .line 229
    .line 230
    and-int/lit8 v3, v4, 0x70

    .line 231
    .line 232
    if-ne v3, v6, :cond_c

    .line 233
    .line 234
    move v3, v14

    .line 235
    goto :goto_6

    .line 236
    :cond_c
    move v3, v15

    .line 237
    :goto_6
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v6

    .line 241
    if-nez v3, :cond_d

    .line 242
    .line 243
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 244
    .line 245
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    if-ne v6, v3, :cond_e

    .line 250
    .line 251
    :cond_d
    new-instance v6, Lcom/zykj/mistake/feature/collection/filter/u0;

    .line 252
    .line 253
    const/16 v3, 0x13

    .line 254
    .line 255
    invoke-direct {v6, v2, v3}, Lcom/zykj/mistake/feature/collection/filter/u0;-><init>(Lr6/c;I)V

    .line 256
    .line 257
    .line 258
    invoke-interface {v7, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    :cond_e
    check-cast v6, Lr6/a;

    .line 262
    .line 263
    sget-object v17, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 264
    .line 265
    const/16 v20, 0x2

    .line 266
    .line 267
    const/16 v21, 0x0

    .line 268
    .line 269
    const/high16 v18, 0x3f800000    # 1.0f

    .line 270
    .line 271
    const/16 v19, 0x0

    .line 272
    .line 273
    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/ColumnScope;->weight$default(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    invoke-static {v3, v8, v14, v5}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    invoke-static {v6, v3, v7, v15}, Lcom/zykj/mistake/feature/notebook/detail/t;->a(Lr6/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 282
    .line 283
    .line 284
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 285
    .line 286
    .line 287
    goto :goto_8

    .line 288
    :cond_f
    const v3, 0x3a5090a2

    .line 289
    .line 290
    .line 291
    invoke-interface {v7, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 292
    .line 293
    .line 294
    iget-object v3, v1, Lcom/zykj/mistake/feature/notebook/detail/m3;->D:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;

    .line 295
    .line 296
    and-int/lit8 v9, v4, 0x70

    .line 297
    .line 298
    if-ne v9, v6, :cond_10

    .line 299
    .line 300
    move v6, v14

    .line 301
    goto :goto_7

    .line 302
    :cond_10
    move v6, v15

    .line 303
    :goto_7
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v9

    .line 307
    if-nez v6, :cond_11

    .line 308
    .line 309
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 310
    .line 311
    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v6

    .line 315
    if-ne v9, v6, :cond_12

    .line 316
    .line 317
    :cond_11
    new-instance v9, Lcom/zykj/mistake/feature/collection/detail/a1;

    .line 318
    .line 319
    const/16 v6, 0x18

    .line 320
    .line 321
    invoke-direct {v9, v2, v6}, Lcom/zykj/mistake/feature/collection/detail/a1;-><init>(Lr6/c;I)V

    .line 322
    .line 323
    .line 324
    invoke-interface {v7, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    :cond_12
    check-cast v9, Lr6/c;

    .line 328
    .line 329
    invoke-static {v3, v9, v7, v15}, Lcom/zykj/mistake/feature/notebook/detail/t;->f(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;Lr6/c;Landroidx/compose/runtime/Composer;I)V

    .line 330
    .line 331
    .line 332
    sget-object v17, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 333
    .line 334
    const/16 v20, 0x2

    .line 335
    .line 336
    const/16 v21, 0x0

    .line 337
    .line 338
    const/high16 v18, 0x3f800000    # 1.0f

    .line 339
    .line 340
    const/16 v19, 0x0

    .line 341
    .line 342
    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/ColumnScope;->weight$default(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 343
    .line 344
    .line 345
    move-result-object v3

    .line 346
    invoke-static {v3, v8, v14, v5}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 347
    .line 348
    .line 349
    move-result-object v3

    .line 350
    and-int/lit8 v5, v4, 0x7e

    .line 351
    .line 352
    invoke-static {v1, v2, v3, v7, v5}, Lcom/zykj/mistake/feature/notebook/detail/t;->h(Lcom/zykj/mistake/feature/notebook/detail/m3;Lr6/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 353
    .line 354
    .line 355
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 356
    .line 357
    .line 358
    :goto_8
    iget-object v2, v1, Lcom/zykj/mistake/feature/notebook/detail/m3;->t:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;

    .line 359
    .line 360
    iget-boolean v3, v1, Lcom/zykj/mistake/feature/notebook/detail/m3;->z:Z

    .line 361
    .line 362
    move v5, v4

    .line 363
    iget-boolean v4, v1, Lcom/zykj/mistake/feature/notebook/detail/m3;->B:Z

    .line 364
    .line 365
    iget-object v6, v1, Lcom/zykj/mistake/feature/notebook/detail/m3;->d:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;

    .line 366
    .line 367
    sget-object v8, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;->REVIEW_RECOMMEND:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;

    .line 368
    .line 369
    if-eq v6, v8, :cond_13

    .line 370
    .line 371
    goto :goto_9

    .line 372
    :cond_13
    move v14, v15

    .line 373
    :goto_9
    shl-int/lit8 v5, v5, 0x9

    .line 374
    .line 375
    const v6, 0xe000

    .line 376
    .line 377
    .line 378
    and-int v8, v5, v6

    .line 379
    .line 380
    move-object/from16 v6, p1

    .line 381
    .line 382
    move v5, v14

    .line 383
    invoke-static/range {v2 .. v8}, Lcom/zykj/mistake/feature/notebook/detail/n0;->b(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;ZZZLr6/c;Landroidx/compose/runtime/Composer;I)V

    .line 384
    .line 385
    .line 386
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 387
    .line 388
    .line 389
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 390
    .line 391
    .line 392
    move-result v2

    .line 393
    if-eqz v2, :cond_15

    .line 394
    .line 395
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 396
    .line 397
    .line 398
    goto :goto_a

    .line 399
    :cond_14
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 400
    .line 401
    .line 402
    :cond_15
    :goto_a
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 403
    .line 404
    .line 405
    move-result-object v6

    .line 406
    if-eqz v6, :cond_16

    .line 407
    .line 408
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/l;

    .line 409
    .line 410
    const/4 v5, 0x0

    .line 411
    move-object/from16 v2, p1

    .line 412
    .line 413
    move-object/from16 v3, p2

    .line 414
    .line 415
    move/from16 v4, p4

    .line 416
    .line 417
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/notebook/detail/l;-><init>(Lcom/zykj/mistake/feature/notebook/detail/m3;Lr6/c;Landroidx/compose/ui/Modifier;II)V

    .line 418
    .line 419
    .line 420
    invoke-interface {v6, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 421
    .line 422
    .line 423
    :cond_16
    return-void
.end method

.method public static final h(Lcom/zykj/mistake/feature/notebook/detail/m3;Lr6/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 11

    .line 1
    const-string v4, "state"

    .line 2
    .line 3
    invoke-static {p0, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const v4, 0x58abe998

    .line 7
    .line 8
    .line 9
    invoke-interface {p3, v4}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 10
    .line 11
    .line 12
    move-result-object v7

    .line 13
    and-int/lit8 v5, p4, 0x6

    .line 14
    .line 15
    const/4 v6, 0x2

    .line 16
    if-nez v5, :cond_1

    .line 17
    .line 18
    invoke-interface {v7, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    if-eqz v5, :cond_0

    .line 23
    .line 24
    const/4 v5, 0x4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v5, v6

    .line 27
    :goto_0
    or-int/2addr v5, p4

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move v5, p4

    .line 30
    :goto_1
    and-int/lit8 v8, p4, 0x30

    .line 31
    .line 32
    if-nez v8, :cond_3

    .line 33
    .line 34
    invoke-interface {v7, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v8

    .line 38
    if-eqz v8, :cond_2

    .line 39
    .line 40
    const/16 v8, 0x20

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_2
    const/16 v8, 0x10

    .line 44
    .line 45
    :goto_2
    or-int/2addr v5, v8

    .line 46
    :cond_3
    and-int/lit16 v8, p4, 0x180

    .line 47
    .line 48
    if-nez v8, :cond_5

    .line 49
    .line 50
    invoke-interface {v7, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v8

    .line 54
    if-eqz v8, :cond_4

    .line 55
    .line 56
    const/16 v8, 0x100

    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_4
    const/16 v8, 0x80

    .line 60
    .line 61
    :goto_3
    or-int/2addr v5, v8

    .line 62
    :cond_5
    and-int/lit16 v8, v5, 0x93

    .line 63
    .line 64
    const/16 v9, 0x92

    .line 65
    .line 66
    const/4 v10, 0x1

    .line 67
    if-eq v8, v9, :cond_6

    .line 68
    .line 69
    move v8, v10

    .line 70
    goto :goto_4

    .line 71
    :cond_6
    const/4 v8, 0x0

    .line 72
    :goto_4
    and-int/lit8 v9, v5, 0x1

    .line 73
    .line 74
    invoke-interface {v7, v8, v9}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 75
    .line 76
    .line 77
    move-result v8

    .line 78
    if-eqz v8, :cond_b

    .line 79
    .line 80
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 81
    .line 82
    .line 83
    move-result v8

    .line 84
    if-eqz v8, :cond_7

    .line 85
    .line 86
    const/4 v8, -0x1

    .line 87
    const-string v9, "com.zykj.mistake.feature.notebook.detail.DetailTabContent (MistakeDetailAnswerPanel.kt:207)"

    .line 88
    .line 89
    invoke-static {v4, v5, v8, v9}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 90
    .line 91
    .line 92
    :cond_7
    iget-object v4, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->D:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;

    .line 93
    .line 94
    sget-object v8, Lcom/zykj/mistake/feature/notebook/detail/s;->a:[I

    .line 95
    .line 96
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    aget v4, v8, v4

    .line 101
    .line 102
    if-eq v4, v10, :cond_a

    .line 103
    .line 104
    if-eq v4, v6, :cond_9

    .line 105
    .line 106
    const/4 v6, 0x3

    .line 107
    if-ne v4, v6, :cond_8

    .line 108
    .line 109
    const v4, -0x22a7b9a0

    .line 110
    .line 111
    .line 112
    invoke-interface {v7, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 113
    .line 114
    .line 115
    iget-object v4, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->I:Lcom/zykj/mistake/feature/notebook/detail/k3;

    .line 116
    .line 117
    and-int/lit16 v5, v5, 0x3f0

    .line 118
    .line 119
    invoke-static {v4, p1, p2, v7, v5}, Lcom/zykj/mistake/feature/notebook/detail/q4;->d(Lcom/zykj/mistake/feature/notebook/detail/k3;Lr6/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 120
    .line 121
    .line 122
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 123
    .line 124
    .line 125
    goto :goto_5

    .line 126
    :cond_8
    const v0, -0x22a8029f

    .line 127
    .line 128
    .line 129
    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 130
    .line 131
    .line 132
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 133
    .line 134
    .line 135
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 136
    .line 137
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 138
    .line 139
    .line 140
    throw v0

    .line 141
    :cond_9
    const v4, -0x22a7ccce

    .line 142
    .line 143
    .line 144
    invoke-interface {v7, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 145
    .line 146
    .line 147
    iget-object v4, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->H:Lcom/zykj/mistake/feature/notebook/detail/n3;

    .line 148
    .line 149
    and-int/lit16 v5, v5, 0x3f0

    .line 150
    .line 151
    invoke-static {v4, p1, p2, v7, v5}, Lcom/zykj/mistake/feature/notebook/detail/t;->n(Lcom/zykj/mistake/feature/notebook/detail/n3;Lr6/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 152
    .line 153
    .line 154
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 155
    .line 156
    .line 157
    goto :goto_5

    .line 158
    :cond_a
    const v4, -0x22a7f84c

    .line 159
    .line 160
    .line 161
    invoke-interface {v7, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 162
    .line 163
    .line 164
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->E:Ljava/util/List;

    .line 165
    .line 166
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->F:Lcom/zykj/mistake/feature/notebook/detail/p0;

    .line 167
    .line 168
    iget-object v4, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->G:Lcom/zykj/mistake/feature/notebook/detail/p0;

    .line 169
    .line 170
    shl-int/lit8 v5, v5, 0x6

    .line 171
    .line 172
    const v6, 0xfc00

    .line 173
    .line 174
    .line 175
    and-int v8, v5, v6

    .line 176
    .line 177
    move-object v5, p1

    .line 178
    move-object v6, p2

    .line 179
    invoke-static/range {v2 .. v8}, Lcom/zykj/mistake/feature/notebook/detail/t;->l(Ljava/util/List;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/p0;Lr6/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 180
    .line 181
    .line 182
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 183
    .line 184
    .line 185
    :goto_5
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    if-eqz v2, :cond_c

    .line 190
    .line 191
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 192
    .line 193
    .line 194
    goto :goto_6

    .line 195
    :cond_b
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 196
    .line 197
    .line 198
    :cond_c
    :goto_6
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 199
    .line 200
    .line 201
    move-result-object v6

    .line 202
    if-eqz v6, :cond_d

    .line 203
    .line 204
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/l;

    .line 205
    .line 206
    const/4 v5, 0x1

    .line 207
    move-object v1, p0

    .line 208
    move-object v2, p1

    .line 209
    move-object v3, p2

    .line 210
    move v4, p4

    .line 211
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/notebook/detail/l;-><init>(Lcom/zykj/mistake/feature/notebook/detail/m3;Lr6/c;Landroidx/compose/ui/Modifier;II)V

    .line 212
    .line 213
    .line 214
    invoke-interface {v6, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 215
    .line 216
    .line 217
    :cond_d
    return-void
.end method

.method public static final i(Ljava/lang/String;ZLr6/a;Landroidx/compose/runtime/Composer;I)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v6, p2

    .line 6
    .line 7
    move/from16 v9, p4

    .line 8
    .line 9
    const-string v2, "title"

    .line 10
    .line 11
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v2, "onClick"

    .line 15
    .line 16
    invoke-static {v6, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const v2, 0x6abf492a

    .line 20
    .line 21
    .line 22
    move-object/from16 v3, p3

    .line 23
    .line 24
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 25
    .line 26
    .line 27
    move-result-object v10

    .line 28
    and-int/lit8 v3, v9, 0x6

    .line 29
    .line 30
    if-nez v3, :cond_1

    .line 31
    .line 32
    invoke-interface {v10, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_0

    .line 37
    .line 38
    const/4 v3, 0x4

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/4 v3, 0x2

    .line 41
    :goto_0
    or-int/2addr v3, v9

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move v3, v9

    .line 44
    :goto_1
    and-int/lit8 v4, v9, 0x30

    .line 45
    .line 46
    if-nez v4, :cond_3

    .line 47
    .line 48
    invoke-interface {v10, v1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-eqz v4, :cond_2

    .line 53
    .line 54
    const/16 v4, 0x20

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    const/16 v4, 0x10

    .line 58
    .line 59
    :goto_2
    or-int/2addr v3, v4

    .line 60
    :cond_3
    and-int/lit16 v4, v9, 0x180

    .line 61
    .line 62
    if-nez v4, :cond_5

    .line 63
    .line 64
    invoke-interface {v10, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-eqz v4, :cond_4

    .line 69
    .line 70
    const/16 v4, 0x100

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_4
    const/16 v4, 0x80

    .line 74
    .line 75
    :goto_3
    or-int/2addr v3, v4

    .line 76
    :cond_5
    move v11, v3

    .line 77
    and-int/lit16 v3, v11, 0x93

    .line 78
    .line 79
    const/16 v4, 0x92

    .line 80
    .line 81
    const/4 v12, 0x0

    .line 82
    if-eq v3, v4, :cond_6

    .line 83
    .line 84
    const/4 v3, 0x1

    .line 85
    goto :goto_4

    .line 86
    :cond_6
    move v3, v12

    .line 87
    :goto_4
    and-int/lit8 v4, v11, 0x1

    .line 88
    .line 89
    invoke-interface {v10, v3, v4}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-eqz v3, :cond_f

    .line 94
    .line 95
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-eqz v3, :cond_7

    .line 100
    .line 101
    const/4 v3, -0x1

    .line 102
    const-string v4, "com.zykj.mistake.feature.notebook.detail.DetailTabItem (MistakeDetailAnswerPanel.kt:175)"

    .line 103
    .line 104
    invoke-static {v2, v11, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 105
    .line 106
    .line 107
    :cond_7
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 108
    .line 109
    const/4 v7, 0x7

    .line 110
    const/4 v8, 0x0

    .line 111
    const/4 v3, 0x0

    .line 112
    const/4 v4, 0x0

    .line 113
    const/4 v5, 0x0

    .line 114
    invoke-static/range {v2 .. v8}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 115
    .line 116
    .line 117
    move-result-object v13

    .line 118
    const/16 v3, 0xc

    .line 119
    .line 120
    int-to-float v3, v3

    .line 121
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 122
    .line 123
    .line 124
    move-result v15

    .line 125
    const/16 v18, 0xd

    .line 126
    .line 127
    const/16 v19, 0x0

    .line 128
    .line 129
    const/4 v14, 0x0

    .line 130
    const/16 v16, 0x0

    .line 131
    .line 132
    const/16 v17, 0x0

    .line 133
    .line 134
    invoke-static/range {v13 .. v19}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    sget-object v4, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 139
    .line 140
    invoke-virtual {v4}, Landroidx/compose/ui/Alignment$Companion;->getCenterHorizontally()Landroidx/compose/ui/Alignment$Horizontal;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    sget-object v5, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 145
    .line 146
    invoke-virtual {v5}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    const/16 v6, 0x30

    .line 151
    .line 152
    invoke-static {v5, v4, v10, v6}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    invoke-static {v10, v12}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    invoke-static {v10, v3}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    sget-object v7, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 169
    .line 170
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 171
    .line 172
    .line 173
    move-result-object v8

    .line 174
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 175
    .line 176
    .line 177
    move-result-object v13

    .line 178
    if-nez v13, :cond_8

    .line 179
    .line 180
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 181
    .line 182
    .line 183
    :cond_8
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 184
    .line 185
    .line 186
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 187
    .line 188
    .line 189
    move-result v13

    .line 190
    if-eqz v13, :cond_9

    .line 191
    .line 192
    invoke-interface {v10, v8}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 193
    .line 194
    .line 195
    goto :goto_5

    .line 196
    :cond_9
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 197
    .line 198
    .line 199
    :goto_5
    invoke-static {v10}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 200
    .line 201
    .line 202
    move-result-object v8

    .line 203
    invoke-static {v7, v8, v4, v8, v6}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 208
    .line 209
    .line 210
    move-result v6

    .line 211
    if-nez v6, :cond_a

    .line 212
    .line 213
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v6

    .line 217
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 218
    .line 219
    .line 220
    move-result-object v13

    .line 221
    invoke-static {v6, v13}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v6

    .line 225
    if-nez v6, :cond_b

    .line 226
    .line 227
    :cond_a
    invoke-static {v5, v8, v5, v4}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 228
    .line 229
    .line 230
    :cond_b
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 231
    .line 232
    .line 233
    move-result-object v4

    .line 234
    invoke-static {v8, v3, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 235
    .line 236
    .line 237
    sget-object v3, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 238
    .line 239
    if-eqz v1, :cond_c

    .line 240
    .line 241
    const-wide v3, 0xff15171aL

    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    :goto_6
    invoke-static {v3, v4}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 247
    .line 248
    .line 249
    move-result-wide v3

    .line 250
    goto :goto_7

    .line 251
    :cond_c
    const-wide v3, 0xff999999L

    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    goto :goto_6

    .line 257
    :goto_7
    const/16 v5, 0xf

    .line 258
    .line 259
    invoke-static {v5}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 260
    .line 261
    .line 262
    move-result-wide v5

    .line 263
    sget-object v7, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    .line 264
    .line 265
    if-eqz v1, :cond_d

    .line 266
    .line 267
    invoke-virtual {v7}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    .line 268
    .line 269
    .line 270
    move-result-object v7

    .line 271
    goto :goto_8

    .line 272
    :cond_d
    invoke-virtual {v7}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getNormal()Landroidx/compose/ui/text/font/FontWeight;

    .line 273
    .line 274
    .line 275
    move-result-object v7

    .line 276
    :goto_8
    and-int/lit8 v8, v11, 0xe

    .line 277
    .line 278
    or-int/lit16 v8, v8, 0xc00

    .line 279
    .line 280
    const/16 v23, 0xc00

    .line 281
    .line 282
    const v24, 0x1dfd2

    .line 283
    .line 284
    .line 285
    const/4 v1, 0x0

    .line 286
    move-object v11, v2

    .line 287
    move-wide v2, v3

    .line 288
    move-wide v4, v5

    .line 289
    const/4 v6, 0x0

    .line 290
    move/from16 v22, v8

    .line 291
    .line 292
    const/4 v8, 0x0

    .line 293
    move-object/from16 v21, v10

    .line 294
    .line 295
    const-wide/16 v9, 0x0

    .line 296
    .line 297
    move-object v13, v11

    .line 298
    const/4 v11, 0x0

    .line 299
    move v14, v12

    .line 300
    const/4 v12, 0x0

    .line 301
    move-object v15, v13

    .line 302
    move/from16 v16, v14

    .line 303
    .line 304
    const-wide/16 v13, 0x0

    .line 305
    .line 306
    move-object/from16 v17, v15

    .line 307
    .line 308
    const/4 v15, 0x0

    .line 309
    move/from16 v18, v16

    .line 310
    .line 311
    const/16 v16, 0x0

    .line 312
    .line 313
    move-object/from16 v19, v17

    .line 314
    .line 315
    const/16 v17, 0x1

    .line 316
    .line 317
    move/from16 v20, v18

    .line 318
    .line 319
    const/16 v18, 0x0

    .line 320
    .line 321
    move-object/from16 v25, v19

    .line 322
    .line 323
    const/16 v19, 0x0

    .line 324
    .line 325
    move/from16 v26, v20

    .line 326
    .line 327
    const/16 v20, 0x0

    .line 328
    .line 329
    move-object/from16 v27, v25

    .line 330
    .line 331
    invoke-static/range {v0 .. v24}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 332
    .line 333
    .line 334
    move-object/from16 v1, v21

    .line 335
    .line 336
    const/4 v2, 0x6

    .line 337
    int-to-float v3, v2

    .line 338
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 339
    .line 340
    .line 341
    move-result v3

    .line 342
    move-object/from16 v11, v27

    .line 343
    .line 344
    invoke-static {v11, v3}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 345
    .line 346
    .line 347
    move-result-object v3

    .line 348
    invoke-static {v3, v1, v2}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 349
    .line 350
    .line 351
    const/16 v2, 0x14

    .line 352
    .line 353
    int-to-float v2, v2

    .line 354
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 355
    .line 356
    .line 357
    move-result v2

    .line 358
    invoke-static {v11, v2}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 359
    .line 360
    .line 361
    move-result-object v2

    .line 362
    const/4 v3, 0x3

    .line 363
    int-to-float v3, v3

    .line 364
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 365
    .line 366
    .line 367
    move-result v3

    .line 368
    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 369
    .line 370
    .line 371
    move-result-object v2

    .line 372
    move/from16 v3, p1

    .line 373
    .line 374
    if-eqz v3, :cond_e

    .line 375
    .line 376
    sget-wide v4, Lcom/zykj/mistake/feature/notebook/detail/t4;->a:J

    .line 377
    .line 378
    goto :goto_9

    .line 379
    :cond_e
    sget-object v4, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 380
    .line 381
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/Color$Companion;->getTransparent-0d7_KjU()J

    .line 382
    .line 383
    .line 384
    move-result-wide v4

    .line 385
    :goto_9
    const-wide/high16 v6, 0x3ff8000000000000L    # 1.5

    .line 386
    .line 387
    double-to-float v6, v6

    .line 388
    invoke-static {v6, v2, v4, v5}, Landroidx/compose/material3/c;->f(FLandroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    const/4 v14, 0x0

    .line 393
    invoke-static {v2, v1, v14}, Landroidx/compose/foundation/layout/BoxKt;->Box(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 394
    .line 395
    .line 396
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 397
    .line 398
    .line 399
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 400
    .line 401
    .line 402
    move-result v2

    .line 403
    if-eqz v2, :cond_10

    .line 404
    .line 405
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 406
    .line 407
    .line 408
    goto :goto_a

    .line 409
    :cond_f
    move v3, v1

    .line 410
    move-object v1, v10

    .line 411
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 412
    .line 413
    .line 414
    :cond_10
    :goto_a
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 415
    .line 416
    .line 417
    move-result-object v1

    .line 418
    if-eqz v1, :cond_11

    .line 419
    .line 420
    new-instance v2, Lcom/zykj/mistake/feature/collection/detail/b1;

    .line 421
    .line 422
    move-object/from16 v6, p2

    .line 423
    .line 424
    move/from16 v9, p4

    .line 425
    .line 426
    invoke-direct {v2, v9, v0, v6, v3}, Lcom/zykj/mistake/feature/collection/detail/b1;-><init>(ILjava/lang/String;Lr6/a;Z)V

    .line 427
    .line 428
    .line 429
    invoke-interface {v1, v2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 430
    .line 431
    .line 432
    :cond_11
    return-void
.end method

.method public static final j(Ljava/util/List;Ljava/util/List;Lr6/e;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v4, p3

    .line 8
    .line 9
    move/from16 v5, p5

    .line 10
    .line 11
    const-string v0, "answers"

    .line 12
    .line 13
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "comments"

    .line 17
    .line 18
    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "onPreview"

    .line 22
    .line 23
    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const v0, -0x447a4c3b

    .line 27
    .line 28
    .line 29
    move-object/from16 v6, p4

    .line 30
    .line 31
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    and-int/lit8 v7, v5, 0x6

    .line 36
    .line 37
    if-nez v7, :cond_1

    .line 38
    .line 39
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    if-eqz v7, :cond_0

    .line 44
    .line 45
    const/4 v7, 0x4

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const/4 v7, 0x2

    .line 48
    :goto_0
    or-int/2addr v7, v5

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    move v7, v5

    .line 51
    :goto_1
    and-int/lit8 v9, v5, 0x30

    .line 52
    .line 53
    if-nez v9, :cond_3

    .line 54
    .line 55
    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v9

    .line 59
    if-eqz v9, :cond_2

    .line 60
    .line 61
    const/16 v9, 0x20

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    const/16 v9, 0x10

    .line 65
    .line 66
    :goto_2
    or-int/2addr v7, v9

    .line 67
    :cond_3
    and-int/lit16 v9, v5, 0x180

    .line 68
    .line 69
    const/16 v10, 0x100

    .line 70
    .line 71
    if-nez v9, :cond_5

    .line 72
    .line 73
    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v9

    .line 77
    if-eqz v9, :cond_4

    .line 78
    .line 79
    move v9, v10

    .line 80
    goto :goto_3

    .line 81
    :cond_4
    const/16 v9, 0x80

    .line 82
    .line 83
    :goto_3
    or-int/2addr v7, v9

    .line 84
    :cond_5
    and-int/lit16 v9, v5, 0xc00

    .line 85
    .line 86
    if-nez v9, :cond_7

    .line 87
    .line 88
    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v9

    .line 92
    if-eqz v9, :cond_6

    .line 93
    .line 94
    const/16 v9, 0x800

    .line 95
    .line 96
    goto :goto_4

    .line 97
    :cond_6
    const/16 v9, 0x400

    .line 98
    .line 99
    :goto_4
    or-int/2addr v7, v9

    .line 100
    :cond_7
    and-int/lit16 v9, v7, 0x493

    .line 101
    .line 102
    const/16 v11, 0x492

    .line 103
    .line 104
    const/4 v12, 0x1

    .line 105
    const/4 v13, 0x0

    .line 106
    if-eq v9, v11, :cond_8

    .line 107
    .line 108
    move v9, v12

    .line 109
    goto :goto_5

    .line 110
    :cond_8
    move v9, v13

    .line 111
    :goto_5
    and-int/lit8 v11, v7, 0x1

    .line 112
    .line 113
    invoke-interface {v6, v9, v11}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 114
    .line 115
    .line 116
    move-result v9

    .line 117
    if-eqz v9, :cond_19

    .line 118
    .line 119
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 120
    .line 121
    .line 122
    move-result v9

    .line 123
    if-eqz v9, :cond_9

    .line 124
    .line 125
    const/4 v9, -0x1

    .line 126
    const-string v11, "com.zykj.mistake.feature.notebook.detail.ImageAnswerContent (MistakeDetailAnswerPanel.kt:774)"

    .line 127
    .line 128
    invoke-static {v0, v7, v9, v11}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 129
    .line 130
    .line 131
    :cond_9
    new-instance v0, Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 134
    .line 135
    .line 136
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 137
    .line 138
    .line 139
    move-result-object v9

    .line 140
    :cond_a
    :goto_6
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v11

    .line 144
    if-eqz v11, :cond_b

    .line 145
    .line 146
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v11

    .line 150
    move-object v14, v11

    .line 151
    check-cast v14, Ljava/lang/String;

    .line 152
    .line 153
    invoke-static {v14}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 154
    .line 155
    .line 156
    move-result v14

    .line 157
    if-nez v14, :cond_a

    .line 158
    .line 159
    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    goto :goto_6

    .line 163
    :cond_b
    new-instance v9, Ljava/util/ArrayList;

    .line 164
    .line 165
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 166
    .line 167
    .line 168
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 169
    .line 170
    .line 171
    move-result-object v11

    .line 172
    :cond_c
    :goto_7
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 173
    .line 174
    .line 175
    move-result v14

    .line 176
    if-eqz v14, :cond_d

    .line 177
    .line 178
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v14

    .line 182
    move-object v15, v14

    .line 183
    check-cast v15, Ljava/lang/String;

    .line 184
    .line 185
    invoke-static {v15}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 186
    .line 187
    .line 188
    move-result v16

    .line 189
    if-nez v16, :cond_c

    .line 190
    .line 191
    const-string v8, "corrected"

    .line 192
    .line 193
    invoke-static {v15, v8, v13}, Lkotlin/text/p;->F(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 194
    .line 195
    .line 196
    move-result v8

    .line 197
    if-nez v8, :cond_c

    .line 198
    .line 199
    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    goto :goto_7

    .line 203
    :cond_d
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 204
    .line 205
    .line 206
    move-result v8

    .line 207
    if-eqz v8, :cond_f

    .line 208
    .line 209
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 210
    .line 211
    .line 212
    move-result v8

    .line 213
    if-eqz v8, :cond_f

    .line 214
    .line 215
    const v0, 0x2c18e1f8

    .line 216
    .line 217
    .line 218
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 219
    .line 220
    .line 221
    shr-int/lit8 v0, v7, 0x9

    .line 222
    .line 223
    and-int/lit8 v0, v0, 0xe

    .line 224
    .line 225
    invoke-static {v4, v6, v0}, Lcom/zykj/mistake/feature/notebook/detail/t;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    .line 226
    .line 227
    .line 228
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 229
    .line 230
    .line 231
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    if-eqz v0, :cond_e

    .line 236
    .line 237
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 238
    .line 239
    .line 240
    :cond_e
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 241
    .line 242
    .line 243
    move-result-object v7

    .line 244
    if-eqz v7, :cond_1b

    .line 245
    .line 246
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/o;

    .line 247
    .line 248
    const/4 v6, 0x0

    .line 249
    invoke-direct/range {v0 .. v6}, Lcom/zykj/mistake/feature/notebook/detail/o;-><init>(Ljava/util/List;Ljava/util/List;Lr6/e;Ljava/lang/String;II)V

    .line 250
    .line 251
    .line 252
    :goto_8
    invoke-interface {v7, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 253
    .line 254
    .line 255
    return-void

    .line 256
    :cond_f
    const v1, 0x2a950ffd

    .line 257
    .line 258
    .line 259
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 260
    .line 261
    .line 262
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 263
    .line 264
    .line 265
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 266
    .line 267
    const/4 v2, 0x0

    .line 268
    const/4 v4, 0x0

    .line 269
    invoke-static {v1, v2, v12, v4}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    sget-object v2, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 274
    .line 275
    const/16 v5, 0x8

    .line 276
    .line 277
    int-to-float v5, v5

    .line 278
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 279
    .line 280
    .line 281
    move-result v5

    .line 282
    invoke-virtual {v2, v5}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    sget-object v5, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 287
    .line 288
    invoke-virtual {v5}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 289
    .line 290
    .line 291
    move-result-object v5

    .line 292
    const/4 v8, 0x6

    .line 293
    invoke-static {v2, v5, v6, v8}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    invoke-static {v6, v13}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 298
    .line 299
    .line 300
    move-result v5

    .line 301
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 302
    .line 303
    .line 304
    move-result-object v8

    .line 305
    invoke-static {v6, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    sget-object v11, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 310
    .line 311
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 312
    .line 313
    .line 314
    move-result-object v14

    .line 315
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 316
    .line 317
    .line 318
    move-result-object v15

    .line 319
    if-nez v15, :cond_10

    .line 320
    .line 321
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 322
    .line 323
    .line 324
    :cond_10
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 325
    .line 326
    .line 327
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 328
    .line 329
    .line 330
    move-result v15

    .line 331
    if-eqz v15, :cond_11

    .line 332
    .line 333
    invoke-interface {v6, v14}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 334
    .line 335
    .line 336
    goto :goto_9

    .line 337
    :cond_11
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 338
    .line 339
    .line 340
    :goto_9
    invoke-static {v6}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 341
    .line 342
    .line 343
    move-result-object v14

    .line 344
    invoke-static {v11, v14, v2, v14, v8}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 345
    .line 346
    .line 347
    move-result-object v2

    .line 348
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 349
    .line 350
    .line 351
    move-result v8

    .line 352
    if-nez v8, :cond_12

    .line 353
    .line 354
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v8

    .line 358
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 359
    .line 360
    .line 361
    move-result-object v15

    .line 362
    invoke-static {v8, v15}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    move-result v8

    .line 366
    if-nez v8, :cond_13

    .line 367
    .line 368
    :cond_12
    invoke-static {v5, v14, v5, v2}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 369
    .line 370
    .line 371
    :cond_13
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 372
    .line 373
    .line 374
    move-result-object v2

    .line 375
    invoke-static {v14, v1, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 376
    .line 377
    .line 378
    sget-object v1, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 379
    .line 380
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 381
    .line 382
    .line 383
    move-result v1

    .line 384
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 385
    .line 386
    .line 387
    move-result v2

    .line 388
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 389
    .line 390
    .line 391
    move-result v1

    .line 392
    const v2, -0xffc032

    .line 393
    .line 394
    .line 395
    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 396
    .line 397
    .line 398
    move v2, v13

    .line 399
    :goto_a
    if-ge v2, v1, :cond_18

    .line 400
    .line 401
    invoke-static {v2, v0}, Lkotlin/collections/t;->j0(ILjava/util/List;)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v5

    .line 405
    check-cast v5, Ljava/lang/String;

    .line 406
    .line 407
    invoke-static {v2, v9}, Lkotlin/collections/t;->j0(ILjava/util/List;)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v8

    .line 411
    check-cast v8, Ljava/lang/String;

    .line 412
    .line 413
    if-eqz v8, :cond_14

    .line 414
    .line 415
    invoke-virtual {v8, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    move-result v11

    .line 419
    if-nez v11, :cond_14

    .line 420
    .line 421
    goto :goto_b

    .line 422
    :cond_14
    move-object v8, v4

    .line 423
    :goto_b
    and-int/lit16 v11, v7, 0x380

    .line 424
    .line 425
    if-ne v11, v10, :cond_15

    .line 426
    .line 427
    move v11, v12

    .line 428
    goto :goto_c

    .line 429
    :cond_15
    move v11, v13

    .line 430
    :goto_c
    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 431
    .line 432
    .line 433
    move-result v14

    .line 434
    or-int/2addr v11, v14

    .line 435
    invoke-interface {v6, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    move-result v14

    .line 439
    or-int/2addr v11, v14

    .line 440
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v14

    .line 444
    if-nez v11, :cond_17

    .line 445
    .line 446
    sget-object v11, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 447
    .line 448
    invoke-virtual {v11}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v11

    .line 452
    if-ne v14, v11, :cond_16

    .line 453
    .line 454
    goto :goto_d

    .line 455
    :cond_16
    const/4 v11, 0x2

    .line 456
    goto :goto_e

    .line 457
    :cond_17
    :goto_d
    new-instance v14, Landroidx/lifecycle/compose/a;

    .line 458
    .line 459
    const/4 v11, 0x2

    .line 460
    invoke-direct {v14, v3, v5, v11, v8}, Landroidx/lifecycle/compose/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 461
    .line 462
    .line 463
    invoke-interface {v6, v14}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 464
    .line 465
    .line 466
    :goto_e
    check-cast v14, Lr6/a;

    .line 467
    .line 468
    invoke-static {v5, v8, v14, v6, v13}, Lcom/zykj/mistake/feature/notebook/detail/t;->c(Ljava/lang/String;Ljava/lang/String;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 469
    .line 470
    .line 471
    add-int/lit8 v2, v2, 0x1

    .line 472
    .line 473
    goto :goto_a

    .line 474
    :cond_18
    invoke-static {v6}, Landroidx/collection/a;->x(Landroidx/compose/runtime/Composer;)Z

    .line 475
    .line 476
    .line 477
    move-result v0

    .line 478
    if-eqz v0, :cond_1a

    .line 479
    .line 480
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 481
    .line 482
    .line 483
    goto :goto_f

    .line 484
    :cond_19
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 485
    .line 486
    .line 487
    :cond_1a
    :goto_f
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 488
    .line 489
    .line 490
    move-result-object v7

    .line 491
    if-eqz v7, :cond_1b

    .line 492
    .line 493
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/o;

    .line 494
    .line 495
    const/4 v6, 0x1

    .line 496
    move-object/from16 v1, p0

    .line 497
    .line 498
    move-object/from16 v2, p1

    .line 499
    .line 500
    move-object/from16 v4, p3

    .line 501
    .line 502
    move/from16 v5, p5

    .line 503
    .line 504
    invoke-direct/range {v0 .. v6}, Lcom/zykj/mistake/feature/notebook/detail/o;-><init>(Ljava/util/List;Ljava/util/List;Lr6/e;Ljava/lang/String;II)V

    .line 505
    .line 506
    .line 507
    goto/16 :goto_8

    .line 508
    .line 509
    :cond_1b
    return-void
.end method

.method public static final k(Lcom/zykj/mistake/feature/notebook/detail/p0;Lr6/a;Landroidx/compose/runtime/Composer;I)V
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v5, p1

    .line 4
    .line 5
    move/from16 v8, p3

    .line 6
    .line 7
    const-string v1, "microLesson"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v1, "onClick"

    .line 13
    .line 14
    invoke-static {v5, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const v1, 0x5cba02f3

    .line 18
    .line 19
    .line 20
    move-object/from16 v2, p2

    .line 21
    .line 22
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 23
    .line 24
    .line 25
    move-result-object v9

    .line 26
    and-int/lit8 v2, v8, 0x6

    .line 27
    .line 28
    const/4 v3, 0x2

    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    const/4 v2, 0x4

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move v2, v3

    .line 40
    :goto_0
    or-int/2addr v2, v8

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move v2, v8

    .line 43
    :goto_1
    and-int/lit8 v4, v8, 0x30

    .line 44
    .line 45
    const/16 v10, 0x10

    .line 46
    .line 47
    if-nez v4, :cond_3

    .line 48
    .line 49
    invoke-interface {v9, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-eqz v4, :cond_2

    .line 54
    .line 55
    const/16 v4, 0x20

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    move v4, v10

    .line 59
    :goto_2
    or-int/2addr v2, v4

    .line 60
    :cond_3
    and-int/lit8 v4, v2, 0x13

    .line 61
    .line 62
    const/16 v6, 0x12

    .line 63
    .line 64
    const/4 v11, 0x0

    .line 65
    if-eq v4, v6, :cond_4

    .line 66
    .line 67
    const/4 v4, 0x1

    .line 68
    goto :goto_3

    .line 69
    :cond_4
    move v4, v11

    .line 70
    :goto_3
    and-int/lit8 v6, v2, 0x1

    .line 71
    .line 72
    invoke-interface {v9, v4, v6}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-eqz v4, :cond_a

    .line 77
    .line 78
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    if-eqz v4, :cond_5

    .line 83
    .line 84
    const/4 v4, -0x1

    .line 85
    const-string v6, "com.zykj.mistake.feature.notebook.detail.MicroLessonEntry (MistakeDetailAnswerPanel.kt:684)"

    .line 86
    .line 87
    invoke-static {v1, v2, v4, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 88
    .line 89
    .line 90
    :cond_5
    sget-object v12, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 91
    .line 92
    const/16 v1, 0x38

    .line 93
    .line 94
    int-to-float v1, v1

    .line 95
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 96
    .line 97
    .line 98
    move-result v13

    .line 99
    int-to-float v1, v3

    .line 100
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 101
    .line 102
    .line 103
    move-result v14

    .line 104
    const/16 v17, 0xc

    .line 105
    .line 106
    const/16 v18, 0x0

    .line 107
    .line 108
    const/4 v15, 0x0

    .line 109
    const/16 v16, 0x0

    .line 110
    .line 111
    invoke-static/range {v12 .. v18}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    const/4 v6, 0x7

    .line 116
    const/4 v7, 0x0

    .line 117
    const/4 v2, 0x0

    .line 118
    const/4 v3, 0x0

    .line 119
    const/4 v4, 0x0

    .line 120
    invoke-static/range {v1 .. v7}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    sget-object v2, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 125
    .line 126
    invoke-virtual {v2}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    sget-object v3, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 131
    .line 132
    invoke-virtual {v3}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    const/16 v4, 0x30

    .line 137
    .line 138
    invoke-static {v3, v2, v9, v4}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-static {v9, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    invoke-static {v9, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    sget-object v6, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 155
    .line 156
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 161
    .line 162
    .line 163
    move-result-object v13

    .line 164
    if-nez v13, :cond_6

    .line 165
    .line 166
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 167
    .line 168
    .line 169
    :cond_6
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 170
    .line 171
    .line 172
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 173
    .line 174
    .line 175
    move-result v13

    .line 176
    if-eqz v13, :cond_7

    .line 177
    .line 178
    invoke-interface {v9, v7}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 179
    .line 180
    .line 181
    goto :goto_4

    .line 182
    :cond_7
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 183
    .line 184
    .line 185
    :goto_4
    invoke-static {v9}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 186
    .line 187
    .line 188
    move-result-object v7

    .line 189
    invoke-static {v6, v7, v2, v7, v4}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 194
    .line 195
    .line 196
    move-result v4

    .line 197
    if-nez v4, :cond_8

    .line 198
    .line 199
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 204
    .line 205
    .line 206
    move-result-object v13

    .line 207
    invoke-static {v4, v13}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v4

    .line 211
    if-nez v4, :cond_9

    .line 212
    .line 213
    :cond_8
    invoke-static {v3, v7, v3, v2}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 214
    .line 215
    .line 216
    :cond_9
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    invoke-static {v7, v1, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 221
    .line 222
    .line 223
    sget-object v1, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 224
    .line 225
    sget v1, Lcom/zykj/mistake/R$mipmap;->icon_micro_read:I

    .line 226
    .line 227
    invoke-static {v1, v9, v11}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/detail/p0;->a:Ljava/lang/String;

    .line 232
    .line 233
    int-to-float v3, v10

    .line 234
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 235
    .line 236
    .line 237
    move-result v3

    .line 238
    invoke-static {v12, v3}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    const/16 v17, 0x180

    .line 243
    .line 244
    const/16 v18, 0x78

    .line 245
    .line 246
    move-object v4, v12

    .line 247
    const/4 v12, 0x0

    .line 248
    const/4 v13, 0x0

    .line 249
    const/4 v14, 0x0

    .line 250
    const/4 v15, 0x0

    .line 251
    move-object v10, v2

    .line 252
    move-object/from16 v16, v9

    .line 253
    .line 254
    move-object v9, v1

    .line 255
    move v1, v11

    .line 256
    move-object v11, v3

    .line 257
    invoke-static/range {v9 .. v18}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 258
    .line 259
    .line 260
    move-object/from16 v2, v16

    .line 261
    .line 262
    const/4 v3, 0x5

    .line 263
    int-to-float v3, v3

    .line 264
    const/4 v6, 0x6

    .line 265
    invoke-static {v3, v4, v2, v6}, Landroidx/compose/material3/c;->s(FLandroidx/compose/ui/Modifier$Companion;Landroidx/compose/runtime/Composer;I)V

    .line 266
    .line 267
    .line 268
    sget v3, Lcom/zykj/mistake/R$string;->view_comments:I

    .line 269
    .line 270
    invoke-static {v3, v2, v1}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v9

    .line 274
    sget-wide v11, Lcom/zykj/mistake/feature/notebook/detail/t4;->a:J

    .line 275
    .line 276
    const/16 v1, 0xc

    .line 277
    .line 278
    invoke-static {v1}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 279
    .line 280
    .line 281
    move-result-wide v13

    .line 282
    const/16 v32, 0xc00

    .line 283
    .line 284
    const v33, 0x1dff2

    .line 285
    .line 286
    .line 287
    const/4 v10, 0x0

    .line 288
    const/16 v16, 0x0

    .line 289
    .line 290
    const/16 v17, 0x0

    .line 291
    .line 292
    const-wide/16 v18, 0x0

    .line 293
    .line 294
    const/16 v20, 0x0

    .line 295
    .line 296
    const/16 v21, 0x0

    .line 297
    .line 298
    const-wide/16 v22, 0x0

    .line 299
    .line 300
    const/16 v24, 0x0

    .line 301
    .line 302
    const/16 v25, 0x0

    .line 303
    .line 304
    const/16 v26, 0x1

    .line 305
    .line 306
    const/16 v27, 0x0

    .line 307
    .line 308
    const/16 v28, 0x0

    .line 309
    .line 310
    const/16 v29, 0x0

    .line 311
    .line 312
    const/16 v31, 0xd80

    .line 313
    .line 314
    move-object/from16 v30, v2

    .line 315
    .line 316
    invoke-static/range {v9 .. v33}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 317
    .line 318
    .line 319
    invoke-interface/range {v30 .. v30}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 320
    .line 321
    .line 322
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 323
    .line 324
    .line 325
    move-result v1

    .line 326
    if-eqz v1, :cond_b

    .line 327
    .line 328
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 329
    .line 330
    .line 331
    goto :goto_5

    .line 332
    :cond_a
    move-object/from16 v30, v9

    .line 333
    .line 334
    invoke-interface/range {v30 .. v30}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 335
    .line 336
    .line 337
    :cond_b
    :goto_5
    invoke-interface/range {v30 .. v30}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    if-eqz v1, :cond_c

    .line 342
    .line 343
    new-instance v2, Landroidx/navigation/compose/b;

    .line 344
    .line 345
    const/4 v3, 0x7

    .line 346
    invoke-direct {v2, v8, v3, v0, v5}, Landroidx/navigation/compose/b;-><init>(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 347
    .line 348
    .line 349
    invoke-interface {v1, v2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 350
    .line 351
    .line 352
    :cond_c
    return-void
.end method

.method public static final l(Ljava/util/List;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/p0;Lr6/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v8, p6

    .line 4
    .line 5
    const-string v0, "answerEntries"

    .line 6
    .line 7
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const v0, 0x1fe33f51

    .line 11
    .line 12
    .line 13
    move-object/from16 v2, p5

    .line 14
    .line 15
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 16
    .line 17
    .line 18
    move-result-object v6

    .line 19
    and-int/lit8 v2, v8, 0x6

    .line 20
    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    const/4 v2, 0x4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v2, 0x2

    .line 32
    :goto_0
    or-int/2addr v2, v8

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v2, v8

    .line 35
    :goto_1
    and-int/lit8 v4, v8, 0x30

    .line 36
    .line 37
    const/16 v5, 0x10

    .line 38
    .line 39
    if-nez v4, :cond_3

    .line 40
    .line 41
    move-object/from16 v4, p1

    .line 42
    .line 43
    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    if-eqz v7, :cond_2

    .line 48
    .line 49
    const/16 v7, 0x20

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    move v7, v5

    .line 53
    :goto_2
    or-int/2addr v2, v7

    .line 54
    goto :goto_3

    .line 55
    :cond_3
    move-object/from16 v4, p1

    .line 56
    .line 57
    :goto_3
    and-int/lit16 v7, v8, 0x180

    .line 58
    .line 59
    move-object/from16 v9, p2

    .line 60
    .line 61
    if-nez v7, :cond_5

    .line 62
    .line 63
    invoke-interface {v6, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    if-eqz v7, :cond_4

    .line 68
    .line 69
    const/16 v7, 0x100

    .line 70
    .line 71
    goto :goto_4

    .line 72
    :cond_4
    const/16 v7, 0x80

    .line 73
    .line 74
    :goto_4
    or-int/2addr v2, v7

    .line 75
    :cond_5
    and-int/lit16 v7, v8, 0xc00

    .line 76
    .line 77
    if-nez v7, :cond_7

    .line 78
    .line 79
    move-object/from16 v7, p3

    .line 80
    .line 81
    invoke-interface {v6, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v10

    .line 85
    if-eqz v10, :cond_6

    .line 86
    .line 87
    const/16 v10, 0x800

    .line 88
    .line 89
    goto :goto_5

    .line 90
    :cond_6
    const/16 v10, 0x400

    .line 91
    .line 92
    :goto_5
    or-int/2addr v2, v10

    .line 93
    goto :goto_6

    .line 94
    :cond_7
    move-object/from16 v7, p3

    .line 95
    .line 96
    :goto_6
    and-int/lit16 v10, v8, 0x6000

    .line 97
    .line 98
    move-object/from16 v11, p4

    .line 99
    .line 100
    if-nez v10, :cond_9

    .line 101
    .line 102
    invoke-interface {v6, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v10

    .line 106
    if-eqz v10, :cond_8

    .line 107
    .line 108
    const/16 v10, 0x4000

    .line 109
    .line 110
    goto :goto_7

    .line 111
    :cond_8
    const/16 v10, 0x2000

    .line 112
    .line 113
    :goto_7
    or-int/2addr v2, v10

    .line 114
    :cond_9
    and-int/lit16 v10, v2, 0x2493

    .line 115
    .line 116
    const/16 v12, 0x2492

    .line 117
    .line 118
    const/4 v13, 0x1

    .line 119
    const/4 v14, 0x0

    .line 120
    if-eq v10, v12, :cond_a

    .line 121
    .line 122
    move v10, v13

    .line 123
    goto :goto_8

    .line 124
    :cond_a
    move v10, v14

    .line 125
    :goto_8
    and-int/lit8 v12, v2, 0x1

    .line 126
    .line 127
    invoke-interface {v6, v10, v12}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 128
    .line 129
    .line 130
    move-result v10

    .line 131
    if-eqz v10, :cond_16

    .line 132
    .line 133
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 134
    .line 135
    .line 136
    move-result v10

    .line 137
    if-eqz v10, :cond_b

    .line 138
    .line 139
    const/4 v10, -0x1

    .line 140
    const-string v12, "com.zykj.mistake.feature.notebook.detail.MyAnswerContent (MistakeDetailAnswerPanel.kt:231)"

    .line 141
    .line 142
    invoke-static {v0, v2, v10, v12}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 143
    .line 144
    .line 145
    :cond_b
    const-wide v15, 0xfff5f7faL

    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    invoke-static/range {v15 .. v16}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 151
    .line 152
    .line 153
    move-result-wide v15

    .line 154
    move v0, v13

    .line 155
    move-wide v12, v15

    .line 156
    const/4 v15, 0x2

    .line 157
    const/16 v16, 0x0

    .line 158
    .line 159
    move v10, v14

    .line 160
    const/4 v14, 0x0

    .line 161
    invoke-static/range {v11 .. v16}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 162
    .line 163
    .line 164
    move-result-object v12

    .line 165
    int-to-float v5, v5

    .line 166
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 167
    .line 168
    .line 169
    move-result v5

    .line 170
    invoke-static {v12, v5}, Landroidx/compose/foundation/layout/PaddingKt;->padding-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 171
    .line 172
    .line 173
    move-result-object v5

    .line 174
    sget-object v11, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 175
    .line 176
    invoke-virtual {v11}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 177
    .line 178
    .line 179
    move-result-object v12

    .line 180
    invoke-static {v12, v10}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 181
    .line 182
    .line 183
    move-result-object v12

    .line 184
    invoke-static {v6, v10}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 185
    .line 186
    .line 187
    move-result v13

    .line 188
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 189
    .line 190
    .line 191
    move-result-object v14

    .line 192
    invoke-static {v6, v5}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    sget-object v15, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 197
    .line 198
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 199
    .line 200
    .line 201
    move-result-object v10

    .line 202
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 203
    .line 204
    .line 205
    move-result-object v17

    .line 206
    if-nez v17, :cond_c

    .line 207
    .line 208
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 209
    .line 210
    .line 211
    :cond_c
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 212
    .line 213
    .line 214
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 215
    .line 216
    .line 217
    move-result v17

    .line 218
    if-eqz v17, :cond_d

    .line 219
    .line 220
    invoke-interface {v6, v10}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 221
    .line 222
    .line 223
    goto :goto_9

    .line 224
    :cond_d
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 225
    .line 226
    .line 227
    :goto_9
    invoke-static {v6}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 228
    .line 229
    .line 230
    move-result-object v10

    .line 231
    invoke-static {v15, v10, v12, v10, v14}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 232
    .line 233
    .line 234
    move-result-object v12

    .line 235
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 236
    .line 237
    .line 238
    move-result v14

    .line 239
    if-nez v14, :cond_e

    .line 240
    .line 241
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v14

    .line 245
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    invoke-static {v14, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result v3

    .line 253
    if-nez v3, :cond_f

    .line 254
    .line 255
    :cond_e
    invoke-static {v13, v10, v13, v12}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 256
    .line 257
    .line 258
    :cond_f
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 259
    .line 260
    .line 261
    move-result-object v3

    .line 262
    invoke-static {v10, v5, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 263
    .line 264
    .line 265
    sget-object v3, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 266
    .line 267
    sget-object v10, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 268
    .line 269
    const/4 v3, 0x0

    .line 270
    const/4 v5, 0x0

    .line 271
    invoke-static {v10, v3, v0, v5}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 272
    .line 273
    .line 274
    move-result-object v12

    .line 275
    invoke-static {v12, v3, v0, v5}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 276
    .line 277
    .line 278
    move-result-object v3

    .line 279
    sget-object v5, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 280
    .line 281
    invoke-virtual {v5}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 282
    .line 283
    .line 284
    move-result-wide v12

    .line 285
    const/4 v5, 0x4

    .line 286
    int-to-float v14, v5

    .line 287
    invoke-static {v14, v3, v12, v13}, Landroidx/compose/material3/c;->f(FLandroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    .line 288
    .line 289
    .line 290
    move-result-object v17

    .line 291
    const/4 v3, 0x0

    .line 292
    invoke-static {v3, v6, v3, v0}, Landroidx/compose/foundation/ScrollKt;->rememberScrollState(ILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/ScrollState;

    .line 293
    .line 294
    .line 295
    move-result-object v18

    .line 296
    const/16 v22, 0xe

    .line 297
    .line 298
    const/16 v23, 0x0

    .line 299
    .line 300
    const/16 v19, 0x0

    .line 301
    .line 302
    const/16 v20, 0x0

    .line 303
    .line 304
    const/16 v21, 0x0

    .line 305
    .line 306
    invoke-static/range {v17 .. v23}, Landroidx/compose/foundation/ScrollKt;->verticalScroll$default(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    const/16 v3, 0x18

    .line 311
    .line 312
    int-to-float v3, v3

    .line 313
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 314
    .line 315
    .line 316
    move-result v3

    .line 317
    const/16 v5, 0x14

    .line 318
    .line 319
    int-to-float v12, v5

    .line 320
    invoke-static {v12}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 321
    .line 322
    .line 323
    move-result v5

    .line 324
    invoke-static {v0, v3, v5}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    sget-object v3, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 329
    .line 330
    invoke-virtual {v3}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 331
    .line 332
    .line 333
    move-result-object v3

    .line 334
    invoke-virtual {v11}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 335
    .line 336
    .line 337
    move-result-object v5

    .line 338
    const/4 v11, 0x0

    .line 339
    invoke-static {v3, v5, v6, v11}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 340
    .line 341
    .line 342
    move-result-object v3

    .line 343
    invoke-static {v6, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 344
    .line 345
    .line 346
    move-result v5

    .line 347
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 348
    .line 349
    .line 350
    move-result-object v11

    .line 351
    invoke-static {v6, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 356
    .line 357
    .line 358
    move-result-object v13

    .line 359
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 360
    .line 361
    .line 362
    move-result-object v14

    .line 363
    if-nez v14, :cond_10

    .line 364
    .line 365
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 366
    .line 367
    .line 368
    :cond_10
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 369
    .line 370
    .line 371
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 372
    .line 373
    .line 374
    move-result v14

    .line 375
    if-eqz v14, :cond_11

    .line 376
    .line 377
    invoke-interface {v6, v13}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 378
    .line 379
    .line 380
    goto :goto_a

    .line 381
    :cond_11
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 382
    .line 383
    .line 384
    :goto_a
    invoke-static {v6}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 385
    .line 386
    .line 387
    move-result-object v13

    .line 388
    invoke-static {v15, v13, v3, v13, v11}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 389
    .line 390
    .line 391
    move-result-object v3

    .line 392
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 393
    .line 394
    .line 395
    move-result v11

    .line 396
    if-nez v11, :cond_12

    .line 397
    .line 398
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v11

    .line 402
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 403
    .line 404
    .line 405
    move-result-object v14

    .line 406
    invoke-static {v11, v14}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    move-result v11

    .line 410
    if-nez v11, :cond_13

    .line 411
    .line 412
    :cond_12
    invoke-static {v5, v13, v5, v3}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 413
    .line 414
    .line 415
    :cond_13
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 416
    .line 417
    .line 418
    move-result-object v3

    .line 419
    invoke-static {v13, v0, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 420
    .line 421
    .line 422
    sget-object v0, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 423
    .line 424
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    sget-object v11, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 429
    .line 430
    invoke-virtual {v11}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v3

    .line 434
    if-ne v0, v3, :cond_14

    .line 435
    .line 436
    new-instance v0, Lcom/zykj/mistake/feature/collection/component/j;

    .line 437
    .line 438
    const/4 v5, 0x4

    .line 439
    invoke-direct {v0, v5}, Lcom/zykj/mistake/feature/collection/component/j;-><init>(I)V

    .line 440
    .line 441
    .line 442
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 443
    .line 444
    .line 445
    :cond_14
    check-cast v0, Lr6/c;

    .line 446
    .line 447
    shl-int/lit8 v13, v2, 0x3

    .line 448
    .line 449
    and-int/lit8 v3, v13, 0x70

    .line 450
    .line 451
    const v5, 0x30186

    .line 452
    .line 453
    .line 454
    or-int v14, v3, v5

    .line 455
    .line 456
    const/4 v15, 0x6

    .line 457
    shl-int/2addr v2, v15

    .line 458
    and-int/lit16 v2, v2, 0x1c00

    .line 459
    .line 460
    or-int/2addr v2, v14

    .line 461
    const v3, 0xe000

    .line 462
    .line 463
    .line 464
    and-int v16, v13, v3

    .line 465
    .line 466
    or-int v2, v2, v16

    .line 467
    .line 468
    move v7, v2

    .line 469
    move-object v2, v0

    .line 470
    const-string v0, "\u539f\u7b54\u6848"

    .line 471
    .line 472
    const/4 v5, 0x1

    .line 473
    move-object v3, v4

    .line 474
    move-object/from16 v4, p3

    .line 475
    .line 476
    invoke-static/range {v0 .. v7}, Lcom/zykj/mistake/feature/notebook/detail/t;->d(Ljava/lang/String;Ljava/util/List;Lr6/c;Lcom/zykj/mistake/feature/notebook/detail/p0;Lr6/c;ZLandroidx/compose/runtime/Composer;I)V

    .line 477
    .line 478
    .line 479
    invoke-static {v12}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 480
    .line 481
    .line 482
    move-result v0

    .line 483
    invoke-static {v10, v0}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    invoke-static {v0, v6, v15}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 488
    .line 489
    .line 490
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    invoke-virtual {v11}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v1

    .line 498
    if-ne v0, v1, :cond_15

    .line 499
    .line 500
    new-instance v0, Lcom/zykj/mistake/feature/collection/component/j;

    .line 501
    .line 502
    const/4 v1, 0x5

    .line 503
    invoke-direct {v0, v1}, Lcom/zykj/mistake/feature/collection/component/j;-><init>(I)V

    .line 504
    .line 505
    .line 506
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 507
    .line 508
    .line 509
    :cond_15
    move-object v2, v0

    .line 510
    check-cast v2, Lr6/c;

    .line 511
    .line 512
    and-int/lit16 v0, v13, 0x1c00

    .line 513
    .line 514
    or-int/2addr v0, v14

    .line 515
    or-int v7, v0, v16

    .line 516
    .line 517
    const-string v0, "\u8ba2\u6b63\u7b54\u6848"

    .line 518
    .line 519
    const/4 v5, 0x0

    .line 520
    move-object/from16 v1, p0

    .line 521
    .line 522
    move-object/from16 v4, p3

    .line 523
    .line 524
    move-object v3, v9

    .line 525
    invoke-static/range {v0 .. v7}, Lcom/zykj/mistake/feature/notebook/detail/t;->d(Ljava/lang/String;Ljava/util/List;Lr6/c;Lcom/zykj/mistake/feature/notebook/detail/p0;Lr6/c;ZLandroidx/compose/runtime/Composer;I)V

    .line 526
    .line 527
    .line 528
    invoke-static {v6}, Landroidx/collection/a;->D(Landroidx/compose/runtime/Composer;)Z

    .line 529
    .line 530
    .line 531
    move-result v0

    .line 532
    if-eqz v0, :cond_17

    .line 533
    .line 534
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 535
    .line 536
    .line 537
    goto :goto_b

    .line 538
    :cond_16
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 539
    .line 540
    .line 541
    :cond_17
    :goto_b
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 542
    .line 543
    .line 544
    move-result-object v7

    .line 545
    if-eqz v7, :cond_18

    .line 546
    .line 547
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/h;

    .line 548
    .line 549
    move-object/from16 v1, p0

    .line 550
    .line 551
    move-object/from16 v2, p1

    .line 552
    .line 553
    move-object/from16 v3, p2

    .line 554
    .line 555
    move-object/from16 v4, p3

    .line 556
    .line 557
    move-object/from16 v5, p4

    .line 558
    .line 559
    move v6, v8

    .line 560
    invoke-direct/range {v0 .. v6}, Lcom/zykj/mistake/feature/notebook/detail/h;-><init>(Ljava/util/List;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/p0;Lr6/c;Landroidx/compose/ui/Modifier;I)V

    .line 561
    .line 562
    .line 563
    invoke-interface {v7, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 564
    .line 565
    .line 566
    :cond_18
    return-void
.end method

.method public static final m(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 11

    .line 1
    const-string v0, "imageUrl"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const v0, 0x49b29d4

    .line 7
    .line 8
    .line 9
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 10
    .line 11
    .line 12
    move-result-object v6

    .line 13
    and-int/lit8 p2, p3, 0x6

    .line 14
    .line 15
    const/4 v8, 0x2

    .line 16
    if-nez p2, :cond_1

    .line 17
    .line 18
    invoke-interface {v6, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    if-eqz p2, :cond_0

    .line 23
    .line 24
    const/4 p2, 0x4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move p2, v8

    .line 27
    :goto_0
    or-int/2addr p2, p3

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move p2, p3

    .line 30
    :goto_1
    and-int/lit8 v1, p3, 0x30

    .line 31
    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    invoke-interface {v6, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    const/16 v1, 0x20

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_2
    const/16 v1, 0x10

    .line 44
    .line 45
    :goto_2
    or-int/2addr p2, v1

    .line 46
    :cond_3
    and-int/lit8 v1, p2, 0x13

    .line 47
    .line 48
    const/16 v2, 0x12

    .line 49
    .line 50
    const/4 v3, 0x0

    .line 51
    const/4 v4, 0x1

    .line 52
    if-eq v1, v2, :cond_4

    .line 53
    .line 54
    move v1, v4

    .line 55
    goto :goto_3

    .line 56
    :cond_4
    move v1, v3

    .line 57
    :goto_3
    and-int/lit8 v2, p2, 0x1

    .line 58
    .line 59
    invoke-interface {v6, v1, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_b

    .line 64
    .line 65
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_5

    .line 70
    .line 71
    const/4 v1, -0x1

    .line 72
    const-string v2, "com.zykj.mistake.feature.notebook.detail.SupplementCardImage (MistakeDetailAnswerPanel.kt:515)"

    .line 73
    .line 74
    invoke-static {v0, p2, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 75
    .line 76
    .line 77
    :cond_5
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 82
    .line 83
    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    if-ne v0, v1, :cond_6

    .line 88
    .line 89
    new-instance v0, Lcom/zykj/mistake/feature/collection/component/j;

    .line 90
    .line 91
    const/16 v1, 0x8

    .line 92
    .line 93
    invoke-direct {v0, v1}, Lcom/zykj/mistake/feature/collection/component/j;-><init>(I)V

    .line 94
    .line 95
    .line 96
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :cond_6
    check-cast v0, Lr6/c;

    .line 100
    .line 101
    invoke-static {p1, v0}, Landroidx/compose/ui/draw/DrawModifierKt;->drawBehind(Landroidx/compose/ui/Modifier;Lr6/c;)Landroidx/compose/ui/Modifier;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    int-to-float v1, v4

    .line 106
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/PaddingKt;->padding-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    sget-object v1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 115
    .line 116
    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-static {v6, v3}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    invoke-static {v6, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    sget-object v7, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 137
    .line 138
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 139
    .line 140
    .line 141
    move-result-object v9

    .line 142
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 143
    .line 144
    .line 145
    move-result-object v10

    .line 146
    if-nez v10, :cond_7

    .line 147
    .line 148
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 149
    .line 150
    .line 151
    :cond_7
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 152
    .line 153
    .line 154
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 155
    .line 156
    .line 157
    move-result v10

    .line 158
    if-eqz v10, :cond_8

    .line 159
    .line 160
    invoke-interface {v6, v9}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 161
    .line 162
    .line 163
    goto :goto_4

    .line 164
    :cond_8
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 165
    .line 166
    .line 167
    :goto_4
    invoke-static {v6}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 168
    .line 169
    .line 170
    move-result-object v9

    .line 171
    invoke-static {v7, v9, v1, v9, v5}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 176
    .line 177
    .line 178
    move-result v5

    .line 179
    if-nez v5, :cond_9

    .line 180
    .line 181
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 186
    .line 187
    .line 188
    move-result-object v10

    .line 189
    invoke-static {v5, v10}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    if-nez v5, :cond_a

    .line 194
    .line 195
    :cond_9
    invoke-static {v2, v9, v2, v1}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 196
    .line 197
    .line 198
    :cond_a
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    invoke-static {v9, v0, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 203
    .line 204
    .line 205
    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 206
    .line 207
    sget-object v0, Lcom/zykj/mistake/utils/e;->a:Lcom/zykj/mistake/utils/e;

    .line 208
    .line 209
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    check-cast v1, Landroid/content/Context;

    .line 218
    .line 219
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/utils/e;->a(Landroid/content/Context;)Lcoil3/n;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    sget-object v0, Landroidx/compose/ui/layout/ContentScale;->Companion:Landroidx/compose/ui/layout/ContentScale$Companion;

    .line 224
    .line 225
    invoke-virtual {v0}, Landroidx/compose/ui/layout/ContentScale$Companion;->getFit()Landroidx/compose/ui/layout/ContentScale;

    .line 226
    .line 227
    .line 228
    move-result-object v5

    .line 229
    sget v0, Lcom/zykj/mistake/R$mipmap;->pic_error:I

    .line 230
    .line 231
    invoke-static {v0, v6, v3}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 236
    .line 237
    const/4 v3, 0x0

    .line 238
    const/4 v7, 0x0

    .line 239
    invoke-static {v1, v3, v4, v7}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    and-int/lit8 p2, p2, 0xe

    .line 244
    .line 245
    or-int/lit16 v7, p2, 0xc30

    .line 246
    .line 247
    move-object v1, p0

    .line 248
    move-object v4, v0

    .line 249
    invoke-static/range {v1 .. v7}, Lcoil3/compose/b;->b(Ljava/lang/Object;Lcoil3/n;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/runtime/Composer;I)V

    .line 250
    .line 251
    .line 252
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 253
    .line 254
    .line 255
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 256
    .line 257
    .line 258
    move-result p0

    .line 259
    if-eqz p0, :cond_c

    .line 260
    .line 261
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 262
    .line 263
    .line 264
    goto :goto_5

    .line 265
    :cond_b
    move-object v1, p0

    .line 266
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 267
    .line 268
    .line 269
    :cond_c
    :goto_5
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 270
    .line 271
    .line 272
    move-result-object p0

    .line 273
    if-eqz p0, :cond_d

    .line 274
    .line 275
    new-instance p2, Lcom/zykj/mistake/feature/ask/j0;

    .line 276
    .line 277
    invoke-direct {p2, v1, p1, p3, v8}, Lcom/zykj/mistake/feature/ask/j0;-><init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;II)V

    .line 278
    .line 279
    .line 280
    invoke-interface {p0, p2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 281
    .line 282
    .line 283
    :cond_d
    return-void
.end method

.method public static final n(Lcom/zykj/mistake/feature/notebook/detail/n3;Lr6/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move/from16 v4, p4

    .line 8
    .line 9
    iget-object v6, v1, Lcom/zykj/mistake/feature/notebook/detail/n3;->e:Ljava/util/List;

    .line 10
    .line 11
    iget-object v7, v1, Lcom/zykj/mistake/feature/notebook/detail/n3;->d:Ljava/util/List;

    .line 12
    .line 13
    iget-object v8, v1, Lcom/zykj/mistake/feature/notebook/detail/n3;->c:Ljava/util/List;

    .line 14
    .line 15
    iget-object v9, v1, Lcom/zykj/mistake/feature/notebook/detail/n3;->b:Ljava/util/List;

    .line 16
    .line 17
    iget-object v10, v1, Lcom/zykj/mistake/feature/notebook/detail/n3;->a:Ljava/util/List;

    .line 18
    .line 19
    const v0, -0x5251d7c6

    .line 20
    .line 21
    .line 22
    move-object/from16 v5, p3

    .line 23
    .line 24
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 25
    .line 26
    .line 27
    move-result-object v11

    .line 28
    and-int/lit8 v5, v4, 0x6

    .line 29
    .line 30
    if-nez v5, :cond_1

    .line 31
    .line 32
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-eqz v5, :cond_0

    .line 37
    .line 38
    const/4 v5, 0x4

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/4 v5, 0x2

    .line 41
    :goto_0
    or-int/2addr v5, v4

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move v5, v4

    .line 44
    :goto_1
    and-int/lit8 v12, v4, 0x30

    .line 45
    .line 46
    const/16 v13, 0x10

    .line 47
    .line 48
    if-nez v12, :cond_3

    .line 49
    .line 50
    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v12

    .line 54
    if-eqz v12, :cond_2

    .line 55
    .line 56
    const/16 v12, 0x20

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    move v12, v13

    .line 60
    :goto_2
    or-int/2addr v5, v12

    .line 61
    :cond_3
    and-int/lit16 v12, v4, 0x180

    .line 62
    .line 63
    if-nez v12, :cond_5

    .line 64
    .line 65
    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v12

    .line 69
    if-eqz v12, :cond_4

    .line 70
    .line 71
    const/16 v12, 0x100

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_4
    const/16 v12, 0x80

    .line 75
    .line 76
    :goto_3
    or-int/2addr v5, v12

    .line 77
    :cond_5
    move v12, v5

    .line 78
    and-int/lit16 v5, v12, 0x93

    .line 79
    .line 80
    const/16 v15, 0x92

    .line 81
    .line 82
    const/4 v14, 0x0

    .line 83
    if-eq v5, v15, :cond_6

    .line 84
    .line 85
    const/4 v5, 0x1

    .line 86
    goto :goto_4

    .line 87
    :cond_6
    move v5, v14

    .line 88
    :goto_4
    and-int/lit8 v15, v12, 0x1

    .line 89
    .line 90
    invoke-interface {v11, v5, v15}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    if-eqz v5, :cond_21

    .line 95
    .line 96
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    if-eqz v5, :cond_7

    .line 101
    .line 102
    const/4 v5, -0x1

    .line 103
    const-string v15, "com.zykj.mistake.feature.notebook.detail.SupplementContent (MistakeDetailAnswerPanel.kt:271)"

    .line 104
    .line 105
    invoke-static {v0, v12, v5, v15}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 106
    .line 107
    .line 108
    :cond_7
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    const/4 v15, 0x6

    .line 113
    if-eqz v0, :cond_9

    .line 114
    .line 115
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-eqz v0, :cond_9

    .line 120
    .line 121
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-eqz v0, :cond_9

    .line 126
    .line 127
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-eqz v0, :cond_9

    .line 132
    .line 133
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-eqz v0, :cond_9

    .line 138
    .line 139
    const v0, 0x5de2d3de

    .line 140
    .line 141
    .line 142
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 143
    .line 144
    .line 145
    shr-int/lit8 v0, v12, 0x6

    .line 146
    .line 147
    and-int/lit8 v0, v0, 0xe

    .line 148
    .line 149
    invoke-static {v3, v11, v0}, Lcom/zykj/mistake/feature/notebook/detail/t;->o(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 150
    .line 151
    .line 152
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 153
    .line 154
    .line 155
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-eqz v0, :cond_8

    .line 160
    .line 161
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 162
    .line 163
    .line 164
    :cond_8
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    if-eqz v6, :cond_23

    .line 169
    .line 170
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/g;

    .line 171
    .line 172
    const/4 v5, 0x1

    .line 173
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/notebook/detail/g;-><init>(Lcom/zykj/mistake/feature/notebook/detail/n3;Lr6/c;Landroidx/compose/ui/Modifier;II)V

    .line 174
    .line 175
    .line 176
    :goto_5
    invoke-interface {v6, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :cond_9
    const v0, 0x5d511de8

    .line 181
    .line 182
    .line 183
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 184
    .line 185
    .line 186
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 187
    .line 188
    .line 189
    const-wide v0, 0xfff5f7faL

    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 195
    .line 196
    .line 197
    move-result-wide v1

    .line 198
    const/4 v4, 0x2

    .line 199
    const/4 v5, 0x0

    .line 200
    const/4 v3, 0x0

    .line 201
    move-object/from16 v0, p2

    .line 202
    .line 203
    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    int-to-float v0, v13

    .line 208
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/PaddingKt;->padding-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    sget-object v1, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 217
    .line 218
    invoke-virtual {v1}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    sget-object v3, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 223
    .line 224
    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 225
    .line 226
    .line 227
    move-result-object v4

    .line 228
    invoke-static {v2, v4, v11, v14}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    invoke-static {v11, v14}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 233
    .line 234
    .line 235
    move-result v4

    .line 236
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    invoke-static {v11, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    sget-object v13, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 245
    .line 246
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 247
    .line 248
    .line 249
    move-result-object v14

    .line 250
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 251
    .line 252
    .line 253
    move-result-object v16

    .line 254
    if-nez v16, :cond_a

    .line 255
    .line 256
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 257
    .line 258
    .line 259
    :cond_a
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 260
    .line 261
    .line 262
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 263
    .line 264
    .line 265
    move-result v16

    .line 266
    if-eqz v16, :cond_b

    .line 267
    .line 268
    invoke-interface {v11, v14}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 269
    .line 270
    .line 271
    goto :goto_6

    .line 272
    :cond_b
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 273
    .line 274
    .line 275
    :goto_6
    invoke-static {v11}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 276
    .line 277
    .line 278
    move-result-object v14

    .line 279
    invoke-static {v13, v14, v2, v14, v5}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 284
    .line 285
    .line 286
    move-result v5

    .line 287
    if-nez v5, :cond_c

    .line 288
    .line 289
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v5

    .line 293
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 294
    .line 295
    .line 296
    move-result-object v15

    .line 297
    invoke-static {v5, v15}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result v5

    .line 301
    if-nez v5, :cond_d

    .line 302
    .line 303
    :cond_c
    invoke-static {v4, v14, v4, v2}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 304
    .line 305
    .line 306
    :cond_d
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 307
    .line 308
    .line 309
    move-result-object v2

    .line 310
    invoke-static {v14, v0, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 311
    .line 312
    .line 313
    sget-object v0, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 314
    .line 315
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 316
    .line 317
    const/4 v2, 0x0

    .line 318
    const/4 v4, 0x0

    .line 319
    const/4 v5, 0x1

    .line 320
    invoke-static {v0, v2, v5, v4}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    sget-object v2, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 325
    .line 326
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 327
    .line 328
    .line 329
    move-result-wide v14

    .line 330
    const/4 v2, 0x6

    .line 331
    int-to-float v2, v2

    .line 332
    invoke-static {v2, v0, v14, v15}, Landroidx/compose/material3/c;->f(FLandroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    .line 333
    .line 334
    .line 335
    move-result-object v16

    .line 336
    const/4 v0, 0x0

    .line 337
    invoke-static {v0, v11, v0, v5}, Landroidx/compose/foundation/ScrollKt;->rememberScrollState(ILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/ScrollState;

    .line 338
    .line 339
    .line 340
    move-result-object v17

    .line 341
    const/16 v21, 0xe

    .line 342
    .line 343
    const/16 v22, 0x0

    .line 344
    .line 345
    const/16 v18, 0x0

    .line 346
    .line 347
    const/16 v19, 0x0

    .line 348
    .line 349
    const/16 v20, 0x0

    .line 350
    .line 351
    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/ScrollKt;->verticalScroll$default(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    const/16 v2, 0x16

    .line 356
    .line 357
    int-to-float v4, v2

    .line 358
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 359
    .line 360
    .line 361
    move-result v14

    .line 362
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 363
    .line 364
    .line 365
    move-result v4

    .line 366
    invoke-static {v0, v14, v4}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    invoke-virtual {v1}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 371
    .line 372
    .line 373
    move-result-object v1

    .line 374
    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 375
    .line 376
    .line 377
    move-result-object v3

    .line 378
    const/4 v4, 0x0

    .line 379
    invoke-static {v1, v3, v11, v4}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    invoke-static {v11, v4}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 384
    .line 385
    .line 386
    move-result v3

    .line 387
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 388
    .line 389
    .line 390
    move-result-object v4

    .line 391
    invoke-static {v11, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 396
    .line 397
    .line 398
    move-result-object v14

    .line 399
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 400
    .line 401
    .line 402
    move-result-object v15

    .line 403
    if-nez v15, :cond_e

    .line 404
    .line 405
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 406
    .line 407
    .line 408
    :cond_e
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 409
    .line 410
    .line 411
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 412
    .line 413
    .line 414
    move-result v15

    .line 415
    if-eqz v15, :cond_f

    .line 416
    .line 417
    invoke-interface {v11, v14}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 418
    .line 419
    .line 420
    goto :goto_7

    .line 421
    :cond_f
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 422
    .line 423
    .line 424
    :goto_7
    invoke-static {v11}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 425
    .line 426
    .line 427
    move-result-object v14

    .line 428
    invoke-static {v13, v14, v1, v14, v4}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 429
    .line 430
    .line 431
    move-result-object v1

    .line 432
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 433
    .line 434
    .line 435
    move-result v4

    .line 436
    if-nez v4, :cond_10

    .line 437
    .line 438
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v4

    .line 442
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 443
    .line 444
    .line 445
    move-result-object v15

    .line 446
    invoke-static {v4, v15}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 447
    .line 448
    .line 449
    move-result v4

    .line 450
    if-nez v4, :cond_11

    .line 451
    .line 452
    :cond_10
    invoke-static {v3, v14, v3, v1}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 453
    .line 454
    .line 455
    :cond_11
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 456
    .line 457
    .line 458
    move-result-object v1

    .line 459
    invoke-static {v14, v0, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 460
    .line 461
    .line 462
    sget v0, Lcom/zykj/mistake/R$string;->answer_micro_class:I

    .line 463
    .line 464
    const/4 v4, 0x0

    .line 465
    invoke-static {v0, v11, v4}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    and-int/lit8 v1, v12, 0x70

    .line 470
    .line 471
    const/16 v3, 0x20

    .line 472
    .line 473
    if-ne v1, v3, :cond_12

    .line 474
    .line 475
    move v3, v5

    .line 476
    goto :goto_8

    .line 477
    :cond_12
    const/4 v3, 0x0

    .line 478
    :goto_8
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v4

    .line 482
    if-nez v3, :cond_14

    .line 483
    .line 484
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 485
    .line 486
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v3

    .line 490
    if-ne v4, v3, :cond_13

    .line 491
    .line 492
    goto :goto_9

    .line 493
    :cond_13
    move-object/from16 v12, p1

    .line 494
    .line 495
    goto :goto_a

    .line 496
    :cond_14
    :goto_9
    new-instance v4, Lcom/zykj/mistake/feature/collection/detail/a1;

    .line 497
    .line 498
    const/16 v3, 0x19

    .line 499
    .line 500
    move-object/from16 v12, p1

    .line 501
    .line 502
    invoke-direct {v4, v12, v3}, Lcom/zykj/mistake/feature/collection/detail/a1;-><init>(Lr6/c;I)V

    .line 503
    .line 504
    .line 505
    invoke-interface {v11, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 506
    .line 507
    .line 508
    :goto_a
    check-cast v4, Lr6/c;

    .line 509
    .line 510
    const/4 v3, 0x0

    .line 511
    invoke-static {v0, v10, v4, v11, v3}, Lcom/zykj/mistake/feature/notebook/detail/t;->q(Ljava/lang/String;Ljava/util/List;Lr6/c;Landroidx/compose/runtime/Composer;I)V

    .line 512
    .line 513
    .line 514
    sget v0, Lcom/zykj/mistake/R$string;->one_to_one_micro_class:I

    .line 515
    .line 516
    invoke-static {v0, v11, v3}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    const/16 v3, 0x20

    .line 521
    .line 522
    if-ne v1, v3, :cond_15

    .line 523
    .line 524
    move v3, v5

    .line 525
    goto :goto_b

    .line 526
    :cond_15
    const/4 v3, 0x0

    .line 527
    :goto_b
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object v4

    .line 531
    if-nez v3, :cond_16

    .line 532
    .line 533
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 534
    .line 535
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v3

    .line 539
    if-ne v4, v3, :cond_17

    .line 540
    .line 541
    :cond_16
    new-instance v4, Lcom/zykj/mistake/feature/collection/detail/a1;

    .line 542
    .line 543
    const/16 v3, 0x1a

    .line 544
    .line 545
    invoke-direct {v4, v12, v3}, Lcom/zykj/mistake/feature/collection/detail/a1;-><init>(Lr6/c;I)V

    .line 546
    .line 547
    .line 548
    invoke-interface {v11, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 549
    .line 550
    .line 551
    :cond_17
    check-cast v4, Lr6/c;

    .line 552
    .line 553
    const/4 v3, 0x0

    .line 554
    invoke-static {v0, v9, v4, v11, v3}, Lcom/zykj/mistake/feature/notebook/detail/t;->q(Ljava/lang/String;Ljava/util/List;Lr6/c;Landroidx/compose/runtime/Composer;I)V

    .line 555
    .line 556
    .line 557
    sget v0, Lcom/zykj/mistake/R$string;->revised_micro_class:I

    .line 558
    .line 559
    invoke-static {v0, v11, v3}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    const/16 v3, 0x20

    .line 564
    .line 565
    if-ne v1, v3, :cond_18

    .line 566
    .line 567
    move v3, v5

    .line 568
    goto :goto_c

    .line 569
    :cond_18
    const/4 v3, 0x0

    .line 570
    :goto_c
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object v4

    .line 574
    if-nez v3, :cond_19

    .line 575
    .line 576
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 577
    .line 578
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    move-result-object v3

    .line 582
    if-ne v4, v3, :cond_1a

    .line 583
    .line 584
    :cond_19
    new-instance v4, Lcom/zykj/mistake/feature/collection/detail/a1;

    .line 585
    .line 586
    const/16 v3, 0x15

    .line 587
    .line 588
    invoke-direct {v4, v12, v3}, Lcom/zykj/mistake/feature/collection/detail/a1;-><init>(Lr6/c;I)V

    .line 589
    .line 590
    .line 591
    invoke-interface {v11, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 592
    .line 593
    .line 594
    :cond_1a
    check-cast v4, Lr6/c;

    .line 595
    .line 596
    const/4 v3, 0x0

    .line 597
    invoke-static {v0, v8, v4, v11, v3}, Lcom/zykj/mistake/feature/notebook/detail/t;->q(Ljava/lang/String;Ljava/util/List;Lr6/c;Landroidx/compose/runtime/Composer;I)V

    .line 598
    .line 599
    .line 600
    sget v0, Lcom/zykj/mistake/R$string;->typical_right:I

    .line 601
    .line 602
    invoke-static {v0, v11, v3}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    const/16 v3, 0x20

    .line 607
    .line 608
    if-ne v1, v3, :cond_1b

    .line 609
    .line 610
    move v3, v5

    .line 611
    goto :goto_d

    .line 612
    :cond_1b
    const/4 v3, 0x0

    .line 613
    :goto_d
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 614
    .line 615
    .line 616
    move-result-object v4

    .line 617
    if-nez v3, :cond_1c

    .line 618
    .line 619
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 620
    .line 621
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 622
    .line 623
    .line 624
    move-result-object v3

    .line 625
    if-ne v4, v3, :cond_1d

    .line 626
    .line 627
    :cond_1c
    new-instance v4, Lcom/zykj/mistake/feature/collection/detail/a1;

    .line 628
    .line 629
    invoke-direct {v4, v12, v2}, Lcom/zykj/mistake/feature/collection/detail/a1;-><init>(Lr6/c;I)V

    .line 630
    .line 631
    .line 632
    invoke-interface {v11, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 633
    .line 634
    .line 635
    :cond_1d
    check-cast v4, Lr6/c;

    .line 636
    .line 637
    const/4 v3, 0x0

    .line 638
    invoke-static {v0, v7, v4, v11, v3}, Lcom/zykj/mistake/feature/notebook/detail/t;->t(Ljava/lang/String;Ljava/util/List;Lr6/c;Landroidx/compose/runtime/Composer;I)V

    .line 639
    .line 640
    .line 641
    sget v0, Lcom/zykj/mistake/R$string;->typical_wrong:I

    .line 642
    .line 643
    invoke-static {v0, v11, v3}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 644
    .line 645
    .line 646
    move-result-object v0

    .line 647
    const/16 v3, 0x20

    .line 648
    .line 649
    if-ne v1, v3, :cond_1e

    .line 650
    .line 651
    move v14, v5

    .line 652
    goto :goto_e

    .line 653
    :cond_1e
    const/4 v14, 0x0

    .line 654
    :goto_e
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 655
    .line 656
    .line 657
    move-result-object v1

    .line 658
    if-nez v14, :cond_1f

    .line 659
    .line 660
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 661
    .line 662
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 663
    .line 664
    .line 665
    move-result-object v2

    .line 666
    if-ne v1, v2, :cond_20

    .line 667
    .line 668
    :cond_1f
    new-instance v1, Lcom/zykj/mistake/feature/collection/detail/a1;

    .line 669
    .line 670
    const/16 v2, 0x17

    .line 671
    .line 672
    invoke-direct {v1, v12, v2}, Lcom/zykj/mistake/feature/collection/detail/a1;-><init>(Lr6/c;I)V

    .line 673
    .line 674
    .line 675
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 676
    .line 677
    .line 678
    :cond_20
    check-cast v1, Lr6/c;

    .line 679
    .line 680
    const/4 v3, 0x0

    .line 681
    invoke-static {v0, v6, v1, v11, v3}, Lcom/zykj/mistake/feature/notebook/detail/t;->t(Ljava/lang/String;Ljava/util/List;Lr6/c;Landroidx/compose/runtime/Composer;I)V

    .line 682
    .line 683
    .line 684
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 685
    .line 686
    .line 687
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 688
    .line 689
    .line 690
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 691
    .line 692
    .line 693
    move-result v0

    .line 694
    if-eqz v0, :cond_22

    .line 695
    .line 696
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 697
    .line 698
    .line 699
    goto :goto_f

    .line 700
    :cond_21
    move-object v12, v2

    .line 701
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 702
    .line 703
    .line 704
    :cond_22
    :goto_f
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 705
    .line 706
    .line 707
    move-result-object v6

    .line 708
    if-eqz v6, :cond_23

    .line 709
    .line 710
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/g;

    .line 711
    .line 712
    const/4 v5, 0x0

    .line 713
    move-object/from16 v1, p0

    .line 714
    .line 715
    move-object/from16 v3, p2

    .line 716
    .line 717
    move/from16 v4, p4

    .line 718
    .line 719
    move-object v2, v12

    .line 720
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/notebook/detail/g;-><init>(Lcom/zykj/mistake/feature/notebook/detail/n3;Lr6/c;Landroidx/compose/ui/Modifier;II)V

    .line 721
    .line 722
    .line 723
    goto/16 :goto_5

    .line 724
    .line 725
    :cond_23
    return-void
.end method

.method public static final o(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v6, p2

    .line 4
    .line 5
    const v1, -0x40bd6a8a

    .line 6
    .line 7
    .line 8
    move-object/from16 v2, p1

    .line 9
    .line 10
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v14

    .line 14
    and-int/lit8 v2, v6, 0x6

    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    if-nez v2, :cond_1

    .line 18
    .line 19
    invoke-interface {v14, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    const/4 v2, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v2, v3

    .line 28
    :goto_0
    or-int/2addr v2, v6

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move v2, v6

    .line 31
    :goto_1
    and-int/lit8 v4, v2, 0x3

    .line 32
    .line 33
    const/4 v7, 0x0

    .line 34
    const/4 v8, 0x1

    .line 35
    if-eq v4, v3, :cond_2

    .line 36
    .line 37
    move v3, v8

    .line 38
    goto :goto_2

    .line 39
    :cond_2
    move v3, v7

    .line 40
    :goto_2
    and-int/lit8 v4, v2, 0x1

    .line 41
    .line 42
    invoke-interface {v14, v3, v4}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_8

    .line 47
    .line 48
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_3

    .line 53
    .line 54
    const/4 v3, -0x1

    .line 55
    const-string v4, "com.zykj.mistake.feature.notebook.detail.SupplementEmptyContent (MistakeDetailAnswerPanel.kt:335)"

    .line 56
    .line 57
    invoke-static {v1, v2, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 58
    .line 59
    .line 60
    :cond_3
    const-wide v1, 0xfff5f7faL

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 66
    .line 67
    .line 68
    move-result-wide v1

    .line 69
    const/4 v4, 0x2

    .line 70
    const/4 v5, 0x0

    .line 71
    const/4 v3, 0x0

    .line 72
    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    sget-object v2, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 77
    .line 78
    invoke-virtual {v2}, Landroidx/compose/ui/Alignment$Companion;->getCenterHorizontally()Landroidx/compose/ui/Alignment$Horizontal;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    sget-object v3, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 83
    .line 84
    invoke-virtual {v3}, Landroidx/compose/foundation/layout/Arrangement;->getCenter()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    const/16 v4, 0x36

    .line 89
    .line 90
    invoke-static {v3, v2, v14, v4}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-static {v14, v7}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-static {v14, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    sget-object v5, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 107
    .line 108
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 109
    .line 110
    .line 111
    move-result-object v9

    .line 112
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 113
    .line 114
    .line 115
    move-result-object v10

    .line 116
    if-nez v10, :cond_4

    .line 117
    .line 118
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 119
    .line 120
    .line 121
    :cond_4
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 122
    .line 123
    .line 124
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 125
    .line 126
    .line 127
    move-result v10

    .line 128
    if-eqz v10, :cond_5

    .line 129
    .line 130
    invoke-interface {v14, v9}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 131
    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_5
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 135
    .line 136
    .line 137
    :goto_3
    invoke-static {v14}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 138
    .line 139
    .line 140
    move-result-object v9

    .line 141
    invoke-static {v5, v9, v2, v9, v4}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    if-nez v4, :cond_6

    .line 150
    .line 151
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 156
    .line 157
    .line 158
    move-result-object v10

    .line 159
    invoke-static {v4, v10}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v4

    .line 163
    if-nez v4, :cond_7

    .line 164
    .line 165
    :cond_6
    invoke-static {v3, v9, v3, v2}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 166
    .line 167
    .line 168
    :cond_7
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    invoke-static {v9, v1, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 173
    .line 174
    .line 175
    sget-object v1, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 176
    .line 177
    sget v1, Lcom/zykj/mistake/R$drawable;->ic_supplementary_explanation:I

    .line 178
    .line 179
    invoke-static {v1, v14, v7}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 180
    .line 181
    .line 182
    move-result-object v7

    .line 183
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 184
    .line 185
    const/16 v2, 0x68

    .line 186
    .line 187
    int-to-float v2, v2

    .line 188
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 189
    .line 190
    .line 191
    move-result v2

    .line 192
    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 193
    .line 194
    .line 195
    move-result-object v9

    .line 196
    const/16 v15, 0x1b0

    .line 197
    .line 198
    const/16 v16, 0x78

    .line 199
    .line 200
    move v2, v8

    .line 201
    const-string v8, "\u8be5\u9898\u6ca1\u6709\u6559\u5e08\u8bb2\u89e3"

    .line 202
    .line 203
    const/4 v10, 0x0

    .line 204
    const/4 v11, 0x0

    .line 205
    const/4 v12, 0x0

    .line 206
    const/4 v13, 0x0

    .line 207
    invoke-static/range {v7 .. v16}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 208
    .line 209
    .line 210
    const/16 v3, 0x10

    .line 211
    .line 212
    int-to-float v3, v3

    .line 213
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    const/4 v3, 0x6

    .line 222
    invoke-static {v1, v14, v3}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 223
    .line 224
    .line 225
    const-wide v3, 0xff999999L

    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    invoke-static {v3, v4}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 231
    .line 232
    .line 233
    move-result-wide v9

    .line 234
    const/16 v1, 0xd

    .line 235
    .line 236
    invoke-static {v1}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 237
    .line 238
    .line 239
    move-result-wide v11

    .line 240
    const/16 v30, 0xc00

    .line 241
    .line 242
    const v31, 0x1dff2

    .line 243
    .line 244
    .line 245
    const-string v7, "\u8be5\u9898\u6ca1\u6709\u6559\u5e08\u8bb2\u89e3"

    .line 246
    .line 247
    const/4 v8, 0x0

    .line 248
    move-object/from16 v28, v14

    .line 249
    .line 250
    const/4 v14, 0x0

    .line 251
    const/4 v15, 0x0

    .line 252
    const-wide/16 v16, 0x0

    .line 253
    .line 254
    const/16 v18, 0x0

    .line 255
    .line 256
    const/16 v19, 0x0

    .line 257
    .line 258
    const-wide/16 v20, 0x0

    .line 259
    .line 260
    const/16 v22, 0x0

    .line 261
    .line 262
    const/16 v23, 0x0

    .line 263
    .line 264
    const/16 v24, 0x1

    .line 265
    .line 266
    const/16 v25, 0x0

    .line 267
    .line 268
    const/16 v26, 0x0

    .line 269
    .line 270
    const/16 v27, 0x0

    .line 271
    .line 272
    const/16 v29, 0xd86

    .line 273
    .line 274
    invoke-static/range {v7 .. v31}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 275
    .line 276
    .line 277
    move-object/from16 v14, v28

    .line 278
    .line 279
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 280
    .line 281
    .line 282
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 283
    .line 284
    .line 285
    move-result v1

    .line 286
    if-eqz v1, :cond_9

    .line 287
    .line 288
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 289
    .line 290
    .line 291
    goto :goto_4

    .line 292
    :cond_8
    move v2, v8

    .line 293
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 294
    .line 295
    .line 296
    :cond_9
    :goto_4
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    if-eqz v1, :cond_a

    .line 301
    .line 302
    new-instance v3, Lcom/zykj/mistake/feature/collection/filter/w0;

    .line 303
    .line 304
    invoke-direct {v3, v0, v6, v2}, Lcom/zykj/mistake/feature/collection/filter/w0;-><init>(Landroidx/compose/ui/Modifier;II)V

    .line 305
    .line 306
    .line 307
    invoke-interface {v1, v3}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 308
    .line 309
    .line 310
    :cond_a
    return-void
.end method

.method public static final p(Lcom/zykj/mistake/feature/notebook/detail/j3;Lr6/a;Landroidx/compose/runtime/Composer;I)V
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v5, p1

    .line 4
    .line 5
    move/from16 v8, p3

    .line 6
    .line 7
    const-string v1, "lesson"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v1, "onClick"

    .line 13
    .line 14
    invoke-static {v5, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const v1, -0x3d204c6e

    .line 18
    .line 19
    .line 20
    move-object/from16 v2, p2

    .line 21
    .line 22
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 23
    .line 24
    .line 25
    move-result-object v9

    .line 26
    and-int/lit8 v2, v8, 0x6

    .line 27
    .line 28
    const/4 v10, 0x4

    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    move v2, v10

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v2, 0x2

    .line 40
    :goto_0
    or-int/2addr v2, v8

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move v2, v8

    .line 43
    :goto_1
    and-int/lit8 v3, v8, 0x30

    .line 44
    .line 45
    if-nez v3, :cond_3

    .line 46
    .line 47
    invoke-interface {v9, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_2

    .line 52
    .line 53
    const/16 v3, 0x20

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    const/16 v3, 0x10

    .line 57
    .line 58
    :goto_2
    or-int/2addr v2, v3

    .line 59
    :cond_3
    and-int/lit8 v3, v2, 0x13

    .line 60
    .line 61
    const/16 v4, 0x12

    .line 62
    .line 63
    const/4 v12, 0x0

    .line 64
    if-eq v3, v4, :cond_4

    .line 65
    .line 66
    const/4 v3, 0x1

    .line 67
    goto :goto_3

    .line 68
    :cond_4
    move v3, v12

    .line 69
    :goto_3
    and-int/lit8 v4, v2, 0x1

    .line 70
    .line 71
    invoke-interface {v9, v3, v4}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_f

    .line 76
    .line 77
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-eqz v3, :cond_5

    .line 82
    .line 83
    const/4 v3, -0x1

    .line 84
    const-string v4, "com.zykj.mistake.feature.notebook.detail.SupplementMicroLessonCard (MistakeDetailAnswerPanel.kt:434)"

    .line 85
    .line 86
    invoke-static {v1, v2, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 87
    .line 88
    .line 89
    :cond_5
    sget-object v13, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 90
    .line 91
    sget v14, Lcom/zykj/mistake/feature/notebook/detail/t4;->o:F

    .line 92
    .line 93
    invoke-static {v13, v14}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    const/4 v6, 0x7

    .line 98
    const/4 v7, 0x0

    .line 99
    const/4 v2, 0x0

    .line 100
    const/4 v3, 0x0

    .line 101
    const/4 v4, 0x0

    .line 102
    invoke-static/range {v1 .. v7}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    sget-object v2, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 107
    .line 108
    invoke-virtual {v2}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    sget-object v3, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 113
    .line 114
    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    invoke-static {v2, v4, v9, v12}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-static {v9, v12}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    invoke-static {v9, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    sget-object v7, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 135
    .line 136
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 137
    .line 138
    .line 139
    move-result-object v15

    .line 140
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 141
    .line 142
    .line 143
    move-result-object v16

    .line 144
    if-nez v16, :cond_6

    .line 145
    .line 146
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 147
    .line 148
    .line 149
    :cond_6
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 150
    .line 151
    .line 152
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 153
    .line 154
    .line 155
    move-result v16

    .line 156
    if-eqz v16, :cond_7

    .line 157
    .line 158
    invoke-interface {v9, v15}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 159
    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_7
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 163
    .line 164
    .line 165
    :goto_4
    invoke-static {v9}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 166
    .line 167
    .line 168
    move-result-object v15

    .line 169
    invoke-static {v7, v15, v2, v15, v6}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 174
    .line 175
    .line 176
    move-result v6

    .line 177
    if-nez v6, :cond_8

    .line 178
    .line 179
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 184
    .line 185
    .line 186
    move-result-object v11

    .line 187
    invoke-static {v6, v11}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v6

    .line 191
    if-nez v6, :cond_9

    .line 192
    .line 193
    :cond_8
    invoke-static {v4, v15, v4, v2}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 194
    .line 195
    .line 196
    :cond_9
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    invoke-static {v15, v1, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 201
    .line 202
    .line 203
    sget-object v1, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 204
    .line 205
    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    invoke-static {v1, v12}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    invoke-static {v9, v12}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 214
    .line 215
    .line 216
    move-result v2

    .line 217
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    invoke-static {v9, v13}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 222
    .line 223
    .line 224
    move-result-object v6

    .line 225
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 226
    .line 227
    .line 228
    move-result-object v11

    .line 229
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 230
    .line 231
    .line 232
    move-result-object v15

    .line 233
    if-nez v15, :cond_a

    .line 234
    .line 235
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 236
    .line 237
    .line 238
    :cond_a
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 239
    .line 240
    .line 241
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 242
    .line 243
    .line 244
    move-result v15

    .line 245
    if-eqz v15, :cond_b

    .line 246
    .line 247
    invoke-interface {v9, v11}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 248
    .line 249
    .line 250
    goto :goto_5

    .line 251
    :cond_b
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 252
    .line 253
    .line 254
    :goto_5
    invoke-static {v9}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 255
    .line 256
    .line 257
    move-result-object v11

    .line 258
    invoke-static {v7, v11, v1, v11, v4}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 263
    .line 264
    .line 265
    move-result v4

    .line 266
    if-nez v4, :cond_c

    .line 267
    .line 268
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v4

    .line 272
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 273
    .line 274
    .line 275
    move-result-object v15

    .line 276
    invoke-static {v4, v15}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result v4

    .line 280
    if-nez v4, :cond_d

    .line 281
    .line 282
    :cond_c
    invoke-static {v2, v11, v2, v1}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 283
    .line 284
    .line 285
    :cond_d
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    invoke-static {v11, v6, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 290
    .line 291
    .line 292
    sget-object v1, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 293
    .line 294
    int-to-float v2, v10

    .line 295
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 296
    .line 297
    .line 298
    move-result v2

    .line 299
    invoke-static {v2}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    iget-object v4, v0, Lcom/zykj/mistake/feature/notebook/detail/j3;->b:Ljava/lang/String;

    .line 304
    .line 305
    invoke-static {v13, v14}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 306
    .line 307
    .line 308
    move-result-object v6

    .line 309
    sget v7, Lcom/zykj/mistake/feature/notebook/detail/t4;->p:F

    .line 310
    .line 311
    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 312
    .line 313
    .line 314
    move-result-object v6

    .line 315
    invoke-static {v6, v2}, Landroidx/compose/ui/draw/ClipKt;->clip(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 316
    .line 317
    .line 318
    move-result-object v6

    .line 319
    sget-object v7, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 320
    .line 321
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 322
    .line 323
    .line 324
    move-result-wide v10

    .line 325
    invoke-static {v6, v10, v11, v2}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 326
    .line 327
    .line 328
    move-result-object v6

    .line 329
    invoke-static {v4, v6, v9, v12}, Lcom/zykj/mistake/feature/notebook/detail/t;->m(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 330
    .line 331
    .line 332
    invoke-interface {v1, v13}, Landroidx/compose/foundation/layout/BoxScope;->matchParentSize(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 333
    .line 334
    .line 335
    move-result-object v4

    .line 336
    invoke-static {v4, v2}, Landroidx/compose/ui/draw/ClipKt;->clip(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 337
    .line 338
    .line 339
    move-result-object v14

    .line 340
    const/high16 v2, 0x66000000

    .line 341
    .line 342
    invoke-static {v2}, Landroidx/compose/ui/graphics/ColorKt;->Color(I)J

    .line 343
    .line 344
    .line 345
    move-result-wide v15

    .line 346
    const/16 v18, 0x2

    .line 347
    .line 348
    const/16 v19, 0x0

    .line 349
    .line 350
    const/16 v17, 0x0

    .line 351
    .line 352
    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 353
    .line 354
    .line 355
    move-result-object v2

    .line 356
    invoke-static {v2, v9, v12}, Landroidx/compose/foundation/layout/BoxKt;->Box(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 357
    .line 358
    .line 359
    sget v2, Lcom/zykj/mistake/R$drawable;->ic_play:I

    .line 360
    .line 361
    invoke-static {v2, v9, v12}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 366
    .line 367
    .line 368
    move-result-object v3

    .line 369
    invoke-interface {v1, v13, v3}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    const/16 v3, 0x24

    .line 374
    .line 375
    int-to-float v3, v3

    .line 376
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 377
    .line 378
    .line 379
    move-result v3

    .line 380
    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 381
    .line 382
    .line 383
    move-result-object v11

    .line 384
    const/16 v17, 0x30

    .line 385
    .line 386
    const/16 v18, 0x78

    .line 387
    .line 388
    const-string v10, "\u64ad\u653e"

    .line 389
    .line 390
    const/4 v12, 0x0

    .line 391
    move-object v1, v13

    .line 392
    const/4 v13, 0x0

    .line 393
    const/4 v14, 0x0

    .line 394
    const/4 v15, 0x0

    .line 395
    move-object/from16 v16, v9

    .line 396
    .line 397
    move-object v9, v2

    .line 398
    const/4 v2, 0x1

    .line 399
    invoke-static/range {v9 .. v18}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 400
    .line 401
    .line 402
    move-object/from16 v3, v16

    .line 403
    .line 404
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 405
    .line 406
    .line 407
    const/16 v4, 0x8

    .line 408
    .line 409
    int-to-float v4, v4

    .line 410
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 411
    .line 412
    .line 413
    move-result v4

    .line 414
    invoke-static {v1, v4}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 415
    .line 416
    .line 417
    move-result-object v4

    .line 418
    const/4 v6, 0x6

    .line 419
    invoke-static {v4, v3, v6}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 420
    .line 421
    .line 422
    iget-object v4, v0, Lcom/zykj/mistake/feature/notebook/detail/j3;->a:Ljava/lang/String;

    .line 423
    .line 424
    invoke-static {v4}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 425
    .line 426
    .line 427
    move-result v6

    .line 428
    if-eqz v6, :cond_e

    .line 429
    .line 430
    const-string v4, "\u672a\u547d\u540d"

    .line 431
    .line 432
    :cond_e
    move-object v9, v4

    .line 433
    const-wide v6, 0xff666666L

    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    invoke-static {v6, v7}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 439
    .line 440
    .line 441
    move-result-wide v11

    .line 442
    const/16 v4, 0xc

    .line 443
    .line 444
    invoke-static {v4}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 445
    .line 446
    .line 447
    move-result-wide v13

    .line 448
    sget-object v4, Landroidx/compose/ui/text/style/TextOverflow;->Companion:Landroidx/compose/ui/text/style/TextOverflow$Companion;

    .line 449
    .line 450
    invoke-virtual {v4}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getEllipsis-gIe3tQ8()I

    .line 451
    .line 452
    .line 453
    move-result v24

    .line 454
    const/4 v4, 0x0

    .line 455
    const/4 v6, 0x0

    .line 456
    invoke-static {v1, v4, v2, v6}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 457
    .line 458
    .line 459
    move-result-object v10

    .line 460
    const/16 v32, 0xc30

    .line 461
    .line 462
    const v33, 0x1d7f0

    .line 463
    .line 464
    .line 465
    const/4 v15, 0x0

    .line 466
    const/16 v16, 0x0

    .line 467
    .line 468
    const/16 v17, 0x0

    .line 469
    .line 470
    const-wide/16 v18, 0x0

    .line 471
    .line 472
    const/16 v20, 0x0

    .line 473
    .line 474
    const/16 v21, 0x0

    .line 475
    .line 476
    const-wide/16 v22, 0x0

    .line 477
    .line 478
    const/16 v25, 0x0

    .line 479
    .line 480
    const/16 v26, 0x1

    .line 481
    .line 482
    const/16 v27, 0x0

    .line 483
    .line 484
    const/16 v28, 0x0

    .line 485
    .line 486
    const/16 v29, 0x0

    .line 487
    .line 488
    const/16 v31, 0xdb0

    .line 489
    .line 490
    move-object/from16 v30, v3

    .line 491
    .line 492
    invoke-static/range {v9 .. v33}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 493
    .line 494
    .line 495
    invoke-interface/range {v30 .. v30}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 496
    .line 497
    .line 498
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 499
    .line 500
    .line 501
    move-result v1

    .line 502
    if-eqz v1, :cond_10

    .line 503
    .line 504
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 505
    .line 506
    .line 507
    goto :goto_6

    .line 508
    :cond_f
    move-object/from16 v30, v9

    .line 509
    .line 510
    invoke-interface/range {v30 .. v30}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 511
    .line 512
    .line 513
    :cond_10
    :goto_6
    invoke-interface/range {v30 .. v30}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 514
    .line 515
    .line 516
    move-result-object v1

    .line 517
    if-eqz v1, :cond_11

    .line 518
    .line 519
    new-instance v2, Landroidx/navigation/compose/b;

    .line 520
    .line 521
    const/16 v3, 0x9

    .line 522
    .line 523
    invoke-direct {v2, v8, v3, v0, v5}, Landroidx/navigation/compose/b;-><init>(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 524
    .line 525
    .line 526
    invoke-interface {v1, v2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 527
    .line 528
    .line 529
    :cond_11
    return-void
.end method

.method public static final q(Ljava/lang/String;Ljava/util/List;Lr6/c;Landroidx/compose/runtime/Composer;I)V
    .locals 7

    .line 1
    const-string v0, "title"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "lessons"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onClick"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const v0, -0x2228e32c

    .line 17
    .line 18
    .line 19
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    and-int/lit8 v1, p4, 0x6

    .line 24
    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    invoke-interface {p3, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    const/4 v1, 0x4

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 v1, 0x2

    .line 36
    :goto_0
    or-int/2addr v1, p4

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move v1, p4

    .line 39
    :goto_1
    and-int/lit8 v2, p4, 0x30

    .line 40
    .line 41
    if-nez v2, :cond_3

    .line 42
    .line 43
    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_2

    .line 48
    .line 49
    const/16 v2, 0x20

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    const/16 v2, 0x10

    .line 53
    .line 54
    :goto_2
    or-int/2addr v1, v2

    .line 55
    :cond_3
    and-int/lit16 v2, p4, 0x180

    .line 56
    .line 57
    if-nez v2, :cond_5

    .line 58
    .line 59
    invoke-interface {p3, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_4

    .line 64
    .line 65
    const/16 v2, 0x100

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_4
    const/16 v2, 0x80

    .line 69
    .line 70
    :goto_3
    or-int/2addr v1, v2

    .line 71
    :cond_5
    and-int/lit16 v2, v1, 0x93

    .line 72
    .line 73
    const/16 v3, 0x92

    .line 74
    .line 75
    const/4 v4, 0x1

    .line 76
    if-eq v2, v3, :cond_6

    .line 77
    .line 78
    move v2, v4

    .line 79
    goto :goto_4

    .line 80
    :cond_6
    const/4 v2, 0x0

    .line 81
    :goto_4
    and-int/lit8 v3, v1, 0x1

    .line 82
    .line 83
    invoke-interface {p3, v2, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-eqz v2, :cond_a

    .line 88
    .line 89
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-eqz v2, :cond_7

    .line 94
    .line 95
    const/4 v2, -0x1

    .line 96
    const-string v3, "com.zykj.mistake.feature.notebook.detail.SupplementMicroLessonSection (MistakeDetailAnswerPanel.kt:361)"

    .line 97
    .line 98
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 99
    .line 100
    .line 101
    :cond_7
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_9

    .line 106
    .line 107
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-eqz v0, :cond_8

    .line 112
    .line 113
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 114
    .line 115
    .line 116
    :cond_8
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 117
    .line 118
    .line 119
    move-result-object p3

    .line 120
    if-eqz p3, :cond_c

    .line 121
    .line 122
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/i;

    .line 123
    .line 124
    const/4 v5, 0x0

    .line 125
    move-object v1, p0

    .line 126
    move-object v2, p1

    .line 127
    move-object v3, p2

    .line 128
    move v4, p4

    .line 129
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/notebook/detail/i;-><init>(Ljava/lang/String;Ljava/util/List;Lr6/c;II)V

    .line 130
    .line 131
    .line 132
    invoke-interface {p3, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :cond_9
    move-object v2, p0

    .line 137
    move-object v3, p1

    .line 138
    move v5, p4

    .line 139
    move p0, v4

    .line 140
    move-object v4, p2

    .line 141
    new-instance p1, Lcom/zykj/mistake/feature/notebook/detail/j;

    .line 142
    .line 143
    const/4 p2, 0x0

    .line 144
    invoke-direct {p1, p2, v3, v4}, Lcom/zykj/mistake/feature/notebook/detail/j;-><init>(ILjava/util/List;Lr6/c;)V

    .line 145
    .line 146
    .line 147
    const/16 p2, 0x36

    .line 148
    .line 149
    const p4, 0x630671e4

    .line 150
    .line 151
    .line 152
    invoke-static {p4, p0, p1, p3, p2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    and-int/lit8 p1, v1, 0xe

    .line 157
    .line 158
    or-int/lit8 p1, p1, 0x30

    .line 159
    .line 160
    invoke-static {v2, p0, p3, p1}, Lcom/zykj/mistake/feature/notebook/detail/t;->r(Ljava/lang/String;Lr6/f;Landroidx/compose/runtime/Composer;I)V

    .line 161
    .line 162
    .line 163
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 164
    .line 165
    .line 166
    move-result p0

    .line 167
    if-eqz p0, :cond_b

    .line 168
    .line 169
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 170
    .line 171
    .line 172
    goto :goto_5

    .line 173
    :cond_a
    move-object v2, p0

    .line 174
    move-object v3, p1

    .line 175
    move-object v4, p2

    .line 176
    move v5, p4

    .line 177
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 178
    .line 179
    .line 180
    :cond_b
    :goto_5
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    if-eqz p0, :cond_c

    .line 185
    .line 186
    new-instance v1, Lcom/zykj/mistake/feature/notebook/detail/i;

    .line 187
    .line 188
    const/4 v6, 0x1

    .line 189
    invoke-direct/range {v1 .. v6}, Lcom/zykj/mistake/feature/notebook/detail/i;-><init>(Ljava/lang/String;Ljava/util/List;Lr6/c;II)V

    .line 190
    .line 191
    .line 192
    invoke-interface {p0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 193
    .line 194
    .line 195
    :cond_c
    return-void
.end method

.method public static final r(Ljava/lang/String;Lr6/f;Landroidx/compose/runtime/Composer;I)V
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "title"

    .line 6
    .line 7
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v2, "content"

    .line 11
    .line 12
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const v2, -0x26dc7779

    .line 16
    .line 17
    .line 18
    move-object/from16 v3, p2

    .line 19
    .line 20
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    and-int/lit8 v4, p3, 0x6

    .line 25
    .line 26
    if-nez v4, :cond_1

    .line 27
    .line 28
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

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
    and-int/lit8 v5, p3, 0x30

    .line 43
    .line 44
    if-nez v5, :cond_3

    .line 45
    .line 46
    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-eqz v5, :cond_2

    .line 51
    .line 52
    const/16 v5, 0x20

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    const/16 v5, 0x10

    .line 56
    .line 57
    :goto_2
    or-int/2addr v4, v5

    .line 58
    :cond_3
    and-int/lit8 v5, v4, 0x13

    .line 59
    .line 60
    const/16 v6, 0x12

    .line 61
    .line 62
    const/4 v7, 0x1

    .line 63
    const/4 v8, 0x0

    .line 64
    if-eq v5, v6, :cond_4

    .line 65
    .line 66
    move v5, v7

    .line 67
    goto :goto_3

    .line 68
    :cond_4
    move v5, v8

    .line 69
    :goto_3
    and-int/lit8 v6, v4, 0x1

    .line 70
    .line 71
    invoke-interface {v3, v5, v6}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    if-eqz v5, :cond_e

    .line 76
    .line 77
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    if-eqz v5, :cond_5

    .line 82
    .line 83
    const/4 v5, -0x1

    .line 84
    const-string v6, "com.zykj.mistake.feature.notebook.detail.SupplementSection (MistakeDetailAnswerPanel.kt:408)"

    .line 85
    .line 86
    invoke-static {v2, v4, v5, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 87
    .line 88
    .line 89
    :cond_5
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 90
    .line 91
    const/4 v5, 0x0

    .line 92
    const/4 v6, 0x0

    .line 93
    invoke-static {v2, v5, v7, v6}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 94
    .line 95
    .line 96
    move-result-object v9

    .line 97
    const/16 v5, 0x16

    .line 98
    .line 99
    int-to-float v5, v5

    .line 100
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 101
    .line 102
    .line 103
    move-result v13

    .line 104
    const/4 v14, 0x7

    .line 105
    const/4 v15, 0x0

    .line 106
    const/4 v10, 0x0

    .line 107
    const/4 v11, 0x0

    .line 108
    const/4 v12, 0x0

    .line 109
    invoke-static/range {v9 .. v15}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    sget-object v7, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 114
    .line 115
    invoke-virtual {v7}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 116
    .line 117
    .line 118
    move-result-object v9

    .line 119
    sget-object v10, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 120
    .line 121
    invoke-virtual {v10}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 122
    .line 123
    .line 124
    move-result-object v11

    .line 125
    invoke-static {v9, v11, v3, v8}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 126
    .line 127
    .line 128
    move-result-object v9

    .line 129
    invoke-static {v3, v8}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 130
    .line 131
    .line 132
    move-result v11

    .line 133
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 134
    .line 135
    .line 136
    move-result-object v12

    .line 137
    invoke-static {v3, v5}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    sget-object v13, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 142
    .line 143
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 144
    .line 145
    .line 146
    move-result-object v14

    .line 147
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 148
    .line 149
    .line 150
    move-result-object v15

    .line 151
    if-nez v15, :cond_6

    .line 152
    .line 153
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 154
    .line 155
    .line 156
    :cond_6
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 157
    .line 158
    .line 159
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 160
    .line 161
    .line 162
    move-result v15

    .line 163
    if-eqz v15, :cond_7

    .line 164
    .line 165
    invoke-interface {v3, v14}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 166
    .line 167
    .line 168
    goto :goto_4

    .line 169
    :cond_7
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 170
    .line 171
    .line 172
    :goto_4
    invoke-static {v3}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 173
    .line 174
    .line 175
    move-result-object v14

    .line 176
    invoke-static {v13, v14, v9, v14, v12}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 177
    .line 178
    .line 179
    move-result-object v9

    .line 180
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 181
    .line 182
    .line 183
    move-result v12

    .line 184
    if-nez v12, :cond_8

    .line 185
    .line 186
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v12

    .line 190
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 191
    .line 192
    .line 193
    move-result-object v15

    .line 194
    invoke-static {v12, v15}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v12

    .line 198
    if-nez v12, :cond_9

    .line 199
    .line 200
    :cond_8
    invoke-static {v11, v14, v11, v9}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 201
    .line 202
    .line 203
    :cond_9
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 204
    .line 205
    .line 206
    move-result-object v9

    .line 207
    invoke-static {v14, v5, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 208
    .line 209
    .line 210
    sget-object v5, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 211
    .line 212
    invoke-virtual {v10}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 213
    .line 214
    .line 215
    move-result-object v9

    .line 216
    invoke-virtual {v7}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 217
    .line 218
    .line 219
    move-result-object v7

    .line 220
    const/16 v10, 0x30

    .line 221
    .line 222
    invoke-static {v7, v9, v3, v10}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 223
    .line 224
    .line 225
    move-result-object v7

    .line 226
    invoke-static {v3, v8}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 227
    .line 228
    .line 229
    move-result v9

    .line 230
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 231
    .line 232
    .line 233
    move-result-object v10

    .line 234
    invoke-static {v3, v2}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 235
    .line 236
    .line 237
    move-result-object v11

    .line 238
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 239
    .line 240
    .line 241
    move-result-object v12

    .line 242
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 243
    .line 244
    .line 245
    move-result-object v14

    .line 246
    if-nez v14, :cond_a

    .line 247
    .line 248
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 249
    .line 250
    .line 251
    :cond_a
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 252
    .line 253
    .line 254
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 255
    .line 256
    .line 257
    move-result v14

    .line 258
    if-eqz v14, :cond_b

    .line 259
    .line 260
    invoke-interface {v3, v12}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 261
    .line 262
    .line 263
    goto :goto_5

    .line 264
    :cond_b
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 265
    .line 266
    .line 267
    :goto_5
    invoke-static {v3}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 268
    .line 269
    .line 270
    move-result-object v12

    .line 271
    invoke-static {v13, v12, v7, v12, v10}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 272
    .line 273
    .line 274
    move-result-object v7

    .line 275
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 276
    .line 277
    .line 278
    move-result v10

    .line 279
    if-nez v10, :cond_c

    .line 280
    .line 281
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v10

    .line 285
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 286
    .line 287
    .line 288
    move-result-object v14

    .line 289
    invoke-static {v10, v14}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v10

    .line 293
    if-nez v10, :cond_d

    .line 294
    .line 295
    :cond_c
    invoke-static {v9, v12, v9, v7}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 296
    .line 297
    .line 298
    :cond_d
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 299
    .line 300
    .line 301
    move-result-object v7

    .line 302
    invoke-static {v12, v11, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 303
    .line 304
    .line 305
    sget-object v7, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 306
    .line 307
    invoke-static {v6, v3, v8}, Lcom/zykj/mistake/feature/notebook/detail/g0;->j(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 308
    .line 309
    .line 310
    const/4 v6, 0x7

    .line 311
    int-to-float v6, v6

    .line 312
    const/4 v7, 0x6

    .line 313
    invoke-static {v6, v2, v3, v7}, Landroidx/compose/material3/c;->s(FLandroidx/compose/ui/Modifier$Companion;Landroidx/compose/runtime/Composer;I)V

    .line 314
    .line 315
    .line 316
    const-wide v8, 0xff15171aL

    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    invoke-static {v8, v9}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 322
    .line 323
    .line 324
    move-result-wide v8

    .line 325
    const/16 v6, 0xf

    .line 326
    .line 327
    invoke-static {v6}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 328
    .line 329
    .line 330
    move-result-wide v10

    .line 331
    sget-object v6, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    .line 332
    .line 333
    invoke-virtual {v6}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    .line 334
    .line 335
    .line 336
    move-result-object v6

    .line 337
    and-int/lit8 v12, v4, 0xe

    .line 338
    .line 339
    const v13, 0x30d80

    .line 340
    .line 341
    .line 342
    or-int v22, v12, v13

    .line 343
    .line 344
    const/16 v23, 0xc00

    .line 345
    .line 346
    const v24, 0x1dfd2

    .line 347
    .line 348
    .line 349
    const/4 v1, 0x0

    .line 350
    move v12, v7

    .line 351
    move-object v7, v6

    .line 352
    const/4 v6, 0x0

    .line 353
    move-object/from16 v21, v3

    .line 354
    .line 355
    move-wide/from16 v31, v8

    .line 356
    .line 357
    move-object v9, v2

    .line 358
    move-wide/from16 v2, v31

    .line 359
    .line 360
    const/4 v8, 0x0

    .line 361
    move v13, v4

    .line 362
    move-object v14, v5

    .line 363
    move-wide v4, v10

    .line 364
    move-object v11, v9

    .line 365
    const-wide/16 v9, 0x0

    .line 366
    .line 367
    move-object v15, v11

    .line 368
    const/4 v11, 0x0

    .line 369
    move/from16 v16, v12

    .line 370
    .line 371
    const/4 v12, 0x0

    .line 372
    move/from16 v17, v13

    .line 373
    .line 374
    move-object/from16 v18, v14

    .line 375
    .line 376
    const-wide/16 v13, 0x0

    .line 377
    .line 378
    move-object/from16 v19, v15

    .line 379
    .line 380
    const/4 v15, 0x0

    .line 381
    move/from16 v20, v16

    .line 382
    .line 383
    const/16 v16, 0x0

    .line 384
    .line 385
    move/from16 v25, v17

    .line 386
    .line 387
    const/16 v17, 0x1

    .line 388
    .line 389
    move-object/from16 v26, v18

    .line 390
    .line 391
    const/16 v18, 0x0

    .line 392
    .line 393
    move-object/from16 v27, v19

    .line 394
    .line 395
    const/16 v19, 0x0

    .line 396
    .line 397
    move/from16 v28, v20

    .line 398
    .line 399
    const/16 v20, 0x0

    .line 400
    .line 401
    move-object/from16 v30, v26

    .line 402
    .line 403
    move-object/from16 v29, v27

    .line 404
    .line 405
    invoke-static/range {v0 .. v24}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 406
    .line 407
    .line 408
    move-object/from16 v1, v21

    .line 409
    .line 410
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 411
    .line 412
    .line 413
    const/16 v2, 0xc

    .line 414
    .line 415
    int-to-float v2, v2

    .line 416
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 417
    .line 418
    .line 419
    move-result v2

    .line 420
    move-object/from16 v15, v29

    .line 421
    .line 422
    invoke-static {v15, v2}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 423
    .line 424
    .line 425
    move-result-object v2

    .line 426
    const/4 v12, 0x6

    .line 427
    invoke-static {v2, v1, v12}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 428
    .line 429
    .line 430
    and-int/lit8 v2, v25, 0x70

    .line 431
    .line 432
    or-int/2addr v2, v12

    .line 433
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 434
    .line 435
    .line 436
    move-result-object v2

    .line 437
    move-object/from16 v3, p1

    .line 438
    .line 439
    move-object/from16 v14, v30

    .line 440
    .line 441
    invoke-interface {v3, v14, v1, v2}, Lr6/f;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 445
    .line 446
    .line 447
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 448
    .line 449
    .line 450
    move-result v2

    .line 451
    if-eqz v2, :cond_f

    .line 452
    .line 453
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 454
    .line 455
    .line 456
    goto :goto_6

    .line 457
    :cond_e
    move-object/from16 v31, v3

    .line 458
    .line 459
    move-object v3, v1

    .line 460
    move-object/from16 v1, v31

    .line 461
    .line 462
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 463
    .line 464
    .line 465
    :cond_f
    :goto_6
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 466
    .line 467
    .line 468
    move-result-object v1

    .line 469
    if-eqz v1, :cond_10

    .line 470
    .line 471
    new-instance v2, Landroidx/navigation/compose/b;

    .line 472
    .line 473
    const/16 v4, 0x8

    .line 474
    .line 475
    move/from16 v5, p3

    .line 476
    .line 477
    invoke-direct {v2, v5, v4, v0, v3}, Landroidx/navigation/compose/b;-><init>(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 478
    .line 479
    .line 480
    invoke-interface {v1, v2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 481
    .line 482
    .line 483
    :cond_10
    return-void
.end method

.method public static final s(Lcom/zykj/mistake/feature/notebook/detail/o3;Lr6/a;Landroidx/compose/runtime/Composer;I)V
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v5, p1

    .line 4
    .line 5
    move/from16 v8, p3

    .line 6
    .line 7
    const-string v1, "answer"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v1, "onClick"

    .line 13
    .line 14
    invoke-static {v5, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const v1, -0x6026df4a

    .line 18
    .line 19
    .line 20
    move-object/from16 v2, p2

    .line 21
    .line 22
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 23
    .line 24
    .line 25
    move-result-object v9

    .line 26
    and-int/lit8 v2, v8, 0x6

    .line 27
    .line 28
    const/4 v10, 0x4

    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    move v2, v10

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v2, 0x2

    .line 40
    :goto_0
    or-int/2addr v2, v8

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move v2, v8

    .line 43
    :goto_1
    and-int/lit8 v3, v8, 0x30

    .line 44
    .line 45
    if-nez v3, :cond_3

    .line 46
    .line 47
    invoke-interface {v9, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_2

    .line 52
    .line 53
    const/16 v3, 0x20

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    const/16 v3, 0x10

    .line 57
    .line 58
    :goto_2
    or-int/2addr v2, v3

    .line 59
    :cond_3
    and-int/lit8 v3, v2, 0x13

    .line 60
    .line 61
    const/16 v4, 0x12

    .line 62
    .line 63
    const/4 v12, 0x0

    .line 64
    if-eq v3, v4, :cond_4

    .line 65
    .line 66
    const/4 v3, 0x1

    .line 67
    goto :goto_3

    .line 68
    :cond_4
    move v3, v12

    .line 69
    :goto_3
    and-int/lit8 v4, v2, 0x1

    .line 70
    .line 71
    invoke-interface {v9, v3, v4}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_f

    .line 76
    .line 77
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-eqz v3, :cond_5

    .line 82
    .line 83
    const/4 v3, -0x1

    .line 84
    const-string v4, "com.zykj.mistake.feature.notebook.detail.SupplementTypicalAnswerCard (MistakeDetailAnswerPanel.kt:480)"

    .line 85
    .line 86
    invoke-static {v1, v2, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 87
    .line 88
    .line 89
    :cond_5
    sget-object v13, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 90
    .line 91
    sget v14, Lcom/zykj/mistake/feature/notebook/detail/t4;->o:F

    .line 92
    .line 93
    invoke-static {v13, v14}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    const/4 v6, 0x7

    .line 98
    const/4 v7, 0x0

    .line 99
    const/4 v2, 0x0

    .line 100
    const/4 v3, 0x0

    .line 101
    const/4 v4, 0x0

    .line 102
    invoke-static/range {v1 .. v7}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    sget-object v2, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 107
    .line 108
    invoke-virtual {v2}, Landroidx/compose/ui/Alignment$Companion;->getCenterHorizontally()Landroidx/compose/ui/Alignment$Horizontal;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    sget-object v4, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 113
    .line 114
    invoke-virtual {v4}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    const/16 v6, 0x30

    .line 119
    .line 120
    invoke-static {v4, v3, v9, v6}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    invoke-static {v9, v12}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 129
    .line 130
    .line 131
    move-result-object v7

    .line 132
    invoke-static {v9, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    sget-object v15, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 137
    .line 138
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 143
    .line 144
    .line 145
    move-result-object v16

    .line 146
    if-nez v16, :cond_6

    .line 147
    .line 148
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 149
    .line 150
    .line 151
    :cond_6
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 152
    .line 153
    .line 154
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 155
    .line 156
    .line 157
    move-result v16

    .line 158
    if-eqz v16, :cond_7

    .line 159
    .line 160
    invoke-interface {v9, v6}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 161
    .line 162
    .line 163
    goto :goto_4

    .line 164
    :cond_7
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 165
    .line 166
    .line 167
    :goto_4
    invoke-static {v9}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    invoke-static {v15, v6, v3, v6, v7}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 176
    .line 177
    .line 178
    move-result v7

    .line 179
    if-nez v7, :cond_8

    .line 180
    .line 181
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v7

    .line 185
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 186
    .line 187
    .line 188
    move-result-object v11

    .line 189
    invoke-static {v7, v11}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v7

    .line 193
    if-nez v7, :cond_9

    .line 194
    .line 195
    :cond_8
    invoke-static {v4, v6, v4, v3}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 196
    .line 197
    .line 198
    :cond_9
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    invoke-static {v6, v1, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 203
    .line 204
    .line 205
    sget-object v1, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 206
    .line 207
    invoke-static {v13, v14}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    sget v3, Lcom/zykj/mistake/feature/notebook/detail/t4;->p:F

    .line 212
    .line 213
    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    int-to-float v3, v10

    .line 218
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    invoke-static {v3}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    invoke-static {v1, v3}, Landroidx/compose/ui/draw/ClipKt;->clip(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 227
    .line 228
    .line 229
    move-result-object v17

    .line 230
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 231
    .line 232
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 233
    .line 234
    .line 235
    move-result-wide v18

    .line 236
    const/16 v21, 0x2

    .line 237
    .line 238
    const/16 v22, 0x0

    .line 239
    .line 240
    const/16 v20, 0x0

    .line 241
    .line 242
    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    invoke-virtual {v2}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    invoke-static {v2, v12}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    invoke-static {v9, v12}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 255
    .line 256
    .line 257
    move-result v3

    .line 258
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 259
    .line 260
    .line 261
    move-result-object v4

    .line 262
    invoke-static {v9, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 267
    .line 268
    .line 269
    move-result-object v6

    .line 270
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 271
    .line 272
    .line 273
    move-result-object v7

    .line 274
    if-nez v7, :cond_a

    .line 275
    .line 276
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 277
    .line 278
    .line 279
    :cond_a
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 280
    .line 281
    .line 282
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 283
    .line 284
    .line 285
    move-result v7

    .line 286
    if-eqz v7, :cond_b

    .line 287
    .line 288
    invoke-interface {v9, v6}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 289
    .line 290
    .line 291
    goto :goto_5

    .line 292
    :cond_b
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 293
    .line 294
    .line 295
    :goto_5
    invoke-static {v9}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 296
    .line 297
    .line 298
    move-result-object v6

    .line 299
    invoke-static {v15, v6, v2, v6, v4}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 304
    .line 305
    .line 306
    move-result v4

    .line 307
    if-nez v4, :cond_c

    .line 308
    .line 309
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v4

    .line 313
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 314
    .line 315
    .line 316
    move-result-object v7

    .line 317
    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    move-result v4

    .line 321
    if-nez v4, :cond_d

    .line 322
    .line 323
    :cond_c
    invoke-static {v3, v6, v3, v2}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 324
    .line 325
    .line 326
    :cond_d
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    invoke-static {v6, v1, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 331
    .line 332
    .line 333
    sget-object v1, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 334
    .line 335
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/o3;->b:Ljava/lang/String;

    .line 336
    .line 337
    const/4 v2, 0x0

    .line 338
    const/4 v3, 0x0

    .line 339
    const/4 v4, 0x1

    .line 340
    invoke-static {v13, v2, v4, v3}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 341
    .line 342
    .line 343
    move-result-object v2

    .line 344
    const/16 v3, 0x30

    .line 345
    .line 346
    invoke-static {v1, v2, v9, v3}, Lcom/zykj/mistake/feature/notebook/detail/t;->m(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 347
    .line 348
    .line 349
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 350
    .line 351
    .line 352
    const/16 v1, 0x8

    .line 353
    .line 354
    int-to-float v1, v1

    .line 355
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 356
    .line 357
    .line 358
    move-result v1

    .line 359
    invoke-static {v13, v1}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 360
    .line 361
    .line 362
    move-result-object v1

    .line 363
    const/4 v2, 0x6

    .line 364
    invoke-static {v1, v9, v2}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 365
    .line 366
    .line 367
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/o3;->a:Ljava/lang/String;

    .line 368
    .line 369
    invoke-static {v1}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 370
    .line 371
    .line 372
    move-result v2

    .line 373
    if-eqz v2, :cond_e

    .line 374
    .line 375
    const-string v1, "\u672a\u547d\u540d"

    .line 376
    .line 377
    :cond_e
    const-wide v2, 0xff666666L

    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 383
    .line 384
    .line 385
    move-result-wide v11

    .line 386
    const/16 v2, 0xc

    .line 387
    .line 388
    invoke-static {v2}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 389
    .line 390
    .line 391
    move-result-wide v13

    .line 392
    sget-object v2, Landroidx/compose/ui/text/style/TextOverflow;->Companion:Landroidx/compose/ui/text/style/TextOverflow$Companion;

    .line 393
    .line 394
    invoke-virtual {v2}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getEllipsis-gIe3tQ8()I

    .line 395
    .line 396
    .line 397
    move-result v24

    .line 398
    const/16 v32, 0xc30

    .line 399
    .line 400
    const v33, 0x1d7f2

    .line 401
    .line 402
    .line 403
    const/4 v10, 0x0

    .line 404
    const/4 v15, 0x0

    .line 405
    const/16 v16, 0x0

    .line 406
    .line 407
    const/16 v17, 0x0

    .line 408
    .line 409
    const-wide/16 v18, 0x0

    .line 410
    .line 411
    const/16 v20, 0x0

    .line 412
    .line 413
    const/16 v21, 0x0

    .line 414
    .line 415
    const-wide/16 v22, 0x0

    .line 416
    .line 417
    const/16 v25, 0x0

    .line 418
    .line 419
    const/16 v26, 0x1

    .line 420
    .line 421
    const/16 v27, 0x0

    .line 422
    .line 423
    const/16 v28, 0x0

    .line 424
    .line 425
    const/16 v29, 0x0

    .line 426
    .line 427
    const/16 v31, 0xd80

    .line 428
    .line 429
    move-object/from16 v30, v9

    .line 430
    .line 431
    move-object v9, v1

    .line 432
    invoke-static/range {v9 .. v33}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 433
    .line 434
    .line 435
    invoke-interface/range {v30 .. v30}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 436
    .line 437
    .line 438
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 439
    .line 440
    .line 441
    move-result v1

    .line 442
    if-eqz v1, :cond_10

    .line 443
    .line 444
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 445
    .line 446
    .line 447
    goto :goto_6

    .line 448
    :cond_f
    move-object/from16 v30, v9

    .line 449
    .line 450
    invoke-interface/range {v30 .. v30}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 451
    .line 452
    .line 453
    :cond_10
    :goto_6
    invoke-interface/range {v30 .. v30}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 454
    .line 455
    .line 456
    move-result-object v1

    .line 457
    if-eqz v1, :cond_11

    .line 458
    .line 459
    new-instance v2, Landroidx/navigation/compose/b;

    .line 460
    .line 461
    const/16 v3, 0xa

    .line 462
    .line 463
    invoke-direct {v2, v8, v3, v0, v5}, Landroidx/navigation/compose/b;-><init>(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 464
    .line 465
    .line 466
    invoke-interface {v1, v2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 467
    .line 468
    .line 469
    :cond_11
    return-void
.end method

.method public static final t(Ljava/lang/String;Ljava/util/List;Lr6/c;Landroidx/compose/runtime/Composer;I)V
    .locals 7

    .line 1
    const-string v0, "title"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "answers"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onClick"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const v0, 0x635b8408

    .line 17
    .line 18
    .line 19
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    and-int/lit8 v1, p4, 0x6

    .line 24
    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    invoke-interface {p3, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    const/4 v1, 0x4

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 v1, 0x2

    .line 36
    :goto_0
    or-int/2addr v1, p4

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move v1, p4

    .line 39
    :goto_1
    and-int/lit8 v2, p4, 0x30

    .line 40
    .line 41
    if-nez v2, :cond_3

    .line 42
    .line 43
    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_2

    .line 48
    .line 49
    const/16 v2, 0x20

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    const/16 v2, 0x10

    .line 53
    .line 54
    :goto_2
    or-int/2addr v1, v2

    .line 55
    :cond_3
    and-int/lit16 v2, p4, 0x180

    .line 56
    .line 57
    if-nez v2, :cond_5

    .line 58
    .line 59
    invoke-interface {p3, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_4

    .line 64
    .line 65
    const/16 v2, 0x100

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_4
    const/16 v2, 0x80

    .line 69
    .line 70
    :goto_3
    or-int/2addr v1, v2

    .line 71
    :cond_5
    and-int/lit16 v2, v1, 0x93

    .line 72
    .line 73
    const/16 v3, 0x92

    .line 74
    .line 75
    const/4 v4, 0x1

    .line 76
    if-eq v2, v3, :cond_6

    .line 77
    .line 78
    move v2, v4

    .line 79
    goto :goto_4

    .line 80
    :cond_6
    const/4 v2, 0x0

    .line 81
    :goto_4
    and-int/lit8 v3, v1, 0x1

    .line 82
    .line 83
    invoke-interface {p3, v2, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-eqz v2, :cond_a

    .line 88
    .line 89
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-eqz v2, :cond_7

    .line 94
    .line 95
    const/4 v2, -0x1

    .line 96
    const-string v3, "com.zykj.mistake.feature.notebook.detail.SupplementTypicalSection (MistakeDetailAnswerPanel.kt:385)"

    .line 97
    .line 98
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 99
    .line 100
    .line 101
    :cond_7
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_9

    .line 106
    .line 107
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-eqz v0, :cond_8

    .line 112
    .line 113
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 114
    .line 115
    .line 116
    :cond_8
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 117
    .line 118
    .line 119
    move-result-object p3

    .line 120
    if-eqz p3, :cond_c

    .line 121
    .line 122
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/i;

    .line 123
    .line 124
    const/4 v5, 0x2

    .line 125
    move-object v1, p0

    .line 126
    move-object v2, p1

    .line 127
    move-object v3, p2

    .line 128
    move v4, p4

    .line 129
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/notebook/detail/i;-><init>(Ljava/lang/String;Ljava/util/List;Lr6/c;II)V

    .line 130
    .line 131
    .line 132
    invoke-interface {p3, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :cond_9
    move-object v2, p0

    .line 137
    move-object v3, p1

    .line 138
    move v5, p4

    .line 139
    move p0, v4

    .line 140
    move-object v4, p2

    .line 141
    new-instance p1, Lcom/zykj/mistake/feature/notebook/detail/j;

    .line 142
    .line 143
    const/4 p2, 0x1

    .line 144
    invoke-direct {p1, p2, v3, v4}, Lcom/zykj/mistake/feature/notebook/detail/j;-><init>(ILjava/util/List;Lr6/c;)V

    .line 145
    .line 146
    .line 147
    const/16 p2, 0x36

    .line 148
    .line 149
    const p4, 0x4b1fe118    # 1.0477848E7f

    .line 150
    .line 151
    .line 152
    invoke-static {p4, p0, p1, p3, p2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    and-int/lit8 p1, v1, 0xe

    .line 157
    .line 158
    or-int/lit8 p1, p1, 0x30

    .line 159
    .line 160
    invoke-static {v2, p0, p3, p1}, Lcom/zykj/mistake/feature/notebook/detail/t;->r(Ljava/lang/String;Lr6/f;Landroidx/compose/runtime/Composer;I)V

    .line 161
    .line 162
    .line 163
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 164
    .line 165
    .line 166
    move-result p0

    .line 167
    if-eqz p0, :cond_b

    .line 168
    .line 169
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 170
    .line 171
    .line 172
    goto :goto_5

    .line 173
    :cond_a
    move-object v2, p0

    .line 174
    move-object v3, p1

    .line 175
    move-object v4, p2

    .line 176
    move v5, p4

    .line 177
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 178
    .line 179
    .line 180
    :cond_b
    :goto_5
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    if-eqz p0, :cond_c

    .line 185
    .line 186
    new-instance v1, Lcom/zykj/mistake/feature/notebook/detail/i;

    .line 187
    .line 188
    const/4 v6, 0x3

    .line 189
    invoke-direct/range {v1 .. v6}, Lcom/zykj/mistake/feature/notebook/detail/i;-><init>(Ljava/lang/String;Ljava/util/List;Lr6/c;II)V

    .line 190
    .line 191
    .line 192
    invoke-interface {p0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 193
    .line 194
    .line 195
    :cond_c
    return-void
.end method

.method public static final u(Ljava/lang/String;JJLandroidx/compose/runtime/Composer;I)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p3

    .line 4
    .line 5
    move/from16 v3, p6

    .line 6
    .line 7
    const-string v4, "text"

    .line 8
    .line 9
    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const v4, 0x6e9b9000

    .line 13
    .line 14
    .line 15
    move-object/from16 v5, p5

    .line 16
    .line 17
    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    and-int/lit8 v6, v3, 0x6

    .line 22
    .line 23
    const/4 v7, 0x2

    .line 24
    if-nez v6, :cond_1

    .line 25
    .line 26
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    if-eqz v6, :cond_0

    .line 31
    .line 32
    const/4 v6, 0x4

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move v6, v7

    .line 35
    :goto_0
    or-int/2addr v6, v3

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move v6, v3

    .line 38
    :goto_1
    and-int/lit8 v8, v3, 0x30

    .line 39
    .line 40
    if-nez v8, :cond_3

    .line 41
    .line 42
    move-wide/from16 v8, p1

    .line 43
    .line 44
    invoke-interface {v5, v8, v9}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 45
    .line 46
    .line 47
    move-result v10

    .line 48
    if-eqz v10, :cond_2

    .line 49
    .line 50
    const/16 v10, 0x20

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    const/16 v10, 0x10

    .line 54
    .line 55
    :goto_2
    or-int/2addr v6, v10

    .line 56
    goto :goto_3

    .line 57
    :cond_3
    move-wide/from16 v8, p1

    .line 58
    .line 59
    :goto_3
    and-int/lit16 v10, v3, 0x180

    .line 60
    .line 61
    if-nez v10, :cond_5

    .line 62
    .line 63
    invoke-interface {v5, v1, v2}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 64
    .line 65
    .line 66
    move-result v10

    .line 67
    if-eqz v10, :cond_4

    .line 68
    .line 69
    const/16 v10, 0x100

    .line 70
    .line 71
    goto :goto_4

    .line 72
    :cond_4
    const/16 v10, 0x80

    .line 73
    .line 74
    :goto_4
    or-int/2addr v6, v10

    .line 75
    :cond_5
    and-int/lit16 v10, v6, 0x93

    .line 76
    .line 77
    const/16 v11, 0x92

    .line 78
    .line 79
    if-eq v10, v11, :cond_6

    .line 80
    .line 81
    const/4 v10, 0x1

    .line 82
    goto :goto_5

    .line 83
    :cond_6
    const/4 v10, 0x0

    .line 84
    :goto_5
    and-int/lit8 v11, v6, 0x1

    .line 85
    .line 86
    invoke-interface {v5, v10, v11}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 87
    .line 88
    .line 89
    move-result v10

    .line 90
    if-eqz v10, :cond_8

    .line 91
    .line 92
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 93
    .line 94
    .line 95
    move-result v10

    .line 96
    if-eqz v10, :cond_7

    .line 97
    .line 98
    const/4 v10, -0x1

    .line 99
    const-string v11, "com.zykj.mistake.feature.notebook.detail.TextAnswerChip (MistakeDetailAnswerPanel.kt:754)"

    .line 100
    .line 101
    invoke-static {v4, v6, v10, v11}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 102
    .line 103
    .line 104
    :cond_7
    const/16 v4, 0xc

    .line 105
    .line 106
    invoke-static {v4}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 107
    .line 108
    .line 109
    move-result-wide v10

    .line 110
    sget-object v12, Landroidx/compose/ui/text/style/TextAlign;->Companion:Landroidx/compose/ui/text/style/TextAlign$Companion;

    .line 111
    .line 112
    invoke-virtual {v12}, Landroidx/compose/ui/text/style/TextAlign$Companion;->getCenter-e0LSkKk()I

    .line 113
    .line 114
    .line 115
    move-result v12

    .line 116
    sget-object v13, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 117
    .line 118
    const/16 v14, 0x3c

    .line 119
    .line 120
    int-to-float v14, v14

    .line 121
    invoke-static {v14}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 122
    .line 123
    .line 124
    move-result v14

    .line 125
    const/4 v15, 0x0

    .line 126
    const/4 v4, 0x0

    .line 127
    invoke-static {v13, v14, v15, v7, v4}, Landroidx/compose/foundation/layout/SizeKt;->widthIn-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    const/4 v7, 0x3

    .line 132
    int-to-float v13, v7

    .line 133
    invoke-static {v13, v4, v1, v2}, Landroidx/compose/material3/c;->f(FLandroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    const/16 v13, 0xc

    .line 138
    .line 139
    int-to-float v13, v13

    .line 140
    invoke-static {v13}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 141
    .line 142
    .line 143
    move-result v13

    .line 144
    const/4 v14, 0x7

    .line 145
    int-to-float v14, v14

    .line 146
    invoke-static {v14}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 147
    .line 148
    .line 149
    move-result v14

    .line 150
    invoke-static {v4, v13, v14}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    invoke-static {v12}, Landroidx/compose/ui/text/style/TextAlign;->box-impl(I)Landroidx/compose/ui/text/style/TextAlign;

    .line 155
    .line 156
    .line 157
    move-result-object v12

    .line 158
    and-int/lit8 v13, v6, 0xe

    .line 159
    .line 160
    or-int/lit16 v13, v13, 0xc00

    .line 161
    .line 162
    shl-int/2addr v6, v7

    .line 163
    and-int/lit16 v6, v6, 0x380

    .line 164
    .line 165
    or-int v22, v13, v6

    .line 166
    .line 167
    const/16 v23, 0xc00

    .line 168
    .line 169
    const v24, 0x1ddf0

    .line 170
    .line 171
    .line 172
    const/4 v6, 0x0

    .line 173
    const/4 v7, 0x0

    .line 174
    const/4 v8, 0x0

    .line 175
    move-object v1, v4

    .line 176
    move-object/from16 v21, v5

    .line 177
    .line 178
    move-wide v4, v10

    .line 179
    const-wide/16 v9, 0x0

    .line 180
    .line 181
    const/4 v11, 0x0

    .line 182
    const-wide/16 v13, 0x0

    .line 183
    .line 184
    const/4 v15, 0x0

    .line 185
    const/16 v16, 0x0

    .line 186
    .line 187
    const/16 v17, 0x1

    .line 188
    .line 189
    const/16 v18, 0x0

    .line 190
    .line 191
    const/16 v19, 0x0

    .line 192
    .line 193
    const/16 v20, 0x0

    .line 194
    .line 195
    move-wide/from16 v2, p1

    .line 196
    .line 197
    invoke-static/range {v0 .. v24}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 198
    .line 199
    .line 200
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    if-eqz v0, :cond_9

    .line 205
    .line 206
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 207
    .line 208
    .line 209
    goto :goto_6

    .line 210
    :cond_8
    move-object/from16 v21, v5

    .line 211
    .line 212
    invoke-interface/range {v21 .. v21}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 213
    .line 214
    .line 215
    :cond_9
    :goto_6
    invoke-interface/range {v21 .. v21}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 216
    .line 217
    .line 218
    move-result-object v7

    .line 219
    if-eqz v7, :cond_a

    .line 220
    .line 221
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/r;

    .line 222
    .line 223
    move-object/from16 v1, p0

    .line 224
    .line 225
    move-wide/from16 v2, p1

    .line 226
    .line 227
    move-wide/from16 v4, p3

    .line 228
    .line 229
    move/from16 v6, p6

    .line 230
    .line 231
    invoke-direct/range {v0 .. v6}, Lcom/zykj/mistake/feature/notebook/detail/r;-><init>(Ljava/lang/String;JJI)V

    .line 232
    .line 233
    .line 234
    invoke-interface {v7, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 235
    .line 236
    .line 237
    :cond_a
    return-void
.end method

.method public static final v(Ljava/util/List;Ljava/lang/String;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;Landroidx/compose/runtime/Composer;I)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move/from16 v4, p4

    .line 6
    .line 7
    const-string v0, "answers"

    .line 8
    .line 9
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "visualState"

    .line 13
    .line 14
    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const v0, 0x5be97144

    .line 18
    .line 19
    .line 20
    move-object/from16 v2, p3

    .line 21
    .line 22
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 23
    .line 24
    .line 25
    move-result-object v8

    .line 26
    and-int/lit8 v2, v4, 0x6

    .line 27
    .line 28
    const/4 v5, 0x4

    .line 29
    const/4 v6, 0x2

    .line 30
    if-nez v2, :cond_1

    .line 31
    .line 32
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    move v2, v5

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move v2, v6

    .line 41
    :goto_0
    or-int/2addr v2, v4

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move v2, v4

    .line 44
    :goto_1
    and-int/lit8 v7, v4, 0x30

    .line 45
    .line 46
    if-nez v7, :cond_3

    .line 47
    .line 48
    move-object/from16 v7, p1

    .line 49
    .line 50
    invoke-interface {v8, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v9

    .line 54
    if-eqz v9, :cond_2

    .line 55
    .line 56
    const/16 v9, 0x20

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    const/16 v9, 0x10

    .line 60
    .line 61
    :goto_2
    or-int/2addr v2, v9

    .line 62
    goto :goto_3

    .line 63
    :cond_3
    move-object/from16 v7, p1

    .line 64
    .line 65
    :goto_3
    and-int/lit16 v9, v4, 0x180

    .line 66
    .line 67
    if-nez v9, :cond_5

    .line 68
    .line 69
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 70
    .line 71
    .line 72
    move-result v9

    .line 73
    invoke-interface {v8, v9}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 74
    .line 75
    .line 76
    move-result v9

    .line 77
    if-eqz v9, :cond_4

    .line 78
    .line 79
    const/16 v9, 0x100

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_4
    const/16 v9, 0x80

    .line 83
    .line 84
    :goto_4
    or-int/2addr v2, v9

    .line 85
    :cond_5
    and-int/lit16 v9, v2, 0x93

    .line 86
    .line 87
    const/16 v10, 0x92

    .line 88
    .line 89
    const/4 v11, 0x1

    .line 90
    if-eq v9, v10, :cond_6

    .line 91
    .line 92
    move v9, v11

    .line 93
    goto :goto_5

    .line 94
    :cond_6
    const/4 v9, 0x0

    .line 95
    :goto_5
    and-int/lit8 v10, v2, 0x1

    .line 96
    .line 97
    invoke-interface {v8, v9, v10}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 98
    .line 99
    .line 100
    move-result v9

    .line 101
    if-eqz v9, :cond_11

    .line 102
    .line 103
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 104
    .line 105
    .line 106
    move-result v9

    .line 107
    if-eqz v9, :cond_7

    .line 108
    .line 109
    const/4 v9, -0x1

    .line 110
    const-string v10, "com.zykj.mistake.feature.notebook.detail.TextAnswerContent (MistakeDetailAnswerPanel.kt:711)"

    .line 111
    .line 112
    invoke-static {v0, v2, v9, v10}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 113
    .line 114
    .line 115
    :cond_7
    new-instance v13, Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 118
    .line 119
    .line 120
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    :cond_8
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v9

    .line 128
    if-eqz v9, :cond_9

    .line 129
    .line 130
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v9

    .line 134
    move-object v10, v9

    .line 135
    check-cast v10, Ljava/lang/String;

    .line 136
    .line 137
    invoke-static {v10}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 138
    .line 139
    .line 140
    move-result v10

    .line 141
    if-nez v10, :cond_8

    .line 142
    .line 143
    invoke-virtual {v13, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    goto :goto_6

    .line 147
    :cond_9
    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    const/4 v9, 0x3

    .line 152
    if-eqz v0, :cond_b

    .line 153
    .line 154
    const v0, -0x1d085913

    .line 155
    .line 156
    .line 157
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 158
    .line 159
    .line 160
    sget-wide v6, Lcom/zykj/mistake/feature/notebook/detail/t4;->l:J

    .line 161
    .line 162
    move-object v10, v8

    .line 163
    move v0, v9

    .line 164
    sget-wide v8, Lcom/zykj/mistake/feature/notebook/detail/t4;->k:J

    .line 165
    .line 166
    shr-int/lit8 v0, v2, 0x3

    .line 167
    .line 168
    and-int/lit8 v0, v0, 0xe

    .line 169
    .line 170
    or-int/lit16 v11, v0, 0x1b0

    .line 171
    .line 172
    move-object/from16 v5, p1

    .line 173
    .line 174
    invoke-static/range {v5 .. v11}, Lcom/zykj/mistake/feature/notebook/detail/t;->u(Ljava/lang/String;JJLandroidx/compose/runtime/Composer;I)V

    .line 175
    .line 176
    .line 177
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 178
    .line 179
    .line 180
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-eqz v0, :cond_a

    .line 185
    .line 186
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 187
    .line 188
    .line 189
    :cond_a
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 190
    .line 191
    .line 192
    move-result-object v6

    .line 193
    if-eqz v6, :cond_13

    .line 194
    .line 195
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/p;

    .line 196
    .line 197
    const/4 v5, 0x0

    .line 198
    move-object/from16 v2, p1

    .line 199
    .line 200
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/notebook/detail/p;-><init>(Ljava/util/List;Ljava/lang/String;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;II)V

    .line 201
    .line 202
    .line 203
    :goto_7
    invoke-interface {v6, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 204
    .line 205
    .line 206
    return-void

    .line 207
    :cond_b
    move-object v1, v3

    .line 208
    move-object v10, v8

    .line 209
    move v0, v9

    .line 210
    const v2, -0x1e6de682

    .line 211
    .line 212
    .line 213
    invoke-interface {v10, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 214
    .line 215
    .line 216
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 217
    .line 218
    .line 219
    sget-object v2, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;->EMPTY:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;

    .line 220
    .line 221
    if-ne v1, v2, :cond_c

    .line 222
    .line 223
    sget-wide v2, Lcom/zykj/mistake/feature/notebook/detail/t4;->l:J

    .line 224
    .line 225
    :goto_8
    move-wide v14, v2

    .line 226
    goto :goto_9

    .line 227
    :cond_c
    sget-object v2, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 228
    .line 229
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 230
    .line 231
    .line 232
    move-result-wide v2

    .line 233
    goto :goto_8

    .line 234
    :goto_9
    sget-object v2, Lcom/zykj/mistake/feature/notebook/detail/s;->c:[I

    .line 235
    .line 236
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 237
    .line 238
    .line 239
    move-result v3

    .line 240
    aget v2, v2, v3

    .line 241
    .line 242
    if-eq v2, v11, :cond_10

    .line 243
    .line 244
    if-eq v2, v6, :cond_f

    .line 245
    .line 246
    if-eq v2, v0, :cond_e

    .line 247
    .line 248
    if-ne v2, v5, :cond_d

    .line 249
    .line 250
    sget-wide v2, Lcom/zykj/mistake/feature/notebook/detail/t4;->i:J

    .line 251
    .line 252
    :goto_a
    move-wide/from16 v16, v2

    .line 253
    .line 254
    goto :goto_b

    .line 255
    :cond_d
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 256
    .line 257
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 258
    .line 259
    .line 260
    throw v0

    .line 261
    :cond_e
    sget-wide v2, Lcom/zykj/mistake/feature/notebook/detail/t4;->h:J

    .line 262
    .line 263
    goto :goto_a

    .line 264
    :cond_f
    sget-wide v2, Lcom/zykj/mistake/feature/notebook/detail/t4;->j:J

    .line 265
    .line 266
    goto :goto_a

    .line 267
    :cond_10
    sget-wide v2, Lcom/zykj/mistake/feature/notebook/detail/t4;->k:J

    .line 268
    .line 269
    goto :goto_a

    .line 270
    :goto_b
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 271
    .line 272
    const/4 v2, 0x0

    .line 273
    const/4 v3, 0x0

    .line 274
    invoke-static {v0, v2, v11, v3}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    int-to-float v4, v6

    .line 279
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 280
    .line 281
    .line 282
    move-result v4

    .line 283
    invoke-static {v0, v2, v4, v11, v3}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    sget-object v2, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 288
    .line 289
    const/16 v3, 0x8

    .line 290
    .line 291
    int-to-float v3, v3

    .line 292
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 293
    .line 294
    .line 295
    move-result v4

    .line 296
    invoke-virtual {v2, v4}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 297
    .line 298
    .line 299
    move-result-object v4

    .line 300
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 301
    .line 302
    .line 303
    move-result v3

    .line 304
    invoke-virtual {v2, v3}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 305
    .line 306
    .line 307
    move-result-object v3

    .line 308
    new-instance v12, Lcom/zykj/mistake/feature/notebook/detail/q;

    .line 309
    .line 310
    invoke-direct/range {v12 .. v17}, Lcom/zykj/mistake/feature/notebook/detail/q;-><init>(Ljava/util/ArrayList;JJ)V

    .line 311
    .line 312
    .line 313
    const/16 v2, 0x36

    .line 314
    .line 315
    const v5, -0x15268081

    .line 316
    .line 317
    .line 318
    invoke-static {v5, v11, v12, v10, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 319
    .line 320
    .line 321
    move-result-object v7

    .line 322
    const v9, 0x1801b6

    .line 323
    .line 324
    .line 325
    move-object v8, v10

    .line 326
    const/16 v10, 0x38

    .line 327
    .line 328
    move-object v2, v4

    .line 329
    const/4 v4, 0x0

    .line 330
    const/4 v5, 0x0

    .line 331
    const/4 v6, 0x0

    .line 332
    move-object v1, v0

    .line 333
    invoke-static/range {v1 .. v10}, Landroidx/compose/foundation/layout/FlowLayoutKt;->FlowRow(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILr6/f;Landroidx/compose/runtime/Composer;II)V

    .line 334
    .line 335
    .line 336
    move-object v10, v8

    .line 337
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    if-eqz v0, :cond_12

    .line 342
    .line 343
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 344
    .line 345
    .line 346
    goto :goto_c

    .line 347
    :cond_11
    move-object v10, v8

    .line 348
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 349
    .line 350
    .line 351
    :cond_12
    :goto_c
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 352
    .line 353
    .line 354
    move-result-object v6

    .line 355
    if-eqz v6, :cond_13

    .line 356
    .line 357
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/p;

    .line 358
    .line 359
    const/4 v5, 0x1

    .line 360
    move-object/from16 v1, p0

    .line 361
    .line 362
    move-object/from16 v2, p1

    .line 363
    .line 364
    move-object/from16 v3, p2

    .line 365
    .line 366
    move/from16 v4, p4

    .line 367
    .line 368
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/notebook/detail/p;-><init>(Ljava/util/List;Ljava/lang/String;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;II)V

    .line 369
    .line 370
    .line 371
    goto/16 :goto_7

    .line 372
    .line 373
    :cond_13
    return-void
.end method
