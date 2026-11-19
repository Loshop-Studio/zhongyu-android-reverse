.class public final Landroidx/compose/material/icons/outlined/TranscribeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_transcribe",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Transcribe",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getTranscribe",
        "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nTranscribe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transcribe.kt\nandroidx/compose/material/icons/outlined/TranscribeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,79:1\n212#2,12:80\n233#2,18:93\n253#2:130\n174#3:92\n705#4,2:111\n717#4,2:113\n719#4,11:119\n72#5,4:115\n*S KotlinDebug\n*F\n+ 1 Transcribe.kt\nandroidx/compose/material/icons/outlined/TranscribeKt\n*L\n29#1:80,12\n30#1:93,18\n30#1:130\n29#1:92\n30#1:111,2\n30#1:113,2\n30#1:119,11\n30#1:115,4\n*E\n"
    }
.end annotation


# static fields
.field private static _transcribe:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTranscribe(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/TranscribeKt;->_transcribe:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Transcribe"

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
    const/4 v0, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v0, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v0, 0x41500000    # 13.0f

    .line 71
    .line 72
    const/high16 v2, 0x41100000    # 9.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x40800000    # 4.0f

    .line 78
    .line 79
    const/high16 v18, -0x3f800000    # -4.0f

    .line 80
    .line 81
    const v13, 0x400d70a4    # 2.21f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, 0x40800000    # 4.0f

    .line 86
    .line 87
    const v16, -0x401ae148    # -1.79f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v17, -0x3f800000    # -4.0f

    .line 94
    .line 95
    const/4 v13, 0x0

    .line 96
    const v14, -0x3ff28f5c    # -2.21f

    .line 97
    .line 98
    .line 99
    const v15, -0x401ae148    # -1.79f

    .line 100
    .line 101
    .line 102
    const/high16 v16, -0x3f800000    # -4.0f

    .line 103
    .line 104
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const v0, 0x40d947ae    # 6.79f

    .line 108
    .line 109
    .line 110
    const/high16 v2, 0x40a00000    # 5.0f

    .line 111
    .line 112
    const/high16 v4, 0x41100000    # 9.0f

    .line 113
    .line 114
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v17, 0x41100000    # 9.0f

    .line 118
    .line 119
    const/high16 v18, 0x41500000    # 13.0f

    .line 120
    .line 121
    const/high16 v13, 0x40a00000    # 5.0f

    .line 122
    .line 123
    const v14, 0x41335c29    # 11.21f

    .line 124
    .line 125
    .line 126
    const v15, 0x40d947ae    # 6.79f

    .line 127
    .line 128
    .line 129
    const/high16 v16, 0x41500000    # 13.0f

    .line 130
    .line 131
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v0, 0x40e00000    # 7.0f

    .line 138
    .line 139
    const/high16 v2, 0x41100000    # 9.0f

    .line 140
    .line 141
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v17, 0x40000000    # 2.0f

    .line 145
    .line 146
    const/high16 v18, 0x40000000    # 2.0f

    .line 147
    .line 148
    const v13, 0x3f8ccccd    # 1.1f

    .line 149
    .line 150
    .line 151
    const/4 v14, 0x0

    .line 152
    const/high16 v15, 0x40000000    # 2.0f

    .line 153
    .line 154
    const v16, 0x3f666666    # 0.9f

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const/high16 v17, -0x40000000    # -2.0f

    .line 161
    .line 162
    const/4 v13, 0x0

    .line 163
    const v14, 0x3f8ccccd    # 1.1f

    .line 164
    .line 165
    .line 166
    const v15, -0x4099999a    # -0.9f

    .line 167
    .line 168
    .line 169
    const/high16 v16, 0x40000000    # 2.0f

    .line 170
    .line 171
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v0, -0x4099999a    # -0.9f

    .line 175
    .line 176
    .line 177
    const/high16 v2, -0x40000000    # -2.0f

    .line 178
    .line 179
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/high16 v17, 0x41100000    # 9.0f

    .line 183
    .line 184
    const/high16 v18, 0x40e00000    # 7.0f

    .line 185
    .line 186
    const/high16 v13, 0x40e00000    # 7.0f

    .line 187
    .line 188
    const v14, 0x40fccccd    # 7.9f

    .line 189
    .line 190
    .line 191
    const v15, 0x40fccccd    # 7.9f

    .line 192
    .line 193
    .line 194
    const/high16 v16, 0x40e00000    # 7.0f

    .line 195
    .line 196
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v0, 0x41763d71    # 15.39f

    .line 203
    .line 204
    .line 205
    const v2, 0x4178f5c3    # 15.56f

    .line 206
    .line 207
    .line 208
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v18, 0x41600000    # 14.0f

    .line 212
    .line 213
    const v13, 0x415b5c29    # 13.71f

    .line 214
    .line 215
    .line 216
    const v14, 0x416b3333    # 14.7f

    .line 217
    .line 218
    .line 219
    const v15, 0x41387ae1    # 11.53f

    .line 220
    .line 221
    .line 222
    const/high16 v16, 0x41600000    # 14.0f

    .line 223
    .line 224
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v17, -0x3f33851f    # -6.39f

    .line 228
    .line 229
    .line 230
    const v18, 0x3fc7ae14    # 1.56f

    .line 231
    .line 232
    .line 233
    const v13, -0x3fde147b    # -2.53f

    .line 234
    .line 235
    .line 236
    const/4 v14, 0x0

    .line 237
    const v15, -0x3f6947ae    # -4.71f

    .line 238
    .line 239
    .line 240
    const v16, 0x3f333333    # 0.7f

    .line 241
    .line 242
    .line 243
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/high16 v17, 0x3f800000    # 1.0f

    .line 247
    .line 248
    const v18, 0x4191c28f    # 18.22f

    .line 249
    .line 250
    .line 251
    const v13, 0x3fce147b    # 1.61f

    .line 252
    .line 253
    .line 254
    const v14, 0x41808f5c    # 16.07f

    .line 255
    .line 256
    .line 257
    const/high16 v15, 0x3f800000    # 1.0f

    .line 258
    .line 259
    const v16, 0x4188cccd    # 17.1f

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v0, 0x41a80000    # 21.0f

    .line 266
    .line 267
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v0, 0x41800000    # 16.0f

    .line 271
    .line 272
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v0, -0x3fce147b    # -2.78f

    .line 276
    .line 277
    .line 278
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v17, 0x41763d71    # 15.39f

    .line 282
    .line 283
    .line 284
    const v18, 0x4178f5c3    # 15.56f

    .line 285
    .line 286
    .line 287
    const/high16 v13, 0x41880000    # 17.0f

    .line 288
    .line 289
    const v14, 0x4188cccd    # 17.1f

    .line 290
    .line 291
    .line 292
    const v15, 0x41831eb8    # 16.39f

    .line 293
    .line 294
    .line 295
    const v16, 0x41808f5c    # 16.07f

    .line 296
    .line 297
    .line 298
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/high16 v0, 0x41700000    # 15.0f

    .line 305
    .line 306
    const/high16 v2, 0x41980000    # 19.0f

    .line 307
    .line 308
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const/high16 v0, 0x40400000    # 3.0f

    .line 312
    .line 313
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v0, -0x40b851ec    # -0.78f

    .line 317
    .line 318
    .line 319
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v17, 0x3f051eb8    # 0.52f

    .line 323
    .line 324
    .line 325
    const v18, -0x409eb852    # -0.88f

    .line 326
    .line 327
    .line 328
    const/4 v13, 0x0

    .line 329
    const v14, -0x413d70a4    # -0.38f

    .line 330
    .line 331
    .line 332
    const v15, 0x3e4ccccd    # 0.2f

    .line 333
    .line 334
    .line 335
    const v16, -0x40c7ae14    # -0.72f

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const/high16 v17, 0x41100000    # 9.0f

    .line 342
    .line 343
    const/high16 v18, 0x41800000    # 16.0f

    .line 344
    .line 345
    const v13, 0x4096b852    # 4.71f

    .line 346
    .line 347
    .line 348
    const v14, 0x4185d70a    # 16.73f

    .line 349
    .line 350
    .line 351
    const v15, 0x40d428f6    # 6.63f

    .line 352
    .line 353
    .line 354
    const/high16 v16, 0x41800000    # 16.0f

    .line 355
    .line 356
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v17, 0x40af5c29    # 5.48f

    .line 360
    .line 361
    .line 362
    const v18, 0x3fab851f    # 1.34f

    .line 363
    .line 364
    .line 365
    const v13, 0x4017ae14    # 2.37f

    .line 366
    .line 367
    .line 368
    const/4 v14, 0x0

    .line 369
    const v15, 0x408947ae    # 4.29f

    .line 370
    .line 371
    .line 372
    const v16, 0x3f3ae148    # 0.73f

    .line 373
    .line 374
    .line 375
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v17, 0x41700000    # 15.0f

    .line 379
    .line 380
    const v18, 0x4191c28f    # 18.22f

    .line 381
    .line 382
    .line 383
    const v13, 0x416ccccd    # 14.8f

    .line 384
    .line 385
    .line 386
    const/high16 v14, 0x418c0000    # 17.5f

    .line 387
    .line 388
    const/high16 v15, 0x41700000    # 15.0f

    .line 389
    .line 390
    const v16, 0x418eb852    # 17.84f

    .line 391
    .line 392
    .line 393
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v0, 0x41980000    # 19.0f

    .line 397
    .line 398
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v0, 0x418f70a4    # 17.93f

    .line 405
    .line 406
    .line 407
    const/high16 v2, 0x41800000    # 16.0f

    .line 408
    .line 409
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v0, 0x3fd0a3d7    # 1.63f

    .line 413
    .line 414
    .line 415
    const v2, -0x402f5c29    # -1.63f

    .line 416
    .line 417
    .line 418
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/16 v17, 0x0

    .line 422
    .line 423
    const v18, -0x3ed428f6    # -10.74f

    .line 424
    .line 425
    .line 426
    const v13, -0x3fceb852    # -2.77f

    .line 427
    .line 428
    .line 429
    const v14, -0x3fbeb852    # -3.02f

    .line 430
    .line 431
    .line 432
    const v15, -0x3fceb852    # -2.77f

    .line 433
    .line 434
    .line 435
    const v16, -0x3f0e147b    # -7.56f

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v0, 0x40000000    # 2.0f

    .line 442
    .line 443
    const v2, 0x418f70a4    # 17.93f

    .line 444
    .line 445
    .line 446
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v17, 0x418f70a4    # 17.93f

    .line 450
    .line 451
    .line 452
    const/high16 v18, 0x41800000    # 16.0f

    .line 453
    .line 454
    const v13, 0x41607ae1    # 14.03f

    .line 455
    .line 456
    .line 457
    const v14, 0x40bc7ae1    # 5.89f

    .line 458
    .line 459
    .line 460
    const v15, 0x416051ec    # 14.02f

    .line 461
    .line 462
    .line 463
    const v16, 0x413f3333    # 11.95f

    .line 464
    .line 465
    .line 466
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v0, 0x412f3333    # 10.95f

    .line 473
    .line 474
    .line 475
    const v2, 0x41b75c29    # 22.92f

    .line 476
    .line 477
    .line 478
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const/16 v17, 0x0

    .line 482
    .line 483
    const v18, -0x3f870a3d    # -3.89f

    .line 484
    .line 485
    .line 486
    const v13, -0x40a8f5c3    # -0.84f

    .line 487
    .line 488
    .line 489
    const v14, -0x4068f5c3    # -1.18f

    .line 490
    .line 491
    .line 492
    const v15, -0x40a8f5c3    # -0.84f

    .line 493
    .line 494
    .line 495
    const v16, -0x3fd28f5c    # -2.71f

    .line 496
    .line 497
    .line 498
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const v0, -0x4028f5c3    # -1.68f

    .line 502
    .line 503
    .line 504
    const v2, -0x4027ae14    # -1.69f

    .line 505
    .line 506
    .line 507
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const v18, 0x40e8a3d7    # 7.27f

    .line 511
    .line 512
    .line 513
    const v13, -0x3ffeb852    # -2.02f

    .line 514
    .line 515
    .line 516
    const v14, 0x400147ae    # 2.02f

    .line 517
    .line 518
    .line 519
    const v15, -0x3ffeb852    # -2.02f

    .line 520
    .line 521
    .line 522
    const v16, 0x40a23d71    # 5.07f

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const v0, 0x412f3333    # 10.95f

    .line 529
    .line 530
    .line 531
    const v2, 0x41b75c29    # 22.92f

    .line 532
    .line 533
    .line 534
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 541
    .line 542
    .line 543
    move-result-object v2

    .line 544
    const/16 v16, 0x3800

    .line 545
    .line 546
    const/16 v17, 0x0

    .line 547
    .line 548
    const/high16 v6, 0x3f800000    # 1.0f

    .line 549
    .line 550
    const/high16 v8, 0x3f800000    # 1.0f

    .line 551
    .line 552
    const/4 v7, 0x0

    .line 553
    const/high16 v9, 0x3f800000    # 1.0f

    .line 554
    .line 555
    const/high16 v12, 0x3f800000    # 1.0f

    .line 556
    .line 557
    const/4 v13, 0x0

    .line 558
    const/4 v14, 0x0

    .line 559
    const/4 v15, 0x0

    .line 560
    const-string v4, ""

    .line 561
    .line 562
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 563
    .line 564
    .line 565
    move-result-object v0

    .line 566
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 567
    .line 568
    .line 569
    move-result-object v0

    .line 570
    sput-object v0, Landroidx/compose/material/icons/outlined/TranscribeKt;->_transcribe:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 571
    .line 572
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 573
    .line 574
    .line 575
    return-object v0
.end method
