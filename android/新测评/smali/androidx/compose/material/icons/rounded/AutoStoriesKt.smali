.class public final Landroidx/compose/material/icons/rounded/AutoStoriesKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_autoStories",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "AutoStories",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getAutoStories",
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
        "SMAP\nAutoStories.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoStories.kt\nandroidx/compose/material/icons/rounded/AutoStoriesKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,66:1\n212#2,12:67\n233#2,18:80\n253#2:117\n174#3:79\n705#4,2:98\n717#4,2:100\n719#4,11:106\n72#5,4:102\n*S KotlinDebug\n*F\n+ 1 AutoStories.kt\nandroidx/compose/material/icons/rounded/AutoStoriesKt\n*L\n29#1:67,12\n30#1:80,18\n30#1:117\n29#1:79\n30#1:98,2\n30#1:100,2\n30#1:106,11\n30#1:102,4\n*E\n"
    }
.end annotation


# static fields
.field private static _autoStories:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAutoStories(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/AutoStoriesKt;->_autoStories:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.AutoStories"

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
    const v0, 0x41913333    # 18.15f

    .line 71
    .line 72
    .line 73
    const v2, 0x3faccccd    # 1.35f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v0, -0x3f800000    # -4.0f

    .line 80
    .line 81
    const/high16 v2, 0x40800000    # 4.0f

    .line 82
    .line 83
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const/high16 v17, 0x41600000    # 14.0f

    .line 87
    .line 88
    const v18, 0x40b6b852    # 5.71f

    .line 89
    .line 90
    .line 91
    const v13, 0x4160cccd    # 14.05f

    .line 92
    .line 93
    .line 94
    const v14, 0x40ae6666    # 5.45f

    .line 95
    .line 96
    .line 97
    const/high16 v15, 0x41600000    # 14.0f

    .line 98
    .line 99
    const v16, 0x40b23d71    # 5.57f

    .line 100
    .line 101
    .line 102
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v0, 0x4102b852    # 8.17f

    .line 106
    .line 107
    .line 108
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v17, 0x3f547ae1    # 0.83f

    .line 112
    .line 113
    .line 114
    const v18, 0x3ebd70a4    # 0.37f

    .line 115
    .line 116
    .line 117
    const/4 v13, 0x0

    .line 118
    const v14, 0x3edc28f6    # 0.43f

    .line 119
    .line 120
    .line 121
    const v15, 0x3f028f5c    # 0.51f

    .line 122
    .line 123
    .line 124
    const v16, 0x3f28f5c3    # 0.66f

    .line 125
    .line 126
    .line 127
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v0, -0x3f99999a    # -3.6f

    .line 131
    .line 132
    .line 133
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v17, 0x3e2e147b    # 0.17f

    .line 137
    .line 138
    .line 139
    const v18, -0x41428f5c    # -0.37f

    .line 140
    .line 141
    .line 142
    const v13, 0x3de147ae    # 0.11f

    .line 143
    .line 144
    .line 145
    const v14, -0x4247ae14    # -0.09f

    .line 146
    .line 147
    .line 148
    const v15, 0x3e2e147b    # 0.17f

    .line 149
    .line 150
    .line 151
    const v16, -0x41947ae1    # -0.23f

    .line 152
    .line 153
    .line 154
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v0, 0x3fdae148    # 1.71f

    .line 158
    .line 159
    .line 160
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v17, 0x41913333    # 18.15f

    .line 164
    .line 165
    .line 166
    const v18, 0x3faccccd    # 1.35f

    .line 167
    .line 168
    .line 169
    const/high16 v13, 0x41980000    # 19.0f

    .line 170
    .line 171
    const v14, 0x3fa147ae    # 1.26f

    .line 172
    .line 173
    .line 174
    const v15, 0x4193ae14    # 18.46f

    .line 175
    .line 176
    .line 177
    const v16, 0x3f851eb8    # 1.04f

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v0, 0x41b3c28f    # 22.47f

    .line 187
    .line 188
    .line 189
    const v2, 0x40a66666    # 5.2f

    .line 190
    .line 191
    .line 192
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v17, 0x41a80000    # 21.0f

    .line 196
    .line 197
    const v18, 0x4092e148    # 4.59f

    .line 198
    .line 199
    .line 200
    const/high16 v13, 0x41b00000    # 22.0f

    .line 201
    .line 202
    const v14, 0x409eb852    # 4.96f

    .line 203
    .line 204
    .line 205
    const v15, 0x41ac147b    # 21.51f

    .line 206
    .line 207
    .line 208
    const v16, 0x409851ec    # 4.76f

    .line 209
    .line 210
    .line 211
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v0, 0x41407ae1    # 12.03f

    .line 215
    .line 216
    .line 217
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v17, 0x418c0000    # 17.5f

    .line 221
    .line 222
    const/high16 v18, 0x41800000    # 16.0f

    .line 223
    .line 224
    const v13, 0x419ee148    # 19.86f

    .line 225
    .line 226
    .line 227
    const v14, 0x4181ae14    # 16.21f

    .line 228
    .line 229
    .line 230
    const v15, 0x4195851f    # 18.69f

    .line 231
    .line 232
    .line 233
    const/high16 v16, 0x41800000    # 16.0f

    .line 234
    .line 235
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v17, -0x3f500000    # -5.5f

    .line 239
    .line 240
    const v18, 0x3fca3d71    # 1.58f

    .line 241
    .line 242
    .line 243
    const v13, -0x400ccccd    # -1.9f

    .line 244
    .line 245
    .line 246
    const/4 v14, 0x0

    .line 247
    const v15, -0x3f8e147b    # -3.78f

    .line 248
    .line 249
    .line 250
    const v16, 0x3f0a3d71    # 0.54f

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v0, 0x40af5c29    # 5.48f

    .line 257
    .line 258
    .line 259
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v17, 0x40d00000    # 6.5f

    .line 263
    .line 264
    const/high16 v18, 0x40800000    # 4.0f

    .line 265
    .line 266
    const v13, 0x4126147b    # 10.38f

    .line 267
    .line 268
    .line 269
    const v14, 0x4091999a    # 4.55f

    .line 270
    .line 271
    .line 272
    const v15, 0x410828f6    # 8.51f

    .line 273
    .line 274
    .line 275
    const/high16 v16, 0x40800000    # 4.0f

    .line 276
    .line 277
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v17, 0x3fc3d70a    # 1.53f

    .line 281
    .line 282
    .line 283
    const v18, 0x40a66666    # 5.2f

    .line 284
    .line 285
    .line 286
    const v13, 0x4096b852    # 4.71f

    .line 287
    .line 288
    .line 289
    const/high16 v14, 0x40800000    # 4.0f

    .line 290
    .line 291
    const v15, 0x404147ae    # 3.02f

    .line 292
    .line 293
    .line 294
    const v16, 0x408e147b    # 4.44f

    .line 295
    .line 296
    .line 297
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v17, 0x3f800000    # 1.0f

    .line 301
    .line 302
    const v18, 0x40c28f5c    # 6.08f

    .line 303
    .line 304
    .line 305
    const v13, 0x3f99999a    # 1.2f

    .line 306
    .line 307
    .line 308
    const v14, 0x40ab851f    # 5.36f

    .line 309
    .line 310
    .line 311
    const/high16 v15, 0x3f800000    # 1.0f

    .line 312
    .line 313
    const v16, 0x40b6b852    # 5.71f

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v0, 0x414147ae    # 12.08f

    .line 320
    .line 321
    .line 322
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const v17, 0x3fbd70a4    # 1.48f

    .line 326
    .line 327
    .line 328
    const v18, 0x3f5eb852    # 0.87f

    .line 329
    .line 330
    .line 331
    const/4 v13, 0x0

    .line 332
    const v14, 0x3f428f5c    # 0.76f

    .line 333
    .line 334
    .line 335
    const v15, 0x3f4f5c29    # 0.81f

    .line 336
    .line 337
    .line 338
    const v16, 0x3f9d70a4    # 1.23f

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/high16 v17, 0x40d00000    # 6.5f

    .line 345
    .line 346
    const/high16 v18, 0x41900000    # 18.0f

    .line 347
    .line 348
    const v13, 0x406c28f6    # 3.69f

    .line 349
    .line 350
    .line 351
    const v14, 0x41933333    # 18.4f

    .line 352
    .line 353
    .line 354
    const v15, 0x40a1999a    # 5.05f

    .line 355
    .line 356
    .line 357
    const/high16 v16, 0x41900000    # 18.0f

    .line 358
    .line 359
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v17, 0x40b00000    # 5.5f

    .line 363
    .line 364
    const/high16 v18, 0x40000000    # 2.0f

    .line 365
    .line 366
    const v13, 0x40047ae1    # 2.07f

    .line 367
    .line 368
    .line 369
    const/4 v14, 0x0

    .line 370
    const v15, 0x407eb852    # 3.98f

    .line 371
    .line 372
    .line 373
    const v16, 0x3f51eb85    # 0.82f

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const/high16 v18, -0x40000000    # -2.0f

    .line 380
    .line 381
    const v13, 0x3fc28f5c    # 1.52f

    .line 382
    .line 383
    .line 384
    const v14, -0x4068f5c3    # -1.18f

    .line 385
    .line 386
    .line 387
    const v15, 0x405b851f    # 3.43f

    .line 388
    .line 389
    .line 390
    const/high16 v16, -0x40000000    # -2.0f

    .line 391
    .line 392
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v17, 0x4080a3d7    # 4.02f

    .line 396
    .line 397
    .line 398
    const v18, 0x3f851eb8    # 1.04f

    .line 399
    .line 400
    .line 401
    const v13, 0x3fb9999a    # 1.45f

    .line 402
    .line 403
    .line 404
    const/4 v14, 0x0

    .line 405
    const v15, 0x4033d70a    # 2.81f

    .line 406
    .line 407
    .line 408
    const v16, 0x3ecccccd    # 0.4f

    .line 409
    .line 410
    .line 411
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/high16 v17, 0x41b80000    # 23.0f

    .line 415
    .line 416
    const v18, 0x41915c29    # 18.17f

    .line 417
    .line 418
    .line 419
    const v13, 0x41b1851f    # 22.19f

    .line 420
    .line 421
    .line 422
    const v14, 0x419b3333    # 19.4f

    .line 423
    .line 424
    .line 425
    const/high16 v15, 0x41b80000    # 23.0f

    .line 426
    .line 427
    const v16, 0x419770a4    # 18.93f

    .line 428
    .line 429
    .line 430
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v0, 0x40c28f5c    # 6.08f

    .line 434
    .line 435
    .line 436
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v17, 0x41b3c28f    # 22.47f

    .line 440
    .line 441
    .line 442
    const v18, 0x40a66666    # 5.2f

    .line 443
    .line 444
    .line 445
    const/high16 v13, 0x41b80000    # 23.0f

    .line 446
    .line 447
    const v14, 0x40b6b852    # 5.71f

    .line 448
    .line 449
    .line 450
    const v15, 0x41b66666    # 22.8f

    .line 451
    .line 452
    .line 453
    const v16, 0x40ab851f    # 5.36f

    .line 454
    .line 455
    .line 456
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 463
    .line 464
    .line 465
    move-result-object v2

    .line 466
    const/16 v16, 0x3800

    .line 467
    .line 468
    const/16 v17, 0x0

    .line 469
    .line 470
    const/high16 v6, 0x3f800000    # 1.0f

    .line 471
    .line 472
    const/high16 v8, 0x3f800000    # 1.0f

    .line 473
    .line 474
    const/4 v7, 0x0

    .line 475
    const/high16 v9, 0x3f800000    # 1.0f

    .line 476
    .line 477
    const/high16 v12, 0x3f800000    # 1.0f

    .line 478
    .line 479
    const/4 v13, 0x0

    .line 480
    const/4 v14, 0x0

    .line 481
    const/4 v15, 0x0

    .line 482
    const-string v4, ""

    .line 483
    .line 484
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    sput-object v0, Landroidx/compose/material/icons/rounded/AutoStoriesKt;->_autoStories:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 493
    .line 494
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 495
    .line 496
    .line 497
    return-object v0
.end method
