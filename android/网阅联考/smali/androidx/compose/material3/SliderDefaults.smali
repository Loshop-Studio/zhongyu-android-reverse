.class public final Landroidx/compose/material3/SliderDefaults;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002JE\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000eH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J3\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000cH\u0007\u00a2\u0006\u0002\u0010\u0014Jy\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u001f\u001a\u00020\u0016H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008 \u0010!\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\""
    }
    d2 = {
        "Landroidx/compose/material3/SliderDefaults;",
        "",
        "()V",
        "Thumb",
        "",
        "interactionSource",
        "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "colors",
        "Landroidx/compose/material3/SliderColors;",
        "enabled",
        "",
        "thumbSize",
        "Landroidx/compose/ui/unit/DpSize;",
        "Thumb-9LiSoMs",
        "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZJLandroidx/compose/runtime/Composer;II)V",
        "Track",
        "sliderPositions",
        "Landroidx/compose/material3/SliderPositions;",
        "(Landroidx/compose/material3/SliderPositions;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V",
        "thumbColor",
        "Landroidx/compose/ui/graphics/Color;",
        "activeTrackColor",
        "activeTickColor",
        "inactiveTrackColor",
        "inactiveTickColor",
        "disabledThumbColor",
        "disabledActiveTrackColor",
        "disabledActiveTickColor",
        "disabledInactiveTrackColor",
        "disabledInactiveTickColor",
        "colors-q0g_0yA",
        "(JJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SliderColors;",
        "material3_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Landroidx/compose/material3/SliderDefaults;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/material3/SliderDefaults;

    invoke-direct {v0}, Landroidx/compose/material3/SliderDefaults;-><init>()V

    sput-object v0, Landroidx/compose/material3/SliderDefaults;->INSTANCE:Landroidx/compose/material3/SliderDefaults;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final Thumb-9LiSoMs(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZJLandroidx/compose/runtime/Composer;II)V
    .locals 37
    .annotation runtime Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move/from16 v8, p8

    .line 4
    .line 5
    const-string v0, "interactionSource"

    .line 6
    .line 7
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const v0, -0x114d4821

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p7

    .line 14
    .line 15
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    and-int/lit8 v3, p9, 0x1

    .line 20
    .line 21
    const/4 v4, 0x2

    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    or-int/lit8 v3, v8, 0x6

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    and-int/lit8 v3, v8, 0xe

    .line 28
    .line 29
    if-nez v3, :cond_2

    .line 30
    .line 31
    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    const/4 v3, 0x4

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move v3, v4

    .line 40
    :goto_0
    or-int/2addr v3, v8

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    move v3, v8

    .line 43
    :goto_1
    and-int/lit8 v5, p9, 0x2

    .line 44
    .line 45
    if-eqz v5, :cond_3

    .line 46
    .line 47
    or-int/lit8 v3, v3, 0x30

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_3
    and-int/lit8 v6, v8, 0x70

    .line 51
    .line 52
    if-nez v6, :cond_5

    .line 53
    .line 54
    move-object/from16 v6, p2

    .line 55
    .line 56
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    if-eqz v7, :cond_4

    .line 61
    .line 62
    const/16 v7, 0x20

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_4
    const/16 v7, 0x10

    .line 66
    .line 67
    :goto_2
    or-int/2addr v3, v7

    .line 68
    goto :goto_4

    .line 69
    :cond_5
    :goto_3
    move-object/from16 v6, p2

    .line 70
    .line 71
    :goto_4
    and-int/lit16 v7, v8, 0x380

    .line 72
    .line 73
    if-nez v7, :cond_8

    .line 74
    .line 75
    and-int/lit8 v7, p9, 0x4

    .line 76
    .line 77
    if-nez v7, :cond_6

    .line 78
    .line 79
    move-object/from16 v7, p3

    .line 80
    .line 81
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v9

    .line 85
    if-eqz v9, :cond_7

    .line 86
    .line 87
    const/16 v9, 0x100

    .line 88
    .line 89
    goto :goto_5

    .line 90
    :cond_6
    move-object/from16 v7, p3

    .line 91
    .line 92
    :cond_7
    const/16 v9, 0x80

    .line 93
    .line 94
    :goto_5
    or-int/2addr v3, v9

    .line 95
    goto :goto_6

    .line 96
    :cond_8
    move-object/from16 v7, p3

    .line 97
    .line 98
    :goto_6
    and-int/lit8 v34, p9, 0x8

    .line 99
    .line 100
    if-eqz v34, :cond_9

    .line 101
    .line 102
    or-int/lit16 v3, v3, 0xc00

    .line 103
    .line 104
    goto :goto_8

    .line 105
    :cond_9
    and-int/lit16 v9, v8, 0x1c00

    .line 106
    .line 107
    if-nez v9, :cond_b

    .line 108
    .line 109
    move/from16 v9, p4

    .line 110
    .line 111
    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 112
    .line 113
    .line 114
    move-result v10

    .line 115
    if-eqz v10, :cond_a

    .line 116
    .line 117
    const/16 v10, 0x800

    .line 118
    .line 119
    goto :goto_7

    .line 120
    :cond_a
    const/16 v10, 0x400

    .line 121
    .line 122
    :goto_7
    or-int/2addr v3, v10

    .line 123
    goto :goto_9

    .line 124
    :cond_b
    :goto_8
    move/from16 v9, p4

    .line 125
    .line 126
    :goto_9
    and-int/lit8 v35, p9, 0x10

    .line 127
    .line 128
    if-eqz v35, :cond_c

    .line 129
    .line 130
    or-int/lit16 v3, v3, 0x6000

    .line 131
    .line 132
    move-wide/from16 v14, p5

    .line 133
    .line 134
    goto :goto_b

    .line 135
    :cond_c
    const v10, 0xe000

    .line 136
    .line 137
    .line 138
    and-int/2addr v10, v8

    .line 139
    move-wide/from16 v14, p5

    .line 140
    .line 141
    if-nez v10, :cond_e

    .line 142
    .line 143
    invoke-interface {v1, v14, v15}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 144
    .line 145
    .line 146
    move-result v10

    .line 147
    if-eqz v10, :cond_d

    .line 148
    .line 149
    const/16 v10, 0x4000

    .line 150
    .line 151
    goto :goto_a

    .line 152
    :cond_d
    const/16 v10, 0x2000

    .line 153
    .line 154
    :goto_a
    or-int/2addr v3, v10

    .line 155
    :cond_e
    :goto_b
    and-int/lit8 v10, p9, 0x20

    .line 156
    .line 157
    if-eqz v10, :cond_f

    .line 158
    .line 159
    const/high16 v10, 0x30000

    .line 160
    .line 161
    or-int/2addr v3, v10

    .line 162
    move-object/from16 v12, p0

    .line 163
    .line 164
    goto :goto_d

    .line 165
    :cond_f
    const/high16 v10, 0x70000

    .line 166
    .line 167
    and-int/2addr v10, v8

    .line 168
    move-object/from16 v12, p0

    .line 169
    .line 170
    if-nez v10, :cond_11

    .line 171
    .line 172
    invoke-interface {v1, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v10

    .line 176
    if-eqz v10, :cond_10

    .line 177
    .line 178
    const/high16 v10, 0x20000

    .line 179
    .line 180
    goto :goto_c

    .line 181
    :cond_10
    const/high16 v10, 0x10000

    .line 182
    .line 183
    :goto_c
    or-int/2addr v3, v10

    .line 184
    :cond_11
    :goto_d
    const v10, 0x5b6db

    .line 185
    .line 186
    .line 187
    and-int/2addr v10, v3

    .line 188
    const v11, 0x12492

    .line 189
    .line 190
    .line 191
    if-ne v10, v11, :cond_13

    .line 192
    .line 193
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 194
    .line 195
    .line 196
    move-result v10

    .line 197
    if-nez v10, :cond_12

    .line 198
    .line 199
    goto :goto_e

    .line 200
    :cond_12
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 201
    .line 202
    .line 203
    move-object v3, v6

    .line 204
    move-object v4, v7

    .line 205
    move v5, v9

    .line 206
    move-wide v6, v14

    .line 207
    goto/16 :goto_14

    .line 208
    .line 209
    :cond_13
    :goto_e
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 210
    .line 211
    .line 212
    and-int/lit8 v10, v8, 0x1

    .line 213
    .line 214
    const/16 v36, 0x1

    .line 215
    .line 216
    if-eqz v10, :cond_16

    .line 217
    .line 218
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 219
    .line 220
    .line 221
    move-result v10

    .line 222
    if-eqz v10, :cond_14

    .line 223
    .line 224
    goto :goto_f

    .line 225
    :cond_14
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 226
    .line 227
    .line 228
    and-int/lit8 v5, p9, 0x4

    .line 229
    .line 230
    if-eqz v5, :cond_15

    .line 231
    .line 232
    and-int/lit16 v3, v3, -0x381

    .line 233
    .line 234
    :cond_15
    move v5, v9

    .line 235
    goto :goto_11

    .line 236
    :cond_16
    :goto_f
    if-eqz v5, :cond_17

    .line 237
    .line 238
    sget-object v5, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 239
    .line 240
    move-object v6, v5

    .line 241
    :cond_17
    and-int/lit8 v5, p9, 0x4

    .line 242
    .line 243
    if-eqz v5, :cond_18

    .line 244
    .line 245
    const-wide/16 v10, 0x0

    .line 246
    .line 247
    const-wide/16 v16, 0x0

    .line 248
    .line 249
    move-wide/from16 v12, v16

    .line 250
    .line 251
    move-wide/from16 v14, v16

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
    const/16 v31, 0x0

    .line 266
    .line 267
    shr-int/lit8 v5, v3, 0xf

    .line 268
    .line 269
    and-int/lit8 v32, v5, 0xe

    .line 270
    .line 271
    const/16 v33, 0x3ff

    .line 272
    .line 273
    move-object/from16 v9, p0

    .line 274
    .line 275
    move-object/from16 v30, v1

    .line 276
    .line 277
    invoke-virtual/range {v9 .. v33}, Landroidx/compose/material3/SliderDefaults;->colors-q0g_0yA(JJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SliderColors;

    .line 278
    .line 279
    .line 280
    move-result-object v5

    .line 281
    and-int/lit16 v3, v3, -0x381

    .line 282
    .line 283
    move-object v7, v5

    .line 284
    :cond_18
    if-eqz v34, :cond_19

    .line 285
    .line 286
    move/from16 v5, v36

    .line 287
    .line 288
    goto :goto_10

    .line 289
    :cond_19
    move/from16 v5, p4

    .line 290
    .line 291
    :goto_10
    if-eqz v35, :cond_1a

    .line 292
    .line 293
    invoke-static {}, Landroidx/compose/material3/SliderKt;->access$getThumbSize$p()J

    .line 294
    .line 295
    .line 296
    move-result-wide v9

    .line 297
    move-wide v14, v9

    .line 298
    goto :goto_11

    .line 299
    :cond_1a
    move-wide/from16 v14, p5

    .line 300
    .line 301
    :goto_11
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 302
    .line 303
    .line 304
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 305
    .line 306
    .line 307
    move-result v9

    .line 308
    if-eqz v9, :cond_1b

    .line 309
    .line 310
    const/4 v9, -0x1

    .line 311
    const-string v10, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:673)"

    .line 312
    .line 313
    invoke-static {v0, v3, v9, v10}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 314
    .line 315
    .line 316
    :cond_1b
    const v0, -0x1d58f75c

    .line 317
    .line 318
    .line 319
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 320
    .line 321
    .line 322
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    sget-object v9, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 327
    .line 328
    invoke-virtual {v9}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v10

    .line 332
    if-ne v0, v10, :cond_1c

    .line 333
    .line 334
    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateListOf()Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    :cond_1c
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 342
    .line 343
    .line 344
    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 345
    .line 346
    and-int/lit8 v10, v3, 0xe

    .line 347
    .line 348
    const v11, 0x1e7b2b64

    .line 349
    .line 350
    .line 351
    invoke-interface {v1, v11}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 352
    .line 353
    .line 354
    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    move-result v11

    .line 358
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    move-result v12

    .line 362
    or-int/2addr v11, v12

    .line 363
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v12

    .line 367
    const/4 v13, 0x0

    .line 368
    if-nez v11, :cond_1d

    .line 369
    .line 370
    invoke-virtual {v9}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v9

    .line 374
    if-ne v12, v9, :cond_1e

    .line 375
    .line 376
    :cond_1d
    new-instance v12, Landroidx/compose/material3/SliderDefaults$Thumb$1$1;

    .line 377
    .line 378
    invoke-direct {v12, v2, v0, v13}, Landroidx/compose/material3/SliderDefaults$Thumb$1$1;-><init>(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/snapshots/SnapshotStateList;Lkotlin/coroutines/Continuation;)V

    .line 379
    .line 380
    .line 381
    invoke-interface {v1, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 382
    .line 383
    .line 384
    :cond_1e
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 385
    .line 386
    .line 387
    check-cast v12, Lkotlin/jvm/functions/Function2;

    .line 388
    .line 389
    or-int/lit8 v9, v10, 0x40

    .line 390
    .line 391
    invoke-static {v2, v12, v1, v9}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 392
    .line 393
    .line 394
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 395
    .line 396
    .line 397
    move-result v0

    .line 398
    xor-int/lit8 v0, v0, 0x1

    .line 399
    .line 400
    if-eqz v0, :cond_1f

    .line 401
    .line 402
    invoke-static {}, Landroidx/compose/material3/SliderKt;->access$getThumbPressedElevation$p()F

    .line 403
    .line 404
    .line 405
    move-result v0

    .line 406
    goto :goto_12

    .line 407
    :cond_1f
    invoke-static {}, Landroidx/compose/material3/SliderKt;->access$getThumbDefaultElevation$p()F

    .line 408
    .line 409
    .line 410
    move-result v0

    .line 411
    :goto_12
    sget-object v9, Landroidx/compose/material3/tokens/SliderTokens;->INSTANCE:Landroidx/compose/material3/tokens/SliderTokens;

    .line 412
    .line 413
    invoke-virtual {v9}, Landroidx/compose/material3/tokens/SliderTokens;->getHandleShape()Landroidx/compose/material3/tokens/ShapeKeyTokens;

    .line 414
    .line 415
    .line 416
    move-result-object v10

    .line 417
    const/4 v11, 0x6

    .line 418
    invoke-static {v10, v1, v11}, Landroidx/compose/material3/ShapesKt;->toShape(Landroidx/compose/material3/tokens/ShapeKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    .line 419
    .line 420
    .line 421
    move-result-object v11

    .line 422
    invoke-static {v6, v14, v15}, Landroidx/compose/foundation/layout/SizeKt;->size-6HolHcs(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    .line 423
    .line 424
    .line 425
    move-result-object v12

    .line 426
    const/4 v10, 0x0

    .line 427
    invoke-virtual {v9}, Landroidx/compose/material3/tokens/SliderTokens;->getStateLayerSize-D9Ej5fM()F

    .line 428
    .line 429
    .line 430
    move-result v9

    .line 431
    int-to-float v13, v4

    .line 432
    div-float/2addr v9, v13

    .line 433
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 434
    .line 435
    .line 436
    move-result v13

    .line 437
    const-wide/16 v16, 0x0

    .line 438
    .line 439
    const/16 v18, 0x36

    .line 440
    .line 441
    const/16 v19, 0x4

    .line 442
    .line 443
    move v9, v10

    .line 444
    move v10, v13

    .line 445
    move-object v13, v11

    .line 446
    move-object v4, v12

    .line 447
    move-wide/from16 v11, v16

    .line 448
    .line 449
    move-object/from16 p3, v13

    .line 450
    .line 451
    move-object v13, v1

    .line 452
    move-wide/from16 v26, v14

    .line 453
    .line 454
    move/from16 v14, v18

    .line 455
    .line 456
    move/from16 v15, v19

    .line 457
    .line 458
    invoke-static/range {v9 .. v15}, Landroidx/compose/material/ripple/RippleKt;->rememberRipple-9IZ8Weo(ZFJLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/Indication;

    .line 459
    .line 460
    .line 461
    move-result-object v9

    .line 462
    invoke-static {v4, v2, v9}, Landroidx/compose/foundation/IndicationKt;->indication(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/Indication;)Landroidx/compose/ui/Modifier;

    .line 463
    .line 464
    .line 465
    move-result-object v4

    .line 466
    const/4 v9, 0x0

    .line 467
    const/4 v10, 0x0

    .line 468
    const/4 v11, 0x2

    .line 469
    invoke-static {v4, v2, v9, v11, v10}, Landroidx/compose/foundation/HoverableKt;->hoverable$default(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 470
    .line 471
    .line 472
    move-result-object v16

    .line 473
    if-eqz v5, :cond_20

    .line 474
    .line 475
    goto :goto_13

    .line 476
    :cond_20
    int-to-float v0, v9

    .line 477
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 478
    .line 479
    .line 480
    move-result v0

    .line 481
    :goto_13
    move/from16 v17, v0

    .line 482
    .line 483
    const/16 v19, 0x0

    .line 484
    .line 485
    const-wide/16 v20, 0x0

    .line 486
    .line 487
    const-wide/16 v22, 0x0

    .line 488
    .line 489
    const/16 v24, 0x18

    .line 490
    .line 491
    const/16 v25, 0x0

    .line 492
    .line 493
    move-object/from16 v18, p3

    .line 494
    .line 495
    invoke-static/range {v16 .. v25}, Landroidx/compose/ui/draw/ShadowKt;->shadow-s4CzXII$default(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;ZJJILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    shr-int/lit8 v4, v3, 0x9

    .line 500
    .line 501
    and-int/lit8 v4, v4, 0xe

    .line 502
    .line 503
    shr-int/lit8 v3, v3, 0x3

    .line 504
    .line 505
    and-int/lit8 v3, v3, 0x70

    .line 506
    .line 507
    or-int/2addr v3, v4

    .line 508
    invoke-virtual {v7, v5, v1, v3}, Landroidx/compose/material3/SliderColors;->thumbColor$material3_release(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 509
    .line 510
    .line 511
    move-result-object v3

    .line 512
    invoke-interface {v3}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v3

    .line 516
    check-cast v3, Landroidx/compose/ui/graphics/Color;

    .line 517
    .line 518
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    .line 519
    .line 520
    .line 521
    move-result-wide v3

    .line 522
    move-object/from16 v10, p3

    .line 523
    .line 524
    invoke-static {v0, v3, v4, v10}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    invoke-static {v0, v1, v9}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 529
    .line 530
    .line 531
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 532
    .line 533
    .line 534
    move-result v0

    .line 535
    if-eqz v0, :cond_21

    .line 536
    .line 537
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 538
    .line 539
    .line 540
    :cond_21
    move-object v3, v6

    .line 541
    move-object v4, v7

    .line 542
    move-wide/from16 v6, v26

    .line 543
    .line 544
    :goto_14
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 545
    .line 546
    .line 547
    move-result-object v10

    .line 548
    if-nez v10, :cond_22

    .line 549
    .line 550
    goto :goto_15

    .line 551
    :cond_22
    new-instance v11, Landroidx/compose/material3/SliderDefaults$Thumb$2;

    .line 552
    .line 553
    move-object v0, v11

    .line 554
    move-object/from16 v1, p0

    .line 555
    .line 556
    move-object/from16 v2, p1

    .line 557
    .line 558
    move/from16 v8, p8

    .line 559
    .line 560
    move/from16 v9, p9

    .line 561
    .line 562
    invoke-direct/range {v0 .. v9}, Landroidx/compose/material3/SliderDefaults$Thumb$2;-><init>(Landroidx/compose/material3/SliderDefaults;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZJII)V

    .line 563
    .line 564
    .line 565
    invoke-interface {v10, v11}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 566
    .line 567
    .line 568
    :goto_15
    return-void
.end method

.method public final Track(Landroidx/compose/material3/SliderPositions;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V
    .locals 34
    .annotation runtime Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .line 1
    move-object/from16 v6, p1

    .line 2
    .line 3
    move/from16 v7, p6

    .line 4
    .line 5
    const-string/jumbo v0, "sliderPositions"

    .line 6
    .line 7
    .line 8
    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const v0, -0x5c30f9c9

    .line 12
    .line 13
    .line 14
    move-object/from16 v1, p5

    .line 15
    .line 16
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    and-int/lit8 v1, p7, 0x1

    .line 21
    .line 22
    const/4 v2, 0x2

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    or-int/lit8 v1, v7, 0x6

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    and-int/lit8 v1, v7, 0xe

    .line 29
    .line 30
    if-nez v1, :cond_2

    .line 31
    .line 32
    invoke-interface {v5, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    const/4 v1, 0x4

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move v1, v2

    .line 41
    :goto_0
    or-int/2addr v1, v7

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    move v1, v7

    .line 44
    :goto_1
    and-int/lit8 v4, p7, 0x2

    .line 45
    .line 46
    if-eqz v4, :cond_3

    .line 47
    .line 48
    or-int/lit8 v1, v1, 0x30

    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_3
    and-int/lit8 v8, v7, 0x70

    .line 52
    .line 53
    if-nez v8, :cond_5

    .line 54
    .line 55
    move-object/from16 v8, p2

    .line 56
    .line 57
    invoke-interface {v5, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    if-eqz v9, :cond_4

    .line 62
    .line 63
    const/16 v9, 0x20

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_4
    const/16 v9, 0x10

    .line 67
    .line 68
    :goto_2
    or-int/2addr v1, v9

    .line 69
    goto :goto_4

    .line 70
    :cond_5
    :goto_3
    move-object/from16 v8, p2

    .line 71
    .line 72
    :goto_4
    and-int/lit16 v9, v7, 0x380

    .line 73
    .line 74
    if-nez v9, :cond_8

    .line 75
    .line 76
    and-int/lit8 v9, p7, 0x4

    .line 77
    .line 78
    if-nez v9, :cond_6

    .line 79
    .line 80
    move-object/from16 v9, p3

    .line 81
    .line 82
    invoke-interface {v5, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    if-eqz v10, :cond_7

    .line 87
    .line 88
    const/16 v10, 0x100

    .line 89
    .line 90
    goto :goto_5

    .line 91
    :cond_6
    move-object/from16 v9, p3

    .line 92
    .line 93
    :cond_7
    const/16 v10, 0x80

    .line 94
    .line 95
    :goto_5
    or-int/2addr v1, v10

    .line 96
    goto :goto_6

    .line 97
    :cond_8
    move-object/from16 v9, p3

    .line 98
    .line 99
    :goto_6
    and-int/lit8 v33, p7, 0x8

    .line 100
    .line 101
    if-eqz v33, :cond_9

    .line 102
    .line 103
    or-int/lit16 v1, v1, 0xc00

    .line 104
    .line 105
    move/from16 v15, p4

    .line 106
    .line 107
    goto :goto_8

    .line 108
    :cond_9
    and-int/lit16 v10, v7, 0x1c00

    .line 109
    .line 110
    move/from16 v15, p4

    .line 111
    .line 112
    if-nez v10, :cond_b

    .line 113
    .line 114
    invoke-interface {v5, v15}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 115
    .line 116
    .line 117
    move-result v10

    .line 118
    if-eqz v10, :cond_a

    .line 119
    .line 120
    const/16 v10, 0x800

    .line 121
    .line 122
    goto :goto_7

    .line 123
    :cond_a
    const/16 v10, 0x400

    .line 124
    .line 125
    :goto_7
    or-int/2addr v1, v10

    .line 126
    :cond_b
    :goto_8
    and-int/lit8 v10, p7, 0x10

    .line 127
    .line 128
    if-eqz v10, :cond_c

    .line 129
    .line 130
    or-int/lit16 v1, v1, 0x6000

    .line 131
    .line 132
    move-object/from16 v13, p0

    .line 133
    .line 134
    goto :goto_a

    .line 135
    :cond_c
    const v10, 0xe000

    .line 136
    .line 137
    .line 138
    and-int/2addr v10, v7

    .line 139
    move-object/from16 v13, p0

    .line 140
    .line 141
    if-nez v10, :cond_e

    .line 142
    .line 143
    invoke-interface {v5, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v10

    .line 147
    if-eqz v10, :cond_d

    .line 148
    .line 149
    const/16 v10, 0x4000

    .line 150
    .line 151
    goto :goto_9

    .line 152
    :cond_d
    const/16 v10, 0x2000

    .line 153
    .line 154
    :goto_9
    or-int/2addr v1, v10

    .line 155
    :cond_e
    :goto_a
    const v10, 0xb6db

    .line 156
    .line 157
    .line 158
    and-int/2addr v10, v1

    .line 159
    const/16 v11, 0x2492

    .line 160
    .line 161
    if-ne v10, v11, :cond_11

    .line 162
    .line 163
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 164
    .line 165
    .line 166
    move-result v10

    .line 167
    if-nez v10, :cond_f

    .line 168
    .line 169
    goto :goto_c

    .line 170
    :cond_f
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 171
    .line 172
    .line 173
    move-object v11, v5

    .line 174
    :cond_10
    :goto_b
    move-object v3, v8

    .line 175
    move-object v4, v9

    .line 176
    move v5, v15

    .line 177
    goto/16 :goto_15

    .line 178
    .line 179
    :cond_11
    :goto_c
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 180
    .line 181
    .line 182
    and-int/lit8 v10, v7, 0x1

    .line 183
    .line 184
    const/4 v14, 0x1

    .line 185
    if-eqz v10, :cond_14

    .line 186
    .line 187
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 188
    .line 189
    .line 190
    move-result v10

    .line 191
    if-eqz v10, :cond_12

    .line 192
    .line 193
    goto :goto_d

    .line 194
    :cond_12
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 195
    .line 196
    .line 197
    and-int/lit8 v4, p7, 0x4

    .line 198
    .line 199
    if-eqz v4, :cond_13

    .line 200
    .line 201
    and-int/lit16 v1, v1, -0x381

    .line 202
    .line 203
    :cond_13
    move v3, v14

    .line 204
    goto :goto_11

    .line 205
    :cond_14
    :goto_d
    if-eqz v4, :cond_15

    .line 206
    .line 207
    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 208
    .line 209
    goto :goto_e

    .line 210
    :cond_15
    move-object v4, v8

    .line 211
    :goto_e
    and-int/lit8 v8, p7, 0x4

    .line 212
    .line 213
    if-eqz v8, :cond_16

    .line 214
    .line 215
    const-wide/16 v9, 0x0

    .line 216
    .line 217
    const-wide/16 v11, 0x0

    .line 218
    .line 219
    const-wide/16 v16, 0x0

    .line 220
    .line 221
    move v8, v14

    .line 222
    move-wide/from16 v13, v16

    .line 223
    .line 224
    move-wide/from16 v15, v16

    .line 225
    .line 226
    const-wide/16 v17, 0x0

    .line 227
    .line 228
    const-wide/16 v19, 0x0

    .line 229
    .line 230
    const-wide/16 v21, 0x0

    .line 231
    .line 232
    const-wide/16 v23, 0x0

    .line 233
    .line 234
    const-wide/16 v25, 0x0

    .line 235
    .line 236
    const-wide/16 v27, 0x0

    .line 237
    .line 238
    const/16 v30, 0x0

    .line 239
    .line 240
    shr-int/lit8 v29, v1, 0xc

    .line 241
    .line 242
    and-int/lit8 v31, v29, 0xe

    .line 243
    .line 244
    const/16 v32, 0x3ff

    .line 245
    .line 246
    move v3, v8

    .line 247
    move-object/from16 v8, p0

    .line 248
    .line 249
    move-object/from16 v29, v5

    .line 250
    .line 251
    invoke-virtual/range {v8 .. v32}, Landroidx/compose/material3/SliderDefaults;->colors-q0g_0yA(JJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SliderColors;

    .line 252
    .line 253
    .line 254
    move-result-object v8

    .line 255
    and-int/lit16 v1, v1, -0x381

    .line 256
    .line 257
    goto :goto_f

    .line 258
    :cond_16
    move v3, v14

    .line 259
    move-object v8, v9

    .line 260
    :goto_f
    if-eqz v33, :cond_17

    .line 261
    .line 262
    move v15, v3

    .line 263
    goto :goto_10

    .line 264
    :cond_17
    move/from16 v15, p4

    .line 265
    .line 266
    :goto_10
    move-object v9, v8

    .line 267
    move-object v8, v4

    .line 268
    :goto_11
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 269
    .line 270
    .line 271
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 272
    .line 273
    .line 274
    move-result v4

    .line 275
    if-eqz v4, :cond_18

    .line 276
    .line 277
    const/4 v4, -0x1

    .line 278
    const-string v10, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:731)"

    .line 279
    .line 280
    invoke-static {v0, v1, v4, v10}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 281
    .line 282
    .line 283
    :cond_18
    shr-int/lit8 v0, v1, 0x9

    .line 284
    .line 285
    and-int/lit8 v0, v0, 0xe

    .line 286
    .line 287
    or-int/lit8 v0, v0, 0x30

    .line 288
    .line 289
    and-int/lit16 v1, v1, 0x380

    .line 290
    .line 291
    or-int/2addr v0, v1

    .line 292
    const/4 v10, 0x0

    .line 293
    invoke-virtual {v9, v15, v10, v5, v0}, Landroidx/compose/material3/SliderColors;->trackColor$material3_release(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    invoke-virtual {v9, v15, v3, v5, v0}, Landroidx/compose/material3/SliderColors;->trackColor$material3_release(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 298
    .line 299
    .line 300
    move-result-object v4

    .line 301
    invoke-virtual {v9, v15, v10, v5, v0}, Landroidx/compose/material3/SliderColors;->tickColor$material3_release(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 302
    .line 303
    .line 304
    move-result-object v11

    .line 305
    invoke-virtual {v9, v15, v3, v5, v0}, Landroidx/compose/material3/SliderColors;->tickColor$material3_release(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 306
    .line 307
    .line 308
    move-result-object v12

    .line 309
    const/4 v0, 0x0

    .line 310
    const/4 v13, 0x0

    .line 311
    invoke-static {v8, v0, v3, v13}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    invoke-static {}, Landroidx/compose/material3/SliderKt;->getTrackHeight()F

    .line 316
    .line 317
    .line 318
    move-result v13

    .line 319
    invoke-static {v0, v13}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 320
    .line 321
    .line 322
    move-result-object v13

    .line 323
    const/4 v0, 0x5

    .line 324
    new-array v14, v0, [Ljava/lang/Object;

    .line 325
    .line 326
    aput-object v1, v14, v10

    .line 327
    .line 328
    aput-object v6, v14, v3

    .line 329
    .line 330
    aput-object v4, v14, v2

    .line 331
    .line 332
    const/4 v2, 0x3

    .line 333
    aput-object v11, v14, v2

    .line 334
    .line 335
    const/4 v2, 0x4

    .line 336
    aput-object v12, v14, v2

    .line 337
    .line 338
    const v2, -0x21de6e89

    .line 339
    .line 340
    .line 341
    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 342
    .line 343
    .line 344
    move v2, v10

    .line 345
    move v3, v2

    .line 346
    :goto_12
    if-ge v2, v0, :cond_19

    .line 347
    .line 348
    aget-object v0, v14, v2

    .line 349
    .line 350
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 351
    .line 352
    .line 353
    move-result v0

    .line 354
    or-int/2addr v3, v0

    .line 355
    add-int/lit8 v2, v2, 0x1

    .line 356
    .line 357
    const/4 v0, 0x5

    .line 358
    goto :goto_12

    .line 359
    :cond_19
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    if-nez v3, :cond_1b

    .line 364
    .line 365
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 366
    .line 367
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v2

    .line 371
    if-ne v0, v2, :cond_1a

    .line 372
    .line 373
    goto :goto_13

    .line 374
    :cond_1a
    move-object v11, v5

    .line 375
    goto :goto_14

    .line 376
    :cond_1b
    :goto_13
    new-instance v14, Landroidx/compose/material3/SliderDefaults$Track$1$1;

    .line 377
    .line 378
    move-object v0, v14

    .line 379
    move-object/from16 v2, p1

    .line 380
    .line 381
    move-object v3, v4

    .line 382
    move-object v4, v11

    .line 383
    move-object v11, v5

    .line 384
    move-object v5, v12

    .line 385
    invoke-direct/range {v0 .. v5}, Landroidx/compose/material3/SliderDefaults$Track$1$1;-><init>(Landroidx/compose/runtime/State;Landroidx/compose/material3/SliderPositions;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V

    .line 386
    .line 387
    .line 388
    invoke-interface {v11, v14}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 389
    .line 390
    .line 391
    :goto_14
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 392
    .line 393
    .line 394
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 395
    .line 396
    invoke-static {v13, v0, v11, v10}, Landroidx/compose/foundation/CanvasKt;->Canvas(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 397
    .line 398
    .line 399
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 400
    .line 401
    .line 402
    move-result v0

    .line 403
    if-eqz v0, :cond_10

    .line 404
    .line 405
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 406
    .line 407
    .line 408
    goto/16 :goto_b

    .line 409
    .line 410
    :goto_15
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 411
    .line 412
    .line 413
    move-result-object v8

    .line 414
    if-nez v8, :cond_1c

    .line 415
    .line 416
    goto :goto_16

    .line 417
    :cond_1c
    new-instance v9, Landroidx/compose/material3/SliderDefaults$Track$2;

    .line 418
    .line 419
    move-object v0, v9

    .line 420
    move-object/from16 v1, p0

    .line 421
    .line 422
    move-object/from16 v2, p1

    .line 423
    .line 424
    move/from16 v6, p6

    .line 425
    .line 426
    move/from16 v7, p7

    .line 427
    .line 428
    invoke-direct/range {v0 .. v7}, Landroidx/compose/material3/SliderDefaults$Track$2;-><init>(Landroidx/compose/material3/SliderDefaults;Landroidx/compose/material3/SliderPositions;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZII)V

    .line 429
    .line 430
    .line 431
    invoke-interface {v8, v9}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 432
    .line 433
    .line 434
    :goto_16
    return-void
.end method

.method public final colors-q0g_0yA(JJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SliderColors;
    .locals 29
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    move-object/from16 v0, p21

    move/from16 v1, p24

    const v2, 0x34c9025e

    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    and-int/lit8 v3, v1, 0x1

    const/4 v4, 0x6

    if-eqz v3, :cond_0

    .line 1
    sget-object v3, Landroidx/compose/material3/tokens/SliderTokens;->INSTANCE:Landroidx/compose/material3/tokens/SliderTokens;

    invoke-virtual {v3}, Landroidx/compose/material3/tokens/SliderTokens;->getHandleColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    move-result-object v3

    invoke-static {v3, v0, v4}, Landroidx/compose/material3/ColorSchemeKt;->toColor(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v5

    move-wide v8, v5

    goto :goto_0

    :cond_0
    move-wide/from16 v8, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    .line 2
    sget-object v3, Landroidx/compose/material3/tokens/SliderTokens;->INSTANCE:Landroidx/compose/material3/tokens/SliderTokens;

    invoke-virtual {v3}, Landroidx/compose/material3/tokens/SliderTokens;->getActiveTrackColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    move-result-object v3

    invoke-static {v3, v0, v4}, Landroidx/compose/material3/ColorSchemeKt;->toColor(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v5

    move-wide v10, v5

    goto :goto_1

    :cond_1
    move-wide/from16 v10, p3

    :goto_1
    and-int/lit8 v3, v1, 0x4

    if-eqz v3, :cond_2

    .line 3
    sget-object v3, Landroidx/compose/material3/tokens/SliderTokens;->INSTANCE:Landroidx/compose/material3/tokens/SliderTokens;

    invoke-virtual {v3}, Landroidx/compose/material3/tokens/SliderTokens;->getTickMarksActiveContainerColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    move-result-object v3

    .line 4
    invoke-static {v3, v0, v4}, Landroidx/compose/material3/ColorSchemeKt;->toColor(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v12

    const v14, 0x3ec28f5c    # 0.38f

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0xe

    const/16 v19, 0x0

    .line 5
    invoke-static/range {v12 .. v19}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v5

    move-wide v12, v5

    goto :goto_2

    :cond_2
    move-wide/from16 v12, p5

    :goto_2
    and-int/lit8 v3, v1, 0x8

    if-eqz v3, :cond_3

    .line 6
    sget-object v3, Landroidx/compose/material3/tokens/SliderTokens;->INSTANCE:Landroidx/compose/material3/tokens/SliderTokens;

    invoke-virtual {v3}, Landroidx/compose/material3/tokens/SliderTokens;->getInactiveTrackColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    move-result-object v3

    invoke-static {v3, v0, v4}, Landroidx/compose/material3/ColorSchemeKt;->toColor(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v5

    move-wide v14, v5

    goto :goto_3

    :cond_3
    move-wide/from16 v14, p7

    :goto_3
    and-int/lit8 v3, v1, 0x10

    if-eqz v3, :cond_4

    .line 7
    sget-object v3, Landroidx/compose/material3/tokens/SliderTokens;->INSTANCE:Landroidx/compose/material3/tokens/SliderTokens;

    invoke-virtual {v3}, Landroidx/compose/material3/tokens/SliderTokens;->getTickMarksInactiveContainerColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    move-result-object v3

    invoke-static {v3, v0, v4}, Landroidx/compose/material3/ColorSchemeKt;->toColor(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v5

    const v3, 0x3ec28f5c    # 0.38f

    const/4 v7, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0xe

    const/16 v19, 0x0

    move-wide/from16 p1, v5

    move/from16 p3, v3

    move/from16 p4, v7

    move/from16 p5, v16

    move/from16 p6, v17

    move/from16 p7, v18

    move-object/from16 p8, v19

    .line 8
    invoke-static/range {p1 .. p8}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v5

    move-wide/from16 v16, v5

    goto :goto_4

    :cond_4
    move-wide/from16 v16, p9

    :goto_4
    and-int/lit8 v3, v1, 0x20

    if-eqz v3, :cond_5

    .line 9
    sget-object v3, Landroidx/compose/material3/tokens/SliderTokens;->INSTANCE:Landroidx/compose/material3/tokens/SliderTokens;

    invoke-virtual {v3}, Landroidx/compose/material3/tokens/SliderTokens;->getDisabledHandleColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    move-result-object v3

    .line 10
    invoke-static {v3, v0, v4}, Landroidx/compose/material3/ColorSchemeKt;->toColor(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v5

    const v3, 0x3ec28f5c    # 0.38f

    const/4 v7, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0xe

    const/16 v21, 0x0

    move-wide/from16 p1, v5

    move/from16 p3, v3

    move/from16 p4, v7

    move/from16 p5, v18

    move/from16 p6, v19

    move/from16 p7, v20

    move-object/from16 p8, v21

    .line 11
    invoke-static/range {p1 .. p8}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v5

    .line 12
    sget-object v3, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    invoke-virtual {v3, v0, v4}, Landroidx/compose/material3/MaterialTheme;->getColorScheme(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ColorScheme;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/material3/ColorScheme;->getSurface-0d7_KjU()J

    move-result-wide v2

    invoke-static {v5, v6, v2, v3}, Landroidx/compose/ui/graphics/ColorKt;->compositeOver--OWjLjI(JJ)J

    move-result-wide v2

    move-wide/from16 v18, v2

    goto :goto_5

    :cond_5
    move-wide/from16 v18, p11

    :goto_5
    and-int/lit8 v2, v1, 0x40

    if-eqz v2, :cond_6

    .line 13
    sget-object v2, Landroidx/compose/material3/tokens/SliderTokens;->INSTANCE:Landroidx/compose/material3/tokens/SliderTokens;

    invoke-virtual {v2}, Landroidx/compose/material3/tokens/SliderTokens;->getDisabledActiveTrackColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    move-result-object v2

    .line 14
    invoke-static {v2, v0, v4}, Landroidx/compose/material3/ColorSchemeKt;->toColor(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v2

    const v5, 0x3ec28f5c    # 0.38f

    const/4 v6, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0xe

    const/16 v23, 0x0

    move-wide/from16 p1, v2

    move/from16 p3, v5

    move/from16 p4, v6

    move/from16 p5, v20

    move/from16 p6, v21

    move/from16 p7, v22

    move-object/from16 p8, v23

    .line 15
    invoke-static/range {p1 .. p8}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v2

    move-wide/from16 v20, v2

    goto :goto_6

    :cond_6
    move-wide/from16 v20, p13

    :goto_6
    and-int/lit16 v2, v1, 0x80

    if-eqz v2, :cond_7

    .line 16
    sget-object v2, Landroidx/compose/material3/tokens/SliderTokens;->INSTANCE:Landroidx/compose/material3/tokens/SliderTokens;

    invoke-virtual {v2}, Landroidx/compose/material3/tokens/SliderTokens;->getTickMarksDisabledContainerColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    move-result-object v2

    .line 17
    invoke-static {v2, v0, v4}, Landroidx/compose/material3/ColorSchemeKt;->toColor(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v2

    const v5, 0x3ec28f5c    # 0.38f

    const/4 v6, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0xe

    const/16 v25, 0x0

    move-wide/from16 p1, v2

    move/from16 p3, v5

    move/from16 p4, v6

    move/from16 p5, v22

    move/from16 p6, v23

    move/from16 p7, v24

    move-object/from16 p8, v25

    .line 18
    invoke-static/range {p1 .. p8}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v2

    move-wide/from16 v22, v2

    goto :goto_7

    :cond_7
    move-wide/from16 v22, p15

    :goto_7
    and-int/lit16 v2, v1, 0x100

    if-eqz v2, :cond_8

    .line 19
    sget-object v2, Landroidx/compose/material3/tokens/SliderTokens;->INSTANCE:Landroidx/compose/material3/tokens/SliderTokens;

    invoke-virtual {v2}, Landroidx/compose/material3/tokens/SliderTokens;->getDisabledInactiveTrackColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    move-result-object v2

    .line 20
    invoke-static {v2, v0, v4}, Landroidx/compose/material3/ColorSchemeKt;->toColor(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v2

    const v5, 0x3df5c28f    # 0.12f

    const/4 v6, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0xe

    const/16 v27, 0x0

    move-wide/from16 p1, v2

    move/from16 p3, v5

    move/from16 p4, v6

    move/from16 p5, v24

    move/from16 p6, v25

    move/from16 p7, v26

    move-object/from16 p8, v27

    .line 21
    invoke-static/range {p1 .. p8}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v2

    move-wide/from16 v24, v2

    goto :goto_8

    :cond_8
    move-wide/from16 v24, p17

    :goto_8
    and-int/lit16 v1, v1, 0x200

    if-eqz v1, :cond_9

    .line 22
    sget-object v1, Landroidx/compose/material3/tokens/SliderTokens;->INSTANCE:Landroidx/compose/material3/tokens/SliderTokens;

    invoke-virtual {v1}, Landroidx/compose/material3/tokens/SliderTokens;->getTickMarksDisabledContainerColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    move-result-object v1

    invoke-static {v1, v0, v4}, Landroidx/compose/material3/ColorSchemeKt;->toColor(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v1

    const v3, 0x3ec28f5c    # 0.38f

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v26, 0xe

    const/16 v27, 0x0

    move-wide/from16 p1, v1

    move/from16 p3, v3

    move/from16 p4, v4

    move/from16 p5, v5

    move/from16 p6, v6

    move/from16 p7, v26

    move-object/from16 p8, v27

    .line 23
    invoke-static/range {p1 .. p8}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v1

    move-wide/from16 v26, v1

    goto :goto_9

    :cond_9
    move-wide/from16 v26, p19

    :goto_9
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_a

    const-string v1, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:618)"

    move/from16 v2, p22

    move/from16 v3, p23

    const v4, 0x34c9025e

    .line 24
    invoke-static {v4, v2, v3, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_a
    new-instance v1, Landroidx/compose/material3/SliderColors;

    move-object v7, v1

    const/16 v28, 0x0

    invoke-direct/range {v7 .. v28}, Landroidx/compose/material3/SliderColors;-><init>(JJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_b
    invoke-interface/range {p21 .. p21}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    return-object v1
.end method
