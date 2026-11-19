.class public final Landroidx/compose/material/icons/twotone/FavoriteBorderKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_favoriteBorder",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "FavoriteBorder",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getFavoriteBorder",
        "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;",
        "material-icons-core_release"
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
        "SMAP\nFavoriteBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavoriteBorder.kt\nandroidx/compose/material/icons/twotone/FavoriteBorderKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,58:1\n122#2:59\n116#2,3:60\n119#2,3:64\n132#2,18:67\n152#2:104\n175#3:63\n694#4,2:85\n706#4,2:87\n708#4,11:93\n53#5,4:89\n*S KotlinDebug\n*F\n+ 1 FavoriteBorder.kt\nandroidx/compose/material/icons/twotone/FavoriteBorderKt\n*L\n29#1:59\n29#1:60,3\n29#1:64,3\n30#1:67,18\n30#1:104\n29#1:63\n30#1:85,2\n30#1:87,2\n30#1:93,11\n30#1:89,4\n*E\n"
    }
.end annotation


# static fields
.field private static _favoriteBorder:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFavoriteBorder(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 30

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Landroidx/compose/material/icons/twotone/FavoriteBorderKt;->_favoriteBorder:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    const-string v2, "TwoTone.FavoriteBorder"

    .line 17
    .line 18
    new-instance v1, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 19
    .line 20
    move-object v13, v1

    .line 21
    const/high16 v0, 0x41c00000    # 24.0f

    .line 22
    .line 23
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    const/high16 v5, 0x41c00000    # 24.0f

    .line 32
    .line 33
    const/high16 v6, 0x41c00000    # 24.0f

    .line 34
    .line 35
    const-wide/16 v7, 0x0

    .line 36
    .line 37
    const/4 v9, 0x0

    .line 38
    const/4 v10, 0x0

    .line 39
    const/16 v11, 0xe0

    .line 40
    .line 41
    const/4 v12, 0x0

    .line 42
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 43
    .line 44
    .line 45
    const/high16 v18, 0x3f800000    # 1.0f

    .line 46
    .line 47
    const/high16 v20, 0x3f800000    # 1.0f

    .line 48
    .line 49
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 50
    .line 51
    .line 52
    move-result v15

    .line 53
    new-instance v0, Landroidx/compose/ui/graphics/SolidColor;

    .line 54
    .line 55
    move-object/from16 v17, v0

    .line 56
    .line 57
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 58
    .line 59
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 60
    .line 61
    .line 62
    move-result-wide v1

    .line 63
    const/4 v3, 0x0

    .line 64
    invoke-direct {v0, v1, v2, v3}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 65
    .line 66
    .line 67
    const/16 v19, 0x0

    .line 68
    .line 69
    const/high16 v21, 0x3f800000    # 1.0f

    .line 70
    .line 71
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 72
    .line 73
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 74
    .line 75
    .line 76
    move-result v22

    .line 77
    sget-object v0, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 78
    .line 79
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 80
    .line 81
    .line 82
    move-result v23

    .line 83
    const/high16 v24, 0x3f800000    # 1.0f

    .line 84
    .line 85
    const-string v16, ""

    .line 86
    .line 87
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    invoke-direct {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    const/high16 v0, 0x41840000    # 16.5f

    .line 93
    .line 94
    const/high16 v1, 0x40400000    # 3.0f

    .line 95
    .line 96
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v1, -0x402147ae    # -1.74f

    .line 100
    .line 101
    .line 102
    const/4 v2, 0x0

    .line 103
    const v3, -0x3fa5c28f    # -3.41f

    .line 104
    .line 105
    .line 106
    const v4, 0x3f4f5c29    # 0.81f

    .line 107
    .line 108
    .line 109
    const/high16 v5, -0x3f700000    # -4.5f

    .line 110
    .line 111
    const v6, 0x4005c28f    # 2.09f

    .line 112
    .line 113
    .line 114
    move-object v0, v7

    .line 115
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v1, 0x412e8f5c    # 10.91f

    .line 119
    .line 120
    .line 121
    const v2, 0x4073d70a    # 3.81f

    .line 122
    .line 123
    .line 124
    const v3, 0x4113d70a    # 9.24f

    .line 125
    .line 126
    .line 127
    const/high16 v4, 0x40400000    # 3.0f

    .line 128
    .line 129
    const/high16 v5, 0x40f00000    # 7.5f

    .line 130
    .line 131
    const/high16 v6, 0x40400000    # 3.0f

    .line 132
    .line 133
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v1, 0x408d70a4    # 4.42f

    .line 137
    .line 138
    .line 139
    const/high16 v2, 0x40400000    # 3.0f

    .line 140
    .line 141
    const/high16 v3, 0x40000000    # 2.0f

    .line 142
    .line 143
    const v4, 0x40ad70a4    # 5.42f

    .line 144
    .line 145
    .line 146
    const/high16 v5, 0x40000000    # 2.0f

    .line 147
    .line 148
    const/high16 v6, 0x41080000    # 8.5f

    .line 149
    .line 150
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/4 v1, 0x0

    .line 154
    const v2, 0x4071eb85    # 3.78f

    .line 155
    .line 156
    .line 157
    const v3, 0x4059999a    # 3.4f

    .line 158
    .line 159
    .line 160
    const v4, 0x40db851f    # 6.86f

    .line 161
    .line 162
    .line 163
    const v5, 0x4108cccd    # 8.55f

    .line 164
    .line 165
    .line 166
    const v6, 0x4138a3d7    # 11.54f

    .line 167
    .line 168
    .line 169
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v0, 0x41400000    # 12.0f

    .line 173
    .line 174
    const v1, 0x41aacccd    # 21.35f

    .line 175
    .line 176
    .line 177
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v0, 0x3fb9999a    # 1.45f

    .line 181
    .line 182
    .line 183
    const v1, -0x40570a3d    # -1.32f

    .line 184
    .line 185
    .line 186
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v1, 0x4194cccd    # 18.6f

    .line 190
    .line 191
    .line 192
    const v2, 0x4175c28f    # 15.36f

    .line 193
    .line 194
    .line 195
    const/high16 v3, 0x41b00000    # 22.0f

    .line 196
    .line 197
    const v4, 0x41447ae1    # 12.28f

    .line 198
    .line 199
    .line 200
    const/high16 v5, 0x41b00000    # 22.0f

    .line 201
    .line 202
    const/high16 v6, 0x41080000    # 8.5f

    .line 203
    .line 204
    move-object v0, v7

    .line 205
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v1, 0x41b00000    # 22.0f

    .line 209
    .line 210
    const v2, 0x40ad70a4    # 5.42f

    .line 211
    .line 212
    .line 213
    const v3, 0x419ca3d7    # 19.58f

    .line 214
    .line 215
    .line 216
    const/high16 v4, 0x40400000    # 3.0f

    .line 217
    .line 218
    const/high16 v5, 0x41840000    # 16.5f

    .line 219
    .line 220
    const/high16 v6, 0x40400000    # 3.0f

    .line 221
    .line 222
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v0, 0x4141999a    # 12.1f

    .line 229
    .line 230
    .line 231
    const v1, 0x41946666    # 18.55f

    .line 232
    .line 233
    .line 234
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v0, 0x3dcccccd    # 0.1f

    .line 238
    .line 239
    .line 240
    const v1, -0x42333333    # -0.1f

    .line 241
    .line 242
    .line 243
    invoke-virtual {v7, v1, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v7, v1, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v1, 0x40e47ae1    # 7.14f

    .line 250
    .line 251
    .line 252
    const v2, 0x4163d70a    # 14.24f

    .line 253
    .line 254
    .line 255
    const/high16 v3, 0x40800000    # 4.0f

    .line 256
    .line 257
    const v4, 0x41363d71    # 11.39f

    .line 258
    .line 259
    .line 260
    const/high16 v5, 0x40800000    # 4.0f

    .line 261
    .line 262
    const/high16 v6, 0x41080000    # 8.5f

    .line 263
    .line 264
    move-object v0, v7

    .line 265
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v1, 0x40800000    # 4.0f

    .line 269
    .line 270
    const/high16 v2, 0x40d00000    # 6.5f

    .line 271
    .line 272
    const/high16 v3, 0x40b00000    # 5.5f

    .line 273
    .line 274
    const/high16 v4, 0x40a00000    # 5.0f

    .line 275
    .line 276
    const/high16 v5, 0x40f00000    # 7.5f

    .line 277
    .line 278
    const/high16 v6, 0x40a00000    # 5.0f

    .line 279
    .line 280
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v1, 0x3fc51eb8    # 1.54f

    .line 284
    .line 285
    .line 286
    const/4 v2, 0x0

    .line 287
    const v3, 0x40428f5c    # 3.04f

    .line 288
    .line 289
    .line 290
    const v4, 0x3f7d70a4    # 0.99f

    .line 291
    .line 292
    .line 293
    const v5, 0x40647ae1    # 3.57f

    .line 294
    .line 295
    .line 296
    const v6, 0x40170a3d    # 2.36f

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v0, 0x3fef5c29    # 1.87f

    .line 303
    .line 304
    .line 305
    invoke-virtual {v7, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v1, 0x41575c29    # 13.46f

    .line 309
    .line 310
    .line 311
    const v2, 0x40bfae14    # 5.99f

    .line 312
    .line 313
    .line 314
    const v3, 0x416f5c29    # 14.96f

    .line 315
    .line 316
    .line 317
    const/high16 v4, 0x40a00000    # 5.0f

    .line 318
    .line 319
    const/high16 v5, 0x41840000    # 16.5f

    .line 320
    .line 321
    const/high16 v6, 0x40a00000    # 5.0f

    .line 322
    .line 323
    move-object v0, v7

    .line 324
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v1, 0x40000000    # 2.0f

    .line 328
    .line 329
    const/4 v2, 0x0

    .line 330
    const/high16 v3, 0x40600000    # 3.5f

    .line 331
    .line 332
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 333
    .line 334
    const/high16 v5, 0x40600000    # 3.5f

    .line 335
    .line 336
    const/high16 v6, 0x40600000    # 3.5f

    .line 337
    .line 338
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const/4 v1, 0x0

    .line 342
    const v2, 0x4038f5c3    # 2.89f

    .line 343
    .line 344
    .line 345
    const v3, -0x3fb70a3d    # -3.14f

    .line 346
    .line 347
    .line 348
    const v4, 0x40b7ae14    # 5.74f

    .line 349
    .line 350
    .line 351
    const v5, -0x3f033333    # -7.9f

    .line 352
    .line 353
    .line 354
    const v6, 0x4120cccd    # 10.05f

    .line 355
    .line 356
    .line 357
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 364
    .line 365
    .line 366
    move-result-object v14

    .line 367
    const/16 v25, 0x0

    .line 368
    .line 369
    const/16 v26, 0x0

    .line 370
    .line 371
    const/16 v27, 0x0

    .line 372
    .line 373
    const/16 v28, 0x3800

    .line 374
    .line 375
    const/16 v29, 0x0

    .line 376
    .line 377
    invoke-static/range {v13 .. v29}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    sput-object v0, Landroidx/compose/material/icons/twotone/FavoriteBorderKt;->_favoriteBorder:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 386
    .line 387
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 388
    .line 389
    .line 390
    return-object v0
.end method
