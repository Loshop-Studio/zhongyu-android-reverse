.class public abstract Lx6/m;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Ljava/lang/String;Ljava/lang/String;Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p8}, Lx6/m;->k(Ljava/lang/String;Ljava/lang/String;Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lx6/m;->i(Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lx6/m;->j(Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Lkotlin/Unit;
    .locals 1

    .line 1
    invoke-static {}, Lx6/m;->g()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e(Ljava/lang/String;Ljava/lang/String;Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lx6/m;->h(Ljava/lang/String;Ljava/lang/String;Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Ljava/lang/String;Ljava/lang/String;Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v5, p4

    .line 6
    .line 7
    move/from16 v6, p6

    .line 8
    .line 9
    const-string v0, "title"

    .line 10
    .line 11
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "content"

    .line 15
    .line 16
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v0, "onConfirm"

    .line 20
    .line 21
    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const v0, -0x781988a1

    .line 25
    .line 26
    .line 27
    move-object/from16 v3, p5

    .line 28
    .line 29
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    and-int/lit8 v3, v6, 0x6

    .line 34
    .line 35
    const/4 v4, 0x4

    .line 36
    if-nez v3, :cond_1

    .line 37
    .line 38
    invoke-interface {v7, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_0

    .line 43
    .line 44
    move v3, v4

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const/4 v3, 0x2

    .line 47
    :goto_0
    or-int/2addr v3, v6

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    move v3, v6

    .line 50
    :goto_1
    and-int/lit8 v8, v6, 0x30

    .line 51
    .line 52
    if-nez v8, :cond_3

    .line 53
    .line 54
    invoke-interface {v7, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v8

    .line 58
    if-eqz v8, :cond_2

    .line 59
    .line 60
    const/16 v8, 0x20

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_2
    const/16 v8, 0x10

    .line 64
    .line 65
    :goto_2
    or-int/2addr v3, v8

    .line 66
    :cond_3
    and-int/lit8 v8, p7, 0x4

    .line 67
    .line 68
    if-eqz v8, :cond_5

    .line 69
    .line 70
    or-int/lit16 v3, v3, 0x180

    .line 71
    .line 72
    :cond_4
    move-object/from16 v9, p2

    .line 73
    .line 74
    goto :goto_4

    .line 75
    :cond_5
    and-int/lit16 v9, v6, 0x180

    .line 76
    .line 77
    if-nez v9, :cond_4

    .line 78
    .line 79
    move-object/from16 v9, p2

    .line 80
    .line 81
    invoke-interface {v7, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v10

    .line 85
    if-eqz v10, :cond_6

    .line 86
    .line 87
    const/16 v10, 0x100

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_6
    const/16 v10, 0x80

    .line 91
    .line 92
    :goto_3
    or-int/2addr v3, v10

    .line 93
    :goto_4
    and-int/lit8 v10, p7, 0x8

    .line 94
    .line 95
    if-eqz v10, :cond_8

    .line 96
    .line 97
    or-int/lit16 v3, v3, 0xc00

    .line 98
    .line 99
    :cond_7
    move-object/from16 v11, p3

    .line 100
    .line 101
    goto :goto_6

    .line 102
    :cond_8
    and-int/lit16 v11, v6, 0xc00

    .line 103
    .line 104
    if-nez v11, :cond_7

    .line 105
    .line 106
    move-object/from16 v11, p3

    .line 107
    .line 108
    invoke-interface {v7, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v12

    .line 112
    if-eqz v12, :cond_9

    .line 113
    .line 114
    const/16 v12, 0x800

    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_9
    const/16 v12, 0x400

    .line 118
    .line 119
    :goto_5
    or-int/2addr v3, v12

    .line 120
    :goto_6
    and-int/lit16 v12, v6, 0x6000

    .line 121
    .line 122
    if-nez v12, :cond_b

    .line 123
    .line 124
    invoke-interface {v7, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v12

    .line 128
    if-eqz v12, :cond_a

    .line 129
    .line 130
    const/16 v12, 0x4000

    .line 131
    .line 132
    goto :goto_7

    .line 133
    :cond_a
    const/16 v12, 0x2000

    .line 134
    .line 135
    :goto_7
    or-int/2addr v3, v12

    .line 136
    :cond_b
    and-int/lit16 v12, v3, 0x2493

    .line 137
    .line 138
    const/16 v13, 0x2492

    .line 139
    .line 140
    const/4 v14, 0x1

    .line 141
    if-eq v12, v13, :cond_c

    .line 142
    .line 143
    move v12, v14

    .line 144
    goto :goto_8

    .line 145
    :cond_c
    const/4 v12, 0x0

    .line 146
    :goto_8
    and-int/lit8 v13, v3, 0x1

    .line 147
    .line 148
    invoke-interface {v7, v12, v13}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 149
    .line 150
    .line 151
    move-result v12

    .line 152
    if-eqz v12, :cond_11

    .line 153
    .line 154
    if-eqz v8, :cond_d

    .line 155
    .line 156
    const/4 v8, 0x0

    .line 157
    goto :goto_9

    .line 158
    :cond_d
    move-object v8, v9

    .line 159
    :goto_9
    if-eqz v10, :cond_f

    .line 160
    .line 161
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v9

    .line 165
    sget-object v10, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 166
    .line 167
    invoke-virtual {v10}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v10

    .line 171
    if-ne v9, v10, :cond_e

    .line 172
    .line 173
    new-instance v9, Lx6/h;

    .line 174
    .line 175
    invoke-direct {v9}, Lx6/h;-><init>()V

    .line 176
    .line 177
    .line 178
    invoke-interface {v7, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    :cond_e
    check-cast v9, Lkotlin/jvm/functions/Function0;

    .line 182
    .line 183
    goto :goto_a

    .line 184
    :cond_f
    move-object v9, v11

    .line 185
    :goto_a
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 186
    .line 187
    .line 188
    move-result v10

    .line 189
    if-eqz v10, :cond_10

    .line 190
    .line 191
    const/4 v10, -0x1

    .line 192
    const-string v11, "com.zykj.student.dialogue.ui.widget.CommonDialog (CommonDialog.kt:28)"

    .line 193
    .line 194
    invoke-static {v0, v3, v10, v11}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 195
    .line 196
    .line 197
    :cond_10
    int-to-float v0, v4

    .line 198
    const/16 v3, 0x258

    .line 199
    .line 200
    int-to-float v3, v3

    .line 201
    div-float/2addr v0, v3

    .line 202
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    iget v3, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 211
    .line 212
    int-to-float v3, v3

    .line 213
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    .line 222
    .line 223
    div-float/2addr v3, v4

    .line 224
    mul-float/2addr v0, v3

    .line 225
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    invoke-static {v0}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 230
    .line 231
    .line 232
    move-result-object v10

    .line 233
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 234
    .line 235
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 236
    .line 237
    .line 238
    move-result-wide v11

    .line 239
    new-instance v0, Lx6/i;

    .line 240
    .line 241
    move-object v3, v8

    .line 242
    move-object v4, v9

    .line 243
    invoke-direct/range {v0 .. v5}, Lx6/i;-><init>(Ljava/lang/String;Ljava/lang/String;Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    .line 244
    .line 245
    .line 246
    const/16 v1, 0x36

    .line 247
    .line 248
    const v2, -0x2c02c1dc

    .line 249
    .line 250
    .line 251
    invoke-static {v2, v14, v0, v7, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 252
    .line 253
    .line 254
    move-result-object v16

    .line 255
    const v18, 0xc00180

    .line 256
    .line 257
    .line 258
    const/16 v19, 0x79

    .line 259
    .line 260
    move-object/from16 v17, v7

    .line 261
    .line 262
    const/4 v7, 0x0

    .line 263
    move-object v8, v10

    .line 264
    move-wide v9, v11

    .line 265
    const-wide/16 v11, 0x0

    .line 266
    .line 267
    const/4 v13, 0x0

    .line 268
    const/4 v14, 0x0

    .line 269
    const/4 v15, 0x0

    .line 270
    invoke-static/range {v7 .. v19}, Landroidx/compose/material3/SurfaceKt;->Surface-T9BRK9s(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    .line 271
    .line 272
    .line 273
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    if-eqz v0, :cond_12

    .line 278
    .line 279
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 280
    .line 281
    .line 282
    goto :goto_b

    .line 283
    :cond_11
    move-object/from16 v17, v7

    .line 284
    .line 285
    invoke-interface/range {v17 .. v17}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 286
    .line 287
    .line 288
    move-object v3, v9

    .line 289
    move-object v4, v11

    .line 290
    :cond_12
    :goto_b
    invoke-interface/range {v17 .. v17}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 291
    .line 292
    .line 293
    move-result-object v8

    .line 294
    if-eqz v8, :cond_13

    .line 295
    .line 296
    new-instance v0, Lx6/j;

    .line 297
    .line 298
    move-object/from16 v1, p0

    .line 299
    .line 300
    move-object/from16 v2, p1

    .line 301
    .line 302
    move-object/from16 v5, p4

    .line 303
    .line 304
    move/from16 v7, p7

    .line 305
    .line 306
    invoke-direct/range {v0 .. v7}, Lx6/j;-><init>(Ljava/lang/String;Ljava/lang/String;Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;II)V

    .line 307
    .line 308
    .line 309
    invoke-interface {v8, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 310
    .line 311
    .line 312
    :cond_13
    return-void
.end method

.method public static final g()Lkotlin/Unit;
    .locals 1

    .line 1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final h(Ljava/lang/String;Ljava/lang/String;Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 36

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v13, p5

    .line 4
    .line 5
    move/from16 v3, p6

    .line 6
    .line 7
    and-int/lit8 v4, v3, 0x3

    .line 8
    .line 9
    const/4 v5, 0x2

    .line 10
    const/4 v6, 0x1

    .line 11
    const/4 v7, 0x0

    .line 12
    if-eq v4, v5, :cond_0

    .line 13
    .line 14
    move v4, v6

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v4, v7

    .line 17
    :goto_0
    and-int/lit8 v5, v3, 0x1

    .line 18
    .line 19
    invoke-interface {v13, v4, v5}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-eqz v4, :cond_e

    .line 24
    .line 25
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    const/4 v4, -0x1

    .line 32
    const-string v5, "com.zykj.student.dialogue.ui.widget.CommonDialog.<anonymous> (CommonDialog.kt:30)"

    .line 33
    .line 34
    const v8, -0x2c02c1dc

    .line 35
    .line 36
    .line 37
    invoke-static {v8, v3, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 41
    .line 42
    const/16 v4, 0xd8

    .line 43
    .line 44
    int-to-float v4, v4

    .line 45
    const/16 v5, 0x258

    .line 46
    .line 47
    int-to-float v5, v5

    .line 48
    div-float/2addr v4, v5

    .line 49
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 50
    .line 51
    .line 52
    move-result-object v8

    .line 53
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    iget v8, v8, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 58
    .line 59
    int-to-float v8, v8

    .line 60
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 61
    .line 62
    .line 63
    move-result-object v9

    .line 64
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 65
    .line 66
    .line 67
    move-result-object v9

    .line 68
    iget v9, v9, Landroid/util/DisplayMetrics;->density:F

    .line 69
    .line 70
    div-float/2addr v8, v9

    .line 71
    mul-float/2addr v4, v8

    .line 72
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    const/16 v8, 0x73

    .line 77
    .line 78
    int-to-float v8, v8

    .line 79
    div-float/2addr v8, v5

    .line 80
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 85
    .line 86
    .line 87
    move-result-object v9

    .line 88
    iget v9, v9, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 89
    .line 90
    int-to-float v9, v9

    .line 91
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 92
    .line 93
    .line 94
    move-result-object v10

    .line 95
    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 96
    .line 97
    .line 98
    move-result-object v10

    .line 99
    iget v10, v10, Landroid/util/DisplayMetrics;->density:F

    .line 100
    .line 101
    div-float/2addr v9, v10

    .line 102
    mul-float/2addr v8, v9

    .line 103
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 104
    .line 105
    .line 106
    move-result v8

    .line 107
    invoke-static {v3, v4, v8}, Landroidx/compose/foundation/layout/SizeKt;->size-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    const/16 v8, 0xa

    .line 112
    .line 113
    int-to-float v8, v8

    .line 114
    div-float/2addr v8, v5

    .line 115
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 116
    .line 117
    .line 118
    move-result-object v9

    .line 119
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 120
    .line 121
    .line 122
    move-result-object v9

    .line 123
    iget v9, v9, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 124
    .line 125
    int-to-float v9, v9

    .line 126
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 127
    .line 128
    .line 129
    move-result-object v10

    .line 130
    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 131
    .line 132
    .line 133
    move-result-object v10

    .line 134
    iget v10, v10, Landroid/util/DisplayMetrics;->density:F

    .line 135
    .line 136
    div-float/2addr v9, v10

    .line 137
    mul-float/2addr v8, v9

    .line 138
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 139
    .line 140
    .line 141
    move-result v8

    .line 142
    const/16 v9, 0x13

    .line 143
    .line 144
    int-to-float v9, v9

    .line 145
    div-float/2addr v9, v5

    .line 146
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 147
    .line 148
    .line 149
    move-result-object v10

    .line 150
    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 151
    .line 152
    .line 153
    move-result-object v10

    .line 154
    iget v10, v10, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 155
    .line 156
    int-to-float v10, v10

    .line 157
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 158
    .line 159
    .line 160
    move-result-object v11

    .line 161
    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 162
    .line 163
    .line 164
    move-result-object v11

    .line 165
    iget v11, v11, Landroid/util/DisplayMetrics;->density:F

    .line 166
    .line 167
    div-float/2addr v10, v11

    .line 168
    mul-float/2addr v9, v10

    .line 169
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 170
    .line 171
    .line 172
    move-result v9

    .line 173
    invoke-static {v4, v8, v9}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    sget-object v28, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 178
    .line 179
    invoke-virtual/range {v28 .. v28}, Landroidx/compose/ui/Alignment$Companion;->getCenterHorizontally()Landroidx/compose/ui/Alignment$Horizontal;

    .line 180
    .line 181
    .line 182
    move-result-object v8

    .line 183
    sget-object v29, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 184
    .line 185
    invoke-virtual/range {v29 .. v29}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 186
    .line 187
    .line 188
    move-result-object v9

    .line 189
    const/16 v10, 0x30

    .line 190
    .line 191
    invoke-static {v9, v8, v13, v10}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 192
    .line 193
    .line 194
    move-result-object v8

    .line 195
    invoke-static {v13, v7}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 196
    .line 197
    .line 198
    move-result v9

    .line 199
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 200
    .line 201
    .line 202
    move-result-object v10

    .line 203
    invoke-static {v13, v4}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    sget-object v30, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 208
    .line 209
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 210
    .line 211
    .line 212
    move-result-object v11

    .line 213
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 214
    .line 215
    .line 216
    move-result-object v12

    .line 217
    if-nez v12, :cond_2

    .line 218
    .line 219
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 220
    .line 221
    .line 222
    :cond_2
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 223
    .line 224
    .line 225
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 226
    .line 227
    .line 228
    move-result v12

    .line 229
    if-eqz v12, :cond_3

    .line 230
    .line 231
    invoke-interface {v13, v11}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 232
    .line 233
    .line 234
    goto :goto_1

    .line 235
    :cond_3
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 236
    .line 237
    .line 238
    :goto_1
    invoke-static {v13}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 239
    .line 240
    .line 241
    move-result-object v11

    .line 242
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 243
    .line 244
    .line 245
    move-result-object v12

    .line 246
    invoke-static {v11, v8, v12}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 250
    .line 251
    .line 252
    move-result-object v8

    .line 253
    invoke-static {v11, v10, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 257
    .line 258
    .line 259
    move-result-object v8

    .line 260
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 261
    .line 262
    .line 263
    move-result v10

    .line 264
    if-nez v10, :cond_4

    .line 265
    .line 266
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v10

    .line 270
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 271
    .line 272
    .line 273
    move-result-object v12

    .line 274
    invoke-static {v10, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-result v10

    .line 278
    if-nez v10, :cond_5

    .line 279
    .line 280
    :cond_4
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 281
    .line 282
    .line 283
    move-result-object v10

    .line 284
    invoke-interface {v11, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 288
    .line 289
    .line 290
    move-result-object v9

    .line 291
    invoke-interface {v11, v9, v8}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 292
    .line 293
    .line 294
    :cond_5
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 295
    .line 296
    .line 297
    move-result-object v8

    .line 298
    invoke-static {v11, v4, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 299
    .line 300
    .line 301
    sget-object v31, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 302
    .line 303
    move v4, v5

    .line 304
    move v8, v6

    .line 305
    invoke-static {}, Lv6/a;->a()J

    .line 306
    .line 307
    .line 308
    move-result-wide v5

    .line 309
    const/16 v32, 0x8

    .line 310
    .line 311
    move v10, v7

    .line 312
    move v9, v8

    .line 313
    invoke-static/range {v32 .. v32}, Li6/b;->d(I)J

    .line 314
    .line 315
    .line 316
    move-result-wide v7

    .line 317
    sget-object v11, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    .line 318
    .line 319
    invoke-virtual {v11}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getMedium()Landroidx/compose/ui/text/font/FontWeight;

    .line 320
    .line 321
    .line 322
    move-result-object v11

    .line 323
    const/16 v26, 0x0

    .line 324
    .line 325
    const v27, 0x1ffd2

    .line 326
    .line 327
    .line 328
    move v12, v4

    .line 329
    const/4 v4, 0x0

    .line 330
    move v14, v9

    .line 331
    const/4 v9, 0x0

    .line 332
    move v15, v10

    .line 333
    move-object v10, v11

    .line 334
    const/4 v11, 0x0

    .line 335
    move/from16 v16, v12

    .line 336
    .line 337
    const-wide/16 v12, 0x0

    .line 338
    .line 339
    move/from16 v17, v14

    .line 340
    .line 341
    const/4 v14, 0x0

    .line 342
    move/from16 v18, v15

    .line 343
    .line 344
    const/4 v15, 0x0

    .line 345
    move/from16 v19, v16

    .line 346
    .line 347
    move/from16 v20, v17

    .line 348
    .line 349
    const-wide/16 v16, 0x0

    .line 350
    .line 351
    move/from16 v21, v18

    .line 352
    .line 353
    const/16 v18, 0x0

    .line 354
    .line 355
    move/from16 v22, v19

    .line 356
    .line 357
    const/16 v19, 0x0

    .line 358
    .line 359
    move/from16 v23, v20

    .line 360
    .line 361
    const/16 v20, 0x0

    .line 362
    .line 363
    move/from16 v24, v21

    .line 364
    .line 365
    const/16 v21, 0x0

    .line 366
    .line 367
    move/from16 v25, v22

    .line 368
    .line 369
    const/16 v22, 0x0

    .line 370
    .line 371
    move/from16 v33, v23

    .line 372
    .line 373
    const/16 v23, 0x0

    .line 374
    .line 375
    move/from16 v34, v25

    .line 376
    .line 377
    const v25, 0x30d80

    .line 378
    .line 379
    .line 380
    move-object v2, v3

    .line 381
    move/from16 v1, v24

    .line 382
    .line 383
    move-object/from16 v3, p0

    .line 384
    .line 385
    move-object/from16 v24, p5

    .line 386
    .line 387
    invoke-static/range {v3 .. v27}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 388
    .line 389
    .line 390
    move-object/from16 v13, v24

    .line 391
    .line 392
    const/16 v3, 0x9

    .line 393
    .line 394
    int-to-float v3, v3

    .line 395
    div-float v3, v3, v34

    .line 396
    .line 397
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 398
    .line 399
    .line 400
    move-result-object v4

    .line 401
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 402
    .line 403
    .line 404
    move-result-object v4

    .line 405
    iget v4, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 406
    .line 407
    int-to-float v4, v4

    .line 408
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 409
    .line 410
    .line 411
    move-result-object v5

    .line 412
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 413
    .line 414
    .line 415
    move-result-object v5

    .line 416
    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    .line 417
    .line 418
    div-float/2addr v4, v5

    .line 419
    mul-float/2addr v3, v4

    .line 420
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 421
    .line 422
    .line 423
    move-result v3

    .line 424
    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 425
    .line 426
    .line 427
    move-result-object v3

    .line 428
    const/4 v4, 0x6

    .line 429
    invoke-static {v3, v13, v4}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 430
    .line 431
    .line 432
    sget v3, Lcom/zykj/student/dialogue/R$color;->color_646566:I

    .line 433
    .line 434
    invoke-static {v3, v13, v1}, Landroidx/compose/ui/res/ColorResources_androidKt;->colorResource(ILandroidx/compose/runtime/Composer;I)J

    .line 435
    .line 436
    .line 437
    move-result-wide v5

    .line 438
    invoke-static/range {v32 .. v32}, Li6/b;->d(I)J

    .line 439
    .line 440
    .line 441
    move-result-wide v7

    .line 442
    const v27, 0x1fff2

    .line 443
    .line 444
    .line 445
    move v3, v4

    .line 446
    const/4 v4, 0x0

    .line 447
    const/4 v10, 0x0

    .line 448
    const-wide/16 v12, 0x0

    .line 449
    .line 450
    const/16 v25, 0xc00

    .line 451
    .line 452
    move-object/from16 v3, p1

    .line 453
    .line 454
    invoke-static/range {v3 .. v27}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 455
    .line 456
    .line 457
    move-object/from16 v3, v24

    .line 458
    .line 459
    const/4 v13, 0x2

    .line 460
    const/high16 v11, 0x3f800000    # 1.0f

    .line 461
    .line 462
    const/4 v12, 0x0

    .line 463
    move-object v10, v2

    .line 464
    move-object/from16 v9, v31

    .line 465
    .line 466
    invoke-static/range {v9 .. v14}, Landroidx/compose/foundation/layout/ColumnScope;->weight$default(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 467
    .line 468
    .line 469
    move-result-object v2

    .line 470
    move-object v4, v10

    .line 471
    invoke-static {v2, v3, v1}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 472
    .line 473
    .line 474
    const/4 v2, 0x0

    .line 475
    const/4 v5, 0x0

    .line 476
    const/4 v9, 0x1

    .line 477
    invoke-static {v4, v2, v9, v5}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 478
    .line 479
    .line 480
    move-result-object v2

    .line 481
    invoke-virtual/range {v29 .. v29}, Landroidx/compose/foundation/layout/Arrangement;->getSpaceAround()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 482
    .line 483
    .line 484
    move-result-object v5

    .line 485
    invoke-virtual/range {v28 .. v28}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    .line 486
    .line 487
    .line 488
    move-result-object v6

    .line 489
    const/4 v7, 0x6

    .line 490
    invoke-static {v5, v6, v3, v7}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 491
    .line 492
    .line 493
    move-result-object v5

    .line 494
    invoke-static {v3, v1}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 495
    .line 496
    .line 497
    move-result v1

    .line 498
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 499
    .line 500
    .line 501
    move-result-object v6

    .line 502
    invoke-static {v3, v2}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 503
    .line 504
    .line 505
    move-result-object v2

    .line 506
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 507
    .line 508
    .line 509
    move-result-object v7

    .line 510
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 511
    .line 512
    .line 513
    move-result-object v8

    .line 514
    if-nez v8, :cond_6

    .line 515
    .line 516
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 517
    .line 518
    .line 519
    :cond_6
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 520
    .line 521
    .line 522
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 523
    .line 524
    .line 525
    move-result v8

    .line 526
    if-eqz v8, :cond_7

    .line 527
    .line 528
    invoke-interface {v3, v7}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 529
    .line 530
    .line 531
    goto :goto_2

    .line 532
    :cond_7
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 533
    .line 534
    .line 535
    :goto_2
    invoke-static {v3}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 536
    .line 537
    .line 538
    move-result-object v7

    .line 539
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 540
    .line 541
    .line 542
    move-result-object v8

    .line 543
    invoke-static {v7, v5, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 544
    .line 545
    .line 546
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 547
    .line 548
    .line 549
    move-result-object v5

    .line 550
    invoke-static {v7, v6, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 551
    .line 552
    .line 553
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 554
    .line 555
    .line 556
    move-result-object v5

    .line 557
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 558
    .line 559
    .line 560
    move-result v6

    .line 561
    if-nez v6, :cond_8

    .line 562
    .line 563
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    move-result-object v6

    .line 567
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 568
    .line 569
    .line 570
    move-result-object v8

    .line 571
    invoke-static {v6, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 572
    .line 573
    .line 574
    move-result v6

    .line 575
    if-nez v6, :cond_9

    .line 576
    .line 577
    :cond_8
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 578
    .line 579
    .line 580
    move-result-object v6

    .line 581
    invoke-interface {v7, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 582
    .line 583
    .line 584
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 585
    .line 586
    .line 587
    move-result-object v1

    .line 588
    invoke-interface {v7, v1, v5}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 589
    .line 590
    .line 591
    :cond_9
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 592
    .line 593
    .line 594
    move-result-object v1

    .line 595
    invoke-static {v7, v2, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 596
    .line 597
    .line 598
    sget-object v1, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 599
    .line 600
    invoke-static/range {v32 .. v32}, Li6/b;->d(I)J

    .line 601
    .line 602
    .line 603
    move-result-wide v7

    .line 604
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 605
    .line 606
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 607
    .line 608
    .line 609
    move-result-wide v9

    .line 610
    const/16 v1, 0x18

    .line 611
    .line 612
    int-to-float v1, v1

    .line 613
    div-float v1, v1, v34

    .line 614
    .line 615
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 616
    .line 617
    .line 618
    move-result-object v2

    .line 619
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 620
    .line 621
    .line 622
    move-result-object v2

    .line 623
    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 624
    .line 625
    int-to-float v2, v2

    .line 626
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 627
    .line 628
    .line 629
    move-result-object v5

    .line 630
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 631
    .line 632
    .line 633
    move-result-object v5

    .line 634
    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    .line 635
    .line 636
    div-float/2addr v2, v5

    .line 637
    mul-float/2addr v2, v1

    .line 638
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 639
    .line 640
    .line 641
    move-result v2

    .line 642
    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 643
    .line 644
    .line 645
    move-result-object v2

    .line 646
    const/16 v5, 0x38

    .line 647
    .line 648
    int-to-float v5, v5

    .line 649
    div-float v19, v5, v34

    .line 650
    .line 651
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 652
    .line 653
    .line 654
    move-result-object v5

    .line 655
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 656
    .line 657
    .line 658
    move-result-object v5

    .line 659
    iget v5, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 660
    .line 661
    int-to-float v5, v5

    .line 662
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 663
    .line 664
    .line 665
    move-result-object v6

    .line 666
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 667
    .line 668
    .line 669
    move-result-object v6

    .line 670
    iget v6, v6, Landroid/util/DisplayMetrics;->density:F

    .line 671
    .line 672
    div-float/2addr v5, v6

    .line 673
    mul-float v5, v5, v19

    .line 674
    .line 675
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 676
    .line 677
    .line 678
    move-result v5

    .line 679
    invoke-static {v2, v5}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 680
    .line 681
    .line 682
    move-result-object v2

    .line 683
    const/high16 v5, 0x3f800000    # 1.0f

    .line 684
    .line 685
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 686
    .line 687
    .line 688
    move-result v5

    .line 689
    invoke-static {}, Lv6/a;->k()J

    .line 690
    .line 691
    .line 692
    move-result-wide v11

    .line 693
    invoke-static {v5, v11, v12}, Landroidx/compose/foundation/BorderStrokeKt;->BorderStroke-cXLIe8U(FJ)Landroidx/compose/foundation/BorderStroke;

    .line 694
    .line 695
    .line 696
    move-result-object v12

    .line 697
    invoke-static {}, Lv6/a;->k()J

    .line 698
    .line 699
    .line 700
    move-result-wide v5

    .line 701
    const/16 v11, 0xc

    .line 702
    .line 703
    int-to-float v11, v11

    .line 704
    div-float v20, v11, v34

    .line 705
    .line 706
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 707
    .line 708
    .line 709
    move-result-object v11

    .line 710
    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 711
    .line 712
    .line 713
    move-result-object v11

    .line 714
    iget v11, v11, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 715
    .line 716
    int-to-float v11, v11

    .line 717
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 718
    .line 719
    .line 720
    move-result-object v13

    .line 721
    invoke-virtual {v13}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 722
    .line 723
    .line 724
    move-result-object v13

    .line 725
    iget v13, v13, Landroid/util/DisplayMetrics;->density:F

    .line 726
    .line 727
    div-float/2addr v11, v13

    .line 728
    mul-float v11, v11, v20

    .line 729
    .line 730
    invoke-static {v11}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 731
    .line 732
    .line 733
    move-result v11

    .line 734
    invoke-static {v11}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 735
    .line 736
    .line 737
    move-result-object v11

    .line 738
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 739
    .line 740
    .line 741
    move-result v13

    .line 742
    move-object/from16 v14, p3

    .line 743
    .line 744
    invoke-interface {v3, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 745
    .line 746
    .line 747
    move-result v15

    .line 748
    or-int/2addr v13, v15

    .line 749
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 750
    .line 751
    .line 752
    move-result-object v15

    .line 753
    if-nez v13, :cond_a

    .line 754
    .line 755
    sget-object v13, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 756
    .line 757
    invoke-virtual {v13}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 758
    .line 759
    .line 760
    move-result-object v13

    .line 761
    if-ne v15, v13, :cond_b

    .line 762
    .line 763
    :cond_a
    new-instance v15, Lx6/k;

    .line 764
    .line 765
    invoke-direct {v15, v0, v14}, Lx6/k;-><init>(Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function0;)V

    .line 766
    .line 767
    .line 768
    invoke-interface {v3, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 769
    .line 770
    .line 771
    :cond_b
    check-cast v15, Lkotlin/jvm/functions/Function0;

    .line 772
    .line 773
    const v17, 0x1b6d86

    .line 774
    .line 775
    .line 776
    const/16 v18, 0x180

    .line 777
    .line 778
    move-object v13, v4

    .line 779
    move-object v4, v11

    .line 780
    const-string v11, "\u53d6\u6d88"

    .line 781
    .line 782
    move-object v14, v13

    .line 783
    const/4 v13, 0x0

    .line 784
    move-object/from16 v16, v14

    .line 785
    .line 786
    const/4 v14, 0x0

    .line 787
    move-object/from16 v35, v3

    .line 788
    .line 789
    move-object v3, v2

    .line 790
    move-object/from16 v2, v16

    .line 791
    .line 792
    move-object/from16 v16, v35

    .line 793
    .line 794
    invoke-static/range {v3 .. v18}, Lx6/g;->e(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJJLjava/lang/String;Landroidx/compose/foundation/BorderStroke;ZLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    .line 795
    .line 796
    .line 797
    move-object/from16 v13, v16

    .line 798
    .line 799
    invoke-static/range {v32 .. v32}, Li6/b;->d(I)J

    .line 800
    .line 801
    .line 802
    move-result-wide v4

    .line 803
    invoke-static {}, Lv6/a;->k()J

    .line 804
    .line 805
    .line 806
    move-result-wide v6

    .line 807
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 808
    .line 809
    .line 810
    move-result-object v3

    .line 811
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 812
    .line 813
    .line 814
    move-result-object v3

    .line 815
    iget v3, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 816
    .line 817
    int-to-float v3, v3

    .line 818
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 819
    .line 820
    .line 821
    move-result-object v8

    .line 822
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 823
    .line 824
    .line 825
    move-result-object v8

    .line 826
    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    .line 827
    .line 828
    div-float/2addr v3, v8

    .line 829
    mul-float/2addr v1, v3

    .line 830
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 831
    .line 832
    .line 833
    move-result v1

    .line 834
    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 835
    .line 836
    .line 837
    move-result-object v1

    .line 838
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 839
    .line 840
    .line 841
    move-result-object v2

    .line 842
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 843
    .line 844
    .line 845
    move-result-object v2

    .line 846
    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 847
    .line 848
    int-to-float v2, v2

    .line 849
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 850
    .line 851
    .line 852
    move-result-object v3

    .line 853
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 854
    .line 855
    .line 856
    move-result-object v3

    .line 857
    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    .line 858
    .line 859
    div-float/2addr v2, v3

    .line 860
    mul-float v19, v19, v2

    .line 861
    .line 862
    invoke-static/range {v19 .. v19}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 863
    .line 864
    .line 865
    move-result v2

    .line 866
    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 867
    .line 868
    .line 869
    move-result-object v1

    .line 870
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 871
    .line 872
    .line 873
    move-result-object v2

    .line 874
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 875
    .line 876
    .line 877
    move-result-object v2

    .line 878
    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 879
    .line 880
    int-to-float v2, v2

    .line 881
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 882
    .line 883
    .line 884
    move-result-object v3

    .line 885
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 886
    .line 887
    .line 888
    move-result-object v3

    .line 889
    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    .line 890
    .line 891
    div-float/2addr v2, v3

    .line 892
    mul-float v20, v20, v2

    .line 893
    .line 894
    invoke-static/range {v20 .. v20}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 895
    .line 896
    .line 897
    move-result v2

    .line 898
    invoke-static {v2}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 899
    .line 900
    .line 901
    move-result-object v2

    .line 902
    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 903
    .line 904
    .line 905
    move-result v3

    .line 906
    move-object/from16 v8, p4

    .line 907
    .line 908
    invoke-interface {v13, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 909
    .line 910
    .line 911
    move-result v9

    .line 912
    or-int/2addr v3, v9

    .line 913
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 914
    .line 915
    .line 916
    move-result-object v9

    .line 917
    if-nez v3, :cond_c

    .line 918
    .line 919
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 920
    .line 921
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 922
    .line 923
    .line 924
    move-result-object v3

    .line 925
    if-ne v9, v3, :cond_d

    .line 926
    .line 927
    :cond_c
    new-instance v9, Lx6/l;

    .line 928
    .line 929
    invoke-direct {v9, v0, v8}, Lx6/l;-><init>(Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function0;)V

    .line 930
    .line 931
    .line 932
    invoke-interface {v13, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 933
    .line 934
    .line 935
    :cond_d
    move-object v12, v9

    .line 936
    check-cast v12, Lkotlin/jvm/functions/Function0;

    .line 937
    .line 938
    const v14, 0x36c06

    .line 939
    .line 940
    .line 941
    const/16 v15, 0x1c4

    .line 942
    .line 943
    move-object v0, v1

    .line 944
    move-object v1, v2

    .line 945
    const-wide/16 v2, 0x0

    .line 946
    .line 947
    const-string v8, "\u786e\u5b9a"

    .line 948
    .line 949
    const/4 v9, 0x0

    .line 950
    const/4 v10, 0x0

    .line 951
    const/4 v11, 0x0

    .line 952
    invoke-static/range {v0 .. v15}, Lx6/g;->e(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJJLjava/lang/String;Landroidx/compose/foundation/BorderStroke;ZLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    .line 953
    .line 954
    .line 955
    invoke-interface/range {p5 .. p5}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 956
    .line 957
    .line 958
    invoke-interface/range {p5 .. p5}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 959
    .line 960
    .line 961
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 962
    .line 963
    .line 964
    move-result v0

    .line 965
    if-eqz v0, :cond_f

    .line 966
    .line 967
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 968
    .line 969
    .line 970
    goto :goto_3

    .line 971
    :cond_e
    invoke-interface/range {p5 .. p5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 972
    .line 973
    .line 974
    :cond_f
    :goto_3
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 975
    .line 976
    return-object v0
.end method

.method public static final i(Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
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

.method public static final j(Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
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

.method public static final k(Ljava/lang/String;Ljava/lang/String;Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
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
    move-object v2, p2

    .line 10
    move-object v3, p3

    .line 11
    move-object v4, p4

    .line 12
    move v7, p6

    .line 13
    move-object v5, p7

    .line 14
    invoke-static/range {v0 .. v7}, Lx6/m;->f(Ljava/lang/String;Ljava/lang/String;Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    .line 15
    .line 16
    .line 17
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 18
    .line 19
    return-object p0
.end method
