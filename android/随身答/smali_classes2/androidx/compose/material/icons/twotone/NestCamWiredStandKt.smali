.class public final Landroidx/compose/material/icons/twotone/NestCamWiredStandKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_nestCamWiredStand",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "NestCamWiredStand",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getNestCamWiredStand",
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
        "SMAP\nNestCamWiredStand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestCamWiredStand.kt\nandroidx/compose/material/icons/twotone/NestCamWiredStandKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,91:1\n212#2,12:92\n233#2,18:105\n253#2:142\n233#2,18:143\n253#2:180\n233#2,18:181\n253#2:218\n174#3:104\n705#4,2:123\n717#4,2:125\n719#4,11:131\n705#4,2:161\n717#4,2:163\n719#4,11:169\n705#4,2:199\n717#4,2:201\n719#4,11:207\n72#5,4:127\n72#5,4:165\n72#5,4:203\n*S KotlinDebug\n*F\n+ 1 NestCamWiredStand.kt\nandroidx/compose/material/icons/twotone/NestCamWiredStandKt\n*L\n29#1:92,12\n30#1:105,18\n30#1:142\n39#1:143,18\n39#1:180\n49#1:181,18\n49#1:218\n29#1:104\n30#1:123,2\n30#1:125,2\n30#1:131,11\n39#1:161,2\n39#1:163,2\n39#1:169,11\n49#1:199,2\n49#1:201,2\n49#1:207,11\n30#1:127,4\n39#1:165,4\n49#1:203,4\n*E\n"
    }
.end annotation


# static fields
.field private static _nestCamWiredStand:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNestCamWiredStand(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/NestCamWiredStandKt;->_nestCamWiredStand:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.NestCamWiredStand"

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
    const/high16 v6, 0x41880000    # 17.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 78
    .line 79
    const/high16 v26, 0x40400000    # 3.0f

    .line 80
    .line 81
    const v21, -0x402ccccd    # -1.65f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, -0x3fc00000    # -3.0f

    .line 87
    .line 88
    const v24, 0x3faccccd    # 1.35f

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
    const/high16 v4, 0x3f800000    # 1.0f

    .line 97
    .line 98
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v4, 0x40c00000    # 6.0f

    .line 102
    .line 103
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v4, -0x40800000    # -1.0f

    .line 107
    .line 108
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v25, 0x41400000    # 12.0f

    .line 112
    .line 113
    const/high16 v26, 0x41880000    # 17.0f

    .line 114
    .line 115
    const/high16 v21, 0x41700000    # 15.0f

    .line 116
    .line 117
    const v22, 0x4192cccd    # 18.35f

    .line 118
    .line 119
    .line 120
    const v23, 0x415a6666    # 13.65f

    .line 121
    .line 122
    .line 123
    const/high16 v24, 0x41880000    # 17.0f

    .line 124
    .line 125
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    const/16 v16, 0x3800

    .line 136
    .line 137
    const/16 v17, 0x0

    .line 138
    .line 139
    const v6, 0x3e99999a    # 0.3f

    .line 140
    .line 141
    .line 142
    const v8, 0x3e99999a    # 0.3f

    .line 143
    .line 144
    .line 145
    const/4 v7, 0x0

    .line 146
    const/high16 v9, 0x3f800000    # 1.0f

    .line 147
    .line 148
    const/high16 v12, 0x3f800000    # 1.0f

    .line 149
    .line 150
    const/4 v13, 0x0

    .line 151
    const/4 v14, 0x0

    .line 152
    const/4 v15, 0x0

    .line 153
    const-string v4, ""

    .line 154
    .line 155
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 156
    .line 157
    .line 158
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 159
    .line 160
    .line 161
    move-result v3

    .line 162
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 163
    .line 164
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 165
    .line 166
    .line 167
    move-result-wide v6

    .line 168
    const/4 v2, 0x0

    .line 169
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 173
    .line 174
    .line 175
    move-result v10

    .line 176
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 177
    .line 178
    .line 179
    move-result v11

    .line 180
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 183
    .line 184
    .line 185
    const/high16 v4, 0x40400000    # 3.0f

    .line 186
    .line 187
    const/high16 v6, 0x41800000    # 16.0f

    .line 188
    .line 189
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v4, -0x3f7d70a4    # -4.08f

    .line 193
    .line 194
    .line 195
    const v6, 0x3ed1eb85    # 0.41f

    .line 196
    .line 197
    .line 198
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v25, 0x41000000    # 8.0f

    .line 202
    .line 203
    const/high16 v26, 0x40f80000    # 7.75f

    .line 204
    .line 205
    const v21, 0x411b0a3d    # 9.69f

    .line 206
    .line 207
    .line 208
    const v22, 0x4068f5c3    # 3.64f

    .line 209
    .line 210
    .line 211
    const/high16 v23, 0x41000000    # 8.0f

    .line 212
    .line 213
    const/high16 v24, 0x40b00000    # 5.5f

    .line 214
    .line 215
    move-object/from16 v20, v2

    .line 216
    .line 217
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v4, 0x408ae148    # 4.34f

    .line 221
    .line 222
    .line 223
    const v6, 0x407ae148    # 3.92f

    .line 224
    .line 225
    .line 226
    const v7, 0x4083851f    # 4.11f

    .line 227
    .line 228
    .line 229
    const v8, 0x3fd851ec    # 1.69f

    .line 230
    .line 231
    .line 232
    invoke-virtual {v2, v8, v7, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v4, 0x3ed70a3d    # 0.42f

    .line 236
    .line 237
    .line 238
    const v6, 0x4083851f    # 4.11f

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v4, 0x40400000    # 3.0f

    .line 245
    .line 246
    const/high16 v6, 0x41800000    # 16.0f

    .line 247
    .line 248
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    const v6, 0x3e99999a    # 0.3f

    .line 262
    .line 263
    .line 264
    const v8, 0x3e99999a    # 0.3f

    .line 265
    .line 266
    .line 267
    const/4 v7, 0x0

    .line 268
    const-string v4, ""

    .line 269
    .line 270
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 271
    .line 272
    .line 273
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 274
    .line 275
    .line 276
    move-result v3

    .line 277
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 278
    .line 279
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 280
    .line 281
    .line 282
    move-result-wide v6

    .line 283
    const/4 v0, 0x0

    .line 284
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 288
    .line 289
    .line 290
    move-result v10

    .line 291
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 292
    .line 293
    .line 294
    move-result v11

    .line 295
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 298
    .line 299
    .line 300
    const/high16 v0, 0x3f800000    # 1.0f

    .line 301
    .line 302
    const/high16 v2, 0x41800000    # 16.0f

    .line 303
    .line 304
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v17, -0x3f770a3d    # -4.28f

    .line 308
    .line 309
    .line 310
    const v18, 0x3ed70a3d    # 0.42f

    .line 311
    .line 312
    .line 313
    const v13, -0x41e66666    # -0.15f

    .line 314
    .line 315
    .line 316
    const v15, 0x3de147ae    # 0.11f

    .line 317
    .line 318
    .line 319
    const v16, -0x435c28f6    # -0.02f

    .line 320
    .line 321
    .line 322
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const/high16 v17, 0x40c00000    # 6.0f

    .line 326
    .line 327
    const/high16 v18, 0x40f80000    # 7.75f

    .line 328
    .line 329
    const v13, 0x4107851f    # 8.47f

    .line 330
    .line 331
    .line 332
    const/high16 v14, 0x3fe00000    # 1.75f

    .line 333
    .line 334
    const/high16 v15, 0x40c00000    # 6.0f

    .line 335
    .line 336
    const v16, 0x408f5c29    # 4.48f

    .line 337
    .line 338
    .line 339
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v0, 0x40b70a3d    # 5.72f

    .line 343
    .line 344
    .line 345
    const v2, 0x40ca8f5c    # 6.33f

    .line 346
    .line 347
    .line 348
    const/high16 v4, 0x40c00000    # 6.0f

    .line 349
    .line 350
    const v6, 0x401e147b    # 2.47f

    .line 351
    .line 352
    .line 353
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v0, 0x3ff33333    # 1.9f

    .line 357
    .line 358
    .line 359
    const v2, 0x3e428f5c    # 0.19f

    .line 360
    .line 361
    .line 362
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v0, -0x40f0a3d7    # -0.56f

    .line 366
    .line 367
    .line 368
    const v2, 0x3f59999a    # 0.85f

    .line 369
    .line 370
    .line 371
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const/high16 v17, 0x41400000    # 12.0f

    .line 375
    .line 376
    const/high16 v18, 0x41700000    # 15.0f

    .line 377
    .line 378
    const v13, 0x414b5c29    # 12.71f

    .line 379
    .line 380
    .line 381
    const v14, 0x4170a3d7    # 15.04f

    .line 382
    .line 383
    .line 384
    const v15, 0x4145c28f    # 12.36f

    .line 385
    .line 386
    .line 387
    const/high16 v16, 0x41700000    # 15.0f

    .line 388
    .line 389
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const/high16 v17, -0x3f600000    # -5.0f

    .line 393
    .line 394
    const/high16 v18, 0x40a00000    # 5.0f

    .line 395
    .line 396
    const v13, -0x3fcf5c29    # -2.76f

    .line 397
    .line 398
    .line 399
    const/4 v14, 0x0

    .line 400
    const/high16 v15, -0x3f600000    # -5.0f

    .line 401
    .line 402
    const v16, 0x400f5c29    # 2.24f

    .line 403
    .line 404
    .line 405
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v0, 0x40000000    # 2.0f

    .line 409
    .line 410
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v17, 0x3f800000    # 1.0f

    .line 414
    .line 415
    const/high16 v18, 0x3f800000    # 1.0f

    .line 416
    .line 417
    const/4 v13, 0x0

    .line 418
    const v14, 0x3f0ccccd    # 0.55f

    .line 419
    .line 420
    .line 421
    const v15, 0x3ee66666    # 0.45f

    .line 422
    .line 423
    .line 424
    const/high16 v16, 0x3f800000    # 1.0f

    .line 425
    .line 426
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const/high16 v0, 0x41000000    # 8.0f

    .line 430
    .line 431
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/high16 v18, -0x40800000    # -1.0f

    .line 435
    .line 436
    const v13, 0x3f0ccccd    # 0.55f

    .line 437
    .line 438
    .line 439
    const/4 v14, 0x0

    .line 440
    const/high16 v15, 0x3f800000    # 1.0f

    .line 441
    .line 442
    const v16, -0x4119999a    # -0.45f

    .line 443
    .line 444
    .line 445
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/high16 v0, -0x40000000    # -2.0f

    .line 449
    .line 450
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v17, -0x3ffa3d71    # -2.09f

    .line 454
    .line 455
    .line 456
    const v18, -0x3f7e147b    # -4.06f

    .line 457
    .line 458
    .line 459
    const/4 v13, 0x0

    .line 460
    const v14, -0x402a3d71    # -1.67f

    .line 461
    .line 462
    .line 463
    const v15, -0x40ab851f    # -0.83f

    .line 464
    .line 465
    .line 466
    const v16, -0x3fb66666    # -3.15f

    .line 467
    .line 468
    .line 469
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v0, 0x3f7851ec    # 0.97f

    .line 473
    .line 474
    .line 475
    const v2, -0x40466666    # -1.45f

    .line 476
    .line 477
    .line 478
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const v17, 0x3e051eb8    # 0.13f

    .line 482
    .line 483
    .line 484
    const v18, 0x3c23d70a    # 0.01f

    .line 485
    .line 486
    .line 487
    const v13, 0x3d23d70a    # 0.04f

    .line 488
    .line 489
    .line 490
    const/4 v14, 0x0

    .line 491
    const v15, 0x3db851ec    # 0.09f

    .line 492
    .line 493
    .line 494
    const v16, 0x3c23d70a    # 0.01f

    .line 495
    .line 496
    .line 497
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v17, 0x40000000    # 2.0f

    .line 501
    .line 502
    const/high16 v18, -0x40000000    # -2.0f

    .line 503
    .line 504
    const v13, 0x3f8b851f    # 1.09f

    .line 505
    .line 506
    .line 507
    const/high16 v15, 0x40000000    # 2.0f

    .line 508
    .line 509
    const v16, -0x409c28f6    # -0.89f

    .line 510
    .line 511
    .line 512
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v0, 0x40400000    # 3.0f

    .line 516
    .line 517
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v17, 0x41800000    # 16.0f

    .line 521
    .line 522
    const/high16 v18, 0x3f800000    # 1.0f

    .line 523
    .line 524
    const/high16 v13, 0x41900000    # 18.0f

    .line 525
    .line 526
    const v14, 0x3ff1eb85    # 1.89f

    .line 527
    .line 528
    .line 529
    const v15, 0x4188b852    # 17.09f

    .line 530
    .line 531
    .line 532
    const/high16 v16, 0x3f800000    # 1.0f

    .line 533
    .line 534
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const/high16 v0, 0x41700000    # 15.0f

    .line 541
    .line 542
    const/high16 v2, 0x41a00000    # 20.0f

    .line 543
    .line 544
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const/high16 v0, 0x3f800000    # 1.0f

    .line 548
    .line 549
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const/high16 v0, 0x41100000    # 9.0f

    .line 553
    .line 554
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const/high16 v0, -0x40800000    # -1.0f

    .line 558
    .line 559
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const/high16 v17, 0x40400000    # 3.0f

    .line 563
    .line 564
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 565
    .line 566
    const/4 v13, 0x0

    .line 567
    const v14, -0x402ccccd    # -1.65f

    .line 568
    .line 569
    .line 570
    const v15, 0x3faccccd    # 1.35f

    .line 571
    .line 572
    .line 573
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 574
    .line 575
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const/high16 v17, 0x41700000    # 15.0f

    .line 579
    .line 580
    const/high16 v18, 0x41a00000    # 20.0f

    .line 581
    .line 582
    const v13, 0x415a6666    # 13.65f

    .line 583
    .line 584
    .line 585
    const/high16 v14, 0x41880000    # 17.0f

    .line 586
    .line 587
    const/high16 v15, 0x41700000    # 15.0f

    .line 588
    .line 589
    const v16, 0x4192cccd    # 18.35f

    .line 590
    .line 591
    .line 592
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const v0, 0x414170a4    # 12.09f

    .line 599
    .line 600
    .line 601
    const v2, 0x413eb852    # 11.92f

    .line 602
    .line 603
    .line 604
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const/high16 v17, 0x41000000    # 8.0f

    .line 608
    .line 609
    const/high16 v18, 0x40f80000    # 7.75f

    .line 610
    .line 611
    const v13, 0x411b0a3d    # 9.69f

    .line 612
    .line 613
    .line 614
    const v14, 0x413dc28f    # 11.86f

    .line 615
    .line 616
    .line 617
    const/high16 v15, 0x41000000    # 8.0f

    .line 618
    .line 619
    const/high16 v16, 0x41200000    # 10.0f

    .line 620
    .line 621
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const v0, -0x3f7c7ae1    # -4.11f

    .line 625
    .line 626
    .line 627
    const v2, -0x3f751eb8    # -4.34f

    .line 628
    .line 629
    .line 630
    const v4, 0x407ae148    # 3.92f

    .line 631
    .line 632
    .line 633
    const v6, 0x3fd851ec    # 1.69f

    .line 634
    .line 635
    .line 636
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const/high16 v0, 0x40400000    # 3.0f

    .line 640
    .line 641
    const/high16 v2, 0x41800000    # 16.0f

    .line 642
    .line 643
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    const/4 v0, 0x0

    .line 647
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const v0, 0x3cf5c28f    # 0.03f

    .line 651
    .line 652
    .line 653
    const/high16 v2, 0x41180000    # 9.5f

    .line 654
    .line 655
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const v0, 0x414170a4    # 12.09f

    .line 659
    .line 660
    .line 661
    const v2, 0x413eb852    # 11.92f

    .line 662
    .line 663
    .line 664
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 671
    .line 672
    .line 673
    move-result-object v2

    .line 674
    const/16 v16, 0x3800

    .line 675
    .line 676
    const/16 v17, 0x0

    .line 677
    .line 678
    const/high16 v6, 0x3f800000    # 1.0f

    .line 679
    .line 680
    const/high16 v8, 0x3f800000    # 1.0f

    .line 681
    .line 682
    const/4 v7, 0x0

    .line 683
    const/high16 v12, 0x3f800000    # 1.0f

    .line 684
    .line 685
    const/4 v13, 0x0

    .line 686
    const/4 v14, 0x0

    .line 687
    const/4 v15, 0x0

    .line 688
    const-string v4, ""

    .line 689
    .line 690
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 691
    .line 692
    .line 693
    move-result-object v0

    .line 694
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 695
    .line 696
    .line 697
    move-result-object v0

    .line 698
    sput-object v0, Landroidx/compose/material/icons/twotone/NestCamWiredStandKt;->_nestCamWiredStand:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 699
    .line 700
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 701
    .line 702
    .line 703
    return-object v0
.end method
