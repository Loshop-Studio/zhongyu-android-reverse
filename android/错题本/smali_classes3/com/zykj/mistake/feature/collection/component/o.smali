.class public abstract Lcom/zykj/mistake/feature/collection/component/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:J

.field public static final c:Landroidx/compose/ui/text/TextStyle;


# direct methods
.method static constructor <clinit>()V
    .locals 34

    .line 1
    const/16 v0, 0x46

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
    sput v0, Lcom/zykj/mistake/feature/collection/component/o;->a:F

    .line 9
    .line 10
    const-wide v0, 0xff1576ffL

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    sput-wide v0, Lcom/zykj/mistake/feature/collection/component/o;->b:J

    .line 20
    .line 21
    new-instance v2, Landroidx/compose/ui/text/TextStyle;

    .line 22
    .line 23
    const/16 v0, 0xc

    .line 24
    .line 25
    invoke-static {v0}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 26
    .line 27
    .line 28
    move-result-wide v24

    .line 29
    new-instance v0, Landroidx/compose/ui/text/PlatformTextStyle;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-direct {v0, v1}, Landroidx/compose/ui/text/PlatformTextStyle;-><init>(Z)V

    .line 33
    .line 34
    .line 35
    const v32, 0xf5ffff

    .line 36
    .line 37
    .line 38
    const/16 v33, 0x0

    .line 39
    .line 40
    const-wide/16 v3, 0x0

    .line 41
    .line 42
    const-wide/16 v5, 0x0

    .line 43
    .line 44
    const/4 v7, 0x0

    .line 45
    const/4 v8, 0x0

    .line 46
    const/4 v9, 0x0

    .line 47
    const/4 v10, 0x0

    .line 48
    const/4 v11, 0x0

    .line 49
    const-wide/16 v12, 0x0

    .line 50
    .line 51
    const/4 v14, 0x0

    .line 52
    const/4 v15, 0x0

    .line 53
    const/16 v16, 0x0

    .line 54
    .line 55
    const-wide/16 v17, 0x0

    .line 56
    .line 57
    const/16 v19, 0x0

    .line 58
    .line 59
    const/16 v20, 0x0

    .line 60
    .line 61
    const/16 v21, 0x0

    .line 62
    .line 63
    const/16 v22, 0x0

    .line 64
    .line 65
    const/16 v23, 0x0

    .line 66
    .line 67
    const/16 v26, 0x0

    .line 68
    .line 69
    const/16 v28, 0x0

    .line 70
    .line 71
    const/16 v29, 0x0

    .line 72
    .line 73
    const/16 v30, 0x0

    .line 74
    .line 75
    const/16 v31, 0x0

    .line 76
    .line 77
    move-object/from16 v27, v0

    .line 78
    .line 79
    invoke-direct/range {v2 .. v33}, Landroidx/compose/ui/text/TextStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILkotlin/jvm/internal/e;)V

    .line 80
    .line 81
    .line 82
    sput-object v2, Lcom/zykj/mistake/feature/collection/component/o;->c:Landroidx/compose/ui/text/TextStyle;

    .line 83
    .line 84
    return-void
.end method

.method public static final a(Lp4/b;ZZZLr6/a;Lr6/a;Landroidx/compose/runtime/Composer;I)V
    .locals 45

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
    move/from16 v4, p3

    .line 8
    .line 9
    move/from16 v7, p7

    .line 10
    .line 11
    const v0, 0x67add8ca

    .line 12
    .line 13
    .line 14
    move-object/from16 v5, p6

    .line 15
    .line 16
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 17
    .line 18
    .line 19
    move-result-object v15

    .line 20
    and-int/lit8 v5, v7, 0x6

    .line 21
    .line 22
    const/4 v6, 0x4

    .line 23
    if-nez v5, :cond_1

    .line 24
    .line 25
    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    if-eqz v5, :cond_0

    .line 30
    .line 31
    move v5, v6

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v5, 0x2

    .line 34
    :goto_0
    or-int/2addr v5, v7

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move v5, v7

    .line 37
    :goto_1
    and-int/lit8 v8, v7, 0x30

    .line 38
    .line 39
    if-nez v8, :cond_3

    .line 40
    .line 41
    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 42
    .line 43
    .line 44
    move-result v8

    .line 45
    if-eqz v8, :cond_2

    .line 46
    .line 47
    const/16 v8, 0x20

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const/16 v8, 0x10

    .line 51
    .line 52
    :goto_2
    or-int/2addr v5, v8

    .line 53
    :cond_3
    and-int/lit16 v8, v7, 0x180

    .line 54
    .line 55
    if-nez v8, :cond_5

    .line 56
    .line 57
    invoke-interface {v15, v3}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 58
    .line 59
    .line 60
    move-result v8

    .line 61
    if-eqz v8, :cond_4

    .line 62
    .line 63
    const/16 v8, 0x100

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_4
    const/16 v8, 0x80

    .line 67
    .line 68
    :goto_3
    or-int/2addr v5, v8

    .line 69
    :cond_5
    and-int/lit16 v8, v7, 0xc00

    .line 70
    .line 71
    if-nez v8, :cond_7

    .line 72
    .line 73
    invoke-interface {v15, v4}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    if-eqz v8, :cond_6

    .line 78
    .line 79
    const/16 v8, 0x800

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_6
    const/16 v8, 0x400

    .line 83
    .line 84
    :goto_4
    or-int/2addr v5, v8

    .line 85
    :cond_7
    and-int/lit16 v8, v7, 0x6000

    .line 86
    .line 87
    if-nez v8, :cond_9

    .line 88
    .line 89
    move-object/from16 v8, p4

    .line 90
    .line 91
    invoke-interface {v15, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v9

    .line 95
    if-eqz v9, :cond_8

    .line 96
    .line 97
    const/16 v9, 0x4000

    .line 98
    .line 99
    goto :goto_5

    .line 100
    :cond_8
    const/16 v9, 0x2000

    .line 101
    .line 102
    :goto_5
    or-int/2addr v5, v9

    .line 103
    goto :goto_6

    .line 104
    :cond_9
    move-object/from16 v8, p4

    .line 105
    .line 106
    :goto_6
    const/high16 v9, 0x30000

    .line 107
    .line 108
    and-int/2addr v9, v7

    .line 109
    if-nez v9, :cond_b

    .line 110
    .line 111
    move-object/from16 v9, p5

    .line 112
    .line 113
    invoke-interface {v15, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v10

    .line 117
    if-eqz v10, :cond_a

    .line 118
    .line 119
    const/high16 v10, 0x20000

    .line 120
    .line 121
    goto :goto_7

    .line 122
    :cond_a
    const/high16 v10, 0x10000

    .line 123
    .line 124
    :goto_7
    or-int/2addr v5, v10

    .line 125
    goto :goto_8

    .line 126
    :cond_b
    move-object/from16 v9, p5

    .line 127
    .line 128
    :goto_8
    const v10, 0x12493

    .line 129
    .line 130
    .line 131
    and-int/2addr v10, v5

    .line 132
    const v11, 0x12492

    .line 133
    .line 134
    .line 135
    const/4 v12, 0x1

    .line 136
    if-eq v10, v11, :cond_c

    .line 137
    .line 138
    move v10, v12

    .line 139
    goto :goto_9

    .line 140
    :cond_c
    const/4 v10, 0x0

    .line 141
    :goto_9
    and-int/lit8 v11, v5, 0x1

    .line 142
    .line 143
    invoke-interface {v15, v10, v11}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 144
    .line 145
    .line 146
    move-result v10

    .line 147
    if-eqz v10, :cond_25

    .line 148
    .line 149
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 150
    .line 151
    .line 152
    move-result v10

    .line 153
    if-eqz v10, :cond_d

    .line 154
    .line 155
    const/4 v10, -0x1

    .line 156
    const-string v11, "com.zykj.mistake.feature.collection.component.MistakeQuestionCard (MistakeQuestionGrid.kt:144)"

    .line 157
    .line 158
    invoke-static {v0, v5, v10, v11}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 159
    .line 160
    .line 161
    :cond_d
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 162
    .line 163
    const/4 v5, 0x0

    .line 164
    const/4 v10, 0x0

    .line 165
    invoke-static {v0, v5, v12, v10}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 166
    .line 167
    .line 168
    move-result-object v11

    .line 169
    sget-object v14, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 170
    .line 171
    move-object/from16 v16, v14

    .line 172
    .line 173
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 174
    .line 175
    .line 176
    move-result-wide v13

    .line 177
    int-to-float v6, v6

    .line 178
    invoke-static {v6, v11, v13, v14}, Landroidx/compose/material3/c;->f(FLandroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    .line 179
    .line 180
    .line 181
    move-result-object v11

    .line 182
    if-eqz v4, :cond_e

    .line 183
    .line 184
    const v13, 0x3eb33333    # 0.35f

    .line 185
    .line 186
    .line 187
    goto :goto_a

    .line 188
    :cond_e
    const/high16 v13, 0x3f800000    # 1.0f

    .line 189
    .line 190
    :goto_a
    invoke-static {v11, v13}, Landroidx/compose/ui/draw/AlphaKt;->alpha(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 191
    .line 192
    .line 193
    move-result-object v11

    .line 194
    if-eqz v3, :cond_f

    .line 195
    .line 196
    int-to-float v13, v12

    .line 197
    invoke-static {v13}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 198
    .line 199
    .line 200
    move-result v13

    .line 201
    goto :goto_b

    .line 202
    :cond_f
    const/4 v13, 0x0

    .line 203
    int-to-float v14, v13

    .line 204
    invoke-static {v14}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 205
    .line 206
    .line 207
    move-result v13

    .line 208
    :goto_b
    if-eqz v3, :cond_10

    .line 209
    .line 210
    sget-wide v16, Lcom/zykj/mistake/feature/collection/component/o;->b:J

    .line 211
    .line 212
    :goto_c
    move v14, v6

    .line 213
    move-wide/from16 v5, v16

    .line 214
    .line 215
    goto :goto_d

    .line 216
    :cond_10
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/graphics/Color$Companion;->getTransparent-0d7_KjU()J

    .line 217
    .line 218
    .line 219
    move-result-wide v16

    .line 220
    goto :goto_c

    .line 221
    :goto_d
    invoke-static {v14}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 222
    .line 223
    .line 224
    move-result v14

    .line 225
    invoke-static {v14}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 226
    .line 227
    .line 228
    move-result-object v14

    .line 229
    invoke-static {v11, v13, v5, v6, v14}, Landroidx/compose/foundation/BorderKt;->border-xT4_qwU(Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 230
    .line 231
    .line 232
    move-result-object v16

    .line 233
    xor-int/lit8 v17, v4, 0x1

    .line 234
    .line 235
    const/16 v25, 0x6e

    .line 236
    .line 237
    const/16 v26, 0x0

    .line 238
    .line 239
    const/16 v18, 0x0

    .line 240
    .line 241
    const/16 v19, 0x0

    .line 242
    .line 243
    const/16 v20, 0x0

    .line 244
    .line 245
    const/16 v22, 0x0

    .line 246
    .line 247
    const/16 v23, 0x0

    .line 248
    .line 249
    move-object/from16 v24, v8

    .line 250
    .line 251
    move-object/from16 v21, v9

    .line 252
    .line 253
    invoke-static/range {v16 .. v26}, Landroidx/compose/foundation/ClickableKt;->combinedClickable-f5TDLPQ$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Ljava/lang/String;Lr6/a;Lr6/a;ZLr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 254
    .line 255
    .line 256
    move-result-object v5

    .line 257
    const/16 v6, 0xc

    .line 258
    .line 259
    int-to-float v8, v6

    .line 260
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 261
    .line 262
    .line 263
    move-result v8

    .line 264
    const/16 v9, 0xa

    .line 265
    .line 266
    int-to-float v11, v9

    .line 267
    invoke-static {v11}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 268
    .line 269
    .line 270
    move-result v13

    .line 271
    invoke-static {v5, v8, v13}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 272
    .line 273
    .line 274
    move-result-object v5

    .line 275
    sget-object v33, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 276
    .line 277
    invoke-virtual/range {v33 .. v33}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 278
    .line 279
    .line 280
    move-result-object v8

    .line 281
    const/4 v13, 0x0

    .line 282
    invoke-static {v8, v13}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 283
    .line 284
    .line 285
    move-result-object v8

    .line 286
    invoke-static {v15, v13}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 287
    .line 288
    .line 289
    move-result v14

    .line 290
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 291
    .line 292
    .line 293
    move-result-object v13

    .line 294
    invoke-static {v15, v5}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 295
    .line 296
    .line 297
    move-result-object v5

    .line 298
    move/from16 v34, v6

    .line 299
    .line 300
    sget-object v6, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 301
    .line 302
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 303
    .line 304
    .line 305
    move-result-object v9

    .line 306
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 307
    .line 308
    .line 309
    move-result-object v17

    .line 310
    if-nez v17, :cond_11

    .line 311
    .line 312
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 313
    .line 314
    .line 315
    :cond_11
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 316
    .line 317
    .line 318
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 319
    .line 320
    .line 321
    move-result v17

    .line 322
    if-eqz v17, :cond_12

    .line 323
    .line 324
    invoke-interface {v15, v9}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 325
    .line 326
    .line 327
    goto :goto_e

    .line 328
    :cond_12
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 329
    .line 330
    .line 331
    :goto_e
    invoke-static {v15}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 332
    .line 333
    .line 334
    move-result-object v9

    .line 335
    invoke-static {v6, v9, v8, v9, v13}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 336
    .line 337
    .line 338
    move-result-object v8

    .line 339
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 340
    .line 341
    .line 342
    move-result v13

    .line 343
    if-nez v13, :cond_13

    .line 344
    .line 345
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v13

    .line 349
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 350
    .line 351
    .line 352
    move-result-object v10

    .line 353
    invoke-static {v13, v10}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 354
    .line 355
    .line 356
    move-result v10

    .line 357
    if-nez v10, :cond_14

    .line 358
    .line 359
    :cond_13
    invoke-static {v14, v9, v14, v8}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 360
    .line 361
    .line 362
    :cond_14
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 363
    .line 364
    .line 365
    move-result-object v8

    .line 366
    invoke-static {v9, v5, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 367
    .line 368
    .line 369
    sget-object v5, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 370
    .line 371
    sget-object v35, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 372
    .line 373
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 374
    .line 375
    .line 376
    move-result-object v8

    .line 377
    invoke-virtual/range {v33 .. v33}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 378
    .line 379
    .line 380
    move-result-object v9

    .line 381
    const/4 v13, 0x0

    .line 382
    invoke-static {v8, v9, v15, v13}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 383
    .line 384
    .line 385
    move-result-object v8

    .line 386
    invoke-static {v15, v13}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 387
    .line 388
    .line 389
    move-result v9

    .line 390
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 391
    .line 392
    .line 393
    move-result-object v10

    .line 394
    invoke-static {v15, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 395
    .line 396
    .line 397
    move-result-object v13

    .line 398
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 399
    .line 400
    .line 401
    move-result-object v14

    .line 402
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 403
    .line 404
    .line 405
    move-result-object v18

    .line 406
    if-nez v18, :cond_15

    .line 407
    .line 408
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 409
    .line 410
    .line 411
    :cond_15
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 412
    .line 413
    .line 414
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 415
    .line 416
    .line 417
    move-result v18

    .line 418
    if-eqz v18, :cond_16

    .line 419
    .line 420
    invoke-interface {v15, v14}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 421
    .line 422
    .line 423
    goto :goto_f

    .line 424
    :cond_16
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 425
    .line 426
    .line 427
    :goto_f
    invoke-static {v15}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 428
    .line 429
    .line 430
    move-result-object v14

    .line 431
    invoke-static {v6, v14, v8, v14, v10}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 432
    .line 433
    .line 434
    move-result-object v8

    .line 435
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 436
    .line 437
    .line 438
    move-result v10

    .line 439
    if-nez v10, :cond_17

    .line 440
    .line 441
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v10

    .line 445
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 446
    .line 447
    .line 448
    move-result-object v12

    .line 449
    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 450
    .line 451
    .line 452
    move-result v10

    .line 453
    if-nez v10, :cond_18

    .line 454
    .line 455
    :cond_17
    invoke-static {v9, v14, v9, v8}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 456
    .line 457
    .line 458
    :cond_18
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 459
    .line 460
    .line 461
    move-result-object v8

    .line 462
    invoke-static {v14, v13, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 463
    .line 464
    .line 465
    sget-object v8, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 466
    .line 467
    iget-object v8, v1, Lp4/b;->i:Ljava/lang/String;

    .line 468
    .line 469
    const/4 v13, 0x0

    .line 470
    invoke-static {v8, v15, v13}, Lcom/zykj/mistake/feature/collection/component/o;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    .line 471
    .line 472
    .line 473
    const/4 v8, 0x0

    .line 474
    const/4 v9, 0x0

    .line 475
    const/4 v10, 0x1

    .line 476
    invoke-static {v0, v9, v10, v8}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 477
    .line 478
    .line 479
    move-result-object v17

    .line 480
    const/16 v9, 0x8

    .line 481
    .line 482
    int-to-float v9, v9

    .line 483
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 484
    .line 485
    .line 486
    move-result v19

    .line 487
    const/16 v22, 0xd

    .line 488
    .line 489
    const/16 v23, 0x0

    .line 490
    .line 491
    const/16 v18, 0x0

    .line 492
    .line 493
    const/16 v20, 0x0

    .line 494
    .line 495
    const/16 v21, 0x0

    .line 496
    .line 497
    invoke-static/range {v17 .. v23}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 498
    .line 499
    .line 500
    move-result-object v12

    .line 501
    invoke-virtual/range {v33 .. v33}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 502
    .line 503
    .line 504
    move-result-object v13

    .line 505
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 506
    .line 507
    .line 508
    move-result-object v14

    .line 509
    move/from16 v17, v9

    .line 510
    .line 511
    const/16 v9, 0x30

    .line 512
    .line 513
    invoke-static {v14, v13, v15, v9}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 514
    .line 515
    .line 516
    move-result-object v13

    .line 517
    const/4 v14, 0x0

    .line 518
    invoke-static {v15, v14}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 519
    .line 520
    .line 521
    move-result v8

    .line 522
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 523
    .line 524
    .line 525
    move-result-object v9

    .line 526
    invoke-static {v15, v12}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 527
    .line 528
    .line 529
    move-result-object v12

    .line 530
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 531
    .line 532
    .line 533
    move-result-object v10

    .line 534
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 535
    .line 536
    .line 537
    move-result-object v20

    .line 538
    if-nez v20, :cond_19

    .line 539
    .line 540
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 541
    .line 542
    .line 543
    :cond_19
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 544
    .line 545
    .line 546
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 547
    .line 548
    .line 549
    move-result v20

    .line 550
    if-eqz v20, :cond_1a

    .line 551
    .line 552
    invoke-interface {v15, v10}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 553
    .line 554
    .line 555
    goto :goto_10

    .line 556
    :cond_1a
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 557
    .line 558
    .line 559
    :goto_10
    invoke-static {v15}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 560
    .line 561
    .line 562
    move-result-object v10

    .line 563
    invoke-static {v6, v10, v13, v10, v9}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 564
    .line 565
    .line 566
    move-result-object v9

    .line 567
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 568
    .line 569
    .line 570
    move-result v13

    .line 571
    if-nez v13, :cond_1b

    .line 572
    .line 573
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    move-result-object v13

    .line 577
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 578
    .line 579
    .line 580
    move-result-object v14

    .line 581
    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 582
    .line 583
    .line 584
    move-result v13

    .line 585
    if-nez v13, :cond_1c

    .line 586
    .line 587
    :cond_1b
    invoke-static {v8, v10, v8, v9}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 588
    .line 589
    .line 590
    :cond_1c
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 591
    .line 592
    .line 593
    move-result-object v8

    .line 594
    invoke-static {v10, v12, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 595
    .line 596
    .line 597
    sget-object v36, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 598
    .line 599
    iget-object v8, v1, Lp4/b;->f:Ljava/lang/String;

    .line 600
    .line 601
    invoke-static/range {v34 .. v34}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 602
    .line 603
    .line 604
    move-result-wide v12

    .line 605
    sget-object v37, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    .line 606
    .line 607
    move-object/from16 v29, v15

    .line 608
    .line 609
    invoke-virtual/range {v37 .. v37}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    .line 610
    .line 611
    .line 612
    move-result-object v15

    .line 613
    const/16 v31, 0x0

    .line 614
    .line 615
    const v32, 0x1ffd2

    .line 616
    .line 617
    .line 618
    const/4 v9, 0x0

    .line 619
    move v14, v11

    .line 620
    sget-wide v10, Lcom/zykj/mistake/feature/collection/component/o;->b:J

    .line 621
    .line 622
    move/from16 v21, v14

    .line 623
    .line 624
    const/4 v14, 0x0

    .line 625
    const/16 v22, 0xa

    .line 626
    .line 627
    const/16 v16, 0x0

    .line 628
    .line 629
    move/from16 v23, v17

    .line 630
    .line 631
    const/16 v24, 0x0

    .line 632
    .line 633
    const-wide/16 v17, 0x0

    .line 634
    .line 635
    const/16 v25, 0x1

    .line 636
    .line 637
    const/16 v19, 0x0

    .line 638
    .line 639
    const/16 v26, 0x0

    .line 640
    .line 641
    const/16 v20, 0x0

    .line 642
    .line 643
    move/from16 v27, v21

    .line 644
    .line 645
    move/from16 v28, v22

    .line 646
    .line 647
    const-wide/16 v21, 0x0

    .line 648
    .line 649
    move/from16 v30, v23

    .line 650
    .line 651
    const/16 v23, 0x0

    .line 652
    .line 653
    move-object/from16 v38, v24

    .line 654
    .line 655
    const/16 v24, 0x0

    .line 656
    .line 657
    move/from16 v39, v25

    .line 658
    .line 659
    const/16 v25, 0x0

    .line 660
    .line 661
    move/from16 v40, v26

    .line 662
    .line 663
    const/16 v26, 0x0

    .line 664
    .line 665
    move/from16 v41, v27

    .line 666
    .line 667
    const/16 v27, 0x0

    .line 668
    .line 669
    move/from16 v42, v28

    .line 670
    .line 671
    const/16 v28, 0x0

    .line 672
    .line 673
    move/from16 v43, v30

    .line 674
    .line 675
    const v30, 0x30d80

    .line 676
    .line 677
    .line 678
    move/from16 v2, v39

    .line 679
    .line 680
    invoke-static/range {v8 .. v32}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 681
    .line 682
    .line 683
    move-object/from16 v15, v29

    .line 684
    .line 685
    const/4 v8, 0x6

    .line 686
    int-to-float v9, v8

    .line 687
    invoke-static {v9, v0, v15, v8}, Landroidx/compose/material3/c;->s(FLandroidx/compose/ui/Modifier$Companion;Landroidx/compose/runtime/Composer;I)V

    .line 688
    .line 689
    .line 690
    int-to-float v10, v2

    .line 691
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 692
    .line 693
    .line 694
    move-result v10

    .line 695
    invoke-static {v0, v10}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 696
    .line 697
    .line 698
    move-result-object v10

    .line 699
    invoke-static/range {v41 .. v41}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 700
    .line 701
    .line 702
    move-result v11

    .line 703
    invoke-static {v10, v11}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 704
    .line 705
    .line 706
    move-result-object v16

    .line 707
    const-wide v10, 0xffe0e2e5L

    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    invoke-static {v10, v11}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 713
    .line 714
    .line 715
    move-result-wide v17

    .line 716
    const/16 v20, 0x2

    .line 717
    .line 718
    const/16 v21, 0x0

    .line 719
    .line 720
    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 721
    .line 722
    .line 723
    move-result-object v10

    .line 724
    invoke-static {v10, v15, v8}, Landroidx/compose/foundation/layout/BoxKt;->Box(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 725
    .line 726
    .line 727
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 728
    .line 729
    .line 730
    move-result v9

    .line 731
    invoke-static {v0, v9}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 732
    .line 733
    .line 734
    move-result-object v9

    .line 735
    invoke-static {v9, v15, v8}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 736
    .line 737
    .line 738
    move v9, v8

    .line 739
    iget-object v8, v1, Lp4/b;->g:Ljava/lang/String;

    .line 740
    .line 741
    const-wide v10, 0xff666666L

    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    invoke-static {v10, v11}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 747
    .line 748
    .line 749
    move-result-wide v10

    .line 750
    invoke-static/range {v34 .. v34}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 751
    .line 752
    .line 753
    move-result-wide v12

    .line 754
    sget-object v14, Landroidx/compose/ui/text/style/TextOverflow;->Companion:Landroidx/compose/ui/text/style/TextOverflow$Companion;

    .line 755
    .line 756
    invoke-virtual {v14}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getEllipsis-gIe3tQ8()I

    .line 757
    .line 758
    .line 759
    move-result v23

    .line 760
    const/16 v31, 0xc30

    .line 761
    .line 762
    const v32, 0x1d7f2

    .line 763
    .line 764
    .line 765
    move v14, v9

    .line 766
    const/4 v9, 0x0

    .line 767
    move/from16 v16, v14

    .line 768
    .line 769
    const/4 v14, 0x0

    .line 770
    const/4 v15, 0x0

    .line 771
    move/from16 v17, v16

    .line 772
    .line 773
    const/16 v16, 0x0

    .line 774
    .line 775
    move/from16 v19, v17

    .line 776
    .line 777
    const-wide/16 v17, 0x0

    .line 778
    .line 779
    move/from16 v20, v19

    .line 780
    .line 781
    const/16 v19, 0x0

    .line 782
    .line 783
    move/from16 v21, v20

    .line 784
    .line 785
    const/16 v20, 0x0

    .line 786
    .line 787
    move/from16 v24, v21

    .line 788
    .line 789
    const-wide/16 v21, 0x0

    .line 790
    .line 791
    move/from16 v25, v24

    .line 792
    .line 793
    const/16 v24, 0x0

    .line 794
    .line 795
    move/from16 v26, v25

    .line 796
    .line 797
    const/16 v25, 0x1

    .line 798
    .line 799
    move/from16 v27, v26

    .line 800
    .line 801
    const/16 v26, 0x0

    .line 802
    .line 803
    move/from16 v28, v27

    .line 804
    .line 805
    const/16 v27, 0x0

    .line 806
    .line 807
    move/from16 v30, v28

    .line 808
    .line 809
    const/16 v28, 0x0

    .line 810
    .line 811
    move/from16 v34, v30

    .line 812
    .line 813
    const/16 v30, 0xd80

    .line 814
    .line 815
    invoke-static/range {v8 .. v32}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 816
    .line 817
    .line 818
    move-object/from16 v15, v29

    .line 819
    .line 820
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 821
    .line 822
    .line 823
    iget-object v8, v1, Lp4/b;->p:Ljava/util/List;

    .line 824
    .line 825
    invoke-static/range {v43 .. v43}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 826
    .line 827
    .line 828
    move-result v18

    .line 829
    const/16 v21, 0xd

    .line 830
    .line 831
    const/16 v22, 0x0

    .line 832
    .line 833
    const/16 v17, 0x0

    .line 834
    .line 835
    const/16 v19, 0x0

    .line 836
    .line 837
    const/16 v20, 0x0

    .line 838
    .line 839
    move-object/from16 v16, v0

    .line 840
    .line 841
    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 842
    .line 843
    .line 844
    move-result-object v0

    .line 845
    move-object/from16 v9, v16

    .line 846
    .line 847
    const/16 v10, 0x30

    .line 848
    .line 849
    invoke-static {v8, v0, v15, v10}, Ly4/e;->b(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 850
    .line 851
    .line 852
    const/4 v0, 0x0

    .line 853
    const/4 v8, 0x0

    .line 854
    invoke-static {v9, v8, v2, v0}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 855
    .line 856
    .line 857
    move-result-object v16

    .line 858
    invoke-static/range {v43 .. v43}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 859
    .line 860
    .line 861
    move-result v18

    .line 862
    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 863
    .line 864
    .line 865
    move-result-object v8

    .line 866
    invoke-virtual/range {v33 .. v33}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 867
    .line 868
    .line 869
    move-result-object v11

    .line 870
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 871
    .line 872
    .line 873
    move-result-object v12

    .line 874
    invoke-static {v12, v11, v15, v10}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 875
    .line 876
    .line 877
    move-result-object v10

    .line 878
    const/4 v11, 0x0

    .line 879
    invoke-static {v15, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 880
    .line 881
    .line 882
    move-result v12

    .line 883
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 884
    .line 885
    .line 886
    move-result-object v13

    .line 887
    invoke-static {v15, v8}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 888
    .line 889
    .line 890
    move-result-object v8

    .line 891
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 892
    .line 893
    .line 894
    move-result-object v14

    .line 895
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 896
    .line 897
    .line 898
    move-result-object v16

    .line 899
    if-nez v16, :cond_1d

    .line 900
    .line 901
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 902
    .line 903
    .line 904
    :cond_1d
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 905
    .line 906
    .line 907
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 908
    .line 909
    .line 910
    move-result v16

    .line 911
    if-eqz v16, :cond_1e

    .line 912
    .line 913
    invoke-interface {v15, v14}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 914
    .line 915
    .line 916
    goto :goto_11

    .line 917
    :cond_1e
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 918
    .line 919
    .line 920
    :goto_11
    invoke-static {v15}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 921
    .line 922
    .line 923
    move-result-object v14

    .line 924
    invoke-static {v6, v14, v10, v14, v13}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 925
    .line 926
    .line 927
    move-result-object v10

    .line 928
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 929
    .line 930
    .line 931
    move-result v13

    .line 932
    if-nez v13, :cond_1f

    .line 933
    .line 934
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 935
    .line 936
    .line 937
    move-result-object v13

    .line 938
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 939
    .line 940
    .line 941
    move-result-object v11

    .line 942
    invoke-static {v13, v11}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 943
    .line 944
    .line 945
    move-result v11

    .line 946
    if-nez v11, :cond_20

    .line 947
    .line 948
    :cond_1f
    invoke-static {v12, v14, v12, v10}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 949
    .line 950
    .line 951
    :cond_20
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 952
    .line 953
    .line 954
    move-result-object v6

    .line 955
    invoke-static {v14, v8, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 956
    .line 957
    .line 958
    iget v6, v1, Lp4/b;->q:I

    .line 959
    .line 960
    const-string v8, "\u2713 "

    .line 961
    .line 962
    invoke-static {v6, v8}, Landroid/support/v4/media/f;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 963
    .line 964
    .line 965
    move-result-object v8

    .line 966
    const-wide v10, 0xff2fcb9aL

    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    invoke-static {v10, v11}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 972
    .line 973
    .line 974
    move-result-wide v10

    .line 975
    invoke-static/range {v42 .. v42}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 976
    .line 977
    .line 978
    move-result-wide v12

    .line 979
    move-object/from16 v29, v15

    .line 980
    .line 981
    invoke-virtual/range {v37 .. v37}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    .line 982
    .line 983
    .line 984
    move-result-object v15

    .line 985
    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    .line 986
    .line 987
    double-to-float v0, v0

    .line 988
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 989
    .line 990
    .line 991
    move-result v1

    .line 992
    const/4 v6, 0x0

    .line 993
    const/4 v14, 0x0

    .line 994
    invoke-static {v9, v14, v1, v2, v6}, Landroidx/compose/foundation/layout/OffsetKt;->offset-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 995
    .line 996
    .line 997
    move-result-object v1

    .line 998
    const/high16 v31, 0x180000

    .line 999
    .line 1000
    const v32, 0xffd0

    .line 1001
    .line 1002
    .line 1003
    const/4 v14, 0x0

    .line 1004
    const/16 v16, 0x0

    .line 1005
    .line 1006
    const-wide/16 v17, 0x0

    .line 1007
    .line 1008
    const/16 v19, 0x0

    .line 1009
    .line 1010
    const/16 v20, 0x0

    .line 1011
    .line 1012
    const-wide/16 v21, 0x0

    .line 1013
    .line 1014
    const/16 v23, 0x0

    .line 1015
    .line 1016
    const/16 v24, 0x0

    .line 1017
    .line 1018
    const/16 v25, 0x0

    .line 1019
    .line 1020
    const/16 v26, 0x0

    .line 1021
    .line 1022
    const/16 v27, 0x0

    .line 1023
    .line 1024
    sget-object v28, Lcom/zykj/mistake/feature/collection/component/o;->c:Landroidx/compose/ui/text/TextStyle;

    .line 1025
    .line 1026
    const v30, 0x30db0

    .line 1027
    .line 1028
    .line 1029
    move-object v6, v9

    .line 1030
    move-object v9, v1

    .line 1031
    move-object v1, v6

    .line 1032
    const/4 v6, 0x0

    .line 1033
    invoke-static/range {v8 .. v32}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 1034
    .line 1035
    .line 1036
    move-object/from16 v15, v29

    .line 1037
    .line 1038
    const/16 v8, 0xe

    .line 1039
    .line 1040
    int-to-float v8, v8

    .line 1041
    const/4 v9, 0x6

    .line 1042
    invoke-static {v8, v1, v15, v9}, Landroidx/compose/material3/c;->s(FLandroidx/compose/ui/Modifier$Companion;Landroidx/compose/runtime/Composer;I)V

    .line 1043
    .line 1044
    .line 1045
    move-object/from16 v8, p0

    .line 1046
    .line 1047
    iget v9, v8, Lp4/b;->r:I

    .line 1048
    .line 1049
    const-string v10, "\u00d7 "

    .line 1050
    .line 1051
    invoke-static {v9, v10}, Landroid/support/v4/media/f;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v9

    .line 1055
    const-wide v10, 0xffff5e5eL

    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    invoke-static {v10, v11}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 1061
    .line 1062
    .line 1063
    move-result-wide v10

    .line 1064
    invoke-static/range {v42 .. v42}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 1065
    .line 1066
    .line 1067
    move-result-wide v12

    .line 1068
    invoke-virtual/range {v37 .. v37}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v14

    .line 1072
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 1073
    .line 1074
    .line 1075
    move-result v0

    .line 1076
    const/4 v3, 0x0

    .line 1077
    const/4 v6, 0x0

    .line 1078
    invoke-static {v1, v3, v0, v2, v6}, Landroidx/compose/foundation/layout/OffsetKt;->offset-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v0

    .line 1082
    move-object v15, v14

    .line 1083
    const/4 v14, 0x0

    .line 1084
    move-object/from16 v44, v9

    .line 1085
    .line 1086
    move-object v9, v0

    .line 1087
    move-object v0, v8

    .line 1088
    move-object/from16 v8, v44

    .line 1089
    .line 1090
    invoke-static/range {v8 .. v32}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 1091
    .line 1092
    .line 1093
    move-object/from16 v15, v29

    .line 1094
    .line 1095
    const/16 v20, 0x2

    .line 1096
    .line 1097
    const/16 v21, 0x0

    .line 1098
    .line 1099
    const/high16 v18, 0x3f800000    # 1.0f

    .line 1100
    .line 1101
    const/16 v19, 0x0

    .line 1102
    .line 1103
    move-object/from16 v17, v1

    .line 1104
    .line 1105
    move-object/from16 v16, v36

    .line 1106
    .line 1107
    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/RowScope;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1108
    .line 1109
    .line 1110
    move-result-object v1

    .line 1111
    move-object/from16 v2, v17

    .line 1112
    .line 1113
    const/4 v13, 0x0

    .line 1114
    invoke-static {v1, v15, v13}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 1115
    .line 1116
    .line 1117
    if-nez p1, :cond_21

    .line 1118
    .line 1119
    const v1, -0x9bbd24b

    .line 1120
    .line 1121
    .line 1122
    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1123
    .line 1124
    .line 1125
    iget-object v8, v0, Lp4/b;->s:Ljava/lang/String;

    .line 1126
    .line 1127
    const-wide v9, 0xffb5b5b5L

    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    invoke-static {v9, v10}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 1133
    .line 1134
    .line 1135
    move-result-wide v10

    .line 1136
    invoke-static/range {v42 .. v42}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 1137
    .line 1138
    .line 1139
    move-result-wide v12

    .line 1140
    const/16 v31, 0x0

    .line 1141
    .line 1142
    const v32, 0x1fff2

    .line 1143
    .line 1144
    .line 1145
    const/4 v9, 0x0

    .line 1146
    const/4 v14, 0x0

    .line 1147
    move-object/from16 v29, v15

    .line 1148
    .line 1149
    const/4 v15, 0x0

    .line 1150
    const/16 v16, 0x0

    .line 1151
    .line 1152
    const-wide/16 v17, 0x0

    .line 1153
    .line 1154
    const/16 v19, 0x0

    .line 1155
    .line 1156
    const/16 v20, 0x0

    .line 1157
    .line 1158
    const-wide/16 v21, 0x0

    .line 1159
    .line 1160
    const/16 v23, 0x0

    .line 1161
    .line 1162
    const/16 v24, 0x0

    .line 1163
    .line 1164
    const/16 v25, 0x0

    .line 1165
    .line 1166
    const/16 v26, 0x0

    .line 1167
    .line 1168
    const/16 v27, 0x0

    .line 1169
    .line 1170
    const/16 v28, 0x0

    .line 1171
    .line 1172
    const/16 v30, 0xd80

    .line 1173
    .line 1174
    invoke-static/range {v8 .. v32}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 1175
    .line 1176
    .line 1177
    move-object/from16 v15, v29

    .line 1178
    .line 1179
    :goto_12
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1180
    .line 1181
    .line 1182
    goto :goto_13

    .line 1183
    :cond_21
    const v1, -0xa3e521f

    .line 1184
    .line 1185
    .line 1186
    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1187
    .line 1188
    .line 1189
    goto :goto_12

    .line 1190
    :goto_13
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1191
    .line 1192
    .line 1193
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1194
    .line 1195
    .line 1196
    if-eqz p1, :cond_24

    .line 1197
    .line 1198
    const v1, 0x35d81c7e

    .line 1199
    .line 1200
    .line 1201
    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1202
    .line 1203
    .line 1204
    if-eqz p2, :cond_22

    .line 1205
    .line 1206
    sget v1, Lcom/zykj/mistake/R$drawable;->ic_mistake_selected:I

    .line 1207
    .line 1208
    :goto_14
    const/4 v13, 0x0

    .line 1209
    goto :goto_15

    .line 1210
    :cond_22
    sget v1, Lcom/zykj/mistake/R$drawable;->ic_mistake_unselected:I

    .line 1211
    .line 1212
    goto :goto_14

    .line 1213
    :goto_15
    invoke-static {v1, v15, v13}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v8

    .line 1217
    if-eqz p2, :cond_23

    .line 1218
    .line 1219
    const-string v1, "\u5df2\u9009\u62e9"

    .line 1220
    .line 1221
    :goto_16
    move-object v9, v1

    .line 1222
    goto :goto_17

    .line 1223
    :cond_23
    const-string v1, "\u672a\u9009\u62e9"

    .line 1224
    .line 1225
    goto :goto_16

    .line 1226
    :goto_17
    invoke-virtual/range {v33 .. v33}, Landroidx/compose/ui/Alignment$Companion;->getBottomEnd()Landroidx/compose/ui/Alignment;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v1

    .line 1230
    invoke-interface {v5, v2, v1}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    .line 1231
    .line 1232
    .line 1233
    move-result-object v1

    .line 1234
    const/16 v2, 0x12

    .line 1235
    .line 1236
    int-to-float v2, v2

    .line 1237
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 1238
    .line 1239
    .line 1240
    move-result v2

    .line 1241
    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v10

    .line 1245
    const/16 v16, 0x0

    .line 1246
    .line 1247
    const/16 v17, 0x78

    .line 1248
    .line 1249
    const/4 v11, 0x0

    .line 1250
    const/4 v12, 0x0

    .line 1251
    const/4 v13, 0x0

    .line 1252
    const/4 v14, 0x0

    .line 1253
    invoke-static/range {v8 .. v17}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 1254
    .line 1255
    .line 1256
    :goto_18
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1257
    .line 1258
    .line 1259
    goto :goto_19

    .line 1260
    :cond_24
    const v1, 0x35519112

    .line 1261
    .line 1262
    .line 1263
    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1264
    .line 1265
    .line 1266
    goto :goto_18

    .line 1267
    :goto_19
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1268
    .line 1269
    .line 1270
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 1271
    .line 1272
    .line 1273
    move-result v1

    .line 1274
    if-eqz v1, :cond_26

    .line 1275
    .line 1276
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 1277
    .line 1278
    .line 1279
    goto :goto_1a

    .line 1280
    :cond_25
    move-object v0, v1

    .line 1281
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 1282
    .line 1283
    .line 1284
    :cond_26
    :goto_1a
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v8

    .line 1288
    if-eqz v8, :cond_27

    .line 1289
    .line 1290
    new-instance v0, Lcom/zykj/mistake/feature/collection/component/l;

    .line 1291
    .line 1292
    move-object/from16 v1, p0

    .line 1293
    .line 1294
    move/from16 v2, p1

    .line 1295
    .line 1296
    move/from16 v3, p2

    .line 1297
    .line 1298
    move-object/from16 v5, p4

    .line 1299
    .line 1300
    move-object/from16 v6, p5

    .line 1301
    .line 1302
    invoke-direct/range {v0 .. v7}, Lcom/zykj/mistake/feature/collection/component/l;-><init>(Lp4/b;ZZZLr6/a;Lr6/a;I)V

    .line 1303
    .line 1304
    .line 1305
    invoke-interface {v8, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 1306
    .line 1307
    .line 1308
    :cond_27
    return-void
.end method

.method public static final b(Ljava/util/List;ZZZLandroidx/compose/ui/Modifier;ZLjava/util/Set;Ljava/util/Set;Landroidx/compose/foundation/layout/PaddingValues;Lr6/a;Lr6/a;Lr6/c;Lr6/c;Landroidx/compose/runtime/Composer;III)V
    .locals 28

    move-object/from16 v1, p0

    move-object/from16 v11, p4

    move-object/from16 v12, p9

    move-object/from16 v6, p10

    move-object/from16 v8, p11

    move/from16 v14, p14

    move/from16 v15, p15

    move/from16 v13, p16

    const-string v0, "items"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onRefresh"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onLoadMore"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onItemClick"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x7a518e2

    move-object/from16 v2, p13

    .line 1
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v9

    and-int/lit8 v2, v14, 0x6

    if-nez v2, :cond_1

    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v14

    goto :goto_1

    :cond_1
    move v2, v14

    :goto_1
    and-int/lit8 v5, v14, 0x30

    if-nez v5, :cond_3

    move/from16 v5, p1

    invoke-interface {v9, v5}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v16

    if-eqz v16, :cond_2

    const/16 v16, 0x20

    goto :goto_2

    :cond_2
    const/16 v16, 0x10

    :goto_2
    or-int v2, v2, v16

    goto :goto_3

    :cond_3
    move/from16 v5, p1

    :goto_3
    and-int/lit16 v3, v14, 0x180

    const/16 v16, 0x80

    if-nez v3, :cond_5

    move/from16 v3, p2

    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v18

    if-eqz v18, :cond_4

    const/16 v18, 0x100

    goto :goto_4

    :cond_4
    move/from16 v18, v16

    :goto_4
    or-int v2, v2, v18

    goto :goto_5

    :cond_5
    move/from16 v3, p2

    :goto_5
    and-int/lit16 v4, v14, 0xc00

    if-nez v4, :cond_7

    move/from16 v4, p3

    invoke-interface {v9, v4}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v20

    if-eqz v20, :cond_6

    const/16 v20, 0x800

    goto :goto_6

    :cond_6
    const/16 v20, 0x400

    :goto_6
    or-int v2, v2, v20

    goto :goto_7

    :cond_7
    move/from16 v4, p3

    :goto_7
    and-int/lit16 v10, v14, 0x6000

    if-nez v10, :cond_9

    invoke-interface {v9, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x4000

    goto :goto_8

    :cond_8
    const/16 v10, 0x2000

    :goto_8
    or-int/2addr v2, v10

    :cond_9
    const/high16 v10, 0x30000

    and-int/2addr v10, v14

    if-nez v10, :cond_b

    move/from16 v10, p5

    invoke-interface {v9, v10}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v21

    if-eqz v21, :cond_a

    const/high16 v21, 0x20000

    goto :goto_9

    :cond_a
    const/high16 v21, 0x10000

    :goto_9
    or-int v2, v2, v21

    goto :goto_a

    :cond_b
    move/from16 v10, p5

    :goto_a
    const/high16 v21, 0x180000

    and-int v22, v14, v21

    move-object/from16 v0, p6

    if-nez v22, :cond_d

    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_c

    const/high16 v23, 0x100000

    goto :goto_b

    :cond_c
    const/high16 v23, 0x80000

    :goto_b
    or-int v2, v2, v23

    :cond_d
    and-int/lit16 v7, v13, 0x80

    const/high16 v24, 0xc00000

    if-eqz v7, :cond_e

    or-int v2, v2, v24

    move-object/from16 v0, p7

    goto :goto_d

    :cond_e
    and-int v24, v14, v24

    move-object/from16 v0, p7

    if-nez v24, :cond_10

    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_f

    const/high16 v24, 0x800000

    goto :goto_c

    :cond_f
    const/high16 v24, 0x400000

    :goto_c
    or-int v2, v2, v24

    :cond_10
    :goto_d
    and-int/lit16 v0, v13, 0x100

    const/high16 v24, 0x6000000

    if-eqz v0, :cond_12

    or-int v2, v2, v24

    :cond_11
    move/from16 v24, v0

    move-object/from16 v0, p8

    goto :goto_f

    :cond_12
    and-int v24, v14, v24

    if-nez v24, :cond_11

    move/from16 v24, v0

    move-object/from16 v0, p8

    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_13

    const/high16 v25, 0x4000000

    goto :goto_e

    :cond_13
    const/high16 v25, 0x2000000

    :goto_e
    or-int v2, v2, v25

    :goto_f
    const/high16 v25, 0x30000000

    and-int v25, v14, v25

    if-nez v25, :cond_15

    invoke-interface {v9, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_14

    const/high16 v25, 0x20000000

    goto :goto_10

    :cond_14
    const/high16 v25, 0x10000000

    :goto_10
    or-int v2, v2, v25

    :cond_15
    and-int/lit8 v25, v15, 0x6

    if-nez v25, :cond_17

    invoke-interface {v9, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_16

    const/16 v25, 0x4

    goto :goto_11

    :cond_16
    const/16 v25, 0x2

    :goto_11
    or-int v25, v15, v25

    goto :goto_12

    :cond_17
    move/from16 v25, v15

    :goto_12
    and-int/lit8 v26, v15, 0x30

    if-nez v26, :cond_19

    invoke-interface {v9, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_18

    const/16 v26, 0x20

    goto :goto_13

    :cond_18
    const/16 v26, 0x10

    :goto_13
    or-int v25, v25, v26

    :cond_19
    move/from16 v0, v25

    and-int/lit16 v3, v13, 0x1000

    if-eqz v3, :cond_1a

    or-int/lit16 v0, v0, 0x180

    goto :goto_14

    :cond_1a
    move/from16 v25, v0

    and-int/lit16 v0, v15, 0x180

    if-nez v0, :cond_1c

    move-object/from16 v0, p12

    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_1b

    const/16 v16, 0x100

    :cond_1b
    or-int v16, v25, v16

    move/from16 v0, v16

    goto :goto_14

    :cond_1c
    move-object/from16 v0, p12

    move/from16 v0, v25

    :goto_14
    const v16, 0x12492493

    move/from16 v25, v3

    and-int v3, v2, v16

    const v4, 0x12492492

    move/from16 v16, v7

    const/4 v7, 0x0

    if-ne v3, v4, :cond_1e

    and-int/lit16 v3, v0, 0x93

    const/16 v4, 0x92

    if-eq v3, v4, :cond_1d

    goto :goto_15

    :cond_1d
    move v3, v7

    goto :goto_16

    :cond_1e
    :goto_15
    const/4 v3, 0x1

    :goto_16
    and-int/lit8 v4, v2, 0x1

    invoke-interface {v9, v3, v4}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v3

    if-eqz v3, :cond_2c

    if-eqz v16, :cond_1f

    .line 2
    sget-object v3, Lkotlin/collections/EmptySet;->INSTANCE:Lkotlin/collections/EmptySet;

    move-object/from16 v16, v3

    goto :goto_17

    :cond_1f
    move-object/from16 v16, p7

    :goto_17
    if-eqz v24, :cond_20

    const/16 v3, 0x10

    int-to-float v3, v3

    .line 3
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v3

    .line 4
    invoke-static {v3}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-0680j_4(F)Landroidx/compose/foundation/layout/PaddingValues;

    move-result-object v3

    move-object/from16 v23, v3

    goto :goto_18

    :cond_20
    move-object/from16 v23, p8

    :goto_18
    if-eqz v25, :cond_21

    const/4 v8, 0x0

    goto :goto_19

    :cond_21
    move-object/from16 v8, p12

    .line 5
    :goto_19
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v4

    if-eqz v4, :cond_22

    const-string v4, "com.zykj.mistake.feature.collection.component.MistakeQuestionGrid (MistakeQuestionGrid.kt:77)"

    const v3, -0x7a518e2

    invoke-static {v3, v2, v0, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_22
    const/4 v3, 0x3

    .line 6
    invoke-static {v7, v7, v9, v7, v3}, Landroidx/compose/foundation/lazy/grid/LazyGridStateKt;->rememberLazyGridState(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/grid/LazyGridState;

    move-result-object v3

    .line 7
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v22

    invoke-interface {v9, v4}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v4

    or-int v4, v22, v4

    .line 8
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    if-nez v4, :cond_23

    .line 9
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v7, v4, :cond_24

    .line 10
    :cond_23
    new-instance v4, Landroidx/navigation/e;

    const/4 v7, 0x4

    invoke-direct {v4, v7, v3, v1}, Landroidx/navigation/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4}, Landroidx/compose/runtime/SnapshotStateKt;->derivedStateOf(Lr6/a;)Landroidx/compose/runtime/State;

    move-result-object v7

    .line 11
    invoke-interface {v9, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 12
    :cond_24
    check-cast v7, Landroidx/compose/runtime/State;

    .line 13
    invoke-interface {v7}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v4

    move/from16 v24, v0

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    move-object/from16 p8, v3

    invoke-static/range {p2 .. p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static/range {p3 .. p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v25

    invoke-static/range {v25 .. v25}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    filled-new-array {v4, v0, v3, v5, v6}, [Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v9, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    and-int/lit8 v4, v2, 0x70

    const/16 v5, 0x20

    if-ne v4, v5, :cond_25

    const/4 v4, 0x1

    goto :goto_1a

    :cond_25
    const/4 v4, 0x0

    :goto_1a
    or-int/2addr v3, v4

    and-int/lit16 v4, v2, 0x380

    const/16 v5, 0x100

    if-ne v4, v5, :cond_26

    const/4 v4, 0x1

    goto :goto_1b

    :cond_26
    const/4 v4, 0x0

    :goto_1b
    or-int/2addr v3, v4

    and-int/lit16 v4, v2, 0x1c00

    const/16 v5, 0x800

    if-ne v4, v5, :cond_27

    const/4 v4, 0x1

    goto :goto_1c

    :cond_27
    const/4 v4, 0x0

    :goto_1c
    or-int/2addr v3, v4

    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    and-int/lit8 v4, v24, 0xe

    const/4 v5, 0x4

    if-ne v4, v5, :cond_28

    const/4 v4, 0x1

    goto :goto_1d

    :cond_28
    const/4 v4, 0x0

    :goto_1d
    or-int/2addr v3, v4

    .line 14
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_29

    .line 15
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_2a

    :cond_29
    move-object v3, v0

    goto :goto_1e

    :cond_2a
    move-object/from16 v18, p8

    move/from16 v17, v2

    move-object/from16 p7, v8

    const/4 v10, 0x0

    const/4 v12, 0x1

    move-object v8, v0

    goto :goto_1f

    .line 16
    :goto_1e
    new-instance v0, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$1$1;

    move-object v1, v7

    const/4 v7, 0x0

    move-object/from16 v5, p0

    move/from16 v4, p3

    move-object/from16 v18, p8

    move-object/from16 v6, p10

    move/from16 v17, v2

    move-object/from16 p7, v8

    const/4 v10, 0x0

    const/4 v12, 0x1

    move/from16 v2, p1

    move-object v8, v3

    move/from16 v3, p2

    invoke-direct/range {v0 .. v7}, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$1$1;-><init>(Landroidx/compose/runtime/State;ZZZLjava/util/List;Lr6/a;Lh6/c;)V

    .line 17
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    move-object v4, v0

    .line 18
    :goto_1f
    check-cast v4, Lr6/e;

    invoke-static {v8, v4, v9, v10}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect([Ljava/lang/Object;Lr6/e;Landroidx/compose/runtime/Composer;I)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 19
    invoke-static {v11, v0, v12, v1}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v19

    .line 20
    new-instance v0, Lcom/zykj/mistake/feature/collection/component/g;

    move-object/from16 v3, p0

    move/from16 v10, p3

    move/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v8, p7

    move-object/from16 v7, p11

    move-object v11, v9

    move-object/from16 v4, v16

    move-object/from16 v1, v18

    move-object/from16 v2, v23

    move/from16 v9, p2

    invoke-direct/range {v0 .. v10}, Lcom/zykj/mistake/feature/collection/component/g;-><init>(Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;Ljava/util/List;Ljava/util/Set;ZLjava/util/Set;Lr6/c;Lr6/c;ZZ)V

    move-object/from16 v16, v2

    move-object v10, v4

    move-object/from16 v18, v8

    const/16 v1, 0x36

    const v2, 0x4caa1c04    # 8.918634E7f

    invoke-static {v2, v12, v0, v11, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v6

    shr-int/lit8 v0, v17, 0x3

    and-int/lit8 v0, v0, 0xe

    or-int v0, v0, v21

    shr-int/lit8 v1, v17, 0x18

    and-int/lit8 v1, v1, 0x70

    or-int v8, v0, v1

    const/16 v9, 0x38

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move/from16 v0, p1

    move-object/from16 v1, p9

    move-object v7, v11

    move-object/from16 v2, v19

    .line 21
    invoke-static/range {v0 .. v9}, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt;->PullToRefreshBox(ZLr6/a;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/pulltorefresh/PullToRefreshState;Landroidx/compose/ui/Alignment;Lr6/f;Lr6/f;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2b

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_2b
    move-object v8, v10

    move-object/from16 v9, v16

    move-object/from16 v13, v18

    goto :goto_20

    :cond_2c
    move-object v7, v9

    .line 22
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v13, p12

    .line 23
    :goto_20
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_2d

    move-object v1, v0

    new-instance v0, Lcom/zykj/mistake/feature/collection/component/h;

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move/from16 v16, p16

    move-object/from16 v27, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v16}, Lcom/zykj/mistake/feature/collection/component/h;-><init>(Ljava/util/List;ZZZLandroidx/compose/ui/Modifier;ZLjava/util/Set;Ljava/util/Set;Landroidx/compose/foundation/layout/PaddingValues;Lr6/a;Lr6/a;Lr6/c;Lr6/c;III)V

    move-object/from16 v1, v27

    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    :cond_2d
    return-void
.end method

.method public static final c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    const v2, -0x320d8abb

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
    const/4 v6, 0x1

    .line 34
    const/4 v7, 0x0

    .line 35
    if-eq v5, v4, :cond_2

    .line 36
    .line 37
    move v4, v6

    .line 38
    goto :goto_2

    .line 39
    :cond_2
    move v4, v7

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
    if-eqz v4, :cond_f

    .line 47
    .line 48
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-eqz v4, :cond_3

    .line 53
    .line 54
    const/4 v4, -0x1

    .line 55
    const-string v5, "com.zykj.mistake.feature.collection.component.MistakeQuestionStemContent (MistakeQuestionGrid.kt:248)"

    .line 56
    .line 57
    invoke-static {v2, v3, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 58
    .line 59
    .line 60
    :cond_3
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 61
    .line 62
    const/4 v4, 0x0

    .line 63
    const/4 v5, 0x0

    .line 64
    invoke-static {v2, v4, v6, v5}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    sget v9, Lcom/zykj/mistake/feature/collection/component/o;->a:F

    .line 69
    .line 70
    invoke-static {v8, v9}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    sget-object v9, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 75
    .line 76
    invoke-virtual {v9}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 77
    .line 78
    .line 79
    move-result-wide v11

    .line 80
    const/4 v9, 0x3

    .line 81
    int-to-float v9, v9

    .line 82
    invoke-static {v9, v8, v11, v12}, Landroidx/compose/material3/c;->f(FLandroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    .line 83
    .line 84
    .line 85
    move-result-object v8

    .line 86
    sget-object v13, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 87
    .line 88
    invoke-virtual {v13}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 89
    .line 90
    .line 91
    move-result-object v9

    .line 92
    invoke-static {v9, v7}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    invoke-static {v10, v7}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 97
    .line 98
    .line 99
    move-result v11

    .line 100
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 101
    .line 102
    .line 103
    move-result-object v12

    .line 104
    invoke-static {v10, v8}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    sget-object v14, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 109
    .line 110
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 111
    .line 112
    .line 113
    move-result-object v15

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
    invoke-interface {v10, v15}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

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
    move-result-object v15

    .line 143
    invoke-static {v14, v15, v9, v15, v12}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 144
    .line 145
    .line 146
    move-result-object v9

    .line 147
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 148
    .line 149
    .line 150
    move-result v12

    .line 151
    if-nez v12, :cond_6

    .line 152
    .line 153
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v12

    .line 157
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 158
    .line 159
    .line 160
    move-result-object v7

    .line 161
    invoke-static {v12, v7}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v7

    .line 165
    if-nez v7, :cond_7

    .line 166
    .line 167
    :cond_6
    invoke-static {v11, v15, v11, v9}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 168
    .line 169
    .line 170
    :cond_7
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 171
    .line 172
    .line 173
    move-result-object v7

    .line 174
    invoke-static {v15, v8, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 175
    .line 176
    .line 177
    sget-object v7, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 178
    .line 179
    invoke-static {v0}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 180
    .line 181
    .line 182
    move-result v7

    .line 183
    if-eqz v7, :cond_8

    .line 184
    .line 185
    const v2, 0x43b11ded

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
    const/4 v2, 0x0

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
    goto/16 :goto_9

    .line 249
    .line 250
    :cond_8
    const/4 v15, 0x0

    .line 251
    const v7, 0x43b3f727

    .line 252
    .line 253
    .line 254
    invoke-interface {v10, v7}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

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
    iget-object v7, v3, Lcoil3/compose/AsyncImagePainter;->p:Lkotlinx/coroutines/flow/a0;

    .line 264
    .line 265
    invoke-static {v7, v5, v10, v15, v6}, Landroidx/compose/runtime/SnapshotStateKt;->collectAsState(Lkotlinx/coroutines/flow/m0;Lh6/h;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    .line 266
    .line 267
    .line 268
    move-result-object v7

    .line 269
    invoke-interface {v7}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v7

    .line 273
    check-cast v7, Lcoil3/compose/i;

    .line 274
    .line 275
    instance-of v7, v7, Lcoil3/compose/f;

    .line 276
    .line 277
    const v8, 0x431dfe23

    .line 278
    .line 279
    .line 280
    if-nez v7, :cond_9

    .line 281
    .line 282
    const v9, 0x43b73b2f

    .line 283
    .line 284
    .line 285
    invoke-interface {v10, v9}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v13}, Landroidx/compose/ui/Alignment$Companion;->getTopCenter()Landroidx/compose/ui/Alignment;

    .line 289
    .line 290
    .line 291
    move-result-object v9

    .line 292
    sget-object v11, Landroidx/compose/ui/layout/ContentScale;->Companion:Landroidx/compose/ui/layout/ContentScale$Companion;

    .line 293
    .line 294
    invoke-virtual {v11}, Landroidx/compose/ui/layout/ContentScale$Companion;->getFillWidth()Landroidx/compose/ui/layout/ContentScale;

    .line 295
    .line 296
    .line 297
    move-result-object v11

    .line 298
    invoke-static {v2, v4, v6, v5}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 299
    .line 300
    .line 301
    move-result-object v5

    .line 302
    move v4, v7

    .line 303
    move-object v7, v11

    .line 304
    const/16 v11, 0x6db0

    .line 305
    .line 306
    const/16 v12, 0x60

    .line 307
    .line 308
    move v6, v4

    .line 309
    const/4 v4, 0x0

    .line 310
    move/from16 v16, v8

    .line 311
    .line 312
    const/4 v8, 0x0

    .line 313
    move/from16 v17, v6

    .line 314
    .line 315
    move-object v6, v9

    .line 316
    const/4 v9, 0x0

    .line 317
    move/from16 v15, v16

    .line 318
    .line 319
    invoke-static/range {v3 .. v12}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 320
    .line 321
    .line 322
    :goto_4
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 323
    .line 324
    .line 325
    goto :goto_5

    .line 326
    :cond_9
    move/from16 v17, v7

    .line 327
    .line 328
    move v15, v8

    .line 329
    invoke-interface {v10, v15}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 330
    .line 331
    .line 332
    goto :goto_4

    .line 333
    :goto_5
    if-eqz v17, :cond_e

    .line 334
    .line 335
    const v3, 0x43bc7af6

    .line 336
    .line 337
    .line 338
    invoke-interface {v10, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v13}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 342
    .line 343
    .line 344
    move-result-object v3

    .line 345
    sget-object v4, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 346
    .line 347
    invoke-virtual {v4}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 348
    .line 349
    .line 350
    move-result-object v4

    .line 351
    const/16 v5, 0x30

    .line 352
    .line 353
    invoke-static {v4, v3, v10, v5}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 354
    .line 355
    .line 356
    move-result-object v3

    .line 357
    const/4 v15, 0x0

    .line 358
    invoke-static {v10, v15}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 359
    .line 360
    .line 361
    move-result v4

    .line 362
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 363
    .line 364
    .line 365
    move-result-object v5

    .line 366
    invoke-static {v10, v2}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 367
    .line 368
    .line 369
    move-result-object v6

    .line 370
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 371
    .line 372
    .line 373
    move-result-object v7

    .line 374
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 375
    .line 376
    .line 377
    move-result-object v8

    .line 378
    if-nez v8, :cond_a

    .line 379
    .line 380
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 381
    .line 382
    .line 383
    :cond_a
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 384
    .line 385
    .line 386
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 387
    .line 388
    .line 389
    move-result v8

    .line 390
    if-eqz v8, :cond_b

    .line 391
    .line 392
    invoke-interface {v10, v7}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 393
    .line 394
    .line 395
    goto :goto_6

    .line 396
    :cond_b
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 397
    .line 398
    .line 399
    :goto_6
    invoke-static {v10}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 400
    .line 401
    .line 402
    move-result-object v7

    .line 403
    invoke-static {v14, v7, v3, v7, v5}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 404
    .line 405
    .line 406
    move-result-object v3

    .line 407
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 408
    .line 409
    .line 410
    move-result v5

    .line 411
    if-nez v5, :cond_c

    .line 412
    .line 413
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v5

    .line 417
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 418
    .line 419
    .line 420
    move-result-object v8

    .line 421
    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    move-result v5

    .line 425
    if-nez v5, :cond_d

    .line 426
    .line 427
    :cond_c
    invoke-static {v4, v7, v4, v3}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 428
    .line 429
    .line 430
    :cond_d
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 431
    .line 432
    .line 433
    move-result-object v3

    .line 434
    invoke-static {v7, v6, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 435
    .line 436
    .line 437
    sget-object v3, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 438
    .line 439
    sget v3, Lcom/zykj/mistake/R$drawable;->ic_answer_load_error:I

    .line 440
    .line 441
    const/4 v15, 0x0

    .line 442
    invoke-static {v3, v10, v15}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 443
    .line 444
    .line 445
    move-result-object v3

    .line 446
    const/16 v4, 0x28

    .line 447
    .line 448
    int-to-float v4, v4

    .line 449
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 450
    .line 451
    .line 452
    move-result v4

    .line 453
    invoke-static {v2, v4}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 454
    .line 455
    .line 456
    move-result-object v5

    .line 457
    const/16 v11, 0x1b0

    .line 458
    .line 459
    const/16 v12, 0x78

    .line 460
    .line 461
    const-string v4, "\u52a0\u8f7d\u5931\u8d25"

    .line 462
    .line 463
    const/4 v6, 0x0

    .line 464
    const/4 v7, 0x0

    .line 465
    const/4 v8, 0x0

    .line 466
    const/4 v9, 0x0

    .line 467
    invoke-static/range {v3 .. v12}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 468
    .line 469
    .line 470
    const/16 v3, 0x8

    .line 471
    .line 472
    int-to-float v3, v3

    .line 473
    const/4 v4, 0x6

    .line 474
    invoke-static {v3, v2, v10, v4}, Landroidx/compose/material3/c;->s(FLandroidx/compose/ui/Modifier$Companion;Landroidx/compose/runtime/Composer;I)V

    .line 475
    .line 476
    .line 477
    const-wide v2, 0xff999999L

    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 483
    .line 484
    .line 485
    move-result-wide v5

    .line 486
    const/16 v2, 0xd

    .line 487
    .line 488
    invoke-static {v2}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 489
    .line 490
    .line 491
    move-result-wide v7

    .line 492
    const/16 v26, 0x0

    .line 493
    .line 494
    const v27, 0x1fff2

    .line 495
    .line 496
    .line 497
    const-string v3, "\u52a0\u8f7d\u5931\u8d25"

    .line 498
    .line 499
    const/4 v4, 0x0

    .line 500
    move-object/from16 v24, v10

    .line 501
    .line 502
    const/4 v10, 0x0

    .line 503
    const/4 v11, 0x0

    .line 504
    const-wide/16 v12, 0x0

    .line 505
    .line 506
    const/4 v14, 0x0

    .line 507
    move v2, v15

    .line 508
    const/4 v15, 0x0

    .line 509
    const-wide/16 v16, 0x0

    .line 510
    .line 511
    const/16 v18, 0x0

    .line 512
    .line 513
    const/16 v19, 0x0

    .line 514
    .line 515
    const/16 v20, 0x0

    .line 516
    .line 517
    const/16 v21, 0x0

    .line 518
    .line 519
    const/16 v22, 0x0

    .line 520
    .line 521
    const/16 v23, 0x0

    .line 522
    .line 523
    const/16 v25, 0xd86

    .line 524
    .line 525
    invoke-static/range {v3 .. v27}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 526
    .line 527
    .line 528
    move-object/from16 v10, v24

    .line 529
    .line 530
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 531
    .line 532
    .line 533
    :goto_7
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 534
    .line 535
    .line 536
    goto :goto_8

    .line 537
    :cond_e
    const/4 v2, 0x0

    .line 538
    invoke-interface {v10, v15}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 539
    .line 540
    .line 541
    goto :goto_7

    .line 542
    :goto_8
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 543
    .line 544
    .line 545
    :goto_9
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 546
    .line 547
    .line 548
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 549
    .line 550
    .line 551
    move-result v3

    .line 552
    if-eqz v3, :cond_10

    .line 553
    .line 554
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 555
    .line 556
    .line 557
    goto :goto_a

    .line 558
    :cond_f
    move v2, v7

    .line 559
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 560
    .line 561
    .line 562
    :cond_10
    :goto_a
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 563
    .line 564
    .line 565
    move-result-object v3

    .line 566
    if-eqz v3, :cond_11

    .line 567
    .line 568
    new-instance v4, Lcom/zykj/mistake/feature/collection/component/m;

    .line 569
    .line 570
    invoke-direct {v4, v0, v1, v2}, Lcom/zykj/mistake/feature/collection/component/m;-><init>(Ljava/lang/String;II)V

    .line 571
    .line 572
    .line 573
    invoke-interface {v3, v4}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 574
    .line 575
    .line 576
    :cond_11
    return-void
.end method
