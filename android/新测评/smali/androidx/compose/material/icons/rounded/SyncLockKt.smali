.class public final Landroidx/compose/material/icons/rounded/SyncLockKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_syncLock",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SyncLock",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getSyncLock",
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
        "SMAP\nSyncLock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SyncLock.kt\nandroidx/compose/material/icons/rounded/SyncLockKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,92:1\n212#2,12:93\n233#2,18:106\n253#2:143\n174#3:105\n705#4,2:124\n717#4,2:126\n719#4,11:132\n72#5,4:128\n*S KotlinDebug\n*F\n+ 1 SyncLock.kt\nandroidx/compose/material/icons/rounded/SyncLockKt\n*L\n29#1:93,12\n30#1:106,18\n30#1:143\n29#1:105\n30#1:124,2\n30#1:126,2\n30#1:132,11\n30#1:128,4\n*E\n"
    }
.end annotation


# static fields
.field private static _syncLock:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSyncLock(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SyncLockKt;->_syncLock:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SyncLock"

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
    const/high16 v0, 0x41200000    # 10.0f

    .line 71
    .line 72
    const/high16 v2, 0x41980000    # 19.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x40800000    # -1.0f

    .line 78
    .line 79
    const/high16 v18, 0x3f800000    # 1.0f

    .line 80
    .line 81
    const/4 v13, 0x0

    .line 82
    const v14, 0x3f0ccccd    # 0.55f

    .line 83
    .line 84
    .line 85
    const v15, -0x4119999a    # -0.45f

    .line 86
    .line 87
    .line 88
    const/high16 v16, 0x3f800000    # 1.0f

    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v0, 0x40a00000    # 5.0f

    .line 94
    .line 95
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v18, -0x40800000    # -1.0f

    .line 99
    .line 100
    const v13, -0x40f33333    # -0.55f

    .line 101
    .line 102
    .line 103
    const/4 v14, 0x0

    .line 104
    const/high16 v15, -0x40800000    # -1.0f

    .line 105
    .line 106
    const v16, -0x4119999a    # -0.45f

    .line 107
    .line 108
    .line 109
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const/4 v0, 0x0

    .line 113
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v17, 0x3f800000    # 1.0f

    .line 117
    .line 118
    const/4 v13, 0x0

    .line 119
    const v14, -0x40f33333    # -0.55f

    .line 120
    .line 121
    .line 122
    const v15, 0x3ee66666    # 0.45f

    .line 123
    .line 124
    .line 125
    const/high16 v16, -0x40800000    # -1.0f

    .line 126
    .line 127
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v0, 0x3fdd70a4    # 1.73f

    .line 131
    .line 132
    .line 133
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v17, 0x40800000    # 4.0f

    .line 137
    .line 138
    const/high16 v18, 0x41400000    # 12.0f

    .line 139
    .line 140
    const v13, 0x40a1eb85    # 5.06f

    .line 141
    .line 142
    .line 143
    const v14, 0x418451ec    # 16.54f

    .line 144
    .line 145
    .line 146
    const/high16 v15, 0x40800000    # 4.0f

    .line 147
    .line 148
    const v16, 0x41666666    # 14.4f

    .line 149
    .line 150
    .line 151
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v17, 0x4091eb85    # 4.56f

    .line 155
    .line 156
    .line 157
    const v18, -0x3f18f5c3    # -7.22f

    .line 158
    .line 159
    .line 160
    const/4 v13, 0x0

    .line 161
    const v14, -0x3fb3d70a    # -3.19f

    .line 162
    .line 163
    .line 164
    const v15, 0x3fef5c29    # 1.87f

    .line 165
    .line 166
    .line 167
    const v16, -0x3f423d71    # -5.93f

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v17, 0x41200000    # 10.0f

    .line 174
    .line 175
    const v18, 0x40b66666    # 5.7f

    .line 176
    .line 177
    .line 178
    const v13, 0x4113ae14    # 9.23f

    .line 179
    .line 180
    .line 181
    const v14, 0x408f0a3d    # 4.47f

    .line 182
    .line 183
    .line 184
    const/high16 v15, 0x41200000    # 10.0f

    .line 185
    .line 186
    const v16, 0x409eb852    # 4.96f

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v17, -0x40ee147b    # -0.57f

    .line 193
    .line 194
    .line 195
    const v18, 0x3f6147ae    # 0.88f

    .line 196
    .line 197
    .line 198
    const/4 v13, 0x0

    .line 199
    const v14, 0x3ec28f5c    # 0.38f

    .line 200
    .line 201
    .line 202
    const v15, -0x419eb852    # -0.22f

    .line 203
    .line 204
    .line 205
    const v16, 0x3f3851ec    # 0.72f

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v17, 0x40c00000    # 6.0f

    .line 212
    .line 213
    const/high16 v18, 0x41400000    # 12.0f

    .line 214
    .line 215
    const v13, 0x40ed1eb8    # 7.41f

    .line 216
    .line 217
    .line 218
    const v14, 0x40f1999a    # 7.55f

    .line 219
    .line 220
    .line 221
    const/high16 v15, 0x40c00000    # 6.0f

    .line 222
    .line 223
    const v16, 0x4119c28f    # 9.61f

    .line 224
    .line 225
    .line 226
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v17, 0x40000000    # 2.0f

    .line 230
    .line 231
    const v18, 0x408e147b    # 4.44f

    .line 232
    .line 233
    .line 234
    const/4 v13, 0x0

    .line 235
    const v14, 0x3fe28f5c    # 1.77f

    .line 236
    .line 237
    .line 238
    const v15, 0x3f47ae14    # 0.78f

    .line 239
    .line 240
    .line 241
    const v16, 0x4055c28f    # 3.34f

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v0, 0x41700000    # 15.0f

    .line 248
    .line 249
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v17, 0x3f800000    # 1.0f

    .line 253
    .line 254
    const/high16 v18, -0x40800000    # -1.0f

    .line 255
    .line 256
    const v14, -0x40f33333    # -0.55f

    .line 257
    .line 258
    .line 259
    const v15, 0x3ee66666    # 0.45f

    .line 260
    .line 261
    .line 262
    const/high16 v16, -0x40800000    # -1.0f

    .line 263
    .line 264
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/4 v0, 0x0

    .line 268
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v18, 0x3f800000    # 1.0f

    .line 272
    .line 273
    const v13, 0x3f0ccccd    # 0.55f

    .line 274
    .line 275
    .line 276
    const/4 v14, 0x0

    .line 277
    const/high16 v15, 0x3f800000    # 1.0f

    .line 278
    .line 279
    const v16, 0x3ee66666    # 0.45f

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v0, 0x41980000    # 19.0f

    .line 286
    .line 287
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v0, 0x40800000    # 4.0f

    .line 294
    .line 295
    const/high16 v2, 0x41700000    # 15.0f

    .line 296
    .line 297
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v17, -0x40800000    # -1.0f

    .line 301
    .line 302
    const v13, -0x40f33333    # -0.55f

    .line 303
    .line 304
    .line 305
    const/high16 v15, -0x40800000    # -1.0f

    .line 306
    .line 307
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v17, 0x3f800000    # 1.0f

    .line 314
    .line 315
    const/4 v13, 0x0

    .line 316
    const v14, 0x3f0ccccd    # 0.55f

    .line 317
    .line 318
    .line 319
    const v15, 0x3ee66666    # 0.45f

    .line 320
    .line 321
    .line 322
    const/high16 v16, 0x3f800000    # 1.0f

    .line 323
    .line 324
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/4 v0, 0x0

    .line 328
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v18, -0x40800000    # -1.0f

    .line 332
    .line 333
    const v13, 0x3f0ccccd    # 0.55f

    .line 334
    .line 335
    .line 336
    const/4 v14, 0x0

    .line 337
    const/high16 v15, 0x3f800000    # 1.0f

    .line 338
    .line 339
    const v16, -0x4119999a    # -0.45f

    .line 340
    .line 341
    .line 342
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v0, 0x40f1eb85    # 7.56f

    .line 346
    .line 347
    .line 348
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const/high16 v17, 0x40000000    # 2.0f

    .line 352
    .line 353
    const v18, 0x408e147b    # 4.44f

    .line 354
    .line 355
    .line 356
    const v13, 0x3f9c28f6    # 1.22f

    .line 357
    .line 358
    .line 359
    const v14, 0x3f8ccccd    # 1.1f

    .line 360
    .line 361
    .line 362
    const/high16 v15, 0x40000000    # 2.0f

    .line 363
    .line 364
    const v16, 0x402ae148    # 2.67f

    .line 365
    .line 366
    .line 367
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v0, 0x40000000    # 2.0f

    .line 371
    .line 372
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v17, -0x3fd147ae    # -2.73f

    .line 376
    .line 377
    .line 378
    const/high16 v18, -0x3f400000    # -6.0f

    .line 379
    .line 380
    const/4 v13, 0x0

    .line 381
    const v14, -0x3fe66666    # -2.4f

    .line 382
    .line 383
    .line 384
    const v15, -0x407851ec    # -1.06f

    .line 385
    .line 386
    .line 387
    const v16, -0x3f6eb852    # -4.54f

    .line 388
    .line 389
    .line 390
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const/high16 v0, 0x41980000    # 19.0f

    .line 394
    .line 395
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const/high16 v17, 0x3f800000    # 1.0f

    .line 399
    .line 400
    const/high16 v18, -0x40800000    # -1.0f

    .line 401
    .line 402
    const v13, 0x3f0ccccd    # 0.55f

    .line 403
    .line 404
    .line 405
    const/4 v14, 0x0

    .line 406
    const/high16 v15, 0x3f800000    # 1.0f

    .line 407
    .line 408
    const v16, -0x4119999a    # -0.45f

    .line 409
    .line 410
    .line 411
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/4 v0, 0x0

    .line 415
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const/high16 v17, -0x40800000    # -1.0f

    .line 419
    .line 420
    const/4 v13, 0x0

    .line 421
    const v14, -0x40f33333    # -0.55f

    .line 422
    .line 423
    .line 424
    const v15, -0x4119999a    # -0.45f

    .line 425
    .line 426
    .line 427
    const/high16 v16, -0x40800000    # -1.0f

    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v0, 0x41700000    # 15.0f

    .line 433
    .line 434
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const/high16 v0, 0x41a00000    # 20.0f

    .line 441
    .line 442
    const/high16 v2, 0x41880000    # 17.0f

    .line 443
    .line 444
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const/high16 v0, -0x40800000    # -1.0f

    .line 448
    .line 449
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v17, -0x40000000    # -2.0f

    .line 453
    .line 454
    const/high16 v18, -0x40000000    # -2.0f

    .line 455
    .line 456
    const v14, -0x40733333    # -1.1f

    .line 457
    .line 458
    .line 459
    const v15, -0x4099999a    # -0.9f

    .line 460
    .line 461
    .line 462
    const/high16 v16, -0x40000000    # -2.0f

    .line 463
    .line 464
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const v0, 0x3f666666    # 0.9f

    .line 468
    .line 469
    .line 470
    const/high16 v2, 0x40000000    # 2.0f

    .line 471
    .line 472
    const/high16 v4, -0x40000000    # -2.0f

    .line 473
    .line 474
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const/high16 v0, 0x3f800000    # 1.0f

    .line 478
    .line 479
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const/high16 v17, -0x40800000    # -1.0f

    .line 483
    .line 484
    const/high16 v18, 0x3f800000    # 1.0f

    .line 485
    .line 486
    const v13, -0x40f33333    # -0.55f

    .line 487
    .line 488
    .line 489
    const/4 v14, 0x0

    .line 490
    const/high16 v15, -0x40800000    # -1.0f

    .line 491
    .line 492
    const v16, 0x3ee66666    # 0.45f

    .line 493
    .line 494
    .line 495
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const/high16 v0, 0x40400000    # 3.0f

    .line 499
    .line 500
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const/high16 v17, 0x3f800000    # 1.0f

    .line 504
    .line 505
    const/4 v13, 0x0

    .line 506
    const v14, 0x3f0ccccd    # 0.55f

    .line 507
    .line 508
    .line 509
    const v15, 0x3ee66666    # 0.45f

    .line 510
    .line 511
    .line 512
    const/high16 v16, 0x3f800000    # 1.0f

    .line 513
    .line 514
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const/high16 v0, 0x40800000    # 4.0f

    .line 518
    .line 519
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const/high16 v18, -0x40800000    # -1.0f

    .line 523
    .line 524
    const v13, 0x3f0ccccd    # 0.55f

    .line 525
    .line 526
    .line 527
    const/4 v14, 0x0

    .line 528
    const/high16 v15, 0x3f800000    # 1.0f

    .line 529
    .line 530
    const v16, -0x4119999a    # -0.45f

    .line 531
    .line 532
    .line 533
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 537
    .line 538
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const/high16 v17, 0x41a00000    # 20.0f

    .line 542
    .line 543
    const/high16 v18, 0x41880000    # 17.0f

    .line 544
    .line 545
    const/high16 v13, 0x41a80000    # 21.0f

    .line 546
    .line 547
    const v14, 0x418b999a    # 17.45f

    .line 548
    .line 549
    .line 550
    const v15, 0x41a46666    # 20.55f

    .line 551
    .line 552
    .line 553
    const/high16 v16, 0x41880000    # 17.0f

    .line 554
    .line 555
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const/high16 v0, 0x41880000    # 17.0f

    .line 562
    .line 563
    const/high16 v2, 0x41980000    # 19.0f

    .line 564
    .line 565
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const/high16 v0, -0x40000000    # -2.0f

    .line 569
    .line 570
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const/high16 v0, -0x40800000    # -1.0f

    .line 574
    .line 575
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const/high16 v17, 0x3f800000    # 1.0f

    .line 579
    .line 580
    const/high16 v18, -0x40800000    # -1.0f

    .line 581
    .line 582
    const/4 v13, 0x0

    .line 583
    const v14, -0x40f33333    # -0.55f

    .line 584
    .line 585
    .line 586
    const v15, 0x3ee66666    # 0.45f

    .line 587
    .line 588
    .line 589
    const/high16 v16, -0x40800000    # -1.0f

    .line 590
    .line 591
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const v0, 0x3ee66666    # 0.45f

    .line 595
    .line 596
    .line 597
    const/high16 v2, 0x3f800000    # 1.0f

    .line 598
    .line 599
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const/high16 v0, 0x41880000    # 17.0f

    .line 603
    .line 604
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 611
    .line 612
    .line 613
    move-result-object v2

    .line 614
    const/16 v16, 0x3800

    .line 615
    .line 616
    const/16 v17, 0x0

    .line 617
    .line 618
    const/high16 v6, 0x3f800000    # 1.0f

    .line 619
    .line 620
    const/high16 v8, 0x3f800000    # 1.0f

    .line 621
    .line 622
    const/4 v7, 0x0

    .line 623
    const/high16 v9, 0x3f800000    # 1.0f

    .line 624
    .line 625
    const/high16 v12, 0x3f800000    # 1.0f

    .line 626
    .line 627
    const/4 v14, 0x0

    .line 628
    const/4 v15, 0x0

    .line 629
    const-string v4, ""

    .line 630
    .line 631
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 632
    .line 633
    .line 634
    move-result-object v0

    .line 635
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 636
    .line 637
    .line 638
    move-result-object v0

    .line 639
    sput-object v0, Landroidx/compose/material/icons/rounded/SyncLockKt;->_syncLock:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 640
    .line 641
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 642
    .line 643
    .line 644
    return-object v0
.end method
