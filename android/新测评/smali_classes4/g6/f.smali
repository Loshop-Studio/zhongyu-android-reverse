.class public abstract Lg6/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(ZLjava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p8}, Lg6/f;->g(ZLjava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;ZLcom/zykj/evaluation/ui/detail/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Lg6/f;->h(Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;ZLcom/zykj/evaluation/ui/detail/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lg6/f;->j(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lg6/f;->i(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lcom/zykj/evaluation/ui/detail/e;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/detail/f;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p10}, Lg6/f;->k(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lcom/zykj/evaluation/ui/detail/e;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/detail/f;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lcom/zykj/evaluation/ui/detail/e;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/detail/f;Landroidx/compose/runtime/Composer;II)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v4, p3

    .line 6
    .line 7
    move-object/from16 v6, p5

    .line 8
    .line 9
    move/from16 v9, p8

    .line 10
    .line 11
    const-string v0, "number"

    .line 12
    .line 13
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "answer"

    .line 17
    .line 18
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "onClick"

    .line 22
    .line 23
    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "onClickCorrectSelf"

    .line 27
    .line 28
    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const v0, -0x6b57eef

    .line 32
    .line 33
    .line 34
    move-object/from16 v3, p7

    .line 35
    .line 36
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 37
    .line 38
    .line 39
    move-result-object v10

    .line 40
    and-int/lit8 v3, v9, 0x6

    .line 41
    .line 42
    if-nez v3, :cond_1

    .line 43
    .line 44
    invoke-interface {v10, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_0

    .line 49
    .line 50
    const/4 v3, 0x4

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    const/4 v3, 0x2

    .line 53
    :goto_0
    or-int/2addr v3, v9

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    move v3, v9

    .line 56
    :goto_1
    and-int/lit8 v5, v9, 0x30

    .line 57
    .line 58
    if-nez v5, :cond_3

    .line 59
    .line 60
    invoke-interface {v10, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_2

    .line 65
    .line 66
    const/16 v5, 0x20

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_2
    const/16 v5, 0x10

    .line 70
    .line 71
    :goto_2
    or-int/2addr v3, v5

    .line 72
    :cond_3
    and-int/lit16 v5, v9, 0x180

    .line 73
    .line 74
    if-nez v5, :cond_5

    .line 75
    .line 76
    move/from16 v5, p2

    .line 77
    .line 78
    invoke-interface {v10, v5}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    if-eqz v7, :cond_4

    .line 83
    .line 84
    const/16 v7, 0x100

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_4
    const/16 v7, 0x80

    .line 88
    .line 89
    :goto_3
    or-int/2addr v3, v7

    .line 90
    goto :goto_4

    .line 91
    :cond_5
    move/from16 v5, p2

    .line 92
    .line 93
    :goto_4
    and-int/lit16 v7, v9, 0xc00

    .line 94
    .line 95
    if-nez v7, :cond_7

    .line 96
    .line 97
    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v7

    .line 101
    if-eqz v7, :cond_6

    .line 102
    .line 103
    const/16 v7, 0x800

    .line 104
    .line 105
    goto :goto_5

    .line 106
    :cond_6
    const/16 v7, 0x400

    .line 107
    .line 108
    :goto_5
    or-int/2addr v3, v7

    .line 109
    :cond_7
    and-int/lit8 v7, p9, 0x10

    .line 110
    .line 111
    if-eqz v7, :cond_9

    .line 112
    .line 113
    or-int/lit16 v3, v3, 0x6000

    .line 114
    .line 115
    :cond_8
    move-object/from16 v8, p4

    .line 116
    .line 117
    goto :goto_7

    .line 118
    :cond_9
    and-int/lit16 v8, v9, 0x6000

    .line 119
    .line 120
    if-nez v8, :cond_8

    .line 121
    .line 122
    move-object/from16 v8, p4

    .line 123
    .line 124
    invoke-interface {v10, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v11

    .line 128
    if-eqz v11, :cond_a

    .line 129
    .line 130
    const/16 v11, 0x4000

    .line 131
    .line 132
    goto :goto_6

    .line 133
    :cond_a
    const/16 v11, 0x2000

    .line 134
    .line 135
    :goto_6
    or-int/2addr v3, v11

    .line 136
    :goto_7
    const/high16 v11, 0x30000

    .line 137
    .line 138
    and-int/2addr v11, v9

    .line 139
    if-nez v11, :cond_c

    .line 140
    .line 141
    invoke-interface {v10, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v11

    .line 145
    if-eqz v11, :cond_b

    .line 146
    .line 147
    const/high16 v11, 0x20000

    .line 148
    .line 149
    goto :goto_8

    .line 150
    :cond_b
    const/high16 v11, 0x10000

    .line 151
    .line 152
    :goto_8
    or-int/2addr v3, v11

    .line 153
    :cond_c
    and-int/lit8 v11, p9, 0x40

    .line 154
    .line 155
    const/high16 v12, 0x180000

    .line 156
    .line 157
    if-eqz v11, :cond_e

    .line 158
    .line 159
    or-int/2addr v3, v12

    .line 160
    :cond_d
    move-object/from16 v12, p6

    .line 161
    .line 162
    :goto_9
    move v13, v3

    .line 163
    goto :goto_b

    .line 164
    :cond_e
    and-int/2addr v12, v9

    .line 165
    if-nez v12, :cond_d

    .line 166
    .line 167
    move-object/from16 v12, p6

    .line 168
    .line 169
    invoke-interface {v10, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v13

    .line 173
    if-eqz v13, :cond_f

    .line 174
    .line 175
    const/high16 v13, 0x100000

    .line 176
    .line 177
    goto :goto_a

    .line 178
    :cond_f
    const/high16 v13, 0x80000

    .line 179
    .line 180
    :goto_a
    or-int/2addr v3, v13

    .line 181
    goto :goto_9

    .line 182
    :goto_b
    const v3, 0x92493

    .line 183
    .line 184
    .line 185
    and-int/2addr v3, v13

    .line 186
    const v14, 0x92492

    .line 187
    .line 188
    .line 189
    const/4 v15, 0x1

    .line 190
    if-eq v3, v14, :cond_10

    .line 191
    .line 192
    move v3, v15

    .line 193
    goto :goto_c

    .line 194
    :cond_10
    const/4 v3, 0x0

    .line 195
    :goto_c
    and-int/lit8 v14, v13, 0x1

    .line 196
    .line 197
    invoke-interface {v10, v3, v14}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 198
    .line 199
    .line 200
    move-result v3

    .line 201
    if-eqz v3, :cond_15

    .line 202
    .line 203
    if-eqz v7, :cond_11

    .line 204
    .line 205
    sget-object v3, Lcom/zykj/evaluation/ui/detail/e$c;->d:Lcom/zykj/evaluation/ui/detail/e$c;

    .line 206
    .line 207
    move-object v7, v3

    .line 208
    goto :goto_d

    .line 209
    :cond_11
    move-object v7, v8

    .line 210
    :goto_d
    if-eqz v11, :cond_12

    .line 211
    .line 212
    sget-object v3, Lcom/zykj/evaluation/ui/detail/f$c;->b:Lcom/zykj/evaluation/ui/detail/f$c;

    .line 213
    .line 214
    move-object v6, v3

    .line 215
    goto :goto_e

    .line 216
    :cond_12
    move-object v6, v12

    .line 217
    :goto_e
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 218
    .line 219
    .line 220
    move-result v3

    .line 221
    if-eqz v3, :cond_13

    .line 222
    .line 223
    const/4 v3, -0x1

    .line 224
    const-string v8, "com.zykj.evaluation.ui.detail.widget.question.BlankQuestionView (BlankQuestionView.kt:25)"

    .line 225
    .line 226
    invoke-static {v0, v13, v3, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 227
    .line 228
    .line 229
    :cond_13
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 230
    .line 231
    const/4 v3, 0x0

    .line 232
    const/4 v8, 0x0

    .line 233
    invoke-static {v0, v3, v15, v8}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    const/16 v3, 0x26

    .line 238
    .line 239
    int-to-float v3, v3

    .line 240
    const/16 v8, 0x258

    .line 241
    .line 242
    int-to-float v8, v8

    .line 243
    div-float/2addr v3, v8

    .line 244
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 245
    .line 246
    .line 247
    move-result-object v8

    .line 248
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 249
    .line 250
    .line 251
    move-result-object v8

    .line 252
    iget v11, v8, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 253
    .line 254
    iget v8, v8, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 255
    .line 256
    invoke-static {v11, v8}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 257
    .line 258
    .line 259
    move-result v8

    .line 260
    int-to-float v8, v8

    .line 261
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 262
    .line 263
    .line 264
    move-result-object v11

    .line 265
    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 266
    .line 267
    .line 268
    move-result-object v11

    .line 269
    iget v11, v11, Landroid/util/DisplayMetrics;->density:F

    .line 270
    .line 271
    div-float/2addr v8, v11

    .line 272
    mul-float/2addr v3, v8

    .line 273
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 274
    .line 275
    .line 276
    move-result v3

    .line 277
    invoke-static {v0, v3}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    new-instance v2, Lg6/a;

    .line 282
    .line 283
    move-object/from16 v8, p5

    .line 284
    .line 285
    move v3, v5

    .line 286
    move-object v5, v4

    .line 287
    move-object/from16 v4, p1

    .line 288
    .line 289
    invoke-direct/range {v2 .. v8}, Lg6/a;-><init>(ZLjava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;Lkotlin/jvm/functions/Function1;)V

    .line 290
    .line 291
    .line 292
    const/16 v3, 0x36

    .line 293
    .line 294
    const v4, 0x66a1af86

    .line 295
    .line 296
    .line 297
    invoke-static {v4, v15, v2, v10, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 298
    .line 299
    .line 300
    move-result-object v2

    .line 301
    shl-int/lit8 v3, v13, 0x3

    .line 302
    .line 303
    and-int/lit8 v3, v3, 0x70

    .line 304
    .line 305
    or-int/lit16 v4, v3, 0x186

    .line 306
    .line 307
    const/4 v5, 0x0

    .line 308
    move-object v3, v10

    .line 309
    invoke-static/range {v0 .. v5}, Lf6/f;->j(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 310
    .line 311
    .line 312
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 313
    .line 314
    .line 315
    move-result v0

    .line 316
    if-eqz v0, :cond_14

    .line 317
    .line 318
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 319
    .line 320
    .line 321
    :cond_14
    move-object v5, v7

    .line 322
    move-object v7, v6

    .line 323
    goto :goto_f

    .line 324
    :cond_15
    move-object v3, v10

    .line 325
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 326
    .line 327
    .line 328
    move-object v5, v8

    .line 329
    move-object v7, v12

    .line 330
    :goto_f
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 331
    .line 332
    .line 333
    move-result-object v10

    .line 334
    if-eqz v10, :cond_16

    .line 335
    .line 336
    new-instance v0, Lg6/b;

    .line 337
    .line 338
    move-object/from16 v1, p0

    .line 339
    .line 340
    move-object/from16 v2, p1

    .line 341
    .line 342
    move/from16 v3, p2

    .line 343
    .line 344
    move-object/from16 v4, p3

    .line 345
    .line 346
    move-object/from16 v6, p5

    .line 347
    .line 348
    move v8, v9

    .line 349
    move/from16 v9, p9

    .line 350
    .line 351
    invoke-direct/range {v0 .. v9}, Lg6/b;-><init>(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lcom/zykj/evaluation/ui/detail/e;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/detail/f;II)V

    .line 352
    .line 353
    .line 354
    invoke-interface {v10, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 355
    .line 356
    .line 357
    :cond_16
    return-void
.end method

.method public static final g(ZLjava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 12

    .line 1
    move-object/from16 v5, p7

    .line 2
    .line 3
    move/from16 v0, p8

    .line 4
    .line 5
    const-string v1, "$this$NumberWithContent"

    .line 6
    .line 7
    move-object/from16 v2, p6

    .line 8
    .line 9
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    and-int/lit8 v1, v0, 0x11

    .line 13
    .line 14
    const/16 v2, 0x10

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x1

    .line 18
    if-eq v1, v2, :cond_0

    .line 19
    .line 20
    move v1, v4

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v1, v3

    .line 23
    :goto_0
    and-int/lit8 v2, v0, 0x1

    .line 24
    .line 25
    invoke-interface {v5, v1, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_4

    .line 30
    .line 31
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    const/4 v1, -0x1

    .line 38
    const-string v2, "com.zykj.evaluation.ui.detail.widget.question.BlankQuestionView.<anonymous> (BlankQuestionView.kt:32)"

    .line 39
    .line 40
    const v6, 0x66a1af86

    .line 41
    .line 42
    .line 43
    invoke-static {v6, v0, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 47
    .line 48
    const/4 v1, 0x0

    .line 49
    const/4 v2, 0x0

    .line 50
    invoke-static {v0, v1, v4, v2}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-nez p0, :cond_3

    .line 55
    .line 56
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-lez v1, :cond_2

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    move v2, v3

    .line 64
    goto :goto_2

    .line 65
    :cond_3
    :goto_1
    move v2, v4

    .line 66
    :goto_2
    new-instance v6, Lg6/c;

    .line 67
    .line 68
    move v9, p0

    .line 69
    move-object v7, p1

    .line 70
    move-object v8, p3

    .line 71
    move-object/from16 v10, p4

    .line 72
    .line 73
    move-object/from16 v11, p5

    .line 74
    .line 75
    invoke-direct/range {v6 .. v11}, Lg6/c;-><init>(Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;ZLcom/zykj/evaluation/ui/detail/e;Lkotlin/jvm/functions/Function1;)V

    .line 76
    .line 77
    .line 78
    const/16 p1, 0x36

    .line 79
    .line 80
    const p3, 0x6517604e

    .line 81
    .line 82
    .line 83
    invoke-static {p3, v4, v6, v5, p1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    const/16 v6, 0x6006

    .line 88
    .line 89
    const/4 v7, 0x0

    .line 90
    move v1, p0

    .line 91
    move-object v3, p2

    .line 92
    invoke-static/range {v0 .. v7}, Lf6/f;->f(Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 93
    .line 94
    .line 95
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    if-eqz p0, :cond_5

    .line 100
    .line 101
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 102
    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_4
    invoke-interface/range {p7 .. p7}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 106
    .line 107
    .line 108
    :cond_5
    :goto_3
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 109
    .line 110
    return-object p0
.end method

.method public static final h(Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;ZLcom/zykj/evaluation/ui/detail/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 21

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    move-object/from16 v2, p5

    .line 4
    .line 5
    move-object/from16 v9, p6

    .line 6
    .line 7
    const-string v3, "$this$DashBackground"

    .line 8
    .line 9
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    and-int/lit8 v3, p7, 0x6

    .line 13
    .line 14
    if-nez v3, :cond_1

    .line 15
    .line 16
    invoke-interface {v9, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    const/4 v3, 0x4

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v3, 0x2

    .line 25
    :goto_0
    or-int v3, p7, v3

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move/from16 v3, p7

    .line 29
    .line 30
    :goto_1
    and-int/lit8 v4, v3, 0x13

    .line 31
    .line 32
    const/16 v5, 0x12

    .line 33
    .line 34
    const/4 v6, 0x1

    .line 35
    const/4 v7, 0x0

    .line 36
    if-eq v4, v5, :cond_2

    .line 37
    .line 38
    move v4, v6

    .line 39
    goto :goto_2

    .line 40
    :cond_2
    move v4, v7

    .line 41
    :goto_2
    and-int/lit8 v5, v3, 0x1

    .line 42
    .line 43
    invoke-interface {v9, v4, v5}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_10

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
    const-string v5, "com.zykj.evaluation.ui.detail.widget.question.BlankQuestionView.<anonymous>.<anonymous> (BlankQuestionView.kt:39)"

    .line 57
    .line 58
    const v8, 0x6517604e

    .line 59
    .line 60
    .line 61
    invoke-static {v8, v3, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 62
    .line 63
    .line 64
    :cond_3
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 65
    .line 66
    const/4 v4, 0x0

    .line 67
    const/4 v5, 0x0

    .line 68
    invoke-static {v3, v4, v6, v5}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    sget-object v8, Landroidx/compose/ui/layout/ContentScale;->Companion:Landroidx/compose/ui/layout/ContentScale$Companion;

    .line 73
    .line 74
    invoke-virtual {v8}, Landroidx/compose/ui/layout/ContentScale$Companion;->getFit()Landroidx/compose/ui/layout/ContentScale;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    const/16 v16, 0x0

    .line 79
    .line 80
    const/16 v17, 0x7b8

    .line 81
    .line 82
    move-object v10, v5

    .line 83
    move-object v5, v4

    .line 84
    const/4 v4, 0x0

    .line 85
    move v11, v6

    .line 86
    const/4 v6, 0x0

    .line 87
    move v12, v7

    .line 88
    const/4 v7, 0x0

    .line 89
    move-object v9, v8

    .line 90
    const/4 v8, 0x0

    .line 91
    move-object v13, v10

    .line 92
    const/4 v10, 0x0

    .line 93
    move v14, v11

    .line 94
    const/4 v11, 0x0

    .line 95
    move v15, v12

    .line 96
    const/4 v12, 0x0

    .line 97
    move-object/from16 v18, v13

    .line 98
    .line 99
    const/4 v13, 0x0

    .line 100
    move/from16 v19, v15

    .line 101
    .line 102
    const v15, 0x1801b0

    .line 103
    .line 104
    .line 105
    move-object/from16 v14, p6

    .line 106
    .line 107
    move-object/from16 v18, v3

    .line 108
    .line 109
    move/from16 v1, v19

    .line 110
    .line 111
    move-object/from16 v3, p0

    .line 112
    .line 113
    invoke-static/range {v3 .. v17}, Lcoil3/compose/c;->a(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;IZLandroidx/compose/runtime/Composer;III)V

    .line 114
    .line 115
    .line 116
    move-object v7, v14

    .line 117
    const/4 v3, 0x5

    .line 118
    int-to-float v3, v3

    .line 119
    const/16 v4, 0x258

    .line 120
    .line 121
    int-to-float v4, v4

    .line 122
    div-float/2addr v3, v4

    .line 123
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    iget v6, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 132
    .line 133
    iget v5, v5, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 134
    .line 135
    invoke-static {v6, v5}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    int-to-float v5, v5

    .line 140
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    iget v6, v6, Landroid/util/DisplayMetrics;->density:F

    .line 149
    .line 150
    div-float/2addr v5, v6

    .line 151
    mul-float/2addr v3, v5

    .line 152
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 153
    .line 154
    .line 155
    move-result v10

    .line 156
    const/16 v14, 0xe

    .line 157
    .line 158
    const/4 v15, 0x0

    .line 159
    const/4 v11, 0x0

    .line 160
    const/4 v12, 0x0

    .line 161
    const/4 v13, 0x0

    .line 162
    move-object/from16 v9, v18

    .line 163
    .line 164
    invoke-static/range {v9 .. v15}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    move-object v13, v9

    .line 169
    sget-object v14, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 170
    .line 171
    invoke-virtual {v14}, Landroidx/compose/ui/Alignment$Companion;->getCenterStart()Landroidx/compose/ui/Alignment;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    invoke-interface {v2, v3, v5}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    const/16 v5, 0xe

    .line 180
    .line 181
    int-to-float v5, v5

    .line 182
    div-float/2addr v5, v4

    .line 183
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 184
    .line 185
    .line 186
    move-result-object v6

    .line 187
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    iget v8, v6, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 192
    .line 193
    iget v6, v6, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 194
    .line 195
    invoke-static {v8, v6}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 196
    .line 197
    .line 198
    move-result v6

    .line 199
    int-to-float v6, v6

    .line 200
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 201
    .line 202
    .line 203
    move-result-object v8

    .line 204
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 205
    .line 206
    .line 207
    move-result-object v8

    .line 208
    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    .line 209
    .line 210
    div-float/2addr v6, v8

    .line 211
    mul-float/2addr v5, v6

    .line 212
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 213
    .line 214
    .line 215
    move-result v5

    .line 216
    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 217
    .line 218
    .line 219
    move-result-object v5

    .line 220
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/ui/detail/f;->a()I

    .line 221
    .line 222
    .line 223
    move-result v3

    .line 224
    invoke-static {v3, v7, v1}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    const/16 v11, 0x30

    .line 229
    .line 230
    const/16 v12, 0x78

    .line 231
    .line 232
    move v6, v4

    .line 233
    const-string v4, ""

    .line 234
    .line 235
    move v8, v6

    .line 236
    const/4 v6, 0x0

    .line 237
    const/4 v7, 0x0

    .line 238
    move v9, v8

    .line 239
    const/4 v8, 0x0

    .line 240
    move v10, v9

    .line 241
    const/4 v9, 0x0

    .line 242
    move v15, v10

    .line 243
    move-object/from16 v10, p6

    .line 244
    .line 245
    invoke-static/range {v3 .. v12}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 246
    .line 247
    .line 248
    move-object v9, v10

    .line 249
    invoke-interface/range {p0 .. p0}, Ljava/lang/CharSequence;->length()I

    .line 250
    .line 251
    .line 252
    move-result v3

    .line 253
    if-nez v3, :cond_5

    .line 254
    .line 255
    const v3, 0x1b58b85e

    .line 256
    .line 257
    .line 258
    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 259
    .line 260
    .line 261
    if-eqz p2, :cond_4

    .line 262
    .line 263
    const v3, 0x1b592063

    .line 264
    .line 265
    .line 266
    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v14}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    invoke-interface {v2, v13, v3}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    invoke-static {v3, v9, v1, v1}, Lf6/f;->n(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    .line 278
    .line 279
    .line 280
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 281
    .line 282
    .line 283
    goto :goto_3

    .line 284
    :cond_4
    const v3, 0x1b5aed83

    .line 285
    .line 286
    .line 287
    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v14}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 291
    .line 292
    .line 293
    move-result-object v3

    .line 294
    invoke-interface {v2, v13, v3}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    .line 295
    .line 296
    .line 297
    move-result-object v3

    .line 298
    invoke-static {v3, v9, v1, v1}, Lf6/f;->h(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    .line 299
    .line 300
    .line 301
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 302
    .line 303
    .line 304
    :goto_3
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 305
    .line 306
    .line 307
    goto :goto_4

    .line 308
    :cond_5
    const v3, 0x1b3c7eb4

    .line 309
    .line 310
    .line 311
    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 312
    .line 313
    .line 314
    goto :goto_3

    .line 315
    :goto_4
    invoke-virtual {v14}, Landroidx/compose/ui/Alignment$Companion;->getCenterEnd()Landroidx/compose/ui/Alignment;

    .line 316
    .line 317
    .line 318
    move-result-object v3

    .line 319
    invoke-interface {v2, v13, v3}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    sget-object v3, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 324
    .line 325
    invoke-virtual {v3}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 326
    .line 327
    .line 328
    move-result-object v3

    .line 329
    invoke-virtual {v14}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    .line 330
    .line 331
    .line 332
    move-result-object v4

    .line 333
    invoke-static {v3, v4, v9, v1}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 334
    .line 335
    .line 336
    move-result-object v3

    .line 337
    invoke-static {v9, v1}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 338
    .line 339
    .line 340
    move-result v4

    .line 341
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 342
    .line 343
    .line 344
    move-result-object v5

    .line 345
    invoke-static {v9, v2}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 346
    .line 347
    .line 348
    move-result-object v2

    .line 349
    sget-object v6, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 350
    .line 351
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 352
    .line 353
    .line 354
    move-result-object v7

    .line 355
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 356
    .line 357
    .line 358
    move-result-object v8

    .line 359
    if-nez v8, :cond_6

    .line 360
    .line 361
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 362
    .line 363
    .line 364
    :cond_6
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 365
    .line 366
    .line 367
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 368
    .line 369
    .line 370
    move-result v8

    .line 371
    if-eqz v8, :cond_7

    .line 372
    .line 373
    invoke-interface {v9, v7}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 374
    .line 375
    .line 376
    goto :goto_5

    .line 377
    :cond_7
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 378
    .line 379
    .line 380
    :goto_5
    invoke-static {v9}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 381
    .line 382
    .line 383
    move-result-object v7

    .line 384
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 385
    .line 386
    .line 387
    move-result-object v8

    .line 388
    invoke-static {v7, v3, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 392
    .line 393
    .line 394
    move-result-object v3

    .line 395
    invoke-static {v7, v5, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 399
    .line 400
    .line 401
    move-result-object v3

    .line 402
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 403
    .line 404
    .line 405
    move-result v5

    .line 406
    if-nez v5, :cond_8

    .line 407
    .line 408
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v5

    .line 412
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 413
    .line 414
    .line 415
    move-result-object v8

    .line 416
    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 417
    .line 418
    .line 419
    move-result v5

    .line 420
    if-nez v5, :cond_9

    .line 421
    .line 422
    :cond_8
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 423
    .line 424
    .line 425
    move-result-object v5

    .line 426
    invoke-interface {v7, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 427
    .line 428
    .line 429
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 430
    .line 431
    .line 432
    move-result-object v4

    .line 433
    invoke-interface {v7, v4, v3}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 434
    .line 435
    .line 436
    :cond_9
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 437
    .line 438
    .line 439
    move-result-object v3

    .line 440
    invoke-static {v7, v2, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 441
    .line 442
    .line 443
    sget-object v2, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 444
    .line 445
    const/16 v2, 0x19

    .line 446
    .line 447
    int-to-float v2, v2

    .line 448
    div-float v12, v2, v15

    .line 449
    .line 450
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 451
    .line 452
    .line 453
    move-result-object v2

    .line 454
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 455
    .line 456
    .line 457
    move-result-object v2

    .line 458
    iget v3, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 459
    .line 460
    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 461
    .line 462
    invoke-static {v3, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 463
    .line 464
    .line 465
    move-result v2

    .line 466
    int-to-float v2, v2

    .line 467
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 468
    .line 469
    .line 470
    move-result-object v3

    .line 471
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 472
    .line 473
    .line 474
    move-result-object v3

    .line 475
    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    .line 476
    .line 477
    div-float/2addr v2, v3

    .line 478
    mul-float/2addr v2, v12

    .line 479
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 480
    .line 481
    .line 482
    move-result v2

    .line 483
    invoke-static {v13, v2}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 484
    .line 485
    .line 486
    move-result-object v2

    .line 487
    sget-object v14, Lcom/zykj/evaluation/ui/detail/e$c;->d:Lcom/zykj/evaluation/ui/detail/e$c;

    .line 488
    .line 489
    invoke-static {v0, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 490
    .line 491
    .line 492
    move-result v3

    .line 493
    const v15, 0x6c8f8458

    .line 494
    .line 495
    .line 496
    if-nez v3, :cond_c

    .line 497
    .line 498
    const v3, 0x6cb2eff7

    .line 499
    .line 500
    .line 501
    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 502
    .line 503
    .line 504
    move-object/from16 v3, p4

    .line 505
    .line 506
    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 507
    .line 508
    .line 509
    move-result v4

    .line 510
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v5

    .line 514
    if-nez v4, :cond_a

    .line 515
    .line 516
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 517
    .line 518
    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v4

    .line 522
    if-ne v5, v4, :cond_b

    .line 523
    .line 524
    :cond_a
    new-instance v5, Lg6/d;

    .line 525
    .line 526
    invoke-direct {v5, v3}, Lg6/d;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 527
    .line 528
    .line 529
    invoke-interface {v9, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 530
    .line 531
    .line 532
    :cond_b
    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 533
    .line 534
    const/4 v4, 0x0

    .line 535
    const/4 v6, 0x1

    .line 536
    invoke-static {v2, v1, v5, v6, v4}, Lg7/i;->g(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 537
    .line 538
    .line 539
    move-result-object v2

    .line 540
    :goto_6
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 541
    .line 542
    .line 543
    goto :goto_7

    .line 544
    :cond_c
    move-object/from16 v3, p4

    .line 545
    .line 546
    const/4 v4, 0x0

    .line 547
    const/4 v6, 0x1

    .line 548
    invoke-interface {v9, v15}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 549
    .line 550
    .line 551
    goto :goto_6

    .line 552
    :goto_7
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/e;->c()I

    .line 553
    .line 554
    .line 555
    move-result v5

    .line 556
    invoke-static {v5, v9, v1}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 557
    .line 558
    .line 559
    move-result-object v5

    .line 560
    const/16 v10, 0x30

    .line 561
    .line 562
    const/16 v11, 0x78

    .line 563
    .line 564
    const-string v3, ""

    .line 565
    .line 566
    move-object/from16 v18, v4

    .line 567
    .line 568
    move-object v4, v2

    .line 569
    move-object v2, v5

    .line 570
    const/4 v5, 0x0

    .line 571
    move/from16 v20, v6

    .line 572
    .line 573
    const/4 v6, 0x0

    .line 574
    const/4 v7, 0x0

    .line 575
    const/4 v8, 0x0

    .line 576
    move-object/from16 v15, p4

    .line 577
    .line 578
    move/from16 p1, v12

    .line 579
    .line 580
    move-object/from16 v12, v18

    .line 581
    .line 582
    invoke-static/range {v2 .. v11}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 583
    .line 584
    .line 585
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 586
    .line 587
    .line 588
    move-result-object v2

    .line 589
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 590
    .line 591
    .line 592
    move-result-object v2

    .line 593
    iget v3, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 594
    .line 595
    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 596
    .line 597
    invoke-static {v3, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 598
    .line 599
    .line 600
    move-result v2

    .line 601
    int-to-float v2, v2

    .line 602
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 603
    .line 604
    .line 605
    move-result-object v3

    .line 606
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 607
    .line 608
    .line 609
    move-result-object v3

    .line 610
    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    .line 611
    .line 612
    div-float/2addr v2, v3

    .line 613
    mul-float v2, v2, p1

    .line 614
    .line 615
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 616
    .line 617
    .line 618
    move-result v2

    .line 619
    invoke-static {v13, v2}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 620
    .line 621
    .line 622
    move-result-object v2

    .line 623
    invoke-static {v0, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 624
    .line 625
    .line 626
    move-result v3

    .line 627
    if-nez v3, :cond_f

    .line 628
    .line 629
    const v3, 0x6cbab016

    .line 630
    .line 631
    .line 632
    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 633
    .line 634
    .line 635
    invoke-interface {v9, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 636
    .line 637
    .line 638
    move-result v3

    .line 639
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    move-result-object v4

    .line 643
    if-nez v3, :cond_d

    .line 644
    .line 645
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 646
    .line 647
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 648
    .line 649
    .line 650
    move-result-object v3

    .line 651
    if-ne v4, v3, :cond_e

    .line 652
    .line 653
    :cond_d
    new-instance v4, Lg6/e;

    .line 654
    .line 655
    invoke-direct {v4, v15}, Lg6/e;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 656
    .line 657
    .line 658
    invoke-interface {v9, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 659
    .line 660
    .line 661
    :cond_e
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 662
    .line 663
    const/4 v11, 0x1

    .line 664
    invoke-static {v2, v1, v4, v11, v12}, Lg7/i;->g(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 665
    .line 666
    .line 667
    move-result-object v2

    .line 668
    :goto_8
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 669
    .line 670
    .line 671
    goto :goto_9

    .line 672
    :cond_f
    const v3, 0x6c8f8458

    .line 673
    .line 674
    .line 675
    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 676
    .line 677
    .line 678
    goto :goto_8

    .line 679
    :goto_9
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/e;->a()I

    .line 680
    .line 681
    .line 682
    move-result v0

    .line 683
    invoke-static {v0, v9, v1}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 684
    .line 685
    .line 686
    move-result-object v0

    .line 687
    const/16 v8, 0x30

    .line 688
    .line 689
    const/16 v9, 0x78

    .line 690
    .line 691
    const-string v1, ""

    .line 692
    .line 693
    const/4 v3, 0x0

    .line 694
    const/4 v4, 0x0

    .line 695
    const/4 v5, 0x0

    .line 696
    const/4 v6, 0x0

    .line 697
    move-object/from16 v7, p6

    .line 698
    .line 699
    invoke-static/range {v0 .. v9}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 700
    .line 701
    .line 702
    invoke-interface/range {p6 .. p6}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 703
    .line 704
    .line 705
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 706
    .line 707
    .line 708
    move-result v0

    .line 709
    if-eqz v0, :cond_11

    .line 710
    .line 711
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 712
    .line 713
    .line 714
    goto :goto_a

    .line 715
    :cond_10
    invoke-interface/range {p6 .. p6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 716
    .line 717
    .line 718
    :cond_11
    :goto_a
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 719
    .line 720
    return-object v0
.end method

.method public static final i(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 7
    .line 8
    return-object p0
.end method

.method public static final j(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 7
    .line 8
    return-object p0
.end method

.method public static final k(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lcom/zykj/evaluation/ui/detail/e;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/detail/f;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 11

    .line 1
    or-int/lit8 v0, p7, 0x1

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 4
    .line 5
    .line 6
    move-result v9

    .line 7
    move-object v1, p0

    .line 8
    move-object v2, p1

    .line 9
    move v3, p2

    .line 10
    move-object v4, p3

    .line 11
    move-object v5, p4

    .line 12
    move-object/from16 v6, p5

    .line 13
    .line 14
    move-object/from16 v7, p6

    .line 15
    .line 16
    move/from16 v10, p8

    .line 17
    .line 18
    move-object/from16 v8, p9

    .line 19
    .line 20
    invoke-static/range {v1 .. v10}, Lg6/f;->f(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lcom/zykj/evaluation/ui/detail/e;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/detail/f;Landroidx/compose/runtime/Composer;II)V

    .line 21
    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 24
    .line 25
    return-object p0
.end method
