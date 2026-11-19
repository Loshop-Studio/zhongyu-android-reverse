.class public final Landroidx/compose/material/icons/rounded/ThumbDownOffAltKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_thumbDownOffAlt",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "ThumbDownOffAlt",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getThumbDownOffAlt",
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
        "SMAP\nThumbDownOffAlt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThumbDownOffAlt.kt\nandroidx/compose/material/icons/rounded/ThumbDownOffAltKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,74:1\n212#2,12:75\n233#2,18:88\n253#2:125\n233#2,18:126\n253#2:163\n174#3:87\n705#4,2:106\n717#4,2:108\n719#4,11:114\n705#4,2:144\n717#4,2:146\n719#4,11:152\n72#5,4:110\n72#5,4:148\n*S KotlinDebug\n*F\n+ 1 ThumbDownOffAlt.kt\nandroidx/compose/material/icons/rounded/ThumbDownOffAltKt\n*L\n29#1:75,12\n30#1:88,18\n30#1:125\n59#1:126,18\n59#1:163\n29#1:87\n30#1:106,2\n30#1:108,2\n30#1:114,11\n59#1:144,2\n59#1:146,2\n59#1:152,11\n30#1:110,4\n59#1:148,4\n*E\n"
    }
.end annotation


# static fields
.field private static _thumbDownOffAlt:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getThumbDownOffAlt(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ThumbDownOffAltKt;->_thumbDownOffAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.ThumbDownOffAlt"

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
    const v4, 0x416fd70a    # 14.99f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x40400000    # 3.0f

    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v4, 0x40c00000    # 6.0f

    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v25, 0x408570a4    # 4.17f

    .line 84
    .line 85
    .line 86
    const v26, 0x4086b852    # 4.21f

    .line 87
    .line 88
    .line 89
    const v21, 0x40a66666    # 5.2f

    .line 90
    .line 91
    .line 92
    const/high16 v22, 0x40400000    # 3.0f

    .line 93
    .line 94
    const v23, 0x408f5c29    # 4.48f

    .line 95
    .line 96
    .line 97
    const v24, 0x405eb852    # 3.48f

    .line 98
    .line 99
    .line 100
    move-object/from16 v20, v2

    .line 101
    .line 102
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v4, -0x3faf5c29    # -3.26f

    .line 106
    .line 107
    .line 108
    const v6, 0x40f3851f    # 7.61f

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v25, 0x406a3d71    # 3.66f

    .line 115
    .line 116
    .line 117
    const/high16 v26, 0x41800000    # 16.0f

    .line 118
    .line 119
    const v21, 0x3d75c28f    # 0.06f

    .line 120
    .line 121
    .line 122
    const v22, 0x415ccccd    # 13.8f

    .line 123
    .line 124
    .line 125
    const v23, 0x3fc147ae    # 1.51f

    .line 126
    .line 127
    .line 128
    const/high16 v24, 0x41800000    # 16.0f

    .line 129
    .line 130
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v4, 0x40b4cccd    # 5.65f

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v4, -0x408ccccd    # -0.95f

    .line 140
    .line 141
    .line 142
    const v6, 0x40928f5c    # 4.58f

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v25, 0x3ed1eb85    # 0.41f

    .line 149
    .line 150
    .line 151
    const v26, 0x3faf5c29    # 1.37f

    .line 152
    .line 153
    .line 154
    const v21, -0x42333333    # -0.1f

    .line 155
    .line 156
    .line 157
    const/high16 v22, 0x3f000000    # 0.5f

    .line 158
    .line 159
    const v23, 0x3d4ccccd    # 0.05f

    .line 160
    .line 161
    .line 162
    const v24, 0x3f8147ae    # 1.01f

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v25, 0x3f866666    # 1.05f

    .line 169
    .line 170
    .line 171
    const v26, 0x3edc28f6    # 0.43f

    .line 172
    .line 173
    .line 174
    const v21, 0x3e947ae1    # 0.29f

    .line 175
    .line 176
    .line 177
    const v22, 0x3e947ae1    # 0.29f

    .line 178
    .line 179
    .line 180
    const v23, 0x3f2b851f    # 0.67f

    .line 181
    .line 182
    .line 183
    const v24, 0x3edc28f6    # 0.43f

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v25, 0x3f87ae14    # 1.06f

    .line 190
    .line 191
    .line 192
    const v26, -0x411eb852    # -0.44f

    .line 193
    .line 194
    .line 195
    const v21, 0x3ec28f5c    # 0.38f

    .line 196
    .line 197
    .line 198
    const/16 v22, 0x0

    .line 199
    .line 200
    const v23, 0x3f451eb8    # 0.77f

    .line 201
    .line 202
    .line 203
    const v24, -0x41e66666    # -0.15f

    .line 204
    .line 205
    .line 206
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v4, 0x40b0f5c3    # 5.53f

    .line 210
    .line 211
    .line 212
    const v6, -0x3f4eb852    # -5.54f

    .line 213
    .line 214
    .line 215
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v25, 0x3f147ae1    # 0.58f

    .line 219
    .line 220
    .line 221
    const v26, -0x404b851f    # -1.41f

    .line 222
    .line 223
    .line 224
    const v21, 0x3ebd70a4    # 0.37f

    .line 225
    .line 226
    .line 227
    const v22, -0x41428f5c    # -0.37f

    .line 228
    .line 229
    .line 230
    const v23, 0x3f147ae1    # 0.58f

    .line 231
    .line 232
    .line 233
    const v24, -0x409eb852    # -0.88f

    .line 234
    .line 235
    .line 236
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/high16 v4, 0x40a00000    # 5.0f

    .line 240
    .line 241
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v25, 0x416fd70a    # 14.99f

    .line 245
    .line 246
    .line 247
    const/high16 v26, 0x40400000    # 3.0f

    .line 248
    .line 249
    const v21, 0x4187eb85    # 16.99f

    .line 250
    .line 251
    .line 252
    const v22, 0x4079999a    # 3.9f

    .line 253
    .line 254
    .line 255
    const v23, 0x4180b852    # 16.09f

    .line 256
    .line 257
    .line 258
    const/high16 v24, 0x40400000    # 3.0f

    .line 259
    .line 260
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v4, 0x419aa3d7    # 19.33f

    .line 267
    .line 268
    .line 269
    const v6, 0x412a8f5c    # 10.66f

    .line 270
    .line 271
    .line 272
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v4, 0x3f1c28f6    # 0.61f

    .line 276
    .line 277
    .line 278
    const v6, -0x3fc51eb8    # -2.92f

    .line 279
    .line 280
    .line 281
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v4, 0x3f000000    # 0.5f

    .line 285
    .line 286
    const v6, -0x3fe5c28f    # -2.41f

    .line 287
    .line 288
    .line 289
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v4, 0x4114f5c3    # 9.31f

    .line 293
    .line 294
    .line 295
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v4, 0x406a3d71    # 3.66f

    .line 299
    .line 300
    .line 301
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v25, -0x40ab851f    # -0.83f

    .line 305
    .line 306
    .line 307
    const v26, -0x4119999a    # -0.45f

    .line 308
    .line 309
    .line 310
    const v21, -0x410f5c29    # -0.47f

    .line 311
    .line 312
    .line 313
    const/16 v22, 0x0

    .line 314
    .line 315
    const v23, -0x40c7ae14    # -0.72f

    .line 316
    .line 317
    .line 318
    const v24, -0x4170a3d7    # -0.28f

    .line 319
    .line 320
    .line 321
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v25, -0x425c28f6    # -0.08f

    .line 325
    .line 326
    .line 327
    const v26, -0x408ccccd    # -0.95f

    .line 328
    .line 329
    .line 330
    const v21, -0x421eb852    # -0.11f

    .line 331
    .line 332
    .line 333
    const v22, -0x41d1eb85    # -0.17f

    .line 334
    .line 335
    .line 336
    const v23, -0x4175c28f    # -0.27f

    .line 337
    .line 338
    .line 339
    const v24, -0x40fd70a4    # -0.51f

    .line 340
    .line 341
    .line 342
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v4, 0x40c00000    # 6.0f

    .line 346
    .line 347
    const/high16 v6, 0x40a00000    # 5.0f

    .line 348
    .line 349
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const v4, 0x410fd70a    # 8.99f

    .line 353
    .line 354
    .line 355
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/4 v4, 0x0

    .line 359
    const v6, 0x411fd70a    # 9.99f

    .line 360
    .line 361
    .line 362
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v4, 0x419aa3d7    # 19.33f

    .line 366
    .line 367
    .line 368
    const v6, 0x412a8f5c    # 10.66f

    .line 369
    .line 370
    .line 371
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    const/16 v16, 0x3800

    .line 382
    .line 383
    const/16 v17, 0x0

    .line 384
    .line 385
    const/high16 v6, 0x3f800000    # 1.0f

    .line 386
    .line 387
    const/high16 v8, 0x3f800000    # 1.0f

    .line 388
    .line 389
    const/4 v7, 0x0

    .line 390
    const/high16 v9, 0x3f800000    # 1.0f

    .line 391
    .line 392
    const/high16 v12, 0x3f800000    # 1.0f

    .line 393
    .line 394
    const/4 v13, 0x0

    .line 395
    const/4 v14, 0x0

    .line 396
    const/4 v15, 0x0

    .line 397
    const-string v4, ""

    .line 398
    .line 399
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 400
    .line 401
    .line 402
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 403
    .line 404
    .line 405
    move-result v3

    .line 406
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 407
    .line 408
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 409
    .line 410
    .line 411
    move-result-wide v6

    .line 412
    const/4 v0, 0x0

    .line 413
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 414
    .line 415
    .line 416
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 417
    .line 418
    .line 419
    move-result v10

    .line 420
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 421
    .line 422
    .line 423
    move-result v11

    .line 424
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 427
    .line 428
    .line 429
    const/high16 v0, 0x41a80000    # 21.0f

    .line 430
    .line 431
    const/high16 v2, 0x40400000    # 3.0f

    .line 432
    .line 433
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const/high16 v17, -0x40000000    # -2.0f

    .line 437
    .line 438
    const/high16 v18, 0x40000000    # 2.0f

    .line 439
    .line 440
    const v13, -0x40733333    # -1.1f

    .line 441
    .line 442
    .line 443
    const/high16 v15, -0x40000000    # -2.0f

    .line 444
    .line 445
    const v16, 0x3f666666    # 0.9f

    .line 446
    .line 447
    .line 448
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const/high16 v0, 0x41000000    # 8.0f

    .line 452
    .line 453
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/high16 v17, 0x40000000    # 2.0f

    .line 457
    .line 458
    const/4 v13, 0x0

    .line 459
    const v14, 0x3f8ccccd    # 1.1f

    .line 460
    .line 461
    .line 462
    const v15, 0x3f666666    # 0.9f

    .line 463
    .line 464
    .line 465
    const/high16 v16, 0x40000000    # 2.0f

    .line 466
    .line 467
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v0, -0x4099999a    # -0.9f

    .line 471
    .line 472
    .line 473
    const/high16 v2, -0x40000000    # -2.0f

    .line 474
    .line 475
    const/high16 v4, 0x40000000    # 2.0f

    .line 476
    .line 477
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const/high16 v0, 0x40a00000    # 5.0f

    .line 481
    .line 482
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const/high16 v17, 0x41a80000    # 21.0f

    .line 486
    .line 487
    const/high16 v18, 0x40400000    # 3.0f

    .line 488
    .line 489
    const/high16 v13, 0x41b80000    # 23.0f

    .line 490
    .line 491
    const v14, 0x4079999a    # 3.9f

    .line 492
    .line 493
    .line 494
    const v15, 0x41b0cccd    # 22.1f

    .line 495
    .line 496
    .line 497
    const/high16 v16, 0x40400000    # 3.0f

    .line 498
    .line 499
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 506
    .line 507
    .line 508
    move-result-object v2

    .line 509
    const/16 v16, 0x3800

    .line 510
    .line 511
    const/16 v17, 0x0

    .line 512
    .line 513
    const/high16 v6, 0x3f800000    # 1.0f

    .line 514
    .line 515
    const/4 v7, 0x0

    .line 516
    const/high16 v12, 0x3f800000    # 1.0f

    .line 517
    .line 518
    const/4 v13, 0x0

    .line 519
    const/4 v14, 0x0

    .line 520
    const/4 v15, 0x0

    .line 521
    const-string v4, ""

    .line 522
    .line 523
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    sput-object v0, Landroidx/compose/material/icons/rounded/ThumbDownOffAltKt;->_thumbDownOffAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 532
    .line 533
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 534
    .line 535
    .line 536
    return-object v0
.end method
