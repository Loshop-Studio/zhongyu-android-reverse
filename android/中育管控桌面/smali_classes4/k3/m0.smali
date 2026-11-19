.class public abstract Lk3/m0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(IIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lk3/m0;->s(IIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lk3/m0;->o(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lk3/s0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lk3/m0;->n(Lk3/s0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lk3/s0;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lk3/m0;->p(Lk3/s0;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lk3/s0;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lk3/m0;->q(Lk3/s0;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(JLjava/lang/String;Lkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Lk3/m0;->l(JLjava/lang/String;Lkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g()Lkotlin/Unit;
    .locals 1

    .line 1
    invoke-static {}, Lk3/m0;->j()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lk3/m0;->k(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final i(JLjava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
    .locals 29

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move/from16 v1, p5

    .line 4
    .line 5
    const-string v2, "text"

    .line 6
    .line 7
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const v2, -0x2779dba8

    .line 11
    .line 12
    .line 13
    move-object/from16 v3, p4

    .line 14
    .line 15
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    and-int/lit8 v4, v1, 0x6

    .line 20
    .line 21
    if-nez v4, :cond_1

    .line 22
    .line 23
    move-wide/from16 v4, p0

    .line 24
    .line 25
    invoke-interface {v3, v4, v5}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    if-eqz v6, :cond_0

    .line 30
    .line 31
    const/4 v6, 0x4

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v6, 0x2

    .line 34
    :goto_0
    or-int/2addr v6, v1

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move-wide/from16 v4, p0

    .line 37
    .line 38
    move v6, v1

    .line 39
    :goto_1
    and-int/lit8 v7, v1, 0x30

    .line 40
    .line 41
    const/16 v8, 0x10

    .line 42
    .line 43
    if-nez v7, :cond_3

    .line 44
    .line 45
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    if-eqz v7, :cond_2

    .line 50
    .line 51
    const/16 v7, 0x20

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    move v7, v8

    .line 55
    :goto_2
    or-int/2addr v6, v7

    .line 56
    :cond_3
    and-int/lit8 v7, p6, 0x4

    .line 57
    .line 58
    const/16 v9, 0x100

    .line 59
    .line 60
    if-eqz v7, :cond_5

    .line 61
    .line 62
    or-int/lit16 v6, v6, 0x180

    .line 63
    .line 64
    :cond_4
    move-object/from16 v10, p3

    .line 65
    .line 66
    goto :goto_4

    .line 67
    :cond_5
    and-int/lit16 v10, v1, 0x180

    .line 68
    .line 69
    if-nez v10, :cond_4

    .line 70
    .line 71
    move-object/from16 v10, p3

    .line 72
    .line 73
    invoke-interface {v3, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v11

    .line 77
    if-eqz v11, :cond_6

    .line 78
    .line 79
    move v11, v9

    .line 80
    goto :goto_3

    .line 81
    :cond_6
    const/16 v11, 0x80

    .line 82
    .line 83
    :goto_3
    or-int/2addr v6, v11

    .line 84
    :goto_4
    and-int/lit16 v11, v6, 0x93

    .line 85
    .line 86
    const/16 v12, 0x92

    .line 87
    .line 88
    const/4 v13, 0x0

    .line 89
    const/4 v14, 0x1

    .line 90
    if-eq v11, v12, :cond_7

    .line 91
    .line 92
    move v11, v14

    .line 93
    goto :goto_5

    .line 94
    :cond_7
    move v11, v13

    .line 95
    :goto_5
    and-int/lit8 v12, v6, 0x1

    .line 96
    .line 97
    invoke-interface {v3, v11, v12}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 98
    .line 99
    .line 100
    move-result v11

    .line 101
    if-eqz v11, :cond_f

    .line 102
    .line 103
    if-eqz v7, :cond_9

    .line 104
    .line 105
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    sget-object v10, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 110
    .line 111
    invoke-virtual {v10}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v10

    .line 115
    if-ne v7, v10, :cond_8

    .line 116
    .line 117
    new-instance v7, Lk3/i0;

    .line 118
    .line 119
    invoke-direct {v7}, Lk3/i0;-><init>()V

    .line 120
    .line 121
    .line 122
    invoke-interface {v3, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    :cond_8
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 126
    .line 127
    goto :goto_6

    .line 128
    :cond_9
    move-object v7, v10

    .line 129
    :goto_6
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 130
    .line 131
    .line 132
    move-result v10

    .line 133
    if-eqz v10, :cond_a

    .line 134
    .line 135
    const/4 v10, -0x1

    .line 136
    const-string v11, "com.zykj.gallery.ui.gallery.screenList.DeleteText (GalleryTitleBar.kt:118)"

    .line 137
    .line 138
    invoke-static {v2, v6, v10, v11}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 139
    .line 140
    .line 141
    :cond_a
    sget-object v15, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 142
    .line 143
    const/16 v2, 0x14

    .line 144
    .line 145
    int-to-float v2, v2

    .line 146
    const/16 v10, 0x500

    .line 147
    .line 148
    int-to-float v10, v10

    .line 149
    div-float/2addr v2, v10

    .line 150
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 151
    .line 152
    .line 153
    move-result-object v10

    .line 154
    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 155
    .line 156
    .line 157
    move-result-object v10

    .line 158
    iget v11, v10, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 159
    .line 160
    iget v10, v10, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 161
    .line 162
    invoke-static {v11, v10}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 163
    .line 164
    .line 165
    move-result v10

    .line 166
    int-to-float v10, v10

    .line 167
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 168
    .line 169
    .line 170
    move-result-object v11

    .line 171
    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 172
    .line 173
    .line 174
    move-result-object v11

    .line 175
    iget v11, v11, Landroid/util/DisplayMetrics;->density:F

    .line 176
    .line 177
    div-float/2addr v10, v11

    .line 178
    mul-float/2addr v2, v10

    .line 179
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 180
    .line 181
    .line 182
    move-result v16

    .line 183
    const/16 v20, 0xe

    .line 184
    .line 185
    const/16 v21, 0x0

    .line 186
    .line 187
    const/16 v17, 0x0

    .line 188
    .line 189
    const/16 v18, 0x0

    .line 190
    .line 191
    const/16 v19, 0x0

    .line 192
    .line 193
    invoke-static/range {v15 .. v21}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 194
    .line 195
    .line 196
    move-result-object v22

    .line 197
    and-int/lit16 v2, v6, 0x380

    .line 198
    .line 199
    if-ne v2, v9, :cond_b

    .line 200
    .line 201
    move v13, v14

    .line 202
    :cond_b
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    if-nez v13, :cond_c

    .line 207
    .line 208
    sget-object v9, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 209
    .line 210
    invoke-virtual {v9}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v9

    .line 214
    if-ne v2, v9, :cond_d

    .line 215
    .line 216
    :cond_c
    new-instance v2, Lk3/j0;

    .line 217
    .line 218
    invoke-direct {v2, v7}, Lk3/j0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 219
    .line 220
    .line 221
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    :cond_d
    move-object/from16 v26, v2

    .line 225
    .line 226
    check-cast v26, Lkotlin/jvm/functions/Function0;

    .line 227
    .line 228
    const/16 v27, 0x7

    .line 229
    .line 230
    const/16 v28, 0x0

    .line 231
    .line 232
    const/16 v23, 0x0

    .line 233
    .line 234
    const/16 v24, 0x0

    .line 235
    .line 236
    const/16 v25, 0x0

    .line 237
    .line 238
    invoke-static/range {v22 .. v28}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    invoke-static {v8}, Lo3/a;->a(I)J

    .line 243
    .line 244
    .line 245
    move-result-wide v8

    .line 246
    shr-int/lit8 v10, v6, 0x3

    .line 247
    .line 248
    and-int/lit8 v10, v10, 0xe

    .line 249
    .line 250
    or-int/lit16 v10, v10, 0xc00

    .line 251
    .line 252
    shl-int/lit8 v6, v6, 0x6

    .line 253
    .line 254
    and-int/lit16 v6, v6, 0x380

    .line 255
    .line 256
    or-int v22, v10, v6

    .line 257
    .line 258
    const v24, 0x1fff0

    .line 259
    .line 260
    .line 261
    const/4 v6, 0x0

    .line 262
    move-object v10, v7

    .line 263
    const/4 v7, 0x0

    .line 264
    move-wide v4, v8

    .line 265
    const/4 v8, 0x0

    .line 266
    move-object v11, v10

    .line 267
    const-wide/16 v9, 0x0

    .line 268
    .line 269
    move-object v12, v11

    .line 270
    const/4 v11, 0x0

    .line 271
    move-object v13, v12

    .line 272
    const/4 v12, 0x0

    .line 273
    move-object v15, v13

    .line 274
    const-wide/16 v13, 0x0

    .line 275
    .line 276
    move-object/from16 v16, v15

    .line 277
    .line 278
    const/4 v15, 0x0

    .line 279
    move-object/from16 v17, v16

    .line 280
    .line 281
    const/16 v16, 0x0

    .line 282
    .line 283
    move-object/from16 v18, v17

    .line 284
    .line 285
    const/16 v17, 0x0

    .line 286
    .line 287
    move-object/from16 v19, v18

    .line 288
    .line 289
    const/16 v18, 0x0

    .line 290
    .line 291
    move-object/from16 v20, v19

    .line 292
    .line 293
    const/16 v19, 0x0

    .line 294
    .line 295
    move-object/from16 v21, v20

    .line 296
    .line 297
    const/16 v20, 0x0

    .line 298
    .line 299
    move-object v1, v2

    .line 300
    move-object/from16 v25, v21

    .line 301
    .line 302
    move-object/from16 v21, v3

    .line 303
    .line 304
    move-wide/from16 v2, p0

    .line 305
    .line 306
    invoke-static/range {v0 .. v24}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 307
    .line 308
    .line 309
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 310
    .line 311
    .line 312
    move-result v0

    .line 313
    if-eqz v0, :cond_e

    .line 314
    .line 315
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 316
    .line 317
    .line 318
    :cond_e
    move-object/from16 v4, v25

    .line 319
    .line 320
    goto :goto_7

    .line 321
    :cond_f
    move-object/from16 v21, v3

    .line 322
    .line 323
    invoke-interface/range {v21 .. v21}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 324
    .line 325
    .line 326
    move-object v4, v10

    .line 327
    :goto_7
    invoke-interface/range {v21 .. v21}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 328
    .line 329
    .line 330
    move-result-object v7

    .line 331
    if-eqz v7, :cond_10

    .line 332
    .line 333
    new-instance v0, Lk3/k0;

    .line 334
    .line 335
    move-wide/from16 v1, p0

    .line 336
    .line 337
    move-object/from16 v3, p2

    .line 338
    .line 339
    move/from16 v5, p5

    .line 340
    .line 341
    move/from16 v6, p6

    .line 342
    .line 343
    invoke-direct/range {v0 .. v6}, Lk3/k0;-><init>(JLjava/lang/String;Lkotlin/jvm/functions/Function0;II)V

    .line 344
    .line 345
    .line 346
    invoke-interface {v7, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 347
    .line 348
    .line 349
    :cond_10
    return-void
.end method

.method public static final j()Lkotlin/Unit;
    .locals 1

    .line 1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final k(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
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

.method public static final l(JLjava/lang/String;Lkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 7

    .line 1
    or-int/lit8 p4, p4, 0x1

    .line 2
    .line 3
    invoke-static {p4}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 4
    .line 5
    .line 6
    move-result v5

    .line 7
    move-wide v0, p0

    .line 8
    move-object v2, p2

    .line 9
    move-object v3, p3

    .line 10
    move v6, p5

    .line 11
    move-object v4, p6

    .line 12
    invoke-static/range {v0 .. v6}, Lk3/m0;->i(JLjava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    .line 13
    .line 14
    .line 15
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    return-object p0
.end method

.method public static final m(Lk3/s0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
    .locals 39

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
    const-string v0, "state"

    .line 12
    .line 13
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "onDeleteClick"

    .line 17
    .line 18
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "onReceiverClick"

    .line 22
    .line 23
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "onBackClick"

    .line 27
    .line 28
    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const v0, -0x1a6daee4

    .line 32
    .line 33
    .line 34
    move-object/from16 v6, p4

    .line 35
    .line 36
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 37
    .line 38
    .line 39
    move-result-object v10

    .line 40
    and-int/lit8 v6, v5, 0x6

    .line 41
    .line 42
    if-nez v6, :cond_1

    .line 43
    .line 44
    invoke-interface {v10, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-eqz v6, :cond_0

    .line 49
    .line 50
    const/4 v6, 0x4

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    const/4 v6, 0x2

    .line 53
    :goto_0
    or-int/2addr v6, v5

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    move v6, v5

    .line 56
    :goto_1
    and-int/lit8 v9, v5, 0x30

    .line 57
    .line 58
    if-nez v9, :cond_3

    .line 59
    .line 60
    invoke-interface {v10, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v9

    .line 64
    if-eqz v9, :cond_2

    .line 65
    .line 66
    const/16 v9, 0x20

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_2
    const/16 v9, 0x10

    .line 70
    .line 71
    :goto_2
    or-int/2addr v6, v9

    .line 72
    :cond_3
    and-int/lit16 v9, v5, 0x180

    .line 73
    .line 74
    if-nez v9, :cond_5

    .line 75
    .line 76
    invoke-interface {v10, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v9

    .line 80
    if-eqz v9, :cond_4

    .line 81
    .line 82
    const/16 v9, 0x100

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_4
    const/16 v9, 0x80

    .line 86
    .line 87
    :goto_3
    or-int/2addr v6, v9

    .line 88
    :cond_5
    and-int/lit16 v9, v5, 0xc00

    .line 89
    .line 90
    if-nez v9, :cond_7

    .line 91
    .line 92
    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v9

    .line 96
    if-eqz v9, :cond_6

    .line 97
    .line 98
    const/16 v9, 0x800

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_6
    const/16 v9, 0x400

    .line 102
    .line 103
    :goto_4
    or-int/2addr v6, v9

    .line 104
    :cond_7
    and-int/lit16 v9, v6, 0x493

    .line 105
    .line 106
    const/16 v14, 0x492

    .line 107
    .line 108
    const/4 v15, 0x1

    .line 109
    const/4 v12, 0x0

    .line 110
    if-eq v9, v14, :cond_8

    .line 111
    .line 112
    move v9, v15

    .line 113
    goto :goto_5

    .line 114
    :cond_8
    move v9, v12

    .line 115
    :goto_5
    and-int/lit8 v14, v6, 0x1

    .line 116
    .line 117
    invoke-interface {v10, v9, v14}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 118
    .line 119
    .line 120
    move-result v9

    .line 121
    if-eqz v9, :cond_29

    .line 122
    .line 123
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 124
    .line 125
    .line 126
    move-result v9

    .line 127
    if-eqz v9, :cond_9

    .line 128
    .line 129
    const/4 v9, -0x1

    .line 130
    const-string v14, "com.zykj.gallery.ui.gallery.screenList.GalleryTitleBar (GalleryTitleBar.kt:30)"

    .line 131
    .line 132
    invoke-static {v0, v6, v9, v14}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 133
    .line 134
    .line 135
    :cond_9
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 136
    .line 137
    const/16 v9, 0x30

    .line 138
    .line 139
    int-to-float v14, v9

    .line 140
    const/16 v8, 0x500

    .line 141
    .line 142
    int-to-float v8, v8

    .line 143
    div-float/2addr v14, v8

    .line 144
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 145
    .line 146
    .line 147
    move-result-object v16

    .line 148
    invoke-virtual/range {v16 .. v16}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 149
    .line 150
    .line 151
    move-result-object v11

    .line 152
    iget v7, v11, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 153
    .line 154
    iget v11, v11, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 155
    .line 156
    invoke-static {v7, v11}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 157
    .line 158
    .line 159
    move-result v7

    .line 160
    int-to-float v7, v7

    .line 161
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 162
    .line 163
    .line 164
    move-result-object v11

    .line 165
    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 166
    .line 167
    .line 168
    move-result-object v11

    .line 169
    iget v11, v11, Landroid/util/DisplayMetrics;->density:F

    .line 170
    .line 171
    div-float/2addr v7, v11

    .line 172
    mul-float/2addr v14, v7

    .line 173
    invoke-static {v14}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 174
    .line 175
    .line 176
    move-result v7

    .line 177
    invoke-static {v0, v7}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 178
    .line 179
    .line 180
    move-result-object v7

    .line 181
    const/4 v11, 0x0

    .line 182
    const/4 v14, 0x0

    .line 183
    invoke-static {v7, v11, v15, v14}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 184
    .line 185
    .line 186
    move-result-object v7

    .line 187
    sget-object v31, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 188
    .line 189
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/foundation/layout/Arrangement;->getSpaceBetween()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 190
    .line 191
    .line 192
    move-result-object v15

    .line 193
    sget-object v32, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 194
    .line 195
    invoke-virtual/range {v32 .. v32}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 196
    .line 197
    .line 198
    move-result-object v11

    .line 199
    const/16 v14, 0x36

    .line 200
    .line 201
    invoke-static {v15, v11, v10, v14}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 202
    .line 203
    .line 204
    move-result-object v11

    .line 205
    invoke-static {v10, v12}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 206
    .line 207
    .line 208
    move-result v15

    .line 209
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 210
    .line 211
    .line 212
    move-result-object v9

    .line 213
    invoke-static {v10, v7}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 214
    .line 215
    .line 216
    move-result-object v7

    .line 217
    sget-object v33, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 218
    .line 219
    invoke-virtual/range {v33 .. v33}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 220
    .line 221
    .line 222
    move-result-object v13

    .line 223
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 224
    .line 225
    .line 226
    move-result-object v17

    .line 227
    if-nez v17, :cond_a

    .line 228
    .line 229
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 230
    .line 231
    .line 232
    :cond_a
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 233
    .line 234
    .line 235
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 236
    .line 237
    .line 238
    move-result v17

    .line 239
    if-eqz v17, :cond_b

    .line 240
    .line 241
    invoke-interface {v10, v13}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 242
    .line 243
    .line 244
    goto :goto_6

    .line 245
    :cond_b
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 246
    .line 247
    .line 248
    :goto_6
    invoke-static {v10}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 249
    .line 250
    .line 251
    move-result-object v13

    .line 252
    invoke-virtual/range {v33 .. v33}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 253
    .line 254
    .line 255
    move-result-object v12

    .line 256
    invoke-static {v13, v11, v12}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual/range {v33 .. v33}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 260
    .line 261
    .line 262
    move-result-object v11

    .line 263
    invoke-static {v13, v9, v11}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual/range {v33 .. v33}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 267
    .line 268
    .line 269
    move-result-object v9

    .line 270
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 271
    .line 272
    .line 273
    move-result v11

    .line 274
    if-nez v11, :cond_c

    .line 275
    .line 276
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v11

    .line 280
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 281
    .line 282
    .line 283
    move-result-object v12

    .line 284
    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result v11

    .line 288
    if-nez v11, :cond_d

    .line 289
    .line 290
    :cond_c
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 291
    .line 292
    .line 293
    move-result-object v11

    .line 294
    invoke-interface {v13, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 298
    .line 299
    .line 300
    move-result-object v11

    .line 301
    invoke-interface {v13, v11, v9}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 302
    .line 303
    .line 304
    :cond_d
    invoke-virtual/range {v33 .. v33}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 305
    .line 306
    .line 307
    move-result-object v9

    .line 308
    invoke-static {v13, v7, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 309
    .line 310
    .line 311
    sget-object v7, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 312
    .line 313
    invoke-virtual/range {v32 .. v32}, Landroidx/compose/ui/Alignment$Companion;->getBottom()Landroidx/compose/ui/Alignment$Vertical;

    .line 314
    .line 315
    .line 316
    move-result-object v7

    .line 317
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 318
    .line 319
    .line 320
    move-result-object v9

    .line 321
    invoke-static {v9, v7, v10, v14}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 322
    .line 323
    .line 324
    move-result-object v7

    .line 325
    const/4 v9, 0x0

    .line 326
    invoke-static {v10, v9}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 327
    .line 328
    .line 329
    move-result v11

    .line 330
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 331
    .line 332
    .line 333
    move-result-object v9

    .line 334
    invoke-static {v10, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 335
    .line 336
    .line 337
    move-result-object v12

    .line 338
    invoke-virtual/range {v33 .. v33}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 339
    .line 340
    .line 341
    move-result-object v13

    .line 342
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 343
    .line 344
    .line 345
    move-result-object v14

    .line 346
    if-nez v14, :cond_e

    .line 347
    .line 348
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 349
    .line 350
    .line 351
    :cond_e
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 352
    .line 353
    .line 354
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 355
    .line 356
    .line 357
    move-result v14

    .line 358
    if-eqz v14, :cond_f

    .line 359
    .line 360
    invoke-interface {v10, v13}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 361
    .line 362
    .line 363
    goto :goto_7

    .line 364
    :cond_f
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 365
    .line 366
    .line 367
    :goto_7
    invoke-static {v10}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 368
    .line 369
    .line 370
    move-result-object v13

    .line 371
    invoke-virtual/range {v33 .. v33}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 372
    .line 373
    .line 374
    move-result-object v14

    .line 375
    invoke-static {v13, v7, v14}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 376
    .line 377
    .line 378
    invoke-virtual/range {v33 .. v33}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 379
    .line 380
    .line 381
    move-result-object v7

    .line 382
    invoke-static {v13, v9, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 383
    .line 384
    .line 385
    invoke-virtual/range {v33 .. v33}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 386
    .line 387
    .line 388
    move-result-object v7

    .line 389
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 390
    .line 391
    .line 392
    move-result v9

    .line 393
    if-nez v9, :cond_10

    .line 394
    .line 395
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v9

    .line 399
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 400
    .line 401
    .line 402
    move-result-object v14

    .line 403
    invoke-static {v9, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    move-result v9

    .line 407
    if-nez v9, :cond_11

    .line 408
    .line 409
    :cond_10
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 410
    .line 411
    .line 412
    move-result-object v9

    .line 413
    invoke-interface {v13, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 414
    .line 415
    .line 416
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 417
    .line 418
    .line 419
    move-result-object v9

    .line 420
    invoke-interface {v13, v9, v7}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 421
    .line 422
    .line 423
    :cond_11
    invoke-virtual/range {v33 .. v33}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 424
    .line 425
    .line 426
    move-result-object v7

    .line 427
    invoke-static {v13, v12, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 428
    .line 429
    .line 430
    and-int/lit16 v7, v6, 0x1c00

    .line 431
    .line 432
    const/16 v9, 0x800

    .line 433
    .line 434
    if-ne v7, v9, :cond_12

    .line 435
    .line 436
    const/4 v7, 0x1

    .line 437
    goto :goto_8

    .line 438
    :cond_12
    const/4 v7, 0x0

    .line 439
    :goto_8
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v9

    .line 443
    if-nez v7, :cond_13

    .line 444
    .line 445
    sget-object v7, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 446
    .line 447
    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v7

    .line 451
    if-ne v9, v7, :cond_14

    .line 452
    .line 453
    :cond_13
    new-instance v9, Lk3/e0;

    .line 454
    .line 455
    invoke-direct {v9, v4}, Lk3/e0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 456
    .line 457
    .line 458
    invoke-interface {v10, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    :cond_14
    move-object/from16 v20, v9

    .line 462
    .line 463
    check-cast v20, Lkotlin/jvm/functions/Function0;

    .line 464
    .line 465
    const/16 v21, 0x7

    .line 466
    .line 467
    const/16 v22, 0x0

    .line 468
    .line 469
    const/16 v17, 0x0

    .line 470
    .line 471
    const/16 v18, 0x0

    .line 472
    .line 473
    const/16 v19, 0x0

    .line 474
    .line 475
    move-object/from16 v16, v0

    .line 476
    .line 477
    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    move-object/from16 v7, v16

    .line 482
    .line 483
    invoke-virtual/range {v32 .. v32}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 484
    .line 485
    .line 486
    move-result-object v9

    .line 487
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 488
    .line 489
    .line 490
    move-result-object v11

    .line 491
    const/16 v12, 0x30

    .line 492
    .line 493
    invoke-static {v11, v9, v10, v12}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 494
    .line 495
    .line 496
    move-result-object v9

    .line 497
    const/4 v11, 0x0

    .line 498
    invoke-static {v10, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 499
    .line 500
    .line 501
    move-result v12

    .line 502
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 503
    .line 504
    .line 505
    move-result-object v11

    .line 506
    invoke-static {v10, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    invoke-virtual/range {v33 .. v33}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 511
    .line 512
    .line 513
    move-result-object v13

    .line 514
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 515
    .line 516
    .line 517
    move-result-object v14

    .line 518
    if-nez v14, :cond_15

    .line 519
    .line 520
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 521
    .line 522
    .line 523
    :cond_15
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 524
    .line 525
    .line 526
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 527
    .line 528
    .line 529
    move-result v14

    .line 530
    if-eqz v14, :cond_16

    .line 531
    .line 532
    invoke-interface {v10, v13}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 533
    .line 534
    .line 535
    goto :goto_9

    .line 536
    :cond_16
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 537
    .line 538
    .line 539
    :goto_9
    invoke-static {v10}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 540
    .line 541
    .line 542
    move-result-object v13

    .line 543
    invoke-virtual/range {v33 .. v33}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 544
    .line 545
    .line 546
    move-result-object v14

    .line 547
    invoke-static {v13, v9, v14}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 548
    .line 549
    .line 550
    invoke-virtual/range {v33 .. v33}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 551
    .line 552
    .line 553
    move-result-object v9

    .line 554
    invoke-static {v13, v11, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 555
    .line 556
    .line 557
    invoke-virtual/range {v33 .. v33}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 558
    .line 559
    .line 560
    move-result-object v9

    .line 561
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 562
    .line 563
    .line 564
    move-result v11

    .line 565
    if-nez v11, :cond_17

    .line 566
    .line 567
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object v11

    .line 571
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 572
    .line 573
    .line 574
    move-result-object v14

    .line 575
    invoke-static {v11, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 576
    .line 577
    .line 578
    move-result v11

    .line 579
    if-nez v11, :cond_18

    .line 580
    .line 581
    :cond_17
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 582
    .line 583
    .line 584
    move-result-object v11

    .line 585
    invoke-interface {v13, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 586
    .line 587
    .line 588
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 589
    .line 590
    .line 591
    move-result-object v11

    .line 592
    invoke-interface {v13, v11, v9}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 593
    .line 594
    .line 595
    :cond_18
    invoke-virtual/range {v33 .. v33}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 596
    .line 597
    .line 598
    move-result-object v9

    .line 599
    invoke-static {v13, v0, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 600
    .line 601
    .line 602
    invoke-virtual {v1}, Lk3/s0;->i()Z

    .line 603
    .line 604
    .line 605
    move-result v0

    .line 606
    if-eqz v0, :cond_19

    .line 607
    .line 608
    const v0, -0x4356f8fc

    .line 609
    .line 610
    .line 611
    invoke-interface {v10, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 612
    .line 613
    .line 614
    sget v0, Lcom/zykj/gallery/R$drawable;->gallery_icon_back:I

    .line 615
    .line 616
    const/4 v11, 0x0

    .line 617
    invoke-static {v0, v10, v11, v11}, Lk3/m0;->r(ILandroidx/compose/runtime/Composer;II)V

    .line 618
    .line 619
    .line 620
    const/16 v0, 0xa

    .line 621
    .line 622
    int-to-float v0, v0

    .line 623
    div-float/2addr v0, v8

    .line 624
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 625
    .line 626
    .line 627
    move-result-object v8

    .line 628
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 629
    .line 630
    .line 631
    move-result-object v8

    .line 632
    iget v9, v8, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 633
    .line 634
    iget v8, v8, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 635
    .line 636
    invoke-static {v9, v8}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 637
    .line 638
    .line 639
    move-result v8

    .line 640
    int-to-float v8, v8

    .line 641
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 642
    .line 643
    .line 644
    move-result-object v9

    .line 645
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 646
    .line 647
    .line 648
    move-result-object v9

    .line 649
    iget v9, v9, Landroid/util/DisplayMetrics;->density:F

    .line 650
    .line 651
    div-float/2addr v8, v9

    .line 652
    mul-float/2addr v0, v8

    .line 653
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 654
    .line 655
    .line 656
    move-result v0

    .line 657
    const/4 v8, 0x0

    .line 658
    const/4 v9, 0x0

    .line 659
    const/4 v12, 0x2

    .line 660
    invoke-static {v7, v0, v9, v12, v8}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 661
    .line 662
    .line 663
    move-result-object v0

    .line 664
    const/16 v8, 0x14

    .line 665
    .line 666
    invoke-static {v8}, Lo3/a;->a(I)J

    .line 667
    .line 668
    .line 669
    move-result-wide v8

    .line 670
    move-object/from16 v27, v10

    .line 671
    .line 672
    move/from16 v30, v11

    .line 673
    .line 674
    move-wide v10, v8

    .line 675
    invoke-static {}, Ln3/a;->b()J

    .line 676
    .line 677
    .line 678
    move-result-wide v8

    .line 679
    move v12, v6

    .line 680
    invoke-virtual {v1}, Lk3/s0;->e()Ljava/lang/String;

    .line 681
    .line 682
    .line 683
    move-result-object v6

    .line 684
    const/16 v29, 0x0

    .line 685
    .line 686
    move/from16 v13, v30

    .line 687
    .line 688
    const v30, 0x1fff0

    .line 689
    .line 690
    .line 691
    move v14, v12

    .line 692
    const/4 v12, 0x0

    .line 693
    move v15, v13

    .line 694
    const/4 v13, 0x0

    .line 695
    move/from16 v16, v14

    .line 696
    .line 697
    const/4 v14, 0x0

    .line 698
    move/from16 v18, v15

    .line 699
    .line 700
    move/from16 v17, v16

    .line 701
    .line 702
    const-wide/16 v15, 0x0

    .line 703
    .line 704
    move/from16 v19, v17

    .line 705
    .line 706
    const/16 v17, 0x0

    .line 707
    .line 708
    move/from16 v20, v18

    .line 709
    .line 710
    const/16 v18, 0x0

    .line 711
    .line 712
    move/from16 v21, v19

    .line 713
    .line 714
    move/from16 v22, v20

    .line 715
    .line 716
    const-wide/16 v19, 0x0

    .line 717
    .line 718
    move/from16 v25, v21

    .line 719
    .line 720
    const/16 v21, 0x0

    .line 721
    .line 722
    move/from16 v28, v22

    .line 723
    .line 724
    const/16 v22, 0x0

    .line 725
    .line 726
    const/16 v34, 0x4

    .line 727
    .line 728
    const/16 v23, 0x0

    .line 729
    .line 730
    const/16 v35, 0x20

    .line 731
    .line 732
    const/16 v24, 0x0

    .line 733
    .line 734
    move/from16 v36, v25

    .line 735
    .line 736
    const/16 v25, 0x0

    .line 737
    .line 738
    const/16 v37, 0x1

    .line 739
    .line 740
    const/16 v26, 0x0

    .line 741
    .line 742
    move/from16 v38, v28

    .line 743
    .line 744
    const/16 v28, 0xdb0

    .line 745
    .line 746
    move-object v4, v7

    .line 747
    move/from16 v5, v38

    .line 748
    .line 749
    move-object v7, v0

    .line 750
    move/from16 v0, v36

    .line 751
    .line 752
    invoke-static/range {v6 .. v30}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 753
    .line 754
    .line 755
    move-object/from16 v10, v27

    .line 756
    .line 757
    :goto_a
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 758
    .line 759
    .line 760
    goto :goto_b

    .line 761
    :cond_19
    move v0, v6

    .line 762
    move-object v4, v7

    .line 763
    const/4 v5, 0x0

    .line 764
    const/16 v37, 0x1

    .line 765
    .line 766
    const v6, -0x43707546

    .line 767
    .line 768
    .line 769
    invoke-interface {v10, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 770
    .line 771
    .line 772
    goto :goto_a

    .line 773
    :goto_b
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 774
    .line 775
    .line 776
    invoke-virtual {v1}, Lk3/s0;->h()Z

    .line 777
    .line 778
    .line 779
    move-result v6

    .line 780
    if-eqz v6, :cond_1a

    .line 781
    .line 782
    const v6, -0x771ff54f

    .line 783
    .line 784
    .line 785
    invoke-interface {v10, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 786
    .line 787
    .line 788
    const/16 v6, 0xe

    .line 789
    .line 790
    invoke-static {v6}, Lo3/a;->a(I)J

    .line 791
    .line 792
    .line 793
    move-result-wide v6

    .line 794
    invoke-static {}, Ln3/a;->c()J

    .line 795
    .line 796
    .line 797
    move-result-wide v8

    .line 798
    move-object/from16 v27, v10

    .line 799
    .line 800
    move-wide v10, v6

    .line 801
    invoke-virtual {v1}, Lk3/s0;->d()Ljava/lang/String;

    .line 802
    .line 803
    .line 804
    move-result-object v6

    .line 805
    const/16 v29, 0x0

    .line 806
    .line 807
    const v30, 0x1fff2

    .line 808
    .line 809
    .line 810
    const/4 v7, 0x0

    .line 811
    const/4 v12, 0x0

    .line 812
    const/4 v13, 0x0

    .line 813
    const/4 v14, 0x0

    .line 814
    const-wide/16 v15, 0x0

    .line 815
    .line 816
    const/16 v17, 0x0

    .line 817
    .line 818
    const/16 v18, 0x0

    .line 819
    .line 820
    const-wide/16 v19, 0x0

    .line 821
    .line 822
    const/16 v21, 0x0

    .line 823
    .line 824
    const/16 v22, 0x0

    .line 825
    .line 826
    const/16 v23, 0x0

    .line 827
    .line 828
    const/16 v24, 0x0

    .line 829
    .line 830
    const/16 v25, 0x0

    .line 831
    .line 832
    const/16 v26, 0x0

    .line 833
    .line 834
    const/16 v28, 0xd80

    .line 835
    .line 836
    invoke-static/range {v6 .. v30}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 837
    .line 838
    .line 839
    move-object/from16 v10, v27

    .line 840
    .line 841
    :goto_c
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 842
    .line 843
    .line 844
    goto :goto_d

    .line 845
    :cond_1a
    const v6, -0x773f4c22

    .line 846
    .line 847
    .line 848
    invoke-interface {v10, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 849
    .line 850
    .line 851
    goto :goto_c

    .line 852
    :goto_d
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 853
    .line 854
    .line 855
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 856
    .line 857
    .line 858
    move-result-object v6

    .line 859
    invoke-virtual/range {v32 .. v32}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    .line 860
    .line 861
    .line 862
    move-result-object v7

    .line 863
    invoke-static {v6, v7, v10, v5}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 864
    .line 865
    .line 866
    move-result-object v6

    .line 867
    invoke-static {v10, v5}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 868
    .line 869
    .line 870
    move-result v7

    .line 871
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 872
    .line 873
    .line 874
    move-result-object v8

    .line 875
    invoke-static {v10, v4}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 876
    .line 877
    .line 878
    move-result-object v4

    .line 879
    invoke-virtual/range {v33 .. v33}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 880
    .line 881
    .line 882
    move-result-object v9

    .line 883
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 884
    .line 885
    .line 886
    move-result-object v11

    .line 887
    if-nez v11, :cond_1b

    .line 888
    .line 889
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 890
    .line 891
    .line 892
    :cond_1b
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 893
    .line 894
    .line 895
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 896
    .line 897
    .line 898
    move-result v11

    .line 899
    if-eqz v11, :cond_1c

    .line 900
    .line 901
    invoke-interface {v10, v9}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 902
    .line 903
    .line 904
    goto :goto_e

    .line 905
    :cond_1c
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 906
    .line 907
    .line 908
    :goto_e
    invoke-static {v10}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 909
    .line 910
    .line 911
    move-result-object v9

    .line 912
    invoke-virtual/range {v33 .. v33}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 913
    .line 914
    .line 915
    move-result-object v11

    .line 916
    invoke-static {v9, v6, v11}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 917
    .line 918
    .line 919
    invoke-virtual/range {v33 .. v33}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 920
    .line 921
    .line 922
    move-result-object v6

    .line 923
    invoke-static {v9, v8, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 924
    .line 925
    .line 926
    invoke-virtual/range {v33 .. v33}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 927
    .line 928
    .line 929
    move-result-object v6

    .line 930
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 931
    .line 932
    .line 933
    move-result v8

    .line 934
    if-nez v8, :cond_1d

    .line 935
    .line 936
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 937
    .line 938
    .line 939
    move-result-object v8

    .line 940
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 941
    .line 942
    .line 943
    move-result-object v11

    .line 944
    invoke-static {v8, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 945
    .line 946
    .line 947
    move-result v8

    .line 948
    if-nez v8, :cond_1e

    .line 949
    .line 950
    :cond_1d
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 951
    .line 952
    .line 953
    move-result-object v8

    .line 954
    invoke-interface {v9, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 955
    .line 956
    .line 957
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 958
    .line 959
    .line 960
    move-result-object v7

    .line 961
    invoke-interface {v9, v7, v6}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 962
    .line 963
    .line 964
    :cond_1e
    invoke-virtual/range {v33 .. v33}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 965
    .line 966
    .line 967
    move-result-object v6

    .line 968
    invoke-static {v9, v4, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 969
    .line 970
    .line 971
    invoke-virtual {v1}, Lk3/s0;->g()Z

    .line 972
    .line 973
    .line 974
    move-result v4

    .line 975
    const v13, -0x1eb26619

    .line 976
    .line 977
    .line 978
    if-eqz v4, :cond_23

    .line 979
    .line 980
    const v4, -0x1e8f67f2

    .line 981
    .line 982
    .line 983
    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 984
    .line 985
    .line 986
    invoke-virtual {v1}, Lk3/s0;->b()J

    .line 987
    .line 988
    .line 989
    move-result-wide v6

    .line 990
    sget v4, Lcom/zykj/gallery/R$string;->receiver:I

    .line 991
    .line 992
    invoke-static {v4, v10, v5}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 993
    .line 994
    .line 995
    move-result-object v8

    .line 996
    and-int/lit8 v4, v0, 0xe

    .line 997
    .line 998
    const/4 v9, 0x4

    .line 999
    if-ne v4, v9, :cond_1f

    .line 1000
    .line 1001
    move/from16 v15, v37

    .line 1002
    .line 1003
    goto :goto_f

    .line 1004
    :cond_1f
    move v15, v5

    .line 1005
    :goto_f
    and-int/lit16 v4, v0, 0x380

    .line 1006
    .line 1007
    const/16 v9, 0x100

    .line 1008
    .line 1009
    if-ne v4, v9, :cond_20

    .line 1010
    .line 1011
    move/from16 v4, v37

    .line 1012
    .line 1013
    goto :goto_10

    .line 1014
    :cond_20
    move v4, v5

    .line 1015
    :goto_10
    or-int/2addr v4, v15

    .line 1016
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v9

    .line 1020
    if-nez v4, :cond_21

    .line 1021
    .line 1022
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 1023
    .line 1024
    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v4

    .line 1028
    if-ne v9, v4, :cond_22

    .line 1029
    .line 1030
    :cond_21
    new-instance v9, Lk3/f0;

    .line 1031
    .line 1032
    invoke-direct {v9, v1, v3}, Lk3/f0;-><init>(Lk3/s0;Lkotlin/jvm/functions/Function0;)V

    .line 1033
    .line 1034
    .line 1035
    invoke-interface {v10, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1036
    .line 1037
    .line 1038
    :cond_22
    check-cast v9, Lkotlin/jvm/functions/Function0;

    .line 1039
    .line 1040
    const/4 v11, 0x0

    .line 1041
    const/4 v12, 0x0

    .line 1042
    invoke-static/range {v6 .. v12}, Lk3/m0;->i(JLjava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    .line 1043
    .line 1044
    .line 1045
    :goto_11
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1046
    .line 1047
    .line 1048
    goto :goto_12

    .line 1049
    :cond_23
    invoke-interface {v10, v13}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1050
    .line 1051
    .line 1052
    goto :goto_11

    .line 1053
    :goto_12
    invoke-virtual {v1}, Lk3/s0;->f()Z

    .line 1054
    .line 1055
    .line 1056
    move-result v4

    .line 1057
    if-eqz v4, :cond_28

    .line 1058
    .line 1059
    const v4, -0x1e8a1b36

    .line 1060
    .line 1061
    .line 1062
    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1063
    .line 1064
    .line 1065
    invoke-virtual {v1}, Lk3/s0;->b()J

    .line 1066
    .line 1067
    .line 1068
    move-result-wide v6

    .line 1069
    invoke-virtual {v1}, Lk3/s0;->a()Ljava/lang/String;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v8

    .line 1073
    and-int/lit8 v4, v0, 0xe

    .line 1074
    .line 1075
    const/4 v9, 0x4

    .line 1076
    if-ne v4, v9, :cond_24

    .line 1077
    .line 1078
    move/from16 v15, v37

    .line 1079
    .line 1080
    goto :goto_13

    .line 1081
    :cond_24
    move v15, v5

    .line 1082
    :goto_13
    and-int/lit8 v0, v0, 0x70

    .line 1083
    .line 1084
    const/16 v4, 0x20

    .line 1085
    .line 1086
    if-ne v0, v4, :cond_25

    .line 1087
    .line 1088
    goto :goto_14

    .line 1089
    :cond_25
    move/from16 v37, v5

    .line 1090
    .line 1091
    :goto_14
    or-int v0, v15, v37

    .line 1092
    .line 1093
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v4

    .line 1097
    if-nez v0, :cond_26

    .line 1098
    .line 1099
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 1100
    .line 1101
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v0

    .line 1105
    if-ne v4, v0, :cond_27

    .line 1106
    .line 1107
    :cond_26
    new-instance v4, Lk3/g0;

    .line 1108
    .line 1109
    invoke-direct {v4, v1, v2}, Lk3/g0;-><init>(Lk3/s0;Lkotlin/jvm/functions/Function0;)V

    .line 1110
    .line 1111
    .line 1112
    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1113
    .line 1114
    .line 1115
    :cond_27
    move-object v9, v4

    .line 1116
    check-cast v9, Lkotlin/jvm/functions/Function0;

    .line 1117
    .line 1118
    const/4 v11, 0x0

    .line 1119
    const/4 v12, 0x0

    .line 1120
    invoke-static/range {v6 .. v12}, Lk3/m0;->i(JLjava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    .line 1121
    .line 1122
    .line 1123
    :goto_15
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1124
    .line 1125
    .line 1126
    goto :goto_16

    .line 1127
    :cond_28
    invoke-interface {v10, v13}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1128
    .line 1129
    .line 1130
    goto :goto_15

    .line 1131
    :goto_16
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1132
    .line 1133
    .line 1134
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1135
    .line 1136
    .line 1137
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 1138
    .line 1139
    .line 1140
    move-result v0

    .line 1141
    if-eqz v0, :cond_2a

    .line 1142
    .line 1143
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 1144
    .line 1145
    .line 1146
    goto :goto_17

    .line 1147
    :cond_29
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 1148
    .line 1149
    .line 1150
    :cond_2a
    :goto_17
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v6

    .line 1154
    if-eqz v6, :cond_2b

    .line 1155
    .line 1156
    new-instance v0, Lk3/h0;

    .line 1157
    .line 1158
    move-object/from16 v4, p3

    .line 1159
    .line 1160
    move/from16 v5, p5

    .line 1161
    .line 1162
    invoke-direct/range {v0 .. v5}, Lk3/h0;-><init>(Lk3/s0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V

    .line 1163
    .line 1164
    .line 1165
    invoke-interface {v6, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 1166
    .line 1167
    .line 1168
    :cond_2b
    return-void
.end method

.method public static final n(Lk3/s0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 6

    .line 1
    or-int/lit8 p4, p4, 0x1

    .line 2
    .line 3
    invoke-static {p4}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 4
    .line 5
    .line 6
    move-result v5

    .line 7
    move-object v0, p0

    .line 8
    move-object v1, p1

    .line 9
    move-object v2, p2

    .line 10
    move-object v3, p3

    .line 11
    move-object v4, p5

    .line 12
    invoke-static/range {v0 .. v5}, Lk3/m0;->m(Lk3/s0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    .line 13
    .line 14
    .line 15
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    return-object p0
.end method

.method public static final o(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
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

.method public static final p(Lk3/s0;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lk3/s0;->c()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    .line 12
    return-object p0
.end method

.method public static final q(Lk3/s0;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lk3/s0;->c()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    .line 12
    return-object p0
.end method

.method public static final r(ILandroidx/compose/runtime/Composer;II)V
    .locals 11

    .line 1
    const v0, 0x7c9df145

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 5
    .line 6
    .line 7
    move-result-object v8

    .line 8
    and-int/lit8 p1, p2, 0x6

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    and-int/lit8 p1, p3, 0x1

    .line 14
    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    invoke-interface {v8, p0}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    const/4 p1, 0x4

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move p1, v1

    .line 26
    :goto_0
    or-int/2addr p1, p2

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move p1, p2

    .line 29
    :goto_1
    and-int/lit8 v2, p1, 0x3

    .line 30
    .line 31
    if-eq v2, v1, :cond_2

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    goto :goto_2

    .line 35
    :cond_2
    const/4 v1, 0x0

    .line 36
    :goto_2
    and-int/lit8 v2, p1, 0x1

    .line 37
    .line 38
    invoke-interface {v8, v1, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_7

    .line 43
    .line 44
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 45
    .line 46
    .line 47
    and-int/lit8 v1, p2, 0x1

    .line 48
    .line 49
    if-eqz v1, :cond_4

    .line 50
    .line 51
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    goto :goto_4

    .line 58
    :cond_3
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 59
    .line 60
    .line 61
    and-int/lit8 v1, p3, 0x1

    .line 62
    .line 63
    if-eqz v1, :cond_5

    .line 64
    .line 65
    :goto_3
    and-int/lit8 p1, p1, -0xf

    .line 66
    .line 67
    goto :goto_5

    .line 68
    :cond_4
    :goto_4
    and-int/lit8 v1, p3, 0x1

    .line 69
    .line 70
    if-eqz v1, :cond_5

    .line 71
    .line 72
    sget p0, Lcom/zykj/gallery/R$drawable;->gallery_icon_back:I

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_5
    :goto_5
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 76
    .line 77
    .line 78
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-eqz v1, :cond_6

    .line 83
    .line 84
    const/4 v1, -0x1

    .line 85
    const-string v2, "com.zykj.gallery.ui.gallery.screenList.LeftIcon (GalleryTitleBar.kt:104)"

    .line 86
    .line 87
    invoke-static {v0, p1, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 88
    .line 89
    .line 90
    :cond_6
    and-int/lit8 p1, p1, 0xe

    .line 91
    .line 92
    invoke-static {p0, v8, p1}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    sget-object p1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 97
    .line 98
    const/16 v0, 0x18

    .line 99
    .line 100
    int-to-float v0, v0

    .line 101
    const/16 v2, 0x500

    .line 102
    .line 103
    int-to-float v2, v2

    .line 104
    div-float/2addr v0, v2

    .line 105
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    iget v3, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 114
    .line 115
    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 116
    .line 117
    invoke-static {v3, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    int-to-float v2, v2

    .line 122
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    .line 131
    .line 132
    div-float/2addr v2, v3

    .line 133
    mul-float/2addr v0, v2

    .line 134
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    invoke-static {p1, v0}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    const/16 v9, 0x1b0

    .line 143
    .line 144
    const/16 v10, 0x78

    .line 145
    .line 146
    const-string v2, "\u8fd4\u56de"

    .line 147
    .line 148
    const/4 v4, 0x0

    .line 149
    const/4 v5, 0x0

    .line 150
    const/4 v6, 0x0

    .line 151
    const/4 v7, 0x0

    .line 152
    invoke-static/range {v1 .. v10}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 153
    .line 154
    .line 155
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    if-eqz p1, :cond_8

    .line 160
    .line 161
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 162
    .line 163
    .line 164
    goto :goto_6

    .line 165
    :cond_7
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 166
    .line 167
    .line 168
    :cond_8
    :goto_6
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    if-eqz p1, :cond_9

    .line 173
    .line 174
    new-instance v0, Lk3/l0;

    .line 175
    .line 176
    invoke-direct {v0, p0, p2, p3}, Lk3/l0;-><init>(III)V

    .line 177
    .line 178
    .line 179
    invoke-interface {p1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 180
    .line 181
    .line 182
    :cond_9
    return-void
.end method

.method public static final s(IIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    or-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-static {p0, p3, p1, p2}, Lk3/m0;->r(ILandroidx/compose/runtime/Composer;II)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    .line 12
    return-object p0
.end method
