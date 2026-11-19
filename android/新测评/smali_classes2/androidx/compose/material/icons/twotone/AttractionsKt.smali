.class public final Landroidx/compose/material/icons/twotone/AttractionsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_attractions",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Attractions",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getAttractions",
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
        "SMAP\nAttractions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Attractions.kt\nandroidx/compose/material/icons/twotone/AttractionsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,115:1\n212#2,12:116\n233#2,18:129\n253#2:166\n233#2,18:167\n253#2:204\n174#3:128\n705#4,2:147\n717#4,2:149\n719#4,11:155\n705#4,2:185\n717#4,2:187\n719#4,11:193\n72#5,4:151\n72#5,4:189\n*S KotlinDebug\n*F\n+ 1 Attractions.kt\nandroidx/compose/material/icons/twotone/AttractionsKt\n*L\n29#1:116,12\n30#1:129,18\n30#1:166\n36#1:167,18\n36#1:204\n29#1:128\n30#1:147,2\n30#1:149,2\n30#1:155,11\n36#1:185,2\n36#1:187,2\n36#1:193,11\n30#1:151,4\n36#1:189,4\n*E\n"
    }
.end annotation


# static fields
.field private static _attractions:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAttractions(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/AttractionsKt;->_attractions:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Attractions"

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
    const v4, 0x413fae14    # 11.98f

    .line 71
    .line 72
    .line 73
    const v6, 0x414051ec    # 12.02f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/4 v4, 0x0

    .line 80
    const/high16 v6, -0x40400000    # -1.5f

    .line 81
    .line 82
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const/high16 v26, 0x40400000    # 3.0f

    .line 86
    .line 87
    const/16 v27, 0x0

    .line 88
    .line 89
    const/high16 v21, 0x3fc00000    # 1.5f

    .line 90
    .line 91
    const/high16 v22, 0x3fc00000    # 1.5f

    .line 92
    .line 93
    const/16 v23, 0x0

    .line 94
    .line 95
    const/16 v24, 0x1

    .line 96
    .line 97
    const/16 v25, 0x1

    .line 98
    .line 99
    move-object/from16 v20, v2

    .line 100
    .line 101
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 105
    .line 106
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    const/16 v16, 0x3800

    .line 114
    .line 115
    const/16 v17, 0x0

    .line 116
    .line 117
    const v6, 0x3e99999a    # 0.3f

    .line 118
    .line 119
    .line 120
    const v8, 0x3e99999a    # 0.3f

    .line 121
    .line 122
    .line 123
    const/4 v7, 0x0

    .line 124
    const/high16 v9, 0x3f800000    # 1.0f

    .line 125
    .line 126
    const/high16 v12, 0x3f800000    # 1.0f

    .line 127
    .line 128
    const/4 v13, 0x0

    .line 129
    const/4 v14, 0x0

    .line 130
    const/4 v15, 0x0

    .line 131
    const-string v4, ""

    .line 132
    .line 133
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 134
    .line 135
    .line 136
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 141
    .line 142
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 143
    .line 144
    .line 145
    move-result-wide v6

    .line 146
    const/4 v0, 0x0

    .line 147
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 151
    .line 152
    .line 153
    move-result v10

    .line 154
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 155
    .line 156
    .line 157
    move-result v11

    .line 158
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 161
    .line 162
    .line 163
    const v0, 0x4166b852    # 14.42f

    .line 164
    .line 165
    .line 166
    const v2, 0x41a13333    # 20.15f

    .line 167
    .line 168
    .line 169
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v17, 0x3eb33333    # 0.35f

    .line 173
    .line 174
    .line 175
    const v18, -0x3fe51eb8    # -2.42f

    .line 176
    .line 177
    .line 178
    const v13, 0x3e6b851f    # 0.23f

    .line 179
    .line 180
    .line 181
    const v14, -0x40bae148    # -0.77f

    .line 182
    .line 183
    .line 184
    const v15, 0x3eb33333    # 0.35f

    .line 185
    .line 186
    .line 187
    const v16, -0x4035c28f    # -1.58f

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v0, -0x414ccccd    # -0.35f

    .line 194
    .line 195
    .line 196
    const v2, -0x3fe51eb8    # -2.42f

    .line 197
    .line 198
    .line 199
    const v4, -0x420a3d71    # -0.12f

    .line 200
    .line 201
    .line 202
    const v6, -0x402ccccd    # -1.65f

    .line 203
    .line 204
    .line 205
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const v17, 0x3f028f5c    # 0.51f

    .line 209
    .line 210
    .line 211
    const v18, -0x3fdae148    # -2.58f

    .line 212
    .line 213
    .line 214
    const v13, 0x3f47ae14    # 0.78f

    .line 215
    .line 216
    .line 217
    const v14, -0x40e66666    # -0.6f

    .line 218
    .line 219
    .line 220
    const v15, 0x3f828f5c    # 1.02f

    .line 221
    .line 222
    .line 223
    const v16, -0x40266666    # -1.7f

    .line 224
    .line 225
    .line 226
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v17, -0x3fe0a3d7    # -2.49f

    .line 230
    .line 231
    .line 232
    const v18, -0x40a66666    # -0.85f

    .line 233
    .line 234
    .line 235
    const v13, -0x40fd70a4    # -0.51f

    .line 236
    .line 237
    .line 238
    const v14, -0x409eb852    # -0.88f

    .line 239
    .line 240
    .line 241
    const v15, -0x4035c28f    # -1.58f

    .line 242
    .line 243
    .line 244
    const v16, -0x40628f5c    # -1.23f

    .line 245
    .line 246
    .line 247
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v17, -0x3f7a3d71    # -4.18f

    .line 251
    .line 252
    .line 253
    const v18, -0x3fe51eb8    # -2.42f

    .line 254
    .line 255
    .line 256
    const v13, -0x4071eb85    # -1.11f

    .line 257
    .line 258
    .line 259
    const v14, -0x406a3d71    # -1.17f

    .line 260
    .line 261
    .line 262
    const v15, -0x3fdc28f6    # -2.56f

    .line 263
    .line 264
    .line 265
    const v16, -0x3ffe147b    # -2.03f

    .line 266
    .line 267
    .line 268
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v17, 0x41400000    # 12.0f

    .line 272
    .line 273
    const/high16 v18, 0x40000000    # 2.0f

    .line 274
    .line 275
    const v13, 0x415d999a    # 13.85f

    .line 276
    .line 277
    .line 278
    const/high16 v14, 0x40300000    # 2.75f

    .line 279
    .line 280
    const v15, 0x415028f6    # 13.01f

    .line 281
    .line 282
    .line 283
    const/high16 v16, 0x40000000    # 2.0f

    .line 284
    .line 285
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v0, -0x40133333    # -1.85f

    .line 289
    .line 290
    .line 291
    const v2, -0x40028f5c    # -1.98f

    .line 292
    .line 293
    .line 294
    const v4, 0x3fdd70a4    # 1.73f

    .line 295
    .line 296
    .line 297
    const/high16 v6, 0x3f400000    # 0.75f

    .line 298
    .line 299
    invoke-virtual {v12, v0, v6, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v17, 0x40ba8f5c    # 5.83f

    .line 303
    .line 304
    .line 305
    const v18, 0x40c4cccd    # 6.15f

    .line 306
    .line 307
    .line 308
    const v13, 0x41063d71    # 8.39f

    .line 309
    .line 310
    .line 311
    const v14, 0x4083d70a    # 4.12f

    .line 312
    .line 313
    .line 314
    const v15, 0x40de6666    # 6.95f

    .line 315
    .line 316
    .line 317
    const v16, 0x409f5c29    # 4.98f

    .line 318
    .line 319
    .line 320
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v17, 0x4055c28f    # 3.34f

    .line 324
    .line 325
    .line 326
    const/high16 v18, 0x40e00000    # 7.0f

    .line 327
    .line 328
    const v13, 0x409d70a4    # 4.92f

    .line 329
    .line 330
    .line 331
    const v14, 0x40b8a3d7    # 5.77f

    .line 332
    .line 333
    .line 334
    const v15, 0x40766666    # 3.85f

    .line 335
    .line 336
    .line 337
    const v16, 0x40c3d70a    # 6.12f

    .line 338
    .line 339
    .line 340
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v17, 0x40766666    # 3.85f

    .line 344
    .line 345
    .line 346
    const v18, 0x411947ae    # 9.58f

    .line 347
    .line 348
    .line 349
    const v13, 0x40351eb8    # 2.83f

    .line 350
    .line 351
    .line 352
    const v14, 0x40fc28f6    # 7.88f

    .line 353
    .line 354
    .line 355
    const v15, 0x40447ae1    # 3.07f

    .line 356
    .line 357
    .line 358
    const v16, 0x410fae14    # 8.98f

    .line 359
    .line 360
    .line 361
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v17, 0x40600000    # 3.5f

    .line 365
    .line 366
    const/high16 v18, 0x41400000    # 12.0f

    .line 367
    .line 368
    const v13, 0x4067ae14    # 3.62f

    .line 369
    .line 370
    .line 371
    const v14, 0x4125999a    # 10.35f

    .line 372
    .line 373
    .line 374
    const/high16 v15, 0x40600000    # 3.5f

    .line 375
    .line 376
    const v16, 0x41328f5c    # 11.16f

    .line 377
    .line 378
    .line 379
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v0, 0x3eb33333    # 0.35f

    .line 383
    .line 384
    .line 385
    const v2, 0x401ae148    # 2.42f

    .line 386
    .line 387
    .line 388
    const v4, 0x3df5c28f    # 0.12f

    .line 389
    .line 390
    .line 391
    const v6, 0x3fd33333    # 1.65f

    .line 392
    .line 393
    .line 394
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v17, -0x40fd70a4    # -0.51f

    .line 398
    .line 399
    .line 400
    const v18, 0x40251eb8    # 2.58f

    .line 401
    .line 402
    .line 403
    const v13, -0x40b851ec    # -0.78f

    .line 404
    .line 405
    .line 406
    const v14, 0x3f19999a    # 0.6f

    .line 407
    .line 408
    .line 409
    const v15, -0x407d70a4    # -1.02f

    .line 410
    .line 411
    .line 412
    const v16, 0x3fd9999a    # 1.7f

    .line 413
    .line 414
    .line 415
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v17, 0x401f5c29    # 2.49f

    .line 419
    .line 420
    .line 421
    const v18, 0x3f59999a    # 0.85f

    .line 422
    .line 423
    .line 424
    const v13, 0x3f028f5c    # 0.51f

    .line 425
    .line 426
    .line 427
    const v14, 0x3f6147ae    # 0.88f

    .line 428
    .line 429
    .line 430
    const v15, 0x3fca3d71    # 1.58f

    .line 431
    .line 432
    .line 433
    const v16, 0x3f9d70a4    # 1.23f

    .line 434
    .line 435
    .line 436
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v17, 0x3fa66666    # 1.3f

    .line 440
    .line 441
    .line 442
    const v18, 0x3f8f5c29    # 1.12f

    .line 443
    .line 444
    .line 445
    const v13, 0x3ecccccd    # 0.4f

    .line 446
    .line 447
    .line 448
    const v14, 0x3ed70a3d    # 0.42f

    .line 449
    .line 450
    .line 451
    const v15, 0x3f547ae1    # 0.83f

    .line 452
    .line 453
    .line 454
    const v16, 0x3f4a3d71    # 0.79f

    .line 455
    .line 456
    .line 457
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v0, 0x40b8f5c3    # 5.78f

    .line 461
    .line 462
    .line 463
    const/high16 v2, 0x41b00000    # 22.0f

    .line 464
    .line 465
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const v0, 0x3ff0a3d7    # 1.88f

    .line 469
    .line 470
    .line 471
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v0, 0x3f7ae148    # 0.98f

    .line 475
    .line 476
    .line 477
    const v2, -0x3ff3d70a    # -2.19f

    .line 478
    .line 479
    .line 480
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v17, 0x3fb0a3d7    # 1.38f

    .line 484
    .line 485
    .line 486
    const v18, 0x3eeb851f    # 0.46f

    .line 487
    .line 488
    .line 489
    const v13, 0x3ee147ae    # 0.44f

    .line 490
    .line 491
    .line 492
    const v14, 0x3e428f5c    # 0.19f

    .line 493
    .line 494
    .line 495
    const v15, 0x3f666666    # 0.9f

    .line 496
    .line 497
    .line 498
    const v16, 0x3eae147b    # 0.34f

    .line 499
    .line 500
    .line 501
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const/high16 v17, 0x41400000    # 12.0f

    .line 505
    .line 506
    const/high16 v18, 0x41b00000    # 22.0f

    .line 507
    .line 508
    const v13, 0x41226666    # 10.15f

    .line 509
    .line 510
    .line 511
    const/high16 v14, 0x41aa0000    # 21.25f

    .line 512
    .line 513
    const v15, 0x412fd70a    # 10.99f

    .line 514
    .line 515
    .line 516
    const/high16 v16, 0x41b00000    # 22.0f

    .line 517
    .line 518
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v0, 0x3ffd70a4    # 1.98f

    .line 522
    .line 523
    .line 524
    const v2, -0x40228f5c    # -1.73f

    .line 525
    .line 526
    .line 527
    const v4, 0x3feccccd    # 1.85f

    .line 528
    .line 529
    .line 530
    const/high16 v6, -0x40c00000    # -0.75f

    .line 531
    .line 532
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const v17, 0x3fab851f    # 1.34f

    .line 536
    .line 537
    .line 538
    const v18, -0x411eb852    # -0.44f

    .line 539
    .line 540
    .line 541
    const v13, 0x3eeb851f    # 0.46f

    .line 542
    .line 543
    .line 544
    const v14, -0x421eb852    # -0.11f

    .line 545
    .line 546
    .line 547
    const v15, 0x3f68f5c3    # 0.91f

    .line 548
    .line 549
    .line 550
    const v16, -0x417ae148    # -0.26f

    .line 551
    .line 552
    .line 553
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const v0, 0x41826666    # 16.3f

    .line 557
    .line 558
    .line 559
    const/high16 v2, 0x41b00000    # 22.0f

    .line 560
    .line 561
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const v0, 0x3ff0a3d7    # 1.88f

    .line 565
    .line 566
    .line 567
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const v0, -0x40547ae1    # -1.34f

    .line 571
    .line 572
    .line 573
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 574
    .line 575
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const v18, -0x406ccccd    # -1.15f

    .line 579
    .line 580
    .line 581
    const v13, 0x3ef5c28f    # 0.48f

    .line 582
    .line 583
    .line 584
    const v14, -0x4151eb85    # -0.34f

    .line 585
    .line 586
    .line 587
    const v15, 0x3f6e147b    # 0.93f

    .line 588
    .line 589
    .line 590
    const v16, -0x40c7ae14    # -0.72f

    .line 591
    .line 592
    .line 593
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const v17, 0x401f5c29    # 2.49f

    .line 597
    .line 598
    .line 599
    const v18, -0x40a66666    # -0.85f

    .line 600
    .line 601
    .line 602
    const v13, 0x3f68f5c3    # 0.91f

    .line 603
    .line 604
    .line 605
    const v14, 0x3ec28f5c    # 0.38f

    .line 606
    .line 607
    .line 608
    const v15, 0x3ffeb852    # 1.99f

    .line 609
    .line 610
    .line 611
    const v16, 0x3cf5c28f    # 0.03f

    .line 612
    .line 613
    .line 614
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const v0, 0x41a770a4    # 20.93f

    .line 618
    .line 619
    .line 620
    const v2, 0x417051ec    # 15.02f

    .line 621
    .line 622
    .line 623
    const v4, 0x4166b852    # 14.42f

    .line 624
    .line 625
    .line 626
    const v6, 0x41a13333    # 20.15f

    .line 627
    .line 628
    .line 629
    invoke-virtual {v12, v0, v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const v0, 0x4158f5c3    # 13.56f

    .line 636
    .line 637
    .line 638
    const/high16 v2, 0x41960000    # 18.75f

    .line 639
    .line 640
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const/high16 v17, 0x41400000    # 12.0f

    .line 644
    .line 645
    const/high16 v18, 0x41900000    # 18.0f

    .line 646
    .line 647
    const v13, 0x41530a3d    # 13.19f

    .line 648
    .line 649
    .line 650
    const v14, 0x419251ec    # 18.29f

    .line 651
    .line 652
    .line 653
    const v15, 0x414a147b    # 12.63f

    .line 654
    .line 655
    .line 656
    const/high16 v16, 0x41900000    # 18.0f

    .line 657
    .line 658
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const v0, 0x3e947ae1    # 0.29f

    .line 662
    .line 663
    .line 664
    const v2, -0x40370a3d    # -1.57f

    .line 665
    .line 666
    .line 667
    const/high16 v4, 0x3f400000    # 0.75f

    .line 668
    .line 669
    const v6, -0x40666666    # -1.2f

    .line 670
    .line 671
    .line 672
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    const v17, -0x406b851f    # -1.16f

    .line 676
    .line 677
    .line 678
    const v18, -0x41428f5c    # -0.37f

    .line 679
    .line 680
    .line 681
    const v13, -0x41333333    # -0.4f

    .line 682
    .line 683
    .line 684
    const v14, -0x4247ae14    # -0.09f

    .line 685
    .line 686
    .line 687
    const v15, -0x40b5c28f    # -0.79f

    .line 688
    .line 689
    .line 690
    const v16, -0x41a8f5c3    # -0.21f

    .line 691
    .line 692
    .line 693
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 694
    .line 695
    .line 696
    const v0, 0x3fb70a3d    # 1.43f

    .line 697
    .line 698
    .line 699
    const v2, -0x3fb3d70a    # -3.19f

    .line 700
    .line 701
    .line 702
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 703
    .line 704
    .line 705
    const v17, 0x3fa66666    # 1.3f

    .line 706
    .line 707
    .line 708
    const/high16 v18, 0x3e800000    # 0.25f

    .line 709
    .line 710
    const v13, 0x3ecccccd    # 0.4f

    .line 711
    .line 712
    .line 713
    const v14, 0x3e23d70a    # 0.16f

    .line 714
    .line 715
    .line 716
    const v15, 0x3f570a3d    # 0.84f

    .line 717
    .line 718
    .line 719
    const/high16 v16, 0x3e800000    # 0.25f

    .line 720
    .line 721
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 722
    .line 723
    .line 724
    const v17, 0x3fa147ae    # 1.26f

    .line 725
    .line 726
    .line 727
    const v18, -0x41947ae1    # -0.23f

    .line 728
    .line 729
    .line 730
    const v13, 0x3ee147ae    # 0.44f

    .line 731
    .line 732
    .line 733
    const/4 v14, 0x0

    .line 734
    const v15, 0x3f5eb852    # 0.87f

    .line 735
    .line 736
    .line 737
    const v16, -0x425c28f6    # -0.08f

    .line 738
    .line 739
    .line 740
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 741
    .line 742
    .line 743
    const v0, 0x3fb5c28f    # 1.42f

    .line 744
    .line 745
    .line 746
    const v2, 0x404b851f    # 3.18f

    .line 747
    .line 748
    .line 749
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    const v17, 0x4158f5c3    # 13.56f

    .line 753
    .line 754
    .line 755
    const/high16 v18, 0x41960000    # 18.75f

    .line 756
    .line 757
    const v13, 0x41651eb8    # 14.32f

    .line 758
    .line 759
    .line 760
    const v14, 0x419451ec    # 18.54f

    .line 761
    .line 762
    .line 763
    const v15, 0x415f3333    # 13.95f

    .line 764
    .line 765
    .line 766
    const v16, 0x419547ae    # 18.66f

    .line 767
    .line 768
    .line 769
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 770
    .line 771
    .line 772
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 773
    .line 774
    .line 775
    const v0, 0x4127ae14    # 10.48f

    .line 776
    .line 777
    .line 778
    const v2, 0x414051ec    # 12.02f

    .line 779
    .line 780
    .line 781
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 782
    .line 783
    .line 784
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 785
    .line 786
    const/high16 v18, -0x40400000    # -1.5f

    .line 787
    .line 788
    const/4 v13, 0x0

    .line 789
    const v14, -0x40ab851f    # -0.83f

    .line 790
    .line 791
    .line 792
    const v15, 0x3f2b851f    # 0.67f

    .line 793
    .line 794
    .line 795
    const/high16 v16, -0x40400000    # -1.5f

    .line 796
    .line 797
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 798
    .line 799
    .line 800
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 801
    .line 802
    const v13, 0x3f547ae1    # 0.83f

    .line 803
    .line 804
    .line 805
    const/4 v14, 0x0

    .line 806
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 807
    .line 808
    const v16, 0x3f2b851f    # 0.67f

    .line 809
    .line 810
    .line 811
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 812
    .line 813
    .line 814
    const v0, -0x40d47ae1    # -0.67f

    .line 815
    .line 816
    .line 817
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 818
    .line 819
    const/high16 v4, -0x40400000    # -1.5f

    .line 820
    .line 821
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 822
    .line 823
    .line 824
    const v17, 0x4127ae14    # 10.48f

    .line 825
    .line 826
    .line 827
    const v18, 0x414051ec    # 12.02f

    .line 828
    .line 829
    .line 830
    const v13, 0x41326666    # 11.15f

    .line 831
    .line 832
    .line 833
    const v14, 0x415851ec    # 13.52f

    .line 834
    .line 835
    .line 836
    const v15, 0x4127ae14    # 10.48f

    .line 837
    .line 838
    .line 839
    const v16, 0x414d999a    # 12.85f

    .line 840
    .line 841
    .line 842
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 843
    .line 844
    .line 845
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 846
    .line 847
    .line 848
    const v0, 0x4195ae14    # 18.71f

    .line 849
    .line 850
    .line 851
    const v2, 0x416028f6    # 14.01f

    .line 852
    .line 853
    .line 854
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 855
    .line 856
    .line 857
    const v17, -0x403d70a4    # -1.52f

    .line 858
    .line 859
    .line 860
    const v18, 0x3f7d70a4    # 0.99f

    .line 861
    .line 862
    .line 863
    const v13, -0x40e3d70a    # -0.61f

    .line 864
    .line 865
    .line 866
    const v14, 0x3d8f5c29    # 0.07f

    .line 867
    .line 868
    .line 869
    const v15, -0x4068f5c3    # -1.18f

    .line 870
    .line 871
    .line 872
    const v16, 0x3ed1eb85    # 0.41f

    .line 873
    .line 874
    .line 875
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 876
    .line 877
    .line 878
    const v17, -0x420a3d71    # -0.12f

    .line 879
    .line 880
    .line 881
    const/high16 v18, 0x3fe00000    # 1.75f

    .line 882
    .line 883
    const v13, -0x415c28f6    # -0.32f

    .line 884
    .line 885
    .line 886
    const v14, 0x3f0f5c29    # 0.56f

    .line 887
    .line 888
    .line 889
    const v15, -0x4151eb85    # -0.34f

    .line 890
    .line 891
    .line 892
    const v16, 0x3f99999a    # 1.2f

    .line 893
    .line 894
    .line 895
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 896
    .line 897
    .line 898
    const v17, -0x4099999a    # -0.9f

    .line 899
    .line 900
    .line 901
    const v18, 0x3f4a3d71    # 0.79f

    .line 902
    .line 903
    .line 904
    const v13, -0x4170a3d7    # -0.28f

    .line 905
    .line 906
    .line 907
    const v14, 0x3e947ae1    # 0.29f

    .line 908
    .line 909
    .line 910
    const v15, -0x40eb851f    # -0.58f

    .line 911
    .line 912
    .line 913
    const v16, 0x3f0ccccd    # 0.55f

    .line 914
    .line 915
    .line 916
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 917
    .line 918
    .line 919
    const v0, -0x3fa9999a    # -3.35f

    .line 920
    .line 921
    .line 922
    const/high16 v2, -0x40400000    # -1.5f

    .line 923
    .line 924
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 925
    .line 926
    .line 927
    const v17, 0x3f47ae14    # 0.78f

    .line 928
    .line 929
    .line 930
    const v18, -0x3ff5c28f    # -2.16f

    .line 931
    .line 932
    .line 933
    const v13, 0x3efae148    # 0.49f

    .line 934
    .line 935
    .line 936
    const v14, -0x40e8f5c3    # -0.59f

    .line 937
    .line 938
    .line 939
    const v15, 0x3f47ae14    # 0.78f

    .line 940
    .line 941
    .line 942
    const v16, -0x40547ae1    # -1.34f

    .line 943
    .line 944
    .line 945
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 946
    .line 947
    .line 948
    const v17, -0x3fa28f5c    # -3.46f

    .line 949
    .line 950
    .line 951
    const v18, -0x3fa5c28f    # -3.41f

    .line 952
    .line 953
    .line 954
    const/4 v13, 0x0

    .line 955
    const v14, -0x400e147b    # -1.89f

    .line 956
    .line 957
    .line 958
    const v15, -0x4039999a    # -1.55f

    .line 959
    .line 960
    .line 961
    const v16, -0x3fa5c28f    # -3.41f

    .line 962
    .line 963
    .line 964
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 965
    .line 966
    .line 967
    const v18, 0x405a3d71    # 3.41f

    .line 968
    .line 969
    .line 970
    const v13, -0x400b851f    # -1.91f

    .line 971
    .line 972
    .line 973
    const/4 v14, 0x0

    .line 974
    const v15, -0x3fa28f5c    # -3.46f

    .line 975
    .line 976
    .line 977
    const v16, 0x3fc3d70a    # 1.53f

    .line 978
    .line 979
    .line 980
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 981
    .line 982
    .line 983
    const/high16 v17, 0x3f400000    # 0.75f

    .line 984
    .line 985
    const v18, 0x400851ec    # 2.13f

    .line 986
    .line 987
    .line 988
    const/4 v13, 0x0

    .line 989
    const v14, 0x3f4ccccd    # 0.8f

    .line 990
    .line 991
    .line 992
    const v15, 0x3e8f5c29    # 0.28f

    .line 993
    .line 994
    .line 995
    const v16, 0x3fc51eb8    # 1.54f

    .line 996
    .line 997
    .line 998
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 999
    .line 1000
    .line 1001
    const v0, -0x403d70a4    # -1.52f

    .line 1002
    .line 1003
    .line 1004
    const v2, 0x4058f5c3    # 3.39f

    .line 1005
    .line 1006
    .line 1007
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1008
    .line 1009
    .line 1010
    const v17, -0x40a147ae    # -0.87f

    .line 1011
    .line 1012
    .line 1013
    const v18, -0x40bd70a4    # -0.76f

    .line 1014
    .line 1015
    .line 1016
    const v13, -0x416147ae    # -0.31f

    .line 1017
    .line 1018
    .line 1019
    const v14, -0x41947ae1    # -0.23f

    .line 1020
    .line 1021
    .line 1022
    const v15, -0x40e66666    # -0.6f

    .line 1023
    .line 1024
    .line 1025
    const v16, -0x410a3d71    # -0.48f

    .line 1026
    .line 1027
    .line 1028
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1029
    .line 1030
    .line 1031
    const v17, 0x40d9999a    # 6.8f

    .line 1032
    .line 1033
    .line 1034
    const/high16 v18, 0x41700000    # 15.0f

    .line 1035
    .line 1036
    const v13, 0x40e4cccd    # 7.15f

    .line 1037
    .line 1038
    .line 1039
    const v14, 0x4181d70a    # 16.23f

    .line 1040
    .line 1041
    .line 1042
    const v15, 0x40e428f6    # 7.13f

    .line 1043
    .line 1044
    .line 1045
    const v16, 0x41791eb8    # 15.57f

    .line 1046
    .line 1047
    .line 1048
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1049
    .line 1050
    .line 1051
    const v17, -0x403851ec    # -1.56f

    .line 1052
    .line 1053
    .line 1054
    const v18, -0x40828f5c    # -0.99f

    .line 1055
    .line 1056
    .line 1057
    const v13, -0x4151eb85    # -0.34f

    .line 1058
    .line 1059
    .line 1060
    const v14, -0x40e8f5c3    # -0.59f

    .line 1061
    .line 1062
    .line 1063
    const v15, -0x4091eb85    # -0.93f

    .line 1064
    .line 1065
    .line 1066
    const v16, -0x408f5c29    # -0.94f

    .line 1067
    .line 1068
    .line 1069
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1070
    .line 1071
    .line 1072
    const v17, -0x41570a3d    # -0.33f

    .line 1073
    .line 1074
    .line 1075
    const v18, -0x3ff66666    # -2.15f

    .line 1076
    .line 1077
    .line 1078
    const v13, -0x419eb852    # -0.22f

    .line 1079
    .line 1080
    .line 1081
    const v14, -0x40d1eb85    # -0.68f

    .line 1082
    .line 1083
    .line 1084
    const v15, -0x41570a3d    # -0.33f

    .line 1085
    .line 1086
    .line 1087
    const v16, -0x404ccccd    # -1.4f

    .line 1088
    .line 1089
    .line 1090
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1091
    .line 1092
    .line 1093
    const/high16 v17, 0x3e800000    # 0.25f

    .line 1094
    .line 1095
    const v18, -0x40133333    # -1.85f

    .line 1096
    .line 1097
    .line 1098
    const/4 v13, 0x0

    .line 1099
    const v14, -0x40dc28f6    # -0.64f

    .line 1100
    .line 1101
    .line 1102
    const v15, 0x3db851ec    # 0.09f

    .line 1103
    .line 1104
    .line 1105
    const v16, -0x405eb852    # -1.26f

    .line 1106
    .line 1107
    .line 1108
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1109
    .line 1110
    .line 1111
    const v17, 0x3fd33333    # 1.65f

    .line 1112
    .line 1113
    .line 1114
    const/high16 v18, -0x40800000    # -1.0f

    .line 1115
    .line 1116
    const v13, 0x3f28f5c3    # 0.66f

    .line 1117
    .line 1118
    .line 1119
    const v14, -0x430a3d71    # -0.03f

    .line 1120
    .line 1121
    .line 1122
    const v15, 0x3fa66666    # 1.3f

    .line 1123
    .line 1124
    .line 1125
    const v16, -0x413d70a4    # -0.38f

    .line 1126
    .line 1127
    .line 1128
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1129
    .line 1130
    .line 1131
    const v17, 0x3c23d70a    # 0.01f

    .line 1132
    .line 1133
    .line 1134
    const v18, -0x40028f5c    # -1.98f

    .line 1135
    .line 1136
    .line 1137
    const v13, 0x3ebd70a4    # 0.37f

    .line 1138
    .line 1139
    .line 1140
    const v14, -0x40deb852    # -0.63f

    .line 1141
    .line 1142
    .line 1143
    const v15, 0x3eb33333    # 0.35f

    .line 1144
    .line 1145
    .line 1146
    const v16, -0x404f5c29    # -1.38f

    .line 1147
    .line 1148
    .line 1149
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1150
    .line 1151
    .line 1152
    const v17, 0x412451ec    # 10.27f

    .line 1153
    .line 1154
    .line 1155
    const/high16 v18, 0x40a00000    # 5.0f

    .line 1156
    .line 1157
    const v13, 0x40f7ae14    # 7.74f

    .line 1158
    .line 1159
    .line 1160
    const v14, 0x40c1999a    # 6.05f

    .line 1161
    .line 1162
    .line 1163
    const v15, 0x410ee148    # 8.93f

    .line 1164
    .line 1165
    .line 1166
    const v16, 0x40aae148    # 5.34f

    .line 1167
    .line 1168
    .line 1169
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1170
    .line 1171
    .line 1172
    const v17, 0x3fdd70a4    # 1.73f

    .line 1173
    .line 1174
    .line 1175
    const/high16 v18, 0x3f800000    # 1.0f

    .line 1176
    .line 1177
    const v13, 0x3eae147b    # 0.34f

    .line 1178
    .line 1179
    .line 1180
    const v14, 0x3f170a3d    # 0.59f

    .line 1181
    .line 1182
    .line 1183
    const v15, 0x3f7d70a4    # 0.99f

    .line 1184
    .line 1185
    .line 1186
    const/high16 v16, 0x3f800000    # 1.0f

    .line 1187
    .line 1188
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1189
    .line 1190
    .line 1191
    const v0, -0x41333333    # -0.4f

    .line 1192
    .line 1193
    .line 1194
    const/high16 v2, -0x40800000    # -1.0f

    .line 1195
    .line 1196
    const v4, 0x3fdd70a4    # 1.73f

    .line 1197
    .line 1198
    .line 1199
    const v6, 0x3fb1eb85    # 1.39f

    .line 1200
    .line 1201
    .line 1202
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1203
    .line 1204
    .line 1205
    const v17, 0x405c28f6    # 3.44f

    .line 1206
    .line 1207
    .line 1208
    const v18, 0x40033333    # 2.05f

    .line 1209
    .line 1210
    .line 1211
    const v13, 0x3fab851f    # 1.34f

    .line 1212
    .line 1213
    .line 1214
    const v14, 0x3eae147b    # 0.34f

    .line 1215
    .line 1216
    .line 1217
    const v15, 0x4021eb85    # 2.53f

    .line 1218
    .line 1219
    .line 1220
    const v16, 0x3f88f5c3    # 1.07f

    .line 1221
    .line 1222
    .line 1223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1224
    .line 1225
    .line 1226
    const v17, 0x4189999a    # 17.2f

    .line 1227
    .line 1228
    .line 1229
    const/high16 v18, 0x41100000    # 9.0f

    .line 1230
    .line 1231
    const v13, 0x4186cccd    # 16.85f

    .line 1232
    .line 1233
    .line 1234
    const v14, 0x40f47ae1    # 7.64f

    .line 1235
    .line 1236
    .line 1237
    const v15, 0x4186b852    # 16.84f

    .line 1238
    .line 1239
    .line 1240
    const v16, 0x4106147b    # 8.38f

    .line 1241
    .line 1242
    .line 1243
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1244
    .line 1245
    .line 1246
    const v17, 0x3fcccccd    # 1.6f

    .line 1247
    .line 1248
    .line 1249
    const/high16 v18, 0x3f800000    # 1.0f

    .line 1250
    .line 1251
    const v13, 0x3eb33333    # 0.35f

    .line 1252
    .line 1253
    .line 1254
    const v14, 0x3f19999a    # 0.6f

    .line 1255
    .line 1256
    .line 1257
    const v15, 0x3f75c28f    # 0.96f

    .line 1258
    .line 1259
    .line 1260
    const v16, 0x3f733333    # 0.95f

    .line 1261
    .line 1262
    .line 1263
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1264
    .line 1265
    .line 1266
    const/high16 v17, 0x3e800000    # 0.25f

    .line 1267
    .line 1268
    const v18, 0x3fee147b    # 1.86f

    .line 1269
    .line 1270
    .line 1271
    const v13, 0x3e23d70a    # 0.16f

    .line 1272
    .line 1273
    .line 1274
    const v14, 0x3f170a3d    # 0.59f

    .line 1275
    .line 1276
    .line 1277
    const/high16 v15, 0x3e800000    # 0.25f

    .line 1278
    .line 1279
    const v16, 0x3f9ae148    # 1.21f

    .line 1280
    .line 1281
    .line 1282
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1283
    .line 1284
    .line 1285
    const v17, 0x4195ae14    # 18.71f

    .line 1286
    .line 1287
    .line 1288
    const v18, 0x416028f6    # 14.01f

    .line 1289
    .line 1290
    .line 1291
    const v13, 0x41986666    # 19.05f

    .line 1292
    .line 1293
    .line 1294
    const v14, 0x4149c28f    # 12.61f

    .line 1295
    .line 1296
    .line 1297
    const v15, 0x419770a4    # 18.93f

    .line 1298
    .line 1299
    .line 1300
    const v16, 0x415547ae    # 13.33f

    .line 1301
    .line 1302
    .line 1303
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1304
    .line 1305
    .line 1306
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1307
    .line 1308
    .line 1309
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1310
    .line 1311
    .line 1312
    move-result-object v2

    .line 1313
    const/16 v16, 0x3800

    .line 1314
    .line 1315
    const/16 v17, 0x0

    .line 1316
    .line 1317
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1318
    .line 1319
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1320
    .line 1321
    const/4 v7, 0x0

    .line 1322
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1323
    .line 1324
    const/4 v13, 0x0

    .line 1325
    const/4 v14, 0x0

    .line 1326
    const/4 v15, 0x0

    .line 1327
    const-string v4, ""

    .line 1328
    .line 1329
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1330
    .line 1331
    .line 1332
    move-result-object v0

    .line 1333
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1334
    .line 1335
    .line 1336
    move-result-object v0

    .line 1337
    sput-object v0, Landroidx/compose/material/icons/twotone/AttractionsKt;->_attractions:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1338
    .line 1339
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1340
    .line 1341
    .line 1342
    return-object v0
.end method
