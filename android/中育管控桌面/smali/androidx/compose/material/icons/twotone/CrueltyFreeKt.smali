.class public final Landroidx/compose/material/icons/twotone/CrueltyFreeKt;
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
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getCrueltyFree",
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
        "SMAP\nCrueltyFree.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrueltyFree.kt\nandroidx/compose/material/icons/twotone/CrueltyFreeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,135:1\n212#2,12:136\n233#2,18:149\n253#2:186\n233#2,18:187\n253#2:224\n174#3:148\n705#4,2:167\n717#4,2:169\n719#4,11:175\n705#4,2:205\n717#4,2:207\n719#4,11:213\n72#5,4:171\n72#5,4:209\n*S KotlinDebug\n*F\n+ 1 CrueltyFree.kt\nandroidx/compose/material/icons/twotone/CrueltyFreeKt\n*L\n29#1:136,12\n30#1:149,18\n30#1:186\n72#1:187,18\n72#1:224\n29#1:148\n30#1:167,2\n30#1:169,2\n30#1:175,11\n72#1:205,2\n72#1:207,2\n72#1:213,11\n30#1:171,4\n72#1:209,4\n*E\n"
    }
.end annotation


# static fields
.field private static _crueltyFree:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCrueltyFree(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/CrueltyFreeKt;->_crueltyFree:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.CrueltyFree"

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
    const v4, 0x4080f5c3    # 4.03f

    .line 71
    .line 72
    .line 73
    const v6, 0x41870a3d    # 16.88f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v25, 0x41880000    # 17.0f

    .line 80
    .line 81
    const/high16 v26, 0x40a00000    # 5.0f

    .line 82
    .line 83
    const v21, 0x4187851f    # 16.94f

    .line 84
    .line 85
    .line 86
    const v22, 0x40866666    # 4.2f

    .line 87
    .line 88
    .line 89
    const/high16 v23, 0x41880000    # 17.0f

    .line 90
    .line 91
    const v24, 0x409051ec    # 4.51f

    .line 92
    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v25, -0x3ffb851f    # -2.07f

    .line 100
    .line 101
    .line 102
    const v26, 0x40d8f5c3    # 6.78f

    .line 103
    .line 104
    .line 105
    const/16 v21, 0x0

    .line 106
    .line 107
    const v22, 0x4035c28f    # 2.84f

    .line 108
    .line 109
    .line 110
    const v23, -0x4071eb85    # -1.11f

    .line 111
    .line 112
    .line 113
    const v24, 0x40a7ae14    # 5.24f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v25, -0x404ccccd    # -1.4f

    .line 120
    .line 121
    .line 122
    const v26, -0x40e147ae    # -0.62f

    .line 123
    .line 124
    .line 125
    const v21, -0x413d70a4    # -0.38f

    .line 126
    .line 127
    .line 128
    const v22, -0x417ae148    # -0.26f

    .line 129
    .line 130
    .line 131
    const v23, -0x40ab851f    # -0.83f

    .line 132
    .line 133
    .line 134
    const v24, -0x410a3d71    # -0.48f

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v25, 0x41870a3d    # 16.88f

    .line 141
    .line 142
    .line 143
    const v26, 0x4080f5c3    # 4.03f

    .line 144
    .line 145
    .line 146
    const v21, 0x415c51ec    # 13.77f

    .line 147
    .line 148
    .line 149
    const v22, 0x40d47ae1    # 6.64f

    .line 150
    .line 151
    .line 152
    const v23, 0x417f851f    # 15.97f

    .line 153
    .line 154
    .line 155
    const v24, 0x408a8f5c    # 4.33f

    .line 156
    .line 157
    .line 158
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v4, 0x40a00000    # 5.0f

    .line 165
    .line 166
    const/high16 v6, 0x40e00000    # 7.0f

    .line 167
    .line 168
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v25, 0x3df5c28f    # 0.12f

    .line 172
    .line 173
    .line 174
    const v26, -0x4087ae14    # -0.97f

    .line 175
    .line 176
    .line 177
    const/16 v21, 0x0

    .line 178
    .line 179
    const v22, -0x41051eb8    # -0.49f

    .line 180
    .line 181
    .line 182
    const v23, 0x3d75c28f    # 0.06f

    .line 183
    .line 184
    .line 185
    const v24, -0x40b33333    # -0.8f

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v25, 0x40570a3d    # 3.36f

    .line 192
    .line 193
    .line 194
    const v26, 0x40e428f6    # 7.13f

    .line 195
    .line 196
    .line 197
    const v21, 0x3f68f5c3    # 0.91f

    .line 198
    .line 199
    .line 200
    const v22, 0x3e99999a    # 0.3f

    .line 201
    .line 202
    .line 203
    const v23, 0x40470a3d    # 3.11f

    .line 204
    .line 205
    .line 206
    const v24, 0x40270a3d    # 2.61f

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v25, -0x404ccccd    # -1.4f

    .line 213
    .line 214
    .line 215
    const v26, 0x3f1eb852    # 0.62f

    .line 216
    .line 217
    .line 218
    const v21, -0x40eb851f    # -0.58f

    .line 219
    .line 220
    .line 221
    const v22, 0x3e0f5c29    # 0.14f

    .line 222
    .line 223
    .line 224
    const v23, -0x407c28f6    # -1.03f

    .line 225
    .line 226
    .line 227
    const v24, 0x3eb33333    # 0.35f

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v25, 0x40e00000    # 7.0f

    .line 234
    .line 235
    const/high16 v26, 0x40a00000    # 5.0f

    .line 236
    .line 237
    const v21, 0x4101c28f    # 8.11f

    .line 238
    .line 239
    .line 240
    const v22, 0x4123d70a    # 10.24f

    .line 241
    .line 242
    .line 243
    const/high16 v23, 0x40e00000    # 7.0f

    .line 244
    .line 245
    const v24, 0x40fae148    # 7.84f

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v4, 0x417c51ec    # 15.77f

    .line 255
    .line 256
    .line 257
    const/high16 v6, 0x41800000    # 16.0f

    .line 258
    .line 259
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v25, -0x4059999a    # -1.3f

    .line 263
    .line 264
    .line 265
    const v26, -0x4050a3d7    # -1.37f

    .line 266
    .line 267
    .line 268
    const v21, -0x411eb852    # -0.44f

    .line 269
    .line 270
    .line 271
    const v22, -0x4147ae14    # -0.36f

    .line 272
    .line 273
    .line 274
    const v23, -0x40e3d70a    # -0.61f

    .line 275
    .line 276
    .line 277
    const v24, -0x40fae148    # -0.52f

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const/high16 v25, 0x41400000    # 12.0f

    .line 284
    .line 285
    const/high16 v26, 0x41500000    # 13.0f

    .line 286
    .line 287
    const v21, 0x415f0a3d    # 13.94f

    .line 288
    .line 289
    .line 290
    const v22, 0x41573333    # 13.45f

    .line 291
    .line 292
    .line 293
    const v23, 0x4159c28f    # 13.61f

    .line 294
    .line 295
    .line 296
    const/high16 v24, 0x41500000    # 13.0f

    .line 297
    .line 298
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const v4, -0x4007ae14    # -1.94f

    .line 302
    .line 303
    .line 304
    const v6, -0x3fd33333    # -2.7f

    .line 305
    .line 306
    .line 307
    const v7, 0x3fb33333    # 1.4f

    .line 308
    .line 309
    .line 310
    const v8, 0x3ee66666    # 0.45f

    .line 311
    .line 312
    .line 313
    invoke-virtual {v2, v4, v8, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v25, -0x4059999a    # -1.3f

    .line 317
    .line 318
    .line 319
    const v26, 0x3faf5c29    # 1.37f

    .line 320
    .line 321
    .line 322
    const v21, -0x40cf5c29    # -0.69f

    .line 323
    .line 324
    .line 325
    const v22, 0x3f59999a    # 0.85f

    .line 326
    .line 327
    .line 328
    const v23, -0x40a3d70a    # -0.86f

    .line 329
    .line 330
    .line 331
    const v24, 0x3f8147ae    # 1.01f

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/high16 v25, -0x40800000    # -1.0f

    .line 338
    .line 339
    const v26, 0x3fdd70a4    # 1.73f

    .line 340
    .line 341
    .line 342
    const v21, -0x40ee147b    # -0.57f

    .line 343
    .line 344
    .line 345
    const v22, 0x3efae148    # 0.49f

    .line 346
    .line 347
    .line 348
    const/high16 v23, -0x40800000    # -1.0f

    .line 349
    .line 350
    const v24, 0x3f83d70a    # 1.03f

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/high16 v25, 0x41180000    # 9.5f

    .line 357
    .line 358
    const/high16 v26, 0x41a00000    # 20.0f

    .line 359
    .line 360
    const/high16 v21, 0x40e00000    # 7.0f

    .line 361
    .line 362
    const v22, 0x41970a3d    # 18.88f

    .line 363
    .line 364
    .line 365
    const v23, 0x4101eb85    # 8.12f

    .line 366
    .line 367
    .line 368
    const/high16 v24, 0x41a00000    # 20.0f

    .line 369
    .line 370
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v25, 0x400e147b    # 2.22f

    .line 374
    .line 375
    .line 376
    const v26, -0x40f0a3d7    # -0.56f

    .line 377
    .line 378
    .line 379
    const/high16 v21, 0x3f800000    # 1.0f

    .line 380
    .line 381
    const/16 v22, 0x0

    .line 382
    .line 383
    const v23, 0x3fe66666    # 1.8f

    .line 384
    .line 385
    .line 386
    const v24, -0x41570a3d    # -0.33f

    .line 387
    .line 388
    .line 389
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const/high16 v25, 0x41300000    # 11.0f

    .line 393
    .line 394
    const/high16 v26, 0x41940000    # 18.5f

    .line 395
    .line 396
    const v21, 0x4134cccd    # 11.3f

    .line 397
    .line 398
    .line 399
    const v22, 0x419a147b    # 19.26f

    .line 400
    .line 401
    .line 402
    const/high16 v23, 0x41300000    # 11.0f

    .line 403
    .line 404
    const v24, 0x4195d70a    # 18.73f

    .line 405
    .line 406
    .line 407
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v25, 0x3f800000    # 1.0f

    .line 411
    .line 412
    const/high16 v26, -0x41000000    # -0.5f

    .line 413
    .line 414
    const/16 v21, 0x0

    .line 415
    .line 416
    const v22, -0x4170a3d7    # -0.28f

    .line 417
    .line 418
    .line 419
    const v23, 0x3ee66666    # 0.45f

    .line 420
    .line 421
    .line 422
    const/high16 v24, -0x41000000    # -0.5f

    .line 423
    .line 424
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v4, 0x3e6147ae    # 0.22f

    .line 428
    .line 429
    .line 430
    const/high16 v6, 0x3f800000    # 1.0f

    .line 431
    .line 432
    const/high16 v7, 0x3f000000    # 0.5f

    .line 433
    .line 434
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const v25, -0x40c7ae14    # -0.72f

    .line 438
    .line 439
    .line 440
    const v26, 0x3f70a3d7    # 0.94f

    .line 441
    .line 442
    .line 443
    const v22, 0x3e6b851f    # 0.23f

    .line 444
    .line 445
    .line 446
    const v23, -0x41666666    # -0.3f

    .line 447
    .line 448
    .line 449
    const v24, 0x3f428f5c    # 0.76f

    .line 450
    .line 451
    .line 452
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const/high16 v25, 0x41680000    # 14.5f

    .line 456
    .line 457
    const/high16 v26, 0x41a00000    # 20.0f

    .line 458
    .line 459
    const v21, 0x414b3333    # 12.7f

    .line 460
    .line 461
    .line 462
    const v22, 0x419d5c29    # 19.67f

    .line 463
    .line 464
    .line 465
    const/high16 v23, 0x41580000    # 13.5f

    .line 466
    .line 467
    const/high16 v24, 0x41a00000    # 20.0f

    .line 468
    .line 469
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const/high16 v25, 0x40200000    # 2.5f

    .line 473
    .line 474
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 475
    .line 476
    const v21, 0x3fb0a3d7    # 1.38f

    .line 477
    .line 478
    .line 479
    const/16 v22, 0x0

    .line 480
    .line 481
    const/high16 v23, 0x40200000    # 2.5f

    .line 482
    .line 483
    const v24, -0x4070a3d7    # -1.12f

    .line 484
    .line 485
    .line 486
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const/high16 v25, 0x41800000    # 16.0f

    .line 490
    .line 491
    const v26, 0x417c51ec    # 15.77f

    .line 492
    .line 493
    .line 494
    const/high16 v21, 0x41880000    # 17.0f

    .line 495
    .line 496
    const v22, 0x41866666    # 16.8f

    .line 497
    .line 498
    .line 499
    const v23, 0x41848f5c    # 16.57f

    .line 500
    .line 501
    .line 502
    const v24, 0x4182147b    # 16.26f

    .line 503
    .line 504
    .line 505
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const/high16 v4, 0x41280000    # 10.5f

    .line 512
    .line 513
    const/high16 v6, 0x41860000    # 16.75f

    .line 514
    .line 515
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const/high16 v25, -0x41000000    # -0.5f

    .line 519
    .line 520
    const/high16 v26, -0x40c00000    # -0.75f

    .line 521
    .line 522
    const v21, -0x4170a3d7    # -0.28f

    .line 523
    .line 524
    .line 525
    const/16 v22, 0x0

    .line 526
    .line 527
    const/high16 v23, -0x41000000    # -0.5f

    .line 528
    .line 529
    const v24, -0x4151eb85    # -0.34f

    .line 530
    .line 531
    .line 532
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const/high16 v25, 0x3f000000    # 0.5f

    .line 536
    .line 537
    const/16 v21, 0x0

    .line 538
    .line 539
    const v22, -0x412e147b    # -0.41f

    .line 540
    .line 541
    .line 542
    const v23, 0x3e6147ae    # 0.22f

    .line 543
    .line 544
    .line 545
    const/high16 v24, -0x40c00000    # -0.75f

    .line 546
    .line 547
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const v4, 0x417970a4    # 15.59f

    .line 551
    .line 552
    .line 553
    const/high16 v6, 0x41300000    # 11.0f

    .line 554
    .line 555
    const/high16 v7, 0x41800000    # 16.0f

    .line 556
    .line 557
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const/high16 v25, 0x41280000    # 10.5f

    .line 561
    .line 562
    const/high16 v26, 0x41860000    # 16.75f

    .line 563
    .line 564
    const/high16 v21, 0x41300000    # 11.0f

    .line 565
    .line 566
    const v22, 0x418347ae    # 16.41f

    .line 567
    .line 568
    .line 569
    const v23, 0x412c7ae1    # 10.78f

    .line 570
    .line 571
    .line 572
    const/high16 v24, 0x41860000    # 16.75f

    .line 573
    .line 574
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const/high16 v4, 0x41580000    # 13.5f

    .line 581
    .line 582
    const/high16 v6, 0x41860000    # 16.75f

    .line 583
    .line 584
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const/high16 v25, -0x41000000    # -0.5f

    .line 588
    .line 589
    const/high16 v26, -0x40c00000    # -0.75f

    .line 590
    .line 591
    const v21, -0x4170a3d7    # -0.28f

    .line 592
    .line 593
    .line 594
    const/16 v22, 0x0

    .line 595
    .line 596
    const/high16 v23, -0x41000000    # -0.5f

    .line 597
    .line 598
    const v24, -0x4151eb85    # -0.34f

    .line 599
    .line 600
    .line 601
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const/high16 v25, 0x3f000000    # 0.5f

    .line 605
    .line 606
    const/16 v21, 0x0

    .line 607
    .line 608
    const v22, -0x412e147b    # -0.41f

    .line 609
    .line 610
    .line 611
    const v23, 0x3e6147ae    # 0.22f

    .line 612
    .line 613
    .line 614
    const/high16 v24, -0x40c00000    # -0.75f

    .line 615
    .line 616
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const v4, 0x417970a4    # 15.59f

    .line 620
    .line 621
    .line 622
    const/high16 v6, 0x41600000    # 14.0f

    .line 623
    .line 624
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    const/high16 v25, 0x41580000    # 13.5f

    .line 628
    .line 629
    const/high16 v26, 0x41860000    # 16.75f

    .line 630
    .line 631
    const/high16 v21, 0x41600000    # 14.0f

    .line 632
    .line 633
    const v22, 0x418347ae    # 16.41f

    .line 634
    .line 635
    .line 636
    const v23, 0x415c7ae1    # 13.78f

    .line 637
    .line 638
    .line 639
    const/high16 v24, 0x41860000    # 16.75f

    .line 640
    .line 641
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 648
    .line 649
    .line 650
    move-result-object v2

    .line 651
    const/16 v16, 0x3800

    .line 652
    .line 653
    const/16 v17, 0x0

    .line 654
    .line 655
    const v6, 0x3e99999a    # 0.3f

    .line 656
    .line 657
    .line 658
    const v8, 0x3e99999a    # 0.3f

    .line 659
    .line 660
    .line 661
    const/4 v7, 0x0

    .line 662
    const/high16 v9, 0x3f800000    # 1.0f

    .line 663
    .line 664
    const/high16 v12, 0x3f800000    # 1.0f

    .line 665
    .line 666
    const/4 v13, 0x0

    .line 667
    const/4 v14, 0x0

    .line 668
    const/4 v15, 0x0

    .line 669
    const-string v4, ""

    .line 670
    .line 671
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 672
    .line 673
    .line 674
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 675
    .line 676
    .line 677
    move-result v3

    .line 678
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 679
    .line 680
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 681
    .line 682
    .line 683
    move-result-wide v6

    .line 684
    const/4 v0, 0x0

    .line 685
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 686
    .line 687
    .line 688
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 689
    .line 690
    .line 691
    move-result v10

    .line 692
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 693
    .line 694
    .line 695
    move-result v11

    .line 696
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 699
    .line 700
    .line 701
    const/high16 v0, 0x41880000    # 17.0f

    .line 702
    .line 703
    const/high16 v2, 0x41600000    # 14.0f

    .line 704
    .line 705
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 706
    .line 707
    .line 708
    const v17, -0x40d9999a    # -0.65f

    .line 709
    .line 710
    .line 711
    const/high16 v18, -0x40c00000    # -0.75f

    .line 712
    .line 713
    const v13, -0x418a3d71    # -0.24f

    .line 714
    .line 715
    .line 716
    const v14, -0x418a3d71    # -0.24f

    .line 717
    .line 718
    .line 719
    const v15, -0x411eb852    # -0.44f

    .line 720
    .line 721
    .line 722
    const v16, -0x41051eb8    # -0.49f

    .line 723
    .line 724
    .line 725
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 726
    .line 727
    .line 728
    const/high16 v17, 0x41980000    # 19.0f

    .line 729
    .line 730
    const/high16 v18, 0x40a00000    # 5.0f

    .line 731
    .line 732
    const v13, 0x418c147b    # 17.51f

    .line 733
    .line 734
    .line 735
    const/high16 v14, 0x41380000    # 11.5f

    .line 736
    .line 737
    const/high16 v15, 0x41980000    # 19.0f

    .line 738
    .line 739
    const v16, 0x4108f5c3    # 8.56f

    .line 740
    .line 741
    .line 742
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    const/high16 v17, -0x40000000    # -2.0f

    .line 746
    .line 747
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 748
    .line 749
    const/4 v13, 0x0

    .line 750
    const v14, -0x40066666    # -1.95f

    .line 751
    .line 752
    .line 753
    const v15, -0x40c28f5c    # -0.74f

    .line 754
    .line 755
    .line 756
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 757
    .line 758
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 759
    .line 760
    .line 761
    const/high16 v17, -0x3f600000    # -5.0f

    .line 762
    .line 763
    const v18, 0x40bf0a3d    # 5.97f

    .line 764
    .line 765
    .line 766
    const v13, -0x403ae148    # -1.54f

    .line 767
    .line 768
    .line 769
    const/4 v14, 0x0

    .line 770
    const v15, -0x3f828f5c    # -3.96f

    .line 771
    .line 772
    .line 773
    const v16, 0x4003d70a    # 2.06f

    .line 774
    .line 775
    .line 776
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 777
    .line 778
    .line 779
    const/high16 v17, 0x40e00000    # 7.0f

    .line 780
    .line 781
    const/high16 v18, 0x40000000    # 2.0f

    .line 782
    .line 783
    const v13, 0x412f5c29    # 10.96f

    .line 784
    .line 785
    .line 786
    const v14, 0x4081eb85    # 4.06f

    .line 787
    .line 788
    .line 789
    const v15, 0x4108a3d7    # 8.54f

    .line 790
    .line 791
    .line 792
    const/high16 v16, 0x40000000    # 2.0f

    .line 793
    .line 794
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 795
    .line 796
    .line 797
    const/high16 v17, 0x40a00000    # 5.0f

    .line 798
    .line 799
    const/high16 v18, 0x40a00000    # 5.0f

    .line 800
    .line 801
    const v13, 0x40b7ae14    # 5.74f

    .line 802
    .line 803
    .line 804
    const/high16 v14, 0x40000000    # 2.0f

    .line 805
    .line 806
    const/high16 v15, 0x40a00000    # 5.0f

    .line 807
    .line 808
    const v16, 0x40433333    # 3.05f

    .line 809
    .line 810
    .line 811
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 812
    .line 813
    .line 814
    const v17, 0x4029999a    # 2.65f

    .line 815
    .line 816
    .line 817
    const/high16 v18, 0x41040000    # 8.25f

    .line 818
    .line 819
    const/4 v13, 0x0

    .line 820
    const v14, 0x4063d70a    # 3.56f

    .line 821
    .line 822
    .line 823
    const v15, 0x3fbeb852    # 1.49f

    .line 824
    .line 825
    .line 826
    const/high16 v16, 0x40d00000    # 6.5f

    .line 827
    .line 828
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 829
    .line 830
    .line 831
    const/high16 v17, 0x40e00000    # 7.0f

    .line 832
    .line 833
    const/high16 v18, 0x41600000    # 14.0f

    .line 834
    .line 835
    const v13, 0x40ee147b    # 7.44f

    .line 836
    .line 837
    .line 838
    const v14, 0x415828f6    # 13.51f

    .line 839
    .line 840
    .line 841
    const v15, 0x40e7ae14    # 7.24f

    .line 842
    .line 843
    .line 844
    const v16, 0x415c28f6    # 13.76f

    .line 845
    .line 846
    .line 847
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 848
    .line 849
    .line 850
    const/high16 v17, -0x40000000    # -2.0f

    .line 851
    .line 852
    const/high16 v18, 0x40600000    # 3.5f

    .line 853
    .line 854
    const/high16 v13, -0x41800000    # -0.25f

    .line 855
    .line 856
    const/high16 v14, 0x3e800000    # 0.25f

    .line 857
    .line 858
    const/high16 v15, -0x40000000    # -2.0f

    .line 859
    .line 860
    const v16, 0x3fb1eb85    # 1.39f

    .line 861
    .line 862
    .line 863
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 864
    .line 865
    .line 866
    const/high16 v17, 0x41180000    # 9.5f

    .line 867
    .line 868
    const/high16 v18, 0x41b00000    # 22.0f

    .line 869
    .line 870
    const/high16 v13, 0x40a00000    # 5.0f

    .line 871
    .line 872
    const v14, 0x419fd70a    # 19.98f

    .line 873
    .line 874
    .line 875
    const v15, 0x40e0a3d7    # 7.02f

    .line 876
    .line 877
    .line 878
    const/high16 v16, 0x41b00000    # 22.0f

    .line 879
    .line 880
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 881
    .line 882
    .line 883
    const/high16 v17, 0x40200000    # 2.5f

    .line 884
    .line 885
    const/high16 v18, -0x41000000    # -0.5f

    .line 886
    .line 887
    const/high16 v13, 0x3fc00000    # 1.5f

    .line 888
    .line 889
    const/4 v14, 0x0

    .line 890
    const/high16 v15, 0x40200000    # 2.5f

    .line 891
    .line 892
    const/high16 v16, -0x41000000    # -0.5f

    .line 893
    .line 894
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 895
    .line 896
    .line 897
    const/high16 v0, 0x40200000    # 2.5f

    .line 898
    .line 899
    const/high16 v2, 0x3f800000    # 1.0f

    .line 900
    .line 901
    const/high16 v4, 0x3f000000    # 0.5f

    .line 902
    .line 903
    invoke-virtual {v12, v2, v4, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 904
    .line 905
    .line 906
    const/high16 v17, 0x40900000    # 4.5f

    .line 907
    .line 908
    const/high16 v18, -0x3f700000    # -4.5f

    .line 909
    .line 910
    const v13, 0x401eb852    # 2.48f

    .line 911
    .line 912
    .line 913
    const/high16 v15, 0x40900000    # 4.5f

    .line 914
    .line 915
    const v16, -0x3ffeb852    # -2.02f

    .line 916
    .line 917
    .line 918
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 919
    .line 920
    .line 921
    const/high16 v17, 0x41880000    # 17.0f

    .line 922
    .line 923
    const/high16 v18, 0x41600000    # 14.0f

    .line 924
    .line 925
    const/high16 v13, 0x41980000    # 19.0f

    .line 926
    .line 927
    const v14, 0x41763d71    # 15.39f

    .line 928
    .line 929
    .line 930
    const/high16 v15, 0x418a0000    # 17.25f

    .line 931
    .line 932
    const/high16 v16, 0x41640000    # 14.25f

    .line 933
    .line 934
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 935
    .line 936
    .line 937
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 938
    .line 939
    .line 940
    const v0, 0x4080f5c3    # 4.03f

    .line 941
    .line 942
    .line 943
    const v2, 0x41870a3d    # 16.88f

    .line 944
    .line 945
    .line 946
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 947
    .line 948
    .line 949
    const/high16 v18, 0x40a00000    # 5.0f

    .line 950
    .line 951
    const v13, 0x4187851f    # 16.94f

    .line 952
    .line 953
    .line 954
    const v14, 0x40866666    # 4.2f

    .line 955
    .line 956
    .line 957
    const/high16 v15, 0x41880000    # 17.0f

    .line 958
    .line 959
    const v16, 0x409051ec    # 4.51f

    .line 960
    .line 961
    .line 962
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 963
    .line 964
    .line 965
    const v17, -0x3ffb851f    # -2.07f

    .line 966
    .line 967
    .line 968
    const v18, 0x40d8f5c3    # 6.78f

    .line 969
    .line 970
    .line 971
    const/4 v13, 0x0

    .line 972
    const v14, 0x4035c28f    # 2.84f

    .line 973
    .line 974
    .line 975
    const v15, -0x4071eb85    # -1.11f

    .line 976
    .line 977
    .line 978
    const v16, 0x40a7ae14    # 5.24f

    .line 979
    .line 980
    .line 981
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 982
    .line 983
    .line 984
    const v17, -0x404ccccd    # -1.4f

    .line 985
    .line 986
    .line 987
    const v18, -0x40e147ae    # -0.62f

    .line 988
    .line 989
    .line 990
    const v13, -0x413d70a4    # -0.38f

    .line 991
    .line 992
    .line 993
    const v14, -0x417ae148    # -0.26f

    .line 994
    .line 995
    .line 996
    const v15, -0x40ab851f    # -0.83f

    .line 997
    .line 998
    .line 999
    const v16, -0x410a3d71    # -0.48f

    .line 1000
    .line 1001
    .line 1002
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1003
    .line 1004
    .line 1005
    const v17, 0x41870a3d    # 16.88f

    .line 1006
    .line 1007
    .line 1008
    const v18, 0x4080f5c3    # 4.03f

    .line 1009
    .line 1010
    .line 1011
    const v13, 0x415c51ec    # 13.77f

    .line 1012
    .line 1013
    .line 1014
    const v14, 0x40d47ae1    # 6.64f

    .line 1015
    .line 1016
    .line 1017
    const v15, 0x417f851f    # 15.97f

    .line 1018
    .line 1019
    .line 1020
    const v16, 0x408a8f5c    # 4.33f

    .line 1021
    .line 1022
    .line 1023
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1024
    .line 1025
    .line 1026
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1027
    .line 1028
    .line 1029
    const/high16 v0, 0x40a00000    # 5.0f

    .line 1030
    .line 1031
    const/high16 v2, 0x40e00000    # 7.0f

    .line 1032
    .line 1033
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1034
    .line 1035
    .line 1036
    const v17, 0x3df5c28f    # 0.12f

    .line 1037
    .line 1038
    .line 1039
    const v18, -0x4087ae14    # -0.97f

    .line 1040
    .line 1041
    .line 1042
    const/4 v13, 0x0

    .line 1043
    const v14, -0x41051eb8    # -0.49f

    .line 1044
    .line 1045
    .line 1046
    const v15, 0x3d75c28f    # 0.06f

    .line 1047
    .line 1048
    .line 1049
    const v16, -0x40b33333    # -0.8f

    .line 1050
    .line 1051
    .line 1052
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1053
    .line 1054
    .line 1055
    const v17, 0x40570a3d    # 3.36f

    .line 1056
    .line 1057
    .line 1058
    const v18, 0x40e428f6    # 7.13f

    .line 1059
    .line 1060
    .line 1061
    const v13, 0x3f68f5c3    # 0.91f

    .line 1062
    .line 1063
    .line 1064
    const v14, 0x3e99999a    # 0.3f

    .line 1065
    .line 1066
    .line 1067
    const v15, 0x40470a3d    # 3.11f

    .line 1068
    .line 1069
    .line 1070
    const v16, 0x40270a3d    # 2.61f

    .line 1071
    .line 1072
    .line 1073
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1074
    .line 1075
    .line 1076
    const v17, -0x404ccccd    # -1.4f

    .line 1077
    .line 1078
    .line 1079
    const v18, 0x3f1eb852    # 0.62f

    .line 1080
    .line 1081
    .line 1082
    const v13, -0x40eb851f    # -0.58f

    .line 1083
    .line 1084
    .line 1085
    const v14, 0x3e0f5c29    # 0.14f

    .line 1086
    .line 1087
    .line 1088
    const v15, -0x407c28f6    # -1.03f

    .line 1089
    .line 1090
    .line 1091
    const v16, 0x3eb33333    # 0.35f

    .line 1092
    .line 1093
    .line 1094
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1095
    .line 1096
    .line 1097
    const/high16 v17, 0x40e00000    # 7.0f

    .line 1098
    .line 1099
    const/high16 v18, 0x40a00000    # 5.0f

    .line 1100
    .line 1101
    const v13, 0x4101c28f    # 8.11f

    .line 1102
    .line 1103
    .line 1104
    const v14, 0x4123d70a    # 10.24f

    .line 1105
    .line 1106
    .line 1107
    const/high16 v15, 0x40e00000    # 7.0f

    .line 1108
    .line 1109
    const v16, 0x40fae148    # 7.84f

    .line 1110
    .line 1111
    .line 1112
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1113
    .line 1114
    .line 1115
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1116
    .line 1117
    .line 1118
    const/high16 v0, 0x41680000    # 14.5f

    .line 1119
    .line 1120
    const/high16 v2, 0x41a00000    # 20.0f

    .line 1121
    .line 1122
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1123
    .line 1124
    .line 1125
    const v17, -0x3ff1eb85    # -2.22f

    .line 1126
    .line 1127
    .line 1128
    const v18, -0x40f0a3d7    # -0.56f

    .line 1129
    .line 1130
    .line 1131
    const/high16 v13, -0x40800000    # -1.0f

    .line 1132
    .line 1133
    const/4 v14, 0x0

    .line 1134
    const v15, -0x4019999a    # -1.8f

    .line 1135
    .line 1136
    .line 1137
    const v16, -0x41570a3d    # -0.33f

    .line 1138
    .line 1139
    .line 1140
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1141
    .line 1142
    .line 1143
    const/high16 v17, 0x41500000    # 13.0f

    .line 1144
    .line 1145
    const/high16 v18, 0x41940000    # 18.5f

    .line 1146
    .line 1147
    const v13, 0x414b3333    # 12.7f

    .line 1148
    .line 1149
    .line 1150
    const v14, 0x419a147b    # 19.26f

    .line 1151
    .line 1152
    .line 1153
    const/high16 v15, 0x41500000    # 13.0f

    .line 1154
    .line 1155
    const v16, 0x4195d70a    # 18.73f

    .line 1156
    .line 1157
    .line 1158
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1159
    .line 1160
    .line 1161
    const/high16 v17, -0x40800000    # -1.0f

    .line 1162
    .line 1163
    const/high16 v18, -0x41000000    # -0.5f

    .line 1164
    .line 1165
    const/4 v13, 0x0

    .line 1166
    const v14, -0x4170a3d7    # -0.28f

    .line 1167
    .line 1168
    .line 1169
    const v15, -0x4119999a    # -0.45f

    .line 1170
    .line 1171
    .line 1172
    const/high16 v16, -0x41000000    # -0.5f

    .line 1173
    .line 1174
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1175
    .line 1176
    .line 1177
    const/high16 v0, -0x40800000    # -1.0f

    .line 1178
    .line 1179
    const v2, 0x3e6147ae    # 0.22f

    .line 1180
    .line 1181
    .line 1182
    invoke-virtual {v12, v0, v2, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1183
    .line 1184
    .line 1185
    const v17, 0x3f3851ec    # 0.72f

    .line 1186
    .line 1187
    .line 1188
    const v18, 0x3f70a3d7    # 0.94f

    .line 1189
    .line 1190
    .line 1191
    const v14, 0x3e6b851f    # 0.23f

    .line 1192
    .line 1193
    .line 1194
    const v15, 0x3e99999a    # 0.3f

    .line 1195
    .line 1196
    .line 1197
    const v16, 0x3f428f5c    # 0.76f

    .line 1198
    .line 1199
    .line 1200
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1201
    .line 1202
    .line 1203
    const/high16 v17, 0x41180000    # 9.5f

    .line 1204
    .line 1205
    const/high16 v18, 0x41a00000    # 20.0f

    .line 1206
    .line 1207
    const v13, 0x4134cccd    # 11.3f

    .line 1208
    .line 1209
    .line 1210
    const v14, 0x419d5c29    # 19.67f

    .line 1211
    .line 1212
    .line 1213
    const/high16 v15, 0x41280000    # 10.5f

    .line 1214
    .line 1215
    const/high16 v16, 0x41a00000    # 20.0f

    .line 1216
    .line 1217
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1218
    .line 1219
    .line 1220
    const/high16 v17, 0x40e00000    # 7.0f

    .line 1221
    .line 1222
    const/high16 v18, 0x418c0000    # 17.5f

    .line 1223
    .line 1224
    const v13, 0x4101eb85    # 8.12f

    .line 1225
    .line 1226
    .line 1227
    const/high16 v14, 0x41a00000    # 20.0f

    .line 1228
    .line 1229
    const/high16 v15, 0x40e00000    # 7.0f

    .line 1230
    .line 1231
    const v16, 0x41970a3d    # 18.88f

    .line 1232
    .line 1233
    .line 1234
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1235
    .line 1236
    .line 1237
    const/high16 v17, 0x3f800000    # 1.0f

    .line 1238
    .line 1239
    const v18, -0x40228f5c    # -1.73f

    .line 1240
    .line 1241
    .line 1242
    const/4 v13, 0x0

    .line 1243
    const v14, -0x40cccccd    # -0.7f

    .line 1244
    .line 1245
    .line 1246
    const v15, 0x3edc28f6    # 0.43f

    .line 1247
    .line 1248
    .line 1249
    const v16, -0x406147ae    # -1.24f

    .line 1250
    .line 1251
    .line 1252
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1253
    .line 1254
    .line 1255
    const v17, 0x3fa66666    # 1.3f

    .line 1256
    .line 1257
    .line 1258
    const v18, -0x4050a3d7    # -1.37f

    .line 1259
    .line 1260
    .line 1261
    const v13, 0x3ee147ae    # 0.44f

    .line 1262
    .line 1263
    .line 1264
    const v14, -0x4147ae14    # -0.36f

    .line 1265
    .line 1266
    .line 1267
    const v15, 0x3f1c28f6    # 0.61f

    .line 1268
    .line 1269
    .line 1270
    const v16, -0x40fae148    # -0.52f

    .line 1271
    .line 1272
    .line 1273
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1274
    .line 1275
    .line 1276
    const v17, 0x402ccccd    # 2.7f

    .line 1277
    .line 1278
    .line 1279
    const v18, -0x404ccccd    # -1.4f

    .line 1280
    .line 1281
    .line 1282
    const v13, 0x3f428f5c    # 0.76f

    .line 1283
    .line 1284
    .line 1285
    const v14, -0x408ccccd    # -0.95f

    .line 1286
    .line 1287
    .line 1288
    const v15, 0x3f8b851f    # 1.09f

    .line 1289
    .line 1290
    .line 1291
    const v16, -0x404ccccd    # -1.4f

    .line 1292
    .line 1293
    .line 1294
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1295
    .line 1296
    .line 1297
    const v0, 0x3ff851ec    # 1.94f

    .line 1298
    .line 1299
    .line 1300
    const v2, 0x402ccccd    # 2.7f

    .line 1301
    .line 1302
    .line 1303
    const v4, 0x3fb33333    # 1.4f

    .line 1304
    .line 1305
    .line 1306
    const v6, 0x3ee66666    # 0.45f

    .line 1307
    .line 1308
    .line 1309
    invoke-virtual {v12, v0, v6, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1310
    .line 1311
    .line 1312
    const v17, 0x3fa66666    # 1.3f

    .line 1313
    .line 1314
    .line 1315
    const v18, 0x3faf5c29    # 1.37f

    .line 1316
    .line 1317
    .line 1318
    const v13, 0x3f30a3d7    # 0.69f

    .line 1319
    .line 1320
    .line 1321
    const v14, 0x3f59999a    # 0.85f

    .line 1322
    .line 1323
    .line 1324
    const v15, 0x3f5c28f6    # 0.86f

    .line 1325
    .line 1326
    .line 1327
    const v16, 0x3f8147ae    # 1.01f

    .line 1328
    .line 1329
    .line 1330
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1331
    .line 1332
    .line 1333
    const/high16 v17, 0x3f800000    # 1.0f

    .line 1334
    .line 1335
    const v18, 0x3fdd70a4    # 1.73f

    .line 1336
    .line 1337
    .line 1338
    const v13, 0x3f11eb85    # 0.57f

    .line 1339
    .line 1340
    .line 1341
    const v14, 0x3efae148    # 0.49f

    .line 1342
    .line 1343
    .line 1344
    const/high16 v15, 0x3f800000    # 1.0f

    .line 1345
    .line 1346
    const v16, 0x3f83d70a    # 1.03f

    .line 1347
    .line 1348
    .line 1349
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1350
    .line 1351
    .line 1352
    const/high16 v17, 0x41680000    # 14.5f

    .line 1353
    .line 1354
    const/high16 v18, 0x41a00000    # 20.0f

    .line 1355
    .line 1356
    const/high16 v13, 0x41880000    # 17.0f

    .line 1357
    .line 1358
    const v14, 0x41970a3d    # 18.88f

    .line 1359
    .line 1360
    .line 1361
    const v15, 0x417e147b    # 15.88f

    .line 1362
    .line 1363
    .line 1364
    const/high16 v16, 0x41a00000    # 20.0f

    .line 1365
    .line 1366
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1367
    .line 1368
    .line 1369
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1370
    .line 1371
    .line 1372
    const/high16 v0, 0x41600000    # 14.0f

    .line 1373
    .line 1374
    const/high16 v2, 0x41800000    # 16.0f

    .line 1375
    .line 1376
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1377
    .line 1378
    .line 1379
    const/high16 v17, -0x41000000    # -0.5f

    .line 1380
    .line 1381
    const/high16 v18, 0x3f400000    # 0.75f

    .line 1382
    .line 1383
    const/4 v13, 0x0

    .line 1384
    const v14, 0x3ed1eb85    # 0.41f

    .line 1385
    .line 1386
    .line 1387
    const v15, -0x419eb852    # -0.22f

    .line 1388
    .line 1389
    .line 1390
    const/high16 v16, 0x3f400000    # 0.75f

    .line 1391
    .line 1392
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1393
    .line 1394
    .line 1395
    const v0, 0x418347ae    # 16.41f

    .line 1396
    .line 1397
    .line 1398
    const/high16 v2, 0x41500000    # 13.0f

    .line 1399
    .line 1400
    const/high16 v4, 0x41800000    # 16.0f

    .line 1401
    .line 1402
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1403
    .line 1404
    .line 1405
    const/high16 v17, 0x3f000000    # 0.5f

    .line 1406
    .line 1407
    const/high16 v18, -0x40c00000    # -0.75f

    .line 1408
    .line 1409
    const v14, -0x412e147b    # -0.41f

    .line 1410
    .line 1411
    .line 1412
    const v15, 0x3e6147ae    # 0.22f

    .line 1413
    .line 1414
    .line 1415
    const/high16 v16, -0x40c00000    # -0.75f

    .line 1416
    .line 1417
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1418
    .line 1419
    .line 1420
    const v0, 0x417970a4    # 15.59f

    .line 1421
    .line 1422
    .line 1423
    const/high16 v2, 0x41600000    # 14.0f

    .line 1424
    .line 1425
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1426
    .line 1427
    .line 1428
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1429
    .line 1430
    .line 1431
    const/high16 v0, 0x41300000    # 11.0f

    .line 1432
    .line 1433
    const/high16 v2, 0x41800000    # 16.0f

    .line 1434
    .line 1435
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1436
    .line 1437
    .line 1438
    const/high16 v17, -0x41000000    # -0.5f

    .line 1439
    .line 1440
    const/high16 v18, 0x3f400000    # 0.75f

    .line 1441
    .line 1442
    const v14, 0x3ed1eb85    # 0.41f

    .line 1443
    .line 1444
    .line 1445
    const v15, -0x419eb852    # -0.22f

    .line 1446
    .line 1447
    .line 1448
    const/high16 v16, 0x3f400000    # 0.75f

    .line 1449
    .line 1450
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1451
    .line 1452
    .line 1453
    const/high16 v0, 0x41200000    # 10.0f

    .line 1454
    .line 1455
    const v2, 0x418347ae    # 16.41f

    .line 1456
    .line 1457
    .line 1458
    invoke-virtual {v12, v0, v2, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1459
    .line 1460
    .line 1461
    const/high16 v17, 0x3f000000    # 0.5f

    .line 1462
    .line 1463
    const/high16 v18, -0x40c00000    # -0.75f

    .line 1464
    .line 1465
    const v14, -0x412e147b    # -0.41f

    .line 1466
    .line 1467
    .line 1468
    const v15, 0x3e6147ae    # 0.22f

    .line 1469
    .line 1470
    .line 1471
    const/high16 v16, -0x40c00000    # -0.75f

    .line 1472
    .line 1473
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1474
    .line 1475
    .line 1476
    const v0, 0x417970a4    # 15.59f

    .line 1477
    .line 1478
    .line 1479
    const/high16 v2, 0x41300000    # 11.0f

    .line 1480
    .line 1481
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1482
    .line 1483
    .line 1484
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1485
    .line 1486
    .line 1487
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1488
    .line 1489
    .line 1490
    move-result-object v2

    .line 1491
    const/16 v16, 0x3800

    .line 1492
    .line 1493
    const/16 v17, 0x0

    .line 1494
    .line 1495
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1496
    .line 1497
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1498
    .line 1499
    const/4 v7, 0x0

    .line 1500
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1501
    .line 1502
    const/4 v14, 0x0

    .line 1503
    const/4 v15, 0x0

    .line 1504
    const-string v4, ""

    .line 1505
    .line 1506
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1507
    .line 1508
    .line 1509
    move-result-object v0

    .line 1510
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1511
    .line 1512
    .line 1513
    move-result-object v0

    .line 1514
    sput-object v0, Landroidx/compose/material/icons/twotone/CrueltyFreeKt;->_crueltyFree:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1515
    .line 1516
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1517
    .line 1518
    .line 1519
    return-object v0
.end method
