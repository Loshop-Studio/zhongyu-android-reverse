.class public final Landroidx/compose/material/icons/twotone/AirlineSeatFlatKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_airlineSeatFlat",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "AirlineSeatFlat",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getAirlineSeatFlat",
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
        "SMAP\nAirlineSeatFlat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AirlineSeatFlat.kt\nandroidx/compose/material/icons/twotone/AirlineSeatFlatKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,91:1\n212#2,12:92\n233#2,18:105\n253#2:142\n233#2,18:143\n253#2:180\n174#3:104\n705#4,2:123\n717#4,2:125\n719#4,11:131\n705#4,2:161\n717#4,2:163\n719#4,11:169\n72#5,4:127\n72#5,4:165\n*S KotlinDebug\n*F\n+ 1 AirlineSeatFlat.kt\nandroidx/compose/material/icons/twotone/AirlineSeatFlatKt\n*L\n29#1:92,12\n30#1:105,18\n30#1:142\n46#1:143,18\n46#1:180\n29#1:104\n30#1:123,2\n30#1:125,2\n30#1:131,11\n46#1:161,2\n46#1:163,2\n46#1:169,11\n30#1:127,4\n46#1:165,4\n*E\n"
    }
.end annotation


# static fields
.field private static _airlineSeatFlat:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAirlineSeatFlat(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/AirlineSeatFlatKt;->_airlineSeatFlat:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.AirlineSeatFlat"

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
    const/high16 v4, 0x40a00000    # 5.0f

    .line 71
    .line 72
    const/high16 v6, 0x41300000    # 11.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v25, 0x3f35c28f    # 0.71f

    .line 78
    .line 79
    .line 80
    const v26, -0x41666666    # -0.3f

    .line 81
    .line 82
    .line 83
    const v21, 0x3e8a3d71    # 0.27f

    .line 84
    .line 85
    .line 86
    const/16 v22, 0x0

    .line 87
    .line 88
    const v23, 0x3f051eb8    # 0.52f

    .line 89
    .line 90
    .line 91
    const v24, -0x421eb852    # -0.11f

    .line 92
    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v25, -0x43dc28f6    # -0.01f

    .line 100
    .line 101
    .line 102
    const v26, -0x404b851f    # -1.41f

    .line 103
    .line 104
    .line 105
    const v21, 0x3ec7ae14    # 0.39f

    .line 106
    .line 107
    .line 108
    const v22, -0x41333333    # -0.4f

    .line 109
    .line 110
    .line 111
    const v23, 0x3ec7ae14    # 0.39f

    .line 112
    .line 113
    .line 114
    const v24, -0x407d70a4    # -1.02f

    .line 115
    .line 116
    .line 117
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v25, 0x40a00000    # 5.0f

    .line 121
    .line 122
    const/high16 v26, 0x41100000    # 9.0f

    .line 123
    .line 124
    const v21, 0x40b051ec    # 5.51f

    .line 125
    .line 126
    .line 127
    const v22, 0x4111c28f    # 9.11f

    .line 128
    .line 129
    .line 130
    const v23, 0x40a851ec    # 5.26f

    .line 131
    .line 132
    .line 133
    const/high16 v24, 0x41100000    # 9.0f

    .line 134
    .line 135
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v25, -0x40ca3d71    # -0.71f

    .line 139
    .line 140
    .line 141
    const v26, 0x3e99999a    # 0.3f

    .line 142
    .line 143
    .line 144
    const v21, -0x4175c28f    # -0.27f

    .line 145
    .line 146
    .line 147
    const/16 v22, 0x0

    .line 148
    .line 149
    const v23, -0x40fae148    # -0.52f

    .line 150
    .line 151
    .line 152
    const v24, 0x3de147ae    # 0.11f

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v25, 0x3c23d70a    # 0.01f

    .line 159
    .line 160
    .line 161
    const v26, 0x3fb47ae1    # 1.41f

    .line 162
    .line 163
    .line 164
    const v21, -0x413851ec    # -0.39f

    .line 165
    .line 166
    .line 167
    const v22, 0x3ecccccd    # 0.4f

    .line 168
    .line 169
    .line 170
    const v23, -0x413851ec    # -0.39f

    .line 171
    .line 172
    .line 173
    const v24, 0x3f828f5c    # 1.02f

    .line 174
    .line 175
    .line 176
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v25, 0x3f333333    # 0.7f

    .line 180
    .line 181
    .line 182
    const v26, 0x3e947ae1    # 0.29f

    .line 183
    .line 184
    .line 185
    const v21, 0x3e428f5c    # 0.19f

    .line 186
    .line 187
    .line 188
    const v22, 0x3e3851ec    # 0.18f

    .line 189
    .line 190
    .line 191
    const v23, 0x3ee147ae    # 0.44f

    .line 192
    .line 193
    .line 194
    const v24, 0x3e947ae1    # 0.29f

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/high16 v4, 0x41900000    # 18.0f

    .line 204
    .line 205
    const/high16 v6, 0x41100000    # 9.0f

    .line 206
    .line 207
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v4, -0x3f200000    # -7.0f

    .line 211
    .line 212
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v4, 0x40000000    # 2.0f

    .line 216
    .line 217
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v4, 0x41100000    # 9.0f

    .line 221
    .line 222
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v25, -0x40000000    # -2.0f

    .line 226
    .line 227
    const/high16 v26, -0x40000000    # -2.0f

    .line 228
    .line 229
    const/16 v21, 0x0

    .line 230
    .line 231
    const v22, -0x40733333    # -1.1f

    .line 232
    .line 233
    .line 234
    const v23, -0x4099999a    # -0.9f

    .line 235
    .line 236
    .line 237
    const/high16 v24, -0x40000000    # -2.0f

    .line 238
    .line 239
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    const/16 v16, 0x3800

    .line 250
    .line 251
    const/16 v17, 0x0

    .line 252
    .line 253
    const v6, 0x3e99999a    # 0.3f

    .line 254
    .line 255
    .line 256
    const v8, 0x3e99999a    # 0.3f

    .line 257
    .line 258
    .line 259
    const/4 v7, 0x0

    .line 260
    const/high16 v9, 0x3f800000    # 1.0f

    .line 261
    .line 262
    const/high16 v12, 0x3f800000    # 1.0f

    .line 263
    .line 264
    const/4 v13, 0x0

    .line 265
    const/4 v14, 0x0

    .line 266
    const/4 v15, 0x0

    .line 267
    const-string v4, ""

    .line 268
    .line 269
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 270
    .line 271
    .line 272
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 273
    .line 274
    .line 275
    move-result v3

    .line 276
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 277
    .line 278
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 279
    .line 280
    .line 281
    move-result-wide v6

    .line 282
    const/4 v0, 0x0

    .line 283
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 287
    .line 288
    .line 289
    move-result v10

    .line 290
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 291
    .line 292
    .line 293
    move-result v11

    .line 294
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 297
    .line 298
    .line 299
    const/high16 v0, 0x41500000    # 13.0f

    .line 300
    .line 301
    const/high16 v2, 0x40a00000    # 5.0f

    .line 302
    .line 303
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v17, 0x4008f5c3    # 2.14f

    .line 307
    .line 308
    .line 309
    const v18, -0x4099999a    # -0.9f

    .line 310
    .line 311
    .line 312
    const v13, 0x3f47ae14    # 0.78f

    .line 313
    .line 314
    .line 315
    const v15, 0x3fc66666    # 1.55f

    .line 316
    .line 317
    .line 318
    const v16, -0x41666666    # -0.3f

    .line 319
    .line 320
    .line 321
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v17, -0x42dc28f6    # -0.04f

    .line 325
    .line 326
    .line 327
    const v18, -0x3f7851ec    # -4.24f

    .line 328
    .line 329
    .line 330
    const v13, 0x3f947ae1    # 1.16f

    .line 331
    .line 332
    .line 333
    const v14, -0x4067ae14    # -1.19f

    .line 334
    .line 335
    .line 336
    const v15, 0x3f91eb85    # 1.14f

    .line 337
    .line 338
    .line 339
    const v16, -0x3fbae148    # -3.08f

    .line 340
    .line 341
    .line 342
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v17, 0x40a00000    # 5.0f

    .line 346
    .line 347
    const/high16 v18, 0x40e00000    # 7.0f

    .line 348
    .line 349
    const v13, 0x40d051ec    # 6.51f

    .line 350
    .line 351
    .line 352
    const v14, 0x40e947ae    # 7.29f

    .line 353
    .line 354
    .line 355
    const/high16 v15, 0x40b80000    # 5.75f

    .line 356
    .line 357
    const/high16 v16, 0x40e00000    # 7.0f

    .line 358
    .line 359
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v17, -0x3ff70a3d    # -2.14f

    .line 363
    .line 364
    .line 365
    const v18, 0x3f666666    # 0.9f

    .line 366
    .line 367
    .line 368
    const v13, -0x40b851ec    # -0.78f

    .line 369
    .line 370
    .line 371
    const/4 v14, 0x0

    .line 372
    const v15, -0x4039999a    # -1.55f

    .line 373
    .line 374
    .line 375
    const v16, 0x3e99999a    # 0.3f

    .line 376
    .line 377
    .line 378
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v17, 0x3d23d70a    # 0.04f

    .line 382
    .line 383
    .line 384
    const v18, 0x4087ae14    # 4.24f

    .line 385
    .line 386
    .line 387
    const v13, -0x406b851f    # -1.16f

    .line 388
    .line 389
    .line 390
    const v14, 0x3f9851ec    # 1.19f

    .line 391
    .line 392
    .line 393
    const v15, -0x406e147b    # -1.14f

    .line 394
    .line 395
    .line 396
    const v16, 0x40451eb8    # 3.08f

    .line 397
    .line 398
    .line 399
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v17, 0x40066666    # 2.1f

    .line 403
    .line 404
    .line 405
    const v18, 0x3f5c28f6    # 0.86f

    .line 406
    .line 407
    .line 408
    const v13, 0x3f170a3d    # 0.59f

    .line 409
    .line 410
    .line 411
    const v14, 0x3f11eb85    # 0.57f

    .line 412
    .line 413
    .line 414
    const v15, 0x3faccccd    # 1.35f

    .line 415
    .line 416
    .line 417
    const v16, 0x3f5c28f6    # 0.86f

    .line 418
    .line 419
    .line 420
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const v0, 0x408947ae    # 4.29f

    .line 427
    .line 428
    .line 429
    const v2, 0x4114cccd    # 9.3f

    .line 430
    .line 431
    .line 432
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v17, 0x3f35c28f    # 0.71f

    .line 436
    .line 437
    .line 438
    const v18, -0x41666666    # -0.3f

    .line 439
    .line 440
    .line 441
    const v13, 0x3e428f5c    # 0.19f

    .line 442
    .line 443
    .line 444
    const v14, -0x41bd70a4    # -0.19f

    .line 445
    .line 446
    .line 447
    const v15, 0x3ee147ae    # 0.44f

    .line 448
    .line 449
    .line 450
    const v16, -0x41666666    # -0.3f

    .line 451
    .line 452
    .line 453
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const v17, 0x3f333333    # 0.7f

    .line 457
    .line 458
    .line 459
    const v18, 0x3e8f5c29    # 0.28f

    .line 460
    .line 461
    .line 462
    const v13, 0x3e851eb8    # 0.26f

    .line 463
    .line 464
    .line 465
    const/4 v14, 0x0

    .line 466
    const v15, 0x3f028f5c    # 0.51f

    .line 467
    .line 468
    .line 469
    const v16, 0x3dcccccd    # 0.1f

    .line 470
    .line 471
    .line 472
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const v17, 0x3ca3d70a    # 0.02f

    .line 476
    .line 477
    .line 478
    const v18, 0x3fb47ae1    # 1.41f

    .line 479
    .line 480
    .line 481
    const v13, 0x3ecccccd    # 0.4f

    .line 482
    .line 483
    .line 484
    const v14, 0x3ec7ae14    # 0.39f

    .line 485
    .line 486
    .line 487
    const v15, 0x3ecccccd    # 0.4f

    .line 488
    .line 489
    .line 490
    const v16, 0x3f8147ae    # 1.01f

    .line 491
    .line 492
    .line 493
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const v17, -0x40c7ae14    # -0.72f

    .line 497
    .line 498
    .line 499
    const v18, 0x3e9eb852    # 0.31f

    .line 500
    .line 501
    .line 502
    const v13, -0x41b33333    # -0.2f

    .line 503
    .line 504
    .line 505
    const v14, 0x3e4ccccd    # 0.2f

    .line 506
    .line 507
    .line 508
    const v15, -0x4119999a    # -0.45f

    .line 509
    .line 510
    .line 511
    const v16, 0x3e9eb852    # 0.31f

    .line 512
    .line 513
    .line 514
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v17, -0x40cccccd    # -0.7f

    .line 518
    .line 519
    .line 520
    const v18, -0x4170a3d7    # -0.28f

    .line 521
    .line 522
    .line 523
    const v13, -0x417ae148    # -0.26f

    .line 524
    .line 525
    .line 526
    const/4 v14, 0x0

    .line 527
    const v15, -0x40fd70a4    # -0.51f

    .line 528
    .line 529
    .line 530
    const v16, -0x42333333    # -0.1f

    .line 531
    .line 532
    .line 533
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const v17, -0x43dc28f6    # -0.01f

    .line 537
    .line 538
    .line 539
    const v18, -0x404a3d71    # -1.42f

    .line 540
    .line 541
    .line 542
    const v13, -0x41333333    # -0.4f

    .line 543
    .line 544
    .line 545
    const v14, -0x41333333    # -0.4f

    .line 546
    .line 547
    .line 548
    const v15, -0x41333333    # -0.4f

    .line 549
    .line 550
    .line 551
    const v16, -0x407d70a4    # -1.02f

    .line 552
    .line 553
    .line 554
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const/high16 v0, 0x41900000    # 18.0f

    .line 561
    .line 562
    const/high16 v2, 0x40e00000    # 7.0f

    .line 563
    .line 564
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const/high16 v0, 0x40e00000    # 7.0f

    .line 568
    .line 569
    const/high16 v2, 0x41100000    # 9.0f

    .line 570
    .line 571
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const/high16 v0, 0x40c00000    # 6.0f

    .line 575
    .line 576
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const/high16 v0, 0x41500000    # 13.0f

    .line 580
    .line 581
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const/high16 v0, -0x40000000    # -2.0f

    .line 585
    .line 586
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const/high16 v17, -0x3f800000    # -4.0f

    .line 590
    .line 591
    const/high16 v18, -0x3f800000    # -4.0f

    .line 592
    .line 593
    const/4 v13, 0x0

    .line 594
    const v14, -0x3ff28f5c    # -2.21f

    .line 595
    .line 596
    .line 597
    const v15, -0x401ae148    # -1.79f

    .line 598
    .line 599
    .line 600
    const/high16 v16, -0x3f800000    # -4.0f

    .line 601
    .line 602
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const/high16 v0, 0x41300000    # 11.0f

    .line 609
    .line 610
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const/high16 v0, 0x41100000    # 9.0f

    .line 614
    .line 615
    const/high16 v2, 0x41300000    # 11.0f

    .line 616
    .line 617
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const/high16 v0, 0x40e00000    # 7.0f

    .line 621
    .line 622
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const/high16 v17, 0x40000000    # 2.0f

    .line 626
    .line 627
    const/high16 v18, 0x40000000    # 2.0f

    .line 628
    .line 629
    const v13, 0x3f8ccccd    # 1.1f

    .line 630
    .line 631
    .line 632
    const/4 v14, 0x0

    .line 633
    const/high16 v15, 0x40000000    # 2.0f

    .line 634
    .line 635
    const v16, 0x3f666666    # 0.9f

    .line 636
    .line 637
    .line 638
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const/high16 v0, -0x3ef00000    # -9.0f

    .line 642
    .line 643
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const/high16 v0, 0x41800000    # 16.0f

    .line 650
    .line 651
    const/high16 v2, 0x40000000    # 2.0f

    .line 652
    .line 653
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const/high16 v0, 0x40c00000    # 6.0f

    .line 657
    .line 658
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const/high16 v0, 0x40000000    # 2.0f

    .line 662
    .line 663
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    .line 666
    const/high16 v0, 0x41000000    # 8.0f

    .line 667
    .line 668
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const/high16 v0, -0x40000000    # -2.0f

    .line 672
    .line 673
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const/high16 v0, 0x40c00000    # 6.0f

    .line 677
    .line 678
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const/high16 v0, -0x40000000    # -2.0f

    .line 682
    .line 683
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    .line 686
    const/high16 v0, 0x41600000    # 14.0f

    .line 687
    .line 688
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 692
    .line 693
    .line 694
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 695
    .line 696
    .line 697
    move-result-object v2

    .line 698
    const/16 v16, 0x3800

    .line 699
    .line 700
    const/16 v17, 0x0

    .line 701
    .line 702
    const/high16 v6, 0x3f800000    # 1.0f

    .line 703
    .line 704
    const/high16 v8, 0x3f800000    # 1.0f

    .line 705
    .line 706
    const/4 v7, 0x0

    .line 707
    const/high16 v12, 0x3f800000    # 1.0f

    .line 708
    .line 709
    const/4 v13, 0x0

    .line 710
    const/4 v15, 0x0

    .line 711
    const-string v4, ""

    .line 712
    .line 713
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 714
    .line 715
    .line 716
    move-result-object v0

    .line 717
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 718
    .line 719
    .line 720
    move-result-object v0

    .line 721
    sput-object v0, Landroidx/compose/material/icons/twotone/AirlineSeatFlatKt;->_airlineSeatFlat:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 722
    .line 723
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 724
    .line 725
    .line 726
    return-object v0
.end method
