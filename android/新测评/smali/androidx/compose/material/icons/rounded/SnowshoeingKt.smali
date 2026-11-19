.class public final Landroidx/compose/material/icons/rounded/SnowshoeingKt;
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
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getSnowshoeing",
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
        "SMAP\nSnowshoeing.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snowshoeing.kt\nandroidx/compose/material/icons/rounded/SnowshoeingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,86:1\n212#2,12:87\n233#2,18:100\n253#2:137\n174#3:99\n705#4,2:118\n717#4,2:120\n719#4,11:126\n72#5,4:122\n*S KotlinDebug\n*F\n+ 1 Snowshoeing.kt\nandroidx/compose/material/icons/rounded/SnowshoeingKt\n*L\n29#1:87,12\n30#1:100,18\n30#1:137\n29#1:99\n30#1:118,2\n30#1:120,2\n30#1:126,11\n30#1:122,4\n*E\n"
    }
.end annotation


# static fields
.field private static _snowshoeing:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSnowshoeing(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SnowshoeingKt;->_snowshoeing:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Snowshoeing"

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
    const/high16 v0, 0x41a00000    # 20.0f

    .line 130
    .line 131
    const v2, 0x413e8f5c    # 11.91f

    .line 132
    .line 133
    .line 134
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v17, -0x40a8f5c3    # -0.84f

    .line 138
    .line 139
    .line 140
    const v18, -0x40851eb8    # -0.98f

    .line 141
    .line 142
    .line 143
    const v14, -0x41051eb8    # -0.49f

    .line 144
    .line 145
    .line 146
    const v15, -0x4147ae14    # -0.36f

    .line 147
    .line 148
    .line 149
    const v16, -0x4099999a    # -0.9f

    .line 150
    .line 151
    .line 152
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v17, -0x3fa1eb85    # -3.47f

    .line 156
    .line 157
    .line 158
    const v18, -0x3fe9999a    # -2.35f

    .line 159
    .line 160
    .line 161
    const v13, -0x403c28f6    # -1.53f

    .line 162
    .line 163
    .line 164
    const/high16 v14, -0x41800000    # -0.25f

    .line 165
    .line 166
    const v15, -0x3fcd70a4    # -2.79f

    .line 167
    .line 168
    .line 169
    const v16, -0x406b851f    # -1.16f

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v0, -0x4035c28f    # -1.58f

    .line 176
    .line 177
    .line 178
    const/high16 v2, -0x40800000    # -1.0f

    .line 179
    .line 180
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v17, -0x40266666    # -1.7f

    .line 184
    .line 185
    .line 186
    const/high16 v18, -0x40800000    # -1.0f

    .line 187
    .line 188
    const v13, -0x41333333    # -0.4f

    .line 189
    .line 190
    .line 191
    const v14, -0x40e66666    # -0.6f

    .line 192
    .line 193
    .line 194
    const/high16 v15, -0x40800000    # -1.0f

    .line 195
    .line 196
    const/high16 v16, -0x40800000    # -1.0f

    .line 197
    .line 198
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v17, -0x3f675c29    # -4.77f

    .line 202
    .line 203
    .line 204
    const v18, 0x3fe147ae    # 1.76f

    .line 205
    .line 206
    .line 207
    const v13, -0x40d1eb85    # -0.68f

    .line 208
    .line 209
    .line 210
    const/4 v14, 0x0

    .line 211
    const v15, -0x405c28f6    # -1.28f

    .line 212
    .line 213
    .line 214
    const v16, 0x3e8f5c29    # 0.28f

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v17, 0x40e00000    # 7.0f

    .line 221
    .line 222
    const v18, 0x4119999a    # 9.6f

    .line 223
    .line 224
    .line 225
    const v13, 0x40efae14    # 7.49f

    .line 226
    .line 227
    .line 228
    const v14, 0x41011eb8    # 8.07f

    .line 229
    .line 230
    .line 231
    const/high16 v15, 0x40e00000    # 7.0f

    .line 232
    .line 233
    const v16, 0x410ccccd    # 8.8f

    .line 234
    .line 235
    .line 236
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/high16 v0, 0x41400000    # 12.0f

    .line 240
    .line 241
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v17, 0x3f800000    # 1.0f

    .line 245
    .line 246
    const/high16 v18, 0x3f800000    # 1.0f

    .line 247
    .line 248
    const/4 v13, 0x0

    .line 249
    const v14, 0x3f0ccccd    # 0.55f

    .line 250
    .line 251
    .line 252
    const v15, 0x3ee66666    # 0.45f

    .line 253
    .line 254
    .line 255
    const/high16 v16, 0x3f800000    # 1.0f

    .line 256
    .line 257
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v0, -0x4119999a    # -0.45f

    .line 261
    .line 262
    .line 263
    const/high16 v2, 0x3f800000    # 1.0f

    .line 264
    .line 265
    const/high16 v4, -0x40800000    # -1.0f

    .line 266
    .line 267
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v0, 0x411947ae    # 9.58f

    .line 271
    .line 272
    .line 273
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v0, 0x3fe51eb8    # 1.79f

    .line 277
    .line 278
    .line 279
    const v2, -0x40cccccd    # -0.7f

    .line 280
    .line 281
    .line 282
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v0, 0x41133333    # 9.2f

    .line 286
    .line 287
    .line 288
    const/high16 v2, 0x41880000    # 17.0f

    .line 289
    .line 290
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v0, -0x3fc7ae14    # -2.88f

    .line 294
    .line 295
    .line 296
    const v2, 0x4001eb85    # 2.03f

    .line 297
    .line 298
    .line 299
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v0, -0x406e147b    # -1.14f

    .line 303
    .line 304
    .line 305
    const v2, -0x4043d70a    # -1.47f

    .line 306
    .line 307
    .line 308
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const/high16 v0, 0x40800000    # 4.0f

    .line 312
    .line 313
    const/high16 v2, 0x41940000    # 18.5f

    .line 314
    .line 315
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v0, 0x401851ec    # 2.38f

    .line 319
    .line 320
    .line 321
    const v2, 0x40428f5c    # 3.04f

    .line 322
    .line 323
    .line 324
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v17, 0x3ff0a3d7    # 1.88f

    .line 328
    .line 329
    .line 330
    const v18, 0x3fb47ae1    # 1.41f

    .line 331
    .line 332
    .line 333
    const v13, 0x3f028f5c    # 0.51f

    .line 334
    .line 335
    .line 336
    const v14, 0x3f266666    # 0.65f

    .line 337
    .line 338
    .line 339
    const v15, 0x3f947ae1    # 1.16f

    .line 340
    .line 341
    .line 342
    const v16, 0x3f933333    # 1.15f

    .line 343
    .line 344
    .line 345
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v17, 0x3f3851ec    # 0.72f

    .line 349
    .line 350
    .line 351
    const v18, -0x421eb852    # -0.11f

    .line 352
    .line 353
    .line 354
    const v13, 0x3e8f5c29    # 0.28f

    .line 355
    .line 356
    .line 357
    const v14, 0x3dcccccd    # 0.1f

    .line 358
    .line 359
    .line 360
    const v15, 0x3f07ae14    # 0.53f

    .line 361
    .line 362
    .line 363
    const v16, 0x3d23d70a    # 0.04f

    .line 364
    .line 365
    .line 366
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v17, 0x3df5c28f    # 0.12f

    .line 370
    .line 371
    .line 372
    const v18, -0x40770a3d    # -1.07f

    .line 373
    .line 374
    .line 375
    const v13, 0x3e99999a    # 0.3f

    .line 376
    .line 377
    .line 378
    const v14, -0x41947ae1    # -0.23f

    .line 379
    .line 380
    .line 381
    const v15, 0x3ed70a3d    # 0.42f

    .line 382
    .line 383
    .line 384
    const v16, -0x40cccccd    # -0.7f

    .line 385
    .line 386
    .line 387
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v17, -0x416147ae    # -0.31f

    .line 391
    .line 392
    .line 393
    const v18, -0x419eb852    # -0.22f

    .line 394
    .line 395
    .line 396
    const v13, -0x425c28f6    # -0.08f

    .line 397
    .line 398
    .line 399
    const v14, -0x42333333    # -0.1f

    .line 400
    .line 401
    .line 402
    const v15, -0x41b33333    # -0.2f

    .line 403
    .line 404
    .line 405
    const v16, -0x41d1eb85    # -0.17f

    .line 406
    .line 407
    .line 408
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v17, -0x406e147b    # -1.14f

    .line 412
    .line 413
    .line 414
    const v18, -0x40ab851f    # -0.83f

    .line 415
    .line 416
    .line 417
    const v13, -0x4123d70a    # -0.43f

    .line 418
    .line 419
    .line 420
    const v14, -0x41c7ae14    # -0.18f

    .line 421
    .line 422
    .line 423
    const v15, -0x40ae147b    # -0.82f

    .line 424
    .line 425
    .line 426
    const v16, -0x4119999a    # -0.45f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v0, -0x425c28f6    # -0.08f

    .line 433
    .line 434
    .line 435
    const v2, -0x42333333    # -0.1f

    .line 436
    .line 437
    .line 438
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v0, 0x40366666    # 2.85f

    .line 442
    .line 443
    .line 444
    const v2, -0x3fff5c29    # -2.01f

    .line 445
    .line 446
    .line 447
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v17, 0x3f451eb8    # 0.77f

    .line 451
    .line 452
    .line 453
    const v18, -0x40733333    # -1.1f

    .line 454
    .line 455
    .line 456
    const v13, 0x3ec28f5c    # 0.38f

    .line 457
    .line 458
    .line 459
    const v14, -0x4175c28f    # -0.27f

    .line 460
    .line 461
    .line 462
    const v15, 0x3f266666    # 0.65f

    .line 463
    .line 464
    .line 465
    const v16, -0x40d70a3d    # -0.66f

    .line 466
    .line 467
    .line 468
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v0, 0x3f333333    # 0.7f

    .line 472
    .line 473
    .line 474
    const v2, -0x3fde147b    # -2.53f

    .line 475
    .line 476
    .line 477
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const v0, 0x40070a3d    # 2.11f

    .line 481
    .line 482
    .line 483
    const/high16 v2, 0x40000000    # 2.0f

    .line 484
    .line 485
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const v0, 0x4090a3d7    # 4.52f

    .line 489
    .line 490
    .line 491
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const/high16 v0, -0x40000000    # -2.0f

    .line 495
    .line 496
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const/high16 v0, 0x41b80000    # 23.0f

    .line 500
    .line 501
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const v0, 0x4077ae14    # 3.87f

    .line 505
    .line 506
    .line 507
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const v17, 0x4010a3d7    # 2.26f

    .line 511
    .line 512
    .line 513
    const v18, -0x40e3d70a    # -0.61f

    .line 514
    .line 515
    .line 516
    const v13, 0x3f51eb85    # 0.82f

    .line 517
    .line 518
    .line 519
    const/4 v14, 0x0

    .line 520
    const v15, 0x3fce147b    # 1.61f

    .line 521
    .line 522
    .line 523
    const v16, -0x41a8f5c3    # -0.21f

    .line 524
    .line 525
    .line 526
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const v17, 0x3ebd70a4    # 0.37f

    .line 530
    .line 531
    .line 532
    const v18, -0x40dc28f6    # -0.64f

    .line 533
    .line 534
    .line 535
    const v13, 0x3e851eb8    # 0.26f

    .line 536
    .line 537
    .line 538
    const v14, -0x41dc28f6    # -0.16f

    .line 539
    .line 540
    .line 541
    const v15, 0x3ebd70a4    # 0.37f

    .line 542
    .line 543
    .line 544
    const v16, -0x413851ec    # -0.39f

    .line 545
    .line 546
    .line 547
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const v17, -0x40bae148    # -0.77f

    .line 551
    .line 552
    .line 553
    const/high16 v18, -0x40c00000    # -0.75f

    .line 554
    .line 555
    const/4 v13, 0x0

    .line 556
    const v14, -0x413d70a4    # -0.38f

    .line 557
    .line 558
    .line 559
    const v15, -0x41666666    # -0.3f

    .line 560
    .line 561
    .line 562
    const/high16 v16, -0x40c00000    # -0.75f

    .line 563
    .line 564
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const v17, -0x41428f5c    # -0.37f

    .line 568
    .line 569
    .line 570
    const v18, 0x3dcccccd    # 0.1f

    .line 571
    .line 572
    .line 573
    const v13, -0x41fae148    # -0.13f

    .line 574
    .line 575
    .line 576
    const/4 v14, 0x0

    .line 577
    const v15, -0x417ae148    # -0.26f

    .line 578
    .line 579
    .line 580
    const v16, 0x3d23d70a    # 0.04f

    .line 581
    .line 582
    .line 583
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const v17, -0x4051eb85    # -1.36f

    .line 587
    .line 588
    .line 589
    const v18, 0x3ecccccd    # 0.4f

    .line 590
    .line 591
    .line 592
    const v13, -0x41333333    # -0.4f

    .line 593
    .line 594
    .line 595
    const v14, 0x3e6b851f    # 0.23f

    .line 596
    .line 597
    .line 598
    const v15, -0x40a147ae    # -0.87f

    .line 599
    .line 600
    .line 601
    const v16, 0x3ebd70a4    # 0.37f

    .line 602
    .line 603
    .line 604
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const/4 v0, 0x0

    .line 608
    const v2, -0x3f5ae148    # -5.16f

    .line 609
    .line 610
    .line 611
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const v17, -0x40e147ae    # -0.62f

    .line 615
    .line 616
    .line 617
    const v18, -0x40466666    # -1.45f

    .line 618
    .line 619
    .line 620
    const/4 v13, 0x0

    .line 621
    const v14, -0x40f33333    # -0.55f

    .line 622
    .line 623
    .line 624
    const v15, -0x41947ae1    # -0.23f

    .line 625
    .line 626
    .line 627
    const v16, -0x40770a3d    # -1.07f

    .line 628
    .line 629
    .line 630
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const v0, -0x404147ae    # -1.49f

    .line 634
    .line 635
    .line 636
    const v2, -0x404b851f    # -1.41f

    .line 637
    .line 638
    .line 639
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const v0, 0x3f19999a    # 0.6f

    .line 643
    .line 644
    .line 645
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 646
    .line 647
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const v17, 0x408bd70a    # 4.37f

    .line 651
    .line 652
    .line 653
    const v18, 0x401b851f    # 2.43f

    .line 654
    .line 655
    .line 656
    const v13, 0x3f88f5c3    # 1.07f

    .line 657
    .line 658
    .line 659
    const v14, 0x3f9eb852    # 1.24f

    .line 660
    .line 661
    .line 662
    const v15, 0x402851ec    # 2.63f

    .line 663
    .line 664
    .line 665
    const v16, 0x4009999a    # 2.15f

    .line 666
    .line 667
    .line 668
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const/high16 v17, 0x41a00000    # 20.0f

    .line 672
    .line 673
    const v18, 0x413e8f5c    # 11.91f

    .line 674
    .line 675
    .line 676
    const v13, 0x419bae14    # 19.46f

    .line 677
    .line 678
    .line 679
    const v14, 0x415028f6    # 13.01f

    .line 680
    .line 681
    .line 682
    const/high16 v15, 0x41a00000    # 20.0f

    .line 683
    .line 684
    const v16, 0x414851ec    # 12.52f

    .line 685
    .line 686
    .line 687
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 691
    .line 692
    .line 693
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 694
    .line 695
    .line 696
    move-result-object v2

    .line 697
    const/16 v16, 0x3800

    .line 698
    .line 699
    const/16 v17, 0x0

    .line 700
    .line 701
    const/high16 v6, 0x3f800000    # 1.0f

    .line 702
    .line 703
    const/high16 v8, 0x3f800000    # 1.0f

    .line 704
    .line 705
    const/4 v7, 0x0

    .line 706
    const/high16 v9, 0x3f800000    # 1.0f

    .line 707
    .line 708
    const/high16 v12, 0x3f800000    # 1.0f

    .line 709
    .line 710
    const/4 v13, 0x0

    .line 711
    const/4 v14, 0x0

    .line 712
    const/4 v15, 0x0

    .line 713
    const-string v4, ""

    .line 714
    .line 715
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 716
    .line 717
    .line 718
    move-result-object v0

    .line 719
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 720
    .line 721
    .line 722
    move-result-object v0

    .line 723
    sput-object v0, Landroidx/compose/material/icons/rounded/SnowshoeingKt;->_snowshoeing:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 724
    .line 725
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 726
    .line 727
    .line 728
    return-object v0
.end method
