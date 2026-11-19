.class public abstract Lcom/zykj/mistake/feature/notebook/list/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x60

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    sput v0, Lcom/zykj/mistake/feature/notebook/list/d;->a:F

    .line 9
    .line 10
    return-void
.end method

.method public static final a(Lp4/b;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p4

    .line 6
    .line 7
    const v3, 0xf71767

    .line 8
    .line 9
    .line 10
    move-object/from16 v4, p3

    .line 11
    .line 12
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    and-int/lit8 v5, v2, 0x6

    .line 17
    .line 18
    if-nez v5, :cond_1

    .line 19
    .line 20
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    const/4 v5, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v5, 0x2

    .line 29
    :goto_0
    or-int/2addr v5, v2

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v5, v2

    .line 32
    :goto_1
    and-int/lit8 v6, v2, 0x30

    .line 33
    .line 34
    const/16 v7, 0x20

    .line 35
    .line 36
    if-nez v6, :cond_3

    .line 37
    .line 38
    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    if-eqz v6, :cond_2

    .line 43
    .line 44
    move v6, v7

    .line 45
    goto :goto_2

    .line 46
    :cond_2
    const/16 v6, 0x10

    .line 47
    .line 48
    :goto_2
    or-int/2addr v5, v6

    .line 49
    :cond_3
    or-int/lit16 v5, v5, 0x180

    .line 50
    .line 51
    and-int/lit16 v6, v5, 0x93

    .line 52
    .line 53
    const/16 v8, 0x92

    .line 54
    .line 55
    const/4 v9, 0x0

    .line 56
    const/4 v10, 0x1

    .line 57
    if-eq v6, v8, :cond_4

    .line 58
    .line 59
    move v6, v10

    .line 60
    goto :goto_3

    .line 61
    :cond_4
    move v6, v9

    .line 62
    :goto_3
    and-int/lit8 v8, v5, 0x1

    .line 63
    .line 64
    invoke-interface {v4, v6, v8}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    if-eqz v6, :cond_12

    .line 69
    .line 70
    sget-object v6, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 71
    .line 72
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 73
    .line 74
    .line 75
    move-result v8

    .line 76
    if-eqz v8, :cond_5

    .line 77
    .line 78
    const/4 v8, -0x1

    .line 79
    const-string v11, "com.zykj.mistake.feature.notebook.list.MistakeCardMetadata (MistakeCardMetadata.kt:98)"

    .line 80
    .line 81
    invoke-static {v3, v5, v8, v11}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :cond_5
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    check-cast v3, Landroidx/compose/ui/unit/Density;

    .line 93
    .line 94
    invoke-interface {v3}, Landroidx/compose/ui/unit/Density;->getDensity()F

    .line 95
    .line 96
    .line 97
    move-result v8

    .line 98
    invoke-interface {v3}, Landroidx/compose/ui/unit/FontScaling;->getFontScale()F

    .line 99
    .line 100
    .line 101
    move-result v11

    .line 102
    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 103
    .line 104
    .line 105
    move-result v8

    .line 106
    invoke-interface {v4, v11}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 107
    .line 108
    .line 109
    move-result v11

    .line 110
    or-int/2addr v8, v11

    .line 111
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v11

    .line 115
    if-nez v8, :cond_6

    .line 116
    .line 117
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 118
    .line 119
    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    if-ne v11, v8, :cond_7

    .line 124
    .line 125
    :cond_6
    const/16 v8, 0xc

    .line 126
    .line 127
    invoke-static {v8}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 128
    .line 129
    .line 130
    move-result-wide v11

    .line 131
    invoke-interface {v3, v11, v12}, Landroidx/compose/ui/unit/Density;->toPx--R2X_6o(J)F

    .line 132
    .line 133
    .line 134
    move-result v8

    .line 135
    const/16 v11, 0xb

    .line 136
    .line 137
    invoke-static {v11}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 138
    .line 139
    .line 140
    move-result-wide v11

    .line 141
    invoke-interface {v3, v11, v12}, Landroidx/compose/ui/unit/Density;->toPx--R2X_6o(J)F

    .line 142
    .line 143
    .line 144
    move-result v11

    .line 145
    const/16 v12, 0xa

    .line 146
    .line 147
    invoke-static {v12}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 148
    .line 149
    .line 150
    move-result-wide v12

    .line 151
    invoke-interface {v3, v12, v13}, Landroidx/compose/ui/unit/Density;->toPx--R2X_6o(J)F

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    new-instance v12, Lcom/zykj/mistake/feature/notebook/list/e;

    .line 156
    .line 157
    invoke-direct {v12, v8, v11, v3}, Lcom/zykj/mistake/feature/notebook/list/e;-><init>(FFF)V

    .line 158
    .line 159
    .line 160
    invoke-interface {v4, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    move-object v11, v12

    .line 164
    :cond_7
    check-cast v11, Lcom/zykj/mistake/feature/notebook/list/e;

    .line 165
    .line 166
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    and-int/lit8 v5, v5, 0x70

    .line 171
    .line 172
    if-ne v5, v7, :cond_8

    .line 173
    .line 174
    move v8, v10

    .line 175
    goto :goto_4

    .line 176
    :cond_8
    move v8, v9

    .line 177
    :goto_4
    or-int/2addr v3, v8

    .line 178
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v8

    .line 182
    if-nez v3, :cond_9

    .line 183
    .line 184
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 185
    .line 186
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    if-ne v8, v3, :cond_c

    .line 191
    .line 192
    :cond_9
    new-instance v3, Ljava/lang/StringBuilder;

    .line 193
    .line 194
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 195
    .line 196
    .line 197
    iget-object v8, v0, Lp4/b;->f:Ljava/lang/String;

    .line 198
    .line 199
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    iget-object v8, v0, Lp4/b;->g:Ljava/lang/String;

    .line 206
    .line 207
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    iget-object v12, v0, Lp4/b;->p:Ljava/util/List;

    .line 214
    .line 215
    new-instance v8, Lcom/zykj/mistake/feature/collection/component/j;

    .line 216
    .line 217
    const/16 v13, 0x19

    .line 218
    .line 219
    invoke-direct {v8, v13}, Lcom/zykj/mistake/feature/collection/component/j;-><init>(I)V

    .line 220
    .line 221
    .line 222
    const/16 v17, 0x1e

    .line 223
    .line 224
    const-string v13, " "

    .line 225
    .line 226
    const/4 v14, 0x0

    .line 227
    const/4 v15, 0x0

    .line 228
    move-object/from16 v16, v8

    .line 229
    .line 230
    invoke-static/range {v12 .. v17}, Lkotlin/collections/t;->n0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lr6/c;I)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v8

    .line 234
    invoke-static {v8}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 235
    .line 236
    .line 237
    move-result v12

    .line 238
    if-eqz v12, :cond_a

    .line 239
    .line 240
    const-string v8, "\u6682\u65e0\u6807\u7b7e"

    .line 241
    .line 242
    :cond_a
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    const-string v8, " \u6b63\u786e "

    .line 246
    .line 247
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    iget v8, v0, Lp4/b;->q:I

    .line 251
    .line 252
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    const-string v8, " \u9519\u8bef "

    .line 256
    .line 257
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    iget v8, v0, Lp4/b;->r:I

    .line 261
    .line 262
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    if-nez v1, :cond_b

    .line 266
    .line 267
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    iget-object v8, v0, Lp4/b;->s:Ljava/lang/String;

    .line 271
    .line 272
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    :cond_b
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v8

    .line 279
    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    :cond_c
    check-cast v8, Ljava/lang/String;

    .line 283
    .line 284
    const/4 v3, 0x0

    .line 285
    const/4 v12, 0x0

    .line 286
    invoke-static {v6, v3, v10, v12}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 287
    .line 288
    .line 289
    move-result-object v3

    .line 290
    sget v12, Lcom/zykj/mistake/feature/notebook/list/d;->a:F

    .line 291
    .line 292
    invoke-static {v3, v12}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 293
    .line 294
    .line 295
    move-result-object v3

    .line 296
    invoke-interface {v4, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    move-result v12

    .line 300
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    move-result v13

    .line 304
    or-int/2addr v12, v13

    .line 305
    if-ne v5, v7, :cond_d

    .line 306
    .line 307
    goto :goto_5

    .line 308
    :cond_d
    move v10, v9

    .line 309
    :goto_5
    or-int v5, v12, v10

    .line 310
    .line 311
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v7

    .line 315
    if-nez v5, :cond_e

    .line 316
    .line 317
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 318
    .line 319
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v5

    .line 323
    if-ne v7, v5, :cond_f

    .line 324
    .line 325
    :cond_e
    new-instance v7, Landroidx/navigation/compose/a;

    .line 326
    .line 327
    invoke-direct {v7, v11, v0, v1}, Landroidx/navigation/compose/a;-><init>(Lcom/zykj/mistake/feature/notebook/list/e;Lp4/b;Z)V

    .line 328
    .line 329
    .line 330
    invoke-interface {v4, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    :cond_f
    check-cast v7, Lr6/c;

    .line 334
    .line 335
    invoke-static {v3, v7}, Landroidx/compose/ui/draw/DrawModifierKt;->drawWithCache(Landroidx/compose/ui/Modifier;Lr6/c;)Landroidx/compose/ui/Modifier;

    .line 336
    .line 337
    .line 338
    move-result-object v3

    .line 339
    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-result v5

    .line 343
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v7

    .line 347
    if-nez v5, :cond_10

    .line 348
    .line 349
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 350
    .line 351
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v5

    .line 355
    if-ne v7, v5, :cond_11

    .line 356
    .line 357
    :cond_10
    new-instance v7, Landroidx/navigation/internal/d;

    .line 358
    .line 359
    const/4 v5, 0x2

    .line 360
    invoke-direct {v7, v8, v5}, Landroidx/navigation/internal/d;-><init>(Ljava/lang/String;I)V

    .line 361
    .line 362
    .line 363
    invoke-interface {v4, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 364
    .line 365
    .line 366
    :cond_11
    check-cast v7, Lr6/c;

    .line 367
    .line 368
    invoke-static {v3, v7}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->clearAndSetSemantics(Landroidx/compose/ui/Modifier;Lr6/c;)Landroidx/compose/ui/Modifier;

    .line 369
    .line 370
    .line 371
    move-result-object v3

    .line 372
    invoke-static {v3, v4, v9}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 373
    .line 374
    .line 375
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 376
    .line 377
    .line 378
    move-result v3

    .line 379
    if-eqz v3, :cond_13

    .line 380
    .line 381
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 382
    .line 383
    .line 384
    goto :goto_6

    .line 385
    :cond_12
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 386
    .line 387
    .line 388
    move-object/from16 v6, p2

    .line 389
    .line 390
    :cond_13
    :goto_6
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 391
    .line 392
    .line 393
    move-result-object v3

    .line 394
    if-eqz v3, :cond_14

    .line 395
    .line 396
    new-instance v4, Lcom/zykj/mistake/feature/collection/detail/b1;

    .line 397
    .line 398
    invoke-direct {v4, v0, v1, v6, v2}, Lcom/zykj/mistake/feature/collection/detail/b1;-><init>(Lp4/b;ZLandroidx/compose/ui/Modifier;I)V

    .line 399
    .line 400
    .line 401
    invoke-interface {v3, v4}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 402
    .line 403
    .line 404
    :cond_14
    return-void
.end method

.method public static final b(Landroid/graphics/Paint;F)F
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/graphics/Paint;->ascent()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/graphics/Paint;->descent()F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    add-float/2addr p0, v0

    .line 10
    const/high16 v0, 0x40000000    # 2.0f

    .line 11
    .line 12
    div-float/2addr p0, v0

    .line 13
    sub-float/2addr p1, p0

    .line 14
    return p1
.end method

.method public static final c(ZFJ)Landroid/graphics/Paint;
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    .line 2
    .line 3
    const/16 v1, 0x81

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 9
    .line 10
    .line 11
    invoke-static {p2, p3}, Landroidx/compose/ui/graphics/ColorKt;->toArgb-8_81llA(J)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 16
    .line 17
    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    sget-object p0, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    sget-object p0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 24
    .line 25
    :goto_0
    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 26
    .line 27
    .line 28
    return-object v0
.end method
