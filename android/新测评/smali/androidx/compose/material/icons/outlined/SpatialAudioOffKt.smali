.class public final Landroidx/compose/material/icons/outlined/SpatialAudioOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_spatialAudioOff",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SpatialAudioOff",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getSpatialAudioOff",
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
        "SMAP\nSpatialAudioOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpatialAudioOff.kt\nandroidx/compose/material/icons/outlined/SpatialAudioOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,85:1\n212#2,12:86\n233#2,18:99\n253#2:136\n233#2,18:137\n253#2:174\n233#2,18:175\n253#2:212\n233#2,18:213\n253#2:250\n174#3:98\n705#4,2:117\n717#4,2:119\n719#4,11:125\n705#4,2:155\n717#4,2:157\n719#4,11:163\n705#4,2:193\n717#4,2:195\n719#4,11:201\n705#4,2:231\n717#4,2:233\n719#4,11:239\n72#5,4:121\n72#5,4:159\n72#5,4:197\n72#5,4:235\n*S KotlinDebug\n*F\n+ 1 SpatialAudioOff.kt\nandroidx/compose/material/icons/outlined/SpatialAudioOffKt\n*L\n29#1:86,12\n30#1:99,18\n30#1:136\n44#1:137,18\n44#1:174\n64#1:175,18\n64#1:212\n72#1:213,18\n72#1:250\n29#1:98\n30#1:117,2\n30#1:119,2\n30#1:125,11\n44#1:155,2\n44#1:157,2\n44#1:163,11\n64#1:193,2\n64#1:195,2\n64#1:201,11\n72#1:231,2\n72#1:233,2\n72#1:239,11\n30#1:121,4\n44#1:159,4\n64#1:197,4\n72#1:235,4\n*E\n"
    }
.end annotation


# static fields
.field private static _spatialAudioOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSpatialAudioOff(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/SpatialAudioOffKt;->_spatialAudioOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.SpatialAudioOff"

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
    const/high16 v4, 0x41500000    # 13.0f

    .line 71
    .line 72
    const/high16 v6, 0x41200000    # 10.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x40800000    # 4.0f

    .line 78
    .line 79
    const/high16 v26, -0x3f800000    # -4.0f

    .line 80
    .line 81
    const v21, 0x400d70a4    # 2.21f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, 0x40800000    # 4.0f

    .line 87
    .line 88
    const v24, -0x401ae148    # -1.79f

    .line 89
    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v25, -0x3f800000    # -4.0f

    .line 97
    .line 98
    const/16 v21, 0x0

    .line 99
    .line 100
    const v22, -0x3ff28f5c    # -2.21f

    .line 101
    .line 102
    .line 103
    const v23, -0x401ae148    # -1.79f

    .line 104
    .line 105
    .line 106
    const/high16 v24, -0x3f800000    # -4.0f

    .line 107
    .line 108
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v4, 0x40d947ae    # 6.79f

    .line 112
    .line 113
    .line 114
    const/high16 v6, 0x41100000    # 9.0f

    .line 115
    .line 116
    const/high16 v7, 0x40c00000    # 6.0f

    .line 117
    .line 118
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v25, 0x41200000    # 10.0f

    .line 122
    .line 123
    const/high16 v26, 0x41500000    # 13.0f

    .line 124
    .line 125
    const/high16 v21, 0x40c00000    # 6.0f

    .line 126
    .line 127
    const v22, 0x41335c29    # 11.21f

    .line 128
    .line 129
    .line 130
    const v23, 0x40f947ae    # 7.79f

    .line 131
    .line 132
    .line 133
    const/high16 v24, 0x41500000    # 13.0f

    .line 134
    .line 135
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v4, 0x40e00000    # 7.0f

    .line 142
    .line 143
    const/high16 v6, 0x41200000    # 10.0f

    .line 144
    .line 145
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v25, 0x40000000    # 2.0f

    .line 149
    .line 150
    const/high16 v26, 0x40000000    # 2.0f

    .line 151
    .line 152
    const v21, 0x3f8ccccd    # 1.1f

    .line 153
    .line 154
    .line 155
    const/16 v22, 0x0

    .line 156
    .line 157
    const/high16 v23, 0x40000000    # 2.0f

    .line 158
    .line 159
    const v24, 0x3f666666    # 0.9f

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v25, -0x40000000    # -2.0f

    .line 166
    .line 167
    const/16 v21, 0x0

    .line 168
    .line 169
    const v22, 0x3f8ccccd    # 1.1f

    .line 170
    .line 171
    .line 172
    const v23, -0x4099999a    # -0.9f

    .line 173
    .line 174
    .line 175
    const/high16 v24, 0x40000000    # 2.0f

    .line 176
    .line 177
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v4, -0x4099999a    # -0.9f

    .line 181
    .line 182
    .line 183
    const/high16 v6, -0x40000000    # -2.0f

    .line 184
    .line 185
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v25, 0x41200000    # 10.0f

    .line 189
    .line 190
    const/high16 v26, 0x40e00000    # 7.0f

    .line 191
    .line 192
    const/high16 v21, 0x41000000    # 8.0f

    .line 193
    .line 194
    const v22, 0x40fccccd    # 7.9f

    .line 195
    .line 196
    .line 197
    const v23, 0x410e6666    # 8.9f

    .line 198
    .line 199
    .line 200
    const/high16 v24, 0x40e00000    # 7.0f

    .line 201
    .line 202
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    const/16 v16, 0x3800

    .line 213
    .line 214
    const/16 v17, 0x0

    .line 215
    .line 216
    const/high16 v6, 0x3f800000    # 1.0f

    .line 217
    .line 218
    const/high16 v8, 0x3f800000    # 1.0f

    .line 219
    .line 220
    const/4 v7, 0x0

    .line 221
    const/high16 v9, 0x3f800000    # 1.0f

    .line 222
    .line 223
    const/high16 v12, 0x3f800000    # 1.0f

    .line 224
    .line 225
    const/4 v13, 0x0

    .line 226
    const/4 v14, 0x0

    .line 227
    const/4 v15, 0x0

    .line 228
    const-string v4, ""

    .line 229
    .line 230
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 231
    .line 232
    .line 233
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 234
    .line 235
    .line 236
    move-result v3

    .line 237
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 238
    .line 239
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 240
    .line 241
    .line 242
    move-result-wide v6

    .line 243
    const/4 v2, 0x0

    .line 244
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 248
    .line 249
    .line 250
    move-result v10

    .line 251
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 252
    .line 253
    .line 254
    move-result v11

    .line 255
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 258
    .line 259
    .line 260
    const v4, 0x41831eb8    # 16.39f

    .line 261
    .line 262
    .line 263
    const v6, 0x4178f5c3    # 15.56f

    .line 264
    .line 265
    .line 266
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/high16 v26, 0x41600000    # 14.0f

    .line 270
    .line 271
    const v21, 0x416b5c29    # 14.71f

    .line 272
    .line 273
    .line 274
    const v22, 0x416b3333    # 14.7f

    .line 275
    .line 276
    .line 277
    const v23, 0x41487ae1    # 12.53f

    .line 278
    .line 279
    .line 280
    const/high16 v24, 0x41600000    # 14.0f

    .line 281
    .line 282
    move-object/from16 v20, v2

    .line 283
    .line 284
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const v25, -0x3f33851f    # -6.39f

    .line 288
    .line 289
    .line 290
    const v26, 0x3fc7ae14    # 1.56f

    .line 291
    .line 292
    .line 293
    const v21, -0x3fde147b    # -2.53f

    .line 294
    .line 295
    .line 296
    const/16 v22, 0x0

    .line 297
    .line 298
    const v23, -0x3f6947ae    # -4.71f

    .line 299
    .line 300
    .line 301
    const v24, 0x3f333333    # 0.7f

    .line 302
    .line 303
    .line 304
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/high16 v25, 0x40000000    # 2.0f

    .line 308
    .line 309
    const v26, 0x4191c28f    # 18.22f

    .line 310
    .line 311
    .line 312
    const v21, 0x40270a3d    # 2.61f

    .line 313
    .line 314
    .line 315
    const v22, 0x41808f5c    # 16.07f

    .line 316
    .line 317
    .line 318
    const/high16 v23, 0x40000000    # 2.0f

    .line 319
    .line 320
    const v24, 0x4188cccd    # 17.1f

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v4, 0x41a80000    # 21.0f

    .line 327
    .line 328
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v4, 0x41800000    # 16.0f

    .line 332
    .line 333
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v4, -0x3fce147b    # -2.78f

    .line 337
    .line 338
    .line 339
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v25, 0x41831eb8    # 16.39f

    .line 343
    .line 344
    .line 345
    const v26, 0x4178f5c3    # 15.56f

    .line 346
    .line 347
    .line 348
    const/high16 v21, 0x41900000    # 18.0f

    .line 349
    .line 350
    const v22, 0x4188cccd    # 17.1f

    .line 351
    .line 352
    .line 353
    const v23, 0x418b1eb8    # 17.39f

    .line 354
    .line 355
    .line 356
    const v24, 0x41808f5c    # 16.07f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v4, 0x41980000    # 19.0f

    .line 366
    .line 367
    const/high16 v6, 0x41800000    # 16.0f

    .line 368
    .line 369
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const/high16 v4, 0x40800000    # 4.0f

    .line 373
    .line 374
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const v4, -0x40b851ec    # -0.78f

    .line 378
    .line 379
    .line 380
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v25, 0x3f051eb8    # 0.52f

    .line 384
    .line 385
    .line 386
    const v26, -0x409eb852    # -0.88f

    .line 387
    .line 388
    .line 389
    const/16 v21, 0x0

    .line 390
    .line 391
    const v22, -0x413d70a4    # -0.38f

    .line 392
    .line 393
    .line 394
    const v23, 0x3e4ccccd    # 0.2f

    .line 395
    .line 396
    .line 397
    const v24, -0x40c7ae14    # -0.72f

    .line 398
    .line 399
    .line 400
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const/high16 v25, 0x41200000    # 10.0f

    .line 404
    .line 405
    const/high16 v26, 0x41800000    # 16.0f

    .line 406
    .line 407
    const v21, 0x40b6b852    # 5.71f

    .line 408
    .line 409
    .line 410
    const v22, 0x4185d70a    # 16.73f

    .line 411
    .line 412
    .line 413
    const v23, 0x40f428f6    # 7.63f

    .line 414
    .line 415
    .line 416
    const/high16 v24, 0x41800000    # 16.0f

    .line 417
    .line 418
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v25, 0x40af5c29    # 5.48f

    .line 422
    .line 423
    .line 424
    const v26, 0x3fab851f    # 1.34f

    .line 425
    .line 426
    .line 427
    const v21, 0x4017ae14    # 2.37f

    .line 428
    .line 429
    .line 430
    const/16 v22, 0x0

    .line 431
    .line 432
    const v23, 0x408947ae    # 4.29f

    .line 433
    .line 434
    .line 435
    const v24, 0x3f3ae148    # 0.73f

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v25, 0x41800000    # 16.0f

    .line 442
    .line 443
    const v26, 0x4191c28f    # 18.22f

    .line 444
    .line 445
    .line 446
    const v21, 0x417ccccd    # 15.8f

    .line 447
    .line 448
    .line 449
    const/high16 v22, 0x418c0000    # 17.5f

    .line 450
    .line 451
    const/high16 v23, 0x41800000    # 16.0f

    .line 452
    .line 453
    const v24, 0x418eb852    # 17.84f

    .line 454
    .line 455
    .line 456
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/high16 v4, 0x41980000    # 19.0f

    .line 460
    .line 461
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 468
    .line 469
    .line 470
    move-result-object v2

    .line 471
    const/high16 v6, 0x3f800000    # 1.0f

    .line 472
    .line 473
    const/4 v7, 0x0

    .line 474
    const-string v4, ""

    .line 475
    .line 476
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 477
    .line 478
    .line 479
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 480
    .line 481
    .line 482
    move-result v3

    .line 483
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 484
    .line 485
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 486
    .line 487
    .line 488
    move-result-wide v6

    .line 489
    const/4 v2, 0x0

    .line 490
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 491
    .line 492
    .line 493
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 494
    .line 495
    .line 496
    move-result v10

    .line 497
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 498
    .line 499
    .line 500
    move-result v11

    .line 501
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 504
    .line 505
    .line 506
    const v4, 0x41a2e148    # 20.36f

    .line 507
    .line 508
    .line 509
    const/high16 v6, 0x3f800000    # 1.0f

    .line 510
    .line 511
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const v4, -0x404b851f    # -1.41f

    .line 515
    .line 516
    .line 517
    const v6, 0x3fb47ae1    # 1.41f

    .line 518
    .line 519
    .line 520
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const/16 v25, 0x0

    .line 524
    .line 525
    const v26, 0x411e6666    # 9.9f

    .line 526
    .line 527
    .line 528
    const v21, 0x402eb852    # 2.73f

    .line 529
    .line 530
    .line 531
    const v22, 0x402eb852    # 2.73f

    .line 532
    .line 533
    .line 534
    const v23, 0x402eb852    # 2.73f

    .line 535
    .line 536
    .line 537
    const v24, 0x40e570a4    # 7.17f

    .line 538
    .line 539
    .line 540
    move-object/from16 v20, v2

    .line 541
    .line 542
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const v4, 0x3fb47ae1    # 1.41f

    .line 546
    .line 547
    .line 548
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v25, 0x41a2e148    # 20.36f

    .line 552
    .line 553
    .line 554
    const/high16 v26, 0x3f800000    # 1.0f

    .line 555
    .line 556
    const v21, 0x41bf0a3d    # 23.88f

    .line 557
    .line 558
    .line 559
    const v22, 0x41235c29    # 10.21f

    .line 560
    .line 561
    .line 562
    const v23, 0x41bf0a3d    # 23.88f

    .line 563
    .line 564
    .line 565
    const v24, 0x409051ec    # 4.51f

    .line 566
    .line 567
    .line 568
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 575
    .line 576
    .line 577
    move-result-object v2

    .line 578
    const/high16 v6, 0x3f800000    # 1.0f

    .line 579
    .line 580
    const/4 v7, 0x0

    .line 581
    const-string v4, ""

    .line 582
    .line 583
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 584
    .line 585
    .line 586
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 587
    .line 588
    .line 589
    move-result v3

    .line 590
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 591
    .line 592
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 593
    .line 594
    .line 595
    move-result-wide v6

    .line 596
    const/4 v0, 0x0

    .line 597
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 598
    .line 599
    .line 600
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 601
    .line 602
    .line 603
    move-result v10

    .line 604
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 605
    .line 606
    .line 607
    move-result v11

    .line 608
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 611
    .line 612
    .line 613
    const v0, 0x412e6666    # 10.9f

    .line 614
    .line 615
    .line 616
    const v2, 0x418c51ec    # 17.54f

    .line 617
    .line 618
    .line 619
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const/16 v17, 0x0

    .line 623
    .line 624
    const v18, -0x3f1dc28f    # -7.07f

    .line 625
    .line 626
    .line 627
    const v13, 0x3ff9999a    # 1.95f

    .line 628
    .line 629
    .line 630
    const v14, -0x40066666    # -1.95f

    .line 631
    .line 632
    .line 633
    const v15, 0x3ff9999a    # 1.95f

    .line 634
    .line 635
    .line 636
    const v16, -0x3f5c28f6    # -5.12f

    .line 637
    .line 638
    .line 639
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const v0, -0x404b851f    # -1.41f

    .line 643
    .line 644
    .line 645
    const v2, 0x3fb47ae1    # 1.41f

    .line 646
    .line 647
    .line 648
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    const v18, 0x4087ae14    # 4.24f

    .line 652
    .line 653
    .line 654
    const v13, 0x3f95c28f    # 1.17f

    .line 655
    .line 656
    .line 657
    const v14, 0x3f95c28f    # 1.17f

    .line 658
    .line 659
    .line 660
    const v15, 0x3f95c28f    # 1.17f

    .line 661
    .line 662
    .line 663
    const v16, 0x40447ae1    # 3.07f

    .line 664
    .line 665
    .line 666
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const v0, 0x412e6666    # 10.9f

    .line 670
    .line 671
    .line 672
    const v2, 0x418c51ec    # 17.54f

    .line 673
    .line 674
    .line 675
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 682
    .line 683
    .line 684
    move-result-object v2

    .line 685
    const/16 v16, 0x3800

    .line 686
    .line 687
    const/16 v17, 0x0

    .line 688
    .line 689
    const/high16 v6, 0x3f800000    # 1.0f

    .line 690
    .line 691
    const/4 v7, 0x0

    .line 692
    const/high16 v12, 0x3f800000    # 1.0f

    .line 693
    .line 694
    const/4 v13, 0x0

    .line 695
    const/4 v14, 0x0

    .line 696
    const/4 v15, 0x0

    .line 697
    const-string v4, ""

    .line 698
    .line 699
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 700
    .line 701
    .line 702
    move-result-object v0

    .line 703
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 704
    .line 705
    .line 706
    move-result-object v0

    .line 707
    sput-object v0, Landroidx/compose/material/icons/outlined/SpatialAudioOffKt;->_spatialAudioOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 708
    .line 709
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 710
    .line 711
    .line 712
    return-object v0
.end method
