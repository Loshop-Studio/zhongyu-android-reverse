.class public final Landroidx/compose/material/icons/rounded/UpdateKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_update",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Update",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getUpdate",
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
        "SMAP\nUpdate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Update.kt\nandroidx/compose/material/icons/rounded/UpdateKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,67:1\n212#2,12:68\n233#2,18:81\n253#2:118\n174#3:80\n705#4,2:99\n717#4,2:101\n719#4,11:107\n72#5,4:103\n*S KotlinDebug\n*F\n+ 1 Update.kt\nandroidx/compose/material/icons/rounded/UpdateKt\n*L\n29#1:68,12\n30#1:81,18\n30#1:118\n29#1:80\n30#1:99,2\n30#1:101,2\n30#1:107,11\n30#1:103,4\n*E\n"
    }
.end annotation


# static fields
.field private static _update:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getUpdate(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/UpdateKt;->_update:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Update"

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
    const/high16 v0, 0x410c0000    # 8.75f

    .line 71
    .line 72
    const/high16 v2, 0x41300000    # 11.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v0, 0x406b851f    # 3.68f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v17, 0x3efae148    # 0.49f

    .line 84
    .line 85
    .line 86
    const v18, 0x3f5c28f6    # 0.86f

    .line 87
    .line 88
    .line 89
    const/4 v13, 0x0

    .line 90
    const v14, 0x3eb33333    # 0.35f

    .line 91
    .line 92
    .line 93
    const v15, 0x3e428f5c    # 0.19f

    .line 94
    .line 95
    .line 96
    const v16, 0x3f2e147b    # 0.68f

    .line 97
    .line 98
    .line 99
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v0, 0x4047ae14    # 3.12f

    .line 103
    .line 104
    .line 105
    const v2, 0x3feccccd    # 1.85f

    .line 106
    .line 107
    .line 108
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v17, 0x3f83d70a    # 1.03f

    .line 112
    .line 113
    .line 114
    const v18, -0x417ae148    # -0.26f

    .line 115
    .line 116
    .line 117
    const v13, 0x3eb851ec    # 0.36f

    .line 118
    .line 119
    .line 120
    const v14, 0x3e570a3d    # 0.21f

    .line 121
    .line 122
    .line 123
    const v15, 0x3f51eb85    # 0.82f

    .line 124
    .line 125
    .line 126
    const v16, 0x3db851ec    # 0.09f

    .line 127
    .line 128
    .line 129
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v17, -0x417ae148    # -0.26f

    .line 133
    .line 134
    .line 135
    const v18, -0x407c28f6    # -1.03f

    .line 136
    .line 137
    .line 138
    const v13, 0x3e570a3d    # 0.21f

    .line 139
    .line 140
    .line 141
    const v14, -0x4147ae14    # -0.36f

    .line 142
    .line 143
    .line 144
    const v15, 0x3dcccccd    # 0.1f

    .line 145
    .line 146
    .line 147
    const v16, -0x40ae147b    # -0.82f

    .line 148
    .line 149
    .line 150
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v0, -0x3fc851ec    # -2.87f

    .line 154
    .line 155
    .line 156
    const v2, -0x40251eb8    # -1.71f

    .line 157
    .line 158
    .line 159
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v0, -0x3fa66666    # -3.4f

    .line 163
    .line 164
    .line 165
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v17, 0x413c0000    # 11.75f

    .line 169
    .line 170
    const/high16 v18, 0x41000000    # 8.0f

    .line 171
    .line 172
    const/high16 v13, 0x41480000    # 12.5f

    .line 173
    .line 174
    const v14, 0x410570a4    # 8.34f

    .line 175
    .line 176
    .line 177
    const v15, 0x41428f5c    # 12.16f

    .line 178
    .line 179
    .line 180
    const/high16 v16, 0x41000000    # 8.0f

    .line 181
    .line 182
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const v0, 0x410570a4    # 8.34f

    .line 186
    .line 187
    .line 188
    const/high16 v2, 0x410c0000    # 8.75f

    .line 189
    .line 190
    const/high16 v4, 0x41300000    # 11.0f

    .line 191
    .line 192
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v0, 0x41a80000    # 21.0f

    .line 199
    .line 200
    const/high16 v2, 0x41180000    # 9.5f

    .line 201
    .line 202
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v0, 0x4086b852    # 4.21f

    .line 206
    .line 207
    .line 208
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v17, -0x40a66666    # -0.85f

    .line 212
    .line 213
    .line 214
    const v18, -0x414ccccd    # -0.35f

    .line 215
    .line 216
    .line 217
    const/4 v13, 0x0

    .line 218
    const v14, -0x4119999a    # -0.45f

    .line 219
    .line 220
    .line 221
    const v15, -0x40f5c28f    # -0.54f

    .line 222
    .line 223
    .line 224
    const v16, -0x40d47ae1    # -0.67f

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v0, -0x401c28f6    # -1.78f

    .line 231
    .line 232
    .line 233
    const v2, 0x3fe3d70a    # 1.78f

    .line 234
    .line 235
    .line 236
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v17, -0x3f1947ae    # -7.21f

    .line 240
    .line 241
    .line 242
    const v18, -0x3fd9999a    # -2.6f

    .line 243
    .line 244
    .line 245
    const v13, -0x401851ec    # -1.81f

    .line 246
    .line 247
    .line 248
    const v14, -0x401851ec    # -1.81f

    .line 249
    .line 250
    .line 251
    const v15, -0x3f73851f    # -4.39f

    .line 252
    .line 253
    .line 254
    const v16, -0x3fc9999a    # -2.85f

    .line 255
    .line 256
    .line 257
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v17, -0x3efe6666    # -8.1f

    .line 261
    .line 262
    .line 263
    const v18, 0x40fe147b    # 7.94f

    .line 264
    .line 265
    .line 266
    const v13, -0x3f79eb85    # -4.19f

    .line 267
    .line 268
    .line 269
    const v14, 0x3ec28f5c    # 0.38f

    .line 270
    .line 271
    .line 272
    const v15, -0x3f0b851f    # -7.64f

    .line 273
    .line 274
    .line 275
    const/high16 v16, 0x40700000    # 3.75f

    .line 276
    .line 277
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v17, 0x41400000    # 12.0f

    .line 281
    .line 282
    const/high16 v18, 0x41a80000    # 21.0f

    .line 283
    .line 284
    const v13, 0x401d70a4    # 2.46f

    .line 285
    .line 286
    .line 287
    const v14, 0x41833333    # 16.4f

    .line 288
    .line 289
    .line 290
    const v15, 0x40d6147b    # 6.69f

    .line 291
    .line 292
    .line 293
    const/high16 v16, 0x41a80000    # 21.0f

    .line 294
    .line 295
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v17, 0x410ee148    # 8.93f

    .line 299
    .line 300
    .line 301
    const v18, -0x3f03d70a    # -7.88f

    .line 302
    .line 303
    .line 304
    const v13, 0x4092e148    # 4.59f

    .line 305
    .line 306
    .line 307
    const/4 v14, 0x0

    .line 308
    const v15, 0x4106147b    # 8.38f

    .line 309
    .line 310
    .line 311
    const v16, -0x3fa3d70a    # -3.44f

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const/high16 v17, -0x40800000    # -1.0f

    .line 318
    .line 319
    const v18, -0x4070a3d7    # -1.12f

    .line 320
    .line 321
    .line 322
    const v13, 0x3d8f5c29    # 0.07f

    .line 323
    .line 324
    .line 325
    const v14, -0x40e66666    # -0.6f

    .line 326
    .line 327
    .line 328
    const v15, -0x41333333    # -0.4f

    .line 329
    .line 330
    .line 331
    const v16, -0x4070a3d7    # -1.12f

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v17, -0x40851eb8    # -0.98f

    .line 338
    .line 339
    .line 340
    const v18, 0x3f5c28f6    # 0.86f

    .line 341
    .line 342
    .line 343
    const/high16 v13, -0x41000000    # -0.5f

    .line 344
    .line 345
    const/4 v14, 0x0

    .line 346
    const v15, -0x40947ae1    # -0.92f

    .line 347
    .line 348
    .line 349
    const v16, 0x3ebd70a4    # 0.37f

    .line 350
    .line 351
    .line 352
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v17, -0x3f1e6666    # -7.05f

    .line 356
    .line 357
    .line 358
    const v18, 0x40c47ae1    # 6.14f

    .line 359
    .line 360
    .line 361
    const v13, -0x4123d70a    # -0.43f

    .line 362
    .line 363
    .line 364
    const v14, 0x405f5c29    # 3.49f

    .line 365
    .line 366
    .line 367
    const v15, -0x3fa3d70a    # -3.44f

    .line 368
    .line 369
    .line 370
    const v16, 0x40c6147b    # 6.19f

    .line 371
    .line 372
    .line 373
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const v17, -0x3f233333    # -6.9f

    .line 377
    .line 378
    .line 379
    const v18, -0x3f233333    # -6.9f

    .line 380
    .line 381
    .line 382
    const v13, -0x3f928f5c    # -3.71f

    .line 383
    .line 384
    .line 385
    const v14, -0x42b33333    # -0.05f

    .line 386
    .line 387
    .line 388
    const v15, -0x3f251eb8    # -6.84f

    .line 389
    .line 390
    .line 391
    const v16, -0x3fb47ae1    # -3.18f

    .line 392
    .line 393
    .line 394
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const/high16 v17, 0x41400000    # 12.0f

    .line 398
    .line 399
    const/high16 v18, 0x40a00000    # 5.0f

    .line 400
    .line 401
    const v13, 0x409e147b    # 4.94f

    .line 402
    .line 403
    .line 404
    const v14, 0x41033333    # 8.2f

    .line 405
    .line 406
    .line 407
    const v15, 0x4101c28f    # 8.11f

    .line 408
    .line 409
    .line 410
    const/high16 v16, 0x40a00000    # 5.0f

    .line 411
    .line 412
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v17, 0x409e6666    # 4.95f

    .line 416
    .line 417
    .line 418
    const v18, 0x40033333    # 2.05f

    .line 419
    .line 420
    .line 421
    const v13, 0x3ff70a3d    # 1.93f

    .line 422
    .line 423
    .line 424
    const/4 v14, 0x0

    .line 425
    const v15, 0x406b851f    # 3.68f

    .line 426
    .line 427
    .line 428
    const v16, 0x3f4a3d71    # 0.79f

    .line 429
    .line 430
    .line 431
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const v0, -0x3ffa3d71    # -2.09f

    .line 435
    .line 436
    .line 437
    const v2, 0x4005c28f    # 2.09f

    .line 438
    .line 439
    .line 440
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v17, 0x41735c29    # 15.21f

    .line 444
    .line 445
    .line 446
    const/high16 v18, 0x41200000    # 10.0f

    .line 447
    .line 448
    const v13, 0x4168a3d7    # 14.54f

    .line 449
    .line 450
    .line 451
    const v14, 0x41175c29    # 9.46f

    .line 452
    .line 453
    .line 454
    const v15, 0x416c28f6    # 14.76f

    .line 455
    .line 456
    .line 457
    const/high16 v16, 0x41200000    # 10.0f

    .line 458
    .line 459
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const v0, 0x40a947ae    # 5.29f

    .line 463
    .line 464
    .line 465
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const/high16 v17, 0x41a80000    # 21.0f

    .line 469
    .line 470
    const/high16 v18, 0x41180000    # 9.5f

    .line 471
    .line 472
    const v13, 0x41a63d71    # 20.78f

    .line 473
    .line 474
    .line 475
    const/high16 v14, 0x41200000    # 10.0f

    .line 476
    .line 477
    const/high16 v15, 0x41a80000    # 21.0f

    .line 478
    .line 479
    const v16, 0x411c7ae1    # 9.78f

    .line 480
    .line 481
    .line 482
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 489
    .line 490
    .line 491
    move-result-object v2

    .line 492
    const/16 v16, 0x3800

    .line 493
    .line 494
    const/16 v17, 0x0

    .line 495
    .line 496
    const/high16 v6, 0x3f800000    # 1.0f

    .line 497
    .line 498
    const/high16 v8, 0x3f800000    # 1.0f

    .line 499
    .line 500
    const/4 v7, 0x0

    .line 501
    const/high16 v9, 0x3f800000    # 1.0f

    .line 502
    .line 503
    const/high16 v12, 0x3f800000    # 1.0f

    .line 504
    .line 505
    const/4 v13, 0x0

    .line 506
    const/4 v14, 0x0

    .line 507
    const/4 v15, 0x0

    .line 508
    const-string v4, ""

    .line 509
    .line 510
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 511
    .line 512
    .line 513
    move-result-object v0

    .line 514
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    sput-object v0, Landroidx/compose/material/icons/rounded/UpdateKt;->_update:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 519
    .line 520
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 521
    .line 522
    .line 523
    return-object v0
.end method
