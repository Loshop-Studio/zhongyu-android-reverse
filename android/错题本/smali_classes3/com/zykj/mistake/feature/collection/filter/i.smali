.class public abstract Lcom/zykj/mistake/feature/collection/filter/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/lang/String;JJLr6/a;Landroidx/compose/runtime/Composer;I)V
    .locals 33

    .line 1
    move-wide/from16 v2, p1

    .line 2
    .line 3
    move/from16 v7, p7

    .line 4
    .line 5
    const v0, 0x60c62ed5

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p6

    .line 9
    .line 10
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    and-int/lit8 v4, v7, 0x6

    .line 15
    .line 16
    const/4 v5, 0x4

    .line 17
    move-object/from16 v8, p0

    .line 18
    .line 19
    if-nez v4, :cond_1

    .line 20
    .line 21
    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    move v4, v5

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v4, 0x2

    .line 30
    :goto_0
    or-int/2addr v4, v7

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v4, v7

    .line 33
    :goto_1
    and-int/lit8 v6, v7, 0x30

    .line 34
    .line 35
    if-nez v6, :cond_3

    .line 36
    .line 37
    invoke-interface {v1, v2, v3}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    if-eqz v6, :cond_2

    .line 42
    .line 43
    const/16 v6, 0x20

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    const/16 v6, 0x10

    .line 47
    .line 48
    :goto_2
    or-int/2addr v4, v6

    .line 49
    :cond_3
    and-int/lit16 v6, v7, 0x180

    .line 50
    .line 51
    move-wide/from16 v10, p3

    .line 52
    .line 53
    if-nez v6, :cond_5

    .line 54
    .line 55
    invoke-interface {v1, v10, v11}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    if-eqz v6, :cond_4

    .line 60
    .line 61
    const/16 v6, 0x100

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_4
    const/16 v6, 0x80

    .line 65
    .line 66
    :goto_3
    or-int/2addr v4, v6

    .line 67
    :cond_5
    and-int/lit16 v6, v7, 0xc00

    .line 68
    .line 69
    if-nez v6, :cond_7

    .line 70
    .line 71
    move-object/from16 v6, p5

    .line 72
    .line 73
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v9

    .line 77
    if-eqz v9, :cond_6

    .line 78
    .line 79
    const/16 v9, 0x800

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_6
    const/16 v9, 0x400

    .line 83
    .line 84
    :goto_4
    or-int/2addr v4, v9

    .line 85
    goto :goto_5

    .line 86
    :cond_7
    move-object/from16 v6, p5

    .line 87
    .line 88
    :goto_5
    and-int/lit16 v9, v4, 0x493

    .line 89
    .line 90
    const/16 v12, 0x492

    .line 91
    .line 92
    const/4 v13, 0x0

    .line 93
    if-eq v9, v12, :cond_8

    .line 94
    .line 95
    const/4 v9, 0x1

    .line 96
    goto :goto_6

    .line 97
    :cond_8
    move v9, v13

    .line 98
    :goto_6
    and-int/lit8 v12, v4, 0x1

    .line 99
    .line 100
    invoke-interface {v1, v9, v12}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 101
    .line 102
    .line 103
    move-result v9

    .line 104
    if-eqz v9, :cond_e

    .line 105
    .line 106
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 107
    .line 108
    .line 109
    move-result v9

    .line 110
    if-eqz v9, :cond_9

    .line 111
    .line 112
    const/4 v9, -0x1

    .line 113
    const-string v12, "com.zykj.mistake.feature.collection.filter.FilterBottomButton (MistakeCollectionFilterPanel.kt:331)"

    .line 114
    .line 115
    invoke-static {v0, v4, v9, v12}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 116
    .line 117
    .line 118
    :cond_9
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 119
    .line 120
    const/16 v9, 0x6e

    .line 121
    .line 122
    int-to-float v9, v9

    .line 123
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 124
    .line 125
    .line 126
    move-result v9

    .line 127
    invoke-static {v0, v9}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    const/16 v9, 0x2c

    .line 132
    .line 133
    int-to-float v9, v9

    .line 134
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 135
    .line 136
    .line 137
    move-result v9

    .line 138
    invoke-static {v0, v9}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    int-to-float v5, v5

    .line 143
    invoke-static {v5, v0, v2, v3}, Landroidx/compose/material3/c;->f(FLandroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    .line 144
    .line 145
    .line 146
    move-result-object v12

    .line 147
    const/16 v17, 0x7

    .line 148
    .line 149
    const/16 v18, 0x0

    .line 150
    .line 151
    move v0, v13

    .line 152
    const/4 v13, 0x0

    .line 153
    const/4 v14, 0x0

    .line 154
    const/4 v15, 0x0

    .line 155
    move-object/from16 v16, v6

    .line 156
    .line 157
    invoke-static/range {v12 .. v18}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    sget-object v6, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 162
    .line 163
    invoke-virtual {v6}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    invoke-static {v6, v0}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    invoke-static {v1, v0}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 176
    .line 177
    .line 178
    move-result-object v9

    .line 179
    invoke-static {v1, v5}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    sget-object v12, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 184
    .line 185
    invoke-virtual {v12}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 186
    .line 187
    .line 188
    move-result-object v13

    .line 189
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 190
    .line 191
    .line 192
    move-result-object v14

    .line 193
    if-nez v14, :cond_a

    .line 194
    .line 195
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 196
    .line 197
    .line 198
    :cond_a
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 199
    .line 200
    .line 201
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 202
    .line 203
    .line 204
    move-result v14

    .line 205
    if-eqz v14, :cond_b

    .line 206
    .line 207
    invoke-interface {v1, v13}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 208
    .line 209
    .line 210
    goto :goto_7

    .line 211
    :cond_b
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 212
    .line 213
    .line 214
    :goto_7
    invoke-static {v1}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 215
    .line 216
    .line 217
    move-result-object v13

    .line 218
    invoke-static {v12, v13, v6, v13, v9}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 219
    .line 220
    .line 221
    move-result-object v6

    .line 222
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 223
    .line 224
    .line 225
    move-result v9

    .line 226
    if-nez v9, :cond_c

    .line 227
    .line 228
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v9

    .line 232
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 233
    .line 234
    .line 235
    move-result-object v14

    .line 236
    invoke-static {v9, v14}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v9

    .line 240
    if-nez v9, :cond_d

    .line 241
    .line 242
    :cond_c
    invoke-static {v0, v13, v0, v6}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 243
    .line 244
    .line 245
    :cond_d
    invoke-virtual {v12}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-static {v13, v5, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 250
    .line 251
    .line 252
    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 253
    .line 254
    const/16 v0, 0xe

    .line 255
    .line 256
    invoke-static {v0}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 257
    .line 258
    .line 259
    move-result-wide v12

    .line 260
    sget-object v0, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    .line 261
    .line 262
    invoke-virtual {v0}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getMedium()Landroidx/compose/ui/text/font/FontWeight;

    .line 263
    .line 264
    .line 265
    move-result-object v15

    .line 266
    and-int/lit8 v0, v4, 0xe

    .line 267
    .line 268
    const v5, 0x30c00

    .line 269
    .line 270
    .line 271
    or-int/2addr v0, v5

    .line 272
    and-int/lit16 v4, v4, 0x380

    .line 273
    .line 274
    or-int v30, v0, v4

    .line 275
    .line 276
    const/16 v31, 0x0

    .line 277
    .line 278
    const v32, 0x1ffd2

    .line 279
    .line 280
    .line 281
    const/4 v9, 0x0

    .line 282
    const/4 v14, 0x0

    .line 283
    const/16 v16, 0x0

    .line 284
    .line 285
    const-wide/16 v17, 0x0

    .line 286
    .line 287
    const/16 v19, 0x0

    .line 288
    .line 289
    const/16 v20, 0x0

    .line 290
    .line 291
    const-wide/16 v21, 0x0

    .line 292
    .line 293
    const/16 v23, 0x0

    .line 294
    .line 295
    const/16 v24, 0x0

    .line 296
    .line 297
    const/16 v25, 0x0

    .line 298
    .line 299
    const/16 v26, 0x0

    .line 300
    .line 301
    const/16 v27, 0x0

    .line 302
    .line 303
    const/16 v28, 0x0

    .line 304
    .line 305
    move-object/from16 v29, v1

    .line 306
    .line 307
    invoke-static/range {v8 .. v32}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 308
    .line 309
    .line 310
    invoke-interface/range {v29 .. v29}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 311
    .line 312
    .line 313
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 314
    .line 315
    .line 316
    move-result v0

    .line 317
    if-eqz v0, :cond_f

    .line 318
    .line 319
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 320
    .line 321
    .line 322
    goto :goto_8

    .line 323
    :cond_e
    move-object/from16 v29, v1

    .line 324
    .line 325
    invoke-interface/range {v29 .. v29}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 326
    .line 327
    .line 328
    :cond_f
    :goto_8
    invoke-interface/range {v29 .. v29}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 329
    .line 330
    .line 331
    move-result-object v9

    .line 332
    if-eqz v9, :cond_10

    .line 333
    .line 334
    new-instance v0, Lcom/zykj/mistake/feature/collection/filter/h;

    .line 335
    .line 336
    const/4 v8, 0x0

    .line 337
    move-object/from16 v1, p0

    .line 338
    .line 339
    move-wide/from16 v4, p3

    .line 340
    .line 341
    move-object/from16 v6, p5

    .line 342
    .line 343
    invoke-direct/range {v0 .. v8}, Lcom/zykj/mistake/feature/collection/filter/h;-><init>(Ljava/lang/String;JJLr6/a;II)V

    .line 344
    .line 345
    .line 346
    invoke-interface {v9, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 347
    .line 348
    .line 349
    :cond_10
    return-void
.end method

.method public static final b(Ljava/lang/String;ZZZLr6/a;Landroidx/compose/runtime/Composer;I)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    move/from16 v4, p6

    .line 10
    .line 11
    const v5, -0x11cf13c2

    .line 12
    .line 13
    .line 14
    move-object/from16 v6, p5

    .line 15
    .line 16
    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 17
    .line 18
    .line 19
    move-result-object v6

    .line 20
    and-int/lit8 v7, v4, 0x6

    .line 21
    .line 22
    const/4 v8, 0x2

    .line 23
    if-nez v7, :cond_1

    .line 24
    .line 25
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    if-eqz v7, :cond_0

    .line 30
    .line 31
    const/4 v7, 0x4

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v7, v8

    .line 34
    :goto_0
    or-int/2addr v7, v4

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move v7, v4

    .line 37
    :goto_1
    and-int/lit8 v9, v4, 0x30

    .line 38
    .line 39
    if-nez v9, :cond_3

    .line 40
    .line 41
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 42
    .line 43
    .line 44
    move-result v9

    .line 45
    if-eqz v9, :cond_2

    .line 46
    .line 47
    const/16 v9, 0x20

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const/16 v9, 0x10

    .line 51
    .line 52
    :goto_2
    or-int/2addr v7, v9

    .line 53
    :cond_3
    and-int/lit16 v9, v4, 0x180

    .line 54
    .line 55
    if-nez v9, :cond_5

    .line 56
    .line 57
    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    if-eqz v9, :cond_4

    .line 62
    .line 63
    const/16 v9, 0x100

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_4
    const/16 v9, 0x80

    .line 67
    .line 68
    :goto_3
    or-int/2addr v7, v9

    .line 69
    :cond_5
    and-int/lit16 v9, v4, 0xc00

    .line 70
    .line 71
    if-nez v9, :cond_7

    .line 72
    .line 73
    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 74
    .line 75
    .line 76
    move-result v9

    .line 77
    if-eqz v9, :cond_6

    .line 78
    .line 79
    const/16 v9, 0x800

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_6
    const/16 v9, 0x400

    .line 83
    .line 84
    :goto_4
    or-int/2addr v7, v9

    .line 85
    :cond_7
    and-int/lit16 v9, v4, 0x6000

    .line 86
    .line 87
    move-object/from16 v14, p4

    .line 88
    .line 89
    if-nez v9, :cond_9

    .line 90
    .line 91
    invoke-interface {v6, v14}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

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
    or-int/2addr v7, v9

    .line 103
    :cond_9
    and-int/lit16 v9, v7, 0x2493

    .line 104
    .line 105
    const/16 v10, 0x2492

    .line 106
    .line 107
    const/4 v11, 0x0

    .line 108
    if-eq v9, v10, :cond_a

    .line 109
    .line 110
    const/4 v9, 0x1

    .line 111
    goto :goto_6

    .line 112
    :cond_a
    move v9, v11

    .line 113
    :goto_6
    and-int/lit8 v10, v7, 0x1

    .line 114
    .line 115
    invoke-interface {v6, v9, v10}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 116
    .line 117
    .line 118
    move-result v9

    .line 119
    if-eqz v9, :cond_19

    .line 120
    .line 121
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 122
    .line 123
    .line 124
    move-result v9

    .line 125
    if-eqz v9, :cond_b

    .line 126
    .line 127
    const/4 v9, -0x1

    .line 128
    const-string v10, "com.zykj.mistake.feature.collection.filter.FilterChip (MistakeCollectionFilterPanel.kt:290)"

    .line 129
    .line 130
    invoke-static {v5, v7, v9, v10}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 131
    .line 132
    .line 133
    :cond_b
    const/4 v5, 0x3

    .line 134
    const-wide v17, 0xfff5f5f5L

    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    const-wide v19, 0xffeff6ffL

    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    const/16 v9, 0x22

    .line 145
    .line 146
    const/16 v10, 0x4a

    .line 147
    .line 148
    if-nez v2, :cond_f

    .line 149
    .line 150
    if-eqz v3, :cond_c

    .line 151
    .line 152
    goto :goto_8

    .line 153
    :cond_c
    sget-object v8, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 154
    .line 155
    const-string v12, " - "

    .line 156
    .line 157
    invoke-static {v0, v12, v11}, Lkotlin/text/p;->F(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 158
    .line 159
    .line 160
    move-result v12

    .line 161
    if-eqz v12, :cond_d

    .line 162
    .line 163
    const/16 v10, 0xbc

    .line 164
    .line 165
    :cond_d
    int-to-float v10, v10

    .line 166
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 167
    .line 168
    .line 169
    move-result v10

    .line 170
    invoke-static {v8, v10}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 171
    .line 172
    .line 173
    move-result-object v8

    .line 174
    int-to-float v9, v9

    .line 175
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 176
    .line 177
    .line 178
    move-result v9

    .line 179
    invoke-static {v8, v9}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 180
    .line 181
    .line 182
    move-result-object v10

    .line 183
    const/4 v15, 0x7

    .line 184
    const/16 v16, 0x0

    .line 185
    .line 186
    move v8, v11

    .line 187
    const/4 v11, 0x0

    .line 188
    const/4 v12, 0x0

    .line 189
    const/4 v13, 0x0

    .line 190
    invoke-static/range {v10 .. v16}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 191
    .line 192
    .line 193
    move-result-object v9

    .line 194
    if-eqz v1, :cond_e

    .line 195
    .line 196
    invoke-static/range {v19 .. v20}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 197
    .line 198
    .line 199
    move-result-wide v10

    .line 200
    goto :goto_7

    .line 201
    :cond_e
    invoke-static/range {v17 .. v18}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 202
    .line 203
    .line 204
    move-result-wide v10

    .line 205
    :goto_7
    int-to-float v5, v5

    .line 206
    invoke-static {v5, v9, v10, v11}, Landroidx/compose/material3/c;->f(FLandroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    goto :goto_c

    .line 211
    :cond_f
    :goto_8
    sget-object v12, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 212
    .line 213
    const/4 v13, 0x0

    .line 214
    const/4 v14, 0x0

    .line 215
    if-eqz v3, :cond_10

    .line 216
    .line 217
    int-to-float v10, v10

    .line 218
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 219
    .line 220
    .line 221
    move-result v10

    .line 222
    invoke-static {v12, v10, v13, v8, v14}, Landroidx/compose/foundation/layout/SizeKt;->widthIn-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 223
    .line 224
    .line 225
    move-result-object v10

    .line 226
    goto :goto_9

    .line 227
    :cond_10
    move-object v10, v12

    .line 228
    :goto_9
    invoke-virtual {v12, v10}, Landroidx/compose/ui/Modifier$Companion;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 229
    .line 230
    .line 231
    move-result-object v10

    .line 232
    int-to-float v9, v9

    .line 233
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 234
    .line 235
    .line 236
    move-result v9

    .line 237
    invoke-static {v10, v9}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 238
    .line 239
    .line 240
    move-result-object v9

    .line 241
    if-eqz v1, :cond_11

    .line 242
    .line 243
    invoke-static/range {v19 .. v20}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 244
    .line 245
    .line 246
    move-result-wide v15

    .line 247
    :goto_a
    move-wide v11, v15

    .line 248
    goto :goto_b

    .line 249
    :cond_11
    invoke-static/range {v17 .. v18}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 250
    .line 251
    .line 252
    move-result-wide v15

    .line 253
    goto :goto_a

    .line 254
    :goto_b
    int-to-float v5, v5

    .line 255
    invoke-static {v5, v9, v11, v12}, Landroidx/compose/material3/c;->f(FLandroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    .line 256
    .line 257
    .line 258
    move-result-object v10

    .line 259
    const/4 v15, 0x7

    .line 260
    const/16 v16, 0x0

    .line 261
    .line 262
    const/4 v11, 0x0

    .line 263
    const/4 v12, 0x0

    .line 264
    move v5, v13

    .line 265
    const/4 v13, 0x0

    .line 266
    move-object v9, v14

    .line 267
    move-object/from16 v14, p4

    .line 268
    .line 269
    invoke-static/range {v10 .. v16}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 270
    .line 271
    .line 272
    move-result-object v10

    .line 273
    const/16 v11, 0xd

    .line 274
    .line 275
    int-to-float v11, v11

    .line 276
    invoke-static {v11}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 277
    .line 278
    .line 279
    move-result v11

    .line 280
    invoke-static {v10, v11, v5, v8, v9}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 281
    .line 282
    .line 283
    move-result-object v5

    .line 284
    :goto_c
    sget-object v8, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 285
    .line 286
    invoke-virtual {v8}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 287
    .line 288
    .line 289
    move-result-object v8

    .line 290
    const/4 v11, 0x0

    .line 291
    invoke-static {v8, v11}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 292
    .line 293
    .line 294
    move-result-object v8

    .line 295
    invoke-static {v6, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 296
    .line 297
    .line 298
    move-result v9

    .line 299
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 300
    .line 301
    .line 302
    move-result-object v10

    .line 303
    invoke-static {v6, v5}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 304
    .line 305
    .line 306
    move-result-object v5

    .line 307
    sget-object v11, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 308
    .line 309
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 310
    .line 311
    .line 312
    move-result-object v12

    .line 313
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 314
    .line 315
    .line 316
    move-result-object v13

    .line 317
    if-nez v13, :cond_12

    .line 318
    .line 319
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 320
    .line 321
    .line 322
    :cond_12
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 323
    .line 324
    .line 325
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 326
    .line 327
    .line 328
    move-result v13

    .line 329
    if-eqz v13, :cond_13

    .line 330
    .line 331
    invoke-interface {v6, v12}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 332
    .line 333
    .line 334
    goto :goto_d

    .line 335
    :cond_13
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 336
    .line 337
    .line 338
    :goto_d
    invoke-static {v6}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 339
    .line 340
    .line 341
    move-result-object v12

    .line 342
    invoke-static {v11, v12, v8, v12, v10}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 343
    .line 344
    .line 345
    move-result-object v8

    .line 346
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 347
    .line 348
    .line 349
    move-result v10

    .line 350
    if-nez v10, :cond_14

    .line 351
    .line 352
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v10

    .line 356
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 357
    .line 358
    .line 359
    move-result-object v13

    .line 360
    invoke-static {v10, v13}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    move-result v10

    .line 364
    if-nez v10, :cond_15

    .line 365
    .line 366
    :cond_14
    invoke-static {v9, v12, v9, v8}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 367
    .line 368
    .line 369
    :cond_15
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 370
    .line 371
    .line 372
    move-result-object v8

    .line 373
    invoke-static {v12, v5, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 374
    .line 375
    .line 376
    sget-object v5, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 377
    .line 378
    if-eqz v1, :cond_16

    .line 379
    .line 380
    const-wide v8, 0xff1576ffL

    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    :goto_e
    invoke-static {v8, v9}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 386
    .line 387
    .line 388
    move-result-wide v8

    .line 389
    goto :goto_f

    .line 390
    :cond_16
    const-wide v8, 0xff666666L

    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    goto :goto_e

    .line 396
    :goto_f
    const/16 v5, 0xc

    .line 397
    .line 398
    invoke-static {v5}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 399
    .line 400
    .line 401
    move-result-wide v10

    .line 402
    if-nez v2, :cond_18

    .line 403
    .line 404
    if-eqz v3, :cond_17

    .line 405
    .line 406
    goto :goto_11

    .line 407
    :cond_17
    sget-object v5, Landroidx/compose/ui/text/style/TextOverflow;->Companion:Landroidx/compose/ui/text/style/TextOverflow$Companion;

    .line 408
    .line 409
    invoke-virtual {v5}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getEllipsis-gIe3tQ8()I

    .line 410
    .line 411
    .line 412
    move-result v5

    .line 413
    :goto_10
    move v15, v5

    .line 414
    goto :goto_12

    .line 415
    :cond_18
    :goto_11
    sget-object v5, Landroidx/compose/ui/text/style/TextOverflow;->Companion:Landroidx/compose/ui/text/style/TextOverflow$Companion;

    .line 416
    .line 417
    invoke-virtual {v5}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getClip-gIe3tQ8()I

    .line 418
    .line 419
    .line 420
    move-result v5

    .line 421
    goto :goto_10

    .line 422
    :goto_12
    and-int/lit8 v5, v7, 0xe

    .line 423
    .line 424
    or-int/lit16 v5, v5, 0xc00

    .line 425
    .line 426
    const/16 v23, 0xc00

    .line 427
    .line 428
    const v24, 0x1d7f2

    .line 429
    .line 430
    .line 431
    const/4 v1, 0x0

    .line 432
    move-object/from16 v21, v6

    .line 433
    .line 434
    const/4 v6, 0x0

    .line 435
    const/4 v7, 0x0

    .line 436
    move-wide v2, v8

    .line 437
    const/4 v8, 0x0

    .line 438
    move/from16 v22, v5

    .line 439
    .line 440
    move-wide v4, v10

    .line 441
    const-wide/16 v9, 0x0

    .line 442
    .line 443
    const/4 v11, 0x0

    .line 444
    const/4 v12, 0x0

    .line 445
    const-wide/16 v13, 0x0

    .line 446
    .line 447
    const/16 v16, 0x0

    .line 448
    .line 449
    const/16 v17, 0x1

    .line 450
    .line 451
    const/16 v18, 0x0

    .line 452
    .line 453
    const/16 v19, 0x0

    .line 454
    .line 455
    const/16 v20, 0x0

    .line 456
    .line 457
    invoke-static/range {v0 .. v24}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 458
    .line 459
    .line 460
    invoke-interface/range {v21 .. v21}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 461
    .line 462
    .line 463
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 464
    .line 465
    .line 466
    move-result v0

    .line 467
    if-eqz v0, :cond_1a

    .line 468
    .line 469
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 470
    .line 471
    .line 472
    goto :goto_13

    .line 473
    :cond_19
    move-object/from16 v21, v6

    .line 474
    .line 475
    invoke-interface/range {v21 .. v21}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 476
    .line 477
    .line 478
    :cond_1a
    :goto_13
    invoke-interface/range {v21 .. v21}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 479
    .line 480
    .line 481
    move-result-object v8

    .line 482
    if-eqz v8, :cond_1b

    .line 483
    .line 484
    new-instance v0, Lcom/zykj/mistake/feature/collection/filter/e;

    .line 485
    .line 486
    const/4 v7, 0x0

    .line 487
    move-object/from16 v1, p0

    .line 488
    .line 489
    move/from16 v2, p1

    .line 490
    .line 491
    move/from16 v3, p2

    .line 492
    .line 493
    move/from16 v4, p3

    .line 494
    .line 495
    move-object/from16 v5, p4

    .line 496
    .line 497
    move/from16 v6, p6

    .line 498
    .line 499
    invoke-direct/range {v0 .. v7}, Lcom/zykj/mistake/feature/collection/filter/e;-><init>(Ljava/lang/Object;ZZZLd6/d;II)V

    .line 500
    .line 501
    .line 502
    invoke-interface {v8, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 503
    .line 504
    .line 505
    :cond_1b
    return-void
.end method

.method public static final c(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V
    .locals 35

    .line 1
    move-object/from16 v4, p1

    .line 2
    .line 3
    move/from16 v1, p4

    .line 4
    .line 5
    const v0, 0x34cac598

    .line 6
    .line 7
    .line 8
    move-object/from16 v2, p3

    .line 9
    .line 10
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v12

    .line 14
    and-int/lit8 v2, v1, 0x6

    .line 15
    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    move-object/from16 v2, p0

    .line 19
    .line 20
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    const/4 v3, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v3, 0x2

    .line 29
    :goto_0
    or-int/2addr v3, v1

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move-object/from16 v2, p0

    .line 32
    .line 33
    move v3, v1

    .line 34
    :goto_1
    and-int/lit8 v5, v1, 0x30

    .line 35
    .line 36
    const/16 v6, 0x10

    .line 37
    .line 38
    if-nez v5, :cond_3

    .line 39
    .line 40
    invoke-interface {v12, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-eqz v5, :cond_2

    .line 45
    .line 46
    const/16 v5, 0x20

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    move v5, v6

    .line 50
    :goto_2
    or-int/2addr v3, v5

    .line 51
    :cond_3
    and-int/lit8 v5, p5, 0x4

    .line 52
    .line 53
    if-eqz v5, :cond_5

    .line 54
    .line 55
    or-int/lit16 v3, v3, 0x180

    .line 56
    .line 57
    :cond_4
    move-object/from16 v7, p2

    .line 58
    .line 59
    goto :goto_4

    .line 60
    :cond_5
    and-int/lit16 v7, v1, 0x180

    .line 61
    .line 62
    if-nez v7, :cond_4

    .line 63
    .line 64
    move-object/from16 v7, p2

    .line 65
    .line 66
    invoke-interface {v12, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v8

    .line 70
    if-eqz v8, :cond_6

    .line 71
    .line 72
    const/16 v8, 0x100

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_6
    const/16 v8, 0x80

    .line 76
    .line 77
    :goto_3
    or-int/2addr v3, v8

    .line 78
    :goto_4
    and-int/lit16 v8, v3, 0x93

    .line 79
    .line 80
    const/16 v9, 0x92

    .line 81
    .line 82
    const/4 v10, 0x0

    .line 83
    const/4 v11, 0x1

    .line 84
    if-eq v8, v9, :cond_7

    .line 85
    .line 86
    move v8, v11

    .line 87
    goto :goto_5

    .line 88
    :cond_7
    move v8, v10

    .line 89
    :goto_5
    and-int/lit8 v9, v3, 0x1

    .line 90
    .line 91
    invoke-interface {v12, v8, v9}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    if-eqz v8, :cond_10

    .line 96
    .line 97
    if-eqz v5, :cond_8

    .line 98
    .line 99
    const-string v5, ""

    .line 100
    .line 101
    move-object/from16 v30, v5

    .line 102
    .line 103
    goto :goto_6

    .line 104
    :cond_8
    move-object/from16 v30, v7

    .line 105
    .line 106
    :goto_6
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    if-eqz v5, :cond_9

    .line 111
    .line 112
    const/4 v5, -0x1

    .line 113
    const-string v7, "com.zykj.mistake.feature.collection.filter.FilterSection (MistakeCollectionFilterPanel.kt:247)"

    .line 114
    .line 115
    invoke-static {v0, v3, v5, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 116
    .line 117
    .line 118
    :cond_9
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 119
    .line 120
    sget-object v5, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 121
    .line 122
    invoke-virtual {v5}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    sget-object v8, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 127
    .line 128
    invoke-virtual {v8}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    .line 129
    .line 130
    .line 131
    move-result-object v8

    .line 132
    invoke-static {v7, v8, v12, v10}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    invoke-static {v12, v10}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 137
    .line 138
    .line 139
    move-result v8

    .line 140
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 141
    .line 142
    .line 143
    move-result-object v9

    .line 144
    invoke-static {v12, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 145
    .line 146
    .line 147
    move-result-object v10

    .line 148
    sget-object v13, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 149
    .line 150
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 151
    .line 152
    .line 153
    move-result-object v14

    .line 154
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 155
    .line 156
    .line 157
    move-result-object v15

    .line 158
    if-nez v15, :cond_a

    .line 159
    .line 160
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 161
    .line 162
    .line 163
    :cond_a
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 164
    .line 165
    .line 166
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 167
    .line 168
    .line 169
    move-result v15

    .line 170
    if-eqz v15, :cond_b

    .line 171
    .line 172
    invoke-interface {v12, v14}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 173
    .line 174
    .line 175
    goto :goto_7

    .line 176
    :cond_b
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 177
    .line 178
    .line 179
    :goto_7
    invoke-static {v12}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 180
    .line 181
    .line 182
    move-result-object v14

    .line 183
    invoke-static {v13, v14, v7, v14, v9}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 184
    .line 185
    .line 186
    move-result-object v7

    .line 187
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 188
    .line 189
    .line 190
    move-result v9

    .line 191
    if-nez v9, :cond_c

    .line 192
    .line 193
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v9

    .line 197
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 198
    .line 199
    .line 200
    move-result-object v15

    .line 201
    invoke-static {v9, v15}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v9

    .line 205
    if-nez v9, :cond_d

    .line 206
    .line 207
    :cond_c
    invoke-static {v8, v14, v8, v7}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 208
    .line 209
    .line 210
    :cond_d
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 211
    .line 212
    .line 213
    move-result-object v7

    .line 214
    invoke-static {v14, v10, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 215
    .line 216
    .line 217
    sget-object v7, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 218
    .line 219
    const-wide v8, 0xff15171aL

    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    invoke-static {v8, v9}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 225
    .line 226
    .line 227
    move-result-wide v8

    .line 228
    invoke-static {v6}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 229
    .line 230
    .line 231
    move-result-wide v13

    .line 232
    invoke-interface {v7, v0}, Landroidx/compose/foundation/layout/RowScope;->alignByBaseline(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 233
    .line 234
    .line 235
    move-result-object v6

    .line 236
    and-int/lit8 v10, v3, 0xe

    .line 237
    .line 238
    or-int/lit16 v10, v10, 0xd80

    .line 239
    .line 240
    const/16 v28, 0x0

    .line 241
    .line 242
    const v29, 0x1fff0

    .line 243
    .line 244
    .line 245
    move v15, v11

    .line 246
    const/4 v11, 0x0

    .line 247
    move-object/from16 v26, v12

    .line 248
    .line 249
    const/4 v12, 0x0

    .line 250
    move/from16 v27, v10

    .line 251
    .line 252
    move-wide/from16 v33, v13

    .line 253
    .line 254
    move-object v14, v7

    .line 255
    move-wide v7, v8

    .line 256
    move-wide/from16 v9, v33

    .line 257
    .line 258
    const/4 v13, 0x0

    .line 259
    move-object/from16 v16, v14

    .line 260
    .line 261
    move/from16 v17, v15

    .line 262
    .line 263
    const-wide/16 v14, 0x0

    .line 264
    .line 265
    move-object/from16 v18, v16

    .line 266
    .line 267
    const/16 v16, 0x0

    .line 268
    .line 269
    move/from16 v19, v17

    .line 270
    .line 271
    const/16 v17, 0x0

    .line 272
    .line 273
    move-object/from16 v20, v18

    .line 274
    .line 275
    move/from16 v21, v19

    .line 276
    .line 277
    const-wide/16 v18, 0x0

    .line 278
    .line 279
    move-object/from16 v22, v20

    .line 280
    .line 281
    const/16 v20, 0x0

    .line 282
    .line 283
    move/from16 v23, v21

    .line 284
    .line 285
    const/16 v21, 0x0

    .line 286
    .line 287
    move-object/from16 v24, v22

    .line 288
    .line 289
    const/16 v22, 0x0

    .line 290
    .line 291
    move/from16 v25, v23

    .line 292
    .line 293
    const/16 v23, 0x0

    .line 294
    .line 295
    move-object/from16 v31, v24

    .line 296
    .line 297
    const/16 v24, 0x0

    .line 298
    .line 299
    move/from16 v32, v25

    .line 300
    .line 301
    const/16 v25, 0x0

    .line 302
    .line 303
    move-object/from16 p2, v5

    .line 304
    .line 305
    move-object v5, v2

    .line 306
    move-object/from16 v2, p2

    .line 307
    .line 308
    move-object/from16 p2, v0

    .line 309
    .line 310
    move-object/from16 v0, v31

    .line 311
    .line 312
    move/from16 v1, v32

    .line 313
    .line 314
    invoke-static/range {v5 .. v29}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 315
    .line 316
    .line 317
    move-object/from16 v12, v26

    .line 318
    .line 319
    invoke-static/range {v30 .. v30}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 320
    .line 321
    .line 322
    move-result v5

    .line 323
    const/16 v6, 0xe

    .line 324
    .line 325
    if-nez v5, :cond_e

    .line 326
    .line 327
    const v5, -0x40958e65

    .line 328
    .line 329
    .line 330
    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 331
    .line 332
    .line 333
    const-wide v7, 0xffc2c2c2L

    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    invoke-static {v7, v8}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 339
    .line 340
    .line 341
    move-result-wide v7

    .line 342
    const/16 v5, 0xb

    .line 343
    .line 344
    invoke-static {v5}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 345
    .line 346
    .line 347
    move-result-wide v9

    .line 348
    const/4 v5, 0x6

    .line 349
    int-to-float v11, v5

    .line 350
    invoke-static {v11}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 351
    .line 352
    .line 353
    move-result v14

    .line 354
    const/16 v18, 0xe

    .line 355
    .line 356
    const/16 v19, 0x0

    .line 357
    .line 358
    const/4 v15, 0x0

    .line 359
    const/16 v16, 0x0

    .line 360
    .line 361
    const/16 v17, 0x0

    .line 362
    .line 363
    move-object/from16 v13, p2

    .line 364
    .line 365
    invoke-static/range {v13 .. v19}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 366
    .line 367
    .line 368
    move-result-object v11

    .line 369
    move-object/from16 v31, v13

    .line 370
    .line 371
    invoke-interface {v0, v11}, Landroidx/compose/foundation/layout/RowScope;->alignByBaseline(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    shr-int/2addr v3, v5

    .line 376
    and-int/2addr v3, v6

    .line 377
    or-int/lit16 v3, v3, 0xd80

    .line 378
    .line 379
    const/16 v28, 0x0

    .line 380
    .line 381
    const v29, 0x1fff0

    .line 382
    .line 383
    .line 384
    const/4 v11, 0x0

    .line 385
    move-object/from16 v26, v12

    .line 386
    .line 387
    const/4 v12, 0x0

    .line 388
    const/4 v13, 0x0

    .line 389
    const-wide/16 v14, 0x0

    .line 390
    .line 391
    const/16 v16, 0x0

    .line 392
    .line 393
    const/16 v17, 0x0

    .line 394
    .line 395
    const-wide/16 v18, 0x0

    .line 396
    .line 397
    const/16 v20, 0x0

    .line 398
    .line 399
    const/16 v21, 0x0

    .line 400
    .line 401
    const/16 v22, 0x0

    .line 402
    .line 403
    const/16 v23, 0x0

    .line 404
    .line 405
    const/16 v24, 0x0

    .line 406
    .line 407
    const/16 v25, 0x0

    .line 408
    .line 409
    move v5, v6

    .line 410
    move-object v6, v0

    .line 411
    move v0, v5

    .line 412
    move/from16 v27, v3

    .line 413
    .line 414
    move-object/from16 v5, v30

    .line 415
    .line 416
    invoke-static/range {v5 .. v29}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 417
    .line 418
    .line 419
    move-object v3, v5

    .line 420
    move-object/from16 v12, v26

    .line 421
    .line 422
    :goto_8
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 423
    .line 424
    .line 425
    goto :goto_9

    .line 426
    :cond_e
    move-object/from16 v31, p2

    .line 427
    .line 428
    move v0, v6

    .line 429
    move-object/from16 v3, v30

    .line 430
    .line 431
    const v5, -0x412203da

    .line 432
    .line 433
    .line 434
    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 435
    .line 436
    .line 437
    goto :goto_8

    .line 438
    :goto_9
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 439
    .line 440
    .line 441
    int-to-float v0, v0

    .line 442
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 443
    .line 444
    .line 445
    move-result v15

    .line 446
    const/16 v0, 0x16

    .line 447
    .line 448
    int-to-float v0, v0

    .line 449
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 450
    .line 451
    .line 452
    move-result v17

    .line 453
    const/16 v18, 0x5

    .line 454
    .line 455
    const/16 v19, 0x0

    .line 456
    .line 457
    const/4 v14, 0x0

    .line 458
    const/16 v16, 0x0

    .line 459
    .line 460
    move-object/from16 v13, v31

    .line 461
    .line 462
    invoke-static/range {v13 .. v19}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 463
    .line 464
    .line 465
    move-result-object v5

    .line 466
    const/16 v0, 0xa

    .line 467
    .line 468
    int-to-float v0, v0

    .line 469
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 470
    .line 471
    .line 472
    move-result v6

    .line 473
    invoke-virtual {v2, v6}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 474
    .line 475
    .line 476
    move-result-object v6

    .line 477
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 478
    .line 479
    .line 480
    move-result v0

    .line 481
    invoke-virtual {v2, v0}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 482
    .line 483
    .line 484
    move-result-object v7

    .line 485
    new-instance v0, Landroidx/navigation/serialization/b;

    .line 486
    .line 487
    const/4 v2, 0x2

    .line 488
    invoke-direct {v0, v4, v2}, Landroidx/navigation/serialization/b;-><init>(Ljava/lang/Object;I)V

    .line 489
    .line 490
    .line 491
    const/16 v2, 0x36

    .line 492
    .line 493
    const v8, -0x438a4703

    .line 494
    .line 495
    .line 496
    invoke-static {v8, v1, v0, v12, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 497
    .line 498
    .line 499
    move-result-object v11

    .line 500
    const v13, 0x1801b6

    .line 501
    .line 502
    .line 503
    const/16 v14, 0x38

    .line 504
    .line 505
    const/4 v8, 0x0

    .line 506
    const/4 v9, 0x0

    .line 507
    const/4 v10, 0x0

    .line 508
    invoke-static/range {v5 .. v14}, Landroidx/compose/foundation/layout/FlowLayoutKt;->FlowRow(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILr6/f;Landroidx/compose/runtime/Composer;II)V

    .line 509
    .line 510
    .line 511
    move-object/from16 v26, v12

    .line 512
    .line 513
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 514
    .line 515
    .line 516
    move-result v0

    .line 517
    if-eqz v0, :cond_f

    .line 518
    .line 519
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 520
    .line 521
    .line 522
    :cond_f
    move-object v6, v3

    .line 523
    goto :goto_a

    .line 524
    :cond_10
    move-object/from16 v26, v12

    .line 525
    .line 526
    invoke-interface/range {v26 .. v26}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 527
    .line 528
    .line 529
    move-object v6, v7

    .line 530
    :goto_a
    invoke-interface/range {v26 .. v26}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 531
    .line 532
    .line 533
    move-result-object v7

    .line 534
    if-eqz v7, :cond_11

    .line 535
    .line 536
    new-instance v0, Landroidx/lifecycle/compose/d;

    .line 537
    .line 538
    const/4 v5, 0x2

    .line 539
    move-object/from16 v2, p0

    .line 540
    .line 541
    move/from16 v1, p4

    .line 542
    .line 543
    move/from16 v3, p5

    .line 544
    .line 545
    invoke-direct/range {v0 .. v6}, Landroidx/lifecycle/compose/d;-><init>(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)V

    .line 546
    .line 547
    .line 548
    invoke-interface {v7, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 549
    .line 550
    .line 551
    :cond_11
    return-void
.end method

.method public static final d(ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IZLjava/util/Set;Landroidx/compose/ui/Modifier;ZZILr6/c;Lr6/a;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/a;Lr6/a;Lr6/c;Lr6/a;Lr6/a;Landroidx/compose/runtime/Composer;III)V
    .locals 48

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v13, p12

    move-object/from16 v14, p17

    move-object/from16 v0, p18

    move-object/from16 v15, p19

    move-object/from16 v12, p20

    move-object/from16 v11, p21

    move-object/from16 v10, p22

    move-object/from16 v9, p24

    move-object/from16 v8, p25

    move-object/from16 v4, p26

    move-object/from16 v3, p27

    move-object/from16 v2, p28

    const-string v1, "filterSubjects"

    invoke-static {v5, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "filterTags"

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "selectedSubjectIds"

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "selectedTagIds"

    invoke-static {v13, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onSelectTimeType"

    invoke-static {v14, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onClearSubjects"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onToggleSubject"

    invoke-static {v15, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onSelectDiff"

    invoke-static {v12, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onSelectAttainedLevel"

    invoke-static {v11, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onSelectErrorReason"

    invoke-static {v10, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onSelectOtherCollectionType"

    invoke-static {v9, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onClearTags"

    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onSelectNoCustomTag"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onToggleTag"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onResetFilter"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onConfirmFilter"

    move-object/from16 v2, p29

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, -0x2c431748

    move-object/from16 v2, p30

    .line 1
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v2

    move/from16 v1, p31

    and-int/lit8 v17, v1, 0x6

    move/from16 v3, p0

    if-nez v17, :cond_1

    invoke-interface {v2, v3}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v17

    if-eqz v17, :cond_0

    const/16 v17, 0x4

    goto :goto_0

    :cond_0
    const/16 v17, 0x2

    :goto_0
    or-int v17, v1, v17

    goto :goto_1

    :cond_1
    move/from16 v17, v1

    :goto_1
    and-int/lit8 v18, v1, 0x30

    move-object/from16 v3, p1

    if-nez v18, :cond_3

    invoke-interface {v2, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_2

    const/16 v19, 0x20

    goto :goto_2

    :cond_2
    const/16 v19, 0x10

    :goto_2
    or-int v17, v17, v19

    :cond_3
    and-int/lit16 v3, v1, 0x180

    const/16 v19, 0x80

    const/16 v20, 0x100

    if-nez v3, :cond_5

    move-object/from16 v3, p2

    invoke-interface {v2, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_4

    move/from16 v21, v20

    goto :goto_3

    :cond_4
    move/from16 v21, v19

    :goto_3
    or-int v17, v17, v21

    goto :goto_4

    :cond_5
    move-object/from16 v3, p2

    :goto_4
    and-int/lit16 v3, v1, 0xc00

    const/16 v21, 0x400

    move/from16 v22, v3

    move/from16 v3, p3

    if-nez v22, :cond_7

    invoke-interface {v2, v3}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v22

    if-eqz v22, :cond_6

    const/16 v22, 0x800

    goto :goto_5

    :cond_6
    move/from16 v22, v21

    :goto_5
    or-int v17, v17, v22

    :cond_7
    and-int/lit16 v3, v1, 0x6000

    const/16 v22, 0x2000

    if-nez v3, :cond_9

    invoke-interface {v2, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    const/16 v3, 0x4000

    goto :goto_6

    :cond_8
    move/from16 v3, v22

    :goto_6
    or-int v17, v17, v3

    :cond_9
    const/high16 v3, 0x30000

    and-int v23, p31, v3

    const/high16 v24, 0x20000

    const/high16 v25, 0x10000

    if-nez v23, :cond_b

    invoke-interface {v2, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_a

    move/from16 v23, v24

    goto :goto_7

    :cond_a
    move/from16 v23, v25

    :goto_7
    or-int v17, v17, v23

    :cond_b
    const/high16 v23, 0x180000

    and-int v26, p31, v23

    const/high16 v27, 0x80000

    const/high16 v28, 0x100000

    if-nez v26, :cond_d

    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_c

    move/from16 v26, v28

    goto :goto_8

    :cond_c
    move/from16 v26, v27

    :goto_8
    or-int v17, v17, v26

    :cond_d
    const/high16 v26, 0xc00000

    and-int v29, p31, v26

    const/high16 v30, 0x400000

    move/from16 v31, v3

    move-object/from16 v1, p7

    if-nez v29, :cond_f

    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_e

    const/high16 v29, 0x800000

    goto :goto_9

    :cond_e
    move/from16 v29, v30

    :goto_9
    or-int v17, v17, v29

    :cond_f
    const/high16 v29, 0x6000000

    and-int v32, p31, v29

    const/high16 v33, 0x2000000

    const/high16 v34, 0x4000000

    move-object/from16 v3, p8

    if-nez v32, :cond_11

    invoke-interface {v2, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v32

    if-eqz v32, :cond_10

    move/from16 v32, v34

    goto :goto_a

    :cond_10
    move/from16 v32, v33

    :goto_a
    or-int v17, v17, v32

    :cond_11
    const/high16 v32, 0x30000000

    and-int v35, p31, v32

    const/high16 v36, 0x10000000

    move-object/from16 v6, p9

    if-nez v35, :cond_13

    invoke-interface {v2, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v35

    if-eqz v35, :cond_12

    const/high16 v35, 0x20000000

    goto :goto_b

    :cond_12
    move/from16 v35, v36

    :goto_b
    or-int v17, v17, v35

    :cond_13
    move/from16 v6, v17

    move/from16 v3, p32

    and-int/lit8 v17, v3, 0x6

    move/from16 v1, p10

    if-nez v17, :cond_15

    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v17

    if-eqz v17, :cond_14

    const/16 v17, 0x4

    goto :goto_c

    :cond_14
    const/16 v17, 0x2

    :goto_c
    or-int v17, v3, v17

    goto :goto_d

    :cond_15
    move/from16 v17, v3

    :goto_d
    and-int/lit8 v35, v3, 0x30

    move/from16 v1, p11

    if-nez v35, :cond_17

    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v35

    if-eqz v35, :cond_16

    const/16 v35, 0x20

    goto :goto_e

    :cond_16
    const/16 v35, 0x10

    :goto_e
    or-int v17, v17, v35

    :cond_17
    and-int/lit16 v1, v3, 0x180

    if-nez v1, :cond_19

    invoke-interface {v2, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_18

    move/from16 v1, v20

    goto :goto_f

    :cond_18
    move/from16 v1, v19

    :goto_f
    or-int v17, v17, v1

    :cond_19
    and-int/lit16 v1, v3, 0xc00

    if-nez v1, :cond_1b

    move-object/from16 v1, p13

    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v35

    if-eqz v35, :cond_1a

    const/16 v35, 0x800

    goto :goto_10

    :cond_1a
    move/from16 v35, v21

    :goto_10
    or-int v17, v17, v35

    goto :goto_11

    :cond_1b
    move-object/from16 v1, p13

    :goto_11
    and-int/lit16 v1, v3, 0x6000

    if-nez v1, :cond_1d

    move/from16 v1, p14

    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v35

    if-eqz v35, :cond_1c

    const/16 v35, 0x4000

    goto :goto_12

    :cond_1c
    move/from16 v35, v22

    :goto_12
    or-int v17, v17, v35

    goto :goto_13

    :cond_1d
    move/from16 v1, p14

    :goto_13
    and-int v35, v3, v31

    move/from16 v1, p15

    if-nez v35, :cond_1f

    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v35

    if-eqz v35, :cond_1e

    move/from16 v35, v24

    goto :goto_14

    :cond_1e
    move/from16 v35, v25

    :goto_14
    or-int v17, v17, v35

    :cond_1f
    and-int v35, v3, v23

    move/from16 v1, p16

    if-nez v35, :cond_21

    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v35

    if-eqz v35, :cond_20

    move/from16 v35, v28

    goto :goto_15

    :cond_20
    move/from16 v35, v27

    :goto_15
    or-int v17, v17, v35

    :cond_21
    and-int v35, v3, v26

    if-nez v35, :cond_23

    invoke-interface {v2, v14}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v35

    if-eqz v35, :cond_22

    const/high16 v35, 0x800000

    goto :goto_16

    :cond_22
    move/from16 v35, v30

    :goto_16
    or-int v17, v17, v35

    :cond_23
    and-int v35, v3, v29

    if-nez v35, :cond_25

    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v35

    if-eqz v35, :cond_24

    move/from16 v35, v34

    goto :goto_17

    :cond_24
    move/from16 v35, v33

    :goto_17
    or-int v17, v17, v35

    :cond_25
    and-int v35, v3, v32

    if-nez v35, :cond_27

    invoke-interface {v2, v15}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v35

    if-eqz v35, :cond_26

    const/high16 v35, 0x20000000

    goto :goto_18

    :cond_26
    move/from16 v35, v36

    :goto_18
    or-int v17, v17, v35

    :cond_27
    move/from16 v3, v17

    move/from16 v13, p33

    and-int/lit8 v17, v13, 0x6

    if-nez v17, :cond_29

    invoke-interface {v2, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_28

    const/16 v17, 0x4

    goto :goto_19

    :cond_28
    const/16 v17, 0x2

    :goto_19
    or-int v17, v13, v17

    goto :goto_1a

    :cond_29
    move/from16 v17, v13

    :goto_1a
    and-int/lit8 v35, v13, 0x30

    if-nez v35, :cond_2b

    invoke-interface {v2, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v35

    if-eqz v35, :cond_2a

    const/16 v35, 0x20

    goto :goto_1b

    :cond_2a
    const/16 v35, 0x10

    :goto_1b
    or-int v17, v17, v35

    :cond_2b
    and-int/lit16 v1, v13, 0x180

    if-nez v1, :cond_2d

    invoke-interface {v2, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2c

    move/from16 v19, v20

    :cond_2c
    or-int v17, v17, v19

    :cond_2d
    and-int/lit16 v1, v13, 0xc00

    if-nez v1, :cond_2f

    move-object/from16 v1, p23

    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_2e

    const/16 v21, 0x800

    :cond_2e
    or-int v17, v17, v21

    goto :goto_1c

    :cond_2f
    move-object/from16 v1, p23

    :goto_1c
    and-int/lit16 v1, v13, 0x6000

    if-nez v1, :cond_31

    invoke-interface {v2, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_30

    const/16 v22, 0x4000

    :cond_30
    or-int v17, v17, v22

    :cond_31
    and-int v1, v13, v31

    if-nez v1, :cond_33

    invoke-interface {v2, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_32

    goto :goto_1d

    :cond_32
    move/from16 v24, v25

    :goto_1d
    or-int v17, v17, v24

    :cond_33
    and-int v1, v13, v23

    if-nez v1, :cond_35

    invoke-interface {v2, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_34

    move/from16 v27, v28

    :cond_34
    or-int v17, v17, v27

    :cond_35
    and-int v1, v13, v26

    if-nez v1, :cond_37

    move-object/from16 v1, p27

    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_36

    const/high16 v30, 0x800000

    :cond_36
    or-int v17, v17, v30

    goto :goto_1e

    :cond_37
    move-object/from16 v1, p27

    :goto_1e
    and-int v19, v13, v29

    move-object/from16 v13, p28

    if-nez v19, :cond_39

    invoke-interface {v2, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_38

    move/from16 v33, v34

    :cond_38
    or-int v17, v17, v33

    :cond_39
    and-int v19, p33, v32

    move-object/from16 v13, p29

    if-nez v19, :cond_3b

    invoke-interface {v2, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_3a

    const/high16 v36, 0x20000000

    :cond_3a
    or-int v17, v17, v36

    :cond_3b
    move/from16 v13, v17

    const v17, 0x12492493

    and-int v1, v6, v17

    const v4, 0x12492492

    const/4 v8, 0x0

    if-ne v1, v4, :cond_3d

    and-int v1, v3, v17

    if-ne v1, v4, :cond_3d

    and-int v1, v13, v17

    if-eq v1, v4, :cond_3c

    goto :goto_1f

    :cond_3c
    move v1, v8

    goto :goto_20

    :cond_3d
    :goto_1f
    const/4 v1, 0x1

    :goto_20
    and-int/lit8 v4, v6, 0x1

    invoke-interface {v2, v1, v4}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v1

    if-eqz v1, :cond_6c

    .line 2
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_3e

    const-string v1, "com.zykj.mistake.feature.collection.filter.MistakeCollectionFilterPanel (MistakeCollectionFilterPanel.kt:63)"

    const v4, -0x2c431748

    invoke-static {v4, v6, v3, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 3
    :cond_3e
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    move-result-wide v42

    const/16 v45, 0x2

    const/16 v46, 0x0

    const/16 v44, 0x0

    move-object/from16 v41, p13

    invoke-static/range {v41 .. v46}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 4
    sget-object v4, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v4}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-result-object v6

    .line 5
    sget-object v16, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    move/from16 v41, v3

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    move-result-object v3

    .line 6
    invoke-static {v6, v3, v2, v8}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v3

    .line 7
    invoke-static {v2, v8}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v6

    .line 8
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v8

    .line 9
    invoke-static {v2, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v17, v4

    .line 10
    sget-object v4, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v4}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    move-result-object v9

    .line 11
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v19

    if-nez v19, :cond_3f

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 12
    :cond_3f
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 13
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v19

    if-eqz v19, :cond_40

    .line 14
    invoke-interface {v2, v9}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    goto :goto_21

    .line 15
    :cond_40
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 16
    :goto_21
    invoke-static {v2}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v9

    .line 17
    invoke-static {v4, v9, v3, v9, v8}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    move-result-object v3

    .line 18
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v8

    if-nez v8, :cond_41

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v8

    move/from16 v43, v13

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v8, v13}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_42

    goto :goto_22

    :cond_41
    move/from16 v43, v13

    .line 19
    :goto_22
    invoke-static {v6, v9, v6, v3}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 20
    :cond_42
    invoke-virtual {v4}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    move-result-object v3

    invoke-static {v9, v1, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 21
    sget-object v19, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 22
    sget-object v20, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    const/16 v23, 0x2

    const/16 v24, 0x0

    const/high16 v21, 0x3f800000    # 1.0f

    const/16 v22, 0x0

    .line 23
    invoke-static/range {v19 .. v24}, Landroidx/compose/foundation/layout/ColumnScope;->weight$default(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v25

    const/4 v1, 0x1

    const/4 v3, 0x0

    .line 24
    invoke-static {v3, v2, v3, v1}, Landroidx/compose/foundation/ScrollKt;->rememberScrollState(ILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/ScrollState;

    move-result-object v26

    const/16 v30, 0xe

    const/16 v31, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-static/range {v25 .. v31}, Landroidx/compose/foundation/ScrollKt;->verticalScroll$default(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v32

    const/16 v1, 0x1c

    int-to-float v1, v1

    .line 25
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v33

    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v34

    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v35

    const/16 v37, 0x8

    const/16 v38, 0x0

    const/16 v36, 0x0

    .line 26
    invoke-static/range {v32 .. v38}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 27
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-result-object v3

    .line 28
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    move-result-object v6

    const/4 v8, 0x0

    .line 29
    invoke-static {v3, v6, v2, v8}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v3

    .line 30
    invoke-static {v2, v8}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v6

    .line 31
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v8

    .line 32
    invoke-static {v2, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 33
    invoke-virtual {v4}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    move-result-object v9

    .line 34
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v13

    if-nez v13, :cond_43

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 35
    :cond_43
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 36
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v13

    if-eqz v13, :cond_44

    .line 37
    invoke-interface {v2, v9}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    goto :goto_23

    .line 38
    :cond_44
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 39
    :goto_23
    invoke-static {v2}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v9

    .line 40
    invoke-static {v4, v9, v3, v9, v8}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    move-result-object v3

    .line 41
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v8

    if-nez v8, :cond_45

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v8, v13}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_46

    .line 42
    :cond_45
    invoke-static {v6, v9, v6, v3}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 43
    :cond_46
    invoke-virtual {v4}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    move-result-object v3

    invoke-static {v9, v1, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    const v1, -0x4fc4ac2a

    const/16 v3, 0x12

    if-eqz p14, :cond_47

    const v4, -0x4f986da9

    .line 44
    invoke-interface {v2, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-wide v8, 0xff15171aL

    .line 45
    invoke-static {v8, v9}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v8

    .line 46
    invoke-static {v3}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v16

    .line 47
    sget-object v4, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {v4}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v4

    const/16 v6, 0x20

    int-to-float v6, v6

    .line 48
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v24

    const/16 v25, 0x7

    const/16 v26, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    .line 49
    invoke-static/range {v20 .. v26}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/16 v39, 0x0

    const v40, 0x1ffd0

    move-wide/from16 v20, v16

    .line 50
    const-string v16, "\u7b5b\u9009"

    const/16 v22, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const v38, 0x30db6

    move-object/from16 v37, v2

    move-object/from16 v23, v4

    move-object/from16 v17, v6

    move-wide/from16 v18, v8

    invoke-static/range {v16 .. v40}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 51
    :goto_24
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_25

    :cond_47
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    goto :goto_24

    :goto_25
    const v4, -0x341d7cde    # -2.9689412E7f

    .line 52
    invoke-interface {v2, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 53
    const-string v4, "\u8fd17\u5929"

    const-string v6, "\u8fd130\u5929"

    const-string v8, "\u5168\u90e8"

    const-string v9, "\u81ea\u5b9a\u4e49\u533a\u95f4"

    filled-new-array {v8, v4, v6, v9}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lkotlin/collections/u;->z([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    .line 54
    new-instance v6, Ljava/util/ArrayList;

    const/16 v13, 0xa

    move/from16 v24, v3

    invoke-static {v4, v13}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v6, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 55
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    :goto_26
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    const/high16 v22, 0x1c00000

    const/4 v13, 0x0

    if-eqz v16, :cond_51

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    add-int/lit8 v17, v4, 0x1

    if-ltz v4, :cond_50

    .line 56
    check-cast v16, Ljava/lang/String;

    const/4 v13, 0x3

    if-ne v4, v13, :cond_4b

    if-eqz p3, :cond_4b

    if-eqz p1, :cond_49

    .line 57
    invoke-static/range {p1 .. p1}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    move-result v13

    if-eqz v13, :cond_48

    goto :goto_27

    :cond_48
    if-eqz p2, :cond_49

    invoke-static/range {p2 .. p2}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    move-result v13

    if-eqz v13, :cond_4a

    :cond_49
    :goto_27
    move-object/from16 v18, v3

    move-object/from16 v19, v9

    move-object/from16 v3, p2

    goto :goto_28

    :cond_4a
    const/16 v13, 0x2d

    const/16 v1, 0x2e

    move-object/from16 v18, v3

    move-object/from16 v19, v9

    move-object/from16 v3, p1

    .line 58
    invoke-static {v3, v13, v1}, Lkotlin/text/w;->z(Ljava/lang/String;CC)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v3, p2

    invoke-static {v3, v13, v1}, Lkotlin/text/w;->z(Ljava/lang/String;CC)Ljava/lang/String;

    move-result-object v1

    const-string v13, " - "

    .line 59
    invoke-static {v9, v13, v1}, Landroid/support/v4/media/f;->D(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v16, v1

    goto :goto_29

    :goto_28
    move-object/from16 v16, v19

    :goto_29
    move/from16 v9, p0

    move-object/from16 v1, v16

    goto :goto_2a

    :cond_4b
    move-object/from16 v18, v3

    move-object/from16 v19, v9

    move-object/from16 v3, p2

    goto :goto_29

    :goto_2a
    if-ne v9, v4, :cond_4c

    const/4 v13, 0x1

    goto :goto_2b

    :cond_4c
    const/4 v13, 0x0

    :goto_2b
    and-int v3, v41, v22

    const/high16 v9, 0x800000

    if-ne v3, v9, :cond_4d

    const/4 v3, 0x1

    goto :goto_2c

    :cond_4d
    const/4 v3, 0x0

    .line 60
    :goto_2c
    invoke-interface {v2, v4}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v9

    or-int/2addr v3, v9

    .line 61
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v9

    if-nez v3, :cond_4e

    .line 62
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v9, v3, :cond_4f

    .line 63
    :cond_4e
    new-instance v9, Lcom/zykj/mistake/feature/collection/filter/d;

    const/4 v3, 0x0

    invoke-direct {v9, v4, v3, v14}, Lcom/zykj/mistake/feature/collection/filter/d;-><init>(IILr6/c;)V

    .line 64
    invoke-interface {v2, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 65
    :cond_4f
    check-cast v9, Lr6/a;

    .line 66
    new-instance v3, Lcom/zykj/mistake/feature/collection/filter/c;

    const/16 v4, 0xc

    invoke-direct {v3, v4, v1, v9, v13}, Lcom/zykj/mistake/feature/collection/filter/c;-><init>(ILjava/lang/String;Lr6/a;Z)V

    .line 67
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v4, v17

    move-object/from16 v3, v18

    move-object/from16 v9, v19

    const v1, -0x4fc4ac2a

    const/16 v13, 0xa

    goto/16 :goto_26

    :cond_50
    invoke-static {}, Lkotlin/collections/u;->L()V

    throw v13

    .line 68
    :cond_51
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/16 v20, 0x6

    const/16 v21, 0x4

    .line 69
    const-string v16, "\u52a0\u5165\u65f6\u95f4"

    const/16 v18, 0x0

    move-object/from16 v19, v2

    move-object/from16 v17, v6

    invoke-static/range {v16 .. v21}, Lcom/zykj/mistake/feature/collection/filter/i;->c(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    .line 70
    new-instance v1, Lcom/zykj/mistake/feature/collection/filter/c;

    .line 71
    invoke-interface {v7}, Ljava/util/Set;->isEmpty()Z

    move-result v3

    const/16 v4, 0xc

    .line 72
    invoke-direct {v1, v4, v8, v0, v3}, Lcom/zykj/mistake/feature/collection/filter/c;-><init>(ILjava/lang/String;Lr6/a;Z)V

    .line 73
    invoke-static {v1}, Lkotlin/collections/u;->y(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const v3, -0x341d0e89    # -2.9745902E7f

    invoke-interface {v2, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 74
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v5, v4}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 75
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_55

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 76
    check-cast v6, Lp4/a;

    .line 77
    iget-object v9, v6, Lp4/a;->b:Ljava/lang/String;

    move-object/from16 v27, v13

    .line 78
    iget-wide v13, v6, Lp4/a;->a:J

    .line 79
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    invoke-interface {v7, v13}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v13

    const/high16 v14, 0x70000000

    and-int v14, v41, v14

    const/high16 v0, 0x20000000

    if-ne v14, v0, :cond_52

    const/4 v14, 0x1

    goto :goto_2e

    :cond_52
    const/4 v14, 0x0

    .line 80
    :goto_2e
    invoke-interface {v2, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    or-int v14, v14, v16

    .line 81
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    if-nez v14, :cond_53

    .line 82
    sget-object v14, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v14}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v14

    if-ne v0, v14, :cond_54

    .line 83
    :cond_53
    new-instance v0, Lcom/zykj/mistake/feature/collection/filter/f;

    const/4 v14, 0x0

    invoke-direct {v0, v15, v6, v14}, Lcom/zykj/mistake/feature/collection/filter/f;-><init>(Lr6/c;Lp4/a;I)V

    .line 84
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 85
    :cond_54
    check-cast v0, Lr6/a;

    .line 86
    new-instance v6, Lcom/zykj/mistake/feature/collection/filter/c;

    const/4 v14, 0x4

    invoke-direct {v6, v14, v9, v0, v13}, Lcom/zykj/mistake/feature/collection/filter/c;-><init>(ILjava/lang/String;Lr6/a;Z)V

    .line 87
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v14, p17

    move-object/from16 v0, p18

    move-object/from16 v13, v27

    goto :goto_2d

    :cond_55
    move-object/from16 v27, v13

    .line 88
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 89
    invoke-static {v1, v3}, Lkotlin/collections/t;->t0(Ljava/util/Collection;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v17

    const/16 v20, 0x186

    const/16 v21, 0x0

    .line 90
    const-string v16, "\u79d1\u76ee"

    const-string v18, "\u53ef\u591a\u9009\uff0c\u81f3\u5c11\u9009\u62e91\u9879"

    move-object/from16 v19, v2

    invoke-static/range {v16 .. v21}, Lcom/zykj/mistake/feature/collection/filter/i;->c(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    .line 91
    sget-object v0, Lcom/zykj/mistake/utils/d;->a:[Ljava/lang/String;

    invoke-static {v0}, Lkotlin/collections/q;->e0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    move-object/from16 v1, p7

    .line 92
    invoke-static {v0, v1, v12}, Lcom/zykj/mistake/feature/collection/filter/i;->e(Ljava/util/List;Ljava/lang/Integer;Lr6/c;)Ljava/util/ArrayList;

    move-result-object v17

    const/16 v20, 0x6

    const/16 v21, 0x4

    .line 93
    const-string v16, "\u96be\u6613\u5ea6"

    const/16 v18, 0x0

    invoke-static/range {v16 .. v21}, Lcom/zykj/mistake/feature/collection/filter/i;->c(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    .line 94
    sget-object v0, Lcom/zykj/mistake/utils/d;->b:[Ljava/lang/String;

    invoke-static {v0}, Lkotlin/collections/q;->e0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    move-object/from16 v9, p8

    .line 95
    invoke-static {v0, v9, v11}, Lcom/zykj/mistake/feature/collection/filter/i;->e(Ljava/util/List;Ljava/lang/Integer;Lr6/c;)Ljava/util/ArrayList;

    move-result-object v17

    .line 96
    const-string v16, "\u638c\u63e1\u5ea6"

    invoke-static/range {v16 .. v21}, Lcom/zykj/mistake/feature/collection/filter/i;->c(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    .line 97
    sget-object v0, Lcom/zykj/mistake/utils/d;->c:[Ljava/lang/String;

    invoke-static {v0}, Lkotlin/collections/q;->e0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    move-object/from16 v6, p9

    .line 98
    invoke-static {v0, v6, v10}, Lcom/zykj/mistake/feature/collection/filter/i;->e(Ljava/util/List;Ljava/lang/Integer;Lr6/c;)Ljava/util/ArrayList;

    move-result-object v17

    .line 99
    const-string v16, "\u9519\u8bef\u539f\u56e0"

    invoke-static/range {v16 .. v21}, Lcom/zykj/mistake/feature/collection/filter/i;->c(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    .line 100
    const-string v0, "\u5df2\u6536\u5f55"

    if-eqz p15, :cond_5c

    const v3, -0x4f706560

    invoke-interface {v2, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const v3, -0x341c573c    # -2.9839752E7f

    .line 101
    invoke-interface {v2, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 102
    const-string v3, "\u672a\u6536\u5f55"

    filled-new-array {v8, v3, v0}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/u;->z([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    .line 103
    new-instance v4, Ljava/util/ArrayList;

    const/16 v13, 0xa

    invoke-static {v3, v13}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    move-result v14

    invoke-direct {v4, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 104
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v13, 0x0

    :goto_2f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_5b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    add-int/lit8 v16, v13, 0x1

    if-ltz v13, :cond_5a

    .line 105
    check-cast v14, Ljava/lang/String;

    move/from16 v1, p16

    if-ne v1, v13, :cond_56

    const/4 v1, 0x1

    goto :goto_30

    :cond_56
    const/4 v1, 0x0

    :goto_30
    move-object/from16 v17, v3

    move/from16 v3, v43

    and-int/lit16 v5, v3, 0x1c00

    const/16 v3, 0x800

    if-ne v5, v3, :cond_57

    const/4 v5, 0x1

    goto :goto_31

    :cond_57
    const/4 v5, 0x0

    .line 106
    :goto_31
    invoke-interface {v2, v13}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v18

    or-int v5, v5, v18

    .line 107
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v5, :cond_59

    .line 108
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v3, v5, :cond_58

    goto :goto_32

    :cond_58
    move-object/from16 v5, p23

    goto :goto_33

    .line 109
    :cond_59
    :goto_32
    new-instance v3, Lcom/zykj/mistake/feature/collection/filter/d;

    move-object/from16 v5, p23

    const/4 v6, 0x1

    invoke-direct {v3, v13, v6, v5}, Lcom/zykj/mistake/feature/collection/filter/d;-><init>(IILr6/c;)V

    .line 110
    invoke-interface {v2, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 111
    :goto_33
    check-cast v3, Lr6/a;

    .line 112
    new-instance v6, Lcom/zykj/mistake/feature/collection/filter/c;

    const/16 v13, 0xc

    invoke-direct {v6, v13, v14, v3, v1}, Lcom/zykj/mistake/feature/collection/filter/c;-><init>(ILjava/lang/String;Lr6/a;Z)V

    .line 113
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v5, p4

    move-object/from16 v1, p7

    move-object/from16 v6, p9

    move/from16 v13, v16

    move-object/from16 v3, v17

    goto :goto_2f

    :cond_5a
    invoke-static {}, Lkotlin/collections/u;->L()V

    throw v27

    :cond_5b
    move-object/from16 v5, p23

    .line 114
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/16 v20, 0x6

    const/16 v21, 0x4

    .line 115
    const-string v16, "\u672c\u9519\u9898\u96c6"

    const/16 v18, 0x0

    move-object/from16 v19, v2

    move-object/from16 v17, v4

    invoke-static/range {v16 .. v21}, Lcom/zykj/mistake/feature/collection/filter/i;->c(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    .line 116
    :goto_34
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_35

    :cond_5c
    move-object/from16 v5, p23

    const v1, -0x4fc4ac2a

    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    goto :goto_34

    :goto_35
    const v1, -0x341c1df8    # -2.9869072E7f

    .line 117
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 118
    const-string v1, "\u5747\u672a\u6536\u5f55"

    filled-new-array {v8, v1, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/u;->z([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 119
    new-instance v1, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v0, v4}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 120
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v3, 0x0

    :goto_36
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_62

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v6, v3, 0x1

    if-ltz v3, :cond_61

    .line 121
    check-cast v4, Ljava/lang/String;

    move/from16 v13, p10

    if-ne v13, v3, :cond_5d

    const/4 v14, 0x1

    goto :goto_37

    :cond_5d
    const/4 v14, 0x0

    :goto_37
    const v16, 0xe000

    move-object/from16 v17, v0

    and-int v0, v43, v16

    const/16 v5, 0x4000

    if-ne v0, v5, :cond_5e

    const/4 v0, 0x1

    goto :goto_38

    :cond_5e
    const/4 v0, 0x0

    .line 122
    :goto_38
    invoke-interface {v2, v3}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v16

    or-int v0, v0, v16

    .line 123
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_60

    .line 124
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v5, v0, :cond_5f

    goto :goto_39

    :cond_5f
    move-object/from16 v0, p24

    move/from16 p30, v6

    const/4 v6, 0x2

    goto :goto_3a

    .line 125
    :cond_60
    :goto_39
    new-instance v5, Lcom/zykj/mistake/feature/collection/filter/d;

    move-object/from16 v0, p24

    move/from16 p30, v6

    const/4 v6, 0x2

    invoke-direct {v5, v3, v6, v0}, Lcom/zykj/mistake/feature/collection/filter/d;-><init>(IILr6/c;)V

    .line 126
    invoke-interface {v2, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 127
    :goto_3a
    check-cast v5, Lr6/a;

    .line 128
    new-instance v3, Lcom/zykj/mistake/feature/collection/filter/c;

    const/16 v6, 0xc

    invoke-direct {v3, v6, v4, v5, v14}, Lcom/zykj/mistake/feature/collection/filter/c;-><init>(ILjava/lang/String;Lr6/a;Z)V

    .line 129
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v5, p23

    move/from16 v3, p30

    move-object/from16 v0, v17

    goto :goto_36

    :cond_61
    invoke-static {}, Lkotlin/collections/u;->L()V

    throw v27

    :cond_62
    move/from16 v13, p10

    move-object/from16 v0, p24

    .line 130
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/16 v20, 0x6

    const/16 v21, 0x4

    .line 131
    const-string v16, "\u5176\u4ed6\u9519\u9898\u96c6"

    const/16 v18, 0x0

    move-object/from16 v17, v1

    move-object/from16 v19, v2

    invoke-static/range {v16 .. v21}, Lcom/zykj/mistake/feature/collection/filter/i;->c(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    .line 132
    new-instance v1, Lcom/zykj/mistake/feature/collection/filter/c;

    if-nez p11, :cond_63

    .line 133
    invoke-interface/range {p12 .. p12}, Ljava/util/Set;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_63

    const/4 v3, 0x1

    :goto_3b
    move-object/from16 v4, p25

    const/16 v6, 0xc

    goto :goto_3c

    :cond_63
    const/4 v3, 0x0

    goto :goto_3b

    .line 134
    :goto_3c
    invoke-direct {v1, v6, v8, v4, v3}, Lcom/zykj/mistake/feature/collection/filter/c;-><init>(ILjava/lang/String;Lr6/a;Z)V

    .line 135
    new-instance v3, Lcom/zykj/mistake/feature/collection/filter/c;

    .line 136
    const-string v5, "\u672a\u6253\u6807\u7b7e"

    move/from16 v8, p11

    move-object/from16 v14, p26

    .line 137
    invoke-direct {v3, v6, v5, v14, v8}, Lcom/zykj/mistake/feature/collection/filter/c;-><init>(ILjava/lang/String;Lr6/a;Z)V

    filled-new-array {v1, v3}, [Lcom/zykj/mistake/feature/collection/filter/c;

    move-result-object v1

    .line 138
    invoke-static {v1}, Lkotlin/collections/u;->z([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const v3, -0x341bb00b    # -2.9925354E7f

    invoke-interface {v2, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 139
    new-instance v3, Ljava/util/ArrayList;

    move-object/from16 v6, p5

    const/16 v5, 0xa

    invoke-static {v6, v5}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 140
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_3d
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_67

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    .line 141
    move-object/from16 v0, v16

    check-cast v0, Lcom/zykj/mistake/feature/collection/detail/n;

    .line 142
    iget-object v4, v0, Lcom/zykj/mistake/feature/collection/detail/n;->b:Ljava/lang/String;

    move-object/from16 p30, v5

    .line 143
    iget-wide v5, v0, Lcom/zykj/mistake/feature/collection/detail/n;->a:J

    .line 144
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    move-object/from16 v6, p12

    invoke-interface {v6, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    and-int v6, v43, v22

    const/high16 v7, 0x800000

    if-ne v6, v7, :cond_64

    const/4 v6, 0x1

    goto :goto_3e

    :cond_64
    const/4 v6, 0x0

    .line 145
    :goto_3e
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    or-int v6, v6, v16

    .line 146
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_66

    .line 147
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v7, v6, :cond_65

    goto :goto_3f

    :cond_65
    move-object/from16 v8, p27

    goto :goto_40

    .line 148
    :cond_66
    :goto_3f
    new-instance v7, Landroidx/navigation/e;

    const/4 v6, 0x5

    move-object/from16 v8, p27

    invoke-direct {v7, v6, v8, v0}, Landroidx/navigation/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 149
    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 150
    :goto_40
    check-cast v7, Lr6/a;

    .line 151
    new-instance v0, Lcom/zykj/mistake/feature/collection/filter/c;

    const/16 v6, 0x8

    invoke-direct {v0, v6, v4, v7, v5}, Lcom/zykj/mistake/feature/collection/filter/c;-><init>(ILjava/lang/String;Lr6/a;Z)V

    .line 152
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p11

    move-object/from16 v0, p24

    move-object/from16 v4, p25

    move-object/from16 v5, p30

    goto :goto_3d

    :cond_67
    move-object/from16 v8, p27

    .line 153
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 154
    invoke-static {v1, v3}, Lkotlin/collections/t;->t0(Ljava/util/Collection;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v17

    const/16 v20, 0x186

    const/16 v21, 0x0

    .line 155
    const-string v16, "\u6807\u7b7e"

    const-string v18, "\u53ef\u591a\u9009"

    move-object/from16 v19, v2

    invoke-static/range {v16 .. v21}, Lcom/zykj/mistake/feature/collection/filter/i;->c(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    .line 156
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 157
    sget-object v0, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v0}, Landroidx/compose/foundation/layout/Arrangement;->getCenter()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    move-result-object v0

    .line 158
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    const/4 v3, 0x0

    move-object/from16 v4, v27

    const/4 v6, 0x1

    .line 159
    invoke-static {v1, v3, v6, v4}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    const/16 v3, 0x16

    int-to-float v3, v3

    .line 160
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v20

    const/16 v3, 0x10

    int-to-float v3, v3

    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v18

    const/16 v21, 0x5

    const/16 v22, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    .line 161
    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    .line 162
    sget-object v4, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v4}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    move-result-object v4

    const/4 v5, 0x6

    .line 163
    invoke-static {v0, v4, v2, v5}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v0

    const/4 v4, 0x0

    .line 164
    invoke-static {v2, v4}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v4

    .line 165
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v6

    .line 166
    invoke-static {v2, v3}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    .line 167
    sget-object v7, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    move-result-object v5

    .line 168
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v16

    if-nez v16, :cond_68

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 169
    :cond_68
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 170
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v16

    if-eqz v16, :cond_69

    .line 171
    invoke-interface {v2, v5}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    goto :goto_41

    .line 172
    :cond_69
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 173
    :goto_41
    invoke-static {v2}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v5

    .line 174
    invoke-static {v7, v5, v0, v5, v6}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    move-result-object v0

    .line 175
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v6

    if-nez v6, :cond_6a

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v37, v2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v6, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6b

    goto :goto_42

    :cond_6a
    move-object/from16 v37, v2

    .line 176
    :goto_42
    invoke-static {v4, v5, v4, v0}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 177
    :cond_6b
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    move-result-object v0

    invoke-static {v5, v3, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 178
    sget-object v0, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    const-wide v2, 0xffe8f1ffL

    .line 179
    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v17

    const-wide v2, 0xff1576ffL

    .line 180
    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v19

    shr-int/lit8 v0, v43, 0xf

    and-int/lit16 v0, v0, 0x1c00

    or-int/lit16 v0, v0, 0x1b6

    .line 181
    const-string v16, "\u91cd\u7f6e"

    move-object/from16 v21, p28

    move/from16 v23, v0

    move-object/from16 v22, v37

    invoke-static/range {v16 .. v23}, Lcom/zykj/mistake/feature/collection/filter/i;->a(Ljava/lang/String;JJLr6/a;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v0, v22

    const/16 v4, 0x24

    int-to-float v4, v4

    const/4 v5, 0x6

    .line 182
    invoke-static {v4, v1, v0, v5}, Landroidx/compose/material3/c;->s(FLandroidx/compose/ui/Modifier$Companion;Landroidx/compose/runtime/Composer;I)V

    .line 183
    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v17

    .line 184
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    move-result-wide v19

    shr-int/lit8 v1, v43, 0x12

    and-int/lit16 v1, v1, 0x1c00

    or-int/lit16 v1, v1, 0x1b6

    .line 185
    const-string v16, "\u5f00\u59cb\u7b5b\u9009"

    move-object/from16 v21, p29

    move/from16 v23, v1

    invoke-static/range {v16 .. v23}, Lcom/zykj/mistake/feature/collection/filter/i;->a(Ljava/lang/String;JJLr6/a;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v19, v22

    .line 186
    invoke-static/range {v19 .. v19}, Landroidx/collection/a;->D(Landroidx/compose/runtime/Composer;)Z

    move-result v0

    if-eqz v0, :cond_6d

    .line 187
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_43

    :cond_6c
    move-object/from16 v9, p8

    move/from16 v13, p10

    move-object/from16 v14, p26

    move-object/from16 v8, p27

    move-object/from16 v19, v2

    .line 188
    invoke-interface/range {v19 .. v19}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 189
    :cond_6d
    :goto_43
    invoke-interface/range {v19 .. v19}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_6e

    move-object v1, v0

    new-instance v0, Lcom/zykj/mistake/feature/collection/filter/g;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v16, p15

    move/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v24, p23

    move-object/from16 v25, p24

    move-object/from16 v26, p25

    move-object/from16 v29, p28

    move-object/from16 v30, p29

    move/from16 v31, p31

    move/from16 v32, p32

    move/from16 v33, p33

    move-object/from16 v47, v1

    move-object/from16 v28, v8

    move-object/from16 v23, v10

    move-object/from16 v22, v11

    move-object/from16 v21, v12

    move v11, v13

    move-object/from16 v27, v14

    move-object/from16 v20, v15

    move/from16 v1, p0

    move-object/from16 v8, p7

    move-object/from16 v10, p9

    move/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move/from16 v15, p14

    invoke-direct/range {v0 .. v33}, Lcom/zykj/mistake/feature/collection/filter/g;-><init>(ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IZLjava/util/Set;Landroidx/compose/ui/Modifier;ZZILr6/c;Lr6/a;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/a;Lr6/a;Lr6/c;Lr6/a;Lr6/a;III)V

    move-object/from16 v1, v47

    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    :cond_6e
    return-void
.end method

.method public static final e(Ljava/util/List;Ljava/lang/Integer;Lr6/c;)Ljava/util/ArrayList;
    .locals 11

    .line 1
    const-string v0, "\u5168\u90e8"

    .line 2
    .line 3
    const-string v1, "\u672a\u6253\u6807\u7b7e"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lkotlin/collections/u;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0, p0}, Lkotlin/collections/t;->t0(Ljava/util/Collection;Ljava/util/List;)Ljava/util/ArrayList;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    new-instance v0, Ljava/util/ArrayList;

    .line 18
    .line 19
    const/16 v1, 0xa

    .line 20
    .line 21
    invoke-static {p0, v1}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    const/4 v2, 0x0

    .line 33
    move v3, v2

    .line 34
    move v4, v3

    .line 35
    :goto_0
    if-ge v4, v1, :cond_3

    .line 36
    .line 37
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    add-int/lit8 v4, v4, 0x1

    .line 42
    .line 43
    add-int/lit8 v6, v3, 0x1

    .line 44
    .line 45
    const/4 v7, 0x0

    .line 46
    if-ltz v3, :cond_2

    .line 47
    .line 48
    check-cast v5, Ljava/lang/String;

    .line 49
    .line 50
    if-eqz v3, :cond_1

    .line 51
    .line 52
    const/4 v7, 0x1

    .line 53
    if-eq v3, v7, :cond_0

    .line 54
    .line 55
    add-int/lit8 v3, v3, -0x1

    .line 56
    .line 57
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    goto :goto_1

    .line 62
    :cond_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    :cond_1
    :goto_1
    new-instance v3, Lcom/zykj/mistake/feature/collection/filter/c;

    .line 67
    .line 68
    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v8

    .line 72
    new-instance v9, Landroidx/navigation/e;

    .line 73
    .line 74
    const/4 v10, 0x6

    .line 75
    invoke-direct {v9, v10, p2, v7}, Landroidx/navigation/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    const/16 v7, 0xc

    .line 79
    .line 80
    invoke-direct {v3, v7, v5, v9, v8}, Lcom/zykj/mistake/feature/collection/filter/c;-><init>(ILjava/lang/String;Lr6/a;Z)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move v3, v6

    .line 87
    goto :goto_0

    .line 88
    :cond_2
    invoke-static {}, Lkotlin/collections/u;->L()V

    .line 89
    .line 90
    .line 91
    throw v7

    .line 92
    :cond_3
    return-object v0
.end method
