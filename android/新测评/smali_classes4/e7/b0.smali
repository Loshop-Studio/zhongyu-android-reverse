.class public abstract Le7/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroid/content/Context;)Lorg/angmarch/views/NiceSpinner;
    .locals 0

    .line 1
    invoke-static {p0}, Le7/b0;->k(Landroid/content/Context;)Lorg/angmarch/views/NiceSpinner;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Lorg/angmarch/views/NiceSpinner;Landroid/view/View;IJ)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Le7/b0;->i(Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Lorg/angmarch/views/NiceSpinner;Landroid/view/View;IJ)V

    return-void
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Ljava/util/List;JLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p8}, Le7/b0;->j(Landroidx/compose/ui/Modifier;Ljava/util/List;JLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/util/List;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;JLorg/angmarch/views/NiceSpinner;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Le7/b0;->h(Ljava/util/List;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;JLorg/angmarch/views/NiceSpinner;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Ljava/util/List;JLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 17

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v6, p4

    .line 4
    .line 5
    move/from16 v7, p6

    .line 6
    .line 7
    const-string v0, "topicList"

    .line 8
    .line 9
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "onTopicSelected"

    .line 13
    .line 14
    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const v0, 0x6e40af8d

    .line 18
    .line 19
    .line 20
    move-object/from16 v2, p5

    .line 21
    .line 22
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 23
    .line 24
    .line 25
    move-result-object v11

    .line 26
    and-int/lit8 v2, p7, 0x1

    .line 27
    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    or-int/lit8 v3, v7, 0x6

    .line 31
    .line 32
    move v4, v3

    .line 33
    move-object/from16 v3, p0

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    and-int/lit8 v3, v7, 0x6

    .line 37
    .line 38
    if-nez v3, :cond_2

    .line 39
    .line 40
    move-object/from16 v3, p0

    .line 41
    .line 42
    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_1

    .line 47
    .line 48
    const/4 v4, 0x4

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    const/4 v4, 0x2

    .line 51
    :goto_0
    or-int/2addr v4, v7

    .line 52
    goto :goto_1

    .line 53
    :cond_2
    move-object/from16 v3, p0

    .line 54
    .line 55
    move v4, v7

    .line 56
    :goto_1
    and-int/lit8 v5, v7, 0x30

    .line 57
    .line 58
    if-nez v5, :cond_4

    .line 59
    .line 60
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_3

    .line 65
    .line 66
    const/16 v5, 0x20

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_3
    const/16 v5, 0x10

    .line 70
    .line 71
    :goto_2
    or-int/2addr v4, v5

    .line 72
    :cond_4
    and-int/lit16 v5, v7, 0x180

    .line 73
    .line 74
    const/16 v8, 0x100

    .line 75
    .line 76
    move-wide/from16 v9, p2

    .line 77
    .line 78
    if-nez v5, :cond_6

    .line 79
    .line 80
    invoke-interface {v11, v9, v10}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    if-eqz v5, :cond_5

    .line 85
    .line 86
    move v5, v8

    .line 87
    goto :goto_3

    .line 88
    :cond_5
    const/16 v5, 0x80

    .line 89
    .line 90
    :goto_3
    or-int/2addr v4, v5

    .line 91
    :cond_6
    and-int/lit16 v5, v7, 0xc00

    .line 92
    .line 93
    if-nez v5, :cond_8

    .line 94
    .line 95
    invoke-interface {v11, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    if-eqz v5, :cond_7

    .line 100
    .line 101
    const/16 v5, 0x800

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_7
    const/16 v5, 0x400

    .line 105
    .line 106
    :goto_4
    or-int/2addr v4, v5

    .line 107
    :cond_8
    and-int/lit16 v5, v4, 0x493

    .line 108
    .line 109
    const/16 v12, 0x492

    .line 110
    .line 111
    const/4 v14, 0x1

    .line 112
    if-eq v5, v12, :cond_9

    .line 113
    .line 114
    move v5, v14

    .line 115
    goto :goto_5

    .line 116
    :cond_9
    const/4 v5, 0x0

    .line 117
    :goto_5
    and-int/lit8 v12, v4, 0x1

    .line 118
    .line 119
    invoke-interface {v11, v5, v12}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    if-eqz v5, :cond_11

    .line 124
    .line 125
    if-eqz v2, :cond_a

    .line 126
    .line 127
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 128
    .line 129
    move-object v15, v2

    .line 130
    goto :goto_6

    .line 131
    :cond_a
    move-object v15, v3

    .line 132
    :goto_6
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    if-eqz v2, :cond_b

    .line 137
    .line 138
    const/4 v2, -0x1

    .line 139
    const-string v3, "com.zykj.evaluation.ui.widget.NiceSpinnerView (NiceSpinnerView.kt:26)"

    .line 140
    .line 141
    invoke-static {v0, v4, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 142
    .line 143
    .line 144
    :cond_b
    shr-int/lit8 v0, v4, 0x3

    .line 145
    .line 146
    and-int/lit8 v0, v0, 0xe

    .line 147
    .line 148
    invoke-static {v1, v11, v0}, Landroidx/compose/runtime/SnapshotStateKt;->rememberUpdatedState(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    shr-int/lit8 v0, v4, 0x9

    .line 153
    .line 154
    and-int/lit8 v0, v0, 0xe

    .line 155
    .line 156
    invoke-static {v6, v11, v0}, Landroidx/compose/runtime/SnapshotStateKt;->rememberUpdatedState(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    const/16 v0, 0x4d

    .line 161
    .line 162
    int-to-float v0, v0

    .line 163
    const/16 v5, 0x258

    .line 164
    .line 165
    int-to-float v5, v5

    .line 166
    div-float/2addr v0, v5

    .line 167
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    iget v12, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 176
    .line 177
    iget v5, v5, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 178
    .line 179
    invoke-static {v12, v5}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 180
    .line 181
    .line 182
    move-result v5

    .line 183
    int-to-float v5, v5

    .line 184
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 185
    .line 186
    .line 187
    move-result-object v12

    .line 188
    invoke-virtual {v12}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 189
    .line 190
    .line 191
    move-result-object v12

    .line 192
    iget v12, v12, Landroid/util/DisplayMetrics;->density:F

    .line 193
    .line 194
    div-float/2addr v5, v12

    .line 195
    mul-float/2addr v0, v5

    .line 196
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    invoke-static {v15, v0}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 201
    .line 202
    .line 203
    move-result-object v12

    .line 204
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 209
    .line 210
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v13

    .line 214
    if-ne v0, v13, :cond_c

    .line 215
    .line 216
    new-instance v0, Le7/x;

    .line 217
    .line 218
    invoke-direct {v0}, Le7/x;-><init>()V

    .line 219
    .line 220
    .line 221
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    :cond_c
    move-object v13, v0

    .line 225
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 226
    .line 227
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v16

    .line 235
    or-int v0, v0, v16

    .line 236
    .line 237
    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v16

    .line 241
    or-int v0, v0, v16

    .line 242
    .line 243
    and-int/lit16 v4, v4, 0x380

    .line 244
    .line 245
    if-ne v4, v8, :cond_d

    .line 246
    .line 247
    goto :goto_7

    .line 248
    :cond_d
    const/4 v14, 0x0

    .line 249
    :goto_7
    or-int/2addr v0, v14

    .line 250
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v4

    .line 254
    if-nez v0, :cond_e

    .line 255
    .line 256
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    if-ne v4, v0, :cond_f

    .line 261
    .line 262
    :cond_e
    new-instance v0, Le7/y;

    .line 263
    .line 264
    move-wide v4, v9

    .line 265
    invoke-direct/range {v0 .. v5}, Le7/y;-><init>(Ljava/util/List;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;J)V

    .line 266
    .line 267
    .line 268
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    move-object v4, v0

    .line 272
    :cond_f
    move-object v10, v4

    .line 273
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 274
    .line 275
    move-object v9, v12

    .line 276
    const/4 v12, 0x6

    .line 277
    move-object v8, v13

    .line 278
    const/4 v13, 0x0

    .line 279
    invoke-static/range {v8 .. v13}, Landroidx/compose/ui/viewinterop/AndroidView_androidKt;->AndroidView(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    .line 280
    .line 281
    .line 282
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    if-eqz v0, :cond_10

    .line 287
    .line 288
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 289
    .line 290
    .line 291
    :cond_10
    move-object v1, v15

    .line 292
    goto :goto_8

    .line 293
    :cond_11
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 294
    .line 295
    .line 296
    move-object v1, v3

    .line 297
    :goto_8
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 298
    .line 299
    .line 300
    move-result-object v8

    .line 301
    if-eqz v8, :cond_12

    .line 302
    .line 303
    new-instance v0, Le7/z;

    .line 304
    .line 305
    move-object/from16 v2, p1

    .line 306
    .line 307
    move-wide/from16 v3, p2

    .line 308
    .line 309
    move-object v5, v6

    .line 310
    move v6, v7

    .line 311
    move/from16 v7, p7

    .line 312
    .line 313
    invoke-direct/range {v0 .. v7}, Le7/z;-><init>(Landroidx/compose/ui/Modifier;Ljava/util/List;JLkotlin/jvm/functions/Function1;II)V

    .line 314
    .line 315
    .line 316
    invoke-interface {v8, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 317
    .line 318
    .line 319
    :cond_12
    return-void
.end method

.method public static final f(Landroidx/compose/runtime/State;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/util/List;

    .line 6
    .line 7
    return-object p0
.end method

.method public static final g(Landroidx/compose/runtime/State;)Lkotlin/jvm/functions/Function1;
    .locals 0

    .line 1
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    return-object p0
.end method

.method public static final h(Ljava/util/List;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;JLorg/angmarch/views/NiceSpinner;)Lkotlin/Unit;
    .locals 4

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    const/16 v1, 0xa

    .line 9
    .line 10
    invoke-static {p0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Lz5/t1;

    .line 32
    .line 33
    invoke-virtual {v2}, Lz5/t1;->b()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-virtual {p5}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    instance-of v2, v1, Ljava/util/List;

    .line 46
    .line 47
    const/4 v3, 0x0

    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    check-cast v1, Ljava/util/List;

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    move-object v1, v3

    .line 54
    :goto_1
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-nez v1, :cond_2

    .line 59
    .line 60
    invoke-virtual {p5, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p5, v0}, Lorg/angmarch/views/NiceSpinner;->l(Ljava/util/List;)V

    .line 64
    .line 65
    .line 66
    new-instance v1, Le7/a0;

    .line 67
    .line 68
    invoke-direct {v1, p1, p2}, Le7/a0;-><init>(Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p5, v1}, Lorg/angmarch/views/NiceSpinner;->setOnSpinnerItemSelectedListener(Ln9/b;)V

    .line 72
    .line 73
    .line 74
    :cond_2
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    xor-int/lit8 p1, p1, 0x1

    .line 79
    .line 80
    invoke-virtual {p5, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 81
    .line 82
    .line 83
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-nez p1, :cond_7

    .line 88
    .line 89
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    const/4 p1, 0x0

    .line 94
    move p2, p1

    .line 95
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-eqz v1, :cond_4

    .line 100
    .line 101
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    check-cast v1, Lz5/t1;

    .line 106
    .line 107
    invoke-virtual {v1}, Lz5/t1;->a()J

    .line 108
    .line 109
    .line 110
    move-result-wide v1

    .line 111
    cmp-long v1, v1, p3

    .line 112
    .line 113
    if-nez v1, :cond_3

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_3
    add-int/lit8 p2, p2, 0x1

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_4
    const/4 p2, -0x1

    .line 120
    :goto_3
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 125
    .line 126
    .line 127
    move-result p2

    .line 128
    if-ltz p2, :cond_5

    .line 129
    .line 130
    move-object v3, p0

    .line 131
    :cond_5
    if-eqz v3, :cond_6

    .line 132
    .line 133
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 134
    .line 135
    .line 136
    move-result p0

    .line 137
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    .line 138
    .line 139
    .line 140
    move-result p2

    .line 141
    invoke-static {p0, p1, p2}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    :cond_6
    invoke-virtual {p5}, Lorg/angmarch/views/NiceSpinner;->getSelectedIndex()I

    .line 146
    .line 147
    .line 148
    move-result p0

    .line 149
    if-eq p0, p1, :cond_7

    .line 150
    .line 151
    invoke-virtual {p5, p1}, Lorg/angmarch/views/NiceSpinner;->setSelectedIndex(I)V

    .line 152
    .line 153
    .line 154
    :cond_7
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 155
    .line 156
    return-object p0
.end method

.method public static final i(Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Lorg/angmarch/views/NiceSpinner;Landroid/view/View;IJ)V
    .locals 0

    .line 1
    invoke-static {p0}, Le7/b0;->f(Landroidx/compose/runtime/State;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0, p4}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lz5/t1;

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Le7/b0;->g(Landroidx/compose/runtime/State;)Lkotlin/jvm/functions/Function1;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public static final j(Landroidx/compose/ui/Modifier;Ljava/util/List;JLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 8

    .line 1
    or-int/lit8 p5, p5, 0x1

    .line 2
    .line 3
    invoke-static {p5}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 4
    .line 5
    .line 6
    move-result v6

    .line 7
    move-object v0, p0

    .line 8
    move-object v1, p1

    .line 9
    move-wide v2, p2

    .line 10
    move-object v4, p4

    .line 11
    move v7, p6

    .line 12
    move-object v5, p7

    .line 13
    invoke-static/range {v0 .. v7}, Le7/b0;->e(Landroidx/compose/ui/Modifier;Ljava/util/List;JLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    .line 14
    .line 15
    .line 16
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 17
    .line 18
    return-object p0
.end method

.method public static final k(Landroid/content/Context;)Lorg/angmarch/views/NiceSpinner;
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lorg/angmarch/views/NiceSpinner;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lorg/angmarch/views/NiceSpinner;-><init>(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    const p0, 0x7f080197

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p0}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundResource(I)V

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {v0, p0}, Lorg/angmarch/views/NiceSpinner;->l(Ljava/util/List;)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    invoke-virtual {v0, p0}, Landroid/view/View;->setEnabled(Z)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method
