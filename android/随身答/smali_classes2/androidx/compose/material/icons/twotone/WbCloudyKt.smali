.class public final Landroidx/compose/material/icons/twotone/WbCloudyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_wbCloudy",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "WbCloudy",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getWbCloudy",
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
        "SMAP\nWbCloudy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WbCloudy.kt\nandroidx/compose/material/icons/twotone/WbCloudyKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,74:1\n212#2,12:75\n233#2,18:88\n253#2:125\n233#2,18:126\n253#2:163\n174#3:87\n705#4,2:106\n717#4,2:108\n719#4,11:114\n705#4,2:144\n717#4,2:146\n719#4,11:152\n72#5,4:110\n72#5,4:148\n*S KotlinDebug\n*F\n+ 1 WbCloudy.kt\nandroidx/compose/material/icons/twotone/WbCloudyKt\n*L\n29#1:75,12\n30#1:88,18\n30#1:125\n45#1:126,18\n45#1:163\n29#1:87\n30#1:106,2\n30#1:108,2\n30#1:114,11\n45#1:144,2\n45#1:146,2\n45#1:152,11\n30#1:110,4\n45#1:148,4\n*E\n"
    }
.end annotation


# static fields
.field private static _wbCloudy:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWbCloudy(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/WbCloudyKt;->_wbCloudy:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.WbCloudy"

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
    const v4, 0x4199d70a    # 19.23f

    .line 71
    .line 72
    .line 73
    const v6, 0x4140a3d7    # 12.04f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, -0x403d70a4    # -1.52f

    .line 80
    .line 81
    .line 82
    const v6, -0x421eb852    # -0.11f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v4, -0x41666666    # -0.3f

    .line 89
    .line 90
    .line 91
    const/high16 v6, -0x40400000    # -1.5f

    .line 92
    .line 93
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v25, 0x414028f6    # 12.01f

    .line 97
    .line 98
    .line 99
    const/high16 v26, 0x40c00000    # 6.0f

    .line 100
    .line 101
    const v21, 0x41871eb8    # 16.89f

    .line 102
    .line 103
    .line 104
    const v22, 0x40fb851f    # 7.86f

    .line 105
    .line 106
    .line 107
    const v23, 0x4169eb85    # 14.62f

    .line 108
    .line 109
    .line 110
    const/high16 v24, 0x40c00000    # 6.0f

    .line 111
    .line 112
    move-object/from16 v20, v2

    .line 113
    .line 114
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v25, 0x40e428f6    # 7.13f

    .line 118
    .line 119
    .line 120
    const v26, 0x410f5c29    # 8.96f

    .line 121
    .line 122
    .line 123
    const v21, 0x411f3333    # 9.95f

    .line 124
    .line 125
    .line 126
    const/high16 v22, 0x40c00000    # 6.0f

    .line 127
    .line 128
    const v23, 0x410147ae    # 8.08f

    .line 129
    .line 130
    .line 131
    const v24, 0x40e47ae1    # 7.14f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v4, -0x41000000    # -0.5f

    .line 138
    .line 139
    const v6, 0x3f733333    # 0.95f

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v4, -0x40770a3d    # -1.07f

    .line 146
    .line 147
    .line 148
    const v6, 0x3de147ae    # 0.11f

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v25, -0x3f9ccccd    # -3.55f

    .line 155
    .line 156
    .line 157
    const v26, 0x407eb852    # 3.98f

    .line 158
    .line 159
    .line 160
    const v21, -0x3ffeb852    # -2.02f

    .line 161
    .line 162
    .line 163
    const v22, 0x3e6147ae    # 0.22f

    .line 164
    .line 165
    .line 166
    const v23, -0x3f9ccccd    # -3.55f

    .line 167
    .line 168
    .line 169
    const v24, 0x3ff70a3d    # 1.93f

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const/high16 v25, 0x40800000    # 4.0f

    .line 176
    .line 177
    const/high16 v26, 0x40800000    # 4.0f

    .line 178
    .line 179
    const/16 v21, 0x0

    .line 180
    .line 181
    const v22, 0x400d70a4    # 2.21f

    .line 182
    .line 183
    .line 184
    const v23, 0x3fe51eb8    # 1.79f

    .line 185
    .line 186
    .line 187
    const/high16 v24, 0x40800000    # 4.0f

    .line 188
    .line 189
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const/high16 v4, 0x41500000    # 13.0f

    .line 193
    .line 194
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v25, 0x40400000    # 3.0f

    .line 198
    .line 199
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 200
    .line 201
    const v21, 0x3fd33333    # 1.65f

    .line 202
    .line 203
    .line 204
    const/16 v22, 0x0

    .line 205
    .line 206
    const/high16 v23, 0x40400000    # 3.0f

    .line 207
    .line 208
    const v24, -0x40533333    # -1.35f

    .line 209
    .line 210
    .line 211
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v25, -0x3fce147b    # -2.78f

    .line 215
    .line 216
    .line 217
    const v26, -0x3fc28f5c    # -2.96f

    .line 218
    .line 219
    .line 220
    const/16 v21, 0x0

    .line 221
    .line 222
    const v22, -0x4039999a    # -1.55f

    .line 223
    .line 224
    .line 225
    const v23, -0x40628f5c    # -1.23f

    .line 226
    .line 227
    .line 228
    const v24, -0x3fc8f5c3    # -2.86f

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    const/16 v16, 0x3800

    .line 242
    .line 243
    const/16 v17, 0x0

    .line 244
    .line 245
    const v6, 0x3e99999a    # 0.3f

    .line 246
    .line 247
    .line 248
    const v8, 0x3e99999a    # 0.3f

    .line 249
    .line 250
    .line 251
    const/4 v7, 0x0

    .line 252
    const/high16 v9, 0x3f800000    # 1.0f

    .line 253
    .line 254
    const/high16 v12, 0x3f800000    # 1.0f

    .line 255
    .line 256
    const/4 v13, 0x0

    .line 257
    const/4 v14, 0x0

    .line 258
    const/4 v15, 0x0

    .line 259
    const-string v4, ""

    .line 260
    .line 261
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 262
    .line 263
    .line 264
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 265
    .line 266
    .line 267
    move-result v3

    .line 268
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 269
    .line 270
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 271
    .line 272
    .line 273
    move-result-wide v6

    .line 274
    const/4 v0, 0x0

    .line 275
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 279
    .line 280
    .line 281
    move-result v10

    .line 282
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 283
    .line 284
    .line 285
    move-result v11

    .line 286
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 289
    .line 290
    .line 291
    const v0, 0x419ae148    # 19.36f

    .line 292
    .line 293
    .line 294
    const v2, 0x4120a3d7    # 10.04f

    .line 295
    .line 296
    .line 297
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v17, 0x414028f6    # 12.01f

    .line 301
    .line 302
    .line 303
    const/high16 v18, 0x40800000    # 4.0f

    .line 304
    .line 305
    const v13, 0x41955c29    # 18.67f

    .line 306
    .line 307
    .line 308
    const v14, 0x40d2e148    # 6.59f

    .line 309
    .line 310
    .line 311
    const v15, 0x417a6666    # 15.65f

    .line 312
    .line 313
    .line 314
    const/high16 v16, 0x40800000    # 4.0f

    .line 315
    .line 316
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v17, 0x40ab3333    # 5.35f

    .line 320
    .line 321
    .line 322
    const v18, 0x4100a3d7    # 8.04f

    .line 323
    .line 324
    .line 325
    const v13, 0x4111c28f    # 9.11f

    .line 326
    .line 327
    .line 328
    const/high16 v14, 0x40800000    # 4.0f

    .line 329
    .line 330
    const v15, 0x40d33333    # 6.6f

    .line 331
    .line 332
    .line 333
    const v16, 0x40b47ae1    # 5.64f

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v17, 0x3c23d70a    # 0.01f

    .line 340
    .line 341
    .line 342
    const/high16 v18, 0x41600000    # 14.0f

    .line 343
    .line 344
    const v13, 0x40166666    # 2.35f

    .line 345
    .line 346
    .line 347
    const v14, 0x4105c28f    # 8.36f

    .line 348
    .line 349
    .line 350
    const v15, 0x3c23d70a    # 0.01f

    .line 351
    .line 352
    .line 353
    const v16, 0x412e8f5c    # 10.91f

    .line 354
    .line 355
    .line 356
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const/high16 v17, 0x40c00000    # 6.0f

    .line 360
    .line 361
    const/high16 v18, 0x40c00000    # 6.0f

    .line 362
    .line 363
    const/4 v13, 0x0

    .line 364
    const v14, 0x4053d70a    # 3.31f

    .line 365
    .line 366
    .line 367
    const v15, 0x402c28f6    # 2.69f

    .line 368
    .line 369
    .line 370
    const/high16 v16, 0x40c00000    # 6.0f

    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v0, 0x41500000    # 13.0f

    .line 376
    .line 377
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v17, 0x40a00000    # 5.0f

    .line 381
    .line 382
    const/high16 v18, -0x3f600000    # -5.0f

    .line 383
    .line 384
    const v13, 0x4030a3d7    # 2.76f

    .line 385
    .line 386
    .line 387
    const/4 v14, 0x0

    .line 388
    const/high16 v15, 0x40a00000    # 5.0f

    .line 389
    .line 390
    const v16, -0x3ff0a3d7    # -2.24f

    .line 391
    .line 392
    .line 393
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v17, -0x3f6b3333    # -4.65f

    .line 397
    .line 398
    .line 399
    const v18, -0x3f6147ae    # -4.96f

    .line 400
    .line 401
    .line 402
    const/4 v13, 0x0

    .line 403
    const v14, -0x3fd70a3d    # -2.64f

    .line 404
    .line 405
    .line 406
    const v15, -0x3ffccccd    # -2.05f

    .line 407
    .line 408
    .line 409
    const v16, -0x3f670a3d    # -4.78f

    .line 410
    .line 411
    .line 412
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v0, 0x4198147b    # 19.01f

    .line 419
    .line 420
    .line 421
    const/high16 v2, 0x41900000    # 18.0f

    .line 422
    .line 423
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const/high16 v0, -0x3eb00000    # -13.0f

    .line 427
    .line 428
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v17, -0x3f800000    # -4.0f

    .line 432
    .line 433
    const/high16 v18, -0x3f800000    # -4.0f

    .line 434
    .line 435
    const v13, -0x3ff28f5c    # -2.21f

    .line 436
    .line 437
    .line 438
    const/4 v14, 0x0

    .line 439
    const/high16 v15, -0x3f800000    # -4.0f

    .line 440
    .line 441
    const v16, -0x401ae148    # -1.79f

    .line 442
    .line 443
    .line 444
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v17, 0x4063d70a    # 3.56f

    .line 448
    .line 449
    .line 450
    const v18, -0x3f81eb85    # -3.97f

    .line 451
    .line 452
    .line 453
    const/4 v13, 0x0

    .line 454
    const v14, -0x3ffccccd    # -2.05f

    .line 455
    .line 456
    .line 457
    const v15, 0x3fc3d70a    # 1.53f

    .line 458
    .line 459
    .line 460
    const v16, -0x3f8f5c29    # -3.76f

    .line 461
    .line 462
    .line 463
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const v0, 0x3f88f5c3    # 1.07f

    .line 467
    .line 468
    .line 469
    const v2, -0x421eb852    # -0.11f

    .line 470
    .line 471
    .line 472
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const/high16 v0, 0x3f000000    # 0.5f

    .line 476
    .line 477
    const v2, -0x408ccccd    # -0.95f

    .line 478
    .line 479
    .line 480
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v17, 0x414028f6    # 12.01f

    .line 484
    .line 485
    .line 486
    const/high16 v18, 0x40c00000    # 6.0f

    .line 487
    .line 488
    const v13, 0x410147ae    # 8.08f

    .line 489
    .line 490
    .line 491
    const v14, 0x40e47ae1    # 7.14f

    .line 492
    .line 493
    .line 494
    const v15, 0x411f3333    # 9.95f

    .line 495
    .line 496
    .line 497
    const/high16 v16, 0x40c00000    # 6.0f

    .line 498
    .line 499
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const v17, 0x40accccd    # 5.4f

    .line 503
    .line 504
    .line 505
    const v18, 0x408dc28f    # 4.43f

    .line 506
    .line 507
    .line 508
    const v13, 0x40270a3d    # 2.61f

    .line 509
    .line 510
    .line 511
    const/4 v14, 0x0

    .line 512
    const v15, 0x409c7ae1    # 4.89f

    .line 513
    .line 514
    .line 515
    const v16, 0x3fee147b    # 1.86f

    .line 516
    .line 517
    .line 518
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v0, 0x3e99999a    # 0.3f

    .line 522
    .line 523
    .line 524
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 525
    .line 526
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const v0, 0x3fc28f5c    # 1.52f

    .line 530
    .line 531
    .line 532
    const v2, 0x3de147ae    # 0.11f

    .line 533
    .line 534
    .line 535
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const v17, 0x4031eb85    # 2.78f

    .line 539
    .line 540
    .line 541
    const v18, 0x403d70a4    # 2.96f

    .line 542
    .line 543
    .line 544
    const v13, 0x3fc7ae14    # 1.56f

    .line 545
    .line 546
    .line 547
    const v14, 0x3de147ae    # 0.11f

    .line 548
    .line 549
    .line 550
    const v15, 0x4031eb85    # 2.78f

    .line 551
    .line 552
    .line 553
    const v16, 0x3fb47ae1    # 1.41f

    .line 554
    .line 555
    .line 556
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 560
    .line 561
    const/high16 v18, 0x40400000    # 3.0f

    .line 562
    .line 563
    const/4 v13, 0x0

    .line 564
    const v14, 0x3fd33333    # 1.65f

    .line 565
    .line 566
    .line 567
    const v15, -0x40533333    # -1.35f

    .line 568
    .line 569
    .line 570
    const/high16 v16, 0x40400000    # 3.0f

    .line 571
    .line 572
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 579
    .line 580
    .line 581
    move-result-object v2

    .line 582
    const/16 v16, 0x3800

    .line 583
    .line 584
    const/16 v17, 0x0

    .line 585
    .line 586
    const/high16 v6, 0x3f800000    # 1.0f

    .line 587
    .line 588
    const/high16 v8, 0x3f800000    # 1.0f

    .line 589
    .line 590
    const/4 v7, 0x0

    .line 591
    const/high16 v12, 0x3f800000    # 1.0f

    .line 592
    .line 593
    const/4 v14, 0x0

    .line 594
    const/4 v15, 0x0

    .line 595
    const-string v4, ""

    .line 596
    .line 597
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 598
    .line 599
    .line 600
    move-result-object v0

    .line 601
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    sput-object v0, Landroidx/compose/material/icons/twotone/WbCloudyKt;->_wbCloudy:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 606
    .line 607
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 608
    .line 609
    .line 610
    return-object v0
.end method
