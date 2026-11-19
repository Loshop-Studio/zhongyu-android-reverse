.class public final Landroidx/compose/material/icons/twotone/ShieldMoonKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_shieldMoon",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "ShieldMoon",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getShieldMoon",
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
        "SMAP\nShieldMoon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShieldMoon.kt\nandroidx/compose/material/icons/twotone/ShieldMoonKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,81:1\n212#2,12:82\n233#2,18:95\n253#2:132\n233#2,18:133\n253#2:170\n233#2,18:171\n253#2:208\n174#3:94\n705#4,2:113\n717#4,2:115\n719#4,11:121\n705#4,2:151\n717#4,2:153\n719#4,11:159\n705#4,2:189\n717#4,2:191\n719#4,11:197\n72#5,4:117\n72#5,4:155\n72#5,4:193\n*S KotlinDebug\n*F\n+ 1 ShieldMoon.kt\nandroidx/compose/material/icons/twotone/ShieldMoonKt\n*L\n29#1:82,12\n30#1:95,18\n30#1:132\n48#1:133,18\n48#1:170\n66#1:171,18\n66#1:208\n29#1:94\n30#1:113,2\n30#1:115,2\n30#1:121,11\n48#1:151,2\n48#1:153,2\n48#1:159,11\n66#1:189,2\n66#1:191,2\n66#1:197,11\n30#1:117,4\n48#1:155,4\n66#1:193,4\n*E\n"
    }
.end annotation


# static fields
.field private static _shieldMoon:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getShieldMoon(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/ShieldMoonKt;->_shieldMoon:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.ShieldMoon"

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
    const v4, 0x40cc7ae1    # 6.39f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x40c00000    # 6.0f

    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, 0x40966666    # 4.7f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const/high16 v25, 0x40c00000    # 6.0f

    .line 85
    .line 86
    const v26, 0x410d47ae    # 8.83f

    .line 87
    .line 88
    .line 89
    const/16 v21, 0x0

    .line 90
    .line 91
    const/high16 v22, 0x40800000    # 4.0f

    .line 92
    .line 93
    const v23, 0x40233333    # 2.55f

    .line 94
    .line 95
    .line 96
    const v24, 0x40f66666    # 7.7f

    .line 97
    .line 98
    .line 99
    move-object/from16 v20, v2

    .line 100
    .line 101
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v26, -0x3ef2b852    # -8.83f

    .line 105
    .line 106
    .line 107
    const v21, 0x405ccccd    # 3.45f

    .line 108
    .line 109
    .line 110
    const v22, -0x406f5c29    # -1.13f

    .line 111
    .line 112
    .line 113
    const/high16 v23, 0x40c00000    # 6.0f

    .line 114
    .line 115
    const v24, -0x3f65c28f    # -4.82f

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v4, -0x3f69999a    # -4.7f

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v4, -0x3f400000    # -6.0f

    .line 128
    .line 129
    const/high16 v6, -0x3ff00000    # -2.25f

    .line 130
    .line 131
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v4, 0x40cc7ae1    # 6.39f

    .line 135
    .line 136
    .line 137
    const/high16 v6, 0x40c00000    # 6.0f

    .line 138
    .line 139
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v4, 0x41435c29    # 12.21f

    .line 146
    .line 147
    .line 148
    const v6, 0x40f3851f    # 7.61f

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v25, 0x3ea3d70a    # 0.32f

    .line 155
    .line 156
    .line 157
    const v26, 0x40770a3d    # 3.86f

    .line 158
    .line 159
    .line 160
    const v21, -0x41147ae1    # -0.46f

    .line 161
    .line 162
    .line 163
    const v22, 0x3f9d70a4    # 1.23f

    .line 164
    .line 165
    .line 166
    const v23, -0x413851ec    # -0.39f

    .line 167
    .line 168
    .line 169
    const v24, 0x4028f5c3    # 2.64f

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v25, 0x404b851f    # 3.18f

    .line 176
    .line 177
    .line 178
    const v26, 0x400ccccd    # 2.2f

    .line 179
    .line 180
    .line 181
    const v21, 0x3f35c28f    # 0.71f

    .line 182
    .line 183
    .line 184
    const v22, 0x3f9c28f6    # 1.22f

    .line 185
    .line 186
    .line 187
    const v23, 0x3ff1eb85    # 1.89f

    .line 188
    .line 189
    .line 190
    const v24, 0x3ffeb852    # 1.99f

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v25, 0x3e851eb8    # 0.26f

    .line 197
    .line 198
    .line 199
    const v26, 0x3f3d70a4    # 0.74f

    .line 200
    .line 201
    .line 202
    const v21, 0x3eae147b    # 0.34f

    .line 203
    .line 204
    .line 205
    const v22, 0x3d75c28f    # 0.06f

    .line 206
    .line 207
    .line 208
    const v23, 0x3efae148    # 0.49f

    .line 209
    .line 210
    .line 211
    const v24, 0x3ef0a3d7    # 0.47f

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v25, -0x3f2147ae    # -6.96f

    .line 218
    .line 219
    .line 220
    const v26, -0x4270a3d7    # -0.07f

    .line 221
    .line 222
    .line 223
    const v21, -0x40147ae1    # -1.84f

    .line 224
    .line 225
    .line 226
    const v22, 0x400ae148    # 2.17f

    .line 227
    .line 228
    .line 229
    const v23, -0x3f5947ae    # -5.21f

    .line 230
    .line 231
    .line 232
    const v24, 0x40066666    # 2.1f

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v25, 0x402c28f6    # 2.69f

    .line 239
    .line 240
    .line 241
    const v26, -0x3f1570a4    # -7.33f

    .line 242
    .line 243
    .line 244
    const v21, -0x3ff3d70a    # -2.19f

    .line 245
    .line 246
    .line 247
    const v22, -0x3fd1eb85    # -2.72f

    .line 248
    .line 249
    .line 250
    const v23, -0x40d9999a    # -0.65f

    .line 251
    .line 252
    .line 253
    const v24, -0x3f28f5c3    # -6.72f

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v25, 0x41435c29    # 12.21f

    .line 260
    .line 261
    .line 262
    const v26, 0x40f3851f    # 7.61f

    .line 263
    .line 264
    .line 265
    const v21, 0x4140a3d7    # 12.04f

    .line 266
    .line 267
    .line 268
    const v22, 0x40de6666    # 6.95f

    .line 269
    .line 270
    .line 271
    const v23, 0x414547ae    # 12.33f

    .line 272
    .line 273
    .line 274
    const v24, 0x40e8f5c3    # 7.28f

    .line 275
    .line 276
    .line 277
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    const/16 v16, 0x3800

    .line 288
    .line 289
    const/16 v17, 0x0

    .line 290
    .line 291
    const v6, 0x3e99999a    # 0.3f

    .line 292
    .line 293
    .line 294
    const v8, 0x3e99999a    # 0.3f

    .line 295
    .line 296
    .line 297
    const/4 v7, 0x0

    .line 298
    const/high16 v9, 0x3f800000    # 1.0f

    .line 299
    .line 300
    const/high16 v12, 0x3f800000    # 1.0f

    .line 301
    .line 302
    const/4 v13, 0x0

    .line 303
    const/4 v14, 0x0

    .line 304
    const/4 v15, 0x0

    .line 305
    const-string v4, ""

    .line 306
    .line 307
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 308
    .line 309
    .line 310
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 311
    .line 312
    .line 313
    move-result v3

    .line 314
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 315
    .line 316
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 317
    .line 318
    .line 319
    move-result-wide v6

    .line 320
    const/4 v2, 0x0

    .line 321
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 325
    .line 326
    .line 327
    move-result v10

    .line 328
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 329
    .line 330
    .line 331
    move-result v11

    .line 332
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 335
    .line 336
    .line 337
    const/high16 v4, 0x40000000    # 2.0f

    .line 338
    .line 339
    const/high16 v6, 0x41400000    # 12.0f

    .line 340
    .line 341
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/high16 v4, 0x40800000    # 4.0f

    .line 345
    .line 346
    const/high16 v6, 0x40a00000    # 5.0f

    .line 347
    .line 348
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v4, 0x40c2e148    # 6.09f

    .line 352
    .line 353
    .line 354
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v25, 0x41000000    # 8.0f

    .line 358
    .line 359
    const v26, 0x412e8f5c    # 10.91f

    .line 360
    .line 361
    .line 362
    const/16 v21, 0x0

    .line 363
    .line 364
    const v22, 0x40a1999a    # 5.05f

    .line 365
    .line 366
    .line 367
    const v23, 0x405a3d71    # 3.41f

    .line 368
    .line 369
    .line 370
    const v24, 0x411c28f6    # 9.76f

    .line 371
    .line 372
    .line 373
    move-object/from16 v20, v2

    .line 374
    .line 375
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v26, -0x3ed170a4    # -10.91f

    .line 379
    .line 380
    .line 381
    const v21, 0x4092e148    # 4.59f

    .line 382
    .line 383
    .line 384
    const v22, -0x406ccccd    # -1.15f

    .line 385
    .line 386
    .line 387
    const/high16 v23, 0x41000000    # 8.0f

    .line 388
    .line 389
    const v24, -0x3f447ae1    # -5.86f

    .line 390
    .line 391
    .line 392
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v4, 0x40a00000    # 5.0f

    .line 396
    .line 397
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v4, 0x40000000    # 2.0f

    .line 401
    .line 402
    const/high16 v6, 0x41400000    # 12.0f

    .line 403
    .line 404
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v4, 0x41900000    # 18.0f

    .line 411
    .line 412
    const v6, 0x413170a4    # 11.09f

    .line 413
    .line 414
    .line 415
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const/high16 v25, -0x3f400000    # -6.0f

    .line 419
    .line 420
    const v26, 0x410d47ae    # 8.83f

    .line 421
    .line 422
    .line 423
    const/16 v21, 0x0

    .line 424
    .line 425
    const/high16 v22, 0x40800000    # 4.0f

    .line 426
    .line 427
    const v23, -0x3fdccccd    # -2.55f

    .line 428
    .line 429
    .line 430
    const v24, 0x40f66666    # 7.7f

    .line 431
    .line 432
    .line 433
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v26, -0x3ef2b852    # -8.83f

    .line 437
    .line 438
    .line 439
    const v21, -0x3fa33333    # -3.45f

    .line 440
    .line 441
    .line 442
    const v22, -0x406f5c29    # -1.13f

    .line 443
    .line 444
    .line 445
    const/high16 v23, -0x3f400000    # -6.0f

    .line 446
    .line 447
    const v24, -0x3f65c28f    # -4.82f

    .line 448
    .line 449
    .line 450
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v4, -0x3f69999a    # -4.7f

    .line 454
    .line 455
    .line 456
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/high16 v4, -0x3ff00000    # -2.25f

    .line 460
    .line 461
    const/high16 v6, 0x40c00000    # 6.0f

    .line 462
    .line 463
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const/high16 v4, 0x40100000    # 2.25f

    .line 467
    .line 468
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v4, 0x413170a4    # 11.09f

    .line 472
    .line 473
    .line 474
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 481
    .line 482
    .line 483
    move-result-object v2

    .line 484
    const/high16 v6, 0x3f800000    # 1.0f

    .line 485
    .line 486
    const/high16 v8, 0x3f800000    # 1.0f

    .line 487
    .line 488
    const/4 v7, 0x0

    .line 489
    const-string v4, ""

    .line 490
    .line 491
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 492
    .line 493
    .line 494
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 495
    .line 496
    .line 497
    move-result v3

    .line 498
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 499
    .line 500
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 501
    .line 502
    .line 503
    move-result-wide v6

    .line 504
    const/4 v0, 0x0

    .line 505
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 506
    .line 507
    .line 508
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 509
    .line 510
    .line 511
    move-result v10

    .line 512
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 513
    .line 514
    .line 515
    move-result v11

    .line 516
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 519
    .line 520
    .line 521
    const v0, 0x411028f6    # 9.01f

    .line 522
    .line 523
    .line 524
    const v2, 0x416547ae    # 14.33f

    .line 525
    .line 526
    .line 527
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const v17, 0x40deb852    # 6.96f

    .line 531
    .line 532
    .line 533
    const v18, 0x3d8f5c29    # 0.07f

    .line 534
    .line 535
    .line 536
    const/high16 v13, 0x3fe00000    # 1.75f

    .line 537
    .line 538
    const v14, 0x400ae148    # 2.17f

    .line 539
    .line 540
    .line 541
    const v15, 0x40a3d70a    # 5.12f

    .line 542
    .line 543
    .line 544
    const v16, 0x400f5c29    # 2.24f

    .line 545
    .line 546
    .line 547
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const v17, -0x417ae148    # -0.26f

    .line 551
    .line 552
    .line 553
    const v18, -0x40c28f5c    # -0.74f

    .line 554
    .line 555
    .line 556
    const v13, 0x3e6b851f    # 0.23f

    .line 557
    .line 558
    .line 559
    const v14, -0x4175c28f    # -0.27f

    .line 560
    .line 561
    .line 562
    const v15, 0x3da3d70a    # 0.08f

    .line 563
    .line 564
    .line 565
    const v16, -0x40d1eb85    # -0.68f

    .line 566
    .line 567
    .line 568
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const v17, -0x3fb47ae1    # -3.18f

    .line 572
    .line 573
    .line 574
    const v18, -0x3ff33333    # -2.2f

    .line 575
    .line 576
    .line 577
    const v13, -0x405ae148    # -1.29f

    .line 578
    .line 579
    .line 580
    const v14, -0x41a8f5c3    # -0.21f

    .line 581
    .line 582
    .line 583
    const v15, -0x3fe147ae    # -2.48f

    .line 584
    .line 585
    .line 586
    const v16, -0x40851eb8    # -0.98f

    .line 587
    .line 588
    .line 589
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const v17, -0x415c28f6    # -0.32f

    .line 593
    .line 594
    .line 595
    const v18, -0x3f88f5c3    # -3.86f

    .line 596
    .line 597
    .line 598
    const v13, -0x40ca3d71    # -0.71f

    .line 599
    .line 600
    .line 601
    const v14, -0x4063d70a    # -1.22f

    .line 602
    .line 603
    .line 604
    const v15, -0x40b851ec    # -0.78f

    .line 605
    .line 606
    .line 607
    const v16, -0x3fd7ae14    # -2.63f

    .line 608
    .line 609
    .line 610
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const v17, -0x40fd70a4    # -0.51f

    .line 614
    .line 615
    .line 616
    const v18, -0x40e66666    # -0.6f

    .line 617
    .line 618
    .line 619
    const v13, 0x3df5c28f    # 0.12f

    .line 620
    .line 621
    .line 622
    const v14, -0x41570a3d    # -0.33f

    .line 623
    .line 624
    .line 625
    const v15, -0x41dc28f6    # -0.16f

    .line 626
    .line 627
    .line 628
    const v16, -0x40d70a3d    # -0.66f

    .line 629
    .line 630
    .line 631
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const v17, 0x411028f6    # 9.01f

    .line 635
    .line 636
    .line 637
    const v18, 0x416547ae    # 14.33f

    .line 638
    .line 639
    .line 640
    const v13, 0x4105c28f    # 8.36f

    .line 641
    .line 642
    .line 643
    const v14, 0x40f3d70a    # 7.62f

    .line 644
    .line 645
    .line 646
    const v15, 0x40d9eb85    # 6.81f

    .line 647
    .line 648
    .line 649
    const v16, 0x4139c28f    # 11.61f

    .line 650
    .line 651
    .line 652
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 659
    .line 660
    .line 661
    move-result-object v2

    .line 662
    const/16 v16, 0x3800

    .line 663
    .line 664
    const/16 v17, 0x0

    .line 665
    .line 666
    const/high16 v6, 0x3f800000    # 1.0f

    .line 667
    .line 668
    const/4 v7, 0x0

    .line 669
    const/high16 v12, 0x3f800000    # 1.0f

    .line 670
    .line 671
    const/4 v13, 0x0

    .line 672
    const/4 v14, 0x0

    .line 673
    const/4 v15, 0x0

    .line 674
    const-string v4, ""

    .line 675
    .line 676
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 677
    .line 678
    .line 679
    move-result-object v0

    .line 680
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 681
    .line 682
    .line 683
    move-result-object v0

    .line 684
    sput-object v0, Landroidx/compose/material/icons/twotone/ShieldMoonKt;->_shieldMoon:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 685
    .line 686
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 687
    .line 688
    .line 689
    return-object v0
.end method
