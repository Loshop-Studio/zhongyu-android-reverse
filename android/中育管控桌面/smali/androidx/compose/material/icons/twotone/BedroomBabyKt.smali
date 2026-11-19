.class public final Landroidx/compose/material/icons/twotone/BedroomBabyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_bedroomBaby",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "BedroomBaby",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getBedroomBaby",
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
        "SMAP\nBedroomBaby.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BedroomBaby.kt\nandroidx/compose/material/icons/twotone/BedroomBabyKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,125:1\n212#2,12:126\n233#2,18:139\n253#2:176\n233#2,18:177\n253#2:214\n233#2,18:215\n253#2:252\n233#2,18:253\n253#2:290\n174#3:138\n705#4,2:157\n717#4,2:159\n719#4,11:165\n705#4,2:195\n717#4,2:197\n719#4,11:203\n705#4,2:233\n717#4,2:235\n719#4,11:241\n705#4,2:271\n717#4,2:273\n719#4,11:279\n72#5,4:161\n72#5,4:199\n72#5,4:237\n72#5,4:275\n*S KotlinDebug\n*F\n+ 1 BedroomBaby.kt\nandroidx/compose/material/icons/twotone/BedroomBabyKt\n*L\n29#1:126,12\n30#1:139,18\n30#1:176\n59#1:177,18\n59#1:214\n70#1:215,18\n70#1:252\n102#1:253,18\n102#1:290\n29#1:138\n30#1:157,2\n30#1:159,2\n30#1:165,11\n59#1:195,2\n59#1:197,2\n59#1:203,11\n70#1:233,2\n70#1:235,2\n70#1:241,11\n102#1:271,2\n102#1:273,2\n102#1:279,11\n30#1:161,4\n59#1:199,4\n70#1:237,4\n102#1:275,4\n*E\n"
    }
.end annotation


# static fields
.field private static _bedroomBaby:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBedroomBaby(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/BedroomBabyKt;->_bedroomBaby:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.BedroomBaby"

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
    const/high16 v4, 0x41a00000    # 20.0f

    .line 71
    .line 72
    const/high16 v6, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x41800000    # 16.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x40800000    # 4.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    .line 90
    const/high16 v4, 0x41a00000    # 20.0f

    .line 91
    .line 92
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v4, 0x41280000    # 10.5f

    .line 99
    .line 100
    const v6, 0x40ce6666    # 6.45f

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v4, -0x408ccccd    # -0.95f

    .line 107
    .line 108
    .line 109
    const/high16 v6, -0x40800000    # -1.0f

    .line 110
    .line 111
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v4, 0x40f851ec    # 7.76f

    .line 115
    .line 116
    .line 117
    const/high16 v6, 0x40e00000    # 7.0f

    .line 118
    .line 119
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v4, 0x40c00000    # 6.0f

    .line 123
    .line 124
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v4, 0x4069999a    # 3.65f

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v4, 0x3fdd70a4    # 1.73f

    .line 134
    .line 135
    .line 136
    const/high16 v6, 0x40400000    # 3.0f

    .line 137
    .line 138
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v4, 0x41880000    # 17.0f

    .line 142
    .line 143
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v4, 0x3f800000    # 1.0f

    .line 147
    .line 148
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v4, -0x40800000    # -1.0f

    .line 152
    .line 153
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const/high16 v4, 0x40200000    # 2.5f

    .line 157
    .line 158
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const v4, 0x3f570a3d    # 0.84f

    .line 162
    .line 163
    .line 164
    const v6, 0x3fbae148    # 1.46f

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v25, 0x3f8ccccd    # 1.1f

    .line 171
    .line 172
    .line 173
    const v26, -0x40947ae1    # -0.92f

    .line 174
    .line 175
    .line 176
    const v21, 0x3ec7ae14    # 0.39f

    .line 177
    .line 178
    .line 179
    const v22, -0x4170a3d7    # -0.28f

    .line 180
    .line 181
    .line 182
    const v23, 0x3f428f5c    # 0.76f

    .line 183
    .line 184
    .line 185
    const v24, -0x40eb851f    # -0.58f

    .line 186
    .line 187
    .line 188
    move-object/from16 v20, v2

    .line 189
    .line 190
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v4, 0x41980000    # 19.0f

    .line 194
    .line 195
    const v6, 0x4171999a    # 15.1f

    .line 196
    .line 197
    .line 198
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v25, -0x3f200000    # -7.0f

    .line 202
    .line 203
    const v26, 0x4039999a    # 2.9f

    .line 204
    .line 205
    .line 206
    const v21, -0x4010a3d7    # -1.87f

    .line 207
    .line 208
    .line 209
    const v22, 0x3fef5c29    # 1.87f

    .line 210
    .line 211
    .line 212
    const v23, -0x3f747ae1    # -4.36f

    .line 213
    .line 214
    .line 215
    const v24, 0x4039999a    # 2.9f

    .line 216
    .line 217
    .line 218
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v4, -0x3f5bd70a    # -5.13f

    .line 222
    .line 223
    .line 224
    const/high16 v6, -0x3f200000    # -7.0f

    .line 225
    .line 226
    const v7, -0x3fc66666    # -2.9f

    .line 227
    .line 228
    .line 229
    const v8, -0x407c28f6    # -1.03f

    .line 230
    .line 231
    .line 232
    invoke-virtual {v2, v4, v8, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v4, 0x3f87ae14    # 1.06f

    .line 236
    .line 237
    .line 238
    const v6, -0x407851ec    # -1.06f

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v25, 0x3f8ccccd    # 1.1f

    .line 245
    .line 246
    .line 247
    const v26, 0x3f6b851f    # 0.92f

    .line 248
    .line 249
    .line 250
    const v21, 0x3eae147b    # 0.34f

    .line 251
    .line 252
    .line 253
    const v22, 0x3eae147b    # 0.34f

    .line 254
    .line 255
    .line 256
    const v23, 0x3f35c28f    # 0.71f

    .line 257
    .line 258
    .line 259
    const v24, 0x3f266666    # 0.65f

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v4, 0x41580000    # 13.5f

    .line 266
    .line 267
    const/high16 v6, 0x41000000    # 8.0f

    .line 268
    .line 269
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v4, 0x411828f6    # 9.51f

    .line 273
    .line 274
    .line 275
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/high16 v4, 0x41280000    # 10.5f

    .line 279
    .line 280
    const v6, 0x40ce6666    # 6.45f

    .line 281
    .line 282
    .line 283
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    const/16 v16, 0x3800

    .line 294
    .line 295
    const/16 v17, 0x0

    .line 296
    .line 297
    const v6, 0x3e99999a    # 0.3f

    .line 298
    .line 299
    .line 300
    const v8, 0x3e99999a    # 0.3f

    .line 301
    .line 302
    .line 303
    const/4 v7, 0x0

    .line 304
    const/high16 v9, 0x3f800000    # 1.0f

    .line 305
    .line 306
    const/high16 v12, 0x3f800000    # 1.0f

    .line 307
    .line 308
    const/4 v13, 0x0

    .line 309
    const/4 v14, 0x0

    .line 310
    const/4 v15, 0x0

    .line 311
    const-string v4, ""

    .line 312
    .line 313
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 314
    .line 315
    .line 316
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 317
    .line 318
    .line 319
    move-result v3

    .line 320
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 321
    .line 322
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 323
    .line 324
    .line 325
    move-result-wide v6

    .line 326
    const/4 v2, 0x0

    .line 327
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 331
    .line 332
    .line 333
    move-result v10

    .line 334
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 335
    .line 336
    .line 337
    move-result v11

    .line 338
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 341
    .line 342
    .line 343
    const v4, 0x417b5c29    # 15.71f

    .line 344
    .line 345
    .line 346
    const v6, 0x41787ae1    # 15.53f

    .line 347
    .line 348
    .line 349
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const v4, -0x428a3d71    # -0.06f

    .line 353
    .line 354
    .line 355
    const v6, -0x430a3d71    # -0.03f

    .line 356
    .line 357
    .line 358
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v4, -0x404b851f    # -1.41f

    .line 362
    .line 363
    .line 364
    const v6, -0x40b0a3d7    # -0.81f

    .line 365
    .line 366
    .line 367
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v25, -0x3f533333    # -5.4f

    .line 371
    .line 372
    .line 373
    const/16 v26, 0x0

    .line 374
    .line 375
    const v21, -0x402147ae    # -1.74f

    .line 376
    .line 377
    .line 378
    const v22, 0x3f266666    # 0.65f

    .line 379
    .line 380
    .line 381
    const v23, -0x3f95c28f    # -3.66f

    .line 382
    .line 383
    .line 384
    move-object/from16 v20, v2

    .line 385
    .line 386
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v4, 0x3fb47ae1    # 1.41f

    .line 390
    .line 391
    .line 392
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v4, 0x3d75c28f    # 0.06f

    .line 396
    .line 397
    .line 398
    const v6, -0x430a3d71    # -0.03f

    .line 399
    .line 400
    .line 401
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v25, 0x4061eb85    # 3.53f

    .line 405
    .line 406
    .line 407
    const v26, 0x3f4a3d71    # 0.79f

    .line 408
    .line 409
    .line 410
    const v21, 0x3f8ccccd    # 1.1f

    .line 411
    .line 412
    .line 413
    const v22, 0x3f051eb8    # 0.52f

    .line 414
    .line 415
    .line 416
    const v23, 0x4011eb85    # 2.28f

    .line 417
    .line 418
    .line 419
    const v24, 0x3f4a3d71    # 0.79f

    .line 420
    .line 421
    .line 422
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const v4, 0x4166e148    # 14.43f

    .line 426
    .line 427
    .line 428
    const v6, 0x4181c28f    # 16.22f

    .line 429
    .line 430
    .line 431
    const v7, 0x417b5c29    # 15.71f

    .line 432
    .line 433
    .line 434
    const v8, 0x41787ae1    # 15.53f

    .line 435
    .line 436
    .line 437
    invoke-virtual {v2, v4, v6, v8, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 444
    .line 445
    .line 446
    move-result-object v2

    .line 447
    const v6, 0x3e99999a    # 0.3f

    .line 448
    .line 449
    .line 450
    const v8, 0x3e99999a    # 0.3f

    .line 451
    .line 452
    .line 453
    const/4 v7, 0x0

    .line 454
    const-string v4, ""

    .line 455
    .line 456
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 457
    .line 458
    .line 459
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 460
    .line 461
    .line 462
    move-result v3

    .line 463
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 464
    .line 465
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 466
    .line 467
    .line 468
    move-result-wide v6

    .line 469
    const/4 v2, 0x0

    .line 470
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 471
    .line 472
    .line 473
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 474
    .line 475
    .line 476
    move-result v10

    .line 477
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 478
    .line 479
    .line 480
    move-result v11

    .line 481
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 484
    .line 485
    .line 486
    const v4, 0x40e51eb8    # 7.16f

    .line 487
    .line 488
    .line 489
    const v6, 0x416f5c29    # 14.96f

    .line 490
    .line 491
    .line 492
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const v25, -0x40733333    # -1.1f

    .line 496
    .line 497
    .line 498
    const v26, -0x40947ae1    # -0.92f

    .line 499
    .line 500
    .line 501
    const v21, -0x413851ec    # -0.39f

    .line 502
    .line 503
    .line 504
    const v22, -0x4175c28f    # -0.27f

    .line 505
    .line 506
    .line 507
    const v23, -0x40bd70a4    # -0.76f

    .line 508
    .line 509
    .line 510
    const v24, -0x40eb851f    # -0.58f

    .line 511
    .line 512
    .line 513
    move-object/from16 v20, v2

    .line 514
    .line 515
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const/high16 v4, 0x40a00000    # 5.0f

    .line 519
    .line 520
    const v6, 0x4171999a    # 15.1f

    .line 521
    .line 522
    .line 523
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const/high16 v25, 0x40e00000    # 7.0f

    .line 527
    .line 528
    const v26, 0x4039999a    # 2.9f

    .line 529
    .line 530
    .line 531
    const v21, 0x3fef5c29    # 1.87f

    .line 532
    .line 533
    .line 534
    const v22, 0x3fef5c29    # 1.87f

    .line 535
    .line 536
    .line 537
    const v23, 0x408b851f    # 4.36f

    .line 538
    .line 539
    .line 540
    const v24, 0x4039999a    # 2.9f

    .line 541
    .line 542
    .line 543
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const v4, 0x40a428f6    # 5.13f

    .line 547
    .line 548
    .line 549
    const v6, -0x3fc66666    # -2.9f

    .line 550
    .line 551
    .line 552
    const v7, -0x407c28f6    # -1.03f

    .line 553
    .line 554
    .line 555
    const/high16 v8, 0x40e00000    # 7.0f

    .line 556
    .line 557
    invoke-virtual {v2, v4, v7, v8, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v4, -0x407851ec    # -1.06f

    .line 561
    .line 562
    .line 563
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const v25, -0x40733333    # -1.1f

    .line 567
    .line 568
    .line 569
    const v26, 0x3f6b851f    # 0.92f

    .line 570
    .line 571
    .line 572
    const v21, -0x4151eb85    # -0.34f

    .line 573
    .line 574
    .line 575
    const v22, 0x3eae147b    # 0.34f

    .line 576
    .line 577
    .line 578
    const v23, -0x40ca3d71    # -0.71f

    .line 579
    .line 580
    .line 581
    const v24, 0x3f23d70a    # 0.64f

    .line 582
    .line 583
    .line 584
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const/high16 v4, 0x41580000    # 13.5f

    .line 588
    .line 589
    const/high16 v6, 0x41800000    # 16.0f

    .line 590
    .line 591
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const/high16 v4, 0x41300000    # 11.0f

    .line 595
    .line 596
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const/high16 v4, 0x3f800000    # 1.0f

    .line 600
    .line 601
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const/high16 v4, -0x40800000    # -1.0f

    .line 605
    .line 606
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const v4, -0x3f4c28f6    # -5.62f

    .line 610
    .line 611
    .line 612
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const v4, 0x411a6666    # 9.65f

    .line 616
    .line 617
    .line 618
    const/high16 v6, 0x40e00000    # 7.0f

    .line 619
    .line 620
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const/high16 v4, 0x40c00000    # 6.0f

    .line 624
    .line 625
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const v4, 0x3f428f5c    # 0.76f

    .line 629
    .line 630
    .line 631
    const/high16 v6, 0x3f800000    # 1.0f

    .line 632
    .line 633
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const/high16 v4, 0x40b00000    # 5.5f

    .line 637
    .line 638
    const/high16 v6, 0x41180000    # 9.5f

    .line 639
    .line 640
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const v4, 0x3f733333    # 0.95f

    .line 644
    .line 645
    .line 646
    const/high16 v6, 0x3f800000    # 1.0f

    .line 647
    .line 648
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    const v4, 0x411828f6    # 9.51f

    .line 652
    .line 653
    .line 654
    const/high16 v6, 0x41000000    # 8.0f

    .line 655
    .line 656
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    const v4, 0x407f5c29    # 3.99f

    .line 660
    .line 661
    .line 662
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    const v4, 0x40e51eb8    # 7.16f

    .line 666
    .line 667
    .line 668
    const v6, 0x416f5c29    # 14.96f

    .line 669
    .line 670
    .line 671
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    const v4, 0x4107ae14    # 8.48f

    .line 678
    .line 679
    .line 680
    const v6, 0x417a6666    # 15.65f

    .line 681
    .line 682
    .line 683
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    .line 686
    const v4, 0x3f4f5c29    # 0.81f

    .line 687
    .line 688
    .line 689
    const v6, -0x404b851f    # -1.41f

    .line 690
    .line 691
    .line 692
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const v25, 0x40accccd    # 5.4f

    .line 696
    .line 697
    .line 698
    const/16 v26, 0x0

    .line 699
    .line 700
    const v21, 0x3fdeb852    # 1.74f

    .line 701
    .line 702
    .line 703
    const v22, 0x3f266666    # 0.65f

    .line 704
    .line 705
    .line 706
    const v23, 0x406a3d71    # 3.66f

    .line 707
    .line 708
    .line 709
    const v24, 0x3f266666    # 0.65f

    .line 710
    .line 711
    .line 712
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 713
    .line 714
    .line 715
    const v6, 0x3fb47ae1    # 1.41f

    .line 716
    .line 717
    .line 718
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    const v4, 0x3cf5c28f    # 0.03f

    .line 722
    .line 723
    .line 724
    const v6, 0x3d75c28f    # 0.06f

    .line 725
    .line 726
    .line 727
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    const v25, -0x3f9ccccd    # -3.55f

    .line 731
    .line 732
    .line 733
    const v26, 0x3f4a3d71    # 0.79f

    .line 734
    .line 735
    .line 736
    const v21, -0x40733333    # -1.1f

    .line 737
    .line 738
    .line 739
    const v22, 0x3f028f5c    # 0.51f

    .line 740
    .line 741
    .line 742
    const v23, -0x3feccccd    # -2.3f

    .line 743
    .line 744
    .line 745
    const v24, 0x3f4a3d71    # 0.79f

    .line 746
    .line 747
    .line 748
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 749
    .line 750
    .line 751
    const v4, -0x3f9e147b    # -3.53f

    .line 752
    .line 753
    .line 754
    const v6, -0x40b5c28f    # -0.79f

    .line 755
    .line 756
    .line 757
    const v7, -0x3fe47ae1    # -2.43f

    .line 758
    .line 759
    .line 760
    const v8, -0x4175c28f    # -0.27f

    .line 761
    .line 762
    .line 763
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 764
    .line 765
    .line 766
    const v4, 0x4107ae14    # 8.48f

    .line 767
    .line 768
    .line 769
    const v6, 0x417a6666    # 15.65f

    .line 770
    .line 771
    .line 772
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 773
    .line 774
    .line 775
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 776
    .line 777
    .line 778
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 779
    .line 780
    .line 781
    move-result-object v2

    .line 782
    const/high16 v6, 0x3f800000    # 1.0f

    .line 783
    .line 784
    const/high16 v8, 0x3f800000    # 1.0f

    .line 785
    .line 786
    const/4 v7, 0x0

    .line 787
    const-string v4, ""

    .line 788
    .line 789
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 790
    .line 791
    .line 792
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 793
    .line 794
    .line 795
    move-result v3

    .line 796
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 797
    .line 798
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 799
    .line 800
    .line 801
    move-result-wide v6

    .line 802
    const/4 v0, 0x0

    .line 803
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 804
    .line 805
    .line 806
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 807
    .line 808
    .line 809
    move-result v10

    .line 810
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 811
    .line 812
    .line 813
    move-result v11

    .line 814
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 815
    .line 816
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 817
    .line 818
    .line 819
    const/high16 v0, 0x40000000    # 2.0f

    .line 820
    .line 821
    const/high16 v2, 0x41a00000    # 20.0f

    .line 822
    .line 823
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 824
    .line 825
    .line 826
    const/high16 v0, 0x40800000    # 4.0f

    .line 827
    .line 828
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 829
    .line 830
    .line 831
    const/high16 v17, 0x40000000    # 2.0f

    .line 832
    .line 833
    const/high16 v18, 0x40800000    # 4.0f

    .line 834
    .line 835
    const v13, 0x4039999a    # 2.9f

    .line 836
    .line 837
    .line 838
    const/high16 v14, 0x40000000    # 2.0f

    .line 839
    .line 840
    const/high16 v15, 0x40000000    # 2.0f

    .line 841
    .line 842
    const v16, 0x4039999a    # 2.9f

    .line 843
    .line 844
    .line 845
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 846
    .line 847
    .line 848
    const/high16 v0, 0x41800000    # 16.0f

    .line 849
    .line 850
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 851
    .line 852
    .line 853
    const/high16 v18, 0x40000000    # 2.0f

    .line 854
    .line 855
    const/4 v13, 0x0

    .line 856
    const v14, 0x3f8ccccd    # 1.1f

    .line 857
    .line 858
    .line 859
    const v15, 0x3f666666    # 0.9f

    .line 860
    .line 861
    .line 862
    const/high16 v16, 0x40000000    # 2.0f

    .line 863
    .line 864
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 865
    .line 866
    .line 867
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 868
    .line 869
    .line 870
    const/high16 v18, -0x40000000    # -2.0f

    .line 871
    .line 872
    const v13, 0x3f8ccccd    # 1.1f

    .line 873
    .line 874
    .line 875
    const/4 v14, 0x0

    .line 876
    const/high16 v15, 0x40000000    # 2.0f

    .line 877
    .line 878
    const v16, -0x4099999a    # -0.9f

    .line 879
    .line 880
    .line 881
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 882
    .line 883
    .line 884
    const/high16 v0, 0x40800000    # 4.0f

    .line 885
    .line 886
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 887
    .line 888
    .line 889
    const/high16 v17, 0x41a00000    # 20.0f

    .line 890
    .line 891
    const/high16 v18, 0x40000000    # 2.0f

    .line 892
    .line 893
    const/high16 v13, 0x41b00000    # 22.0f

    .line 894
    .line 895
    const v14, 0x4039999a    # 2.9f

    .line 896
    .line 897
    .line 898
    const v15, 0x41a8cccd    # 21.1f

    .line 899
    .line 900
    .line 901
    const/high16 v16, 0x40000000    # 2.0f

    .line 902
    .line 903
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 904
    .line 905
    .line 906
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 907
    .line 908
    .line 909
    const/high16 v0, 0x41a00000    # 20.0f

    .line 910
    .line 911
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 912
    .line 913
    .line 914
    const/high16 v0, 0x40800000    # 4.0f

    .line 915
    .line 916
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 917
    .line 918
    .line 919
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 920
    .line 921
    .line 922
    const/high16 v0, 0x41800000    # 16.0f

    .line 923
    .line 924
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 925
    .line 926
    .line 927
    const/high16 v0, 0x41a00000    # 20.0f

    .line 928
    .line 929
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 930
    .line 931
    .line 932
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 933
    .line 934
    .line 935
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 936
    .line 937
    .line 938
    move-result-object v2

    .line 939
    const/16 v16, 0x3800

    .line 940
    .line 941
    const/16 v17, 0x0

    .line 942
    .line 943
    const/high16 v6, 0x3f800000    # 1.0f

    .line 944
    .line 945
    const/4 v7, 0x0

    .line 946
    const/high16 v12, 0x3f800000    # 1.0f

    .line 947
    .line 948
    const/4 v13, 0x0

    .line 949
    const/4 v14, 0x0

    .line 950
    const/4 v15, 0x0

    .line 951
    const-string v4, ""

    .line 952
    .line 953
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 954
    .line 955
    .line 956
    move-result-object v0

    .line 957
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 958
    .line 959
    .line 960
    move-result-object v0

    .line 961
    sput-object v0, Landroidx/compose/material/icons/twotone/BedroomBabyKt;->_bedroomBaby:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 962
    .line 963
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 964
    .line 965
    .line 966
    return-object v0
.end method
