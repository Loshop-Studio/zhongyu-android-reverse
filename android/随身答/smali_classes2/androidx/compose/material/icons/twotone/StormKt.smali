.class public final Landroidx/compose/material/icons/twotone/StormKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_storm",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Storm",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getStorm",
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
        "SMAP\nStorm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Storm.kt\nandroidx/compose/material/icons/twotone/StormKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,94:1\n212#2,12:95\n233#2,18:108\n253#2:145\n233#2,18:146\n253#2:183\n233#2,18:184\n253#2:221\n233#2,18:222\n253#2:259\n174#3:107\n705#4,2:126\n717#4,2:128\n719#4,11:134\n705#4,2:164\n717#4,2:166\n719#4,11:172\n705#4,2:202\n717#4,2:204\n719#4,11:210\n705#4,2:240\n717#4,2:242\n719#4,11:248\n72#5,4:130\n72#5,4:168\n72#5,4:206\n72#5,4:244\n*S KotlinDebug\n*F\n+ 1 Storm.kt\nandroidx/compose/material/icons/twotone/StormKt\n*L\n29#1:95,12\n30#1:108,18\n30#1:145\n36#1:146,18\n36#1:183\n52#1:184,18\n52#1:221\n66#1:222,18\n66#1:259\n29#1:107\n30#1:126,2\n30#1:128,2\n30#1:134,11\n36#1:164,2\n36#1:166,2\n36#1:172,11\n52#1:202,2\n52#1:204,2\n52#1:210,11\n66#1:240,2\n66#1:242,2\n66#1:248,11\n30#1:130,4\n36#1:168,4\n52#1:206,4\n66#1:244,4\n*E\n"
    }
.end annotation


# static fields
.field private static _storm:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getStorm(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/StormKt;->_storm:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Storm"

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
    const/high16 v4, 0x41400000    # 12.0f

    .line 71
    .line 72
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 73
    .line 74
    .line 75
    const/4 v4, 0x0

    .line 76
    const/high16 v6, -0x40000000    # -2.0f

    .line 77
    .line 78
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 79
    .line 80
    .line 81
    const/high16 v26, 0x40800000    # 4.0f

    .line 82
    .line 83
    const/16 v27, 0x0

    .line 84
    .line 85
    const/high16 v21, 0x40000000    # 2.0f

    .line 86
    .line 87
    const/high16 v22, 0x40000000    # 2.0f

    .line 88
    .line 89
    const/16 v23, 0x0

    .line 90
    .line 91
    const/16 v24, 0x1

    .line 92
    .line 93
    const/16 v25, 0x1

    .line 94
    .line 95
    move-object/from16 v20, v2

    .line 96
    .line 97
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v26, -0x3f800000    # -4.0f

    .line 101
    .line 102
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    const/16 v16, 0x3800

    .line 110
    .line 111
    const/16 v17, 0x0

    .line 112
    .line 113
    const v6, 0x3e99999a    # 0.3f

    .line 114
    .line 115
    .line 116
    const v8, 0x3e99999a    # 0.3f

    .line 117
    .line 118
    .line 119
    const/4 v7, 0x0

    .line 120
    const/high16 v9, 0x3f800000    # 1.0f

    .line 121
    .line 122
    const/high16 v12, 0x3f800000    # 1.0f

    .line 123
    .line 124
    const/4 v13, 0x0

    .line 125
    const/4 v14, 0x0

    .line 126
    const/4 v15, 0x0

    .line 127
    const-string v4, ""

    .line 128
    .line 129
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 130
    .line 131
    .line 132
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 137
    .line 138
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 139
    .line 140
    .line 141
    move-result-wide v6

    .line 142
    const/4 v2, 0x0

    .line 143
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 147
    .line 148
    .line 149
    move-result v10

    .line 150
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 151
    .line 152
    .line 153
    move-result v11

    .line 154
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 157
    .line 158
    .line 159
    const/high16 v4, 0x41100000    # 9.0f

    .line 160
    .line 161
    const v6, 0x4189999a    # 17.2f

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v25, 0x41100000    # 9.0f

    .line 168
    .line 169
    const v26, 0x40d9999a    # 6.8f

    .line 170
    .line 171
    .line 172
    const v21, 0x4178a3d7    # 15.54f

    .line 173
    .line 174
    .line 175
    const v22, 0x40c428f6    # 6.13f

    .line 176
    .line 177
    .line 178
    const v23, 0x413dc28f    # 11.86f

    .line 179
    .line 180
    .line 181
    const v24, 0x40a4cccd    # 5.15f

    .line 182
    .line 183
    .line 184
    move-object/from16 v20, v2

    .line 185
    .line 186
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/high16 v25, -0x3fe00000    # -2.5f

    .line 190
    .line 191
    const v26, 0x40f33333    # 7.6f

    .line 192
    .line 193
    .line 194
    const v21, -0x3fd51eb8    # -2.67f

    .line 195
    .line 196
    .line 197
    const v22, 0x3fc51eb8    # 1.54f

    .line 198
    .line 199
    .line 200
    const v23, -0x3f933333    # -3.7f

    .line 201
    .line 202
    .line 203
    const v24, 0x409ae148    # 4.84f

    .line 204
    .line 205
    .line 206
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v25, 0x3e99999a    # 0.3f

    .line 210
    .line 211
    .line 212
    const v26, 0x3f19999a    # 0.6f

    .line 213
    .line 214
    .line 215
    const v21, 0x3db851ec    # 0.09f

    .line 216
    .line 217
    .line 218
    const v22, 0x3e4ccccd    # 0.2f

    .line 219
    .line 220
    .line 221
    const v23, 0x3e428f5c    # 0.19f

    .line 222
    .line 223
    .line 224
    const v24, 0x3ecccccd    # 0.4f

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v25, 0x41033333    # 8.2f

    .line 231
    .line 232
    .line 233
    const v26, 0x400ccccd    # 2.2f

    .line 234
    .line 235
    .line 236
    const v21, 0x3fd47ae1    # 1.66f

    .line 237
    .line 238
    .line 239
    const v22, 0x4037ae14    # 2.87f

    .line 240
    .line 241
    .line 242
    const v23, 0x40aa8f5c    # 5.33f

    .line 243
    .line 244
    .line 245
    const v24, 0x40766666    # 3.85f

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v25, 0x40200000    # 2.5f

    .line 252
    .line 253
    const v26, -0x3f0ccccd    # -7.6f

    .line 254
    .line 255
    .line 256
    const v21, 0x402ae148    # 2.67f

    .line 257
    .line 258
    .line 259
    const v22, -0x403ae148    # -1.54f

    .line 260
    .line 261
    .line 262
    const v23, 0x406ccccd    # 3.7f

    .line 263
    .line 264
    .line 265
    const v24, -0x3f651eb8    # -4.84f

    .line 266
    .line 267
    .line 268
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v25, 0x4189999a    # 17.2f

    .line 272
    .line 273
    .line 274
    const/high16 v26, 0x41100000    # 9.0f

    .line 275
    .line 276
    const v21, 0x418b47ae    # 17.41f

    .line 277
    .line 278
    .line 279
    const v22, 0x41166666    # 9.4f

    .line 280
    .line 281
    .line 282
    const v23, 0x418a7ae1    # 17.31f

    .line 283
    .line 284
    .line 285
    const v24, 0x41133333    # 9.2f

    .line 286
    .line 287
    .line 288
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v4, 0x41800000    # 16.0f

    .line 295
    .line 296
    const/high16 v6, 0x41400000    # 12.0f

    .line 297
    .line 298
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const/high16 v25, -0x3f800000    # -4.0f

    .line 302
    .line 303
    const/high16 v26, -0x3f800000    # -4.0f

    .line 304
    .line 305
    const v21, -0x3ff28f5c    # -2.21f

    .line 306
    .line 307
    .line 308
    const/16 v22, 0x0

    .line 309
    .line 310
    const/high16 v23, -0x3f800000    # -4.0f

    .line 311
    .line 312
    const v24, -0x401ae148    # -1.79f

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const/high16 v4, -0x3f800000    # -4.0f

    .line 319
    .line 320
    const v6, 0x3fe51eb8    # 1.79f

    .line 321
    .line 322
    .line 323
    const/high16 v7, 0x40800000    # 4.0f

    .line 324
    .line 325
    invoke-virtual {v2, v6, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const v4, 0x3fe51eb8    # 1.79f

    .line 329
    .line 330
    .line 331
    const/high16 v6, 0x40800000    # 4.0f

    .line 332
    .line 333
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v4, 0x41635c29    # 14.21f

    .line 337
    .line 338
    .line 339
    const/high16 v6, 0x41800000    # 16.0f

    .line 340
    .line 341
    const/high16 v7, 0x41400000    # 12.0f

    .line 342
    .line 343
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    const v6, 0x3e99999a    # 0.3f

    .line 354
    .line 355
    .line 356
    const/4 v7, 0x0

    .line 357
    const-string v4, ""

    .line 358
    .line 359
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 360
    .line 361
    .line 362
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 363
    .line 364
    .line 365
    move-result v3

    .line 366
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 367
    .line 368
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 369
    .line 370
    .line 371
    move-result-wide v6

    .line 372
    const/4 v2, 0x0

    .line 373
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 377
    .line 378
    .line 379
    move-result v10

    .line 380
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 381
    .line 382
    .line 383
    move-result v11

    .line 384
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 387
    .line 388
    .line 389
    const/high16 v4, 0x41000000    # 8.0f

    .line 390
    .line 391
    const/high16 v6, 0x41400000    # 12.0f

    .line 392
    .line 393
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v26, 0x40800000    # 4.0f

    .line 397
    .line 398
    const v24, 0x3fe51eb8    # 1.79f

    .line 399
    .line 400
    .line 401
    move-object/from16 v20, v2

    .line 402
    .line 403
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v4, 0x3fe51eb8    # 1.79f

    .line 407
    .line 408
    .line 409
    const/high16 v6, 0x40800000    # 4.0f

    .line 410
    .line 411
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v4, -0x401ae148    # -1.79f

    .line 415
    .line 416
    .line 417
    const/high16 v6, -0x3f800000    # -4.0f

    .line 418
    .line 419
    const/high16 v7, 0x40800000    # 4.0f

    .line 420
    .line 421
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v4, 0x41635c29    # 14.21f

    .line 425
    .line 426
    .line 427
    const/high16 v6, 0x41000000    # 8.0f

    .line 428
    .line 429
    const/high16 v7, 0x41400000    # 12.0f

    .line 430
    .line 431
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v4, 0x41600000    # 14.0f

    .line 438
    .line 439
    const/high16 v6, 0x41400000    # 12.0f

    .line 440
    .line 441
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const/high16 v25, -0x40000000    # -2.0f

    .line 445
    .line 446
    const/high16 v26, -0x40000000    # -2.0f

    .line 447
    .line 448
    const v21, -0x40733333    # -1.1f

    .line 449
    .line 450
    .line 451
    const/high16 v23, -0x40000000    # -2.0f

    .line 452
    .line 453
    const v24, -0x4099999a    # -0.9f

    .line 454
    .line 455
    .line 456
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v4, 0x3f666666    # 0.9f

    .line 460
    .line 461
    .line 462
    const/high16 v6, -0x40000000    # -2.0f

    .line 463
    .line 464
    const/high16 v7, 0x40000000    # 2.0f

    .line 465
    .line 466
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const/high16 v6, 0x40000000    # 2.0f

    .line 470
    .line 471
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v4, 0x4151999a    # 13.1f

    .line 475
    .line 476
    .line 477
    const/high16 v6, 0x41600000    # 14.0f

    .line 478
    .line 479
    const/high16 v7, 0x41400000    # 12.0f

    .line 480
    .line 481
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 488
    .line 489
    .line 490
    move-result-object v2

    .line 491
    const/high16 v6, 0x3f800000    # 1.0f

    .line 492
    .line 493
    const/high16 v8, 0x3f800000    # 1.0f

    .line 494
    .line 495
    const/4 v7, 0x0

    .line 496
    const-string v4, ""

    .line 497
    .line 498
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 499
    .line 500
    .line 501
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 502
    .line 503
    .line 504
    move-result v3

    .line 505
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 506
    .line 507
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 508
    .line 509
    .line 510
    move-result-wide v6

    .line 511
    const/4 v0, 0x0

    .line 512
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 513
    .line 514
    .line 515
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 516
    .line 517
    .line 518
    move-result v10

    .line 519
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 520
    .line 521
    .line 522
    move-result v11

    .line 523
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 526
    .line 527
    .line 528
    const v0, 0x419770a4    # 18.93f

    .line 529
    .line 530
    .line 531
    const/high16 v2, 0x41000000    # 8.0f

    .line 532
    .line 533
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const/high16 v17, 0x41000000    # 8.0f

    .line 537
    .line 538
    const v18, 0x40a23d71    # 5.07f

    .line 539
    .line 540
    .line 541
    const v13, 0x4185c28f    # 16.72f

    .line 542
    .line 543
    .line 544
    const v14, 0x4085c28f    # 4.18f

    .line 545
    .line 546
    .line 547
    const v15, 0x413d1eb8    # 11.82f

    .line 548
    .line 549
    .line 550
    const v16, 0x4037ae14    # 2.87f

    .line 551
    .line 552
    .line 553
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const v17, -0x3fb5c28f    # -3.16f

    .line 557
    .line 558
    .line 559
    const v18, 0x4057ae14    # 3.37f

    .line 560
    .line 561
    .line 562
    const v13, -0x404b851f    # -1.41f

    .line 563
    .line 564
    .line 565
    const v14, 0x3f51eb85    # 0.82f

    .line 566
    .line 567
    .line 568
    const v15, -0x3fe147ae    # -2.48f

    .line 569
    .line 570
    .line 571
    const/high16 v16, 0x40000000    # 2.0f

    .line 572
    .line 573
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const v17, 0x40bb851f    # 5.86f

    .line 577
    .line 578
    .line 579
    const/high16 v18, 0x40000000    # 2.0f

    .line 580
    .line 581
    const v13, 0x4096b852    # 4.71f

    .line 582
    .line 583
    .line 584
    const v14, 0x40c7ae14    # 6.24f

    .line 585
    .line 586
    .line 587
    const v15, 0x40a1eb85    # 5.06f

    .line 588
    .line 589
    .line 590
    const v16, 0x408147ae    # 4.04f

    .line 591
    .line 592
    .line 593
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const v0, 0x406f5c29    # 3.74f

    .line 597
    .line 598
    .line 599
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const v17, 0x40a23d71    # 5.07f

    .line 603
    .line 604
    .line 605
    const/high16 v18, 0x41800000    # 16.0f

    .line 606
    .line 607
    const v13, 0x400ccccd    # 2.2f

    .line 608
    .line 609
    .line 610
    const v14, 0x40cfae14    # 6.49f

    .line 611
    .line 612
    .line 613
    const v15, 0x402147ae    # 2.52f

    .line 614
    .line 615
    .line 616
    const v16, 0x413947ae    # 11.58f

    .line 617
    .line 618
    .line 619
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const v17, 0x409b851f    # 4.86f

    .line 623
    .line 624
    .line 625
    const v18, 0x406e147b    # 3.72f

    .line 626
    .line 627
    .line 628
    const v13, 0x3f8ccccd    # 1.1f

    .line 629
    .line 630
    .line 631
    const v14, 0x3ff47ae1    # 1.91f

    .line 632
    .line 633
    .line 634
    const v15, 0x403851ec    # 2.88f

    .line 635
    .line 636
    .line 637
    const v16, 0x404c28f6    # 3.19f

    .line 638
    .line 639
    .line 640
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const v17, 0x40c23d71    # 6.07f

    .line 644
    .line 645
    .line 646
    const v18, -0x40b5c28f    # -0.79f

    .line 647
    .line 648
    .line 649
    const v13, 0x3ffd70a4    # 1.98f

    .line 650
    .line 651
    .line 652
    const v14, 0x3f07ae14    # 0.53f

    .line 653
    .line 654
    .line 655
    const v15, 0x40851eb8    # 4.16f

    .line 656
    .line 657
    .line 658
    const v16, 0x3e9eb852    # 0.31f

    .line 659
    .line 660
    .line 661
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const v17, 0x404a3d71    # 3.16f

    .line 665
    .line 666
    .line 667
    const v18, -0x3fa851ec    # -3.37f

    .line 668
    .line 669
    .line 670
    const v13, 0x3fb47ae1    # 1.41f

    .line 671
    .line 672
    .line 673
    const v14, -0x40ae147b    # -0.82f

    .line 674
    .line 675
    .line 676
    const v15, 0x401eb852    # 2.48f

    .line 677
    .line 678
    .line 679
    const/high16 v16, -0x40000000    # -2.0f

    .line 680
    .line 681
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const v17, -0x407eb852    # -1.01f

    .line 685
    .line 686
    .line 687
    const v18, 0x40ce147b    # 6.44f

    .line 688
    .line 689
    .line 690
    const v13, 0x3e051eb8    # 0.13f

    .line 691
    .line 692
    .line 693
    const v14, 0x400ccccd    # 2.2f

    .line 694
    .line 695
    .line 696
    const v15, -0x41a8f5c3    # -0.21f

    .line 697
    .line 698
    .line 699
    const v16, 0x408ccccd    # 4.4f

    .line 700
    .line 701
    .line 702
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 703
    .line 704
    .line 705
    const v0, 0x40070a3d    # 2.11f

    .line 706
    .line 707
    .line 708
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    const v17, 0x419770a4    # 18.93f

    .line 712
    .line 713
    .line 714
    const/high16 v18, 0x41000000    # 8.0f

    .line 715
    .line 716
    const v13, 0x41ae51ec    # 21.79f

    .line 717
    .line 718
    .line 719
    const v14, 0x418c147b    # 17.51f

    .line 720
    .line 721
    .line 722
    const v15, 0x41abd70a    # 21.48f

    .line 723
    .line 724
    .line 725
    const v16, 0x4146b852    # 12.42f

    .line 726
    .line 727
    .line 728
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    const/high16 v0, 0x41700000    # 15.0f

    .line 735
    .line 736
    const v2, 0x4189999a    # 17.2f

    .line 737
    .line 738
    .line 739
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    const v17, -0x3efccccd    # -8.2f

    .line 743
    .line 744
    .line 745
    const v18, -0x3ff33333    # -2.2f

    .line 746
    .line 747
    .line 748
    const v13, -0x3fc851ec    # -2.87f

    .line 749
    .line 750
    .line 751
    const v14, 0x3fd33333    # 1.65f

    .line 752
    .line 753
    .line 754
    const v15, -0x3f2eb852    # -6.54f

    .line 755
    .line 756
    .line 757
    const v16, 0x3f2b851f    # 0.67f

    .line 758
    .line 759
    .line 760
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 761
    .line 762
    .line 763
    const v17, -0x41666666    # -0.3f

    .line 764
    .line 765
    .line 766
    const v18, -0x40e66666    # -0.6f

    .line 767
    .line 768
    .line 769
    const v13, -0x421eb852    # -0.11f

    .line 770
    .line 771
    .line 772
    const v14, -0x41b33333    # -0.2f

    .line 773
    .line 774
    .line 775
    const v15, -0x41a8f5c3    # -0.21f

    .line 776
    .line 777
    .line 778
    const v16, -0x41333333    # -0.4f

    .line 779
    .line 780
    .line 781
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 782
    .line 783
    .line 784
    const/high16 v17, 0x41100000    # 9.0f

    .line 785
    .line 786
    const v18, 0x40d9999a    # 6.8f

    .line 787
    .line 788
    .line 789
    const v13, 0x40a9999a    # 5.3f

    .line 790
    .line 791
    .line 792
    const v14, 0x413a3d71    # 11.64f

    .line 793
    .line 794
    .line 795
    const v15, 0x40ca8f5c    # 6.33f

    .line 796
    .line 797
    .line 798
    const v16, 0x410570a4    # 8.34f

    .line 799
    .line 800
    .line 801
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 802
    .line 803
    .line 804
    const v17, 0x41033333    # 8.2f

    .line 805
    .line 806
    .line 807
    const v18, 0x400ccccd    # 2.2f

    .line 808
    .line 809
    .line 810
    const v13, 0x40370a3d    # 2.86f

    .line 811
    .line 812
    .line 813
    const v14, -0x402ccccd    # -1.65f

    .line 814
    .line 815
    .line 816
    const v15, 0x40d147ae    # 6.54f

    .line 817
    .line 818
    .line 819
    const v16, -0x40d47ae1    # -0.67f

    .line 820
    .line 821
    .line 822
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 823
    .line 824
    .line 825
    const v17, 0x3e99999a    # 0.3f

    .line 826
    .line 827
    .line 828
    const v18, 0x3f19999a    # 0.6f

    .line 829
    .line 830
    .line 831
    const v13, 0x3de147ae    # 0.11f

    .line 832
    .line 833
    .line 834
    const v14, 0x3e4ccccd    # 0.2f

    .line 835
    .line 836
    .line 837
    const v15, 0x3e570a3d    # 0.21f

    .line 838
    .line 839
    .line 840
    const v16, 0x3ecccccd    # 0.4f

    .line 841
    .line 842
    .line 843
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 844
    .line 845
    .line 846
    const/high16 v17, 0x41700000    # 15.0f

    .line 847
    .line 848
    const v18, 0x4189999a    # 17.2f

    .line 849
    .line 850
    .line 851
    const v13, 0x4195999a    # 18.7f

    .line 852
    .line 853
    .line 854
    const v14, 0x4145c28f    # 12.36f

    .line 855
    .line 856
    .line 857
    const v15, 0x418d5c29    # 17.67f

    .line 858
    .line 859
    .line 860
    const v16, 0x417a8f5c    # 15.66f

    .line 861
    .line 862
    .line 863
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 864
    .line 865
    .line 866
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 867
    .line 868
    .line 869
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 870
    .line 871
    .line 872
    move-result-object v2

    .line 873
    const/16 v16, 0x3800

    .line 874
    .line 875
    const/16 v17, 0x0

    .line 876
    .line 877
    const/high16 v6, 0x3f800000    # 1.0f

    .line 878
    .line 879
    const/4 v7, 0x0

    .line 880
    const/high16 v12, 0x3f800000    # 1.0f

    .line 881
    .line 882
    const/4 v13, 0x0

    .line 883
    const/4 v14, 0x0

    .line 884
    const/4 v15, 0x0

    .line 885
    const-string v4, ""

    .line 886
    .line 887
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 888
    .line 889
    .line 890
    move-result-object v0

    .line 891
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 892
    .line 893
    .line 894
    move-result-object v0

    .line 895
    sput-object v0, Landroidx/compose/material/icons/twotone/StormKt;->_storm:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 896
    .line 897
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 898
    .line 899
    .line 900
    return-object v0
.end method
