.class public final Landroidx/compose/material/icons/twotone/FlipCameraIosKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_flipCameraIos",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "FlipCameraIos",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getFlipCameraIos",
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
        "SMAP\nFlipCameraIos.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlipCameraIos.kt\nandroidx/compose/material/icons/twotone/FlipCameraIosKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,129:1\n212#2,12:130\n233#2,18:143\n253#2:180\n233#2,18:181\n253#2:218\n233#2,18:219\n253#2:256\n233#2,18:257\n253#2:294\n174#3:142\n705#4,2:161\n717#4,2:163\n719#4,11:169\n705#4,2:199\n717#4,2:201\n719#4,11:207\n705#4,2:237\n717#4,2:239\n719#4,11:245\n705#4,2:275\n717#4,2:277\n719#4,11:283\n72#5,4:165\n72#5,4:203\n72#5,4:241\n72#5,4:279\n*S KotlinDebug\n*F\n+ 1 FlipCameraIos.kt\nandroidx/compose/material/icons/twotone/FlipCameraIosKt\n*L\n29#1:130,12\n30#1:143,18\n30#1:180\n68#1:181,18\n68#1:218\n94#1:219,18\n94#1:256\n109#1:257,18\n109#1:294\n29#1:142\n30#1:161,2\n30#1:163,2\n30#1:169,11\n68#1:199,2\n68#1:201,2\n68#1:207,11\n94#1:237,2\n94#1:239,2\n94#1:245,11\n109#1:275,2\n109#1:277,2\n109#1:283,11\n30#1:165,4\n68#1:203,4\n94#1:241,4\n109#1:279,4\n*E\n"
    }
.end annotation


# static fields
.field private static _flipCameraIos:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFlipCameraIos(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/FlipCameraIosKt;->_flipCameraIos:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.FlipCameraIos"

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
    const v4, 0x4161eb85    # 14.12f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x40a00000    # 5.0f

    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, 0x411e147b    # 9.88f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const v4, 0x4100cccd    # 8.05f

    .line 85
    .line 86
    .line 87
    const/high16 v6, 0x40e00000    # 7.0f

    .line 88
    .line 89
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/high16 v4, 0x40800000    # 4.0f

    .line 93
    .line 94
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v4, 0x41400000    # 12.0f

    .line 98
    .line 99
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v4, 0x41800000    # 16.0f

    .line 103
    .line 104
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v4, 0x40e00000    # 7.0f

    .line 108
    .line 109
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v4, -0x3f7e6666    # -4.05f

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v4, 0x4161eb85    # 14.12f

    .line 119
    .line 120
    .line 121
    const/high16 v6, 0x40a00000    # 5.0f

    .line 122
    .line 123
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v4, 0x41900000    # 18.0f

    .line 130
    .line 131
    const/high16 v6, 0x41400000    # 12.0f

    .line 132
    .line 133
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v25, -0x3f600000    # -5.0f

    .line 137
    .line 138
    const/high16 v26, -0x3f600000    # -5.0f

    .line 139
    .line 140
    const v21, -0x3fcf5c29    # -2.76f

    .line 141
    .line 142
    .line 143
    const/16 v22, 0x0

    .line 144
    .line 145
    const/high16 v23, -0x3f600000    # -5.0f

    .line 146
    .line 147
    const v24, -0x3ff0a3d7    # -2.24f

    .line 148
    .line 149
    .line 150
    move-object/from16 v20, v2

    .line 151
    .line 152
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const/high16 v4, 0x40a00000    # 5.0f

    .line 156
    .line 157
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v4, -0x3fe0a3d7    # -2.49f

    .line 161
    .line 162
    .line 163
    const v6, 0x401f5c29    # 2.49f

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const/high16 v4, 0x40f00000    # 7.5f

    .line 170
    .line 171
    const/high16 v6, 0x41280000    # 10.5f

    .line 172
    .line 173
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v4, 0x41200000    # 10.0f

    .line 177
    .line 178
    const/high16 v6, 0x41500000    # 13.0f

    .line 179
    .line 180
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v4, 0x411f851f    # 9.97f

    .line 184
    .line 185
    .line 186
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/high16 v4, 0x41000000    # 8.0f

    .line 190
    .line 191
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v25, 0x40800000    # 4.0f

    .line 195
    .line 196
    const/high16 v26, 0x40800000    # 4.0f

    .line 197
    .line 198
    const/16 v21, 0x0

    .line 199
    .line 200
    const v22, 0x400d70a4    # 2.21f

    .line 201
    .line 202
    .line 203
    const v23, 0x3fe51eb8    # 1.79f

    .line 204
    .line 205
    .line 206
    const/high16 v24, 0x40800000    # 4.0f

    .line 207
    .line 208
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v25, 0x3fcf5c29    # 1.62f

    .line 212
    .line 213
    .line 214
    const v26, -0x414ccccd    # -0.35f

    .line 215
    .line 216
    .line 217
    const v21, 0x3f147ae1    # 0.58f

    .line 218
    .line 219
    .line 220
    const/16 v22, 0x0

    .line 221
    .line 222
    const v23, 0x3f90a3d7    # 1.13f

    .line 223
    .line 224
    .line 225
    const v24, -0x41fae148    # -0.13f

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v4, 0x3f3d70a4    # 0.74f

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/high16 v25, 0x41400000    # 12.0f

    .line 238
    .line 239
    const/high16 v26, 0x41900000    # 18.0f

    .line 240
    .line 241
    const v21, 0x415a6666    # 13.65f

    .line 242
    .line 243
    .line 244
    const v22, 0x418e147b    # 17.76f

    .line 245
    .line 246
    .line 247
    const v23, 0x414dc28f    # 12.86f

    .line 248
    .line 249
    .line 250
    const/high16 v24, 0x41900000    # 18.0f

    .line 251
    .line 252
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v4, 0x41980000    # 19.0f

    .line 259
    .line 260
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v4, -0x3fe0a3d7    # -2.49f

    .line 264
    .line 265
    .line 266
    const v6, 0x401f5c29    # 2.49f

    .line 267
    .line 268
    .line 269
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v4, 0x41840000    # 16.5f

    .line 273
    .line 274
    const/high16 v6, 0x41780000    # 15.5f

    .line 275
    .line 276
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const/high16 v4, 0x41600000    # 14.0f

    .line 280
    .line 281
    const/high16 v6, 0x41500000    # 13.0f

    .line 282
    .line 283
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v4, 0x3cf5c28f    # 0.03f

    .line 287
    .line 288
    .line 289
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/high16 v4, 0x41800000    # 16.0f

    .line 293
    .line 294
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const/high16 v25, -0x3f800000    # -4.0f

    .line 298
    .line 299
    const/high16 v26, -0x3f800000    # -4.0f

    .line 300
    .line 301
    const/16 v21, 0x0

    .line 302
    .line 303
    const v22, -0x3ff28f5c    # -2.21f

    .line 304
    .line 305
    .line 306
    const v23, -0x401ae148    # -1.79f

    .line 307
    .line 308
    .line 309
    const/high16 v24, -0x3f800000    # -4.0f

    .line 310
    .line 311
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v25, -0x4030a3d7    # -1.62f

    .line 315
    .line 316
    .line 317
    const v26, 0x3eb33333    # 0.35f

    .line 318
    .line 319
    .line 320
    const v21, -0x40eb851f    # -0.58f

    .line 321
    .line 322
    .line 323
    const/16 v22, 0x0

    .line 324
    .line 325
    const v23, -0x406f5c29    # -1.13f

    .line 326
    .line 327
    .line 328
    const v24, 0x3e051eb8    # 0.13f

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v4, 0x411a3d71    # 9.64f

    .line 335
    .line 336
    .line 337
    const v6, 0x4109eb85    # 8.62f

    .line 338
    .line 339
    .line 340
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const/high16 v25, 0x41400000    # 12.0f

    .line 344
    .line 345
    const/high16 v26, 0x41000000    # 8.0f

    .line 346
    .line 347
    const v21, 0x4125999a    # 10.35f

    .line 348
    .line 349
    .line 350
    const v22, 0x4103d70a    # 8.24f

    .line 351
    .line 352
    .line 353
    const v23, 0x41323d71    # 11.14f

    .line 354
    .line 355
    .line 356
    const/high16 v24, 0x41000000    # 8.0f

    .line 357
    .line 358
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const/high16 v25, 0x40a00000    # 5.0f

    .line 362
    .line 363
    const/high16 v26, 0x40a00000    # 5.0f

    .line 364
    .line 365
    const v21, 0x4030a3d7    # 2.76f

    .line 366
    .line 367
    .line 368
    const/16 v22, 0x0

    .line 369
    .line 370
    const/high16 v23, 0x40a00000    # 5.0f

    .line 371
    .line 372
    const v24, 0x400f5c29    # 2.24f

    .line 373
    .line 374
    .line 375
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v4, 0x41980000    # 19.0f

    .line 379
    .line 380
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    const/16 v16, 0x3800

    .line 391
    .line 392
    const/16 v17, 0x0

    .line 393
    .line 394
    const v6, 0x3e99999a    # 0.3f

    .line 395
    .line 396
    .line 397
    const v8, 0x3e99999a    # 0.3f

    .line 398
    .line 399
    .line 400
    const/4 v7, 0x0

    .line 401
    const/high16 v9, 0x3f800000    # 1.0f

    .line 402
    .line 403
    const/high16 v12, 0x3f800000    # 1.0f

    .line 404
    .line 405
    const/4 v13, 0x0

    .line 406
    const/4 v14, 0x0

    .line 407
    const/4 v15, 0x0

    .line 408
    const-string v4, ""

    .line 409
    .line 410
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 411
    .line 412
    .line 413
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 414
    .line 415
    .line 416
    move-result v3

    .line 417
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 418
    .line 419
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 420
    .line 421
    .line 422
    move-result-wide v6

    .line 423
    const/4 v2, 0x0

    .line 424
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 425
    .line 426
    .line 427
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 428
    .line 429
    .line 430
    move-result v10

    .line 431
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 432
    .line 433
    .line 434
    move-result v11

    .line 435
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 438
    .line 439
    .line 440
    const/high16 v4, 0x41a00000    # 20.0f

    .line 441
    .line 442
    const/high16 v6, 0x40a00000    # 5.0f

    .line 443
    .line 444
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v4, -0x3fb51eb8    # -3.17f

    .line 448
    .line 449
    .line 450
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v4, 0x41700000    # 15.0f

    .line 454
    .line 455
    const/high16 v6, 0x40400000    # 3.0f

    .line 456
    .line 457
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const/high16 v4, 0x41100000    # 9.0f

    .line 461
    .line 462
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const v4, 0x40e570a4    # 7.17f

    .line 466
    .line 467
    .line 468
    const/high16 v6, 0x40a00000    # 5.0f

    .line 469
    .line 470
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v4, 0x40800000    # 4.0f

    .line 474
    .line 475
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const/high16 v25, 0x40000000    # 2.0f

    .line 479
    .line 480
    const/high16 v26, 0x40e00000    # 7.0f

    .line 481
    .line 482
    const v21, 0x4039999a    # 2.9f

    .line 483
    .line 484
    .line 485
    const/high16 v22, 0x40a00000    # 5.0f

    .line 486
    .line 487
    const/high16 v23, 0x40000000    # 2.0f

    .line 488
    .line 489
    const v24, 0x40bccccd    # 5.9f

    .line 490
    .line 491
    .line 492
    move-object/from16 v20, v2

    .line 493
    .line 494
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const/high16 v4, 0x41400000    # 12.0f

    .line 498
    .line 499
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const/high16 v26, 0x40000000    # 2.0f

    .line 503
    .line 504
    const/16 v21, 0x0

    .line 505
    .line 506
    const v22, 0x3f8ccccd    # 1.1f

    .line 507
    .line 508
    .line 509
    const v23, 0x3f666666    # 0.9f

    .line 510
    .line 511
    .line 512
    const/high16 v24, 0x40000000    # 2.0f

    .line 513
    .line 514
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const/high16 v4, 0x41800000    # 16.0f

    .line 518
    .line 519
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const/high16 v26, -0x40000000    # -2.0f

    .line 523
    .line 524
    const v21, 0x3f8ccccd    # 1.1f

    .line 525
    .line 526
    .line 527
    const/16 v22, 0x0

    .line 528
    .line 529
    const/high16 v23, 0x40000000    # 2.0f

    .line 530
    .line 531
    const v24, -0x4099999a    # -0.9f

    .line 532
    .line 533
    .line 534
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const/high16 v4, 0x40e00000    # 7.0f

    .line 538
    .line 539
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const/high16 v25, 0x41a00000    # 20.0f

    .line 543
    .line 544
    const/high16 v26, 0x40a00000    # 5.0f

    .line 545
    .line 546
    const/high16 v21, 0x41b00000    # 22.0f

    .line 547
    .line 548
    const v22, 0x40bccccd    # 5.9f

    .line 549
    .line 550
    .line 551
    const v23, 0x41a8cccd    # 21.1f

    .line 552
    .line 553
    .line 554
    const/high16 v24, 0x40a00000    # 5.0f

    .line 555
    .line 556
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const/high16 v4, 0x41a00000    # 20.0f

    .line 563
    .line 564
    const/high16 v6, 0x41980000    # 19.0f

    .line 565
    .line 566
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const/high16 v4, 0x40800000    # 4.0f

    .line 570
    .line 571
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const/high16 v4, 0x40e00000    # 7.0f

    .line 575
    .line 576
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const v4, 0x4081999a    # 4.05f

    .line 580
    .line 581
    .line 582
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const/high16 v4, -0x40000000    # -2.0f

    .line 586
    .line 587
    const v6, 0x3fea3d71    # 1.83f

    .line 588
    .line 589
    .line 590
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const v4, 0x4087ae14    # 4.24f

    .line 594
    .line 595
    .line 596
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const/high16 v4, 0x40000000    # 2.0f

    .line 600
    .line 601
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const/high16 v4, 0x41a00000    # 20.0f

    .line 605
    .line 606
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const/high16 v4, 0x41980000    # 19.0f

    .line 610
    .line 611
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 618
    .line 619
    .line 620
    move-result-object v2

    .line 621
    const/high16 v6, 0x3f800000    # 1.0f

    .line 622
    .line 623
    const/high16 v8, 0x3f800000    # 1.0f

    .line 624
    .line 625
    const/4 v7, 0x0

    .line 626
    const-string v4, ""

    .line 627
    .line 628
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 629
    .line 630
    .line 631
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 632
    .line 633
    .line 634
    move-result v3

    .line 635
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 636
    .line 637
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 638
    .line 639
    .line 640
    move-result-wide v6

    .line 641
    const/4 v2, 0x0

    .line 642
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 643
    .line 644
    .line 645
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 646
    .line 647
    .line 648
    move-result v10

    .line 649
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 650
    .line 651
    .line 652
    move-result v11

    .line 653
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 656
    .line 657
    .line 658
    const/high16 v4, 0x41880000    # 17.0f

    .line 659
    .line 660
    const/high16 v6, 0x41400000    # 12.0f

    .line 661
    .line 662
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    const/high16 v25, -0x3f800000    # -4.0f

    .line 666
    .line 667
    const/high16 v26, -0x3f800000    # -4.0f

    .line 668
    .line 669
    const v21, -0x3ff28f5c    # -2.21f

    .line 670
    .line 671
    .line 672
    const/16 v22, 0x0

    .line 673
    .line 674
    const/high16 v23, -0x3f800000    # -4.0f

    .line 675
    .line 676
    const v24, -0x401ae148    # -1.79f

    .line 677
    .line 678
    .line 679
    move-object/from16 v20, v2

    .line 680
    .line 681
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const v4, 0x3ffc28f6    # 1.97f

    .line 685
    .line 686
    .line 687
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    const/high16 v4, 0x41200000    # 10.0f

    .line 691
    .line 692
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const/high16 v4, -0x3fe00000    # -2.5f

    .line 696
    .line 697
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    const v4, 0x3c23d70a    # 0.01f

    .line 701
    .line 702
    .line 703
    const v6, -0x43dc28f6    # -0.01f

    .line 704
    .line 705
    .line 706
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    const/high16 v4, 0x41500000    # 13.0f

    .line 710
    .line 711
    const/high16 v6, 0x40a00000    # 5.0f

    .line 712
    .line 713
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 714
    .line 715
    .line 716
    const/high16 v4, 0x40000000    # 2.0f

    .line 717
    .line 718
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    const/high16 v25, 0x40a00000    # 5.0f

    .line 722
    .line 723
    const/high16 v26, 0x40a00000    # 5.0f

    .line 724
    .line 725
    const/16 v21, 0x0

    .line 726
    .line 727
    const v22, 0x4030a3d7    # 2.76f

    .line 728
    .line 729
    .line 730
    const v23, 0x400f5c29    # 2.24f

    .line 731
    .line 732
    .line 733
    const/high16 v24, 0x40a00000    # 5.0f

    .line 734
    .line 735
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 736
    .line 737
    .line 738
    const v25, 0x40170a3d    # 2.36f

    .line 739
    .line 740
    .line 741
    const v26, -0x40e147ae    # -0.62f

    .line 742
    .line 743
    .line 744
    const v21, 0x3f5c28f6    # 0.86f

    .line 745
    .line 746
    .line 747
    const/16 v22, 0x0

    .line 748
    .line 749
    const v23, 0x3fd33333    # 1.65f

    .line 750
    .line 751
    .line 752
    const v24, -0x418a3d71    # -0.24f

    .line 753
    .line 754
    .line 755
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 756
    .line 757
    .line 758
    const v4, -0x40c28f5c    # -0.74f

    .line 759
    .line 760
    .line 761
    const v6, -0x40c28f5c    # -0.74f

    .line 762
    .line 763
    .line 764
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 765
    .line 766
    .line 767
    const/high16 v25, 0x41400000    # 12.0f

    .line 768
    .line 769
    const/high16 v26, 0x41880000    # 17.0f

    .line 770
    .line 771
    const v21, 0x4152147b    # 13.13f

    .line 772
    .line 773
    .line 774
    const v22, 0x4186f5c3    # 16.87f

    .line 775
    .line 776
    .line 777
    const v23, 0x414947ae    # 12.58f

    .line 778
    .line 779
    .line 780
    const/high16 v24, 0x41880000    # 17.0f

    .line 781
    .line 782
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 783
    .line 784
    .line 785
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 786
    .line 787
    .line 788
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 789
    .line 790
    .line 791
    move-result-object v2

    .line 792
    const/high16 v6, 0x3f800000    # 1.0f

    .line 793
    .line 794
    const/4 v7, 0x0

    .line 795
    const-string v4, ""

    .line 796
    .line 797
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 798
    .line 799
    .line 800
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 801
    .line 802
    .line 803
    move-result v3

    .line 804
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 805
    .line 806
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 807
    .line 808
    .line 809
    move-result-wide v6

    .line 810
    const/4 v0, 0x0

    .line 811
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 812
    .line 813
    .line 814
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 815
    .line 816
    .line 817
    move-result v10

    .line 818
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 819
    .line 820
    .line 821
    move-result v11

    .line 822
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 823
    .line 824
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 825
    .line 826
    .line 827
    const/high16 v0, 0x41000000    # 8.0f

    .line 828
    .line 829
    const/high16 v2, 0x41400000    # 12.0f

    .line 830
    .line 831
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 832
    .line 833
    .line 834
    const v17, -0x3fe8f5c3    # -2.36f

    .line 835
    .line 836
    .line 837
    const v18, 0x3f1eb852    # 0.62f

    .line 838
    .line 839
    .line 840
    const v13, -0x40a3d70a    # -0.86f

    .line 841
    .line 842
    .line 843
    const v15, -0x402ccccd    # -1.65f

    .line 844
    .line 845
    .line 846
    const v16, 0x3e75c28f    # 0.24f

    .line 847
    .line 848
    .line 849
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 850
    .line 851
    .line 852
    const v0, 0x3f3ae148    # 0.73f

    .line 853
    .line 854
    .line 855
    const v2, 0x3f3d70a4    # 0.74f

    .line 856
    .line 857
    .line 858
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 859
    .line 860
    .line 861
    const/high16 v17, 0x41400000    # 12.0f

    .line 862
    .line 863
    const/high16 v18, 0x41100000    # 9.0f

    .line 864
    .line 865
    const v13, 0x412deb85    # 10.87f

    .line 866
    .line 867
    .line 868
    const v14, 0x4112147b    # 9.13f

    .line 869
    .line 870
    .line 871
    const v15, 0x4136b852    # 11.42f

    .line 872
    .line 873
    .line 874
    const/high16 v16, 0x41100000    # 9.0f

    .line 875
    .line 876
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 877
    .line 878
    .line 879
    const/high16 v17, 0x40800000    # 4.0f

    .line 880
    .line 881
    const/high16 v18, 0x40800000    # 4.0f

    .line 882
    .line 883
    const v13, 0x400d70a4    # 2.21f

    .line 884
    .line 885
    .line 886
    const/4 v14, 0x0

    .line 887
    const/high16 v15, 0x40800000    # 4.0f

    .line 888
    .line 889
    const v16, 0x3fe51eb8    # 1.79f

    .line 890
    .line 891
    .line 892
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 893
    .line 894
    .line 895
    const v0, -0x4003d70a    # -1.97f

    .line 896
    .line 897
    .line 898
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 899
    .line 900
    .line 901
    const/high16 v0, 0x41600000    # 14.0f

    .line 902
    .line 903
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 904
    .line 905
    .line 906
    const/high16 v0, 0x40200000    # 2.5f

    .line 907
    .line 908
    const/high16 v2, 0x40200000    # 2.5f

    .line 909
    .line 910
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 911
    .line 912
    .line 913
    const v0, 0x3c23d70a    # 0.01f

    .line 914
    .line 915
    .line 916
    const v2, -0x43dc28f6    # -0.01f

    .line 917
    .line 918
    .line 919
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 920
    .line 921
    .line 922
    const/high16 v0, 0x41980000    # 19.0f

    .line 923
    .line 924
    const/high16 v2, 0x41500000    # 13.0f

    .line 925
    .line 926
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 927
    .line 928
    .line 929
    const/high16 v0, -0x40000000    # -2.0f

    .line 930
    .line 931
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 932
    .line 933
    .line 934
    const/high16 v17, 0x41400000    # 12.0f

    .line 935
    .line 936
    const/high16 v18, 0x41000000    # 8.0f

    .line 937
    .line 938
    const/high16 v13, 0x41880000    # 17.0f

    .line 939
    .line 940
    const v14, 0x4123d70a    # 10.24f

    .line 941
    .line 942
    .line 943
    const v15, 0x416c28f6    # 14.76f

    .line 944
    .line 945
    .line 946
    const/high16 v16, 0x41000000    # 8.0f

    .line 947
    .line 948
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 949
    .line 950
    .line 951
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 952
    .line 953
    .line 954
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 955
    .line 956
    .line 957
    move-result-object v2

    .line 958
    const/16 v16, 0x3800

    .line 959
    .line 960
    const/16 v17, 0x0

    .line 961
    .line 962
    const/high16 v6, 0x3f800000    # 1.0f

    .line 963
    .line 964
    const/4 v7, 0x0

    .line 965
    const/high16 v12, 0x3f800000    # 1.0f

    .line 966
    .line 967
    const/4 v13, 0x0

    .line 968
    const/4 v14, 0x0

    .line 969
    const/4 v15, 0x0

    .line 970
    const-string v4, ""

    .line 971
    .line 972
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 973
    .line 974
    .line 975
    move-result-object v0

    .line 976
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 977
    .line 978
    .line 979
    move-result-object v0

    .line 980
    sput-object v0, Landroidx/compose/material/icons/twotone/FlipCameraIosKt;->_flipCameraIos:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 981
    .line 982
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 983
    .line 984
    .line 985
    return-object v0
.end method
