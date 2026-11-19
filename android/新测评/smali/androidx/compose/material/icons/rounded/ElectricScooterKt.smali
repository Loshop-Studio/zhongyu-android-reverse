.class public final Landroidx/compose/material/icons/rounded/ElectricScooterKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_electricScooter",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "ElectricScooter",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getElectricScooter",
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
        "SMAP\nElectricScooter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElectricScooter.kt\nandroidx/compose/material/icons/rounded/ElectricScooterKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,86:1\n212#2,12:87\n233#2,18:100\n253#2:137\n233#2,18:138\n253#2:175\n233#2,18:176\n253#2:213\n174#3:99\n705#4,2:118\n717#4,2:120\n719#4,11:126\n705#4,2:156\n717#4,2:158\n719#4,11:164\n705#4,2:194\n717#4,2:196\n719#4,11:202\n72#5,4:122\n72#5,4:160\n72#5,4:198\n*S KotlinDebug\n*F\n+ 1 ElectricScooter.kt\nandroidx/compose/material/icons/rounded/ElectricScooterKt\n*L\n29#1:87,12\n30#1:100,18\n30#1:137\n58#1:138,18\n58#1:175\n72#1:176,18\n72#1:213\n29#1:99\n30#1:118,2\n30#1:120,2\n30#1:126,11\n58#1:156,2\n58#1:158,2\n58#1:164,11\n72#1:194,2\n72#1:196,2\n72#1:202,11\n30#1:122,4\n58#1:160,4\n72#1:198,4\n*E\n"
    }
.end annotation


# static fields
.field private static _electricScooter:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getElectricScooter(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ElectricScooterKt;->_electricScooter:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.ElectricScooter"

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
    const v4, 0x40fa3d71    # 7.82f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x41800000    # 16.0f

    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v4, 0x41700000    # 15.0f

    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v4, -0x40800000    # -1.0f

    .line 84
    .line 85
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/high16 v25, 0x40800000    # 4.0f

    .line 89
    .line 90
    const/high16 v26, -0x3f800000    # -4.0f

    .line 91
    .line 92
    const/16 v21, 0x0

    .line 93
    .line 94
    const v22, -0x3ff28f5c    # -2.21f

    .line 95
    .line 96
    .line 97
    const v23, 0x3fe51eb8    # 1.79f

    .line 98
    .line 99
    .line 100
    const/high16 v24, -0x3f800000    # -4.0f

    .line 101
    .line 102
    move-object/from16 v20, v2

    .line 103
    .line 104
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const v4, 0x3f3d70a4    # 0.74f

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const v4, -0x400ccccd    # -1.9f

    .line 114
    .line 115
    .line 116
    const v6, -0x3ef8f5c3    # -8.44f

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const v25, 0x417e3d71    # 15.89f

    .line 123
    .line 124
    .line 125
    const/high16 v26, 0x3f800000    # 1.0f

    .line 126
    .line 127
    const v21, 0x418d0a3d    # 17.63f

    .line 128
    .line 129
    .line 130
    const v22, 0x3fd33333    # 1.65f

    .line 131
    .line 132
    .line 133
    const v23, 0x41868f5c    # 16.82f

    .line 134
    .line 135
    .line 136
    const/high16 v24, 0x3f800000    # 1.0f

    .line 137
    .line 138
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v4, 0x41500000    # 13.0f

    .line 142
    .line 143
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v25, -0x40800000    # -1.0f

    .line 147
    .line 148
    const v21, -0x40f33333    # -0.55f

    .line 149
    .line 150
    .line 151
    const/16 v22, 0x0

    .line 152
    .line 153
    const/high16 v23, -0x40800000    # -1.0f

    .line 154
    .line 155
    const v24, 0x3ee66666    # 0.45f

    .line 156
    .line 157
    .line 158
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v25, 0x3f800000    # 1.0f

    .line 162
    .line 163
    const/16 v21, 0x0

    .line 164
    .line 165
    const v22, 0x3f0ccccd    # 0.55f

    .line 166
    .line 167
    .line 168
    const v23, 0x3ee66666    # 0.45f

    .line 169
    .line 170
    .line 171
    const/high16 v24, 0x3f800000    # 1.0f

    .line 172
    .line 173
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v4, 0x4038f5c3    # 2.89f

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v4, 0x3fb33333    # 1.4f

    .line 183
    .line 184
    .line 185
    const/high16 v6, 0x40c80000    # 6.25f

    .line 186
    .line 187
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v25, -0x43dc28f6    # -0.01f

    .line 191
    .line 192
    .line 193
    const/16 v26, 0x0

    .line 194
    .line 195
    const/16 v22, 0x0

    .line 196
    .line 197
    const v23, -0x43dc28f6    # -0.01f

    .line 198
    .line 199
    .line 200
    const/16 v24, 0x0

    .line 201
    .line 202
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v25, -0x3f79eb85    # -4.19f

    .line 206
    .line 207
    .line 208
    const/high16 v26, 0x40980000    # 4.75f

    .line 209
    .line 210
    const v21, -0x3ff5c28f    # -2.16f

    .line 211
    .line 212
    .line 213
    const v22, 0x3f266666    # 0.65f

    .line 214
    .line 215
    .line 216
    const v23, -0x3f8c28f6    # -3.81f

    .line 217
    .line 218
    .line 219
    const v24, 0x401eb852    # 2.48f

    .line 220
    .line 221
    .line 222
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v4, 0x40fa3d71    # 7.82f

    .line 226
    .line 227
    .line 228
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v25, -0x3fa51eb8    # -3.42f

    .line 232
    .line 233
    .line 234
    const v26, -0x4007ae14    # -1.94f

    .line 235
    .line 236
    .line 237
    const v21, -0x410a3d71    # -0.48f

    .line 238
    .line 239
    .line 240
    const v22, -0x40547ae1    # -1.34f

    .line 241
    .line 242
    .line 243
    const v23, -0x4011eb85    # -1.86f

    .line 244
    .line 245
    .line 246
    const v24, -0x3ff0a3d7    # -2.24f

    .line 247
    .line 248
    .line 249
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v25, -0x3fe9999a    # -2.35f

    .line 253
    .line 254
    .line 255
    const v26, 0x401851ec    # 2.38f

    .line 256
    .line 257
    .line 258
    const v21, -0x4068f5c3    # -1.18f

    .line 259
    .line 260
    .line 261
    const v22, 0x3e6b851f    # 0.23f

    .line 262
    .line 263
    .line 264
    const v23, -0x3ff7ae14    # -2.13f

    .line 265
    .line 266
    .line 267
    const v24, 0x3f99999a    # 1.2f

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v25, 0x40a00000    # 5.0f

    .line 274
    .line 275
    const/high16 v26, 0x41900000    # 18.0f

    .line 276
    .line 277
    const v21, 0x3fd9999a    # 1.7f

    .line 278
    .line 279
    .line 280
    const v22, 0x4182b852    # 16.34f

    .line 281
    .line 282
    .line 283
    const v23, 0x404a3d71    # 3.16f

    .line 284
    .line 285
    .line 286
    const/high16 v24, 0x41900000    # 18.0f

    .line 287
    .line 288
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v25, 0x40fa3d71    # 7.82f

    .line 292
    .line 293
    .line 294
    const/high16 v26, 0x41800000    # 16.0f

    .line 295
    .line 296
    const v21, 0x40c9999a    # 6.3f

    .line 297
    .line 298
    .line 299
    const/high16 v22, 0x41900000    # 18.0f

    .line 300
    .line 301
    const v23, 0x40eccccd    # 7.4f

    .line 302
    .line 303
    .line 304
    const v24, 0x418947ae    # 17.16f

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v4, 0x40a00000    # 5.0f

    .line 314
    .line 315
    const/high16 v6, 0x41800000    # 16.0f

    .line 316
    .line 317
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/high16 v25, -0x40800000    # -1.0f

    .line 321
    .line 322
    const/high16 v26, -0x40800000    # -1.0f

    .line 323
    .line 324
    const v21, -0x40f33333    # -0.55f

    .line 325
    .line 326
    .line 327
    const/16 v22, 0x0

    .line 328
    .line 329
    const/high16 v23, -0x40800000    # -1.0f

    .line 330
    .line 331
    const v24, -0x4119999a    # -0.45f

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v4, 0x3ee66666    # 0.45f

    .line 338
    .line 339
    .line 340
    const/high16 v6, -0x40800000    # -1.0f

    .line 341
    .line 342
    const/high16 v7, 0x3f800000    # 1.0f

    .line 343
    .line 344
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v6, 0x3f800000    # 1.0f

    .line 348
    .line 349
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const v4, 0x40b1999a    # 5.55f

    .line 353
    .line 354
    .line 355
    const/high16 v6, 0x40a00000    # 5.0f

    .line 356
    .line 357
    const/high16 v7, 0x41800000    # 16.0f

    .line 358
    .line 359
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    const/16 v16, 0x3800

    .line 370
    .line 371
    const/16 v17, 0x0

    .line 372
    .line 373
    const/high16 v6, 0x3f800000    # 1.0f

    .line 374
    .line 375
    const/high16 v8, 0x3f800000    # 1.0f

    .line 376
    .line 377
    const/4 v7, 0x0

    .line 378
    const/high16 v9, 0x3f800000    # 1.0f

    .line 379
    .line 380
    const/high16 v12, 0x3f800000    # 1.0f

    .line 381
    .line 382
    const/4 v13, 0x0

    .line 383
    const/4 v14, 0x0

    .line 384
    const/4 v15, 0x0

    .line 385
    const-string v4, ""

    .line 386
    .line 387
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 388
    .line 389
    .line 390
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 391
    .line 392
    .line 393
    move-result v3

    .line 394
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 395
    .line 396
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 397
    .line 398
    .line 399
    move-result-wide v6

    .line 400
    const/4 v2, 0x0

    .line 401
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 402
    .line 403
    .line 404
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 405
    .line 406
    .line 407
    move-result v10

    .line 408
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 409
    .line 410
    .line 411
    move-result v11

    .line 412
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 415
    .line 416
    .line 417
    const/high16 v4, 0x41400000    # 12.0f

    .line 418
    .line 419
    const/high16 v6, 0x41980000    # 19.0f

    .line 420
    .line 421
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 425
    .line 426
    const/high16 v26, 0x40400000    # 3.0f

    .line 427
    .line 428
    const v21, -0x402b851f    # -1.66f

    .line 429
    .line 430
    .line 431
    const/high16 v23, -0x3fc00000    # -3.0f

    .line 432
    .line 433
    const v24, 0x3fab851f    # 1.34f

    .line 434
    .line 435
    .line 436
    move-object/from16 v20, v2

    .line 437
    .line 438
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v4, 0x3fab851f    # 1.34f

    .line 442
    .line 443
    .line 444
    const/high16 v6, 0x40400000    # 3.0f

    .line 445
    .line 446
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v4, -0x40547ae1    # -1.34f

    .line 450
    .line 451
    .line 452
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 453
    .line 454
    const/high16 v7, 0x40400000    # 3.0f

    .line 455
    .line 456
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v4, 0x41a547ae    # 20.66f

    .line 460
    .line 461
    .line 462
    const/high16 v6, 0x41400000    # 12.0f

    .line 463
    .line 464
    const/high16 v7, 0x41980000    # 19.0f

    .line 465
    .line 466
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const/high16 v4, 0x41980000    # 19.0f

    .line 473
    .line 474
    const/high16 v6, 0x41800000    # 16.0f

    .line 475
    .line 476
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const/high16 v25, -0x40800000    # -1.0f

    .line 480
    .line 481
    const/high16 v26, -0x40800000    # -1.0f

    .line 482
    .line 483
    const v21, -0x40f33333    # -0.55f

    .line 484
    .line 485
    .line 486
    const/high16 v23, -0x40800000    # -1.0f

    .line 487
    .line 488
    const v24, -0x4119999a    # -0.45f

    .line 489
    .line 490
    .line 491
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const v4, 0x3ee66666    # 0.45f

    .line 495
    .line 496
    .line 497
    const/high16 v6, -0x40800000    # -1.0f

    .line 498
    .line 499
    const/high16 v7, 0x3f800000    # 1.0f

    .line 500
    .line 501
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const/high16 v6, 0x3f800000    # 1.0f

    .line 505
    .line 506
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const v4, 0x419c6666    # 19.55f

    .line 510
    .line 511
    .line 512
    const/high16 v6, 0x41980000    # 19.0f

    .line 513
    .line 514
    const/high16 v7, 0x41800000    # 16.0f

    .line 515
    .line 516
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 523
    .line 524
    .line 525
    move-result-object v2

    .line 526
    const/high16 v6, 0x3f800000    # 1.0f

    .line 527
    .line 528
    const/4 v7, 0x0

    .line 529
    const-string v4, ""

    .line 530
    .line 531
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 532
    .line 533
    .line 534
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 535
    .line 536
    .line 537
    move-result v3

    .line 538
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 539
    .line 540
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 541
    .line 542
    .line 543
    move-result-wide v6

    .line 544
    const/4 v0, 0x0

    .line 545
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 546
    .line 547
    .line 548
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 549
    .line 550
    .line 551
    move-result v10

    .line 552
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 553
    .line 554
    .line 555
    move-result v11

    .line 556
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 559
    .line 560
    .line 561
    const/high16 v2, 0x41300000    # 11.0f

    .line 562
    .line 563
    const/high16 v4, 0x41a00000    # 20.0f

    .line 564
    .line 565
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const/high16 v2, -0x3f800000    # -4.0f

    .line 569
    .line 570
    const/4 v4, 0x0

    .line 571
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const/high16 v2, 0x40c00000    # 6.0f

    .line 575
    .line 576
    const/high16 v4, 0x40400000    # 3.0f

    .line 577
    .line 578
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const/high16 v2, -0x40000000    # -2.0f

    .line 582
    .line 583
    const/4 v4, 0x0

    .line 584
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const/high16 v2, 0x40800000    # 4.0f

    .line 588
    .line 589
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const/high16 v2, -0x3f400000    # -6.0f

    .line 593
    .line 594
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 595
    .line 596
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 603
    .line 604
    .line 605
    move-result-object v2

    .line 606
    const/high16 v6, 0x3f800000    # 1.0f

    .line 607
    .line 608
    const/4 v7, 0x0

    .line 609
    const-string v4, ""

    .line 610
    .line 611
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 612
    .line 613
    .line 614
    move-result-object v0

    .line 615
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    sput-object v0, Landroidx/compose/material/icons/rounded/ElectricScooterKt;->_electricScooter:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 620
    .line 621
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 622
    .line 623
    .line 624
    return-object v0
.end method
