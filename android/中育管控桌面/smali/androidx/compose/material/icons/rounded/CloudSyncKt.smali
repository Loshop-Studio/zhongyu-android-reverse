.class public final Landroidx/compose/material/icons/rounded/CloudSyncKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_cloudSync",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "CloudSync",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getCloudSync",
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
        "SMAP\nCloudSync.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloudSync.kt\nandroidx/compose/material/icons/rounded/CloudSyncKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,78:1\n212#2,12:79\n233#2,18:92\n253#2:129\n174#3:91\n705#4,2:110\n717#4,2:112\n719#4,11:118\n72#5,4:114\n*S KotlinDebug\n*F\n+ 1 CloudSync.kt\nandroidx/compose/material/icons/rounded/CloudSyncKt\n*L\n29#1:79,12\n30#1:92,18\n30#1:129\n29#1:91\n30#1:110,2\n30#1:112,2\n30#1:118,11\n30#1:114,4\n*E\n"
    }
.end annotation


# static fields
.field private static _cloudSync:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCloudSync(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/CloudSyncKt;->_cloudSync:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.CloudSync"

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
    const v0, 0x418bd70a    # 17.48f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41c00000    # 24.0f

    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 79
    .line 80
    const/high16 v18, 0x40200000    # 2.5f

    .line 81
    .line 82
    const/4 v13, 0x0

    .line 83
    const v14, 0x3fb0a3d7    # 1.38f

    .line 84
    .line 85
    .line 86
    const v15, -0x4070a3d7    # -1.12f

    .line 87
    .line 88
    .line 89
    const/high16 v16, 0x40200000    # 2.5f

    .line 90
    .line 91
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/high16 v0, 0x41a00000    # 20.0f

    .line 95
    .line 96
    const/high16 v2, 0x41700000    # 15.0f

    .line 97
    .line 98
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 102
    .line 103
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 104
    .line 105
    const v13, -0x402b851f    # -1.66f

    .line 106
    .line 107
    .line 108
    const/4 v14, 0x0

    .line 109
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 110
    .line 111
    const v16, -0x40547ae1    # -1.34f

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v17, 0x4035c28f    # 2.84f

    .line 118
    .line 119
    .line 120
    const v18, -0x3fc147ae    # -2.98f

    .line 121
    .line 122
    .line 123
    const/4 v13, 0x0

    .line 124
    const v14, -0x40333333    # -1.6f

    .line 125
    .line 126
    .line 127
    const v15, 0x3fa147ae    # 1.26f

    .line 128
    .line 129
    .line 130
    const v16, -0x3fc66666    # -2.9f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v17, 0x41900000    # 18.0f

    .line 137
    .line 138
    const/high16 v18, 0x41400000    # 12.0f

    .line 139
    .line 140
    const v13, 0x41766666    # 15.4f

    .line 141
    .line 142
    .line 143
    const v14, 0x414d47ae    # 12.83f

    .line 144
    .line 145
    .line 146
    const v15, 0x4184cccd    # 16.6f

    .line 147
    .line 148
    .line 149
    const/high16 v16, 0x41400000    # 12.0f

    .line 150
    .line 151
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v17, 0x405ccccd    # 3.45f

    .line 155
    .line 156
    .line 157
    const v18, 0x403f5c29    # 2.99f

    .line 158
    .line 159
    .line 160
    const v13, 0x3fe147ae    # 1.76f

    .line 161
    .line 162
    .line 163
    const/4 v14, 0x0

    .line 164
    const v15, 0x404ccccd    # 3.2f

    .line 165
    .line 166
    .line 167
    const v16, 0x3fa66666    # 1.3f

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v17, 0x3d4ccccd    # 0.05f

    .line 174
    .line 175
    .line 176
    const v18, -0x43dc28f6    # -0.01f

    .line 177
    .line 178
    .line 179
    const v13, 0x3ca3d70a    # 0.02f

    .line 180
    .line 181
    .line 182
    const v15, 0x3cf5c28f    # 0.03f

    .line 183
    .line 184
    .line 185
    const v16, -0x43dc28f6    # -0.01f

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const/high16 v17, 0x41c00000    # 24.0f

    .line 192
    .line 193
    const v18, 0x418bd70a    # 17.48f

    .line 194
    .line 195
    .line 196
    const v13, 0x41b70a3d    # 22.88f

    .line 197
    .line 198
    .line 199
    const v14, 0x416fae14    # 14.98f

    .line 200
    .line 201
    .line 202
    const/high16 v15, 0x41c00000    # 24.0f

    .line 203
    .line 204
    const v16, 0x4180cccd    # 16.1f

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v0, 0x41200000    # 10.0f

    .line 214
    .line 215
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const/high16 v17, -0x40800000    # -1.0f

    .line 219
    .line 220
    const/high16 v18, -0x40800000    # -1.0f

    .line 221
    .line 222
    const/4 v13, 0x0

    .line 223
    const v14, -0x40f33333    # -0.55f

    .line 224
    .line 225
    .line 226
    const v15, -0x4119999a    # -0.45f

    .line 227
    .line 228
    .line 229
    const/high16 v16, -0x40800000    # -1.0f

    .line 230
    .line 231
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v0, 0x3ee66666    # 0.45f

    .line 235
    .line 236
    .line 237
    const/high16 v2, 0x3f800000    # 1.0f

    .line 238
    .line 239
    const/high16 v4, -0x40800000    # -1.0f

    .line 240
    .line 241
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v0, 0x3fb851ec    # 1.44f

    .line 245
    .line 246
    .line 247
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v17, -0x40000000    # -2.0f

    .line 251
    .line 252
    const v18, -0x3f71eb85    # -4.44f

    .line 253
    .line 254
    .line 255
    const v13, -0x4063d70a    # -1.22f

    .line 256
    .line 257
    .line 258
    const v14, -0x40733333    # -1.1f

    .line 259
    .line 260
    .line 261
    const/high16 v15, -0x40000000    # -2.0f

    .line 262
    .line 263
    const v16, -0x3fd51eb8    # -2.67f

    .line 264
    .line 265
    .line 266
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v17, 0x4059999a    # 3.4f

    .line 270
    .line 271
    .line 272
    const v18, -0x3f533333    # -5.4f

    .line 273
    .line 274
    .line 275
    const/4 v13, 0x0

    .line 276
    const v14, -0x3fe7ae14    # -2.38f

    .line 277
    .line 278
    .line 279
    const v15, 0x3fb1eb85    # 1.39f

    .line 280
    .line 281
    .line 282
    const v16, -0x3f723d71    # -4.43f

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v17, 0x41200000    # 10.0f

    .line 289
    .line 290
    const v18, 0x40b428f6    # 5.63f

    .line 291
    .line 292
    .line 293
    const v13, 0x411c51ec    # 9.77f

    .line 294
    .line 295
    .line 296
    const v14, 0x40cd70a4    # 6.42f

    .line 297
    .line 298
    .line 299
    const/high16 v15, 0x41200000    # 10.0f

    .line 300
    .line 301
    const v16, 0x40c147ae    # 6.04f

    .line 302
    .line 303
    .line 304
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v17, -0x4050a3d7    # -1.37f

    .line 308
    .line 309
    .line 310
    const v18, -0x409eb852    # -0.88f

    .line 311
    .line 312
    .line 313
    const/4 v13, 0x0

    .line 314
    const v14, -0x40ca3d71    # -0.71f

    .line 315
    .line 316
    .line 317
    const v15, -0x40c51eb8    # -0.73f

    .line 318
    .line 319
    .line 320
    const v16, -0x4068f5c3    # -1.18f

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v17, 0x40800000    # 4.0f

    .line 327
    .line 328
    const/high16 v18, 0x41400000    # 12.0f

    .line 329
    .line 330
    const v13, 0x40bc7ae1    # 5.89f

    .line 331
    .line 332
    .line 333
    const v14, 0x40c0f5c3    # 6.03f

    .line 334
    .line 335
    .line 336
    const/high16 v15, 0x40800000    # 4.0f

    .line 337
    .line 338
    const v16, 0x410ca3d7    # 8.79f

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v17, 0x402eb852    # 2.73f

    .line 345
    .line 346
    .line 347
    const/high16 v18, 0x40c00000    # 6.0f

    .line 348
    .line 349
    const/4 v13, 0x0

    .line 350
    const v14, 0x4019999a    # 2.4f

    .line 351
    .line 352
    .line 353
    const v15, 0x3f87ae14    # 1.06f

    .line 354
    .line 355
    .line 356
    const v16, 0x409147ae    # 4.54f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v0, 0x40a00000    # 5.0f

    .line 363
    .line 364
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const/high16 v17, -0x40800000    # -1.0f

    .line 368
    .line 369
    const/high16 v18, 0x3f800000    # 1.0f

    .line 370
    .line 371
    const v13, -0x40f33333    # -0.55f

    .line 372
    .line 373
    .line 374
    const/4 v14, 0x0

    .line 375
    const/high16 v15, -0x40800000    # -1.0f

    .line 376
    .line 377
    const v16, 0x3ee66666    # 0.45f

    .line 378
    .line 379
    .line 380
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v0, 0x3ee66666    # 0.45f

    .line 384
    .line 385
    .line 386
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const/high16 v0, 0x40800000    # 4.0f

    .line 390
    .line 391
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v17, 0x3f800000    # 1.0f

    .line 395
    .line 396
    const/high16 v18, -0x40800000    # -1.0f

    .line 397
    .line 398
    const v13, 0x3f0ccccd    # 0.55f

    .line 399
    .line 400
    .line 401
    const/high16 v15, 0x3f800000    # 1.0f

    .line 402
    .line 403
    const v16, -0x4119999a    # -0.45f

    .line 404
    .line 405
    .line 406
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const/high16 v0, 0x41700000    # 15.0f

    .line 410
    .line 411
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const/high16 v0, 0x40c00000    # 6.0f

    .line 418
    .line 419
    const/high16 v2, 0x41980000    # 19.0f

    .line 420
    .line 421
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v0, -0x4119999a    # -0.45f

    .line 428
    .line 429
    .line 430
    const/high16 v2, -0x40800000    # -1.0f

    .line 431
    .line 432
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/high16 v0, -0x3f800000    # -4.0f

    .line 436
    .line 437
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const/high16 v17, -0x40800000    # -1.0f

    .line 441
    .line 442
    const/high16 v18, 0x3f800000    # 1.0f

    .line 443
    .line 444
    const v13, -0x40f33333    # -0.55f

    .line 445
    .line 446
    .line 447
    const/high16 v15, -0x40800000    # -1.0f

    .line 448
    .line 449
    const v16, 0x3ee66666    # 0.45f

    .line 450
    .line 451
    .line 452
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const/high16 v0, 0x40800000    # 4.0f

    .line 456
    .line 457
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const/high16 v17, 0x3f800000    # 1.0f

    .line 461
    .line 462
    const/4 v13, 0x0

    .line 463
    const v14, 0x3f0ccccd    # 0.55f

    .line 464
    .line 465
    .line 466
    const v15, 0x3ee66666    # 0.45f

    .line 467
    .line 468
    .line 469
    const/high16 v16, 0x3f800000    # 1.0f

    .line 470
    .line 471
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v0, -0x4119999a    # -0.45f

    .line 475
    .line 476
    .line 477
    const/high16 v2, 0x3f800000    # 1.0f

    .line 478
    .line 479
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v0, 0x40f1eb85    # 7.56f

    .line 483
    .line 484
    .line 485
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const v17, 0x3ff5c28f    # 1.92f

    .line 489
    .line 490
    .line 491
    const v18, 0x405c28f6    # 3.44f

    .line 492
    .line 493
    .line 494
    const v13, 0x3f7ae148    # 0.98f

    .line 495
    .line 496
    .line 497
    const v14, 0x3f63d70a    # 0.89f

    .line 498
    .line 499
    .line 500
    const v15, 0x3fd70a3d    # 1.68f

    .line 501
    .line 502
    .line 503
    const v16, 0x40051eb8    # 2.08f

    .line 504
    .line 505
    .line 506
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const v0, 0x400147ae    # 2.02f

    .line 510
    .line 511
    .line 512
    const/4 v2, 0x0

    .line 513
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const v17, -0x3fd5c28f    # -2.66f

    .line 517
    .line 518
    .line 519
    const/high16 v18, -0x3f600000    # -5.0f

    .line 520
    .line 521
    const/high16 v13, -0x41800000    # -0.25f

    .line 522
    .line 523
    const v14, -0x400147ae    # -1.99f

    .line 524
    .line 525
    .line 526
    const v15, -0x40628f5c    # -1.23f

    .line 527
    .line 528
    .line 529
    const v16, -0x3f90a3d7    # -3.74f

    .line 530
    .line 531
    .line 532
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const/high16 v0, 0x41980000    # 19.0f

    .line 536
    .line 537
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 544
    .line 545
    .line 546
    move-result-object v2

    .line 547
    const/16 v16, 0x3800

    .line 548
    .line 549
    const/16 v17, 0x0

    .line 550
    .line 551
    const/high16 v6, 0x3f800000    # 1.0f

    .line 552
    .line 553
    const/high16 v8, 0x3f800000    # 1.0f

    .line 554
    .line 555
    const/4 v7, 0x0

    .line 556
    const/high16 v9, 0x3f800000    # 1.0f

    .line 557
    .line 558
    const/high16 v12, 0x3f800000    # 1.0f

    .line 559
    .line 560
    const/4 v13, 0x0

    .line 561
    const/4 v14, 0x0

    .line 562
    const/4 v15, 0x0

    .line 563
    const-string v4, ""

    .line 564
    .line 565
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 566
    .line 567
    .line 568
    move-result-object v0

    .line 569
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    sput-object v0, Landroidx/compose/material/icons/rounded/CloudSyncKt;->_cloudSync:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 574
    .line 575
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 576
    .line 577
    .line 578
    return-object v0
.end method
