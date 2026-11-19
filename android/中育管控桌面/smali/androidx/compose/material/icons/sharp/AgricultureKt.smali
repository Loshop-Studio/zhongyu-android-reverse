.class public final Landroidx/compose/material/icons/sharp/AgricultureKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_agriculture",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Agriculture",
        "Landroidx/compose/material/icons/Icons$Sharp;",
        "getAgriculture",
        "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nAgriculture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Agriculture.kt\nandroidx/compose/material/icons/sharp/AgricultureKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,126:1\n212#2,12:127\n233#2,18:140\n253#2:177\n233#2,18:178\n253#2:215\n233#2,18:216\n253#2:253\n233#2,18:254\n253#2:291\n174#3:139\n705#4,2:158\n717#4,2:160\n719#4,11:166\n705#4,2:196\n717#4,2:198\n719#4,11:204\n705#4,2:234\n717#4,2:236\n719#4,11:242\n705#4,2:272\n717#4,2:274\n719#4,11:280\n72#5,4:162\n72#5,4:200\n72#5,4:238\n72#5,4:276\n*S KotlinDebug\n*F\n+ 1 Agriculture.kt\nandroidx/compose/material/icons/sharp/AgricultureKt\n*L\n29#1:127,12\n30#1:140,18\n30#1:177\n52#1:178,18\n52#1:215\n66#1:216,18\n66#1:253\n75#1:254,18\n75#1:291\n29#1:139\n30#1:158,2\n30#1:160,2\n30#1:166,11\n52#1:196,2\n52#1:198,2\n52#1:204,11\n66#1:234,2\n66#1:236,2\n66#1:242,11\n75#1:272,2\n75#1:274,2\n75#1:280,11\n30#1:162,4\n52#1:200,4\n66#1:238,4\n75#1:276,4\n*E\n"
    }
.end annotation


# static fields
.field private static _agriculture:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAgriculture(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/AgricultureKt;->_agriculture:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.Agriculture"

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
    const/high16 v6, 0x419c0000    # 19.5f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x40200000    # 2.5f

    .line 78
    .line 79
    const v26, 0x3f428f5c    # 0.76f

    .line 80
    .line 81
    .line 82
    const v21, 0x3f6e147b    # 0.93f

    .line 83
    .line 84
    .line 85
    const/16 v22, 0x0

    .line 86
    .line 87
    const v23, 0x3fe3d70a    # 1.78f

    .line 88
    .line 89
    .line 90
    const v24, 0x3e8f5c29    # 0.28f

    .line 91
    .line 92
    .line 93
    move-object/from16 v20, v2

    .line 94
    .line 95
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v4, 0x41000000    # 8.0f

    .line 99
    .line 100
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v25, -0x40000000    # -2.0f

    .line 104
    .line 105
    const/high16 v26, -0x40000000    # -2.0f

    .line 106
    .line 107
    const/16 v21, 0x0

    .line 108
    .line 109
    const v22, -0x40733333    # -1.1f

    .line 110
    .line 111
    .line 112
    const v23, -0x4099999a    # -0.9f

    .line 113
    .line 114
    .line 115
    const/high16 v24, -0x40000000    # -2.0f

    .line 116
    .line 117
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v4, -0x3f36b852    # -6.29f

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v4, -0x407851ec    # -1.06f

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v4, -0x404b851f    # -1.41f

    .line 133
    .line 134
    .line 135
    const v6, 0x3fb47ae1    # 1.41f

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v4, -0x40ca3d71    # -0.71f

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v4, 0x411d1eb8    # 9.82f

    .line 148
    .line 149
    .line 150
    const v6, 0x40cb3333    # 6.35f

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v4, 0x3f35c28f    # 0.71f

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v4, -0x404b851f    # -1.41f

    .line 163
    .line 164
    .line 165
    const v6, 0x3fb47ae1    # 1.41f

    .line 166
    .line 167
    .line 168
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v4, 0x40d6b852    # 6.71f

    .line 172
    .line 173
    .line 174
    const/high16 v6, 0x41500000    # 13.0f

    .line 175
    .line 176
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v4, 0x41100000    # 9.0f

    .line 180
    .line 181
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const/high16 v26, 0x40000000    # 2.0f

    .line 185
    .line 186
    const v22, 0x3f8ccccd    # 1.1f

    .line 187
    .line 188
    .line 189
    const/high16 v24, 0x40000000    # 2.0f

    .line 190
    .line 191
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v4, -0x40f5c28f    # -0.54f

    .line 195
    .line 196
    .line 197
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v25, 0x3fc51eb8    # 1.54f

    .line 201
    .line 202
    .line 203
    const/high16 v26, 0x40800000    # 4.0f

    .line 204
    .line 205
    const v21, 0x3f733333    # 0.95f

    .line 206
    .line 207
    .line 208
    const v22, 0x3f87ae14    # 1.06f

    .line 209
    .line 210
    .line 211
    const v23, 0x3fc51eb8    # 1.54f

    .line 212
    .line 213
    .line 214
    const v24, 0x401d70a4    # 2.46f

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v25, -0x4247ae14    # -0.09f

    .line 221
    .line 222
    .line 223
    const/high16 v26, 0x3f800000    # 1.0f

    .line 224
    .line 225
    const/16 v21, 0x0

    .line 226
    .line 227
    const v22, 0x3eae147b    # 0.34f

    .line 228
    .line 229
    .line 230
    const v23, -0x42dc28f6    # -0.04f

    .line 231
    .line 232
    .line 233
    const v24, 0x3f2b851f    # 0.67f

    .line 234
    .line 235
    .line 236
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v4, 0x4048f5c3    # 3.14f

    .line 240
    .line 241
    .line 242
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const/high16 v25, 0x419c0000    # 19.5f

    .line 246
    .line 247
    const/high16 v26, 0x41400000    # 12.0f

    .line 248
    .line 249
    const v21, 0x4174cccd    # 15.3f

    .line 250
    .line 251
    .line 252
    const/high16 v22, 0x415c0000    # 13.75f

    .line 253
    .line 254
    const v23, 0x4189851f    # 17.19f

    .line 255
    .line 256
    .line 257
    const/high16 v24, 0x41400000    # 12.0f

    .line 258
    .line 259
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    const/16 v16, 0x3800

    .line 270
    .line 271
    const/16 v17, 0x0

    .line 272
    .line 273
    const/high16 v6, 0x3f800000    # 1.0f

    .line 274
    .line 275
    const/high16 v8, 0x3f800000    # 1.0f

    .line 276
    .line 277
    const/4 v7, 0x0

    .line 278
    const/high16 v9, 0x3f800000    # 1.0f

    .line 279
    .line 280
    const/high16 v12, 0x3f800000    # 1.0f

    .line 281
    .line 282
    const/4 v13, 0x0

    .line 283
    const/4 v14, 0x0

    .line 284
    const/4 v15, 0x0

    .line 285
    const-string v4, ""

    .line 286
    .line 287
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 288
    .line 289
    .line 290
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 291
    .line 292
    .line 293
    move-result v3

    .line 294
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 295
    .line 296
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 297
    .line 298
    .line 299
    move-result-wide v6

    .line 300
    const/4 v2, 0x0

    .line 301
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 305
    .line 306
    .line 307
    move-result v10

    .line 308
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 309
    .line 310
    .line 311
    move-result v11

    .line 312
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 315
    .line 316
    .line 317
    const/high16 v4, 0x41500000    # 13.0f

    .line 318
    .line 319
    const/high16 v6, 0x419c0000    # 19.5f

    .line 320
    .line 321
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const/high16 v25, -0x3fa00000    # -3.5f

    .line 325
    .line 326
    const/high16 v26, 0x40600000    # 3.5f

    .line 327
    .line 328
    const v21, -0x4008f5c3    # -1.93f

    .line 329
    .line 330
    .line 331
    const/16 v22, 0x0

    .line 332
    .line 333
    const/high16 v23, -0x3fa00000    # -3.5f

    .line 334
    .line 335
    const v24, 0x3fc8f5c3    # 1.57f

    .line 336
    .line 337
    .line 338
    move-object/from16 v20, v2

    .line 339
    .line 340
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v4, 0x3fc8f5c3    # 1.57f

    .line 344
    .line 345
    .line 346
    const/high16 v6, 0x40600000    # 3.5f

    .line 347
    .line 348
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v4, -0x40370a3d    # -1.57f

    .line 352
    .line 353
    .line 354
    const/high16 v6, -0x3fa00000    # -3.5f

    .line 355
    .line 356
    const/high16 v7, 0x40600000    # 3.5f

    .line 357
    .line 358
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v4, 0x41ab70a4    # 21.43f

    .line 362
    .line 363
    .line 364
    const/high16 v6, 0x41500000    # 13.0f

    .line 365
    .line 366
    const/high16 v7, 0x419c0000    # 19.5f

    .line 367
    .line 368
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const/high16 v4, 0x41900000    # 18.0f

    .line 375
    .line 376
    const/high16 v6, 0x419c0000    # 19.5f

    .line 377
    .line 378
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v25, -0x40400000    # -1.5f

    .line 382
    .line 383
    const/high16 v26, -0x40400000    # -1.5f

    .line 384
    .line 385
    const v21, -0x40ab851f    # -0.83f

    .line 386
    .line 387
    .line 388
    const/high16 v23, -0x40400000    # -1.5f

    .line 389
    .line 390
    const v24, -0x40d47ae1    # -0.67f

    .line 391
    .line 392
    .line 393
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v4, -0x40400000    # -1.5f

    .line 397
    .line 398
    const v6, 0x3f2b851f    # 0.67f

    .line 399
    .line 400
    .line 401
    const/high16 v7, 0x3fc00000    # 1.5f

    .line 402
    .line 403
    invoke-virtual {v2, v6, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v4, 0x3f2b851f    # 0.67f

    .line 407
    .line 408
    .line 409
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 410
    .line 411
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v4, 0x41a2a3d7    # 20.33f

    .line 415
    .line 416
    .line 417
    const/high16 v6, 0x41900000    # 18.0f

    .line 418
    .line 419
    const/high16 v7, 0x419c0000    # 19.5f

    .line 420
    .line 421
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    const/high16 v6, 0x3f800000    # 1.0f

    .line 432
    .line 433
    const/4 v7, 0x0

    .line 434
    const-string v4, ""

    .line 435
    .line 436
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 437
    .line 438
    .line 439
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 440
    .line 441
    .line 442
    move-result v3

    .line 443
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 444
    .line 445
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 446
    .line 447
    .line 448
    move-result-wide v6

    .line 449
    const/4 v2, 0x0

    .line 450
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 451
    .line 452
    .line 453
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 454
    .line 455
    .line 456
    move-result v10

    .line 457
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 458
    .line 459
    .line 460
    move-result v11

    .line 461
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 464
    .line 465
    .line 466
    const/high16 v4, 0x41100000    # 9.0f

    .line 467
    .line 468
    const/high16 v6, 0x40800000    # 4.0f

    .line 469
    .line 470
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v4, 0x40a00000    # 5.0f

    .line 474
    .line 475
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const/high16 v25, -0x40000000    # -2.0f

    .line 479
    .line 480
    const/high16 v26, -0x40000000    # -2.0f

    .line 481
    .line 482
    const/16 v21, 0x0

    .line 483
    .line 484
    const v22, -0x40733333    # -1.1f

    .line 485
    .line 486
    .line 487
    const v23, -0x4099999a    # -0.9f

    .line 488
    .line 489
    .line 490
    const/high16 v24, -0x40000000    # -2.0f

    .line 491
    .line 492
    move-object/from16 v20, v2

    .line 493
    .line 494
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const/high16 v4, 0x40800000    # 4.0f

    .line 498
    .line 499
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const/high16 v25, 0x40400000    # 3.0f

    .line 503
    .line 504
    const/high16 v26, 0x41000000    # 8.0f

    .line 505
    .line 506
    const v21, 0x405ccccd    # 3.45f

    .line 507
    .line 508
    .line 509
    const/high16 v22, 0x40e00000    # 7.0f

    .line 510
    .line 511
    const/high16 v23, 0x40400000    # 3.0f

    .line 512
    .line 513
    const v24, 0x40ee6666    # 7.45f

    .line 514
    .line 515
    .line 516
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/high16 v25, 0x40800000    # 4.0f

    .line 520
    .line 521
    const/high16 v26, 0x41100000    # 9.0f

    .line 522
    .line 523
    const/high16 v21, 0x40400000    # 3.0f

    .line 524
    .line 525
    const v22, 0x4108cccd    # 8.55f

    .line 526
    .line 527
    .line 528
    const v23, 0x405ccccd    # 3.45f

    .line 529
    .line 530
    .line 531
    const/high16 v24, 0x41100000    # 9.0f

    .line 532
    .line 533
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 540
    .line 541
    .line 542
    move-result-object v2

    .line 543
    const/high16 v6, 0x3f800000    # 1.0f

    .line 544
    .line 545
    const/4 v7, 0x0

    .line 546
    const-string v4, ""

    .line 547
    .line 548
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 549
    .line 550
    .line 551
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 552
    .line 553
    .line 554
    move-result v3

    .line 555
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 556
    .line 557
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 558
    .line 559
    .line 560
    move-result-wide v6

    .line 561
    const/4 v0, 0x0

    .line 562
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 563
    .line 564
    .line 565
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 566
    .line 567
    .line 568
    move-result v10

    .line 569
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 570
    .line 571
    .line 572
    move-result v11

    .line 573
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 576
    .line 577
    .line 578
    const v0, 0x415d1eb8    # 13.82f

    .line 579
    .line 580
    .line 581
    const v2, 0x411d47ae    # 9.83f

    .line 582
    .line 583
    .line 584
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const v0, -0x410f5c29    # -0.47f

    .line 588
    .line 589
    .line 590
    const v2, -0x41c7ae14    # -0.18f

    .line 591
    .line 592
    .line 593
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const v0, 0x412947ae    # 10.58f

    .line 597
    .line 598
    .line 599
    const/high16 v2, 0x41500000    # 13.0f

    .line 600
    .line 601
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const v17, -0x3fec28f6    # -2.31f

    .line 605
    .line 606
    .line 607
    const v18, -0x3fe47ae1    # -2.43f

    .line 608
    .line 609
    .line 610
    const v13, -0x41147ae1    # -0.46f

    .line 611
    .line 612
    .line 613
    const v14, -0x407851ec    # -1.06f

    .line 614
    .line 615
    .line 616
    const v15, -0x405c28f6    # -1.28f

    .line 617
    .line 618
    .line 619
    const v16, -0x400b851f    # -1.91f

    .line 620
    .line 621
    .line 622
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const v0, 0x3f63d70a    # 0.89f

    .line 626
    .line 627
    .line 628
    const v2, -0x41333333    # -0.4f

    .line 629
    .line 630
    .line 631
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const v0, -0x41147ae1    # -0.46f

    .line 635
    .line 636
    .line 637
    const v2, -0x41a8f5c3    # -0.21f

    .line 638
    .line 639
    .line 640
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const v0, -0x4099999a    # -0.9f

    .line 644
    .line 645
    .line 646
    const v2, 0x3ecccccd    # 0.4f

    .line 647
    .line 648
    .line 649
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    const/high16 v17, 0x40c00000    # 6.0f

    .line 653
    .line 654
    const/high16 v18, 0x41200000    # 10.0f

    .line 655
    .line 656
    const v13, 0x40e851ec    # 7.26f

    .line 657
    .line 658
    .line 659
    const v14, 0x4122147b    # 10.13f

    .line 660
    .line 661
    .line 662
    const v15, 0x40d47ae1    # 6.64f

    .line 663
    .line 664
    .line 665
    const/high16 v16, 0x41200000    # 10.0f

    .line 666
    .line 667
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const v17, -0x403d70a4    # -1.52f

    .line 671
    .line 672
    .line 673
    const v18, 0x3e851eb8    # 0.26f

    .line 674
    .line 675
    .line 676
    const v13, -0x40f851ec    # -0.53f

    .line 677
    .line 678
    .line 679
    const/4 v14, 0x0

    .line 680
    const v15, -0x407ae148    # -1.04f

    .line 681
    .line 682
    .line 683
    const v16, 0x3de147ae    # 0.11f

    .line 684
    .line 685
    .line 686
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const v0, 0x3eae147b    # 0.34f

    .line 690
    .line 691
    .line 692
    const v2, 0x3f68f5c3    # 0.91f

    .line 693
    .line 694
    .line 695
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 696
    .line 697
    .line 698
    const v0, -0x410f5c29    # -0.47f

    .line 699
    .line 700
    .line 701
    const v2, 0x3e3851ec    # 0.18f

    .line 702
    .line 703
    .line 704
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 705
    .line 706
    .line 707
    const v0, 0x4126b852    # 10.42f

    .line 708
    .line 709
    .line 710
    const/high16 v2, 0x40800000    # 4.0f

    .line 711
    .line 712
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 713
    .line 714
    .line 715
    const v17, -0x3fe47ae1    # -2.43f

    .line 716
    .line 717
    .line 718
    const v18, 0x4013d70a    # 2.31f

    .line 719
    .line 720
    .line 721
    const v13, -0x407851ec    # -1.06f

    .line 722
    .line 723
    .line 724
    const v14, 0x3eeb851f    # 0.46f

    .line 725
    .line 726
    .line 727
    const v15, -0x400b851f    # -1.91f

    .line 728
    .line 729
    .line 730
    const v16, 0x3fa3d70a    # 1.28f

    .line 731
    .line 732
    .line 733
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 734
    .line 735
    .line 736
    const v0, 0x3f63d70a    # 0.89f

    .line 737
    .line 738
    .line 739
    const v2, 0x3ecccccd    # 0.4f

    .line 740
    .line 741
    .line 742
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    const v0, -0x41a8f5c3    # -0.21f

    .line 746
    .line 747
    .line 748
    const v2, 0x3eeb851f    # 0.46f

    .line 749
    .line 750
    .line 751
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 752
    .line 753
    .line 754
    const v0, -0x4099999a    # -0.9f

    .line 755
    .line 756
    .line 757
    const v2, -0x41333333    # -0.4f

    .line 758
    .line 759
    .line 760
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 761
    .line 762
    .line 763
    const/high16 v17, 0x3f800000    # 1.0f

    .line 764
    .line 765
    const/high16 v18, 0x41700000    # 15.0f

    .line 766
    .line 767
    const v13, 0x3f90a3d7    # 1.13f

    .line 768
    .line 769
    .line 770
    const v14, 0x415bd70a    # 13.74f

    .line 771
    .line 772
    .line 773
    const/high16 v15, 0x3f800000    # 1.0f

    .line 774
    .line 775
    const v16, 0x4165c28f    # 14.36f

    .line 776
    .line 777
    .line 778
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 779
    .line 780
    .line 781
    const v17, 0x3e851eb8    # 0.26f

    .line 782
    .line 783
    .line 784
    const v18, 0x3fc28f5c    # 1.52f

    .line 785
    .line 786
    .line 787
    const/4 v13, 0x0

    .line 788
    const v14, 0x3f07ae14    # 0.53f

    .line 789
    .line 790
    .line 791
    const v15, 0x3de147ae    # 0.11f

    .line 792
    .line 793
    .line 794
    const v16, 0x3f851eb8    # 1.04f

    .line 795
    .line 796
    .line 797
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 798
    .line 799
    .line 800
    const v0, 0x3f68f5c3    # 0.91f

    .line 801
    .line 802
    .line 803
    const v2, -0x4151eb85    # -0.34f

    .line 804
    .line 805
    .line 806
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 807
    .line 808
    .line 809
    const v0, 0x3e3851ec    # 0.18f

    .line 810
    .line 811
    .line 812
    const v2, 0x3ef0a3d7    # 0.47f

    .line 813
    .line 814
    .line 815
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 816
    .line 817
    .line 818
    const v0, 0x3fb5c28f    # 1.42f

    .line 819
    .line 820
    .line 821
    const/high16 v2, 0x41880000    # 17.0f

    .line 822
    .line 823
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 824
    .line 825
    .line 826
    const v17, 0x4013d70a    # 2.31f

    .line 827
    .line 828
    .line 829
    const v18, 0x401b851f    # 2.43f

    .line 830
    .line 831
    .line 832
    const v13, 0x3eeb851f    # 0.46f

    .line 833
    .line 834
    .line 835
    const v14, 0x3f87ae14    # 1.06f

    .line 836
    .line 837
    .line 838
    const v15, 0x3fa3d70a    # 1.28f

    .line 839
    .line 840
    .line 841
    const v16, 0x3ff47ae1    # 1.91f

    .line 842
    .line 843
    .line 844
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 845
    .line 846
    .line 847
    const v0, -0x409c28f6    # -0.89f

    .line 848
    .line 849
    .line 850
    const v2, 0x3ecccccd    # 0.4f

    .line 851
    .line 852
    .line 853
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 854
    .line 855
    .line 856
    const v0, 0x3eeb851f    # 0.46f

    .line 857
    .line 858
    .line 859
    const v2, 0x3e570a3d    # 0.21f

    .line 860
    .line 861
    .line 862
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 863
    .line 864
    .line 865
    const v0, 0x3f666666    # 0.9f

    .line 866
    .line 867
    .line 868
    const v2, -0x41333333    # -0.4f

    .line 869
    .line 870
    .line 871
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 872
    .line 873
    .line 874
    const/high16 v17, 0x40c00000    # 6.0f

    .line 875
    .line 876
    const/high16 v18, 0x41a00000    # 20.0f

    .line 877
    .line 878
    const v13, 0x4097ae14    # 4.74f

    .line 879
    .line 880
    .line 881
    const v14, 0x419ef5c3    # 19.87f

    .line 882
    .line 883
    .line 884
    const v15, 0x40ab851f    # 5.36f

    .line 885
    .line 886
    .line 887
    const/high16 v16, 0x41a00000    # 20.0f

    .line 888
    .line 889
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 890
    .line 891
    .line 892
    const v17, 0x3fc28f5c    # 1.52f

    .line 893
    .line 894
    .line 895
    const v18, -0x417ae148    # -0.26f

    .line 896
    .line 897
    .line 898
    const v13, 0x3f07ae14    # 0.53f

    .line 899
    .line 900
    .line 901
    const/4 v14, 0x0

    .line 902
    const v15, 0x3f851eb8    # 1.04f

    .line 903
    .line 904
    .line 905
    const v16, -0x421eb852    # -0.11f

    .line 906
    .line 907
    .line 908
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 909
    .line 910
    .line 911
    const v0, -0x4151eb85    # -0.34f

    .line 912
    .line 913
    .line 914
    const v2, -0x40970a3d    # -0.91f

    .line 915
    .line 916
    .line 917
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 918
    .line 919
    .line 920
    const v0, 0x3ef0a3d7    # 0.47f

    .line 921
    .line 922
    .line 923
    const v2, -0x41c7ae14    # -0.18f

    .line 924
    .line 925
    .line 926
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 927
    .line 928
    .line 929
    const v0, 0x419ca3d7    # 19.58f

    .line 930
    .line 931
    .line 932
    const/high16 v2, 0x41000000    # 8.0f

    .line 933
    .line 934
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 935
    .line 936
    .line 937
    const v17, 0x401b851f    # 2.43f

    .line 938
    .line 939
    .line 940
    const v18, -0x3fec28f6    # -2.31f

    .line 941
    .line 942
    .line 943
    const v13, 0x3f87ae14    # 1.06f

    .line 944
    .line 945
    .line 946
    const v14, -0x41147ae1    # -0.46f

    .line 947
    .line 948
    .line 949
    const v15, 0x3ff47ae1    # 1.91f

    .line 950
    .line 951
    .line 952
    const v16, -0x405c28f6    # -1.28f

    .line 953
    .line 954
    .line 955
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 956
    .line 957
    .line 958
    const v0, -0x409c28f6    # -0.89f

    .line 959
    .line 960
    .line 961
    const v2, -0x41333333    # -0.4f

    .line 962
    .line 963
    .line 964
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 965
    .line 966
    .line 967
    const v0, 0x3e570a3d    # 0.21f

    .line 968
    .line 969
    .line 970
    const v2, -0x41147ae1    # -0.46f

    .line 971
    .line 972
    .line 973
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 974
    .line 975
    .line 976
    const v0, 0x3f666666    # 0.9f

    .line 977
    .line 978
    .line 979
    const v2, 0x3ecccccd    # 0.4f

    .line 980
    .line 981
    .line 982
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 983
    .line 984
    .line 985
    const/high16 v17, 0x41300000    # 11.0f

    .line 986
    .line 987
    const/high16 v18, 0x41700000    # 15.0f

    .line 988
    .line 989
    const v13, 0x412deb85    # 10.87f

    .line 990
    .line 991
    .line 992
    const v14, 0x4182147b    # 16.26f

    .line 993
    .line 994
    .line 995
    const/high16 v15, 0x41300000    # 11.0f

    .line 996
    .line 997
    const v16, 0x417a3d71    # 15.64f

    .line 998
    .line 999
    .line 1000
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1001
    .line 1002
    .line 1003
    const v17, -0x417ae148    # -0.26f

    .line 1004
    .line 1005
    .line 1006
    const v18, -0x403d70a4    # -1.52f

    .line 1007
    .line 1008
    .line 1009
    const/4 v13, 0x0

    .line 1010
    const v14, -0x40f851ec    # -0.53f

    .line 1011
    .line 1012
    .line 1013
    const v15, -0x421eb852    # -0.11f

    .line 1014
    .line 1015
    .line 1016
    const v16, -0x407ae148    # -1.04f

    .line 1017
    .line 1018
    .line 1019
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1020
    .line 1021
    .line 1022
    const v0, 0x415d1eb8    # 13.82f

    .line 1023
    .line 1024
    .line 1025
    const v2, 0x411d47ae    # 9.83f

    .line 1026
    .line 1027
    .line 1028
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1029
    .line 1030
    .line 1031
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1032
    .line 1033
    .line 1034
    const v0, 0x40e4cccd    # 7.15f

    .line 1035
    .line 1036
    .line 1037
    const v2, 0x418e28f6    # 17.77f

    .line 1038
    .line 1039
    .line 1040
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1041
    .line 1042
    .line 1043
    const v17, -0x3f851eb8    # -3.92f

    .line 1044
    .line 1045
    .line 1046
    const v18, -0x4030a3d7    # -1.62f

    .line 1047
    .line 1048
    .line 1049
    const v13, -0x403c28f6    # -1.53f

    .line 1050
    .line 1051
    .line 1052
    const v14, 0x3f2147ae    # 0.63f

    .line 1053
    .line 1054
    .line 1055
    const v15, -0x3fad70a4    # -3.29f

    .line 1056
    .line 1057
    .line 1058
    const v16, -0x4247ae14    # -0.09f

    .line 1059
    .line 1060
    .line 1061
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1062
    .line 1063
    .line 1064
    const v17, 0x3fcf5c29    # 1.62f

    .line 1065
    .line 1066
    .line 1067
    const v18, -0x3f851eb8    # -3.92f

    .line 1068
    .line 1069
    .line 1070
    const v13, -0x40deb852    # -0.63f

    .line 1071
    .line 1072
    .line 1073
    const v14, -0x403c28f6    # -1.53f

    .line 1074
    .line 1075
    .line 1076
    const v15, 0x3db851ec    # 0.09f

    .line 1077
    .line 1078
    .line 1079
    const v16, -0x3fad70a4    # -3.29f

    .line 1080
    .line 1081
    .line 1082
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1083
    .line 1084
    .line 1085
    const v17, 0x407ae148    # 3.92f

    .line 1086
    .line 1087
    .line 1088
    const v18, 0x3fcf5c29    # 1.62f

    .line 1089
    .line 1090
    .line 1091
    const v13, 0x3fc3d70a    # 1.53f

    .line 1092
    .line 1093
    .line 1094
    const v14, -0x40deb852    # -0.63f

    .line 1095
    .line 1096
    .line 1097
    const v15, 0x40528f5c    # 3.29f

    .line 1098
    .line 1099
    .line 1100
    const v16, 0x3db851ec    # 0.09f

    .line 1101
    .line 1102
    .line 1103
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1104
    .line 1105
    .line 1106
    const v17, 0x40e4cccd    # 7.15f

    .line 1107
    .line 1108
    .line 1109
    const v18, 0x418e28f6    # 17.77f

    .line 1110
    .line 1111
    .line 1112
    const v13, 0x41168f5c    # 9.41f

    .line 1113
    .line 1114
    .line 1115
    const v14, 0x4176147b    # 15.38f

    .line 1116
    .line 1117
    .line 1118
    const v15, 0x410ae148    # 8.68f

    .line 1119
    .line 1120
    .line 1121
    const v16, 0x41891eb8    # 17.14f

    .line 1122
    .line 1123
    .line 1124
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1125
    .line 1126
    .line 1127
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1128
    .line 1129
    .line 1130
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v2

    .line 1134
    const/16 v16, 0x3800

    .line 1135
    .line 1136
    const/16 v17, 0x0

    .line 1137
    .line 1138
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1139
    .line 1140
    const/4 v7, 0x0

    .line 1141
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1142
    .line 1143
    const/4 v13, 0x0

    .line 1144
    const/4 v14, 0x0

    .line 1145
    const/4 v15, 0x0

    .line 1146
    const-string v4, ""

    .line 1147
    .line 1148
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v0

    .line 1152
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v0

    .line 1156
    sput-object v0, Landroidx/compose/material/icons/sharp/AgricultureKt;->_agriculture:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1157
    .line 1158
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1159
    .line 1160
    .line 1161
    return-object v0
.end method
