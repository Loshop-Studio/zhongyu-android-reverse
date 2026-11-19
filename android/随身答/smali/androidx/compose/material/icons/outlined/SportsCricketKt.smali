.class public final Landroidx/compose/material/icons/outlined/SportsCricketKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_sportsCricket",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SportsCricket",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getSportsCricket",
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
        "SMAP\nSportsCricket.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportsCricket.kt\nandroidx/compose/material/icons/outlined/SportsCricketKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,76:1\n212#2,12:77\n233#2,18:90\n253#2:127\n233#2,18:128\n253#2:165\n233#2,18:166\n253#2:203\n174#3:89\n705#4,2:108\n717#4,2:110\n719#4,11:116\n705#4,2:146\n717#4,2:148\n719#4,11:154\n705#4,2:184\n717#4,2:186\n719#4,11:192\n72#5,4:112\n72#5,4:150\n72#5,4:188\n*S KotlinDebug\n*F\n+ 1 SportsCricket.kt\nandroidx/compose/material/icons/outlined/SportsCricketKt\n*L\n29#1:77,12\n30#1:90,18\n30#1:127\n50#1:128,18\n50#1:165\n57#1:166,18\n57#1:203\n29#1:89\n30#1:108,2\n30#1:110,2\n30#1:116,11\n50#1:146,2\n50#1:148,2\n50#1:154,11\n57#1:184,2\n57#1:186,2\n57#1:192,11\n30#1:112,4\n50#1:150,4\n57#1:188,4\n*E\n"
    }
.end annotation


# static fields
.field private static _sportsCricket:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSportsCricket(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/SportsCricketKt;->_sportsCricket:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.SportsCricket"

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
    const v4, 0x4170a3d7    # 15.04f

    .line 71
    .line 72
    .line 73
    const v6, 0x414ca3d7    # 12.79f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v4, -0x3ef80000    # -8.5f

    .line 80
    .line 81
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const v25, 0x40ba8f5c    # 5.83f

    .line 85
    .line 86
    .line 87
    const/high16 v26, 0x40800000    # 4.0f

    .line 88
    .line 89
    const v21, 0x40cb3333    # 6.35f

    .line 90
    .line 91
    .line 92
    const v22, 0x40833333    # 4.1f

    .line 93
    .line 94
    .line 95
    const v23, 0x40c2e148    # 6.09f

    .line 96
    .line 97
    .line 98
    const/high16 v24, 0x40800000    # 4.0f

    .line 99
    .line 100
    move-object/from16 v20, v2

    .line 101
    .line 102
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v4, 0x40a428f6    # 5.13f

    .line 106
    .line 107
    .line 108
    const v6, 0x408947ae    # 4.29f

    .line 109
    .line 110
    .line 111
    const v7, 0x40aa3d71    # 5.32f

    .line 112
    .line 113
    .line 114
    const v8, 0x40833333    # 4.1f

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v4, 0x40128f5c    # 2.29f

    .line 121
    .line 122
    .line 123
    const v6, 0x40e428f6    # 7.13f

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/16 v25, 0x0

    .line 130
    .line 131
    const v26, 0x3fb5c28f    # 1.42f

    .line 132
    .line 133
    .line 134
    const v21, -0x413851ec    # -0.39f

    .line 135
    .line 136
    .line 137
    const v22, 0x3ec7ae14    # 0.39f

    .line 138
    .line 139
    .line 140
    const v23, -0x413851ec    # -0.39f

    .line 141
    .line 142
    .line 143
    const v24, 0x3f83d70a    # 1.03f

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v4, 0x41080000    # 8.5f

    .line 150
    .line 151
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v25, 0x3f35c28f    # 0.71f

    .line 155
    .line 156
    .line 157
    const v26, 0x3e947ae1    # 0.29f

    .line 158
    .line 159
    .line 160
    const v21, 0x3e4ccccd    # 0.2f

    .line 161
    .line 162
    .line 163
    const v22, 0x3e4ccccd    # 0.2f

    .line 164
    .line 165
    .line 166
    const v23, 0x3ee66666    # 0.45f

    .line 167
    .line 168
    .line 169
    const v24, 0x3e947ae1    # 0.29f

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v26, -0x416b851f    # -0.29f

    .line 176
    .line 177
    .line 178
    const v21, 0x3e851eb8    # 0.26f

    .line 179
    .line 180
    .line 181
    const/16 v22, 0x0

    .line 182
    .line 183
    const v23, 0x3f028f5c    # 0.51f

    .line 184
    .line 185
    .line 186
    const v24, -0x42333333    # -0.1f

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v4, 0x40351eb8    # 2.83f

    .line 193
    .line 194
    .line 195
    const v6, -0x3fcae148    # -2.83f

    .line 196
    .line 197
    .line 198
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v25, 0x4170a3d7    # 15.04f

    .line 202
    .line 203
    .line 204
    const v26, 0x414ca3d7    # 12.79f

    .line 205
    .line 206
    .line 207
    const v21, 0x4176e148    # 15.43f

    .line 208
    .line 209
    .line 210
    const v22, 0x415d1eb8    # 13.82f

    .line 211
    .line 212
    .line 213
    const v23, 0x4176e148    # 15.43f

    .line 214
    .line 215
    .line 216
    const v24, 0x4152e148    # 13.18f

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v4, 0x416eb852    # 14.92f

    .line 226
    .line 227
    .line 228
    const/high16 v6, 0x41380000    # 11.5f

    .line 229
    .line 230
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v4, 0x408d1eb8    # 4.41f

    .line 234
    .line 235
    .line 236
    const v6, 0x40fa8f5c    # 7.83f

    .line 237
    .line 238
    .line 239
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const v4, 0x3fb5c28f    # 1.42f

    .line 243
    .line 244
    .line 245
    const v6, -0x404a3d71    # -1.42f

    .line 246
    .line 247
    .line 248
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v4, 0x40e2e148    # 7.09f

    .line 252
    .line 253
    .line 254
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v4, 0x416eb852    # 14.92f

    .line 258
    .line 259
    .line 260
    const/high16 v6, 0x41380000    # 11.5f

    .line 261
    .line 262
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 269
    .line 270
    .line 271
    move-result-object v2

    .line 272
    const/16 v16, 0x3800

    .line 273
    .line 274
    const/16 v17, 0x0

    .line 275
    .line 276
    const/high16 v6, 0x3f800000    # 1.0f

    .line 277
    .line 278
    const/high16 v8, 0x3f800000    # 1.0f

    .line 279
    .line 280
    const/4 v7, 0x0

    .line 281
    const/high16 v9, 0x3f800000    # 1.0f

    .line 282
    .line 283
    const/high16 v12, 0x3f800000    # 1.0f

    .line 284
    .line 285
    const/4 v13, 0x0

    .line 286
    const/4 v14, 0x0

    .line 287
    const/4 v15, 0x0

    .line 288
    const-string v4, ""

    .line 289
    .line 290
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 291
    .line 292
    .line 293
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 294
    .line 295
    .line 296
    move-result v3

    .line 297
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 298
    .line 299
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 300
    .line 301
    .line 302
    move-result-wide v6

    .line 303
    const/4 v2, 0x0

    .line 304
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 308
    .line 309
    .line 310
    move-result v10

    .line 311
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 312
    .line 313
    .line 314
    move-result v11

    .line 315
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 318
    .line 319
    .line 320
    const v4, 0x416574bc    # 14.341f

    .line 321
    .line 322
    .line 323
    const v6, 0x418e0c4a    # 17.756f

    .line 324
    .line 325
    .line 326
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v4, -0x404b020c    # -1.414f

    .line 330
    .line 331
    .line 332
    const v6, 0x3fb4fdf4    # 1.414f

    .line 333
    .line 334
    .line 335
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v4, 0x4087c6a8    # 4.243f

    .line 339
    .line 340
    .line 341
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v4, -0x404b020c    # -1.414f

    .line 345
    .line 346
    .line 347
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 354
    .line 355
    .line 356
    move-result-object v2

    .line 357
    const/high16 v6, 0x3f800000    # 1.0f

    .line 358
    .line 359
    const/4 v7, 0x0

    .line 360
    const-string v4, ""

    .line 361
    .line 362
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 363
    .line 364
    .line 365
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 366
    .line 367
    .line 368
    move-result v3

    .line 369
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 370
    .line 371
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 372
    .line 373
    .line 374
    move-result-wide v6

    .line 375
    const/4 v0, 0x0

    .line 376
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 377
    .line 378
    .line 379
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 380
    .line 381
    .line 382
    move-result v10

    .line 383
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 384
    .line 385
    .line 386
    move-result v11

    .line 387
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 390
    .line 391
    .line 392
    const/high16 v0, 0x40000000    # 2.0f

    .line 393
    .line 394
    const/high16 v2, 0x41940000    # 18.5f

    .line 395
    .line 396
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const/high16 v17, 0x41700000    # 15.0f

    .line 400
    .line 401
    const/high16 v18, 0x40b00000    # 5.5f

    .line 402
    .line 403
    const v13, 0x41848f5c    # 16.57f

    .line 404
    .line 405
    .line 406
    const/high16 v14, 0x40000000    # 2.0f

    .line 407
    .line 408
    const/high16 v15, 0x41700000    # 15.0f

    .line 409
    .line 410
    const v16, 0x40647ae1    # 3.57f

    .line 411
    .line 412
    .line 413
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const/high16 v17, 0x41940000    # 18.5f

    .line 417
    .line 418
    const/high16 v18, 0x41100000    # 9.0f

    .line 419
    .line 420
    const/high16 v13, 0x41700000    # 15.0f

    .line 421
    .line 422
    const v14, 0x40edc28f    # 7.43f

    .line 423
    .line 424
    .line 425
    const v15, 0x41848f5c    # 16.57f

    .line 426
    .line 427
    .line 428
    const/high16 v16, 0x41100000    # 9.0f

    .line 429
    .line 430
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v0, 0x40edc28f    # 7.43f

    .line 434
    .line 435
    .line 436
    const/high16 v2, 0x40b00000    # 5.5f

    .line 437
    .line 438
    const/high16 v4, 0x41b00000    # 22.0f

    .line 439
    .line 440
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const/high16 v18, 0x40000000    # 2.0f

    .line 444
    .line 445
    const/high16 v13, 0x41b00000    # 22.0f

    .line 446
    .line 447
    const v14, 0x40647ae1    # 3.57f

    .line 448
    .line 449
    .line 450
    const v15, 0x41a370a4    # 20.43f

    .line 451
    .line 452
    .line 453
    const/high16 v16, 0x40000000    # 2.0f

    .line 454
    .line 455
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const/high16 v0, 0x40e00000    # 7.0f

    .line 462
    .line 463
    const/high16 v2, 0x41940000    # 18.5f

    .line 464
    .line 465
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const/high16 v17, 0x41880000    # 17.0f

    .line 469
    .line 470
    const/high16 v18, 0x40b00000    # 5.5f

    .line 471
    .line 472
    const v13, 0x418d5c29    # 17.67f

    .line 473
    .line 474
    .line 475
    const/high16 v14, 0x40e00000    # 7.0f

    .line 476
    .line 477
    const/high16 v15, 0x41880000    # 17.0f

    .line 478
    .line 479
    const v16, 0x40ca8f5c    # 6.33f

    .line 480
    .line 481
    .line 482
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v0, 0x418d5c29    # 17.67f

    .line 486
    .line 487
    .line 488
    const/high16 v2, 0x40800000    # 4.0f

    .line 489
    .line 490
    const/high16 v4, 0x41940000    # 18.5f

    .line 491
    .line 492
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const v0, 0x409570a4    # 4.67f

    .line 496
    .line 497
    .line 498
    const/high16 v2, 0x41a00000    # 20.0f

    .line 499
    .line 500
    const/high16 v4, 0x40b00000    # 5.5f

    .line 501
    .line 502
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const v0, 0x419aa3d7    # 19.33f

    .line 506
    .line 507
    .line 508
    const/high16 v2, 0x40e00000    # 7.0f

    .line 509
    .line 510
    const/high16 v4, 0x41940000    # 18.5f

    .line 511
    .line 512
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 519
    .line 520
    .line 521
    move-result-object v2

    .line 522
    const/16 v16, 0x3800

    .line 523
    .line 524
    const/16 v17, 0x0

    .line 525
    .line 526
    const/high16 v6, 0x3f800000    # 1.0f

    .line 527
    .line 528
    const/4 v7, 0x0

    .line 529
    const/high16 v12, 0x3f800000    # 1.0f

    .line 530
    .line 531
    const/4 v13, 0x0

    .line 532
    const/4 v14, 0x0

    .line 533
    const/4 v15, 0x0

    .line 534
    const-string v4, ""

    .line 535
    .line 536
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    sput-object v0, Landroidx/compose/material/icons/outlined/SportsCricketKt;->_sportsCricket:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 545
    .line 546
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 547
    .line 548
    .line 549
    return-object v0
.end method
