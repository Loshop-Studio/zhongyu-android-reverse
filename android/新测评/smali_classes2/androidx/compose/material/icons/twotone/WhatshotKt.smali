.class public final Landroidx/compose/material/icons/twotone/WhatshotKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_whatshot",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Whatshot",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getWhatshot",
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
        "SMAP\nWhatshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Whatshot.kt\nandroidx/compose/material/icons/twotone/WhatshotKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,79:1\n212#2,12:80\n233#2,18:93\n253#2:130\n233#2,18:131\n253#2:168\n174#3:92\n705#4,2:111\n717#4,2:113\n719#4,11:119\n705#4,2:149\n717#4,2:151\n719#4,11:157\n72#5,4:115\n72#5,4:153\n*S KotlinDebug\n*F\n+ 1 Whatshot.kt\nandroidx/compose/material/icons/twotone/WhatshotKt\n*L\n29#1:80,12\n30#1:93,18\n30#1:130\n47#1:131,18\n47#1:168\n29#1:92\n30#1:111,2\n30#1:113,2\n30#1:119,11\n47#1:149,2\n47#1:151,2\n47#1:157,11\n30#1:115,4\n47#1:153,4\n*E\n"
    }
.end annotation


# static fields
.field private static _whatshot:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWhatshot(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/WhatshotKt;->_whatshot:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Whatshot"

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
    const v4, 0x4180e148    # 16.11f

    .line 71
    .line 72
    .line 73
    const v6, 0x40d8a3d7    # 6.77f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, -0x3f570a3d    # -5.28f

    .line 80
    .line 81
    .line 82
    const v26, 0x408dc28f    # 4.43f

    .line 83
    .line 84
    .line 85
    const v21, -0x40f851ec    # -0.53f

    .line 86
    .line 87
    .line 88
    const v22, 0x40266666    # 2.6f

    .line 89
    .line 90
    .line 91
    const v23, -0x3fd851ec    # -2.62f

    .line 92
    .line 93
    .line 94
    const v24, 0x408dc28f    # 4.43f

    .line 95
    .line 96
    .line 97
    move-object/from16 v20, v2

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v25, -0x3f81eb85    # -3.97f

    .line 103
    .line 104
    .line 105
    const v26, -0x402f5c29    # -1.63f

    .line 106
    .line 107
    .line 108
    const v21, -0x403851ec    # -1.56f

    .line 109
    .line 110
    .line 111
    const/16 v22, 0x0

    .line 112
    .line 113
    const v23, -0x3fc28f5c    # -2.96f

    .line 114
    .line 115
    .line 116
    const v24, -0x40e147ae    # -0.62f

    .line 117
    .line 118
    .line 119
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v25, 0x40c00000    # 6.0f

    .line 123
    .line 124
    const/high16 v26, 0x41600000    # 14.0f

    .line 125
    .line 126
    const v21, 0x40c9999a    # 6.3f

    .line 127
    .line 128
    .line 129
    const v22, 0x412f5c29    # 10.96f

    .line 130
    .line 131
    .line 132
    const/high16 v23, 0x40c00000    # 6.0f

    .line 133
    .line 134
    const v24, 0x4147851f    # 12.47f

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v26, 0x40c00000    # 6.0f

    .line 141
    .line 142
    const/16 v21, 0x0

    .line 143
    .line 144
    const v22, 0x4053d70a    # 3.31f

    .line 145
    .line 146
    .line 147
    const v23, 0x402c28f6    # 2.69f

    .line 148
    .line 149
    .line 150
    const/high16 v24, 0x40c00000    # 6.0f

    .line 151
    .line 152
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v4, -0x3fd3d70a    # -2.69f

    .line 156
    .line 157
    .line 158
    const/high16 v6, -0x3f400000    # -6.0f

    .line 159
    .line 160
    const/high16 v7, 0x40c00000    # 6.0f

    .line 161
    .line 162
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v25, -0x400e147b    # -1.89f

    .line 166
    .line 167
    .line 168
    const v26, -0x3f18a3d7    # -7.23f

    .line 169
    .line 170
    .line 171
    const v22, -0x3fdc28f6    # -2.56f

    .line 172
    .line 173
    .line 174
    const v23, -0x40d70a3d    # -0.66f

    .line 175
    .line 176
    .line 177
    const v24, -0x3f5f0a3d    # -5.03f

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v4, 0x413e3d71    # 11.89f

    .line 187
    .line 188
    .line 189
    const v6, 0x418feb85    # 17.99f

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v25, -0x3fe0a3d7    # -2.49f

    .line 196
    .line 197
    .line 198
    const v26, -0x3fe51eb8    # -2.42f

    .line 199
    .line 200
    .line 201
    const v21, -0x4050a3d7    # -1.37f

    .line 202
    .line 203
    .line 204
    const/16 v22, 0x0

    .line 205
    .line 206
    const v23, -0x3fe0a3d7    # -2.49f

    .line 207
    .line 208
    .line 209
    const v24, -0x4075c28f    # -1.08f

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v25, 0x400ae148    # 2.17f

    .line 216
    .line 217
    .line 218
    const v26, -0x3fe5c28f    # -2.41f

    .line 219
    .line 220
    .line 221
    const/16 v21, 0x0

    .line 222
    .line 223
    const/high16 v22, -0x40600000    # -1.25f

    .line 224
    .line 225
    const v23, 0x3f4f5c29    # 0.81f

    .line 226
    .line 227
    .line 228
    const v24, -0x3ff7ae14    # -2.13f

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v25, 0x40647ae1    # 3.57f

    .line 235
    .line 236
    .line 237
    const v26, -0x400147ae    # -1.99f

    .line 238
    .line 239
    .line 240
    const v21, 0x3faf5c29    # 1.37f

    .line 241
    .line 242
    .line 243
    const v22, -0x4170a3d7    # -0.28f

    .line 244
    .line 245
    .line 246
    const v23, 0x4031eb85    # 2.78f

    .line 247
    .line 248
    .line 249
    const v24, -0x4091eb85    # -0.93f

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v25, 0x3eeb851f    # 0.46f

    .line 256
    .line 257
    .line 258
    const v26, 0x4047ae14    # 3.12f

    .line 259
    .line 260
    .line 261
    const v21, 0x3e99999a    # 0.3f

    .line 262
    .line 263
    .line 264
    const/high16 v22, 0x3f800000    # 1.0f

    .line 265
    .line 266
    const v23, 0x3eeb851f    # 0.46f

    .line 267
    .line 268
    .line 269
    const v24, 0x40033333    # 2.05f

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v25, -0x3f928f5c    # -3.71f

    .line 276
    .line 277
    .line 278
    const v26, 0x406ccccd    # 3.7f

    .line 279
    .line 280
    .line 281
    const/16 v21, 0x0

    .line 282
    .line 283
    const v22, 0x40028f5c    # 2.04f

    .line 284
    .line 285
    .line 286
    const v23, -0x402b851f    # -1.66f

    .line 287
    .line 288
    .line 289
    const v24, 0x406ccccd    # 3.7f

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    const/16 v16, 0x3800

    .line 303
    .line 304
    const/16 v17, 0x0

    .line 305
    .line 306
    const v6, 0x3e99999a    # 0.3f

    .line 307
    .line 308
    .line 309
    const v8, 0x3e99999a    # 0.3f

    .line 310
    .line 311
    .line 312
    const/4 v7, 0x0

    .line 313
    const/high16 v9, 0x3f800000    # 1.0f

    .line 314
    .line 315
    const/high16 v12, 0x3f800000    # 1.0f

    .line 316
    .line 317
    const/4 v13, 0x0

    .line 318
    const/4 v14, 0x0

    .line 319
    const/4 v15, 0x0

    .line 320
    const-string v4, ""

    .line 321
    .line 322
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 323
    .line 324
    .line 325
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 326
    .line 327
    .line 328
    move-result v3

    .line 329
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 330
    .line 331
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 332
    .line 333
    .line 334
    move-result-wide v6

    .line 335
    const/4 v0, 0x0

    .line 336
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 337
    .line 338
    .line 339
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 340
    .line 341
    .line 342
    move-result v10

    .line 343
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 344
    .line 345
    .line 346
    move-result v11

    .line 347
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 350
    .line 351
    .line 352
    const v0, 0x41391eb8    # 11.57f

    .line 353
    .line 354
    .line 355
    const v2, 0x41528f5c    # 13.16f

    .line 356
    .line 357
    .line 358
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v17, -0x3ff51eb8    # -2.17f

    .line 362
    .line 363
    .line 364
    const v18, 0x401a3d71    # 2.41f

    .line 365
    .line 366
    .line 367
    const v13, -0x4051eb85    # -1.36f

    .line 368
    .line 369
    .line 370
    const v14, 0x3e8f5c29    # 0.28f

    .line 371
    .line 372
    .line 373
    const v15, -0x3ff51eb8    # -2.17f

    .line 374
    .line 375
    .line 376
    const v16, 0x3f947ae1    # 1.16f

    .line 377
    .line 378
    .line 379
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v17, 0x401f5c29    # 2.49f

    .line 383
    .line 384
    .line 385
    const v18, 0x401ae148    # 2.42f

    .line 386
    .line 387
    .line 388
    const/4 v13, 0x0

    .line 389
    const v14, 0x3fab851f    # 1.34f

    .line 390
    .line 391
    .line 392
    const v15, 0x3f8e147b    # 1.11f

    .line 393
    .line 394
    .line 395
    const v16, 0x401ae148    # 2.42f

    .line 396
    .line 397
    .line 398
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v17, 0x406d70a4    # 3.71f

    .line 402
    .line 403
    .line 404
    const v18, -0x3f928f5c    # -3.71f

    .line 405
    .line 406
    .line 407
    const v13, 0x40033333    # 2.05f

    .line 408
    .line 409
    .line 410
    const/4 v14, 0x0

    .line 411
    const v15, 0x406d70a4    # 3.71f

    .line 412
    .line 413
    .line 414
    const v16, -0x402b851f    # -1.66f

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v17, -0x41147ae1    # -0.46f

    .line 421
    .line 422
    .line 423
    const v18, -0x3fb851ec    # -3.12f

    .line 424
    .line 425
    .line 426
    const/4 v13, 0x0

    .line 427
    const v14, -0x40770a3d    # -1.07f

    .line 428
    .line 429
    .line 430
    const v15, -0x41e66666    # -0.15f

    .line 431
    .line 432
    .line 433
    const v16, -0x3ff851ec    # -2.12f

    .line 434
    .line 435
    .line 436
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v17, -0x3f9b851f    # -3.57f

    .line 440
    .line 441
    .line 442
    const/high16 v18, 0x40000000    # 2.0f

    .line 443
    .line 444
    const v13, -0x40b5c28f    # -0.79f

    .line 445
    .line 446
    .line 447
    const v14, 0x3f88f5c3    # 1.07f

    .line 448
    .line 449
    .line 450
    const v15, -0x3ff33333    # -2.2f

    .line 451
    .line 452
    .line 453
    const v16, 0x3fdc28f6    # 1.72f

    .line 454
    .line 455
    .line 456
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const/high16 v0, 0x41580000    # 13.5f

    .line 463
    .line 464
    const v2, 0x3f2b851f    # 0.67f

    .line 465
    .line 466
    .line 467
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v0, 0x4029999a    # 2.65f

    .line 471
    .line 472
    .line 473
    const v2, 0x4099999a    # 4.8f

    .line 474
    .line 475
    .line 476
    const v4, 0x3f3d70a4    # 0.74f

    .line 477
    .line 478
    .line 479
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v17, -0x3fa5c28f    # -3.41f

    .line 483
    .line 484
    .line 485
    const v18, 0x406eb852    # 3.73f

    .line 486
    .line 487
    .line 488
    const/4 v13, 0x0

    .line 489
    const v14, 0x4003d70a    # 2.06f

    .line 490
    .line 491
    .line 492
    const v15, -0x40533333    # -1.35f

    .line 493
    .line 494
    .line 495
    const v16, 0x406eb852    # 3.73f

    .line 496
    .line 497
    .line 498
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const v17, -0x3f97ae14    # -3.63f

    .line 502
    .line 503
    .line 504
    const v18, -0x3f9147ae    # -3.73f

    .line 505
    .line 506
    .line 507
    const v13, -0x3ffb851f    # -2.07f

    .line 508
    .line 509
    .line 510
    const/4 v14, 0x0

    .line 511
    const v15, -0x3f97ae14    # -3.63f

    .line 512
    .line 513
    .line 514
    const v16, -0x402a3d71    # -1.67f

    .line 515
    .line 516
    .line 517
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const v0, 0x3cf5c28f    # 0.03f

    .line 521
    .line 522
    .line 523
    const v2, -0x4147ae14    # -0.36f

    .line 524
    .line 525
    .line 526
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const/high16 v17, 0x40800000    # 4.0f

    .line 530
    .line 531
    const/high16 v18, 0x41600000    # 14.0f

    .line 532
    .line 533
    const v13, 0x40a6b852    # 5.21f

    .line 534
    .line 535
    .line 536
    const v14, 0x40f051ec    # 7.51f

    .line 537
    .line 538
    .line 539
    const/high16 v15, 0x40800000    # 4.0f

    .line 540
    .line 541
    const v16, 0x4129eb85    # 10.62f

    .line 542
    .line 543
    .line 544
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const/high16 v17, 0x41000000    # 8.0f

    .line 548
    .line 549
    const/high16 v18, 0x41000000    # 8.0f

    .line 550
    .line 551
    const/4 v13, 0x0

    .line 552
    const v14, 0x408d70a4    # 4.42f

    .line 553
    .line 554
    .line 555
    const v15, 0x40651eb8    # 3.58f

    .line 556
    .line 557
    .line 558
    const/high16 v16, 0x41000000    # 8.0f

    .line 559
    .line 560
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const v0, -0x3f9ae148    # -3.58f

    .line 564
    .line 565
    .line 566
    const/high16 v2, -0x3f000000    # -8.0f

    .line 567
    .line 568
    const/high16 v4, 0x41000000    # 8.0f

    .line 569
    .line 570
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const/high16 v17, 0x41580000    # 13.5f

    .line 574
    .line 575
    const v18, 0x3f2b851f    # 0.67f

    .line 576
    .line 577
    .line 578
    const/high16 v13, 0x41a00000    # 20.0f

    .line 579
    .line 580
    const v14, 0x4109c28f    # 8.61f

    .line 581
    .line 582
    .line 583
    const v15, 0x418b47ae    # 17.41f

    .line 584
    .line 585
    .line 586
    const v16, 0x40733333    # 3.8f

    .line 587
    .line 588
    .line 589
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    const/high16 v0, 0x41400000    # 12.0f

    .line 596
    .line 597
    const/high16 v2, 0x41a00000    # 20.0f

    .line 598
    .line 599
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const/high16 v17, -0x3f400000    # -6.0f

    .line 603
    .line 604
    const/high16 v18, -0x3f400000    # -6.0f

    .line 605
    .line 606
    const v13, -0x3fac28f6    # -3.31f

    .line 607
    .line 608
    .line 609
    const/4 v14, 0x0

    .line 610
    const/high16 v15, -0x3f400000    # -6.0f

    .line 611
    .line 612
    const v16, -0x3fd3d70a    # -2.69f

    .line 613
    .line 614
    .line 615
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const v17, 0x3f5c28f6    # 0.86f

    .line 619
    .line 620
    .line 621
    const v18, -0x3f723d71    # -4.43f

    .line 622
    .line 623
    .line 624
    const/4 v13, 0x0

    .line 625
    const v14, -0x403c28f6    # -1.53f

    .line 626
    .line 627
    .line 628
    const v15, 0x3e99999a    # 0.3f

    .line 629
    .line 630
    .line 631
    const v16, -0x3fbd70a4    # -3.04f

    .line 632
    .line 633
    .line 634
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const v17, 0x407e147b    # 3.97f

    .line 638
    .line 639
    .line 640
    const v18, 0x3fd0a3d7    # 1.63f

    .line 641
    .line 642
    .line 643
    const v13, 0x3f8147ae    # 1.01f

    .line 644
    .line 645
    .line 646
    const v14, 0x3f8147ae    # 1.01f

    .line 647
    .line 648
    .line 649
    const v15, 0x401a3d71    # 2.41f

    .line 650
    .line 651
    .line 652
    const v16, 0x3fd0a3d7    # 1.63f

    .line 653
    .line 654
    .line 655
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const v17, 0x40a8f5c3    # 5.28f

    .line 659
    .line 660
    .line 661
    const v18, -0x3f723d71    # -4.43f

    .line 662
    .line 663
    .line 664
    const v13, 0x402a3d71    # 2.66f

    .line 665
    .line 666
    .line 667
    const/4 v14, 0x0

    .line 668
    const/high16 v15, 0x40980000    # 4.75f

    .line 669
    .line 670
    const v16, -0x4015c28f    # -1.83f

    .line 671
    .line 672
    .line 673
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const/high16 v17, 0x41900000    # 18.0f

    .line 677
    .line 678
    const/high16 v18, 0x41600000    # 14.0f

    .line 679
    .line 680
    const v13, 0x418ab852    # 17.34f

    .line 681
    .line 682
    .line 683
    const v14, 0x410f851f    # 8.97f

    .line 684
    .line 685
    .line 686
    const/high16 v15, 0x41900000    # 18.0f

    .line 687
    .line 688
    const v16, 0x41370a3d    # 11.44f

    .line 689
    .line 690
    .line 691
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 692
    .line 693
    .line 694
    const/high16 v17, -0x3f400000    # -6.0f

    .line 695
    .line 696
    const/high16 v18, 0x40c00000    # 6.0f

    .line 697
    .line 698
    const/4 v13, 0x0

    .line 699
    const v14, 0x4053d70a    # 3.31f

    .line 700
    .line 701
    .line 702
    const v15, -0x3fd3d70a    # -2.69f

    .line 703
    .line 704
    .line 705
    const/high16 v16, 0x40c00000    # 6.0f

    .line 706
    .line 707
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 711
    .line 712
    .line 713
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 714
    .line 715
    .line 716
    move-result-object v2

    .line 717
    const/16 v16, 0x3800

    .line 718
    .line 719
    const/16 v17, 0x0

    .line 720
    .line 721
    const/high16 v6, 0x3f800000    # 1.0f

    .line 722
    .line 723
    const/high16 v8, 0x3f800000    # 1.0f

    .line 724
    .line 725
    const/4 v7, 0x0

    .line 726
    const/high16 v12, 0x3f800000    # 1.0f

    .line 727
    .line 728
    const/4 v14, 0x0

    .line 729
    const/4 v15, 0x0

    .line 730
    const-string v4, ""

    .line 731
    .line 732
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 733
    .line 734
    .line 735
    move-result-object v0

    .line 736
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 737
    .line 738
    .line 739
    move-result-object v0

    .line 740
    sput-object v0, Landroidx/compose/material/icons/twotone/WhatshotKt;->_whatshot:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 741
    .line 742
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 743
    .line 744
    .line 745
    return-object v0
.end method
