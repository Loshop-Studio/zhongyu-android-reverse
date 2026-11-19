.class public final Landroidx/compose/material/icons/automirrored/filled/PhoneMissedKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_phoneMissed",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "PhoneMissed",
        "Landroidx/compose/material/icons/Icons$AutoMirrored$Filled;",
        "getPhoneMissed",
        "(Landroidx/compose/material/icons/Icons$AutoMirrored$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nPhoneMissed.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneMissed.kt\nandroidx/compose/material/icons/automirrored/filled/PhoneMissedKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,72:1\n223#2:73\n216#2,3:74\n219#2,4:78\n233#2,18:82\n253#2:119\n174#3:77\n705#4,2:100\n717#4,2:102\n719#4,11:108\n72#5,4:104\n*S KotlinDebug\n*F\n+ 1 PhoneMissed.kt\nandroidx/compose/material/icons/automirrored/filled/PhoneMissedKt\n*L\n29#1:73\n29#1:74,3\n29#1:78,4\n30#1:82,18\n30#1:119\n29#1:77\n30#1:100,2\n30#1:102,2\n30#1:108,11\n30#1:104,4\n*E\n"
    }
.end annotation


# static fields
.field private static _phoneMissed:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPhoneMissed(Landroidx/compose/material/icons/Icons$AutoMirrored$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/automirrored/filled/PhoneMissedKt;->_phoneMissed:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const/4 v10, 0x1

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
    const-string v2, "AutoMirrored.Filled.PhoneMissed"

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
    const/high16 v0, 0x40b00000    # 5.5f

    .line 71
    .line 72
    const/high16 v2, 0x40d00000    # 6.5f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x41400000    # 12.0f

    .line 78
    .line 79
    const/high16 v2, 0x41300000    # 11.0f

    .line 80
    .line 81
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const/high16 v0, 0x40e00000    # 7.0f

    .line 85
    .line 86
    const/high16 v2, -0x3f200000    # -7.0f

    .line 87
    .line 88
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 89
    .line 90
    .line 91
    const/high16 v0, -0x40800000    # -1.0f

    .line 92
    .line 93
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v0, -0x3f400000    # -6.0f

    .line 97
    .line 98
    const/high16 v2, 0x40c00000    # 6.0f

    .line 99
    .line 100
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v0, -0x3f700000    # -4.5f

    .line 104
    .line 105
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const/high16 v0, 0x40900000    # 4.5f

    .line 109
    .line 110
    const/high16 v2, 0x41300000    # 11.0f

    .line 111
    .line 112
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v0, 0x40400000    # 3.0f

    .line 116
    .line 117
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v0, 0x40a00000    # 5.0f

    .line 121
    .line 122
    const/high16 v2, 0x40400000    # 3.0f

    .line 123
    .line 124
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v0, 0x40c00000    # 6.0f

    .line 128
    .line 129
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 133
    .line 134
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v0, 0x40b00000    # 5.5f

    .line 138
    .line 139
    const/high16 v2, 0x40d00000    # 6.5f

    .line 140
    .line 141
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v0, 0x41bdae14    # 23.71f

    .line 148
    .line 149
    .line 150
    const v2, 0x41855c29    # 16.67f

    .line 151
    .line 152
    .line 153
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const/high16 v17, 0x41400000    # 12.0f

    .line 157
    .line 158
    const/high16 v18, 0x41400000    # 12.0f

    .line 159
    .line 160
    const v13, 0x41a547ae    # 20.66f

    .line 161
    .line 162
    .line 163
    const v14, 0x415c7ae1    # 13.78f

    .line 164
    .line 165
    .line 166
    const v15, 0x418451ec    # 16.54f

    .line 167
    .line 168
    .line 169
    const/high16 v16, 0x41400000    # 12.0f

    .line 170
    .line 171
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v17, 0x3e947ae1    # 0.29f

    .line 175
    .line 176
    .line 177
    const v18, 0x41855c29    # 16.67f

    .line 178
    .line 179
    .line 180
    const v13, 0x40eeb852    # 7.46f

    .line 181
    .line 182
    .line 183
    const/high16 v14, 0x41400000    # 12.0f

    .line 184
    .line 185
    const v15, 0x4055c28f    # 3.34f

    .line 186
    .line 187
    .line 188
    const v16, 0x415c7ae1    # 13.78f

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v17, -0x416b851f    # -0.29f

    .line 195
    .line 196
    .line 197
    const v18, 0x3f35c28f    # 0.71f

    .line 198
    .line 199
    .line 200
    const v13, -0x41c7ae14    # -0.18f

    .line 201
    .line 202
    .line 203
    const v14, 0x3e3851ec    # 0.18f

    .line 204
    .line 205
    .line 206
    const v15, -0x416b851f    # -0.29f

    .line 207
    .line 208
    .line 209
    const v16, 0x3edc28f6    # 0.43f

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v0, 0x3e947ae1    # 0.29f

    .line 216
    .line 217
    .line 218
    const v2, 0x3f35c28f    # 0.71f

    .line 219
    .line 220
    .line 221
    const v4, 0x3de147ae    # 0.11f

    .line 222
    .line 223
    .line 224
    const v6, 0x3f07ae14    # 0.53f

    .line 225
    .line 226
    .line 227
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v0, 0x401eb852    # 2.48f

    .line 231
    .line 232
    .line 233
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v17, 0x3f35c28f    # 0.71f

    .line 237
    .line 238
    .line 239
    const v18, 0x3e947ae1    # 0.29f

    .line 240
    .line 241
    .line 242
    const v13, 0x3e3851ec    # 0.18f

    .line 243
    .line 244
    .line 245
    const v15, 0x3edc28f6    # 0.43f

    .line 246
    .line 247
    .line 248
    const v16, 0x3e947ae1    # 0.29f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v17, 0x3f333333    # 0.7f

    .line 255
    .line 256
    .line 257
    const v18, -0x4170a3d7    # -0.28f

    .line 258
    .line 259
    .line 260
    const v13, 0x3e8a3d71    # 0.27f

    .line 261
    .line 262
    .line 263
    const/4 v14, 0x0

    .line 264
    const v15, 0x3f051eb8    # 0.52f

    .line 265
    .line 266
    .line 267
    const v16, -0x421eb852    # -0.11f

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v17, 0x402a3d71    # 2.66f

    .line 274
    .line 275
    .line 276
    const v18, -0x40133333    # -1.85f

    .line 277
    .line 278
    .line 279
    const v13, 0x3f4a3d71    # 0.79f

    .line 280
    .line 281
    .line 282
    const v14, -0x40c28f5c    # -0.74f

    .line 283
    .line 284
    .line 285
    const v15, 0x3fd851ec    # 1.69f

    .line 286
    .line 287
    .line 288
    const v16, -0x4051eb85    # -1.36f

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v17, 0x3f0f5c29    # 0.56f

    .line 295
    .line 296
    .line 297
    const v18, -0x4099999a    # -0.9f

    .line 298
    .line 299
    .line 300
    const v13, 0x3ea8f5c3    # 0.33f

    .line 301
    .line 302
    .line 303
    const v14, -0x41dc28f6    # -0.16f

    .line 304
    .line 305
    .line 306
    const v15, 0x3f0f5c29    # 0.56f

    .line 307
    .line 308
    .line 309
    const/high16 v16, -0x41000000    # -0.5f

    .line 310
    .line 311
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v0, -0x3fb9999a    # -3.1f

    .line 315
    .line 316
    .line 317
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v17, 0x40933333    # 4.6f

    .line 321
    .line 322
    .line 323
    const v18, -0x40c51eb8    # -0.73f

    .line 324
    .line 325
    .line 326
    const v13, 0x3fb9999a    # 1.45f

    .line 327
    .line 328
    .line 329
    const v14, -0x410a3d71    # -0.48f

    .line 330
    .line 331
    .line 332
    const/high16 v15, 0x40400000    # 3.0f

    .line 333
    .line 334
    const v16, -0x40c51eb8    # -0.73f

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const v18, 0x3f3851ec    # 0.72f

    .line 341
    .line 342
    .line 343
    const v13, 0x3fcccccd    # 1.6f

    .line 344
    .line 345
    .line 346
    const/4 v14, 0x0

    .line 347
    const v15, 0x4049999a    # 3.15f

    .line 348
    .line 349
    .line 350
    const/high16 v16, 0x3e800000    # 0.25f

    .line 351
    .line 352
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v0, 0x40466666    # 3.1f

    .line 356
    .line 357
    .line 358
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v17, 0x3f0f5c29    # 0.56f

    .line 362
    .line 363
    .line 364
    const v18, 0x3f666666    # 0.9f

    .line 365
    .line 366
    .line 367
    const/4 v13, 0x0

    .line 368
    const v14, 0x3ec7ae14    # 0.39f

    .line 369
    .line 370
    .line 371
    const v15, 0x3e6b851f    # 0.23f

    .line 372
    .line 373
    .line 374
    const v16, 0x3f3d70a4    # 0.74f

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v17, 0x402ae148    # 2.67f

    .line 381
    .line 382
    .line 383
    const v18, 0x3feccccd    # 1.85f

    .line 384
    .line 385
    .line 386
    const v13, 0x3f7ae148    # 0.98f

    .line 387
    .line 388
    .line 389
    const v14, 0x3efae148    # 0.49f

    .line 390
    .line 391
    .line 392
    const v15, 0x3fef5c29    # 1.87f

    .line 393
    .line 394
    .line 395
    const v16, 0x3f8f5c29    # 1.12f

    .line 396
    .line 397
    .line 398
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v17, 0x3f333333    # 0.7f

    .line 402
    .line 403
    .line 404
    const v18, 0x3e8f5c29    # 0.28f

    .line 405
    .line 406
    .line 407
    const v13, 0x3e3851ec    # 0.18f

    .line 408
    .line 409
    .line 410
    const v14, 0x3e3851ec    # 0.18f

    .line 411
    .line 412
    .line 413
    const v15, 0x3edc28f6    # 0.43f

    .line 414
    .line 415
    .line 416
    const v16, 0x3e8f5c29    # 0.28f

    .line 417
    .line 418
    .line 419
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v17, 0x3f35c28f    # 0.71f

    .line 423
    .line 424
    .line 425
    const v18, -0x416b851f    # -0.29f

    .line 426
    .line 427
    .line 428
    const v13, 0x3e8f5c29    # 0.28f

    .line 429
    .line 430
    .line 431
    const/4 v14, 0x0

    .line 432
    const v15, 0x3f07ae14    # 0.53f

    .line 433
    .line 434
    .line 435
    const v16, -0x421eb852    # -0.11f

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v0, -0x3fe147ae    # -2.48f

    .line 442
    .line 443
    .line 444
    const v2, 0x401eb852    # 2.48f

    .line 445
    .line 446
    .line 447
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v17, 0x3e947ae1    # 0.29f

    .line 451
    .line 452
    .line 453
    const v18, -0x40ca3d71    # -0.71f

    .line 454
    .line 455
    .line 456
    const v13, 0x3e3851ec    # 0.18f

    .line 457
    .line 458
    .line 459
    const v14, -0x41c7ae14    # -0.18f

    .line 460
    .line 461
    .line 462
    const v15, 0x3e947ae1    # 0.29f

    .line 463
    .line 464
    .line 465
    const v16, -0x4123d70a    # -0.43f

    .line 466
    .line 467
    .line 468
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v0, -0x41666666    # -0.3f

    .line 472
    .line 473
    .line 474
    const v2, -0x40cccccd    # -0.7f

    .line 475
    .line 476
    .line 477
    const v4, -0x420a3d71    # -0.12f

    .line 478
    .line 479
    .line 480
    const v6, -0x40fae148    # -0.52f

    .line 481
    .line 482
    .line 483
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 490
    .line 491
    .line 492
    move-result-object v2

    .line 493
    const/16 v16, 0x3800

    .line 494
    .line 495
    const/16 v17, 0x0

    .line 496
    .line 497
    const/high16 v6, 0x3f800000    # 1.0f

    .line 498
    .line 499
    const/high16 v8, 0x3f800000    # 1.0f

    .line 500
    .line 501
    const/4 v7, 0x0

    .line 502
    const/high16 v9, 0x3f800000    # 1.0f

    .line 503
    .line 504
    const/high16 v12, 0x3f800000    # 1.0f

    .line 505
    .line 506
    const/4 v13, 0x0

    .line 507
    const/4 v14, 0x0

    .line 508
    const/4 v15, 0x0

    .line 509
    const-string v4, ""

    .line 510
    .line 511
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    sput-object v0, Landroidx/compose/material/icons/automirrored/filled/PhoneMissedKt;->_phoneMissed:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 520
    .line 521
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 522
    .line 523
    .line 524
    return-object v0
.end method
