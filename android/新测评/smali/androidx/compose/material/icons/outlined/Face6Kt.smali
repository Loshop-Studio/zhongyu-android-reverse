.class public final Landroidx/compose/material/icons/outlined/Face6Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_face6",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Face6",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getFace6",
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
        "SMAP\nFace6.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Face6.kt\nandroidx/compose/material/icons/outlined/Face6Kt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,75:1\n212#2,12:76\n233#2,18:89\n253#2:126\n233#2,18:127\n253#2:164\n233#2,18:165\n253#2:202\n174#3:88\n705#4,2:107\n717#4,2:109\n719#4,11:115\n705#4,2:145\n717#4,2:147\n719#4,11:153\n705#4,2:183\n717#4,2:185\n719#4,11:191\n72#5,4:111\n72#5,4:149\n72#5,4:187\n*S KotlinDebug\n*F\n+ 1 Face6.kt\nandroidx/compose/material/icons/outlined/Face6Kt\n*L\n29#1:76,12\n30#1:89,18\n30#1:126\n58#1:127,18\n58#1:164\n64#1:165,18\n64#1:202\n29#1:88\n30#1:107,2\n30#1:109,2\n30#1:115,11\n58#1:145,2\n58#1:147,2\n58#1:153,11\n64#1:183,2\n64#1:185,2\n64#1:191,11\n30#1:111,4\n58#1:149,4\n64#1:187,4\n*E\n"
    }
.end annotation


# static fields
.field private static _face6:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFace6(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/Face6Kt;->_face6:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Face6"

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
    const/high16 v4, 0x40000000    # 2.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x40000000    # 2.0f

    .line 78
    .line 79
    const/high16 v26, 0x41400000    # 12.0f

    .line 80
    .line 81
    const v21, 0x40cf5c29    # 6.48f

    .line 82
    .line 83
    .line 84
    const/high16 v22, 0x40000000    # 2.0f

    .line 85
    .line 86
    const/high16 v23, 0x40000000    # 2.0f

    .line 87
    .line 88
    const v24, 0x40cf5c29    # 6.48f

    .line 89
    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v4, 0x408f5c29    # 4.48f

    .line 97
    .line 98
    .line 99
    const/high16 v6, 0x41200000    # 10.0f

    .line 100
    .line 101
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v4, -0x3f70a3d7    # -4.48f

    .line 105
    .line 106
    .line 107
    const/high16 v6, -0x3ee00000    # -10.0f

    .line 108
    .line 109
    const/high16 v7, 0x41200000    # 10.0f

    .line 110
    .line 111
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v4, 0x418c28f6    # 17.52f

    .line 115
    .line 116
    .line 117
    const/high16 v6, 0x40000000    # 2.0f

    .line 118
    .line 119
    const/high16 v7, 0x41400000    # 12.0f

    .line 120
    .line 121
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v4, 0x40800000    # 4.0f

    .line 128
    .line 129
    const/high16 v6, 0x41400000    # 12.0f

    .line 130
    .line 131
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v25, 0x40f6b852    # 7.71f

    .line 135
    .line 136
    .line 137
    const v26, 0x40bccccd    # 5.9f

    .line 138
    .line 139
    .line 140
    const v21, 0x406b851f    # 3.68f

    .line 141
    .line 142
    .line 143
    const/16 v22, 0x0

    .line 144
    .line 145
    const v23, 0x40d8f5c3    # 6.78f

    .line 146
    .line 147
    .line 148
    const v24, 0x4020a3d7    # 2.51f

    .line 149
    .line 150
    .line 151
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v25, -0x3fef5c29    # -2.26f

    .line 155
    .line 156
    .line 157
    const v26, -0x3ff0a3d7    # -2.24f

    .line 158
    .line 159
    .line 160
    const v21, -0x40e66666    # -0.6f

    .line 161
    .line 162
    .line 163
    const v22, -0x41dc28f6    # -0.16f

    .line 164
    .line 165
    .line 166
    const v23, -0x4055c28f    # -1.33f

    .line 167
    .line 168
    .line 169
    const v24, -0x41428f5c    # -0.37f

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v25, 0x416c28f6    # 14.76f

    .line 176
    .line 177
    .line 178
    const/high16 v26, 0x40c00000    # 6.0f

    .line 179
    .line 180
    const v21, 0x4187851f    # 16.94f

    .line 181
    .line 182
    .line 183
    const v22, 0x40d47ae1    # 6.64f

    .line 184
    .line 185
    .line 186
    const v23, 0x417e8f5c    # 15.91f

    .line 187
    .line 188
    .line 189
    const/high16 v24, 0x40c00000    # 6.0f

    .line 190
    .line 191
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v4, 0x4113d70a    # 9.24f

    .line 195
    .line 196
    .line 197
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v25, 0x40d1999a    # 6.55f

    .line 201
    .line 202
    .line 203
    const v26, 0x40f51eb8    # 7.66f

    .line 204
    .line 205
    .line 206
    const v21, 0x410170a4    # 8.09f

    .line 207
    .line 208
    .line 209
    const/high16 v22, 0x40c00000    # 6.0f

    .line 210
    .line 211
    const v23, 0x40e1eb85    # 7.06f

    .line 212
    .line 213
    .line 214
    const v24, 0x40d47ae1    # 6.64f

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v25, 0x408947ae    # 4.29f

    .line 221
    .line 222
    .line 223
    const v26, 0x411e6666    # 9.9f

    .line 224
    .line 225
    .line 226
    const v21, 0x40b3d70a    # 5.62f

    .line 227
    .line 228
    .line 229
    const v22, 0x411851ec    # 9.52f

    .line 230
    .line 231
    .line 232
    const v23, 0x409f0a3d    # 4.97f

    .line 233
    .line 234
    .line 235
    const v24, 0x411b851f    # 9.72f

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const/high16 v25, 0x41400000    # 12.0f

    .line 242
    .line 243
    const/high16 v26, 0x40800000    # 4.0f

    .line 244
    .line 245
    const v21, 0x40a70a3d    # 5.22f

    .line 246
    .line 247
    .line 248
    const v22, 0x40d051ec    # 6.51f

    .line 249
    .line 250
    .line 251
    const v23, 0x41051eb8    # 8.32f

    .line 252
    .line 253
    .line 254
    const/high16 v24, 0x40800000    # 4.0f

    .line 255
    .line 256
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v4, 0x41a00000    # 20.0f

    .line 263
    .line 264
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/high16 v25, -0x3f000000    # -8.0f

    .line 268
    .line 269
    const/high16 v26, -0x3f000000    # -8.0f

    .line 270
    .line 271
    const v21, -0x3f72e148    # -4.41f

    .line 272
    .line 273
    .line 274
    const/16 v22, 0x0

    .line 275
    .line 276
    const/high16 v23, -0x3f000000    # -8.0f

    .line 277
    .line 278
    const v24, -0x3f9a3d71    # -3.59f

    .line 279
    .line 280
    .line 281
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/16 v25, 0x0

    .line 285
    .line 286
    const v26, -0x430a3d71    # -0.03f

    .line 287
    .line 288
    .line 289
    const/16 v21, 0x0

    .line 290
    .line 291
    const v22, -0x43dc28f6    # -0.01f

    .line 292
    .line 293
    .line 294
    const/16 v23, 0x0

    .line 295
    .line 296
    const v24, -0x435c28f6    # -0.02f

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v25, 0x408ae148    # 4.34f

    .line 303
    .line 304
    .line 305
    const v26, -0x3fa5c28f    # -3.41f

    .line 306
    .line 307
    .line 308
    const v21, 0x4013d70a    # 2.31f

    .line 309
    .line 310
    .line 311
    const v22, -0x419eb852    # -0.22f

    .line 312
    .line 313
    .line 314
    const v23, 0x405b851f    # 3.43f

    .line 315
    .line 316
    .line 317
    const v24, -0x40347ae1    # -1.59f

    .line 318
    .line 319
    .line 320
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v25, 0x4113d70a    # 9.24f

    .line 324
    .line 325
    .line 326
    const/high16 v26, 0x41000000    # 8.0f

    .line 327
    .line 328
    const v21, 0x410828f6    # 8.51f

    .line 329
    .line 330
    .line 331
    const v22, 0x41035c29    # 8.21f

    .line 332
    .line 333
    .line 334
    const v23, 0x410d999a    # 8.85f

    .line 335
    .line 336
    .line 337
    const/high16 v24, 0x41000000    # 8.0f

    .line 338
    .line 339
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v4, 0x40b0f5c3    # 5.53f

    .line 343
    .line 344
    .line 345
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v25, 0x3f63d70a    # 0.89f

    .line 349
    .line 350
    .line 351
    const v26, 0x3f0ccccd    # 0.55f

    .line 352
    .line 353
    .line 354
    const v21, 0x3ec28f5c    # 0.38f

    .line 355
    .line 356
    .line 357
    const/16 v22, 0x0

    .line 358
    .line 359
    const v23, 0x3f3851ec    # 0.72f

    .line 360
    .line 361
    .line 362
    const v24, 0x3e570a3d    # 0.21f

    .line 363
    .line 364
    .line 365
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v25, 0x408ae148    # 4.34f

    .line 369
    .line 370
    .line 371
    const v26, 0x405a3d71    # 3.41f

    .line 372
    .line 373
    .line 374
    const v21, 0x3f666666    # 0.9f

    .line 375
    .line 376
    .line 377
    const v22, 0x3fe66666    # 1.8f

    .line 378
    .line 379
    .line 380
    const v23, 0x3ffeb852    # 1.99f

    .line 381
    .line 382
    .line 383
    const v24, 0x404c28f6    # 3.19f

    .line 384
    .line 385
    .line 386
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const/16 v25, 0x0

    .line 390
    .line 391
    const v26, 0x3cf5c28f    # 0.03f

    .line 392
    .line 393
    .line 394
    const/16 v21, 0x0

    .line 395
    .line 396
    const v22, 0x3c23d70a    # 0.01f

    .line 397
    .line 398
    .line 399
    const/16 v23, 0x0

    .line 400
    .line 401
    const v24, 0x3ca3d70a    # 0.02f

    .line 402
    .line 403
    .line 404
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v25, 0x41400000    # 12.0f

    .line 408
    .line 409
    const/high16 v26, 0x41a00000    # 20.0f

    .line 410
    .line 411
    const/high16 v21, 0x41a00000    # 20.0f

    .line 412
    .line 413
    const v22, 0x418347ae    # 16.41f

    .line 414
    .line 415
    .line 416
    const v23, 0x418347ae    # 16.41f

    .line 417
    .line 418
    .line 419
    const/high16 v24, 0x41a00000    # 20.0f

    .line 420
    .line 421
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    const/16 v16, 0x3800

    .line 432
    .line 433
    const/16 v17, 0x0

    .line 434
    .line 435
    const/high16 v6, 0x3f800000    # 1.0f

    .line 436
    .line 437
    const/high16 v8, 0x3f800000    # 1.0f

    .line 438
    .line 439
    const/4 v7, 0x0

    .line 440
    const/high16 v9, 0x3f800000    # 1.0f

    .line 441
    .line 442
    const/high16 v12, 0x3f800000    # 1.0f

    .line 443
    .line 444
    const/4 v13, 0x0

    .line 445
    const/4 v14, 0x0

    .line 446
    const/4 v15, 0x0

    .line 447
    const-string v4, ""

    .line 448
    .line 449
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 450
    .line 451
    .line 452
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 453
    .line 454
    .line 455
    move-result v3

    .line 456
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 457
    .line 458
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 459
    .line 460
    .line 461
    move-result-wide v6

    .line 462
    const/4 v2, 0x0

    .line 463
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 464
    .line 465
    .line 466
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 467
    .line 468
    .line 469
    move-result v10

    .line 470
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 471
    .line 472
    .line 473
    move-result v11

    .line 474
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 477
    .line 478
    .line 479
    const/high16 v4, 0x41100000    # 9.0f

    .line 480
    .line 481
    const/high16 v6, 0x41500000    # 13.0f

    .line 482
    .line 483
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const/4 v4, 0x0

    .line 487
    const/high16 v6, -0x40600000    # -1.25f

    .line 488
    .line 489
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const/high16 v26, 0x40200000    # 2.5f

    .line 493
    .line 494
    const/16 v27, 0x0

    .line 495
    .line 496
    const/high16 v21, 0x3fa00000    # 1.25f

    .line 497
    .line 498
    const/high16 v22, 0x3fa00000    # 1.25f

    .line 499
    .line 500
    const/16 v23, 0x0

    .line 501
    .line 502
    const/16 v24, 0x1

    .line 503
    .line 504
    const/16 v25, 0x1

    .line 505
    .line 506
    move-object/from16 v20, v2

    .line 507
    .line 508
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 512
    .line 513
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 517
    .line 518
    .line 519
    move-result-object v2

    .line 520
    const/high16 v6, 0x3f800000    # 1.0f

    .line 521
    .line 522
    const/4 v7, 0x0

    .line 523
    const-string v4, ""

    .line 524
    .line 525
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 526
    .line 527
    .line 528
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 529
    .line 530
    .line 531
    move-result v3

    .line 532
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 533
    .line 534
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 535
    .line 536
    .line 537
    move-result-wide v6

    .line 538
    const/4 v0, 0x0

    .line 539
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 540
    .line 541
    .line 542
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 543
    .line 544
    .line 545
    move-result v10

    .line 546
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 547
    .line 548
    .line 549
    move-result v11

    .line 550
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 553
    .line 554
    .line 555
    const/high16 v0, 0x41700000    # 15.0f

    .line 556
    .line 557
    const/high16 v2, 0x41500000    # 13.0f

    .line 558
    .line 559
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const/4 v0, 0x0

    .line 563
    const/high16 v2, -0x40600000    # -1.25f

    .line 564
    .line 565
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const/high16 v18, 0x40200000    # 2.5f

    .line 569
    .line 570
    const/16 v19, 0x0

    .line 571
    .line 572
    const/high16 v13, 0x3fa00000    # 1.25f

    .line 573
    .line 574
    const/high16 v14, 0x3fa00000    # 1.25f

    .line 575
    .line 576
    const/16 v16, 0x1

    .line 577
    .line 578
    const/16 v17, 0x1

    .line 579
    .line 580
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 584
    .line 585
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 589
    .line 590
    .line 591
    move-result-object v2

    .line 592
    const/16 v16, 0x3800

    .line 593
    .line 594
    const/16 v17, 0x0

    .line 595
    .line 596
    const/high16 v6, 0x3f800000    # 1.0f

    .line 597
    .line 598
    const/4 v7, 0x0

    .line 599
    const/high16 v12, 0x3f800000    # 1.0f

    .line 600
    .line 601
    const/4 v13, 0x0

    .line 602
    const/4 v14, 0x0

    .line 603
    const-string v4, ""

    .line 604
    .line 605
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 606
    .line 607
    .line 608
    move-result-object v0

    .line 609
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    sput-object v0, Landroidx/compose/material/icons/outlined/Face6Kt;->_face6:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 614
    .line 615
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 616
    .line 617
    .line 618
    return-object v0
.end method
