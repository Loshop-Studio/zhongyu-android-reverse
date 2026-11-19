.class public final Landroidx/compose/material/icons/twotone/NoStrollerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_noStroller",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "NoStroller",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getNoStroller",
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
        "SMAP\nNoStroller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NoStroller.kt\nandroidx/compose/material/icons/twotone/NoStrollerKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,108:1\n212#2,12:109\n233#2,18:122\n253#2:159\n233#2,18:160\n253#2:197\n174#3:121\n705#4,2:140\n717#4,2:142\n719#4,11:148\n705#4,2:178\n717#4,2:180\n719#4,11:186\n72#5,4:144\n72#5,4:182\n*S KotlinDebug\n*F\n+ 1 NoStroller.kt\nandroidx/compose/material/icons/twotone/NoStrollerKt\n*L\n29#1:109,12\n30#1:122,18\n30#1:159\n48#1:160,18\n48#1:197\n29#1:121\n30#1:140,2\n30#1:142,2\n30#1:148,11\n48#1:178,2\n48#1:180,2\n48#1:186,11\n30#1:144,4\n48#1:182,4\n*E\n"
    }
.end annotation


# static fields
.field private static _noStroller:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNoStroller(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/NoStrollerKt;->_noStroller:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.NoStroller"

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
    const v4, 0x40a8a3d7    # 5.27f

    .line 71
    .line 72
    .line 73
    const v6, 0x4101999a    # 8.1f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v25, 0x41200000    # 10.0f

    .line 80
    .line 81
    const/high16 v26, 0x40a00000    # 5.0f

    .line 82
    .line 83
    const v21, 0x410b5c29    # 8.71f

    .line 84
    .line 85
    .line 86
    const v22, 0x40a33333    # 5.1f

    .line 87
    .line 88
    .line 89
    const v23, 0x4115999a    # 9.35f

    .line 90
    .line 91
    .line 92
    const/high16 v24, 0x40a00000    # 5.0f

    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v25, 0x3f5c28f6    # 0.86f

    .line 100
    .line 101
    .line 102
    const v26, 0x3d4ccccd    # 0.05f

    .line 103
    .line 104
    .line 105
    const v21, 0x3e947ae1    # 0.29f

    .line 106
    .line 107
    .line 108
    const/16 v22, 0x0

    .line 109
    .line 110
    const v23, 0x3f147ae1    # 0.58f

    .line 111
    .line 112
    .line 113
    const v24, 0x3ca3d70a    # 0.02f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v4, 0x40d570a4    # 6.67f

    .line 120
    .line 121
    .line 122
    const v6, 0x4117d70a    # 9.49f

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v4, 0x40a8a3d7    # 5.27f

    .line 129
    .line 130
    .line 131
    const v6, 0x4101999a    # 8.1f

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v4, 0x4142b852    # 12.17f

    .line 141
    .line 142
    .line 143
    const/high16 v6, 0x41700000    # 15.0f

    .line 144
    .line 145
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v4, 0x410a8f5c    # 8.66f

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v4, -0x4031eb85    # -1.61f

    .line 155
    .line 156
    .line 157
    const v6, 0x3ff1eb85    # 1.89f

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v4, 0x4142b852    # 12.17f

    .line 164
    .line 165
    .line 166
    const/high16 v6, 0x41700000    # 15.0f

    .line 167
    .line 168
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v4, -0x404e147b    # -1.39f

    .line 178
    .line 179
    .line 180
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v4, 0x4119999a    # 9.6f

    .line 184
    .line 185
    .line 186
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v4, 0x4142b852    # 12.17f

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    const/16 v16, 0x3800

    .line 203
    .line 204
    const/16 v17, 0x0

    .line 205
    .line 206
    const v6, 0x3e99999a    # 0.3f

    .line 207
    .line 208
    .line 209
    const v8, 0x3e99999a    # 0.3f

    .line 210
    .line 211
    .line 212
    const/4 v7, 0x0

    .line 213
    const/high16 v9, 0x3f800000    # 1.0f

    .line 214
    .line 215
    const/high16 v12, 0x3f800000    # 1.0f

    .line 216
    .line 217
    const/4 v13, 0x0

    .line 218
    const/4 v14, 0x0

    .line 219
    const/4 v15, 0x0

    .line 220
    const-string v4, ""

    .line 221
    .line 222
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 223
    .line 224
    .line 225
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 226
    .line 227
    .line 228
    move-result v3

    .line 229
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 230
    .line 231
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 232
    .line 233
    .line 234
    move-result-wide v6

    .line 235
    const/4 v0, 0x0

    .line 236
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 240
    .line 241
    .line 242
    move-result v10

    .line 243
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 244
    .line 245
    .line 246
    move-result v11

    .line 247
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 250
    .line 251
    .line 252
    const/high16 v0, 0x41a00000    # 20.0f

    .line 253
    .line 254
    const/high16 v2, 0x41000000    # 8.0f

    .line 255
    .line 256
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v17, -0x40000000    # -2.0f

    .line 260
    .line 261
    const/high16 v18, 0x40000000    # 2.0f

    .line 262
    .line 263
    const v14, 0x3f8ccccd    # 1.1f

    .line 264
    .line 265
    .line 266
    const v15, -0x4099999a    # -0.9f

    .line 267
    .line 268
    .line 269
    const/high16 v16, 0x40000000    # 2.0f

    .line 270
    .line 271
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v0, -0x4099999a    # -0.9f

    .line 275
    .line 276
    .line 277
    const/high16 v2, -0x40000000    # -2.0f

    .line 278
    .line 279
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v0, 0x3f666666    # 0.9f

    .line 283
    .line 284
    .line 285
    const/high16 v2, 0x40000000    # 2.0f

    .line 286
    .line 287
    const/high16 v4, -0x40000000    # -2.0f

    .line 288
    .line 289
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v0, 0x41973333    # 18.9f

    .line 293
    .line 294
    .line 295
    const/high16 v2, 0x41a00000    # 20.0f

    .line 296
    .line 297
    const/high16 v4, 0x41000000    # 8.0f

    .line 298
    .line 299
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v0, 0x410a8f5c    # 8.66f

    .line 306
    .line 307
    .line 308
    const/high16 v2, 0x41700000    # 15.0f

    .line 309
    .line 310
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v0, 0x4060a3d7    # 3.51f

    .line 314
    .line 315
    .line 316
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v0, 0x40000000    # 2.0f

    .line 320
    .line 321
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v0, -0x3f033333    # -7.9f

    .line 325
    .line 326
    .line 327
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v17, 0x41953333    # 18.65f

    .line 331
    .line 332
    .line 333
    const/high16 v18, 0x40a00000    # 5.0f

    .line 334
    .line 335
    const v13, 0x418ca3d7    # 17.58f

    .line 336
    .line 337
    .line 338
    const v14, 0x40b2e148    # 5.59f

    .line 339
    .line 340
    .line 341
    const v15, 0x418fc28f    # 17.97f

    .line 342
    .line 343
    .line 344
    const/high16 v16, 0x40a00000    # 5.0f

    .line 345
    .line 346
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v17, 0x41a00000    # 20.0f

    .line 350
    .line 351
    const v18, 0x40cf5c29    # 6.48f

    .line 352
    .line 353
    .line 354
    const v13, 0x419b5c29    # 19.42f

    .line 355
    .line 356
    .line 357
    const/high16 v14, 0x40a00000    # 5.0f

    .line 358
    .line 359
    const/high16 v15, 0x41a00000    # 20.0f

    .line 360
    .line 361
    const v16, 0x40b51eb8    # 5.66f

    .line 362
    .line 363
    .line 364
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const/high16 v0, 0x40e00000    # 7.0f

    .line 368
    .line 369
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const/high16 v0, 0x40000000    # 2.0f

    .line 373
    .line 374
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const v0, 0x40cf5c29    # 6.48f

    .line 378
    .line 379
    .line 380
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v17, 0x41953333    # 18.65f

    .line 384
    .line 385
    .line 386
    const/high16 v18, 0x40400000    # 3.0f

    .line 387
    .line 388
    const/high16 v13, 0x41b00000    # 22.0f

    .line 389
    .line 390
    const v14, 0x4091eb85    # 4.56f

    .line 391
    .line 392
    .line 393
    const v15, 0x41a428f6    # 20.52f

    .line 394
    .line 395
    .line 396
    const/high16 v16, 0x40400000    # 3.0f

    .line 397
    .line 398
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v17, -0x3fb47ae1    # -3.18f

    .line 402
    .line 403
    .line 404
    const v18, 0x4001eb85    # 2.03f

    .line 405
    .line 406
    .line 407
    const v13, -0x402b851f    # -1.66f

    .line 408
    .line 409
    .line 410
    const/4 v14, 0x0

    .line 411
    const v15, -0x3fdd70a4    # -2.54f

    .line 412
    .line 413
    .line 414
    const v16, 0x3fa28f5c    # 1.27f

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v0, -0x3fa00000    # -3.5f

    .line 421
    .line 422
    const v2, 0x4083851f    # 4.11f

    .line 423
    .line 424
    .line 425
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const v0, 0x3fb5c28f    # 1.42f

    .line 429
    .line 430
    .line 431
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const v0, 0x410a8f5c    # 8.66f

    .line 435
    .line 436
    .line 437
    const/high16 v2, 0x41700000    # 15.0f

    .line 438
    .line 439
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const v0, 0x41b4e148    # 22.61f

    .line 446
    .line 447
    .line 448
    const v2, 0x419e3d71    # 19.78f

    .line 449
    .line 450
    .line 451
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v0, -0x400b851f    # -1.91f

    .line 455
    .line 456
    .line 457
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const/high16 v17, 0x41800000    # 16.0f

    .line 461
    .line 462
    const/high16 v18, 0x41b00000    # 22.0f

    .line 463
    .line 464
    const v13, 0x418ca3d7    # 17.58f

    .line 465
    .line 466
    .line 467
    const v14, 0x41abae14    # 21.46f

    .line 468
    .line 469
    .line 470
    const v15, 0x4186e148    # 16.86f

    .line 471
    .line 472
    .line 473
    const/high16 v16, 0x41b00000    # 22.0f

    .line 474
    .line 475
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const/high16 v17, -0x40000000    # -2.0f

    .line 479
    .line 480
    const/high16 v18, -0x40000000    # -2.0f

    .line 481
    .line 482
    const v13, -0x40733333    # -1.1f

    .line 483
    .line 484
    .line 485
    const/4 v14, 0x0

    .line 486
    const/high16 v15, -0x40000000    # -2.0f

    .line 487
    .line 488
    const v16, -0x4099999a    # -0.9f

    .line 489
    .line 490
    .line 491
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const v17, 0x3fa66666    # 1.3f

    .line 495
    .line 496
    .line 497
    const v18, -0x4010a3d7    # -1.87f

    .line 498
    .line 499
    .line 500
    const/4 v13, 0x0

    .line 501
    const v14, -0x40a3d70a    # -0.86f

    .line 502
    .line 503
    .line 504
    const v15, 0x3f0a3d71    # 0.54f

    .line 505
    .line 506
    .line 507
    const v16, -0x4035c28f    # -1.58f

    .line 508
    .line 509
    .line 510
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v0, 0x4162b852    # 14.17f

    .line 514
    .line 515
    .line 516
    const/high16 v2, 0x41880000    # 17.0f

    .line 517
    .line 518
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v0, 0x40edc28f    # 7.43f

    .line 522
    .line 523
    .line 524
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const v17, -0x40bd70a4    # -0.76f

    .line 528
    .line 529
    .line 530
    const v18, -0x402ccccd    # -1.65f

    .line 531
    .line 532
    .line 533
    const v13, -0x40a66666    # -0.85f

    .line 534
    .line 535
    .line 536
    const/4 v14, 0x0

    .line 537
    const v15, -0x405851ec    # -1.31f

    .line 538
    .line 539
    .line 540
    const/high16 v16, -0x40800000    # -1.0f

    .line 541
    .line 542
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const v0, 0x402c28f6    # 2.69f

    .line 546
    .line 547
    .line 548
    const v2, -0x3fb5c28f    # -3.16f

    .line 549
    .line 550
    .line 551
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const v0, 0x3fb1eb85    # 1.39f

    .line 555
    .line 556
    .line 557
    const v2, 0x40870a3d    # 4.22f

    .line 558
    .line 559
    .line 560
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const v0, 0x3fb47ae1    # 1.41f

    .line 564
    .line 565
    .line 566
    const v2, -0x404b851f    # -1.41f

    .line 567
    .line 568
    .line 569
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const v0, 0x40fb851f    # 7.86f

    .line 573
    .line 574
    .line 575
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const v0, 0x3fb5c28f    # 1.42f

    .line 579
    .line 580
    .line 581
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const/4 v0, 0x0

    .line 585
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const v0, 0x4111c28f    # 9.11f

    .line 589
    .line 590
    .line 591
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const v0, 0x41b4e148    # 22.61f

    .line 595
    .line 596
    .line 597
    const v2, 0x419e3d71    # 19.78f

    .line 598
    .line 599
    .line 600
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const v0, 0x4142b852    # 12.17f

    .line 607
    .line 608
    .line 609
    const/high16 v2, 0x41700000    # 15.0f

    .line 610
    .line 611
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const v0, -0x404e147b    # -1.39f

    .line 615
    .line 616
    .line 617
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const v0, 0x4119999a    # 9.6f

    .line 621
    .line 622
    .line 623
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const v0, 0x4142b852    # 12.17f

    .line 627
    .line 628
    .line 629
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const/high16 v0, 0x41200000    # 10.0f

    .line 636
    .line 637
    const/high16 v2, 0x40a00000    # 5.0f

    .line 638
    .line 639
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const v17, 0x3f5c28f6    # 0.86f

    .line 643
    .line 644
    .line 645
    const v18, 0x3d4ccccd    # 0.05f

    .line 646
    .line 647
    .line 648
    const v13, 0x3e947ae1    # 0.29f

    .line 649
    .line 650
    .line 651
    const v15, 0x3f147ae1    # 0.58f

    .line 652
    .line 653
    .line 654
    const v16, 0x3ca3d70a    # 0.02f

    .line 655
    .line 656
    .line 657
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const v0, 0x40d570a4    # 6.67f

    .line 661
    .line 662
    .line 663
    const v2, 0x4117d70a    # 9.49f

    .line 664
    .line 665
    .line 666
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const v0, 0x3fb5c28f    # 1.42f

    .line 670
    .line 671
    .line 672
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    const v0, 0x4164cccd    # 14.3f

    .line 676
    .line 677
    .line 678
    const v2, 0x40833333    # 4.1f

    .line 679
    .line 680
    .line 681
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const/high16 v17, 0x41200000    # 10.0f

    .line 685
    .line 686
    const/high16 v18, 0x40400000    # 3.0f

    .line 687
    .line 688
    const v13, 0x41507ae1    # 13.03f

    .line 689
    .line 690
    .line 691
    const v14, 0x4059999a    # 3.4f

    .line 692
    .line 693
    .line 694
    const v15, 0x4138f5c3    # 11.56f

    .line 695
    .line 696
    .line 697
    const/high16 v16, 0x40400000    # 3.0f

    .line 698
    .line 699
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    const v17, 0x40d0f5c3    # 6.53f

    .line 703
    .line 704
    .line 705
    const v18, 0x406ccccd    # 3.7f

    .line 706
    .line 707
    .line 708
    const v13, 0x410c51ec    # 8.77f

    .line 709
    .line 710
    .line 711
    const/high16 v14, 0x40400000    # 3.0f

    .line 712
    .line 713
    const v15, 0x40f33333    # 7.6f

    .line 714
    .line 715
    .line 716
    const/high16 v16, 0x40500000    # 3.25f

    .line 717
    .line 718
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    const v0, 0x40a8a3d7    # 5.27f

    .line 722
    .line 723
    .line 724
    const v2, 0x4101999a    # 8.1f

    .line 725
    .line 726
    .line 727
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    const/high16 v17, 0x41200000    # 10.0f

    .line 731
    .line 732
    const/high16 v18, 0x40a00000    # 5.0f

    .line 733
    .line 734
    const v13, 0x410b5c29    # 8.71f

    .line 735
    .line 736
    .line 737
    const v14, 0x40a33333    # 5.1f

    .line 738
    .line 739
    .line 740
    const v15, 0x4115999a    # 9.35f

    .line 741
    .line 742
    .line 743
    const/high16 v16, 0x40a00000    # 5.0f

    .line 744
    .line 745
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 746
    .line 747
    .line 748
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 749
    .line 750
    .line 751
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 752
    .line 753
    .line 754
    move-result-object v2

    .line 755
    const/16 v16, 0x3800

    .line 756
    .line 757
    const/16 v17, 0x0

    .line 758
    .line 759
    const/high16 v6, 0x3f800000    # 1.0f

    .line 760
    .line 761
    const/high16 v8, 0x3f800000    # 1.0f

    .line 762
    .line 763
    const/4 v7, 0x0

    .line 764
    const/high16 v12, 0x3f800000    # 1.0f

    .line 765
    .line 766
    const/4 v13, 0x0

    .line 767
    const/4 v14, 0x0

    .line 768
    const/4 v15, 0x0

    .line 769
    const-string v4, ""

    .line 770
    .line 771
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 772
    .line 773
    .line 774
    move-result-object v0

    .line 775
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 776
    .line 777
    .line 778
    move-result-object v0

    .line 779
    sput-object v0, Landroidx/compose/material/icons/twotone/NoStrollerKt;->_noStroller:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 780
    .line 781
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 782
    .line 783
    .line 784
    return-object v0
.end method
