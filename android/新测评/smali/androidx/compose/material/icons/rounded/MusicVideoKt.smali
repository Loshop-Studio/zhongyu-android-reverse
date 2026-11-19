.class public final Landroidx/compose/material/icons/rounded/MusicVideoKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_musicVideo",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "MusicVideo",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getMusicVideo",
        "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;",
        "material-icons-extended_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMusicVideo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicVideo.kt\nandroidx/compose/material/icons/rounded/MusicVideoKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,69:1\n212#2,12:70\n233#2,18:83\n253#2:120\n233#2,18:121\n253#2:158\n174#3:82\n705#4,2:101\n717#4,2:103\n719#4,11:109\n705#4,2:139\n717#4,2:141\n719#4,11:147\n72#5,4:105\n72#5,4:143\n*S KotlinDebug\n*F\n+ 1 MusicVideo.kt\nandroidx/compose/material/icons/rounded/MusicVideoKt\n*L\n29#1:70,12\n30#1:83,18\n30#1:120\n48#1:121,18\n48#1:158\n29#1:82\n30#1:101,2\n30#1:103,2\n30#1:109,11\n48#1:139,2\n48#1:141,2\n48#1:147,11\n30#1:105,4\n48#1:143,4\n*E\n"
    }
.end annotation


# static fields
.field private static _musicVideo:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMusicVideo(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/MusicVideoKt;->_musicVideo:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    new-instance v1, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 10
    .line 11
    const/high16 v0, 0x41c00000    # 24.0f

    .line 12
    .line 13
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    const/16 v11, 0x60

    .line 22
    .line 23
    const/4 v12, 0x0

    .line 24
    const/4 v10, 0x0

    .line 25
    const/high16 v5, 0x41c00000    # 24.0f

    .line 26
    .line 27
    const/high16 v6, 0x41c00000    # 24.0f

    .line 28
    .line 29
    const-wide/16 v7, 0x0

    .line 30
    .line 31
    const/4 v9, 0x0

    .line 32
    const-string v2, "Rounded.MusicVideo"

    .line 33
    .line 34
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 35
    .line 36
    .line 37
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 42
    .line 43
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 44
    .line 45
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 46
    .line 47
    .line 48
    move-result-wide v6

    .line 49
    const/4 v2, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 51
    .line 52
    .line 53
    sget-object v18, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v19, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v4, 0x41a00000    # 20.0f

    .line 71
    .line 72
    const/high16 v6, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40800000    # 4.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v25, 0x40000000    # 2.0f

    .line 83
    .line 84
    const/high16 v26, 0x40c00000    # 6.0f

    .line 85
    .line 86
    const v21, 0x4039999a    # 2.9f

    .line 87
    .line 88
    .line 89
    const/high16 v22, 0x40800000    # 4.0f

    .line 90
    .line 91
    const/high16 v23, 0x40000000    # 2.0f

    .line 92
    .line 93
    const v24, 0x409ccccd    # 4.9f

    .line 94
    .line 95
    .line 96
    move-object/from16 v20, v2

    .line 97
    .line 98
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v4, 0x41400000    # 12.0f

    .line 102
    .line 103
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v26, 0x40000000    # 2.0f

    .line 107
    .line 108
    const/16 v21, 0x0

    .line 109
    .line 110
    const v22, 0x3f8ccccd    # 1.1f

    .line 111
    .line 112
    .line 113
    const v23, 0x3f666666    # 0.9f

    .line 114
    .line 115
    .line 116
    const/high16 v24, 0x40000000    # 2.0f

    .line 117
    .line 118
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v4, 0x41800000    # 16.0f

    .line 122
    .line 123
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v26, -0x40000000    # -2.0f

    .line 127
    .line 128
    const v21, 0x3f8ccccd    # 1.1f

    .line 129
    .line 130
    .line 131
    const/16 v22, 0x0

    .line 132
    .line 133
    const/high16 v23, 0x40000000    # 2.0f

    .line 134
    .line 135
    const v24, -0x4099999a    # -0.9f

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v4, 0x40c00000    # 6.0f

    .line 142
    .line 143
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v25, 0x41a00000    # 20.0f

    .line 147
    .line 148
    const/high16 v26, 0x40800000    # 4.0f

    .line 149
    .line 150
    const/high16 v21, 0x41b00000    # 22.0f

    .line 151
    .line 152
    const v22, 0x409ccccd    # 4.9f

    .line 153
    .line 154
    .line 155
    const v23, 0x41a8cccd    # 21.1f

    .line 156
    .line 157
    .line 158
    const/high16 v24, 0x40800000    # 4.0f

    .line 159
    .line 160
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v4, 0x41900000    # 18.0f

    .line 167
    .line 168
    const/high16 v6, 0x41a00000    # 20.0f

    .line 169
    .line 170
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v4, 0x40800000    # 4.0f

    .line 174
    .line 175
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const/high16 v4, 0x40c00000    # 6.0f

    .line 179
    .line 180
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const/high16 v4, 0x41800000    # 16.0f

    .line 184
    .line 185
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v4, 0x41900000    # 18.0f

    .line 189
    .line 190
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    const/16 v16, 0x3800

    .line 201
    .line 202
    const/16 v17, 0x0

    .line 203
    .line 204
    const/high16 v6, 0x3f800000    # 1.0f

    .line 205
    .line 206
    const/high16 v8, 0x3f800000    # 1.0f

    .line 207
    .line 208
    const/4 v7, 0x0

    .line 209
    const/high16 v9, 0x3f800000    # 1.0f

    .line 210
    .line 211
    const/high16 v12, 0x3f800000    # 1.0f

    .line 212
    .line 213
    const/4 v13, 0x0

    .line 214
    const/4 v14, 0x0

    .line 215
    const/4 v15, 0x0

    .line 216
    const-string v4, ""

    .line 217
    .line 218
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 219
    .line 220
    .line 221
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 222
    .line 223
    .line 224
    move-result v3

    .line 225
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 226
    .line 227
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 228
    .line 229
    .line 230
    move-result-wide v6

    .line 231
    const/4 v0, 0x0

    .line 232
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 236
    .line 237
    .line 238
    move-result v10

    .line 239
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 240
    .line 241
    .line 242
    move-result v11

    .line 243
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 246
    .line 247
    .line 248
    const v0, 0x412d70a4    # 10.84f

    .line 249
    .line 250
    .line 251
    const v2, 0x4187d70a    # 16.98f

    .line 252
    .line 253
    .line 254
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v17, 0x400a3d71    # 2.16f

    .line 258
    .line 259
    .line 260
    const v18, -0x3fd9999a    # -2.6f

    .line 261
    .line 262
    .line 263
    const v13, 0x3fa147ae    # 1.26f

    .line 264
    .line 265
    .line 266
    const v14, -0x41d1eb85    # -0.17f

    .line 267
    .line 268
    .line 269
    const v15, 0x400a3d71    # 2.16f

    .line 270
    .line 271
    .line 272
    const v16, -0x4055c28f    # -1.33f

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/high16 v0, 0x41500000    # 13.0f

    .line 279
    .line 280
    const/high16 v2, 0x41100000    # 9.0f

    .line 281
    .line 282
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v0, 0x40000000    # 2.0f

    .line 286
    .line 287
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v17, 0x3f800000    # 1.0f

    .line 291
    .line 292
    const/high16 v18, -0x40800000    # -1.0f

    .line 293
    .line 294
    const v13, 0x3f0ccccd    # 0.55f

    .line 295
    .line 296
    .line 297
    const/4 v14, 0x0

    .line 298
    const/high16 v15, 0x3f800000    # 1.0f

    .line 299
    .line 300
    const v16, -0x4119999a    # -0.45f

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const/4 v0, 0x0

    .line 307
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v17, -0x40800000    # -1.0f

    .line 311
    .line 312
    const/4 v13, 0x0

    .line 313
    const v14, -0x40f33333    # -0.55f

    .line 314
    .line 315
    .line 316
    const v15, -0x4119999a    # -0.45f

    .line 317
    .line 318
    .line 319
    const/high16 v16, -0x40800000    # -1.0f

    .line 320
    .line 321
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const/high16 v0, -0x40000000    # -2.0f

    .line 325
    .line 326
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/high16 v18, 0x3f800000    # 1.0f

    .line 330
    .line 331
    const v13, -0x40f33333    # -0.55f

    .line 332
    .line 333
    .line 334
    const/4 v14, 0x0

    .line 335
    const/high16 v15, -0x40800000    # -1.0f

    .line 336
    .line 337
    const v16, 0x3ee66666    # 0.45f

    .line 338
    .line 339
    .line 340
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v0, 0x409051ec    # 4.51f

    .line 344
    .line 345
    .line 346
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v17, -0x402b851f    # -1.66f

    .line 350
    .line 351
    .line 352
    const v18, -0x40fd70a4    # -0.51f

    .line 353
    .line 354
    .line 355
    const v13, -0x41147ae1    # -0.46f

    .line 356
    .line 357
    .line 358
    const v14, -0x414ccccd    # -0.35f

    .line 359
    .line 360
    .line 361
    const v15, -0x407d70a4    # -1.02f

    .line 362
    .line 363
    .line 364
    const v16, -0x40f5c28f    # -0.54f

    .line 365
    .line 366
    .line 367
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v17, -0x3feccccd    # -2.3f

    .line 371
    .line 372
    .line 373
    const v18, 0x400147ae    # 2.02f

    .line 374
    .line 375
    .line 376
    const v13, -0x4071eb85    # -1.11f

    .line 377
    .line 378
    .line 379
    const v14, 0x3d8f5c29    # 0.07f

    .line 380
    .line 381
    .line 382
    const v15, -0x3ffa3d71    # -2.09f

    .line 383
    .line 384
    .line 385
    const v16, 0x3f6b851f    # 0.92f

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v17, 0x412d70a4    # 10.84f

    .line 392
    .line 393
    .line 394
    const v18, 0x4187d70a    # 16.98f

    .line 395
    .line 396
    .line 397
    const v13, 0x40f75c29    # 7.73f

    .line 398
    .line 399
    .line 400
    const v14, 0x417bae14    # 15.73f

    .line 401
    .line 402
    .line 403
    const v15, 0x41126666    # 9.15f

    .line 404
    .line 405
    .line 406
    const v16, 0x4189999a    # 17.2f

    .line 407
    .line 408
    .line 409
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 416
    .line 417
    .line 418
    move-result-object v2

    .line 419
    const/16 v16, 0x3800

    .line 420
    .line 421
    const/16 v17, 0x0

    .line 422
    .line 423
    const/high16 v6, 0x3f800000    # 1.0f

    .line 424
    .line 425
    const/4 v7, 0x0

    .line 426
    const/high16 v12, 0x3f800000    # 1.0f

    .line 427
    .line 428
    const/4 v13, 0x0

    .line 429
    const/4 v14, 0x0

    .line 430
    const/4 v15, 0x0

    .line 431
    const-string v4, ""

    .line 432
    .line 433
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    sput-object v0, Landroidx/compose/material/icons/rounded/MusicVideoKt;->_musicVideo:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 442
    .line 443
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 444
    .line 445
    .line 446
    return-object v0
.end method
