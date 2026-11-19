.class public final Landroidx/compose/material/icons/outlined/CrueltyFreeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_crueltyFree",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "CrueltyFree",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getCrueltyFree",
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
        "SMAP\nCrueltyFree.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrueltyFree.kt\nandroidx/compose/material/icons/outlined/CrueltyFreeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,93:1\n212#2,12:94\n233#2,18:107\n253#2:144\n174#3:106\n705#4,2:125\n717#4,2:127\n719#4,11:133\n72#5,4:129\n*S KotlinDebug\n*F\n+ 1 CrueltyFree.kt\nandroidx/compose/material/icons/outlined/CrueltyFreeKt\n*L\n29#1:94,12\n30#1:107,18\n30#1:144\n29#1:106\n30#1:125,2\n30#1:127,2\n30#1:133,11\n30#1:129,4\n*E\n"
    }
.end annotation


# static fields
.field private static _crueltyFree:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCrueltyFree(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/CrueltyFreeKt;->_crueltyFree:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.CrueltyFree"

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
    const/high16 v0, 0x41880000    # 17.0f

    .line 71
    .line 72
    const/high16 v2, 0x41600000    # 14.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, -0x40d9999a    # -0.65f

    .line 78
    .line 79
    .line 80
    const/high16 v18, -0x40c00000    # -0.75f

    .line 81
    .line 82
    const v13, -0x418a3d71    # -0.24f

    .line 83
    .line 84
    .line 85
    const v14, -0x418a3d71    # -0.24f

    .line 86
    .line 87
    .line 88
    const v15, -0x411eb852    # -0.44f

    .line 89
    .line 90
    .line 91
    const v16, -0x41051eb8    # -0.49f

    .line 92
    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v17, 0x41980000    # 19.0f

    .line 98
    .line 99
    const/high16 v18, 0x40a00000    # 5.0f

    .line 100
    .line 101
    const v13, 0x418c147b    # 17.51f

    .line 102
    .line 103
    .line 104
    const/high16 v14, 0x41380000    # 11.5f

    .line 105
    .line 106
    const/high16 v15, 0x41980000    # 19.0f

    .line 107
    .line 108
    const v16, 0x4108f5c3    # 8.56f

    .line 109
    .line 110
    .line 111
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/high16 v17, -0x40000000    # -2.0f

    .line 115
    .line 116
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 117
    .line 118
    const/4 v13, 0x0

    .line 119
    const v14, -0x40066666    # -1.95f

    .line 120
    .line 121
    .line 122
    const v15, -0x40c28f5c    # -0.74f

    .line 123
    .line 124
    .line 125
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 126
    .line 127
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/high16 v17, -0x3f600000    # -5.0f

    .line 131
    .line 132
    const v18, 0x40bf0a3d    # 5.97f

    .line 133
    .line 134
    .line 135
    const v13, -0x403ae148    # -1.54f

    .line 136
    .line 137
    .line 138
    const/4 v14, 0x0

    .line 139
    const v15, -0x3f828f5c    # -3.96f

    .line 140
    .line 141
    .line 142
    const v16, 0x4003d70a    # 2.06f

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v17, 0x40e00000    # 7.0f

    .line 149
    .line 150
    const/high16 v18, 0x40000000    # 2.0f

    .line 151
    .line 152
    const v13, 0x412f5c29    # 10.96f

    .line 153
    .line 154
    .line 155
    const v14, 0x4081eb85    # 4.06f

    .line 156
    .line 157
    .line 158
    const v15, 0x4108a3d7    # 8.54f

    .line 159
    .line 160
    .line 161
    const/high16 v16, 0x40000000    # 2.0f

    .line 162
    .line 163
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v17, 0x40a00000    # 5.0f

    .line 167
    .line 168
    const/high16 v18, 0x40a00000    # 5.0f

    .line 169
    .line 170
    const v13, 0x40b7ae14    # 5.74f

    .line 171
    .line 172
    .line 173
    const/high16 v14, 0x40000000    # 2.0f

    .line 174
    .line 175
    const/high16 v15, 0x40a00000    # 5.0f

    .line 176
    .line 177
    const v16, 0x40433333    # 3.05f

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v17, 0x4029999a    # 2.65f

    .line 184
    .line 185
    .line 186
    const/high16 v18, 0x41040000    # 8.25f

    .line 187
    .line 188
    const/4 v13, 0x0

    .line 189
    const v14, 0x4063d70a    # 3.56f

    .line 190
    .line 191
    .line 192
    const v15, 0x3fbeb852    # 1.49f

    .line 193
    .line 194
    .line 195
    const/high16 v16, 0x40d00000    # 6.5f

    .line 196
    .line 197
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v17, 0x40e00000    # 7.0f

    .line 201
    .line 202
    const/high16 v18, 0x41600000    # 14.0f

    .line 203
    .line 204
    const v13, 0x40ee147b    # 7.44f

    .line 205
    .line 206
    .line 207
    const v14, 0x415828f6    # 13.51f

    .line 208
    .line 209
    .line 210
    const v15, 0x40e7ae14    # 7.24f

    .line 211
    .line 212
    .line 213
    const v16, 0x415c28f6    # 13.76f

    .line 214
    .line 215
    .line 216
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const/high16 v17, -0x40000000    # -2.0f

    .line 220
    .line 221
    const/high16 v18, 0x40600000    # 3.5f

    .line 222
    .line 223
    const/high16 v13, -0x41800000    # -0.25f

    .line 224
    .line 225
    const/high16 v14, 0x3e800000    # 0.25f

    .line 226
    .line 227
    const/high16 v15, -0x40000000    # -2.0f

    .line 228
    .line 229
    const v16, 0x3fb1eb85    # 1.39f

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v17, 0x41180000    # 9.5f

    .line 236
    .line 237
    const/high16 v18, 0x41b00000    # 22.0f

    .line 238
    .line 239
    const/high16 v13, 0x40a00000    # 5.0f

    .line 240
    .line 241
    const v14, 0x419fd70a    # 19.98f

    .line 242
    .line 243
    .line 244
    const v15, 0x40e0a3d7    # 7.02f

    .line 245
    .line 246
    .line 247
    const/high16 v16, 0x41b00000    # 22.0f

    .line 248
    .line 249
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v17, 0x40200000    # 2.5f

    .line 253
    .line 254
    const/high16 v18, -0x41000000    # -0.5f

    .line 255
    .line 256
    const/high16 v13, 0x3fc00000    # 1.5f

    .line 257
    .line 258
    const/4 v14, 0x0

    .line 259
    const/high16 v15, 0x40200000    # 2.5f

    .line 260
    .line 261
    const/high16 v16, -0x41000000    # -0.5f

    .line 262
    .line 263
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v0, 0x3f800000    # 1.0f

    .line 267
    .line 268
    const/high16 v2, 0x40200000    # 2.5f

    .line 269
    .line 270
    const/high16 v4, 0x3f000000    # 0.5f

    .line 271
    .line 272
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v17, 0x40900000    # 4.5f

    .line 276
    .line 277
    const/high16 v18, -0x3f700000    # -4.5f

    .line 278
    .line 279
    const v13, 0x401eb852    # 2.48f

    .line 280
    .line 281
    .line 282
    const/high16 v15, 0x40900000    # 4.5f

    .line 283
    .line 284
    const v16, -0x3ffeb852    # -2.02f

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v17, 0x41880000    # 17.0f

    .line 291
    .line 292
    const/high16 v18, 0x41600000    # 14.0f

    .line 293
    .line 294
    const/high16 v13, 0x41980000    # 19.0f

    .line 295
    .line 296
    const v14, 0x41763d71    # 15.39f

    .line 297
    .line 298
    .line 299
    const/high16 v15, 0x418a0000    # 17.25f

    .line 300
    .line 301
    const/high16 v16, 0x41640000    # 14.25f

    .line 302
    .line 303
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v0, 0x41870a3d    # 16.88f

    .line 310
    .line 311
    .line 312
    const v2, 0x4080f5c3    # 4.03f

    .line 313
    .line 314
    .line 315
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const/high16 v18, 0x40a00000    # 5.0f

    .line 319
    .line 320
    const v13, 0x4187851f    # 16.94f

    .line 321
    .line 322
    .line 323
    const v14, 0x40866666    # 4.2f

    .line 324
    .line 325
    .line 326
    const/high16 v15, 0x41880000    # 17.0f

    .line 327
    .line 328
    const v16, 0x409051ec    # 4.51f

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v17, -0x3ffb851f    # -2.07f

    .line 335
    .line 336
    .line 337
    const v18, 0x40d8f5c3    # 6.78f

    .line 338
    .line 339
    .line 340
    const/4 v13, 0x0

    .line 341
    const v14, 0x4035c28f    # 2.84f

    .line 342
    .line 343
    .line 344
    const v15, -0x4071eb85    # -1.11f

    .line 345
    .line 346
    .line 347
    const v16, 0x40a7ae14    # 5.24f

    .line 348
    .line 349
    .line 350
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v17, -0x404ccccd    # -1.4f

    .line 354
    .line 355
    .line 356
    const v18, -0x40e147ae    # -0.62f

    .line 357
    .line 358
    .line 359
    const v13, -0x413d70a4    # -0.38f

    .line 360
    .line 361
    .line 362
    const v14, -0x417ae148    # -0.26f

    .line 363
    .line 364
    .line 365
    const v15, -0x40ab851f    # -0.83f

    .line 366
    .line 367
    .line 368
    const v16, -0x410a3d71    # -0.48f

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v17, 0x41870a3d    # 16.88f

    .line 375
    .line 376
    .line 377
    const v18, 0x4080f5c3    # 4.03f

    .line 378
    .line 379
    .line 380
    const v13, 0x415c51ec    # 13.77f

    .line 381
    .line 382
    .line 383
    const v14, 0x40d47ae1    # 6.64f

    .line 384
    .line 385
    .line 386
    const v15, 0x417f851f    # 15.97f

    .line 387
    .line 388
    .line 389
    const v16, 0x408a8f5c    # 4.33f

    .line 390
    .line 391
    .line 392
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const/high16 v0, 0x40e00000    # 7.0f

    .line 399
    .line 400
    const/high16 v2, 0x40a00000    # 5.0f

    .line 401
    .line 402
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v17, 0x3df5c28f    # 0.12f

    .line 406
    .line 407
    .line 408
    const v18, -0x4087ae14    # -0.97f

    .line 409
    .line 410
    .line 411
    const/4 v13, 0x0

    .line 412
    const v14, -0x41051eb8    # -0.49f

    .line 413
    .line 414
    .line 415
    const v15, 0x3d75c28f    # 0.06f

    .line 416
    .line 417
    .line 418
    const v16, -0x40b33333    # -0.8f

    .line 419
    .line 420
    .line 421
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v17, 0x40570a3d    # 3.36f

    .line 425
    .line 426
    .line 427
    const v18, 0x40e428f6    # 7.13f

    .line 428
    .line 429
    .line 430
    const v13, 0x3f68f5c3    # 0.91f

    .line 431
    .line 432
    .line 433
    const v14, 0x3e99999a    # 0.3f

    .line 434
    .line 435
    .line 436
    const v15, 0x40470a3d    # 3.11f

    .line 437
    .line 438
    .line 439
    const v16, 0x40270a3d    # 2.61f

    .line 440
    .line 441
    .line 442
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const v17, -0x404ccccd    # -1.4f

    .line 446
    .line 447
    .line 448
    const v18, 0x3f1eb852    # 0.62f

    .line 449
    .line 450
    .line 451
    const v13, -0x40eb851f    # -0.58f

    .line 452
    .line 453
    .line 454
    const v14, 0x3e0f5c29    # 0.14f

    .line 455
    .line 456
    .line 457
    const v15, -0x407c28f6    # -1.03f

    .line 458
    .line 459
    .line 460
    const v16, 0x3eb33333    # 0.35f

    .line 461
    .line 462
    .line 463
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const/high16 v17, 0x40e00000    # 7.0f

    .line 467
    .line 468
    const/high16 v18, 0x40a00000    # 5.0f

    .line 469
    .line 470
    const v13, 0x4101c28f    # 8.11f

    .line 471
    .line 472
    .line 473
    const v14, 0x4123d70a    # 10.24f

    .line 474
    .line 475
    .line 476
    const/high16 v15, 0x40e00000    # 7.0f

    .line 477
    .line 478
    const v16, 0x40fae148    # 7.84f

    .line 479
    .line 480
    .line 481
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const/high16 v0, 0x41680000    # 14.5f

    .line 488
    .line 489
    const/high16 v2, 0x41a00000    # 20.0f

    .line 490
    .line 491
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const v17, -0x3ff1eb85    # -2.22f

    .line 495
    .line 496
    .line 497
    const v18, -0x40f0a3d7    # -0.56f

    .line 498
    .line 499
    .line 500
    const/high16 v13, -0x40800000    # -1.0f

    .line 501
    .line 502
    const/4 v14, 0x0

    .line 503
    const v15, -0x4019999a    # -1.8f

    .line 504
    .line 505
    .line 506
    const v16, -0x41570a3d    # -0.33f

    .line 507
    .line 508
    .line 509
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const/high16 v17, 0x41500000    # 13.0f

    .line 513
    .line 514
    const/high16 v18, 0x41940000    # 18.5f

    .line 515
    .line 516
    const v13, 0x414b3333    # 12.7f

    .line 517
    .line 518
    .line 519
    const v14, 0x419a147b    # 19.26f

    .line 520
    .line 521
    .line 522
    const/high16 v15, 0x41500000    # 13.0f

    .line 523
    .line 524
    const v16, 0x4195d70a    # 18.73f

    .line 525
    .line 526
    .line 527
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const/high16 v17, -0x40800000    # -1.0f

    .line 531
    .line 532
    const/high16 v18, -0x41000000    # -0.5f

    .line 533
    .line 534
    const/4 v13, 0x0

    .line 535
    const v14, -0x4170a3d7    # -0.28f

    .line 536
    .line 537
    .line 538
    const v15, -0x4119999a    # -0.45f

    .line 539
    .line 540
    .line 541
    const/high16 v16, -0x41000000    # -0.5f

    .line 542
    .line 543
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const v0, 0x3e6147ae    # 0.22f

    .line 547
    .line 548
    .line 549
    const/high16 v2, -0x40800000    # -1.0f

    .line 550
    .line 551
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const v17, 0x3f3851ec    # 0.72f

    .line 555
    .line 556
    .line 557
    const v18, 0x3f70a3d7    # 0.94f

    .line 558
    .line 559
    .line 560
    const v14, 0x3e6b851f    # 0.23f

    .line 561
    .line 562
    .line 563
    const v15, 0x3e99999a    # 0.3f

    .line 564
    .line 565
    .line 566
    const v16, 0x3f428f5c    # 0.76f

    .line 567
    .line 568
    .line 569
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const/high16 v17, 0x41180000    # 9.5f

    .line 573
    .line 574
    const/high16 v18, 0x41a00000    # 20.0f

    .line 575
    .line 576
    const v13, 0x4134cccd    # 11.3f

    .line 577
    .line 578
    .line 579
    const v14, 0x419d5c29    # 19.67f

    .line 580
    .line 581
    .line 582
    const/high16 v15, 0x41280000    # 10.5f

    .line 583
    .line 584
    const/high16 v16, 0x41a00000    # 20.0f

    .line 585
    .line 586
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const/high16 v17, 0x40e00000    # 7.0f

    .line 590
    .line 591
    const/high16 v18, 0x418c0000    # 17.5f

    .line 592
    .line 593
    const v13, 0x4101eb85    # 8.12f

    .line 594
    .line 595
    .line 596
    const/high16 v14, 0x41a00000    # 20.0f

    .line 597
    .line 598
    const/high16 v15, 0x40e00000    # 7.0f

    .line 599
    .line 600
    const v16, 0x41970a3d    # 18.88f

    .line 601
    .line 602
    .line 603
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const/high16 v17, 0x3f800000    # 1.0f

    .line 607
    .line 608
    const v18, -0x40228f5c    # -1.73f

    .line 609
    .line 610
    .line 611
    const/4 v13, 0x0

    .line 612
    const v14, -0x40cccccd    # -0.7f

    .line 613
    .line 614
    .line 615
    const v15, 0x3edc28f6    # 0.43f

    .line 616
    .line 617
    .line 618
    const v16, -0x406147ae    # -1.24f

    .line 619
    .line 620
    .line 621
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const v17, 0x3fa66666    # 1.3f

    .line 625
    .line 626
    .line 627
    const v18, -0x4050a3d7    # -1.37f

    .line 628
    .line 629
    .line 630
    const v13, 0x3ee147ae    # 0.44f

    .line 631
    .line 632
    .line 633
    const v14, -0x4147ae14    # -0.36f

    .line 634
    .line 635
    .line 636
    const v15, 0x3f1c28f6    # 0.61f

    .line 637
    .line 638
    .line 639
    const v16, -0x40fae148    # -0.52f

    .line 640
    .line 641
    .line 642
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    const v17, 0x402ccccd    # 2.7f

    .line 646
    .line 647
    .line 648
    const v18, -0x404ccccd    # -1.4f

    .line 649
    .line 650
    .line 651
    const v13, 0x3f428f5c    # 0.76f

    .line 652
    .line 653
    .line 654
    const v14, -0x408ccccd    # -0.95f

    .line 655
    .line 656
    .line 657
    const v15, 0x3f8b851f    # 1.09f

    .line 658
    .line 659
    .line 660
    const v16, -0x404ccccd    # -1.4f

    .line 661
    .line 662
    .line 663
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    .line 666
    const v0, 0x402ccccd    # 2.7f

    .line 667
    .line 668
    .line 669
    const v2, 0x3fb33333    # 1.4f

    .line 670
    .line 671
    .line 672
    const v4, 0x3ff851ec    # 1.94f

    .line 673
    .line 674
    .line 675
    const v6, 0x3ee66666    # 0.45f

    .line 676
    .line 677
    .line 678
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const v17, 0x3fa66666    # 1.3f

    .line 682
    .line 683
    .line 684
    const v18, 0x3faf5c29    # 1.37f

    .line 685
    .line 686
    .line 687
    const v13, 0x3f30a3d7    # 0.69f

    .line 688
    .line 689
    .line 690
    const v14, 0x3f59999a    # 0.85f

    .line 691
    .line 692
    .line 693
    const v15, 0x3f5c28f6    # 0.86f

    .line 694
    .line 695
    .line 696
    const v16, 0x3f8147ae    # 1.01f

    .line 697
    .line 698
    .line 699
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    const/high16 v17, 0x3f800000    # 1.0f

    .line 703
    .line 704
    const v18, 0x3fdd70a4    # 1.73f

    .line 705
    .line 706
    .line 707
    const v13, 0x3f11eb85    # 0.57f

    .line 708
    .line 709
    .line 710
    const v14, 0x3efae148    # 0.49f

    .line 711
    .line 712
    .line 713
    const/high16 v15, 0x3f800000    # 1.0f

    .line 714
    .line 715
    const v16, 0x3f83d70a    # 1.03f

    .line 716
    .line 717
    .line 718
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    const/high16 v17, 0x41680000    # 14.5f

    .line 722
    .line 723
    const/high16 v18, 0x41a00000    # 20.0f

    .line 724
    .line 725
    const/high16 v13, 0x41880000    # 17.0f

    .line 726
    .line 727
    const v14, 0x41970a3d    # 18.88f

    .line 728
    .line 729
    .line 730
    const v15, 0x417e147b    # 15.88f

    .line 731
    .line 732
    .line 733
    const/high16 v16, 0x41a00000    # 20.0f

    .line 734
    .line 735
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 736
    .line 737
    .line 738
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 739
    .line 740
    .line 741
    const/high16 v0, 0x41600000    # 14.0f

    .line 742
    .line 743
    const/high16 v2, 0x41800000    # 16.0f

    .line 744
    .line 745
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 746
    .line 747
    .line 748
    const/high16 v17, -0x41000000    # -0.5f

    .line 749
    .line 750
    const/high16 v18, 0x3f400000    # 0.75f

    .line 751
    .line 752
    const/4 v13, 0x0

    .line 753
    const v14, 0x3ed1eb85    # 0.41f

    .line 754
    .line 755
    .line 756
    const v15, -0x419eb852    # -0.22f

    .line 757
    .line 758
    .line 759
    const/high16 v16, 0x3f400000    # 0.75f

    .line 760
    .line 761
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 762
    .line 763
    .line 764
    const v0, 0x418347ae    # 16.41f

    .line 765
    .line 766
    .line 767
    const/high16 v2, 0x41500000    # 13.0f

    .line 768
    .line 769
    const/high16 v4, 0x41800000    # 16.0f

    .line 770
    .line 771
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 772
    .line 773
    .line 774
    const/high16 v17, 0x3f000000    # 0.5f

    .line 775
    .line 776
    const/high16 v18, -0x40c00000    # -0.75f

    .line 777
    .line 778
    const v14, -0x412e147b    # -0.41f

    .line 779
    .line 780
    .line 781
    const v15, 0x3e6147ae    # 0.22f

    .line 782
    .line 783
    .line 784
    const/high16 v16, -0x40c00000    # -0.75f

    .line 785
    .line 786
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 787
    .line 788
    .line 789
    const v0, 0x417970a4    # 15.59f

    .line 790
    .line 791
    .line 792
    const/high16 v2, 0x41600000    # 14.0f

    .line 793
    .line 794
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 795
    .line 796
    .line 797
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 798
    .line 799
    .line 800
    const/high16 v0, 0x41300000    # 11.0f

    .line 801
    .line 802
    const/high16 v2, 0x41800000    # 16.0f

    .line 803
    .line 804
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 805
    .line 806
    .line 807
    const/high16 v17, -0x41000000    # -0.5f

    .line 808
    .line 809
    const/high16 v18, 0x3f400000    # 0.75f

    .line 810
    .line 811
    const v14, 0x3ed1eb85    # 0.41f

    .line 812
    .line 813
    .line 814
    const v15, -0x419eb852    # -0.22f

    .line 815
    .line 816
    .line 817
    const/high16 v16, 0x3f400000    # 0.75f

    .line 818
    .line 819
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 820
    .line 821
    .line 822
    const/high16 v0, 0x41200000    # 10.0f

    .line 823
    .line 824
    const v2, 0x418347ae    # 16.41f

    .line 825
    .line 826
    .line 827
    invoke-virtual {v12, v0, v2, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 828
    .line 829
    .line 830
    const/high16 v17, 0x3f000000    # 0.5f

    .line 831
    .line 832
    const/high16 v18, -0x40c00000    # -0.75f

    .line 833
    .line 834
    const v14, -0x412e147b    # -0.41f

    .line 835
    .line 836
    .line 837
    const v15, 0x3e6147ae    # 0.22f

    .line 838
    .line 839
    .line 840
    const/high16 v16, -0x40c00000    # -0.75f

    .line 841
    .line 842
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 843
    .line 844
    .line 845
    const v0, 0x417970a4    # 15.59f

    .line 846
    .line 847
    .line 848
    const/high16 v2, 0x41300000    # 11.0f

    .line 849
    .line 850
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 851
    .line 852
    .line 853
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 854
    .line 855
    .line 856
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 857
    .line 858
    .line 859
    move-result-object v2

    .line 860
    const/16 v16, 0x3800

    .line 861
    .line 862
    const/16 v17, 0x0

    .line 863
    .line 864
    const/high16 v6, 0x3f800000    # 1.0f

    .line 865
    .line 866
    const/high16 v8, 0x3f800000    # 1.0f

    .line 867
    .line 868
    const/4 v7, 0x0

    .line 869
    const/high16 v9, 0x3f800000    # 1.0f

    .line 870
    .line 871
    const/high16 v12, 0x3f800000    # 1.0f

    .line 872
    .line 873
    const/4 v14, 0x0

    .line 874
    const/4 v15, 0x0

    .line 875
    const-string v4, ""

    .line 876
    .line 877
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 878
    .line 879
    .line 880
    move-result-object v0

    .line 881
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 882
    .line 883
    .line 884
    move-result-object v0

    .line 885
    sput-object v0, Landroidx/compose/material/icons/outlined/CrueltyFreeKt;->_crueltyFree:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 886
    .line 887
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 888
    .line 889
    .line 890
    return-object v0
.end method
