.class public final Landroidx/compose/material/icons/rounded/NotificationsActiveKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_notificationsActive",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "NotificationsActive",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getNotificationsActive",
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
        "SMAP\nNotificationsActive.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationsActive.kt\nandroidx/compose/material/icons/rounded/NotificationsActiveKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,73:1\n212#2,12:74\n233#2,18:87\n253#2:124\n174#3:86\n705#4,2:105\n717#4,2:107\n719#4,11:113\n72#5,4:109\n*S KotlinDebug\n*F\n+ 1 NotificationsActive.kt\nandroidx/compose/material/icons/rounded/NotificationsActiveKt\n*L\n29#1:74,12\n30#1:87,18\n30#1:124\n29#1:86\n30#1:105,2\n30#1:107,2\n30#1:113,11\n30#1:109,4\n*E\n"
    }
.end annotation


# static fields
.field private static _notificationsActive:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNotificationsActive(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/NotificationsActiveKt;->_notificationsActive:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.NotificationsActive"

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
    const/high16 v0, 0x41800000    # 16.0f

    .line 71
    .line 72
    const/high16 v2, 0x41900000    # 18.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, -0x3f600000    # -5.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, -0x3f700000    # -4.5f

    .line 83
    .line 84
    const v18, -0x3f35c28f    # -6.32f

    .line 85
    .line 86
    .line 87
    const/4 v13, 0x0

    .line 88
    const v14, -0x3fbb851f    # -3.07f

    .line 89
    .line 90
    .line 91
    const v15, -0x402e147b    # -1.64f

    .line 92
    .line 93
    .line 94
    const v16, -0x3f4b851f    # -5.64f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v0, 0x41580000    # 13.5f

    .line 101
    .line 102
    const/high16 v2, 0x40800000    # 4.0f

    .line 103
    .line 104
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const v17, -0x403eb852    # -1.51f

    .line 108
    .line 109
    .line 110
    const/high16 v18, -0x40400000    # -1.5f

    .line 111
    .line 112
    const v14, -0x40ab851f    # -0.83f

    .line 113
    .line 114
    .line 115
    const v15, -0x40d1eb85    # -0.68f

    .line 116
    .line 117
    .line 118
    const/high16 v16, -0x40400000    # -1.5f

    .line 119
    .line 120
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v0, 0x404ae148    # 3.17f

    .line 124
    .line 125
    .line 126
    const/high16 v2, 0x41280000    # 10.5f

    .line 127
    .line 128
    const/high16 v4, 0x40800000    # 4.0f

    .line 129
    .line 130
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v0, 0x3f2e147b    # 0.68f

    .line 134
    .line 135
    .line 136
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v17, 0x40c00000    # 6.0f

    .line 140
    .line 141
    const/high16 v18, 0x41300000    # 11.0f

    .line 142
    .line 143
    const v13, 0x40f428f6    # 7.63f

    .line 144
    .line 145
    .line 146
    const v14, 0x40ab851f    # 5.36f

    .line 147
    .line 148
    .line 149
    const/high16 v15, 0x40c00000    # 6.0f

    .line 150
    .line 151
    const v16, 0x40fd70a4    # 7.92f

    .line 152
    .line 153
    .line 154
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const/high16 v0, 0x40a00000    # 5.0f

    .line 158
    .line 159
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v0, -0x4059999a    # -1.3f

    .line 163
    .line 164
    .line 165
    const v2, 0x3fa51eb8    # 1.29f

    .line 166
    .line 167
    .line 168
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v17, 0x3f333333    # 0.7f

    .line 172
    .line 173
    .line 174
    const v18, 0x3fdae148    # 1.71f

    .line 175
    .line 176
    .line 177
    const v13, -0x40deb852    # -0.63f

    .line 178
    .line 179
    .line 180
    const v14, 0x3f2147ae    # 0.63f

    .line 181
    .line 182
    .line 183
    const v15, -0x41bd70a4    # -0.19f

    .line 184
    .line 185
    .line 186
    const v16, 0x3fdae148    # 1.71f

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v0, 0x4152b852    # 13.17f

    .line 193
    .line 194
    .line 195
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v17, 0x3f35c28f    # 0.71f

    .line 199
    .line 200
    .line 201
    const v18, -0x40251eb8    # -1.71f

    .line 202
    .line 203
    .line 204
    const v13, 0x3f63d70a    # 0.89f

    .line 205
    .line 206
    .line 207
    const/4 v14, 0x0

    .line 208
    const v15, 0x3fab851f    # 1.34f

    .line 209
    .line 210
    .line 211
    const v16, -0x4075c28f    # -1.08f

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v0, 0x41800000    # 16.0f

    .line 218
    .line 219
    const/high16 v2, 0x41900000    # 18.0f

    .line 220
    .line 221
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v0, 0x413fd70a    # 11.99f

    .line 228
    .line 229
    .line 230
    const/high16 v2, 0x41b00000    # 22.0f

    .line 231
    .line 232
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v17, 0x40000000    # 2.0f

    .line 236
    .line 237
    const/high16 v18, -0x40000000    # -2.0f

    .line 238
    .line 239
    const v13, 0x3f8ccccd    # 1.1f

    .line 240
    .line 241
    .line 242
    const/high16 v15, 0x40000000    # 2.0f

    .line 243
    .line 244
    const v16, -0x4099999a    # -0.9f

    .line 245
    .line 246
    .line 247
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v0, -0x3f800000    # -4.0f

    .line 251
    .line 252
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v18, 0x40000000    # 2.0f

    .line 256
    .line 257
    const/4 v13, 0x0

    .line 258
    const v14, 0x3f8ccccd    # 1.1f

    .line 259
    .line 260
    .line 261
    const v15, 0x3f63d70a    # 0.89f

    .line 262
    .line 263
    .line 264
    const/high16 v16, 0x40000000    # 2.0f

    .line 265
    .line 266
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v0, 0x40d8a3d7    # 6.77f

    .line 273
    .line 274
    .line 275
    const v2, 0x40975c29    # 4.73f

    .line 276
    .line 277
    .line 278
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v17, 0x3cf5c28f    # 0.03f

    .line 282
    .line 283
    .line 284
    const v18, -0x4048f5c3    # -1.43f

    .line 285
    .line 286
    .line 287
    const v13, 0x3ed70a3d    # 0.42f

    .line 288
    .line 289
    .line 290
    const v14, -0x413d70a4    # -0.38f

    .line 291
    .line 292
    .line 293
    const v15, 0x3edc28f6    # 0.43f

    .line 294
    .line 295
    .line 296
    const v16, -0x407c28f6    # -1.03f

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v17, -0x404e147b    # -1.39f

    .line 303
    .line 304
    .line 305
    const v18, -0x435c28f6    # -0.02f

    .line 306
    .line 307
    .line 308
    const v13, -0x413d70a4    # -0.38f

    .line 309
    .line 310
    .line 311
    const/high16 v15, -0x40800000    # -1.0f

    .line 312
    .line 313
    const v16, -0x413851ec    # -0.39f

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v17, 0x4008f5c3    # 2.14f

    .line 320
    .line 321
    .line 322
    const v18, 0x411570a4    # 9.34f

    .line 323
    .line 324
    .line 325
    const v13, 0x406ccccd    # 3.7f

    .line 326
    .line 327
    .line 328
    const v14, 0x409ae148    # 4.84f

    .line 329
    .line 330
    .line 331
    const v15, 0x402147ae    # 2.52f

    .line 332
    .line 333
    .line 334
    const v16, 0x40deb852    # 6.96f

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v17, 0x3f800000    # 1.0f

    .line 341
    .line 342
    const v18, 0x3f947ae1    # 1.16f

    .line 343
    .line 344
    .line 345
    const v13, -0x4247ae14    # -0.09f

    .line 346
    .line 347
    .line 348
    const v14, 0x3f1c28f6    # 0.61f

    .line 349
    .line 350
    .line 351
    const v15, 0x3ec28f5c    # 0.38f

    .line 352
    .line 353
    .line 354
    const v16, 0x3f947ae1    # 1.16f

    .line 355
    .line 356
    .line 357
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v17, 0x3f7ae148    # 0.98f

    .line 361
    .line 362
    .line 363
    const v18, -0x40ab851f    # -0.83f

    .line 364
    .line 365
    .line 366
    const v13, 0x3ef5c28f    # 0.48f

    .line 367
    .line 368
    .line 369
    const/4 v14, 0x0

    .line 370
    const v15, 0x3f666666    # 0.9f

    .line 371
    .line 372
    .line 373
    const v16, -0x414ccccd    # -0.35f

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v17, 0x4029999a    # 2.65f

    .line 380
    .line 381
    .line 382
    const v18, -0x3f61eb85    # -4.94f

    .line 383
    .line 384
    .line 385
    const v13, 0x3e99999a    # 0.3f

    .line 386
    .line 387
    .line 388
    const v14, -0x4007ae14    # -1.94f

    .line 389
    .line 390
    .line 391
    const v15, 0x3fa147ae    # 1.26f

    .line 392
    .line 393
    .line 394
    const v16, -0x3f951eb8    # -3.67f

    .line 395
    .line 396
    .line 397
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const v0, 0x4194cccd    # 18.6f

    .line 404
    .line 405
    .line 406
    const v2, 0x4051eb85    # 3.28f

    .line 407
    .line 408
    .line 409
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v17, -0x404ccccd    # -1.4f

    .line 413
    .line 414
    .line 415
    const v18, 0x3ca3d70a    # 0.02f

    .line 416
    .line 417
    .line 418
    const v13, -0x41333333    # -0.4f

    .line 419
    .line 420
    .line 421
    const v14, -0x41428f5c    # -0.37f

    .line 422
    .line 423
    .line 424
    const v15, -0x407d70a4    # -1.02f

    .line 425
    .line 426
    .line 427
    const v16, -0x4147ae14    # -0.36f

    .line 428
    .line 429
    .line 430
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v17, 0x3cf5c28f    # 0.03f

    .line 434
    .line 435
    .line 436
    const v18, 0x3fb5c28f    # 1.42f

    .line 437
    .line 438
    .line 439
    const v14, 0x3ecccccd    # 0.4f

    .line 440
    .line 441
    .line 442
    const v15, -0x413d70a4    # -0.38f

    .line 443
    .line 444
    .line 445
    const v16, 0x3f851eb8    # 1.04f

    .line 446
    .line 447
    .line 448
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v17, 0x4029999a    # 2.65f

    .line 452
    .line 453
    .line 454
    const v18, 0x409e147b    # 4.94f

    .line 455
    .line 456
    .line 457
    const v13, 0x3fb0a3d7    # 1.38f

    .line 458
    .line 459
    .line 460
    const v14, 0x3fa28f5c    # 1.27f

    .line 461
    .line 462
    .line 463
    const v15, 0x40166666    # 2.35f

    .line 464
    .line 465
    .line 466
    const/high16 v16, 0x40400000    # 3.0f

    .line 467
    .line 468
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v17, 0x3f7ae148    # 0.98f

    .line 472
    .line 473
    .line 474
    const v18, 0x3f547ae1    # 0.83f

    .line 475
    .line 476
    .line 477
    const v13, 0x3d8f5c29    # 0.07f

    .line 478
    .line 479
    .line 480
    const v14, 0x3ef5c28f    # 0.48f

    .line 481
    .line 482
    .line 483
    const v15, 0x3efae148    # 0.49f

    .line 484
    .line 485
    .line 486
    const v16, 0x3f547ae1    # 0.83f

    .line 487
    .line 488
    .line 489
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const v17, 0x3f7d70a4    # 0.99f

    .line 493
    .line 494
    .line 495
    const v18, -0x406b851f    # -1.16f

    .line 496
    .line 497
    .line 498
    const v13, 0x3f1c28f6    # 0.61f

    .line 499
    .line 500
    .line 501
    const/4 v14, 0x0

    .line 502
    const v15, 0x3f8b851f    # 1.09f

    .line 503
    .line 504
    .line 505
    const v16, -0x40f33333    # -0.55f

    .line 506
    .line 507
    .line 508
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const/high16 v17, -0x3fb00000    # -3.25f

    .line 512
    .line 513
    const v18, -0x3f3e6666    # -6.05f

    .line 514
    .line 515
    .line 516
    const v13, -0x413d70a4    # -0.38f

    .line 517
    .line 518
    .line 519
    const v14, -0x3fe851ec    # -2.37f

    .line 520
    .line 521
    .line 522
    const v15, -0x4039999a    # -1.55f

    .line 523
    .line 524
    .line 525
    const v16, -0x3f70a3d7    # -4.48f

    .line 526
    .line 527
    .line 528
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 535
    .line 536
    .line 537
    move-result-object v2

    .line 538
    const/16 v16, 0x3800

    .line 539
    .line 540
    const/16 v17, 0x0

    .line 541
    .line 542
    const/high16 v6, 0x3f800000    # 1.0f

    .line 543
    .line 544
    const/high16 v8, 0x3f800000    # 1.0f

    .line 545
    .line 546
    const/4 v7, 0x0

    .line 547
    const/high16 v9, 0x3f800000    # 1.0f

    .line 548
    .line 549
    const/high16 v12, 0x3f800000    # 1.0f

    .line 550
    .line 551
    const/4 v13, 0x0

    .line 552
    const/4 v14, 0x0

    .line 553
    const/4 v15, 0x0

    .line 554
    const-string v4, ""

    .line 555
    .line 556
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    sput-object v0, Landroidx/compose/material/icons/rounded/NotificationsActiveKt;->_notificationsActive:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 565
    .line 566
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 567
    .line 568
    .line 569
    return-object v0
.end method
