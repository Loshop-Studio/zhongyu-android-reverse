.class public final Landroidx/compose/material/icons/rounded/RowingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_rowing",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Rowing",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getRowing",
        "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nRowing.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rowing.kt\nandroidx/compose/material/icons/rounded/RowingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,78:1\n212#2,12:79\n233#2,18:92\n253#2:129\n174#3:91\n705#4,2:110\n717#4,2:112\n719#4,11:118\n72#5,4:114\n*S KotlinDebug\n*F\n+ 1 Rowing.kt\nandroidx/compose/material/icons/rounded/RowingKt\n*L\n29#1:79,12\n30#1:92,18\n30#1:129\n29#1:91\n30#1:110,2\n30#1:112,2\n30#1:118,11\n30#1:114,4\n*E\n"
    }
.end annotation


# static fields
.field private static _rowing:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRowing(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/RowingKt;->_rowing:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Rowing"

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
    const/4 v0, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v0, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v0, 0x40980000    # 4.75f

    .line 71
    .line 72
    const/high16 v2, 0x41920000    # 18.25f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/16 v17, 0x0

    .line 78
    .line 79
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 80
    .line 81
    const v13, -0x412e147b    # -0.41f

    .line 82
    .line 83
    .line 84
    const v14, 0x3ed1eb85    # 0.41f

    .line 85
    .line 86
    .line 87
    const v15, -0x412e147b    # -0.41f

    .line 88
    .line 89
    .line 90
    const v16, 0x3f8b851f    # 1.09f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 97
    .line 98
    const/16 v18, 0x0

    .line 99
    .line 100
    const v13, 0x3ed1eb85    # 0.41f

    .line 101
    .line 102
    .line 103
    const v15, 0x3f8b851f    # 1.09f

    .line 104
    .line 105
    .line 106
    const v16, 0x3ed1eb85    # 0.41f

    .line 107
    .line 108
    .line 109
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const/high16 v0, 0x41100000    # 9.0f

    .line 113
    .line 114
    const/high16 v2, 0x41880000    # 17.0f

    .line 115
    .line 116
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v0, 0x40000000    # 2.0f

    .line 120
    .line 121
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v0, -0x3fe00000    # -2.5f

    .line 125
    .line 126
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v0, -0x3f900000    # -3.75f

    .line 130
    .line 131
    const/high16 v2, 0x40700000    # 3.75f

    .line 132
    .line 133
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v0, 0x41700000    # 15.0f

    .line 140
    .line 141
    const/high16 v2, 0x40a00000    # 5.0f

    .line 142
    .line 143
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v17, 0x40000000    # 2.0f

    .line 147
    .line 148
    const/high16 v18, -0x40000000    # -2.0f

    .line 149
    .line 150
    const v13, 0x3f8ccccd    # 1.1f

    .line 151
    .line 152
    .line 153
    const/4 v14, 0x0

    .line 154
    const/high16 v15, 0x40000000    # 2.0f

    .line 155
    .line 156
    const v16, -0x4099999a    # -0.9f

    .line 157
    .line 158
    .line 159
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v0, -0x4099999a    # -0.9f

    .line 163
    .line 164
    .line 165
    const/high16 v2, -0x40000000    # -2.0f

    .line 166
    .line 167
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v0, 0x3f666666    # 0.9f

    .line 171
    .line 172
    .line 173
    const/high16 v2, 0x40000000    # 2.0f

    .line 174
    .line 175
    const/high16 v4, -0x40000000    # -2.0f

    .line 176
    .line 177
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v0, 0x41a251ec    # 20.29f

    .line 187
    .line 188
    .line 189
    const v2, 0x41a26666    # 20.3f

    .line 190
    .line 191
    .line 192
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v0, -0x3fff5c29    # -2.01f

    .line 196
    .line 197
    .line 198
    const/high16 v2, -0x40000000    # -2.0f

    .line 199
    .line 200
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const v17, -0x40ca3d71    # -0.71f

    .line 204
    .line 205
    .line 206
    const v18, -0x416b851f    # -0.29f

    .line 207
    .line 208
    .line 209
    const v13, -0x41c7ae14    # -0.18f

    .line 210
    .line 211
    .line 212
    const v14, -0x41c7ae14    # -0.18f

    .line 213
    .line 214
    .line 215
    const v15, -0x411eb852    # -0.44f

    .line 216
    .line 217
    .line 218
    const v16, -0x416b851f    # -0.29f

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/high16 v0, 0x41840000    # 16.5f

    .line 225
    .line 226
    const/high16 v2, 0x41900000    # 18.0f

    .line 227
    .line 228
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v0, -0x3f36b852    # -6.29f

    .line 232
    .line 233
    .line 234
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v17, 0x40128f5c    # 2.29f

    .line 238
    .line 239
    .line 240
    const v18, -0x404e147b    # -1.39f

    .line 241
    .line 242
    .line 243
    const v13, 0x3f4a3d71    # 0.79f

    .line 244
    .line 245
    .line 246
    const v14, -0x41570a3d    # -0.33f

    .line 247
    .line 248
    .line 249
    const v15, 0x3fd47ae1    # 1.66f

    .line 250
    .line 251
    .line 252
    const v16, -0x40a147ae    # -0.87f

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v0, 0x401147ae    # 2.27f

    .line 259
    .line 260
    .line 261
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v0, 0x40651eb8    # 3.58f

    .line 265
    .line 266
    .line 267
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v17, 0x3f6b851f    # 0.92f

    .line 271
    .line 272
    .line 273
    const v18, -0x3ff5c28f    # -2.16f

    .line 274
    .line 275
    .line 276
    const v13, 0x3f11eb85    # 0.57f

    .line 277
    .line 278
    .line 279
    const v14, -0x40f33333    # -0.55f

    .line 280
    .line 281
    .line 282
    const v15, 0x3f6b851f    # 0.92f

    .line 283
    .line 284
    .line 285
    const v16, -0x40570a3d    # -1.32f

    .line 286
    .line 287
    .line 288
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v0, 0x410428f6    # 8.26f

    .line 292
    .line 293
    .line 294
    const/high16 v2, 0x41880000    # 17.0f

    .line 295
    .line 296
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v17, 0x416bd70a    # 14.74f

    .line 300
    .line 301
    .line 302
    const/high16 v18, 0x40c00000    # 6.0f

    .line 303
    .line 304
    const/high16 v13, 0x41880000    # 17.0f

    .line 305
    .line 306
    const v14, 0x40e0a3d7    # 7.02f

    .line 307
    .line 308
    .line 309
    const v15, 0x417fae14    # 15.98f

    .line 310
    .line 311
    .line 312
    const/high16 v16, 0x40c00000    # 6.0f

    .line 313
    .line 314
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v0, -0x435c28f6    # -0.02f

    .line 318
    .line 319
    .line 320
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v17, -0x408a3d71    # -0.96f

    .line 324
    .line 325
    .line 326
    const v18, 0x3e6b851f    # 0.23f

    .line 327
    .line 328
    .line 329
    const v13, -0x4151eb85    # -0.34f

    .line 330
    .line 331
    .line 332
    const/4 v14, 0x0

    .line 333
    const v15, -0x40d47ae1    # -0.67f

    .line 334
    .line 335
    .line 336
    const v16, 0x3db851ec    # 0.09f

    .line 337
    .line 338
    .line 339
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v17, -0x40cf5c29    # -0.69f

    .line 343
    .line 344
    .line 345
    const/high16 v18, 0x3f000000    # 0.5f

    .line 346
    .line 347
    const v13, -0x417ae148    # -0.26f

    .line 348
    .line 349
    .line 350
    const v14, 0x3df5c28f    # 0.12f

    .line 351
    .line 352
    .line 353
    const/high16 v15, -0x41000000    # -0.5f

    .line 354
    .line 355
    const v16, 0x3e947ae1    # 0.29f

    .line 356
    .line 357
    .line 358
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v0, -0x404ccccd    # -1.4f

    .line 362
    .line 363
    .line 364
    const v2, 0x3fc66666    # 1.55f

    .line 365
    .line 366
    .line 367
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v17, 0x40e00000    # 7.0f

    .line 371
    .line 372
    const v18, 0x41251eb8    # 10.32f

    .line 373
    .line 374
    .line 375
    const v13, 0x4129c28f    # 10.61f

    .line 376
    .line 377
    .line 378
    const v14, 0x41173333    # 9.45f

    .line 379
    .line 380
    .line 381
    const v15, 0x410a8f5c    # 8.66f

    .line 382
    .line 383
    .line 384
    const v16, 0x4125999a    # 10.35f

    .line 385
    .line 386
    .line 387
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v17, -0x4075c28f    # -1.08f

    .line 391
    .line 392
    .line 393
    const v18, 0x3f8a3d71    # 1.08f

    .line 394
    .line 395
    .line 396
    const v13, -0x40e66666    # -0.6f

    .line 397
    .line 398
    .line 399
    const/4 v14, 0x0

    .line 400
    const v15, -0x4075c28f    # -1.08f

    .line 401
    .line 402
    .line 403
    const v16, 0x3ef5c28f    # 0.48f

    .line 404
    .line 405
    .line 406
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v17, 0x3f8a3d71    # 1.08f

    .line 410
    .line 411
    .line 412
    const/4 v13, 0x0

    .line 413
    const v14, 0x3f19999a    # 0.6f

    .line 414
    .line 415
    .line 416
    const v15, 0x3ef5c28f    # 0.48f

    .line 417
    .line 418
    .line 419
    const v16, 0x3f8a3d71    # 1.08f

    .line 420
    .line 421
    .line 422
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const v17, 0x3f666666    # 0.9f

    .line 426
    .line 427
    .line 428
    const v18, -0x4270a3d7    # -0.07f

    .line 429
    .line 430
    .line 431
    const v13, 0x3e9eb852    # 0.31f

    .line 432
    .line 433
    .line 434
    const/4 v14, 0x0

    .line 435
    const v15, 0x3f1c28f6    # 0.61f

    .line 436
    .line 437
    .line 438
    const v16, -0x430a3d71    # -0.03f

    .line 439
    .line 440
    .line 441
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v0, 0x40e3851f    # 7.11f

    .line 445
    .line 446
    .line 447
    const v2, 0x40e2e148    # 7.09f

    .line 448
    .line 449
    .line 450
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v0, 0x3f8a3d71    # 1.08f

    .line 454
    .line 455
    .line 456
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v17, 0x3e947ae1    # 0.29f

    .line 460
    .line 461
    .line 462
    const v18, 0x3f333333    # 0.7f

    .line 463
    .line 464
    .line 465
    const/4 v13, 0x0

    .line 466
    const v14, 0x3e851eb8    # 0.26f

    .line 467
    .line 468
    .line 469
    const v15, 0x3dcccccd    # 0.1f

    .line 470
    .line 471
    .line 472
    const v16, 0x3f051eb8    # 0.52f

    .line 473
    .line 474
    .line 475
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const v0, 0x3ffeb852    # 1.99f

    .line 479
    .line 480
    .line 481
    const v2, 0x4000a3d7    # 2.01f

    .line 482
    .line 483
    .line 484
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v17, 0x3fb5c28f    # 1.42f

    .line 488
    .line 489
    .line 490
    const/16 v18, 0x0

    .line 491
    .line 492
    const v13, 0x3ec7ae14    # 0.39f

    .line 493
    .line 494
    .line 495
    const v14, 0x3ec7ae14    # 0.39f

    .line 496
    .line 497
    .line 498
    const v15, 0x3f828f5c    # 1.02f

    .line 499
    .line 500
    .line 501
    const v16, 0x3ec7ae14    # 0.39f

    .line 502
    .line 503
    .line 504
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const v0, 0x3fca3d71    # 1.58f

    .line 508
    .line 509
    .line 510
    const v2, -0x4035c28f    # -1.58f

    .line 511
    .line 512
    .line 513
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const/16 v17, 0x0

    .line 517
    .line 518
    const v18, -0x404b851f    # -1.41f

    .line 519
    .line 520
    .line 521
    const v14, -0x413d70a4    # -0.38f

    .line 522
    .line 523
    .line 524
    const v15, 0x3ec7ae14    # 0.39f

    .line 525
    .line 526
    .line 527
    const v16, -0x407d70a4    # -1.02f

    .line 528
    .line 529
    .line 530
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 537
    .line 538
    .line 539
    move-result-object v2

    .line 540
    const/16 v16, 0x3800

    .line 541
    .line 542
    const/16 v17, 0x0

    .line 543
    .line 544
    const/high16 v6, 0x3f800000    # 1.0f

    .line 545
    .line 546
    const/high16 v8, 0x3f800000    # 1.0f

    .line 547
    .line 548
    const/4 v7, 0x0

    .line 549
    const/high16 v9, 0x3f800000    # 1.0f

    .line 550
    .line 551
    const/high16 v12, 0x3f800000    # 1.0f

    .line 552
    .line 553
    const/4 v13, 0x0

    .line 554
    const/4 v14, 0x0

    .line 555
    const/4 v15, 0x0

    .line 556
    const-string v4, ""

    .line 557
    .line 558
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 563
    .line 564
    .line 565
    move-result-object v0

    .line 566
    sput-object v0, Landroidx/compose/material/icons/rounded/RowingKt;->_rowing:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 567
    .line 568
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 569
    .line 570
    .line 571
    return-object v0
.end method
