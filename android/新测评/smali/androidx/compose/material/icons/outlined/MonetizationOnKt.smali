.class public final Landroidx/compose/material/icons/outlined/MonetizationOnKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_monetizationOn",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "MonetizationOn",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getMonetizationOn",
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
        "SMAP\nMonetizationOn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonetizationOn.kt\nandroidx/compose/material/icons/outlined/MonetizationOnKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,71:1\n212#2,12:72\n233#2,18:85\n253#2:122\n174#3:84\n705#4,2:103\n717#4,2:105\n719#4,11:111\n72#5,4:107\n*S KotlinDebug\n*F\n+ 1 MonetizationOn.kt\nandroidx/compose/material/icons/outlined/MonetizationOnKt\n*L\n29#1:72,12\n30#1:85,18\n30#1:122\n29#1:84\n30#1:103,2\n30#1:105,2\n30#1:111,11\n30#1:107,4\n*E\n"
    }
.end annotation


# static fields
.field private static _monetizationOn:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMonetizationOn(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/MonetizationOnKt;->_monetizationOn:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.MonetizationOn"

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
    const/high16 v0, 0x40000000    # 2.0f

    .line 71
    .line 72
    const/high16 v2, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x40000000    # 2.0f

    .line 78
    .line 79
    const/high16 v18, 0x41400000    # 12.0f

    .line 80
    .line 81
    const v13, 0x40cf5c29    # 6.48f

    .line 82
    .line 83
    .line 84
    const/high16 v14, 0x40000000    # 2.0f

    .line 85
    .line 86
    const/high16 v15, 0x40000000    # 2.0f

    .line 87
    .line 88
    const v16, 0x40cf5c29    # 6.48f

    .line 89
    .line 90
    .line 91
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v0, 0x408f5c29    # 4.48f

    .line 95
    .line 96
    .line 97
    const/high16 v2, 0x41200000    # 10.0f

    .line 98
    .line 99
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v0, -0x3f70a3d7    # -4.48f

    .line 103
    .line 104
    .line 105
    const/high16 v2, -0x3ee00000    # -10.0f

    .line 106
    .line 107
    const/high16 v4, 0x41200000    # 10.0f

    .line 108
    .line 109
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v0, 0x418c28f6    # 17.52f

    .line 113
    .line 114
    .line 115
    const/high16 v2, 0x40000000    # 2.0f

    .line 116
    .line 117
    const/high16 v4, 0x41400000    # 12.0f

    .line 118
    .line 119
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v0, 0x41a00000    # 20.0f

    .line 126
    .line 127
    const/high16 v2, 0x41400000    # 12.0f

    .line 128
    .line 129
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v17, -0x3f000000    # -8.0f

    .line 133
    .line 134
    const/high16 v18, -0x3f000000    # -8.0f

    .line 135
    .line 136
    const v13, -0x3f72e148    # -4.41f

    .line 137
    .line 138
    .line 139
    const/4 v14, 0x0

    .line 140
    const/high16 v15, -0x3f000000    # -8.0f

    .line 141
    .line 142
    const v16, -0x3f9a3d71    # -3.59f

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v0, 0x4065c28f    # 3.59f

    .line 149
    .line 150
    .line 151
    const/high16 v2, -0x3f000000    # -8.0f

    .line 152
    .line 153
    const/high16 v4, 0x41000000    # 8.0f

    .line 154
    .line 155
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v2, 0x41000000    # 8.0f

    .line 159
    .line 160
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v0, -0x3f9a3d71    # -3.59f

    .line 164
    .line 165
    .line 166
    const/high16 v2, -0x3f000000    # -8.0f

    .line 167
    .line 168
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v0, 0x4144f5c3    # 12.31f

    .line 175
    .line 176
    .line 177
    const v2, 0x41323d71    # 11.14f

    .line 178
    .line 179
    .line 180
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v17, -0x3fea3d71    # -2.34f

    .line 184
    .line 185
    .line 186
    const v18, -0x402a3d71    # -1.67f

    .line 187
    .line 188
    .line 189
    const v13, -0x401d70a4    # -1.77f

    .line 190
    .line 191
    .line 192
    const v14, -0x4119999a    # -0.45f

    .line 193
    .line 194
    .line 195
    const v15, -0x3fea3d71    # -2.34f

    .line 196
    .line 197
    .line 198
    const v16, -0x408f5c29    # -0.94f

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v17, 0x40066666    # 2.1f

    .line 205
    .line 206
    .line 207
    const v18, -0x4048f5c3    # -1.43f

    .line 208
    .line 209
    .line 210
    const/4 v13, 0x0

    .line 211
    const v14, -0x40a8f5c3    # -0.84f

    .line 212
    .line 213
    .line 214
    const v15, 0x3f4a3d71    # 0.79f

    .line 215
    .line 216
    .line 217
    const v16, -0x4048f5c3    # -1.43f

    .line 218
    .line 219
    .line 220
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const v17, 0x3ff851ec    # 1.94f

    .line 224
    .line 225
    .line 226
    const v18, 0x3fd1eb85    # 1.64f

    .line 227
    .line 228
    .line 229
    const v13, 0x3fb0a3d7    # 1.38f

    .line 230
    .line 231
    .line 232
    const/4 v14, 0x0

    .line 233
    const v15, 0x3ff33333    # 1.9f

    .line 234
    .line 235
    .line 236
    const v16, 0x3f28f5c3    # 0.66f

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const v0, 0x3fdae148    # 1.71f

    .line 243
    .line 244
    .line 245
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v17, -0x3fe0a3d7    # -2.49f

    .line 249
    .line 250
    .line 251
    const v18, -0x3fc1eb85    # -2.97f

    .line 252
    .line 253
    .line 254
    const v13, -0x42b33333    # -0.05f

    .line 255
    .line 256
    .line 257
    const v14, -0x40547ae1    # -1.34f

    .line 258
    .line 259
    .line 260
    const v15, -0x40a147ae    # -0.87f

    .line 261
    .line 262
    .line 263
    const v16, -0x3fdb851f    # -2.57f

    .line 264
    .line 265
    .line 266
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v0, 0x4153ae14    # 13.23f

    .line 270
    .line 271
    .line 272
    const/high16 v2, 0x40a00000    # 5.0f

    .line 273
    .line 274
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v0, 0x412e6666    # 10.9f

    .line 278
    .line 279
    .line 280
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v0, 0x3fd851ec    # 1.69f

    .line 284
    .line 285
    .line 286
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v17, -0x3fd1eb85    # -2.72f

    .line 290
    .line 291
    .line 292
    const v18, 0x4033d70a    # 2.81f

    .line 293
    .line 294
    .line 295
    const v13, -0x403eb852    # -1.51f

    .line 296
    .line 297
    .line 298
    const v14, 0x3ea3d70a    # 0.32f

    .line 299
    .line 300
    .line 301
    const v15, -0x3fd1eb85    # -2.72f

    .line 302
    .line 303
    .line 304
    const v16, 0x3fa66666    # 1.3f

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v17, 0x406a3d71    # 3.66f

    .line 311
    .line 312
    .line 313
    const v18, 0x404d70a4    # 3.21f

    .line 314
    .line 315
    .line 316
    const/4 v13, 0x0

    .line 317
    const v14, 0x3fe51eb8    # 1.79f

    .line 318
    .line 319
    .line 320
    const v15, 0x3fbeb852    # 1.49f

    .line 321
    .line 322
    .line 323
    const v16, 0x402c28f6    # 2.69f

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v17, 0x4015c28f    # 2.34f

    .line 330
    .line 331
    .line 332
    const v18, 0x3fef5c29    # 1.87f

    .line 333
    .line 334
    .line 335
    const v13, 0x3ff9999a    # 1.95f

    .line 336
    .line 337
    .line 338
    const v14, 0x3eeb851f    # 0.46f

    .line 339
    .line 340
    .line 341
    const v15, 0x4015c28f    # 2.34f

    .line 342
    .line 343
    .line 344
    const v16, 0x3f933333    # 1.15f

    .line 345
    .line 346
    .line 347
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v17, -0x3ff9999a    # -2.1f

    .line 351
    .line 352
    .line 353
    const v18, 0x3fb1eb85    # 1.39f

    .line 354
    .line 355
    .line 356
    const/4 v13, 0x0

    .line 357
    const v14, 0x3f07ae14    # 0.53f

    .line 358
    .line 359
    .line 360
    const v15, -0x413851ec    # -0.39f

    .line 361
    .line 362
    .line 363
    const v16, 0x3fb1eb85    # 1.39f

    .line 364
    .line 365
    .line 366
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v17, -0x3feb851f    # -2.32f

    .line 370
    .line 371
    .line 372
    const v18, -0x402e147b    # -1.64f

    .line 373
    .line 374
    .line 375
    const v13, -0x40333333    # -1.6f

    .line 376
    .line 377
    .line 378
    const/4 v14, 0x0

    .line 379
    const v15, -0x3ff147ae    # -2.23f

    .line 380
    .line 381
    .line 382
    const v16, -0x40c7ae14    # -0.72f

    .line 383
    .line 384
    .line 385
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v0, 0x4100a3d7    # 8.04f

    .line 389
    .line 390
    .line 391
    const v2, 0x416547ae    # 14.33f

    .line 392
    .line 393
    .line 394
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v17, 0x40370a3d    # 2.86f

    .line 398
    .line 399
    .line 400
    const v18, 0x403e147b    # 2.97f

    .line 401
    .line 402
    .line 403
    const v13, 0x3dcccccd    # 0.1f

    .line 404
    .line 405
    .line 406
    const v14, 0x3fd9999a    # 1.7f

    .line 407
    .line 408
    .line 409
    const v15, 0x3fae147b    # 1.36f

    .line 410
    .line 411
    .line 412
    const v16, 0x402a3d71    # 2.66f

    .line 413
    .line 414
    .line 415
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const/high16 v0, 0x41980000    # 19.0f

    .line 419
    .line 420
    const v2, 0x412e6666    # 10.9f

    .line 421
    .line 422
    .line 423
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const v0, 0x4015c28f    # 2.34f

    .line 427
    .line 428
    .line 429
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v0, -0x402a3d71    # -1.67f

    .line 433
    .line 434
    .line 435
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v17, 0x402eb852    # 2.73f

    .line 439
    .line 440
    .line 441
    const v18, -0x3fceb852    # -2.77f

    .line 442
    .line 443
    .line 444
    const v13, 0x3fc28f5c    # 1.52f

    .line 445
    .line 446
    .line 447
    const v14, -0x416b851f    # -0.29f

    .line 448
    .line 449
    .line 450
    const v15, 0x402e147b    # 2.72f

    .line 451
    .line 452
    .line 453
    const v16, -0x406b851f    # -1.16f

    .line 454
    .line 455
    .line 456
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v17, -0x3f95c28f    # -3.66f

    .line 460
    .line 461
    .line 462
    const v18, -0x3fa51eb8    # -3.42f

    .line 463
    .line 464
    .line 465
    const v13, -0x43dc28f6    # -0.01f

    .line 466
    .line 467
    .line 468
    const v14, -0x3ff33333    # -2.2f

    .line 469
    .line 470
    .line 471
    const v15, -0x400ccccd    # -1.9f

    .line 472
    .line 473
    .line 474
    const v16, -0x3fc28f5c    # -2.96f

    .line 475
    .line 476
    .line 477
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 484
    .line 485
    .line 486
    move-result-object v2

    .line 487
    const/16 v16, 0x3800

    .line 488
    .line 489
    const/16 v17, 0x0

    .line 490
    .line 491
    const/high16 v6, 0x3f800000    # 1.0f

    .line 492
    .line 493
    const/high16 v8, 0x3f800000    # 1.0f

    .line 494
    .line 495
    const/4 v7, 0x0

    .line 496
    const/high16 v9, 0x3f800000    # 1.0f

    .line 497
    .line 498
    const/high16 v12, 0x3f800000    # 1.0f

    .line 499
    .line 500
    const/4 v13, 0x0

    .line 501
    const/4 v14, 0x0

    .line 502
    const/4 v15, 0x0

    .line 503
    const-string v4, ""

    .line 504
    .line 505
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    sput-object v0, Landroidx/compose/material/icons/outlined/MonetizationOnKt;->_monetizationOn:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 514
    .line 515
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 516
    .line 517
    .line 518
    return-object v0
.end method
