.class public final Landroidx/compose/material/icons/twotone/RingVolumeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_ringVolume",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "RingVolume",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getRingVolume",
        "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nRingVolume.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RingVolume.kt\nandroidx/compose/material/icons/twotone/RingVolumeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,102:1\n212#2,12:103\n233#2,18:116\n253#2:153\n233#2,18:154\n253#2:191\n174#3:115\n705#4,2:134\n717#4,2:136\n719#4,11:142\n705#4,2:172\n717#4,2:174\n719#4,11:180\n72#5,4:138\n72#5,4:176\n*S KotlinDebug\n*F\n+ 1 RingVolume.kt\nandroidx/compose/material/icons/twotone/RingVolumeKt\n*L\n29#1:103,12\n30#1:116,18\n30#1:153\n44#1:154,18\n44#1:191\n29#1:115\n30#1:134,2\n30#1:136,2\n30#1:142,11\n44#1:172,2\n44#1:174,2\n44#1:180,11\n30#1:138,4\n44#1:176,4\n*E\n"
    }
.end annotation


# static fields
.field private static _ringVolume:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRingVolume(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/RingVolumeKt;->_ringVolume:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.RingVolume"

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
    const v4, 0x4194cccd    # 18.6f

    .line 71
    .line 72
    .line 73
    const v6, 0x4189c28f    # 17.22f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, 0x3fef5c29    # 1.87f

    .line 80
    .line 81
    .line 82
    const v26, 0x3fa28f5c    # 1.27f

    .line 83
    .line 84
    .line 85
    const v21, 0x3f28f5c3    # 0.66f

    .line 86
    .line 87
    .line 88
    const v22, 0x3ebd70a4    # 0.37f

    .line 89
    .line 90
    .line 91
    const v23, 0x3fa3d70a    # 1.28f

    .line 92
    .line 93
    .line 94
    const v24, 0x3f4a3d71    # 0.79f

    .line 95
    .line 96
    .line 97
    move-object/from16 v20, v2

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v4, 0x3f88f5c3    # 1.07f

    .line 103
    .line 104
    .line 105
    const v6, -0x40770a3d    # -1.07f

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v25, -0x3fc3d70a    # -2.94f

    .line 112
    .line 113
    .line 114
    const v26, -0x400ccccd    # -1.9f

    .line 115
    .line 116
    .line 117
    const v21, -0x40970a3d    # -0.91f

    .line 118
    .line 119
    .line 120
    const/high16 v22, -0x40c00000    # -0.75f

    .line 121
    .line 122
    const v23, -0x400ccccd    # -1.9f

    .line 123
    .line 124
    .line 125
    const v24, -0x404f5c29    # -1.38f

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v4, 0x3fd9999a    # 1.7f

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v4, 0x4061eb85    # 3.53f

    .line 141
    .line 142
    .line 143
    const/high16 v6, 0x41940000    # 18.5f

    .line 144
    .line 145
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v25, 0x3fef5c29    # 1.87f

    .line 149
    .line 150
    .line 151
    const v26, -0x405d70a4    # -1.27f

    .line 152
    .line 153
    .line 154
    const v21, 0x3f147ae1    # 0.58f

    .line 155
    .line 156
    .line 157
    const v22, -0x410f5c29    # -0.47f

    .line 158
    .line 159
    .line 160
    const v23, 0x3f9ae148    # 1.21f

    .line 161
    .line 162
    .line 163
    const v24, -0x409c28f6    # -0.89f

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v4, -0x40251eb8    # -1.71f

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v25, -0x3fc33333    # -2.95f

    .line 176
    .line 177
    .line 178
    const v26, 0x3ff33333    # 1.9f

    .line 179
    .line 180
    .line 181
    const v21, -0x4079999a    # -1.05f

    .line 182
    .line 183
    .line 184
    const v22, 0x3f028f5c    # 0.51f

    .line 185
    .line 186
    .line 187
    const v23, -0x3ffe147b    # -2.03f

    .line 188
    .line 189
    .line 190
    const v24, 0x3f933333    # 1.15f

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v4, 0x3f8a3d71    # 1.08f

    .line 197
    .line 198
    .line 199
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    const/16 v16, 0x3800

    .line 210
    .line 211
    const/16 v17, 0x0

    .line 212
    .line 213
    const v6, 0x3e99999a    # 0.3f

    .line 214
    .line 215
    .line 216
    const v8, 0x3e99999a    # 0.3f

    .line 217
    .line 218
    .line 219
    const/4 v7, 0x0

    .line 220
    const/high16 v9, 0x3f800000    # 1.0f

    .line 221
    .line 222
    const/high16 v12, 0x3f800000    # 1.0f

    .line 223
    .line 224
    const/4 v13, 0x0

    .line 225
    const/4 v14, 0x0

    .line 226
    const/4 v15, 0x0

    .line 227
    const-string v4, ""

    .line 228
    .line 229
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 230
    .line 231
    .line 232
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 233
    .line 234
    .line 235
    move-result v3

    .line 236
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 237
    .line 238
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 239
    .line 240
    .line 241
    move-result-wide v6

    .line 242
    const/4 v0, 0x0

    .line 243
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 247
    .line 248
    .line 249
    move-result v10

    .line 250
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 251
    .line 252
    .line 253
    move-result v11

    .line 254
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 257
    .line 258
    .line 259
    const/high16 v0, 0x41400000    # 12.0f

    .line 260
    .line 261
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v17, 0x3e947ae1    # 0.29f

    .line 265
    .line 266
    .line 267
    const v18, 0x41855c29    # 16.67f

    .line 268
    .line 269
    .line 270
    const v13, 0x40eeb852    # 7.46f

    .line 271
    .line 272
    .line 273
    const/high16 v14, 0x41400000    # 12.0f

    .line 274
    .line 275
    const v15, 0x4055c28f    # 3.34f

    .line 276
    .line 277
    .line 278
    const v16, 0x415c7ae1    # 13.78f

    .line 279
    .line 280
    .line 281
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v17, -0x416b851f    # -0.29f

    .line 285
    .line 286
    .line 287
    const v18, 0x3f35c28f    # 0.71f

    .line 288
    .line 289
    .line 290
    const v13, -0x41c7ae14    # -0.18f

    .line 291
    .line 292
    .line 293
    const v14, 0x3e3851ec    # 0.18f

    .line 294
    .line 295
    .line 296
    const v15, -0x416b851f    # -0.29f

    .line 297
    .line 298
    .line 299
    const v16, 0x3edc28f6    # 0.43f

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v17, 0x3e947ae1    # 0.29f

    .line 306
    .line 307
    .line 308
    const/4 v13, 0x0

    .line 309
    const v14, 0x3e8f5c29    # 0.28f

    .line 310
    .line 311
    .line 312
    const v15, 0x3de147ae    # 0.11f

    .line 313
    .line 314
    .line 315
    const v16, 0x3f07ae14    # 0.53f

    .line 316
    .line 317
    .line 318
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v0, 0x401eb852    # 2.48f

    .line 322
    .line 323
    .line 324
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v17, 0x3f35c28f    # 0.71f

    .line 328
    .line 329
    .line 330
    const v18, 0x3e947ae1    # 0.29f

    .line 331
    .line 332
    .line 333
    const v13, 0x3e3851ec    # 0.18f

    .line 334
    .line 335
    .line 336
    const v14, 0x3e3851ec    # 0.18f

    .line 337
    .line 338
    .line 339
    const v15, 0x3edc28f6    # 0.43f

    .line 340
    .line 341
    .line 342
    const v16, 0x3e947ae1    # 0.29f

    .line 343
    .line 344
    .line 345
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v17, 0x3f333333    # 0.7f

    .line 349
    .line 350
    .line 351
    const v18, -0x4170a3d7    # -0.28f

    .line 352
    .line 353
    .line 354
    const v13, 0x3e8a3d71    # 0.27f

    .line 355
    .line 356
    .line 357
    const/4 v14, 0x0

    .line 358
    const v15, 0x3f051eb8    # 0.52f

    .line 359
    .line 360
    .line 361
    const v16, -0x421eb852    # -0.11f

    .line 362
    .line 363
    .line 364
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v17, 0x402a3d71    # 2.66f

    .line 368
    .line 369
    .line 370
    const v18, -0x40133333    # -1.85f

    .line 371
    .line 372
    .line 373
    const v13, 0x3f4a3d71    # 0.79f

    .line 374
    .line 375
    .line 376
    const v14, -0x40c28f5c    # -0.74f

    .line 377
    .line 378
    .line 379
    const v15, 0x3fd851ec    # 1.69f

    .line 380
    .line 381
    .line 382
    const v16, -0x4051eb85    # -1.36f

    .line 383
    .line 384
    .line 385
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v17, 0x3f0f5c29    # 0.56f

    .line 389
    .line 390
    .line 391
    const v18, -0x4099999a    # -0.9f

    .line 392
    .line 393
    .line 394
    const v13, 0x3ea8f5c3    # 0.33f

    .line 395
    .line 396
    .line 397
    const v14, -0x41dc28f6    # -0.16f

    .line 398
    .line 399
    .line 400
    const v15, 0x3f0f5c29    # 0.56f

    .line 401
    .line 402
    .line 403
    const/high16 v16, -0x41000000    # -0.5f

    .line 404
    .line 405
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v0, -0x3fb9999a    # -3.1f

    .line 409
    .line 410
    .line 411
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v17, 0x40933333    # 4.6f

    .line 415
    .line 416
    .line 417
    const v18, -0x40c51eb8    # -0.73f

    .line 418
    .line 419
    .line 420
    const v13, 0x3fb9999a    # 1.45f

    .line 421
    .line 422
    .line 423
    const v14, -0x410a3d71    # -0.48f

    .line 424
    .line 425
    .line 426
    const/high16 v15, 0x40400000    # 3.0f

    .line 427
    .line 428
    const v16, -0x40c51eb8    # -0.73f

    .line 429
    .line 430
    .line 431
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const v18, 0x3f3851ec    # 0.72f

    .line 435
    .line 436
    .line 437
    const v13, 0x3fcccccd    # 1.6f

    .line 438
    .line 439
    .line 440
    const/4 v14, 0x0

    .line 441
    const v15, 0x4049999a    # 3.15f

    .line 442
    .line 443
    .line 444
    const/high16 v16, 0x3e800000    # 0.25f

    .line 445
    .line 446
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v0, 0x40466666    # 3.1f

    .line 450
    .line 451
    .line 452
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const v17, 0x3f0f5c29    # 0.56f

    .line 456
    .line 457
    .line 458
    const v18, 0x3f666666    # 0.9f

    .line 459
    .line 460
    .line 461
    const/4 v13, 0x0

    .line 462
    const v14, 0x3ec7ae14    # 0.39f

    .line 463
    .line 464
    .line 465
    const v15, 0x3e6b851f    # 0.23f

    .line 466
    .line 467
    .line 468
    const v16, 0x3f3d70a4    # 0.74f

    .line 469
    .line 470
    .line 471
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v17, 0x402a3d71    # 2.66f

    .line 475
    .line 476
    .line 477
    const v18, 0x3feccccd    # 1.85f

    .line 478
    .line 479
    .line 480
    const v13, 0x3f7ae148    # 0.98f

    .line 481
    .line 482
    .line 483
    const v14, 0x3efae148    # 0.49f

    .line 484
    .line 485
    .line 486
    const v15, 0x3fef5c29    # 1.87f

    .line 487
    .line 488
    .line 489
    const v16, 0x3f8f5c29    # 1.12f

    .line 490
    .line 491
    .line 492
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const v17, 0x3f333333    # 0.7f

    .line 496
    .line 497
    .line 498
    const v18, 0x3e8f5c29    # 0.28f

    .line 499
    .line 500
    .line 501
    const v13, 0x3e3851ec    # 0.18f

    .line 502
    .line 503
    .line 504
    const v14, 0x3e3851ec    # 0.18f

    .line 505
    .line 506
    .line 507
    const v15, 0x3edc28f6    # 0.43f

    .line 508
    .line 509
    .line 510
    const v16, 0x3e8f5c29    # 0.28f

    .line 511
    .line 512
    .line 513
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const v17, 0x3f35c28f    # 0.71f

    .line 517
    .line 518
    .line 519
    const v18, -0x416b851f    # -0.29f

    .line 520
    .line 521
    .line 522
    const v13, 0x3e8f5c29    # 0.28f

    .line 523
    .line 524
    .line 525
    const/4 v14, 0x0

    .line 526
    const v15, 0x3f07ae14    # 0.53f

    .line 527
    .line 528
    .line 529
    const v16, -0x421eb852    # -0.11f

    .line 530
    .line 531
    .line 532
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const v0, -0x3fe147ae    # -2.48f

    .line 536
    .line 537
    .line 538
    const v2, 0x401eb852    # 2.48f

    .line 539
    .line 540
    .line 541
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const v17, 0x3e947ae1    # 0.29f

    .line 545
    .line 546
    .line 547
    const v18, -0x40ca3d71    # -0.71f

    .line 548
    .line 549
    .line 550
    const v13, 0x3e3851ec    # 0.18f

    .line 551
    .line 552
    .line 553
    const v14, -0x41c7ae14    # -0.18f

    .line 554
    .line 555
    .line 556
    const v15, 0x3e947ae1    # 0.29f

    .line 557
    .line 558
    .line 559
    const v16, -0x4123d70a    # -0.43f

    .line 560
    .line 561
    .line 562
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const v17, -0x416b851f    # -0.29f

    .line 566
    .line 567
    .line 568
    const v18, -0x40cccccd    # -0.7f

    .line 569
    .line 570
    .line 571
    const/4 v13, 0x0

    .line 572
    const v14, -0x4175c28f    # -0.27f

    .line 573
    .line 574
    .line 575
    const v15, -0x421eb852    # -0.11f

    .line 576
    .line 577
    .line 578
    const v16, -0x40fae148    # -0.52f

    .line 579
    .line 580
    .line 581
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const/high16 v17, 0x41400000    # 12.0f

    .line 585
    .line 586
    const/high16 v18, 0x41400000    # 12.0f

    .line 587
    .line 588
    const v13, 0x41a547ae    # 20.66f

    .line 589
    .line 590
    .line 591
    const v14, 0x415c7ae1    # 13.78f

    .line 592
    .line 593
    .line 594
    const v15, 0x418451ec    # 16.54f

    .line 595
    .line 596
    .line 597
    const/high16 v16, 0x41400000    # 12.0f

    .line 598
    .line 599
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const v0, 0x40accccd    # 5.4f

    .line 606
    .line 607
    .line 608
    const v2, 0x4189d70a    # 17.23f

    .line 609
    .line 610
    .line 611
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const v17, -0x4010a3d7    # -1.87f

    .line 615
    .line 616
    .line 617
    const v18, 0x3fa28f5c    # 1.27f

    .line 618
    .line 619
    .line 620
    const v13, -0x40d70a3d    # -0.66f

    .line 621
    .line 622
    .line 623
    const v14, 0x3ebd70a4    # 0.37f

    .line 624
    .line 625
    .line 626
    const v15, -0x405ae148    # -1.29f

    .line 627
    .line 628
    .line 629
    const v16, 0x3f4ccccd    # 0.8f

    .line 630
    .line 631
    .line 632
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const v0, -0x40770a3d    # -1.07f

    .line 636
    .line 637
    .line 638
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const v17, 0x403ccccd    # 2.95f

    .line 642
    .line 643
    .line 644
    const v18, -0x400ccccd    # -1.9f

    .line 645
    .line 646
    .line 647
    const v13, 0x3f68f5c3    # 0.91f

    .line 648
    .line 649
    .line 650
    const/high16 v14, -0x40c00000    # -0.75f

    .line 651
    .line 652
    const v15, 0x3ff33333    # 1.9f

    .line 653
    .line 654
    .line 655
    const v16, -0x404e147b    # -1.39f

    .line 656
    .line 657
    .line 658
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const v0, 0x3fd9999a    # 1.7f

    .line 662
    .line 663
    .line 664
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const v0, 0x41a3c28f    # 20.47f

    .line 671
    .line 672
    .line 673
    const v2, 0x4193eb85    # 18.49f

    .line 674
    .line 675
    .line 676
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    const v17, -0x4010a3d7    # -1.87f

    .line 680
    .line 681
    .line 682
    const v18, -0x405d70a4    # -1.27f

    .line 683
    .line 684
    .line 685
    const v13, -0x40e8f5c3    # -0.59f

    .line 686
    .line 687
    .line 688
    const v14, -0x410a3d71    # -0.48f

    .line 689
    .line 690
    .line 691
    const v15, -0x40651eb8    # -1.21f

    .line 692
    .line 693
    .line 694
    const v16, -0x4099999a    # -0.9f

    .line 695
    .line 696
    .line 697
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    const v0, -0x40266666    # -1.7f

    .line 701
    .line 702
    .line 703
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    const v17, 0x403c28f6    # 2.94f

    .line 707
    .line 708
    .line 709
    const v18, 0x3ff33333    # 1.9f

    .line 710
    .line 711
    .line 712
    const v13, 0x3f851eb8    # 1.04f

    .line 713
    .line 714
    .line 715
    const v14, 0x3f028f5c    # 0.51f

    .line 716
    .line 717
    .line 718
    const v15, 0x4001eb85    # 2.03f

    .line 719
    .line 720
    .line 721
    const v16, 0x3f933333    # 1.15f

    .line 722
    .line 723
    .line 724
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    const v0, 0x3f88f5c3    # 1.07f

    .line 728
    .line 729
    .line 730
    const v2, -0x40770a3d    # -1.07f

    .line 731
    .line 732
    .line 733
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 734
    .line 735
    .line 736
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 737
    .line 738
    .line 739
    const v0, 0x4181851f    # 16.19f

    .line 740
    .line 741
    .line 742
    const v2, 0x41066666    # 8.4f

    .line 743
    .line 744
    .line 745
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 746
    .line 747
    .line 748
    const v0, 0x3fb47ae1    # 1.41f

    .line 749
    .line 750
    .line 751
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 752
    .line 753
    .line 754
    const v0, 0x4063d70a    # 3.56f

    .line 755
    .line 756
    .line 757
    const v2, -0x3f9ccccd    # -3.55f

    .line 758
    .line 759
    .line 760
    const v4, 0x405ccccd    # 3.45f

    .line 761
    .line 762
    .line 763
    const v6, -0x3f9eb852    # -3.52f

    .line 764
    .line 765
    .line 766
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 767
    .line 768
    .line 769
    const v0, -0x404b851f    # -1.41f

    .line 770
    .line 771
    .line 772
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 773
    .line 774
    .line 775
    const v0, -0x3f9c28f6    # -3.56f

    .line 776
    .line 777
    .line 778
    const v2, 0x40633333    # 3.55f

    .line 779
    .line 780
    .line 781
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 782
    .line 783
    .line 784
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 785
    .line 786
    .line 787
    const/high16 v0, 0x41300000    # 11.0f

    .line 788
    .line 789
    const/high16 v2, 0x40000000    # 2.0f

    .line 790
    .line 791
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 792
    .line 793
    .line 794
    const/high16 v0, 0x40000000    # 2.0f

    .line 795
    .line 796
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 797
    .line 798
    .line 799
    const/high16 v0, 0x40a00000    # 5.0f

    .line 800
    .line 801
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 802
    .line 803
    .line 804
    const/high16 v0, -0x40000000    # -2.0f

    .line 805
    .line 806
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 807
    .line 808
    .line 809
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 810
    .line 811
    .line 812
    const v0, 0x40cccccd    # 6.4f

    .line 813
    .line 814
    .line 815
    const v2, 0x411cf5c3    # 9.81f

    .line 816
    .line 817
    .line 818
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 819
    .line 820
    .line 821
    const v0, 0x40f9eb85    # 7.81f

    .line 822
    .line 823
    .line 824
    const v2, 0x41066666    # 8.4f

    .line 825
    .line 826
    .line 827
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 828
    .line 829
    .line 830
    const v0, 0x408851ec    # 4.26f

    .line 831
    .line 832
    .line 833
    const v2, 0x409ae148    # 4.84f

    .line 834
    .line 835
    .line 836
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 837
    .line 838
    .line 839
    const v0, 0x4035c28f    # 2.84f

    .line 840
    .line 841
    .line 842
    const v2, 0x40c851ec    # 6.26f

    .line 843
    .line 844
    .line 845
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 846
    .line 847
    .line 848
    const v17, 0x4063d70a    # 3.56f

    .line 849
    .line 850
    .line 851
    const v18, 0x40633333    # 3.55f

    .line 852
    .line 853
    .line 854
    const v13, 0x3de147ae    # 0.11f

    .line 855
    .line 856
    .line 857
    const v14, 0x3cf5c28f    # 0.03f

    .line 858
    .line 859
    .line 860
    const v15, 0x4063d70a    # 3.56f

    .line 861
    .line 862
    .line 863
    const v16, 0x40633333    # 3.55f

    .line 864
    .line 865
    .line 866
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 867
    .line 868
    .line 869
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 870
    .line 871
    .line 872
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 873
    .line 874
    .line 875
    move-result-object v2

    .line 876
    const/16 v16, 0x3800

    .line 877
    .line 878
    const/16 v17, 0x0

    .line 879
    .line 880
    const/high16 v6, 0x3f800000    # 1.0f

    .line 881
    .line 882
    const/high16 v8, 0x3f800000    # 1.0f

    .line 883
    .line 884
    const/4 v7, 0x0

    .line 885
    const/high16 v12, 0x3f800000    # 1.0f

    .line 886
    .line 887
    const/4 v13, 0x0

    .line 888
    const/4 v14, 0x0

    .line 889
    const/4 v15, 0x0

    .line 890
    const-string v4, ""

    .line 891
    .line 892
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 893
    .line 894
    .line 895
    move-result-object v0

    .line 896
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 897
    .line 898
    .line 899
    move-result-object v0

    .line 900
    sput-object v0, Landroidx/compose/material/icons/twotone/RingVolumeKt;->_ringVolume:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 901
    .line 902
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 903
    .line 904
    .line 905
    return-object v0
.end method
