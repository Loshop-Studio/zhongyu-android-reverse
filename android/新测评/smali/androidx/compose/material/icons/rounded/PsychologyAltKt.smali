.class public final Landroidx/compose/material/icons/rounded/PsychologyAltKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_psychologyAlt",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "PsychologyAlt",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getPsychologyAlt",
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
        "SMAP\nPsychologyAlt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PsychologyAlt.kt\nandroidx/compose/material/icons/rounded/PsychologyAltKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,72:1\n212#2,12:73\n233#2,18:86\n253#2:123\n174#3:85\n705#4,2:104\n717#4,2:106\n719#4,11:112\n72#5,4:108\n*S KotlinDebug\n*F\n+ 1 PsychologyAlt.kt\nandroidx/compose/material/icons/rounded/PsychologyAltKt\n*L\n29#1:73,12\n30#1:86,18\n30#1:123\n29#1:85\n30#1:104,2\n30#1:106,2\n30#1:112,11\n30#1:108,4\n*E\n"
    }
.end annotation


# static fields
.field private static _psychologyAlt:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPsychologyAlt(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/PsychologyAltKt;->_psychologyAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.PsychologyAlt"

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
    const v0, 0x419f851f    # 19.94f

    .line 71
    .line 72
    .line 73
    const v2, 0x4110f5c3    # 9.06f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v17, 0x41500000    # 13.0f

    .line 80
    .line 81
    const/high16 v18, 0x40400000    # 3.0f

    .line 82
    .line 83
    const/high16 v13, 0x419c0000    # 19.5f

    .line 84
    .line 85
    const v14, 0x40b75c29    # 5.73f

    .line 86
    .line 87
    .line 88
    const v15, 0x41848f5c    # 16.57f

    .line 89
    .line 90
    .line 91
    const/high16 v16, 0x40400000    # 3.0f

    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v17, 0x40c28f5c    # 6.08f

    .line 97
    .line 98
    .line 99
    const/high16 v18, 0x41100000    # 9.0f

    .line 100
    .line 101
    const v13, 0x4117851f    # 9.47f

    .line 102
    .line 103
    .line 104
    const/high16 v14, 0x40400000    # 3.0f

    .line 105
    .line 106
    const v15, 0x40d23d71    # 6.57f

    .line 107
    .line 108
    .line 109
    const v16, 0x40b3851f    # 5.61f

    .line 110
    .line 111
    .line 112
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v0, -0x4008f5c3    # -1.93f

    .line 116
    .line 117
    .line 118
    const v2, 0x405eb852    # 3.48f

    .line 119
    .line 120
    .line 121
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v17, 0x40a00000    # 5.0f

    .line 125
    .line 126
    const/high16 v18, 0x41600000    # 14.0f

    .line 127
    .line 128
    const v13, 0x406f5c29    # 3.74f

    .line 129
    .line 130
    .line 131
    const v14, 0x41523d71    # 13.14f

    .line 132
    .line 133
    .line 134
    const v15, 0x40870a3d    # 4.22f

    .line 135
    .line 136
    .line 137
    const/high16 v16, 0x41600000    # 14.0f

    .line 138
    .line 139
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v0, 0x3f800000    # 1.0f

    .line 143
    .line 144
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v0, 0x40000000    # 2.0f

    .line 148
    .line 149
    const/4 v2, 0x0

    .line 150
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/high16 v17, 0x40000000    # 2.0f

    .line 154
    .line 155
    const/high16 v18, 0x40000000    # 2.0f

    .line 156
    .line 157
    const/4 v13, 0x0

    .line 158
    const v14, 0x3f8ccccd    # 1.1f

    .line 159
    .line 160
    .line 161
    const v15, 0x3f666666    # 0.9f

    .line 162
    .line 163
    .line 164
    const/high16 v16, 0x40000000    # 2.0f

    .line 165
    .line 166
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const/high16 v0, 0x3f800000    # 1.0f

    .line 170
    .line 171
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const/high16 v0, 0x40000000    # 2.0f

    .line 175
    .line 176
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v17, 0x3f800000    # 1.0f

    .line 180
    .line 181
    const/high16 v18, 0x3f800000    # 1.0f

    .line 182
    .line 183
    const v14, 0x3f0ccccd    # 0.55f

    .line 184
    .line 185
    .line 186
    const v15, 0x3ee66666    # 0.45f

    .line 187
    .line 188
    .line 189
    const/high16 v16, 0x3f800000    # 1.0f

    .line 190
    .line 191
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v0, 0x40a00000    # 5.0f

    .line 195
    .line 196
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v18, -0x40800000    # -1.0f

    .line 200
    .line 201
    const v13, 0x3f0ccccd    # 0.55f

    .line 202
    .line 203
    .line 204
    const/4 v14, 0x0

    .line 205
    const/high16 v15, 0x3f800000    # 1.0f

    .line 206
    .line 207
    const v16, -0x4119999a    # -0.45f

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v0, -0x3f947ae1    # -3.68f

    .line 214
    .line 215
    .line 216
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v17, 0x419f851f    # 19.94f

    .line 220
    .line 221
    .line 222
    const v18, 0x4110f5c3    # 9.06f

    .line 223
    .line 224
    .line 225
    const v13, 0x4194f5c3    # 18.62f

    .line 226
    .line 227
    .line 228
    const v14, 0x41711eb8    # 15.07f

    .line 229
    .line 230
    .line 231
    const v15, 0x41a2cccd    # 20.35f

    .line 232
    .line 233
    .line 234
    const v16, 0x4143d70a    # 12.24f

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v0, 0x41480000    # 12.5f

    .line 244
    .line 245
    const/high16 v2, 0x41600000    # 14.0f

    .line 246
    .line 247
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v17, -0x40c28f5c    # -0.74f

    .line 251
    .line 252
    .line 253
    const v18, -0x40c28f5c    # -0.74f

    .line 254
    .line 255
    .line 256
    const v13, -0x412e147b    # -0.41f

    .line 257
    .line 258
    .line 259
    const/4 v14, 0x0

    .line 260
    const v15, -0x40c28f5c    # -0.74f

    .line 261
    .line 262
    .line 263
    const v16, -0x41570a3d    # -0.33f

    .line 264
    .line 265
    .line 266
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v17, 0x3f3d70a4    # 0.74f

    .line 270
    .line 271
    .line 272
    const v18, -0x40c51eb8    # -0.73f

    .line 273
    .line 274
    .line 275
    const/4 v13, 0x0

    .line 276
    const v14, -0x412e147b    # -0.41f

    .line 277
    .line 278
    .line 279
    const v15, 0x3ea8f5c3    # 0.33f

    .line 280
    .line 281
    .line 282
    const v16, -0x40c51eb8    # -0.73f

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v17, 0x3f3ae148    # 0.73f

    .line 289
    .line 290
    .line 291
    const v18, 0x3f3ae148    # 0.73f

    .line 292
    .line 293
    .line 294
    const v13, 0x3ed1eb85    # 0.41f

    .line 295
    .line 296
    .line 297
    const/4 v14, 0x0

    .line 298
    const v15, 0x3f3ae148    # 0.73f

    .line 299
    .line 300
    .line 301
    const v16, 0x3ea3d70a    # 0.32f

    .line 302
    .line 303
    .line 304
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/high16 v17, 0x41480000    # 12.5f

    .line 308
    .line 309
    const/high16 v18, 0x41600000    # 14.0f

    .line 310
    .line 311
    const v13, 0x4153ae14    # 13.23f

    .line 312
    .line 313
    .line 314
    const v14, 0x415ab852    # 13.67f

    .line 315
    .line 316
    .line 317
    const v15, 0x414eb852    # 12.92f

    .line 318
    .line 319
    .line 320
    const/high16 v16, 0x41600000    # 14.0f

    .line 321
    .line 322
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const v0, 0x416428f6    # 14.26f

    .line 329
    .line 330
    .line 331
    const v2, 0x411ae148    # 9.68f

    .line 332
    .line 333
    .line 334
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v17, -0x40747ae1    # -1.09f

    .line 338
    .line 339
    .line 340
    const v18, 0x3fa28f5c    # 1.27f

    .line 341
    .line 342
    .line 343
    const v13, -0x411eb852    # -0.44f

    .line 344
    .line 345
    .line 346
    const v14, 0x3f266666    # 0.65f

    .line 347
    .line 348
    .line 349
    const v15, -0x40a3d70a    # -0.86f

    .line 350
    .line 351
    .line 352
    const v16, 0x3f59999a    # 0.85f

    .line 353
    .line 354
    .line 355
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v17, -0x41fae148    # -0.13f

    .line 359
    .line 360
    .line 361
    const v18, 0x3f51eb85    # 0.82f

    .line 362
    .line 363
    .line 364
    const v13, -0x4247ae14    # -0.09f

    .line 365
    .line 366
    .line 367
    const v14, 0x3e2e147b    # 0.17f

    .line 368
    .line 369
    .line 370
    const v15, -0x41fae148    # -0.13f

    .line 371
    .line 372
    .line 373
    const v16, 0x3e8f5c29    # 0.28f

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v0, -0x407851ec    # -1.06f

    .line 380
    .line 381
    .line 382
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const v17, 0x3e3851ec    # 0.18f

    .line 386
    .line 387
    .line 388
    const v18, -0x406b851f    # -1.16f

    .line 389
    .line 390
    .line 391
    const/4 v13, 0x0

    .line 392
    const v14, -0x416b851f    # -0.29f

    .line 393
    .line 394
    .line 395
    const v15, -0x42dc28f6    # -0.04f

    .line 396
    .line 397
    .line 398
    const/high16 v16, -0x40c00000    # -0.75f

    .line 399
    .line 400
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const v17, 0x3f91eb85    # 1.14f

    .line 404
    .line 405
    .line 406
    const v18, -0x405eb852    # -1.26f

    .line 407
    .line 408
    .line 409
    const v13, 0x3e8f5c29    # 0.28f

    .line 410
    .line 411
    .line 412
    const v14, -0x40fd70a4    # -0.51f

    .line 413
    .line 414
    .line 415
    const v15, 0x3f547ae1    # 0.83f

    .line 416
    .line 417
    .line 418
    const v16, -0x40b0a3d7    # -0.81f

    .line 419
    .line 420
    .line 421
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v17, -0x40b33333    # -0.8f

    .line 425
    .line 426
    .line 427
    const v18, -0x4051eb85    # -1.36f

    .line 428
    .line 429
    .line 430
    const v13, 0x3ea8f5c3    # 0.33f

    .line 431
    .line 432
    .line 433
    const v14, -0x410f5c29    # -0.47f

    .line 434
    .line 435
    .line 436
    const v15, 0x3e19999a    # 0.15f

    .line 437
    .line 438
    .line 439
    const v16, -0x4051eb85    # -1.36f

    .line 440
    .line 441
    .line 442
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const v17, -0x4079999a    # -1.05f

    .line 446
    .line 447
    .line 448
    const v18, 0x3f5c28f6    # 0.86f

    .line 449
    .line 450
    .line 451
    const v13, -0x40e147ae    # -0.62f

    .line 452
    .line 453
    .line 454
    const/4 v14, 0x0

    .line 455
    const v15, -0x40947ae1    # -0.92f

    .line 456
    .line 457
    .line 458
    const v16, 0x3ef0a3d7    # 0.47f

    .line 459
    .line 460
    .line 461
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const v0, -0x408a3d71    # -0.96f

    .line 465
    .line 466
    .line 467
    const v2, -0x41333333    # -0.4f

    .line 468
    .line 469
    .line 470
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v17, 0x41480000    # 12.5f

    .line 474
    .line 475
    const/high16 v18, 0x40e00000    # 7.0f

    .line 476
    .line 477
    const v13, 0x412c28f6    # 10.76f

    .line 478
    .line 479
    .line 480
    const v14, 0x40f570a4    # 7.67f

    .line 481
    .line 482
    .line 483
    const v15, 0x41375c29    # 11.46f

    .line 484
    .line 485
    .line 486
    const/high16 v16, 0x40e00000    # 7.0f

    .line 487
    .line 488
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const/high16 v17, 0x3fe00000    # 1.75f

    .line 492
    .line 493
    const v18, 0x3f6147ae    # 0.88f

    .line 494
    .line 495
    .line 496
    const v13, 0x3f5c28f6    # 0.86f

    .line 497
    .line 498
    .line 499
    const/4 v14, 0x0

    .line 500
    const v15, 0x3fb9999a    # 1.45f

    .line 501
    .line 502
    .line 503
    const v16, 0x3ec7ae14    # 0.39f

    .line 504
    .line 505
    .line 506
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const v17, 0x416428f6    # 14.26f

    .line 510
    .line 511
    .line 512
    const v18, 0x411ae148    # 9.68f

    .line 513
    .line 514
    .line 515
    const v13, 0x416828f6    # 14.51f

    .line 516
    .line 517
    .line 518
    const v14, 0x4104f5c3    # 8.31f

    .line 519
    .line 520
    .line 521
    const v15, 0x416a8f5c    # 14.66f

    .line 522
    .line 523
    .line 524
    const v16, 0x4111999a    # 9.1f

    .line 525
    .line 526
    .line 527
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 534
    .line 535
    .line 536
    move-result-object v2

    .line 537
    const/16 v16, 0x3800

    .line 538
    .line 539
    const/16 v17, 0x0

    .line 540
    .line 541
    const/high16 v6, 0x3f800000    # 1.0f

    .line 542
    .line 543
    const/high16 v8, 0x3f800000    # 1.0f

    .line 544
    .line 545
    const/4 v7, 0x0

    .line 546
    const/high16 v9, 0x3f800000    # 1.0f

    .line 547
    .line 548
    const/high16 v12, 0x3f800000    # 1.0f

    .line 549
    .line 550
    const/4 v13, 0x0

    .line 551
    const/4 v14, 0x0

    .line 552
    const/4 v15, 0x0

    .line 553
    const-string v4, ""

    .line 554
    .line 555
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    sput-object v0, Landroidx/compose/material/icons/rounded/PsychologyAltKt;->_psychologyAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 564
    .line 565
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 566
    .line 567
    .line 568
    return-object v0
.end method
