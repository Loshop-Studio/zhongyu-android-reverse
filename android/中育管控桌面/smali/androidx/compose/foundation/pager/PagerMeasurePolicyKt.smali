.class public final Landroidx/compose/foundation/pager/PagerMeasurePolicyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u00a1\u0001\u0010\u0000\u001a\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001\u00a2\u0006\u0002\u0008\u00052\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0007H\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008 \u0010!\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\""
    }
    d2 = {
        "rememberPagerMeasurePolicy",
        "Lkotlin/Function2;",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;",
        "Landroidx/compose/ui/unit/Constraints;",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "Lkotlin/ExtensionFunctionType;",
        "itemProviderLambda",
        "Lkotlin/Function0;",
        "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;",
        "state",
        "Landroidx/compose/foundation/pager/PagerState;",
        "contentPadding",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "reverseLayout",
        "",
        "orientation",
        "Landroidx/compose/foundation/gestures/Orientation;",
        "beyondViewportPageCount",
        "",
        "pageSpacing",
        "Landroidx/compose/ui/unit/Dp;",
        "pageSize",
        "Landroidx/compose/foundation/pager/PageSize;",
        "horizontalAlignment",
        "Landroidx/compose/ui/Alignment$Horizontal;",
        "verticalAlignment",
        "Landroidx/compose/ui/Alignment$Vertical;",
        "snapPosition",
        "Landroidx/compose/foundation/gestures/snapping/SnapPosition;",
        "coroutineScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "pageCount",
        "rememberPagerMeasurePolicy-8u0NR3k",
        "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;IFLandroidx/compose/foundation/pager/PageSize;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;",
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
        "SMAP\nPagerMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasurePolicy.kt\nandroidx/compose/foundation/pager/PagerMeasurePolicyKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,223:1\n1247#2,6:224\n*S KotlinDebug\n*F\n+ 1 PagerMeasurePolicy.kt\nandroidx/compose/foundation/pager/PagerMeasurePolicyKt\n*L\n58#1:224,6\n*E\n"
    }
.end annotation


# direct methods
.method public static final rememberPagerMeasurePolicy-8u0NR3k(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;IFLandroidx/compose/foundation/pager/PageSize;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;
    .locals 21
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;",
            ">;",
            "Landroidx/compose/foundation/pager/PagerState;",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "Z",
            "Landroidx/compose/foundation/gestures/Orientation;",
            "IF",
            "Landroidx/compose/foundation/pager/PageSize;",
            "Landroidx/compose/ui/Alignment$Horizontal;",
            "Landroidx/compose/ui/Alignment$Vertical;",
            "Landroidx/compose/foundation/gestures/snapping/SnapPosition;",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Integer;",
            ">;",
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
    move-object/from16 v0, p13

    .line 2
    .line 3
    move/from16 v1, p14

    .line 4
    .line 5
    move/from16 v2, p15

    .line 6
    .line 7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    const v3, 0x52ef60e7

    .line 14
    .line 15
    .line 16
    const-string/jumbo v4, "androidx.compose.foundation.pager.rememberPagerMeasurePolicy (PagerMeasurePolicy.kt:57)"

    .line 17
    .line 18
    .line 19
    invoke-static {v3, v1, v2, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    and-int/lit8 v3, v1, 0x70

    .line 23
    .line 24
    xor-int/lit8 v3, v3, 0x30

    .line 25
    .line 26
    const/16 v4, 0x20

    .line 27
    .line 28
    move-object/from16 v8, p1

    .line 29
    .line 30
    if-le v3, v4, :cond_1

    .line 31
    .line 32
    invoke-interface {v0, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-nez v3, :cond_2

    .line 37
    .line 38
    :cond_1
    and-int/lit8 v3, v1, 0x30

    .line 39
    .line 40
    if-ne v3, v4, :cond_3

    .line 41
    .line 42
    :cond_2
    const/4 v3, 0x1

    .line 43
    goto :goto_0

    .line 44
    :cond_3
    const/4 v3, 0x0

    .line 45
    :goto_0
    and-int/lit16 v4, v1, 0x380

    .line 46
    .line 47
    xor-int/lit16 v4, v4, 0x180

    .line 48
    .line 49
    const/16 v7, 0x100

    .line 50
    .line 51
    move-object/from16 v10, p2

    .line 52
    .line 53
    if-le v4, v7, :cond_4

    .line 54
    .line 55
    invoke-interface {v0, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-nez v4, :cond_5

    .line 60
    .line 61
    :cond_4
    and-int/lit16 v4, v1, 0x180

    .line 62
    .line 63
    if-ne v4, v7, :cond_6

    .line 64
    .line 65
    :cond_5
    const/4 v4, 0x1

    .line 66
    goto :goto_1

    .line 67
    :cond_6
    const/4 v4, 0x0

    .line 68
    :goto_1
    or-int/2addr v3, v4

    .line 69
    and-int/lit16 v4, v1, 0x1c00

    .line 70
    .line 71
    xor-int/lit16 v4, v4, 0xc00

    .line 72
    .line 73
    const/16 v9, 0x800

    .line 74
    .line 75
    move/from16 v11, p3

    .line 76
    .line 77
    if-le v4, v9, :cond_7

    .line 78
    .line 79
    invoke-interface {v0, v11}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    if-nez v4, :cond_8

    .line 84
    .line 85
    :cond_7
    and-int/lit16 v4, v1, 0xc00

    .line 86
    .line 87
    if-ne v4, v9, :cond_9

    .line 88
    .line 89
    :cond_8
    const/4 v4, 0x1

    .line 90
    goto :goto_2

    .line 91
    :cond_9
    const/4 v4, 0x0

    .line 92
    :goto_2
    or-int/2addr v3, v4

    .line 93
    const v4, 0xe000

    .line 94
    .line 95
    .line 96
    and-int/2addr v4, v1

    .line 97
    xor-int/lit16 v4, v4, 0x6000

    .line 98
    .line 99
    const/16 v9, 0x4000

    .line 100
    .line 101
    if-le v4, v9, :cond_a

    .line 102
    .line 103
    move-object/from16 v4, p4

    .line 104
    .line 105
    invoke-interface {v0, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v12

    .line 109
    if-nez v12, :cond_b

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_a
    move-object/from16 v4, p4

    .line 113
    .line 114
    :goto_3
    and-int/lit16 v12, v1, 0x6000

    .line 115
    .line 116
    if-ne v12, v9, :cond_c

    .line 117
    .line 118
    :cond_b
    const/4 v9, 0x1

    .line 119
    goto :goto_4

    .line 120
    :cond_c
    const/4 v9, 0x0

    .line 121
    :goto_4
    or-int/2addr v3, v9

    .line 122
    const/high16 v9, 0xe000000

    .line 123
    .line 124
    and-int/2addr v9, v1

    .line 125
    const/high16 v12, 0x6000000

    .line 126
    .line 127
    xor-int/2addr v9, v12

    .line 128
    const/high16 v13, 0x4000000

    .line 129
    .line 130
    if-le v9, v13, :cond_d

    .line 131
    .line 132
    move-object/from16 v9, p8

    .line 133
    .line 134
    invoke-interface {v0, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v14

    .line 138
    if-nez v14, :cond_e

    .line 139
    .line 140
    goto :goto_5

    .line 141
    :cond_d
    move-object/from16 v9, p8

    .line 142
    .line 143
    :goto_5
    and-int/2addr v12, v1

    .line 144
    if-ne v12, v13, :cond_f

    .line 145
    .line 146
    :cond_e
    const/4 v12, 0x1

    .line 147
    goto :goto_6

    .line 148
    :cond_f
    const/4 v12, 0x0

    .line 149
    :goto_6
    or-int/2addr v3, v12

    .line 150
    const/high16 v12, 0x70000000

    .line 151
    .line 152
    and-int/2addr v12, v1

    .line 153
    const/high16 v13, 0x30000000

    .line 154
    .line 155
    xor-int/2addr v12, v13

    .line 156
    const/high16 v14, 0x20000000

    .line 157
    .line 158
    if-le v12, v14, :cond_10

    .line 159
    .line 160
    move-object/from16 v12, p9

    .line 161
    .line 162
    invoke-interface {v0, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v15

    .line 166
    if-nez v15, :cond_11

    .line 167
    .line 168
    goto :goto_7

    .line 169
    :cond_10
    move-object/from16 v12, p9

    .line 170
    .line 171
    :goto_7
    and-int/2addr v13, v1

    .line 172
    if-ne v13, v14, :cond_12

    .line 173
    .line 174
    :cond_11
    const/4 v13, 0x1

    .line 175
    goto :goto_8

    .line 176
    :cond_12
    const/4 v13, 0x0

    .line 177
    :goto_8
    or-int/2addr v3, v13

    .line 178
    const/high16 v13, 0x380000

    .line 179
    .line 180
    and-int/2addr v13, v1

    .line 181
    const/high16 v14, 0x180000

    .line 182
    .line 183
    xor-int/2addr v13, v14

    .line 184
    const/high16 v15, 0x100000

    .line 185
    .line 186
    if-le v13, v15, :cond_13

    .line 187
    .line 188
    move/from16 v13, p6

    .line 189
    .line 190
    invoke-interface {v0, v13}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 191
    .line 192
    .line 193
    move-result v16

    .line 194
    if-nez v16, :cond_14

    .line 195
    .line 196
    goto :goto_9

    .line 197
    :cond_13
    move/from16 v13, p6

    .line 198
    .line 199
    :goto_9
    and-int/2addr v14, v1

    .line 200
    if-ne v14, v15, :cond_15

    .line 201
    .line 202
    :cond_14
    const/4 v14, 0x1

    .line 203
    goto :goto_a

    .line 204
    :cond_15
    const/4 v14, 0x0

    .line 205
    :goto_a
    or-int/2addr v3, v14

    .line 206
    const/high16 v14, 0x1c00000

    .line 207
    .line 208
    and-int/2addr v14, v1

    .line 209
    const/high16 v15, 0xc00000

    .line 210
    .line 211
    xor-int/2addr v14, v15

    .line 212
    const/high16 v5, 0x800000

    .line 213
    .line 214
    if-le v14, v5, :cond_16

    .line 215
    .line 216
    move-object/from16 v14, p7

    .line 217
    .line 218
    invoke-interface {v0, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v17

    .line 222
    if-nez v17, :cond_17

    .line 223
    .line 224
    goto :goto_b

    .line 225
    :cond_16
    move-object/from16 v14, p7

    .line 226
    .line 227
    :goto_b
    and-int/2addr v15, v1

    .line 228
    if-ne v15, v5, :cond_18

    .line 229
    .line 230
    :cond_17
    const/4 v5, 0x1

    .line 231
    goto :goto_c

    .line 232
    :cond_18
    const/4 v5, 0x0

    .line 233
    :goto_c
    or-int/2addr v3, v5

    .line 234
    and-int/lit8 v5, v2, 0xe

    .line 235
    .line 236
    xor-int/lit8 v5, v5, 0x6

    .line 237
    .line 238
    const/4 v15, 0x4

    .line 239
    if-le v5, v15, :cond_19

    .line 240
    .line 241
    move-object/from16 v5, p10

    .line 242
    .line 243
    invoke-interface {v0, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v17

    .line 247
    if-nez v17, :cond_1a

    .line 248
    .line 249
    goto :goto_d

    .line 250
    :cond_19
    move-object/from16 v5, p10

    .line 251
    .line 252
    :goto_d
    and-int/lit8 v6, v2, 0x6

    .line 253
    .line 254
    if-ne v6, v15, :cond_1b

    .line 255
    .line 256
    :cond_1a
    const/4 v6, 0x1

    .line 257
    goto :goto_e

    .line 258
    :cond_1b
    const/4 v6, 0x0

    .line 259
    :goto_e
    or-int/2addr v3, v6

    .line 260
    and-int/lit16 v6, v2, 0x380

    .line 261
    .line 262
    xor-int/lit16 v6, v6, 0x180

    .line 263
    .line 264
    move-object/from16 v15, p12

    .line 265
    .line 266
    if-le v6, v7, :cond_1c

    .line 267
    .line 268
    invoke-interface {v0, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v6

    .line 272
    if-nez v6, :cond_1d

    .line 273
    .line 274
    :cond_1c
    and-int/lit16 v2, v2, 0x180

    .line 275
    .line 276
    if-ne v2, v7, :cond_1e

    .line 277
    .line 278
    :cond_1d
    const/4 v2, 0x1

    .line 279
    goto :goto_f

    .line 280
    :cond_1e
    const/4 v2, 0x0

    .line 281
    :goto_f
    or-int/2addr v2, v3

    .line 282
    const/high16 v3, 0x70000

    .line 283
    .line 284
    and-int/2addr v3, v1

    .line 285
    const/high16 v6, 0x30000

    .line 286
    .line 287
    xor-int/2addr v3, v6

    .line 288
    const/high16 v7, 0x20000

    .line 289
    .line 290
    if-le v3, v7, :cond_1f

    .line 291
    .line 292
    move/from16 v3, p5

    .line 293
    .line 294
    invoke-interface {v0, v3}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 295
    .line 296
    .line 297
    move-result v7

    .line 298
    if-nez v7, :cond_20

    .line 299
    .line 300
    goto :goto_10

    .line 301
    :cond_1f
    move/from16 v3, p5

    .line 302
    .line 303
    :goto_10
    and-int/2addr v1, v6

    .line 304
    const/high16 v6, 0x20000

    .line 305
    .line 306
    if-ne v1, v6, :cond_21

    .line 307
    .line 308
    :cond_20
    const/16 v16, 0x1

    .line 309
    .line 310
    goto :goto_11

    .line 311
    :cond_21
    const/16 v16, 0x0

    .line 312
    .line 313
    :goto_11
    or-int v1, v2, v16

    .line 314
    .line 315
    move-object/from16 v2, p11

    .line 316
    .line 317
    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    move-result v6

    .line 321
    or-int/2addr v1, v6

    .line 322
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v6

    .line 326
    if-nez v1, :cond_22

    .line 327
    .line 328
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 329
    .line 330
    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    if-ne v6, v1, :cond_23

    .line 335
    .line 336
    :cond_22
    new-instance v7, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;

    .line 337
    .line 338
    move-object/from16 v20, v2

    .line 339
    .line 340
    move/from16 v18, v3

    .line 341
    .line 342
    move-object/from16 v19, v5

    .line 343
    .line 344
    move-object/from16 v17, v9

    .line 345
    .line 346
    move-object/from16 v16, v12

    .line 347
    .line 348
    move v12, v13

    .line 349
    move-object v13, v14

    .line 350
    move-object/from16 v14, p0

    .line 351
    .line 352
    move-object v9, v4

    .line 353
    invoke-direct/range {v7 .. v20}, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;-><init>(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/layout/PaddingValues;ZFLandroidx/compose/foundation/pager/PageSize;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/Alignment$Horizontal;ILandroidx/compose/foundation/gestures/snapping/SnapPosition;Lkotlinx/coroutines/CoroutineScope;)V

    .line 354
    .line 355
    .line 356
    invoke-interface {v0, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 357
    .line 358
    .line 359
    move-object v6, v7

    .line 360
    :cond_23
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 361
    .line 362
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 363
    .line 364
    .line 365
    move-result v0

    .line 366
    if-eqz v0, :cond_24

    .line 367
    .line 368
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 369
    .line 370
    .line 371
    :cond_24
    return-object v6
.end method
