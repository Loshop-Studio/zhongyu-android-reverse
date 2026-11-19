.class public final Landroidx/compose/material/icons/rounded/ElderlyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_elderly",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Elderly",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getElderly",
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
        "SMAP\nElderly.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Elderly.kt\nandroidx/compose/material/icons/rounded/ElderlyKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,91:1\n212#2,12:92\n233#2,18:105\n253#2:142\n174#3:104\n705#4,2:123\n717#4,2:125\n719#4,11:131\n72#5,4:127\n*S KotlinDebug\n*F\n+ 1 Elderly.kt\nandroidx/compose/material/icons/rounded/ElderlyKt\n*L\n29#1:92,12\n30#1:105,18\n30#1:142\n29#1:104\n30#1:123,2\n30#1:125,2\n30#1:131,11\n30#1:127,4\n*E\n"
    }
.end annotation


# static fields
.field private static _elderly:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getElderly(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ElderlyKt;->_elderly:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Elderly"

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
    const/high16 v0, 0x40600000    # 3.5f

    .line 71
    .line 72
    const/high16 v2, 0x41380000    # 11.5f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x40000000    # 2.0f

    .line 78
    .line 79
    const/high16 v18, -0x40000000    # -2.0f

    .line 80
    .line 81
    const/4 v13, 0x0

    .line 82
    const v14, -0x40733333    # -1.1f

    .line 83
    .line 84
    .line 85
    const v15, 0x3f666666    # 0.9f

    .line 86
    .line 87
    .line 88
    const/high16 v16, -0x40000000    # -2.0f

    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, 0x3f666666    # 0.9f

    .line 94
    .line 95
    .line 96
    const/high16 v2, 0x40000000    # 2.0f

    .line 97
    .line 98
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v17, -0x40000000    # -2.0f

    .line 102
    .line 103
    const/high16 v18, 0x40000000    # 2.0f

    .line 104
    .line 105
    const v14, 0x3f8ccccd    # 1.1f

    .line 106
    .line 107
    .line 108
    const v15, -0x4099999a    # -0.9f

    .line 109
    .line 110
    .line 111
    const/high16 v16, 0x40000000    # 2.0f

    .line 112
    .line 113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v0, 0x40933333    # 4.6f

    .line 117
    .line 118
    .line 119
    const/high16 v2, 0x40600000    # 3.5f

    .line 120
    .line 121
    const/high16 v4, 0x41380000    # 11.5f

    .line 122
    .line 123
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v0, 0x41943d71    # 18.53f

    .line 130
    .line 131
    .line 132
    const/high16 v2, 0x41300000    # 11.0f

    .line 133
    .line 134
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v17, -0x3f99999a    # -3.6f

    .line 138
    .line 139
    .line 140
    const v18, -0x3ff28f5c    # -2.21f

    .line 141
    .line 142
    .line 143
    const v13, -0x40370a3d    # -1.57f

    .line 144
    .line 145
    .line 146
    const v14, 0x3c23d70a    # 0.01f

    .line 147
    .line 148
    .line 149
    const v15, -0x3fc3d70a    # -2.94f

    .line 150
    .line 151
    .line 152
    const v16, -0x4099999a    # -0.9f

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v0, -0x40b5c28f    # -0.79f

    .line 159
    .line 160
    .line 161
    const v2, -0x402a3d71    # -1.67f

    .line 162
    .line 163
    .line 164
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/4 v0, 0x0

    .line 168
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v17, -0x40b33333    # -0.8f

    .line 172
    .line 173
    .line 174
    const v18, -0x40a66666    # -0.85f

    .line 175
    .line 176
    .line 177
    const v13, -0x41d1eb85    # -0.17f

    .line 178
    .line 179
    .line 180
    const v14, -0x414ccccd    # -0.35f

    .line 181
    .line 182
    .line 183
    const v15, -0x411eb852    # -0.44f

    .line 184
    .line 185
    .line 186
    const v16, -0x40d9999a    # -0.65f

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v17, -0x4007ae14    # -1.94f

    .line 193
    .line 194
    .line 195
    const v18, -0x430a3d71    # -0.03f

    .line 196
    .line 197
    .line 198
    const v13, -0x40e147ae    # -0.62f

    .line 199
    .line 200
    .line 201
    const v14, -0x4147ae14    # -0.36f

    .line 202
    .line 203
    .line 204
    const v15, -0x40533333    # -1.35f

    .line 205
    .line 206
    .line 207
    const v16, -0x4151eb85    # -0.34f

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v0, -0x43dc28f6    # -0.01f

    .line 214
    .line 215
    .line 216
    const/4 v2, 0x0

    .line 217
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v0, 0x40e051ec    # 7.01f

    .line 221
    .line 222
    .line 223
    const v2, 0x410bae14    # 8.73f

    .line 224
    .line 225
    .line 226
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v17, 0x40c00000    # 6.0f

    .line 230
    .line 231
    const v18, 0x41275c29    # 10.46f

    .line 232
    .line 233
    .line 234
    const v13, 0x40cc7ae1    # 6.39f

    .line 235
    .line 236
    .line 237
    const v14, 0x411147ae    # 9.08f

    .line 238
    .line 239
    .line 240
    const/high16 v15, 0x40c00000    # 6.0f

    .line 241
    .line 242
    const v16, 0x411bd70a    # 9.74f

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const/high16 v0, 0x41500000    # 13.0f

    .line 249
    .line 250
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const/high16 v17, 0x3f800000    # 1.0f

    .line 254
    .line 255
    const/high16 v18, 0x3f800000    # 1.0f

    .line 256
    .line 257
    const/4 v13, 0x0

    .line 258
    const v14, 0x3f0ccccd    # 0.55f

    .line 259
    .line 260
    .line 261
    const v15, 0x3ee66666    # 0.45f

    .line 262
    .line 263
    .line 264
    const/high16 v16, 0x3f800000    # 1.0f

    .line 265
    .line 266
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/4 v0, 0x0

    .line 270
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v18, -0x40800000    # -1.0f

    .line 274
    .line 275
    const v13, 0x3f0ccccd    # 0.55f

    .line 276
    .line 277
    .line 278
    const/4 v14, 0x0

    .line 279
    const/high16 v15, 0x3f800000    # 1.0f

    .line 280
    .line 281
    const v16, -0x4119999a    # -0.45f

    .line 282
    .line 283
    .line 284
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const v0, -0x3fdd70a4    # -2.54f

    .line 288
    .line 289
    .line 290
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 294
    .line 295
    const v2, -0x40a66666    # -0.85f

    .line 296
    .line 297
    .line 298
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const/high16 v17, 0x41100000    # 9.0f

    .line 302
    .line 303
    const/high16 v18, 0x41500000    # 13.0f

    .line 304
    .line 305
    const v13, 0x4112e148    # 9.18f

    .line 306
    .line 307
    .line 308
    const v14, 0x412b5c29    # 10.71f

    .line 309
    .line 310
    .line 311
    const/high16 v15, 0x41100000    # 9.0f

    .line 312
    .line 313
    const v16, 0x413d999a    # 11.85f

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v0, 0x40aa8f5c    # 5.33f

    .line 320
    .line 321
    .line 322
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const/high16 v0, 0x40e00000    # 7.0f

    .line 326
    .line 327
    const/high16 v2, 0x41a80000    # 21.0f

    .line 328
    .line 329
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v17, 0x3e4ccccd    # 0.2f

    .line 333
    .line 334
    .line 335
    const v18, 0x3fb33333    # 1.4f

    .line 336
    .line 337
    .line 338
    const v13, -0x41570a3d    # -0.33f

    .line 339
    .line 340
    .line 341
    const v14, 0x3ee147ae    # 0.44f

    .line 342
    .line 343
    .line 344
    const v15, -0x418a3d71    # -0.24f

    .line 345
    .line 346
    .line 347
    const v16, 0x3f88f5c3    # 1.07f

    .line 348
    .line 349
    .line 350
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v17, 0x3fb33333    # 1.4f

    .line 354
    .line 355
    .line 356
    const v18, -0x41b33333    # -0.2f

    .line 357
    .line 358
    .line 359
    const v13, 0x3ee147ae    # 0.44f

    .line 360
    .line 361
    .line 362
    const v14, 0x3ea8f5c3    # 0.33f

    .line 363
    .line 364
    .line 365
    const v15, 0x3f88f5c3    # 1.07f

    .line 366
    .line 367
    .line 368
    const v16, 0x3e75c28f    # 0.24f

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v0, 0x40028f5c    # 2.04f

    .line 375
    .line 376
    .line 377
    const v2, -0x3fd1eb85    # -2.72f

    .line 378
    .line 379
    .line 380
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v17, 0x3ecccccd    # 0.4f

    .line 384
    .line 385
    .line 386
    const v18, -0x4075c28f    # -1.08f

    .line 387
    .line 388
    .line 389
    const v13, 0x3e6b851f    # 0.23f

    .line 390
    .line 391
    .line 392
    const v14, -0x416147ae    # -0.31f

    .line 393
    .line 394
    .line 395
    const v15, 0x3ebd70a4    # 0.37f

    .line 396
    .line 397
    .line 398
    const v16, -0x40cf5c29    # -0.69f

    .line 399
    .line 400
    .line 401
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v0, 0x3e3851ec    # 0.18f

    .line 405
    .line 406
    .line 407
    const v2, -0x3fc3d70a    # -2.94f

    .line 408
    .line 409
    .line 410
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v0, 0x41900000    # 18.0f

    .line 414
    .line 415
    const/high16 v2, 0x41500000    # 13.0f

    .line 416
    .line 417
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v0, 0x40800000    # 4.0f

    .line 421
    .line 422
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/high16 v17, 0x3f800000    # 1.0f

    .line 426
    .line 427
    const/high16 v18, 0x3f800000    # 1.0f

    .line 428
    .line 429
    const/4 v13, 0x0

    .line 430
    const v14, 0x3f0ccccd    # 0.55f

    .line 431
    .line 432
    .line 433
    const v15, 0x3ee66666    # 0.45f

    .line 434
    .line 435
    .line 436
    const/high16 v16, 0x3f800000    # 1.0f

    .line 437
    .line 438
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/4 v0, 0x0

    .line 442
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const/high16 v18, -0x40800000    # -1.0f

    .line 446
    .line 447
    const v13, 0x3f0ccccd    # 0.55f

    .line 448
    .line 449
    .line 450
    const/4 v14, 0x0

    .line 451
    const/high16 v15, 0x3f800000    # 1.0f

    .line 452
    .line 453
    const v16, -0x4119999a    # -0.45f

    .line 454
    .line 455
    .line 456
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v0, -0x3f6428f6    # -4.87f

    .line 460
    .line 461
    .line 462
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const v17, -0x4147ae14    # -0.36f

    .line 466
    .line 467
    .line 468
    const v18, -0x406ccccd    # -1.15f

    .line 469
    .line 470
    .line 471
    const/4 v13, 0x0

    .line 472
    const v14, -0x412e147b    # -0.41f

    .line 473
    .line 474
    .line 475
    const v15, -0x41fae148    # -0.13f

    .line 476
    .line 477
    .line 478
    const v16, -0x40b0a3d7    # -0.81f

    .line 479
    .line 480
    .line 481
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const v0, -0x40333333    # -1.6f

    .line 485
    .line 486
    .line 487
    const v2, -0x3fed70a4    # -2.29f

    .line 488
    .line 489
    .line 490
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/16 v17, 0x0

    .line 494
    .line 495
    const v18, -0x43dc28f6    # -0.01f

    .line 496
    .line 497
    .line 498
    const/4 v14, 0x0

    .line 499
    const/4 v15, 0x0

    .line 500
    const/16 v16, 0x0

    .line 501
    .line 502
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const v17, 0x3eeb851f    # 0.46f

    .line 506
    .line 507
    .line 508
    const v18, -0x3fa66666    # -3.4f

    .line 509
    .line 510
    .line 511
    const v13, -0x421eb852    # -0.11f

    .line 512
    .line 513
    .line 514
    const v14, -0x406b851f    # -1.16f

    .line 515
    .line 516
    .line 517
    const v15, 0x3d8f5c29    # 0.07f

    .line 518
    .line 519
    .line 520
    const v16, -0x3feb851f    # -2.32f

    .line 521
    .line 522
    .line 523
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const v17, 0x4060a3d7    # 3.51f

    .line 527
    .line 528
    .line 529
    const v18, 0x402147ae    # 2.52f

    .line 530
    .line 531
    .line 532
    const v13, 0x3f4f5c29    # 0.81f

    .line 533
    .line 534
    .line 535
    const v14, 0x3f9d70a4    # 1.23f

    .line 536
    .line 537
    .line 538
    const v15, 0x40033333    # 2.05f

    .line 539
    .line 540
    .line 541
    const v16, 0x4008f5c3    # 2.14f

    .line 542
    .line 543
    .line 544
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const v0, 0x3cf5c28f    # 0.03f

    .line 548
    .line 549
    .line 550
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const/high16 v0, 0x41500000    # 13.0f

    .line 554
    .line 555
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const/high16 v17, 0x3f000000    # 0.5f

    .line 559
    .line 560
    const/high16 v18, 0x3f000000    # 0.5f

    .line 561
    .line 562
    const/4 v13, 0x0

    .line 563
    const v14, 0x3e8f5c29    # 0.28f

    .line 564
    .line 565
    .line 566
    const v15, 0x3e6147ae    # 0.22f

    .line 567
    .line 568
    .line 569
    const/high16 v16, 0x3f000000    # 0.5f

    .line 570
    .line 571
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const v0, 0x41547ae1    # 13.28f

    .line 575
    .line 576
    .line 577
    const/high16 v2, 0x41900000    # 18.0f

    .line 578
    .line 579
    const/high16 v4, 0x41500000    # 13.0f

    .line 580
    .line 581
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const v0, -0x41dc28f6    # -0.16f

    .line 585
    .line 586
    .line 587
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const/high16 v0, 0x41480000    # 12.5f

    .line 591
    .line 592
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    const/high16 v18, -0x41000000    # -0.5f

    .line 596
    .line 597
    const v14, -0x4170a3d7    # -0.28f

    .line 598
    .line 599
    .line 600
    const/high16 v16, -0x41000000    # -0.5f

    .line 601
    .line 602
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const v0, 0x3e6147ae    # 0.22f

    .line 606
    .line 607
    .line 608
    const/high16 v2, 0x3f000000    # 0.5f

    .line 609
    .line 610
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const/high16 v0, 0x41200000    # 10.0f

    .line 614
    .line 615
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const/high16 v18, 0x3f000000    # 0.5f

    .line 619
    .line 620
    const v14, 0x3e8f5c29    # 0.28f

    .line 621
    .line 622
    .line 623
    const/high16 v16, 0x3f000000    # 0.5f

    .line 624
    .line 625
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const v0, -0x419eb852    # -0.22f

    .line 629
    .line 630
    .line 631
    const/high16 v2, -0x41000000    # -0.5f

    .line 632
    .line 633
    const/high16 v4, 0x3f000000    # 0.5f

    .line 634
    .line 635
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const/high16 v0, -0x3ee00000    # -10.0f

    .line 639
    .line 640
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const v17, 0x41943d71    # 18.53f

    .line 644
    .line 645
    .line 646
    const/high16 v18, 0x41300000    # 11.0f

    .line 647
    .line 648
    const/high16 v13, 0x41a00000    # 20.0f

    .line 649
    .line 650
    const v14, 0x413ae148    # 11.68f

    .line 651
    .line 652
    .line 653
    const v15, 0x419ab852    # 19.34f

    .line 654
    .line 655
    .line 656
    const v16, 0x412fd70a    # 10.99f

    .line 657
    .line 658
    .line 659
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 666
    .line 667
    .line 668
    move-result-object v2

    .line 669
    const/16 v16, 0x3800

    .line 670
    .line 671
    const/16 v17, 0x0

    .line 672
    .line 673
    const/high16 v6, 0x3f800000    # 1.0f

    .line 674
    .line 675
    const/high16 v8, 0x3f800000    # 1.0f

    .line 676
    .line 677
    const/4 v7, 0x0

    .line 678
    const/high16 v9, 0x3f800000    # 1.0f

    .line 679
    .line 680
    const/high16 v12, 0x3f800000    # 1.0f

    .line 681
    .line 682
    const/4 v13, 0x0

    .line 683
    const/4 v14, 0x0

    .line 684
    const/4 v15, 0x0

    .line 685
    const-string v4, ""

    .line 686
    .line 687
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 688
    .line 689
    .line 690
    move-result-object v0

    .line 691
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 692
    .line 693
    .line 694
    move-result-object v0

    .line 695
    sput-object v0, Landroidx/compose/material/icons/rounded/ElderlyKt;->_elderly:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 696
    .line 697
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 698
    .line 699
    .line 700
    return-object v0
.end method
