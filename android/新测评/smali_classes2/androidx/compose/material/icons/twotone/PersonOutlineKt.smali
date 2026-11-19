.class public final Landroidx/compose/material/icons/twotone/PersonOutlineKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_personOutline",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "PersonOutline",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getPersonOutline",
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
        "SMAP\nPersonOutline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersonOutline.kt\nandroidx/compose/material/icons/twotone/PersonOutlineKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,78:1\n212#2,12:79\n233#2,18:92\n253#2:129\n233#2,18:130\n253#2:167\n233#2,18:168\n253#2:205\n174#3:91\n705#4,2:110\n717#4,2:112\n719#4,11:118\n705#4,2:148\n717#4,2:150\n719#4,11:156\n705#4,2:186\n717#4,2:188\n719#4,11:194\n72#5,4:114\n72#5,4:152\n72#5,4:190\n*S KotlinDebug\n*F\n+ 1 PersonOutline.kt\nandroidx/compose/material/icons/twotone/PersonOutlineKt\n*L\n29#1:79,12\n30#1:92,18\n30#1:129\n36#1:130,18\n36#1:167\n45#1:168,18\n45#1:205\n29#1:91\n30#1:110,2\n30#1:112,2\n30#1:118,11\n36#1:148,2\n36#1:150,2\n36#1:156,11\n45#1:186,2\n45#1:188,2\n45#1:194,11\n30#1:114,4\n36#1:152,4\n45#1:190,4\n*E\n"
    }
.end annotation


# static fields
.field private static _personOutline:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPersonOutline(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PersonOutlineKt;->_personOutline:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.PersonOutline"

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
    const/high16 v4, 0x41000000    # 8.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v4, -0x3ff9999a    # -2.1f

    .line 78
    .line 79
    .line 80
    const/4 v6, 0x0

    .line 81
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const v26, 0x40866666    # 4.2f

    .line 85
    .line 86
    .line 87
    const/16 v27, 0x0

    .line 88
    .line 89
    const v21, 0x40066666    # 2.1f

    .line 90
    .line 91
    .line 92
    const v22, 0x40066666    # 2.1f

    .line 93
    .line 94
    .line 95
    const/16 v23, 0x0

    .line 96
    .line 97
    const/16 v24, 0x1

    .line 98
    .line 99
    const/16 v25, 0x1

    .line 100
    .line 101
    move-object/from16 v20, v2

    .line 102
    .line 103
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v26, -0x3f79999a    # -4.2f

    .line 107
    .line 108
    .line 109
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    const/16 v16, 0x3800

    .line 117
    .line 118
    const/16 v17, 0x0

    .line 119
    .line 120
    const v6, 0x3e99999a    # 0.3f

    .line 121
    .line 122
    .line 123
    const v8, 0x3e99999a    # 0.3f

    .line 124
    .line 125
    .line 126
    const/4 v7, 0x0

    .line 127
    const/high16 v9, 0x3f800000    # 1.0f

    .line 128
    .line 129
    const/high16 v12, 0x3f800000    # 1.0f

    .line 130
    .line 131
    const/4 v13, 0x0

    .line 132
    const/4 v14, 0x0

    .line 133
    const/4 v15, 0x0

    .line 134
    const-string v4, ""

    .line 135
    .line 136
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 137
    .line 138
    .line 139
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 144
    .line 145
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 146
    .line 147
    .line 148
    move-result-wide v6

    .line 149
    const/4 v2, 0x0

    .line 150
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 154
    .line 155
    .line 156
    move-result v10

    .line 157
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 158
    .line 159
    .line 160
    move-result v11

    .line 161
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 164
    .line 165
    .line 166
    const v4, 0x416e6666    # 14.9f

    .line 167
    .line 168
    .line 169
    const/high16 v6, 0x41400000    # 12.0f

    .line 170
    .line 171
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v25, -0x3f3ccccd    # -6.1f

    .line 175
    .line 176
    .line 177
    const v26, 0x40066666    # 2.1f

    .line 178
    .line 179
    .line 180
    const v21, -0x3fc1eb85    # -2.97f

    .line 181
    .line 182
    .line 183
    const/16 v22, 0x0

    .line 184
    .line 185
    const v23, -0x3f3ccccd    # -6.1f

    .line 186
    .line 187
    .line 188
    const v24, 0x3fbae148    # 1.46f

    .line 189
    .line 190
    .line 191
    move-object/from16 v20, v2

    .line 192
    .line 193
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v4, 0x3f8ccccd    # 1.1f

    .line 197
    .line 198
    .line 199
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v4, 0x41433333    # 12.2f

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v4, 0x41880000    # 17.0f

    .line 209
    .line 210
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v26, -0x3ff9999a    # -2.1f

    .line 214
    .line 215
    .line 216
    const/16 v21, 0x0

    .line 217
    .line 218
    const v22, -0x40dc28f6    # -0.64f

    .line 219
    .line 220
    .line 221
    const v23, -0x3fb7ae14    # -3.13f

    .line 222
    .line 223
    .line 224
    const v24, -0x3ff9999a    # -2.1f

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    const v6, 0x3e99999a    # 0.3f

    .line 238
    .line 239
    .line 240
    const/4 v7, 0x0

    .line 241
    const-string v4, ""

    .line 242
    .line 243
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 244
    .line 245
    .line 246
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 247
    .line 248
    .line 249
    move-result v3

    .line 250
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 251
    .line 252
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 253
    .line 254
    .line 255
    move-result-wide v6

    .line 256
    const/4 v0, 0x0

    .line 257
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 261
    .line 262
    .line 263
    move-result v10

    .line 264
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 265
    .line 266
    .line 267
    move-result v11

    .line 268
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 271
    .line 272
    .line 273
    const/high16 v0, 0x41500000    # 13.0f

    .line 274
    .line 275
    const/high16 v2, 0x41400000    # 12.0f

    .line 276
    .line 277
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v17, -0x3f000000    # -8.0f

    .line 281
    .line 282
    const/high16 v18, 0x40800000    # 4.0f

    .line 283
    .line 284
    const v13, -0x3fd51eb8    # -2.67f

    .line 285
    .line 286
    .line 287
    const/high16 v15, -0x3f000000    # -8.0f

    .line 288
    .line 289
    const v16, 0x3fab851f    # 1.34f

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v0, 0x40400000    # 3.0f

    .line 296
    .line 297
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v0, 0x41800000    # 16.0f

    .line 301
    .line 302
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 306
    .line 307
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v18, -0x3f800000    # -4.0f

    .line 311
    .line 312
    const/4 v13, 0x0

    .line 313
    const v14, -0x3fd5c28f    # -2.66f

    .line 314
    .line 315
    .line 316
    const v15, -0x3f5570a4    # -5.33f

    .line 317
    .line 318
    .line 319
    const/high16 v16, -0x3f800000    # -4.0f

    .line 320
    .line 321
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v0, 0x4190cccd    # 18.1f

    .line 328
    .line 329
    .line 330
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v0, 0x40bccccd    # 5.9f

    .line 334
    .line 335
    .line 336
    const v2, 0x4190cccd    # 18.1f

    .line 337
    .line 338
    .line 339
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v0, 0x41880000    # 17.0f

    .line 343
    .line 344
    const v2, 0x40bccccd    # 5.9f

    .line 345
    .line 346
    .line 347
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v17, 0x40c33333    # 6.1f

    .line 351
    .line 352
    .line 353
    const v18, -0x3ff9999a    # -2.1f

    .line 354
    .line 355
    .line 356
    const v14, -0x40dc28f6    # -0.64f

    .line 357
    .line 358
    .line 359
    const v15, 0x404851ec    # 3.13f

    .line 360
    .line 361
    .line 362
    const v16, -0x3ff9999a    # -2.1f

    .line 363
    .line 364
    .line 365
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v0, 0x3fbae148    # 1.46f

    .line 369
    .line 370
    .line 371
    const v2, 0x40066666    # 2.1f

    .line 372
    .line 373
    .line 374
    const v4, 0x40c33333    # 6.1f

    .line 375
    .line 376
    .line 377
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v0, 0x3f8ccccd    # 1.1f

    .line 381
    .line 382
    .line 383
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const/high16 v0, 0x41400000    # 12.0f

    .line 390
    .line 391
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v17, 0x40800000    # 4.0f

    .line 395
    .line 396
    const/high16 v18, -0x3f800000    # -4.0f

    .line 397
    .line 398
    const v13, 0x400d70a4    # 2.21f

    .line 399
    .line 400
    .line 401
    const/4 v14, 0x0

    .line 402
    const/high16 v15, 0x40800000    # 4.0f

    .line 403
    .line 404
    const v16, -0x401ae148    # -1.79f

    .line 405
    .line 406
    .line 407
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v0, -0x401ae148    # -1.79f

    .line 411
    .line 412
    .line 413
    const/high16 v2, -0x3f800000    # -4.0f

    .line 414
    .line 415
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v0, 0x3fe51eb8    # 1.79f

    .line 419
    .line 420
    .line 421
    const/high16 v2, 0x40800000    # 4.0f

    .line 422
    .line 423
    const/high16 v4, -0x3f800000    # -4.0f

    .line 424
    .line 425
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const v0, 0x40bccccd    # 5.9f

    .line 435
    .line 436
    .line 437
    const/high16 v2, 0x41400000    # 12.0f

    .line 438
    .line 439
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v17, 0x40066666    # 2.1f

    .line 443
    .line 444
    .line 445
    const v18, 0x40066666    # 2.1f

    .line 446
    .line 447
    .line 448
    const v13, 0x3f947ae1    # 1.16f

    .line 449
    .line 450
    .line 451
    const v15, 0x40066666    # 2.1f

    .line 452
    .line 453
    .line 454
    const v16, 0x3f70a3d7    # 0.94f

    .line 455
    .line 456
    .line 457
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v17, -0x3ff9999a    # -2.1f

    .line 461
    .line 462
    .line 463
    const/4 v13, 0x0

    .line 464
    const v14, 0x3f947ae1    # 1.16f

    .line 465
    .line 466
    .line 467
    const v15, -0x408f5c29    # -0.94f

    .line 468
    .line 469
    .line 470
    const v16, 0x40066666    # 2.1f

    .line 471
    .line 472
    .line 473
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const v0, 0x41128f5c    # 9.16f

    .line 477
    .line 478
    .line 479
    const v2, 0x411e6666    # 9.9f

    .line 480
    .line 481
    .line 482
    const/high16 v4, 0x41000000    # 8.0f

    .line 483
    .line 484
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v17, 0x40066666    # 2.1f

    .line 488
    .line 489
    .line 490
    const v18, -0x3ff9999a    # -2.1f

    .line 491
    .line 492
    .line 493
    const v14, -0x406b851f    # -1.16f

    .line 494
    .line 495
    .line 496
    const v15, 0x3f70a3d7    # 0.94f

    .line 497
    .line 498
    .line 499
    const v16, -0x3ff9999a    # -2.1f

    .line 500
    .line 501
    .line 502
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 509
    .line 510
    .line 511
    move-result-object v2

    .line 512
    const/16 v16, 0x3800

    .line 513
    .line 514
    const/16 v17, 0x0

    .line 515
    .line 516
    const/high16 v6, 0x3f800000    # 1.0f

    .line 517
    .line 518
    const/high16 v8, 0x3f800000    # 1.0f

    .line 519
    .line 520
    const/4 v7, 0x0

    .line 521
    const/high16 v12, 0x3f800000    # 1.0f

    .line 522
    .line 523
    const/4 v14, 0x0

    .line 524
    const/4 v15, 0x0

    .line 525
    const-string v4, ""

    .line 526
    .line 527
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    sput-object v0, Landroidx/compose/material/icons/twotone/PersonOutlineKt;->_personOutline:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 536
    .line 537
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 538
    .line 539
    .line 540
    return-object v0
.end method
