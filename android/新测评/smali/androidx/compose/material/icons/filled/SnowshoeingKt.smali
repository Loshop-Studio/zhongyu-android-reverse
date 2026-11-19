.class public final Landroidx/compose/material/icons/filled/SnowshoeingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_snowshoeing",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Snowshoeing",
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getSnowshoeing",
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
        "SMAP\nSnowshoeing.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snowshoeing.kt\nandroidx/compose/material/icons/filled/SnowshoeingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,81:1\n212#2,12:82\n233#2,18:95\n253#2:132\n174#3:94\n705#4,2:113\n717#4,2:115\n719#4,11:121\n72#5,4:117\n*S KotlinDebug\n*F\n+ 1 Snowshoeing.kt\nandroidx/compose/material/icons/filled/SnowshoeingKt\n*L\n29#1:82,12\n30#1:95,18\n30#1:132\n29#1:94\n30#1:113,2\n30#1:115,2\n30#1:121,11\n30#1:117,4\n*E\n"
    }
.end annotation


# static fields
.field private static _snowshoeing:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSnowshoeing(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/SnowshoeingKt;->_snowshoeing:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.Snowshoeing"

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
    const/high16 v0, 0x40600000    # 3.5f

    .line 71
    .line 72
    const/high16 v2, 0x41480000    # 12.5f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x40000000    # 2.0f

    .line 78
    .line 79
    const/high16 v18, -0x40000000    # -2.0f

    .line 80
    .line 81
    const/4 v13, 0x0

    .line 82
    const v14, -0x40733333    # -1.1f

    .line 83
    .line 84
    .line 85
    const v15, 0x3f666666    # 0.9f

    .line 86
    .line 87
    .line 88
    const/high16 v16, -0x40000000    # -2.0f

    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, 0x3f666666    # 0.9f

    .line 94
    .line 95
    .line 96
    const/high16 v2, 0x40000000    # 2.0f

    .line 97
    .line 98
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v17, -0x40000000    # -2.0f

    .line 102
    .line 103
    const/high16 v18, 0x40000000    # 2.0f

    .line 104
    .line 105
    const v14, 0x3f8ccccd    # 1.1f

    .line 106
    .line 107
    .line 108
    const v15, -0x4099999a    # -0.9f

    .line 109
    .line 110
    .line 111
    const/high16 v16, 0x40000000    # 2.0f

    .line 112
    .line 113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v0, 0x40933333    # 4.6f

    .line 117
    .line 118
    .line 119
    const/high16 v2, 0x40600000    # 3.5f

    .line 120
    .line 121
    const/high16 v4, 0x41480000    # 12.5f

    .line 122
    .line 123
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v0, 0x41983d71    # 19.03f

    .line 130
    .line 131
    .line 132
    const v2, 0x40ca3d71    # 6.32f

    .line 133
    .line 134
    .line 135
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v0, -0x406e147b    # -1.14f

    .line 139
    .line 140
    .line 141
    const v2, -0x4043d70a    # -1.47f

    .line 142
    .line 143
    .line 144
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v0, 0x40800000    # 4.0f

    .line 148
    .line 149
    const/high16 v2, 0x41940000    # 18.5f

    .line 150
    .line 151
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v0, 0x401851ec    # 2.38f

    .line 155
    .line 156
    .line 157
    const v2, 0x40428f5c    # 3.04f

    .line 158
    .line 159
    .line 160
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v17, 0x3ff0a3d7    # 1.88f

    .line 164
    .line 165
    .line 166
    const v18, 0x3fb47ae1    # 1.41f

    .line 167
    .line 168
    .line 169
    const v13, 0x3f028f5c    # 0.51f

    .line 170
    .line 171
    .line 172
    const v14, 0x3f266666    # 0.65f

    .line 173
    .line 174
    .line 175
    const v15, 0x3f947ae1    # 1.16f

    .line 176
    .line 177
    .line 178
    const v16, 0x3f933333    # 1.15f

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v17, 0x3f3851ec    # 0.72f

    .line 185
    .line 186
    .line 187
    const v18, -0x421eb852    # -0.11f

    .line 188
    .line 189
    .line 190
    const v13, 0x3e8f5c29    # 0.28f

    .line 191
    .line 192
    .line 193
    const v14, 0x3dcccccd    # 0.1f

    .line 194
    .line 195
    .line 196
    const v15, 0x3f07ae14    # 0.53f

    .line 197
    .line 198
    .line 199
    const v16, 0x3d23d70a    # 0.04f

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v17, 0x3df5c28f    # 0.12f

    .line 206
    .line 207
    .line 208
    const v18, -0x40770a3d    # -1.07f

    .line 209
    .line 210
    .line 211
    const v13, 0x3e99999a    # 0.3f

    .line 212
    .line 213
    .line 214
    const v14, -0x41947ae1    # -0.23f

    .line 215
    .line 216
    .line 217
    const v15, 0x3ed70a3d    # 0.42f

    .line 218
    .line 219
    .line 220
    const v16, -0x40cccccd    # -0.7f

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v17, -0x416147ae    # -0.31f

    .line 227
    .line 228
    .line 229
    const v18, -0x419eb852    # -0.22f

    .line 230
    .line 231
    .line 232
    const v13, -0x425c28f6    # -0.08f

    .line 233
    .line 234
    .line 235
    const v14, -0x42333333    # -0.1f

    .line 236
    .line 237
    .line 238
    const v15, -0x41b33333    # -0.2f

    .line 239
    .line 240
    .line 241
    const v16, -0x41d1eb85    # -0.17f

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v17, -0x406e147b    # -1.14f

    .line 248
    .line 249
    .line 250
    const v18, -0x40ab851f    # -0.83f

    .line 251
    .line 252
    .line 253
    const v13, -0x4123d70a    # -0.43f

    .line 254
    .line 255
    .line 256
    const v14, -0x41c7ae14    # -0.18f

    .line 257
    .line 258
    .line 259
    const v15, -0x40ae147b    # -0.82f

    .line 260
    .line 261
    .line 262
    const v16, -0x4119999a    # -0.45f

    .line 263
    .line 264
    .line 265
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v0, -0x425c28f6    # -0.08f

    .line 269
    .line 270
    .line 271
    const v2, -0x42333333    # -0.1f

    .line 272
    .line 273
    .line 274
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v0, 0x41300000    # 11.0f

    .line 278
    .line 279
    const v2, 0x4191999a    # 18.2f

    .line 280
    .line 281
    .line 282
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v0, 0x3f63d70a    # 0.89f

    .line 286
    .line 287
    .line 288
    const v2, -0x3fb1eb85    # -3.22f

    .line 289
    .line 290
    .line 291
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v0, 0x40070a3d    # 2.11f

    .line 295
    .line 296
    .line 297
    const/high16 v2, 0x40000000    # 2.0f

    .line 298
    .line 299
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v0, 0x4090a3d7    # 4.52f

    .line 303
    .line 304
    .line 305
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v0, -0x40000000    # -2.0f

    .line 309
    .line 310
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v0, 0x41b80000    # 23.0f

    .line 314
    .line 315
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v0, 0x4077ae14    # 3.87f

    .line 319
    .line 320
    .line 321
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v17, 0x4010a3d7    # 2.26f

    .line 325
    .line 326
    .line 327
    const v18, -0x40e3d70a    # -0.61f

    .line 328
    .line 329
    .line 330
    const v13, 0x3f51eb85    # 0.82f

    .line 331
    .line 332
    .line 333
    const/4 v14, 0x0

    .line 334
    const v15, 0x3fce147b    # 1.61f

    .line 335
    .line 336
    .line 337
    const v16, -0x41a8f5c3    # -0.21f

    .line 338
    .line 339
    .line 340
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v17, 0x3ebd70a4    # 0.37f

    .line 344
    .line 345
    .line 346
    const v18, -0x40dc28f6    # -0.64f

    .line 347
    .line 348
    .line 349
    const v13, 0x3e851eb8    # 0.26f

    .line 350
    .line 351
    .line 352
    const v14, -0x41dc28f6    # -0.16f

    .line 353
    .line 354
    .line 355
    const v15, 0x3ebd70a4    # 0.37f

    .line 356
    .line 357
    .line 358
    const v16, -0x413851ec    # -0.39f

    .line 359
    .line 360
    .line 361
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const v17, -0x40bae148    # -0.77f

    .line 365
    .line 366
    .line 367
    const/high16 v18, -0x40c00000    # -0.75f

    .line 368
    .line 369
    const/4 v13, 0x0

    .line 370
    const v14, -0x413d70a4    # -0.38f

    .line 371
    .line 372
    .line 373
    const v15, -0x41666666    # -0.3f

    .line 374
    .line 375
    .line 376
    const/high16 v16, -0x40c00000    # -0.75f

    .line 377
    .line 378
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v17, -0x41428f5c    # -0.37f

    .line 382
    .line 383
    .line 384
    const v18, 0x3dcccccd    # 0.1f

    .line 385
    .line 386
    .line 387
    const v13, -0x41fae148    # -0.13f

    .line 388
    .line 389
    .line 390
    const/4 v14, 0x0

    .line 391
    const v15, -0x417ae148    # -0.26f

    .line 392
    .line 393
    .line 394
    const v16, 0x3d23d70a    # 0.04f

    .line 395
    .line 396
    .line 397
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v17, -0x4051eb85    # -1.36f

    .line 401
    .line 402
    .line 403
    const v18, 0x3ecccccd    # 0.4f

    .line 404
    .line 405
    .line 406
    const v13, -0x41333333    # -0.4f

    .line 407
    .line 408
    .line 409
    const v14, 0x3e6b851f    # 0.23f

    .line 410
    .line 411
    .line 412
    const v15, -0x40a147ae    # -0.87f

    .line 413
    .line 414
    .line 415
    const v16, 0x3ebd70a4    # 0.37f

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/4 v0, 0x0

    .line 422
    const v2, -0x3f3f5c29    # -6.02f

    .line 423
    .line 424
    .line 425
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const v0, -0x3ff8f5c3    # -2.11f

    .line 429
    .line 430
    .line 431
    const/high16 v2, -0x40000000    # -2.0f

    .line 432
    .line 433
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v0, 0x3f19999a    # 0.6f

    .line 437
    .line 438
    .line 439
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 440
    .line 441
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const/high16 v17, 0x41a00000    # 20.0f

    .line 445
    .line 446
    const/high16 v18, 0x41500000    # 13.0f

    .line 447
    .line 448
    const v13, 0x417ca3d7    # 15.79f

    .line 449
    .line 450
    .line 451
    const v14, 0x413fae14    # 11.98f

    .line 452
    .line 453
    .line 454
    const v15, 0x418e6666    # 17.8f

    .line 455
    .line 456
    .line 457
    const/high16 v16, 0x41500000    # 13.0f

    .line 458
    .line 459
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const/high16 v0, -0x40000000    # -2.0f

    .line 463
    .line 464
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const v17, -0x3f76147b    # -4.31f

    .line 468
    .line 469
    .line 470
    const v18, -0x3fe51eb8    # -2.42f

    .line 471
    .line 472
    .line 473
    const v13, -0x400ccccd    # -1.9f

    .line 474
    .line 475
    .line 476
    const/4 v14, 0x0

    .line 477
    const v15, -0x3f9f5c29    # -3.51f

    .line 478
    .line 479
    .line 480
    const v16, -0x407d70a4    # -1.02f

    .line 481
    .line 482
    .line 483
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const/high16 v0, -0x40800000    # -1.0f

    .line 487
    .line 488
    const v2, -0x4035c28f    # -1.58f

    .line 489
    .line 490
    .line 491
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const v17, -0x40266666    # -1.7f

    .line 495
    .line 496
    .line 497
    const/high16 v18, -0x40800000    # -1.0f

    .line 498
    .line 499
    const v13, -0x41333333    # -0.4f

    .line 500
    .line 501
    .line 502
    const v14, -0x40e66666    # -0.6f

    .line 503
    .line 504
    .line 505
    const/high16 v15, -0x40800000    # -1.0f

    .line 506
    .line 507
    const/high16 v16, -0x40800000    # -1.0f

    .line 508
    .line 509
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const/high16 v17, 0x40e00000    # 7.0f

    .line 513
    .line 514
    const v18, 0x41047ae1    # 8.28f

    .line 515
    .line 516
    .line 517
    const v13, 0x4143d70a    # 12.24f

    .line 518
    .line 519
    .line 520
    const/high16 v14, 0x40c00000    # 6.0f

    .line 521
    .line 522
    const v15, 0x413947ae    # 11.58f

    .line 523
    .line 524
    .line 525
    const v16, 0x40cae148    # 6.34f

    .line 526
    .line 527
    .line 528
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const/high16 v0, 0x41500000    # 13.0f

    .line 532
    .line 533
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const/high16 v0, 0x40000000    # 2.0f

    .line 537
    .line 538
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const v0, 0x411947ae    # 9.58f

    .line 542
    .line 543
    .line 544
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const v0, 0x3fe51eb8    # 1.79f

    .line 548
    .line 549
    .line 550
    const v2, -0x40cccccd    # -0.7f

    .line 551
    .line 552
    .line 553
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const v0, 0x41133333    # 9.2f

    .line 557
    .line 558
    .line 559
    const/high16 v2, 0x41880000    # 17.0f

    .line 560
    .line 561
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const v0, 0x41983d71    # 19.03f

    .line 565
    .line 566
    .line 567
    const v2, 0x40ca3d71    # 6.32f

    .line 568
    .line 569
    .line 570
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 577
    .line 578
    .line 579
    move-result-object v2

    .line 580
    const/16 v16, 0x3800

    .line 581
    .line 582
    const/16 v17, 0x0

    .line 583
    .line 584
    const/high16 v6, 0x3f800000    # 1.0f

    .line 585
    .line 586
    const/high16 v8, 0x3f800000    # 1.0f

    .line 587
    .line 588
    const/4 v7, 0x0

    .line 589
    const/high16 v9, 0x3f800000    # 1.0f

    .line 590
    .line 591
    const/high16 v12, 0x3f800000    # 1.0f

    .line 592
    .line 593
    const/4 v13, 0x0

    .line 594
    const/4 v14, 0x0

    .line 595
    const/4 v15, 0x0

    .line 596
    const-string v4, ""

    .line 597
    .line 598
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 599
    .line 600
    .line 601
    move-result-object v0

    .line 602
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    sput-object v0, Landroidx/compose/material/icons/filled/SnowshoeingKt;->_snowshoeing:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 607
    .line 608
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 609
    .line 610
    .line 611
    return-object v0
.end method
