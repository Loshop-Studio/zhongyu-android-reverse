.class public final Landroidx/compose/material/icons/twotone/FormatColorResetKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_formatColorReset",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "FormatColorReset",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getFormatColorReset",
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
        "SMAP\nFormatColorReset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FormatColorReset.kt\nandroidx/compose/material/icons/twotone/FormatColorResetKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,75:1\n212#2,12:76\n233#2,18:89\n253#2:126\n233#2,18:127\n253#2:164\n174#3:88\n705#4,2:107\n717#4,2:109\n719#4,11:115\n705#4,2:145\n717#4,2:147\n719#4,11:153\n72#5,4:111\n72#5,4:149\n*S KotlinDebug\n*F\n+ 1 FormatColorReset.kt\nandroidx/compose/material/icons/twotone/FormatColorResetKt\n*L\n29#1:76,12\n30#1:89,18\n30#1:126\n43#1:127,18\n43#1:164\n29#1:88\n30#1:107,2\n30#1:109,2\n30#1:115,11\n43#1:145,2\n43#1:147,2\n43#1:153,11\n30#1:111,4\n43#1:149,4\n*E\n"
    }
.end annotation


# static fields
.field private static _formatColorReset:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFormatColorReset(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/FormatColorResetKt;->_formatColorReset:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.FormatColorReset"

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
    const v4, 0x412ee148    # 10.93f

    .line 71
    .line 72
    .line 73
    const v6, 0x40fa8f5c    # 7.83f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, 0x4098a3d7    # 4.77f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const v25, -0x3f928f5c    # -3.71f

    .line 86
    .line 87
    .line 88
    const v26, -0x3f3851ec    # -6.24f

    .line 89
    .line 90
    .line 91
    const v21, -0x40e147ae    # -0.62f

    .line 92
    .line 93
    .line 94
    const v22, -0x401851ec    # -1.81f

    .line 95
    .line 96
    .line 97
    const v23, -0x3ff51eb8    # -2.17f

    .line 98
    .line 99
    .line 100
    const v24, -0x3f7851ec    # -4.24f

    .line 101
    .line 102
    .line 103
    move-object/from16 v20, v2

    .line 104
    .line 105
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v25, -0x407851ec    # -1.06f

    .line 109
    .line 110
    .line 111
    const v26, 0x3fbc28f6    # 1.47f

    .line 112
    .line 113
    .line 114
    const v21, -0x414ccccd    # -0.35f

    .line 115
    .line 116
    .line 117
    const v22, 0x3ef0a3d7    # 0.47f

    .line 118
    .line 119
    .line 120
    const v23, -0x40ca3d71    # -0.71f

    .line 121
    .line 122
    .line 123
    const v24, 0x3f75c28f    # 0.96f

    .line 124
    .line 125
    .line 126
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v4, 0x41900000    # 18.0f

    .line 133
    .line 134
    const/high16 v6, 0x41400000    # 12.0f

    .line 135
    .line 136
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v25, 0x4021eb85    # 2.53f

    .line 140
    .line 141
    .line 142
    const v26, -0x40947ae1    # -0.92f

    .line 143
    .line 144
    .line 145
    const v21, 0x3f75c28f    # 0.96f

    .line 146
    .line 147
    .line 148
    const/16 v22, 0x0

    .line 149
    .line 150
    const v23, 0x3fea3d71    # 1.83f

    .line 151
    .line 152
    .line 153
    const v24, -0x4147ae14    # -0.36f

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v4, -0x3f48f5c3    # -5.72f

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v25, 0x41000000    # 8.0f

    .line 166
    .line 167
    const/high16 v26, 0x41600000    # 14.0f

    .line 168
    .line 169
    const v21, 0x41051eb8    # 8.32f

    .line 170
    .line 171
    .line 172
    const v22, 0x4146147b    # 12.38f

    .line 173
    .line 174
    .line 175
    const/high16 v23, 0x41000000    # 8.0f

    .line 176
    .line 177
    const v24, 0x4154f5c3    # 13.31f

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const/high16 v25, 0x40800000    # 4.0f

    .line 184
    .line 185
    const/high16 v26, 0x40800000    # 4.0f

    .line 186
    .line 187
    const/16 v21, 0x0

    .line 188
    .line 189
    const v22, 0x400d70a4    # 2.21f

    .line 190
    .line 191
    .line 192
    const v23, 0x3fe51eb8    # 1.79f

    .line 193
    .line 194
    .line 195
    const/high16 v24, 0x40800000    # 4.0f

    .line 196
    .line 197
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    const/16 v16, 0x3800

    .line 208
    .line 209
    const/16 v17, 0x0

    .line 210
    .line 211
    const v6, 0x3e99999a    # 0.3f

    .line 212
    .line 213
    .line 214
    const v8, 0x3e99999a    # 0.3f

    .line 215
    .line 216
    .line 217
    const/4 v7, 0x0

    .line 218
    const/high16 v9, 0x3f800000    # 1.0f

    .line 219
    .line 220
    const/high16 v12, 0x3f800000    # 1.0f

    .line 221
    .line 222
    const/4 v13, 0x0

    .line 223
    const/4 v14, 0x0

    .line 224
    const/4 v15, 0x0

    .line 225
    const-string v4, ""

    .line 226
    .line 227
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 228
    .line 229
    .line 230
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 231
    .line 232
    .line 233
    move-result v3

    .line 234
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 235
    .line 236
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 237
    .line 238
    .line 239
    move-result-wide v6

    .line 240
    const/4 v0, 0x0

    .line 241
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 245
    .line 246
    .line 247
    move-result v10

    .line 248
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 249
    .line 250
    .line 251
    move-result v11

    .line 252
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 255
    .line 256
    .line 257
    const v0, 0x40cb851f    # 6.36f

    .line 258
    .line 259
    .line 260
    const/high16 v2, 0x41400000    # 12.0f

    .line 261
    .line 262
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v17, 0x406d70a4    # 3.71f

    .line 266
    .line 267
    .line 268
    const v18, 0x40c7ae14    # 6.24f

    .line 269
    .line 270
    .line 271
    const v13, 0x3fc3d70a    # 1.53f

    .line 272
    .line 273
    .line 274
    const/high16 v14, 0x40000000    # 2.0f

    .line 275
    .line 276
    const v15, 0x40451eb8    # 3.08f

    .line 277
    .line 278
    .line 279
    const v16, 0x408dc28f    # 4.43f

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v0, 0x400eb852    # 2.23f

    .line 286
    .line 287
    .line 288
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v17, 0x3d75c28f    # 0.06f

    .line 292
    .line 293
    .line 294
    const v18, -0x40ab851f    # -0.83f

    .line 295
    .line 296
    .line 297
    const v13, 0x3cf5c28f    # 0.03f

    .line 298
    .line 299
    .line 300
    const v14, -0x4175c28f    # -0.27f

    .line 301
    .line 302
    .line 303
    const v15, 0x3d75c28f    # 0.06f

    .line 304
    .line 305
    .line 306
    const v16, -0x40f33333    # -0.55f

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v17, -0x3f400000    # -6.0f

    .line 313
    .line 314
    const v18, -0x3ed33333    # -10.8f

    .line 315
    .line 316
    .line 317
    const/4 v13, 0x0

    .line 318
    const v14, -0x3f8147ae    # -3.98f

    .line 319
    .line 320
    .line 321
    const/high16 v15, -0x3f400000    # -6.0f

    .line 322
    .line 323
    const v16, -0x3ed33333    # -10.8f

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/high16 v0, -0x3fe00000    # -2.5f

    .line 330
    .line 331
    const v2, 0x404c28f6    # 3.19f

    .line 332
    .line 333
    .line 334
    const v4, -0x4068f5c3    # -1.18f

    .line 335
    .line 336
    .line 337
    const v6, 0x3faccccd    # 1.35f

    .line 338
    .line 339
    .line 340
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v0, 0x3fb851ec    # 1.44f

    .line 344
    .line 345
    .line 346
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v17, 0x3f87ae14    # 1.06f

    .line 350
    .line 351
    .line 352
    const v18, -0x4043d70a    # -1.47f

    .line 353
    .line 354
    .line 355
    const v13, 0x3eae147b    # 0.34f

    .line 356
    .line 357
    .line 358
    const v14, -0x40fd70a4    # -0.51f

    .line 359
    .line 360
    .line 361
    const v15, 0x3f333333    # 0.7f

    .line 362
    .line 363
    .line 364
    const/high16 v16, -0x40800000    # -1.0f

    .line 365
    .line 366
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v0, 0x40a47ae1    # 5.14f

    .line 373
    .line 374
    .line 375
    const v2, 0x40ad1eb8    # 5.41f

    .line 376
    .line 377
    .line 378
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v0, 0x40800000    # 4.0f

    .line 382
    .line 383
    const v2, 0x40d1999a    # 6.55f

    .line 384
    .line 385
    .line 386
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v0, 0x40547ae1    # 3.32f

    .line 390
    .line 391
    .line 392
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v17, 0x40c00000    # 6.0f

    .line 396
    .line 397
    const/high16 v18, 0x41600000    # 14.0f

    .line 398
    .line 399
    const v13, 0x40d1999a    # 6.55f

    .line 400
    .line 401
    .line 402
    const v14, 0x413547ae    # 11.33f

    .line 403
    .line 404
    .line 405
    const/high16 v15, 0x40c00000    # 6.0f

    .line 406
    .line 407
    const v16, 0x414ca3d7    # 12.79f

    .line 408
    .line 409
    .line 410
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v18, 0x40c00000    # 6.0f

    .line 414
    .line 415
    const/4 v13, 0x0

    .line 416
    const v14, 0x4053d70a    # 3.31f

    .line 417
    .line 418
    .line 419
    const v15, 0x402c28f6    # 2.69f

    .line 420
    .line 421
    .line 422
    const/high16 v16, 0x40c00000    # 6.0f

    .line 423
    .line 424
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v17, 0x407ccccd    # 3.95f

    .line 428
    .line 429
    .line 430
    const/high16 v18, -0x40400000    # -1.5f

    .line 431
    .line 432
    const v13, 0x3fc28f5c    # 1.52f

    .line 433
    .line 434
    .line 435
    const/4 v14, 0x0

    .line 436
    const v15, 0x4039999a    # 2.9f

    .line 437
    .line 438
    .line 439
    const v16, -0x40ee147b    # -0.57f

    .line 440
    .line 441
    .line 442
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const v0, 0x402851ec    # 2.63f

    .line 446
    .line 447
    .line 448
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const/high16 v0, 0x41a00000    # 20.0f

    .line 452
    .line 453
    const v2, 0x419dc28f    # 19.72f

    .line 454
    .line 455
    .line 456
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v0, 0x40a47ae1    # 5.14f

    .line 460
    .line 461
    .line 462
    const v2, 0x40ad1eb8    # 5.41f

    .line 463
    .line 464
    .line 465
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const/high16 v0, 0x41900000    # 18.0f

    .line 472
    .line 473
    const/high16 v2, 0x41400000    # 12.0f

    .line 474
    .line 475
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const/high16 v17, -0x3f800000    # -4.0f

    .line 479
    .line 480
    const/high16 v18, -0x3f800000    # -4.0f

    .line 481
    .line 482
    const v13, -0x3ff28f5c    # -2.21f

    .line 483
    .line 484
    .line 485
    const/high16 v15, -0x3f800000    # -4.0f

    .line 486
    .line 487
    const v16, -0x401ae148    # -1.79f

    .line 488
    .line 489
    .line 490
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const v17, 0x3f4f5c29    # 0.81f

    .line 494
    .line 495
    .line 496
    const v18, -0x3fd70a3d    # -2.64f

    .line 497
    .line 498
    .line 499
    const/4 v13, 0x0

    .line 500
    const v14, -0x40cf5c29    # -0.69f

    .line 501
    .line 502
    .line 503
    const v15, 0x3ea3d70a    # 0.32f

    .line 504
    .line 505
    .line 506
    const v16, -0x4030a3d7    # -1.62f

    .line 507
    .line 508
    .line 509
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const v0, 0x40b70a3d    # 5.72f

    .line 513
    .line 514
    .line 515
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const v17, -0x3fde147b    # -2.53f

    .line 519
    .line 520
    .line 521
    const v18, 0x3f6b851f    # 0.92f

    .line 522
    .line 523
    .line 524
    const v13, -0x40cccccd    # -0.7f

    .line 525
    .line 526
    .line 527
    const v14, 0x3f0f5c29    # 0.56f

    .line 528
    .line 529
    .line 530
    const v15, -0x40370a3d    # -1.57f

    .line 531
    .line 532
    .line 533
    const v16, 0x3f6b851f    # 0.92f

    .line 534
    .line 535
    .line 536
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 543
    .line 544
    .line 545
    move-result-object v2

    .line 546
    const/16 v16, 0x3800

    .line 547
    .line 548
    const/16 v17, 0x0

    .line 549
    .line 550
    const/high16 v6, 0x3f800000    # 1.0f

    .line 551
    .line 552
    const/high16 v8, 0x3f800000    # 1.0f

    .line 553
    .line 554
    const/4 v7, 0x0

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
    sput-object v0, Landroidx/compose/material/icons/twotone/FormatColorResetKt;->_formatColorReset:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 571
    .line 572
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 573
    .line 574
    .line 575
    return-object v0
.end method
