.class public abstract Lcom/zykj/student/dialogue/ui/home/dialog/MoveDialogKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Lcom/zykj/student/dialogue/bean/resp/CatalogResp;ZLkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/zykj/student/dialogue/ui/home/dialog/MoveDialogKt;->r(Lcom/zykj/student/dialogue/bean/resp/CatalogResp;ZLkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/util/List;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/lazy/LazyListScope;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/home/dialog/MoveDialogKt;->m(Ljava/util/List;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/lazy/LazyListScope;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/navigation/NavHostController;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Lcom/zykj/student/dialogue/ui/home/dialog/MoveDialogKt;->n(Landroidx/navigation/NavHostController;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/student/dialogue/ui/home/dialog/MoveDialogKt;->k(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/util/List;Landroidx/compose/runtime/MutableState;Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lcom/zykj/student/dialogue/ui/home/dialog/MoveDialogKt;->j(Ljava/util/List;Landroidx/compose/runtime/MutableState;Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/student/dialogue/ui/home/dialog/MoveDialogKt;->q(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/student/dialogue/ui/home/dialog/MoveDialogKt;->l(Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Landroidx/navigation/NavHostController;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 20

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move-object/from16 v4, p3

    .line 6
    .line 7
    move/from16 v6, p5

    .line 8
    .line 9
    const-string v0, "catalogList"

    .line 10
    .line 11
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "onNegativeClick"

    .line 15
    .line 16
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v0, "onPositiveClick"

    .line 20
    .line 21
    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const v0, 0x7c8bbb7f

    .line 25
    .line 26
    .line 27
    move-object/from16 v2, p4

    .line 28
    .line 29
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    and-int/lit8 v2, p6, 0x1

    .line 34
    .line 35
    const/4 v5, 0x2

    .line 36
    const/4 v8, 0x4

    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    or-int/lit8 v9, v6, 0x6

    .line 40
    .line 41
    move v10, v9

    .line 42
    move-object/from16 v9, p0

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    and-int/lit8 v9, v6, 0x6

    .line 46
    .line 47
    if-nez v9, :cond_2

    .line 48
    .line 49
    move-object/from16 v9, p0

    .line 50
    .line 51
    invoke-interface {v7, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v10

    .line 55
    if-eqz v10, :cond_1

    .line 56
    .line 57
    move v10, v8

    .line 58
    goto :goto_0

    .line 59
    :cond_1
    move v10, v5

    .line 60
    :goto_0
    or-int/2addr v10, v6

    .line 61
    goto :goto_1

    .line 62
    :cond_2
    move-object/from16 v9, p0

    .line 63
    .line 64
    move v10, v6

    .line 65
    :goto_1
    and-int/lit8 v11, v6, 0x30

    .line 66
    .line 67
    if-nez v11, :cond_4

    .line 68
    .line 69
    invoke-interface {v7, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v11

    .line 73
    if-eqz v11, :cond_3

    .line 74
    .line 75
    const/16 v11, 0x20

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_3
    const/16 v11, 0x10

    .line 79
    .line 80
    :goto_2
    or-int/2addr v10, v11

    .line 81
    :cond_4
    and-int/lit16 v11, v6, 0x180

    .line 82
    .line 83
    if-nez v11, :cond_6

    .line 84
    .line 85
    invoke-interface {v7, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v11

    .line 89
    if-eqz v11, :cond_5

    .line 90
    .line 91
    const/16 v11, 0x100

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_5
    const/16 v11, 0x80

    .line 95
    .line 96
    :goto_3
    or-int/2addr v10, v11

    .line 97
    :cond_6
    and-int/lit16 v11, v6, 0xc00

    .line 98
    .line 99
    if-nez v11, :cond_8

    .line 100
    .line 101
    invoke-interface {v7, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v11

    .line 105
    if-eqz v11, :cond_7

    .line 106
    .line 107
    const/16 v11, 0x800

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_7
    const/16 v11, 0x400

    .line 111
    .line 112
    :goto_4
    or-int/2addr v10, v11

    .line 113
    :cond_8
    and-int/lit16 v11, v10, 0x493

    .line 114
    .line 115
    const/16 v12, 0x492

    .line 116
    .line 117
    const/4 v13, 0x1

    .line 118
    if-eq v11, v12, :cond_9

    .line 119
    .line 120
    move v11, v13

    .line 121
    goto :goto_5

    .line 122
    :cond_9
    const/4 v11, 0x0

    .line 123
    :goto_5
    and-int/lit8 v12, v10, 0x1

    .line 124
    .line 125
    invoke-interface {v7, v11, v12}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 126
    .line 127
    .line 128
    move-result v11

    .line 129
    if-eqz v11, :cond_e

    .line 130
    .line 131
    const/4 v11, 0x0

    .line 132
    if-eqz v2, :cond_a

    .line 133
    .line 134
    move-object v3, v11

    .line 135
    goto :goto_6

    .line 136
    :cond_a
    move-object v3, v9

    .line 137
    :goto_6
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    if-eqz v2, :cond_b

    .line 142
    .line 143
    const/4 v2, -0x1

    .line 144
    const-string v9, "com.zykj.student.dialogue.ui.home.dialog.MoveDialog (MoveDialog.kt:37)"

    .line 145
    .line 146
    invoke-static {v0, v10, v2, v9}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 147
    .line 148
    .line 149
    :cond_b
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 154
    .line 155
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    if-ne v0, v2, :cond_c

    .line 160
    .line 161
    invoke-static {v11, v11, v5, v11}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    :cond_c
    move-object v2, v0

    .line 169
    check-cast v2, Landroidx/compose/runtime/MutableState;

    .line 170
    .line 171
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 172
    .line 173
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 174
    .line 175
    .line 176
    move-result-wide v9

    .line 177
    int-to-float v0, v8

    .line 178
    const/16 v5, 0x258

    .line 179
    .line 180
    int-to-float v5, v5

    .line 181
    div-float/2addr v0, v5

    .line 182
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 183
    .line 184
    .line 185
    move-result-object v8

    .line 186
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 187
    .line 188
    .line 189
    move-result-object v8

    .line 190
    iget v8, v8, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 191
    .line 192
    int-to-float v8, v8

    .line 193
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 194
    .line 195
    .line 196
    move-result-object v11

    .line 197
    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 198
    .line 199
    .line 200
    move-result-object v11

    .line 201
    iget v11, v11, Landroid/util/DisplayMetrics;->density:F

    .line 202
    .line 203
    div-float/2addr v8, v11

    .line 204
    mul-float/2addr v0, v8

    .line 205
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    invoke-static {v0}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 210
    .line 211
    .line 212
    move-result-object v8

    .line 213
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 214
    .line 215
    const/16 v11, 0xd8

    .line 216
    .line 217
    int-to-float v11, v11

    .line 218
    div-float/2addr v11, v5

    .line 219
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 220
    .line 221
    .line 222
    move-result-object v12

    .line 223
    invoke-virtual {v12}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 224
    .line 225
    .line 226
    move-result-object v12

    .line 227
    iget v12, v12, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 228
    .line 229
    int-to-float v12, v12

    .line 230
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 231
    .line 232
    .line 233
    move-result-object v14

    .line 234
    invoke-virtual {v14}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 235
    .line 236
    .line 237
    move-result-object v14

    .line 238
    iget v14, v14, Landroid/util/DisplayMetrics;->density:F

    .line 239
    .line 240
    div-float/2addr v12, v14

    .line 241
    mul-float/2addr v11, v12

    .line 242
    invoke-static {v11}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 243
    .line 244
    .line 245
    move-result v11

    .line 246
    const/16 v12, 0xa9

    .line 247
    .line 248
    int-to-float v12, v12

    .line 249
    div-float/2addr v12, v5

    .line 250
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 251
    .line 252
    .line 253
    move-result-object v5

    .line 254
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 255
    .line 256
    .line 257
    move-result-object v5

    .line 258
    iget v5, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 259
    .line 260
    int-to-float v5, v5

    .line 261
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 262
    .line 263
    .line 264
    move-result-object v14

    .line 265
    invoke-virtual {v14}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 266
    .line 267
    .line 268
    move-result-object v14

    .line 269
    iget v14, v14, Landroid/util/DisplayMetrics;->density:F

    .line 270
    .line 271
    div-float/2addr v5, v14

    .line 272
    mul-float/2addr v12, v5

    .line 273
    invoke-static {v12}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 274
    .line 275
    .line 276
    move-result v5

    .line 277
    invoke-static {v0, v11, v5}, Landroidx/compose/foundation/layout/SizeKt;->size-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 278
    .line 279
    .line 280
    move-result-object v11

    .line 281
    new-instance v0, Lu6/e;

    .line 282
    .line 283
    move-object v5, v4

    .line 284
    move-object/from16 v4, p2

    .line 285
    .line 286
    invoke-direct/range {v0 .. v5}, Lu6/e;-><init>(Ljava/util/List;Landroidx/compose/runtime/MutableState;Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    .line 287
    .line 288
    .line 289
    const/16 v1, 0x36

    .line 290
    .line 291
    const v2, -0x2b7be8bc

    .line 292
    .line 293
    .line 294
    invoke-static {v2, v13, v0, v7, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 295
    .line 296
    .line 297
    move-result-object v16

    .line 298
    const v18, 0xc00186

    .line 299
    .line 300
    .line 301
    const/16 v19, 0x78

    .line 302
    .line 303
    move-object/from16 v17, v7

    .line 304
    .line 305
    move-object v7, v11

    .line 306
    const-wide/16 v11, 0x0

    .line 307
    .line 308
    const/4 v13, 0x0

    .line 309
    const/4 v14, 0x0

    .line 310
    const/4 v15, 0x0

    .line 311
    invoke-static/range {v7 .. v19}, Landroidx/compose/material3/SurfaceKt;->Surface-T9BRK9s(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    .line 312
    .line 313
    .line 314
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 315
    .line 316
    .line 317
    move-result v0

    .line 318
    if-eqz v0, :cond_d

    .line 319
    .line 320
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 321
    .line 322
    .line 323
    :cond_d
    move-object v1, v3

    .line 324
    goto :goto_7

    .line 325
    :cond_e
    move-object/from16 v17, v7

    .line 326
    .line 327
    invoke-interface/range {v17 .. v17}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 328
    .line 329
    .line 330
    move-object v1, v9

    .line 331
    :goto_7
    invoke-interface/range {v17 .. v17}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 332
    .line 333
    .line 334
    move-result-object v7

    .line 335
    if-eqz v7, :cond_f

    .line 336
    .line 337
    new-instance v0, Lu6/f;

    .line 338
    .line 339
    move-object/from16 v2, p1

    .line 340
    .line 341
    move-object/from16 v3, p2

    .line 342
    .line 343
    move-object/from16 v4, p3

    .line 344
    .line 345
    move v5, v6

    .line 346
    move/from16 v6, p6

    .line 347
    .line 348
    invoke-direct/range {v0 .. v6}, Lu6/f;-><init>(Landroidx/navigation/NavHostController;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;II)V

    .line 349
    .line 350
    .line 351
    invoke-interface {v7, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 352
    .line 353
    .line 354
    :cond_f
    return-void
.end method

.method public static final i(Landroidx/compose/runtime/MutableState;)Lcom/zykj/student/dialogue/bean/resp/CatalogResp;
    .locals 0

    .line 1
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    .line 6
    .line 7
    return-object p0
.end method

.method public static final j(Ljava/util/List;Landroidx/compose/runtime/MutableState;Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 37

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
    move-object/from16 v13, p5

    .line 8
    .line 9
    move/from16 v5, p6

    .line 10
    .line 11
    and-int/lit8 v6, v5, 0x3

    .line 12
    .line 13
    const/4 v7, 0x1

    .line 14
    const/4 v8, 0x0

    .line 15
    const/4 v9, 0x2

    .line 16
    if-eq v6, v9, :cond_0

    .line 17
    .line 18
    move v6, v7

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v6, v8

    .line 21
    :goto_0
    and-int/lit8 v10, v5, 0x1

    .line 22
    .line 23
    invoke-interface {v13, v6, v10}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    if-eqz v6, :cond_10

    .line 28
    .line 29
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    if-eqz v6, :cond_1

    .line 34
    .line 35
    const/4 v6, -0x1

    .line 36
    const-string v10, "com.zykj.student.dialogue.ui.home.dialog.MoveDialog.<anonymous> (MoveDialog.kt:46)"

    .line 37
    .line 38
    const v11, -0x2b7be8bc

    .line 39
    .line 40
    .line 41
    invoke-static {v11, v5, v6, v10}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    sget-object v30, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 45
    .line 46
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/ui/Alignment$Companion;->getCenterHorizontally()Landroidx/compose/ui/Alignment$Horizontal;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    sget-object v6, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 51
    .line 52
    const/16 v10, 0x13

    .line 53
    .line 54
    int-to-float v10, v10

    .line 55
    const/16 v11, 0x258

    .line 56
    .line 57
    int-to-float v11, v11

    .line 58
    div-float/2addr v10, v11

    .line 59
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 60
    .line 61
    .line 62
    move-result-object v12

    .line 63
    invoke-virtual {v12}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 64
    .line 65
    .line 66
    move-result-object v12

    .line 67
    iget v12, v12, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 68
    .line 69
    int-to-float v12, v12

    .line 70
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 71
    .line 72
    .line 73
    move-result-object v14

    .line 74
    invoke-virtual {v14}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 75
    .line 76
    .line 77
    move-result-object v14

    .line 78
    iget v14, v14, Landroid/util/DisplayMetrics;->density:F

    .line 79
    .line 80
    div-float/2addr v12, v14

    .line 81
    mul-float/2addr v10, v12

    .line 82
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    const/4 v12, 0x0

    .line 87
    const/4 v14, 0x0

    .line 88
    invoke-static {v6, v14, v10, v7, v12}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    sget-object v31, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 93
    .line 94
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 95
    .line 96
    .line 97
    move-result-object v10

    .line 98
    const/16 v12, 0x30

    .line 99
    .line 100
    invoke-static {v10, v5, v13, v12}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    invoke-static {v13, v8}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 105
    .line 106
    .line 107
    move-result v10

    .line 108
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 109
    .line 110
    .line 111
    move-result-object v12

    .line 112
    invoke-static {v13, v7}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 113
    .line 114
    .line 115
    move-result-object v7

    .line 116
    sget-object v32, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 117
    .line 118
    invoke-virtual/range {v32 .. v32}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 119
    .line 120
    .line 121
    move-result-object v14

    .line 122
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 123
    .line 124
    .line 125
    move-result-object v15

    .line 126
    if-nez v15, :cond_2

    .line 127
    .line 128
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 129
    .line 130
    .line 131
    :cond_2
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 132
    .line 133
    .line 134
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 135
    .line 136
    .line 137
    move-result v15

    .line 138
    if-eqz v15, :cond_3

    .line 139
    .line 140
    invoke-interface {v13, v14}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 141
    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_3
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 145
    .line 146
    .line 147
    :goto_1
    invoke-static {v13}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 148
    .line 149
    .line 150
    move-result-object v14

    .line 151
    invoke-virtual/range {v32 .. v32}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 152
    .line 153
    .line 154
    move-result-object v15

    .line 155
    invoke-static {v14, v5, v15}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual/range {v32 .. v32}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    invoke-static {v14, v12, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v32 .. v32}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 170
    .line 171
    .line 172
    move-result v12

    .line 173
    if-nez v12, :cond_4

    .line 174
    .line 175
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v12

    .line 179
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 180
    .line 181
    .line 182
    move-result-object v15

    .line 183
    invoke-static {v12, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v12

    .line 187
    if-nez v12, :cond_5

    .line 188
    .line 189
    :cond_4
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 190
    .line 191
    .line 192
    move-result-object v12

    .line 193
    invoke-interface {v14, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 197
    .line 198
    .line 199
    move-result-object v10

    .line 200
    invoke-interface {v14, v10, v5}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 201
    .line 202
    .line 203
    :cond_5
    invoke-virtual/range {v32 .. v32}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 204
    .line 205
    .line 206
    move-result-object v5

    .line 207
    invoke-static {v14, v7, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 208
    .line 209
    .line 210
    sget-object v33, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 211
    .line 212
    move v5, v8

    .line 213
    invoke-static {}, Lv6/a;->a()J

    .line 214
    .line 215
    .line 216
    move-result-wide v7

    .line 217
    const/16 v10, 0x8

    .line 218
    .line 219
    invoke-static {v10}, Li6/b;->d(I)J

    .line 220
    .line 221
    .line 222
    move-result-wide v14

    .line 223
    sget-object v10, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    .line 224
    .line 225
    invoke-virtual {v10}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getMedium()Landroidx/compose/ui/text/font/FontWeight;

    .line 226
    .line 227
    .line 228
    move-result-object v12

    .line 229
    const/16 v28, 0x0

    .line 230
    .line 231
    const v29, 0x1ffd2

    .line 232
    .line 233
    .line 234
    move v10, v5

    .line 235
    const-string v5, "\u79fb\u52a8\u81f3"

    .line 236
    .line 237
    move-object/from16 v16, v6

    .line 238
    .line 239
    const/4 v6, 0x0

    .line 240
    move/from16 v17, v11

    .line 241
    .line 242
    const/4 v11, 0x0

    .line 243
    const/4 v13, 0x0

    .line 244
    move/from16 v19, v9

    .line 245
    .line 246
    move/from16 v18, v10

    .line 247
    .line 248
    move-wide v9, v14

    .line 249
    const-wide/16 v14, 0x0

    .line 250
    .line 251
    move-object/from16 v20, v16

    .line 252
    .line 253
    const/16 v16, 0x0

    .line 254
    .line 255
    move/from16 v21, v17

    .line 256
    .line 257
    const/16 v17, 0x0

    .line 258
    .line 259
    move/from16 v22, v18

    .line 260
    .line 261
    move/from16 v23, v19

    .line 262
    .line 263
    const-wide/16 v18, 0x0

    .line 264
    .line 265
    move-object/from16 v24, v20

    .line 266
    .line 267
    const/16 v20, 0x0

    .line 268
    .line 269
    move/from16 v25, v21

    .line 270
    .line 271
    const/16 v21, 0x0

    .line 272
    .line 273
    move/from16 v26, v22

    .line 274
    .line 275
    const/16 v22, 0x0

    .line 276
    .line 277
    move/from16 v27, v23

    .line 278
    .line 279
    const/16 v23, 0x0

    .line 280
    .line 281
    move-object/from16 v34, v24

    .line 282
    .line 283
    const/16 v24, 0x0

    .line 284
    .line 285
    move/from16 v35, v25

    .line 286
    .line 287
    const/16 v25, 0x0

    .line 288
    .line 289
    move/from16 v36, v27

    .line 290
    .line 291
    const v27, 0x30d86

    .line 292
    .line 293
    .line 294
    move-object/from16 v26, p5

    .line 295
    .line 296
    move-object/from16 v4, v34

    .line 297
    .line 298
    move/from16 v3, v36

    .line 299
    .line 300
    invoke-static/range {v5 .. v29}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 301
    .line 302
    .line 303
    move-object/from16 v5, v26

    .line 304
    .line 305
    int-to-float v3, v3

    .line 306
    div-float v3, v3, v35

    .line 307
    .line 308
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 309
    .line 310
    .line 311
    move-result-object v6

    .line 312
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 313
    .line 314
    .line 315
    move-result-object v6

    .line 316
    iget v6, v6, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 317
    .line 318
    int-to-float v6, v6

    .line 319
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 320
    .line 321
    .line 322
    move-result-object v7

    .line 323
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 324
    .line 325
    .line 326
    move-result-object v7

    .line 327
    iget v7, v7, Landroid/util/DisplayMetrics;->density:F

    .line 328
    .line 329
    div-float/2addr v6, v7

    .line 330
    mul-float/2addr v3, v6

    .line 331
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 332
    .line 333
    .line 334
    move-result v3

    .line 335
    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 336
    .line 337
    .line 338
    move-result-object v3

    .line 339
    const/4 v6, 0x6

    .line 340
    invoke-static {v3, v5, v6}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 341
    .line 342
    .line 343
    const/4 v14, 0x2

    .line 344
    const/4 v15, 0x0

    .line 345
    const/high16 v12, 0x3f800000    # 1.0f

    .line 346
    .line 347
    const/4 v13, 0x0

    .line 348
    move-object v11, v4

    .line 349
    move-object/from16 v10, v33

    .line 350
    .line 351
    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/layout/ColumnScope;->weight$default(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 352
    .line 353
    .line 354
    move-result-object v3

    .line 355
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    move-result v7

    .line 359
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v8

    .line 363
    if-nez v7, :cond_6

    .line 364
    .line 365
    sget-object v7, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 366
    .line 367
    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v7

    .line 371
    if-ne v8, v7, :cond_7

    .line 372
    .line 373
    :cond_6
    new-instance v8, Lu6/g;

    .line 374
    .line 375
    invoke-direct {v8, v0, v1}, Lu6/g;-><init>(Ljava/util/List;Landroidx/compose/runtime/MutableState;)V

    .line 376
    .line 377
    .line 378
    invoke-interface {v5, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 379
    .line 380
    .line 381
    :cond_7
    move-object v14, v8

    .line 382
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 383
    .line 384
    const/16 v16, 0x0

    .line 385
    .line 386
    const/16 v17, 0x1fe

    .line 387
    .line 388
    move v0, v6

    .line 389
    const/4 v6, 0x0

    .line 390
    const/4 v7, 0x0

    .line 391
    const/4 v8, 0x0

    .line 392
    const/4 v9, 0x0

    .line 393
    const/4 v10, 0x0

    .line 394
    const/4 v11, 0x0

    .line 395
    const/4 v12, 0x0

    .line 396
    const/4 v13, 0x0

    .line 397
    move-object v15, v5

    .line 398
    move-object v5, v3

    .line 399
    invoke-static/range {v5 .. v17}, Landroidx/compose/foundation/lazy/LazyDslKt;->LazyColumn(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    .line 400
    .line 401
    .line 402
    move-object v13, v15

    .line 403
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 404
    .line 405
    .line 406
    move-result-object v3

    .line 407
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    .line 408
    .line 409
    .line 410
    move-result-object v5

    .line 411
    const/4 v10, 0x0

    .line 412
    invoke-static {v3, v5, v13, v10}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 413
    .line 414
    .line 415
    move-result-object v3

    .line 416
    invoke-static {v13, v10}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 417
    .line 418
    .line 419
    move-result v5

    .line 420
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 421
    .line 422
    .line 423
    move-result-object v6

    .line 424
    invoke-static {v13, v4}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 425
    .line 426
    .line 427
    move-result-object v7

    .line 428
    invoke-virtual/range {v32 .. v32}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 429
    .line 430
    .line 431
    move-result-object v8

    .line 432
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 433
    .line 434
    .line 435
    move-result-object v9

    .line 436
    if-nez v9, :cond_8

    .line 437
    .line 438
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 439
    .line 440
    .line 441
    :cond_8
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 442
    .line 443
    .line 444
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 445
    .line 446
    .line 447
    move-result v9

    .line 448
    if-eqz v9, :cond_9

    .line 449
    .line 450
    invoke-interface {v13, v8}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 451
    .line 452
    .line 453
    goto :goto_2

    .line 454
    :cond_9
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 455
    .line 456
    .line 457
    :goto_2
    invoke-static {v13}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 458
    .line 459
    .line 460
    move-result-object v8

    .line 461
    invoke-virtual/range {v32 .. v32}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 462
    .line 463
    .line 464
    move-result-object v9

    .line 465
    invoke-static {v8, v3, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 466
    .line 467
    .line 468
    invoke-virtual/range {v32 .. v32}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 469
    .line 470
    .line 471
    move-result-object v3

    .line 472
    invoke-static {v8, v6, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 473
    .line 474
    .line 475
    invoke-virtual/range {v32 .. v32}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 476
    .line 477
    .line 478
    move-result-object v3

    .line 479
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 480
    .line 481
    .line 482
    move-result v6

    .line 483
    if-nez v6, :cond_a

    .line 484
    .line 485
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v6

    .line 489
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 490
    .line 491
    .line 492
    move-result-object v9

    .line 493
    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 494
    .line 495
    .line 496
    move-result v6

    .line 497
    if-nez v6, :cond_b

    .line 498
    .line 499
    :cond_a
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 500
    .line 501
    .line 502
    move-result-object v6

    .line 503
    invoke-interface {v8, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 504
    .line 505
    .line 506
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 507
    .line 508
    .line 509
    move-result-object v5

    .line 510
    invoke-interface {v8, v5, v3}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 511
    .line 512
    .line 513
    :cond_b
    invoke-virtual/range {v32 .. v32}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 514
    .line 515
    .line 516
    move-result-object v3

    .line 517
    invoke-static {v8, v7, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 518
    .line 519
    .line 520
    sget-object v3, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 521
    .line 522
    sget-object v3, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 523
    .line 524
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 525
    .line 526
    .line 527
    move-result-wide v11

    .line 528
    invoke-static {}, Lv6/a;->k()J

    .line 529
    .line 530
    .line 531
    move-result-wide v7

    .line 532
    const/16 v5, 0xc

    .line 533
    .line 534
    int-to-float v5, v5

    .line 535
    div-float v21, v5, v35

    .line 536
    .line 537
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 538
    .line 539
    .line 540
    move-result-object v5

    .line 541
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 542
    .line 543
    .line 544
    move-result-object v5

    .line 545
    iget v5, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 546
    .line 547
    int-to-float v5, v5

    .line 548
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 549
    .line 550
    .line 551
    move-result-object v6

    .line 552
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 553
    .line 554
    .line 555
    move-result-object v6

    .line 556
    iget v6, v6, Landroid/util/DisplayMetrics;->density:F

    .line 557
    .line 558
    div-float/2addr v5, v6

    .line 559
    mul-float v5, v5, v21

    .line 560
    .line 561
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 562
    .line 563
    .line 564
    move-result v5

    .line 565
    invoke-static {v5}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 566
    .line 567
    .line 568
    move-result-object v6

    .line 569
    const/16 v5, 0x38

    .line 570
    .line 571
    int-to-float v5, v5

    .line 572
    div-float v22, v5, v35

    .line 573
    .line 574
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 575
    .line 576
    .line 577
    move-result-object v5

    .line 578
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 579
    .line 580
    .line 581
    move-result-object v5

    .line 582
    iget v5, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 583
    .line 584
    int-to-float v5, v5

    .line 585
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 586
    .line 587
    .line 588
    move-result-object v9

    .line 589
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 590
    .line 591
    .line 592
    move-result-object v9

    .line 593
    iget v9, v9, Landroid/util/DisplayMetrics;->density:F

    .line 594
    .line 595
    div-float/2addr v5, v9

    .line 596
    mul-float v5, v5, v22

    .line 597
    .line 598
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 599
    .line 600
    .line 601
    move-result v5

    .line 602
    const/16 v9, 0x17

    .line 603
    .line 604
    int-to-float v9, v9

    .line 605
    div-float v23, v9, v35

    .line 606
    .line 607
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 608
    .line 609
    .line 610
    move-result-object v9

    .line 611
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 612
    .line 613
    .line 614
    move-result-object v9

    .line 615
    iget v9, v9, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 616
    .line 617
    int-to-float v9, v9

    .line 618
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 619
    .line 620
    .line 621
    move-result-object v10

    .line 622
    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 623
    .line 624
    .line 625
    move-result-object v10

    .line 626
    iget v10, v10, Landroid/util/DisplayMetrics;->density:F

    .line 627
    .line 628
    div-float/2addr v9, v10

    .line 629
    mul-float v9, v9, v23

    .line 630
    .line 631
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 632
    .line 633
    .line 634
    move-result v9

    .line 635
    invoke-static {v4, v5, v9}, Landroidx/compose/foundation/layout/SizeKt;->size-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 636
    .line 637
    .line 638
    move-result-object v5

    .line 639
    const/high16 v9, 0x3f800000    # 1.0f

    .line 640
    .line 641
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 642
    .line 643
    .line 644
    move-result v9

    .line 645
    invoke-static {}, Lv6/a;->k()J

    .line 646
    .line 647
    .line 648
    move-result-wide v14

    .line 649
    invoke-static {v9, v14, v15}, Landroidx/compose/foundation/BorderStrokeKt;->BorderStroke-cXLIe8U(FJ)Landroidx/compose/foundation/BorderStroke;

    .line 650
    .line 651
    .line 652
    move-result-object v14

    .line 653
    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 654
    .line 655
    .line 656
    move-result v9

    .line 657
    move-object/from16 v10, p3

    .line 658
    .line 659
    invoke-interface {v13, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 660
    .line 661
    .line 662
    move-result v15

    .line 663
    or-int/2addr v9, v15

    .line 664
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 665
    .line 666
    .line 667
    move-result-object v15

    .line 668
    if-nez v9, :cond_c

    .line 669
    .line 670
    sget-object v9, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 671
    .line 672
    invoke-virtual {v9}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 673
    .line 674
    .line 675
    move-result-object v9

    .line 676
    if-ne v15, v9, :cond_d

    .line 677
    .line 678
    :cond_c
    new-instance v15, Lu6/h;

    .line 679
    .line 680
    invoke-direct {v15, v2, v10}, Lu6/h;-><init>(Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function0;)V

    .line 681
    .line 682
    .line 683
    invoke-interface {v13, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 684
    .line 685
    .line 686
    :cond_d
    move-object/from16 v17, v15

    .line 687
    .line 688
    check-cast v17, Lkotlin/jvm/functions/Function0;

    .line 689
    .line 690
    const v19, 0x1b6186

    .line 691
    .line 692
    .line 693
    const/16 v20, 0x188

    .line 694
    .line 695
    const-wide/16 v9, 0x0

    .line 696
    .line 697
    const-string v13, "\u53d6\u6d88"

    .line 698
    .line 699
    const/4 v15, 0x0

    .line 700
    const/16 v16, 0x0

    .line 701
    .line 702
    move-object/from16 v18, p5

    .line 703
    .line 704
    invoke-static/range {v5 .. v20}, Lx6/g;->e(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJJLjava/lang/String;Landroidx/compose/foundation/BorderStroke;ZLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    .line 705
    .line 706
    .line 707
    move-object/from16 v13, v18

    .line 708
    .line 709
    const/16 v2, 0x1c

    .line 710
    .line 711
    int-to-float v2, v2

    .line 712
    div-float v2, v2, v35

    .line 713
    .line 714
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 715
    .line 716
    .line 717
    move-result-object v5

    .line 718
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 719
    .line 720
    .line 721
    move-result-object v5

    .line 722
    iget v5, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 723
    .line 724
    int-to-float v5, v5

    .line 725
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 726
    .line 727
    .line 728
    move-result-object v6

    .line 729
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 730
    .line 731
    .line 732
    move-result-object v6

    .line 733
    iget v6, v6, Landroid/util/DisplayMetrics;->density:F

    .line 734
    .line 735
    div-float/2addr v5, v6

    .line 736
    mul-float/2addr v2, v5

    .line 737
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 738
    .line 739
    .line 740
    move-result v2

    .line 741
    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 742
    .line 743
    .line 744
    move-result-object v2

    .line 745
    invoke-static {v2, v13, v0}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 746
    .line 747
    .line 748
    invoke-static {}, Lv6/a;->k()J

    .line 749
    .line 750
    .line 751
    move-result-wide v6

    .line 752
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 753
    .line 754
    .line 755
    move-result-wide v2

    .line 756
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 757
    .line 758
    .line 759
    move-result-object v0

    .line 760
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 761
    .line 762
    .line 763
    move-result-object v0

    .line 764
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 765
    .line 766
    int-to-float v0, v0

    .line 767
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 768
    .line 769
    .line 770
    move-result-object v5

    .line 771
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 772
    .line 773
    .line 774
    move-result-object v5

    .line 775
    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    .line 776
    .line 777
    div-float/2addr v0, v5

    .line 778
    mul-float v21, v21, v0

    .line 779
    .line 780
    invoke-static/range {v21 .. v21}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 781
    .line 782
    .line 783
    move-result v0

    .line 784
    invoke-static {v0}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 785
    .line 786
    .line 787
    move-result-object v0

    .line 788
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 789
    .line 790
    .line 791
    move-result-object v5

    .line 792
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 793
    .line 794
    .line 795
    move-result-object v5

    .line 796
    iget v5, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 797
    .line 798
    int-to-float v5, v5

    .line 799
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 800
    .line 801
    .line 802
    move-result-object v8

    .line 803
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 804
    .line 805
    .line 806
    move-result-object v8

    .line 807
    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    .line 808
    .line 809
    div-float/2addr v5, v8

    .line 810
    mul-float v22, v22, v5

    .line 811
    .line 812
    invoke-static/range {v22 .. v22}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 813
    .line 814
    .line 815
    move-result v5

    .line 816
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 817
    .line 818
    .line 819
    move-result-object v8

    .line 820
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 821
    .line 822
    .line 823
    move-result-object v8

    .line 824
    iget v8, v8, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 825
    .line 826
    int-to-float v8, v8

    .line 827
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 828
    .line 829
    .line 830
    move-result-object v9

    .line 831
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 832
    .line 833
    .line 834
    move-result-object v9

    .line 835
    iget v9, v9, Landroid/util/DisplayMetrics;->density:F

    .line 836
    .line 837
    div-float/2addr v8, v9

    .line 838
    mul-float v23, v23, v8

    .line 839
    .line 840
    invoke-static/range {v23 .. v23}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 841
    .line 842
    .line 843
    move-result v8

    .line 844
    invoke-static {v4, v5, v8}, Landroidx/compose/foundation/layout/SizeKt;->size-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 845
    .line 846
    .line 847
    move-result-object v4

    .line 848
    move-object/from16 v5, p4

    .line 849
    .line 850
    invoke-interface {v13, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 851
    .line 852
    .line 853
    move-result v8

    .line 854
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 855
    .line 856
    .line 857
    move-result-object v9

    .line 858
    if-nez v8, :cond_e

    .line 859
    .line 860
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 861
    .line 862
    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 863
    .line 864
    .line 865
    move-result-object v8

    .line 866
    if-ne v9, v8, :cond_f

    .line 867
    .line 868
    :cond_e
    new-instance v9, Lu6/i;

    .line 869
    .line 870
    invoke-direct {v9, v5, v1}, Lu6/i;-><init>(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;)V

    .line 871
    .line 872
    .line 873
    invoke-interface {v13, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 874
    .line 875
    .line 876
    :cond_f
    move-object v12, v9

    .line 877
    check-cast v12, Lkotlin/jvm/functions/Function0;

    .line 878
    .line 879
    const v14, 0x36186

    .line 880
    .line 881
    .line 882
    const/16 v15, 0x1c8

    .line 883
    .line 884
    move-object v1, v0

    .line 885
    move-object v0, v4

    .line 886
    const-wide/16 v4, 0x0

    .line 887
    .line 888
    const-string v8, "\u786e\u5b9a"

    .line 889
    .line 890
    const/4 v9, 0x0

    .line 891
    const/4 v10, 0x0

    .line 892
    const/4 v11, 0x0

    .line 893
    invoke-static/range {v0 .. v15}, Lx6/g;->e(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJJLjava/lang/String;Landroidx/compose/foundation/BorderStroke;ZLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    .line 894
    .line 895
    .line 896
    invoke-interface/range {p5 .. p5}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 897
    .line 898
    .line 899
    invoke-interface/range {p5 .. p5}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 900
    .line 901
    .line 902
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 903
    .line 904
    .line 905
    move-result v0

    .line 906
    if-eqz v0, :cond_11

    .line 907
    .line 908
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 909
    .line 910
    .line 911
    goto :goto_3

    .line 912
    :cond_10
    invoke-interface/range {p5 .. p5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 913
    .line 914
    .line 915
    :cond_11
    :goto_3
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 916
    .line 917
    return-object v0
.end method

.method public static final k(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/home/dialog/MoveDialogKt;->i(Landroidx/compose/runtime/MutableState;)Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->getId()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    :goto_0
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 21
    .line 22
    return-object p0
.end method

.method public static final l(Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 4
    .line 5
    .line 6
    :cond_0
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 10
    .line 11
    return-object p0
.end method

.method public static final m(Ljava/util/List;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/lazy/LazyListScope;)Lkotlin/Unit;
    .locals 3

    .line 1
    const-string v0, "$this$LazyColumn"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    new-instance v1, Lcom/zykj/student/dialogue/ui/home/dialog/MoveDialogKt$MoveDialog$lambda$13$lambda$12$lambda$6$lambda$5$$inlined$itemsIndexed$default$2;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Lcom/zykj/student/dialogue/ui/home/dialog/MoveDialogKt$MoveDialog$lambda$13$lambda$12$lambda$6$lambda$5$$inlined$itemsIndexed$default$2;-><init>(Ljava/util/List;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/zykj/student/dialogue/ui/home/dialog/MoveDialogKt$MoveDialog$lambda$13$lambda$12$lambda$6$lambda$5$$inlined$itemsIndexed$default$3;

    .line 16
    .line 17
    invoke-direct {v2, p0, p0, p1}, Lcom/zykj/student/dialogue/ui/home/dialog/MoveDialogKt$MoveDialog$lambda$13$lambda$12$lambda$6$lambda$5$$inlined$itemsIndexed$default$3;-><init>(Ljava/util/List;Ljava/util/List;Landroidx/compose/runtime/MutableState;)V

    .line 18
    .line 19
    .line 20
    const p0, -0x410876af

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    invoke-static {p0, p1, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const/4 p1, 0x0

    .line 29
    invoke-interface {p2, v0, p1, v1, p0}, Landroidx/compose/foundation/lazy/LazyListScope;->items(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 33
    .line 34
    return-object p0
.end method

.method public static final n(Landroidx/navigation/NavHostController;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 7

    .line 1
    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lcom/zykj/student/dialogue/ui/home/dialog/MoveDialogKt;->h(Landroidx/navigation/NavHostController;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final o(Landroidx/compose/runtime/MutableState;Lcom/zykj/student/dialogue/bean/resp/CatalogResp;)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final p(Lcom/zykj/student/dialogue/bean/resp/CatalogResp;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p4

    .line 8
    .line 9
    const-string v4, "catalogResp"

    .line 10
    .line 11
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v4, "onClick"

    .line 15
    .line 16
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const v4, 0x18bde839

    .line 20
    .line 21
    .line 22
    move-object/from16 v5, p3

    .line 23
    .line 24
    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 25
    .line 26
    .line 27
    move-result-object v12

    .line 28
    and-int/lit8 v5, v3, 0x6

    .line 29
    .line 30
    const/4 v6, 0x2

    .line 31
    if-nez v5, :cond_1

    .line 32
    .line 33
    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_0

    .line 38
    .line 39
    const/4 v5, 0x4

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move v5, v6

    .line 42
    :goto_0
    or-int/2addr v5, v3

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move v5, v3

    .line 45
    :goto_1
    and-int/lit8 v7, v3, 0x30

    .line 46
    .line 47
    if-nez v7, :cond_3

    .line 48
    .line 49
    invoke-interface {v12, v1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    if-eqz v7, :cond_2

    .line 54
    .line 55
    const/16 v7, 0x20

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    const/16 v7, 0x10

    .line 59
    .line 60
    :goto_2
    or-int/2addr v5, v7

    .line 61
    :cond_3
    and-int/lit16 v7, v3, 0x180

    .line 62
    .line 63
    const/16 v8, 0x100

    .line 64
    .line 65
    if-nez v7, :cond_5

    .line 66
    .line 67
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    if-eqz v7, :cond_4

    .line 72
    .line 73
    move v7, v8

    .line 74
    goto :goto_3

    .line 75
    :cond_4
    const/16 v7, 0x80

    .line 76
    .line 77
    :goto_3
    or-int/2addr v5, v7

    .line 78
    :cond_5
    and-int/lit16 v7, v5, 0x93

    .line 79
    .line 80
    const/16 v9, 0x92

    .line 81
    .line 82
    const/4 v10, 0x1

    .line 83
    const/4 v11, 0x0

    .line 84
    if-eq v7, v9, :cond_6

    .line 85
    .line 86
    move v7, v10

    .line 87
    goto :goto_4

    .line 88
    :cond_6
    move v7, v11

    .line 89
    :goto_4
    and-int/lit8 v9, v5, 0x1

    .line 90
    .line 91
    invoke-interface {v12, v7, v9}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    if-eqz v7, :cond_11

    .line 96
    .line 97
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 98
    .line 99
    .line 100
    move-result v7

    .line 101
    if-eqz v7, :cond_7

    .line 102
    .line 103
    const/4 v7, -0x1

    .line 104
    const-string v9, "com.zykj.student.dialogue.ui.home.dialog.MoveDialogItem (MoveDialog.kt:96)"

    .line 105
    .line 106
    invoke-static {v4, v5, v7, v9}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 107
    .line 108
    .line 109
    :cond_7
    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 110
    .line 111
    const/16 v7, 0x1a

    .line 112
    .line 113
    int-to-float v7, v7

    .line 114
    const/16 v9, 0x258

    .line 115
    .line 116
    int-to-float v9, v9

    .line 117
    div-float/2addr v7, v9

    .line 118
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 119
    .line 120
    .line 121
    move-result-object v13

    .line 122
    invoke-virtual {v13}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 123
    .line 124
    .line 125
    move-result-object v13

    .line 126
    iget v13, v13, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 127
    .line 128
    int-to-float v13, v13

    .line 129
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 130
    .line 131
    .line 132
    move-result-object v14

    .line 133
    invoke-virtual {v14}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 134
    .line 135
    .line 136
    move-result-object v14

    .line 137
    iget v14, v14, Landroid/util/DisplayMetrics;->density:F

    .line 138
    .line 139
    div-float/2addr v13, v14

    .line 140
    mul-float/2addr v7, v13

    .line 141
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 142
    .line 143
    .line 144
    move-result v7

    .line 145
    invoke-static {v4, v7}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    const/4 v13, 0x0

    .line 150
    const/4 v14, 0x0

    .line 151
    invoke-static {v7, v13, v10, v14}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 152
    .line 153
    .line 154
    move-result-object v15

    .line 155
    and-int/lit16 v5, v5, 0x380

    .line 156
    .line 157
    if-ne v5, v8, :cond_8

    .line 158
    .line 159
    goto :goto_5

    .line 160
    :cond_8
    move v10, v11

    .line 161
    :goto_5
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    if-nez v10, :cond_9

    .line 166
    .line 167
    sget-object v7, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 168
    .line 169
    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v7

    .line 173
    if-ne v5, v7, :cond_a

    .line 174
    .line 175
    :cond_9
    new-instance v5, Lu6/j;

    .line 176
    .line 177
    invoke-direct {v5, v2}, Lu6/j;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 178
    .line 179
    .line 180
    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    :cond_a
    move-object/from16 v19, v5

    .line 184
    .line 185
    check-cast v19, Lkotlin/jvm/functions/Function0;

    .line 186
    .line 187
    const/16 v20, 0x7

    .line 188
    .line 189
    const/16 v21, 0x0

    .line 190
    .line 191
    const/16 v16, 0x0

    .line 192
    .line 193
    const/16 v17, 0x0

    .line 194
    .line 195
    const/16 v18, 0x0

    .line 196
    .line 197
    invoke-static/range {v15 .. v21}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    const/16 v7, 0x9

    .line 202
    .line 203
    int-to-float v7, v7

    .line 204
    div-float v30, v7, v9

    .line 205
    .line 206
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 207
    .line 208
    .line 209
    move-result-object v7

    .line 210
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 211
    .line 212
    .line 213
    move-result-object v7

    .line 214
    iget v7, v7, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 215
    .line 216
    int-to-float v7, v7

    .line 217
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 218
    .line 219
    .line 220
    move-result-object v8

    .line 221
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 222
    .line 223
    .line 224
    move-result-object v8

    .line 225
    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    .line 226
    .line 227
    div-float/2addr v7, v8

    .line 228
    mul-float v7, v7, v30

    .line 229
    .line 230
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 231
    .line 232
    .line 233
    move-result v7

    .line 234
    invoke-static {v5, v7, v13, v6, v14}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 235
    .line 236
    .line 237
    move-result-object v5

    .line 238
    sget-object v31, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 239
    .line 240
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 241
    .line 242
    .line 243
    move-result-object v6

    .line 244
    invoke-static {v6, v11}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 245
    .line 246
    .line 247
    move-result-object v6

    .line 248
    invoke-static {v12, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 249
    .line 250
    .line 251
    move-result v7

    .line 252
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 253
    .line 254
    .line 255
    move-result-object v8

    .line 256
    invoke-static {v12, v5}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 257
    .line 258
    .line 259
    move-result-object v5

    .line 260
    sget-object v9, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 261
    .line 262
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 263
    .line 264
    .line 265
    move-result-object v10

    .line 266
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 267
    .line 268
    .line 269
    move-result-object v13

    .line 270
    if-nez v13, :cond_b

    .line 271
    .line 272
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 273
    .line 274
    .line 275
    :cond_b
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 276
    .line 277
    .line 278
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 279
    .line 280
    .line 281
    move-result v13

    .line 282
    if-eqz v13, :cond_c

    .line 283
    .line 284
    invoke-interface {v12, v10}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 285
    .line 286
    .line 287
    goto :goto_6

    .line 288
    :cond_c
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 289
    .line 290
    .line 291
    :goto_6
    invoke-static {v12}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 292
    .line 293
    .line 294
    move-result-object v10

    .line 295
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 296
    .line 297
    .line 298
    move-result-object v13

    .line 299
    invoke-static {v10, v6, v13}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 303
    .line 304
    .line 305
    move-result-object v6

    .line 306
    invoke-static {v10, v8, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 310
    .line 311
    .line 312
    move-result-object v6

    .line 313
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 314
    .line 315
    .line 316
    move-result v8

    .line 317
    if-nez v8, :cond_d

    .line 318
    .line 319
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v8

    .line 323
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 324
    .line 325
    .line 326
    move-result-object v13

    .line 327
    invoke-static {v8, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    move-result v8

    .line 331
    if-nez v8, :cond_e

    .line 332
    .line 333
    :cond_d
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 334
    .line 335
    .line 336
    move-result-object v8

    .line 337
    invoke-interface {v10, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 338
    .line 339
    .line 340
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 341
    .line 342
    .line 343
    move-result-object v7

    .line 344
    invoke-interface {v10, v7, v6}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 345
    .line 346
    .line 347
    :cond_e
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 348
    .line 349
    .line 350
    move-result-object v6

    .line 351
    invoke-static {v10, v5, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 352
    .line 353
    .line 354
    sget-object v5, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 355
    .line 356
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->getName()Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v6

    .line 360
    const/4 v7, 0x7

    .line 361
    invoke-static {v7}, Li6/b;->d(I)J

    .line 362
    .line 363
    .line 364
    move-result-wide v9

    .line 365
    if-eqz v1, :cond_f

    .line 366
    .line 367
    invoke-static {}, Lv6/a;->k()J

    .line 368
    .line 369
    .line 370
    move-result-wide v7

    .line 371
    goto :goto_7

    .line 372
    :cond_f
    invoke-static {}, Lv6/a;->e()J

    .line 373
    .line 374
    .line 375
    move-result-wide v7

    .line 376
    :goto_7
    sget-object v13, Landroidx/compose/ui/text/style/TextOverflow;->Companion:Landroidx/compose/ui/text/style/TextOverflow$Companion;

    .line 377
    .line 378
    invoke-virtual {v13}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getEllipsis-gIe3tQ8()I

    .line 379
    .line 380
    .line 381
    move-result v20

    .line 382
    const v13, 0x3f19999a    # 0.6f

    .line 383
    .line 384
    .line 385
    invoke-static {v4, v13}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 386
    .line 387
    .line 388
    move-result-object v13

    .line 389
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 390
    .line 391
    .line 392
    move-result-object v14

    .line 393
    invoke-interface {v5, v13, v14}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    .line 394
    .line 395
    .line 396
    move-result-object v13

    .line 397
    sget-object v14, Landroidx/compose/ui/text/style/TextAlign;->Companion:Landroidx/compose/ui/text/style/TextAlign$Companion;

    .line 398
    .line 399
    invoke-virtual {v14}, Landroidx/compose/ui/text/style/TextAlign$Companion;->getCenter-e0LSkKk()I

    .line 400
    .line 401
    .line 402
    move-result v14

    .line 403
    invoke-static {v14}, Landroidx/compose/ui/text/style/TextAlign;->box-impl(I)Landroidx/compose/ui/text/style/TextAlign;

    .line 404
    .line 405
    .line 406
    move-result-object v17

    .line 407
    const/16 v28, 0xc30

    .line 408
    .line 409
    const v29, 0x1d5f0

    .line 410
    .line 411
    .line 412
    move v14, v11

    .line 413
    const/4 v11, 0x0

    .line 414
    move-object/from16 v26, v12

    .line 415
    .line 416
    const/4 v12, 0x0

    .line 417
    move-object v15, v5

    .line 418
    move-object v5, v6

    .line 419
    move-object v6, v13

    .line 420
    const/4 v13, 0x0

    .line 421
    move/from16 v18, v14

    .line 422
    .line 423
    move-object/from16 v16, v15

    .line 424
    .line 425
    const-wide/16 v14, 0x0

    .line 426
    .line 427
    move-object/from16 v19, v16

    .line 428
    .line 429
    const/16 v16, 0x0

    .line 430
    .line 431
    move/from16 v22, v18

    .line 432
    .line 433
    move-object/from16 v21, v19

    .line 434
    .line 435
    const-wide/16 v18, 0x0

    .line 436
    .line 437
    move-object/from16 v23, v21

    .line 438
    .line 439
    const/16 v21, 0x0

    .line 440
    .line 441
    move/from16 v24, v22

    .line 442
    .line 443
    const/16 v22, 0x1

    .line 444
    .line 445
    move-object/from16 v25, v23

    .line 446
    .line 447
    const/16 v23, 0x0

    .line 448
    .line 449
    move/from16 v27, v24

    .line 450
    .line 451
    const/16 v24, 0x0

    .line 452
    .line 453
    move-object/from16 v32, v25

    .line 454
    .line 455
    const/16 v25, 0x0

    .line 456
    .line 457
    move/from16 v33, v27

    .line 458
    .line 459
    const/16 v27, 0xc00

    .line 460
    .line 461
    move-object/from16 v0, v32

    .line 462
    .line 463
    move/from16 v1, v33

    .line 464
    .line 465
    invoke-static/range {v5 .. v29}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 466
    .line 467
    .line 468
    move-object/from16 v12, v26

    .line 469
    .line 470
    if-eqz p1, :cond_10

    .line 471
    .line 472
    const v5, 0x5decd604

    .line 473
    .line 474
    .line 475
    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 476
    .line 477
    .line 478
    sget v5, Lcom/zykj/student/dialogue/R$drawable;->icon_move_item_selected:I

    .line 479
    .line 480
    invoke-static {v5, v12, v1}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 481
    .line 482
    .line 483
    move-result-object v5

    .line 484
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 485
    .line 486
    .line 487
    move-result-object v1

    .line 488
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 489
    .line 490
    .line 491
    move-result-object v1

    .line 492
    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 493
    .line 494
    int-to-float v1, v1

    .line 495
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 496
    .line 497
    .line 498
    move-result-object v6

    .line 499
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 500
    .line 501
    .line 502
    move-result-object v6

    .line 503
    iget v6, v6, Landroid/util/DisplayMetrics;->density:F

    .line 504
    .line 505
    div-float/2addr v1, v6

    .line 506
    mul-float v30, v30, v1

    .line 507
    .line 508
    invoke-static/range {v30 .. v30}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 509
    .line 510
    .line 511
    move-result v1

    .line 512
    invoke-static {v4, v1}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 513
    .line 514
    .line 515
    move-result-object v1

    .line 516
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/ui/Alignment$Companion;->getCenterEnd()Landroidx/compose/ui/Alignment;

    .line 517
    .line 518
    .line 519
    move-result-object v4

    .line 520
    invoke-interface {v0, v1, v4}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    .line 521
    .line 522
    .line 523
    move-result-object v7

    .line 524
    const/16 v13, 0x30

    .line 525
    .line 526
    const/16 v14, 0x78

    .line 527
    .line 528
    const/4 v6, 0x0

    .line 529
    const/4 v8, 0x0

    .line 530
    const/4 v9, 0x0

    .line 531
    const/4 v10, 0x0

    .line 532
    const/4 v11, 0x0

    .line 533
    invoke-static/range {v5 .. v14}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 534
    .line 535
    .line 536
    :goto_8
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 537
    .line 538
    .line 539
    goto :goto_9

    .line 540
    :cond_10
    const v0, 0x5da80663

    .line 541
    .line 542
    .line 543
    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 544
    .line 545
    .line 546
    goto :goto_8

    .line 547
    :goto_9
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 548
    .line 549
    .line 550
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 551
    .line 552
    .line 553
    move-result v0

    .line 554
    if-eqz v0, :cond_12

    .line 555
    .line 556
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 557
    .line 558
    .line 559
    goto :goto_a

    .line 560
    :cond_11
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 561
    .line 562
    .line 563
    :cond_12
    :goto_a
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 564
    .line 565
    .line 566
    move-result-object v0

    .line 567
    if-eqz v0, :cond_13

    .line 568
    .line 569
    new-instance v1, Lu6/k;

    .line 570
    .line 571
    move-object/from16 v4, p0

    .line 572
    .line 573
    move/from16 v5, p1

    .line 574
    .line 575
    invoke-direct {v1, v4, v5, v2, v3}, Lu6/k;-><init>(Lcom/zykj/student/dialogue/bean/resp/CatalogResp;ZLkotlin/jvm/functions/Function0;I)V

    .line 576
    .line 577
    .line 578
    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 579
    .line 580
    .line 581
    :cond_13
    return-void
.end method

.method public static final q(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 5
    .line 6
    return-object p0
.end method

.method public static final r(Lcom/zykj/student/dialogue/bean/resp/CatalogResp;ZLkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lcom/zykj/student/dialogue/ui/home/dialog/MoveDialogKt;->p(Lcom/zykj/student/dialogue/bean/resp/CatalogResp;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final synthetic s(Landroidx/compose/runtime/MutableState;)Lcom/zykj/student/dialogue/bean/resp/CatalogResp;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/student/dialogue/ui/home/dialog/MoveDialogKt;->i(Landroidx/compose/runtime/MutableState;)Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic t(Landroidx/compose/runtime/MutableState;Lcom/zykj/student/dialogue/bean/resp/CatalogResp;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/student/dialogue/ui/home/dialog/MoveDialogKt;->o(Landroidx/compose/runtime/MutableState;Lcom/zykj/student/dialogue/bean/resp/CatalogResp;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
