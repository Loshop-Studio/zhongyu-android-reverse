.class public final Landroidx/compose/material/icons/rounded/CleanHandsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_cleanHands",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "CleanHands",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getCleanHands",
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
        "SMAP\nCleanHands.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CleanHands.kt\nandroidx/compose/material/icons/rounded/CleanHandsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,107:1\n212#2,12:108\n233#2,18:121\n253#2:158\n174#3:120\n705#4,2:139\n717#4,2:141\n719#4,11:147\n72#5,4:143\n*S KotlinDebug\n*F\n+ 1 CleanHands.kt\nandroidx/compose/material/icons/rounded/CleanHandsKt\n*L\n29#1:108,12\n30#1:121,18\n30#1:158\n29#1:120\n30#1:139,2\n30#1:141,2\n30#1:147,11\n30#1:143,4\n*E\n"
    }
.end annotation


# static fields
.field private static _cleanHands:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCleanHands(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/CleanHandsKt;->_cleanHands:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.CleanHands"

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
    const v0, 0x416fd70a    # 14.99f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x40e00000    # 7.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, -0x40deb852    # -0.63f

    .line 79
    .line 80
    .line 81
    const v2, 0x3faf5c29    # 1.37f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v0, 0x40a00000    # 5.0f

    .line 88
    .line 89
    const v2, 0x4187eb85    # 16.99f

    .line 90
    .line 91
    .line 92
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const v0, 0x3f2147ae    # 0.63f

    .line 96
    .line 97
    .line 98
    const v2, 0x3faf5c29    # 1.37f

    .line 99
    .line 100
    .line 101
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v0, 0x4197eb85    # 18.99f

    .line 105
    .line 106
    .line 107
    const/high16 v2, 0x40e00000    # 7.0f

    .line 108
    .line 109
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v0, -0x4050a3d7    # -1.37f

    .line 113
    .line 114
    .line 115
    const v2, 0x3f2147ae    # 0.63f

    .line 116
    .line 117
    .line 118
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v0, 0x41100000    # 9.0f

    .line 122
    .line 123
    const v2, 0x4187eb85    # 16.99f

    .line 124
    .line 125
    .line 126
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v0, -0x4050a3d7    # -1.37f

    .line 130
    .line 131
    .line 132
    const v2, -0x40deb852    # -0.63f

    .line 133
    .line 134
    .line 135
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v0, 0x416fd70a    # 14.99f

    .line 139
    .line 140
    .line 141
    const/high16 v2, 0x40e00000    # 7.0f

    .line 142
    .line 143
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v0, 0x41a00000    # 20.0f

    .line 150
    .line 151
    const/high16 v2, 0x41600000    # 14.0f

    .line 152
    .line 153
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const/high16 v17, 0x40000000    # 2.0f

    .line 157
    .line 158
    const/high16 v18, -0x40000000    # -2.0f

    .line 159
    .line 160
    const v13, 0x3f8ccccd    # 1.1f

    .line 161
    .line 162
    .line 163
    const/4 v14, 0x0

    .line 164
    const/high16 v15, 0x40000000    # 2.0f

    .line 165
    .line 166
    const v16, -0x4099999a    # -0.9f

    .line 167
    .line 168
    .line 169
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v17, -0x4035c28f    # -1.58f

    .line 173
    .line 174
    .line 175
    const v18, -0x3fa8f5c3    # -3.36f

    .line 176
    .line 177
    .line 178
    const/4 v13, 0x0

    .line 179
    const v14, -0x40b851ec    # -0.78f

    .line 180
    .line 181
    .line 182
    const v15, -0x40828f5c    # -0.99f

    .line 183
    .line 184
    .line 185
    const v16, -0x3fe3d70a    # -2.44f

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v17, -0x40a8f5c3    # -0.84f

    .line 192
    .line 193
    .line 194
    const/16 v18, 0x0

    .line 195
    .line 196
    const v13, -0x41b33333    # -0.2f

    .line 197
    .line 198
    .line 199
    const v14, -0x416147ae    # -0.31f

    .line 200
    .line 201
    .line 202
    const v15, -0x40dc28f6    # -0.64f

    .line 203
    .line 204
    .line 205
    const v16, -0x416147ae    # -0.31f

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v17, 0x41900000    # 18.0f

    .line 212
    .line 213
    const/high16 v18, 0x41400000    # 12.0f

    .line 214
    .line 215
    const v13, 0x4197eb85    # 18.99f

    .line 216
    .line 217
    .line 218
    const v14, 0x4118f5c3    # 9.56f

    .line 219
    .line 220
    .line 221
    const/high16 v15, 0x41900000    # 18.0f

    .line 222
    .line 223
    const v16, 0x4133851f    # 11.22f

    .line 224
    .line 225
    .line 226
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v17, 0x41a00000    # 20.0f

    .line 230
    .line 231
    const/high16 v18, 0x41600000    # 14.0f

    .line 232
    .line 233
    const/high16 v13, 0x41900000    # 18.0f

    .line 234
    .line 235
    const v14, 0x4151999a    # 13.1f

    .line 236
    .line 237
    .line 238
    const v15, 0x41973333    # 18.9f

    .line 239
    .line 240
    .line 241
    const/high16 v16, 0x41600000    # 14.0f

    .line 242
    .line 243
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v0, 0x41180000    # 9.5f

    .line 250
    .line 251
    const v2, 0x4113d70a    # 9.24f

    .line 252
    .line 253
    .line 254
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const/high16 v0, 0x41700000    # 15.0f

    .line 258
    .line 259
    const v2, 0x413a6666    # 11.65f

    .line 260
    .line 261
    .line 262
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v0, 0x41300000    # 11.0f

    .line 266
    .line 267
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v17, -0x3f800000    # -4.0f

    .line 271
    .line 272
    const v18, -0x3f633333    # -4.9f

    .line 273
    .line 274
    .line 275
    const/4 v13, 0x0

    .line 276
    const v14, -0x3fe51eb8    # -2.42f

    .line 277
    .line 278
    .line 279
    const v15, -0x4023d70a    # -1.72f

    .line 280
    .line 281
    .line 282
    const v16, -0x3f71eb85    # -4.44f

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v0, 0x40800000    # 4.0f

    .line 289
    .line 290
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v0, 0x40000000    # 2.0f

    .line 294
    .line 295
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v17, 0x3f800000    # 1.0f

    .line 299
    .line 300
    const v18, 0x3e3851ec    # 0.18f

    .line 301
    .line 302
    .line 303
    const v13, 0x3eb33333    # 0.35f

    .line 304
    .line 305
    .line 306
    const/4 v14, 0x0

    .line 307
    const v15, 0x3f2e147b    # 0.68f

    .line 308
    .line 309
    .line 310
    const v16, 0x3d75c28f    # 0.06f

    .line 311
    .line 312
    .line 313
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v17, 0x3f866666    # 1.05f

    .line 317
    .line 318
    .line 319
    const v18, -0x419eb852    # -0.22f

    .line 320
    .line 321
    .line 322
    const v13, 0x3ebd70a4    # 0.37f

    .line 323
    .line 324
    .line 325
    const v14, 0x3e051eb8    # 0.13f

    .line 326
    .line 327
    .line 328
    const v15, 0x3f47ae14    # 0.78f

    .line 329
    .line 330
    .line 331
    const v16, 0x3d4ccccd    # 0.05f

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/4 v0, 0x0

    .line 338
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v17, -0x41570a3d    # -0.33f

    .line 342
    .line 343
    .line 344
    const v18, -0x402e147b    # -1.64f

    .line 345
    .line 346
    .line 347
    const v13, 0x3f028f5c    # 0.51f

    .line 348
    .line 349
    .line 350
    const v14, -0x40fd70a4    # -0.51f

    .line 351
    .line 352
    .line 353
    const v15, 0x3eae147b    # 0.34f

    .line 354
    .line 355
    .line 356
    const v16, -0x404e147b    # -1.39f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v17, 0x41500000    # 13.0f

    .line 363
    .line 364
    const/high16 v18, 0x40000000    # 2.0f

    .line 365
    .line 366
    const v13, 0x41630a3d    # 14.19f

    .line 367
    .line 368
    .line 369
    const v14, 0x40070a3d    # 2.11f

    .line 370
    .line 371
    .line 372
    const v15, 0x4159c28f    # 13.61f

    .line 373
    .line 374
    .line 375
    const/high16 v16, 0x40000000    # 2.0f

    .line 376
    .line 377
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v0, 0x41080000    # 8.5f

    .line 381
    .line 382
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v17, -0x40800000    # -1.0f

    .line 386
    .line 387
    const/high16 v18, 0x3f800000    # 1.0f

    .line 388
    .line 389
    const v13, -0x40f33333    # -0.55f

    .line 390
    .line 391
    .line 392
    const/4 v14, 0x0

    .line 393
    const/high16 v15, -0x40800000    # -1.0f

    .line 394
    .line 395
    const v16, 0x3ee66666    # 0.45f

    .line 396
    .line 397
    .line 398
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/4 v0, 0x0

    .line 402
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v17, 0x3f800000    # 1.0f

    .line 406
    .line 407
    const/4 v13, 0x0

    .line 408
    const v14, 0x3f0ccccd    # 0.55f

    .line 409
    .line 410
    .line 411
    const v15, 0x3ee66666    # 0.45f

    .line 412
    .line 413
    .line 414
    const/high16 v16, 0x3f800000    # 1.0f

    .line 415
    .line 416
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const/high16 v0, 0x41100000    # 9.0f

    .line 420
    .line 421
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v0, 0x40070a3d    # 2.11f

    .line 425
    .line 426
    .line 427
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v17, 0x40a80000    # 5.25f

    .line 431
    .line 432
    const/high16 v18, 0x41180000    # 9.5f

    .line 433
    .line 434
    const v13, 0x40e70a3d    # 7.22f

    .line 435
    .line 436
    .line 437
    const v14, 0x40cf5c29    # 6.48f

    .line 438
    .line 439
    .line 440
    const v15, 0x40b9999a    # 5.8f

    .line 441
    .line 442
    .line 443
    const v16, 0x40f947ae    # 7.79f

    .line 444
    .line 445
    .line 446
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v0, 0x4113d70a    # 9.24f

    .line 450
    .line 451
    .line 452
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const/high16 v0, 0x40400000    # 3.0f

    .line 459
    .line 460
    const/high16 v2, 0x41300000    # 11.0f

    .line 461
    .line 462
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const/high16 v17, -0x40000000    # -2.0f

    .line 469
    .line 470
    const/high16 v18, 0x40000000    # 2.0f

    .line 471
    .line 472
    const v13, -0x40733333    # -1.1f

    .line 473
    .line 474
    .line 475
    const/4 v14, 0x0

    .line 476
    const/high16 v15, -0x40000000    # -2.0f

    .line 477
    .line 478
    const v16, 0x3f666666    # 0.9f

    .line 479
    .line 480
    .line 481
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const/high16 v0, 0x40e00000    # 7.0f

    .line 485
    .line 486
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const/high16 v17, 0x40000000    # 2.0f

    .line 490
    .line 491
    const/4 v13, 0x0

    .line 492
    const v14, 0x3f8ccccd    # 1.1f

    .line 493
    .line 494
    .line 495
    const v15, 0x3f666666    # 0.9f

    .line 496
    .line 497
    .line 498
    const/high16 v16, 0x40000000    # 2.0f

    .line 499
    .line 500
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const/4 v0, 0x0

    .line 504
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const/high16 v18, -0x40000000    # -2.0f

    .line 508
    .line 509
    const v13, 0x3f8ccccd    # 1.1f

    .line 510
    .line 511
    .line 512
    const/4 v14, 0x0

    .line 513
    const/high16 v15, 0x40000000    # 2.0f

    .line 514
    .line 515
    const v16, -0x4099999a    # -0.9f

    .line 516
    .line 517
    .line 518
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const/high16 v0, -0x3f200000    # -7.0f

    .line 522
    .line 523
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const/high16 v17, 0x40400000    # 3.0f

    .line 527
    .line 528
    const/high16 v18, 0x41300000    # 11.0f

    .line 529
    .line 530
    const/high16 v13, 0x40a00000    # 5.0f

    .line 531
    .line 532
    const v14, 0x413e6666    # 11.9f

    .line 533
    .line 534
    .line 535
    const v15, 0x40833333    # 4.1f

    .line 536
    .line 537
    .line 538
    const/high16 v16, 0x41300000    # 11.0f

    .line 539
    .line 540
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const v0, 0x419feb85    # 19.99f

    .line 547
    .line 548
    .line 549
    const/high16 v2, 0x41880000    # 17.0f

    .line 550
    .line 551
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const v0, -0x3f2570a4    # -6.83f

    .line 555
    .line 556
    .line 557
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v17, -0x41570a3d    # -0.33f

    .line 561
    .line 562
    .line 563
    const v18, -0x428a3d71    # -0.06f

    .line 564
    .line 565
    .line 566
    const v13, -0x421eb852    # -0.11f

    .line 567
    .line 568
    .line 569
    const/4 v14, 0x0

    .line 570
    const v15, -0x419eb852    # -0.22f

    .line 571
    .line 572
    .line 573
    const v16, -0x435c28f6    # -0.02f

    .line 574
    .line 575
    .line 576
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const v0, -0x4043d70a    # -1.47f

    .line 580
    .line 581
    .line 582
    const v2, -0x40fd70a4    # -0.51f

    .line 583
    .line 584
    .line 585
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const v17, -0x41666666    # -0.3f

    .line 589
    .line 590
    .line 591
    const v18, -0x40deb852    # -0.63f

    .line 592
    .line 593
    .line 594
    const v13, -0x417ae148    # -0.26f

    .line 595
    .line 596
    .line 597
    const v14, -0x4247ae14    # -0.09f

    .line 598
    .line 599
    .line 600
    const v15, -0x413851ec    # -0.39f

    .line 601
    .line 602
    .line 603
    const v16, -0x41428f5c    # -0.37f

    .line 604
    .line 605
    .line 606
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const/4 v0, 0x0

    .line 610
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const v17, 0x3f23d70a    # 0.64f

    .line 614
    .line 615
    .line 616
    const v18, -0x41666666    # -0.3f

    .line 617
    .line 618
    .line 619
    const v13, 0x3db851ec    # 0.09f

    .line 620
    .line 621
    .line 622
    const v14, -0x417ae148    # -0.26f

    .line 623
    .line 624
    .line 625
    const v15, 0x3ec28f5c    # 0.38f

    .line 626
    .line 627
    .line 628
    const v16, -0x41333333    # -0.4f

    .line 629
    .line 630
    .line 631
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const v0, 0x3f8f5c29    # 1.12f

    .line 635
    .line 636
    .line 637
    const v2, 0x3edc28f6    # 0.43f

    .line 638
    .line 639
    .line 640
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const v17, 0x3eb851ec    # 0.36f

    .line 644
    .line 645
    .line 646
    const v18, 0x3d8f5c29    # 0.07f

    .line 647
    .line 648
    .line 649
    const v13, 0x3de147ae    # 0.11f

    .line 650
    .line 651
    .line 652
    const v14, 0x3d23d70a    # 0.04f

    .line 653
    .line 654
    .line 655
    const v15, 0x3e75c28f    # 0.24f

    .line 656
    .line 657
    .line 658
    const v16, 0x3d8f5c29    # 0.07f

    .line 659
    .line 660
    .line 661
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const v0, 0x402851ec    # 2.63f

    .line 665
    .line 666
    .line 667
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const v17, 0x3f970a3d    # 1.18f

    .line 671
    .line 672
    .line 673
    const v18, -0x4068f5c3    # -1.18f

    .line 674
    .line 675
    .line 676
    const v13, 0x3f266666    # 0.65f

    .line 677
    .line 678
    .line 679
    const/4 v14, 0x0

    .line 680
    const v15, 0x3f970a3d    # 1.18f

    .line 681
    .line 682
    .line 683
    const v16, -0x40f851ec    # -0.53f

    .line 684
    .line 685
    .line 686
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const/4 v0, 0x0

    .line 690
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 691
    .line 692
    .line 693
    const v17, -0x40bae148    # -0.77f

    .line 694
    .line 695
    .line 696
    const v18, -0x4071eb85    # -1.11f

    .line 697
    .line 698
    .line 699
    const/4 v13, 0x0

    .line 700
    const v14, -0x41051eb8    # -0.49f

    .line 701
    .line 702
    .line 703
    const v15, -0x416147ae    # -0.31f

    .line 704
    .line 705
    .line 706
    const v16, -0x4091eb85    # -0.93f

    .line 707
    .line 708
    .line 709
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    const v0, 0x4114cccd    # 9.3f

    .line 713
    .line 714
    .line 715
    const v2, 0x4132147b    # 11.13f

    .line 716
    .line 717
    .line 718
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    const v17, 0x4109999a    # 8.6f

    .line 722
    .line 723
    .line 724
    const/high16 v18, 0x41300000    # 11.0f

    .line 725
    .line 726
    const v13, 0x411147ae    # 9.08f

    .line 727
    .line 728
    .line 729
    const v14, 0x4130a3d7    # 11.04f

    .line 730
    .line 731
    .line 732
    const v15, 0x410d70a4    # 8.84f

    .line 733
    .line 734
    .line 735
    const/high16 v16, 0x41300000    # 11.0f

    .line 736
    .line 737
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    const/high16 v0, 0x40e00000    # 7.0f

    .line 741
    .line 742
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    const v0, 0x411051ec    # 9.02f

    .line 746
    .line 747
    .line 748
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 749
    .line 750
    .line 751
    const v0, 0x40cbd70a    # 6.37f

    .line 752
    .line 753
    .line 754
    const v2, 0x3fe7ae14    # 1.81f

    .line 755
    .line 756
    .line 757
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 758
    .line 759
    .line 760
    const/high16 v17, 0x3fa00000    # 1.25f

    .line 761
    .line 762
    const v18, -0x42b33333    # -0.05f

    .line 763
    .line 764
    .line 765
    const v13, 0x3ed1eb85    # 0.41f

    .line 766
    .line 767
    .line 768
    const v14, 0x3df5c28f    # 0.12f

    .line 769
    .line 770
    .line 771
    const v15, 0x3f59999a    # 0.85f

    .line 772
    .line 773
    .line 774
    const v16, 0x3dcccccd    # 0.1f

    .line 775
    .line 776
    .line 777
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 778
    .line 779
    .line 780
    const/high16 v0, 0x41b00000    # 22.0f

    .line 781
    .line 782
    const/high16 v2, 0x41980000    # 19.0f

    .line 783
    .line 784
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 785
    .line 786
    .line 787
    const/4 v0, 0x0

    .line 788
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 789
    .line 790
    .line 791
    const v17, 0x419feb85    # 19.99f

    .line 792
    .line 793
    .line 794
    const/high16 v18, 0x41880000    # 17.0f

    .line 795
    .line 796
    const/high16 v13, 0x41b00000    # 22.0f

    .line 797
    .line 798
    const v14, 0x418f1eb8    # 17.89f

    .line 799
    .line 800
    .line 801
    const v15, 0x41a8cccd    # 21.1f

    .line 802
    .line 803
    .line 804
    const/high16 v16, 0x41880000    # 17.0f

    .line 805
    .line 806
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 807
    .line 808
    .line 809
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 810
    .line 811
    .line 812
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 813
    .line 814
    .line 815
    move-result-object v2

    .line 816
    const/16 v16, 0x3800

    .line 817
    .line 818
    const/16 v17, 0x0

    .line 819
    .line 820
    const/high16 v6, 0x3f800000    # 1.0f

    .line 821
    .line 822
    const/high16 v8, 0x3f800000    # 1.0f

    .line 823
    .line 824
    const/4 v7, 0x0

    .line 825
    const/high16 v9, 0x3f800000    # 1.0f

    .line 826
    .line 827
    const/high16 v12, 0x3f800000    # 1.0f

    .line 828
    .line 829
    const/4 v13, 0x0

    .line 830
    const/4 v14, 0x0

    .line 831
    const/4 v15, 0x0

    .line 832
    const-string v4, ""

    .line 833
    .line 834
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 835
    .line 836
    .line 837
    move-result-object v0

    .line 838
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 839
    .line 840
    .line 841
    move-result-object v0

    .line 842
    sput-object v0, Landroidx/compose/material/icons/rounded/CleanHandsKt;->_cleanHands:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 843
    .line 844
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 845
    .line 846
    .line 847
    return-object v0
.end method
