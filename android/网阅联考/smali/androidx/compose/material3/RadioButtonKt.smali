.class public final Landroidx/compose/material3/RadioButtonKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001aM\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0013H\u0007\u00a2\u0006\u0002\u0010\u0014\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0013\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\u0005\u001a\u00020\u0003X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\u0006\u001a\u00020\u0003X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0015"
    }
    d2 = {
        "RadioAnimationDuration",
        "",
        "RadioButtonDotSize",
        "Landroidx/compose/ui/unit/Dp;",
        "F",
        "RadioButtonPadding",
        "RadioStrokeWidth",
        "RadioButton",
        "",
        "selected",
        "",
        "onClick",
        "Lkotlin/Function0;",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "enabled",
        "colors",
        "Landroidx/compose/material3/RadioButtonColors;",
        "interactionSource",
        "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/RadioButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V",
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
.field private static final RadioAnimationDuration:I = 0x64

.field private static final RadioButtonDotSize:F

.field private static final RadioButtonPadding:F

.field private static final RadioStrokeWidth:F


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    int-to-float v0, v0

    .line 3
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    sput v1, Landroidx/compose/material3/RadioButtonKt;->RadioButtonPadding:F

    .line 8
    .line 9
    const/16 v1, 0xc

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
    sput v1, Landroidx/compose/material3/RadioButtonKt;->RadioButtonDotSize:F

    .line 17
    .line 18
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    sput v0, Landroidx/compose/material3/RadioButtonKt;->RadioStrokeWidth:F

    .line 23
    .line 24
    return-void
.end method

.method public static final RadioButton(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/RadioButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V
    .locals 24
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Landroidx/compose/material3/RadioButtonColors;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move/from16 v7, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    move/from16 v9, p7

    .line 6
    .line 7
    const v0, 0x185a72e8

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p6

    .line 11
    .line 12
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v6

    .line 16
    and-int/lit8 v1, p8, 0x1

    .line 17
    .line 18
    const/4 v5, 0x2

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    or-int/lit8 v1, v9, 0x6

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    and-int/lit8 v1, v9, 0xe

    .line 25
    .line 26
    if-nez v1, :cond_2

    .line 27
    .line 28
    invoke-interface {v6, v7}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    const/4 v1, 0x4

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move v1, v5

    .line 37
    :goto_0
    or-int/2addr v1, v9

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    move v1, v9

    .line 40
    :goto_1
    and-int/lit8 v2, p8, 0x2

    .line 41
    .line 42
    if-eqz v2, :cond_3

    .line 43
    .line 44
    or-int/lit8 v1, v1, 0x30

    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_3
    and-int/lit8 v2, v9, 0x70

    .line 48
    .line 49
    if-nez v2, :cond_5

    .line 50
    .line 51
    invoke-interface {v6, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_4

    .line 56
    .line 57
    const/16 v2, 0x20

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_4
    const/16 v2, 0x10

    .line 61
    .line 62
    :goto_2
    or-int/2addr v1, v2

    .line 63
    :cond_5
    :goto_3
    and-int/lit8 v2, p8, 0x4

    .line 64
    .line 65
    if-eqz v2, :cond_6

    .line 66
    .line 67
    or-int/lit16 v1, v1, 0x180

    .line 68
    .line 69
    goto :goto_5

    .line 70
    :cond_6
    and-int/lit16 v3, v9, 0x380

    .line 71
    .line 72
    if-nez v3, :cond_8

    .line 73
    .line 74
    move-object/from16 v3, p2

    .line 75
    .line 76
    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-eqz v4, :cond_7

    .line 81
    .line 82
    const/16 v4, 0x100

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_7
    const/16 v4, 0x80

    .line 86
    .line 87
    :goto_4
    or-int/2addr v1, v4

    .line 88
    goto :goto_6

    .line 89
    :cond_8
    :goto_5
    move-object/from16 v3, p2

    .line 90
    .line 91
    :goto_6
    and-int/lit8 v4, p8, 0x8

    .line 92
    .line 93
    if-eqz v4, :cond_9

    .line 94
    .line 95
    or-int/lit16 v1, v1, 0xc00

    .line 96
    .line 97
    goto :goto_8

    .line 98
    :cond_9
    and-int/lit16 v10, v9, 0x1c00

    .line 99
    .line 100
    if-nez v10, :cond_b

    .line 101
    .line 102
    move/from16 v10, p3

    .line 103
    .line 104
    invoke-interface {v6, v10}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 105
    .line 106
    .line 107
    move-result v11

    .line 108
    if-eqz v11, :cond_a

    .line 109
    .line 110
    const/16 v11, 0x800

    .line 111
    .line 112
    goto :goto_7

    .line 113
    :cond_a
    const/16 v11, 0x400

    .line 114
    .line 115
    :goto_7
    or-int/2addr v1, v11

    .line 116
    goto :goto_9

    .line 117
    :cond_b
    :goto_8
    move/from16 v10, p3

    .line 118
    .line 119
    :goto_9
    const v11, 0xe000

    .line 120
    .line 121
    .line 122
    and-int/2addr v11, v9

    .line 123
    if-nez v11, :cond_e

    .line 124
    .line 125
    and-int/lit8 v11, p8, 0x10

    .line 126
    .line 127
    if-nez v11, :cond_c

    .line 128
    .line 129
    move-object/from16 v11, p4

    .line 130
    .line 131
    invoke-interface {v6, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v12

    .line 135
    if-eqz v12, :cond_d

    .line 136
    .line 137
    const/16 v12, 0x4000

    .line 138
    .line 139
    goto :goto_a

    .line 140
    :cond_c
    move-object/from16 v11, p4

    .line 141
    .line 142
    :cond_d
    const/16 v12, 0x2000

    .line 143
    .line 144
    :goto_a
    or-int/2addr v1, v12

    .line 145
    goto :goto_b

    .line 146
    :cond_e
    move-object/from16 v11, p4

    .line 147
    .line 148
    :goto_b
    and-int/lit8 v22, p8, 0x20

    .line 149
    .line 150
    if-eqz v22, :cond_f

    .line 151
    .line 152
    const/high16 v12, 0x30000

    .line 153
    .line 154
    or-int/2addr v1, v12

    .line 155
    move-object/from16 v15, p5

    .line 156
    .line 157
    goto :goto_d

    .line 158
    :cond_f
    const/high16 v12, 0x70000

    .line 159
    .line 160
    and-int/2addr v12, v9

    .line 161
    move-object/from16 v15, p5

    .line 162
    .line 163
    if-nez v12, :cond_11

    .line 164
    .line 165
    invoke-interface {v6, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v12

    .line 169
    if-eqz v12, :cond_10

    .line 170
    .line 171
    const/high16 v12, 0x20000

    .line 172
    .line 173
    goto :goto_c

    .line 174
    :cond_10
    const/high16 v12, 0x10000

    .line 175
    .line 176
    :goto_c
    or-int/2addr v1, v12

    .line 177
    :cond_11
    :goto_d
    const v12, 0x5b6db

    .line 178
    .line 179
    .line 180
    and-int/2addr v12, v1

    .line 181
    const v13, 0x12492

    .line 182
    .line 183
    .line 184
    if-ne v12, v13, :cond_13

    .line 185
    .line 186
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 187
    .line 188
    .line 189
    move-result v12

    .line 190
    if-nez v12, :cond_12

    .line 191
    .line 192
    goto :goto_e

    .line 193
    :cond_12
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 194
    .line 195
    .line 196
    move-object v2, v6

    .line 197
    move v4, v10

    .line 198
    move-object v5, v11

    .line 199
    move-object v6, v15

    .line 200
    goto/16 :goto_17

    .line 201
    .line 202
    :cond_13
    :goto_e
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 203
    .line 204
    .line 205
    and-int/lit8 v12, v9, 0x1

    .line 206
    .line 207
    const v23, -0xe001

    .line 208
    .line 209
    .line 210
    if-eqz v12, :cond_16

    .line 211
    .line 212
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 213
    .line 214
    .line 215
    move-result v12

    .line 216
    if-eqz v12, :cond_14

    .line 217
    .line 218
    goto :goto_f

    .line 219
    :cond_14
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 220
    .line 221
    .line 222
    and-int/lit8 v2, p8, 0x10

    .line 223
    .line 224
    if-eqz v2, :cond_15

    .line 225
    .line 226
    and-int v1, v1, v23

    .line 227
    .line 228
    :cond_15
    move v14, v10

    .line 229
    move-object v12, v11

    .line 230
    move-object/from16 v17, v15

    .line 231
    .line 232
    move v10, v1

    .line 233
    move-object v15, v3

    .line 234
    goto :goto_13

    .line 235
    :cond_16
    :goto_f
    if-eqz v2, :cond_17

    .line 236
    .line 237
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 238
    .line 239
    goto :goto_10

    .line 240
    :cond_17
    move-object v2, v3

    .line 241
    :goto_10
    if-eqz v4, :cond_18

    .line 242
    .line 243
    const/4 v3, 0x1

    .line 244
    goto :goto_11

    .line 245
    :cond_18
    move v3, v10

    .line 246
    :goto_11
    and-int/lit8 v4, p8, 0x10

    .line 247
    .line 248
    if-eqz v4, :cond_19

    .line 249
    .line 250
    sget-object v10, Landroidx/compose/material3/RadioButtonDefaults;->INSTANCE:Landroidx/compose/material3/RadioButtonDefaults;

    .line 251
    .line 252
    const-wide/16 v11, 0x0

    .line 253
    .line 254
    const-wide/16 v13, 0x0

    .line 255
    .line 256
    const-wide/16 v16, 0x0

    .line 257
    .line 258
    const-wide/16 v18, 0x0

    .line 259
    .line 260
    const/16 v20, 0x6000

    .line 261
    .line 262
    const/16 v21, 0xf

    .line 263
    .line 264
    move-wide/from16 v15, v16

    .line 265
    .line 266
    move-wide/from16 v17, v18

    .line 267
    .line 268
    move-object/from16 v19, v6

    .line 269
    .line 270
    invoke-virtual/range {v10 .. v21}, Landroidx/compose/material3/RadioButtonDefaults;->colors-ro_MJ88(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/RadioButtonColors;

    .line 271
    .line 272
    .line 273
    move-result-object v4

    .line 274
    and-int v1, v1, v23

    .line 275
    .line 276
    move-object v11, v4

    .line 277
    :cond_19
    if-eqz v22, :cond_1b

    .line 278
    .line 279
    const v4, -0x1d58f75c

    .line 280
    .line 281
    .line 282
    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 283
    .line 284
    .line 285
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v4

    .line 289
    sget-object v10, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 290
    .line 291
    invoke-virtual {v10}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v10

    .line 295
    if-ne v4, v10, :cond_1a

    .line 296
    .line 297
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 298
    .line 299
    .line 300
    move-result-object v4

    .line 301
    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    :cond_1a
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 305
    .line 306
    .line 307
    check-cast v4, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 308
    .line 309
    move v10, v1

    .line 310
    move-object v15, v2

    .line 311
    move v14, v3

    .line 312
    move-object/from16 v17, v4

    .line 313
    .line 314
    goto :goto_12

    .line 315
    :cond_1b
    move-object/from16 v17, p5

    .line 316
    .line 317
    move v10, v1

    .line 318
    move-object v15, v2

    .line 319
    move v14, v3

    .line 320
    :goto_12
    move-object v12, v11

    .line 321
    :goto_13
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 322
    .line 323
    .line 324
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 325
    .line 326
    .line 327
    move-result v1

    .line 328
    if-eqz v1, :cond_1c

    .line 329
    .line 330
    const/4 v1, -0x1

    .line 331
    const-string v2, "androidx.compose.material3.RadioButton (RadioButton.kt:72)"

    .line 332
    .line 333
    invoke-static {v0, v10, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 334
    .line 335
    .line 336
    :cond_1c
    const/4 v0, 0x0

    .line 337
    if-eqz v7, :cond_1d

    .line 338
    .line 339
    sget v1, Landroidx/compose/material3/RadioButtonKt;->RadioButtonDotSize:F

    .line 340
    .line 341
    int-to-float v2, v5

    .line 342
    div-float/2addr v1, v2

    .line 343
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 344
    .line 345
    .line 346
    move-result v1

    .line 347
    goto :goto_14

    .line 348
    :cond_1d
    int-to-float v1, v0

    .line 349
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 350
    .line 351
    .line 352
    move-result v1

    .line 353
    :goto_14
    const/16 v2, 0x64

    .line 354
    .line 355
    const/4 v13, 0x0

    .line 356
    const/4 v11, 0x6

    .line 357
    invoke-static {v2, v0, v13, v11, v13}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    .line 358
    .line 359
    .line 360
    move-result-object v2

    .line 361
    const/4 v3, 0x0

    .line 362
    const/16 v16, 0x30

    .line 363
    .line 364
    const/16 v18, 0x4

    .line 365
    .line 366
    move-object v4, v6

    .line 367
    move-object/from16 p2, v15

    .line 368
    .line 369
    move v15, v5

    .line 370
    move/from16 v5, v16

    .line 371
    .line 372
    move-object v13, v6

    .line 373
    move/from16 v6, v18

    .line 374
    .line 375
    invoke-static/range {v1 .. v6}, Landroidx/compose/animation/core/AnimateAsStateKt;->animateDpAsState-Kz89ssw(FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    .line 376
    .line 377
    .line 378
    move-result-object v6

    .line 379
    shr-int/lit8 v1, v10, 0x9

    .line 380
    .line 381
    and-int/lit8 v1, v1, 0xe

    .line 382
    .line 383
    shl-int/lit8 v2, v10, 0x3

    .line 384
    .line 385
    and-int/lit8 v2, v2, 0x70

    .line 386
    .line 387
    or-int/2addr v1, v2

    .line 388
    shr-int/lit8 v2, v10, 0x6

    .line 389
    .line 390
    and-int/lit16 v2, v2, 0x380

    .line 391
    .line 392
    or-int/2addr v1, v2

    .line 393
    invoke-virtual {v12, v14, v7, v13, v1}, Landroidx/compose/material3/RadioButtonColors;->radioColor$material3_release(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 394
    .line 395
    .line 396
    move-result-object v5

    .line 397
    const v1, 0x2bd78c27

    .line 398
    .line 399
    .line 400
    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 401
    .line 402
    .line 403
    if-eqz v8, :cond_1e

    .line 404
    .line 405
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 406
    .line 407
    sget-object v2, Landroidx/compose/ui/semantics/Role;->Companion:Landroidx/compose/ui/semantics/Role$Companion;

    .line 408
    .line 409
    invoke-virtual {v2}, Landroidx/compose/ui/semantics/Role$Companion;->getRadioButton-o7Vup1c()I

    .line 410
    .line 411
    .line 412
    move-result v2

    .line 413
    const/4 v10, 0x0

    .line 414
    sget-object v3, Landroidx/compose/material3/tokens/RadioButtonTokens;->INSTANCE:Landroidx/compose/material3/tokens/RadioButtonTokens;

    .line 415
    .line 416
    invoke-virtual {v3}, Landroidx/compose/material3/tokens/RadioButtonTokens;->getStateLayerSize-D9Ej5fM()F

    .line 417
    .line 418
    .line 419
    move-result v3

    .line 420
    int-to-float v4, v15

    .line 421
    div-float/2addr v3, v4

    .line 422
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 423
    .line 424
    .line 425
    move-result v11

    .line 426
    const-wide/16 v3, 0x0

    .line 427
    .line 428
    const/16 v16, 0x36

    .line 429
    .line 430
    const/16 v18, 0x4

    .line 431
    .line 432
    move-object/from16 v19, v12

    .line 433
    .line 434
    move-object/from16 p4, v13

    .line 435
    .line 436
    move-wide v12, v3

    .line 437
    move/from16 v20, v14

    .line 438
    .line 439
    move-object/from16 v14, p4

    .line 440
    .line 441
    move-object/from16 v4, p2

    .line 442
    .line 443
    move v3, v15

    .line 444
    move/from16 v15, v16

    .line 445
    .line 446
    move/from16 v16, v18

    .line 447
    .line 448
    invoke-static/range {v10 .. v16}, Landroidx/compose/material/ripple/RippleKt;->rememberRipple-9IZ8Weo(ZFJLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/Indication;

    .line 449
    .line 450
    .line 451
    move-result-object v10

    .line 452
    invoke-static {v2}, Landroidx/compose/ui/semantics/Role;->box-impl(I)Landroidx/compose/ui/semantics/Role;

    .line 453
    .line 454
    .line 455
    move-result-object v11

    .line 456
    move v12, v0

    .line 457
    move-object v0, v1

    .line 458
    move/from16 v1, p0

    .line 459
    .line 460
    move-object/from16 v2, v17

    .line 461
    .line 462
    move v13, v3

    .line 463
    move-object v3, v10

    .line 464
    move-object v10, v4

    .line 465
    move/from16 v4, v20

    .line 466
    .line 467
    move-object v14, v5

    .line 468
    move-object v5, v11

    .line 469
    move-object v11, v6

    .line 470
    move-object/from16 v6, p1

    .line 471
    .line 472
    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/selection/SelectableKt;->selectable-O2vRcR0(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    goto :goto_15

    .line 477
    :cond_1e
    move-object/from16 v10, p2

    .line 478
    .line 479
    move-object v11, v6

    .line 480
    move-object/from16 v19, v12

    .line 481
    .line 482
    move-object/from16 p4, v13

    .line 483
    .line 484
    move/from16 v20, v14

    .line 485
    .line 486
    move v13, v15

    .line 487
    move v12, v0

    .line 488
    move-object v14, v5

    .line 489
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 490
    .line 491
    :goto_15
    invoke-interface/range {p4 .. p4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 492
    .line 493
    .line 494
    if-eqz v8, :cond_1f

    .line 495
    .line 496
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 497
    .line 498
    invoke-static {v1}, Landroidx/compose/material3/TouchTargetKt;->minimumTouchTargetSize(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 499
    .line 500
    .line 501
    move-result-object v1

    .line 502
    goto :goto_16

    .line 503
    :cond_1f
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 504
    .line 505
    :goto_16
    invoke-interface {v10, v1}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 506
    .line 507
    .line 508
    move-result-object v1

    .line 509
    invoke-interface {v1, v0}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    sget-object v1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 514
    .line 515
    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 516
    .line 517
    .line 518
    move-result-object v1

    .line 519
    const/4 v2, 0x0

    .line 520
    invoke-static {v0, v1, v12, v13, v2}, Landroidx/compose/foundation/layout/SizeKt;->wrapContentSize$default(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    sget v1, Landroidx/compose/material3/RadioButtonKt;->RadioButtonPadding:F

    .line 525
    .line 526
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/PaddingKt;->padding-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 527
    .line 528
    .line 529
    move-result-object v0

    .line 530
    sget-object v1, Landroidx/compose/material3/tokens/RadioButtonTokens;->INSTANCE:Landroidx/compose/material3/tokens/RadioButtonTokens;

    .line 531
    .line 532
    invoke-virtual {v1}, Landroidx/compose/material3/tokens/RadioButtonTokens;->getIconSize-D9Ej5fM()F

    .line 533
    .line 534
    .line 535
    move-result v1

    .line 536
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/SizeKt;->requiredSize-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    const v1, 0x1e7b2b64

    .line 541
    .line 542
    .line 543
    move-object/from16 v2, p4

    .line 544
    .line 545
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 546
    .line 547
    .line 548
    invoke-interface {v2, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 549
    .line 550
    .line 551
    move-result v1

    .line 552
    invoke-interface {v2, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 553
    .line 554
    .line 555
    move-result v3

    .line 556
    or-int/2addr v1, v3

    .line 557
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v3

    .line 561
    if-nez v1, :cond_20

    .line 562
    .line 563
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 564
    .line 565
    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    move-result-object v1

    .line 569
    if-ne v3, v1, :cond_21

    .line 570
    .line 571
    :cond_20
    new-instance v3, Landroidx/compose/material3/RadioButtonKt$RadioButton$2$1;

    .line 572
    .line 573
    invoke-direct {v3, v14, v11}, Landroidx/compose/material3/RadioButtonKt$RadioButton$2$1;-><init>(Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V

    .line 574
    .line 575
    .line 576
    invoke-interface {v2, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 577
    .line 578
    .line 579
    :cond_21
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 580
    .line 581
    .line 582
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 583
    .line 584
    invoke-static {v0, v3, v2, v12}, Landroidx/compose/foundation/CanvasKt;->Canvas(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 585
    .line 586
    .line 587
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 588
    .line 589
    .line 590
    move-result v0

    .line 591
    if-eqz v0, :cond_22

    .line 592
    .line 593
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 594
    .line 595
    .line 596
    :cond_22
    move-object v3, v10

    .line 597
    move-object/from16 v6, v17

    .line 598
    .line 599
    move-object/from16 v5, v19

    .line 600
    .line 601
    move/from16 v4, v20

    .line 602
    .line 603
    :goto_17
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 604
    .line 605
    .line 606
    move-result-object v10

    .line 607
    if-nez v10, :cond_23

    .line 608
    .line 609
    goto :goto_18

    .line 610
    :cond_23
    new-instance v11, Landroidx/compose/material3/RadioButtonKt$RadioButton$3;

    .line 611
    .line 612
    move-object v0, v11

    .line 613
    move/from16 v1, p0

    .line 614
    .line 615
    move-object/from16 v2, p1

    .line 616
    .line 617
    move/from16 v7, p7

    .line 618
    .line 619
    move/from16 v8, p8

    .line 620
    .line 621
    invoke-direct/range {v0 .. v8}, Landroidx/compose/material3/RadioButtonKt$RadioButton$3;-><init>(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/RadioButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;II)V

    .line 622
    .line 623
    .line 624
    invoke-interface {v10, v11}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 625
    .line 626
    .line 627
    :goto_18
    return-void
.end method

.method public static final synthetic access$getRadioStrokeWidth$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/RadioButtonKt;->RadioStrokeWidth:F

    .line 2
    .line 3
    return v0
.end method
