.class public final Landroidx/compose/material3/NavigationBarKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final IconLayoutIdTag:Ljava/lang/String; = "icon"

.field private static final IndicatorHorizontalPadding:F

.field private static final IndicatorLayoutIdTag:Ljava/lang/String; = "indicator"

.field private static final IndicatorRippleLayoutIdTag:Ljava/lang/String; = "indicatorRipple"

.field private static final IndicatorVerticalOffset:F

.field private static final IndicatorVerticalPadding:F

.field private static final ItemAnimationDurationMillis:I = 0x64

.field private static final LabelLayoutIdTag:Ljava/lang/String; = "label"

.field private static final NavigationBarHeight:F

.field private static final NavigationBarIndicatorToLabelPadding:F

.field private static final NavigationBarItemHorizontalPadding:F


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Landroidx/compose/material3/tokens/NavigationBarTokens;->INSTANCE:Landroidx/compose/material3/tokens/NavigationBarTokens;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/NavigationBarTokens;->getContainerHeight-D9Ej5fM()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    sput v1, Landroidx/compose/material3/NavigationBarKt;->NavigationBarHeight:F

    .line 8
    .line 9
    const/16 v1, 0x8

    .line 10
    .line 11
    int-to-float v1, v1

    .line 12
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    sput v1, Landroidx/compose/material3/NavigationBarKt;->NavigationBarItemHorizontalPadding:F

    .line 17
    .line 18
    const/4 v1, 0x4

    .line 19
    int-to-float v1, v1

    .line 20
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    sput v1, Landroidx/compose/material3/NavigationBarKt;->NavigationBarIndicatorToLabelPadding:F

    .line 25
    .line 26
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/NavigationBarTokens;->getActiveIndicatorWidth-D9Ej5fM()F

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/NavigationBarTokens;->getIconSize-D9Ej5fM()F

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    sub-float/2addr v1, v2

    .line 35
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    const/4 v2, 0x2

    .line 40
    int-to-float v2, v2

    .line 41
    div-float/2addr v1, v2

    .line 42
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    sput v1, Landroidx/compose/material3/NavigationBarKt;->IndicatorHorizontalPadding:F

    .line 47
    .line 48
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/NavigationBarTokens;->getActiveIndicatorHeight-D9Ej5fM()F

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/NavigationBarTokens;->getIconSize-D9Ej5fM()F

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    sub-float/2addr v1, v0

    .line 57
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    div-float/2addr v0, v2

    .line 62
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    sput v0, Landroidx/compose/material3/NavigationBarKt;->IndicatorVerticalPadding:F

    .line 67
    .line 68
    const/16 v0, 0xc

    .line 69
    .line 70
    int-to-float v0, v0

    .line 71
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    sput v0, Landroidx/compose/material3/NavigationBarKt;->IndicatorVerticalOffset:F

    .line 76
    .line 77
    return-void
.end method

.method public static final NavigationBar-HsRjFd4(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/WindowInsets;Lhd/q;Landroidx/compose/runtime/Composer;II)V
    .locals 23
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "JJF",
            "Landroidx/compose/foundation/layout/WindowInsets;",
            "Lhd/q;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v8, p7

    .line 2
    .line 3
    move/from16 v9, p9

    .line 4
    .line 5
    const v0, 0x5f2d444b

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p8

    .line 9
    .line 10
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    and-int/lit8 v2, p10, 0x1

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    or-int/lit8 v3, v9, 0x6

    .line 19
    .line 20
    move v4, v3

    .line 21
    move-object/from16 v3, p0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    and-int/lit8 v3, v9, 0x6

    .line 25
    .line 26
    if-nez v3, :cond_2

    .line 27
    .line 28
    move-object/from16 v3, p0

    .line 29
    .line 30
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    const/4 v4, 0x4

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v4, 0x2

    .line 39
    :goto_0
    or-int/2addr v4, v9

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    move-object/from16 v3, p0

    .line 42
    .line 43
    move v4, v9

    .line 44
    :goto_1
    and-int/lit8 v5, v9, 0x30

    .line 45
    .line 46
    if-nez v5, :cond_5

    .line 47
    .line 48
    and-int/lit8 v5, p10, 0x2

    .line 49
    .line 50
    if-nez v5, :cond_3

    .line 51
    .line 52
    move-wide/from16 v5, p1

    .line 53
    .line 54
    invoke-interface {v1, v5, v6}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    if-eqz v7, :cond_4

    .line 59
    .line 60
    const/16 v7, 0x20

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    move-wide/from16 v5, p1

    .line 64
    .line 65
    :cond_4
    const/16 v7, 0x10

    .line 66
    .line 67
    :goto_2
    or-int/2addr v4, v7

    .line 68
    goto :goto_3

    .line 69
    :cond_5
    move-wide/from16 v5, p1

    .line 70
    .line 71
    :goto_3
    and-int/lit16 v7, v9, 0x180

    .line 72
    .line 73
    if-nez v7, :cond_7

    .line 74
    .line 75
    and-int/lit8 v7, p10, 0x4

    .line 76
    .line 77
    move-wide/from16 v10, p3

    .line 78
    .line 79
    if-nez v7, :cond_6

    .line 80
    .line 81
    invoke-interface {v1, v10, v11}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    if-eqz v7, :cond_6

    .line 86
    .line 87
    const/16 v7, 0x100

    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_6
    const/16 v7, 0x80

    .line 91
    .line 92
    :goto_4
    or-int/2addr v4, v7

    .line 93
    goto :goto_5

    .line 94
    :cond_7
    move-wide/from16 v10, p3

    .line 95
    .line 96
    :goto_5
    and-int/lit8 v7, p10, 0x8

    .line 97
    .line 98
    if-eqz v7, :cond_9

    .line 99
    .line 100
    or-int/lit16 v4, v4, 0xc00

    .line 101
    .line 102
    :cond_8
    move/from16 v12, p5

    .line 103
    .line 104
    goto :goto_7

    .line 105
    :cond_9
    and-int/lit16 v12, v9, 0xc00

    .line 106
    .line 107
    if-nez v12, :cond_8

    .line 108
    .line 109
    move/from16 v12, p5

    .line 110
    .line 111
    invoke-interface {v1, v12}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 112
    .line 113
    .line 114
    move-result v13

    .line 115
    if-eqz v13, :cond_a

    .line 116
    .line 117
    const/16 v13, 0x800

    .line 118
    .line 119
    goto :goto_6

    .line 120
    :cond_a
    const/16 v13, 0x400

    .line 121
    .line 122
    :goto_6
    or-int/2addr v4, v13

    .line 123
    :goto_7
    and-int/lit16 v13, v9, 0x6000

    .line 124
    .line 125
    if-nez v13, :cond_d

    .line 126
    .line 127
    and-int/lit8 v13, p10, 0x10

    .line 128
    .line 129
    if-nez v13, :cond_b

    .line 130
    .line 131
    move-object/from16 v13, p6

    .line 132
    .line 133
    invoke-interface {v1, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v14

    .line 137
    if-eqz v14, :cond_c

    .line 138
    .line 139
    const/16 v14, 0x4000

    .line 140
    .line 141
    goto :goto_8

    .line 142
    :cond_b
    move-object/from16 v13, p6

    .line 143
    .line 144
    :cond_c
    const/16 v14, 0x2000

    .line 145
    .line 146
    :goto_8
    or-int/2addr v4, v14

    .line 147
    goto :goto_9

    .line 148
    :cond_d
    move-object/from16 v13, p6

    .line 149
    .line 150
    :goto_9
    and-int/lit8 v14, p10, 0x20

    .line 151
    .line 152
    const/high16 v15, 0x30000

    .line 153
    .line 154
    if-eqz v14, :cond_e

    .line 155
    .line 156
    or-int/2addr v4, v15

    .line 157
    goto :goto_b

    .line 158
    :cond_e
    and-int v14, v9, v15

    .line 159
    .line 160
    if-nez v14, :cond_10

    .line 161
    .line 162
    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v14

    .line 166
    if-eqz v14, :cond_f

    .line 167
    .line 168
    const/high16 v14, 0x20000

    .line 169
    .line 170
    goto :goto_a

    .line 171
    :cond_f
    const/high16 v14, 0x10000

    .line 172
    .line 173
    :goto_a
    or-int/2addr v4, v14

    .line 174
    :cond_10
    :goto_b
    const v14, 0x12493

    .line 175
    .line 176
    .line 177
    and-int/2addr v14, v4

    .line 178
    const v15, 0x12492

    .line 179
    .line 180
    .line 181
    if-ne v14, v15, :cond_12

    .line 182
    .line 183
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 184
    .line 185
    .line 186
    move-result v14

    .line 187
    if-nez v14, :cond_11

    .line 188
    .line 189
    goto :goto_c

    .line 190
    :cond_11
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 191
    .line 192
    .line 193
    move-object/from16 v20, v1

    .line 194
    .line 195
    move-object v1, v3

    .line 196
    move-wide v2, v5

    .line 197
    move-wide v4, v10

    .line 198
    move v6, v12

    .line 199
    move-object v7, v13

    .line 200
    goto/16 :goto_12

    .line 201
    .line 202
    :cond_12
    :goto_c
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 203
    .line 204
    .line 205
    and-int/lit8 v14, v9, 0x1

    .line 206
    .line 207
    const v15, -0xe001

    .line 208
    .line 209
    .line 210
    if-eqz v14, :cond_17

    .line 211
    .line 212
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 213
    .line 214
    .line 215
    move-result v14

    .line 216
    if-eqz v14, :cond_13

    .line 217
    .line 218
    goto :goto_e

    .line 219
    :cond_13
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 220
    .line 221
    .line 222
    and-int/lit8 v2, p10, 0x2

    .line 223
    .line 224
    if-eqz v2, :cond_14

    .line 225
    .line 226
    and-int/lit8 v4, v4, -0x71

    .line 227
    .line 228
    :cond_14
    and-int/lit8 v2, p10, 0x4

    .line 229
    .line 230
    if-eqz v2, :cond_15

    .line 231
    .line 232
    and-int/lit16 v4, v4, -0x381

    .line 233
    .line 234
    :cond_15
    and-int/lit8 v2, p10, 0x10

    .line 235
    .line 236
    if-eqz v2, :cond_16

    .line 237
    .line 238
    and-int/2addr v4, v15

    .line 239
    :cond_16
    move-wide v14, v10

    .line 240
    move/from16 v16, v12

    .line 241
    .line 242
    move-object v10, v3

    .line 243
    move-object v3, v13

    .line 244
    :goto_d
    move-wide v12, v5

    .line 245
    goto :goto_11

    .line 246
    :cond_17
    :goto_e
    if-eqz v2, :cond_18

    .line 247
    .line 248
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 249
    .line 250
    goto :goto_f

    .line 251
    :cond_18
    move-object v2, v3

    .line 252
    :goto_f
    and-int/lit8 v3, p10, 0x2

    .line 253
    .line 254
    const/4 v14, 0x6

    .line 255
    if-eqz v3, :cond_19

    .line 256
    .line 257
    sget-object v3, Landroidx/compose/material3/NavigationBarDefaults;->INSTANCE:Landroidx/compose/material3/NavigationBarDefaults;

    .line 258
    .line 259
    invoke-virtual {v3, v1, v14}, Landroidx/compose/material3/NavigationBarDefaults;->getContainerColor(Landroidx/compose/runtime/Composer;I)J

    .line 260
    .line 261
    .line 262
    move-result-wide v5

    .line 263
    and-int/lit8 v4, v4, -0x71

    .line 264
    .line 265
    :cond_19
    and-int/lit8 v3, p10, 0x4

    .line 266
    .line 267
    if-eqz v3, :cond_1a

    .line 268
    .line 269
    sget-object v3, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    .line 270
    .line 271
    invoke-virtual {v3, v1, v14}, Landroidx/compose/material3/MaterialTheme;->getColorScheme(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ColorScheme;

    .line 272
    .line 273
    .line 274
    move-result-object v3

    .line 275
    invoke-static {v3, v5, v6}, Landroidx/compose/material3/ColorSchemeKt;->contentColorFor-4WTKRHQ(Landroidx/compose/material3/ColorScheme;J)J

    .line 276
    .line 277
    .line 278
    move-result-wide v10

    .line 279
    and-int/lit16 v3, v4, -0x381

    .line 280
    .line 281
    move v4, v3

    .line 282
    :cond_1a
    if-eqz v7, :cond_1b

    .line 283
    .line 284
    sget-object v3, Landroidx/compose/material3/NavigationBarDefaults;->INSTANCE:Landroidx/compose/material3/NavigationBarDefaults;

    .line 285
    .line 286
    invoke-virtual {v3}, Landroidx/compose/material3/NavigationBarDefaults;->getElevation-D9Ej5fM()F

    .line 287
    .line 288
    .line 289
    move-result v3

    .line 290
    move v12, v3

    .line 291
    :cond_1b
    and-int/lit8 v3, p10, 0x10

    .line 292
    .line 293
    if-eqz v3, :cond_1c

    .line 294
    .line 295
    sget-object v3, Landroidx/compose/material3/NavigationBarDefaults;->INSTANCE:Landroidx/compose/material3/NavigationBarDefaults;

    .line 296
    .line 297
    invoke-virtual {v3, v1, v14}, Landroidx/compose/material3/NavigationBarDefaults;->getWindowInsets(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    and-int/2addr v4, v15

    .line 302
    move-wide v14, v10

    .line 303
    move/from16 v16, v12

    .line 304
    .line 305
    :goto_10
    move-object v10, v2

    .line 306
    goto :goto_d

    .line 307
    :cond_1c
    move-wide v14, v10

    .line 308
    move/from16 v16, v12

    .line 309
    .line 310
    move-object v3, v13

    .line 311
    goto :goto_10

    .line 312
    :goto_11
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 313
    .line 314
    .line 315
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 316
    .line 317
    .line 318
    move-result v2

    .line 319
    if-eqz v2, :cond_1d

    .line 320
    .line 321
    const/4 v2, -0x1

    .line 322
    const-string v5, "androidx.compose.material3.NavigationBar (NavigationBar.kt:115)"

    .line 323
    .line 324
    invoke-static {v0, v4, v2, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 325
    .line 326
    .line 327
    :cond_1d
    new-instance v0, Landroidx/compose/material3/NavigationBarKt$NavigationBar$1;

    .line 328
    .line 329
    invoke-direct {v0, v3, v8}, Landroidx/compose/material3/NavigationBarKt$NavigationBar$1;-><init>(Landroidx/compose/foundation/layout/WindowInsets;Lhd/q;)V

    .line 330
    .line 331
    .line 332
    const/16 v2, 0x36

    .line 333
    .line 334
    const v5, 0x64c4a90

    .line 335
    .line 336
    .line 337
    const/4 v6, 0x1

    .line 338
    invoke-static {v5, v6, v0, v1, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 339
    .line 340
    .line 341
    move-result-object v19

    .line 342
    and-int/lit8 v0, v4, 0xe

    .line 343
    .line 344
    const/high16 v2, 0xc00000

    .line 345
    .line 346
    or-int/2addr v0, v2

    .line 347
    shl-int/lit8 v2, v4, 0x3

    .line 348
    .line 349
    and-int/lit16 v4, v2, 0x380

    .line 350
    .line 351
    or-int/2addr v0, v4

    .line 352
    and-int/lit16 v4, v2, 0x1c00

    .line 353
    .line 354
    or-int/2addr v0, v4

    .line 355
    const v4, 0xe000

    .line 356
    .line 357
    .line 358
    and-int/2addr v2, v4

    .line 359
    or-int v21, v0, v2

    .line 360
    .line 361
    const/16 v22, 0x62

    .line 362
    .line 363
    const/4 v11, 0x0

    .line 364
    const/16 v17, 0x0

    .line 365
    .line 366
    const/16 v18, 0x0

    .line 367
    .line 368
    move-object/from16 v20, v1

    .line 369
    .line 370
    invoke-static/range {v10 .. v22}, Landroidx/compose/material3/SurfaceKt;->Surface-T9BRK9s(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lhd/p;Landroidx/compose/runtime/Composer;II)V

    .line 371
    .line 372
    .line 373
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 374
    .line 375
    .line 376
    move-result v0

    .line 377
    if-eqz v0, :cond_1e

    .line 378
    .line 379
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 380
    .line 381
    .line 382
    :cond_1e
    move-object v7, v3

    .line 383
    move-object v1, v10

    .line 384
    move-wide v2, v12

    .line 385
    move-wide v4, v14

    .line 386
    move/from16 v6, v16

    .line 387
    .line 388
    :goto_12
    invoke-interface/range {v20 .. v20}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 389
    .line 390
    .line 391
    move-result-object v11

    .line 392
    if-eqz v11, :cond_1f

    .line 393
    .line 394
    new-instance v0, Landroidx/compose/material3/NavigationBarKt$NavigationBar$2;

    .line 395
    .line 396
    move/from16 v10, p10

    .line 397
    .line 398
    invoke-direct/range {v0 .. v10}, Landroidx/compose/material3/NavigationBarKt$NavigationBar$2;-><init>(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/WindowInsets;Lhd/q;II)V

    .line 399
    .line 400
    .line 401
    invoke-interface {v11, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lhd/p;)V

    .line 402
    .line 403
    .line 404
    :cond_1f
    return-void
.end method

.method public static final NavigationBarItem(Landroidx/compose/foundation/layout/RowScope;ZLhd/a;Lhd/p;Landroidx/compose/ui/Modifier;ZLhd/p;ZLandroidx/compose/material3/NavigationBarItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V
    .locals 26
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/layout/RowScope;",
            "Z",
            "Lhd/a;",
            "Lhd/p;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Lhd/p;",
            "Z",
            "Landroidx/compose/material3/NavigationBarItemColors;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move/from16 v2, p1

    .line 2
    .line 3
    move/from16 v11, p11

    .line 4
    .line 5
    move/from16 v12, p12

    .line 6
    .line 7
    const v0, -0x278c5fbe

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p10

    .line 11
    .line 12
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v6

    .line 16
    const/high16 v1, -0x80000000

    .line 17
    .line 18
    and-int/2addr v1, v12

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    or-int/lit8 v1, v11, 0x6

    .line 22
    .line 23
    move v3, v1

    .line 24
    move-object/from16 v1, p0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    and-int/lit8 v1, v11, 0x6

    .line 28
    .line 29
    if-nez v1, :cond_2

    .line 30
    .line 31
    move-object/from16 v1, p0

    .line 32
    .line 33
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    const/4 v3, 0x4

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 v3, 0x2

    .line 42
    :goto_0
    or-int/2addr v3, v11

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    move-object/from16 v1, p0

    .line 45
    .line 46
    move v3, v11

    .line 47
    :goto_1
    and-int/lit8 v4, v12, 0x1

    .line 48
    .line 49
    if-eqz v4, :cond_3

    .line 50
    .line 51
    or-int/lit8 v3, v3, 0x30

    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_3
    and-int/lit8 v4, v11, 0x30

    .line 55
    .line 56
    if-nez v4, :cond_5

    .line 57
    .line 58
    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eqz v4, :cond_4

    .line 63
    .line 64
    const/16 v4, 0x20

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_4
    const/16 v4, 0x10

    .line 68
    .line 69
    :goto_2
    or-int/2addr v3, v4

    .line 70
    :cond_5
    :goto_3
    and-int/lit8 v4, v12, 0x2

    .line 71
    .line 72
    if-eqz v4, :cond_7

    .line 73
    .line 74
    or-int/lit16 v3, v3, 0x180

    .line 75
    .line 76
    :cond_6
    move-object/from16 v4, p2

    .line 77
    .line 78
    goto :goto_5

    .line 79
    :cond_7
    and-int/lit16 v4, v11, 0x180

    .line 80
    .line 81
    if-nez v4, :cond_6

    .line 82
    .line 83
    move-object/from16 v4, p2

    .line 84
    .line 85
    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    if-eqz v5, :cond_8

    .line 90
    .line 91
    const/16 v5, 0x100

    .line 92
    .line 93
    goto :goto_4

    .line 94
    :cond_8
    const/16 v5, 0x80

    .line 95
    .line 96
    :goto_4
    or-int/2addr v3, v5

    .line 97
    :goto_5
    and-int/lit8 v5, v12, 0x4

    .line 98
    .line 99
    if-eqz v5, :cond_a

    .line 100
    .line 101
    or-int/lit16 v3, v3, 0xc00

    .line 102
    .line 103
    :cond_9
    move-object/from16 v5, p3

    .line 104
    .line 105
    goto :goto_7

    .line 106
    :cond_a
    and-int/lit16 v5, v11, 0xc00

    .line 107
    .line 108
    if-nez v5, :cond_9

    .line 109
    .line 110
    move-object/from16 v5, p3

    .line 111
    .line 112
    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    if-eqz v7, :cond_b

    .line 117
    .line 118
    const/16 v7, 0x800

    .line 119
    .line 120
    goto :goto_6

    .line 121
    :cond_b
    const/16 v7, 0x400

    .line 122
    .line 123
    :goto_6
    or-int/2addr v3, v7

    .line 124
    :goto_7
    and-int/lit8 v7, v12, 0x8

    .line 125
    .line 126
    if-eqz v7, :cond_d

    .line 127
    .line 128
    or-int/lit16 v3, v3, 0x6000

    .line 129
    .line 130
    :cond_c
    move-object/from16 v8, p4

    .line 131
    .line 132
    goto :goto_9

    .line 133
    :cond_d
    and-int/lit16 v8, v11, 0x6000

    .line 134
    .line 135
    if-nez v8, :cond_c

    .line 136
    .line 137
    move-object/from16 v8, p4

    .line 138
    .line 139
    invoke-interface {v6, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v10

    .line 143
    if-eqz v10, :cond_e

    .line 144
    .line 145
    const/16 v10, 0x4000

    .line 146
    .line 147
    goto :goto_8

    .line 148
    :cond_e
    const/16 v10, 0x2000

    .line 149
    .line 150
    :goto_8
    or-int/2addr v3, v10

    .line 151
    :goto_9
    and-int/lit8 v10, v12, 0x10

    .line 152
    .line 153
    const/high16 v13, 0x30000

    .line 154
    .line 155
    if-eqz v10, :cond_10

    .line 156
    .line 157
    or-int/2addr v3, v13

    .line 158
    :cond_f
    move/from16 v13, p5

    .line 159
    .line 160
    goto :goto_b

    .line 161
    :cond_10
    and-int/2addr v13, v11

    .line 162
    if-nez v13, :cond_f

    .line 163
    .line 164
    move/from16 v13, p5

    .line 165
    .line 166
    invoke-interface {v6, v13}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 167
    .line 168
    .line 169
    move-result v14

    .line 170
    if-eqz v14, :cond_11

    .line 171
    .line 172
    const/high16 v14, 0x20000

    .line 173
    .line 174
    goto :goto_a

    .line 175
    :cond_11
    const/high16 v14, 0x10000

    .line 176
    .line 177
    :goto_a
    or-int/2addr v3, v14

    .line 178
    :goto_b
    and-int/lit8 v14, v12, 0x20

    .line 179
    .line 180
    const/high16 v15, 0x180000

    .line 181
    .line 182
    if-eqz v14, :cond_13

    .line 183
    .line 184
    or-int/2addr v3, v15

    .line 185
    :cond_12
    move-object/from16 v15, p6

    .line 186
    .line 187
    goto :goto_d

    .line 188
    :cond_13
    and-int/2addr v15, v11

    .line 189
    if-nez v15, :cond_12

    .line 190
    .line 191
    move-object/from16 v15, p6

    .line 192
    .line 193
    invoke-interface {v6, v15}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v16

    .line 197
    if-eqz v16, :cond_14

    .line 198
    .line 199
    const/high16 v16, 0x100000

    .line 200
    .line 201
    goto :goto_c

    .line 202
    :cond_14
    const/high16 v16, 0x80000

    .line 203
    .line 204
    :goto_c
    or-int v3, v3, v16

    .line 205
    .line 206
    :goto_d
    and-int/lit8 v16, v12, 0x40

    .line 207
    .line 208
    const/high16 v17, 0xc00000

    .line 209
    .line 210
    if-eqz v16, :cond_15

    .line 211
    .line 212
    or-int v3, v3, v17

    .line 213
    .line 214
    move/from16 v9, p7

    .line 215
    .line 216
    goto :goto_f

    .line 217
    :cond_15
    and-int v17, v11, v17

    .line 218
    .line 219
    move/from16 v9, p7

    .line 220
    .line 221
    if-nez v17, :cond_17

    .line 222
    .line 223
    invoke-interface {v6, v9}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 224
    .line 225
    .line 226
    move-result v18

    .line 227
    if-eqz v18, :cond_16

    .line 228
    .line 229
    const/high16 v18, 0x800000

    .line 230
    .line 231
    goto :goto_e

    .line 232
    :cond_16
    const/high16 v18, 0x400000

    .line 233
    .line 234
    :goto_e
    or-int v3, v3, v18

    .line 235
    .line 236
    :cond_17
    :goto_f
    const/high16 v18, 0x6000000

    .line 237
    .line 238
    and-int v18, v11, v18

    .line 239
    .line 240
    if-nez v18, :cond_1a

    .line 241
    .line 242
    and-int/lit16 v0, v12, 0x80

    .line 243
    .line 244
    if-nez v0, :cond_18

    .line 245
    .line 246
    move-object/from16 v0, p8

    .line 247
    .line 248
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v19

    .line 252
    if-eqz v19, :cond_19

    .line 253
    .line 254
    const/high16 v19, 0x4000000

    .line 255
    .line 256
    goto :goto_10

    .line 257
    :cond_18
    move-object/from16 v0, p8

    .line 258
    .line 259
    :cond_19
    const/high16 v19, 0x2000000

    .line 260
    .line 261
    :goto_10
    or-int v3, v3, v19

    .line 262
    .line 263
    goto :goto_11

    .line 264
    :cond_1a
    move-object/from16 v0, p8

    .line 265
    .line 266
    :goto_11
    and-int/lit16 v0, v12, 0x100

    .line 267
    .line 268
    const/high16 v19, 0x30000000

    .line 269
    .line 270
    if-eqz v0, :cond_1c

    .line 271
    .line 272
    or-int v3, v3, v19

    .line 273
    .line 274
    :cond_1b
    move/from16 v19, v0

    .line 275
    .line 276
    move-object/from16 v0, p9

    .line 277
    .line 278
    goto :goto_13

    .line 279
    :cond_1c
    and-int v19, v11, v19

    .line 280
    .line 281
    if-nez v19, :cond_1b

    .line 282
    .line 283
    move/from16 v19, v0

    .line 284
    .line 285
    move-object/from16 v0, p9

    .line 286
    .line 287
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    move-result v20

    .line 291
    if-eqz v20, :cond_1d

    .line 292
    .line 293
    const/high16 v20, 0x20000000

    .line 294
    .line 295
    goto :goto_12

    .line 296
    :cond_1d
    const/high16 v20, 0x10000000

    .line 297
    .line 298
    :goto_12
    or-int v3, v3, v20

    .line 299
    .line 300
    :goto_13
    const v20, 0x12492493

    .line 301
    .line 302
    .line 303
    and-int v0, v3, v20

    .line 304
    .line 305
    const v1, 0x12492492

    .line 306
    .line 307
    .line 308
    if-ne v0, v1, :cond_1f

    .line 309
    .line 310
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 311
    .line 312
    .line 313
    move-result v0

    .line 314
    if-nez v0, :cond_1e

    .line 315
    .line 316
    goto :goto_15

    .line 317
    :cond_1e
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 318
    .line 319
    .line 320
    move-object/from16 v10, p9

    .line 321
    .line 322
    move-object v5, v8

    .line 323
    move v8, v9

    .line 324
    move-object/from16 v9, p8

    .line 325
    .line 326
    :goto_14
    move-object v0, v6

    .line 327
    move v6, v13

    .line 328
    move-object v7, v15

    .line 329
    goto/16 :goto_1d

    .line 330
    .line 331
    :cond_1f
    :goto_15
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 332
    .line 333
    .line 334
    and-int/lit8 v0, v11, 0x1

    .line 335
    .line 336
    const p10, -0xe000001

    .line 337
    .line 338
    .line 339
    const/4 v1, 0x6

    .line 340
    move/from16 v20, v3

    .line 341
    .line 342
    const/4 v4, 0x1

    .line 343
    if-eqz v0, :cond_23

    .line 344
    .line 345
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 346
    .line 347
    .line 348
    move-result v0

    .line 349
    if-eqz v0, :cond_20

    .line 350
    .line 351
    goto :goto_16

    .line 352
    :cond_20
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 353
    .line 354
    .line 355
    and-int/lit16 v0, v12, 0x80

    .line 356
    .line 357
    if-eqz v0, :cond_21

    .line 358
    .line 359
    and-int v0, v20, p10

    .line 360
    .line 361
    move-object/from16 v10, p9

    .line 362
    .line 363
    move v14, v0

    .line 364
    move-object/from16 v0, p8

    .line 365
    .line 366
    goto :goto_18

    .line 367
    :cond_21
    move-object/from16 v0, p8

    .line 368
    .line 369
    :cond_22
    move-object/from16 v10, p9

    .line 370
    .line 371
    move/from16 v14, v20

    .line 372
    .line 373
    goto :goto_18

    .line 374
    :cond_23
    :goto_16
    if-eqz v7, :cond_24

    .line 375
    .line 376
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 377
    .line 378
    move-object v8, v0

    .line 379
    :cond_24
    if-eqz v10, :cond_25

    .line 380
    .line 381
    move v13, v4

    .line 382
    :cond_25
    if-eqz v14, :cond_26

    .line 383
    .line 384
    const/4 v15, 0x0

    .line 385
    :cond_26
    if-eqz v16, :cond_27

    .line 386
    .line 387
    move v9, v4

    .line 388
    :cond_27
    and-int/lit16 v0, v12, 0x80

    .line 389
    .line 390
    if-eqz v0, :cond_28

    .line 391
    .line 392
    sget-object v0, Landroidx/compose/material3/NavigationBarItemDefaults;->INSTANCE:Landroidx/compose/material3/NavigationBarItemDefaults;

    .line 393
    .line 394
    invoke-virtual {v0, v6, v1}, Landroidx/compose/material3/NavigationBarItemDefaults;->colors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/NavigationBarItemColors;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    and-int v7, v20, p10

    .line 399
    .line 400
    move/from16 v20, v7

    .line 401
    .line 402
    goto :goto_17

    .line 403
    :cond_28
    move-object/from16 v0, p8

    .line 404
    .line 405
    :goto_17
    if-eqz v19, :cond_22

    .line 406
    .line 407
    move/from16 v14, v20

    .line 408
    .line 409
    const/4 v10, 0x0

    .line 410
    :goto_18
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 411
    .line 412
    .line 413
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 414
    .line 415
    .line 416
    move-result v7

    .line 417
    if-eqz v7, :cond_29

    .line 418
    .line 419
    const/4 v7, -0x1

    .line 420
    const-string v1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:180)"

    .line 421
    .line 422
    const v3, -0x278c5fbe

    .line 423
    .line 424
    .line 425
    invoke-static {v3, v14, v7, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 426
    .line 427
    .line 428
    :cond_29
    const v1, -0x62744f5

    .line 429
    .line 430
    .line 431
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 432
    .line 433
    .line 434
    if-nez v10, :cond_2b

    .line 435
    .line 436
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v1

    .line 440
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 441
    .line 442
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v3

    .line 446
    if-ne v1, v3, :cond_2a

    .line 447
    .line 448
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 449
    .line 450
    .line 451
    move-result-object v1

    .line 452
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 453
    .line 454
    .line 455
    :cond_2a
    check-cast v1, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 456
    .line 457
    goto :goto_19

    .line 458
    :cond_2b
    move-object v1, v10

    .line 459
    :goto_19
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 460
    .line 461
    .line 462
    new-instance v3, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$styledIcon$1;

    .line 463
    .line 464
    move-object/from16 p5, v0

    .line 465
    .line 466
    move/from16 p6, v2

    .line 467
    .line 468
    move-object/from16 p4, v3

    .line 469
    .line 470
    move-object/from16 p10, v5

    .line 471
    .line 472
    move/from16 p9, v9

    .line 473
    .line 474
    move/from16 p7, v13

    .line 475
    .line 476
    move-object/from16 p8, v15

    .line 477
    .line 478
    invoke-direct/range {p4 .. p10}, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$styledIcon$1;-><init>(Landroidx/compose/material3/NavigationBarItemColors;ZZLhd/p;ZLhd/p;)V

    .line 479
    .line 480
    .line 481
    const v5, -0x549d0324

    .line 482
    .line 483
    .line 484
    const/16 v7, 0x36

    .line 485
    .line 486
    invoke-static {v5, v4, v3, v6, v7}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 487
    .line 488
    .line 489
    move-result-object v18

    .line 490
    const v3, -0x626ded2

    .line 491
    .line 492
    .line 493
    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 494
    .line 495
    .line 496
    if-nez v15, :cond_2c

    .line 497
    .line 498
    const/16 v20, 0x0

    .line 499
    .line 500
    goto :goto_1a

    .line 501
    :cond_2c
    new-instance v3, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$styledLabel$1$1;

    .line 502
    .line 503
    invoke-direct {v3, v0, v2, v13, v15}, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$styledLabel$1$1;-><init>(Landroidx/compose/material3/NavigationBarItemColors;ZZLhd/p;)V

    .line 504
    .line 505
    .line 506
    const v5, 0x620c84c8

    .line 507
    .line 508
    .line 509
    invoke-static {v5, v4, v3, v6, v7}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 510
    .line 511
    .line 512
    move-result-object v3

    .line 513
    move-object/from16 v20, v3

    .line 514
    .line 515
    :goto_1a
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 516
    .line 517
    .line 518
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v3

    .line 522
    sget-object v21, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 523
    .line 524
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object v5

    .line 528
    const/4 v7, 0x0

    .line 529
    if-ne v3, v5, :cond_2d

    .line 530
    .line 531
    invoke-static {v7}, Landroidx/compose/runtime/SnapshotIntStateKt;->mutableIntStateOf(I)Landroidx/compose/runtime/MutableIntState;

    .line 532
    .line 533
    .line 534
    move-result-object v3

    .line 535
    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 536
    .line 537
    .line 538
    :cond_2d
    check-cast v3, Landroidx/compose/runtime/MutableIntState;

    .line 539
    .line 540
    sget-object v5, Landroidx/compose/ui/semantics/Role;->Companion:Landroidx/compose/ui/semantics/Role$Companion;

    .line 541
    .line 542
    invoke-virtual {v5}, Landroidx/compose/ui/semantics/Role$Companion;->getTab-o7Vup1c()I

    .line 543
    .line 544
    .line 545
    move-result v5

    .line 546
    const/16 v22, 0x0

    .line 547
    .line 548
    invoke-static {v5}, Landroidx/compose/ui/semantics/Role;->box-impl(I)Landroidx/compose/ui/semantics/Role;

    .line 549
    .line 550
    .line 551
    move-result-object v5

    .line 552
    move-object/from16 p10, p2

    .line 553
    .line 554
    move-object/from16 p6, v1

    .line 555
    .line 556
    move/from16 p5, v2

    .line 557
    .line 558
    move-object/from16 p9, v5

    .line 559
    .line 560
    move-object/from16 p4, v8

    .line 561
    .line 562
    move/from16 p8, v13

    .line 563
    .line 564
    move-object/from16 p7, v22

    .line 565
    .line 566
    invoke-static/range {p4 .. p10}, Landroidx/compose/foundation/selection/SelectableKt;->selectable-O2vRcR0(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLandroidx/compose/ui/semantics/Role;Lhd/a;)Landroidx/compose/ui/Modifier;

    .line 567
    .line 568
    .line 569
    move-result-object v1

    .line 570
    move-object/from16 v22, p4

    .line 571
    .line 572
    move-object/from16 v2, p6

    .line 573
    .line 574
    sget v5, Landroidx/compose/material3/NavigationBarKt;->NavigationBarHeight:F

    .line 575
    .line 576
    const/4 v8, 0x0

    .line 577
    const/4 v7, 0x0

    .line 578
    invoke-static {v1, v8, v5, v4, v7}, Landroidx/compose/foundation/layout/SizeKt;->defaultMinSize-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 579
    .line 580
    .line 581
    move-result-object v1

    .line 582
    const/4 v5, 0x2

    .line 583
    const/4 v7, 0x0

    .line 584
    const/high16 v23, 0x3f800000    # 1.0f

    .line 585
    .line 586
    const/16 v24, 0x0

    .line 587
    .line 588
    move-object/from16 p4, p0

    .line 589
    .line 590
    move-object/from16 p5, v1

    .line 591
    .line 592
    move/from16 p8, v5

    .line 593
    .line 594
    move-object/from16 p9, v7

    .line 595
    .line 596
    move/from16 p6, v23

    .line 597
    .line 598
    move/from16 p7, v24

    .line 599
    .line 600
    invoke-static/range {p4 .. p9}, Landroidx/compose/foundation/layout/RowScope;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 601
    .line 602
    .line 603
    move-result-object v1

    .line 604
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 605
    .line 606
    .line 607
    move-result-object v5

    .line 608
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    move-result-object v7

    .line 612
    if-ne v5, v7, :cond_2e

    .line 613
    .line 614
    new-instance v5, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$1$1;

    .line 615
    .line 616
    invoke-direct {v5, v3}, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$1$1;-><init>(Landroidx/compose/runtime/MutableIntState;)V

    .line 617
    .line 618
    .line 619
    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 620
    .line 621
    .line 622
    :cond_2e
    check-cast v5, Lhd/l;

    .line 623
    .line 624
    invoke-static {v1, v5}, Landroidx/compose/ui/layout/OnRemeasuredModifierKt;->onSizeChanged(Landroidx/compose/ui/Modifier;Lhd/l;)Landroidx/compose/ui/Modifier;

    .line 625
    .line 626
    .line 627
    move-result-object v1

    .line 628
    sget-object v5, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 629
    .line 630
    invoke-virtual {v5}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 631
    .line 632
    .line 633
    move-result-object v5

    .line 634
    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 635
    .line 636
    .line 637
    move-result-object v5

    .line 638
    const/4 v7, 0x0

    .line 639
    invoke-static {v6, v7}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 640
    .line 641
    .line 642
    move-result v23

    .line 643
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 644
    .line 645
    .line 646
    move-result-object v7

    .line 647
    invoke-static {v6, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 648
    .line 649
    .line 650
    move-result-object v1

    .line 651
    sget-object v24, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 652
    .line 653
    invoke-virtual/range {v24 .. v24}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lhd/a;

    .line 654
    .line 655
    .line 656
    move-result-object v4

    .line 657
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 658
    .line 659
    .line 660
    move-result-object v25

    .line 661
    if-nez v25, :cond_2f

    .line 662
    .line 663
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 664
    .line 665
    .line 666
    :cond_2f
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 667
    .line 668
    .line 669
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 670
    .line 671
    .line 672
    move-result v25

    .line 673
    if-eqz v25, :cond_30

    .line 674
    .line 675
    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->createNode(Lhd/a;)V

    .line 676
    .line 677
    .line 678
    goto :goto_1b

    .line 679
    :cond_30
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 680
    .line 681
    .line 682
    :goto_1b
    invoke-static {v6}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 683
    .line 684
    .line 685
    move-result-object v4

    .line 686
    invoke-virtual/range {v24 .. v24}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lhd/p;

    .line 687
    .line 688
    .line 689
    move-result-object v8

    .line 690
    invoke-static {v4, v5, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 691
    .line 692
    .line 693
    invoke-virtual/range {v24 .. v24}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lhd/p;

    .line 694
    .line 695
    .line 696
    move-result-object v5

    .line 697
    invoke-static {v4, v7, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 698
    .line 699
    .line 700
    invoke-virtual/range {v24 .. v24}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lhd/p;

    .line 701
    .line 702
    .line 703
    move-result-object v5

    .line 704
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 705
    .line 706
    .line 707
    move-result v7

    .line 708
    if-nez v7, :cond_31

    .line 709
    .line 710
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 711
    .line 712
    .line 713
    move-result-object v7

    .line 714
    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 715
    .line 716
    .line 717
    move-result-object v8

    .line 718
    invoke-static {v7, v8}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 719
    .line 720
    .line 721
    move-result v7

    .line 722
    if-nez v7, :cond_32

    .line 723
    .line 724
    :cond_31
    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 725
    .line 726
    .line 727
    move-result-object v7

    .line 728
    invoke-interface {v4, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 729
    .line 730
    .line 731
    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 732
    .line 733
    .line 734
    move-result-object v7

    .line 735
    invoke-interface {v4, v7, v5}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lhd/p;)V

    .line 736
    .line 737
    .line 738
    :cond_32
    invoke-virtual/range {v24 .. v24}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lhd/p;

    .line 739
    .line 740
    .line 741
    move-result-object v5

    .line 742
    invoke-static {v4, v1, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 743
    .line 744
    .line 745
    sget-object v1, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 746
    .line 747
    if-eqz p1, :cond_33

    .line 748
    .line 749
    const/high16 v8, 0x3f800000    # 1.0f

    .line 750
    .line 751
    move v1, v8

    .line 752
    goto :goto_1c

    .line 753
    :cond_33
    const/4 v1, 0x0

    .line 754
    :goto_1c
    const/16 v4, 0x64

    .line 755
    .line 756
    const/4 v5, 0x6

    .line 757
    const/4 v7, 0x0

    .line 758
    const/4 v8, 0x0

    .line 759
    invoke-static {v4, v7, v8, v5, v8}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    .line 760
    .line 761
    .line 762
    move-result-object v4

    .line 763
    const/16 v7, 0x30

    .line 764
    .line 765
    move-object/from16 v19, v8

    .line 766
    .line 767
    const/16 v8, 0x1c

    .line 768
    .line 769
    move-object v5, v3

    .line 770
    const/4 v3, 0x0

    .line 771
    move-object/from16 v16, v2

    .line 772
    .line 773
    move-object v2, v4

    .line 774
    const/4 v4, 0x0

    .line 775
    move-object/from16 v23, v5

    .line 776
    .line 777
    const/4 v5, 0x0

    .line 778
    move/from16 p9, v9

    .line 779
    .line 780
    move-object/from16 p4, v10

    .line 781
    .line 782
    move-object/from16 v9, v16

    .line 783
    .line 784
    move-object/from16 v10, v19

    .line 785
    .line 786
    invoke-static/range {v1 .. v8}, Landroidx/compose/animation/core/AnimateAsStateKt;->animateFloatAsState(FLandroidx/compose/animation/core/AnimationSpec;FLjava/lang/String;Lhd/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    .line 787
    .line 788
    .line 789
    move-result-object v1

    .line 790
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 791
    .line 792
    .line 793
    move-result-object v2

    .line 794
    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    move-result-object v2

    .line 798
    check-cast v2, Landroidx/compose/ui/unit/Density;

    .line 799
    .line 800
    sget-object v3, Landroidx/compose/material3/tokens/NavigationBarTokens;->INSTANCE:Landroidx/compose/material3/tokens/NavigationBarTokens;

    .line 801
    .line 802
    invoke-virtual {v3}, Landroidx/compose/material3/tokens/NavigationBarTokens;->getActiveIndicatorWidth-D9Ej5fM()F

    .line 803
    .line 804
    .line 805
    move-result v3

    .line 806
    invoke-interface {v2, v3}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 807
    .line 808
    .line 809
    move-result v3

    .line 810
    invoke-static/range {v23 .. v23}, Landroidx/compose/material3/NavigationBarKt;->NavigationBarItem$lambda$3(Landroidx/compose/runtime/MutableIntState;)I

    .line 811
    .line 812
    .line 813
    move-result v4

    .line 814
    sub-int/2addr v4, v3

    .line 815
    int-to-float v3, v4

    .line 816
    const/4 v4, 0x2

    .line 817
    int-to-float v4, v4

    .line 818
    div-float/2addr v3, v4

    .line 819
    sget v4, Landroidx/compose/material3/NavigationBarKt;->IndicatorVerticalOffset:F

    .line 820
    .line 821
    invoke-interface {v2, v4}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 822
    .line 823
    .line 824
    move-result v2

    .line 825
    invoke-static {v3, v2}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    .line 826
    .line 827
    .line 828
    move-result-wide v2

    .line 829
    sget-object v4, Lqc/q;->a:Lqc/q;

    .line 830
    .line 831
    invoke-interface {v6, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 832
    .line 833
    .line 834
    move-result v4

    .line 835
    invoke-interface {v6, v2, v3}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 836
    .line 837
    .line 838
    move-result v5

    .line 839
    or-int/2addr v4, v5

    .line 840
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 841
    .line 842
    .line 843
    move-result-object v5

    .line 844
    if-nez v4, :cond_34

    .line 845
    .line 846
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 847
    .line 848
    .line 849
    move-result-object v4

    .line 850
    if-ne v5, v4, :cond_35

    .line 851
    .line 852
    :cond_34
    new-instance v5, Landroidx/compose/material3/internal/MappedInteractionSource;

    .line 853
    .line 854
    invoke-direct {v5, v9, v2, v3, v10}, Landroidx/compose/material3/internal/MappedInteractionSource;-><init>(Landroidx/compose/foundation/interaction/InteractionSource;JLkotlin/jvm/internal/n;)V

    .line 855
    .line 856
    .line 857
    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 858
    .line 859
    .line 860
    :cond_35
    check-cast v5, Landroidx/compose/material3/internal/MappedInteractionSource;

    .line 861
    .line 862
    new-instance v2, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$2$indicatorRipple$1;

    .line 863
    .line 864
    invoke-direct {v2, v5}, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$2$indicatorRipple$1;-><init>(Landroidx/compose/material3/internal/MappedInteractionSource;)V

    .line 865
    .line 866
    .line 867
    const v3, 0x293afa35

    .line 868
    .line 869
    .line 870
    const/16 v4, 0x36

    .line 871
    .line 872
    const/4 v5, 0x1

    .line 873
    invoke-static {v3, v5, v2, v6, v4}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 874
    .line 875
    .line 876
    move-result-object v2

    .line 877
    new-instance v3, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$2$indicator$1;

    .line 878
    .line 879
    invoke-direct {v3, v1, v0}, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$2$indicator$1;-><init>(Landroidx/compose/runtime/State;Landroidx/compose/material3/NavigationBarItemColors;)V

    .line 880
    .line 881
    .line 882
    const v7, -0x1c472dfb

    .line 883
    .line 884
    .line 885
    invoke-static {v7, v5, v3, v6, v4}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 886
    .line 887
    .line 888
    move-result-object v3

    .line 889
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 890
    .line 891
    .line 892
    move-result v4

    .line 893
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 894
    .line 895
    .line 896
    move-result-object v5

    .line 897
    if-nez v4, :cond_36

    .line 898
    .line 899
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 900
    .line 901
    .line 902
    move-result-object v4

    .line 903
    if-ne v5, v4, :cond_37

    .line 904
    .line 905
    :cond_36
    new-instance v5, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$2$2$1;

    .line 906
    .line 907
    invoke-direct {v5, v1}, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$2$2$1;-><init>(Landroidx/compose/runtime/State;)V

    .line 908
    .line 909
    .line 910
    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 911
    .line 912
    .line 913
    :cond_37
    check-cast v5, Lhd/a;

    .line 914
    .line 915
    shr-int/lit8 v1, v14, 0x9

    .line 916
    .line 917
    const v4, 0xe000

    .line 918
    .line 919
    .line 920
    and-int/2addr v1, v4

    .line 921
    or-int/lit16 v8, v1, 0x1b6

    .line 922
    .line 923
    move-object v1, v2

    .line 924
    move-object v2, v3

    .line 925
    move-object v7, v6

    .line 926
    move-object/from16 v3, v18

    .line 927
    .line 928
    move-object/from16 v4, v20

    .line 929
    .line 930
    move-object v6, v5

    .line 931
    move/from16 v5, p9

    .line 932
    .line 933
    invoke-static/range {v1 .. v8}, Landroidx/compose/material3/NavigationBarKt;->NavigationBarItemLayout(Lhd/p;Lhd/p;Lhd/p;Lhd/p;ZLhd/a;Landroidx/compose/runtime/Composer;I)V

    .line 934
    .line 935
    .line 936
    move-object v6, v7

    .line 937
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 938
    .line 939
    .line 940
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 941
    .line 942
    .line 943
    move-result v1

    .line 944
    if-eqz v1, :cond_38

    .line 945
    .line 946
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 947
    .line 948
    .line 949
    :cond_38
    move-object/from16 v10, p4

    .line 950
    .line 951
    move-object v9, v0

    .line 952
    move v8, v5

    .line 953
    move-object/from16 v5, v22

    .line 954
    .line 955
    goto/16 :goto_14

    .line 956
    .line 957
    :goto_1d
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 958
    .line 959
    .line 960
    move-result-object v13

    .line 961
    if-eqz v13, :cond_39

    .line 962
    .line 963
    new-instance v0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$3;

    .line 964
    .line 965
    move-object/from16 v1, p0

    .line 966
    .line 967
    move/from16 v2, p1

    .line 968
    .line 969
    move-object/from16 v3, p2

    .line 970
    .line 971
    move-object/from16 v4, p3

    .line 972
    .line 973
    invoke-direct/range {v0 .. v12}, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$3;-><init>(Landroidx/compose/foundation/layout/RowScope;ZLhd/a;Lhd/p;Landroidx/compose/ui/Modifier;ZLhd/p;ZLandroidx/compose/material3/NavigationBarItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;II)V

    .line 974
    .line 975
    .line 976
    invoke-interface {v13, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lhd/p;)V

    .line 977
    .line 978
    .line 979
    :cond_39
    return-void
.end method

.method private static final NavigationBarItem$lambda$3(Landroidx/compose/runtime/MutableIntState;)I
    .locals 0

    .line 1
    invoke-interface {p0}, Landroidx/compose/runtime/IntState;->getIntValue()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final NavigationBarItem$lambda$4(Landroidx/compose/runtime/MutableIntState;I)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Landroidx/compose/runtime/MutableIntState;->setIntValue(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final NavigationBarItemLayout(Lhd/p;Lhd/p;Lhd/p;Lhd/p;ZLhd/a;Landroidx/compose/runtime/Composer;I)V
    .locals 19
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/p;",
            "Lhd/p;",
            "Lhd/p;",
            "Lhd/p;",
            "Z",
            "Lhd/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
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
    move-object/from16 v4, p3

    .line 8
    .line 9
    move/from16 v5, p4

    .line 10
    .line 11
    move-object/from16 v6, p5

    .line 12
    .line 13
    move/from16 v7, p7

    .line 14
    .line 15
    const v0, -0x550f732e

    .line 16
    .line 17
    .line 18
    move-object/from16 v8, p6

    .line 19
    .line 20
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 21
    .line 22
    .line 23
    move-result-object v8

    .line 24
    and-int/lit8 v9, v7, 0x6

    .line 25
    .line 26
    if-nez v9, :cond_1

    .line 27
    .line 28
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v9

    .line 32
    if-eqz v9, :cond_0

    .line 33
    .line 34
    const/4 v9, 0x4

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v9, 0x2

    .line 37
    :goto_0
    or-int/2addr v9, v7

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move v9, v7

    .line 40
    :goto_1
    and-int/lit8 v10, v7, 0x30

    .line 41
    .line 42
    if-nez v10, :cond_3

    .line 43
    .line 44
    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v10

    .line 48
    if-eqz v10, :cond_2

    .line 49
    .line 50
    const/16 v10, 0x20

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    const/16 v10, 0x10

    .line 54
    .line 55
    :goto_2
    or-int/2addr v9, v10

    .line 56
    :cond_3
    and-int/lit16 v10, v7, 0x180

    .line 57
    .line 58
    if-nez v10, :cond_5

    .line 59
    .line 60
    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v10

    .line 64
    if-eqz v10, :cond_4

    .line 65
    .line 66
    const/16 v10, 0x100

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_4
    const/16 v10, 0x80

    .line 70
    .line 71
    :goto_3
    or-int/2addr v9, v10

    .line 72
    :cond_5
    and-int/lit16 v10, v7, 0xc00

    .line 73
    .line 74
    const/16 v11, 0x800

    .line 75
    .line 76
    if-nez v10, :cond_7

    .line 77
    .line 78
    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v10

    .line 82
    if-eqz v10, :cond_6

    .line 83
    .line 84
    move v10, v11

    .line 85
    goto :goto_4

    .line 86
    :cond_6
    const/16 v10, 0x400

    .line 87
    .line 88
    :goto_4
    or-int/2addr v9, v10

    .line 89
    :cond_7
    and-int/lit16 v10, v7, 0x6000

    .line 90
    .line 91
    const/16 v12, 0x4000

    .line 92
    .line 93
    if-nez v10, :cond_9

    .line 94
    .line 95
    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 96
    .line 97
    .line 98
    move-result v10

    .line 99
    if-eqz v10, :cond_8

    .line 100
    .line 101
    move v10, v12

    .line 102
    goto :goto_5

    .line 103
    :cond_8
    const/16 v10, 0x2000

    .line 104
    .line 105
    :goto_5
    or-int/2addr v9, v10

    .line 106
    :cond_9
    const/high16 v10, 0x30000

    .line 107
    .line 108
    and-int/2addr v10, v7

    .line 109
    const/high16 v13, 0x20000

    .line 110
    .line 111
    if-nez v10, :cond_b

    .line 112
    .line 113
    invoke-interface {v8, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v10

    .line 117
    if-eqz v10, :cond_a

    .line 118
    .line 119
    move v10, v13

    .line 120
    goto :goto_6

    .line 121
    :cond_a
    const/high16 v10, 0x10000

    .line 122
    .line 123
    :goto_6
    or-int/2addr v9, v10

    .line 124
    :cond_b
    const v10, 0x12493

    .line 125
    .line 126
    .line 127
    and-int/2addr v10, v9

    .line 128
    const v14, 0x12492

    .line 129
    .line 130
    .line 131
    if-ne v10, v14, :cond_d

    .line 132
    .line 133
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 134
    .line 135
    .line 136
    move-result v10

    .line 137
    if-nez v10, :cond_c

    .line 138
    .line 139
    goto :goto_7

    .line 140
    :cond_c
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 141
    .line 142
    .line 143
    goto/16 :goto_11

    .line 144
    .line 145
    :cond_d
    :goto_7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 146
    .line 147
    .line 148
    move-result v10

    .line 149
    if-eqz v10, :cond_e

    .line 150
    .line 151
    const/4 v10, -0x1

    .line 152
    const-string v14, "androidx.compose.material3.NavigationBarItemLayout (NavigationBar.kt:515)"

    .line 153
    .line 154
    invoke-static {v0, v9, v10, v14}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 155
    .line 156
    .line 157
    :cond_e
    const/high16 v0, 0x70000

    .line 158
    .line 159
    and-int/2addr v0, v9

    .line 160
    const/4 v14, 0x0

    .line 161
    if-ne v0, v13, :cond_f

    .line 162
    .line 163
    const/4 v15, 0x1

    .line 164
    goto :goto_8

    .line 165
    :cond_f
    move v15, v14

    .line 166
    :goto_8
    and-int/lit16 v10, v9, 0x1c00

    .line 167
    .line 168
    if-ne v10, v11, :cond_10

    .line 169
    .line 170
    const/4 v10, 0x1

    .line 171
    goto :goto_9

    .line 172
    :cond_10
    move v10, v14

    .line 173
    :goto_9
    or-int/2addr v10, v15

    .line 174
    const v11, 0xe000

    .line 175
    .line 176
    .line 177
    and-int/2addr v11, v9

    .line 178
    if-ne v11, v12, :cond_11

    .line 179
    .line 180
    const/4 v15, 0x1

    .line 181
    goto :goto_a

    .line 182
    :cond_11
    move v15, v14

    .line 183
    :goto_a
    or-int/2addr v10, v15

    .line 184
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v15

    .line 188
    if-nez v10, :cond_12

    .line 189
    .line 190
    sget-object v10, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 191
    .line 192
    invoke-virtual {v10}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v10

    .line 196
    if-ne v15, v10, :cond_13

    .line 197
    .line 198
    :cond_12
    new-instance v15, Landroidx/compose/material3/NavigationBarKt$NavigationBarItemLayout$2$1;

    .line 199
    .line 200
    invoke-direct {v15, v6, v4, v5}, Landroidx/compose/material3/NavigationBarKt$NavigationBarItemLayout$2$1;-><init>(Lhd/a;Lhd/p;Z)V

    .line 201
    .line 202
    .line 203
    invoke-interface {v8, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    :cond_13
    check-cast v15, Landroidx/compose/ui/layout/MeasurePolicy;

    .line 207
    .line 208
    sget-object v10, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 209
    .line 210
    invoke-static {v8, v14}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 211
    .line 212
    .line 213
    move-result v16

    .line 214
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 215
    .line 216
    .line 217
    move-result-object v13

    .line 218
    invoke-static {v8, v10}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 219
    .line 220
    .line 221
    move-result-object v12

    .line 222
    sget-object v17, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 223
    .line 224
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lhd/a;

    .line 225
    .line 226
    .line 227
    move-result-object v14

    .line 228
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 229
    .line 230
    .line 231
    move-result-object v18

    .line 232
    if-nez v18, :cond_14

    .line 233
    .line 234
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 235
    .line 236
    .line 237
    :cond_14
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 238
    .line 239
    .line 240
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 241
    .line 242
    .line 243
    move-result v18

    .line 244
    if-eqz v18, :cond_15

    .line 245
    .line 246
    invoke-interface {v8, v14}, Landroidx/compose/runtime/Composer;->createNode(Lhd/a;)V

    .line 247
    .line 248
    .line 249
    goto :goto_b

    .line 250
    :cond_15
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 251
    .line 252
    .line 253
    :goto_b
    invoke-static {v8}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 254
    .line 255
    .line 256
    move-result-object v14

    .line 257
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lhd/p;

    .line 258
    .line 259
    .line 260
    move-result-object v7

    .line 261
    invoke-static {v14, v15, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lhd/p;

    .line 265
    .line 266
    .line 267
    move-result-object v7

    .line 268
    invoke-static {v14, v13, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lhd/p;

    .line 272
    .line 273
    .line 274
    move-result-object v7

    .line 275
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 276
    .line 277
    .line 278
    move-result v13

    .line 279
    if-nez v13, :cond_16

    .line 280
    .line 281
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v13

    .line 285
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 286
    .line 287
    .line 288
    move-result-object v15

    .line 289
    invoke-static {v13, v15}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v13

    .line 293
    if-nez v13, :cond_17

    .line 294
    .line 295
    :cond_16
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 296
    .line 297
    .line 298
    move-result-object v13

    .line 299
    invoke-interface {v14, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 303
    .line 304
    .line 305
    move-result-object v13

    .line 306
    invoke-interface {v14, v13, v7}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lhd/p;)V

    .line 307
    .line 308
    .line 309
    :cond_17
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lhd/p;

    .line 310
    .line 311
    .line 312
    move-result-object v7

    .line 313
    invoke-static {v14, v12, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 314
    .line 315
    .line 316
    and-int/lit8 v7, v9, 0xe

    .line 317
    .line 318
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 319
    .line 320
    .line 321
    move-result-object v7

    .line 322
    invoke-interface {v1, v8, v7}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    shr-int/lit8 v7, v9, 0x3

    .line 326
    .line 327
    and-int/lit8 v7, v7, 0xe

    .line 328
    .line 329
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 330
    .line 331
    .line 332
    move-result-object v7

    .line 333
    invoke-interface {v2, v8, v7}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    const-string v7, "icon"

    .line 337
    .line 338
    invoke-static {v10, v7}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 339
    .line 340
    .line 341
    move-result-object v7

    .line 342
    sget-object v12, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 343
    .line 344
    invoke-virtual {v12}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 345
    .line 346
    .line 347
    move-result-object v13

    .line 348
    const/4 v14, 0x0

    .line 349
    invoke-static {v13, v14}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 350
    .line 351
    .line 352
    move-result-object v13

    .line 353
    invoke-static {v8, v14}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 354
    .line 355
    .line 356
    move-result v15

    .line 357
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 358
    .line 359
    .line 360
    move-result-object v14

    .line 361
    invoke-static {v8, v7}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 362
    .line 363
    .line 364
    move-result-object v7

    .line 365
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lhd/a;

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 370
    .line 371
    .line 372
    move-result-object v16

    .line 373
    if-nez v16, :cond_18

    .line 374
    .line 375
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 376
    .line 377
    .line 378
    :cond_18
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 379
    .line 380
    .line 381
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 382
    .line 383
    .line 384
    move-result v16

    .line 385
    if-eqz v16, :cond_19

    .line 386
    .line 387
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->createNode(Lhd/a;)V

    .line 388
    .line 389
    .line 390
    goto :goto_c

    .line 391
    :cond_19
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 392
    .line 393
    .line 394
    :goto_c
    invoke-static {v8}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 395
    .line 396
    .line 397
    move-result-object v1

    .line 398
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lhd/p;

    .line 399
    .line 400
    .line 401
    move-result-object v2

    .line 402
    invoke-static {v1, v13, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 403
    .line 404
    .line 405
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lhd/p;

    .line 406
    .line 407
    .line 408
    move-result-object v2

    .line 409
    invoke-static {v1, v14, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 410
    .line 411
    .line 412
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lhd/p;

    .line 413
    .line 414
    .line 415
    move-result-object v2

    .line 416
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 417
    .line 418
    .line 419
    move-result v13

    .line 420
    if-nez v13, :cond_1a

    .line 421
    .line 422
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v13

    .line 426
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 427
    .line 428
    .line 429
    move-result-object v14

    .line 430
    invoke-static {v13, v14}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 431
    .line 432
    .line 433
    move-result v13

    .line 434
    if-nez v13, :cond_1b

    .line 435
    .line 436
    :cond_1a
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 437
    .line 438
    .line 439
    move-result-object v13

    .line 440
    invoke-interface {v1, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 441
    .line 442
    .line 443
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 444
    .line 445
    .line 446
    move-result-object v13

    .line 447
    invoke-interface {v1, v13, v2}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lhd/p;)V

    .line 448
    .line 449
    .line 450
    :cond_1b
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lhd/p;

    .line 451
    .line 452
    .line 453
    move-result-object v2

    .line 454
    invoke-static {v1, v7, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 455
    .line 456
    .line 457
    sget-object v1, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 458
    .line 459
    shr-int/lit8 v1, v9, 0x6

    .line 460
    .line 461
    and-int/lit8 v1, v1, 0xe

    .line 462
    .line 463
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 464
    .line 465
    .line 466
    move-result-object v1

    .line 467
    invoke-interface {v3, v8, v1}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 471
    .line 472
    .line 473
    const v1, 0x40cd4da0

    .line 474
    .line 475
    .line 476
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 477
    .line 478
    .line 479
    if-eqz v4, :cond_24

    .line 480
    .line 481
    const-string v1, "label"

    .line 482
    .line 483
    invoke-static {v10, v1}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 484
    .line 485
    .line 486
    move-result-object v1

    .line 487
    const/16 v2, 0x4000

    .line 488
    .line 489
    if-ne v11, v2, :cond_1c

    .line 490
    .line 491
    const/4 v14, 0x1

    .line 492
    :goto_d
    const/high16 v2, 0x20000

    .line 493
    .line 494
    goto :goto_e

    .line 495
    :cond_1c
    const/4 v14, 0x0

    .line 496
    goto :goto_d

    .line 497
    :goto_e
    if-ne v0, v2, :cond_1d

    .line 498
    .line 499
    const/4 v10, 0x1

    .line 500
    goto :goto_f

    .line 501
    :cond_1d
    const/4 v10, 0x0

    .line 502
    :goto_f
    or-int v0, v14, v10

    .line 503
    .line 504
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v2

    .line 508
    if-nez v0, :cond_1e

    .line 509
    .line 510
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 511
    .line 512
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v0

    .line 516
    if-ne v2, v0, :cond_1f

    .line 517
    .line 518
    :cond_1e
    new-instance v2, Landroidx/compose/material3/NavigationBarKt$NavigationBarItemLayout$1$2$1;

    .line 519
    .line 520
    invoke-direct {v2, v5, v6}, Landroidx/compose/material3/NavigationBarKt$NavigationBarItemLayout$1$2$1;-><init>(ZLhd/a;)V

    .line 521
    .line 522
    .line 523
    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 524
    .line 525
    .line 526
    :cond_1f
    check-cast v2, Lhd/l;

    .line 527
    .line 528
    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/GraphicsLayerModifierKt;->graphicsLayer(Landroidx/compose/ui/Modifier;Lhd/l;)Landroidx/compose/ui/Modifier;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    invoke-virtual {v12}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 533
    .line 534
    .line 535
    move-result-object v1

    .line 536
    const/4 v14, 0x0

    .line 537
    invoke-static {v1, v14}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 538
    .line 539
    .line 540
    move-result-object v1

    .line 541
    invoke-static {v8, v14}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 542
    .line 543
    .line 544
    move-result v2

    .line 545
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 546
    .line 547
    .line 548
    move-result-object v7

    .line 549
    invoke-static {v8, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lhd/a;

    .line 554
    .line 555
    .line 556
    move-result-object v10

    .line 557
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 558
    .line 559
    .line 560
    move-result-object v11

    .line 561
    if-nez v11, :cond_20

    .line 562
    .line 563
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 564
    .line 565
    .line 566
    :cond_20
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 567
    .line 568
    .line 569
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 570
    .line 571
    .line 572
    move-result v11

    .line 573
    if-eqz v11, :cond_21

    .line 574
    .line 575
    invoke-interface {v8, v10}, Landroidx/compose/runtime/Composer;->createNode(Lhd/a;)V

    .line 576
    .line 577
    .line 578
    goto :goto_10

    .line 579
    :cond_21
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 580
    .line 581
    .line 582
    :goto_10
    invoke-static {v8}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 583
    .line 584
    .line 585
    move-result-object v10

    .line 586
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lhd/p;

    .line 587
    .line 588
    .line 589
    move-result-object v11

    .line 590
    invoke-static {v10, v1, v11}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 591
    .line 592
    .line 593
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lhd/p;

    .line 594
    .line 595
    .line 596
    move-result-object v1

    .line 597
    invoke-static {v10, v7, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 598
    .line 599
    .line 600
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lhd/p;

    .line 601
    .line 602
    .line 603
    move-result-object v1

    .line 604
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 605
    .line 606
    .line 607
    move-result v7

    .line 608
    if-nez v7, :cond_22

    .line 609
    .line 610
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    move-result-object v7

    .line 614
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 615
    .line 616
    .line 617
    move-result-object v11

    .line 618
    invoke-static {v7, v11}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 619
    .line 620
    .line 621
    move-result v7

    .line 622
    if-nez v7, :cond_23

    .line 623
    .line 624
    :cond_22
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 625
    .line 626
    .line 627
    move-result-object v7

    .line 628
    invoke-interface {v10, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 629
    .line 630
    .line 631
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 632
    .line 633
    .line 634
    move-result-object v2

    .line 635
    invoke-interface {v10, v2, v1}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lhd/p;)V

    .line 636
    .line 637
    .line 638
    :cond_23
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lhd/p;

    .line 639
    .line 640
    .line 641
    move-result-object v1

    .line 642
    invoke-static {v10, v0, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 643
    .line 644
    .line 645
    shr-int/lit8 v0, v9, 0x9

    .line 646
    .line 647
    and-int/lit8 v0, v0, 0xe

    .line 648
    .line 649
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 650
    .line 651
    .line 652
    move-result-object v0

    .line 653
    invoke-interface {v4, v8, v0}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 654
    .line 655
    .line 656
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 657
    .line 658
    .line 659
    :cond_24
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 660
    .line 661
    .line 662
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 663
    .line 664
    .line 665
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 666
    .line 667
    .line 668
    move-result v0

    .line 669
    if-eqz v0, :cond_25

    .line 670
    .line 671
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 672
    .line 673
    .line 674
    :cond_25
    :goto_11
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 675
    .line 676
    .line 677
    move-result-object v8

    .line 678
    if-eqz v8, :cond_26

    .line 679
    .line 680
    new-instance v0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItemLayout$3;

    .line 681
    .line 682
    move-object/from16 v1, p0

    .line 683
    .line 684
    move-object/from16 v2, p1

    .line 685
    .line 686
    move/from16 v7, p7

    .line 687
    .line 688
    invoke-direct/range {v0 .. v7}, Landroidx/compose/material3/NavigationBarKt$NavigationBarItemLayout$3;-><init>(Lhd/p;Lhd/p;Lhd/p;Lhd/p;ZLhd/a;I)V

    .line 689
    .line 690
    .line 691
    invoke-interface {v8, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lhd/p;)V

    .line 692
    .line 693
    .line 694
    :cond_26
    return-void
.end method

.method public static final synthetic access$NavigationBarItem$lambda$4(Landroidx/compose/runtime/MutableIntState;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/material3/NavigationBarKt;->NavigationBarItem$lambda$4(Landroidx/compose/runtime/MutableIntState;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$NavigationBarItemLayout(Lhd/p;Lhd/p;Lhd/p;Lhd/p;ZLhd/a;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Landroidx/compose/material3/NavigationBarKt;->NavigationBarItemLayout(Lhd/p;Lhd/p;Lhd/p;Lhd/p;ZLhd/a;Landroidx/compose/runtime/Composer;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getIndicatorHorizontalPadding$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/NavigationBarKt;->IndicatorHorizontalPadding:F

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$getNavigationBarHeight$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/NavigationBarKt;->NavigationBarHeight:F

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$placeIcon-X9ElhV4(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Landroidx/compose/material3/NavigationBarKt;->placeIcon-X9ElhV4(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$placeLabelAndIcon-zUg2_y0(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JZF)Landroidx/compose/ui/layout/MeasureResult;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p8}, Landroidx/compose/material3/NavigationBarKt;->placeLabelAndIcon-zUg2_y0(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JZF)Landroidx/compose/ui/layout/MeasureResult;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final getIndicatorVerticalPadding()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/NavigationBarKt;->IndicatorVerticalPadding:F

    .line 2
    .line 3
    return v0
.end method

.method public static final getNavigationBarIndicatorToLabelPadding()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/NavigationBarKt;->NavigationBarIndicatorToLabelPadding:F

    .line 2
    .line 3
    return v0
.end method

.method public static final getNavigationBarItemHorizontalPadding()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/NavigationBarKt;->NavigationBarItemHorizontalPadding:F

    .line 2
    .line 3
    return v0
.end method

.method private static final placeIcon-X9ElhV4(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 10

    .line 1
    invoke-static {p4, p5}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 2
    .line 3
    .line 4
    move-result v1

    .line 5
    sget v0, Landroidx/compose/material3/NavigationBarKt;->NavigationBarHeight:F

    .line 6
    .line 7
    invoke-interface {p0, v0}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {p4, p5, v0}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainHeight-K40F9xA(JI)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-virtual {p1}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 16
    .line 17
    .line 18
    move-result p4

    .line 19
    sub-int p4, v1, p4

    .line 20
    .line 21
    div-int/lit8 v3, p4, 0x2

    .line 22
    .line 23
    invoke-virtual {p1}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 24
    .line 25
    .line 26
    move-result p4

    .line 27
    sub-int p4, v2, p4

    .line 28
    .line 29
    div-int/lit8 v4, p4, 0x2

    .line 30
    .line 31
    invoke-virtual {p2}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 32
    .line 33
    .line 34
    move-result p4

    .line 35
    sub-int p4, v1, p4

    .line 36
    .line 37
    div-int/lit8 v6, p4, 0x2

    .line 38
    .line 39
    invoke-virtual {p2}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 40
    .line 41
    .line 42
    move-result p4

    .line 43
    sub-int p4, v2, p4

    .line 44
    .line 45
    div-int/lit8 v7, p4, 0x2

    .line 46
    .line 47
    new-instance v0, Landroidx/compose/material3/NavigationBarKt$placeIcon$1;

    .line 48
    .line 49
    move-object v5, p2

    .line 50
    move v8, v1

    .line 51
    move v9, v2

    .line 52
    move-object v2, p1

    .line 53
    move-object v1, p3

    .line 54
    invoke-direct/range {v0 .. v9}, Landroidx/compose/material3/NavigationBarKt$placeIcon$1;-><init>(Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;IILandroidx/compose/ui/layout/Placeable;IIII)V

    .line 55
    .line 56
    .line 57
    move v1, v8

    .line 58
    move v2, v9

    .line 59
    const/4 v5, 0x4

    .line 60
    const/4 v6, 0x0

    .line 61
    const/4 v3, 0x0

    .line 62
    move-object v4, v0

    .line 63
    move-object v0, p0

    .line 64
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lhd/l;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0
.end method

.method private static final placeLabelAndIcon-zUg2_y0(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JZF)Landroidx/compose/ui/layout/MeasureResult;
    .locals 17

    .line 1
    move-object/from16 v15, p0

    .line 2
    .line 3
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    int-to-float v0, v0

    .line 8
    sget v1, Landroidx/compose/material3/NavigationBarKt;->IndicatorVerticalPadding:F

    .line 9
    .line 10
    invoke-interface {v15, v1}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    add-float/2addr v0, v2

    .line 15
    sget v2, Landroidx/compose/material3/NavigationBarKt;->NavigationBarIndicatorToLabelPadding:F

    .line 16
    .line 17
    invoke-interface {v15, v2}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    add-float/2addr v0, v3

    .line 22
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    int-to-float v3, v3

    .line 27
    add-float/2addr v0, v3

    .line 28
    invoke-static/range {p5 .. p6}, Landroidx/compose/ui/unit/Constraints;->getMinHeight-impl(J)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    int-to-float v3, v3

    .line 33
    sub-float/2addr v3, v0

    .line 34
    const/4 v4, 0x2

    .line 35
    int-to-float v5, v4

    .line 36
    div-float/2addr v3, v5

    .line 37
    invoke-interface {v15, v1}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    invoke-static {v3, v6}, Lnd/o;->d(FF)F

    .line 42
    .line 43
    .line 44
    move-result v10

    .line 45
    mul-float v3, v10, v5

    .line 46
    .line 47
    add-float/2addr v0, v3

    .line 48
    if-eqz p7, :cond_0

    .line 49
    .line 50
    move v3, v10

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    int-to-float v3, v3

    .line 57
    sub-float v3, v0, v3

    .line 58
    .line 59
    div-float/2addr v3, v5

    .line 60
    :goto_0
    sub-float/2addr v3, v10

    .line 61
    const/4 v5, 0x1

    .line 62
    int-to-float v5, v5

    .line 63
    sub-float v5, v5, p8

    .line 64
    .line 65
    mul-float v7, v3, v5

    .line 66
    .line 67
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    int-to-float v3, v3

    .line 72
    add-float/2addr v3, v10

    .line 73
    invoke-interface {v15, v1}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    add-float/2addr v3, v5

    .line 78
    invoke-interface {v15, v2}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    add-float v6, v3, v2

    .line 83
    .line 84
    invoke-static/range {p5 .. p6}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 85
    .line 86
    .line 87
    move-result v14

    .line 88
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    sub-int v2, v14, v2

    .line 93
    .line 94
    div-int/lit8 v5, v2, 0x2

    .line 95
    .line 96
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    sub-int v2, v14, v2

    .line 101
    .line 102
    div-int/lit8 v9, v2, 0x2

    .line 103
    .line 104
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    sub-int v2, v14, v2

    .line 109
    .line 110
    div-int/lit8 v12, v2, 0x2

    .line 111
    .line 112
    invoke-interface {v15, v1}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    sub-float v13, v10, v1

    .line 117
    .line 118
    invoke-static {v0}, Ljd/c;->d(F)I

    .line 119
    .line 120
    .line 121
    move-result v16

    .line 122
    new-instance v0, Landroidx/compose/material3/NavigationBarKt$placeLabelAndIcon$1;

    .line 123
    .line 124
    move-object/from16 v4, p1

    .line 125
    .line 126
    move-object/from16 v8, p2

    .line 127
    .line 128
    move-object/from16 v11, p3

    .line 129
    .line 130
    move-object/from16 v1, p4

    .line 131
    .line 132
    move/from16 v2, p7

    .line 133
    .line 134
    move/from16 v3, p8

    .line 135
    .line 136
    invoke-direct/range {v0 .. v15}, Landroidx/compose/material3/NavigationBarKt$placeLabelAndIcon$1;-><init>(Landroidx/compose/ui/layout/Placeable;ZFLandroidx/compose/ui/layout/Placeable;IFFLandroidx/compose/ui/layout/Placeable;IFLandroidx/compose/ui/layout/Placeable;IFILandroidx/compose/ui/layout/MeasureScope;)V

    .line 137
    .line 138
    .line 139
    const/4 v1, 0x4

    .line 140
    const/4 v2, 0x0

    .line 141
    const/4 v3, 0x0

    .line 142
    move-object/from16 p1, p0

    .line 143
    .line 144
    move-object/from16 p5, v0

    .line 145
    .line 146
    move/from16 p6, v1

    .line 147
    .line 148
    move-object/from16 p7, v2

    .line 149
    .line 150
    move-object/from16 p4, v3

    .line 151
    .line 152
    move/from16 p2, v14

    .line 153
    .line 154
    move/from16 p3, v16

    .line 155
    .line 156
    invoke-static/range {p1 .. p7}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lhd/l;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    return-object v0
.end method
