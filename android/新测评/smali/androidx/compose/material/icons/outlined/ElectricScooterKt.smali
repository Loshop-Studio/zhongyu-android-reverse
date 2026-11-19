.class public final Landroidx/compose/material/icons/outlined/ElectricScooterKt;
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
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getElectricScooter",
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
        "SMAP\nElectricScooter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElectricScooter.kt\nandroidx/compose/material/icons/outlined/ElectricScooterKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,85:1\n212#2,12:86\n233#2,18:99\n253#2:136\n233#2,18:137\n253#2:174\n233#2,18:175\n253#2:212\n174#3:98\n705#4,2:117\n717#4,2:119\n719#4,11:125\n705#4,2:155\n717#4,2:157\n719#4,11:163\n705#4,2:193\n717#4,2:195\n719#4,11:201\n72#5,4:121\n72#5,4:159\n72#5,4:197\n*S KotlinDebug\n*F\n+ 1 ElectricScooter.kt\nandroidx/compose/material/icons/outlined/ElectricScooterKt\n*L\n29#1:86,12\n30#1:99,18\n30#1:136\n57#1:137,18\n57#1:174\n71#1:175,18\n71#1:212\n29#1:98\n30#1:117,2\n30#1:119,2\n30#1:125,11\n57#1:155,2\n57#1:157,2\n57#1:163,11\n71#1:193,2\n71#1:195,2\n71#1:201,11\n30#1:121,4\n57#1:159,4\n71#1:197,4\n*E\n"
    }
.end annotation


# static fields
.field private static _electricScooter:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getElectricScooter(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/ElectricScooterKt;->_electricScooter:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.ElectricScooter"

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
    const/high16 v4, 0x41400000    # 12.0f

    .line 142
    .line 143
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v4, 0x40000000    # 2.0f

    .line 147
    .line 148
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v4, 0x4078f5c3    # 3.89f

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v4, 0x3fb33333    # 1.4f

    .line 158
    .line 159
    .line 160
    const/high16 v6, 0x40c80000    # 6.25f

    .line 161
    .line 162
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v25, -0x43dc28f6    # -0.01f

    .line 166
    .line 167
    .line 168
    const/16 v26, 0x0

    .line 169
    .line 170
    const/16 v21, 0x0

    .line 171
    .line 172
    const/16 v22, 0x0

    .line 173
    .line 174
    const v23, -0x43dc28f6    # -0.01f

    .line 175
    .line 176
    .line 177
    const/16 v24, 0x0

    .line 178
    .line 179
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v25, -0x3f79eb85    # -4.19f

    .line 183
    .line 184
    .line 185
    const/high16 v26, 0x40980000    # 4.75f

    .line 186
    .line 187
    const v21, -0x3ff5c28f    # -2.16f

    .line 188
    .line 189
    .line 190
    const v22, 0x3f266666    # 0.65f

    .line 191
    .line 192
    .line 193
    const v23, -0x3f8c28f6    # -3.81f

    .line 194
    .line 195
    .line 196
    const v24, 0x401eb852    # 2.48f

    .line 197
    .line 198
    .line 199
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v4, 0x40fa3d71    # 7.82f

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const v25, -0x3fa51eb8    # -3.42f

    .line 209
    .line 210
    .line 211
    const v26, -0x4007ae14    # -1.94f

    .line 212
    .line 213
    .line 214
    const v21, -0x410a3d71    # -0.48f

    .line 215
    .line 216
    .line 217
    const v22, -0x40547ae1    # -1.34f

    .line 218
    .line 219
    .line 220
    const v23, -0x4011eb85    # -1.86f

    .line 221
    .line 222
    .line 223
    const v24, -0x3ff0a3d7    # -2.24f

    .line 224
    .line 225
    .line 226
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v25, -0x3fe9999a    # -2.35f

    .line 230
    .line 231
    .line 232
    const v26, 0x401851ec    # 2.38f

    .line 233
    .line 234
    .line 235
    const v21, -0x4068f5c3    # -1.18f

    .line 236
    .line 237
    .line 238
    const v22, 0x3e6b851f    # 0.23f

    .line 239
    .line 240
    .line 241
    const v23, -0x3ff7ae14    # -2.13f

    .line 242
    .line 243
    .line 244
    const v24, 0x3f99999a    # 1.2f

    .line 245
    .line 246
    .line 247
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v25, 0x40a00000    # 5.0f

    .line 251
    .line 252
    const/high16 v26, 0x41900000    # 18.0f

    .line 253
    .line 254
    const v21, 0x3fd9999a    # 1.7f

    .line 255
    .line 256
    .line 257
    const v22, 0x4182b852    # 16.34f

    .line 258
    .line 259
    .line 260
    const v23, 0x404a3d71    # 3.16f

    .line 261
    .line 262
    .line 263
    const/high16 v24, 0x41900000    # 18.0f

    .line 264
    .line 265
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v25, 0x40fa3d71    # 7.82f

    .line 269
    .line 270
    .line 271
    const/high16 v26, 0x41800000    # 16.0f

    .line 272
    .line 273
    const v21, 0x40c9999a    # 6.3f

    .line 274
    .line 275
    .line 276
    const/high16 v22, 0x41900000    # 18.0f

    .line 277
    .line 278
    const v23, 0x40eccccd    # 7.4f

    .line 279
    .line 280
    .line 281
    const v24, 0x418947ae    # 17.16f

    .line 282
    .line 283
    .line 284
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v4, 0x40a00000    # 5.0f

    .line 291
    .line 292
    const/high16 v6, 0x41800000    # 16.0f

    .line 293
    .line 294
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const/high16 v25, -0x40800000    # -1.0f

    .line 298
    .line 299
    const/high16 v26, -0x40800000    # -1.0f

    .line 300
    .line 301
    const v21, -0x40f33333    # -0.55f

    .line 302
    .line 303
    .line 304
    const/16 v22, 0x0

    .line 305
    .line 306
    const/high16 v23, -0x40800000    # -1.0f

    .line 307
    .line 308
    const v24, -0x4119999a    # -0.45f

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v4, 0x3ee66666    # 0.45f

    .line 315
    .line 316
    .line 317
    const/high16 v6, -0x40800000    # -1.0f

    .line 318
    .line 319
    const/high16 v7, 0x3f800000    # 1.0f

    .line 320
    .line 321
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const/high16 v6, 0x3f800000    # 1.0f

    .line 325
    .line 326
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v4, 0x40b1999a    # 5.55f

    .line 330
    .line 331
    .line 332
    const/high16 v6, 0x40a00000    # 5.0f

    .line 333
    .line 334
    const/high16 v7, 0x41800000    # 16.0f

    .line 335
    .line 336
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 343
    .line 344
    .line 345
    move-result-object v2

    .line 346
    const/16 v16, 0x3800

    .line 347
    .line 348
    const/16 v17, 0x0

    .line 349
    .line 350
    const/high16 v6, 0x3f800000    # 1.0f

    .line 351
    .line 352
    const/high16 v8, 0x3f800000    # 1.0f

    .line 353
    .line 354
    const/4 v7, 0x0

    .line 355
    const/high16 v9, 0x3f800000    # 1.0f

    .line 356
    .line 357
    const/high16 v12, 0x3f800000    # 1.0f

    .line 358
    .line 359
    const/4 v13, 0x0

    .line 360
    const/4 v14, 0x0

    .line 361
    const/4 v15, 0x0

    .line 362
    const-string v4, ""

    .line 363
    .line 364
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 365
    .line 366
    .line 367
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 368
    .line 369
    .line 370
    move-result v3

    .line 371
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 372
    .line 373
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 374
    .line 375
    .line 376
    move-result-wide v6

    .line 377
    const/4 v2, 0x0

    .line 378
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 379
    .line 380
    .line 381
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 382
    .line 383
    .line 384
    move-result v10

    .line 385
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 386
    .line 387
    .line 388
    move-result v11

    .line 389
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 392
    .line 393
    .line 394
    const/high16 v4, 0x41980000    # 19.0f

    .line 395
    .line 396
    const/high16 v6, 0x41400000    # 12.0f

    .line 397
    .line 398
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 402
    .line 403
    const/high16 v26, 0x40400000    # 3.0f

    .line 404
    .line 405
    const v21, -0x402b851f    # -1.66f

    .line 406
    .line 407
    .line 408
    const/high16 v23, -0x3fc00000    # -3.0f

    .line 409
    .line 410
    const v24, 0x3fab851f    # 1.34f

    .line 411
    .line 412
    .line 413
    move-object/from16 v20, v2

    .line 414
    .line 415
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v4, 0x3fab851f    # 1.34f

    .line 419
    .line 420
    .line 421
    const/high16 v6, 0x40400000    # 3.0f

    .line 422
    .line 423
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const v4, -0x40547ae1    # -1.34f

    .line 427
    .line 428
    .line 429
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 430
    .line 431
    const/high16 v7, 0x40400000    # 3.0f

    .line 432
    .line 433
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v4, 0x41a547ae    # 20.66f

    .line 437
    .line 438
    .line 439
    const/high16 v6, 0x41980000    # 19.0f

    .line 440
    .line 441
    const/high16 v7, 0x41400000    # 12.0f

    .line 442
    .line 443
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const/high16 v4, 0x41980000    # 19.0f

    .line 450
    .line 451
    const/high16 v6, 0x41800000    # 16.0f

    .line 452
    .line 453
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/high16 v25, -0x40800000    # -1.0f

    .line 457
    .line 458
    const/high16 v26, -0x40800000    # -1.0f

    .line 459
    .line 460
    const v21, -0x40f33333    # -0.55f

    .line 461
    .line 462
    .line 463
    const/high16 v23, -0x40800000    # -1.0f

    .line 464
    .line 465
    const v24, -0x4119999a    # -0.45f

    .line 466
    .line 467
    .line 468
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v4, 0x3ee66666    # 0.45f

    .line 472
    .line 473
    .line 474
    const/high16 v6, -0x40800000    # -1.0f

    .line 475
    .line 476
    const/high16 v7, 0x3f800000    # 1.0f

    .line 477
    .line 478
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const/high16 v6, 0x3f800000    # 1.0f

    .line 482
    .line 483
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const v4, 0x419c6666    # 19.55f

    .line 487
    .line 488
    .line 489
    const/high16 v6, 0x41980000    # 19.0f

    .line 490
    .line 491
    const/high16 v7, 0x41800000    # 16.0f

    .line 492
    .line 493
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 500
    .line 501
    .line 502
    move-result-object v2

    .line 503
    const/high16 v6, 0x3f800000    # 1.0f

    .line 504
    .line 505
    const/4 v7, 0x0

    .line 506
    const-string v4, ""

    .line 507
    .line 508
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 509
    .line 510
    .line 511
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 512
    .line 513
    .line 514
    move-result v3

    .line 515
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 516
    .line 517
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 518
    .line 519
    .line 520
    move-result-wide v6

    .line 521
    const/4 v0, 0x0

    .line 522
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 526
    .line 527
    .line 528
    move-result v10

    .line 529
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 530
    .line 531
    .line 532
    move-result v11

    .line 533
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 536
    .line 537
    .line 538
    const/high16 v2, 0x41300000    # 11.0f

    .line 539
    .line 540
    const/high16 v4, 0x41a00000    # 20.0f

    .line 541
    .line 542
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const/high16 v2, -0x3f800000    # -4.0f

    .line 546
    .line 547
    const/4 v4, 0x0

    .line 548
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const/high16 v2, 0x40c00000    # 6.0f

    .line 552
    .line 553
    const/high16 v4, 0x40400000    # 3.0f

    .line 554
    .line 555
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const/high16 v2, -0x40000000    # -2.0f

    .line 559
    .line 560
    const/4 v4, 0x0

    .line 561
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const/high16 v2, 0x40800000    # 4.0f

    .line 565
    .line 566
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const/high16 v2, -0x3f400000    # -6.0f

    .line 570
    .line 571
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 572
    .line 573
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 580
    .line 581
    .line 582
    move-result-object v2

    .line 583
    const/high16 v6, 0x3f800000    # 1.0f

    .line 584
    .line 585
    const/4 v7, 0x0

    .line 586
    const-string v4, ""

    .line 587
    .line 588
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 589
    .line 590
    .line 591
    move-result-object v0

    .line 592
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 593
    .line 594
    .line 595
    move-result-object v0

    .line 596
    sput-object v0, Landroidx/compose/material/icons/outlined/ElectricScooterKt;->_electricScooter:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 597
    .line 598
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 599
    .line 600
    .line 601
    return-object v0
.end method
