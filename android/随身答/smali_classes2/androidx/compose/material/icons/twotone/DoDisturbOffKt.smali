.class public final Landroidx/compose/material/icons/twotone/DoDisturbOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_doDisturbOff",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "DoDisturbOff",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getDoDisturbOff",
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
        "SMAP\nDoDisturbOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoDisturbOff.kt\nandroidx/compose/material/icons/twotone/DoDisturbOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,94:1\n212#2,12:95\n233#2,18:108\n253#2:145\n233#2,18:146\n253#2:183\n174#3:107\n705#4,2:126\n717#4,2:128\n719#4,11:134\n705#4,2:164\n717#4,2:166\n719#4,11:172\n72#5,4:130\n72#5,4:168\n*S KotlinDebug\n*F\n+ 1 DoDisturbOff.kt\nandroidx/compose/material/icons/twotone/DoDisturbOffKt\n*L\n29#1:95,12\n30#1:108,18\n30#1:145\n52#1:146,18\n52#1:183\n29#1:107\n30#1:126,2\n30#1:128,2\n30#1:134,11\n52#1:164,2\n52#1:166,2\n52#1:172,11\n30#1:130,4\n52#1:168,4\n*E\n"
    }
.end annotation


# static fields
.field private static _doDisturbOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDoDisturbOff(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/DoDisturbOffKt;->_doDisturbOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.DoDisturbOff"

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
    const/high16 v4, 0x40800000    # 4.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v25, -0x3f87ae14    # -3.88f

    .line 78
    .line 79
    .line 80
    const v26, 0x3f8147ae    # 1.01f

    .line 81
    .line 82
    .line 83
    const v21, -0x404b851f    # -1.41f

    .line 84
    .line 85
    .line 86
    const/16 v22, 0x0

    .line 87
    .line 88
    const v23, -0x3fd147ae    # -2.73f

    .line 89
    .line 90
    .line 91
    const v24, 0x3ebd70a4    # 0.37f

    .line 92
    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v4, 0x40c00000    # 6.0f

    .line 100
    .line 101
    const v6, 0x40bfae14    # 5.99f

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v4, 0x41880000    # 17.0f

    .line 108
    .line 109
    const/high16 v6, 0x41300000    # 11.0f

    .line 110
    .line 111
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/high16 v4, 0x40000000    # 2.0f

    .line 115
    .line 116
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v4, -0x409eb852    # -0.88f

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v4, 0x41980000    # 19.0f

    .line 126
    .line 127
    const v6, 0x417e147b    # 15.88f

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v25, 0x3f800000    # 1.0f

    .line 134
    .line 135
    const v26, -0x3f87ae14    # -3.88f

    .line 136
    .line 137
    .line 138
    const v21, 0x3f2147ae    # 0.63f

    .line 139
    .line 140
    .line 141
    const v22, -0x406ccccd    # -1.15f

    .line 142
    .line 143
    .line 144
    const/high16 v23, 0x3f800000    # 1.0f

    .line 145
    .line 146
    const v24, -0x3fe1eb85    # -2.47f

    .line 147
    .line 148
    .line 149
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v25, -0x3f000000    # -8.0f

    .line 153
    .line 154
    const/high16 v26, -0x3f000000    # -8.0f

    .line 155
    .line 156
    const/16 v21, 0x0

    .line 157
    .line 158
    const v22, -0x3f72e148    # -4.41f

    .line 159
    .line 160
    .line 161
    const v23, -0x3f9a3d71    # -3.59f

    .line 162
    .line 163
    .line 164
    const/high16 v24, -0x3f000000    # -8.0f

    .line 165
    .line 166
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v4, 0x41a00000    # 20.0f

    .line 173
    .line 174
    const/high16 v6, 0x41400000    # 12.0f

    .line 175
    .line 176
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v25, 0x40875c29    # 4.23f

    .line 180
    .line 181
    .line 182
    const v26, -0x40628f5c    # -1.23f

    .line 183
    .line 184
    .line 185
    const v21, 0x3fc7ae14    # 1.56f

    .line 186
    .line 187
    .line 188
    const/16 v22, 0x0

    .line 189
    .line 190
    const/high16 v23, 0x40400000    # 3.0f

    .line 191
    .line 192
    const v24, -0x4119999a    # -0.45f

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v4, 0x41275c29    # 10.46f

    .line 199
    .line 200
    .line 201
    const/high16 v6, 0x41500000    # 13.0f

    .line 202
    .line 203
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v4, 0x40e00000    # 7.0f

    .line 207
    .line 208
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v4, -0x40000000    # -2.0f

    .line 212
    .line 213
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v4, 0x3fbae148    # 1.46f

    .line 217
    .line 218
    .line 219
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v4, 0x40a75c29    # 5.23f

    .line 223
    .line 224
    .line 225
    const v6, 0x40f8a3d7    # 7.77f

    .line 226
    .line 227
    .line 228
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const/high16 v25, 0x40800000    # 4.0f

    .line 232
    .line 233
    const/high16 v26, 0x41400000    # 12.0f

    .line 234
    .line 235
    const v21, 0x408e6666    # 4.45f

    .line 236
    .line 237
    .line 238
    const/high16 v22, 0x41100000    # 9.0f

    .line 239
    .line 240
    const/high16 v23, 0x40800000    # 4.0f

    .line 241
    .line 242
    const v24, 0x41270a3d    # 10.44f

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const/high16 v25, 0x41000000    # 8.0f

    .line 249
    .line 250
    const/high16 v26, 0x41000000    # 8.0f

    .line 251
    .line 252
    const/16 v21, 0x0

    .line 253
    .line 254
    const v22, 0x408d1eb8    # 4.41f

    .line 255
    .line 256
    .line 257
    const v23, 0x4065c28f    # 3.59f

    .line 258
    .line 259
    .line 260
    const/high16 v24, 0x41000000    # 8.0f

    .line 261
    .line 262
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

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
    const v6, 0x3e99999a    # 0.3f

    .line 277
    .line 278
    .line 279
    const v8, 0x3e99999a    # 0.3f

    .line 280
    .line 281
    .line 282
    const/4 v7, 0x0

    .line 283
    const/high16 v9, 0x3f800000    # 1.0f

    .line 284
    .line 285
    const/high16 v12, 0x3f800000    # 1.0f

    .line 286
    .line 287
    const/4 v13, 0x0

    .line 288
    const/4 v14, 0x0

    .line 289
    const/4 v15, 0x0

    .line 290
    const-string v4, ""

    .line 291
    .line 292
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 293
    .line 294
    .line 295
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 296
    .line 297
    .line 298
    move-result v3

    .line 299
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 300
    .line 301
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 302
    .line 303
    .line 304
    move-result-wide v6

    .line 305
    const/4 v0, 0x0

    .line 306
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 310
    .line 311
    .line 312
    move-result v10

    .line 313
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 314
    .line 315
    .line 316
    move-result v11

    .line 317
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 320
    .line 321
    .line 322
    const/high16 v0, 0x40800000    # 4.0f

    .line 323
    .line 324
    const/high16 v2, 0x41400000    # 12.0f

    .line 325
    .line 326
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/high16 v17, 0x41000000    # 8.0f

    .line 330
    .line 331
    const/high16 v18, 0x41000000    # 8.0f

    .line 332
    .line 333
    const v13, 0x408d1eb8    # 4.41f

    .line 334
    .line 335
    .line 336
    const/high16 v15, 0x41000000    # 8.0f

    .line 337
    .line 338
    const v16, 0x4065c28f    # 3.59f

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v17, -0x407eb852    # -1.01f

    .line 345
    .line 346
    .line 347
    const v18, 0x407851ec    # 3.88f

    .line 348
    .line 349
    .line 350
    const/4 v13, 0x0

    .line 351
    const v14, 0x3fb47ae1    # 1.41f

    .line 352
    .line 353
    .line 354
    const v15, -0x41428f5c    # -0.37f

    .line 355
    .line 356
    .line 357
    const v16, 0x402eb852    # 2.73f

    .line 358
    .line 359
    .line 360
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const v0, 0x3fbae148    # 1.46f

    .line 364
    .line 365
    .line 366
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const/high16 v17, 0x41b00000    # 22.0f

    .line 370
    .line 371
    const/high16 v18, 0x41400000    # 12.0f

    .line 372
    .line 373
    const v13, 0x41ab70a4    # 21.43f

    .line 374
    .line 375
    .line 376
    const v14, 0x417ca3d7    # 15.79f

    .line 377
    .line 378
    .line 379
    const/high16 v15, 0x41b00000    # 22.0f

    .line 380
    .line 381
    const v16, 0x415f5c29    # 13.96f

    .line 382
    .line 383
    .line 384
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const/high16 v17, -0x3ee00000    # -10.0f

    .line 388
    .line 389
    const/high16 v18, -0x3ee00000    # -10.0f

    .line 390
    .line 391
    const/4 v13, 0x0

    .line 392
    const v14, -0x3f4f5c29    # -5.52f

    .line 393
    .line 394
    .line 395
    const v15, -0x3f70a3d7    # -4.48f

    .line 396
    .line 397
    .line 398
    const/high16 v16, -0x3ee00000    # -10.0f

    .line 399
    .line 400
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const v17, -0x3f5570a4    # -5.33f

    .line 404
    .line 405
    .line 406
    const v18, 0x3fc66666    # 1.55f

    .line 407
    .line 408
    .line 409
    const v13, -0x40051eb8    # -1.96f

    .line 410
    .line 411
    .line 412
    const/4 v14, 0x0

    .line 413
    const v15, -0x3f8d70a4    # -3.79f

    .line 414
    .line 415
    .line 416
    const v16, 0x3f11eb85    # 0.57f

    .line 417
    .line 418
    .line 419
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/high16 v17, 0x41400000    # 12.0f

    .line 426
    .line 427
    const/high16 v18, 0x40800000    # 4.0f

    .line 428
    .line 429
    const v13, 0x411451ec    # 9.27f

    .line 430
    .line 431
    .line 432
    const v14, 0x408bd70a    # 4.37f

    .line 433
    .line 434
    .line 435
    const v15, 0x412970a4    # 10.59f

    .line 436
    .line 437
    .line 438
    const/high16 v16, 0x40800000    # 4.0f

    .line 439
    .line 440
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const/high16 v0, 0x41880000    # 17.0f

    .line 447
    .line 448
    const/high16 v2, 0x41300000    # 11.0f

    .line 449
    .line 450
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v0, -0x3fc7ae14    # -2.88f

    .line 454
    .line 455
    .line 456
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/high16 v0, 0x40000000    # 2.0f

    .line 460
    .line 461
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const/high16 v0, 0x41500000    # 13.0f

    .line 465
    .line 466
    const/high16 v2, 0x41880000    # 17.0f

    .line 467
    .line 468
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v0, 0x400851ec    # 2.13f

    .line 475
    .line 476
    .line 477
    const v2, 0x401a3d71    # 2.41f

    .line 478
    .line 479
    .line 480
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v0, 0x3f800000    # 1.0f

    .line 484
    .line 485
    const v2, 0x40628f5c    # 3.54f

    .line 486
    .line 487
    .line 488
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const v0, 0x4031eb85    # 2.78f

    .line 492
    .line 493
    .line 494
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const/high16 v17, 0x40000000    # 2.0f

    .line 498
    .line 499
    const/high16 v18, 0x41400000    # 12.0f

    .line 500
    .line 501
    const v13, 0x402a3d71    # 2.66f

    .line 502
    .line 503
    .line 504
    const v14, 0x40fdc28f    # 7.93f

    .line 505
    .line 506
    .line 507
    const/high16 v15, 0x40000000    # 2.0f

    .line 508
    .line 509
    const v16, 0x411e3d71    # 9.89f

    .line 510
    .line 511
    .line 512
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v17, 0x41200000    # 10.0f

    .line 516
    .line 517
    const/high16 v18, 0x41200000    # 10.0f

    .line 518
    .line 519
    const/4 v13, 0x0

    .line 520
    const v14, 0x40b0a3d7    # 5.52f

    .line 521
    .line 522
    .line 523
    const v15, 0x408f5c29    # 4.48f

    .line 524
    .line 525
    .line 526
    const/high16 v16, 0x41200000    # 10.0f

    .line 527
    .line 528
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const v17, 0x40b5c28f    # 5.68f

    .line 532
    .line 533
    .line 534
    const v18, -0x401c28f6    # -1.78f

    .line 535
    .line 536
    .line 537
    const v13, 0x40070a3d    # 2.11f

    .line 538
    .line 539
    .line 540
    const/4 v14, 0x0

    .line 541
    const v15, 0x40823d71    # 4.07f

    .line 542
    .line 543
    .line 544
    const v16, -0x40d70a3d    # -0.66f

    .line 545
    .line 546
    .line 547
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const v0, 0x41a3ae14    # 20.46f

    .line 551
    .line 552
    .line 553
    const/high16 v2, 0x41b80000    # 23.0f

    .line 554
    .line 555
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const v0, 0x3fb47ae1    # 1.41f

    .line 559
    .line 560
    .line 561
    const v2, -0x404b851f    # -1.41f

    .line 562
    .line 563
    .line 564
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const v0, 0x400851ec    # 2.13f

    .line 568
    .line 569
    .line 570
    const v2, 0x401a3d71    # 2.41f

    .line 571
    .line 572
    .line 573
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const/high16 v0, 0x41a00000    # 20.0f

    .line 580
    .line 581
    const/high16 v2, 0x41400000    # 12.0f

    .line 582
    .line 583
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const/high16 v17, -0x3f000000    # -8.0f

    .line 587
    .line 588
    const/high16 v18, -0x3f000000    # -8.0f

    .line 589
    .line 590
    const v13, -0x3f72e148    # -4.41f

    .line 591
    .line 592
    .line 593
    const/high16 v15, -0x3f000000    # -8.0f

    .line 594
    .line 595
    const v16, -0x3f9a3d71    # -3.59f

    .line 596
    .line 597
    .line 598
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    const v17, 0x3f9d70a4    # 1.23f

    .line 602
    .line 603
    .line 604
    const v18, -0x3f78a3d7    # -4.23f

    .line 605
    .line 606
    .line 607
    const/4 v13, 0x0

    .line 608
    const v14, -0x403851ec    # -1.56f

    .line 609
    .line 610
    .line 611
    const v15, 0x3ee66666    # 0.45f

    .line 612
    .line 613
    .line 614
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 615
    .line 616
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const v0, 0x41075c29    # 8.46f

    .line 620
    .line 621
    .line 622
    const/high16 v2, 0x41300000    # 11.0f

    .line 623
    .line 624
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    const/high16 v0, 0x40e00000    # 7.0f

    .line 628
    .line 629
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const/high16 v0, 0x40000000    # 2.0f

    .line 633
    .line 634
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const v0, 0x405d70a4    # 3.46f

    .line 638
    .line 639
    .line 640
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const v0, 0x40b8a3d7    # 5.77f

    .line 644
    .line 645
    .line 646
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const/high16 v17, 0x41400000    # 12.0f

    .line 650
    .line 651
    const/high16 v18, 0x41a00000    # 20.0f

    .line 652
    .line 653
    const/high16 v13, 0x41700000    # 15.0f

    .line 654
    .line 655
    const v14, 0x419c6666    # 19.55f

    .line 656
    .line 657
    .line 658
    const v15, 0x4158f5c3    # 13.56f

    .line 659
    .line 660
    .line 661
    const/high16 v16, 0x41a00000    # 20.0f

    .line 662
    .line 663
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    .line 666
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 670
    .line 671
    .line 672
    move-result-object v2

    .line 673
    const/16 v16, 0x3800

    .line 674
    .line 675
    const/16 v17, 0x0

    .line 676
    .line 677
    const/high16 v6, 0x3f800000    # 1.0f

    .line 678
    .line 679
    const/high16 v8, 0x3f800000    # 1.0f

    .line 680
    .line 681
    const/4 v7, 0x0

    .line 682
    const/high16 v12, 0x3f800000    # 1.0f

    .line 683
    .line 684
    const/4 v13, 0x0

    .line 685
    const/4 v14, 0x0

    .line 686
    const/4 v15, 0x0

    .line 687
    const-string v4, ""

    .line 688
    .line 689
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 690
    .line 691
    .line 692
    move-result-object v0

    .line 693
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 694
    .line 695
    .line 696
    move-result-object v0

    .line 697
    sput-object v0, Landroidx/compose/material/icons/twotone/DoDisturbOffKt;->_doDisturbOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 698
    .line 699
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 700
    .line 701
    .line 702
    return-object v0
.end method
