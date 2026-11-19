.class public final Landroidx/compose/material/icons/outlined/CloudUploadKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_cloudUpload",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "CloudUpload",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getCloudUpload",
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
        "SMAP\nCloudUpload.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloudUpload.kt\nandroidx/compose/material/icons/outlined/CloudUploadKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,67:1\n212#2,12:68\n233#2,18:81\n253#2:118\n174#3:80\n705#4,2:99\n717#4,2:101\n719#4,11:107\n72#5,4:103\n*S KotlinDebug\n*F\n+ 1 CloudUpload.kt\nandroidx/compose/material/icons/outlined/CloudUploadKt\n*L\n29#1:68,12\n30#1:81,18\n30#1:118\n29#1:80\n30#1:99,2\n30#1:101,2\n30#1:107,11\n30#1:103,4\n*E\n"
    }
.end annotation


# static fields
.field private static _cloudUpload:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCloudUpload(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/CloudUploadKt;->_cloudUpload:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.CloudUpload"

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
    const v0, 0x419acccd    # 19.35f

    .line 71
    .line 72
    .line 73
    const v2, 0x4120a3d7    # 10.04f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v17, 0x41400000    # 12.0f

    .line 80
    .line 81
    const/high16 v18, 0x40800000    # 4.0f

    .line 82
    .line 83
    const v13, 0x41955c29    # 18.67f

    .line 84
    .line 85
    .line 86
    const v14, 0x40d2e148    # 6.59f

    .line 87
    .line 88
    .line 89
    const v15, 0x417a3d71    # 15.64f

    .line 90
    .line 91
    .line 92
    const/high16 v16, 0x40800000    # 4.0f

    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v17, 0x40ab3333    # 5.35f

    .line 98
    .line 99
    .line 100
    const v18, 0x4100a3d7    # 8.04f

    .line 101
    .line 102
    .line 103
    const v13, 0x4111c28f    # 9.11f

    .line 104
    .line 105
    .line 106
    const/high16 v14, 0x40800000    # 4.0f

    .line 107
    .line 108
    const v15, 0x40d33333    # 6.6f

    .line 109
    .line 110
    .line 111
    const v16, 0x40b47ae1    # 5.64f

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/16 v17, 0x0

    .line 118
    .line 119
    const/high16 v18, 0x41600000    # 14.0f

    .line 120
    .line 121
    const v13, 0x4015c28f    # 2.34f

    .line 122
    .line 123
    .line 124
    const v14, 0x4105c28f    # 8.36f

    .line 125
    .line 126
    .line 127
    const/4 v15, 0x0

    .line 128
    const v16, 0x412e8f5c    # 10.91f

    .line 129
    .line 130
    .line 131
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v17, 0x40c00000    # 6.0f

    .line 135
    .line 136
    const/high16 v18, 0x40c00000    # 6.0f

    .line 137
    .line 138
    const/4 v13, 0x0

    .line 139
    const v14, 0x4053d70a    # 3.31f

    .line 140
    .line 141
    .line 142
    const v15, 0x402c28f6    # 2.69f

    .line 143
    .line 144
    .line 145
    const/high16 v16, 0x40c00000    # 6.0f

    .line 146
    .line 147
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v0, 0x41500000    # 13.0f

    .line 151
    .line 152
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const/high16 v17, 0x40a00000    # 5.0f

    .line 156
    .line 157
    const/high16 v18, -0x3f600000    # -5.0f

    .line 158
    .line 159
    const v13, 0x4030a3d7    # 2.76f

    .line 160
    .line 161
    .line 162
    const/4 v14, 0x0

    .line 163
    const/high16 v15, 0x40a00000    # 5.0f

    .line 164
    .line 165
    const v16, -0x3ff0a3d7    # -2.24f

    .line 166
    .line 167
    .line 168
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v17, -0x3f6b3333    # -4.65f

    .line 172
    .line 173
    .line 174
    const v18, -0x3f6147ae    # -4.96f

    .line 175
    .line 176
    .line 177
    const/4 v13, 0x0

    .line 178
    const v14, -0x3fd70a3d    # -2.64f

    .line 179
    .line 180
    .line 181
    const v15, -0x3ffccccd    # -2.05f

    .line 182
    .line 183
    .line 184
    const v16, -0x3f670a3d    # -4.78f

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v0, 0x41980000    # 19.0f

    .line 194
    .line 195
    const/high16 v2, 0x41900000    # 18.0f

    .line 196
    .line 197
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v0, 0x40c00000    # 6.0f

    .line 201
    .line 202
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v17, -0x3f800000    # -4.0f

    .line 206
    .line 207
    const/high16 v18, -0x3f800000    # -4.0f

    .line 208
    .line 209
    const v13, -0x3ff28f5c    # -2.21f

    .line 210
    .line 211
    .line 212
    const/4 v14, 0x0

    .line 213
    const/high16 v15, -0x3f800000    # -4.0f

    .line 214
    .line 215
    const v16, -0x401ae148    # -1.79f

    .line 216
    .line 217
    .line 218
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v17, 0x4063d70a    # 3.56f

    .line 222
    .line 223
    .line 224
    const v18, -0x3f81eb85    # -3.97f

    .line 225
    .line 226
    .line 227
    const/4 v13, 0x0

    .line 228
    const v14, -0x3ffccccd    # -2.05f

    .line 229
    .line 230
    .line 231
    const v15, 0x3fc3d70a    # 1.53f

    .line 232
    .line 233
    .line 234
    const v16, -0x3f8f5c29    # -3.76f

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v0, 0x3f88f5c3    # 1.07f

    .line 241
    .line 242
    .line 243
    const v2, -0x421eb852    # -0.11f

    .line 244
    .line 245
    .line 246
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v0, 0x3f000000    # 0.5f

    .line 250
    .line 251
    const v2, -0x408ccccd    # -0.95f

    .line 252
    .line 253
    .line 254
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const/high16 v17, 0x41400000    # 12.0f

    .line 258
    .line 259
    const/high16 v18, 0x40c00000    # 6.0f

    .line 260
    .line 261
    const v13, 0x410147ae    # 8.08f

    .line 262
    .line 263
    .line 264
    const v14, 0x40e47ae1    # 7.14f

    .line 265
    .line 266
    .line 267
    const v15, 0x411f0a3d    # 9.94f

    .line 268
    .line 269
    .line 270
    const/high16 v16, 0x40c00000    # 6.0f

    .line 271
    .line 272
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v17, 0x40ac7ae1    # 5.39f

    .line 276
    .line 277
    .line 278
    const v18, 0x408dc28f    # 4.43f

    .line 279
    .line 280
    .line 281
    const v13, 0x4027ae14    # 2.62f

    .line 282
    .line 283
    .line 284
    const/4 v14, 0x0

    .line 285
    const v15, 0x409c28f6    # 4.88f

    .line 286
    .line 287
    .line 288
    const v16, 0x3fee147b    # 1.86f

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v0, 0x3e99999a    # 0.3f

    .line 295
    .line 296
    .line 297
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 298
    .line 299
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v0, 0x3fc3d70a    # 1.53f

    .line 303
    .line 304
    .line 305
    const v2, 0x3de147ae    # 0.11f

    .line 306
    .line 307
    .line 308
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v17, 0x4031eb85    # 2.78f

    .line 312
    .line 313
    .line 314
    const v18, 0x403d70a4    # 2.96f

    .line 315
    .line 316
    .line 317
    const v13, 0x3fc7ae14    # 1.56f

    .line 318
    .line 319
    .line 320
    const v14, 0x3dcccccd    # 0.1f

    .line 321
    .line 322
    .line 323
    const v15, 0x4031eb85    # 2.78f

    .line 324
    .line 325
    .line 326
    const v16, 0x3fb47ae1    # 1.41f

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 333
    .line 334
    const/high16 v18, 0x40400000    # 3.0f

    .line 335
    .line 336
    const/4 v13, 0x0

    .line 337
    const v14, 0x3fd33333    # 1.65f

    .line 338
    .line 339
    .line 340
    const v15, -0x40533333    # -1.35f

    .line 341
    .line 342
    .line 343
    const/high16 v16, 0x40400000    # 3.0f

    .line 344
    .line 345
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const/high16 v0, 0x41000000    # 8.0f

    .line 352
    .line 353
    const/high16 v2, 0x41500000    # 13.0f

    .line 354
    .line 355
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v0, 0x40233333    # 2.55f

    .line 359
    .line 360
    .line 361
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v0, 0x40400000    # 3.0f

    .line 365
    .line 366
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v0, 0x4039999a    # 2.9f

    .line 370
    .line 371
    .line 372
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 376
    .line 377
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v0, 0x41800000    # 16.0f

    .line 381
    .line 382
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v0, -0x3f800000    # -4.0f

    .line 386
    .line 387
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 394
    .line 395
    .line 396
    move-result-object v2

    .line 397
    const/16 v16, 0x3800

    .line 398
    .line 399
    const/16 v17, 0x0

    .line 400
    .line 401
    const/high16 v6, 0x3f800000    # 1.0f

    .line 402
    .line 403
    const/high16 v8, 0x3f800000    # 1.0f

    .line 404
    .line 405
    const/4 v7, 0x0

    .line 406
    const/high16 v9, 0x3f800000    # 1.0f

    .line 407
    .line 408
    const/high16 v12, 0x3f800000    # 1.0f

    .line 409
    .line 410
    const/4 v14, 0x0

    .line 411
    const/4 v15, 0x0

    .line 412
    const-string v4, ""

    .line 413
    .line 414
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    sput-object v0, Landroidx/compose/material/icons/outlined/CloudUploadKt;->_cloudUpload:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 423
    .line 424
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 425
    .line 426
    .line 427
    return-object v0
.end method
