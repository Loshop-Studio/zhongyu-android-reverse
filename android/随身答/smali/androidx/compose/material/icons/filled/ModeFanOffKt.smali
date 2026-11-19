.class public final Landroidx/compose/material/icons/filled/ModeFanOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_modeFanOff",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "ModeFanOff",
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getModeFanOff",
        "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nModeFanOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModeFanOff.kt\nandroidx/compose/material/icons/filled/ModeFanOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,63:1\n212#2,12:64\n233#2,18:77\n253#2:114\n233#2,18:115\n253#2:152\n174#3:76\n705#4,2:95\n717#4,2:97\n719#4,11:103\n705#4,2:133\n717#4,2:135\n719#4,11:141\n72#5,4:99\n72#5,4:137\n*S KotlinDebug\n*F\n+ 1 ModeFanOff.kt\nandroidx/compose/material/icons/filled/ModeFanOffKt\n*L\n29#1:64,12\n30#1:77,18\n30#1:114\n42#1:115,18\n42#1:152\n29#1:76\n30#1:95,2\n30#1:97,2\n30#1:103,11\n42#1:133,2\n42#1:135,2\n42#1:141,11\n30#1:99,4\n42#1:137,4\n*E\n"
    }
.end annotation


# static fields
.field private static _modeFanOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getModeFanOff(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/ModeFanOffKt;->_modeFanOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.ModeFanOff"

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
    const v4, 0x4182b852    # 16.34f

    .line 71
    .line 72
    .line 73
    const v6, 0x4105c28f    # 8.36f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, -0x3fed70a4    # -2.29f

    .line 80
    .line 81
    .line 82
    const v6, 0x3f51eb85    # 0.82f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v25, -0x40eb851f    # -0.58f

    .line 89
    .line 90
    .line 91
    const v26, -0x4151eb85    # -0.34f

    .line 92
    .line 93
    .line 94
    const v21, -0x41c7ae14    # -0.18f

    .line 95
    .line 96
    .line 97
    const v22, -0x41fae148    # -0.13f

    .line 98
    .line 99
    .line 100
    const v23, -0x413d70a4    # -0.38f

    .line 101
    .line 102
    .line 103
    const/high16 v24, -0x41800000    # -0.25f

    .line 104
    .line 105
    move-object/from16 v20, v2

    .line 106
    .line 107
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const v25, 0x3fae147b    # 1.36f

    .line 111
    .line 112
    .line 113
    const v26, -0x3ffc28f6    # -2.06f

    .line 114
    .line 115
    .line 116
    const v21, 0x3e2e147b    # 0.17f

    .line 117
    .line 118
    .line 119
    const v22, -0x40ab851f    # -0.83f

    .line 120
    .line 121
    .line 122
    const v23, 0x3f2147ae    # 0.63f

    .line 123
    .line 124
    .line 125
    const v24, -0x4035c28f    # -1.58f

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v25, 0x41563d71    # 13.39f

    .line 132
    .line 133
    .line 134
    const/high16 v26, 0x40000000    # 2.0f

    .line 135
    .line 136
    const v21, 0x4186cccd    # 16.85f

    .line 137
    .line 138
    .line 139
    const v22, 0x40ae147b    # 5.44f

    .line 140
    .line 141
    .line 142
    const v23, 0x418170a4    # 16.18f

    .line 143
    .line 144
    .line 145
    const/high16 v24, 0x40000000    # 2.0f

    .line 146
    .line 147
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v25, -0x3f566666    # -5.3f

    .line 151
    .line 152
    .line 153
    const v26, 0x4050a3d7    # 3.26f

    .line 154
    .line 155
    .line 156
    const v21, -0x3fbae148    # -3.08f

    .line 157
    .line 158
    .line 159
    const/16 v22, 0x0

    .line 160
    .line 161
    const v23, -0x3f633333    # -4.9f

    .line 162
    .line 163
    .line 164
    const v24, 0x3fbc28f6    # 1.47f

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v4, 0x4195d70a    # 18.73f

    .line 171
    .line 172
    .line 173
    const v6, 0x417e6666    # 15.9f

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v25, 0x405147ae    # 3.27f

    .line 180
    .line 181
    .line 182
    const v26, -0x3fdf5c29    # -2.51f

    .line 183
    .line 184
    .line 185
    const/high16 v21, 0x3fc00000    # 1.5f

    .line 186
    .line 187
    const v22, 0x3ec7ae14    # 0.39f

    .line 188
    .line 189
    .line 190
    const v23, 0x405147ae    # 3.27f

    .line 191
    .line 192
    .line 193
    const v24, -0x40fd70a4    # -0.51f

    .line 194
    .line 195
    .line 196
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v25, 0x4182b852    # 16.34f

    .line 200
    .line 201
    .line 202
    const v26, 0x4105c28f    # 8.36f

    .line 203
    .line 204
    .line 205
    const/high16 v21, 0x41b00000    # 22.0f

    .line 206
    .line 207
    const/high16 v22, 0x41100000    # 9.0f

    .line 208
    .line 209
    const v23, 0x4197eb85    # 18.99f

    .line 210
    .line 211
    .line 212
    const v24, 0x40e51eb8    # 7.16f

    .line 213
    .line 214
    .line 215
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    const/16 v16, 0x3800

    .line 226
    .line 227
    const/16 v17, 0x0

    .line 228
    .line 229
    const/high16 v6, 0x3f800000    # 1.0f

    .line 230
    .line 231
    const/high16 v8, 0x3f800000    # 1.0f

    .line 232
    .line 233
    const/4 v7, 0x0

    .line 234
    const/high16 v9, 0x3f800000    # 1.0f

    .line 235
    .line 236
    const/high16 v12, 0x3f800000    # 1.0f

    .line 237
    .line 238
    const/4 v13, 0x0

    .line 239
    const/4 v14, 0x0

    .line 240
    const/4 v15, 0x0

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
    const v0, 0x4033d70a    # 2.81f

    .line 274
    .line 275
    .line 276
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v0, 0x3fb1eb85    # 1.39f

    .line 280
    .line 281
    .line 282
    const v2, 0x40870a3d    # 4.22f

    .line 283
    .line 284
    .line 285
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v0, 0x40a8a3d7    # 5.27f

    .line 289
    .line 290
    .line 291
    const v2, 0x4101999a    # 8.1f

    .line 292
    .line 293
    .line 294
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const/high16 v17, 0x40000000    # 2.0f

    .line 298
    .line 299
    const v18, 0x4129c28f    # 10.61f

    .line 300
    .line 301
    .line 302
    const v13, 0x407147ae    # 3.77f

    .line 303
    .line 304
    .line 305
    const v14, 0x40f66666    # 7.7f

    .line 306
    .line 307
    .line 308
    const/high16 v15, 0x40000000    # 2.0f

    .line 309
    .line 310
    const v16, 0x4109c28f    # 8.61f

    .line 311
    .line 312
    .line 313
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v17, 0x40b51eb8    # 5.66f

    .line 317
    .line 318
    .line 319
    const v18, 0x40a0f5c3    # 5.03f

    .line 320
    .line 321
    .line 322
    const/4 v13, 0x0

    .line 323
    const v14, 0x408ccccd    # 4.4f

    .line 324
    .line 325
    .line 326
    const v15, 0x4040a3d7    # 3.01f

    .line 327
    .line 328
    .line 329
    const v16, 0x40c7ae14    # 6.24f

    .line 330
    .line 331
    .line 332
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v0, 0x40128f5c    # 2.29f

    .line 336
    .line 337
    .line 338
    const v2, -0x40ae147b    # -0.82f

    .line 339
    .line 340
    .line 341
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v17, 0x3f147ae1    # 0.58f

    .line 345
    .line 346
    .line 347
    const v18, 0x3eae147b    # 0.34f

    .line 348
    .line 349
    .line 350
    const v13, 0x3e3851ec    # 0.18f

    .line 351
    .line 352
    .line 353
    const v14, 0x3e051eb8    # 0.13f

    .line 354
    .line 355
    .line 356
    const v15, 0x3ec28f5c    # 0.38f

    .line 357
    .line 358
    .line 359
    const/high16 v16, 0x3e800000    # 0.25f

    .line 360
    .line 361
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const v17, -0x4051eb85    # -1.36f

    .line 365
    .line 366
    .line 367
    const v18, 0x4003d70a    # 2.06f

    .line 368
    .line 369
    .line 370
    const v13, -0x41d1eb85    # -0.17f

    .line 371
    .line 372
    .line 373
    const v14, 0x3f547ae1    # 0.83f

    .line 374
    .line 375
    .line 376
    const v15, -0x40deb852    # -0.63f

    .line 377
    .line 378
    .line 379
    const v16, 0x3fca3d71    # 1.58f

    .line 380
    .line 381
    .line 382
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const v17, 0x4129c28f    # 10.61f

    .line 386
    .line 387
    .line 388
    const/high16 v18, 0x41b00000    # 22.0f

    .line 389
    .line 390
    const v13, 0x40e4cccd    # 7.15f

    .line 391
    .line 392
    .line 393
    const v14, 0x41947ae1    # 18.56f

    .line 394
    .line 395
    .line 396
    const v15, 0x40fa3d71    # 7.82f

    .line 397
    .line 398
    .line 399
    const/high16 v16, 0x41b00000    # 22.0f

    .line 400
    .line 401
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v17, 0x40a9999a    # 5.3f

    .line 405
    .line 406
    .line 407
    const v18, -0x3faf5c29    # -3.26f

    .line 408
    .line 409
    .line 410
    const v13, 0x40451eb8    # 3.08f

    .line 411
    .line 412
    .line 413
    const/4 v14, 0x0

    .line 414
    const v15, 0x409ccccd    # 4.9f

    .line 415
    .line 416
    .line 417
    const v16, -0x4043d70a    # -1.47f

    .line 418
    .line 419
    .line 420
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v0, 0x4077ae14    # 3.87f

    .line 424
    .line 425
    .line 426
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v0, 0x3fb47ae1    # 1.41f

    .line 430
    .line 431
    .line 432
    const v2, -0x404b851f    # -1.41f

    .line 433
    .line 434
    .line 435
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v0, 0x4033d70a    # 2.81f

    .line 439
    .line 440
    .line 441
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 448
    .line 449
    .line 450
    move-result-object v2

    .line 451
    const/16 v16, 0x3800

    .line 452
    .line 453
    const/16 v17, 0x0

    .line 454
    .line 455
    const/high16 v6, 0x3f800000    # 1.0f

    .line 456
    .line 457
    const/4 v7, 0x0

    .line 458
    const/high16 v12, 0x3f800000    # 1.0f

    .line 459
    .line 460
    const/4 v13, 0x0

    .line 461
    const/4 v15, 0x0

    .line 462
    const-string v4, ""

    .line 463
    .line 464
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    sput-object v0, Landroidx/compose/material/icons/filled/ModeFanOffKt;->_modeFanOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 473
    .line 474
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 475
    .line 476
    .line 477
    return-object v0
.end method
