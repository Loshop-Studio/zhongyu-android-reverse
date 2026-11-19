.class public final Landroidx/compose/foundation/lazy/grid/LazyGridKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0082\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0088\u0001\u0010\u0000\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u0017\u00a2\u0006\u0002\u0008\u0019H\u0001\u00a2\u0006\u0002\u0010\u001a\u001a\u0088\u0001\u0010\u001b\u001a\u0019\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001c\u00a2\u0006\u0002\u0008\u00192\u000c\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\"0!2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0008\u0010\'\u001a\u0004\u0018\u00010(H\u0003\u00a2\u0006\u0002\u0010)\u00a8\u0006*"
    }
    d2 = {
        "LazyGrid",
        "",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "state",
        "Landroidx/compose/foundation/lazy/grid/LazyGridState;",
        "slots",
        "Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;",
        "contentPadding",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "reverseLayout",
        "",
        "isVertical",
        "flingBehavior",
        "Landroidx/compose/foundation/gestures/FlingBehavior;",
        "userScrollEnabled",
        "overscrollEffect",
        "Landroidx/compose/foundation/OverscrollEffect;",
        "verticalArrangement",
        "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
        "horizontalArrangement",
        "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
        "content",
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/lazy/grid/LazyGridScope;",
        "Lkotlin/ExtensionFunctionType;",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V",
        "rememberLazyGridMeasurePolicy",
        "Lkotlin/Function2;",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;",
        "Landroidx/compose/ui/unit/Constraints;",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "itemProviderLambda",
        "Lkotlin/Function0;",
        "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;",
        "coroutineScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "graphicsContext",
        "Landroidx/compose/ui/graphics/GraphicsContext;",
        "stickyItemsScrollBehavior",
        "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;",
        "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;",
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
        "SMAP\nLazyGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,422:1\n113#2:423\n557#3:424\n554#3,6:425\n1247#4,3:431\n1250#4,3:435\n1247#4,6:440\n555#5:434\n75#6:438\n75#6:439\n*S KotlinDebug\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt\n*L\n66#1:423\n88#1:424\n88#1:425,6\n88#1:431,3\n88#1:435,3\n180#1:440,6\n88#1:434\n89#1:438\n90#1:439\n*E\n"
    }
.end annotation


# direct methods
.method public static final LazyGrid(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V
    .locals 23
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/foundation/lazy/grid/LazyGridState;",
            "Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "ZZ",
            "Landroidx/compose/foundation/gestures/FlingBehavior;",
            "Z",
            "Landroidx/compose/foundation/OverscrollEffect;",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/foundation/lazy/grid/LazyGridScope;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    move/from16 v5, p5

    .line 6
    .line 7
    move/from16 v14, p7

    .line 8
    .line 9
    move-object/from16 v15, p11

    .line 10
    .line 11
    move/from16 v0, p13

    .line 12
    .line 13
    move/from16 v3, p15

    .line 14
    .line 15
    const v4, 0x2a3e8512

    .line 16
    .line 17
    .line 18
    move-object/from16 v6, p12

    .line 19
    .line 20
    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    and-int/lit8 v7, v3, 0x1

    .line 25
    .line 26
    if-eqz v7, :cond_0

    .line 27
    .line 28
    or-int/lit8 v10, v0, 0x6

    .line 29
    .line 30
    move v11, v10

    .line 31
    move-object/from16 v10, p0

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    and-int/lit8 v10, v0, 0x6

    .line 35
    .line 36
    if-nez v10, :cond_2

    .line 37
    .line 38
    move-object/from16 v10, p0

    .line 39
    .line 40
    invoke-interface {v6, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v11

    .line 44
    if-eqz v11, :cond_1

    .line 45
    .line 46
    const/4 v11, 0x4

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    const/4 v11, 0x2

    .line 49
    :goto_0
    or-int/2addr v11, v0

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    move-object/from16 v10, p0

    .line 52
    .line 53
    move v11, v0

    .line 54
    :goto_1
    and-int/lit8 v12, v3, 0x2

    .line 55
    .line 56
    const/16 v16, 0x20

    .line 57
    .line 58
    if-eqz v12, :cond_3

    .line 59
    .line 60
    or-int/lit8 v11, v11, 0x30

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_3
    and-int/lit8 v12, v0, 0x30

    .line 64
    .line 65
    if-nez v12, :cond_5

    .line 66
    .line 67
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v12

    .line 71
    if-eqz v12, :cond_4

    .line 72
    .line 73
    move/from16 v12, v16

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_4
    const/16 v12, 0x10

    .line 77
    .line 78
    :goto_2
    or-int/2addr v11, v12

    .line 79
    :cond_5
    :goto_3
    and-int/lit8 v12, v3, 0x4

    .line 80
    .line 81
    if-eqz v12, :cond_6

    .line 82
    .line 83
    or-int/lit16 v11, v11, 0x180

    .line 84
    .line 85
    goto :goto_6

    .line 86
    :cond_6
    and-int/lit16 v12, v0, 0x180

    .line 87
    .line 88
    if-nez v12, :cond_9

    .line 89
    .line 90
    and-int/lit16 v12, v0, 0x200

    .line 91
    .line 92
    if-nez v12, :cond_7

    .line 93
    .line 94
    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v12

    .line 98
    goto :goto_4

    .line 99
    :cond_7
    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v12

    .line 103
    :goto_4
    if-eqz v12, :cond_8

    .line 104
    .line 105
    const/16 v12, 0x100

    .line 106
    .line 107
    goto :goto_5

    .line 108
    :cond_8
    const/16 v12, 0x80

    .line 109
    .line 110
    :goto_5
    or-int/2addr v11, v12

    .line 111
    :cond_9
    :goto_6
    and-int/lit8 v12, v3, 0x8

    .line 112
    .line 113
    if-eqz v12, :cond_b

    .line 114
    .line 115
    or-int/lit16 v11, v11, 0xc00

    .line 116
    .line 117
    :cond_a
    move-object/from16 v8, p3

    .line 118
    .line 119
    goto :goto_8

    .line 120
    :cond_b
    and-int/lit16 v8, v0, 0xc00

    .line 121
    .line 122
    if-nez v8, :cond_a

    .line 123
    .line 124
    move-object/from16 v8, p3

    .line 125
    .line 126
    invoke-interface {v6, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v17

    .line 130
    if-eqz v17, :cond_c

    .line 131
    .line 132
    const/16 v17, 0x800

    .line 133
    .line 134
    goto :goto_7

    .line 135
    :cond_c
    const/16 v17, 0x400

    .line 136
    .line 137
    :goto_7
    or-int v11, v11, v17

    .line 138
    .line 139
    :goto_8
    and-int/lit8 v17, v3, 0x10

    .line 140
    .line 141
    if-eqz v17, :cond_e

    .line 142
    .line 143
    or-int/lit16 v11, v11, 0x6000

    .line 144
    .line 145
    :cond_d
    move/from16 v9, p4

    .line 146
    .line 147
    goto :goto_a

    .line 148
    :cond_e
    and-int/lit16 v9, v0, 0x6000

    .line 149
    .line 150
    if-nez v9, :cond_d

    .line 151
    .line 152
    move/from16 v9, p4

    .line 153
    .line 154
    invoke-interface {v6, v9}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 155
    .line 156
    .line 157
    move-result v19

    .line 158
    if-eqz v19, :cond_f

    .line 159
    .line 160
    const/16 v19, 0x4000

    .line 161
    .line 162
    goto :goto_9

    .line 163
    :cond_f
    const/16 v19, 0x2000

    .line 164
    .line 165
    :goto_9
    or-int v11, v11, v19

    .line 166
    .line 167
    :goto_a
    and-int/lit8 v19, v3, 0x20

    .line 168
    .line 169
    const/high16 v20, 0x30000

    .line 170
    .line 171
    if-eqz v19, :cond_10

    .line 172
    .line 173
    or-int v11, v11, v20

    .line 174
    .line 175
    goto :goto_c

    .line 176
    :cond_10
    and-int v19, v0, v20

    .line 177
    .line 178
    if-nez v19, :cond_12

    .line 179
    .line 180
    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 181
    .line 182
    .line 183
    move-result v19

    .line 184
    if-eqz v19, :cond_11

    .line 185
    .line 186
    const/high16 v19, 0x20000

    .line 187
    .line 188
    goto :goto_b

    .line 189
    :cond_11
    const/high16 v19, 0x10000

    .line 190
    .line 191
    :goto_b
    or-int v11, v11, v19

    .line 192
    .line 193
    :cond_12
    :goto_c
    const/high16 v19, 0x180000

    .line 194
    .line 195
    and-int v19, v0, v19

    .line 196
    .line 197
    if-nez v19, :cond_14

    .line 198
    .line 199
    and-int/lit8 v19, v3, 0x40

    .line 200
    .line 201
    move-object/from16 v13, p6

    .line 202
    .line 203
    if-nez v19, :cond_13

    .line 204
    .line 205
    invoke-interface {v6, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v20

    .line 209
    if-eqz v20, :cond_13

    .line 210
    .line 211
    const/high16 v20, 0x100000

    .line 212
    .line 213
    goto :goto_d

    .line 214
    :cond_13
    const/high16 v20, 0x80000

    .line 215
    .line 216
    :goto_d
    or-int v11, v11, v20

    .line 217
    .line 218
    goto :goto_e

    .line 219
    :cond_14
    move-object/from16 v13, p6

    .line 220
    .line 221
    :goto_e
    and-int/lit16 v4, v3, 0x80

    .line 222
    .line 223
    const/high16 v21, 0xc00000

    .line 224
    .line 225
    if-eqz v4, :cond_15

    .line 226
    .line 227
    or-int v11, v11, v21

    .line 228
    .line 229
    goto :goto_10

    .line 230
    :cond_15
    and-int v4, v0, v21

    .line 231
    .line 232
    if-nez v4, :cond_17

    .line 233
    .line 234
    invoke-interface {v6, v14}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 235
    .line 236
    .line 237
    move-result v4

    .line 238
    if-eqz v4, :cond_16

    .line 239
    .line 240
    const/high16 v4, 0x800000

    .line 241
    .line 242
    goto :goto_f

    .line 243
    :cond_16
    const/high16 v4, 0x400000

    .line 244
    .line 245
    :goto_f
    or-int/2addr v11, v4

    .line 246
    :cond_17
    :goto_10
    and-int/lit16 v4, v3, 0x100

    .line 247
    .line 248
    const/high16 v21, 0x6000000

    .line 249
    .line 250
    if-eqz v4, :cond_19

    .line 251
    .line 252
    or-int v11, v11, v21

    .line 253
    .line 254
    :cond_18
    move-object/from16 v4, p8

    .line 255
    .line 256
    goto :goto_12

    .line 257
    :cond_19
    and-int v4, v0, v21

    .line 258
    .line 259
    if-nez v4, :cond_18

    .line 260
    .line 261
    move-object/from16 v4, p8

    .line 262
    .line 263
    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result v21

    .line 267
    if-eqz v21, :cond_1a

    .line 268
    .line 269
    const/high16 v21, 0x4000000

    .line 270
    .line 271
    goto :goto_11

    .line 272
    :cond_1a
    const/high16 v21, 0x2000000

    .line 273
    .line 274
    :goto_11
    or-int v11, v11, v21

    .line 275
    .line 276
    :goto_12
    and-int/lit16 v0, v3, 0x200

    .line 277
    .line 278
    const/high16 v21, 0x30000000

    .line 279
    .line 280
    if-eqz v0, :cond_1c

    .line 281
    .line 282
    or-int v11, v11, v21

    .line 283
    .line 284
    :cond_1b
    move-object/from16 v0, p9

    .line 285
    .line 286
    goto :goto_14

    .line 287
    :cond_1c
    and-int v0, p13, v21

    .line 288
    .line 289
    if-nez v0, :cond_1b

    .line 290
    .line 291
    move-object/from16 v0, p9

    .line 292
    .line 293
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    move-result v21

    .line 297
    if-eqz v21, :cond_1d

    .line 298
    .line 299
    const/high16 v21, 0x20000000

    .line 300
    .line 301
    goto :goto_13

    .line 302
    :cond_1d
    const/high16 v21, 0x10000000

    .line 303
    .line 304
    :goto_13
    or-int v11, v11, v21

    .line 305
    .line 306
    :goto_14
    and-int/lit16 v0, v3, 0x400

    .line 307
    .line 308
    if-eqz v0, :cond_1e

    .line 309
    .line 310
    or-int/lit8 v0, p14, 0x6

    .line 311
    .line 312
    move/from16 v18, v0

    .line 313
    .line 314
    move-object/from16 v0, p10

    .line 315
    .line 316
    goto :goto_16

    .line 317
    :cond_1e
    and-int/lit8 v0, p14, 0x6

    .line 318
    .line 319
    if-nez v0, :cond_20

    .line 320
    .line 321
    move-object/from16 v0, p10

    .line 322
    .line 323
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    move-result v21

    .line 327
    if-eqz v21, :cond_1f

    .line 328
    .line 329
    const/16 v18, 0x4

    .line 330
    .line 331
    goto :goto_15

    .line 332
    :cond_1f
    const/16 v18, 0x2

    .line 333
    .line 334
    :goto_15
    or-int v18, p14, v18

    .line 335
    .line 336
    goto :goto_16

    .line 337
    :cond_20
    move-object/from16 v0, p10

    .line 338
    .line 339
    move/from16 v18, p14

    .line 340
    .line 341
    :goto_16
    and-int/lit16 v0, v3, 0x800

    .line 342
    .line 343
    if-eqz v0, :cond_22

    .line 344
    .line 345
    or-int/lit8 v18, v18, 0x30

    .line 346
    .line 347
    :cond_21
    :goto_17
    move/from16 v0, v18

    .line 348
    .line 349
    goto :goto_19

    .line 350
    :cond_22
    and-int/lit8 v0, p14, 0x30

    .line 351
    .line 352
    if-nez v0, :cond_21

    .line 353
    .line 354
    invoke-interface {v6, v15}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    move-result v0

    .line 358
    if-eqz v0, :cond_23

    .line 359
    .line 360
    goto :goto_18

    .line 361
    :cond_23
    const/16 v16, 0x10

    .line 362
    .line 363
    :goto_18
    or-int v18, v18, v16

    .line 364
    .line 365
    goto :goto_17

    .line 366
    :goto_19
    const v16, 0x12492493

    .line 367
    .line 368
    .line 369
    and-int v2, v11, v16

    .line 370
    .line 371
    const v3, 0x12492492

    .line 372
    .line 373
    .line 374
    const/4 v4, 0x0

    .line 375
    if-ne v2, v3, :cond_25

    .line 376
    .line 377
    and-int/lit8 v2, v0, 0x13

    .line 378
    .line 379
    const/16 v3, 0x12

    .line 380
    .line 381
    if-eq v2, v3, :cond_24

    .line 382
    .line 383
    goto :goto_1a

    .line 384
    :cond_24
    move v2, v4

    .line 385
    goto :goto_1b

    .line 386
    :cond_25
    :goto_1a
    const/4 v2, 0x1

    .line 387
    :goto_1b
    and-int/lit8 v3, v11, 0x1

    .line 388
    .line 389
    invoke-interface {v6, v2, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 390
    .line 391
    .line 392
    move-result v2

    .line 393
    if-eqz v2, :cond_33

    .line 394
    .line 395
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 396
    .line 397
    .line 398
    and-int/lit8 v2, p13, 0x1

    .line 399
    .line 400
    if-eqz v2, :cond_29

    .line 401
    .line 402
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 403
    .line 404
    .line 405
    move-result v2

    .line 406
    if-eqz v2, :cond_26

    .line 407
    .line 408
    goto :goto_1c

    .line 409
    :cond_26
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 410
    .line 411
    .line 412
    and-int/lit8 v2, p15, 0x40

    .line 413
    .line 414
    if-eqz v2, :cond_27

    .line 415
    .line 416
    const v2, -0x380001

    .line 417
    .line 418
    .line 419
    and-int/2addr v11, v2

    .line 420
    :cond_27
    move-object v3, v8

    .line 421
    move v4, v9

    .line 422
    move-object v2, v10

    .line 423
    :cond_28
    move v7, v11

    .line 424
    move-object/from16 v16, v13

    .line 425
    .line 426
    goto :goto_20

    .line 427
    :cond_29
    :goto_1c
    if-eqz v7, :cond_2a

    .line 428
    .line 429
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 430
    .line 431
    goto :goto_1d

    .line 432
    :cond_2a
    move-object v2, v10

    .line 433
    :goto_1d
    if-eqz v12, :cond_2b

    .line 434
    .line 435
    int-to-float v3, v4

    .line 436
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 437
    .line 438
    .line 439
    move-result v3

    .line 440
    invoke-static {v3}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-0680j_4(F)Landroidx/compose/foundation/layout/PaddingValues;

    .line 441
    .line 442
    .line 443
    move-result-object v3

    .line 444
    goto :goto_1e

    .line 445
    :cond_2b
    move-object v3, v8

    .line 446
    :goto_1e
    if-eqz v17, :cond_2c

    .line 447
    .line 448
    goto :goto_1f

    .line 449
    :cond_2c
    move v4, v9

    .line 450
    :goto_1f
    and-int/lit8 v7, p15, 0x40

    .line 451
    .line 452
    if-eqz v7, :cond_28

    .line 453
    .line 454
    sget-object v7, Landroidx/compose/foundation/gestures/ScrollableDefaults;->INSTANCE:Landroidx/compose/foundation/gestures/ScrollableDefaults;

    .line 455
    .line 456
    const/4 v8, 0x6

    .line 457
    invoke-virtual {v7, v6, v8}, Landroidx/compose/foundation/gestures/ScrollableDefaults;->flingBehavior(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/FlingBehavior;

    .line 458
    .line 459
    .line 460
    move-result-object v7

    .line 461
    const v8, -0x380001

    .line 462
    .line 463
    .line 464
    and-int/2addr v11, v8

    .line 465
    move-object/from16 v16, v7

    .line 466
    .line 467
    move v7, v11

    .line 468
    :goto_20
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 469
    .line 470
    .line 471
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 472
    .line 473
    .line 474
    move-result v8

    .line 475
    if-eqz v8, :cond_2d

    .line 476
    .line 477
    const-string/jumbo v8, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:82)"

    .line 478
    .line 479
    .line 480
    const v9, 0x2a3e8512

    .line 481
    .line 482
    .line 483
    invoke-static {v9, v7, v0, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 484
    .line 485
    .line 486
    :cond_2d
    shr-int/lit8 v8, v7, 0x3

    .line 487
    .line 488
    and-int/lit8 v8, v8, 0xe

    .line 489
    .line 490
    and-int/lit8 v9, v0, 0x70

    .line 491
    .line 492
    or-int/2addr v9, v8

    .line 493
    invoke-static {v1, v15, v6, v9}, Landroidx/compose/foundation/lazy/grid/LazyGridItemProviderKt;->rememberLazyGridItemProviderLambda(Landroidx/compose/foundation/lazy/grid/LazyGridState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;

    .line 494
    .line 495
    .line 496
    move-result-object v9

    .line 497
    shr-int/lit8 v17, v7, 0x9

    .line 498
    .line 499
    and-int/lit8 v10, v17, 0x70

    .line 500
    .line 501
    or-int/2addr v10, v8

    .line 502
    invoke-static {v1, v4, v6, v10}, Landroidx/compose/foundation/lazy/grid/LazySemanticsKt;->rememberLazyGridSemanticState(Landroidx/compose/foundation/lazy/grid/LazyGridState;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;

    .line 503
    .line 504
    .line 505
    move-result-object v18

    .line 506
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v10

    .line 510
    sget-object v11, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 511
    .line 512
    invoke-virtual {v11}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v11

    .line 516
    if-ne v10, v11, :cond_2e

    .line 517
    .line 518
    sget-object v10, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 519
    .line 520
    invoke-static {v10, v6}, Landroidx/compose/runtime/EffectsKt;->createCompositionCoroutineScope(Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;

    .line 521
    .line 522
    .line 523
    move-result-object v10

    .line 524
    invoke-interface {v6, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 525
    .line 526
    .line 527
    :cond_2e
    check-cast v10, Lkotlinx/coroutines/CoroutineScope;

    .line 528
    .line 529
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalGraphicsContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 530
    .line 531
    .line 532
    move-result-object v11

    .line 533
    invoke-interface {v6, v11}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v11

    .line 537
    check-cast v11, Landroidx/compose/ui/graphics/GraphicsContext;

    .line 538
    .line 539
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalScrollCaptureInProgress()Landroidx/compose/runtime/CompositionLocal;

    .line 540
    .line 541
    .line 542
    move-result-object v12

    .line 543
    invoke-interface {v6, v12}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v12

    .line 547
    check-cast v12, Ljava/lang/Boolean;

    .line 548
    .line 549
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 550
    .line 551
    .line 552
    move-result v12

    .line 553
    if-nez v12, :cond_2f

    .line 554
    .line 555
    sget-object v12, Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;->Companion:Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement$Companion;

    .line 556
    .line 557
    invoke-virtual {v12}, Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement$Companion;->getStickToTopPlacement()Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;

    .line 558
    .line 559
    .line 560
    move-result-object v12

    .line 561
    goto :goto_21

    .line 562
    :cond_2f
    const/4 v12, 0x0

    .line 563
    :goto_21
    const v13, 0x7fff0

    .line 564
    .line 565
    .line 566
    and-int/2addr v13, v7

    .line 567
    shl-int/lit8 v0, v0, 0x12

    .line 568
    .line 569
    const/high16 v19, 0x380000

    .line 570
    .line 571
    and-int v0, v0, v19

    .line 572
    .line 573
    or-int/2addr v0, v13

    .line 574
    shr-int/lit8 v13, v7, 0x6

    .line 575
    .line 576
    const/high16 v19, 0x1c00000

    .line 577
    .line 578
    and-int v13, v13, v19

    .line 579
    .line 580
    or-int/2addr v0, v13

    .line 581
    const/4 v13, 0x0

    .line 582
    move-object v14, v2

    .line 583
    move/from16 v19, v7

    .line 584
    .line 585
    move v15, v8

    .line 586
    move-object v8, v10

    .line 587
    move-object v10, v12

    .line 588
    move-object/from16 v2, p2

    .line 589
    .line 590
    move-object/from16 v7, p9

    .line 591
    .line 592
    move v12, v0

    .line 593
    move-object v0, v9

    .line 594
    move-object v9, v11

    .line 595
    move-object v11, v6

    .line 596
    move-object/from16 v6, p10

    .line 597
    .line 598
    invoke-static/range {v0 .. v13}, Landroidx/compose/foundation/lazy/grid/LazyGridKt;->rememberLazyGridMeasurePolicy(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;

    .line 599
    .line 600
    .line 601
    move-result-object v12

    .line 602
    move-object v8, v1

    .line 603
    move-object v13, v3

    .line 604
    move-object v6, v11

    .line 605
    if-eqz p5, :cond_30

    .line 606
    .line 607
    sget-object v1, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 608
    .line 609
    :goto_22
    move-object v2, v1

    .line 610
    goto :goto_23

    .line 611
    :cond_30
    sget-object v1, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    .line 612
    .line 613
    goto :goto_22

    .line 614
    :goto_23
    if-eqz p7, :cond_31

    .line 615
    .line 616
    const v1, -0x604146cc

    .line 617
    .line 618
    .line 619
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 620
    .line 621
    .line 622
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 623
    .line 624
    invoke-static {v8, v6, v15}, Landroidx/compose/foundation/lazy/grid/LazyGridBeyondBoundsModifierKt;->rememberLazyGridBeyondBoundsState(Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;

    .line 625
    .line 626
    .line 627
    move-result-object v3

    .line 628
    invoke-virtual {v8}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->getBeyondBoundsInfo$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;

    .line 629
    .line 630
    .line 631
    move-result-object v5

    .line 632
    invoke-static {v1, v3, v5, v4, v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierLocalKt;->lazyLayoutBeyondBoundsModifier(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;ZLandroidx/compose/foundation/gestures/Orientation;)Landroidx/compose/ui/Modifier;

    .line 633
    .line 634
    .line 635
    move-result-object v1

    .line 636
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 637
    .line 638
    .line 639
    :goto_24
    move-object v9, v1

    .line 640
    goto :goto_25

    .line 641
    :cond_31
    const v1, -0x603cc580

    .line 642
    .line 643
    .line 644
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 645
    .line 646
    .line 647
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 648
    .line 649
    .line 650
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 651
    .line 652
    goto :goto_24

    .line 653
    :goto_25
    invoke-virtual {v8}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->getRemeasurementModifier$foundation_release()Landroidx/compose/ui/layout/RemeasurementModifier;

    .line 654
    .line 655
    .line 656
    move-result-object v1

    .line 657
    invoke-interface {v14, v1}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 658
    .line 659
    .line 660
    move-result-object v1

    .line 661
    invoke-virtual {v8}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->getAwaitLayoutModifier$foundation_release()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;

    .line 662
    .line 663
    .line 664
    move-result-object v3

    .line 665
    invoke-interface {v1, v3}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 666
    .line 667
    .line 668
    move-result-object v1

    .line 669
    const v3, 0xe000

    .line 670
    .line 671
    .line 672
    and-int v3, v17, v3

    .line 673
    .line 674
    shl-int/lit8 v5, v19, 0x3

    .line 675
    .line 676
    const/high16 v7, 0x70000

    .line 677
    .line 678
    and-int/2addr v5, v7

    .line 679
    or-int v7, v3, v5

    .line 680
    .line 681
    move-object v3, v1

    .line 682
    move-object v1, v0

    .line 683
    move-object v0, v3

    .line 684
    move-object v3, v2

    .line 685
    move v5, v4

    .line 686
    move-object/from16 v2, v18

    .line 687
    .line 688
    move/from16 v4, p7

    .line 689
    .line 690
    invoke-static/range {v0 .. v7}, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsKt;->lazyLayoutSemantics(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    .line 691
    .line 692
    .line 693
    move-result-object v0

    .line 694
    move-object/from16 v17, v1

    .line 695
    .line 696
    move-object v2, v3

    .line 697
    move v4, v5

    .line 698
    move-object v15, v6

    .line 699
    invoke-interface {v0, v9}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 700
    .line 701
    .line 702
    move-result-object v0

    .line 703
    invoke-virtual {v8}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->getItemAnimator$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    .line 704
    .line 705
    .line 706
    move-result-object v1

    .line 707
    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->getModifier()Landroidx/compose/ui/Modifier;

    .line 708
    .line 709
    .line 710
    move-result-object v1

    .line 711
    invoke-interface {v0, v1}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 712
    .line 713
    .line 714
    move-result-object v0

    .line 715
    invoke-virtual {v8}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->getInternalInteractionSource$foundation_release()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 716
    .line 717
    .line 718
    move-result-object v6

    .line 719
    const/16 v10, 0x100

    .line 720
    .line 721
    const/4 v11, 0x0

    .line 722
    const/4 v7, 0x0

    .line 723
    const/4 v9, 0x0

    .line 724
    move/from16 v3, p7

    .line 725
    .line 726
    move-object v1, v8

    .line 727
    move-object/from16 v5, v16

    .line 728
    .line 729
    move-object/from16 v8, p8

    .line 730
    .line 731
    invoke-static/range {v0 .. v11}, Landroidx/compose/foundation/ScrollingContainerKt;->scrollingContainer$default(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLandroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/gestures/BringIntoViewSpec;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 732
    .line 733
    .line 734
    move-result-object v6

    .line 735
    move-object v0, v5

    .line 736
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->getPrefetchState$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;

    .line 737
    .line 738
    .line 739
    move-result-object v7

    .line 740
    const/4 v10, 0x0

    .line 741
    const/4 v11, 0x0

    .line 742
    move-object v8, v12

    .line 743
    move-object v9, v15

    .line 744
    move-object/from16 v5, v17

    .line 745
    .line 746
    invoke-static/range {v5 .. v11}, Landroidx/compose/foundation/lazy/layout/LazyLayoutKt;->LazyLayout(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    .line 747
    .line 748
    .line 749
    move-object v6, v9

    .line 750
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 751
    .line 752
    .line 753
    move-result v1

    .line 754
    if-eqz v1, :cond_32

    .line 755
    .line 756
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 757
    .line 758
    .line 759
    :cond_32
    move-object v7, v0

    .line 760
    move v5, v4

    .line 761
    move-object v4, v13

    .line 762
    move-object v1, v14

    .line 763
    goto :goto_26

    .line 764
    :cond_33
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 765
    .line 766
    .line 767
    move-object v4, v8

    .line 768
    move v5, v9

    .line 769
    move-object v1, v10

    .line 770
    move-object v7, v13

    .line 771
    :goto_26
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 772
    .line 773
    .line 774
    move-result-object v0

    .line 775
    if-eqz v0, :cond_34

    .line 776
    .line 777
    move-object v2, v0

    .line 778
    new-instance v0, Landroidx/compose/foundation/lazy/grid/LazyGridKt$LazyGrid$1;

    .line 779
    .line 780
    move-object/from16 v3, p2

    .line 781
    .line 782
    move/from16 v6, p5

    .line 783
    .line 784
    move/from16 v8, p7

    .line 785
    .line 786
    move-object/from16 v9, p8

    .line 787
    .line 788
    move-object/from16 v10, p9

    .line 789
    .line 790
    move-object/from16 v11, p10

    .line 791
    .line 792
    move-object/from16 v12, p11

    .line 793
    .line 794
    move/from16 v13, p13

    .line 795
    .line 796
    move/from16 v14, p14

    .line 797
    .line 798
    move/from16 v15, p15

    .line 799
    .line 800
    move-object/from16 v22, v2

    .line 801
    .line 802
    move-object/from16 v2, p1

    .line 803
    .line 804
    invoke-direct/range {v0 .. v15}, Landroidx/compose/foundation/lazy/grid/LazyGridKt$LazyGrid$1;-><init>(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;III)V

    .line 805
    .line 806
    .line 807
    move-object/from16 v2, v22

    .line 808
    .line 809
    invoke-interface {v2, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 810
    .line 811
    .line 812
    :cond_34
    return-void
.end method

.method private static final rememberLazyGridMeasurePolicy(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;
    .locals 18
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;",
            ">;",
            "Landroidx/compose/foundation/lazy/grid/LazyGridState;",
            "Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "ZZ",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Landroidx/compose/ui/graphics/GraphicsContext;",
            "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;",
            "Landroidx/compose/runtime/Composer;",
            "II)",
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;",
            "Landroidx/compose/ui/unit/Constraints;",
            "Landroidx/compose/ui/layout/MeasureResult;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p11

    .line 2
    .line 3
    move/from16 v1, p12

    .line 4
    .line 5
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    const v2, -0x78b8ec4d

    .line 12
    .line 13
    .line 14
    const-string/jumbo v3, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:179)"

    .line 15
    .line 16
    .line 17
    move/from16 v4, p13

    .line 18
    .line 19
    invoke-static {v2, v1, v4, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    and-int/lit8 v2, v1, 0x70

    .line 23
    .line 24
    xor-int/lit8 v2, v2, 0x30

    .line 25
    .line 26
    const/16 v3, 0x20

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    const/4 v5, 0x1

    .line 30
    move-object/from16 v7, p1

    .line 31
    .line 32
    if-le v2, v3, :cond_1

    .line 33
    .line 34
    invoke-interface {v0, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-nez v2, :cond_2

    .line 39
    .line 40
    :cond_1
    and-int/lit8 v2, v1, 0x30

    .line 41
    .line 42
    if-ne v2, v3, :cond_3

    .line 43
    .line 44
    :cond_2
    move v2, v5

    .line 45
    goto :goto_0

    .line 46
    :cond_3
    move v2, v4

    .line 47
    :goto_0
    and-int/lit16 v3, v1, 0x380

    .line 48
    .line 49
    xor-int/lit16 v3, v3, 0x180

    .line 50
    .line 51
    const/16 v6, 0x100

    .line 52
    .line 53
    move-object/from16 v12, p2

    .line 54
    .line 55
    if-le v3, v6, :cond_4

    .line 56
    .line 57
    invoke-interface {v0, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-nez v3, :cond_5

    .line 62
    .line 63
    :cond_4
    and-int/lit16 v3, v1, 0x180

    .line 64
    .line 65
    if-ne v3, v6, :cond_6

    .line 66
    .line 67
    :cond_5
    move v3, v5

    .line 68
    goto :goto_1

    .line 69
    :cond_6
    move v3, v4

    .line 70
    :goto_1
    or-int/2addr v2, v3

    .line 71
    and-int/lit16 v3, v1, 0x1c00

    .line 72
    .line 73
    xor-int/lit16 v3, v3, 0xc00

    .line 74
    .line 75
    const/16 v6, 0x800

    .line 76
    .line 77
    move-object/from16 v9, p3

    .line 78
    .line 79
    if-le v3, v6, :cond_7

    .line 80
    .line 81
    invoke-interface {v0, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-nez v3, :cond_8

    .line 86
    .line 87
    :cond_7
    and-int/lit16 v3, v1, 0xc00

    .line 88
    .line 89
    if-ne v3, v6, :cond_9

    .line 90
    .line 91
    :cond_8
    move v3, v5

    .line 92
    goto :goto_2

    .line 93
    :cond_9
    move v3, v4

    .line 94
    :goto_2
    or-int/2addr v2, v3

    .line 95
    const v3, 0xe000

    .line 96
    .line 97
    .line 98
    and-int/2addr v3, v1

    .line 99
    xor-int/lit16 v3, v3, 0x6000

    .line 100
    .line 101
    const/16 v6, 0x4000

    .line 102
    .line 103
    move/from16 v10, p4

    .line 104
    .line 105
    if-le v3, v6, :cond_a

    .line 106
    .line 107
    invoke-interface {v0, v10}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    if-nez v3, :cond_b

    .line 112
    .line 113
    :cond_a
    and-int/lit16 v3, v1, 0x6000

    .line 114
    .line 115
    if-ne v3, v6, :cond_c

    .line 116
    .line 117
    :cond_b
    move v3, v5

    .line 118
    goto :goto_3

    .line 119
    :cond_c
    move v3, v4

    .line 120
    :goto_3
    or-int/2addr v2, v3

    .line 121
    const/high16 v3, 0x70000

    .line 122
    .line 123
    and-int/2addr v3, v1

    .line 124
    const/high16 v6, 0x30000

    .line 125
    .line 126
    xor-int/2addr v3, v6

    .line 127
    const/high16 v8, 0x20000

    .line 128
    .line 129
    if-le v3, v8, :cond_d

    .line 130
    .line 131
    move/from16 v3, p5

    .line 132
    .line 133
    invoke-interface {v0, v3}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 134
    .line 135
    .line 136
    move-result v11

    .line 137
    if-nez v11, :cond_e

    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_d
    move/from16 v3, p5

    .line 141
    .line 142
    :goto_4
    and-int/2addr v6, v1

    .line 143
    if-ne v6, v8, :cond_f

    .line 144
    .line 145
    :cond_e
    move v6, v5

    .line 146
    goto :goto_5

    .line 147
    :cond_f
    move v6, v4

    .line 148
    :goto_5
    or-int/2addr v2, v6

    .line 149
    const/high16 v6, 0x380000

    .line 150
    .line 151
    and-int/2addr v6, v1

    .line 152
    const/high16 v8, 0x180000

    .line 153
    .line 154
    xor-int/2addr v6, v8

    .line 155
    const/high16 v11, 0x100000

    .line 156
    .line 157
    move-object/from16 v14, p6

    .line 158
    .line 159
    if-le v6, v11, :cond_10

    .line 160
    .line 161
    invoke-interface {v0, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v6

    .line 165
    if-nez v6, :cond_11

    .line 166
    .line 167
    :cond_10
    and-int v6, v1, v8

    .line 168
    .line 169
    if-ne v6, v11, :cond_12

    .line 170
    .line 171
    :cond_11
    move v6, v5

    .line 172
    goto :goto_6

    .line 173
    :cond_12
    move v6, v4

    .line 174
    :goto_6
    or-int/2addr v2, v6

    .line 175
    const/high16 v6, 0x1c00000

    .line 176
    .line 177
    and-int/2addr v6, v1

    .line 178
    const/high16 v8, 0xc00000

    .line 179
    .line 180
    xor-int/2addr v6, v8

    .line 181
    const/high16 v11, 0x800000

    .line 182
    .line 183
    move-object/from16 v13, p7

    .line 184
    .line 185
    if-le v6, v11, :cond_13

    .line 186
    .line 187
    invoke-interface {v0, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v6

    .line 191
    if-nez v6, :cond_14

    .line 192
    .line 193
    :cond_13
    and-int/2addr v1, v8

    .line 194
    if-ne v1, v11, :cond_15

    .line 195
    .line 196
    :cond_14
    move v4, v5

    .line 197
    :cond_15
    or-int v1, v2, v4

    .line 198
    .line 199
    move-object/from16 v2, p9

    .line 200
    .line 201
    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v4

    .line 205
    or-int/2addr v1, v4

    .line 206
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    if-nez v1, :cond_16

    .line 211
    .line 212
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 213
    .line 214
    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    if-ne v4, v1, :cond_17

    .line 219
    .line 220
    :cond_16
    new-instance v6, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;

    .line 221
    .line 222
    move-object/from16 v11, p0

    .line 223
    .line 224
    move-object/from16 v15, p8

    .line 225
    .line 226
    move-object/from16 v17, p10

    .line 227
    .line 228
    move-object/from16 v16, v2

    .line 229
    .line 230
    move v8, v3

    .line 231
    invoke-direct/range {v6 .. v17}, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;-><init>(Landroidx/compose/foundation/lazy/grid/LazyGridState;ZLandroidx/compose/foundation/layout/PaddingValues;ZLkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;)V

    .line 232
    .line 233
    .line 234
    invoke-interface {v0, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    move-object v4, v6

    .line 238
    :cond_17
    check-cast v4, Lkotlin/jvm/functions/Function2;

    .line 239
    .line 240
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 241
    .line 242
    .line 243
    move-result v0

    .line 244
    if-eqz v0, :cond_18

    .line 245
    .line 246
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 247
    .line 248
    .line 249
    :cond_18
    return-object v4
.end method
