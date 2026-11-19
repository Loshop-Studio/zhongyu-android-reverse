.class public final Landroidx/compose/material/icons/twotone/DirectionsBoatKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_directionsBoat",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "DirectionsBoat",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getDirectionsBoat",
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
        "SMAP\nDirectionsBoat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DirectionsBoat.kt\nandroidx/compose/material/icons/twotone/DirectionsBoatKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,130:1\n212#2,12:131\n233#2,18:144\n253#2:181\n233#2,18:182\n253#2:219\n174#3:143\n705#4,2:162\n717#4,2:164\n719#4,11:170\n705#4,2:200\n717#4,2:202\n719#4,11:208\n72#5,4:166\n72#5,4:204\n*S KotlinDebug\n*F\n+ 1 DirectionsBoat.kt\nandroidx/compose/material/icons/twotone/DirectionsBoatKt\n*L\n29#1:131,12\n30#1:144,18\n30#1:181\n53#1:182,18\n53#1:219\n29#1:143\n30#1:162,2\n30#1:164,2\n30#1:170,11\n53#1:200,2\n53#1:202,2\n53#1:208,11\n30#1:166,4\n53#1:204,4\n*E\n"
    }
.end annotation


# static fields
.field private static _directionsBoat:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDirectionsBoat(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/DirectionsBoatKt;->_directionsBoat:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.DirectionsBoat"

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
    const v4, 0x40cfae14    # 6.49f

    .line 71
    .line 72
    .line 73
    const v6, 0x417ae148    # 15.68f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, 0x415f5c29    # 13.96f

    .line 80
    .line 81
    .line 82
    const/high16 v6, 0x41000000    # 8.0f

    .line 83
    .line 84
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v4, 0x3fc147ae    # 1.51f

    .line 88
    .line 89
    .line 90
    const v6, 0x3fdc28f6    # 1.72f

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v25, 0x401f5c29    # 2.49f

    .line 97
    .line 98
    .line 99
    const v26, 0x3fa8f5c3    # 1.32f

    .line 100
    .line 101
    .line 102
    const v21, 0x3eae147b    # 0.34f

    .line 103
    .line 104
    .line 105
    const v22, 0x3ecccccd    # 0.4f

    .line 106
    .line 107
    .line 108
    const v23, 0x3fa3d70a    # 1.28f

    .line 109
    .line 110
    .line 111
    const v24, 0x3fa8f5c3    # 1.32f

    .line 112
    .line 113
    .line 114
    move-object/from16 v20, v2

    .line 115
    .line 116
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v26, -0x40570a3d    # -1.32f

    .line 120
    .line 121
    .line 122
    const v21, 0x3f9ae148    # 1.21f

    .line 123
    .line 124
    .line 125
    const/16 v22, 0x0

    .line 126
    .line 127
    const v23, 0x4009999a    # 2.15f

    .line 128
    .line 129
    .line 130
    const v24, -0x40947ae1    # -0.92f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v4, 0x41800000    # 16.0f

    .line 137
    .line 138
    const v6, 0x415f5c29    # 13.96f

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v4, 0x3fc147ae    # 1.51f

    .line 145
    .line 146
    .line 147
    const v6, 0x3fdc28f6    # 1.72f

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v25, 0x3f91eb85    # 1.14f

    .line 154
    .line 155
    .line 156
    const v26, 0x3f70a3d7    # 0.94f

    .line 157
    .line 158
    .line 159
    const v21, 0x3e4ccccd    # 0.2f

    .line 160
    .line 161
    .line 162
    const v22, 0x3e6b851f    # 0.23f

    .line 163
    .line 164
    .line 165
    const v23, 0x3f19999a    # 0.6f

    .line 166
    .line 167
    .line 168
    const v24, 0x3f23d70a    # 0.64f

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v4, 0x3f8f5c29    # 1.12f

    .line 175
    .line 176
    .line 177
    const v6, -0x3f81eb85    # -3.97f

    .line 178
    .line 179
    .line 180
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v4, -0x3fe70a3d    # -2.39f

    .line 184
    .line 185
    .line 186
    const v6, -0x40b851ec    # -0.78f

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v4, 0x4121c28f    # 10.11f

    .line 193
    .line 194
    .line 195
    const/high16 v6, 0x41400000    # 12.0f

    .line 196
    .line 197
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v4, -0x3f53d70a    # -5.38f

    .line 201
    .line 202
    .line 203
    const v6, 0x3fe28f5c    # 1.77f

    .line 204
    .line 205
    .line 206
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v4, -0x3fe66666    # -2.4f

    .line 210
    .line 211
    .line 212
    const v6, 0x3f4a3d71    # 0.79f

    .line 213
    .line 214
    .line 215
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v4, 0x3f90a3d7    # 1.13f

    .line 219
    .line 220
    .line 221
    const v6, 0x407d70a4    # 3.96f

    .line 222
    .line 223
    .line 224
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v26, -0x408ccccd    # -0.95f

    .line 228
    .line 229
    .line 230
    const v21, 0x3f0ccccd    # 0.55f

    .line 231
    .line 232
    .line 233
    const v22, -0x416147ae    # -0.31f

    .line 234
    .line 235
    .line 236
    const v23, 0x3f70a3d7    # 0.94f

    .line 237
    .line 238
    .line 239
    const v24, -0x40c7ae14    # -0.72f

    .line 240
    .line 241
    .line 242
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const/high16 v4, 0x41300000    # 11.0f

    .line 249
    .line 250
    const/high16 v6, 0x40400000    # 3.0f

    .line 251
    .line 252
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v4, 0x40000000    # 2.0f

    .line 256
    .line 257
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v4, 0x3f800000    # 1.0f

    .line 261
    .line 262
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v4, -0x40000000    # -2.0f

    .line 266
    .line 267
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    const/16 v16, 0x3800

    .line 278
    .line 279
    const/16 v17, 0x0

    .line 280
    .line 281
    const v6, 0x3e99999a    # 0.3f

    .line 282
    .line 283
    .line 284
    const v8, 0x3e99999a    # 0.3f

    .line 285
    .line 286
    .line 287
    const/4 v7, 0x0

    .line 288
    const/high16 v9, 0x3f800000    # 1.0f

    .line 289
    .line 290
    const/high16 v12, 0x3f800000    # 1.0f

    .line 291
    .line 292
    const/4 v13, 0x0

    .line 293
    const/4 v14, 0x0

    .line 294
    const/4 v15, 0x0

    .line 295
    const-string v4, ""

    .line 296
    .line 297
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 298
    .line 299
    .line 300
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 301
    .line 302
    .line 303
    move-result v3

    .line 304
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 305
    .line 306
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 307
    .line 308
    .line 309
    move-result-wide v6

    .line 310
    const/4 v0, 0x0

    .line 311
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 315
    .line 316
    .line 317
    move-result v10

    .line 318
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 319
    .line 320
    .line 321
    move-result v11

    .line 322
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 325
    .line 326
    .line 327
    const v0, 0x407ccccd    # 3.95f

    .line 328
    .line 329
    .line 330
    const/high16 v2, 0x41980000    # 19.0f

    .line 331
    .line 332
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v0, 0x41980000    # 19.0f

    .line 336
    .line 337
    const/high16 v2, 0x40800000    # 4.0f

    .line 338
    .line 339
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v17, 0x40800000    # 4.0f

    .line 343
    .line 344
    const/high16 v18, -0x40000000    # -2.0f

    .line 345
    .line 346
    const v13, 0x3fcccccd    # 1.6f

    .line 347
    .line 348
    .line 349
    const v15, 0x404147ae    # 3.02f

    .line 350
    .line 351
    .line 352
    const v16, -0x409eb852    # -0.88f

    .line 353
    .line 354
    .line 355
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v18, 0x40000000    # 2.0f

    .line 359
    .line 360
    const v13, 0x3f7ae148    # 0.98f

    .line 361
    .line 362
    .line 363
    const v14, 0x3f8f5c29    # 1.12f

    .line 364
    .line 365
    .line 366
    const v15, 0x4019999a    # 2.4f

    .line 367
    .line 368
    .line 369
    const/high16 v16, 0x40000000    # 2.0f

    .line 370
    .line 371
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v0, 0x404147ae    # 3.02f

    .line 375
    .line 376
    .line 377
    const v2, -0x409eb852    # -0.88f

    .line 378
    .line 379
    .line 380
    const/high16 v4, 0x40800000    # 4.0f

    .line 381
    .line 382
    const/high16 v6, -0x40000000    # -2.0f

    .line 383
    .line 384
    invoke-virtual {v12, v0, v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v0, 0x3d4ccccd    # 0.05f

    .line 391
    .line 392
    .line 393
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v0, 0x3ff1eb85    # 1.89f

    .line 397
    .line 398
    .line 399
    const v2, -0x3f2a3d71    # -6.68f

    .line 400
    .line 401
    .line 402
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v17, -0x428a3d71    # -0.06f

    .line 406
    .line 407
    .line 408
    const v18, -0x40b851ec    # -0.78f

    .line 409
    .line 410
    .line 411
    const v13, 0x3da3d70a    # 0.08f

    .line 412
    .line 413
    .line 414
    const v14, -0x417ae148    # -0.26f

    .line 415
    .line 416
    .line 417
    const v15, 0x3d75c28f    # 0.06f

    .line 418
    .line 419
    .line 420
    const v16, -0x40f5c28f    # -0.54f

    .line 421
    .line 422
    .line 423
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const v0, -0x40e66666    # -0.6f

    .line 427
    .line 428
    .line 429
    const/high16 v2, -0x41000000    # -0.5f

    .line 430
    .line 431
    const v4, -0x4151eb85    # -0.34f

    .line 432
    .line 433
    .line 434
    const v6, -0x4128f5c3    # -0.42f

    .line 435
    .line 436
    .line 437
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v0, 0x4129eb85    # 10.62f

    .line 441
    .line 442
    .line 443
    const/high16 v2, 0x41a00000    # 20.0f

    .line 444
    .line 445
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/high16 v0, 0x41a00000    # 20.0f

    .line 449
    .line 450
    const/high16 v2, 0x40c00000    # 6.0f

    .line 451
    .line 452
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const/high16 v17, -0x40000000    # -2.0f

    .line 456
    .line 457
    const/high16 v18, -0x40000000    # -2.0f

    .line 458
    .line 459
    const/4 v13, 0x0

    .line 460
    const v14, -0x40733333    # -1.1f

    .line 461
    .line 462
    .line 463
    const v15, -0x4099999a    # -0.9f

    .line 464
    .line 465
    .line 466
    const/high16 v16, -0x40000000    # -2.0f

    .line 467
    .line 468
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 472
    .line 473
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v0, 0x41700000    # 15.0f

    .line 477
    .line 478
    const/high16 v2, 0x3f800000    # 1.0f

    .line 479
    .line 480
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v0, 0x41100000    # 9.0f

    .line 484
    .line 485
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const/high16 v0, 0x40400000    # 3.0f

    .line 489
    .line 490
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v0, 0x40800000    # 4.0f

    .line 494
    .line 495
    const/high16 v2, 0x40c00000    # 6.0f

    .line 496
    .line 497
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v18, 0x40000000    # 2.0f

    .line 501
    .line 502
    const v13, -0x40733333    # -1.1f

    .line 503
    .line 504
    .line 505
    const/4 v14, 0x0

    .line 506
    const/high16 v15, -0x40000000    # -2.0f

    .line 507
    .line 508
    const v16, 0x3f666666    # 0.9f

    .line 509
    .line 510
    .line 511
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const v0, 0x4093d70a    # 4.62f

    .line 515
    .line 516
    .line 517
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const v0, -0x405ae148    # -1.29f

    .line 521
    .line 522
    .line 523
    const v2, 0x3ed70a3d    # 0.42f

    .line 524
    .line 525
    .line 526
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const v17, -0x40e66666    # -0.6f

    .line 530
    .line 531
    .line 532
    const/high16 v18, 0x3f000000    # 0.5f

    .line 533
    .line 534
    const v13, -0x417ae148    # -0.26f

    .line 535
    .line 536
    .line 537
    const v14, 0x3da3d70a    # 0.08f

    .line 538
    .line 539
    .line 540
    const v15, -0x410a3d71    # -0.48f

    .line 541
    .line 542
    .line 543
    const v16, 0x3e851eb8    # 0.26f

    .line 544
    .line 545
    .line 546
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const v0, 0x3f051eb8    # 0.52f

    .line 550
    .line 551
    .line 552
    const v2, -0x428a3d71    # -0.06f

    .line 553
    .line 554
    .line 555
    const v4, 0x3f47ae14    # 0.78f

    .line 556
    .line 557
    .line 558
    const v6, -0x41e66666    # -0.15f

    .line 559
    .line 560
    .line 561
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const v0, 0x407ccccd    # 3.95f

    .line 565
    .line 566
    .line 567
    const/high16 v2, 0x41980000    # 19.0f

    .line 568
    .line 569
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const/high16 v0, 0x41300000    # 11.0f

    .line 576
    .line 577
    const/high16 v2, 0x40400000    # 3.0f

    .line 578
    .line 579
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const/high16 v0, 0x40000000    # 2.0f

    .line 583
    .line 584
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const/high16 v0, 0x3f800000    # 1.0f

    .line 588
    .line 589
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const/high16 v0, -0x40000000    # -2.0f

    .line 593
    .line 594
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const/high16 v0, 0x41300000    # 11.0f

    .line 598
    .line 599
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const/high16 v0, 0x40c00000    # 6.0f

    .line 606
    .line 607
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const/high16 v0, 0x41400000    # 12.0f

    .line 611
    .line 612
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const v0, 0x407e147b    # 3.97f

    .line 616
    .line 617
    .line 618
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    const/high16 v0, 0x41400000    # 12.0f

    .line 622
    .line 623
    const/high16 v2, 0x41000000    # 8.0f

    .line 624
    .line 625
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const v0, 0x411f851f    # 9.97f

    .line 629
    .line 630
    .line 631
    const/high16 v2, 0x40c00000    # 6.0f

    .line 632
    .line 633
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const/high16 v0, 0x40c00000    # 6.0f

    .line 637
    .line 638
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const v0, 0x40d3d70a    # 6.62f

    .line 645
    .line 646
    .line 647
    const v2, 0x413deb85    # 11.87f

    .line 648
    .line 649
    .line 650
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const v0, 0x4121c28f    # 10.11f

    .line 654
    .line 655
    .line 656
    const/high16 v2, 0x41400000    # 12.0f

    .line 657
    .line 658
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const v0, 0x40ac28f6    # 5.38f

    .line 662
    .line 663
    .line 664
    const v2, 0x3fe28f5c    # 1.77f

    .line 665
    .line 666
    .line 667
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const v0, 0x4018f5c3    # 2.39f

    .line 671
    .line 672
    .line 673
    const v2, 0x3f47ae14    # 0.78f

    .line 674
    .line 675
    .line 676
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    const v0, -0x4070a3d7    # -1.12f

    .line 680
    .line 681
    .line 682
    const v2, 0x407e147b    # 3.97f

    .line 683
    .line 684
    .line 685
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    const v17, -0x406e147b    # -1.14f

    .line 689
    .line 690
    .line 691
    const v18, -0x408f5c29    # -0.94f

    .line 692
    .line 693
    .line 694
    const v13, -0x40f5c28f    # -0.54f

    .line 695
    .line 696
    .line 697
    const v14, -0x41666666    # -0.3f

    .line 698
    .line 699
    .line 700
    const v15, -0x408f5c29    # -0.94f

    .line 701
    .line 702
    .line 703
    const v16, -0x40ca3d71    # -0.71f

    .line 704
    .line 705
    .line 706
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    const/high16 v0, 0x41800000    # 16.0f

    .line 710
    .line 711
    const v2, 0x415f5c29    # 13.96f

    .line 712
    .line 713
    .line 714
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 715
    .line 716
    .line 717
    const v0, -0x403eb852    # -1.51f

    .line 718
    .line 719
    .line 720
    const v2, 0x3fdc28f6    # 1.72f

    .line 721
    .line 722
    .line 723
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    const v17, -0x3fe0a3d7    # -2.49f

    .line 727
    .line 728
    .line 729
    const v18, 0x3fa8f5c3    # 1.32f

    .line 730
    .line 731
    .line 732
    const v13, -0x4151eb85    # -0.34f

    .line 733
    .line 734
    .line 735
    const v14, 0x3ecccccd    # 0.4f

    .line 736
    .line 737
    .line 738
    const v15, -0x405c28f6    # -1.28f

    .line 739
    .line 740
    .line 741
    const v16, 0x3fa8f5c3    # 1.32f

    .line 742
    .line 743
    .line 744
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 745
    .line 746
    .line 747
    const v18, -0x40570a3d    # -1.32f

    .line 748
    .line 749
    .line 750
    const v13, -0x40651eb8    # -1.21f

    .line 751
    .line 752
    .line 753
    const/4 v14, 0x0

    .line 754
    const v15, -0x3ff66666    # -2.15f

    .line 755
    .line 756
    .line 757
    const v16, -0x40947ae1    # -0.92f

    .line 758
    .line 759
    .line 760
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 761
    .line 762
    .line 763
    const v0, 0x415f5c29    # 13.96f

    .line 764
    .line 765
    .line 766
    const/high16 v2, 0x41000000    # 8.0f

    .line 767
    .line 768
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 769
    .line 770
    .line 771
    const v0, -0x403eb852    # -1.51f

    .line 772
    .line 773
    .line 774
    const v2, 0x3fdc28f6    # 1.72f

    .line 775
    .line 776
    .line 777
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 778
    .line 779
    .line 780
    const v17, -0x406e147b    # -1.14f

    .line 781
    .line 782
    .line 783
    const v18, 0x3f6e147b    # 0.93f

    .line 784
    .line 785
    .line 786
    const v13, -0x41b33333    # -0.2f

    .line 787
    .line 788
    .line 789
    const v14, 0x3e6b851f    # 0.23f

    .line 790
    .line 791
    .line 792
    const v15, -0x40e66666    # -0.6f

    .line 793
    .line 794
    .line 795
    const v16, 0x3f2147ae    # 0.63f

    .line 796
    .line 797
    .line 798
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 799
    .line 800
    .line 801
    const v0, -0x406f5c29    # -1.13f

    .line 802
    .line 803
    .line 804
    const v2, -0x3f828f5c    # -3.96f

    .line 805
    .line 806
    .line 807
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 808
    .line 809
    .line 810
    const v0, 0x4019999a    # 2.4f

    .line 811
    .line 812
    .line 813
    const v2, -0x40b851ec    # -0.78f

    .line 814
    .line 815
    .line 816
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 817
    .line 818
    .line 819
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 820
    .line 821
    .line 822
    const v0, 0x41b0147b    # 22.01f

    .line 823
    .line 824
    .line 825
    const/high16 v2, 0x41000000    # 8.0f

    .line 826
    .line 827
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 828
    .line 829
    .line 830
    const/high16 v17, 0x40800000    # 4.0f

    .line 831
    .line 832
    const v18, 0x3f7851ec    # 0.97f

    .line 833
    .line 834
    .line 835
    const v13, 0x3fa147ae    # 1.26f

    .line 836
    .line 837
    .line 838
    const v14, 0x3f23d70a    # 0.64f

    .line 839
    .line 840
    .line 841
    const v15, 0x402851ec    # 2.63f

    .line 842
    .line 843
    .line 844
    const v16, 0x3f7851ec    # 0.97f

    .line 845
    .line 846
    .line 847
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 848
    .line 849
    .line 850
    const v0, -0x415c28f6    # -0.32f

    .line 851
    .line 852
    .line 853
    const v2, -0x4087ae14    # -0.97f

    .line 854
    .line 855
    .line 856
    const/high16 v4, 0x40800000    # 4.0f

    .line 857
    .line 858
    const v6, 0x402f5c29    # 2.74f

    .line 859
    .line 860
    .line 861
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 862
    .line 863
    .line 864
    const v18, 0x3f7d70a4    # 0.99f

    .line 865
    .line 866
    .line 867
    const v14, 0x3f266666    # 0.65f

    .line 868
    .line 869
    .line 870
    const v15, 0x4027ae14    # 2.62f

    .line 871
    .line 872
    .line 873
    const v16, 0x3f7d70a4    # 0.99f

    .line 874
    .line 875
    .line 876
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 877
    .line 878
    .line 879
    const/high16 v0, 0x40000000    # 2.0f

    .line 880
    .line 881
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 882
    .line 883
    .line 884
    const/high16 v0, -0x40000000    # -2.0f

    .line 885
    .line 886
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 887
    .line 888
    .line 889
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 890
    .line 891
    .line 892
    const/high16 v17, -0x3f800000    # -4.0f

    .line 893
    .line 894
    const v18, -0x40570a3d    # -1.32f

    .line 895
    .line 896
    .line 897
    const v13, -0x404e147b    # -1.39f

    .line 898
    .line 899
    .line 900
    const/4 v14, 0x0

    .line 901
    const v15, -0x3fce147b    # -2.78f

    .line 902
    .line 903
    .line 904
    const v16, -0x410f5c29    # -0.47f

    .line 905
    .line 906
    .line 907
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 908
    .line 909
    .line 910
    const v18, 0x3fa3d70a    # 1.28f

    .line 911
    .line 912
    .line 913
    const v13, -0x4063d70a    # -1.22f

    .line 914
    .line 915
    .line 916
    const v14, 0x3f59999a    # 0.85f

    .line 917
    .line 918
    .line 919
    const v15, -0x3fd8f5c3    # -2.61f

    .line 920
    .line 921
    .line 922
    const v16, 0x3fa3d70a    # 1.28f

    .line 923
    .line 924
    .line 925
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 926
    .line 927
    .line 928
    const/high16 v0, -0x3f800000    # -4.0f

    .line 929
    .line 930
    const v2, -0x405c28f6    # -1.28f

    .line 931
    .line 932
    .line 933
    const v4, -0x3fce147b    # -2.78f

    .line 934
    .line 935
    .line 936
    const v6, -0x4123d70a    # -0.43f

    .line 937
    .line 938
    .line 939
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 940
    .line 941
    .line 942
    const/high16 v17, 0x40800000    # 4.0f

    .line 943
    .line 944
    const/high16 v18, 0x41a80000    # 21.0f

    .line 945
    .line 946
    const v13, 0x40d8f5c3    # 6.78f

    .line 947
    .line 948
    .line 949
    const v14, 0x41a43d71    # 20.53f

    .line 950
    .line 951
    .line 952
    const v15, 0x40ac7ae1    # 5.39f

    .line 953
    .line 954
    .line 955
    const/high16 v16, 0x41a80000    # 21.0f

    .line 956
    .line 957
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 958
    .line 959
    .line 960
    const/high16 v0, 0x41a80000    # 21.0f

    .line 961
    .line 962
    const/high16 v2, 0x40000000    # 2.0f

    .line 963
    .line 964
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 965
    .line 966
    .line 967
    const/high16 v0, 0x40000000    # 2.0f

    .line 968
    .line 969
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 970
    .line 971
    .line 972
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 973
    .line 974
    .line 975
    const v18, -0x40828f5c    # -0.99f

    .line 976
    .line 977
    .line 978
    const v13, 0x3fb0a3d7    # 1.38f

    .line 979
    .line 980
    .line 981
    const/4 v14, 0x0

    .line 982
    const v15, 0x402f5c29    # 2.74f

    .line 983
    .line 984
    .line 985
    const v16, -0x414ccccd    # -0.35f

    .line 986
    .line 987
    .line 988
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 989
    .line 990
    .line 991
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 992
    .line 993
    .line 994
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 995
    .line 996
    .line 997
    move-result-object v2

    .line 998
    const/16 v16, 0x3800

    .line 999
    .line 1000
    const/16 v17, 0x0

    .line 1001
    .line 1002
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1003
    .line 1004
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1005
    .line 1006
    const/4 v7, 0x0

    .line 1007
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1008
    .line 1009
    const/4 v13, 0x0

    .line 1010
    const/4 v15, 0x0

    .line 1011
    const-string v4, ""

    .line 1012
    .line 1013
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v0

    .line 1017
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v0

    .line 1021
    sput-object v0, Landroidx/compose/material/icons/twotone/DirectionsBoatKt;->_directionsBoat:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1022
    .line 1023
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1024
    .line 1025
    .line 1026
    return-object v0
.end method
