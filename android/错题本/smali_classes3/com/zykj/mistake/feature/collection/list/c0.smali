.class public abstract Lcom/zykj/mistake/feature/collection/list/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 11

    .line 1
    const v0, 0x9cb124b

    .line 2
    .line 3
    .line 4
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 5
    .line 6
    .line 7
    move-result-object v8

    .line 8
    and-int/lit8 p2, p3, 0x6

    .line 9
    .line 10
    if-nez p2, :cond_1

    .line 11
    .line 12
    invoke-interface {v8, p0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    const/4 p2, 0x4

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p2, 0x2

    .line 21
    :goto_0
    or-int/2addr p2, p3

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move p2, p3

    .line 24
    :goto_1
    or-int/lit8 p2, p2, 0x30

    .line 25
    .line 26
    and-int/lit8 v1, p2, 0x13

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    const/16 v3, 0x12

    .line 30
    .line 31
    if-eq v1, v3, :cond_2

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    goto :goto_2

    .line 35
    :cond_2
    move v1, v2

    .line 36
    :goto_2
    and-int/lit8 v4, p2, 0x1

    .line 37
    .line 38
    invoke-interface {v8, v1, v4}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_6

    .line 43
    .line 44
    sget-object p1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 45
    .line 46
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_3

    .line 51
    .line 52
    const/4 v1, -0x1

    .line 53
    const-string v4, "com.zykj.mistake.feature.collection.list.CollectionSelectionIndicator (MistakeCollectionScreen.kt:324)"

    .line 54
    .line 55
    invoke-static {v0, p2, v1, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :cond_3
    if-eqz p0, :cond_4

    .line 59
    .line 60
    sget p2, Lcom/zykj/mistake/R$drawable;->ic_mistake_selected:I

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_4
    sget p2, Lcom/zykj/mistake/R$drawable;->ic_mistake_unselected:I

    .line 64
    .line 65
    :goto_3
    invoke-static {p2, v8, v2}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    if-eqz p0, :cond_5

    .line 70
    .line 71
    const-string p2, "\u5df2\u9009\u62e9"

    .line 72
    .line 73
    :goto_4
    move-object v2, p2

    .line 74
    goto :goto_5

    .line 75
    :cond_5
    const-string p2, "\u672a\u9009\u62e9"

    .line 76
    .line 77
    goto :goto_4

    .line 78
    :goto_5
    int-to-float p2, v3

    .line 79
    invoke-static {p2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    invoke-static {p1, p2}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    const/4 v9, 0x0

    .line 88
    const/16 v10, 0x78

    .line 89
    .line 90
    const/4 v4, 0x0

    .line 91
    const/4 v5, 0x0

    .line 92
    const/4 v6, 0x0

    .line 93
    const/4 v7, 0x0

    .line 94
    invoke-static/range {v1 .. v10}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 95
    .line 96
    .line 97
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 98
    .line 99
    .line 100
    move-result p2

    .line 101
    if-eqz p2, :cond_7

    .line 102
    .line 103
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 104
    .line 105
    .line 106
    goto :goto_6

    .line 107
    :cond_6
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 108
    .line 109
    .line 110
    :cond_7
    :goto_6
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    if-eqz p2, :cond_8

    .line 115
    .line 116
    new-instance v0, Lcom/zykj/mistake/feature/ask/i0;

    .line 117
    .line 118
    const/4 v1, 0x1

    .line 119
    invoke-direct {v0, p0, p1, p3, v1}, Lcom/zykj/mistake/feature/ask/i0;-><init>(ZLandroidx/compose/ui/Modifier;II)V

    .line 120
    .line 121
    .line 122
    invoke-interface {p2, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 123
    .line 124
    .line 125
    :cond_8
    return-void
.end method

.method public static final b(Lcom/zykj/mistake/feature/collection/list/b;ZZLr6/a;Lr6/a;Landroidx/compose/runtime/Composer;I)V
    .locals 40

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
    move/from16 v6, p6

    .line 8
    .line 9
    const v0, -0x1262d857

    .line 10
    .line 11
    .line 12
    move-object/from16 v4, p5

    .line 13
    .line 14
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    and-int/lit8 v5, v6, 0x6

    .line 19
    .line 20
    const/4 v7, 0x4

    .line 21
    if-nez v5, :cond_1

    .line 22
    .line 23
    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-eqz v5, :cond_0

    .line 28
    .line 29
    move v5, v7

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v5, 0x2

    .line 32
    :goto_0
    or-int/2addr v5, v6

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v5, v6

    .line 35
    :goto_1
    and-int/lit8 v9, v6, 0x30

    .line 36
    .line 37
    const/16 v10, 0x10

    .line 38
    .line 39
    if-nez v9, :cond_3

    .line 40
    .line 41
    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->changed(Z)Z

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
    move v9, v10

    .line 51
    :goto_2
    or-int/2addr v5, v9

    .line 52
    :cond_3
    and-int/lit16 v9, v6, 0x180

    .line 53
    .line 54
    if-nez v9, :cond_5

    .line 55
    .line 56
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 57
    .line 58
    .line 59
    move-result v9

    .line 60
    if-eqz v9, :cond_4

    .line 61
    .line 62
    const/16 v9, 0x100

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_4
    const/16 v9, 0x80

    .line 66
    .line 67
    :goto_3
    or-int/2addr v5, v9

    .line 68
    :cond_5
    and-int/lit16 v9, v6, 0xc00

    .line 69
    .line 70
    if-nez v9, :cond_7

    .line 71
    .line 72
    move-object/from16 v9, p3

    .line 73
    .line 74
    invoke-interface {v4, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v11

    .line 78
    if-eqz v11, :cond_6

    .line 79
    .line 80
    const/16 v11, 0x800

    .line 81
    .line 82
    goto :goto_4

    .line 83
    :cond_6
    const/16 v11, 0x400

    .line 84
    .line 85
    :goto_4
    or-int/2addr v5, v11

    .line 86
    goto :goto_5

    .line 87
    :cond_7
    move-object/from16 v9, p3

    .line 88
    .line 89
    :goto_5
    and-int/lit16 v11, v6, 0x6000

    .line 90
    .line 91
    if-nez v11, :cond_9

    .line 92
    .line 93
    move-object/from16 v11, p4

    .line 94
    .line 95
    invoke-interface {v4, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v12

    .line 99
    if-eqz v12, :cond_8

    .line 100
    .line 101
    const/16 v12, 0x4000

    .line 102
    .line 103
    goto :goto_6

    .line 104
    :cond_8
    const/16 v12, 0x2000

    .line 105
    .line 106
    :goto_6
    or-int/2addr v5, v12

    .line 107
    goto :goto_7

    .line 108
    :cond_9
    move-object/from16 v11, p4

    .line 109
    .line 110
    :goto_7
    and-int/lit16 v12, v5, 0x2493

    .line 111
    .line 112
    const/16 v13, 0x2492

    .line 113
    .line 114
    const/4 v14, 0x1

    .line 115
    const/4 v15, 0x0

    .line 116
    if-eq v12, v13, :cond_a

    .line 117
    .line 118
    move v12, v14

    .line 119
    goto :goto_8

    .line 120
    :cond_a
    move v12, v15

    .line 121
    :goto_8
    and-int/lit8 v13, v5, 0x1

    .line 122
    .line 123
    invoke-interface {v4, v12, v13}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 124
    .line 125
    .line 126
    move-result v12

    .line 127
    if-eqz v12, :cond_1b

    .line 128
    .line 129
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 130
    .line 131
    .line 132
    move-result v12

    .line 133
    if-eqz v12, :cond_b

    .line 134
    .line 135
    const/4 v12, -0x1

    .line 136
    const-string v13, "com.zykj.mistake.feature.collection.list.MistakeCollectionCard (MistakeCollectionScreen.kt:264)"

    .line 137
    .line 138
    invoke-static {v0, v5, v12, v13}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 139
    .line 140
    .line 141
    :cond_b
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 142
    .line 143
    const/4 v12, 0x0

    .line 144
    const/4 v13, 0x0

    .line 145
    invoke-static {v0, v12, v14, v13}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 146
    .line 147
    .line 148
    move-result-object v8

    .line 149
    sget-object v16, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 150
    .line 151
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 152
    .line 153
    .line 154
    move-result-wide v12

    .line 155
    int-to-float v7, v7

    .line 156
    invoke-static {v7, v8, v12, v13}, Landroidx/compose/material3/c;->f(FLandroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    .line 157
    .line 158
    .line 159
    move-result-object v8

    .line 160
    if-eqz v3, :cond_c

    .line 161
    .line 162
    int-to-float v12, v14

    .line 163
    :goto_9
    invoke-static {v12}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 164
    .line 165
    .line 166
    move-result v12

    .line 167
    goto :goto_a

    .line 168
    :cond_c
    int-to-float v12, v15

    .line 169
    goto :goto_9

    .line 170
    :goto_a
    if-eqz v3, :cond_d

    .line 171
    .line 172
    const-wide v19, 0xff1576ffL

    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    invoke-static/range {v19 .. v20}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 178
    .line 179
    .line 180
    move-result-wide v19

    .line 181
    :goto_b
    move-wide/from16 v14, v19

    .line 182
    .line 183
    goto :goto_c

    .line 184
    :cond_d
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/graphics/Color$Companion;->getTransparent-0d7_KjU()J

    .line 185
    .line 186
    .line 187
    move-result-wide v19

    .line 188
    goto :goto_b

    .line 189
    :goto_c
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 190
    .line 191
    .line 192
    move-result v7

    .line 193
    invoke-static {v7}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 194
    .line 195
    .line 196
    move-result-object v7

    .line 197
    invoke-static {v8, v12, v14, v15, v7}, Landroidx/compose/foundation/BorderKt;->border-xT4_qwU(Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 198
    .line 199
    .line 200
    move-result-object v7

    .line 201
    const/16 v20, 0x6f

    .line 202
    .line 203
    const/16 v21, 0x0

    .line 204
    .line 205
    const/4 v12, 0x0

    .line 206
    const/4 v8, 0x1

    .line 207
    const/4 v13, 0x0

    .line 208
    const/4 v14, 0x0

    .line 209
    const/4 v15, 0x0

    .line 210
    const/16 v19, 0x0

    .line 211
    .line 212
    const/16 v17, 0x0

    .line 213
    .line 214
    const/16 v22, 0x0

    .line 215
    .line 216
    const/16 v18, 0x0

    .line 217
    .line 218
    move-object/from16 v16, v11

    .line 219
    .line 220
    move-object v11, v7

    .line 221
    move/from16 v7, v19

    .line 222
    .line 223
    move-object/from16 v19, v9

    .line 224
    .line 225
    const/4 v9, 0x0

    .line 226
    invoke-static/range {v11 .. v21}, Landroidx/compose/foundation/ClickableKt;->combinedClickable-f5TDLPQ$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Ljava/lang/String;Lr6/a;Lr6/a;ZLr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 227
    .line 228
    .line 229
    move-result-object v11

    .line 230
    const/16 v12, 0x16

    .line 231
    .line 232
    int-to-float v12, v12

    .line 233
    invoke-static {v12}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 234
    .line 235
    .line 236
    move-result v12

    .line 237
    const/16 v13, 0x14

    .line 238
    .line 239
    int-to-float v14, v13

    .line 240
    invoke-static {v14}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 241
    .line 242
    .line 243
    move-result v15

    .line 244
    int-to-float v10, v10

    .line 245
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 246
    .line 247
    .line 248
    move-result v10

    .line 249
    invoke-static {v14}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 250
    .line 251
    .line 252
    move-result v14

    .line 253
    invoke-static {v11, v12, v15, v10, v14}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    .line 254
    .line 255
    .line 256
    move-result-object v10

    .line 257
    sget-object v32, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 258
    .line 259
    invoke-virtual/range {v32 .. v32}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 260
    .line 261
    .line 262
    move-result-object v11

    .line 263
    invoke-static {v11, v9}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 264
    .line 265
    .line 266
    move-result-object v11

    .line 267
    invoke-static {v4, v9}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 268
    .line 269
    .line 270
    move-result v12

    .line 271
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 272
    .line 273
    .line 274
    move-result-object v14

    .line 275
    invoke-static {v4, v10}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 276
    .line 277
    .line 278
    move-result-object v10

    .line 279
    sget-object v15, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 280
    .line 281
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 282
    .line 283
    .line 284
    move-result-object v7

    .line 285
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 286
    .line 287
    .line 288
    move-result-object v16

    .line 289
    if-nez v16, :cond_e

    .line 290
    .line 291
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 292
    .line 293
    .line 294
    :cond_e
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 295
    .line 296
    .line 297
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 298
    .line 299
    .line 300
    move-result v16

    .line 301
    if-eqz v16, :cond_f

    .line 302
    .line 303
    invoke-interface {v4, v7}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 304
    .line 305
    .line 306
    goto :goto_d

    .line 307
    :cond_f
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 308
    .line 309
    .line 310
    :goto_d
    invoke-static {v4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 311
    .line 312
    .line 313
    move-result-object v7

    .line 314
    invoke-static {v15, v7, v11, v7, v14}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 315
    .line 316
    .line 317
    move-result-object v11

    .line 318
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 319
    .line 320
    .line 321
    move-result v14

    .line 322
    if-nez v14, :cond_10

    .line 323
    .line 324
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v14

    .line 328
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 329
    .line 330
    .line 331
    move-result-object v8

    .line 332
    invoke-static {v14, v8}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    move-result v8

    .line 336
    if-nez v8, :cond_11

    .line 337
    .line 338
    :cond_10
    invoke-static {v12, v7, v12, v11}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 339
    .line 340
    .line 341
    :cond_11
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 342
    .line 343
    .line 344
    move-result-object v8

    .line 345
    invoke-static {v7, v10, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 346
    .line 347
    .line 348
    sget-object v7, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 349
    .line 350
    sget-object v33, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 351
    .line 352
    invoke-virtual/range {v33 .. v33}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 353
    .line 354
    .line 355
    move-result-object v7

    .line 356
    invoke-virtual/range {v32 .. v32}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 357
    .line 358
    .line 359
    move-result-object v8

    .line 360
    invoke-static {v7, v8, v4, v9}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 361
    .line 362
    .line 363
    move-result-object v7

    .line 364
    invoke-static {v4, v9}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 365
    .line 366
    .line 367
    move-result v8

    .line 368
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 369
    .line 370
    .line 371
    move-result-object v10

    .line 372
    invoke-static {v4, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 373
    .line 374
    .line 375
    move-result-object v11

    .line 376
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 377
    .line 378
    .line 379
    move-result-object v12

    .line 380
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 381
    .line 382
    .line 383
    move-result-object v14

    .line 384
    if-nez v14, :cond_12

    .line 385
    .line 386
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 387
    .line 388
    .line 389
    :cond_12
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 390
    .line 391
    .line 392
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 393
    .line 394
    .line 395
    move-result v14

    .line 396
    if-eqz v14, :cond_13

    .line 397
    .line 398
    invoke-interface {v4, v12}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 399
    .line 400
    .line 401
    goto :goto_e

    .line 402
    :cond_13
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 403
    .line 404
    .line 405
    :goto_e
    invoke-static {v4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 406
    .line 407
    .line 408
    move-result-object v12

    .line 409
    invoke-static {v15, v12, v7, v12, v10}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 410
    .line 411
    .line 412
    move-result-object v7

    .line 413
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 414
    .line 415
    .line 416
    move-result v10

    .line 417
    if-nez v10, :cond_14

    .line 418
    .line 419
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v10

    .line 423
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 424
    .line 425
    .line 426
    move-result-object v14

    .line 427
    invoke-static {v10, v14}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 428
    .line 429
    .line 430
    move-result v10

    .line 431
    if-nez v10, :cond_15

    .line 432
    .line 433
    :cond_14
    invoke-static {v8, v12, v8, v7}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 434
    .line 435
    .line 436
    :cond_15
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 437
    .line 438
    .line 439
    move-result-object v7

    .line 440
    invoke-static {v12, v11, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 441
    .line 442
    .line 443
    sget-object v7, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 444
    .line 445
    iget-object v7, v1, Lcom/zykj/mistake/feature/collection/list/b;->b:Ljava/lang/String;

    .line 446
    .line 447
    const-wide v10, 0xff15171aL

    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    invoke-static {v10, v11}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 453
    .line 454
    .line 455
    move-result-wide v10

    .line 456
    const/16 v8, 0xf

    .line 457
    .line 458
    invoke-static {v8}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 459
    .line 460
    .line 461
    move-result-wide v18

    .line 462
    invoke-static {v13}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 463
    .line 464
    .line 465
    move-result-wide v20

    .line 466
    sget-object v8, Landroidx/compose/ui/text/style/TextOverflow;->Companion:Landroidx/compose/ui/text/style/TextOverflow$Companion;

    .line 467
    .line 468
    invoke-virtual {v8}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getEllipsis-gIe3tQ8()I

    .line 469
    .line 470
    .line 471
    move-result v8

    .line 472
    const/16 v30, 0x6c36

    .line 473
    .line 474
    const v31, 0x193f2

    .line 475
    .line 476
    .line 477
    move-object/from16 v12, v22

    .line 478
    .line 479
    move/from16 v22, v8

    .line 480
    .line 481
    const/4 v8, 0x0

    .line 482
    const/4 v13, 0x0

    .line 483
    const/4 v14, 0x0

    .line 484
    move-object/from16 v23, v15

    .line 485
    .line 486
    const/4 v15, 0x0

    .line 487
    const/16 v24, 0x0

    .line 488
    .line 489
    const/16 v25, 0x1

    .line 490
    .line 491
    const-wide/16 v16, 0x0

    .line 492
    .line 493
    move/from16 v26, v9

    .line 494
    .line 495
    move-wide v9, v10

    .line 496
    move-wide/from16 v38, v18

    .line 497
    .line 498
    move-object/from16 v19, v12

    .line 499
    .line 500
    move-wide/from16 v11, v38

    .line 501
    .line 502
    const/16 v18, 0x0

    .line 503
    .line 504
    move-object/from16 v27, v19

    .line 505
    .line 506
    const/16 v19, 0x0

    .line 507
    .line 508
    move-object/from16 v28, v23

    .line 509
    .line 510
    const/16 v23, 0x0

    .line 511
    .line 512
    move/from16 v29, v24

    .line 513
    .line 514
    const/16 v24, 0x2

    .line 515
    .line 516
    move/from16 v34, v25

    .line 517
    .line 518
    const/16 v25, 0x2

    .line 519
    .line 520
    move/from16 v35, v26

    .line 521
    .line 522
    const/16 v26, 0x0

    .line 523
    .line 524
    move-object/from16 v36, v27

    .line 525
    .line 526
    const/16 v27, 0x0

    .line 527
    .line 528
    move/from16 v37, v29

    .line 529
    .line 530
    const/16 v29, 0xd80

    .line 531
    .line 532
    move-object/from16 v2, v28

    .line 533
    .line 534
    move-object/from16 v28, v4

    .line 535
    .line 536
    move-object v4, v2

    .line 537
    move/from16 v6, v34

    .line 538
    .line 539
    move/from16 v2, v37

    .line 540
    .line 541
    move/from16 v34, v5

    .line 542
    .line 543
    move-object/from16 v5, v36

    .line 544
    .line 545
    invoke-static/range {v7 .. v31}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 546
    .line 547
    .line 548
    move-object/from16 v7, v28

    .line 549
    .line 550
    const/16 v8, 0x8

    .line 551
    .line 552
    int-to-float v8, v8

    .line 553
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 554
    .line 555
    .line 556
    move-result v8

    .line 557
    invoke-static {v0, v8}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 558
    .line 559
    .line 560
    move-result-object v8

    .line 561
    const/4 v9, 0x6

    .line 562
    invoke-static {v8, v7, v9}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 563
    .line 564
    .line 565
    invoke-static {v0, v2, v6, v5}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 566
    .line 567
    .line 568
    move-result-object v2

    .line 569
    invoke-virtual/range {v32 .. v32}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 570
    .line 571
    .line 572
    move-result-object v6

    .line 573
    invoke-virtual/range {v33 .. v33}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 574
    .line 575
    .line 576
    move-result-object v8

    .line 577
    const/16 v10, 0x30

    .line 578
    .line 579
    invoke-static {v8, v6, v7, v10}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 580
    .line 581
    .line 582
    move-result-object v6

    .line 583
    const/4 v8, 0x0

    .line 584
    invoke-static {v7, v8}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 585
    .line 586
    .line 587
    move-result v10

    .line 588
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 589
    .line 590
    .line 591
    move-result-object v11

    .line 592
    invoke-static {v7, v2}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 593
    .line 594
    .line 595
    move-result-object v2

    .line 596
    invoke-virtual {v4}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 597
    .line 598
    .line 599
    move-result-object v12

    .line 600
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 601
    .line 602
    .line 603
    move-result-object v13

    .line 604
    if-nez v13, :cond_16

    .line 605
    .line 606
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 607
    .line 608
    .line 609
    :cond_16
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 610
    .line 611
    .line 612
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 613
    .line 614
    .line 615
    move-result v13

    .line 616
    if-eqz v13, :cond_17

    .line 617
    .line 618
    invoke-interface {v7, v12}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 619
    .line 620
    .line 621
    goto :goto_f

    .line 622
    :cond_17
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 623
    .line 624
    .line 625
    :goto_f
    invoke-static {v7}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 626
    .line 627
    .line 628
    move-result-object v12

    .line 629
    invoke-static {v4, v12, v6, v12, v11}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 630
    .line 631
    .line 632
    move-result-object v6

    .line 633
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 634
    .line 635
    .line 636
    move-result v11

    .line 637
    if-nez v11, :cond_18

    .line 638
    .line 639
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    move-result-object v11

    .line 643
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 644
    .line 645
    .line 646
    move-result-object v13

    .line 647
    invoke-static {v11, v13}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 648
    .line 649
    .line 650
    move-result v11

    .line 651
    if-nez v11, :cond_19

    .line 652
    .line 653
    :cond_18
    invoke-static {v10, v12, v10, v6}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 654
    .line 655
    .line 656
    :cond_19
    invoke-virtual {v4}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 657
    .line 658
    .line 659
    move-result-object v4

    .line 660
    invoke-static {v12, v2, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 661
    .line 662
    .line 663
    sget-object v2, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 664
    .line 665
    iget v4, v1, Lcom/zykj/mistake/feature/collection/list/b;->c:I

    .line 666
    .line 667
    const-string v6, "\u5df2\u6709\u9519\u9898\u6570\uff1a"

    .line 668
    .line 669
    invoke-static {v4, v6}, Landroid/support/v4/media/f;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 670
    .line 671
    .line 672
    move-result-object v4

    .line 673
    const-wide v10, 0xff666666L

    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    invoke-static {v10, v11}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 679
    .line 680
    .line 681
    move-result-wide v10

    .line 682
    const/16 v6, 0xa

    .line 683
    .line 684
    move v13, v9

    .line 685
    move-wide v9, v10

    .line 686
    invoke-static {v6}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 687
    .line 688
    .line 689
    move-result-wide v11

    .line 690
    const-wide v14, 0xfff5f5f5L

    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    invoke-static {v14, v15}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 696
    .line 697
    .line 698
    move-result-wide v14

    .line 699
    const/4 v8, 0x3

    .line 700
    int-to-float v8, v8

    .line 701
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 702
    .line 703
    .line 704
    move-result v8

    .line 705
    invoke-static {v8}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 706
    .line 707
    .line 708
    move-result-object v8

    .line 709
    invoke-static {v0, v14, v15, v8}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 710
    .line 711
    .line 712
    move-result-object v8

    .line 713
    int-to-float v14, v6

    .line 714
    invoke-static {v14}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 715
    .line 716
    .line 717
    move-result v14

    .line 718
    const/4 v15, 0x2

    .line 719
    int-to-float v15, v15

    .line 720
    invoke-static {v15}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 721
    .line 722
    .line 723
    move-result v15

    .line 724
    invoke-static {v8, v14, v15}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 725
    .line 726
    .line 727
    move-result-object v8

    .line 728
    const/16 v30, 0xc00

    .line 729
    .line 730
    const v31, 0x1dff0

    .line 731
    .line 732
    .line 733
    move v14, v13

    .line 734
    const/4 v13, 0x0

    .line 735
    move v15, v14

    .line 736
    const/4 v14, 0x0

    .line 737
    move/from16 v17, v15

    .line 738
    .line 739
    const/4 v15, 0x0

    .line 740
    move/from16 v18, v17

    .line 741
    .line 742
    const/16 v26, 0x0

    .line 743
    .line 744
    const-wide/16 v16, 0x0

    .line 745
    .line 746
    move/from16 v19, v18

    .line 747
    .line 748
    const/16 v18, 0x0

    .line 749
    .line 750
    move/from16 v20, v19

    .line 751
    .line 752
    const/16 v19, 0x0

    .line 753
    .line 754
    move/from16 v22, v20

    .line 755
    .line 756
    const-wide/16 v20, 0x0

    .line 757
    .line 758
    move/from16 v23, v22

    .line 759
    .line 760
    const/16 v22, 0x0

    .line 761
    .line 762
    move/from16 v24, v23

    .line 763
    .line 764
    const/16 v23, 0x0

    .line 765
    .line 766
    move/from16 v25, v24

    .line 767
    .line 768
    const/16 v24, 0x1

    .line 769
    .line 770
    move/from16 v27, v25

    .line 771
    .line 772
    const/16 v25, 0x0

    .line 773
    .line 774
    move/from16 v35, v26

    .line 775
    .line 776
    const/16 v26, 0x0

    .line 777
    .line 778
    move/from16 v28, v27

    .line 779
    .line 780
    const/16 v27, 0x0

    .line 781
    .line 782
    const/16 v29, 0xd80

    .line 783
    .line 784
    move/from16 v32, v28

    .line 785
    .line 786
    move-object/from16 v28, v7

    .line 787
    .line 788
    move-object v7, v4

    .line 789
    move/from16 v4, v35

    .line 790
    .line 791
    invoke-static/range {v7 .. v31}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 792
    .line 793
    .line 794
    move-object/from16 v7, v28

    .line 795
    .line 796
    const/16 v20, 0x2

    .line 797
    .line 798
    const/16 v21, 0x0

    .line 799
    .line 800
    const/high16 v18, 0x3f800000    # 1.0f

    .line 801
    .line 802
    const/16 v19, 0x0

    .line 803
    .line 804
    move-object/from16 v17, v0

    .line 805
    .line 806
    move-object/from16 v16, v2

    .line 807
    .line 808
    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/RowScope;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 809
    .line 810
    .line 811
    move-result-object v0

    .line 812
    invoke-static {v0, v7, v4}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 813
    .line 814
    .line 815
    if-eqz p1, :cond_1a

    .line 816
    .line 817
    const v0, 0x1ee388be

    .line 818
    .line 819
    .line 820
    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 821
    .line 822
    .line 823
    shr-int/lit8 v0, v34, 0x6

    .line 824
    .line 825
    and-int/lit8 v0, v0, 0xe

    .line 826
    .line 827
    invoke-static {v3, v5, v7, v0}, Lcom/zykj/mistake/feature/collection/list/c0;->a(ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 828
    .line 829
    .line 830
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 831
    .line 832
    .line 833
    move-object/from16 v28, v7

    .line 834
    .line 835
    goto :goto_10

    .line 836
    :cond_1a
    const v0, 0x1ee5128a

    .line 837
    .line 838
    .line 839
    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 840
    .line 841
    .line 842
    move-object/from16 v28, v7

    .line 843
    .line 844
    iget-object v7, v1, Lcom/zykj/mistake/feature/collection/list/b;->d:Ljava/lang/String;

    .line 845
    .line 846
    const-wide v4, 0xffc2c2c2L

    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    invoke-static {v4, v5}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 852
    .line 853
    .line 854
    move-result-wide v9

    .line 855
    invoke-static {v6}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 856
    .line 857
    .line 858
    move-result-wide v11

    .line 859
    const/16 v30, 0xc00

    .line 860
    .line 861
    const v31, 0x1dff2

    .line 862
    .line 863
    .line 864
    const/4 v8, 0x0

    .line 865
    const/4 v13, 0x0

    .line 866
    const/4 v14, 0x0

    .line 867
    const/4 v15, 0x0

    .line 868
    const-wide/16 v16, 0x0

    .line 869
    .line 870
    const/16 v18, 0x0

    .line 871
    .line 872
    const/16 v19, 0x0

    .line 873
    .line 874
    const-wide/16 v20, 0x0

    .line 875
    .line 876
    const/16 v22, 0x0

    .line 877
    .line 878
    const/16 v23, 0x0

    .line 879
    .line 880
    const/16 v24, 0x1

    .line 881
    .line 882
    const/16 v25, 0x0

    .line 883
    .line 884
    const/16 v26, 0x0

    .line 885
    .line 886
    const/16 v27, 0x0

    .line 887
    .line 888
    const/16 v29, 0xd80

    .line 889
    .line 890
    invoke-static/range {v7 .. v31}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 891
    .line 892
    .line 893
    invoke-interface/range {v28 .. v28}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 894
    .line 895
    .line 896
    :goto_10
    invoke-interface/range {v28 .. v28}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 897
    .line 898
    .line 899
    invoke-interface/range {v28 .. v28}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 900
    .line 901
    .line 902
    invoke-interface/range {v28 .. v28}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 903
    .line 904
    .line 905
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 906
    .line 907
    .line 908
    move-result v0

    .line 909
    if-eqz v0, :cond_1c

    .line 910
    .line 911
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 912
    .line 913
    .line 914
    goto :goto_11

    .line 915
    :cond_1b
    move-object/from16 v28, v4

    .line 916
    .line 917
    invoke-interface/range {v28 .. v28}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 918
    .line 919
    .line 920
    :cond_1c
    :goto_11
    invoke-interface/range {v28 .. v28}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 921
    .line 922
    .line 923
    move-result-object v8

    .line 924
    if-eqz v8, :cond_1d

    .line 925
    .line 926
    new-instance v0, Lcom/zykj/mistake/feature/collection/list/w;

    .line 927
    .line 928
    const/4 v7, 0x0

    .line 929
    move/from16 v2, p1

    .line 930
    .line 931
    move-object/from16 v4, p3

    .line 932
    .line 933
    move-object/from16 v5, p4

    .line 934
    .line 935
    move/from16 v6, p6

    .line 936
    .line 937
    invoke-direct/range {v0 .. v7}, Lcom/zykj/mistake/feature/collection/list/w;-><init>(Ljava/lang/Object;ZZLr6/a;Lr6/a;II)V

    .line 938
    .line 939
    .line 940
    invoke-interface {v8, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 941
    .line 942
    .line 943
    :cond_1d
    return-void
.end method

.method public static final c(Lr6/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 34

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
    const v0, 0x34e7cf50

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p2

    .line 11
    .line 12
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v9

    .line 16
    and-int/lit8 v1, v8, 0x6

    .line 17
    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    invoke-interface {v9, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    const/4 v1, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v1, 0x2

    .line 29
    :goto_0
    or-int/2addr v1, v8

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v1, v8

    .line 32
    :goto_1
    and-int/lit8 v2, v8, 0x30

    .line 33
    .line 34
    if-nez v2, :cond_3

    .line 35
    .line 36
    invoke-interface {v9, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    const/16 v2, 0x20

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    const/16 v2, 0x10

    .line 46
    .line 47
    :goto_2
    or-int/2addr v1, v2

    .line 48
    :cond_3
    and-int/lit8 v2, v1, 0x13

    .line 49
    .line 50
    const/16 v10, 0x12

    .line 51
    .line 52
    const/4 v3, 0x1

    .line 53
    const/4 v11, 0x0

    .line 54
    if-eq v2, v10, :cond_4

    .line 55
    .line 56
    move v2, v3

    .line 57
    goto :goto_3

    .line 58
    :cond_4
    move v2, v11

    .line 59
    :goto_3
    and-int/lit8 v5, v1, 0x1

    .line 60
    .line 61
    invoke-interface {v9, v2, v5}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_e

    .line 66
    .line 67
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_5

    .line 72
    .line 73
    const/4 v2, -0x1

    .line 74
    const-string v5, "com.zykj.mistake.feature.collection.list.MistakeCollectionEmptyContent (MistakeCollectionScreen.kt:342)"

    .line 75
    .line 76
    invoke-static {v0, v1, v2, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :cond_5
    const/4 v0, 0x0

    .line 80
    const/4 v1, 0x0

    .line 81
    invoke-static {v7, v0, v3, v1}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    sget-object v12, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 86
    .line 87
    invoke-virtual {v12}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-static {v1, v11}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-static {v9, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    invoke-static {v9, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    sget-object v13, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 108
    .line 109
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    if-nez v6, :cond_6

    .line 118
    .line 119
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 120
    .line 121
    .line 122
    :cond_6
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 123
    .line 124
    .line 125
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 126
    .line 127
    .line 128
    move-result v6

    .line 129
    if-eqz v6, :cond_7

    .line 130
    .line 131
    invoke-interface {v9, v5}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 132
    .line 133
    .line 134
    goto :goto_4

    .line 135
    :cond_7
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 136
    .line 137
    .line 138
    :goto_4
    invoke-static {v9}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    invoke-static {v13, v5, v1, v5, v3}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    if-nez v3, :cond_8

    .line 151
    .line 152
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    if-nez v3, :cond_9

    .line 165
    .line 166
    :cond_8
    invoke-static {v2, v5, v2, v1}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 167
    .line 168
    .line 169
    :cond_9
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-static {v5, v0, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 174
    .line 175
    .line 176
    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 177
    .line 178
    sget-object v14, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 179
    .line 180
    const/4 v5, 0x7

    .line 181
    const/4 v6, 0x0

    .line 182
    const/4 v1, 0x0

    .line 183
    const/4 v2, 0x0

    .line 184
    const/4 v3, 0x0

    .line 185
    move-object v0, v14

    .line 186
    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    invoke-virtual {v12}, Landroidx/compose/ui/Alignment$Companion;->getCenterHorizontally()Landroidx/compose/ui/Alignment$Horizontal;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    sget-object v3, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 195
    .line 196
    invoke-virtual {v3}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    const/16 v5, 0x30

    .line 201
    .line 202
    invoke-static {v3, v2, v9, v5}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    invoke-static {v9, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 207
    .line 208
    .line 209
    move-result v3

    .line 210
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 211
    .line 212
    .line 213
    move-result-object v5

    .line 214
    invoke-static {v9, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 219
    .line 220
    .line 221
    move-result-object v6

    .line 222
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 223
    .line 224
    .line 225
    move-result-object v12

    .line 226
    if-nez v12, :cond_a

    .line 227
    .line 228
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 229
    .line 230
    .line 231
    :cond_a
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 232
    .line 233
    .line 234
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 235
    .line 236
    .line 237
    move-result v12

    .line 238
    if-eqz v12, :cond_b

    .line 239
    .line 240
    invoke-interface {v9, v6}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 241
    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_b
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 245
    .line 246
    .line 247
    :goto_5
    invoke-static {v9}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 248
    .line 249
    .line 250
    move-result-object v6

    .line 251
    invoke-static {v13, v6, v2, v6, v5}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 256
    .line 257
    .line 258
    move-result v5

    .line 259
    if-nez v5, :cond_c

    .line 260
    .line 261
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v5

    .line 265
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 266
    .line 267
    .line 268
    move-result-object v12

    .line 269
    invoke-static {v5, v12}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v5

    .line 273
    if-nez v5, :cond_d

    .line 274
    .line 275
    :cond_c
    invoke-static {v3, v6, v3, v2}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 276
    .line 277
    .line 278
    :cond_d
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    invoke-static {v6, v1, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 283
    .line 284
    .line 285
    sget-object v1, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 286
    .line 287
    sget v1, Lcom/zykj/mistake/R$drawable;->ic_no_data:I

    .line 288
    .line 289
    invoke-static {v1, v9, v11}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    const/16 v2, 0x64

    .line 294
    .line 295
    int-to-float v2, v2

    .line 296
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 297
    .line 298
    .line 299
    move-result v2

    .line 300
    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 301
    .line 302
    .line 303
    move-result-object v2

    .line 304
    const/16 v17, 0x1b0

    .line 305
    .line 306
    const/16 v18, 0x78

    .line 307
    .line 308
    move v3, v10

    .line 309
    const-string v10, "\u6682\u65e0\u9519\u9898\u96c6"

    .line 310
    .line 311
    const/4 v12, 0x0

    .line 312
    const/4 v13, 0x0

    .line 313
    const/4 v14, 0x0

    .line 314
    const/4 v15, 0x0

    .line 315
    move-object/from16 v16, v9

    .line 316
    .line 317
    move-object v9, v1

    .line 318
    move v1, v11

    .line 319
    move-object v11, v2

    .line 320
    invoke-static/range {v9 .. v18}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 321
    .line 322
    .line 323
    move-object/from16 v30, v16

    .line 324
    .line 325
    const-wide v5, 0xff1576ffL

    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    invoke-static {v5, v6}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 331
    .line 332
    .line 333
    move-result-wide v11

    .line 334
    const/16 v2, 0xf

    .line 335
    .line 336
    invoke-static {v2}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 337
    .line 338
    .line 339
    move-result-wide v5

    .line 340
    int-to-float v2, v3

    .line 341
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 342
    .line 343
    .line 344
    move-result v16

    .line 345
    const/16 v19, 0xd

    .line 346
    .line 347
    const/16 v20, 0x0

    .line 348
    .line 349
    const/4 v15, 0x0

    .line 350
    const/16 v17, 0x0

    .line 351
    .line 352
    const/16 v18, 0x0

    .line 353
    .line 354
    move-object v14, v0

    .line 355
    invoke-static/range {v14 .. v20}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 356
    .line 357
    .line 358
    move-result-object v10

    .line 359
    const/16 v32, 0x0

    .line 360
    .line 361
    const v33, 0x1fff0

    .line 362
    .line 363
    .line 364
    const-string v9, "\u70b9\u51fb\u65b0\u589e"

    .line 365
    .line 366
    const/4 v15, 0x0

    .line 367
    const/16 v16, 0x0

    .line 368
    .line 369
    const/16 v17, 0x0

    .line 370
    .line 371
    const-wide/16 v18, 0x0

    .line 372
    .line 373
    const/16 v21, 0x0

    .line 374
    .line 375
    const-wide/16 v22, 0x0

    .line 376
    .line 377
    const/16 v24, 0x0

    .line 378
    .line 379
    const/16 v25, 0x0

    .line 380
    .line 381
    const/16 v26, 0x0

    .line 382
    .line 383
    const/16 v27, 0x0

    .line 384
    .line 385
    const/16 v28, 0x0

    .line 386
    .line 387
    const/16 v29, 0x0

    .line 388
    .line 389
    const/16 v31, 0xdb6

    .line 390
    .line 391
    move-wide v13, v5

    .line 392
    invoke-static/range {v9 .. v33}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 393
    .line 394
    .line 395
    const-wide v5, 0xff666666L

    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    invoke-static {v5, v6}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 401
    .line 402
    .line 403
    move-result-wide v11

    .line 404
    const/16 v3, 0xc

    .line 405
    .line 406
    invoke-static {v3}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 407
    .line 408
    .line 409
    move-result-wide v5

    .line 410
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 411
    .line 412
    .line 413
    move-result v16

    .line 414
    const/16 v19, 0xd

    .line 415
    .line 416
    const/4 v15, 0x0

    .line 417
    const/16 v17, 0x0

    .line 418
    .line 419
    const/16 v18, 0x0

    .line 420
    .line 421
    move-object v14, v0

    .line 422
    invoke-static/range {v14 .. v20}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 423
    .line 424
    .line 425
    move-result-object v10

    .line 426
    const-string v9, "\u5f53\u524d\u65e0\u4efb\u4f55\u9519\u9898\u96c6"

    .line 427
    .line 428
    const/4 v15, 0x0

    .line 429
    const/16 v16, 0x0

    .line 430
    .line 431
    const/16 v17, 0x0

    .line 432
    .line 433
    const-wide/16 v18, 0x0

    .line 434
    .line 435
    move-wide v13, v5

    .line 436
    invoke-static/range {v9 .. v33}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 437
    .line 438
    .line 439
    invoke-static/range {v30 .. v30}, Landroidx/collection/a;->D(Landroidx/compose/runtime/Composer;)Z

    .line 440
    .line 441
    .line 442
    move-result v0

    .line 443
    if-eqz v0, :cond_f

    .line 444
    .line 445
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 446
    .line 447
    .line 448
    goto :goto_6

    .line 449
    :cond_e
    move-object/from16 v30, v9

    .line 450
    .line 451
    move v1, v11

    .line 452
    invoke-interface/range {v30 .. v30}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 453
    .line 454
    .line 455
    :cond_f
    :goto_6
    invoke-interface/range {v30 .. v30}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    if-eqz v0, :cond_10

    .line 460
    .line 461
    new-instance v2, Lcom/zykj/mistake/feature/collection/list/z;

    .line 462
    .line 463
    invoke-direct {v2, v4, v7, v8, v1}, Lcom/zykj/mistake/feature/collection/list/z;-><init>(Lr6/a;Landroidx/compose/ui/Modifier;II)V

    .line 464
    .line 465
    .line 466
    invoke-interface {v0, v2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 467
    .line 468
    .line 469
    :cond_10
    return-void
.end method

.method public static final d(Lcom/zykj/mistake/feature/collection/list/v;Lr6/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v6, p2

    .line 6
    .line 7
    move/from16 v7, p4

    .line 8
    .line 9
    const v0, 0x319ab277

    .line 10
    .line 11
    .line 12
    move-object/from16 v3, p3

    .line 13
    .line 14
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 15
    .line 16
    .line 17
    move-result-object v15

    .line 18
    and-int/lit8 v3, v7, 0x6

    .line 19
    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    const/4 v3, 0x4

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v3, 0x2

    .line 31
    :goto_0
    or-int/2addr v3, v7

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v3, v7

    .line 34
    :goto_1
    and-int/lit8 v4, v7, 0x30

    .line 35
    .line 36
    const/16 v5, 0x20

    .line 37
    .line 38
    if-nez v4, :cond_3

    .line 39
    .line 40
    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eqz v4, :cond_2

    .line 45
    .line 46
    move v4, v5

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/16 v4, 0x10

    .line 49
    .line 50
    :goto_2
    or-int/2addr v3, v4

    .line 51
    :cond_3
    and-int/lit16 v4, v7, 0x180

    .line 52
    .line 53
    if-nez v4, :cond_5

    .line 54
    .line 55
    invoke-interface {v15, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v4, :cond_4

    .line 60
    .line 61
    const/16 v4, 0x100

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_4
    const/16 v4, 0x80

    .line 65
    .line 66
    :goto_3
    or-int/2addr v3, v4

    .line 67
    :cond_5
    and-int/lit16 v4, v3, 0x93

    .line 68
    .line 69
    const/16 v8, 0x92

    .line 70
    .line 71
    const/4 v9, 0x0

    .line 72
    const/4 v10, 0x1

    .line 73
    if-eq v4, v8, :cond_6

    .line 74
    .line 75
    move v4, v10

    .line 76
    goto :goto_4

    .line 77
    :cond_6
    move v4, v9

    .line 78
    :goto_4
    and-int/lit8 v8, v3, 0x1

    .line 79
    .line 80
    invoke-interface {v15, v4, v8}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-eqz v4, :cond_e

    .line 85
    .line 86
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-eqz v4, :cond_7

    .line 91
    .line 92
    const/4 v4, -0x1

    .line 93
    const-string v8, "com.zykj.mistake.feature.collection.list.MistakeCollectionListContent (MistakeCollectionScreen.kt:207)"

    .line 94
    .line 95
    invoke-static {v0, v3, v4, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 96
    .line 97
    .line 98
    :cond_7
    const/4 v0, 0x3

    .line 99
    invoke-static {v9, v9, v15, v9, v0}, Landroidx/compose/foundation/lazy/grid/LazyGridStateKt;->rememberLazyGridState(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/grid/LazyGridState;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    and-int/lit8 v3, v3, 0x70

    .line 104
    .line 105
    if-ne v3, v5, :cond_8

    .line 106
    .line 107
    move v4, v10

    .line 108
    goto :goto_5

    .line 109
    :cond_8
    move v4, v9

    .line 110
    :goto_5
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    if-nez v4, :cond_9

    .line 115
    .line 116
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 117
    .line 118
    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    if-ne v8, v4, :cond_a

    .line 123
    .line 124
    :cond_9
    new-instance v8, Lcom/zykj/mistake/feature/collection/detail/a1;

    .line 125
    .line 126
    const/16 v4, 0x14

    .line 127
    .line 128
    invoke-direct {v8, v2, v4}, Lcom/zykj/mistake/feature/collection/detail/a1;-><init>(Lr6/c;I)V

    .line 129
    .line 130
    .line 131
    invoke-interface {v15, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    :cond_a
    check-cast v8, Lr6/c;

    .line 135
    .line 136
    invoke-static {v15, v8}, Lcom/zykj/mistake/utils/e;->d(Landroidx/compose/runtime/Composer;Lr6/c;)Lr6/c;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    iget-boolean v8, v1, Lcom/zykj/mistake/feature/collection/list/v;->d:Z

    .line 141
    .line 142
    if-ne v3, v5, :cond_b

    .line 143
    .line 144
    move v9, v10

    .line 145
    :cond_b
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    if-nez v9, :cond_c

    .line 150
    .line 151
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 152
    .line 153
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    if-ne v3, v5, :cond_d

    .line 158
    .line 159
    :cond_c
    new-instance v3, Lcom/zykj/mistake/feature/collection/filter/u0;

    .line 160
    .line 161
    const/16 v5, 0xf

    .line 162
    .line 163
    invoke-direct {v3, v2, v5}, Lcom/zykj/mistake/feature/collection/filter/u0;-><init>(Lr6/c;I)V

    .line 164
    .line 165
    .line 166
    invoke-interface {v15, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    :cond_d
    move-object v9, v3

    .line 170
    check-cast v9, Lr6/a;

    .line 171
    .line 172
    const/4 v3, 0x0

    .line 173
    const/4 v5, 0x0

    .line 174
    invoke-static {v6, v3, v10, v5}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 175
    .line 176
    .line 177
    move-result-object v11

    .line 178
    move-object v1, v0

    .line 179
    new-instance v0, Lcom/zykj/mistake/feature/collection/list/y;

    .line 180
    .line 181
    const/4 v5, 0x0

    .line 182
    move-object v3, v2

    .line 183
    move-object/from16 v2, p0

    .line 184
    .line 185
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/collection/list/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ld6/d;I)V

    .line 186
    .line 187
    .line 188
    const/16 v1, 0x36

    .line 189
    .line 190
    const v2, 0x35f6151

    .line 191
    .line 192
    .line 193
    invoke-static {v2, v10, v0, v15, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 194
    .line 195
    .line 196
    move-result-object v14

    .line 197
    const/high16 v16, 0x180000

    .line 198
    .line 199
    const/16 v17, 0x38

    .line 200
    .line 201
    move-object v10, v11

    .line 202
    const/4 v11, 0x0

    .line 203
    const/4 v12, 0x0

    .line 204
    const/4 v13, 0x0

    .line 205
    invoke-static/range {v8 .. v17}, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt;->PullToRefreshBox(ZLr6/a;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/pulltorefresh/PullToRefreshState;Landroidx/compose/ui/Alignment;Lr6/f;Lr6/f;Landroidx/compose/runtime/Composer;II)V

    .line 206
    .line 207
    .line 208
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    if-eqz v0, :cond_f

    .line 213
    .line 214
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 215
    .line 216
    .line 217
    goto :goto_6

    .line 218
    :cond_e
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 219
    .line 220
    .line 221
    :cond_f
    :goto_6
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 222
    .line 223
    .line 224
    move-result-object v8

    .line 225
    if-eqz v8, :cond_10

    .line 226
    .line 227
    new-instance v0, Landroidx/lifecycle/compose/g;

    .line 228
    .line 229
    const/4 v5, 0x7

    .line 230
    move-object/from16 v1, p0

    .line 231
    .line 232
    move-object/from16 v2, p1

    .line 233
    .line 234
    move-object v3, v6

    .line 235
    move v4, v7

    .line 236
    invoke-direct/range {v0 .. v5}, Landroidx/lifecycle/compose/g;-><init>(Ljava/lang/Object;Lr6/c;Ljava/lang/Object;II)V

    .line 237
    .line 238
    .line 239
    invoke-interface {v8, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 240
    .line 241
    .line 242
    :cond_10
    return-void
.end method

.method public static final e(Lcom/zykj/mistake/feature/collection/list/v;Lr6/c;Landroidx/compose/runtime/Composer;I)V
    .locals 22

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
    const-string v3, "state"

    .line 8
    .line 9
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v3, v0, Lcom/zykj/mistake/feature/collection/list/v;->c:Ljava/util/List;

    .line 13
    .line 14
    const-string v4, "onIntent"

    .line 15
    .line 16
    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const v4, -0x7b8e31b9

    .line 20
    .line 21
    .line 22
    move-object/from16 v5, p2

    .line 23
    .line 24
    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    and-int/lit8 v6, v2, 0x6

    .line 29
    .line 30
    if-nez v6, :cond_1

    .line 31
    .line 32
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    if-eqz v6, :cond_0

    .line 37
    .line 38
    const/4 v6, 0x4

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/4 v6, 0x2

    .line 41
    :goto_0
    or-int/2addr v6, v2

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move v6, v2

    .line 44
    :goto_1
    and-int/lit8 v7, v2, 0x30

    .line 45
    .line 46
    if-nez v7, :cond_3

    .line 47
    .line 48
    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v7

    .line 52
    if-eqz v7, :cond_2

    .line 53
    .line 54
    const/16 v7, 0x20

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    const/16 v7, 0x10

    .line 58
    .line 59
    :goto_2
    or-int/2addr v6, v7

    .line 60
    :cond_3
    and-int/lit8 v7, v6, 0x13

    .line 61
    .line 62
    const/16 v9, 0x12

    .line 63
    .line 64
    const/4 v10, 0x1

    .line 65
    const/4 v11, 0x0

    .line 66
    if-eq v7, v9, :cond_4

    .line 67
    .line 68
    move v7, v10

    .line 69
    goto :goto_3

    .line 70
    :cond_4
    move v7, v11

    .line 71
    :goto_3
    and-int/lit8 v9, v6, 0x1

    .line 72
    .line 73
    invoke-interface {v5, v7, v9}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    if-eqz v7, :cond_19

    .line 78
    .line 79
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    if-eqz v7, :cond_5

    .line 84
    .line 85
    const/4 v7, -0x1

    .line 86
    const-string v9, "com.zykj.mistake.feature.collection.list.MistakeCollectionScreen (MistakeCollectionScreen.kt:58)"

    .line 87
    .line 88
    invoke-static {v4, v6, v7, v9}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 89
    .line 90
    .line 91
    :cond_5
    sget-object v13, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 92
    .line 93
    const/4 v4, 0x0

    .line 94
    const/4 v7, 0x0

    .line 95
    invoke-static {v13, v4, v10, v7}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 96
    .line 97
    .line 98
    move-result-object v14

    .line 99
    const-wide v15, 0xfff5f7faL

    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    invoke-static/range {v15 .. v16}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 105
    .line 106
    .line 107
    move-result-wide v15

    .line 108
    const/16 v18, 0x2

    .line 109
    .line 110
    const/16 v19, 0x0

    .line 111
    .line 112
    const/16 v17, 0x0

    .line 113
    .line 114
    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    sget-object v9, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 119
    .line 120
    invoke-virtual {v9}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 121
    .line 122
    .line 123
    move-result-object v9

    .line 124
    sget-object v12, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 125
    .line 126
    invoke-virtual {v12}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 127
    .line 128
    .line 129
    move-result-object v12

    .line 130
    invoke-static {v9, v12, v5, v11}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 131
    .line 132
    .line 133
    move-result-object v9

    .line 134
    invoke-static {v5, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 135
    .line 136
    .line 137
    move-result v12

    .line 138
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 139
    .line 140
    .line 141
    move-result-object v14

    .line 142
    invoke-static {v5, v4}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    sget-object v15, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 147
    .line 148
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 149
    .line 150
    .line 151
    move-result-object v10

    .line 152
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 153
    .line 154
    .line 155
    move-result-object v16

    .line 156
    if-nez v16, :cond_6

    .line 157
    .line 158
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 159
    .line 160
    .line 161
    :cond_6
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 162
    .line 163
    .line 164
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 165
    .line 166
    .line 167
    move-result v16

    .line 168
    if-eqz v16, :cond_7

    .line 169
    .line 170
    invoke-interface {v5, v10}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 171
    .line 172
    .line 173
    goto :goto_4

    .line 174
    :cond_7
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 175
    .line 176
    .line 177
    :goto_4
    invoke-static {v5}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 178
    .line 179
    .line 180
    move-result-object v10

    .line 181
    invoke-static {v15, v10, v9, v10, v14}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 182
    .line 183
    .line 184
    move-result-object v9

    .line 185
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 186
    .line 187
    .line 188
    move-result v14

    .line 189
    if-nez v14, :cond_8

    .line 190
    .line 191
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v14

    .line 195
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 196
    .line 197
    .line 198
    move-result-object v8

    .line 199
    invoke-static {v14, v8}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v8

    .line 203
    if-nez v8, :cond_9

    .line 204
    .line 205
    :cond_8
    invoke-static {v12, v10, v12, v9}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 206
    .line 207
    .line 208
    :cond_9
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 209
    .line 210
    .line 211
    move-result-object v8

    .line 212
    invoke-static {v10, v4, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 213
    .line 214
    .line 215
    sget-object v12, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 216
    .line 217
    and-int/lit8 v4, v6, 0x70

    .line 218
    .line 219
    and-int/lit8 v6, v6, 0x7e

    .line 220
    .line 221
    invoke-static {v0, v1, v5, v6}, Lcom/zykj/mistake/feature/collection/list/c0;->f(Lcom/zykj/mistake/feature/collection/list/v;Lr6/c;Landroidx/compose/runtime/Composer;I)V

    .line 222
    .line 223
    .line 224
    invoke-static {v7, v5, v11}, Ly4/g;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 225
    .line 226
    .line 227
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 228
    .line 229
    .line 230
    move-result v7

    .line 231
    if-eqz v7, :cond_d

    .line 232
    .line 233
    iget-boolean v7, v0, Lcom/zykj/mistake/feature/collection/list/v;->d:Z

    .line 234
    .line 235
    if-nez v7, :cond_d

    .line 236
    .line 237
    const v6, -0x222217c6

    .line 238
    .line 239
    .line 240
    invoke-interface {v5, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 241
    .line 242
    .line 243
    const/16 v6, 0x20

    .line 244
    .line 245
    if-ne v4, v6, :cond_a

    .line 246
    .line 247
    const/4 v6, 0x1

    .line 248
    goto :goto_5

    .line 249
    :cond_a
    move v6, v11

    .line 250
    :goto_5
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v7

    .line 254
    if-nez v6, :cond_b

    .line 255
    .line 256
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 257
    .line 258
    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v6

    .line 262
    if-ne v7, v6, :cond_c

    .line 263
    .line 264
    :cond_b
    new-instance v7, Lcom/zykj/mistake/feature/collection/filter/u0;

    .line 265
    .line 266
    const/16 v6, 0xa

    .line 267
    .line 268
    invoke-direct {v7, v1, v6}, Lcom/zykj/mistake/feature/collection/filter/u0;-><init>(Lr6/c;I)V

    .line 269
    .line 270
    .line 271
    invoke-interface {v5, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    :cond_c
    check-cast v7, Lr6/a;

    .line 275
    .line 276
    const/16 v16, 0x2

    .line 277
    .line 278
    const/16 v17, 0x0

    .line 279
    .line 280
    const/high16 v14, 0x3f800000    # 1.0f

    .line 281
    .line 282
    const/4 v15, 0x0

    .line 283
    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/ColumnScope;->weight$default(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 284
    .line 285
    .line 286
    move-result-object v6

    .line 287
    invoke-static {v7, v6, v5, v11}, Lcom/zykj/mistake/feature/collection/list/c0;->c(Lr6/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 288
    .line 289
    .line 290
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 291
    .line 292
    .line 293
    goto :goto_6

    .line 294
    :cond_d
    const v7, -0x221ef071

    .line 295
    .line 296
    .line 297
    invoke-interface {v5, v7}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 298
    .line 299
    .line 300
    const/16 v16, 0x2

    .line 301
    .line 302
    const/16 v17, 0x0

    .line 303
    .line 304
    const/high16 v14, 0x3f800000    # 1.0f

    .line 305
    .line 306
    const/4 v15, 0x0

    .line 307
    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/ColumnScope;->weight$default(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 308
    .line 309
    .line 310
    move-result-object v7

    .line 311
    invoke-static {v0, v1, v7, v5, v6}, Lcom/zykj/mistake/feature/collection/list/c0;->d(Lcom/zykj/mistake/feature/collection/list/v;Lr6/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 312
    .line 313
    .line 314
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 315
    .line 316
    .line 317
    :goto_6
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 318
    .line 319
    .line 320
    iget-boolean v6, v0, Lcom/zykj/mistake/feature/collection/list/v;->g:Z

    .line 321
    .line 322
    if-eqz v6, :cond_18

    .line 323
    .line 324
    const v6, -0x483eca4b

    .line 325
    .line 326
    .line 327
    invoke-interface {v5, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 328
    .line 329
    .line 330
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 331
    .line 332
    .line 333
    move-result v3

    .line 334
    if-nez v3, :cond_e

    .line 335
    .line 336
    const-string v3, "\u521b\u5efa\u65b0\u9519\u9898\u96c6"

    .line 337
    .line 338
    goto :goto_7

    .line 339
    :cond_e
    const-string v3, "\u8fd8\u6ca1\u6709\u521b\u5efa\u8fc7\u4efb\u4f55\u9519\u9898\u96c6\uff0c\u5148\u521b\u5efa\u4e00\u4e2a\u5427"

    .line 340
    .line 341
    :goto_7
    iget-object v6, v0, Lcom/zykj/mistake/feature/collection/list/v;->h:Ljava/lang/String;

    .line 342
    .line 343
    iget-object v7, v0, Lcom/zykj/mistake/feature/collection/list/v;->i:Ljava/lang/String;

    .line 344
    .line 345
    iget-boolean v10, v0, Lcom/zykj/mistake/feature/collection/list/v;->j:Z

    .line 346
    .line 347
    const/16 v8, 0x20

    .line 348
    .line 349
    if-ne v4, v8, :cond_f

    .line 350
    .line 351
    const/4 v8, 0x1

    .line 352
    goto :goto_8

    .line 353
    :cond_f
    move v8, v11

    .line 354
    :goto_8
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v9

    .line 358
    if-nez v8, :cond_10

    .line 359
    .line 360
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 361
    .line 362
    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v8

    .line 366
    if-ne v9, v8, :cond_11

    .line 367
    .line 368
    :cond_10
    new-instance v9, Lcom/zykj/mistake/feature/collection/detail/a1;

    .line 369
    .line 370
    const/16 v8, 0x13

    .line 371
    .line 372
    invoke-direct {v9, v1, v8}, Lcom/zykj/mistake/feature/collection/detail/a1;-><init>(Lr6/c;I)V

    .line 373
    .line 374
    .line 375
    invoke-interface {v5, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    :cond_11
    move-object v15, v9

    .line 379
    check-cast v15, Lr6/c;

    .line 380
    .line 381
    const/16 v8, 0x20

    .line 382
    .line 383
    if-ne v4, v8, :cond_12

    .line 384
    .line 385
    const/4 v8, 0x1

    .line 386
    goto :goto_9

    .line 387
    :cond_12
    move v8, v11

    .line 388
    :goto_9
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v9

    .line 392
    if-nez v8, :cond_13

    .line 393
    .line 394
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 395
    .line 396
    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v8

    .line 400
    if-ne v9, v8, :cond_14

    .line 401
    .line 402
    :cond_13
    new-instance v9, Lcom/zykj/mistake/feature/collection/filter/u0;

    .line 403
    .line 404
    const/16 v8, 0xb

    .line 405
    .line 406
    invoke-direct {v9, v1, v8}, Lcom/zykj/mistake/feature/collection/filter/u0;-><init>(Lr6/c;I)V

    .line 407
    .line 408
    .line 409
    invoke-interface {v5, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 410
    .line 411
    .line 412
    :cond_14
    move-object/from16 v16, v9

    .line 413
    .line 414
    check-cast v16, Lr6/a;

    .line 415
    .line 416
    const/16 v8, 0x20

    .line 417
    .line 418
    if-ne v4, v8, :cond_15

    .line 419
    .line 420
    const/4 v11, 0x1

    .line 421
    :cond_15
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v4

    .line 425
    if-nez v11, :cond_16

    .line 426
    .line 427
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 428
    .line 429
    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v8

    .line 433
    if-ne v4, v8, :cond_17

    .line 434
    .line 435
    :cond_16
    new-instance v4, Lcom/zykj/mistake/feature/collection/filter/u0;

    .line 436
    .line 437
    const/16 v8, 0xc

    .line 438
    .line 439
    invoke-direct {v4, v1, v8}, Lcom/zykj/mistake/feature/collection/filter/u0;-><init>(Lr6/c;I)V

    .line 440
    .line 441
    .line 442
    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 443
    .line 444
    .line 445
    :cond_17
    move-object/from16 v17, v4

    .line 446
    .line 447
    check-cast v17, Lr6/a;

    .line 448
    .line 449
    const/16 v20, 0x0

    .line 450
    .line 451
    const/16 v21, 0x3c0

    .line 452
    .line 453
    const-string v8, "\u521b\u5efa"

    .line 454
    .line 455
    const-string v9, "\u521b\u5efa\u4e2d..."

    .line 456
    .line 457
    const/4 v11, 0x0

    .line 458
    const/4 v12, 0x0

    .line 459
    const/4 v13, 0x0

    .line 460
    const/4 v14, 0x0

    .line 461
    const/16 v19, 0x6c00

    .line 462
    .line 463
    move-object/from16 v18, v5

    .line 464
    .line 465
    move-object v5, v3

    .line 466
    invoke-static/range {v5 .. v21}, Lcom/zykj/mistake/feature/collection/component/f;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLr6/c;Lr6/a;Lr6/a;Landroidx/compose/runtime/Composer;III)V

    .line 467
    .line 468
    .line 469
    move-object/from16 v3, v18

    .line 470
    .line 471
    :goto_a
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 472
    .line 473
    .line 474
    goto :goto_b

    .line 475
    :cond_18
    move-object v3, v5

    .line 476
    const v4, -0x4872f445

    .line 477
    .line 478
    .line 479
    invoke-interface {v3, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 480
    .line 481
    .line 482
    goto :goto_a

    .line 483
    :goto_b
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 484
    .line 485
    .line 486
    move-result v4

    .line 487
    if-eqz v4, :cond_1a

    .line 488
    .line 489
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 490
    .line 491
    .line 492
    goto :goto_c

    .line 493
    :cond_19
    move-object v3, v5

    .line 494
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 495
    .line 496
    .line 497
    :cond_1a
    :goto_c
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 498
    .line 499
    .line 500
    move-result-object v3

    .line 501
    if-eqz v3, :cond_1b

    .line 502
    .line 503
    new-instance v4, Lcom/zykj/mistake/feature/collection/list/x;

    .line 504
    .line 505
    const/4 v5, 0x0

    .line 506
    invoke-direct {v4, v0, v1, v2, v5}, Lcom/zykj/mistake/feature/collection/list/x;-><init>(Lcom/zykj/mistake/feature/collection/list/v;Lr6/c;II)V

    .line 507
    .line 508
    .line 509
    invoke-interface {v3, v4}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 510
    .line 511
    .line 512
    :cond_1b
    return-void
.end method

.method public static final f(Lcom/zykj/mistake/feature/collection/list/v;Lr6/c;Landroidx/compose/runtime/Composer;I)V
    .locals 65

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const v3, -0x42baceca

    .line 6
    .line 7
    .line 8
    move-object/from16 v4, p2

    .line 9
    .line 10
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v9

    .line 14
    and-int/lit8 v4, p3, 0x6

    .line 15
    .line 16
    if-nez v4, :cond_1

    .line 17
    .line 18
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-eqz v4, :cond_0

    .line 23
    .line 24
    const/4 v4, 0x4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v4, 0x2

    .line 27
    :goto_0
    or-int v4, p3, v4

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move/from16 v4, p3

    .line 31
    .line 32
    :goto_1
    and-int/lit8 v5, p3, 0x30

    .line 33
    .line 34
    if-nez v5, :cond_3

    .line 35
    .line 36
    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-eqz v5, :cond_2

    .line 41
    .line 42
    const/16 v5, 0x20

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    const/16 v5, 0x10

    .line 46
    .line 47
    :goto_2
    or-int/2addr v4, v5

    .line 48
    :cond_3
    and-int/lit8 v5, v4, 0x13

    .line 49
    .line 50
    const/16 v7, 0x12

    .line 51
    .line 52
    const/4 v8, 0x1

    .line 53
    const/4 v10, 0x0

    .line 54
    if-eq v5, v7, :cond_4

    .line 55
    .line 56
    move v5, v8

    .line 57
    goto :goto_3

    .line 58
    :cond_4
    move v5, v10

    .line 59
    :goto_3
    and-int/lit8 v11, v4, 0x1

    .line 60
    .line 61
    invoke-interface {v9, v5, v11}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-eqz v5, :cond_1f

    .line 66
    .line 67
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-eqz v5, :cond_5

    .line 72
    .line 73
    const/4 v5, -0x1

    .line 74
    const-string v11, "com.zykj.mistake.feature.collection.list.MistakeCollectionTitleBar (MistakeCollectionScreen.kt:101)"

    .line 75
    .line 76
    invoke-static {v3, v4, v5, v11}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :cond_5
    sget-object v13, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 80
    .line 81
    const/4 v3, 0x0

    .line 82
    const/4 v5, 0x0

    .line 83
    invoke-static {v13, v3, v8, v5}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    const/16 v11, 0x2c

    .line 88
    .line 89
    int-to-float v11, v11

    .line 90
    invoke-static {v11}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 91
    .line 92
    .line 93
    move-result v11

    .line 94
    invoke-static {v3, v11}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 95
    .line 96
    .line 97
    move-result-object v14

    .line 98
    sget-object v3, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 99
    .line 100
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 101
    .line 102
    .line 103
    move-result-wide v15

    .line 104
    const/16 v18, 0x2

    .line 105
    .line 106
    const/16 v19, 0x0

    .line 107
    .line 108
    const/16 v17, 0x0

    .line 109
    .line 110
    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 111
    .line 112
    .line 113
    move-result-object v20

    .line 114
    int-to-float v3, v7

    .line 115
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 116
    .line 117
    .line 118
    move-result v21

    .line 119
    const/16 v3, 0xe

    .line 120
    .line 121
    int-to-float v3, v3

    .line 122
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 123
    .line 124
    .line 125
    move-result v23

    .line 126
    const/16 v25, 0xa

    .line 127
    .line 128
    const/16 v26, 0x0

    .line 129
    .line 130
    const/16 v22, 0x0

    .line 131
    .line 132
    const/16 v24, 0x0

    .line 133
    .line 134
    invoke-static/range {v20 .. v26}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    sget-object v30, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 139
    .line 140
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 141
    .line 142
    .line 143
    move-result-object v11

    .line 144
    sget-object v12, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 145
    .line 146
    invoke-virtual {v12}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 147
    .line 148
    .line 149
    move-result-object v14

    .line 150
    const/16 v15, 0x30

    .line 151
    .line 152
    invoke-static {v14, v11, v9, v15}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 153
    .line 154
    .line 155
    move-result-object v11

    .line 156
    invoke-static {v9, v10}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 157
    .line 158
    .line 159
    move-result v14

    .line 160
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    invoke-static {v9, v3}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    sget-object v10, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 169
    .line 170
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 175
    .line 176
    .line 177
    move-result-object v16

    .line 178
    if-nez v16, :cond_6

    .line 179
    .line 180
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 181
    .line 182
    .line 183
    :cond_6
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 184
    .line 185
    .line 186
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 187
    .line 188
    .line 189
    move-result v16

    .line 190
    if-eqz v16, :cond_7

    .line 191
    .line 192
    invoke-interface {v9, v6}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 193
    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_7
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 197
    .line 198
    .line 199
    :goto_4
    invoke-static {v9}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 200
    .line 201
    .line 202
    move-result-object v6

    .line 203
    invoke-static {v10, v6, v11, v6, v5}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 204
    .line 205
    .line 206
    move-result-object v5

    .line 207
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 208
    .line 209
    .line 210
    move-result v11

    .line 211
    if-nez v11, :cond_8

    .line 212
    .line 213
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v11

    .line 217
    move/from16 v20, v7

    .line 218
    .line 219
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 220
    .line 221
    .line 222
    move-result-object v7

    .line 223
    invoke-static {v11, v7}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v7

    .line 227
    if-nez v7, :cond_9

    .line 228
    .line 229
    goto :goto_5

    .line 230
    :cond_8
    move/from16 v20, v7

    .line 231
    .line 232
    :goto_5
    invoke-static {v14, v6, v14, v5}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 233
    .line 234
    .line 235
    :cond_9
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 236
    .line 237
    .line 238
    move-result-object v5

    .line 239
    invoke-static {v6, v3, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 240
    .line 241
    .line 242
    move-object v3, v12

    .line 243
    sget-object v12, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 244
    .line 245
    const/16 v16, 0x2

    .line 246
    .line 247
    const/16 v17, 0x0

    .line 248
    .line 249
    const/high16 v14, 0x3f800000    # 1.0f

    .line 250
    .line 251
    move v5, v15

    .line 252
    const/4 v15, 0x0

    .line 253
    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/RowScope;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 254
    .line 255
    .line 256
    move-result-object v6

    .line 257
    move-object v11, v12

    .line 258
    move-object v7, v13

    .line 259
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 260
    .line 261
    .line 262
    move-result-object v12

    .line 263
    invoke-virtual {v3}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 264
    .line 265
    .line 266
    move-result-object v13

    .line 267
    invoke-static {v13, v12, v9, v5}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 268
    .line 269
    .line 270
    move-result-object v5

    .line 271
    const/4 v12, 0x0

    .line 272
    invoke-static {v9, v12}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 273
    .line 274
    .line 275
    move-result v13

    .line 276
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 277
    .line 278
    .line 279
    move-result-object v14

    .line 280
    invoke-static {v9, v6}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 281
    .line 282
    .line 283
    move-result-object v6

    .line 284
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 285
    .line 286
    .line 287
    move-result-object v15

    .line 288
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 289
    .line 290
    .line 291
    move-result-object v16

    .line 292
    if-nez v16, :cond_a

    .line 293
    .line 294
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 295
    .line 296
    .line 297
    :cond_a
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 298
    .line 299
    .line 300
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 301
    .line 302
    .line 303
    move-result v16

    .line 304
    if-eqz v16, :cond_b

    .line 305
    .line 306
    invoke-interface {v9, v15}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 307
    .line 308
    .line 309
    goto :goto_6

    .line 310
    :cond_b
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 311
    .line 312
    .line 313
    :goto_6
    invoke-static {v9}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 314
    .line 315
    .line 316
    move-result-object v15

    .line 317
    invoke-static {v10, v15, v5, v15, v14}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 318
    .line 319
    .line 320
    move-result-object v5

    .line 321
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 322
    .line 323
    .line 324
    move-result v14

    .line 325
    if-nez v14, :cond_c

    .line 326
    .line 327
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v14

    .line 331
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 332
    .line 333
    .line 334
    move-result-object v8

    .line 335
    invoke-static {v14, v8}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    move-result v8

    .line 339
    if-nez v8, :cond_d

    .line 340
    .line 341
    :cond_c
    invoke-static {v13, v15, v13, v5}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 342
    .line 343
    .line 344
    :cond_d
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 345
    .line 346
    .line 347
    move-result-object v5

    .line 348
    invoke-static {v15, v6, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 349
    .line 350
    .line 351
    move v5, v4

    .line 352
    iget-object v4, v0, Lcom/zykj/mistake/feature/collection/list/v;->a:Ljava/lang/String;

    .line 353
    .line 354
    iget-object v6, v0, Lcom/zykj/mistake/feature/collection/list/v;->l:Ljava/util/Set;

    .line 355
    .line 356
    iget-boolean v8, v0, Lcom/zykj/mistake/feature/collection/list/v;->k:Z

    .line 357
    .line 358
    const-wide v31, 0xff15171aL

    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    invoke-static/range {v31 .. v32}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 364
    .line 365
    .line 366
    move-result-wide v13

    .line 367
    invoke-static/range {v20 .. v20}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 368
    .line 369
    .line 370
    move-result-wide v17

    .line 371
    sget-object v29, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    .line 372
    .line 373
    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    .line 374
    .line 375
    .line 376
    move-result-object v15

    .line 377
    move/from16 v20, v5

    .line 378
    .line 379
    invoke-interface {v11, v7}, Landroidx/compose/foundation/layout/RowScope;->alignByBaseline(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 380
    .line 381
    .line 382
    move-result-object v5

    .line 383
    const/16 v27, 0x0

    .line 384
    .line 385
    const v28, 0x1ffd0

    .line 386
    .line 387
    .line 388
    move-object/from16 v21, v10

    .line 389
    .line 390
    const/4 v10, 0x0

    .line 391
    move/from16 v22, v12

    .line 392
    .line 393
    const/4 v12, 0x0

    .line 394
    move-object/from16 v24, v6

    .line 395
    .line 396
    move-object/from16 v23, v7

    .line 397
    .line 398
    move-wide v6, v13

    .line 399
    const-wide/16 v13, 0x0

    .line 400
    .line 401
    move-object/from16 v25, v11

    .line 402
    .line 403
    move-object v11, v15

    .line 404
    const/4 v15, 0x0

    .line 405
    const/16 v26, 0x1

    .line 406
    .line 407
    const/16 v16, 0x0

    .line 408
    .line 409
    move/from16 v34, v8

    .line 410
    .line 411
    move-object/from16 v33, v25

    .line 412
    .line 413
    move-object/from16 v25, v9

    .line 414
    .line 415
    move-wide/from16 v8, v17

    .line 416
    .line 417
    const-wide/16 v17, 0x0

    .line 418
    .line 419
    const/16 v35, 0x20

    .line 420
    .line 421
    const/16 v19, 0x0

    .line 422
    .line 423
    move/from16 v36, v20

    .line 424
    .line 425
    const/16 v20, 0x0

    .line 426
    .line 427
    move-object/from16 v37, v21

    .line 428
    .line 429
    const/16 v21, 0x0

    .line 430
    .line 431
    move/from16 v38, v22

    .line 432
    .line 433
    const/16 v22, 0x0

    .line 434
    .line 435
    move-object/from16 v39, v23

    .line 436
    .line 437
    const/16 v23, 0x0

    .line 438
    .line 439
    move-object/from16 v40, v24

    .line 440
    .line 441
    const/16 v24, 0x0

    .line 442
    .line 443
    move/from16 v41, v26

    .line 444
    .line 445
    const v26, 0x30d80

    .line 446
    .line 447
    .line 448
    move-object/from16 p2, v3

    .line 449
    .line 450
    move-object/from16 v1, v33

    .line 451
    .line 452
    move/from16 v0, v38

    .line 453
    .line 454
    move-object/from16 v2, v39

    .line 455
    .line 456
    const/4 v3, 0x0

    .line 457
    invoke-static/range {v4 .. v28}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 458
    .line 459
    .line 460
    move-object/from16 v9, v25

    .line 461
    .line 462
    const/16 v4, 0x9

    .line 463
    .line 464
    const-wide v38, 0xff666666L

    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    const/16 v5, 0xc

    .line 470
    .line 471
    const/4 v6, 0x6

    .line 472
    if-eqz v34, :cond_f

    .line 473
    .line 474
    const v7, -0x5e37c6b6

    .line 475
    .line 476
    .line 477
    invoke-interface {v9, v7}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 478
    .line 479
    .line 480
    int-to-float v4, v4

    .line 481
    invoke-static {v4, v2, v9, v6}, Landroidx/compose/material3/c;->s(FLandroidx/compose/ui/Modifier$Companion;Landroidx/compose/runtime/Composer;I)V

    .line 482
    .line 483
    .line 484
    move-object/from16 v6, v40

    .line 485
    .line 486
    check-cast v6, Ljava/util/Collection;

    .line 487
    .line 488
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 489
    .line 490
    .line 491
    move-result v4

    .line 492
    if-nez v4, :cond_e

    .line 493
    .line 494
    new-instance v4, Landroidx/compose/ui/text/AnnotatedString$Builder;

    .line 495
    .line 496
    const/4 v6, 0x1

    .line 497
    invoke-direct {v4, v0, v6, v3}, Landroidx/compose/ui/text/AnnotatedString$Builder;-><init>(IILkotlin/jvm/internal/e;)V

    .line 498
    .line 499
    .line 500
    const-string v3, "\u5df2\u9009\u62e9 "

    .line 501
    .line 502
    invoke-virtual {v4, v3}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V

    .line 503
    .line 504
    .line 505
    new-instance v42, Landroidx/compose/ui/text/SpanStyle;

    .line 506
    .line 507
    invoke-static/range {v31 .. v32}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 508
    .line 509
    .line 510
    move-result-wide v43

    .line 511
    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    .line 512
    .line 513
    .line 514
    move-result-object v47

    .line 515
    const v63, 0xfffa

    .line 516
    .line 517
    .line 518
    const/16 v64, 0x0

    .line 519
    .line 520
    const-wide/16 v45, 0x0

    .line 521
    .line 522
    const/16 v48, 0x0

    .line 523
    .line 524
    const/16 v49, 0x0

    .line 525
    .line 526
    const/16 v50, 0x0

    .line 527
    .line 528
    const/16 v51, 0x0

    .line 529
    .line 530
    const-wide/16 v52, 0x0

    .line 531
    .line 532
    const/16 v54, 0x0

    .line 533
    .line 534
    const/16 v55, 0x0

    .line 535
    .line 536
    const/16 v56, 0x0

    .line 537
    .line 538
    const-wide/16 v57, 0x0

    .line 539
    .line 540
    const/16 v59, 0x0

    .line 541
    .line 542
    const/16 v60, 0x0

    .line 543
    .line 544
    const/16 v61, 0x0

    .line 545
    .line 546
    const/16 v62, 0x0

    .line 547
    .line 548
    invoke-direct/range {v42 .. v64}, Landroidx/compose/ui/text/SpanStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;ILkotlin/jvm/internal/e;)V

    .line 549
    .line 550
    .line 551
    move-object/from16 v3, v42

    .line 552
    .line 553
    invoke-virtual {v4, v3}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pushStyle(Landroidx/compose/ui/text/SpanStyle;)I

    .line 554
    .line 555
    .line 556
    move-result v3

    .line 557
    :try_start_0
    invoke-interface/range {v40 .. v40}, Ljava/util/Set;->size()I

    .line 558
    .line 559
    .line 560
    move-result v6

    .line 561
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v6

    .line 565
    invoke-virtual {v4, v6}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 566
    .line 567
    .line 568
    invoke-virtual {v4, v3}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pop(I)V

    .line 569
    .line 570
    .line 571
    const-string v3, " \u4e2a"

    .line 572
    .line 573
    invoke-virtual {v4, v3}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V

    .line 574
    .line 575
    .line 576
    invoke-virtual {v4}, Landroidx/compose/ui/text/AnnotatedString$Builder;->toAnnotatedString()Landroidx/compose/ui/text/AnnotatedString;

    .line 577
    .line 578
    .line 579
    move-result-object v3

    .line 580
    :goto_7
    move-object v4, v3

    .line 581
    goto :goto_8

    .line 582
    :catchall_0
    move-exception v0

    .line 583
    invoke-virtual {v4, v3}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pop(I)V

    .line 584
    .line 585
    .line 586
    throw v0

    .line 587
    :cond_e
    new-instance v4, Landroidx/compose/ui/text/AnnotatedString$Builder;

    .line 588
    .line 589
    const/4 v6, 0x1

    .line 590
    invoke-direct {v4, v0, v6, v3}, Landroidx/compose/ui/text/AnnotatedString$Builder;-><init>(IILkotlin/jvm/internal/e;)V

    .line 591
    .line 592
    .line 593
    const-string v3, "\u672a\u9009\u62e9"

    .line 594
    .line 595
    invoke-virtual {v4, v3}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V

    .line 596
    .line 597
    .line 598
    invoke-virtual {v4}, Landroidx/compose/ui/text/AnnotatedString$Builder;->toAnnotatedString()Landroidx/compose/ui/text/AnnotatedString;

    .line 599
    .line 600
    .line 601
    move-result-object v3

    .line 602
    goto :goto_7

    .line 603
    :goto_8
    invoke-static/range {v38 .. v39}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 604
    .line 605
    .line 606
    move-result-wide v6

    .line 607
    move-object/from16 v25, v9

    .line 608
    .line 609
    invoke-static {v5}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 610
    .line 611
    .line 612
    move-result-wide v8

    .line 613
    move v3, v5

    .line 614
    invoke-interface {v1, v2}, Landroidx/compose/foundation/layout/RowScope;->alignByBaseline(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 615
    .line 616
    .line 617
    move-result-object v5

    .line 618
    const/16 v28, 0xc00

    .line 619
    .line 620
    const v29, 0x3dff0

    .line 621
    .line 622
    .line 623
    const/4 v10, 0x0

    .line 624
    const/4 v11, 0x0

    .line 625
    const/4 v12, 0x0

    .line 626
    const-wide/16 v13, 0x0

    .line 627
    .line 628
    const/4 v15, 0x0

    .line 629
    const/16 v16, 0x0

    .line 630
    .line 631
    const-wide/16 v17, 0x0

    .line 632
    .line 633
    const/16 v19, 0x0

    .line 634
    .line 635
    const/16 v20, 0x0

    .line 636
    .line 637
    const/16 v21, 0x1

    .line 638
    .line 639
    const/16 v22, 0x0

    .line 640
    .line 641
    const/16 v23, 0x0

    .line 642
    .line 643
    const/16 v24, 0x0

    .line 644
    .line 645
    move-object/from16 v26, v25

    .line 646
    .line 647
    const/16 v25, 0x0

    .line 648
    .line 649
    const/16 v27, 0xd80

    .line 650
    .line 651
    invoke-static/range {v4 .. v29}, Landroidx/compose/material3/TextKt;->Text-IbK3jfQ(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILjava/util/Map;Lr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 652
    .line 653
    .line 654
    move-object/from16 v9, v26

    .line 655
    .line 656
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 657
    .line 658
    .line 659
    move-object/from16 v0, p0

    .line 660
    .line 661
    goto/16 :goto_a

    .line 662
    .line 663
    :cond_f
    move v3, v5

    .line 664
    move-object/from16 v5, p0

    .line 665
    .line 666
    iget-object v7, v5, Lcom/zykj/mistake/feature/collection/list/v;->c:Ljava/util/List;

    .line 667
    .line 668
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 669
    .line 670
    .line 671
    move-result v7

    .line 672
    if-nez v7, :cond_10

    .line 673
    .line 674
    const v7, -0x5e26275d

    .line 675
    .line 676
    .line 677
    invoke-interface {v9, v7}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 678
    .line 679
    .line 680
    int-to-float v4, v4

    .line 681
    invoke-static {v4, v2, v9, v6}, Landroidx/compose/material3/c;->s(FLandroidx/compose/ui/Modifier$Companion;Landroidx/compose/runtime/Composer;I)V

    .line 682
    .line 683
    .line 684
    invoke-static/range {v38 .. v39}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 685
    .line 686
    .line 687
    move-result-wide v6

    .line 688
    move-object/from16 v25, v9

    .line 689
    .line 690
    invoke-static {v3}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 691
    .line 692
    .line 693
    move-result-wide v8

    .line 694
    invoke-interface {v1, v2}, Landroidx/compose/foundation/layout/RowScope;->alignByBaseline(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 695
    .line 696
    .line 697
    move-result-object v5

    .line 698
    const/16 v27, 0xc00

    .line 699
    .line 700
    const v28, 0x1dff0

    .line 701
    .line 702
    .line 703
    const-string v4, "\u5171 "

    .line 704
    .line 705
    const/4 v10, 0x0

    .line 706
    const/4 v11, 0x0

    .line 707
    const/4 v12, 0x0

    .line 708
    const-wide/16 v13, 0x0

    .line 709
    .line 710
    const/4 v15, 0x0

    .line 711
    const/16 v16, 0x0

    .line 712
    .line 713
    const-wide/16 v17, 0x0

    .line 714
    .line 715
    const/16 v19, 0x0

    .line 716
    .line 717
    const/16 v20, 0x0

    .line 718
    .line 719
    const/16 v21, 0x1

    .line 720
    .line 721
    const/16 v22, 0x0

    .line 722
    .line 723
    const/16 v23, 0x0

    .line 724
    .line 725
    const/16 v24, 0x0

    .line 726
    .line 727
    const/16 v26, 0xd86

    .line 728
    .line 729
    move-object/from16 v0, p0

    .line 730
    .line 731
    invoke-static/range {v4 .. v28}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 732
    .line 733
    .line 734
    iget v4, v0, Lcom/zykj/mistake/feature/collection/list/v;->b:I

    .line 735
    .line 736
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 737
    .line 738
    .line 739
    move-result-object v4

    .line 740
    invoke-static/range {v31 .. v32}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 741
    .line 742
    .line 743
    move-result-wide v6

    .line 744
    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    .line 745
    .line 746
    .line 747
    move-result-object v11

    .line 748
    invoke-static {v3}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 749
    .line 750
    .line 751
    move-result-wide v8

    .line 752
    invoke-interface {v1, v2}, Landroidx/compose/foundation/layout/RowScope;->alignByBaseline(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 753
    .line 754
    .line 755
    move-result-object v5

    .line 756
    const v28, 0x1dfd0

    .line 757
    .line 758
    .line 759
    const v26, 0x30d80

    .line 760
    .line 761
    .line 762
    invoke-static/range {v4 .. v28}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 763
    .line 764
    .line 765
    invoke-static/range {v38 .. v39}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 766
    .line 767
    .line 768
    move-result-wide v6

    .line 769
    invoke-static {v3}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 770
    .line 771
    .line 772
    move-result-wide v8

    .line 773
    invoke-interface {v1, v2}, Landroidx/compose/foundation/layout/RowScope;->alignByBaseline(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 774
    .line 775
    .line 776
    move-result-object v5

    .line 777
    const v28, 0x1dff0

    .line 778
    .line 779
    .line 780
    const-string v4, " \u4e2a\u9519\u9898\u96c6"

    .line 781
    .line 782
    const/4 v11, 0x0

    .line 783
    const/16 v26, 0xd86

    .line 784
    .line 785
    invoke-static/range {v4 .. v28}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 786
    .line 787
    .line 788
    move-object/from16 v9, v25

    .line 789
    .line 790
    :goto_9
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 791
    .line 792
    .line 793
    goto :goto_a

    .line 794
    :cond_10
    move-object v0, v5

    .line 795
    const v1, -0x5e81ce9c

    .line 796
    .line 797
    .line 798
    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 799
    .line 800
    .line 801
    goto :goto_9

    .line 802
    :goto_a
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 803
    .line 804
    .line 805
    int-to-float v1, v3

    .line 806
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 807
    .line 808
    .line 809
    move-result v1

    .line 810
    move-object/from16 v3, p2

    .line 811
    .line 812
    invoke-virtual {v3, v1}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 813
    .line 814
    .line 815
    move-result-object v1

    .line 816
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 817
    .line 818
    .line 819
    move-result-object v3

    .line 820
    const/16 v4, 0x36

    .line 821
    .line 822
    invoke-static {v1, v3, v9, v4}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 823
    .line 824
    .line 825
    move-result-object v1

    .line 826
    const/4 v12, 0x0

    .line 827
    invoke-static {v9, v12}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 828
    .line 829
    .line 830
    move-result v3

    .line 831
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 832
    .line 833
    .line 834
    move-result-object v4

    .line 835
    invoke-static {v9, v2}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 836
    .line 837
    .line 838
    move-result-object v2

    .line 839
    invoke-virtual/range {v37 .. v37}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 840
    .line 841
    .line 842
    move-result-object v5

    .line 843
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 844
    .line 845
    .line 846
    move-result-object v6

    .line 847
    if-nez v6, :cond_11

    .line 848
    .line 849
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 850
    .line 851
    .line 852
    :cond_11
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 853
    .line 854
    .line 855
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 856
    .line 857
    .line 858
    move-result v6

    .line 859
    if-eqz v6, :cond_12

    .line 860
    .line 861
    invoke-interface {v9, v5}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 862
    .line 863
    .line 864
    goto :goto_b

    .line 865
    :cond_12
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 866
    .line 867
    .line 868
    :goto_b
    invoke-static {v9}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 869
    .line 870
    .line 871
    move-result-object v5

    .line 872
    move-object/from16 v6, v37

    .line 873
    .line 874
    invoke-static {v6, v5, v1, v5, v4}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 875
    .line 876
    .line 877
    move-result-object v1

    .line 878
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 879
    .line 880
    .line 881
    move-result v4

    .line 882
    if-nez v4, :cond_13

    .line 883
    .line 884
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 885
    .line 886
    .line 887
    move-result-object v4

    .line 888
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 889
    .line 890
    .line 891
    move-result-object v7

    .line 892
    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 893
    .line 894
    .line 895
    move-result v4

    .line 896
    if-nez v4, :cond_14

    .line 897
    .line 898
    :cond_13
    invoke-static {v3, v5, v3, v1}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 899
    .line 900
    .line 901
    :cond_14
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 902
    .line 903
    .line 904
    move-result-object v1

    .line 905
    invoke-static {v5, v2, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 906
    .line 907
    .line 908
    if-eqz v34, :cond_1b

    .line 909
    .line 910
    const v1, -0x5a2538b

    .line 911
    .line 912
    .line 913
    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 914
    .line 915
    .line 916
    sget v4, Lcom/zykj/mistake/R$drawable;->ic_mistake_delete:I

    .line 917
    .line 918
    move-object/from16 v6, v40

    .line 919
    .line 920
    check-cast v6, Ljava/util/Collection;

    .line 921
    .line 922
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 923
    .line 924
    .line 925
    move-result v1

    .line 926
    const/16 v41, 0x1

    .line 927
    .line 928
    xor-int/lit8 v7, v1, 0x1

    .line 929
    .line 930
    and-int/lit8 v1, v36, 0x70

    .line 931
    .line 932
    const/16 v2, 0x20

    .line 933
    .line 934
    if-ne v1, v2, :cond_15

    .line 935
    .line 936
    move/from16 v8, v41

    .line 937
    .line 938
    goto :goto_c

    .line 939
    :cond_15
    move v8, v12

    .line 940
    :goto_c
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 941
    .line 942
    .line 943
    move-result-object v3

    .line 944
    if-nez v8, :cond_17

    .line 945
    .line 946
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 947
    .line 948
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 949
    .line 950
    .line 951
    move-result-object v5

    .line 952
    if-ne v3, v5, :cond_16

    .line 953
    .line 954
    goto :goto_d

    .line 955
    :cond_16
    move-object/from16 v13, p1

    .line 956
    .line 957
    goto :goto_e

    .line 958
    :cond_17
    :goto_d
    new-instance v3, Lcom/zykj/mistake/feature/collection/filter/u0;

    .line 959
    .line 960
    const/16 v5, 0x9

    .line 961
    .line 962
    move-object/from16 v13, p1

    .line 963
    .line 964
    invoke-direct {v3, v13, v5}, Lcom/zykj/mistake/feature/collection/filter/u0;-><init>(Lr6/c;I)V

    .line 965
    .line 966
    .line 967
    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 968
    .line 969
    .line 970
    :goto_e
    move-object v8, v3

    .line 971
    check-cast v8, Lr6/a;

    .line 972
    .line 973
    const/16 v10, 0x30

    .line 974
    .line 975
    const/4 v11, 0x4

    .line 976
    const-string v5, "\u5220\u9664"

    .line 977
    .line 978
    const/4 v6, 0x0

    .line 979
    invoke-static/range {v4 .. v11}, Ly4/f;->a(ILjava/lang/String;FZLr6/a;Landroidx/compose/runtime/Composer;II)V

    .line 980
    .line 981
    .line 982
    sget v4, Lcom/zykj/mistake/R$drawable;->ic_mistake_cancel:I

    .line 983
    .line 984
    if-ne v1, v2, :cond_18

    .line 985
    .line 986
    move/from16 v8, v41

    .line 987
    .line 988
    goto :goto_f

    .line 989
    :cond_18
    move v8, v12

    .line 990
    :goto_f
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 991
    .line 992
    .line 993
    move-result-object v1

    .line 994
    if-nez v8, :cond_19

    .line 995
    .line 996
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 997
    .line 998
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 999
    .line 1000
    .line 1001
    move-result-object v2

    .line 1002
    if-ne v1, v2, :cond_1a

    .line 1003
    .line 1004
    :cond_19
    new-instance v1, Lcom/zykj/mistake/feature/collection/filter/u0;

    .line 1005
    .line 1006
    const/16 v2, 0xd

    .line 1007
    .line 1008
    invoke-direct {v1, v13, v2}, Lcom/zykj/mistake/feature/collection/filter/u0;-><init>(Lr6/c;I)V

    .line 1009
    .line 1010
    .line 1011
    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1012
    .line 1013
    .line 1014
    :cond_1a
    move-object v8, v1

    .line 1015
    check-cast v8, Lr6/a;

    .line 1016
    .line 1017
    const/16 v10, 0x30

    .line 1018
    .line 1019
    const/16 v11, 0xc

    .line 1020
    .line 1021
    const-string v5, "\u53d6\u6d88"

    .line 1022
    .line 1023
    const/4 v6, 0x0

    .line 1024
    const/4 v7, 0x0

    .line 1025
    invoke-static/range {v4 .. v11}, Ly4/f;->a(ILjava/lang/String;FZLr6/a;Landroidx/compose/runtime/Composer;II)V

    .line 1026
    .line 1027
    .line 1028
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1029
    .line 1030
    .line 1031
    move-object/from16 v25, v9

    .line 1032
    .line 1033
    goto :goto_11

    .line 1034
    :cond_1b
    move-object/from16 v13, p1

    .line 1035
    .line 1036
    const/16 v2, 0x20

    .line 1037
    .line 1038
    const/16 v41, 0x1

    .line 1039
    .line 1040
    const v1, -0x59a42a7

    .line 1041
    .line 1042
    .line 1043
    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1044
    .line 1045
    .line 1046
    sget v4, Lcom/zykj/mistake/R$drawable;->ic_new_mistake:I

    .line 1047
    .line 1048
    and-int/lit8 v1, v36, 0x70

    .line 1049
    .line 1050
    if-ne v1, v2, :cond_1c

    .line 1051
    .line 1052
    move/from16 v8, v41

    .line 1053
    .line 1054
    goto :goto_10

    .line 1055
    :cond_1c
    move v8, v12

    .line 1056
    :goto_10
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v1

    .line 1060
    if-nez v8, :cond_1d

    .line 1061
    .line 1062
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 1063
    .line 1064
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v2

    .line 1068
    if-ne v1, v2, :cond_1e

    .line 1069
    .line 1070
    :cond_1d
    new-instance v1, Lcom/zykj/mistake/feature/collection/filter/u0;

    .line 1071
    .line 1072
    const/16 v2, 0xe

    .line 1073
    .line 1074
    invoke-direct {v1, v13, v2}, Lcom/zykj/mistake/feature/collection/filter/u0;-><init>(Lr6/c;I)V

    .line 1075
    .line 1076
    .line 1077
    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1078
    .line 1079
    .line 1080
    :cond_1e
    move-object v8, v1

    .line 1081
    check-cast v8, Lr6/a;

    .line 1082
    .line 1083
    const/16 v10, 0x30

    .line 1084
    .line 1085
    const/16 v11, 0xc

    .line 1086
    .line 1087
    const-string v5, "\u65b0\u589e\u9519\u9898\u96c6"

    .line 1088
    .line 1089
    const/4 v6, 0x0

    .line 1090
    const/4 v7, 0x0

    .line 1091
    invoke-static/range {v4 .. v11}, Ly4/f;->a(ILjava/lang/String;FZLr6/a;Landroidx/compose/runtime/Composer;II)V

    .line 1092
    .line 1093
    .line 1094
    move-object/from16 v25, v9

    .line 1095
    .line 1096
    invoke-interface/range {v25 .. v25}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1097
    .line 1098
    .line 1099
    :goto_11
    invoke-static/range {v25 .. v25}, Landroidx/collection/a;->D(Landroidx/compose/runtime/Composer;)Z

    .line 1100
    .line 1101
    .line 1102
    move-result v1

    .line 1103
    if-eqz v1, :cond_20

    .line 1104
    .line 1105
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 1106
    .line 1107
    .line 1108
    goto :goto_12

    .line 1109
    :cond_1f
    move-object v13, v1

    .line 1110
    move-object/from16 v25, v9

    .line 1111
    .line 1112
    invoke-interface/range {v25 .. v25}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 1113
    .line 1114
    .line 1115
    :cond_20
    :goto_12
    invoke-interface/range {v25 .. v25}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v1

    .line 1119
    if-eqz v1, :cond_21

    .line 1120
    .line 1121
    new-instance v2, Lcom/zykj/mistake/feature/collection/list/x;

    .line 1122
    .line 1123
    const/4 v3, 0x1

    .line 1124
    move/from16 v4, p3

    .line 1125
    .line 1126
    invoke-direct {v2, v0, v13, v4, v3}, Lcom/zykj/mistake/feature/collection/list/x;-><init>(Lcom/zykj/mistake/feature/collection/list/v;Lr6/c;II)V

    .line 1127
    .line 1128
    .line 1129
    invoke-interface {v1, v2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 1130
    .line 1131
    .line 1132
    :cond_21
    return-void
.end method
