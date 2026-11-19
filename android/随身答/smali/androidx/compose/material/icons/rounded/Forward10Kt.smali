.class public final Landroidx/compose/material/icons/rounded/Forward10Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_forward10",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Forward10",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getForward10",
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
        "SMAP\nForward10.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Forward10.kt\nandroidx/compose/material/icons/rounded/Forward10Kt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,102:1\n212#2,12:103\n233#2,18:116\n253#2:153\n174#3:115\n705#4,2:134\n717#4,2:136\n719#4,11:142\n72#5,4:138\n*S KotlinDebug\n*F\n+ 1 Forward10.kt\nandroidx/compose/material/icons/rounded/Forward10Kt\n*L\n29#1:103,12\n30#1:116,18\n30#1:153\n29#1:115\n30#1:134,2\n30#1:136,2\n30#1:142,11\n30#1:138,4\n*E\n"
    }
.end annotation


# static fields
.field private static _forward10:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getForward10(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/Forward10Kt;->_forward10:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Forward10"

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
    const v0, 0x41975c29    # 18.92f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41500000    # 13.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v17, -0x40851eb8    # -0.98f

    .line 79
    .line 80
    .line 81
    const v18, 0x3f5c28f6    # 0.86f

    .line 82
    .line 83
    .line 84
    const/high16 v13, -0x41000000    # -0.5f

    .line 85
    .line 86
    const/4 v14, 0x0

    .line 87
    const v15, -0x40970a3d    # -0.91f

    .line 88
    .line 89
    .line 90
    const v16, 0x3ebd70a4    # 0.37f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v17, -0x3f128f5c    # -7.42f

    .line 97
    .line 98
    .line 99
    const v18, 0x409eb852    # 4.96f

    .line 100
    .line 101
    .line 102
    const v13, -0x410a3d71    # -0.48f

    .line 103
    .line 104
    .line 105
    const v14, 0x4057ae14    # 3.37f

    .line 106
    .line 107
    .line 108
    const v15, -0x3f8eb852    # -3.77f

    .line 109
    .line 110
    .line 111
    const v16, 0x40bae148    # 5.84f

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v17, -0x3f73851f    # -4.39f

    .line 118
    .line 119
    .line 120
    const v18, -0x3f6f0a3d    # -4.53f

    .line 121
    .line 122
    .line 123
    const/high16 v13, -0x3ff00000    # -2.25f

    .line 124
    .line 125
    const v14, -0x40f5c28f    # -0.54f

    .line 126
    .line 127
    .line 128
    const v15, -0x3f85c28f    # -3.91f

    .line 129
    .line 130
    .line 131
    const v16, -0x3feeb852    # -2.27f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v17, 0x41400000    # 12.0f

    .line 138
    .line 139
    const/high16 v18, 0x40e00000    # 7.0f

    .line 140
    .line 141
    const v13, 0x40aa3d71    # 5.32f

    .line 142
    .line 143
    .line 144
    const v14, 0x4126b852    # 10.42f

    .line 145
    .line 146
    .line 147
    const v15, 0x410451ec    # 8.27f

    .line 148
    .line 149
    .line 150
    const/high16 v16, 0x40e00000    # 7.0f

    .line 151
    .line 152
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v0, 0x40328f5c    # 2.79f

    .line 156
    .line 157
    .line 158
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const v17, 0x3f59999a    # 0.85f

    .line 162
    .line 163
    .line 164
    const v18, 0x3eb33333    # 0.35f

    .line 165
    .line 166
    .line 167
    const/4 v13, 0x0

    .line 168
    const v14, 0x3ee66666    # 0.45f

    .line 169
    .line 170
    .line 171
    const v15, 0x3f0a3d71    # 0.54f

    .line 172
    .line 173
    .line 174
    const v16, 0x3f2b851f    # 0.67f

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v0, 0x40728f5c    # 3.79f

    .line 181
    .line 182
    .line 183
    const v2, -0x3f8d70a4    # -3.79f

    .line 184
    .line 185
    .line 186
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/16 v17, 0x0

    .line 190
    .line 191
    const v18, -0x40ca3d71    # -0.71f

    .line 192
    .line 193
    .line 194
    const v13, 0x3e4ccccd    # 0.2f

    .line 195
    .line 196
    .line 197
    const v14, -0x41b33333    # -0.2f

    .line 198
    .line 199
    .line 200
    const v15, 0x3e4ccccd    # 0.2f

    .line 201
    .line 202
    .line 203
    const v16, -0x40fd70a4    # -0.51f

    .line 204
    .line 205
    .line 206
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v0, -0x3f8d70a4    # -3.79f

    .line 210
    .line 211
    .line 212
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v17, -0x40a66666    # -0.85f

    .line 216
    .line 217
    .line 218
    const v18, 0x3eb851ec    # 0.36f

    .line 219
    .line 220
    .line 221
    const v13, -0x416147ae    # -0.31f

    .line 222
    .line 223
    .line 224
    const v14, -0x416147ae    # -0.31f

    .line 225
    .line 226
    .line 227
    const v15, -0x40a66666    # -0.85f

    .line 228
    .line 229
    .line 230
    const v16, -0x4247ae14    # -0.09f

    .line 231
    .line 232
    .line 233
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v0, 0x41400000    # 12.0f

    .line 237
    .line 238
    const/high16 v2, 0x40a00000    # 5.0f

    .line 239
    .line 240
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v17, -0x3f051eb8    # -7.84f

    .line 244
    .line 245
    .line 246
    const v18, 0x4119999a    # 9.6f

    .line 247
    .line 248
    .line 249
    const v13, -0x3f61eb85    # -4.94f

    .line 250
    .line 251
    .line 252
    const/4 v14, 0x0

    .line 253
    const v15, -0x3ef28f5c    # -8.84f

    .line 254
    .line 255
    .line 256
    const v16, 0x408f5c29    # 4.48f

    .line 257
    .line 258
    .line 259
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v17, 0x40bfae14    # 5.99f

    .line 263
    .line 264
    .line 265
    const v18, 0x40c6147b    # 6.19f

    .line 266
    .line 267
    .line 268
    const v13, 0x3f19999a    # 0.6f

    .line 269
    .line 270
    .line 271
    const v14, 0x40470a3d    # 3.11f

    .line 272
    .line 273
    .line 274
    const v15, 0x4039999a    # 2.9f

    .line 275
    .line 276
    .line 277
    const/high16 v16, 0x40b00000    # 5.5f

    .line 278
    .line 279
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v17, 0x411c51ec    # 9.77f

    .line 283
    .line 284
    .line 285
    const v18, -0x3f2a8f5c    # -6.67f

    .line 286
    .line 287
    .line 288
    const v13, 0x409a8f5c    # 4.83f

    .line 289
    .line 290
    .line 291
    const v14, 0x3f8a3d71    # 1.08f

    .line 292
    .line 293
    .line 294
    const v15, 0x41126666    # 9.15f

    .line 295
    .line 296
    .line 297
    const v16, -0x3ff33333    # -2.2f

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v17, -0x40800000    # -1.0f

    .line 304
    .line 305
    const v18, -0x4070a3d7    # -1.12f

    .line 306
    .line 307
    .line 308
    const v13, 0x3db851ec    # 0.09f

    .line 309
    .line 310
    .line 311
    const v14, -0x40e8f5c3    # -0.59f

    .line 312
    .line 313
    .line 314
    const v15, -0x41333333    # -0.4f

    .line 315
    .line 316
    .line 317
    const v16, -0x4070a3d7    # -1.12f

    .line 318
    .line 319
    .line 320
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v0, 0x412e6666    # 10.9f

    .line 327
    .line 328
    .line 329
    const/high16 v2, 0x41800000    # 16.0f

    .line 330
    .line 331
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v0, -0x3f775c29    # -4.27f

    .line 335
    .line 336
    .line 337
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const v0, -0x4247ae14    # -0.09f

    .line 341
    .line 342
    .line 343
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v0, -0x401d70a4    # -1.77f

    .line 347
    .line 348
    .line 349
    const v2, 0x3f2147ae    # 0.63f

    .line 350
    .line 351
    .line 352
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v0, 0x3f30a3d7    # 0.69f

    .line 356
    .line 357
    .line 358
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v0, 0x3f8147ae    # 1.01f

    .line 362
    .line 363
    .line 364
    const v2, -0x416147ae    # -0.31f

    .line 365
    .line 366
    .line 367
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v0, 0x4120cccd    # 10.05f

    .line 371
    .line 372
    .line 373
    const/high16 v2, 0x41800000    # 16.0f

    .line 374
    .line 375
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v0, 0x41651eb8    # 14.32f

    .line 382
    .line 383
    .line 384
    const v2, 0x413c7ae1    # 11.78f

    .line 385
    .line 386
    .line 387
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v17, -0x40e8f5c3    # -0.59f

    .line 391
    .line 392
    .line 393
    const v18, -0x42333333    # -0.1f

    .line 394
    .line 395
    .line 396
    const v13, -0x41c7ae14    # -0.18f

    .line 397
    .line 398
    .line 399
    const v14, -0x4270a3d7    # -0.07f

    .line 400
    .line 401
    .line 402
    const v15, -0x41428f5c    # -0.37f

    .line 403
    .line 404
    .line 405
    const v16, -0x42333333    # -0.1f

    .line 406
    .line 407
    .line 408
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v0, 0x3cf5c28f    # 0.03f

    .line 412
    .line 413
    .line 414
    const v2, -0x40e8f5c3    # -0.59f

    .line 415
    .line 416
    .line 417
    const v4, 0x3dcccccd    # 0.1f

    .line 418
    .line 419
    .line 420
    const v6, -0x412e147b    # -0.41f

    .line 421
    .line 422
    .line 423
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const v0, -0x4119999a    # -0.45f

    .line 427
    .line 428
    .line 429
    const v2, 0x3ea8f5c3    # 0.33f

    .line 430
    .line 431
    .line 432
    const v4, 0x3e3851ec    # 0.18f

    .line 433
    .line 434
    .line 435
    const v6, -0x41570a3d    # -0.33f

    .line 436
    .line 437
    .line 438
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v0, 0x3eae147b    # 0.34f

    .line 442
    .line 443
    .line 444
    const v2, 0x3f11eb85    # 0.57f

    .line 445
    .line 446
    .line 447
    const v4, -0x41947ae1    # -0.23f

    .line 448
    .line 449
    .line 450
    const v6, -0x416b851f    # -0.29f

    .line 451
    .line 452
    .line 453
    invoke-virtual {v12, v4, v0, v6, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/high16 v0, 0x3f000000    # 0.5f

    .line 457
    .line 458
    const v2, 0x3f51eb85    # 0.82f

    .line 459
    .line 460
    .line 461
    const v4, -0x42333333    # -0.1f

    .line 462
    .line 463
    .line 464
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const v0, 0x3f3d70a4    # 0.74f

    .line 468
    .line 469
    .line 470
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const v17, 0x3de147ae    # 0.11f

    .line 474
    .line 475
    .line 476
    const v18, 0x3f51eb85    # 0.82f

    .line 477
    .line 478
    .line 479
    const/4 v13, 0x0

    .line 480
    const v14, 0x3ea3d70a    # 0.32f

    .line 481
    .line 482
    .line 483
    const v15, 0x3d23d70a    # 0.04f

    .line 484
    .line 485
    .line 486
    const v16, 0x3f19999a    # 0.6f

    .line 487
    .line 488
    .line 489
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const v0, 0x3ed70a3d    # 0.42f

    .line 493
    .line 494
    .line 495
    const v2, 0x3e99999a    # 0.3f

    .line 496
    .line 497
    .line 498
    const v4, 0x3f11eb85    # 0.57f

    .line 499
    .line 500
    .line 501
    const v6, 0x3e2e147b    # 0.17f

    .line 502
    .line 503
    .line 504
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const v0, 0x3e851eb8    # 0.26f

    .line 508
    .line 509
    .line 510
    const v2, 0x3eeb851f    # 0.46f

    .line 511
    .line 512
    .line 513
    const v4, 0x3ea8f5c3    # 0.33f

    .line 514
    .line 515
    .line 516
    const v6, 0x3e8f5c29    # 0.28f

    .line 517
    .line 518
    .line 519
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const v0, 0x3ebd70a4    # 0.37f

    .line 523
    .line 524
    .line 525
    const v2, 0x3f170a3d    # 0.59f

    .line 526
    .line 527
    .line 528
    const v4, 0x3dcccccd    # 0.1f

    .line 529
    .line 530
    .line 531
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const v0, 0x3ed1eb85    # 0.41f

    .line 535
    .line 536
    .line 537
    const v2, -0x430a3d71    # -0.03f

    .line 538
    .line 539
    .line 540
    const v4, 0x3f170a3d    # 0.59f

    .line 541
    .line 542
    .line 543
    const v6, -0x42333333    # -0.1f

    .line 544
    .line 545
    .line 546
    invoke-virtual {v12, v0, v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const v0, 0x3ee66666    # 0.45f

    .line 550
    .line 551
    .line 552
    const v2, -0x41c7ae14    # -0.18f

    .line 553
    .line 554
    .line 555
    const v4, 0x3ea8f5c3    # 0.33f

    .line 556
    .line 557
    .line 558
    const v6, -0x41570a3d    # -0.33f

    .line 559
    .line 560
    .line 561
    invoke-virtual {v12, v4, v2, v0, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const v0, 0x3e6147ae    # 0.22f

    .line 565
    .line 566
    .line 567
    const v2, -0x4151eb85    # -0.34f

    .line 568
    .line 569
    .line 570
    const v4, -0x40ee147b    # -0.57f

    .line 571
    .line 572
    .line 573
    const v6, 0x3e947ae1    # 0.29f

    .line 574
    .line 575
    .line 576
    invoke-virtual {v12, v0, v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const/high16 v0, -0x41000000    # -0.5f

    .line 580
    .line 581
    const v2, -0x40ae147b    # -0.82f

    .line 582
    .line 583
    .line 584
    const v4, 0x3dcccccd    # 0.1f

    .line 585
    .line 586
    .line 587
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const v0, -0x40c28f5c    # -0.74f

    .line 591
    .line 592
    .line 593
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const v17, -0x421eb852    # -0.11f

    .line 597
    .line 598
    .line 599
    const v18, -0x40ae147b    # -0.82f

    .line 600
    .line 601
    .line 602
    const v14, -0x415c28f6    # -0.32f

    .line 603
    .line 604
    .line 605
    const v15, -0x42dc28f6    # -0.04f

    .line 606
    .line 607
    .line 608
    const v16, -0x40e66666    # -0.6f

    .line 609
    .line 610
    .line 611
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const v0, -0x4128f5c3    # -0.42f

    .line 615
    .line 616
    .line 617
    const v2, -0x41666666    # -0.3f

    .line 618
    .line 619
    .line 620
    const v4, -0x40ee147b    # -0.57f

    .line 621
    .line 622
    .line 623
    const v6, -0x41d1eb85    # -0.17f

    .line 624
    .line 625
    .line 626
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const v0, -0x417ae148    # -0.26f

    .line 630
    .line 631
    .line 632
    const v2, -0x41147ae1    # -0.46f

    .line 633
    .line 634
    .line 635
    const v4, -0x416b851f    # -0.29f

    .line 636
    .line 637
    .line 638
    const v6, -0x41570a3d    # -0.33f

    .line 639
    .line 640
    .line 641
    invoke-virtual {v12, v4, v0, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    const v0, 0x416547ae    # 14.33f

    .line 648
    .line 649
    .line 650
    const v2, 0x4165999a    # 14.35f

    .line 651
    .line 652
    .line 653
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const v17, -0x42dc28f6    # -0.04f

    .line 657
    .line 658
    .line 659
    const v18, 0x3ef5c28f    # 0.48f

    .line 660
    .line 661
    .line 662
    const v14, 0x3e428f5c    # 0.19f

    .line 663
    .line 664
    .line 665
    const v15, -0x43dc28f6    # -0.01f

    .line 666
    .line 667
    .line 668
    const v16, 0x3eb33333    # 0.35f

    .line 669
    .line 670
    .line 671
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    const v0, -0x421eb852    # -0.11f

    .line 675
    .line 676
    .line 677
    const v2, 0x3ea3d70a    # 0.32f

    .line 678
    .line 679
    .line 680
    const v4, -0x428a3d71    # -0.06f

    .line 681
    .line 682
    .line 683
    const v6, 0x3e75c28f    # 0.24f

    .line 684
    .line 685
    .line 686
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const v2, 0x3e0f5c29    # 0.14f

    .line 690
    .line 691
    .line 692
    const v4, -0x41bd70a4    # -0.19f

    .line 693
    .line 694
    .line 695
    const v6, 0x3e2e147b    # 0.17f

    .line 696
    .line 697
    .line 698
    invoke-virtual {v12, v0, v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    const v0, -0x41dc28f6    # -0.16f

    .line 702
    .line 703
    .line 704
    const/high16 v2, -0x41800000    # -0.25f

    .line 705
    .line 706
    const v4, 0x3d4ccccd    # 0.05f

    .line 707
    .line 708
    .line 709
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    const v0, -0x435c28f6    # -0.02f

    .line 713
    .line 714
    .line 715
    const v4, -0x41c7ae14    # -0.18f

    .line 716
    .line 717
    .line 718
    const v6, -0x42b33333    # -0.05f

    .line 719
    .line 720
    .line 721
    invoke-virtual {v12, v4, v0, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 722
    .line 723
    .line 724
    const v0, -0x41f0a3d7    # -0.14f

    .line 725
    .line 726
    .line 727
    const v2, -0x41bd70a4    # -0.19f

    .line 728
    .line 729
    .line 730
    const v4, -0x41d1eb85    # -0.17f

    .line 731
    .line 732
    .line 733
    const v6, -0x4247ae14    # -0.09f

    .line 734
    .line 735
    .line 736
    invoke-virtual {v12, v0, v6, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 737
    .line 738
    .line 739
    const v0, -0x420a3d71    # -0.12f

    .line 740
    .line 741
    .line 742
    const v2, -0x415c28f6    # -0.32f

    .line 743
    .line 744
    .line 745
    const v4, -0x41bd70a4    # -0.19f

    .line 746
    .line 747
    .line 748
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 749
    .line 750
    .line 751
    const v0, -0x42dc28f6    # -0.04f

    .line 752
    .line 753
    .line 754
    const v2, -0x410a3d71    # -0.48f

    .line 755
    .line 756
    .line 757
    const v4, -0x416b851f    # -0.29f

    .line 758
    .line 759
    .line 760
    const v6, -0x42dc28f6    # -0.04f

    .line 761
    .line 762
    .line 763
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 764
    .line 765
    .line 766
    const v0, -0x4087ae14    # -0.97f

    .line 767
    .line 768
    .line 769
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 770
    .line 771
    .line 772
    const v17, 0x3d23d70a    # 0.04f

    .line 773
    .line 774
    .line 775
    const v18, -0x410a3d71    # -0.48f

    .line 776
    .line 777
    .line 778
    const v14, -0x41bd70a4    # -0.19f

    .line 779
    .line 780
    .line 781
    const v15, 0x3c23d70a    # 0.01f

    .line 782
    .line 783
    .line 784
    const v16, -0x414ccccd    # -0.35f

    .line 785
    .line 786
    .line 787
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 788
    .line 789
    .line 790
    const v0, 0x3d75c28f    # 0.06f

    .line 791
    .line 792
    .line 793
    const v2, 0x3df5c28f    # 0.12f

    .line 794
    .line 795
    .line 796
    const v4, -0x41947ae1    # -0.23f

    .line 797
    .line 798
    .line 799
    const v6, -0x416147ae    # -0.31f

    .line 800
    .line 801
    .line 802
    invoke-virtual {v12, v0, v4, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 803
    .line 804
    .line 805
    const v0, -0x41f0a3d7    # -0.14f

    .line 806
    .line 807
    .line 808
    const v2, 0x3e428f5c    # 0.19f

    .line 809
    .line 810
    .line 811
    const v4, -0x41d1eb85    # -0.17f

    .line 812
    .line 813
    .line 814
    const v6, 0x3de147ae    # 0.11f

    .line 815
    .line 816
    .line 817
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 818
    .line 819
    .line 820
    const v0, 0x3e23d70a    # 0.16f

    .line 821
    .line 822
    .line 823
    const/high16 v2, 0x3e800000    # 0.25f

    .line 824
    .line 825
    const v4, -0x42b33333    # -0.05f

    .line 826
    .line 827
    .line 828
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 829
    .line 830
    .line 831
    const v0, 0x3ca3d70a    # 0.02f

    .line 832
    .line 833
    .line 834
    const v4, 0x3d4ccccd    # 0.05f

    .line 835
    .line 836
    .line 837
    const v6, 0x3e3851ec    # 0.18f

    .line 838
    .line 839
    .line 840
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 841
    .line 842
    .line 843
    const v0, 0x3db851ec    # 0.09f

    .line 844
    .line 845
    .line 846
    const v2, 0x3e428f5c    # 0.19f

    .line 847
    .line 848
    .line 849
    const v4, 0x3e2e147b    # 0.17f

    .line 850
    .line 851
    .line 852
    const v6, 0x3e0f5c29    # 0.14f

    .line 853
    .line 854
    .line 855
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 856
    .line 857
    .line 858
    const v0, 0x3df5c28f    # 0.12f

    .line 859
    .line 860
    .line 861
    const v2, 0x3e9eb852    # 0.31f

    .line 862
    .line 863
    .line 864
    const v4, 0x3e3851ec    # 0.18f

    .line 865
    .line 866
    .line 867
    const v6, 0x3db851ec    # 0.09f

    .line 868
    .line 869
    .line 870
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 871
    .line 872
    .line 873
    const v0, 0x3d23d70a    # 0.04f

    .line 874
    .line 875
    .line 876
    const v2, 0x3ef5c28f    # 0.48f

    .line 877
    .line 878
    .line 879
    const v4, 0x3e947ae1    # 0.29f

    .line 880
    .line 881
    .line 882
    const v6, 0x3d23d70a    # 0.04f

    .line 883
    .line 884
    .line 885
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 886
    .line 887
    .line 888
    const v0, 0x3f7851ec    # 0.97f

    .line 889
    .line 890
    .line 891
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 892
    .line 893
    .line 894
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 895
    .line 896
    .line 897
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 898
    .line 899
    .line 900
    move-result-object v2

    .line 901
    const/16 v16, 0x3800

    .line 902
    .line 903
    const/16 v17, 0x0

    .line 904
    .line 905
    const/high16 v6, 0x3f800000    # 1.0f

    .line 906
    .line 907
    const/high16 v8, 0x3f800000    # 1.0f

    .line 908
    .line 909
    const/4 v7, 0x0

    .line 910
    const/high16 v9, 0x3f800000    # 1.0f

    .line 911
    .line 912
    const/high16 v12, 0x3f800000    # 1.0f

    .line 913
    .line 914
    const/4 v14, 0x0

    .line 915
    const/4 v15, 0x0

    .line 916
    const-string v4, ""

    .line 917
    .line 918
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 919
    .line 920
    .line 921
    move-result-object v0

    .line 922
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 923
    .line 924
    .line 925
    move-result-object v0

    .line 926
    sput-object v0, Landroidx/compose/material/icons/rounded/Forward10Kt;->_forward10:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 927
    .line 928
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 929
    .line 930
    .line 931
    return-object v0
.end method
