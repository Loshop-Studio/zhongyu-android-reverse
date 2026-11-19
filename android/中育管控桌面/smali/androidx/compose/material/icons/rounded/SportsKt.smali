.class public final Landroidx/compose/material/icons/rounded/SportsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_sports",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Sports",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getSports",
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
        "SMAP\nSports.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sports.kt\nandroidx/compose/material/icons/rounded/SportsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,72:1\n212#2,12:73\n233#2,18:86\n253#2:123\n233#2,18:124\n253#2:161\n174#3:85\n705#4,2:104\n717#4,2:106\n719#4,11:112\n705#4,2:142\n717#4,2:144\n719#4,11:150\n72#5,4:108\n72#5,4:146\n*S KotlinDebug\n*F\n+ 1 Sports.kt\nandroidx/compose/material/icons/rounded/SportsKt\n*L\n29#1:73,12\n30#1:86,18\n30#1:123\n61#1:124,18\n61#1:161\n29#1:85\n30#1:104,2\n30#1:106,2\n30#1:112,11\n61#1:142,2\n61#1:144,2\n61#1:150,11\n30#1:108,4\n61#1:146,4\n*E\n"
    }
.end annotation


# static fields
.field private static _sports:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSports(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SportsKt;->_sports:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Sports"

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
    const/high16 v4, 0x41a80000    # 21.0f

    .line 71
    .line 72
    const/high16 v6, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v4, -0x3ee3ae14    # -9.77f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v25, 0x40dbd70a    # 6.87f

    .line 84
    .line 85
    .line 86
    const v26, 0x40f75c29    # 7.73f

    .line 87
    .line 88
    .line 89
    const v21, 0x41191eb8    # 9.57f

    .line 90
    .line 91
    .line 92
    const/high16 v22, 0x40c00000    # 6.0f

    .line 93
    .line 94
    const v23, 0x410028f6    # 8.01f

    .line 95
    .line 96
    .line 97
    const v24, 0x40d51eb8    # 6.66f

    .line 98
    .line 99
    .line 100
    move-object/from16 v20, v2

    .line 101
    .line 102
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v25, 0x40900000    # 4.5f

    .line 106
    .line 107
    const/high16 v26, 0x40c00000    # 6.0f

    .line 108
    .line 109
    const v21, 0x40d147ae    # 6.54f

    .line 110
    .line 111
    .line 112
    const v22, 0x40d75c29    # 6.73f

    .line 113
    .line 114
    .line 115
    const v23, 0x40b3851f    # 5.61f

    .line 116
    .line 117
    .line 118
    const/high16 v24, 0x40c00000    # 6.0f

    .line 119
    .line 120
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v25, 0x40000000    # 2.0f

    .line 124
    .line 125
    const/high16 v26, 0x41080000    # 8.5f

    .line 126
    .line 127
    const v21, 0x4047ae14    # 3.12f

    .line 128
    .line 129
    .line 130
    const/high16 v22, 0x40c00000    # 6.0f

    .line 131
    .line 132
    const/high16 v23, 0x40000000    # 2.0f

    .line 133
    .line 134
    const v24, 0x40e3d70a    # 7.12f

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v25, 0x40900000    # 4.5f

    .line 141
    .line 142
    const/high16 v26, 0x41300000    # 11.0f

    .line 143
    .line 144
    const/high16 v21, 0x40000000    # 2.0f

    .line 145
    .line 146
    const v22, 0x411e147b    # 9.88f

    .line 147
    .line 148
    .line 149
    const v23, 0x4047ae14    # 3.12f

    .line 150
    .line 151
    .line 152
    const/high16 v24, 0x41300000    # 11.0f

    .line 153
    .line 154
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v25, 0x3f1c28f6    # 0.61f

    .line 158
    .line 159
    .line 160
    const v26, -0x425c28f6    # -0.08f

    .line 161
    .line 162
    .line 163
    const v21, 0x3e570a3d    # 0.21f

    .line 164
    .line 165
    .line 166
    const/16 v22, 0x0

    .line 167
    .line 168
    const v23, 0x3ed1eb85    # 0.41f

    .line 169
    .line 170
    .line 171
    const v24, -0x430a3d71    # -0.03f

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v25, -0x42333333    # -0.1f

    .line 178
    .line 179
    .line 180
    const v26, 0x3f47ae14    # 0.78f

    .line 181
    .line 182
    .line 183
    const v21, -0x42b33333    # -0.05f

    .line 184
    .line 185
    .line 186
    const/high16 v22, 0x3e800000    # 0.25f

    .line 187
    .line 188
    const v23, -0x4247ae14    # -0.09f

    .line 189
    .line 190
    .line 191
    const v24, 0x3f028f5c    # 0.51f

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v25, 0x40d5c28f    # 6.68f

    .line 198
    .line 199
    .line 200
    const v26, 0x40c8a3d7    # 6.27f

    .line 201
    .line 202
    .line 203
    const v21, -0x41c7ae14    # -0.18f

    .line 204
    .line 205
    .line 206
    const v22, 0x406b851f    # 3.68f

    .line 207
    .line 208
    .line 209
    const v23, 0x403ccccd    # 2.95f

    .line 210
    .line 211
    .line 212
    const v24, 0x40d5c28f    # 6.68f

    .line 213
    .line 214
    .line 215
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v25, 0x40a6147b    # 5.19f

    .line 219
    .line 220
    .line 221
    const v26, -0x3f675c29    # -4.77f

    .line 222
    .line 223
    .line 224
    const v21, 0x40233333    # 2.55f

    .line 225
    .line 226
    .line 227
    const v22, -0x4170a3d7    # -0.28f

    .line 228
    .line 229
    .line 230
    const v23, 0x4095c28f    # 4.68f

    .line 231
    .line 232
    .line 233
    const v24, -0x3fef5c29    # -2.26f

    .line 234
    .line 235
    .line 236
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v25, 0x3d75c28f    # 0.06f

    .line 240
    .line 241
    .line 242
    const v26, -0x3ffc28f6    # -2.06f

    .line 243
    .line 244
    .line 245
    const v21, 0x3e19999a    # 0.15f

    .line 246
    .line 247
    .line 248
    const v22, -0x40ca3d71    # -0.71f

    .line 249
    .line 250
    .line 251
    const v23, 0x3e19999a    # 0.15f

    .line 252
    .line 253
    .line 254
    const v24, -0x404ccccd    # -1.4f

    .line 255
    .line 256
    .line 257
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v25, 0x3f7d70a4    # 0.99f

    .line 261
    .line 262
    .line 263
    const v26, -0x406f5c29    # -1.13f

    .line 264
    .line 265
    .line 266
    const v21, -0x4247ae14    # -0.09f

    .line 267
    .line 268
    .line 269
    const v22, -0x40e66666    # -0.6f

    .line 270
    .line 271
    .line 272
    const v23, 0x3ec28f5c    # 0.38f

    .line 273
    .line 274
    .line 275
    const v24, -0x406f5c29    # -1.13f

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v4, 0x4030a3d7    # 2.76f

    .line 282
    .line 283
    .line 284
    const/4 v6, 0x0

    .line 285
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v25, 0x41b00000    # 22.0f

    .line 289
    .line 290
    const/high16 v26, 0x41100000    # 9.0f

    .line 291
    .line 292
    const v21, 0x41ac7ae1    # 21.56f

    .line 293
    .line 294
    .line 295
    const/high16 v22, 0x41200000    # 10.0f

    .line 296
    .line 297
    const/high16 v23, 0x41b00000    # 22.0f

    .line 298
    .line 299
    const v24, 0x4118cccd    # 9.55f

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v4, 0x40e00000    # 7.0f

    .line 306
    .line 307
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v25, 0x41a80000    # 21.0f

    .line 311
    .line 312
    const/high16 v26, 0x40c00000    # 6.0f

    .line 313
    .line 314
    const/high16 v21, 0x41b00000    # 22.0f

    .line 315
    .line 316
    const v22, 0x40ce6666    # 6.45f

    .line 317
    .line 318
    .line 319
    const v23, 0x41ac6666    # 21.55f

    .line 320
    .line 321
    .line 322
    const/high16 v24, 0x40c00000    # 6.0f

    .line 323
    .line 324
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/high16 v4, 0x40900000    # 4.5f

    .line 331
    .line 332
    const/high16 v6, 0x41100000    # 9.0f

    .line 333
    .line 334
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/high16 v25, 0x40800000    # 4.0f

    .line 338
    .line 339
    const/high16 v26, 0x41080000    # 8.5f

    .line 340
    .line 341
    const v21, 0x40870a3d    # 4.22f

    .line 342
    .line 343
    .line 344
    const/high16 v22, 0x41100000    # 9.0f

    .line 345
    .line 346
    const/high16 v23, 0x40800000    # 4.0f

    .line 347
    .line 348
    const v24, 0x410c7ae1    # 8.78f

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v25, 0x40900000    # 4.5f

    .line 355
    .line 356
    const/high16 v26, 0x41000000    # 8.0f

    .line 357
    .line 358
    const/high16 v21, 0x40800000    # 4.0f

    .line 359
    .line 360
    const v22, 0x4103851f    # 8.22f

    .line 361
    .line 362
    .line 363
    const v23, 0x40870a3d    # 4.22f

    .line 364
    .line 365
    .line 366
    const/high16 v24, 0x41000000    # 8.0f

    .line 367
    .line 368
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v4, 0x4103851f    # 8.22f

    .line 372
    .line 373
    .line 374
    const/high16 v6, 0x41080000    # 8.5f

    .line 375
    .line 376
    const/high16 v7, 0x40a00000    # 5.0f

    .line 377
    .line 378
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v26, 0x41100000    # 9.0f

    .line 382
    .line 383
    const/high16 v21, 0x40a00000    # 5.0f

    .line 384
    .line 385
    const v22, 0x410c7ae1    # 8.78f

    .line 386
    .line 387
    .line 388
    const v23, 0x4098f5c3    # 4.78f

    .line 389
    .line 390
    .line 391
    const/high16 v24, 0x41100000    # 9.0f

    .line 392
    .line 393
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const/high16 v4, 0x41700000    # 15.0f

    .line 400
    .line 401
    const/high16 v6, 0x41300000    # 11.0f

    .line 402
    .line 403
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 407
    .line 408
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 409
    .line 410
    const v21, -0x402b851f    # -1.66f

    .line 411
    .line 412
    .line 413
    const/16 v22, 0x0

    .line 414
    .line 415
    const/high16 v23, -0x3fc00000    # -3.0f

    .line 416
    .line 417
    const v24, -0x40547ae1    # -1.34f

    .line 418
    .line 419
    .line 420
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 424
    .line 425
    const v6, 0x3fab851f    # 1.34f

    .line 426
    .line 427
    .line 428
    const/high16 v7, 0x40400000    # 3.0f

    .line 429
    .line 430
    invoke-virtual {v2, v6, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v4, 0x3fab851f    # 1.34f

    .line 434
    .line 435
    .line 436
    const/high16 v6, 0x40400000    # 3.0f

    .line 437
    .line 438
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v4, 0x414a8f5c    # 12.66f

    .line 442
    .line 443
    .line 444
    const/high16 v6, 0x41700000    # 15.0f

    .line 445
    .line 446
    const/high16 v7, 0x41300000    # 11.0f

    .line 447
    .line 448
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 455
    .line 456
    .line 457
    move-result-object v2

    .line 458
    const/16 v16, 0x3800

    .line 459
    .line 460
    const/16 v17, 0x0

    .line 461
    .line 462
    const/high16 v6, 0x3f800000    # 1.0f

    .line 463
    .line 464
    const/high16 v8, 0x3f800000    # 1.0f

    .line 465
    .line 466
    const/4 v7, 0x0

    .line 467
    const/high16 v9, 0x3f800000    # 1.0f

    .line 468
    .line 469
    const/high16 v12, 0x3f800000    # 1.0f

    .line 470
    .line 471
    const/4 v13, 0x0

    .line 472
    const/4 v14, 0x0

    .line 473
    const/4 v15, 0x0

    .line 474
    const-string v4, ""

    .line 475
    .line 476
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 477
    .line 478
    .line 479
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 480
    .line 481
    .line 482
    move-result v3

    .line 483
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 484
    .line 485
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 486
    .line 487
    .line 488
    move-result-wide v6

    .line 489
    const/4 v0, 0x0

    .line 490
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 491
    .line 492
    .line 493
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 494
    .line 495
    .line 496
    move-result v10

    .line 497
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 498
    .line 499
    .line 500
    move-result v11

    .line 501
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 504
    .line 505
    .line 506
    const/high16 v0, 0x41400000    # 12.0f

    .line 507
    .line 508
    const/high16 v2, 0x41300000    # 11.0f

    .line 509
    .line 510
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const/high16 v0, -0x40000000    # -2.0f

    .line 514
    .line 515
    const/4 v2, 0x0

    .line 516
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/high16 v18, 0x40800000    # 4.0f

    .line 520
    .line 521
    const/16 v19, 0x0

    .line 522
    .line 523
    const/high16 v13, 0x40000000    # 2.0f

    .line 524
    .line 525
    const/high16 v14, 0x40000000    # 2.0f

    .line 526
    .line 527
    const/16 v16, 0x1

    .line 528
    .line 529
    const/16 v17, 0x1

    .line 530
    .line 531
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const/high16 v18, -0x3f800000    # -4.0f

    .line 535
    .line 536
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 540
    .line 541
    .line 542
    move-result-object v2

    .line 543
    const/16 v16, 0x3800

    .line 544
    .line 545
    const/16 v17, 0x0

    .line 546
    .line 547
    const/high16 v6, 0x3f800000    # 1.0f

    .line 548
    .line 549
    const/4 v7, 0x0

    .line 550
    const/high16 v12, 0x3f800000    # 1.0f

    .line 551
    .line 552
    const/4 v13, 0x0

    .line 553
    const/4 v14, 0x0

    .line 554
    const-string v4, ""

    .line 555
    .line 556
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    sput-object v0, Landroidx/compose/material/icons/rounded/SportsKt;->_sports:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 565
    .line 566
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 567
    .line 568
    .line 569
    return-object v0
.end method
