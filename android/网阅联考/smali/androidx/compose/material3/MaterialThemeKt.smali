.class public final Landroidx/compose/material3/MaterialThemeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a>\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0011\u0010\u000c\u001a\r\u0012\u0004\u0012\u00020\u00050\r\u00a2\u0006\u0002\u0008\u000eH\u0007\u00a2\u0006\u0002\u0010\u000f\u001a\u0015\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a2\u0006\u0002\u0010\u0012\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "DefaultRippleAlpha",
        "Landroidx/compose/material/ripple/RippleAlpha;",
        "TextSelectionBackgroundOpacity",
        "",
        "MaterialTheme",
        "",
        "colorScheme",
        "Landroidx/compose/material3/ColorScheme;",
        "shapes",
        "Landroidx/compose/material3/Shapes;",
        "typography",
        "Landroidx/compose/material3/Typography;",
        "content",
        "Lkotlin/Function0;",
        "Landroidx/compose/runtime/Composable;",
        "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/Shapes;Landroidx/compose/material3/Typography;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V",
        "rememberTextSelectionColors",
        "Landroidx/compose/foundation/text/selection/TextSelectionColors;",
        "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/selection/TextSelectionColors;",
        "material3_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field private static final DefaultRippleAlpha:Landroidx/compose/material/ripple/RippleAlpha;

.field public static final TextSelectionBackgroundOpacity:F = 0.4f


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Landroidx/compose/material/ripple/RippleAlpha;

    .line 2
    .line 3
    const v1, 0x3df5c28f    # 0.12f

    .line 4
    .line 5
    .line 6
    const v2, 0x3da3d70a    # 0.08f

    .line 7
    .line 8
    .line 9
    const v3, 0x3e23d70a    # 0.16f

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v3, v1, v2, v1}, Landroidx/compose/material/ripple/RippleAlpha;-><init>(FFFF)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Landroidx/compose/material3/MaterialThemeKt;->DefaultRippleAlpha:Landroidx/compose/material/ripple/RippleAlpha;

    .line 16
    .line 17
    return-void
.end method

.method public static final MaterialTheme(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/Shapes;Landroidx/compose/material3/Typography;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
    .locals 78
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[0[0]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/ColorScheme;",
            "Landroidx/compose/material3/Shapes;",
            "Landroidx/compose/material3/Typography;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v4, p3

    .line 2
    .line 3
    move/from16 v5, p5

    .line 4
    .line 5
    const-string v0, "content"

    .line 6
    .line 7
    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const v0, -0x7ec9fb7e

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p4

    .line 14
    .line 15
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    and-int/lit8 v2, v5, 0xe

    .line 20
    .line 21
    const/4 v3, 0x4

    .line 22
    const/4 v13, 0x2

    .line 23
    if-nez v2, :cond_2

    .line 24
    .line 25
    and-int/lit8 v2, p6, 0x1

    .line 26
    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    move-object/from16 v2, p0

    .line 30
    .line 31
    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    if-eqz v6, :cond_1

    .line 36
    .line 37
    move v6, v3

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move-object/from16 v2, p0

    .line 40
    .line 41
    :cond_1
    move v6, v13

    .line 42
    :goto_0
    or-int/2addr v6, v5

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    move-object/from16 v2, p0

    .line 45
    .line 46
    move v6, v5

    .line 47
    :goto_1
    and-int/lit8 v7, v5, 0x70

    .line 48
    .line 49
    if-nez v7, :cond_5

    .line 50
    .line 51
    and-int/lit8 v7, p6, 0x2

    .line 52
    .line 53
    if-nez v7, :cond_3

    .line 54
    .line 55
    move-object/from16 v7, p1

    .line 56
    .line 57
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v8

    .line 61
    if-eqz v8, :cond_4

    .line 62
    .line 63
    const/16 v8, 0x20

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    move-object/from16 v7, p1

    .line 67
    .line 68
    :cond_4
    const/16 v8, 0x10

    .line 69
    .line 70
    :goto_2
    or-int/2addr v6, v8

    .line 71
    goto :goto_3

    .line 72
    :cond_5
    move-object/from16 v7, p1

    .line 73
    .line 74
    :goto_3
    and-int/lit16 v8, v5, 0x380

    .line 75
    .line 76
    if-nez v8, :cond_8

    .line 77
    .line 78
    and-int/lit8 v8, p6, 0x4

    .line 79
    .line 80
    if-nez v8, :cond_6

    .line 81
    .line 82
    move-object/from16 v8, p2

    .line 83
    .line 84
    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v9

    .line 88
    if-eqz v9, :cond_7

    .line 89
    .line 90
    const/16 v9, 0x100

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_6
    move-object/from16 v8, p2

    .line 94
    .line 95
    :cond_7
    const/16 v9, 0x80

    .line 96
    .line 97
    :goto_4
    or-int/2addr v6, v9

    .line 98
    goto :goto_5

    .line 99
    :cond_8
    move-object/from16 v8, p2

    .line 100
    .line 101
    :goto_5
    and-int/lit8 v9, p6, 0x8

    .line 102
    .line 103
    if-eqz v9, :cond_9

    .line 104
    .line 105
    or-int/lit16 v6, v6, 0xc00

    .line 106
    .line 107
    goto :goto_7

    .line 108
    :cond_9
    and-int/lit16 v9, v5, 0x1c00

    .line 109
    .line 110
    if-nez v9, :cond_b

    .line 111
    .line 112
    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v9

    .line 116
    if-eqz v9, :cond_a

    .line 117
    .line 118
    const/16 v9, 0x800

    .line 119
    .line 120
    goto :goto_6

    .line 121
    :cond_a
    const/16 v9, 0x400

    .line 122
    .line 123
    :goto_6
    or-int/2addr v6, v9

    .line 124
    :cond_b
    :goto_7
    and-int/lit16 v9, v6, 0x16db

    .line 125
    .line 126
    const/16 v10, 0x492

    .line 127
    .line 128
    if-ne v9, v10, :cond_e

    .line 129
    .line 130
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 131
    .line 132
    .line 133
    move-result v9

    .line 134
    if-nez v9, :cond_c

    .line 135
    .line 136
    goto :goto_9

    .line 137
    :cond_c
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 138
    .line 139
    .line 140
    move-object v15, v7

    .line 141
    :cond_d
    :goto_8
    move-object v3, v8

    .line 142
    goto/16 :goto_c

    .line 143
    .line 144
    :cond_e
    :goto_9
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 145
    .line 146
    .line 147
    and-int/lit8 v9, v5, 0x1

    .line 148
    .line 149
    const/4 v14, 0x6

    .line 150
    if-eqz v9, :cond_12

    .line 151
    .line 152
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 153
    .line 154
    .line 155
    move-result v9

    .line 156
    if-eqz v9, :cond_f

    .line 157
    .line 158
    goto :goto_a

    .line 159
    :cond_f
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 160
    .line 161
    .line 162
    and-int/lit8 v9, p6, 0x1

    .line 163
    .line 164
    if-eqz v9, :cond_10

    .line 165
    .line 166
    and-int/lit8 v6, v6, -0xf

    .line 167
    .line 168
    :cond_10
    and-int/lit8 v9, p6, 0x2

    .line 169
    .line 170
    if-eqz v9, :cond_11

    .line 171
    .line 172
    and-int/lit8 v6, v6, -0x71

    .line 173
    .line 174
    :cond_11
    and-int/lit8 v9, p6, 0x4

    .line 175
    .line 176
    if-eqz v9, :cond_15

    .line 177
    .line 178
    goto :goto_b

    .line 179
    :cond_12
    :goto_a
    and-int/lit8 v9, p6, 0x1

    .line 180
    .line 181
    if-eqz v9, :cond_13

    .line 182
    .line 183
    sget-object v2, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    .line 184
    .line 185
    invoke-virtual {v2, v1, v14}, Landroidx/compose/material3/MaterialTheme;->getColorScheme(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ColorScheme;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    and-int/lit8 v6, v6, -0xf

    .line 190
    .line 191
    :cond_13
    and-int/lit8 v9, p6, 0x2

    .line 192
    .line 193
    if-eqz v9, :cond_14

    .line 194
    .line 195
    sget-object v7, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    .line 196
    .line 197
    invoke-virtual {v7, v1, v14}, Landroidx/compose/material3/MaterialTheme;->getShapes(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Shapes;

    .line 198
    .line 199
    .line 200
    move-result-object v7

    .line 201
    and-int/lit8 v6, v6, -0x71

    .line 202
    .line 203
    :cond_14
    and-int/lit8 v9, p6, 0x4

    .line 204
    .line 205
    if-eqz v9, :cond_15

    .line 206
    .line 207
    sget-object v8, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    .line 208
    .line 209
    invoke-virtual {v8, v1, v14}, Landroidx/compose/material3/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Typography;

    .line 210
    .line 211
    .line 212
    move-result-object v8

    .line 213
    :goto_b
    and-int/lit16 v6, v6, -0x381

    .line 214
    .line 215
    :cond_15
    move v10, v6

    .line 216
    move-object v12, v7

    .line 217
    move-object v11, v8

    .line 218
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 219
    .line 220
    .line 221
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 222
    .line 223
    .line 224
    move-result v6

    .line 225
    if-eqz v6, :cond_16

    .line 226
    .line 227
    const/4 v6, -0x1

    .line 228
    const-string v7, "androidx.compose.material3.MaterialTheme (MaterialTheme.kt:57)"

    .line 229
    .line 230
    invoke-static {v0, v10, v6, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 231
    .line 232
    .line 233
    :cond_16
    const v0, -0x1d58f75c

    .line 234
    .line 235
    .line 236
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 237
    .line 238
    .line 239
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 244
    .line 245
    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v6

    .line 249
    if-ne v0, v6, :cond_17

    .line 250
    .line 251
    const-wide/16 v16, 0x0

    .line 252
    .line 253
    const-wide/16 v18, 0x0

    .line 254
    .line 255
    const-wide/16 v20, 0x0

    .line 256
    .line 257
    const-wide/16 v22, 0x0

    .line 258
    .line 259
    const-wide/16 v24, 0x0

    .line 260
    .line 261
    const-wide/16 v26, 0x0

    .line 262
    .line 263
    const-wide/16 v28, 0x0

    .line 264
    .line 265
    const-wide/16 v30, 0x0

    .line 266
    .line 267
    const-wide/16 v32, 0x0

    .line 268
    .line 269
    const-wide/16 v34, 0x0

    .line 270
    .line 271
    const-wide/16 v36, 0x0

    .line 272
    .line 273
    const-wide/16 v38, 0x0

    .line 274
    .line 275
    const-wide/16 v40, 0x0

    .line 276
    .line 277
    const-wide/16 v42, 0x0

    .line 278
    .line 279
    const-wide/16 v44, 0x0

    .line 280
    .line 281
    const-wide/16 v46, 0x0

    .line 282
    .line 283
    const-wide/16 v48, 0x0

    .line 284
    .line 285
    const-wide/16 v50, 0x0

    .line 286
    .line 287
    const-wide/16 v52, 0x0

    .line 288
    .line 289
    const-wide/16 v54, 0x0

    .line 290
    .line 291
    const-wide/16 v56, 0x0

    .line 292
    .line 293
    const-wide/16 v58, 0x0

    .line 294
    .line 295
    const-wide/16 v60, 0x0

    .line 296
    .line 297
    const-wide/16 v62, 0x0

    .line 298
    .line 299
    const-wide/16 v64, 0x0

    .line 300
    .line 301
    const-wide/16 v66, 0x0

    .line 302
    .line 303
    const-wide/16 v68, 0x0

    .line 304
    .line 305
    const-wide/16 v70, 0x0

    .line 306
    .line 307
    const-wide/16 v72, 0x0

    .line 308
    .line 309
    const v74, 0x1fffffff

    .line 310
    .line 311
    .line 312
    const/16 v75, 0x0

    .line 313
    .line 314
    move-object v15, v2

    .line 315
    invoke-static/range {v15 .. v75}, Landroidx/compose/material3/ColorScheme;->copy-G1PFc-w$default(Landroidx/compose/material3/ColorScheme;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJILjava/lang/Object;)Landroidx/compose/material3/ColorScheme;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    :cond_17
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 323
    .line 324
    .line 325
    check-cast v0, Landroidx/compose/material3/ColorScheme;

    .line 326
    .line 327
    invoke-static {v0, v2}, Landroidx/compose/material3/ColorSchemeKt;->updateColorSchemeFrom(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/ColorScheme;)V

    .line 328
    .line 329
    .line 330
    const/4 v6, 0x0

    .line 331
    const/4 v7, 0x0

    .line 332
    const-wide/16 v8, 0x0

    .line 333
    .line 334
    const/4 v15, 0x0

    .line 335
    const/16 v16, 0x7

    .line 336
    .line 337
    move/from16 v76, v10

    .line 338
    .line 339
    move-object v10, v1

    .line 340
    move-object/from16 v77, v11

    .line 341
    .line 342
    move v11, v15

    .line 343
    move-object v15, v12

    .line 344
    move/from16 v12, v16

    .line 345
    .line 346
    invoke-static/range {v6 .. v12}, Landroidx/compose/material/ripple/RippleKt;->rememberRipple-9IZ8Weo(ZFJLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/Indication;

    .line 347
    .line 348
    .line 349
    move-result-object v6

    .line 350
    const/4 v7, 0x0

    .line 351
    invoke-static {v0, v1, v7}, Landroidx/compose/material3/MaterialThemeKt;->rememberTextSelectionColors(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/selection/TextSelectionColors;

    .line 352
    .line 353
    .line 354
    move-result-object v8

    .line 355
    new-array v9, v14, [Landroidx/compose/runtime/ProvidedValue;

    .line 356
    .line 357
    invoke-static {}, Landroidx/compose/material3/ColorSchemeKt;->getLocalColorScheme()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 358
    .line 359
    .line 360
    move-result-object v10

    .line 361
    invoke-virtual {v10, v0}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    aput-object v0, v9, v7

    .line 366
    .line 367
    invoke-static {}, Landroidx/compose/foundation/IndicationKt;->getLocalIndication()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    invoke-virtual {v0, v6}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    const/4 v6, 0x1

    .line 376
    aput-object v0, v9, v6

    .line 377
    .line 378
    invoke-static {}, Landroidx/compose/material/ripple/RippleThemeKt;->getLocalRippleTheme()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    sget-object v7, Landroidx/compose/material3/MaterialRippleTheme;->INSTANCE:Landroidx/compose/material3/MaterialRippleTheme;

    .line 383
    .line 384
    invoke-virtual {v0, v7}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    aput-object v0, v9, v13

    .line 389
    .line 390
    invoke-static {}, Landroidx/compose/material3/ShapesKt;->getLocalShapes()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    invoke-virtual {v0, v15}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    const/4 v7, 0x3

    .line 399
    aput-object v0, v9, v7

    .line 400
    .line 401
    invoke-static {}, Landroidx/compose/foundation/text/selection/TextSelectionColorsKt;->getLocalTextSelectionColors()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    invoke-virtual {v0, v8}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    aput-object v0, v9, v3

    .line 410
    .line 411
    invoke-static {}, Landroidx/compose/material3/TypographyKt;->getLocalTypography()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    move-object/from16 v8, v77

    .line 416
    .line 417
    invoke-virtual {v0, v8}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    const/4 v3, 0x5

    .line 422
    aput-object v0, v9, v3

    .line 423
    .line 424
    new-instance v0, Landroidx/compose/material3/MaterialThemeKt$MaterialTheme$1;

    .line 425
    .line 426
    move/from16 v3, v76

    .line 427
    .line 428
    invoke-direct {v0, v8, v4, v3}, Landroidx/compose/material3/MaterialThemeKt$MaterialTheme$1;-><init>(Landroidx/compose/material3/Typography;Lkotlin/jvm/functions/Function2;I)V

    .line 429
    .line 430
    .line 431
    const v3, -0x3f9276be

    .line 432
    .line 433
    .line 434
    invoke-static {v1, v3, v6, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    const/16 v3, 0x38

    .line 439
    .line 440
    invoke-static {v9, v0, v1, v3}, Landroidx/compose/runtime/CompositionLocalKt;->CompositionLocalProvider([Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 441
    .line 442
    .line 443
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 444
    .line 445
    .line 446
    move-result v0

    .line 447
    if-eqz v0, :cond_d

    .line 448
    .line 449
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 450
    .line 451
    .line 452
    goto/16 :goto_8

    .line 453
    .line 454
    :goto_c
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 455
    .line 456
    .line 457
    move-result-object v7

    .line 458
    if-nez v7, :cond_18

    .line 459
    .line 460
    goto :goto_d

    .line 461
    :cond_18
    new-instance v8, Landroidx/compose/material3/MaterialThemeKt$MaterialTheme$2;

    .line 462
    .line 463
    move-object v0, v8

    .line 464
    move-object v1, v2

    .line 465
    move-object v2, v15

    .line 466
    move-object/from16 v4, p3

    .line 467
    .line 468
    move/from16 v5, p5

    .line 469
    .line 470
    move/from16 v6, p6

    .line 471
    .line 472
    invoke-direct/range {v0 .. v6}, Landroidx/compose/material3/MaterialThemeKt$MaterialTheme$2;-><init>(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/Shapes;Landroidx/compose/material3/Typography;Lkotlin/jvm/functions/Function2;II)V

    .line 473
    .line 474
    .line 475
    invoke-interface {v7, v8}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 476
    .line 477
    .line 478
    :goto_d
    return-void
.end method

.method public static final synthetic access$getDefaultRippleAlpha$p()Landroidx/compose/material/ripple/RippleAlpha;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/material3/MaterialThemeKt;->DefaultRippleAlpha:Landroidx/compose/material/ripple/RippleAlpha;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final rememberTextSelectionColors(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/selection/TextSelectionColors;
    .locals 11
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .line 1
    const-string v0, "colorScheme"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const v0, 0x6f3fd9d8

    .line 7
    .line 8
    .line 9
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 10
    .line 11
    .line 12
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    const/4 v1, -0x1

    .line 19
    const-string v2, "androidx.compose.material3.rememberTextSelectionColors (MaterialTheme.kt:132)"

    .line 20
    .line 21
    invoke-static {v0, p2, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/material3/ColorScheme;->getPrimary-0d7_KjU()J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const p2, 0x44faf204

    .line 33
    .line 34
    .line 35
    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 36
    .line 37
    .line 38
    invoke-interface {p1, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    if-nez p0, :cond_1

    .line 47
    .line 48
    sget-object p0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 49
    .line 50
    invoke-virtual {p0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    if-ne p2, p0, :cond_2

    .line 55
    .line 56
    :cond_1
    new-instance p2, Landroidx/compose/foundation/text/selection/TextSelectionColors;

    .line 57
    .line 58
    const v5, 0x3ecccccd    # 0.4f

    .line 59
    .line 60
    .line 61
    const/4 v6, 0x0

    .line 62
    const/4 v7, 0x0

    .line 63
    const/4 v8, 0x0

    .line 64
    const/16 v9, 0xe

    .line 65
    .line 66
    const/4 v10, 0x0

    .line 67
    move-wide v3, v0

    .line 68
    invoke-static/range {v3 .. v10}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    .line 69
    .line 70
    .line 71
    move-result-wide v6

    .line 72
    const/4 v8, 0x0

    .line 73
    move-object v3, p2

    .line 74
    move-wide v4, v0

    .line 75
    invoke-direct/range {v3 .. v8}, Landroidx/compose/foundation/text/selection/TextSelectionColors;-><init>(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 76
    .line 77
    .line 78
    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    :cond_2
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 82
    .line 83
    .line 84
    check-cast p2, Landroidx/compose/foundation/text/selection/TextSelectionColors;

    .line 85
    .line 86
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    if-eqz p0, :cond_3

    .line 91
    .line 92
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 93
    .line 94
    .line 95
    :cond_3
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 96
    .line 97
    .line 98
    return-object p2
.end method
