.class public final Landroidx/compose/material/icons/twotone/BeachAccessKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_beachAccess",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "BeachAccess",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getBeachAccess",
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
        "SMAP\nBeachAccess.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeachAccess.kt\nandroidx/compose/material/icons/twotone/BeachAccessKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,87:1\n212#2,12:88\n233#2,18:101\n253#2:138\n233#2,18:139\n253#2:176\n174#3:100\n705#4,2:119\n717#4,2:121\n719#4,11:127\n705#4,2:157\n717#4,2:159\n719#4,11:165\n72#5,4:123\n72#5,4:161\n*S KotlinDebug\n*F\n+ 1 BeachAccess.kt\nandroidx/compose/material/icons/twotone/BeachAccessKt\n*L\n29#1:88,12\n30#1:101,18\n30#1:138\n50#1:139,18\n50#1:176\n29#1:100\n30#1:119,2\n30#1:121,2\n30#1:127,11\n50#1:157,2\n50#1:159,2\n50#1:165,11\n30#1:123,4\n50#1:161,4\n*E\n"
    }
.end annotation


# static fields
.field private static _beachAccess:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBeachAccess(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/BeachAccessKt;->_beachAccess:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.BeachAccess"

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
    const v4, 0x40f33333    # 7.6f

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 74
    .line 75
    .line 76
    const v25, 0x3fb1eb85    # 1.39f

    .line 77
    .line 78
    .line 79
    const v26, 0x40da8f5c    # 6.83f

    .line 80
    .line 81
    .line 82
    const v21, -0x410f5c29    # -0.47f

    .line 83
    .line 84
    .line 85
    const v22, 0x4015c28f    # 2.34f

    .line 86
    .line 87
    .line 88
    const v23, 0x3cf5c28f    # 0.03f

    .line 89
    .line 90
    .line 91
    const v24, 0x4098f5c3    # 4.78f

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
    const v4, -0x3f51999a    # -5.45f

    .line 100
    .line 101
    .line 102
    const v6, 0x40ae6666    # 5.45f

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v25, -0x3f5d70a4    # -5.08f

    .line 109
    .line 110
    .line 111
    const v26, -0x403851ec    # -1.56f

    .line 112
    .line 113
    .line 114
    const v21, -0x403c28f6    # -1.53f

    .line 115
    .line 116
    .line 117
    const v22, -0x407d70a4    # -1.02f

    .line 118
    .line 119
    .line 120
    const v23, -0x3fae147b    # -3.28f

    .line 121
    .line 122
    .line 123
    const v24, -0x403851ec    # -1.56f

    .line 124
    .line 125
    .line 126
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v25, -0x401eb852    # -1.76f

    .line 130
    .line 131
    .line 132
    const v26, 0x3e3851ec    # 0.18f

    .line 133
    .line 134
    .line 135
    const v21, -0x40e66666    # -0.6f

    .line 136
    .line 137
    .line 138
    const/16 v22, 0x0

    .line 139
    .line 140
    const v23, -0x4067ae14    # -1.19f

    .line 141
    .line 142
    .line 143
    const v24, 0x3d75c28f    # 0.06f

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v4, 0x40a00000    # 5.0f

    .line 153
    .line 154
    const v6, 0x4151eb85    # 13.12f

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v25, -0x3fd51eb8    # -2.67f

    .line 161
    .line 162
    .line 163
    const v26, 0x3eeb851f    # 0.46f

    .line 164
    .line 165
    .line 166
    const v21, -0x4091eb85    # -0.93f

    .line 167
    .line 168
    .line 169
    const v23, -0x40170a3d    # -1.82f

    .line 170
    .line 171
    .line 172
    const v24, 0x3e23d70a    # 0.16f

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v25, 0x40ae147b    # 5.44f

    .line 179
    .line 180
    .line 181
    const v26, 0x40047ae1    # 2.07f

    .line 182
    .line 183
    .line 184
    const v21, 0x3ff47ae1    # 1.91f

    .line 185
    .line 186
    .line 187
    const v22, 0x3e428f5c    # 0.19f

    .line 188
    .line 189
    .line 190
    const v23, 0x40728f5c    # 3.79f

    .line 191
    .line 192
    .line 193
    const v24, 0x3f63d70a    # 0.89f

    .line 194
    .line 195
    .line 196
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v4, 0x3fb1eb85    # 1.39f

    .line 200
    .line 201
    .line 202
    const v6, -0x404e147b    # -1.39f

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const v25, 0x4151eb85    # 13.12f

    .line 209
    .line 210
    .line 211
    const/high16 v26, 0x40a00000    # 5.0f

    .line 212
    .line 213
    const v21, 0x41803d71    # 16.03f

    .line 214
    .line 215
    .line 216
    const v22, 0x40accccd    # 5.4f

    .line 217
    .line 218
    .line 219
    const v23, 0x4169c28f    # 14.61f

    .line 220
    .line 221
    .line 222
    const/high16 v24, 0x40a00000    # 5.0f

    .line 223
    .line 224
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v4, 0x40a00000    # 5.0f

    .line 231
    .line 232
    const v6, 0x4151eb85    # 13.12f

    .line 233
    .line 234
    .line 235
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v25, 0x3f91eb85    # 1.14f

    .line 239
    .line 240
    .line 241
    const v26, 0x4084cccd    # 4.15f

    .line 242
    .line 243
    .line 244
    const/16 v21, 0x0

    .line 245
    .line 246
    const v22, 0x3fbeb852    # 1.49f

    .line 247
    .line 248
    .line 249
    const v23, 0x3ecccccd    # 0.4f

    .line 250
    .line 251
    .line 252
    const v24, 0x403a3d71    # 2.91f

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v4, 0x3fb1eb85    # 1.39f

    .line 259
    .line 260
    .line 261
    const v6, -0x404e147b    # -1.39f

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v25, -0x3ffb851f    # -2.07f

    .line 268
    .line 269
    .line 270
    const v26, -0x3f51eb85    # -5.44f

    .line 271
    .line 272
    .line 273
    const v21, -0x4068f5c3    # -1.18f

    .line 274
    .line 275
    .line 276
    const v22, -0x402ccccd    # -1.65f

    .line 277
    .line 278
    .line 279
    const v23, -0x400f5c29    # -1.88f

    .line 280
    .line 281
    .line 282
    const v24, -0x3f9eb852    # -3.52f

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v25, -0x41147ae1    # -0.46f

    .line 289
    .line 290
    .line 291
    const v26, 0x402b851f    # 2.68f

    .line 292
    .line 293
    .line 294
    const v21, -0x41666666    # -0.3f

    .line 295
    .line 296
    .line 297
    const v22, 0x3f5c28f6    # 0.86f

    .line 298
    .line 299
    .line 300
    const v23, -0x41147ae1    # -0.46f

    .line 301
    .line 302
    .line 303
    const v24, 0x3fe147ae    # 1.76f

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    const/16 v16, 0x3800

    .line 317
    .line 318
    const/16 v17, 0x0

    .line 319
    .line 320
    const v6, 0x3e99999a    # 0.3f

    .line 321
    .line 322
    .line 323
    const v8, 0x3e99999a    # 0.3f

    .line 324
    .line 325
    .line 326
    const/4 v7, 0x0

    .line 327
    const/high16 v9, 0x3f800000    # 1.0f

    .line 328
    .line 329
    const/high16 v12, 0x3f800000    # 1.0f

    .line 330
    .line 331
    const/4 v13, 0x0

    .line 332
    const/4 v14, 0x0

    .line 333
    const/4 v15, 0x0

    .line 334
    const-string v4, ""

    .line 335
    .line 336
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 337
    .line 338
    .line 339
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 340
    .line 341
    .line 342
    move-result v3

    .line 343
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 344
    .line 345
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 346
    .line 347
    .line 348
    move-result-wide v6

    .line 349
    const/4 v0, 0x0

    .line 350
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 354
    .line 355
    .line 356
    move-result v10

    .line 357
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 358
    .line 359
    .line 360
    move-result v11

    .line 361
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 364
    .line 365
    .line 366
    const v0, 0x41520419    # 13.126f

    .line 367
    .line 368
    .line 369
    const v2, 0x4168f5c3    # 14.56f

    .line 370
    .line 371
    .line 372
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v0, -0x4049374c    # -1.428f

    .line 376
    .line 377
    .line 378
    const v2, 0x3fb6c8b4    # 1.428f

    .line 379
    .line 380
    .line 381
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const v0, 0x40ce24dd    # 6.442f

    .line 385
    .line 386
    .line 387
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v0, -0x4048f5c3    # -1.43f

    .line 391
    .line 392
    .line 393
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const/high16 v0, 0x40400000    # 3.0f

    .line 400
    .line 401
    const v2, 0x4151eb85    # 13.12f

    .line 402
    .line 403
    .line 404
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v17, -0x3f1b851f    # -7.14f

    .line 408
    .line 409
    .line 410
    const v18, 0x403ccccd    # 2.95f

    .line 411
    .line 412
    .line 413
    const v13, -0x3fdae148    # -2.58f

    .line 414
    .line 415
    .line 416
    const v15, -0x3f5ae148    # -5.16f

    .line 417
    .line 418
    .line 419
    const v16, 0x3f7ae148    # 0.98f

    .line 420
    .line 421
    .line 422
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const v0, -0x43dc28f6    # -0.01f

    .line 426
    .line 427
    .line 428
    const v2, 0x3c23d70a    # 0.01f

    .line 429
    .line 430
    .line 431
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/16 v17, 0x0

    .line 435
    .line 436
    const v18, 0x4164f5c3    # 14.31f

    .line 437
    .line 438
    .line 439
    const v13, -0x3f833333    # -3.95f

    .line 440
    .line 441
    .line 442
    const v14, 0x407ccccd    # 3.95f

    .line 443
    .line 444
    .line 445
    const v15, -0x3f833333    # -3.95f

    .line 446
    .line 447
    .line 448
    const v16, 0x4125c28f    # 10.36f

    .line 449
    .line 450
    .line 451
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v0, 0x4164cccd    # 14.3f

    .line 455
    .line 456
    .line 457
    const v2, -0x3e9b0a3d    # -14.31f

    .line 458
    .line 459
    .line 460
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v17, 0x4151eb85    # 13.12f

    .line 464
    .line 465
    .line 466
    const/high16 v18, 0x40400000    # 3.0f

    .line 467
    .line 468
    const v13, 0x41926666    # 18.3f

    .line 469
    .line 470
    .line 471
    const v14, 0x407f5c29    # 3.99f

    .line 472
    .line 473
    .line 474
    const v15, 0x417b5c29    # 15.71f

    .line 475
    .line 476
    .line 477
    const/high16 v16, 0x40400000    # 3.0f

    .line 478
    .line 479
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v0, 0x40c47ae1    # 6.14f

    .line 486
    .line 487
    .line 488
    const v2, 0x418a28f6    # 17.27f

    .line 489
    .line 490
    .line 491
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const/high16 v17, 0x40a00000    # 5.0f

    .line 495
    .line 496
    const v18, 0x4151eb85    # 13.12f

    .line 497
    .line 498
    .line 499
    const v13, 0x40accccd    # 5.4f

    .line 500
    .line 501
    .line 502
    const v14, 0x41803d71    # 16.03f

    .line 503
    .line 504
    .line 505
    const/high16 v15, 0x40a00000    # 5.0f

    .line 506
    .line 507
    const v16, 0x4169c28f    # 14.61f

    .line 508
    .line 509
    .line 510
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v17, 0x3eeb851f    # 0.46f

    .line 514
    .line 515
    .line 516
    const v18, -0x3fd51eb8    # -2.67f

    .line 517
    .line 518
    .line 519
    const/4 v13, 0x0

    .line 520
    const v14, -0x4091eb85    # -0.93f

    .line 521
    .line 522
    .line 523
    const v15, 0x3e23d70a    # 0.16f

    .line 524
    .line 525
    .line 526
    const v16, -0x40170a3d    # -1.82f

    .line 527
    .line 528
    .line 529
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const v17, 0x40047ae1    # 2.07f

    .line 533
    .line 534
    .line 535
    const v18, 0x40ae147b    # 5.44f

    .line 536
    .line 537
    .line 538
    const v13, 0x3e428f5c    # 0.19f

    .line 539
    .line 540
    .line 541
    const v14, 0x3ff47ae1    # 1.91f

    .line 542
    .line 543
    .line 544
    const v15, 0x3f63d70a    # 0.89f

    .line 545
    .line 546
    .line 547
    const v16, 0x40728f5c    # 3.79f

    .line 548
    .line 549
    .line 550
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const v0, 0x3fb0a3d7    # 1.38f

    .line 554
    .line 555
    .line 556
    const v2, -0x404e147b    # -1.39f

    .line 557
    .line 558
    .line 559
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const v0, 0x410fae14    # 8.98f

    .line 566
    .line 567
    .line 568
    const v2, 0x4166e148    # 14.43f

    .line 569
    .line 570
    .line 571
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const v17, 0x40f33333    # 7.6f

    .line 575
    .line 576
    .line 577
    const v18, 0x40f33333    # 7.6f

    .line 578
    .line 579
    .line 580
    const v13, 0x40f428f6    # 7.63f

    .line 581
    .line 582
    .line 583
    const v14, 0x4146147b    # 12.38f

    .line 584
    .line 585
    .line 586
    const v15, 0x40e3d70a    # 7.12f

    .line 587
    .line 588
    .line 589
    const v16, 0x411ee148    # 9.93f

    .line 590
    .line 591
    .line 592
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    const/high16 v17, 0x3fe00000    # 1.75f

    .line 596
    .line 597
    const v18, -0x41c7ae14    # -0.18f

    .line 598
    .line 599
    .line 600
    const v13, 0x3f147ae1    # 0.58f

    .line 601
    .line 602
    .line 603
    const v14, -0x420a3d71    # -0.12f

    .line 604
    .line 605
    .line 606
    const v15, 0x3f947ae1    # 1.16f

    .line 607
    .line 608
    .line 609
    const v16, -0x41c7ae14    # -0.18f

    .line 610
    .line 611
    .line 612
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const v17, 0x40a28f5c    # 5.08f

    .line 616
    .line 617
    .line 618
    const v18, 0x3fc7ae14    # 1.56f

    .line 619
    .line 620
    .line 621
    const v13, 0x3fe66666    # 1.8f

    .line 622
    .line 623
    .line 624
    const/4 v14, 0x0

    .line 625
    const v15, 0x40633333    # 3.55f

    .line 626
    .line 627
    .line 628
    const v16, 0x3f0ccccd    # 0.55f

    .line 629
    .line 630
    .line 631
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const v0, -0x3f51999a    # -5.45f

    .line 635
    .line 636
    .line 637
    const v2, 0x40ae6666    # 5.45f

    .line 638
    .line 639
    .line 640
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    const v0, 0x41273333    # 10.45f

    .line 647
    .line 648
    .line 649
    const v2, 0x40aeb852    # 5.46f

    .line 650
    .line 651
    .line 652
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const v17, 0x402ae148    # 2.67f

    .line 656
    .line 657
    .line 658
    const v18, -0x41147ae1    # -0.46f

    .line 659
    .line 660
    .line 661
    const v13, 0x3f59999a    # 0.85f

    .line 662
    .line 663
    .line 664
    const v14, -0x41666666    # -0.3f

    .line 665
    .line 666
    .line 667
    const v15, 0x3fdeb852    # 1.74f

    .line 668
    .line 669
    .line 670
    const v16, -0x41147ae1    # -0.46f

    .line 671
    .line 672
    .line 673
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const v17, 0x4084cccd    # 4.15f

    .line 677
    .line 678
    .line 679
    const v18, 0x3f91eb85    # 1.14f

    .line 680
    .line 681
    .line 682
    const v13, 0x3fbeb852    # 1.49f

    .line 683
    .line 684
    .line 685
    const/4 v14, 0x0

    .line 686
    const v15, 0x403a3d71    # 2.91f

    .line 687
    .line 688
    .line 689
    const v16, 0x3ecccccd    # 0.4f

    .line 690
    .line 691
    .line 692
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const v0, 0x3fb1eb85    # 1.39f

    .line 696
    .line 697
    .line 698
    const v2, -0x404e147b    # -1.39f

    .line 699
    .line 700
    .line 701
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 702
    .line 703
    .line 704
    const v17, -0x3f523d71    # -5.43f

    .line 705
    .line 706
    .line 707
    const v18, -0x3ffb851f    # -2.07f

    .line 708
    .line 709
    .line 710
    const v13, -0x402ccccd    # -1.65f

    .line 711
    .line 712
    .line 713
    const v14, -0x4068f5c3    # -1.18f

    .line 714
    .line 715
    .line 716
    const v15, -0x3f9eb852    # -3.52f

    .line 717
    .line 718
    .line 719
    const v16, -0x400f5c29    # -1.88f

    .line 720
    .line 721
    .line 722
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 723
    .line 724
    .line 725
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 726
    .line 727
    .line 728
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 729
    .line 730
    .line 731
    move-result-object v2

    .line 732
    const/16 v16, 0x3800

    .line 733
    .line 734
    const/16 v17, 0x0

    .line 735
    .line 736
    const/high16 v6, 0x3f800000    # 1.0f

    .line 737
    .line 738
    const/high16 v8, 0x3f800000    # 1.0f

    .line 739
    .line 740
    const/4 v7, 0x0

    .line 741
    const/high16 v12, 0x3f800000    # 1.0f

    .line 742
    .line 743
    const/4 v13, 0x0

    .line 744
    const/4 v14, 0x0

    .line 745
    const/4 v15, 0x0

    .line 746
    const-string v4, ""

    .line 747
    .line 748
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 749
    .line 750
    .line 751
    move-result-object v0

    .line 752
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 753
    .line 754
    .line 755
    move-result-object v0

    .line 756
    sput-object v0, Landroidx/compose/material/icons/twotone/BeachAccessKt;->_beachAccess:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 757
    .line 758
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 759
    .line 760
    .line 761
    return-object v0
.end method
