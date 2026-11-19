.class public final Landroidx/compose/material/icons/filled/CloudSyncKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_cloudSync",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "CloudSync",
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getCloudSync",
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
        "SMAP\nCloudSync.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloudSync.kt\nandroidx/compose/material/icons/filled/CloudSyncKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,71:1\n212#2,12:72\n233#2,18:85\n253#2:122\n174#3:84\n705#4,2:103\n717#4,2:105\n719#4,11:111\n72#5,4:107\n*S KotlinDebug\n*F\n+ 1 CloudSync.kt\nandroidx/compose/material/icons/filled/CloudSyncKt\n*L\n29#1:72,12\n30#1:85,18\n30#1:122\n29#1:84\n30#1:103,2\n30#1:105,2\n30#1:111,11\n30#1:107,4\n*E\n"
    }
.end annotation


# static fields
.field private static _cloudSync:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCloudSync(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/CloudSyncKt;->_cloudSync:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.CloudSync"

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
    const/high16 v0, 0x41ac0000    # 21.5f

    .line 71
    .line 72
    const v2, 0x416fae14    # 14.98f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v17, -0x42b33333    # -0.05f

    .line 79
    .line 80
    .line 81
    const v18, 0x3c23d70a    # 0.01f

    .line 82
    .line 83
    .line 84
    const v13, -0x435c28f6    # -0.02f

    .line 85
    .line 86
    .line 87
    const/4 v14, 0x0

    .line 88
    const v15, -0x430a3d71    # -0.03f

    .line 89
    .line 90
    .line 91
    const/16 v16, 0x0

    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v17, 0x41900000    # 18.0f

    .line 97
    .line 98
    const/high16 v18, 0x41400000    # 12.0f

    .line 99
    .line 100
    const v13, 0x41a9999a    # 21.2f

    .line 101
    .line 102
    .line 103
    const v14, 0x4154cccd    # 13.3f

    .line 104
    .line 105
    .line 106
    const v15, 0x419e147b    # 19.76f

    .line 107
    .line 108
    .line 109
    const/high16 v16, 0x41400000    # 12.0f

    .line 110
    .line 111
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v17, -0x3fb5c28f    # -3.16f

    .line 115
    .line 116
    .line 117
    const v18, 0x400147ae    # 2.02f

    .line 118
    .line 119
    .line 120
    const v13, -0x404ccccd    # -1.4f

    .line 121
    .line 122
    .line 123
    const/4 v14, 0x0

    .line 124
    const v15, -0x3fd9999a    # -2.6f

    .line 125
    .line 126
    .line 127
    const v16, 0x3f547ae1    # 0.83f

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v17, 0x41400000    # 12.0f

    .line 134
    .line 135
    const/high16 v18, 0x41880000    # 17.0f

    .line 136
    .line 137
    const v13, 0x415428f6    # 13.26f

    .line 138
    .line 139
    .line 140
    const v14, 0x4161999a    # 14.1f

    .line 141
    .line 142
    .line 143
    const/high16 v15, 0x41400000    # 12.0f

    .line 144
    .line 145
    const v16, 0x41766666    # 15.4f

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v17, 0x40400000    # 3.0f

    .line 152
    .line 153
    const/high16 v18, 0x40400000    # 3.0f

    .line 154
    .line 155
    const/4 v13, 0x0

    .line 156
    const v14, 0x3fd47ae1    # 1.66f

    .line 157
    .line 158
    .line 159
    const v15, 0x3fab851f    # 1.34f

    .line 160
    .line 161
    .line 162
    const/high16 v16, 0x40400000    # 3.0f

    .line 163
    .line 164
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v0, 0x40d00000    # 6.5f

    .line 168
    .line 169
    const v2, -0x435c28f6    # -0.02f

    .line 170
    .line 171
    .line 172
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const/high16 v17, 0x40200000    # 2.5f

    .line 176
    .line 177
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 178
    .line 179
    const v13, 0x3fb0a3d7    # 1.38f

    .line 180
    .line 181
    .line 182
    const/4 v14, 0x0

    .line 183
    const/high16 v15, 0x40200000    # 2.5f

    .line 184
    .line 185
    const v16, -0x4070a3d7    # -1.12f

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v0, 0x41b70a3d    # 22.88f

    .line 192
    .line 193
    .line 194
    const/high16 v2, 0x41ac0000    # 21.5f

    .line 195
    .line 196
    const v4, 0x416fae14    # 14.98f

    .line 197
    .line 198
    .line 199
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v0, 0x408851ec    # 4.26f

    .line 206
    .line 207
    .line 208
    const/high16 v2, 0x41200000    # 10.0f

    .line 209
    .line 210
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v0, 0x4005c28f    # 2.09f

    .line 214
    .line 215
    .line 216
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const/high16 v17, 0x40c00000    # 6.0f

    .line 220
    .line 221
    const/high16 v18, 0x41400000    # 12.0f

    .line 222
    .line 223
    const v13, 0x40f570a4    # 7.67f

    .line 224
    .line 225
    .line 226
    const v14, 0x40e5c28f    # 7.18f

    .line 227
    .line 228
    .line 229
    const/high16 v15, 0x40c00000    # 6.0f

    .line 230
    .line 231
    const v16, 0x41163d71    # 9.39f

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/high16 v17, 0x40000000    # 2.0f

    .line 238
    .line 239
    const v18, 0x408e147b    # 4.44f

    .line 240
    .line 241
    .line 242
    const/4 v13, 0x0

    .line 243
    const v14, 0x3fe28f5c    # 1.77f

    .line 244
    .line 245
    .line 246
    const v15, 0x3f47ae14    # 0.78f

    .line 247
    .line 248
    .line 249
    const v16, 0x4055c28f    # 3.34f

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v0, 0x41600000    # 14.0f

    .line 256
    .line 257
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v0, 0x40000000    # 2.0f

    .line 261
    .line 262
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v0, 0x40c00000    # 6.0f

    .line 266
    .line 267
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v0, 0x40800000    # 4.0f

    .line 271
    .line 272
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v0, -0x40000000    # -2.0f

    .line 276
    .line 277
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v0, 0x402eb852    # 2.73f

    .line 281
    .line 282
    .line 283
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const/high16 v17, 0x40800000    # 4.0f

    .line 287
    .line 288
    const/high16 v18, 0x41400000    # 12.0f

    .line 289
    .line 290
    const v13, 0x40a1eb85    # 5.06f

    .line 291
    .line 292
    .line 293
    const v14, 0x418451ec    # 16.54f

    .line 294
    .line 295
    .line 296
    const/high16 v15, 0x40800000    # 4.0f

    .line 297
    .line 298
    const v16, 0x41666666    # 14.4f

    .line 299
    .line 300
    .line 301
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/high16 v17, 0x41200000    # 10.0f

    .line 305
    .line 306
    const v18, 0x408851ec    # 4.26f

    .line 307
    .line 308
    .line 309
    const/high16 v13, 0x40800000    # 4.0f

    .line 310
    .line 311
    const v14, 0x410451ec    # 8.27f

    .line 312
    .line 313
    .line 314
    const v15, 0x40d1999a    # 6.55f

    .line 315
    .line 316
    .line 317
    const v16, 0x40a4cccd    # 5.15f

    .line 318
    .line 319
    .line 320
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v0, 0x41a00000    # 20.0f

    .line 327
    .line 328
    const/high16 v2, 0x40c00000    # 6.0f

    .line 329
    .line 330
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v0, -0x3fd147ae    # -2.73f

    .line 334
    .line 335
    .line 336
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v17, 0x402a3d71    # 2.66f

    .line 340
    .line 341
    .line 342
    const/high16 v18, 0x40a00000    # 5.0f

    .line 343
    .line 344
    const v13, 0x3fb70a3d    # 1.43f

    .line 345
    .line 346
    .line 347
    const v14, 0x3fa147ae    # 1.26f

    .line 348
    .line 349
    .line 350
    const v15, 0x401a3d71    # 2.41f

    .line 351
    .line 352
    .line 353
    const v16, 0x4040a3d7    # 3.01f

    .line 354
    .line 355
    .line 356
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v0, -0x3ffeb852    # -2.02f

    .line 360
    .line 361
    .line 362
    const/4 v2, 0x0

    .line 363
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const/high16 v17, 0x41800000    # 16.0f

    .line 367
    .line 368
    const v18, 0x40f1eb85    # 7.56f

    .line 369
    .line 370
    .line 371
    const v13, 0x418d70a4    # 17.68f

    .line 372
    .line 373
    .line 374
    const v14, 0x411a3d71    # 9.64f

    .line 375
    .line 376
    .line 377
    const v15, 0x4187d70a    # 16.98f

    .line 378
    .line 379
    .line 380
    const v16, 0x41073333    # 8.45f

    .line 381
    .line 382
    .line 383
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v0, 0x41200000    # 10.0f

    .line 387
    .line 388
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v0, -0x40000000    # -2.0f

    .line 392
    .line 393
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v0, 0x40800000    # 4.0f

    .line 397
    .line 398
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/high16 v0, 0x40c00000    # 6.0f

    .line 402
    .line 403
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 413
    .line 414
    .line 415
    move-result-object v2

    .line 416
    const/16 v16, 0x3800

    .line 417
    .line 418
    const/16 v17, 0x0

    .line 419
    .line 420
    const/high16 v6, 0x3f800000    # 1.0f

    .line 421
    .line 422
    const/high16 v8, 0x3f800000    # 1.0f

    .line 423
    .line 424
    const/4 v7, 0x0

    .line 425
    const/high16 v9, 0x3f800000    # 1.0f

    .line 426
    .line 427
    const/high16 v12, 0x3f800000    # 1.0f

    .line 428
    .line 429
    const/4 v13, 0x0

    .line 430
    const/4 v14, 0x0

    .line 431
    const/4 v15, 0x0

    .line 432
    const-string v4, ""

    .line 433
    .line 434
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    sput-object v0, Landroidx/compose/material/icons/filled/CloudSyncKt;->_cloudSync:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 443
    .line 444
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 445
    .line 446
    .line 447
    return-object v0
.end method
