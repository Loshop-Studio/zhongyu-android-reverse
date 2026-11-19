.class public final Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u0093\u0001\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\n2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00112\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014\u00a2\u0006\u0002\u0008\u0017H\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u001c"
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;",
        "state",
        "Landroidx/compose/foundation/gestures/Orientation;",
        "orientation",
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;",
        "slots",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "contentPadding",
        "",
        "reverseLayout",
        "Landroidx/compose/foundation/gestures/FlingBehavior;",
        "flingBehavior",
        "userScrollEnabled",
        "Landroidx/compose/foundation/OverscrollEffect;",
        "overscrollEffect",
        "Landroidx/compose/ui/unit/Dp;",
        "mainAxisSpacing",
        "crossAxisSpacing",
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;",
        "Ld6/s;",
        "Lkotlin/ExtensionFunctionType;",
        "content",
        "LazyStaggeredGrid-w41Enmo",
        "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;FFLr6/c;Landroidx/compose/runtime/Composer;III)V",
        "LazyStaggeredGrid",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLazyStaggeredGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGrid.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,126:1\n113#2:127\n113#2:128\n113#2:129\n557#3:130\n554#3,6:131\n1247#4,3:137\n1250#4,3:141\n555#5:140\n75#6:144\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGrid.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridKt\n*L\n48#1:127\n58#1:128\n60#1:129\n65#1:130\n65#1:131,6\n65#1:137,3\n65#1:141,3\n65#1:140\n66#1:144\n*E\n"
    }
.end annotation


# direct methods
.method public static final LazyStaggeredGrid-w41Enmo(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;FFLr6/c;Landroidx/compose/runtime/Composer;III)V
    .locals 25
    .param p0    # Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/foundation/gestures/Orientation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/ui/Modifier;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/foundation/layout/PaddingValues;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Landroidx/compose/foundation/gestures/FlingBehavior;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p8    # Landroidx/compose/foundation/OverscrollEffect;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p11    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p12    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;",
            "Landroidx/compose/foundation/gestures/Orientation;",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "Z",
            "Landroidx/compose/foundation/gestures/FlingBehavior;",
            "Z",
            "Landroidx/compose/foundation/OverscrollEffect;",
            "FF",
            "Lr6/c;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

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
    move-object/from16 v12, p11

    .line 8
    .line 9
    move/from16 v13, p13

    .line 10
    .line 11
    move/from16 v15, p15

    .line 12
    .line 13
    const v0, -0x71897a5e

    .line 14
    .line 15
    .line 16
    move-object/from16 v4, p12

    .line 17
    .line 18
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    and-int/lit8 v4, v15, 0x1

    .line 23
    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    or-int/lit8 v4, v13, 0x6

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    and-int/lit8 v4, v13, 0x6

    .line 30
    .line 31
    if-nez v4, :cond_2

    .line 32
    .line 33
    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_1

    .line 38
    .line 39
    const/4 v4, 0x4

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 v4, 0x2

    .line 42
    :goto_0
    or-int/2addr v4, v13

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    move v4, v13

    .line 45
    :goto_1
    and-int/lit8 v8, v15, 0x2

    .line 46
    .line 47
    if-eqz v8, :cond_3

    .line 48
    .line 49
    or-int/lit8 v4, v4, 0x30

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_3
    and-int/lit8 v8, v13, 0x30

    .line 53
    .line 54
    if-nez v8, :cond_5

    .line 55
    .line 56
    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    if-eqz v8, :cond_4

    .line 61
    .line 62
    const/16 v8, 0x20

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_4
    const/16 v8, 0x10

    .line 66
    .line 67
    :goto_2
    or-int/2addr v4, v8

    .line 68
    :cond_5
    :goto_3
    and-int/lit8 v8, v15, 0x4

    .line 69
    .line 70
    if-eqz v8, :cond_6

    .line 71
    .line 72
    or-int/lit16 v4, v4, 0x180

    .line 73
    .line 74
    goto :goto_6

    .line 75
    :cond_6
    and-int/lit16 v8, v13, 0x180

    .line 76
    .line 77
    if-nez v8, :cond_9

    .line 78
    .line 79
    and-int/lit16 v8, v13, 0x200

    .line 80
    .line 81
    if-nez v8, :cond_7

    .line 82
    .line 83
    invoke-interface {v5, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v8

    .line 87
    goto :goto_4

    .line 88
    :cond_7
    invoke-interface {v5, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    :goto_4
    if-eqz v8, :cond_8

    .line 93
    .line 94
    const/16 v8, 0x100

    .line 95
    .line 96
    goto :goto_5

    .line 97
    :cond_8
    const/16 v8, 0x80

    .line 98
    .line 99
    :goto_5
    or-int/2addr v4, v8

    .line 100
    :cond_9
    :goto_6
    and-int/lit8 v8, v15, 0x8

    .line 101
    .line 102
    if-eqz v8, :cond_b

    .line 103
    .line 104
    or-int/lit16 v4, v4, 0xc00

    .line 105
    .line 106
    :cond_a
    move-object/from16 v11, p3

    .line 107
    .line 108
    goto :goto_8

    .line 109
    :cond_b
    and-int/lit16 v11, v13, 0xc00

    .line 110
    .line 111
    if-nez v11, :cond_a

    .line 112
    .line 113
    move-object/from16 v11, p3

    .line 114
    .line 115
    invoke-interface {v5, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v14

    .line 119
    if-eqz v14, :cond_c

    .line 120
    .line 121
    const/16 v14, 0x800

    .line 122
    .line 123
    goto :goto_7

    .line 124
    :cond_c
    const/16 v14, 0x400

    .line 125
    .line 126
    :goto_7
    or-int/2addr v4, v14

    .line 127
    :goto_8
    and-int/lit8 v14, v15, 0x10

    .line 128
    .line 129
    if-eqz v14, :cond_e

    .line 130
    .line 131
    or-int/lit16 v4, v4, 0x6000

    .line 132
    .line 133
    :cond_d
    move-object/from16 v6, p4

    .line 134
    .line 135
    goto :goto_a

    .line 136
    :cond_e
    and-int/lit16 v6, v13, 0x6000

    .line 137
    .line 138
    if-nez v6, :cond_d

    .line 139
    .line 140
    move-object/from16 v6, p4

    .line 141
    .line 142
    invoke-interface {v5, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v16

    .line 146
    if-eqz v16, :cond_f

    .line 147
    .line 148
    const/16 v16, 0x4000

    .line 149
    .line 150
    goto :goto_9

    .line 151
    :cond_f
    const/16 v16, 0x2000

    .line 152
    .line 153
    :goto_9
    or-int v4, v4, v16

    .line 154
    .line 155
    :goto_a
    and-int/lit8 v16, v15, 0x20

    .line 156
    .line 157
    const/high16 v17, 0x30000

    .line 158
    .line 159
    if-eqz v16, :cond_10

    .line 160
    .line 161
    or-int v4, v4, v17

    .line 162
    .line 163
    move/from16 v7, p5

    .line 164
    .line 165
    goto :goto_c

    .line 166
    :cond_10
    and-int v17, v13, v17

    .line 167
    .line 168
    move/from16 v7, p5

    .line 169
    .line 170
    if-nez v17, :cond_12

    .line 171
    .line 172
    invoke-interface {v5, v7}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 173
    .line 174
    .line 175
    move-result v18

    .line 176
    if-eqz v18, :cond_11

    .line 177
    .line 178
    const/high16 v18, 0x20000

    .line 179
    .line 180
    goto :goto_b

    .line 181
    :cond_11
    const/high16 v18, 0x10000

    .line 182
    .line 183
    :goto_b
    or-int v4, v4, v18

    .line 184
    .line 185
    :cond_12
    :goto_c
    const/high16 v18, 0x180000

    .line 186
    .line 187
    and-int v18, v13, v18

    .line 188
    .line 189
    if-nez v18, :cond_14

    .line 190
    .line 191
    and-int/lit8 v18, v15, 0x40

    .line 192
    .line 193
    move-object/from16 v9, p6

    .line 194
    .line 195
    if-nez v18, :cond_13

    .line 196
    .line 197
    invoke-interface {v5, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v19

    .line 201
    if-eqz v19, :cond_13

    .line 202
    .line 203
    const/high16 v19, 0x100000

    .line 204
    .line 205
    goto :goto_d

    .line 206
    :cond_13
    const/high16 v19, 0x80000

    .line 207
    .line 208
    :goto_d
    or-int v4, v4, v19

    .line 209
    .line 210
    goto :goto_e

    .line 211
    :cond_14
    move-object/from16 v9, p6

    .line 212
    .line 213
    :goto_e
    and-int/lit16 v10, v15, 0x80

    .line 214
    .line 215
    const/high16 v20, 0xc00000

    .line 216
    .line 217
    if-eqz v10, :cond_15

    .line 218
    .line 219
    or-int v4, v4, v20

    .line 220
    .line 221
    move/from16 v0, p7

    .line 222
    .line 223
    goto :goto_10

    .line 224
    :cond_15
    and-int v20, v13, v20

    .line 225
    .line 226
    move/from16 v0, p7

    .line 227
    .line 228
    if-nez v20, :cond_17

    .line 229
    .line 230
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 231
    .line 232
    .line 233
    move-result v21

    .line 234
    if-eqz v21, :cond_16

    .line 235
    .line 236
    const/high16 v21, 0x800000

    .line 237
    .line 238
    goto :goto_f

    .line 239
    :cond_16
    const/high16 v21, 0x400000

    .line 240
    .line 241
    :goto_f
    or-int v4, v4, v21

    .line 242
    .line 243
    :cond_17
    :goto_10
    and-int/lit16 v0, v15, 0x100

    .line 244
    .line 245
    const/high16 v21, 0x6000000

    .line 246
    .line 247
    if-eqz v0, :cond_19

    .line 248
    .line 249
    or-int v4, v4, v21

    .line 250
    .line 251
    :cond_18
    move-object/from16 v0, p8

    .line 252
    .line 253
    goto :goto_12

    .line 254
    :cond_19
    and-int v0, v13, v21

    .line 255
    .line 256
    if-nez v0, :cond_18

    .line 257
    .line 258
    move-object/from16 v0, p8

    .line 259
    .line 260
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v21

    .line 264
    if-eqz v21, :cond_1a

    .line 265
    .line 266
    const/high16 v21, 0x4000000

    .line 267
    .line 268
    goto :goto_11

    .line 269
    :cond_1a
    const/high16 v21, 0x2000000

    .line 270
    .line 271
    :goto_11
    or-int v4, v4, v21

    .line 272
    .line 273
    :goto_12
    and-int/lit16 v0, v15, 0x200

    .line 274
    .line 275
    const/high16 v21, 0x30000000

    .line 276
    .line 277
    if-eqz v0, :cond_1c

    .line 278
    .line 279
    or-int v4, v4, v21

    .line 280
    .line 281
    :cond_1b
    move/from16 v21, v0

    .line 282
    .line 283
    move/from16 v0, p9

    .line 284
    .line 285
    goto :goto_14

    .line 286
    :cond_1c
    and-int v21, v13, v21

    .line 287
    .line 288
    if-nez v21, :cond_1b

    .line 289
    .line 290
    move/from16 v21, v0

    .line 291
    .line 292
    move/from16 v0, p9

    .line 293
    .line 294
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 295
    .line 296
    .line 297
    move-result v22

    .line 298
    if-eqz v22, :cond_1d

    .line 299
    .line 300
    const/high16 v22, 0x20000000

    .line 301
    .line 302
    goto :goto_13

    .line 303
    :cond_1d
    const/high16 v22, 0x10000000

    .line 304
    .line 305
    :goto_13
    or-int v4, v4, v22

    .line 306
    .line 307
    :goto_14
    and-int/lit16 v0, v15, 0x400

    .line 308
    .line 309
    if-eqz v0, :cond_1e

    .line 310
    .line 311
    or-int/lit8 v17, p14, 0x6

    .line 312
    .line 313
    move/from16 v22, v0

    .line 314
    .line 315
    move/from16 v0, p10

    .line 316
    .line 317
    goto :goto_16

    .line 318
    :cond_1e
    and-int/lit8 v22, p14, 0x6

    .line 319
    .line 320
    if-nez v22, :cond_20

    .line 321
    .line 322
    move/from16 v22, v0

    .line 323
    .line 324
    move/from16 v0, p10

    .line 325
    .line 326
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 327
    .line 328
    .line 329
    move-result v23

    .line 330
    if-eqz v23, :cond_1f

    .line 331
    .line 332
    const/16 v17, 0x4

    .line 333
    .line 334
    goto :goto_15

    .line 335
    :cond_1f
    const/16 v17, 0x2

    .line 336
    .line 337
    :goto_15
    or-int v17, p14, v17

    .line 338
    .line 339
    goto :goto_16

    .line 340
    :cond_20
    move/from16 v22, v0

    .line 341
    .line 342
    move/from16 v0, p10

    .line 343
    .line 344
    move/from16 v17, p14

    .line 345
    .line 346
    :goto_16
    and-int/lit16 v0, v15, 0x800

    .line 347
    .line 348
    if-eqz v0, :cond_22

    .line 349
    .line 350
    or-int/lit8 v17, v17, 0x30

    .line 351
    .line 352
    :cond_21
    :goto_17
    move/from16 v0, v17

    .line 353
    .line 354
    goto :goto_19

    .line 355
    :cond_22
    and-int/lit8 v0, p14, 0x30

    .line 356
    .line 357
    if-nez v0, :cond_21

    .line 358
    .line 359
    invoke-interface {v5, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 360
    .line 361
    .line 362
    move-result v0

    .line 363
    if-eqz v0, :cond_23

    .line 364
    .line 365
    const/16 v18, 0x20

    .line 366
    .line 367
    goto :goto_18

    .line 368
    :cond_23
    const/16 v18, 0x10

    .line 369
    .line 370
    :goto_18
    or-int v17, v17, v18

    .line 371
    .line 372
    goto :goto_17

    .line 373
    :goto_19
    const v17, 0x12492493

    .line 374
    .line 375
    .line 376
    and-int v2, v4, v17

    .line 377
    .line 378
    const/16 v18, 0x1

    .line 379
    .line 380
    const v3, 0x12492492

    .line 381
    .line 382
    .line 383
    if-ne v2, v3, :cond_25

    .line 384
    .line 385
    and-int/lit8 v2, v0, 0x13

    .line 386
    .line 387
    const/16 v3, 0x12

    .line 388
    .line 389
    if-eq v2, v3, :cond_24

    .line 390
    .line 391
    goto :goto_1a

    .line 392
    :cond_24
    const/4 v2, 0x0

    .line 393
    goto :goto_1b

    .line 394
    :cond_25
    :goto_1a
    move/from16 v2, v18

    .line 395
    .line 396
    :goto_1b
    and-int/lit8 v3, v4, 0x1

    .line 397
    .line 398
    invoke-interface {v5, v2, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 399
    .line 400
    .line 401
    move-result v2

    .line 402
    if-eqz v2, :cond_34

    .line 403
    .line 404
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 405
    .line 406
    .line 407
    and-int/lit8 v2, v13, 0x1

    .line 408
    .line 409
    if-eqz v2, :cond_28

    .line 410
    .line 411
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 412
    .line 413
    .line 414
    move-result v2

    .line 415
    if-eqz v2, :cond_26

    .line 416
    .line 417
    goto :goto_1d

    .line 418
    :cond_26
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 419
    .line 420
    .line 421
    and-int/lit8 v2, v15, 0x40

    .line 422
    .line 423
    if-eqz v2, :cond_27

    .line 424
    .line 425
    const v2, -0x380001

    .line 426
    .line 427
    .line 428
    and-int/2addr v4, v2

    .line 429
    :cond_27
    move/from16 v18, p7

    .line 430
    .line 431
    move-object v2, v6

    .line 432
    move v3, v7

    .line 433
    move-object/from16 v16, v9

    .line 434
    .line 435
    move-object v14, v11

    .line 436
    move/from16 v9, p9

    .line 437
    .line 438
    :goto_1c
    move/from16 v6, p10

    .line 439
    .line 440
    goto :goto_23

    .line 441
    :cond_28
    :goto_1d
    if-eqz v8, :cond_29

    .line 442
    .line 443
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 444
    .line 445
    goto :goto_1e

    .line 446
    :cond_29
    move-object v2, v11

    .line 447
    :goto_1e
    if-eqz v14, :cond_2a

    .line 448
    .line 449
    const/4 v3, 0x0

    .line 450
    int-to-float v6, v3

    .line 451
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 452
    .line 453
    .line 454
    move-result v3

    .line 455
    invoke-static {v3}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-0680j_4(F)Landroidx/compose/foundation/layout/PaddingValues;

    .line 456
    .line 457
    .line 458
    move-result-object v3

    .line 459
    goto :goto_1f

    .line 460
    :cond_2a
    move-object v3, v6

    .line 461
    :goto_1f
    if-eqz v16, :cond_2b

    .line 462
    .line 463
    const/4 v7, 0x0

    .line 464
    :cond_2b
    and-int/lit8 v6, v15, 0x40

    .line 465
    .line 466
    if-eqz v6, :cond_2c

    .line 467
    .line 468
    sget-object v6, Landroidx/compose/foundation/gestures/ScrollableDefaults;->INSTANCE:Landroidx/compose/foundation/gestures/ScrollableDefaults;

    .line 469
    .line 470
    const/4 v8, 0x6

    .line 471
    invoke-virtual {v6, v5, v8}, Landroidx/compose/foundation/gestures/ScrollableDefaults;->flingBehavior(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/FlingBehavior;

    .line 472
    .line 473
    .line 474
    move-result-object v6

    .line 475
    const v8, -0x380001

    .line 476
    .line 477
    .line 478
    and-int/2addr v4, v8

    .line 479
    goto :goto_20

    .line 480
    :cond_2c
    move-object v6, v9

    .line 481
    :goto_20
    if-eqz v10, :cond_2d

    .line 482
    .line 483
    goto :goto_21

    .line 484
    :cond_2d
    move/from16 v18, p7

    .line 485
    .line 486
    :goto_21
    const/4 v8, 0x0

    .line 487
    if-eqz v21, :cond_2e

    .line 488
    .line 489
    int-to-float v9, v8

    .line 490
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 491
    .line 492
    .line 493
    move-result v9

    .line 494
    goto :goto_22

    .line 495
    :cond_2e
    move/from16 v9, p9

    .line 496
    .line 497
    :goto_22
    if-eqz v22, :cond_2f

    .line 498
    .line 499
    int-to-float v8, v8

    .line 500
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 501
    .line 502
    .line 503
    move-result v8

    .line 504
    move-object v14, v2

    .line 505
    move-object v2, v3

    .line 506
    move-object/from16 v16, v6

    .line 507
    .line 508
    move v3, v7

    .line 509
    move v6, v8

    .line 510
    goto :goto_23

    .line 511
    :cond_2f
    move-object v14, v2

    .line 512
    move-object v2, v3

    .line 513
    move-object/from16 v16, v6

    .line 514
    .line 515
    move v3, v7

    .line 516
    goto :goto_1c

    .line 517
    :goto_23
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 518
    .line 519
    .line 520
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 521
    .line 522
    .line 523
    move-result v7

    .line 524
    if-eqz v7, :cond_30

    .line 525
    .line 526
    const-string v7, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:62)"

    .line 527
    .line 528
    const v8, -0x71897a5e

    .line 529
    .line 530
    .line 531
    invoke-static {v8, v4, v0, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 532
    .line 533
    .line 534
    :cond_30
    and-int/lit8 v7, v4, 0xe

    .line 535
    .line 536
    and-int/lit8 v8, v0, 0x70

    .line 537
    .line 538
    or-int/2addr v8, v7

    .line 539
    invoke-static {v1, v12, v5, v8}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProviderKt;->rememberStaggeredGridItemProviderLambda(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Lr6/c;Landroidx/compose/runtime/Composer;I)Lr6/a;

    .line 540
    .line 541
    .line 542
    move-result-object v8

    .line 543
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v10

    .line 547
    sget-object v11, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 548
    .line 549
    invoke-virtual {v11}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    move-result-object v11

    .line 553
    if-ne v10, v11, :cond_31

    .line 554
    .line 555
    sget-object v10, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 556
    .line 557
    invoke-static {v10, v5}, Landroidx/compose/runtime/EffectsKt;->createCompositionCoroutineScope(Lh6/h;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/v;

    .line 558
    .line 559
    .line 560
    move-result-object v10

    .line 561
    invoke-interface {v5, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 562
    .line 563
    .line 564
    :cond_31
    check-cast v10, Lkotlinx/coroutines/v;

    .line 565
    .line 566
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalGraphicsContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 567
    .line 568
    .line 569
    move-result-object v11

    .line 570
    invoke-interface {v5, v11}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object v11

    .line 574
    check-cast v11, Landroidx/compose/ui/graphics/GraphicsContext;

    .line 575
    .line 576
    move/from16 p12, v0

    .line 577
    .line 578
    shr-int/lit8 v0, v4, 0x6

    .line 579
    .line 580
    and-int/lit16 v1, v0, 0x380

    .line 581
    .line 582
    or-int/2addr v1, v7

    .line 583
    and-int/lit16 v0, v0, 0x1c00

    .line 584
    .line 585
    or-int/2addr v0, v1

    .line 586
    shl-int/lit8 v1, v4, 0x9

    .line 587
    .line 588
    const v19, 0xe000

    .line 589
    .line 590
    .line 591
    and-int v1, v1, v19

    .line 592
    .line 593
    or-int/2addr v0, v1

    .line 594
    shr-int/lit8 v19, v4, 0xc

    .line 595
    .line 596
    const/high16 v1, 0x70000

    .line 597
    .line 598
    and-int v1, v19, v1

    .line 599
    .line 600
    or-int/2addr v0, v1

    .line 601
    const/high16 v1, 0x380000

    .line 602
    .line 603
    const/16 v17, 0x12

    .line 604
    .line 605
    shl-int/lit8 v17, p12, 0x12

    .line 606
    .line 607
    and-int v1, v17, v1

    .line 608
    .line 609
    or-int/2addr v0, v1

    .line 610
    shl-int/lit8 v1, v4, 0x12

    .line 611
    .line 612
    const/high16 v17, 0xe000000

    .line 613
    .line 614
    and-int v1, v1, v17

    .line 615
    .line 616
    or-int/2addr v0, v1

    .line 617
    move/from16 v17, v4

    .line 618
    .line 619
    move v12, v7

    .line 620
    move-object v1, v8

    .line 621
    move-object v7, v10

    .line 622
    move-object/from16 v4, p1

    .line 623
    .line 624
    move-object/from16 v8, p2

    .line 625
    .line 626
    move-object v10, v5

    .line 627
    move v5, v9

    .line 628
    move-object v9, v11

    .line 629
    move v11, v0

    .line 630
    move-object/from16 v0, p0

    .line 631
    .line 632
    invoke-static/range {v0 .. v11}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt;->rememberStaggeredGridMeasurePolicy-qKj4JfE(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Lr6/a;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;FFLkotlinx/coroutines/v;Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/runtime/Composer;I)Lr6/e;

    .line 633
    .line 634
    .line 635
    move-result-object v20

    .line 636
    move-object v8, v0

    .line 637
    move-object/from16 v21, v2

    .line 638
    .line 639
    move-object v2, v4

    .line 640
    move/from16 v22, v5

    .line 641
    .line 642
    move/from16 v23, v6

    .line 643
    .line 644
    move-object v5, v10

    .line 645
    and-int/lit8 v0, v19, 0x70

    .line 646
    .line 647
    or-int/2addr v0, v12

    .line 648
    invoke-static {v8, v3, v5, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSemanticsKt;->rememberLazyStaggeredGridSemanticState(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;

    .line 649
    .line 650
    .line 651
    move-result-object v0

    .line 652
    if-eqz v18, :cond_32

    .line 653
    .line 654
    const v4, 0x720bf4ca

    .line 655
    .line 656
    .line 657
    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 658
    .line 659
    .line 660
    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 661
    .line 662
    invoke-static {v8, v5, v12}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridBeyondBoundsModifierKt;->rememberLazyStaggeredGridBeyondBoundsState(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;

    .line 663
    .line 664
    .line 665
    move-result-object v6

    .line 666
    invoke-virtual {v8}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->getBeyondBoundsInfo$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;

    .line 667
    .line 668
    .line 669
    move-result-object v7

    .line 670
    invoke-static {v4, v6, v7, v3, v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierLocalKt;->lazyLayoutBeyondBoundsModifier(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;ZLandroidx/compose/foundation/gestures/Orientation;)Landroidx/compose/ui/Modifier;

    .line 671
    .line 672
    .line 673
    move-result-object v4

    .line 674
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 675
    .line 676
    .line 677
    :goto_24
    move-object v9, v4

    .line 678
    goto :goto_25

    .line 679
    :cond_32
    const v4, 0x72109ba0

    .line 680
    .line 681
    .line 682
    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 683
    .line 684
    .line 685
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 686
    .line 687
    .line 688
    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 689
    .line 690
    goto :goto_24

    .line 691
    :goto_25
    invoke-virtual {v8}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->getRemeasurementModifier$foundation_release()Landroidx/compose/ui/layout/RemeasurementModifier;

    .line 692
    .line 693
    .line 694
    move-result-object v4

    .line 695
    invoke-interface {v14, v4}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 696
    .line 697
    .line 698
    move-result-object v4

    .line 699
    invoke-virtual {v8}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->getAwaitLayoutModifier$foundation_release()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;

    .line 700
    .line 701
    .line 702
    move-result-object v6

    .line 703
    invoke-interface {v4, v6}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 704
    .line 705
    .line 706
    move-result-object v4

    .line 707
    shl-int/lit8 v6, v17, 0x6

    .line 708
    .line 709
    and-int/lit16 v6, v6, 0x1c00

    .line 710
    .line 711
    shr-int/lit8 v7, v17, 0x9

    .line 712
    .line 713
    const v10, 0xe000

    .line 714
    .line 715
    .line 716
    and-int/2addr v7, v10

    .line 717
    or-int/2addr v6, v7

    .line 718
    const/high16 v7, 0x70000

    .line 719
    .line 720
    and-int v7, v17, v7

    .line 721
    .line 722
    or-int/2addr v7, v6

    .line 723
    move-object v6, v5

    .line 724
    move v5, v3

    .line 725
    move-object v3, v2

    .line 726
    move-object v2, v0

    .line 727
    move-object v0, v4

    .line 728
    move/from16 v4, v18

    .line 729
    .line 730
    invoke-static/range {v0 .. v7}, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsKt;->lazyLayoutSemantics(Landroidx/compose/ui/Modifier;Lr6/a;Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    .line 731
    .line 732
    .line 733
    move-result-object v0

    .line 734
    move-object/from16 v17, v1

    .line 735
    .line 736
    move v3, v5

    .line 737
    move-object v12, v6

    .line 738
    invoke-interface {v0, v9}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 739
    .line 740
    .line 741
    move-result-object v0

    .line 742
    invoke-virtual {v8}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->getItemAnimator$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    .line 743
    .line 744
    .line 745
    move-result-object v1

    .line 746
    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->getModifier()Landroidx/compose/ui/Modifier;

    .line 747
    .line 748
    .line 749
    move-result-object v1

    .line 750
    invoke-interface {v0, v1}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 751
    .line 752
    .line 753
    move-result-object v0

    .line 754
    invoke-virtual {v8}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->getMutableInteractionSource$foundation_release()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 755
    .line 756
    .line 757
    move-result-object v6

    .line 758
    const/16 v10, 0x100

    .line 759
    .line 760
    const/4 v11, 0x0

    .line 761
    const/4 v7, 0x0

    .line 762
    const/4 v9, 0x0

    .line 763
    move v1, v4

    .line 764
    move v4, v3

    .line 765
    move v3, v1

    .line 766
    move-object/from16 v2, p1

    .line 767
    .line 768
    move-object v1, v8

    .line 769
    move-object/from16 v5, v16

    .line 770
    .line 771
    move-object/from16 v8, p8

    .line 772
    .line 773
    invoke-static/range {v0 .. v11}, Landroidx/compose/foundation/ScrollingContainerKt;->scrollingContainer$default(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLandroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/gestures/BringIntoViewSpec;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 774
    .line 775
    .line 776
    move-result-object v0

    .line 777
    move/from16 v18, v3

    .line 778
    .line 779
    move v8, v4

    .line 780
    move-object v9, v5

    .line 781
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->getPrefetchState$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;

    .line 782
    .line 783
    .line 784
    move-result-object v3

    .line 785
    const/4 v6, 0x0

    .line 786
    move-object v2, v0

    .line 787
    move-object v5, v12

    .line 788
    move-object/from16 v1, v17

    .line 789
    .line 790
    move-object/from16 v4, v20

    .line 791
    .line 792
    invoke-static/range {v1 .. v7}, Landroidx/compose/foundation/lazy/layout/LazyLayoutKt;->LazyLayout(Lr6/a;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;Lr6/e;Landroidx/compose/runtime/Composer;II)V

    .line 793
    .line 794
    .line 795
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 796
    .line 797
    .line 798
    move-result v0

    .line 799
    if-eqz v0, :cond_33

    .line 800
    .line 801
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 802
    .line 803
    .line 804
    :cond_33
    move-object v12, v5

    .line 805
    move v6, v8

    .line 806
    move-object v4, v14

    .line 807
    move/from16 v8, v18

    .line 808
    .line 809
    move-object/from16 v5, v21

    .line 810
    .line 811
    move/from16 v10, v22

    .line 812
    .line 813
    move/from16 v11, v23

    .line 814
    .line 815
    :goto_26
    move-object v7, v9

    .line 816
    goto :goto_27

    .line 817
    :cond_34
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 818
    .line 819
    .line 820
    move/from16 v8, p7

    .line 821
    .line 822
    move/from16 v10, p9

    .line 823
    .line 824
    move-object v12, v5

    .line 825
    move-object v5, v6

    .line 826
    move v6, v7

    .line 827
    move-object v4, v11

    .line 828
    move/from16 v11, p10

    .line 829
    .line 830
    goto :goto_26

    .line 831
    :goto_27
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 832
    .line 833
    .line 834
    move-result-object v0

    .line 835
    if-eqz v0, :cond_35

    .line 836
    .line 837
    move-object v1, v0

    .line 838
    new-instance v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridKt$LazyStaggeredGrid$1;

    .line 839
    .line 840
    move-object/from16 v2, p1

    .line 841
    .line 842
    move-object/from16 v3, p2

    .line 843
    .line 844
    move-object/from16 v9, p8

    .line 845
    .line 846
    move-object/from16 v12, p11

    .line 847
    .line 848
    move/from16 v14, p14

    .line 849
    .line 850
    move-object/from16 v24, v1

    .line 851
    .line 852
    move-object/from16 v1, p0

    .line 853
    .line 854
    invoke-direct/range {v0 .. v15}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridKt$LazyStaggeredGrid$1;-><init>(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;FFLr6/c;III)V

    .line 855
    .line 856
    .line 857
    move-object/from16 v1, v24

    .line 858
    .line 859
    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 860
    .line 861
    .line 862
    :cond_35
    return-void
.end method
