.class public final Landroidx/compose/material/icons/twotone/MasksKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_masks",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Masks",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getMasks",
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
        "SMAP\nMasks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Masks.kt\nandroidx/compose/material/icons/twotone/MasksKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,113:1\n212#2,12:114\n233#2,18:127\n253#2:164\n233#2,18:165\n253#2:202\n174#3:126\n705#4,2:145\n717#4,2:147\n719#4,11:153\n705#4,2:183\n717#4,2:185\n719#4,11:191\n72#5,4:149\n72#5,4:187\n*S KotlinDebug\n*F\n+ 1 Masks.kt\nandroidx/compose/material/icons/twotone/MasksKt\n*L\n29#1:114,12\n30#1:127,18\n30#1:164\n54#1:165,18\n54#1:202\n29#1:126\n30#1:145,2\n30#1:147,2\n30#1:153,11\n54#1:183,2\n54#1:185,2\n54#1:191,11\n30#1:149,4\n54#1:187,4\n*E\n"
    }
.end annotation


# static fields
.field private static _masks:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMasks(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/MasksKt;->_masks:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Masks"

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
    const v4, 0x416570a4    # 14.34f

    .line 71
    .line 72
    .line 73
    const v6, 0x410c7ae1    # 8.78f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v25, 0x41400000    # 12.0f

    .line 80
    .line 81
    const/high16 v26, 0x41000000    # 8.0f

    .line 82
    .line 83
    const v21, 0x415851ec    # 13.52f

    .line 84
    .line 85
    .line 86
    const v22, 0x410547ae    # 8.33f

    .line 87
    .line 88
    .line 89
    const v23, 0x414ee148    # 12.93f

    .line 90
    .line 91
    .line 92
    const/high16 v24, 0x41000000    # 8.0f

    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v25, -0x3fea3d71    # -2.34f

    .line 100
    .line 101
    .line 102
    const v26, 0x3f451eb8    # 0.77f

    .line 103
    .line 104
    .line 105
    const v21, -0x4091eb85    # -0.93f

    .line 106
    .line 107
    .line 108
    const/16 v22, 0x0

    .line 109
    .line 110
    const v23, -0x403d70a4    # -1.52f

    .line 111
    .line 112
    .line 113
    const v24, 0x3ea8f5c3    # 0.33f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v25, 0x40e00000    # 7.0f

    .line 120
    .line 121
    const v26, 0x411d999a    # 9.85f

    .line 122
    .line 123
    .line 124
    const v21, 0x410f3333    # 8.95f

    .line 125
    .line 126
    .line 127
    const v22, 0x41128f5c    # 9.16f

    .line 128
    .line 129
    .line 130
    const v23, 0x4101eb85    # 8.12f

    .line 131
    .line 132
    .line 133
    const v24, 0x4119eb85    # 9.62f

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v4, 0x3fd33333    # 1.65f

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const/high16 v25, 0x40a00000    # 5.0f

    .line 146
    .line 147
    const/high16 v26, 0x40a00000    # 5.0f

    .line 148
    .line 149
    const/16 v21, 0x0

    .line 150
    .line 151
    const v22, 0x4030a3d7    # 2.76f

    .line 152
    .line 153
    .line 154
    const v23, 0x400f5c29    # 2.24f

    .line 155
    .line 156
    .line 157
    const/high16 v24, 0x40a00000    # 5.0f

    .line 158
    .line 159
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v4, -0x3ff0a3d7    # -2.24f

    .line 163
    .line 164
    .line 165
    const/high16 v6, -0x3f600000    # -5.0f

    .line 166
    .line 167
    const/high16 v7, 0x40a00000    # 5.0f

    .line 168
    .line 169
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v4, 0x411d999a    # 9.85f

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v25, 0x416570a4    # 14.34f

    .line 179
    .line 180
    .line 181
    const v26, 0x410c7ae1    # 8.78f

    .line 182
    .line 183
    .line 184
    const v21, 0x417e147b    # 15.88f

    .line 185
    .line 186
    .line 187
    const v22, 0x4119eb85    # 9.62f

    .line 188
    .line 189
    .line 190
    const v23, 0x4170cccd    # 15.05f

    .line 191
    .line 192
    .line 193
    const v24, 0x41128f5c    # 9.16f

    .line 194
    .line 195
    .line 196
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v4, 0x41700000    # 15.0f

    .line 203
    .line 204
    const/high16 v6, 0x41340000    # 11.25f

    .line 205
    .line 206
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v25, -0x40251eb8    # -1.71f

    .line 210
    .line 211
    .line 212
    const v26, -0x40b851ec    # -0.78f

    .line 213
    .line 214
    .line 215
    const/high16 v21, -0x40c00000    # -0.75f

    .line 216
    .line 217
    const v22, -0x41a8f5c3    # -0.21f

    .line 218
    .line 219
    .line 220
    const v23, -0x405eb852    # -1.26f

    .line 221
    .line 222
    .line 223
    const v24, -0x40fd70a4    # -0.51f

    .line 224
    .line 225
    .line 226
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v25, 0x41400000    # 12.0f

    .line 230
    .line 231
    const/high16 v26, 0x41200000    # 10.0f

    .line 232
    .line 233
    const v21, 0x414d47ae    # 12.83f

    .line 234
    .line 235
    .line 236
    const v22, 0x41233333    # 10.2f

    .line 237
    .line 238
    .line 239
    const v23, 0x4147d70a    # 12.49f

    .line 240
    .line 241
    .line 242
    const/high16 v24, 0x41200000    # 10.0f

    .line 243
    .line 244
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v25, -0x405851ec    # -1.31f

    .line 248
    .line 249
    .line 250
    const v26, 0x3ef5c28f    # 0.48f

    .line 251
    .line 252
    .line 253
    const v21, -0x41051eb8    # -0.49f

    .line 254
    .line 255
    .line 256
    const/16 v22, 0x0

    .line 257
    .line 258
    const v23, -0x40a8f5c3    # -0.84f

    .line 259
    .line 260
    .line 261
    const v24, 0x3e4ccccd    # 0.2f

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v25, -0x4027ae14    # -1.69f

    .line 268
    .line 269
    .line 270
    const v26, 0x3f428f5c    # 0.76f

    .line 271
    .line 272
    .line 273
    const v21, -0x411eb852    # -0.44f

    .line 274
    .line 275
    .line 276
    const v22, 0x3e851eb8    # 0.26f

    .line 277
    .line 278
    .line 279
    const v23, -0x408a3d71    # -0.96f

    .line 280
    .line 281
    .line 282
    const v24, 0x3f0f5c29    # 0.56f

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v4, 0x41233333    # 10.2f

    .line 289
    .line 290
    .line 291
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v25, 0x3f970a3d    # 1.18f

    .line 295
    .line 296
    .line 297
    const v26, -0x40eb851f    # -0.58f

    .line 298
    .line 299
    .line 300
    const v21, 0x3ef5c28f    # 0.48f

    .line 301
    .line 302
    .line 303
    const v22, -0x41d1eb85    # -0.17f

    .line 304
    .line 305
    .line 306
    const v23, 0x3f570a3d    # 0.84f

    .line 307
    .line 308
    .line 309
    const v24, -0x413d70a4    # -0.38f

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v25, 0x41400000    # 12.0f

    .line 316
    .line 317
    const/high16 v26, 0x41100000    # 9.0f

    .line 318
    .line 319
    const v21, 0x412b851f    # 10.72f

    .line 320
    .line 321
    .line 322
    const v22, 0x4114cccd    # 9.3f

    .line 323
    .line 324
    .line 325
    const v23, 0x4133ae14    # 11.23f

    .line 326
    .line 327
    .line 328
    const/high16 v24, 0x41100000    # 9.0f

    .line 329
    .line 330
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v4, 0x3f1eb852    # 0.62f

    .line 334
    .line 335
    .line 336
    const v6, 0x3fe66666    # 1.8f

    .line 337
    .line 338
    .line 339
    const v7, 0x3e99999a    # 0.3f

    .line 340
    .line 341
    .line 342
    const v8, 0x3fa28f5c    # 1.27f

    .line 343
    .line 344
    .line 345
    invoke-virtual {v2, v8, v7, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v25, 0x3f99999a    # 1.2f

    .line 349
    .line 350
    .line 351
    const v26, 0x3f170a3d    # 0.59f

    .line 352
    .line 353
    .line 354
    const v21, 0x3eae147b    # 0.34f

    .line 355
    .line 356
    .line 357
    const v22, 0x3e4ccccd    # 0.2f

    .line 358
    .line 359
    .line 360
    const v23, 0x3f35c28f    # 0.71f

    .line 361
    .line 362
    .line 363
    const v24, 0x3ed70a3d    # 0.42f

    .line 364
    .line 365
    .line 366
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const/high16 v4, 0x41340000    # 11.25f

    .line 370
    .line 371
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    const/16 v16, 0x3800

    .line 382
    .line 383
    const/16 v17, 0x0

    .line 384
    .line 385
    const v6, 0x3e99999a    # 0.3f

    .line 386
    .line 387
    .line 388
    const v8, 0x3e99999a    # 0.3f

    .line 389
    .line 390
    .line 391
    const/4 v7, 0x0

    .line 392
    const/high16 v9, 0x3f800000    # 1.0f

    .line 393
    .line 394
    const/high16 v12, 0x3f800000    # 1.0f

    .line 395
    .line 396
    const/4 v13, 0x0

    .line 397
    const/4 v14, 0x0

    .line 398
    const/4 v15, 0x0

    .line 399
    const-string v4, ""

    .line 400
    .line 401
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 402
    .line 403
    .line 404
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 405
    .line 406
    .line 407
    move-result v3

    .line 408
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 409
    .line 410
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 411
    .line 412
    .line 413
    move-result-wide v6

    .line 414
    const/4 v0, 0x0

    .line 415
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 419
    .line 420
    .line 421
    move-result v10

    .line 422
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 423
    .line 424
    .line 425
    move-result v11

    .line 426
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 429
    .line 430
    .line 431
    const/high16 v0, 0x419c0000    # 19.5f

    .line 432
    .line 433
    const/high16 v2, 0x40c00000    # 6.0f

    .line 434
    .line 435
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v17, -0x3fe147ae    # -2.48f

    .line 439
    .line 440
    .line 441
    const v18, 0x40133333    # 2.3f

    .line 442
    .line 443
    .line 444
    const v13, -0x405851ec    # -1.31f

    .line 445
    .line 446
    .line 447
    const v15, -0x3fe851ec    # -2.37f

    .line 448
    .line 449
    .line 450
    const v16, 0x3f8147ae    # 1.01f

    .line 451
    .line 452
    .line 453
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/high16 v17, 0x41400000    # 12.0f

    .line 457
    .line 458
    const/high16 v18, 0x40d00000    # 6.5f

    .line 459
    .line 460
    const v13, 0x41723d71    # 15.14f

    .line 461
    .line 462
    .line 463
    const v14, 0x40f9999a    # 7.8f

    .line 464
    .line 465
    .line 466
    const v15, 0x4162e148    # 14.18f

    .line 467
    .line 468
    .line 469
    const/high16 v16, 0x40d00000    # 6.5f

    .line 470
    .line 471
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v17, -0x3f5f5c29    # -5.02f

    .line 475
    .line 476
    .line 477
    const v18, 0x3fe66666    # 1.8f

    .line 478
    .line 479
    .line 480
    const v13, -0x3ff3d70a    # -2.19f

    .line 481
    .line 482
    .line 483
    const/4 v14, 0x0

    .line 484
    const v15, -0x3fb70a3d    # -3.14f

    .line 485
    .line 486
    .line 487
    const v16, 0x3fa66666    # 1.3f

    .line 488
    .line 489
    .line 490
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v17, 0x40900000    # 4.5f

    .line 494
    .line 495
    const/high16 v18, 0x40c00000    # 6.0f

    .line 496
    .line 497
    const v13, 0x40dbd70a    # 6.87f

    .line 498
    .line 499
    .line 500
    const v14, 0x40e0a3d7    # 7.02f

    .line 501
    .line 502
    .line 503
    const v15, 0x40b9eb85    # 5.81f

    .line 504
    .line 505
    .line 506
    const/high16 v16, 0x40c00000    # 6.0f

    .line 507
    .line 508
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const/high16 v17, 0x40000000    # 2.0f

    .line 512
    .line 513
    const/high16 v18, 0x41080000    # 8.5f

    .line 514
    .line 515
    const v13, 0x4047ae14    # 3.12f

    .line 516
    .line 517
    .line 518
    const/high16 v14, 0x40c00000    # 6.0f

    .line 519
    .line 520
    const/high16 v15, 0x40000000    # 2.0f

    .line 521
    .line 522
    const v16, 0x40e3d70a    # 7.12f

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const/high16 v0, 0x41100000    # 9.0f

    .line 529
    .line 530
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const v17, 0x40d0a3d7    # 6.52f

    .line 534
    .line 535
    .line 536
    const v18, 0x40ff5c29    # 7.98f

    .line 537
    .line 538
    .line 539
    const/4 v13, 0x0

    .line 540
    const v15, 0x40666666    # 3.6f

    .line 541
    .line 542
    .line 543
    const v16, 0x40f9eb85    # 7.81f

    .line 544
    .line 545
    .line 546
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const/high16 v17, 0x41400000    # 12.0f

    .line 550
    .line 551
    const/high16 v18, 0x41900000    # 18.0f

    .line 552
    .line 553
    const v13, 0x41187ae1    # 9.53f

    .line 554
    .line 555
    .line 556
    const v14, 0x418cf5c3    # 17.62f

    .line 557
    .line 558
    .line 559
    const v15, 0x412b851f    # 10.72f

    .line 560
    .line 561
    .line 562
    const/high16 v16, 0x41900000    # 18.0f

    .line 563
    .line 564
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const v0, 0x405eb852    # 3.48f

    .line 568
    .line 569
    .line 570
    const v2, -0x407d70a4    # -1.02f

    .line 571
    .line 572
    .line 573
    const v4, 0x401e147b    # 2.47f

    .line 574
    .line 575
    .line 576
    const v6, -0x413d70a4    # -0.38f

    .line 577
    .line 578
    .line 579
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const/high16 v17, 0x41b00000    # 22.0f

    .line 583
    .line 584
    const/high16 v18, 0x41100000    # 9.0f

    .line 585
    .line 586
    const v13, 0x41933333    # 18.4f

    .line 587
    .line 588
    .line 589
    const v14, 0x41867ae1    # 16.81f

    .line 590
    .line 591
    .line 592
    const/high16 v15, 0x41b00000    # 22.0f

    .line 593
    .line 594
    const/high16 v16, 0x41700000    # 15.0f

    .line 595
    .line 596
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const/high16 v0, 0x41080000    # 8.5f

    .line 600
    .line 601
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const/high16 v17, 0x419c0000    # 19.5f

    .line 605
    .line 606
    const/high16 v18, 0x40c00000    # 6.0f

    .line 607
    .line 608
    const/high16 v13, 0x41b00000    # 22.0f

    .line 609
    .line 610
    const v14, 0x40e3d70a    # 7.12f

    .line 611
    .line 612
    .line 613
    const v15, 0x41a70a3d    # 20.88f

    .line 614
    .line 615
    .line 616
    const/high16 v16, 0x40c00000    # 6.0f

    .line 617
    .line 618
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const/high16 v0, 0x40600000    # 3.5f

    .line 625
    .line 626
    const/high16 v2, 0x41100000    # 9.0f

    .line 627
    .line 628
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    const/high16 v0, 0x41080000    # 8.5f

    .line 632
    .line 633
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const/high16 v17, 0x3f800000    # 1.0f

    .line 637
    .line 638
    const/high16 v18, -0x40800000    # -1.0f

    .line 639
    .line 640
    const/4 v13, 0x0

    .line 641
    const v14, -0x40f33333    # -0.55f

    .line 642
    .line 643
    .line 644
    const v15, 0x3ee66666    # 0.45f

    .line 645
    .line 646
    .line 647
    const/high16 v16, -0x40800000    # -1.0f

    .line 648
    .line 649
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    const v0, 0x3ee66666    # 0.45f

    .line 653
    .line 654
    .line 655
    const/high16 v2, 0x3f800000    # 1.0f

    .line 656
    .line 657
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const/high16 v0, 0x40400000    # 3.0f

    .line 661
    .line 662
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    const v17, 0x3f8147ae    # 1.01f

    .line 666
    .line 667
    .line 668
    const v18, 0x405eb852    # 3.48f

    .line 669
    .line 670
    .line 671
    const v14, 0x3fa3d70a    # 1.28f

    .line 672
    .line 673
    .line 674
    const v15, 0x3ec28f5c    # 0.38f

    .line 675
    .line 676
    .line 677
    const v16, 0x401e147b    # 2.47f

    .line 678
    .line 679
    .line 680
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    const/high16 v17, 0x40600000    # 3.5f

    .line 684
    .line 685
    const/high16 v18, 0x41100000    # 9.0f

    .line 686
    .line 687
    const v13, 0x409fae14    # 4.99f

    .line 688
    .line 689
    .line 690
    const v14, 0x416451ec    # 14.27f

    .line 691
    .line 692
    .line 693
    const/high16 v15, 0x40600000    # 3.5f

    .line 694
    .line 695
    const v16, 0x414a6666    # 12.65f

    .line 696
    .line 697
    .line 698
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 702
    .line 703
    .line 704
    const/high16 v0, 0x41380000    # 11.5f

    .line 705
    .line 706
    const/high16 v2, 0x40e00000    # 7.0f

    .line 707
    .line 708
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    const v0, 0x411d999a    # 9.85f

    .line 712
    .line 713
    .line 714
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 715
    .line 716
    .line 717
    const v17, 0x402a3d71    # 2.66f

    .line 718
    .line 719
    .line 720
    const v18, -0x4075c28f    # -1.08f

    .line 721
    .line 722
    .line 723
    const v13, 0x3f8f5c29    # 1.12f

    .line 724
    .line 725
    .line 726
    const v14, -0x41947ae1    # -0.23f

    .line 727
    .line 728
    .line 729
    const v15, 0x3ff9999a    # 1.95f

    .line 730
    .line 731
    .line 732
    const v16, -0x40cf5c29    # -0.69f

    .line 733
    .line 734
    .line 735
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 736
    .line 737
    .line 738
    const/high16 v17, 0x41400000    # 12.0f

    .line 739
    .line 740
    const/high16 v18, 0x41000000    # 8.0f

    .line 741
    .line 742
    const v13, 0x4127ae14    # 10.48f

    .line 743
    .line 744
    .line 745
    const v14, 0x410547ae    # 8.33f

    .line 746
    .line 747
    .line 748
    const v15, 0x41311eb8    # 11.07f

    .line 749
    .line 750
    .line 751
    const/high16 v16, 0x41000000    # 8.0f

    .line 752
    .line 753
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 754
    .line 755
    .line 756
    const v17, 0x4015c28f    # 2.34f

    .line 757
    .line 758
    .line 759
    const v18, 0x3f47ae14    # 0.78f

    .line 760
    .line 761
    .line 762
    const v13, 0x3f6e147b    # 0.93f

    .line 763
    .line 764
    .line 765
    const/4 v14, 0x0

    .line 766
    const v15, 0x3fc28f5c    # 1.52f

    .line 767
    .line 768
    .line 769
    const v16, 0x3ea8f5c3    # 0.33f

    .line 770
    .line 771
    .line 772
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 773
    .line 774
    .line 775
    const v17, 0x402a3d71    # 2.66f

    .line 776
    .line 777
    .line 778
    const v18, 0x3f8a3d71    # 1.08f

    .line 779
    .line 780
    .line 781
    const v13, 0x3f35c28f    # 0.71f

    .line 782
    .line 783
    .line 784
    const v14, 0x3ec7ae14    # 0.39f

    .line 785
    .line 786
    .line 787
    const v15, 0x3fc51eb8    # 1.54f

    .line 788
    .line 789
    .line 790
    const v16, 0x3f570a3d    # 0.84f

    .line 791
    .line 792
    .line 793
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 794
    .line 795
    .line 796
    const v0, 0x3fd33333    # 1.65f

    .line 797
    .line 798
    .line 799
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 800
    .line 801
    .line 802
    const/high16 v17, -0x3f600000    # -5.0f

    .line 803
    .line 804
    const/high16 v18, 0x40a00000    # 5.0f

    .line 805
    .line 806
    const/4 v13, 0x0

    .line 807
    const v14, 0x4030a3d7    # 2.76f

    .line 808
    .line 809
    .line 810
    const v15, -0x3ff0a3d7    # -2.24f

    .line 811
    .line 812
    .line 813
    const/high16 v16, 0x40a00000    # 5.0f

    .line 814
    .line 815
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 816
    .line 817
    .line 818
    const v0, 0x416428f6    # 14.26f

    .line 819
    .line 820
    .line 821
    const/high16 v2, 0x41380000    # 11.5f

    .line 822
    .line 823
    const/high16 v4, 0x40e00000    # 7.0f

    .line 824
    .line 825
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 826
    .line 827
    .line 828
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 829
    .line 830
    .line 831
    const/high16 v0, 0x41a40000    # 20.5f

    .line 832
    .line 833
    const/high16 v2, 0x41100000    # 9.0f

    .line 834
    .line 835
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 836
    .line 837
    .line 838
    const v17, -0x3fbf5c29    # -3.01f

    .line 839
    .line 840
    .line 841
    const v18, 0x40bf5c29    # 5.98f

    .line 842
    .line 843
    .line 844
    const v14, 0x4069999a    # 3.65f

    .line 845
    .line 846
    .line 847
    const v15, -0x404147ae    # -1.49f

    .line 848
    .line 849
    .line 850
    const v16, 0x40a8a3d7    # 5.27f

    .line 851
    .line 852
    .line 853
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 854
    .line 855
    .line 856
    const v17, 0x3f8147ae    # 1.01f

    .line 857
    .line 858
    .line 859
    const v18, -0x3fa147ae    # -3.48f

    .line 860
    .line 861
    .line 862
    const v13, 0x3f23d70a    # 0.64f

    .line 863
    .line 864
    .line 865
    const v14, -0x407eb852    # -1.01f

    .line 866
    .line 867
    .line 868
    const v15, 0x3f8147ae    # 1.01f

    .line 869
    .line 870
    .line 871
    const v16, -0x3ff33333    # -2.2f

    .line 872
    .line 873
    .line 874
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 875
    .line 876
    .line 877
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 878
    .line 879
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 880
    .line 881
    .line 882
    const/high16 v17, 0x3f800000    # 1.0f

    .line 883
    .line 884
    const/high16 v18, -0x40800000    # -1.0f

    .line 885
    .line 886
    const/4 v13, 0x0

    .line 887
    const v14, -0x40f33333    # -0.55f

    .line 888
    .line 889
    .line 890
    const v15, 0x3ee66666    # 0.45f

    .line 891
    .line 892
    .line 893
    const/high16 v16, -0x40800000    # -1.0f

    .line 894
    .line 895
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 896
    .line 897
    .line 898
    const v0, 0x3ee66666    # 0.45f

    .line 899
    .line 900
    .line 901
    const/high16 v2, 0x3f800000    # 1.0f

    .line 902
    .line 903
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 904
    .line 905
    .line 906
    const/high16 v0, 0x41100000    # 9.0f

    .line 907
    .line 908
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 909
    .line 910
    .line 911
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 912
    .line 913
    .line 914
    const v0, 0x412b0a3d    # 10.69f

    .line 915
    .line 916
    .line 917
    const v2, 0x4127ae14    # 10.48f

    .line 918
    .line 919
    .line 920
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 921
    .line 922
    .line 923
    const v17, -0x4027ae14    # -1.69f

    .line 924
    .line 925
    .line 926
    const v18, 0x3f428f5c    # 0.76f

    .line 927
    .line 928
    .line 929
    const v13, -0x411eb852    # -0.44f

    .line 930
    .line 931
    .line 932
    const v14, 0x3e851eb8    # 0.26f

    .line 933
    .line 934
    .line 935
    const v15, -0x408a3d71    # -0.96f

    .line 936
    .line 937
    .line 938
    const v16, 0x3f0f5c29    # 0.56f

    .line 939
    .line 940
    .line 941
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 942
    .line 943
    .line 944
    const v0, 0x41233333    # 10.2f

    .line 945
    .line 946
    .line 947
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 948
    .line 949
    .line 950
    const v17, 0x3f970a3d    # 1.18f

    .line 951
    .line 952
    .line 953
    const v18, -0x40eb851f    # -0.58f

    .line 954
    .line 955
    .line 956
    const v13, 0x3ef5c28f    # 0.48f

    .line 957
    .line 958
    .line 959
    const v14, -0x41d1eb85    # -0.17f

    .line 960
    .line 961
    .line 962
    const v15, 0x3f570a3d    # 0.84f

    .line 963
    .line 964
    .line 965
    const v16, -0x413d70a4    # -0.38f

    .line 966
    .line 967
    .line 968
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 969
    .line 970
    .line 971
    const/high16 v17, 0x41400000    # 12.0f

    .line 972
    .line 973
    const/high16 v18, 0x41100000    # 9.0f

    .line 974
    .line 975
    const v13, 0x412b851f    # 10.72f

    .line 976
    .line 977
    .line 978
    const v14, 0x4114cccd    # 9.3f

    .line 979
    .line 980
    .line 981
    const v15, 0x4133ae14    # 11.23f

    .line 982
    .line 983
    .line 984
    const/high16 v16, 0x41100000    # 9.0f

    .line 985
    .line 986
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 987
    .line 988
    .line 989
    const v0, 0x3f1eb852    # 0.62f

    .line 990
    .line 991
    .line 992
    const v2, 0x3fe66666    # 1.8f

    .line 993
    .line 994
    .line 995
    const v4, 0x3e99999a    # 0.3f

    .line 996
    .line 997
    .line 998
    const v6, 0x3fa28f5c    # 1.27f

    .line 999
    .line 1000
    .line 1001
    invoke-virtual {v12, v6, v4, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1002
    .line 1003
    .line 1004
    const v17, 0x3f99999a    # 1.2f

    .line 1005
    .line 1006
    .line 1007
    const v18, 0x3f170a3d    # 0.59f

    .line 1008
    .line 1009
    .line 1010
    const v13, 0x3eae147b    # 0.34f

    .line 1011
    .line 1012
    .line 1013
    const v14, 0x3e4ccccd    # 0.2f

    .line 1014
    .line 1015
    .line 1016
    const v15, 0x3f35c28f    # 0.71f

    .line 1017
    .line 1018
    .line 1019
    const v16, 0x3ed70a3d    # 0.42f

    .line 1020
    .line 1021
    .line 1022
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1023
    .line 1024
    .line 1025
    const v0, 0x3f851eb8    # 1.04f

    .line 1026
    .line 1027
    .line 1028
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1029
    .line 1030
    .line 1031
    const v17, -0x40251eb8    # -1.71f

    .line 1032
    .line 1033
    .line 1034
    const v18, -0x40b851ec    # -0.78f

    .line 1035
    .line 1036
    .line 1037
    const/high16 v13, -0x40c00000    # -0.75f

    .line 1038
    .line 1039
    const v14, -0x41a8f5c3    # -0.21f

    .line 1040
    .line 1041
    .line 1042
    const v15, -0x405eb852    # -1.26f

    .line 1043
    .line 1044
    .line 1045
    const v16, -0x40fd70a4    # -0.51f

    .line 1046
    .line 1047
    .line 1048
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1049
    .line 1050
    .line 1051
    const/high16 v17, 0x41400000    # 12.0f

    .line 1052
    .line 1053
    const/high16 v18, 0x41200000    # 10.0f

    .line 1054
    .line 1055
    const v13, 0x414d47ae    # 12.83f

    .line 1056
    .line 1057
    .line 1058
    const v14, 0x41233333    # 10.2f

    .line 1059
    .line 1060
    .line 1061
    const v15, 0x4147d70a    # 12.49f

    .line 1062
    .line 1063
    .line 1064
    const/high16 v16, 0x41200000    # 10.0f

    .line 1065
    .line 1066
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1067
    .line 1068
    .line 1069
    const v17, 0x412b0a3d    # 10.69f

    .line 1070
    .line 1071
    .line 1072
    const v18, 0x4127ae14    # 10.48f

    .line 1073
    .line 1074
    .line 1075
    const v13, 0x413828f6    # 11.51f

    .line 1076
    .line 1077
    .line 1078
    const/high16 v14, 0x41200000    # 10.0f

    .line 1079
    .line 1080
    const v15, 0x41328f5c    # 11.16f

    .line 1081
    .line 1082
    .line 1083
    const v16, 0x41233333    # 10.2f

    .line 1084
    .line 1085
    .line 1086
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1087
    .line 1088
    .line 1089
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1090
    .line 1091
    .line 1092
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v2

    .line 1096
    const/16 v16, 0x3800

    .line 1097
    .line 1098
    const/16 v17, 0x0

    .line 1099
    .line 1100
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1101
    .line 1102
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1103
    .line 1104
    const/4 v7, 0x0

    .line 1105
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1106
    .line 1107
    const/4 v13, 0x0

    .line 1108
    const/4 v14, 0x0

    .line 1109
    const/4 v15, 0x0

    .line 1110
    const-string v4, ""

    .line 1111
    .line 1112
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v0

    .line 1116
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v0

    .line 1120
    sput-object v0, Landroidx/compose/material/icons/twotone/MasksKt;->_masks:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1121
    .line 1122
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1123
    .line 1124
    .line 1125
    return-object v0
.end method
