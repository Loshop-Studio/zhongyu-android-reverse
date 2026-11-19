.class public final Landroidx/compose/material/icons/outlined/GTranslateKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_gTranslate",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "GTranslate",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getGTranslate",
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
        "SMAP\nGTranslate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GTranslate.kt\nandroidx/compose/material/icons/outlined/GTranslateKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,103:1\n212#2,12:104\n233#2,18:117\n253#2:154\n174#3:116\n705#4,2:135\n717#4,2:137\n719#4,11:143\n72#5,4:139\n*S KotlinDebug\n*F\n+ 1 GTranslate.kt\nandroidx/compose/material/icons/outlined/GTranslateKt\n*L\n29#1:104,12\n30#1:117,18\n30#1:154\n29#1:116\n30#1:135,2\n30#1:137,2\n30#1:143,11\n30#1:139,4\n*E\n"
    }
.end annotation


# static fields
.field private static _gTranslate:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getGTranslate(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/GTranslateKt;->_gTranslate:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.GTranslate"

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
    const/high16 v0, 0x40a00000    # 5.0f

    .line 71
    .line 72
    const/high16 v2, 0x41a00000    # 20.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v0, -0x3eee147b    # -9.12f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v0, 0x41200000    # 10.0f

    .line 84
    .line 85
    const/high16 v2, 0x40000000    # 2.0f

    .line 86
    .line 87
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    .line 90
    const/high16 v0, 0x40800000    # 4.0f

    .line 91
    .line 92
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const/high16 v17, -0x40000000    # -2.0f

    .line 96
    .line 97
    const/high16 v18, 0x40000000    # 2.0f

    .line 98
    .line 99
    const v13, -0x40733333    # -1.1f

    .line 100
    .line 101
    .line 102
    const/4 v14, 0x0

    .line 103
    const/high16 v15, -0x40000000    # -2.0f

    .line 104
    .line 105
    const v16, 0x3f666666    # 0.9f

    .line 106
    .line 107
    .line 108
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v0, 0x41500000    # 13.0f

    .line 112
    .line 113
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v17, 0x40000000    # 2.0f

    .line 117
    .line 118
    const/4 v13, 0x0

    .line 119
    const v14, 0x3f8ccccd    # 1.1f

    .line 120
    .line 121
    .line 122
    const v15, 0x3f666666    # 0.9f

    .line 123
    .line 124
    .line 125
    const/high16 v16, 0x40000000    # 2.0f

    .line 126
    .line 127
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/high16 v0, 0x40e00000    # 7.0f

    .line 131
    .line 132
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v0, 0x3f800000    # 1.0f

    .line 136
    .line 137
    const/high16 v2, 0x40400000    # 3.0f

    .line 138
    .line 139
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v0, 0x41000000    # 8.0f

    .line 143
    .line 144
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v18, -0x40000000    # -2.0f

    .line 148
    .line 149
    const v13, 0x3f8ccccd    # 1.1f

    .line 150
    .line 151
    .line 152
    const/4 v14, 0x0

    .line 153
    const/high16 v15, 0x40000000    # 2.0f

    .line 154
    .line 155
    const v16, -0x4099999a    # -0.9f

    .line 156
    .line 157
    .line 158
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v0, 0x41b00000    # 22.0f

    .line 162
    .line 163
    const/high16 v2, 0x40e00000    # 7.0f

    .line 164
    .line 165
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v17, -0x40000000    # -2.0f

    .line 169
    .line 170
    const/4 v13, 0x0

    .line 171
    const v14, -0x40733333    # -1.1f

    .line 172
    .line 173
    .line 174
    const v15, -0x4099999a    # -0.9f

    .line 175
    .line 176
    .line 177
    const/high16 v16, -0x40000000    # -2.0f

    .line 178
    .line 179
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const v0, 0x40e570a4    # 7.17f

    .line 186
    .line 187
    .line 188
    const v2, 0x416970a4    # 14.59f

    .line 189
    .line 190
    .line 191
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v17, -0x3f7d1eb8    # -4.09f

    .line 195
    .line 196
    .line 197
    const v18, -0x3f7d1eb8    # -4.09f

    .line 198
    .line 199
    .line 200
    const/high16 v13, -0x3ff00000    # -2.25f

    .line 201
    .line 202
    const/4 v14, 0x0

    .line 203
    const v15, -0x3f7d1eb8    # -4.09f

    .line 204
    .line 205
    .line 206
    const v16, -0x4015c28f    # -1.83f

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v0, 0x3fea3d71    # 1.83f

    .line 213
    .line 214
    .line 215
    const v2, 0x4082e148    # 4.09f

    .line 216
    .line 217
    .line 218
    const v4, -0x3f7d1eb8    # -4.09f

    .line 219
    .line 220
    .line 221
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v17, 0x402f5c29    # 2.74f

    .line 225
    .line 226
    .line 227
    const v18, 0x3f88f5c3    # 1.07f

    .line 228
    .line 229
    .line 230
    const v13, 0x3f851eb8    # 1.04f

    .line 231
    .line 232
    .line 233
    const v15, 0x3ffeb852    # 1.99f

    .line 234
    .line 235
    .line 236
    const v16, 0x3ebd70a4    # 0.37f

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const v0, 0x3d75c28f    # 0.06f

    .line 243
    .line 244
    .line 245
    const v2, 0x3d8f5c29    # 0.07f

    .line 246
    .line 247
    .line 248
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v0, -0x40628f5c    # -1.23f

    .line 252
    .line 253
    .line 254
    const v2, 0x3f970a3d    # 1.18f

    .line 255
    .line 256
    .line 257
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v0, -0x428a3d71    # -0.06f

    .line 261
    .line 262
    .line 263
    const v2, -0x42b33333    # -0.05f

    .line 264
    .line 265
    .line 266
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v17, -0x403d70a4    # -1.52f

    .line 270
    .line 271
    .line 272
    const v18, -0x40e8f5c3    # -0.59f

    .line 273
    .line 274
    .line 275
    const v13, -0x416b851f    # -0.29f

    .line 276
    .line 277
    .line 278
    const v14, -0x4175c28f    # -0.27f

    .line 279
    .line 280
    .line 281
    const v15, -0x40b851ec    # -0.78f

    .line 282
    .line 283
    .line 284
    const v16, -0x40e8f5c3    # -0.59f

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v17, -0x3fe7ae14    # -2.38f

    .line 291
    .line 292
    .line 293
    const v18, 0x401ae148    # 2.42f

    .line 294
    .line 295
    .line 296
    const v13, -0x405851ec    # -1.31f

    .line 297
    .line 298
    .line 299
    const/4 v14, 0x0

    .line 300
    const v15, -0x3fe7ae14    # -2.38f

    .line 301
    .line 302
    .line 303
    const v16, 0x3f8b851f    # 1.09f

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v0, 0x3f88f5c3    # 1.07f

    .line 310
    .line 311
    .line 312
    const v2, 0x401851ec    # 2.38f

    .line 313
    .line 314
    .line 315
    const v4, 0x401ae148    # 2.42f

    .line 316
    .line 317
    .line 318
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v17, 0x4007ae14    # 2.12f

    .line 322
    .line 323
    .line 324
    const v18, -0x40451eb8    # -1.46f

    .line 325
    .line 326
    .line 327
    const v13, 0x3faf5c29    # 1.37f

    .line 328
    .line 329
    .line 330
    const v15, 0x3ffae148    # 1.96f

    .line 331
    .line 332
    .line 333
    const v16, -0x40a147ae    # -0.87f

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v0, 0x41375c29    # 11.46f

    .line 340
    .line 341
    .line 342
    const v2, 0x40e28f5c    # 7.08f

    .line 343
    .line 344
    .line 345
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v0, 0x411e8f5c    # 9.91f

    .line 349
    .line 350
    .line 351
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v0, 0x407ccccd    # 3.95f

    .line 355
    .line 356
    .line 357
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v0, 0x3c23d70a    # 0.01f

    .line 361
    .line 362
    .line 363
    const v2, 0x3d8f5c29    # 0.07f

    .line 364
    .line 365
    .line 366
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v17, 0x3d4ccccd    # 0.05f

    .line 370
    .line 371
    .line 372
    const v18, 0x3f1c28f6    # 0.61f

    .line 373
    .line 374
    .line 375
    const v13, 0x3d23d70a    # 0.04f

    .line 376
    .line 377
    .line 378
    const v14, 0x3e570a3d    # 0.21f

    .line 379
    .line 380
    .line 381
    const v15, 0x3d4ccccd    # 0.05f

    .line 382
    .line 383
    .line 384
    const v16, 0x3ecccccd    # 0.4f

    .line 385
    .line 386
    .line 387
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v17, -0x3f851eb8    # -3.92f

    .line 391
    .line 392
    .line 393
    const/high16 v18, 0x40800000    # 4.0f

    .line 394
    .line 395
    const/4 v13, 0x0

    .line 396
    const v14, 0x40166666    # 2.35f

    .line 397
    .line 398
    .line 399
    const v15, -0x4031eb85    # -1.61f

    .line 400
    .line 401
    .line 402
    const/high16 v16, 0x40800000    # 4.0f

    .line 403
    .line 404
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v0, 0x41533333    # 13.2f

    .line 411
    .line 412
    .line 413
    const v2, 0x414e147b    # 12.88f

    .line 414
    .line 415
    .line 416
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v17, 0x3f9851ec    # 1.19f

    .line 420
    .line 421
    .line 422
    const v18, 0x3fd9999a    # 1.7f

    .line 423
    .line 424
    .line 425
    const v13, 0x3ea8f5c3    # 0.33f

    .line 426
    .line 427
    .line 428
    const v14, 0x3f19999a    # 0.6f

    .line 429
    .line 430
    .line 431
    const v15, 0x3f3d70a4    # 0.74f

    .line 432
    .line 433
    .line 434
    const v16, 0x3f970a3d    # 1.18f

    .line 435
    .line 436
    .line 437
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v0, -0x40f5c28f    # -0.54f

    .line 441
    .line 442
    .line 443
    const v2, 0x3f07ae14    # 0.53f

    .line 444
    .line 445
    .line 446
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v0, -0x40d9999a    # -0.65f

    .line 450
    .line 451
    .line 452
    const v2, -0x3ff147ae    # -2.23f

    .line 453
    .line 454
    .line 455
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const v0, 0x415f851f    # 13.97f

    .line 462
    .line 463
    .line 464
    const v2, 0x4141eb85    # 12.12f

    .line 465
    .line 466
    .line 467
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v0, -0x40828f5c    # -0.99f

    .line 471
    .line 472
    .line 473
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const v0, -0x416147ae    # -0.31f

    .line 477
    .line 478
    .line 479
    const v2, -0x407ae148    # -1.04f

    .line 480
    .line 481
    .line 482
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v0, 0x407f5c29    # 3.99f

    .line 486
    .line 487
    .line 488
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const v0, -0x403851ec    # -1.56f

    .line 492
    .line 493
    .line 494
    const v2, 0x402f5c29    # 2.74f

    .line 495
    .line 496
    .line 497
    const v4, -0x4151eb85    # -0.34f

    .line 498
    .line 499
    .line 500
    const v6, 0x3fa7ae14    # 1.31f

    .line 501
    .line 502
    .line 503
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v17, -0x406f5c29    # -1.13f

    .line 507
    .line 508
    .line 509
    const v18, -0x40266666    # -1.7f

    .line 510
    .line 511
    .line 512
    const v13, -0x40fae148    # -0.52f

    .line 513
    .line 514
    .line 515
    const v14, -0x40e147ae    # -0.62f

    .line 516
    .line 517
    .line 518
    const v15, -0x409c28f6    # -0.89f

    .line 519
    .line 520
    .line 521
    const v16, -0x40628f5c    # -1.23f

    .line 522
    .line 523
    .line 524
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const/high16 v0, 0x41a80000    # 21.0f

    .line 531
    .line 532
    const/high16 v2, 0x41a00000    # 20.0f

    .line 533
    .line 534
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const/high16 v17, -0x40800000    # -1.0f

    .line 538
    .line 539
    const/high16 v18, 0x3f800000    # 1.0f

    .line 540
    .line 541
    const/4 v13, 0x0

    .line 542
    const v14, 0x3f0ccccd    # 0.55f

    .line 543
    .line 544
    .line 545
    const v15, -0x4119999a    # -0.45f

    .line 546
    .line 547
    .line 548
    const/high16 v16, 0x3f800000    # 1.0f

    .line 549
    .line 550
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const/high16 v0, -0x3f200000    # -7.0f

    .line 554
    .line 555
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const/high16 v0, -0x40000000    # -2.0f

    .line 559
    .line 560
    const/high16 v2, 0x40000000    # 2.0f

    .line 561
    .line 562
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const v0, -0x40b0a3d7    # -0.81f

    .line 566
    .line 567
    .line 568
    const v2, -0x3fceb852    # -2.77f

    .line 569
    .line 570
    .line 571
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const v0, 0x3f6b851f    # 0.92f

    .line 575
    .line 576
    .line 577
    const v2, -0x40947ae1    # -0.92f

    .line 578
    .line 579
    .line 580
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const v0, 0x418e51ec    # 17.79f

    .line 584
    .line 585
    .line 586
    const/high16 v2, 0x41900000    # 18.0f

    .line 587
    .line 588
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const v0, 0x3f3ae148    # 0.73f

    .line 592
    .line 593
    .line 594
    const v2, -0x40c51eb8    # -0.73f

    .line 595
    .line 596
    .line 597
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const v0, -0x3fd28f5c    # -2.71f

    .line 601
    .line 602
    .line 603
    const v2, -0x3fd47ae1    # -2.68f

    .line 604
    .line 605
    .line 606
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const v17, 0x3ff5c28f    # 1.92f

    .line 610
    .line 611
    .line 612
    const v18, -0x3f9f5c29    # -3.51f

    .line 613
    .line 614
    .line 615
    const v13, 0x3f666666    # 0.9f

    .line 616
    .line 617
    .line 618
    const v14, -0x407c28f6    # -1.03f

    .line 619
    .line 620
    .line 621
    const v15, 0x3fcccccd    # 1.6f

    .line 622
    .line 623
    .line 624
    const/high16 v16, -0x3ff00000    # -2.25f

    .line 625
    .line 626
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const/high16 v0, 0x41980000    # 19.0f

    .line 630
    .line 631
    const v2, 0x413147ae    # 11.08f

    .line 632
    .line 633
    .line 634
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const v0, -0x407ae148    # -1.04f

    .line 638
    .line 639
    .line 640
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const v0, -0x3f970a3d    # -3.64f

    .line 644
    .line 645
    .line 646
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const v0, 0x4175c28f    # 15.36f

    .line 650
    .line 651
    .line 652
    const/high16 v2, 0x41100000    # 9.0f

    .line 653
    .line 654
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const v0, -0x407ae148    # -1.04f

    .line 658
    .line 659
    .line 660
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    const v0, 0x3f851eb8    # 1.04f

    .line 664
    .line 665
    .line 666
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const v0, -0x40051eb8    # -1.96f

    .line 670
    .line 671
    .line 672
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    const v0, 0x4132e148    # 11.18f

    .line 676
    .line 677
    .line 678
    const/high16 v2, 0x40c00000    # 6.0f

    .line 679
    .line 680
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    const/high16 v0, 0x40c00000    # 6.0f

    .line 684
    .line 685
    const/high16 v2, 0x41a00000    # 20.0f

    .line 686
    .line 687
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    const/high16 v17, 0x3f800000    # 1.0f

    .line 691
    .line 692
    const/high16 v18, 0x3f800000    # 1.0f

    .line 693
    .line 694
    const v13, 0x3f0ccccd    # 0.55f

    .line 695
    .line 696
    .line 697
    const/4 v14, 0x0

    .line 698
    const/high16 v15, 0x3f800000    # 1.0f

    .line 699
    .line 700
    const v16, 0x3ee66666    # 0.45f

    .line 701
    .line 702
    .line 703
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    const/high16 v0, 0x41500000    # 13.0f

    .line 707
    .line 708
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 715
    .line 716
    .line 717
    move-result-object v2

    .line 718
    const/16 v16, 0x3800

    .line 719
    .line 720
    const/16 v17, 0x0

    .line 721
    .line 722
    const/high16 v6, 0x3f800000    # 1.0f

    .line 723
    .line 724
    const/high16 v8, 0x3f800000    # 1.0f

    .line 725
    .line 726
    const/4 v7, 0x0

    .line 727
    const/high16 v9, 0x3f800000    # 1.0f

    .line 728
    .line 729
    const/high16 v12, 0x3f800000    # 1.0f

    .line 730
    .line 731
    const/4 v13, 0x0

    .line 732
    const/4 v15, 0x0

    .line 733
    const-string v4, ""

    .line 734
    .line 735
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 736
    .line 737
    .line 738
    move-result-object v0

    .line 739
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 740
    .line 741
    .line 742
    move-result-object v0

    .line 743
    sput-object v0, Landroidx/compose/material/icons/outlined/GTranslateKt;->_gTranslate:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 744
    .line 745
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 746
    .line 747
    .line 748
    return-object v0
.end method
